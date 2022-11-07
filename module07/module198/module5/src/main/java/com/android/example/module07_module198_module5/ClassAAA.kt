package com.android.example.module07_module198_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String
	) {
		for (iAb in 0..1) {
		}
		val local_var_2_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_1.isCanceled()

	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_1.cancel()

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 5)

		local_var_2_4.approveCall("SomeString", 88)

		val local_var_2_5: com.squareup.workflow1.WorkflowOutput<kotlin.Any> = com.squareup.workflow1.WorkflowOutput(kotlin.Any())
		local_var_2_5.toString()

	}
}
