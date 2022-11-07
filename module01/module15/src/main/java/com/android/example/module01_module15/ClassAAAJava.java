package com.android.example.module01_module15;

public class ClassAAAJava {
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_0 = new dagger.internal.DelegateFactory();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		param0.assertNotSubscribed();

	}

	public void method1(
		dagger.internal.DelegateFactory<Object> param0,
		dagger.internal.DelegateFactory<Object> param1) throws Throwable {
		for (int iAb = 0; iAb < 3; iAb++) {
			java.util.Collections.emptyList().forEach( lambda0 -> {
				try {
					param0.get();

				} catch(Throwable e) { } // ignore
			});
		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertNotSubscribed();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		dagger.internal.DelegateFactory<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.isCancelled();

		param0.isCancelled();

		io.reactivex.internal.schedulers.IoScheduler local_var_2_5 = new io.reactivex.internal.schedulers.IoScheduler();
		local_var_2_5.size();

		param0.isDisposed();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		param0.isCancelled();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.isCancelled();

	}

	public void method4(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		param0.assertSubscribed();

	}
}
