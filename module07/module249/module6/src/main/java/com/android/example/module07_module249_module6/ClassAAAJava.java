package com.android.example.module07_module249_module6;

public class ClassAAAJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_1 = new dagger.internal.DelegateFactory();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		dagger.internal.DelegateFactory<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_2 = new dagger.internal.DelegateFactory();
		local_var_2_2.get();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.onNext(new java.lang.Object());

		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
				local_var_3_0.get();

				dagger.internal.DelegateFactory<Object> local_var_3_1 = new dagger.internal.DelegateFactory();
				local_var_3_1.get();

			} catch(Throwable e) { } // ignore
		});
	}

	public void method1(
		dagger.internal.DelegateFactory<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_3 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_3.dispose();

		param0.get();

	}

	public void method2(
		dagger.internal.DelegateFactory<Object> param0) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_1 = new dagger.internal.DelegateFactory();
		local_var_2_1.get();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.isDisposed();

		io.reactivex.internal.util.LinkedArrayList local_var_2_2 = new io.reactivex.internal.util.LinkedArrayList(26);
		local_var_2_2.head();

		param0.assertSubscribed();

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.hasSubscription();

	}
}
