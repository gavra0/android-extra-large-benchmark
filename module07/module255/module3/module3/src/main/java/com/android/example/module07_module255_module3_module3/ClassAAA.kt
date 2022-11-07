package com.android.example.module07_module255_module3_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAAG = com.android.example.module07_module194_module1.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module07_module255_module3_module5.ClassAAA = com.android.example.module07_module255_module3_module5.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module194_module1.ClassAAE = com.android.example.module07_module194_module1.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module07_module194_module1.ClassAAD = com.android.example.module07_module194_module1.ClassAAD()

	fun method0(
		param0: com.android.example.module07_module255_module3_module5.ClassAAA
	) {
		for (iAb in 0..2) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.dispose()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

		}
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAAJava
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module07_module255_module3_module5.ClassAAC,
		param1: com.android.example.module07_module194_module1.ClassAAAJava,
		param2: com.android.example.module07_module194_module1.ClassAAAJava
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		param0.method2(io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module07_module255_module3_module5.ClassAAA,
		param1: com.android.example.module07_module194_module1.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		val local_var_2_4: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(89)
		local_var_2_4.head()

	}
}
