/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class283 {
	static int anInt2919 = 6;
	static int anInt2920 = 1;
	static int anInt2921 = 2;
	static int anInt2922 = 3;
	static int anInt2923 = 4;
	static int anInt2924 = 0;
	static int anInt2925 = 7;
	public static IndexTable aClass280_2926;

	Class283() throws Throwable {
		throw new Error();
	}

	static void method2825(String string, boolean bool, int i, int i_0_, String string_1_, boolean bool_2_, int i_3_) {
		try {
			string = string.toLowerCase();
			short[] is = new short[16];
			int i_4_ = -1;
			String string_5_ = null;
			if (i != -1) {
				Class537 class537 = Class301.aClass543_3059.method6339(i, -433138073);
				if (null == class537 || class537.method6321((byte) -25) != bool_2_)
					return;
				if (class537.method6321((byte) 5))
					string_5_ = class537.aString6236;
				else
					i_4_ = -735399997 * class537.anInt6235;
			}
			int i_6_ = 0;
			for (int i_7_ = 0; i_7_ < Class556.aClass510_6392.anInt6777 * 1665394075; i_7_++) {
				ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions(i_7_, (byte) -4);
				if (bool && !itemDefinitions.aBoolean6702) {
					if (i_3_ == 510874262)
						return;
				} else if (itemDefinitions.notedItemId * 1693216917 == -1 && 556764869 * itemDefinitions.anInt6720 == -1 && itemDefinitions.anInt6728 * 381773869 == -1) {
					if (itemDefinitions.anInt6744 * 308271419 != 0) {
						if (i_3_ == 510874262) {
							/* empty */
						}
					} else if (itemDefinitions.name.toLowerCase().indexOf(string) == -1) {
						if (i_3_ == 510874262) {
							/* empty */
						}
					} else {
						if (-1 != i) {
							if (bool_2_) {
								if (!string_1_.equals(itemDefinitions.method6288(i, string_5_, (byte) 0))) {
									if (i_3_ != 510874262)
										continue;
									return;
								}
							} else if (i_0_ != itemDefinitions.method6287(i, i_4_, 1943601657)) {
								if (i_3_ == 510874262) {
									/* empty */
								}
								continue;
							}
						}
						if (i_6_ >= 250) {
							Class440.anInt4482 = -1950675111;
							Class282_Sub1.aShortArray7443 = null;
							return;
						}
						if (i_6_ >= is.length) {
							short[] is_8_ = new short[2 * is.length];
							for (int i_9_ = 0; i_9_ < i_6_; i_9_++)
								is_8_[i_9_] = is[i_9_];
							is = is_8_;
						}
						is[i_6_++] = (short) i_7_;
					}
				}
			}
			Class282_Sub1.aShortArray7443 = is;
			Class432_Sub1_Sub4_Sub2.anInt10001 = 0;
			Class440.anInt4482 = i_6_ * 1950675111;
			String[] strings = new String[Class440.anInt4482 * -2048805097];
			for (int i_10_ = 0; i_10_ < -2048805097 * Class440.anInt4482; i_10_++)
				strings[i_10_] = (Class556.aClass510_6392.getItemDefinitions(is[i_10_], (byte) -107).name);
			Class389.method4592(strings, Class282_Sub1.aShortArray7443, -579037688);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lu.nq(").append(')').toString());
		}
	}

	static final void method2826(int i, int i_11_, int i_12_, int i_13_, Class481 class481, byte i_14_) {
		try {
			if (i_12_ >= 1 && i_13_ >= 1 && i_12_ <= client.aClass304_9030.method2990(-1877316391) - 2 && (i_13_ <= client.aClass304_9030.method3033((byte) -103) - 2)) {
				if (client.aClass304_9030.method3023(-400722441) != null) {
					Interface2 interface2 = client.aClass304_9030.method3001((byte) 120).method2713(i, i_11_, i_12_, i_13_, (byte) -106);
					if (null != interface2) {
						if (interface2 instanceof Class432_Sub1_Sub1_Sub5)
							((Class432_Sub1_Sub1_Sub5) interface2).method5506(class481, 2023590196);
						else if (interface2 instanceof Class432_Sub1_Sub4_Sub1)
							((Class432_Sub1_Sub4_Sub1) interface2).method5536(class481, (byte) 13);
						else if (interface2 instanceof Class432_Sub1_Sub5_Sub2)
							((Class432_Sub1_Sub5_Sub2) interface2).method5550(class481, 1948013395);
						else if (interface2 instanceof Class432_Sub1_Sub3_Sub2)
							((Class432_Sub1_Sub3_Sub2) interface2).method5530(class481, (byte) 0);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lu.z(").append(')').toString());
		}
	}

	static final void method2827(int i, int i_15_) {
		try {
			int i_16_ = 822953439 * client.anInt8981 - client.anInt9235 * -343659865;
			if (i_16_ >= 100) {
				Class147.anInt1621 = -780346076;
				Class439.anInt4456 = 1180637393;
				Class457.anInt6844 = 1651776935;
			} else {
				int i_17_ = (int) client.aFloat9250;
				if (client.anInt9272 * 1018235063 >> 8 > i_17_)
					i_17_ = client.anInt9272 * 1018235063 >> 8;
				if (client.aBooleanArray9238[4] && 128 + client.anIntArray9240[4] > i_17_)
					i_17_ = client.anIntArray9240[4] + 128;
				int i_18_ = (-630459895 * client.anInt9058 + (int) client.aFloat9141 & 0x3fff);
				Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
				Class464.method5725(IndexTable.anInt2906 * 690880753, (Class431.method5342((int) class260.aFloat2716, (int) class260.aFloat2711, -127654579 * Class85.anInt712, 1996761881) - client.anInt9077 * 1446019163), -977385539 * Class308.anInt3194, i_17_, i_18_, 600 + (i_17_ >> 3) * 3 << 2, i, 1587524396);
				float f = 1.0F - ((float) ((100 - i_16_) * ((100 - i_16_) * (100 - i_16_))) / 1000000.0F);
				Class471.anInt5612 = ((int) ((float) (Class420.anInt4309 * -72071135) + f * (float) (-1795110955 * Class471.anInt5612 - -72071135 * Class420.anInt4309)) * -106940035);
				Gfx.anInt578 = (-568170765 * (int) (((float) (Gfx.anInt578 * 2005017147 - Class344.anInt6814 * -1376138063) * f) + (float) (Class344.anInt6814 * -1376138063)));
				Class325_Sub3.anInt7484 = (1872779603 * (int) ((float) (801045163 * Class357.anInt3704) + f * (float) ((1947030235 * Class325_Sub3.anInt7484) - (Class357.anInt3704 * 801045163))));
				Class321.anInt7018 = (-1105882715 * (int) ((float) (Class95_Sub13.anInt7180 * 774728065) + f * (float) (-1875448275 * Class321.anInt7018 - 774728065 * (Class95_Sub13.anInt7180))));
				int i_19_ = (-626349281 * Class145_Sub1.anInt7266 - 1565891015 * Class455.anInt5563);
				if (i_19_ > 8192)
					i_19_ -= 16384;
				else if (i_19_ < -8192)
					i_19_ += 16384;
				Class145_Sub1.anInt7266 = -1543696161 * (int) ((float) i_19_ * f + (float) (1565891015 * Class455.anInt5563));
				Class145_Sub1.anInt7266 = -1543696161 * (Class145_Sub1.anInt7266 * -626349281 & 0x3fff);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lu.hq(").append(')').toString());
		}
	}

	public static void method2828(int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub20_7888), 2, -833547019);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub20_7889), 2, 1765268723);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub6_7882), 1, 788419869);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub27_7881), 1, 1083350640);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub4_7883), 1, 1737615771);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub11_7879), 1, -710295154);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub22_7892), 1, -1747373849);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub13_7893), 1, -191916304);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub28_7885), 2, 1762894261);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub2_7868), 1, 175434723);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub25_7896), 2, 1581280780);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub3_7880), 1, -2082501651);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub9_7899), 0, 1871267670);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub9_7874), 0, 2099071835);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub12_7906), 2, 500913001);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub18_7877, -1961860223 * Class134.aClass134_1515.anInt1516, -342676777);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub21_7875), 0, 297820833);
			if (null != Class361.aClass_ra3793 && Class361.aClass_ra3793.v() && Class361.aClass_ra3793.cg())
				Class361.aClass_ra3793.ca();
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub7_7891), 1, -957275153);
			Class325.method3212(1971858432);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub5_7890), 0, -40143126);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub16_7900), 4, 390868653);
			Class22.method473((byte) -39);
			client.aClass304_9030.method3008(732744027).method4582(802539110);
			client.aBoolean8992 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lu.z(").append(')').toString());
		}
	}
}
