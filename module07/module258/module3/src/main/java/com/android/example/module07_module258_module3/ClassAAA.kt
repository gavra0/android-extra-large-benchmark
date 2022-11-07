package com.android.example.module07_module258_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module580_module3.ClassAAC = com.android.example.module07_module580_module3.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module07_module580_module3.ClassAAE = com.android.example.module07_module580_module3.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module07_module580_module3.ClassAAD = com.android.example.module07_module580_module3.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module07_module580_module3.ClassAAE = com.android.example.module07_module580_module3.ClassAAE()
	private 	val instance_var_1_4: com.android.example.module07_module580_module3.ClassAAD = com.android.example.module07_module580_module3.ClassAAD()

	fun method0(
		param0: com.android.example.module07_module580_module3.ClassAAE,
		param1: com.android.example.module07_module580_module3.ClassAAH,
		param2: com.android.example.module07_module580_module3.ClassAAB
	) {
		val local_var_2_3: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_3.dispose()

		for (iAb in 0..3) {
			param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

			param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onComplete()

	}

	fun method1(
		param0: com.android.example.module07_module580_module3.ClassAAC
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

	}
}
