package com.android.example.module08_module11_module10_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module16_module033_module1.ClassAAWJava = com.android.example.module16_module033_module1.ClassAAWJava()
	private 	val instance_var_1_1: com.android.example.module16_module033_module1.ClassAAQJava = com.android.example.module16_module033_module1.ClassAAQJava()

	fun method0(
		param0: com.android.example.module16_module033_module1.ClassAAKJava,
		param1: com.android.example.module16_module033_module1.ClassAAVJava
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..2) {
				val local_var_4_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
				local_var_4_0.writeVarint64(-1427705342951558310)

				val local_var_4_1: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
				local_var_4_1.writeString("SomeString")

			}
		} else {
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeFixed32(30)

		}
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_2.writeFixed64(884510292132740696)

	}

	fun method1(
		param0: com.android.example.module16_module033_module1.ClassAACJava,
		param1: com.android.example.module16_module033_module1.ClassAAHJava,
		param2: com.android.example.module16_module033_module1.ClassAAMJava
	) {
		param0.method0("SomeString", "SomeString")

		param0.method4("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module16_module033_module1.ClassAAFJava,
		param1: com.android.example.module16_module033_module1.ClassAAPJava
	) {
		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.exit()

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method2("SomeString")

	}
}
