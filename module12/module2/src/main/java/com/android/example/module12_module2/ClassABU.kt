package com.android.example.module12_module2

@Suppress("UNUSED_PARAMETER")
class ClassABU {
	private 	val instance_var_1_0: com.android.example.module12_module8.ClassABB = com.android.example.module12_module8.ClassABB()
	private 	val instance_var_1_1: com.android.example.module12_module8.ClassABC = com.android.example.module12_module8.ClassABC()

	fun method0(
		param0: com.android.example.module12_module6.ClassAAB,
		param1: com.android.example.module12_module6.ClassAAF,
		param2: com.android.example.module12_module8.ClassAAQ
	) {
		val local_var_2_3: com.google.android.gms.tasks.CancellationTokenSource = com.google.android.gms.tasks.CancellationTokenSource()
		local_var_2_3.getToken()

		for (iAb in 0..2) {
			listOf("1", "2", "3").forEach {
				param0.method2("SomeString", "SomeString", "SomeString")

				val local_var_4_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
				local_var_4_0.getCancellationSignalObject()

			}
		}
		val local_var_2_4: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
		local_var_2_4.clear()

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.throwIfCanceled()

	}

	fun method1(
		param0: com.android.example.module12_module8.ClassAAH,
		param1: com.android.example.module12_module8.ClassAAS,
		param2: com.android.example.module12_module8.ClassAAS,
		param3: com.android.example.module12_module6.ClassAAB
	) {
		param0.method1(com.android.example.module12_module6.ClassAAB())

	}

	fun method2(
		param0: com.android.example.module12_module8.ClassAAF,
		param1: com.android.example.module12_module6.ClassAAG
	) {
		val local_var_2_2: com.google.android.gms.common.data.DataBufferObserverSet = com.google.android.gms.common.data.DataBufferObserverSet()
		local_var_2_2.onDataRangeChanged(2, 50)

		val local_var_2_3: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
		local_var_2_3.onBackPressed()

	}
}
