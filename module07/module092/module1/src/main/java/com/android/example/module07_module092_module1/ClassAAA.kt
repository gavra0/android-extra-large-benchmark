package com.android.example.module07_module092_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"
	private 	val instance_var_1_4: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
	}

	fun method1(
		param0: String
	) {
	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
		}
		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.deliverReportAtPath("SomeString")

	}

	fun method3(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.addFeatureFlag("SomeString", "SomeString")

	}
}
