/* Class61_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61_Sub3_Sub2 extends Class61_Sub3 {
	int[] anIntArray10094;

	Class61_Sub3_Sub2(Class_ra_Sub3 class_ra_sub3, int[] is, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		super(class_ra_sub3, i_1_, i_2_);
		if (bool)
			((Class61_Sub3_Sub2) this).anIntArray10094 = new int[i_1_ * i_2_];
		else
			((Class61_Sub3_Sub2) this).anIntArray10094 = is;
		i_0_ -= ((Class61_Sub3_Sub2) this).anInt9358;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++)
				((Class61_Sub3_Sub2) this).anIntArray10094[i_3_++] = is[i++];
			i += i_0_;
		}
	}

	Class61_Sub3_Sub2(Class_ra_Sub3 class_ra_sub3, int[] is, int i, int i_6_) {
		super(class_ra_sub3, i, i_6_);
		((Class61_Sub3_Sub2) this).anIntArray10094 = is;
	}

	public void method689(int i, int i_7_, Class_ta class_ta, int i_8_, int i_9_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			i += ((Class61_Sub3_Sub2) this).anInt9352;
			i_7_ += ((Class61_Sub3_Sub2) this).anInt9327;
			int i_10_ = 0;
			int i_11_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			int i_12_ = ((Class61_Sub3_Sub2) this).anInt9358;
			int i_13_ = ((Class61_Sub3_Sub2) this).anInt9325;
			int i_14_ = i_11_ - i_12_;
			int i_15_ = 0;
			int i_16_ = i + i_7_ * i_11_;
			if (i_7_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_17_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_7_);
				i_13_ -= i_17_;
				i_7_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_10_ += i_17_ * i_12_;
				i_16_ += i_17_ * i_11_;
			}
			if (i_7_ + i_13_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_13_ -= (i_7_ + i_13_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541));
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_18_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_12_ -= i_18_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_10_ += i_18_;
				i_16_ += i_18_;
				i_15_ += i_18_;
				i_14_ += i_18_;
			}
			if (i + i_12_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635 * -1071049483)) {
				int i_19_ = i + i_12_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483;
				i_12_ -= i_19_;
				i_15_ += i_19_;
				i_14_ += i_19_;
			}
			if (i_12_ > 0 && i_13_ > 0) {
				Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
				int[] is_20_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
				int[] is_21_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
				int i_22_ = i_7_;
				if (i_9_ > i_22_) {
					i_22_ = i_9_;
					i_16_ += (i_9_ - i_7_) * i_11_;
					i_10_ += ((i_9_ - i_7_) * ((Class61_Sub3_Sub2) this).anInt9358);
				}
				int i_23_ = (i_9_ + is_20_.length < i_7_ + i_13_ ? i_9_ + is_20_.length : i_7_ + i_13_);
				for (int i_24_ = i_22_; i_24_ < i_23_; i_24_++) {
					int i_25_ = is_20_[i_24_ - i_9_] + i_8_;
					int i_26_ = is_21_[i_24_ - i_9_];
					int i_27_ = i_12_;
					if (i > i_25_) {
						int i_28_ = i - i_25_;
						if (i_28_ >= i_26_) {
							i_10_ += i_12_ + i_15_;
							i_16_ += i_12_ + i_14_;
							continue;
						}
						i_26_ -= i_28_;
					} else {
						int i_29_ = i_25_ - i;
						if (i_29_ >= i_12_) {
							i_10_ += i_12_ + i_15_;
							i_16_ += i_12_ + i_14_;
							continue;
						}
						i_10_ += i_29_;
						i_27_ -= i_29_;
						i_16_ += i_29_;
					}
					int i_30_ = 0;
					if (i_27_ < i_26_)
						i_26_ = i_27_;
					else
						i_30_ = i_27_ - i_26_;
					for (int i_31_ = -i_26_; i_31_ < 0; i_31_++) {
						int i_32_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_10_++]);
						int i_33_ = i_32_ >>> 24;
						int i_34_ = 256 - i_33_;
						int i_35_ = is[i_16_];
						is[i_16_++] = ((((i_32_ & 0xff00ff) * i_33_ + (i_35_ & 0xff00ff) * i_34_) & ~0xff00ff) + (((i_32_ & 0xff00) * i_33_ + (i_35_ & 0xff00) * i_34_) & 0xff0000)) >> 8;
					}
					i_10_ += i_30_ + i_15_;
					i_16_ += i_30_ + i_14_;
				}
			}
		}
	}

	public Interface8_Impl1_Impl2 method684() {
		return new Class12(((Class61_Sub3_Sub2) this).anInt9358, ((Class61_Sub3_Sub2) this).anInt9325, ((Class61_Sub3_Sub2) this).anIntArray10094);
	}

	public void method688(int i, int i_36_, int i_37_, int i_38_, int i_39_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_40_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub2) this).anInt9352;
			i_36_ += ((Class61_Sub3_Sub2) this).anInt9327;
			int i_41_ = i_36_ * i_40_ + i;
			int i_42_ = 0;
			int i_43_ = ((Class61_Sub3_Sub2) this).anInt9325;
			int i_44_ = ((Class61_Sub3_Sub2) this).anInt9358;
			int i_45_ = i_40_ - i_44_;
			int i_46_ = 0;
			if (i_36_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_47_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_36_);
				i_43_ -= i_47_;
				i_36_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_42_ += i_47_ * i_44_;
				i_41_ += i_47_ * i_40_;
			}
			if (i_36_ + i_43_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_43_ -= (i_36_ + i_43_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541));
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_48_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_44_ -= i_48_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_42_ += i_48_;
				i_41_ += i_48_;
				i_46_ += i_48_;
				i_45_ += i_48_;
			}
			if (i + i_44_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635 * -1071049483)) {
				int i_49_ = i + i_44_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483;
				i_44_ -= i_49_;
				i_46_ += i_49_;
				i_45_ += i_49_;
			}
			if (i_44_ > 0 && i_43_ > 0) {
				if (i_39_ == 0) {
					if (i_37_ == 1) {
						for (int i_50_ = -i_43_; i_50_ < 0; i_50_++) {
							int i_51_ = i_41_ + i_44_ - 3;
							while (i_41_ < i_51_) {
								is[i_41_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								is[i_41_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								is[i_41_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								is[i_41_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
							}
							i_51_ += 3;
							while (i_41_ < i_51_)
								is[i_41_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 0) {
						int i_52_ = (i_38_ & 0xff0000) >> 16;
						int i_53_ = (i_38_ & 0xff00) >> 8;
						int i_54_ = i_38_ & 0xff;
						for (int i_55_ = -i_43_; i_55_ < 0; i_55_++) {
							for (int i_56_ = -i_44_; i_56_ < 0; i_56_++) {
								int i_57_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								int i_58_ = (i_57_ & 0xff0000) * i_52_ & ~0xffffff;
								int i_59_ = (i_57_ & 0xff00) * i_53_ & 0xff0000;
								int i_60_ = (i_57_ & 0xff) * i_54_ & 0xff00;
								is[i_41_++] = (i_58_ | i_59_ | i_60_) >>> 8;
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 3) {
						for (int i_61_ = -i_43_; i_61_ < 0; i_61_++) {
							for (int i_62_ = -i_44_; i_62_ < 0; i_62_++) {
								int i_63_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								int i_64_ = i_63_ + i_38_;
								int i_65_ = (i_63_ & 0xff00ff) + (i_38_ & 0xff00ff);
								int i_66_ = ((i_65_ & 0x1000100) + (i_64_ - i_65_ & 0x10000));
								is[i_41_++] = i_64_ - i_66_ | i_66_ - (i_66_ >>> 8);
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 2) {
						int i_67_ = i_38_ >>> 24;
						int i_68_ = 256 - i_67_;
						int i_69_ = (i_38_ & 0xff00ff) * i_68_ & ~0xff00ff;
						int i_70_ = (i_38_ & 0xff00) * i_68_ & 0xff0000;
						i_38_ = (i_69_ | i_70_) >>> 8;
						for (int i_71_ = -i_43_; i_71_ < 0; i_71_++) {
							for (int i_72_ = -i_44_; i_72_ < 0; i_72_++) {
								int i_73_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								i_69_ = (i_73_ & 0xff00ff) * i_67_ & ~0xff00ff;
								i_70_ = (i_73_ & 0xff00) * i_67_ & 0xff0000;
								is[i_41_++] = ((i_69_ | i_70_) >>> 8) + i_38_;
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_39_ == 1) {
					if (i_37_ == 1) {
						for (int i_74_ = -i_43_; i_74_ < 0; i_74_++) {
							for (int i_75_ = -i_44_; i_75_ < 0; i_75_++) {
								int i_76_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								int i_77_ = i_76_ >>> 24;
								int i_78_ = 256 - i_77_;
								int i_79_ = is[i_41_];
								is[i_41_++] = (((((i_76_ & 0xff00ff) * i_77_ + (i_79_ & 0xff00ff) * i_78_) & ~0xff00ff) >> 8) + ((((i_76_ & ~0xff00ff) >>> 8) * i_77_ + (((i_79_ & ~0xff00ff) >>> 8) * i_78_)) & ~0xff00ff));
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 0) {
						if ((i_38_ & 0xffffff) == 16777215) {
							for (int i_80_ = -i_43_; i_80_ < 0; i_80_++) {
								for (int i_81_ = -i_44_; i_81_ < 0; i_81_++) {
									int i_82_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
									int i_83_ = (i_82_ >>> 24) * (i_38_ >>> 24) >> 8;
									int i_84_ = 256 - i_83_;
									int i_85_ = is[i_41_];
									is[i_41_++] = ((((i_82_ & 0xff00ff) * i_83_ + (i_85_ & 0xff00ff) * i_84_) & ~0xff00ff) + (((i_82_ & 0xff00) * i_83_ + (i_85_ & 0xff00) * i_84_) & 0xff0000)) >> 8;
								}
								i_41_ += i_45_;
								i_42_ += i_46_;
							}
						} else {
							int i_86_ = (i_38_ & 0xff0000) >> 16;
							int i_87_ = (i_38_ & 0xff00) >> 8;
							int i_88_ = i_38_ & 0xff;
							for (int i_89_ = -i_43_; i_89_ < 0; i_89_++) {
								for (int i_90_ = -i_44_; i_90_ < 0; i_90_++) {
									int i_91_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
									int i_92_ = (i_91_ >>> 24) * (i_38_ >>> 24) >> 8;
									int i_93_ = 256 - i_92_;
									if (i_92_ != 255) {
										int i_94_ = ((i_91_ & 0xff0000) * i_86_ & ~0xffffff);
										int i_95_ = ((i_91_ & 0xff00) * i_87_ & 0xff0000);
										int i_96_ = (i_91_ & 0xff) * i_88_ & 0xff00;
										i_91_ = (i_94_ | i_95_ | i_96_) >>> 8;
										int i_97_ = is[i_41_];
										is[i_41_++] = ((((i_91_ & 0xff00ff) * i_92_ + (i_97_ & 0xff00ff) * i_93_) & ~0xff00ff) + (((i_91_ & 0xff00) * i_92_ + (i_97_ & 0xff00) * i_93_) & 0xff0000)) >> 8;
									} else {
										int i_98_ = ((i_91_ & 0xff0000) * i_86_ & ~0xffffff);
										int i_99_ = ((i_91_ & 0xff00) * i_87_ & 0xff0000);
										int i_100_ = (i_91_ & 0xff) * i_88_ & 0xff00;
										is[i_41_++] = (i_98_ | i_99_ | i_100_) >>> 8;
									}
								}
								i_41_ += i_45_;
								i_42_ += i_46_;
							}
						}
					} else if (i_37_ == 3) {
						for (int i_101_ = -i_43_; i_101_ < 0; i_101_++) {
							for (int i_102_ = -i_44_; i_102_ < 0; i_102_++) {
								int i_103_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								int i_104_ = i_103_ + i_38_;
								int i_105_ = (i_103_ & 0xff00ff) + (i_38_ & 0xff00ff);
								int i_106_ = ((i_105_ & 0x1000100) + (i_104_ - i_105_ & 0x10000));
								i_106_ = i_104_ - i_106_ | i_106_ - (i_106_ >>> 8);
								int i_107_ = (i_106_ >>> 24) * (i_38_ >>> 24) >> 8;
								int i_108_ = 256 - i_107_;
								if (i_107_ != 255) {
									i_103_ = i_106_;
									i_106_ = is[i_41_];
									i_106_ = ((((i_103_ & 0xff00ff) * i_107_ + (i_106_ & 0xff00ff) * i_108_) & ~0xff00ff) + (((i_103_ & 0xff00) * i_107_ + (i_106_ & 0xff00) * i_108_) & 0xff0000)) >> 8;
								}
								is[i_41_++] = i_106_;
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 2) {
						int i_109_ = i_38_ >>> 24;
						int i_110_ = 256 - i_109_;
						int i_111_ = (i_38_ & 0xff00ff) * i_110_ & ~0xff00ff;
						int i_112_ = (i_38_ & 0xff00) * i_110_ & 0xff0000;
						i_38_ = (i_111_ | i_112_) >>> 8;
						for (int i_113_ = -i_43_; i_113_ < 0; i_113_++) {
							for (int i_114_ = -i_44_; i_114_ < 0; i_114_++) {
								int i_115_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								int i_116_ = i_115_ >>> 24;
								int i_117_ = 256 - i_116_;
								i_111_ = (i_115_ & 0xff00ff) * i_109_ & ~0xff00ff;
								i_112_ = (i_115_ & 0xff00) * i_109_ & 0xff0000;
								i_115_ = ((i_111_ | i_112_) >>> 8) + i_38_;
								int i_118_ = is[i_41_];
								is[i_41_++] = ((((i_115_ & 0xff00ff) * i_116_ + (i_118_ & 0xff00ff) * i_117_) & ~0xff00ff) + (((i_115_ & 0xff00) * i_116_ + (i_118_ & 0xff00) * i_117_) & 0xff0000)) >> 8;
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_39_ == 2) {
					if (i_37_ == 1) {
						for (int i_119_ = -i_43_; i_119_ < 0; i_119_++) {
							for (int i_120_ = -i_44_; i_120_ < 0; i_120_++) {
								int i_121_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								if (i_121_ != 0) {
									int i_122_ = is[i_41_];
									int i_123_ = i_121_ + i_122_;
									int i_124_ = ((i_121_ & 0xff00ff) + (i_122_ & 0xff00ff));
									i_122_ = ((i_124_ & 0x1000100) + (i_123_ - i_124_ & 0x10000));
									is[i_41_++] = i_123_ - i_122_ | i_122_ - (i_122_ >>> 8);
								} else
									i_41_++;
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 0) {
						int i_125_ = (i_38_ & 0xff0000) >> 16;
						int i_126_ = (i_38_ & 0xff00) >> 8;
						int i_127_ = i_38_ & 0xff;
						for (int i_128_ = -i_43_; i_128_ < 0; i_128_++) {
							for (int i_129_ = -i_44_; i_129_ < 0; i_129_++) {
								int i_130_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								if (i_130_ != 0) {
									int i_131_ = ((i_130_ & 0xff0000) * i_125_ & ~0xffffff);
									int i_132_ = ((i_130_ & 0xff00) * i_126_ & 0xff0000);
									int i_133_ = (i_130_ & 0xff) * i_127_ & 0xff00;
									i_130_ = (i_131_ | i_132_ | i_133_) >>> 8;
									int i_134_ = is[i_41_];
									int i_135_ = i_130_ + i_134_;
									int i_136_ = ((i_130_ & 0xff00ff) + (i_134_ & 0xff00ff));
									i_134_ = ((i_136_ & 0x1000100) + (i_135_ - i_136_ & 0x10000));
									is[i_41_++] = i_135_ - i_134_ | i_134_ - (i_134_ >>> 8);
								} else
									i_41_++;
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 3) {
						for (int i_137_ = -i_43_; i_137_ < 0; i_137_++) {
							for (int i_138_ = -i_44_; i_138_ < 0; i_138_++) {
								int i_139_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								int i_140_ = i_139_ + i_38_;
								int i_141_ = (i_139_ & 0xff00ff) + (i_38_ & 0xff00ff);
								int i_142_ = ((i_141_ & 0x1000100) + (i_140_ - i_141_ & 0x10000));
								i_139_ = i_140_ - i_142_ | i_142_ - (i_142_ >>> 8);
								i_142_ = is[i_41_];
								i_140_ = i_139_ + i_142_;
								i_141_ = (i_139_ & 0xff00ff) + (i_142_ & 0xff00ff);
								i_142_ = (i_141_ & 0x1000100) + (i_140_ - i_141_ & 0x10000);
								is[i_41_++] = i_140_ - i_142_ | i_142_ - (i_142_ >>> 8);
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else if (i_37_ == 2) {
						int i_143_ = i_38_ >>> 24;
						int i_144_ = 256 - i_143_;
						int i_145_ = (i_38_ & 0xff00ff) * i_144_ & ~0xff00ff;
						int i_146_ = (i_38_ & 0xff00) * i_144_ & 0xff0000;
						i_38_ = (i_145_ | i_146_) >>> 8;
						for (int i_147_ = -i_43_; i_147_ < 0; i_147_++) {
							for (int i_148_ = -i_44_; i_148_ < 0; i_148_++) {
								int i_149_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_42_++]);
								if (i_149_ != 0) {
									i_145_ = ((i_149_ & 0xff00ff) * i_143_ & ~0xff00ff);
									i_146_ = ((i_149_ & 0xff00) * i_143_ & 0xff0000);
									i_149_ = ((i_145_ | i_146_) >>> 8) + i_38_;
									int i_150_ = is[i_41_];
									int i_151_ = i_149_ + i_150_;
									int i_152_ = ((i_149_ & 0xff00ff) + (i_150_ & 0xff00ff));
									i_150_ = ((i_152_ & 0x1000100) + (i_151_ - i_152_ & 0x10000));
									is[i_41_++] = i_151_ - i_150_ | i_150_ - (i_150_ >>> 8);
								} else
									i_41_++;
							}
							i_41_ += i_45_;
							i_42_ += i_46_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method704(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_158_ = 0; i_158_ < i_155_; i_158_++) {
			int i_159_ = (i_153_ + i_158_) * i_154_ + i;
			int i_160_ = (i_157_ + i_158_) * i_154_ + i_156_;
			for (int i_161_ = 0; i_161_ < i_154_; i_161_++)
				((Class61_Sub3_Sub2) this).anIntArray10094[i_159_ + i_161_] = is[i_160_ + i_161_] & 0xffffff;
		}
	}

	void method736(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_163_ > 0 && i_164_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_169_ = 0;
				int i_170_ = 0;
				int i_171_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_172_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
				int i_173_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
				int i_174_ = (i_172_ << 16) / i_163_;
				int i_175_ = (i_173_ << 16) / i_164_;
				if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
					int i_176_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_174_ - 1) / i_174_);
					i += i_176_;
					i_169_ += (i_176_ * i_174_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
					int i_177_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_175_ - 1) / i_175_);
					i_162_ += i_177_;
					i_170_ += (i_177_ * i_175_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9358 < i_172_)
					i_163_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_169_ + i_174_ - 1) / i_174_;
				if (((Class61_Sub3_Sub2) this).anInt9325 < i_173_)
					i_164_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_170_ + i_175_ - 1) / i_175_;
				int i_178_ = i + i_162_ * i_171_;
				int i_179_ = i_171_ - i_163_;
				if (i_162_ + i_164_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_164_ -= (i_162_ + i_164_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_162_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_180_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_162_);
					i_164_ -= i_180_;
					i_178_ += i_180_ * i_171_;
					i_170_ += i_175_ * i_180_;
				}
				if (i + i_163_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_181_ = (i + i_163_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_163_ -= i_181_;
					i_179_ += i_181_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_182_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
					i_163_ -= i_182_;
					i_178_ += i_182_;
					i_169_ += i_174_ * i_182_;
					i_179_ += i_182_;
				}
				if (i_167_ == 0) {
					if (i_165_ == 1) {
						int i_183_ = i_169_;
						for (int i_184_ = -i_164_; i_184_ < 0; i_184_++) {
							int i_185_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_186_ = -i_163_; i_186_ < 0; i_186_++) {
								is[i_178_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_185_]);
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_183_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 0) {
						int i_187_ = (i_166_ & 0xff0000) >> 16;
						int i_188_ = (i_166_ & 0xff00) >> 8;
						int i_189_ = i_166_ & 0xff;
						int i_190_ = i_169_;
						for (int i_191_ = -i_164_; i_191_ < 0; i_191_++) {
							int i_192_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_193_ = -i_163_; i_193_ < 0; i_193_++) {
								int i_194_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_192_]);
								int i_195_ = (i_194_ & 0xff0000) * i_187_ & ~0xffffff;
								int i_196_ = (i_194_ & 0xff00) * i_188_ & 0xff0000;
								int i_197_ = (i_194_ & 0xff) * i_189_ & 0xff00;
								is[i_178_++] = (i_195_ | i_196_ | i_197_) >>> 8;
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_190_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 3) {
						int i_198_ = i_169_;
						for (int i_199_ = -i_164_; i_199_ < 0; i_199_++) {
							int i_200_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_201_ = -i_163_; i_201_ < 0; i_201_++) {
								int i_202_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_200_]);
								int i_203_ = i_202_ + i_166_;
								int i_204_ = ((i_202_ & 0xff00ff) + (i_166_ & 0xff00ff));
								int i_205_ = ((i_204_ & 0x1000100) + (i_203_ - i_204_ & 0x10000));
								is[i_178_++] = i_203_ - i_205_ | i_205_ - (i_205_ >>> 8);
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_198_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 2) {
						int i_206_ = i_166_ >>> 24;
						int i_207_ = 256 - i_206_;
						int i_208_ = (i_166_ & 0xff00ff) * i_207_ & ~0xff00ff;
						int i_209_ = (i_166_ & 0xff00) * i_207_ & 0xff0000;
						i_166_ = (i_208_ | i_209_) >>> 8;
						int i_210_ = i_169_;
						for (int i_211_ = -i_164_; i_211_ < 0; i_211_++) {
							int i_212_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_213_ = -i_163_; i_213_ < 0; i_213_++) {
								int i_214_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_212_]);
								i_208_ = (i_214_ & 0xff00ff) * i_206_ & ~0xff00ff;
								i_209_ = (i_214_ & 0xff00) * i_206_ & 0xff0000;
								is[i_178_++] = ((i_208_ | i_209_) >>> 8) + i_166_;
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_210_;
							i_178_ += i_179_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_167_ == 1) {
					if (i_165_ == 1) {
						int i_215_ = i_169_;
						for (int i_216_ = -i_164_; i_216_ < 0; i_216_++) {
							int i_217_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_218_ = -i_163_; i_218_ < 0; i_218_++) {
								int i_219_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_217_]);
								int i_220_ = i_219_ >>> 24;
								int i_221_ = 256 - i_220_;
								int i_222_ = is[i_178_];
								is[i_178_++] = (((((i_219_ & 0xff00ff) * i_220_ + (i_222_ & 0xff00ff) * i_221_) & ~0xff00ff) >> 8) + (((((i_219_ & ~0xff00ff) >>> 8) * i_220_) + (((i_222_ & ~0xff00ff) >>> 8) * i_221_)) & ~0xff00ff));
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_215_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 0) {
						int i_223_ = i_169_;
						if ((i_166_ & 0xffffff) == 16777215) {
							for (int i_224_ = -i_164_; i_224_ < 0; i_224_++) {
								int i_225_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_226_ = -i_163_; i_226_ < 0; i_226_++) {
									int i_227_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_225_]);
									int i_228_ = ((i_227_ >>> 24) * (i_166_ >>> 24) >> 8);
									int i_229_ = 256 - i_228_;
									int i_230_ = is[i_178_];
									is[i_178_++] = ((((i_227_ & 0xff00ff) * i_228_ + (i_230_ & 0xff00ff) * i_229_) & ~0xff00ff) + (((i_227_ & 0xff00) * i_228_ + (i_230_ & 0xff00) * i_229_) & 0xff0000)) >> 8;
									i_169_ += i_174_;
								}
								i_170_ += i_175_;
								i_169_ = i_223_;
								i_178_ += i_179_;
							}
						} else {
							int i_231_ = (i_166_ & 0xff0000) >> 16;
							int i_232_ = (i_166_ & 0xff00) >> 8;
							int i_233_ = i_166_ & 0xff;
							for (int i_234_ = -i_164_; i_234_ < 0; i_234_++) {
								int i_235_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_236_ = -i_163_; i_236_ < 0; i_236_++) {
									int i_237_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_235_]);
									int i_238_ = ((i_237_ >>> 24) * (i_166_ >>> 24) >> 8);
									int i_239_ = 256 - i_238_;
									if (i_238_ != 255) {
										int i_240_ = ((i_237_ & 0xff0000) * i_231_ & ~0xffffff);
										int i_241_ = ((i_237_ & 0xff00) * i_232_ & 0xff0000);
										int i_242_ = ((i_237_ & 0xff) * i_233_ & 0xff00);
										i_237_ = (i_240_ | i_241_ | i_242_) >>> 8;
										int i_243_ = is[i_178_];
										is[i_178_++] = ((((i_237_ & 0xff00ff) * i_238_ + ((i_243_ & 0xff00ff) * i_239_)) & ~0xff00ff) + (((i_237_ & 0xff00) * i_238_ + ((i_243_ & 0xff00) * i_239_)) & 0xff0000)) >> 8;
									} else {
										int i_244_ = ((i_237_ & 0xff0000) * i_231_ & ~0xffffff);
										int i_245_ = ((i_237_ & 0xff00) * i_232_ & 0xff0000);
										int i_246_ = ((i_237_ & 0xff) * i_233_ & 0xff00);
										is[i_178_++] = (i_244_ | i_245_ | i_246_) >>> 8;
									}
									i_169_ += i_174_;
								}
								i_170_ += i_175_;
								i_169_ = i_223_;
								i_178_ += i_179_;
							}
						}
					} else if (i_165_ == 3) {
						int i_247_ = i_169_;
						for (int i_248_ = -i_164_; i_248_ < 0; i_248_++) {
							int i_249_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_250_ = -i_163_; i_250_ < 0; i_250_++) {
								int i_251_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_249_]);
								int i_252_ = i_251_ + i_166_;
								int i_253_ = ((i_251_ & 0xff00ff) + (i_166_ & 0xff00ff));
								int i_254_ = ((i_253_ & 0x1000100) + (i_252_ - i_253_ & 0x10000));
								i_254_ = i_252_ - i_254_ | i_254_ - (i_254_ >>> 8);
								int i_255_ = (i_254_ >>> 24) * (i_166_ >>> 24) >> 8;
								int i_256_ = 256 - i_255_;
								if (i_255_ != 255) {
									i_251_ = i_254_;
									i_254_ = is[i_178_];
									i_254_ = ((((i_251_ & 0xff00ff) * i_255_ + (i_254_ & 0xff00ff) * i_256_) & ~0xff00ff) + (((i_251_ & 0xff00) * i_255_ + (i_254_ & 0xff00) * i_256_) & 0xff0000)) >> 8;
								}
								is[i_178_++] = i_254_;
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_247_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 2) {
						int i_257_ = i_166_ >>> 24;
						int i_258_ = 256 - i_257_;
						int i_259_ = (i_166_ & 0xff00ff) * i_258_ & ~0xff00ff;
						int i_260_ = (i_166_ & 0xff00) * i_258_ & 0xff0000;
						i_166_ = (i_259_ | i_260_) >>> 8;
						int i_261_ = i_169_;
						for (int i_262_ = -i_164_; i_262_ < 0; i_262_++) {
							int i_263_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_264_ = -i_163_; i_264_ < 0; i_264_++) {
								int i_265_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_263_]);
								int i_266_ = i_265_ >>> 24;
								int i_267_ = 256 - i_266_;
								i_259_ = (i_265_ & 0xff00ff) * i_257_ & ~0xff00ff;
								i_260_ = (i_265_ & 0xff00) * i_257_ & 0xff0000;
								i_265_ = ((i_259_ | i_260_) >>> 8) + i_166_;
								int i_268_ = is[i_178_];
								is[i_178_++] = ((((i_265_ & 0xff00ff) * i_266_ + (i_268_ & 0xff00ff) * i_267_) & ~0xff00ff) + (((i_265_ & 0xff00) * i_266_ + (i_268_ & 0xff00) * i_267_) & 0xff0000)) >> 8;
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_261_;
							i_178_ += i_179_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_167_ == 2) {
					if (i_165_ == 1) {
						int i_269_ = i_169_;
						for (int i_270_ = -i_164_; i_270_ < 0; i_270_++) {
							int i_271_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_272_ = -i_163_; i_272_ < 0; i_272_++) {
								int i_273_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_271_]);
								if (i_273_ != 0) {
									int i_274_ = is[i_178_];
									int i_275_ = i_273_ + i_274_;
									int i_276_ = ((i_273_ & 0xff00ff) + (i_274_ & 0xff00ff));
									i_274_ = ((i_276_ & 0x1000100) + (i_275_ - i_276_ & 0x10000));
									is[i_178_++] = i_275_ - i_274_ | i_274_ - (i_274_ >>> 8);
								} else
									i_178_++;
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_269_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 0) {
						int i_277_ = i_169_;
						int i_278_ = (i_166_ & 0xff0000) >> 16;
						int i_279_ = (i_166_ & 0xff00) >> 8;
						int i_280_ = i_166_ & 0xff;
						for (int i_281_ = -i_164_; i_281_ < 0; i_281_++) {
							int i_282_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_283_ = -i_163_; i_283_ < 0; i_283_++) {
								int i_284_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_282_]);
								if (i_284_ != 0) {
									int i_285_ = ((i_284_ & 0xff0000) * i_278_ & ~0xffffff);
									int i_286_ = ((i_284_ & 0xff00) * i_279_ & 0xff0000);
									int i_287_ = (i_284_ & 0xff) * i_280_ & 0xff00;
									i_284_ = (i_285_ | i_286_ | i_287_) >>> 8;
									int i_288_ = is[i_178_];
									int i_289_ = i_284_ + i_288_;
									int i_290_ = ((i_284_ & 0xff00ff) + (i_288_ & 0xff00ff));
									i_288_ = ((i_290_ & 0x1000100) + (i_289_ - i_290_ & 0x10000));
									is[i_178_++] = i_289_ - i_288_ | i_288_ - (i_288_ >>> 8);
								} else
									i_178_++;
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_277_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 3) {
						int i_291_ = i_169_;
						for (int i_292_ = -i_164_; i_292_ < 0; i_292_++) {
							int i_293_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_294_ = -i_163_; i_294_ < 0; i_294_++) {
								int i_295_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_293_]);
								int i_296_ = i_295_ + i_166_;
								int i_297_ = ((i_295_ & 0xff00ff) + (i_166_ & 0xff00ff));
								int i_298_ = ((i_297_ & 0x1000100) + (i_296_ - i_297_ & 0x10000));
								i_295_ = i_296_ - i_298_ | i_298_ - (i_298_ >>> 8);
								i_298_ = is[i_178_];
								i_296_ = i_295_ + i_298_;
								i_297_ = (i_295_ & 0xff00ff) + (i_298_ & 0xff00ff);
								i_298_ = (i_297_ & 0x1000100) + (i_296_ - i_297_ & 0x10000);
								is[i_178_++] = i_296_ - i_298_ | i_298_ - (i_298_ >>> 8);
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_291_;
							i_178_ += i_179_;
						}
					} else if (i_165_ == 2) {
						int i_299_ = i_166_ >>> 24;
						int i_300_ = 256 - i_299_;
						int i_301_ = (i_166_ & 0xff00ff) * i_300_ & ~0xff00ff;
						int i_302_ = (i_166_ & 0xff00) * i_300_ & 0xff0000;
						i_166_ = (i_301_ | i_302_) >>> 8;
						int i_303_ = i_169_;
						for (int i_304_ = -i_164_; i_304_ < 0; i_304_++) {
							int i_305_ = ((i_170_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_306_ = -i_163_; i_306_ < 0; i_306_++) {
								int i_307_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_169_ >> 16) + i_305_]);
								if (i_307_ != 0) {
									i_301_ = ((i_307_ & 0xff00ff) * i_299_ & ~0xff00ff);
									i_302_ = ((i_307_ & 0xff00) * i_299_ & 0xff0000);
									i_307_ = ((i_301_ | i_302_) >>> 8) + i_166_;
									int i_308_ = is[i_178_];
									int i_309_ = i_307_ + i_308_;
									int i_310_ = ((i_307_ & 0xff00ff) + (i_308_ & 0xff00ff));
									i_308_ = ((i_310_ & 0x1000100) + (i_309_ - i_310_ & 0x10000));
									is[i_178_++] = i_309_ - i_308_ | i_308_ - (i_308_ >>> 8);
								} else
									i_178_++;
								i_169_ += i_174_;
							}
							i_170_ += i_175_;
							i_169_ = i_303_;
							i_178_ += i_179_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method742(boolean bool, boolean bool_311_, boolean bool_312_, int i, int i_313_, float f, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, boolean bool_320_) {
		if (i_314_ > 0 && i_315_ > 0 && (bool || bool_311_)) {
			int i_321_ = 0;
			int i_322_ = 0;
			int i_323_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
			int i_324_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
			int i_325_ = (i_323_ << 16) / i_314_;
			int i_326_ = (i_324_ << 16) / i_315_;
			if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
				int i_327_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_325_ - 1) / i_325_);
				i += i_327_;
				i_321_ += i_327_ * i_325_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16);
			}
			if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
				int i_328_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_326_ - 1) / i_326_);
				i_313_ += i_328_;
				i_322_ += i_328_ * i_326_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16);
			}
			if (((Class61_Sub3_Sub2) this).anInt9358 < i_323_)
				i_314_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_321_ + i_325_ - 1) / i_325_;
			if (((Class61_Sub3_Sub2) this).anInt9325 < i_324_)
				i_315_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_322_ + i_326_ - 1) / i_326_;
			int i_329_ = i + i_313_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_330_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_314_);
			if (i_313_ + i_315_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_315_ -= (i_313_ + i_315_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_313_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_331_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_313_);
				i_315_ -= i_331_;
				i_329_ += i_331_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_322_ += i_326_ * i_331_;
			}
			if (i + i_314_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_332_ = (i + i_314_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_314_ -= i_332_;
				i_330_ += i_332_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_333_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_314_ -= i_333_;
				i_329_ += i_333_;
				i_321_ += i_325_ * i_333_;
				i_330_ += i_333_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_318_ == 0) {
				if (i_316_ == 1) {
					int i_334_ = i_321_;
					for (int i_335_ = -i_315_; i_335_ < 0; i_335_++) {
						int i_336_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_337_ = -i_314_; i_337_ < 0; i_337_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool)
									is[i_329_] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_336_]);
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_334_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 0) {
					int i_338_ = (i_317_ & 0xff0000) >> 16;
					int i_339_ = (i_317_ & 0xff00) >> 8;
					int i_340_ = i_317_ & 0xff;
					int i_341_ = i_321_;
					for (int i_342_ = -i_315_; i_342_ < 0; i_342_++) {
						int i_343_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_344_ = -i_314_; i_344_ < 0; i_344_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool) {
									int i_345_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_343_]);
									int i_346_ = ((i_345_ & 0xff0000) * i_338_ & ~0xffffff);
									int i_347_ = ((i_345_ & 0xff00) * i_339_ & 0xff0000);
									int i_348_ = (i_345_ & 0xff) * i_340_ & 0xff00;
									is[i_329_] = (i_346_ | i_347_ | i_348_) >>> 8;
								}
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_341_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 3) {
					int i_349_ = i_321_;
					for (int i_350_ = -i_315_; i_350_ < 0; i_350_++) {
						int i_351_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_352_ = -i_314_; i_352_ < 0; i_352_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool) {
									int i_353_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_351_]);
									int i_354_ = i_353_ + i_317_;
									int i_355_ = ((i_353_ & 0xff00ff) + (i_317_ & 0xff00ff));
									int i_356_ = ((i_355_ & 0x1000100) + (i_354_ - i_355_ & 0x10000));
									is[i_329_] = i_354_ - i_356_ | i_356_ - (i_356_ >>> 8);
								}
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_349_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 2) {
					int i_357_ = i_317_ >>> 24;
					int i_358_ = 256 - i_357_;
					int i_359_ = (i_317_ & 0xff00ff) * i_358_ & ~0xff00ff;
					int i_360_ = (i_317_ & 0xff00) * i_358_ & 0xff0000;
					i_317_ = (i_359_ | i_360_) >>> 8;
					int i_361_ = i_321_;
					for (int i_362_ = -i_315_; i_362_ < 0; i_362_++) {
						int i_363_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_364_ = -i_314_; i_364_ < 0; i_364_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool) {
									int i_365_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_363_]);
									i_359_ = ((i_365_ & 0xff00ff) * i_357_ & ~0xff00ff);
									i_360_ = ((i_365_ & 0xff00) * i_357_ & 0xff0000);
									is[i_329_] = ((i_359_ | i_360_) >>> 8) + i_317_;
								}
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_361_;
						i_329_ += i_330_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_318_ == 1) {
				if (i_316_ == 1) {
					int i_366_ = i_321_;
					for (int i_367_ = -i_315_; i_367_ < 0; i_367_++) {
						int i_368_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_369_ = -i_314_; i_369_ < 0; i_369_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool) {
									int i_370_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_368_]);
									int i_371_ = i_370_ >>> 24;
									int i_372_ = 256 - i_371_;
									int i_373_ = is[i_329_];
									is[i_329_] = (((((i_370_ & 0xff00ff) * i_371_ + (i_373_ & 0xff00ff) * i_372_) & ~0xff00ff) >> 8) + (((((i_370_ & ~0xff00ff) >>> 8) * i_371_) + (((i_373_ & ~0xff00ff) >>> 8) * i_372_)) & ~0xff00ff));
								}
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_366_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 0) {
					int i_374_ = i_321_;
					if ((i_317_ & 0xffffff) == 16777215) {
						for (int i_375_ = -i_315_; i_375_ < 0; i_375_++) {
							int i_376_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_377_ = -i_314_; i_377_ < 0; i_377_++) {
								if (!bool_311_ || f < fs[i_329_]) {
									if (bool) {
										int i_378_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_376_]);
										int i_379_ = ((i_378_ >>> 24) * (i_317_ >>> 24) >> 8);
										int i_380_ = 256 - i_379_;
										int i_381_ = is[i_329_];
										is[i_329_] = ((((i_378_ & 0xff00ff) * i_379_ + ((i_381_ & 0xff00ff) * i_380_)) & ~0xff00ff) + (((i_378_ & 0xff00) * i_379_ + ((i_381_ & 0xff00) * i_380_)) & 0xff0000)) >> 8;
									}
									if (bool_311_ && bool_320_)
										fs[i_329_] = f;
								}
								i_321_ += i_325_;
								i_329_++;
							}
							i_322_ += i_326_;
							i_321_ = i_374_;
							i_329_ += i_330_;
						}
					} else {
						int i_382_ = (i_317_ & 0xff0000) >> 16;
						int i_383_ = (i_317_ & 0xff00) >> 8;
						int i_384_ = i_317_ & 0xff;
						for (int i_385_ = -i_315_; i_385_ < 0; i_385_++) {
							int i_386_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_387_ = -i_314_; i_387_ < 0; i_387_++) {
								if (!bool_311_ || f < fs[i_329_]) {
									int i_388_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_386_]);
									int i_389_ = ((i_388_ >>> 24) * (i_317_ >>> 24) >> 8);
									int i_390_ = 256 - i_389_;
									if (i_389_ != 255) {
										if (bool) {
											int i_391_ = ((i_388_ & 0xff0000) * i_382_ & ~0xffffff);
											int i_392_ = ((i_388_ & 0xff00) * i_383_ & 0xff0000);
											int i_393_ = ((i_388_ & 0xff) * i_384_ & 0xff00);
											i_388_ = (i_391_ | i_392_ | i_393_) >>> 8;
											int i_394_ = is[i_329_];
											is[i_329_] = (((((i_388_ & 0xff00ff) * i_389_) + ((i_394_ & 0xff00ff) * i_390_)) & ~0xff00ff) + ((((i_388_ & 0xff00) * i_389_) + ((i_394_ & 0xff00) * i_390_)) & 0xff0000)) >> 8;
											if (bool_312_) {
												int i_395_ = (i_394_ >>> 24) + i_389_;
												if (i_395_ > 255)
													i_395_ = 255;
												is[i_329_] |= i_395_ << 24;
											}
										}
										if (bool_311_ && bool_320_)
											fs[i_329_] = f;
									} else {
										if (bool) {
											int i_396_ = ((i_388_ & 0xff0000) * i_382_ & ~0xffffff);
											int i_397_ = ((i_388_ & 0xff00) * i_383_ & 0xff0000);
											int i_398_ = ((i_388_ & 0xff) * i_384_ & 0xff00);
											is[i_329_] = (i_396_ | i_397_ | i_398_) >>> 8;
										}
										if (bool_311_ && bool_320_)
											fs[i_329_] = f;
									}
								}
								i_321_ += i_325_;
								i_329_++;
							}
							i_322_ += i_326_;
							i_321_ = i_374_;
							i_329_ += i_330_;
						}
					}
				} else if (i_316_ == 3) {
					int i_399_ = i_321_;
					for (int i_400_ = -i_315_; i_400_ < 0; i_400_++) {
						int i_401_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_402_ = -i_314_; i_402_ < 0; i_402_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool) {
									int i_403_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_401_]);
									int i_404_ = i_403_ + i_317_;
									int i_405_ = ((i_403_ & 0xff00ff) + (i_317_ & 0xff00ff));
									int i_406_ = ((i_405_ & 0x1000100) + (i_404_ - i_405_ & 0x10000));
									i_406_ = i_404_ - i_406_ | i_406_ - (i_406_ >>> 8);
									int i_407_ = ((i_406_ >>> 24) * (i_317_ >>> 24) >> 8);
									int i_408_ = 256 - i_407_;
									if (i_407_ != 255) {
										i_403_ = i_406_;
										i_406_ = is[i_329_];
										i_406_ = ((((i_403_ & 0xff00ff) * i_407_ + ((i_406_ & 0xff00ff) * i_408_)) & ~0xff00ff) + (((i_403_ & 0xff00) * i_407_ + ((i_406_ & 0xff00) * i_408_)) & 0xff0000)) >> 8;
									}
									is[i_329_] = i_406_;
								}
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_399_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 2) {
					int i_409_ = i_317_ >>> 24;
					int i_410_ = 256 - i_409_;
					int i_411_ = (i_317_ & 0xff00ff) * i_410_ & ~0xff00ff;
					int i_412_ = (i_317_ & 0xff00) * i_410_ & 0xff0000;
					i_317_ = (i_411_ | i_412_) >>> 8;
					int i_413_ = i_321_;
					for (int i_414_ = -i_315_; i_414_ < 0; i_414_++) {
						int i_415_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_416_ = -i_314_; i_416_ < 0; i_416_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool) {
									int i_417_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_415_]);
									int i_418_ = i_417_ >>> 24;
									int i_419_ = 256 - i_418_;
									i_411_ = ((i_417_ & 0xff00ff) * i_409_ & ~0xff00ff);
									i_412_ = ((i_417_ & 0xff00) * i_409_ & 0xff0000);
									i_417_ = ((i_411_ | i_412_) >>> 8) + i_317_;
									int i_420_ = is[i_329_];
									is[i_329_] = ((((i_417_ & 0xff00ff) * i_418_ + (i_420_ & 0xff00ff) * i_419_) & ~0xff00ff) + (((i_417_ & 0xff00) * i_418_ + (i_420_ & 0xff00) * i_419_) & 0xff0000)) >> 8;
								}
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_413_;
						i_329_ += i_330_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_318_ == 2) {
				if (i_316_ == 1) {
					int i_421_ = i_321_;
					for (int i_422_ = -i_315_; i_422_ < 0; i_422_++) {
						int i_423_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_424_ = -i_314_; i_424_ < 0; i_424_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								int i_425_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_423_]);
								if (i_425_ != 0) {
									if (bool) {
										int i_426_ = is[i_329_];
										int i_427_ = i_425_ + i_426_;
										int i_428_ = ((i_425_ & 0xff00ff) + (i_426_ & 0xff00ff));
										i_426_ = ((i_428_ & 0x1000100) + (i_427_ - i_428_ & 0x10000));
										is[i_329_] = (i_427_ - i_426_ | i_426_ - (i_426_ >>> 8));
									}
									if (bool_311_ && bool_320_)
										fs[i_329_] = f;
								}
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_421_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 0) {
					int i_429_ = i_321_;
					int i_430_ = (i_317_ & 0xff0000) >> 16;
					int i_431_ = (i_317_ & 0xff00) >> 8;
					int i_432_ = i_317_ & 0xff;
					for (int i_433_ = -i_315_; i_433_ < 0; i_433_++) {
						int i_434_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_435_ = -i_314_; i_435_ < 0; i_435_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								int i_436_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_434_]);
								if (i_436_ != 0) {
									if (bool) {
										int i_437_ = ((i_436_ & 0xff0000) * i_430_ & ~0xffffff);
										int i_438_ = ((i_436_ & 0xff00) * i_431_ & 0xff0000);
										int i_439_ = ((i_436_ & 0xff) * i_432_ & 0xff00);
										i_436_ = (i_437_ | i_438_ | i_439_) >>> 8;
										int i_440_ = is[i_329_];
										int i_441_ = i_436_ + i_440_;
										int i_442_ = ((i_436_ & 0xff00ff) + (i_440_ & 0xff00ff));
										i_440_ = ((i_442_ & 0x1000100) + (i_441_ - i_442_ & 0x10000));
										is[i_329_] = (i_441_ - i_440_ | i_440_ - (i_440_ >>> 8));
									}
									if (bool_311_ && bool_320_)
										fs[i_329_] = f;
								}
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_429_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 3) {
					int i_443_ = i_321_;
					for (int i_444_ = -i_315_; i_444_ < 0; i_444_++) {
						int i_445_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_446_ = -i_314_; i_446_ < 0; i_446_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								if (bool) {
									int i_447_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_445_]);
									int i_448_ = i_447_ + i_317_;
									int i_449_ = ((i_447_ & 0xff00ff) + (i_317_ & 0xff00ff));
									int i_450_ = ((i_449_ & 0x1000100) + (i_448_ - i_449_ & 0x10000));
									i_447_ = i_448_ - i_450_ | i_450_ - (i_450_ >>> 8);
									i_450_ = is[i_329_];
									i_448_ = i_447_ + i_450_;
									i_449_ = (i_447_ & 0xff00ff) + (i_450_ & 0xff00ff);
									i_450_ = ((i_449_ & 0x1000100) + (i_448_ - i_449_ & 0x10000));
									is[i_329_] = i_448_ - i_450_ | i_450_ - (i_450_ >>> 8);
								}
								if (bool_311_ && bool_320_)
									fs[i_329_] = f;
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_443_;
						i_329_ += i_330_;
					}
				} else if (i_316_ == 2) {
					int i_451_ = i_317_ >>> 24;
					int i_452_ = 256 - i_451_;
					int i_453_ = (i_317_ & 0xff00ff) * i_452_ & ~0xff00ff;
					int i_454_ = (i_317_ & 0xff00) * i_452_ & 0xff0000;
					i_317_ = (i_453_ | i_454_) >>> 8;
					int i_455_ = i_321_;
					for (int i_456_ = -i_315_; i_456_ < 0; i_456_++) {
						int i_457_ = ((i_322_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_458_ = -i_314_; i_458_ < 0; i_458_++) {
							if (!bool_311_ || f < fs[i_329_]) {
								int i_459_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_321_ >> 16) + i_457_]);
								if (i_459_ != 0) {
									if (bool) {
										i_453_ = ((i_459_ & 0xff00ff) * i_451_ & ~0xff00ff);
										i_454_ = ((i_459_ & 0xff00) * i_451_ & 0xff0000);
										i_459_ = (((i_453_ | i_454_) >>> 8) + i_317_);
										int i_460_ = is[i_329_];
										int i_461_ = i_459_ + i_460_;
										int i_462_ = ((i_459_ & 0xff00ff) + (i_460_ & 0xff00ff));
										i_460_ = ((i_462_ & 0x1000100) + (i_461_ - i_462_ & 0x10000));
										is[i_329_] = (i_461_ - i_460_ | i_460_ - (i_460_ >>> 8));
									}
									if (bool_311_ && bool_320_)
										fs[i_329_] = f;
								}
							}
							i_321_ += i_325_;
							i_329_++;
						}
						i_322_ += i_326_;
						i_321_ = i_455_;
						i_329_ += i_330_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method744(boolean bool, boolean bool_463_, boolean bool_464_, int i, int i_465_, float f, int i_466_, int i_467_, int i_468_, int i_469_, int i_470_, int i_471_, boolean bool_472_) {
		if (i_466_ > 0 && i_467_ > 0 && (bool || bool_463_)) {
			int i_473_ = 0;
			int i_474_ = 0;
			int i_475_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
			int i_476_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
			int i_477_ = (i_475_ << 16) / i_466_;
			int i_478_ = (i_476_ << 16) / i_467_;
			if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
				int i_479_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_477_ - 1) / i_477_);
				i += i_479_;
				i_473_ += i_479_ * i_477_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16);
			}
			if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
				int i_480_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_478_ - 1) / i_478_);
				i_465_ += i_480_;
				i_474_ += i_480_ * i_478_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16);
			}
			if (((Class61_Sub3_Sub2) this).anInt9358 < i_475_)
				i_466_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_473_ + i_477_ - 1) / i_477_;
			if (((Class61_Sub3_Sub2) this).anInt9325 < i_476_)
				i_467_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_474_ + i_478_ - 1) / i_478_;
			int i_481_ = i + i_465_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_482_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_466_);
			if (i_465_ + i_467_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_467_ -= (i_465_ + i_467_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_465_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_483_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_465_);
				i_467_ -= i_483_;
				i_481_ += i_483_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_474_ += i_478_ * i_483_;
			}
			if (i + i_466_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_484_ = (i + i_466_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_466_ -= i_484_;
				i_482_ += i_484_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_485_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_466_ -= i_485_;
				i_481_ += i_485_;
				i_473_ += i_477_ * i_485_;
				i_482_ += i_485_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_470_ == 0) {
				if (i_468_ == 1) {
					int i_486_ = i_473_;
					for (int i_487_ = -i_467_; i_487_ < 0; i_487_++) {
						int i_488_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_489_ = -i_466_; i_489_ < 0; i_489_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool)
									is[i_481_] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_488_]);
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_486_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 0) {
					int i_490_ = (i_469_ & 0xff0000) >> 16;
					int i_491_ = (i_469_ & 0xff00) >> 8;
					int i_492_ = i_469_ & 0xff;
					int i_493_ = i_473_;
					for (int i_494_ = -i_467_; i_494_ < 0; i_494_++) {
						int i_495_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_496_ = -i_466_; i_496_ < 0; i_496_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool) {
									int i_497_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_495_]);
									int i_498_ = ((i_497_ & 0xff0000) * i_490_ & ~0xffffff);
									int i_499_ = ((i_497_ & 0xff00) * i_491_ & 0xff0000);
									int i_500_ = (i_497_ & 0xff) * i_492_ & 0xff00;
									is[i_481_] = (i_498_ | i_499_ | i_500_) >>> 8;
								}
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_493_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 3) {
					int i_501_ = i_473_;
					for (int i_502_ = -i_467_; i_502_ < 0; i_502_++) {
						int i_503_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_504_ = -i_466_; i_504_ < 0; i_504_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool) {
									int i_505_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_503_]);
									int i_506_ = i_505_ + i_469_;
									int i_507_ = ((i_505_ & 0xff00ff) + (i_469_ & 0xff00ff));
									int i_508_ = ((i_507_ & 0x1000100) + (i_506_ - i_507_ & 0x10000));
									is[i_481_] = i_506_ - i_508_ | i_508_ - (i_508_ >>> 8);
								}
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_501_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 2) {
					int i_509_ = i_469_ >>> 24;
					int i_510_ = 256 - i_509_;
					int i_511_ = (i_469_ & 0xff00ff) * i_510_ & ~0xff00ff;
					int i_512_ = (i_469_ & 0xff00) * i_510_ & 0xff0000;
					i_469_ = (i_511_ | i_512_) >>> 8;
					int i_513_ = i_473_;
					for (int i_514_ = -i_467_; i_514_ < 0; i_514_++) {
						int i_515_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_516_ = -i_466_; i_516_ < 0; i_516_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool) {
									int i_517_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_515_]);
									i_511_ = ((i_517_ & 0xff00ff) * i_509_ & ~0xff00ff);
									i_512_ = ((i_517_ & 0xff00) * i_509_ & 0xff0000);
									is[i_481_] = ((i_511_ | i_512_) >>> 8) + i_469_;
								}
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_513_;
						i_481_ += i_482_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_470_ == 1) {
				if (i_468_ == 1) {
					int i_518_ = i_473_;
					for (int i_519_ = -i_467_; i_519_ < 0; i_519_++) {
						int i_520_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_521_ = -i_466_; i_521_ < 0; i_521_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool) {
									int i_522_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_520_]);
									int i_523_ = i_522_ >>> 24;
									int i_524_ = 256 - i_523_;
									int i_525_ = is[i_481_];
									is[i_481_] = (((((i_522_ & 0xff00ff) * i_523_ + (i_525_ & 0xff00ff) * i_524_) & ~0xff00ff) >> 8) + (((((i_522_ & ~0xff00ff) >>> 8) * i_523_) + (((i_525_ & ~0xff00ff) >>> 8) * i_524_)) & ~0xff00ff));
								}
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_518_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 0) {
					int i_526_ = i_473_;
					if ((i_469_ & 0xffffff) == 16777215) {
						for (int i_527_ = -i_467_; i_527_ < 0; i_527_++) {
							int i_528_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_529_ = -i_466_; i_529_ < 0; i_529_++) {
								if (!bool_463_ || f < fs[i_481_]) {
									if (bool) {
										int i_530_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_528_]);
										int i_531_ = ((i_530_ >>> 24) * (i_469_ >>> 24) >> 8);
										int i_532_ = 256 - i_531_;
										int i_533_ = is[i_481_];
										is[i_481_] = ((((i_530_ & 0xff00ff) * i_531_ + ((i_533_ & 0xff00ff) * i_532_)) & ~0xff00ff) + (((i_530_ & 0xff00) * i_531_ + ((i_533_ & 0xff00) * i_532_)) & 0xff0000)) >> 8;
									}
									if (bool_463_ && bool_472_)
										fs[i_481_] = f;
								}
								i_473_ += i_477_;
								i_481_++;
							}
							i_474_ += i_478_;
							i_473_ = i_526_;
							i_481_ += i_482_;
						}
					} else {
						int i_534_ = (i_469_ & 0xff0000) >> 16;
						int i_535_ = (i_469_ & 0xff00) >> 8;
						int i_536_ = i_469_ & 0xff;
						for (int i_537_ = -i_467_; i_537_ < 0; i_537_++) {
							int i_538_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_539_ = -i_466_; i_539_ < 0; i_539_++) {
								if (!bool_463_ || f < fs[i_481_]) {
									int i_540_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_538_]);
									int i_541_ = ((i_540_ >>> 24) * (i_469_ >>> 24) >> 8);
									int i_542_ = 256 - i_541_;
									if (i_541_ != 255) {
										if (bool) {
											int i_543_ = ((i_540_ & 0xff0000) * i_534_ & ~0xffffff);
											int i_544_ = ((i_540_ & 0xff00) * i_535_ & 0xff0000);
											int i_545_ = ((i_540_ & 0xff) * i_536_ & 0xff00);
											i_540_ = (i_543_ | i_544_ | i_545_) >>> 8;
											int i_546_ = is[i_481_];
											is[i_481_] = (((((i_540_ & 0xff00ff) * i_541_) + ((i_546_ & 0xff00ff) * i_542_)) & ~0xff00ff) + ((((i_540_ & 0xff00) * i_541_) + ((i_546_ & 0xff00) * i_542_)) & 0xff0000)) >> 8;
											if (bool_464_) {
												int i_547_ = (i_546_ >>> 24) + i_541_;
												if (i_547_ > 255)
													i_547_ = 255;
												is[i_481_] |= i_547_ << 24;
											}
										}
										if (bool_463_ && bool_472_)
											fs[i_481_] = f;
									} else {
										if (bool) {
											int i_548_ = ((i_540_ & 0xff0000) * i_534_ & ~0xffffff);
											int i_549_ = ((i_540_ & 0xff00) * i_535_ & 0xff0000);
											int i_550_ = ((i_540_ & 0xff) * i_536_ & 0xff00);
											is[i_481_] = (i_548_ | i_549_ | i_550_) >>> 8;
										}
										if (bool_463_ && bool_472_)
											fs[i_481_] = f;
									}
								}
								i_473_ += i_477_;
								i_481_++;
							}
							i_474_ += i_478_;
							i_473_ = i_526_;
							i_481_ += i_482_;
						}
					}
				} else if (i_468_ == 3) {
					int i_551_ = i_473_;
					for (int i_552_ = -i_467_; i_552_ < 0; i_552_++) {
						int i_553_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_554_ = -i_466_; i_554_ < 0; i_554_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool) {
									int i_555_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_553_]);
									int i_556_ = i_555_ + i_469_;
									int i_557_ = ((i_555_ & 0xff00ff) + (i_469_ & 0xff00ff));
									int i_558_ = ((i_557_ & 0x1000100) + (i_556_ - i_557_ & 0x10000));
									i_558_ = i_556_ - i_558_ | i_558_ - (i_558_ >>> 8);
									int i_559_ = ((i_558_ >>> 24) * (i_469_ >>> 24) >> 8);
									int i_560_ = 256 - i_559_;
									if (i_559_ != 255) {
										i_555_ = i_558_;
										i_558_ = is[i_481_];
										i_558_ = ((((i_555_ & 0xff00ff) * i_559_ + ((i_558_ & 0xff00ff) * i_560_)) & ~0xff00ff) + (((i_555_ & 0xff00) * i_559_ + ((i_558_ & 0xff00) * i_560_)) & 0xff0000)) >> 8;
									}
									is[i_481_] = i_558_;
								}
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_551_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 2) {
					int i_561_ = i_469_ >>> 24;
					int i_562_ = 256 - i_561_;
					int i_563_ = (i_469_ & 0xff00ff) * i_562_ & ~0xff00ff;
					int i_564_ = (i_469_ & 0xff00) * i_562_ & 0xff0000;
					i_469_ = (i_563_ | i_564_) >>> 8;
					int i_565_ = i_473_;
					for (int i_566_ = -i_467_; i_566_ < 0; i_566_++) {
						int i_567_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_568_ = -i_466_; i_568_ < 0; i_568_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool) {
									int i_569_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_567_]);
									int i_570_ = i_569_ >>> 24;
									int i_571_ = 256 - i_570_;
									i_563_ = ((i_569_ & 0xff00ff) * i_561_ & ~0xff00ff);
									i_564_ = ((i_569_ & 0xff00) * i_561_ & 0xff0000);
									i_569_ = ((i_563_ | i_564_) >>> 8) + i_469_;
									int i_572_ = is[i_481_];
									is[i_481_] = ((((i_569_ & 0xff00ff) * i_570_ + (i_572_ & 0xff00ff) * i_571_) & ~0xff00ff) + (((i_569_ & 0xff00) * i_570_ + (i_572_ & 0xff00) * i_571_) & 0xff0000)) >> 8;
								}
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_565_;
						i_481_ += i_482_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_470_ == 2) {
				if (i_468_ == 1) {
					int i_573_ = i_473_;
					for (int i_574_ = -i_467_; i_574_ < 0; i_574_++) {
						int i_575_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_576_ = -i_466_; i_576_ < 0; i_576_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								int i_577_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_575_]);
								if (i_577_ != 0) {
									if (bool) {
										int i_578_ = is[i_481_];
										int i_579_ = i_577_ + i_578_;
										int i_580_ = ((i_577_ & 0xff00ff) + (i_578_ & 0xff00ff));
										i_578_ = ((i_580_ & 0x1000100) + (i_579_ - i_580_ & 0x10000));
										is[i_481_] = (i_579_ - i_578_ | i_578_ - (i_578_ >>> 8));
									}
									if (bool_463_ && bool_472_)
										fs[i_481_] = f;
								}
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_573_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 0) {
					int i_581_ = i_473_;
					int i_582_ = (i_469_ & 0xff0000) >> 16;
					int i_583_ = (i_469_ & 0xff00) >> 8;
					int i_584_ = i_469_ & 0xff;
					for (int i_585_ = -i_467_; i_585_ < 0; i_585_++) {
						int i_586_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_587_ = -i_466_; i_587_ < 0; i_587_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								int i_588_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_586_]);
								if (i_588_ != 0) {
									if (bool) {
										int i_589_ = ((i_588_ & 0xff0000) * i_582_ & ~0xffffff);
										int i_590_ = ((i_588_ & 0xff00) * i_583_ & 0xff0000);
										int i_591_ = ((i_588_ & 0xff) * i_584_ & 0xff00);
										i_588_ = (i_589_ | i_590_ | i_591_) >>> 8;
										int i_592_ = is[i_481_];
										int i_593_ = i_588_ + i_592_;
										int i_594_ = ((i_588_ & 0xff00ff) + (i_592_ & 0xff00ff));
										i_592_ = ((i_594_ & 0x1000100) + (i_593_ - i_594_ & 0x10000));
										is[i_481_] = (i_593_ - i_592_ | i_592_ - (i_592_ >>> 8));
									}
									if (bool_463_ && bool_472_)
										fs[i_481_] = f;
								}
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_581_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 3) {
					int i_595_ = i_473_;
					for (int i_596_ = -i_467_; i_596_ < 0; i_596_++) {
						int i_597_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_598_ = -i_466_; i_598_ < 0; i_598_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								if (bool) {
									int i_599_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_597_]);
									int i_600_ = i_599_ + i_469_;
									int i_601_ = ((i_599_ & 0xff00ff) + (i_469_ & 0xff00ff));
									int i_602_ = ((i_601_ & 0x1000100) + (i_600_ - i_601_ & 0x10000));
									i_599_ = i_600_ - i_602_ | i_602_ - (i_602_ >>> 8);
									i_602_ = is[i_481_];
									i_600_ = i_599_ + i_602_;
									i_601_ = (i_599_ & 0xff00ff) + (i_602_ & 0xff00ff);
									i_602_ = ((i_601_ & 0x1000100) + (i_600_ - i_601_ & 0x10000));
									is[i_481_] = i_600_ - i_602_ | i_602_ - (i_602_ >>> 8);
								}
								if (bool_463_ && bool_472_)
									fs[i_481_] = f;
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_595_;
						i_481_ += i_482_;
					}
				} else if (i_468_ == 2) {
					int i_603_ = i_469_ >>> 24;
					int i_604_ = 256 - i_603_;
					int i_605_ = (i_469_ & 0xff00ff) * i_604_ & ~0xff00ff;
					int i_606_ = (i_469_ & 0xff00) * i_604_ & 0xff0000;
					i_469_ = (i_605_ | i_606_) >>> 8;
					int i_607_ = i_473_;
					for (int i_608_ = -i_467_; i_608_ < 0; i_608_++) {
						int i_609_ = ((i_474_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_610_ = -i_466_; i_610_ < 0; i_610_++) {
							if (!bool_463_ || f < fs[i_481_]) {
								int i_611_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_473_ >> 16) + i_609_]);
								if (i_611_ != 0) {
									if (bool) {
										i_605_ = ((i_611_ & 0xff00ff) * i_603_ & ~0xff00ff);
										i_606_ = ((i_611_ & 0xff00) * i_603_ & 0xff0000);
										i_611_ = (((i_605_ | i_606_) >>> 8) + i_469_);
										int i_612_ = is[i_481_];
										int i_613_ = i_611_ + i_612_;
										int i_614_ = ((i_611_ & 0xff00ff) + (i_612_ & 0xff00ff));
										i_612_ = ((i_614_ & 0x1000100) + (i_613_ - i_614_ & 0x10000));
										is[i_481_] = (i_613_ - i_612_ | i_612_ - (i_612_ >>> 8));
									}
									if (bool_463_ && bool_472_)
										fs[i_481_] = f;
								}
							}
							i_473_ += i_477_;
							i_481_++;
						}
						i_474_ += i_478_;
						i_473_ = i_607_;
						i_481_ += i_482_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method710(int i, int i_615_, int i_616_, int i_617_, int i_618_, int i_619_, int i_620_, int i_621_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_616_ > 0 && i_617_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_622_ = 0;
				int i_623_ = 0;
				int i_624_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_625_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
				int i_626_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
				int i_627_ = (i_625_ << 16) / i_616_;
				int i_628_ = (i_626_ << 16) / i_617_;
				if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
					int i_629_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_627_ - 1) / i_627_);
					i += i_629_;
					i_622_ += (i_629_ * i_627_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
					int i_630_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_628_ - 1) / i_628_);
					i_615_ += i_630_;
					i_623_ += (i_630_ * i_628_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9358 < i_625_)
					i_616_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_622_ + i_627_ - 1) / i_627_;
				if (((Class61_Sub3_Sub2) this).anInt9325 < i_626_)
					i_617_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_623_ + i_628_ - 1) / i_628_;
				int i_631_ = i + i_615_ * i_624_;
				int i_632_ = i_624_ - i_616_;
				if (i_615_ + i_617_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_617_ -= (i_615_ + i_617_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_615_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_633_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_615_);
					i_617_ -= i_633_;
					i_631_ += i_633_ * i_624_;
					i_623_ += i_628_ * i_633_;
				}
				if (i + i_616_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_634_ = (i + i_616_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_616_ -= i_634_;
					i_632_ += i_634_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_635_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
					i_616_ -= i_635_;
					i_631_ += i_635_;
					i_622_ += i_627_ * i_635_;
					i_632_ += i_635_;
				}
				if (i_620_ == 0) {
					if (i_618_ == 1) {
						int i_636_ = i_622_;
						for (int i_637_ = -i_617_; i_637_ < 0; i_637_++) {
							int i_638_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_639_ = -i_616_; i_639_ < 0; i_639_++) {
								is[i_631_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_638_]);
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_636_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 0) {
						int i_640_ = (i_619_ & 0xff0000) >> 16;
						int i_641_ = (i_619_ & 0xff00) >> 8;
						int i_642_ = i_619_ & 0xff;
						int i_643_ = i_622_;
						for (int i_644_ = -i_617_; i_644_ < 0; i_644_++) {
							int i_645_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_646_ = -i_616_; i_646_ < 0; i_646_++) {
								int i_647_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_645_]);
								int i_648_ = (i_647_ & 0xff0000) * i_640_ & ~0xffffff;
								int i_649_ = (i_647_ & 0xff00) * i_641_ & 0xff0000;
								int i_650_ = (i_647_ & 0xff) * i_642_ & 0xff00;
								is[i_631_++] = (i_648_ | i_649_ | i_650_) >>> 8;
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_643_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 3) {
						int i_651_ = i_622_;
						for (int i_652_ = -i_617_; i_652_ < 0; i_652_++) {
							int i_653_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_654_ = -i_616_; i_654_ < 0; i_654_++) {
								int i_655_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_653_]);
								int i_656_ = i_655_ + i_619_;
								int i_657_ = ((i_655_ & 0xff00ff) + (i_619_ & 0xff00ff));
								int i_658_ = ((i_657_ & 0x1000100) + (i_656_ - i_657_ & 0x10000));
								is[i_631_++] = i_656_ - i_658_ | i_658_ - (i_658_ >>> 8);
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_651_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 2) {
						int i_659_ = i_619_ >>> 24;
						int i_660_ = 256 - i_659_;
						int i_661_ = (i_619_ & 0xff00ff) * i_660_ & ~0xff00ff;
						int i_662_ = (i_619_ & 0xff00) * i_660_ & 0xff0000;
						i_619_ = (i_661_ | i_662_) >>> 8;
						int i_663_ = i_622_;
						for (int i_664_ = -i_617_; i_664_ < 0; i_664_++) {
							int i_665_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_666_ = -i_616_; i_666_ < 0; i_666_++) {
								int i_667_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_665_]);
								i_661_ = (i_667_ & 0xff00ff) * i_659_ & ~0xff00ff;
								i_662_ = (i_667_ & 0xff00) * i_659_ & 0xff0000;
								is[i_631_++] = ((i_661_ | i_662_) >>> 8) + i_619_;
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_663_;
							i_631_ += i_632_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_620_ == 1) {
					if (i_618_ == 1) {
						int i_668_ = i_622_;
						for (int i_669_ = -i_617_; i_669_ < 0; i_669_++) {
							int i_670_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_671_ = -i_616_; i_671_ < 0; i_671_++) {
								int i_672_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_670_]);
								int i_673_ = i_672_ >>> 24;
								int i_674_ = 256 - i_673_;
								int i_675_ = is[i_631_];
								is[i_631_++] = (((((i_672_ & 0xff00ff) * i_673_ + (i_675_ & 0xff00ff) * i_674_) & ~0xff00ff) >> 8) + (((((i_672_ & ~0xff00ff) >>> 8) * i_673_) + (((i_675_ & ~0xff00ff) >>> 8) * i_674_)) & ~0xff00ff));
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_668_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 0) {
						int i_676_ = i_622_;
						if ((i_619_ & 0xffffff) == 16777215) {
							for (int i_677_ = -i_617_; i_677_ < 0; i_677_++) {
								int i_678_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_679_ = -i_616_; i_679_ < 0; i_679_++) {
									int i_680_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_678_]);
									int i_681_ = ((i_680_ >>> 24) * (i_619_ >>> 24) >> 8);
									int i_682_ = 256 - i_681_;
									int i_683_ = is[i_631_];
									is[i_631_++] = ((((i_680_ & 0xff00ff) * i_681_ + (i_683_ & 0xff00ff) * i_682_) & ~0xff00ff) + (((i_680_ & 0xff00) * i_681_ + (i_683_ & 0xff00) * i_682_) & 0xff0000)) >> 8;
									i_622_ += i_627_;
								}
								i_623_ += i_628_;
								i_622_ = i_676_;
								i_631_ += i_632_;
							}
						} else {
							int i_684_ = (i_619_ & 0xff0000) >> 16;
							int i_685_ = (i_619_ & 0xff00) >> 8;
							int i_686_ = i_619_ & 0xff;
							for (int i_687_ = -i_617_; i_687_ < 0; i_687_++) {
								int i_688_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_689_ = -i_616_; i_689_ < 0; i_689_++) {
									int i_690_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_688_]);
									int i_691_ = ((i_690_ >>> 24) * (i_619_ >>> 24) >> 8);
									int i_692_ = 256 - i_691_;
									if (i_691_ != 255) {
										int i_693_ = ((i_690_ & 0xff0000) * i_684_ & ~0xffffff);
										int i_694_ = ((i_690_ & 0xff00) * i_685_ & 0xff0000);
										int i_695_ = ((i_690_ & 0xff) * i_686_ & 0xff00);
										i_690_ = (i_693_ | i_694_ | i_695_) >>> 8;
										int i_696_ = is[i_631_];
										is[i_631_++] = ((((i_690_ & 0xff00ff) * i_691_ + ((i_696_ & 0xff00ff) * i_692_)) & ~0xff00ff) + (((i_690_ & 0xff00) * i_691_ + ((i_696_ & 0xff00) * i_692_)) & 0xff0000)) >> 8;
									} else {
										int i_697_ = ((i_690_ & 0xff0000) * i_684_ & ~0xffffff);
										int i_698_ = ((i_690_ & 0xff00) * i_685_ & 0xff0000);
										int i_699_ = ((i_690_ & 0xff) * i_686_ & 0xff00);
										is[i_631_++] = (i_697_ | i_698_ | i_699_) >>> 8;
									}
									i_622_ += i_627_;
								}
								i_623_ += i_628_;
								i_622_ = i_676_;
								i_631_ += i_632_;
							}
						}
					} else if (i_618_ == 3) {
						int i_700_ = i_622_;
						for (int i_701_ = -i_617_; i_701_ < 0; i_701_++) {
							int i_702_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_703_ = -i_616_; i_703_ < 0; i_703_++) {
								int i_704_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_702_]);
								int i_705_ = i_704_ + i_619_;
								int i_706_ = ((i_704_ & 0xff00ff) + (i_619_ & 0xff00ff));
								int i_707_ = ((i_706_ & 0x1000100) + (i_705_ - i_706_ & 0x10000));
								i_707_ = i_705_ - i_707_ | i_707_ - (i_707_ >>> 8);
								int i_708_ = (i_707_ >>> 24) * (i_619_ >>> 24) >> 8;
								int i_709_ = 256 - i_708_;
								if (i_708_ != 255) {
									i_704_ = i_707_;
									i_707_ = is[i_631_];
									i_707_ = ((((i_704_ & 0xff00ff) * i_708_ + (i_707_ & 0xff00ff) * i_709_) & ~0xff00ff) + (((i_704_ & 0xff00) * i_708_ + (i_707_ & 0xff00) * i_709_) & 0xff0000)) >> 8;
								}
								is[i_631_++] = i_707_;
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_700_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 2) {
						int i_710_ = i_619_ >>> 24;
						int i_711_ = 256 - i_710_;
						int i_712_ = (i_619_ & 0xff00ff) * i_711_ & ~0xff00ff;
						int i_713_ = (i_619_ & 0xff00) * i_711_ & 0xff0000;
						i_619_ = (i_712_ | i_713_) >>> 8;
						int i_714_ = i_622_;
						for (int i_715_ = -i_617_; i_715_ < 0; i_715_++) {
							int i_716_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_717_ = -i_616_; i_717_ < 0; i_717_++) {
								int i_718_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_716_]);
								int i_719_ = i_718_ >>> 24;
								int i_720_ = 256 - i_719_;
								i_712_ = (i_718_ & 0xff00ff) * i_710_ & ~0xff00ff;
								i_713_ = (i_718_ & 0xff00) * i_710_ & 0xff0000;
								i_718_ = ((i_712_ | i_713_) >>> 8) + i_619_;
								int i_721_ = is[i_631_];
								is[i_631_++] = ((((i_718_ & 0xff00ff) * i_719_ + (i_721_ & 0xff00ff) * i_720_) & ~0xff00ff) + (((i_718_ & 0xff00) * i_719_ + (i_721_ & 0xff00) * i_720_) & 0xff0000)) >> 8;
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_714_;
							i_631_ += i_632_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_620_ == 2) {
					if (i_618_ == 1) {
						int i_722_ = i_622_;
						for (int i_723_ = -i_617_; i_723_ < 0; i_723_++) {
							int i_724_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_725_ = -i_616_; i_725_ < 0; i_725_++) {
								int i_726_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_724_]);
								if (i_726_ != 0) {
									int i_727_ = is[i_631_];
									int i_728_ = i_726_ + i_727_;
									int i_729_ = ((i_726_ & 0xff00ff) + (i_727_ & 0xff00ff));
									i_727_ = ((i_729_ & 0x1000100) + (i_728_ - i_729_ & 0x10000));
									is[i_631_++] = i_728_ - i_727_ | i_727_ - (i_727_ >>> 8);
								} else
									i_631_++;
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_722_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 0) {
						int i_730_ = i_622_;
						int i_731_ = (i_619_ & 0xff0000) >> 16;
						int i_732_ = (i_619_ & 0xff00) >> 8;
						int i_733_ = i_619_ & 0xff;
						for (int i_734_ = -i_617_; i_734_ < 0; i_734_++) {
							int i_735_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_736_ = -i_616_; i_736_ < 0; i_736_++) {
								int i_737_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_735_]);
								if (i_737_ != 0) {
									int i_738_ = ((i_737_ & 0xff0000) * i_731_ & ~0xffffff);
									int i_739_ = ((i_737_ & 0xff00) * i_732_ & 0xff0000);
									int i_740_ = (i_737_ & 0xff) * i_733_ & 0xff00;
									i_737_ = (i_738_ | i_739_ | i_740_) >>> 8;
									int i_741_ = is[i_631_];
									int i_742_ = i_737_ + i_741_;
									int i_743_ = ((i_737_ & 0xff00ff) + (i_741_ & 0xff00ff));
									i_741_ = ((i_743_ & 0x1000100) + (i_742_ - i_743_ & 0x10000));
									is[i_631_++] = i_742_ - i_741_ | i_741_ - (i_741_ >>> 8);
								} else
									i_631_++;
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_730_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 3) {
						int i_744_ = i_622_;
						for (int i_745_ = -i_617_; i_745_ < 0; i_745_++) {
							int i_746_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_747_ = -i_616_; i_747_ < 0; i_747_++) {
								int i_748_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_746_]);
								int i_749_ = i_748_ + i_619_;
								int i_750_ = ((i_748_ & 0xff00ff) + (i_619_ & 0xff00ff));
								int i_751_ = ((i_750_ & 0x1000100) + (i_749_ - i_750_ & 0x10000));
								i_748_ = i_749_ - i_751_ | i_751_ - (i_751_ >>> 8);
								i_751_ = is[i_631_];
								i_749_ = i_748_ + i_751_;
								i_750_ = (i_748_ & 0xff00ff) + (i_751_ & 0xff00ff);
								i_751_ = (i_750_ & 0x1000100) + (i_749_ - i_750_ & 0x10000);
								is[i_631_++] = i_749_ - i_751_ | i_751_ - (i_751_ >>> 8);
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_744_;
							i_631_ += i_632_;
						}
					} else if (i_618_ == 2) {
						int i_752_ = i_619_ >>> 24;
						int i_753_ = 256 - i_752_;
						int i_754_ = (i_619_ & 0xff00ff) * i_753_ & ~0xff00ff;
						int i_755_ = (i_619_ & 0xff00) * i_753_ & 0xff0000;
						i_619_ = (i_754_ | i_755_) >>> 8;
						int i_756_ = i_622_;
						for (int i_757_ = -i_617_; i_757_ < 0; i_757_++) {
							int i_758_ = ((i_623_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_759_ = -i_616_; i_759_ < 0; i_759_++) {
								int i_760_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_622_ >> 16) + i_758_]);
								if (i_760_ != 0) {
									i_754_ = ((i_760_ & 0xff00ff) * i_752_ & ~0xff00ff);
									i_755_ = ((i_760_ & 0xff00) * i_752_ & 0xff0000);
									i_760_ = ((i_754_ | i_755_) >>> 8) + i_619_;
									int i_761_ = is[i_631_];
									int i_762_ = i_760_ + i_761_;
									int i_763_ = ((i_760_ & 0xff00ff) + (i_761_ & 0xff00ff));
									i_761_ = ((i_763_ & 0x1000100) + (i_762_ - i_763_ & 0x10000));
									is[i_631_++] = i_762_ - i_761_ | i_761_ - (i_761_ >>> 8);
								} else
									i_631_++;
								i_622_ += i_627_;
							}
							i_623_ += i_628_;
							i_622_ = i_756_;
							i_631_ += i_632_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method758(int i, int i_764_, int[] is, int i_765_, int i_766_) {
		if (i_766_ == 0) {
			if (i_765_ == 1)
				is[i_764_] = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
			else if (i_765_ == 0) {
				int i_767_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i++];
				int i_768_ = (i_767_ & 0xff0000) * anInt9353 & ~0xffffff;
				int i_769_ = (i_767_ & 0xff00) * anInt9354 & 0xff0000;
				int i_770_ = (i_767_ & 0xff) * anInt9333 & 0xff00;
				is[i_764_] = (i_768_ | i_769_ | i_770_) >>> 8;
			} else if (i_765_ == 3) {
				int i_771_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i++];
				int i_772_ = anInt9350;
				int i_773_ = i_771_ + i_772_;
				int i_774_ = (i_771_ & 0xff00ff) + (i_772_ & 0xff00ff);
				int i_775_ = (i_774_ & 0x1000100) + (i_773_ - i_774_ & 0x10000);
				is[i_764_] = i_773_ - i_775_ | i_775_ - (i_775_ >>> 8);
			} else if (i_765_ == 2) {
				int i_776_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_777_ = (i_776_ & 0xff00ff) * anInt9351 & ~0xff00ff;
				int i_778_ = (i_776_ & 0xff00) * anInt9351 & 0xff0000;
				is[i_764_] = ((i_777_ | i_778_) >>> 8) + anInt9323;
			} else
				throw new IllegalArgumentException();
		} else if (i_766_ == 1) {
			if (i_765_ == 1) {
				int i_779_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_780_ = i_779_ >>> 24;
				int i_781_ = 256 - i_780_;
				int i_782_ = is[i_764_];
				is[i_764_] = ((((i_779_ & 0xff00ff) * i_780_ + (i_782_ & 0xff00ff) * i_781_) & ~0xff00ff) + (((i_779_ & 0xff00) * i_780_ + (i_782_ & 0xff00) * i_781_) & 0xff0000)) >> 8;
			} else if (i_765_ == 0) {
				int i_783_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_784_ = (i_783_ >>> 24) * anInt9351 >> 8;
				int i_785_ = 256 - i_784_;
				if ((anInt9350 & 0xffffff) == 16777215) {
					int i_786_ = is[i_764_];
					is[i_764_] = ((((i_783_ & 0xff00ff) * i_784_ + (i_786_ & 0xff00ff) * i_785_) & ~0xff00ff) + (((i_783_ & 0xff00) * i_784_ + (i_786_ & 0xff00) * i_785_) & 0xff0000)) >> 8;
				} else if (i_784_ != 255) {
					int i_787_ = (i_783_ & 0xff0000) * anInt9353 & ~0xffffff;
					int i_788_ = (i_783_ & 0xff00) * anInt9354 & 0xff0000;
					int i_789_ = (i_783_ & 0xff) * anInt9333 & 0xff00;
					i_783_ = (i_787_ | i_788_ | i_789_) >>> 8;
					int i_790_ = is[i_764_];
					is[i_764_] = ((((i_783_ & 0xff00ff) * i_784_ + (i_790_ & 0xff00ff) * i_785_) & ~0xff00ff) + (((i_783_ & 0xff00) * i_784_ + (i_790_ & 0xff00) * i_785_) & 0xff0000)) >> 8;
				} else {
					int i_791_ = (i_783_ & 0xff0000) * anInt9353 & ~0xffffff;
					int i_792_ = (i_783_ & 0xff00) * anInt9354 & 0xff0000;
					int i_793_ = (i_783_ & 0xff) * anInt9333 & 0xff00;
					is[i_764_] = (i_791_ | i_792_ | i_793_) >>> 8;
				}
			} else if (i_765_ == 3) {
				int i_794_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_795_ = anInt9350;
				int i_796_ = i_794_ + i_795_;
				int i_797_ = (i_794_ & 0xff00ff) + (i_795_ & 0xff00ff);
				int i_798_ = (i_797_ & 0x1000100) + (i_796_ - i_797_ & 0x10000);
				i_798_ = i_796_ - i_798_ | i_798_ - (i_798_ >>> 8);
				int i_799_ = (i_794_ >>> 24) * anInt9351 >> 8;
				int i_800_ = 256 - i_799_;
				if (i_799_ != 255) {
					i_794_ = i_798_;
					i_798_ = is[i_764_];
					i_798_ = ((((i_794_ & 0xff00ff) * i_799_ + (i_798_ & 0xff00ff) * i_800_) & ~0xff00ff) + (((i_794_ & 0xff00) * i_799_ + (i_798_ & 0xff00) * i_800_) & 0xff0000)) >> 8;
				}
				is[i_764_] = i_798_;
			} else if (i_765_ == 2) {
				int i_801_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_802_ = i_801_ >>> 24;
				int i_803_ = 256 - i_802_;
				int i_804_ = (i_801_ & 0xff00ff) * anInt9351 & ~0xff00ff;
				int i_805_ = (i_801_ & 0xff00) * anInt9351 & 0xff0000;
				i_801_ = ((i_804_ | i_805_) >>> 8) + anInt9323;
				int i_806_ = is[i_764_];
				is[i_764_] = ((((i_801_ & 0xff00ff) * i_802_ + (i_806_ & 0xff00ff) * i_803_) & ~0xff00ff) + (((i_801_ & 0xff00) * i_802_ + (i_806_ & 0xff00) * i_803_) & 0xff0000)) >> 8;
			} else
				throw new IllegalArgumentException();
		} else if (i_766_ == 2) {
			if (i_765_ == 1) {
				int i_807_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_808_ = is[i_764_];
				int i_809_ = i_807_ + i_808_;
				int i_810_ = (i_807_ & 0xff00ff) + (i_808_ & 0xff00ff);
				i_808_ = (i_810_ & 0x1000100) + (i_809_ - i_810_ & 0x10000);
				is[i_764_] = i_809_ - i_808_ | i_808_ - (i_808_ >>> 8);
			} else if (i_765_ == 0) {
				int i_811_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_812_ = (i_811_ & 0xff0000) * anInt9353 & ~0xffffff;
				int i_813_ = (i_811_ & 0xff00) * anInt9354 & 0xff0000;
				int i_814_ = (i_811_ & 0xff) * anInt9333 & 0xff00;
				i_811_ = (i_812_ | i_813_ | i_814_) >>> 8;
				int i_815_ = is[i_764_];
				int i_816_ = i_811_ + i_815_;
				int i_817_ = (i_811_ & 0xff00ff) + (i_815_ & 0xff00ff);
				i_815_ = (i_817_ & 0x1000100) + (i_816_ - i_817_ & 0x10000);
				is[i_764_] = i_816_ - i_815_ | i_815_ - (i_815_ >>> 8);
			} else if (i_765_ == 3) {
				int i_818_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_819_ = anInt9350;
				int i_820_ = i_818_ + i_819_;
				int i_821_ = (i_818_ & 0xff00ff) + (i_819_ & 0xff00ff);
				int i_822_ = (i_821_ & 0x1000100) + (i_820_ - i_821_ & 0x10000);
				i_818_ = i_820_ - i_822_ | i_822_ - (i_822_ >>> 8);
				i_822_ = is[i_764_];
				i_820_ = i_818_ + i_822_;
				i_821_ = (i_818_ & 0xff00ff) + (i_822_ & 0xff00ff);
				i_822_ = (i_821_ & 0x1000100) + (i_820_ - i_821_ & 0x10000);
				is[i_764_] = i_820_ - i_822_ | i_822_ - (i_822_ >>> 8);
			} else if (i_765_ == 2) {
				int i_823_ = ((Class61_Sub3_Sub2) this).anIntArray10094[i];
				int i_824_ = (i_823_ & 0xff00ff) * anInt9351 & ~0xff00ff;
				int i_825_ = (i_823_ & 0xff00) * anInt9351 & 0xff0000;
				i_823_ = ((i_824_ | i_825_) >>> 8) + anInt9323;
				int i_826_ = is[i_764_];
				int i_827_ = i_823_ + i_826_;
				int i_828_ = (i_823_ & 0xff00ff) + (i_826_ & 0xff00ff);
				i_826_ = (i_828_ & 0x1000100) + (i_827_ - i_828_ & 0x10000);
				is[i_764_] = i_827_ - i_826_ | i_826_ - (i_826_ >>> 8);
			}
		} else
			throw new IllegalArgumentException();
	}

	void method756(int i, int i_829_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_830_ = anInt9356;
					while (i_830_ < 0) {
						int i_831_ = anInt9339;
						int i_832_ = anInt9346;
						int i_833_ = anInt9324;
						int i_834_ = anInt9347;
						if (i_832_ >= 0 && i_833_ >= 0 && i_832_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0 && i_833_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							for (/**/; i_834_ < 0; i_834_++)
								method758(((i_833_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_832_ >> 12), i_831_++, is, i, i_829_);
						}
						i_830_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_835_ = anInt9356;
					while (i_835_ < 0) {
						int i_836_ = anInt9339;
						int i_837_ = anInt9346;
						int i_838_ = anInt9324 + anInt9349;
						int i_839_ = anInt9347;
						if (i_837_ >= 0 && i_837_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0) {
							int i_840_;
							if ((i_840_ = i_838_ - ((((Class61_Sub3_Sub2) this).anInt9325) << 12)) >= 0) {
								i_840_ = (anInt9341 - i_840_) / anInt9341;
								i_839_ += i_840_;
								i_838_ += anInt9341 * i_840_;
								i_836_ += i_840_;
							}
							if ((i_840_ = (i_838_ - anInt9341) / anInt9341) > i_839_)
								i_839_ = i_840_;
							for (/**/; i_839_ < 0; i_839_++) {
								method758(((i_838_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_837_ >> 12), i_836_++, is, i, i_829_);
								i_838_ += anInt9341;
							}
						}
						i_835_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_841_ = anInt9356;
					while (i_841_ < 0) {
						int i_842_ = anInt9339;
						int i_843_ = anInt9346;
						int i_844_ = anInt9324 + anInt9349;
						int i_845_ = anInt9347;
						if (i_843_ >= 0 && i_843_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0) {
							if (i_844_ < 0) {
								int i_846_ = (anInt9341 - 1 - i_844_) / anInt9341;
								i_845_ += i_846_;
								i_844_ += anInt9341 * i_846_;
								i_842_ += i_846_;
							}
							int i_847_;
							if ((i_847_ = (1 + i_844_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_845_)
								i_845_ = i_847_;
							for (/**/; i_845_ < 0; i_845_++) {
								method758(((i_844_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_843_ >> 12), i_842_++, is, i, i_829_);
								i_844_ += anInt9341;
							}
						}
						i_841_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_848_ = anInt9356;
					while (i_848_ < 0) {
						int i_849_ = anInt9339;
						int i_850_ = anInt9346 + anInt9348;
						int i_851_ = anInt9324;
						int i_852_ = anInt9347;
						if (i_851_ >= 0 && i_851_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							int i_853_;
							if ((i_853_ = i_850_ - ((((Class61_Sub3_Sub2) this).anInt9358) << 12)) >= 0) {
								i_853_ = (anInt9340 - i_853_) / anInt9340;
								i_852_ += i_853_;
								i_850_ += anInt9340 * i_853_;
								i_849_ += i_853_;
							}
							if ((i_853_ = (i_850_ - anInt9340) / anInt9340) > i_852_)
								i_852_ = i_853_;
							for (/**/; i_852_ < 0; i_852_++) {
								method758(((i_851_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_850_ >> 12), i_849_++, is, i, i_829_);
								i_850_ += anInt9340;
							}
						}
						i_848_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_854_ = anInt9356;
					while (i_854_ < 0) {
						int i_855_ = anInt9339;
						int i_856_ = anInt9346 + anInt9348;
						int i_857_ = anInt9324 + anInt9349;
						int i_858_ = anInt9347;
						int i_859_;
						if ((i_859_ = i_856_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) >= 0) {
							i_859_ = (anInt9340 - i_859_) / anInt9340;
							i_858_ += i_859_;
							i_856_ += anInt9340 * i_859_;
							i_857_ += anInt9341 * i_859_;
							i_855_ += i_859_;
						}
						if ((i_859_ = (i_856_ - anInt9340) / anInt9340) > i_858_)
							i_858_ = i_859_;
						if ((i_859_ = i_857_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_859_ = (anInt9341 - i_859_) / anInt9341;
							i_858_ += i_859_;
							i_856_ += anInt9340 * i_859_;
							i_857_ += anInt9341 * i_859_;
							i_855_ += i_859_;
						}
						if ((i_859_ = (i_857_ - anInt9341) / anInt9341) > i_858_)
							i_858_ = i_859_;
						for (/**/; i_858_ < 0; i_858_++) {
							method758((((i_857_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_856_ >> 12)), i_855_++, is, i, i_829_);
							i_856_ += anInt9340;
							i_857_ += anInt9341;
						}
						i_854_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_860_ = anInt9356;
					while (i_860_ < 0) {
						int i_861_ = anInt9339;
						int i_862_ = anInt9346 + anInt9348;
						int i_863_ = anInt9324 + anInt9349;
						int i_864_ = anInt9347;
						int i_865_;
						if ((i_865_ = i_862_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) >= 0) {
							i_865_ = (anInt9340 - i_865_) / anInt9340;
							i_864_ += i_865_;
							i_862_ += anInt9340 * i_865_;
							i_863_ += anInt9341 * i_865_;
							i_861_ += i_865_;
						}
						if ((i_865_ = (i_862_ - anInt9340) / anInt9340) > i_864_)
							i_864_ = i_865_;
						if (i_863_ < 0) {
							i_865_ = (anInt9341 - 1 - i_863_) / anInt9341;
							i_864_ += i_865_;
							i_862_ += anInt9340 * i_865_;
							i_863_ += anInt9341 * i_865_;
							i_861_ += i_865_;
						}
						if ((i_865_ = (1 + i_863_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_864_)
							i_864_ = i_865_;
						for (/**/; i_864_ < 0; i_864_++) {
							method758((((i_863_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_862_ >> 12)), i_861_++, is, i, i_829_);
							i_862_ += anInt9340;
							i_863_ += anInt9341;
						}
						i_860_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_866_ = anInt9356;
				while (i_866_ < 0) {
					int i_867_ = anInt9339;
					int i_868_ = anInt9346 + anInt9348;
					int i_869_ = anInt9324;
					int i_870_ = anInt9347;
					if (i_869_ >= 0 && i_869_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
						if (i_868_ < 0) {
							int i_871_ = (anInt9340 - 1 - i_868_) / anInt9340;
							i_870_ += i_871_;
							i_868_ += anInt9340 * i_871_;
							i_867_ += i_871_;
						}
						int i_872_;
						if ((i_872_ = (1 + i_868_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_870_)
							i_870_ = i_872_;
						for (/**/; i_870_ < 0; i_870_++) {
							method758((((i_869_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_868_ >> 12)), i_867_++, is, i, i_829_);
							i_868_ += anInt9340;
						}
					}
					i_866_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_873_ = anInt9356; i_873_ < 0; i_873_++) {
					int i_874_ = anInt9339;
					int i_875_ = anInt9346 + anInt9348;
					int i_876_ = anInt9324 + anInt9349;
					int i_877_ = anInt9347;
					if (i_875_ < 0) {
						int i_878_ = (anInt9340 - 1 - i_875_) / anInt9340;
						i_877_ += i_878_;
						i_875_ += anInt9340 * i_878_;
						i_876_ += anInt9341 * i_878_;
						i_874_ += i_878_;
					}
					int i_879_;
					if ((i_879_ = (1 + i_875_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_877_)
						i_877_ = i_879_;
					if ((i_879_ = i_876_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
						i_879_ = (anInt9341 - i_879_) / anInt9341;
						i_877_ += i_879_;
						i_875_ += anInt9340 * i_879_;
						i_876_ += anInt9341 * i_879_;
						i_874_ += i_879_;
					}
					if ((i_879_ = (i_876_ - anInt9341) / anInt9341) > i_877_)
						i_877_ = i_879_;
					for (/**/; i_877_ < 0; i_877_++) {
						method758((((i_876_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_875_ >> 12)), i_874_++, is, i, i_829_);
						i_875_ += anInt9340;
						i_876_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_880_ = anInt9356; i_880_ < 0; i_880_++) {
					int i_881_ = anInt9339;
					int i_882_ = anInt9346 + anInt9348;
					int i_883_ = anInt9324 + anInt9349;
					int i_884_ = anInt9347;
					if (i_882_ < 0) {
						int i_885_ = (anInt9340 - 1 - i_882_) / anInt9340;
						i_884_ += i_885_;
						i_882_ += anInt9340 * i_885_;
						i_883_ += anInt9341 * i_885_;
						i_881_ += i_885_;
					}
					int i_886_;
					if ((i_886_ = (1 + i_882_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_884_)
						i_884_ = i_886_;
					if (i_883_ < 0) {
						i_886_ = (anInt9341 - 1 - i_883_) / anInt9341;
						i_884_ += i_886_;
						i_882_ += anInt9340 * i_886_;
						i_883_ += anInt9341 * i_886_;
						i_881_ += i_886_;
					}
					if ((i_886_ = (1 + i_883_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_884_)
						i_884_ = i_886_;
					for (/**/; i_884_ < 0; i_884_++) {
						method758((((i_883_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_882_ >> 12)), i_881_++, is, i, i_829_);
						i_882_ += anInt9340;
						i_883_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	Class61_Sub3_Sub2(Class_ra_Sub3 class_ra_sub3, int i, int i_887_) {
		super(class_ra_sub3, i, i_887_);
		((Class61_Sub3_Sub2) this).anIntArray10094 = new int[i * i_887_];
	}

	public Interface8_Impl1_Impl2 method713() {
		return new Class12(((Class61_Sub3_Sub2) this).anInt9358, ((Class61_Sub3_Sub2) this).anInt9325, ((Class61_Sub3_Sub2) this).anIntArray10094);
	}

	void method745(int[] is, int[] is_888_, int i, int i_889_) {
		int[] is_890_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_890_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_891_ = anInt9356;
					while (i_891_ < 0) {
						int i_892_ = i_891_ + i_889_;
						if (i_892_ >= 0) {
							if (i_892_ >= is.length)
								break;
							int i_893_ = anInt9339;
							int i_894_ = anInt9346;
							int i_895_ = anInt9324;
							int i_896_ = anInt9347;
							if (i_894_ >= 0 && i_895_ >= 0 && (i_894_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0 && (i_895_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_897_ = is[i_892_] - i;
								int i_898_ = -is_888_[i_892_];
								int i_899_ = i_897_ - (i_893_ - anInt9339);
								if (i_899_ > 0) {
									i_893_ += i_899_;
									i_896_ += i_899_;
									i_894_ += anInt9340 * i_899_;
									i_895_ += anInt9341 * i_899_;
								} else
									i_898_ -= i_899_;
								if (i_896_ < i_898_)
									i_896_ = i_898_;
								for (/**/; i_896_ < 0; i_896_++) {
									int i_900_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_895_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_894_ >> 12))]);
									int i_901_ = i_900_ >>> 24;
									int i_902_ = 256 - i_901_;
									int i_903_ = is_890_[i_893_];
									is_890_[i_893_++] = ((((i_900_ & 0xff00ff) * i_901_ + (i_903_ & 0xff00ff) * i_902_) & ~0xff00ff) + (((i_900_ & 0xff00) * i_901_ + (i_903_ & 0xff00) * i_902_) & 0xff0000)) >> 8;
								}
							}
						}
						i_891_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_904_ = anInt9356;
					while (i_904_ < 0) {
						int i_905_ = i_904_ + i_889_;
						if (i_905_ >= 0) {
							if (i_905_ >= is.length)
								break;
							int i_906_ = anInt9339;
							int i_907_ = anInt9346;
							int i_908_ = anInt9324 + anInt9349;
							int i_909_ = anInt9347;
							if (i_907_ >= 0 && (i_907_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								int i_910_;
								if ((i_910_ = (i_908_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
									i_910_ = (anInt9341 - i_910_) / anInt9341;
									i_909_ += i_910_;
									i_908_ += anInt9341 * i_910_;
									i_906_ += i_910_;
								}
								if ((i_910_ = (i_908_ - anInt9341) / anInt9341) > i_909_)
									i_909_ = i_910_;
								int i_911_ = is[i_905_] - i;
								int i_912_ = -is_888_[i_905_];
								int i_913_ = i_911_ - (i_906_ - anInt9339);
								if (i_913_ > 0) {
									i_906_ += i_913_;
									i_909_ += i_913_;
									i_907_ += anInt9340 * i_913_;
									i_908_ += anInt9341 * i_913_;
								} else
									i_912_ -= i_913_;
								if (i_909_ < i_912_)
									i_909_ = i_912_;
								for (/**/; i_909_ < 0; i_909_++) {
									int i_914_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_908_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_907_ >> 12))]);
									int i_915_ = i_914_ >>> 24;
									int i_916_ = 256 - i_915_;
									int i_917_ = is_890_[i_906_];
									is_890_[i_906_++] = ((((i_914_ & 0xff00ff) * i_915_ + (i_917_ & 0xff00ff) * i_916_) & ~0xff00ff) + (((i_914_ & 0xff00) * i_915_ + (i_917_ & 0xff00) * i_916_) & 0xff0000)) >> 8;
									i_908_ += anInt9341;
								}
							}
						}
						i_904_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_918_ = anInt9356;
					while (i_918_ < 0) {
						int i_919_ = i_918_ + i_889_;
						if (i_919_ >= 0) {
							if (i_919_ >= is.length)
								break;
							int i_920_ = anInt9339;
							int i_921_ = anInt9346;
							int i_922_ = anInt9324 + anInt9349;
							int i_923_ = anInt9347;
							if (i_921_ >= 0 && (i_921_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								if (i_922_ < 0) {
									int i_924_ = (anInt9341 - 1 - i_922_) / anInt9341;
									i_923_ += i_924_;
									i_922_ += anInt9341 * i_924_;
									i_920_ += i_924_;
								}
								int i_925_;
								if ((i_925_ = (1 + i_922_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_923_)
									i_923_ = i_925_;
								int i_926_ = is[i_919_] - i;
								int i_927_ = -is_888_[i_919_];
								int i_928_ = i_926_ - (i_920_ - anInt9339);
								if (i_928_ > 0) {
									i_920_ += i_928_;
									i_923_ += i_928_;
									i_921_ += anInt9340 * i_928_;
									i_922_ += anInt9341 * i_928_;
								} else
									i_927_ -= i_928_;
								if (i_923_ < i_927_)
									i_923_ = i_927_;
								for (/**/; i_923_ < 0; i_923_++) {
									int i_929_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_922_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_921_ >> 12))]);
									int i_930_ = i_929_ >>> 24;
									int i_931_ = 256 - i_930_;
									int i_932_ = is_890_[i_920_];
									is_890_[i_920_++] = ((((i_929_ & 0xff00ff) * i_930_ + (i_932_ & 0xff00ff) * i_931_) & ~0xff00ff) + (((i_929_ & 0xff00) * i_930_ + (i_932_ & 0xff00) * i_931_) & 0xff0000)) >> 8;
									i_922_ += anInt9341;
								}
							}
						}
						i_918_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_933_ = anInt9356;
					while (i_933_ < 0) {
						int i_934_ = i_933_ + i_889_;
						if (i_934_ >= 0) {
							if (i_934_ >= is.length)
								break;
							int i_935_ = anInt9339;
							int i_936_ = anInt9346 + anInt9348;
							int i_937_ = anInt9324;
							int i_938_ = anInt9347;
							if (i_937_ >= 0 && (i_937_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_939_;
								if ((i_939_ = (i_936_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
									i_939_ = (anInt9340 - i_939_) / anInt9340;
									i_938_ += i_939_;
									i_936_ += anInt9340 * i_939_;
									i_935_ += i_939_;
								}
								if ((i_939_ = (i_936_ - anInt9340) / anInt9340) > i_938_)
									i_938_ = i_939_;
								int i_940_ = is[i_934_] - i;
								int i_941_ = -is_888_[i_934_];
								int i_942_ = i_940_ - (i_935_ - anInt9339);
								if (i_942_ > 0) {
									i_935_ += i_942_;
									i_938_ += i_942_;
									i_936_ += anInt9340 * i_942_;
									i_937_ += anInt9341 * i_942_;
								} else
									i_941_ -= i_942_;
								if (i_938_ < i_941_)
									i_938_ = i_941_;
								for (/**/; i_938_ < 0; i_938_++) {
									int i_943_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_937_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_936_ >> 12))]);
									int i_944_ = i_943_ >>> 24;
									int i_945_ = 256 - i_944_;
									int i_946_ = is_890_[i_935_];
									is_890_[i_935_++] = ((((i_943_ & 0xff00ff) * i_944_ + (i_946_ & 0xff00ff) * i_945_) & ~0xff00ff) + (((i_943_ & 0xff00) * i_944_ + (i_946_ & 0xff00) * i_945_) & 0xff0000)) >> 8;
									i_936_ += anInt9340;
								}
							}
						}
						i_933_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_947_ = anInt9356;
					while (i_947_ < 0) {
						int i_948_ = i_947_ + i_889_;
						if (i_948_ >= 0) {
							if (i_948_ >= is.length)
								break;
							int i_949_ = anInt9339;
							int i_950_ = anInt9346 + anInt9348;
							int i_951_ = anInt9324 + anInt9349;
							int i_952_ = anInt9347;
							int i_953_;
							if ((i_953_ = i_950_ - ((((Class61_Sub3_Sub2) this).anInt9358) << 12)) >= 0) {
								i_953_ = (anInt9340 - i_953_) / anInt9340;
								i_952_ += i_953_;
								i_950_ += anInt9340 * i_953_;
								i_951_ += anInt9341 * i_953_;
								i_949_ += i_953_;
							}
							if ((i_953_ = (i_950_ - anInt9340) / anInt9340) > i_952_)
								i_952_ = i_953_;
							if ((i_953_ = i_951_ - ((((Class61_Sub3_Sub2) this).anInt9325) << 12)) >= 0) {
								i_953_ = (anInt9341 - i_953_) / anInt9341;
								i_952_ += i_953_;
								i_950_ += anInt9340 * i_953_;
								i_951_ += anInt9341 * i_953_;
								i_949_ += i_953_;
							}
							if ((i_953_ = (i_951_ - anInt9341) / anInt9341) > i_952_)
								i_952_ = i_953_;
							int i_954_ = is[i_948_] - i;
							int i_955_ = -is_888_[i_948_];
							int i_956_ = i_954_ - (i_949_ - anInt9339);
							if (i_956_ > 0) {
								i_949_ += i_956_;
								i_952_ += i_956_;
								i_950_ += anInt9340 * i_956_;
								i_951_ += anInt9341 * i_956_;
							} else
								i_955_ -= i_956_;
							if (i_952_ < i_955_)
								i_952_ = i_955_;
							for (/**/; i_952_ < 0; i_952_++) {
								int i_957_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_951_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_950_ >> 12))]);
								int i_958_ = i_957_ >>> 24;
								int i_959_ = 256 - i_958_;
								int i_960_ = is_890_[i_949_];
								is_890_[i_949_++] = ((((i_957_ & 0xff00ff) * i_958_ + (i_960_ & 0xff00ff) * i_959_) & ~0xff00ff) + (((i_957_ & 0xff00) * i_958_ + (i_960_ & 0xff00) * i_959_) & 0xff0000)) >> 8;
								i_950_ += anInt9340;
								i_951_ += anInt9341;
							}
						}
						i_947_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_961_ = anInt9356;
					while (i_961_ < 0) {
						int i_962_ = i_961_ + i_889_;
						if (i_962_ >= 0) {
							if (i_962_ >= is.length)
								break;
							int i_963_ = anInt9339;
							int i_964_ = anInt9346 + anInt9348;
							int i_965_ = anInt9324 + anInt9349;
							int i_966_ = anInt9347;
							int i_967_;
							if ((i_967_ = i_964_ - ((((Class61_Sub3_Sub2) this).anInt9358) << 12)) >= 0) {
								i_967_ = (anInt9340 - i_967_) / anInt9340;
								i_966_ += i_967_;
								i_964_ += anInt9340 * i_967_;
								i_965_ += anInt9341 * i_967_;
								i_963_ += i_967_;
							}
							if ((i_967_ = (i_964_ - anInt9340) / anInt9340) > i_966_)
								i_966_ = i_967_;
							if (i_965_ < 0) {
								i_967_ = (anInt9341 - 1 - i_965_) / anInt9341;
								i_966_ += i_967_;
								i_964_ += anInt9340 * i_967_;
								i_965_ += anInt9341 * i_967_;
								i_963_ += i_967_;
							}
							if ((i_967_ = (1 + i_965_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_966_)
								i_966_ = i_967_;
							int i_968_ = is[i_962_] - i;
							int i_969_ = -is_888_[i_962_];
							int i_970_ = i_968_ - (i_963_ - anInt9339);
							if (i_970_ > 0) {
								i_963_ += i_970_;
								i_966_ += i_970_;
								i_964_ += anInt9340 * i_970_;
								i_965_ += anInt9341 * i_970_;
							} else
								i_969_ -= i_970_;
							if (i_966_ < i_969_)
								i_966_ = i_969_;
							for (/**/; i_966_ < 0; i_966_++) {
								int i_971_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_965_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_964_ >> 12))]);
								int i_972_ = i_971_ >>> 24;
								int i_973_ = 256 - i_972_;
								int i_974_ = is_890_[i_963_];
								is_890_[i_963_++] = ((((i_971_ & 0xff00ff) * i_972_ + (i_974_ & 0xff00ff) * i_973_) & ~0xff00ff) + (((i_971_ & 0xff00) * i_972_ + (i_974_ & 0xff00) * i_973_) & 0xff0000)) >> 8;
								i_964_ += anInt9340;
								i_965_ += anInt9341;
							}
						}
						i_961_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_975_ = anInt9356;
				while (i_975_ < 0) {
					int i_976_ = i_975_ + i_889_;
					if (i_976_ >= 0) {
						if (i_976_ >= is.length)
							break;
						int i_977_ = anInt9339;
						int i_978_ = anInt9346 + anInt9348;
						int i_979_ = anInt9324;
						int i_980_ = anInt9347;
						if (i_979_ >= 0 && i_979_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							if (i_978_ < 0) {
								int i_981_ = (anInt9340 - 1 - i_978_) / anInt9340;
								i_980_ += i_981_;
								i_978_ += anInt9340 * i_981_;
								i_977_ += i_981_;
							}
							int i_982_;
							if ((i_982_ = (1 + i_978_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_980_)
								i_980_ = i_982_;
							int i_983_ = is[i_976_] - i;
							int i_984_ = -is_888_[i_976_];
							int i_985_ = i_983_ - (i_977_ - anInt9339);
							if (i_985_ > 0) {
								i_977_ += i_985_;
								i_980_ += i_985_;
								i_978_ += anInt9340 * i_985_;
								i_979_ += anInt9341 * i_985_;
							} else
								i_984_ -= i_985_;
							if (i_980_ < i_984_)
								i_980_ = i_984_;
							for (/**/; i_980_ < 0; i_980_++) {
								int i_986_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_979_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_978_ >> 12))]);
								int i_987_ = i_986_ >>> 24;
								int i_988_ = 256 - i_987_;
								int i_989_ = is_890_[i_977_];
								is_890_[i_977_++] = ((((i_986_ & 0xff00ff) * i_987_ + (i_989_ & 0xff00ff) * i_988_) & ~0xff00ff) + (((i_986_ & 0xff00) * i_987_ + (i_989_ & 0xff00) * i_988_) & 0xff0000)) >> 8;
								i_978_ += anInt9340;
							}
						}
					}
					i_975_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_990_ = anInt9356;
				while (i_990_ < 0) {
					int i_991_ = i_990_ + i_889_;
					if (i_991_ >= 0) {
						if (i_991_ >= is.length)
							break;
						int i_992_ = anInt9339;
						int i_993_ = anInt9346 + anInt9348;
						int i_994_ = anInt9324 + anInt9349;
						int i_995_ = anInt9347;
						if (i_993_ < 0) {
							int i_996_ = (anInt9340 - 1 - i_993_) / anInt9340;
							i_995_ += i_996_;
							i_993_ += anInt9340 * i_996_;
							i_994_ += anInt9341 * i_996_;
							i_992_ += i_996_;
						}
						int i_997_;
						if ((i_997_ = (1 + i_993_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_995_)
							i_995_ = i_997_;
						if ((i_997_ = i_994_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_997_ = (anInt9341 - i_997_) / anInt9341;
							i_995_ += i_997_;
							i_993_ += anInt9340 * i_997_;
							i_994_ += anInt9341 * i_997_;
							i_992_ += i_997_;
						}
						if ((i_997_ = (i_994_ - anInt9341) / anInt9341) > i_995_)
							i_995_ = i_997_;
						int i_998_ = is[i_991_] - i;
						int i_999_ = -is_888_[i_991_];
						int i_1000_ = i_998_ - (i_992_ - anInt9339);
						if (i_1000_ > 0) {
							i_992_ += i_1000_;
							i_995_ += i_1000_;
							i_993_ += anInt9340 * i_1000_;
							i_994_ += anInt9341 * i_1000_;
						} else
							i_999_ -= i_1000_;
						if (i_995_ < i_999_)
							i_995_ = i_999_;
						for (/**/; i_995_ < 0; i_995_++) {
							int i_1001_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_994_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_993_ >> 12))]);
							int i_1002_ = i_1001_ >>> 24;
							int i_1003_ = 256 - i_1002_;
							int i_1004_ = is_890_[i_992_];
							is_890_[i_992_++] = ((((i_1001_ & 0xff00ff) * i_1002_ + (i_1004_ & 0xff00ff) * i_1003_) & ~0xff00ff) + (((i_1001_ & 0xff00) * i_1002_ + (i_1004_ & 0xff00) * i_1003_) & 0xff0000)) >> 8;
							i_993_ += anInt9340;
							i_994_ += anInt9341;
						}
					}
					i_990_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_1005_ = anInt9356;
				while (i_1005_ < 0) {
					int i_1006_ = i_1005_ + i_889_;
					if (i_1006_ >= 0) {
						if (i_1006_ >= is.length)
							break;
						int i_1007_ = anInt9339;
						int i_1008_ = anInt9346 + anInt9348;
						int i_1009_ = anInt9324 + anInt9349;
						int i_1010_ = anInt9347;
						if (i_1008_ < 0) {
							int i_1011_ = (anInt9340 - 1 - i_1008_) / anInt9340;
							i_1010_ += i_1011_;
							i_1008_ += anInt9340 * i_1011_;
							i_1009_ += anInt9341 * i_1011_;
							i_1007_ += i_1011_;
						}
						int i_1012_;
						if ((i_1012_ = (1 + i_1008_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_1010_)
							i_1010_ = i_1012_;
						if (i_1009_ < 0) {
							i_1012_ = (anInt9341 - 1 - i_1009_) / anInt9341;
							i_1010_ += i_1012_;
							i_1008_ += anInt9340 * i_1012_;
							i_1009_ += anInt9341 * i_1012_;
							i_1007_ += i_1012_;
						}
						if ((i_1012_ = (1 + i_1009_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_1010_)
							i_1010_ = i_1012_;
						int i_1013_ = is[i_1006_] - i;
						int i_1014_ = -is_888_[i_1006_];
						int i_1015_ = i_1013_ - (i_1007_ - anInt9339);
						if (i_1015_ > 0) {
							i_1007_ += i_1015_;
							i_1010_ += i_1015_;
							i_1008_ += anInt9340 * i_1015_;
							i_1009_ += anInt9341 * i_1015_;
						} else
							i_1014_ -= i_1015_;
						if (i_1010_ < i_1014_)
							i_1010_ = i_1014_;
						for (/**/; i_1010_ < 0; i_1010_++) {
							int i_1016_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_1009_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_1008_ >> 12))]);
							int i_1017_ = i_1016_ >>> 24;
							int i_1018_ = 256 - i_1017_;
							int i_1019_ = is_890_[i_1007_];
							is_890_[i_1007_++] = ((((i_1016_ & 0xff00ff) * i_1017_ + (i_1019_ & 0xff00ff) * i_1018_) & ~0xff00ff) + (((i_1016_ & 0xff00) * i_1017_ + (i_1019_ & 0xff00) * i_1018_) & 0xff0000)) >> 8;
							i_1008_ += anInt9340;
							i_1009_ += anInt9341;
						}
					}
					i_1005_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	public Interface8_Impl1_Impl2 method707() {
		return new Class12(((Class61_Sub3_Sub2) this).anInt9358, ((Class61_Sub3_Sub2) this).anInt9325, ((Class61_Sub3_Sub2) this).anIntArray10094);
	}

	public Interface8_Impl1_Impl2 method678() {
		return new Class12(((Class61_Sub3_Sub2) this).anInt9358, ((Class61_Sub3_Sub2) this).anInt9325, ((Class61_Sub3_Sub2) this).anIntArray10094);
	}

	public void method700(int i, int i_1020_, int i_1021_, int i_1022_, int i_1023_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_1024_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub2) this).anInt9352;
			i_1020_ += ((Class61_Sub3_Sub2) this).anInt9327;
			int i_1025_ = i_1020_ * i_1024_ + i;
			int i_1026_ = 0;
			int i_1027_ = ((Class61_Sub3_Sub2) this).anInt9325;
			int i_1028_ = ((Class61_Sub3_Sub2) this).anInt9358;
			int i_1029_ = i_1024_ - i_1028_;
			int i_1030_ = 0;
			if (i_1020_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1031_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1020_);
				i_1027_ -= i_1031_;
				i_1020_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_1026_ += i_1031_ * i_1028_;
				i_1025_ += i_1031_ * i_1024_;
			}
			if (i_1020_ + i_1027_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1027_ -= (i_1020_ + i_1027_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1032_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1028_ -= i_1032_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_1026_ += i_1032_;
				i_1025_ += i_1032_;
				i_1030_ += i_1032_;
				i_1029_ += i_1032_;
			}
			if (i + i_1028_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1033_ = (i + i_1028_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1028_ -= i_1033_;
				i_1030_ += i_1033_;
				i_1029_ += i_1033_;
			}
			if (i_1028_ > 0 && i_1027_ > 0) {
				if (i_1023_ == 0) {
					if (i_1021_ == 1) {
						for (int i_1034_ = -i_1027_; i_1034_ < 0; i_1034_++) {
							int i_1035_ = i_1025_ + i_1028_ - 3;
							while (i_1025_ < i_1035_) {
								is[i_1025_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								is[i_1025_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								is[i_1025_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								is[i_1025_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
							}
							i_1035_ += 3;
							while (i_1025_ < i_1035_)
								is[i_1025_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 0) {
						int i_1036_ = (i_1022_ & 0xff0000) >> 16;
						int i_1037_ = (i_1022_ & 0xff00) >> 8;
						int i_1038_ = i_1022_ & 0xff;
						for (int i_1039_ = -i_1027_; i_1039_ < 0; i_1039_++) {
							for (int i_1040_ = -i_1028_; i_1040_ < 0; i_1040_++) {
								int i_1041_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								int i_1042_ = ((i_1041_ & 0xff0000) * i_1036_ & ~0xffffff);
								int i_1043_ = (i_1041_ & 0xff00) * i_1037_ & 0xff0000;
								int i_1044_ = (i_1041_ & 0xff) * i_1038_ & 0xff00;
								is[i_1025_++] = (i_1042_ | i_1043_ | i_1044_) >>> 8;
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 3) {
						for (int i_1045_ = -i_1027_; i_1045_ < 0; i_1045_++) {
							for (int i_1046_ = -i_1028_; i_1046_ < 0; i_1046_++) {
								int i_1047_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								int i_1048_ = i_1047_ + i_1022_;
								int i_1049_ = ((i_1047_ & 0xff00ff) + (i_1022_ & 0xff00ff));
								int i_1050_ = ((i_1049_ & 0x1000100) + (i_1048_ - i_1049_ & 0x10000));
								is[i_1025_++] = i_1048_ - i_1050_ | i_1050_ - (i_1050_ >>> 8);
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 2) {
						int i_1051_ = i_1022_ >>> 24;
						int i_1052_ = 256 - i_1051_;
						int i_1053_ = (i_1022_ & 0xff00ff) * i_1052_ & ~0xff00ff;
						int i_1054_ = (i_1022_ & 0xff00) * i_1052_ & 0xff0000;
						i_1022_ = (i_1053_ | i_1054_) >>> 8;
						for (int i_1055_ = -i_1027_; i_1055_ < 0; i_1055_++) {
							for (int i_1056_ = -i_1028_; i_1056_ < 0; i_1056_++) {
								int i_1057_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								i_1053_ = ((i_1057_ & 0xff00ff) * i_1051_ & ~0xff00ff);
								i_1054_ = (i_1057_ & 0xff00) * i_1051_ & 0xff0000;
								is[i_1025_++] = ((i_1053_ | i_1054_) >>> 8) + i_1022_;
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1023_ == 1) {
					if (i_1021_ == 1) {
						for (int i_1058_ = -i_1027_; i_1058_ < 0; i_1058_++) {
							for (int i_1059_ = -i_1028_; i_1059_ < 0; i_1059_++) {
								int i_1060_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								int i_1061_ = i_1060_ >>> 24;
								int i_1062_ = 256 - i_1061_;
								int i_1063_ = is[i_1025_];
								is[i_1025_++] = (((((i_1060_ & 0xff00ff) * i_1061_ + (i_1063_ & 0xff00ff) * i_1062_) & ~0xff00ff) >> 8) + (((((i_1060_ & ~0xff00ff) >>> 8) * i_1061_) + (((i_1063_ & ~0xff00ff) >>> 8) * i_1062_)) & ~0xff00ff));
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 0) {
						if ((i_1022_ & 0xffffff) == 16777215) {
							for (int i_1064_ = -i_1027_; i_1064_ < 0; i_1064_++) {
								for (int i_1065_ = -i_1028_; i_1065_ < 0; i_1065_++) {
									int i_1066_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
									int i_1067_ = ((i_1066_ >>> 24) * (i_1022_ >>> 24) >> 8);
									int i_1068_ = 256 - i_1067_;
									int i_1069_ = is[i_1025_];
									is[i_1025_++] = ((((i_1066_ & 0xff00ff) * i_1067_ + (i_1069_ & 0xff00ff) * i_1068_) & ~0xff00ff) + (((i_1066_ & 0xff00) * i_1067_ + (i_1069_ & 0xff00) * i_1068_) & 0xff0000)) >> 8;
								}
								i_1025_ += i_1029_;
								i_1026_ += i_1030_;
							}
						} else {
							int i_1070_ = (i_1022_ & 0xff0000) >> 16;
							int i_1071_ = (i_1022_ & 0xff00) >> 8;
							int i_1072_ = i_1022_ & 0xff;
							for (int i_1073_ = -i_1027_; i_1073_ < 0; i_1073_++) {
								for (int i_1074_ = -i_1028_; i_1074_ < 0; i_1074_++) {
									int i_1075_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
									int i_1076_ = ((i_1075_ >>> 24) * (i_1022_ >>> 24) >> 8);
									int i_1077_ = 256 - i_1076_;
									if (i_1076_ != 255) {
										int i_1078_ = ((i_1075_ & 0xff0000) * i_1070_ & ~0xffffff);
										int i_1079_ = ((i_1075_ & 0xff00) * i_1071_ & 0xff0000);
										int i_1080_ = ((i_1075_ & 0xff) * i_1072_ & 0xff00);
										i_1075_ = (i_1078_ | i_1079_ | i_1080_) >>> 8;
										int i_1081_ = is[i_1025_];
										is[i_1025_++] = ((((i_1075_ & 0xff00ff) * i_1076_ + ((i_1081_ & 0xff00ff) * i_1077_)) & ~0xff00ff) + (((i_1075_ & 0xff00) * i_1076_ + ((i_1081_ & 0xff00) * i_1077_)) & 0xff0000)) >> 8;
									} else {
										int i_1082_ = ((i_1075_ & 0xff0000) * i_1070_ & ~0xffffff);
										int i_1083_ = ((i_1075_ & 0xff00) * i_1071_ & 0xff0000);
										int i_1084_ = ((i_1075_ & 0xff) * i_1072_ & 0xff00);
										is[i_1025_++] = (i_1082_ | i_1083_ | i_1084_) >>> 8;
									}
								}
								i_1025_ += i_1029_;
								i_1026_ += i_1030_;
							}
						}
					} else if (i_1021_ == 3) {
						for (int i_1085_ = -i_1027_; i_1085_ < 0; i_1085_++) {
							for (int i_1086_ = -i_1028_; i_1086_ < 0; i_1086_++) {
								int i_1087_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								int i_1088_ = i_1087_ + i_1022_;
								int i_1089_ = ((i_1087_ & 0xff00ff) + (i_1022_ & 0xff00ff));
								int i_1090_ = ((i_1089_ & 0x1000100) + (i_1088_ - i_1089_ & 0x10000));
								i_1090_ = i_1088_ - i_1090_ | i_1090_ - (i_1090_ >>> 8);
								int i_1091_ = (i_1090_ >>> 24) * (i_1022_ >>> 24) >> 8;
								int i_1092_ = 256 - i_1091_;
								if (i_1091_ != 255) {
									i_1087_ = i_1090_;
									i_1090_ = is[i_1025_];
									i_1090_ = ((((i_1087_ & 0xff00ff) * i_1091_ + (i_1090_ & 0xff00ff) * i_1092_) & ~0xff00ff) + (((i_1087_ & 0xff00) * i_1091_ + (i_1090_ & 0xff00) * i_1092_) & 0xff0000)) >> 8;
								}
								is[i_1025_++] = i_1090_;
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 2) {
						int i_1093_ = i_1022_ >>> 24;
						int i_1094_ = 256 - i_1093_;
						int i_1095_ = (i_1022_ & 0xff00ff) * i_1094_ & ~0xff00ff;
						int i_1096_ = (i_1022_ & 0xff00) * i_1094_ & 0xff0000;
						i_1022_ = (i_1095_ | i_1096_) >>> 8;
						for (int i_1097_ = -i_1027_; i_1097_ < 0; i_1097_++) {
							for (int i_1098_ = -i_1028_; i_1098_ < 0; i_1098_++) {
								int i_1099_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								int i_1100_ = i_1099_ >>> 24;
								int i_1101_ = 256 - i_1100_;
								i_1095_ = ((i_1099_ & 0xff00ff) * i_1093_ & ~0xff00ff);
								i_1096_ = (i_1099_ & 0xff00) * i_1093_ & 0xff0000;
								i_1099_ = ((i_1095_ | i_1096_) >>> 8) + i_1022_;
								int i_1102_ = is[i_1025_];
								is[i_1025_++] = ((((i_1099_ & 0xff00ff) * i_1100_ + (i_1102_ & 0xff00ff) * i_1101_) & ~0xff00ff) + (((i_1099_ & 0xff00) * i_1100_ + (i_1102_ & 0xff00) * i_1101_) & 0xff0000)) >> 8;
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1023_ == 2) {
					if (i_1021_ == 1) {
						for (int i_1103_ = -i_1027_; i_1103_ < 0; i_1103_++) {
							for (int i_1104_ = -i_1028_; i_1104_ < 0; i_1104_++) {
								int i_1105_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								if (i_1105_ != 0) {
									int i_1106_ = is[i_1025_];
									int i_1107_ = i_1105_ + i_1106_;
									int i_1108_ = ((i_1105_ & 0xff00ff) + (i_1106_ & 0xff00ff));
									i_1106_ = ((i_1108_ & 0x1000100) + (i_1107_ - i_1108_ & 0x10000));
									is[i_1025_++] = (i_1107_ - i_1106_ | i_1106_ - (i_1106_ >>> 8));
								} else
									i_1025_++;
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 0) {
						int i_1109_ = (i_1022_ & 0xff0000) >> 16;
						int i_1110_ = (i_1022_ & 0xff00) >> 8;
						int i_1111_ = i_1022_ & 0xff;
						for (int i_1112_ = -i_1027_; i_1112_ < 0; i_1112_++) {
							for (int i_1113_ = -i_1028_; i_1113_ < 0; i_1113_++) {
								int i_1114_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								if (i_1114_ != 0) {
									int i_1115_ = ((i_1114_ & 0xff0000) * i_1109_ & ~0xffffff);
									int i_1116_ = ((i_1114_ & 0xff00) * i_1110_ & 0xff0000);
									int i_1117_ = (i_1114_ & 0xff) * i_1111_ & 0xff00;
									i_1114_ = (i_1115_ | i_1116_ | i_1117_) >>> 8;
									int i_1118_ = is[i_1025_];
									int i_1119_ = i_1114_ + i_1118_;
									int i_1120_ = ((i_1114_ & 0xff00ff) + (i_1118_ & 0xff00ff));
									i_1118_ = ((i_1120_ & 0x1000100) + (i_1119_ - i_1120_ & 0x10000));
									is[i_1025_++] = (i_1119_ - i_1118_ | i_1118_ - (i_1118_ >>> 8));
								} else
									i_1025_++;
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 3) {
						for (int i_1121_ = -i_1027_; i_1121_ < 0; i_1121_++) {
							for (int i_1122_ = -i_1028_; i_1122_ < 0; i_1122_++) {
								int i_1123_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								int i_1124_ = i_1123_ + i_1022_;
								int i_1125_ = ((i_1123_ & 0xff00ff) + (i_1022_ & 0xff00ff));
								int i_1126_ = ((i_1125_ & 0x1000100) + (i_1124_ - i_1125_ & 0x10000));
								i_1123_ = i_1124_ - i_1126_ | i_1126_ - (i_1126_ >>> 8);
								i_1126_ = is[i_1025_];
								i_1124_ = i_1123_ + i_1126_;
								i_1125_ = (i_1123_ & 0xff00ff) + (i_1126_ & 0xff00ff);
								i_1126_ = ((i_1125_ & 0x1000100) + (i_1124_ - i_1125_ & 0x10000));
								is[i_1025_++] = i_1124_ - i_1126_ | i_1126_ - (i_1126_ >>> 8);
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else if (i_1021_ == 2) {
						int i_1127_ = i_1022_ >>> 24;
						int i_1128_ = 256 - i_1127_;
						int i_1129_ = (i_1022_ & 0xff00ff) * i_1128_ & ~0xff00ff;
						int i_1130_ = (i_1022_ & 0xff00) * i_1128_ & 0xff0000;
						i_1022_ = (i_1129_ | i_1130_) >>> 8;
						for (int i_1131_ = -i_1027_; i_1131_ < 0; i_1131_++) {
							for (int i_1132_ = -i_1028_; i_1132_ < 0; i_1132_++) {
								int i_1133_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1026_++]);
								if (i_1133_ != 0) {
									i_1129_ = ((i_1133_ & 0xff00ff) * i_1127_ & ~0xff00ff);
									i_1130_ = ((i_1133_ & 0xff00) * i_1127_ & 0xff0000);
									i_1133_ = (((i_1129_ | i_1130_) >>> 8) + i_1022_);
									int i_1134_ = is[i_1025_];
									int i_1135_ = i_1133_ + i_1134_;
									int i_1136_ = ((i_1133_ & 0xff00ff) + (i_1134_ & 0xff00ff));
									i_1134_ = ((i_1136_ & 0x1000100) + (i_1135_ - i_1136_ & 0x10000));
									is[i_1025_++] = (i_1135_ - i_1134_ | i_1134_ - (i_1134_ >>> 8));
								} else
									i_1025_++;
							}
							i_1025_ += i_1029_;
							i_1026_ += i_1030_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method685(int i, int i_1137_, int i_1138_, int i_1139_, int i_1140_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_1141_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub2) this).anInt9352;
			i_1137_ += ((Class61_Sub3_Sub2) this).anInt9327;
			int i_1142_ = i_1137_ * i_1141_ + i;
			int i_1143_ = 0;
			int i_1144_ = ((Class61_Sub3_Sub2) this).anInt9325;
			int i_1145_ = ((Class61_Sub3_Sub2) this).anInt9358;
			int i_1146_ = i_1141_ - i_1145_;
			int i_1147_ = 0;
			if (i_1137_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1148_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1137_);
				i_1144_ -= i_1148_;
				i_1137_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_1143_ += i_1148_ * i_1145_;
				i_1142_ += i_1148_ * i_1141_;
			}
			if (i_1137_ + i_1144_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1144_ -= (i_1137_ + i_1144_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1149_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1145_ -= i_1149_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_1143_ += i_1149_;
				i_1142_ += i_1149_;
				i_1147_ += i_1149_;
				i_1146_ += i_1149_;
			}
			if (i + i_1145_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1150_ = (i + i_1145_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1145_ -= i_1150_;
				i_1147_ += i_1150_;
				i_1146_ += i_1150_;
			}
			if (i_1145_ > 0 && i_1144_ > 0) {
				if (i_1140_ == 0) {
					if (i_1138_ == 1) {
						for (int i_1151_ = -i_1144_; i_1151_ < 0; i_1151_++) {
							int i_1152_ = i_1142_ + i_1145_ - 3;
							while (i_1142_ < i_1152_) {
								is[i_1142_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								is[i_1142_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								is[i_1142_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								is[i_1142_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
							}
							i_1152_ += 3;
							while (i_1142_ < i_1152_)
								is[i_1142_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 0) {
						int i_1153_ = (i_1139_ & 0xff0000) >> 16;
						int i_1154_ = (i_1139_ & 0xff00) >> 8;
						int i_1155_ = i_1139_ & 0xff;
						for (int i_1156_ = -i_1144_; i_1156_ < 0; i_1156_++) {
							for (int i_1157_ = -i_1145_; i_1157_ < 0; i_1157_++) {
								int i_1158_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								int i_1159_ = ((i_1158_ & 0xff0000) * i_1153_ & ~0xffffff);
								int i_1160_ = (i_1158_ & 0xff00) * i_1154_ & 0xff0000;
								int i_1161_ = (i_1158_ & 0xff) * i_1155_ & 0xff00;
								is[i_1142_++] = (i_1159_ | i_1160_ | i_1161_) >>> 8;
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 3) {
						for (int i_1162_ = -i_1144_; i_1162_ < 0; i_1162_++) {
							for (int i_1163_ = -i_1145_; i_1163_ < 0; i_1163_++) {
								int i_1164_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								int i_1165_ = i_1164_ + i_1139_;
								int i_1166_ = ((i_1164_ & 0xff00ff) + (i_1139_ & 0xff00ff));
								int i_1167_ = ((i_1166_ & 0x1000100) + (i_1165_ - i_1166_ & 0x10000));
								is[i_1142_++] = i_1165_ - i_1167_ | i_1167_ - (i_1167_ >>> 8);
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 2) {
						int i_1168_ = i_1139_ >>> 24;
						int i_1169_ = 256 - i_1168_;
						int i_1170_ = (i_1139_ & 0xff00ff) * i_1169_ & ~0xff00ff;
						int i_1171_ = (i_1139_ & 0xff00) * i_1169_ & 0xff0000;
						i_1139_ = (i_1170_ | i_1171_) >>> 8;
						for (int i_1172_ = -i_1144_; i_1172_ < 0; i_1172_++) {
							for (int i_1173_ = -i_1145_; i_1173_ < 0; i_1173_++) {
								int i_1174_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								i_1170_ = ((i_1174_ & 0xff00ff) * i_1168_ & ~0xff00ff);
								i_1171_ = (i_1174_ & 0xff00) * i_1168_ & 0xff0000;
								is[i_1142_++] = ((i_1170_ | i_1171_) >>> 8) + i_1139_;
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1140_ == 1) {
					if (i_1138_ == 1) {
						for (int i_1175_ = -i_1144_; i_1175_ < 0; i_1175_++) {
							for (int i_1176_ = -i_1145_; i_1176_ < 0; i_1176_++) {
								int i_1177_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								int i_1178_ = i_1177_ >>> 24;
								int i_1179_ = 256 - i_1178_;
								int i_1180_ = is[i_1142_];
								is[i_1142_++] = (((((i_1177_ & 0xff00ff) * i_1178_ + (i_1180_ & 0xff00ff) * i_1179_) & ~0xff00ff) >> 8) + (((((i_1177_ & ~0xff00ff) >>> 8) * i_1178_) + (((i_1180_ & ~0xff00ff) >>> 8) * i_1179_)) & ~0xff00ff));
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 0) {
						if ((i_1139_ & 0xffffff) == 16777215) {
							for (int i_1181_ = -i_1144_; i_1181_ < 0; i_1181_++) {
								for (int i_1182_ = -i_1145_; i_1182_ < 0; i_1182_++) {
									int i_1183_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
									int i_1184_ = ((i_1183_ >>> 24) * (i_1139_ >>> 24) >> 8);
									int i_1185_ = 256 - i_1184_;
									int i_1186_ = is[i_1142_];
									is[i_1142_++] = ((((i_1183_ & 0xff00ff) * i_1184_ + (i_1186_ & 0xff00ff) * i_1185_) & ~0xff00ff) + (((i_1183_ & 0xff00) * i_1184_ + (i_1186_ & 0xff00) * i_1185_) & 0xff0000)) >> 8;
								}
								i_1142_ += i_1146_;
								i_1143_ += i_1147_;
							}
						} else {
							int i_1187_ = (i_1139_ & 0xff0000) >> 16;
							int i_1188_ = (i_1139_ & 0xff00) >> 8;
							int i_1189_ = i_1139_ & 0xff;
							for (int i_1190_ = -i_1144_; i_1190_ < 0; i_1190_++) {
								for (int i_1191_ = -i_1145_; i_1191_ < 0; i_1191_++) {
									int i_1192_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
									int i_1193_ = ((i_1192_ >>> 24) * (i_1139_ >>> 24) >> 8);
									int i_1194_ = 256 - i_1193_;
									if (i_1193_ != 255) {
										int i_1195_ = ((i_1192_ & 0xff0000) * i_1187_ & ~0xffffff);
										int i_1196_ = ((i_1192_ & 0xff00) * i_1188_ & 0xff0000);
										int i_1197_ = ((i_1192_ & 0xff) * i_1189_ & 0xff00);
										i_1192_ = (i_1195_ | i_1196_ | i_1197_) >>> 8;
										int i_1198_ = is[i_1142_];
										is[i_1142_++] = ((((i_1192_ & 0xff00ff) * i_1193_ + ((i_1198_ & 0xff00ff) * i_1194_)) & ~0xff00ff) + (((i_1192_ & 0xff00) * i_1193_ + ((i_1198_ & 0xff00) * i_1194_)) & 0xff0000)) >> 8;
									} else {
										int i_1199_ = ((i_1192_ & 0xff0000) * i_1187_ & ~0xffffff);
										int i_1200_ = ((i_1192_ & 0xff00) * i_1188_ & 0xff0000);
										int i_1201_ = ((i_1192_ & 0xff) * i_1189_ & 0xff00);
										is[i_1142_++] = (i_1199_ | i_1200_ | i_1201_) >>> 8;
									}
								}
								i_1142_ += i_1146_;
								i_1143_ += i_1147_;
							}
						}
					} else if (i_1138_ == 3) {
						for (int i_1202_ = -i_1144_; i_1202_ < 0; i_1202_++) {
							for (int i_1203_ = -i_1145_; i_1203_ < 0; i_1203_++) {
								int i_1204_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								int i_1205_ = i_1204_ + i_1139_;
								int i_1206_ = ((i_1204_ & 0xff00ff) + (i_1139_ & 0xff00ff));
								int i_1207_ = ((i_1206_ & 0x1000100) + (i_1205_ - i_1206_ & 0x10000));
								i_1207_ = i_1205_ - i_1207_ | i_1207_ - (i_1207_ >>> 8);
								int i_1208_ = (i_1207_ >>> 24) * (i_1139_ >>> 24) >> 8;
								int i_1209_ = 256 - i_1208_;
								if (i_1208_ != 255) {
									i_1204_ = i_1207_;
									i_1207_ = is[i_1142_];
									i_1207_ = ((((i_1204_ & 0xff00ff) * i_1208_ + (i_1207_ & 0xff00ff) * i_1209_) & ~0xff00ff) + (((i_1204_ & 0xff00) * i_1208_ + (i_1207_ & 0xff00) * i_1209_) & 0xff0000)) >> 8;
								}
								is[i_1142_++] = i_1207_;
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 2) {
						int i_1210_ = i_1139_ >>> 24;
						int i_1211_ = 256 - i_1210_;
						int i_1212_ = (i_1139_ & 0xff00ff) * i_1211_ & ~0xff00ff;
						int i_1213_ = (i_1139_ & 0xff00) * i_1211_ & 0xff0000;
						i_1139_ = (i_1212_ | i_1213_) >>> 8;
						for (int i_1214_ = -i_1144_; i_1214_ < 0; i_1214_++) {
							for (int i_1215_ = -i_1145_; i_1215_ < 0; i_1215_++) {
								int i_1216_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								int i_1217_ = i_1216_ >>> 24;
								int i_1218_ = 256 - i_1217_;
								i_1212_ = ((i_1216_ & 0xff00ff) * i_1210_ & ~0xff00ff);
								i_1213_ = (i_1216_ & 0xff00) * i_1210_ & 0xff0000;
								i_1216_ = ((i_1212_ | i_1213_) >>> 8) + i_1139_;
								int i_1219_ = is[i_1142_];
								is[i_1142_++] = ((((i_1216_ & 0xff00ff) * i_1217_ + (i_1219_ & 0xff00ff) * i_1218_) & ~0xff00ff) + (((i_1216_ & 0xff00) * i_1217_ + (i_1219_ & 0xff00) * i_1218_) & 0xff0000)) >> 8;
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1140_ == 2) {
					if (i_1138_ == 1) {
						for (int i_1220_ = -i_1144_; i_1220_ < 0; i_1220_++) {
							for (int i_1221_ = -i_1145_; i_1221_ < 0; i_1221_++) {
								int i_1222_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								if (i_1222_ != 0) {
									int i_1223_ = is[i_1142_];
									int i_1224_ = i_1222_ + i_1223_;
									int i_1225_ = ((i_1222_ & 0xff00ff) + (i_1223_ & 0xff00ff));
									i_1223_ = ((i_1225_ & 0x1000100) + (i_1224_ - i_1225_ & 0x10000));
									is[i_1142_++] = (i_1224_ - i_1223_ | i_1223_ - (i_1223_ >>> 8));
								} else
									i_1142_++;
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 0) {
						int i_1226_ = (i_1139_ & 0xff0000) >> 16;
						int i_1227_ = (i_1139_ & 0xff00) >> 8;
						int i_1228_ = i_1139_ & 0xff;
						for (int i_1229_ = -i_1144_; i_1229_ < 0; i_1229_++) {
							for (int i_1230_ = -i_1145_; i_1230_ < 0; i_1230_++) {
								int i_1231_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								if (i_1231_ != 0) {
									int i_1232_ = ((i_1231_ & 0xff0000) * i_1226_ & ~0xffffff);
									int i_1233_ = ((i_1231_ & 0xff00) * i_1227_ & 0xff0000);
									int i_1234_ = (i_1231_ & 0xff) * i_1228_ & 0xff00;
									i_1231_ = (i_1232_ | i_1233_ | i_1234_) >>> 8;
									int i_1235_ = is[i_1142_];
									int i_1236_ = i_1231_ + i_1235_;
									int i_1237_ = ((i_1231_ & 0xff00ff) + (i_1235_ & 0xff00ff));
									i_1235_ = ((i_1237_ & 0x1000100) + (i_1236_ - i_1237_ & 0x10000));
									is[i_1142_++] = (i_1236_ - i_1235_ | i_1235_ - (i_1235_ >>> 8));
								} else
									i_1142_++;
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 3) {
						for (int i_1238_ = -i_1144_; i_1238_ < 0; i_1238_++) {
							for (int i_1239_ = -i_1145_; i_1239_ < 0; i_1239_++) {
								int i_1240_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								int i_1241_ = i_1240_ + i_1139_;
								int i_1242_ = ((i_1240_ & 0xff00ff) + (i_1139_ & 0xff00ff));
								int i_1243_ = ((i_1242_ & 0x1000100) + (i_1241_ - i_1242_ & 0x10000));
								i_1240_ = i_1241_ - i_1243_ | i_1243_ - (i_1243_ >>> 8);
								i_1243_ = is[i_1142_];
								i_1241_ = i_1240_ + i_1243_;
								i_1242_ = (i_1240_ & 0xff00ff) + (i_1243_ & 0xff00ff);
								i_1243_ = ((i_1242_ & 0x1000100) + (i_1241_ - i_1242_ & 0x10000));
								is[i_1142_++] = i_1241_ - i_1243_ | i_1243_ - (i_1243_ >>> 8);
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else if (i_1138_ == 2) {
						int i_1244_ = i_1139_ >>> 24;
						int i_1245_ = 256 - i_1244_;
						int i_1246_ = (i_1139_ & 0xff00ff) * i_1245_ & ~0xff00ff;
						int i_1247_ = (i_1139_ & 0xff00) * i_1245_ & 0xff0000;
						i_1139_ = (i_1246_ | i_1247_) >>> 8;
						for (int i_1248_ = -i_1144_; i_1248_ < 0; i_1248_++) {
							for (int i_1249_ = -i_1145_; i_1249_ < 0; i_1249_++) {
								int i_1250_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1143_++]);
								if (i_1250_ != 0) {
									i_1246_ = ((i_1250_ & 0xff00ff) * i_1244_ & ~0xff00ff);
									i_1247_ = ((i_1250_ & 0xff00) * i_1244_ & 0xff0000);
									i_1250_ = (((i_1246_ | i_1247_) >>> 8) + i_1139_);
									int i_1251_ = is[i_1142_];
									int i_1252_ = i_1250_ + i_1251_;
									int i_1253_ = ((i_1250_ & 0xff00ff) + (i_1251_ & 0xff00ff));
									i_1251_ = ((i_1253_ & 0x1000100) + (i_1252_ - i_1253_ & 0x10000));
									is[i_1142_++] = (i_1252_ - i_1251_ | i_1251_ - (i_1251_ >>> 8));
								} else
									i_1142_++;
							}
							i_1142_ += i_1146_;
							i_1143_ += i_1147_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method708(int i, int i_1254_, Class_ta class_ta, int i_1255_, int i_1256_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			i += ((Class61_Sub3_Sub2) this).anInt9352;
			i_1254_ += ((Class61_Sub3_Sub2) this).anInt9327;
			int i_1257_ = 0;
			int i_1258_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			int i_1259_ = ((Class61_Sub3_Sub2) this).anInt9358;
			int i_1260_ = ((Class61_Sub3_Sub2) this).anInt9325;
			int i_1261_ = i_1258_ - i_1259_;
			int i_1262_ = 0;
			int i_1263_ = i + i_1254_ * i_1258_;
			if (i_1254_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1264_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1254_);
				i_1260_ -= i_1264_;
				i_1254_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_1257_ += i_1264_ * i_1259_;
				i_1263_ += i_1264_ * i_1258_;
			}
			if (i_1254_ + i_1260_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1260_ -= (i_1254_ + i_1260_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1265_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1259_ -= i_1265_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_1257_ += i_1265_;
				i_1263_ += i_1265_;
				i_1262_ += i_1265_;
				i_1261_ += i_1265_;
			}
			if (i + i_1259_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1266_ = (i + i_1259_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1259_ -= i_1266_;
				i_1262_ += i_1266_;
				i_1261_ += i_1266_;
			}
			if (i_1259_ > 0 && i_1260_ > 0) {
				Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
				int[] is_1267_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
				int[] is_1268_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
				int i_1269_ = i_1254_;
				if (i_1256_ > i_1269_) {
					i_1269_ = i_1256_;
					i_1263_ += (i_1256_ - i_1254_) * i_1258_;
					i_1257_ += ((i_1256_ - i_1254_) * ((Class61_Sub3_Sub2) this).anInt9358);
				}
				int i_1270_ = (i_1256_ + is_1267_.length < i_1254_ + i_1260_ ? i_1256_ + is_1267_.length : i_1254_ + i_1260_);
				for (int i_1271_ = i_1269_; i_1271_ < i_1270_; i_1271_++) {
					int i_1272_ = is_1267_[i_1271_ - i_1256_] + i_1255_;
					int i_1273_ = is_1268_[i_1271_ - i_1256_];
					int i_1274_ = i_1259_;
					if (i > i_1272_) {
						int i_1275_ = i - i_1272_;
						if (i_1275_ >= i_1273_) {
							i_1257_ += i_1259_ + i_1262_;
							i_1263_ += i_1259_ + i_1261_;
							continue;
						}
						i_1273_ -= i_1275_;
					} else {
						int i_1276_ = i_1272_ - i;
						if (i_1276_ >= i_1259_) {
							i_1257_ += i_1259_ + i_1262_;
							i_1263_ += i_1259_ + i_1261_;
							continue;
						}
						i_1257_ += i_1276_;
						i_1274_ -= i_1276_;
						i_1263_ += i_1276_;
					}
					int i_1277_ = 0;
					if (i_1274_ < i_1273_)
						i_1273_ = i_1274_;
					else
						i_1277_ = i_1274_ - i_1273_;
					for (int i_1278_ = -i_1273_; i_1278_ < 0; i_1278_++) {
						int i_1279_ = (((Class61_Sub3_Sub2) this).anIntArray10094[i_1257_++]);
						int i_1280_ = i_1279_ >>> 24;
						int i_1281_ = 256 - i_1280_;
						int i_1282_ = is[i_1263_];
						is[i_1263_++] = ((((i_1279_ & 0xff00ff) * i_1280_ + (i_1282_ & 0xff00ff) * i_1281_) & ~0xff00ff) + (((i_1279_ & 0xff00) * i_1280_ + (i_1282_ & 0xff00) * i_1281_) & 0xff0000)) >> 8;
					}
					i_1257_ += i_1277_ + i_1262_;
					i_1263_ += i_1277_ + i_1261_;
				}
			}
		}
	}

	void method709(int i, int i_1283_, int i_1284_, int i_1285_, int i_1286_, int i_1287_, int i_1288_, int i_1289_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1284_ > 0 && i_1285_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1290_ = 0;
				int i_1291_ = 0;
				int i_1292_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1293_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
				int i_1294_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
				int i_1295_ = (i_1293_ << 16) / i_1284_;
				int i_1296_ = (i_1294_ << 16) / i_1285_;
				if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
					int i_1297_ = ((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_1295_ - 1) / i_1295_;
					i += i_1297_;
					i_1290_ += (i_1297_ * i_1295_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
					int i_1298_ = ((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_1296_ - 1) / i_1296_;
					i_1283_ += i_1298_;
					i_1291_ += (i_1298_ * i_1296_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9358 < i_1293_)
					i_1284_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_1290_ + i_1295_ - 1) / i_1295_;
				if (((Class61_Sub3_Sub2) this).anInt9325 < i_1294_)
					i_1285_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_1291_ + i_1296_ - 1) / i_1296_;
				int i_1299_ = i + i_1283_ * i_1292_;
				int i_1300_ = i_1292_ - i_1284_;
				if (i_1283_ + i_1285_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1285_ -= (i_1283_ + i_1285_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1283_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1301_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1283_;
					i_1285_ -= i_1301_;
					i_1299_ += i_1301_ * i_1292_;
					i_1291_ += i_1296_ * i_1301_;
				}
				if (i + i_1284_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1302_ = (i + i_1284_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1284_ -= i_1302_;
					i_1300_ += i_1302_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1303_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1284_ -= i_1303_;
					i_1299_ += i_1303_;
					i_1290_ += i_1295_ * i_1303_;
					i_1300_ += i_1303_;
				}
				if (i_1288_ == 0) {
					if (i_1286_ == 1) {
						int i_1304_ = i_1290_;
						for (int i_1305_ = -i_1285_; i_1305_ < 0; i_1305_++) {
							int i_1306_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1307_ = -i_1284_; i_1307_ < 0; i_1307_++) {
								is[i_1299_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1306_]);
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1304_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 0) {
						int i_1308_ = (i_1287_ & 0xff0000) >> 16;
						int i_1309_ = (i_1287_ & 0xff00) >> 8;
						int i_1310_ = i_1287_ & 0xff;
						int i_1311_ = i_1290_;
						for (int i_1312_ = -i_1285_; i_1312_ < 0; i_1312_++) {
							int i_1313_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1314_ = -i_1284_; i_1314_ < 0; i_1314_++) {
								int i_1315_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1313_]);
								int i_1316_ = ((i_1315_ & 0xff0000) * i_1308_ & ~0xffffff);
								int i_1317_ = (i_1315_ & 0xff00) * i_1309_ & 0xff0000;
								int i_1318_ = (i_1315_ & 0xff) * i_1310_ & 0xff00;
								is[i_1299_++] = (i_1316_ | i_1317_ | i_1318_) >>> 8;
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1311_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 3) {
						int i_1319_ = i_1290_;
						for (int i_1320_ = -i_1285_; i_1320_ < 0; i_1320_++) {
							int i_1321_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1322_ = -i_1284_; i_1322_ < 0; i_1322_++) {
								int i_1323_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1321_]);
								int i_1324_ = i_1323_ + i_1287_;
								int i_1325_ = ((i_1323_ & 0xff00ff) + (i_1287_ & 0xff00ff));
								int i_1326_ = ((i_1325_ & 0x1000100) + (i_1324_ - i_1325_ & 0x10000));
								is[i_1299_++] = i_1324_ - i_1326_ | i_1326_ - (i_1326_ >>> 8);
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1319_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 2) {
						int i_1327_ = i_1287_ >>> 24;
						int i_1328_ = 256 - i_1327_;
						int i_1329_ = (i_1287_ & 0xff00ff) * i_1328_ & ~0xff00ff;
						int i_1330_ = (i_1287_ & 0xff00) * i_1328_ & 0xff0000;
						i_1287_ = (i_1329_ | i_1330_) >>> 8;
						int i_1331_ = i_1290_;
						for (int i_1332_ = -i_1285_; i_1332_ < 0; i_1332_++) {
							int i_1333_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1334_ = -i_1284_; i_1334_ < 0; i_1334_++) {
								int i_1335_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1333_]);
								i_1329_ = ((i_1335_ & 0xff00ff) * i_1327_ & ~0xff00ff);
								i_1330_ = (i_1335_ & 0xff00) * i_1327_ & 0xff0000;
								is[i_1299_++] = ((i_1329_ | i_1330_) >>> 8) + i_1287_;
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1331_;
							i_1299_ += i_1300_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1288_ == 1) {
					if (i_1286_ == 1) {
						int i_1336_ = i_1290_;
						for (int i_1337_ = -i_1285_; i_1337_ < 0; i_1337_++) {
							int i_1338_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1339_ = -i_1284_; i_1339_ < 0; i_1339_++) {
								int i_1340_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1338_]);
								int i_1341_ = i_1340_ >>> 24;
								int i_1342_ = 256 - i_1341_;
								int i_1343_ = is[i_1299_];
								is[i_1299_++] = (((((i_1340_ & 0xff00ff) * i_1341_ + (i_1343_ & 0xff00ff) * i_1342_) & ~0xff00ff) >> 8) + (((((i_1340_ & ~0xff00ff) >>> 8) * i_1341_) + (((i_1343_ & ~0xff00ff) >>> 8) * i_1342_)) & ~0xff00ff));
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1336_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 0) {
						int i_1344_ = i_1290_;
						if ((i_1287_ & 0xffffff) == 16777215) {
							for (int i_1345_ = -i_1285_; i_1345_ < 0; i_1345_++) {
								int i_1346_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_1347_ = -i_1284_; i_1347_ < 0; i_1347_++) {
									int i_1348_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1346_]);
									int i_1349_ = ((i_1348_ >>> 24) * (i_1287_ >>> 24) >> 8);
									int i_1350_ = 256 - i_1349_;
									int i_1351_ = is[i_1299_];
									is[i_1299_++] = ((((i_1348_ & 0xff00ff) * i_1349_ + (i_1351_ & 0xff00ff) * i_1350_) & ~0xff00ff) + (((i_1348_ & 0xff00) * i_1349_ + (i_1351_ & 0xff00) * i_1350_) & 0xff0000)) >> 8;
									i_1290_ += i_1295_;
								}
								i_1291_ += i_1296_;
								i_1290_ = i_1344_;
								i_1299_ += i_1300_;
							}
						} else {
							int i_1352_ = (i_1287_ & 0xff0000) >> 16;
							int i_1353_ = (i_1287_ & 0xff00) >> 8;
							int i_1354_ = i_1287_ & 0xff;
							for (int i_1355_ = -i_1285_; i_1355_ < 0; i_1355_++) {
								int i_1356_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_1357_ = -i_1284_; i_1357_ < 0; i_1357_++) {
									int i_1358_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1356_]);
									int i_1359_ = ((i_1358_ >>> 24) * (i_1287_ >>> 24) >> 8);
									int i_1360_ = 256 - i_1359_;
									if (i_1359_ != 255) {
										int i_1361_ = ((i_1358_ & 0xff0000) * i_1352_ & ~0xffffff);
										int i_1362_ = ((i_1358_ & 0xff00) * i_1353_ & 0xff0000);
										int i_1363_ = ((i_1358_ & 0xff) * i_1354_ & 0xff00);
										i_1358_ = (i_1361_ | i_1362_ | i_1363_) >>> 8;
										int i_1364_ = is[i_1299_];
										is[i_1299_++] = ((((i_1358_ & 0xff00ff) * i_1359_ + ((i_1364_ & 0xff00ff) * i_1360_)) & ~0xff00ff) + (((i_1358_ & 0xff00) * i_1359_ + ((i_1364_ & 0xff00) * i_1360_)) & 0xff0000)) >> 8;
									} else {
										int i_1365_ = ((i_1358_ & 0xff0000) * i_1352_ & ~0xffffff);
										int i_1366_ = ((i_1358_ & 0xff00) * i_1353_ & 0xff0000);
										int i_1367_ = ((i_1358_ & 0xff) * i_1354_ & 0xff00);
										is[i_1299_++] = (i_1365_ | i_1366_ | i_1367_) >>> 8;
									}
									i_1290_ += i_1295_;
								}
								i_1291_ += i_1296_;
								i_1290_ = i_1344_;
								i_1299_ += i_1300_;
							}
						}
					} else if (i_1286_ == 3) {
						int i_1368_ = i_1290_;
						for (int i_1369_ = -i_1285_; i_1369_ < 0; i_1369_++) {
							int i_1370_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1371_ = -i_1284_; i_1371_ < 0; i_1371_++) {
								int i_1372_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1370_]);
								int i_1373_ = i_1372_ + i_1287_;
								int i_1374_ = ((i_1372_ & 0xff00ff) + (i_1287_ & 0xff00ff));
								int i_1375_ = ((i_1374_ & 0x1000100) + (i_1373_ - i_1374_ & 0x10000));
								i_1375_ = i_1373_ - i_1375_ | i_1375_ - (i_1375_ >>> 8);
								int i_1376_ = (i_1375_ >>> 24) * (i_1287_ >>> 24) >> 8;
								int i_1377_ = 256 - i_1376_;
								if (i_1376_ != 255) {
									i_1372_ = i_1375_;
									i_1375_ = is[i_1299_];
									i_1375_ = ((((i_1372_ & 0xff00ff) * i_1376_ + (i_1375_ & 0xff00ff) * i_1377_) & ~0xff00ff) + (((i_1372_ & 0xff00) * i_1376_ + (i_1375_ & 0xff00) * i_1377_) & 0xff0000)) >> 8;
								}
								is[i_1299_++] = i_1375_;
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1368_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 2) {
						int i_1378_ = i_1287_ >>> 24;
						int i_1379_ = 256 - i_1378_;
						int i_1380_ = (i_1287_ & 0xff00ff) * i_1379_ & ~0xff00ff;
						int i_1381_ = (i_1287_ & 0xff00) * i_1379_ & 0xff0000;
						i_1287_ = (i_1380_ | i_1381_) >>> 8;
						int i_1382_ = i_1290_;
						for (int i_1383_ = -i_1285_; i_1383_ < 0; i_1383_++) {
							int i_1384_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1385_ = -i_1284_; i_1385_ < 0; i_1385_++) {
								int i_1386_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1384_]);
								int i_1387_ = i_1386_ >>> 24;
								int i_1388_ = 256 - i_1387_;
								i_1380_ = ((i_1386_ & 0xff00ff) * i_1378_ & ~0xff00ff);
								i_1381_ = (i_1386_ & 0xff00) * i_1378_ & 0xff0000;
								i_1386_ = ((i_1380_ | i_1381_) >>> 8) + i_1287_;
								int i_1389_ = is[i_1299_];
								is[i_1299_++] = ((((i_1386_ & 0xff00ff) * i_1387_ + (i_1389_ & 0xff00ff) * i_1388_) & ~0xff00ff) + (((i_1386_ & 0xff00) * i_1387_ + (i_1389_ & 0xff00) * i_1388_) & 0xff0000)) >> 8;
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1382_;
							i_1299_ += i_1300_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1288_ == 2) {
					if (i_1286_ == 1) {
						int i_1390_ = i_1290_;
						for (int i_1391_ = -i_1285_; i_1391_ < 0; i_1391_++) {
							int i_1392_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1393_ = -i_1284_; i_1393_ < 0; i_1393_++) {
								int i_1394_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1392_]);
								if (i_1394_ != 0) {
									int i_1395_ = is[i_1299_];
									int i_1396_ = i_1394_ + i_1395_;
									int i_1397_ = ((i_1394_ & 0xff00ff) + (i_1395_ & 0xff00ff));
									i_1395_ = ((i_1397_ & 0x1000100) + (i_1396_ - i_1397_ & 0x10000));
									is[i_1299_++] = (i_1396_ - i_1395_ | i_1395_ - (i_1395_ >>> 8));
								} else
									i_1299_++;
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1390_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 0) {
						int i_1398_ = i_1290_;
						int i_1399_ = (i_1287_ & 0xff0000) >> 16;
						int i_1400_ = (i_1287_ & 0xff00) >> 8;
						int i_1401_ = i_1287_ & 0xff;
						for (int i_1402_ = -i_1285_; i_1402_ < 0; i_1402_++) {
							int i_1403_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1404_ = -i_1284_; i_1404_ < 0; i_1404_++) {
								int i_1405_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1403_]);
								if (i_1405_ != 0) {
									int i_1406_ = ((i_1405_ & 0xff0000) * i_1399_ & ~0xffffff);
									int i_1407_ = ((i_1405_ & 0xff00) * i_1400_ & 0xff0000);
									int i_1408_ = (i_1405_ & 0xff) * i_1401_ & 0xff00;
									i_1405_ = (i_1406_ | i_1407_ | i_1408_) >>> 8;
									int i_1409_ = is[i_1299_];
									int i_1410_ = i_1405_ + i_1409_;
									int i_1411_ = ((i_1405_ & 0xff00ff) + (i_1409_ & 0xff00ff));
									i_1409_ = ((i_1411_ & 0x1000100) + (i_1410_ - i_1411_ & 0x10000));
									is[i_1299_++] = (i_1410_ - i_1409_ | i_1409_ - (i_1409_ >>> 8));
								} else
									i_1299_++;
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1398_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 3) {
						int i_1412_ = i_1290_;
						for (int i_1413_ = -i_1285_; i_1413_ < 0; i_1413_++) {
							int i_1414_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1415_ = -i_1284_; i_1415_ < 0; i_1415_++) {
								int i_1416_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1414_]);
								int i_1417_ = i_1416_ + i_1287_;
								int i_1418_ = ((i_1416_ & 0xff00ff) + (i_1287_ & 0xff00ff));
								int i_1419_ = ((i_1418_ & 0x1000100) + (i_1417_ - i_1418_ & 0x10000));
								i_1416_ = i_1417_ - i_1419_ | i_1419_ - (i_1419_ >>> 8);
								i_1419_ = is[i_1299_];
								i_1417_ = i_1416_ + i_1419_;
								i_1418_ = (i_1416_ & 0xff00ff) + (i_1419_ & 0xff00ff);
								i_1419_ = ((i_1418_ & 0x1000100) + (i_1417_ - i_1418_ & 0x10000));
								is[i_1299_++] = i_1417_ - i_1419_ | i_1419_ - (i_1419_ >>> 8);
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1412_;
							i_1299_ += i_1300_;
						}
					} else if (i_1286_ == 2) {
						int i_1420_ = i_1287_ >>> 24;
						int i_1421_ = 256 - i_1420_;
						int i_1422_ = (i_1287_ & 0xff00ff) * i_1421_ & ~0xff00ff;
						int i_1423_ = (i_1287_ & 0xff00) * i_1421_ & 0xff0000;
						i_1287_ = (i_1422_ | i_1423_) >>> 8;
						int i_1424_ = i_1290_;
						for (int i_1425_ = -i_1285_; i_1425_ < 0; i_1425_++) {
							int i_1426_ = ((i_1291_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1427_ = -i_1284_; i_1427_ < 0; i_1427_++) {
								int i_1428_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1290_ >> 16) + i_1426_]);
								if (i_1428_ != 0) {
									i_1422_ = ((i_1428_ & 0xff00ff) * i_1420_ & ~0xff00ff);
									i_1423_ = ((i_1428_ & 0xff00) * i_1420_ & 0xff0000);
									i_1428_ = (((i_1422_ | i_1423_) >>> 8) + i_1287_);
									int i_1429_ = is[i_1299_];
									int i_1430_ = i_1428_ + i_1429_;
									int i_1431_ = ((i_1428_ & 0xff00ff) + (i_1429_ & 0xff00ff));
									i_1429_ = ((i_1431_ & 0x1000100) + (i_1430_ - i_1431_ & 0x10000));
									is[i_1299_++] = (i_1430_ - i_1429_ | i_1429_ - (i_1429_ >>> 8));
								} else
									i_1299_++;
								i_1290_ += i_1295_;
							}
							i_1291_ += i_1296_;
							i_1290_ = i_1424_;
							i_1299_ += i_1300_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method706(int i, int i_1432_, int i_1433_, int i_1434_, int i_1435_, int i_1436_, int i_1437_, int i_1438_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1433_ > 0 && i_1434_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1439_ = 0;
				int i_1440_ = 0;
				int i_1441_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1442_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
				int i_1443_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
				int i_1444_ = (i_1442_ << 16) / i_1433_;
				int i_1445_ = (i_1443_ << 16) / i_1434_;
				if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
					int i_1446_ = ((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_1444_ - 1) / i_1444_;
					i += i_1446_;
					i_1439_ += (i_1446_ * i_1444_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
					int i_1447_ = ((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_1445_ - 1) / i_1445_;
					i_1432_ += i_1447_;
					i_1440_ += (i_1447_ * i_1445_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9358 < i_1442_)
					i_1433_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_1439_ + i_1444_ - 1) / i_1444_;
				if (((Class61_Sub3_Sub2) this).anInt9325 < i_1443_)
					i_1434_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_1440_ + i_1445_ - 1) / i_1445_;
				int i_1448_ = i + i_1432_ * i_1441_;
				int i_1449_ = i_1441_ - i_1433_;
				if (i_1432_ + i_1434_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1434_ -= (i_1432_ + i_1434_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1432_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1450_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1432_;
					i_1434_ -= i_1450_;
					i_1448_ += i_1450_ * i_1441_;
					i_1440_ += i_1445_ * i_1450_;
				}
				if (i + i_1433_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1451_ = (i + i_1433_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1433_ -= i_1451_;
					i_1449_ += i_1451_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1452_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1433_ -= i_1452_;
					i_1448_ += i_1452_;
					i_1439_ += i_1444_ * i_1452_;
					i_1449_ += i_1452_;
				}
				if (i_1437_ == 0) {
					if (i_1435_ == 1) {
						int i_1453_ = i_1439_;
						for (int i_1454_ = -i_1434_; i_1454_ < 0; i_1454_++) {
							int i_1455_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1456_ = -i_1433_; i_1456_ < 0; i_1456_++) {
								is[i_1448_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1455_]);
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1453_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 0) {
						int i_1457_ = (i_1436_ & 0xff0000) >> 16;
						int i_1458_ = (i_1436_ & 0xff00) >> 8;
						int i_1459_ = i_1436_ & 0xff;
						int i_1460_ = i_1439_;
						for (int i_1461_ = -i_1434_; i_1461_ < 0; i_1461_++) {
							int i_1462_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1463_ = -i_1433_; i_1463_ < 0; i_1463_++) {
								int i_1464_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1462_]);
								int i_1465_ = ((i_1464_ & 0xff0000) * i_1457_ & ~0xffffff);
								int i_1466_ = (i_1464_ & 0xff00) * i_1458_ & 0xff0000;
								int i_1467_ = (i_1464_ & 0xff) * i_1459_ & 0xff00;
								is[i_1448_++] = (i_1465_ | i_1466_ | i_1467_) >>> 8;
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1460_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 3) {
						int i_1468_ = i_1439_;
						for (int i_1469_ = -i_1434_; i_1469_ < 0; i_1469_++) {
							int i_1470_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1471_ = -i_1433_; i_1471_ < 0; i_1471_++) {
								int i_1472_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1470_]);
								int i_1473_ = i_1472_ + i_1436_;
								int i_1474_ = ((i_1472_ & 0xff00ff) + (i_1436_ & 0xff00ff));
								int i_1475_ = ((i_1474_ & 0x1000100) + (i_1473_ - i_1474_ & 0x10000));
								is[i_1448_++] = i_1473_ - i_1475_ | i_1475_ - (i_1475_ >>> 8);
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1468_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 2) {
						int i_1476_ = i_1436_ >>> 24;
						int i_1477_ = 256 - i_1476_;
						int i_1478_ = (i_1436_ & 0xff00ff) * i_1477_ & ~0xff00ff;
						int i_1479_ = (i_1436_ & 0xff00) * i_1477_ & 0xff0000;
						i_1436_ = (i_1478_ | i_1479_) >>> 8;
						int i_1480_ = i_1439_;
						for (int i_1481_ = -i_1434_; i_1481_ < 0; i_1481_++) {
							int i_1482_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1483_ = -i_1433_; i_1483_ < 0; i_1483_++) {
								int i_1484_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1482_]);
								i_1478_ = ((i_1484_ & 0xff00ff) * i_1476_ & ~0xff00ff);
								i_1479_ = (i_1484_ & 0xff00) * i_1476_ & 0xff0000;
								is[i_1448_++] = ((i_1478_ | i_1479_) >>> 8) + i_1436_;
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1480_;
							i_1448_ += i_1449_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1437_ == 1) {
					if (i_1435_ == 1) {
						int i_1485_ = i_1439_;
						for (int i_1486_ = -i_1434_; i_1486_ < 0; i_1486_++) {
							int i_1487_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1488_ = -i_1433_; i_1488_ < 0; i_1488_++) {
								int i_1489_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1487_]);
								int i_1490_ = i_1489_ >>> 24;
								int i_1491_ = 256 - i_1490_;
								int i_1492_ = is[i_1448_];
								is[i_1448_++] = (((((i_1489_ & 0xff00ff) * i_1490_ + (i_1492_ & 0xff00ff) * i_1491_) & ~0xff00ff) >> 8) + (((((i_1489_ & ~0xff00ff) >>> 8) * i_1490_) + (((i_1492_ & ~0xff00ff) >>> 8) * i_1491_)) & ~0xff00ff));
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1485_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 0) {
						int i_1493_ = i_1439_;
						if ((i_1436_ & 0xffffff) == 16777215) {
							for (int i_1494_ = -i_1434_; i_1494_ < 0; i_1494_++) {
								int i_1495_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_1496_ = -i_1433_; i_1496_ < 0; i_1496_++) {
									int i_1497_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1495_]);
									int i_1498_ = ((i_1497_ >>> 24) * (i_1436_ >>> 24) >> 8);
									int i_1499_ = 256 - i_1498_;
									int i_1500_ = is[i_1448_];
									is[i_1448_++] = ((((i_1497_ & 0xff00ff) * i_1498_ + (i_1500_ & 0xff00ff) * i_1499_) & ~0xff00ff) + (((i_1497_ & 0xff00) * i_1498_ + (i_1500_ & 0xff00) * i_1499_) & 0xff0000)) >> 8;
									i_1439_ += i_1444_;
								}
								i_1440_ += i_1445_;
								i_1439_ = i_1493_;
								i_1448_ += i_1449_;
							}
						} else {
							int i_1501_ = (i_1436_ & 0xff0000) >> 16;
							int i_1502_ = (i_1436_ & 0xff00) >> 8;
							int i_1503_ = i_1436_ & 0xff;
							for (int i_1504_ = -i_1434_; i_1504_ < 0; i_1504_++) {
								int i_1505_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_1506_ = -i_1433_; i_1506_ < 0; i_1506_++) {
									int i_1507_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1505_]);
									int i_1508_ = ((i_1507_ >>> 24) * (i_1436_ >>> 24) >> 8);
									int i_1509_ = 256 - i_1508_;
									if (i_1508_ != 255) {
										int i_1510_ = ((i_1507_ & 0xff0000) * i_1501_ & ~0xffffff);
										int i_1511_ = ((i_1507_ & 0xff00) * i_1502_ & 0xff0000);
										int i_1512_ = ((i_1507_ & 0xff) * i_1503_ & 0xff00);
										i_1507_ = (i_1510_ | i_1511_ | i_1512_) >>> 8;
										int i_1513_ = is[i_1448_];
										is[i_1448_++] = ((((i_1507_ & 0xff00ff) * i_1508_ + ((i_1513_ & 0xff00ff) * i_1509_)) & ~0xff00ff) + (((i_1507_ & 0xff00) * i_1508_ + ((i_1513_ & 0xff00) * i_1509_)) & 0xff0000)) >> 8;
									} else {
										int i_1514_ = ((i_1507_ & 0xff0000) * i_1501_ & ~0xffffff);
										int i_1515_ = ((i_1507_ & 0xff00) * i_1502_ & 0xff0000);
										int i_1516_ = ((i_1507_ & 0xff) * i_1503_ & 0xff00);
										is[i_1448_++] = (i_1514_ | i_1515_ | i_1516_) >>> 8;
									}
									i_1439_ += i_1444_;
								}
								i_1440_ += i_1445_;
								i_1439_ = i_1493_;
								i_1448_ += i_1449_;
							}
						}
					} else if (i_1435_ == 3) {
						int i_1517_ = i_1439_;
						for (int i_1518_ = -i_1434_; i_1518_ < 0; i_1518_++) {
							int i_1519_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1520_ = -i_1433_; i_1520_ < 0; i_1520_++) {
								int i_1521_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1519_]);
								int i_1522_ = i_1521_ + i_1436_;
								int i_1523_ = ((i_1521_ & 0xff00ff) + (i_1436_ & 0xff00ff));
								int i_1524_ = ((i_1523_ & 0x1000100) + (i_1522_ - i_1523_ & 0x10000));
								i_1524_ = i_1522_ - i_1524_ | i_1524_ - (i_1524_ >>> 8);
								int i_1525_ = (i_1524_ >>> 24) * (i_1436_ >>> 24) >> 8;
								int i_1526_ = 256 - i_1525_;
								if (i_1525_ != 255) {
									i_1521_ = i_1524_;
									i_1524_ = is[i_1448_];
									i_1524_ = ((((i_1521_ & 0xff00ff) * i_1525_ + (i_1524_ & 0xff00ff) * i_1526_) & ~0xff00ff) + (((i_1521_ & 0xff00) * i_1525_ + (i_1524_ & 0xff00) * i_1526_) & 0xff0000)) >> 8;
								}
								is[i_1448_++] = i_1524_;
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1517_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 2) {
						int i_1527_ = i_1436_ >>> 24;
						int i_1528_ = 256 - i_1527_;
						int i_1529_ = (i_1436_ & 0xff00ff) * i_1528_ & ~0xff00ff;
						int i_1530_ = (i_1436_ & 0xff00) * i_1528_ & 0xff0000;
						i_1436_ = (i_1529_ | i_1530_) >>> 8;
						int i_1531_ = i_1439_;
						for (int i_1532_ = -i_1434_; i_1532_ < 0; i_1532_++) {
							int i_1533_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1534_ = -i_1433_; i_1534_ < 0; i_1534_++) {
								int i_1535_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1533_]);
								int i_1536_ = i_1535_ >>> 24;
								int i_1537_ = 256 - i_1536_;
								i_1529_ = ((i_1535_ & 0xff00ff) * i_1527_ & ~0xff00ff);
								i_1530_ = (i_1535_ & 0xff00) * i_1527_ & 0xff0000;
								i_1535_ = ((i_1529_ | i_1530_) >>> 8) + i_1436_;
								int i_1538_ = is[i_1448_];
								is[i_1448_++] = ((((i_1535_ & 0xff00ff) * i_1536_ + (i_1538_ & 0xff00ff) * i_1537_) & ~0xff00ff) + (((i_1535_ & 0xff00) * i_1536_ + (i_1538_ & 0xff00) * i_1537_) & 0xff0000)) >> 8;
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1531_;
							i_1448_ += i_1449_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1437_ == 2) {
					if (i_1435_ == 1) {
						int i_1539_ = i_1439_;
						for (int i_1540_ = -i_1434_; i_1540_ < 0; i_1540_++) {
							int i_1541_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1542_ = -i_1433_; i_1542_ < 0; i_1542_++) {
								int i_1543_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1541_]);
								if (i_1543_ != 0) {
									int i_1544_ = is[i_1448_];
									int i_1545_ = i_1543_ + i_1544_;
									int i_1546_ = ((i_1543_ & 0xff00ff) + (i_1544_ & 0xff00ff));
									i_1544_ = ((i_1546_ & 0x1000100) + (i_1545_ - i_1546_ & 0x10000));
									is[i_1448_++] = (i_1545_ - i_1544_ | i_1544_ - (i_1544_ >>> 8));
								} else
									i_1448_++;
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1539_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 0) {
						int i_1547_ = i_1439_;
						int i_1548_ = (i_1436_ & 0xff0000) >> 16;
						int i_1549_ = (i_1436_ & 0xff00) >> 8;
						int i_1550_ = i_1436_ & 0xff;
						for (int i_1551_ = -i_1434_; i_1551_ < 0; i_1551_++) {
							int i_1552_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1553_ = -i_1433_; i_1553_ < 0; i_1553_++) {
								int i_1554_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1552_]);
								if (i_1554_ != 0) {
									int i_1555_ = ((i_1554_ & 0xff0000) * i_1548_ & ~0xffffff);
									int i_1556_ = ((i_1554_ & 0xff00) * i_1549_ & 0xff0000);
									int i_1557_ = (i_1554_ & 0xff) * i_1550_ & 0xff00;
									i_1554_ = (i_1555_ | i_1556_ | i_1557_) >>> 8;
									int i_1558_ = is[i_1448_];
									int i_1559_ = i_1554_ + i_1558_;
									int i_1560_ = ((i_1554_ & 0xff00ff) + (i_1558_ & 0xff00ff));
									i_1558_ = ((i_1560_ & 0x1000100) + (i_1559_ - i_1560_ & 0x10000));
									is[i_1448_++] = (i_1559_ - i_1558_ | i_1558_ - (i_1558_ >>> 8));
								} else
									i_1448_++;
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1547_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 3) {
						int i_1561_ = i_1439_;
						for (int i_1562_ = -i_1434_; i_1562_ < 0; i_1562_++) {
							int i_1563_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1564_ = -i_1433_; i_1564_ < 0; i_1564_++) {
								int i_1565_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1563_]);
								int i_1566_ = i_1565_ + i_1436_;
								int i_1567_ = ((i_1565_ & 0xff00ff) + (i_1436_ & 0xff00ff));
								int i_1568_ = ((i_1567_ & 0x1000100) + (i_1566_ - i_1567_ & 0x10000));
								i_1565_ = i_1566_ - i_1568_ | i_1568_ - (i_1568_ >>> 8);
								i_1568_ = is[i_1448_];
								i_1566_ = i_1565_ + i_1568_;
								i_1567_ = (i_1565_ & 0xff00ff) + (i_1568_ & 0xff00ff);
								i_1568_ = ((i_1567_ & 0x1000100) + (i_1566_ - i_1567_ & 0x10000));
								is[i_1448_++] = i_1566_ - i_1568_ | i_1568_ - (i_1568_ >>> 8);
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1561_;
							i_1448_ += i_1449_;
						}
					} else if (i_1435_ == 2) {
						int i_1569_ = i_1436_ >>> 24;
						int i_1570_ = 256 - i_1569_;
						int i_1571_ = (i_1436_ & 0xff00ff) * i_1570_ & ~0xff00ff;
						int i_1572_ = (i_1436_ & 0xff00) * i_1570_ & 0xff0000;
						i_1436_ = (i_1571_ | i_1572_) >>> 8;
						int i_1573_ = i_1439_;
						for (int i_1574_ = -i_1434_; i_1574_ < 0; i_1574_++) {
							int i_1575_ = ((i_1440_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1576_ = -i_1433_; i_1576_ < 0; i_1576_++) {
								int i_1577_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1439_ >> 16) + i_1575_]);
								if (i_1577_ != 0) {
									i_1571_ = ((i_1577_ & 0xff00ff) * i_1569_ & ~0xff00ff);
									i_1572_ = ((i_1577_ & 0xff00) * i_1569_ & 0xff0000);
									i_1577_ = (((i_1571_ | i_1572_) >>> 8) + i_1436_);
									int i_1578_ = is[i_1448_];
									int i_1579_ = i_1577_ + i_1578_;
									int i_1580_ = ((i_1577_ & 0xff00ff) + (i_1578_ & 0xff00ff));
									i_1578_ = ((i_1580_ & 0x1000100) + (i_1579_ - i_1580_ & 0x10000));
									is[i_1448_++] = (i_1579_ - i_1578_ | i_1578_ - (i_1578_ >>> 8));
								} else
									i_1448_++;
								i_1439_ += i_1444_;
							}
							i_1440_ += i_1445_;
							i_1439_ = i_1573_;
							i_1448_ += i_1449_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method712(int i, int i_1581_, int i_1582_, int i_1583_, int i_1584_, int i_1585_, int i_1586_, int i_1587_) {
		if (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1582_ > 0 && i_1583_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1588_ = 0;
				int i_1589_ = 0;
				int i_1590_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1591_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
				int i_1592_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
				int i_1593_ = (i_1591_ << 16) / i_1582_;
				int i_1594_ = (i_1592_ << 16) / i_1583_;
				if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
					int i_1595_ = ((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_1593_ - 1) / i_1593_;
					i += i_1595_;
					i_1588_ += (i_1595_ * i_1593_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
					int i_1596_ = ((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_1594_ - 1) / i_1594_;
					i_1581_ += i_1596_;
					i_1589_ += (i_1596_ * i_1594_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub2) this).anInt9358 < i_1591_)
					i_1582_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_1588_ + i_1593_ - 1) / i_1593_;
				if (((Class61_Sub3_Sub2) this).anInt9325 < i_1592_)
					i_1583_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_1589_ + i_1594_ - 1) / i_1594_;
				int i_1597_ = i + i_1581_ * i_1590_;
				int i_1598_ = i_1590_ - i_1582_;
				if (i_1581_ + i_1583_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1583_ -= (i_1581_ + i_1583_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1581_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1599_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1581_;
					i_1583_ -= i_1599_;
					i_1597_ += i_1599_ * i_1590_;
					i_1589_ += i_1594_ * i_1599_;
				}
				if (i + i_1582_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1600_ = (i + i_1582_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1582_ -= i_1600_;
					i_1598_ += i_1600_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1601_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1582_ -= i_1601_;
					i_1597_ += i_1601_;
					i_1588_ += i_1593_ * i_1601_;
					i_1598_ += i_1601_;
				}
				if (i_1586_ == 0) {
					if (i_1584_ == 1) {
						int i_1602_ = i_1588_;
						for (int i_1603_ = -i_1583_; i_1603_ < 0; i_1603_++) {
							int i_1604_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1605_ = -i_1582_; i_1605_ < 0; i_1605_++) {
								is[i_1597_++] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1604_]);
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1602_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 0) {
						int i_1606_ = (i_1585_ & 0xff0000) >> 16;
						int i_1607_ = (i_1585_ & 0xff00) >> 8;
						int i_1608_ = i_1585_ & 0xff;
						int i_1609_ = i_1588_;
						for (int i_1610_ = -i_1583_; i_1610_ < 0; i_1610_++) {
							int i_1611_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1612_ = -i_1582_; i_1612_ < 0; i_1612_++) {
								int i_1613_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1611_]);
								int i_1614_ = ((i_1613_ & 0xff0000) * i_1606_ & ~0xffffff);
								int i_1615_ = (i_1613_ & 0xff00) * i_1607_ & 0xff0000;
								int i_1616_ = (i_1613_ & 0xff) * i_1608_ & 0xff00;
								is[i_1597_++] = (i_1614_ | i_1615_ | i_1616_) >>> 8;
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1609_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 3) {
						int i_1617_ = i_1588_;
						for (int i_1618_ = -i_1583_; i_1618_ < 0; i_1618_++) {
							int i_1619_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1620_ = -i_1582_; i_1620_ < 0; i_1620_++) {
								int i_1621_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1619_]);
								int i_1622_ = i_1621_ + i_1585_;
								int i_1623_ = ((i_1621_ & 0xff00ff) + (i_1585_ & 0xff00ff));
								int i_1624_ = ((i_1623_ & 0x1000100) + (i_1622_ - i_1623_ & 0x10000));
								is[i_1597_++] = i_1622_ - i_1624_ | i_1624_ - (i_1624_ >>> 8);
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1617_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 2) {
						int i_1625_ = i_1585_ >>> 24;
						int i_1626_ = 256 - i_1625_;
						int i_1627_ = (i_1585_ & 0xff00ff) * i_1626_ & ~0xff00ff;
						int i_1628_ = (i_1585_ & 0xff00) * i_1626_ & 0xff0000;
						i_1585_ = (i_1627_ | i_1628_) >>> 8;
						int i_1629_ = i_1588_;
						for (int i_1630_ = -i_1583_; i_1630_ < 0; i_1630_++) {
							int i_1631_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1632_ = -i_1582_; i_1632_ < 0; i_1632_++) {
								int i_1633_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1631_]);
								i_1627_ = ((i_1633_ & 0xff00ff) * i_1625_ & ~0xff00ff);
								i_1628_ = (i_1633_ & 0xff00) * i_1625_ & 0xff0000;
								is[i_1597_++] = ((i_1627_ | i_1628_) >>> 8) + i_1585_;
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1629_;
							i_1597_ += i_1598_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1586_ == 1) {
					if (i_1584_ == 1) {
						int i_1634_ = i_1588_;
						for (int i_1635_ = -i_1583_; i_1635_ < 0; i_1635_++) {
							int i_1636_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1637_ = -i_1582_; i_1637_ < 0; i_1637_++) {
								int i_1638_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1636_]);
								int i_1639_ = i_1638_ >>> 24;
								int i_1640_ = 256 - i_1639_;
								int i_1641_ = is[i_1597_];
								is[i_1597_++] = (((((i_1638_ & 0xff00ff) * i_1639_ + (i_1641_ & 0xff00ff) * i_1640_) & ~0xff00ff) >> 8) + (((((i_1638_ & ~0xff00ff) >>> 8) * i_1639_) + (((i_1641_ & ~0xff00ff) >>> 8) * i_1640_)) & ~0xff00ff));
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1634_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 0) {
						int i_1642_ = i_1588_;
						if ((i_1585_ & 0xffffff) == 16777215) {
							for (int i_1643_ = -i_1583_; i_1643_ < 0; i_1643_++) {
								int i_1644_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_1645_ = -i_1582_; i_1645_ < 0; i_1645_++) {
									int i_1646_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1644_]);
									int i_1647_ = ((i_1646_ >>> 24) * (i_1585_ >>> 24) >> 8);
									int i_1648_ = 256 - i_1647_;
									int i_1649_ = is[i_1597_];
									is[i_1597_++] = ((((i_1646_ & 0xff00ff) * i_1647_ + (i_1649_ & 0xff00ff) * i_1648_) & ~0xff00ff) + (((i_1646_ & 0xff00) * i_1647_ + (i_1649_ & 0xff00) * i_1648_) & 0xff0000)) >> 8;
									i_1588_ += i_1593_;
								}
								i_1589_ += i_1594_;
								i_1588_ = i_1642_;
								i_1597_ += i_1598_;
							}
						} else {
							int i_1650_ = (i_1585_ & 0xff0000) >> 16;
							int i_1651_ = (i_1585_ & 0xff00) >> 8;
							int i_1652_ = i_1585_ & 0xff;
							for (int i_1653_ = -i_1583_; i_1653_ < 0; i_1653_++) {
								int i_1654_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
								for (int i_1655_ = -i_1582_; i_1655_ < 0; i_1655_++) {
									int i_1656_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1654_]);
									int i_1657_ = ((i_1656_ >>> 24) * (i_1585_ >>> 24) >> 8);
									int i_1658_ = 256 - i_1657_;
									if (i_1657_ != 255) {
										int i_1659_ = ((i_1656_ & 0xff0000) * i_1650_ & ~0xffffff);
										int i_1660_ = ((i_1656_ & 0xff00) * i_1651_ & 0xff0000);
										int i_1661_ = ((i_1656_ & 0xff) * i_1652_ & 0xff00);
										i_1656_ = (i_1659_ | i_1660_ | i_1661_) >>> 8;
										int i_1662_ = is[i_1597_];
										is[i_1597_++] = ((((i_1656_ & 0xff00ff) * i_1657_ + ((i_1662_ & 0xff00ff) * i_1658_)) & ~0xff00ff) + (((i_1656_ & 0xff00) * i_1657_ + ((i_1662_ & 0xff00) * i_1658_)) & 0xff0000)) >> 8;
									} else {
										int i_1663_ = ((i_1656_ & 0xff0000) * i_1650_ & ~0xffffff);
										int i_1664_ = ((i_1656_ & 0xff00) * i_1651_ & 0xff0000);
										int i_1665_ = ((i_1656_ & 0xff) * i_1652_ & 0xff00);
										is[i_1597_++] = (i_1663_ | i_1664_ | i_1665_) >>> 8;
									}
									i_1588_ += i_1593_;
								}
								i_1589_ += i_1594_;
								i_1588_ = i_1642_;
								i_1597_ += i_1598_;
							}
						}
					} else if (i_1584_ == 3) {
						int i_1666_ = i_1588_;
						for (int i_1667_ = -i_1583_; i_1667_ < 0; i_1667_++) {
							int i_1668_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1669_ = -i_1582_; i_1669_ < 0; i_1669_++) {
								int i_1670_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1668_]);
								int i_1671_ = i_1670_ + i_1585_;
								int i_1672_ = ((i_1670_ & 0xff00ff) + (i_1585_ & 0xff00ff));
								int i_1673_ = ((i_1672_ & 0x1000100) + (i_1671_ - i_1672_ & 0x10000));
								i_1673_ = i_1671_ - i_1673_ | i_1673_ - (i_1673_ >>> 8);
								int i_1674_ = (i_1673_ >>> 24) * (i_1585_ >>> 24) >> 8;
								int i_1675_ = 256 - i_1674_;
								if (i_1674_ != 255) {
									i_1670_ = i_1673_;
									i_1673_ = is[i_1597_];
									i_1673_ = ((((i_1670_ & 0xff00ff) * i_1674_ + (i_1673_ & 0xff00ff) * i_1675_) & ~0xff00ff) + (((i_1670_ & 0xff00) * i_1674_ + (i_1673_ & 0xff00) * i_1675_) & 0xff0000)) >> 8;
								}
								is[i_1597_++] = i_1673_;
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1666_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 2) {
						int i_1676_ = i_1585_ >>> 24;
						int i_1677_ = 256 - i_1676_;
						int i_1678_ = (i_1585_ & 0xff00ff) * i_1677_ & ~0xff00ff;
						int i_1679_ = (i_1585_ & 0xff00) * i_1677_ & 0xff0000;
						i_1585_ = (i_1678_ | i_1679_) >>> 8;
						int i_1680_ = i_1588_;
						for (int i_1681_ = -i_1583_; i_1681_ < 0; i_1681_++) {
							int i_1682_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1683_ = -i_1582_; i_1683_ < 0; i_1683_++) {
								int i_1684_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1682_]);
								int i_1685_ = i_1684_ >>> 24;
								int i_1686_ = 256 - i_1685_;
								i_1678_ = ((i_1684_ & 0xff00ff) * i_1676_ & ~0xff00ff);
								i_1679_ = (i_1684_ & 0xff00) * i_1676_ & 0xff0000;
								i_1684_ = ((i_1678_ | i_1679_) >>> 8) + i_1585_;
								int i_1687_ = is[i_1597_];
								is[i_1597_++] = ((((i_1684_ & 0xff00ff) * i_1685_ + (i_1687_ & 0xff00ff) * i_1686_) & ~0xff00ff) + (((i_1684_ & 0xff00) * i_1685_ + (i_1687_ & 0xff00) * i_1686_) & 0xff0000)) >> 8;
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1680_;
							i_1597_ += i_1598_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1586_ == 2) {
					if (i_1584_ == 1) {
						int i_1688_ = i_1588_;
						for (int i_1689_ = -i_1583_; i_1689_ < 0; i_1689_++) {
							int i_1690_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1691_ = -i_1582_; i_1691_ < 0; i_1691_++) {
								int i_1692_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1690_]);
								if (i_1692_ != 0) {
									int i_1693_ = is[i_1597_];
									int i_1694_ = i_1692_ + i_1693_;
									int i_1695_ = ((i_1692_ & 0xff00ff) + (i_1693_ & 0xff00ff));
									i_1693_ = ((i_1695_ & 0x1000100) + (i_1694_ - i_1695_ & 0x10000));
									is[i_1597_++] = (i_1694_ - i_1693_ | i_1693_ - (i_1693_ >>> 8));
								} else
									i_1597_++;
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1688_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 0) {
						int i_1696_ = i_1588_;
						int i_1697_ = (i_1585_ & 0xff0000) >> 16;
						int i_1698_ = (i_1585_ & 0xff00) >> 8;
						int i_1699_ = i_1585_ & 0xff;
						for (int i_1700_ = -i_1583_; i_1700_ < 0; i_1700_++) {
							int i_1701_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1702_ = -i_1582_; i_1702_ < 0; i_1702_++) {
								int i_1703_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1701_]);
								if (i_1703_ != 0) {
									int i_1704_ = ((i_1703_ & 0xff0000) * i_1697_ & ~0xffffff);
									int i_1705_ = ((i_1703_ & 0xff00) * i_1698_ & 0xff0000);
									int i_1706_ = (i_1703_ & 0xff) * i_1699_ & 0xff00;
									i_1703_ = (i_1704_ | i_1705_ | i_1706_) >>> 8;
									int i_1707_ = is[i_1597_];
									int i_1708_ = i_1703_ + i_1707_;
									int i_1709_ = ((i_1703_ & 0xff00ff) + (i_1707_ & 0xff00ff));
									i_1707_ = ((i_1709_ & 0x1000100) + (i_1708_ - i_1709_ & 0x10000));
									is[i_1597_++] = (i_1708_ - i_1707_ | i_1707_ - (i_1707_ >>> 8));
								} else
									i_1597_++;
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1696_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 3) {
						int i_1710_ = i_1588_;
						for (int i_1711_ = -i_1583_; i_1711_ < 0; i_1711_++) {
							int i_1712_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1713_ = -i_1582_; i_1713_ < 0; i_1713_++) {
								int i_1714_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1712_]);
								int i_1715_ = i_1714_ + i_1585_;
								int i_1716_ = ((i_1714_ & 0xff00ff) + (i_1585_ & 0xff00ff));
								int i_1717_ = ((i_1716_ & 0x1000100) + (i_1715_ - i_1716_ & 0x10000));
								i_1714_ = i_1715_ - i_1717_ | i_1717_ - (i_1717_ >>> 8);
								i_1717_ = is[i_1597_];
								i_1715_ = i_1714_ + i_1717_;
								i_1716_ = (i_1714_ & 0xff00ff) + (i_1717_ & 0xff00ff);
								i_1717_ = ((i_1716_ & 0x1000100) + (i_1715_ - i_1716_ & 0x10000));
								is[i_1597_++] = i_1715_ - i_1717_ | i_1717_ - (i_1717_ >>> 8);
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1710_;
							i_1597_ += i_1598_;
						}
					} else if (i_1584_ == 2) {
						int i_1718_ = i_1585_ >>> 24;
						int i_1719_ = 256 - i_1718_;
						int i_1720_ = (i_1585_ & 0xff00ff) * i_1719_ & ~0xff00ff;
						int i_1721_ = (i_1585_ & 0xff00) * i_1719_ & 0xff0000;
						i_1585_ = (i_1720_ | i_1721_) >>> 8;
						int i_1722_ = i_1588_;
						for (int i_1723_ = -i_1583_; i_1723_ < 0; i_1723_++) {
							int i_1724_ = ((i_1589_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1725_ = -i_1582_; i_1725_ < 0; i_1725_++) {
								int i_1726_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1588_ >> 16) + i_1724_]);
								if (i_1726_ != 0) {
									i_1720_ = ((i_1726_ & 0xff00ff) * i_1718_ & ~0xff00ff);
									i_1721_ = ((i_1726_ & 0xff00) * i_1718_ & 0xff0000);
									i_1726_ = (((i_1720_ | i_1721_) >>> 8) + i_1585_);
									int i_1727_ = is[i_1597_];
									int i_1728_ = i_1726_ + i_1727_;
									int i_1729_ = ((i_1726_ & 0xff00ff) + (i_1727_ & 0xff00ff));
									i_1727_ = ((i_1729_ & 0x1000100) + (i_1728_ - i_1729_ & 0x10000));
									is[i_1597_++] = (i_1728_ - i_1727_ | i_1727_ - (i_1727_ >>> 8));
								} else
									i_1597_++;
								i_1588_ += i_1593_;
							}
							i_1589_ += i_1594_;
							i_1588_ = i_1722_;
							i_1597_ += i_1598_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method747(boolean bool, boolean bool_1730_, boolean bool_1731_, int i, int i_1732_, float f, int i_1733_, int i_1734_, int i_1735_, int i_1736_, int i_1737_, int i_1738_, boolean bool_1739_) {
		if (i_1733_ > 0 && i_1734_ > 0 && (bool || bool_1730_)) {
			int i_1740_ = 0;
			int i_1741_ = 0;
			int i_1742_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
			int i_1743_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
			int i_1744_ = (i_1742_ << 16) / i_1733_;
			int i_1745_ = (i_1743_ << 16) / i_1734_;
			if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
				int i_1746_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_1744_ - 1) / i_1744_);
				i += i_1746_;
				i_1740_ += (i_1746_ * i_1744_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
				int i_1747_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_1745_ - 1) / i_1745_);
				i_1732_ += i_1747_;
				i_1741_ += (i_1747_ * i_1745_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9358 < i_1742_)
				i_1733_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_1740_ + i_1744_ - 1) / i_1744_;
			if (((Class61_Sub3_Sub2) this).anInt9325 < i_1743_)
				i_1734_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_1741_ + i_1745_ - 1) / i_1745_;
			int i_1748_ = i + i_1732_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_1749_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_1733_);
			if (i_1732_ + i_1734_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1734_ -= (i_1732_ + i_1734_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_1732_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1750_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1732_);
				i_1734_ -= i_1750_;
				i_1748_ += i_1750_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_1741_ += i_1745_ * i_1750_;
			}
			if (i + i_1733_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1751_ = (i + i_1733_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1733_ -= i_1751_;
				i_1749_ += i_1751_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1752_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1733_ -= i_1752_;
				i_1748_ += i_1752_;
				i_1740_ += i_1744_ * i_1752_;
				i_1749_ += i_1752_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_1737_ == 0) {
				if (i_1735_ == 1) {
					int i_1753_ = i_1740_;
					for (int i_1754_ = -i_1734_; i_1754_ < 0; i_1754_++) {
						int i_1755_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1756_ = -i_1733_; i_1756_ < 0; i_1756_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool)
									is[i_1748_] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1755_]);
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1753_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 0) {
					int i_1757_ = (i_1736_ & 0xff0000) >> 16;
					int i_1758_ = (i_1736_ & 0xff00) >> 8;
					int i_1759_ = i_1736_ & 0xff;
					int i_1760_ = i_1740_;
					for (int i_1761_ = -i_1734_; i_1761_ < 0; i_1761_++) {
						int i_1762_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1763_ = -i_1733_; i_1763_ < 0; i_1763_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool) {
									int i_1764_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1762_]);
									int i_1765_ = ((i_1764_ & 0xff0000) * i_1757_ & ~0xffffff);
									int i_1766_ = ((i_1764_ & 0xff00) * i_1758_ & 0xff0000);
									int i_1767_ = (i_1764_ & 0xff) * i_1759_ & 0xff00;
									is[i_1748_] = (i_1765_ | i_1766_ | i_1767_) >>> 8;
								}
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1760_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 3) {
					int i_1768_ = i_1740_;
					for (int i_1769_ = -i_1734_; i_1769_ < 0; i_1769_++) {
						int i_1770_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1771_ = -i_1733_; i_1771_ < 0; i_1771_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool) {
									int i_1772_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1770_]);
									int i_1773_ = i_1772_ + i_1736_;
									int i_1774_ = ((i_1772_ & 0xff00ff) + (i_1736_ & 0xff00ff));
									int i_1775_ = ((i_1774_ & 0x1000100) + (i_1773_ - i_1774_ & 0x10000));
									is[i_1748_] = (i_1773_ - i_1775_ | i_1775_ - (i_1775_ >>> 8));
								}
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1768_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 2) {
					int i_1776_ = i_1736_ >>> 24;
					int i_1777_ = 256 - i_1776_;
					int i_1778_ = (i_1736_ & 0xff00ff) * i_1777_ & ~0xff00ff;
					int i_1779_ = (i_1736_ & 0xff00) * i_1777_ & 0xff0000;
					i_1736_ = (i_1778_ | i_1779_) >>> 8;
					int i_1780_ = i_1740_;
					for (int i_1781_ = -i_1734_; i_1781_ < 0; i_1781_++) {
						int i_1782_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1783_ = -i_1733_; i_1783_ < 0; i_1783_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool) {
									int i_1784_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1782_]);
									i_1778_ = ((i_1784_ & 0xff00ff) * i_1776_ & ~0xff00ff);
									i_1779_ = ((i_1784_ & 0xff00) * i_1776_ & 0xff0000);
									is[i_1748_] = (((i_1778_ | i_1779_) >>> 8) + i_1736_);
								}
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1780_;
						i_1748_ += i_1749_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1737_ == 1) {
				if (i_1735_ == 1) {
					int i_1785_ = i_1740_;
					for (int i_1786_ = -i_1734_; i_1786_ < 0; i_1786_++) {
						int i_1787_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1788_ = -i_1733_; i_1788_ < 0; i_1788_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool) {
									int i_1789_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1787_]);
									int i_1790_ = i_1789_ >>> 24;
									int i_1791_ = 256 - i_1790_;
									int i_1792_ = is[i_1748_];
									is[i_1748_] = (((((i_1789_ & 0xff00ff) * i_1790_ + (i_1792_ & 0xff00ff) * i_1791_) & ~0xff00ff) >> 8) + (((((i_1789_ & ~0xff00ff) >>> 8) * i_1790_) + (((i_1792_ & ~0xff00ff) >>> 8) * i_1791_)) & ~0xff00ff));
								}
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1785_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 0) {
					int i_1793_ = i_1740_;
					if ((i_1736_ & 0xffffff) == 16777215) {
						for (int i_1794_ = -i_1734_; i_1794_ < 0; i_1794_++) {
							int i_1795_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1796_ = -i_1733_; i_1796_ < 0; i_1796_++) {
								if (!bool_1730_ || f < fs[i_1748_]) {
									if (bool) {
										int i_1797_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1795_]);
										int i_1798_ = ((i_1797_ >>> 24) * (i_1736_ >>> 24) >> 8);
										int i_1799_ = 256 - i_1798_;
										int i_1800_ = is[i_1748_];
										is[i_1748_] = ((((i_1797_ & 0xff00ff) * i_1798_ + ((i_1800_ & 0xff00ff) * i_1799_)) & ~0xff00ff) + (((i_1797_ & 0xff00) * i_1798_ + ((i_1800_ & 0xff00) * i_1799_)) & 0xff0000)) >> 8;
									}
									if (bool_1730_ && bool_1739_)
										fs[i_1748_] = f;
								}
								i_1740_ += i_1744_;
								i_1748_++;
							}
							i_1741_ += i_1745_;
							i_1740_ = i_1793_;
							i_1748_ += i_1749_;
						}
					} else {
						int i_1801_ = (i_1736_ & 0xff0000) >> 16;
						int i_1802_ = (i_1736_ & 0xff00) >> 8;
						int i_1803_ = i_1736_ & 0xff;
						for (int i_1804_ = -i_1734_; i_1804_ < 0; i_1804_++) {
							int i_1805_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_1806_ = -i_1733_; i_1806_ < 0; i_1806_++) {
								if (!bool_1730_ || f < fs[i_1748_]) {
									int i_1807_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1805_]);
									int i_1808_ = ((i_1807_ >>> 24) * (i_1736_ >>> 24) >> 8);
									int i_1809_ = 256 - i_1808_;
									if (i_1808_ != 255) {
										if (bool) {
											int i_1810_ = (((i_1807_ & 0xff0000) * i_1801_) & ~0xffffff);
											int i_1811_ = ((i_1807_ & 0xff00) * i_1802_ & 0xff0000);
											int i_1812_ = ((i_1807_ & 0xff) * i_1803_ & 0xff00);
											i_1807_ = (i_1810_ | i_1811_ | i_1812_) >>> 8;
											int i_1813_ = is[i_1748_];
											is[i_1748_] = (((((i_1807_ & 0xff00ff) * i_1808_) + ((i_1813_ & 0xff00ff) * i_1809_)) & ~0xff00ff) + ((((i_1807_ & 0xff00) * i_1808_) + ((i_1813_ & 0xff00) * i_1809_)) & 0xff0000)) >> 8;
											if (bool_1731_) {
												int i_1814_ = ((i_1813_ >>> 24) + i_1808_);
												if (i_1814_ > 255)
													i_1814_ = 255;
												is[i_1748_] |= i_1814_ << 24;
											}
										}
										if (bool_1730_ && bool_1739_)
											fs[i_1748_] = f;
									} else {
										if (bool) {
											int i_1815_ = (((i_1807_ & 0xff0000) * i_1801_) & ~0xffffff);
											int i_1816_ = ((i_1807_ & 0xff00) * i_1802_ & 0xff0000);
											int i_1817_ = ((i_1807_ & 0xff) * i_1803_ & 0xff00);
											is[i_1748_] = (i_1815_ | i_1816_ | i_1817_) >>> 8;
										}
										if (bool_1730_ && bool_1739_)
											fs[i_1748_] = f;
									}
								}
								i_1740_ += i_1744_;
								i_1748_++;
							}
							i_1741_ += i_1745_;
							i_1740_ = i_1793_;
							i_1748_ += i_1749_;
						}
					}
				} else if (i_1735_ == 3) {
					int i_1818_ = i_1740_;
					for (int i_1819_ = -i_1734_; i_1819_ < 0; i_1819_++) {
						int i_1820_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1821_ = -i_1733_; i_1821_ < 0; i_1821_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool) {
									int i_1822_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1820_]);
									int i_1823_ = i_1822_ + i_1736_;
									int i_1824_ = ((i_1822_ & 0xff00ff) + (i_1736_ & 0xff00ff));
									int i_1825_ = ((i_1824_ & 0x1000100) + (i_1823_ - i_1824_ & 0x10000));
									i_1825_ = (i_1823_ - i_1825_ | i_1825_ - (i_1825_ >>> 8));
									int i_1826_ = ((i_1825_ >>> 24) * (i_1736_ >>> 24) >> 8);
									int i_1827_ = 256 - i_1826_;
									if (i_1826_ != 255) {
										i_1822_ = i_1825_;
										i_1825_ = is[i_1748_];
										i_1825_ = ((((i_1822_ & 0xff00ff) * i_1826_ + ((i_1825_ & 0xff00ff) * i_1827_)) & ~0xff00ff) + (((i_1822_ & 0xff00) * i_1826_ + ((i_1825_ & 0xff00) * i_1827_)) & 0xff0000)) >> 8;
									}
									is[i_1748_] = i_1825_;
								}
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1818_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 2) {
					int i_1828_ = i_1736_ >>> 24;
					int i_1829_ = 256 - i_1828_;
					int i_1830_ = (i_1736_ & 0xff00ff) * i_1829_ & ~0xff00ff;
					int i_1831_ = (i_1736_ & 0xff00) * i_1829_ & 0xff0000;
					i_1736_ = (i_1830_ | i_1831_) >>> 8;
					int i_1832_ = i_1740_;
					for (int i_1833_ = -i_1734_; i_1833_ < 0; i_1833_++) {
						int i_1834_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1835_ = -i_1733_; i_1835_ < 0; i_1835_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool) {
									int i_1836_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1834_]);
									int i_1837_ = i_1836_ >>> 24;
									int i_1838_ = 256 - i_1837_;
									i_1830_ = ((i_1836_ & 0xff00ff) * i_1828_ & ~0xff00ff);
									i_1831_ = ((i_1836_ & 0xff00) * i_1828_ & 0xff0000);
									i_1836_ = (((i_1830_ | i_1831_) >>> 8) + i_1736_);
									int i_1839_ = is[i_1748_];
									is[i_1748_] = ((((i_1836_ & 0xff00ff) * i_1837_ + (i_1839_ & 0xff00ff) * i_1838_) & ~0xff00ff) + (((i_1836_ & 0xff00) * i_1837_ + (i_1839_ & 0xff00) * i_1838_) & 0xff0000)) >> 8;
								}
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1832_;
						i_1748_ += i_1749_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1737_ == 2) {
				if (i_1735_ == 1) {
					int i_1840_ = i_1740_;
					for (int i_1841_ = -i_1734_; i_1841_ < 0; i_1841_++) {
						int i_1842_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1843_ = -i_1733_; i_1843_ < 0; i_1843_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								int i_1844_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1842_]);
								if (i_1844_ != 0) {
									if (bool) {
										int i_1845_ = is[i_1748_];
										int i_1846_ = i_1844_ + i_1845_;
										int i_1847_ = ((i_1844_ & 0xff00ff) + (i_1845_ & 0xff00ff));
										i_1845_ = ((i_1847_ & 0x1000100) + (i_1846_ - i_1847_ & 0x10000));
										is[i_1748_] = (i_1846_ - i_1845_ | i_1845_ - (i_1845_ >>> 8));
									}
									if (bool_1730_ && bool_1739_)
										fs[i_1748_] = f;
								}
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1840_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 0) {
					int i_1848_ = i_1740_;
					int i_1849_ = (i_1736_ & 0xff0000) >> 16;
					int i_1850_ = (i_1736_ & 0xff00) >> 8;
					int i_1851_ = i_1736_ & 0xff;
					for (int i_1852_ = -i_1734_; i_1852_ < 0; i_1852_++) {
						int i_1853_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1854_ = -i_1733_; i_1854_ < 0; i_1854_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								int i_1855_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1853_]);
								if (i_1855_ != 0) {
									if (bool) {
										int i_1856_ = ((i_1855_ & 0xff0000) * i_1849_ & ~0xffffff);
										int i_1857_ = ((i_1855_ & 0xff00) * i_1850_ & 0xff0000);
										int i_1858_ = ((i_1855_ & 0xff) * i_1851_ & 0xff00);
										i_1855_ = (i_1856_ | i_1857_ | i_1858_) >>> 8;
										int i_1859_ = is[i_1748_];
										int i_1860_ = i_1855_ + i_1859_;
										int i_1861_ = ((i_1855_ & 0xff00ff) + (i_1859_ & 0xff00ff));
										i_1859_ = ((i_1861_ & 0x1000100) + (i_1860_ - i_1861_ & 0x10000));
										is[i_1748_] = (i_1860_ - i_1859_ | i_1859_ - (i_1859_ >>> 8));
									}
									if (bool_1730_ && bool_1739_)
										fs[i_1748_] = f;
								}
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1848_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 3) {
					int i_1862_ = i_1740_;
					for (int i_1863_ = -i_1734_; i_1863_ < 0; i_1863_++) {
						int i_1864_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1865_ = -i_1733_; i_1865_ < 0; i_1865_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								if (bool) {
									int i_1866_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1864_]);
									int i_1867_ = i_1866_ + i_1736_;
									int i_1868_ = ((i_1866_ & 0xff00ff) + (i_1736_ & 0xff00ff));
									int i_1869_ = ((i_1868_ & 0x1000100) + (i_1867_ - i_1868_ & 0x10000));
									i_1866_ = (i_1867_ - i_1869_ | i_1869_ - (i_1869_ >>> 8));
									i_1869_ = is[i_1748_];
									i_1867_ = i_1866_ + i_1869_;
									i_1868_ = (i_1866_ & 0xff00ff) + (i_1869_ & 0xff00ff);
									i_1869_ = ((i_1868_ & 0x1000100) + (i_1867_ - i_1868_ & 0x10000));
									is[i_1748_] = (i_1867_ - i_1869_ | i_1869_ - (i_1869_ >>> 8));
								}
								if (bool_1730_ && bool_1739_)
									fs[i_1748_] = f;
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1862_;
						i_1748_ += i_1749_;
					}
				} else if (i_1735_ == 2) {
					int i_1870_ = i_1736_ >>> 24;
					int i_1871_ = 256 - i_1870_;
					int i_1872_ = (i_1736_ & 0xff00ff) * i_1871_ & ~0xff00ff;
					int i_1873_ = (i_1736_ & 0xff00) * i_1871_ & 0xff0000;
					i_1736_ = (i_1872_ | i_1873_) >>> 8;
					int i_1874_ = i_1740_;
					for (int i_1875_ = -i_1734_; i_1875_ < 0; i_1875_++) {
						int i_1876_ = ((i_1741_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1877_ = -i_1733_; i_1877_ < 0; i_1877_++) {
							if (!bool_1730_ || f < fs[i_1748_]) {
								int i_1878_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1740_ >> 16) + i_1876_]);
								if (i_1878_ != 0) {
									if (bool) {
										i_1872_ = ((i_1878_ & 0xff00ff) * i_1870_ & ~0xff00ff);
										i_1873_ = ((i_1878_ & 0xff00) * i_1870_ & 0xff0000);
										i_1878_ = (((i_1872_ | i_1873_) >>> 8) + i_1736_);
										int i_1879_ = is[i_1748_];
										int i_1880_ = i_1878_ + i_1879_;
										int i_1881_ = ((i_1878_ & 0xff00ff) + (i_1879_ & 0xff00ff));
										i_1879_ = ((i_1881_ & 0x1000100) + (i_1880_ - i_1881_ & 0x10000));
										is[i_1748_] = (i_1880_ - i_1879_ | i_1879_ - (i_1879_ >>> 8));
									}
									if (bool_1730_ && bool_1739_)
										fs[i_1748_] = f;
								}
							}
							i_1740_ += i_1744_;
							i_1748_++;
						}
						i_1741_ += i_1745_;
						i_1740_ = i_1874_;
						i_1748_ += i_1749_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface8_Impl1_Impl2 method729() {
		return new Class12(((Class61_Sub3_Sub2) this).anInt9358, ((Class61_Sub3_Sub2) this).anInt9325, ((Class61_Sub3_Sub2) this).anIntArray10094);
	}

	void method750(int i, int i_1882_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_1883_ = anInt9356;
					while (i_1883_ < 0) {
						int i_1884_ = anInt9339;
						int i_1885_ = anInt9346;
						int i_1886_ = anInt9324;
						int i_1887_ = anInt9347;
						if (i_1885_ >= 0 && i_1886_ >= 0 && i_1885_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0 && i_1886_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							for (/**/; i_1887_ < 0; i_1887_++)
								method758(((i_1886_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_1885_ >> 12), i_1884_++, is, i, i_1882_);
						}
						i_1883_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_1888_ = anInt9356;
					while (i_1888_ < 0) {
						int i_1889_ = anInt9339;
						int i_1890_ = anInt9346;
						int i_1891_ = anInt9324 + anInt9349;
						int i_1892_ = anInt9347;
						if (i_1890_ >= 0 && i_1890_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0) {
							int i_1893_;
							if ((i_1893_ = (i_1891_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
								i_1893_ = (anInt9341 - i_1893_) / anInt9341;
								i_1892_ += i_1893_;
								i_1891_ += anInt9341 * i_1893_;
								i_1889_ += i_1893_;
							}
							if ((i_1893_ = (i_1891_ - anInt9341) / anInt9341) > i_1892_)
								i_1892_ = i_1893_;
							for (/**/; i_1892_ < 0; i_1892_++) {
								method758(((i_1891_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_1890_ >> 12), i_1889_++, is, i, i_1882_);
								i_1891_ += anInt9341;
							}
						}
						i_1888_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_1894_ = anInt9356;
					while (i_1894_ < 0) {
						int i_1895_ = anInt9339;
						int i_1896_ = anInt9346;
						int i_1897_ = anInt9324 + anInt9349;
						int i_1898_ = anInt9347;
						if (i_1896_ >= 0 && i_1896_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0) {
							if (i_1897_ < 0) {
								int i_1899_ = (anInt9341 - 1 - i_1897_) / anInt9341;
								i_1898_ += i_1899_;
								i_1897_ += anInt9341 * i_1899_;
								i_1895_ += i_1899_;
							}
							int i_1900_;
							if ((i_1900_ = (1 + i_1897_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_1898_)
								i_1898_ = i_1900_;
							for (/**/; i_1898_ < 0; i_1898_++) {
								method758(((i_1897_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_1896_ >> 12), i_1895_++, is, i, i_1882_);
								i_1897_ += anInt9341;
							}
						}
						i_1894_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_1901_ = anInt9356;
					while (i_1901_ < 0) {
						int i_1902_ = anInt9339;
						int i_1903_ = anInt9346 + anInt9348;
						int i_1904_ = anInt9324;
						int i_1905_ = anInt9347;
						if (i_1904_ >= 0 && i_1904_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							int i_1906_;
							if ((i_1906_ = (i_1903_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_1906_ = (anInt9340 - i_1906_) / anInt9340;
								i_1905_ += i_1906_;
								i_1903_ += anInt9340 * i_1906_;
								i_1902_ += i_1906_;
							}
							if ((i_1906_ = (i_1903_ - anInt9340) / anInt9340) > i_1905_)
								i_1905_ = i_1906_;
							for (/**/; i_1905_ < 0; i_1905_++) {
								method758(((i_1904_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_1903_ >> 12), i_1902_++, is, i, i_1882_);
								i_1903_ += anInt9340;
							}
						}
						i_1901_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_1907_ = anInt9356;
					while (i_1907_ < 0) {
						int i_1908_ = anInt9339;
						int i_1909_ = anInt9346 + anInt9348;
						int i_1910_ = anInt9324 + anInt9349;
						int i_1911_ = anInt9347;
						int i_1912_;
						if ((i_1912_ = i_1909_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) >= 0) {
							i_1912_ = (anInt9340 - i_1912_) / anInt9340;
							i_1911_ += i_1912_;
							i_1909_ += anInt9340 * i_1912_;
							i_1910_ += anInt9341 * i_1912_;
							i_1908_ += i_1912_;
						}
						if ((i_1912_ = (i_1909_ - anInt9340) / anInt9340) > i_1911_)
							i_1911_ = i_1912_;
						if ((i_1912_ = i_1910_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_1912_ = (anInt9341 - i_1912_) / anInt9341;
							i_1911_ += i_1912_;
							i_1909_ += anInt9340 * i_1912_;
							i_1910_ += anInt9341 * i_1912_;
							i_1908_ += i_1912_;
						}
						if ((i_1912_ = (i_1910_ - anInt9341) / anInt9341) > i_1911_)
							i_1911_ = i_1912_;
						for (/**/; i_1911_ < 0; i_1911_++) {
							method758((((i_1910_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_1909_ >> 12)), i_1908_++, is, i, i_1882_);
							i_1909_ += anInt9340;
							i_1910_ += anInt9341;
						}
						i_1907_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_1913_ = anInt9356;
					while (i_1913_ < 0) {
						int i_1914_ = anInt9339;
						int i_1915_ = anInt9346 + anInt9348;
						int i_1916_ = anInt9324 + anInt9349;
						int i_1917_ = anInt9347;
						int i_1918_;
						if ((i_1918_ = i_1915_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) >= 0) {
							i_1918_ = (anInt9340 - i_1918_) / anInt9340;
							i_1917_ += i_1918_;
							i_1915_ += anInt9340 * i_1918_;
							i_1916_ += anInt9341 * i_1918_;
							i_1914_ += i_1918_;
						}
						if ((i_1918_ = (i_1915_ - anInt9340) / anInt9340) > i_1917_)
							i_1917_ = i_1918_;
						if (i_1916_ < 0) {
							i_1918_ = (anInt9341 - 1 - i_1916_) / anInt9341;
							i_1917_ += i_1918_;
							i_1915_ += anInt9340 * i_1918_;
							i_1916_ += anInt9341 * i_1918_;
							i_1914_ += i_1918_;
						}
						if ((i_1918_ = (1 + i_1916_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_1917_)
							i_1917_ = i_1918_;
						for (/**/; i_1917_ < 0; i_1917_++) {
							method758((((i_1916_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_1915_ >> 12)), i_1914_++, is, i, i_1882_);
							i_1915_ += anInt9340;
							i_1916_ += anInt9341;
						}
						i_1913_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_1919_ = anInt9356;
				while (i_1919_ < 0) {
					int i_1920_ = anInt9339;
					int i_1921_ = anInt9346 + anInt9348;
					int i_1922_ = anInt9324;
					int i_1923_ = anInt9347;
					if (i_1922_ >= 0 && i_1922_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
						if (i_1921_ < 0) {
							int i_1924_ = (anInt9340 - 1 - i_1921_) / anInt9340;
							i_1923_ += i_1924_;
							i_1921_ += anInt9340 * i_1924_;
							i_1920_ += i_1924_;
						}
						int i_1925_;
						if ((i_1925_ = (1 + i_1921_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_1923_)
							i_1923_ = i_1925_;
						for (/**/; i_1923_ < 0; i_1923_++) {
							method758((((i_1922_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_1921_ >> 12)), i_1920_++, is, i, i_1882_);
							i_1921_ += anInt9340;
						}
					}
					i_1919_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_1926_ = anInt9356; i_1926_ < 0; i_1926_++) {
					int i_1927_ = anInt9339;
					int i_1928_ = anInt9346 + anInt9348;
					int i_1929_ = anInt9324 + anInt9349;
					int i_1930_ = anInt9347;
					if (i_1928_ < 0) {
						int i_1931_ = (anInt9340 - 1 - i_1928_) / anInt9340;
						i_1930_ += i_1931_;
						i_1928_ += anInt9340 * i_1931_;
						i_1929_ += anInt9341 * i_1931_;
						i_1927_ += i_1931_;
					}
					int i_1932_;
					if ((i_1932_ = (1 + i_1928_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_1930_)
						i_1930_ = i_1932_;
					if ((i_1932_ = i_1929_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
						i_1932_ = (anInt9341 - i_1932_) / anInt9341;
						i_1930_ += i_1932_;
						i_1928_ += anInt9340 * i_1932_;
						i_1929_ += anInt9341 * i_1932_;
						i_1927_ += i_1932_;
					}
					if ((i_1932_ = (i_1929_ - anInt9341) / anInt9341) > i_1930_)
						i_1930_ = i_1932_;
					for (/**/; i_1930_ < 0; i_1930_++) {
						method758((((i_1929_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_1928_ >> 12)), i_1927_++, is, i, i_1882_);
						i_1928_ += anInt9340;
						i_1929_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_1933_ = anInt9356; i_1933_ < 0; i_1933_++) {
					int i_1934_ = anInt9339;
					int i_1935_ = anInt9346 + anInt9348;
					int i_1936_ = anInt9324 + anInt9349;
					int i_1937_ = anInt9347;
					if (i_1935_ < 0) {
						int i_1938_ = (anInt9340 - 1 - i_1935_) / anInt9340;
						i_1937_ += i_1938_;
						i_1935_ += anInt9340 * i_1938_;
						i_1936_ += anInt9341 * i_1938_;
						i_1934_ += i_1938_;
					}
					int i_1939_;
					if ((i_1939_ = (1 + i_1935_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_1937_)
						i_1937_ = i_1939_;
					if (i_1936_ < 0) {
						i_1939_ = (anInt9341 - 1 - i_1936_) / anInt9341;
						i_1937_ += i_1939_;
						i_1935_ += anInt9340 * i_1939_;
						i_1936_ += anInt9341 * i_1939_;
						i_1934_ += i_1939_;
					}
					if ((i_1939_ = (1 + i_1936_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_1937_)
						i_1937_ = i_1939_;
					for (/**/; i_1937_ < 0; i_1937_++) {
						method758((((i_1936_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_1935_ >> 12)), i_1934_++, is, i, i_1882_);
						i_1935_ += anInt9340;
						i_1936_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method748(boolean bool, boolean bool_1940_, boolean bool_1941_, int i, int i_1942_, float f, int i_1943_, int i_1944_, int i_1945_, int i_1946_, int i_1947_, int i_1948_, boolean bool_1949_) {
		if (i_1943_ > 0 && i_1944_ > 0 && (bool || bool_1940_)) {
			int i_1950_ = 0;
			int i_1951_ = 0;
			int i_1952_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
			int i_1953_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
			int i_1954_ = (i_1952_ << 16) / i_1943_;
			int i_1955_ = (i_1953_ << 16) / i_1944_;
			if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
				int i_1956_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_1954_ - 1) / i_1954_);
				i += i_1956_;
				i_1950_ += (i_1956_ * i_1954_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
				int i_1957_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_1955_ - 1) / i_1955_);
				i_1942_ += i_1957_;
				i_1951_ += (i_1957_ * i_1955_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9358 < i_1952_)
				i_1943_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_1950_ + i_1954_ - 1) / i_1954_;
			if (((Class61_Sub3_Sub2) this).anInt9325 < i_1953_)
				i_1944_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_1951_ + i_1955_ - 1) / i_1955_;
			int i_1958_ = i + i_1942_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_1959_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_1943_);
			if (i_1942_ + i_1944_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1944_ -= (i_1942_ + i_1944_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_1942_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1960_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1942_);
				i_1944_ -= i_1960_;
				i_1958_ += i_1960_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_1951_ += i_1955_ * i_1960_;
			}
			if (i + i_1943_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1961_ = (i + i_1943_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1943_ -= i_1961_;
				i_1959_ += i_1961_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1962_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1943_ -= i_1962_;
				i_1958_ += i_1962_;
				i_1950_ += i_1954_ * i_1962_;
				i_1959_ += i_1962_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_1947_ == 0) {
				if (i_1945_ == 1) {
					int i_1963_ = i_1950_;
					for (int i_1964_ = -i_1944_; i_1964_ < 0; i_1964_++) {
						int i_1965_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1966_ = -i_1943_; i_1966_ < 0; i_1966_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool)
									is[i_1958_] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_1965_]);
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_1963_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 0) {
					int i_1967_ = (i_1946_ & 0xff0000) >> 16;
					int i_1968_ = (i_1946_ & 0xff00) >> 8;
					int i_1969_ = i_1946_ & 0xff;
					int i_1970_ = i_1950_;
					for (int i_1971_ = -i_1944_; i_1971_ < 0; i_1971_++) {
						int i_1972_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1973_ = -i_1943_; i_1973_ < 0; i_1973_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool) {
									int i_1974_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_1972_]);
									int i_1975_ = ((i_1974_ & 0xff0000) * i_1967_ & ~0xffffff);
									int i_1976_ = ((i_1974_ & 0xff00) * i_1968_ & 0xff0000);
									int i_1977_ = (i_1974_ & 0xff) * i_1969_ & 0xff00;
									is[i_1958_] = (i_1975_ | i_1976_ | i_1977_) >>> 8;
								}
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_1970_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 3) {
					int i_1978_ = i_1950_;
					for (int i_1979_ = -i_1944_; i_1979_ < 0; i_1979_++) {
						int i_1980_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1981_ = -i_1943_; i_1981_ < 0; i_1981_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool) {
									int i_1982_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_1980_]);
									int i_1983_ = i_1982_ + i_1946_;
									int i_1984_ = ((i_1982_ & 0xff00ff) + (i_1946_ & 0xff00ff));
									int i_1985_ = ((i_1984_ & 0x1000100) + (i_1983_ - i_1984_ & 0x10000));
									is[i_1958_] = (i_1983_ - i_1985_ | i_1985_ - (i_1985_ >>> 8));
								}
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_1978_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 2) {
					int i_1986_ = i_1946_ >>> 24;
					int i_1987_ = 256 - i_1986_;
					int i_1988_ = (i_1946_ & 0xff00ff) * i_1987_ & ~0xff00ff;
					int i_1989_ = (i_1946_ & 0xff00) * i_1987_ & 0xff0000;
					i_1946_ = (i_1988_ | i_1989_) >>> 8;
					int i_1990_ = i_1950_;
					for (int i_1991_ = -i_1944_; i_1991_ < 0; i_1991_++) {
						int i_1992_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1993_ = -i_1943_; i_1993_ < 0; i_1993_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool) {
									int i_1994_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_1992_]);
									i_1988_ = ((i_1994_ & 0xff00ff) * i_1986_ & ~0xff00ff);
									i_1989_ = ((i_1994_ & 0xff00) * i_1986_ & 0xff0000);
									is[i_1958_] = (((i_1988_ | i_1989_) >>> 8) + i_1946_);
								}
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_1990_;
						i_1958_ += i_1959_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1947_ == 1) {
				if (i_1945_ == 1) {
					int i_1995_ = i_1950_;
					for (int i_1996_ = -i_1944_; i_1996_ < 0; i_1996_++) {
						int i_1997_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_1998_ = -i_1943_; i_1998_ < 0; i_1998_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool) {
									int i_1999_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_1997_]);
									int i_2000_ = i_1999_ >>> 24;
									int i_2001_ = 256 - i_2000_;
									int i_2002_ = is[i_1958_];
									is[i_1958_] = (((((i_1999_ & 0xff00ff) * i_2000_ + (i_2002_ & 0xff00ff) * i_2001_) & ~0xff00ff) >> 8) + (((((i_1999_ & ~0xff00ff) >>> 8) * i_2000_) + (((i_2002_ & ~0xff00ff) >>> 8) * i_2001_)) & ~0xff00ff));
								}
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_1995_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 0) {
					int i_2003_ = i_1950_;
					if ((i_1946_ & 0xffffff) == 16777215) {
						for (int i_2004_ = -i_1944_; i_2004_ < 0; i_2004_++) {
							int i_2005_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_2006_ = -i_1943_; i_2006_ < 0; i_2006_++) {
								if (!bool_1940_ || f < fs[i_1958_]) {
									if (bool) {
										int i_2007_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2005_]);
										int i_2008_ = ((i_2007_ >>> 24) * (i_1946_ >>> 24) >> 8);
										int i_2009_ = 256 - i_2008_;
										int i_2010_ = is[i_1958_];
										is[i_1958_] = ((((i_2007_ & 0xff00ff) * i_2008_ + ((i_2010_ & 0xff00ff) * i_2009_)) & ~0xff00ff) + (((i_2007_ & 0xff00) * i_2008_ + ((i_2010_ & 0xff00) * i_2009_)) & 0xff0000)) >> 8;
									}
									if (bool_1940_ && bool_1949_)
										fs[i_1958_] = f;
								}
								i_1950_ += i_1954_;
								i_1958_++;
							}
							i_1951_ += i_1955_;
							i_1950_ = i_2003_;
							i_1958_ += i_1959_;
						}
					} else {
						int i_2011_ = (i_1946_ & 0xff0000) >> 16;
						int i_2012_ = (i_1946_ & 0xff00) >> 8;
						int i_2013_ = i_1946_ & 0xff;
						for (int i_2014_ = -i_1944_; i_2014_ < 0; i_2014_++) {
							int i_2015_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_2016_ = -i_1943_; i_2016_ < 0; i_2016_++) {
								if (!bool_1940_ || f < fs[i_1958_]) {
									int i_2017_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2015_]);
									int i_2018_ = ((i_2017_ >>> 24) * (i_1946_ >>> 24) >> 8);
									int i_2019_ = 256 - i_2018_;
									if (i_2018_ != 255) {
										if (bool) {
											int i_2020_ = (((i_2017_ & 0xff0000) * i_2011_) & ~0xffffff);
											int i_2021_ = ((i_2017_ & 0xff00) * i_2012_ & 0xff0000);
											int i_2022_ = ((i_2017_ & 0xff) * i_2013_ & 0xff00);
											i_2017_ = (i_2020_ | i_2021_ | i_2022_) >>> 8;
											int i_2023_ = is[i_1958_];
											is[i_1958_] = (((((i_2017_ & 0xff00ff) * i_2018_) + ((i_2023_ & 0xff00ff) * i_2019_)) & ~0xff00ff) + ((((i_2017_ & 0xff00) * i_2018_) + ((i_2023_ & 0xff00) * i_2019_)) & 0xff0000)) >> 8;
											if (bool_1941_) {
												int i_2024_ = ((i_2023_ >>> 24) + i_2018_);
												if (i_2024_ > 255)
													i_2024_ = 255;
												is[i_1958_] |= i_2024_ << 24;
											}
										}
										if (bool_1940_ && bool_1949_)
											fs[i_1958_] = f;
									} else {
										if (bool) {
											int i_2025_ = (((i_2017_ & 0xff0000) * i_2011_) & ~0xffffff);
											int i_2026_ = ((i_2017_ & 0xff00) * i_2012_ & 0xff0000);
											int i_2027_ = ((i_2017_ & 0xff) * i_2013_ & 0xff00);
											is[i_1958_] = (i_2025_ | i_2026_ | i_2027_) >>> 8;
										}
										if (bool_1940_ && bool_1949_)
											fs[i_1958_] = f;
									}
								}
								i_1950_ += i_1954_;
								i_1958_++;
							}
							i_1951_ += i_1955_;
							i_1950_ = i_2003_;
							i_1958_ += i_1959_;
						}
					}
				} else if (i_1945_ == 3) {
					int i_2028_ = i_1950_;
					for (int i_2029_ = -i_1944_; i_2029_ < 0; i_2029_++) {
						int i_2030_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2031_ = -i_1943_; i_2031_ < 0; i_2031_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool) {
									int i_2032_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2030_]);
									int i_2033_ = i_2032_ + i_1946_;
									int i_2034_ = ((i_2032_ & 0xff00ff) + (i_1946_ & 0xff00ff));
									int i_2035_ = ((i_2034_ & 0x1000100) + (i_2033_ - i_2034_ & 0x10000));
									i_2035_ = (i_2033_ - i_2035_ | i_2035_ - (i_2035_ >>> 8));
									int i_2036_ = ((i_2035_ >>> 24) * (i_1946_ >>> 24) >> 8);
									int i_2037_ = 256 - i_2036_;
									if (i_2036_ != 255) {
										i_2032_ = i_2035_;
										i_2035_ = is[i_1958_];
										i_2035_ = ((((i_2032_ & 0xff00ff) * i_2036_ + ((i_2035_ & 0xff00ff) * i_2037_)) & ~0xff00ff) + (((i_2032_ & 0xff00) * i_2036_ + ((i_2035_ & 0xff00) * i_2037_)) & 0xff0000)) >> 8;
									}
									is[i_1958_] = i_2035_;
								}
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_2028_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 2) {
					int i_2038_ = i_1946_ >>> 24;
					int i_2039_ = 256 - i_2038_;
					int i_2040_ = (i_1946_ & 0xff00ff) * i_2039_ & ~0xff00ff;
					int i_2041_ = (i_1946_ & 0xff00) * i_2039_ & 0xff0000;
					i_1946_ = (i_2040_ | i_2041_) >>> 8;
					int i_2042_ = i_1950_;
					for (int i_2043_ = -i_1944_; i_2043_ < 0; i_2043_++) {
						int i_2044_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2045_ = -i_1943_; i_2045_ < 0; i_2045_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool) {
									int i_2046_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2044_]);
									int i_2047_ = i_2046_ >>> 24;
									int i_2048_ = 256 - i_2047_;
									i_2040_ = ((i_2046_ & 0xff00ff) * i_2038_ & ~0xff00ff);
									i_2041_ = ((i_2046_ & 0xff00) * i_2038_ & 0xff0000);
									i_2046_ = (((i_2040_ | i_2041_) >>> 8) + i_1946_);
									int i_2049_ = is[i_1958_];
									is[i_1958_] = ((((i_2046_ & 0xff00ff) * i_2047_ + (i_2049_ & 0xff00ff) * i_2048_) & ~0xff00ff) + (((i_2046_ & 0xff00) * i_2047_ + (i_2049_ & 0xff00) * i_2048_) & 0xff0000)) >> 8;
								}
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_2042_;
						i_1958_ += i_1959_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1947_ == 2) {
				if (i_1945_ == 1) {
					int i_2050_ = i_1950_;
					for (int i_2051_ = -i_1944_; i_2051_ < 0; i_2051_++) {
						int i_2052_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2053_ = -i_1943_; i_2053_ < 0; i_2053_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								int i_2054_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2052_]);
								if (i_2054_ != 0) {
									if (bool) {
										int i_2055_ = is[i_1958_];
										int i_2056_ = i_2054_ + i_2055_;
										int i_2057_ = ((i_2054_ & 0xff00ff) + (i_2055_ & 0xff00ff));
										i_2055_ = ((i_2057_ & 0x1000100) + (i_2056_ - i_2057_ & 0x10000));
										is[i_1958_] = (i_2056_ - i_2055_ | i_2055_ - (i_2055_ >>> 8));
									}
									if (bool_1940_ && bool_1949_)
										fs[i_1958_] = f;
								}
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_2050_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 0) {
					int i_2058_ = i_1950_;
					int i_2059_ = (i_1946_ & 0xff0000) >> 16;
					int i_2060_ = (i_1946_ & 0xff00) >> 8;
					int i_2061_ = i_1946_ & 0xff;
					for (int i_2062_ = -i_1944_; i_2062_ < 0; i_2062_++) {
						int i_2063_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2064_ = -i_1943_; i_2064_ < 0; i_2064_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								int i_2065_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2063_]);
								if (i_2065_ != 0) {
									if (bool) {
										int i_2066_ = ((i_2065_ & 0xff0000) * i_2059_ & ~0xffffff);
										int i_2067_ = ((i_2065_ & 0xff00) * i_2060_ & 0xff0000);
										int i_2068_ = ((i_2065_ & 0xff) * i_2061_ & 0xff00);
										i_2065_ = (i_2066_ | i_2067_ | i_2068_) >>> 8;
										int i_2069_ = is[i_1958_];
										int i_2070_ = i_2065_ + i_2069_;
										int i_2071_ = ((i_2065_ & 0xff00ff) + (i_2069_ & 0xff00ff));
										i_2069_ = ((i_2071_ & 0x1000100) + (i_2070_ - i_2071_ & 0x10000));
										is[i_1958_] = (i_2070_ - i_2069_ | i_2069_ - (i_2069_ >>> 8));
									}
									if (bool_1940_ && bool_1949_)
										fs[i_1958_] = f;
								}
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_2058_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 3) {
					int i_2072_ = i_1950_;
					for (int i_2073_ = -i_1944_; i_2073_ < 0; i_2073_++) {
						int i_2074_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2075_ = -i_1943_; i_2075_ < 0; i_2075_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								if (bool) {
									int i_2076_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2074_]);
									int i_2077_ = i_2076_ + i_1946_;
									int i_2078_ = ((i_2076_ & 0xff00ff) + (i_1946_ & 0xff00ff));
									int i_2079_ = ((i_2078_ & 0x1000100) + (i_2077_ - i_2078_ & 0x10000));
									i_2076_ = (i_2077_ - i_2079_ | i_2079_ - (i_2079_ >>> 8));
									i_2079_ = is[i_1958_];
									i_2077_ = i_2076_ + i_2079_;
									i_2078_ = (i_2076_ & 0xff00ff) + (i_2079_ & 0xff00ff);
									i_2079_ = ((i_2078_ & 0x1000100) + (i_2077_ - i_2078_ & 0x10000));
									is[i_1958_] = (i_2077_ - i_2079_ | i_2079_ - (i_2079_ >>> 8));
								}
								if (bool_1940_ && bool_1949_)
									fs[i_1958_] = f;
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_2072_;
						i_1958_ += i_1959_;
					}
				} else if (i_1945_ == 2) {
					int i_2080_ = i_1946_ >>> 24;
					int i_2081_ = 256 - i_2080_;
					int i_2082_ = (i_1946_ & 0xff00ff) * i_2081_ & ~0xff00ff;
					int i_2083_ = (i_1946_ & 0xff00) * i_2081_ & 0xff0000;
					i_1946_ = (i_2082_ | i_2083_) >>> 8;
					int i_2084_ = i_1950_;
					for (int i_2085_ = -i_1944_; i_2085_ < 0; i_2085_++) {
						int i_2086_ = ((i_1951_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2087_ = -i_1943_; i_2087_ < 0; i_2087_++) {
							if (!bool_1940_ || f < fs[i_1958_]) {
								int i_2088_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_1950_ >> 16) + i_2086_]);
								if (i_2088_ != 0) {
									if (bool) {
										i_2082_ = ((i_2088_ & 0xff00ff) * i_2080_ & ~0xff00ff);
										i_2083_ = ((i_2088_ & 0xff00) * i_2080_ & 0xff0000);
										i_2088_ = (((i_2082_ | i_2083_) >>> 8) + i_1946_);
										int i_2089_ = is[i_1958_];
										int i_2090_ = i_2088_ + i_2089_;
										int i_2091_ = ((i_2088_ & 0xff00ff) + (i_2089_ & 0xff00ff));
										i_2089_ = ((i_2091_ & 0x1000100) + (i_2090_ - i_2091_ & 0x10000));
										is[i_1958_] = (i_2090_ - i_2089_ | i_2089_ - (i_2089_ >>> 8));
									}
									if (bool_1940_ && bool_1949_)
										fs[i_1958_] = f;
								}
							}
							i_1950_ += i_1954_;
							i_1958_++;
						}
						i_1951_ += i_1955_;
						i_1950_ = i_2084_;
						i_1958_ += i_1959_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method749(boolean bool, boolean bool_2092_, boolean bool_2093_, int i, int i_2094_, float f, int i_2095_, int i_2096_, int i_2097_, int i_2098_, int i_2099_, int i_2100_, boolean bool_2101_) {
		if (i_2095_ > 0 && i_2096_ > 0 && (bool || bool_2092_)) {
			int i_2102_ = 0;
			int i_2103_ = 0;
			int i_2104_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
			int i_2105_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
			int i_2106_ = (i_2104_ << 16) / i_2095_;
			int i_2107_ = (i_2105_ << 16) / i_2096_;
			if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
				int i_2108_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_2106_ - 1) / i_2106_);
				i += i_2108_;
				i_2102_ += (i_2108_ * i_2106_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
				int i_2109_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_2107_ - 1) / i_2107_);
				i_2094_ += i_2109_;
				i_2103_ += (i_2109_ * i_2107_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9358 < i_2104_)
				i_2095_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_2102_ + i_2106_ - 1) / i_2106_;
			if (((Class61_Sub3_Sub2) this).anInt9325 < i_2105_)
				i_2096_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_2103_ + i_2107_ - 1) / i_2107_;
			int i_2110_ = i + i_2094_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2111_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_2095_);
			if (i_2094_ + i_2096_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_2096_ -= (i_2094_ + i_2096_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_2094_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2112_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2094_);
				i_2096_ -= i_2112_;
				i_2110_ += i_2112_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2103_ += i_2107_ * i_2112_;
			}
			if (i + i_2095_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2113_ = (i + i_2095_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_2095_ -= i_2113_;
				i_2111_ += i_2113_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2114_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_2095_ -= i_2114_;
				i_2110_ += i_2114_;
				i_2102_ += i_2106_ * i_2114_;
				i_2111_ += i_2114_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2099_ == 0) {
				if (i_2097_ == 1) {
					int i_2115_ = i_2102_;
					for (int i_2116_ = -i_2096_; i_2116_ < 0; i_2116_++) {
						int i_2117_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2118_ = -i_2095_; i_2118_ < 0; i_2118_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool)
									is[i_2110_] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2117_]);
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2115_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 0) {
					int i_2119_ = (i_2098_ & 0xff0000) >> 16;
					int i_2120_ = (i_2098_ & 0xff00) >> 8;
					int i_2121_ = i_2098_ & 0xff;
					int i_2122_ = i_2102_;
					for (int i_2123_ = -i_2096_; i_2123_ < 0; i_2123_++) {
						int i_2124_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2125_ = -i_2095_; i_2125_ < 0; i_2125_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool) {
									int i_2126_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2124_]);
									int i_2127_ = ((i_2126_ & 0xff0000) * i_2119_ & ~0xffffff);
									int i_2128_ = ((i_2126_ & 0xff00) * i_2120_ & 0xff0000);
									int i_2129_ = (i_2126_ & 0xff) * i_2121_ & 0xff00;
									is[i_2110_] = (i_2127_ | i_2128_ | i_2129_) >>> 8;
								}
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2122_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 3) {
					int i_2130_ = i_2102_;
					for (int i_2131_ = -i_2096_; i_2131_ < 0; i_2131_++) {
						int i_2132_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2133_ = -i_2095_; i_2133_ < 0; i_2133_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool) {
									int i_2134_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2132_]);
									int i_2135_ = i_2134_ + i_2098_;
									int i_2136_ = ((i_2134_ & 0xff00ff) + (i_2098_ & 0xff00ff));
									int i_2137_ = ((i_2136_ & 0x1000100) + (i_2135_ - i_2136_ & 0x10000));
									is[i_2110_] = (i_2135_ - i_2137_ | i_2137_ - (i_2137_ >>> 8));
								}
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2130_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 2) {
					int i_2138_ = i_2098_ >>> 24;
					int i_2139_ = 256 - i_2138_;
					int i_2140_ = (i_2098_ & 0xff00ff) * i_2139_ & ~0xff00ff;
					int i_2141_ = (i_2098_ & 0xff00) * i_2139_ & 0xff0000;
					i_2098_ = (i_2140_ | i_2141_) >>> 8;
					int i_2142_ = i_2102_;
					for (int i_2143_ = -i_2096_; i_2143_ < 0; i_2143_++) {
						int i_2144_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2145_ = -i_2095_; i_2145_ < 0; i_2145_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool) {
									int i_2146_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2144_]);
									i_2140_ = ((i_2146_ & 0xff00ff) * i_2138_ & ~0xff00ff);
									i_2141_ = ((i_2146_ & 0xff00) * i_2138_ & 0xff0000);
									is[i_2110_] = (((i_2140_ | i_2141_) >>> 8) + i_2098_);
								}
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2142_;
						i_2110_ += i_2111_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2099_ == 1) {
				if (i_2097_ == 1) {
					int i_2147_ = i_2102_;
					for (int i_2148_ = -i_2096_; i_2148_ < 0; i_2148_++) {
						int i_2149_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2150_ = -i_2095_; i_2150_ < 0; i_2150_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool) {
									int i_2151_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2149_]);
									int i_2152_ = i_2151_ >>> 24;
									int i_2153_ = 256 - i_2152_;
									int i_2154_ = is[i_2110_];
									is[i_2110_] = (((((i_2151_ & 0xff00ff) * i_2152_ + (i_2154_ & 0xff00ff) * i_2153_) & ~0xff00ff) >> 8) + (((((i_2151_ & ~0xff00ff) >>> 8) * i_2152_) + (((i_2154_ & ~0xff00ff) >>> 8) * i_2153_)) & ~0xff00ff));
								}
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2147_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 0) {
					int i_2155_ = i_2102_;
					if ((i_2098_ & 0xffffff) == 16777215) {
						for (int i_2156_ = -i_2096_; i_2156_ < 0; i_2156_++) {
							int i_2157_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_2158_ = -i_2095_; i_2158_ < 0; i_2158_++) {
								if (!bool_2092_ || f < fs[i_2110_]) {
									if (bool) {
										int i_2159_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2157_]);
										int i_2160_ = ((i_2159_ >>> 24) * (i_2098_ >>> 24) >> 8);
										int i_2161_ = 256 - i_2160_;
										int i_2162_ = is[i_2110_];
										is[i_2110_] = ((((i_2159_ & 0xff00ff) * i_2160_ + ((i_2162_ & 0xff00ff) * i_2161_)) & ~0xff00ff) + (((i_2159_ & 0xff00) * i_2160_ + ((i_2162_ & 0xff00) * i_2161_)) & 0xff0000)) >> 8;
									}
									if (bool_2092_ && bool_2101_)
										fs[i_2110_] = f;
								}
								i_2102_ += i_2106_;
								i_2110_++;
							}
							i_2103_ += i_2107_;
							i_2102_ = i_2155_;
							i_2110_ += i_2111_;
						}
					} else {
						int i_2163_ = (i_2098_ & 0xff0000) >> 16;
						int i_2164_ = (i_2098_ & 0xff00) >> 8;
						int i_2165_ = i_2098_ & 0xff;
						for (int i_2166_ = -i_2096_; i_2166_ < 0; i_2166_++) {
							int i_2167_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_2168_ = -i_2095_; i_2168_ < 0; i_2168_++) {
								if (!bool_2092_ || f < fs[i_2110_]) {
									int i_2169_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2167_]);
									int i_2170_ = ((i_2169_ >>> 24) * (i_2098_ >>> 24) >> 8);
									int i_2171_ = 256 - i_2170_;
									if (i_2170_ != 255) {
										if (bool) {
											int i_2172_ = (((i_2169_ & 0xff0000) * i_2163_) & ~0xffffff);
											int i_2173_ = ((i_2169_ & 0xff00) * i_2164_ & 0xff0000);
											int i_2174_ = ((i_2169_ & 0xff) * i_2165_ & 0xff00);
											i_2169_ = (i_2172_ | i_2173_ | i_2174_) >>> 8;
											int i_2175_ = is[i_2110_];
											is[i_2110_] = (((((i_2169_ & 0xff00ff) * i_2170_) + ((i_2175_ & 0xff00ff) * i_2171_)) & ~0xff00ff) + ((((i_2169_ & 0xff00) * i_2170_) + ((i_2175_ & 0xff00) * i_2171_)) & 0xff0000)) >> 8;
											if (bool_2093_) {
												int i_2176_ = ((i_2175_ >>> 24) + i_2170_);
												if (i_2176_ > 255)
													i_2176_ = 255;
												is[i_2110_] |= i_2176_ << 24;
											}
										}
										if (bool_2092_ && bool_2101_)
											fs[i_2110_] = f;
									} else {
										if (bool) {
											int i_2177_ = (((i_2169_ & 0xff0000) * i_2163_) & ~0xffffff);
											int i_2178_ = ((i_2169_ & 0xff00) * i_2164_ & 0xff0000);
											int i_2179_ = ((i_2169_ & 0xff) * i_2165_ & 0xff00);
											is[i_2110_] = (i_2177_ | i_2178_ | i_2179_) >>> 8;
										}
										if (bool_2092_ && bool_2101_)
											fs[i_2110_] = f;
									}
								}
								i_2102_ += i_2106_;
								i_2110_++;
							}
							i_2103_ += i_2107_;
							i_2102_ = i_2155_;
							i_2110_ += i_2111_;
						}
					}
				} else if (i_2097_ == 3) {
					int i_2180_ = i_2102_;
					for (int i_2181_ = -i_2096_; i_2181_ < 0; i_2181_++) {
						int i_2182_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2183_ = -i_2095_; i_2183_ < 0; i_2183_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool) {
									int i_2184_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2182_]);
									int i_2185_ = i_2184_ + i_2098_;
									int i_2186_ = ((i_2184_ & 0xff00ff) + (i_2098_ & 0xff00ff));
									int i_2187_ = ((i_2186_ & 0x1000100) + (i_2185_ - i_2186_ & 0x10000));
									i_2187_ = (i_2185_ - i_2187_ | i_2187_ - (i_2187_ >>> 8));
									int i_2188_ = ((i_2187_ >>> 24) * (i_2098_ >>> 24) >> 8);
									int i_2189_ = 256 - i_2188_;
									if (i_2188_ != 255) {
										i_2184_ = i_2187_;
										i_2187_ = is[i_2110_];
										i_2187_ = ((((i_2184_ & 0xff00ff) * i_2188_ + ((i_2187_ & 0xff00ff) * i_2189_)) & ~0xff00ff) + (((i_2184_ & 0xff00) * i_2188_ + ((i_2187_ & 0xff00) * i_2189_)) & 0xff0000)) >> 8;
									}
									is[i_2110_] = i_2187_;
								}
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2180_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 2) {
					int i_2190_ = i_2098_ >>> 24;
					int i_2191_ = 256 - i_2190_;
					int i_2192_ = (i_2098_ & 0xff00ff) * i_2191_ & ~0xff00ff;
					int i_2193_ = (i_2098_ & 0xff00) * i_2191_ & 0xff0000;
					i_2098_ = (i_2192_ | i_2193_) >>> 8;
					int i_2194_ = i_2102_;
					for (int i_2195_ = -i_2096_; i_2195_ < 0; i_2195_++) {
						int i_2196_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2197_ = -i_2095_; i_2197_ < 0; i_2197_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool) {
									int i_2198_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2196_]);
									int i_2199_ = i_2198_ >>> 24;
									int i_2200_ = 256 - i_2199_;
									i_2192_ = ((i_2198_ & 0xff00ff) * i_2190_ & ~0xff00ff);
									i_2193_ = ((i_2198_ & 0xff00) * i_2190_ & 0xff0000);
									i_2198_ = (((i_2192_ | i_2193_) >>> 8) + i_2098_);
									int i_2201_ = is[i_2110_];
									is[i_2110_] = ((((i_2198_ & 0xff00ff) * i_2199_ + (i_2201_ & 0xff00ff) * i_2200_) & ~0xff00ff) + (((i_2198_ & 0xff00) * i_2199_ + (i_2201_ & 0xff00) * i_2200_) & 0xff0000)) >> 8;
								}
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2194_;
						i_2110_ += i_2111_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2099_ == 2) {
				if (i_2097_ == 1) {
					int i_2202_ = i_2102_;
					for (int i_2203_ = -i_2096_; i_2203_ < 0; i_2203_++) {
						int i_2204_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2205_ = -i_2095_; i_2205_ < 0; i_2205_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								int i_2206_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2204_]);
								if (i_2206_ != 0) {
									if (bool) {
										int i_2207_ = is[i_2110_];
										int i_2208_ = i_2206_ + i_2207_;
										int i_2209_ = ((i_2206_ & 0xff00ff) + (i_2207_ & 0xff00ff));
										i_2207_ = ((i_2209_ & 0x1000100) + (i_2208_ - i_2209_ & 0x10000));
										is[i_2110_] = (i_2208_ - i_2207_ | i_2207_ - (i_2207_ >>> 8));
									}
									if (bool_2092_ && bool_2101_)
										fs[i_2110_] = f;
								}
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2202_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 0) {
					int i_2210_ = i_2102_;
					int i_2211_ = (i_2098_ & 0xff0000) >> 16;
					int i_2212_ = (i_2098_ & 0xff00) >> 8;
					int i_2213_ = i_2098_ & 0xff;
					for (int i_2214_ = -i_2096_; i_2214_ < 0; i_2214_++) {
						int i_2215_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2216_ = -i_2095_; i_2216_ < 0; i_2216_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								int i_2217_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2215_]);
								if (i_2217_ != 0) {
									if (bool) {
										int i_2218_ = ((i_2217_ & 0xff0000) * i_2211_ & ~0xffffff);
										int i_2219_ = ((i_2217_ & 0xff00) * i_2212_ & 0xff0000);
										int i_2220_ = ((i_2217_ & 0xff) * i_2213_ & 0xff00);
										i_2217_ = (i_2218_ | i_2219_ | i_2220_) >>> 8;
										int i_2221_ = is[i_2110_];
										int i_2222_ = i_2217_ + i_2221_;
										int i_2223_ = ((i_2217_ & 0xff00ff) + (i_2221_ & 0xff00ff));
										i_2221_ = ((i_2223_ & 0x1000100) + (i_2222_ - i_2223_ & 0x10000));
										is[i_2110_] = (i_2222_ - i_2221_ | i_2221_ - (i_2221_ >>> 8));
									}
									if (bool_2092_ && bool_2101_)
										fs[i_2110_] = f;
								}
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2210_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 3) {
					int i_2224_ = i_2102_;
					for (int i_2225_ = -i_2096_; i_2225_ < 0; i_2225_++) {
						int i_2226_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2227_ = -i_2095_; i_2227_ < 0; i_2227_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								if (bool) {
									int i_2228_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2226_]);
									int i_2229_ = i_2228_ + i_2098_;
									int i_2230_ = ((i_2228_ & 0xff00ff) + (i_2098_ & 0xff00ff));
									int i_2231_ = ((i_2230_ & 0x1000100) + (i_2229_ - i_2230_ & 0x10000));
									i_2228_ = (i_2229_ - i_2231_ | i_2231_ - (i_2231_ >>> 8));
									i_2231_ = is[i_2110_];
									i_2229_ = i_2228_ + i_2231_;
									i_2230_ = (i_2228_ & 0xff00ff) + (i_2231_ & 0xff00ff);
									i_2231_ = ((i_2230_ & 0x1000100) + (i_2229_ - i_2230_ & 0x10000));
									is[i_2110_] = (i_2229_ - i_2231_ | i_2231_ - (i_2231_ >>> 8));
								}
								if (bool_2092_ && bool_2101_)
									fs[i_2110_] = f;
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2224_;
						i_2110_ += i_2111_;
					}
				} else if (i_2097_ == 2) {
					int i_2232_ = i_2098_ >>> 24;
					int i_2233_ = 256 - i_2232_;
					int i_2234_ = (i_2098_ & 0xff00ff) * i_2233_ & ~0xff00ff;
					int i_2235_ = (i_2098_ & 0xff00) * i_2233_ & 0xff0000;
					i_2098_ = (i_2234_ | i_2235_) >>> 8;
					int i_2236_ = i_2102_;
					for (int i_2237_ = -i_2096_; i_2237_ < 0; i_2237_++) {
						int i_2238_ = ((i_2103_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2239_ = -i_2095_; i_2239_ < 0; i_2239_++) {
							if (!bool_2092_ || f < fs[i_2110_]) {
								int i_2240_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2102_ >> 16) + i_2238_]);
								if (i_2240_ != 0) {
									if (bool) {
										i_2234_ = ((i_2240_ & 0xff00ff) * i_2232_ & ~0xff00ff);
										i_2235_ = ((i_2240_ & 0xff00) * i_2232_ & 0xff0000);
										i_2240_ = (((i_2234_ | i_2235_) >>> 8) + i_2098_);
										int i_2241_ = is[i_2110_];
										int i_2242_ = i_2240_ + i_2241_;
										int i_2243_ = ((i_2240_ & 0xff00ff) + (i_2241_ & 0xff00ff));
										i_2241_ = ((i_2243_ & 0x1000100) + (i_2242_ - i_2243_ & 0x10000));
										is[i_2110_] = (i_2242_ - i_2241_ | i_2241_ - (i_2241_ >>> 8));
									}
									if (bool_2092_ && bool_2101_)
										fs[i_2110_] = f;
								}
							}
							i_2102_ += i_2106_;
							i_2110_++;
						}
						i_2103_ += i_2107_;
						i_2102_ = i_2236_;
						i_2110_ += i_2111_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method755(int i, int i_2244_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2245_ = anInt9356;
					while (i_2245_ < 0) {
						int i_2246_ = anInt9339;
						int i_2247_ = anInt9346;
						int i_2248_ = anInt9324;
						int i_2249_ = anInt9347;
						if (i_2247_ >= 0 && i_2248_ >= 0 && i_2247_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0 && i_2248_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							for (/**/; i_2249_ < 0; i_2249_++)
								method758(((i_2248_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2247_ >> 12), i_2246_++, is, i, i_2244_);
						}
						i_2245_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2250_ = anInt9356;
					while (i_2250_ < 0) {
						int i_2251_ = anInt9339;
						int i_2252_ = anInt9346;
						int i_2253_ = anInt9324 + anInt9349;
						int i_2254_ = anInt9347;
						if (i_2252_ >= 0 && i_2252_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0) {
							int i_2255_;
							if ((i_2255_ = (i_2253_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
								i_2255_ = (anInt9341 - i_2255_) / anInt9341;
								i_2254_ += i_2255_;
								i_2253_ += anInt9341 * i_2255_;
								i_2251_ += i_2255_;
							}
							if ((i_2255_ = (i_2253_ - anInt9341) / anInt9341) > i_2254_)
								i_2254_ = i_2255_;
							for (/**/; i_2254_ < 0; i_2254_++) {
								method758(((i_2253_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2252_ >> 12), i_2251_++, is, i, i_2244_);
								i_2253_ += anInt9341;
							}
						}
						i_2250_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2256_ = anInt9356;
					while (i_2256_ < 0) {
						int i_2257_ = anInt9339;
						int i_2258_ = anInt9346;
						int i_2259_ = anInt9324 + anInt9349;
						int i_2260_ = anInt9347;
						if (i_2258_ >= 0 && i_2258_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) < 0) {
							if (i_2259_ < 0) {
								int i_2261_ = (anInt9341 - 1 - i_2259_) / anInt9341;
								i_2260_ += i_2261_;
								i_2259_ += anInt9341 * i_2261_;
								i_2257_ += i_2261_;
							}
							int i_2262_;
							if ((i_2262_ = (1 + i_2259_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2260_)
								i_2260_ = i_2262_;
							for (/**/; i_2260_ < 0; i_2260_++) {
								method758(((i_2259_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2258_ >> 12), i_2257_++, is, i, i_2244_);
								i_2259_ += anInt9341;
							}
						}
						i_2256_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2263_ = anInt9356;
					while (i_2263_ < 0) {
						int i_2264_ = anInt9339;
						int i_2265_ = anInt9346 + anInt9348;
						int i_2266_ = anInt9324;
						int i_2267_ = anInt9347;
						if (i_2266_ >= 0 && i_2266_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							int i_2268_;
							if ((i_2268_ = (i_2265_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2268_ = (anInt9340 - i_2268_) / anInt9340;
								i_2267_ += i_2268_;
								i_2265_ += anInt9340 * i_2268_;
								i_2264_ += i_2268_;
							}
							if ((i_2268_ = (i_2265_ - anInt9340) / anInt9340) > i_2267_)
								i_2267_ = i_2268_;
							for (/**/; i_2267_ < 0; i_2267_++) {
								method758(((i_2266_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2265_ >> 12), i_2264_++, is, i, i_2244_);
								i_2265_ += anInt9340;
							}
						}
						i_2263_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2269_ = anInt9356;
					while (i_2269_ < 0) {
						int i_2270_ = anInt9339;
						int i_2271_ = anInt9346 + anInt9348;
						int i_2272_ = anInt9324 + anInt9349;
						int i_2273_ = anInt9347;
						int i_2274_;
						if ((i_2274_ = i_2271_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) >= 0) {
							i_2274_ = (anInt9340 - i_2274_) / anInt9340;
							i_2273_ += i_2274_;
							i_2271_ += anInt9340 * i_2274_;
							i_2272_ += anInt9341 * i_2274_;
							i_2270_ += i_2274_;
						}
						if ((i_2274_ = (i_2271_ - anInt9340) / anInt9340) > i_2273_)
							i_2273_ = i_2274_;
						if ((i_2274_ = i_2272_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_2274_ = (anInt9341 - i_2274_) / anInt9341;
							i_2273_ += i_2274_;
							i_2271_ += anInt9340 * i_2274_;
							i_2272_ += anInt9341 * i_2274_;
							i_2270_ += i_2274_;
						}
						if ((i_2274_ = (i_2272_ - anInt9341) / anInt9341) > i_2273_)
							i_2273_ = i_2274_;
						for (/**/; i_2273_ < 0; i_2273_++) {
							method758((((i_2272_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2271_ >> 12)), i_2270_++, is, i, i_2244_);
							i_2271_ += anInt9340;
							i_2272_ += anInt9341;
						}
						i_2269_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2275_ = anInt9356;
					while (i_2275_ < 0) {
						int i_2276_ = anInt9339;
						int i_2277_ = anInt9346 + anInt9348;
						int i_2278_ = anInt9324 + anInt9349;
						int i_2279_ = anInt9347;
						int i_2280_;
						if ((i_2280_ = i_2277_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) >= 0) {
							i_2280_ = (anInt9340 - i_2280_) / anInt9340;
							i_2279_ += i_2280_;
							i_2277_ += anInt9340 * i_2280_;
							i_2278_ += anInt9341 * i_2280_;
							i_2276_ += i_2280_;
						}
						if ((i_2280_ = (i_2277_ - anInt9340) / anInt9340) > i_2279_)
							i_2279_ = i_2280_;
						if (i_2278_ < 0) {
							i_2280_ = (anInt9341 - 1 - i_2278_) / anInt9341;
							i_2279_ += i_2280_;
							i_2277_ += anInt9340 * i_2280_;
							i_2278_ += anInt9341 * i_2280_;
							i_2276_ += i_2280_;
						}
						if ((i_2280_ = (1 + i_2278_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2279_)
							i_2279_ = i_2280_;
						for (/**/; i_2279_ < 0; i_2279_++) {
							method758((((i_2278_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2277_ >> 12)), i_2276_++, is, i, i_2244_);
							i_2277_ += anInt9340;
							i_2278_ += anInt9341;
						}
						i_2275_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2281_ = anInt9356;
				while (i_2281_ < 0) {
					int i_2282_ = anInt9339;
					int i_2283_ = anInt9346 + anInt9348;
					int i_2284_ = anInt9324;
					int i_2285_ = anInt9347;
					if (i_2284_ >= 0 && i_2284_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
						if (i_2283_ < 0) {
							int i_2286_ = (anInt9340 - 1 - i_2283_) / anInt9340;
							i_2285_ += i_2286_;
							i_2283_ += anInt9340 * i_2286_;
							i_2282_ += i_2286_;
						}
						int i_2287_;
						if ((i_2287_ = (1 + i_2283_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2285_)
							i_2285_ = i_2287_;
						for (/**/; i_2285_ < 0; i_2285_++) {
							method758((((i_2284_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2283_ >> 12)), i_2282_++, is, i, i_2244_);
							i_2283_ += anInt9340;
						}
					}
					i_2281_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_2288_ = anInt9356; i_2288_ < 0; i_2288_++) {
					int i_2289_ = anInt9339;
					int i_2290_ = anInt9346 + anInt9348;
					int i_2291_ = anInt9324 + anInt9349;
					int i_2292_ = anInt9347;
					if (i_2290_ < 0) {
						int i_2293_ = (anInt9340 - 1 - i_2290_) / anInt9340;
						i_2292_ += i_2293_;
						i_2290_ += anInt9340 * i_2293_;
						i_2291_ += anInt9341 * i_2293_;
						i_2289_ += i_2293_;
					}
					int i_2294_;
					if ((i_2294_ = (1 + i_2290_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2292_)
						i_2292_ = i_2294_;
					if ((i_2294_ = i_2291_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
						i_2294_ = (anInt9341 - i_2294_) / anInt9341;
						i_2292_ += i_2294_;
						i_2290_ += anInt9340 * i_2294_;
						i_2291_ += anInt9341 * i_2294_;
						i_2289_ += i_2294_;
					}
					if ((i_2294_ = (i_2291_ - anInt9341) / anInt9341) > i_2292_)
						i_2292_ = i_2294_;
					for (/**/; i_2292_ < 0; i_2292_++) {
						method758((((i_2291_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2290_ >> 12)), i_2289_++, is, i, i_2244_);
						i_2290_ += anInt9340;
						i_2291_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_2295_ = anInt9356; i_2295_ < 0; i_2295_++) {
					int i_2296_ = anInt9339;
					int i_2297_ = anInt9346 + anInt9348;
					int i_2298_ = anInt9324 + anInt9349;
					int i_2299_ = anInt9347;
					if (i_2297_ < 0) {
						int i_2300_ = (anInt9340 - 1 - i_2297_) / anInt9340;
						i_2299_ += i_2300_;
						i_2297_ += anInt9340 * i_2300_;
						i_2298_ += anInt9341 * i_2300_;
						i_2296_ += i_2300_;
					}
					int i_2301_;
					if ((i_2301_ = (1 + i_2297_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2299_)
						i_2299_ = i_2301_;
					if (i_2298_ < 0) {
						i_2301_ = (anInt9341 - 1 - i_2298_) / anInt9341;
						i_2299_ += i_2301_;
						i_2297_ += anInt9340 * i_2301_;
						i_2298_ += anInt9341 * i_2301_;
						i_2296_ += i_2301_;
					}
					if ((i_2301_ = (1 + i_2298_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2299_)
						i_2299_ = i_2301_;
					for (/**/; i_2299_ < 0; i_2299_++) {
						method758((((i_2298_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2297_ >> 12)), i_2296_++, is, i, i_2244_);
						i_2297_ += anInt9340;
						i_2298_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method753(int[] is, int[] is_2302_, int i, int i_2303_) {
		int[] is_2304_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2304_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2305_ = anInt9356;
					while (i_2305_ < 0) {
						int i_2306_ = i_2305_ + i_2303_;
						if (i_2306_ >= 0) {
							if (i_2306_ >= is.length)
								break;
							int i_2307_ = anInt9339;
							int i_2308_ = anInt9346;
							int i_2309_ = anInt9324;
							int i_2310_ = anInt9347;
							if (i_2308_ >= 0 && i_2309_ >= 0 && (i_2308_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0 && (i_2309_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2311_ = is[i_2306_] - i;
								int i_2312_ = -is_2302_[i_2306_];
								int i_2313_ = i_2311_ - (i_2307_ - anInt9339);
								if (i_2313_ > 0) {
									i_2307_ += i_2313_;
									i_2310_ += i_2313_;
									i_2308_ += anInt9340 * i_2313_;
									i_2309_ += anInt9341 * i_2313_;
								} else
									i_2312_ -= i_2313_;
								if (i_2310_ < i_2312_)
									i_2310_ = i_2312_;
								for (/**/; i_2310_ < 0; i_2310_++) {
									int i_2314_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2309_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2308_ >> 12))]);
									int i_2315_ = i_2314_ >>> 24;
									int i_2316_ = 256 - i_2315_;
									int i_2317_ = is_2304_[i_2307_];
									is_2304_[i_2307_++] = ((((i_2314_ & 0xff00ff) * i_2315_ + (i_2317_ & 0xff00ff) * i_2316_) & ~0xff00ff) + (((i_2314_ & 0xff00) * i_2315_ + (i_2317_ & 0xff00) * i_2316_) & 0xff0000)) >> 8;
								}
							}
						}
						i_2305_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2318_ = anInt9356;
					while (i_2318_ < 0) {
						int i_2319_ = i_2318_ + i_2303_;
						if (i_2319_ >= 0) {
							if (i_2319_ >= is.length)
								break;
							int i_2320_ = anInt9339;
							int i_2321_ = anInt9346;
							int i_2322_ = anInt9324 + anInt9349;
							int i_2323_ = anInt9347;
							if (i_2321_ >= 0 && (i_2321_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								int i_2324_;
								if ((i_2324_ = (i_2322_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
									i_2324_ = (anInt9341 - i_2324_) / anInt9341;
									i_2323_ += i_2324_;
									i_2322_ += anInt9341 * i_2324_;
									i_2320_ += i_2324_;
								}
								if ((i_2324_ = (i_2322_ - anInt9341) / anInt9341) > i_2323_)
									i_2323_ = i_2324_;
								int i_2325_ = is[i_2319_] - i;
								int i_2326_ = -is_2302_[i_2319_];
								int i_2327_ = i_2325_ - (i_2320_ - anInt9339);
								if (i_2327_ > 0) {
									i_2320_ += i_2327_;
									i_2323_ += i_2327_;
									i_2321_ += anInt9340 * i_2327_;
									i_2322_ += anInt9341 * i_2327_;
								} else
									i_2326_ -= i_2327_;
								if (i_2323_ < i_2326_)
									i_2323_ = i_2326_;
								for (/**/; i_2323_ < 0; i_2323_++) {
									int i_2328_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2322_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2321_ >> 12))]);
									int i_2329_ = i_2328_ >>> 24;
									int i_2330_ = 256 - i_2329_;
									int i_2331_ = is_2304_[i_2320_];
									is_2304_[i_2320_++] = ((((i_2328_ & 0xff00ff) * i_2329_ + (i_2331_ & 0xff00ff) * i_2330_) & ~0xff00ff) + (((i_2328_ & 0xff00) * i_2329_ + (i_2331_ & 0xff00) * i_2330_) & 0xff0000)) >> 8;
									i_2322_ += anInt9341;
								}
							}
						}
						i_2318_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2332_ = anInt9356;
					while (i_2332_ < 0) {
						int i_2333_ = i_2332_ + i_2303_;
						if (i_2333_ >= 0) {
							if (i_2333_ >= is.length)
								break;
							int i_2334_ = anInt9339;
							int i_2335_ = anInt9346;
							int i_2336_ = anInt9324 + anInt9349;
							int i_2337_ = anInt9347;
							if (i_2335_ >= 0 && (i_2335_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								if (i_2336_ < 0) {
									int i_2338_ = ((anInt9341 - 1 - i_2336_) / anInt9341);
									i_2337_ += i_2338_;
									i_2336_ += anInt9341 * i_2338_;
									i_2334_ += i_2338_;
								}
								int i_2339_;
								if ((i_2339_ = (1 + i_2336_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2337_)
									i_2337_ = i_2339_;
								int i_2340_ = is[i_2333_] - i;
								int i_2341_ = -is_2302_[i_2333_];
								int i_2342_ = i_2340_ - (i_2334_ - anInt9339);
								if (i_2342_ > 0) {
									i_2334_ += i_2342_;
									i_2337_ += i_2342_;
									i_2335_ += anInt9340 * i_2342_;
									i_2336_ += anInt9341 * i_2342_;
								} else
									i_2341_ -= i_2342_;
								if (i_2337_ < i_2341_)
									i_2337_ = i_2341_;
								for (/**/; i_2337_ < 0; i_2337_++) {
									int i_2343_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2336_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2335_ >> 12))]);
									int i_2344_ = i_2343_ >>> 24;
									int i_2345_ = 256 - i_2344_;
									int i_2346_ = is_2304_[i_2334_];
									is_2304_[i_2334_++] = ((((i_2343_ & 0xff00ff) * i_2344_ + (i_2346_ & 0xff00ff) * i_2345_) & ~0xff00ff) + (((i_2343_ & 0xff00) * i_2344_ + (i_2346_ & 0xff00) * i_2345_) & 0xff0000)) >> 8;
									i_2336_ += anInt9341;
								}
							}
						}
						i_2332_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2347_ = anInt9356;
					while (i_2347_ < 0) {
						int i_2348_ = i_2347_ + i_2303_;
						if (i_2348_ >= 0) {
							if (i_2348_ >= is.length)
								break;
							int i_2349_ = anInt9339;
							int i_2350_ = anInt9346 + anInt9348;
							int i_2351_ = anInt9324;
							int i_2352_ = anInt9347;
							if (i_2351_ >= 0 && (i_2351_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2353_;
								if ((i_2353_ = (i_2350_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
									i_2353_ = (anInt9340 - i_2353_) / anInt9340;
									i_2352_ += i_2353_;
									i_2350_ += anInt9340 * i_2353_;
									i_2349_ += i_2353_;
								}
								if ((i_2353_ = (i_2350_ - anInt9340) / anInt9340) > i_2352_)
									i_2352_ = i_2353_;
								int i_2354_ = is[i_2348_] - i;
								int i_2355_ = -is_2302_[i_2348_];
								int i_2356_ = i_2354_ - (i_2349_ - anInt9339);
								if (i_2356_ > 0) {
									i_2349_ += i_2356_;
									i_2352_ += i_2356_;
									i_2350_ += anInt9340 * i_2356_;
									i_2351_ += anInt9341 * i_2356_;
								} else
									i_2355_ -= i_2356_;
								if (i_2352_ < i_2355_)
									i_2352_ = i_2355_;
								for (/**/; i_2352_ < 0; i_2352_++) {
									int i_2357_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2351_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2350_ >> 12))]);
									int i_2358_ = i_2357_ >>> 24;
									int i_2359_ = 256 - i_2358_;
									int i_2360_ = is_2304_[i_2349_];
									is_2304_[i_2349_++] = ((((i_2357_ & 0xff00ff) * i_2358_ + (i_2360_ & 0xff00ff) * i_2359_) & ~0xff00ff) + (((i_2357_ & 0xff00) * i_2358_ + (i_2360_ & 0xff00) * i_2359_) & 0xff0000)) >> 8;
									i_2350_ += anInt9340;
								}
							}
						}
						i_2347_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2361_ = anInt9356;
					while (i_2361_ < 0) {
						int i_2362_ = i_2361_ + i_2303_;
						if (i_2362_ >= 0) {
							if (i_2362_ >= is.length)
								break;
							int i_2363_ = anInt9339;
							int i_2364_ = anInt9346 + anInt9348;
							int i_2365_ = anInt9324 + anInt9349;
							int i_2366_ = anInt9347;
							int i_2367_;
							if ((i_2367_ = (i_2364_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2367_ = (anInt9340 - i_2367_) / anInt9340;
								i_2366_ += i_2367_;
								i_2364_ += anInt9340 * i_2367_;
								i_2365_ += anInt9341 * i_2367_;
								i_2363_ += i_2367_;
							}
							if ((i_2367_ = (i_2364_ - anInt9340) / anInt9340) > i_2366_)
								i_2366_ = i_2367_;
							if ((i_2367_ = (i_2365_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
								i_2367_ = (anInt9341 - i_2367_) / anInt9341;
								i_2366_ += i_2367_;
								i_2364_ += anInt9340 * i_2367_;
								i_2365_ += anInt9341 * i_2367_;
								i_2363_ += i_2367_;
							}
							if ((i_2367_ = (i_2365_ - anInt9341) / anInt9341) > i_2366_)
								i_2366_ = i_2367_;
							int i_2368_ = is[i_2362_] - i;
							int i_2369_ = -is_2302_[i_2362_];
							int i_2370_ = i_2368_ - (i_2363_ - anInt9339);
							if (i_2370_ > 0) {
								i_2363_ += i_2370_;
								i_2366_ += i_2370_;
								i_2364_ += anInt9340 * i_2370_;
								i_2365_ += anInt9341 * i_2370_;
							} else
								i_2369_ -= i_2370_;
							if (i_2366_ < i_2369_)
								i_2366_ = i_2369_;
							for (/**/; i_2366_ < 0; i_2366_++) {
								int i_2371_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2365_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2364_ >> 12))]);
								int i_2372_ = i_2371_ >>> 24;
								int i_2373_ = 256 - i_2372_;
								int i_2374_ = is_2304_[i_2363_];
								is_2304_[i_2363_++] = ((((i_2371_ & 0xff00ff) * i_2372_ + (i_2374_ & 0xff00ff) * i_2373_) & ~0xff00ff) + (((i_2371_ & 0xff00) * i_2372_ + (i_2374_ & 0xff00) * i_2373_) & 0xff0000)) >> 8;
								i_2364_ += anInt9340;
								i_2365_ += anInt9341;
							}
						}
						i_2361_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2375_ = anInt9356;
					while (i_2375_ < 0) {
						int i_2376_ = i_2375_ + i_2303_;
						if (i_2376_ >= 0) {
							if (i_2376_ >= is.length)
								break;
							int i_2377_ = anInt9339;
							int i_2378_ = anInt9346 + anInt9348;
							int i_2379_ = anInt9324 + anInt9349;
							int i_2380_ = anInt9347;
							int i_2381_;
							if ((i_2381_ = (i_2378_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2381_ = (anInt9340 - i_2381_) / anInt9340;
								i_2380_ += i_2381_;
								i_2378_ += anInt9340 * i_2381_;
								i_2379_ += anInt9341 * i_2381_;
								i_2377_ += i_2381_;
							}
							if ((i_2381_ = (i_2378_ - anInt9340) / anInt9340) > i_2380_)
								i_2380_ = i_2381_;
							if (i_2379_ < 0) {
								i_2381_ = (anInt9341 - 1 - i_2379_) / anInt9341;
								i_2380_ += i_2381_;
								i_2378_ += anInt9340 * i_2381_;
								i_2379_ += anInt9341 * i_2381_;
								i_2377_ += i_2381_;
							}
							if ((i_2381_ = (1 + i_2379_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2380_)
								i_2380_ = i_2381_;
							int i_2382_ = is[i_2376_] - i;
							int i_2383_ = -is_2302_[i_2376_];
							int i_2384_ = i_2382_ - (i_2377_ - anInt9339);
							if (i_2384_ > 0) {
								i_2377_ += i_2384_;
								i_2380_ += i_2384_;
								i_2378_ += anInt9340 * i_2384_;
								i_2379_ += anInt9341 * i_2384_;
							} else
								i_2383_ -= i_2384_;
							if (i_2380_ < i_2383_)
								i_2380_ = i_2383_;
							for (/**/; i_2380_ < 0; i_2380_++) {
								int i_2385_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2379_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2378_ >> 12))]);
								int i_2386_ = i_2385_ >>> 24;
								int i_2387_ = 256 - i_2386_;
								int i_2388_ = is_2304_[i_2377_];
								is_2304_[i_2377_++] = ((((i_2385_ & 0xff00ff) * i_2386_ + (i_2388_ & 0xff00ff) * i_2387_) & ~0xff00ff) + (((i_2385_ & 0xff00) * i_2386_ + (i_2388_ & 0xff00) * i_2387_) & 0xff0000)) >> 8;
								i_2378_ += anInt9340;
								i_2379_ += anInt9341;
							}
						}
						i_2375_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2389_ = anInt9356;
				while (i_2389_ < 0) {
					int i_2390_ = i_2389_ + i_2303_;
					if (i_2390_ >= 0) {
						if (i_2390_ >= is.length)
							break;
						int i_2391_ = anInt9339;
						int i_2392_ = anInt9346 + anInt9348;
						int i_2393_ = anInt9324;
						int i_2394_ = anInt9347;
						if (i_2393_ >= 0 && i_2393_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							if (i_2392_ < 0) {
								int i_2395_ = (anInt9340 - 1 - i_2392_) / anInt9340;
								i_2394_ += i_2395_;
								i_2392_ += anInt9340 * i_2395_;
								i_2391_ += i_2395_;
							}
							int i_2396_;
							if ((i_2396_ = (1 + i_2392_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2394_)
								i_2394_ = i_2396_;
							int i_2397_ = is[i_2390_] - i;
							int i_2398_ = -is_2302_[i_2390_];
							int i_2399_ = i_2397_ - (i_2391_ - anInt9339);
							if (i_2399_ > 0) {
								i_2391_ += i_2399_;
								i_2394_ += i_2399_;
								i_2392_ += anInt9340 * i_2399_;
								i_2393_ += anInt9341 * i_2399_;
							} else
								i_2398_ -= i_2399_;
							if (i_2394_ < i_2398_)
								i_2394_ = i_2398_;
							for (/**/; i_2394_ < 0; i_2394_++) {
								int i_2400_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2393_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2392_ >> 12))]);
								int i_2401_ = i_2400_ >>> 24;
								int i_2402_ = 256 - i_2401_;
								int i_2403_ = is_2304_[i_2391_];
								is_2304_[i_2391_++] = ((((i_2400_ & 0xff00ff) * i_2401_ + (i_2403_ & 0xff00ff) * i_2402_) & ~0xff00ff) + (((i_2400_ & 0xff00) * i_2401_ + (i_2403_ & 0xff00) * i_2402_) & 0xff0000)) >> 8;
								i_2392_ += anInt9340;
							}
						}
					}
					i_2389_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2404_ = anInt9356;
				while (i_2404_ < 0) {
					int i_2405_ = i_2404_ + i_2303_;
					if (i_2405_ >= 0) {
						if (i_2405_ >= is.length)
							break;
						int i_2406_ = anInt9339;
						int i_2407_ = anInt9346 + anInt9348;
						int i_2408_ = anInt9324 + anInt9349;
						int i_2409_ = anInt9347;
						if (i_2407_ < 0) {
							int i_2410_ = (anInt9340 - 1 - i_2407_) / anInt9340;
							i_2409_ += i_2410_;
							i_2407_ += anInt9340 * i_2410_;
							i_2408_ += anInt9341 * i_2410_;
							i_2406_ += i_2410_;
						}
						int i_2411_;
						if ((i_2411_ = (1 + i_2407_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2409_)
							i_2409_ = i_2411_;
						if ((i_2411_ = i_2408_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_2411_ = (anInt9341 - i_2411_) / anInt9341;
							i_2409_ += i_2411_;
							i_2407_ += anInt9340 * i_2411_;
							i_2408_ += anInt9341 * i_2411_;
							i_2406_ += i_2411_;
						}
						if ((i_2411_ = (i_2408_ - anInt9341) / anInt9341) > i_2409_)
							i_2409_ = i_2411_;
						int i_2412_ = is[i_2405_] - i;
						int i_2413_ = -is_2302_[i_2405_];
						int i_2414_ = i_2412_ - (i_2406_ - anInt9339);
						if (i_2414_ > 0) {
							i_2406_ += i_2414_;
							i_2409_ += i_2414_;
							i_2407_ += anInt9340 * i_2414_;
							i_2408_ += anInt9341 * i_2414_;
						} else
							i_2413_ -= i_2414_;
						if (i_2409_ < i_2413_)
							i_2409_ = i_2413_;
						for (/**/; i_2409_ < 0; i_2409_++) {
							int i_2415_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2408_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2407_ >> 12))]);
							int i_2416_ = i_2415_ >>> 24;
							int i_2417_ = 256 - i_2416_;
							int i_2418_ = is_2304_[i_2406_];
							is_2304_[i_2406_++] = ((((i_2415_ & 0xff00ff) * i_2416_ + (i_2418_ & 0xff00ff) * i_2417_) & ~0xff00ff) + (((i_2415_ & 0xff00) * i_2416_ + (i_2418_ & 0xff00) * i_2417_) & 0xff0000)) >> 8;
							i_2407_ += anInt9340;
							i_2408_ += anInt9341;
						}
					}
					i_2404_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2419_ = anInt9356;
				while (i_2419_ < 0) {
					int i_2420_ = i_2419_ + i_2303_;
					if (i_2420_ >= 0) {
						if (i_2420_ >= is.length)
							break;
						int i_2421_ = anInt9339;
						int i_2422_ = anInt9346 + anInt9348;
						int i_2423_ = anInt9324 + anInt9349;
						int i_2424_ = anInt9347;
						if (i_2422_ < 0) {
							int i_2425_ = (anInt9340 - 1 - i_2422_) / anInt9340;
							i_2424_ += i_2425_;
							i_2422_ += anInt9340 * i_2425_;
							i_2423_ += anInt9341 * i_2425_;
							i_2421_ += i_2425_;
						}
						int i_2426_;
						if ((i_2426_ = (1 + i_2422_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2424_)
							i_2424_ = i_2426_;
						if (i_2423_ < 0) {
							i_2426_ = (anInt9341 - 1 - i_2423_) / anInt9341;
							i_2424_ += i_2426_;
							i_2422_ += anInt9340 * i_2426_;
							i_2423_ += anInt9341 * i_2426_;
							i_2421_ += i_2426_;
						}
						if ((i_2426_ = (1 + i_2423_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2424_)
							i_2424_ = i_2426_;
						int i_2427_ = is[i_2420_] - i;
						int i_2428_ = -is_2302_[i_2420_];
						int i_2429_ = i_2427_ - (i_2421_ - anInt9339);
						if (i_2429_ > 0) {
							i_2421_ += i_2429_;
							i_2424_ += i_2429_;
							i_2422_ += anInt9340 * i_2429_;
							i_2423_ += anInt9341 * i_2429_;
						} else
							i_2428_ -= i_2429_;
						if (i_2424_ < i_2428_)
							i_2424_ = i_2428_;
						for (/**/; i_2424_ < 0; i_2424_++) {
							int i_2430_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2423_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2422_ >> 12))]);
							int i_2431_ = i_2430_ >>> 24;
							int i_2432_ = 256 - i_2431_;
							int i_2433_ = is_2304_[i_2421_];
							is_2304_[i_2421_++] = ((((i_2430_ & 0xff00ff) * i_2431_ + (i_2433_ & 0xff00ff) * i_2432_) & ~0xff00ff) + (((i_2430_ & 0xff00) * i_2431_ + (i_2433_ & 0xff00) * i_2432_) & 0xff0000)) >> 8;
							i_2422_ += anInt9340;
							i_2423_ += anInt9341;
						}
					}
					i_2419_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method746(int[] is, int[] is_2434_, int i, int i_2435_) {
		int[] is_2436_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2436_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2437_ = anInt9356;
					while (i_2437_ < 0) {
						int i_2438_ = i_2437_ + i_2435_;
						if (i_2438_ >= 0) {
							if (i_2438_ >= is.length)
								break;
							int i_2439_ = anInt9339;
							int i_2440_ = anInt9346;
							int i_2441_ = anInt9324;
							int i_2442_ = anInt9347;
							if (i_2440_ >= 0 && i_2441_ >= 0 && (i_2440_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0 && (i_2441_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2443_ = is[i_2438_] - i;
								int i_2444_ = -is_2434_[i_2438_];
								int i_2445_ = i_2443_ - (i_2439_ - anInt9339);
								if (i_2445_ > 0) {
									i_2439_ += i_2445_;
									i_2442_ += i_2445_;
									i_2440_ += anInt9340 * i_2445_;
									i_2441_ += anInt9341 * i_2445_;
								} else
									i_2444_ -= i_2445_;
								if (i_2442_ < i_2444_)
									i_2442_ = i_2444_;
								for (/**/; i_2442_ < 0; i_2442_++) {
									int i_2446_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2441_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2440_ >> 12))]);
									int i_2447_ = i_2446_ >>> 24;
									int i_2448_ = 256 - i_2447_;
									int i_2449_ = is_2436_[i_2439_];
									is_2436_[i_2439_++] = ((((i_2446_ & 0xff00ff) * i_2447_ + (i_2449_ & 0xff00ff) * i_2448_) & ~0xff00ff) + (((i_2446_ & 0xff00) * i_2447_ + (i_2449_ & 0xff00) * i_2448_) & 0xff0000)) >> 8;
								}
							}
						}
						i_2437_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2450_ = anInt9356;
					while (i_2450_ < 0) {
						int i_2451_ = i_2450_ + i_2435_;
						if (i_2451_ >= 0) {
							if (i_2451_ >= is.length)
								break;
							int i_2452_ = anInt9339;
							int i_2453_ = anInt9346;
							int i_2454_ = anInt9324 + anInt9349;
							int i_2455_ = anInt9347;
							if (i_2453_ >= 0 && (i_2453_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								int i_2456_;
								if ((i_2456_ = (i_2454_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
									i_2456_ = (anInt9341 - i_2456_) / anInt9341;
									i_2455_ += i_2456_;
									i_2454_ += anInt9341 * i_2456_;
									i_2452_ += i_2456_;
								}
								if ((i_2456_ = (i_2454_ - anInt9341) / anInt9341) > i_2455_)
									i_2455_ = i_2456_;
								int i_2457_ = is[i_2451_] - i;
								int i_2458_ = -is_2434_[i_2451_];
								int i_2459_ = i_2457_ - (i_2452_ - anInt9339);
								if (i_2459_ > 0) {
									i_2452_ += i_2459_;
									i_2455_ += i_2459_;
									i_2453_ += anInt9340 * i_2459_;
									i_2454_ += anInt9341 * i_2459_;
								} else
									i_2458_ -= i_2459_;
								if (i_2455_ < i_2458_)
									i_2455_ = i_2458_;
								for (/**/; i_2455_ < 0; i_2455_++) {
									int i_2460_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2454_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2453_ >> 12))]);
									int i_2461_ = i_2460_ >>> 24;
									int i_2462_ = 256 - i_2461_;
									int i_2463_ = is_2436_[i_2452_];
									is_2436_[i_2452_++] = ((((i_2460_ & 0xff00ff) * i_2461_ + (i_2463_ & 0xff00ff) * i_2462_) & ~0xff00ff) + (((i_2460_ & 0xff00) * i_2461_ + (i_2463_ & 0xff00) * i_2462_) & 0xff0000)) >> 8;
									i_2454_ += anInt9341;
								}
							}
						}
						i_2450_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2464_ = anInt9356;
					while (i_2464_ < 0) {
						int i_2465_ = i_2464_ + i_2435_;
						if (i_2465_ >= 0) {
							if (i_2465_ >= is.length)
								break;
							int i_2466_ = anInt9339;
							int i_2467_ = anInt9346;
							int i_2468_ = anInt9324 + anInt9349;
							int i_2469_ = anInt9347;
							if (i_2467_ >= 0 && (i_2467_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								if (i_2468_ < 0) {
									int i_2470_ = ((anInt9341 - 1 - i_2468_) / anInt9341);
									i_2469_ += i_2470_;
									i_2468_ += anInt9341 * i_2470_;
									i_2466_ += i_2470_;
								}
								int i_2471_;
								if ((i_2471_ = (1 + i_2468_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2469_)
									i_2469_ = i_2471_;
								int i_2472_ = is[i_2465_] - i;
								int i_2473_ = -is_2434_[i_2465_];
								int i_2474_ = i_2472_ - (i_2466_ - anInt9339);
								if (i_2474_ > 0) {
									i_2466_ += i_2474_;
									i_2469_ += i_2474_;
									i_2467_ += anInt9340 * i_2474_;
									i_2468_ += anInt9341 * i_2474_;
								} else
									i_2473_ -= i_2474_;
								if (i_2469_ < i_2473_)
									i_2469_ = i_2473_;
								for (/**/; i_2469_ < 0; i_2469_++) {
									int i_2475_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2468_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2467_ >> 12))]);
									int i_2476_ = i_2475_ >>> 24;
									int i_2477_ = 256 - i_2476_;
									int i_2478_ = is_2436_[i_2466_];
									is_2436_[i_2466_++] = ((((i_2475_ & 0xff00ff) * i_2476_ + (i_2478_ & 0xff00ff) * i_2477_) & ~0xff00ff) + (((i_2475_ & 0xff00) * i_2476_ + (i_2478_ & 0xff00) * i_2477_) & 0xff0000)) >> 8;
									i_2468_ += anInt9341;
								}
							}
						}
						i_2464_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2479_ = anInt9356;
					while (i_2479_ < 0) {
						int i_2480_ = i_2479_ + i_2435_;
						if (i_2480_ >= 0) {
							if (i_2480_ >= is.length)
								break;
							int i_2481_ = anInt9339;
							int i_2482_ = anInt9346 + anInt9348;
							int i_2483_ = anInt9324;
							int i_2484_ = anInt9347;
							if (i_2483_ >= 0 && (i_2483_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2485_;
								if ((i_2485_ = (i_2482_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
									i_2485_ = (anInt9340 - i_2485_) / anInt9340;
									i_2484_ += i_2485_;
									i_2482_ += anInt9340 * i_2485_;
									i_2481_ += i_2485_;
								}
								if ((i_2485_ = (i_2482_ - anInt9340) / anInt9340) > i_2484_)
									i_2484_ = i_2485_;
								int i_2486_ = is[i_2480_] - i;
								int i_2487_ = -is_2434_[i_2480_];
								int i_2488_ = i_2486_ - (i_2481_ - anInt9339);
								if (i_2488_ > 0) {
									i_2481_ += i_2488_;
									i_2484_ += i_2488_;
									i_2482_ += anInt9340 * i_2488_;
									i_2483_ += anInt9341 * i_2488_;
								} else
									i_2487_ -= i_2488_;
								if (i_2484_ < i_2487_)
									i_2484_ = i_2487_;
								for (/**/; i_2484_ < 0; i_2484_++) {
									int i_2489_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2483_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2482_ >> 12))]);
									int i_2490_ = i_2489_ >>> 24;
									int i_2491_ = 256 - i_2490_;
									int i_2492_ = is_2436_[i_2481_];
									is_2436_[i_2481_++] = ((((i_2489_ & 0xff00ff) * i_2490_ + (i_2492_ & 0xff00ff) * i_2491_) & ~0xff00ff) + (((i_2489_ & 0xff00) * i_2490_ + (i_2492_ & 0xff00) * i_2491_) & 0xff0000)) >> 8;
									i_2482_ += anInt9340;
								}
							}
						}
						i_2479_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2493_ = anInt9356;
					while (i_2493_ < 0) {
						int i_2494_ = i_2493_ + i_2435_;
						if (i_2494_ >= 0) {
							if (i_2494_ >= is.length)
								break;
							int i_2495_ = anInt9339;
							int i_2496_ = anInt9346 + anInt9348;
							int i_2497_ = anInt9324 + anInt9349;
							int i_2498_ = anInt9347;
							int i_2499_;
							if ((i_2499_ = (i_2496_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2499_ = (anInt9340 - i_2499_) / anInt9340;
								i_2498_ += i_2499_;
								i_2496_ += anInt9340 * i_2499_;
								i_2497_ += anInt9341 * i_2499_;
								i_2495_ += i_2499_;
							}
							if ((i_2499_ = (i_2496_ - anInt9340) / anInt9340) > i_2498_)
								i_2498_ = i_2499_;
							if ((i_2499_ = (i_2497_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
								i_2499_ = (anInt9341 - i_2499_) / anInt9341;
								i_2498_ += i_2499_;
								i_2496_ += anInt9340 * i_2499_;
								i_2497_ += anInt9341 * i_2499_;
								i_2495_ += i_2499_;
							}
							if ((i_2499_ = (i_2497_ - anInt9341) / anInt9341) > i_2498_)
								i_2498_ = i_2499_;
							int i_2500_ = is[i_2494_] - i;
							int i_2501_ = -is_2434_[i_2494_];
							int i_2502_ = i_2500_ - (i_2495_ - anInt9339);
							if (i_2502_ > 0) {
								i_2495_ += i_2502_;
								i_2498_ += i_2502_;
								i_2496_ += anInt9340 * i_2502_;
								i_2497_ += anInt9341 * i_2502_;
							} else
								i_2501_ -= i_2502_;
							if (i_2498_ < i_2501_)
								i_2498_ = i_2501_;
							for (/**/; i_2498_ < 0; i_2498_++) {
								int i_2503_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2497_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2496_ >> 12))]);
								int i_2504_ = i_2503_ >>> 24;
								int i_2505_ = 256 - i_2504_;
								int i_2506_ = is_2436_[i_2495_];
								is_2436_[i_2495_++] = ((((i_2503_ & 0xff00ff) * i_2504_ + (i_2506_ & 0xff00ff) * i_2505_) & ~0xff00ff) + (((i_2503_ & 0xff00) * i_2504_ + (i_2506_ & 0xff00) * i_2505_) & 0xff0000)) >> 8;
								i_2496_ += anInt9340;
								i_2497_ += anInt9341;
							}
						}
						i_2493_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2507_ = anInt9356;
					while (i_2507_ < 0) {
						int i_2508_ = i_2507_ + i_2435_;
						if (i_2508_ >= 0) {
							if (i_2508_ >= is.length)
								break;
							int i_2509_ = anInt9339;
							int i_2510_ = anInt9346 + anInt9348;
							int i_2511_ = anInt9324 + anInt9349;
							int i_2512_ = anInt9347;
							int i_2513_;
							if ((i_2513_ = (i_2510_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2513_ = (anInt9340 - i_2513_) / anInt9340;
								i_2512_ += i_2513_;
								i_2510_ += anInt9340 * i_2513_;
								i_2511_ += anInt9341 * i_2513_;
								i_2509_ += i_2513_;
							}
							if ((i_2513_ = (i_2510_ - anInt9340) / anInt9340) > i_2512_)
								i_2512_ = i_2513_;
							if (i_2511_ < 0) {
								i_2513_ = (anInt9341 - 1 - i_2511_) / anInt9341;
								i_2512_ += i_2513_;
								i_2510_ += anInt9340 * i_2513_;
								i_2511_ += anInt9341 * i_2513_;
								i_2509_ += i_2513_;
							}
							if ((i_2513_ = (1 + i_2511_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2512_)
								i_2512_ = i_2513_;
							int i_2514_ = is[i_2508_] - i;
							int i_2515_ = -is_2434_[i_2508_];
							int i_2516_ = i_2514_ - (i_2509_ - anInt9339);
							if (i_2516_ > 0) {
								i_2509_ += i_2516_;
								i_2512_ += i_2516_;
								i_2510_ += anInt9340 * i_2516_;
								i_2511_ += anInt9341 * i_2516_;
							} else
								i_2515_ -= i_2516_;
							if (i_2512_ < i_2515_)
								i_2512_ = i_2515_;
							for (/**/; i_2512_ < 0; i_2512_++) {
								int i_2517_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2511_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2510_ >> 12))]);
								int i_2518_ = i_2517_ >>> 24;
								int i_2519_ = 256 - i_2518_;
								int i_2520_ = is_2436_[i_2509_];
								is_2436_[i_2509_++] = ((((i_2517_ & 0xff00ff) * i_2518_ + (i_2520_ & 0xff00ff) * i_2519_) & ~0xff00ff) + (((i_2517_ & 0xff00) * i_2518_ + (i_2520_ & 0xff00) * i_2519_) & 0xff0000)) >> 8;
								i_2510_ += anInt9340;
								i_2511_ += anInt9341;
							}
						}
						i_2507_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2521_ = anInt9356;
				while (i_2521_ < 0) {
					int i_2522_ = i_2521_ + i_2435_;
					if (i_2522_ >= 0) {
						if (i_2522_ >= is.length)
							break;
						int i_2523_ = anInt9339;
						int i_2524_ = anInt9346 + anInt9348;
						int i_2525_ = anInt9324;
						int i_2526_ = anInt9347;
						if (i_2525_ >= 0 && i_2525_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							if (i_2524_ < 0) {
								int i_2527_ = (anInt9340 - 1 - i_2524_) / anInt9340;
								i_2526_ += i_2527_;
								i_2524_ += anInt9340 * i_2527_;
								i_2523_ += i_2527_;
							}
							int i_2528_;
							if ((i_2528_ = (1 + i_2524_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2526_)
								i_2526_ = i_2528_;
							int i_2529_ = is[i_2522_] - i;
							int i_2530_ = -is_2434_[i_2522_];
							int i_2531_ = i_2529_ - (i_2523_ - anInt9339);
							if (i_2531_ > 0) {
								i_2523_ += i_2531_;
								i_2526_ += i_2531_;
								i_2524_ += anInt9340 * i_2531_;
								i_2525_ += anInt9341 * i_2531_;
							} else
								i_2530_ -= i_2531_;
							if (i_2526_ < i_2530_)
								i_2526_ = i_2530_;
							for (/**/; i_2526_ < 0; i_2526_++) {
								int i_2532_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2525_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2524_ >> 12))]);
								int i_2533_ = i_2532_ >>> 24;
								int i_2534_ = 256 - i_2533_;
								int i_2535_ = is_2436_[i_2523_];
								is_2436_[i_2523_++] = ((((i_2532_ & 0xff00ff) * i_2533_ + (i_2535_ & 0xff00ff) * i_2534_) & ~0xff00ff) + (((i_2532_ & 0xff00) * i_2533_ + (i_2535_ & 0xff00) * i_2534_) & 0xff0000)) >> 8;
								i_2524_ += anInt9340;
							}
						}
					}
					i_2521_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2536_ = anInt9356;
				while (i_2536_ < 0) {
					int i_2537_ = i_2536_ + i_2435_;
					if (i_2537_ >= 0) {
						if (i_2537_ >= is.length)
							break;
						int i_2538_ = anInt9339;
						int i_2539_ = anInt9346 + anInt9348;
						int i_2540_ = anInt9324 + anInt9349;
						int i_2541_ = anInt9347;
						if (i_2539_ < 0) {
							int i_2542_ = (anInt9340 - 1 - i_2539_) / anInt9340;
							i_2541_ += i_2542_;
							i_2539_ += anInt9340 * i_2542_;
							i_2540_ += anInt9341 * i_2542_;
							i_2538_ += i_2542_;
						}
						int i_2543_;
						if ((i_2543_ = (1 + i_2539_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2541_)
							i_2541_ = i_2543_;
						if ((i_2543_ = i_2540_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_2543_ = (anInt9341 - i_2543_) / anInt9341;
							i_2541_ += i_2543_;
							i_2539_ += anInt9340 * i_2543_;
							i_2540_ += anInt9341 * i_2543_;
							i_2538_ += i_2543_;
						}
						if ((i_2543_ = (i_2540_ - anInt9341) / anInt9341) > i_2541_)
							i_2541_ = i_2543_;
						int i_2544_ = is[i_2537_] - i;
						int i_2545_ = -is_2434_[i_2537_];
						int i_2546_ = i_2544_ - (i_2538_ - anInt9339);
						if (i_2546_ > 0) {
							i_2538_ += i_2546_;
							i_2541_ += i_2546_;
							i_2539_ += anInt9340 * i_2546_;
							i_2540_ += anInt9341 * i_2546_;
						} else
							i_2545_ -= i_2546_;
						if (i_2541_ < i_2545_)
							i_2541_ = i_2545_;
						for (/**/; i_2541_ < 0; i_2541_++) {
							int i_2547_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2540_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2539_ >> 12))]);
							int i_2548_ = i_2547_ >>> 24;
							int i_2549_ = 256 - i_2548_;
							int i_2550_ = is_2436_[i_2538_];
							is_2436_[i_2538_++] = ((((i_2547_ & 0xff00ff) * i_2548_ + (i_2550_ & 0xff00ff) * i_2549_) & ~0xff00ff) + (((i_2547_ & 0xff00) * i_2548_ + (i_2550_ & 0xff00) * i_2549_) & 0xff0000)) >> 8;
							i_2539_ += anInt9340;
							i_2540_ += anInt9341;
						}
					}
					i_2536_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2551_ = anInt9356;
				while (i_2551_ < 0) {
					int i_2552_ = i_2551_ + i_2435_;
					if (i_2552_ >= 0) {
						if (i_2552_ >= is.length)
							break;
						int i_2553_ = anInt9339;
						int i_2554_ = anInt9346 + anInt9348;
						int i_2555_ = anInt9324 + anInt9349;
						int i_2556_ = anInt9347;
						if (i_2554_ < 0) {
							int i_2557_ = (anInt9340 - 1 - i_2554_) / anInt9340;
							i_2556_ += i_2557_;
							i_2554_ += anInt9340 * i_2557_;
							i_2555_ += anInt9341 * i_2557_;
							i_2553_ += i_2557_;
						}
						int i_2558_;
						if ((i_2558_ = (1 + i_2554_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2556_)
							i_2556_ = i_2558_;
						if (i_2555_ < 0) {
							i_2558_ = (anInt9341 - 1 - i_2555_) / anInt9341;
							i_2556_ += i_2558_;
							i_2554_ += anInt9340 * i_2558_;
							i_2555_ += anInt9341 * i_2558_;
							i_2553_ += i_2558_;
						}
						if ((i_2558_ = (1 + i_2555_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2556_)
							i_2556_ = i_2558_;
						int i_2559_ = is[i_2552_] - i;
						int i_2560_ = -is_2434_[i_2552_];
						int i_2561_ = i_2559_ - (i_2553_ - anInt9339);
						if (i_2561_ > 0) {
							i_2553_ += i_2561_;
							i_2556_ += i_2561_;
							i_2554_ += anInt9340 * i_2561_;
							i_2555_ += anInt9341 * i_2561_;
						} else
							i_2560_ -= i_2561_;
						if (i_2556_ < i_2560_)
							i_2556_ = i_2560_;
						for (/**/; i_2556_ < 0; i_2556_++) {
							int i_2562_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2555_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2554_ >> 12))]);
							int i_2563_ = i_2562_ >>> 24;
							int i_2564_ = 256 - i_2563_;
							int i_2565_ = is_2436_[i_2553_];
							is_2436_[i_2553_++] = ((((i_2562_ & 0xff00ff) * i_2563_ + (i_2565_ & 0xff00ff) * i_2564_) & ~0xff00ff) + (((i_2562_ & 0xff00) * i_2563_ + (i_2565_ & 0xff00) * i_2564_) & 0xff0000)) >> 8;
							i_2554_ += anInt9340;
							i_2555_ += anInt9341;
						}
					}
					i_2551_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method754(boolean bool, boolean bool_2566_, boolean bool_2567_, int i, int i_2568_, float f, int i_2569_, int i_2570_, int i_2571_, int i_2572_, int i_2573_, int i_2574_, boolean bool_2575_) {
		if (i_2569_ > 0 && i_2570_ > 0 && (bool || bool_2566_)) {
			int i_2576_ = 0;
			int i_2577_ = 0;
			int i_2578_ = (((Class61_Sub3_Sub2) this).anInt9352 + ((Class61_Sub3_Sub2) this).anInt9358 + ((Class61_Sub3_Sub2) this).anInt9328);
			int i_2579_ = (((Class61_Sub3_Sub2) this).anInt9327 + ((Class61_Sub3_Sub2) this).anInt9325 + ((Class61_Sub3_Sub2) this).anInt9337);
			int i_2580_ = (i_2578_ << 16) / i_2569_;
			int i_2581_ = (i_2579_ << 16) / i_2570_;
			if (((Class61_Sub3_Sub2) this).anInt9352 > 0) {
				int i_2582_ = (((((Class61_Sub3_Sub2) this).anInt9352 << 16) + i_2580_ - 1) / i_2580_);
				i += i_2582_;
				i_2576_ += (i_2582_ * i_2580_ - (((Class61_Sub3_Sub2) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9327 > 0) {
				int i_2583_ = (((((Class61_Sub3_Sub2) this).anInt9327 << 16) + i_2581_ - 1) / i_2581_);
				i_2568_ += i_2583_;
				i_2577_ += (i_2583_ * i_2581_ - (((Class61_Sub3_Sub2) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub2) this).anInt9358 < i_2578_)
				i_2569_ = ((((Class61_Sub3_Sub2) this).anInt9358 << 16) - i_2576_ + i_2580_ - 1) / i_2580_;
			if (((Class61_Sub3_Sub2) this).anInt9325 < i_2579_)
				i_2570_ = ((((Class61_Sub3_Sub2) this).anInt9325 << 16) - i_2577_ + i_2581_ - 1) / i_2581_;
			int i_2584_ = i + i_2568_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2585_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_2569_);
			if (i_2568_ + i_2570_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_2570_ -= (i_2568_ + i_2570_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_2568_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2586_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2568_);
				i_2570_ -= i_2586_;
				i_2584_ += i_2586_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2577_ += i_2581_ * i_2586_;
			}
			if (i + i_2569_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2587_ = (i + i_2569_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_2569_ -= i_2587_;
				i_2585_ += i_2587_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2588_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_2569_ -= i_2588_;
				i_2584_ += i_2588_;
				i_2576_ += i_2580_ * i_2588_;
				i_2585_ += i_2588_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2573_ == 0) {
				if (i_2571_ == 1) {
					int i_2589_ = i_2576_;
					for (int i_2590_ = -i_2570_; i_2590_ < 0; i_2590_++) {
						int i_2591_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2592_ = -i_2569_; i_2592_ < 0; i_2592_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool)
									is[i_2584_] = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2591_]);
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2589_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 0) {
					int i_2593_ = (i_2572_ & 0xff0000) >> 16;
					int i_2594_ = (i_2572_ & 0xff00) >> 8;
					int i_2595_ = i_2572_ & 0xff;
					int i_2596_ = i_2576_;
					for (int i_2597_ = -i_2570_; i_2597_ < 0; i_2597_++) {
						int i_2598_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2599_ = -i_2569_; i_2599_ < 0; i_2599_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool) {
									int i_2600_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2598_]);
									int i_2601_ = ((i_2600_ & 0xff0000) * i_2593_ & ~0xffffff);
									int i_2602_ = ((i_2600_ & 0xff00) * i_2594_ & 0xff0000);
									int i_2603_ = (i_2600_ & 0xff) * i_2595_ & 0xff00;
									is[i_2584_] = (i_2601_ | i_2602_ | i_2603_) >>> 8;
								}
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2596_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 3) {
					int i_2604_ = i_2576_;
					for (int i_2605_ = -i_2570_; i_2605_ < 0; i_2605_++) {
						int i_2606_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2607_ = -i_2569_; i_2607_ < 0; i_2607_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool) {
									int i_2608_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2606_]);
									int i_2609_ = i_2608_ + i_2572_;
									int i_2610_ = ((i_2608_ & 0xff00ff) + (i_2572_ & 0xff00ff));
									int i_2611_ = ((i_2610_ & 0x1000100) + (i_2609_ - i_2610_ & 0x10000));
									is[i_2584_] = (i_2609_ - i_2611_ | i_2611_ - (i_2611_ >>> 8));
								}
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2604_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 2) {
					int i_2612_ = i_2572_ >>> 24;
					int i_2613_ = 256 - i_2612_;
					int i_2614_ = (i_2572_ & 0xff00ff) * i_2613_ & ~0xff00ff;
					int i_2615_ = (i_2572_ & 0xff00) * i_2613_ & 0xff0000;
					i_2572_ = (i_2614_ | i_2615_) >>> 8;
					int i_2616_ = i_2576_;
					for (int i_2617_ = -i_2570_; i_2617_ < 0; i_2617_++) {
						int i_2618_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2619_ = -i_2569_; i_2619_ < 0; i_2619_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool) {
									int i_2620_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2618_]);
									i_2614_ = ((i_2620_ & 0xff00ff) * i_2612_ & ~0xff00ff);
									i_2615_ = ((i_2620_ & 0xff00) * i_2612_ & 0xff0000);
									is[i_2584_] = (((i_2614_ | i_2615_) >>> 8) + i_2572_);
								}
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2616_;
						i_2584_ += i_2585_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2573_ == 1) {
				if (i_2571_ == 1) {
					int i_2621_ = i_2576_;
					for (int i_2622_ = -i_2570_; i_2622_ < 0; i_2622_++) {
						int i_2623_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2624_ = -i_2569_; i_2624_ < 0; i_2624_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool) {
									int i_2625_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2623_]);
									int i_2626_ = i_2625_ >>> 24;
									int i_2627_ = 256 - i_2626_;
									int i_2628_ = is[i_2584_];
									is[i_2584_] = (((((i_2625_ & 0xff00ff) * i_2626_ + (i_2628_ & 0xff00ff) * i_2627_) & ~0xff00ff) >> 8) + (((((i_2625_ & ~0xff00ff) >>> 8) * i_2626_) + (((i_2628_ & ~0xff00ff) >>> 8) * i_2627_)) & ~0xff00ff));
								}
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2621_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 0) {
					int i_2629_ = i_2576_;
					if ((i_2572_ & 0xffffff) == 16777215) {
						for (int i_2630_ = -i_2570_; i_2630_ < 0; i_2630_++) {
							int i_2631_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_2632_ = -i_2569_; i_2632_ < 0; i_2632_++) {
								if (!bool_2566_ || f < fs[i_2584_]) {
									if (bool) {
										int i_2633_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2631_]);
										int i_2634_ = ((i_2633_ >>> 24) * (i_2572_ >>> 24) >> 8);
										int i_2635_ = 256 - i_2634_;
										int i_2636_ = is[i_2584_];
										is[i_2584_] = ((((i_2633_ & 0xff00ff) * i_2634_ + ((i_2636_ & 0xff00ff) * i_2635_)) & ~0xff00ff) + (((i_2633_ & 0xff00) * i_2634_ + ((i_2636_ & 0xff00) * i_2635_)) & 0xff0000)) >> 8;
									}
									if (bool_2566_ && bool_2575_)
										fs[i_2584_] = f;
								}
								i_2576_ += i_2580_;
								i_2584_++;
							}
							i_2577_ += i_2581_;
							i_2576_ = i_2629_;
							i_2584_ += i_2585_;
						}
					} else {
						int i_2637_ = (i_2572_ & 0xff0000) >> 16;
						int i_2638_ = (i_2572_ & 0xff00) >> 8;
						int i_2639_ = i_2572_ & 0xff;
						for (int i_2640_ = -i_2570_; i_2640_ < 0; i_2640_++) {
							int i_2641_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
							for (int i_2642_ = -i_2569_; i_2642_ < 0; i_2642_++) {
								if (!bool_2566_ || f < fs[i_2584_]) {
									int i_2643_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2641_]);
									int i_2644_ = ((i_2643_ >>> 24) * (i_2572_ >>> 24) >> 8);
									int i_2645_ = 256 - i_2644_;
									if (i_2644_ != 255) {
										if (bool) {
											int i_2646_ = (((i_2643_ & 0xff0000) * i_2637_) & ~0xffffff);
											int i_2647_ = ((i_2643_ & 0xff00) * i_2638_ & 0xff0000);
											int i_2648_ = ((i_2643_ & 0xff) * i_2639_ & 0xff00);
											i_2643_ = (i_2646_ | i_2647_ | i_2648_) >>> 8;
											int i_2649_ = is[i_2584_];
											is[i_2584_] = (((((i_2643_ & 0xff00ff) * i_2644_) + ((i_2649_ & 0xff00ff) * i_2645_)) & ~0xff00ff) + ((((i_2643_ & 0xff00) * i_2644_) + ((i_2649_ & 0xff00) * i_2645_)) & 0xff0000)) >> 8;
											if (bool_2567_) {
												int i_2650_ = ((i_2649_ >>> 24) + i_2644_);
												if (i_2650_ > 255)
													i_2650_ = 255;
												is[i_2584_] |= i_2650_ << 24;
											}
										}
										if (bool_2566_ && bool_2575_)
											fs[i_2584_] = f;
									} else {
										if (bool) {
											int i_2651_ = (((i_2643_ & 0xff0000) * i_2637_) & ~0xffffff);
											int i_2652_ = ((i_2643_ & 0xff00) * i_2638_ & 0xff0000);
											int i_2653_ = ((i_2643_ & 0xff) * i_2639_ & 0xff00);
											is[i_2584_] = (i_2651_ | i_2652_ | i_2653_) >>> 8;
										}
										if (bool_2566_ && bool_2575_)
											fs[i_2584_] = f;
									}
								}
								i_2576_ += i_2580_;
								i_2584_++;
							}
							i_2577_ += i_2581_;
							i_2576_ = i_2629_;
							i_2584_ += i_2585_;
						}
					}
				} else if (i_2571_ == 3) {
					int i_2654_ = i_2576_;
					for (int i_2655_ = -i_2570_; i_2655_ < 0; i_2655_++) {
						int i_2656_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2657_ = -i_2569_; i_2657_ < 0; i_2657_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool) {
									int i_2658_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2656_]);
									int i_2659_ = i_2658_ + i_2572_;
									int i_2660_ = ((i_2658_ & 0xff00ff) + (i_2572_ & 0xff00ff));
									int i_2661_ = ((i_2660_ & 0x1000100) + (i_2659_ - i_2660_ & 0x10000));
									i_2661_ = (i_2659_ - i_2661_ | i_2661_ - (i_2661_ >>> 8));
									int i_2662_ = ((i_2661_ >>> 24) * (i_2572_ >>> 24) >> 8);
									int i_2663_ = 256 - i_2662_;
									if (i_2662_ != 255) {
										i_2658_ = i_2661_;
										i_2661_ = is[i_2584_];
										i_2661_ = ((((i_2658_ & 0xff00ff) * i_2662_ + ((i_2661_ & 0xff00ff) * i_2663_)) & ~0xff00ff) + (((i_2658_ & 0xff00) * i_2662_ + ((i_2661_ & 0xff00) * i_2663_)) & 0xff0000)) >> 8;
									}
									is[i_2584_] = i_2661_;
								}
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2654_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 2) {
					int i_2664_ = i_2572_ >>> 24;
					int i_2665_ = 256 - i_2664_;
					int i_2666_ = (i_2572_ & 0xff00ff) * i_2665_ & ~0xff00ff;
					int i_2667_ = (i_2572_ & 0xff00) * i_2665_ & 0xff0000;
					i_2572_ = (i_2666_ | i_2667_) >>> 8;
					int i_2668_ = i_2576_;
					for (int i_2669_ = -i_2570_; i_2669_ < 0; i_2669_++) {
						int i_2670_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2671_ = -i_2569_; i_2671_ < 0; i_2671_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool) {
									int i_2672_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2670_]);
									int i_2673_ = i_2672_ >>> 24;
									int i_2674_ = 256 - i_2673_;
									i_2666_ = ((i_2672_ & 0xff00ff) * i_2664_ & ~0xff00ff);
									i_2667_ = ((i_2672_ & 0xff00) * i_2664_ & 0xff0000);
									i_2672_ = (((i_2666_ | i_2667_) >>> 8) + i_2572_);
									int i_2675_ = is[i_2584_];
									is[i_2584_] = ((((i_2672_ & 0xff00ff) * i_2673_ + (i_2675_ & 0xff00ff) * i_2674_) & ~0xff00ff) + (((i_2672_ & 0xff00) * i_2673_ + (i_2675_ & 0xff00) * i_2674_) & 0xff0000)) >> 8;
								}
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2668_;
						i_2584_ += i_2585_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2573_ == 2) {
				if (i_2571_ == 1) {
					int i_2676_ = i_2576_;
					for (int i_2677_ = -i_2570_; i_2677_ < 0; i_2677_++) {
						int i_2678_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2679_ = -i_2569_; i_2679_ < 0; i_2679_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								int i_2680_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2678_]);
								if (i_2680_ != 0) {
									if (bool) {
										int i_2681_ = is[i_2584_];
										int i_2682_ = i_2680_ + i_2681_;
										int i_2683_ = ((i_2680_ & 0xff00ff) + (i_2681_ & 0xff00ff));
										i_2681_ = ((i_2683_ & 0x1000100) + (i_2682_ - i_2683_ & 0x10000));
										is[i_2584_] = (i_2682_ - i_2681_ | i_2681_ - (i_2681_ >>> 8));
									}
									if (bool_2566_ && bool_2575_)
										fs[i_2584_] = f;
								}
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2676_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 0) {
					int i_2684_ = i_2576_;
					int i_2685_ = (i_2572_ & 0xff0000) >> 16;
					int i_2686_ = (i_2572_ & 0xff00) >> 8;
					int i_2687_ = i_2572_ & 0xff;
					for (int i_2688_ = -i_2570_; i_2688_ < 0; i_2688_++) {
						int i_2689_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2690_ = -i_2569_; i_2690_ < 0; i_2690_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								int i_2691_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2689_]);
								if (i_2691_ != 0) {
									if (bool) {
										int i_2692_ = ((i_2691_ & 0xff0000) * i_2685_ & ~0xffffff);
										int i_2693_ = ((i_2691_ & 0xff00) * i_2686_ & 0xff0000);
										int i_2694_ = ((i_2691_ & 0xff) * i_2687_ & 0xff00);
										i_2691_ = (i_2692_ | i_2693_ | i_2694_) >>> 8;
										int i_2695_ = is[i_2584_];
										int i_2696_ = i_2691_ + i_2695_;
										int i_2697_ = ((i_2691_ & 0xff00ff) + (i_2695_ & 0xff00ff));
										i_2695_ = ((i_2697_ & 0x1000100) + (i_2696_ - i_2697_ & 0x10000));
										is[i_2584_] = (i_2696_ - i_2695_ | i_2695_ - (i_2695_ >>> 8));
									}
									if (bool_2566_ && bool_2575_)
										fs[i_2584_] = f;
								}
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2684_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 3) {
					int i_2698_ = i_2576_;
					for (int i_2699_ = -i_2570_; i_2699_ < 0; i_2699_++) {
						int i_2700_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2701_ = -i_2569_; i_2701_ < 0; i_2701_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								if (bool) {
									int i_2702_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2700_]);
									int i_2703_ = i_2702_ + i_2572_;
									int i_2704_ = ((i_2702_ & 0xff00ff) + (i_2572_ & 0xff00ff));
									int i_2705_ = ((i_2704_ & 0x1000100) + (i_2703_ - i_2704_ & 0x10000));
									i_2702_ = (i_2703_ - i_2705_ | i_2705_ - (i_2705_ >>> 8));
									i_2705_ = is[i_2584_];
									i_2703_ = i_2702_ + i_2705_;
									i_2704_ = (i_2702_ & 0xff00ff) + (i_2705_ & 0xff00ff);
									i_2705_ = ((i_2704_ & 0x1000100) + (i_2703_ - i_2704_ & 0x10000));
									is[i_2584_] = (i_2703_ - i_2705_ | i_2705_ - (i_2705_ >>> 8));
								}
								if (bool_2566_ && bool_2575_)
									fs[i_2584_] = f;
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2698_;
						i_2584_ += i_2585_;
					}
				} else if (i_2571_ == 2) {
					int i_2706_ = i_2572_ >>> 24;
					int i_2707_ = 256 - i_2706_;
					int i_2708_ = (i_2572_ & 0xff00ff) * i_2707_ & ~0xff00ff;
					int i_2709_ = (i_2572_ & 0xff00) * i_2707_ & 0xff0000;
					i_2572_ = (i_2708_ | i_2709_) >>> 8;
					int i_2710_ = i_2576_;
					for (int i_2711_ = -i_2570_; i_2711_ < 0; i_2711_++) {
						int i_2712_ = ((i_2577_ >> 16) * ((Class61_Sub3_Sub2) this).anInt9358);
						for (int i_2713_ = -i_2569_; i_2713_ < 0; i_2713_++) {
							if (!bool_2566_ || f < fs[i_2584_]) {
								int i_2714_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(i_2576_ >> 16) + i_2712_]);
								if (i_2714_ != 0) {
									if (bool) {
										i_2708_ = ((i_2714_ & 0xff00ff) * i_2706_ & ~0xff00ff);
										i_2709_ = ((i_2714_ & 0xff00) * i_2706_ & 0xff0000);
										i_2714_ = (((i_2708_ | i_2709_) >>> 8) + i_2572_);
										int i_2715_ = is[i_2584_];
										int i_2716_ = i_2714_ + i_2715_;
										int i_2717_ = ((i_2714_ & 0xff00ff) + (i_2715_ & 0xff00ff));
										i_2715_ = ((i_2717_ & 0x1000100) + (i_2716_ - i_2717_ & 0x10000));
										is[i_2584_] = (i_2716_ - i_2715_ | i_2715_ - (i_2715_ >>> 8));
									}
									if (bool_2566_ && bool_2575_)
										fs[i_2584_] = f;
								}
							}
							i_2576_ += i_2580_;
							i_2584_++;
						}
						i_2577_ += i_2581_;
						i_2576_ = i_2710_;
						i_2584_ += i_2585_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method722(int i, int i_2718_, int i_2719_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is == null)
			throw new IllegalStateException("");
		if (i_2719_ == 0) {
			for (int i_2720_ = 0; i_2720_ < ((Class61_Sub3_Sub2) this).anInt9325; i_2720_++) {
				int i_2721_ = i_2720_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_2722_ = (((i_2718_ + i_2720_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_2723_ = 0; i_2723_ < ((Class61_Sub3_Sub2) this).anInt9358; i_2723_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_2721_ + i_2723_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_2721_ + i_2723_]) & 0xffffff | is[i_2722_ + i_2723_] << 8 & ~0xffffff);
			}
		} else if (i_2719_ == 1) {
			for (int i_2724_ = 0; i_2724_ < ((Class61_Sub3_Sub2) this).anInt9325; i_2724_++) {
				int i_2725_ = i_2724_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_2726_ = (((i_2718_ + i_2724_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_2727_ = 0; i_2727_ < ((Class61_Sub3_Sub2) this).anInt9358; i_2727_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_2725_ + i_2727_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_2725_ + i_2727_]) & 0xffffff | is[i_2726_ + i_2727_] << 16 & ~0xffffff);
			}
		} else if (i_2719_ == 2) {
			for (int i_2728_ = 0; i_2728_ < ((Class61_Sub3_Sub2) this).anInt9325; i_2728_++) {
				int i_2729_ = i_2728_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_2730_ = (((i_2718_ + i_2728_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_2731_ = 0; i_2731_ < ((Class61_Sub3_Sub2) this).anInt9358; i_2731_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_2729_ + i_2731_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_2729_ + i_2731_]) & 0xffffff | is[i_2730_ + i_2731_] << 24 & ~0xffffff);
			}
		} else if (i_2719_ == 3) {
			for (int i_2732_ = 0; i_2732_ < ((Class61_Sub3_Sub2) this).anInt9325; i_2732_++) {
				int i_2733_ = i_2732_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_2734_ = (((i_2718_ + i_2732_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_2735_ = 0; i_2735_ < ((Class61_Sub3_Sub2) this).anInt9358; i_2735_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_2733_ + i_2735_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_2733_ + i_2735_]) & 0xffffff | (is[i_2734_ + i_2735_] != 0 ? -16777216 : 0));
			}
		}
	}

	public void method737(int i, int i_2736_, int i_2737_, int i_2738_, int i_2739_, int i_2740_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_2741_ = 0; i_2741_ < i_2738_; i_2741_++) {
			int i_2742_ = (i_2736_ + i_2741_) * i_2737_ + i;
			int i_2743_ = (i_2740_ + i_2741_) * i_2737_ + i_2739_;
			for (int i_2744_ = 0; i_2744_ < i_2737_; i_2744_++)
				((Class61_Sub3_Sub2) this).anIntArray10094[i_2742_ + i_2744_] = is[i_2743_ + i_2744_] & 0xffffff;
		}
	}

	void method752(int[] is, int[] is_2745_, int i, int i_2746_) {
		int[] is_2747_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2747_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2748_ = anInt9356;
					while (i_2748_ < 0) {
						int i_2749_ = i_2748_ + i_2746_;
						if (i_2749_ >= 0) {
							if (i_2749_ >= is.length)
								break;
							int i_2750_ = anInt9339;
							int i_2751_ = anInt9346;
							int i_2752_ = anInt9324;
							int i_2753_ = anInt9347;
							if (i_2751_ >= 0 && i_2752_ >= 0 && (i_2751_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0 && (i_2752_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2754_ = is[i_2749_] - i;
								int i_2755_ = -is_2745_[i_2749_];
								int i_2756_ = i_2754_ - (i_2750_ - anInt9339);
								if (i_2756_ > 0) {
									i_2750_ += i_2756_;
									i_2753_ += i_2756_;
									i_2751_ += anInt9340 * i_2756_;
									i_2752_ += anInt9341 * i_2756_;
								} else
									i_2755_ -= i_2756_;
								if (i_2753_ < i_2755_)
									i_2753_ = i_2755_;
								for (/**/; i_2753_ < 0; i_2753_++) {
									int i_2757_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2752_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2751_ >> 12))]);
									int i_2758_ = i_2757_ >>> 24;
									int i_2759_ = 256 - i_2758_;
									int i_2760_ = is_2747_[i_2750_];
									is_2747_[i_2750_++] = ((((i_2757_ & 0xff00ff) * i_2758_ + (i_2760_ & 0xff00ff) * i_2759_) & ~0xff00ff) + (((i_2757_ & 0xff00) * i_2758_ + (i_2760_ & 0xff00) * i_2759_) & 0xff0000)) >> 8;
								}
							}
						}
						i_2748_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2761_ = anInt9356;
					while (i_2761_ < 0) {
						int i_2762_ = i_2761_ + i_2746_;
						if (i_2762_ >= 0) {
							if (i_2762_ >= is.length)
								break;
							int i_2763_ = anInt9339;
							int i_2764_ = anInt9346;
							int i_2765_ = anInt9324 + anInt9349;
							int i_2766_ = anInt9347;
							if (i_2764_ >= 0 && (i_2764_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								int i_2767_;
								if ((i_2767_ = (i_2765_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
									i_2767_ = (anInt9341 - i_2767_) / anInt9341;
									i_2766_ += i_2767_;
									i_2765_ += anInt9341 * i_2767_;
									i_2763_ += i_2767_;
								}
								if ((i_2767_ = (i_2765_ - anInt9341) / anInt9341) > i_2766_)
									i_2766_ = i_2767_;
								int i_2768_ = is[i_2762_] - i;
								int i_2769_ = -is_2745_[i_2762_];
								int i_2770_ = i_2768_ - (i_2763_ - anInt9339);
								if (i_2770_ > 0) {
									i_2763_ += i_2770_;
									i_2766_ += i_2770_;
									i_2764_ += anInt9340 * i_2770_;
									i_2765_ += anInt9341 * i_2770_;
								} else
									i_2769_ -= i_2770_;
								if (i_2766_ < i_2769_)
									i_2766_ = i_2769_;
								for (/**/; i_2766_ < 0; i_2766_++) {
									int i_2771_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2765_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2764_ >> 12))]);
									int i_2772_ = i_2771_ >>> 24;
									int i_2773_ = 256 - i_2772_;
									int i_2774_ = is_2747_[i_2763_];
									is_2747_[i_2763_++] = ((((i_2771_ & 0xff00ff) * i_2772_ + (i_2774_ & 0xff00ff) * i_2773_) & ~0xff00ff) + (((i_2771_ & 0xff00) * i_2772_ + (i_2774_ & 0xff00) * i_2773_) & 0xff0000)) >> 8;
									i_2765_ += anInt9341;
								}
							}
						}
						i_2761_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2775_ = anInt9356;
					while (i_2775_ < 0) {
						int i_2776_ = i_2775_ + i_2746_;
						if (i_2776_ >= 0) {
							if (i_2776_ >= is.length)
								break;
							int i_2777_ = anInt9339;
							int i_2778_ = anInt9346;
							int i_2779_ = anInt9324 + anInt9349;
							int i_2780_ = anInt9347;
							if (i_2778_ >= 0 && (i_2778_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								if (i_2779_ < 0) {
									int i_2781_ = ((anInt9341 - 1 - i_2779_) / anInt9341);
									i_2780_ += i_2781_;
									i_2779_ += anInt9341 * i_2781_;
									i_2777_ += i_2781_;
								}
								int i_2782_;
								if ((i_2782_ = (1 + i_2779_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2780_)
									i_2780_ = i_2782_;
								int i_2783_ = is[i_2776_] - i;
								int i_2784_ = -is_2745_[i_2776_];
								int i_2785_ = i_2783_ - (i_2777_ - anInt9339);
								if (i_2785_ > 0) {
									i_2777_ += i_2785_;
									i_2780_ += i_2785_;
									i_2778_ += anInt9340 * i_2785_;
									i_2779_ += anInt9341 * i_2785_;
								} else
									i_2784_ -= i_2785_;
								if (i_2780_ < i_2784_)
									i_2780_ = i_2784_;
								for (/**/; i_2780_ < 0; i_2780_++) {
									int i_2786_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2779_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2778_ >> 12))]);
									int i_2787_ = i_2786_ >>> 24;
									int i_2788_ = 256 - i_2787_;
									int i_2789_ = is_2747_[i_2777_];
									is_2747_[i_2777_++] = ((((i_2786_ & 0xff00ff) * i_2787_ + (i_2789_ & 0xff00ff) * i_2788_) & ~0xff00ff) + (((i_2786_ & 0xff00) * i_2787_ + (i_2789_ & 0xff00) * i_2788_) & 0xff0000)) >> 8;
									i_2779_ += anInt9341;
								}
							}
						}
						i_2775_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2790_ = anInt9356;
					while (i_2790_ < 0) {
						int i_2791_ = i_2790_ + i_2746_;
						if (i_2791_ >= 0) {
							if (i_2791_ >= is.length)
								break;
							int i_2792_ = anInt9339;
							int i_2793_ = anInt9346 + anInt9348;
							int i_2794_ = anInt9324;
							int i_2795_ = anInt9347;
							if (i_2794_ >= 0 && (i_2794_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2796_;
								if ((i_2796_ = (i_2793_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
									i_2796_ = (anInt9340 - i_2796_) / anInt9340;
									i_2795_ += i_2796_;
									i_2793_ += anInt9340 * i_2796_;
									i_2792_ += i_2796_;
								}
								if ((i_2796_ = (i_2793_ - anInt9340) / anInt9340) > i_2795_)
									i_2795_ = i_2796_;
								int i_2797_ = is[i_2791_] - i;
								int i_2798_ = -is_2745_[i_2791_];
								int i_2799_ = i_2797_ - (i_2792_ - anInt9339);
								if (i_2799_ > 0) {
									i_2792_ += i_2799_;
									i_2795_ += i_2799_;
									i_2793_ += anInt9340 * i_2799_;
									i_2794_ += anInt9341 * i_2799_;
								} else
									i_2798_ -= i_2799_;
								if (i_2795_ < i_2798_)
									i_2795_ = i_2798_;
								for (/**/; i_2795_ < 0; i_2795_++) {
									int i_2800_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2794_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2793_ >> 12))]);
									int i_2801_ = i_2800_ >>> 24;
									int i_2802_ = 256 - i_2801_;
									int i_2803_ = is_2747_[i_2792_];
									is_2747_[i_2792_++] = ((((i_2800_ & 0xff00ff) * i_2801_ + (i_2803_ & 0xff00ff) * i_2802_) & ~0xff00ff) + (((i_2800_ & 0xff00) * i_2801_ + (i_2803_ & 0xff00) * i_2802_) & 0xff0000)) >> 8;
									i_2793_ += anInt9340;
								}
							}
						}
						i_2790_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2804_ = anInt9356;
					while (i_2804_ < 0) {
						int i_2805_ = i_2804_ + i_2746_;
						if (i_2805_ >= 0) {
							if (i_2805_ >= is.length)
								break;
							int i_2806_ = anInt9339;
							int i_2807_ = anInt9346 + anInt9348;
							int i_2808_ = anInt9324 + anInt9349;
							int i_2809_ = anInt9347;
							int i_2810_;
							if ((i_2810_ = (i_2807_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2810_ = (anInt9340 - i_2810_) / anInt9340;
								i_2809_ += i_2810_;
								i_2807_ += anInt9340 * i_2810_;
								i_2808_ += anInt9341 * i_2810_;
								i_2806_ += i_2810_;
							}
							if ((i_2810_ = (i_2807_ - anInt9340) / anInt9340) > i_2809_)
								i_2809_ = i_2810_;
							if ((i_2810_ = (i_2808_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
								i_2810_ = (anInt9341 - i_2810_) / anInt9341;
								i_2809_ += i_2810_;
								i_2807_ += anInt9340 * i_2810_;
								i_2808_ += anInt9341 * i_2810_;
								i_2806_ += i_2810_;
							}
							if ((i_2810_ = (i_2808_ - anInt9341) / anInt9341) > i_2809_)
								i_2809_ = i_2810_;
							int i_2811_ = is[i_2805_] - i;
							int i_2812_ = -is_2745_[i_2805_];
							int i_2813_ = i_2811_ - (i_2806_ - anInt9339);
							if (i_2813_ > 0) {
								i_2806_ += i_2813_;
								i_2809_ += i_2813_;
								i_2807_ += anInt9340 * i_2813_;
								i_2808_ += anInt9341 * i_2813_;
							} else
								i_2812_ -= i_2813_;
							if (i_2809_ < i_2812_)
								i_2809_ = i_2812_;
							for (/**/; i_2809_ < 0; i_2809_++) {
								int i_2814_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2808_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2807_ >> 12))]);
								int i_2815_ = i_2814_ >>> 24;
								int i_2816_ = 256 - i_2815_;
								int i_2817_ = is_2747_[i_2806_];
								is_2747_[i_2806_++] = ((((i_2814_ & 0xff00ff) * i_2815_ + (i_2817_ & 0xff00ff) * i_2816_) & ~0xff00ff) + (((i_2814_ & 0xff00) * i_2815_ + (i_2817_ & 0xff00) * i_2816_) & 0xff0000)) >> 8;
								i_2807_ += anInt9340;
								i_2808_ += anInt9341;
							}
						}
						i_2804_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2818_ = anInt9356;
					while (i_2818_ < 0) {
						int i_2819_ = i_2818_ + i_2746_;
						if (i_2819_ >= 0) {
							if (i_2819_ >= is.length)
								break;
							int i_2820_ = anInt9339;
							int i_2821_ = anInt9346 + anInt9348;
							int i_2822_ = anInt9324 + anInt9349;
							int i_2823_ = anInt9347;
							int i_2824_;
							if ((i_2824_ = (i_2821_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2824_ = (anInt9340 - i_2824_) / anInt9340;
								i_2823_ += i_2824_;
								i_2821_ += anInt9340 * i_2824_;
								i_2822_ += anInt9341 * i_2824_;
								i_2820_ += i_2824_;
							}
							if ((i_2824_ = (i_2821_ - anInt9340) / anInt9340) > i_2823_)
								i_2823_ = i_2824_;
							if (i_2822_ < 0) {
								i_2824_ = (anInt9341 - 1 - i_2822_) / anInt9341;
								i_2823_ += i_2824_;
								i_2821_ += anInt9340 * i_2824_;
								i_2822_ += anInt9341 * i_2824_;
								i_2820_ += i_2824_;
							}
							if ((i_2824_ = (1 + i_2822_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2823_)
								i_2823_ = i_2824_;
							int i_2825_ = is[i_2819_] - i;
							int i_2826_ = -is_2745_[i_2819_];
							int i_2827_ = i_2825_ - (i_2820_ - anInt9339);
							if (i_2827_ > 0) {
								i_2820_ += i_2827_;
								i_2823_ += i_2827_;
								i_2821_ += anInt9340 * i_2827_;
								i_2822_ += anInt9341 * i_2827_;
							} else
								i_2826_ -= i_2827_;
							if (i_2823_ < i_2826_)
								i_2823_ = i_2826_;
							for (/**/; i_2823_ < 0; i_2823_++) {
								int i_2828_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2822_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2821_ >> 12))]);
								int i_2829_ = i_2828_ >>> 24;
								int i_2830_ = 256 - i_2829_;
								int i_2831_ = is_2747_[i_2820_];
								is_2747_[i_2820_++] = ((((i_2828_ & 0xff00ff) * i_2829_ + (i_2831_ & 0xff00ff) * i_2830_) & ~0xff00ff) + (((i_2828_ & 0xff00) * i_2829_ + (i_2831_ & 0xff00) * i_2830_) & 0xff0000)) >> 8;
								i_2821_ += anInt9340;
								i_2822_ += anInt9341;
							}
						}
						i_2818_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2832_ = anInt9356;
				while (i_2832_ < 0) {
					int i_2833_ = i_2832_ + i_2746_;
					if (i_2833_ >= 0) {
						if (i_2833_ >= is.length)
							break;
						int i_2834_ = anInt9339;
						int i_2835_ = anInt9346 + anInt9348;
						int i_2836_ = anInt9324;
						int i_2837_ = anInt9347;
						if (i_2836_ >= 0 && i_2836_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							if (i_2835_ < 0) {
								int i_2838_ = (anInt9340 - 1 - i_2835_) / anInt9340;
								i_2837_ += i_2838_;
								i_2835_ += anInt9340 * i_2838_;
								i_2834_ += i_2838_;
							}
							int i_2839_;
							if ((i_2839_ = (1 + i_2835_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2837_)
								i_2837_ = i_2839_;
							int i_2840_ = is[i_2833_] - i;
							int i_2841_ = -is_2745_[i_2833_];
							int i_2842_ = i_2840_ - (i_2834_ - anInt9339);
							if (i_2842_ > 0) {
								i_2834_ += i_2842_;
								i_2837_ += i_2842_;
								i_2835_ += anInt9340 * i_2842_;
								i_2836_ += anInt9341 * i_2842_;
							} else
								i_2841_ -= i_2842_;
							if (i_2837_ < i_2841_)
								i_2837_ = i_2841_;
							for (/**/; i_2837_ < 0; i_2837_++) {
								int i_2843_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2836_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2835_ >> 12))]);
								int i_2844_ = i_2843_ >>> 24;
								int i_2845_ = 256 - i_2844_;
								int i_2846_ = is_2747_[i_2834_];
								is_2747_[i_2834_++] = ((((i_2843_ & 0xff00ff) * i_2844_ + (i_2846_ & 0xff00ff) * i_2845_) & ~0xff00ff) + (((i_2843_ & 0xff00) * i_2844_ + (i_2846_ & 0xff00) * i_2845_) & 0xff0000)) >> 8;
								i_2835_ += anInt9340;
							}
						}
					}
					i_2832_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2847_ = anInt9356;
				while (i_2847_ < 0) {
					int i_2848_ = i_2847_ + i_2746_;
					if (i_2848_ >= 0) {
						if (i_2848_ >= is.length)
							break;
						int i_2849_ = anInt9339;
						int i_2850_ = anInt9346 + anInt9348;
						int i_2851_ = anInt9324 + anInt9349;
						int i_2852_ = anInt9347;
						if (i_2850_ < 0) {
							int i_2853_ = (anInt9340 - 1 - i_2850_) / anInt9340;
							i_2852_ += i_2853_;
							i_2850_ += anInt9340 * i_2853_;
							i_2851_ += anInt9341 * i_2853_;
							i_2849_ += i_2853_;
						}
						int i_2854_;
						if ((i_2854_ = (1 + i_2850_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2852_)
							i_2852_ = i_2854_;
						if ((i_2854_ = i_2851_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_2854_ = (anInt9341 - i_2854_) / anInt9341;
							i_2852_ += i_2854_;
							i_2850_ += anInt9340 * i_2854_;
							i_2851_ += anInt9341 * i_2854_;
							i_2849_ += i_2854_;
						}
						if ((i_2854_ = (i_2851_ - anInt9341) / anInt9341) > i_2852_)
							i_2852_ = i_2854_;
						int i_2855_ = is[i_2848_] - i;
						int i_2856_ = -is_2745_[i_2848_];
						int i_2857_ = i_2855_ - (i_2849_ - anInt9339);
						if (i_2857_ > 0) {
							i_2849_ += i_2857_;
							i_2852_ += i_2857_;
							i_2850_ += anInt9340 * i_2857_;
							i_2851_ += anInt9341 * i_2857_;
						} else
							i_2856_ -= i_2857_;
						if (i_2852_ < i_2856_)
							i_2852_ = i_2856_;
						for (/**/; i_2852_ < 0; i_2852_++) {
							int i_2858_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2851_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2850_ >> 12))]);
							int i_2859_ = i_2858_ >>> 24;
							int i_2860_ = 256 - i_2859_;
							int i_2861_ = is_2747_[i_2849_];
							is_2747_[i_2849_++] = ((((i_2858_ & 0xff00ff) * i_2859_ + (i_2861_ & 0xff00ff) * i_2860_) & ~0xff00ff) + (((i_2858_ & 0xff00) * i_2859_ + (i_2861_ & 0xff00) * i_2860_) & 0xff0000)) >> 8;
							i_2850_ += anInt9340;
							i_2851_ += anInt9341;
						}
					}
					i_2847_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2862_ = anInt9356;
				while (i_2862_ < 0) {
					int i_2863_ = i_2862_ + i_2746_;
					if (i_2863_ >= 0) {
						if (i_2863_ >= is.length)
							break;
						int i_2864_ = anInt9339;
						int i_2865_ = anInt9346 + anInt9348;
						int i_2866_ = anInt9324 + anInt9349;
						int i_2867_ = anInt9347;
						if (i_2865_ < 0) {
							int i_2868_ = (anInt9340 - 1 - i_2865_) / anInt9340;
							i_2867_ += i_2868_;
							i_2865_ += anInt9340 * i_2868_;
							i_2866_ += anInt9341 * i_2868_;
							i_2864_ += i_2868_;
						}
						int i_2869_;
						if ((i_2869_ = (1 + i_2865_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2867_)
							i_2867_ = i_2869_;
						if (i_2866_ < 0) {
							i_2869_ = (anInt9341 - 1 - i_2866_) / anInt9341;
							i_2867_ += i_2869_;
							i_2865_ += anInt9340 * i_2869_;
							i_2866_ += anInt9341 * i_2869_;
							i_2864_ += i_2869_;
						}
						if ((i_2869_ = (1 + i_2866_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2867_)
							i_2867_ = i_2869_;
						int i_2870_ = is[i_2863_] - i;
						int i_2871_ = -is_2745_[i_2863_];
						int i_2872_ = i_2870_ - (i_2864_ - anInt9339);
						if (i_2872_ > 0) {
							i_2864_ += i_2872_;
							i_2867_ += i_2872_;
							i_2865_ += anInt9340 * i_2872_;
							i_2866_ += anInt9341 * i_2872_;
						} else
							i_2871_ -= i_2872_;
						if (i_2867_ < i_2871_)
							i_2867_ = i_2871_;
						for (/**/; i_2867_ < 0; i_2867_++) {
							int i_2873_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2866_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2865_ >> 12))]);
							int i_2874_ = i_2873_ >>> 24;
							int i_2875_ = 256 - i_2874_;
							int i_2876_ = is_2747_[i_2864_];
							is_2747_[i_2864_++] = ((((i_2873_ & 0xff00ff) * i_2874_ + (i_2876_ & 0xff00ff) * i_2875_) & ~0xff00ff) + (((i_2873_ & 0xff00) * i_2874_ + (i_2876_ & 0xff00) * i_2875_) & 0xff0000)) >> 8;
							i_2865_ += anInt9340;
							i_2866_ += anInt9341;
						}
					}
					i_2862_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method751(int[] is, int[] is_2877_, int i, int i_2878_) {
		int[] is_2879_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2879_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2880_ = anInt9356;
					while (i_2880_ < 0) {
						int i_2881_ = i_2880_ + i_2878_;
						if (i_2881_ >= 0) {
							if (i_2881_ >= is.length)
								break;
							int i_2882_ = anInt9339;
							int i_2883_ = anInt9346;
							int i_2884_ = anInt9324;
							int i_2885_ = anInt9347;
							if (i_2883_ >= 0 && i_2884_ >= 0 && (i_2883_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0 && (i_2884_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2886_ = is[i_2881_] - i;
								int i_2887_ = -is_2877_[i_2881_];
								int i_2888_ = i_2886_ - (i_2882_ - anInt9339);
								if (i_2888_ > 0) {
									i_2882_ += i_2888_;
									i_2885_ += i_2888_;
									i_2883_ += anInt9340 * i_2888_;
									i_2884_ += anInt9341 * i_2888_;
								} else
									i_2887_ -= i_2888_;
								if (i_2885_ < i_2887_)
									i_2885_ = i_2887_;
								for (/**/; i_2885_ < 0; i_2885_++) {
									int i_2889_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2884_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2883_ >> 12))]);
									int i_2890_ = i_2889_ >>> 24;
									int i_2891_ = 256 - i_2890_;
									int i_2892_ = is_2879_[i_2882_];
									is_2879_[i_2882_++] = ((((i_2889_ & 0xff00ff) * i_2890_ + (i_2892_ & 0xff00ff) * i_2891_) & ~0xff00ff) + (((i_2889_ & 0xff00) * i_2890_ + (i_2892_ & 0xff00) * i_2891_) & 0xff0000)) >> 8;
								}
							}
						}
						i_2880_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2893_ = anInt9356;
					while (i_2893_ < 0) {
						int i_2894_ = i_2893_ + i_2878_;
						if (i_2894_ >= 0) {
							if (i_2894_ >= is.length)
								break;
							int i_2895_ = anInt9339;
							int i_2896_ = anInt9346;
							int i_2897_ = anInt9324 + anInt9349;
							int i_2898_ = anInt9347;
							if (i_2896_ >= 0 && (i_2896_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								int i_2899_;
								if ((i_2899_ = (i_2897_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
									i_2899_ = (anInt9341 - i_2899_) / anInt9341;
									i_2898_ += i_2899_;
									i_2897_ += anInt9341 * i_2899_;
									i_2895_ += i_2899_;
								}
								if ((i_2899_ = (i_2897_ - anInt9341) / anInt9341) > i_2898_)
									i_2898_ = i_2899_;
								int i_2900_ = is[i_2894_] - i;
								int i_2901_ = -is_2877_[i_2894_];
								int i_2902_ = i_2900_ - (i_2895_ - anInt9339);
								if (i_2902_ > 0) {
									i_2895_ += i_2902_;
									i_2898_ += i_2902_;
									i_2896_ += anInt9340 * i_2902_;
									i_2897_ += anInt9341 * i_2902_;
								} else
									i_2901_ -= i_2902_;
								if (i_2898_ < i_2901_)
									i_2898_ = i_2901_;
								for (/**/; i_2898_ < 0; i_2898_++) {
									int i_2903_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2897_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2896_ >> 12))]);
									int i_2904_ = i_2903_ >>> 24;
									int i_2905_ = 256 - i_2904_;
									int i_2906_ = is_2879_[i_2895_];
									is_2879_[i_2895_++] = ((((i_2903_ & 0xff00ff) * i_2904_ + (i_2906_ & 0xff00ff) * i_2905_) & ~0xff00ff) + (((i_2903_ & 0xff00) * i_2904_ + (i_2906_ & 0xff00) * i_2905_) & 0xff0000)) >> 8;
									i_2897_ += anInt9341;
								}
							}
						}
						i_2893_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2907_ = anInt9356;
					while (i_2907_ < 0) {
						int i_2908_ = i_2907_ + i_2878_;
						if (i_2908_ >= 0) {
							if (i_2908_ >= is.length)
								break;
							int i_2909_ = anInt9339;
							int i_2910_ = anInt9346;
							int i_2911_ = anInt9324 + anInt9349;
							int i_2912_ = anInt9347;
							if (i_2910_ >= 0 && (i_2910_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12)) < 0) {
								if (i_2911_ < 0) {
									int i_2913_ = ((anInt9341 - 1 - i_2911_) / anInt9341);
									i_2912_ += i_2913_;
									i_2911_ += anInt9341 * i_2913_;
									i_2909_ += i_2913_;
								}
								int i_2914_;
								if ((i_2914_ = (1 + i_2911_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2912_)
									i_2912_ = i_2914_;
								int i_2915_ = is[i_2908_] - i;
								int i_2916_ = -is_2877_[i_2908_];
								int i_2917_ = i_2915_ - (i_2909_ - anInt9339);
								if (i_2917_ > 0) {
									i_2909_ += i_2917_;
									i_2912_ += i_2917_;
									i_2910_ += anInt9340 * i_2917_;
									i_2911_ += anInt9341 * i_2917_;
								} else
									i_2916_ -= i_2917_;
								if (i_2912_ < i_2916_)
									i_2912_ = i_2916_;
								for (/**/; i_2912_ < 0; i_2912_++) {
									int i_2918_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2911_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2910_ >> 12))]);
									int i_2919_ = i_2918_ >>> 24;
									int i_2920_ = 256 - i_2919_;
									int i_2921_ = is_2879_[i_2909_];
									is_2879_[i_2909_++] = ((((i_2918_ & 0xff00ff) * i_2919_ + (i_2921_ & 0xff00ff) * i_2920_) & ~0xff00ff) + (((i_2918_ & 0xff00) * i_2919_ + (i_2921_ & 0xff00) * i_2920_) & 0xff0000)) >> 8;
									i_2911_ += anInt9341;
								}
							}
						}
						i_2907_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2922_ = anInt9356;
					while (i_2922_ < 0) {
						int i_2923_ = i_2922_ + i_2878_;
						if (i_2923_ >= 0) {
							if (i_2923_ >= is.length)
								break;
							int i_2924_ = anInt9339;
							int i_2925_ = anInt9346 + anInt9348;
							int i_2926_ = anInt9324;
							int i_2927_ = anInt9347;
							if (i_2926_ >= 0 && (i_2926_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) < 0) {
								int i_2928_;
								if ((i_2928_ = (i_2925_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
									i_2928_ = (anInt9340 - i_2928_) / anInt9340;
									i_2927_ += i_2928_;
									i_2925_ += anInt9340 * i_2928_;
									i_2924_ += i_2928_;
								}
								if ((i_2928_ = (i_2925_ - anInt9340) / anInt9340) > i_2927_)
									i_2927_ = i_2928_;
								int i_2929_ = is[i_2923_] - i;
								int i_2930_ = -is_2877_[i_2923_];
								int i_2931_ = i_2929_ - (i_2924_ - anInt9339);
								if (i_2931_ > 0) {
									i_2924_ += i_2931_;
									i_2927_ += i_2931_;
									i_2925_ += anInt9340 * i_2931_;
									i_2926_ += anInt9341 * i_2931_;
								} else
									i_2930_ -= i_2931_;
								if (i_2927_ < i_2930_)
									i_2927_ = i_2930_;
								for (/**/; i_2927_ < 0; i_2927_++) {
									int i_2932_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2926_ >> 12) * (((Class61_Sub3_Sub2) this).anInt9358)) + (i_2925_ >> 12))]);
									int i_2933_ = i_2932_ >>> 24;
									int i_2934_ = 256 - i_2933_;
									int i_2935_ = is_2879_[i_2924_];
									is_2879_[i_2924_++] = ((((i_2932_ & 0xff00ff) * i_2933_ + (i_2935_ & 0xff00ff) * i_2934_) & ~0xff00ff) + (((i_2932_ & 0xff00) * i_2933_ + (i_2935_ & 0xff00) * i_2934_) & 0xff0000)) >> 8;
									i_2925_ += anInt9340;
								}
							}
						}
						i_2922_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2936_ = anInt9356;
					while (i_2936_ < 0) {
						int i_2937_ = i_2936_ + i_2878_;
						if (i_2937_ >= 0) {
							if (i_2937_ >= is.length)
								break;
							int i_2938_ = anInt9339;
							int i_2939_ = anInt9346 + anInt9348;
							int i_2940_ = anInt9324 + anInt9349;
							int i_2941_ = anInt9347;
							int i_2942_;
							if ((i_2942_ = (i_2939_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2942_ = (anInt9340 - i_2942_) / anInt9340;
								i_2941_ += i_2942_;
								i_2939_ += anInt9340 * i_2942_;
								i_2940_ += anInt9341 * i_2942_;
								i_2938_ += i_2942_;
							}
							if ((i_2942_ = (i_2939_ - anInt9340) / anInt9340) > i_2941_)
								i_2941_ = i_2942_;
							if ((i_2942_ = (i_2940_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12))) >= 0) {
								i_2942_ = (anInt9341 - i_2942_) / anInt9341;
								i_2941_ += i_2942_;
								i_2939_ += anInt9340 * i_2942_;
								i_2940_ += anInt9341 * i_2942_;
								i_2938_ += i_2942_;
							}
							if ((i_2942_ = (i_2940_ - anInt9341) / anInt9341) > i_2941_)
								i_2941_ = i_2942_;
							int i_2943_ = is[i_2937_] - i;
							int i_2944_ = -is_2877_[i_2937_];
							int i_2945_ = i_2943_ - (i_2938_ - anInt9339);
							if (i_2945_ > 0) {
								i_2938_ += i_2945_;
								i_2941_ += i_2945_;
								i_2939_ += anInt9340 * i_2945_;
								i_2940_ += anInt9341 * i_2945_;
							} else
								i_2944_ -= i_2945_;
							if (i_2941_ < i_2944_)
								i_2941_ = i_2944_;
							for (/**/; i_2941_ < 0; i_2941_++) {
								int i_2946_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2940_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2939_ >> 12))]);
								int i_2947_ = i_2946_ >>> 24;
								int i_2948_ = 256 - i_2947_;
								int i_2949_ = is_2879_[i_2938_];
								is_2879_[i_2938_++] = ((((i_2946_ & 0xff00ff) * i_2947_ + (i_2949_ & 0xff00ff) * i_2948_) & ~0xff00ff) + (((i_2946_ & 0xff00) * i_2947_ + (i_2949_ & 0xff00) * i_2948_) & 0xff0000)) >> 8;
								i_2939_ += anInt9340;
								i_2940_ += anInt9341;
							}
						}
						i_2936_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2950_ = anInt9356;
					while (i_2950_ < 0) {
						int i_2951_ = i_2950_ + i_2878_;
						if (i_2951_ >= 0) {
							if (i_2951_ >= is.length)
								break;
							int i_2952_ = anInt9339;
							int i_2953_ = anInt9346 + anInt9348;
							int i_2954_ = anInt9324 + anInt9349;
							int i_2955_ = anInt9347;
							int i_2956_;
							if ((i_2956_ = (i_2953_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12))) >= 0) {
								i_2956_ = (anInt9340 - i_2956_) / anInt9340;
								i_2955_ += i_2956_;
								i_2953_ += anInt9340 * i_2956_;
								i_2954_ += anInt9341 * i_2956_;
								i_2952_ += i_2956_;
							}
							if ((i_2956_ = (i_2953_ - anInt9340) / anInt9340) > i_2955_)
								i_2955_ = i_2956_;
							if (i_2954_ < 0) {
								i_2956_ = (anInt9341 - 1 - i_2954_) / anInt9341;
								i_2955_ += i_2956_;
								i_2953_ += anInt9340 * i_2956_;
								i_2954_ += anInt9341 * i_2956_;
								i_2952_ += i_2956_;
							}
							if ((i_2956_ = (1 + i_2954_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2955_)
								i_2955_ = i_2956_;
							int i_2957_ = is[i_2951_] - i;
							int i_2958_ = -is_2877_[i_2951_];
							int i_2959_ = i_2957_ - (i_2952_ - anInt9339);
							if (i_2959_ > 0) {
								i_2952_ += i_2959_;
								i_2955_ += i_2959_;
								i_2953_ += anInt9340 * i_2959_;
								i_2954_ += anInt9341 * i_2959_;
							} else
								i_2958_ -= i_2959_;
							if (i_2955_ < i_2958_)
								i_2955_ = i_2958_;
							for (/**/; i_2955_ < 0; i_2955_++) {
								int i_2960_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2954_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2953_ >> 12))]);
								int i_2961_ = i_2960_ >>> 24;
								int i_2962_ = 256 - i_2961_;
								int i_2963_ = is_2879_[i_2952_];
								is_2879_[i_2952_++] = ((((i_2960_ & 0xff00ff) * i_2961_ + (i_2963_ & 0xff00ff) * i_2962_) & ~0xff00ff) + (((i_2960_ & 0xff00) * i_2961_ + (i_2963_ & 0xff00) * i_2962_) & 0xff0000)) >> 8;
								i_2953_ += anInt9340;
								i_2954_ += anInt9341;
							}
						}
						i_2950_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2964_ = anInt9356;
				while (i_2964_ < 0) {
					int i_2965_ = i_2964_ + i_2878_;
					if (i_2965_ >= 0) {
						if (i_2965_ >= is.length)
							break;
						int i_2966_ = anInt9339;
						int i_2967_ = anInt9346 + anInt9348;
						int i_2968_ = anInt9324;
						int i_2969_ = anInt9347;
						if (i_2968_ >= 0 && i_2968_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) < 0) {
							if (i_2967_ < 0) {
								int i_2970_ = (anInt9340 - 1 - i_2967_) / anInt9340;
								i_2969_ += i_2970_;
								i_2967_ += anInt9340 * i_2970_;
								i_2966_ += i_2970_;
							}
							int i_2971_;
							if ((i_2971_ = (1 + i_2967_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2969_)
								i_2969_ = i_2971_;
							int i_2972_ = is[i_2965_] - i;
							int i_2973_ = -is_2877_[i_2965_];
							int i_2974_ = i_2972_ - (i_2966_ - anInt9339);
							if (i_2974_ > 0) {
								i_2966_ += i_2974_;
								i_2969_ += i_2974_;
								i_2967_ += anInt9340 * i_2974_;
								i_2968_ += anInt9341 * i_2974_;
							} else
								i_2973_ -= i_2974_;
							if (i_2969_ < i_2973_)
								i_2969_ = i_2973_;
							for (/**/; i_2969_ < 0; i_2969_++) {
								int i_2975_ = (((Class61_Sub3_Sub2) this).anIntArray10094[((i_2968_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358 + (i_2967_ >> 12))]);
								int i_2976_ = i_2975_ >>> 24;
								int i_2977_ = 256 - i_2976_;
								int i_2978_ = is_2879_[i_2966_];
								is_2879_[i_2966_++] = ((((i_2975_ & 0xff00ff) * i_2976_ + (i_2978_ & 0xff00ff) * i_2977_) & ~0xff00ff) + (((i_2975_ & 0xff00) * i_2976_ + (i_2978_ & 0xff00) * i_2977_) & 0xff0000)) >> 8;
								i_2967_ += anInt9340;
							}
						}
					}
					i_2964_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2979_ = anInt9356;
				while (i_2979_ < 0) {
					int i_2980_ = i_2979_ + i_2878_;
					if (i_2980_ >= 0) {
						if (i_2980_ >= is.length)
							break;
						int i_2981_ = anInt9339;
						int i_2982_ = anInt9346 + anInt9348;
						int i_2983_ = anInt9324 + anInt9349;
						int i_2984_ = anInt9347;
						if (i_2982_ < 0) {
							int i_2985_ = (anInt9340 - 1 - i_2982_) / anInt9340;
							i_2984_ += i_2985_;
							i_2982_ += anInt9340 * i_2985_;
							i_2983_ += anInt9341 * i_2985_;
							i_2981_ += i_2985_;
						}
						int i_2986_;
						if ((i_2986_ = (1 + i_2982_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2984_)
							i_2984_ = i_2986_;
						if ((i_2986_ = i_2983_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12)) >= 0) {
							i_2986_ = (anInt9341 - i_2986_) / anInt9341;
							i_2984_ += i_2986_;
							i_2982_ += anInt9340 * i_2986_;
							i_2983_ += anInt9341 * i_2986_;
							i_2981_ += i_2986_;
						}
						if ((i_2986_ = (i_2983_ - anInt9341) / anInt9341) > i_2984_)
							i_2984_ = i_2986_;
						int i_2987_ = is[i_2980_] - i;
						int i_2988_ = -is_2877_[i_2980_];
						int i_2989_ = i_2987_ - (i_2981_ - anInt9339);
						if (i_2989_ > 0) {
							i_2981_ += i_2989_;
							i_2984_ += i_2989_;
							i_2982_ += anInt9340 * i_2989_;
							i_2983_ += anInt9341 * i_2989_;
						} else
							i_2988_ -= i_2989_;
						if (i_2984_ < i_2988_)
							i_2984_ = i_2988_;
						for (/**/; i_2984_ < 0; i_2984_++) {
							int i_2990_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2983_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2982_ >> 12))]);
							int i_2991_ = i_2990_ >>> 24;
							int i_2992_ = 256 - i_2991_;
							int i_2993_ = is_2879_[i_2981_];
							is_2879_[i_2981_++] = ((((i_2990_ & 0xff00ff) * i_2991_ + (i_2993_ & 0xff00ff) * i_2992_) & ~0xff00ff) + (((i_2990_ & 0xff00) * i_2991_ + (i_2993_ & 0xff00) * i_2992_) & 0xff0000)) >> 8;
							i_2982_ += anInt9340;
							i_2983_ += anInt9341;
						}
					}
					i_2979_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2994_ = anInt9356;
				while (i_2994_ < 0) {
					int i_2995_ = i_2994_ + i_2878_;
					if (i_2995_ >= 0) {
						if (i_2995_ >= is.length)
							break;
						int i_2996_ = anInt9339;
						int i_2997_ = anInt9346 + anInt9348;
						int i_2998_ = anInt9324 + anInt9349;
						int i_2999_ = anInt9347;
						if (i_2997_ < 0) {
							int i_3000_ = (anInt9340 - 1 - i_2997_) / anInt9340;
							i_2999_ += i_3000_;
							i_2997_ += anInt9340 * i_3000_;
							i_2998_ += anInt9341 * i_3000_;
							i_2996_ += i_3000_;
						}
						int i_3001_;
						if ((i_3001_ = (1 + i_2997_ - (((Class61_Sub3_Sub2) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2999_)
							i_2999_ = i_3001_;
						if (i_2998_ < 0) {
							i_3001_ = (anInt9341 - 1 - i_2998_) / anInt9341;
							i_2999_ += i_3001_;
							i_2997_ += anInt9340 * i_3001_;
							i_2998_ += anInt9341 * i_3001_;
							i_2996_ += i_3001_;
						}
						if ((i_3001_ = (1 + i_2998_ - (((Class61_Sub3_Sub2) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2999_)
							i_2999_ = i_3001_;
						int i_3002_ = is[i_2995_] - i;
						int i_3003_ = -is_2877_[i_2995_];
						int i_3004_ = i_3002_ - (i_2996_ - anInt9339);
						if (i_3004_ > 0) {
							i_2996_ += i_3004_;
							i_2999_ += i_3004_;
							i_2997_ += anInt9340 * i_3004_;
							i_2998_ += anInt9341 * i_3004_;
						} else
							i_3003_ -= i_3004_;
						if (i_2999_ < i_3003_)
							i_2999_ = i_3003_;
						for (/**/; i_2999_ < 0; i_2999_++) {
							int i_3005_ = (((Class61_Sub3_Sub2) this).anIntArray10094[(((i_2998_ >> 12) * ((Class61_Sub3_Sub2) this).anInt9358) + (i_2997_ >> 12))]);
							int i_3006_ = i_3005_ >>> 24;
							int i_3007_ = 256 - i_3006_;
							int i_3008_ = is_2879_[i_2996_];
							is_2879_[i_2996_++] = ((((i_3005_ & 0xff00ff) * i_3006_ + (i_3008_ & 0xff00ff) * i_3007_) & ~0xff00ff) + (((i_3005_ & 0xff00) * i_3006_ + (i_3008_ & 0xff00) * i_3007_) & 0xff0000)) >> 8;
							i_2997_ += anInt9340;
							i_2998_ += anInt9341;
						}
					}
					i_2994_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	public void method705(int i, int i_3009_, int i_3010_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is == null)
			throw new IllegalStateException("");
		if (i_3010_ == 0) {
			for (int i_3011_ = 0; i_3011_ < ((Class61_Sub3_Sub2) this).anInt9325; i_3011_++) {
				int i_3012_ = i_3011_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_3013_ = (((i_3009_ + i_3011_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_3014_ = 0; i_3014_ < ((Class61_Sub3_Sub2) this).anInt9358; i_3014_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_3012_ + i_3014_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_3012_ + i_3014_]) & 0xffffff | is[i_3013_ + i_3014_] << 8 & ~0xffffff);
			}
		} else if (i_3010_ == 1) {
			for (int i_3015_ = 0; i_3015_ < ((Class61_Sub3_Sub2) this).anInt9325; i_3015_++) {
				int i_3016_ = i_3015_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_3017_ = (((i_3009_ + i_3015_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_3018_ = 0; i_3018_ < ((Class61_Sub3_Sub2) this).anInt9358; i_3018_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_3016_ + i_3018_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_3016_ + i_3018_]) & 0xffffff | is[i_3017_ + i_3018_] << 16 & ~0xffffff);
			}
		} else if (i_3010_ == 2) {
			for (int i_3019_ = 0; i_3019_ < ((Class61_Sub3_Sub2) this).anInt9325; i_3019_++) {
				int i_3020_ = i_3019_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_3021_ = (((i_3009_ + i_3019_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_3022_ = 0; i_3022_ < ((Class61_Sub3_Sub2) this).anInt9358; i_3022_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_3020_ + i_3022_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_3020_ + i_3022_]) & 0xffffff | is[i_3021_ + i_3022_] << 24 & ~0xffffff);
			}
		} else if (i_3010_ == 3) {
			for (int i_3023_ = 0; i_3023_ < ((Class61_Sub3_Sub2) this).anInt9325; i_3023_++) {
				int i_3024_ = i_3023_ * ((Class61_Sub3_Sub2) this).anInt9358;
				int i_3025_ = (((i_3009_ + i_3023_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub2) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i);
				for (int i_3026_ = 0; i_3026_ < ((Class61_Sub3_Sub2) this).anInt9358; i_3026_++)
					((Class61_Sub3_Sub2) this).anIntArray10094[(i_3024_ + i_3026_)] = ((((Class61_Sub3_Sub2) this).anIntArray10094[i_3024_ + i_3026_]) & 0xffffff | (is[i_3025_ + i_3026_] != 0 ? -16777216 : 0));
			}
		}
	}
}
