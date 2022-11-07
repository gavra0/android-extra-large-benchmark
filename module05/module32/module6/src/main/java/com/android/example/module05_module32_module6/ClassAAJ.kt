package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		for (iAb in 0..5) {
			param0.isCancelled()

			param0.isDisposed()

			val local_var_3_0: com.android.example.module07_module031_module6.ClassAAGJava = com.android.example.module07_module031_module6.ClassAAGJava()
			local_var_3_0.method1(com.android.example.module16_module058_module1.ClassAAEJava(), com.android.example.module07_module136_module5.ClassAAF())

		}
		val local_var_2_3: com.android.example.module07_module136_module5.ClassAAB = com.android.example.module07_module136_module5.ClassAAB()
		local_var_2_3.method0(com.android.example.module07_module032_module2.ClassAAB(), com.android.example.module07_module168_module2.ClassAAC(), com.android.example.module07_module032_module2.ClassAAB())

		val local_var_2_4: com.android.example.module16_module058_module1.ClassAACJava = com.android.example.module16_module058_module1.ClassAACJava()
		local_var_2_4.method1(com.android.example.module16_module033_module1.ClassAAQJava(), com.android.example.module16_module033_module1.ClassAACJava(), com.android.example.module16_module059_module1.ClassAABJava(), com.android.example.module16_module059_module1.ClassAAAJava())

		val local_var_2_5: com.android.example.module07_module594_module3.ClassAAW = com.android.example.module07_module594_module3.ClassAAW()
		local_var_2_5.method4("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_6: com.android.example.module07_module249_module6.ClassAABJava = com.android.example.module07_module249_module6.ClassAABJava()
		local_var_2_6.method0(dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_2: com.android.example.module07_module592_module3.ClassAAEJava = com.android.example.module07_module592_module3.ClassAAEJava()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString")

		param0.assertNotSubscribed()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module07_module032_module2.ClassAAB = com.android.example.module07_module032_module2.ClassAAB()
		local_var_2_1.method1(com.android.example.module07_module194_module1.ClassAAG(), com.android.example.module07_module194_module1.ClassAAA(), com.android.example.module07_module194_module1.ClassAAC())

		val local_var_2_2: com.android.example.module16_module033_module1.ClassAAJJava = com.android.example.module16_module033_module1.ClassAAJJava()
		local_var_2_2.method2("SomeString", "SomeString")

		param0.assertNotSubscribed()

	}
}
