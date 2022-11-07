package com.android.example.module18_module07_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module18_module07_module3.ClassAAF = com.android.example.module18_module07_module3.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module18_module07_module3.ClassAAI = com.android.example.module18_module07_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module18_module07_module3.ClassAAF,
		param1: com.android.example.module18_module07_module3.ClassAAI,
		param2: com.android.example.module18_module07_module3.ClassAAC
	) {
		val local_var_2_3: com.android.example.module18_module07_module3.ClassAAB = com.android.example.module18_module07_module3.ClassAAB()
		local_var_2_3.method0("SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module18_module07_module3.ClassAAD = com.android.example.module18_module07_module3.ClassAAD()
			local_var_3_0.method2("SomeString")

			val local_var_3_1: com.android.example.module18_module07_module3.ClassAAC = com.android.example.module18_module07_module3.ClassAAC()
			local_var_3_1.method0("SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module18_module07_module3.ClassAAH
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_1: com.android.example.module18_module07_module3.ClassAAA = com.android.example.module18_module07_module3.ClassAAA()
		local_var_2_1.method0("SomeString", "SomeString")

		param0.method3("SomeString", "SomeString")

	}
}
