/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96 {
	static int anInt852;
	static Class79[] aClass79Array853;
	public static Class85[] aClass85Array854;
	static Class88[] aClass88Array855;
	public static Class471 aClass471_856 = new Class471();
	public static Class497 aClass497_857 = new Class497(32);
	static int anInt858 = 651206033;
	static short aShort859;
	static int anInt860;
	static boolean aBoolean861;
	static Class89[] aClass89Array862;
	static int anInt863 = 0;
	static int anInt864;
	static short aShort865;
	public static Interface29 anInterface29_866;

	static {
		anInt860 = 0;
		aBoolean861 = false;
		anInt864 = -1342454659;
		anInt852 = -1363868437;
		anInterface29_866 = new Class83();
	}

	Class96() throws Throwable {
		throw new Error();
	}

	static final void method1177(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class136.method1587(iComponentDefinitions, class120, class430, 1351069292);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.go(").append(')').toString());
		}
	}

	static final void method1178(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class354_Sub1.aBoolean7989 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.aex(").append(')').toString());
		}
	}

	static long method1179(CharSequence charsequence, int i) {
		try {
			long l = 0L;
			int i_0_ = charsequence.length();
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
				l *= 37L;
				char c = charsequence.charAt(i_1_);
				if (c >= 'A' && c <= 'Z')
					l += (long) (c + '\001' - 'A');
				else if (c >= 'a' && c <= 'z')
					l += (long) (c + '\001' - 'a');
				else if (c >= '0' && c <= '9')
					l += (long) ('\033' + c - '0');
				if (l >= 177917621779460413L) {
					if (i != -1842608537) {
						/* empty */
					}
					break;
				}
			}
			for (/**/; 0L == l % 37L && l != 0L; l /= 37L) {
				/* empty */
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.r(").append(')').toString());
		}
	}

	public static Class146 method1180(int i, int i_2_) {
		try {
			if (((Class146) Class146.aClass146_1607).anInt1613 * 181293251 == i)
				return Class146.aClass146_1607;
			if (181293251 * ((Class146) Class146.aClass146_1611).anInt1613 == i)
				return Class146.aClass146_1611;
			if (i == ((Class146) Class146.aClass146_1609).anInt1613 * 181293251)
				return Class146.aClass146_1609;
			if (((Class146) Class146.aClass146_1610).anInt1613 * 181293251 == i)
				return Class146.aClass146_1610;
			if (i == 181293251 * ((Class146) Class146.aClass146_1608).anInt1613)
				return Class146.aClass146_1608;
			if (181293251 * ((Class146) Class146.aClass146_1612).anInt1613 == i)
				return Class146.aClass146_1612;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.r(").append(')').toString());
		}
	}

	static Class374 method1181(Buffer class330_sub46, int i) {
		try {
			int i_3_ = class330_sub46.readUnsignedByte(1405242760);
			int i_4_ = class330_sub46.readUnsignedByte(-305227508);
			int i_5_ = class330_sub46.readUnsignedByte(210292791);
			int[] is = new int[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
				is[i_6_] = class330_sub46.readUnsignedByte(1928197893);
			return new Class374(i_3_, i_4_, is);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.o(").append(')').toString());
		}
	}

	public static void method1182(int i, int i_7_, int i_8_, boolean bool, int i_9_) {
		try {
			client.aLong9113 = 0L;
			int i_10_ = Class545.method6347(1079239502);
			if (i == 3 || i_10_ == 3)
				bool = true;
			if (!Class361.aClass_ra3793.t())
				bool = true;
			Class86.method980(i_10_, i, i_7_, i_8_, bool, -681123409);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.gd(").append(')').toString());
		}
	}

	static final void method1183(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class481.method6023(iComponentDefinitions, class120, class430, -573710888);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.ee(").append(')').toString());
		}
	}

	public static int method1184(CharSequence charsequence, int i) {
		try {
			int i_11_ = charsequence.length();
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
				i_12_ = (i_12_ << 5) - i_12_ + charsequence.charAt(i_13_);
			return i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dx.l(").append(')').toString());
		}
	}
}
