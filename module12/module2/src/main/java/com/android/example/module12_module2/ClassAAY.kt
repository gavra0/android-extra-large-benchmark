package com.android.example.module12_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAY {
	private 	val instance_var_1_0: com.android.example.module12_module6.ClassAAB = com.android.example.module12_module6.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module12_module6.ClassAAF = com.android.example.module12_module6.ClassAAF()

	fun method0(
		param0: com.android.example.module12_module8.ClassABC,
		param1: com.android.example.module12_module6.ClassAAE,
		param2: pkg.android.module12.module8.BuildConfig,
		param3: com.android.example.module12_module8.ClassAAX
	) {
		for (iAb in 0..1) {
			for (iAc in 0..0) {
				val local_var_4_0: okhttp3.ConnectionPool = okhttp3.ConnectionPool()
				local_var_4_0.idleConnectionCount()

				val local_var_4_1: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
				local_var_4_1.setValue(kotlin.Any())

			}
		}
	}

	fun method1(
		param0: com.android.example.module12_module6.ClassAAH,
		param1: com.android.example.module12_module6.ClassAAE,
		param2: com.android.example.module12_module8.ClassABB
	) {
		param0.method1("SomeString")

		param0.method0("SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.google.android.gms.tasks.TaskCompletionSource<kotlin.Any> = com.google.android.gms.tasks.TaskCompletionSource()
		local_var_2_3.trySetException(java.lang.Exception())

		param0.method3("SomeString")

		param0.method2("SomeString", "SomeString")

	}
}
