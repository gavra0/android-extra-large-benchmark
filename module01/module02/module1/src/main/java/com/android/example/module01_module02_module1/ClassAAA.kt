package com.android.example.module01_module02_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		for (iAb in 0..1) {
			val local_var_3_0: com.android.example.module07_module594_module3.ClassAAI = com.android.example.module07_module594_module3.ClassAAI()
			local_var_3_0.method0("SomeString", "SomeString", "SomeString")

			val local_var_3_1: com.android.example.module07_module019_module4.ClassAAA = com.android.example.module07_module019_module4.ClassAAA()
			local_var_3_1.method1(com.android.example.module07_module594_module3.ClassAAL())

			val local_var_3_2: com.android.example.module07_module587_module2.ClassAAD = com.android.example.module07_module587_module2.ClassAAD()
			local_var_3_2.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onNext(kotlin.Any())

	}
}
