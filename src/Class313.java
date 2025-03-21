/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class313 implements Interface19 {
	public static Class61 aClass61_6650;

	public boolean method280(Class432_Sub1_Sub1 class432_sub1_sub1) {
		return class432_sub1_sub1 instanceof Interface2;
	}

	public boolean method279(Class432_Sub1_Sub1 class432_sub1_sub1, int i) {
		try {
			return class432_sub1_sub1 instanceof Interface2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("n.r(").append(')').toString());
		}
	}

	public boolean method278(Class432_Sub1_Sub1 class432_sub1_sub1) {
		return class432_sub1_sub1 instanceof Interface2;
	}

	public boolean method281(Class432_Sub1_Sub1 class432_sub1_sub1) {
		return class432_sub1_sub1 instanceof Interface2;
	}

	public static void method3115(Class440 class440, int i, byte i_0_) {
		try {
			if (-1098735395 * Class333.anInt3360 < 50 && (null != class440 && class440.anIntArrayArray4463 != null && i < class440.anIntArrayArray4463.length && null != class440.anIntArrayArray4463[i])) {
				int i_1_ = class440.anIntArrayArray4463[i][0];
				int i_2_ = i_1_ >> 8;
				int i_3_ = i_1_ >> 5 & 0x7;
				if (class440.anIntArrayArray4463[i].length > 1) {
					int i_4_ = (int) (Math.random() * (double) (class440.anIntArrayArray4463[i]).length);
					if (i_4_ > 0)
						i_2_ = class440.anIntArrayArray4463[i][i_4_];
				}
				int i_5_ = 256;
				if (class440.anIntArray4468 != null && null != class440.anIntArray4478)
					i_5_ = Class340.method3970(class440.anIntArray4468[i], class440.anIntArray4478[i], 1852239889);
				int i_6_ = (class440.anIntArray4476 == null ? 255 : class440.anIntArray4476[i]);
				if (class440.aBoolean4475)
					Class197.method2147(i_2_, i_3_, 0, i_6_, false, i_5_, 828842400);
				else
					Class115.method1415(i_2_, i_3_, 0, i_6_, i_5_, (byte) -1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("n.l(").append(')').toString());
		}
	}

	static final void method3116(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class464_Sub23.aClass350_8712.method4031((short) 18352);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("n.vf(").append(')').toString());
		}
	}

	static final void method3117(Class330_Sub10 class330_sub10, int i) {
		try {
			Class356 class356 = client.aClass304_9030.method3023(-400722441);
			if (class356 != null) {
				Interface2 interface2 = null;
				if (((Class330_Sub10) class330_sub10).anInt7575 * 1982913715 == 0)
					interface2 = (Interface2) (class356.method4154((((Class330_Sub10) class330_sub10).anInt7581) * 525431007, -533165901 * class330_sub10.anInt7582, class330_sub10.anInt7577 * 2127793995, -2040838155));
				if (((Class330_Sub10) class330_sub10).anInt7575 * 1982913715 == 1)
					interface2 = ((Interface2) class356.method4156(525431007 * (((Class330_Sub10) class330_sub10).anInt7581), (class330_sub10.anInt7582 * -533165901), (class330_sub10.anInt7577 * 2127793995), 1964913197));
				if (2 == (1982913715 * ((Class330_Sub10) class330_sub10).anInt7575))
					interface2 = ((Interface2) (class356.method4158((525431007 * ((Class330_Sub10) class330_sub10).anInt7581), -533165901 * class330_sub10.anInt7582, 2127793995 * class330_sub10.anInt7577, client.anInterface19_9266, (byte) -87)));
				if (1982913715 * ((Class330_Sub10) class330_sub10).anInt7575 == 3)
					interface2 = (Interface2) (class356.method4177((((Class330_Sub10) class330_sub10).anInt7581) * 525431007, -533165901 * class330_sub10.anInt7582, 2127793995 * class330_sub10.anInt7577, 1315717432));
				if (null != interface2) {
					((Class330_Sub10) class330_sub10).anInt7578 = interface2.method34((short) -985) * 1246985471;
					((Class330_Sub10) class330_sub10).anInt7580 = interface2.method21(1020268653) * -2138857365;
					((Class330_Sub10) class330_sub10).anInt7579 = interface2.method33((byte) -100) * 516543733;
				} else {
					((Class330_Sub10) class330_sub10).anInt7578 = -1246985471;
					((Class330_Sub10) class330_sub10).anInt7580 = 0;
					((Class330_Sub10) class330_sub10).anInt7579 = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("n.p(").append(')').toString());
		}
	}

	public static void method3118(int i, int i_7_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(14, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("n.v(").append(')').toString());
		}
	}
}
