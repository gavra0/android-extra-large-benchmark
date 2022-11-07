package com.android.example.module08_module11_module03_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module120_module5.ClassAAAJava = com.android.example.module07_module120_module5.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module07_module194_module1.ClassAAC = com.android.example.module07_module194_module1.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module08_module11_module03_module3.ClassAAA = com.android.example.module08_module11_module03_module3.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module08_module11_module03_module3.ClassAAA = com.android.example.module08_module11_module03_module3.ClassAAA()
	private 	val instance_var_1_4: com.android.example.module08_module11_module03_module3.ClassAAA = com.android.example.module08_module11_module03_module3.ClassAAA()

	fun method0(
		param0: com.android.example.module08_module11_module03_module3.ClassAAA
	) {
		param0.method1("SomeString")

		for (iAb in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

			local_var_3_0.assertNotSubscribed()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.cancel()

		}
		param0.method1("SomeString")

		param0.method1("SomeString")

	}

	fun method1(
		param0: com.android.example.module07_module120_module5.ClassAAA,
		param1: com.android.example.module07_module120_module5.ClassAAAJava,
		param2: com.android.example.module07_module194_module1.ClassAAG,
		param3: com.android.example.module07_module120_module5.ClassAAAJava
	) {
		val local_var_2_4: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_4.shutdown()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

	}

	fun method2(
		param0: com.android.example.module08_module11_module03_module3.ClassAAA,
		param1: com.android.example.module07_module194_module1.ClassAAG,
		param2: com.android.example.module07_module120_module5.ClassAAAJava,
		param3: com.android.example.module08_module11_module03_module3.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_5.triggerActions()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isDisposed()

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_7: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(32)
		local_var_2_7.head()

	}

	fun method3(
		param0: com.android.example.module08_module11_module03_module3.ClassAAA,
		param1: com.android.example.module07_module120_module5.ClassAAA
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.isDisposed()

	}

	fun method4(
		param0: com.android.example.module07_module120_module5.ClassAAA
	) {
		param0.method4(io.reactivex.schedulers.TestScheduler())

	}
}
