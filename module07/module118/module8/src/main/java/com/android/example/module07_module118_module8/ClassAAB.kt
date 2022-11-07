package com.android.example.module07_module118_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.squareup.workflow1.WorkflowOutput<kotlin.Any> = com.squareup.workflow1.WorkflowOutput(kotlin.Any())
	private 	val instance_var_1_1: com.squareup.workflow1.WorkflowOutput<kotlin.Any> = com.squareup.workflow1.WorkflowOutput(kotlin.Any())

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.clearDeadline()

		param0.isDisposed()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_0.enter()

			val local_var_3_1: okio.AsyncTimeout = okio.AsyncTimeout()
			local_var_3_1.exit()

		}
		val local_var_2_2: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_2.throwIfReached()

		val local_var_2_3: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_3.enter()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

		param0.cancel()

		param0.requestMore(-1727559926038452078)

		val local_var_2_3: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_3.throwIfReached()

	}

	fun method2(
		param0: com.squareup.workflow1.WorkflowOutput<kotlin.Any>,
		param1: com.squareup.workflow1.WorkflowOutput<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.toString()

		val local_var_2_3: okio.Pipe = okio.Pipe(7385757901298379831)
		local_var_2_3.cancel()

		val local_var_2_4: okio.Pipe = okio.Pipe(1911955707530438724)
		local_var_2_4.cancel()

	}
}
