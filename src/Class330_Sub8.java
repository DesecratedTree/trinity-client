/* Class330_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub8 extends Class330 {
	float[][] aFloatArrayArray7554;
	Class_xa_Sub1 aClass_xa_Sub1_7555;
	int anInt7556;
	int anInt7557;
	int anInt7558;
	Class330_Sub14 aClass330_Sub14_7559;
	int anInt7560;
	Class_ra_Sub1 aClass_ra_Sub1_7561;
	int anInt7562;
	Interface3 anInterface3_7563;
	Interface1 anInterface1_7564;
	int anInt7565;
	Class44 aClass44_7566;
	float[][] aFloatArrayArray7567;
	Class44 aClass44_7568;
	float[][] aFloatArrayArray7569;
	Buffer aClass330_Sub46_7570;
	Class330_Sub46_Sub1 aClass330_Sub46_Sub1_7571;
	Class497 aClass497_7572;

	void method3279(int i, int i_0_, int i_1_, boolean[][] bools) {
		if (((Class330_Sub8) this).anInterface3_7563 != null && ((Class330_Sub8) this).anInt7557 <= i + i_1_ && ((Class330_Sub8) this).anInt7558 >= i - i_1_ && ((Class330_Sub8) this).anInt7556 <= i_0_ + i_1_ && ((Class330_Sub8) this).anInt7560 >= i_0_ - i_1_) {
			for (int i_2_ = ((Class330_Sub8) this).anInt7556; i_2_ <= ((Class330_Sub8) this).anInt7560; i_2_++) {
				for (int i_3_ = ((Class330_Sub8) this).anInt7557; i_3_ <= ((Class330_Sub8) this).anInt7558; i_3_++) {
					int i_4_ = i_3_ - i;
					int i_5_ = i_2_ - i_0_;
					if (i_4_ > -i_1_ && i_4_ < i_1_ && i_5_ > -i_1_ && i_5_ < i_1_ && bools[i_4_ + i_1_][i_5_ + i_1_]) {
						((Class330_Sub8) this).aClass_ra_Sub1_7561.method4849((int) (((Class330_Sub8) this).aClass330_Sub14_7559.method3317(-573553228) * 255.0F) << 24);
						((Class330_Sub8) this).aClass_ra_Sub1_7561.method4869(((Class330_Sub8) this).aClass44_7568, null, ((Class330_Sub8) this).aClass44_7566, null);
						((Class330_Sub8) this).aClass_ra_Sub1_7561.method4837(((Class330_Sub8) this).anInterface3_7563, 4, 0, ((Class330_Sub8) this).anInt7562);
						return;
					}
				}
			}
		}
	}

	Class330_Sub8(Class_ra_Sub1 class_ra_sub1, Class_xa_Sub1 class_xa_sub1, Class330_Sub14 class330_sub14, int[] is) {
		((Class330_Sub8) this).aClass_ra_Sub1_7561 = class_ra_sub1;
		((Class330_Sub8) this).aClass330_Sub14_7559 = class330_sub14;
		((Class330_Sub8) this).aClass_xa_Sub1_7555 = class_xa_sub1;
		int i = (((Class330_Sub8) this).aClass330_Sub14_7559.method3316((byte) -82) - (class_xa_sub1.anInt6395 * 550173571 >> 1));
		((Class330_Sub8) this).anInt7557 = (((Class330_Sub8) this).aClass330_Sub14_7559.method3318(1037288690) - i >> class_xa_sub1.anInt6396 * -1066304221);
		((Class330_Sub8) this).anInt7558 = (((Class330_Sub8) this).aClass330_Sub14_7559.method3318(2048257960) + i >> class_xa_sub1.anInt6396 * -1066304221);
		((Class330_Sub8) this).anInt7556 = (((Class330_Sub8) this).aClass330_Sub14_7559.method3312((short) 210) - i >> class_xa_sub1.anInt6396 * -1066304221);
		((Class330_Sub8) this).anInt7560 = (((Class330_Sub8) this).aClass330_Sub14_7559.method3312((short) -7947) + i >> class_xa_sub1.anInt6396 * -1066304221);
		int i_6_ = (((Class330_Sub8) this).anInt7558 - ((Class330_Sub8) this).anInt7557 + 1);
		int i_7_ = (((Class330_Sub8) this).anInt7560 - ((Class330_Sub8) this).anInt7556 + 1);
		((Class330_Sub8) this).aFloatArrayArray7567 = new float[i_6_ + 1][i_7_ + 1];
		((Class330_Sub8) this).aFloatArrayArray7554 = new float[i_6_ + 1][i_7_ + 1];
		((Class330_Sub8) this).aFloatArrayArray7569 = new float[i_6_ + 1][i_7_ + 1];
		for (int i_8_ = 0; i_8_ <= i_7_; i_8_++) {
			int i_9_ = i_8_ + ((Class330_Sub8) this).anInt7556;
			if (i_9_ > 0 && i_9_ < (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6393 * 24567321) - 1) {
				for (int i_10_ = 0; i_10_ <= i_6_; i_10_++) {
					int i_11_ = i_10_ + ((Class330_Sub8) this).anInt7557;
					if (i_11_ > 0 && i_11_ < (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6397) * 1972554729 - 1) {
						int i_12_ = (class_xa_sub1.method6417(i_11_ + 1, i_9_, -1692667187) - class_xa_sub1.method6417(i_11_ - 1, i_9_, -275241126));
						int i_13_ = (class_xa_sub1.method6417(i_11_, i_9_ + 1, -1492783542) - class_xa_sub1.method6417(i_11_, i_9_ - 1, -209019013));
						float f = (float) (1.0 / Math.sqrt((double) (i_12_ * i_12_ + 65536 + (i_13_ * i_13_))));
						((Class330_Sub8) this).aFloatArrayArray7567[i_10_][i_8_] = (float) i_12_ * f;
						((Class330_Sub8) this).aFloatArrayArray7554[i_10_][i_8_] = -256.0F * f;
						((Class330_Sub8) this).aFloatArrayArray7569[i_10_][i_8_] = (float) i_13_ * f;
					}
				}
			}
		}
		int i_14_ = 0;
		for (int i_15_ = ((Class330_Sub8) this).anInt7556; i_15_ <= ((Class330_Sub8) this).anInt7560; i_15_++) {
			if (i_15_ >= 0 && i_15_ < class_xa_sub1.anInt6393 * 24567321) {
				for (int i_16_ = ((Class330_Sub8) this).anInt7557; i_16_ <= ((Class330_Sub8) this).anInt7558; i_16_++) {
					if (i_16_ >= 0 && i_16_ < class_xa_sub1.anInt6397 * 1972554729) {
						int i_17_ = is[i_14_];
						int[] is_18_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8762[i_16_][i_15_]);
						if (is_18_ != null && i_17_ != 0) {
							if (i_17_ == 1) {
								for (int i_19_ = 0; i_19_ < is_18_.length; i_19_ += 3) {
									if (is_18_[i_19_] != -1 && is_18_[i_19_ + 1] != -1 && is_18_[i_19_ + 2] != -1)
										((Class330_Sub8) this).anInt7562 += 3;
								}
							} else
								((Class330_Sub8) this).anInt7562 += 3;
						}
					}
					i_14_++;
				}
			} else
				i_14_ += (((Class330_Sub8) this).anInt7558 - ((Class330_Sub8) this).anInt7557);
		}
		if (((Class330_Sub8) this).anInt7562 > 0) {
			((Class330_Sub8) this).aClass330_Sub46_7570 = new Buffer(((Class330_Sub8) this).anInt7562 * 2);
			((Class330_Sub8) this).aClass330_Sub46_Sub1_7571 = new Class330_Sub46_Sub1(((Class330_Sub8) this).anInt7562 * 16);
			((Class330_Sub8) this).aClass497_7572 = new Class497(Class136.method1594((((Class330_Sub8) this).anInt7562), 1714050274));
			int i_20_ = 0;
			i_14_ = 0;
			for (int i_21_ = ((Class330_Sub8) this).anInt7556; i_21_ <= ((Class330_Sub8) this).anInt7560; i_21_++) {
				if (i_21_ >= 0 && i_21_ < class_xa_sub1.anInt6393 * 24567321) {
					int i_22_ = 0;
					for (int i_23_ = ((Class330_Sub8) this).anInt7557; i_23_ <= ((Class330_Sub8) this).anInt7558; i_23_++) {
						if (i_23_ >= 0 && i_23_ < class_xa_sub1.anInt6397 * 1972554729) {
							int i_24_ = is[i_14_];
							int[] is_25_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8762[i_23_][i_21_]);
							if (is_25_ != null && i_24_ != 0) {
								if (i_24_ == 1) {
									int[] is_26_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8786[i_23_][i_21_]);
									int[] is_27_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8769[i_23_][i_21_]);
									int i_28_ = 0;
									while (i_28_ < is_25_.length) {
										if (is_25_[i_28_] != -1 && is_25_[i_28_ + 1] != -1 && is_25_[i_28_ + 2] != -1) {
											method3280(i_22_, i_20_, i_23_, i_21_, is_26_[i_28_], is_27_[i_28_]);
											i_28_++;
											method3280(i_22_, i_20_, i_23_, i_21_, is_26_[i_28_], is_27_[i_28_]);
											i_28_++;
											method3280(i_22_, i_20_, i_23_, i_21_, is_26_[i_28_], is_27_[i_28_]);
											i_28_++;
										} else
											i_28_ += 3;
									}
								} else if (i_24_ == 3) {
									method3280(i_22_, i_20_, i_23_, i_21_, 0, 0);
									method3280(i_22_, i_20_, i_23_, i_21_, (class_xa_sub1.anInt6395 * 550173571), 0);
									method3280(i_22_, i_20_, i_23_, i_21_, 0, (class_xa_sub1.anInt6395 * 550173571));
								} else if (i_24_ == 2) {
									method3280(i_22_, i_20_, i_23_, i_21_, (class_xa_sub1.anInt6395 * 550173571), 0);
									method3280(i_22_, i_20_, i_23_, i_21_, (class_xa_sub1.anInt6395 * 550173571), (class_xa_sub1.anInt6395 * 550173571));
									method3280(i_22_, i_20_, i_23_, i_21_, 0, 0);
								} else if (i_24_ == 5) {
									method3280(i_22_, i_20_, i_23_, i_21_, (class_xa_sub1.anInt6395 * 550173571), (class_xa_sub1.anInt6395 * 550173571));
									method3280(i_22_, i_20_, i_23_, i_21_, 0, (class_xa_sub1.anInt6395 * 550173571));
									method3280(i_22_, i_20_, i_23_, i_21_, (class_xa_sub1.anInt6395 * 550173571), 0);
								} else if (i_24_ == 4) {
									method3280(i_22_, i_20_, i_23_, i_21_, 0, (class_xa_sub1.anInt6395 * 550173571));
									method3280(i_22_, i_20_, i_23_, i_21_, 0, 0);
									method3280(i_22_, i_20_, i_23_, i_21_, (class_xa_sub1.anInt6395 * 550173571), (class_xa_sub1.anInt6395 * 550173571));
								}
							}
						}
						i_14_++;
						i_22_++;
					}
				} else
					i_14_ += (((Class330_Sub8) this).anInt7558 - ((Class330_Sub8) this).anInt7557);
				i_20_++;
			}
			((Class330_Sub8) this).anInterface3_7563 = (((Class330_Sub8) this).aClass_ra_Sub1_7561.method4834(5123, ((Class330_Sub8) this).aClass330_Sub46_7570.payload, (((Class330_Sub8) this).aClass330_Sub46_7570.offset * -824785231), false));
			((Class330_Sub8) this).anInterface1_7564 = (((Class330_Sub8) this).aClass_ra_Sub1_7561.method4835(16, (((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.payload), (((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.offset * -824785231), false));
			((Class330_Sub8) this).aClass44_7568 = new Class44(((Class330_Sub8) this).anInterface1_7564, 5126, 3, 0);
			((Class330_Sub8) this).aClass44_7566 = new Class44(((Class330_Sub8) this).anInterface1_7564, 5121, 4, 12);
		} else {
			((Class330_Sub8) this).anInterface3_7563 = null;
			((Class330_Sub8) this).anInterface1_7564 = null;
			((Class330_Sub8) this).aClass44_7568 = null;
			((Class330_Sub8) this).aClass44_7566 = null;
		}
		((Class330_Sub8) this).aClass330_Sub46_Sub1_7571 = null;
		((Class330_Sub8) this).aClass330_Sub46_7570 = null;
		((Class330_Sub8) this).aClass497_7572 = null;
		((Class330_Sub8) this).aFloatArrayArray7569 = null;
		((Class330_Sub8) this).aFloatArrayArray7554 = null;
		((Class330_Sub8) this).aFloatArrayArray7567 = null;
	}

	void method3280(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		long l = -1L;
		int i_34_ = i_32_ + (i_30_ << (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6396 * -1066304221));
		int i_35_ = i_33_ + (i_31_ << (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6396 * -1066304221));
		int i_36_ = ((Class330_Sub8) this).aClass_xa_Sub1_7555.method6416(i_34_, i_35_, 537880928);
		if ((i_32_ & 0x7f) == 0 || (i_33_ & 0x7f) == 0) {
			l = ((long) i_35_ & 0xffffL) << 16 | (long) i_34_ & 0xffffL;
			Class330_Sub24 class330_sub24 = ((Class330_Sub24) ((Class330_Sub8) this).aClass497_7572.method6094(l));
			if (class330_sub24 != null) {
				method3281(class330_sub24.aShort7694);
				return;
			}
		}
		short i_37_ = (short) ((Class330_Sub8) this).anInt7565++;
		if (l != -1L)
			((Class330_Sub8) this).aClass497_7572.method6097(new Class330_Sub24(i_37_), l);
		float f;
		float f_38_;
		float f_39_;
		if (i_32_ == 0 && i_33_ == 0) {
			f = ((Class330_Sub8) this).aFloatArrayArray7567[i][i_29_];
			f_38_ = ((Class330_Sub8) this).aFloatArrayArray7554[i][i_29_];
			f_39_ = ((Class330_Sub8) this).aFloatArrayArray7569[i][i_29_];
		} else if (i_32_ == (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6395) * 550173571 && i_33_ == 0) {
			f = ((Class330_Sub8) this).aFloatArrayArray7567[i + 1][i_29_];
			f_38_ = ((Class330_Sub8) this).aFloatArrayArray7554[i + 1][i_29_];
			f_39_ = ((Class330_Sub8) this).aFloatArrayArray7569[i + 1][i_29_];
		} else if (i_32_ == (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6395) * 550173571 && i_33_ == (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6395) * 550173571) {
			f = ((Class330_Sub8) this).aFloatArrayArray7567[i + 1][i_29_ + 1];
			f_38_ = (((Class330_Sub8) this).aFloatArrayArray7554[i + 1][i_29_ + 1]);
			f_39_ = (((Class330_Sub8) this).aFloatArrayArray7569[i + 1][i_29_ + 1]);
		} else if (i_32_ == 0 && i_33_ == (((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6395) * 550173571) {
			f = ((Class330_Sub8) this).aFloatArrayArray7567[i][i_29_ + 1];
			f_38_ = ((Class330_Sub8) this).aFloatArrayArray7554[i][i_29_ + 1];
			f_39_ = ((Class330_Sub8) this).aFloatArrayArray7569[i][i_29_ + 1];
		} else {
			float f_40_ = (float) i_32_ / (float) ((((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6395) * 550173571);
			float f_41_ = (float) i_33_ / (float) ((((Class330_Sub8) this).aClass_xa_Sub1_7555.anInt6395) * 550173571);
			float f_42_ = ((Class330_Sub8) this).aFloatArrayArray7567[i][i_29_];
			float f_43_ = ((Class330_Sub8) this).aFloatArrayArray7554[i][i_29_];
			float f_44_ = ((Class330_Sub8) this).aFloatArrayArray7569[i][i_29_];
			float f_45_ = ((Class330_Sub8) this).aFloatArrayArray7567[i + 1][i_29_];
			float f_46_ = ((Class330_Sub8) this).aFloatArrayArray7554[i + 1][i_29_];
			float f_47_ = ((Class330_Sub8) this).aFloatArrayArray7569[i + 1][i_29_];
			f_42_ += (((Class330_Sub8) this).aFloatArrayArray7567[i][i_29_ + 1] - f_42_) * f_40_;
			f_43_ += (((Class330_Sub8) this).aFloatArrayArray7554[i][i_29_ + 1] - f_43_) * f_40_;
			f_44_ += (((Class330_Sub8) this).aFloatArrayArray7569[i][i_29_ + 1] - f_44_) * f_40_;
			f_45_ += ((((Class330_Sub8) this).aFloatArrayArray7567[i + 1][i_29_ + 1]) - f_45_) * f_40_;
			f_46_ += ((((Class330_Sub8) this).aFloatArrayArray7554[i + 1][i_29_ + 1]) - f_46_) * f_40_;
			f_47_ += ((((Class330_Sub8) this).aFloatArrayArray7569[i + 1][i_29_ + 1]) - f_47_) * f_40_;
			f = f_42_ + (f_45_ - f_42_) * f_41_;
			f_38_ = f_43_ + (f_46_ - f_43_) * f_41_;
			f_39_ = f_44_ + (f_47_ - f_44_) * f_41_;
		}
		float f_48_ = (float) (((Class330_Sub8) this).aClass330_Sub14_7559.method3318(-380290935) - i_34_);
		float f_49_ = (float) (((Class330_Sub8) this).aClass330_Sub14_7559.method3311((byte) 10) - i_36_);
		float f_50_ = (float) (((Class330_Sub8) this).aClass330_Sub14_7559.method3312((short) -9821) - i_35_);
		float f_51_ = (float) Math.sqrt((double) (f_48_ * f_48_ + f_49_ * f_49_ + f_50_ * f_50_));
		float f_52_ = 1.0F / f_51_;
		f_48_ *= f_52_;
		f_49_ *= f_52_;
		f_50_ *= f_52_;
		float f_53_ = f_51_ / (float) ((Class330_Sub8) this).aClass330_Sub14_7559.method3316((byte) -72);
		float f_54_ = 1.0F - f_53_ * f_53_;
		if (f_54_ < 0.0F)
			f_54_ = 0.0F;
		float f_55_ = f_48_ * f + f_49_ * f_38_ + f_50_ * f_39_;
		if (f_55_ < 0.0F)
			f_55_ = 0.0F;
		float f_56_ = f_55_ * f_54_ * 2.0F;
		if (f_56_ > 1.0F)
			f_56_ = 1.0F;
		int i_57_ = ((Class330_Sub8) this).aClass330_Sub14_7559.method3313(-383719469);
		int i_58_ = (int) (f_56_ * (float) (i_57_ >> 16 & 0xff));
		if (i_58_ > 255)
			i_58_ = 255;
		int i_59_ = (int) (f_56_ * (float) (i_57_ >> 8 & 0xff));
		if (i_59_ > 255)
			i_59_ = 255;
		int i_60_ = (int) (f_56_ * (float) (i_57_ & 0xff));
		if (i_60_ > 255)
			i_60_ = 255;
		if (((Class_ra_Sub1) ((Class330_Sub8) this).aClass_ra_Sub1_7561).aBoolean8407) {
			((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.method3819((float) i_34_);
			((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.method3819((float) i_36_);
			((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.method3819((float) i_35_);
		} else {
			((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.method3818((float) i_34_);
			((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.method3818((float) i_36_);
			((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.method3818((float) i_35_);
		}
		((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.addByte(i_58_, (byte) 10);
		((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.addByte(i_59_, (byte) 3);
		((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.addByte(i_60_, (byte) 11);
		((Class330_Sub8) this).aClass330_Sub46_Sub1_7571.addByte(255, (byte) 79);
		method3281(i_37_);
	}

	void method3281(short i) {
		if (((Class_ra_Sub1) ((Class330_Sub8) this).aClass_ra_Sub1_7561).aBoolean8407)
			((Class330_Sub8) this).aClass330_Sub46_7570.addShort(i, (byte) 124);
		else
			((Class330_Sub8) this).aClass330_Sub46_7570.method3742(i, (short) 2025);
	}
}
