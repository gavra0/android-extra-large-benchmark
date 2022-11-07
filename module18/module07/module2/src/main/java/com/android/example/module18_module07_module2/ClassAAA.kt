package com.android.example.module18_module07_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module18_module07_module1.ClassAAH = com.android.example.module18_module07_module1.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module18_module07_module1.ClassAAB = com.android.example.module18_module07_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module18_module07_module1.ClassAAC = com.android.example.module18_module07_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module18_module07_module3.ClassAAH,
		param1: com.android.example.module18_module07_module1.ClassAAG,
		param2: com.android.example.module18_module07_module3.ClassAAE,
		param3: com.android.example.module18_module07_module1.ClassAAH
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module18_module07_module1.ClassAAB = com.android.example.module18_module07_module1.ClassAAB()
			local_var_3_0.method1(com.android.example.module18_module07_module3.ClassAAH())

			val local_var_3_1: com.android.example.module18_module07_module3.ClassAAE = com.android.example.module18_module07_module3.ClassAAE()
			local_var_3_1.method2("SomeString", "SomeString", "SomeString", "SomeString")

		}
		val local_var_2_4: com.android.example.module18_module07_module3.ClassAAC = com.android.example.module18_module07_module3.ClassAAC()
		local_var_2_4.method1("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module18_module07_module3.ClassAAG
	) {
		param0.method0("SomeString")

		val local_var_2_1: com.android.example.module18_module07_module1.ClassAAG = com.android.example.module18_module07_module1.ClassAAG()
		local_var_2_1.method1(com.android.example.module18_module07_module3.ClassAAE(), com.android.example.module18_module07_module3.ClassAAD(), com.android.example.module18_module07_module3.ClassAAA(), com.android.example.module18_module07_module3.ClassAAG())

		val local_var_2_2: com.android.example.module18_module07_module1.ClassAAC = com.android.example.module18_module07_module1.ClassAAC()
		local_var_2_2.method0(com.android.example.module18_module07_module3.ClassAAB(), com.android.example.module18_module07_module3.ClassAAA(), com.android.example.module18_module07_module3.ClassAAB())

		val local_var_2_3: com.android.example.module18_module07_module1.ClassAAD = com.android.example.module18_module07_module1.ClassAAD()
		local_var_2_3.method4(com.android.example.module18_module07_module3.ClassAAI(), com.android.example.module18_module07_module3.ClassAAD(), com.android.example.module18_module07_module3.ClassAAH(), com.android.example.module18_module07_module3.ClassAAD())

		val local_var_2_4: com.android.example.module18_module07_module3.ClassAAF = com.android.example.module18_module07_module3.ClassAAF()
		local_var_2_4.method1("SomeString", "SomeString")

	}
}
