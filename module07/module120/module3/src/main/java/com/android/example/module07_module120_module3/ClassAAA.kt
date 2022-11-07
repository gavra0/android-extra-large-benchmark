package com.android.example.module07_module120_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAABJava = com.android.example.module07_module194_module1.ClassAABJava()
	private 	val instance_var_1_1: com.android.example.module07_module120_module5.ClassAAA = com.android.example.module07_module120_module5.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module120_module5.ClassAAAJava = com.android.example.module07_module120_module5.ClassAAAJava()

	fun method0(
		param0: com.android.example.module07_module120_module5.ClassAAAJava,
		param1: com.android.example.module07_module120_module5.ClassAAAJava
	) {
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.assertNotSubscribed()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		} else {
			param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

	}

	fun method1(
		param0: com.android.example.module07_module120_module5.ClassAAA,
		param1: com.android.example.module07_module194_module1.ClassAAE
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module120_module5.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(-3792905476614883216)

	}

	fun method3(
		param0: com.android.example.module07_module194_module1.ClassAAC,
		param1: com.android.example.module07_module194_module1.ClassAAF
	) {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method4(
		param0: com.android.example.module07_module194_module1.ClassAABJava
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

	}
}
