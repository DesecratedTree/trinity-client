/* Class164_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class164_Sub1_Sub2 extends Class164_Sub1 {
	public int anInt9449;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9450;
	boolean aBoolean9451;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9452;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9453;
	public Class249 aClass249_9454 = new Class249();
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9455;
	boolean aBoolean9456;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9457;
	Class155 aClass155_9458;
	public int anInt9459;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9460;
	Class261 aClass261_9461;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9462;
	public Class260 aClass260_9463;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9464;
	public Class249 aClass249_9465 = new Class249();
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9466;
	public Class261 aClass261_9467;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9468;
	public Class260 aClass260_9469;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9470;
	public Class261 aClass261_9471;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_9472;
	public Class260 aClass260_9473;
	public int anInt9474;
	public int anInt9475;
	public int anInt9476;
	float aFloat9477;
	Class261 aClass261_9478;
	Class261 aClass261_9479;
	Class123 aClass123_9480;

	boolean method1947() throws Exception_Sub2 {
		if (!((Class164_Sub1_Sub2) this).aClass155_9458.method1823())
			return false;
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9460 = aClass105_7310.method1295("NormalSampler", (byte) -56);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9452 = aClass105_7310.method1295("EnvMapSampler", (byte) -17);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9453 = aClass105_7310.method1295("WVPMatrix", (byte) -85);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9455 = aClass105_7310.method1295("TexCoordMatrix", (byte) -82);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9457 = aClass105_7310.method1295("EyePosAndTime", (byte) 3);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9450 = aClass105_7310.method1295("SunDirectionAndExponent", (byte) -99);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9462 = aClass105_7310.method1295("SunColourAndWaveExponent", (byte) -54);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9464 = (aClass105_7310.method1295("WaveIntensityAndBreakWaterDepthAndOffset", (byte) -104));
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9466 = aClass105_7310.method1295("HeightFogPlane", (byte) -72);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9468 = aClass105_7310.method1295("HeightFogColour", (byte) -127);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9470 = aClass105_7310.method1295("DistanceFogPlane", (byte) -31);
		((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9472 = aClass105_7310.method1295("DistanceFogColour", (byte) -21);
		((Class164_Sub1_Sub2) this).aClass123_9480 = aClass105_7310.method1254(((((Class164_Sub1_Sub2) this).aBoolean9456) ? "EnvMappedSea" : "EnvMappedWater"), -204776510);
		aClass105_7310.method1258(((Class164_Sub1_Sub2) this).aClass123_9480);
		return true;
	}

	void method1940(Class249 class249) {
		try {
			Class249 class249_0_ = new Class249();
			class249_0_.method2486(((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477, 1.0F, 1.0F);
			class249_0_.method2484(class249, class249_0_);
			super.method1940(class249_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahw.h(").append(')').toString());
		}
	}

	void method1943(boolean bool) {
		try {
			float f = 1.0F + (1.0F - Math.abs(aClass_ra_Sub2_1694.aFloatArray8525[1])) * 2.0F;
			float f_1_ = aClass_ra_Sub2_1694.aFloat8489;
			aClass_ra_Sub2_1694.aFloat8489 *= f;
			super.method1943(bool);
			aClass_ra_Sub2_1694.aFloat8489 = f_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahw.ac(").append(')').toString());
		}
	}

	void method1954(int i) {
		try {
			((Class164_Sub1_Sub2) this).aFloat9477 = 2.4414062E-4F;
			int i_2_ = 256;
			float f = 0.3F;
			float f_3_ = 0.4F;
			float f_4_ = 0.1F;
			int i_5_ = 5;
			aClass249_9465.method2486(((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477);
			((Class164_Sub1_Sub2) this).aClass261_9461.method2588(-aClass_ra_Sub2_1694.aFloatArray8525[0], -aClass_ra_Sub2_1694.aFloatArray8525[1], -aClass_ra_Sub2_1694.aFloatArray8525[2], 32.0F);
			((Class164_Sub1_Sub2) this).aClass261_9478.method2588(aClass_ra_Sub2_1694.aFloat8530, aClass_ra_Sub2_1694.aFloat8500, aClass_ra_Sub2_1694.aFloat8532, (float) i_5_);
			((Class164_Sub1_Sub2) this).aClass261_9479.method2588(f_4_, f_3_, (float) i_2_, f);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahw.br(").append(')').toString());
		}
	}

	void method1955(Class249 class249) {
		Class249 class249_6_ = new Class249();
		class249_6_.method2486(((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477, 1.0F, 1.0F);
		class249_6_.method2484(class249, class249_6_);
		super.method1940(class249_6_);
	}

	public boolean method1956(int i) {
		try {
			return ((Class164_Sub1_Sub2) this).aBoolean9451;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahw.bl(").append(')').toString());
		}
	}

	void method1957(Class249 class249) {
		Class249 class249_7_ = new Class249();
		class249_7_.method2486(((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477, 1.0F, 1.0F);
		class249_7_.method2484(class249, class249_7_);
		super.method1940(class249_7_);
	}

	void method1958(Class249 class249) {
		Class249 class249_8_ = new Class249();
		class249_8_.method2486(((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477, 1.0F, 1.0F);
		class249_8_.method2484(class249, class249_8_);
		super.method1940(class249_8_);
	}

	public void method1959(short i) {
		try {
			method1954(-1401707189);
			aClass105_7310.method1258(((Class164_Sub1_Sub2) this).aClass123_9480);
			aClass105_7310.method1249();
			aClass105_7310.method1270((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9460), 0, (((Class164_Sub1_Sub2) this).aClass155_9458.anInterface11_Impl2_1674), (byte) 16);
			aClass105_7310.method1270((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9452), 1, aClass_ra_Sub2_1694.method5012(), (byte) 106);
			aClass105_7310.method1253((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9453), aClass249_9454, 1521081005);
			aClass105_7310.method1269((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9455), aClass249_9465, 1612652822);
			int i_9_ = 1 << (-456194107 * anInt9459 & 0x3);
			aClass105_7310.method1264((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9457), aClass260_9463.aFloat2716, aClass260_9463.aFloat2715, aClass260_9463.aFloat2711, (float) (i_9_ * aClass_ra_Sub2_1694.anInt8588 % 40000) / 40000.0F, -775843056);
			aClass105_7310.method1266((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9450), (((Class164_Sub1_Sub2) this).aClass261_9461), -1161298992);
			aClass105_7310.method1266((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9462), (((Class164_Sub1_Sub2) this).aClass261_9478), -39565434);
			aClass105_7310.method1266((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9464), (((Class164_Sub1_Sub2) this).aClass261_9479), -1593364660);
			aClass105_7310.method1266((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9466), aClass261_9467, -857444240);
			aClass105_7310.method1283((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9468), aClass260_9469, (byte) 14);
			aClass105_7310.method1266((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9470), aClass261_9471, -1572718670);
			aClass105_7310.method1283((((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9472), aClass260_9473, (byte) 39);
			aClass_ra_Sub2_1694.method4987(Class199.aClass199_1926, anInt9474 * -634746051, anInt9475 * 488443653, 354435821 * anInt9476, anInt9449 * -404685647);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahw.bk(").append(')').toString());
		}
	}

	void method1960(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass_ra_Sub2_1694.aFloatArray8525[1])) * 2.0F);
		float f_10_ = aClass_ra_Sub2_1694.aFloat8489;
		aClass_ra_Sub2_1694.aFloat8489 *= f;
		super.method1943(bool);
		aClass_ra_Sub2_1694.aFloat8489 = f_10_;
	}

	void method1961(Class249 class249) {
		Class249 class249_11_ = new Class249();
		class249_11_.method2486(((Class164_Sub1_Sub2) this).aFloat9477, ((Class164_Sub1_Sub2) this).aFloat9477, 1.0F, 1.0F);
		class249_11_.method2484(class249, class249_11_);
		super.method1940(class249_11_);
	}

	public Class164_Sub1_Sub2(Class_ra_Sub2 class_ra_sub2, Class155 class155, boolean bool) throws Exception_Sub2 {
		super(class_ra_sub2);
		aClass260_9463 = new Class260();
		((Class164_Sub1_Sub2) this).aClass261_9461 = new Class261();
		((Class164_Sub1_Sub2) this).aClass261_9478 = new Class261();
		((Class164_Sub1_Sub2) this).aClass261_9479 = new Class261();
		aClass261_9467 = new Class261();
		aClass260_9469 = new Class260();
		aClass261_9471 = new Class261();
		aClass260_9473 = new Class260();
		((Class164_Sub1_Sub2) this).aFloat9477 = 0.0F;
		new Class249();
		((Class164_Sub1_Sub2) this).aClass155_9458 = class155;
		((Class164_Sub1_Sub2) this).aBoolean9456 = bool;
		if (class_ra_sub2.method5051() && class_ra_sub2.method4886())
			((Class164_Sub1_Sub2) this).aBoolean9451 = method1939("EnvMappedWater");
		else
			((Class164_Sub1_Sub2) this).aBoolean9451 = false;
	}

	boolean method1938() throws Exception_Sub2 {
		try {
			if (!((Class164_Sub1_Sub2) this).aClass155_9458.method1823())
				return false;
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9460 = aClass105_7310.method1295("NormalSampler", (byte) -118);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9452 = aClass105_7310.method1295("EnvMapSampler", (byte) -59);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9453 = aClass105_7310.method1295("WVPMatrix", (byte) -83);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9455 = aClass105_7310.method1295("TexCoordMatrix", (byte) -120);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9457 = aClass105_7310.method1295("EyePosAndTime", (byte) -54);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9450 = aClass105_7310.method1295("SunDirectionAndExponent", (byte) -74);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9462 = aClass105_7310.method1295("SunColourAndWaveExponent", (byte) -18);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9464 = (aClass105_7310.method1295("WaveIntensityAndBreakWaterDepthAndOffset", (byte) -99));
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9466 = aClass105_7310.method1295("HeightFogPlane", (byte) -18);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9468 = aClass105_7310.method1295("HeightFogColour", (byte) -23);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9470 = aClass105_7310.method1295("DistanceFogPlane", (byte) -116);
			((Class164_Sub1_Sub2) this).aClass330_Sub15_Sub1_9472 = aClass105_7310.method1295("DistanceFogColour", (byte) -47);
			((Class164_Sub1_Sub2) this).aClass123_9480 = aClass105_7310.method1254(((((Class164_Sub1_Sub2) this).aBoolean9456) ? "EnvMappedSea" : "EnvMappedWater"), -1592645532);
			aClass105_7310.method1258(((Class164_Sub1_Sub2) this).aClass123_9480);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahw.m(").append(')').toString());
		}
	}

	static final void method1962(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2569, client.aClass1_9060.aClass488_22, 787306198);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(string, -1060590012), (byte) 24);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -12);
			client.aClass1_9060.method378(class330_sub34, -279543881);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahw.vw(").append(')').toString());
		}
	}
}
