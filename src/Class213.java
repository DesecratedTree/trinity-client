/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class213 {
	public static Class213 aClass213_2063 = new Class213(9);
	public static Class213 aClass213_2064 = new Class213(2);
	public static Class213 aClass213_2065;
	public static Class213 aClass213_2066;
	public static Class213 aClass213_2067;
	public static Class213 aClass213_2068;
	public static Class213 aClass213_2069;
	public static Class213 aClass213_2070;
	public static Class213 aClass213_2071;
	public static Class213 aClass213_2072;
	public static Class213 aClass213_2073;
	public static Class213 aClass213_2074 = new Class213(5);
	public static Class213 aClass213_2075;
	public static Class213 aClass213_2076;
	public static Class213 aClass213_2077;

	static {
		aClass213_2066 = new Class213(7);
		aClass213_2067 = new Class213(6);
		aClass213_2065 = new Class213(18);
		aClass213_2069 = new Class213(6);
		aClass213_2070 = new Class213(21);
		aClass213_2071 = new Class213(8);
		aClass213_2072 = new Class213(3);
		aClass213_2073 = new Class213(5);
		aClass213_2068 = new Class213(-1);
		aClass213_2075 = new Class213(10);
		aClass213_2076 = new Class213(-1);
		aClass213_2077 = new Class213(7);
	}

	Class213(int i) {
		/* empty */
	}

	static final void method2227(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			String string = (String) Class332.anObjectArray6640[i_0_];
			if (string == null)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iy.bm(").append(')').toString());
		}
	}

	static final void method2228(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_1_, 348059583);
			Class120 class120 = Class3.aClass120Array56[i_1_ >> 16];
			Class420.method5287(iComponentDefinitions, class120, class430, 683541547);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iy.do(").append(')').toString());
		}
	}

	static int method2229(IComponentDefinitions iComponentDefinitions, int i, int i_2_) {
		try {
			if (!client.method3924(iComponentDefinitions).method3264(i, -979598918) && null == iComponentDefinitions.anObjectArray1319)
				return -1;
			return ((null != iComponentDefinitions.anIntArray1286 && iComponentDefinitions.anIntArray1286.length > i) ? iComponentDefinitions.anIntArray1286[i] : -1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iy.mj(").append(')').toString());
		}
	}

	public static Class330_Sub36_Sub10 method2230(int i) {
		try {
			return Class439.aClass330_Sub36_Sub10_4455;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iy.ad(").append(')').toString());
		}
	}

	static final void method2231(Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class364 class364 = Class102.aClass362_924.method4254(i_3_, -136862227);
			if (null != class364.anIntArray3809 && class364.anIntArray3809.length > 0) {
				int i_4_ = 0;
				int i_5_ = class364.anIntArray3833[0];
				for (int i_6_ = 1; i_6_ < class364.anIntArray3809.length; i_6_++) {
					if (class364.anIntArray3833[i_6_] > i_5_) {
						i_4_ = i_6_;
						i_5_ = class364.anIntArray3833[i_6_];
					}
				}
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class364.anIntArray3809[i_4_];
			} else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class364.anInt3808 * 1662674185;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iy.abb(").append(')').toString());
		}
	}

	static void method2232(Class430 class430, int i) {
		try {
			Class395 class395 = Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), -1227984827);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (class395.anIntArrayArray4094 == null ? 0 : class395.anIntArrayArray4094.length);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iy.b(").append(')').toString());
		}
	}
}
