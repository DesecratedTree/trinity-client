/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class385 {
	public static int anInt3970 = 2;
	short aShort3971;
	byte aByte3972;
	public static int anInt3973 = 8;
	public static int anInt3974 = 16;
	byte aByte3975;
	public static int anInt3976 = 1;
	short aShort3977;
	short aShort3978;
	int[] anIntArray3979;
	short aShort3980;
	short[] aShortArray3981;
	int[] anIntArray3982;
	int[] anIntArray3983;
	public static int anInt3984 = 4;
	short[] aShortArray3985;
	short[] aShortArray3986;

	Class385(Class356 class356, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class385) this).aByte3975 = (byte) i;
		((Class385) this).aByte3972 = (byte) i_0_;
		((Class385) this).anIntArray3979 = new int[4];
		((Class385) this).anIntArray3982 = new int[4];
		((Class385) this).anIntArray3983 = new int[4];
		((Class385) this).anIntArray3979[0] = i_1_;
		((Class385) this).anIntArray3979[1] = i_2_;
		((Class385) this).anIntArray3979[2] = i_3_;
		((Class385) this).anIntArray3979[3] = i_4_;
		((Class385) this).anIntArray3982[0] = i_5_;
		((Class385) this).anIntArray3982[1] = i_6_;
		((Class385) this).anIntArray3982[2] = i_7_;
		((Class385) this).anIntArray3982[3] = i_8_;
		((Class385) this).anIntArray3983[0] = i_9_;
		((Class385) this).anIntArray3983[1] = i_10_;
		((Class385) this).anIntArray3983[2] = i_11_;
		((Class385) this).anIntArray3983[3] = i_12_;
		((Class385) this).aShort3977 = (short) (i_1_ >> class356.anInt3641 * 916917461);
		((Class385) this).aShort3978 = (short) (i_3_ >> 916917461 * class356.anInt3641);
		((Class385) this).aShort3971 = (short) (i_9_ >> class356.anInt3641 * 916917461);
		((Class385) this).aShort3980 = (short) (i_11_ >> class356.anInt3641 * 916917461);
		((Class385) this).aShortArray3981 = new short[4];
		((Class385) this).aShortArray3985 = new short[4];
		((Class385) this).aShortArray3986 = new short[4];
	}

	public static void method4423(Class_ra class_ra, int i) {
		try {
			Class125.aClass263_1454 = ((Class263) Class219.aClass230_2183.method2331((client.anInterface12_9243), (Class125.anInt1451 * 590937471), true, true, (byte) -45));
			Class543.aClass524_6254 = Class219.aClass230_2183.method2333(client.anInterface12_9243, (590937471 * Class125.anInt1451), -1963893190);
			Class464_Sub22.aClass263_8709 = ((Class263) Class219.aClass230_2183.method2331((client.anInterface12_9243), (Class125.anInt1452 * 2101878867), true, true, (byte) -45));
			Class386.aClass524_3989 = Class219.aClass230_2183.method2333(client.anInterface12_9243, (Class125.anInt1452 * 2101878867), -1567207500);
			Class166_Sub3_Sub2.aClass263_9483 = ((Class263) Class219.aClass230_2183.method2331((client.anInterface12_9243), (-1208765049 * Class125.anInt1453), true, true, (byte) -35));
			Class477_Sub1.aClass524_8749 = Class219.aClass230_2183.method2333(client.anInterface12_9243, (Class125.anInt1453 * -1208765049), 347590955);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pz.p(").append(')').toString());
		}
	}

	static boolean method4424(byte i) {
		try {
			Class360.anInt3791 = -67725972;
			Class360.aClass1_3783 = client.aClass1_9060;
			if (null != client.aByteArray8959) {
				Buffer class330_sub46 = new Buffer(client.aByteArray8959);
				Class360.aLong3750 = (class330_sub46.readLong(-154213383) * -717415731737899667L);
				Class360.socialName = (class330_sub46.readLong(820749694) * 853781492121528335L);
			}
			if (Class360.aLong3750 * -3453250751665093531L < 0L) {
				Class281.method2792(35, 650655718);
				return false;
			}
			return Class528.method6272(false, true, "", "", (Class360.aLong3750 * -3453250751665093531L));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pz.u(").append(')').toString());
		}
	}

	public static int method4425(int i, short i_13_) {
		try {
			int i_14_ = i >>> 1;
			i_14_ |= i_14_ >>> 1;
			i_14_ |= i_14_ >>> 2;
			i_14_ |= i_14_ >>> 4;
			i_14_ |= i_14_ >>> 8;
			i_14_ |= i_14_ >>> 16;
			return i & (i_14_ ^ 0xffffffff);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pz.o(").append(')').toString());
		}
	}

	public static Class460 method4426(int i) {
		try {
			if (null == Class297.aClass460_3051)
				return Class460.aClass460_6847;
			return Class297.aClass460_3051;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pz.f(").append(')').toString());
		}
	}

	public static void method4427(String string, boolean bool, int i) {
		try {
			IsaacCipher.method6048(string, bool, -1, -1, -1804817956);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pz.mb(").append(')').toString());
		}
	}

	static void method4428(int i) {
		try {
			Class330_Sub1.aClass367_7498.method4298((byte) 59);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pz.x(").append(')').toString());
		}
	}

	static void method4429(int i, int i_15_) {
		try {
			Class3.aClass367_45.method4292(i, (byte) 73);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pz.p(").append(')').toString());
		}
	}
}
