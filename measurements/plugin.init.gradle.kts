import com.sun.management.HotSpotDiagnosticMXBean
import org.gradle.BuildAdapter
import org.gradle.api.Plugin
import org.gradle.api.invocation.Gradle
import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters
import org.gradle.build.event.BuildEventsListenerRegistry
import org.gradle.tooling.events.FinishEvent
import org.gradle.tooling.events.OperationCompletionListener
import java.io.Closeable
import java.io.File
import java.lang.management.ManagementFactory
import java.time.Instant
import javax.inject.Inject
import javax.management.MBeanServer
import javax.management.ObjectName

enum class CaptureType {
    HEAP_HISTOGRAM,
    HEAP_DUMP,
    TIMESTAMP
}

enum class MeasurementCheckpoint {
    INIT,
    CONFIGURATION_FINISHED,
    SYNC_FINISHED
}

// Functions and variables can't be top level and has to be static to keep Gradle happy.
object MeasurementPluginConfig {
    var outputPath: String = ""
    var captureTypes: Set<CaptureType> = emptySet()
}

class MeasurementPlugin @Inject constructor(private val registry: BuildEventsListenerRegistry): Plugin<Gradle>, BuildAdapter() {
    override fun apply(gradle: Gradle) {
        gradle.addBuildListener(this)
        registry.onTaskCompletion(gradle.sharedServices.registerIfAbsent("measurement-service", MeasurementService::class.java) {})
    }

    override fun beforeSettings(settings: Settings) {
        EventRecorder.recordEvent(MeasurementCheckpoint.INIT)
    }

    override fun projectsEvaluated(gradle: Gradle) {
        EventRecorder.recordEvent(MeasurementCheckpoint.CONFIGURATION_FINISHED)
    }
}

open class MeasurementServiceParams : BuildServiceParameters
abstract class MeasurementService : OperationCompletionListener, Closeable, BuildService<MeasurementServiceParams> {
    // Ignored event, we only care about the one right before closing
    override fun onFinish(event: FinishEvent?) {}


    override fun close() {
        EventRecorder.recordEvent(MeasurementCheckpoint.SYNC_FINISHED)
    }
}

// Functions can't be top level and has to be static to keep Gradle happy.
object EventRecorder {
    @JvmStatic
    fun recordEvent(checkpoint: MeasurementCheckpoint) {
        println("Recording event ${checkpoint.name}")
        if (CaptureType.HEAP_HISTOGRAM in MeasurementPluginConfig.captureTypes) {
            captureHeapHistogramOfCurrentProcess(checkpoint)
        }
        if (CaptureType.HEAP_DUMP in MeasurementPluginConfig.captureTypes) {
            captureHeapOfCurrentProcess(checkpoint)
        }
        if (CaptureType.TIMESTAMP in MeasurementPluginConfig.captureTypes){
            captureEventTimestamp(checkpoint)
        }
    }

    @JvmStatic
    private fun captureEventTimestamp(checkpoint: MeasurementCheckpoint) {
        val name = checkpoint.name
        val now = Instant.now()
        val fileHistogram = File(MeasurementPluginConfig.outputPath).resolve("${now.toEpochMilli()}_$name.timestamp")
        fileHistogram.writeText(now.toString())
    }

    @JvmStatic
    private fun captureHeapHistogramOfCurrentProcess(checkpoint: MeasurementCheckpoint) {
        val name = checkpoint.name
        val server = ManagementFactory.getPlatformMBeanServer()
        val histogram = server.execute("gcClassHistogram")
        val fileHistogram = File(MeasurementPluginConfig.outputPath).resolve("${Instant.now().toEpochMilli()}_${name}.hist")
        fileHistogram.writeText(histogram)
    }

    @JvmStatic
    private fun captureHeapOfCurrentProcess(checkpoint: MeasurementCheckpoint) {
        val name = checkpoint.name
        val server: MBeanServer = ManagementFactory.getPlatformMBeanServer()
        val mxBean: HotSpotDiagnosticMXBean =
            ManagementFactory.newPlatformMXBeanProxy(
                server,
                "com.sun.management:type=HotSpotDiagnostic",
                HotSpotDiagnosticMXBean::class.java
            )
        mxBean.dumpHeap(File(MeasurementPluginConfig.outputPath).resolve("${Instant.now().toEpochMilli()}_${name}.hprof").path, true)
    }

    @JvmStatic
    private fun MBeanServer.execute(name: String) = invoke(
        ObjectName("com.sun.management:type=DiagnosticCommand"),
        name,
        arrayOf(null),
        arrayOf(Array<String>::class.java.name)
    ).toString()
}

MeasurementPluginConfig.outputPath = "measurements"
// Set the types you'd like to capture here
// Note that heap captures can significantly impact timestamp captures
MeasurementPluginConfig.captureTypes = setOf(CaptureType.HEAP_DUMP, CaptureType.HEAP_HISTOGRAM, CaptureType.TIMESTAMP)
apply<MeasurementPlugin>()