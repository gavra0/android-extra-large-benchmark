package com.android.example.module07_module323_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAAB = com.android.example.module07_module194_module1.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module07_module166_module8.ClassAAF = com.android.example.module07_module166_module8.ClassAAF()

	fun method0(
		param0: com.android.example.module07_module323_module2.ClassAAD,
		param1: com.android.example.module07_module323_module2.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		param0.method2(com.squareup.workflow1.WorkflowOutput(kotlin.Any()), com.squareup.workflow1.WorkflowOutput(kotlin.Any()), com.squareup.workflow1.WorkflowOutput(kotlin.Any()), com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAC,
		param1: com.android.example.module07_module194_module1.ClassAAF
	) {
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.onComplete()

		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: okio.Pipe = okio.Pipe(5229275660410361672)
		local_var_2_3.cancel()

		val local_var_2_4: com.squareup.workflow1.WorkflowOutput<kotlin.Any> = com.squareup.workflow1.WorkflowOutput(kotlin.Any())
		local_var_2_4.equals(kotlin.Any())

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

	}

	fun method2(
		param0: com.android.example.module07_module166_module8.ClassAAF
	) {
		val local_var_2_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_1.approveCall("SomeString", 1)

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

		val local_var_2_3: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_3.createWorker()

	}
}
