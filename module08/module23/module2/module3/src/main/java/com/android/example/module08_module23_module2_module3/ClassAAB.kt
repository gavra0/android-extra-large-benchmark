package com.android.example.module08_module23_module2_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onError(kotlin.Throwable())

		val local_var_2_1: com.android.example.module16_module012_module1.ClassAAAJava = com.android.example.module16_module012_module1.ClassAAAJava()
		local_var_2_1.method2(com.android.example.module16_module033_module1.ClassAAA())

		listOf("1", "2", "3").forEach {
			param0.onComplete()

		}
		val local_var_2_2: com.android.example.module16_module075_module1.ClassABAJava = com.android.example.module16_module075_module1.ClassABAJava()
		local_var_2_2.method1(com.android.example.module16_module031_module1.ClassAABJava())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module16_module089_module1.ClassAAGJava = com.android.example.module16_module089_module1.ClassAAGJava()
		local_var_2_4.method1(com.android.example.module16_module034_module1.ClassAACJava(), com.android.example.module16_module075_module1.ClassAAA(), com.android.example.module16_module036_module1.ClassAAA(), com.android.example.module16_module012_module1.ClassAAAJava())

		val local_var_2_5: com.android.example.module16_module034_module1.ClassAAAJava = com.android.example.module16_module034_module1.ClassAAAJava()
		local_var_2_5.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
