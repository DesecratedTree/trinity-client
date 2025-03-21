/* Class330_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class330_Sub27 extends Class330 {
	Class330_Sub14 aClass330_Sub14_7697;
	Class_xa_Sub2 aClass_xa_Sub2_7698;
	float[][] aFloatArrayArray7699;
	int anInt7700;
	int anInt7701;
	int anInt7702;
	int anInt7703;
	int anInt7704 = 0;
	Class_ra_Sub2 aClass_ra_Sub2_7705;
	float[][] aFloatArrayArray7706;
	Interface9_Impl2 anInterface9_Impl2_7707;
	Interface9_Impl1 anInterface9_Impl1_7708;
	float[][] aFloatArrayArray7709;
	ByteBuffer aByteBuffer7710;
	int anInt7711 = 0;
	Class497 aClass497_7712;
	int anInt7713 = 0;

	Class330_Sub27(Class_ra_Sub2 class_ra_sub2, Class_xa_Sub2 class_xa_sub2, Class330_Sub14 class330_sub14, int[] is) {
		((Class330_Sub27) this).aClass_ra_Sub2_7705 = class_ra_sub2;
		((Class330_Sub27) this).aClass330_Sub14_7697 = class330_sub14;
		((Class330_Sub27) this).aClass_xa_Sub2_7698 = class_xa_sub2;
		int i = (((Class330_Sub27) this).aClass330_Sub14_7697.method3316((byte) 39) - (class_xa_sub2.anInt6395 * 550173571 >> 1));
		((Class330_Sub27) this).anInt7700 = (((Class330_Sub27) this).aClass330_Sub14_7697.method3318(-687155497) - i >> class_xa_sub2.anInt6396 * -1066304221);
		((Class330_Sub27) this).anInt7701 = (((Class330_Sub27) this).aClass330_Sub14_7697.method3318(-411472448) + i >> class_xa_sub2.anInt6396 * -1066304221);
		((Class330_Sub27) this).anInt7702 = (((Class330_Sub27) this).aClass330_Sub14_7697.method3312((short) 22389) - i >> class_xa_sub2.anInt6396 * -1066304221);
		((Class330_Sub27) this).anInt7703 = (((Class330_Sub27) this).aClass330_Sub14_7697.method3312((short) -7225) + i >> class_xa_sub2.anInt6396 * -1066304221);
		int i_0_ = (((Class330_Sub27) this).anInt7701 - ((Class330_Sub27) this).anInt7700 + 1);
		int i_1_ = (((Class330_Sub27) this).anInt7703 - ((Class330_Sub27) this).anInt7702 + 1);
		((Class330_Sub27) this).aFloatArrayArray7709 = new float[i_0_ + 1][i_1_ + 1];
		((Class330_Sub27) this).aFloatArrayArray7706 = new float[i_0_ + 1][i_1_ + 1];
		((Class330_Sub27) this).aFloatArrayArray7699 = new float[i_0_ + 1][i_1_ + 1];
		for (int i_2_ = 0; i_2_ <= i_1_; i_2_++) {
			int i_3_ = i_2_ + ((Class330_Sub27) this).anInt7702;
			if (i_3_ > 0 && i_3_ < (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6393) * 24567321 - 1) {
				for (int i_4_ = 0; i_4_ <= i_0_; i_4_++) {
					int i_5_ = i_4_ + ((Class330_Sub27) this).anInt7700;
					if (i_5_ > 0 && i_5_ < (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6397) * 1972554729 - 1) {
						int i_6_ = (class_xa_sub2.method6417(i_5_ + 1, i_3_, 1570940250) - class_xa_sub2.method6417(i_5_ - 1, i_3_, 1382589808));
						int i_7_ = (class_xa_sub2.method6417(i_5_, i_3_ + 1, 1158323969) - class_xa_sub2.method6417(i_5_, i_3_ - 1, 1362477030));
						float f = (float) (1.0 / Math.sqrt((double) (i_6_ * i_6_ + 65536 + i_7_ * i_7_)));
						((Class330_Sub27) this).aFloatArrayArray7709[i_4_][i_2_] = (float) i_6_ * f;
						((Class330_Sub27) this).aFloatArrayArray7706[i_4_][i_2_] = -256.0F * f;
						((Class330_Sub27) this).aFloatArrayArray7699[i_4_][i_2_] = (float) i_7_ * f;
					}
				}
			}
		}
		int i_8_ = 0;
		for (int i_9_ = ((Class330_Sub27) this).anInt7702; i_9_ <= ((Class330_Sub27) this).anInt7703; i_9_++) {
			if (i_9_ >= 0 && i_9_ < class_xa_sub2.anInt6393 * 24567321) {
				for (int i_10_ = ((Class330_Sub27) this).anInt7700; i_10_ <= ((Class330_Sub27) this).anInt7701; i_10_++) {
					if (i_10_ >= 0 && i_10_ < class_xa_sub2.anInt6397 * 1972554729) {
						int i_11_ = is[i_8_];
						int[] is_12_ = (((Class_xa_Sub2) class_xa_sub2).anIntArrayArrayArray8802[i_10_][i_9_]);
						if (is_12_ != null && i_11_ != 0) {
							if (i_11_ == 1) {
								for (int i_13_ = 0; i_13_ < is_12_.length; i_13_ += 3) {
									if (is_12_[i_13_] != -1 && is_12_[i_13_ + 1] != -1 && is_12_[i_13_ + 2] != -1)
										((Class330_Sub27) this).anInt7711 += 3;
								}
							} else
								((Class330_Sub27) this).anInt7711 += 3;
						}
					}
					i_8_++;
				}
			} else
				i_8_ += (((Class330_Sub27) this).anInt7701 - ((Class330_Sub27) this).anInt7700);
		}
		if (((Class330_Sub27) this).anInt7711 > 0) {
			((Class330_Sub27) this).aClass497_7712 = new Class497(Class136.method1594((((Class330_Sub27) this).anInt7711), 1897633489));
			((Class330_Sub27) this).aByteBuffer7710 = ((Class330_Sub27) this).aClass_ra_Sub2_7705.aByteBuffer8458;
			((Class330_Sub27) this).aByteBuffer7710.clear();
			((Class330_Sub27) this).aByteBuffer7710.position(2097152);
			((Class330_Sub27) this).aByteBuffer7710.slice();
			((Class330_Sub27) this).aByteBuffer7710.position(0);
			((Class330_Sub27) this).aByteBuffer7710.limit(2097152);
			int i_14_ = 0;
			i_8_ = 0;
			for (int i_15_ = ((Class330_Sub27) this).anInt7702; i_15_ <= ((Class330_Sub27) this).anInt7703; i_15_++) {
				if (i_15_ >= 0 && i_15_ < class_xa_sub2.anInt6393 * 24567321) {
					int i_16_ = 0;
					for (int i_17_ = ((Class330_Sub27) this).anInt7700; i_17_ <= ((Class330_Sub27) this).anInt7701; i_17_++) {
						if (i_17_ >= 0 && i_17_ < class_xa_sub2.anInt6397 * 1972554729) {
							int i_18_ = is[i_8_];
							int[] is_19_ = (((Class_xa_Sub2) class_xa_sub2).anIntArrayArrayArray8802[i_17_][i_15_]);
							if (is_19_ != null && i_18_ != 0) {
								if (i_18_ == 1) {
									int[] is_20_ = (((Class_xa_Sub2) class_xa_sub2).anIntArrayArrayArray8813[i_17_][i_15_]);
									int[] is_21_ = (((Class_xa_Sub2) class_xa_sub2).anIntArrayArrayArray8805[i_17_][i_15_]);
									int i_22_ = 0;
									while (i_22_ < is_19_.length) {
										if (is_19_[i_22_] != -1 && is_19_[i_22_ + 1] != -1 && is_19_[i_22_ + 2] != -1) {
											method3399(i_16_, i_14_, i_17_, i_15_, is_20_[i_22_], is_21_[i_22_]);
											i_22_++;
											method3399(i_16_, i_14_, i_17_, i_15_, is_20_[i_22_], is_21_[i_22_]);
											i_22_++;
											method3399(i_16_, i_14_, i_17_, i_15_, is_20_[i_22_], is_21_[i_22_]);
											i_22_++;
										} else
											i_22_ += 3;
									}
								} else if (i_18_ == 3) {
									method3399(i_16_, i_14_, i_17_, i_15_, 0, 0);
									method3399(i_16_, i_14_, i_17_, i_15_, (class_xa_sub2.anInt6395 * 550173571), 0);
									method3399(i_16_, i_14_, i_17_, i_15_, 0, (class_xa_sub2.anInt6395 * 550173571));
								} else if (i_18_ == 2) {
									method3399(i_16_, i_14_, i_17_, i_15_, (class_xa_sub2.anInt6395 * 550173571), 0);
									method3399(i_16_, i_14_, i_17_, i_15_, (class_xa_sub2.anInt6395 * 550173571), (class_xa_sub2.anInt6395 * 550173571));
									method3399(i_16_, i_14_, i_17_, i_15_, 0, 0);
								} else if (i_18_ == 5) {
									method3399(i_16_, i_14_, i_17_, i_15_, (class_xa_sub2.anInt6395 * 550173571), (class_xa_sub2.anInt6395 * 550173571));
									method3399(i_16_, i_14_, i_17_, i_15_, 0, (class_xa_sub2.anInt6395 * 550173571));
									method3399(i_16_, i_14_, i_17_, i_15_, (class_xa_sub2.anInt6395 * 550173571), 0);
								} else if (i_18_ == 4) {
									method3399(i_16_, i_14_, i_17_, i_15_, 0, (class_xa_sub2.anInt6395 * 550173571));
									method3399(i_16_, i_14_, i_17_, i_15_, 0, 0);
									method3399(i_16_, i_14_, i_17_, i_15_, (class_xa_sub2.anInt6395 * 550173571), (class_xa_sub2.anInt6395 * 550173571));
								}
							}
						}
						i_8_++;
						i_16_++;
					}
				} else
					i_8_ += (((Class330_Sub27) this).anInt7701 - ((Class330_Sub27) this).anInt7700);
				i_14_++;
			}
			method3398();
		} else {
			((Class330_Sub27) this).anInterface9_Impl1_7708 = null;
			((Class330_Sub27) this).anInterface9_Impl2_7707 = null;
		}
		((Class330_Sub27) this).aClass497_7712 = null;
		((Class330_Sub27) this).aFloatArrayArray7699 = null;
		((Class330_Sub27) this).aFloatArrayArray7706 = null;
		((Class330_Sub27) this).aFloatArrayArray7709 = null;
	}

	void method3398() {
		((Class330_Sub27) this).anInterface9_Impl2_7707 = ((Class330_Sub27) this).aClass_ra_Sub2_7705.method4975(false);
		((Class330_Sub27) this).anInterface9_Impl2_7707.method148(((Class330_Sub27) this).anInt7713);
		((Class330_Sub27) this).anInterface9_Impl1_7708 = ((Class330_Sub27) this).aClass_ra_Sub2_7705.method4976(false);
		((Class330_Sub27) this).anInterface9_Impl1_7708.method142(((Class330_Sub27) this).anInt7704 * 16, 16);
		((Class330_Sub27) this).anInterface9_Impl1_7708.method97(0, ((Class330_Sub27) this).anInt7704 * 16, ((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459);
		((Class330_Sub27) this).anInterface9_Impl2_7707.method97(0, ((Class330_Sub27) this).anInt7713 * 2, ((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459 + 2097152L);
	}

	void method3399(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		long l = -1L;
		int i_28_ = i_26_ + (i_24_ << (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6396) * -1066304221);
		int i_29_ = i_27_ + (i_25_ << (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6396) * -1066304221);
		int i_30_ = ((Class330_Sub27) this).aClass_xa_Sub2_7698.method6416(i_28_, i_29_, -803574198);
		if ((i_26_ & 0x7f) == 0 || (i_27_ & 0x7f) == 0) {
			l = ((long) i_29_ & 0xffffL) << 16 | (long) i_28_ & 0xffffL;
			Class330 class330 = ((Class330_Sub27) this).aClass497_7712.method6094(l);
			if (class330 != null) {
				Unsafe unsafe = ((Class330_Sub27) this).aClass_ra_Sub2_7705.anUnsafe8461;
				unsafe.putShort(((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459) + 2097152L + (long) (((Class330_Sub27) this).anInt7713 * 2)), ((Class330_Sub24) class330).aShort7694);
				((Class330_Sub27) this).anInt7713++;
				return;
			}
		}
		short i_31_ = (short) ((Class330_Sub27) this).anInt7704;
		if (l != -1L)
			((Class330_Sub27) this).aClass497_7712.method6097(new Class330_Sub24(i_31_), l);
		float f;
		float f_32_;
		float f_33_;
		if (i_26_ == 0 && i_27_ == 0) {
			f = ((Class330_Sub27) this).aFloatArrayArray7709[i][i_23_];
			f_32_ = ((Class330_Sub27) this).aFloatArrayArray7706[i][i_23_];
			f_33_ = ((Class330_Sub27) this).aFloatArrayArray7699[i][i_23_];
		} else if (i_26_ == (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6395) * 550173571 && i_27_ == 0) {
			f = ((Class330_Sub27) this).aFloatArrayArray7709[i + 1][i_23_];
			f_32_ = ((Class330_Sub27) this).aFloatArrayArray7706[i + 1][i_23_];
			f_33_ = ((Class330_Sub27) this).aFloatArrayArray7699[i + 1][i_23_];
		} else if (i_26_ == (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6395) * 550173571 && i_27_ == (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6395) * 550173571) {
			f = ((Class330_Sub27) this).aFloatArrayArray7709[i + 1][i_23_ + 1];
			f_32_ = (((Class330_Sub27) this).aFloatArrayArray7706[i + 1][i_23_ + 1]);
			f_33_ = (((Class330_Sub27) this).aFloatArrayArray7699[i + 1][i_23_ + 1]);
		} else if (i_26_ == 0 && i_27_ == (((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6395) * 550173571) {
			f = ((Class330_Sub27) this).aFloatArrayArray7709[i][i_23_ + 1];
			f_32_ = ((Class330_Sub27) this).aFloatArrayArray7706[i][i_23_ + 1];
			f_33_ = ((Class330_Sub27) this).aFloatArrayArray7699[i][i_23_ + 1];
		} else {
			float f_34_ = (float) i_26_ / (float) ((((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6395) * 550173571);
			float f_35_ = (float) i_27_ / (float) ((((Class330_Sub27) this).aClass_xa_Sub2_7698.anInt6395) * 550173571);
			float f_36_ = ((Class330_Sub27) this).aFloatArrayArray7709[i][i_23_];
			float f_37_ = ((Class330_Sub27) this).aFloatArrayArray7706[i][i_23_];
			float f_38_ = ((Class330_Sub27) this).aFloatArrayArray7699[i][i_23_];
			float f_39_ = ((Class330_Sub27) this).aFloatArrayArray7709[i + 1][i_23_];
			float f_40_ = ((Class330_Sub27) this).aFloatArrayArray7706[i + 1][i_23_];
			float f_41_ = ((Class330_Sub27) this).aFloatArrayArray7699[i + 1][i_23_];
			f_36_ += (((Class330_Sub27) this).aFloatArrayArray7709[i][i_23_ + 1] - f_36_) * f_34_;
			f_37_ += (((Class330_Sub27) this).aFloatArrayArray7706[i][i_23_ + 1] - f_37_) * f_34_;
			f_38_ += (((Class330_Sub27) this).aFloatArrayArray7699[i][i_23_ + 1] - f_38_) * f_34_;
			f_39_ += ((((Class330_Sub27) this).aFloatArrayArray7709[i + 1][i_23_ + 1]) - f_39_) * f_34_;
			f_40_ += ((((Class330_Sub27) this).aFloatArrayArray7706[i + 1][i_23_ + 1]) - f_40_) * f_34_;
			f_41_ += ((((Class330_Sub27) this).aFloatArrayArray7699[i + 1][i_23_ + 1]) - f_41_) * f_34_;
			f = f_36_ + (f_39_ - f_36_) * f_35_;
			f_32_ = f_37_ + (f_40_ - f_37_) * f_35_;
			f_33_ = f_38_ + (f_41_ - f_38_) * f_35_;
		}
		float f_42_ = (float) (((Class330_Sub27) this).aClass330_Sub14_7697.method3318(-503878945) - i_28_);
		float f_43_ = (float) (((Class330_Sub27) this).aClass330_Sub14_7697.method3311((byte) -3) - i_30_);
		float f_44_ = (float) (((Class330_Sub27) this).aClass330_Sub14_7697.method3312((short) -23129) - i_29_);
		float f_45_ = (float) Math.sqrt((double) (f_42_ * f_42_ + f_43_ * f_43_ + f_44_ * f_44_));
		float f_46_ = 1.0F / f_45_;
		f_42_ *= f_46_;
		f_43_ *= f_46_;
		f_44_ *= f_46_;
		float f_47_ = f_45_ / (float) ((Class330_Sub27) this).aClass330_Sub14_7697.method3316((byte) 56);
		float f_48_ = 1.0F - f_47_ * f_47_;
		if (f_48_ < 0.0F)
			f_48_ = 0.0F;
		float f_49_ = f_42_ * f + f_43_ * f_32_ + f_44_ * f_33_;
		if (f_49_ < 0.0F)
			f_49_ = 0.0F;
		float f_50_ = f_49_ * f_48_ * 2.0F;
		if (f_50_ > 1.0F)
			f_50_ = 1.0F;
		int i_51_ = ((Class330_Sub27) this).aClass330_Sub14_7697.method3313(-1056161123);
		int i_52_ = (int) (f_50_ * (float) (i_51_ >> 16 & 0xff));
		if (i_52_ > 255)
			i_52_ = 255;
		int i_53_ = (int) (f_50_ * (float) (i_51_ >> 8 & 0xff));
		if (i_53_ > 255)
			i_53_ = 255;
		int i_54_ = (int) (f_50_ * (float) (i_51_ & 0xff));
		if (i_54_ > 255)
			i_54_ = 255;
		Unsafe unsafe = ((Class330_Sub27) this).aClass_ra_Sub2_7705.anUnsafe8461;
		unsafe.putFloat((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459 + (long) (((Class330_Sub27) this).anInt7704 * 16)), (float) i_28_);
		unsafe.putFloat((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459 + (long) (((Class330_Sub27) this).anInt7704 * 16) + 4L), (float) i_30_);
		unsafe.putFloat((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459 + (long) (((Class330_Sub27) this).anInt7704 * 16) + 8L), (float) i_29_);
		if ((((Class_ra_Sub2) ((Class330_Sub27) this).aClass_ra_Sub2_7705).anInt8591) == 0) {
			unsafe.putByte(((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459) + (long) (((Class330_Sub27) this).anInt7704 * 16) + 12L), (byte) i_54_);
			unsafe.putByte(((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459) + (long) (((Class330_Sub27) this).anInt7704 * 16) + 13L), (byte) i_53_);
			unsafe.putByte(((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459) + (long) (((Class330_Sub27) this).anInt7704 * 16) + 14L), (byte) i_52_);
		} else {
			unsafe.putByte(((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459) + (long) (((Class330_Sub27) this).anInt7704 * 16) + 12L), (byte) i_52_);
			unsafe.putByte(((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459) + (long) (((Class330_Sub27) this).anInt7704 * 16) + 13L), (byte) i_53_);
			unsafe.putByte(((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459) + (long) (((Class330_Sub27) this).anInt7704 * 16) + 14L), (byte) i_54_);
		}
		unsafe.putByte((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459 + (long) (((Class330_Sub27) this).anInt7704 * 16) + 15L), (byte) -1);
		((Class330_Sub27) this).anInt7704++;
		unsafe.putShort((((Class330_Sub27) this).aClass_ra_Sub2_7705.aLong8459 + 2097152L + (long) (((Class330_Sub27) this).anInt7713 * 2)), i_31_);
		((Class330_Sub27) this).anInt7713++;
	}
}
