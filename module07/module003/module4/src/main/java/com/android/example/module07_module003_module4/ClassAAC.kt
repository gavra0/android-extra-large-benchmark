package com.android.example.module07_module003_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module16_module033_module1.ClassAALJava = com.android.example.module16_module033_module1.ClassAALJava()
	private 	val instance_var_1_1: com.android.example.module07_module608_module2_module1.ClassAAA = com.android.example.module07_module608_module2_module1.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module608_module2_module1.ClassAAC = com.android.example.module07_module608_module2_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module16_module033_module1.ClassAAKJava,
		param1: com.android.example.module16_module033_module1.ClassAADJava
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

		param0.method2("SomeString", "SomeString", "SomeString")

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module07_module608_module2_module1.ClassAAA,
		param1: com.android.example.module16_module033_module1.ClassAAIJava,
		param2: com.android.example.module07_module608_module2_module1.ClassAAA,
		param3: com.android.example.module07_module608_module2_module1.ClassAAC
	) {
		val local_var_2_4: okio.Pipe = okio.Pipe(4100991816975662213)
		local_var_2_4.cancel()

		param0.method3(com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

		val local_var_2_5: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_5.approveCall("SomeString", 18)

		param0.method2(com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

		val local_var_2_6: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_6.writeFixed32(35)

	}

	fun method2(
		param0: com.android.example.module16_module033_module1.ClassAAMJava,
		param1: com.android.example.module07_module608_module1_module1.ClassAAJ,
		param2: com.android.example.module07_module608_module1_module1.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		param0.method3("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 84)

	}

	fun method3(
		param0: com.android.example.module07_module608_module2_module1.ClassAAC,
		param1: com.android.example.module07_module608_module1_module1.ClassAADJava,
		param2: com.android.example.module16_module033_module1.ClassAAXJava,
		param3: com.android.example.module07_module608_module1_module1.ClassAAE
	) {
		param0.method1(com.squareup.workflow1.WorkflowOutput(kotlin.Any()), com.squareup.workflow1.WorkflowOutput(kotlin.Any()), com.squareup.workflow1.WorkflowOutput(kotlin.Any()), com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

		param0.method0(com.squareup.workflow1.WorkflowOutput(kotlin.Any()), com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

	}
}
