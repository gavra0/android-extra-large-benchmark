package com.android.example.module05_module32_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAAA = com.android.example.module07_module194_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module05_module32_module3.ClassAAB = com.android.example.module05_module32_module3.ClassAAB()

	fun method0(
		param0: com.android.example.module05_module32_module6.ClassAAE,
		param1: com.android.example.module05_module32_module6.ClassAAI
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..0) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.dispose()

				}
			}
		} else {
			param0.method2(io.reactivex.subscribers.TestSubscriber())

		}
		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_2.isDisposed()

	}

	fun method1(
		param0: com.android.example.module05_module32_module6.ClassAAJ,
		param1: com.android.example.module05_module32_module6.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

	}

	fun method2(
		param0: com.android.example.module07_module194_module1.ClassAAB,
		param1: com.android.example.module05_module32_module3.ClassAAE,
		param2: com.android.example.module05_module32_module3.ClassAAD
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

	}

	fun method3(
		param0: com.android.example.module07_module194_module1.ClassAAB,
		param1: com.android.example.module05_module32_module6.ClassAACJava
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

	}

	fun method4(
		param0: com.android.example.module07_module194_module1.ClassAABJava,
		param1: com.android.example.module07_module194_module1.ClassAAE
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}
}
