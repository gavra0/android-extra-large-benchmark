package com.android.example.module01_module15;

public class ClassAACJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.internal.util.OpenHashSet<Object> instance_var_1_3 = new io.reactivex.internal.util.OpenHashSet();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_4 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		dagger.internal.DelegateFactory<Object> param2) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.hasSubscription();

			} catch(Throwable e) { } // ignore
		});
		param0.requestMore(2099477110l);

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isCancelled();

	}

	public void method1(
		dagger.internal.DelegateFactory<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_1 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_1.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertNotSubscribed();

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		param0.hasSubscription();

		io.reactivex.observers.TestObserver<Object> local_var_2_4 = new io.reactivex.observers.TestObserver();
		local_var_2_4.isCancelled();

	}
}
