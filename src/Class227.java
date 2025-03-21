/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class227 {
	static Class227 aClass227_2411;
	public static Class227 aClass227_2412;
	public static Class227 aClass227_2413 = new Class227(14, 0);
	public static Class227 aClass227_2414;
	static Class227 aClass227_2415;
	public static Class227 aClass227_2416;
	public static Class227 aClass227_2417;
	static Class227 aClass227_2418;
	public static Class227 aClass227_2419;
	public static Class227 aClass227_2420;
	public static Class227 aClass227_2421;
	public int anInt2422;
	static Class227[] aClass227Array2423;
	static boolean aBoolean2424;

	Class227(int i, int i_0_) {
		anInt2422 = 894920829 * i;
	}

	static {
		aClass227_2412 = new Class227(15, -1);
		aClass227_2416 = new Class227(16, -2);
		aClass227_2414 = new Class227(19, -2);
		aClass227_2415 = new Class227(23, 4);
		aClass227_2411 = new Class227(24, -1);
		aClass227_2417 = new Class227(26, 0);
		aClass227_2418 = new Class227(27, 0);
		aClass227_2419 = new Class227(28, -2);
		aClass227_2420 = new Class227(29, -2);
		aClass227_2421 = new Class227(30, -2);
		aClass227Array2423 = new Class227[32];
		Class227[] class227s = Class410.method5223((byte) -76);
		for (int i = 0; i < class227s.length; i++)
			aClass227Array2423[class227s[i].anInt2422 * 1162563797] = class227s[i];
	}

	static final void method2310(Class430 class430, byte i) {
		try {
			((Class430) class430).aLongArray4379[((((Class430) class430).anInt4380 += 2099007437) * -1969146619 - 1)] = (((Class430) class430).aClass330_Sub36_Sub8_4393.aLongArray9675[-54918871 * ((Class430) class430).anInt4397]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jn.bs(").append(')').toString());
		}
	}

	public static void method2311(int loginType, int i_1_) {
		try {
			if (client.anInt8995 * -296919301 != loginType) {
				client.anInt9199 = 0;
				if (9 == loginType || 0 == loginType)
					Class371.method4321(2097298366);
				if (loginType != 9 && null != Class274.aClass357_2852) {
					Class274.aClass357_2852.method4197(1463544803);
					Class274.aClass357_2852 = null;
				}
				if (loginType == 6)
					Class210.method2216((-296919301 * client.anInt8995 == 14 || 8 == -296919301 * client.anInt8995 || (231532293 * (Class396.aClass417_4108.anInt4272) != (client.windowPaneId * 1522181389))), 629730926);
				if (loginType == 15)
					Class_ta.method5680((1522181389 * client.windowPaneId != (Class396.aClass417_4108.anInt4284 * -1681964337)), 33071);
				if (loginType == 3 || 4 == loginType) {
					if (!Class26.method489(1782132682))
						return;
				} else if (loginType == 18 || loginType == 11 && 7 != client.anInt8995 * -296919301) {
					if (!Class371.method4321(1771857101))
						return;
				} else if (8 == loginType)
					Class545.method6348((byte) 66);
				if (Class438.method5593(loginType, -1964757127)) {
					client.aClass304_9030.method3004((byte) 22);
					Class517.method6212(true, 371449206);
				}
				if (16 == loginType || loginType == 6)
					Class408.method4766(405347915);
				boolean bool = (10 == loginType || Class522.method6230(loginType, -2131895214) || Class226.method2307(loginType, (byte) 49));
				boolean bool_2_ = (-296919301 * client.anInt8995 == 10 || Class522.method6230(-296919301 * client.anInt8995, 423131101) || Class226.method2307(-296919301 * client.anInt8995, (byte) 49));
				if (bool_2_ != bool) {
					if (bool) {
						Class333.musicId = Class333.anInt3346 * 542372231;
						if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7909.method5841(-1824075931) != 0) {
							Class6.method408(2, Class89.aClass280_735, Class333.anInt3346 * -1482561369, 0, Class448.aClass330_Sub50_5555.aClass464_Sub30_7909.method5841(-1999523874), false, -1816789524);
							Class479.method6014(-1286168111);
						} else
							Class400.method4704(2, (byte) 29);
						Class140_Sub1.aClass285_7263.method2839(false, 2050348790);
					} else {
						Class400.method4704(2, (byte) 16);
						Class140_Sub1.aClass285_7263.method2839(true, -512706772);
					}
				}
				if (Class438.method5593(loginType, 190940593) || 9 == loginType || loginType == 0)
					Class361.aClass_ra3793.am();
				client.anInt8995 = loginType * 798358579;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jn.fg(").append(')').toString());
		}
	}

	static void method2312(Class353 class353, int i) {
		try {
			class353.aClass432_Sub1_3489 = null;
			synchronized (Class353.aStack3488) {
				if (Class353.aStack3488.size() < 200)
					Class353.aStack3488.push(class353);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jn.j(").append(')').toString());
		}
	}
}
