# android-extra-large-benchmark
A very large Android benchmark project, used for profiling build and sync performance. The project is intentially very large in order
to make detecting performance issues easier. The project has been generated using [project-replicator](https://github.com/android/project-replicator),
with a real-world project blueprint file.

# Using the benchmark
Please clone a version-specific branch of the project. E.g. `git clone --branch 2022.9 https://github.com/gavra0/android-extra-large-benchmark.git`. More versions of the project will be added in the future,
and each will follow the same versioning patter `YEAR.MONTH`. To see all available versions run `git branch -r`

# Adding a new version of the benchmark
Use the [project-replicator](https://github.com/android/project-replicator) to generate a new copy of the project.
Follow the steps below:
```
git checkout -b <YEAR.MONTH> && git reset --hard origin/main
# generate the project using project-replicator
git add * # add all our your changes
git commit -m "New version of the project"
git push origin HEAD
```

# Running tasks
The main application is `:module03:module09:module1`, and in order to benchmark it please run
```
./gradlew :module03:module09:module1:assembleDebug
```

You can also execute `./gradlew assembleDebug` that will assemble all projects, but please keep in mind this will take a
while to run.

# Working with smaller subsets
The top level directory contains multiple settings.gradle files which allow
working with smaller subsets of the project for different scenarios. You can set up the project to be a subset with the 
following command:

```
./apply_diff.sh 1000 
```

This will replace the `settings.gradle` file and also set an appropriate max heap for the subset according the map
inside the script.

You can also manually do this by specifying the `-c` or `--settings-file` 
options when invoking gradle. However, this will not include things like setting the max memory for the subset. Example:

```
./gradlew -c settings-200.gradle build
```

# Getting memory measurements with native agent
> **Note:**  This only works from Android Studio Giraffe onwards and the latest gradle-profiler version (0.19.0) doesn't support Giraffe yet. You will have to use at least [v0.20.0-alpha01](https://github.com/gradle/gradle-profiler/releases/tag/v0.20.0-alpha01) and there are no binaries available for it yet.

Android Studio has a mode where it can measure the memory usage of the Gradle daemon by running a native agent which
traverses the heap real-time and reports back the size of strongly reachable objects from GC roots. This traversal is
done right after the Android models are returned.

There is a gradle-profiler scenario where you can run that mode, it can be invoked via running the following commands:
(be sure to replace <desired_size> and <studio_dir>)
```
# Set up the targeted project subset, and the native agent
./apply_diff.sh <desired_size> --enable-agent
# Run the profiler scenario with the right studio flags
gradle-profiler --scenario-file profiler-scenarios/sync.scenario androidStudioSyncWithMeasurement --benchmark --studio-install-dir=<studio_dir>
```
This will create a file in the `measurements` folder one with the total size of strongly reachable objects from GC 
roots. The measurement and the path of this file will be logged by the Gradle daemon.

Agent can be disabled by running the `apply_diff.sh` command without the `--enable-agent` flag.

Please note that this is an initial version of the benchmark scenario, this can be further embedded into gradle-profiler
to make it easier to use/set up.

### Manual agent setup
To do set up the agent manually (on Linux), the following needs to be done:
* Adding `-agentpath:<project_dir>/native/linux/liblightweight_heap_traverse.so` to `org.gradle.jvmargs` in `gradle.properties`
* Set following on studio JVM args:
```
  -Dgradle.ide.gradle.heap.analysis.output.directory=<directory>
  -Dgradle.ide.gradle.heap.analysis.lightweight.mode=true
```