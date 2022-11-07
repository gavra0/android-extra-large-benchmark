package com.android.example.module07_module147_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()

	fun method0(
		param0: com.android.example.module16_module030_module1.ClassAAAJava,
		param1: com.android.example.module16_module030_module1.ClassAAAJava,
		param2: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeFixed64(6774700064922358663)

		for (iAb in 0..0) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
				local_var_4_0.writeString("SomeString")

			}
			param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		}
		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method3("SomeString")

	}

	fun method1(
		param0: com.android.example.module16_module030_module1.ClassAAAJava,
		param1: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		val local_var_2_2: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_2.writeString("SomeString")

		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeVarint64(-7211049890971476149)

		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

	}
}
