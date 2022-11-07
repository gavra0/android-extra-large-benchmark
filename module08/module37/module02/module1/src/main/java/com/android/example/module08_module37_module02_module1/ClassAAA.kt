package com.android.example.module08_module37_module02_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module194_module1.ClassAAE = com.android.example.module07_module194_module1.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module07_module194_module1.ClassAAB = com.android.example.module07_module194_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module07_module194_module1.ClassAAE = com.android.example.module07_module194_module1.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module08_module37_module02_module2.ClassAAA = com.android.example.module08_module37_module02_module2.ClassAAA()
	private 	val instance_var_1_4: com.android.example.module08_module37_module02_module2.ClassAAA = com.android.example.module08_module37_module02_module2.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module194_module1.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(1439300365610287894)

		param0.method2("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module08_module37_module02_module2.ClassAAB,
		param1: com.android.example.module07_module194_module1.ClassAABJava,
		param2: com.android.example.module07_module194_module1.ClassAABJava
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

	}

	fun method2(
		param0: com.android.example.module07_module194_module1.ClassAAC,
		param1: com.android.example.module07_module194_module1.ClassAAG
	) {
		param0.method0("SomeString", "SomeString")

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_3.get()

	}

	fun method3(
		param0: com.android.example.module08_module37_module02_module2.ClassAAB,
		param1: com.android.example.module07_module194_module1.ClassAAG,
		param2: com.android.example.module07_module194_module1.ClassAACJava,
		param3: com.android.example.module07_module194_module1.ClassAAC
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

	}
}
