package com.android.example.module03_module13_module1

@Suppress("UNUSED_PARAMETER")
class ClassABP {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module23_module1_module09_module3.ClassAAA = com.android.example.module23_module1_module09_module3.ClassAAA()
		local_var_2_4.method2(com.android.example.module07_module194_module1.ClassAAE())

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module23_module1_module44_module4.ClassAAI = com.android.example.module23_module1_module44_module4.ClassAAI()
			local_var_3_0.method1(com.android.example.module07_module542_module4.ClassAAD(), com.android.example.module07_module542_module4.ClassAAC())

			val local_var_3_1: com.android.example.module23_module1_module32_module1.ClassAAA = com.android.example.module23_module1_module32_module1.ClassAAA()
			local_var_3_1.method0("SomeString", "SomeString", "SomeString")

		}
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module07_module194_module1.ClassAAB = com.android.example.module07_module194_module1.ClassAAB()
		local_var_2_4.method3("SomeString", "SomeString")

		param0.get()

		val local_var_2_5: com.android.example.module23_module1_module32_module1.ClassAAA = com.android.example.module23_module1_module32_module1.ClassAAA()
		local_var_2_5.method0("SomeString", "SomeString", "SomeString")

	}
}
