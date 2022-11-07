package com.android.example.module07_module358_module1;

public class ClassAADJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.schedulers.TestScheduler instance_var_1_1 = new io.reactivex.schedulers.TestScheduler();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_4 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.disposables.SerialDisposable param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				for (int iAb = 0; iAb < 2; iAb++) {
					param0.cancel();

					param0.assertSubscribed();

				}
				com.android.example.module07_module594_module3.ClassAANJava local_var_3_0 = new com.android.example.module07_module594_module3.ClassAANJava();
				local_var_3_0.method2("SomeString", "SomeString", "SomeString");

			} catch(Throwable e) { } // ignore
		});
		com.android.example.module07_module587_module2.ClassAAE local_var_2_4 = new com.android.example.module07_module587_module2.ClassAAE();
		local_var_2_4.method1(new io.reactivex.subscribers.TestSubscriber());

		com.android.example.module07_module587_module2.ClassAAG local_var_2_5 = new com.android.example.module07_module587_module2.ClassAAG();
		local_var_2_5.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.subscribers.TestSubscriber());

		param0.onComplete();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		com.android.example.module07_module488_module1.ClassAAD local_var_2_2 = new com.android.example.module07_module488_module1.ClassAAD();
		local_var_2_2.method0(new io.reactivex.internal.disposables.ListCompositeDisposable());

		com.android.example.module07_module562_module10.ClassAAEJava local_var_2_3 = new com.android.example.module07_module562_module10.ClassAAEJava();
		local_var_2_3.method2("SomeString", "SomeString", "SomeString", "SomeString");

		com.android.example.module07_module562_module10.ClassAAA local_var_2_4 = new com.android.example.module07_module562_module10.ClassAAA();
		local_var_2_4.method1("SomeString", "SomeString", "SomeString");

		com.android.example.module07_module594_module3.ClassAAP local_var_2_5 = new com.android.example.module07_module594_module3.ClassAAP();
		local_var_2_5.method4("SomeString", "SomeString");

		com.android.example.module07_module488_module1.ClassAAG local_var_2_6 = new com.android.example.module07_module488_module1.ClassAAG();
		local_var_2_6.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.disposables.ListCompositeDisposable());

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		com.android.example.module07_module587_module2.ClassAAK local_var_2_3 = new com.android.example.module07_module587_module2.ClassAAK();
		local_var_2_3.method2(new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.internal.disposables.ListCompositeDisposable());

		com.android.example.module07_module488_module1.ClassAAH local_var_2_4 = new com.android.example.module07_module488_module1.ClassAAH();
		local_var_2_4.method0(new com.android.example.module07_module594_module3.ClassAAKJava(), new com.android.example.module07_module594_module3.ClassAAV(), new io.reactivex.subscribers.TestSubscriber());

		com.android.example.module07_module594_module3.ClassAAKJava local_var_2_5 = new com.android.example.module07_module594_module3.ClassAAKJava();
		local_var_2_5.method0("SomeString", "SomeString");

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.observers.TestObserver<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.assertNotSubscribed();

	}
}
