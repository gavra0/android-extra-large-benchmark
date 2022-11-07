package com.android.example.module05_module26_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module05_module26_module5.ClassAAB = com.android.example.module05_module26_module5.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module05_module26_module5.ClassAAB = com.android.example.module05_module26_module5.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module07_module194_module1.ClassAAG = com.android.example.module07_module194_module1.ClassAAG()

	fun method0(
		param0: com.android.example.module07_module194_module1.ClassAAG,
		param1: com.android.example.module07_module194_module1.ClassAAB
	) {
		for (iAb in 0..3) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onError(kotlin.Throwable())

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.dispose()

			}
		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(-5253962330157999471)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(9077293870279900657)

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(8487910804831966733)

		param0.method2("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module05_module26_module5.ClassAAA,
		param1: com.android.example.module05_module26_module5.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(6197802250648396452)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isCancelled()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.hasSubscription()

	}

	fun method2(
		param0: com.android.example.module07_module194_module1.ClassAAE,
		param1: com.android.example.module07_module194_module1.ClassAAF,
		param2: com.android.example.module07_module194_module1.ClassAAF,
		param3: com.android.example.module05_module26_module5.ClassAAB
	) {
		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.triggerActions()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.requestMore(7595283602921825824)

		val local_var_2_6: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_6.clear()

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.requestMore(6949868100354936206)

		val local_var_2_8: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_8.request(-8383464200985162982)

	}

	fun method3(
		param0: com.android.example.module07_module194_module1.ClassAAB
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}

	fun method4(
		param0: com.android.example.module07_module194_module1.ClassAAAJava,
		param1: com.android.example.module05_module26_module5.ClassAAB
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-5204586678158596799)

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
