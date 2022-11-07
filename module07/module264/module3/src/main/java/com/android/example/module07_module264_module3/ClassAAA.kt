package com.android.example.module07_module264_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module580_module3.ClassAAB = com.android.example.module07_module580_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module07_module580_module3.ClassAAC = com.android.example.module07_module580_module3.ClassAAC()

	fun method0(
		param0: com.android.example.module07_module580_module3.ClassAAI
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..5) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onError(kotlin.Throwable())

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.request(-6220652828993725266)

				val local_var_4_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_2.assertSubscribed()

			}
		}
	}

	fun method1(
		param0: com.android.example.module07_module580_module3.ClassAAI,
		param1: com.android.example.module07_module580_module3.ClassAAI
	) {
		val local_var_2_2: io.reactivex.internal.util.AppendOnlyLinkedArrayList<kotlin.Any> = io.reactivex.internal.util.AppendOnlyLinkedArrayList(8)
		local_var_2_2.add(kotlin.Any())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.isDisposed()

	}
}
