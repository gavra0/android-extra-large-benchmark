package com.android.example.module12_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAT {
	private 	val instance_var_1_0: com.android.example.module12_module6.ClassAAB = com.android.example.module12_module6.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module12_module6.ClassAAC = com.android.example.module12_module6.ClassAAC()

	fun method0(
		param0: com.android.example.module12_module6.ClassAAA,
		param1: com.android.example.module12_module6.ClassAAB,
		param2: com.android.example.module12_module6.ClassAAB
	) {
		val local_var_2_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_3.get()

		param0.method1("SomeString")

		for (iAb in 0..6) {
			val local_var_3_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_0.get()

			val local_var_3_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_1.get()

			val local_var_3_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
			local_var_3_2.get()

			local_var_3_0.get()

		}
		val local_var_2_4: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_4.get()

	}

	fun method1(
		param0: com.android.example.module12_module6.ClassAAA,
		param1: com.android.example.module12_module6.ClassAAD
	) {
		val local_var_2_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_2.get()

		param0.method0("SomeString", "SomeString")

		param0.method2("SomeString")

		val local_var_2_3: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_3.get()

	}

	fun method2(
		param0: com.android.example.module12_module6.ClassAAF,
		param1: com.android.example.module12_module6.ClassAAB
	) {
		val local_var_2_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_2.get()

	}

	fun method3(
		param0: com.android.example.module12_module6.ClassAAC
	) {
		param0.method0("SomeString", "SomeString", "SomeString")

		val local_var_2_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_1.get()

		val local_var_2_2: okio.Throttler = okio.Throttler()
		local_var_2_2.bytesPerSecond(-8248631858621242120, -5366367638143065847, 8441649337207767685)

	}
}
