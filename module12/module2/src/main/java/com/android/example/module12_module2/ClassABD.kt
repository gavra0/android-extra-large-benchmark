package com.android.example.module12_module2

@Suppress("UNUSED_PARAMETER")
class ClassABD {
	private 	val instance_var_1_0: com.android.example.module12_module8.ClassAAY = com.android.example.module12_module8.ClassAAY()
	private 	val instance_var_1_1: com.android.example.module12_module8.ClassAAX = com.android.example.module12_module8.ClassAAX()
	private 	val instance_var_1_2: com.android.example.module12_module6.ClassAAB = com.android.example.module12_module6.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module12_module6.ClassAAH = com.android.example.module12_module6.ClassAAH()

	fun method0(
		param0: com.android.example.module12_module8.ClassAAB
	) {
		val local_var_2_1: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_1.clearDeadline()

		listOf("1", "2", "3").forEach {
			for (iAb in 0..2) {
				val local_var_4_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
				local_var_4_0.cancel()

				val local_var_4_1: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
				local_var_4_1.onBackPressed()

			}
			val local_var_3_0: androidx.arch.core.internal.FastSafeIterableMap<kotlin.Any,kotlin.Any> = androidx.arch.core.internal.FastSafeIterableMap()
			local_var_3_0.remove(kotlin.Any())

		}
	}

	fun method1(
		param0: com.android.example.module12_module8.ClassABB
	) {
		val local_var_2_1: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
		local_var_2_1.clear()

		val local_var_2_2: androidx.collection.CircularIntArray = androidx.collection.CircularIntArray()
		local_var_2_2.isEmpty()

		val local_var_2_3: okhttp3.internal.platform.AndroidPlatform = okhttp3.internal.platform.AndroidPlatform()
		local_var_2_3.logCloseableLeak("SomeString", kotlin.Any())

		val local_var_2_4: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_4.postValue(kotlin.Any())

	}

	fun method2(
		param0: pkg.android.module12.module8.BuildConfig,
		param1: com.android.example.module12_module6.ClassAAF,
		param2: com.android.example.module12_module8.ClassAAX
	) {
		val local_var_2_3: androidx.constraintlayout.solver.widgets.Barrier = androidx.constraintlayout.solver.widgets.Barrier()
		local_var_2_3.resolve()

		param1.method2("SomeString", "SomeString")

		param1.method3("SomeString")

		param1.method2("SomeString", "SomeString")

	}
}
