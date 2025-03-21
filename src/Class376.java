/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class376 {
	Class376() throws Throwable {
		throw new Error();
	}

	static void method4359(Class430 class430, int i) {
		try {
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 2]), -1607557005).aStringArray4103[(((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1])]);
			((Class430) class430).anInt4376 -= 1514958270;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.a(").append(')').toString());
		}
	}

	static final void method4360(IComponentDefinitions iComponentDefinitions, Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_1_ = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) - 1);
			int i_2_ = i_1_;
			if (iComponentDefinitions.anInt1238 * -276075115 != 6 && -276075115 * iComponentDefinitions.anInt1238 != 2)
				throw new RuntimeException("");
			Class551 class551 = Class158_Sub3.aClass553_8875.method6392((iComponentDefinitions.anInt1239 * -1576413395), 1133312203);
			if (iComponentDefinitions.aClass538_1362 == null)
				iComponentDefinitions.aClass538_1362 = new Class538(class551, iComponentDefinitions.anInt1238 * -276075115 == 6);
			iComponentDefinitions.aClass538_1362.aLong6242 = Class116.method1418(735911697) * 7415089317549594679L;
			if (class551.aByteArray6291 != null) {
				if (i_1_ < 0 || i_1_ >= class551.aByteArray6291.length)
					throw new RuntimeException("");
				i_2_ = class551.aByteArray6291[i_1_];
			}
			if (class551.aShortArray6301 == null || i_2_ < 0 || i_2_ >= class551.aShortArray6301.length)
				throw new RuntimeException("");
			iComponentDefinitions.aClass538_1362.aShortArray6241[i_2_] = (short) i_0_;
			Class404.method4738(iComponentDefinitions, 573069468);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.qx(").append(')').toString());
		}
	}

	static final void method4361(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			Class330_Sub36_Sub1 class330_sub36_sub1 = OutgoingPacket.aClass534_2580.method6305((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376) * 1632830751)]), (byte) 38);
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			int i_4_ = -1;
			for (int i_5_ = 0; i_5_ < class330_sub36_sub1.anInt9289 * -458733071; i_5_++) {
				if (i_3_ == class330_sub36_sub1.anIntArray9288[i_5_]) {
					i_4_ = class330_sub36_sub1.anIntArray9287[i_5_];
					break;
				}
			}
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.tt(").append(')').toString());
		}
	}

	static final void method4362(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5766((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.ala(").append(')').toString());
		}
	}

	static final void method4363(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (string.startsWith(Class325_Sub4.method3225(0, 596449850)) || string.startsWith(Class325_Sub4.method3225(1, -893574549)))
				string = string.substring(7);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class432_Sub1_Sub1_Sub1.method5458(string, 332783019) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.wy(").append(')').toString());
		}
	}

	public static final void method4364(int i, int i_6_, int i_7_, int i_8_, boolean bool, byte i_9_) {
		try {
			if (i_7_ < 1)
				i_7_ = 1;
			if (i_8_ < 1)
				i_8_ = 1;
			int i_10_ = i_8_ - 334;
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ > 100)
				i_10_ = 100;
			int i_11_ = (client.aShort8962 + (client.aShort9067 - client.aShort8962) * i_10_ / 100);
			int i_12_ = 512 * (i_11_ * i_8_) / (334 * i_7_);
			if (i_12_ < client.aShort9249) {
				i_12_ = client.aShort9249;
				i_11_ = i_12_ * i_7_ * 334 / (512 * i_8_);
				if (i_11_ > client.aShort9203) {
					i_11_ = client.aShort9203;
					int i_13_ = i_11_ * i_8_ * 512 / (i_12_ * 334);
					int i_14_ = (i_7_ - i_13_) / 2;
					if (bool) {
						Class361.aClass_ra3793.L();
						Class361.aClass_ra3793.method4789(i, i_6_, i_14_, i_8_, -16777216, 463754225);
						Class361.aClass_ra3793.method4789(i + i_7_ - i_14_, i_6_, i_14_, i_8_, -16777216, 463754225);
					}
					i += i_14_;
					i_7_ -= 2 * i_14_;
				}
			} else if (i_12_ > client.aShort8965) {
				i_12_ = client.aShort8965;
				i_11_ = 334 * (i_7_ * i_12_) / (512 * i_8_);
				if (i_11_ < client.aShort9191) {
					i_11_ = client.aShort9191;
					int i_15_ = 334 * (i_7_ * i_12_) / (512 * i_11_);
					int i_16_ = (i_8_ - i_15_) / 2;
					if (bool) {
						Class361.aClass_ra3793.L();
						Class361.aClass_ra3793.method4789(i, i_6_, i_7_, i_16_, -16777216, 463754225);
						Class361.aClass_ra3793.method4789(i, i_8_ + i_6_ - i_16_, i_7_, i_16_, -16777216, 463754225);
					}
					i_6_ += i_16_;
					i_8_ -= 2 * i_16_;
				}
			}
			client.anInt9115 = i_11_ * i_8_ / 334 * -686038303;
			client.anInt9251 = -749360161 * i;
			client.anInt9166 = -1552766307 * i_6_;
			client.anInt9255 = 1289923641 * (short) i_7_;
			client.anInt9102 = 100573627 * (short) i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.iz(").append(')').toString());
		}
	}

	public static int method4365(int i) {
		try {
			return 12;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.s(").append(')').toString());
		}
	}

	public static void method4366(byte i) {
		try {
			Class467.method5859(-1914900388);
			Class296.method2933(22050, Class448.aClass330_Sub50_5555.aClass464_Sub17_7910.method5798((byte) -6) == 1, 2);
			Class95_Sub11.aClass296_7171 = Class296.method2934(Class475.aCanvas5700, 0, 22050);
			Class338.method3960(true, Class457.method5660(null, 232703028), (byte) 125);
			Class330_Sub42.aClass296_7818 = Class296.method2934(Class475.aCanvas5700, 1, 2048);
			Class330_Sub42.aClass296_7818.method2935(Class511.aClass330_Sub40_Sub4_5951);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.i(").append(')').toString());
		}
	}

	public static final void method4367(byte i) {
		try {
			Class332.aClass315_6604.method3124((byte) 1);
			for (int i_17_ = 0; i_17_ < 32; i_17_++)
				Class332.aLongArray6606[i_17_] = 0L;
			for (int i_18_ = 0; i_18_ < 32; i_18_++)
				Class332.aLongArray6616[i_18_] = 0L;
			Class332.anInt6636 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.al(").append(')').toString());
		}
	}

	public static boolean method4368(int i, int i_19_) {
		try {
			return i != 1 && i != 7;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.j(").append(')').toString());
		}
	}

	static final void method4369(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class250.method2517(iComponentDefinitions, class120, class430, (byte) 3);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pq.dx(").append(')').toString());
		}
	}
}
