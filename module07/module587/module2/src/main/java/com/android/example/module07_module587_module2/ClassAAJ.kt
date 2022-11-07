package com.android.example.module07_module587_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module07_module562_module10.ClassAAA = com.android.example.module07_module562_module10.ClassAAA()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module07_module562_module10.ClassAAI = com.android.example.module07_module562_module10.ClassAAI()
		local_var_2_4.method3("SomeString", "SomeString", "SomeString", "SomeString")

		if (kotlin.Any().equals(kotlin.Any())) {
			param0.onNext(kotlin.Any())

		} else {
			val local_var_3_0: com.android.example.module07_module562_module10.ClassAAB = com.android.example.module07_module562_module10.ClassAAB()
			local_var_3_0.method2("SomeString")

		}
		param0.cancel()

		param0.requestMore(-3324348234359985784)

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module07_module592_module3.ClassAAA = com.android.example.module07_module592_module3.ClassAAA()
		local_var_2_3.method0("SomeString")

		param0.assertSubscribed()

		param0.onNext(kotlin.Any())

		val local_var_2_4: com.android.example.module07_module562_module10.ClassAADJava = com.android.example.module07_module562_module10.ClassAADJava()
		local_var_2_4.method1("SomeString")

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module07_module594_module3.ClassAAG = com.android.example.module07_module594_module3.ClassAAG()
		local_var_2_1.method4("SomeString")

		val local_var_2_2: com.android.example.module07_module592_module3.ClassAAGJava = com.android.example.module07_module592_module3.ClassAAGJava()
		local_var_2_2.method1("SomeString")

		val local_var_2_3: com.android.example.module07_module196_module1.ClassAADJava = com.android.example.module07_module196_module1.ClassAADJava()
		local_var_2_3.method3("SomeString", "SomeString", "SomeString")

	}
}
