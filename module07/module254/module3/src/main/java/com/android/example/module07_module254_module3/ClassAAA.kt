package com.android.example.module07_module254_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAAC = com.android.example.module07_module194_module1.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module07_module254_module4.ClassAAA = com.android.example.module07_module254_module4.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module254_module4.ClassAAA = com.android.example.module07_module254_module4.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module254_module4.ClassAAA,
		param1: com.android.example.module07_module194_module1.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(1751125856480955443)

		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver(), io.reactivex.schedulers.TestScheduler())

		for (iAb in 0..0) {
			val local_var_3_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
			local_var_3_0.hasSubscription()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.assertSubscribed()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.assertSubscribed()

			val local_var_3_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_3.clear()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAE,
		param1: com.android.example.module07_module254_module4.ClassAAA,
		param2: com.android.example.module07_module194_module1.ClassAAE
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(2389875512056493388)

	}

	fun method2(
		param0: com.android.example.module07_module194_module1.ClassAAA,
		param1: com.android.example.module07_module194_module1.ClassAAB,
		param2: com.android.example.module07_module194_module1.ClassAACJava,
		param3: com.android.example.module07_module194_module1.ClassAAF
	) {
		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

	}

	fun method3(
		param0: com.android.example.module07_module194_module1.ClassAABJava,
		param1: com.android.example.module07_module194_module1.ClassAAAJava
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		param0.method0("SomeString")

		param0.method3("SomeString", "SomeString")

		val local_var_2_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}
}
