package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.schedulers.TestScheduler
	) {
		val local_var_2_4: com.android.example.module16_module059_module1.ClassAABJava = com.android.example.module16_module059_module1.ClassAABJava()
		local_var_2_4.method1(com.android.example.module16_module033_module1.ClassAAA())

		val local_var_2_5: com.android.example.module16_module033_module1.ClassAAEJava = com.android.example.module16_module033_module1.ClassAAEJava()
		local_var_2_5.method1("SomeString", "SomeString")

		for (iAb in 0..1) {
			val local_var_3_0: com.android.example.module07_module194_module1.ClassAABJava = com.android.example.module07_module194_module1.ClassAABJava()
			local_var_3_0.method3("SomeString", "SomeString")

			val local_var_3_1: com.android.example.module07_module194_module1.ClassAAE = com.android.example.module07_module194_module1.ClassAAE()
			local_var_3_1.method4("SomeString")

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.isCancelled()

		param0.onNext(kotlin.Any())

		param0.onError(kotlin.Throwable())

		val local_var_2_2: com.android.example.module07_module594_module3.ClassAAKJava = com.android.example.module07_module594_module3.ClassAAKJava()
		local_var_2_2.method1("SomeString", "SomeString")

	}
}
