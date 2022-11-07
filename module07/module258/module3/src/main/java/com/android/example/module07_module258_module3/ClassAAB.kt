package com.android.example.module07_module258_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module07_module580_module3.ClassAAH = com.android.example.module07_module580_module3.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module07_module580_module3.ClassAAG = com.android.example.module07_module580_module3.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module07_module580_module3.ClassAAG = com.android.example.module07_module580_module3.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module07_module580_module3.ClassAAF = com.android.example.module07_module580_module3.ClassAAF()

	fun method0(
		param0: com.android.example.module07_module580_module3.ClassAAC,
		param1: com.android.example.module07_module580_module3.ClassAAG
	) {
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.isCancelled()

		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.isDisposed()

			} else {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertSubscribed()

			}
		}
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

	}

	fun method1(
		param0: com.android.example.module07_module580_module3.ClassAAH,
		param1: com.android.example.module07_module580_module3.ClassAAE,
		param2: com.android.example.module07_module580_module3.ClassAAG,
		param3: com.android.example.module07_module580_module3.ClassAAF
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.dispose()

	}

	fun method2(
		param0: com.android.example.module07_module580_module3.ClassAAH,
		param1: com.android.example.module07_module580_module3.ClassAAG
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

	}

	fun method3(
		param0: com.android.example.module07_module580_module3.ClassAAA,
		param1: com.android.example.module07_module580_module3.ClassAAB
	) {
		val local_var_2_2: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_2.start()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_5.createWorker()

	}
}
