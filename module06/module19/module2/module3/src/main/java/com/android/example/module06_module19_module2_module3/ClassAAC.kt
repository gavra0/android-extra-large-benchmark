package com.android.example.module06_module19_module2_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module07_module503_module1.ClassAAA = com.android.example.module07_module503_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module16_module033_module1.ClassAAHJava = com.android.example.module16_module033_module1.ClassAAHJava()
	private 	val instance_var_1_2: com.android.example.module07_module608_module2_module1.ClassAAA = com.android.example.module07_module608_module2_module1.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module16_module033_module1.ClassAATJava = com.android.example.module16_module033_module1.ClassAATJava()

	fun method0(
		param0: com.android.example.module07_module503_module1.ClassAAA
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..1) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.onComplete()

				}
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

				local_var_4_0.dispose()

			}
		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
		param0.method1("SomeString")

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_1: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_1.writeFixed64(7886397650534267195)

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method1(
		param0: com.android.example.module07_module608_module2_module1.ClassAAA
	) {
		val local_var_2_1: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_1.approveCall("SomeString", 24)

	}

	fun method2(
		param0: com.android.example.module07_module608_module1_module1.ClassAAS,
		param1: com.android.example.module07_module608_module1_module1.ClassABB
	) {
		param0.method1(com.android.example.module07_module608_module2_module1.ClassAAB())

		val local_var_2_2: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_2.approveCall("SomeString", 1)

		param0.method1(com.android.example.module07_module608_module2_module1.ClassAAB())

		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeFixed32(32)

		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeString("SomeString")

	}

	fun method3(
		param0: com.android.example.module16_module033_module1.ClassAAPJava
	) {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method0("SomeString", "SomeString")

	}

	fun method4(
		param0: com.android.example.module07_module503_module1.ClassAAA,
		param1: com.android.example.module07_module503_module1.ClassAAA
	) {
		val local_var_2_2: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_2.writeFixed64(1244947523373127910)

	}
}
