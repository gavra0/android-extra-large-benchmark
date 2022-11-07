package com.android.example.module07_module089_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
		for (iAb in 0..5) {
			listOf("1", "2", "3").forEach {
			}
			val local_var_3_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_0.clear()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(7439547173014113359)

	}

	fun method1(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-658507579998585194)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.assertNotSubscribed()

		local_var_2_4.onNext(kotlin.Any())

	}

	fun method2(
		param0: String
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.dispose()

		local_var_2_1.onNext(kotlin.Any())

		val local_var_2_2: io.reactivex.disposables.CompositeDisposable = io.reactivex.disposables.CompositeDisposable()
		local_var_2_2.clear()

		local_var_2_1.isDisposed()

	}
}
