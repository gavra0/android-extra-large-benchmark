package com.android.example.module18_module05

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module18_module01_module3.ClassAAI = com.android.example.module18_module01_module3.ClassAAI()
			local_var_3_0.method2("SomeString", "SomeString", "SomeString", "SomeString")

			val local_var_3_1: com.android.example.module18_module09_module1.ClassAAA = com.android.example.module18_module09_module1.ClassAAA()
			local_var_3_1.method1("SomeString", "SomeString", "SomeString")

		}
	}

	fun method1(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: com.android.example.module18_module01_module3.ClassAAJ = com.android.example.module18_module01_module3.ClassAAJ()
		local_var_2_4.method0("SomeString", "SomeString")

		val local_var_2_5: com.android.example.module18_module01_module3.ClassAAC = com.android.example.module18_module01_module3.ClassAAC()
		local_var_2_5.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
