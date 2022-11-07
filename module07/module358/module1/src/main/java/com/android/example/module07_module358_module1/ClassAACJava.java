package com.android.example.module07_module358_module1;

public class ClassAACJava {
	private 	io.reactivex.internal.disposables.ListCompositeDisposable instance_var_1_0 = new io.reactivex.internal.disposables.ListCompositeDisposable();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.disposables.SerialDisposable instance_var_1_2 = new io.reactivex.disposables.SerialDisposable();

	public void method0(
		io.reactivex.schedulers.TestScheduler param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.observers.TestObserver<Object> param3) throws Throwable {
		com.android.example.module07_module488_module1.ClassAAE local_var_2_4 = new com.android.example.module07_module488_module1.ClassAAE();
		local_var_2_4.method2(new com.android.example.module07_module594_module3.ClassAAZ(), new io.reactivex.internal.disposables.ListCompositeDisposable(), new com.android.example.module07_module594_module3.ClassAAU(), new io.reactivex.internal.schedulers.SingleScheduler());

		for (int iAb = 0; iAb < 6; iAb++) {
			param0.createWorker();

			com.android.example.module07_module562_module10.ClassAAH local_var_3_0 = new com.android.example.module07_module562_module10.ClassAAH();
			local_var_3_0.method1("SomeString", "SomeString", "SomeString");

			local_var_3_0.method0("SomeString", "SomeString", "SomeString", "SomeString");

			local_var_3_0.method2("SomeString", "SomeString");

		}
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		com.android.example.module07_module562_module10.ClassAAFJava local_var_2_2 = new com.android.example.module07_module562_module10.ClassAAFJava();
		local_var_2_2.method2("SomeString", "SomeString");

		com.android.example.module07_module587_module2.ClassAAD local_var_2_3 = new com.android.example.module07_module587_module2.ClassAAD();
		local_var_2_3.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.disposables.ListCompositeDisposable());

		com.android.example.module07_module587_module2.ClassAACJava local_var_2_4 = new com.android.example.module07_module587_module2.ClassAACJava();
		local_var_2_4.method2(new io.reactivex.schedulers.TestScheduler(), new io.reactivex.subscribers.TestSubscriber());

		com.android.example.module07_module594_module3.ClassAACJava local_var_2_5 = new com.android.example.module07_module594_module3.ClassAACJava();
		local_var_2_5.method1("SomeString", "SomeString", "SomeString", "SomeString");

		com.android.example.module07_module562_module10.ClassAACJava local_var_2_6 = new com.android.example.module07_module562_module10.ClassAACJava();
		local_var_2_6.method1("SomeString");

	}

	public void method2(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		param0.isDisposed();

		param0.dispose();

	}
}
