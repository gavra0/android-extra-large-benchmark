package com.android.example.module07_module402_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module07_module580_module3.ClassAAC = com.android.example.module07_module580_module3.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module07_module580_module3.ClassAAI = com.android.example.module07_module580_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module07_module580_module3.ClassAAE
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		for (iAb in 0..0) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

			}
		}
	}

	fun method1(
		param0: com.android.example.module07_module580_module3.ClassAAH,
		param1: com.android.example.module07_module580_module3.ClassAAA,
		param2: com.android.example.module07_module580_module3.ClassAAC,
		param3: com.android.example.module07_module580_module3.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

		param0.method3(io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isDisposed()

	}

	fun method2(
		param0: com.android.example.module07_module580_module3.ClassAAI,
		param1: com.android.example.module07_module580_module3.ClassAAI,
		param2: com.android.example.module07_module580_module3.ClassAAH
	) {
		val local_var_2_3: io.reactivex.internal.queue.SpscLinkedArrayQueue<kotlin.Any> = io.reactivex.internal.queue.SpscLinkedArrayQueue(17)
		local_var_2_3.offer(kotlin.Any(), kotlin.Any())

	}

	fun method3(
		param0: com.android.example.module07_module580_module3.ClassAAI
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		param0.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

	}
}
