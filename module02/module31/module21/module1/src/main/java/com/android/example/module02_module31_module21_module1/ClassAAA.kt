package com.android.example.module02_module31_module21_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendPattern("SomeString")

		val local_var_2_5: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_5.appendChronologyId()

		for (iAb in 0..5) {
			val local_var_3_0: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
			local_var_3_0.parseCaseSensitive()

		}
		val local_var_2_6: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_6.toFormatter(java.util.Locale("SomeString"))

		val local_var_2_7: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_7.padNext(60, 'C')

	}

	fun method1(
		param0: String,
		param1: String
	) {
		val local_var_2_2: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_2.appendZoneRegionId()

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: org.threeten.bp.format.DateTimeFormatterBuilder = org.threeten.bp.format.DateTimeFormatterBuilder()
		local_var_2_4.appendZoneOrOffsetId()

		local_var_2_4.appendInstant()

	}
}
