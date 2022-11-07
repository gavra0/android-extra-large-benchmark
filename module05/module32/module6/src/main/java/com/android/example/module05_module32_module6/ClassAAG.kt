package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_2: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..5) {
			param0.onComplete()

			val local_var_3_0: com.android.example.module16_module058_module1.ClassAADJava = com.android.example.module16_module058_module1.ClassAADJava()
			local_var_3_0.method2(com.android.example.module16_module033_module1.ClassAAIJava(), com.android.example.module16_module033_module1.ClassAAA())

		}
		val local_var_2_4: com.android.example.module07_module032_module2.ClassAAA = com.android.example.module07_module032_module2.ClassAAA()
		local_var_2_4.method1(com.android.example.module07_module194_module1.ClassAAB())

		val local_var_2_5: com.android.example.module07_module168_module2.ClassAAA = com.android.example.module07_module168_module2.ClassAAA()
		local_var_2_5.method2("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.disposables.SerialDisposable
	) {
		val local_var_2_1: com.android.example.module07_module592_module3.ClassAAB = com.android.example.module07_module592_module3.ClassAAB()
		local_var_2_1.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
