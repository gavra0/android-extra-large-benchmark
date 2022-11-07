package com.android.example.module07_module358_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
	private 	val instance_var_1_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_4: com.android.example.module07_module488_module1.ClassAAD = com.android.example.module07_module488_module1.ClassAAD()
		local_var_2_4.method0(io.reactivex.internal.disposables.ListCompositeDisposable())

		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module07_module594_module3.ClassAAT = com.android.example.module07_module594_module3.ClassAAT()
				local_var_4_0.method0("SomeString")

			}
			param0.hasSubscription()

		}
		val local_var_2_5: com.android.example.module07_module562_module10.ClassAAG = com.android.example.module07_module562_module10.ClassAAG()
		local_var_2_5.method0("SomeString", "SomeString")

		param0.assertSubscribed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module07_module562_module10.ClassAAFJava = com.android.example.module07_module562_module10.ClassAAFJava()
		local_var_2_4.method1("SomeString")

		val local_var_2_5: com.android.example.module07_module562_module10.ClassAAG = com.android.example.module07_module562_module10.ClassAAG()
		local_var_2_5.method0("SomeString", "SomeString")

	}
}
