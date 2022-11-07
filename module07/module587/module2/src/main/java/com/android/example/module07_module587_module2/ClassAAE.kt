package com.android.example.module07_module587_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.schedulers.TestScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module07_module562_module10.ClassAAA = com.android.example.module07_module562_module10.ClassAAA()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString")

		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..6) {
				val local_var_4_0: com.android.example.module07_module196_module1.ClassAAAJava = com.android.example.module07_module196_module1.ClassAAAJava()
				local_var_4_0.method1("SomeString", "SomeString")

			}
		} else {
			val local_var_3_0: com.android.example.module07_module562_module10.ClassAACJava = com.android.example.module07_module562_module10.ClassAACJava()
			local_var_3_0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		}
		param0.createWorker()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module07_module594_module3.ClassAAGJava = com.android.example.module07_module594_module3.ClassAAGJava()
		local_var_2_1.method1("SomeString")

		val local_var_2_2: com.android.example.module07_module196_module1.ClassAADJava = com.android.example.module07_module196_module1.ClassAADJava()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.onError(kotlin.Throwable())

		param0.requestMore(-1003635250236354266)

		val local_var_2_1: com.android.example.module07_module594_module3.ClassAAE = com.android.example.module07_module594_module3.ClassAAE()
		local_var_2_1.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module07_module196_module1.ClassAABJava = com.android.example.module07_module196_module1.ClassAABJava()
		local_var_2_2.method2("SomeString", "SomeString", "SomeString", "SomeString")

		param0.dispose()

	}
}
