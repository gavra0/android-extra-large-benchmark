package com.android.example.module07_module092_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"

	fun method0(
		param0: String
	) {
		val local_var_2_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_1.addFeatureFlag("SomeString", "SomeString")

		local_var_2_1.addMetadataString("SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.clearFeatureFlag("SomeString")

		val local_var_2_3: com.bugsnag.android.FeatureFlag = com.bugsnag.android.FeatureFlag("SomeString")
		local_var_2_3.setValue("SomeString")

		local_var_2_1.updateIsLaunching(false)

	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_1.addFeatureFlag("SomeString", "SomeString")

		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.updateInForeground(true, "SomeString")

		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.getSignalUnwindStackFunction()

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.addBreadcrumb("SomeString", "SomeString", "SomeString", kotlin.Any())

	}

	fun method3(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_2.clearFeatureFlags()

		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.clearFeatureFlag("SomeString")

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.updateOrientation("SomeString")

		val local_var_2_5: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_5.updateUserName("SomeString")

	}

	fun method4(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_3.updateLowMemory(false, "SomeString")

		val local_var_2_4: com.bugsnag.android.ndk.NativeBridge = com.bugsnag.android.ndk.NativeBridge()
		local_var_2_4.removeMetadata("SomeString", "SomeString")

	}
}
