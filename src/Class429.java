/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class429 {
	public static int[] anIntArray4365;
	public static int N = 120;
	public static boolean NEW_SKILLS = Boolean.FALSE;
	public static int[] anIntArray4366 = NEW_SKILLS ? 
			new int[] { N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N, N } : 
			new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	public static int anInt4367 = 25;
	public static Class282_Sub1[] aClass282_Sub1Array4368;
	public static Class454 aClass454_4369;

	static {
		anIntArray4365 = new int[120];
		int i = 0;
		for (int i_0_ = 0; i_0_ < 120; i_0_++) {
			int i_1_ = i_0_ + 1;
			int i_2_ = (int) ((double) i_1_ + 300.0 * Math.pow(2.0, (double) i_1_ / 7.0));
			i += i_2_;
			anIntArray4365[i_0_] = i / 4;
		}
	}

	Class429() throws Throwable {
		throw new Error();
	}

	static final void method5325(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class163.method1922(iComponentDefinitions, class120, class430, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rv.cg(").append(')').toString());
		}
	}

	static final void method5326(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1320 = Class288.method2886(string, class430, 1477813341);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rv.og(").append(')').toString());
		}
	}

	static void method5327(byte i) {
		try {
			Class15.anInt192 = 0;
			for (int i_3_ = 0; i_3_ < 2048; i_3_++) {
				Class15.aClass330_Sub46Array191[i_3_] = null;
				Class15.aByteArray190[i_3_] = Class299.aClass299_6807.aByte6805;
				Class15.aClass26Array198[i_3_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rv.w(").append(')').toString());
		}
	}

	public static Class201 method5328(Buffer class330_sub46, int i) {
		try {
			Class201 class201 = Class315.method3140(class330_sub46, (byte) 1);
			int i_4_ = class330_sub46.readInt((byte) 111);
			int i_5_ = class330_sub46.readInt((byte) 101);
			return new Class201_Sub3(class201.aClass195_6507, class201.aClass211_6502, 1735526707 * class201.anInt6501, class201.anInt6504 * 27527681, 1790195679 * class201.anInt6505, class201.anInt6503 * -2072821429, class201.anInt6506 * 644698723, class201.anInt6508 * 1983469687, class201.anInt6509 * 1582406609, i_4_, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rv.s(").append(')').toString());
		}
	}

	static long method5329(int i) {
		try {
			return Class332.aClass315_6604.method3134(657781928);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rv.at(").append(')').toString());
		}
	}

	public static void method5330(String string, int i) {
		try {
			if (14 == -296919301 * client.anInt8995) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2542, client.aClass1_9060.aClass488_22, 270391817);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 22);
				int i_6_ = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -9);
				class330_sub34.aClass330_Sub46_Sub2_7729.offset += -2029760457;
				class330_sub34.aClass330_Sub46_Sub2_7729.method3807(Class556.anIntArray6385, i_6_, (-824785231 * class330_sub34.aClass330_Sub46_Sub2_7729.offset), (byte) -127);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3772(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_6_, (byte) 109);
				client.aClass1_9060.method378(class330_sub34, -146333287);
				Class357.aClass468_3702 = Class468.aClass468_6857;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rv.p(").append(')').toString());
		}
	}

	static final void method5331(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rv.alt(").append(')').toString());
		}
	}
}
