package com.android.example.module07_module274_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.google.gson.JsonObject = com.google.gson.JsonObject()
	private 	val instance_var_1_1: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
	private 	val instance_var_1_2: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
	private 	val instance_var_1_3: com.google.gson.JsonArray = com.google.gson.JsonArray()
	private 	val instance_var_1_4: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()

	fun method0(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.GsonBuilder
	) {
		val local_var_2_2: com.android.example.module07_module594_module3.ClassAANJava = com.android.example.module07_module594_module3.ClassAANJava()
		local_var_2_2.method2("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.GsonBuilder
	) {
		for (iAb in 0..4) {
			for (iAc in 0..5) {
				val local_var_4_0: com.android.example.module07_module592_module3.ClassAADJava = com.android.example.module07_module592_module3.ClassAADJava()
				local_var_4_0.method2("SomeString")

				val local_var_4_1: com.android.example.module07_module594_module3.ClassAAM = com.android.example.module07_module594_module3.ClassAAM()
				local_var_4_1.method1("SomeString", "SomeString")

				val local_var_4_2: com.android.example.module07_module594_module3.ClassAAEJava = com.android.example.module07_module594_module3.ClassAAEJava()
				local_var_4_2.method1("SomeString")

			}
		}
		val local_var_2_2: com.android.example.module07_module592_module3.ClassAADJava = com.android.example.module07_module592_module3.ClassAADJava()
		local_var_2_2.method3("SomeString", "SomeString")

		val local_var_2_3: com.android.example.module07_module592_module3.ClassAAJ = com.android.example.module07_module592_module3.ClassAAJ()
		local_var_2_3.method2("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module07_module594_module3.ClassAAB = com.android.example.module07_module594_module3.ClassAAB()
		local_var_2_4.method3("SomeString", "SomeString")

	}

	fun method2(
		param0: com.google.gson.internal.Excluder
	) {
		param0.excludeFieldsWithoutExposeAnnotation()

		val local_var_2_1: com.android.example.module07_module594_module3.ClassAANJava = com.android.example.module07_module594_module3.ClassAANJava()
		local_var_2_1.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.disableInnerClassSerialization()

	}

	fun method3(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.internal.Excluder,
		param2: com.google.gson.JsonPrimitive
	) {
		param0.disableInnerClassSerialization()

		val local_var_2_3: com.android.example.module07_module592_module3.ClassAAN = com.android.example.module07_module592_module3.ClassAAN()
		local_var_2_3.method4("SomeString", "SomeString")

	}
}
