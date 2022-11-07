package com.android.example.module07_module488_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module07_module594_module3.ClassAAX = com.android.example.module07_module594_module3.ClassAAX()
	private 	val instance_var_1_1: com.android.example.module07_module594_module3.ClassAAA = com.android.example.module07_module594_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module594_module3.ClassAAJ = com.android.example.module07_module594_module3.ClassAAJ()
	private 	val instance_var_1_3: com.android.example.module07_module594_module3.ClassAAO = com.android.example.module07_module594_module3.ClassAAO()
	private 	val instance_var_1_4: com.android.example.module07_module594_module3.ClassAAK = com.android.example.module07_module594_module3.ClassAAK()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

		val local_var_2_3: com.android.example.module07_module594_module3.ClassAAFJava = com.android.example.module07_module594_module3.ClassAAFJava()
		local_var_2_3.method0("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module07_module594_module3.ClassAAH = com.android.example.module07_module594_module3.ClassAAH()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.dispose()

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		val local_var_2_2: com.android.example.module07_module594_module3.ClassAAB = com.android.example.module07_module594_module3.ClassAAB()
		local_var_2_2.method4("SomeString", "SomeString")

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		param0.onNext(kotlin.Any())

	}
}
