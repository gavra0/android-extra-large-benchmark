package com.android.example.module25_module1_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.netty.channel.ChannelMetadata = io.netty.channel.ChannelMetadata(true, 67)
	private 	val instance_var_1_1: io.netty.channel.socket.nio.NioServerSocketChannel = io.netty.channel.socket.nio.NioServerSocketChannel()
	private 	val instance_var_1_2: io.netty.handler.codec.http.websocketx.PongWebSocketFrame = io.netty.handler.codec.http.websocketx.PongWebSocketFrame()
	private 	val instance_var_1_3: io.netty.bootstrap.ServerBootstrap = io.netty.bootstrap.ServerBootstrap()
	private 	val instance_var_1_4: io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame = io.netty.handler.codec.spdy.DefaultSpdyHeadersFrame(41)

	fun method0(
		param0: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder,
		param1: io.netty.channel.DefaultMessageSizeEstimator
	) {
		param0.accessPointName("SomeString")

		for (iAb in 0..6) {
			val local_var_3_0: io.netty.channel.local.LocalServerChannel = io.netty.channel.local.LocalServerChannel()
			local_var_3_0.localAddress()

			val local_var_3_1: io.netty.handler.codec.http.HttpVersion = io.netty.handler.codec.http.HttpVersion("SomeString", false)
			local_var_3_1.compareTo(io.netty.handler.codec.http.HttpVersion("SomeString", true))

			local_var_3_0.config()

		}
		param0.dualstackEnabled(true)

		param0.protocol("SomeString")

	}

	fun method1(
		param0: org.slf4j.impl.SimpleLoggerFactory,
		param1: io.netty.channel.DefaultMaxBytesRecvByteBufAllocator
	) {
		val local_var_2_2: io.netty.handler.codec.spdy.DefaultSpdyPingFrame = io.netty.handler.codec.spdy.DefaultSpdyPingFrame(81)
		local_var_2_2.id()

		val local_var_2_3: org.slf4j.impl.SimpleLoggerFactory = org.slf4j.impl.SimpleLoggerFactory()
		local_var_2_3.getLogger("SomeString")

		val local_var_2_4: io.netty.handler.codec.http.HttpClientCodec = io.netty.handler.codec.http.HttpClientCodec()
		local_var_2_4.isSingleDecode()

		param0.getLogger("SomeString")

		val local_var_2_5: io.netty.channel.ServerChannelRecvByteBufAllocator = io.netty.channel.ServerChannelRecvByteBufAllocator()
		local_var_2_5.newHandle()

	}

	fun method2(
		param0: io.netty.channel.AdaptiveRecvByteBufAllocator
	) {
		val local_var_2_1: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder = software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder()
		local_var_2_1.protocol("SomeString")

		val local_var_2_2: software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder = software.amazon.awssdk.services.s3.internal.resource.S3AccessPointBuilder()
		local_var_2_2.fipsEnabled(true)

	}
}
