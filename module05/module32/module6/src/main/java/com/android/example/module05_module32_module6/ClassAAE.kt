package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		listOf("1", "2", "3").forEach {
			param0.requestMore(-1585750252706968832)

		}
	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: com.android.example.module16_module033_module1.ClassAAOJava = com.android.example.module16_module033_module1.ClassAAOJava()
			local_var_3_0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		}
		val local_var_2_4: com.android.example.module07_module168_module2.ClassAAA = com.android.example.module07_module168_module2.ClassAAA()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module07_module031_module6.ClassAAUJava = com.android.example.module07_module031_module6.ClassAAUJava()
		local_var_2_5.method2(com.android.example.module16_module059_module1.ClassAAAJava(), com.android.example.module07_module032_module2.ClassAAB(), com.android.example.module07_module136_module5.ClassAAC())

		val local_var_2_6: com.android.example.module07_module168_module2.ClassAAF = com.android.example.module07_module168_module2.ClassAAF()
		local_var_2_6.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_7: com.android.example.module07_module594_module3.ClassAAE = com.android.example.module07_module594_module3.ClassAAE()
		local_var_2_7.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.cancel()

		val local_var_2_1: com.android.example.module16_module058_module1.ClassAAEJava = com.android.example.module16_module058_module1.ClassAAEJava()
		local_var_2_1.method0(com.android.example.module16_module033_module1.ClassAAFJava())

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

		param0.assertSubscribed()

		param0.requestMore(-715765375210579521)

		val local_var_2_2: com.android.example.module16_module059_module1.ClassAABJava = com.android.example.module16_module059_module1.ClassAABJava()
		local_var_2_2.method1(com.android.example.module16_module033_module1.ClassAAA())

	}
}
