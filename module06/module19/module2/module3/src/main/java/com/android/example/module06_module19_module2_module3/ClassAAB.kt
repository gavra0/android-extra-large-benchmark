package com.android.example.module06_module19_module2_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module16_module033_module1.ClassAATJava = com.android.example.module16_module033_module1.ClassAATJava()
	private 	val instance_var_1_1: com.android.example.module07_module608_module1_module1.ClassAAW = com.android.example.module07_module608_module1_module1.ClassAAW()
	private 	val instance_var_1_2: com.android.example.module07_module608_module1_module1.ClassAAQ = com.android.example.module07_module608_module1_module1.ClassAAQ()

	fun method0(
		param0: com.android.example.module07_module503_module1.ClassAAA,
		param1: com.android.example.module07_module503_module1.ClassAAA,
		param2: com.android.example.module07_module608_module2_module1.ClassAAB,
		param3: com.android.example.module07_module608_module1_module1.ClassAAH
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeString("SomeString")

		}
		for (iAb in 0..5) {
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeVarint32(81)

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onNext(kotlin.Any())

		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.dispose()

		val local_var_2_6: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_6.approveCall("SomeString", 14)

	}

	fun method1(
		param0: com.android.example.module07_module608_module2_module1.ClassAAB,
		param1: com.android.example.module07_module608_module2_module1.ClassAAB,
		param2: com.android.example.module07_module608_module2_module1.ClassAAB
	) {
		param0.method0(com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

	}
}
