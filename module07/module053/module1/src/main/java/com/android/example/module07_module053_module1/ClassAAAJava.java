package com.android.example.module07_module053_module1;

public class ClassAAAJava {
	private 	com.android.example.module07_module053_module2.ClassAACJava instance_var_1_0 = new com.android.example.module07_module053_module2.ClassAACJava();
	private 	com.android.example.module07_module053_module2.ClassAAAJava instance_var_1_1 = new com.android.example.module07_module053_module2.ClassAAAJava();
	private 	com.android.example.module07_module053_module2.ClassAABJava instance_var_1_2 = new com.android.example.module07_module053_module2.ClassAABJava();

	public void method0(
		com.android.example.module07_module053_module2.ClassAABJava param0,
		com.android.example.module07_module194_module1.ClassAAE param1,
		com.android.example.module07_module194_module1.ClassAAF param2) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				for (int iAb = 0; iAb < 3; iAb++) {
					if (new java.lang.Object().equals(new java.lang.Object())) {
						io.reactivex.subscribers.TestSubscriber<Object> local_var_5_0 = new io.reactivex.subscribers.TestSubscriber();
						local_var_5_0.cancel();

					}
					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_0.assertSubscribed();

					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_1 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_1.cancel();

					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_2 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_2.onError(new java.lang.Throwable());

				}
			} catch(Throwable e) { } // ignore
		});
		param0.method2(new io.reactivex.internal.util.LinkedArrayList(88), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.util.OpenHashSet());

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_3 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_3.clear();

	}

	public void method1(
		com.android.example.module07_module194_module1.ClassAAB param0,
		com.android.example.module07_module053_module2.ClassAAAJava param1) throws Throwable {
		io.reactivex.internal.schedulers.SingleScheduler local_var_2_2 = new io.reactivex.internal.schedulers.SingleScheduler();
		local_var_2_2.shutdown();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.request(-1664932456l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.cancel();

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString");

	}
}
