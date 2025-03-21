/* Class61_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61_Sub3_Sub1 extends Class61_Sub3 {
	int[] anIntArray10093;

	public void method704(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			int i_6_ = (i_0_ + i_5_) * ((Class61_Sub3_Sub1) this).anInt9358 + i;
			int i_7_ = (((i_4_ + i_5_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i_3_);
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++)
				((Class61_Sub3_Sub1) this).anIntArray10093[i_6_ + i_8_] = is[i_7_ + i_8_];
		}
	}

	public Interface8_Impl1_Impl2 method684() {
		return new Class12(((Class61_Sub3_Sub1) this).anInt9358, ((Class61_Sub3_Sub1) this).anInt9325, ((Class61_Sub3_Sub1) this).anIntArray10093);
	}

	Class61_Sub3_Sub1(Class_ra_Sub3 class_ra_sub3, int[] is, int i, int i_9_) {
		super(class_ra_sub3, i, i_9_);
		((Class61_Sub3_Sub1) this).anIntArray10093 = is;
	}

	public void method737(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is == null)
			throw new IllegalStateException("");
		for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
			int i_16_ = (i_10_ + i_15_) * ((Class61_Sub3_Sub1) this).anInt9358 + i;
			int i_17_ = (((i_14_ + i_15_) * (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933)) + i_13_);
			for (int i_18_ = 0; i_18_ < i_11_; i_18_++)
				((Class61_Sub3_Sub1) this).anIntArray10093[i_16_ + i_18_] = is[i_17_ + i_18_];
		}
	}

	void method712(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_20_ > 0 && i_21_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_26_ = 0;
				int i_27_ = 0;
				int i_28_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_29_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
				int i_30_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
				int i_31_ = (i_29_ << 16) / i_20_;
				int i_32_ = (i_30_ << 16) / i_21_;
				if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
					int i_33_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_31_ - 1) / i_31_);
					i += i_33_;
					i_26_ += (i_33_ * i_31_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
					int i_34_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_32_ - 1) / i_32_);
					i_19_ += i_34_;
					i_27_ += (i_34_ * i_32_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9358 < i_29_)
					i_20_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_26_ + i_31_ - 1) / i_31_;
				if (((Class61_Sub3_Sub1) this).anInt9325 < i_30_)
					i_21_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_27_ + i_32_ - 1) / i_32_;
				int i_35_ = i + i_19_ * i_28_;
				int i_36_ = i_28_ - i_20_;
				if (i_19_ + i_21_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_21_ -= (i_19_ + i_21_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_19_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
					int i_37_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_19_);
					i_21_ -= i_37_;
					i_35_ += i_37_ * i_28_;
					i_27_ += i_32_ * i_37_;
				}
				if (i + i_20_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_38_ = (i + i_20_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_20_ -= i_38_;
					i_36_ += i_38_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_39_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
					i_20_ -= i_39_;
					i_35_ += i_39_;
					i_26_ += i_31_ * i_39_;
					i_36_ += i_39_;
				}
				if (i_24_ == 0) {
					if (i_22_ == 1) {
						int i_40_ = i_26_;
						for (int i_41_ = -i_21_; i_41_ < 0; i_41_++) {
							int i_42_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_43_ = -i_20_; i_43_ < 0; i_43_++) {
								is[i_35_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_42_]);
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_40_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 0) {
						int i_44_ = (i_23_ & 0xff0000) >> 16;
						int i_45_ = (i_23_ & 0xff00) >> 8;
						int i_46_ = i_23_ & 0xff;
						int i_47_ = i_26_;
						for (int i_48_ = -i_21_; i_48_ < 0; i_48_++) {
							int i_49_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_50_ = -i_20_; i_50_ < 0; i_50_++) {
								int i_51_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_49_]);
								int i_52_ = (i_51_ & 0xff0000) * i_44_ & ~0xffffff;
								int i_53_ = (i_51_ & 0xff00) * i_45_ & 0xff0000;
								int i_54_ = (i_51_ & 0xff) * i_46_ & 0xff00;
								is[i_35_++] = (i_52_ | i_53_ | i_54_) >>> 8;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_47_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 3) {
						int i_55_ = i_26_;
						for (int i_56_ = -i_21_; i_56_ < 0; i_56_++) {
							int i_57_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_58_ = -i_20_; i_58_ < 0; i_58_++) {
								int i_59_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_57_]);
								int i_60_ = i_59_ + i_23_;
								int i_61_ = (i_59_ & 0xff00ff) + (i_23_ & 0xff00ff);
								int i_62_ = ((i_61_ & 0x1000100) + (i_60_ - i_61_ & 0x10000));
								is[i_35_++] = i_60_ - i_62_ | i_62_ - (i_62_ >>> 8);
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_55_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 2) {
						int i_63_ = i_23_ >>> 24;
						int i_64_ = 256 - i_63_;
						int i_65_ = (i_23_ & 0xff00ff) * i_64_ & ~0xff00ff;
						int i_66_ = (i_23_ & 0xff00) * i_64_ & 0xff0000;
						i_23_ = (i_65_ | i_66_) >>> 8;
						int i_67_ = i_26_;
						for (int i_68_ = -i_21_; i_68_ < 0; i_68_++) {
							int i_69_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_70_ = -i_20_; i_70_ < 0; i_70_++) {
								int i_71_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_69_]);
								i_65_ = (i_71_ & 0xff00ff) * i_63_ & ~0xff00ff;
								i_66_ = (i_71_ & 0xff00) * i_63_ & 0xff0000;
								is[i_35_++] = ((i_65_ | i_66_) >>> 8) + i_23_;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_67_;
							i_35_ += i_36_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_24_ == 1) {
					if (i_22_ == 1) {
						int i_72_ = i_26_;
						for (int i_73_ = -i_21_; i_73_ < 0; i_73_++) {
							int i_74_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_75_ = -i_20_; i_75_ < 0; i_75_++) {
								int i_76_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_74_]);
								if (i_76_ != 0)
									is[i_35_++] = i_76_;
								else
									i_35_++;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_72_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 0) {
						int i_77_ = i_26_;
						if ((i_23_ & 0xffffff) == 16777215) {
							int i_78_ = i_23_ >>> 24;
							int i_79_ = 256 - i_78_;
							for (int i_80_ = -i_21_; i_80_ < 0; i_80_++) {
								int i_81_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_82_ = -i_20_; i_82_ < 0; i_82_++) {
									int i_83_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_81_]);
									if (i_83_ != 0) {
										int i_84_ = is[i_35_];
										is[i_35_++] = ((((i_83_ & 0xff00ff) * i_78_ + (i_84_ & 0xff00ff) * i_79_) & ~0xff00ff) + (((i_83_ & 0xff00) * i_78_ + (i_84_ & 0xff00) * i_79_) & 0xff0000)) >> 8;
									} else
										i_35_++;
									i_26_ += i_31_;
								}
								i_27_ += i_32_;
								i_26_ = i_77_;
								i_35_ += i_36_;
							}
						} else {
							int i_85_ = (i_23_ & 0xff0000) >> 16;
							int i_86_ = (i_23_ & 0xff00) >> 8;
							int i_87_ = i_23_ & 0xff;
							int i_88_ = i_23_ >>> 24;
							int i_89_ = 256 - i_88_;
							for (int i_90_ = -i_21_; i_90_ < 0; i_90_++) {
								int i_91_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_92_ = -i_20_; i_92_ < 0; i_92_++) {
									int i_93_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_91_]);
									if (i_93_ != 0) {
										if (i_88_ != 255) {
											int i_94_ = ((i_93_ & 0xff0000) * i_85_ & ~0xffffff);
											int i_95_ = ((i_93_ & 0xff00) * i_86_ & 0xff0000);
											int i_96_ = ((i_93_ & 0xff) * i_87_ & 0xff00);
											i_93_ = ((i_94_ | i_95_ | i_96_) >>> 8);
											int i_97_ = is[i_35_];
											is[i_35_++] = ((((i_93_ & 0xff00ff) * i_88_ + ((i_97_ & 0xff00ff) * i_89_)) & ~0xff00ff) + (((i_93_ & 0xff00) * i_88_ + ((i_97_ & 0xff00) * i_89_)) & 0xff0000)) >> 8;
										} else {
											int i_98_ = ((i_93_ & 0xff0000) * i_85_ & ~0xffffff);
											int i_99_ = ((i_93_ & 0xff00) * i_86_ & 0xff0000);
											int i_100_ = ((i_93_ & 0xff) * i_87_ & 0xff00);
											is[i_35_++] = (i_98_ | i_99_ | i_100_) >>> 8;
										}
									} else
										i_35_++;
									i_26_ += i_31_;
								}
								i_27_ += i_32_;
								i_26_ = i_77_;
								i_35_ += i_36_;
							}
						}
					} else if (i_22_ == 3) {
						int i_101_ = i_26_;
						int i_102_ = i_23_ >>> 24;
						int i_103_ = 256 - i_102_;
						for (int i_104_ = -i_21_; i_104_ < 0; i_104_++) {
							int i_105_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_106_ = -i_20_; i_106_ < 0; i_106_++) {
								int i_107_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_105_]);
								int i_108_ = i_107_ + i_23_;
								int i_109_ = (i_107_ & 0xff00ff) + (i_23_ & 0xff00ff);
								int i_110_ = ((i_109_ & 0x1000100) + (i_108_ - i_109_ & 0x10000));
								i_110_ = i_108_ - i_110_ | i_110_ - (i_110_ >>> 8);
								if (i_107_ == 0 && i_102_ != 255) {
									i_107_ = i_110_;
									i_110_ = is[i_35_];
									i_110_ = ((((i_107_ & 0xff00ff) * i_102_ + (i_110_ & 0xff00ff) * i_103_) & ~0xff00ff) + (((i_107_ & 0xff00) * i_102_ + (i_110_ & 0xff00) * i_103_) & 0xff0000)) >> 8;
								}
								is[i_35_++] = i_110_;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_101_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 2) {
						int i_111_ = i_23_ >>> 24;
						int i_112_ = 256 - i_111_;
						int i_113_ = (i_23_ & 0xff00ff) * i_112_ & ~0xff00ff;
						int i_114_ = (i_23_ & 0xff00) * i_112_ & 0xff0000;
						i_23_ = (i_113_ | i_114_) >>> 8;
						int i_115_ = i_26_;
						for (int i_116_ = -i_21_; i_116_ < 0; i_116_++) {
							int i_117_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_118_ = -i_20_; i_118_ < 0; i_118_++) {
								int i_119_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_117_]);
								if (i_119_ != 0) {
									i_113_ = ((i_119_ & 0xff00ff) * i_111_ & ~0xff00ff);
									i_114_ = ((i_119_ & 0xff00) * i_111_ & 0xff0000);
									is[i_35_++] = ((i_113_ | i_114_) >>> 8) + i_23_;
								} else
									i_35_++;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_115_;
							i_35_ += i_36_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_24_ == 2) {
					if (i_22_ == 1) {
						int i_120_ = i_26_;
						for (int i_121_ = -i_21_; i_121_ < 0; i_121_++) {
							int i_122_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_123_ = -i_20_; i_123_ < 0; i_123_++) {
								int i_124_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_122_]);
								if (i_124_ != 0) {
									int i_125_ = is[i_35_];
									int i_126_ = i_124_ + i_125_;
									int i_127_ = ((i_124_ & 0xff00ff) + (i_125_ & 0xff00ff));
									i_125_ = ((i_127_ & 0x1000100) + (i_126_ - i_127_ & 0x10000));
									is[i_35_++] = i_126_ - i_125_ | i_125_ - (i_125_ >>> 8);
								} else
									i_35_++;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_120_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 0) {
						int i_128_ = i_26_;
						int i_129_ = (i_23_ & 0xff0000) >> 16;
						int i_130_ = (i_23_ & 0xff00) >> 8;
						int i_131_ = i_23_ & 0xff;
						for (int i_132_ = -i_21_; i_132_ < 0; i_132_++) {
							int i_133_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_134_ = -i_20_; i_134_ < 0; i_134_++) {
								int i_135_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_133_]);
								if (i_135_ != 0) {
									int i_136_ = ((i_135_ & 0xff0000) * i_129_ & ~0xffffff);
									int i_137_ = ((i_135_ & 0xff00) * i_130_ & 0xff0000);
									int i_138_ = (i_135_ & 0xff) * i_131_ & 0xff00;
									i_135_ = (i_136_ | i_137_ | i_138_) >>> 8;
									int i_139_ = is[i_35_];
									int i_140_ = i_135_ + i_139_;
									int i_141_ = ((i_135_ & 0xff00ff) + (i_139_ & 0xff00ff));
									i_139_ = ((i_141_ & 0x1000100) + (i_140_ - i_141_ & 0x10000));
									is[i_35_++] = i_140_ - i_139_ | i_139_ - (i_139_ >>> 8);
								} else
									i_35_++;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_128_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 3) {
						int i_142_ = i_26_;
						for (int i_143_ = -i_21_; i_143_ < 0; i_143_++) {
							int i_144_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_145_ = -i_20_; i_145_ < 0; i_145_++) {
								int i_146_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_144_]);
								int i_147_ = i_146_ + i_23_;
								int i_148_ = (i_146_ & 0xff00ff) + (i_23_ & 0xff00ff);
								int i_149_ = ((i_148_ & 0x1000100) + (i_147_ - i_148_ & 0x10000));
								i_146_ = i_147_ - i_149_ | i_149_ - (i_149_ >>> 8);
								i_149_ = is[i_35_];
								i_147_ = i_146_ + i_149_;
								i_148_ = (i_146_ & 0xff00ff) + (i_149_ & 0xff00ff);
								i_149_ = (i_148_ & 0x1000100) + (i_147_ - i_148_ & 0x10000);
								is[i_35_++] = i_147_ - i_149_ | i_149_ - (i_149_ >>> 8);
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_142_;
							i_35_ += i_36_;
						}
					} else if (i_22_ == 2) {
						int i_150_ = i_23_ >>> 24;
						int i_151_ = 256 - i_150_;
						int i_152_ = (i_23_ & 0xff00ff) * i_151_ & ~0xff00ff;
						int i_153_ = (i_23_ & 0xff00) * i_151_ & 0xff0000;
						i_23_ = (i_152_ | i_153_) >>> 8;
						int i_154_ = i_26_;
						for (int i_155_ = -i_21_; i_155_ < 0; i_155_++) {
							int i_156_ = ((i_27_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_157_ = -i_20_; i_157_ < 0; i_157_++) {
								int i_158_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_26_ >> 16) + i_156_]);
								if (i_158_ != 0) {
									i_152_ = ((i_158_ & 0xff00ff) * i_150_ & ~0xff00ff);
									i_153_ = ((i_158_ & 0xff00) * i_150_ & 0xff0000);
									i_158_ = ((i_152_ | i_153_) >>> 8) + i_23_;
									int i_159_ = is[i_35_];
									int i_160_ = i_158_ + i_159_;
									int i_161_ = ((i_158_ & 0xff00ff) + (i_159_ & 0xff00ff));
									i_159_ = ((i_161_ & 0x1000100) + (i_160_ - i_161_ & 0x10000));
									is[i_35_++] = i_160_ - i_159_ | i_159_ - (i_159_ >>> 8);
								} else
									i_35_++;
								i_26_ += i_31_;
							}
							i_27_ += i_32_;
							i_26_ = i_154_;
							i_35_ += i_36_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method750(int i, int i_162_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_163_ = anInt9356;
					while (i_163_ < 0) {
						int i_164_ = anInt9339;
						int i_165_ = anInt9346;
						int i_166_ = anInt9324;
						int i_167_ = anInt9347;
						if (i_165_ >= 0 && i_166_ >= 0 && i_165_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0 && i_166_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							for (/**/; i_167_ < 0; i_167_++)
								method757(((i_166_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_165_ >> 12), i_164_++, is, i, i_162_);
						}
						i_163_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_168_ = anInt9356;
					while (i_168_ < 0) {
						int i_169_ = anInt9339;
						int i_170_ = anInt9346;
						int i_171_ = anInt9324 + anInt9349;
						int i_172_ = anInt9347;
						if (i_170_ >= 0 && i_170_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0) {
							int i_173_;
							if ((i_173_ = i_171_ - ((((Class61_Sub3_Sub1) this).anInt9325) << 12)) >= 0) {
								i_173_ = (anInt9341 - i_173_) / anInt9341;
								i_172_ += i_173_;
								i_171_ += anInt9341 * i_173_;
								i_169_ += i_173_;
							}
							if ((i_173_ = (i_171_ - anInt9341) / anInt9341) > i_172_)
								i_172_ = i_173_;
							for (/**/; i_172_ < 0; i_172_++) {
								method757(((i_171_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_170_ >> 12), i_169_++, is, i, i_162_);
								i_171_ += anInt9341;
							}
						}
						i_168_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_174_ = anInt9356;
					while (i_174_ < 0) {
						int i_175_ = anInt9339;
						int i_176_ = anInt9346;
						int i_177_ = anInt9324 + anInt9349;
						int i_178_ = anInt9347;
						if (i_176_ >= 0 && i_176_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0) {
							if (i_177_ < 0) {
								int i_179_ = (anInt9341 - 1 - i_177_) / anInt9341;
								i_178_ += i_179_;
								i_177_ += anInt9341 * i_179_;
								i_175_ += i_179_;
							}
							int i_180_;
							if ((i_180_ = (1 + i_177_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_178_)
								i_178_ = i_180_;
							for (/**/; i_178_ < 0; i_178_++) {
								method757(((i_177_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_176_ >> 12), i_175_++, is, i, i_162_);
								i_177_ += anInt9341;
							}
						}
						i_174_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_181_ = anInt9356;
					while (i_181_ < 0) {
						int i_182_ = anInt9339;
						int i_183_ = anInt9346 + anInt9348;
						int i_184_ = anInt9324;
						int i_185_ = anInt9347;
						if (i_184_ >= 0 && i_184_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							int i_186_;
							if ((i_186_ = i_183_ - ((((Class61_Sub3_Sub1) this).anInt9358) << 12)) >= 0) {
								i_186_ = (anInt9340 - i_186_) / anInt9340;
								i_185_ += i_186_;
								i_183_ += anInt9340 * i_186_;
								i_182_ += i_186_;
							}
							if ((i_186_ = (i_183_ - anInt9340) / anInt9340) > i_185_)
								i_185_ = i_186_;
							for (/**/; i_185_ < 0; i_185_++) {
								method757(((i_184_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_183_ >> 12), i_182_++, is, i, i_162_);
								i_183_ += anInt9340;
							}
						}
						i_181_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_187_ = anInt9356;
					while (i_187_ < 0) {
						int i_188_ = anInt9339;
						int i_189_ = anInt9346 + anInt9348;
						int i_190_ = anInt9324 + anInt9349;
						int i_191_ = anInt9347;
						int i_192_;
						if ((i_192_ = i_189_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) >= 0) {
							i_192_ = (anInt9340 - i_192_) / anInt9340;
							i_191_ += i_192_;
							i_189_ += anInt9340 * i_192_;
							i_190_ += anInt9341 * i_192_;
							i_188_ += i_192_;
						}
						if ((i_192_ = (i_189_ - anInt9340) / anInt9340) > i_191_)
							i_191_ = i_192_;
						if ((i_192_ = i_190_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_192_ = (anInt9341 - i_192_) / anInt9341;
							i_191_ += i_192_;
							i_189_ += anInt9340 * i_192_;
							i_190_ += anInt9341 * i_192_;
							i_188_ += i_192_;
						}
						if ((i_192_ = (i_190_ - anInt9341) / anInt9341) > i_191_)
							i_191_ = i_192_;
						for (/**/; i_191_ < 0; i_191_++) {
							method757((((i_190_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_189_ >> 12)), i_188_++, is, i, i_162_);
							i_189_ += anInt9340;
							i_190_ += anInt9341;
						}
						i_187_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_193_ = anInt9356;
					while (i_193_ < 0) {
						int i_194_ = anInt9339;
						int i_195_ = anInt9346 + anInt9348;
						int i_196_ = anInt9324 + anInt9349;
						int i_197_ = anInt9347;
						int i_198_;
						if ((i_198_ = i_195_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) >= 0) {
							i_198_ = (anInt9340 - i_198_) / anInt9340;
							i_197_ += i_198_;
							i_195_ += anInt9340 * i_198_;
							i_196_ += anInt9341 * i_198_;
							i_194_ += i_198_;
						}
						if ((i_198_ = (i_195_ - anInt9340) / anInt9340) > i_197_)
							i_197_ = i_198_;
						if (i_196_ < 0) {
							i_198_ = (anInt9341 - 1 - i_196_) / anInt9341;
							i_197_ += i_198_;
							i_195_ += anInt9340 * i_198_;
							i_196_ += anInt9341 * i_198_;
							i_194_ += i_198_;
						}
						if ((i_198_ = (1 + i_196_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_197_)
							i_197_ = i_198_;
						for (/**/; i_197_ < 0; i_197_++) {
							method757((((i_196_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_195_ >> 12)), i_194_++, is, i, i_162_);
							i_195_ += anInt9340;
							i_196_ += anInt9341;
						}
						i_193_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_199_ = anInt9356;
				while (i_199_ < 0) {
					int i_200_ = anInt9339;
					int i_201_ = anInt9346 + anInt9348;
					int i_202_ = anInt9324;
					int i_203_ = anInt9347;
					if (i_202_ >= 0 && i_202_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
						if (i_201_ < 0) {
							int i_204_ = (anInt9340 - 1 - i_201_) / anInt9340;
							i_203_ += i_204_;
							i_201_ += anInt9340 * i_204_;
							i_200_ += i_204_;
						}
						int i_205_;
						if ((i_205_ = (1 + i_201_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_203_)
							i_203_ = i_205_;
						for (/**/; i_203_ < 0; i_203_++) {
							method757((((i_202_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_201_ >> 12)), i_200_++, is, i, i_162_);
							i_201_ += anInt9340;
						}
					}
					i_199_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_206_ = anInt9356; i_206_ < 0; i_206_++) {
					int i_207_ = anInt9339;
					int i_208_ = anInt9346 + anInt9348;
					int i_209_ = anInt9324 + anInt9349;
					int i_210_ = anInt9347;
					if (i_208_ < 0) {
						int i_211_ = (anInt9340 - 1 - i_208_) / anInt9340;
						i_210_ += i_211_;
						i_208_ += anInt9340 * i_211_;
						i_209_ += anInt9341 * i_211_;
						i_207_ += i_211_;
					}
					int i_212_;
					if ((i_212_ = (1 + i_208_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_210_)
						i_210_ = i_212_;
					if ((i_212_ = i_209_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
						i_212_ = (anInt9341 - i_212_) / anInt9341;
						i_210_ += i_212_;
						i_208_ += anInt9340 * i_212_;
						i_209_ += anInt9341 * i_212_;
						i_207_ += i_212_;
					}
					if ((i_212_ = (i_209_ - anInt9341) / anInt9341) > i_210_)
						i_210_ = i_212_;
					for (/**/; i_210_ < 0; i_210_++) {
						method757((((i_209_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_208_ >> 12)), i_207_++, is, i, i_162_);
						i_208_ += anInt9340;
						i_209_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_213_ = anInt9356; i_213_ < 0; i_213_++) {
					int i_214_ = anInt9339;
					int i_215_ = anInt9346 + anInt9348;
					int i_216_ = anInt9324 + anInt9349;
					int i_217_ = anInt9347;
					if (i_215_ < 0) {
						int i_218_ = (anInt9340 - 1 - i_215_) / anInt9340;
						i_217_ += i_218_;
						i_215_ += anInt9340 * i_218_;
						i_216_ += anInt9341 * i_218_;
						i_214_ += i_218_;
					}
					int i_219_;
					if ((i_219_ = (1 + i_215_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_217_)
						i_217_ = i_219_;
					if (i_216_ < 0) {
						i_219_ = (anInt9341 - 1 - i_216_) / anInt9341;
						i_217_ += i_219_;
						i_215_ += anInt9340 * i_219_;
						i_216_ += anInt9341 * i_219_;
						i_214_ += i_219_;
					}
					if ((i_219_ = (1 + i_216_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_217_)
						i_217_ = i_219_;
					for (/**/; i_217_ < 0; i_217_++) {
						method757((((i_216_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_215_ >> 12)), i_214_++, is, i, i_162_);
						i_215_ += anInt9340;
						i_216_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	public void method688(int i, int i_220_, int i_221_, int i_222_, int i_223_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_224_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub1) this).anInt9352;
			i_220_ += ((Class61_Sub3_Sub1) this).anInt9327;
			int i_225_ = i_220_ * i_224_ + i;
			int i_226_ = 0;
			int i_227_ = ((Class61_Sub3_Sub1) this).anInt9325;
			int i_228_ = ((Class61_Sub3_Sub1) this).anInt9358;
			int i_229_ = i_224_ - i_228_;
			int i_230_ = 0;
			if (i_220_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_231_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_220_);
				i_227_ -= i_231_;
				i_220_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_226_ += i_231_ * i_228_;
				i_225_ += i_231_ * i_224_;
			}
			if (i_220_ + i_227_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_227_ -= (i_220_ + i_227_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_232_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_228_ -= i_232_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_226_ += i_232_;
				i_225_ += i_232_;
				i_230_ += i_232_;
				i_229_ += i_232_;
			}
			if (i + i_228_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_233_ = (i + i_228_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_228_ -= i_233_;
				i_230_ += i_233_;
				i_229_ += i_233_;
			}
			if (i_228_ > 0 && i_227_ > 0) {
				if (i_223_ == 0) {
					if (i_221_ == 1) {
						for (int i_234_ = -i_227_; i_234_ < 0; i_234_++) {
							int i_235_ = i_225_ + i_228_ - 3;
							while (i_225_ < i_235_) {
								is[i_225_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								is[i_225_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								is[i_225_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								is[i_225_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
							}
							i_235_ += 3;
							while (i_225_ < i_235_)
								is[i_225_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 0) {
						int i_236_ = (i_222_ & 0xff0000) >> 16;
						int i_237_ = (i_222_ & 0xff00) >> 8;
						int i_238_ = i_222_ & 0xff;
						for (int i_239_ = -i_227_; i_239_ < 0; i_239_++) {
							for (int i_240_ = -i_228_; i_240_ < 0; i_240_++) {
								int i_241_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								int i_242_ = (i_241_ & 0xff0000) * i_236_ & ~0xffffff;
								int i_243_ = (i_241_ & 0xff00) * i_237_ & 0xff0000;
								int i_244_ = (i_241_ & 0xff) * i_238_ & 0xff00;
								is[i_225_++] = (i_242_ | i_243_ | i_244_) >>> 8;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 3) {
						for (int i_245_ = -i_227_; i_245_ < 0; i_245_++) {
							for (int i_246_ = -i_228_; i_246_ < 0; i_246_++) {
								int i_247_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								int i_248_ = i_247_ + i_222_;
								int i_249_ = ((i_247_ & 0xff00ff) + (i_222_ & 0xff00ff));
								int i_250_ = ((i_249_ & 0x1000100) + (i_248_ - i_249_ & 0x10000));
								is[i_225_++] = i_248_ - i_250_ | i_250_ - (i_250_ >>> 8);
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 2) {
						int i_251_ = i_222_ >>> 24;
						int i_252_ = 256 - i_251_;
						int i_253_ = (i_222_ & 0xff00ff) * i_252_ & ~0xff00ff;
						int i_254_ = (i_222_ & 0xff00) * i_252_ & 0xff0000;
						i_222_ = (i_253_ | i_254_) >>> 8;
						for (int i_255_ = -i_227_; i_255_ < 0; i_255_++) {
							for (int i_256_ = -i_228_; i_256_ < 0; i_256_++) {
								int i_257_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								i_253_ = (i_257_ & 0xff00ff) * i_251_ & ~0xff00ff;
								i_254_ = (i_257_ & 0xff00) * i_251_ & 0xff0000;
								is[i_225_++] = ((i_253_ | i_254_) >>> 8) + i_222_;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_223_ == 1) {
					if (i_221_ == 1) {
						for (int i_258_ = -i_227_; i_258_ < 0; i_258_++) {
							int i_259_ = i_225_ + i_228_ - 3;
							while (i_225_ < i_259_) {
								int i_260_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_260_ != 0)
									is[i_225_++] = i_260_;
								else
									i_225_++;
								i_260_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_260_ != 0)
									is[i_225_++] = i_260_;
								else
									i_225_++;
								i_260_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_260_ != 0)
									is[i_225_++] = i_260_;
								else
									i_225_++;
								i_260_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_260_ != 0)
									is[i_225_++] = i_260_;
								else
									i_225_++;
							}
							i_259_ += 3;
							while (i_225_ < i_259_) {
								int i_261_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_261_ != 0)
									is[i_225_++] = i_261_;
								else
									i_225_++;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 0) {
						if ((i_222_ & 0xffffff) == 16777215) {
							int i_262_ = i_222_ >>> 24;
							int i_263_ = 256 - i_262_;
							for (int i_264_ = -i_227_; i_264_ < 0; i_264_++) {
								for (int i_265_ = -i_228_; i_265_ < 0; i_265_++) {
									int i_266_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
									if (i_266_ != 0) {
										int i_267_ = is[i_225_];
										is[i_225_++] = ((((i_266_ & 0xff00ff) * i_262_ + ((i_267_ & 0xff00ff) * i_263_)) & ~0xff00ff) + (((i_266_ & 0xff00) * i_262_ + ((i_267_ & 0xff00) * i_263_)) & 0xff0000)) >> 8;
									} else
										i_225_++;
								}
								i_225_ += i_229_;
								i_226_ += i_230_;
							}
						} else {
							int i_268_ = (i_222_ & 0xff0000) >> 16;
							int i_269_ = (i_222_ & 0xff00) >> 8;
							int i_270_ = i_222_ & 0xff;
							int i_271_ = i_222_ >>> 24;
							int i_272_ = 256 - i_271_;
							for (int i_273_ = -i_227_; i_273_ < 0; i_273_++) {
								for (int i_274_ = -i_228_; i_274_ < 0; i_274_++) {
									int i_275_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
									if (i_275_ != 0) {
										if (i_271_ != 255) {
											int i_276_ = ((i_275_ & 0xff0000) * i_268_ & ~0xffffff);
											int i_277_ = ((i_275_ & 0xff00) * i_269_ & 0xff0000);
											int i_278_ = ((i_275_ & 0xff) * i_270_ & 0xff00);
											i_275_ = (i_276_ | i_277_ | i_278_) >>> 8;
											int i_279_ = is[i_225_];
											is[i_225_++] = (((((i_275_ & 0xff00ff) * i_271_) + ((i_279_ & 0xff00ff) * i_272_)) & ~0xff00ff) + ((((i_275_ & 0xff00) * i_271_) + ((i_279_ & 0xff00) * i_272_)) & 0xff0000)) >> 8;
										} else {
											int i_280_ = ((i_275_ & 0xff0000) * i_268_ & ~0xffffff);
											int i_281_ = ((i_275_ & 0xff00) * i_269_ & 0xff0000);
											int i_282_ = ((i_275_ & 0xff) * i_270_ & 0xff00);
											is[i_225_++] = (i_280_ | i_281_ | i_282_) >>> 8;
										}
									} else
										i_225_++;
								}
								i_225_ += i_229_;
								i_226_ += i_230_;
							}
						}
					} else if (i_221_ == 3) {
						int i_283_ = i_222_ >>> 24;
						int i_284_ = 256 - i_283_;
						for (int i_285_ = -i_227_; i_285_ < 0; i_285_++) {
							for (int i_286_ = -i_228_; i_286_ < 0; i_286_++) {
								int i_287_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								int i_288_ = i_287_ + i_222_;
								int i_289_ = ((i_287_ & 0xff00ff) + (i_222_ & 0xff00ff));
								int i_290_ = ((i_289_ & 0x1000100) + (i_288_ - i_289_ & 0x10000));
								i_290_ = i_288_ - i_290_ | i_290_ - (i_290_ >>> 8);
								if (i_287_ == 0 && i_283_ != 255) {
									i_287_ = i_290_;
									i_290_ = is[i_225_];
									i_290_ = ((((i_287_ & 0xff00ff) * i_283_ + (i_290_ & 0xff00ff) * i_284_) & ~0xff00ff) + (((i_287_ & 0xff00) * i_283_ + (i_290_ & 0xff00) * i_284_) & 0xff0000)) >> 8;
								}
								is[i_225_++] = i_290_;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 2) {
						int i_291_ = i_222_ >>> 24;
						int i_292_ = 256 - i_291_;
						int i_293_ = (i_222_ & 0xff00ff) * i_292_ & ~0xff00ff;
						int i_294_ = (i_222_ & 0xff00) * i_292_ & 0xff0000;
						i_222_ = (i_293_ | i_294_) >>> 8;
						for (int i_295_ = -i_227_; i_295_ < 0; i_295_++) {
							for (int i_296_ = -i_228_; i_296_ < 0; i_296_++) {
								int i_297_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_297_ != 0) {
									i_293_ = ((i_297_ & 0xff00ff) * i_291_ & ~0xff00ff);
									i_294_ = ((i_297_ & 0xff00) * i_291_ & 0xff0000);
									is[i_225_++] = ((i_293_ | i_294_) >>> 8) + i_222_;
								} else
									i_225_++;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_223_ == 2) {
					if (i_221_ == 1) {
						for (int i_298_ = -i_227_; i_298_ < 0; i_298_++) {
							for (int i_299_ = -i_228_; i_299_ < 0; i_299_++) {
								int i_300_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_300_ != 0) {
									int i_301_ = is[i_225_];
									int i_302_ = i_300_ + i_301_;
									int i_303_ = ((i_300_ & 0xff00ff) + (i_301_ & 0xff00ff));
									i_301_ = ((i_303_ & 0x1000100) + (i_302_ - i_303_ & 0x10000));
									is[i_225_++] = i_302_ - i_301_ | i_301_ - (i_301_ >>> 8);
								} else
									i_225_++;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 0) {
						int i_304_ = (i_222_ & 0xff0000) >> 16;
						int i_305_ = (i_222_ & 0xff00) >> 8;
						int i_306_ = i_222_ & 0xff;
						for (int i_307_ = -i_227_; i_307_ < 0; i_307_++) {
							for (int i_308_ = -i_228_; i_308_ < 0; i_308_++) {
								int i_309_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_309_ != 0) {
									int i_310_ = ((i_309_ & 0xff0000) * i_304_ & ~0xffffff);
									int i_311_ = ((i_309_ & 0xff00) * i_305_ & 0xff0000);
									int i_312_ = (i_309_ & 0xff) * i_306_ & 0xff00;
									i_309_ = (i_310_ | i_311_ | i_312_) >>> 8;
									int i_313_ = is[i_225_];
									int i_314_ = i_309_ + i_313_;
									int i_315_ = ((i_309_ & 0xff00ff) + (i_313_ & 0xff00ff));
									i_313_ = ((i_315_ & 0x1000100) + (i_314_ - i_315_ & 0x10000));
									is[i_225_++] = i_314_ - i_313_ | i_313_ - (i_313_ >>> 8);
								} else
									i_225_++;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 3) {
						for (int i_316_ = -i_227_; i_316_ < 0; i_316_++) {
							for (int i_317_ = -i_228_; i_317_ < 0; i_317_++) {
								int i_318_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								int i_319_ = i_318_ + i_222_;
								int i_320_ = ((i_318_ & 0xff00ff) + (i_222_ & 0xff00ff));
								int i_321_ = ((i_320_ & 0x1000100) + (i_319_ - i_320_ & 0x10000));
								i_318_ = i_319_ - i_321_ | i_321_ - (i_321_ >>> 8);
								i_321_ = is[i_225_];
								i_319_ = i_318_ + i_321_;
								i_320_ = (i_318_ & 0xff00ff) + (i_321_ & 0xff00ff);
								i_321_ = (i_320_ & 0x1000100) + (i_319_ - i_320_ & 0x10000);
								is[i_225_++] = i_319_ - i_321_ | i_321_ - (i_321_ >>> 8);
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else if (i_221_ == 2) {
						int i_322_ = i_222_ >>> 24;
						int i_323_ = 256 - i_322_;
						int i_324_ = (i_222_ & 0xff00ff) * i_323_ & ~0xff00ff;
						int i_325_ = (i_222_ & 0xff00) * i_323_ & 0xff0000;
						i_222_ = (i_324_ | i_325_) >>> 8;
						for (int i_326_ = -i_227_; i_326_ < 0; i_326_++) {
							for (int i_327_ = -i_228_; i_327_ < 0; i_327_++) {
								int i_328_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_226_++]);
								if (i_328_ != 0) {
									i_324_ = ((i_328_ & 0xff00ff) * i_322_ & ~0xff00ff);
									i_325_ = ((i_328_ & 0xff00) * i_322_ & 0xff0000);
									i_328_ = ((i_324_ | i_325_) >>> 8) + i_222_;
									int i_329_ = is[i_225_];
									int i_330_ = i_328_ + i_329_;
									int i_331_ = ((i_328_ & 0xff00ff) + (i_329_ & 0xff00ff));
									i_329_ = ((i_331_ & 0x1000100) + (i_330_ - i_331_ & 0x10000));
									is[i_225_++] = i_330_ - i_329_ | i_329_ - (i_329_ >>> 8);
								} else
									i_225_++;
							}
							i_225_ += i_229_;
							i_226_ += i_230_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method742(boolean bool, boolean bool_332_, boolean bool_333_, int i, int i_334_, float f, int i_335_, int i_336_, int i_337_, int i_338_, int i_339_, int i_340_, boolean bool_341_) {
		if (i_335_ > 0 && i_336_ > 0 && (bool || bool_332_)) {
			int i_342_ = 0;
			int i_343_ = 0;
			int i_344_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
			int i_345_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
			int i_346_ = (i_344_ << 16) / i_335_;
			int i_347_ = (i_345_ << 16) / i_336_;
			if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
				int i_348_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_346_ - 1) / i_346_);
				i += i_348_;
				i_342_ += i_348_ * i_346_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16);
			}
			if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
				int i_349_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_347_ - 1) / i_347_);
				i_334_ += i_349_;
				i_343_ += i_349_ * i_347_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16);
			}
			if (((Class61_Sub3_Sub1) this).anInt9358 < i_344_)
				i_335_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_342_ + i_346_ - 1) / i_346_;
			if (((Class61_Sub3_Sub1) this).anInt9325 < i_345_)
				i_336_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_343_ + i_347_ - 1) / i_347_;
			int i_350_ = i + i_334_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_351_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_335_);
			if (i_334_ + i_336_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_336_ -= (i_334_ + i_336_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_334_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_352_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_334_);
				i_336_ -= i_352_;
				i_350_ += i_352_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_343_ += i_347_ * i_352_;
			}
			if (i + i_335_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_353_ = (i + i_335_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_335_ -= i_353_;
				i_351_ += i_353_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_354_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_335_ -= i_354_;
				i_350_ += i_354_;
				i_342_ += i_346_ * i_354_;
				i_351_ += i_354_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_339_ == 0) {
				if (i_337_ == 1) {
					int i_355_ = i_342_;
					for (int i_356_ = -i_336_; i_356_ < 0; i_356_++) {
						int i_357_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_358_ = -i_335_; i_358_ < 0; i_358_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								if (bool)
									is[i_350_] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_357_]);
								if (bool_332_ && bool_341_)
									fs[i_350_] = f;
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_355_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 0) {
					int i_359_ = (i_338_ & 0xff0000) >> 16;
					int i_360_ = (i_338_ & 0xff00) >> 8;
					int i_361_ = i_338_ & 0xff;
					int i_362_ = i_342_;
					for (int i_363_ = -i_336_; i_363_ < 0; i_363_++) {
						int i_364_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_365_ = -i_335_; i_365_ < 0; i_365_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								if (bool) {
									int i_366_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_364_]);
									int i_367_ = ((i_366_ & 0xff0000) * i_359_ & ~0xffffff);
									int i_368_ = ((i_366_ & 0xff00) * i_360_ & 0xff0000);
									int i_369_ = (i_366_ & 0xff) * i_361_ & 0xff00;
									is[i_350_] = (i_367_ | i_368_ | i_369_) >>> 8;
								}
								if (bool_332_ && bool_341_)
									fs[i_350_] = f;
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_362_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 3) {
					int i_370_ = i_342_;
					for (int i_371_ = -i_336_; i_371_ < 0; i_371_++) {
						int i_372_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_373_ = -i_335_; i_373_ < 0; i_373_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								if (bool) {
									int i_374_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_372_]);
									int i_375_ = i_374_ + i_338_;
									int i_376_ = ((i_374_ & 0xff00ff) + (i_338_ & 0xff00ff));
									int i_377_ = ((i_376_ & 0x1000100) + (i_375_ - i_376_ & 0x10000));
									is[i_350_] = i_375_ - i_377_ | i_377_ - (i_377_ >>> 8);
								}
								if (bool_332_ && bool_341_)
									fs[i_350_] = f;
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_370_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 2) {
					int i_378_ = i_338_ >>> 24;
					int i_379_ = 256 - i_378_;
					int i_380_ = (i_338_ & 0xff00ff) * i_379_ & ~0xff00ff;
					int i_381_ = (i_338_ & 0xff00) * i_379_ & 0xff0000;
					i_338_ = (i_380_ | i_381_) >>> 8;
					int i_382_ = i_342_;
					for (int i_383_ = -i_336_; i_383_ < 0; i_383_++) {
						int i_384_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_385_ = -i_335_; i_385_ < 0; i_385_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								if (bool) {
									int i_386_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_384_]);
									i_380_ = ((i_386_ & 0xff00ff) * i_378_ & ~0xff00ff);
									i_381_ = ((i_386_ & 0xff00) * i_378_ & 0xff0000);
									is[i_350_] = ((i_380_ | i_381_) >>> 8) + i_338_;
								}
								if (bool_332_ && bool_341_)
									fs[i_350_] = f;
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_382_;
						i_350_ += i_351_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_339_ == 1) {
				if (i_337_ == 1) {
					int i_387_ = i_342_;
					for (int i_388_ = -i_336_; i_388_ < 0; i_388_++) {
						int i_389_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_390_ = -i_335_; i_390_ < 0; i_390_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								int i_391_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_389_]);
								if (i_391_ != 0) {
									if (bool)
										is[i_350_] = i_391_;
									if (bool_332_ && bool_341_)
										fs[i_350_] = f;
								}
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_387_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 0) {
					int i_392_ = i_342_;
					if ((i_338_ & 0xffffff) == 16777215) {
						int i_393_ = i_338_ >>> 24;
						int i_394_ = 256 - i_393_;
						for (int i_395_ = -i_336_; i_395_ < 0; i_395_++) {
							int i_396_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_397_ = -i_335_; i_397_ < 0; i_397_++) {
								if (!bool_332_ || f < fs[i_350_]) {
									int i_398_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_396_]);
									if (i_398_ != 0) {
										if (bool) {
											int i_399_ = is[i_350_];
											is[i_350_] = (((((i_398_ & 0xff00ff) * i_393_) + ((i_399_ & 0xff00ff) * i_394_)) & ~0xff00ff) + ((((i_398_ & 0xff00) * i_393_) + ((i_399_ & 0xff00) * i_394_)) & 0xff0000)) >> 8;
										}
										if (bool_332_ && bool_341_)
											fs[i_350_] = f;
									}
								}
								i_342_ += i_346_;
								i_350_++;
							}
							i_343_ += i_347_;
							i_342_ = i_392_;
							i_350_ += i_351_;
						}
					} else {
						int i_400_ = (i_338_ & 0xff0000) >> 16;
						int i_401_ = (i_338_ & 0xff00) >> 8;
						int i_402_ = i_338_ & 0xff;
						int i_403_ = i_338_ >>> 24;
						int i_404_ = 256 - i_403_;
						for (int i_405_ = -i_336_; i_405_ < 0; i_405_++) {
							int i_406_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_407_ = -i_335_; i_407_ < 0; i_407_++) {
								if (!bool_332_ || f < fs[i_350_]) {
									int i_408_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_406_]);
									if (i_408_ != 0) {
										if (i_403_ != 255) {
											if (bool) {
												int i_409_ = (((i_408_ & 0xff0000) * i_400_) & ~0xffffff);
												int i_410_ = (((i_408_ & 0xff00) * i_401_) & 0xff0000);
												int i_411_ = ((i_408_ & 0xff) * i_402_ & 0xff00);
												i_408_ = (i_409_ | i_410_ | i_411_) >>> 8;
												int i_412_ = is[i_350_];
												is[i_350_] = (((((i_408_ & 0xff00ff) * i_403_) + ((i_412_ & 0xff00ff) * i_404_)) & ~0xff00ff) + ((((i_408_ & 0xff00) * i_403_) + ((i_412_ & 0xff00) * i_404_)) & 0xff0000)) >> 8;
											}
											if (bool_332_ && bool_341_)
												fs[i_350_] = f;
										} else {
											if (bool) {
												int i_413_ = (((i_408_ & 0xff0000) * i_400_) & ~0xffffff);
												int i_414_ = (((i_408_ & 0xff00) * i_401_) & 0xff0000);
												int i_415_ = ((i_408_ & 0xff) * i_402_ & 0xff00);
												is[i_350_] = (i_413_ | i_414_ | i_415_) >>> 8;
											}
											if (bool_332_ && bool_341_)
												fs[i_350_] = f;
										}
									}
								}
								i_342_ += i_346_;
								i_350_++;
							}
							i_343_ += i_347_;
							i_342_ = i_392_;
							i_350_ += i_351_;
						}
					}
				} else if (i_337_ == 3) {
					int i_416_ = i_342_;
					int i_417_ = i_338_ >>> 24;
					int i_418_ = 256 - i_417_;
					for (int i_419_ = -i_336_; i_419_ < 0; i_419_++) {
						int i_420_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_421_ = -i_335_; i_421_ < 0; i_421_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								if (bool) {
									int i_422_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_420_]);
									int i_423_ = i_422_ + i_338_;
									int i_424_ = ((i_422_ & 0xff00ff) + (i_338_ & 0xff00ff));
									int i_425_ = ((i_424_ & 0x1000100) + (i_423_ - i_424_ & 0x10000));
									i_425_ = i_423_ - i_425_ | i_425_ - (i_425_ >>> 8);
									if (i_422_ == 0 && i_417_ != 255) {
										i_422_ = i_425_;
										i_425_ = is[i_350_];
										i_425_ = ((((i_422_ & 0xff00ff) * i_417_ + ((i_425_ & 0xff00ff) * i_418_)) & ~0xff00ff) + (((i_422_ & 0xff00) * i_417_ + ((i_425_ & 0xff00) * i_418_)) & 0xff0000)) >> 8;
									}
									is[i_350_] = i_425_;
								}
								if (bool_332_ && bool_341_)
									fs[i_350_] = f;
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_416_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 2) {
					int i_426_ = i_338_ >>> 24;
					int i_427_ = 256 - i_426_;
					int i_428_ = (i_338_ & 0xff00ff) * i_427_ & ~0xff00ff;
					int i_429_ = (i_338_ & 0xff00) * i_427_ & 0xff0000;
					i_338_ = (i_428_ | i_429_) >>> 8;
					int i_430_ = i_342_;
					for (int i_431_ = -i_336_; i_431_ < 0; i_431_++) {
						int i_432_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_433_ = -i_335_; i_433_ < 0; i_433_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								int i_434_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_432_]);
								if (i_434_ != 0) {
									if (bool) {
										i_428_ = ((i_434_ & 0xff00ff) * i_426_ & ~0xff00ff);
										i_429_ = ((i_434_ & 0xff00) * i_426_ & 0xff0000);
										is[i_350_] = (((i_428_ | i_429_) >>> 8) + i_338_);
									}
									if (bool_332_ && bool_341_)
										fs[i_350_] = f;
								}
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_430_;
						i_350_ += i_351_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_339_ == 2) {
				if (i_337_ == 1) {
					int i_435_ = i_342_;
					for (int i_436_ = -i_336_; i_436_ < 0; i_436_++) {
						int i_437_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_438_ = -i_335_; i_438_ < 0; i_438_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								int i_439_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_437_]);
								if (i_439_ != 0) {
									if (bool) {
										int i_440_ = is[i_350_];
										int i_441_ = i_439_ + i_440_;
										int i_442_ = ((i_439_ & 0xff00ff) + (i_440_ & 0xff00ff));
										i_440_ = ((i_442_ & 0x1000100) + (i_441_ - i_442_ & 0x10000));
										is[i_350_] = (i_441_ - i_440_ | i_440_ - (i_440_ >>> 8));
									}
									if (bool_332_ && bool_341_)
										fs[i_350_] = f;
								}
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_435_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 0) {
					int i_443_ = i_342_;
					int i_444_ = (i_338_ & 0xff0000) >> 16;
					int i_445_ = (i_338_ & 0xff00) >> 8;
					int i_446_ = i_338_ & 0xff;
					for (int i_447_ = -i_336_; i_447_ < 0; i_447_++) {
						int i_448_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_449_ = -i_335_; i_449_ < 0; i_449_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								int i_450_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_448_]);
								if (i_450_ != 0) {
									if (bool) {
										int i_451_ = ((i_450_ & 0xff0000) * i_444_ & ~0xffffff);
										int i_452_ = ((i_450_ & 0xff00) * i_445_ & 0xff0000);
										int i_453_ = ((i_450_ & 0xff) * i_446_ & 0xff00);
										i_450_ = (i_451_ | i_452_ | i_453_) >>> 8;
										int i_454_ = is[i_350_];
										int i_455_ = i_450_ + i_454_;
										int i_456_ = ((i_450_ & 0xff00ff) + (i_454_ & 0xff00ff));
										i_454_ = ((i_456_ & 0x1000100) + (i_455_ - i_456_ & 0x10000));
										is[i_350_] = (i_455_ - i_454_ | i_454_ - (i_454_ >>> 8));
									}
									if (bool_332_ && bool_341_)
										fs[i_350_] = f;
								}
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_443_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 3) {
					int i_457_ = i_342_;
					for (int i_458_ = -i_336_; i_458_ < 0; i_458_++) {
						int i_459_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_460_ = -i_335_; i_460_ < 0; i_460_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								if (bool) {
									int i_461_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_459_]);
									int i_462_ = i_461_ + i_338_;
									int i_463_ = ((i_461_ & 0xff00ff) + (i_338_ & 0xff00ff));
									int i_464_ = ((i_463_ & 0x1000100) + (i_462_ - i_463_ & 0x10000));
									i_461_ = i_462_ - i_464_ | i_464_ - (i_464_ >>> 8);
									i_464_ = is[i_350_];
									i_462_ = i_461_ + i_464_;
									i_463_ = (i_461_ & 0xff00ff) + (i_464_ & 0xff00ff);
									i_464_ = ((i_463_ & 0x1000100) + (i_462_ - i_463_ & 0x10000));
									is[i_350_] = i_462_ - i_464_ | i_464_ - (i_464_ >>> 8);
								}
								if (bool_332_ && bool_341_)
									fs[i_350_] = f;
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_457_;
						i_350_ += i_351_;
					}
				} else if (i_337_ == 2) {
					int i_465_ = i_338_ >>> 24;
					int i_466_ = 256 - i_465_;
					int i_467_ = (i_338_ & 0xff00ff) * i_466_ & ~0xff00ff;
					int i_468_ = (i_338_ & 0xff00) * i_466_ & 0xff0000;
					i_338_ = (i_467_ | i_468_) >>> 8;
					int i_469_ = i_342_;
					for (int i_470_ = -i_336_; i_470_ < 0; i_470_++) {
						int i_471_ = ((i_343_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_472_ = -i_335_; i_472_ < 0; i_472_++) {
							if (!bool_332_ || f < fs[i_350_]) {
								int i_473_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_342_ >> 16) + i_471_]);
								if (i_473_ != 0) {
									if (bool) {
										i_467_ = ((i_473_ & 0xff00ff) * i_465_ & ~0xff00ff);
										i_468_ = ((i_473_ & 0xff00) * i_465_ & 0xff0000);
										i_473_ = (((i_467_ | i_468_) >>> 8) + i_338_);
										int i_474_ = is[i_350_];
										int i_475_ = i_473_ + i_474_;
										int i_476_ = ((i_473_ & 0xff00ff) + (i_474_ & 0xff00ff));
										i_474_ = ((i_476_ & 0x1000100) + (i_475_ - i_476_ & 0x10000));
										is[i_350_] = (i_475_ - i_474_ | i_474_ - (i_474_ >>> 8));
									}
									if (bool_332_ && bool_341_)
										fs[i_350_] = f;
								}
							}
							i_342_ += i_346_;
							i_350_++;
						}
						i_343_ += i_347_;
						i_342_ = i_469_;
						i_350_ += i_351_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method757(int i, int i_477_, int[] is, int i_478_, int i_479_) {
		if (i_479_ == 0) {
			if (i_478_ == 1)
				is[i_477_] = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
			else if (i_478_ == 0) {
				int i_480_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i++];
				int i_481_ = (i_480_ & 0xff0000) * anInt9353 & ~0xffffff;
				int i_482_ = (i_480_ & 0xff00) * anInt9354 & 0xff0000;
				int i_483_ = (i_480_ & 0xff) * anInt9333 & 0xff00;
				is[i_477_] = (i_481_ | i_482_ | i_483_) >>> 8;
			} else if (i_478_ == 3) {
				int i_484_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i++];
				int i_485_ = anInt9350;
				int i_486_ = i_484_ + i_485_;
				int i_487_ = (i_484_ & 0xff00ff) + (i_485_ & 0xff00ff);
				int i_488_ = (i_487_ & 0x1000100) + (i_486_ - i_487_ & 0x10000);
				is[i_477_] = i_486_ - i_488_ | i_488_ - (i_488_ >>> 8);
			} else if (i_478_ == 2) {
				int i_489_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				int i_490_ = (i_489_ & 0xff00ff) * anInt9351 & ~0xff00ff;
				int i_491_ = (i_489_ & 0xff00) * anInt9351 & 0xff0000;
				is[i_477_] = ((i_490_ | i_491_) >>> 8) + anInt9323;
			} else
				throw new IllegalArgumentException();
		} else if (i_479_ == 1) {
			if (i_478_ == 1) {
				int i_492_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				if (i_492_ != 0)
					is[i_477_] = i_492_;
			} else if (i_478_ == 0) {
				int i_493_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				if (i_493_ != 0) {
					if ((anInt9350 & 0xffffff) == 16777215) {
						int i_494_ = anInt9350 >>> 24;
						int i_495_ = 256 - i_494_;
						int i_496_ = is[i_477_];
						is[i_477_] = ((((i_493_ & 0xff00ff) * i_494_ + (i_496_ & 0xff00ff) * i_495_) & ~0xff00ff) + (((i_493_ & 0xff00) * i_494_ + (i_496_ & 0xff00) * i_495_) & 0xff0000)) >> 8;
					} else if (anInt9351 != 255) {
						int i_497_ = (i_493_ & 0xff0000) * anInt9353 & ~0xffffff;
						int i_498_ = (i_493_ & 0xff00) * anInt9354 & 0xff0000;
						int i_499_ = (i_493_ & 0xff) * anInt9333 & 0xff00;
						i_493_ = (i_497_ | i_498_ | i_499_) >>> 8;
						int i_500_ = is[i_477_];
						is[i_477_] = ((((i_493_ & 0xff00ff) * anInt9351 + (i_500_ & 0xff00ff) * anInt9335) & ~0xff00ff) + (((i_493_ & 0xff00) * anInt9351 + (i_500_ & 0xff00) * anInt9335) & 0xff0000)) >> 8;
					} else {
						int i_501_ = (i_493_ & 0xff0000) * anInt9353 & ~0xffffff;
						int i_502_ = (i_493_ & 0xff00) * anInt9354 & 0xff0000;
						int i_503_ = (i_493_ & 0xff) * anInt9333 & 0xff00;
						is[i_477_] = (i_501_ | i_502_ | i_503_) >>> 8;
					}
				}
			} else if (i_478_ == 3) {
				int i_504_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				int i_505_ = anInt9350;
				int i_506_ = i_504_ + i_505_;
				int i_507_ = (i_504_ & 0xff00ff) + (i_505_ & 0xff00ff);
				int i_508_ = (i_507_ & 0x1000100) + (i_506_ - i_507_ & 0x10000);
				i_508_ = i_506_ - i_508_ | i_508_ - (i_508_ >>> 8);
				if (i_504_ == 0 && anInt9351 != 255) {
					i_504_ = i_508_;
					i_508_ = is[i_477_];
					i_508_ = ((((i_504_ & 0xff00ff) * anInt9351 + (i_508_ & 0xff00ff) * anInt9335) & ~0xff00ff) + (((i_504_ & 0xff00) * anInt9351 + (i_508_ & 0xff00) * anInt9335) & 0xff0000)) >> 8;
				}
				is[i_477_] = i_508_;
			} else if (i_478_ == 2) {
				int i_509_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				if (i_509_ != 0) {
					int i_510_ = (i_509_ & 0xff00ff) * anInt9351 & ~0xff00ff;
					int i_511_ = (i_509_ & 0xff00) * anInt9351 & 0xff0000;
					is[i_477_++] = ((i_510_ | i_511_) >>> 8) + anInt9323;
				}
			} else
				throw new IllegalArgumentException();
		} else if (i_479_ == 2) {
			if (i_478_ == 1) {
				int i_512_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				if (i_512_ != 0) {
					int i_513_ = is[i_477_];
					int i_514_ = i_512_ + i_513_;
					int i_515_ = (i_512_ & 0xff00ff) + (i_513_ & 0xff00ff);
					i_513_ = (i_515_ & 0x1000100) + (i_514_ - i_515_ & 0x10000);
					is[i_477_] = i_514_ - i_513_ | i_513_ - (i_513_ >>> 8);
				}
			} else if (i_478_ == 0) {
				int i_516_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				if (i_516_ != 0) {
					int i_517_ = (i_516_ & 0xff0000) * anInt9353 & ~0xffffff;
					int i_518_ = (i_516_ & 0xff00) * anInt9354 & 0xff0000;
					int i_519_ = (i_516_ & 0xff) * anInt9333 & 0xff00;
					i_516_ = (i_517_ | i_518_ | i_519_) >>> 8;
					int i_520_ = is[i_477_];
					int i_521_ = i_516_ + i_520_;
					int i_522_ = (i_516_ & 0xff00ff) + (i_520_ & 0xff00ff);
					i_520_ = (i_522_ & 0x1000100) + (i_521_ - i_522_ & 0x10000);
					is[i_477_] = i_521_ - i_520_ | i_520_ - (i_520_ >>> 8);
				}
			} else if (i_478_ == 3) {
				int i_523_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				int i_524_ = anInt9350;
				int i_525_ = i_523_ + i_524_;
				int i_526_ = (i_523_ & 0xff00ff) + (i_524_ & 0xff00ff);
				int i_527_ = (i_526_ & 0x1000100) + (i_525_ - i_526_ & 0x10000);
				i_523_ = i_525_ - i_527_ | i_527_ - (i_527_ >>> 8);
				i_527_ = is[i_477_];
				i_525_ = i_523_ + i_527_;
				i_526_ = (i_523_ & 0xff00ff) + (i_527_ & 0xff00ff);
				i_527_ = (i_526_ & 0x1000100) + (i_525_ - i_526_ & 0x10000);
				is[i_477_] = i_525_ - i_527_ | i_527_ - (i_527_ >>> 8);
			} else if (i_478_ == 2) {
				int i_528_ = ((Class61_Sub3_Sub1) this).anIntArray10093[i];
				if (i_528_ != 0) {
					int i_529_ = (i_528_ & 0xff00ff) * anInt9351 & ~0xff00ff;
					int i_530_ = (i_528_ & 0xff00) * anInt9351 & 0xff0000;
					i_528_ = ((i_529_ | i_530_) >>> 8) + anInt9323;
					int i_531_ = is[i_477_];
					int i_532_ = i_528_ + i_531_;
					int i_533_ = (i_528_ & 0xff00ff) + (i_531_ & 0xff00ff);
					i_531_ = (i_533_ & 0x1000100) + (i_532_ - i_533_ & 0x10000);
					is[i_477_] = i_532_ - i_531_ | i_531_ - (i_531_ >>> 8);
				}
			}
		} else
			throw new IllegalArgumentException();
	}

	void method744(boolean bool, boolean bool_534_, boolean bool_535_, int i, int i_536_, float f, int i_537_, int i_538_, int i_539_, int i_540_, int i_541_, int i_542_, boolean bool_543_) {
		if (i_537_ > 0 && i_538_ > 0 && (bool || bool_534_)) {
			int i_544_ = 0;
			int i_545_ = 0;
			int i_546_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
			int i_547_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
			int i_548_ = (i_546_ << 16) / i_537_;
			int i_549_ = (i_547_ << 16) / i_538_;
			if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
				int i_550_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_548_ - 1) / i_548_);
				i += i_550_;
				i_544_ += i_550_ * i_548_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16);
			}
			if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
				int i_551_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_549_ - 1) / i_549_);
				i_536_ += i_551_;
				i_545_ += i_551_ * i_549_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16);
			}
			if (((Class61_Sub3_Sub1) this).anInt9358 < i_546_)
				i_537_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_544_ + i_548_ - 1) / i_548_;
			if (((Class61_Sub3_Sub1) this).anInt9325 < i_547_)
				i_538_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_545_ + i_549_ - 1) / i_549_;
			int i_552_ = i + i_536_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_553_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_537_);
			if (i_536_ + i_538_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_538_ -= (i_536_ + i_538_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_536_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_554_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_536_);
				i_538_ -= i_554_;
				i_552_ += i_554_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_545_ += i_549_ * i_554_;
			}
			if (i + i_537_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_555_ = (i + i_537_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_537_ -= i_555_;
				i_553_ += i_555_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_556_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_537_ -= i_556_;
				i_552_ += i_556_;
				i_544_ += i_548_ * i_556_;
				i_553_ += i_556_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_541_ == 0) {
				if (i_539_ == 1) {
					int i_557_ = i_544_;
					for (int i_558_ = -i_538_; i_558_ < 0; i_558_++) {
						int i_559_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_560_ = -i_537_; i_560_ < 0; i_560_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								if (bool)
									is[i_552_] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_559_]);
								if (bool_534_ && bool_543_)
									fs[i_552_] = f;
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_557_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 0) {
					int i_561_ = (i_540_ & 0xff0000) >> 16;
					int i_562_ = (i_540_ & 0xff00) >> 8;
					int i_563_ = i_540_ & 0xff;
					int i_564_ = i_544_;
					for (int i_565_ = -i_538_; i_565_ < 0; i_565_++) {
						int i_566_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_567_ = -i_537_; i_567_ < 0; i_567_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								if (bool) {
									int i_568_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_566_]);
									int i_569_ = ((i_568_ & 0xff0000) * i_561_ & ~0xffffff);
									int i_570_ = ((i_568_ & 0xff00) * i_562_ & 0xff0000);
									int i_571_ = (i_568_ & 0xff) * i_563_ & 0xff00;
									is[i_552_] = (i_569_ | i_570_ | i_571_) >>> 8;
								}
								if (bool_534_ && bool_543_)
									fs[i_552_] = f;
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_564_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 3) {
					int i_572_ = i_544_;
					for (int i_573_ = -i_538_; i_573_ < 0; i_573_++) {
						int i_574_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_575_ = -i_537_; i_575_ < 0; i_575_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								if (bool) {
									int i_576_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_574_]);
									int i_577_ = i_576_ + i_540_;
									int i_578_ = ((i_576_ & 0xff00ff) + (i_540_ & 0xff00ff));
									int i_579_ = ((i_578_ & 0x1000100) + (i_577_ - i_578_ & 0x10000));
									is[i_552_] = i_577_ - i_579_ | i_579_ - (i_579_ >>> 8);
								}
								if (bool_534_ && bool_543_)
									fs[i_552_] = f;
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_572_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 2) {
					int i_580_ = i_540_ >>> 24;
					int i_581_ = 256 - i_580_;
					int i_582_ = (i_540_ & 0xff00ff) * i_581_ & ~0xff00ff;
					int i_583_ = (i_540_ & 0xff00) * i_581_ & 0xff0000;
					i_540_ = (i_582_ | i_583_) >>> 8;
					int i_584_ = i_544_;
					for (int i_585_ = -i_538_; i_585_ < 0; i_585_++) {
						int i_586_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_587_ = -i_537_; i_587_ < 0; i_587_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								if (bool) {
									int i_588_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_586_]);
									i_582_ = ((i_588_ & 0xff00ff) * i_580_ & ~0xff00ff);
									i_583_ = ((i_588_ & 0xff00) * i_580_ & 0xff0000);
									is[i_552_] = ((i_582_ | i_583_) >>> 8) + i_540_;
								}
								if (bool_534_ && bool_543_)
									fs[i_552_] = f;
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_584_;
						i_552_ += i_553_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_541_ == 1) {
				if (i_539_ == 1) {
					int i_589_ = i_544_;
					for (int i_590_ = -i_538_; i_590_ < 0; i_590_++) {
						int i_591_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_592_ = -i_537_; i_592_ < 0; i_592_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								int i_593_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_591_]);
								if (i_593_ != 0) {
									if (bool)
										is[i_552_] = i_593_;
									if (bool_534_ && bool_543_)
										fs[i_552_] = f;
								}
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_589_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 0) {
					int i_594_ = i_544_;
					if ((i_540_ & 0xffffff) == 16777215) {
						int i_595_ = i_540_ >>> 24;
						int i_596_ = 256 - i_595_;
						for (int i_597_ = -i_538_; i_597_ < 0; i_597_++) {
							int i_598_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_599_ = -i_537_; i_599_ < 0; i_599_++) {
								if (!bool_534_ || f < fs[i_552_]) {
									int i_600_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_598_]);
									if (i_600_ != 0) {
										if (bool) {
											int i_601_ = is[i_552_];
											is[i_552_] = (((((i_600_ & 0xff00ff) * i_595_) + ((i_601_ & 0xff00ff) * i_596_)) & ~0xff00ff) + ((((i_600_ & 0xff00) * i_595_) + ((i_601_ & 0xff00) * i_596_)) & 0xff0000)) >> 8;
										}
										if (bool_534_ && bool_543_)
											fs[i_552_] = f;
									}
								}
								i_544_ += i_548_;
								i_552_++;
							}
							i_545_ += i_549_;
							i_544_ = i_594_;
							i_552_ += i_553_;
						}
					} else {
						int i_602_ = (i_540_ & 0xff0000) >> 16;
						int i_603_ = (i_540_ & 0xff00) >> 8;
						int i_604_ = i_540_ & 0xff;
						int i_605_ = i_540_ >>> 24;
						int i_606_ = 256 - i_605_;
						for (int i_607_ = -i_538_; i_607_ < 0; i_607_++) {
							int i_608_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_609_ = -i_537_; i_609_ < 0; i_609_++) {
								if (!bool_534_ || f < fs[i_552_]) {
									int i_610_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_608_]);
									if (i_610_ != 0) {
										if (i_605_ != 255) {
											if (bool) {
												int i_611_ = (((i_610_ & 0xff0000) * i_602_) & ~0xffffff);
												int i_612_ = (((i_610_ & 0xff00) * i_603_) & 0xff0000);
												int i_613_ = ((i_610_ & 0xff) * i_604_ & 0xff00);
												i_610_ = (i_611_ | i_612_ | i_613_) >>> 8;
												int i_614_ = is[i_552_];
												is[i_552_] = (((((i_610_ & 0xff00ff) * i_605_) + ((i_614_ & 0xff00ff) * i_606_)) & ~0xff00ff) + ((((i_610_ & 0xff00) * i_605_) + ((i_614_ & 0xff00) * i_606_)) & 0xff0000)) >> 8;
											}
											if (bool_534_ && bool_543_)
												fs[i_552_] = f;
										} else {
											if (bool) {
												int i_615_ = (((i_610_ & 0xff0000) * i_602_) & ~0xffffff);
												int i_616_ = (((i_610_ & 0xff00) * i_603_) & 0xff0000);
												int i_617_ = ((i_610_ & 0xff) * i_604_ & 0xff00);
												is[i_552_] = (i_615_ | i_616_ | i_617_) >>> 8;
											}
											if (bool_534_ && bool_543_)
												fs[i_552_] = f;
										}
									}
								}
								i_544_ += i_548_;
								i_552_++;
							}
							i_545_ += i_549_;
							i_544_ = i_594_;
							i_552_ += i_553_;
						}
					}
				} else if (i_539_ == 3) {
					int i_618_ = i_544_;
					int i_619_ = i_540_ >>> 24;
					int i_620_ = 256 - i_619_;
					for (int i_621_ = -i_538_; i_621_ < 0; i_621_++) {
						int i_622_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_623_ = -i_537_; i_623_ < 0; i_623_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								if (bool) {
									int i_624_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_622_]);
									int i_625_ = i_624_ + i_540_;
									int i_626_ = ((i_624_ & 0xff00ff) + (i_540_ & 0xff00ff));
									int i_627_ = ((i_626_ & 0x1000100) + (i_625_ - i_626_ & 0x10000));
									i_627_ = i_625_ - i_627_ | i_627_ - (i_627_ >>> 8);
									if (i_624_ == 0 && i_619_ != 255) {
										i_624_ = i_627_;
										i_627_ = is[i_552_];
										i_627_ = ((((i_624_ & 0xff00ff) * i_619_ + ((i_627_ & 0xff00ff) * i_620_)) & ~0xff00ff) + (((i_624_ & 0xff00) * i_619_ + ((i_627_ & 0xff00) * i_620_)) & 0xff0000)) >> 8;
									}
									is[i_552_] = i_627_;
								}
								if (bool_534_ && bool_543_)
									fs[i_552_] = f;
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_618_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 2) {
					int i_628_ = i_540_ >>> 24;
					int i_629_ = 256 - i_628_;
					int i_630_ = (i_540_ & 0xff00ff) * i_629_ & ~0xff00ff;
					int i_631_ = (i_540_ & 0xff00) * i_629_ & 0xff0000;
					i_540_ = (i_630_ | i_631_) >>> 8;
					int i_632_ = i_544_;
					for (int i_633_ = -i_538_; i_633_ < 0; i_633_++) {
						int i_634_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_635_ = -i_537_; i_635_ < 0; i_635_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								int i_636_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_634_]);
								if (i_636_ != 0) {
									if (bool) {
										i_630_ = ((i_636_ & 0xff00ff) * i_628_ & ~0xff00ff);
										i_631_ = ((i_636_ & 0xff00) * i_628_ & 0xff0000);
										is[i_552_] = (((i_630_ | i_631_) >>> 8) + i_540_);
									}
									if (bool_534_ && bool_543_)
										fs[i_552_] = f;
								}
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_632_;
						i_552_ += i_553_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_541_ == 2) {
				if (i_539_ == 1) {
					int i_637_ = i_544_;
					for (int i_638_ = -i_538_; i_638_ < 0; i_638_++) {
						int i_639_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_640_ = -i_537_; i_640_ < 0; i_640_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								int i_641_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_639_]);
								if (i_641_ != 0) {
									if (bool) {
										int i_642_ = is[i_552_];
										int i_643_ = i_641_ + i_642_;
										int i_644_ = ((i_641_ & 0xff00ff) + (i_642_ & 0xff00ff));
										i_642_ = ((i_644_ & 0x1000100) + (i_643_ - i_644_ & 0x10000));
										is[i_552_] = (i_643_ - i_642_ | i_642_ - (i_642_ >>> 8));
									}
									if (bool_534_ && bool_543_)
										fs[i_552_] = f;
								}
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_637_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 0) {
					int i_645_ = i_544_;
					int i_646_ = (i_540_ & 0xff0000) >> 16;
					int i_647_ = (i_540_ & 0xff00) >> 8;
					int i_648_ = i_540_ & 0xff;
					for (int i_649_ = -i_538_; i_649_ < 0; i_649_++) {
						int i_650_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_651_ = -i_537_; i_651_ < 0; i_651_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								int i_652_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_650_]);
								if (i_652_ != 0) {
									if (bool) {
										int i_653_ = ((i_652_ & 0xff0000) * i_646_ & ~0xffffff);
										int i_654_ = ((i_652_ & 0xff00) * i_647_ & 0xff0000);
										int i_655_ = ((i_652_ & 0xff) * i_648_ & 0xff00);
										i_652_ = (i_653_ | i_654_ | i_655_) >>> 8;
										int i_656_ = is[i_552_];
										int i_657_ = i_652_ + i_656_;
										int i_658_ = ((i_652_ & 0xff00ff) + (i_656_ & 0xff00ff));
										i_656_ = ((i_658_ & 0x1000100) + (i_657_ - i_658_ & 0x10000));
										is[i_552_] = (i_657_ - i_656_ | i_656_ - (i_656_ >>> 8));
									}
									if (bool_534_ && bool_543_)
										fs[i_552_] = f;
								}
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_645_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 3) {
					int i_659_ = i_544_;
					for (int i_660_ = -i_538_; i_660_ < 0; i_660_++) {
						int i_661_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_662_ = -i_537_; i_662_ < 0; i_662_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								if (bool) {
									int i_663_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_661_]);
									int i_664_ = i_663_ + i_540_;
									int i_665_ = ((i_663_ & 0xff00ff) + (i_540_ & 0xff00ff));
									int i_666_ = ((i_665_ & 0x1000100) + (i_664_ - i_665_ & 0x10000));
									i_663_ = i_664_ - i_666_ | i_666_ - (i_666_ >>> 8);
									i_666_ = is[i_552_];
									i_664_ = i_663_ + i_666_;
									i_665_ = (i_663_ & 0xff00ff) + (i_666_ & 0xff00ff);
									i_666_ = ((i_665_ & 0x1000100) + (i_664_ - i_665_ & 0x10000));
									is[i_552_] = i_664_ - i_666_ | i_666_ - (i_666_ >>> 8);
								}
								if (bool_534_ && bool_543_)
									fs[i_552_] = f;
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_659_;
						i_552_ += i_553_;
					}
				} else if (i_539_ == 2) {
					int i_667_ = i_540_ >>> 24;
					int i_668_ = 256 - i_667_;
					int i_669_ = (i_540_ & 0xff00ff) * i_668_ & ~0xff00ff;
					int i_670_ = (i_540_ & 0xff00) * i_668_ & 0xff0000;
					i_540_ = (i_669_ | i_670_) >>> 8;
					int i_671_ = i_544_;
					for (int i_672_ = -i_538_; i_672_ < 0; i_672_++) {
						int i_673_ = ((i_545_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_674_ = -i_537_; i_674_ < 0; i_674_++) {
							if (!bool_534_ || f < fs[i_552_]) {
								int i_675_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_544_ >> 16) + i_673_]);
								if (i_675_ != 0) {
									if (bool) {
										i_669_ = ((i_675_ & 0xff00ff) * i_667_ & ~0xff00ff);
										i_670_ = ((i_675_ & 0xff00) * i_667_ & 0xff0000);
										i_675_ = (((i_669_ | i_670_) >>> 8) + i_540_);
										int i_676_ = is[i_552_];
										int i_677_ = i_675_ + i_676_;
										int i_678_ = ((i_675_ & 0xff00ff) + (i_676_ & 0xff00ff));
										i_676_ = ((i_678_ & 0x1000100) + (i_677_ - i_678_ & 0x10000));
										is[i_552_] = (i_677_ - i_676_ | i_676_ - (i_676_ >>> 8));
									}
									if (bool_534_ && bool_543_)
										fs[i_552_] = f;
								}
							}
							i_544_ += i_548_;
							i_552_++;
						}
						i_545_ += i_549_;
						i_544_ = i_671_;
						i_552_ += i_553_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method756(int i, int i_679_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_680_ = anInt9356;
					while (i_680_ < 0) {
						int i_681_ = anInt9339;
						int i_682_ = anInt9346;
						int i_683_ = anInt9324;
						int i_684_ = anInt9347;
						if (i_682_ >= 0 && i_683_ >= 0 && i_682_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0 && i_683_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							for (/**/; i_684_ < 0; i_684_++)
								method757(((i_683_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_682_ >> 12), i_681_++, is, i, i_679_);
						}
						i_680_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_685_ = anInt9356;
					while (i_685_ < 0) {
						int i_686_ = anInt9339;
						int i_687_ = anInt9346;
						int i_688_ = anInt9324 + anInt9349;
						int i_689_ = anInt9347;
						if (i_687_ >= 0 && i_687_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0) {
							int i_690_;
							if ((i_690_ = i_688_ - ((((Class61_Sub3_Sub1) this).anInt9325) << 12)) >= 0) {
								i_690_ = (anInt9341 - i_690_) / anInt9341;
								i_689_ += i_690_;
								i_688_ += anInt9341 * i_690_;
								i_686_ += i_690_;
							}
							if ((i_690_ = (i_688_ - anInt9341) / anInt9341) > i_689_)
								i_689_ = i_690_;
							for (/**/; i_689_ < 0; i_689_++) {
								method757(((i_688_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_687_ >> 12), i_686_++, is, i, i_679_);
								i_688_ += anInt9341;
							}
						}
						i_685_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_691_ = anInt9356;
					while (i_691_ < 0) {
						int i_692_ = anInt9339;
						int i_693_ = anInt9346;
						int i_694_ = anInt9324 + anInt9349;
						int i_695_ = anInt9347;
						if (i_693_ >= 0 && i_693_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0) {
							if (i_694_ < 0) {
								int i_696_ = (anInt9341 - 1 - i_694_) / anInt9341;
								i_695_ += i_696_;
								i_694_ += anInt9341 * i_696_;
								i_692_ += i_696_;
							}
							int i_697_;
							if ((i_697_ = (1 + i_694_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_695_)
								i_695_ = i_697_;
							for (/**/; i_695_ < 0; i_695_++) {
								method757(((i_694_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_693_ >> 12), i_692_++, is, i, i_679_);
								i_694_ += anInt9341;
							}
						}
						i_691_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_698_ = anInt9356;
					while (i_698_ < 0) {
						int i_699_ = anInt9339;
						int i_700_ = anInt9346 + anInt9348;
						int i_701_ = anInt9324;
						int i_702_ = anInt9347;
						if (i_701_ >= 0 && i_701_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							int i_703_;
							if ((i_703_ = i_700_ - ((((Class61_Sub3_Sub1) this).anInt9358) << 12)) >= 0) {
								i_703_ = (anInt9340 - i_703_) / anInt9340;
								i_702_ += i_703_;
								i_700_ += anInt9340 * i_703_;
								i_699_ += i_703_;
							}
							if ((i_703_ = (i_700_ - anInt9340) / anInt9340) > i_702_)
								i_702_ = i_703_;
							for (/**/; i_702_ < 0; i_702_++) {
								method757(((i_701_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_700_ >> 12), i_699_++, is, i, i_679_);
								i_700_ += anInt9340;
							}
						}
						i_698_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_704_ = anInt9356;
					while (i_704_ < 0) {
						int i_705_ = anInt9339;
						int i_706_ = anInt9346 + anInt9348;
						int i_707_ = anInt9324 + anInt9349;
						int i_708_ = anInt9347;
						int i_709_;
						if ((i_709_ = i_706_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) >= 0) {
							i_709_ = (anInt9340 - i_709_) / anInt9340;
							i_708_ += i_709_;
							i_706_ += anInt9340 * i_709_;
							i_707_ += anInt9341 * i_709_;
							i_705_ += i_709_;
						}
						if ((i_709_ = (i_706_ - anInt9340) / anInt9340) > i_708_)
							i_708_ = i_709_;
						if ((i_709_ = i_707_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_709_ = (anInt9341 - i_709_) / anInt9341;
							i_708_ += i_709_;
							i_706_ += anInt9340 * i_709_;
							i_707_ += anInt9341 * i_709_;
							i_705_ += i_709_;
						}
						if ((i_709_ = (i_707_ - anInt9341) / anInt9341) > i_708_)
							i_708_ = i_709_;
						for (/**/; i_708_ < 0; i_708_++) {
							method757((((i_707_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_706_ >> 12)), i_705_++, is, i, i_679_);
							i_706_ += anInt9340;
							i_707_ += anInt9341;
						}
						i_704_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_710_ = anInt9356;
					while (i_710_ < 0) {
						int i_711_ = anInt9339;
						int i_712_ = anInt9346 + anInt9348;
						int i_713_ = anInt9324 + anInt9349;
						int i_714_ = anInt9347;
						int i_715_;
						if ((i_715_ = i_712_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) >= 0) {
							i_715_ = (anInt9340 - i_715_) / anInt9340;
							i_714_ += i_715_;
							i_712_ += anInt9340 * i_715_;
							i_713_ += anInt9341 * i_715_;
							i_711_ += i_715_;
						}
						if ((i_715_ = (i_712_ - anInt9340) / anInt9340) > i_714_)
							i_714_ = i_715_;
						if (i_713_ < 0) {
							i_715_ = (anInt9341 - 1 - i_713_) / anInt9341;
							i_714_ += i_715_;
							i_712_ += anInt9340 * i_715_;
							i_713_ += anInt9341 * i_715_;
							i_711_ += i_715_;
						}
						if ((i_715_ = (1 + i_713_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_714_)
							i_714_ = i_715_;
						for (/**/; i_714_ < 0; i_714_++) {
							method757((((i_713_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_712_ >> 12)), i_711_++, is, i, i_679_);
							i_712_ += anInt9340;
							i_713_ += anInt9341;
						}
						i_710_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_716_ = anInt9356;
				while (i_716_ < 0) {
					int i_717_ = anInt9339;
					int i_718_ = anInt9346 + anInt9348;
					int i_719_ = anInt9324;
					int i_720_ = anInt9347;
					if (i_719_ >= 0 && i_719_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
						if (i_718_ < 0) {
							int i_721_ = (anInt9340 - 1 - i_718_) / anInt9340;
							i_720_ += i_721_;
							i_718_ += anInt9340 * i_721_;
							i_717_ += i_721_;
						}
						int i_722_;
						if ((i_722_ = (1 + i_718_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_720_)
							i_720_ = i_722_;
						for (/**/; i_720_ < 0; i_720_++) {
							method757((((i_719_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_718_ >> 12)), i_717_++, is, i, i_679_);
							i_718_ += anInt9340;
						}
					}
					i_716_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_723_ = anInt9356; i_723_ < 0; i_723_++) {
					int i_724_ = anInt9339;
					int i_725_ = anInt9346 + anInt9348;
					int i_726_ = anInt9324 + anInt9349;
					int i_727_ = anInt9347;
					if (i_725_ < 0) {
						int i_728_ = (anInt9340 - 1 - i_725_) / anInt9340;
						i_727_ += i_728_;
						i_725_ += anInt9340 * i_728_;
						i_726_ += anInt9341 * i_728_;
						i_724_ += i_728_;
					}
					int i_729_;
					if ((i_729_ = (1 + i_725_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_727_)
						i_727_ = i_729_;
					if ((i_729_ = i_726_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
						i_729_ = (anInt9341 - i_729_) / anInt9341;
						i_727_ += i_729_;
						i_725_ += anInt9340 * i_729_;
						i_726_ += anInt9341 * i_729_;
						i_724_ += i_729_;
					}
					if ((i_729_ = (i_726_ - anInt9341) / anInt9341) > i_727_)
						i_727_ = i_729_;
					for (/**/; i_727_ < 0; i_727_++) {
						method757((((i_726_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_725_ >> 12)), i_724_++, is, i, i_679_);
						i_725_ += anInt9340;
						i_726_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_730_ = anInt9356; i_730_ < 0; i_730_++) {
					int i_731_ = anInt9339;
					int i_732_ = anInt9346 + anInt9348;
					int i_733_ = anInt9324 + anInt9349;
					int i_734_ = anInt9347;
					if (i_732_ < 0) {
						int i_735_ = (anInt9340 - 1 - i_732_) / anInt9340;
						i_734_ += i_735_;
						i_732_ += anInt9340 * i_735_;
						i_733_ += anInt9341 * i_735_;
						i_731_ += i_735_;
					}
					int i_736_;
					if ((i_736_ = (1 + i_732_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_734_)
						i_734_ = i_736_;
					if (i_733_ < 0) {
						i_736_ = (anInt9341 - 1 - i_733_) / anInt9341;
						i_734_ += i_736_;
						i_732_ += anInt9340 * i_736_;
						i_733_ += anInt9341 * i_736_;
						i_731_ += i_736_;
					}
					if ((i_736_ = (1 + i_733_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_734_)
						i_734_ = i_736_;
					for (/**/; i_734_ < 0; i_734_++) {
						method757((((i_733_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_732_ >> 12)), i_731_++, is, i, i_679_);
						i_732_ += anInt9340;
						i_733_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method745(int[] is, int[] is_737_, int i, int i_738_) {
		int[] is_739_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_739_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_740_ = anInt9356;
					while (i_740_ < 0) {
						int i_741_ = i_740_ + i_738_;
						if (i_741_ >= 0) {
							if (i_741_ >= is.length)
								break;
							int i_742_ = anInt9339;
							int i_743_ = anInt9346;
							int i_744_ = anInt9324;
							int i_745_ = anInt9347;
							if (i_743_ >= 0 && i_744_ >= 0 && (i_743_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0 && (i_744_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_746_ = is[i_741_] - i;
								int i_747_ = -is_737_[i_741_];
								int i_748_ = i_746_ - (i_742_ - anInt9339);
								if (i_748_ > 0) {
									i_742_ += i_748_;
									i_745_ += i_748_;
									i_743_ += anInt9340 * i_748_;
									i_744_ += anInt9341 * i_748_;
								} else
									i_747_ -= i_748_;
								if (i_745_ < i_747_)
									i_745_ = i_747_;
								for (/**/; i_745_ < 0; i_745_++) {
									int i_749_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_744_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_743_ >> 12))]);
									if (i_749_ != 0)
										is_739_[i_742_++] = i_749_;
									else
										i_742_++;
								}
							}
						}
						i_740_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_750_ = anInt9356;
					while (i_750_ < 0) {
						int i_751_ = i_750_ + i_738_;
						if (i_751_ >= 0) {
							if (i_751_ >= is.length)
								break;
							int i_752_ = anInt9339;
							int i_753_ = anInt9346;
							int i_754_ = anInt9324 + anInt9349;
							int i_755_ = anInt9347;
							if (i_753_ >= 0 && (i_753_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								int i_756_;
								if ((i_756_ = (i_754_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
									i_756_ = (anInt9341 - i_756_) / anInt9341;
									i_755_ += i_756_;
									i_754_ += anInt9341 * i_756_;
									i_752_ += i_756_;
								}
								if ((i_756_ = (i_754_ - anInt9341) / anInt9341) > i_755_)
									i_755_ = i_756_;
								int i_757_ = is[i_751_] - i;
								int i_758_ = -is_737_[i_751_];
								int i_759_ = i_757_ - (i_752_ - anInt9339);
								if (i_759_ > 0) {
									i_752_ += i_759_;
									i_755_ += i_759_;
									i_753_ += anInt9340 * i_759_;
									i_754_ += anInt9341 * i_759_;
								} else
									i_758_ -= i_759_;
								if (i_755_ < i_758_)
									i_755_ = i_758_;
								for (/**/; i_755_ < 0; i_755_++) {
									int i_760_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_754_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_753_ >> 12))]);
									if (i_760_ != 0)
										is_739_[i_752_++] = i_760_;
									else
										i_752_++;
									i_754_ += anInt9341;
								}
							}
						}
						i_750_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_761_ = anInt9356;
					while (i_761_ < 0) {
						int i_762_ = i_761_ + i_738_;
						if (i_762_ >= 0) {
							if (i_762_ >= is.length)
								break;
							int i_763_ = anInt9339;
							int i_764_ = anInt9346;
							int i_765_ = anInt9324 + anInt9349;
							int i_766_ = anInt9347;
							if (i_764_ >= 0 && (i_764_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								if (i_765_ < 0) {
									int i_767_ = (anInt9341 - 1 - i_765_) / anInt9341;
									i_766_ += i_767_;
									i_765_ += anInt9341 * i_767_;
									i_763_ += i_767_;
								}
								int i_768_;
								if ((i_768_ = (1 + i_765_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_766_)
									i_766_ = i_768_;
								int i_769_ = is[i_762_] - i;
								int i_770_ = -is_737_[i_762_];
								int i_771_ = i_769_ - (i_763_ - anInt9339);
								if (i_771_ > 0) {
									i_763_ += i_771_;
									i_766_ += i_771_;
									i_764_ += anInt9340 * i_771_;
									i_765_ += anInt9341 * i_771_;
								} else
									i_770_ -= i_771_;
								if (i_766_ < i_770_)
									i_766_ = i_770_;
								for (/**/; i_766_ < 0; i_766_++) {
									int i_772_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_765_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_764_ >> 12))]);
									if (i_772_ != 0)
										is_739_[i_763_++] = i_772_;
									else
										i_763_++;
									i_765_ += anInt9341;
								}
							}
						}
						i_761_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_773_ = anInt9356;
					while (i_773_ < 0) {
						int i_774_ = i_773_ + i_738_;
						if (i_774_ >= 0) {
							if (i_774_ >= is.length)
								break;
							int i_775_ = anInt9339;
							int i_776_ = anInt9346 + anInt9348;
							int i_777_ = anInt9324;
							int i_778_ = anInt9347;
							if (i_777_ >= 0 && (i_777_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_779_;
								if ((i_779_ = (i_776_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
									i_779_ = (anInt9340 - i_779_) / anInt9340;
									i_778_ += i_779_;
									i_776_ += anInt9340 * i_779_;
									i_775_ += i_779_;
								}
								if ((i_779_ = (i_776_ - anInt9340) / anInt9340) > i_778_)
									i_778_ = i_779_;
								int i_780_ = is[i_774_] - i;
								int i_781_ = -is_737_[i_774_];
								int i_782_ = i_780_ - (i_775_ - anInt9339);
								if (i_782_ > 0) {
									i_775_ += i_782_;
									i_778_ += i_782_;
									i_776_ += anInt9340 * i_782_;
									i_777_ += anInt9341 * i_782_;
								} else
									i_781_ -= i_782_;
								if (i_778_ < i_781_)
									i_778_ = i_781_;
								for (/**/; i_778_ < 0; i_778_++) {
									int i_783_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_777_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_776_ >> 12))]);
									if (i_783_ != 0)
										is_739_[i_775_++] = i_783_;
									else
										i_775_++;
									i_776_ += anInt9340;
								}
							}
						}
						i_773_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_784_ = anInt9356;
					while (i_784_ < 0) {
						int i_785_ = i_784_ + i_738_;
						if (i_785_ >= 0) {
							if (i_785_ >= is.length)
								break;
							int i_786_ = anInt9339;
							int i_787_ = anInt9346 + anInt9348;
							int i_788_ = anInt9324 + anInt9349;
							int i_789_ = anInt9347;
							int i_790_;
							if ((i_790_ = i_787_ - ((((Class61_Sub3_Sub1) this).anInt9358) << 12)) >= 0) {
								i_790_ = (anInt9340 - i_790_) / anInt9340;
								i_789_ += i_790_;
								i_787_ += anInt9340 * i_790_;
								i_788_ += anInt9341 * i_790_;
								i_786_ += i_790_;
							}
							if ((i_790_ = (i_787_ - anInt9340) / anInt9340) > i_789_)
								i_789_ = i_790_;
							if ((i_790_ = i_788_ - ((((Class61_Sub3_Sub1) this).anInt9325) << 12)) >= 0) {
								i_790_ = (anInt9341 - i_790_) / anInt9341;
								i_789_ += i_790_;
								i_787_ += anInt9340 * i_790_;
								i_788_ += anInt9341 * i_790_;
								i_786_ += i_790_;
							}
							if ((i_790_ = (i_788_ - anInt9341) / anInt9341) > i_789_)
								i_789_ = i_790_;
							int i_791_ = is[i_785_] - i;
							int i_792_ = -is_737_[i_785_];
							int i_793_ = i_791_ - (i_786_ - anInt9339);
							if (i_793_ > 0) {
								i_786_ += i_793_;
								i_789_ += i_793_;
								i_787_ += anInt9340 * i_793_;
								i_788_ += anInt9341 * i_793_;
							} else
								i_792_ -= i_793_;
							if (i_789_ < i_792_)
								i_789_ = i_792_;
							for (/**/; i_789_ < 0; i_789_++) {
								int i_794_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_788_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_787_ >> 12))]);
								if (i_794_ != 0)
									is_739_[i_786_++] = i_794_;
								else
									i_786_++;
								i_787_ += anInt9340;
								i_788_ += anInt9341;
							}
						}
						i_784_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_795_ = anInt9356;
					while (i_795_ < 0) {
						int i_796_ = i_795_ + i_738_;
						if (i_796_ >= 0) {
							if (i_796_ >= is.length)
								break;
							int i_797_ = anInt9339;
							int i_798_ = anInt9346 + anInt9348;
							int i_799_ = anInt9324 + anInt9349;
							int i_800_ = anInt9347;
							int i_801_;
							if ((i_801_ = i_798_ - ((((Class61_Sub3_Sub1) this).anInt9358) << 12)) >= 0) {
								i_801_ = (anInt9340 - i_801_) / anInt9340;
								i_800_ += i_801_;
								i_798_ += anInt9340 * i_801_;
								i_799_ += anInt9341 * i_801_;
								i_797_ += i_801_;
							}
							if ((i_801_ = (i_798_ - anInt9340) / anInt9340) > i_800_)
								i_800_ = i_801_;
							if (i_799_ < 0) {
								i_801_ = (anInt9341 - 1 - i_799_) / anInt9341;
								i_800_ += i_801_;
								i_798_ += anInt9340 * i_801_;
								i_799_ += anInt9341 * i_801_;
								i_797_ += i_801_;
							}
							if ((i_801_ = (1 + i_799_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_800_)
								i_800_ = i_801_;
							int i_802_ = is[i_796_] - i;
							int i_803_ = -is_737_[i_796_];
							int i_804_ = i_802_ - (i_797_ - anInt9339);
							if (i_804_ > 0) {
								i_797_ += i_804_;
								i_800_ += i_804_;
								i_798_ += anInt9340 * i_804_;
								i_799_ += anInt9341 * i_804_;
							} else
								i_803_ -= i_804_;
							if (i_800_ < i_803_)
								i_800_ = i_803_;
							for (/**/; i_800_ < 0; i_800_++) {
								int i_805_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_799_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_798_ >> 12))]);
								if (i_805_ != 0)
									is_739_[i_797_++] = i_805_;
								else
									i_797_++;
								i_798_ += anInt9340;
								i_799_ += anInt9341;
							}
						}
						i_795_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_806_ = anInt9356;
				while (i_806_ < 0) {
					int i_807_ = i_806_ + i_738_;
					if (i_807_ >= 0) {
						if (i_807_ >= is.length)
							break;
						int i_808_ = anInt9339;
						int i_809_ = anInt9346 + anInt9348;
						int i_810_ = anInt9324;
						int i_811_ = anInt9347;
						if (i_810_ >= 0 && i_810_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							if (i_809_ < 0) {
								int i_812_ = (anInt9340 - 1 - i_809_) / anInt9340;
								i_811_ += i_812_;
								i_809_ += anInt9340 * i_812_;
								i_808_ += i_812_;
							}
							int i_813_;
							if ((i_813_ = (1 + i_809_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_811_)
								i_811_ = i_813_;
							int i_814_ = is[i_807_] - i;
							int i_815_ = -is_737_[i_807_];
							int i_816_ = i_814_ - (i_808_ - anInt9339);
							if (i_816_ > 0) {
								i_808_ += i_816_;
								i_811_ += i_816_;
								i_809_ += anInt9340 * i_816_;
								i_810_ += anInt9341 * i_816_;
							} else
								i_815_ -= i_816_;
							if (i_811_ < i_815_)
								i_811_ = i_815_;
							for (/**/; i_811_ < 0; i_811_++) {
								int i_817_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_810_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_809_ >> 12))]);
								if (i_817_ != 0)
									is_739_[i_808_++] = i_817_;
								else
									i_808_++;
								i_809_ += anInt9340;
							}
						}
					}
					i_806_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_818_ = anInt9356;
				while (i_818_ < 0) {
					int i_819_ = i_818_ + i_738_;
					if (i_819_ >= 0) {
						if (i_819_ >= is.length)
							break;
						int i_820_ = anInt9339;
						int i_821_ = anInt9346 + anInt9348;
						int i_822_ = anInt9324 + anInt9349;
						int i_823_ = anInt9347;
						if (i_821_ < 0) {
							int i_824_ = (anInt9340 - 1 - i_821_) / anInt9340;
							i_823_ += i_824_;
							i_821_ += anInt9340 * i_824_;
							i_822_ += anInt9341 * i_824_;
							i_820_ += i_824_;
						}
						int i_825_;
						if ((i_825_ = (1 + i_821_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_823_)
							i_823_ = i_825_;
						if ((i_825_ = i_822_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_825_ = (anInt9341 - i_825_) / anInt9341;
							i_823_ += i_825_;
							i_821_ += anInt9340 * i_825_;
							i_822_ += anInt9341 * i_825_;
							i_820_ += i_825_;
						}
						if ((i_825_ = (i_822_ - anInt9341) / anInt9341) > i_823_)
							i_823_ = i_825_;
						int i_826_ = is[i_819_] - i;
						int i_827_ = -is_737_[i_819_];
						int i_828_ = i_826_ - (i_820_ - anInt9339);
						if (i_828_ > 0) {
							i_820_ += i_828_;
							i_823_ += i_828_;
							i_821_ += anInt9340 * i_828_;
							i_822_ += anInt9341 * i_828_;
						} else
							i_827_ -= i_828_;
						if (i_823_ < i_827_)
							i_823_ = i_827_;
						for (/**/; i_823_ < 0; i_823_++) {
							int i_829_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_822_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_821_ >> 12))]);
							if (i_829_ != 0)
								is_739_[i_820_++] = i_829_;
							else
								i_820_++;
							i_821_ += anInt9340;
							i_822_ += anInt9341;
						}
					}
					i_818_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_830_ = anInt9356;
				while (i_830_ < 0) {
					int i_831_ = i_830_ + i_738_;
					if (i_831_ >= 0) {
						if (i_831_ >= is.length)
							break;
						int i_832_ = anInt9339;
						int i_833_ = anInt9346 + anInt9348;
						int i_834_ = anInt9324 + anInt9349;
						int i_835_ = anInt9347;
						if (i_833_ < 0) {
							int i_836_ = (anInt9340 - 1 - i_833_) / anInt9340;
							i_835_ += i_836_;
							i_833_ += anInt9340 * i_836_;
							i_834_ += anInt9341 * i_836_;
							i_832_ += i_836_;
						}
						int i_837_;
						if ((i_837_ = (1 + i_833_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_835_)
							i_835_ = i_837_;
						if (i_834_ < 0) {
							i_837_ = (anInt9341 - 1 - i_834_) / anInt9341;
							i_835_ += i_837_;
							i_833_ += anInt9340 * i_837_;
							i_834_ += anInt9341 * i_837_;
							i_832_ += i_837_;
						}
						if ((i_837_ = (1 + i_834_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_835_)
							i_835_ = i_837_;
						int i_838_ = is[i_831_] - i;
						int i_839_ = -is_737_[i_831_];
						int i_840_ = i_838_ - (i_832_ - anInt9339);
						if (i_840_ > 0) {
							i_832_ += i_840_;
							i_835_ += i_840_;
							i_833_ += anInt9340 * i_840_;
							i_834_ += anInt9341 * i_840_;
						} else
							i_839_ -= i_840_;
						if (i_835_ < i_839_)
							i_835_ = i_839_;
						for (/**/; i_835_ < 0; i_835_++) {
							int i_841_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_834_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_833_ >> 12))]);
							if (i_841_ != 0)
								is_739_[i_832_++] = i_841_;
							else
								i_832_++;
							i_833_ += anInt9340;
							i_834_ += anInt9341;
						}
					}
					i_830_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	Class61_Sub3_Sub1(Class_ra_Sub3 class_ra_sub3, int[] is, int i, int i_842_, int i_843_, int i_844_, boolean bool) {
		super(class_ra_sub3, i_843_, i_844_);
		if (bool)
			((Class61_Sub3_Sub1) this).anIntArray10093 = new int[i_843_ * i_844_];
		else
			((Class61_Sub3_Sub1) this).anIntArray10093 = is;
		i_842_ -= ((Class61_Sub3_Sub1) this).anInt9358;
		int i_845_ = 0;
		for (int i_846_ = 0; i_846_ < i_844_; i_846_++) {
			for (int i_847_ = 0; i_847_ < i_843_; i_847_++) {
				int i_848_ = is[i++];
				if (i_848_ >>> 24 == 255)
					((Class61_Sub3_Sub1) this).anIntArray10093[i_845_++] = (i_848_ & 0xffffff) == 0 ? -16777215 : i_848_;
				else
					((Class61_Sub3_Sub1) this).anIntArray10093[i_845_++] = 0;
			}
			i += i_842_;
		}
	}

	Class61_Sub3_Sub1(Class_ra_Sub3 class_ra_sub3, int i, int i_849_) {
		super(class_ra_sub3, i, i_849_);
		((Class61_Sub3_Sub1) this).anIntArray10093 = new int[i * i_849_];
	}

	public void method705(int i, int i_850_, int i_851_) {
		throw new IllegalStateException("");
	}

	public Interface8_Impl1_Impl2 method713() {
		return new Class12(((Class61_Sub3_Sub1) this).anInt9358, ((Class61_Sub3_Sub1) this).anInt9325, ((Class61_Sub3_Sub1) this).anIntArray10093);
	}

	void method706(int i, int i_852_, int i_853_, int i_854_, int i_855_, int i_856_, int i_857_, int i_858_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_853_ > 0 && i_854_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_859_ = 0;
				int i_860_ = 0;
				int i_861_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_862_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
				int i_863_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
				int i_864_ = (i_862_ << 16) / i_853_;
				int i_865_ = (i_863_ << 16) / i_854_;
				if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
					int i_866_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_864_ - 1) / i_864_);
					i += i_866_;
					i_859_ += (i_866_ * i_864_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
					int i_867_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_865_ - 1) / i_865_);
					i_852_ += i_867_;
					i_860_ += (i_867_ * i_865_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9358 < i_862_)
					i_853_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_859_ + i_864_ - 1) / i_864_;
				if (((Class61_Sub3_Sub1) this).anInt9325 < i_863_)
					i_854_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_860_ + i_865_ - 1) / i_865_;
				int i_868_ = i + i_852_ * i_861_;
				int i_869_ = i_861_ - i_853_;
				if (i_852_ + i_854_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_854_ -= (i_852_ + i_854_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_852_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_870_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_852_);
					i_854_ -= i_870_;
					i_868_ += i_870_ * i_861_;
					i_860_ += i_865_ * i_870_;
				}
				if (i + i_853_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_871_ = (i + i_853_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_853_ -= i_871_;
					i_869_ += i_871_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_872_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
					i_853_ -= i_872_;
					i_868_ += i_872_;
					i_859_ += i_864_ * i_872_;
					i_869_ += i_872_;
				}
				if (i_857_ == 0) {
					if (i_855_ == 1) {
						int i_873_ = i_859_;
						for (int i_874_ = -i_854_; i_874_ < 0; i_874_++) {
							int i_875_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_876_ = -i_853_; i_876_ < 0; i_876_++) {
								is[i_868_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_875_]);
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_873_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 0) {
						int i_877_ = (i_856_ & 0xff0000) >> 16;
						int i_878_ = (i_856_ & 0xff00) >> 8;
						int i_879_ = i_856_ & 0xff;
						int i_880_ = i_859_;
						for (int i_881_ = -i_854_; i_881_ < 0; i_881_++) {
							int i_882_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_883_ = -i_853_; i_883_ < 0; i_883_++) {
								int i_884_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_882_]);
								int i_885_ = (i_884_ & 0xff0000) * i_877_ & ~0xffffff;
								int i_886_ = (i_884_ & 0xff00) * i_878_ & 0xff0000;
								int i_887_ = (i_884_ & 0xff) * i_879_ & 0xff00;
								is[i_868_++] = (i_885_ | i_886_ | i_887_) >>> 8;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_880_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 3) {
						int i_888_ = i_859_;
						for (int i_889_ = -i_854_; i_889_ < 0; i_889_++) {
							int i_890_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_891_ = -i_853_; i_891_ < 0; i_891_++) {
								int i_892_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_890_]);
								int i_893_ = i_892_ + i_856_;
								int i_894_ = ((i_892_ & 0xff00ff) + (i_856_ & 0xff00ff));
								int i_895_ = ((i_894_ & 0x1000100) + (i_893_ - i_894_ & 0x10000));
								is[i_868_++] = i_893_ - i_895_ | i_895_ - (i_895_ >>> 8);
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_888_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 2) {
						int i_896_ = i_856_ >>> 24;
						int i_897_ = 256 - i_896_;
						int i_898_ = (i_856_ & 0xff00ff) * i_897_ & ~0xff00ff;
						int i_899_ = (i_856_ & 0xff00) * i_897_ & 0xff0000;
						i_856_ = (i_898_ | i_899_) >>> 8;
						int i_900_ = i_859_;
						for (int i_901_ = -i_854_; i_901_ < 0; i_901_++) {
							int i_902_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_903_ = -i_853_; i_903_ < 0; i_903_++) {
								int i_904_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_902_]);
								i_898_ = (i_904_ & 0xff00ff) * i_896_ & ~0xff00ff;
								i_899_ = (i_904_ & 0xff00) * i_896_ & 0xff0000;
								is[i_868_++] = ((i_898_ | i_899_) >>> 8) + i_856_;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_900_;
							i_868_ += i_869_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_857_ == 1) {
					if (i_855_ == 1) {
						int i_905_ = i_859_;
						for (int i_906_ = -i_854_; i_906_ < 0; i_906_++) {
							int i_907_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_908_ = -i_853_; i_908_ < 0; i_908_++) {
								int i_909_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_907_]);
								if (i_909_ != 0)
									is[i_868_++] = i_909_;
								else
									i_868_++;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_905_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 0) {
						int i_910_ = i_859_;
						if ((i_856_ & 0xffffff) == 16777215) {
							int i_911_ = i_856_ >>> 24;
							int i_912_ = 256 - i_911_;
							for (int i_913_ = -i_854_; i_913_ < 0; i_913_++) {
								int i_914_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_915_ = -i_853_; i_915_ < 0; i_915_++) {
									int i_916_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_914_]);
									if (i_916_ != 0) {
										int i_917_ = is[i_868_];
										is[i_868_++] = ((((i_916_ & 0xff00ff) * i_911_ + ((i_917_ & 0xff00ff) * i_912_)) & ~0xff00ff) + (((i_916_ & 0xff00) * i_911_ + ((i_917_ & 0xff00) * i_912_)) & 0xff0000)) >> 8;
									} else
										i_868_++;
									i_859_ += i_864_;
								}
								i_860_ += i_865_;
								i_859_ = i_910_;
								i_868_ += i_869_;
							}
						} else {
							int i_918_ = (i_856_ & 0xff0000) >> 16;
							int i_919_ = (i_856_ & 0xff00) >> 8;
							int i_920_ = i_856_ & 0xff;
							int i_921_ = i_856_ >>> 24;
							int i_922_ = 256 - i_921_;
							for (int i_923_ = -i_854_; i_923_ < 0; i_923_++) {
								int i_924_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_925_ = -i_853_; i_925_ < 0; i_925_++) {
									int i_926_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_924_]);
									if (i_926_ != 0) {
										if (i_921_ != 255) {
											int i_927_ = ((i_926_ & 0xff0000) * i_918_ & ~0xffffff);
											int i_928_ = ((i_926_ & 0xff00) * i_919_ & 0xff0000);
											int i_929_ = ((i_926_ & 0xff) * i_920_ & 0xff00);
											i_926_ = (i_927_ | i_928_ | i_929_) >>> 8;
											int i_930_ = is[i_868_];
											is[i_868_++] = (((((i_926_ & 0xff00ff) * i_921_) + ((i_930_ & 0xff00ff) * i_922_)) & ~0xff00ff) + ((((i_926_ & 0xff00) * i_921_) + ((i_930_ & 0xff00) * i_922_)) & 0xff0000)) >> 8;
										} else {
											int i_931_ = ((i_926_ & 0xff0000) * i_918_ & ~0xffffff);
											int i_932_ = ((i_926_ & 0xff00) * i_919_ & 0xff0000);
											int i_933_ = ((i_926_ & 0xff) * i_920_ & 0xff00);
											is[i_868_++] = (i_931_ | i_932_ | i_933_) >>> 8;
										}
									} else
										i_868_++;
									i_859_ += i_864_;
								}
								i_860_ += i_865_;
								i_859_ = i_910_;
								i_868_ += i_869_;
							}
						}
					} else if (i_855_ == 3) {
						int i_934_ = i_859_;
						int i_935_ = i_856_ >>> 24;
						int i_936_ = 256 - i_935_;
						for (int i_937_ = -i_854_; i_937_ < 0; i_937_++) {
							int i_938_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_939_ = -i_853_; i_939_ < 0; i_939_++) {
								int i_940_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_938_]);
								int i_941_ = i_940_ + i_856_;
								int i_942_ = ((i_940_ & 0xff00ff) + (i_856_ & 0xff00ff));
								int i_943_ = ((i_942_ & 0x1000100) + (i_941_ - i_942_ & 0x10000));
								i_943_ = i_941_ - i_943_ | i_943_ - (i_943_ >>> 8);
								if (i_940_ == 0 && i_935_ != 255) {
									i_940_ = i_943_;
									i_943_ = is[i_868_];
									i_943_ = ((((i_940_ & 0xff00ff) * i_935_ + (i_943_ & 0xff00ff) * i_936_) & ~0xff00ff) + (((i_940_ & 0xff00) * i_935_ + (i_943_ & 0xff00) * i_936_) & 0xff0000)) >> 8;
								}
								is[i_868_++] = i_943_;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_934_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 2) {
						int i_944_ = i_856_ >>> 24;
						int i_945_ = 256 - i_944_;
						int i_946_ = (i_856_ & 0xff00ff) * i_945_ & ~0xff00ff;
						int i_947_ = (i_856_ & 0xff00) * i_945_ & 0xff0000;
						i_856_ = (i_946_ | i_947_) >>> 8;
						int i_948_ = i_859_;
						for (int i_949_ = -i_854_; i_949_ < 0; i_949_++) {
							int i_950_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_951_ = -i_853_; i_951_ < 0; i_951_++) {
								int i_952_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_950_]);
								if (i_952_ != 0) {
									i_946_ = ((i_952_ & 0xff00ff) * i_944_ & ~0xff00ff);
									i_947_ = ((i_952_ & 0xff00) * i_944_ & 0xff0000);
									is[i_868_++] = ((i_946_ | i_947_) >>> 8) + i_856_;
								} else
									i_868_++;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_948_;
							i_868_ += i_869_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_857_ == 2) {
					if (i_855_ == 1) {
						int i_953_ = i_859_;
						for (int i_954_ = -i_854_; i_954_ < 0; i_954_++) {
							int i_955_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_956_ = -i_853_; i_956_ < 0; i_956_++) {
								int i_957_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_955_]);
								if (i_957_ != 0) {
									int i_958_ = is[i_868_];
									int i_959_ = i_957_ + i_958_;
									int i_960_ = ((i_957_ & 0xff00ff) + (i_958_ & 0xff00ff));
									i_958_ = ((i_960_ & 0x1000100) + (i_959_ - i_960_ & 0x10000));
									is[i_868_++] = i_959_ - i_958_ | i_958_ - (i_958_ >>> 8);
								} else
									i_868_++;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_953_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 0) {
						int i_961_ = i_859_;
						int i_962_ = (i_856_ & 0xff0000) >> 16;
						int i_963_ = (i_856_ & 0xff00) >> 8;
						int i_964_ = i_856_ & 0xff;
						for (int i_965_ = -i_854_; i_965_ < 0; i_965_++) {
							int i_966_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_967_ = -i_853_; i_967_ < 0; i_967_++) {
								int i_968_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_966_]);
								if (i_968_ != 0) {
									int i_969_ = ((i_968_ & 0xff0000) * i_962_ & ~0xffffff);
									int i_970_ = ((i_968_ & 0xff00) * i_963_ & 0xff0000);
									int i_971_ = (i_968_ & 0xff) * i_964_ & 0xff00;
									i_968_ = (i_969_ | i_970_ | i_971_) >>> 8;
									int i_972_ = is[i_868_];
									int i_973_ = i_968_ + i_972_;
									int i_974_ = ((i_968_ & 0xff00ff) + (i_972_ & 0xff00ff));
									i_972_ = ((i_974_ & 0x1000100) + (i_973_ - i_974_ & 0x10000));
									is[i_868_++] = i_973_ - i_972_ | i_972_ - (i_972_ >>> 8);
								} else
									i_868_++;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_961_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 3) {
						int i_975_ = i_859_;
						for (int i_976_ = -i_854_; i_976_ < 0; i_976_++) {
							int i_977_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_978_ = -i_853_; i_978_ < 0; i_978_++) {
								int i_979_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_977_]);
								int i_980_ = i_979_ + i_856_;
								int i_981_ = ((i_979_ & 0xff00ff) + (i_856_ & 0xff00ff));
								int i_982_ = ((i_981_ & 0x1000100) + (i_980_ - i_981_ & 0x10000));
								i_979_ = i_980_ - i_982_ | i_982_ - (i_982_ >>> 8);
								i_982_ = is[i_868_];
								i_980_ = i_979_ + i_982_;
								i_981_ = (i_979_ & 0xff00ff) + (i_982_ & 0xff00ff);
								i_982_ = (i_981_ & 0x1000100) + (i_980_ - i_981_ & 0x10000);
								is[i_868_++] = i_980_ - i_982_ | i_982_ - (i_982_ >>> 8);
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_975_;
							i_868_ += i_869_;
						}
					} else if (i_855_ == 2) {
						int i_983_ = i_856_ >>> 24;
						int i_984_ = 256 - i_983_;
						int i_985_ = (i_856_ & 0xff00ff) * i_984_ & ~0xff00ff;
						int i_986_ = (i_856_ & 0xff00) * i_984_ & 0xff0000;
						i_856_ = (i_985_ | i_986_) >>> 8;
						int i_987_ = i_859_;
						for (int i_988_ = -i_854_; i_988_ < 0; i_988_++) {
							int i_989_ = ((i_860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_990_ = -i_853_; i_990_ < 0; i_990_++) {
								int i_991_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_859_ >> 16) + i_989_]);
								if (i_991_ != 0) {
									i_985_ = ((i_991_ & 0xff00ff) * i_983_ & ~0xff00ff);
									i_986_ = ((i_991_ & 0xff00) * i_983_ & 0xff0000);
									i_991_ = ((i_985_ | i_986_) >>> 8) + i_856_;
									int i_992_ = is[i_868_];
									int i_993_ = i_991_ + i_992_;
									int i_994_ = ((i_991_ & 0xff00ff) + (i_992_ & 0xff00ff));
									i_992_ = ((i_994_ & 0x1000100) + (i_993_ - i_994_ & 0x10000));
									is[i_868_++] = i_993_ - i_992_ | i_992_ - (i_992_ >>> 8);
								} else
									i_868_++;
								i_859_ += i_864_;
							}
							i_860_ += i_865_;
							i_859_ = i_987_;
							i_868_ += i_869_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface8_Impl1_Impl2 method707() {
		return new Class12(((Class61_Sub3_Sub1) this).anInt9358, ((Class61_Sub3_Sub1) this).anInt9325, ((Class61_Sub3_Sub1) this).anIntArray10093);
	}

	public void method689(int i, int i_995_, Class_ta class_ta, int i_996_, int i_997_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			i += ((Class61_Sub3_Sub1) this).anInt9352;
			i_995_ += ((Class61_Sub3_Sub1) this).anInt9327;
			int i_998_ = 0;
			int i_999_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			int i_1000_ = ((Class61_Sub3_Sub1) this).anInt9358;
			int i_1001_ = ((Class61_Sub3_Sub1) this).anInt9325;
			int i_1002_ = i_999_ - i_1000_;
			int i_1003_ = 0;
			int i_1004_ = i + i_995_ * i_999_;
			if (i_995_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1005_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_995_);
				i_1001_ -= i_1005_;
				i_995_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_998_ += i_1005_ * i_1000_;
				i_1004_ += i_1005_ * i_999_;
			}
			if (i_995_ + i_1001_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1001_ -= (i_995_ + i_1001_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1006_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1000_ -= i_1006_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_998_ += i_1006_;
				i_1004_ += i_1006_;
				i_1003_ += i_1006_;
				i_1002_ += i_1006_;
			}
			if (i + i_1000_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1007_ = (i + i_1000_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1000_ -= i_1007_;
				i_1003_ += i_1007_;
				i_1002_ += i_1007_;
			}
			if (i_1000_ > 0 && i_1001_ > 0) {
				Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
				int[] is_1008_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
				int[] is_1009_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
				int i_1010_ = i_995_;
				if (i_997_ > i_1010_) {
					i_1010_ = i_997_;
					i_1004_ += (i_997_ - i_995_) * i_999_;
					i_998_ += ((i_997_ - i_995_) * ((Class61_Sub3_Sub1) this).anInt9358);
				}
				int i_1011_ = (i_997_ + is_1008_.length < i_995_ + i_1001_ ? i_997_ + is_1008_.length : i_995_ + i_1001_);
				for (int i_1012_ = i_1010_; i_1012_ < i_1011_; i_1012_++) {
					int i_1013_ = is_1008_[i_1012_ - i_997_] + i_996_;
					int i_1014_ = is_1009_[i_1012_ - i_997_];
					int i_1015_ = i_1000_;
					if (i > i_1013_) {
						int i_1016_ = i - i_1013_;
						if (i_1016_ >= i_1014_) {
							i_998_ += i_1000_ + i_1003_;
							i_1004_ += i_1000_ + i_1002_;
							continue;
						}
						i_1014_ -= i_1016_;
					} else {
						int i_1017_ = i_1013_ - i;
						if (i_1017_ >= i_1000_) {
							i_998_ += i_1000_ + i_1003_;
							i_1004_ += i_1000_ + i_1002_;
							continue;
						}
						i_998_ += i_1017_;
						i_1015_ -= i_1017_;
						i_1004_ += i_1017_;
					}
					int i_1018_ = 0;
					if (i_1015_ < i_1014_)
						i_1014_ = i_1015_;
					else
						i_1018_ = i_1015_ - i_1014_;
					for (int i_1019_ = -i_1014_; i_1019_ < 0; i_1019_++) {
						int i_1020_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_998_++]);
						if (i_1020_ != 0)
							is[i_1004_++] = i_1020_;
						else
							i_1004_++;
					}
					i_998_ += i_1018_ + i_1003_;
					i_1004_ += i_1018_ + i_1002_;
				}
			}
		}
	}

	public void method700(int i, int i_1021_, int i_1022_, int i_1023_, int i_1024_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_1025_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub1) this).anInt9352;
			i_1021_ += ((Class61_Sub3_Sub1) this).anInt9327;
			int i_1026_ = i_1021_ * i_1025_ + i;
			int i_1027_ = 0;
			int i_1028_ = ((Class61_Sub3_Sub1) this).anInt9325;
			int i_1029_ = ((Class61_Sub3_Sub1) this).anInt9358;
			int i_1030_ = i_1025_ - i_1029_;
			int i_1031_ = 0;
			if (i_1021_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1032_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1021_);
				i_1028_ -= i_1032_;
				i_1021_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_1027_ += i_1032_ * i_1029_;
				i_1026_ += i_1032_ * i_1025_;
			}
			if (i_1021_ + i_1028_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1028_ -= (i_1021_ + i_1028_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1033_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1029_ -= i_1033_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_1027_ += i_1033_;
				i_1026_ += i_1033_;
				i_1031_ += i_1033_;
				i_1030_ += i_1033_;
			}
			if (i + i_1029_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1034_ = (i + i_1029_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1029_ -= i_1034_;
				i_1031_ += i_1034_;
				i_1030_ += i_1034_;
			}
			if (i_1029_ > 0 && i_1028_ > 0) {
				if (i_1024_ == 0) {
					if (i_1022_ == 1) {
						for (int i_1035_ = -i_1028_; i_1035_ < 0; i_1035_++) {
							int i_1036_ = i_1026_ + i_1029_ - 3;
							while (i_1026_ < i_1036_) {
								is[i_1026_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								is[i_1026_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								is[i_1026_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								is[i_1026_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
							}
							i_1036_ += 3;
							while (i_1026_ < i_1036_)
								is[i_1026_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 0) {
						int i_1037_ = (i_1023_ & 0xff0000) >> 16;
						int i_1038_ = (i_1023_ & 0xff00) >> 8;
						int i_1039_ = i_1023_ & 0xff;
						for (int i_1040_ = -i_1028_; i_1040_ < 0; i_1040_++) {
							for (int i_1041_ = -i_1029_; i_1041_ < 0; i_1041_++) {
								int i_1042_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								int i_1043_ = ((i_1042_ & 0xff0000) * i_1037_ & ~0xffffff);
								int i_1044_ = (i_1042_ & 0xff00) * i_1038_ & 0xff0000;
								int i_1045_ = (i_1042_ & 0xff) * i_1039_ & 0xff00;
								is[i_1026_++] = (i_1043_ | i_1044_ | i_1045_) >>> 8;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 3) {
						for (int i_1046_ = -i_1028_; i_1046_ < 0; i_1046_++) {
							for (int i_1047_ = -i_1029_; i_1047_ < 0; i_1047_++) {
								int i_1048_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								int i_1049_ = i_1048_ + i_1023_;
								int i_1050_ = ((i_1048_ & 0xff00ff) + (i_1023_ & 0xff00ff));
								int i_1051_ = ((i_1050_ & 0x1000100) + (i_1049_ - i_1050_ & 0x10000));
								is[i_1026_++] = i_1049_ - i_1051_ | i_1051_ - (i_1051_ >>> 8);
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 2) {
						int i_1052_ = i_1023_ >>> 24;
						int i_1053_ = 256 - i_1052_;
						int i_1054_ = (i_1023_ & 0xff00ff) * i_1053_ & ~0xff00ff;
						int i_1055_ = (i_1023_ & 0xff00) * i_1053_ & 0xff0000;
						i_1023_ = (i_1054_ | i_1055_) >>> 8;
						for (int i_1056_ = -i_1028_; i_1056_ < 0; i_1056_++) {
							for (int i_1057_ = -i_1029_; i_1057_ < 0; i_1057_++) {
								int i_1058_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								i_1054_ = ((i_1058_ & 0xff00ff) * i_1052_ & ~0xff00ff);
								i_1055_ = (i_1058_ & 0xff00) * i_1052_ & 0xff0000;
								is[i_1026_++] = ((i_1054_ | i_1055_) >>> 8) + i_1023_;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1024_ == 1) {
					if (i_1022_ == 1) {
						for (int i_1059_ = -i_1028_; i_1059_ < 0; i_1059_++) {
							int i_1060_ = i_1026_ + i_1029_ - 3;
							while (i_1026_ < i_1060_) {
								int i_1061_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1061_ != 0)
									is[i_1026_++] = i_1061_;
								else
									i_1026_++;
								i_1061_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1061_ != 0)
									is[i_1026_++] = i_1061_;
								else
									i_1026_++;
								i_1061_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1061_ != 0)
									is[i_1026_++] = i_1061_;
								else
									i_1026_++;
								i_1061_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1061_ != 0)
									is[i_1026_++] = i_1061_;
								else
									i_1026_++;
							}
							i_1060_ += 3;
							while (i_1026_ < i_1060_) {
								int i_1062_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1062_ != 0)
									is[i_1026_++] = i_1062_;
								else
									i_1026_++;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 0) {
						if ((i_1023_ & 0xffffff) == 16777215) {
							int i_1063_ = i_1023_ >>> 24;
							int i_1064_ = 256 - i_1063_;
							for (int i_1065_ = -i_1028_; i_1065_ < 0; i_1065_++) {
								for (int i_1066_ = -i_1029_; i_1066_ < 0; i_1066_++) {
									int i_1067_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
									if (i_1067_ != 0) {
										int i_1068_ = is[i_1026_];
										is[i_1026_++] = ((((i_1067_ & 0xff00ff) * i_1063_ + ((i_1068_ & 0xff00ff) * i_1064_)) & ~0xff00ff) + (((i_1067_ & 0xff00) * i_1063_ + ((i_1068_ & 0xff00) * i_1064_)) & 0xff0000)) >> 8;
									} else
										i_1026_++;
								}
								i_1026_ += i_1030_;
								i_1027_ += i_1031_;
							}
						} else {
							int i_1069_ = (i_1023_ & 0xff0000) >> 16;
							int i_1070_ = (i_1023_ & 0xff00) >> 8;
							int i_1071_ = i_1023_ & 0xff;
							int i_1072_ = i_1023_ >>> 24;
							int i_1073_ = 256 - i_1072_;
							for (int i_1074_ = -i_1028_; i_1074_ < 0; i_1074_++) {
								for (int i_1075_ = -i_1029_; i_1075_ < 0; i_1075_++) {
									int i_1076_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
									if (i_1076_ != 0) {
										if (i_1072_ != 255) {
											int i_1077_ = (((i_1076_ & 0xff0000) * i_1069_) & ~0xffffff);
											int i_1078_ = ((i_1076_ & 0xff00) * i_1070_ & 0xff0000);
											int i_1079_ = ((i_1076_ & 0xff) * i_1071_ & 0xff00);
											i_1076_ = (i_1077_ | i_1078_ | i_1079_) >>> 8;
											int i_1080_ = is[i_1026_];
											is[i_1026_++] = (((((i_1076_ & 0xff00ff) * i_1072_) + ((i_1080_ & 0xff00ff) * i_1073_)) & ~0xff00ff) + ((((i_1076_ & 0xff00) * i_1072_) + ((i_1080_ & 0xff00) * i_1073_)) & 0xff0000)) >> 8;
										} else {
											int i_1081_ = (((i_1076_ & 0xff0000) * i_1069_) & ~0xffffff);
											int i_1082_ = ((i_1076_ & 0xff00) * i_1070_ & 0xff0000);
											int i_1083_ = ((i_1076_ & 0xff) * i_1071_ & 0xff00);
											is[i_1026_++] = (i_1081_ | i_1082_ | i_1083_) >>> 8;
										}
									} else
										i_1026_++;
								}
								i_1026_ += i_1030_;
								i_1027_ += i_1031_;
							}
						}
					} else if (i_1022_ == 3) {
						int i_1084_ = i_1023_ >>> 24;
						int i_1085_ = 256 - i_1084_;
						for (int i_1086_ = -i_1028_; i_1086_ < 0; i_1086_++) {
							for (int i_1087_ = -i_1029_; i_1087_ < 0; i_1087_++) {
								int i_1088_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								int i_1089_ = i_1088_ + i_1023_;
								int i_1090_ = ((i_1088_ & 0xff00ff) + (i_1023_ & 0xff00ff));
								int i_1091_ = ((i_1090_ & 0x1000100) + (i_1089_ - i_1090_ & 0x10000));
								i_1091_ = i_1089_ - i_1091_ | i_1091_ - (i_1091_ >>> 8);
								if (i_1088_ == 0 && i_1084_ != 255) {
									i_1088_ = i_1091_;
									i_1091_ = is[i_1026_];
									i_1091_ = ((((i_1088_ & 0xff00ff) * i_1084_ + (i_1091_ & 0xff00ff) * i_1085_) & ~0xff00ff) + (((i_1088_ & 0xff00) * i_1084_ + (i_1091_ & 0xff00) * i_1085_) & 0xff0000)) >> 8;
								}
								is[i_1026_++] = i_1091_;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 2) {
						int i_1092_ = i_1023_ >>> 24;
						int i_1093_ = 256 - i_1092_;
						int i_1094_ = (i_1023_ & 0xff00ff) * i_1093_ & ~0xff00ff;
						int i_1095_ = (i_1023_ & 0xff00) * i_1093_ & 0xff0000;
						i_1023_ = (i_1094_ | i_1095_) >>> 8;
						for (int i_1096_ = -i_1028_; i_1096_ < 0; i_1096_++) {
							for (int i_1097_ = -i_1029_; i_1097_ < 0; i_1097_++) {
								int i_1098_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1098_ != 0) {
									i_1094_ = ((i_1098_ & 0xff00ff) * i_1092_ & ~0xff00ff);
									i_1095_ = ((i_1098_ & 0xff00) * i_1092_ & 0xff0000);
									is[i_1026_++] = ((i_1094_ | i_1095_) >>> 8) + i_1023_;
								} else
									i_1026_++;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1024_ == 2) {
					if (i_1022_ == 1) {
						for (int i_1099_ = -i_1028_; i_1099_ < 0; i_1099_++) {
							for (int i_1100_ = -i_1029_; i_1100_ < 0; i_1100_++) {
								int i_1101_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1101_ != 0) {
									int i_1102_ = is[i_1026_];
									int i_1103_ = i_1101_ + i_1102_;
									int i_1104_ = ((i_1101_ & 0xff00ff) + (i_1102_ & 0xff00ff));
									i_1102_ = ((i_1104_ & 0x1000100) + (i_1103_ - i_1104_ & 0x10000));
									is[i_1026_++] = (i_1103_ - i_1102_ | i_1102_ - (i_1102_ >>> 8));
								} else
									i_1026_++;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 0) {
						int i_1105_ = (i_1023_ & 0xff0000) >> 16;
						int i_1106_ = (i_1023_ & 0xff00) >> 8;
						int i_1107_ = i_1023_ & 0xff;
						for (int i_1108_ = -i_1028_; i_1108_ < 0; i_1108_++) {
							for (int i_1109_ = -i_1029_; i_1109_ < 0; i_1109_++) {
								int i_1110_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1110_ != 0) {
									int i_1111_ = ((i_1110_ & 0xff0000) * i_1105_ & ~0xffffff);
									int i_1112_ = ((i_1110_ & 0xff00) * i_1106_ & 0xff0000);
									int i_1113_ = (i_1110_ & 0xff) * i_1107_ & 0xff00;
									i_1110_ = (i_1111_ | i_1112_ | i_1113_) >>> 8;
									int i_1114_ = is[i_1026_];
									int i_1115_ = i_1110_ + i_1114_;
									int i_1116_ = ((i_1110_ & 0xff00ff) + (i_1114_ & 0xff00ff));
									i_1114_ = ((i_1116_ & 0x1000100) + (i_1115_ - i_1116_ & 0x10000));
									is[i_1026_++] = (i_1115_ - i_1114_ | i_1114_ - (i_1114_ >>> 8));
								} else
									i_1026_++;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 3) {
						for (int i_1117_ = -i_1028_; i_1117_ < 0; i_1117_++) {
							for (int i_1118_ = -i_1029_; i_1118_ < 0; i_1118_++) {
								int i_1119_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								int i_1120_ = i_1119_ + i_1023_;
								int i_1121_ = ((i_1119_ & 0xff00ff) + (i_1023_ & 0xff00ff));
								int i_1122_ = ((i_1121_ & 0x1000100) + (i_1120_ - i_1121_ & 0x10000));
								i_1119_ = i_1120_ - i_1122_ | i_1122_ - (i_1122_ >>> 8);
								i_1122_ = is[i_1026_];
								i_1120_ = i_1119_ + i_1122_;
								i_1121_ = (i_1119_ & 0xff00ff) + (i_1122_ & 0xff00ff);
								i_1122_ = ((i_1121_ & 0x1000100) + (i_1120_ - i_1121_ & 0x10000));
								is[i_1026_++] = i_1120_ - i_1122_ | i_1122_ - (i_1122_ >>> 8);
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else if (i_1022_ == 2) {
						int i_1123_ = i_1023_ >>> 24;
						int i_1124_ = 256 - i_1123_;
						int i_1125_ = (i_1023_ & 0xff00ff) * i_1124_ & ~0xff00ff;
						int i_1126_ = (i_1023_ & 0xff00) * i_1124_ & 0xff0000;
						i_1023_ = (i_1125_ | i_1126_) >>> 8;
						for (int i_1127_ = -i_1028_; i_1127_ < 0; i_1127_++) {
							for (int i_1128_ = -i_1029_; i_1128_ < 0; i_1128_++) {
								int i_1129_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1027_++]);
								if (i_1129_ != 0) {
									i_1125_ = ((i_1129_ & 0xff00ff) * i_1123_ & ~0xff00ff);
									i_1126_ = ((i_1129_ & 0xff00) * i_1123_ & 0xff0000);
									i_1129_ = (((i_1125_ | i_1126_) >>> 8) + i_1023_);
									int i_1130_ = is[i_1026_];
									int i_1131_ = i_1129_ + i_1130_;
									int i_1132_ = ((i_1129_ & 0xff00ff) + (i_1130_ & 0xff00ff));
									i_1130_ = ((i_1132_ & 0x1000100) + (i_1131_ - i_1132_ & 0x10000));
									is[i_1026_++] = (i_1131_ - i_1130_ | i_1130_ - (i_1130_ >>> 8));
								} else
									i_1026_++;
							}
							i_1026_ += i_1030_;
							i_1027_ += i_1031_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method685(int i, int i_1133_, int i_1134_, int i_1135_, int i_1136_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_1137_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub1) this).anInt9352;
			i_1133_ += ((Class61_Sub3_Sub1) this).anInt9327;
			int i_1138_ = i_1133_ * i_1137_ + i;
			int i_1139_ = 0;
			int i_1140_ = ((Class61_Sub3_Sub1) this).anInt9325;
			int i_1141_ = ((Class61_Sub3_Sub1) this).anInt9358;
			int i_1142_ = i_1137_ - i_1141_;
			int i_1143_ = 0;
			if (i_1133_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1144_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1133_);
				i_1140_ -= i_1144_;
				i_1133_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_1139_ += i_1144_ * i_1141_;
				i_1138_ += i_1144_ * i_1137_;
			}
			if (i_1133_ + i_1140_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1140_ -= (i_1133_ + i_1140_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1145_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1141_ -= i_1145_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_1139_ += i_1145_;
				i_1138_ += i_1145_;
				i_1143_ += i_1145_;
				i_1142_ += i_1145_;
			}
			if (i + i_1141_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1146_ = (i + i_1141_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1141_ -= i_1146_;
				i_1143_ += i_1146_;
				i_1142_ += i_1146_;
			}
			if (i_1141_ > 0 && i_1140_ > 0) {
				if (i_1136_ == 0) {
					if (i_1134_ == 1) {
						for (int i_1147_ = -i_1140_; i_1147_ < 0; i_1147_++) {
							int i_1148_ = i_1138_ + i_1141_ - 3;
							while (i_1138_ < i_1148_) {
								is[i_1138_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								is[i_1138_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								is[i_1138_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								is[i_1138_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
							}
							i_1148_ += 3;
							while (i_1138_ < i_1148_)
								is[i_1138_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 0) {
						int i_1149_ = (i_1135_ & 0xff0000) >> 16;
						int i_1150_ = (i_1135_ & 0xff00) >> 8;
						int i_1151_ = i_1135_ & 0xff;
						for (int i_1152_ = -i_1140_; i_1152_ < 0; i_1152_++) {
							for (int i_1153_ = -i_1141_; i_1153_ < 0; i_1153_++) {
								int i_1154_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								int i_1155_ = ((i_1154_ & 0xff0000) * i_1149_ & ~0xffffff);
								int i_1156_ = (i_1154_ & 0xff00) * i_1150_ & 0xff0000;
								int i_1157_ = (i_1154_ & 0xff) * i_1151_ & 0xff00;
								is[i_1138_++] = (i_1155_ | i_1156_ | i_1157_) >>> 8;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 3) {
						for (int i_1158_ = -i_1140_; i_1158_ < 0; i_1158_++) {
							for (int i_1159_ = -i_1141_; i_1159_ < 0; i_1159_++) {
								int i_1160_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								int i_1161_ = i_1160_ + i_1135_;
								int i_1162_ = ((i_1160_ & 0xff00ff) + (i_1135_ & 0xff00ff));
								int i_1163_ = ((i_1162_ & 0x1000100) + (i_1161_ - i_1162_ & 0x10000));
								is[i_1138_++] = i_1161_ - i_1163_ | i_1163_ - (i_1163_ >>> 8);
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 2) {
						int i_1164_ = i_1135_ >>> 24;
						int i_1165_ = 256 - i_1164_;
						int i_1166_ = (i_1135_ & 0xff00ff) * i_1165_ & ~0xff00ff;
						int i_1167_ = (i_1135_ & 0xff00) * i_1165_ & 0xff0000;
						i_1135_ = (i_1166_ | i_1167_) >>> 8;
						for (int i_1168_ = -i_1140_; i_1168_ < 0; i_1168_++) {
							for (int i_1169_ = -i_1141_; i_1169_ < 0; i_1169_++) {
								int i_1170_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								i_1166_ = ((i_1170_ & 0xff00ff) * i_1164_ & ~0xff00ff);
								i_1167_ = (i_1170_ & 0xff00) * i_1164_ & 0xff0000;
								is[i_1138_++] = ((i_1166_ | i_1167_) >>> 8) + i_1135_;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1136_ == 1) {
					if (i_1134_ == 1) {
						for (int i_1171_ = -i_1140_; i_1171_ < 0; i_1171_++) {
							int i_1172_ = i_1138_ + i_1141_ - 3;
							while (i_1138_ < i_1172_) {
								int i_1173_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1173_ != 0)
									is[i_1138_++] = i_1173_;
								else
									i_1138_++;
								i_1173_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1173_ != 0)
									is[i_1138_++] = i_1173_;
								else
									i_1138_++;
								i_1173_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1173_ != 0)
									is[i_1138_++] = i_1173_;
								else
									i_1138_++;
								i_1173_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1173_ != 0)
									is[i_1138_++] = i_1173_;
								else
									i_1138_++;
							}
							i_1172_ += 3;
							while (i_1138_ < i_1172_) {
								int i_1174_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1174_ != 0)
									is[i_1138_++] = i_1174_;
								else
									i_1138_++;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 0) {
						if ((i_1135_ & 0xffffff) == 16777215) {
							int i_1175_ = i_1135_ >>> 24;
							int i_1176_ = 256 - i_1175_;
							for (int i_1177_ = -i_1140_; i_1177_ < 0; i_1177_++) {
								for (int i_1178_ = -i_1141_; i_1178_ < 0; i_1178_++) {
									int i_1179_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
									if (i_1179_ != 0) {
										int i_1180_ = is[i_1138_];
										is[i_1138_++] = ((((i_1179_ & 0xff00ff) * i_1175_ + ((i_1180_ & 0xff00ff) * i_1176_)) & ~0xff00ff) + (((i_1179_ & 0xff00) * i_1175_ + ((i_1180_ & 0xff00) * i_1176_)) & 0xff0000)) >> 8;
									} else
										i_1138_++;
								}
								i_1138_ += i_1142_;
								i_1139_ += i_1143_;
							}
						} else {
							int i_1181_ = (i_1135_ & 0xff0000) >> 16;
							int i_1182_ = (i_1135_ & 0xff00) >> 8;
							int i_1183_ = i_1135_ & 0xff;
							int i_1184_ = i_1135_ >>> 24;
							int i_1185_ = 256 - i_1184_;
							for (int i_1186_ = -i_1140_; i_1186_ < 0; i_1186_++) {
								for (int i_1187_ = -i_1141_; i_1187_ < 0; i_1187_++) {
									int i_1188_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
									if (i_1188_ != 0) {
										if (i_1184_ != 255) {
											int i_1189_ = (((i_1188_ & 0xff0000) * i_1181_) & ~0xffffff);
											int i_1190_ = ((i_1188_ & 0xff00) * i_1182_ & 0xff0000);
											int i_1191_ = ((i_1188_ & 0xff) * i_1183_ & 0xff00);
											i_1188_ = (i_1189_ | i_1190_ | i_1191_) >>> 8;
											int i_1192_ = is[i_1138_];
											is[i_1138_++] = (((((i_1188_ & 0xff00ff) * i_1184_) + ((i_1192_ & 0xff00ff) * i_1185_)) & ~0xff00ff) + ((((i_1188_ & 0xff00) * i_1184_) + ((i_1192_ & 0xff00) * i_1185_)) & 0xff0000)) >> 8;
										} else {
											int i_1193_ = (((i_1188_ & 0xff0000) * i_1181_) & ~0xffffff);
											int i_1194_ = ((i_1188_ & 0xff00) * i_1182_ & 0xff0000);
											int i_1195_ = ((i_1188_ & 0xff) * i_1183_ & 0xff00);
											is[i_1138_++] = (i_1193_ | i_1194_ | i_1195_) >>> 8;
										}
									} else
										i_1138_++;
								}
								i_1138_ += i_1142_;
								i_1139_ += i_1143_;
							}
						}
					} else if (i_1134_ == 3) {
						int i_1196_ = i_1135_ >>> 24;
						int i_1197_ = 256 - i_1196_;
						for (int i_1198_ = -i_1140_; i_1198_ < 0; i_1198_++) {
							for (int i_1199_ = -i_1141_; i_1199_ < 0; i_1199_++) {
								int i_1200_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								int i_1201_ = i_1200_ + i_1135_;
								int i_1202_ = ((i_1200_ & 0xff00ff) + (i_1135_ & 0xff00ff));
								int i_1203_ = ((i_1202_ & 0x1000100) + (i_1201_ - i_1202_ & 0x10000));
								i_1203_ = i_1201_ - i_1203_ | i_1203_ - (i_1203_ >>> 8);
								if (i_1200_ == 0 && i_1196_ != 255) {
									i_1200_ = i_1203_;
									i_1203_ = is[i_1138_];
									i_1203_ = ((((i_1200_ & 0xff00ff) * i_1196_ + (i_1203_ & 0xff00ff) * i_1197_) & ~0xff00ff) + (((i_1200_ & 0xff00) * i_1196_ + (i_1203_ & 0xff00) * i_1197_) & 0xff0000)) >> 8;
								}
								is[i_1138_++] = i_1203_;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 2) {
						int i_1204_ = i_1135_ >>> 24;
						int i_1205_ = 256 - i_1204_;
						int i_1206_ = (i_1135_ & 0xff00ff) * i_1205_ & ~0xff00ff;
						int i_1207_ = (i_1135_ & 0xff00) * i_1205_ & 0xff0000;
						i_1135_ = (i_1206_ | i_1207_) >>> 8;
						for (int i_1208_ = -i_1140_; i_1208_ < 0; i_1208_++) {
							for (int i_1209_ = -i_1141_; i_1209_ < 0; i_1209_++) {
								int i_1210_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1210_ != 0) {
									i_1206_ = ((i_1210_ & 0xff00ff) * i_1204_ & ~0xff00ff);
									i_1207_ = ((i_1210_ & 0xff00) * i_1204_ & 0xff0000);
									is[i_1138_++] = ((i_1206_ | i_1207_) >>> 8) + i_1135_;
								} else
									i_1138_++;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1136_ == 2) {
					if (i_1134_ == 1) {
						for (int i_1211_ = -i_1140_; i_1211_ < 0; i_1211_++) {
							for (int i_1212_ = -i_1141_; i_1212_ < 0; i_1212_++) {
								int i_1213_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1213_ != 0) {
									int i_1214_ = is[i_1138_];
									int i_1215_ = i_1213_ + i_1214_;
									int i_1216_ = ((i_1213_ & 0xff00ff) + (i_1214_ & 0xff00ff));
									i_1214_ = ((i_1216_ & 0x1000100) + (i_1215_ - i_1216_ & 0x10000));
									is[i_1138_++] = (i_1215_ - i_1214_ | i_1214_ - (i_1214_ >>> 8));
								} else
									i_1138_++;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 0) {
						int i_1217_ = (i_1135_ & 0xff0000) >> 16;
						int i_1218_ = (i_1135_ & 0xff00) >> 8;
						int i_1219_ = i_1135_ & 0xff;
						for (int i_1220_ = -i_1140_; i_1220_ < 0; i_1220_++) {
							for (int i_1221_ = -i_1141_; i_1221_ < 0; i_1221_++) {
								int i_1222_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1222_ != 0) {
									int i_1223_ = ((i_1222_ & 0xff0000) * i_1217_ & ~0xffffff);
									int i_1224_ = ((i_1222_ & 0xff00) * i_1218_ & 0xff0000);
									int i_1225_ = (i_1222_ & 0xff) * i_1219_ & 0xff00;
									i_1222_ = (i_1223_ | i_1224_ | i_1225_) >>> 8;
									int i_1226_ = is[i_1138_];
									int i_1227_ = i_1222_ + i_1226_;
									int i_1228_ = ((i_1222_ & 0xff00ff) + (i_1226_ & 0xff00ff));
									i_1226_ = ((i_1228_ & 0x1000100) + (i_1227_ - i_1228_ & 0x10000));
									is[i_1138_++] = (i_1227_ - i_1226_ | i_1226_ - (i_1226_ >>> 8));
								} else
									i_1138_++;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 3) {
						for (int i_1229_ = -i_1140_; i_1229_ < 0; i_1229_++) {
							for (int i_1230_ = -i_1141_; i_1230_ < 0; i_1230_++) {
								int i_1231_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								int i_1232_ = i_1231_ + i_1135_;
								int i_1233_ = ((i_1231_ & 0xff00ff) + (i_1135_ & 0xff00ff));
								int i_1234_ = ((i_1233_ & 0x1000100) + (i_1232_ - i_1233_ & 0x10000));
								i_1231_ = i_1232_ - i_1234_ | i_1234_ - (i_1234_ >>> 8);
								i_1234_ = is[i_1138_];
								i_1232_ = i_1231_ + i_1234_;
								i_1233_ = (i_1231_ & 0xff00ff) + (i_1234_ & 0xff00ff);
								i_1234_ = ((i_1233_ & 0x1000100) + (i_1232_ - i_1233_ & 0x10000));
								is[i_1138_++] = i_1232_ - i_1234_ | i_1234_ - (i_1234_ >>> 8);
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else if (i_1134_ == 2) {
						int i_1235_ = i_1135_ >>> 24;
						int i_1236_ = 256 - i_1235_;
						int i_1237_ = (i_1135_ & 0xff00ff) * i_1236_ & ~0xff00ff;
						int i_1238_ = (i_1135_ & 0xff00) * i_1236_ & 0xff0000;
						i_1135_ = (i_1237_ | i_1238_) >>> 8;
						for (int i_1239_ = -i_1140_; i_1239_ < 0; i_1239_++) {
							for (int i_1240_ = -i_1141_; i_1240_ < 0; i_1240_++) {
								int i_1241_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1139_++]);
								if (i_1241_ != 0) {
									i_1237_ = ((i_1241_ & 0xff00ff) * i_1235_ & ~0xff00ff);
									i_1238_ = ((i_1241_ & 0xff00) * i_1235_ & 0xff0000);
									i_1241_ = (((i_1237_ | i_1238_) >>> 8) + i_1135_);
									int i_1242_ = is[i_1138_];
									int i_1243_ = i_1241_ + i_1242_;
									int i_1244_ = ((i_1241_ & 0xff00ff) + (i_1242_ & 0xff00ff));
									i_1242_ = ((i_1244_ & 0x1000100) + (i_1243_ - i_1244_ & 0x10000));
									is[i_1138_++] = (i_1243_ - i_1242_ | i_1242_ - (i_1242_ >>> 8));
								} else
									i_1138_++;
							}
							i_1138_ += i_1142_;
							i_1139_ += i_1143_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method747(boolean bool, boolean bool_1245_, boolean bool_1246_, int i, int i_1247_, float f, int i_1248_, int i_1249_, int i_1250_, int i_1251_, int i_1252_, int i_1253_, boolean bool_1254_) {
		if (i_1248_ > 0 && i_1249_ > 0 && (bool || bool_1245_)) {
			int i_1255_ = 0;
			int i_1256_ = 0;
			int i_1257_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
			int i_1258_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
			int i_1259_ = (i_1257_ << 16) / i_1248_;
			int i_1260_ = (i_1258_ << 16) / i_1249_;
			if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
				int i_1261_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_1259_ - 1) / i_1259_);
				i += i_1261_;
				i_1255_ += (i_1261_ * i_1259_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
				int i_1262_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_1260_ - 1) / i_1260_);
				i_1247_ += i_1262_;
				i_1256_ += (i_1262_ * i_1260_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9358 < i_1257_)
				i_1248_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_1255_ + i_1259_ - 1) / i_1259_;
			if (((Class61_Sub3_Sub1) this).anInt9325 < i_1258_)
				i_1249_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_1256_ + i_1260_ - 1) / i_1260_;
			int i_1263_ = i + i_1247_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_1264_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_1248_);
			if (i_1247_ + i_1249_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1249_ -= (i_1247_ + i_1249_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_1247_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1265_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1247_);
				i_1249_ -= i_1265_;
				i_1263_ += i_1265_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_1256_ += i_1260_ * i_1265_;
			}
			if (i + i_1248_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1266_ = (i + i_1248_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1248_ -= i_1266_;
				i_1264_ += i_1266_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1267_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1248_ -= i_1267_;
				i_1263_ += i_1267_;
				i_1255_ += i_1259_ * i_1267_;
				i_1264_ += i_1267_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_1252_ == 0) {
				if (i_1250_ == 1) {
					int i_1268_ = i_1255_;
					for (int i_1269_ = -i_1249_; i_1269_ < 0; i_1269_++) {
						int i_1270_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1271_ = -i_1248_; i_1271_ < 0; i_1271_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								if (bool)
									is[i_1263_] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1270_]);
								if (bool_1245_ && bool_1254_)
									fs[i_1263_] = f;
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1268_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 0) {
					int i_1272_ = (i_1251_ & 0xff0000) >> 16;
					int i_1273_ = (i_1251_ & 0xff00) >> 8;
					int i_1274_ = i_1251_ & 0xff;
					int i_1275_ = i_1255_;
					for (int i_1276_ = -i_1249_; i_1276_ < 0; i_1276_++) {
						int i_1277_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1278_ = -i_1248_; i_1278_ < 0; i_1278_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								if (bool) {
									int i_1279_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1277_]);
									int i_1280_ = ((i_1279_ & 0xff0000) * i_1272_ & ~0xffffff);
									int i_1281_ = ((i_1279_ & 0xff00) * i_1273_ & 0xff0000);
									int i_1282_ = (i_1279_ & 0xff) * i_1274_ & 0xff00;
									is[i_1263_] = (i_1280_ | i_1281_ | i_1282_) >>> 8;
								}
								if (bool_1245_ && bool_1254_)
									fs[i_1263_] = f;
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1275_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 3) {
					int i_1283_ = i_1255_;
					for (int i_1284_ = -i_1249_; i_1284_ < 0; i_1284_++) {
						int i_1285_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1286_ = -i_1248_; i_1286_ < 0; i_1286_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								if (bool) {
									int i_1287_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1285_]);
									int i_1288_ = i_1287_ + i_1251_;
									int i_1289_ = ((i_1287_ & 0xff00ff) + (i_1251_ & 0xff00ff));
									int i_1290_ = ((i_1289_ & 0x1000100) + (i_1288_ - i_1289_ & 0x10000));
									is[i_1263_] = (i_1288_ - i_1290_ | i_1290_ - (i_1290_ >>> 8));
								}
								if (bool_1245_ && bool_1254_)
									fs[i_1263_] = f;
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1283_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 2) {
					int i_1291_ = i_1251_ >>> 24;
					int i_1292_ = 256 - i_1291_;
					int i_1293_ = (i_1251_ & 0xff00ff) * i_1292_ & ~0xff00ff;
					int i_1294_ = (i_1251_ & 0xff00) * i_1292_ & 0xff0000;
					i_1251_ = (i_1293_ | i_1294_) >>> 8;
					int i_1295_ = i_1255_;
					for (int i_1296_ = -i_1249_; i_1296_ < 0; i_1296_++) {
						int i_1297_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1298_ = -i_1248_; i_1298_ < 0; i_1298_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								if (bool) {
									int i_1299_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1297_]);
									i_1293_ = ((i_1299_ & 0xff00ff) * i_1291_ & ~0xff00ff);
									i_1294_ = ((i_1299_ & 0xff00) * i_1291_ & 0xff0000);
									is[i_1263_] = (((i_1293_ | i_1294_) >>> 8) + i_1251_);
								}
								if (bool_1245_ && bool_1254_)
									fs[i_1263_] = f;
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1295_;
						i_1263_ += i_1264_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1252_ == 1) {
				if (i_1250_ == 1) {
					int i_1300_ = i_1255_;
					for (int i_1301_ = -i_1249_; i_1301_ < 0; i_1301_++) {
						int i_1302_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1303_ = -i_1248_; i_1303_ < 0; i_1303_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								int i_1304_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1302_]);
								if (i_1304_ != 0) {
									if (bool)
										is[i_1263_] = i_1304_;
									if (bool_1245_ && bool_1254_)
										fs[i_1263_] = f;
								}
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1300_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 0) {
					int i_1305_ = i_1255_;
					if ((i_1251_ & 0xffffff) == 16777215) {
						int i_1306_ = i_1251_ >>> 24;
						int i_1307_ = 256 - i_1306_;
						for (int i_1308_ = -i_1249_; i_1308_ < 0; i_1308_++) {
							int i_1309_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1310_ = -i_1248_; i_1310_ < 0; i_1310_++) {
								if (!bool_1245_ || f < fs[i_1263_]) {
									int i_1311_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1309_]);
									if (i_1311_ != 0) {
										if (bool) {
											int i_1312_ = is[i_1263_];
											is[i_1263_] = (((((i_1311_ & 0xff00ff) * i_1306_) + ((i_1312_ & 0xff00ff) * i_1307_)) & ~0xff00ff) + ((((i_1311_ & 0xff00) * i_1306_) + ((i_1312_ & 0xff00) * i_1307_)) & 0xff0000)) >> 8;
										}
										if (bool_1245_ && bool_1254_)
											fs[i_1263_] = f;
									}
								}
								i_1255_ += i_1259_;
								i_1263_++;
							}
							i_1256_ += i_1260_;
							i_1255_ = i_1305_;
							i_1263_ += i_1264_;
						}
					} else {
						int i_1313_ = (i_1251_ & 0xff0000) >> 16;
						int i_1314_ = (i_1251_ & 0xff00) >> 8;
						int i_1315_ = i_1251_ & 0xff;
						int i_1316_ = i_1251_ >>> 24;
						int i_1317_ = 256 - i_1316_;
						for (int i_1318_ = -i_1249_; i_1318_ < 0; i_1318_++) {
							int i_1319_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1320_ = -i_1248_; i_1320_ < 0; i_1320_++) {
								if (!bool_1245_ || f < fs[i_1263_]) {
									int i_1321_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1319_]);
									if (i_1321_ != 0) {
										if (i_1316_ != 255) {
											if (bool) {
												int i_1322_ = (((i_1321_ & 0xff0000) * i_1313_) & ~0xffffff);
												int i_1323_ = (((i_1321_ & 0xff00) * i_1314_) & 0xff0000);
												int i_1324_ = (((i_1321_ & 0xff) * i_1315_) & 0xff00);
												i_1321_ = (i_1322_ | i_1323_ | i_1324_) >>> 8;
												int i_1325_ = is[i_1263_];
												is[i_1263_] = (((((i_1321_ & 0xff00ff) * i_1316_) + ((i_1325_ & 0xff00ff) * i_1317_)) & ~0xff00ff) + ((((i_1321_ & 0xff00) * i_1316_) + ((i_1325_ & 0xff00) * i_1317_)) & 0xff0000)) >> 8;
											}
											if (bool_1245_ && bool_1254_)
												fs[i_1263_] = f;
										} else {
											if (bool) {
												int i_1326_ = (((i_1321_ & 0xff0000) * i_1313_) & ~0xffffff);
												int i_1327_ = (((i_1321_ & 0xff00) * i_1314_) & 0xff0000);
												int i_1328_ = (((i_1321_ & 0xff) * i_1315_) & 0xff00);
												is[i_1263_] = (i_1326_ | i_1327_ | i_1328_) >>> 8;
											}
											if (bool_1245_ && bool_1254_)
												fs[i_1263_] = f;
										}
									}
								}
								i_1255_ += i_1259_;
								i_1263_++;
							}
							i_1256_ += i_1260_;
							i_1255_ = i_1305_;
							i_1263_ += i_1264_;
						}
					}
				} else if (i_1250_ == 3) {
					int i_1329_ = i_1255_;
					int i_1330_ = i_1251_ >>> 24;
					int i_1331_ = 256 - i_1330_;
					for (int i_1332_ = -i_1249_; i_1332_ < 0; i_1332_++) {
						int i_1333_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1334_ = -i_1248_; i_1334_ < 0; i_1334_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								if (bool) {
									int i_1335_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1333_]);
									int i_1336_ = i_1335_ + i_1251_;
									int i_1337_ = ((i_1335_ & 0xff00ff) + (i_1251_ & 0xff00ff));
									int i_1338_ = ((i_1337_ & 0x1000100) + (i_1336_ - i_1337_ & 0x10000));
									i_1338_ = (i_1336_ - i_1338_ | i_1338_ - (i_1338_ >>> 8));
									if (i_1335_ == 0 && i_1330_ != 255) {
										i_1335_ = i_1338_;
										i_1338_ = is[i_1263_];
										i_1338_ = ((((i_1335_ & 0xff00ff) * i_1330_ + ((i_1338_ & 0xff00ff) * i_1331_)) & ~0xff00ff) + (((i_1335_ & 0xff00) * i_1330_ + ((i_1338_ & 0xff00) * i_1331_)) & 0xff0000)) >> 8;
									}
									is[i_1263_] = i_1338_;
								}
								if (bool_1245_ && bool_1254_)
									fs[i_1263_] = f;
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1329_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 2) {
					int i_1339_ = i_1251_ >>> 24;
					int i_1340_ = 256 - i_1339_;
					int i_1341_ = (i_1251_ & 0xff00ff) * i_1340_ & ~0xff00ff;
					int i_1342_ = (i_1251_ & 0xff00) * i_1340_ & 0xff0000;
					i_1251_ = (i_1341_ | i_1342_) >>> 8;
					int i_1343_ = i_1255_;
					for (int i_1344_ = -i_1249_; i_1344_ < 0; i_1344_++) {
						int i_1345_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1346_ = -i_1248_; i_1346_ < 0; i_1346_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								int i_1347_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1345_]);
								if (i_1347_ != 0) {
									if (bool) {
										i_1341_ = ((i_1347_ & 0xff00ff) * i_1339_ & ~0xff00ff);
										i_1342_ = ((i_1347_ & 0xff00) * i_1339_ & 0xff0000);
										is[i_1263_] = ((i_1341_ | i_1342_) >>> 8) + i_1251_;
									}
									if (bool_1245_ && bool_1254_)
										fs[i_1263_] = f;
								}
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1343_;
						i_1263_ += i_1264_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1252_ == 2) {
				if (i_1250_ == 1) {
					int i_1348_ = i_1255_;
					for (int i_1349_ = -i_1249_; i_1349_ < 0; i_1349_++) {
						int i_1350_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1351_ = -i_1248_; i_1351_ < 0; i_1351_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								int i_1352_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1350_]);
								if (i_1352_ != 0) {
									if (bool) {
										int i_1353_ = is[i_1263_];
										int i_1354_ = i_1352_ + i_1353_;
										int i_1355_ = ((i_1352_ & 0xff00ff) + (i_1353_ & 0xff00ff));
										i_1353_ = ((i_1355_ & 0x1000100) + (i_1354_ - i_1355_ & 0x10000));
										is[i_1263_] = (i_1354_ - i_1353_ | i_1353_ - (i_1353_ >>> 8));
									}
									if (bool_1245_ && bool_1254_)
										fs[i_1263_] = f;
								}
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1348_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 0) {
					int i_1356_ = i_1255_;
					int i_1357_ = (i_1251_ & 0xff0000) >> 16;
					int i_1358_ = (i_1251_ & 0xff00) >> 8;
					int i_1359_ = i_1251_ & 0xff;
					for (int i_1360_ = -i_1249_; i_1360_ < 0; i_1360_++) {
						int i_1361_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1362_ = -i_1248_; i_1362_ < 0; i_1362_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								int i_1363_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1361_]);
								if (i_1363_ != 0) {
									if (bool) {
										int i_1364_ = ((i_1363_ & 0xff0000) * i_1357_ & ~0xffffff);
										int i_1365_ = ((i_1363_ & 0xff00) * i_1358_ & 0xff0000);
										int i_1366_ = ((i_1363_ & 0xff) * i_1359_ & 0xff00);
										i_1363_ = (i_1364_ | i_1365_ | i_1366_) >>> 8;
										int i_1367_ = is[i_1263_];
										int i_1368_ = i_1363_ + i_1367_;
										int i_1369_ = ((i_1363_ & 0xff00ff) + (i_1367_ & 0xff00ff));
										i_1367_ = ((i_1369_ & 0x1000100) + (i_1368_ - i_1369_ & 0x10000));
										is[i_1263_] = (i_1368_ - i_1367_ | i_1367_ - (i_1367_ >>> 8));
									}
									if (bool_1245_ && bool_1254_)
										fs[i_1263_] = f;
								}
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1356_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 3) {
					int i_1370_ = i_1255_;
					for (int i_1371_ = -i_1249_; i_1371_ < 0; i_1371_++) {
						int i_1372_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1373_ = -i_1248_; i_1373_ < 0; i_1373_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								if (bool) {
									int i_1374_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1372_]);
									int i_1375_ = i_1374_ + i_1251_;
									int i_1376_ = ((i_1374_ & 0xff00ff) + (i_1251_ & 0xff00ff));
									int i_1377_ = ((i_1376_ & 0x1000100) + (i_1375_ - i_1376_ & 0x10000));
									i_1374_ = (i_1375_ - i_1377_ | i_1377_ - (i_1377_ >>> 8));
									i_1377_ = is[i_1263_];
									i_1375_ = i_1374_ + i_1377_;
									i_1376_ = (i_1374_ & 0xff00ff) + (i_1377_ & 0xff00ff);
									i_1377_ = ((i_1376_ & 0x1000100) + (i_1375_ - i_1376_ & 0x10000));
									is[i_1263_] = (i_1375_ - i_1377_ | i_1377_ - (i_1377_ >>> 8));
								}
								if (bool_1245_ && bool_1254_)
									fs[i_1263_] = f;
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1370_;
						i_1263_ += i_1264_;
					}
				} else if (i_1250_ == 2) {
					int i_1378_ = i_1251_ >>> 24;
					int i_1379_ = 256 - i_1378_;
					int i_1380_ = (i_1251_ & 0xff00ff) * i_1379_ & ~0xff00ff;
					int i_1381_ = (i_1251_ & 0xff00) * i_1379_ & 0xff0000;
					i_1251_ = (i_1380_ | i_1381_) >>> 8;
					int i_1382_ = i_1255_;
					for (int i_1383_ = -i_1249_; i_1383_ < 0; i_1383_++) {
						int i_1384_ = ((i_1256_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1385_ = -i_1248_; i_1385_ < 0; i_1385_++) {
							if (!bool_1245_ || f < fs[i_1263_]) {
								int i_1386_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1255_ >> 16) + i_1384_]);
								if (i_1386_ != 0) {
									if (bool) {
										i_1380_ = ((i_1386_ & 0xff00ff) * i_1378_ & ~0xff00ff);
										i_1381_ = ((i_1386_ & 0xff00) * i_1378_ & 0xff0000);
										i_1386_ = (((i_1380_ | i_1381_) >>> 8) + i_1251_);
										int i_1387_ = is[i_1263_];
										int i_1388_ = i_1386_ + i_1387_;
										int i_1389_ = ((i_1386_ & 0xff00ff) + (i_1387_ & 0xff00ff));
										i_1387_ = ((i_1389_ & 0x1000100) + (i_1388_ - i_1389_ & 0x10000));
										is[i_1263_] = (i_1388_ - i_1387_ | i_1387_ - (i_1387_ >>> 8));
									}
									if (bool_1245_ && bool_1254_)
										fs[i_1263_] = f;
								}
							}
							i_1255_ += i_1259_;
							i_1263_++;
						}
						i_1256_ += i_1260_;
						i_1255_ = i_1382_;
						i_1263_ += i_1264_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method709(int i, int i_1390_, int i_1391_, int i_1392_, int i_1393_, int i_1394_, int i_1395_, int i_1396_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1391_ > 0 && i_1392_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1397_ = 0;
				int i_1398_ = 0;
				int i_1399_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1400_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
				int i_1401_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
				int i_1402_ = (i_1400_ << 16) / i_1391_;
				int i_1403_ = (i_1401_ << 16) / i_1392_;
				if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
					int i_1404_ = ((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_1402_ - 1) / i_1402_;
					i += i_1404_;
					i_1397_ += (i_1404_ * i_1402_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
					int i_1405_ = ((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_1403_ - 1) / i_1403_;
					i_1390_ += i_1405_;
					i_1398_ += (i_1405_ * i_1403_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9358 < i_1400_)
					i_1391_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_1397_ + i_1402_ - 1) / i_1402_;
				if (((Class61_Sub3_Sub1) this).anInt9325 < i_1401_)
					i_1392_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_1398_ + i_1403_ - 1) / i_1403_;
				int i_1406_ = i + i_1390_ * i_1399_;
				int i_1407_ = i_1399_ - i_1391_;
				if (i_1390_ + i_1392_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1392_ -= (i_1390_ + i_1392_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1390_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1408_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1390_;
					i_1392_ -= i_1408_;
					i_1406_ += i_1408_ * i_1399_;
					i_1398_ += i_1403_ * i_1408_;
				}
				if (i + i_1391_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1409_ = (i + i_1391_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1391_ -= i_1409_;
					i_1407_ += i_1409_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1410_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1391_ -= i_1410_;
					i_1406_ += i_1410_;
					i_1397_ += i_1402_ * i_1410_;
					i_1407_ += i_1410_;
				}
				if (i_1395_ == 0) {
					if (i_1393_ == 1) {
						int i_1411_ = i_1397_;
						for (int i_1412_ = -i_1392_; i_1412_ < 0; i_1412_++) {
							int i_1413_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1414_ = -i_1391_; i_1414_ < 0; i_1414_++) {
								is[i_1406_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1413_]);
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1411_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 0) {
						int i_1415_ = (i_1394_ & 0xff0000) >> 16;
						int i_1416_ = (i_1394_ & 0xff00) >> 8;
						int i_1417_ = i_1394_ & 0xff;
						int i_1418_ = i_1397_;
						for (int i_1419_ = -i_1392_; i_1419_ < 0; i_1419_++) {
							int i_1420_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1421_ = -i_1391_; i_1421_ < 0; i_1421_++) {
								int i_1422_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1420_]);
								int i_1423_ = ((i_1422_ & 0xff0000) * i_1415_ & ~0xffffff);
								int i_1424_ = (i_1422_ & 0xff00) * i_1416_ & 0xff0000;
								int i_1425_ = (i_1422_ & 0xff) * i_1417_ & 0xff00;
								is[i_1406_++] = (i_1423_ | i_1424_ | i_1425_) >>> 8;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1418_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 3) {
						int i_1426_ = i_1397_;
						for (int i_1427_ = -i_1392_; i_1427_ < 0; i_1427_++) {
							int i_1428_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1429_ = -i_1391_; i_1429_ < 0; i_1429_++) {
								int i_1430_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1428_]);
								int i_1431_ = i_1430_ + i_1394_;
								int i_1432_ = ((i_1430_ & 0xff00ff) + (i_1394_ & 0xff00ff));
								int i_1433_ = ((i_1432_ & 0x1000100) + (i_1431_ - i_1432_ & 0x10000));
								is[i_1406_++] = i_1431_ - i_1433_ | i_1433_ - (i_1433_ >>> 8);
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1426_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 2) {
						int i_1434_ = i_1394_ >>> 24;
						int i_1435_ = 256 - i_1434_;
						int i_1436_ = (i_1394_ & 0xff00ff) * i_1435_ & ~0xff00ff;
						int i_1437_ = (i_1394_ & 0xff00) * i_1435_ & 0xff0000;
						i_1394_ = (i_1436_ | i_1437_) >>> 8;
						int i_1438_ = i_1397_;
						for (int i_1439_ = -i_1392_; i_1439_ < 0; i_1439_++) {
							int i_1440_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1441_ = -i_1391_; i_1441_ < 0; i_1441_++) {
								int i_1442_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1440_]);
								i_1436_ = ((i_1442_ & 0xff00ff) * i_1434_ & ~0xff00ff);
								i_1437_ = (i_1442_ & 0xff00) * i_1434_ & 0xff0000;
								is[i_1406_++] = ((i_1436_ | i_1437_) >>> 8) + i_1394_;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1438_;
							i_1406_ += i_1407_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1395_ == 1) {
					if (i_1393_ == 1) {
						int i_1443_ = i_1397_;
						for (int i_1444_ = -i_1392_; i_1444_ < 0; i_1444_++) {
							int i_1445_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1446_ = -i_1391_; i_1446_ < 0; i_1446_++) {
								int i_1447_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1445_]);
								if (i_1447_ != 0)
									is[i_1406_++] = i_1447_;
								else
									i_1406_++;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1443_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 0) {
						int i_1448_ = i_1397_;
						if ((i_1394_ & 0xffffff) == 16777215) {
							int i_1449_ = i_1394_ >>> 24;
							int i_1450_ = 256 - i_1449_;
							for (int i_1451_ = -i_1392_; i_1451_ < 0; i_1451_++) {
								int i_1452_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_1453_ = -i_1391_; i_1453_ < 0; i_1453_++) {
									int i_1454_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1452_]);
									if (i_1454_ != 0) {
										int i_1455_ = is[i_1406_];
										is[i_1406_++] = ((((i_1454_ & 0xff00ff) * i_1449_ + ((i_1455_ & 0xff00ff) * i_1450_)) & ~0xff00ff) + (((i_1454_ & 0xff00) * i_1449_ + ((i_1455_ & 0xff00) * i_1450_)) & 0xff0000)) >> 8;
									} else
										i_1406_++;
									i_1397_ += i_1402_;
								}
								i_1398_ += i_1403_;
								i_1397_ = i_1448_;
								i_1406_ += i_1407_;
							}
						} else {
							int i_1456_ = (i_1394_ & 0xff0000) >> 16;
							int i_1457_ = (i_1394_ & 0xff00) >> 8;
							int i_1458_ = i_1394_ & 0xff;
							int i_1459_ = i_1394_ >>> 24;
							int i_1460_ = 256 - i_1459_;
							for (int i_1461_ = -i_1392_; i_1461_ < 0; i_1461_++) {
								int i_1462_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_1463_ = -i_1391_; i_1463_ < 0; i_1463_++) {
									int i_1464_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1462_]);
									if (i_1464_ != 0) {
										if (i_1459_ != 255) {
											int i_1465_ = (((i_1464_ & 0xff0000) * i_1456_) & ~0xffffff);
											int i_1466_ = ((i_1464_ & 0xff00) * i_1457_ & 0xff0000);
											int i_1467_ = ((i_1464_ & 0xff) * i_1458_ & 0xff00);
											i_1464_ = (i_1465_ | i_1466_ | i_1467_) >>> 8;
											int i_1468_ = is[i_1406_];
											is[i_1406_++] = (((((i_1464_ & 0xff00ff) * i_1459_) + ((i_1468_ & 0xff00ff) * i_1460_)) & ~0xff00ff) + ((((i_1464_ & 0xff00) * i_1459_) + ((i_1468_ & 0xff00) * i_1460_)) & 0xff0000)) >> 8;
										} else {
											int i_1469_ = (((i_1464_ & 0xff0000) * i_1456_) & ~0xffffff);
											int i_1470_ = ((i_1464_ & 0xff00) * i_1457_ & 0xff0000);
											int i_1471_ = ((i_1464_ & 0xff) * i_1458_ & 0xff00);
											is[i_1406_++] = (i_1469_ | i_1470_ | i_1471_) >>> 8;
										}
									} else
										i_1406_++;
									i_1397_ += i_1402_;
								}
								i_1398_ += i_1403_;
								i_1397_ = i_1448_;
								i_1406_ += i_1407_;
							}
						}
					} else if (i_1393_ == 3) {
						int i_1472_ = i_1397_;
						int i_1473_ = i_1394_ >>> 24;
						int i_1474_ = 256 - i_1473_;
						for (int i_1475_ = -i_1392_; i_1475_ < 0; i_1475_++) {
							int i_1476_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1477_ = -i_1391_; i_1477_ < 0; i_1477_++) {
								int i_1478_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1476_]);
								int i_1479_ = i_1478_ + i_1394_;
								int i_1480_ = ((i_1478_ & 0xff00ff) + (i_1394_ & 0xff00ff));
								int i_1481_ = ((i_1480_ & 0x1000100) + (i_1479_ - i_1480_ & 0x10000));
								i_1481_ = i_1479_ - i_1481_ | i_1481_ - (i_1481_ >>> 8);
								if (i_1478_ == 0 && i_1473_ != 255) {
									i_1478_ = i_1481_;
									i_1481_ = is[i_1406_];
									i_1481_ = ((((i_1478_ & 0xff00ff) * i_1473_ + (i_1481_ & 0xff00ff) * i_1474_) & ~0xff00ff) + (((i_1478_ & 0xff00) * i_1473_ + (i_1481_ & 0xff00) * i_1474_) & 0xff0000)) >> 8;
								}
								is[i_1406_++] = i_1481_;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1472_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 2) {
						int i_1482_ = i_1394_ >>> 24;
						int i_1483_ = 256 - i_1482_;
						int i_1484_ = (i_1394_ & 0xff00ff) * i_1483_ & ~0xff00ff;
						int i_1485_ = (i_1394_ & 0xff00) * i_1483_ & 0xff0000;
						i_1394_ = (i_1484_ | i_1485_) >>> 8;
						int i_1486_ = i_1397_;
						for (int i_1487_ = -i_1392_; i_1487_ < 0; i_1487_++) {
							int i_1488_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1489_ = -i_1391_; i_1489_ < 0; i_1489_++) {
								int i_1490_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1488_]);
								if (i_1490_ != 0) {
									i_1484_ = ((i_1490_ & 0xff00ff) * i_1482_ & ~0xff00ff);
									i_1485_ = ((i_1490_ & 0xff00) * i_1482_ & 0xff0000);
									is[i_1406_++] = ((i_1484_ | i_1485_) >>> 8) + i_1394_;
								} else
									i_1406_++;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1486_;
							i_1406_ += i_1407_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1395_ == 2) {
					if (i_1393_ == 1) {
						int i_1491_ = i_1397_;
						for (int i_1492_ = -i_1392_; i_1492_ < 0; i_1492_++) {
							int i_1493_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1494_ = -i_1391_; i_1494_ < 0; i_1494_++) {
								int i_1495_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1493_]);
								if (i_1495_ != 0) {
									int i_1496_ = is[i_1406_];
									int i_1497_ = i_1495_ + i_1496_;
									int i_1498_ = ((i_1495_ & 0xff00ff) + (i_1496_ & 0xff00ff));
									i_1496_ = ((i_1498_ & 0x1000100) + (i_1497_ - i_1498_ & 0x10000));
									is[i_1406_++] = (i_1497_ - i_1496_ | i_1496_ - (i_1496_ >>> 8));
								} else
									i_1406_++;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1491_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 0) {
						int i_1499_ = i_1397_;
						int i_1500_ = (i_1394_ & 0xff0000) >> 16;
						int i_1501_ = (i_1394_ & 0xff00) >> 8;
						int i_1502_ = i_1394_ & 0xff;
						for (int i_1503_ = -i_1392_; i_1503_ < 0; i_1503_++) {
							int i_1504_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1505_ = -i_1391_; i_1505_ < 0; i_1505_++) {
								int i_1506_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1504_]);
								if (i_1506_ != 0) {
									int i_1507_ = ((i_1506_ & 0xff0000) * i_1500_ & ~0xffffff);
									int i_1508_ = ((i_1506_ & 0xff00) * i_1501_ & 0xff0000);
									int i_1509_ = (i_1506_ & 0xff) * i_1502_ & 0xff00;
									i_1506_ = (i_1507_ | i_1508_ | i_1509_) >>> 8;
									int i_1510_ = is[i_1406_];
									int i_1511_ = i_1506_ + i_1510_;
									int i_1512_ = ((i_1506_ & 0xff00ff) + (i_1510_ & 0xff00ff));
									i_1510_ = ((i_1512_ & 0x1000100) + (i_1511_ - i_1512_ & 0x10000));
									is[i_1406_++] = (i_1511_ - i_1510_ | i_1510_ - (i_1510_ >>> 8));
								} else
									i_1406_++;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1499_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 3) {
						int i_1513_ = i_1397_;
						for (int i_1514_ = -i_1392_; i_1514_ < 0; i_1514_++) {
							int i_1515_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1516_ = -i_1391_; i_1516_ < 0; i_1516_++) {
								int i_1517_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1515_]);
								int i_1518_ = i_1517_ + i_1394_;
								int i_1519_ = ((i_1517_ & 0xff00ff) + (i_1394_ & 0xff00ff));
								int i_1520_ = ((i_1519_ & 0x1000100) + (i_1518_ - i_1519_ & 0x10000));
								i_1517_ = i_1518_ - i_1520_ | i_1520_ - (i_1520_ >>> 8);
								i_1520_ = is[i_1406_];
								i_1518_ = i_1517_ + i_1520_;
								i_1519_ = (i_1517_ & 0xff00ff) + (i_1520_ & 0xff00ff);
								i_1520_ = ((i_1519_ & 0x1000100) + (i_1518_ - i_1519_ & 0x10000));
								is[i_1406_++] = i_1518_ - i_1520_ | i_1520_ - (i_1520_ >>> 8);
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1513_;
							i_1406_ += i_1407_;
						}
					} else if (i_1393_ == 2) {
						int i_1521_ = i_1394_ >>> 24;
						int i_1522_ = 256 - i_1521_;
						int i_1523_ = (i_1394_ & 0xff00ff) * i_1522_ & ~0xff00ff;
						int i_1524_ = (i_1394_ & 0xff00) * i_1522_ & 0xff0000;
						i_1394_ = (i_1523_ | i_1524_) >>> 8;
						int i_1525_ = i_1397_;
						for (int i_1526_ = -i_1392_; i_1526_ < 0; i_1526_++) {
							int i_1527_ = ((i_1398_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1528_ = -i_1391_; i_1528_ < 0; i_1528_++) {
								int i_1529_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1397_ >> 16) + i_1527_]);
								if (i_1529_ != 0) {
									i_1523_ = ((i_1529_ & 0xff00ff) * i_1521_ & ~0xff00ff);
									i_1524_ = ((i_1529_ & 0xff00) * i_1521_ & 0xff0000);
									i_1529_ = (((i_1523_ | i_1524_) >>> 8) + i_1394_);
									int i_1530_ = is[i_1406_];
									int i_1531_ = i_1529_ + i_1530_;
									int i_1532_ = ((i_1529_ & 0xff00ff) + (i_1530_ & 0xff00ff));
									i_1530_ = ((i_1532_ & 0x1000100) + (i_1531_ - i_1532_ & 0x10000));
									is[i_1406_++] = (i_1531_ - i_1530_ | i_1530_ - (i_1530_ >>> 8));
								} else
									i_1406_++;
								i_1397_ += i_1402_;
							}
							i_1398_ += i_1403_;
							i_1397_ = i_1525_;
							i_1406_ += i_1407_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface8_Impl1_Impl2 method678() {
		return new Class12(((Class61_Sub3_Sub1) this).anInt9358, ((Class61_Sub3_Sub1) this).anInt9325, ((Class61_Sub3_Sub1) this).anIntArray10093);
	}

	public void method708(int i, int i_1533_, Class_ta class_ta, int i_1534_, int i_1535_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			i += ((Class61_Sub3_Sub1) this).anInt9352;
			i_1533_ += ((Class61_Sub3_Sub1) this).anInt9327;
			int i_1536_ = 0;
			int i_1537_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			int i_1538_ = ((Class61_Sub3_Sub1) this).anInt9358;
			int i_1539_ = ((Class61_Sub3_Sub1) this).anInt9325;
			int i_1540_ = i_1537_ - i_1538_;
			int i_1541_ = 0;
			int i_1542_ = i + i_1533_ * i_1537_;
			if (i_1533_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1543_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1533_);
				i_1539_ -= i_1543_;
				i_1533_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_1536_ += i_1543_ * i_1538_;
				i_1542_ += i_1543_ * i_1537_;
			}
			if (i_1533_ + i_1539_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1539_ -= (i_1533_ + i_1539_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1544_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1538_ -= i_1544_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_1536_ += i_1544_;
				i_1542_ += i_1544_;
				i_1541_ += i_1544_;
				i_1540_ += i_1544_;
			}
			if (i + i_1538_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1545_ = (i + i_1538_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1538_ -= i_1545_;
				i_1541_ += i_1545_;
				i_1540_ += i_1545_;
			}
			if (i_1538_ > 0 && i_1539_ > 0) {
				Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
				int[] is_1546_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
				int[] is_1547_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
				int i_1548_ = i_1533_;
				if (i_1535_ > i_1548_) {
					i_1548_ = i_1535_;
					i_1542_ += (i_1535_ - i_1533_) * i_1537_;
					i_1536_ += ((i_1535_ - i_1533_) * ((Class61_Sub3_Sub1) this).anInt9358);
				}
				int i_1549_ = (i_1535_ + is_1546_.length < i_1533_ + i_1539_ ? i_1535_ + is_1546_.length : i_1533_ + i_1539_);
				for (int i_1550_ = i_1548_; i_1550_ < i_1549_; i_1550_++) {
					int i_1551_ = is_1546_[i_1550_ - i_1535_] + i_1534_;
					int i_1552_ = is_1547_[i_1550_ - i_1535_];
					int i_1553_ = i_1538_;
					if (i > i_1551_) {
						int i_1554_ = i - i_1551_;
						if (i_1554_ >= i_1552_) {
							i_1536_ += i_1538_ + i_1541_;
							i_1542_ += i_1538_ + i_1540_;
							continue;
						}
						i_1552_ -= i_1554_;
					} else {
						int i_1555_ = i_1551_ - i;
						if (i_1555_ >= i_1538_) {
							i_1536_ += i_1538_ + i_1541_;
							i_1542_ += i_1538_ + i_1540_;
							continue;
						}
						i_1536_ += i_1555_;
						i_1553_ -= i_1555_;
						i_1542_ += i_1555_;
					}
					int i_1556_ = 0;
					if (i_1553_ < i_1552_)
						i_1552_ = i_1553_;
					else
						i_1556_ = i_1553_ - i_1552_;
					for (int i_1557_ = -i_1552_; i_1557_ < 0; i_1557_++) {
						int i_1558_ = (((Class61_Sub3_Sub1) this).anIntArray10093[i_1536_++]);
						if (i_1558_ != 0)
							is[i_1542_++] = i_1558_;
						else
							i_1542_++;
					}
					i_1536_ += i_1556_ + i_1541_;
					i_1542_ += i_1556_ + i_1540_;
				}
			}
		}
	}

	void method710(int i, int i_1559_, int i_1560_, int i_1561_, int i_1562_, int i_1563_, int i_1564_, int i_1565_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1560_ > 0 && i_1561_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1566_ = 0;
				int i_1567_ = 0;
				int i_1568_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1569_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
				int i_1570_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
				int i_1571_ = (i_1569_ << 16) / i_1560_;
				int i_1572_ = (i_1570_ << 16) / i_1561_;
				if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
					int i_1573_ = ((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_1571_ - 1) / i_1571_;
					i += i_1573_;
					i_1566_ += (i_1573_ * i_1571_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
					int i_1574_ = ((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_1572_ - 1) / i_1572_;
					i_1559_ += i_1574_;
					i_1567_ += (i_1574_ * i_1572_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9358 < i_1569_)
					i_1560_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_1566_ + i_1571_ - 1) / i_1571_;
				if (((Class61_Sub3_Sub1) this).anInt9325 < i_1570_)
					i_1561_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_1567_ + i_1572_ - 1) / i_1572_;
				int i_1575_ = i + i_1559_ * i_1568_;
				int i_1576_ = i_1568_ - i_1560_;
				if (i_1559_ + i_1561_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1561_ -= (i_1559_ + i_1561_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1559_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1577_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1559_;
					i_1561_ -= i_1577_;
					i_1575_ += i_1577_ * i_1568_;
					i_1567_ += i_1572_ * i_1577_;
				}
				if (i + i_1560_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1578_ = (i + i_1560_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1560_ -= i_1578_;
					i_1576_ += i_1578_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1579_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1560_ -= i_1579_;
					i_1575_ += i_1579_;
					i_1566_ += i_1571_ * i_1579_;
					i_1576_ += i_1579_;
				}
				if (i_1564_ == 0) {
					if (i_1562_ == 1) {
						int i_1580_ = i_1566_;
						for (int i_1581_ = -i_1561_; i_1581_ < 0; i_1581_++) {
							int i_1582_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1583_ = -i_1560_; i_1583_ < 0; i_1583_++) {
								is[i_1575_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1582_]);
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1580_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 0) {
						int i_1584_ = (i_1563_ & 0xff0000) >> 16;
						int i_1585_ = (i_1563_ & 0xff00) >> 8;
						int i_1586_ = i_1563_ & 0xff;
						int i_1587_ = i_1566_;
						for (int i_1588_ = -i_1561_; i_1588_ < 0; i_1588_++) {
							int i_1589_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1590_ = -i_1560_; i_1590_ < 0; i_1590_++) {
								int i_1591_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1589_]);
								int i_1592_ = ((i_1591_ & 0xff0000) * i_1584_ & ~0xffffff);
								int i_1593_ = (i_1591_ & 0xff00) * i_1585_ & 0xff0000;
								int i_1594_ = (i_1591_ & 0xff) * i_1586_ & 0xff00;
								is[i_1575_++] = (i_1592_ | i_1593_ | i_1594_) >>> 8;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1587_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 3) {
						int i_1595_ = i_1566_;
						for (int i_1596_ = -i_1561_; i_1596_ < 0; i_1596_++) {
							int i_1597_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1598_ = -i_1560_; i_1598_ < 0; i_1598_++) {
								int i_1599_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1597_]);
								int i_1600_ = i_1599_ + i_1563_;
								int i_1601_ = ((i_1599_ & 0xff00ff) + (i_1563_ & 0xff00ff));
								int i_1602_ = ((i_1601_ & 0x1000100) + (i_1600_ - i_1601_ & 0x10000));
								is[i_1575_++] = i_1600_ - i_1602_ | i_1602_ - (i_1602_ >>> 8);
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1595_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 2) {
						int i_1603_ = i_1563_ >>> 24;
						int i_1604_ = 256 - i_1603_;
						int i_1605_ = (i_1563_ & 0xff00ff) * i_1604_ & ~0xff00ff;
						int i_1606_ = (i_1563_ & 0xff00) * i_1604_ & 0xff0000;
						i_1563_ = (i_1605_ | i_1606_) >>> 8;
						int i_1607_ = i_1566_;
						for (int i_1608_ = -i_1561_; i_1608_ < 0; i_1608_++) {
							int i_1609_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1610_ = -i_1560_; i_1610_ < 0; i_1610_++) {
								int i_1611_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1609_]);
								i_1605_ = ((i_1611_ & 0xff00ff) * i_1603_ & ~0xff00ff);
								i_1606_ = (i_1611_ & 0xff00) * i_1603_ & 0xff0000;
								is[i_1575_++] = ((i_1605_ | i_1606_) >>> 8) + i_1563_;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1607_;
							i_1575_ += i_1576_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1564_ == 1) {
					if (i_1562_ == 1) {
						int i_1612_ = i_1566_;
						for (int i_1613_ = -i_1561_; i_1613_ < 0; i_1613_++) {
							int i_1614_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1615_ = -i_1560_; i_1615_ < 0; i_1615_++) {
								int i_1616_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1614_]);
								if (i_1616_ != 0)
									is[i_1575_++] = i_1616_;
								else
									i_1575_++;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1612_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 0) {
						int i_1617_ = i_1566_;
						if ((i_1563_ & 0xffffff) == 16777215) {
							int i_1618_ = i_1563_ >>> 24;
							int i_1619_ = 256 - i_1618_;
							for (int i_1620_ = -i_1561_; i_1620_ < 0; i_1620_++) {
								int i_1621_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_1622_ = -i_1560_; i_1622_ < 0; i_1622_++) {
									int i_1623_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1621_]);
									if (i_1623_ != 0) {
										int i_1624_ = is[i_1575_];
										is[i_1575_++] = ((((i_1623_ & 0xff00ff) * i_1618_ + ((i_1624_ & 0xff00ff) * i_1619_)) & ~0xff00ff) + (((i_1623_ & 0xff00) * i_1618_ + ((i_1624_ & 0xff00) * i_1619_)) & 0xff0000)) >> 8;
									} else
										i_1575_++;
									i_1566_ += i_1571_;
								}
								i_1567_ += i_1572_;
								i_1566_ = i_1617_;
								i_1575_ += i_1576_;
							}
						} else {
							int i_1625_ = (i_1563_ & 0xff0000) >> 16;
							int i_1626_ = (i_1563_ & 0xff00) >> 8;
							int i_1627_ = i_1563_ & 0xff;
							int i_1628_ = i_1563_ >>> 24;
							int i_1629_ = 256 - i_1628_;
							for (int i_1630_ = -i_1561_; i_1630_ < 0; i_1630_++) {
								int i_1631_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_1632_ = -i_1560_; i_1632_ < 0; i_1632_++) {
									int i_1633_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1631_]);
									if (i_1633_ != 0) {
										if (i_1628_ != 255) {
											int i_1634_ = (((i_1633_ & 0xff0000) * i_1625_) & ~0xffffff);
											int i_1635_ = ((i_1633_ & 0xff00) * i_1626_ & 0xff0000);
											int i_1636_ = ((i_1633_ & 0xff) * i_1627_ & 0xff00);
											i_1633_ = (i_1634_ | i_1635_ | i_1636_) >>> 8;
											int i_1637_ = is[i_1575_];
											is[i_1575_++] = (((((i_1633_ & 0xff00ff) * i_1628_) + ((i_1637_ & 0xff00ff) * i_1629_)) & ~0xff00ff) + ((((i_1633_ & 0xff00) * i_1628_) + ((i_1637_ & 0xff00) * i_1629_)) & 0xff0000)) >> 8;
										} else {
											int i_1638_ = (((i_1633_ & 0xff0000) * i_1625_) & ~0xffffff);
											int i_1639_ = ((i_1633_ & 0xff00) * i_1626_ & 0xff0000);
											int i_1640_ = ((i_1633_ & 0xff) * i_1627_ & 0xff00);
											is[i_1575_++] = (i_1638_ | i_1639_ | i_1640_) >>> 8;
										}
									} else
										i_1575_++;
									i_1566_ += i_1571_;
								}
								i_1567_ += i_1572_;
								i_1566_ = i_1617_;
								i_1575_ += i_1576_;
							}
						}
					} else if (i_1562_ == 3) {
						int i_1641_ = i_1566_;
						int i_1642_ = i_1563_ >>> 24;
						int i_1643_ = 256 - i_1642_;
						for (int i_1644_ = -i_1561_; i_1644_ < 0; i_1644_++) {
							int i_1645_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1646_ = -i_1560_; i_1646_ < 0; i_1646_++) {
								int i_1647_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1645_]);
								int i_1648_ = i_1647_ + i_1563_;
								int i_1649_ = ((i_1647_ & 0xff00ff) + (i_1563_ & 0xff00ff));
								int i_1650_ = ((i_1649_ & 0x1000100) + (i_1648_ - i_1649_ & 0x10000));
								i_1650_ = i_1648_ - i_1650_ | i_1650_ - (i_1650_ >>> 8);
								if (i_1647_ == 0 && i_1642_ != 255) {
									i_1647_ = i_1650_;
									i_1650_ = is[i_1575_];
									i_1650_ = ((((i_1647_ & 0xff00ff) * i_1642_ + (i_1650_ & 0xff00ff) * i_1643_) & ~0xff00ff) + (((i_1647_ & 0xff00) * i_1642_ + (i_1650_ & 0xff00) * i_1643_) & 0xff0000)) >> 8;
								}
								is[i_1575_++] = i_1650_;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1641_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 2) {
						int i_1651_ = i_1563_ >>> 24;
						int i_1652_ = 256 - i_1651_;
						int i_1653_ = (i_1563_ & 0xff00ff) * i_1652_ & ~0xff00ff;
						int i_1654_ = (i_1563_ & 0xff00) * i_1652_ & 0xff0000;
						i_1563_ = (i_1653_ | i_1654_) >>> 8;
						int i_1655_ = i_1566_;
						for (int i_1656_ = -i_1561_; i_1656_ < 0; i_1656_++) {
							int i_1657_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1658_ = -i_1560_; i_1658_ < 0; i_1658_++) {
								int i_1659_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1657_]);
								if (i_1659_ != 0) {
									i_1653_ = ((i_1659_ & 0xff00ff) * i_1651_ & ~0xff00ff);
									i_1654_ = ((i_1659_ & 0xff00) * i_1651_ & 0xff0000);
									is[i_1575_++] = ((i_1653_ | i_1654_) >>> 8) + i_1563_;
								} else
									i_1575_++;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1655_;
							i_1575_ += i_1576_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1564_ == 2) {
					if (i_1562_ == 1) {
						int i_1660_ = i_1566_;
						for (int i_1661_ = -i_1561_; i_1661_ < 0; i_1661_++) {
							int i_1662_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1663_ = -i_1560_; i_1663_ < 0; i_1663_++) {
								int i_1664_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1662_]);
								if (i_1664_ != 0) {
									int i_1665_ = is[i_1575_];
									int i_1666_ = i_1664_ + i_1665_;
									int i_1667_ = ((i_1664_ & 0xff00ff) + (i_1665_ & 0xff00ff));
									i_1665_ = ((i_1667_ & 0x1000100) + (i_1666_ - i_1667_ & 0x10000));
									is[i_1575_++] = (i_1666_ - i_1665_ | i_1665_ - (i_1665_ >>> 8));
								} else
									i_1575_++;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1660_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 0) {
						int i_1668_ = i_1566_;
						int i_1669_ = (i_1563_ & 0xff0000) >> 16;
						int i_1670_ = (i_1563_ & 0xff00) >> 8;
						int i_1671_ = i_1563_ & 0xff;
						for (int i_1672_ = -i_1561_; i_1672_ < 0; i_1672_++) {
							int i_1673_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1674_ = -i_1560_; i_1674_ < 0; i_1674_++) {
								int i_1675_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1673_]);
								if (i_1675_ != 0) {
									int i_1676_ = ((i_1675_ & 0xff0000) * i_1669_ & ~0xffffff);
									int i_1677_ = ((i_1675_ & 0xff00) * i_1670_ & 0xff0000);
									int i_1678_ = (i_1675_ & 0xff) * i_1671_ & 0xff00;
									i_1675_ = (i_1676_ | i_1677_ | i_1678_) >>> 8;
									int i_1679_ = is[i_1575_];
									int i_1680_ = i_1675_ + i_1679_;
									int i_1681_ = ((i_1675_ & 0xff00ff) + (i_1679_ & 0xff00ff));
									i_1679_ = ((i_1681_ & 0x1000100) + (i_1680_ - i_1681_ & 0x10000));
									is[i_1575_++] = (i_1680_ - i_1679_ | i_1679_ - (i_1679_ >>> 8));
								} else
									i_1575_++;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1668_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 3) {
						int i_1682_ = i_1566_;
						for (int i_1683_ = -i_1561_; i_1683_ < 0; i_1683_++) {
							int i_1684_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1685_ = -i_1560_; i_1685_ < 0; i_1685_++) {
								int i_1686_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1684_]);
								int i_1687_ = i_1686_ + i_1563_;
								int i_1688_ = ((i_1686_ & 0xff00ff) + (i_1563_ & 0xff00ff));
								int i_1689_ = ((i_1688_ & 0x1000100) + (i_1687_ - i_1688_ & 0x10000));
								i_1686_ = i_1687_ - i_1689_ | i_1689_ - (i_1689_ >>> 8);
								i_1689_ = is[i_1575_];
								i_1687_ = i_1686_ + i_1689_;
								i_1688_ = (i_1686_ & 0xff00ff) + (i_1689_ & 0xff00ff);
								i_1689_ = ((i_1688_ & 0x1000100) + (i_1687_ - i_1688_ & 0x10000));
								is[i_1575_++] = i_1687_ - i_1689_ | i_1689_ - (i_1689_ >>> 8);
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1682_;
							i_1575_ += i_1576_;
						}
					} else if (i_1562_ == 2) {
						int i_1690_ = i_1563_ >>> 24;
						int i_1691_ = 256 - i_1690_;
						int i_1692_ = (i_1563_ & 0xff00ff) * i_1691_ & ~0xff00ff;
						int i_1693_ = (i_1563_ & 0xff00) * i_1691_ & 0xff0000;
						i_1563_ = (i_1692_ | i_1693_) >>> 8;
						int i_1694_ = i_1566_;
						for (int i_1695_ = -i_1561_; i_1695_ < 0; i_1695_++) {
							int i_1696_ = ((i_1567_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1697_ = -i_1560_; i_1697_ < 0; i_1697_++) {
								int i_1698_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1566_ >> 16) + i_1696_]);
								if (i_1698_ != 0) {
									i_1692_ = ((i_1698_ & 0xff00ff) * i_1690_ & ~0xff00ff);
									i_1693_ = ((i_1698_ & 0xff00) * i_1690_ & 0xff0000);
									i_1698_ = (((i_1692_ | i_1693_) >>> 8) + i_1563_);
									int i_1699_ = is[i_1575_];
									int i_1700_ = i_1698_ + i_1699_;
									int i_1701_ = ((i_1698_ & 0xff00ff) + (i_1699_ & 0xff00ff));
									i_1699_ = ((i_1701_ & 0x1000100) + (i_1700_ - i_1701_ & 0x10000));
									is[i_1575_++] = (i_1700_ - i_1699_ | i_1699_ - (i_1699_ >>> 8));
								} else
									i_1575_++;
								i_1566_ += i_1571_;
							}
							i_1567_ += i_1572_;
							i_1566_ = i_1694_;
							i_1575_ += i_1576_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface8_Impl1_Impl2 method729() {
		return new Class12(((Class61_Sub3_Sub1) this).anInt9358, ((Class61_Sub3_Sub1) this).anInt9325, ((Class61_Sub3_Sub1) this).anIntArray10093);
	}

	public void method722(int i, int i_1702_, int i_1703_) {
		throw new IllegalStateException("");
	}

	void method754(boolean bool, boolean bool_1704_, boolean bool_1705_, int i, int i_1706_, float f, int i_1707_, int i_1708_, int i_1709_, int i_1710_, int i_1711_, int i_1712_, boolean bool_1713_) {
		if (i_1707_ > 0 && i_1708_ > 0 && (bool || bool_1704_)) {
			int i_1714_ = 0;
			int i_1715_ = 0;
			int i_1716_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
			int i_1717_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
			int i_1718_ = (i_1716_ << 16) / i_1707_;
			int i_1719_ = (i_1717_ << 16) / i_1708_;
			if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
				int i_1720_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_1718_ - 1) / i_1718_);
				i += i_1720_;
				i_1714_ += (i_1720_ * i_1718_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
				int i_1721_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_1719_ - 1) / i_1719_);
				i_1706_ += i_1721_;
				i_1715_ += (i_1721_ * i_1719_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9358 < i_1716_)
				i_1707_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_1714_ + i_1718_ - 1) / i_1718_;
			if (((Class61_Sub3_Sub1) this).anInt9325 < i_1717_)
				i_1708_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_1715_ + i_1719_ - 1) / i_1719_;
			int i_1722_ = i + i_1706_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_1723_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_1707_);
			if (i_1706_ + i_1708_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1708_ -= (i_1706_ + i_1708_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_1706_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1724_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1706_);
				i_1708_ -= i_1724_;
				i_1722_ += i_1724_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_1715_ += i_1719_ * i_1724_;
			}
			if (i + i_1707_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1725_ = (i + i_1707_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1707_ -= i_1725_;
				i_1723_ += i_1725_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1726_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1707_ -= i_1726_;
				i_1722_ += i_1726_;
				i_1714_ += i_1718_ * i_1726_;
				i_1723_ += i_1726_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_1711_ == 0) {
				if (i_1709_ == 1) {
					int i_1727_ = i_1714_;
					for (int i_1728_ = -i_1708_; i_1728_ < 0; i_1728_++) {
						int i_1729_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1730_ = -i_1707_; i_1730_ < 0; i_1730_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								if (bool)
									is[i_1722_] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1729_]);
								if (bool_1704_ && bool_1713_)
									fs[i_1722_] = f;
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1727_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 0) {
					int i_1731_ = (i_1710_ & 0xff0000) >> 16;
					int i_1732_ = (i_1710_ & 0xff00) >> 8;
					int i_1733_ = i_1710_ & 0xff;
					int i_1734_ = i_1714_;
					for (int i_1735_ = -i_1708_; i_1735_ < 0; i_1735_++) {
						int i_1736_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1737_ = -i_1707_; i_1737_ < 0; i_1737_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								if (bool) {
									int i_1738_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1736_]);
									int i_1739_ = ((i_1738_ & 0xff0000) * i_1731_ & ~0xffffff);
									int i_1740_ = ((i_1738_ & 0xff00) * i_1732_ & 0xff0000);
									int i_1741_ = (i_1738_ & 0xff) * i_1733_ & 0xff00;
									is[i_1722_] = (i_1739_ | i_1740_ | i_1741_) >>> 8;
								}
								if (bool_1704_ && bool_1713_)
									fs[i_1722_] = f;
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1734_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 3) {
					int i_1742_ = i_1714_;
					for (int i_1743_ = -i_1708_; i_1743_ < 0; i_1743_++) {
						int i_1744_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1745_ = -i_1707_; i_1745_ < 0; i_1745_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								if (bool) {
									int i_1746_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1744_]);
									int i_1747_ = i_1746_ + i_1710_;
									int i_1748_ = ((i_1746_ & 0xff00ff) + (i_1710_ & 0xff00ff));
									int i_1749_ = ((i_1748_ & 0x1000100) + (i_1747_ - i_1748_ & 0x10000));
									is[i_1722_] = (i_1747_ - i_1749_ | i_1749_ - (i_1749_ >>> 8));
								}
								if (bool_1704_ && bool_1713_)
									fs[i_1722_] = f;
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1742_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 2) {
					int i_1750_ = i_1710_ >>> 24;
					int i_1751_ = 256 - i_1750_;
					int i_1752_ = (i_1710_ & 0xff00ff) * i_1751_ & ~0xff00ff;
					int i_1753_ = (i_1710_ & 0xff00) * i_1751_ & 0xff0000;
					i_1710_ = (i_1752_ | i_1753_) >>> 8;
					int i_1754_ = i_1714_;
					for (int i_1755_ = -i_1708_; i_1755_ < 0; i_1755_++) {
						int i_1756_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1757_ = -i_1707_; i_1757_ < 0; i_1757_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								if (bool) {
									int i_1758_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1756_]);
									i_1752_ = ((i_1758_ & 0xff00ff) * i_1750_ & ~0xff00ff);
									i_1753_ = ((i_1758_ & 0xff00) * i_1750_ & 0xff0000);
									is[i_1722_] = (((i_1752_ | i_1753_) >>> 8) + i_1710_);
								}
								if (bool_1704_ && bool_1713_)
									fs[i_1722_] = f;
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1754_;
						i_1722_ += i_1723_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1711_ == 1) {
				if (i_1709_ == 1) {
					int i_1759_ = i_1714_;
					for (int i_1760_ = -i_1708_; i_1760_ < 0; i_1760_++) {
						int i_1761_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1762_ = -i_1707_; i_1762_ < 0; i_1762_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								int i_1763_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1761_]);
								if (i_1763_ != 0) {
									if (bool)
										is[i_1722_] = i_1763_;
									if (bool_1704_ && bool_1713_)
										fs[i_1722_] = f;
								}
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1759_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 0) {
					int i_1764_ = i_1714_;
					if ((i_1710_ & 0xffffff) == 16777215) {
						int i_1765_ = i_1710_ >>> 24;
						int i_1766_ = 256 - i_1765_;
						for (int i_1767_ = -i_1708_; i_1767_ < 0; i_1767_++) {
							int i_1768_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1769_ = -i_1707_; i_1769_ < 0; i_1769_++) {
								if (!bool_1704_ || f < fs[i_1722_]) {
									int i_1770_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1768_]);
									if (i_1770_ != 0) {
										if (bool) {
											int i_1771_ = is[i_1722_];
											is[i_1722_] = (((((i_1770_ & 0xff00ff) * i_1765_) + ((i_1771_ & 0xff00ff) * i_1766_)) & ~0xff00ff) + ((((i_1770_ & 0xff00) * i_1765_) + ((i_1771_ & 0xff00) * i_1766_)) & 0xff0000)) >> 8;
										}
										if (bool_1704_ && bool_1713_)
											fs[i_1722_] = f;
									}
								}
								i_1714_ += i_1718_;
								i_1722_++;
							}
							i_1715_ += i_1719_;
							i_1714_ = i_1764_;
							i_1722_ += i_1723_;
						}
					} else {
						int i_1772_ = (i_1710_ & 0xff0000) >> 16;
						int i_1773_ = (i_1710_ & 0xff00) >> 8;
						int i_1774_ = i_1710_ & 0xff;
						int i_1775_ = i_1710_ >>> 24;
						int i_1776_ = 256 - i_1775_;
						for (int i_1777_ = -i_1708_; i_1777_ < 0; i_1777_++) {
							int i_1778_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1779_ = -i_1707_; i_1779_ < 0; i_1779_++) {
								if (!bool_1704_ || f < fs[i_1722_]) {
									int i_1780_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1778_]);
									if (i_1780_ != 0) {
										if (i_1775_ != 255) {
											if (bool) {
												int i_1781_ = (((i_1780_ & 0xff0000) * i_1772_) & ~0xffffff);
												int i_1782_ = (((i_1780_ & 0xff00) * i_1773_) & 0xff0000);
												int i_1783_ = (((i_1780_ & 0xff) * i_1774_) & 0xff00);
												i_1780_ = (i_1781_ | i_1782_ | i_1783_) >>> 8;
												int i_1784_ = is[i_1722_];
												is[i_1722_] = (((((i_1780_ & 0xff00ff) * i_1775_) + ((i_1784_ & 0xff00ff) * i_1776_)) & ~0xff00ff) + ((((i_1780_ & 0xff00) * i_1775_) + ((i_1784_ & 0xff00) * i_1776_)) & 0xff0000)) >> 8;
											}
											if (bool_1704_ && bool_1713_)
												fs[i_1722_] = f;
										} else {
											if (bool) {
												int i_1785_ = (((i_1780_ & 0xff0000) * i_1772_) & ~0xffffff);
												int i_1786_ = (((i_1780_ & 0xff00) * i_1773_) & 0xff0000);
												int i_1787_ = (((i_1780_ & 0xff) * i_1774_) & 0xff00);
												is[i_1722_] = (i_1785_ | i_1786_ | i_1787_) >>> 8;
											}
											if (bool_1704_ && bool_1713_)
												fs[i_1722_] = f;
										}
									}
								}
								i_1714_ += i_1718_;
								i_1722_++;
							}
							i_1715_ += i_1719_;
							i_1714_ = i_1764_;
							i_1722_ += i_1723_;
						}
					}
				} else if (i_1709_ == 3) {
					int i_1788_ = i_1714_;
					int i_1789_ = i_1710_ >>> 24;
					int i_1790_ = 256 - i_1789_;
					for (int i_1791_ = -i_1708_; i_1791_ < 0; i_1791_++) {
						int i_1792_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1793_ = -i_1707_; i_1793_ < 0; i_1793_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								if (bool) {
									int i_1794_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1792_]);
									int i_1795_ = i_1794_ + i_1710_;
									int i_1796_ = ((i_1794_ & 0xff00ff) + (i_1710_ & 0xff00ff));
									int i_1797_ = ((i_1796_ & 0x1000100) + (i_1795_ - i_1796_ & 0x10000));
									i_1797_ = (i_1795_ - i_1797_ | i_1797_ - (i_1797_ >>> 8));
									if (i_1794_ == 0 && i_1789_ != 255) {
										i_1794_ = i_1797_;
										i_1797_ = is[i_1722_];
										i_1797_ = ((((i_1794_ & 0xff00ff) * i_1789_ + ((i_1797_ & 0xff00ff) * i_1790_)) & ~0xff00ff) + (((i_1794_ & 0xff00) * i_1789_ + ((i_1797_ & 0xff00) * i_1790_)) & 0xff0000)) >> 8;
									}
									is[i_1722_] = i_1797_;
								}
								if (bool_1704_ && bool_1713_)
									fs[i_1722_] = f;
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1788_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 2) {
					int i_1798_ = i_1710_ >>> 24;
					int i_1799_ = 256 - i_1798_;
					int i_1800_ = (i_1710_ & 0xff00ff) * i_1799_ & ~0xff00ff;
					int i_1801_ = (i_1710_ & 0xff00) * i_1799_ & 0xff0000;
					i_1710_ = (i_1800_ | i_1801_) >>> 8;
					int i_1802_ = i_1714_;
					for (int i_1803_ = -i_1708_; i_1803_ < 0; i_1803_++) {
						int i_1804_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1805_ = -i_1707_; i_1805_ < 0; i_1805_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								int i_1806_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1804_]);
								if (i_1806_ != 0) {
									if (bool) {
										i_1800_ = ((i_1806_ & 0xff00ff) * i_1798_ & ~0xff00ff);
										i_1801_ = ((i_1806_ & 0xff00) * i_1798_ & 0xff0000);
										is[i_1722_] = ((i_1800_ | i_1801_) >>> 8) + i_1710_;
									}
									if (bool_1704_ && bool_1713_)
										fs[i_1722_] = f;
								}
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1802_;
						i_1722_ += i_1723_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1711_ == 2) {
				if (i_1709_ == 1) {
					int i_1807_ = i_1714_;
					for (int i_1808_ = -i_1708_; i_1808_ < 0; i_1808_++) {
						int i_1809_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1810_ = -i_1707_; i_1810_ < 0; i_1810_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								int i_1811_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1809_]);
								if (i_1811_ != 0) {
									if (bool) {
										int i_1812_ = is[i_1722_];
										int i_1813_ = i_1811_ + i_1812_;
										int i_1814_ = ((i_1811_ & 0xff00ff) + (i_1812_ & 0xff00ff));
										i_1812_ = ((i_1814_ & 0x1000100) + (i_1813_ - i_1814_ & 0x10000));
										is[i_1722_] = (i_1813_ - i_1812_ | i_1812_ - (i_1812_ >>> 8));
									}
									if (bool_1704_ && bool_1713_)
										fs[i_1722_] = f;
								}
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1807_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 0) {
					int i_1815_ = i_1714_;
					int i_1816_ = (i_1710_ & 0xff0000) >> 16;
					int i_1817_ = (i_1710_ & 0xff00) >> 8;
					int i_1818_ = i_1710_ & 0xff;
					for (int i_1819_ = -i_1708_; i_1819_ < 0; i_1819_++) {
						int i_1820_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1821_ = -i_1707_; i_1821_ < 0; i_1821_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								int i_1822_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1820_]);
								if (i_1822_ != 0) {
									if (bool) {
										int i_1823_ = ((i_1822_ & 0xff0000) * i_1816_ & ~0xffffff);
										int i_1824_ = ((i_1822_ & 0xff00) * i_1817_ & 0xff0000);
										int i_1825_ = ((i_1822_ & 0xff) * i_1818_ & 0xff00);
										i_1822_ = (i_1823_ | i_1824_ | i_1825_) >>> 8;
										int i_1826_ = is[i_1722_];
										int i_1827_ = i_1822_ + i_1826_;
										int i_1828_ = ((i_1822_ & 0xff00ff) + (i_1826_ & 0xff00ff));
										i_1826_ = ((i_1828_ & 0x1000100) + (i_1827_ - i_1828_ & 0x10000));
										is[i_1722_] = (i_1827_ - i_1826_ | i_1826_ - (i_1826_ >>> 8));
									}
									if (bool_1704_ && bool_1713_)
										fs[i_1722_] = f;
								}
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1815_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 3) {
					int i_1829_ = i_1714_;
					for (int i_1830_ = -i_1708_; i_1830_ < 0; i_1830_++) {
						int i_1831_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1832_ = -i_1707_; i_1832_ < 0; i_1832_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								if (bool) {
									int i_1833_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1831_]);
									int i_1834_ = i_1833_ + i_1710_;
									int i_1835_ = ((i_1833_ & 0xff00ff) + (i_1710_ & 0xff00ff));
									int i_1836_ = ((i_1835_ & 0x1000100) + (i_1834_ - i_1835_ & 0x10000));
									i_1833_ = (i_1834_ - i_1836_ | i_1836_ - (i_1836_ >>> 8));
									i_1836_ = is[i_1722_];
									i_1834_ = i_1833_ + i_1836_;
									i_1835_ = (i_1833_ & 0xff00ff) + (i_1836_ & 0xff00ff);
									i_1836_ = ((i_1835_ & 0x1000100) + (i_1834_ - i_1835_ & 0x10000));
									is[i_1722_] = (i_1834_ - i_1836_ | i_1836_ - (i_1836_ >>> 8));
								}
								if (bool_1704_ && bool_1713_)
									fs[i_1722_] = f;
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1829_;
						i_1722_ += i_1723_;
					}
				} else if (i_1709_ == 2) {
					int i_1837_ = i_1710_ >>> 24;
					int i_1838_ = 256 - i_1837_;
					int i_1839_ = (i_1710_ & 0xff00ff) * i_1838_ & ~0xff00ff;
					int i_1840_ = (i_1710_ & 0xff00) * i_1838_ & 0xff0000;
					i_1710_ = (i_1839_ | i_1840_) >>> 8;
					int i_1841_ = i_1714_;
					for (int i_1842_ = -i_1708_; i_1842_ < 0; i_1842_++) {
						int i_1843_ = ((i_1715_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1844_ = -i_1707_; i_1844_ < 0; i_1844_++) {
							if (!bool_1704_ || f < fs[i_1722_]) {
								int i_1845_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1714_ >> 16) + i_1843_]);
								if (i_1845_ != 0) {
									if (bool) {
										i_1839_ = ((i_1845_ & 0xff00ff) * i_1837_ & ~0xff00ff);
										i_1840_ = ((i_1845_ & 0xff00) * i_1837_ & 0xff0000);
										i_1845_ = (((i_1839_ | i_1840_) >>> 8) + i_1710_);
										int i_1846_ = is[i_1722_];
										int i_1847_ = i_1845_ + i_1846_;
										int i_1848_ = ((i_1845_ & 0xff00ff) + (i_1846_ & 0xff00ff));
										i_1846_ = ((i_1848_ & 0x1000100) + (i_1847_ - i_1848_ & 0x10000));
										is[i_1722_] = (i_1847_ - i_1846_ | i_1846_ - (i_1846_ >>> 8));
									}
									if (bool_1704_ && bool_1713_)
										fs[i_1722_] = f;
								}
							}
							i_1714_ += i_1718_;
							i_1722_++;
						}
						i_1715_ += i_1719_;
						i_1714_ = i_1841_;
						i_1722_ += i_1723_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method748(boolean bool, boolean bool_1849_, boolean bool_1850_, int i, int i_1851_, float f, int i_1852_, int i_1853_, int i_1854_, int i_1855_, int i_1856_, int i_1857_, boolean bool_1858_) {
		if (i_1852_ > 0 && i_1853_ > 0 && (bool || bool_1849_)) {
			int i_1859_ = 0;
			int i_1860_ = 0;
			int i_1861_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
			int i_1862_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
			int i_1863_ = (i_1861_ << 16) / i_1852_;
			int i_1864_ = (i_1862_ << 16) / i_1853_;
			if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
				int i_1865_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_1863_ - 1) / i_1863_);
				i += i_1865_;
				i_1859_ += (i_1865_ * i_1863_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
				int i_1866_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_1864_ - 1) / i_1864_);
				i_1851_ += i_1866_;
				i_1860_ += (i_1866_ * i_1864_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9358 < i_1861_)
				i_1852_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_1859_ + i_1863_ - 1) / i_1863_;
			if (((Class61_Sub3_Sub1) this).anInt9325 < i_1862_)
				i_1853_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_1860_ + i_1864_ - 1) / i_1864_;
			int i_1867_ = i + i_1851_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_1868_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_1852_);
			if (i_1851_ + i_1853_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1853_ -= (i_1851_ + i_1853_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_1851_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1869_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1851_);
				i_1853_ -= i_1869_;
				i_1867_ += i_1869_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_1860_ += i_1864_ * i_1869_;
			}
			if (i + i_1852_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1870_ = (i + i_1852_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1852_ -= i_1870_;
				i_1868_ += i_1870_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1871_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1852_ -= i_1871_;
				i_1867_ += i_1871_;
				i_1859_ += i_1863_ * i_1871_;
				i_1868_ += i_1871_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_1856_ == 0) {
				if (i_1854_ == 1) {
					int i_1872_ = i_1859_;
					for (int i_1873_ = -i_1853_; i_1873_ < 0; i_1873_++) {
						int i_1874_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1875_ = -i_1852_; i_1875_ < 0; i_1875_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								if (bool)
									is[i_1867_] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1874_]);
								if (bool_1849_ && bool_1858_)
									fs[i_1867_] = f;
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1872_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 0) {
					int i_1876_ = (i_1855_ & 0xff0000) >> 16;
					int i_1877_ = (i_1855_ & 0xff00) >> 8;
					int i_1878_ = i_1855_ & 0xff;
					int i_1879_ = i_1859_;
					for (int i_1880_ = -i_1853_; i_1880_ < 0; i_1880_++) {
						int i_1881_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1882_ = -i_1852_; i_1882_ < 0; i_1882_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								if (bool) {
									int i_1883_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1881_]);
									int i_1884_ = ((i_1883_ & 0xff0000) * i_1876_ & ~0xffffff);
									int i_1885_ = ((i_1883_ & 0xff00) * i_1877_ & 0xff0000);
									int i_1886_ = (i_1883_ & 0xff) * i_1878_ & 0xff00;
									is[i_1867_] = (i_1884_ | i_1885_ | i_1886_) >>> 8;
								}
								if (bool_1849_ && bool_1858_)
									fs[i_1867_] = f;
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1879_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 3) {
					int i_1887_ = i_1859_;
					for (int i_1888_ = -i_1853_; i_1888_ < 0; i_1888_++) {
						int i_1889_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1890_ = -i_1852_; i_1890_ < 0; i_1890_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								if (bool) {
									int i_1891_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1889_]);
									int i_1892_ = i_1891_ + i_1855_;
									int i_1893_ = ((i_1891_ & 0xff00ff) + (i_1855_ & 0xff00ff));
									int i_1894_ = ((i_1893_ & 0x1000100) + (i_1892_ - i_1893_ & 0x10000));
									is[i_1867_] = (i_1892_ - i_1894_ | i_1894_ - (i_1894_ >>> 8));
								}
								if (bool_1849_ && bool_1858_)
									fs[i_1867_] = f;
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1887_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 2) {
					int i_1895_ = i_1855_ >>> 24;
					int i_1896_ = 256 - i_1895_;
					int i_1897_ = (i_1855_ & 0xff00ff) * i_1896_ & ~0xff00ff;
					int i_1898_ = (i_1855_ & 0xff00) * i_1896_ & 0xff0000;
					i_1855_ = (i_1897_ | i_1898_) >>> 8;
					int i_1899_ = i_1859_;
					for (int i_1900_ = -i_1853_; i_1900_ < 0; i_1900_++) {
						int i_1901_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1902_ = -i_1852_; i_1902_ < 0; i_1902_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								if (bool) {
									int i_1903_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1901_]);
									i_1897_ = ((i_1903_ & 0xff00ff) * i_1895_ & ~0xff00ff);
									i_1898_ = ((i_1903_ & 0xff00) * i_1895_ & 0xff0000);
									is[i_1867_] = (((i_1897_ | i_1898_) >>> 8) + i_1855_);
								}
								if (bool_1849_ && bool_1858_)
									fs[i_1867_] = f;
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1899_;
						i_1867_ += i_1868_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1856_ == 1) {
				if (i_1854_ == 1) {
					int i_1904_ = i_1859_;
					for (int i_1905_ = -i_1853_; i_1905_ < 0; i_1905_++) {
						int i_1906_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1907_ = -i_1852_; i_1907_ < 0; i_1907_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								int i_1908_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1906_]);
								if (i_1908_ != 0) {
									if (bool)
										is[i_1867_] = i_1908_;
									if (bool_1849_ && bool_1858_)
										fs[i_1867_] = f;
								}
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1904_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 0) {
					int i_1909_ = i_1859_;
					if ((i_1855_ & 0xffffff) == 16777215) {
						int i_1910_ = i_1855_ >>> 24;
						int i_1911_ = 256 - i_1910_;
						for (int i_1912_ = -i_1853_; i_1912_ < 0; i_1912_++) {
							int i_1913_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1914_ = -i_1852_; i_1914_ < 0; i_1914_++) {
								if (!bool_1849_ || f < fs[i_1867_]) {
									int i_1915_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1913_]);
									if (i_1915_ != 0) {
										if (bool) {
											int i_1916_ = is[i_1867_];
											is[i_1867_] = (((((i_1915_ & 0xff00ff) * i_1910_) + ((i_1916_ & 0xff00ff) * i_1911_)) & ~0xff00ff) + ((((i_1915_ & 0xff00) * i_1910_) + ((i_1916_ & 0xff00) * i_1911_)) & 0xff0000)) >> 8;
										}
										if (bool_1849_ && bool_1858_)
											fs[i_1867_] = f;
									}
								}
								i_1859_ += i_1863_;
								i_1867_++;
							}
							i_1860_ += i_1864_;
							i_1859_ = i_1909_;
							i_1867_ += i_1868_;
						}
					} else {
						int i_1917_ = (i_1855_ & 0xff0000) >> 16;
						int i_1918_ = (i_1855_ & 0xff00) >> 8;
						int i_1919_ = i_1855_ & 0xff;
						int i_1920_ = i_1855_ >>> 24;
						int i_1921_ = 256 - i_1920_;
						for (int i_1922_ = -i_1853_; i_1922_ < 0; i_1922_++) {
							int i_1923_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_1924_ = -i_1852_; i_1924_ < 0; i_1924_++) {
								if (!bool_1849_ || f < fs[i_1867_]) {
									int i_1925_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1923_]);
									if (i_1925_ != 0) {
										if (i_1920_ != 255) {
											if (bool) {
												int i_1926_ = (((i_1925_ & 0xff0000) * i_1917_) & ~0xffffff);
												int i_1927_ = (((i_1925_ & 0xff00) * i_1918_) & 0xff0000);
												int i_1928_ = (((i_1925_ & 0xff) * i_1919_) & 0xff00);
												i_1925_ = (i_1926_ | i_1927_ | i_1928_) >>> 8;
												int i_1929_ = is[i_1867_];
												is[i_1867_] = (((((i_1925_ & 0xff00ff) * i_1920_) + ((i_1929_ & 0xff00ff) * i_1921_)) & ~0xff00ff) + ((((i_1925_ & 0xff00) * i_1920_) + ((i_1929_ & 0xff00) * i_1921_)) & 0xff0000)) >> 8;
											}
											if (bool_1849_ && bool_1858_)
												fs[i_1867_] = f;
										} else {
											if (bool) {
												int i_1930_ = (((i_1925_ & 0xff0000) * i_1917_) & ~0xffffff);
												int i_1931_ = (((i_1925_ & 0xff00) * i_1918_) & 0xff0000);
												int i_1932_ = (((i_1925_ & 0xff) * i_1919_) & 0xff00);
												is[i_1867_] = (i_1930_ | i_1931_ | i_1932_) >>> 8;
											}
											if (bool_1849_ && bool_1858_)
												fs[i_1867_] = f;
										}
									}
								}
								i_1859_ += i_1863_;
								i_1867_++;
							}
							i_1860_ += i_1864_;
							i_1859_ = i_1909_;
							i_1867_ += i_1868_;
						}
					}
				} else if (i_1854_ == 3) {
					int i_1933_ = i_1859_;
					int i_1934_ = i_1855_ >>> 24;
					int i_1935_ = 256 - i_1934_;
					for (int i_1936_ = -i_1853_; i_1936_ < 0; i_1936_++) {
						int i_1937_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1938_ = -i_1852_; i_1938_ < 0; i_1938_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								if (bool) {
									int i_1939_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1937_]);
									int i_1940_ = i_1939_ + i_1855_;
									int i_1941_ = ((i_1939_ & 0xff00ff) + (i_1855_ & 0xff00ff));
									int i_1942_ = ((i_1941_ & 0x1000100) + (i_1940_ - i_1941_ & 0x10000));
									i_1942_ = (i_1940_ - i_1942_ | i_1942_ - (i_1942_ >>> 8));
									if (i_1939_ == 0 && i_1934_ != 255) {
										i_1939_ = i_1942_;
										i_1942_ = is[i_1867_];
										i_1942_ = ((((i_1939_ & 0xff00ff) * i_1934_ + ((i_1942_ & 0xff00ff) * i_1935_)) & ~0xff00ff) + (((i_1939_ & 0xff00) * i_1934_ + ((i_1942_ & 0xff00) * i_1935_)) & 0xff0000)) >> 8;
									}
									is[i_1867_] = i_1942_;
								}
								if (bool_1849_ && bool_1858_)
									fs[i_1867_] = f;
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1933_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 2) {
					int i_1943_ = i_1855_ >>> 24;
					int i_1944_ = 256 - i_1943_;
					int i_1945_ = (i_1855_ & 0xff00ff) * i_1944_ & ~0xff00ff;
					int i_1946_ = (i_1855_ & 0xff00) * i_1944_ & 0xff0000;
					i_1855_ = (i_1945_ | i_1946_) >>> 8;
					int i_1947_ = i_1859_;
					for (int i_1948_ = -i_1853_; i_1948_ < 0; i_1948_++) {
						int i_1949_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1950_ = -i_1852_; i_1950_ < 0; i_1950_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								int i_1951_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1949_]);
								if (i_1951_ != 0) {
									if (bool) {
										i_1945_ = ((i_1951_ & 0xff00ff) * i_1943_ & ~0xff00ff);
										i_1946_ = ((i_1951_ & 0xff00) * i_1943_ & 0xff0000);
										is[i_1867_] = ((i_1945_ | i_1946_) >>> 8) + i_1855_;
									}
									if (bool_1849_ && bool_1858_)
										fs[i_1867_] = f;
								}
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1947_;
						i_1867_ += i_1868_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_1856_ == 2) {
				if (i_1854_ == 1) {
					int i_1952_ = i_1859_;
					for (int i_1953_ = -i_1853_; i_1953_ < 0; i_1953_++) {
						int i_1954_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1955_ = -i_1852_; i_1955_ < 0; i_1955_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								int i_1956_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1954_]);
								if (i_1956_ != 0) {
									if (bool) {
										int i_1957_ = is[i_1867_];
										int i_1958_ = i_1956_ + i_1957_;
										int i_1959_ = ((i_1956_ & 0xff00ff) + (i_1957_ & 0xff00ff));
										i_1957_ = ((i_1959_ & 0x1000100) + (i_1958_ - i_1959_ & 0x10000));
										is[i_1867_] = (i_1958_ - i_1957_ | i_1957_ - (i_1957_ >>> 8));
									}
									if (bool_1849_ && bool_1858_)
										fs[i_1867_] = f;
								}
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1952_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 0) {
					int i_1960_ = i_1859_;
					int i_1961_ = (i_1855_ & 0xff0000) >> 16;
					int i_1962_ = (i_1855_ & 0xff00) >> 8;
					int i_1963_ = i_1855_ & 0xff;
					for (int i_1964_ = -i_1853_; i_1964_ < 0; i_1964_++) {
						int i_1965_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1966_ = -i_1852_; i_1966_ < 0; i_1966_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								int i_1967_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1965_]);
								if (i_1967_ != 0) {
									if (bool) {
										int i_1968_ = ((i_1967_ & 0xff0000) * i_1961_ & ~0xffffff);
										int i_1969_ = ((i_1967_ & 0xff00) * i_1962_ & 0xff0000);
										int i_1970_ = ((i_1967_ & 0xff) * i_1963_ & 0xff00);
										i_1967_ = (i_1968_ | i_1969_ | i_1970_) >>> 8;
										int i_1971_ = is[i_1867_];
										int i_1972_ = i_1967_ + i_1971_;
										int i_1973_ = ((i_1967_ & 0xff00ff) + (i_1971_ & 0xff00ff));
										i_1971_ = ((i_1973_ & 0x1000100) + (i_1972_ - i_1973_ & 0x10000));
										is[i_1867_] = (i_1972_ - i_1971_ | i_1971_ - (i_1971_ >>> 8));
									}
									if (bool_1849_ && bool_1858_)
										fs[i_1867_] = f;
								}
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1960_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 3) {
					int i_1974_ = i_1859_;
					for (int i_1975_ = -i_1853_; i_1975_ < 0; i_1975_++) {
						int i_1976_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1977_ = -i_1852_; i_1977_ < 0; i_1977_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								if (bool) {
									int i_1978_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1976_]);
									int i_1979_ = i_1978_ + i_1855_;
									int i_1980_ = ((i_1978_ & 0xff00ff) + (i_1855_ & 0xff00ff));
									int i_1981_ = ((i_1980_ & 0x1000100) + (i_1979_ - i_1980_ & 0x10000));
									i_1978_ = (i_1979_ - i_1981_ | i_1981_ - (i_1981_ >>> 8));
									i_1981_ = is[i_1867_];
									i_1979_ = i_1978_ + i_1981_;
									i_1980_ = (i_1978_ & 0xff00ff) + (i_1981_ & 0xff00ff);
									i_1981_ = ((i_1980_ & 0x1000100) + (i_1979_ - i_1980_ & 0x10000));
									is[i_1867_] = (i_1979_ - i_1981_ | i_1981_ - (i_1981_ >>> 8));
								}
								if (bool_1849_ && bool_1858_)
									fs[i_1867_] = f;
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1974_;
						i_1867_ += i_1868_;
					}
				} else if (i_1854_ == 2) {
					int i_1982_ = i_1855_ >>> 24;
					int i_1983_ = 256 - i_1982_;
					int i_1984_ = (i_1855_ & 0xff00ff) * i_1983_ & ~0xff00ff;
					int i_1985_ = (i_1855_ & 0xff00) * i_1983_ & 0xff0000;
					i_1855_ = (i_1984_ | i_1985_) >>> 8;
					int i_1986_ = i_1859_;
					for (int i_1987_ = -i_1853_; i_1987_ < 0; i_1987_++) {
						int i_1988_ = ((i_1860_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_1989_ = -i_1852_; i_1989_ < 0; i_1989_++) {
							if (!bool_1849_ || f < fs[i_1867_]) {
								int i_1990_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_1859_ >> 16) + i_1988_]);
								if (i_1990_ != 0) {
									if (bool) {
										i_1984_ = ((i_1990_ & 0xff00ff) * i_1982_ & ~0xff00ff);
										i_1985_ = ((i_1990_ & 0xff00) * i_1982_ & 0xff0000);
										i_1990_ = (((i_1984_ | i_1985_) >>> 8) + i_1855_);
										int i_1991_ = is[i_1867_];
										int i_1992_ = i_1990_ + i_1991_;
										int i_1993_ = ((i_1990_ & 0xff00ff) + (i_1991_ & 0xff00ff));
										i_1991_ = ((i_1993_ & 0x1000100) + (i_1992_ - i_1993_ & 0x10000));
										is[i_1867_] = (i_1992_ - i_1991_ | i_1991_ - (i_1991_ >>> 8));
									}
									if (bool_1849_ && bool_1858_)
										fs[i_1867_] = f;
								}
							}
							i_1859_ += i_1863_;
							i_1867_++;
						}
						i_1860_ += i_1864_;
						i_1859_ = i_1986_;
						i_1867_ += i_1868_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method749(boolean bool, boolean bool_1994_, boolean bool_1995_, int i, int i_1996_, float f, int i_1997_, int i_1998_, int i_1999_, int i_2000_, int i_2001_, int i_2002_, boolean bool_2003_) {
		if (i_1997_ > 0 && i_1998_ > 0 && (bool || bool_1994_)) {
			int i_2004_ = 0;
			int i_2005_ = 0;
			int i_2006_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
			int i_2007_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
			int i_2008_ = (i_2006_ << 16) / i_1997_;
			int i_2009_ = (i_2007_ << 16) / i_1998_;
			if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
				int i_2010_ = (((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_2008_ - 1) / i_2008_);
				i += i_2010_;
				i_2004_ += (i_2010_ * i_2008_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
				int i_2011_ = (((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_2009_ - 1) / i_2009_);
				i_1996_ += i_2011_;
				i_2005_ += (i_2011_ * i_2009_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub1) this).anInt9358 < i_2006_)
				i_1997_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_2004_ + i_2008_ - 1) / i_2008_;
			if (((Class61_Sub3_Sub1) this).anInt9325 < i_2007_)
				i_1998_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_2005_ + i_2009_ - 1) / i_2009_;
			int i_2012_ = i + i_1996_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2013_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_1997_);
			if (i_1996_ + i_1998_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1998_ -= (i_1996_ + i_1998_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_1996_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2014_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1996_);
				i_1998_ -= i_2014_;
				i_2012_ += i_2014_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2005_ += i_2009_ * i_2014_;
			}
			if (i + i_1997_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2015_ = (i + i_1997_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1997_ -= i_2015_;
				i_2013_ += i_2015_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2016_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1997_ -= i_2016_;
				i_2012_ += i_2016_;
				i_2004_ += i_2008_ * i_2016_;
				i_2013_ += i_2016_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2001_ == 0) {
				if (i_1999_ == 1) {
					int i_2017_ = i_2004_;
					for (int i_2018_ = -i_1998_; i_2018_ < 0; i_2018_++) {
						int i_2019_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2020_ = -i_1997_; i_2020_ < 0; i_2020_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								if (bool)
									is[i_2012_] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2019_]);
								if (bool_1994_ && bool_2003_)
									fs[i_2012_] = f;
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2017_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 0) {
					int i_2021_ = (i_2000_ & 0xff0000) >> 16;
					int i_2022_ = (i_2000_ & 0xff00) >> 8;
					int i_2023_ = i_2000_ & 0xff;
					int i_2024_ = i_2004_;
					for (int i_2025_ = -i_1998_; i_2025_ < 0; i_2025_++) {
						int i_2026_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2027_ = -i_1997_; i_2027_ < 0; i_2027_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								if (bool) {
									int i_2028_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2026_]);
									int i_2029_ = ((i_2028_ & 0xff0000) * i_2021_ & ~0xffffff);
									int i_2030_ = ((i_2028_ & 0xff00) * i_2022_ & 0xff0000);
									int i_2031_ = (i_2028_ & 0xff) * i_2023_ & 0xff00;
									is[i_2012_] = (i_2029_ | i_2030_ | i_2031_) >>> 8;
								}
								if (bool_1994_ && bool_2003_)
									fs[i_2012_] = f;
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2024_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 3) {
					int i_2032_ = i_2004_;
					for (int i_2033_ = -i_1998_; i_2033_ < 0; i_2033_++) {
						int i_2034_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2035_ = -i_1997_; i_2035_ < 0; i_2035_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								if (bool) {
									int i_2036_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2034_]);
									int i_2037_ = i_2036_ + i_2000_;
									int i_2038_ = ((i_2036_ & 0xff00ff) + (i_2000_ & 0xff00ff));
									int i_2039_ = ((i_2038_ & 0x1000100) + (i_2037_ - i_2038_ & 0x10000));
									is[i_2012_] = (i_2037_ - i_2039_ | i_2039_ - (i_2039_ >>> 8));
								}
								if (bool_1994_ && bool_2003_)
									fs[i_2012_] = f;
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2032_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 2) {
					int i_2040_ = i_2000_ >>> 24;
					int i_2041_ = 256 - i_2040_;
					int i_2042_ = (i_2000_ & 0xff00ff) * i_2041_ & ~0xff00ff;
					int i_2043_ = (i_2000_ & 0xff00) * i_2041_ & 0xff0000;
					i_2000_ = (i_2042_ | i_2043_) >>> 8;
					int i_2044_ = i_2004_;
					for (int i_2045_ = -i_1998_; i_2045_ < 0; i_2045_++) {
						int i_2046_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2047_ = -i_1997_; i_2047_ < 0; i_2047_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								if (bool) {
									int i_2048_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2046_]);
									i_2042_ = ((i_2048_ & 0xff00ff) * i_2040_ & ~0xff00ff);
									i_2043_ = ((i_2048_ & 0xff00) * i_2040_ & 0xff0000);
									is[i_2012_] = (((i_2042_ | i_2043_) >>> 8) + i_2000_);
								}
								if (bool_1994_ && bool_2003_)
									fs[i_2012_] = f;
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2044_;
						i_2012_ += i_2013_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2001_ == 1) {
				if (i_1999_ == 1) {
					int i_2049_ = i_2004_;
					for (int i_2050_ = -i_1998_; i_2050_ < 0; i_2050_++) {
						int i_2051_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2052_ = -i_1997_; i_2052_ < 0; i_2052_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								int i_2053_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2051_]);
								if (i_2053_ != 0) {
									if (bool)
										is[i_2012_] = i_2053_;
									if (bool_1994_ && bool_2003_)
										fs[i_2012_] = f;
								}
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2049_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 0) {
					int i_2054_ = i_2004_;
					if ((i_2000_ & 0xffffff) == 16777215) {
						int i_2055_ = i_2000_ >>> 24;
						int i_2056_ = 256 - i_2055_;
						for (int i_2057_ = -i_1998_; i_2057_ < 0; i_2057_++) {
							int i_2058_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2059_ = -i_1997_; i_2059_ < 0; i_2059_++) {
								if (!bool_1994_ || f < fs[i_2012_]) {
									int i_2060_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2058_]);
									if (i_2060_ != 0) {
										if (bool) {
											int i_2061_ = is[i_2012_];
											is[i_2012_] = (((((i_2060_ & 0xff00ff) * i_2055_) + ((i_2061_ & 0xff00ff) * i_2056_)) & ~0xff00ff) + ((((i_2060_ & 0xff00) * i_2055_) + ((i_2061_ & 0xff00) * i_2056_)) & 0xff0000)) >> 8;
										}
										if (bool_1994_ && bool_2003_)
											fs[i_2012_] = f;
									}
								}
								i_2004_ += i_2008_;
								i_2012_++;
							}
							i_2005_ += i_2009_;
							i_2004_ = i_2054_;
							i_2012_ += i_2013_;
						}
					} else {
						int i_2062_ = (i_2000_ & 0xff0000) >> 16;
						int i_2063_ = (i_2000_ & 0xff00) >> 8;
						int i_2064_ = i_2000_ & 0xff;
						int i_2065_ = i_2000_ >>> 24;
						int i_2066_ = 256 - i_2065_;
						for (int i_2067_ = -i_1998_; i_2067_ < 0; i_2067_++) {
							int i_2068_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2069_ = -i_1997_; i_2069_ < 0; i_2069_++) {
								if (!bool_1994_ || f < fs[i_2012_]) {
									int i_2070_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2068_]);
									if (i_2070_ != 0) {
										if (i_2065_ != 255) {
											if (bool) {
												int i_2071_ = (((i_2070_ & 0xff0000) * i_2062_) & ~0xffffff);
												int i_2072_ = (((i_2070_ & 0xff00) * i_2063_) & 0xff0000);
												int i_2073_ = (((i_2070_ & 0xff) * i_2064_) & 0xff00);
												i_2070_ = (i_2071_ | i_2072_ | i_2073_) >>> 8;
												int i_2074_ = is[i_2012_];
												is[i_2012_] = (((((i_2070_ & 0xff00ff) * i_2065_) + ((i_2074_ & 0xff00ff) * i_2066_)) & ~0xff00ff) + ((((i_2070_ & 0xff00) * i_2065_) + ((i_2074_ & 0xff00) * i_2066_)) & 0xff0000)) >> 8;
											}
											if (bool_1994_ && bool_2003_)
												fs[i_2012_] = f;
										} else {
											if (bool) {
												int i_2075_ = (((i_2070_ & 0xff0000) * i_2062_) & ~0xffffff);
												int i_2076_ = (((i_2070_ & 0xff00) * i_2063_) & 0xff0000);
												int i_2077_ = (((i_2070_ & 0xff) * i_2064_) & 0xff00);
												is[i_2012_] = (i_2075_ | i_2076_ | i_2077_) >>> 8;
											}
											if (bool_1994_ && bool_2003_)
												fs[i_2012_] = f;
										}
									}
								}
								i_2004_ += i_2008_;
								i_2012_++;
							}
							i_2005_ += i_2009_;
							i_2004_ = i_2054_;
							i_2012_ += i_2013_;
						}
					}
				} else if (i_1999_ == 3) {
					int i_2078_ = i_2004_;
					int i_2079_ = i_2000_ >>> 24;
					int i_2080_ = 256 - i_2079_;
					for (int i_2081_ = -i_1998_; i_2081_ < 0; i_2081_++) {
						int i_2082_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2083_ = -i_1997_; i_2083_ < 0; i_2083_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								if (bool) {
									int i_2084_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2082_]);
									int i_2085_ = i_2084_ + i_2000_;
									int i_2086_ = ((i_2084_ & 0xff00ff) + (i_2000_ & 0xff00ff));
									int i_2087_ = ((i_2086_ & 0x1000100) + (i_2085_ - i_2086_ & 0x10000));
									i_2087_ = (i_2085_ - i_2087_ | i_2087_ - (i_2087_ >>> 8));
									if (i_2084_ == 0 && i_2079_ != 255) {
										i_2084_ = i_2087_;
										i_2087_ = is[i_2012_];
										i_2087_ = ((((i_2084_ & 0xff00ff) * i_2079_ + ((i_2087_ & 0xff00ff) * i_2080_)) & ~0xff00ff) + (((i_2084_ & 0xff00) * i_2079_ + ((i_2087_ & 0xff00) * i_2080_)) & 0xff0000)) >> 8;
									}
									is[i_2012_] = i_2087_;
								}
								if (bool_1994_ && bool_2003_)
									fs[i_2012_] = f;
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2078_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 2) {
					int i_2088_ = i_2000_ >>> 24;
					int i_2089_ = 256 - i_2088_;
					int i_2090_ = (i_2000_ & 0xff00ff) * i_2089_ & ~0xff00ff;
					int i_2091_ = (i_2000_ & 0xff00) * i_2089_ & 0xff0000;
					i_2000_ = (i_2090_ | i_2091_) >>> 8;
					int i_2092_ = i_2004_;
					for (int i_2093_ = -i_1998_; i_2093_ < 0; i_2093_++) {
						int i_2094_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2095_ = -i_1997_; i_2095_ < 0; i_2095_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								int i_2096_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2094_]);
								if (i_2096_ != 0) {
									if (bool) {
										i_2090_ = ((i_2096_ & 0xff00ff) * i_2088_ & ~0xff00ff);
										i_2091_ = ((i_2096_ & 0xff00) * i_2088_ & 0xff0000);
										is[i_2012_] = ((i_2090_ | i_2091_) >>> 8) + i_2000_;
									}
									if (bool_1994_ && bool_2003_)
										fs[i_2012_] = f;
								}
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2092_;
						i_2012_ += i_2013_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2001_ == 2) {
				if (i_1999_ == 1) {
					int i_2097_ = i_2004_;
					for (int i_2098_ = -i_1998_; i_2098_ < 0; i_2098_++) {
						int i_2099_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2100_ = -i_1997_; i_2100_ < 0; i_2100_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								int i_2101_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2099_]);
								if (i_2101_ != 0) {
									if (bool) {
										int i_2102_ = is[i_2012_];
										int i_2103_ = i_2101_ + i_2102_;
										int i_2104_ = ((i_2101_ & 0xff00ff) + (i_2102_ & 0xff00ff));
										i_2102_ = ((i_2104_ & 0x1000100) + (i_2103_ - i_2104_ & 0x10000));
										is[i_2012_] = (i_2103_ - i_2102_ | i_2102_ - (i_2102_ >>> 8));
									}
									if (bool_1994_ && bool_2003_)
										fs[i_2012_] = f;
								}
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2097_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 0) {
					int i_2105_ = i_2004_;
					int i_2106_ = (i_2000_ & 0xff0000) >> 16;
					int i_2107_ = (i_2000_ & 0xff00) >> 8;
					int i_2108_ = i_2000_ & 0xff;
					for (int i_2109_ = -i_1998_; i_2109_ < 0; i_2109_++) {
						int i_2110_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2111_ = -i_1997_; i_2111_ < 0; i_2111_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								int i_2112_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2110_]);
								if (i_2112_ != 0) {
									if (bool) {
										int i_2113_ = ((i_2112_ & 0xff0000) * i_2106_ & ~0xffffff);
										int i_2114_ = ((i_2112_ & 0xff00) * i_2107_ & 0xff0000);
										int i_2115_ = ((i_2112_ & 0xff) * i_2108_ & 0xff00);
										i_2112_ = (i_2113_ | i_2114_ | i_2115_) >>> 8;
										int i_2116_ = is[i_2012_];
										int i_2117_ = i_2112_ + i_2116_;
										int i_2118_ = ((i_2112_ & 0xff00ff) + (i_2116_ & 0xff00ff));
										i_2116_ = ((i_2118_ & 0x1000100) + (i_2117_ - i_2118_ & 0x10000));
										is[i_2012_] = (i_2117_ - i_2116_ | i_2116_ - (i_2116_ >>> 8));
									}
									if (bool_1994_ && bool_2003_)
										fs[i_2012_] = f;
								}
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2105_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 3) {
					int i_2119_ = i_2004_;
					for (int i_2120_ = -i_1998_; i_2120_ < 0; i_2120_++) {
						int i_2121_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2122_ = -i_1997_; i_2122_ < 0; i_2122_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								if (bool) {
									int i_2123_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2121_]);
									int i_2124_ = i_2123_ + i_2000_;
									int i_2125_ = ((i_2123_ & 0xff00ff) + (i_2000_ & 0xff00ff));
									int i_2126_ = ((i_2125_ & 0x1000100) + (i_2124_ - i_2125_ & 0x10000));
									i_2123_ = (i_2124_ - i_2126_ | i_2126_ - (i_2126_ >>> 8));
									i_2126_ = is[i_2012_];
									i_2124_ = i_2123_ + i_2126_;
									i_2125_ = (i_2123_ & 0xff00ff) + (i_2126_ & 0xff00ff);
									i_2126_ = ((i_2125_ & 0x1000100) + (i_2124_ - i_2125_ & 0x10000));
									is[i_2012_] = (i_2124_ - i_2126_ | i_2126_ - (i_2126_ >>> 8));
								}
								if (bool_1994_ && bool_2003_)
									fs[i_2012_] = f;
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2119_;
						i_2012_ += i_2013_;
					}
				} else if (i_1999_ == 2) {
					int i_2127_ = i_2000_ >>> 24;
					int i_2128_ = 256 - i_2127_;
					int i_2129_ = (i_2000_ & 0xff00ff) * i_2128_ & ~0xff00ff;
					int i_2130_ = (i_2000_ & 0xff00) * i_2128_ & 0xff0000;
					i_2000_ = (i_2129_ | i_2130_) >>> 8;
					int i_2131_ = i_2004_;
					for (int i_2132_ = -i_1998_; i_2132_ < 0; i_2132_++) {
						int i_2133_ = ((i_2005_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
						for (int i_2134_ = -i_1997_; i_2134_ < 0; i_2134_++) {
							if (!bool_1994_ || f < fs[i_2012_]) {
								int i_2135_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2004_ >> 16) + i_2133_]);
								if (i_2135_ != 0) {
									if (bool) {
										i_2129_ = ((i_2135_ & 0xff00ff) * i_2127_ & ~0xff00ff);
										i_2130_ = ((i_2135_ & 0xff00) * i_2127_ & 0xff0000);
										i_2135_ = (((i_2129_ | i_2130_) >>> 8) + i_2000_);
										int i_2136_ = is[i_2012_];
										int i_2137_ = i_2135_ + i_2136_;
										int i_2138_ = ((i_2135_ & 0xff00ff) + (i_2136_ & 0xff00ff));
										i_2136_ = ((i_2138_ & 0x1000100) + (i_2137_ - i_2138_ & 0x10000));
										is[i_2012_] = (i_2137_ - i_2136_ | i_2136_ - (i_2136_ >>> 8));
									}
									if (bool_1994_ && bool_2003_)
										fs[i_2012_] = f;
								}
							}
							i_2004_ += i_2008_;
							i_2012_++;
						}
						i_2005_ += i_2009_;
						i_2004_ = i_2131_;
						i_2012_ += i_2013_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method755(int i, int i_2139_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2140_ = anInt9356;
					while (i_2140_ < 0) {
						int i_2141_ = anInt9339;
						int i_2142_ = anInt9346;
						int i_2143_ = anInt9324;
						int i_2144_ = anInt9347;
						if (i_2142_ >= 0 && i_2143_ >= 0 && i_2142_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0 && i_2143_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							for (/**/; i_2144_ < 0; i_2144_++)
								method757(((i_2143_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2142_ >> 12), i_2141_++, is, i, i_2139_);
						}
						i_2140_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2145_ = anInt9356;
					while (i_2145_ < 0) {
						int i_2146_ = anInt9339;
						int i_2147_ = anInt9346;
						int i_2148_ = anInt9324 + anInt9349;
						int i_2149_ = anInt9347;
						if (i_2147_ >= 0 && i_2147_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0) {
							int i_2150_;
							if ((i_2150_ = (i_2148_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
								i_2150_ = (anInt9341 - i_2150_) / anInt9341;
								i_2149_ += i_2150_;
								i_2148_ += anInt9341 * i_2150_;
								i_2146_ += i_2150_;
							}
							if ((i_2150_ = (i_2148_ - anInt9341) / anInt9341) > i_2149_)
								i_2149_ = i_2150_;
							for (/**/; i_2149_ < 0; i_2149_++) {
								method757(((i_2148_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2147_ >> 12), i_2146_++, is, i, i_2139_);
								i_2148_ += anInt9341;
							}
						}
						i_2145_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2151_ = anInt9356;
					while (i_2151_ < 0) {
						int i_2152_ = anInt9339;
						int i_2153_ = anInt9346;
						int i_2154_ = anInt9324 + anInt9349;
						int i_2155_ = anInt9347;
						if (i_2153_ >= 0 && i_2153_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) < 0) {
							if (i_2154_ < 0) {
								int i_2156_ = (anInt9341 - 1 - i_2154_) / anInt9341;
								i_2155_ += i_2156_;
								i_2154_ += anInt9341 * i_2156_;
								i_2152_ += i_2156_;
							}
							int i_2157_;
							if ((i_2157_ = (1 + i_2154_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2155_)
								i_2155_ = i_2157_;
							for (/**/; i_2155_ < 0; i_2155_++) {
								method757(((i_2154_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2153_ >> 12), i_2152_++, is, i, i_2139_);
								i_2154_ += anInt9341;
							}
						}
						i_2151_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2158_ = anInt9356;
					while (i_2158_ < 0) {
						int i_2159_ = anInt9339;
						int i_2160_ = anInt9346 + anInt9348;
						int i_2161_ = anInt9324;
						int i_2162_ = anInt9347;
						if (i_2161_ >= 0 && i_2161_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							int i_2163_;
							if ((i_2163_ = (i_2160_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2163_ = (anInt9340 - i_2163_) / anInt9340;
								i_2162_ += i_2163_;
								i_2160_ += anInt9340 * i_2163_;
								i_2159_ += i_2163_;
							}
							if ((i_2163_ = (i_2160_ - anInt9340) / anInt9340) > i_2162_)
								i_2162_ = i_2163_;
							for (/**/; i_2162_ < 0; i_2162_++) {
								method757(((i_2161_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2160_ >> 12), i_2159_++, is, i, i_2139_);
								i_2160_ += anInt9340;
							}
						}
						i_2158_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2164_ = anInt9356;
					while (i_2164_ < 0) {
						int i_2165_ = anInt9339;
						int i_2166_ = anInt9346 + anInt9348;
						int i_2167_ = anInt9324 + anInt9349;
						int i_2168_ = anInt9347;
						int i_2169_;
						if ((i_2169_ = i_2166_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) >= 0) {
							i_2169_ = (anInt9340 - i_2169_) / anInt9340;
							i_2168_ += i_2169_;
							i_2166_ += anInt9340 * i_2169_;
							i_2167_ += anInt9341 * i_2169_;
							i_2165_ += i_2169_;
						}
						if ((i_2169_ = (i_2166_ - anInt9340) / anInt9340) > i_2168_)
							i_2168_ = i_2169_;
						if ((i_2169_ = i_2167_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_2169_ = (anInt9341 - i_2169_) / anInt9341;
							i_2168_ += i_2169_;
							i_2166_ += anInt9340 * i_2169_;
							i_2167_ += anInt9341 * i_2169_;
							i_2165_ += i_2169_;
						}
						if ((i_2169_ = (i_2167_ - anInt9341) / anInt9341) > i_2168_)
							i_2168_ = i_2169_;
						for (/**/; i_2168_ < 0; i_2168_++) {
							method757((((i_2167_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2166_ >> 12)), i_2165_++, is, i, i_2139_);
							i_2166_ += anInt9340;
							i_2167_ += anInt9341;
						}
						i_2164_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2170_ = anInt9356;
					while (i_2170_ < 0) {
						int i_2171_ = anInt9339;
						int i_2172_ = anInt9346 + anInt9348;
						int i_2173_ = anInt9324 + anInt9349;
						int i_2174_ = anInt9347;
						int i_2175_;
						if ((i_2175_ = i_2172_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) >= 0) {
							i_2175_ = (anInt9340 - i_2175_) / anInt9340;
							i_2174_ += i_2175_;
							i_2172_ += anInt9340 * i_2175_;
							i_2173_ += anInt9341 * i_2175_;
							i_2171_ += i_2175_;
						}
						if ((i_2175_ = (i_2172_ - anInt9340) / anInt9340) > i_2174_)
							i_2174_ = i_2175_;
						if (i_2173_ < 0) {
							i_2175_ = (anInt9341 - 1 - i_2173_) / anInt9341;
							i_2174_ += i_2175_;
							i_2172_ += anInt9340 * i_2175_;
							i_2173_ += anInt9341 * i_2175_;
							i_2171_ += i_2175_;
						}
						if ((i_2175_ = (1 + i_2173_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2174_)
							i_2174_ = i_2175_;
						for (/**/; i_2174_ < 0; i_2174_++) {
							method757((((i_2173_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2172_ >> 12)), i_2171_++, is, i, i_2139_);
							i_2172_ += anInt9340;
							i_2173_ += anInt9341;
						}
						i_2170_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2176_ = anInt9356;
				while (i_2176_ < 0) {
					int i_2177_ = anInt9339;
					int i_2178_ = anInt9346 + anInt9348;
					int i_2179_ = anInt9324;
					int i_2180_ = anInt9347;
					if (i_2179_ >= 0 && i_2179_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
						if (i_2178_ < 0) {
							int i_2181_ = (anInt9340 - 1 - i_2178_) / anInt9340;
							i_2180_ += i_2181_;
							i_2178_ += anInt9340 * i_2181_;
							i_2177_ += i_2181_;
						}
						int i_2182_;
						if ((i_2182_ = (1 + i_2178_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2180_)
							i_2180_ = i_2182_;
						for (/**/; i_2180_ < 0; i_2180_++) {
							method757((((i_2179_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2178_ >> 12)), i_2177_++, is, i, i_2139_);
							i_2178_ += anInt9340;
						}
					}
					i_2176_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_2183_ = anInt9356; i_2183_ < 0; i_2183_++) {
					int i_2184_ = anInt9339;
					int i_2185_ = anInt9346 + anInt9348;
					int i_2186_ = anInt9324 + anInt9349;
					int i_2187_ = anInt9347;
					if (i_2185_ < 0) {
						int i_2188_ = (anInt9340 - 1 - i_2185_) / anInt9340;
						i_2187_ += i_2188_;
						i_2185_ += anInt9340 * i_2188_;
						i_2186_ += anInt9341 * i_2188_;
						i_2184_ += i_2188_;
					}
					int i_2189_;
					if ((i_2189_ = (1 + i_2185_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2187_)
						i_2187_ = i_2189_;
					if ((i_2189_ = i_2186_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
						i_2189_ = (anInt9341 - i_2189_) / anInt9341;
						i_2187_ += i_2189_;
						i_2185_ += anInt9340 * i_2189_;
						i_2186_ += anInt9341 * i_2189_;
						i_2184_ += i_2189_;
					}
					if ((i_2189_ = (i_2186_ - anInt9341) / anInt9341) > i_2187_)
						i_2187_ = i_2189_;
					for (/**/; i_2187_ < 0; i_2187_++) {
						method757((((i_2186_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2185_ >> 12)), i_2184_++, is, i, i_2139_);
						i_2185_ += anInt9340;
						i_2186_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_2190_ = anInt9356; i_2190_ < 0; i_2190_++) {
					int i_2191_ = anInt9339;
					int i_2192_ = anInt9346 + anInt9348;
					int i_2193_ = anInt9324 + anInt9349;
					int i_2194_ = anInt9347;
					if (i_2192_ < 0) {
						int i_2195_ = (anInt9340 - 1 - i_2192_) / anInt9340;
						i_2194_ += i_2195_;
						i_2192_ += anInt9340 * i_2195_;
						i_2193_ += anInt9341 * i_2195_;
						i_2191_ += i_2195_;
					}
					int i_2196_;
					if ((i_2196_ = (1 + i_2192_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2194_)
						i_2194_ = i_2196_;
					if (i_2193_ < 0) {
						i_2196_ = (anInt9341 - 1 - i_2193_) / anInt9341;
						i_2194_ += i_2196_;
						i_2192_ += anInt9340 * i_2196_;
						i_2193_ += anInt9341 * i_2196_;
						i_2191_ += i_2196_;
					}
					if ((i_2196_ = (1 + i_2193_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2194_)
						i_2194_ = i_2196_;
					for (/**/; i_2194_ < 0; i_2194_++) {
						method757((((i_2193_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2192_ >> 12)), i_2191_++, is, i, i_2139_);
						i_2192_ += anInt9340;
						i_2193_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method736(int i, int i_2197_, int i_2198_, int i_2199_, int i_2200_, int i_2201_, int i_2202_, int i_2203_) {
		if (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_2198_ > 0 && i_2199_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_2204_ = 0;
				int i_2205_ = 0;
				int i_2206_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_2207_ = (((Class61_Sub3_Sub1) this).anInt9352 + ((Class61_Sub3_Sub1) this).anInt9358 + ((Class61_Sub3_Sub1) this).anInt9328);
				int i_2208_ = (((Class61_Sub3_Sub1) this).anInt9327 + ((Class61_Sub3_Sub1) this).anInt9325 + ((Class61_Sub3_Sub1) this).anInt9337);
				int i_2209_ = (i_2207_ << 16) / i_2198_;
				int i_2210_ = (i_2208_ << 16) / i_2199_;
				if (((Class61_Sub3_Sub1) this).anInt9352 > 0) {
					int i_2211_ = ((((Class61_Sub3_Sub1) this).anInt9352 << 16) + i_2209_ - 1) / i_2209_;
					i += i_2211_;
					i_2204_ += (i_2211_ * i_2209_ - (((Class61_Sub3_Sub1) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9327 > 0) {
					int i_2212_ = ((((Class61_Sub3_Sub1) this).anInt9327 << 16) + i_2210_ - 1) / i_2210_;
					i_2197_ += i_2212_;
					i_2205_ += (i_2212_ * i_2210_ - (((Class61_Sub3_Sub1) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub1) this).anInt9358 < i_2207_)
					i_2198_ = ((((Class61_Sub3_Sub1) this).anInt9358 << 16) - i_2204_ + i_2209_ - 1) / i_2209_;
				if (((Class61_Sub3_Sub1) this).anInt9325 < i_2208_)
					i_2199_ = ((((Class61_Sub3_Sub1) this).anInt9325 << 16) - i_2205_ + i_2210_ - 1) / i_2210_;
				int i_2213_ = i + i_2197_ * i_2206_;
				int i_2214_ = i_2206_ - i_2198_;
				if (i_2197_ + i_2199_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_2199_ -= (i_2197_ + i_2199_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_2197_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_2215_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2197_;
					i_2199_ -= i_2215_;
					i_2213_ += i_2215_ * i_2206_;
					i_2205_ += i_2210_ * i_2215_;
				}
				if (i + i_2198_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_2216_ = (i + i_2198_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_2198_ -= i_2216_;
					i_2214_ += i_2216_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_2217_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_2198_ -= i_2217_;
					i_2213_ += i_2217_;
					i_2204_ += i_2209_ * i_2217_;
					i_2214_ += i_2217_;
				}
				if (i_2202_ == 0) {
					if (i_2200_ == 1) {
						int i_2218_ = i_2204_;
						for (int i_2219_ = -i_2199_; i_2219_ < 0; i_2219_++) {
							int i_2220_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2221_ = -i_2198_; i_2221_ < 0; i_2221_++) {
								is[i_2213_++] = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2220_]);
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2218_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 0) {
						int i_2222_ = (i_2201_ & 0xff0000) >> 16;
						int i_2223_ = (i_2201_ & 0xff00) >> 8;
						int i_2224_ = i_2201_ & 0xff;
						int i_2225_ = i_2204_;
						for (int i_2226_ = -i_2199_; i_2226_ < 0; i_2226_++) {
							int i_2227_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2228_ = -i_2198_; i_2228_ < 0; i_2228_++) {
								int i_2229_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2227_]);
								int i_2230_ = ((i_2229_ & 0xff0000) * i_2222_ & ~0xffffff);
								int i_2231_ = (i_2229_ & 0xff00) * i_2223_ & 0xff0000;
								int i_2232_ = (i_2229_ & 0xff) * i_2224_ & 0xff00;
								is[i_2213_++] = (i_2230_ | i_2231_ | i_2232_) >>> 8;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2225_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 3) {
						int i_2233_ = i_2204_;
						for (int i_2234_ = -i_2199_; i_2234_ < 0; i_2234_++) {
							int i_2235_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2236_ = -i_2198_; i_2236_ < 0; i_2236_++) {
								int i_2237_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2235_]);
								int i_2238_ = i_2237_ + i_2201_;
								int i_2239_ = ((i_2237_ & 0xff00ff) + (i_2201_ & 0xff00ff));
								int i_2240_ = ((i_2239_ & 0x1000100) + (i_2238_ - i_2239_ & 0x10000));
								is[i_2213_++] = i_2238_ - i_2240_ | i_2240_ - (i_2240_ >>> 8);
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2233_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 2) {
						int i_2241_ = i_2201_ >>> 24;
						int i_2242_ = 256 - i_2241_;
						int i_2243_ = (i_2201_ & 0xff00ff) * i_2242_ & ~0xff00ff;
						int i_2244_ = (i_2201_ & 0xff00) * i_2242_ & 0xff0000;
						i_2201_ = (i_2243_ | i_2244_) >>> 8;
						int i_2245_ = i_2204_;
						for (int i_2246_ = -i_2199_; i_2246_ < 0; i_2246_++) {
							int i_2247_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2248_ = -i_2198_; i_2248_ < 0; i_2248_++) {
								int i_2249_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2247_]);
								i_2243_ = ((i_2249_ & 0xff00ff) * i_2241_ & ~0xff00ff);
								i_2244_ = (i_2249_ & 0xff00) * i_2241_ & 0xff0000;
								is[i_2213_++] = ((i_2243_ | i_2244_) >>> 8) + i_2201_;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2245_;
							i_2213_ += i_2214_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2202_ == 1) {
					if (i_2200_ == 1) {
						int i_2250_ = i_2204_;
						for (int i_2251_ = -i_2199_; i_2251_ < 0; i_2251_++) {
							int i_2252_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2253_ = -i_2198_; i_2253_ < 0; i_2253_++) {
								int i_2254_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2252_]);
								if (i_2254_ != 0)
									is[i_2213_++] = i_2254_;
								else
									i_2213_++;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2250_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 0) {
						int i_2255_ = i_2204_;
						if ((i_2201_ & 0xffffff) == 16777215) {
							int i_2256_ = i_2201_ >>> 24;
							int i_2257_ = 256 - i_2256_;
							for (int i_2258_ = -i_2199_; i_2258_ < 0; i_2258_++) {
								int i_2259_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_2260_ = -i_2198_; i_2260_ < 0; i_2260_++) {
									int i_2261_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2259_]);
									if (i_2261_ != 0) {
										int i_2262_ = is[i_2213_];
										is[i_2213_++] = ((((i_2261_ & 0xff00ff) * i_2256_ + ((i_2262_ & 0xff00ff) * i_2257_)) & ~0xff00ff) + (((i_2261_ & 0xff00) * i_2256_ + ((i_2262_ & 0xff00) * i_2257_)) & 0xff0000)) >> 8;
									} else
										i_2213_++;
									i_2204_ += i_2209_;
								}
								i_2205_ += i_2210_;
								i_2204_ = i_2255_;
								i_2213_ += i_2214_;
							}
						} else {
							int i_2263_ = (i_2201_ & 0xff0000) >> 16;
							int i_2264_ = (i_2201_ & 0xff00) >> 8;
							int i_2265_ = i_2201_ & 0xff;
							int i_2266_ = i_2201_ >>> 24;
							int i_2267_ = 256 - i_2266_;
							for (int i_2268_ = -i_2199_; i_2268_ < 0; i_2268_++) {
								int i_2269_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
								for (int i_2270_ = -i_2198_; i_2270_ < 0; i_2270_++) {
									int i_2271_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2269_]);
									if (i_2271_ != 0) {
										if (i_2266_ != 255) {
											int i_2272_ = (((i_2271_ & 0xff0000) * i_2263_) & ~0xffffff);
											int i_2273_ = ((i_2271_ & 0xff00) * i_2264_ & 0xff0000);
											int i_2274_ = ((i_2271_ & 0xff) * i_2265_ & 0xff00);
											i_2271_ = (i_2272_ | i_2273_ | i_2274_) >>> 8;
											int i_2275_ = is[i_2213_];
											is[i_2213_++] = (((((i_2271_ & 0xff00ff) * i_2266_) + ((i_2275_ & 0xff00ff) * i_2267_)) & ~0xff00ff) + ((((i_2271_ & 0xff00) * i_2266_) + ((i_2275_ & 0xff00) * i_2267_)) & 0xff0000)) >> 8;
										} else {
											int i_2276_ = (((i_2271_ & 0xff0000) * i_2263_) & ~0xffffff);
											int i_2277_ = ((i_2271_ & 0xff00) * i_2264_ & 0xff0000);
											int i_2278_ = ((i_2271_ & 0xff) * i_2265_ & 0xff00);
											is[i_2213_++] = (i_2276_ | i_2277_ | i_2278_) >>> 8;
										}
									} else
										i_2213_++;
									i_2204_ += i_2209_;
								}
								i_2205_ += i_2210_;
								i_2204_ = i_2255_;
								i_2213_ += i_2214_;
							}
						}
					} else if (i_2200_ == 3) {
						int i_2279_ = i_2204_;
						int i_2280_ = i_2201_ >>> 24;
						int i_2281_ = 256 - i_2280_;
						for (int i_2282_ = -i_2199_; i_2282_ < 0; i_2282_++) {
							int i_2283_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2284_ = -i_2198_; i_2284_ < 0; i_2284_++) {
								int i_2285_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2283_]);
								int i_2286_ = i_2285_ + i_2201_;
								int i_2287_ = ((i_2285_ & 0xff00ff) + (i_2201_ & 0xff00ff));
								int i_2288_ = ((i_2287_ & 0x1000100) + (i_2286_ - i_2287_ & 0x10000));
								i_2288_ = i_2286_ - i_2288_ | i_2288_ - (i_2288_ >>> 8);
								if (i_2285_ == 0 && i_2280_ != 255) {
									i_2285_ = i_2288_;
									i_2288_ = is[i_2213_];
									i_2288_ = ((((i_2285_ & 0xff00ff) * i_2280_ + (i_2288_ & 0xff00ff) * i_2281_) & ~0xff00ff) + (((i_2285_ & 0xff00) * i_2280_ + (i_2288_ & 0xff00) * i_2281_) & 0xff0000)) >> 8;
								}
								is[i_2213_++] = i_2288_;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2279_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 2) {
						int i_2289_ = i_2201_ >>> 24;
						int i_2290_ = 256 - i_2289_;
						int i_2291_ = (i_2201_ & 0xff00ff) * i_2290_ & ~0xff00ff;
						int i_2292_ = (i_2201_ & 0xff00) * i_2290_ & 0xff0000;
						i_2201_ = (i_2291_ | i_2292_) >>> 8;
						int i_2293_ = i_2204_;
						for (int i_2294_ = -i_2199_; i_2294_ < 0; i_2294_++) {
							int i_2295_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2296_ = -i_2198_; i_2296_ < 0; i_2296_++) {
								int i_2297_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2295_]);
								if (i_2297_ != 0) {
									i_2291_ = ((i_2297_ & 0xff00ff) * i_2289_ & ~0xff00ff);
									i_2292_ = ((i_2297_ & 0xff00) * i_2289_ & 0xff0000);
									is[i_2213_++] = ((i_2291_ | i_2292_) >>> 8) + i_2201_;
								} else
									i_2213_++;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2293_;
							i_2213_ += i_2214_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_2202_ == 2) {
					if (i_2200_ == 1) {
						int i_2298_ = i_2204_;
						for (int i_2299_ = -i_2199_; i_2299_ < 0; i_2299_++) {
							int i_2300_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2301_ = -i_2198_; i_2301_ < 0; i_2301_++) {
								int i_2302_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2300_]);
								if (i_2302_ != 0) {
									int i_2303_ = is[i_2213_];
									int i_2304_ = i_2302_ + i_2303_;
									int i_2305_ = ((i_2302_ & 0xff00ff) + (i_2303_ & 0xff00ff));
									i_2303_ = ((i_2305_ & 0x1000100) + (i_2304_ - i_2305_ & 0x10000));
									is[i_2213_++] = (i_2304_ - i_2303_ | i_2303_ - (i_2303_ >>> 8));
								} else
									i_2213_++;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2298_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 0) {
						int i_2306_ = i_2204_;
						int i_2307_ = (i_2201_ & 0xff0000) >> 16;
						int i_2308_ = (i_2201_ & 0xff00) >> 8;
						int i_2309_ = i_2201_ & 0xff;
						for (int i_2310_ = -i_2199_; i_2310_ < 0; i_2310_++) {
							int i_2311_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2312_ = -i_2198_; i_2312_ < 0; i_2312_++) {
								int i_2313_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2311_]);
								if (i_2313_ != 0) {
									int i_2314_ = ((i_2313_ & 0xff0000) * i_2307_ & ~0xffffff);
									int i_2315_ = ((i_2313_ & 0xff00) * i_2308_ & 0xff0000);
									int i_2316_ = (i_2313_ & 0xff) * i_2309_ & 0xff00;
									i_2313_ = (i_2314_ | i_2315_ | i_2316_) >>> 8;
									int i_2317_ = is[i_2213_];
									int i_2318_ = i_2313_ + i_2317_;
									int i_2319_ = ((i_2313_ & 0xff00ff) + (i_2317_ & 0xff00ff));
									i_2317_ = ((i_2319_ & 0x1000100) + (i_2318_ - i_2319_ & 0x10000));
									is[i_2213_++] = (i_2318_ - i_2317_ | i_2317_ - (i_2317_ >>> 8));
								} else
									i_2213_++;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2306_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 3) {
						int i_2320_ = i_2204_;
						for (int i_2321_ = -i_2199_; i_2321_ < 0; i_2321_++) {
							int i_2322_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2323_ = -i_2198_; i_2323_ < 0; i_2323_++) {
								int i_2324_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2322_]);
								int i_2325_ = i_2324_ + i_2201_;
								int i_2326_ = ((i_2324_ & 0xff00ff) + (i_2201_ & 0xff00ff));
								int i_2327_ = ((i_2326_ & 0x1000100) + (i_2325_ - i_2326_ & 0x10000));
								i_2324_ = i_2325_ - i_2327_ | i_2327_ - (i_2327_ >>> 8);
								i_2327_ = is[i_2213_];
								i_2325_ = i_2324_ + i_2327_;
								i_2326_ = (i_2324_ & 0xff00ff) + (i_2327_ & 0xff00ff);
								i_2327_ = ((i_2326_ & 0x1000100) + (i_2325_ - i_2326_ & 0x10000));
								is[i_2213_++] = i_2325_ - i_2327_ | i_2327_ - (i_2327_ >>> 8);
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2320_;
							i_2213_ += i_2214_;
						}
					} else if (i_2200_ == 2) {
						int i_2328_ = i_2201_ >>> 24;
						int i_2329_ = 256 - i_2328_;
						int i_2330_ = (i_2201_ & 0xff00ff) * i_2329_ & ~0xff00ff;
						int i_2331_ = (i_2201_ & 0xff00) * i_2329_ & 0xff0000;
						i_2201_ = (i_2330_ | i_2331_) >>> 8;
						int i_2332_ = i_2204_;
						for (int i_2333_ = -i_2199_; i_2333_ < 0; i_2333_++) {
							int i_2334_ = ((i_2205_ >> 16) * ((Class61_Sub3_Sub1) this).anInt9358);
							for (int i_2335_ = -i_2198_; i_2335_ < 0; i_2335_++) {
								int i_2336_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(i_2204_ >> 16) + i_2334_]);
								if (i_2336_ != 0) {
									i_2330_ = ((i_2336_ & 0xff00ff) * i_2328_ & ~0xff00ff);
									i_2331_ = ((i_2336_ & 0xff00) * i_2328_ & 0xff0000);
									i_2336_ = (((i_2330_ | i_2331_) >>> 8) + i_2201_);
									int i_2337_ = is[i_2213_];
									int i_2338_ = i_2336_ + i_2337_;
									int i_2339_ = ((i_2336_ & 0xff00ff) + (i_2337_ & 0xff00ff));
									i_2337_ = ((i_2339_ & 0x1000100) + (i_2338_ - i_2339_ & 0x10000));
									is[i_2213_++] = (i_2338_ - i_2337_ | i_2337_ - (i_2337_ >>> 8));
								} else
									i_2213_++;
								i_2204_ += i_2209_;
							}
							i_2205_ += i_2210_;
							i_2204_ = i_2332_;
							i_2213_ += i_2214_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method746(int[] is, int[] is_2340_, int i, int i_2341_) {
		int[] is_2342_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2342_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2343_ = anInt9356;
					while (i_2343_ < 0) {
						int i_2344_ = i_2343_ + i_2341_;
						if (i_2344_ >= 0) {
							if (i_2344_ >= is.length)
								break;
							int i_2345_ = anInt9339;
							int i_2346_ = anInt9346;
							int i_2347_ = anInt9324;
							int i_2348_ = anInt9347;
							if (i_2346_ >= 0 && i_2347_ >= 0 && (i_2346_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0 && (i_2347_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2349_ = is[i_2344_] - i;
								int i_2350_ = -is_2340_[i_2344_];
								int i_2351_ = i_2349_ - (i_2345_ - anInt9339);
								if (i_2351_ > 0) {
									i_2345_ += i_2351_;
									i_2348_ += i_2351_;
									i_2346_ += anInt9340 * i_2351_;
									i_2347_ += anInt9341 * i_2351_;
								} else
									i_2350_ -= i_2351_;
								if (i_2348_ < i_2350_)
									i_2348_ = i_2350_;
								for (/**/; i_2348_ < 0; i_2348_++) {
									int i_2352_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2347_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2346_ >> 12))]);
									if (i_2352_ != 0)
										is_2342_[i_2345_++] = i_2352_;
									else
										i_2345_++;
								}
							}
						}
						i_2343_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2353_ = anInt9356;
					while (i_2353_ < 0) {
						int i_2354_ = i_2353_ + i_2341_;
						if (i_2354_ >= 0) {
							if (i_2354_ >= is.length)
								break;
							int i_2355_ = anInt9339;
							int i_2356_ = anInt9346;
							int i_2357_ = anInt9324 + anInt9349;
							int i_2358_ = anInt9347;
							if (i_2356_ >= 0 && (i_2356_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								int i_2359_;
								if ((i_2359_ = (i_2357_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
									i_2359_ = (anInt9341 - i_2359_) / anInt9341;
									i_2358_ += i_2359_;
									i_2357_ += anInt9341 * i_2359_;
									i_2355_ += i_2359_;
								}
								if ((i_2359_ = (i_2357_ - anInt9341) / anInt9341) > i_2358_)
									i_2358_ = i_2359_;
								int i_2360_ = is[i_2354_] - i;
								int i_2361_ = -is_2340_[i_2354_];
								int i_2362_ = i_2360_ - (i_2355_ - anInt9339);
								if (i_2362_ > 0) {
									i_2355_ += i_2362_;
									i_2358_ += i_2362_;
									i_2356_ += anInt9340 * i_2362_;
									i_2357_ += anInt9341 * i_2362_;
								} else
									i_2361_ -= i_2362_;
								if (i_2358_ < i_2361_)
									i_2358_ = i_2361_;
								for (/**/; i_2358_ < 0; i_2358_++) {
									int i_2363_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2357_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2356_ >> 12))]);
									if (i_2363_ != 0)
										is_2342_[i_2355_++] = i_2363_;
									else
										i_2355_++;
									i_2357_ += anInt9341;
								}
							}
						}
						i_2353_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2364_ = anInt9356;
					while (i_2364_ < 0) {
						int i_2365_ = i_2364_ + i_2341_;
						if (i_2365_ >= 0) {
							if (i_2365_ >= is.length)
								break;
							int i_2366_ = anInt9339;
							int i_2367_ = anInt9346;
							int i_2368_ = anInt9324 + anInt9349;
							int i_2369_ = anInt9347;
							if (i_2367_ >= 0 && (i_2367_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								if (i_2368_ < 0) {
									int i_2370_ = ((anInt9341 - 1 - i_2368_) / anInt9341);
									i_2369_ += i_2370_;
									i_2368_ += anInt9341 * i_2370_;
									i_2366_ += i_2370_;
								}
								int i_2371_;
								if ((i_2371_ = (1 + i_2368_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2369_)
									i_2369_ = i_2371_;
								int i_2372_ = is[i_2365_] - i;
								int i_2373_ = -is_2340_[i_2365_];
								int i_2374_ = i_2372_ - (i_2366_ - anInt9339);
								if (i_2374_ > 0) {
									i_2366_ += i_2374_;
									i_2369_ += i_2374_;
									i_2367_ += anInt9340 * i_2374_;
									i_2368_ += anInt9341 * i_2374_;
								} else
									i_2373_ -= i_2374_;
								if (i_2369_ < i_2373_)
									i_2369_ = i_2373_;
								for (/**/; i_2369_ < 0; i_2369_++) {
									int i_2375_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2368_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2367_ >> 12))]);
									if (i_2375_ != 0)
										is_2342_[i_2366_++] = i_2375_;
									else
										i_2366_++;
									i_2368_ += anInt9341;
								}
							}
						}
						i_2364_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2376_ = anInt9356;
					while (i_2376_ < 0) {
						int i_2377_ = i_2376_ + i_2341_;
						if (i_2377_ >= 0) {
							if (i_2377_ >= is.length)
								break;
							int i_2378_ = anInt9339;
							int i_2379_ = anInt9346 + anInt9348;
							int i_2380_ = anInt9324;
							int i_2381_ = anInt9347;
							if (i_2380_ >= 0 && (i_2380_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2382_;
								if ((i_2382_ = (i_2379_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
									i_2382_ = (anInt9340 - i_2382_) / anInt9340;
									i_2381_ += i_2382_;
									i_2379_ += anInt9340 * i_2382_;
									i_2378_ += i_2382_;
								}
								if ((i_2382_ = (i_2379_ - anInt9340) / anInt9340) > i_2381_)
									i_2381_ = i_2382_;
								int i_2383_ = is[i_2377_] - i;
								int i_2384_ = -is_2340_[i_2377_];
								int i_2385_ = i_2383_ - (i_2378_ - anInt9339);
								if (i_2385_ > 0) {
									i_2378_ += i_2385_;
									i_2381_ += i_2385_;
									i_2379_ += anInt9340 * i_2385_;
									i_2380_ += anInt9341 * i_2385_;
								} else
									i_2384_ -= i_2385_;
								if (i_2381_ < i_2384_)
									i_2381_ = i_2384_;
								for (/**/; i_2381_ < 0; i_2381_++) {
									int i_2386_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2380_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2379_ >> 12))]);
									if (i_2386_ != 0)
										is_2342_[i_2378_++] = i_2386_;
									else
										i_2378_++;
									i_2379_ += anInt9340;
								}
							}
						}
						i_2376_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2387_ = anInt9356;
					while (i_2387_ < 0) {
						int i_2388_ = i_2387_ + i_2341_;
						if (i_2388_ >= 0) {
							if (i_2388_ >= is.length)
								break;
							int i_2389_ = anInt9339;
							int i_2390_ = anInt9346 + anInt9348;
							int i_2391_ = anInt9324 + anInt9349;
							int i_2392_ = anInt9347;
							int i_2393_;
							if ((i_2393_ = (i_2390_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2393_ = (anInt9340 - i_2393_) / anInt9340;
								i_2392_ += i_2393_;
								i_2390_ += anInt9340 * i_2393_;
								i_2391_ += anInt9341 * i_2393_;
								i_2389_ += i_2393_;
							}
							if ((i_2393_ = (i_2390_ - anInt9340) / anInt9340) > i_2392_)
								i_2392_ = i_2393_;
							if ((i_2393_ = (i_2391_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
								i_2393_ = (anInt9341 - i_2393_) / anInt9341;
								i_2392_ += i_2393_;
								i_2390_ += anInt9340 * i_2393_;
								i_2391_ += anInt9341 * i_2393_;
								i_2389_ += i_2393_;
							}
							if ((i_2393_ = (i_2391_ - anInt9341) / anInt9341) > i_2392_)
								i_2392_ = i_2393_;
							int i_2394_ = is[i_2388_] - i;
							int i_2395_ = -is_2340_[i_2388_];
							int i_2396_ = i_2394_ - (i_2389_ - anInt9339);
							if (i_2396_ > 0) {
								i_2389_ += i_2396_;
								i_2392_ += i_2396_;
								i_2390_ += anInt9340 * i_2396_;
								i_2391_ += anInt9341 * i_2396_;
							} else
								i_2395_ -= i_2396_;
							if (i_2392_ < i_2395_)
								i_2392_ = i_2395_;
							for (/**/; i_2392_ < 0; i_2392_++) {
								int i_2397_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2391_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2390_ >> 12))]);
								if (i_2397_ != 0)
									is_2342_[i_2389_++] = i_2397_;
								else
									i_2389_++;
								i_2390_ += anInt9340;
								i_2391_ += anInt9341;
							}
						}
						i_2387_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2398_ = anInt9356;
					while (i_2398_ < 0) {
						int i_2399_ = i_2398_ + i_2341_;
						if (i_2399_ >= 0) {
							if (i_2399_ >= is.length)
								break;
							int i_2400_ = anInt9339;
							int i_2401_ = anInt9346 + anInt9348;
							int i_2402_ = anInt9324 + anInt9349;
							int i_2403_ = anInt9347;
							int i_2404_;
							if ((i_2404_ = (i_2401_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2404_ = (anInt9340 - i_2404_) / anInt9340;
								i_2403_ += i_2404_;
								i_2401_ += anInt9340 * i_2404_;
								i_2402_ += anInt9341 * i_2404_;
								i_2400_ += i_2404_;
							}
							if ((i_2404_ = (i_2401_ - anInt9340) / anInt9340) > i_2403_)
								i_2403_ = i_2404_;
							if (i_2402_ < 0) {
								i_2404_ = (anInt9341 - 1 - i_2402_) / anInt9341;
								i_2403_ += i_2404_;
								i_2401_ += anInt9340 * i_2404_;
								i_2402_ += anInt9341 * i_2404_;
								i_2400_ += i_2404_;
							}
							if ((i_2404_ = (1 + i_2402_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2403_)
								i_2403_ = i_2404_;
							int i_2405_ = is[i_2399_] - i;
							int i_2406_ = -is_2340_[i_2399_];
							int i_2407_ = i_2405_ - (i_2400_ - anInt9339);
							if (i_2407_ > 0) {
								i_2400_ += i_2407_;
								i_2403_ += i_2407_;
								i_2401_ += anInt9340 * i_2407_;
								i_2402_ += anInt9341 * i_2407_;
							} else
								i_2406_ -= i_2407_;
							if (i_2403_ < i_2406_)
								i_2403_ = i_2406_;
							for (/**/; i_2403_ < 0; i_2403_++) {
								int i_2408_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2402_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2401_ >> 12))]);
								if (i_2408_ != 0)
									is_2342_[i_2400_++] = i_2408_;
								else
									i_2400_++;
								i_2401_ += anInt9340;
								i_2402_ += anInt9341;
							}
						}
						i_2398_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2409_ = anInt9356;
				while (i_2409_ < 0) {
					int i_2410_ = i_2409_ + i_2341_;
					if (i_2410_ >= 0) {
						if (i_2410_ >= is.length)
							break;
						int i_2411_ = anInt9339;
						int i_2412_ = anInt9346 + anInt9348;
						int i_2413_ = anInt9324;
						int i_2414_ = anInt9347;
						if (i_2413_ >= 0 && i_2413_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							if (i_2412_ < 0) {
								int i_2415_ = (anInt9340 - 1 - i_2412_) / anInt9340;
								i_2414_ += i_2415_;
								i_2412_ += anInt9340 * i_2415_;
								i_2411_ += i_2415_;
							}
							int i_2416_;
							if ((i_2416_ = (1 + i_2412_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2414_)
								i_2414_ = i_2416_;
							int i_2417_ = is[i_2410_] - i;
							int i_2418_ = -is_2340_[i_2410_];
							int i_2419_ = i_2417_ - (i_2411_ - anInt9339);
							if (i_2419_ > 0) {
								i_2411_ += i_2419_;
								i_2414_ += i_2419_;
								i_2412_ += anInt9340 * i_2419_;
								i_2413_ += anInt9341 * i_2419_;
							} else
								i_2418_ -= i_2419_;
							if (i_2414_ < i_2418_)
								i_2414_ = i_2418_;
							for (/**/; i_2414_ < 0; i_2414_++) {
								int i_2420_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2413_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2412_ >> 12))]);
								if (i_2420_ != 0)
									is_2342_[i_2411_++] = i_2420_;
								else
									i_2411_++;
								i_2412_ += anInt9340;
							}
						}
					}
					i_2409_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2421_ = anInt9356;
				while (i_2421_ < 0) {
					int i_2422_ = i_2421_ + i_2341_;
					if (i_2422_ >= 0) {
						if (i_2422_ >= is.length)
							break;
						int i_2423_ = anInt9339;
						int i_2424_ = anInt9346 + anInt9348;
						int i_2425_ = anInt9324 + anInt9349;
						int i_2426_ = anInt9347;
						if (i_2424_ < 0) {
							int i_2427_ = (anInt9340 - 1 - i_2424_) / anInt9340;
							i_2426_ += i_2427_;
							i_2424_ += anInt9340 * i_2427_;
							i_2425_ += anInt9341 * i_2427_;
							i_2423_ += i_2427_;
						}
						int i_2428_;
						if ((i_2428_ = (1 + i_2424_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2426_)
							i_2426_ = i_2428_;
						if ((i_2428_ = i_2425_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_2428_ = (anInt9341 - i_2428_) / anInt9341;
							i_2426_ += i_2428_;
							i_2424_ += anInt9340 * i_2428_;
							i_2425_ += anInt9341 * i_2428_;
							i_2423_ += i_2428_;
						}
						if ((i_2428_ = (i_2425_ - anInt9341) / anInt9341) > i_2426_)
							i_2426_ = i_2428_;
						int i_2429_ = is[i_2422_] - i;
						int i_2430_ = -is_2340_[i_2422_];
						int i_2431_ = i_2429_ - (i_2423_ - anInt9339);
						if (i_2431_ > 0) {
							i_2423_ += i_2431_;
							i_2426_ += i_2431_;
							i_2424_ += anInt9340 * i_2431_;
							i_2425_ += anInt9341 * i_2431_;
						} else
							i_2430_ -= i_2431_;
						if (i_2426_ < i_2430_)
							i_2426_ = i_2430_;
						for (/**/; i_2426_ < 0; i_2426_++) {
							int i_2432_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2425_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2424_ >> 12))]);
							if (i_2432_ != 0)
								is_2342_[i_2423_++] = i_2432_;
							else
								i_2423_++;
							i_2424_ += anInt9340;
							i_2425_ += anInt9341;
						}
					}
					i_2421_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2433_ = anInt9356;
				while (i_2433_ < 0) {
					int i_2434_ = i_2433_ + i_2341_;
					if (i_2434_ >= 0) {
						if (i_2434_ >= is.length)
							break;
						int i_2435_ = anInt9339;
						int i_2436_ = anInt9346 + anInt9348;
						int i_2437_ = anInt9324 + anInt9349;
						int i_2438_ = anInt9347;
						if (i_2436_ < 0) {
							int i_2439_ = (anInt9340 - 1 - i_2436_) / anInt9340;
							i_2438_ += i_2439_;
							i_2436_ += anInt9340 * i_2439_;
							i_2437_ += anInt9341 * i_2439_;
							i_2435_ += i_2439_;
						}
						int i_2440_;
						if ((i_2440_ = (1 + i_2436_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2438_)
							i_2438_ = i_2440_;
						if (i_2437_ < 0) {
							i_2440_ = (anInt9341 - 1 - i_2437_) / anInt9341;
							i_2438_ += i_2440_;
							i_2436_ += anInt9340 * i_2440_;
							i_2437_ += anInt9341 * i_2440_;
							i_2435_ += i_2440_;
						}
						if ((i_2440_ = (1 + i_2437_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2438_)
							i_2438_ = i_2440_;
						int i_2441_ = is[i_2434_] - i;
						int i_2442_ = -is_2340_[i_2434_];
						int i_2443_ = i_2441_ - (i_2435_ - anInt9339);
						if (i_2443_ > 0) {
							i_2435_ += i_2443_;
							i_2438_ += i_2443_;
							i_2436_ += anInt9340 * i_2443_;
							i_2437_ += anInt9341 * i_2443_;
						} else
							i_2442_ -= i_2443_;
						if (i_2438_ < i_2442_)
							i_2438_ = i_2442_;
						for (/**/; i_2438_ < 0; i_2438_++) {
							int i_2444_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2437_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2436_ >> 12))]);
							if (i_2444_ != 0)
								is_2342_[i_2435_++] = i_2444_;
							else
								i_2435_++;
							i_2436_ += anInt9340;
							i_2437_ += anInt9341;
						}
					}
					i_2433_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method751(int[] is, int[] is_2445_, int i, int i_2446_) {
		int[] is_2447_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2447_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2448_ = anInt9356;
					while (i_2448_ < 0) {
						int i_2449_ = i_2448_ + i_2446_;
						if (i_2449_ >= 0) {
							if (i_2449_ >= is.length)
								break;
							int i_2450_ = anInt9339;
							int i_2451_ = anInt9346;
							int i_2452_ = anInt9324;
							int i_2453_ = anInt9347;
							if (i_2451_ >= 0 && i_2452_ >= 0 && (i_2451_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0 && (i_2452_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2454_ = is[i_2449_] - i;
								int i_2455_ = -is_2445_[i_2449_];
								int i_2456_ = i_2454_ - (i_2450_ - anInt9339);
								if (i_2456_ > 0) {
									i_2450_ += i_2456_;
									i_2453_ += i_2456_;
									i_2451_ += anInt9340 * i_2456_;
									i_2452_ += anInt9341 * i_2456_;
								} else
									i_2455_ -= i_2456_;
								if (i_2453_ < i_2455_)
									i_2453_ = i_2455_;
								for (/**/; i_2453_ < 0; i_2453_++) {
									int i_2457_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2452_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2451_ >> 12))]);
									if (i_2457_ != 0)
										is_2447_[i_2450_++] = i_2457_;
									else
										i_2450_++;
								}
							}
						}
						i_2448_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2458_ = anInt9356;
					while (i_2458_ < 0) {
						int i_2459_ = i_2458_ + i_2446_;
						if (i_2459_ >= 0) {
							if (i_2459_ >= is.length)
								break;
							int i_2460_ = anInt9339;
							int i_2461_ = anInt9346;
							int i_2462_ = anInt9324 + anInt9349;
							int i_2463_ = anInt9347;
							if (i_2461_ >= 0 && (i_2461_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								int i_2464_;
								if ((i_2464_ = (i_2462_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
									i_2464_ = (anInt9341 - i_2464_) / anInt9341;
									i_2463_ += i_2464_;
									i_2462_ += anInt9341 * i_2464_;
									i_2460_ += i_2464_;
								}
								if ((i_2464_ = (i_2462_ - anInt9341) / anInt9341) > i_2463_)
									i_2463_ = i_2464_;
								int i_2465_ = is[i_2459_] - i;
								int i_2466_ = -is_2445_[i_2459_];
								int i_2467_ = i_2465_ - (i_2460_ - anInt9339);
								if (i_2467_ > 0) {
									i_2460_ += i_2467_;
									i_2463_ += i_2467_;
									i_2461_ += anInt9340 * i_2467_;
									i_2462_ += anInt9341 * i_2467_;
								} else
									i_2466_ -= i_2467_;
								if (i_2463_ < i_2466_)
									i_2463_ = i_2466_;
								for (/**/; i_2463_ < 0; i_2463_++) {
									int i_2468_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2462_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2461_ >> 12))]);
									if (i_2468_ != 0)
										is_2447_[i_2460_++] = i_2468_;
									else
										i_2460_++;
									i_2462_ += anInt9341;
								}
							}
						}
						i_2458_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2469_ = anInt9356;
					while (i_2469_ < 0) {
						int i_2470_ = i_2469_ + i_2446_;
						if (i_2470_ >= 0) {
							if (i_2470_ >= is.length)
								break;
							int i_2471_ = anInt9339;
							int i_2472_ = anInt9346;
							int i_2473_ = anInt9324 + anInt9349;
							int i_2474_ = anInt9347;
							if (i_2472_ >= 0 && (i_2472_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								if (i_2473_ < 0) {
									int i_2475_ = ((anInt9341 - 1 - i_2473_) / anInt9341);
									i_2474_ += i_2475_;
									i_2473_ += anInt9341 * i_2475_;
									i_2471_ += i_2475_;
								}
								int i_2476_;
								if ((i_2476_ = (1 + i_2473_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2474_)
									i_2474_ = i_2476_;
								int i_2477_ = is[i_2470_] - i;
								int i_2478_ = -is_2445_[i_2470_];
								int i_2479_ = i_2477_ - (i_2471_ - anInt9339);
								if (i_2479_ > 0) {
									i_2471_ += i_2479_;
									i_2474_ += i_2479_;
									i_2472_ += anInt9340 * i_2479_;
									i_2473_ += anInt9341 * i_2479_;
								} else
									i_2478_ -= i_2479_;
								if (i_2474_ < i_2478_)
									i_2474_ = i_2478_;
								for (/**/; i_2474_ < 0; i_2474_++) {
									int i_2480_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2473_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2472_ >> 12))]);
									if (i_2480_ != 0)
										is_2447_[i_2471_++] = i_2480_;
									else
										i_2471_++;
									i_2473_ += anInt9341;
								}
							}
						}
						i_2469_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2481_ = anInt9356;
					while (i_2481_ < 0) {
						int i_2482_ = i_2481_ + i_2446_;
						if (i_2482_ >= 0) {
							if (i_2482_ >= is.length)
								break;
							int i_2483_ = anInt9339;
							int i_2484_ = anInt9346 + anInt9348;
							int i_2485_ = anInt9324;
							int i_2486_ = anInt9347;
							if (i_2485_ >= 0 && (i_2485_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2487_;
								if ((i_2487_ = (i_2484_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
									i_2487_ = (anInt9340 - i_2487_) / anInt9340;
									i_2486_ += i_2487_;
									i_2484_ += anInt9340 * i_2487_;
									i_2483_ += i_2487_;
								}
								if ((i_2487_ = (i_2484_ - anInt9340) / anInt9340) > i_2486_)
									i_2486_ = i_2487_;
								int i_2488_ = is[i_2482_] - i;
								int i_2489_ = -is_2445_[i_2482_];
								int i_2490_ = i_2488_ - (i_2483_ - anInt9339);
								if (i_2490_ > 0) {
									i_2483_ += i_2490_;
									i_2486_ += i_2490_;
									i_2484_ += anInt9340 * i_2490_;
									i_2485_ += anInt9341 * i_2490_;
								} else
									i_2489_ -= i_2490_;
								if (i_2486_ < i_2489_)
									i_2486_ = i_2489_;
								for (/**/; i_2486_ < 0; i_2486_++) {
									int i_2491_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2485_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2484_ >> 12))]);
									if (i_2491_ != 0)
										is_2447_[i_2483_++] = i_2491_;
									else
										i_2483_++;
									i_2484_ += anInt9340;
								}
							}
						}
						i_2481_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2492_ = anInt9356;
					while (i_2492_ < 0) {
						int i_2493_ = i_2492_ + i_2446_;
						if (i_2493_ >= 0) {
							if (i_2493_ >= is.length)
								break;
							int i_2494_ = anInt9339;
							int i_2495_ = anInt9346 + anInt9348;
							int i_2496_ = anInt9324 + anInt9349;
							int i_2497_ = anInt9347;
							int i_2498_;
							if ((i_2498_ = (i_2495_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2498_ = (anInt9340 - i_2498_) / anInt9340;
								i_2497_ += i_2498_;
								i_2495_ += anInt9340 * i_2498_;
								i_2496_ += anInt9341 * i_2498_;
								i_2494_ += i_2498_;
							}
							if ((i_2498_ = (i_2495_ - anInt9340) / anInt9340) > i_2497_)
								i_2497_ = i_2498_;
							if ((i_2498_ = (i_2496_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
								i_2498_ = (anInt9341 - i_2498_) / anInt9341;
								i_2497_ += i_2498_;
								i_2495_ += anInt9340 * i_2498_;
								i_2496_ += anInt9341 * i_2498_;
								i_2494_ += i_2498_;
							}
							if ((i_2498_ = (i_2496_ - anInt9341) / anInt9341) > i_2497_)
								i_2497_ = i_2498_;
							int i_2499_ = is[i_2493_] - i;
							int i_2500_ = -is_2445_[i_2493_];
							int i_2501_ = i_2499_ - (i_2494_ - anInt9339);
							if (i_2501_ > 0) {
								i_2494_ += i_2501_;
								i_2497_ += i_2501_;
								i_2495_ += anInt9340 * i_2501_;
								i_2496_ += anInt9341 * i_2501_;
							} else
								i_2500_ -= i_2501_;
							if (i_2497_ < i_2500_)
								i_2497_ = i_2500_;
							for (/**/; i_2497_ < 0; i_2497_++) {
								int i_2502_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2496_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2495_ >> 12))]);
								if (i_2502_ != 0)
									is_2447_[i_2494_++] = i_2502_;
								else
									i_2494_++;
								i_2495_ += anInt9340;
								i_2496_ += anInt9341;
							}
						}
						i_2492_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2503_ = anInt9356;
					while (i_2503_ < 0) {
						int i_2504_ = i_2503_ + i_2446_;
						if (i_2504_ >= 0) {
							if (i_2504_ >= is.length)
								break;
							int i_2505_ = anInt9339;
							int i_2506_ = anInt9346 + anInt9348;
							int i_2507_ = anInt9324 + anInt9349;
							int i_2508_ = anInt9347;
							int i_2509_;
							if ((i_2509_ = (i_2506_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2509_ = (anInt9340 - i_2509_) / anInt9340;
								i_2508_ += i_2509_;
								i_2506_ += anInt9340 * i_2509_;
								i_2507_ += anInt9341 * i_2509_;
								i_2505_ += i_2509_;
							}
							if ((i_2509_ = (i_2506_ - anInt9340) / anInt9340) > i_2508_)
								i_2508_ = i_2509_;
							if (i_2507_ < 0) {
								i_2509_ = (anInt9341 - 1 - i_2507_) / anInt9341;
								i_2508_ += i_2509_;
								i_2506_ += anInt9340 * i_2509_;
								i_2507_ += anInt9341 * i_2509_;
								i_2505_ += i_2509_;
							}
							if ((i_2509_ = (1 + i_2507_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2508_)
								i_2508_ = i_2509_;
							int i_2510_ = is[i_2504_] - i;
							int i_2511_ = -is_2445_[i_2504_];
							int i_2512_ = i_2510_ - (i_2505_ - anInt9339);
							if (i_2512_ > 0) {
								i_2505_ += i_2512_;
								i_2508_ += i_2512_;
								i_2506_ += anInt9340 * i_2512_;
								i_2507_ += anInt9341 * i_2512_;
							} else
								i_2511_ -= i_2512_;
							if (i_2508_ < i_2511_)
								i_2508_ = i_2511_;
							for (/**/; i_2508_ < 0; i_2508_++) {
								int i_2513_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2507_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2506_ >> 12))]);
								if (i_2513_ != 0)
									is_2447_[i_2505_++] = i_2513_;
								else
									i_2505_++;
								i_2506_ += anInt9340;
								i_2507_ += anInt9341;
							}
						}
						i_2503_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2514_ = anInt9356;
				while (i_2514_ < 0) {
					int i_2515_ = i_2514_ + i_2446_;
					if (i_2515_ >= 0) {
						if (i_2515_ >= is.length)
							break;
						int i_2516_ = anInt9339;
						int i_2517_ = anInt9346 + anInt9348;
						int i_2518_ = anInt9324;
						int i_2519_ = anInt9347;
						if (i_2518_ >= 0 && i_2518_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							if (i_2517_ < 0) {
								int i_2520_ = (anInt9340 - 1 - i_2517_) / anInt9340;
								i_2519_ += i_2520_;
								i_2517_ += anInt9340 * i_2520_;
								i_2516_ += i_2520_;
							}
							int i_2521_;
							if ((i_2521_ = (1 + i_2517_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2519_)
								i_2519_ = i_2521_;
							int i_2522_ = is[i_2515_] - i;
							int i_2523_ = -is_2445_[i_2515_];
							int i_2524_ = i_2522_ - (i_2516_ - anInt9339);
							if (i_2524_ > 0) {
								i_2516_ += i_2524_;
								i_2519_ += i_2524_;
								i_2517_ += anInt9340 * i_2524_;
								i_2518_ += anInt9341 * i_2524_;
							} else
								i_2523_ -= i_2524_;
							if (i_2519_ < i_2523_)
								i_2519_ = i_2523_;
							for (/**/; i_2519_ < 0; i_2519_++) {
								int i_2525_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2518_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2517_ >> 12))]);
								if (i_2525_ != 0)
									is_2447_[i_2516_++] = i_2525_;
								else
									i_2516_++;
								i_2517_ += anInt9340;
							}
						}
					}
					i_2514_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2526_ = anInt9356;
				while (i_2526_ < 0) {
					int i_2527_ = i_2526_ + i_2446_;
					if (i_2527_ >= 0) {
						if (i_2527_ >= is.length)
							break;
						int i_2528_ = anInt9339;
						int i_2529_ = anInt9346 + anInt9348;
						int i_2530_ = anInt9324 + anInt9349;
						int i_2531_ = anInt9347;
						if (i_2529_ < 0) {
							int i_2532_ = (anInt9340 - 1 - i_2529_) / anInt9340;
							i_2531_ += i_2532_;
							i_2529_ += anInt9340 * i_2532_;
							i_2530_ += anInt9341 * i_2532_;
							i_2528_ += i_2532_;
						}
						int i_2533_;
						if ((i_2533_ = (1 + i_2529_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2531_)
							i_2531_ = i_2533_;
						if ((i_2533_ = i_2530_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_2533_ = (anInt9341 - i_2533_) / anInt9341;
							i_2531_ += i_2533_;
							i_2529_ += anInt9340 * i_2533_;
							i_2530_ += anInt9341 * i_2533_;
							i_2528_ += i_2533_;
						}
						if ((i_2533_ = (i_2530_ - anInt9341) / anInt9341) > i_2531_)
							i_2531_ = i_2533_;
						int i_2534_ = is[i_2527_] - i;
						int i_2535_ = -is_2445_[i_2527_];
						int i_2536_ = i_2534_ - (i_2528_ - anInt9339);
						if (i_2536_ > 0) {
							i_2528_ += i_2536_;
							i_2531_ += i_2536_;
							i_2529_ += anInt9340 * i_2536_;
							i_2530_ += anInt9341 * i_2536_;
						} else
							i_2535_ -= i_2536_;
						if (i_2531_ < i_2535_)
							i_2531_ = i_2535_;
						for (/**/; i_2531_ < 0; i_2531_++) {
							int i_2537_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2530_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2529_ >> 12))]);
							if (i_2537_ != 0)
								is_2447_[i_2528_++] = i_2537_;
							else
								i_2528_++;
							i_2529_ += anInt9340;
							i_2530_ += anInt9341;
						}
					}
					i_2526_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2538_ = anInt9356;
				while (i_2538_ < 0) {
					int i_2539_ = i_2538_ + i_2446_;
					if (i_2539_ >= 0) {
						if (i_2539_ >= is.length)
							break;
						int i_2540_ = anInt9339;
						int i_2541_ = anInt9346 + anInt9348;
						int i_2542_ = anInt9324 + anInt9349;
						int i_2543_ = anInt9347;
						if (i_2541_ < 0) {
							int i_2544_ = (anInt9340 - 1 - i_2541_) / anInt9340;
							i_2543_ += i_2544_;
							i_2541_ += anInt9340 * i_2544_;
							i_2542_ += anInt9341 * i_2544_;
							i_2540_ += i_2544_;
						}
						int i_2545_;
						if ((i_2545_ = (1 + i_2541_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2543_)
							i_2543_ = i_2545_;
						if (i_2542_ < 0) {
							i_2545_ = (anInt9341 - 1 - i_2542_) / anInt9341;
							i_2543_ += i_2545_;
							i_2541_ += anInt9340 * i_2545_;
							i_2542_ += anInt9341 * i_2545_;
							i_2540_ += i_2545_;
						}
						if ((i_2545_ = (1 + i_2542_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2543_)
							i_2543_ = i_2545_;
						int i_2546_ = is[i_2539_] - i;
						int i_2547_ = -is_2445_[i_2539_];
						int i_2548_ = i_2546_ - (i_2540_ - anInt9339);
						if (i_2548_ > 0) {
							i_2540_ += i_2548_;
							i_2543_ += i_2548_;
							i_2541_ += anInt9340 * i_2548_;
							i_2542_ += anInt9341 * i_2548_;
						} else
							i_2547_ -= i_2548_;
						if (i_2543_ < i_2547_)
							i_2543_ = i_2547_;
						for (/**/; i_2543_ < 0; i_2543_++) {
							int i_2549_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2542_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2541_ >> 12))]);
							if (i_2549_ != 0)
								is_2447_[i_2540_++] = i_2549_;
							else
								i_2540_++;
							i_2541_ += anInt9340;
							i_2542_ += anInt9341;
						}
					}
					i_2538_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method752(int[] is, int[] is_2550_, int i, int i_2551_) {
		int[] is_2552_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2552_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2553_ = anInt9356;
					while (i_2553_ < 0) {
						int i_2554_ = i_2553_ + i_2551_;
						if (i_2554_ >= 0) {
							if (i_2554_ >= is.length)
								break;
							int i_2555_ = anInt9339;
							int i_2556_ = anInt9346;
							int i_2557_ = anInt9324;
							int i_2558_ = anInt9347;
							if (i_2556_ >= 0 && i_2557_ >= 0 && (i_2556_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0 && (i_2557_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2559_ = is[i_2554_] - i;
								int i_2560_ = -is_2550_[i_2554_];
								int i_2561_ = i_2559_ - (i_2555_ - anInt9339);
								if (i_2561_ > 0) {
									i_2555_ += i_2561_;
									i_2558_ += i_2561_;
									i_2556_ += anInt9340 * i_2561_;
									i_2557_ += anInt9341 * i_2561_;
								} else
									i_2560_ -= i_2561_;
								if (i_2558_ < i_2560_)
									i_2558_ = i_2560_;
								for (/**/; i_2558_ < 0; i_2558_++) {
									int i_2562_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2557_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2556_ >> 12))]);
									if (i_2562_ != 0)
										is_2552_[i_2555_++] = i_2562_;
									else
										i_2555_++;
								}
							}
						}
						i_2553_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2563_ = anInt9356;
					while (i_2563_ < 0) {
						int i_2564_ = i_2563_ + i_2551_;
						if (i_2564_ >= 0) {
							if (i_2564_ >= is.length)
								break;
							int i_2565_ = anInt9339;
							int i_2566_ = anInt9346;
							int i_2567_ = anInt9324 + anInt9349;
							int i_2568_ = anInt9347;
							if (i_2566_ >= 0 && (i_2566_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								int i_2569_;
								if ((i_2569_ = (i_2567_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
									i_2569_ = (anInt9341 - i_2569_) / anInt9341;
									i_2568_ += i_2569_;
									i_2567_ += anInt9341 * i_2569_;
									i_2565_ += i_2569_;
								}
								if ((i_2569_ = (i_2567_ - anInt9341) / anInt9341) > i_2568_)
									i_2568_ = i_2569_;
								int i_2570_ = is[i_2564_] - i;
								int i_2571_ = -is_2550_[i_2564_];
								int i_2572_ = i_2570_ - (i_2565_ - anInt9339);
								if (i_2572_ > 0) {
									i_2565_ += i_2572_;
									i_2568_ += i_2572_;
									i_2566_ += anInt9340 * i_2572_;
									i_2567_ += anInt9341 * i_2572_;
								} else
									i_2571_ -= i_2572_;
								if (i_2568_ < i_2571_)
									i_2568_ = i_2571_;
								for (/**/; i_2568_ < 0; i_2568_++) {
									int i_2573_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2567_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2566_ >> 12))]);
									if (i_2573_ != 0)
										is_2552_[i_2565_++] = i_2573_;
									else
										i_2565_++;
									i_2567_ += anInt9341;
								}
							}
						}
						i_2563_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2574_ = anInt9356;
					while (i_2574_ < 0) {
						int i_2575_ = i_2574_ + i_2551_;
						if (i_2575_ >= 0) {
							if (i_2575_ >= is.length)
								break;
							int i_2576_ = anInt9339;
							int i_2577_ = anInt9346;
							int i_2578_ = anInt9324 + anInt9349;
							int i_2579_ = anInt9347;
							if (i_2577_ >= 0 && (i_2577_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								if (i_2578_ < 0) {
									int i_2580_ = ((anInt9341 - 1 - i_2578_) / anInt9341);
									i_2579_ += i_2580_;
									i_2578_ += anInt9341 * i_2580_;
									i_2576_ += i_2580_;
								}
								int i_2581_;
								if ((i_2581_ = (1 + i_2578_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2579_)
									i_2579_ = i_2581_;
								int i_2582_ = is[i_2575_] - i;
								int i_2583_ = -is_2550_[i_2575_];
								int i_2584_ = i_2582_ - (i_2576_ - anInt9339);
								if (i_2584_ > 0) {
									i_2576_ += i_2584_;
									i_2579_ += i_2584_;
									i_2577_ += anInt9340 * i_2584_;
									i_2578_ += anInt9341 * i_2584_;
								} else
									i_2583_ -= i_2584_;
								if (i_2579_ < i_2583_)
									i_2579_ = i_2583_;
								for (/**/; i_2579_ < 0; i_2579_++) {
									int i_2585_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2578_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2577_ >> 12))]);
									if (i_2585_ != 0)
										is_2552_[i_2576_++] = i_2585_;
									else
										i_2576_++;
									i_2578_ += anInt9341;
								}
							}
						}
						i_2574_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2586_ = anInt9356;
					while (i_2586_ < 0) {
						int i_2587_ = i_2586_ + i_2551_;
						if (i_2587_ >= 0) {
							if (i_2587_ >= is.length)
								break;
							int i_2588_ = anInt9339;
							int i_2589_ = anInt9346 + anInt9348;
							int i_2590_ = anInt9324;
							int i_2591_ = anInt9347;
							if (i_2590_ >= 0 && (i_2590_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2592_;
								if ((i_2592_ = (i_2589_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
									i_2592_ = (anInt9340 - i_2592_) / anInt9340;
									i_2591_ += i_2592_;
									i_2589_ += anInt9340 * i_2592_;
									i_2588_ += i_2592_;
								}
								if ((i_2592_ = (i_2589_ - anInt9340) / anInt9340) > i_2591_)
									i_2591_ = i_2592_;
								int i_2593_ = is[i_2587_] - i;
								int i_2594_ = -is_2550_[i_2587_];
								int i_2595_ = i_2593_ - (i_2588_ - anInt9339);
								if (i_2595_ > 0) {
									i_2588_ += i_2595_;
									i_2591_ += i_2595_;
									i_2589_ += anInt9340 * i_2595_;
									i_2590_ += anInt9341 * i_2595_;
								} else
									i_2594_ -= i_2595_;
								if (i_2591_ < i_2594_)
									i_2591_ = i_2594_;
								for (/**/; i_2591_ < 0; i_2591_++) {
									int i_2596_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2590_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2589_ >> 12))]);
									if (i_2596_ != 0)
										is_2552_[i_2588_++] = i_2596_;
									else
										i_2588_++;
									i_2589_ += anInt9340;
								}
							}
						}
						i_2586_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2597_ = anInt9356;
					while (i_2597_ < 0) {
						int i_2598_ = i_2597_ + i_2551_;
						if (i_2598_ >= 0) {
							if (i_2598_ >= is.length)
								break;
							int i_2599_ = anInt9339;
							int i_2600_ = anInt9346 + anInt9348;
							int i_2601_ = anInt9324 + anInt9349;
							int i_2602_ = anInt9347;
							int i_2603_;
							if ((i_2603_ = (i_2600_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2603_ = (anInt9340 - i_2603_) / anInt9340;
								i_2602_ += i_2603_;
								i_2600_ += anInt9340 * i_2603_;
								i_2601_ += anInt9341 * i_2603_;
								i_2599_ += i_2603_;
							}
							if ((i_2603_ = (i_2600_ - anInt9340) / anInt9340) > i_2602_)
								i_2602_ = i_2603_;
							if ((i_2603_ = (i_2601_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
								i_2603_ = (anInt9341 - i_2603_) / anInt9341;
								i_2602_ += i_2603_;
								i_2600_ += anInt9340 * i_2603_;
								i_2601_ += anInt9341 * i_2603_;
								i_2599_ += i_2603_;
							}
							if ((i_2603_ = (i_2601_ - anInt9341) / anInt9341) > i_2602_)
								i_2602_ = i_2603_;
							int i_2604_ = is[i_2598_] - i;
							int i_2605_ = -is_2550_[i_2598_];
							int i_2606_ = i_2604_ - (i_2599_ - anInt9339);
							if (i_2606_ > 0) {
								i_2599_ += i_2606_;
								i_2602_ += i_2606_;
								i_2600_ += anInt9340 * i_2606_;
								i_2601_ += anInt9341 * i_2606_;
							} else
								i_2605_ -= i_2606_;
							if (i_2602_ < i_2605_)
								i_2602_ = i_2605_;
							for (/**/; i_2602_ < 0; i_2602_++) {
								int i_2607_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2601_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2600_ >> 12))]);
								if (i_2607_ != 0)
									is_2552_[i_2599_++] = i_2607_;
								else
									i_2599_++;
								i_2600_ += anInt9340;
								i_2601_ += anInt9341;
							}
						}
						i_2597_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2608_ = anInt9356;
					while (i_2608_ < 0) {
						int i_2609_ = i_2608_ + i_2551_;
						if (i_2609_ >= 0) {
							if (i_2609_ >= is.length)
								break;
							int i_2610_ = anInt9339;
							int i_2611_ = anInt9346 + anInt9348;
							int i_2612_ = anInt9324 + anInt9349;
							int i_2613_ = anInt9347;
							int i_2614_;
							if ((i_2614_ = (i_2611_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2614_ = (anInt9340 - i_2614_) / anInt9340;
								i_2613_ += i_2614_;
								i_2611_ += anInt9340 * i_2614_;
								i_2612_ += anInt9341 * i_2614_;
								i_2610_ += i_2614_;
							}
							if ((i_2614_ = (i_2611_ - anInt9340) / anInt9340) > i_2613_)
								i_2613_ = i_2614_;
							if (i_2612_ < 0) {
								i_2614_ = (anInt9341 - 1 - i_2612_) / anInt9341;
								i_2613_ += i_2614_;
								i_2611_ += anInt9340 * i_2614_;
								i_2612_ += anInt9341 * i_2614_;
								i_2610_ += i_2614_;
							}
							if ((i_2614_ = (1 + i_2612_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2613_)
								i_2613_ = i_2614_;
							int i_2615_ = is[i_2609_] - i;
							int i_2616_ = -is_2550_[i_2609_];
							int i_2617_ = i_2615_ - (i_2610_ - anInt9339);
							if (i_2617_ > 0) {
								i_2610_ += i_2617_;
								i_2613_ += i_2617_;
								i_2611_ += anInt9340 * i_2617_;
								i_2612_ += anInt9341 * i_2617_;
							} else
								i_2616_ -= i_2617_;
							if (i_2613_ < i_2616_)
								i_2613_ = i_2616_;
							for (/**/; i_2613_ < 0; i_2613_++) {
								int i_2618_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2612_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2611_ >> 12))]);
								if (i_2618_ != 0)
									is_2552_[i_2610_++] = i_2618_;
								else
									i_2610_++;
								i_2611_ += anInt9340;
								i_2612_ += anInt9341;
							}
						}
						i_2608_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2619_ = anInt9356;
				while (i_2619_ < 0) {
					int i_2620_ = i_2619_ + i_2551_;
					if (i_2620_ >= 0) {
						if (i_2620_ >= is.length)
							break;
						int i_2621_ = anInt9339;
						int i_2622_ = anInt9346 + anInt9348;
						int i_2623_ = anInt9324;
						int i_2624_ = anInt9347;
						if (i_2623_ >= 0 && i_2623_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							if (i_2622_ < 0) {
								int i_2625_ = (anInt9340 - 1 - i_2622_) / anInt9340;
								i_2624_ += i_2625_;
								i_2622_ += anInt9340 * i_2625_;
								i_2621_ += i_2625_;
							}
							int i_2626_;
							if ((i_2626_ = (1 + i_2622_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2624_)
								i_2624_ = i_2626_;
							int i_2627_ = is[i_2620_] - i;
							int i_2628_ = -is_2550_[i_2620_];
							int i_2629_ = i_2627_ - (i_2621_ - anInt9339);
							if (i_2629_ > 0) {
								i_2621_ += i_2629_;
								i_2624_ += i_2629_;
								i_2622_ += anInt9340 * i_2629_;
								i_2623_ += anInt9341 * i_2629_;
							} else
								i_2628_ -= i_2629_;
							if (i_2624_ < i_2628_)
								i_2624_ = i_2628_;
							for (/**/; i_2624_ < 0; i_2624_++) {
								int i_2630_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2623_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2622_ >> 12))]);
								if (i_2630_ != 0)
									is_2552_[i_2621_++] = i_2630_;
								else
									i_2621_++;
								i_2622_ += anInt9340;
							}
						}
					}
					i_2619_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2631_ = anInt9356;
				while (i_2631_ < 0) {
					int i_2632_ = i_2631_ + i_2551_;
					if (i_2632_ >= 0) {
						if (i_2632_ >= is.length)
							break;
						int i_2633_ = anInt9339;
						int i_2634_ = anInt9346 + anInt9348;
						int i_2635_ = anInt9324 + anInt9349;
						int i_2636_ = anInt9347;
						if (i_2634_ < 0) {
							int i_2637_ = (anInt9340 - 1 - i_2634_) / anInt9340;
							i_2636_ += i_2637_;
							i_2634_ += anInt9340 * i_2637_;
							i_2635_ += anInt9341 * i_2637_;
							i_2633_ += i_2637_;
						}
						int i_2638_;
						if ((i_2638_ = (1 + i_2634_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2636_)
							i_2636_ = i_2638_;
						if ((i_2638_ = i_2635_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_2638_ = (anInt9341 - i_2638_) / anInt9341;
							i_2636_ += i_2638_;
							i_2634_ += anInt9340 * i_2638_;
							i_2635_ += anInt9341 * i_2638_;
							i_2633_ += i_2638_;
						}
						if ((i_2638_ = (i_2635_ - anInt9341) / anInt9341) > i_2636_)
							i_2636_ = i_2638_;
						int i_2639_ = is[i_2632_] - i;
						int i_2640_ = -is_2550_[i_2632_];
						int i_2641_ = i_2639_ - (i_2633_ - anInt9339);
						if (i_2641_ > 0) {
							i_2633_ += i_2641_;
							i_2636_ += i_2641_;
							i_2634_ += anInt9340 * i_2641_;
							i_2635_ += anInt9341 * i_2641_;
						} else
							i_2640_ -= i_2641_;
						if (i_2636_ < i_2640_)
							i_2636_ = i_2640_;
						for (/**/; i_2636_ < 0; i_2636_++) {
							int i_2642_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2635_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2634_ >> 12))]);
							if (i_2642_ != 0)
								is_2552_[i_2633_++] = i_2642_;
							else
								i_2633_++;
							i_2634_ += anInt9340;
							i_2635_ += anInt9341;
						}
					}
					i_2631_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2643_ = anInt9356;
				while (i_2643_ < 0) {
					int i_2644_ = i_2643_ + i_2551_;
					if (i_2644_ >= 0) {
						if (i_2644_ >= is.length)
							break;
						int i_2645_ = anInt9339;
						int i_2646_ = anInt9346 + anInt9348;
						int i_2647_ = anInt9324 + anInt9349;
						int i_2648_ = anInt9347;
						if (i_2646_ < 0) {
							int i_2649_ = (anInt9340 - 1 - i_2646_) / anInt9340;
							i_2648_ += i_2649_;
							i_2646_ += anInt9340 * i_2649_;
							i_2647_ += anInt9341 * i_2649_;
							i_2645_ += i_2649_;
						}
						int i_2650_;
						if ((i_2650_ = (1 + i_2646_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2648_)
							i_2648_ = i_2650_;
						if (i_2647_ < 0) {
							i_2650_ = (anInt9341 - 1 - i_2647_) / anInt9341;
							i_2648_ += i_2650_;
							i_2646_ += anInt9340 * i_2650_;
							i_2647_ += anInt9341 * i_2650_;
							i_2645_ += i_2650_;
						}
						if ((i_2650_ = (1 + i_2647_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2648_)
							i_2648_ = i_2650_;
						int i_2651_ = is[i_2644_] - i;
						int i_2652_ = -is_2550_[i_2644_];
						int i_2653_ = i_2651_ - (i_2645_ - anInt9339);
						if (i_2653_ > 0) {
							i_2645_ += i_2653_;
							i_2648_ += i_2653_;
							i_2646_ += anInt9340 * i_2653_;
							i_2647_ += anInt9341 * i_2653_;
						} else
							i_2652_ -= i_2653_;
						if (i_2648_ < i_2652_)
							i_2648_ = i_2652_;
						for (/**/; i_2648_ < 0; i_2648_++) {
							int i_2654_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2647_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2646_ >> 12))]);
							if (i_2654_ != 0)
								is_2552_[i_2645_++] = i_2654_;
							else
								i_2645_++;
							i_2646_ += anInt9340;
							i_2647_ += anInt9341;
						}
					}
					i_2643_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method753(int[] is, int[] is_2655_, int i, int i_2656_) {
		int[] is_2657_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub1) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_2657_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2658_ = anInt9356;
					while (i_2658_ < 0) {
						int i_2659_ = i_2658_ + i_2656_;
						if (i_2659_ >= 0) {
							if (i_2659_ >= is.length)
								break;
							int i_2660_ = anInt9339;
							int i_2661_ = anInt9346;
							int i_2662_ = anInt9324;
							int i_2663_ = anInt9347;
							if (i_2661_ >= 0 && i_2662_ >= 0 && (i_2661_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0 && (i_2662_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2664_ = is[i_2659_] - i;
								int i_2665_ = -is_2655_[i_2659_];
								int i_2666_ = i_2664_ - (i_2660_ - anInt9339);
								if (i_2666_ > 0) {
									i_2660_ += i_2666_;
									i_2663_ += i_2666_;
									i_2661_ += anInt9340 * i_2666_;
									i_2662_ += anInt9341 * i_2666_;
								} else
									i_2665_ -= i_2666_;
								if (i_2663_ < i_2665_)
									i_2663_ = i_2665_;
								for (/**/; i_2663_ < 0; i_2663_++) {
									int i_2667_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2662_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2661_ >> 12))]);
									if (i_2667_ != 0)
										is_2657_[i_2660_++] = i_2667_;
									else
										i_2660_++;
								}
							}
						}
						i_2658_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2668_ = anInt9356;
					while (i_2668_ < 0) {
						int i_2669_ = i_2668_ + i_2656_;
						if (i_2669_ >= 0) {
							if (i_2669_ >= is.length)
								break;
							int i_2670_ = anInt9339;
							int i_2671_ = anInt9346;
							int i_2672_ = anInt9324 + anInt9349;
							int i_2673_ = anInt9347;
							if (i_2671_ >= 0 && (i_2671_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								int i_2674_;
								if ((i_2674_ = (i_2672_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
									i_2674_ = (anInt9341 - i_2674_) / anInt9341;
									i_2673_ += i_2674_;
									i_2672_ += anInt9341 * i_2674_;
									i_2670_ += i_2674_;
								}
								if ((i_2674_ = (i_2672_ - anInt9341) / anInt9341) > i_2673_)
									i_2673_ = i_2674_;
								int i_2675_ = is[i_2669_] - i;
								int i_2676_ = -is_2655_[i_2669_];
								int i_2677_ = i_2675_ - (i_2670_ - anInt9339);
								if (i_2677_ > 0) {
									i_2670_ += i_2677_;
									i_2673_ += i_2677_;
									i_2671_ += anInt9340 * i_2677_;
									i_2672_ += anInt9341 * i_2677_;
								} else
									i_2676_ -= i_2677_;
								if (i_2673_ < i_2676_)
									i_2673_ = i_2676_;
								for (/**/; i_2673_ < 0; i_2673_++) {
									int i_2678_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2672_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2671_ >> 12))]);
									if (i_2678_ != 0)
										is_2657_[i_2670_++] = i_2678_;
									else
										i_2670_++;
									i_2672_ += anInt9341;
								}
							}
						}
						i_2668_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2679_ = anInt9356;
					while (i_2679_ < 0) {
						int i_2680_ = i_2679_ + i_2656_;
						if (i_2680_ >= 0) {
							if (i_2680_ >= is.length)
								break;
							int i_2681_ = anInt9339;
							int i_2682_ = anInt9346;
							int i_2683_ = anInt9324 + anInt9349;
							int i_2684_ = anInt9347;
							if (i_2682_ >= 0 && (i_2682_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12)) < 0) {
								if (i_2683_ < 0) {
									int i_2685_ = ((anInt9341 - 1 - i_2683_) / anInt9341);
									i_2684_ += i_2685_;
									i_2683_ += anInt9341 * i_2685_;
									i_2681_ += i_2685_;
								}
								int i_2686_;
								if ((i_2686_ = (1 + i_2683_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2684_)
									i_2684_ = i_2686_;
								int i_2687_ = is[i_2680_] - i;
								int i_2688_ = -is_2655_[i_2680_];
								int i_2689_ = i_2687_ - (i_2681_ - anInt9339);
								if (i_2689_ > 0) {
									i_2681_ += i_2689_;
									i_2684_ += i_2689_;
									i_2682_ += anInt9340 * i_2689_;
									i_2683_ += anInt9341 * i_2689_;
								} else
									i_2688_ -= i_2689_;
								if (i_2684_ < i_2688_)
									i_2684_ = i_2688_;
								for (/**/; i_2684_ < 0; i_2684_++) {
									int i_2690_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2683_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2682_ >> 12))]);
									if (i_2690_ != 0)
										is_2657_[i_2681_++] = i_2690_;
									else
										i_2681_++;
									i_2683_ += anInt9341;
								}
							}
						}
						i_2679_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_2691_ = anInt9356;
					while (i_2691_ < 0) {
						int i_2692_ = i_2691_ + i_2656_;
						if (i_2692_ >= 0) {
							if (i_2692_ >= is.length)
								break;
							int i_2693_ = anInt9339;
							int i_2694_ = anInt9346 + anInt9348;
							int i_2695_ = anInt9324;
							int i_2696_ = anInt9347;
							if (i_2695_ >= 0 && (i_2695_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) < 0) {
								int i_2697_;
								if ((i_2697_ = (i_2694_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
									i_2697_ = (anInt9340 - i_2697_) / anInt9340;
									i_2696_ += i_2697_;
									i_2694_ += anInt9340 * i_2697_;
									i_2693_ += i_2697_;
								}
								if ((i_2697_ = (i_2694_ - anInt9340) / anInt9340) > i_2696_)
									i_2696_ = i_2697_;
								int i_2698_ = is[i_2692_] - i;
								int i_2699_ = -is_2655_[i_2692_];
								int i_2700_ = i_2698_ - (i_2693_ - anInt9339);
								if (i_2700_ > 0) {
									i_2693_ += i_2700_;
									i_2696_ += i_2700_;
									i_2694_ += anInt9340 * i_2700_;
									i_2695_ += anInt9341 * i_2700_;
								} else
									i_2699_ -= i_2700_;
								if (i_2696_ < i_2699_)
									i_2696_ = i_2699_;
								for (/**/; i_2696_ < 0; i_2696_++) {
									int i_2701_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2695_ >> 12) * (((Class61_Sub3_Sub1) this).anInt9358)) + (i_2694_ >> 12))]);
									if (i_2701_ != 0)
										is_2657_[i_2693_++] = i_2701_;
									else
										i_2693_++;
									i_2694_ += anInt9340;
								}
							}
						}
						i_2691_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2702_ = anInt9356;
					while (i_2702_ < 0) {
						int i_2703_ = i_2702_ + i_2656_;
						if (i_2703_ >= 0) {
							if (i_2703_ >= is.length)
								break;
							int i_2704_ = anInt9339;
							int i_2705_ = anInt9346 + anInt9348;
							int i_2706_ = anInt9324 + anInt9349;
							int i_2707_ = anInt9347;
							int i_2708_;
							if ((i_2708_ = (i_2705_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2708_ = (anInt9340 - i_2708_) / anInt9340;
								i_2707_ += i_2708_;
								i_2705_ += anInt9340 * i_2708_;
								i_2706_ += anInt9341 * i_2708_;
								i_2704_ += i_2708_;
							}
							if ((i_2708_ = (i_2705_ - anInt9340) / anInt9340) > i_2707_)
								i_2707_ = i_2708_;
							if ((i_2708_ = (i_2706_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12))) >= 0) {
								i_2708_ = (anInt9341 - i_2708_) / anInt9341;
								i_2707_ += i_2708_;
								i_2705_ += anInt9340 * i_2708_;
								i_2706_ += anInt9341 * i_2708_;
								i_2704_ += i_2708_;
							}
							if ((i_2708_ = (i_2706_ - anInt9341) / anInt9341) > i_2707_)
								i_2707_ = i_2708_;
							int i_2709_ = is[i_2703_] - i;
							int i_2710_ = -is_2655_[i_2703_];
							int i_2711_ = i_2709_ - (i_2704_ - anInt9339);
							if (i_2711_ > 0) {
								i_2704_ += i_2711_;
								i_2707_ += i_2711_;
								i_2705_ += anInt9340 * i_2711_;
								i_2706_ += anInt9341 * i_2711_;
							} else
								i_2710_ -= i_2711_;
							if (i_2707_ < i_2710_)
								i_2707_ = i_2710_;
							for (/**/; i_2707_ < 0; i_2707_++) {
								int i_2712_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2706_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2705_ >> 12))]);
								if (i_2712_ != 0)
									is_2657_[i_2704_++] = i_2712_;
								else
									i_2704_++;
								i_2705_ += anInt9340;
								i_2706_ += anInt9341;
							}
						}
						i_2702_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2713_ = anInt9356;
					while (i_2713_ < 0) {
						int i_2714_ = i_2713_ + i_2656_;
						if (i_2714_ >= 0) {
							if (i_2714_ >= is.length)
								break;
							int i_2715_ = anInt9339;
							int i_2716_ = anInt9346 + anInt9348;
							int i_2717_ = anInt9324 + anInt9349;
							int i_2718_ = anInt9347;
							int i_2719_;
							if ((i_2719_ = (i_2716_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12))) >= 0) {
								i_2719_ = (anInt9340 - i_2719_) / anInt9340;
								i_2718_ += i_2719_;
								i_2716_ += anInt9340 * i_2719_;
								i_2717_ += anInt9341 * i_2719_;
								i_2715_ += i_2719_;
							}
							if ((i_2719_ = (i_2716_ - anInt9340) / anInt9340) > i_2718_)
								i_2718_ = i_2719_;
							if (i_2717_ < 0) {
								i_2719_ = (anInt9341 - 1 - i_2717_) / anInt9341;
								i_2718_ += i_2719_;
								i_2716_ += anInt9340 * i_2719_;
								i_2717_ += anInt9341 * i_2719_;
								i_2715_ += i_2719_;
							}
							if ((i_2719_ = (1 + i_2717_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2718_)
								i_2718_ = i_2719_;
							int i_2720_ = is[i_2714_] - i;
							int i_2721_ = -is_2655_[i_2714_];
							int i_2722_ = i_2720_ - (i_2715_ - anInt9339);
							if (i_2722_ > 0) {
								i_2715_ += i_2722_;
								i_2718_ += i_2722_;
								i_2716_ += anInt9340 * i_2722_;
								i_2717_ += anInt9341 * i_2722_;
							} else
								i_2721_ -= i_2722_;
							if (i_2718_ < i_2721_)
								i_2718_ = i_2721_;
							for (/**/; i_2718_ < 0; i_2718_++) {
								int i_2723_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2717_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2716_ >> 12))]);
								if (i_2723_ != 0)
									is_2657_[i_2715_++] = i_2723_;
								else
									i_2715_++;
								i_2716_ += anInt9340;
								i_2717_ += anInt9341;
							}
						}
						i_2713_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_2724_ = anInt9356;
				while (i_2724_ < 0) {
					int i_2725_ = i_2724_ + i_2656_;
					if (i_2725_ >= 0) {
						if (i_2725_ >= is.length)
							break;
						int i_2726_ = anInt9339;
						int i_2727_ = anInt9346 + anInt9348;
						int i_2728_ = anInt9324;
						int i_2729_ = anInt9347;
						if (i_2728_ >= 0 && i_2728_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) < 0) {
							if (i_2727_ < 0) {
								int i_2730_ = (anInt9340 - 1 - i_2727_) / anInt9340;
								i_2729_ += i_2730_;
								i_2727_ += anInt9340 * i_2730_;
								i_2726_ += i_2730_;
							}
							int i_2731_;
							if ((i_2731_ = (1 + i_2727_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2729_)
								i_2729_ = i_2731_;
							int i_2732_ = is[i_2725_] - i;
							int i_2733_ = -is_2655_[i_2725_];
							int i_2734_ = i_2732_ - (i_2726_ - anInt9339);
							if (i_2734_ > 0) {
								i_2726_ += i_2734_;
								i_2729_ += i_2734_;
								i_2727_ += anInt9340 * i_2734_;
								i_2728_ += anInt9341 * i_2734_;
							} else
								i_2733_ -= i_2734_;
							if (i_2729_ < i_2733_)
								i_2729_ = i_2733_;
							for (/**/; i_2729_ < 0; i_2729_++) {
								int i_2735_ = (((Class61_Sub3_Sub1) this).anIntArray10093[((i_2728_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358 + (i_2727_ >> 12))]);
								if (i_2735_ != 0)
									is_2657_[i_2726_++] = i_2735_;
								else
									i_2726_++;
								i_2727_ += anInt9340;
							}
						}
					}
					i_2724_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_2736_ = anInt9356;
				while (i_2736_ < 0) {
					int i_2737_ = i_2736_ + i_2656_;
					if (i_2737_ >= 0) {
						if (i_2737_ >= is.length)
							break;
						int i_2738_ = anInt9339;
						int i_2739_ = anInt9346 + anInt9348;
						int i_2740_ = anInt9324 + anInt9349;
						int i_2741_ = anInt9347;
						if (i_2739_ < 0) {
							int i_2742_ = (anInt9340 - 1 - i_2739_) / anInt9340;
							i_2741_ += i_2742_;
							i_2739_ += anInt9340 * i_2742_;
							i_2740_ += anInt9341 * i_2742_;
							i_2738_ += i_2742_;
						}
						int i_2743_;
						if ((i_2743_ = (1 + i_2739_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2741_)
							i_2741_ = i_2743_;
						if ((i_2743_ = i_2740_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12)) >= 0) {
							i_2743_ = (anInt9341 - i_2743_) / anInt9341;
							i_2741_ += i_2743_;
							i_2739_ += anInt9340 * i_2743_;
							i_2740_ += anInt9341 * i_2743_;
							i_2738_ += i_2743_;
						}
						if ((i_2743_ = (i_2740_ - anInt9341) / anInt9341) > i_2741_)
							i_2741_ = i_2743_;
						int i_2744_ = is[i_2737_] - i;
						int i_2745_ = -is_2655_[i_2737_];
						int i_2746_ = i_2744_ - (i_2738_ - anInt9339);
						if (i_2746_ > 0) {
							i_2738_ += i_2746_;
							i_2741_ += i_2746_;
							i_2739_ += anInt9340 * i_2746_;
							i_2740_ += anInt9341 * i_2746_;
						} else
							i_2745_ -= i_2746_;
						if (i_2741_ < i_2745_)
							i_2741_ = i_2745_;
						for (/**/; i_2741_ < 0; i_2741_++) {
							int i_2747_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2740_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2739_ >> 12))]);
							if (i_2747_ != 0)
								is_2657_[i_2738_++] = i_2747_;
							else
								i_2738_++;
							i_2739_ += anInt9340;
							i_2740_ += anInt9341;
						}
					}
					i_2736_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_2748_ = anInt9356;
				while (i_2748_ < 0) {
					int i_2749_ = i_2748_ + i_2656_;
					if (i_2749_ >= 0) {
						if (i_2749_ >= is.length)
							break;
						int i_2750_ = anInt9339;
						int i_2751_ = anInt9346 + anInt9348;
						int i_2752_ = anInt9324 + anInt9349;
						int i_2753_ = anInt9347;
						if (i_2751_ < 0) {
							int i_2754_ = (anInt9340 - 1 - i_2751_) / anInt9340;
							i_2753_ += i_2754_;
							i_2751_ += anInt9340 * i_2754_;
							i_2752_ += anInt9341 * i_2754_;
							i_2750_ += i_2754_;
						}
						int i_2755_;
						if ((i_2755_ = (1 + i_2751_ - (((Class61_Sub3_Sub1) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_2753_)
							i_2753_ = i_2755_;
						if (i_2752_ < 0) {
							i_2755_ = (anInt9341 - 1 - i_2752_) / anInt9341;
							i_2753_ += i_2755_;
							i_2751_ += anInt9340 * i_2755_;
							i_2752_ += anInt9341 * i_2755_;
							i_2750_ += i_2755_;
						}
						if ((i_2755_ = (1 + i_2752_ - (((Class61_Sub3_Sub1) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2753_)
							i_2753_ = i_2755_;
						int i_2756_ = is[i_2749_] - i;
						int i_2757_ = -is_2655_[i_2749_];
						int i_2758_ = i_2756_ - (i_2750_ - anInt9339);
						if (i_2758_ > 0) {
							i_2750_ += i_2758_;
							i_2753_ += i_2758_;
							i_2751_ += anInt9340 * i_2758_;
							i_2752_ += anInt9341 * i_2758_;
						} else
							i_2757_ -= i_2758_;
						if (i_2753_ < i_2757_)
							i_2753_ = i_2757_;
						for (/**/; i_2753_ < 0; i_2753_++) {
							int i_2759_ = (((Class61_Sub3_Sub1) this).anIntArray10093[(((i_2752_ >> 12) * ((Class61_Sub3_Sub1) this).anInt9358) + (i_2751_ >> 12))]);
							if (i_2759_ != 0)
								is_2657_[i_2750_++] = i_2759_;
							else
								i_2750_++;
							i_2751_ += anInt9340;
							i_2752_ += anInt9341;
						}
					}
					i_2748_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}
}
