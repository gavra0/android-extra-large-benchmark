package com.android.example.module07_module244_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: okhttp3.ConnectionPool = okhttp3.ConnectionPool()
	private 	val instance_var_1_1: okhttp3.internal.publicsuffix.PublicSuffixDatabase = okhttp3.internal.publicsuffix.PublicSuffixDatabase()
	private 	val instance_var_1_2: okhttp3.internal.platform.Android10Platform = okhttp3.internal.platform.Android10Platform()
	private 	val instance_var_1_3: okhttp3.OkHttpClient = okhttp3.OkHttpClient()
	private 	val instance_var_1_4: okhttp3.internal.platform.android.BouncyCastleSocketAdapter = okhttp3.internal.platform.android.BouncyCastleSocketAdapter()

	fun method0(
		param0: okhttp3.OkHttpClient,
		param1: okhttp3.internal.platform.AndroidPlatform
	) {
		val local_var_2_2: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_2.clearDeadline()

		val local_var_2_3: okio.Throttler = okio.Throttler()
		local_var_2_3.bytesPerSecond(-120306324149527947, 2236652493785221350, -5966258992671281530)

		listOf("1", "2", "3").forEach {
			val local_var_3_0: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
			local_var_3_0.throwIfReached()

			local_var_3_0.deadlineNanoTime()

		}
		val local_var_2_4: okio.ForwardingTimeout = okio.ForwardingTimeout(okio.Timeout())
		local_var_2_4.setDelegate(okio.Timeout())

		param0.newBuilder()

	}

	fun method1(
		param0: okhttp3.internal.publicsuffix.PublicSuffixDatabase
	) {
		param0.getEffectiveTldPlusOne("SomeString")

		val local_var_2_1: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_1.exit()

		val local_var_2_2: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_2.enter()

	}
}
