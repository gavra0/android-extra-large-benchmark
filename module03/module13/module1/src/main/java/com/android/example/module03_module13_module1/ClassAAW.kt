package com.android.example.module03_module13_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAW {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			param0.get()

		}
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module16_module059_module1.ClassAAAJava = com.android.example.module16_module059_module1.ClassAAAJava()
		local_var_2_1.method1(com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAACJava(), com.android.example.module16_module033_module1.ClassAAA())

		val local_var_2_2: com.android.example.module07_module326_module7.ClassAAB = com.android.example.module07_module326_module7.ClassAAB()
		local_var_2_2.method0(com.android.example.module07_module176_module2.ClassAAA(), com.android.example.module07_module176_module2.ClassAAA())

		param0.get()

		val local_var_2_3: com.android.example.module07_module222_module2.ClassAAA = com.android.example.module07_module222_module2.ClassAAA()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module07_module562_module08.ClassAAA = com.android.example.module07_module562_module08.ClassAAA()
		local_var_2_2.method2(com.android.example.module07_module194_module1.ClassAAF())

		param0.get()

		param0.get()

	}
}
