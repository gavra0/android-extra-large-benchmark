package com.android.example.module07_module166_module9

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module166_module8.ClassAAF = com.android.example.module07_module166_module8.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module166_module8.ClassAAA = com.android.example.module07_module166_module8.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module166_module8.ClassAAD = com.android.example.module07_module166_module8.ClassAAD()
	private 	val instance_var_1_3: com.android.example.module07_module166_module8.ClassAAE = com.android.example.module07_module166_module8.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module166_module8.ClassAAD,
		param1: com.android.example.module07_module166_module8.ClassAAA,
		param2: com.android.example.module07_module166_module8.ClassAAB
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		} else {
			val local_var_3_0: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(70)
			local_var_3_0.add(kotlin.Any())

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_4.shutdown()

		val local_var_2_5: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_5.dispose()

	}

	fun method1(
		param0: com.android.example.module07_module166_module8.ClassAAE,
		param1: com.android.example.module07_module166_module8.ClassAAA
	) {
		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module07_module166_module8.ClassAAC,
		param1: com.android.example.module07_module166_module8.ClassAAB,
		param2: com.android.example.module07_module166_module8.ClassAAE
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method3(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}

	fun method3(
		param0: com.android.example.module07_module166_module8.ClassAAC,
		param1: com.android.example.module07_module166_module8.ClassAAC
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(-2601707036032799045)

	}

	fun method4(
		param0: com.android.example.module07_module166_module8.ClassAAE
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.clear()

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.clear()

		param0.method4(io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(6863586626336791543)

	}
}
