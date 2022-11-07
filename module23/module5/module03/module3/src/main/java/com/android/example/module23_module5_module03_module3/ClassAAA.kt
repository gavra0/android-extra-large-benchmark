package com.android.example.module23_module5_module03_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeString("SomeString")

		val local_var_2_5: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_5.writeVarint32(4)

		for (iAb in 0..5) {
			val local_var_3_0: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
			local_var_3_0.writeFixed32(64)

			local_var_3_0.writeFixed32(93)

		}
		param0.onComplete()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.disposables.SerialDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: okio.Pipe = okio.Pipe(3984281123263082815)
		local_var_2_3.cancel()

		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeFixed32(53)

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_1.writeFixed32(64)

	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.internal.disposables.ListCompositeDisposable
	) {
		val local_var_2_3: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_3.writeFixed64(-1964590815444332039)

	}

	fun method4(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.schedulers.TestScheduler,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		param0.assertSubscribed()

		val local_var_2_4: com.squareup.wire.ReverseProtoWriter = com.squareup.wire.ReverseProtoWriter()
		local_var_2_4.writeString("SomeString")

	}
}
