package com.android.example.module02_module19_module1_module5_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.schedulers.TestScheduler
	) {
		val local_var_2_4: com.android.example.module16_module066_module1.ClassABC = com.android.example.module16_module066_module1.ClassABC()
		local_var_2_4.method2(com.android.example.module16_module012_module1.ClassAABJava(), com.android.example.module16_module031_module1.ClassAAGJava(), com.android.example.module16_module033_module1.ClassAAA(), com.android.example.module16_module033_module1.ClassAAQJava())

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.assertNotSubscribed()

		param0.assertNotSubscribed()

		param0.onComplete()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module16_module093_module1.ClassAACJava = com.android.example.module16_module093_module1.ClassAACJava()
		local_var_2_1.method0("SomeString", "SomeString")

		val local_var_2_2: com.android.example.module16_module075_module1.ClassAAOJava = com.android.example.module16_module075_module1.ClassAAOJava()
		local_var_2_2.method0(com.android.example.module16_module031_module1.ClassAAHJava(), com.android.example.module16_module031_module1.ClassAAIJava())

		val local_var_2_3: com.android.example.module07_module356_module2.ClassAAA = com.android.example.module07_module356_module2.ClassAAA()
		local_var_2_3.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module07_module173_module6.ClassAAG = com.android.example.module07_module173_module6.ClassAAG()
		local_var_2_2.method0(com.android.example.module16_module044_module1.ClassAAYJava(), com.android.example.module07_module341.ClassABEJava(), com.android.example.module07_module504_module10.ClassAAJ())

		val local_var_2_3: com.android.example.module07_module563_module1.ClassAAD = com.android.example.module07_module563_module1.ClassAAD()
		local_var_2_3.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}
