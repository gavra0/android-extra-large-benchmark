package com.android.example.module06_module19_module2_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module07_module503_module1.ClassAAA = com.android.example.module07_module503_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module608_module1_module1.ClassAAV = com.android.example.module07_module608_module1_module1.ClassAAV()
	private 	val instance_var_1_2: com.android.example.module07_module608_module1_module1.ClassAAL = com.android.example.module07_module608_module1_module1.ClassAAL()

	fun method0(
		param0: com.android.example.module07_module608_module1_module1.ClassAACJava,
		param1: com.android.example.module07_module608_module1_module1.ClassAAH,
		param2: com.android.example.module07_module608_module2_module1.ClassAAA
	) {
		for (iAb in 0..1) {
			for (iAc in 0..0) {
				for (iAd in 0..1) {
					val local_var_5_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
					local_var_5_0.createWorker()

				}
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onError(kotlin.Throwable())

				local_var_4_0.cancel()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.onNext(kotlin.Any())

			}
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeVarint32(8)

		}
	}

	fun method1(
		param0: com.android.example.module07_module608_module2_module1.ClassAAA,
		param1: com.android.example.module07_module503_module1.ClassAAA,
		param2: com.android.example.module07_module503_module1.ClassAAA,
		param3: com.android.example.module07_module503_module1.ClassAAA
	) {
		param0.method3(com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

		param0.method2(com.squareup.workflow1.WorkflowOutput(kotlin.Any()))

	}

	fun method2(
		param0: com.android.example.module07_module608_module2_module1.ClassAAA,
		param1: com.android.example.module16_module033_module1.ClassAAHJava,
		param2: com.android.example.module07_module608_module1_module1.ClassAAA
	) {
		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeString("SomeString")

	}

	fun method3(
		param0: com.android.example.module07_module608_module1_module1.ClassAAK,
		param1: com.android.example.module07_module608_module2_module1.ClassAAA
	) {
		param0.method0(com.android.example.module07_module608_module2_module1.ClassAAA(), com.android.example.module07_module608_module2_module1.ClassAAA(), com.android.example.module07_module608_module2_module1.ClassAAC(), com.android.example.module07_module608_module2_module1.ClassAAB())

		param0.method2(com.android.example.module07_module608_module2_module1.ClassAAC(), com.android.example.module07_module608_module2_module1.ClassAAB())

		param0.method3(com.android.example.module07_module608_module2_module1.ClassAAC())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_3.approveCall("SomeString", 68)

	}

	fun method4(
		param0: com.android.example.module07_module608_module1_module1.ClassAAB
	) {
		val local_var_2_1: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_1.writeVarint64(-8983863020349618649)

		val local_var_2_2: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_2.writeFixed32(10)

		param0.method2(com.android.example.module07_module608_module2_module1.ClassAAC())

	}
}
