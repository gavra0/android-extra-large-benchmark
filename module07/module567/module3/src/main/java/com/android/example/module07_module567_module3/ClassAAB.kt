package com.android.example.module07_module567_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAAAJava = com.android.example.module07_module194_module1.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module07_module194_module1.ClassAABJava = com.android.example.module07_module194_module1.ClassAABJava()
	private 	val instance_var_1_2: com.android.example.module07_module194_module1.ClassAAC = com.android.example.module07_module194_module1.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module07_module194_module1.ClassAAA = com.android.example.module07_module194_module1.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module567_module2.ClassAAB,
		param1: com.android.example.module07_module194_module1.ClassAAB,
		param2: com.android.example.module07_module567_module4.ClassAAF,
		param3: com.android.example.module07_module567_module2.ClassAAD
	) {
		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.optionalStart()

		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..1) {
				param0.method0(com.android.example.module07_module567_module4.ClassAAB(), com.android.example.module07_module567_module4.ClassAAD())

				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertSubscribed()

				local_var_4_0.cancel()

			}
		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onError(kotlin.Throwable())

		}
		val local_var_2_5: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_5.toFormatter()

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAG,
		param1: com.android.example.module07_module194_module1.ClassAAC,
		param2: com.android.example.module07_module194_module1.ClassAAA
	) {
		param0.method2("SomeString", "SomeString")

		param0.method3("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module07_module567_module2.ClassAAB,
		param1: com.android.example.module07_module567_module2.ClassAAD,
		param2: com.android.example.module07_module567_module4.ClassAAA
	) {
		param0.method2(com.android.example.module07_module567_module4.ClassAAF(), com.android.example.module07_module194_module1.ClassAAF(), com.android.example.module07_module194_module1.ClassAAF(), com.android.example.module07_module567_module4.ClassAAC())

	}
}
