package com.android.example.module05_module23_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module05_module23_module4.ClassAAAJava = com.android.example.module05_module23_module4.ClassAAAJava()
	private 	val instance_var_1_1: com.android.example.module05_module23_module4.ClassAAAJava = com.android.example.module05_module23_module4.ClassAAAJava()
	private 	val instance_var_1_2: com.android.example.module07_module249_module6.ClassAAAJava = com.android.example.module07_module249_module6.ClassAAAJava()
	private 	val instance_var_1_3: com.android.example.module05_module23_module4.ClassAAAJava = com.android.example.module05_module23_module4.ClassAAAJava()
	private 	val instance_var_1_4: com.android.example.module07_module194_module1.ClassAAF = com.android.example.module07_module194_module1.ClassAAF()

	fun method0(
		param0: com.android.example.module07_module249_module6.ClassAAAJava
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.dispose()

		for (iAb in 0..4) {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.method1(dagger.internal.DelegateFactory(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			}
		}
	}

	fun method1(
		param0: com.android.example.module07_module249_module6.ClassAAAJava,
		param1: com.android.example.module07_module194_module1.ClassAABJava,
		param2: com.android.example.module05_module23_module9.ClassAAAJava
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		param0.method3(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: io.reactivex.internal.queue.SpscLinkedArrayQueue<kotlin.Any> = io.reactivex.internal.queue.SpscLinkedArrayQueue(43)
		local_var_2_5.clear()

	}

	fun method2(
		param0: com.android.example.module07_module194_module1.ClassAABJava,
		param1: com.android.example.module07_module194_module1.ClassAAF,
		param2: com.android.example.module05_module23_module7.ClassAAAJava
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

	}
}
