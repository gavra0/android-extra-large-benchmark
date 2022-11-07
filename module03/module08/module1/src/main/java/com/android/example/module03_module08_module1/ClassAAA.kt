package com.android.example.module03_module08_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()
	private 	val instance_var_1_1: dagger.internal.DelegateFactory<kotlin.Any> = dagger.internal.DelegateFactory()

	fun method0(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			param0.get()

		}
	}

	fun method1(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		param0.get()

		val local_var_2_3: com.android.example.module23_module1_module14_module1.ClassAAA = com.android.example.module23_module1_module14_module1.ClassAAA()
		local_var_2_3.method0(com.android.example.module23_module1_module14_module5.ClassAAA(), com.android.example.module07_module194_module1.ClassAAF())

	}

	fun method2(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module07_module326_module6.ClassAAAJava = com.android.example.module07_module326_module6.ClassAAAJava()
		local_var_2_2.method1(com.android.example.module07_module326_module3.ClassAAA(), com.android.example.module07_module326_module7.ClassAAFJava(), com.android.example.module07_module326_module7.ClassAAFJava())

		param0.get()

		val local_var_2_3: com.android.example.module07_module529.ClassAACJava = com.android.example.module07_module529.ClassAACJava()
		local_var_2_3.method0(com.android.example.module07_module594_module3.ClassAAAJava(), com.android.example.module07_module594_module3.ClassAAEJava())

	}

	fun method3(
		param0: dagger.internal.DelegateFactory<kotlin.Any>,
		param1: dagger.internal.DelegateFactory<kotlin.Any>,
		param2: dagger.internal.DelegateFactory<kotlin.Any>,
		param3: dagger.internal.DelegateFactory<kotlin.Any>
	) {
		val local_var_2_4: com.android.example.module07_module262_module3.ClassAAA = com.android.example.module07_module262_module3.ClassAAA()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
