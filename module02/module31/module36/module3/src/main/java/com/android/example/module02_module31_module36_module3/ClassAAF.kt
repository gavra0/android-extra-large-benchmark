package com.android.example.module02_module31_module36_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.squareup.sqldelight.logs.StatementParameterInterceptor = com.squareup.sqldelight.logs.StatementParameterInterceptor()
	private 	val instance_var_1_1: com.squareup.sqldelight.logs.StatementParameterInterceptor = com.squareup.sqldelight.logs.StatementParameterInterceptor()
	private 	val instance_var_1_2: com.squareup.sqldelight.logs.StatementParameterInterceptor = com.squareup.sqldelight.logs.StatementParameterInterceptor()

	fun method0(
		param0: com.squareup.sqldelight.logs.StatementParameterInterceptor,
		param1: com.squareup.sqldelight.logs.StatementParameterInterceptor
	) {
		val local_var_2_2: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_2.appendLiteral("SomeString")

		for (iAb in 0..5) {
			for (iAc in 0..0) {
				val local_var_4_0: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
				local_var_4_0.toFormatter(java.util.Locale("SomeString"))

				local_var_4_0.parseLenient()

				val local_var_4_1: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
				local_var_4_1.appendLiteral('C')

				local_var_4_0.parseLenient()

			}
			val local_var_3_0: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
			local_var_3_0.toFormatter()

			val local_var_3_1: org.threeten.bp.zone.TzdbZoneRulesProvider = org.threeten.bp.zone.TzdbZoneRulesProvider()
			local_var_3_1.toString()

		}
		param0.bindString(64, "SomeString")

		val local_var_2_3: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_3.parseCaseSensitive()

	}

	fun method1(
		param0: com.squareup.sqldelight.logs.StatementParameterInterceptor,
		param1: com.squareup.sqldelight.logs.StatementParameterInterceptor,
		param2: com.squareup.sqldelight.logs.StatementParameterInterceptor
	) {
		param0.bindDouble(35, 0.32084686)

		val local_var_2_3: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_3.parseStrict()

		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendOffsetId()

		param0.bindDouble(86, 0.124094546)

	}

	fun method2(
		param0: com.squareup.sqldelight.logs.StatementParameterInterceptor,
		param1: com.squareup.sqldelight.logs.StatementParameterInterceptor
	) {
		val local_var_2_2: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_2.appendOffsetId()

		val local_var_2_3: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_3.appendZoneRegionId()

		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendZoneOrOffsetId()

		val local_var_2_5: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_5.appendInstant()

	}

	fun method3(
		param0: com.squareup.sqldelight.logs.StatementParameterInterceptor,
		param1: com.squareup.sqldelight.logs.StatementParameterInterceptor,
		param2: com.squareup.sqldelight.logs.StatementParameterInterceptor,
		param3: com.squareup.sqldelight.logs.StatementParameterInterceptor
	) {
		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendZoneId()

		val local_var_2_5: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_5.toFormatter(java.util.Locale("SomeString"))

		val local_var_2_6: org.threeten.bp.zone.TzdbZoneRulesProvider = org.threeten.bp.zone.TzdbZoneRulesProvider()
		local_var_2_6.toString()

		param0.bindDouble(36, 0.49168926)

		param0.bindDouble(98, 0.6599435)

	}
}
