package com.android.example.module07_module189_module1;

public class ClassAAFJava {
	private 	java.lang.String instance_var_1_0 = "SomeString";
	private 	java.lang.String instance_var_1_1 = "SomeString";
	private 	java.lang.String instance_var_1_2 = "SomeString";
	private 	java.lang.String instance_var_1_3 = "SomeString";

	public void method0(
		java.lang.String param0) throws Throwable {
		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_1 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_1.appendInstant();

		local_var_2_1.toFormatter(new java.util.Locale("SomeString"));

	}

	public void method1(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2,
		java.lang.String param3) throws Throwable {
		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_4 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_4.appendZoneOrOffsetId();

		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_5 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_5.appendChronologyId();

		local_var_2_4.parseStrict();

	}

	public void method2(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2,
		java.lang.String param3) throws Throwable {
		org.bouncycastle.crypto.signers.Ed25519Signer local_var_2_4 = new org.bouncycastle.crypto.signers.Ed25519Signer();
		local_var_2_4.reset();

		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_5 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_5.appendLiteral("SomeString");

		org.bouncycastle.pqc.crypto.xmss.XMSSKeyPairGenerator local_var_2_6 = new org.bouncycastle.pqc.crypto.xmss.XMSSKeyPairGenerator();
		local_var_2_6.init(new org.bouncycastle.crypto.KeyGenerationParameters(new java.security.SecureRandom(), 54));

	}

	public void method3(
		java.lang.String param0,
		java.lang.String param1,
		java.lang.String param2,
		java.lang.String param3) throws Throwable {
		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_4 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_4.parseLenient();

		org.bouncycastle.crypto.digests.RIPEMD160Digest local_var_2_5 = new org.bouncycastle.crypto.digests.RIPEMD160Digest();
		local_var_2_5.getAlgorithmName();

		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_6 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_6.parseCaseInsensitive();

		local_var_2_4.toFormatter();

		org.threeten.bp.format.DateTimeFormatterBuilder local_var_2_7 = new org.threeten.bp.format.DateTimeFormatterBuilder();
		local_var_2_7.appendInstant(62);

	}
}
