package com.android.example.module07_module250_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAAF = com.android.example.module07_module194_module1.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module194_module1.ClassAAC = com.android.example.module07_module194_module1.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module07_module194_module1.ClassAAG = com.android.example.module07_module194_module1.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module07_module250_module2.ClassAAA = com.android.example.module07_module250_module2.ClassAAA()
	private 	val instance_var_1_4: com.android.example.module07_module250_module2.ClassAAA = com.android.example.module07_module250_module2.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module250_module2.ClassAAA,
		param1: com.android.example.module07_module250_module2.ClassAAA
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				for (iAb in 0..5) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.dispose()

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.onNext(kotlin.Any())

					local_var_5_0.onComplete()

				}
			}
		} else {
			param0.method2("SomeString")

		}
		param0.method2("SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAA,
		param1: com.android.example.module07_module250_module2.ClassAAA,
		param2: com.android.example.module07_module194_module1.ClassAAF
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

	}

	fun method2(
		param0: com.android.example.module07_module250_module2.ClassAAA,
		param1: com.android.example.module07_module250_module2.ClassAAA,
		param2: com.android.example.module07_module250_module2.ClassAAA
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.dispose()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.onComplete()

		param0.method3("SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module07_module194_module1.ClassAAAJava,
		param1: com.android.example.module07_module194_module1.ClassAAG,
		param2: com.android.example.module07_module194_module1.ClassAAF
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}

	fun method4(
		param0: com.android.example.module07_module250_module2.ClassAAA
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

	}
}
