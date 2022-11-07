package com.android.example.module16_module004_module1

@Suppress("UNUSED_PARAMETER")
class ClassACL {
	private 	val instance_var_1_0: com.android.example.module16_module026_module1.ClassAAFJava = com.android.example.module16_module026_module1.ClassAAFJava()
	private 	val instance_var_1_1: com.android.example.module16_module003_module1.ClassAAA = com.android.example.module16_module003_module1.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module16_module033_module1.ClassAAA = com.android.example.module16_module033_module1.ClassAAA()

	fun method0(
		param0: com.android.example.module16_module033_module1.ClassAAA,
		param1: com.android.example.module16_module033_module1.ClassAAA
	) {
		for (iAb in 0..3) {
			param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

			listOf("1", "2", "3").forEach {
				param0.method1("SomeString")

			}
		}
		val local_var_2_2: com.android.example.module16_module112_module1.ClassAACJava = com.android.example.module16_module112_module1.ClassAACJava()
		local_var_2_2.method2(com.android.example.module16_module031_module1.ClassAAKJava(), com.android.example.module16_module097_module1.ClassAAAJava(), com.android.example.module16_module097_module1.ClassAAX())

	}

	fun method1(
		param0: com.android.example.module16_module003_module1.ClassAAA
	) {
		val local_var_2_1: com.android.example.module16_module033_module1.ClassAAYJava = com.android.example.module16_module033_module1.ClassAAYJava()
		local_var_2_1.method2("SomeString", "SomeString")

		val local_var_2_2: com.android.example.module16_module033_module1.ClassAAAJava = com.android.example.module16_module033_module1.ClassAAAJava()
		local_var_2_2.method1("SomeString")

		val local_var_2_3: com.android.example.module16_module112_module1.ClassAACJava = com.android.example.module16_module112_module1.ClassAACJava()
		local_var_2_3.method2(com.android.example.module16_module031_module1.ClassAAKJava(), com.android.example.module16_module097_module1.ClassAAAJava(), com.android.example.module16_module097_module1.ClassAAX())

		param0.method0("SomeString", "SomeString", "SomeString")

	}
}
