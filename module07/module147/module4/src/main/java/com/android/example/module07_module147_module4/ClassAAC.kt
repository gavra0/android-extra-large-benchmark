package com.android.example.module07_module147_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_2: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_3: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_4: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()

	fun method0(
		param0: com.android.example.module16_module030_module1.ClassAAAJava,
		param1: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		val local_var_2_2: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_2.writeFixed32(61)

		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeFixed32(85)

	}

	fun method1(
		param0: com.android.example.module16_module030_module1.ClassAAAJava,
		param1: com.android.example.module16_module030_module1.ClassAAAJava,
		param2: com.android.example.module16_module030_module1.ClassAAAJava,
		param3: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeVarint32(56)

		}
		param0.method1("SomeString", "SomeString")

		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeFixed64(4476059905469645347)

	}

	fun method2(
		param0: com.android.example.module16_module030_module1.ClassAAAJava,
		param1: com.android.example.module16_module030_module1.ClassAAAJava,
		param2: com.android.example.module16_module030_module1.ClassAAAJava,
		param3: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeString("SomeString")

		val local_var_2_5: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_5.writeFixed32(12)

		val local_var_2_6: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_6.writeFixed64(5332870811982177445)

		val local_var_2_7: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_7.writeString("SomeString")

		param0.method1("SomeString", "SomeString")

	}
}
