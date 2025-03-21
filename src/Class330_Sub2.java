/* Class330_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class330_Sub2 extends Class330 {
	public int anInt7502;
	public static int anInt7503 = 16;
	public static int anInt7504 = 4;
	public static int anInt7505 = 8;
	public static int anInt7506 = 2;
	public static int anInt7507 = 32;
	public static int anInt7508 = 64;
	static Class330_Sub2 aClass330_Sub2_7509 = new Class330_Sub2(0, -1);
	public int anInt7510;
	public static int anInt7511 = 1;

	public final boolean method3262(short i) {
		try {
			return 0 != (anInt7510 * -1700263873 >> 22 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.f(").append(')').toString());
		}
	}

	public final boolean method3263(byte i) {
		try {
			return (-1700263873 * anInt7510 & 0x1) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.r(").append(')').toString());
		}
	}

	public final boolean method3264(int i, int i_0_) {
		try {
			return 0 != (-1700263873 * anInt7510 >> i + 1 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.j(").append(')').toString());
		}
	}

	public final int method3265(byte i) {
		try {
			return Class535.method6311(-1700263873 * anInt7510, -119506356);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.i(").append(')').toString());
		}
	}

	public Class330_Sub2(int i, int i_1_) {
		anInt7510 = i * 512747455;
		anInt7502 = i_1_ * -1710480095;
	}

	public final boolean method3266(int i) {
		try {
			return 0 != (anInt7510 * -1700263873 >> 21 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.s(").append(')').toString());
		}
	}

	public final boolean method3267(int i) {
		try {
			return 0 != (anInt7510 * -1700263873 >> 23 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.z(").append(')').toString());
		}
	}

	public final int method3268(byte i) {
		try {
			return anInt7510 * -1700263873 >> 18 & 0x7;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.o(").append(')').toString());
		}
	}

	static final void method3269(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, -830947946);
			Class120 class120 = Class3.aClass120Array56[i_2_ >> 16];
			Class212.method2224(iComponentDefinitions, class120, class430, -1542584207);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acc.nn(").append(')').toString());
		}
	}
}
