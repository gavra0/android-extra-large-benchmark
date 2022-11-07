package com.android.example.module07_module567_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_3.appendOffset("SomeString", "SomeString")

		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendChronologyId()

		val local_var_2_5: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_5.appendZoneId()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_1.parseLenient()

		val local_var_2_2: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_2.appendLiteral('C')

		val local_var_2_3: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_3.appendPattern("SomeString")

		param0.assertSubscribed()

		param0.assertSubscribed()

	}
}
