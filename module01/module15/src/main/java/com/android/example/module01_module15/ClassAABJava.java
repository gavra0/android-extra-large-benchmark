package com.android.example.module01_module15;

public class ClassAABJava {
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_0 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_3 = new dagger.internal.DelegateFactory();

	public void method0(
		dagger.internal.DelegateFactory<Object> param0,
		dagger.internal.DelegateFactory<Object> param1) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.get();

				io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_3_0.isCancelled();

			} catch(Throwable e) { } // ignore
		});
		param0.get();

		param0.get();

		param0.get();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		dagger.internal.DelegateFactory<Object> param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isDisposed();

	}
}
