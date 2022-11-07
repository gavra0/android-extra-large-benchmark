package com.android.example.module07_module583_module1;

public class ClassAAHJava {
	private 	org.junit.runner.JUnitCore instance_var_1_0 = new org.junit.runner.JUnitCore();
	private 	androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder instance_var_1_1 = new androidx.test.espresso.core.internal.deps.guava.util.concurrent.ThreadFactoryBuilder();

	public void method0(
		org.hamcrest.StringDescription param0,
		junit.framework.TestResult param1,
		androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory param2,
		org.hamcrest.core.IsSame<Object> param3) throws Throwable {
		com.android.example.module07_module196_module1.ClassAAFJava local_var_2_4 = new com.android.example.module07_module196_module1.ClassAAFJava();
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString");

		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				java.util.Collections.emptyList().forEach( lambda1 -> {
					try {
						com.android.example.module07_module594_module3.ClassAAMJava local_var_4_0 = new com.android.example.module07_module594_module3.ClassAAMJava();
						local_var_4_0.method0("SomeString", "SomeString", "SomeString", "SomeString");

					} catch(Throwable e) { } // ignore
				});
			} catch(Throwable e) { } // ignore
		});
	}

	public void method1(
		org.junit.runner.JUnitCore param0,
		androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory param1,
		androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory param2,
		org.junit.runner.JUnitCore param3) throws Throwable {
		param0.addListener(new org.junit.runner.notification.RunListener());

		com.android.example.module07_module092_module1.ClassAAD local_var_2_4 = new com.android.example.module07_module092_module1.ClassAAD();
		local_var_2_4.method1("SomeString");

	}

	public void method2(
		org.junit.runner.JUnitCore param0,
		androidx.test.espresso.base.BaseLayerModule_ProvideRemoteExecutorFactory param1) throws Throwable {
		com.android.example.module07_module092_module1.ClassAAC local_var_2_2 = new com.android.example.module07_module092_module1.ClassAAC();
		local_var_2_2.method0("SomeString", "SomeString", "SomeString");

		com.android.example.module07_module594_module3.ClassAAC local_var_2_3 = new com.android.example.module07_module594_module3.ClassAAC();
		local_var_2_3.method0("SomeString", "SomeString", "SomeString");

		param0.removeListener(new org.junit.runner.notification.RunListener());

	}
}
