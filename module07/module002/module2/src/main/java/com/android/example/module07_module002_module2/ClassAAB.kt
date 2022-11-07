package com.android.example.module07_module002_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module002_module3.ClassAAA = com.android.example.module07_module002_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module194_module1.ClassAABJava = com.android.example.module07_module194_module1.ClassAABJava()
	private 	val instance_var_1_2: com.android.example.module07_module002_module3.ClassAAB = com.android.example.module07_module002_module3.ClassAAB()

	fun method0(
		param0: com.android.example.module07_module002_module3.ClassAAA,
		param1: com.android.example.module07_module194_module1.ClassAAA,
		param2: com.android.example.module07_module194_module1.ClassAAAJava,
		param3: com.android.example.module07_module194_module1.ClassAAB
	) {
		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 7)

		param0.method1(dagger.internal.DelegateFactory())

		val local_var_2_5: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_5.approveCall("SomeString", 45)

		val local_var_2_6: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_6.approveCall("SomeString", 76)

		val local_var_2_7: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_7.approveCall("SomeString", 51)

	}

	fun method1(
		param0: com.android.example.module07_module194_module1.ClassAAC,
		param1: com.android.example.module07_module194_module1.ClassAAF,
		param2: com.android.example.module07_module002_module3.ClassAAB
	) {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.getCancellationSignalObject()

	}

	fun method2(
		param0: com.android.example.module07_module002_module3.ClassAAC,
		param1: com.android.example.module07_module002_module3.ClassAAC,
		param2: com.android.example.module07_module194_module1.ClassAAC,
		param3: com.android.example.module07_module194_module1.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

		val local_var_2_6: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_6.approveCall("SomeString", 34)

		param0.method2(dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory(), dagger.internal.DelegateFactory())

	}
}
