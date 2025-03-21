/* Class92_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92_Sub1_Sub1 extends Class92_Sub1 {
	int anInt9402;
	Interface11_Impl1 anInterface11_Impl1_9403;
	int anInt9404;
	static int[] anIntArray9405 = new int[6];
	int anInt9406;
	int anInt9407;
	int anInt9408;
	int anInt9409;
	Class_ra_Sub2 aClass_ra_Sub2_9410;
	static int[][] anIntArrayArray9411 = new int[6][];

	Interface11_Impl1 method1074() {
		if (((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 == null) {
			Interface_ma interface_ma = (((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.anInterface_ma4227);
			anIntArray9405[0] = ((Class92_Sub1_Sub1) this).anInt9404;
			anIntArray9405[1] = ((Class92_Sub1_Sub1) this).anInt9407;
			anIntArray9405[2] = ((Class92_Sub1_Sub1) this).anInt9402;
			anIntArray9405[3] = ((Class92_Sub1_Sub1) this).anInt9406;
			anIntArray9405[4] = ((Class92_Sub1_Sub1) this).anInt9408;
			anIntArray9405[5] = ((Class92_Sub1_Sub1) this).anInt9409;
			boolean bool = false;
			int i = 0;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				if (anIntArray9405[i_0_] == -1)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9405[i_0_], 1190575891);
				int i_1_ = class56.anInt532 * -1963453415;
				if (i_1_ > i)
					i = i_1_;
				if (!interface_ma.method237(anIntArray9405[i_0_], Class377.aClass377_3934, 1.0F, i, i, false, 2147085590))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_2_ = 0; i_2_ < 6; i_2_++) {
				anIntArrayArray9411[i_2_] = interface_ma.method220(anIntArray9405[i_2_], 1.0F, i, i, false, -1894102536);
				if (anIntArrayArray9411[i_2_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9405[i_2_], -689657793);
					int i_3_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_4_ = 0; i_4_ < class56.anInt532 * -1963453415; i_4_++) {
						for (int i_5_ = 0; i_5_ < class56.anInt532 * -1963453415; i_5_++) {
							int i_6_ = i_4_ + i_5_ * (class56.anInt532 * -1963453415);
							int i_7_ = i_3_ * (i_4_ + i_5_ * i);
							for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
								for (int i_9_ = 0; i_9_ < i_3_; i_9_++)
									is[i_7_ + i_8_ + i_9_ * i_3_] = anIntArrayArray9411[i_2_][i_6_];
							}
						}
					}
					anIntArrayArray9411[i_2_] = is;
				}
			}
			((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 = ((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.method4951(i, bool, anIntArrayArray9411);
		}
		return ((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403;
	}

	Interface11_Impl1 method1076() {
		if (((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 == null) {
			Interface_ma interface_ma = (((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.anInterface_ma4227);
			anIntArray9405[0] = ((Class92_Sub1_Sub1) this).anInt9404;
			anIntArray9405[1] = ((Class92_Sub1_Sub1) this).anInt9407;
			anIntArray9405[2] = ((Class92_Sub1_Sub1) this).anInt9402;
			anIntArray9405[3] = ((Class92_Sub1_Sub1) this).anInt9406;
			anIntArray9405[4] = ((Class92_Sub1_Sub1) this).anInt9408;
			anIntArray9405[5] = ((Class92_Sub1_Sub1) this).anInt9409;
			boolean bool = false;
			int i = 0;
			for (int i_10_ = 0; i_10_ < 6; i_10_++) {
				if (anIntArray9405[i_10_] == -1)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9405[i_10_], 71234552);
				int i_11_ = class56.anInt532 * -1963453415;
				if (i_11_ > i)
					i = i_11_;
				if (!interface_ma.method237(anIntArray9405[i_10_], Class377.aClass377_3934, 1.0F, i, i, false, 2147213867))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_12_ = 0; i_12_ < 6; i_12_++) {
				anIntArrayArray9411[i_12_] = interface_ma.method220(anIntArray9405[i_12_], 1.0F, i, i, false, -1911735993);
				if (anIntArrayArray9411[i_12_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9405[i_12_], 1321744831);
					int i_13_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_14_ = 0; i_14_ < class56.anInt532 * -1963453415; i_14_++) {
						for (int i_15_ = 0; i_15_ < class56.anInt532 * -1963453415; i_15_++) {
							int i_16_ = i_14_ + i_15_ * (class56.anInt532 * -1963453415);
							int i_17_ = i_13_ * (i_14_ + i_15_ * i);
							for (int i_18_ = 0; i_18_ < i_13_; i_18_++) {
								for (int i_19_ = 0; i_19_ < i_13_; i_19_++)
									is[i_17_ + i_18_ + i_19_ * i_13_] = anIntArrayArray9411[i_12_][i_16_];
							}
						}
					}
					anIntArrayArray9411[i_12_] = is;
				}
			}
			((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 = ((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.method4951(i, bool, anIntArrayArray9411);
		}
		return ((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403;
	}

	Interface11_Impl1 method1075() {
		if (((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 == null) {
			Interface_ma interface_ma = (((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.anInterface_ma4227);
			anIntArray9405[0] = ((Class92_Sub1_Sub1) this).anInt9404;
			anIntArray9405[1] = ((Class92_Sub1_Sub1) this).anInt9407;
			anIntArray9405[2] = ((Class92_Sub1_Sub1) this).anInt9402;
			anIntArray9405[3] = ((Class92_Sub1_Sub1) this).anInt9406;
			anIntArray9405[4] = ((Class92_Sub1_Sub1) this).anInt9408;
			anIntArray9405[5] = ((Class92_Sub1_Sub1) this).anInt9409;
			boolean bool = false;
			int i = 0;
			for (int i_20_ = 0; i_20_ < 6; i_20_++) {
				if (anIntArray9405[i_20_] == -1)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9405[i_20_], -1531546835);
				int i_21_ = class56.anInt532 * -1963453415;
				if (i_21_ > i)
					i = i_21_;
				if (!interface_ma.method237(anIntArray9405[i_20_], Class377.aClass377_3934, 1.0F, i, i, false, 2145144388))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_22_ = 0; i_22_ < 6; i_22_++) {
				anIntArrayArray9411[i_22_] = interface_ma.method220(anIntArray9405[i_22_], 1.0F, i, i, false, -2065174361);
				if (anIntArrayArray9411[i_22_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9405[i_22_], 1208992243);
					int i_23_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_24_ = 0; i_24_ < class56.anInt532 * -1963453415; i_24_++) {
						for (int i_25_ = 0; i_25_ < class56.anInt532 * -1963453415; i_25_++) {
							int i_26_ = i_24_ + i_25_ * (class56.anInt532 * -1963453415);
							int i_27_ = i_23_ * (i_24_ + i_25_ * i);
							for (int i_28_ = 0; i_28_ < i_23_; i_28_++) {
								for (int i_29_ = 0; i_29_ < i_23_; i_29_++)
									is[i_27_ + i_28_ + i_29_ * i_23_] = anIntArrayArray9411[i_22_][i_26_];
							}
						}
					}
					anIntArrayArray9411[i_22_] = is;
				}
			}
			((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 = ((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.method4951(i, bool, anIntArrayArray9411);
		}
		return ((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403;
	}

	Interface11_Impl1 method1077() {
		if (((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 == null) {
			Interface_ma interface_ma = (((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.anInterface_ma4227);
			anIntArray9405[0] = ((Class92_Sub1_Sub1) this).anInt9404;
			anIntArray9405[1] = ((Class92_Sub1_Sub1) this).anInt9407;
			anIntArray9405[2] = ((Class92_Sub1_Sub1) this).anInt9402;
			anIntArray9405[3] = ((Class92_Sub1_Sub1) this).anInt9406;
			anIntArray9405[4] = ((Class92_Sub1_Sub1) this).anInt9408;
			anIntArray9405[5] = ((Class92_Sub1_Sub1) this).anInt9409;
			boolean bool = false;
			int i = 0;
			for (int i_30_ = 0; i_30_ < 6; i_30_++) {
				if (anIntArray9405[i_30_] == -1)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9405[i_30_], -1071204092);
				int i_31_ = class56.anInt532 * -1963453415;
				if (i_31_ > i)
					i = i_31_;
				if (!interface_ma.method237(anIntArray9405[i_30_], Class377.aClass377_3934, 1.0F, i, i, false, 2145093420))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_32_ = 0; i_32_ < 6; i_32_++) {
				anIntArrayArray9411[i_32_] = interface_ma.method220(anIntArray9405[i_32_], 1.0F, i, i, false, -2063001588);
				if (anIntArrayArray9411[i_32_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9405[i_32_], 1969649761);
					int i_33_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_34_ = 0; i_34_ < class56.anInt532 * -1963453415; i_34_++) {
						for (int i_35_ = 0; i_35_ < class56.anInt532 * -1963453415; i_35_++) {
							int i_36_ = i_34_ + i_35_ * (class56.anInt532 * -1963453415);
							int i_37_ = i_33_ * (i_34_ + i_35_ * i);
							for (int i_38_ = 0; i_38_ < i_33_; i_38_++) {
								for (int i_39_ = 0; i_39_ < i_33_; i_39_++)
									is[i_37_ + i_38_ + i_39_ * i_33_] = anIntArrayArray9411[i_32_][i_36_];
							}
						}
					}
					anIntArrayArray9411[i_32_] = is;
				}
			}
			((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403 = ((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410.method4951(i, bool, anIntArrayArray9411);
		}
		return ((Class92_Sub1_Sub1) this).anInterface11_Impl1_9403;
	}

	Class92_Sub1_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_) {
		((Class92_Sub1_Sub1) this).aClass_ra_Sub2_9410 = class_ra_sub2;
		((Class92_Sub1_Sub1) this).anInt9402 = i_41_;
		((Class92_Sub1_Sub1) this).anInt9406 = i_42_;
		((Class92_Sub1_Sub1) this).anInt9408 = i_43_;
		((Class92_Sub1_Sub1) this).anInt9409 = i_44_;
		((Class92_Sub1_Sub1) this).anInt9404 = i;
		((Class92_Sub1_Sub1) this).anInt9407 = i_40_;
	}
}
