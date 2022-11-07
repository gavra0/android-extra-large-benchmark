package com.android.example.module20_module1_module2_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"
	private 	val instance_var_1_4: String = "SomeString"

	fun method0(
		param0: String
	) {
		for (iAb in 0..0) {
			val local_var_3_0: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
			local_var_3_0.verify()

			for (iAc in 0..5) {
				local_var_3_0.verify()

				val local_var_4_0: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
				local_var_4_0.verifyNoMoreInteractions()

				val local_var_4_1: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
				local_var_4_1.verify()

				val local_var_4_2: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
				local_var_4_2.verify()

			}
			val local_var_3_1: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
			local_var_3_1.verify<kotlin.Any>(kotlin.Any())

		}
		val local_var_2_1: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
		local_var_2_1.verifyNoMoreInteractions()

		val local_var_2_2: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
		local_var_2_2.verify<kotlin.Any>(kotlin.Any())

	}

	fun method1(
		param0: String,
		param1: String
	) {
		val local_var_2_2: org.mockito.configuration.DefaultMockitoConfiguration = org.mockito.configuration.DefaultMockitoConfiguration()
		local_var_2_2.cleansStackTrace()

	}

	fun method2(
		param0: String,
		param1: String
	) {
		val local_var_2_2: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
		local_var_2_2.verifyNoMoreInteractions()

		val local_var_2_3: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
		local_var_2_3.verifyNoMoreInteractions()

		val local_var_2_4: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
		local_var_2_4.verify<kotlin.Any>(kotlin.Any())

	}

	fun method3(
		param0: String
	) {
		val local_var_2_1: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
		local_var_2_1.verify<kotlin.Any>(kotlin.Any())

		local_var_2_1.verify()

		val local_var_2_2: org.mockito.kotlin.InOrderOnType<kotlin.Any> = org.mockito.kotlin.InOrderOnType(kotlin.Any())
		local_var_2_2.verify()

		local_var_2_1.verify()

	}
}
