/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class58 {
	int anInt542;
	Class_xa_Sub1 aClass_xa_Sub1_543;
	int anInt544;
	Class_ra_Sub1 aClass_ra_Sub1_545;
	byte[] aByteArray546;
	int anInt547;
	int anInt548;
	int anInt549;
	Class30[][] aClass30ArrayArray550;

	void method660(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool) {
		((Class58) this).aClass_ra_Sub1_545.method4854(false);
		((Class58) this).aClass_ra_Sub1_545.method4815(false);
		((Class58) this).aClass_ra_Sub1_545.method4841(-2);
		((Class58) this).aClass_ra_Sub1_545.method4836(1);
		((Class58) this).aClass_ra_Sub1_545.method4859(1);
		float f = 1.0F / (float) (((Class_ra_Sub1) ((Class58) this).aClass_ra_Sub1_545).anInt8305 * 128);
		if (bool) {
			for (int i_2_ = 0; i_2_ < ((Class58) this).anInt548; i_2_++) {
				int i_3_ = i_2_ << ((Class58) this).anInt549;
				int i_4_ = i_2_ + 1 << ((Class58) this).anInt549;
				for (int i_5_ = 0; i_5_ < ((Class58) this).anInt542; i_5_++) {
					int i_6_ = i_5_ << ((Class58) this).anInt549;
					int i_7_ = i_5_ + 1 << ((Class58) this).anInt549;
					while_63_: for (int i_8_ = i_6_; i_8_ < i_7_; i_8_++) {
						if (i_8_ - i >= -i_1_ && i_8_ - i <= i_1_) {
							for (int i_9_ = i_3_; i_9_ < i_4_; i_9_++) {
								if (i_9_ - i_0_ >= -i_1_ && i_9_ - i_0_ <= i_1_ && (bools[i_8_ - i + i_1_][i_9_ - i_0_ + i_1_])) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(f, f, 1.0F);
									OpenGL.glTranslatef((float) -i_5_ / f, (float) -i_2_ / f, 1.0F);
									OpenGL.glMatrixMode(5888);
									((Class58) this).aClass30ArrayArray550[i_5_][i_2_].method498();
									break while_63_;
								}
							}
						}
					}
				}
			}
		} else {
			for (int i_10_ = 0; i_10_ < ((Class58) this).anInt548; i_10_++) {
				int i_11_ = i_10_ << ((Class58) this).anInt549;
				int i_12_ = i_10_ + 1 << ((Class58) this).anInt549;
				for (int i_13_ = 0; i_13_ < ((Class58) this).anInt542; i_13_++) {
					int i_14_ = 0;
					int i_15_ = i_13_ << ((Class58) this).anInt549;
					int i_16_ = i_13_ + 1 << ((Class58) this).anInt549;
					Class330_Sub46_Sub1 class330_sub46_sub1 = (((Class_ra_Sub1) ((Class58) this).aClass_ra_Sub1_545).aClass330_Sub46_Sub1_8381);
					class330_sub46_sub1.offset = 0;
					for (int i_17_ = i_11_; i_17_ < i_12_; i_17_++) {
						if (i_17_ - i_0_ >= -i_1_ && i_17_ - i_0_ <= i_1_) {
							int i_18_ = (i_17_ * ((((Class58) this).aClass_xa_Sub1_543.anInt6397) * 1972554729) + i_15_);
							for (int i_19_ = i_15_; i_19_ < i_16_; i_19_++) {
								if (i_19_ - i >= -i_1_ && i_19_ - i <= i_1_ && (bools[i_19_ - i + i_1_][i_17_ - i_0_ + i_1_])) {
									short[] is = (((Class_xa_Sub1) (((Class58) this).aClass_xa_Sub1_543)).aShortArrayArray8756[i_18_]);
									if (is != null) {
										if (((Class_ra_Sub1) (((Class58) this).aClass_ra_Sub1_545)).aBoolean8407) {
											for (int i_20_ = 0; i_20_ < is.length; i_20_++) {
												class330_sub46_sub1.addShort(is[i_20_] & 0xffff, (byte) 121);
												i_14_++;
											}
										} else {
											for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
												class330_sub46_sub1.method3742(is[i_21_] & 0xffff, (short) 3493);
												i_14_++;
											}
										}
									}
								}
								i_18_++;
							}
						}
					}
					if (i_14_ > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(f, f, 1.0F);
						OpenGL.glTranslatef((float) -i_13_ / f, (float) -i_10_ / f, 1.0F);
						OpenGL.glMatrixMode(5888);
						((Class58) this).aClass30ArrayArray550[i_13_][i_10_].method500(class330_sub46_sub1.payload, i_14_);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method661() {
		((Class58) this).aClass30ArrayArray550 = (new Class30[((Class58) this).anInt542][((Class58) this).anInt548]);
		for (int i = 0; i < ((Class58) this).anInt548; i++) {
			for (int i_22_ = 0; i_22_ < ((Class58) this).anInt542; i_22_++)
				((Class58) this).aClass30ArrayArray550[i_22_][i] = new Class30(((Class58) this).aClass_ra_Sub1_545, this, ((Class58) this).aClass_xa_Sub1_543, i_22_, i, ((Class58) this).anInt549, i_22_ * 128 + 1, i * 128 + 1);
		}
	}

	void method662(Class_na class_na, int i, int i_23_) {
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		i += ((Class_na_Sub2) class_na_sub2).anInt10165 + 1;
		i_23_ += ((Class_na_Sub2) class_na_sub2).anInt10161 + 1;
		int i_24_ = i + i_23_ * ((Class58) this).anInt544;
		int i_25_ = 0;
		int i_26_ = ((Class_na_Sub2) class_na_sub2).anInt10163;
		int i_27_ = ((Class_na_Sub2) class_na_sub2).anInt10162;
		int i_28_ = ((Class58) this).anInt544 - i_27_;
		int i_29_ = 0;
		if (i_23_ <= 0) {
			int i_30_ = 1 - i_23_;
			i_26_ -= i_30_;
			i_25_ += i_30_ * i_27_;
			i_24_ += i_30_ * ((Class58) this).anInt544;
			i_23_ = 1;
		}
		if (i_23_ + i_26_ >= ((Class58) this).anInt547) {
			int i_31_ = i_23_ + i_26_ + 1 - ((Class58) this).anInt547;
			i_26_ -= i_31_;
		}
		if (i <= 0) {
			int i_32_ = 1 - i;
			i_27_ -= i_32_;
			i_25_ += i_32_;
			i_24_ += i_32_;
			i_29_ += i_32_;
			i_28_ += i_32_;
			i = 1;
		}
		if (i + i_27_ >= ((Class58) this).anInt544) {
			int i_33_ = i + i_27_ + 1 - ((Class58) this).anInt544;
			i_27_ -= i_33_;
			i_29_ += i_33_;
			i_28_ += i_33_;
		}
		if (i_27_ > 0 && i_26_ > 0) {
			method663(((Class58) this).aByteArray546, ((Class_na_Sub2) class_na_sub2).aByteArray10166, i_25_, i_24_, i_27_, i_26_, i_28_, i_29_);
			method665(i, i_23_, i_27_, i_26_);
		}
	}

	static final void method663(byte[] is, byte[] is_34_, int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_) {
		int i_40_ = -(i_36_ >> 2);
		i_36_ = -(i_36_ & 0x3);
		for (int i_41_ = -i_37_; i_41_ < 0; i_41_++) {
			for (int i_42_ = i_40_; i_42_ < 0; i_42_++) {
				is[i_35_++] -= is_34_[i++];
				is[i_35_++] -= is_34_[i++];
				is[i_35_++] -= is_34_[i++];
				is[i_35_++] -= is_34_[i++];
			}
			for (int i_43_ = i_36_; i_43_ < 0; i_43_++)
				is[i_35_++] -= is_34_[i++];
			i_35_ += i_38_;
			i += i_39_;
		}
	}

	boolean method664(Class_na class_na, int i, int i_44_) {
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		i += ((Class_na_Sub2) class_na_sub2).anInt10165 + 1;
		i_44_ += ((Class_na_Sub2) class_na_sub2).anInt10161 + 1;
		int i_45_ = i + i_44_ * ((Class58) this).anInt544;
		int i_46_ = ((Class_na_Sub2) class_na_sub2).anInt10163;
		int i_47_ = ((Class_na_Sub2) class_na_sub2).anInt10162;
		int i_48_ = ((Class58) this).anInt544 - i_47_;
		if (i_44_ <= 0) {
			int i_49_ = 1 - i_44_;
			i_46_ -= i_49_;
			i_45_ += i_49_ * ((Class58) this).anInt544;
			i_44_ = 1;
		}
		if (i_44_ + i_46_ >= ((Class58) this).anInt547) {
			int i_50_ = i_44_ + i_46_ + 1 - ((Class58) this).anInt547;
			i_46_ -= i_50_;
		}
		if (i <= 0) {
			int i_51_ = 1 - i;
			i_47_ -= i_51_;
			i_45_ += i_51_;
			i_48_ += i_51_;
			i = 1;
		}
		if (i + i_47_ >= ((Class58) this).anInt544) {
			int i_52_ = i + i_47_ + 1 - ((Class58) this).anInt544;
			i_47_ -= i_52_;
			i_48_ += i_52_;
		}
		if (i_47_ <= 0 || i_46_ <= 0)
			return false;
		int i_53_ = 8;
		i_48_ += (i_53_ - 1) * ((Class58) this).anInt544;
		return method666(((Class58) this).aByteArray546, i_45_, i_47_, i_46_, i_48_, i_53_);
	}

	void method665(int i, int i_54_, int i_55_, int i_56_) {
		if (((Class58) this).aClass30ArrayArray550 != null) {
			int i_57_ = i - 1 >> 7;
			int i_58_ = i - 1 + i_55_ - 1 >> 7;
			int i_59_ = i_54_ - 1 >> 7;
			int i_60_ = i_54_ - 1 + i_56_ - 1 >> 7;
			for (int i_61_ = i_57_; i_61_ <= i_58_; i_61_++) {
				Class30[] class30s = ((Class58) this).aClass30ArrayArray550[i_61_];
				for (int i_62_ = i_59_; i_62_ <= i_60_; i_62_++)
					((Class30) class30s[i_62_]).aBoolean342 = true;
			}
		}
	}

	static final boolean method666(byte[] is, int i, int i_63_, int i_64_, int i_65_, int i_66_) {
		int i_67_ = i_63_ % i_66_;
		int i_68_;
		if (i_67_ != 0)
			i_68_ = i_66_ - i_67_;
		else
			i_68_ = 0;
		int i_69_ = -((i_64_ + i_66_ - 1) / i_66_);
		int i_70_ = -((i_63_ + i_66_ - 1) / i_66_);
		for (int i_71_ = i_69_; i_71_ < 0; i_71_++) {
			for (int i_72_ = i_70_; i_72_ < 0; i_72_++) {
				if (is[i] == 0)
					return true;
				i += i_66_;
			}
			i -= i_68_;
			if (is[i - 1] == 0)
				return true;
			i += i_65_;
		}
		return false;
	}

	Class58(Class_ra_Sub1 class_ra_sub1, Class_xa_Sub1 class_xa_sub1) {
		((Class58) this).aClass_ra_Sub1_545 = class_ra_sub1;
		((Class58) this).aClass_xa_Sub1_543 = class_xa_sub1;
		((Class58) this).anInt544 = 2 + ((((Class58) this).aClass_xa_Sub1_543.anInt6397 * 1972554729 * (((Class58) this).aClass_xa_Sub1_543.anInt6395 * 550173571)) >> (((Class_ra_Sub1) ((Class58) this).aClass_ra_Sub1_545).anInt8296));
		((Class58) this).anInt547 = 2 + ((((Class58) this).aClass_xa_Sub1_543.anInt6393 * 24567321 * (((Class58) this).aClass_xa_Sub1_543.anInt6395 * 550173571)) >> (((Class_ra_Sub1) ((Class58) this).aClass_ra_Sub1_545).anInt8296));
		((Class58) this).aByteArray546 = new byte[((Class58) this).anInt544 * ((Class58) this).anInt547];
		((Class58) this).anInt549 = (7 + (((Class_ra_Sub1) ((Class58) this).aClass_ra_Sub1_545).anInt8296) - ((Class58) this).aClass_xa_Sub1_543.anInt6396 * -1066304221);
		((Class58) this).anInt542 = (((Class58) this).aClass_xa_Sub1_543.anInt6397 * 1972554729 >> ((Class58) this).anInt549);
		((Class58) this).anInt548 = (((Class58) this).aClass_xa_Sub1_543.anInt6393 * 24567321 >> ((Class58) this).anInt549);
	}

	void method667(Class_na class_na, int i, int i_73_) {
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		i += ((Class_na_Sub2) class_na_sub2).anInt10165 + 1;
		i_73_ += ((Class_na_Sub2) class_na_sub2).anInt10161 + 1;
		int i_74_ = i + i_73_ * ((Class58) this).anInt544;
		int i_75_ = 0;
		int i_76_ = ((Class_na_Sub2) class_na_sub2).anInt10163;
		int i_77_ = ((Class_na_Sub2) class_na_sub2).anInt10162;
		int i_78_ = ((Class58) this).anInt544 - i_77_;
		int i_79_ = 0;
		if (i_73_ <= 0) {
			int i_80_ = 1 - i_73_;
			i_76_ -= i_80_;
			i_75_ += i_80_ * i_77_;
			i_74_ += i_80_ * ((Class58) this).anInt544;
			i_73_ = 1;
		}
		if (i_73_ + i_76_ >= ((Class58) this).anInt547) {
			int i_81_ = i_73_ + i_76_ + 1 - ((Class58) this).anInt547;
			i_76_ -= i_81_;
		}
		if (i <= 0) {
			int i_82_ = 1 - i;
			i_77_ -= i_82_;
			i_75_ += i_82_;
			i_74_ += i_82_;
			i_79_ += i_82_;
			i_78_ += i_82_;
			i = 1;
		}
		if (i + i_77_ >= ((Class58) this).anInt544) {
			int i_83_ = i + i_77_ + 1 - ((Class58) this).anInt544;
			i_77_ -= i_83_;
			i_79_ += i_83_;
			i_78_ += i_83_;
		}
		if (i_77_ > 0 && i_76_ > 0) {
			method668(((Class58) this).aByteArray546, ((Class_na_Sub2) class_na_sub2).aByteArray10166, i_75_, i_74_, i_77_, i_76_, i_78_, i_79_);
			method665(i, i_73_, i_77_, i_76_);
		}
	}

	static final void method668(byte[] is, byte[] is_84_, int i, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
		int i_90_ = -(i_86_ >> 2);
		i_86_ = -(i_86_ & 0x3);
		for (int i_91_ = -i_87_; i_91_ < 0; i_91_++) {
			for (int i_92_ = i_90_; i_92_ < 0; i_92_++) {
				is[i_85_++] += is_84_[i++];
				is[i_85_++] += is_84_[i++];
				is[i_85_++] += is_84_[i++];
				is[i_85_++] += is_84_[i++];
			}
			for (int i_93_ = i_86_; i_93_ < 0; i_93_++)
				is[i_85_++] += is_84_[i++];
			i_85_ += i_88_;
			i += i_89_;
		}
	}
}
