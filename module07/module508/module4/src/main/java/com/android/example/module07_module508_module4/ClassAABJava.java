package com.android.example.module07_module508_module4;

public class ClassAABJava {
	private 	com.android.example.module07_module508_module3.ClassAAB instance_var_1_0 = new com.android.example.module07_module508_module3.ClassAAB();
	private 	com.android.example.module07_module508_module3.ClassAAJ instance_var_1_1 = new com.android.example.module07_module508_module3.ClassAAJ();
	private 	com.android.example.module07_module508_module3.ClassAAD instance_var_1_2 = new com.android.example.module07_module508_module3.ClassAAD();

	public void method0(
		com.android.example.module07_module508_module3.ClassAAJ param0,
		com.android.example.module07_module508_module3.ClassAAA param1,
		com.android.example.module07_module508_module3.ClassAAC param2,
		com.android.example.module07_module508_module3.ClassAAJ param3) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			com.google.common.truth.ExpectFailure local_var_3_0 = new com.google.common.truth.ExpectFailure();
			local_var_3_0.whenTesting();

		} else {
			for (int iAb = 0; iAb < 6; iAb++) {
				org.hamcrest.core.IsAnything<Object> local_var_4_0 = new org.hamcrest.core.IsAnything();
				local_var_4_0.matches(new java.lang.Object());

			}
		}
		org.junit.rules.TemporaryFolder local_var_2_4 = new org.junit.rules.TemporaryFolder();
		local_var_2_4.create();

		param0.method1("SomeString");

	}

	public void method1(
		com.android.example.module07_module508_module3.ClassAAB param0,
		com.android.example.module07_module508_module3.ClassAAJ param1,
		com.android.example.module07_module508_module3.ClassAAK param2) throws Throwable {
		org.junit.rules.TemporaryFolder local_var_2_3 = new org.junit.rules.TemporaryFolder();
		local_var_2_3.delete();

		param0.method1("SomeString", "SomeString");

		param0.method1("SomeString", "SomeString");

	}
}
