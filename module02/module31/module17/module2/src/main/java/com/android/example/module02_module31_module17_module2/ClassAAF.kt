package com.android.example.module02_module31_module17_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module07_module567_module4.ClassAAE = com.android.example.module07_module567_module4.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module07_module567_module4.ClassAAA = com.android.example.module07_module567_module4.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module567_module4.ClassAAE = com.android.example.module07_module567_module4.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module567_module4.ClassAAE
	) {
		for (iAb in 0..4) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
				local_var_4_0.toFormatter(java.util.Locale("SomeString"))

				local_var_4_0.appendChronologyId()

			}
			val local_var_3_0: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
			local_var_3_0.toFormatter()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.assertSubscribed()

			val local_var_3_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_2.dispose()

		}
		val local_var_2_1: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_1.appendInstant()

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.dispose()

	}

	fun method1(
		param0: com.android.example.module07_module567_module4.ClassAAC,
		param1: com.android.example.module07_module567_module4.ClassAAF,
		param2: com.android.example.module07_module567_module4.ClassAAD,
		param3: com.android.example.module07_module567_module4.ClassAAE
	) {
		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendZoneOrOffsetId()

		val local_var_2_5: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_5.appendZoneRegionId()

		val local_var_2_6: org.threeten.bp.zone.TzdbZoneRulesProvider = org.threeten.bp.zone.TzdbZoneRulesProvider()
		local_var_2_6.toString()

	}

	fun method2(
		param0: com.android.example.module07_module567_module4.ClassAAD,
		param1: com.android.example.module07_module567_module4.ClassAAA
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module07_module567_module4.ClassAAD
	) {
		param0.method0(io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_1.optionalEnd()

		val local_var_2_2: org.threeten.bp.zone.TzdbZoneRulesProvider = org.threeten.bp.zone.TzdbZoneRulesProvider()
		local_var_2_2.toString()

	}
}
