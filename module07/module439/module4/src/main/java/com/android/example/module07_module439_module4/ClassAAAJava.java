package com.android.example.module07_module439_module4;

public class ClassAAAJava {
	private 	java.lang.String instance_var_1_0 = "SomeString";
	private 	java.lang.String instance_var_1_1 = "SomeString";
	private 	java.lang.String instance_var_1_2 = "SomeString";

	public void method0(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
			} catch(Throwable e) { } // ignore
		});
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_3 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_3.clear();

		local_var_2_3.dispose();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.request(-1891378895l);

	}

	public void method1(
		java.lang.String param0) throws Throwable {
		io.reactivex.internal.util.LinkedArrayList local_var_2_1 = new io.reactivex.internal.util.LinkedArrayList(28);
		local_var_2_1.add(new java.lang.Object());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.dispose();

		local_var_2_1.head();

	}

	public void method2(
		java.lang.String param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.onError(new java.lang.Throwable());

	}

	public void method3(
		java.lang.String param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.request(-745976581l);

		local_var_2_1.requestMore(-1238562569l);

		io.reactivex.disposables.CompositeDisposable local_var_2_2 = new io.reactivex.disposables.CompositeDisposable();
		local_var_2_2.size();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isDisposed();

	}

	public void method4(
		java.lang.String param0,
		java.lang.String param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.requestMore(-1551869966l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.onError(new java.lang.Throwable());

	}
}
