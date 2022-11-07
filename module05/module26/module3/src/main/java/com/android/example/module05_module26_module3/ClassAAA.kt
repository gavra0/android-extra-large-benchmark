package com.android.example.module05_module26_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module05_module26_module5.ClassAAA = com.android.example.module05_module26_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module05_module26_module5.ClassAAB = com.android.example.module05_module26_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module07_module194_module1.ClassAAC,
		param1: com.android.example.module05_module26_module5.ClassAAB,
		param2: com.android.example.module07_module194_module1.ClassAAAJava
	) {
		for (iAb in 0..2) {
			listOf("1", "2", "3").forEach {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.request(-7996140060364345818)

				} else {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.hasSubscription()

				}
				param0.method0("SomeString", "SomeString")

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

		}
	}

	fun method1(
		param0: com.android.example.module05_module26_module5.ClassAAB
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onComplete()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}
}
