package com.android.example.module07_module120_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_3: com.android.example.module07_module031_module6.ClassAATJava = com.android.example.module07_module031_module6.ClassAATJava()
		local_var_2_3.method1(com.android.example.module07_module032_module2.ClassAAB(), com.android.example.module16_module058_module1.ClassAAJJava())

		param0.isDisposed()

		for (iAb in 0..2) {
			param0.cancel()

			param0.requestMore(8410548228585314137)

		}
		val local_var_2_4: com.android.example.module16_module059_module1.ClassAAAJava = com.android.example.module16_module059_module1.ClassAAAJava()
		local_var_2_4.method0(com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAAA())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module07_module168_module2.ClassAAD = com.android.example.module07_module168_module2.ClassAAD()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString")

		param0.assertSubscribed()

		param0.isCancelled()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module16_module059_module1.ClassAAAJava = com.android.example.module16_module059_module1.ClassAAAJava()
		local_var_2_4.method1(com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAACJava(), com.android.example.module16_module033_module1.ClassAAA())

		val local_var_2_5: com.android.example.module07_module031_module6.ClassAAUJava = com.android.example.module07_module031_module6.ClassAAUJava()
		local_var_2_5.method3(com.android.example.module16_module058_module1.ClassAAIJava(), com.android.example.module07_module136_module5.ClassAAA(), com.android.example.module16_module059_module1.ClassAABJava(), com.android.example.module16_module059_module1.ClassAABJava())

		val local_var_2_6: com.android.example.module07_module194_module1.ClassAAD = com.android.example.module07_module194_module1.ClassAAD()
		local_var_2_6.method0("SomeString")

		param0.onError(kotlin.Throwable())

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.request(-9220742141640324781)

		val local_var_2_3: com.android.example.module07_module136_module5.ClassAAA = com.android.example.module07_module136_module5.ClassAAA()
		local_var_2_3.method1(com.android.example.module07_module032_module2.ClassAAA(), com.android.example.module07_module168_module2.ClassAAC(), com.android.example.module07_module168_module2.ClassAAC(), com.android.example.module07_module032_module2.ClassAAB())

		val local_var_2_4: com.android.example.module07_module032_module2.ClassAAB = com.android.example.module07_module032_module2.ClassAAB()
		local_var_2_4.method0(com.android.example.module07_module194_module1.ClassAABJava())

		param0.onError(kotlin.Throwable())

		val local_var_2_5: com.android.example.module07_module136_module5.ClassAAE = com.android.example.module07_module136_module5.ClassAAE()
		local_var_2_5.method4(com.android.example.module07_module032_module2.ClassAAA(), com.android.example.module07_module168_module2.ClassAAB(), com.android.example.module07_module032_module2.ClassAAA())

	}

	fun method4(
		param0: io.reactivex.schedulers.TestScheduler
	) {
		val local_var_2_1: com.android.example.module07_module194_module1.ClassAAC = com.android.example.module07_module194_module1.ClassAAC()
		local_var_2_1.method2("SomeString", "SomeString", "SomeString")

	}
}
