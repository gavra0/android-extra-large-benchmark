package com.android.example.module07_module488_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module594_module3.ClassAAP = com.android.example.module07_module594_module3.ClassAAP()
	private 	val instance_var_1_1: com.android.example.module07_module594_module3.ClassAANJava = com.android.example.module07_module594_module3.ClassAANJava()
	private 	val instance_var_1_2: com.android.example.module07_module594_module3.ClassAAC = com.android.example.module07_module594_module3.ClassAAC()

	fun method0(
		param0: com.android.example.module07_module594_module3.ClassAAKJava,
		param1: com.android.example.module07_module594_module3.ClassAAV,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..3) {
				val local_var_4_0: com.android.example.module07_module594_module3.ClassAAU = com.android.example.module07_module594_module3.ClassAAU()
				local_var_4_0.method0("SomeString", "SomeString")

				local_var_4_0.method1("SomeString", "SomeString", "SomeString", "SomeString")

			}
		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(4409301404535787521)

	}

	fun method1(
		param0: io.reactivex.observers.TestObserver<kotlin.Any>,
		param1: com.android.example.module07_module594_module3.ClassAAMJava,
		param2: com.android.example.module07_module594_module3.ClassAAZ
	) {
		param0.isCancelled()

	}
}
