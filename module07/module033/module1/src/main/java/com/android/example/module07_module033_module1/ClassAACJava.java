package com.android.example.module07_module033_module1;

public class ClassAACJava {
	private 	com.android.example.module07_module592_module3.ClassAAB instance_var_1_0 = new com.android.example.module07_module592_module3.ClassAAB();
	private 	com.android.example.module07_module592_module3.ClassAAKJava instance_var_1_1 = new com.android.example.module07_module592_module3.ClassAAKJava();
	private 	com.android.example.module07_module592_module3.ClassAAHJava instance_var_1_2 = new com.android.example.module07_module592_module3.ClassAAHJava();
	private 	com.android.example.module07_module592_module3.ClassAAAJava instance_var_1_3 = new com.android.example.module07_module592_module3.ClassAAAJava();

	public void method0(
		com.android.example.module07_module592_module3.ClassAAB param0,
		com.android.example.module07_module592_module3.ClassAAGJava param1,
		com.android.example.module07_module592_module3.ClassAAB param2,
		com.android.example.module07_module592_module3.ClassAAC param3) throws Throwable {
		androidx.core.os.CancellationSignal local_var_2_4 = new androidx.core.os.CancellationSignal();
		local_var_2_4.cancel();

		androidx.lifecycle.MethodCallsLogger local_var_2_5 = new androidx.lifecycle.MethodCallsLogger();
		local_var_2_5.approveCall("SomeString", 84);

	}

	public void method1(
		com.android.example.module07_module592_module3.ClassAAJ param0,
		com.android.example.module07_module592_module3.ClassAAHJava param1,
		com.android.example.module07_module592_module3.ClassAAJ param2) throws Throwable {
		for (int iAb = 0; iAb < 1; iAb++) {
			param0.method1("SomeString", "SomeString");

			param0.method0("SomeString", "SomeString", "SomeString");

			param0.method1("SomeString", "SomeString");

			androidx.lifecycle.MethodCallsLogger local_var_3_0 = new androidx.lifecycle.MethodCallsLogger();
			local_var_3_0.approveCall("SomeString", 89);

		}
		param0.method0("SomeString", "SomeString", "SomeString");

		androidx.core.os.CancellationSignal local_var_2_3 = new androidx.core.os.CancellationSignal();
		local_var_2_3.cancel();

		androidx.lifecycle.MethodCallsLogger local_var_2_4 = new androidx.lifecycle.MethodCallsLogger();
		local_var_2_4.approveCall("SomeString", 88);

	}
}
