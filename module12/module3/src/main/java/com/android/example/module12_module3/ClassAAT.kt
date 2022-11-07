package com.android.example.module12_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAT {
	private 	val instance_var_1_0: com.android.example.module12_module6.ClassAAA = com.android.example.module12_module6.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module12_module6.ClassAAD = com.android.example.module12_module6.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module12_module6.ClassAAE = com.android.example.module12_module6.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module111_module1.ClassAACJava,
		param1: com.android.example.module12_module8.ClassAAI
	) {
		val local_var_2_2: okhttp3.Dispatcher = okhttp3.Dispatcher()
		local_var_2_2.cancelAll()

		for (iAb in 0..2) {
			val local_var_3_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_0.isCanceled()

			val local_var_3_1: okhttp3.internal.publicsuffix.PublicSuffixDatabase = okhttp3.internal.publicsuffix.PublicSuffixDatabase()
			local_var_3_1.getEffectiveTldPlusOne("SomeString")

			local_var_3_0.throwIfCanceled()

		}
	}

	fun method1(
		param0: com.android.example.module07_module111_module1.ClassAABJava,
		param1: com.android.example.module12_module6.ClassAAF,
		param2: com.android.example.module07_module111_module1.ClassAAEJava,
		param3: com.android.example.module07_module111_module1.ClassAABJava
	) {
		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.getCancellationSignalObject()

		param0.method1("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module07_module111_module1.ClassAABJava,
		param1: com.android.example.module12_module6.ClassAAB,
		param2: com.android.example.module07_module111_module1.ClassAAAJava,
		param3: com.android.example.module12_module6.ClassAAD
	) {
		val local_var_2_4: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_4.postValue(kotlin.Any())

		val local_var_2_5: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_5.get()

		val local_var_2_6: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_6.deadlineNanoTime(8590559105838762229)

		val local_var_2_7: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
		local_var_2_7.clear()

	}

	fun method3(
		param0: com.android.example.module07_module111_module1.ClassAAEJava
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.setDelegate(okio.Timeout())

		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_2: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
		local_var_2_2.get()

	}

	fun method4(
		param0: com.android.example.module12_module6.ClassAAD,
		param1: com.android.example.module12_module8.ClassAAB
	) {
		param0.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_2: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
		local_var_2_2.clear()

		val local_var_2_3: okhttp3.internal.platform.AndroidPlatform = okhttp3.internal.platform.AndroidPlatform()
		local_var_2_3.isCleartextTrafficPermitted("SomeString")

	}
}
