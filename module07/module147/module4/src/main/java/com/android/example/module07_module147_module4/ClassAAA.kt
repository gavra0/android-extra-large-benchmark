package com.android.example.module07_module147_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_2: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()
	private 	val instance_var_1_3: com.android.example.module16_module030_module1.ClassAAAJava = com.android.example.module16_module030_module1.ClassAAAJava()

	fun method0(
		param0: com.android.example.module16_module030_module1.ClassAAAJava,
		param1: com.android.example.module16_module030_module1.ClassAAAJava,
		param2: com.android.example.module16_module030_module1.ClassAAAJava,
		param3: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeVarint64(-994197959491602767)

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeString("SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.deadlineNanoTime(-1363550263549167775)

		val local_var_2_2: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_2.writeVarint32(79)

		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeString("SomeString")

		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeFixed64(4663039405301475878)

		val local_var_2_5: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_5.writeFixed32(11)

	}

	fun method2(
		param0: com.android.example.module16_module030_module1.ClassAAAJava,
		param1: com.android.example.module16_module030_module1.ClassAAAJava,
		param2: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeFixed32(12)

		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeFixed32(64)

	}

	fun method3(
		param0: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		param0.method1("SomeString", "SomeString")

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method4(
		param0: com.android.example.module16_module030_module1.ClassAAAJava
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_1: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_1.writeFixed64(-4696419150623350438)

	}
}
