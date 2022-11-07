package com.android.example.module20_module3_module14_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module582_module3.ClassAAA = com.android.example.module07_module582_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module608_module2_module1.ClassAAB = com.android.example.module07_module608_module2_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module07_module608_module2_module1.ClassAAC = com.android.example.module07_module608_module2_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module07_module582_module3.ClassAAA,
		param1: com.android.example.module07_module608_module2_module1.ClassAAA,
		param2: com.android.example.module07_module608_module2_module1.ClassAAA
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.Pipe = okio.Pipe(7851072391379544902)
			local_var_3_0.cancel()

			for (iAb in 0..4) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertSubscribed()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.hasSubscription()

				val local_var_4_2: papa.DelayedInteractionStore = papa.DelayedInteractionStore(77)
				local_var_4_2.get<papa.Interaction>()

			}
		}
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.isDisposed()

		val local_var_2_4: okio.Pipe = okio.Pipe(-8973181095102144534)
		local_var_2_4.cancel()

	}

	fun method1(
		param0: com.android.example.module07_module608_module2_module1.ClassAAC,
		param1: com.android.example.module07_module608_module2_module1.ClassAAA,
		param2: com.android.example.module07_module608_module1_module1.ClassAAN
	) {
		val local_var_2_3: papa.DelayedInteractionStore = papa.DelayedInteractionStore(46)
		local_var_2_3.get<papa.Interaction>()

		val local_var_2_4: papa.DelayedInteractionStore = papa.DelayedInteractionStore(94)
		local_var_2_4.get<papa.Interaction>()

	}

	fun method2(
		param0: com.android.example.module07_module582_module3.ClassAAA,
		param1: com.android.example.module07_module608_module2_module1.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

		val local_var_2_5: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_5.clearTimeout()

	}
}
