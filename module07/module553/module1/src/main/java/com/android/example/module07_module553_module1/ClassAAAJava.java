package com.android.example.module07_module553_module1;

public class ClassAAAJava {
	private 	com.android.example.module07_module552_module3.ClassAAA instance_var_1_0 = new com.android.example.module07_module552_module3.ClassAAA();
	private 	com.android.example.module07_module552_module3.ClassAAA instance_var_1_1 = new com.android.example.module07_module552_module3.ClassAAA();
	private 	com.android.example.module07_module552_module3.ClassAAA instance_var_1_2 = new com.android.example.module07_module552_module3.ClassAAA();
	private 	com.android.example.module07_module552_module3.ClassAAB instance_var_1_3 = new com.android.example.module07_module552_module3.ClassAAB();
	private 	com.android.example.module07_module552_module3.ClassAAB instance_var_1_4 = new com.android.example.module07_module552_module3.ClassAAB();

	public void method0(
		com.android.example.module07_module552_module3.ClassAAB param0,
		com.android.example.module07_module552_module3.ClassAAB param1,
		com.android.example.module07_module552_module3.ClassAAA param2) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.method0("SomeString");

				androidx.core.os.CancellationSignal local_var_3_0 = new androidx.core.os.CancellationSignal();
				local_var_3_0.getCancellationSignalObject();

			} catch(Throwable e) { } // ignore
		});
		param0.method1("SomeString", "SomeString", "SomeString");

	}

	public void method1(
		com.android.example.module07_module552_module3.ClassAAA param0) throws Throwable {
		androidx.arch.core.internal.FastSafeIterableMap<Object,Object> local_var_2_1 = new androidx.arch.core.internal.FastSafeIterableMap();
		local_var_2_1.putIfAbsent(new java.lang.Object(), new java.lang.Object());

		param0.method3("SomeString", "SomeString", "SomeString");

		androidx.core.os.CancellationSignal local_var_2_2 = new androidx.core.os.CancellationSignal();
		local_var_2_2.cancel();

		androidx.core.os.CancellationSignal local_var_2_3 = new androidx.core.os.CancellationSignal();
		local_var_2_3.throwIfCanceled();

	}

	public void method2(
		com.android.example.module07_module552_module3.ClassAAB param0,
		com.android.example.module07_module552_module3.ClassAAA param1,
		com.android.example.module07_module552_module3.ClassAAB param2) throws Throwable {
		param0.method3("SomeString", "SomeString");

		androidx.core.os.CancellationSignal local_var_2_3 = new androidx.core.os.CancellationSignal();
		local_var_2_3.throwIfCanceled();

		androidx.core.util.AtomicFile local_var_2_4 = new androidx.core.util.AtomicFile(new java.io.File("SomeString"));
		local_var_2_4.delete();

		androidx.core.os.CancellationSignal local_var_2_5 = new androidx.core.os.CancellationSignal();
		local_var_2_5.getCancellationSignalObject();

	}

	public void method3(
		com.android.example.module07_module552_module3.ClassAAA param0,
		com.android.example.module07_module552_module3.ClassAAA param1,
		com.android.example.module07_module552_module3.ClassAAB param2) throws Throwable {
		androidx.core.os.CancellationSignal local_var_2_3 = new androidx.core.os.CancellationSignal();
		local_var_2_3.isCanceled();

		androidx.core.util.AtomicFile local_var_2_4 = new androidx.core.util.AtomicFile(new java.io.File("SomeString"));
		local_var_2_4.readFully();

	}

	public void method4(
		com.android.example.module07_module552_module3.ClassAAA param0,
		com.android.example.module07_module552_module3.ClassAAB param1,
		com.android.example.module07_module552_module3.ClassAAB param2) throws Throwable {
		androidx.lifecycle.MethodCallsLogger local_var_2_3 = new androidx.lifecycle.MethodCallsLogger();
		local_var_2_3.approveCall("SomeString", 65);

		param0.method4("SomeString", "SomeString");

		androidx.arch.core.internal.SafeIterableMap<Object,Object> local_var_2_4 = new androidx.arch.core.internal.SafeIterableMap();
		local_var_2_4.descendingIterator();

		param0.method3("SomeString", "SomeString", "SomeString");

		androidx.core.os.CancellationSignal local_var_2_5 = new androidx.core.os.CancellationSignal();
		local_var_2_5.cancel();

	}
}
