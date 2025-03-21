/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class233 {
	public static int anInt2464 = 15;
	public static int anInt2465 = 15;
	public static int anInt2466 = 32768;
	public static Class519 aClass519_2467;

	Class233() throws Throwable {
		throw new Error();
	}

	public static void method2362(byte i) {
		try {
			if (null != Class95_Sub11.aClass296_7171)
				Class95_Sub11.aClass296_7171.method2932();
			if (null != Class330_Sub42.aClass296_7818)
				Class330_Sub42.aClass296_7818.method2932();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jt.f(").append(')').toString());
		}
	}

	static void method2363(Class_ra class_ra, IComponentDefinitions iComponentDefinitions, int i, int i_0_, int i_1_) {
		try {
			if (null != Class263_Sub2.myPlayer) {
				class_ra.method4804();
				Class122 class122 = iComponentDefinitions.method1396(class_ra, (byte) -8);
				if (class122 != null) {
					Class_ta class_ta = class122.aClass_ta1408;
					class_ra.r(i, i_0_, i + -681123409 * iComponentDefinitions.anInt1210, 694142557 * iComponentDefinitions.anInt1348 + i_0_);
					if ((-1683271523 * class122.anInt1407 != -681123409 * iComponentDefinitions.anInt1210) || (-1389305879 * class122.anInt1405 != 694142557 * iComponentDefinitions.anInt1348))
						throw new IllegalStateException("");
					if (2 != 221140443 * Class9.anInt140 && 5 != Class9.anInt140 * 221140443 && Class9.aClass61_152 != null) {
						Class381 class381 = client.aClass304_9030.method3022(187429625);
						int i_2_;
						int i_3_;
						int i_4_;
						int i_5_;
						if (5 == Class147.anInt1621 * -1551406343) {
							i_2_ = 1983170851 * client.anInt9068;
							i_3_ = client.anInt9069 * -427254073;
							i_4_ = (int) -client.aFloat9141 & 0x3fff;
							i_5_ = 4096;
						} else {
							Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
							i_2_ = (int) class260.aFloat2716;
							i_3_ = (int) class260.aFloat2711;
							i_4_ = ((int) -client.aFloat9141 + -603680235 * client.anInt9149) & 0x3fff;
							i_5_ = 4096 - client.anInt9063 * 641745296;
						}
						int i_6_ = i_2_ / 128 + 48;
						int i_7_ = (48 + (client.aClass304_9030.method3033((byte) -104) * 4) - i_3_ / 128);
						Class9.aClass61_152.method734(((float) (-681123409 * iComponentDefinitions.anInt1210) / 2.0F + (float) i), (float) i_0_ + (float) (iComponentDefinitions.anInt1348 * 694142557) / 2.0F, (float) i_6_, (float) i_7_, i_5_, i_4_ << 2, class_ta, i, i_0_);
						Class351 class351 = client.aClass304_9030.method3031((byte) -104);
						for (Class330_Sub23 class330_sub23 = (Class330_Sub23) Class9.aClass471_145.method5869(539664854); class330_sub23 != null; class330_sub23 = ((Class330_Sub23) Class9.aClass471_145.method5873((byte) -92))) {
							int i_8_ = class330_sub23.anInt7693 * 393599711;
							int i_9_ = ((class351.anIntArray3480[i_8_] >> 14 & 0x3fff) - class381.gameSceneBaseX * -1261027839);
							int i_10_ = ((class351.anIntArray3480[i_8_] & 0x3fff) - class381.gameSceneBaseY * -1542584207);
							int i_11_ = i_9_ * 4 + 2 - i_2_ / 128;
							int i_12_ = 2 + i_10_ * 4 - i_3_ / 128;
							Class304.method3036(class_ra, class_ta, iComponentDefinitions, i, i_0_, i_11_, i_12_, class351.anIntArray3481[i_8_], (byte) 23);
						}
						for (int i_13_ = 0; i_13_ < -1788950589 * Class9.anInt142; i_13_++) {
							int i_14_ = (4 * Class9.anIntArray148[i_13_] + 2 - i_2_ / 128);
							int i_15_ = (Class9.anIntArray143[i_13_] * 4 + 2 - i_3_ / 128);
							Class473 class473 = (client.aClass304_9030.method3025((byte) 13).method5705(Class9.anIntArray144[i_13_], (byte) -126));
							if (null != class473.anIntArray5678) {
								class473 = class473.method5900((Class158.aClass561_6474), (byte) 100);
								if (class473 == null)
									continue;
								if (1552992833 * class473.anInt5651 == -1) {
									if (i_1_ == -1571986388)
										continue;
									return;
								}
							}
							Class304.method3036(class_ra, class_ta, iComponentDefinitions, i, i_0_, i_14_, i_15_, (1552992833 * class473.anInt5651), (byte) -71);
						}
						for (Class330_Sub9 class330_sub9 = (Class330_Sub9) client.aClass497_9138.method6099((byte) -33); class330_sub9 != null; class330_sub9 = ((Class330_Sub9) client.aClass497_9138.method6098((short) -32768))) {
							int i_16_ = (int) ((-6154793640677333111L * class330_sub9.aLong3341) >> 28 & 0x3L);
							if (i_16_ == Class9.anInt138 * -949225339) {
								int i_17_ = ((int) ((class330_sub9.aLong3341 * -6154793640677333111L) & 0x3fffL) - class381.gameSceneBaseX * -1261027839);
								int i_18_ = ((int) ((class330_sub9.aLong3341 * -6154793640677333111L) >> 14 & 0x3fffL) - class381.gameSceneBaseY * -1542584207);
								int i_19_ = 2 + 4 * i_17_ - i_2_ / 128;
								int i_20_ = i_18_ * 4 + 2 - i_3_ / 128;
								Class464_Sub3.method5744(iComponentDefinitions, class_ta, i, i_0_, i_19_, i_20_, (Class76_Sub1.aClass61Array7097[0]), (byte) 0);
							}
						}
						Class526.method6263(class_ra, i_2_, i_3_, iComponentDefinitions, class_ta, i, i_0_, (byte) -104);
						Class198.method2158(i_2_, i_3_, iComponentDefinitions, class_ta, i, i_0_, -2065020355);
						Class535.method6314(i_2_, i_3_, iComponentDefinitions, class122, i, i_0_, 1270800454);
						if (5 != -1551406343 * Class147.anInt1621) {
							if (Class9.anInt146 * 552157293 != 0) {
								int i_21_ = (Class9.anInt146 * -2086338124 + 2 - i_2_ / 128 + (Class263_Sub2.myPlayer.method5453(-1539258713) - 1) * 2);
								int i_22_ = (2 + Class9.anInt151 * -1882444900 - i_3_ / 128 + (Class263_Sub2.myPlayer.method5453(-713829597) - 1) * 2);
								Class464_Sub3.method5744(iComponentDefinitions, class_ta, i, i_0_, i_21_, i_22_, (Class_v.aClass61Array7960[(Class9.aBoolean141 ? 1 : 0)]), (byte) 0);
							}
							if (!Class263_Sub2.myPlayer.hidden)
								class_ra.method4789((iComponentDefinitions.anInt1210 * -681123409 / 2) + i - 1, ((694142557 * iComponentDefinitions.anInt1348 / 2) + i_0_ - 1), 3, 3, -1, 463754225);
						}
					} else
						class_ra.DA(-16777216, class_ta, i, i_0_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jt.n(").append(')').toString());
		}
	}

	static final void method2364(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class410.method5221(iComponentDefinitions, class120, class430, -119881137);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jt.gx(").append(')').toString());
		}
	}

	static final void method2365(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			if ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]) >= (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]))
				((Class430) class430).anInt4397 += ((((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]) * 1996761881);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jt.ad(").append(')').toString());
		}
	}
}
