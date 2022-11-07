package com.android.example.module16_module062_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module16_module061_module1.ClassAAB = com.android.example.module16_module061_module1.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module16_module061_module1.ClassAAC = com.android.example.module16_module061_module1.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module16_module061_module1.ClassAAA = com.android.example.module16_module061_module1.ClassAAA()

	fun method0(
		param0: com.android.example.module16_module061_module1.ClassAAA,
		param1: com.android.example.module16_module061_module1.ClassAAB,
		param2: com.android.example.module16_module061_module1.ClassAAD,
		param3: com.android.example.module16_module061_module1.ClassAAD
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module16_module061_module1.ClassAAB = com.android.example.module16_module061_module1.ClassAAB()
			local_var_3_0.method1("SomeString", "SomeString")

			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module16_module061_module1.ClassAAC = com.android.example.module16_module061_module1.ClassAAC()
				local_var_4_0.method2("SomeString")

			}
		}
		val local_var_2_4: com.android.example.module16_module061_module1.ClassAAD = com.android.example.module16_module061_module1.ClassAAD()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module16_module061_module1.ClassAAC = com.android.example.module16_module061_module1.ClassAAC()
		local_var_2_5.method2("SomeString")

		val local_var_2_6: com.android.example.module16_module061_module1.ClassAAA = com.android.example.module16_module061_module1.ClassAAA()
		local_var_2_6.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_7: com.android.example.module16_module061_module1.ClassAAB = com.android.example.module16_module061_module1.ClassAAB()
		local_var_2_7.method1("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module16_module061_module1.ClassAAC,
		param1: com.android.example.module16_module061_module1.ClassAAD,
		param2: com.android.example.module16_module061_module1.ClassAAB
	) {
		val local_var_2_3: com.android.example.module16_module061_module1.ClassAAB = com.android.example.module16_module061_module1.ClassAAB()
		local_var_2_3.method1("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module16_module061_module1.ClassAAA = com.android.example.module16_module061_module1.ClassAAA()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method0("SomeString")

	}

	fun method2(
		param0: com.android.example.module16_module061_module1.ClassAAC,
		param1: com.android.example.module16_module061_module1.ClassAAC,
		param2: com.android.example.module16_module061_module1.ClassAAB
	) {
		param0.method0("SomeString")

		val local_var_2_3: com.android.example.module16_module061_module1.ClassAAD = com.android.example.module16_module061_module1.ClassAAD()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module16_module061_module1.ClassAAD = com.android.example.module16_module061_module1.ClassAAD()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module16_module061_module1.ClassAAC = com.android.example.module16_module061_module1.ClassAAC()
		local_var_2_5.method3("SomeString", "SomeString")

		val local_var_2_6: com.android.example.module16_module061_module1.ClassAAC = com.android.example.module16_module061_module1.ClassAAC()
		local_var_2_6.method1("SomeString", "SomeString")

	}
}
