package com.android.example.module07_module204_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
	private 	val instance_var_1_1: androidx.activity.OnBackPressedDispatcher = androidx.activity.OnBackPressedDispatcher()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.disposables.SerialDisposable,
		param1: androidx.activity.OnBackPressedDispatcher
	) {
		for (iAb in 0..2) {
			val local_var_3_0: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
			local_var_3_0.throwIfCanceled()

			for (iAc in 0..2) {
				val local_var_4_0: androidx.lifecycle.ViewModelStore = androidx.lifecycle.ViewModelStore()
				local_var_4_0.clear()

				val local_var_4_1: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
				local_var_4_1.isCanceled()

				local_var_4_0.clear()

				val local_var_4_2: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
				local_var_4_2.postValue(kotlin.Any())

			}
		}
		val local_var_2_2: androidx.collection.LruCache<kotlin.Any,kotlin.Any> = androidx.collection.LruCache(48)
		local_var_2_2.trimToSize(7)

		param0.dispose()

	}

	fun method1(
		param0: androidx.activity.OnBackPressedDispatcher
	) {
		val local_var_2_1: androidx.lifecycle.MutableLiveData<kotlin.Any> = androidx.lifecycle.MutableLiveData()
		local_var_2_1.postValue(kotlin.Any())

		val local_var_2_2: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_2.throwIfCanceled()

		val local_var_2_3: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_3.cancel()

		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.getCancellationSignalObject()

	}

	fun method2(
		param0: androidx.activity.OnBackPressedDispatcher,
		param1: androidx.activity.OnBackPressedDispatcher
	) {
		param0.onBackPressed()

		param0.onBackPressed()

	}

	fun method3(
		param0: androidx.activity.OnBackPressedDispatcher
	) {
		param0.hasEnabledCallbacks()

		param0.hasEnabledCallbacks()

	}
}
