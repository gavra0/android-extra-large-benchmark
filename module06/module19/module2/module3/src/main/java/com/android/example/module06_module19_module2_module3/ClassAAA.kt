package com.android.example.module06_module19_module2_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module16_module033_module1.ClassAAEJava = com.android.example.module16_module033_module1.ClassAAEJava()
	private 	val instance_var_1_1: com.android.example.module16_module033_module1.ClassAATJava = com.android.example.module16_module033_module1.ClassAATJava()
	private 	val instance_var_1_2: com.android.example.module16_module033_module1.ClassAAAJava = com.android.example.module16_module033_module1.ClassAAAJava()

	fun method0(
		param0: com.android.example.module07_module503_module1.ClassAAA,
		param1: com.android.example.module07_module608_module2_module1.ClassAAB
	) {
		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
					local_var_5_0.writeVarint64(6049151464592374753)

				}
			}
		}
		val local_var_2_2: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_2.writeVarint64(696849943321141302)

		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.start()

		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeString("SomeString")

		val local_var_2_5: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_5.writeVarint32(61)

	}

	fun method1(
		param0: com.android.example.module07_module608_module1_module1.ClassAAW,
		param1: com.android.example.module07_module608_module2_module1.ClassAAA,
		param2: com.android.example.module07_module503_module1.ClassAAA
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module07_module503_module1.ClassAAA,
		param1: com.android.example.module07_module503_module1.ClassAAA,
		param2: com.android.example.module07_module608_module1_module1.ClassAAF
	) {
		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeVarint32(56)

		val local_var_2_4: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_4.approveCall("SomeString", 28)

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
