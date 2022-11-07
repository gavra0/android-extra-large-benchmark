package com.android.example.module05_module36_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module05_module36_module7.ClassAAE = com.android.example.module05_module36_module7.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module05_module36_module7.ClassAAB = com.android.example.module05_module36_module7.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module05_module36_module7.ClassAAB = com.android.example.module05_module36_module7.ClassAAB()

	fun method0(
		param0: com.android.example.module07_module194_module1.ClassAABJava,
		param1: com.android.example.module07_module194_module1.ClassAAG,
		param2: com.android.example.module07_module194_module1.ClassAAD
	) {
		for (iAb in 0..4) {
			if (kotlin.Any().equals(kotlin.Any())) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.assertSubscribed()

				} else {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.dispose()

				}
			}
			param0.method3("SomeString", "SomeString")

			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(-6232227595996610437)

			local_var_3_0.isDisposed()

		}
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAB
	) {
		param0.method0("SomeString")

		param0.method3("SomeString", "SomeString")

		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

	}

	fun method2(
		param0: com.android.example.module07_module194_module1.ClassAAD,
		param1: com.android.example.module05_module36_module7.ClassAAB,
		param2: com.android.example.module07_module194_module1.ClassAAAJava,
		param3: com.android.example.module07_module194_module1.ClassAAC
	) {
		param0.method3("SomeString", "SomeString")

		param0.method4("SomeString", "SomeString")

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_5.triggerActions()

	}

	fun method3(
		param0: com.android.example.module05_module36_module7.ClassAAD,
		param1: com.android.example.module07_module194_module1.ClassAAA
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.triggerActions()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: com.android.example.module07_module194_module1.ClassAAD
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onNext(kotlin.Any())

	}
}
