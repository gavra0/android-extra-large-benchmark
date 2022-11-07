package com.android.example.module25_module1_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder = software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder()
	private 	val instance_var_1_1: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder = software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder()
	private 	val instance_var_1_2: org.slf4j.impl.SimpleLoggerFactory = org.slf4j.impl.SimpleLoggerFactory()
	private 	val instance_var_1_3: io.netty.handler.codec.spdy.DefaultSpdyPingFrame = io.netty.handler.codec.spdy.DefaultSpdyPingFrame(73)

	fun method0(
		param0: io.netty.channel.AdaptiveRecvByteBufAllocator,
		param1: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder,
		param2: io.netty.channel.socket.nio.NioSocketChannel,
		param3: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder
	) {
		val local_var_2_4: io.netty.channel.ChannelFlushPromiseNotifier = io.netty.channel.ChannelFlushPromiseNotifier()
		local_var_2_4.notifyPromises(kotlin.Throwable())

		val local_var_2_5: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder = software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder()
		local_var_2_5.accountId("SomeString")

		listOf("1", "2", "3").forEach {
			param0.newHandle()

			val local_var_3_0: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder = software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder()
			local_var_3_0.domain("SomeString")

		}
		param0.newHandle()

		val local_var_2_6: io.netty.handler.codec.http.websocketx.CloseWebSocketFrame = io.netty.handler.codec.http.websocketx.CloseWebSocketFrame()
		local_var_2_6.retain(19)

	}

	fun method1(
		param0: io.netty.channel.DefaultMaxBytesRecvByteBufAllocator
	) {
		val local_var_2_1: io.netty.channel.AdaptiveRecvByteBufAllocator = io.netty.channel.AdaptiveRecvByteBufAllocator()
		local_var_2_1.respectMaybeMoreData(false)

		val local_var_2_2: io.netty.channel.DefaultMessageSizeEstimator = io.netty.channel.DefaultMessageSizeEstimator(58)
		local_var_2_2.newHandle()

	}
}
