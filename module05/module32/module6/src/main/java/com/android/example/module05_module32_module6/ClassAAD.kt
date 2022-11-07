package com.android.example.module05_module32_module6

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_2: com.android.example.module07_module031_module6.ClassAAF = com.android.example.module07_module031_module6.ClassAAF()
		local_var_2_2.method1(com.android.example.module07_module136_module5.ClassAAF(), com.android.example.module16_module059_module1.ClassAAAJava(), com.android.example.module16_module058_module1.ClassAAIJava())

		val local_var_2_3: com.android.example.module16_module059_module1.ClassAAAJava = com.android.example.module16_module059_module1.ClassAAAJava()
		local_var_2_3.method1(com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAACJava(), com.android.example.module16_module033_module1.ClassAAA())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module05_module01_module3.ClassAAC = com.android.example.module05_module01_module3.ClassAAC()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString", "SomeString")

		param0.onNext(kotlin.Any())

		param0.assertNotSubscribed()

		val local_var_2_5: com.android.example.module16_module059_module1.ClassAAAJava = com.android.example.module16_module059_module1.ClassAAAJava()
		local_var_2_5.method0(com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAAA())

		val local_var_2_6: com.android.example.module16_module058_module1.ClassAAAJava = com.android.example.module16_module058_module1.ClassAAAJava()
		local_var_2_6.method1(com.android.example.module16_module033_module1.ClassAAMJava(), com.android.example.module16_module033_module1.ClassAASJava(), com.android.example.module16_module059_module1.ClassAAAJava(), com.android.example.module16_module033_module1.ClassAAA())

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.isCancelled()

	}
}
