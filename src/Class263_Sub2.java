/* Class263_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class263_Sub2 extends Class263 {
	int[] anIntArray7373;
	byte[][] aByteArrayArray7374;
	int[] anIntArray7375;
	int[] anIntArray7376;
	int[] anIntArray7377;
	Class_ra_Sub3 aClass_ra_Sub3_7378;
	public static Player myPlayer;

	void UA(char c, int i, int i_0_, int i_1_, boolean bool) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630)) {
			i += ((Class263_Sub2) this).anIntArray7373[c];
			System.out.println("c: "+((Class263_Sub2) this).anIntArray7373[c]);
			System.out.println(" "+((Class263_Sub2) this).anIntArray7373[c]);
			System.out.println(" "+((Class263_Sub2) this).anIntArray7377[c]);
			i_0_ += ((Class263_Sub2) this).anIntArray7377[c];
			int i_2_ = ((Class263_Sub2) this).anIntArray7375[c];
			int i_3_ = ((Class263_Sub2) this).anIntArray7376[c];
			int i_4_ = (-1504772933 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8618);
			int i_5_ = i_4_ * i_0_ + i;
			int i_6_ = i_4_ - i_2_;
			int i_7_ = 0;
			int i_8_ = 0;
			if (i_0_ < -1679642481 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623)) {
				int i_9_ = ((((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 * -1679642481) - i_0_);
				i_3_ -= i_9_;
				i_0_ = -1679642481 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623);
				i_8_ += i_2_ * i_9_;
				i_5_ += i_9_ * i_4_;
			}
			if (i_0_ + i_3_ > (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8624) * 31822541)
				i_3_ -= (i_0_ + i_3_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8624));
			if (i < 512290825 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621)) {
				int i_10_ = (512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621) - i);
				i_2_ -= i_10_;
				i = (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621 * 512290825);
				i_8_ += i_10_;
				i_5_ += i_10_;
				i_7_ += i_10_;
				i_6_ += i_10_;
			}
			if (i_2_ + i > (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8635) * -1071049483) {
				int i_11_ = i + i_2_ - -1071049483 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635);
				i_2_ -= i_11_;
				i_7_ += i_11_;
				i_6_ += i_11_;
			}
			if (i_2_ > 0 && i_3_ > 0)
				method2621(((Class263_Sub2) this).aByteArrayArray7374[c], (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630), i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		}
	}

	Class263_Sub2(Class_ra_Sub3 class_ra_sub3, Class524 class524, Class87_Sub2[] class87_sub2s, int[] is, int[] is_12_) {
		super(class_ra_sub3, class524);
		((Class263_Sub2) this).aClass_ra_Sub3_7378 = class_ra_sub3;
		((Class263_Sub2) this).aClass_ra_Sub3_7378 = class_ra_sub3;
		((Class263_Sub2) this).anIntArray7375 = is;
		((Class263_Sub2) this).anIntArray7376 = is_12_;
		((Class263_Sub2) this).aByteArrayArray7374 = new byte[class87_sub2s.length][];
		((Class263_Sub2) this).anIntArray7377 = new int[class87_sub2s.length];
		((Class263_Sub2) this).anIntArray7373 = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i];
			if (null != class87_sub2.aByteArray7115)
				((Class263_Sub2) this).aByteArrayArray7374[i] = class87_sub2.aByteArray7115;
			else {
				byte[] is_13_ = class87_sub2.aByteArray7114;
				byte[] is_14_ = (((Class263_Sub2) this).aByteArrayArray7374[i] = new byte[is_13_.length]);
				for (int i_15_ = 0; i_15_ < is_13_.length; i_15_++)
					is_14_[i_15_] = (byte) (is_13_[i_15_] == 0 ? 0 : -1);
			}
			((Class263_Sub2) this).anIntArray7377[i] = class87_sub2.anInt7111;
			((Class263_Sub2) this).anIntArray7373[i] = class87_sub2.anInt7109;
			System.out.println(class87_sub2.anInt7111);
			System.out.println(class87_sub2.anInt7109);
		}
	}

	void method2620(byte[] is, int[] is_16_, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, Class_ta class_ta, int i_26_, int i_27_) {
		Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
		int[] is_28_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
		int[] is_29_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
		int i_30_ = i_23_ - 512290825 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621);
		int i_31_ = i_24_;
		if (i_27_ > i_31_) {
			i_31_ = i_27_;
			i_18_ += (i_27_ - i_24_) * ((((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8618) * -1504772933);
			i_17_ += (i_27_ - i_24_) * i_25_;
		}
		int i_32_ = (i_27_ + is_28_.length < i_24_ + i_20_ ? is_28_.length + i_27_ : i_24_ + i_20_);
		for (int i_33_ = i_31_; i_33_ < i_32_; i_33_++) {
			int i_34_ = i_26_ + is_28_[i_33_ - i_27_];
			int i_35_ = is_29_[i_33_ - i_27_];
			int i_36_ = i_19_;
			if (i_30_ > i_34_) {
				int i_37_ = i_30_ - i_34_;
				if (i_37_ >= i_35_) {
					i_17_ += i_22_ + i_19_;
					i_18_ += i_19_ + i_21_;
					continue;
				}
				i_35_ -= i_37_;
			} else {
				int i_38_ = i_34_ - i_30_;
				if (i_38_ >= i_19_) {
					i_17_ += i_19_ + i_22_;
					i_18_ += i_21_ + i_19_;
					continue;
				}
				i_17_ += i_38_;
				i_36_ -= i_38_;
				i_18_ += i_38_;
			}
			int i_39_ = 0;
			if (i_36_ < i_35_)
				i_35_ = i_36_;
			else
				i_39_ = i_36_ - i_35_;
			for (int i_40_ = -i_35_; i_40_ < 0; i_40_++) {
				int i_41_ = is[i_17_++] & 0xff;
				if (i_41_ != 0) {
					int i_42_ = ((((i & 0xff00ff) * i_41_ & ~0xff00ff) + (i_41_ * (i & 0xff00) & 0xff0000)) >> 8);
					i_41_ = 256 - i_41_;
					int i_43_ = is_16_[i_18_];
					is_16_[i_18_++] = (((i_41_ * (i_43_ & 0xff00ff) & ~0xff00ff) + ((i_43_ & 0xff00) * i_41_ & 0xff0000)) >> 8) + i_42_;
				} else
					i_18_++;
			}
			i_17_ += i_22_ + i_39_;
			i_18_ += i_39_ + i_21_;
		}
	}

	void method2602(char c, int i, int i_44_, int i_45_, boolean bool, Class_ta class_ta, int i_46_, int i_47_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_44_, i_45_, bool);
			else {
				i += ((Class263_Sub2) this).anIntArray7373[c];
				i_44_ += ((Class263_Sub2) this).anIntArray7377[c];
				int i_48_ = ((Class263_Sub2) this).anIntArray7375[c];
				int i_49_ = ((Class263_Sub2) this).anIntArray7376[c];
				int i_50_ = (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8618 * -1504772933);
				int i_51_ = i_44_ * i_50_ + i;
				int i_52_ = i_50_ - i_48_;
				int i_53_ = 0;
				int i_54_ = 0;
				if (i_44_ < (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 * -1679642481)) {
					int i_55_ = (-1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 - i_44_);
					i_49_ -= i_55_;
					i_44_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623;
					i_54_ += i_55_ * i_48_;
					i_51_ += i_55_ * i_50_;
				}
				if (i_49_ + i_44_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8624))
					i_49_ -= i_49_ + i_44_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621)) {
					int i_56_ = ((((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621) * 512290825 - i);
					i_48_ -= i_56_;
					i = 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621);
					i_54_ += i_56_;
					i_51_ += i_56_;
					i_53_ += i_56_;
					i_52_ += i_56_;
				}
				if (i + i_48_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635)) {
					int i_57_ = i + i_48_ - (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635) * -1071049483;
					i_48_ -= i_57_;
					i_53_ += i_57_;
					i_52_ += i_57_;
				}
				if (i_48_ > 0 && i_49_ > 0)
					method2620(((Class263_Sub2) this).aByteArrayArray7374[c], (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630), i_45_, i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i, i_44_, ((Class263_Sub2) this).anIntArray7375[c], class_ta, i_46_, i_47_);
			}
		}
	}

	void method2621(byte[] is, int[] is_58_, int i, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		for (int i_65_ = -i_62_; i_65_ < 0; i_65_++) {
			for (int i_66_ = -i_61_; i_66_ < 0; i_66_++) {
				int i_67_ = is[i_59_++] & 0xff;
				if (0 != i_67_) {
					int i_68_ = ((((i & 0xff00ff) * i_67_ & ~0xff00ff) + ((i & 0xff00) * i_67_ & 0xff0000)) >> 8);
					i_67_ = 256 - i_67_;
					int i_69_ = is_58_[i_60_];
					is_58_[i_60_++] = ((((i_69_ & 0xff00) * i_67_ & 0xff0000) + ((i_69_ & 0xff00ff) * i_67_ & ~0xff00ff)) >> 8) + i_68_;
				} else
					i_60_++;
			}
			i_60_ += i_63_;
			i_59_ += i_64_;
		}
	}

	void method2609(char c, int i, int i_70_, int i_71_, boolean bool, Class_ta class_ta, int i_72_, int i_73_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_70_, i_71_, bool);
			else {
				i += ((Class263_Sub2) this).anIntArray7373[c];
				i_70_ += ((Class263_Sub2) this).anIntArray7377[c];
				int i_74_ = ((Class263_Sub2) this).anIntArray7375[c];
				int i_75_ = ((Class263_Sub2) this).anIntArray7376[c];
				int i_76_ = (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8618 * -1504772933);
				int i_77_ = i_70_ * i_76_ + i;
				int i_78_ = i_76_ - i_74_;
				int i_79_ = 0;
				int i_80_ = 0;
				if (i_70_ < (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 * -1679642481)) {
					int i_81_ = (-1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 - i_70_);
					i_75_ -= i_81_;
					i_70_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623;
					i_80_ += i_81_ * i_74_;
					i_77_ += i_81_ * i_76_;
				}
				if (i_75_ + i_70_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8624))
					i_75_ -= i_75_ + i_70_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621)) {
					int i_82_ = ((((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621) * 512290825 - i);
					i_74_ -= i_82_;
					i = 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621);
					i_80_ += i_82_;
					i_77_ += i_82_;
					i_79_ += i_82_;
					i_78_ += i_82_;
				}
				if (i + i_74_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635)) {
					int i_83_ = i + i_74_ - (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635) * -1071049483;
					i_74_ -= i_83_;
					i_79_ += i_83_;
					i_78_ += i_83_;
				}
				if (i_74_ > 0 && i_75_ > 0)
					method2620(((Class263_Sub2) this).aByteArrayArray7374[c], (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630), i_71_, i_80_, i_77_, i_74_, i_75_, i_78_, i_79_, i, i_70_, ((Class263_Sub2) this).anIntArray7375[c], class_ta, i_72_, i_73_);
			}
		}
	}

	void method2603(char c, int i, int i_84_, int i_85_, boolean bool, Class_ta class_ta, int i_86_, int i_87_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_84_, i_85_, bool);
			else {
				i += ((Class263_Sub2) this).anIntArray7373[c];
				i_84_ += ((Class263_Sub2) this).anIntArray7377[c];
				int i_88_ = ((Class263_Sub2) this).anIntArray7375[c];
				int i_89_ = ((Class263_Sub2) this).anIntArray7376[c];
				int i_90_ = (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8618 * -1504772933);
				int i_91_ = i_84_ * i_90_ + i;
				int i_92_ = i_90_ - i_88_;
				int i_93_ = 0;
				int i_94_ = 0;
				if (i_84_ < (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 * -1679642481)) {
					int i_95_ = (-1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 - i_84_);
					i_89_ -= i_95_;
					i_84_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623;
					i_94_ += i_95_ * i_88_;
					i_91_ += i_95_ * i_90_;
				}
				if (i_89_ + i_84_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8624))
					i_89_ -= i_89_ + i_84_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621)) {
					int i_96_ = ((((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621) * 512290825 - i);
					i_88_ -= i_96_;
					i = 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621);
					i_94_ += i_96_;
					i_91_ += i_96_;
					i_93_ += i_96_;
					i_92_ += i_96_;
				}
				if (i + i_88_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635)) {
					int i_97_ = i + i_88_ - (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635) * -1071049483;
					i_88_ -= i_97_;
					i_93_ += i_97_;
					i_92_ += i_97_;
				}
				if (i_88_ > 0 && i_89_ > 0)
					method2620(((Class263_Sub2) this).aByteArrayArray7374[c], (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630), i_85_, i_94_, i_91_, i_88_, i_89_, i_92_, i_93_, i, i_84_, ((Class263_Sub2) this).anIntArray7375[c], class_ta, i_86_, i_87_);
			}
		}
	}

	void method2604(char c, int i, int i_98_, int i_99_, boolean bool, Class_ta class_ta, int i_100_, int i_101_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_98_, i_99_, bool);
			else {
				i += ((Class263_Sub2) this).anIntArray7373[c];
				i_98_ += ((Class263_Sub2) this).anIntArray7377[c];
				int i_102_ = ((Class263_Sub2) this).anIntArray7375[c];
				int i_103_ = ((Class263_Sub2) this).anIntArray7376[c];
				int i_104_ = (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8618 * -1504772933);
				int i_105_ = i_98_ * i_104_ + i;
				int i_106_ = i_104_ - i_102_;
				int i_107_ = 0;
				int i_108_ = 0;
				if (i_98_ < (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 * -1679642481)) {
					int i_109_ = (-1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 - i_98_);
					i_103_ -= i_109_;
					i_98_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623;
					i_108_ += i_109_ * i_102_;
					i_105_ += i_109_ * i_104_;
				}
				if (i_103_ + i_98_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8624))
					i_103_ -= (i_103_ + i_98_ - 31822541 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621)) {
					int i_110_ = ((((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621) * 512290825 - i);
					i_102_ -= i_110_;
					i = 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621);
					i_108_ += i_110_;
					i_105_ += i_110_;
					i_107_ += i_110_;
					i_106_ += i_110_;
				}
				if (i + i_102_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635)) {
					int i_111_ = (i + i_102_ - (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635) * -1071049483);
					i_102_ -= i_111_;
					i_107_ += i_111_;
					i_106_ += i_111_;
				}
				if (i_102_ > 0 && i_103_ > 0)
					method2620(((Class263_Sub2) this).aByteArrayArray7374[c], (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630), i_99_, i_108_, i_105_, i_102_, i_103_, i_106_, i_107_, i, i_98_, ((Class263_Sub2) this).anIntArray7375[c], class_ta, i_100_, i_101_);
			}
		}
	}

	void method2610(char c, int i, int i_112_, int i_113_, boolean bool, Class_ta class_ta, int i_114_, int i_115_) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630)) {
			if (class_ta == null)
				UA(c, i, i_112_, i_113_, bool);
			else {
				i += ((Class263_Sub2) this).anIntArray7373[c];
				i_112_ += ((Class263_Sub2) this).anIntArray7377[c];
				int i_116_ = ((Class263_Sub2) this).anIntArray7375[c];
				int i_117_ = ((Class263_Sub2) this).anIntArray7376[c];
				int i_118_ = (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8618 * -1504772933);
				int i_119_ = i_112_ * i_118_ + i;
				int i_120_ = i_118_ - i_116_;
				int i_121_ = 0;
				int i_122_ = 0;
				if (i_112_ < (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8623) * -1679642481) {
					int i_123_ = (-1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623 - i_112_);
					i_117_ -= i_123_;
					i_112_ = -1679642481 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623;
					i_122_ += i_123_ * i_116_;
					i_119_ += i_123_ * i_118_;
				}
				if (i_117_ + i_112_ > 31822541 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8624))
					i_117_ -= (i_117_ + i_112_ - 31822541 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8624);
				if (i < 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621)) {
					int i_124_ = ((((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621) * 512290825 - i);
					i_116_ -= i_124_;
					i = 512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621);
					i_122_ += i_124_;
					i_119_ += i_124_;
					i_121_ += i_124_;
					i_120_ += i_124_;
				}
				if (i + i_116_ > -1071049483 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635)) {
					int i_125_ = (i + i_116_ - (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635) * -1071049483);
					i_116_ -= i_125_;
					i_121_ += i_125_;
					i_120_ += i_125_;
				}
				if (i_116_ > 0 && i_117_ > 0)
					method2620(((Class263_Sub2) this).aByteArrayArray7374[c], (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630), i_113_, i_122_, i_119_, i_116_, i_117_, i_120_, i_121_, i, i_112_, ((Class263_Sub2) this).anIntArray7375[c], class_ta, i_114_, i_115_);
			}
		}
	}

	void c(char c, int i, int i_126_, int i_127_, boolean bool) {
		if (null != (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630)) {
			i += ((Class263_Sub2) this).anIntArray7373[c];
			i_126_ += ((Class263_Sub2) this).anIntArray7377[c];
			int i_128_ = ((Class263_Sub2) this).anIntArray7375[c];
			int i_129_ = ((Class263_Sub2) this).anIntArray7376[c];
			int i_130_ = (-1504772933 * ((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8618);
			int i_131_ = i_130_ * i_126_ + i;
			int i_132_ = i_130_ - i_128_;
			int i_133_ = 0;
			int i_134_ = 0;
			if (i_126_ < -1679642481 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8623)) {
				int i_135_ = ((((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8623) * -1679642481 - i_126_);
				i_129_ -= i_135_;
				i_126_ = -1679642481 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8623);
				i_134_ += i_128_ * i_135_;
				i_131_ += i_135_ * i_130_;
			}
			if (i_126_ + i_129_ > (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8624) * 31822541)
				i_129_ -= (i_126_ + i_129_ - 31822541 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8624));
			if (i < 512290825 * (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621)) {
				int i_136_ = (512290825 * (((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8621) - i);
				i_128_ -= i_136_;
				i = (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8621 * 512290825);
				i_134_ += i_136_;
				i_131_ += i_136_;
				i_133_ += i_136_;
				i_132_ += i_136_;
			}
			if (i_128_ + i > (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anInt8635) * -1071049483) {
				int i_137_ = (i + i_128_ - -1071049483 * ((Class_ra_Sub3) (((Class263_Sub2) this).aClass_ra_Sub3_7378)).anInt8635);
				i_128_ -= i_137_;
				i_133_ += i_137_;
				i_132_ += i_137_;
			}
			if (i_128_ > 0 && i_129_ > 0)
				method2621(((Class263_Sub2) this).aByteArrayArray7374[c], (((Class_ra_Sub3) ((Class263_Sub2) this).aClass_ra_Sub3_7378).anIntArray8630), i_127_, i_134_, i_131_, i_128_, i_129_, i_132_, i_133_);
		}
	}

	static final boolean method2622(int i, int i_138_, boolean bool, Class366 class366, int i_139_) {
		try {
			int i_140_ = myPlayer.anIntArray10018[0];
			int i_141_ = myPlayer.anIntArray10059[0];
			if (i_140_ < 0 || i_140_ >= client.aClass304_9030.method2990(-565027800) || i_141_ < 0 || i_141_ >= client.aClass304_9030.method3033((byte) -69))
				return false;
			if (i < 0 || i >= client.aClass304_9030.method2990(-576109981) || i_138_ < 0 || i_138_ >= client.aClass304_9030.method3033((byte) 10))
				return false;
			int i_142_ = (Class166_Sub1.method2000(i_140_, i_141_, myPlayer.method5453(-1986369767), class366, (client.aClass304_9030.method2996(myPlayer.aByte8658, 1875135057)), bool, client.anIntArray9051, client.anIntArray9052, -1660836904));
			if (i_142_ < 1)
				return false;
			Class9.anInt146 = client.anIntArray9051[i_142_ - 1] * 192203109;
			Class9.anInt151 = client.anIntArray9052[i_142_ - 1] * 527198423;
			Class9.aBoolean141 = false;
			Class444.method5617(-1805657690);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zc.jz(").append(')').toString());
		}
	}

	public static boolean method2623(int i, int i_143_) {
		try {
			if (i != Class96.anInt852 * -495682499 || Class532.aClass78_6455 == null) {
				Class515.method6204(1029685726);
				Class532.aClass78_6455 = Class78.aClass78_658;
				Class96.anInt852 = i * 1363868437;
			}
			if (Class532.aClass78_6455 == Class78.aClass78_658) {
				byte[] is = Class76_Sub1.aClass280_7096.method2761(i, 1242349452);
				if (null == is)
					return false;
				Buffer class330_sub46 = new Buffer(is);
				Class102.method1221(class330_sub46, -1103105312);
				int i_144_ = class330_sub46.readUnsignedByte(2127978255);
				for (int i_145_ = 0; i_145_ < i_144_; i_145_++)
					Class96.aClass471_856.method5878(new Class330_Sub17(class330_sub46), (short) 8192);
				int i_146_ = class330_sub46.readSmart(33103985);
				Class96.aClass79Array853 = new Class79[i_146_];
				for (int i_147_ = 0; i_147_ < i_146_; i_147_++)
					Class96.aClass79Array853[i_147_] = new Class79(class330_sub46);
				int i_148_ = class330_sub46.readSmart(-897476786);
				Class96.aClass85Array854 = new Class85[i_148_];
				for (int i_149_ = 0; i_149_ < i_148_; i_149_++)
					Class96.aClass85Array854[i_149_] = new Class85(class330_sub46, i_149_);
				int i_150_ = class330_sub46.readSmart(-1937605720);
				Class96.aClass88Array855 = new Class88[i_150_];
				for (int i_151_ = 0; i_151_ < i_150_; i_151_++)
					Class96.aClass88Array855[i_151_] = new Class88(class330_sub46);
				int i_152_ = class330_sub46.readSmart(-362107676);
				Class96.aClass89Array862 = new Class89[i_152_];
				for (int i_153_ = 0; i_153_ < i_152_; i_153_++)
					Class96.aClass89Array862[i_153_] = new Class89(class330_sub46);
				int i_154_ = class330_sub46.readSmart(240093679);
				Class467.aClass95Array5599 = new Class95[i_154_];
				for (int i_155_ = 0; i_155_ < i_154_; i_155_++)
					Class467.aClass95Array5599[i_155_] = Class360.method4243(class330_sub46, 1199095423);
				Class532.aClass78_6455 = Class78.aClass78_657;
			}
			if (Class78.aClass78_657 == Class532.aClass78_6455) {
				boolean bool = true;
				Class85[] class85s = Class96.aClass85Array854;
				for (int i_156_ = 0; i_156_ < class85s.length; i_156_++) {
					Class85 class85 = class85s[i_156_];
					if (!class85.method969((short) -1939))
						bool = false;
				}
				Class95[] class95s = Class467.aClass95Array5599;
				for (int i_157_ = 0; i_157_ < class95s.length; i_157_++) {
					Class95 class95 = class95s[i_157_];
					if (!class95.method1097(570286388))
						bool = false;
				}
				Class88[] class88s = Class96.aClass88Array855;
				for (int i_158_ = 0; i_158_ < class88s.length; i_158_++) {
					Class88 class88 = class88s[i_158_];
					if (!class88.method1050(-898509977))
						bool = false;
				}
				if (!bool)
					return false;
				Class532.aClass78_6455 = Class78.aClass78_656;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zc.r(").append(')').toString());
		}
	}

	public static String method2624(long l, int i, int i_159_) {
		try {
			Class452.method5637(l);
			int i_160_ = Class528.aCalendar6215.get(5);
			int i_161_ = Class528.aCalendar6215.get(2);
			int i_162_ = Class528.aCalendar6215.get(1);
			if (i == 3)
				return Class343.method4000(l, i, 1009690702);
			return new StringBuilder().append(Integer.toString(i_160_ / 10)).append(i_160_ % 10).append("-").append(Class528.aStringArrayArray6216[i][i_161_]).append("-").append(i_162_).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zc.r(").append(')').toString());
		}
	}

	public static void method2625(byte i) {
		try {
			for (int i_163_ = 0; i_163_ < -1098735395 * Class333.anInt3360; i_163_++) {
				Class316 class316 = Class333.aClass316Array3347[i_163_];
				if (3 == ((Class316) class316).aByte3266)
					OutgoingPacket.method2367(class316, -209745817);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zc.t(").append(')').toString());
		}
	}
}
