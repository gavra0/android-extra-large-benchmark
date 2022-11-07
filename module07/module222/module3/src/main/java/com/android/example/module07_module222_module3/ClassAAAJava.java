package com.android.example.module07_module222_module3;

public class ClassAAAJava {
	private 	com.android.example.module07_module222_module2.ClassAAB instance_var_1_0 = new com.android.example.module07_module222_module2.ClassAAB();
	private 	com.android.example.module07_module222_module2.ClassAAC instance_var_1_1 = new com.android.example.module07_module222_module2.ClassAAC();

	public void method0(
		com.android.example.module07_module222_module2.ClassAAB param0,
		com.android.example.module07_module222_module2.ClassAAB param1,
		com.android.example.module07_module222_module2.ClassAAC param2) throws Throwable {
		for (int iAb = 0; iAb < 3; iAb++) {
			org.threeten.bp.format.DateTimeFormatterBuilder local_var_3_0 = new org.threeten.bp.format.DateTimeFormatterBuilder();
			local_var_3_0.appendZoneId();

			org.threeten.bp.format.DateTimeFormatterBuilder local_var_3_1 = new org.threeten.bp.format.DateTimeFormatterBuilder();
			local_var_3_1.parseLenient();

			local_var_3_0.toFormatter(new java.util.Locale("SomeString"));

			org.threeten.bp.format.DateTimeFormatterBuilder local_var_3_2 = new org.threeten.bp.format.DateTimeFormatterBuilder();
			local_var_3_2.padNext(20);

		}
		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_3 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_3.appendLiteral('C');

		org.threeten.bp.zone.TzdbZoneRulesProvider local_var_2_4 = new org.threeten.bp.zone.TzdbZoneRulesProvider();
		local_var_2_4.toString();

		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_5 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_5.appendPattern("SomeString");

	}

	public void method1(
		com.android.example.module07_module222_module2.ClassAAC param0) throws Throwable {
		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_1 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_1.optionalStart();

		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_2 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_2.toFormatter();

		param0.method1("SomeString", "SomeString", "SomeString");

		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_3 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_3.padNext(54, 'C');

	}
}
