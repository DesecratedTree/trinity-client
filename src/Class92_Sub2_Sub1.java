/* Class92_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92_Sub2_Sub1 extends Class92_Sub2 {
	static int[][] anIntArrayArray9412;
	Class36_Sub3 aClass36_Sub3_9413;
	int anInt9414;
	int anInt9415;
	int anInt9416;
	int anInt9417;
	int anInt9418;
	Class_ra_Sub1 aClass_ra_Sub1_9419;
	static int[] anIntArray9420 = new int[6];
	int anInt9421;

	static {
		anIntArrayArray9412 = new int[6][];
	}

	Class36_Sub3 method1082() {
		if (((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 == null) {
			Interface_ma interface_ma = (((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419.anInterface_ma4227);
			anIntArray9420[0] = ((Class92_Sub2_Sub1) this).anInt9414;
			anIntArray9420[1] = ((Class92_Sub2_Sub1) this).anInt9416;
			anIntArray9420[2] = ((Class92_Sub2_Sub1) this).anInt9418;
			anIntArray9420[3] = ((Class92_Sub2_Sub1) this).anInt9417;
			anIntArray9420[4] = ((Class92_Sub2_Sub1) this).anInt9415;
			anIntArray9420[5] = ((Class92_Sub2_Sub1) this).anInt9421;
			boolean bool = false;
			int i = 0;
			for (int i_0_ = 0; i_0_ < 6; i_0_++) {
				if (anIntArray9420[i_0_] < 0)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9420[i_0_], -1092727779);
				int i_1_ = class56.anInt532 * -1963453415;
				if (i_1_ > i)
					i = i_1_;
				if (!interface_ma.method237(anIntArray9420[i_0_], Class377.aClass377_3934, 1.0F, i, i, false, 2135620367))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_2_ = 0; i_2_ < 6; i_2_++) {
				anIntArrayArray9412[i_2_] = interface_ma.method220(anIntArray9420[i_2_], 1.0F, i, i, false, -1803054619);
				if (anIntArrayArray9412[i_2_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9420[i_2_], -288950213);
					int i_3_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_4_ = 0; i_4_ < class56.anInt532 * -1963453415; i_4_++) {
						for (int i_5_ = 0; i_5_ < class56.anInt532 * -1963453415; i_5_++) {
							int i_6_ = i_4_ + i_5_ * (class56.anInt532 * -1963453415);
							int i_7_ = i_3_ * (i_4_ + i_5_ * i);
							for (int i_8_ = 0; i_8_ < i_3_; i_8_++) {
								for (int i_9_ = 0; i_9_ < i_3_; i_9_++)
									is[i_7_ + i_8_ + i_9_ * i_3_] = anIntArrayArray9412[i_2_][i_6_];
							}
						}
					}
					anIntArrayArray9412[i_2_] = is;
				}
			}
			((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 = new Class36_Sub3((((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419), Class72.aClass72_614, Class86.aClass86_714, i, bool, anIntArrayArray9412);
		}
		return ((Class92_Sub2_Sub1) this).aClass36_Sub3_9413;
	}

	Class36_Sub3 method1079() {
		if (((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 == null) {
			Interface_ma interface_ma = (((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419.anInterface_ma4227);
			anIntArray9420[0] = ((Class92_Sub2_Sub1) this).anInt9414;
			anIntArray9420[1] = ((Class92_Sub2_Sub1) this).anInt9416;
			anIntArray9420[2] = ((Class92_Sub2_Sub1) this).anInt9418;
			anIntArray9420[3] = ((Class92_Sub2_Sub1) this).anInt9417;
			anIntArray9420[4] = ((Class92_Sub2_Sub1) this).anInt9415;
			anIntArray9420[5] = ((Class92_Sub2_Sub1) this).anInt9421;
			boolean bool = false;
			int i = 0;
			for (int i_10_ = 0; i_10_ < 6; i_10_++) {
				if (anIntArray9420[i_10_] < 0)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9420[i_10_], 1080113203);
				int i_11_ = class56.anInt532 * -1963453415;
				if (i_11_ > i)
					i = i_11_;
				if (!interface_ma.method237(anIntArray9420[i_10_], Class377.aClass377_3934, 1.0F, i, i, false, 2144900496))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_12_ = 0; i_12_ < 6; i_12_++) {
				anIntArrayArray9412[i_12_] = interface_ma.method220(anIntArray9420[i_12_], 1.0F, i, i, false, -2011151821);
				if (anIntArrayArray9412[i_12_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9420[i_12_], -7680202);
					int i_13_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_14_ = 0; i_14_ < class56.anInt532 * -1963453415; i_14_++) {
						for (int i_15_ = 0; i_15_ < class56.anInt532 * -1963453415; i_15_++) {
							int i_16_ = i_14_ + i_15_ * (class56.anInt532 * -1963453415);
							int i_17_ = i_13_ * (i_14_ + i_15_ * i);
							for (int i_18_ = 0; i_18_ < i_13_; i_18_++) {
								for (int i_19_ = 0; i_19_ < i_13_; i_19_++)
									is[i_17_ + i_18_ + i_19_ * i_13_] = anIntArrayArray9412[i_12_][i_16_];
							}
						}
					}
					anIntArrayArray9412[i_12_] = is;
				}
			}
			((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 = new Class36_Sub3((((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419), Class72.aClass72_614, Class86.aClass86_714, i, bool, anIntArrayArray9412);
		}
		return ((Class92_Sub2_Sub1) this).aClass36_Sub3_9413;
	}

	Class36_Sub3 method1078() {
		if (((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 == null) {
			Interface_ma interface_ma = (((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419.anInterface_ma4227);
			anIntArray9420[0] = ((Class92_Sub2_Sub1) this).anInt9414;
			anIntArray9420[1] = ((Class92_Sub2_Sub1) this).anInt9416;
			anIntArray9420[2] = ((Class92_Sub2_Sub1) this).anInt9418;
			anIntArray9420[3] = ((Class92_Sub2_Sub1) this).anInt9417;
			anIntArray9420[4] = ((Class92_Sub2_Sub1) this).anInt9415;
			anIntArray9420[5] = ((Class92_Sub2_Sub1) this).anInt9421;
			boolean bool = false;
			int i = 0;
			for (int i_20_ = 0; i_20_ < 6; i_20_++) {
				if (anIntArray9420[i_20_] < 0)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9420[i_20_], -1947721503);
				int i_21_ = class56.anInt532 * -1963453415;
				if (i_21_ > i)
					i = i_21_;
				if (!interface_ma.method237(anIntArray9420[i_20_], Class377.aClass377_3934, 1.0F, i, i, false, 2136362243))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_22_ = 0; i_22_ < 6; i_22_++) {
				anIntArrayArray9412[i_22_] = interface_ma.method220(anIntArray9420[i_22_], 1.0F, i, i, false, -1886563163);
				if (anIntArrayArray9412[i_22_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9420[i_22_], -991269268);
					int i_23_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_24_ = 0; i_24_ < class56.anInt532 * -1963453415; i_24_++) {
						for (int i_25_ = 0; i_25_ < class56.anInt532 * -1963453415; i_25_++) {
							int i_26_ = i_24_ + i_25_ * (class56.anInt532 * -1963453415);
							int i_27_ = i_23_ * (i_24_ + i_25_ * i);
							for (int i_28_ = 0; i_28_ < i_23_; i_28_++) {
								for (int i_29_ = 0; i_29_ < i_23_; i_29_++)
									is[i_27_ + i_28_ + i_29_ * i_23_] = anIntArrayArray9412[i_22_][i_26_];
							}
						}
					}
					anIntArrayArray9412[i_22_] = is;
				}
			}
			((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 = new Class36_Sub3((((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419), Class72.aClass72_614, Class86.aClass86_714, i, bool, anIntArrayArray9412);
		}
		return ((Class92_Sub2_Sub1) this).aClass36_Sub3_9413;
	}

	Class36_Sub3 method1080() {
		if (((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 == null) {
			Interface_ma interface_ma = (((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419.anInterface_ma4227);
			anIntArray9420[0] = ((Class92_Sub2_Sub1) this).anInt9414;
			anIntArray9420[1] = ((Class92_Sub2_Sub1) this).anInt9416;
			anIntArray9420[2] = ((Class92_Sub2_Sub1) this).anInt9418;
			anIntArray9420[3] = ((Class92_Sub2_Sub1) this).anInt9417;
			anIntArray9420[4] = ((Class92_Sub2_Sub1) this).anInt9415;
			anIntArray9420[5] = ((Class92_Sub2_Sub1) this).anInt9421;
			boolean bool = false;
			int i = 0;
			for (int i_30_ = 0; i_30_ < 6; i_30_++) {
				if (anIntArray9420[i_30_] < 0)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9420[i_30_], -282498682);
				int i_31_ = class56.anInt532 * -1963453415;
				if (i_31_ > i)
					i = i_31_;
				if (!interface_ma.method237(anIntArray9420[i_30_], Class377.aClass377_3934, 1.0F, i, i, false, 2147368216))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_32_ = 0; i_32_ < 6; i_32_++) {
				anIntArrayArray9412[i_32_] = interface_ma.method220(anIntArray9420[i_32_], 1.0F, i, i, false, -2137060022);
				if (anIntArrayArray9412[i_32_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9420[i_32_], -947161474);
					int i_33_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_34_ = 0; i_34_ < class56.anInt532 * -1963453415; i_34_++) {
						for (int i_35_ = 0; i_35_ < class56.anInt532 * -1963453415; i_35_++) {
							int i_36_ = i_34_ + i_35_ * (class56.anInt532 * -1963453415);
							int i_37_ = i_33_ * (i_34_ + i_35_ * i);
							for (int i_38_ = 0; i_38_ < i_33_; i_38_++) {
								for (int i_39_ = 0; i_39_ < i_33_; i_39_++)
									is[i_37_ + i_38_ + i_39_ * i_33_] = anIntArrayArray9412[i_32_][i_36_];
							}
						}
					}
					anIntArrayArray9412[i_32_] = is;
				}
			}
			((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 = new Class36_Sub3((((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419), Class72.aClass72_614, Class86.aClass86_714, i, bool, anIntArrayArray9412);
		}
		return ((Class92_Sub2_Sub1) this).aClass36_Sub3_9413;
	}

	Class36_Sub3 method1081() {
		if (((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 == null) {
			Interface_ma interface_ma = (((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419.anInterface_ma4227);
			anIntArray9420[0] = ((Class92_Sub2_Sub1) this).anInt9414;
			anIntArray9420[1] = ((Class92_Sub2_Sub1) this).anInt9416;
			anIntArray9420[2] = ((Class92_Sub2_Sub1) this).anInt9418;
			anIntArray9420[3] = ((Class92_Sub2_Sub1) this).anInt9417;
			anIntArray9420[4] = ((Class92_Sub2_Sub1) this).anInt9415;
			anIntArray9420[5] = ((Class92_Sub2_Sub1) this).anInt9421;
			boolean bool = false;
			int i = 0;
			for (int i_40_ = 0; i_40_ < 6; i_40_++) {
				if (anIntArray9420[i_40_] < 0)
					return null;
				Class56 class56 = interface_ma.method221(anIntArray9420[i_40_], 1959699036);
				int i_41_ = class56.anInt532 * -1963453415;
				if (i_41_ > i)
					i = i_41_;
				if (!interface_ma.method237(anIntArray9420[i_40_], Class377.aClass377_3934, 1.0F, i, i, false, 2141025068))
					return null;
				if (class56.aByte538 > 0)
					bool = true;
			}
			for (int i_42_ = 0; i_42_ < 6; i_42_++) {
				anIntArrayArray9412[i_42_] = interface_ma.method220(anIntArray9420[i_42_], 1.0F, i, i, false, -1610916084);
				if (anIntArrayArray9412[i_42_].length != i * i) {
					Class56 class56 = interface_ma.method221(anIntArray9420[i_42_], 994199923);
					int i_43_ = i / (class56.anInt532 * -1963453415);
					int[] is = new int[i * i];
					for (int i_44_ = 0; i_44_ < class56.anInt532 * -1963453415; i_44_++) {
						for (int i_45_ = 0; i_45_ < class56.anInt532 * -1963453415; i_45_++) {
							int i_46_ = i_44_ + i_45_ * (class56.anInt532 * -1963453415);
							int i_47_ = i_43_ * (i_44_ + i_45_ * i);
							for (int i_48_ = 0; i_48_ < i_43_; i_48_++) {
								for (int i_49_ = 0; i_49_ < i_43_; i_49_++)
									is[i_47_ + i_48_ + i_49_ * i_43_] = anIntArrayArray9412[i_42_][i_46_];
							}
						}
					}
					anIntArrayArray9412[i_42_] = is;
				}
			}
			((Class92_Sub2_Sub1) this).aClass36_Sub3_9413 = new Class36_Sub3((((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419), Class72.aClass72_614, Class86.aClass86_714, i, bool, anIntArrayArray9412);
		}
		return ((Class92_Sub2_Sub1) this).aClass36_Sub3_9413;
	}

	Class92_Sub2_Sub1(Class_ra_Sub1 class_ra_sub1, int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		((Class92_Sub2_Sub1) this).aClass_ra_Sub1_9419 = class_ra_sub1;
		((Class92_Sub2_Sub1) this).anInt9418 = i_51_;
		((Class92_Sub2_Sub1) this).anInt9417 = i_52_;
		((Class92_Sub2_Sub1) this).anInt9415 = i_53_;
		((Class92_Sub2_Sub1) this).anInt9421 = i_54_;
		((Class92_Sub2_Sub1) this).anInt9414 = i;
		((Class92_Sub2_Sub1) this).anInt9416 = i_50_;
	}
}
