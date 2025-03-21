/* Class87_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87_Sub2 extends Class87 {
	public int anInt7107;
	int anInt7108;
	public int anInt7109;
	int anInt7110;
	public int anInt7111;
	public int anInt7112;
	public int[] anIntArray7113;
	public byte[] aByteArray7114;
	public byte[] aByteArray7115;

	public void method1000() {
		byte[] is = new byte[anInt7112 * anInt7107];
		int i = 0;
		if (aByteArray7115 == null) {
			for (int i_0_ = 0; i_0_ < anInt7112; i_0_++) {
				for (int i_1_ = anInt7107 - 1; i_1_ >= 0; i_1_--)
					is[i++] = aByteArray7114[i_0_ + i_1_ * anInt7112];
			}
			aByteArray7114 = is;
		} else {
			byte[] is_2_ = new byte[anInt7112 * anInt7107];
			for (int i_3_ = 0; i_3_ < anInt7112; i_3_++) {
				for (int i_4_ = anInt7107 - 1; i_4_ >= 0; i_4_--) {
					is[i] = aByteArray7114[i_3_ + i_4_ * anInt7112];
					is_2_[i++] = aByteArray7115[i_3_ + i_4_ * anInt7112];
				}
			}
			aByteArray7114 = is;
			aByteArray7115 = is_2_;
		}
		int i_5_ = anInt7111;
		anInt7111 = anInt7109;
		anInt7109 = ((Class87_Sub2) this).anInt7108;
		((Class87_Sub2) this).anInt7108 = ((Class87_Sub2) this).anInt7110;
		((Class87_Sub2) this).anInt7110 = anInt7111;
		i_5_ = anInt7107;
		anInt7107 = anInt7112;
		anInt7112 = i_5_;
	}

	public boolean method1044() {
		return true;
	}

	public boolean method985() {
		return aByteArray7115 != null;
	}

	public int method986() {
		return anInt7112;
	}

	public int method1001(int i, int i_6_) {
		return anIntArray7113[aByteArray7114[i + i_6_ * anInt7112] & 0xff];
	}

	public int method993() {
		return anInt7112 + anInt7109 + ((Class87_Sub2) this).anInt7110;
	}

	public int method1045() {
		return anInt7107 + anInt7111 + ((Class87_Sub2) this).anInt7108;
	}

	public void method1027(int i) {
		int i_7_ = method993();
		int i_8_ = method1045();
		if (anInt7112 != i_7_ || anInt7107 != i_8_) {
			int i_9_ = i;
			if (i_9_ > anInt7109)
				i_9_ = anInt7109;
			int i_10_ = i;
			if (i_10_ + anInt7109 + anInt7112 > i_7_)
				i_10_ = i_7_ - anInt7109 - anInt7112;
			int i_11_ = i;
			if (i_11_ > anInt7111)
				i_11_ = anInt7111;
			int i_12_ = i;
			if (i_12_ + anInt7111 + anInt7107 > i_8_)
				i_12_ = i_8_ - anInt7111 - anInt7107;
			int i_13_ = anInt7112 + i_9_ + i_10_;
			int i_14_ = anInt7107 + i_11_ + i_12_;
			byte[] is = new byte[i_13_ * i_14_];
			if (aByteArray7115 == null) {
				for (int i_15_ = 0; i_15_ < anInt7107; i_15_++) {
					int i_16_ = i_15_ * anInt7112;
					int i_17_ = (i_15_ + i_11_) * i_13_ + i_9_;
					for (int i_18_ = 0; i_18_ < anInt7112; i_18_++)
						is[i_17_++] = aByteArray7114[i_16_++];
				}
			} else {
				byte[] is_19_ = new byte[i_13_ * i_14_];
				for (int i_20_ = 0; i_20_ < anInt7107; i_20_++) {
					int i_21_ = i_20_ * anInt7112;
					int i_22_ = (i_20_ + i_11_) * i_13_ + i_9_;
					for (int i_23_ = 0; i_23_ < anInt7112; i_23_++) {
						is_19_[i_22_] = aByteArray7115[i_21_];
						is[i_22_++] = aByteArray7114[i_21_++];
					}
				}
				aByteArray7115 = is_19_;
			}
			anInt7109 -= i_9_;
			anInt7111 -= i_11_;
			((Class87_Sub2) this).anInt7110 -= i_10_;
			((Class87_Sub2) this).anInt7108 -= i_12_;
			anInt7112 = i_13_;
			anInt7107 = i_14_;
			aByteArray7114 = is;
		}
	}

	public int method988() {
		return ((Class87_Sub2) this).anInt7110;
	}

	public int method990() {
		return anInt7111;
	}

	public int method991() {
		return ((Class87_Sub2) this).anInt7108;
	}

	public void method992() {
		((Class87_Sub2) this).anInt7108 = 0;
		anInt7111 = 0;
		((Class87_Sub2) this).anInt7110 = 0;
		anInt7109 = 0;
	}

	public int method1009() {
		return anInt7112;
	}

	public int method1026() {
		return anInt7112 + anInt7109 + ((Class87_Sub2) this).anInt7110;
	}

	Class87_Sub2() {
		/* empty */
	}

	public void method998() {
		byte[] is = aByteArray7114;
		if (aByteArray7115 == null) {
			for (int i = anInt7107 - 1; i >= 0; i--) {
				int i_24_ = i * anInt7112;
				for (int i_25_ = (i + 1) * anInt7112; i_24_ < i_25_; i_24_++) {
					i_25_--;
					byte i_26_ = is[i_24_];
					is[i_24_] = is[i_25_];
					is[i_25_] = i_26_;
				}
			}
		} else {
			byte[] is_27_ = aByteArray7115;
			for (int i = anInt7107 - 1; i >= 0; i--) {
				int i_28_ = i * anInt7112;
				for (int i_29_ = (i + 1) * anInt7112; i_28_ < i_29_; i_28_++) {
					i_29_--;
					byte i_30_ = is[i_28_];
					is[i_28_] = is[i_29_];
					is[i_29_] = i_30_;
					i_30_ = is_27_[i_28_];
					is_27_[i_28_] = is_27_[i_29_];
					is_27_[i_29_] = i_30_;
				}
			}
		}
		int i = anInt7109;
		anInt7109 = ((Class87_Sub2) this).anInt7110;
		((Class87_Sub2) this).anInt7110 = i;
	}

	public void method999() {
		byte[] is = aByteArray7114;
		if (aByteArray7115 == null) {
			for (int i = (anInt7107 >> 1) - 1; i >= 0; i--) {
				int i_31_ = i * anInt7112;
				int i_32_ = (anInt7107 - i - 1) * anInt7112;
				for (int i_33_ = -anInt7112; i_33_ < 0; i_33_++) {
					byte i_34_ = is[i_31_];
					is[i_31_] = is[i_32_];
					is[i_32_] = i_34_;
					i_31_++;
					i_32_++;
				}
			}
		} else {
			byte[] is_35_ = aByteArray7115;
			for (int i = (anInt7107 >> 1) - 1; i >= 0; i--) {
				int i_36_ = i * anInt7112;
				int i_37_ = (anInt7107 - i - 1) * anInt7112;
				for (int i_38_ = -anInt7112; i_38_ < 0; i_38_++) {
					byte i_39_ = is[i_36_];
					is[i_36_] = is[i_37_];
					is[i_37_] = i_39_;
					i_39_ = is_35_[i_36_];
					is_35_[i_36_] = is_35_[i_37_];
					is_35_[i_37_] = i_39_;
					i_36_++;
					i_37_++;
				}
			}
		}
		int i = anInt7111;
		anInt7111 = ((Class87_Sub2) this).anInt7108;
		((Class87_Sub2) this).anInt7108 = i;
	}

	public void method1043(int i, int i_40_, int i_41_) {
		for (int i_42_ = 1; i_42_ < anIntArray7113.length; i_42_++) {
			if (anIntArray7113[i_42_] != 1 && anIntArray7113[i_42_] != 16711935) {
				int i_43_ = anIntArray7113[i_42_] >> 16 & 0xff;
				i_43_ += i;
				if (i_43_ < 0)
					i_43_ = 0;
				else if (i_43_ > 255)
					i_43_ = 255;
				int i_44_ = anIntArray7113[i_42_] >> 8 & 0xff;
				i_44_ += i_40_;
				if (i_44_ < 0)
					i_44_ = 0;
				else if (i_44_ > 255)
					i_44_ = 255;
				int i_45_ = anIntArray7113[i_42_] >> 0 & 0xff;
				i_45_ += i_41_;
				if (i_45_ < 0)
					i_45_ = 0;
				else if (i_45_ > 255)
					i_45_ = 255;
				anIntArray7113[i_42_] = i_43_ << 16 | i_44_ << 8 | i_45_;
			}
		}
	}

	public int method989() {
		return ((Class87_Sub2) this).anInt7110;
	}

	public void method996(int i, int i_46_, int i_47_) {
		for (int i_48_ = 1; i_48_ < anIntArray7113.length; i_48_++) {
			if (anIntArray7113[i_48_] != 1 && anIntArray7113[i_48_] != 16711935) {
				int i_49_ = anIntArray7113[i_48_] >> 16 & 0xff;
				i_49_ += i;
				if (i_49_ < 0)
					i_49_ = 0;
				else if (i_49_ > 255)
					i_49_ = 255;
				int i_50_ = anIntArray7113[i_48_] >> 8 & 0xff;
				i_50_ += i_46_;
				if (i_50_ < 0)
					i_50_ = 0;
				else if (i_50_ > 255)
					i_50_ = 255;
				int i_51_ = anIntArray7113[i_48_] >> 0 & 0xff;
				i_51_ += i_47_;
				if (i_51_ < 0)
					i_51_ = 0;
				else if (i_51_ > 255)
					i_51_ = 255;
				anIntArray7113[i_48_] = i_49_ << 16 | i_50_ << 8 | i_51_;
			}
		}
	}

	public int method1003(int i, int i_52_) {
		return anIntArray7113[aByteArray7114[i + i_52_ * anInt7112] & 0xff];
	}

	public boolean method1005() {
		return true;
	}

	public boolean method1007() {
		return aByteArray7115 != null;
	}

	public boolean method1006() {
		return aByteArray7115 != null;
	}

	public void method1030(int i) {
		int i_53_ = -1;
		if (anIntArray7113.length < 255) {
			for (int i_54_ = 0; i_54_ < anIntArray7113.length; i_54_++) {
				if (anIntArray7113[i_54_] == i) {
					i_53_ = i_54_;
					break;
				}
			}
			if (i_53_ == -1) {
				i_53_ = anIntArray7113.length;
				int[] is = new int[anIntArray7113.length + 1];
				System.arraycopy(anIntArray7113, 0, is, 0, anIntArray7113.length);
				anIntArray7113 = is;
				is[i_53_] = i;
			}
		} else {
			int i_55_ = 2147483647;
			int i_56_ = i >> 16 & 0xff;
			int i_57_ = i >> 8 & 0xff;
			int i_58_ = i & 0xff;
			for (int i_59_ = 0; i_59_ < anIntArray7113.length; i_59_++) {
				int i_60_ = anIntArray7113[i_59_];
				int i_61_ = i_60_ >> 16 & 0xff;
				int i_62_ = i_60_ >> 8 & 0xff;
				int i_63_ = i_60_ & 0xff;
				int i_64_ = i_56_ - i_61_;
				if (i_64_ < 0)
					i_64_ = -i_64_;
				int i_65_ = i_57_ - i_62_;
				if (i_65_ < 0)
					i_65_ = -i_65_;
				int i_66_ = i_58_ - i_63_;
				if (i_66_ < 0)
					i_66_ = -i_66_;
				int i_67_ = i_64_ + i_65_ + i_66_;
				if (i_67_ < i_55_) {
					i_55_ = i_67_;
					i_53_ = i_59_;
				}
			}
		}
		int i_68_ = 0;
		byte[] is = new byte[anInt7112 * anInt7107];
		for (int i_69_ = 0; i_69_ < anInt7107; i_69_++) {
			for (int i_70_ = 0; i_70_ < anInt7112; i_70_++) {
				int i_71_ = aByteArray7114[i_68_] & 0xff;
				if (anIntArray7113[i_71_] == 0) {
					if (i_70_ > 0 && (anIntArray7113[aByteArray7114[i_68_ - 1] & 0xff] != 0))
						i_71_ = i_53_;
					else if (i_69_ > 0 && ((anIntArray7113[aByteArray7114[i_68_ - anInt7112] & 0xff]) != 0))
						i_71_ = i_53_;
					else if (i_70_ < anInt7112 - 1 && (anIntArray7113[aByteArray7114[i_68_ + 1] & 0xff]) != 0)
						i_71_ = i_53_;
					else if (i_69_ < anInt7107 - 1 && ((anIntArray7113[aByteArray7114[i_68_ + anInt7112] & 0xff]) != 0))
						i_71_ = i_53_;
				}
				is[i_68_++] = (byte) i_71_;
			}
		}
		aByteArray7114 = is;
	}

	public int method983() {
		return anInt7109;
	}

	public int method1041() {
		return ((Class87_Sub2) this).anInt7108;
	}

	public int method1010() {
		return anInt7112;
	}

	public int method1047(int i, int i_72_) {
		return anIntArray7113[aByteArray7114[i + i_72_ * anInt7112] & 0xff];
	}

	public int method1012() {
		return anInt7112 + anInt7109 + ((Class87_Sub2) this).anInt7110;
	}

	public void method995(int i) {
		int i_73_ = method993();
		int i_74_ = method1045();
		if (anInt7112 != i_73_ || anInt7107 != i_74_) {
			int i_75_ = i;
			if (i_75_ > anInt7109)
				i_75_ = anInt7109;
			int i_76_ = i;
			if (i_76_ + anInt7109 + anInt7112 > i_73_)
				i_76_ = i_73_ - anInt7109 - anInt7112;
			int i_77_ = i;
			if (i_77_ > anInt7111)
				i_77_ = anInt7111;
			int i_78_ = i;
			if (i_78_ + anInt7111 + anInt7107 > i_74_)
				i_78_ = i_74_ - anInt7111 - anInt7107;
			int i_79_ = anInt7112 + i_75_ + i_76_;
			int i_80_ = anInt7107 + i_77_ + i_78_;
			byte[] is = new byte[i_79_ * i_80_];
			if (aByteArray7115 == null) {
				for (int i_81_ = 0; i_81_ < anInt7107; i_81_++) {
					int i_82_ = i_81_ * anInt7112;
					int i_83_ = (i_81_ + i_77_) * i_79_ + i_75_;
					for (int i_84_ = 0; i_84_ < anInt7112; i_84_++)
						is[i_83_++] = aByteArray7114[i_82_++];
				}
			} else {
				byte[] is_85_ = new byte[i_79_ * i_80_];
				for (int i_86_ = 0; i_86_ < anInt7107; i_86_++) {
					int i_87_ = i_86_ * anInt7112;
					int i_88_ = (i_86_ + i_77_) * i_79_ + i_75_;
					for (int i_89_ = 0; i_89_ < anInt7112; i_89_++) {
						is_85_[i_88_] = aByteArray7115[i_87_];
						is[i_88_++] = aByteArray7114[i_87_++];
					}
				}
				aByteArray7115 = is_85_;
			}
			anInt7109 -= i_75_;
			anInt7111 -= i_77_;
			((Class87_Sub2) this).anInt7110 -= i_76_;
			((Class87_Sub2) this).anInt7108 -= i_78_;
			anInt7112 = i_79_;
			anInt7107 = i_80_;
			aByteArray7114 = is;
		}
	}

	public boolean method1008() {
		return aByteArray7115 != null;
	}

	public int method1019() {
		return anInt7107 + anInt7111 + ((Class87_Sub2) this).anInt7108;
	}

	public int method1016() {
		return anInt7107 + anInt7111 + ((Class87_Sub2) this).anInt7108;
	}

	public int method1017() {
		return anInt7109;
	}

	public int method1028() {
		return anInt7109;
	}

	public void method1035() {
		byte[] is = new byte[anInt7112 * anInt7107];
		int i = 0;
		if (aByteArray7115 == null) {
			for (int i_90_ = 0; i_90_ < anInt7112; i_90_++) {
				for (int i_91_ = anInt7107 - 1; i_91_ >= 0; i_91_--)
					is[i++] = aByteArray7114[i_90_ + i_91_ * anInt7112];
			}
			aByteArray7114 = is;
		} else {
			byte[] is_92_ = new byte[anInt7112 * anInt7107];
			for (int i_93_ = 0; i_93_ < anInt7112; i_93_++) {
				for (int i_94_ = anInt7107 - 1; i_94_ >= 0; i_94_--) {
					is[i] = aByteArray7114[i_93_ + i_94_ * anInt7112];
					is_92_[i++] = aByteArray7115[i_93_ + i_94_ * anInt7112];
				}
			}
			aByteArray7114 = is;
			aByteArray7115 = is_92_;
		}
		int i_95_ = anInt7111;
		anInt7111 = anInt7109;
		anInt7109 = ((Class87_Sub2) this).anInt7108;
		((Class87_Sub2) this).anInt7108 = ((Class87_Sub2) this).anInt7110;
		((Class87_Sub2) this).anInt7110 = anInt7111;
		i_95_ = anInt7107;
		anInt7107 = anInt7112;
		anInt7112 = i_95_;
	}

	public int method1018() {
		return ((Class87_Sub2) this).anInt7110;
	}

	public int method987() {
		return anInt7111;
	}

	public int method984() {
		return anInt7111;
	}

	public void method1033() {
		byte[] is = aByteArray7114;
		if (aByteArray7115 == null) {
			for (int i = anInt7107 - 1; i >= 0; i--) {
				int i_96_ = i * anInt7112;
				for (int i_97_ = (i + 1) * anInt7112; i_96_ < i_97_; i_96_++) {
					i_97_--;
					byte i_98_ = is[i_96_];
					is[i_96_] = is[i_97_];
					is[i_97_] = i_98_;
				}
			}
		} else {
			byte[] is_99_ = aByteArray7115;
			for (int i = anInt7107 - 1; i >= 0; i--) {
				int i_100_ = i * anInt7112;
				for (int i_101_ = (i + 1) * anInt7112; i_100_ < i_101_; i_100_++) {
					i_101_--;
					byte i_102_ = is[i_100_];
					is[i_100_] = is[i_101_];
					is[i_101_] = i_102_;
					i_102_ = is_99_[i_100_];
					is_99_[i_100_] = is_99_[i_101_];
					is_99_[i_101_] = i_102_;
				}
			}
		}
		int i = anInt7109;
		anInt7109 = ((Class87_Sub2) this).anInt7110;
		((Class87_Sub2) this).anInt7110 = i;
	}

	public int method1023() {
		return ((Class87_Sub2) this).anInt7108;
	}

	public void method1024() {
		((Class87_Sub2) this).anInt7108 = 0;
		anInt7111 = 0;
		((Class87_Sub2) this).anInt7110 = 0;
		anInt7109 = 0;
	}

	public void method1025() {
		((Class87_Sub2) this).anInt7108 = 0;
		anInt7111 = 0;
		((Class87_Sub2) this).anInt7110 = 0;
		anInt7109 = 0;
	}

	public void method1013() {
		((Class87_Sub2) this).anInt7108 = 0;
		anInt7111 = 0;
		((Class87_Sub2) this).anInt7110 = 0;
		anInt7109 = 0;
	}

	public void method997(int i) {
		int i_103_ = -1;
		if (anIntArray7113.length < 255) {
			for (int i_104_ = 0; i_104_ < anIntArray7113.length; i_104_++) {
				if (anIntArray7113[i_104_] == i) {
					i_103_ = i_104_;
					break;
				}
			}
			if (i_103_ == -1) {
				i_103_ = anIntArray7113.length;
				int[] is = new int[anIntArray7113.length + 1];
				System.arraycopy(anIntArray7113, 0, is, 0, anIntArray7113.length);
				anIntArray7113 = is;
				is[i_103_] = i;
			}
		} else {
			int i_105_ = 2147483647;
			int i_106_ = i >> 16 & 0xff;
			int i_107_ = i >> 8 & 0xff;
			int i_108_ = i & 0xff;
			for (int i_109_ = 0; i_109_ < anIntArray7113.length; i_109_++) {
				int i_110_ = anIntArray7113[i_109_];
				int i_111_ = i_110_ >> 16 & 0xff;
				int i_112_ = i_110_ >> 8 & 0xff;
				int i_113_ = i_110_ & 0xff;
				int i_114_ = i_106_ - i_111_;
				if (i_114_ < 0)
					i_114_ = -i_114_;
				int i_115_ = i_107_ - i_112_;
				if (i_115_ < 0)
					i_115_ = -i_115_;
				int i_116_ = i_108_ - i_113_;
				if (i_116_ < 0)
					i_116_ = -i_116_;
				int i_117_ = i_114_ + i_115_ + i_116_;
				if (i_117_ < i_105_) {
					i_105_ = i_117_;
					i_103_ = i_109_;
				}
			}
		}
		for (int i_118_ = anInt7107 - 1; i_118_ > 0; i_118_--) {
			int i_119_ = i_118_ * anInt7112;
			for (int i_120_ = anInt7112 - 1; i_120_ > 0; i_120_--) {
				if (anIntArray7113[aByteArray7114[i_120_ + i_119_] & 0xff] == 0 && (anIntArray7113[aByteArray7114[(i_120_ + i_119_ - 1 - anInt7112)] & 0xff] != 0))
					aByteArray7114[i_120_ + i_119_] = (byte) i_103_;
			}
		}
	}

	public void method1002(int i) {
		int i_121_ = method993();
		int i_122_ = method1045();
		if (anInt7112 != i_121_ || anInt7107 != i_122_) {
			int i_123_ = i;
			if (i_123_ > anInt7109)
				i_123_ = anInt7109;
			int i_124_ = i;
			if (i_124_ + anInt7109 + anInt7112 > i_121_)
				i_124_ = i_121_ - anInt7109 - anInt7112;
			int i_125_ = i;
			if (i_125_ > anInt7111)
				i_125_ = anInt7111;
			int i_126_ = i;
			if (i_126_ + anInt7111 + anInt7107 > i_122_)
				i_126_ = i_122_ - anInt7111 - anInt7107;
			int i_127_ = anInt7112 + i_123_ + i_124_;
			int i_128_ = anInt7107 + i_125_ + i_126_;
			byte[] is = new byte[i_127_ * i_128_];
			if (aByteArray7115 == null) {
				for (int i_129_ = 0; i_129_ < anInt7107; i_129_++) {
					int i_130_ = i_129_ * anInt7112;
					int i_131_ = (i_129_ + i_125_) * i_127_ + i_123_;
					for (int i_132_ = 0; i_132_ < anInt7112; i_132_++)
						is[i_131_++] = aByteArray7114[i_130_++];
				}
			} else {
				byte[] is_133_ = new byte[i_127_ * i_128_];
				for (int i_134_ = 0; i_134_ < anInt7107; i_134_++) {
					int i_135_ = i_134_ * anInt7112;
					int i_136_ = (i_134_ + i_125_) * i_127_ + i_123_;
					for (int i_137_ = 0; i_137_ < anInt7112; i_137_++) {
						is_133_[i_136_] = aByteArray7115[i_135_];
						is[i_136_++] = aByteArray7114[i_135_++];
					}
				}
				aByteArray7115 = is_133_;
			}
			anInt7109 -= i_123_;
			anInt7111 -= i_125_;
			((Class87_Sub2) this).anInt7110 -= i_124_;
			((Class87_Sub2) this).anInt7108 -= i_126_;
			anInt7112 = i_127_;
			anInt7107 = i_128_;
			aByteArray7114 = is;
		}
	}

	public void method1034(int i) {
		int i_138_ = -1;
		if (anIntArray7113.length < 255) {
			for (int i_139_ = 0; i_139_ < anIntArray7113.length; i_139_++) {
				if (anIntArray7113[i_139_] == i) {
					i_138_ = i_139_;
					break;
				}
			}
			if (i_138_ == -1) {
				i_138_ = anIntArray7113.length;
				int[] is = new int[anIntArray7113.length + 1];
				System.arraycopy(anIntArray7113, 0, is, 0, anIntArray7113.length);
				anIntArray7113 = is;
				is[i_138_] = i;
			}
		} else {
			int i_140_ = 2147483647;
			int i_141_ = i >> 16 & 0xff;
			int i_142_ = i >> 8 & 0xff;
			int i_143_ = i & 0xff;
			for (int i_144_ = 0; i_144_ < anIntArray7113.length; i_144_++) {
				int i_145_ = anIntArray7113[i_144_];
				int i_146_ = i_145_ >> 16 & 0xff;
				int i_147_ = i_145_ >> 8 & 0xff;
				int i_148_ = i_145_ & 0xff;
				int i_149_ = i_141_ - i_146_;
				if (i_149_ < 0)
					i_149_ = -i_149_;
				int i_150_ = i_142_ - i_147_;
				if (i_150_ < 0)
					i_150_ = -i_150_;
				int i_151_ = i_143_ - i_148_;
				if (i_151_ < 0)
					i_151_ = -i_151_;
				int i_152_ = i_149_ + i_150_ + i_151_;
				if (i_152_ < i_140_) {
					i_140_ = i_152_;
					i_138_ = i_144_;
				}
			}
		}
		int i_153_ = 0;
		byte[] is = new byte[anInt7112 * anInt7107];
		for (int i_154_ = 0; i_154_ < anInt7107; i_154_++) {
			for (int i_155_ = 0; i_155_ < anInt7112; i_155_++) {
				int i_156_ = aByteArray7114[i_153_] & 0xff;
				if (anIntArray7113[i_156_] == 0) {
					if (i_155_ > 0 && (anIntArray7113[aByteArray7114[i_153_ - 1] & 0xff] != 0))
						i_156_ = i_138_;
					else if (i_154_ > 0 && ((anIntArray7113[aByteArray7114[i_153_ - anInt7112] & 0xff]) != 0))
						i_156_ = i_138_;
					else if (i_155_ < anInt7112 - 1 && (anIntArray7113[aByteArray7114[i_153_ + 1] & 0xff]) != 0)
						i_156_ = i_138_;
					else if (i_154_ < anInt7107 - 1 && ((anIntArray7113[aByteArray7114[i_153_ + anInt7112] & 0xff]) != 0))
						i_156_ = i_138_;
				}
				is[i_153_++] = (byte) i_156_;
			}
		}
		aByteArray7114 = is;
	}

	public int method1014() {
		return anInt7107 + anInt7111 + ((Class87_Sub2) this).anInt7108;
	}

	public void method1022(int i) {
		int i_157_ = -1;
		if (anIntArray7113.length < 255) {
			for (int i_158_ = 0; i_158_ < anIntArray7113.length; i_158_++) {
				if (anIntArray7113[i_158_] == i) {
					i_157_ = i_158_;
					break;
				}
			}
			if (i_157_ == -1) {
				i_157_ = anIntArray7113.length;
				int[] is = new int[anIntArray7113.length + 1];
				System.arraycopy(anIntArray7113, 0, is, 0, anIntArray7113.length);
				anIntArray7113 = is;
				is[i_157_] = i;
			}
		} else {
			int i_159_ = 2147483647;
			int i_160_ = i >> 16 & 0xff;
			int i_161_ = i >> 8 & 0xff;
			int i_162_ = i & 0xff;
			for (int i_163_ = 0; i_163_ < anIntArray7113.length; i_163_++) {
				int i_164_ = anIntArray7113[i_163_];
				int i_165_ = i_164_ >> 16 & 0xff;
				int i_166_ = i_164_ >> 8 & 0xff;
				int i_167_ = i_164_ & 0xff;
				int i_168_ = i_160_ - i_165_;
				if (i_168_ < 0)
					i_168_ = -i_168_;
				int i_169_ = i_161_ - i_166_;
				if (i_169_ < 0)
					i_169_ = -i_169_;
				int i_170_ = i_162_ - i_167_;
				if (i_170_ < 0)
					i_170_ = -i_170_;
				int i_171_ = i_168_ + i_169_ + i_170_;
				if (i_171_ < i_159_) {
					i_159_ = i_171_;
					i_157_ = i_163_;
				}
			}
		}
		int i_172_ = 0;
		byte[] is = new byte[anInt7112 * anInt7107];
		for (int i_173_ = 0; i_173_ < anInt7107; i_173_++) {
			for (int i_174_ = 0; i_174_ < anInt7112; i_174_++) {
				int i_175_ = aByteArray7114[i_172_] & 0xff;
				if (anIntArray7113[i_175_] == 0) {
					if (i_174_ > 0 && (anIntArray7113[aByteArray7114[i_172_ - 1] & 0xff] != 0))
						i_175_ = i_157_;
					else if (i_173_ > 0 && ((anIntArray7113[aByteArray7114[i_172_ - anInt7112] & 0xff]) != 0))
						i_175_ = i_157_;
					else if (i_174_ < anInt7112 - 1 && (anIntArray7113[aByteArray7114[i_172_ + 1] & 0xff]) != 0)
						i_175_ = i_157_;
					else if (i_173_ < anInt7107 - 1 && ((anIntArray7113[aByteArray7114[i_172_ + anInt7112] & 0xff]) != 0))
						i_175_ = i_157_;
				}
				is[i_172_++] = (byte) i_175_;
			}
		}
		aByteArray7114 = is;
	}

	public void method1032(int i) {
		int i_176_ = -1;
		if (anIntArray7113.length < 255) {
			for (int i_177_ = 0; i_177_ < anIntArray7113.length; i_177_++) {
				if (anIntArray7113[i_177_] == i) {
					i_176_ = i_177_;
					break;
				}
			}
			if (i_176_ == -1) {
				i_176_ = anIntArray7113.length;
				int[] is = new int[anIntArray7113.length + 1];
				System.arraycopy(anIntArray7113, 0, is, 0, anIntArray7113.length);
				anIntArray7113 = is;
				is[i_176_] = i;
			}
		} else {
			int i_178_ = 2147483647;
			int i_179_ = i >> 16 & 0xff;
			int i_180_ = i >> 8 & 0xff;
			int i_181_ = i & 0xff;
			for (int i_182_ = 0; i_182_ < anIntArray7113.length; i_182_++) {
				int i_183_ = anIntArray7113[i_182_];
				int i_184_ = i_183_ >> 16 & 0xff;
				int i_185_ = i_183_ >> 8 & 0xff;
				int i_186_ = i_183_ & 0xff;
				int i_187_ = i_179_ - i_184_;
				if (i_187_ < 0)
					i_187_ = -i_187_;
				int i_188_ = i_180_ - i_185_;
				if (i_188_ < 0)
					i_188_ = -i_188_;
				int i_189_ = i_181_ - i_186_;
				if (i_189_ < 0)
					i_189_ = -i_189_;
				int i_190_ = i_187_ + i_188_ + i_189_;
				if (i_190_ < i_178_) {
					i_178_ = i_190_;
					i_176_ = i_182_;
				}
			}
		}
		for (int i_191_ = anInt7107 - 1; i_191_ > 0; i_191_--) {
			int i_192_ = i_191_ * anInt7112;
			for (int i_193_ = anInt7112 - 1; i_193_ > 0; i_193_--) {
				if (anIntArray7113[aByteArray7114[i_193_ + i_192_] & 0xff] == 0 && (anIntArray7113[aByteArray7114[(i_193_ + i_192_ - 1 - anInt7112)] & 0xff] != 0))
					aByteArray7114[i_193_ + i_192_] = (byte) i_176_;
			}
		}
	}

	public int[] method1031(boolean bool) {
		int[] is;
		if (bool) {
			int i = method993();
			is = new int[i * method1045()];
			if (aByteArray7115 != null) {
				for (int i_194_ = 0; i_194_ < anInt7107; i_194_++) {
					int i_195_ = i_194_ * anInt7112;
					int i_196_ = anInt7109 + (i_194_ + anInt7111) * i;
					for (int i_197_ = 0; i_197_ < anInt7112; i_197_++) {
						is[i_196_++] = (aByteArray7115[i_195_] << 24 | (anIntArray7113[aByteArray7114[i_195_] & 0xff]));
						i_195_++;
					}
				}
			} else {
				for (int i_198_ = 0; i_198_ < anInt7107; i_198_++) {
					int i_199_ = i_198_ * anInt7112;
					int i_200_ = anInt7109 + (i_198_ + anInt7111) * i;
					for (int i_201_ = 0; i_201_ < anInt7112; i_201_++) {
						int i_202_ = anIntArray7113[aByteArray7114[i_199_++] & 0xff];
						if (i_202_ != 0)
							is[i_200_++] = ~0xffffff | i_202_;
						else
							is[i_200_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt7112 * anInt7107];
			int i = 0;
			int i_203_ = 0;
			if (aByteArray7115 != null) {
				for (int i_204_ = 0; i_204_ < anInt7107; i_204_++) {
					for (int i_205_ = 0; i_205_ < anInt7112; i_205_++) {
						is[i_203_++] = (aByteArray7115[i] << 24 | anIntArray7113[aByteArray7114[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_206_ = 0; i_206_ < anInt7107; i_206_++) {
					for (int i_207_ = 0; i_207_ < anInt7112; i_207_++) {
						int i_208_ = anIntArray7113[aByteArray7114[i++] & 0xff];
						is[i_203_++] = i_208_ != 0 ? ~0xffffff | i_208_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method1020() {
		byte[] is = aByteArray7114;
		if (aByteArray7115 == null) {
			for (int i = (anInt7107 >> 1) - 1; i >= 0; i--) {
				int i_209_ = i * anInt7112;
				int i_210_ = (anInt7107 - i - 1) * anInt7112;
				for (int i_211_ = -anInt7112; i_211_ < 0; i_211_++) {
					byte i_212_ = is[i_209_];
					is[i_209_] = is[i_210_];
					is[i_210_] = i_212_;
					i_209_++;
					i_210_++;
				}
			}
		} else {
			byte[] is_213_ = aByteArray7115;
			for (int i = (anInt7107 >> 1) - 1; i >= 0; i--) {
				int i_214_ = i * anInt7112;
				int i_215_ = (anInt7107 - i - 1) * anInt7112;
				for (int i_216_ = -anInt7112; i_216_ < 0; i_216_++) {
					byte i_217_ = is[i_214_];
					is[i_214_] = is[i_215_];
					is[i_215_] = i_217_;
					i_217_ = is_213_[i_214_];
					is_213_[i_214_] = is_213_[i_215_];
					is_213_[i_215_] = i_217_;
					i_214_++;
					i_215_++;
				}
			}
		}
		int i = anInt7111;
		anInt7111 = ((Class87_Sub2) this).anInt7108;
		((Class87_Sub2) this).anInt7108 = i;
	}

	public int method1011() {
		return anInt7107;
	}

	public void method1036() {
		byte[] is = new byte[anInt7112 * anInt7107];
		int i = 0;
		if (aByteArray7115 == null) {
			for (int i_218_ = 0; i_218_ < anInt7112; i_218_++) {
				for (int i_219_ = anInt7107 - 1; i_219_ >= 0; i_219_--)
					is[i++] = aByteArray7114[i_218_ + i_219_ * anInt7112];
			}
			aByteArray7114 = is;
		} else {
			byte[] is_220_ = new byte[anInt7112 * anInt7107];
			for (int i_221_ = 0; i_221_ < anInt7112; i_221_++) {
				for (int i_222_ = anInt7107 - 1; i_222_ >= 0; i_222_--) {
					is[i] = aByteArray7114[i_221_ + i_222_ * anInt7112];
					is_220_[i++] = aByteArray7115[i_221_ + i_222_ * anInt7112];
				}
			}
			aByteArray7114 = is;
			aByteArray7115 = is_220_;
		}
		int i_223_ = anInt7111;
		anInt7111 = anInt7109;
		anInt7109 = ((Class87_Sub2) this).anInt7108;
		((Class87_Sub2) this).anInt7108 = ((Class87_Sub2) this).anInt7110;
		((Class87_Sub2) this).anInt7110 = anInt7111;
		i_223_ = anInt7107;
		anInt7107 = anInt7112;
		anInt7112 = i_223_;
	}

	public int[] method1037(boolean bool) {
		int[] is;
		if (bool) {
			int i = method993();
			is = new int[i * method1045()];
			if (aByteArray7115 != null) {
				for (int i_224_ = 0; i_224_ < anInt7107; i_224_++) {
					int i_225_ = i_224_ * anInt7112;
					int i_226_ = anInt7109 + (i_224_ + anInt7111) * i;
					for (int i_227_ = 0; i_227_ < anInt7112; i_227_++) {
						is[i_226_++] = (aByteArray7115[i_225_] << 24 | (anIntArray7113[aByteArray7114[i_225_] & 0xff]));
						i_225_++;
					}
				}
			} else {
				for (int i_228_ = 0; i_228_ < anInt7107; i_228_++) {
					int i_229_ = i_228_ * anInt7112;
					int i_230_ = anInt7109 + (i_228_ + anInt7111) * i;
					for (int i_231_ = 0; i_231_ < anInt7112; i_231_++) {
						int i_232_ = anIntArray7113[aByteArray7114[i_229_++] & 0xff];
						if (i_232_ != 0)
							is[i_230_++] = ~0xffffff | i_232_;
						else
							is[i_230_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt7112 * anInt7107];
			int i = 0;
			int i_233_ = 0;
			if (aByteArray7115 != null) {
				for (int i_234_ = 0; i_234_ < anInt7107; i_234_++) {
					for (int i_235_ = 0; i_235_ < anInt7112; i_235_++) {
						is[i_233_++] = (aByteArray7115[i] << 24 | anIntArray7113[aByteArray7114[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_236_ = 0; i_236_ < anInt7107; i_236_++) {
					for (int i_237_ = 0; i_237_ < anInt7112; i_237_++) {
						int i_238_ = anIntArray7113[aByteArray7114[i++] & 0xff];
						is[i_233_++] = i_238_ != 0 ? ~0xffffff | i_238_ : 0;
					}
				}
			}
		}
		return is;
	}

	public int[] method1038(boolean bool) {
		int[] is;
		if (bool) {
			int i = method993();
			is = new int[i * method1045()];
			if (aByteArray7115 != null) {
				for (int i_239_ = 0; i_239_ < anInt7107; i_239_++) {
					int i_240_ = i_239_ * anInt7112;
					int i_241_ = anInt7109 + (i_239_ + anInt7111) * i;
					for (int i_242_ = 0; i_242_ < anInt7112; i_242_++) {
						is[i_241_++] = (aByteArray7115[i_240_] << 24 | (anIntArray7113[aByteArray7114[i_240_] & 0xff]));
						i_240_++;
					}
				}
			} else {
				for (int i_243_ = 0; i_243_ < anInt7107; i_243_++) {
					int i_244_ = i_243_ * anInt7112;
					int i_245_ = anInt7109 + (i_243_ + anInt7111) * i;
					for (int i_246_ = 0; i_246_ < anInt7112; i_246_++) {
						int i_247_ = anIntArray7113[aByteArray7114[i_244_++] & 0xff];
						if (i_247_ != 0)
							is[i_245_++] = ~0xffffff | i_247_;
						else
							is[i_245_++] = 0;
					}
				}
			}
		} else {
			is = new int[anInt7112 * anInt7107];
			int i = 0;
			int i_248_ = 0;
			if (aByteArray7115 != null) {
				for (int i_249_ = 0; i_249_ < anInt7107; i_249_++) {
					for (int i_250_ = 0; i_250_ < anInt7112; i_250_++) {
						is[i_248_++] = (aByteArray7115[i] << 24 | anIntArray7113[aByteArray7114[i] & 0xff]);
						i++;
					}
				}
			} else {
				for (int i_251_ = 0; i_251_ < anInt7107; i_251_++) {
					for (int i_252_ = 0; i_252_ < anInt7112; i_252_++) {
						int i_253_ = anIntArray7113[aByteArray7114[i++] & 0xff];
						is[i_248_++] = i_253_ != 0 ? ~0xffffff | i_253_ : 0;
					}
				}
			}
		}
		return is;
	}

	public void method1039(int i, int i_254_, int i_255_) {
		for (int i_256_ = 1; i_256_ < anIntArray7113.length; i_256_++) {
			if (anIntArray7113[i_256_] != 1 && anIntArray7113[i_256_] != 16711935) {
				int i_257_ = anIntArray7113[i_256_] >> 16 & 0xff;
				i_257_ += i;
				if (i_257_ < 0)
					i_257_ = 0;
				else if (i_257_ > 255)
					i_257_ = 255;
				int i_258_ = anIntArray7113[i_256_] >> 8 & 0xff;
				i_258_ += i_254_;
				if (i_258_ < 0)
					i_258_ = 0;
				else if (i_258_ > 255)
					i_258_ = 255;
				int i_259_ = anIntArray7113[i_256_] >> 0 & 0xff;
				i_259_ += i_255_;
				if (i_259_ < 0)
					i_259_ = 0;
				else if (i_259_ > 255)
					i_259_ = 255;
				anIntArray7113[i_256_] = i_257_ << 16 | i_258_ << 8 | i_259_;
			}
		}
	}

	public void method1040(int i, int i_260_, int i_261_) {
		for (int i_262_ = 1; i_262_ < anIntArray7113.length; i_262_++) {
			if (anIntArray7113[i_262_] != 1 && anIntArray7113[i_262_] != 16711935) {
				int i_263_ = anIntArray7113[i_262_] >> 16 & 0xff;
				i_263_ += i;
				if (i_263_ < 0)
					i_263_ = 0;
				else if (i_263_ > 255)
					i_263_ = 255;
				int i_264_ = anIntArray7113[i_262_] >> 8 & 0xff;
				i_264_ += i_260_;
				if (i_264_ < 0)
					i_264_ = 0;
				else if (i_264_ > 255)
					i_264_ = 255;
				int i_265_ = anIntArray7113[i_262_] >> 0 & 0xff;
				i_265_ += i_261_;
				if (i_265_ < 0)
					i_265_ = 0;
				else if (i_265_ > 255)
					i_265_ = 255;
				anIntArray7113[i_262_] = i_263_ << 16 | i_264_ << 8 | i_265_;
			}
		}
	}

	public int method994() {
		return anInt7107;
	}

	public void method1042(int i, int i_266_, int i_267_) {
		for (int i_268_ = 1; i_268_ < anIntArray7113.length; i_268_++) {
			if (anIntArray7113[i_268_] != 1 && anIntArray7113[i_268_] != 16711935) {
				int i_269_ = anIntArray7113[i_268_] >> 16 & 0xff;
				i_269_ += i;
				if (i_269_ < 0)
					i_269_ = 0;
				else if (i_269_ > 255)
					i_269_ = 255;
				int i_270_ = anIntArray7113[i_268_] >> 8 & 0xff;
				i_270_ += i_266_;
				if (i_270_ < 0)
					i_270_ = 0;
				else if (i_270_ > 255)
					i_270_ = 255;
				int i_271_ = anIntArray7113[i_268_] >> 0 & 0xff;
				i_271_ += i_267_;
				if (i_271_ < 0)
					i_271_ = 0;
				else if (i_271_ > 255)
					i_271_ = 255;
				anIntArray7113[i_268_] = i_269_ << 16 | i_270_ << 8 | i_271_;
			}
		}
	}

	public void method1029(int i) {
		int i_272_ = -1;
		if (anIntArray7113.length < 255) {
			for (int i_273_ = 0; i_273_ < anIntArray7113.length; i_273_++) {
				if (anIntArray7113[i_273_] == i) {
					i_272_ = i_273_;
					break;
				}
			}
			if (i_272_ == -1) {
				i_272_ = anIntArray7113.length;
				int[] is = new int[anIntArray7113.length + 1];
				System.arraycopy(anIntArray7113, 0, is, 0, anIntArray7113.length);
				anIntArray7113 = is;
				is[i_272_] = i;
			}
		} else {
			int i_274_ = 2147483647;
			int i_275_ = i >> 16 & 0xff;
			int i_276_ = i >> 8 & 0xff;
			int i_277_ = i & 0xff;
			for (int i_278_ = 0; i_278_ < anIntArray7113.length; i_278_++) {
				int i_279_ = anIntArray7113[i_278_];
				int i_280_ = i_279_ >> 16 & 0xff;
				int i_281_ = i_279_ >> 8 & 0xff;
				int i_282_ = i_279_ & 0xff;
				int i_283_ = i_275_ - i_280_;
				if (i_283_ < 0)
					i_283_ = -i_283_;
				int i_284_ = i_276_ - i_281_;
				if (i_284_ < 0)
					i_284_ = -i_284_;
				int i_285_ = i_277_ - i_282_;
				if (i_285_ < 0)
					i_285_ = -i_285_;
				int i_286_ = i_283_ + i_284_ + i_285_;
				if (i_286_ < i_274_) {
					i_274_ = i_286_;
					i_272_ = i_278_;
				}
			}
		}
		int i_287_ = 0;
		byte[] is = new byte[anInt7112 * anInt7107];
		for (int i_288_ = 0; i_288_ < anInt7107; i_288_++) {
			for (int i_289_ = 0; i_289_ < anInt7112; i_289_++) {
				int i_290_ = aByteArray7114[i_287_] & 0xff;
				if (anIntArray7113[i_290_] == 0) {
					if (i_289_ > 0 && (anIntArray7113[aByteArray7114[i_287_ - 1] & 0xff] != 0))
						i_290_ = i_272_;
					else if (i_288_ > 0 && ((anIntArray7113[aByteArray7114[i_287_ - anInt7112] & 0xff]) != 0))
						i_290_ = i_272_;
					else if (i_289_ < anInt7112 - 1 && (anIntArray7113[aByteArray7114[i_287_ + 1] & 0xff]) != 0)
						i_290_ = i_272_;
					else if (i_288_ < anInt7107 - 1 && ((anIntArray7113[aByteArray7114[i_287_ + anInt7112] & 0xff]) != 0))
						i_290_ = i_272_;
				}
				is[i_287_++] = (byte) i_290_;
			}
		}
		aByteArray7114 = is;
	}

	public int method1004(int i, int i_291_) {
		return anIntArray7113[aByteArray7114[i + i_291_ * anInt7112] & 0xff];
	}

	public int method1021(int i, int i_292_) {
		return anIntArray7113[aByteArray7114[i + i_292_ * anInt7112] & 0xff];
	}

	public int method1046(int i, int i_293_) {
		return anIntArray7113[aByteArray7114[i + i_293_ * anInt7112] & 0xff];
	}

	public boolean method1015() {
		return true;
	}
}
