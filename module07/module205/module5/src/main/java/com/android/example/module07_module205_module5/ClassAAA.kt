package com.android.example.module07_module205_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
	}

	fun method1(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
				local_var_4_0.d("SomeString")

			}
		} else {
			val local_var_3_0: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
			local_var_3_0.d(kotlin.Throwable(), "SomeString")

		}
	}

	fun method2(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
		local_var_2_3.d(kotlin.Throwable(), "SomeString")

		val local_var_2_4: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
		local_var_2_4.d("SomeString")

		val local_var_2_5: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
		local_var_2_5.d("SomeString")

		local_var_2_3.d(kotlin.Throwable(), "SomeString")

	}

	fun method3(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
		local_var_2_3.d("SomeString")

	}

	fun method4(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
		local_var_2_3.d("SomeString")

		val local_var_2_4: leakcanary.LogcatSharkLog = leakcanary.LogcatSharkLog()
		local_var_2_4.d("SomeString")

		local_var_2_3.d("SomeString")

		local_var_2_3.d(kotlin.Throwable(), "SomeString")

	}
}
