package com.android.example.module05_module26_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.internal.queue.SpscLinkedArrayQueue<kotlin.Any> = io.reactivex.internal.queue.SpscLinkedArrayQueue(1)
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>
	) {
		param0.isDisposed()

		for (iAb in 0..5) {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.dispose()

			} else {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

			}
			param0.cancel()

		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		val local_var_2_3: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(2)
		local_var_2_3.head()

	}

	fun method2(
		param0: io.reactivex.disposables.SerialDisposable
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

	}
}
