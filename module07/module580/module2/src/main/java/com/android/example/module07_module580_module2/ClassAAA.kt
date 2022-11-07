package com.android.example.module07_module580_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module580_module3.ClassAAI = com.android.example.module07_module580_module3.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module07_module194_module1.ClassAAAJava = com.android.example.module07_module194_module1.ClassAAAJava()
	private 	val instance_var_1_2: com.android.example.module07_module580_module3.ClassAAA = com.android.example.module07_module580_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module580_module3.ClassAAB,
		param1: com.android.example.module07_module580_module3.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(-2506706461494824219)

	}

	fun method1(
		param0: com.android.example.module07_module580_module3.ClassAAA,
		param1: com.android.example.module07_module580_module3.ClassAAA
	) {
		for (iAb in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		}
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module194_module1.ClassAAD,
		param1: com.android.example.module07_module580_module3.ClassAAF
	) {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method3(
		param0: com.android.example.module07_module580_module3.ClassAAE,
		param1: com.android.example.module07_module194_module1.ClassAAF,
		param2: com.android.example.module07_module580_module3.ClassAAE,
		param3: com.android.example.module07_module580_module3.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}
}
