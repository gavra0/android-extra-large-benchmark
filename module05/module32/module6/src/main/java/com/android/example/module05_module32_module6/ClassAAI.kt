package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onComplete()

		val local_var_2_4: com.android.example.module07_module168_module2.ClassAAB = com.android.example.module07_module168_module2.ClassAAB()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.assertSubscribed()

		val local_var_2_5: com.android.example.module07_module031_module6.ClassAAEJava = com.android.example.module07_module031_module6.ClassAAEJava()
		local_var_2_5.method2(com.android.example.module16_module059_module1.ClassAABJava(), com.android.example.module07_module032_module2.ClassAAA(), com.android.example.module16_module058_module1.ClassAALJava())

		param0.assertSubscribed()

	}

	fun method1(
		param0: io.reactivex.internal.schedulers.ComputationScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.util.LinkedArrayList
	) {
		val local_var_2_4: com.android.example.module07_module194_module1.ClassAABJava = com.android.example.module07_module194_module1.ClassAABJava()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module16_module058_module1.ClassAABJava = com.android.example.module16_module058_module1.ClassAABJava()
		local_var_2_5.method0(com.android.example.module16_module059_module1.ClassAAAJava(), com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module059_module1.ClassAAAJava(), com.android.example.module16_module033_module1.ClassAAWJava())

		val local_var_2_6: com.android.example.module07_module592_module3.ClassAAG = com.android.example.module07_module592_module3.ClassAAG()
		local_var_2_6.method3("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onComplete()

		val local_var_2_3: com.android.example.module05_module01_module3.ClassAAG = com.android.example.module05_module01_module3.ClassAAG()
		local_var_2_3.method2("SomeString")

		val local_var_2_4: com.android.example.module07_module136_module5.ClassAAC = com.android.example.module07_module136_module5.ClassAAC()
		local_var_2_4.method0(com.android.example.module07_module032_module2.ClassAAB())

		param0.assertSubscribed()

	}
}
