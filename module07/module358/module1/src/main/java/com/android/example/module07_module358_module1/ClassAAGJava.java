package com.android.example.module07_module358_module1;

public class ClassAAGJava {
	private 	io.reactivex.observers.TestObserver<Object> instance_var_1_0 = new io.reactivex.observers.TestObserver();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1,
		io.reactivex.observers.TestObserver<Object> param2) throws Throwable {
		com.android.example.module07_module587_module2.ClassAAK local_var_2_3 = new com.android.example.module07_module587_module2.ClassAAK();
		local_var_2_3.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		com.android.example.module07_module587_module2.ClassAAI local_var_2_4 = new com.android.example.module07_module587_module2.ClassAAI();
		local_var_2_4.method4(new io.reactivex.internal.disposables.ListCompositeDisposable());

		for (int iAb = 0; iAb < 5; iAb++) {
			param0.dispose();

		}
		param0.assertSubscribed();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.internal.disposables.ListCompositeDisposable param2) throws Throwable {
		param0.requestMore(2134548882l);

		param0.dispose();

		com.android.example.module07_module562_module10.ClassAAH local_var_2_3 = new com.android.example.module07_module562_module10.ClassAAH();
		local_var_2_3.method0("SomeString", "SomeString", "SomeString", "SomeString");

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		com.android.example.module07_module562_module10.ClassAABJava local_var_2_3 = new com.android.example.module07_module562_module10.ClassAABJava();
		local_var_2_3.method0("SomeString", "SomeString", "SomeString", "SomeString");

		com.android.example.module07_module587_module2.ClassAABJava local_var_2_4 = new com.android.example.module07_module587_module2.ClassAABJava();
		local_var_2_4.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		com.android.example.module07_module488_module1.ClassAAD local_var_2_5 = new com.android.example.module07_module488_module1.ClassAAD();
		local_var_2_5.method0(new io.reactivex.internal.disposables.ListCompositeDisposable());

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.schedulers.TestScheduler param2) throws Throwable {
		com.android.example.module07_module562_module10.ClassAABJava local_var_2_3 = new com.android.example.module07_module562_module10.ClassAABJava();
		local_var_2_3.method2("SomeString");

		param0.isCancelled();

		com.android.example.module07_module587_module2.ClassAAAJava local_var_2_4 = new com.android.example.module07_module587_module2.ClassAAAJava();
		local_var_2_4.method2(new io.reactivex.subscribers.TestSubscriber());

		com.android.example.module07_module562_module10.ClassAAI local_var_2_5 = new com.android.example.module07_module562_module10.ClassAAI();
		local_var_2_5.method0("SomeString", "SomeString", "SomeString");

	}
}
