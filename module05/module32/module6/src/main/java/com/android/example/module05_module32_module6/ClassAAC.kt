package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.schedulers.SingleScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..3) {
			val local_var_3_0: com.android.example.module07_module194_module1.ClassAAD = com.android.example.module07_module194_module1.ClassAAD()
			local_var_3_0.method3("SomeString", "SomeString")

			val local_var_3_1: com.android.example.module07_module592_module3.ClassAAKJava = com.android.example.module07_module592_module3.ClassAAKJava()
			local_var_3_1.method4("SomeString", "SomeString")

		}
		param0.onComplete()

		val local_var_2_3: com.android.example.module07_module592_module3.ClassAAG = com.android.example.module07_module592_module3.ClassAAG()
		local_var_2_3.method1("SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module07_module249_module6.ClassAABJava = com.android.example.module07_module249_module6.ClassAABJava()
		local_var_2_1.method0(dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.util.LinkedArrayList
	) {
		val local_var_2_3: com.android.example.module07_module594_module3.ClassAAIJava = com.android.example.module07_module594_module3.ClassAAIJava()
		local_var_2_3.method3("SomeString", "SomeString", "SomeString")

		param0.isDisposed()

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.disposables.SerialDisposable,
		param2: io.reactivex.observers.TestObserver<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module16_module059_module1.ClassAAAJava = com.android.example.module16_module059_module1.ClassAAAJava()
		local_var_2_3.method0(com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAAA())

	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module07_module136_module5.ClassAAB = com.android.example.module07_module136_module5.ClassAAB()
		local_var_2_4.method0(com.android.example.module07_module032_module2.ClassAAB(), com.android.example.module07_module168_module2.ClassAAC(), com.android.example.module07_module032_module2.ClassAAB())

		val local_var_2_5: com.android.example.module07_module032_module2.ClassAAB = com.android.example.module07_module032_module2.ClassAAB()
		local_var_2_5.method1(com.android.example.module07_module194_module1.ClassAAG(), com.android.example.module07_module194_module1.ClassAAA(), com.android.example.module07_module194_module1.ClassAAC())

		param0.isCancelled()

	}
}
