package com.android.example.module07_module413_module2;

public class ClassAAAJava {
	private 	com.android.example.module07_module413_module3.ClassAAFJava instance_var_1_0 = new com.android.example.module07_module413_module3.ClassAAFJava();
	private 	com.android.example.module07_module413_module3.ClassAAFJava instance_var_1_1 = new com.android.example.module07_module413_module3.ClassAAFJava();
	private 	com.android.example.module07_module413_module3.ClassAABJava instance_var_1_2 = new com.android.example.module07_module413_module3.ClassAABJava();

	public void method0(
		com.android.example.module07_module413_module3.ClassAABJava param0) throws Throwable {
		junit.framework.TestResult local_var_2_1 = new junit.framework.TestResult();
		local_var_2_1.failures();

	}

	public void method1(
		com.android.example.module07_module413_module3.ClassAACJava param0,
		com.android.example.module07_module413_module3.ClassAAA param1,
		com.android.example.module07_module413_module3.ClassAAAJava param2,
		com.android.example.module07_module413_module3.ClassAACJava param3) throws Throwable {
		for (int iAb = 0; iAb < 1; iAb++) {
			junit.extensions.ActiveTestSuite local_var_3_0 = new junit.extensions.ActiveTestSuite();
			local_var_3_0.run(new junit.framework.TestResult());

			local_var_3_0.runFinished();

			junit.framework.TestResult local_var_3_1 = new junit.framework.TestResult();
			local_var_3_1.wasSuccessful();

			junit.framework.TestResult local_var_3_2 = new junit.framework.TestResult();
			local_var_3_2.wasSuccessful();

		}
		org.junit.rules.TemporaryFolder local_var_2_4 = new org.junit.rules.TemporaryFolder();
		local_var_2_4.create();

		androidx.test.espresso.core.internal.deps.guava.util.concurrent.ExecutionList local_var_2_5 = new androidx.test.espresso.core.internal.deps.guava.util.concurrent.ExecutionList();
		local_var_2_5.execute();

		junit.framework.TestResult local_var_2_6 = new junit.framework.TestResult();
		local_var_2_6.wasSuccessful();

		param0.method0("SomeString", "SomeString", "SomeString");

	}

	public void method2(
		com.android.example.module07_module413_module3.ClassAAAJava param0,
		com.android.example.module07_module413_module3.ClassAAA param1,
		com.android.example.module07_module413_module3.ClassAAFJava param2,
		com.android.example.module07_module413_module3.ClassAAFJava param3) throws Throwable {
		org.hamcrest.internal.ArrayIterator local_var_2_4 = new org.hamcrest.internal.ArrayIterator(new java.lang.Object());
		local_var_2_4.remove();

		androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder local_var_2_5 = new androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder();
		local_var_2_5.setNameFormat("SomeString");

		param0.method2("SomeString", "SomeString", "SomeString");

		param0.method2("SomeString", "SomeString", "SomeString");

	}
}
