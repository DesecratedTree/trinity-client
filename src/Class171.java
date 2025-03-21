/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class171 {
	String aString1726;
	public static int anInt1727;
	String aString1728;
	String aString1729;
	static Class471 aClass471_1730;

	Class171(String string, String string_0_, String string_1_) {
		((Class171) this).aString1726 = string;
		((Class171) this).aString1729 = string_0_;
		((Class171) this).aString1728 = string_1_;
	}

	static final void method2045(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (null != Class354_Sub1.aClass497_7990) {
				Class330 class330 = Class354_Sub1.aClass497_7990.method6094((long) i_2_);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class330 != null ? 1 : 0;
			} else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gz.afk(").append(')').toString());
		}
	}

	public static void method2046(int i, boolean bool, int i_3_) {
		try {
			Class306.method3055(i, Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434), bool, (short) 860);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gz.fn(").append(')').toString());
		}
	}

	static void method2047(Class330_Sub20 class330_sub20, int i, int i_4_, int i_5_, int i_6_, short i_7_) {
		try {
			if (-1 != ((Class330_Sub20) class330_sub20).anInt7655 * -1630056649 || null != ((Class330_Sub20) class330_sub20).anIntArray7678) {
				int i_8_ = 0;
				int i_9_ = (((Class330_Sub20) class330_sub20).anInt7659 * 1939814999 * Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-1968550516)) >> 8;
				if (i_4_ > (((Class330_Sub20) class330_sub20).anInt7656 * -1749264691))
					i_8_ += i_4_ - -1749264691 * ((Class330_Sub20) class330_sub20).anInt7656;
				else if (i_4_ < (((Class330_Sub20) class330_sub20).anInt7671 * 1615454101))
					i_8_ += 1615454101 * (((Class330_Sub20) class330_sub20).anInt7671) - i_4_;
				if (i_5_ > (-1425152837 * ((Class330_Sub20) class330_sub20).anInt7668))
					i_8_ += i_5_ - (((Class330_Sub20) class330_sub20).anInt7668 * -1425152837);
				else if (i_5_ < (((Class330_Sub20) class330_sub20).anInt7654 * -469341527))
					i_8_ += (((Class330_Sub20) class330_sub20).anInt7654 * -469341527) - i_5_;
				if ((((Class330_Sub20) class330_sub20).anInt7658 * -1863433201 == 0) || i_8_ - 256 > (((Class330_Sub20) class330_sub20).anInt7658) * -1863433201 || Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-2062338575) == 0 || (((Class330_Sub20) class330_sub20).anInt7652 * -1690082073) != i) {
					if (null != (((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675)) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675);
						((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675 = null;
						((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7674 = null;
						((Class330_Sub20) class330_sub20).aClass330_Sub41_7648 = null;
					}
					if (null != (((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683)) {
						Class511.aClass330_Sub40_Sub4_5951.method3685(((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683);
						((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683 = null;
						((Class330_Sub20) class330_sub20).aClass330_Sub41_7673 = null;
						((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7681 = null;
					}
				} else {
					i_8_ -= 256;
					if (i_8_ < 0)
						i_8_ = 0;
					int i_10_ = ((-1863433201 * ((Class330_Sub20) class330_sub20).anInt7658) - (((Class330_Sub20) class330_sub20).anInt7679 * 898040631));
					if (i_10_ < 0)
						i_10_ = (-1863433201 * ((Class330_Sub20) class330_sub20).anInt7658);
					int i_11_ = i_9_;
					int i_12_ = i_8_ - (((Class330_Sub20) class330_sub20).anInt7679 * 898040631);
					if (i_12_ > 0 && i_10_ > 0)
						i_11_ = i_9_ * (i_10_ - i_12_) / i_10_;
					Class263_Sub2.myPlayer.method5453(-1494581090);
					int i_13_ = 8192;
					int i_14_ = (((((Class330_Sub20) class330_sub20).anInt7671 * 1615454101) + -1749264691 * (((Class330_Sub20) class330_sub20).anInt7656)) / 2 - i_4_);
					int i_15_ = (((-469341527 * ((Class330_Sub20) class330_sub20).anInt7654) + -1425152837 * (((Class330_Sub20) class330_sub20).anInt7668)) / 2 - i_5_);
					if (0 != i_14_ || i_15_ != 0) {
						int i_16_ = ((-(Class145_Sub1.anInt7266 * -626349281) - (int) (Math.atan2((double) i_14_, (double) i_15_) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_16_ > 8192)
							i_16_ = 16384 - i_16_;
						int i_17_;
						if (i_8_ <= 0)
							i_17_ = 8192;
						else if (i_8_ >= 4096)
							i_17_ = 16384;
						else
							i_17_ = 8192 + 8192 * i_8_ / 4096;
						i_13_ = i_17_ * i_16_ / 8192 + (16384 - i_17_ >> 1);
					}
					if (null == (((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675)) {
						if ((-1630056649 * ((Class330_Sub20) class330_sub20).anInt7655) >= 0) {
							i_14_ = ((256 == (((Class330_Sub20) class330_sub20).anInt7680) * 326586447 && (((Class330_Sub20) class330_sub20).anInt7669) * -112392099 == 256) ? 256 : Class340.method3970((-112392099 * (((Class330_Sub20) class330_sub20).anInt7669)), ((((Class330_Sub20) class330_sub20).anInt7680) * 326586447), 1598024373));
							if (((Class330_Sub20) class330_sub20).aBoolean7672) {
								if ((((Class330_Sub20) class330_sub20).aClass330_Sub41_7648) == null)
									((Class330_Sub20) class330_sub20).aClass330_Sub41_7648 = (Class330_Sub41.method3697(Class145_Sub1.aClass280_7265, (((Class330_Sub20) class330_sub20).anInt7655) * -1630056649));
								if (null != (((Class330_Sub20) class330_sub20).aClass330_Sub41_7648)) {
									if (null == (((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7674))
										((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7674 = ((Class330_Sub20) class330_sub20).aClass330_Sub41_7648.method3699();
									if ((((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7674) != null) {
										Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2 = ((Class330_Sub40_Sub3_Sub2) (((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7674.method3403(i_14_, i_11_ << 6, i_13_)));
										class330_sub40_sub3_sub2.method3624(-1, -1821201893);
										Class511.aClass330_Sub40_Sub4_5951.method3684(class330_sub40_sub3_sub2);
										((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675 = class330_sub40_sub3_sub2;
									}
								}
							} else {
								Class302 class302 = Class302.method2982((Class428.aClass280_4362), ((((Class330_Sub20) class330_sub20).anInt7655) * -1630056649), 0);
								if (null != class302) {
									Class330_Sub29_Sub1_Sub2 class330_sub29_sub1_sub2 = (class302.method2981().method3409(Class427.aClass294_4350));
									Class330_Sub40_Sub3_Sub1 class330_sub40_sub3_sub1 = ((Class330_Sub40_Sub3_Sub1) (class330_sub29_sub1_sub2.method3403(i_14_, i_11_ << 6, i_13_)));
									class330_sub40_sub3_sub1.method3624(-1, -1536427511);
									Class511.aClass330_Sub40_Sub4_5951.method3684(class330_sub40_sub3_sub1);
									((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675 = class330_sub40_sub3_sub1;
								}
							}
						}
					} else {
						((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675.method3625(i_11_, (byte) 10);
						((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675.method3636(i_13_, 1173339310);
					}
					if (null == (((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683)) {
						if (null != (((Class330_Sub20) class330_sub20).anIntArray7678) && (((Class330_Sub20) class330_sub20).anInt7670 -= i_6_ * 945549449) * -1629977159 <= 0) {
							i_14_ = ((256 == (((Class330_Sub20) class330_sub20).anInt7680) * 326586447 && 256 == -112392099 * (((Class330_Sub20) class330_sub20).anInt7669)) ? 256 : ((int) (Math.random() * (double) (((((Class330_Sub20) class330_sub20).anInt7680) * 326586447) - ((((Class330_Sub20) class330_sub20).anInt7669) * -112392099))) + (((Class330_Sub20) class330_sub20).anInt7669) * -112392099));
							if (((Class330_Sub20) class330_sub20).aBoolean7662) {
								if ((((Class330_Sub20) class330_sub20).aClass330_Sub41_7673) == null) {
									i_15_ = (int) (Math.random() * (double) (((Class330_Sub20) class330_sub20).anIntArray7678).length);
									((Class330_Sub20) class330_sub20).aClass330_Sub41_7673 = (Class330_Sub41.method3697(Class145_Sub1.aClass280_7265, (((Class330_Sub20) class330_sub20).anIntArray7678[i_15_])));
								}
								if (null != (((Class330_Sub20) class330_sub20).aClass330_Sub41_7673)) {
									if ((((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7681) == null)
										((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7681 = ((Class330_Sub20) class330_sub20).aClass330_Sub41_7673.method3699();
									if (null != (((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7681)) {
										Class330_Sub40_Sub3_Sub2 class330_sub40_sub3_sub2 = ((Class330_Sub40_Sub3_Sub2) (((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7681.method3403(i_14_, i_11_ << 6, i_13_)));
										class330_sub40_sub3_sub2.method3624(0, -1454651790);
										Class511.aClass330_Sub40_Sub4_5951.method3684(class330_sub40_sub3_sub2);
										((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683 = class330_sub40_sub3_sub2;
										((Class330_Sub20) class330_sub20).anInt7670 = (((((Class330_Sub20) class330_sub20).anInt7676 * 996172827) + (int) (Math.random() * (double) (((((Class330_Sub20) class330_sub20).anInt7677) * -1128686737) - (996172827 * (((Class330_Sub20) class330_sub20).anInt7676))))) * 945549449);
									}
								}
							} else {
								i_15_ = (int) (Math.random() * (double) (((Class330_Sub20) class330_sub20).anIntArray7678).length);
								Class302 class302 = Class302.method2982((Class428.aClass280_4362), (((Class330_Sub20) class330_sub20).anIntArray7678[i_15_]), 0);
								if (null != class302) {
									Class330_Sub29_Sub1_Sub2 class330_sub29_sub1_sub2 = (class302.method2981().method3409(Class427.aClass294_4350));
									Class330_Sub40_Sub3_Sub1 class330_sub40_sub3_sub1 = ((Class330_Sub40_Sub3_Sub1) (class330_sub29_sub1_sub2.method3403(i_14_, i_11_ << 6, i_13_)));
									class330_sub40_sub3_sub1.method3624(0, -1639123202);
									Class511.aClass330_Sub40_Sub4_5951.method3684(class330_sub40_sub3_sub1);
									((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683 = class330_sub40_sub3_sub1;
									((Class330_Sub20) class330_sub20).anInt7670 = (((((Class330_Sub20) class330_sub20).anInt7676) * 996172827 + (int) (Math.random() * (double) (((((Class330_Sub20) class330_sub20).anInt7677) * -1128686737) - ((((Class330_Sub20) class330_sub20).anInt7676) * 996172827)))) * 945549449);
								}
							}
						}
					} else {
						((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683.method3625(i_11_, (byte) 80);
						((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683.method3636(i_13_, -1556240809);
						if (!((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683.method3251(122249317)) {
							((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7683 = null;
							((Class330_Sub20) class330_sub20).aClass330_Sub41_7673 = null;
							((Class330_Sub20) class330_sub20).aClass330_Sub29_Sub1_Sub1_7681 = null;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gz.b(").append(')').toString());
		}
	}
}
