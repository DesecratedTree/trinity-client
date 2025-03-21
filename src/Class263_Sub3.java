/* Class263_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class263_Sub3 extends Class263 {
	Class_ra_Sub3 aClass_ra_Sub3_7380;
	byte[][] aByteArrayArray7381;
	int[] anIntArray7382;
	int[] anIntArray7383;
	int[] anIntArray7384;
	int[] anIntArray7385;
	public static int anInt7386;

	void c(char c, int i, int i_0_, int i_1_, boolean bool) {
		if ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630) != null) {
			i += ((Class263_Sub3) this).anIntArray7385[c];
			i_0_ += ((Class263_Sub3) this).anIntArray7382[c];
			int i_2_ = ((Class263_Sub3) this).anIntArray7384[c];
			int i_3_ = ((Class263_Sub3) this).anIntArray7383[c];
			int i_4_ = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8618) * -1504772933;
			int i_5_ = i_4_ * i_0_ + i;
			int i_6_ = i_4_ - i_2_;
			int i_7_ = 0;
			int i_8_ = 0;
			if (i_0_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623)) {
				int i_9_ = (-1679642481 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623) - i_0_);
				i_3_ -= i_9_;
				i_0_ = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623 * -1679642481);
				i_8_ += i_2_ * i_9_;
				i_5_ += i_9_ * i_4_;
			}
			if (i_3_ + i_0_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8624))
				i_3_ -= (i_3_ + i_0_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624));
			if (i < 512290825 * (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621)) {
				int i_10_ = ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621) * 512290825 - i);
				i_2_ -= i_10_;
				i = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621 * 512290825);
				i_8_ += i_10_;
				i_5_ += i_10_;
				i_7_ += i_10_;
				i_6_ += i_10_;
			}
			if (i_2_ + i > -1071049483 * (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8635)) {
				int i_11_ = i + i_2_ - -1071049483 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635);
				i_2_ -= i_11_;
				i_7_ += i_11_;
				i_6_ += i_11_;
			}
			if (i_2_ > 0 && i_3_ > 0) {
				if ((i_1_ & ~0xffffff) == -16777216)
					method2626(((Class263_Sub3) this).aByteArrayArray7381[c], (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630), i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
				else if (0 != (i_1_ & ~0xffffff))
					method2627(((Class263_Sub3) this).aByteArrayArray7381[c], (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630), i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
			}
		}
	}

	void UA(char c, int i, int i_12_, int i_13_, boolean bool) {
		if ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630) != null) {
			i += ((Class263_Sub3) this).anIntArray7385[c];
			i_12_ += ((Class263_Sub3) this).anIntArray7382[c];
			int i_14_ = ((Class263_Sub3) this).anIntArray7384[c];
			int i_15_ = ((Class263_Sub3) this).anIntArray7383[c];
			int i_16_ = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8618) * -1504772933;
			int i_17_ = i_16_ * i_12_ + i;
			int i_18_ = i_16_ - i_14_;
			int i_19_ = 0;
			int i_20_ = 0;
			if (i_12_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623)) {
				int i_21_ = (-1679642481 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623) - i_12_);
				i_15_ -= i_21_;
				i_12_ = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623 * -1679642481);
				i_20_ += i_14_ * i_21_;
				i_17_ += i_21_ * i_16_;
			}
			if (i_15_ + i_12_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8624))
				i_15_ -= i_15_ + i_12_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624);
			if (i < 512290825 * (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621)) {
				int i_22_ = ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621) * 512290825 - i);
				i_14_ -= i_22_;
				i = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621 * 512290825);
				i_20_ += i_22_;
				i_17_ += i_22_;
				i_19_ += i_22_;
				i_18_ += i_22_;
			}
			if (i_14_ + i > -1071049483 * (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8635)) {
				int i_23_ = i + i_14_ - -1071049483 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635);
				i_14_ -= i_23_;
				i_19_ += i_23_;
				i_18_ += i_23_;
			}
			if (i_14_ > 0 && i_15_ > 0) {
				if ((i_13_ & ~0xffffff) == -16777216)
					method2626(((Class263_Sub3) this).aByteArrayArray7381[c], (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630), i_13_, i_20_, i_17_, i_14_, i_15_, i_18_, i_19_);
				else if (0 != (i_13_ & ~0xffffff))
					method2627(((Class263_Sub3) this).aByteArrayArray7381[c], (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630), i_13_, i_20_, i_17_, i_14_, i_15_, i_18_, i_19_);
			}
		}
	}

	void method2626(byte[] is, int[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		int i_31_ = -(i_27_ >> 2);
		i_27_ = -(i_27_ & 0x3);
		for (int i_32_ = -i_28_; i_32_ < 0; i_32_++) {
			for (int i_33_ = i_31_; i_33_ < 0; i_33_++) {
				if (is[i_25_++] != 0)
					is_24_[i_26_++] = i;
				else
					i_26_++;
				if (is[i_25_++] != 0)
					is_24_[i_26_++] = i;
				else
					i_26_++;
				if (is[i_25_++] != 0)
					is_24_[i_26_++] = i;
				else
					i_26_++;
				if (is[i_25_++] != 0)
					is_24_[i_26_++] = i;
				else
					i_26_++;
			}
			for (int i_34_ = i_27_; i_34_ < 0; i_34_++) {
				if (is[i_25_++] != 0)
					is_24_[i_26_++] = i;
				else
					i_26_++;
			}
			i_26_ += i_29_;
			i_25_ += i_30_;
		}
	}

	void method2627(byte[] is, int[] is_35_, int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
		int i_42_ = i >>> 24;
		int i_43_ = 255 - i_42_;
		for (int i_44_ = -i_39_; i_44_ < 0; i_44_++) {
			for (int i_45_ = -i_38_; i_45_ < 0; i_45_++) {
				if (is[i_36_++] != 0) {
					int i_46_ = (((i_42_ * (i & 0xff00ff) & ~0xff00ff) + ((i & 0xff00) * i_42_ & 0xff0000)) >> 8);
					int i_47_ = is_35_[i_37_];
					is_35_[i_37_++] = i_46_ + ((((i_47_ & 0xff00) * i_43_ & 0xff0000) + ((i_47_ & 0xff00ff) * i_43_ & ~0xff00ff)) >> 8);
				} else
					i_37_++;
			}
			i_37_ += i_40_;
			i_36_ += i_41_;
		}
	}

	void method2602(char c, int i, int i_48_, int i_49_, boolean bool, Class_ta class_ta, int i_50_, int i_51_) {
		if ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630) != null) {
			if (null == class_ta)
				UA(c, i, i_48_, i_49_, bool);
			else {
				i += ((Class263_Sub3) this).anIntArray7385[c];
				i_48_ += ((Class263_Sub3) this).anIntArray7382[c];
				int i_52_ = ((Class263_Sub3) this).anIntArray7384[c];
				int i_53_ = ((Class263_Sub3) this).anIntArray7383[c];
				int i_54_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8618);
				int i_55_ = i_48_ * i_54_ + i;
				int i_56_ = i_54_ - i_52_;
				int i_57_ = 0;
				int i_58_ = 0;
				if (i_48_ < (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623 * -1679642481)) {
					int i_59_ = ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481 - i_48_);
					i_53_ -= i_59_;
					i_48_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623;
					i_58_ += i_52_ * i_59_;
					i_55_ += i_54_ * i_59_;
				}
				if (i_48_ + i_53_ > (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624) * 31822541)
					i_53_ -= i_48_ + i_53_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621)) {
					int i_60_ = 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621) - i;
					i_52_ -= i_60_;
					i = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621 * 512290825);
					i_58_ += i_60_;
					i_55_ += i_60_;
					i_57_ += i_60_;
					i_56_ += i_60_;
				}
				if (i + i_52_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635)) {
					int i_61_ = (i + i_52_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635);
					i_52_ -= i_61_;
					i_57_ += i_61_;
					i_56_ += i_61_;
				}
				if (i_52_ > 0 && i_53_ > 0) {
					if ((i_49_ & ~0xffffff) == -16777216)
						method2628((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_49_, i_58_, i_55_, i_52_, i_53_, i_56_, i_57_, i, i_48_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_50_, i_51_);
					else
						method2629((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_49_, i_58_, i_55_, i_52_, i_53_, i_56_, i_57_, i, i_48_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_50_, i_51_);
				}
			}
		}
	}

	void method2628(byte[] is, int[] is_62_, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, Class_ta class_ta, int i_72_, int i_73_) {
		Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
		int[] is_74_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
		int[] is_75_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
		int i_76_ = i_70_;
		if (i_73_ > i_76_) {
			i_76_ = i_73_;
			i_64_ += (i_73_ - i_70_) * ((((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8618) * -1504772933);
			i_63_ += i_71_ * (i_73_ - i_70_);
		}
		int i_77_ = (i_73_ + is_74_.length < i_70_ + i_66_ ? is_74_.length + i_73_ : i_66_ + i_70_);
		for (int i_78_ = i_76_; i_78_ < i_77_; i_78_++) {
			int i_79_ = is_74_[i_78_ - i_73_] + i_72_;
			int i_80_ = is_75_[i_78_ - i_73_];
			int i_81_ = i_65_;
			if (i_69_ > i_79_) {
				int i_82_ = i_69_ - i_79_;
				if (i_82_ >= i_80_) {
					i_63_ += i_68_ + i_65_;
					i_64_ += i_67_ + i_65_;
					continue;
				}
				i_80_ -= i_82_;
			} else {
				int i_83_ = i_79_ - i_69_;
				if (i_83_ >= i_65_) {
					i_63_ += i_68_ + i_65_;
					i_64_ += i_65_ + i_67_;
					continue;
				}
				i_63_ += i_83_;
				i_81_ -= i_83_;
				i_64_ += i_83_;
			}
			int i_84_ = 0;
			if (i_81_ < i_80_)
				i_80_ = i_81_;
			else
				i_84_ = i_81_ - i_80_;
			for (int i_85_ = 0; i_85_ < i_80_; i_85_++) {
				if (is[i_63_++] != 0)
					is_62_[i_64_++] = i;
				else
					i_64_++;
			}
			i_63_ += i_68_ + i_84_;
			i_64_ += i_84_ + i_67_;
		}
	}

	Class263_Sub3(Class_ra_Sub3 class_ra_sub3, Class524 class524, Class87_Sub2[] class87_sub2s, int[] is, int[] is_86_) {
		super(class_ra_sub3, class524);
		((Class263_Sub3) this).aClass_ra_Sub3_7380 = class_ra_sub3;
		((Class263_Sub3) this).anIntArray7384 = is;
		((Class263_Sub3) this).anIntArray7383 = is_86_;
		((Class263_Sub3) this).aByteArrayArray7381 = new byte[class87_sub2s.length][];
		((Class263_Sub3) this).anIntArray7382 = new int[class87_sub2s.length];
		((Class263_Sub3) this).anIntArray7385 = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			((Class263_Sub3) this).aByteArrayArray7381[i] = class87_sub2s[i].aByteArray7114;
			((Class263_Sub3) this).anIntArray7382[i] = class87_sub2s[i].anInt7111;
			((Class263_Sub3) this).anIntArray7385[i] = class87_sub2s[i].anInt7109;
		}
	}

	void method2610(char c, int i, int i_87_, int i_88_, boolean bool, Class_ta class_ta, int i_89_, int i_90_) {
		if ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630) != null) {
			if (null == class_ta)
				UA(c, i, i_87_, i_88_, bool);
			else {
				i += ((Class263_Sub3) this).anIntArray7385[c];
				i_87_ += ((Class263_Sub3) this).anIntArray7382[c];
				int i_91_ = ((Class263_Sub3) this).anIntArray7384[c];
				int i_92_ = ((Class263_Sub3) this).anIntArray7383[c];
				int i_93_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8618);
				int i_94_ = i_87_ * i_93_ + i;
				int i_95_ = i_93_ - i_91_;
				int i_96_ = 0;
				int i_97_ = 0;
				if (i_87_ < (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623 * -1679642481)) {
					int i_98_ = ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481 - i_87_);
					i_92_ -= i_98_;
					i_87_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623;
					i_97_ += i_91_ * i_98_;
					i_94_ += i_93_ * i_98_;
				}
				if (i_87_ + i_92_ > (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624) * 31822541)
					i_92_ -= i_87_ + i_92_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621)) {
					int i_99_ = 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621) - i;
					i_91_ -= i_99_;
					i = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621 * 512290825);
					i_97_ += i_99_;
					i_94_ += i_99_;
					i_96_ += i_99_;
					i_95_ += i_99_;
				}
				if (i + i_91_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635)) {
					int i_100_ = (i + i_91_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635);
					i_91_ -= i_100_;
					i_96_ += i_100_;
					i_95_ += i_100_;
				}
				if (i_91_ > 0 && i_92_ > 0) {
					if ((i_88_ & ~0xffffff) == -16777216)
						method2628((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_88_, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_, i, i_87_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_89_, i_90_);
					else
						method2629((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_88_, i_97_, i_94_, i_91_, i_92_, i_95_, i_96_, i, i_87_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_89_, i_90_);
				}
			}
		}
	}

	void method2609(char c, int i, int i_101_, int i_102_, boolean bool, Class_ta class_ta, int i_103_, int i_104_) {
		if ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630) != null) {
			if (null == class_ta)
				UA(c, i, i_101_, i_102_, bool);
			else {
				i += ((Class263_Sub3) this).anIntArray7385[c];
				i_101_ += ((Class263_Sub3) this).anIntArray7382[c];
				int i_105_ = ((Class263_Sub3) this).anIntArray7384[c];
				int i_106_ = ((Class263_Sub3) this).anIntArray7383[c];
				int i_107_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8618);
				int i_108_ = i_101_ * i_107_ + i;
				int i_109_ = i_107_ - i_105_;
				int i_110_ = 0;
				int i_111_ = 0;
				if (i_101_ < (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481) {
					int i_112_ = ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481 - i_101_);
					i_106_ -= i_112_;
					i_101_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623;
					i_111_ += i_105_ * i_112_;
					i_108_ += i_107_ * i_112_;
				}
				if (i_101_ + i_106_ > (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624) * 31822541)
					i_106_ -= (i_101_ + i_106_ - 31822541 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621)) {
					int i_113_ = 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621) - i;
					i_105_ -= i_113_;
					i = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621 * 512290825);
					i_111_ += i_113_;
					i_108_ += i_113_;
					i_110_ += i_113_;
					i_109_ += i_113_;
				}
				if (i + i_105_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635)) {
					int i_114_ = (i + i_105_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635);
					i_105_ -= i_114_;
					i_110_ += i_114_;
					i_109_ += i_114_;
				}
				if (i_105_ > 0 && i_106_ > 0) {
					if ((i_102_ & ~0xffffff) == -16777216)
						method2628((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_102_, i_111_, i_108_, i_105_, i_106_, i_109_, i_110_, i, i_101_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_103_, i_104_);
					else
						method2629((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_102_, i_111_, i_108_, i_105_, i_106_, i_109_, i_110_, i, i_101_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_103_, i_104_);
				}
			}
		}
	}

	void method2629(byte[] is, int[] is_115_, int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, Class_ta class_ta, int i_125_, int i_126_) {
		Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
		int[] is_127_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
		int[] is_128_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
		int i_129_ = i_122_ - 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621);
		int i_130_ = i_123_;
		if (i_126_ > i_130_) {
			i_130_ = i_126_;
			i_117_ += ((i_126_ - i_123_) * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8618 * -1504772933));
			i_116_ += (i_126_ - i_123_) * i_124_;
		}
		int i_131_ = (i_126_ + is_127_.length < i_119_ + i_123_ ? i_126_ + is_127_.length : i_119_ + i_123_);
		int i_132_ = i >>> 24;
		int i_133_ = 255 - i_132_;
		for (int i_134_ = i_130_; i_134_ < i_131_; i_134_++) {
			int i_135_ = is_127_[i_134_ - i_126_] + i_125_;
			int i_136_ = is_128_[i_134_ - i_126_];
			int i_137_ = i_118_;
			if (i_129_ > i_135_) {
				int i_138_ = i_129_ - i_135_;
				if (i_138_ >= i_136_) {
					i_116_ += i_118_ + i_121_;
					i_117_ += i_120_ + i_118_;
					continue;
				}
				i_136_ -= i_138_;
			} else {
				int i_139_ = i_135_ - i_129_;
				if (i_139_ >= i_118_) {
					i_116_ += i_118_ + i_121_;
					i_117_ += i_120_ + i_118_;
					continue;
				}
				i_116_ += i_139_;
				i_137_ -= i_139_;
				i_117_ += i_139_;
			}
			int i_140_ = 0;
			if (i_137_ < i_136_)
				i_136_ = i_137_;
			else
				i_140_ = i_137_ - i_136_;
			for (int i_141_ = -i_136_; i_141_ < 0; i_141_++) {
				if (is[i_116_++] != 0) {
					int i_142_ = ((((i & 0xff00ff) * i_132_ & ~0xff00ff) + ((i & 0xff00) * i_132_ & 0xff0000)) >> 8);
					int i_143_ = is_115_[i_117_];
					is_115_[i_117_++] = i_142_ + (((i_133_ * (i_143_ & 0xff00ff) & ~0xff00ff) + (i_133_ * (i_143_ & 0xff00) & 0xff0000)) >> 8);
				} else
					i_117_++;
			}
			i_116_ += i_121_ + i_140_;
			i_117_ += i_140_ + i_120_;
		}
	}

	void method2604(char c, int i, int i_144_, int i_145_, boolean bool, Class_ta class_ta, int i_146_, int i_147_) {
		if ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630) != null) {
			if (null == class_ta)
				UA(c, i, i_144_, i_145_, bool);
			else {
				i += ((Class263_Sub3) this).anIntArray7385[c];
				i_144_ += ((Class263_Sub3) this).anIntArray7382[c];
				int i_148_ = ((Class263_Sub3) this).anIntArray7384[c];
				int i_149_ = ((Class263_Sub3) this).anIntArray7383[c];
				int i_150_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8618);
				int i_151_ = i_144_ * i_150_ + i;
				int i_152_ = i_150_ - i_148_;
				int i_153_ = 0;
				int i_154_ = 0;
				if (i_144_ < (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481) {
					int i_155_ = ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481 - i_144_);
					i_149_ -= i_155_;
					i_144_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623;
					i_154_ += i_148_ * i_155_;
					i_151_ += i_150_ * i_155_;
				}
				if (i_144_ + i_149_ > (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624) * 31822541)
					i_149_ -= (i_144_ + i_149_ - 31822541 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621)) {
					int i_156_ = 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621) - i;
					i_148_ -= i_156_;
					i = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621 * 512290825);
					i_154_ += i_156_;
					i_151_ += i_156_;
					i_153_ += i_156_;
					i_152_ += i_156_;
				}
				if (i + i_148_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635)) {
					int i_157_ = (i + i_148_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635);
					i_148_ -= i_157_;
					i_153_ += i_157_;
					i_152_ += i_157_;
				}
				if (i_148_ > 0 && i_149_ > 0) {
					if ((i_145_ & ~0xffffff) == -16777216)
						method2628((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_145_, i_154_, i_151_, i_148_, i_149_, i_152_, i_153_, i, i_144_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_146_, i_147_);
					else
						method2629((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_145_, i_154_, i_151_, i_148_, i_149_, i_152_, i_153_, i, i_144_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_146_, i_147_);
				}
			}
		}
	}

	void method2603(char c, int i, int i_158_, int i_159_, boolean bool, Class_ta class_ta, int i_160_, int i_161_) {
		if ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anIntArray8630) != null) {
			if (null == class_ta)
				UA(c, i, i_158_, i_159_, bool);
			else {
				i += ((Class263_Sub3) this).anIntArray7385[c];
				i_158_ += ((Class263_Sub3) this).anIntArray7382[c];
				int i_162_ = ((Class263_Sub3) this).anIntArray7384[c];
				int i_163_ = ((Class263_Sub3) this).anIntArray7383[c];
				int i_164_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8618);
				int i_165_ = i_158_ * i_164_ + i;
				int i_166_ = i_164_ - i_162_;
				int i_167_ = 0;
				int i_168_ = 0;
				if (i_158_ < (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481) {
					int i_169_ = ((((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8623) * -1679642481 - i_158_);
					i_163_ -= i_169_;
					i_158_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8623;
					i_168_ += i_162_ * i_169_;
					i_165_ += i_164_ * i_169_;
				}
				if (i_158_ + i_163_ > (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624) * 31822541)
					i_163_ -= (i_158_ + i_163_ - 31822541 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621)) {
					int i_170_ = 512290825 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8621) - i;
					i_162_ -= i_170_;
					i = (((Class_ra_Sub3) ((Class263_Sub3) this).aClass_ra_Sub3_7380).anInt8621 * 512290825);
					i_168_ += i_170_;
					i_165_ += i_170_;
					i_167_ += i_170_;
					i_166_ += i_170_;
				}
				if (i + i_162_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635)) {
					int i_171_ = (i + i_162_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anInt8635);
					i_162_ -= i_171_;
					i_167_ += i_171_;
					i_166_ += i_171_;
				}
				if (i_162_ > 0 && i_163_ > 0) {
					if ((i_159_ & ~0xffffff) == -16777216)
						method2628((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_159_, i_168_, i_165_, i_162_, i_163_, i_166_, i_167_, i, i_158_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_160_, i_161_);
					else
						method2629((((Class263_Sub3) this).aByteArrayArray7381[c]), (((Class_ra_Sub3) (((Class263_Sub3) this).aClass_ra_Sub3_7380)).anIntArray8630), i_159_, i_168_, i_165_, i_162_, i_163_, i_166_, i_167_, i, i_158_, ((Class263_Sub3) this).anIntArray7384[c], class_ta, i_160_, i_161_);
				}
			}
		}
	}

	static boolean method2630(byte i) {
		try {
			client.anInt9027 += -1434590651;
			client.aBoolean9114 = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zg.ml(").append(')').toString());
		}
	}

	public static void method2631(String string, String string_172_, int i, boolean bool, int i_173_) {
		try {
			if (client.anInt8995 * -296919301 == 14) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2525, client.aClass1_9060.aClass488_22, 1030038407);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 46);
				int i_174_ = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -94);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string_172_, (byte) -38);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i, (byte) 66);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(bool ? 1 : 0, (byte) 4);
				class330_sub34.aClass330_Sub46_Sub2_7729.offset += -2029760457;
				class330_sub34.aClass330_Sub46_Sub2_7729.method3807(Class556.anIntArray6385, i_174_, (-824785231 * class330_sub34.aClass330_Sub46_Sub2_7729.offset), (byte) -51);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3772(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_174_, (byte) 38);
				client.aClass1_9060.method378(class330_sub34, -1868114792);
				if (i < 13) {
					client.aBoolean9273 = true;
					Class62.method768(1929139439);
				}
				Class556.aClass470_6390 = Class470.aClass470_6864;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zg.o(").append(')').toString());
		}
	}
}
