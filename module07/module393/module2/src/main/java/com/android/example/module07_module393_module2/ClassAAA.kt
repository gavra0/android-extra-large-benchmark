package com.android.example.module07_module393_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module393_module4.ClassAAA = com.android.example.module07_module393_module4.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module194_module1.ClassAAB = com.android.example.module07_module194_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module07_module393_module4.ClassAAB = com.android.example.module07_module393_module4.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module07_module393_module4.ClassAAB = com.android.example.module07_module393_module4.ClassAAB()
	private 	val instance_var_1_4: com.android.example.module07_module393_module4.ClassAAA = com.android.example.module07_module393_module4.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module393_module4.ClassAAB,
		param1: com.android.example.module07_module393_module4.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

		for (iAb in 0..0) {
			for (iAc in 0..6) {
				val local_var_4_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
				local_var_4_0.createWorker()

				local_var_4_0.start()

				local_var_4_0.start()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.isCancelled()

			}
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(7043509993275995137)

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onComplete()

		param0.method4(io.reactivex.internal.schedulers.SingleScheduler())

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAG,
		param1: com.android.example.module07_module393_module4.ClassAAB,
		param2: com.android.example.module07_module393_module4.ClassAAB,
		param3: com.android.example.module07_module393_module4.ClassAAB
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.hasSubscription()

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.isCancelled()

		param0.method0("SomeString", "SomeString", "SomeString")

	}
}
