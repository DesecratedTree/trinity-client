/* Class263_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class263_Sub4 extends Class263 {
	int[] anIntArray7387;
	byte[][] aByteArrayArray7388;
	int[] anIntArray7389;
	Class_ra_Sub3 aClass_ra_Sub3_7390;
	int[] anIntArray7391;
	int[] anIntArray7392;
	int[] anIntArray7393;

	Class263_Sub4(Class_ra_Sub3 class_ra_sub3, Class524 class524, Class87_Sub2[] class87_sub2s, int[] is, int[] is_0_) {
		super(class_ra_sub3, class524);
		((Class263_Sub4) this).aClass_ra_Sub3_7390 = class_ra_sub3;
		((Class263_Sub4) this).aClass_ra_Sub3_7390 = class_ra_sub3;
		((Class263_Sub4) this).anIntArray7393 = is;
		((Class263_Sub4) this).anIntArray7391 = is_0_;
		((Class263_Sub4) this).aByteArrayArray7388 = new byte[class87_sub2s.length][];
		((Class263_Sub4) this).anIntArray7392 = new int[class87_sub2s.length];
		((Class263_Sub4) this).anIntArray7387 = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			((Class263_Sub4) this).aByteArrayArray7388[i] = class87_sub2s[i].aByteArray7114;
			((Class263_Sub4) this).anIntArray7392[i] = class87_sub2s[i].anInt7111;
			((Class263_Sub4) this).anIntArray7387[i] = class87_sub2s[i].anInt7109;
		}
		((Class263_Sub4) this).anIntArray7389 = class87_sub2s[0].anIntArray7113;
	}

	void method2609(char c, int i, int i_1_, int i_2_, boolean bool, Class_ta class_ta, int i_3_, int i_4_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_1_, i_2_, bool);
			else {
				i += ((Class263_Sub4) this).anIntArray7387[c];
				i_1_ += ((Class263_Sub4) this).anIntArray7392[c];
				int i_5_ = ((Class263_Sub4) this).anIntArray7393[c];
				int i_6_ = ((Class263_Sub4) this).anIntArray7391[c];
				int i_7_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8618);
				int i_8_ = i + i_7_ * i_1_;
				int i_9_ = i_7_ - i_5_;
				int i_10_ = 0;
				int i_11_ = 0;
				if (i_1_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623)) {
					int i_12_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481 - i_1_);
					i_6_ -= i_12_;
					i_1_ = (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623 * -1679642481);
					i_11_ += i_12_ * i_5_;
					i_8_ += i_12_ * i_7_;
				}
				if (i_6_ + i_1_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624))
					i_6_ -= (i_6_ + i_1_ - (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8621)) {
					int i_13_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825 - i);
					i_5_ -= i_13_;
					i = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621 * 512290825);
					i_11_ += i_13_;
					i_8_ += i_13_;
					i_10_ += i_13_;
					i_9_ += i_13_;
				}
				if (i + i_5_ > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8635) * -1071049483) {
					int i_14_ = (i + i_5_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8635);
					i_5_ -= i_14_;
					i_10_ += i_14_;
					i_9_ += i_14_;
				}
				if (i_5_ > 0 && i_6_ > 0) {
					if (bool)
						method2635((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), i_2_, i_11_, i_8_, i_5_, i_6_, i_9_, i_10_, i, i_1_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_3_, i_4_);
					else
						method2634((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), ((Class263_Sub4) this).anIntArray7389, i_2_, i_11_, i_8_, i_5_, i_6_, i_9_, i_10_, i, i_1_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_3_, i_4_);
				}
			}
		}
	}

	void method2632(byte[] is, int[] is_15_, int[] is_16_, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		int i_22_ = -(i_18_ >> 2);
		i_18_ = -(i_18_ & 0x3);
		boolean bool = false;
		for (int i_23_ = -i_19_; i_23_ < 0; i_23_++) {
			for (int i_24_ = i_22_; i_24_ < 0; i_24_++) {
				int i_25_;
				if ((i_25_ = is[i++]) != 0)
					is_15_[i_17_++] = is_16_[i_25_ & 0xff];
				else
					i_17_++;
				if ((i_25_ = is[i++]) != 0)
					is_15_[i_17_++] = is_16_[i_25_ & 0xff];
				else
					i_17_++;
				if ((i_25_ = is[i++]) != 0)
					is_15_[i_17_++] = is_16_[i_25_ & 0xff];
				else
					i_17_++;
				if ((i_25_ = is[i++]) != 0)
					is_15_[i_17_++] = is_16_[i_25_ & 0xff];
				else
					i_17_++;
			}
			for (int i_26_ = i_18_; i_26_ < 0; i_26_++) {
				int i_27_;
				if ((i_27_ = is[i++]) != 0)
					is_15_[i_17_++] = is_16_[i_27_ & 0xff];
				else
					i_17_++;
			}
			i_17_ += i_20_;
			i += i_21_;
		}
	}

	void method2633(byte[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		int i_35_ = -(i_31_ >> 2);
		i_31_ = -(i_31_ & 0x3);
		for (int i_36_ = -i_32_; i_36_ < 0; i_36_++) {
			for (int i_37_ = i_35_; i_37_ < 0; i_37_++) {
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
			}
			for (int i_38_ = i_31_; i_38_ < 0; i_38_++) {
				if (is[i_29_++] != 0)
					is_28_[i_30_++] = i;
				else
					i_30_++;
			}
			i_30_ += i_33_;
			i_29_ += i_34_;
		}
	}

	void method2634(byte[] is, int[] is_39_, int[] is_40_, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, Class_ta class_ta, int i_50_, int i_51_) {
		Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
		int[] is_52_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
		int[] is_53_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
		int i_54_ = i_47_ - 512290825 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621);
		int i_55_ = i_48_;
		if (i_51_ > i_55_) {
			i_55_ = i_51_;
			i_42_ += (i_51_ - i_48_) * ((((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8618) * -1504772933);
			i_41_ += (i_51_ - i_48_) * i_49_;
		}
		int i_56_ = (i_51_ + is_52_.length < i_48_ + i_44_ ? is_52_.length + i_51_ : i_48_ + i_44_);
		boolean bool = false;
		for (int i_57_ = i_55_; i_57_ < i_56_; i_57_++) {
			int i_58_ = i_50_ + is_52_[i_57_ - i_51_];
			int i_59_ = is_53_[i_57_ - i_51_];
			int i_60_ = i_43_;
			if (i_54_ > i_58_) {
				int i_61_ = i_54_ - i_58_;
				if (i_61_ >= i_59_) {
					i_41_ += i_46_ + i_43_;
					i_42_ += i_43_ + i_45_;
					continue;
				}
				i_59_ -= i_61_;
			} else {
				int i_62_ = i_58_ - i_54_;
				if (i_62_ >= i_43_) {
					i_41_ += i_43_ + i_46_;
					i_42_ += i_45_ + i_43_;
					continue;
				}
				i_41_ += i_62_;
				i_60_ -= i_62_;
				i_42_ += i_62_;
			}
			int i_63_ = 0;
			if (i_60_ < i_59_)
				i_59_ = i_60_;
			else
				i_63_ = i_60_ - i_59_;
			for (int i_64_ = -i_59_; i_64_ < 0; i_64_++) {
				int i_65_;
				if ((i_65_ = is[i_41_++]) != 0)
					is_39_[i_42_++] = is_40_[i_65_ & 0xff];
				else
					i_42_++;
			}
			i_41_ += i_63_ + i_46_;
			i_42_ += i_63_ + i_45_;
		}
	}

	void c(char c, int i, int i_66_, int i_67_, boolean bool) {
		if ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630) != null) {
			i += ((Class263_Sub4) this).anIntArray7387[c];
			i_66_ += ((Class263_Sub4) this).anIntArray7392[c];
			int i_68_ = ((Class263_Sub4) this).anIntArray7393[c];
			int i_69_ = ((Class263_Sub4) this).anIntArray7391[c];
			int i_70_ = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8618) * -1504772933;
			int i_71_ = i + i_66_ * i_70_;
			int i_72_ = i_70_ - i_68_;
			int i_73_ = 0;
			int i_74_ = 0;
			if (i_66_ < (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481) {
				int i_75_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481 - i_66_);
				i_69_ -= i_75_;
				i_66_ = -1679642481 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623);
				i_74_ += i_68_ * i_75_;
				i_71_ += i_75_ * i_70_;
			}
			if (i_66_ + i_69_ > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541)
				i_69_ -= (i_66_ + i_69_ - (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8624 * 31822541));
			if (i < (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825) {
				int i_76_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825 - i);
				i_68_ -= i_76_;
				i = 512290825 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621);
				i_74_ += i_76_;
				i_71_ += i_76_;
				i_73_ += i_76_;
				i_72_ += i_76_;
			}
			if (i_68_ + i > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8635) * -1071049483) {
				int i_77_ = i_68_ + i - -1071049483 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8635);
				i_68_ -= i_77_;
				i_73_ += i_77_;
				i_72_ += i_77_;
			}
			if (i_68_ > 0 && i_69_ > 0) {
				if (bool)
					method2633(((Class263_Sub4) this).aByteArrayArray7388[c], (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630), i_67_, i_74_, i_71_, i_68_, i_69_, i_72_, i_73_);
				else
					method2632(((Class263_Sub4) this).aByteArrayArray7388[c], (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630), ((Class263_Sub4) this).anIntArray7389, i_74_, i_71_, i_68_, i_69_, i_72_, i_73_);
			}
		}
	}

	void method2604(char c, int i, int i_78_, int i_79_, boolean bool, Class_ta class_ta, int i_80_, int i_81_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_78_, i_79_, bool);
			else {
				i += ((Class263_Sub4) this).anIntArray7387[c];
				i_78_ += ((Class263_Sub4) this).anIntArray7392[c];
				int i_82_ = ((Class263_Sub4) this).anIntArray7393[c];
				int i_83_ = ((Class263_Sub4) this).anIntArray7391[c];
				int i_84_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8618);
				int i_85_ = i + i_84_ * i_78_;
				int i_86_ = i_84_ - i_82_;
				int i_87_ = 0;
				int i_88_ = 0;
				if (i_78_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623)) {
					int i_89_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481 - i_78_);
					i_83_ -= i_89_;
					i_78_ = (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623 * -1679642481);
					i_88_ += i_89_ * i_82_;
					i_85_ += i_89_ * i_84_;
				}
				if (i_83_ + i_78_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624))
					i_83_ -= (i_83_ + i_78_ - (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8621)) {
					int i_90_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825 - i);
					i_82_ -= i_90_;
					i = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621 * 512290825);
					i_88_ += i_90_;
					i_85_ += i_90_;
					i_87_ += i_90_;
					i_86_ += i_90_;
				}
				if (i + i_82_ > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8635) * -1071049483) {
					int i_91_ = (i + i_82_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8635);
					i_82_ -= i_91_;
					i_87_ += i_91_;
					i_86_ += i_91_;
				}
				if (i_82_ > 0 && i_83_ > 0) {
					if (bool)
						method2635((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), i_79_, i_88_, i_85_, i_82_, i_83_, i_86_, i_87_, i, i_78_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_80_, i_81_);
					else
						method2634((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), ((Class263_Sub4) this).anIntArray7389, i_79_, i_88_, i_85_, i_82_, i_83_, i_86_, i_87_, i, i_78_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_80_, i_81_);
				}
			}
		}
	}

	void method2602(char c, int i, int i_92_, int i_93_, boolean bool, Class_ta class_ta, int i_94_, int i_95_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_92_, i_93_, bool);
			else {
				i += ((Class263_Sub4) this).anIntArray7387[c];
				i_92_ += ((Class263_Sub4) this).anIntArray7392[c];
				int i_96_ = ((Class263_Sub4) this).anIntArray7393[c];
				int i_97_ = ((Class263_Sub4) this).anIntArray7391[c];
				int i_98_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8618);
				int i_99_ = i + i_98_ * i_92_;
				int i_100_ = i_98_ - i_96_;
				int i_101_ = 0;
				int i_102_ = 0;
				if (i_92_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623)) {
					int i_103_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481 - i_92_);
					i_97_ -= i_103_;
					i_92_ = (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623 * -1679642481);
					i_102_ += i_103_ * i_96_;
					i_99_ += i_103_ * i_98_;
				}
				if (i_97_ + i_92_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624))
					i_97_ -= (i_97_ + i_92_ - (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8621)) {
					int i_104_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825 - i);
					i_96_ -= i_104_;
					i = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621 * 512290825);
					i_102_ += i_104_;
					i_99_ += i_104_;
					i_101_ += i_104_;
					i_100_ += i_104_;
				}
				if (i + i_96_ > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8635) * -1071049483) {
					int i_105_ = (i + i_96_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8635);
					i_96_ -= i_105_;
					i_101_ += i_105_;
					i_100_ += i_105_;
				}
				if (i_96_ > 0 && i_97_ > 0) {
					if (bool)
						method2635((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), i_93_, i_102_, i_99_, i_96_, i_97_, i_100_, i_101_, i, i_92_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_94_, i_95_);
					else
						method2634((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), ((Class263_Sub4) this).anIntArray7389, i_93_, i_102_, i_99_, i_96_, i_97_, i_100_, i_101_, i, i_92_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_94_, i_95_);
				}
			}
		}
	}

	void method2603(char c, int i, int i_106_, int i_107_, boolean bool, Class_ta class_ta, int i_108_, int i_109_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_106_, i_107_, bool);
			else {
				i += ((Class263_Sub4) this).anIntArray7387[c];
				i_106_ += ((Class263_Sub4) this).anIntArray7392[c];
				int i_110_ = ((Class263_Sub4) this).anIntArray7393[c];
				int i_111_ = ((Class263_Sub4) this).anIntArray7391[c];
				int i_112_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8618);
				int i_113_ = i + i_112_ * i_106_;
				int i_114_ = i_112_ - i_110_;
				int i_115_ = 0;
				int i_116_ = 0;
				if (i_106_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623)) {
					int i_117_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481 - i_106_);
					i_111_ -= i_117_;
					i_106_ = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481;
					i_116_ += i_117_ * i_110_;
					i_113_ += i_117_ * i_112_;
				}
				if (i_111_ + i_106_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624))
					i_111_ -= (i_111_ + i_106_ - (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8621)) {
					int i_118_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825 - i);
					i_110_ -= i_118_;
					i = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621 * 512290825);
					i_116_ += i_118_;
					i_113_ += i_118_;
					i_115_ += i_118_;
					i_114_ += i_118_;
				}
				if (i + i_110_ > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8635) * -1071049483) {
					int i_119_ = (i + i_110_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8635);
					i_110_ -= i_119_;
					i_115_ += i_119_;
					i_114_ += i_119_;
				}
				if (i_110_ > 0 && i_111_ > 0) {
					if (bool)
						method2635((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), i_107_, i_116_, i_113_, i_110_, i_111_, i_114_, i_115_, i, i_106_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_108_, i_109_);
					else
						method2634((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), ((Class263_Sub4) this).anIntArray7389, i_107_, i_116_, i_113_, i_110_, i_111_, i_114_, i_115_, i, i_106_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_108_, i_109_);
				}
			}
		}
	}

	void UA(char c, int i, int i_120_, int i_121_, boolean bool) {
		if ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630) != null) {
			i += ((Class263_Sub4) this).anIntArray7387[c];
			i_120_ += ((Class263_Sub4) this).anIntArray7392[c];
			int i_122_ = ((Class263_Sub4) this).anIntArray7393[c];
			int i_123_ = ((Class263_Sub4) this).anIntArray7391[c];
			int i_124_ = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8618) * -1504772933;
			int i_125_ = i + i_120_ * i_124_;
			int i_126_ = i_124_ - i_122_;
			int i_127_ = 0;
			int i_128_ = 0;
			if (i_120_ < (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481) {
				int i_129_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481 - i_120_);
				i_123_ -= i_129_;
				i_120_ = -1679642481 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623);
				i_128_ += i_122_ * i_129_;
				i_125_ += i_129_ * i_124_;
			}
			if (i_120_ + i_123_ > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541)
				i_123_ -= (i_120_ + i_123_ - (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825) {
				int i_130_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825 - i);
				i_122_ -= i_130_;
				i = 512290825 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621);
				i_128_ += i_130_;
				i_125_ += i_130_;
				i_127_ += i_130_;
				i_126_ += i_130_;
			}
			if (i_122_ + i > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8635) * -1071049483) {
				int i_131_ = (i_122_ + i - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8635);
				i_122_ -= i_131_;
				i_127_ += i_131_;
				i_126_ += i_131_;
			}
			if (i_122_ > 0 && i_123_ > 0) {
				if (bool)
					method2633(((Class263_Sub4) this).aByteArrayArray7388[c], (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630), i_121_, i_128_, i_125_, i_122_, i_123_, i_126_, i_127_);
				else
					method2632(((Class263_Sub4) this).aByteArrayArray7388[c], (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630), ((Class263_Sub4) this).anIntArray7389, i_128_, i_125_, i_122_, i_123_, i_126_, i_127_);
			}
		}
	}

	void method2610(char c, int i, int i_132_, int i_133_, boolean bool, Class_ta class_ta, int i_134_, int i_135_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_132_, i_133_, bool);
			else {
				i += ((Class263_Sub4) this).anIntArray7387[c];
				i_132_ += ((Class263_Sub4) this).anIntArray7392[c];
				int i_136_ = ((Class263_Sub4) this).anIntArray7393[c];
				int i_137_ = ((Class263_Sub4) this).anIntArray7391[c];
				int i_138_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8618);
				int i_139_ = i + i_138_ * i_132_;
				int i_140_ = i_138_ - i_136_;
				int i_141_ = 0;
				int i_142_ = 0;
				if (i_132_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8623)) {
					int i_143_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481 - i_132_);
					i_137_ -= i_143_;
					i_132_ = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8623) * -1679642481;
					i_142_ += i_143_ * i_136_;
					i_139_ += i_143_ * i_138_;
				}
				if (i_137_ + i_132_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624))
					i_137_ -= (i_137_ + i_132_ - (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8624) * 31822541);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8621)) {
					int i_144_ = ((((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825 - i);
					i_136_ -= i_144_;
					i = (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621 * 512290825);
					i_142_ += i_144_;
					i_139_ += i_144_;
					i_141_ += i_144_;
					i_140_ += i_144_;
				}
				if (i + i_136_ > (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8635) * -1071049483) {
					int i_145_ = (i + i_136_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8635);
					i_136_ -= i_145_;
					i_141_ += i_145_;
					i_140_ += i_145_;
				}
				if (i_136_ > 0 && i_137_ > 0) {
					if (bool)
						method2635((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), i_133_, i_142_, i_139_, i_136_, i_137_, i_140_, i_141_, i, i_132_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_134_, i_135_);
					else
						method2634((((Class263_Sub4) this).aByteArrayArray7388[c]), (((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anIntArray8630), ((Class263_Sub4) this).anIntArray7389, i_133_, i_142_, i_139_, i_136_, i_137_, i_140_, i_141_, i, i_132_, ((Class263_Sub4) this).anIntArray7393[c], class_ta, i_134_, i_135_);
				}
			}
		}
	}

	void method2635(byte[] is, int[] is_146_, int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, Class_ta class_ta, int i_156_, int i_157_) {
		Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
		int[] is_158_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
		int[] is_159_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
		int i_160_ = (i_153_ - (((Class_ra_Sub3) ((Class263_Sub4) this).aClass_ra_Sub3_7390).anInt8621) * 512290825);
		int i_161_ = i_154_;
		if (i_157_ > i_161_) {
			i_161_ = i_157_;
			i_148_ += ((i_157_ - i_154_) * (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub4) this).aClass_ra_Sub3_7390)).anInt8618));
			i_147_ += (i_157_ - i_154_) * i_155_;
		}
		int i_162_ = (is_158_.length + i_157_ < i_150_ + i_154_ ? i_157_ + is_158_.length : i_150_ + i_154_);
		for (int i_163_ = i_161_; i_163_ < i_162_; i_163_++) {
			int i_164_ = is_158_[i_163_ - i_157_] + i_156_;
			int i_165_ = is_159_[i_163_ - i_157_];
			int i_166_ = i_149_;
			if (i_160_ > i_164_) {
				int i_167_ = i_160_ - i_164_;
				if (i_167_ >= i_165_) {
					i_147_ += i_149_ + i_152_;
					i_148_ += i_149_ + i_151_;
					continue;
				}
				i_165_ -= i_167_;
			} else {
				int i_168_ = i_164_ - i_160_;
				if (i_168_ >= i_149_) {
					i_147_ += i_152_ + i_149_;
					i_148_ += i_149_ + i_151_;
					continue;
				}
				i_147_ += i_168_;
				i_166_ -= i_168_;
				i_148_ += i_168_;
			}
			int i_169_ = 0;
			if (i_166_ < i_165_)
				i_165_ = i_166_;
			else
				i_169_ = i_166_ - i_165_;
			for (int i_170_ = -i_165_; i_170_ < 0; i_170_++) {
				if (is[i_147_++] != 0)
					is_146_[i_148_++] = i;
				else
					i_148_++;
			}
			i_147_ += i_169_ + i_147_;
			i_148_ += i_151_ + i_169_;
		}
	}

	static final void method2636(Class430 class430, int i) {
		try {
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = (Class263_Sub2.method2624(Class401.method4717((((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]), 1870636100), Class429.aClass454_4369.method297((short) 18850), -63566236));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zn.aac(").append(')').toString());
		}
	}

	public static short[] method2637(short[] is, int i) {
		try {
			if (is == null)
				return null;
			short[] is_171_ = new short[is.length];
			System.arraycopy(is, 0, is_171_, 0, is.length);
			return is_171_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zn.j(").append(')').toString());
		}
	}
}
