package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.requestMore(-748760640505452875)

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..5) {
			for (iAc in 0..5) {
				val local_var_4_0: com.android.example.module07_module249_module6.ClassAAAJava = com.android.example.module07_module249_module6.ClassAAAJava()
				local_var_4_0.method0(dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber())

				val local_var_4_1: com.android.example.module07_module032_module2.ClassAAB = com.android.example.module07_module032_module2.ClassAAB()
				local_var_4_1.method0(com.android.example.module07_module194_module1.ClassAABJava())

			}
			param0.dispose()

			param0.assertSubscribed()

			param0.onNext(kotlin.Any())

		}
	}
}
