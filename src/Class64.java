/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64 {
	public Class64 aClass64_562;
	public int anInt563;
	public int anInt564;
	public int anInt565;
	public int anInt566;
	public int anInt567;
	public Class249 aClass249_568;
	static IComponentDefinitions aClass114_569;

	public Class208 method771(int i) {
		try {
			return Class539.method6326(anInt564 * 918085747, -1856459371);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.r(").append(')').toString());
		}
	}

	Class64 method772(int i, int i_0_) {
		try {
			return new Class64(918085747 * anInt564, i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.j(").append(')').toString());
		}
	}

	Class64(int i, int i_1_) {
		anInt564 = 1567933627 * i;
		anInt566 = i_1_ * 2126578851;
	}

	static void method773(int i) {
		try {
			if (Class5.anInt72 * -356771275 > 0) {
				int i_2_ = 0;
				for (int i_3_ = 0; i_3_ < Class5.aStringArray68.length; i_3_++) {
					if (Class5.aStringArray68[i_3_].indexOf("--> ") != -1 && ++i_2_ == Class5.anInt72 * -356771275) {
						Class5.aString73 = (Class5.aStringArray68[i_3_].substring(Class5.aStringArray68[i_3_].indexOf('>') + 2));
						break;
					}
				}
			} else
				Class5.aString73 = "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.w(").append(')').toString());
		}
	}

	static final void method774(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub16_7900), 0, 732304971);
			Class435.method5568(1628276159);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.apl(").append(')').toString());
		}
	}

	static final void method775(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class109.method1352(iComponentDefinitions, class120, class430, (byte) 6);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.ck(").append(')').toString());
		}
	}

	static final void method776(int i) {
		try {
			for (Class330_Sub10 class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854)); null != class330_sub10; class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -59)))
				Class254.method2537(class330_sub10, false, 2044632032);
			for (Class330_Sub10 class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854)); class330_sub10 != null; class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -115)))
				Class254.method2537(class330_sub10, true, 2088858046);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.o(").append(')').toString());
		}
	}

	static void method777(int i) {
		try {
			Class484.aClass330_Sub36_Sub10_5778 = (new Class330_Sub36_Sub10(Class526.aClass526_6041.method6257(Class429.aClass454_4369, 991479434), "", -1676605053 * client.anInt9147, 1006, -1, 0L, 0, 0, true, false, 0L, true));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.s(").append(')').toString());
		}
	}

	public static void method778(int i, byte i_4_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(22, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.f(").append(')').toString());
		}
	}

	public static int method779(int i, int i_5_) {
		try {
			int i_6_ = 0;
			if (i < 0 || i >= 65536) {
				i >>>= 16;
				i_6_ += 16;
			}
			if (i >= 256) {
				i >>>= 8;
				i_6_ += 8;
			}
			if (i >= 16) {
				i >>>= 4;
				i_6_ += 4;
			}
			if (i >= 4) {
				i >>>= 2;
				i_6_ += 2;
			}
			if (i >= 1) {
				i >>>= 1;
				i_6_++;
			}
			return i_6_ + i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cp.f(").append(')').toString());
		}
	}
}
