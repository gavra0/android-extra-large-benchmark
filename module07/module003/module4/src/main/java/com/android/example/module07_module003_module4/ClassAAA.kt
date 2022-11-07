package com.android.example.module07_module003_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module16_module033_module1.ClassAAIJava = com.android.example.module16_module033_module1.ClassAAIJava()
	private 	val instance_var_1_1: com.android.example.module07_module608_module1_module1.ClassAAC = com.android.example.module07_module608_module1_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module07_module608_module1_module1.ClassAAN,
		param1: com.android.example.module07_module608_module1_module1.ClassAAG,
		param2: com.android.example.module16_module033_module1.ClassAAA
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

		}
		for (iAb in 0..5) {
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeFixed32(19)

		}
		param0.method2(com.android.example.module07_module608_module2_module1.ClassAAC())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		param0.method1(com.android.example.module07_module608_module2_module1.ClassAAA(), com.android.example.module07_module608_module2_module1.ClassAAC(), com.android.example.module07_module608_module2_module1.ClassAAB())

	}

	fun method1(
		param0: com.android.example.module07_module608_module1_module1.ClassAAE,
		param1: com.android.example.module07_module608_module2_module1.ClassAAA,
		param2: com.android.example.module07_module608_module2_module1.ClassAAB,
		param3: com.android.example.module07_module608_module2_module1.ClassAAB
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(-2018072438915256434)

		val local_var_2_5: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_5.writeVarint64(-5929389402961204539)

		val local_var_2_6: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_6.writeFixed32(72)

	}

	fun method2(
		param0: com.android.example.module07_module608_module2_module1.ClassAAB,
		param1: com.android.example.module07_module608_module2_module1.ClassAAA,
		param2: com.android.example.module07_module608_module1_module1.ClassAAM,
		param3: com.android.example.module16_module033_module1.ClassAAWJava
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

	}

	fun method3(
		param0: com.android.example.module16_module033_module1.ClassAATJava,
		param1: com.android.example.module07_module608_module2_module1.ClassAAC,
		param2: com.android.example.module07_module608_module1_module1.ClassAAO,
		param3: com.android.example.module07_module608_module2_module1.ClassAAB
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method4(
		param0: com.android.example.module07_module608_module2_module1.ClassAAA,
		param1: com.android.example.module07_module608_module1_module1.ClassABC,
		param2: com.android.example.module07_module608_module2_module1.ClassAAB,
		param3: com.android.example.module07_module608_module2_module1.ClassAAA
	) {
		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeFixed32(47)

		val local_var_2_5: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_5.timeoutNanos()

		val local_var_2_6: androidx.lifecycle.MethodCallsLogger = androidx.lifecycle.MethodCallsLogger()
		local_var_2_6.approveCall("SomeString", 27)

		val local_var_2_7: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_7.writeString("SomeString")

		val local_var_2_8: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_8.writeVarint64(-2790304307517101467)

	}
}
