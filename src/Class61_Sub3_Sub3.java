/* Class61_Sub3_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61_Sub3_Sub3 extends Class61_Sub3 {
	byte[] aByteArray10095;
	int[] anIntArray10096;

	public void method708(int i, int i_0_, Class_ta class_ta, int i_1_, int i_2_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			i += ((Class61_Sub3_Sub3) this).anInt9352;
			i_0_ += ((Class61_Sub3_Sub3) this).anInt9327;
			int i_3_ = 0;
			int i_4_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			int i_5_ = ((Class61_Sub3_Sub3) this).anInt9358;
			int i_6_ = ((Class61_Sub3_Sub3) this).anInt9325;
			int i_7_ = i_4_ - i_5_;
			int i_8_ = 0;
			int i_9_ = i + i_0_ * i_4_;
			if (i_0_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_10_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_0_);
				i_6_ -= i_10_;
				i_0_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_3_ += i_10_ * i_5_;
				i_9_ += i_10_ * i_4_;
			}
			if (i_0_ + i_6_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541)
				i_6_ -= (i_0_ + i_6_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541));
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_11_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_5_ -= i_11_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_3_ += i_11_;
				i_9_ += i_11_;
				i_8_ += i_11_;
				i_7_ += i_11_;
			}
			if (i + i_5_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635 * -1071049483)) {
				int i_12_ = i + i_5_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483;
				i_5_ -= i_12_;
				i_8_ += i_12_;
				i_7_ += i_12_;
			}
			if (i_5_ > 0 && i_6_ > 0) {
				Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
				int[] is_13_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
				int[] is_14_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
				int i_15_ = i_0_;
				if (i_2_ > i_15_) {
					i_15_ = i_2_;
					i_9_ += (i_2_ - i_0_) * i_4_;
					i_3_ += ((i_2_ - i_0_) * ((Class61_Sub3_Sub3) this).anInt9358);
				}
				int i_16_ = (i_2_ + is_13_.length < i_0_ + i_6_ ? i_2_ + is_13_.length : i_0_ + i_6_);
				for (int i_17_ = i_15_; i_17_ < i_16_; i_17_++) {
					int i_18_ = is_13_[i_17_ - i_2_] + i_1_;
					int i_19_ = is_14_[i_17_ - i_2_];
					int i_20_ = i_5_;
					if (i > i_18_) {
						int i_21_ = i - i_18_;
						if (i_21_ >= i_19_) {
							i_3_ += i_5_ + i_8_;
							i_9_ += i_5_ + i_7_;
							continue;
						}
						i_19_ -= i_21_;
					} else {
						int i_22_ = i_18_ - i;
						if (i_22_ >= i_5_) {
							i_3_ += i_5_ + i_8_;
							i_9_ += i_5_ + i_7_;
							continue;
						}
						i_3_ += i_22_;
						i_20_ -= i_22_;
						i_9_ += i_22_;
					}
					int i_23_ = 0;
					if (i_20_ < i_19_)
						i_19_ = i_20_;
					else
						i_23_ = i_20_ - i_19_;
					for (int i_24_ = -i_19_; i_24_ < 0; i_24_++) {
						int i_25_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3_++]);
						if (i_25_ != 0)
							is[i_9_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_25_ & 0xff]);
						else
							i_9_++;
					}
					i_3_ += i_23_ + i_8_;
					i_9_ += i_23_ + i_7_;
				}
			}
		}
	}

	public void method737(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		throw new IllegalStateException();
	}

	public void method722(int i, int i_31_, int i_32_) {
		throw new IllegalStateException();
	}

	public void method685(int i, int i_33_, int i_34_, int i_35_, int i_36_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_37_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub3) this).anInt9352;
			i_33_ += ((Class61_Sub3_Sub3) this).anInt9327;
			int i_38_ = i_33_ * i_37_ + i;
			int i_39_ = 0;
			int i_40_ = ((Class61_Sub3_Sub3) this).anInt9325;
			int i_41_ = ((Class61_Sub3_Sub3) this).anInt9358;
			int i_42_ = i_37_ - i_41_;
			int i_43_ = 0;
			if (i_33_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_44_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_33_);
				i_40_ -= i_44_;
				i_33_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_39_ += i_44_ * i_41_;
				i_38_ += i_44_ * i_37_;
			}
			if (i_33_ + i_40_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_40_ -= (i_33_ + i_40_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541));
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_45_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_41_ -= i_45_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_39_ += i_45_;
				i_38_ += i_45_;
				i_43_ += i_45_;
				i_42_ += i_45_;
			}
			if (i + i_41_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635 * -1071049483)) {
				int i_46_ = i + i_41_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483;
				i_41_ -= i_46_;
				i_43_ += i_46_;
				i_42_ += i_46_;
			}
			if (i_41_ > 0 && i_40_ > 0) {
				if (i_36_ == 0) {
					if (i_34_ == 1) {
						for (int i_47_ = -i_40_; i_47_ < 0; i_47_++) {
							int i_48_ = i_38_ + i_41_ - 3;
							while (i_38_ < i_48_) {
								is[i_38_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
								is[i_38_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
								is[i_38_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
								is[i_38_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
							}
							i_48_ += 3;
							while (i_38_ < i_48_)
								is[i_38_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 0) {
						int i_49_ = (i_35_ & 0xff0000) >> 16;
						int i_50_ = (i_35_ & 0xff00) >> 8;
						int i_51_ = i_35_ & 0xff;
						for (int i_52_ = -i_40_; i_52_ < 0; i_52_++) {
							for (int i_53_ = -i_41_; i_53_ < 0; i_53_++) {
								int i_54_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
								int i_55_ = (i_54_ & 0xff0000) * i_49_ & ~0xffffff;
								int i_56_ = (i_54_ & 0xff00) * i_50_ & 0xff0000;
								int i_57_ = (i_54_ & 0xff) * i_51_ & 0xff00;
								is[i_38_++] = (i_55_ | i_56_ | i_57_) >>> 8;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 3) {
						for (int i_58_ = -i_40_; i_58_ < 0; i_58_++) {
							for (int i_59_ = -i_41_; i_59_ < 0; i_59_++) {
								int i_60_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
								int i_61_ = i_60_ + i_35_;
								int i_62_ = (i_60_ & 0xff00ff) + (i_35_ & 0xff00ff);
								int i_63_ = ((i_62_ & 0x1000100) + (i_61_ - i_62_ & 0x10000));
								is[i_38_++] = i_61_ - i_63_ | i_63_ - (i_63_ >>> 8);
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 2) {
						int i_64_ = i_35_ >>> 24;
						int i_65_ = 256 - i_64_;
						int i_66_ = (i_35_ & 0xff00ff) * i_65_ & ~0xff00ff;
						int i_67_ = (i_35_ & 0xff00) * i_65_ & 0xff0000;
						i_35_ = (i_66_ | i_67_) >>> 8;
						for (int i_68_ = -i_40_; i_68_ < 0; i_68_++) {
							for (int i_69_ = -i_41_; i_69_ < 0; i_69_++) {
								int i_70_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]) & 0xff]);
								i_66_ = (i_70_ & 0xff00ff) * i_64_ & ~0xff00ff;
								i_67_ = (i_70_ & 0xff00) * i_64_ & 0xff0000;
								is[i_38_++] = ((i_66_ | i_67_) >>> 8) + i_35_;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_36_ == 1) {
					if (i_34_ == 1) {
						for (int i_71_ = -i_40_; i_71_ < 0; i_71_++) {
							for (int i_72_ = -i_41_; i_72_ < 0; i_72_++) {
								int i_73_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
								if (i_73_ != 0) {
									int i_74_ = ((((Class61_Sub3_Sub3) this).anIntArray10096[i_73_ & 0xff]) | ~0xffffff);
									int i_75_ = 255;
									int i_76_ = 0;
									int i_77_ = is[i_38_];
									is[i_38_++] = (((((i_74_ & 0xff00ff) * i_75_ + (i_77_ & 0xff00ff) * i_76_) & ~0xff00ff) >> 8) + (((((i_74_ & ~0xff00ff) >>> 8) * i_75_) + (((i_77_ & ~0xff00ff) >>> 8) * i_76_)) & ~0xff00ff));
								} else
									i_38_++;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 0) {
						if ((i_35_ & 0xffffff) == 16777215) {
							int i_78_ = i_35_ >>> 24;
							int i_79_ = 256 - i_78_;
							for (int i_80_ = -i_40_; i_80_ < 0; i_80_++) {
								for (int i_81_ = -i_41_; i_81_ < 0; i_81_++) {
									int i_82_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
									if (i_82_ != 0) {
										int i_83_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_82_ & 0xff]);
										int i_84_ = is[i_38_];
										is[i_38_++] = ((((i_83_ & 0xff00ff) * i_78_ + (i_84_ & 0xff00ff) * i_79_) & ~0xff00ff) + (((i_83_ & 0xff00) * i_78_ + (i_84_ & 0xff00) * i_79_) & 0xff0000)) >> 8;
									} else
										i_38_++;
								}
								i_38_ += i_42_;
								i_39_ += i_43_;
							}
						} else {
							int i_85_ = (i_35_ & 0xff0000) >> 16;
							int i_86_ = (i_35_ & 0xff00) >> 8;
							int i_87_ = i_35_ & 0xff;
							int i_88_ = i_35_ >>> 24;
							int i_89_ = 256 - i_88_;
							for (int i_90_ = -i_40_; i_90_ < 0; i_90_++) {
								for (int i_91_ = -i_41_; i_91_ < 0; i_91_++) {
									int i_92_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
									if (i_92_ != 0) {
										int i_93_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_92_ & 0xff]);
										if (i_88_ != 255) {
											int i_94_ = ((i_93_ & 0xff0000) * i_85_ & ~0xffffff);
											int i_95_ = ((i_93_ & 0xff00) * i_86_ & 0xff0000);
											int i_96_ = ((i_93_ & 0xff) * i_87_ & 0xff00);
											i_93_ = ((i_94_ | i_95_ | i_96_) >>> 8);
											int i_97_ = is[i_38_];
											is[i_38_++] = ((((i_93_ & 0xff00ff) * i_88_ + ((i_97_ & 0xff00ff) * i_89_)) & ~0xff00ff) + (((i_93_ & 0xff00) * i_88_ + ((i_97_ & 0xff00) * i_89_)) & 0xff0000)) >> 8;
										} else {
											int i_98_ = ((i_93_ & 0xff0000) * i_85_ & ~0xffffff);
											int i_99_ = ((i_93_ & 0xff00) * i_86_ & 0xff0000);
											int i_100_ = ((i_93_ & 0xff) * i_87_ & 0xff00);
											is[i_38_++] = (i_98_ | i_99_ | i_100_) >>> 8;
										}
									} else
										i_38_++;
								}
								i_38_ += i_42_;
								i_39_ += i_43_;
							}
						}
					} else if (i_34_ == 3) {
						int i_101_ = i_35_ >>> 24;
						int i_102_ = 256 - i_101_;
						for (int i_103_ = -i_40_; i_103_ < 0; i_103_++) {
							for (int i_104_ = -i_41_; i_104_ < 0; i_104_++) {
								byte i_105_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
								int i_106_ = (i_105_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_105_]) : 0);
								int i_107_ = i_106_ + i_35_;
								int i_108_ = (i_106_ & 0xff00ff) + (i_35_ & 0xff00ff);
								int i_109_ = ((i_108_ & 0x1000100) + (i_107_ - i_108_ & 0x10000));
								i_109_ = i_107_ - i_109_ | i_109_ - (i_109_ >>> 8);
								if (i_106_ == 0 && i_101_ != 255) {
									i_106_ = i_109_;
									i_109_ = is[i_38_];
									i_109_ = ((((i_106_ & 0xff00ff) * i_101_ + (i_109_ & 0xff00ff) * i_102_) & ~0xff00ff) + (((i_106_ & 0xff00) * i_101_ + (i_109_ & 0xff00) * i_102_) & 0xff0000)) >> 8;
								}
								is[i_38_++] = i_109_;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 2) {
						int i_110_ = i_35_ >>> 24;
						int i_111_ = 256 - i_110_;
						int i_112_ = (i_35_ & 0xff00ff) * i_111_ & ~0xff00ff;
						int i_113_ = (i_35_ & 0xff00) * i_111_ & 0xff0000;
						i_35_ = (i_112_ | i_113_) >>> 8;
						for (int i_114_ = -i_40_; i_114_ < 0; i_114_++) {
							for (int i_115_ = -i_41_; i_115_ < 0; i_115_++) {
								int i_116_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
								if (i_116_ != 0) {
									int i_117_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_116_ & 0xff]);
									i_112_ = ((i_117_ & 0xff00ff) * i_110_ & ~0xff00ff);
									i_113_ = ((i_117_ & 0xff00) * i_110_ & 0xff0000);
									is[i_38_++] = ((i_112_ | i_113_) >>> 8) + i_35_;
								} else
									i_38_++;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_36_ == 2) {
					if (i_34_ == 1) {
						for (int i_118_ = -i_40_; i_118_ < 0; i_118_++) {
							for (int i_119_ = -i_41_; i_119_ < 0; i_119_++) {
								int i_120_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
								if (i_120_ != 0) {
									int i_121_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_120_ & 0xff]);
									int i_122_ = is[i_38_];
									int i_123_ = i_121_ + i_122_;
									int i_124_ = ((i_121_ & 0xff00ff) + (i_122_ & 0xff00ff));
									i_122_ = ((i_124_ & 0x1000100) + (i_123_ - i_124_ & 0x10000));
									is[i_38_++] = i_123_ - i_122_ | i_122_ - (i_122_ >>> 8);
								} else
									i_38_++;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 0) {
						int i_125_ = (i_35_ & 0xff0000) >> 16;
						int i_126_ = (i_35_ & 0xff00) >> 8;
						int i_127_ = i_35_ & 0xff;
						for (int i_128_ = -i_40_; i_128_ < 0; i_128_++) {
							for (int i_129_ = -i_41_; i_129_ < 0; i_129_++) {
								int i_130_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
								if (i_130_ != 0) {
									int i_131_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_130_ & 0xff]);
									int i_132_ = ((i_131_ & 0xff0000) * i_125_ & ~0xffffff);
									int i_133_ = ((i_131_ & 0xff00) * i_126_ & 0xff0000);
									int i_134_ = (i_131_ & 0xff) * i_127_ & 0xff00;
									i_131_ = (i_132_ | i_133_ | i_134_) >>> 8;
									int i_135_ = is[i_38_];
									int i_136_ = i_131_ + i_135_;
									int i_137_ = ((i_131_ & 0xff00ff) + (i_135_ & 0xff00ff));
									i_135_ = ((i_137_ & 0x1000100) + (i_136_ - i_137_ & 0x10000));
									is[i_38_++] = i_136_ - i_135_ | i_135_ - (i_135_ >>> 8);
								} else
									i_38_++;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 3) {
						for (int i_138_ = -i_40_; i_138_ < 0; i_138_++) {
							for (int i_139_ = -i_41_; i_139_ < 0; i_139_++) {
								byte i_140_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
								int i_141_ = (i_140_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_140_]) : 0);
								int i_142_ = i_141_ + i_35_;
								int i_143_ = (i_141_ & 0xff00ff) + (i_35_ & 0xff00ff);
								int i_144_ = ((i_143_ & 0x1000100) + (i_142_ - i_143_ & 0x10000));
								i_141_ = i_142_ - i_144_ | i_144_ - (i_144_ >>> 8);
								i_144_ = is[i_38_];
								i_142_ = i_141_ + i_144_;
								i_143_ = (i_141_ & 0xff00ff) + (i_144_ & 0xff00ff);
								i_144_ = (i_143_ & 0x1000100) + (i_142_ - i_143_ & 0x10000);
								is[i_38_++] = i_142_ - i_144_ | i_144_ - (i_144_ >>> 8);
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else if (i_34_ == 2) {
						int i_145_ = i_35_ >>> 24;
						int i_146_ = 256 - i_145_;
						int i_147_ = (i_35_ & 0xff00ff) * i_146_ & ~0xff00ff;
						int i_148_ = (i_35_ & 0xff00) * i_146_ & 0xff0000;
						i_35_ = (i_147_ | i_148_) >>> 8;
						for (int i_149_ = -i_40_; i_149_ < 0; i_149_++) {
							for (int i_150_ = -i_41_; i_150_ < 0; i_150_++) {
								int i_151_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_39_++]);
								if (i_151_ != 0) {
									int i_152_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_151_ & 0xff]);
									i_147_ = ((i_152_ & 0xff00ff) * i_145_ & ~0xff00ff);
									i_148_ = ((i_152_ & 0xff00) * i_145_ & 0xff0000);
									i_152_ = ((i_147_ | i_148_) >>> 8) + i_35_;
									int i_153_ = is[i_38_];
									int i_154_ = i_152_ + i_153_;
									int i_155_ = ((i_152_ & 0xff00ff) + (i_153_ & 0xff00ff));
									i_153_ = ((i_155_ & 0x1000100) + (i_154_ - i_155_ & 0x10000));
									is[i_38_++] = i_154_ - i_153_ | i_153_ - (i_153_ >>> 8);
								} else
									i_38_++;
							}
							i_38_ += i_42_;
							i_39_ += i_43_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method688(int i, int i_156_, int i_157_, int i_158_, int i_159_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_160_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub3) this).anInt9352;
			i_156_ += ((Class61_Sub3_Sub3) this).anInt9327;
			int i_161_ = i_156_ * i_160_ + i;
			int i_162_ = 0;
			int i_163_ = ((Class61_Sub3_Sub3) this).anInt9325;
			int i_164_ = ((Class61_Sub3_Sub3) this).anInt9358;
			int i_165_ = i_160_ - i_164_;
			int i_166_ = 0;
			if (i_156_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_167_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_156_);
				i_163_ -= i_167_;
				i_156_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_162_ += i_167_ * i_164_;
				i_161_ += i_167_ * i_160_;
			}
			if (i_156_ + i_163_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_163_ -= (i_156_ + i_163_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_168_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_164_ -= i_168_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_162_ += i_168_;
				i_161_ += i_168_;
				i_166_ += i_168_;
				i_165_ += i_168_;
			}
			if (i + i_164_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_169_ = (i + i_164_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_164_ -= i_169_;
				i_166_ += i_169_;
				i_165_ += i_169_;
			}
			if (i_164_ > 0 && i_163_ > 0) {
				if (i_159_ == 0) {
					if (i_157_ == 1) {
						for (int i_170_ = -i_163_; i_170_ < 0; i_170_++) {
							int i_171_ = i_161_ + i_164_ - 3;
							while (i_161_ < i_171_) {
								is[i_161_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
								is[i_161_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
								is[i_161_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
								is[i_161_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
							}
							i_171_ += 3;
							while (i_161_ < i_171_)
								is[i_161_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 0) {
						int i_172_ = (i_158_ & 0xff0000) >> 16;
						int i_173_ = (i_158_ & 0xff00) >> 8;
						int i_174_ = i_158_ & 0xff;
						for (int i_175_ = -i_163_; i_175_ < 0; i_175_++) {
							for (int i_176_ = -i_164_; i_176_ < 0; i_176_++) {
								int i_177_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
								int i_178_ = (i_177_ & 0xff0000) * i_172_ & ~0xffffff;
								int i_179_ = (i_177_ & 0xff00) * i_173_ & 0xff0000;
								int i_180_ = (i_177_ & 0xff) * i_174_ & 0xff00;
								is[i_161_++] = (i_178_ | i_179_ | i_180_) >>> 8;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 3) {
						for (int i_181_ = -i_163_; i_181_ < 0; i_181_++) {
							for (int i_182_ = -i_164_; i_182_ < 0; i_182_++) {
								int i_183_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
								int i_184_ = i_183_ + i_158_;
								int i_185_ = ((i_183_ & 0xff00ff) + (i_158_ & 0xff00ff));
								int i_186_ = ((i_185_ & 0x1000100) + (i_184_ - i_185_ & 0x10000));
								is[i_161_++] = i_184_ - i_186_ | i_186_ - (i_186_ >>> 8);
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 2) {
						int i_187_ = i_158_ >>> 24;
						int i_188_ = 256 - i_187_;
						int i_189_ = (i_158_ & 0xff00ff) * i_188_ & ~0xff00ff;
						int i_190_ = (i_158_ & 0xff00) * i_188_ & 0xff0000;
						i_158_ = (i_189_ | i_190_) >>> 8;
						for (int i_191_ = -i_163_; i_191_ < 0; i_191_++) {
							for (int i_192_ = -i_164_; i_192_ < 0; i_192_++) {
								int i_193_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]) & 0xff]);
								i_189_ = (i_193_ & 0xff00ff) * i_187_ & ~0xff00ff;
								i_190_ = (i_193_ & 0xff00) * i_187_ & 0xff0000;
								is[i_161_++] = ((i_189_ | i_190_) >>> 8) + i_158_;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_159_ == 1) {
					if (i_157_ == 1) {
						for (int i_194_ = -i_163_; i_194_ < 0; i_194_++) {
							for (int i_195_ = -i_164_; i_195_ < 0; i_195_++) {
								int i_196_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
								if (i_196_ != 0) {
									int i_197_ = ((((Class61_Sub3_Sub3) this).anIntArray10096[i_196_ & 0xff]) | ~0xffffff);
									int i_198_ = 255;
									int i_199_ = 0;
									int i_200_ = is[i_161_];
									is[i_161_++] = (((((i_197_ & 0xff00ff) * i_198_ + (i_200_ & 0xff00ff) * i_199_) & ~0xff00ff) >> 8) + (((((i_197_ & ~0xff00ff) >>> 8) * i_198_) + (((i_200_ & ~0xff00ff) >>> 8) * i_199_)) & ~0xff00ff));
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 0) {
						if ((i_158_ & 0xffffff) == 16777215) {
							int i_201_ = i_158_ >>> 24;
							int i_202_ = 256 - i_201_;
							for (int i_203_ = -i_163_; i_203_ < 0; i_203_++) {
								for (int i_204_ = -i_164_; i_204_ < 0; i_204_++) {
									int i_205_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
									if (i_205_ != 0) {
										int i_206_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_205_ & 0xff]);
										int i_207_ = is[i_161_];
										is[i_161_++] = ((((i_206_ & 0xff00ff) * i_201_ + ((i_207_ & 0xff00ff) * i_202_)) & ~0xff00ff) + (((i_206_ & 0xff00) * i_201_ + ((i_207_ & 0xff00) * i_202_)) & 0xff0000)) >> 8;
									} else
										i_161_++;
								}
								i_161_ += i_165_;
								i_162_ += i_166_;
							}
						} else {
							int i_208_ = (i_158_ & 0xff0000) >> 16;
							int i_209_ = (i_158_ & 0xff00) >> 8;
							int i_210_ = i_158_ & 0xff;
							int i_211_ = i_158_ >>> 24;
							int i_212_ = 256 - i_211_;
							for (int i_213_ = -i_163_; i_213_ < 0; i_213_++) {
								for (int i_214_ = -i_164_; i_214_ < 0; i_214_++) {
									int i_215_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
									if (i_215_ != 0) {
										int i_216_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_215_ & 0xff]);
										if (i_211_ != 255) {
											int i_217_ = ((i_216_ & 0xff0000) * i_208_ & ~0xffffff);
											int i_218_ = ((i_216_ & 0xff00) * i_209_ & 0xff0000);
											int i_219_ = ((i_216_ & 0xff) * i_210_ & 0xff00);
											i_216_ = (i_217_ | i_218_ | i_219_) >>> 8;
											int i_220_ = is[i_161_];
											is[i_161_++] = (((((i_216_ & 0xff00ff) * i_211_) + ((i_220_ & 0xff00ff) * i_212_)) & ~0xff00ff) + ((((i_216_ & 0xff00) * i_211_) + ((i_220_ & 0xff00) * i_212_)) & 0xff0000)) >> 8;
										} else {
											int i_221_ = ((i_216_ & 0xff0000) * i_208_ & ~0xffffff);
											int i_222_ = ((i_216_ & 0xff00) * i_209_ & 0xff0000);
											int i_223_ = ((i_216_ & 0xff) * i_210_ & 0xff00);
											is[i_161_++] = (i_221_ | i_222_ | i_223_) >>> 8;
										}
									} else
										i_161_++;
								}
								i_161_ += i_165_;
								i_162_ += i_166_;
							}
						}
					} else if (i_157_ == 3) {
						int i_224_ = i_158_ >>> 24;
						int i_225_ = 256 - i_224_;
						for (int i_226_ = -i_163_; i_226_ < 0; i_226_++) {
							for (int i_227_ = -i_164_; i_227_ < 0; i_227_++) {
								byte i_228_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
								int i_229_ = (i_228_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_228_]) : 0);
								int i_230_ = i_229_ + i_158_;
								int i_231_ = ((i_229_ & 0xff00ff) + (i_158_ & 0xff00ff));
								int i_232_ = ((i_231_ & 0x1000100) + (i_230_ - i_231_ & 0x10000));
								i_232_ = i_230_ - i_232_ | i_232_ - (i_232_ >>> 8);
								if (i_229_ == 0 && i_224_ != 255) {
									i_229_ = i_232_;
									i_232_ = is[i_161_];
									i_232_ = ((((i_229_ & 0xff00ff) * i_224_ + (i_232_ & 0xff00ff) * i_225_) & ~0xff00ff) + (((i_229_ & 0xff00) * i_224_ + (i_232_ & 0xff00) * i_225_) & 0xff0000)) >> 8;
								}
								is[i_161_++] = i_232_;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 2) {
						int i_233_ = i_158_ >>> 24;
						int i_234_ = 256 - i_233_;
						int i_235_ = (i_158_ & 0xff00ff) * i_234_ & ~0xff00ff;
						int i_236_ = (i_158_ & 0xff00) * i_234_ & 0xff0000;
						i_158_ = (i_235_ | i_236_) >>> 8;
						for (int i_237_ = -i_163_; i_237_ < 0; i_237_++) {
							for (int i_238_ = -i_164_; i_238_ < 0; i_238_++) {
								int i_239_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
								if (i_239_ != 0) {
									int i_240_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_239_ & 0xff]);
									i_235_ = ((i_240_ & 0xff00ff) * i_233_ & ~0xff00ff);
									i_236_ = ((i_240_ & 0xff00) * i_233_ & 0xff0000);
									is[i_161_++] = ((i_235_ | i_236_) >>> 8) + i_158_;
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_159_ == 2) {
					if (i_157_ == 1) {
						for (int i_241_ = -i_163_; i_241_ < 0; i_241_++) {
							for (int i_242_ = -i_164_; i_242_ < 0; i_242_++) {
								int i_243_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
								if (i_243_ != 0) {
									int i_244_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_243_ & 0xff]);
									int i_245_ = is[i_161_];
									int i_246_ = i_244_ + i_245_;
									int i_247_ = ((i_244_ & 0xff00ff) + (i_245_ & 0xff00ff));
									i_245_ = ((i_247_ & 0x1000100) + (i_246_ - i_247_ & 0x10000));
									is[i_161_++] = i_246_ - i_245_ | i_245_ - (i_245_ >>> 8);
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 0) {
						int i_248_ = (i_158_ & 0xff0000) >> 16;
						int i_249_ = (i_158_ & 0xff00) >> 8;
						int i_250_ = i_158_ & 0xff;
						for (int i_251_ = -i_163_; i_251_ < 0; i_251_++) {
							for (int i_252_ = -i_164_; i_252_ < 0; i_252_++) {
								int i_253_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
								if (i_253_ != 0) {
									int i_254_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_253_ & 0xff]);
									int i_255_ = ((i_254_ & 0xff0000) * i_248_ & ~0xffffff);
									int i_256_ = ((i_254_ & 0xff00) * i_249_ & 0xff0000);
									int i_257_ = (i_254_ & 0xff) * i_250_ & 0xff00;
									i_254_ = (i_255_ | i_256_ | i_257_) >>> 8;
									int i_258_ = is[i_161_];
									int i_259_ = i_254_ + i_258_;
									int i_260_ = ((i_254_ & 0xff00ff) + (i_258_ & 0xff00ff));
									i_258_ = ((i_260_ & 0x1000100) + (i_259_ - i_260_ & 0x10000));
									is[i_161_++] = i_259_ - i_258_ | i_258_ - (i_258_ >>> 8);
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 3) {
						for (int i_261_ = -i_163_; i_261_ < 0; i_261_++) {
							for (int i_262_ = -i_164_; i_262_ < 0; i_262_++) {
								byte i_263_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
								int i_264_ = (i_263_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_263_]) : 0);
								int i_265_ = i_264_ + i_158_;
								int i_266_ = ((i_264_ & 0xff00ff) + (i_158_ & 0xff00ff));
								int i_267_ = ((i_266_ & 0x1000100) + (i_265_ - i_266_ & 0x10000));
								i_264_ = i_265_ - i_267_ | i_267_ - (i_267_ >>> 8);
								i_267_ = is[i_161_];
								i_265_ = i_264_ + i_267_;
								i_266_ = (i_264_ & 0xff00ff) + (i_267_ & 0xff00ff);
								i_267_ = (i_266_ & 0x1000100) + (i_265_ - i_266_ & 0x10000);
								is[i_161_++] = i_265_ - i_267_ | i_267_ - (i_267_ >>> 8);
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else if (i_157_ == 2) {
						int i_268_ = i_158_ >>> 24;
						int i_269_ = 256 - i_268_;
						int i_270_ = (i_158_ & 0xff00ff) * i_269_ & ~0xff00ff;
						int i_271_ = (i_158_ & 0xff00) * i_269_ & 0xff0000;
						i_158_ = (i_270_ | i_271_) >>> 8;
						for (int i_272_ = -i_163_; i_272_ < 0; i_272_++) {
							for (int i_273_ = -i_164_; i_273_ < 0; i_273_++) {
								int i_274_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_162_++]);
								if (i_274_ != 0) {
									int i_275_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_274_ & 0xff]);
									i_270_ = ((i_275_ & 0xff00ff) * i_268_ & ~0xff00ff);
									i_271_ = ((i_275_ & 0xff00) * i_268_ & 0xff0000);
									i_275_ = ((i_270_ | i_271_) >>> 8) + i_158_;
									int i_276_ = is[i_161_];
									int i_277_ = i_275_ + i_276_;
									int i_278_ = ((i_275_ & 0xff00ff) + (i_276_ & 0xff00ff));
									i_276_ = ((i_278_ & 0x1000100) + (i_277_ - i_278_ & 0x10000));
									is[i_161_++] = i_277_ - i_276_ | i_276_ - (i_276_ >>> 8);
								} else
									i_161_++;
							}
							i_161_ += i_165_;
							i_162_ += i_166_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method742(boolean bool, boolean bool_279_, boolean bool_280_, int i, int i_281_, float f, int i_282_, int i_283_, int i_284_, int i_285_, int i_286_, int i_287_, boolean bool_288_) {
		if (i_282_ > 0 && i_283_ > 0 && (bool || bool_279_)) {
			int i_289_ = 0;
			int i_290_ = 0;
			int i_291_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
			int i_292_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
			int i_293_ = (i_291_ << 16) / i_282_;
			int i_294_ = (i_292_ << 16) / i_283_;
			if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
				int i_295_ = (((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_293_ - 1) / i_293_);
				i += i_295_;
				i_289_ += i_295_ * i_293_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16);
			}
			if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
				int i_296_ = (((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_294_ - 1) / i_294_);
				i_281_ += i_296_;
				i_290_ += i_296_ * i_294_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16);
			}
			if (((Class61_Sub3_Sub3) this).anInt9358 < i_291_)
				i_282_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_289_ + i_293_ - 1) / i_293_;
			if (((Class61_Sub3_Sub3) this).anInt9325 < i_292_)
				i_283_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_290_ + i_294_ - 1) / i_294_;
			int i_297_ = i + i_281_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_298_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_282_);
			if (i_281_ + i_283_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_283_ -= (i_281_ + i_283_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_281_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_299_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_281_);
				i_283_ -= i_299_;
				i_297_ += i_299_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_290_ += i_294_ * i_299_;
			}
			if (i + i_282_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_300_ = (i + i_282_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_282_ -= i_300_;
				i_298_ += i_300_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_301_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_282_ -= i_301_;
				i_297_ += i_301_;
				i_289_ += i_293_ * i_301_;
				i_298_ += i_301_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_286_ == 0) {
				if (i_284_ == 1) {
					int i_302_ = i_289_;
					for (int i_303_ = -i_283_; i_303_ < 0; i_303_++) {
						int i_304_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_305_ = -i_282_; i_305_ < 0; i_305_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								if (bool)
									is[i_297_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_304_]) & 0xff)]);
								if (bool_279_ && bool_288_)
									fs[i_297_] = f;
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_302_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 0) {
					int i_306_ = (i_285_ & 0xff0000) >> 16;
					int i_307_ = (i_285_ & 0xff00) >> 8;
					int i_308_ = i_285_ & 0xff;
					int i_309_ = i_289_;
					for (int i_310_ = -i_283_; i_310_ < 0; i_310_++) {
						int i_311_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_312_ = -i_282_; i_312_ < 0; i_312_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								if (bool) {
									int i_313_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_311_]) & 0xff)]);
									int i_314_ = ((i_313_ & 0xff0000) * i_306_ & ~0xffffff);
									int i_315_ = ((i_313_ & 0xff00) * i_307_ & 0xff0000);
									int i_316_ = (i_313_ & 0xff) * i_308_ & 0xff00;
									is[i_297_] = (i_314_ | i_315_ | i_316_) >>> 8;
								}
								if (bool_279_ && bool_288_)
									fs[i_297_] = f;
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_309_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 3) {
					int i_317_ = i_289_;
					for (int i_318_ = -i_283_; i_318_ < 0; i_318_++) {
						int i_319_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_320_ = -i_282_; i_320_ < 0; i_320_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								if (bool) {
									byte i_321_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_319_]);
									int i_322_ = (i_321_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_321_]) : 0);
									int i_323_ = i_322_ + i_285_;
									int i_324_ = ((i_322_ & 0xff00ff) + (i_285_ & 0xff00ff));
									int i_325_ = ((i_324_ & 0x1000100) + (i_323_ - i_324_ & 0x10000));
									is[i_297_] = i_323_ - i_325_ | i_325_ - (i_325_ >>> 8);
								}
								if (bool_279_ && bool_288_)
									fs[i_297_] = f;
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_317_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 2) {
					int i_326_ = i_285_ >>> 24;
					int i_327_ = 256 - i_326_;
					int i_328_ = (i_285_ & 0xff00ff) * i_327_ & ~0xff00ff;
					int i_329_ = (i_285_ & 0xff00) * i_327_ & 0xff0000;
					i_285_ = (i_328_ | i_329_) >>> 8;
					int i_330_ = i_289_;
					for (int i_331_ = -i_283_; i_331_ < 0; i_331_++) {
						int i_332_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_333_ = -i_282_; i_333_ < 0; i_333_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								if (bool) {
									int i_334_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_332_]) & 0xff)]);
									i_328_ = ((i_334_ & 0xff00ff) * i_326_ & ~0xff00ff);
									i_329_ = ((i_334_ & 0xff00) * i_326_ & 0xff0000);
									is[i_297_] = ((i_328_ | i_329_) >>> 8) + i_285_;
								}
								if (bool_279_ && bool_288_)
									fs[i_297_] = f;
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_330_;
						i_297_ += i_298_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_286_ == 1) {
				if (i_284_ == 1) {
					int i_335_ = i_289_;
					for (int i_336_ = -i_283_; i_336_ < 0; i_336_++) {
						int i_337_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_338_ = -i_282_; i_338_ < 0; i_338_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								int i_339_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_337_]);
								if (i_339_ != 0) {
									if (bool)
										is[i_297_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_339_ & 0xff]);
									if (bool_279_ && bool_288_)
										fs[i_297_] = f;
								}
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_335_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 0) {
					int i_340_ = i_289_;
					if ((i_285_ & 0xffffff) == 16777215) {
						int i_341_ = i_285_ >>> 24;
						int i_342_ = 256 - i_341_;
						for (int i_343_ = -i_283_; i_343_ < 0; i_343_++) {
							int i_344_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_345_ = -i_282_; i_345_ < 0; i_345_++) {
								if (!bool_279_ || f < fs[i_297_]) {
									int i_346_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_344_]);
									if (i_346_ != 0) {
										if (bool) {
											int i_347_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_346_ & 0xff]);
											int i_348_ = is[i_297_];
											is[i_297_] = (((((i_347_ & 0xff00ff) * i_341_) + ((i_348_ & 0xff00ff) * i_342_)) & ~0xff00ff) + ((((i_347_ & 0xff00) * i_341_) + ((i_348_ & 0xff00) * i_342_)) & 0xff0000)) >> 8;
										}
										if (bool_279_ && bool_288_)
											fs[i_297_] = f;
									}
								}
								i_289_ += i_293_;
								i_297_++;
							}
							i_290_ += i_294_;
							i_289_ = i_340_;
							i_297_ += i_298_;
						}
					} else {
						int i_349_ = (i_285_ & 0xff0000) >> 16;
						int i_350_ = (i_285_ & 0xff00) >> 8;
						int i_351_ = i_285_ & 0xff;
						int i_352_ = i_285_ >>> 24;
						int i_353_ = 256 - i_352_;
						for (int i_354_ = -i_283_; i_354_ < 0; i_354_++) {
							int i_355_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_356_ = -i_282_; i_356_ < 0; i_356_++) {
								if (!bool_279_ || f < fs[i_297_]) {
									int i_357_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_355_]);
									if (i_357_ != 0) {
										int i_358_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_357_ & 0xff]);
										if (i_352_ != 255) {
											if (bool) {
												int i_359_ = (((i_358_ & 0xff0000) * i_349_) & ~0xffffff);
												int i_360_ = (((i_358_ & 0xff00) * i_350_) & 0xff0000);
												int i_361_ = ((i_358_ & 0xff) * i_351_ & 0xff00);
												i_358_ = (i_359_ | i_360_ | i_361_) >>> 8;
												int i_362_ = is[i_297_];
												is[i_297_] = (((((i_358_ & 0xff00ff) * i_352_) + ((i_362_ & 0xff00ff) * i_353_)) & ~0xff00ff) + ((((i_358_ & 0xff00) * i_352_) + ((i_362_ & 0xff00) * i_353_)) & 0xff0000)) >> 8;
											}
											if (bool_279_ && bool_288_)
												fs[i_297_] = f;
										} else {
											if (bool) {
												int i_363_ = (((i_358_ & 0xff0000) * i_349_) & ~0xffffff);
												int i_364_ = (((i_358_ & 0xff00) * i_350_) & 0xff0000);
												int i_365_ = ((i_358_ & 0xff) * i_351_ & 0xff00);
												is[i_297_] = (i_363_ | i_364_ | i_365_) >>> 8;
											}
											if (bool_279_ && bool_288_)
												fs[i_297_] = f;
										}
									}
								}
								i_289_ += i_293_;
								i_297_++;
							}
							i_290_ += i_294_;
							i_289_ = i_340_;
							i_297_ += i_298_;
						}
					}
				} else if (i_284_ == 3) {
					int i_366_ = i_289_;
					int i_367_ = i_285_ >>> 24;
					int i_368_ = 256 - i_367_;
					for (int i_369_ = -i_283_; i_369_ < 0; i_369_++) {
						int i_370_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_371_ = -i_282_; i_371_ < 0; i_371_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								if (bool) {
									byte i_372_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_370_]);
									int i_373_ = (i_372_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_372_]) : 0);
									int i_374_ = i_373_ + i_285_;
									int i_375_ = ((i_373_ & 0xff00ff) + (i_285_ & 0xff00ff));
									int i_376_ = ((i_375_ & 0x1000100) + (i_374_ - i_375_ & 0x10000));
									i_376_ = i_374_ - i_376_ | i_376_ - (i_376_ >>> 8);
									if (i_373_ == 0 && i_367_ != 255) {
										i_373_ = i_376_;
										i_376_ = is[i_297_];
										i_376_ = ((((i_373_ & 0xff00ff) * i_367_ + ((i_376_ & 0xff00ff) * i_368_)) & ~0xff00ff) + (((i_373_ & 0xff00) * i_367_ + ((i_376_ & 0xff00) * i_368_)) & 0xff0000)) >> 8;
									}
									is[i_297_] = i_376_;
								}
								if (bool_279_ && bool_288_)
									fs[i_297_] = f;
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_366_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 2) {
					int i_377_ = i_285_ >>> 24;
					int i_378_ = 256 - i_377_;
					int i_379_ = (i_285_ & 0xff00ff) * i_378_ & ~0xff00ff;
					int i_380_ = (i_285_ & 0xff00) * i_378_ & 0xff0000;
					i_285_ = (i_379_ | i_380_) >>> 8;
					int i_381_ = i_289_;
					for (int i_382_ = -i_283_; i_382_ < 0; i_382_++) {
						int i_383_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_384_ = -i_282_; i_384_ < 0; i_384_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								int i_385_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_383_]);
								if (i_385_ != 0) {
									if (bool) {
										int i_386_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_385_ & 0xff]);
										i_379_ = ((i_386_ & 0xff00ff) * i_377_ & ~0xff00ff);
										i_380_ = ((i_386_ & 0xff00) * i_377_ & 0xff0000);
										is[i_297_] = (((i_379_ | i_380_) >>> 8) + i_285_);
									}
									if (bool_279_ && bool_288_)
										fs[i_297_] = f;
								}
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_381_;
						i_297_ += i_298_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_286_ == 2) {
				if (i_284_ == 1) {
					int i_387_ = i_289_;
					for (int i_388_ = -i_283_; i_388_ < 0; i_388_++) {
						int i_389_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_390_ = -i_282_; i_390_ < 0; i_390_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								int i_391_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_389_]);
								if (i_391_ != 0) {
									if (bool) {
										int i_392_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_391_ & 0xff]);
										int i_393_ = is[i_297_];
										int i_394_ = i_392_ + i_393_;
										int i_395_ = ((i_392_ & 0xff00ff) + (i_393_ & 0xff00ff));
										i_393_ = ((i_395_ & 0x1000100) + (i_394_ - i_395_ & 0x10000));
										is[i_297_] = (i_394_ - i_393_ | i_393_ - (i_393_ >>> 8));
									}
									if (bool_279_ && bool_288_)
										fs[i_297_] = f;
								}
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_387_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 0) {
					int i_396_ = i_289_;
					int i_397_ = (i_285_ & 0xff0000) >> 16;
					int i_398_ = (i_285_ & 0xff00) >> 8;
					int i_399_ = i_285_ & 0xff;
					for (int i_400_ = -i_283_; i_400_ < 0; i_400_++) {
						int i_401_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_402_ = -i_282_; i_402_ < 0; i_402_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								int i_403_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_401_]);
								if (i_403_ != 0) {
									if (bool) {
										int i_404_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_403_ & 0xff]);
										int i_405_ = ((i_404_ & 0xff0000) * i_397_ & ~0xffffff);
										int i_406_ = ((i_404_ & 0xff00) * i_398_ & 0xff0000);
										int i_407_ = ((i_404_ & 0xff) * i_399_ & 0xff00);
										i_404_ = (i_405_ | i_406_ | i_407_) >>> 8;
										int i_408_ = is[i_297_];
										int i_409_ = i_404_ + i_408_;
										int i_410_ = ((i_404_ & 0xff00ff) + (i_408_ & 0xff00ff));
										i_408_ = ((i_410_ & 0x1000100) + (i_409_ - i_410_ & 0x10000));
										is[i_297_] = (i_409_ - i_408_ | i_408_ - (i_408_ >>> 8));
									}
									if (bool_279_ && bool_288_)
										fs[i_297_] = f;
								}
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_396_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 3) {
					int i_411_ = i_289_;
					for (int i_412_ = -i_283_; i_412_ < 0; i_412_++) {
						int i_413_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_414_ = -i_282_; i_414_ < 0; i_414_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								if (bool) {
									byte i_415_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_413_]);
									int i_416_ = (i_415_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_415_]) : 0);
									int i_417_ = i_416_ + i_285_;
									int i_418_ = ((i_416_ & 0xff00ff) + (i_285_ & 0xff00ff));
									int i_419_ = ((i_418_ & 0x1000100) + (i_417_ - i_418_ & 0x10000));
									i_416_ = i_417_ - i_419_ | i_419_ - (i_419_ >>> 8);
									i_419_ = is[i_297_];
									i_417_ = i_416_ + i_419_;
									i_418_ = (i_416_ & 0xff00ff) + (i_419_ & 0xff00ff);
									i_419_ = ((i_418_ & 0x1000100) + (i_417_ - i_418_ & 0x10000));
									is[i_297_] = i_417_ - i_419_ | i_419_ - (i_419_ >>> 8);
								}
								if (bool_279_ && bool_288_)
									fs[i_297_] = f;
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_411_;
						i_297_ += i_298_;
					}
				} else if (i_284_ == 2) {
					int i_420_ = i_285_ >>> 24;
					int i_421_ = 256 - i_420_;
					int i_422_ = (i_285_ & 0xff00ff) * i_421_ & ~0xff00ff;
					int i_423_ = (i_285_ & 0xff00) * i_421_ & 0xff0000;
					i_285_ = (i_422_ | i_423_) >>> 8;
					int i_424_ = i_289_;
					for (int i_425_ = -i_283_; i_425_ < 0; i_425_++) {
						int i_426_ = ((i_290_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_427_ = -i_282_; i_427_ < 0; i_427_++) {
							if (!bool_279_ || f < fs[i_297_]) {
								int i_428_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_289_ >> 16) + i_426_]);
								if (i_428_ != 0) {
									if (bool) {
										int i_429_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_428_ & 0xff]);
										i_422_ = ((i_429_ & 0xff00ff) * i_420_ & ~0xff00ff);
										i_423_ = ((i_429_ & 0xff00) * i_420_ & 0xff0000);
										i_429_ = (((i_422_ | i_423_) >>> 8) + i_285_);
										int i_430_ = is[i_297_];
										int i_431_ = i_429_ + i_430_;
										int i_432_ = ((i_429_ & 0xff00ff) + (i_430_ & 0xff00ff));
										i_430_ = ((i_432_ & 0x1000100) + (i_431_ - i_432_ & 0x10000));
										is[i_297_] = (i_431_ - i_430_ | i_430_ - (i_430_ >>> 8));
									}
									if (bool_279_ && bool_288_)
										fs[i_297_] = f;
								}
							}
							i_289_ += i_293_;
							i_297_++;
						}
						i_290_ += i_294_;
						i_289_ = i_424_;
						i_297_ += i_298_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	public Interface8_Impl1_Impl2 method678() {
		throw new IllegalStateException();
	}

	public Interface8_Impl1_Impl2 method729() {
		throw new IllegalStateException();
	}

	void method736(int i, int i_433_, int i_434_, int i_435_, int i_436_, int i_437_, int i_438_, int i_439_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_434_ > 0 && i_435_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_440_ = 0;
				int i_441_ = 0;
				int i_442_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_443_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
				int i_444_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
				int i_445_ = (i_443_ << 16) / i_434_;
				int i_446_ = (i_444_ << 16) / i_435_;
				if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
					int i_447_ = (((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_445_ - 1) / i_445_);
					i += i_447_;
					i_440_ += (i_447_ * i_445_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
					int i_448_ = (((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_446_ - 1) / i_446_);
					i_433_ += i_448_;
					i_441_ += (i_448_ * i_446_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9358 < i_443_)
					i_434_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_440_ + i_445_ - 1) / i_445_;
				if (((Class61_Sub3_Sub3) this).anInt9325 < i_444_)
					i_435_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_441_ + i_446_ - 1) / i_446_;
				int i_449_ = i + i_433_ * i_442_;
				int i_450_ = i_442_ - i_434_;
				if (i_433_ + i_435_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_435_ -= (i_433_ + i_435_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_433_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_451_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_433_);
					i_435_ -= i_451_;
					i_449_ += i_451_ * i_442_;
					i_441_ += i_446_ * i_451_;
				}
				if (i + i_434_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_452_ = (i + i_434_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_434_ -= i_452_;
					i_450_ += i_452_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_453_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
					i_434_ -= i_453_;
					i_449_ += i_453_;
					i_440_ += i_445_ * i_453_;
					i_450_ += i_453_;
				}
				if (i_438_ == 0) {
					if (i_436_ == 1) {
						int i_454_ = i_440_;
						for (int i_455_ = -i_435_; i_455_ < 0; i_455_++) {
							int i_456_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_457_ = -i_434_; i_457_ < 0; i_457_++) {
								is[i_449_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_456_]) & 0xff]);
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_454_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 0) {
						int i_458_ = (i_437_ & 0xff0000) >> 16;
						int i_459_ = (i_437_ & 0xff00) >> 8;
						int i_460_ = i_437_ & 0xff;
						int i_461_ = i_440_;
						for (int i_462_ = -i_435_; i_462_ < 0; i_462_++) {
							int i_463_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_464_ = -i_434_; i_464_ < 0; i_464_++) {
								int i_465_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_463_]) & 0xff]);
								int i_466_ = (i_465_ & 0xff0000) * i_458_ & ~0xffffff;
								int i_467_ = (i_465_ & 0xff00) * i_459_ & 0xff0000;
								int i_468_ = (i_465_ & 0xff) * i_460_ & 0xff00;
								is[i_449_++] = (i_466_ | i_467_ | i_468_) >>> 8;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_461_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 3) {
						int i_469_ = i_440_;
						for (int i_470_ = -i_435_; i_470_ < 0; i_470_++) {
							int i_471_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_472_ = -i_434_; i_472_ < 0; i_472_++) {
								byte i_473_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_471_]);
								int i_474_ = (i_473_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_473_]) : 0);
								int i_475_ = i_474_ + i_437_;
								int i_476_ = ((i_474_ & 0xff00ff) + (i_437_ & 0xff00ff));
								int i_477_ = ((i_476_ & 0x1000100) + (i_475_ - i_476_ & 0x10000));
								is[i_449_++] = i_475_ - i_477_ | i_477_ - (i_477_ >>> 8);
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_469_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 2) {
						int i_478_ = i_437_ >>> 24;
						int i_479_ = 256 - i_478_;
						int i_480_ = (i_437_ & 0xff00ff) * i_479_ & ~0xff00ff;
						int i_481_ = (i_437_ & 0xff00) * i_479_ & 0xff0000;
						i_437_ = (i_480_ | i_481_) >>> 8;
						int i_482_ = i_440_;
						for (int i_483_ = -i_435_; i_483_ < 0; i_483_++) {
							int i_484_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_485_ = -i_434_; i_485_ < 0; i_485_++) {
								int i_486_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_484_]) & 0xff]);
								i_480_ = (i_486_ & 0xff00ff) * i_478_ & ~0xff00ff;
								i_481_ = (i_486_ & 0xff00) * i_478_ & 0xff0000;
								is[i_449_++] = ((i_480_ | i_481_) >>> 8) + i_437_;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_482_;
							i_449_ += i_450_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_438_ == 1) {
					if (i_436_ == 1) {
						int i_487_ = i_440_;
						for (int i_488_ = -i_435_; i_488_ < 0; i_488_++) {
							int i_489_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_490_ = -i_434_; i_490_ < 0; i_490_++) {
								int i_491_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_489_]);
								if (i_491_ != 0)
									is[i_449_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_491_ & 0xff]);
								else
									i_449_++;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_487_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 0) {
						int i_492_ = i_440_;
						if ((i_437_ & 0xffffff) == 16777215) {
							int i_493_ = i_437_ >>> 24;
							int i_494_ = 256 - i_493_;
							for (int i_495_ = -i_435_; i_495_ < 0; i_495_++) {
								int i_496_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_497_ = -i_434_; i_497_ < 0; i_497_++) {
									int i_498_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_496_]);
									if (i_498_ != 0) {
										int i_499_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_498_ & 0xff]);
										int i_500_ = is[i_449_];
										is[i_449_++] = ((((i_499_ & 0xff00ff) * i_493_ + ((i_500_ & 0xff00ff) * i_494_)) & ~0xff00ff) + (((i_499_ & 0xff00) * i_493_ + ((i_500_ & 0xff00) * i_494_)) & 0xff0000)) >> 8;
									} else
										i_449_++;
									i_440_ += i_445_;
								}
								i_441_ += i_446_;
								i_440_ = i_492_;
								i_449_ += i_450_;
							}
						} else {
							int i_501_ = (i_437_ & 0xff0000) >> 16;
							int i_502_ = (i_437_ & 0xff00) >> 8;
							int i_503_ = i_437_ & 0xff;
							int i_504_ = i_437_ >>> 24;
							int i_505_ = 256 - i_504_;
							for (int i_506_ = -i_435_; i_506_ < 0; i_506_++) {
								int i_507_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_508_ = -i_434_; i_508_ < 0; i_508_++) {
									int i_509_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_507_]);
									if (i_509_ != 0) {
										int i_510_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_509_ & 0xff]);
										if (i_504_ != 255) {
											int i_511_ = ((i_510_ & 0xff0000) * i_501_ & ~0xffffff);
											int i_512_ = ((i_510_ & 0xff00) * i_502_ & 0xff0000);
											int i_513_ = ((i_510_ & 0xff) * i_503_ & 0xff00);
											i_510_ = (i_511_ | i_512_ | i_513_) >>> 8;
											int i_514_ = is[i_449_];
											is[i_449_++] = (((((i_510_ & 0xff00ff) * i_504_) + ((i_514_ & 0xff00ff) * i_505_)) & ~0xff00ff) + ((((i_510_ & 0xff00) * i_504_) + ((i_514_ & 0xff00) * i_505_)) & 0xff0000)) >> 8;
										} else {
											int i_515_ = ((i_510_ & 0xff0000) * i_501_ & ~0xffffff);
											int i_516_ = ((i_510_ & 0xff00) * i_502_ & 0xff0000);
											int i_517_ = ((i_510_ & 0xff) * i_503_ & 0xff00);
											is[i_449_++] = (i_515_ | i_516_ | i_517_) >>> 8;
										}
									} else
										i_449_++;
									i_440_ += i_445_;
								}
								i_441_ += i_446_;
								i_440_ = i_492_;
								i_449_ += i_450_;
							}
						}
					} else if (i_436_ == 3) {
						int i_518_ = i_440_;
						int i_519_ = i_437_ >>> 24;
						int i_520_ = 256 - i_519_;
						for (int i_521_ = -i_435_; i_521_ < 0; i_521_++) {
							int i_522_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_523_ = -i_434_; i_523_ < 0; i_523_++) {
								byte i_524_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_522_]);
								int i_525_ = (i_524_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_524_]) : 0);
								int i_526_ = i_525_ + i_437_;
								int i_527_ = ((i_525_ & 0xff00ff) + (i_437_ & 0xff00ff));
								int i_528_ = ((i_527_ & 0x1000100) + (i_526_ - i_527_ & 0x10000));
								i_528_ = i_526_ - i_528_ | i_528_ - (i_528_ >>> 8);
								if (i_525_ == 0 && i_519_ != 255) {
									i_525_ = i_528_;
									i_528_ = is[i_449_];
									i_528_ = ((((i_525_ & 0xff00ff) * i_519_ + (i_528_ & 0xff00ff) * i_520_) & ~0xff00ff) + (((i_525_ & 0xff00) * i_519_ + (i_528_ & 0xff00) * i_520_) & 0xff0000)) >> 8;
								}
								is[i_449_++] = i_528_;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_518_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 2) {
						int i_529_ = i_437_ >>> 24;
						int i_530_ = 256 - i_529_;
						int i_531_ = (i_437_ & 0xff00ff) * i_530_ & ~0xff00ff;
						int i_532_ = (i_437_ & 0xff00) * i_530_ & 0xff0000;
						i_437_ = (i_531_ | i_532_) >>> 8;
						int i_533_ = i_440_;
						for (int i_534_ = -i_435_; i_534_ < 0; i_534_++) {
							int i_535_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_536_ = -i_434_; i_536_ < 0; i_536_++) {
								int i_537_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_535_]);
								if (i_537_ != 0) {
									int i_538_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_537_ & 0xff]);
									i_531_ = ((i_538_ & 0xff00ff) * i_529_ & ~0xff00ff);
									i_532_ = ((i_538_ & 0xff00) * i_529_ & 0xff0000);
									is[i_449_++] = ((i_531_ | i_532_) >>> 8) + i_437_;
								} else
									i_449_++;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_533_;
							i_449_ += i_450_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_438_ == 2) {
					if (i_436_ == 1) {
						int i_539_ = i_440_;
						for (int i_540_ = -i_435_; i_540_ < 0; i_540_++) {
							int i_541_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_542_ = -i_434_; i_542_ < 0; i_542_++) {
								int i_543_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_541_]);
								if (i_543_ != 0) {
									int i_544_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_543_ & 0xff]);
									int i_545_ = is[i_449_];
									int i_546_ = i_544_ + i_545_;
									int i_547_ = ((i_544_ & 0xff00ff) + (i_545_ & 0xff00ff));
									i_545_ = ((i_547_ & 0x1000100) + (i_546_ - i_547_ & 0x10000));
									is[i_449_++] = i_546_ - i_545_ | i_545_ - (i_545_ >>> 8);
								} else
									i_449_++;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_539_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 0) {
						int i_548_ = i_440_;
						int i_549_ = (i_437_ & 0xff0000) >> 16;
						int i_550_ = (i_437_ & 0xff00) >> 8;
						int i_551_ = i_437_ & 0xff;
						for (int i_552_ = -i_435_; i_552_ < 0; i_552_++) {
							int i_553_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_554_ = -i_434_; i_554_ < 0; i_554_++) {
								int i_555_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_553_]);
								if (i_555_ != 0) {
									int i_556_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_555_ & 0xff]);
									int i_557_ = ((i_556_ & 0xff0000) * i_549_ & ~0xffffff);
									int i_558_ = ((i_556_ & 0xff00) * i_550_ & 0xff0000);
									int i_559_ = (i_556_ & 0xff) * i_551_ & 0xff00;
									i_556_ = (i_557_ | i_558_ | i_559_) >>> 8;
									int i_560_ = is[i_449_];
									int i_561_ = i_556_ + i_560_;
									int i_562_ = ((i_556_ & 0xff00ff) + (i_560_ & 0xff00ff));
									i_560_ = ((i_562_ & 0x1000100) + (i_561_ - i_562_ & 0x10000));
									is[i_449_++] = i_561_ - i_560_ | i_560_ - (i_560_ >>> 8);
								} else
									i_449_++;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_548_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 3) {
						int i_563_ = i_440_;
						for (int i_564_ = -i_435_; i_564_ < 0; i_564_++) {
							int i_565_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_566_ = -i_434_; i_566_ < 0; i_566_++) {
								byte i_567_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_565_]);
								int i_568_ = (i_567_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_567_]) : 0);
								int i_569_ = i_568_ + i_437_;
								int i_570_ = ((i_568_ & 0xff00ff) + (i_437_ & 0xff00ff));
								int i_571_ = ((i_570_ & 0x1000100) + (i_569_ - i_570_ & 0x10000));
								i_568_ = i_569_ - i_571_ | i_571_ - (i_571_ >>> 8);
								i_571_ = is[i_449_];
								i_569_ = i_568_ + i_571_;
								i_570_ = (i_568_ & 0xff00ff) + (i_571_ & 0xff00ff);
								i_571_ = (i_570_ & 0x1000100) + (i_569_ - i_570_ & 0x10000);
								is[i_449_++] = i_569_ - i_571_ | i_571_ - (i_571_ >>> 8);
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_563_;
							i_449_ += i_450_;
						}
					} else if (i_436_ == 2) {
						int i_572_ = i_437_ >>> 24;
						int i_573_ = 256 - i_572_;
						int i_574_ = (i_437_ & 0xff00ff) * i_573_ & ~0xff00ff;
						int i_575_ = (i_437_ & 0xff00) * i_573_ & 0xff0000;
						i_437_ = (i_574_ | i_575_) >>> 8;
						int i_576_ = i_440_;
						for (int i_577_ = -i_435_; i_577_ < 0; i_577_++) {
							int i_578_ = ((i_441_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_579_ = -i_434_; i_579_ < 0; i_579_++) {
								int i_580_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_440_ >> 16) + i_578_]);
								if (i_580_ != 0) {
									int i_581_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_580_ & 0xff]);
									i_574_ = ((i_581_ & 0xff00ff) * i_572_ & ~0xff00ff);
									i_575_ = ((i_581_ & 0xff00) * i_572_ & 0xff0000);
									i_581_ = ((i_574_ | i_575_) >>> 8) + i_437_;
									int i_582_ = is[i_449_];
									int i_583_ = i_581_ + i_582_;
									int i_584_ = ((i_581_ & 0xff00ff) + (i_582_ & 0xff00ff));
									i_582_ = ((i_584_ & 0x1000100) + (i_583_ - i_584_ & 0x10000));
									is[i_449_++] = i_583_ - i_582_ | i_582_ - (i_582_ >>> 8);
								} else
									i_449_++;
								i_440_ += i_445_;
							}
							i_441_ += i_446_;
							i_440_ = i_576_;
							i_449_ += i_450_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method745(int[] is, int[] is_585_, int i, int i_586_) {
		int[] is_587_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_587_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_588_ = anInt9356;
					while (i_588_ < 0) {
						int i_589_ = i_588_ + i_586_;
						if (i_589_ >= 0) {
							if (i_589_ >= is.length)
								break;
							int i_590_ = anInt9339;
							int i_591_ = anInt9346;
							int i_592_ = anInt9324;
							int i_593_ = anInt9347;
							if (i_591_ >= 0 && i_592_ >= 0 && (i_591_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0 && (i_592_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_594_ = is[i_589_] - i;
								int i_595_ = -is_585_[i_589_];
								int i_596_ = i_594_ - (i_590_ - anInt9339);
								if (i_596_ > 0) {
									i_590_ += i_596_;
									i_593_ += i_596_;
									i_591_ += anInt9340 * i_596_;
									i_592_ += anInt9341 * i_596_;
								} else
									i_595_ -= i_596_;
								if (i_593_ < i_595_)
									i_593_ = i_595_;
								for (/**/; i_593_ < 0; i_593_++) {
									int i_597_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_592_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_591_ >> 12))]);
									if (i_597_ != 0)
										is_587_[i_590_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_597_ & 0xff]);
									else
										i_590_++;
								}
							}
						}
						i_588_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_598_ = anInt9356;
					while (i_598_ < 0) {
						int i_599_ = i_598_ + i_586_;
						if (i_599_ >= 0) {
							if (i_599_ >= is.length)
								break;
							int i_600_ = anInt9339;
							int i_601_ = anInt9346;
							int i_602_ = anInt9324 + anInt9349;
							int i_603_ = anInt9347;
							if (i_601_ >= 0 && (i_601_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								int i_604_;
								if ((i_604_ = (i_602_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
									i_604_ = (anInt9341 - i_604_) / anInt9341;
									i_603_ += i_604_;
									i_602_ += anInt9341 * i_604_;
									i_600_ += i_604_;
								}
								if ((i_604_ = (i_602_ - anInt9341) / anInt9341) > i_603_)
									i_603_ = i_604_;
								int i_605_ = is[i_599_] - i;
								int i_606_ = -is_585_[i_599_];
								int i_607_ = i_605_ - (i_600_ - anInt9339);
								if (i_607_ > 0) {
									i_600_ += i_607_;
									i_603_ += i_607_;
									i_601_ += anInt9340 * i_607_;
									i_602_ += anInt9341 * i_607_;
								} else
									i_606_ -= i_607_;
								if (i_603_ < i_606_)
									i_603_ = i_606_;
								for (/**/; i_603_ < 0; i_603_++) {
									int i_608_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_602_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_601_ >> 12))]);
									if (i_608_ != 0)
										is_587_[i_600_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_608_ & 0xff]);
									else
										i_600_++;
									i_602_ += anInt9341;
								}
							}
						}
						i_598_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_609_ = anInt9356;
					while (i_609_ < 0) {
						int i_610_ = i_609_ + i_586_;
						if (i_610_ >= 0) {
							if (i_610_ >= is.length)
								break;
							int i_611_ = anInt9339;
							int i_612_ = anInt9346;
							int i_613_ = anInt9324 + anInt9349;
							int i_614_ = anInt9347;
							if (i_612_ >= 0 && (i_612_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								if (i_613_ < 0) {
									int i_615_ = (anInt9341 - 1 - i_613_) / anInt9341;
									i_614_ += i_615_;
									i_613_ += anInt9341 * i_615_;
									i_611_ += i_615_;
								}
								int i_616_;
								if ((i_616_ = (1 + i_613_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_614_)
									i_614_ = i_616_;
								int i_617_ = is[i_610_] - i;
								int i_618_ = -is_585_[i_610_];
								int i_619_ = i_617_ - (i_611_ - anInt9339);
								if (i_619_ > 0) {
									i_611_ += i_619_;
									i_614_ += i_619_;
									i_612_ += anInt9340 * i_619_;
									i_613_ += anInt9341 * i_619_;
								} else
									i_618_ -= i_619_;
								if (i_614_ < i_618_)
									i_614_ = i_618_;
								for (/**/; i_614_ < 0; i_614_++) {
									int i_620_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_613_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_612_ >> 12))]);
									if (i_620_ != 0)
										is_587_[i_611_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_620_ & 0xff]);
									else
										i_611_++;
									i_613_ += anInt9341;
								}
							}
						}
						i_609_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_621_ = anInt9356;
					while (i_621_ < 0) {
						int i_622_ = i_621_ + i_586_;
						if (i_622_ >= 0) {
							if (i_622_ >= is.length)
								break;
							int i_623_ = anInt9339;
							int i_624_ = anInt9346 + anInt9348;
							int i_625_ = anInt9324;
							int i_626_ = anInt9347;
							if (i_625_ >= 0 && (i_625_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_627_;
								if ((i_627_ = (i_624_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
									i_627_ = (anInt9340 - i_627_) / anInt9340;
									i_626_ += i_627_;
									i_624_ += anInt9340 * i_627_;
									i_623_ += i_627_;
								}
								if ((i_627_ = (i_624_ - anInt9340) / anInt9340) > i_626_)
									i_626_ = i_627_;
								int i_628_ = is[i_622_] - i;
								int i_629_ = -is_585_[i_622_];
								int i_630_ = i_628_ - (i_623_ - anInt9339);
								if (i_630_ > 0) {
									i_623_ += i_630_;
									i_626_ += i_630_;
									i_624_ += anInt9340 * i_630_;
									i_625_ += anInt9341 * i_630_;
								} else
									i_629_ -= i_630_;
								if (i_626_ < i_629_)
									i_626_ = i_629_;
								for (/**/; i_626_ < 0; i_626_++) {
									int i_631_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_625_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_624_ >> 12))]);
									if (i_631_ != 0)
										is_587_[i_623_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_631_ & 0xff]);
									else
										i_623_++;
									i_624_ += anInt9340;
								}
							}
						}
						i_621_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_632_ = anInt9356;
					while (i_632_ < 0) {
						int i_633_ = i_632_ + i_586_;
						if (i_633_ >= 0) {
							if (i_633_ >= is.length)
								break;
							int i_634_ = anInt9339;
							int i_635_ = anInt9346 + anInt9348;
							int i_636_ = anInt9324 + anInt9349;
							int i_637_ = anInt9347;
							int i_638_;
							if ((i_638_ = i_635_ - ((((Class61_Sub3_Sub3) this).anInt9358) << 12)) >= 0) {
								i_638_ = (anInt9340 - i_638_) / anInt9340;
								i_637_ += i_638_;
								i_635_ += anInt9340 * i_638_;
								i_636_ += anInt9341 * i_638_;
								i_634_ += i_638_;
							}
							if ((i_638_ = (i_635_ - anInt9340) / anInt9340) > i_637_)
								i_637_ = i_638_;
							if ((i_638_ = i_636_ - ((((Class61_Sub3_Sub3) this).anInt9325) << 12)) >= 0) {
								i_638_ = (anInt9341 - i_638_) / anInt9341;
								i_637_ += i_638_;
								i_635_ += anInt9340 * i_638_;
								i_636_ += anInt9341 * i_638_;
								i_634_ += i_638_;
							}
							if ((i_638_ = (i_636_ - anInt9341) / anInt9341) > i_637_)
								i_637_ = i_638_;
							int i_639_ = is[i_633_] - i;
							int i_640_ = -is_585_[i_633_];
							int i_641_ = i_639_ - (i_634_ - anInt9339);
							if (i_641_ > 0) {
								i_634_ += i_641_;
								i_637_ += i_641_;
								i_635_ += anInt9340 * i_641_;
								i_636_ += anInt9341 * i_641_;
							} else
								i_640_ -= i_641_;
							if (i_637_ < i_640_)
								i_637_ = i_640_;
							for (/**/; i_637_ < 0; i_637_++) {
								int i_642_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_636_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_635_ >> 12))]);
								if (i_642_ != 0)
									is_587_[i_634_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_642_ & 0xff]);
								else
									i_634_++;
								i_635_ += anInt9340;
								i_636_ += anInt9341;
							}
						}
						i_632_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_643_ = anInt9356;
					while (i_643_ < 0) {
						int i_644_ = i_643_ + i_586_;
						if (i_644_ >= 0) {
							if (i_644_ >= is.length)
								break;
							int i_645_ = anInt9339;
							int i_646_ = anInt9346 + anInt9348;
							int i_647_ = anInt9324 + anInt9349;
							int i_648_ = anInt9347;
							int i_649_;
							if ((i_649_ = i_646_ - ((((Class61_Sub3_Sub3) this).anInt9358) << 12)) >= 0) {
								i_649_ = (anInt9340 - i_649_) / anInt9340;
								i_648_ += i_649_;
								i_646_ += anInt9340 * i_649_;
								i_647_ += anInt9341 * i_649_;
								i_645_ += i_649_;
							}
							if ((i_649_ = (i_646_ - anInt9340) / anInt9340) > i_648_)
								i_648_ = i_649_;
							if (i_647_ < 0) {
								i_649_ = (anInt9341 - 1 - i_647_) / anInt9341;
								i_648_ += i_649_;
								i_646_ += anInt9340 * i_649_;
								i_647_ += anInt9341 * i_649_;
								i_645_ += i_649_;
							}
							if ((i_649_ = (1 + i_647_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_648_)
								i_648_ = i_649_;
							int i_650_ = is[i_644_] - i;
							int i_651_ = -is_585_[i_644_];
							int i_652_ = i_650_ - (i_645_ - anInt9339);
							if (i_652_ > 0) {
								i_645_ += i_652_;
								i_648_ += i_652_;
								i_646_ += anInt9340 * i_652_;
								i_647_ += anInt9341 * i_652_;
							} else
								i_651_ -= i_652_;
							if (i_648_ < i_651_)
								i_648_ = i_651_;
							for (/**/; i_648_ < 0; i_648_++) {
								int i_653_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_647_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_646_ >> 12))]);
								if (i_653_ != 0)
									is_587_[i_645_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_653_ & 0xff]);
								else
									i_645_++;
								i_646_ += anInt9340;
								i_647_ += anInt9341;
							}
						}
						i_643_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_654_ = anInt9356;
				while (i_654_ < 0) {
					int i_655_ = i_654_ + i_586_;
					if (i_655_ >= 0) {
						if (i_655_ >= is.length)
							break;
						int i_656_ = anInt9339;
						int i_657_ = anInt9346 + anInt9348;
						int i_658_ = anInt9324;
						int i_659_ = anInt9347;
						if (i_658_ >= 0 && i_658_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							if (i_657_ < 0) {
								int i_660_ = (anInt9340 - 1 - i_657_) / anInt9340;
								i_659_ += i_660_;
								i_657_ += anInt9340 * i_660_;
								i_656_ += i_660_;
							}
							int i_661_;
							if ((i_661_ = (1 + i_657_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_659_)
								i_659_ = i_661_;
							int i_662_ = is[i_655_] - i;
							int i_663_ = -is_585_[i_655_];
							int i_664_ = i_662_ - (i_656_ - anInt9339);
							if (i_664_ > 0) {
								i_656_ += i_664_;
								i_659_ += i_664_;
								i_657_ += anInt9340 * i_664_;
								i_658_ += anInt9341 * i_664_;
							} else
								i_663_ -= i_664_;
							if (i_659_ < i_663_)
								i_659_ = i_663_;
							for (/**/; i_659_ < 0; i_659_++) {
								int i_665_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_658_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_657_ >> 12))]);
								if (i_665_ != 0)
									is_587_[i_656_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_665_ & 0xff]);
								else
									i_656_++;
								i_657_ += anInt9340;
							}
						}
					}
					i_654_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_666_ = anInt9356;
				while (i_666_ < 0) {
					int i_667_ = i_666_ + i_586_;
					if (i_667_ >= 0) {
						if (i_667_ >= is.length)
							break;
						int i_668_ = anInt9339;
						int i_669_ = anInt9346 + anInt9348;
						int i_670_ = anInt9324 + anInt9349;
						int i_671_ = anInt9347;
						if (i_669_ < 0) {
							int i_672_ = (anInt9340 - 1 - i_669_) / anInt9340;
							i_671_ += i_672_;
							i_669_ += anInt9340 * i_672_;
							i_670_ += anInt9341 * i_672_;
							i_668_ += i_672_;
						}
						int i_673_;
						if ((i_673_ = (1 + i_669_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_671_)
							i_671_ = i_673_;
						if ((i_673_ = i_670_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_673_ = (anInt9341 - i_673_) / anInt9341;
							i_671_ += i_673_;
							i_669_ += anInt9340 * i_673_;
							i_670_ += anInt9341 * i_673_;
							i_668_ += i_673_;
						}
						if ((i_673_ = (i_670_ - anInt9341) / anInt9341) > i_671_)
							i_671_ = i_673_;
						int i_674_ = is[i_667_] - i;
						int i_675_ = -is_585_[i_667_];
						int i_676_ = i_674_ - (i_668_ - anInt9339);
						if (i_676_ > 0) {
							i_668_ += i_676_;
							i_671_ += i_676_;
							i_669_ += anInt9340 * i_676_;
							i_670_ += anInt9341 * i_676_;
						} else
							i_675_ -= i_676_;
						if (i_671_ < i_675_)
							i_671_ = i_675_;
						for (/**/; i_671_ < 0; i_671_++) {
							int i_677_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_670_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_669_ >> 12))]);
							if (i_677_ != 0)
								is_587_[i_668_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_677_ & 0xff]);
							else
								i_668_++;
							i_669_ += anInt9340;
							i_670_ += anInt9341;
						}
					}
					i_666_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_678_ = anInt9356;
				while (i_678_ < 0) {
					int i_679_ = i_678_ + i_586_;
					if (i_679_ >= 0) {
						if (i_679_ >= is.length)
							break;
						int i_680_ = anInt9339;
						int i_681_ = anInt9346 + anInt9348;
						int i_682_ = anInt9324 + anInt9349;
						int i_683_ = anInt9347;
						if (i_681_ < 0) {
							int i_684_ = (anInt9340 - 1 - i_681_) / anInt9340;
							i_683_ += i_684_;
							i_681_ += anInt9340 * i_684_;
							i_682_ += anInt9341 * i_684_;
							i_680_ += i_684_;
						}
						int i_685_;
						if ((i_685_ = (1 + i_681_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_683_)
							i_683_ = i_685_;
						if (i_682_ < 0) {
							i_685_ = (anInt9341 - 1 - i_682_) / anInt9341;
							i_683_ += i_685_;
							i_681_ += anInt9340 * i_685_;
							i_682_ += anInt9341 * i_685_;
							i_680_ += i_685_;
						}
						if ((i_685_ = (1 + i_682_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_683_)
							i_683_ = i_685_;
						int i_686_ = is[i_679_] - i;
						int i_687_ = -is_585_[i_679_];
						int i_688_ = i_686_ - (i_680_ - anInt9339);
						if (i_688_ > 0) {
							i_680_ += i_688_;
							i_683_ += i_688_;
							i_681_ += anInt9340 * i_688_;
							i_682_ += anInt9341 * i_688_;
						} else
							i_687_ -= i_688_;
						if (i_683_ < i_687_)
							i_683_ = i_687_;
						for (/**/; i_683_ < 0; i_683_++) {
							int i_689_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_682_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_681_ >> 12))]);
							if (i_689_ != 0)
								is_587_[i_680_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_689_ & 0xff]);
							else
								i_680_++;
							i_681_ += anInt9340;
							i_682_ += anInt9341;
						}
					}
					i_678_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	public void method689(int i, int i_690_, Class_ta class_ta, int i_691_, int i_692_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			i += ((Class61_Sub3_Sub3) this).anInt9352;
			i_690_ += ((Class61_Sub3_Sub3) this).anInt9327;
			int i_693_ = 0;
			int i_694_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			int i_695_ = ((Class61_Sub3_Sub3) this).anInt9358;
			int i_696_ = ((Class61_Sub3_Sub3) this).anInt9325;
			int i_697_ = i_694_ - i_695_;
			int i_698_ = 0;
			int i_699_ = i + i_690_ * i_694_;
			if (i_690_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_700_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481 - i_690_);
				i_696_ -= i_700_;
				i_690_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_693_ += i_700_ * i_695_;
				i_699_ += i_700_ * i_694_;
			}
			if (i_690_ + i_696_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541)
				i_696_ -= (i_690_ + i_696_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_701_ = ((((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825 - i);
				i_695_ -= i_701_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_693_ += i_701_;
				i_699_ += i_701_;
				i_698_ += i_701_;
				i_697_ += i_701_;
			}
			if (i + i_695_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_702_ = (i + i_695_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_695_ -= i_702_;
				i_698_ += i_702_;
				i_697_ += i_702_;
			}
			if (i_695_ > 0 && i_696_ > 0) {
				Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
				int[] is_703_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8661;
				int[] is_704_ = ((Class_ta_Sub3) class_ta_sub3).anIntArray8662;
				int i_705_ = i_690_;
				if (i_692_ > i_705_) {
					i_705_ = i_692_;
					i_699_ += (i_692_ - i_690_) * i_694_;
					i_693_ += ((i_692_ - i_690_) * ((Class61_Sub3_Sub3) this).anInt9358);
				}
				int i_706_ = (i_692_ + is_703_.length < i_690_ + i_696_ ? i_692_ + is_703_.length : i_690_ + i_696_);
				for (int i_707_ = i_705_; i_707_ < i_706_; i_707_++) {
					int i_708_ = is_703_[i_707_ - i_692_] + i_691_;
					int i_709_ = is_704_[i_707_ - i_692_];
					int i_710_ = i_695_;
					if (i > i_708_) {
						int i_711_ = i - i_708_;
						if (i_711_ >= i_709_) {
							i_693_ += i_695_ + i_698_;
							i_699_ += i_695_ + i_697_;
							continue;
						}
						i_709_ -= i_711_;
					} else {
						int i_712_ = i_708_ - i;
						if (i_712_ >= i_695_) {
							i_693_ += i_695_ + i_698_;
							i_699_ += i_695_ + i_697_;
							continue;
						}
						i_693_ += i_712_;
						i_710_ -= i_712_;
						i_699_ += i_712_;
					}
					int i_713_ = 0;
					if (i_710_ < i_709_)
						i_709_ = i_710_;
					else
						i_713_ = i_710_ - i_709_;
					for (int i_714_ = -i_709_; i_714_ < 0; i_714_++) {
						int i_715_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_693_++]);
						if (i_715_ != 0)
							is[i_699_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_715_ & 0xff]);
						else
							i_699_++;
					}
					i_693_ += i_713_ + i_698_;
					i_699_ += i_713_ + i_697_;
				}
			}
		}
	}

	public void method705(int i, int i_716_, int i_717_) {
		throw new IllegalStateException();
	}

	public Interface8_Impl1_Impl2 method713() {
		throw new IllegalStateException();
	}

	void method756(int i, int i_718_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_719_ = anInt9356;
					while (i_719_ < 0) {
						int i_720_ = anInt9339;
						int i_721_ = anInt9346;
						int i_722_ = anInt9324;
						int i_723_ = anInt9347;
						if (i_721_ >= 0 && i_722_ >= 0 && i_721_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0 && i_722_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							for (/**/; i_723_ < 0; i_723_++) {
								int i_724_ = (((i_722_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_721_ >> 12));
								int i_725_ = i_720_++;
								if (i_718_ == 0) {
									if (i == 1)
										is[i_725_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]) & 0xff)]);
									else if (i == 0) {
										int i_726_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]) & 0xff)]);
										int i_727_ = ((i_726_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_728_ = ((i_726_ & 0xff00) * anInt9354 & 0xff0000);
										int i_729_ = ((i_726_ & 0xff) * anInt9333 & 0xff00);
										is[i_725_] = (i_727_ | i_728_ | i_729_) >>> 8;
									} else if (i == 3) {
										int i_730_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]) & 0xff)]);
										int i_731_ = anInt9350;
										int i_732_ = i_730_ + i_731_;
										int i_733_ = ((i_730_ & 0xff00ff) + (i_731_ & 0xff00ff));
										int i_734_ = ((i_733_ & 0x1000100) + (i_732_ - i_733_ & 0x10000));
										is[i_725_] = (i_732_ - i_734_ | i_734_ - (i_734_ >>> 8));
									} else if (i == 2) {
										int i_735_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]) & 0xff)]);
										int i_736_ = ((i_735_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_737_ = ((i_735_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_725_] = (((i_736_ | i_737_) >>> 8) + anInt9323);
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 1) {
									if (i == 1) {
										int i_738_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										if (i_738_ != 0)
											is[i_725_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_738_ & 0xff]);
									} else if (i == 0) {
										int i_739_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										if (i_739_ != 0) {
											int i_740_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_739_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_741_ = anInt9350 >>> 24;
												int i_742_ = 256 - i_741_;
												int i_743_ = is[i_725_];
												is[i_725_] = (((((i_740_ & 0xff00ff) * i_741_) + ((i_743_ & 0xff00ff) * i_742_)) & ~0xff00ff) + ((((i_740_ & 0xff00) * i_741_) + ((i_743_ & 0xff00) * i_742_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_744_ = (((i_740_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_745_ = (((i_740_ & 0xff00) * anInt9354) & 0xff0000);
												int i_746_ = (((i_740_ & 0xff) * anInt9333) & 0xff00);
												i_740_ = (i_744_ | i_745_ | i_746_) >>> 8;
												int i_747_ = is[i_725_];
												is[i_725_] = (((((i_740_ & 0xff00ff) * anInt9351) + ((i_747_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_740_ & 0xff00) * anInt9351) + ((i_747_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_748_ = (((i_740_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_749_ = (((i_740_ & 0xff00) * anInt9354) & 0xff0000);
												int i_750_ = (((i_740_ & 0xff) * anInt9333) & 0xff00);
												is[i_725_] = (i_748_ | i_749_ | i_750_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_751_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										int i_752_ = (i_751_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_751_]) : 0);
										int i_753_ = anInt9350;
										int i_754_ = i_752_ + i_753_;
										int i_755_ = ((i_752_ & 0xff00ff) + (i_753_ & 0xff00ff));
										int i_756_ = ((i_755_ & 0x1000100) + (i_754_ - i_755_ & 0x10000));
										i_756_ = (i_754_ - i_756_ | i_756_ - (i_756_ >>> 8));
										if (i_752_ == 0 && anInt9351 != 255) {
											i_752_ = i_756_;
											i_756_ = is[i_725_];
											i_756_ = (((((i_752_ & 0xff00ff) * anInt9351) + ((i_756_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_752_ & 0xff00) * anInt9351) + ((i_756_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_725_] = i_756_;
									} else if (i == 2) {
										int i_757_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										if (i_757_ != 0) {
											int i_758_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_757_ & 0xff]);
											int i_759_ = (((i_758_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_760_ = (((i_758_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_725_++] = ((i_759_ | i_760_) >>> 8) + anInt9323;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 2) {
									if (i == 1) {
										int i_761_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										if (i_761_ != 0) {
											int i_762_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_761_ & 0xff]);
											int i_763_ = is[i_725_];
											int i_764_ = i_762_ + i_763_;
											int i_765_ = ((i_762_ & 0xff00ff) + (i_763_ & 0xff00ff));
											i_763_ = ((i_765_ & 0x1000100) + (i_764_ - i_765_ & 0x10000));
											is[i_725_] = (i_764_ - i_763_ | i_763_ - (i_763_ >>> 8));
										}
									} else if (i == 0) {
										int i_766_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										if (i_766_ != 0) {
											int i_767_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_766_ & 0xff]);
											int i_768_ = (((i_767_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_769_ = (((i_767_ & 0xff00) * anInt9354) & 0xff0000);
											int i_770_ = ((i_767_ & 0xff) * anInt9333 & 0xff00);
											i_767_ = (i_768_ | i_769_ | i_770_) >>> 8;
											int i_771_ = is[i_725_];
											int i_772_ = i_767_ + i_771_;
											int i_773_ = ((i_767_ & 0xff00ff) + (i_771_ & 0xff00ff));
											i_771_ = ((i_773_ & 0x1000100) + (i_772_ - i_773_ & 0x10000));
											is[i_725_] = (i_772_ - i_771_ | i_771_ - (i_771_ >>> 8));
										}
									} else if (i == 3) {
										byte i_774_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										int i_775_ = (i_774_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_774_]) : 0);
										int i_776_ = anInt9350;
										int i_777_ = i_775_ + i_776_;
										int i_778_ = ((i_775_ & 0xff00ff) + (i_776_ & 0xff00ff));
										int i_779_ = ((i_778_ & 0x1000100) + (i_777_ - i_778_ & 0x10000));
										i_779_ = (i_777_ - i_779_ | i_779_ - (i_779_ >>> 8));
										if (i_775_ == 0 && anInt9351 != 255) {
											i_775_ = i_779_;
											i_779_ = is[i_725_];
											i_779_ = (((((i_775_ & 0xff00ff) * anInt9351) + ((i_779_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_775_ & 0xff00) * anInt9351) + ((i_779_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_725_] = i_779_;
									} else if (i == 2) {
										int i_780_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_724_]);
										if (i_780_ != 0) {
											int i_781_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_780_ & 0xff]);
											int i_782_ = (((i_781_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_783_ = (((i_781_ & 0xff00) * anInt9351) & 0xff0000);
											i_781_ = (((i_782_ | i_783_) >>> 8) + anInt9323);
											int i_784_ = is[i_725_];
											int i_785_ = i_781_ + i_784_;
											int i_786_ = ((i_781_ & 0xff00ff) + (i_784_ & 0xff00ff));
											i_784_ = ((i_786_ & 0x1000100) + (i_785_ - i_786_ & 0x10000));
											is[i_725_] = (i_785_ - i_784_ | i_784_ - (i_784_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_719_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_787_ = anInt9356;
					while (i_787_ < 0) {
						int i_788_ = anInt9339;
						int i_789_ = anInt9346;
						int i_790_ = anInt9324 + anInt9349;
						int i_791_ = anInt9347;
						if (i_789_ >= 0 && i_789_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0) {
							int i_792_;
							if ((i_792_ = i_790_ - ((((Class61_Sub3_Sub3) this).anInt9325) << 12)) >= 0) {
								i_792_ = (anInt9341 - i_792_) / anInt9341;
								i_791_ += i_792_;
								i_790_ += anInt9341 * i_792_;
								i_788_ += i_792_;
							}
							if ((i_792_ = (i_790_ - anInt9341) / anInt9341) > i_791_)
								i_791_ = i_792_;
							for (/**/; i_791_ < 0; i_791_++) {
								int i_793_ = (((i_790_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_789_ >> 12));
								int i_794_ = i_788_++;
								if (i_718_ == 0) {
									if (i == 1)
										is[i_794_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]) & 0xff)]);
									else if (i == 0) {
										int i_795_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]) & 0xff)]);
										int i_796_ = ((i_795_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_797_ = ((i_795_ & 0xff00) * anInt9354 & 0xff0000);
										int i_798_ = ((i_795_ & 0xff) * anInt9333 & 0xff00);
										is[i_794_] = (i_796_ | i_797_ | i_798_) >>> 8;
									} else if (i == 3) {
										int i_799_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]) & 0xff)]);
										int i_800_ = anInt9350;
										int i_801_ = i_799_ + i_800_;
										int i_802_ = ((i_799_ & 0xff00ff) + (i_800_ & 0xff00ff));
										int i_803_ = ((i_802_ & 0x1000100) + (i_801_ - i_802_ & 0x10000));
										is[i_794_] = (i_801_ - i_803_ | i_803_ - (i_803_ >>> 8));
									} else if (i == 2) {
										int i_804_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]) & 0xff)]);
										int i_805_ = ((i_804_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_806_ = ((i_804_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_794_] = (((i_805_ | i_806_) >>> 8) + anInt9323);
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 1) {
									if (i == 1) {
										int i_807_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										if (i_807_ != 0)
											is[i_794_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_807_ & 0xff]);
									} else if (i == 0) {
										int i_808_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										if (i_808_ != 0) {
											int i_809_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_808_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_810_ = anInt9350 >>> 24;
												int i_811_ = 256 - i_810_;
												int i_812_ = is[i_794_];
												is[i_794_] = (((((i_809_ & 0xff00ff) * i_810_) + ((i_812_ & 0xff00ff) * i_811_)) & ~0xff00ff) + ((((i_809_ & 0xff00) * i_810_) + ((i_812_ & 0xff00) * i_811_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_813_ = (((i_809_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_814_ = (((i_809_ & 0xff00) * anInt9354) & 0xff0000);
												int i_815_ = (((i_809_ & 0xff) * anInt9333) & 0xff00);
												i_809_ = (i_813_ | i_814_ | i_815_) >>> 8;
												int i_816_ = is[i_794_];
												is[i_794_] = (((((i_809_ & 0xff00ff) * anInt9351) + ((i_816_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_809_ & 0xff00) * anInt9351) + ((i_816_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_817_ = (((i_809_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_818_ = (((i_809_ & 0xff00) * anInt9354) & 0xff0000);
												int i_819_ = (((i_809_ & 0xff) * anInt9333) & 0xff00);
												is[i_794_] = (i_817_ | i_818_ | i_819_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_820_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										int i_821_ = (i_820_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_820_]) : 0);
										int i_822_ = anInt9350;
										int i_823_ = i_821_ + i_822_;
										int i_824_ = ((i_821_ & 0xff00ff) + (i_822_ & 0xff00ff));
										int i_825_ = ((i_824_ & 0x1000100) + (i_823_ - i_824_ & 0x10000));
										i_825_ = (i_823_ - i_825_ | i_825_ - (i_825_ >>> 8));
										if (i_821_ == 0 && anInt9351 != 255) {
											i_821_ = i_825_;
											i_825_ = is[i_794_];
											i_825_ = (((((i_821_ & 0xff00ff) * anInt9351) + ((i_825_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_821_ & 0xff00) * anInt9351) + ((i_825_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_794_] = i_825_;
									} else if (i == 2) {
										int i_826_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										if (i_826_ != 0) {
											int i_827_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_826_ & 0xff]);
											int i_828_ = (((i_827_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_829_ = (((i_827_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_794_++] = ((i_828_ | i_829_) >>> 8) + anInt9323;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 2) {
									if (i == 1) {
										int i_830_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										if (i_830_ != 0) {
											int i_831_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_830_ & 0xff]);
											int i_832_ = is[i_794_];
											int i_833_ = i_831_ + i_832_;
											int i_834_ = ((i_831_ & 0xff00ff) + (i_832_ & 0xff00ff));
											i_832_ = ((i_834_ & 0x1000100) + (i_833_ - i_834_ & 0x10000));
											is[i_794_] = (i_833_ - i_832_ | i_832_ - (i_832_ >>> 8));
										}
									} else if (i == 0) {
										int i_835_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										if (i_835_ != 0) {
											int i_836_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_835_ & 0xff]);
											int i_837_ = (((i_836_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_838_ = (((i_836_ & 0xff00) * anInt9354) & 0xff0000);
											int i_839_ = ((i_836_ & 0xff) * anInt9333 & 0xff00);
											i_836_ = (i_837_ | i_838_ | i_839_) >>> 8;
											int i_840_ = is[i_794_];
											int i_841_ = i_836_ + i_840_;
											int i_842_ = ((i_836_ & 0xff00ff) + (i_840_ & 0xff00ff));
											i_840_ = ((i_842_ & 0x1000100) + (i_841_ - i_842_ & 0x10000));
											is[i_794_] = (i_841_ - i_840_ | i_840_ - (i_840_ >>> 8));
										}
									} else if (i == 3) {
										byte i_843_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										int i_844_ = (i_843_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_843_]) : 0);
										int i_845_ = anInt9350;
										int i_846_ = i_844_ + i_845_;
										int i_847_ = ((i_844_ & 0xff00ff) + (i_845_ & 0xff00ff));
										int i_848_ = ((i_847_ & 0x1000100) + (i_846_ - i_847_ & 0x10000));
										i_848_ = (i_846_ - i_848_ | i_848_ - (i_848_ >>> 8));
										if (i_844_ == 0 && anInt9351 != 255) {
											i_844_ = i_848_;
											i_848_ = is[i_794_];
											i_848_ = (((((i_844_ & 0xff00ff) * anInt9351) + ((i_848_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_844_ & 0xff00) * anInt9351) + ((i_848_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_794_] = i_848_;
									} else if (i == 2) {
										int i_849_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_793_]);
										if (i_849_ != 0) {
											int i_850_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_849_ & 0xff]);
											int i_851_ = (((i_850_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_852_ = (((i_850_ & 0xff00) * anInt9351) & 0xff0000);
											i_850_ = (((i_851_ | i_852_) >>> 8) + anInt9323);
											int i_853_ = is[i_794_];
											int i_854_ = i_850_ + i_853_;
											int i_855_ = ((i_850_ & 0xff00ff) + (i_853_ & 0xff00ff));
											i_853_ = ((i_855_ & 0x1000100) + (i_854_ - i_855_ & 0x10000));
											is[i_794_] = (i_854_ - i_853_ | i_853_ - (i_853_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_790_ += anInt9341;
							}
						}
						i_787_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_856_ = anInt9356;
					while (i_856_ < 0) {
						int i_857_ = anInt9339;
						int i_858_ = anInt9346;
						int i_859_ = anInt9324 + anInt9349;
						int i_860_ = anInt9347;
						if (i_858_ >= 0 && i_858_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0) {
							if (i_859_ < 0) {
								int i_861_ = (anInt9341 - 1 - i_859_) / anInt9341;
								i_860_ += i_861_;
								i_859_ += anInt9341 * i_861_;
								i_857_ += i_861_;
							}
							int i_862_;
							if ((i_862_ = (1 + i_859_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_860_)
								i_860_ = i_862_;
							for (/**/; i_860_ < 0; i_860_++) {
								int i_863_ = (((i_859_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_858_ >> 12));
								int i_864_ = i_857_++;
								if (i_718_ == 0) {
									if (i == 1)
										is[i_864_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]) & 0xff)]);
									else if (i == 0) {
										int i_865_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]) & 0xff)]);
										int i_866_ = ((i_865_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_867_ = ((i_865_ & 0xff00) * anInt9354 & 0xff0000);
										int i_868_ = ((i_865_ & 0xff) * anInt9333 & 0xff00);
										is[i_864_] = (i_866_ | i_867_ | i_868_) >>> 8;
									} else if (i == 3) {
										int i_869_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]) & 0xff)]);
										int i_870_ = anInt9350;
										int i_871_ = i_869_ + i_870_;
										int i_872_ = ((i_869_ & 0xff00ff) + (i_870_ & 0xff00ff));
										int i_873_ = ((i_872_ & 0x1000100) + (i_871_ - i_872_ & 0x10000));
										is[i_864_] = (i_871_ - i_873_ | i_873_ - (i_873_ >>> 8));
									} else if (i == 2) {
										int i_874_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]) & 0xff)]);
										int i_875_ = ((i_874_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_876_ = ((i_874_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_864_] = (((i_875_ | i_876_) >>> 8) + anInt9323);
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 1) {
									if (i == 1) {
										int i_877_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										if (i_877_ != 0)
											is[i_864_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_877_ & 0xff]);
									} else if (i == 0) {
										int i_878_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										if (i_878_ != 0) {
											int i_879_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_878_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_880_ = anInt9350 >>> 24;
												int i_881_ = 256 - i_880_;
												int i_882_ = is[i_864_];
												is[i_864_] = (((((i_879_ & 0xff00ff) * i_880_) + ((i_882_ & 0xff00ff) * i_881_)) & ~0xff00ff) + ((((i_879_ & 0xff00) * i_880_) + ((i_882_ & 0xff00) * i_881_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_883_ = (((i_879_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_884_ = (((i_879_ & 0xff00) * anInt9354) & 0xff0000);
												int i_885_ = (((i_879_ & 0xff) * anInt9333) & 0xff00);
												i_879_ = (i_883_ | i_884_ | i_885_) >>> 8;
												int i_886_ = is[i_864_];
												is[i_864_] = (((((i_879_ & 0xff00ff) * anInt9351) + ((i_886_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_879_ & 0xff00) * anInt9351) + ((i_886_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_887_ = (((i_879_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_888_ = (((i_879_ & 0xff00) * anInt9354) & 0xff0000);
												int i_889_ = (((i_879_ & 0xff) * anInt9333) & 0xff00);
												is[i_864_] = (i_887_ | i_888_ | i_889_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_890_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										int i_891_ = (i_890_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_890_]) : 0);
										int i_892_ = anInt9350;
										int i_893_ = i_891_ + i_892_;
										int i_894_ = ((i_891_ & 0xff00ff) + (i_892_ & 0xff00ff));
										int i_895_ = ((i_894_ & 0x1000100) + (i_893_ - i_894_ & 0x10000));
										i_895_ = (i_893_ - i_895_ | i_895_ - (i_895_ >>> 8));
										if (i_891_ == 0 && anInt9351 != 255) {
											i_891_ = i_895_;
											i_895_ = is[i_864_];
											i_895_ = (((((i_891_ & 0xff00ff) * anInt9351) + ((i_895_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_891_ & 0xff00) * anInt9351) + ((i_895_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_864_] = i_895_;
									} else if (i == 2) {
										int i_896_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										if (i_896_ != 0) {
											int i_897_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_896_ & 0xff]);
											int i_898_ = (((i_897_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_899_ = (((i_897_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_864_++] = ((i_898_ | i_899_) >>> 8) + anInt9323;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 2) {
									if (i == 1) {
										int i_900_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										if (i_900_ != 0) {
											int i_901_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_900_ & 0xff]);
											int i_902_ = is[i_864_];
											int i_903_ = i_901_ + i_902_;
											int i_904_ = ((i_901_ & 0xff00ff) + (i_902_ & 0xff00ff));
											i_902_ = ((i_904_ & 0x1000100) + (i_903_ - i_904_ & 0x10000));
											is[i_864_] = (i_903_ - i_902_ | i_902_ - (i_902_ >>> 8));
										}
									} else if (i == 0) {
										int i_905_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										if (i_905_ != 0) {
											int i_906_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_905_ & 0xff]);
											int i_907_ = (((i_906_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_908_ = (((i_906_ & 0xff00) * anInt9354) & 0xff0000);
											int i_909_ = ((i_906_ & 0xff) * anInt9333 & 0xff00);
											i_906_ = (i_907_ | i_908_ | i_909_) >>> 8;
											int i_910_ = is[i_864_];
											int i_911_ = i_906_ + i_910_;
											int i_912_ = ((i_906_ & 0xff00ff) + (i_910_ & 0xff00ff));
											i_910_ = ((i_912_ & 0x1000100) + (i_911_ - i_912_ & 0x10000));
											is[i_864_] = (i_911_ - i_910_ | i_910_ - (i_910_ >>> 8));
										}
									} else if (i == 3) {
										byte i_913_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										int i_914_ = (i_913_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_913_]) : 0);
										int i_915_ = anInt9350;
										int i_916_ = i_914_ + i_915_;
										int i_917_ = ((i_914_ & 0xff00ff) + (i_915_ & 0xff00ff));
										int i_918_ = ((i_917_ & 0x1000100) + (i_916_ - i_917_ & 0x10000));
										i_918_ = (i_916_ - i_918_ | i_918_ - (i_918_ >>> 8));
										if (i_914_ == 0 && anInt9351 != 255) {
											i_914_ = i_918_;
											i_918_ = is[i_864_];
											i_918_ = (((((i_914_ & 0xff00ff) * anInt9351) + ((i_918_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_914_ & 0xff00) * anInt9351) + ((i_918_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_864_] = i_918_;
									} else if (i == 2) {
										int i_919_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_863_]);
										if (i_919_ != 0) {
											int i_920_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_919_ & 0xff]);
											int i_921_ = (((i_920_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_922_ = (((i_920_ & 0xff00) * anInt9351) & 0xff0000);
											i_920_ = (((i_921_ | i_922_) >>> 8) + anInt9323);
											int i_923_ = is[i_864_];
											int i_924_ = i_920_ + i_923_;
											int i_925_ = ((i_920_ & 0xff00ff) + (i_923_ & 0xff00ff));
											i_923_ = ((i_925_ & 0x1000100) + (i_924_ - i_925_ & 0x10000));
											is[i_864_] = (i_924_ - i_923_ | i_923_ - (i_923_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_859_ += anInt9341;
							}
						}
						i_856_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_926_ = anInt9356;
					while (i_926_ < 0) {
						int i_927_ = anInt9339;
						int i_928_ = anInt9346 + anInt9348;
						int i_929_ = anInt9324;
						int i_930_ = anInt9347;
						if (i_929_ >= 0 && i_929_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							int i_931_;
							if ((i_931_ = i_928_ - ((((Class61_Sub3_Sub3) this).anInt9358) << 12)) >= 0) {
								i_931_ = (anInt9340 - i_931_) / anInt9340;
								i_930_ += i_931_;
								i_928_ += anInt9340 * i_931_;
								i_927_ += i_931_;
							}
							if ((i_931_ = (i_928_ - anInt9340) / anInt9340) > i_930_)
								i_930_ = i_931_;
							for (/**/; i_930_ < 0; i_930_++) {
								int i_932_ = (((i_929_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_928_ >> 12));
								int i_933_ = i_927_++;
								if (i_718_ == 0) {
									if (i == 1)
										is[i_933_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]) & 0xff)]);
									else if (i == 0) {
										int i_934_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]) & 0xff)]);
										int i_935_ = ((i_934_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_936_ = ((i_934_ & 0xff00) * anInt9354 & 0xff0000);
										int i_937_ = ((i_934_ & 0xff) * anInt9333 & 0xff00);
										is[i_933_] = (i_935_ | i_936_ | i_937_) >>> 8;
									} else if (i == 3) {
										int i_938_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]) & 0xff)]);
										int i_939_ = anInt9350;
										int i_940_ = i_938_ + i_939_;
										int i_941_ = ((i_938_ & 0xff00ff) + (i_939_ & 0xff00ff));
										int i_942_ = ((i_941_ & 0x1000100) + (i_940_ - i_941_ & 0x10000));
										is[i_933_] = (i_940_ - i_942_ | i_942_ - (i_942_ >>> 8));
									} else if (i == 2) {
										int i_943_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]) & 0xff)]);
										int i_944_ = ((i_943_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_945_ = ((i_943_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_933_] = (((i_944_ | i_945_) >>> 8) + anInt9323);
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 1) {
									if (i == 1) {
										int i_946_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										if (i_946_ != 0)
											is[i_933_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_946_ & 0xff]);
									} else if (i == 0) {
										int i_947_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										if (i_947_ != 0) {
											int i_948_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_947_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_949_ = anInt9350 >>> 24;
												int i_950_ = 256 - i_949_;
												int i_951_ = is[i_933_];
												is[i_933_] = (((((i_948_ & 0xff00ff) * i_949_) + ((i_951_ & 0xff00ff) * i_950_)) & ~0xff00ff) + ((((i_948_ & 0xff00) * i_949_) + ((i_951_ & 0xff00) * i_950_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_952_ = (((i_948_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_953_ = (((i_948_ & 0xff00) * anInt9354) & 0xff0000);
												int i_954_ = (((i_948_ & 0xff) * anInt9333) & 0xff00);
												i_948_ = (i_952_ | i_953_ | i_954_) >>> 8;
												int i_955_ = is[i_933_];
												is[i_933_] = (((((i_948_ & 0xff00ff) * anInt9351) + ((i_955_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_948_ & 0xff00) * anInt9351) + ((i_955_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_956_ = (((i_948_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_957_ = (((i_948_ & 0xff00) * anInt9354) & 0xff0000);
												int i_958_ = (((i_948_ & 0xff) * anInt9333) & 0xff00);
												is[i_933_] = (i_956_ | i_957_ | i_958_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_959_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										int i_960_ = (i_959_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_959_]) : 0);
										int i_961_ = anInt9350;
										int i_962_ = i_960_ + i_961_;
										int i_963_ = ((i_960_ & 0xff00ff) + (i_961_ & 0xff00ff));
										int i_964_ = ((i_963_ & 0x1000100) + (i_962_ - i_963_ & 0x10000));
										i_964_ = (i_962_ - i_964_ | i_964_ - (i_964_ >>> 8));
										if (i_960_ == 0 && anInt9351 != 255) {
											i_960_ = i_964_;
											i_964_ = is[i_933_];
											i_964_ = (((((i_960_ & 0xff00ff) * anInt9351) + ((i_964_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_960_ & 0xff00) * anInt9351) + ((i_964_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_933_] = i_964_;
									} else if (i == 2) {
										int i_965_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										if (i_965_ != 0) {
											int i_966_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_965_ & 0xff]);
											int i_967_ = (((i_966_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_968_ = (((i_966_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_933_++] = ((i_967_ | i_968_) >>> 8) + anInt9323;
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_718_ == 2) {
									if (i == 1) {
										int i_969_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										if (i_969_ != 0) {
											int i_970_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_969_ & 0xff]);
											int i_971_ = is[i_933_];
											int i_972_ = i_970_ + i_971_;
											int i_973_ = ((i_970_ & 0xff00ff) + (i_971_ & 0xff00ff));
											i_971_ = ((i_973_ & 0x1000100) + (i_972_ - i_973_ & 0x10000));
											is[i_933_] = (i_972_ - i_971_ | i_971_ - (i_971_ >>> 8));
										}
									} else if (i == 0) {
										int i_974_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										if (i_974_ != 0) {
											int i_975_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_974_ & 0xff]);
											int i_976_ = (((i_975_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_977_ = (((i_975_ & 0xff00) * anInt9354) & 0xff0000);
											int i_978_ = ((i_975_ & 0xff) * anInt9333 & 0xff00);
											i_975_ = (i_976_ | i_977_ | i_978_) >>> 8;
											int i_979_ = is[i_933_];
											int i_980_ = i_975_ + i_979_;
											int i_981_ = ((i_975_ & 0xff00ff) + (i_979_ & 0xff00ff));
											i_979_ = ((i_981_ & 0x1000100) + (i_980_ - i_981_ & 0x10000));
											is[i_933_] = (i_980_ - i_979_ | i_979_ - (i_979_ >>> 8));
										}
									} else if (i == 3) {
										byte i_982_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										int i_983_ = (i_982_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_982_]) : 0);
										int i_984_ = anInt9350;
										int i_985_ = i_983_ + i_984_;
										int i_986_ = ((i_983_ & 0xff00ff) + (i_984_ & 0xff00ff));
										int i_987_ = ((i_986_ & 0x1000100) + (i_985_ - i_986_ & 0x10000));
										i_987_ = (i_985_ - i_987_ | i_987_ - (i_987_ >>> 8));
										if (i_983_ == 0 && anInt9351 != 255) {
											i_983_ = i_987_;
											i_987_ = is[i_933_];
											i_987_ = (((((i_983_ & 0xff00ff) * anInt9351) + ((i_987_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_983_ & 0xff00) * anInt9351) + ((i_987_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_933_] = i_987_;
									} else if (i == 2) {
										int i_988_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_932_]);
										if (i_988_ != 0) {
											int i_989_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_988_ & 0xff]);
											int i_990_ = (((i_989_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_991_ = (((i_989_ & 0xff00) * anInt9351) & 0xff0000);
											i_989_ = (((i_990_ | i_991_) >>> 8) + anInt9323);
											int i_992_ = is[i_933_];
											int i_993_ = i_989_ + i_992_;
											int i_994_ = ((i_989_ & 0xff00ff) + (i_992_ & 0xff00ff));
											i_992_ = ((i_994_ & 0x1000100) + (i_993_ - i_994_ & 0x10000));
											is[i_933_] = (i_993_ - i_992_ | i_992_ - (i_992_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_928_ += anInt9340;
							}
						}
						i_926_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_995_ = anInt9356;
					while (i_995_ < 0) {
						int i_996_ = anInt9339;
						int i_997_ = anInt9346 + anInt9348;
						int i_998_ = anInt9324 + anInt9349;
						int i_999_ = anInt9347;
						int i_1000_;
						if ((i_1000_ = i_997_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) >= 0) {
							i_1000_ = (anInt9340 - i_1000_) / anInt9340;
							i_999_ += i_1000_;
							i_997_ += anInt9340 * i_1000_;
							i_998_ += anInt9341 * i_1000_;
							i_996_ += i_1000_;
						}
						if ((i_1000_ = (i_997_ - anInt9340) / anInt9340) > i_999_)
							i_999_ = i_1000_;
						if ((i_1000_ = i_998_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_1000_ = (anInt9341 - i_1000_) / anInt9341;
							i_999_ += i_1000_;
							i_997_ += anInt9340 * i_1000_;
							i_998_ += anInt9341 * i_1000_;
							i_996_ += i_1000_;
						}
						if ((i_1000_ = (i_998_ - anInt9341) / anInt9341) > i_999_)
							i_999_ = i_1000_;
						for (/**/; i_999_ < 0; i_999_++) {
							int i_1001_ = (((i_998_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_997_ >> 12));
							int i_1002_ = i_996_++;
							if (i_718_ == 0) {
								if (i == 1)
									is[i_1002_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]) & 0xff]);
								else if (i == 0) {
									int i_1003_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]) & 0xff]);
									int i_1004_ = ((i_1003_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_1005_ = ((i_1003_ & 0xff00) * anInt9354 & 0xff0000);
									int i_1006_ = ((i_1003_ & 0xff) * anInt9333 & 0xff00);
									is[i_1002_] = (i_1004_ | i_1005_ | i_1006_) >>> 8;
								} else if (i == 3) {
									int i_1007_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]) & 0xff]);
									int i_1008_ = anInt9350;
									int i_1009_ = i_1007_ + i_1008_;
									int i_1010_ = ((i_1007_ & 0xff00ff) + (i_1008_ & 0xff00ff));
									int i_1011_ = ((i_1010_ & 0x1000100) + (i_1009_ - i_1010_ & 0x10000));
									is[i_1002_] = (i_1009_ - i_1011_ | i_1011_ - (i_1011_ >>> 8));
								} else if (i == 2) {
									int i_1012_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]) & 0xff]);
									int i_1013_ = ((i_1012_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_1014_ = ((i_1012_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_1002_] = (((i_1013_ | i_1014_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_718_ == 1) {
								if (i == 1) {
									int i_1015_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									if (i_1015_ != 0)
										is[i_1002_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1015_ & 0xff]);
								} else if (i == 0) {
									int i_1016_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									if (i_1016_ != 0) {
										int i_1017_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1016_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_1018_ = anInt9350 >>> 24;
											int i_1019_ = 256 - i_1018_;
											int i_1020_ = is[i_1002_];
											is[i_1002_] = (((((i_1017_ & 0xff00ff) * i_1018_) + ((i_1020_ & 0xff00ff) * i_1019_)) & ~0xff00ff) + ((((i_1017_ & 0xff00) * i_1018_) + ((i_1020_ & 0xff00) * i_1019_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_1021_ = (((i_1017_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_1022_ = (((i_1017_ & 0xff00) * anInt9354) & 0xff0000);
											int i_1023_ = ((i_1017_ & 0xff) * anInt9333 & 0xff00);
											i_1017_ = (i_1021_ | i_1022_ | i_1023_) >>> 8;
											int i_1024_ = is[i_1002_];
											is[i_1002_] = (((((i_1017_ & 0xff00ff) * anInt9351) + ((i_1024_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1017_ & 0xff00) * anInt9351) + ((i_1024_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_1025_ = (((i_1017_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_1026_ = (((i_1017_ & 0xff00) * anInt9354) & 0xff0000);
											int i_1027_ = ((i_1017_ & 0xff) * anInt9333 & 0xff00);
											is[i_1002_] = (i_1025_ | i_1026_ | i_1027_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1028_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									int i_1029_ = (i_1028_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1028_]) : 0);
									int i_1030_ = anInt9350;
									int i_1031_ = i_1029_ + i_1030_;
									int i_1032_ = ((i_1029_ & 0xff00ff) + (i_1030_ & 0xff00ff));
									int i_1033_ = ((i_1032_ & 0x1000100) + (i_1031_ - i_1032_ & 0x10000));
									i_1033_ = (i_1031_ - i_1033_ | i_1033_ - (i_1033_ >>> 8));
									if (i_1029_ == 0 && anInt9351 != 255) {
										i_1029_ = i_1033_;
										i_1033_ = is[i_1002_];
										i_1033_ = (((((i_1029_ & 0xff00ff) * anInt9351) + ((i_1033_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1029_ & 0xff00) * anInt9351) + ((i_1033_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_1002_] = i_1033_;
								} else if (i == 2) {
									int i_1034_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									if (i_1034_ != 0) {
										int i_1035_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1034_ & 0xff]);
										int i_1036_ = ((i_1035_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_1037_ = ((i_1035_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_1002_++] = ((i_1036_ | i_1037_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_718_ == 2) {
								if (i == 1) {
									int i_1038_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									if (i_1038_ != 0) {
										int i_1039_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1038_ & 0xff]);
										int i_1040_ = is[i_1002_];
										int i_1041_ = i_1039_ + i_1040_;
										int i_1042_ = ((i_1039_ & 0xff00ff) + (i_1040_ & 0xff00ff));
										i_1040_ = ((i_1042_ & 0x1000100) + (i_1041_ - i_1042_ & 0x10000));
										is[i_1002_] = (i_1041_ - i_1040_ | i_1040_ - (i_1040_ >>> 8));
									}
								} else if (i == 0) {
									int i_1043_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									if (i_1043_ != 0) {
										int i_1044_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1043_ & 0xff]);
										int i_1045_ = ((i_1044_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_1046_ = ((i_1044_ & 0xff00) * anInt9354 & 0xff0000);
										int i_1047_ = ((i_1044_ & 0xff) * anInt9333 & 0xff00);
										i_1044_ = (i_1045_ | i_1046_ | i_1047_) >>> 8;
										int i_1048_ = is[i_1002_];
										int i_1049_ = i_1044_ + i_1048_;
										int i_1050_ = ((i_1044_ & 0xff00ff) + (i_1048_ & 0xff00ff));
										i_1048_ = ((i_1050_ & 0x1000100) + (i_1049_ - i_1050_ & 0x10000));
										is[i_1002_] = (i_1049_ - i_1048_ | i_1048_ - (i_1048_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1051_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									int i_1052_ = (i_1051_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1051_]) : 0);
									int i_1053_ = anInt9350;
									int i_1054_ = i_1052_ + i_1053_;
									int i_1055_ = ((i_1052_ & 0xff00ff) + (i_1053_ & 0xff00ff));
									int i_1056_ = ((i_1055_ & 0x1000100) + (i_1054_ - i_1055_ & 0x10000));
									i_1056_ = (i_1054_ - i_1056_ | i_1056_ - (i_1056_ >>> 8));
									if (i_1052_ == 0 && anInt9351 != 255) {
										i_1052_ = i_1056_;
										i_1056_ = is[i_1002_];
										i_1056_ = (((((i_1052_ & 0xff00ff) * anInt9351) + ((i_1056_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1052_ & 0xff00) * anInt9351) + ((i_1056_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_1002_] = i_1056_;
								} else if (i == 2) {
									int i_1057_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1001_]);
									if (i_1057_ != 0) {
										int i_1058_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1057_ & 0xff]);
										int i_1059_ = ((i_1058_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_1060_ = ((i_1058_ & 0xff00) * anInt9351 & 0xff0000);
										i_1058_ = (((i_1059_ | i_1060_) >>> 8) + anInt9323);
										int i_1061_ = is[i_1002_];
										int i_1062_ = i_1058_ + i_1061_;
										int i_1063_ = ((i_1058_ & 0xff00ff) + (i_1061_ & 0xff00ff));
										i_1061_ = ((i_1063_ & 0x1000100) + (i_1062_ - i_1063_ & 0x10000));
										is[i_1002_] = (i_1062_ - i_1061_ | i_1061_ - (i_1061_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_997_ += anInt9340;
							i_998_ += anInt9341;
						}
						i_995_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_1064_ = anInt9356;
					while (i_1064_ < 0) {
						int i_1065_ = anInt9339;
						int i_1066_ = anInt9346 + anInt9348;
						int i_1067_ = anInt9324 + anInt9349;
						int i_1068_ = anInt9347;
						int i_1069_;
						if ((i_1069_ = i_1066_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) >= 0) {
							i_1069_ = (anInt9340 - i_1069_) / anInt9340;
							i_1068_ += i_1069_;
							i_1066_ += anInt9340 * i_1069_;
							i_1067_ += anInt9341 * i_1069_;
							i_1065_ += i_1069_;
						}
						if ((i_1069_ = (i_1066_ - anInt9340) / anInt9340) > i_1068_)
							i_1068_ = i_1069_;
						if (i_1067_ < 0) {
							i_1069_ = (anInt9341 - 1 - i_1067_) / anInt9341;
							i_1068_ += i_1069_;
							i_1066_ += anInt9340 * i_1069_;
							i_1067_ += anInt9341 * i_1069_;
							i_1065_ += i_1069_;
						}
						if ((i_1069_ = (1 + i_1067_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_1068_)
							i_1068_ = i_1069_;
						for (/**/; i_1068_ < 0; i_1068_++) {
							int i_1070_ = (((i_1067_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_1066_ >> 12));
							int i_1071_ = i_1065_++;
							if (i_718_ == 0) {
								if (i == 1)
									is[i_1071_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]) & 0xff]);
								else if (i == 0) {
									int i_1072_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]) & 0xff]);
									int i_1073_ = ((i_1072_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_1074_ = ((i_1072_ & 0xff00) * anInt9354 & 0xff0000);
									int i_1075_ = ((i_1072_ & 0xff) * anInt9333 & 0xff00);
									is[i_1071_] = (i_1073_ | i_1074_ | i_1075_) >>> 8;
								} else if (i == 3) {
									int i_1076_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]) & 0xff]);
									int i_1077_ = anInt9350;
									int i_1078_ = i_1076_ + i_1077_;
									int i_1079_ = ((i_1076_ & 0xff00ff) + (i_1077_ & 0xff00ff));
									int i_1080_ = ((i_1079_ & 0x1000100) + (i_1078_ - i_1079_ & 0x10000));
									is[i_1071_] = (i_1078_ - i_1080_ | i_1080_ - (i_1080_ >>> 8));
								} else if (i == 2) {
									int i_1081_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]) & 0xff]);
									int i_1082_ = ((i_1081_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_1083_ = ((i_1081_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_1071_] = (((i_1082_ | i_1083_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_718_ == 1) {
								if (i == 1) {
									int i_1084_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									if (i_1084_ != 0)
										is[i_1071_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1084_ & 0xff]);
								} else if (i == 0) {
									int i_1085_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									if (i_1085_ != 0) {
										int i_1086_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1085_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_1087_ = anInt9350 >>> 24;
											int i_1088_ = 256 - i_1087_;
											int i_1089_ = is[i_1071_];
											is[i_1071_] = (((((i_1086_ & 0xff00ff) * i_1087_) + ((i_1089_ & 0xff00ff) * i_1088_)) & ~0xff00ff) + ((((i_1086_ & 0xff00) * i_1087_) + ((i_1089_ & 0xff00) * i_1088_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_1090_ = (((i_1086_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_1091_ = (((i_1086_ & 0xff00) * anInt9354) & 0xff0000);
											int i_1092_ = ((i_1086_ & 0xff) * anInt9333 & 0xff00);
											i_1086_ = (i_1090_ | i_1091_ | i_1092_) >>> 8;
											int i_1093_ = is[i_1071_];
											is[i_1071_] = (((((i_1086_ & 0xff00ff) * anInt9351) + ((i_1093_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1086_ & 0xff00) * anInt9351) + ((i_1093_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_1094_ = (((i_1086_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_1095_ = (((i_1086_ & 0xff00) * anInt9354) & 0xff0000);
											int i_1096_ = ((i_1086_ & 0xff) * anInt9333 & 0xff00);
											is[i_1071_] = (i_1094_ | i_1095_ | i_1096_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1097_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									int i_1098_ = (i_1097_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1097_]) : 0);
									int i_1099_ = anInt9350;
									int i_1100_ = i_1098_ + i_1099_;
									int i_1101_ = ((i_1098_ & 0xff00ff) + (i_1099_ & 0xff00ff));
									int i_1102_ = ((i_1101_ & 0x1000100) + (i_1100_ - i_1101_ & 0x10000));
									i_1102_ = (i_1100_ - i_1102_ | i_1102_ - (i_1102_ >>> 8));
									if (i_1098_ == 0 && anInt9351 != 255) {
										i_1098_ = i_1102_;
										i_1102_ = is[i_1071_];
										i_1102_ = (((((i_1098_ & 0xff00ff) * anInt9351) + ((i_1102_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1098_ & 0xff00) * anInt9351) + ((i_1102_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_1071_] = i_1102_;
								} else if (i == 2) {
									int i_1103_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									if (i_1103_ != 0) {
										int i_1104_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1103_ & 0xff]);
										int i_1105_ = ((i_1104_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_1106_ = ((i_1104_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_1071_++] = ((i_1105_ | i_1106_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_718_ == 2) {
								if (i == 1) {
									int i_1107_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									if (i_1107_ != 0) {
										int i_1108_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1107_ & 0xff]);
										int i_1109_ = is[i_1071_];
										int i_1110_ = i_1108_ + i_1109_;
										int i_1111_ = ((i_1108_ & 0xff00ff) + (i_1109_ & 0xff00ff));
										i_1109_ = ((i_1111_ & 0x1000100) + (i_1110_ - i_1111_ & 0x10000));
										is[i_1071_] = (i_1110_ - i_1109_ | i_1109_ - (i_1109_ >>> 8));
									}
								} else if (i == 0) {
									int i_1112_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									if (i_1112_ != 0) {
										int i_1113_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1112_ & 0xff]);
										int i_1114_ = ((i_1113_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_1115_ = ((i_1113_ & 0xff00) * anInt9354 & 0xff0000);
										int i_1116_ = ((i_1113_ & 0xff) * anInt9333 & 0xff00);
										i_1113_ = (i_1114_ | i_1115_ | i_1116_) >>> 8;
										int i_1117_ = is[i_1071_];
										int i_1118_ = i_1113_ + i_1117_;
										int i_1119_ = ((i_1113_ & 0xff00ff) + (i_1117_ & 0xff00ff));
										i_1117_ = ((i_1119_ & 0x1000100) + (i_1118_ - i_1119_ & 0x10000));
										is[i_1071_] = (i_1118_ - i_1117_ | i_1117_ - (i_1117_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1120_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									int i_1121_ = (i_1120_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1120_]) : 0);
									int i_1122_ = anInt9350;
									int i_1123_ = i_1121_ + i_1122_;
									int i_1124_ = ((i_1121_ & 0xff00ff) + (i_1122_ & 0xff00ff));
									int i_1125_ = ((i_1124_ & 0x1000100) + (i_1123_ - i_1124_ & 0x10000));
									i_1125_ = (i_1123_ - i_1125_ | i_1125_ - (i_1125_ >>> 8));
									if (i_1121_ == 0 && anInt9351 != 255) {
										i_1121_ = i_1125_;
										i_1125_ = is[i_1071_];
										i_1125_ = (((((i_1121_ & 0xff00ff) * anInt9351) + ((i_1125_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1121_ & 0xff00) * anInt9351) + ((i_1125_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_1071_] = i_1125_;
								} else if (i == 2) {
									int i_1126_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1070_]);
									if (i_1126_ != 0) {
										int i_1127_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1126_ & 0xff]);
										int i_1128_ = ((i_1127_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_1129_ = ((i_1127_ & 0xff00) * anInt9351 & 0xff0000);
										i_1127_ = (((i_1128_ | i_1129_) >>> 8) + anInt9323);
										int i_1130_ = is[i_1071_];
										int i_1131_ = i_1127_ + i_1130_;
										int i_1132_ = ((i_1127_ & 0xff00ff) + (i_1130_ & 0xff00ff));
										i_1130_ = ((i_1132_ & 0x1000100) + (i_1131_ - i_1132_ & 0x10000));
										is[i_1071_] = (i_1131_ - i_1130_ | i_1130_ - (i_1130_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1066_ += anInt9340;
							i_1067_ += anInt9341;
						}
						i_1064_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_1133_ = anInt9356;
				while (i_1133_ < 0) {
					int i_1134_ = anInt9339;
					int i_1135_ = anInt9346 + anInt9348;
					int i_1136_ = anInt9324;
					int i_1137_ = anInt9347;
					if (i_1136_ >= 0 && i_1136_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
						if (i_1135_ < 0) {
							int i_1138_ = (anInt9340 - 1 - i_1135_) / anInt9340;
							i_1137_ += i_1138_;
							i_1135_ += anInt9340 * i_1138_;
							i_1134_ += i_1138_;
						}
						int i_1139_;
						if ((i_1139_ = (1 + i_1135_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_1137_)
							i_1137_ = i_1139_;
						for (/**/; i_1137_ < 0; i_1137_++) {
							int i_1140_ = (((i_1136_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_1135_ >> 12));
							int i_1141_ = i_1134_++;
							if (i_718_ == 0) {
								if (i == 1)
									is[i_1141_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]) & 0xff]);
								else if (i == 0) {
									int i_1142_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]) & 0xff]);
									int i_1143_ = ((i_1142_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_1144_ = ((i_1142_ & 0xff00) * anInt9354 & 0xff0000);
									int i_1145_ = ((i_1142_ & 0xff) * anInt9333 & 0xff00);
									is[i_1141_] = (i_1143_ | i_1144_ | i_1145_) >>> 8;
								} else if (i == 3) {
									int i_1146_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]) & 0xff]);
									int i_1147_ = anInt9350;
									int i_1148_ = i_1146_ + i_1147_;
									int i_1149_ = ((i_1146_ & 0xff00ff) + (i_1147_ & 0xff00ff));
									int i_1150_ = ((i_1149_ & 0x1000100) + (i_1148_ - i_1149_ & 0x10000));
									is[i_1141_] = (i_1148_ - i_1150_ | i_1150_ - (i_1150_ >>> 8));
								} else if (i == 2) {
									int i_1151_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]) & 0xff]);
									int i_1152_ = ((i_1151_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_1153_ = ((i_1151_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_1141_] = (((i_1152_ | i_1153_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_718_ == 1) {
								if (i == 1) {
									int i_1154_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									if (i_1154_ != 0)
										is[i_1141_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1154_ & 0xff]);
								} else if (i == 0) {
									int i_1155_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									if (i_1155_ != 0) {
										int i_1156_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1155_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_1157_ = anInt9350 >>> 24;
											int i_1158_ = 256 - i_1157_;
											int i_1159_ = is[i_1141_];
											is[i_1141_] = (((((i_1156_ & 0xff00ff) * i_1157_) + ((i_1159_ & 0xff00ff) * i_1158_)) & ~0xff00ff) + ((((i_1156_ & 0xff00) * i_1157_) + ((i_1159_ & 0xff00) * i_1158_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_1160_ = (((i_1156_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_1161_ = (((i_1156_ & 0xff00) * anInt9354) & 0xff0000);
											int i_1162_ = ((i_1156_ & 0xff) * anInt9333 & 0xff00);
											i_1156_ = (i_1160_ | i_1161_ | i_1162_) >>> 8;
											int i_1163_ = is[i_1141_];
											is[i_1141_] = (((((i_1156_ & 0xff00ff) * anInt9351) + ((i_1163_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1156_ & 0xff00) * anInt9351) + ((i_1163_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_1164_ = (((i_1156_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_1165_ = (((i_1156_ & 0xff00) * anInt9354) & 0xff0000);
											int i_1166_ = ((i_1156_ & 0xff) * anInt9333 & 0xff00);
											is[i_1141_] = (i_1164_ | i_1165_ | i_1166_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1167_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									int i_1168_ = (i_1167_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1167_]) : 0);
									int i_1169_ = anInt9350;
									int i_1170_ = i_1168_ + i_1169_;
									int i_1171_ = ((i_1168_ & 0xff00ff) + (i_1169_ & 0xff00ff));
									int i_1172_ = ((i_1171_ & 0x1000100) + (i_1170_ - i_1171_ & 0x10000));
									i_1172_ = (i_1170_ - i_1172_ | i_1172_ - (i_1172_ >>> 8));
									if (i_1168_ == 0 && anInt9351 != 255) {
										i_1168_ = i_1172_;
										i_1172_ = is[i_1141_];
										i_1172_ = (((((i_1168_ & 0xff00ff) * anInt9351) + ((i_1172_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1168_ & 0xff00) * anInt9351) + ((i_1172_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_1141_] = i_1172_;
								} else if (i == 2) {
									int i_1173_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									if (i_1173_ != 0) {
										int i_1174_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1173_ & 0xff]);
										int i_1175_ = ((i_1174_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_1176_ = ((i_1174_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_1141_++] = ((i_1175_ | i_1176_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_718_ == 2) {
								if (i == 1) {
									int i_1177_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									if (i_1177_ != 0) {
										int i_1178_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1177_ & 0xff]);
										int i_1179_ = is[i_1141_];
										int i_1180_ = i_1178_ + i_1179_;
										int i_1181_ = ((i_1178_ & 0xff00ff) + (i_1179_ & 0xff00ff));
										i_1179_ = ((i_1181_ & 0x1000100) + (i_1180_ - i_1181_ & 0x10000));
										is[i_1141_] = (i_1180_ - i_1179_ | i_1179_ - (i_1179_ >>> 8));
									}
								} else if (i == 0) {
									int i_1182_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									if (i_1182_ != 0) {
										int i_1183_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1182_ & 0xff]);
										int i_1184_ = ((i_1183_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_1185_ = ((i_1183_ & 0xff00) * anInt9354 & 0xff0000);
										int i_1186_ = ((i_1183_ & 0xff) * anInt9333 & 0xff00);
										i_1183_ = (i_1184_ | i_1185_ | i_1186_) >>> 8;
										int i_1187_ = is[i_1141_];
										int i_1188_ = i_1183_ + i_1187_;
										int i_1189_ = ((i_1183_ & 0xff00ff) + (i_1187_ & 0xff00ff));
										i_1187_ = ((i_1189_ & 0x1000100) + (i_1188_ - i_1189_ & 0x10000));
										is[i_1141_] = (i_1188_ - i_1187_ | i_1187_ - (i_1187_ >>> 8));
									}
								} else if (i == 3) {
									byte i_1190_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									int i_1191_ = (i_1190_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1190_]) : 0);
									int i_1192_ = anInt9350;
									int i_1193_ = i_1191_ + i_1192_;
									int i_1194_ = ((i_1191_ & 0xff00ff) + (i_1192_ & 0xff00ff));
									int i_1195_ = ((i_1194_ & 0x1000100) + (i_1193_ - i_1194_ & 0x10000));
									i_1195_ = (i_1193_ - i_1195_ | i_1195_ - (i_1195_ >>> 8));
									if (i_1191_ == 0 && anInt9351 != 255) {
										i_1191_ = i_1195_;
										i_1195_ = is[i_1141_];
										i_1195_ = (((((i_1191_ & 0xff00ff) * anInt9351) + ((i_1195_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1191_ & 0xff00) * anInt9351) + ((i_1195_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_1141_] = i_1195_;
								} else if (i == 2) {
									int i_1196_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1140_]);
									if (i_1196_ != 0) {
										int i_1197_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1196_ & 0xff]);
										int i_1198_ = ((i_1197_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_1199_ = ((i_1197_ & 0xff00) * anInt9351 & 0xff0000);
										i_1197_ = (((i_1198_ | i_1199_) >>> 8) + anInt9323);
										int i_1200_ = is[i_1141_];
										int i_1201_ = i_1197_ + i_1200_;
										int i_1202_ = ((i_1197_ & 0xff00ff) + (i_1200_ & 0xff00ff));
										i_1200_ = ((i_1202_ & 0x1000100) + (i_1201_ - i_1202_ & 0x10000));
										is[i_1141_] = (i_1201_ - i_1200_ | i_1200_ - (i_1200_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_1135_ += anInt9340;
						}
					}
					i_1133_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_1203_ = anInt9356; i_1203_ < 0; i_1203_++) {
					int i_1204_ = anInt9339;
					int i_1205_ = anInt9346 + anInt9348;
					int i_1206_ = anInt9324 + anInt9349;
					int i_1207_ = anInt9347;
					if (i_1205_ < 0) {
						int i_1208_ = (anInt9340 - 1 - i_1205_) / anInt9340;
						i_1207_ += i_1208_;
						i_1205_ += anInt9340 * i_1208_;
						i_1206_ += anInt9341 * i_1208_;
						i_1204_ += i_1208_;
					}
					int i_1209_;
					if ((i_1209_ = (1 + i_1205_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_1207_)
						i_1207_ = i_1209_;
					if ((i_1209_ = i_1206_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
						i_1209_ = (anInt9341 - i_1209_) / anInt9341;
						i_1207_ += i_1209_;
						i_1205_ += anInt9340 * i_1209_;
						i_1206_ += anInt9341 * i_1209_;
						i_1204_ += i_1209_;
					}
					if ((i_1209_ = (i_1206_ - anInt9341) / anInt9341) > i_1207_)
						i_1207_ = i_1209_;
					for (/**/; i_1207_ < 0; i_1207_++) {
						int i_1210_ = (((i_1206_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_1205_ >> 12));
						int i_1211_ = i_1204_++;
						if (i_718_ == 0) {
							if (i == 1)
								is[i_1211_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]) & 0xff]);
							else if (i == 0) {
								int i_1212_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]) & 0xff]);
								int i_1213_ = ((i_1212_ & 0xff0000) * anInt9353 & ~0xffffff);
								int i_1214_ = ((i_1212_ & 0xff00) * anInt9354 & 0xff0000);
								int i_1215_ = (i_1212_ & 0xff) * anInt9333 & 0xff00;
								is[i_1211_] = (i_1213_ | i_1214_ | i_1215_) >>> 8;
							} else if (i == 3) {
								int i_1216_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]) & 0xff]);
								int i_1217_ = anInt9350;
								int i_1218_ = i_1216_ + i_1217_;
								int i_1219_ = ((i_1216_ & 0xff00ff) + (i_1217_ & 0xff00ff));
								int i_1220_ = ((i_1219_ & 0x1000100) + (i_1218_ - i_1219_ & 0x10000));
								is[i_1211_] = i_1218_ - i_1220_ | i_1220_ - (i_1220_ >>> 8);
							} else if (i == 2) {
								int i_1221_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]) & 0xff]);
								int i_1222_ = ((i_1221_ & 0xff00ff) * anInt9351 & ~0xff00ff);
								int i_1223_ = ((i_1221_ & 0xff00) * anInt9351 & 0xff0000);
								is[i_1211_] = ((i_1222_ | i_1223_) >>> 8) + anInt9323;
							} else
								throw new IllegalArgumentException();
						} else if (i_718_ == 1) {
							if (i == 1) {
								int i_1224_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								if (i_1224_ != 0)
									is[i_1211_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1224_ & 0xff]);
							} else if (i == 0) {
								int i_1225_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								if (i_1225_ != 0) {
									int i_1226_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1225_ & 0xff]);
									if ((anInt9350 & 0xffffff) == 16777215) {
										int i_1227_ = anInt9350 >>> 24;
										int i_1228_ = 256 - i_1227_;
										int i_1229_ = is[i_1211_];
										is[i_1211_] = ((((i_1226_ & 0xff00ff) * i_1227_ + ((i_1229_ & 0xff00ff) * i_1228_)) & ~0xff00ff) + (((i_1226_ & 0xff00) * i_1227_ + ((i_1229_ & 0xff00) * i_1228_)) & 0xff0000)) >> 8;
									} else if (anInt9351 != 255) {
										int i_1230_ = ((i_1226_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_1231_ = ((i_1226_ & 0xff00) * anInt9354 & 0xff0000);
										int i_1232_ = ((i_1226_ & 0xff) * anInt9333 & 0xff00);
										i_1226_ = (i_1230_ | i_1231_ | i_1232_) >>> 8;
										int i_1233_ = is[i_1211_];
										is[i_1211_] = (((((i_1226_ & 0xff00ff) * anInt9351) + ((i_1233_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1226_ & 0xff00) * anInt9351) + ((i_1233_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									} else {
										int i_1234_ = ((i_1226_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_1235_ = ((i_1226_ & 0xff00) * anInt9354 & 0xff0000);
										int i_1236_ = ((i_1226_ & 0xff) * anInt9333 & 0xff00);
										is[i_1211_] = (i_1234_ | i_1235_ | i_1236_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1237_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								int i_1238_ = (i_1237_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1237_]) : 0);
								int i_1239_ = anInt9350;
								int i_1240_ = i_1238_ + i_1239_;
								int i_1241_ = ((i_1238_ & 0xff00ff) + (i_1239_ & 0xff00ff));
								int i_1242_ = ((i_1241_ & 0x1000100) + (i_1240_ - i_1241_ & 0x10000));
								i_1242_ = i_1240_ - i_1242_ | i_1242_ - (i_1242_ >>> 8);
								if (i_1238_ == 0 && anInt9351 != 255) {
									i_1238_ = i_1242_;
									i_1242_ = is[i_1211_];
									i_1242_ = ((((i_1238_ & 0xff00ff) * anInt9351 + ((i_1242_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_1238_ & 0xff00) * anInt9351 + ((i_1242_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_1211_] = i_1242_;
							} else if (i == 2) {
								int i_1243_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								if (i_1243_ != 0) {
									int i_1244_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1243_ & 0xff]);
									int i_1245_ = ((i_1244_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_1246_ = ((i_1244_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_1211_++] = ((i_1245_ | i_1246_) >>> 8) + anInt9323;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_718_ == 2) {
							if (i == 1) {
								int i_1247_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								if (i_1247_ != 0) {
									int i_1248_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1247_ & 0xff]);
									int i_1249_ = is[i_1211_];
									int i_1250_ = i_1248_ + i_1249_;
									int i_1251_ = ((i_1248_ & 0xff00ff) + (i_1249_ & 0xff00ff));
									i_1249_ = ((i_1251_ & 0x1000100) + (i_1250_ - i_1251_ & 0x10000));
									is[i_1211_] = (i_1250_ - i_1249_ | i_1249_ - (i_1249_ >>> 8));
								}
							} else if (i == 0) {
								int i_1252_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								if (i_1252_ != 0) {
									int i_1253_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1252_ & 0xff]);
									int i_1254_ = ((i_1253_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_1255_ = ((i_1253_ & 0xff00) * anInt9354 & 0xff0000);
									int i_1256_ = ((i_1253_ & 0xff) * anInt9333 & 0xff00);
									i_1253_ = (i_1254_ | i_1255_ | i_1256_) >>> 8;
									int i_1257_ = is[i_1211_];
									int i_1258_ = i_1253_ + i_1257_;
									int i_1259_ = ((i_1253_ & 0xff00ff) + (i_1257_ & 0xff00ff));
									i_1257_ = ((i_1259_ & 0x1000100) + (i_1258_ - i_1259_ & 0x10000));
									is[i_1211_] = (i_1258_ - i_1257_ | i_1257_ - (i_1257_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1260_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								int i_1261_ = (i_1260_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1260_]) : 0);
								int i_1262_ = anInt9350;
								int i_1263_ = i_1261_ + i_1262_;
								int i_1264_ = ((i_1261_ & 0xff00ff) + (i_1262_ & 0xff00ff));
								int i_1265_ = ((i_1264_ & 0x1000100) + (i_1263_ - i_1264_ & 0x10000));
								i_1265_ = i_1263_ - i_1265_ | i_1265_ - (i_1265_ >>> 8);
								if (i_1261_ == 0 && anInt9351 != 255) {
									i_1261_ = i_1265_;
									i_1265_ = is[i_1211_];
									i_1265_ = ((((i_1261_ & 0xff00ff) * anInt9351 + ((i_1265_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_1261_ & 0xff00) * anInt9351 + ((i_1265_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_1211_] = i_1265_;
							} else if (i == 2) {
								int i_1266_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1210_]);
								if (i_1266_ != 0) {
									int i_1267_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1266_ & 0xff]);
									int i_1268_ = ((i_1267_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_1269_ = ((i_1267_ & 0xff00) * anInt9351 & 0xff0000);
									i_1267_ = (((i_1268_ | i_1269_) >>> 8) + anInt9323);
									int i_1270_ = is[i_1211_];
									int i_1271_ = i_1267_ + i_1270_;
									int i_1272_ = ((i_1267_ & 0xff00ff) + (i_1270_ & 0xff00ff));
									i_1270_ = ((i_1272_ & 0x1000100) + (i_1271_ - i_1272_ & 0x10000));
									is[i_1211_] = (i_1271_ - i_1270_ | i_1270_ - (i_1270_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1205_ += anInt9340;
						i_1206_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_1273_ = anInt9356; i_1273_ < 0; i_1273_++) {
					int i_1274_ = anInt9339;
					int i_1275_ = anInt9346 + anInt9348;
					int i_1276_ = anInt9324 + anInt9349;
					int i_1277_ = anInt9347;
					if (i_1275_ < 0) {
						int i_1278_ = (anInt9340 - 1 - i_1275_) / anInt9340;
						i_1277_ += i_1278_;
						i_1275_ += anInt9340 * i_1278_;
						i_1276_ += anInt9341 * i_1278_;
						i_1274_ += i_1278_;
					}
					int i_1279_;
					if ((i_1279_ = (1 + i_1275_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_1277_)
						i_1277_ = i_1279_;
					if (i_1276_ < 0) {
						i_1279_ = (anInt9341 - 1 - i_1276_) / anInt9341;
						i_1277_ += i_1279_;
						i_1275_ += anInt9340 * i_1279_;
						i_1276_ += anInt9341 * i_1279_;
						i_1274_ += i_1279_;
					}
					if ((i_1279_ = (1 + i_1276_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_1277_)
						i_1277_ = i_1279_;
					for (/**/; i_1277_ < 0; i_1277_++) {
						int i_1280_ = (((i_1276_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_1275_ >> 12));
						int i_1281_ = i_1274_++;
						if (i_718_ == 0) {
							if (i == 1)
								is[i_1281_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]) & 0xff]);
							else if (i == 0) {
								int i_1282_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]) & 0xff]);
								int i_1283_ = ((i_1282_ & 0xff0000) * anInt9353 & ~0xffffff);
								int i_1284_ = ((i_1282_ & 0xff00) * anInt9354 & 0xff0000);
								int i_1285_ = (i_1282_ & 0xff) * anInt9333 & 0xff00;
								is[i_1281_] = (i_1283_ | i_1284_ | i_1285_) >>> 8;
							} else if (i == 3) {
								int i_1286_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]) & 0xff]);
								int i_1287_ = anInt9350;
								int i_1288_ = i_1286_ + i_1287_;
								int i_1289_ = ((i_1286_ & 0xff00ff) + (i_1287_ & 0xff00ff));
								int i_1290_ = ((i_1289_ & 0x1000100) + (i_1288_ - i_1289_ & 0x10000));
								is[i_1281_] = i_1288_ - i_1290_ | i_1290_ - (i_1290_ >>> 8);
							} else if (i == 2) {
								int i_1291_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]) & 0xff]);
								int i_1292_ = ((i_1291_ & 0xff00ff) * anInt9351 & ~0xff00ff);
								int i_1293_ = ((i_1291_ & 0xff00) * anInt9351 & 0xff0000);
								is[i_1281_] = ((i_1292_ | i_1293_) >>> 8) + anInt9323;
							} else
								throw new IllegalArgumentException();
						} else if (i_718_ == 1) {
							if (i == 1) {
								int i_1294_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								if (i_1294_ != 0)
									is[i_1281_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1294_ & 0xff]);
							} else if (i == 0) {
								int i_1295_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								if (i_1295_ != 0) {
									int i_1296_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1295_ & 0xff]);
									if ((anInt9350 & 0xffffff) == 16777215) {
										int i_1297_ = anInt9350 >>> 24;
										int i_1298_ = 256 - i_1297_;
										int i_1299_ = is[i_1281_];
										is[i_1281_] = ((((i_1296_ & 0xff00ff) * i_1297_ + ((i_1299_ & 0xff00ff) * i_1298_)) & ~0xff00ff) + (((i_1296_ & 0xff00) * i_1297_ + ((i_1299_ & 0xff00) * i_1298_)) & 0xff0000)) >> 8;
									} else if (anInt9351 != 255) {
										int i_1300_ = ((i_1296_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_1301_ = ((i_1296_ & 0xff00) * anInt9354 & 0xff0000);
										int i_1302_ = ((i_1296_ & 0xff) * anInt9333 & 0xff00);
										i_1296_ = (i_1300_ | i_1301_ | i_1302_) >>> 8;
										int i_1303_ = is[i_1281_];
										is[i_1281_] = (((((i_1296_ & 0xff00ff) * anInt9351) + ((i_1303_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_1296_ & 0xff00) * anInt9351) + ((i_1303_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									} else {
										int i_1304_ = ((i_1296_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_1305_ = ((i_1296_ & 0xff00) * anInt9354 & 0xff0000);
										int i_1306_ = ((i_1296_ & 0xff) * anInt9333 & 0xff00);
										is[i_1281_] = (i_1304_ | i_1305_ | i_1306_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1307_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								int i_1308_ = (i_1307_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1307_]) : 0);
								int i_1309_ = anInt9350;
								int i_1310_ = i_1308_ + i_1309_;
								int i_1311_ = ((i_1308_ & 0xff00ff) + (i_1309_ & 0xff00ff));
								int i_1312_ = ((i_1311_ & 0x1000100) + (i_1310_ - i_1311_ & 0x10000));
								i_1312_ = i_1310_ - i_1312_ | i_1312_ - (i_1312_ >>> 8);
								if (i_1308_ == 0 && anInt9351 != 255) {
									i_1308_ = i_1312_;
									i_1312_ = is[i_1281_];
									i_1312_ = ((((i_1308_ & 0xff00ff) * anInt9351 + ((i_1312_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_1308_ & 0xff00) * anInt9351 + ((i_1312_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_1281_] = i_1312_;
							} else if (i == 2) {
								int i_1313_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								if (i_1313_ != 0) {
									int i_1314_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1313_ & 0xff]);
									int i_1315_ = ((i_1314_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_1316_ = ((i_1314_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_1281_++] = ((i_1315_ | i_1316_) >>> 8) + anInt9323;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_718_ == 2) {
							if (i == 1) {
								int i_1317_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								if (i_1317_ != 0) {
									int i_1318_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1317_ & 0xff]);
									int i_1319_ = is[i_1281_];
									int i_1320_ = i_1318_ + i_1319_;
									int i_1321_ = ((i_1318_ & 0xff00ff) + (i_1319_ & 0xff00ff));
									i_1319_ = ((i_1321_ & 0x1000100) + (i_1320_ - i_1321_ & 0x10000));
									is[i_1281_] = (i_1320_ - i_1319_ | i_1319_ - (i_1319_ >>> 8));
								}
							} else if (i == 0) {
								int i_1322_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								if (i_1322_ != 0) {
									int i_1323_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1322_ & 0xff]);
									int i_1324_ = ((i_1323_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_1325_ = ((i_1323_ & 0xff00) * anInt9354 & 0xff0000);
									int i_1326_ = ((i_1323_ & 0xff) * anInt9333 & 0xff00);
									i_1323_ = (i_1324_ | i_1325_ | i_1326_) >>> 8;
									int i_1327_ = is[i_1281_];
									int i_1328_ = i_1323_ + i_1327_;
									int i_1329_ = ((i_1323_ & 0xff00ff) + (i_1327_ & 0xff00ff));
									i_1327_ = ((i_1329_ & 0x1000100) + (i_1328_ - i_1329_ & 0x10000));
									is[i_1281_] = (i_1328_ - i_1327_ | i_1327_ - (i_1327_ >>> 8));
								}
							} else if (i == 3) {
								byte i_1330_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								int i_1331_ = (i_1330_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1330_]) : 0);
								int i_1332_ = anInt9350;
								int i_1333_ = i_1331_ + i_1332_;
								int i_1334_ = ((i_1331_ & 0xff00ff) + (i_1332_ & 0xff00ff));
								int i_1335_ = ((i_1334_ & 0x1000100) + (i_1333_ - i_1334_ & 0x10000));
								i_1335_ = i_1333_ - i_1335_ | i_1335_ - (i_1335_ >>> 8);
								if (i_1331_ == 0 && anInt9351 != 255) {
									i_1331_ = i_1335_;
									i_1335_ = is[i_1281_];
									i_1335_ = ((((i_1331_ & 0xff00ff) * anInt9351 + ((i_1335_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_1331_ & 0xff00) * anInt9351 + ((i_1335_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_1281_] = i_1335_;
							} else if (i == 2) {
								int i_1336_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1280_]);
								if (i_1336_ != 0) {
									int i_1337_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1336_ & 0xff]);
									int i_1338_ = ((i_1337_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_1339_ = ((i_1337_ & 0xff00) * anInt9351 & 0xff0000);
									i_1337_ = (((i_1338_ | i_1339_) >>> 8) + anInt9323);
									int i_1340_ = is[i_1281_];
									int i_1341_ = i_1337_ + i_1340_;
									int i_1342_ = ((i_1337_ & 0xff00ff) + (i_1340_ & 0xff00ff));
									i_1340_ = ((i_1342_ & 0x1000100) + (i_1341_ - i_1342_ & 0x10000));
									is[i_1281_] = (i_1341_ - i_1340_ | i_1340_ - (i_1340_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_1275_ += anInt9340;
						i_1276_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	public void method704(int i, int i_1343_, int i_1344_, int i_1345_, int i_1346_, int i_1347_) {
		throw new IllegalStateException();
	}

	public Interface8_Impl1_Impl2 method684() {
		throw new IllegalStateException();
	}

	public void method700(int i, int i_1348_, int i_1349_, int i_1350_, int i_1351_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			int i_1352_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
			i += ((Class61_Sub3_Sub3) this).anInt9352;
			i_1348_ += ((Class61_Sub3_Sub3) this).anInt9327;
			int i_1353_ = i_1348_ * i_1352_ + i;
			int i_1354_ = 0;
			int i_1355_ = ((Class61_Sub3_Sub3) this).anInt9325;
			int i_1356_ = ((Class61_Sub3_Sub3) this).anInt9358;
			int i_1357_ = i_1352_ - i_1356_;
			int i_1358_ = 0;
			if (i_1348_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_1359_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1348_);
				i_1355_ -= i_1359_;
				i_1348_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
				i_1354_ += i_1359_ * i_1356_;
				i_1353_ += i_1359_ * i_1352_;
			}
			if (i_1348_ + i_1355_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_1355_ -= (i_1348_ + i_1355_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_1360_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_1356_ -= i_1360_;
				i = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825);
				i_1354_ += i_1360_;
				i_1353_ += i_1360_;
				i_1358_ += i_1360_;
				i_1357_ += i_1360_;
			}
			if (i + i_1356_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_1361_ = (i + i_1356_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_1356_ -= i_1361_;
				i_1358_ += i_1361_;
				i_1357_ += i_1361_;
			}
			if (i_1356_ > 0 && i_1355_ > 0) {
				if (i_1351_ == 0) {
					if (i_1349_ == 1) {
						for (int i_1362_ = -i_1355_; i_1362_ < 0; i_1362_++) {
							int i_1363_ = i_1353_ + i_1356_ - 3;
							while (i_1353_ < i_1363_) {
								is[i_1353_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
								is[i_1353_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
								is[i_1353_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
								is[i_1353_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
							}
							i_1363_ += 3;
							while (i_1353_ < i_1363_)
								is[i_1353_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 0) {
						int i_1364_ = (i_1350_ & 0xff0000) >> 16;
						int i_1365_ = (i_1350_ & 0xff00) >> 8;
						int i_1366_ = i_1350_ & 0xff;
						for (int i_1367_ = -i_1355_; i_1367_ < 0; i_1367_++) {
							for (int i_1368_ = -i_1356_; i_1368_ < 0; i_1368_++) {
								int i_1369_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
								int i_1370_ = ((i_1369_ & 0xff0000) * i_1364_ & ~0xffffff);
								int i_1371_ = (i_1369_ & 0xff00) * i_1365_ & 0xff0000;
								int i_1372_ = (i_1369_ & 0xff) * i_1366_ & 0xff00;
								is[i_1353_++] = (i_1370_ | i_1371_ | i_1372_) >>> 8;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 3) {
						for (int i_1373_ = -i_1355_; i_1373_ < 0; i_1373_++) {
							for (int i_1374_ = -i_1356_; i_1374_ < 0; i_1374_++) {
								int i_1375_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
								int i_1376_ = i_1375_ + i_1350_;
								int i_1377_ = ((i_1375_ & 0xff00ff) + (i_1350_ & 0xff00ff));
								int i_1378_ = ((i_1377_ & 0x1000100) + (i_1376_ - i_1377_ & 0x10000));
								is[i_1353_++] = i_1376_ - i_1378_ | i_1378_ - (i_1378_ >>> 8);
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 2) {
						int i_1379_ = i_1350_ >>> 24;
						int i_1380_ = 256 - i_1379_;
						int i_1381_ = (i_1350_ & 0xff00ff) * i_1380_ & ~0xff00ff;
						int i_1382_ = (i_1350_ & 0xff00) * i_1380_ & 0xff0000;
						i_1350_ = (i_1381_ | i_1382_) >>> 8;
						for (int i_1383_ = -i_1355_; i_1383_ < 0; i_1383_++) {
							for (int i_1384_ = -i_1356_; i_1384_ < 0; i_1384_++) {
								int i_1385_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]) & 0xff]);
								i_1381_ = ((i_1385_ & 0xff00ff) * i_1379_ & ~0xff00ff);
								i_1382_ = (i_1385_ & 0xff00) * i_1379_ & 0xff0000;
								is[i_1353_++] = ((i_1381_ | i_1382_) >>> 8) + i_1350_;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1351_ == 1) {
					if (i_1349_ == 1) {
						for (int i_1386_ = -i_1355_; i_1386_ < 0; i_1386_++) {
							for (int i_1387_ = -i_1356_; i_1387_ < 0; i_1387_++) {
								int i_1388_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
								if (i_1388_ != 0) {
									int i_1389_ = ((((Class61_Sub3_Sub3) this).anIntArray10096[i_1388_ & 0xff]) | ~0xffffff);
									int i_1390_ = 255;
									int i_1391_ = 0;
									int i_1392_ = is[i_1353_];
									is[i_1353_++] = (((((i_1389_ & 0xff00ff) * i_1390_ + (i_1392_ & 0xff00ff) * i_1391_) & ~0xff00ff) >> 8) + (((((i_1389_ & ~0xff00ff) >>> 8) * i_1390_) + (((i_1392_ & ~0xff00ff) >>> 8) * i_1391_)) & ~0xff00ff));
								} else
									i_1353_++;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 0) {
						if ((i_1350_ & 0xffffff) == 16777215) {
							int i_1393_ = i_1350_ >>> 24;
							int i_1394_ = 256 - i_1393_;
							for (int i_1395_ = -i_1355_; i_1395_ < 0; i_1395_++) {
								for (int i_1396_ = -i_1356_; i_1396_ < 0; i_1396_++) {
									int i_1397_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
									if (i_1397_ != 0) {
										int i_1398_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1397_ & 0xff]);
										int i_1399_ = is[i_1353_];
										is[i_1353_++] = ((((i_1398_ & 0xff00ff) * i_1393_ + ((i_1399_ & 0xff00ff) * i_1394_)) & ~0xff00ff) + (((i_1398_ & 0xff00) * i_1393_ + ((i_1399_ & 0xff00) * i_1394_)) & 0xff0000)) >> 8;
									} else
										i_1353_++;
								}
								i_1353_ += i_1357_;
								i_1354_ += i_1358_;
							}
						} else {
							int i_1400_ = (i_1350_ & 0xff0000) >> 16;
							int i_1401_ = (i_1350_ & 0xff00) >> 8;
							int i_1402_ = i_1350_ & 0xff;
							int i_1403_ = i_1350_ >>> 24;
							int i_1404_ = 256 - i_1403_;
							for (int i_1405_ = -i_1355_; i_1405_ < 0; i_1405_++) {
								for (int i_1406_ = -i_1356_; i_1406_ < 0; i_1406_++) {
									int i_1407_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
									if (i_1407_ != 0) {
										int i_1408_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1407_ & 0xff]);
										if (i_1403_ != 255) {
											int i_1409_ = (((i_1408_ & 0xff0000) * i_1400_) & ~0xffffff);
											int i_1410_ = ((i_1408_ & 0xff00) * i_1401_ & 0xff0000);
											int i_1411_ = ((i_1408_ & 0xff) * i_1402_ & 0xff00);
											i_1408_ = (i_1409_ | i_1410_ | i_1411_) >>> 8;
											int i_1412_ = is[i_1353_];
											is[i_1353_++] = (((((i_1408_ & 0xff00ff) * i_1403_) + ((i_1412_ & 0xff00ff) * i_1404_)) & ~0xff00ff) + ((((i_1408_ & 0xff00) * i_1403_) + ((i_1412_ & 0xff00) * i_1404_)) & 0xff0000)) >> 8;
										} else {
											int i_1413_ = (((i_1408_ & 0xff0000) * i_1400_) & ~0xffffff);
											int i_1414_ = ((i_1408_ & 0xff00) * i_1401_ & 0xff0000);
											int i_1415_ = ((i_1408_ & 0xff) * i_1402_ & 0xff00);
											is[i_1353_++] = (i_1413_ | i_1414_ | i_1415_) >>> 8;
										}
									} else
										i_1353_++;
								}
								i_1353_ += i_1357_;
								i_1354_ += i_1358_;
							}
						}
					} else if (i_1349_ == 3) {
						int i_1416_ = i_1350_ >>> 24;
						int i_1417_ = 256 - i_1416_;
						for (int i_1418_ = -i_1355_; i_1418_ < 0; i_1418_++) {
							for (int i_1419_ = -i_1356_; i_1419_ < 0; i_1419_++) {
								byte i_1420_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
								int i_1421_ = (i_1420_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1420_]) : 0);
								int i_1422_ = i_1421_ + i_1350_;
								int i_1423_ = ((i_1421_ & 0xff00ff) + (i_1350_ & 0xff00ff));
								int i_1424_ = ((i_1423_ & 0x1000100) + (i_1422_ - i_1423_ & 0x10000));
								i_1424_ = i_1422_ - i_1424_ | i_1424_ - (i_1424_ >>> 8);
								if (i_1421_ == 0 && i_1416_ != 255) {
									i_1421_ = i_1424_;
									i_1424_ = is[i_1353_];
									i_1424_ = ((((i_1421_ & 0xff00ff) * i_1416_ + (i_1424_ & 0xff00ff) * i_1417_) & ~0xff00ff) + (((i_1421_ & 0xff00) * i_1416_ + (i_1424_ & 0xff00) * i_1417_) & 0xff0000)) >> 8;
								}
								is[i_1353_++] = i_1424_;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 2) {
						int i_1425_ = i_1350_ >>> 24;
						int i_1426_ = 256 - i_1425_;
						int i_1427_ = (i_1350_ & 0xff00ff) * i_1426_ & ~0xff00ff;
						int i_1428_ = (i_1350_ & 0xff00) * i_1426_ & 0xff0000;
						i_1350_ = (i_1427_ | i_1428_) >>> 8;
						for (int i_1429_ = -i_1355_; i_1429_ < 0; i_1429_++) {
							for (int i_1430_ = -i_1356_; i_1430_ < 0; i_1430_++) {
								int i_1431_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
								if (i_1431_ != 0) {
									int i_1432_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1431_ & 0xff]);
									i_1427_ = ((i_1432_ & 0xff00ff) * i_1425_ & ~0xff00ff);
									i_1428_ = ((i_1432_ & 0xff00) * i_1425_ & 0xff0000);
									is[i_1353_++] = ((i_1427_ | i_1428_) >>> 8) + i_1350_;
								} else
									i_1353_++;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1351_ == 2) {
					if (i_1349_ == 1) {
						for (int i_1433_ = -i_1355_; i_1433_ < 0; i_1433_++) {
							for (int i_1434_ = -i_1356_; i_1434_ < 0; i_1434_++) {
								int i_1435_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
								if (i_1435_ != 0) {
									int i_1436_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1435_ & 0xff]);
									int i_1437_ = is[i_1353_];
									int i_1438_ = i_1436_ + i_1437_;
									int i_1439_ = ((i_1436_ & 0xff00ff) + (i_1437_ & 0xff00ff));
									i_1437_ = ((i_1439_ & 0x1000100) + (i_1438_ - i_1439_ & 0x10000));
									is[i_1353_++] = (i_1438_ - i_1437_ | i_1437_ - (i_1437_ >>> 8));
								} else
									i_1353_++;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 0) {
						int i_1440_ = (i_1350_ & 0xff0000) >> 16;
						int i_1441_ = (i_1350_ & 0xff00) >> 8;
						int i_1442_ = i_1350_ & 0xff;
						for (int i_1443_ = -i_1355_; i_1443_ < 0; i_1443_++) {
							for (int i_1444_ = -i_1356_; i_1444_ < 0; i_1444_++) {
								int i_1445_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
								if (i_1445_ != 0) {
									int i_1446_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1445_ & 0xff]);
									int i_1447_ = ((i_1446_ & 0xff0000) * i_1440_ & ~0xffffff);
									int i_1448_ = ((i_1446_ & 0xff00) * i_1441_ & 0xff0000);
									int i_1449_ = (i_1446_ & 0xff) * i_1442_ & 0xff00;
									i_1446_ = (i_1447_ | i_1448_ | i_1449_) >>> 8;
									int i_1450_ = is[i_1353_];
									int i_1451_ = i_1446_ + i_1450_;
									int i_1452_ = ((i_1446_ & 0xff00ff) + (i_1450_ & 0xff00ff));
									i_1450_ = ((i_1452_ & 0x1000100) + (i_1451_ - i_1452_ & 0x10000));
									is[i_1353_++] = (i_1451_ - i_1450_ | i_1450_ - (i_1450_ >>> 8));
								} else
									i_1353_++;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 3) {
						for (int i_1453_ = -i_1355_; i_1453_ < 0; i_1453_++) {
							for (int i_1454_ = -i_1356_; i_1454_ < 0; i_1454_++) {
								byte i_1455_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
								int i_1456_ = (i_1455_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1455_]) : 0);
								int i_1457_ = i_1456_ + i_1350_;
								int i_1458_ = ((i_1456_ & 0xff00ff) + (i_1350_ & 0xff00ff));
								int i_1459_ = ((i_1458_ & 0x1000100) + (i_1457_ - i_1458_ & 0x10000));
								i_1456_ = i_1457_ - i_1459_ | i_1459_ - (i_1459_ >>> 8);
								i_1459_ = is[i_1353_];
								i_1457_ = i_1456_ + i_1459_;
								i_1458_ = (i_1456_ & 0xff00ff) + (i_1459_ & 0xff00ff);
								i_1459_ = ((i_1458_ & 0x1000100) + (i_1457_ - i_1458_ & 0x10000));
								is[i_1353_++] = i_1457_ - i_1459_ | i_1459_ - (i_1459_ >>> 8);
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else if (i_1349_ == 2) {
						int i_1460_ = i_1350_ >>> 24;
						int i_1461_ = 256 - i_1460_;
						int i_1462_ = (i_1350_ & 0xff00ff) * i_1461_ & ~0xff00ff;
						int i_1463_ = (i_1350_ & 0xff00) * i_1461_ & 0xff0000;
						i_1350_ = (i_1462_ | i_1463_) >>> 8;
						for (int i_1464_ = -i_1355_; i_1464_ < 0; i_1464_++) {
							for (int i_1465_ = -i_1356_; i_1465_ < 0; i_1465_++) {
								int i_1466_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_1354_++]);
								if (i_1466_ != 0) {
									int i_1467_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1466_ & 0xff]);
									i_1462_ = ((i_1467_ & 0xff00ff) * i_1460_ & ~0xff00ff);
									i_1463_ = ((i_1467_ & 0xff00) * i_1460_ & 0xff0000);
									i_1467_ = (((i_1462_ | i_1463_) >>> 8) + i_1350_);
									int i_1468_ = is[i_1353_];
									int i_1469_ = i_1467_ + i_1468_;
									int i_1470_ = ((i_1467_ & 0xff00ff) + (i_1468_ & 0xff00ff));
									i_1468_ = ((i_1470_ & 0x1000100) + (i_1469_ - i_1470_ & 0x10000));
									is[i_1353_++] = (i_1469_ - i_1468_ | i_1468_ - (i_1468_ >>> 8));
								} else
									i_1353_++;
							}
							i_1353_ += i_1357_;
							i_1354_ += i_1358_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method709(int i, int i_1471_, int i_1472_, int i_1473_, int i_1474_, int i_1475_, int i_1476_, int i_1477_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1472_ > 0 && i_1473_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1478_ = 0;
				int i_1479_ = 0;
				int i_1480_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1481_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
				int i_1482_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
				int i_1483_ = (i_1481_ << 16) / i_1472_;
				int i_1484_ = (i_1482_ << 16) / i_1473_;
				if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
					int i_1485_ = ((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_1483_ - 1) / i_1483_;
					i += i_1485_;
					i_1478_ += (i_1485_ * i_1483_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
					int i_1486_ = ((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_1484_ - 1) / i_1484_;
					i_1471_ += i_1486_;
					i_1479_ += (i_1486_ * i_1484_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9358 < i_1481_)
					i_1472_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_1478_ + i_1483_ - 1) / i_1483_;
				if (((Class61_Sub3_Sub3) this).anInt9325 < i_1482_)
					i_1473_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_1479_ + i_1484_ - 1) / i_1484_;
				int i_1487_ = i + i_1471_ * i_1480_;
				int i_1488_ = i_1480_ - i_1472_;
				if (i_1471_ + i_1473_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1473_ -= (i_1471_ + i_1473_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1471_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1489_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1471_;
					i_1473_ -= i_1489_;
					i_1487_ += i_1489_ * i_1480_;
					i_1479_ += i_1484_ * i_1489_;
				}
				if (i + i_1472_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1490_ = (i + i_1472_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1472_ -= i_1490_;
					i_1488_ += i_1490_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1491_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1472_ -= i_1491_;
					i_1487_ += i_1491_;
					i_1478_ += i_1483_ * i_1491_;
					i_1488_ += i_1491_;
				}
				if (i_1476_ == 0) {
					if (i_1474_ == 1) {
						int i_1492_ = i_1478_;
						for (int i_1493_ = -i_1473_; i_1493_ < 0; i_1493_++) {
							int i_1494_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1495_ = -i_1472_; i_1495_ < 0; i_1495_++) {
								is[i_1487_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1494_]) & 0xff]);
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1492_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 0) {
						int i_1496_ = (i_1475_ & 0xff0000) >> 16;
						int i_1497_ = (i_1475_ & 0xff00) >> 8;
						int i_1498_ = i_1475_ & 0xff;
						int i_1499_ = i_1478_;
						for (int i_1500_ = -i_1473_; i_1500_ < 0; i_1500_++) {
							int i_1501_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1502_ = -i_1472_; i_1502_ < 0; i_1502_++) {
								int i_1503_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1501_]) & 0xff]);
								int i_1504_ = ((i_1503_ & 0xff0000) * i_1496_ & ~0xffffff);
								int i_1505_ = (i_1503_ & 0xff00) * i_1497_ & 0xff0000;
								int i_1506_ = (i_1503_ & 0xff) * i_1498_ & 0xff00;
								is[i_1487_++] = (i_1504_ | i_1505_ | i_1506_) >>> 8;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1499_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 3) {
						int i_1507_ = i_1478_;
						for (int i_1508_ = -i_1473_; i_1508_ < 0; i_1508_++) {
							int i_1509_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1510_ = -i_1472_; i_1510_ < 0; i_1510_++) {
								byte i_1511_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1509_]);
								int i_1512_ = (i_1511_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1511_]) : 0);
								int i_1513_ = i_1512_ + i_1475_;
								int i_1514_ = ((i_1512_ & 0xff00ff) + (i_1475_ & 0xff00ff));
								int i_1515_ = ((i_1514_ & 0x1000100) + (i_1513_ - i_1514_ & 0x10000));
								is[i_1487_++] = i_1513_ - i_1515_ | i_1515_ - (i_1515_ >>> 8);
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1507_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 2) {
						int i_1516_ = i_1475_ >>> 24;
						int i_1517_ = 256 - i_1516_;
						int i_1518_ = (i_1475_ & 0xff00ff) * i_1517_ & ~0xff00ff;
						int i_1519_ = (i_1475_ & 0xff00) * i_1517_ & 0xff0000;
						i_1475_ = (i_1518_ | i_1519_) >>> 8;
						int i_1520_ = i_1478_;
						for (int i_1521_ = -i_1473_; i_1521_ < 0; i_1521_++) {
							int i_1522_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1523_ = -i_1472_; i_1523_ < 0; i_1523_++) {
								int i_1524_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1522_]) & 0xff]);
								i_1518_ = ((i_1524_ & 0xff00ff) * i_1516_ & ~0xff00ff);
								i_1519_ = (i_1524_ & 0xff00) * i_1516_ & 0xff0000;
								is[i_1487_++] = ((i_1518_ | i_1519_) >>> 8) + i_1475_;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1520_;
							i_1487_ += i_1488_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1476_ == 1) {
					if (i_1474_ == 1) {
						int i_1525_ = i_1478_;
						for (int i_1526_ = -i_1473_; i_1526_ < 0; i_1526_++) {
							int i_1527_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1528_ = -i_1472_; i_1528_ < 0; i_1528_++) {
								int i_1529_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1527_]);
								if (i_1529_ != 0)
									is[i_1487_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1529_ & 0xff]);
								else
									i_1487_++;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1525_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 0) {
						int i_1530_ = i_1478_;
						if ((i_1475_ & 0xffffff) == 16777215) {
							int i_1531_ = i_1475_ >>> 24;
							int i_1532_ = 256 - i_1531_;
							for (int i_1533_ = -i_1473_; i_1533_ < 0; i_1533_++) {
								int i_1534_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_1535_ = -i_1472_; i_1535_ < 0; i_1535_++) {
									int i_1536_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1534_]);
									if (i_1536_ != 0) {
										int i_1537_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1536_ & 0xff]);
										int i_1538_ = is[i_1487_];
										is[i_1487_++] = ((((i_1537_ & 0xff00ff) * i_1531_ + ((i_1538_ & 0xff00ff) * i_1532_)) & ~0xff00ff) + (((i_1537_ & 0xff00) * i_1531_ + ((i_1538_ & 0xff00) * i_1532_)) & 0xff0000)) >> 8;
									} else
										i_1487_++;
									i_1478_ += i_1483_;
								}
								i_1479_ += i_1484_;
								i_1478_ = i_1530_;
								i_1487_ += i_1488_;
							}
						} else {
							int i_1539_ = (i_1475_ & 0xff0000) >> 16;
							int i_1540_ = (i_1475_ & 0xff00) >> 8;
							int i_1541_ = i_1475_ & 0xff;
							int i_1542_ = i_1475_ >>> 24;
							int i_1543_ = 256 - i_1542_;
							for (int i_1544_ = -i_1473_; i_1544_ < 0; i_1544_++) {
								int i_1545_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_1546_ = -i_1472_; i_1546_ < 0; i_1546_++) {
									int i_1547_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1545_]);
									if (i_1547_ != 0) {
										int i_1548_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1547_ & 0xff]);
										if (i_1542_ != 255) {
											int i_1549_ = (((i_1548_ & 0xff0000) * i_1539_) & ~0xffffff);
											int i_1550_ = ((i_1548_ & 0xff00) * i_1540_ & 0xff0000);
											int i_1551_ = ((i_1548_ & 0xff) * i_1541_ & 0xff00);
											i_1548_ = (i_1549_ | i_1550_ | i_1551_) >>> 8;
											int i_1552_ = is[i_1487_];
											is[i_1487_++] = (((((i_1548_ & 0xff00ff) * i_1542_) + ((i_1552_ & 0xff00ff) * i_1543_)) & ~0xff00ff) + ((((i_1548_ & 0xff00) * i_1542_) + ((i_1552_ & 0xff00) * i_1543_)) & 0xff0000)) >> 8;
										} else {
											int i_1553_ = (((i_1548_ & 0xff0000) * i_1539_) & ~0xffffff);
											int i_1554_ = ((i_1548_ & 0xff00) * i_1540_ & 0xff0000);
											int i_1555_ = ((i_1548_ & 0xff) * i_1541_ & 0xff00);
											is[i_1487_++] = (i_1553_ | i_1554_ | i_1555_) >>> 8;
										}
									} else
										i_1487_++;
									i_1478_ += i_1483_;
								}
								i_1479_ += i_1484_;
								i_1478_ = i_1530_;
								i_1487_ += i_1488_;
							}
						}
					} else if (i_1474_ == 3) {
						int i_1556_ = i_1478_;
						int i_1557_ = i_1475_ >>> 24;
						int i_1558_ = 256 - i_1557_;
						for (int i_1559_ = -i_1473_; i_1559_ < 0; i_1559_++) {
							int i_1560_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1561_ = -i_1472_; i_1561_ < 0; i_1561_++) {
								byte i_1562_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1560_]);
								int i_1563_ = (i_1562_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1562_]) : 0);
								int i_1564_ = i_1563_ + i_1475_;
								int i_1565_ = ((i_1563_ & 0xff00ff) + (i_1475_ & 0xff00ff));
								int i_1566_ = ((i_1565_ & 0x1000100) + (i_1564_ - i_1565_ & 0x10000));
								i_1566_ = i_1564_ - i_1566_ | i_1566_ - (i_1566_ >>> 8);
								if (i_1563_ == 0 && i_1557_ != 255) {
									i_1563_ = i_1566_;
									i_1566_ = is[i_1487_];
									i_1566_ = ((((i_1563_ & 0xff00ff) * i_1557_ + (i_1566_ & 0xff00ff) * i_1558_) & ~0xff00ff) + (((i_1563_ & 0xff00) * i_1557_ + (i_1566_ & 0xff00) * i_1558_) & 0xff0000)) >> 8;
								}
								is[i_1487_++] = i_1566_;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1556_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 2) {
						int i_1567_ = i_1475_ >>> 24;
						int i_1568_ = 256 - i_1567_;
						int i_1569_ = (i_1475_ & 0xff00ff) * i_1568_ & ~0xff00ff;
						int i_1570_ = (i_1475_ & 0xff00) * i_1568_ & 0xff0000;
						i_1475_ = (i_1569_ | i_1570_) >>> 8;
						int i_1571_ = i_1478_;
						for (int i_1572_ = -i_1473_; i_1572_ < 0; i_1572_++) {
							int i_1573_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1574_ = -i_1472_; i_1574_ < 0; i_1574_++) {
								int i_1575_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1573_]);
								if (i_1575_ != 0) {
									int i_1576_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1575_ & 0xff]);
									i_1569_ = ((i_1576_ & 0xff00ff) * i_1567_ & ~0xff00ff);
									i_1570_ = ((i_1576_ & 0xff00) * i_1567_ & 0xff0000);
									is[i_1487_++] = ((i_1569_ | i_1570_) >>> 8) + i_1475_;
								} else
									i_1487_++;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1571_;
							i_1487_ += i_1488_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1476_ == 2) {
					if (i_1474_ == 1) {
						int i_1577_ = i_1478_;
						for (int i_1578_ = -i_1473_; i_1578_ < 0; i_1578_++) {
							int i_1579_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1580_ = -i_1472_; i_1580_ < 0; i_1580_++) {
								int i_1581_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1579_]);
								if (i_1581_ != 0) {
									int i_1582_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1581_ & 0xff]);
									int i_1583_ = is[i_1487_];
									int i_1584_ = i_1582_ + i_1583_;
									int i_1585_ = ((i_1582_ & 0xff00ff) + (i_1583_ & 0xff00ff));
									i_1583_ = ((i_1585_ & 0x1000100) + (i_1584_ - i_1585_ & 0x10000));
									is[i_1487_++] = (i_1584_ - i_1583_ | i_1583_ - (i_1583_ >>> 8));
								} else
									i_1487_++;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1577_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 0) {
						int i_1586_ = i_1478_;
						int i_1587_ = (i_1475_ & 0xff0000) >> 16;
						int i_1588_ = (i_1475_ & 0xff00) >> 8;
						int i_1589_ = i_1475_ & 0xff;
						for (int i_1590_ = -i_1473_; i_1590_ < 0; i_1590_++) {
							int i_1591_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1592_ = -i_1472_; i_1592_ < 0; i_1592_++) {
								int i_1593_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1591_]);
								if (i_1593_ != 0) {
									int i_1594_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1593_ & 0xff]);
									int i_1595_ = ((i_1594_ & 0xff0000) * i_1587_ & ~0xffffff);
									int i_1596_ = ((i_1594_ & 0xff00) * i_1588_ & 0xff0000);
									int i_1597_ = (i_1594_ & 0xff) * i_1589_ & 0xff00;
									i_1594_ = (i_1595_ | i_1596_ | i_1597_) >>> 8;
									int i_1598_ = is[i_1487_];
									int i_1599_ = i_1594_ + i_1598_;
									int i_1600_ = ((i_1594_ & 0xff00ff) + (i_1598_ & 0xff00ff));
									i_1598_ = ((i_1600_ & 0x1000100) + (i_1599_ - i_1600_ & 0x10000));
									is[i_1487_++] = (i_1599_ - i_1598_ | i_1598_ - (i_1598_ >>> 8));
								} else
									i_1487_++;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1586_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 3) {
						int i_1601_ = i_1478_;
						for (int i_1602_ = -i_1473_; i_1602_ < 0; i_1602_++) {
							int i_1603_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1604_ = -i_1472_; i_1604_ < 0; i_1604_++) {
								byte i_1605_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1603_]);
								int i_1606_ = (i_1605_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1605_]) : 0);
								int i_1607_ = i_1606_ + i_1475_;
								int i_1608_ = ((i_1606_ & 0xff00ff) + (i_1475_ & 0xff00ff));
								int i_1609_ = ((i_1608_ & 0x1000100) + (i_1607_ - i_1608_ & 0x10000));
								i_1606_ = i_1607_ - i_1609_ | i_1609_ - (i_1609_ >>> 8);
								i_1609_ = is[i_1487_];
								i_1607_ = i_1606_ + i_1609_;
								i_1608_ = (i_1606_ & 0xff00ff) + (i_1609_ & 0xff00ff);
								i_1609_ = ((i_1608_ & 0x1000100) + (i_1607_ - i_1608_ & 0x10000));
								is[i_1487_++] = i_1607_ - i_1609_ | i_1609_ - (i_1609_ >>> 8);
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1601_;
							i_1487_ += i_1488_;
						}
					} else if (i_1474_ == 2) {
						int i_1610_ = i_1475_ >>> 24;
						int i_1611_ = 256 - i_1610_;
						int i_1612_ = (i_1475_ & 0xff00ff) * i_1611_ & ~0xff00ff;
						int i_1613_ = (i_1475_ & 0xff00) * i_1611_ & 0xff0000;
						i_1475_ = (i_1612_ | i_1613_) >>> 8;
						int i_1614_ = i_1478_;
						for (int i_1615_ = -i_1473_; i_1615_ < 0; i_1615_++) {
							int i_1616_ = ((i_1479_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1617_ = -i_1472_; i_1617_ < 0; i_1617_++) {
								int i_1618_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1478_ >> 16) + i_1616_]);
								if (i_1618_ != 0) {
									int i_1619_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1618_ & 0xff]);
									i_1612_ = ((i_1619_ & 0xff00ff) * i_1610_ & ~0xff00ff);
									i_1613_ = ((i_1619_ & 0xff00) * i_1610_ & 0xff0000);
									i_1619_ = (((i_1612_ | i_1613_) >>> 8) + i_1475_);
									int i_1620_ = is[i_1487_];
									int i_1621_ = i_1619_ + i_1620_;
									int i_1622_ = ((i_1619_ & 0xff00ff) + (i_1620_ & 0xff00ff));
									i_1620_ = ((i_1622_ & 0x1000100) + (i_1621_ - i_1622_ & 0x10000));
									is[i_1487_++] = (i_1621_ - i_1620_ | i_1620_ - (i_1620_ >>> 8));
								} else
									i_1487_++;
								i_1478_ += i_1483_;
							}
							i_1479_ += i_1484_;
							i_1478_ = i_1614_;
							i_1487_ += i_1488_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method706(int i, int i_1623_, int i_1624_, int i_1625_, int i_1626_, int i_1627_, int i_1628_, int i_1629_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1624_ > 0 && i_1625_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1630_ = 0;
				int i_1631_ = 0;
				int i_1632_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1633_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
				int i_1634_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
				int i_1635_ = (i_1633_ << 16) / i_1624_;
				int i_1636_ = (i_1634_ << 16) / i_1625_;
				if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
					int i_1637_ = ((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_1635_ - 1) / i_1635_;
					i += i_1637_;
					i_1630_ += (i_1637_ * i_1635_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
					int i_1638_ = ((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_1636_ - 1) / i_1636_;
					i_1623_ += i_1638_;
					i_1631_ += (i_1638_ * i_1636_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9358 < i_1633_)
					i_1624_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_1630_ + i_1635_ - 1) / i_1635_;
				if (((Class61_Sub3_Sub3) this).anInt9325 < i_1634_)
					i_1625_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_1631_ + i_1636_ - 1) / i_1636_;
				int i_1639_ = i + i_1623_ * i_1632_;
				int i_1640_ = i_1632_ - i_1624_;
				if (i_1623_ + i_1625_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1625_ -= (i_1623_ + i_1625_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1623_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1641_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1623_;
					i_1625_ -= i_1641_;
					i_1639_ += i_1641_ * i_1632_;
					i_1631_ += i_1636_ * i_1641_;
				}
				if (i + i_1624_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1642_ = (i + i_1624_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1624_ -= i_1642_;
					i_1640_ += i_1642_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1643_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1624_ -= i_1643_;
					i_1639_ += i_1643_;
					i_1630_ += i_1635_ * i_1643_;
					i_1640_ += i_1643_;
				}
				if (i_1628_ == 0) {
					if (i_1626_ == 1) {
						int i_1644_ = i_1630_;
						for (int i_1645_ = -i_1625_; i_1645_ < 0; i_1645_++) {
							int i_1646_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1647_ = -i_1624_; i_1647_ < 0; i_1647_++) {
								is[i_1639_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1646_]) & 0xff]);
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1644_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 0) {
						int i_1648_ = (i_1627_ & 0xff0000) >> 16;
						int i_1649_ = (i_1627_ & 0xff00) >> 8;
						int i_1650_ = i_1627_ & 0xff;
						int i_1651_ = i_1630_;
						for (int i_1652_ = -i_1625_; i_1652_ < 0; i_1652_++) {
							int i_1653_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1654_ = -i_1624_; i_1654_ < 0; i_1654_++) {
								int i_1655_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1653_]) & 0xff]);
								int i_1656_ = ((i_1655_ & 0xff0000) * i_1648_ & ~0xffffff);
								int i_1657_ = (i_1655_ & 0xff00) * i_1649_ & 0xff0000;
								int i_1658_ = (i_1655_ & 0xff) * i_1650_ & 0xff00;
								is[i_1639_++] = (i_1656_ | i_1657_ | i_1658_) >>> 8;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1651_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 3) {
						int i_1659_ = i_1630_;
						for (int i_1660_ = -i_1625_; i_1660_ < 0; i_1660_++) {
							int i_1661_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1662_ = -i_1624_; i_1662_ < 0; i_1662_++) {
								byte i_1663_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1661_]);
								int i_1664_ = (i_1663_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1663_]) : 0);
								int i_1665_ = i_1664_ + i_1627_;
								int i_1666_ = ((i_1664_ & 0xff00ff) + (i_1627_ & 0xff00ff));
								int i_1667_ = ((i_1666_ & 0x1000100) + (i_1665_ - i_1666_ & 0x10000));
								is[i_1639_++] = i_1665_ - i_1667_ | i_1667_ - (i_1667_ >>> 8);
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1659_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 2) {
						int i_1668_ = i_1627_ >>> 24;
						int i_1669_ = 256 - i_1668_;
						int i_1670_ = (i_1627_ & 0xff00ff) * i_1669_ & ~0xff00ff;
						int i_1671_ = (i_1627_ & 0xff00) * i_1669_ & 0xff0000;
						i_1627_ = (i_1670_ | i_1671_) >>> 8;
						int i_1672_ = i_1630_;
						for (int i_1673_ = -i_1625_; i_1673_ < 0; i_1673_++) {
							int i_1674_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1675_ = -i_1624_; i_1675_ < 0; i_1675_++) {
								int i_1676_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1674_]) & 0xff]);
								i_1670_ = ((i_1676_ & 0xff00ff) * i_1668_ & ~0xff00ff);
								i_1671_ = (i_1676_ & 0xff00) * i_1668_ & 0xff0000;
								is[i_1639_++] = ((i_1670_ | i_1671_) >>> 8) + i_1627_;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1672_;
							i_1639_ += i_1640_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1628_ == 1) {
					if (i_1626_ == 1) {
						int i_1677_ = i_1630_;
						for (int i_1678_ = -i_1625_; i_1678_ < 0; i_1678_++) {
							int i_1679_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1680_ = -i_1624_; i_1680_ < 0; i_1680_++) {
								int i_1681_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1679_]);
								if (i_1681_ != 0)
									is[i_1639_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1681_ & 0xff]);
								else
									i_1639_++;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1677_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 0) {
						int i_1682_ = i_1630_;
						if ((i_1627_ & 0xffffff) == 16777215) {
							int i_1683_ = i_1627_ >>> 24;
							int i_1684_ = 256 - i_1683_;
							for (int i_1685_ = -i_1625_; i_1685_ < 0; i_1685_++) {
								int i_1686_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_1687_ = -i_1624_; i_1687_ < 0; i_1687_++) {
									int i_1688_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1686_]);
									if (i_1688_ != 0) {
										int i_1689_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1688_ & 0xff]);
										int i_1690_ = is[i_1639_];
										is[i_1639_++] = ((((i_1689_ & 0xff00ff) * i_1683_ + ((i_1690_ & 0xff00ff) * i_1684_)) & ~0xff00ff) + (((i_1689_ & 0xff00) * i_1683_ + ((i_1690_ & 0xff00) * i_1684_)) & 0xff0000)) >> 8;
									} else
										i_1639_++;
									i_1630_ += i_1635_;
								}
								i_1631_ += i_1636_;
								i_1630_ = i_1682_;
								i_1639_ += i_1640_;
							}
						} else {
							int i_1691_ = (i_1627_ & 0xff0000) >> 16;
							int i_1692_ = (i_1627_ & 0xff00) >> 8;
							int i_1693_ = i_1627_ & 0xff;
							int i_1694_ = i_1627_ >>> 24;
							int i_1695_ = 256 - i_1694_;
							for (int i_1696_ = -i_1625_; i_1696_ < 0; i_1696_++) {
								int i_1697_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_1698_ = -i_1624_; i_1698_ < 0; i_1698_++) {
									int i_1699_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1697_]);
									if (i_1699_ != 0) {
										int i_1700_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1699_ & 0xff]);
										if (i_1694_ != 255) {
											int i_1701_ = (((i_1700_ & 0xff0000) * i_1691_) & ~0xffffff);
											int i_1702_ = ((i_1700_ & 0xff00) * i_1692_ & 0xff0000);
											int i_1703_ = ((i_1700_ & 0xff) * i_1693_ & 0xff00);
											i_1700_ = (i_1701_ | i_1702_ | i_1703_) >>> 8;
											int i_1704_ = is[i_1639_];
											is[i_1639_++] = (((((i_1700_ & 0xff00ff) * i_1694_) + ((i_1704_ & 0xff00ff) * i_1695_)) & ~0xff00ff) + ((((i_1700_ & 0xff00) * i_1694_) + ((i_1704_ & 0xff00) * i_1695_)) & 0xff0000)) >> 8;
										} else {
											int i_1705_ = (((i_1700_ & 0xff0000) * i_1691_) & ~0xffffff);
											int i_1706_ = ((i_1700_ & 0xff00) * i_1692_ & 0xff0000);
											int i_1707_ = ((i_1700_ & 0xff) * i_1693_ & 0xff00);
											is[i_1639_++] = (i_1705_ | i_1706_ | i_1707_) >>> 8;
										}
									} else
										i_1639_++;
									i_1630_ += i_1635_;
								}
								i_1631_ += i_1636_;
								i_1630_ = i_1682_;
								i_1639_ += i_1640_;
							}
						}
					} else if (i_1626_ == 3) {
						int i_1708_ = i_1630_;
						int i_1709_ = i_1627_ >>> 24;
						int i_1710_ = 256 - i_1709_;
						for (int i_1711_ = -i_1625_; i_1711_ < 0; i_1711_++) {
							int i_1712_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1713_ = -i_1624_; i_1713_ < 0; i_1713_++) {
								byte i_1714_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1712_]);
								int i_1715_ = (i_1714_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1714_]) : 0);
								int i_1716_ = i_1715_ + i_1627_;
								int i_1717_ = ((i_1715_ & 0xff00ff) + (i_1627_ & 0xff00ff));
								int i_1718_ = ((i_1717_ & 0x1000100) + (i_1716_ - i_1717_ & 0x10000));
								i_1718_ = i_1716_ - i_1718_ | i_1718_ - (i_1718_ >>> 8);
								if (i_1715_ == 0 && i_1709_ != 255) {
									i_1715_ = i_1718_;
									i_1718_ = is[i_1639_];
									i_1718_ = ((((i_1715_ & 0xff00ff) * i_1709_ + (i_1718_ & 0xff00ff) * i_1710_) & ~0xff00ff) + (((i_1715_ & 0xff00) * i_1709_ + (i_1718_ & 0xff00) * i_1710_) & 0xff0000)) >> 8;
								}
								is[i_1639_++] = i_1718_;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1708_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 2) {
						int i_1719_ = i_1627_ >>> 24;
						int i_1720_ = 256 - i_1719_;
						int i_1721_ = (i_1627_ & 0xff00ff) * i_1720_ & ~0xff00ff;
						int i_1722_ = (i_1627_ & 0xff00) * i_1720_ & 0xff0000;
						i_1627_ = (i_1721_ | i_1722_) >>> 8;
						int i_1723_ = i_1630_;
						for (int i_1724_ = -i_1625_; i_1724_ < 0; i_1724_++) {
							int i_1725_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1726_ = -i_1624_; i_1726_ < 0; i_1726_++) {
								int i_1727_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1725_]);
								if (i_1727_ != 0) {
									int i_1728_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1727_ & 0xff]);
									i_1721_ = ((i_1728_ & 0xff00ff) * i_1719_ & ~0xff00ff);
									i_1722_ = ((i_1728_ & 0xff00) * i_1719_ & 0xff0000);
									is[i_1639_++] = ((i_1721_ | i_1722_) >>> 8) + i_1627_;
								} else
									i_1639_++;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1723_;
							i_1639_ += i_1640_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1628_ == 2) {
					if (i_1626_ == 1) {
						int i_1729_ = i_1630_;
						for (int i_1730_ = -i_1625_; i_1730_ < 0; i_1730_++) {
							int i_1731_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1732_ = -i_1624_; i_1732_ < 0; i_1732_++) {
								int i_1733_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1731_]);
								if (i_1733_ != 0) {
									int i_1734_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1733_ & 0xff]);
									int i_1735_ = is[i_1639_];
									int i_1736_ = i_1734_ + i_1735_;
									int i_1737_ = ((i_1734_ & 0xff00ff) + (i_1735_ & 0xff00ff));
									i_1735_ = ((i_1737_ & 0x1000100) + (i_1736_ - i_1737_ & 0x10000));
									is[i_1639_++] = (i_1736_ - i_1735_ | i_1735_ - (i_1735_ >>> 8));
								} else
									i_1639_++;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1729_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 0) {
						int i_1738_ = i_1630_;
						int i_1739_ = (i_1627_ & 0xff0000) >> 16;
						int i_1740_ = (i_1627_ & 0xff00) >> 8;
						int i_1741_ = i_1627_ & 0xff;
						for (int i_1742_ = -i_1625_; i_1742_ < 0; i_1742_++) {
							int i_1743_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1744_ = -i_1624_; i_1744_ < 0; i_1744_++) {
								int i_1745_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1743_]);
								if (i_1745_ != 0) {
									int i_1746_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1745_ & 0xff]);
									int i_1747_ = ((i_1746_ & 0xff0000) * i_1739_ & ~0xffffff);
									int i_1748_ = ((i_1746_ & 0xff00) * i_1740_ & 0xff0000);
									int i_1749_ = (i_1746_ & 0xff) * i_1741_ & 0xff00;
									i_1746_ = (i_1747_ | i_1748_ | i_1749_) >>> 8;
									int i_1750_ = is[i_1639_];
									int i_1751_ = i_1746_ + i_1750_;
									int i_1752_ = ((i_1746_ & 0xff00ff) + (i_1750_ & 0xff00ff));
									i_1750_ = ((i_1752_ & 0x1000100) + (i_1751_ - i_1752_ & 0x10000));
									is[i_1639_++] = (i_1751_ - i_1750_ | i_1750_ - (i_1750_ >>> 8));
								} else
									i_1639_++;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1738_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 3) {
						int i_1753_ = i_1630_;
						for (int i_1754_ = -i_1625_; i_1754_ < 0; i_1754_++) {
							int i_1755_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1756_ = -i_1624_; i_1756_ < 0; i_1756_++) {
								byte i_1757_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1755_]);
								int i_1758_ = (i_1757_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1757_]) : 0);
								int i_1759_ = i_1758_ + i_1627_;
								int i_1760_ = ((i_1758_ & 0xff00ff) + (i_1627_ & 0xff00ff));
								int i_1761_ = ((i_1760_ & 0x1000100) + (i_1759_ - i_1760_ & 0x10000));
								i_1758_ = i_1759_ - i_1761_ | i_1761_ - (i_1761_ >>> 8);
								i_1761_ = is[i_1639_];
								i_1759_ = i_1758_ + i_1761_;
								i_1760_ = (i_1758_ & 0xff00ff) + (i_1761_ & 0xff00ff);
								i_1761_ = ((i_1760_ & 0x1000100) + (i_1759_ - i_1760_ & 0x10000));
								is[i_1639_++] = i_1759_ - i_1761_ | i_1761_ - (i_1761_ >>> 8);
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1753_;
							i_1639_ += i_1640_;
						}
					} else if (i_1626_ == 2) {
						int i_1762_ = i_1627_ >>> 24;
						int i_1763_ = 256 - i_1762_;
						int i_1764_ = (i_1627_ & 0xff00ff) * i_1763_ & ~0xff00ff;
						int i_1765_ = (i_1627_ & 0xff00) * i_1763_ & 0xff0000;
						i_1627_ = (i_1764_ | i_1765_) >>> 8;
						int i_1766_ = i_1630_;
						for (int i_1767_ = -i_1625_; i_1767_ < 0; i_1767_++) {
							int i_1768_ = ((i_1631_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1769_ = -i_1624_; i_1769_ < 0; i_1769_++) {
								int i_1770_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1630_ >> 16) + i_1768_]);
								if (i_1770_ != 0) {
									int i_1771_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1770_ & 0xff]);
									i_1764_ = ((i_1771_ & 0xff00ff) * i_1762_ & ~0xff00ff);
									i_1765_ = ((i_1771_ & 0xff00) * i_1762_ & 0xff0000);
									i_1771_ = (((i_1764_ | i_1765_) >>> 8) + i_1627_);
									int i_1772_ = is[i_1639_];
									int i_1773_ = i_1771_ + i_1772_;
									int i_1774_ = ((i_1771_ & 0xff00ff) + (i_1772_ & 0xff00ff));
									i_1772_ = ((i_1774_ & 0x1000100) + (i_1773_ - i_1774_ & 0x10000));
									is[i_1639_++] = (i_1773_ - i_1772_ | i_1772_ - (i_1772_ >>> 8));
								} else
									i_1639_++;
								i_1630_ += i_1635_;
							}
							i_1631_ += i_1636_;
							i_1630_ = i_1766_;
							i_1639_ += i_1640_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	Class61_Sub3_Sub3(Class_ra_Sub3 class_ra_sub3, byte[] is, int[] is_1775_, int i, int i_1776_) {
		super(class_ra_sub3, i, i_1776_);
		((Class61_Sub3_Sub3) this).aByteArray10095 = is;
		((Class61_Sub3_Sub3) this).anIntArray10096 = is_1775_;
	}

	void method710(int i, int i_1777_, int i_1778_, int i_1779_, int i_1780_, int i_1781_, int i_1782_, int i_1783_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1778_ > 0 && i_1779_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1784_ = 0;
				int i_1785_ = 0;
				int i_1786_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1787_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
				int i_1788_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
				int i_1789_ = (i_1787_ << 16) / i_1778_;
				int i_1790_ = (i_1788_ << 16) / i_1779_;
				if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
					int i_1791_ = ((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_1789_ - 1) / i_1789_;
					i += i_1791_;
					i_1784_ += (i_1791_ * i_1789_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
					int i_1792_ = ((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_1790_ - 1) / i_1790_;
					i_1777_ += i_1792_;
					i_1785_ += (i_1792_ * i_1790_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9358 < i_1787_)
					i_1778_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_1784_ + i_1789_ - 1) / i_1789_;
				if (((Class61_Sub3_Sub3) this).anInt9325 < i_1788_)
					i_1779_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_1785_ + i_1790_ - 1) / i_1790_;
				int i_1793_ = i + i_1777_ * i_1786_;
				int i_1794_ = i_1786_ - i_1778_;
				if (i_1777_ + i_1779_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1779_ -= (i_1777_ + i_1779_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1777_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1795_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1777_;
					i_1779_ -= i_1795_;
					i_1793_ += i_1795_ * i_1786_;
					i_1785_ += i_1790_ * i_1795_;
				}
				if (i + i_1778_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1796_ = (i + i_1778_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1778_ -= i_1796_;
					i_1794_ += i_1796_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1797_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1778_ -= i_1797_;
					i_1793_ += i_1797_;
					i_1784_ += i_1789_ * i_1797_;
					i_1794_ += i_1797_;
				}
				if (i_1782_ == 0) {
					if (i_1780_ == 1) {
						int i_1798_ = i_1784_;
						for (int i_1799_ = -i_1779_; i_1799_ < 0; i_1799_++) {
							int i_1800_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1801_ = -i_1778_; i_1801_ < 0; i_1801_++) {
								is[i_1793_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1800_]) & 0xff]);
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1798_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 0) {
						int i_1802_ = (i_1781_ & 0xff0000) >> 16;
						int i_1803_ = (i_1781_ & 0xff00) >> 8;
						int i_1804_ = i_1781_ & 0xff;
						int i_1805_ = i_1784_;
						for (int i_1806_ = -i_1779_; i_1806_ < 0; i_1806_++) {
							int i_1807_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1808_ = -i_1778_; i_1808_ < 0; i_1808_++) {
								int i_1809_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1807_]) & 0xff]);
								int i_1810_ = ((i_1809_ & 0xff0000) * i_1802_ & ~0xffffff);
								int i_1811_ = (i_1809_ & 0xff00) * i_1803_ & 0xff0000;
								int i_1812_ = (i_1809_ & 0xff) * i_1804_ & 0xff00;
								is[i_1793_++] = (i_1810_ | i_1811_ | i_1812_) >>> 8;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1805_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 3) {
						int i_1813_ = i_1784_;
						for (int i_1814_ = -i_1779_; i_1814_ < 0; i_1814_++) {
							int i_1815_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1816_ = -i_1778_; i_1816_ < 0; i_1816_++) {
								byte i_1817_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1815_]);
								int i_1818_ = (i_1817_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1817_]) : 0);
								int i_1819_ = i_1818_ + i_1781_;
								int i_1820_ = ((i_1818_ & 0xff00ff) + (i_1781_ & 0xff00ff));
								int i_1821_ = ((i_1820_ & 0x1000100) + (i_1819_ - i_1820_ & 0x10000));
								is[i_1793_++] = i_1819_ - i_1821_ | i_1821_ - (i_1821_ >>> 8);
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1813_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 2) {
						int i_1822_ = i_1781_ >>> 24;
						int i_1823_ = 256 - i_1822_;
						int i_1824_ = (i_1781_ & 0xff00ff) * i_1823_ & ~0xff00ff;
						int i_1825_ = (i_1781_ & 0xff00) * i_1823_ & 0xff0000;
						i_1781_ = (i_1824_ | i_1825_) >>> 8;
						int i_1826_ = i_1784_;
						for (int i_1827_ = -i_1779_; i_1827_ < 0; i_1827_++) {
							int i_1828_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1829_ = -i_1778_; i_1829_ < 0; i_1829_++) {
								int i_1830_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1828_]) & 0xff]);
								i_1824_ = ((i_1830_ & 0xff00ff) * i_1822_ & ~0xff00ff);
								i_1825_ = (i_1830_ & 0xff00) * i_1822_ & 0xff0000;
								is[i_1793_++] = ((i_1824_ | i_1825_) >>> 8) + i_1781_;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1826_;
							i_1793_ += i_1794_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1782_ == 1) {
					if (i_1780_ == 1) {
						int i_1831_ = i_1784_;
						for (int i_1832_ = -i_1779_; i_1832_ < 0; i_1832_++) {
							int i_1833_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1834_ = -i_1778_; i_1834_ < 0; i_1834_++) {
								int i_1835_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1833_]);
								if (i_1835_ != 0)
									is[i_1793_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1835_ & 0xff]);
								else
									i_1793_++;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1831_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 0) {
						int i_1836_ = i_1784_;
						if ((i_1781_ & 0xffffff) == 16777215) {
							int i_1837_ = i_1781_ >>> 24;
							int i_1838_ = 256 - i_1837_;
							for (int i_1839_ = -i_1779_; i_1839_ < 0; i_1839_++) {
								int i_1840_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_1841_ = -i_1778_; i_1841_ < 0; i_1841_++) {
									int i_1842_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1840_]);
									if (i_1842_ != 0) {
										int i_1843_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1842_ & 0xff]);
										int i_1844_ = is[i_1793_];
										is[i_1793_++] = ((((i_1843_ & 0xff00ff) * i_1837_ + ((i_1844_ & 0xff00ff) * i_1838_)) & ~0xff00ff) + (((i_1843_ & 0xff00) * i_1837_ + ((i_1844_ & 0xff00) * i_1838_)) & 0xff0000)) >> 8;
									} else
										i_1793_++;
									i_1784_ += i_1789_;
								}
								i_1785_ += i_1790_;
								i_1784_ = i_1836_;
								i_1793_ += i_1794_;
							}
						} else {
							int i_1845_ = (i_1781_ & 0xff0000) >> 16;
							int i_1846_ = (i_1781_ & 0xff00) >> 8;
							int i_1847_ = i_1781_ & 0xff;
							int i_1848_ = i_1781_ >>> 24;
							int i_1849_ = 256 - i_1848_;
							for (int i_1850_ = -i_1779_; i_1850_ < 0; i_1850_++) {
								int i_1851_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_1852_ = -i_1778_; i_1852_ < 0; i_1852_++) {
									int i_1853_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1851_]);
									if (i_1853_ != 0) {
										int i_1854_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1853_ & 0xff]);
										if (i_1848_ != 255) {
											int i_1855_ = (((i_1854_ & 0xff0000) * i_1845_) & ~0xffffff);
											int i_1856_ = ((i_1854_ & 0xff00) * i_1846_ & 0xff0000);
											int i_1857_ = ((i_1854_ & 0xff) * i_1847_ & 0xff00);
											i_1854_ = (i_1855_ | i_1856_ | i_1857_) >>> 8;
											int i_1858_ = is[i_1793_];
											is[i_1793_++] = (((((i_1854_ & 0xff00ff) * i_1848_) + ((i_1858_ & 0xff00ff) * i_1849_)) & ~0xff00ff) + ((((i_1854_ & 0xff00) * i_1848_) + ((i_1858_ & 0xff00) * i_1849_)) & 0xff0000)) >> 8;
										} else {
											int i_1859_ = (((i_1854_ & 0xff0000) * i_1845_) & ~0xffffff);
											int i_1860_ = ((i_1854_ & 0xff00) * i_1846_ & 0xff0000);
											int i_1861_ = ((i_1854_ & 0xff) * i_1847_ & 0xff00);
											is[i_1793_++] = (i_1859_ | i_1860_ | i_1861_) >>> 8;
										}
									} else
										i_1793_++;
									i_1784_ += i_1789_;
								}
								i_1785_ += i_1790_;
								i_1784_ = i_1836_;
								i_1793_ += i_1794_;
							}
						}
					} else if (i_1780_ == 3) {
						int i_1862_ = i_1784_;
						int i_1863_ = i_1781_ >>> 24;
						int i_1864_ = 256 - i_1863_;
						for (int i_1865_ = -i_1779_; i_1865_ < 0; i_1865_++) {
							int i_1866_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1867_ = -i_1778_; i_1867_ < 0; i_1867_++) {
								byte i_1868_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1866_]);
								int i_1869_ = (i_1868_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1868_]) : 0);
								int i_1870_ = i_1869_ + i_1781_;
								int i_1871_ = ((i_1869_ & 0xff00ff) + (i_1781_ & 0xff00ff));
								int i_1872_ = ((i_1871_ & 0x1000100) + (i_1870_ - i_1871_ & 0x10000));
								i_1872_ = i_1870_ - i_1872_ | i_1872_ - (i_1872_ >>> 8);
								if (i_1869_ == 0 && i_1863_ != 255) {
									i_1869_ = i_1872_;
									i_1872_ = is[i_1793_];
									i_1872_ = ((((i_1869_ & 0xff00ff) * i_1863_ + (i_1872_ & 0xff00ff) * i_1864_) & ~0xff00ff) + (((i_1869_ & 0xff00) * i_1863_ + (i_1872_ & 0xff00) * i_1864_) & 0xff0000)) >> 8;
								}
								is[i_1793_++] = i_1872_;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1862_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 2) {
						int i_1873_ = i_1781_ >>> 24;
						int i_1874_ = 256 - i_1873_;
						int i_1875_ = (i_1781_ & 0xff00ff) * i_1874_ & ~0xff00ff;
						int i_1876_ = (i_1781_ & 0xff00) * i_1874_ & 0xff0000;
						i_1781_ = (i_1875_ | i_1876_) >>> 8;
						int i_1877_ = i_1784_;
						for (int i_1878_ = -i_1779_; i_1878_ < 0; i_1878_++) {
							int i_1879_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1880_ = -i_1778_; i_1880_ < 0; i_1880_++) {
								int i_1881_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1879_]);
								if (i_1881_ != 0) {
									int i_1882_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1881_ & 0xff]);
									i_1875_ = ((i_1882_ & 0xff00ff) * i_1873_ & ~0xff00ff);
									i_1876_ = ((i_1882_ & 0xff00) * i_1873_ & 0xff0000);
									is[i_1793_++] = ((i_1875_ | i_1876_) >>> 8) + i_1781_;
								} else
									i_1793_++;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1877_;
							i_1793_ += i_1794_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1782_ == 2) {
					if (i_1780_ == 1) {
						int i_1883_ = i_1784_;
						for (int i_1884_ = -i_1779_; i_1884_ < 0; i_1884_++) {
							int i_1885_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1886_ = -i_1778_; i_1886_ < 0; i_1886_++) {
								int i_1887_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1885_]);
								if (i_1887_ != 0) {
									int i_1888_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1887_ & 0xff]);
									int i_1889_ = is[i_1793_];
									int i_1890_ = i_1888_ + i_1889_;
									int i_1891_ = ((i_1888_ & 0xff00ff) + (i_1889_ & 0xff00ff));
									i_1889_ = ((i_1891_ & 0x1000100) + (i_1890_ - i_1891_ & 0x10000));
									is[i_1793_++] = (i_1890_ - i_1889_ | i_1889_ - (i_1889_ >>> 8));
								} else
									i_1793_++;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1883_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 0) {
						int i_1892_ = i_1784_;
						int i_1893_ = (i_1781_ & 0xff0000) >> 16;
						int i_1894_ = (i_1781_ & 0xff00) >> 8;
						int i_1895_ = i_1781_ & 0xff;
						for (int i_1896_ = -i_1779_; i_1896_ < 0; i_1896_++) {
							int i_1897_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1898_ = -i_1778_; i_1898_ < 0; i_1898_++) {
								int i_1899_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1897_]);
								if (i_1899_ != 0) {
									int i_1900_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1899_ & 0xff]);
									int i_1901_ = ((i_1900_ & 0xff0000) * i_1893_ & ~0xffffff);
									int i_1902_ = ((i_1900_ & 0xff00) * i_1894_ & 0xff0000);
									int i_1903_ = (i_1900_ & 0xff) * i_1895_ & 0xff00;
									i_1900_ = (i_1901_ | i_1902_ | i_1903_) >>> 8;
									int i_1904_ = is[i_1793_];
									int i_1905_ = i_1900_ + i_1904_;
									int i_1906_ = ((i_1900_ & 0xff00ff) + (i_1904_ & 0xff00ff));
									i_1904_ = ((i_1906_ & 0x1000100) + (i_1905_ - i_1906_ & 0x10000));
									is[i_1793_++] = (i_1905_ - i_1904_ | i_1904_ - (i_1904_ >>> 8));
								} else
									i_1793_++;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1892_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 3) {
						int i_1907_ = i_1784_;
						for (int i_1908_ = -i_1779_; i_1908_ < 0; i_1908_++) {
							int i_1909_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1910_ = -i_1778_; i_1910_ < 0; i_1910_++) {
								byte i_1911_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1909_]);
								int i_1912_ = (i_1911_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1911_]) : 0);
								int i_1913_ = i_1912_ + i_1781_;
								int i_1914_ = ((i_1912_ & 0xff00ff) + (i_1781_ & 0xff00ff));
								int i_1915_ = ((i_1914_ & 0x1000100) + (i_1913_ - i_1914_ & 0x10000));
								i_1912_ = i_1913_ - i_1915_ | i_1915_ - (i_1915_ >>> 8);
								i_1915_ = is[i_1793_];
								i_1913_ = i_1912_ + i_1915_;
								i_1914_ = (i_1912_ & 0xff00ff) + (i_1915_ & 0xff00ff);
								i_1915_ = ((i_1914_ & 0x1000100) + (i_1913_ - i_1914_ & 0x10000));
								is[i_1793_++] = i_1913_ - i_1915_ | i_1915_ - (i_1915_ >>> 8);
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1907_;
							i_1793_ += i_1794_;
						}
					} else if (i_1780_ == 2) {
						int i_1916_ = i_1781_ >>> 24;
						int i_1917_ = 256 - i_1916_;
						int i_1918_ = (i_1781_ & 0xff00ff) * i_1917_ & ~0xff00ff;
						int i_1919_ = (i_1781_ & 0xff00) * i_1917_ & 0xff0000;
						i_1781_ = (i_1918_ | i_1919_) >>> 8;
						int i_1920_ = i_1784_;
						for (int i_1921_ = -i_1779_; i_1921_ < 0; i_1921_++) {
							int i_1922_ = ((i_1785_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1923_ = -i_1778_; i_1923_ < 0; i_1923_++) {
								int i_1924_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1784_ >> 16) + i_1922_]);
								if (i_1924_ != 0) {
									int i_1925_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1924_ & 0xff]);
									i_1918_ = ((i_1925_ & 0xff00ff) * i_1916_ & ~0xff00ff);
									i_1919_ = ((i_1925_ & 0xff00) * i_1916_ & 0xff0000);
									i_1925_ = (((i_1918_ | i_1919_) >>> 8) + i_1781_);
									int i_1926_ = is[i_1793_];
									int i_1927_ = i_1925_ + i_1926_;
									int i_1928_ = ((i_1925_ & 0xff00ff) + (i_1926_ & 0xff00ff));
									i_1926_ = ((i_1928_ & 0x1000100) + (i_1927_ - i_1928_ & 0x10000));
									is[i_1793_++] = (i_1927_ - i_1926_ | i_1926_ - (i_1926_ >>> 8));
								} else
									i_1793_++;
								i_1784_ += i_1789_;
							}
							i_1785_ += i_1790_;
							i_1784_ = i_1920_;
							i_1793_ += i_1794_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface8_Impl1_Impl2 method707() {
		throw new IllegalStateException();
	}

	void method712(int i, int i_1929_, int i_1930_, int i_1931_, int i_1932_, int i_1933_, int i_1934_, int i_1935_) {
		if (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (i_1930_ > 0 && i_1931_ > 0) {
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (is != null) {
				int i_1936_ = 0;
				int i_1937_ = 0;
				int i_1938_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933);
				int i_1939_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
				int i_1940_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
				int i_1941_ = (i_1939_ << 16) / i_1930_;
				int i_1942_ = (i_1940_ << 16) / i_1931_;
				if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
					int i_1943_ = ((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_1941_ - 1) / i_1941_;
					i += i_1943_;
					i_1936_ += (i_1943_ * i_1941_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
					int i_1944_ = ((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_1942_ - 1) / i_1942_;
					i_1929_ += i_1944_;
					i_1937_ += (i_1944_ * i_1942_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
				}
				if (((Class61_Sub3_Sub3) this).anInt9358 < i_1939_)
					i_1930_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_1936_ + i_1941_ - 1) / i_1941_;
				if (((Class61_Sub3_Sub3) this).anInt9325 < i_1940_)
					i_1931_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_1937_ + i_1942_ - 1) / i_1942_;
				int i_1945_ = i + i_1929_ * i_1938_;
				int i_1946_ = i_1938_ - i_1930_;
				if (i_1929_ + i_1931_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
					i_1931_ -= (i_1929_ + i_1931_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8624) * 31822541);
				if (i_1929_ < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481) {
					int i_1947_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_1929_;
					i_1931_ -= i_1947_;
					i_1945_ += i_1947_ * i_1938_;
					i_1937_ += i_1942_ * i_1947_;
				}
				if (i + i_1930_ > (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483) {
					int i_1948_ = (i + i_1930_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483);
					i_1930_ -= i_1948_;
					i_1946_ += i_1948_;
				}
				if (i < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825)) {
					int i_1949_ = (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i;
					i_1930_ -= i_1949_;
					i_1945_ += i_1949_;
					i_1936_ += i_1941_ * i_1949_;
					i_1946_ += i_1949_;
				}
				if (i_1934_ == 0) {
					if (i_1932_ == 1) {
						int i_1950_ = i_1936_;
						for (int i_1951_ = -i_1931_; i_1951_ < 0; i_1951_++) {
							int i_1952_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1953_ = -i_1930_; i_1953_ < 0; i_1953_++) {
								is[i_1945_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_1952_]) & 0xff]);
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_1950_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 0) {
						int i_1954_ = (i_1933_ & 0xff0000) >> 16;
						int i_1955_ = (i_1933_ & 0xff00) >> 8;
						int i_1956_ = i_1933_ & 0xff;
						int i_1957_ = i_1936_;
						for (int i_1958_ = -i_1931_; i_1958_ < 0; i_1958_++) {
							int i_1959_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1960_ = -i_1930_; i_1960_ < 0; i_1960_++) {
								int i_1961_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_1959_]) & 0xff]);
								int i_1962_ = ((i_1961_ & 0xff0000) * i_1954_ & ~0xffffff);
								int i_1963_ = (i_1961_ & 0xff00) * i_1955_ & 0xff0000;
								int i_1964_ = (i_1961_ & 0xff) * i_1956_ & 0xff00;
								is[i_1945_++] = (i_1962_ | i_1963_ | i_1964_) >>> 8;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_1957_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 3) {
						int i_1965_ = i_1936_;
						for (int i_1966_ = -i_1931_; i_1966_ < 0; i_1966_++) {
							int i_1967_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1968_ = -i_1930_; i_1968_ < 0; i_1968_++) {
								byte i_1969_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_1967_]);
								int i_1970_ = (i_1969_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_1969_]) : 0);
								int i_1971_ = i_1970_ + i_1933_;
								int i_1972_ = ((i_1970_ & 0xff00ff) + (i_1933_ & 0xff00ff));
								int i_1973_ = ((i_1972_ & 0x1000100) + (i_1971_ - i_1972_ & 0x10000));
								is[i_1945_++] = i_1971_ - i_1973_ | i_1973_ - (i_1973_ >>> 8);
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_1965_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 2) {
						int i_1974_ = i_1933_ >>> 24;
						int i_1975_ = 256 - i_1974_;
						int i_1976_ = (i_1933_ & 0xff00ff) * i_1975_ & ~0xff00ff;
						int i_1977_ = (i_1933_ & 0xff00) * i_1975_ & 0xff0000;
						i_1933_ = (i_1976_ | i_1977_) >>> 8;
						int i_1978_ = i_1936_;
						for (int i_1979_ = -i_1931_; i_1979_ < 0; i_1979_++) {
							int i_1980_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1981_ = -i_1930_; i_1981_ < 0; i_1981_++) {
								int i_1982_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_1980_]) & 0xff]);
								i_1976_ = ((i_1982_ & 0xff00ff) * i_1974_ & ~0xff00ff);
								i_1977_ = (i_1982_ & 0xff00) * i_1974_ & 0xff0000;
								is[i_1945_++] = ((i_1976_ | i_1977_) >>> 8) + i_1933_;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_1978_;
							i_1945_ += i_1946_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1934_ == 1) {
					if (i_1932_ == 1) {
						int i_1983_ = i_1936_;
						for (int i_1984_ = -i_1931_; i_1984_ < 0; i_1984_++) {
							int i_1985_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_1986_ = -i_1930_; i_1986_ < 0; i_1986_++) {
								int i_1987_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_1985_]);
								if (i_1987_ != 0)
									is[i_1945_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1987_ & 0xff]);
								else
									i_1945_++;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_1983_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 0) {
						int i_1988_ = i_1936_;
						if ((i_1933_ & 0xffffff) == 16777215) {
							int i_1989_ = i_1933_ >>> 24;
							int i_1990_ = 256 - i_1989_;
							for (int i_1991_ = -i_1931_; i_1991_ < 0; i_1991_++) {
								int i_1992_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_1993_ = -i_1930_; i_1993_ < 0; i_1993_++) {
									int i_1994_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_1992_]);
									if (i_1994_ != 0) {
										int i_1995_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_1994_ & 0xff]);
										int i_1996_ = is[i_1945_];
										is[i_1945_++] = ((((i_1995_ & 0xff00ff) * i_1989_ + ((i_1996_ & 0xff00ff) * i_1990_)) & ~0xff00ff) + (((i_1995_ & 0xff00) * i_1989_ + ((i_1996_ & 0xff00) * i_1990_)) & 0xff0000)) >> 8;
									} else
										i_1945_++;
									i_1936_ += i_1941_;
								}
								i_1937_ += i_1942_;
								i_1936_ = i_1988_;
								i_1945_ += i_1946_;
							}
						} else {
							int i_1997_ = (i_1933_ & 0xff0000) >> 16;
							int i_1998_ = (i_1933_ & 0xff00) >> 8;
							int i_1999_ = i_1933_ & 0xff;
							int i_2000_ = i_1933_ >>> 24;
							int i_2001_ = 256 - i_2000_;
							for (int i_2002_ = -i_1931_; i_2002_ < 0; i_2002_++) {
								int i_2003_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
								for (int i_2004_ = -i_1930_; i_2004_ < 0; i_2004_++) {
									int i_2005_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_2003_]);
									if (i_2005_ != 0) {
										int i_2006_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2005_ & 0xff]);
										if (i_2000_ != 255) {
											int i_2007_ = (((i_2006_ & 0xff0000) * i_1997_) & ~0xffffff);
											int i_2008_ = ((i_2006_ & 0xff00) * i_1998_ & 0xff0000);
											int i_2009_ = ((i_2006_ & 0xff) * i_1999_ & 0xff00);
											i_2006_ = (i_2007_ | i_2008_ | i_2009_) >>> 8;
											int i_2010_ = is[i_1945_];
											is[i_1945_++] = (((((i_2006_ & 0xff00ff) * i_2000_) + ((i_2010_ & 0xff00ff) * i_2001_)) & ~0xff00ff) + ((((i_2006_ & 0xff00) * i_2000_) + ((i_2010_ & 0xff00) * i_2001_)) & 0xff0000)) >> 8;
										} else {
											int i_2011_ = (((i_2006_ & 0xff0000) * i_1997_) & ~0xffffff);
											int i_2012_ = ((i_2006_ & 0xff00) * i_1998_ & 0xff0000);
											int i_2013_ = ((i_2006_ & 0xff) * i_1999_ & 0xff00);
											is[i_1945_++] = (i_2011_ | i_2012_ | i_2013_) >>> 8;
										}
									} else
										i_1945_++;
									i_1936_ += i_1941_;
								}
								i_1937_ += i_1942_;
								i_1936_ = i_1988_;
								i_1945_ += i_1946_;
							}
						}
					} else if (i_1932_ == 3) {
						int i_2014_ = i_1936_;
						int i_2015_ = i_1933_ >>> 24;
						int i_2016_ = 256 - i_2015_;
						for (int i_2017_ = -i_1931_; i_2017_ < 0; i_2017_++) {
							int i_2018_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2019_ = -i_1930_; i_2019_ < 0; i_2019_++) {
								byte i_2020_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_2018_]);
								int i_2021_ = (i_2020_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2020_]) : 0);
								int i_2022_ = i_2021_ + i_1933_;
								int i_2023_ = ((i_2021_ & 0xff00ff) + (i_1933_ & 0xff00ff));
								int i_2024_ = ((i_2023_ & 0x1000100) + (i_2022_ - i_2023_ & 0x10000));
								i_2024_ = i_2022_ - i_2024_ | i_2024_ - (i_2024_ >>> 8);
								if (i_2021_ == 0 && i_2015_ != 255) {
									i_2021_ = i_2024_;
									i_2024_ = is[i_1945_];
									i_2024_ = ((((i_2021_ & 0xff00ff) * i_2015_ + (i_2024_ & 0xff00ff) * i_2016_) & ~0xff00ff) + (((i_2021_ & 0xff00) * i_2015_ + (i_2024_ & 0xff00) * i_2016_) & 0xff0000)) >> 8;
								}
								is[i_1945_++] = i_2024_;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_2014_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 2) {
						int i_2025_ = i_1933_ >>> 24;
						int i_2026_ = 256 - i_2025_;
						int i_2027_ = (i_1933_ & 0xff00ff) * i_2026_ & ~0xff00ff;
						int i_2028_ = (i_1933_ & 0xff00) * i_2026_ & 0xff0000;
						i_1933_ = (i_2027_ | i_2028_) >>> 8;
						int i_2029_ = i_1936_;
						for (int i_2030_ = -i_1931_; i_2030_ < 0; i_2030_++) {
							int i_2031_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2032_ = -i_1930_; i_2032_ < 0; i_2032_++) {
								int i_2033_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_2031_]);
								if (i_2033_ != 0) {
									int i_2034_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2033_ & 0xff]);
									i_2027_ = ((i_2034_ & 0xff00ff) * i_2025_ & ~0xff00ff);
									i_2028_ = ((i_2034_ & 0xff00) * i_2025_ & 0xff0000);
									is[i_1945_++] = ((i_2027_ | i_2028_) >>> 8) + i_1933_;
								} else
									i_1945_++;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_2029_;
							i_1945_ += i_1946_;
						}
					} else
						throw new IllegalArgumentException();
				} else if (i_1934_ == 2) {
					if (i_1932_ == 1) {
						int i_2035_ = i_1936_;
						for (int i_2036_ = -i_1931_; i_2036_ < 0; i_2036_++) {
							int i_2037_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2038_ = -i_1930_; i_2038_ < 0; i_2038_++) {
								int i_2039_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_2037_]);
								if (i_2039_ != 0) {
									int i_2040_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2039_ & 0xff]);
									int i_2041_ = is[i_1945_];
									int i_2042_ = i_2040_ + i_2041_;
									int i_2043_ = ((i_2040_ & 0xff00ff) + (i_2041_ & 0xff00ff));
									i_2041_ = ((i_2043_ & 0x1000100) + (i_2042_ - i_2043_ & 0x10000));
									is[i_1945_++] = (i_2042_ - i_2041_ | i_2041_ - (i_2041_ >>> 8));
								} else
									i_1945_++;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_2035_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 0) {
						int i_2044_ = i_1936_;
						int i_2045_ = (i_1933_ & 0xff0000) >> 16;
						int i_2046_ = (i_1933_ & 0xff00) >> 8;
						int i_2047_ = i_1933_ & 0xff;
						for (int i_2048_ = -i_1931_; i_2048_ < 0; i_2048_++) {
							int i_2049_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2050_ = -i_1930_; i_2050_ < 0; i_2050_++) {
								int i_2051_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_2049_]);
								if (i_2051_ != 0) {
									int i_2052_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2051_ & 0xff]);
									int i_2053_ = ((i_2052_ & 0xff0000) * i_2045_ & ~0xffffff);
									int i_2054_ = ((i_2052_ & 0xff00) * i_2046_ & 0xff0000);
									int i_2055_ = (i_2052_ & 0xff) * i_2047_ & 0xff00;
									i_2052_ = (i_2053_ | i_2054_ | i_2055_) >>> 8;
									int i_2056_ = is[i_1945_];
									int i_2057_ = i_2052_ + i_2056_;
									int i_2058_ = ((i_2052_ & 0xff00ff) + (i_2056_ & 0xff00ff));
									i_2056_ = ((i_2058_ & 0x1000100) + (i_2057_ - i_2058_ & 0x10000));
									is[i_1945_++] = (i_2057_ - i_2056_ | i_2056_ - (i_2056_ >>> 8));
								} else
									i_1945_++;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_2044_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 3) {
						int i_2059_ = i_1936_;
						for (int i_2060_ = -i_1931_; i_2060_ < 0; i_2060_++) {
							int i_2061_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2062_ = -i_1930_; i_2062_ < 0; i_2062_++) {
								byte i_2063_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_2061_]);
								int i_2064_ = (i_2063_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2063_]) : 0);
								int i_2065_ = i_2064_ + i_1933_;
								int i_2066_ = ((i_2064_ & 0xff00ff) + (i_1933_ & 0xff00ff));
								int i_2067_ = ((i_2066_ & 0x1000100) + (i_2065_ - i_2066_ & 0x10000));
								i_2064_ = i_2065_ - i_2067_ | i_2067_ - (i_2067_ >>> 8);
								i_2067_ = is[i_1945_];
								i_2065_ = i_2064_ + i_2067_;
								i_2066_ = (i_2064_ & 0xff00ff) + (i_2067_ & 0xff00ff);
								i_2067_ = ((i_2066_ & 0x1000100) + (i_2065_ - i_2066_ & 0x10000));
								is[i_1945_++] = i_2065_ - i_2067_ | i_2067_ - (i_2067_ >>> 8);
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_2059_;
							i_1945_ += i_1946_;
						}
					} else if (i_1932_ == 2) {
						int i_2068_ = i_1933_ >>> 24;
						int i_2069_ = 256 - i_2068_;
						int i_2070_ = (i_1933_ & 0xff00ff) * i_2069_ & ~0xff00ff;
						int i_2071_ = (i_1933_ & 0xff00) * i_2069_ & 0xff0000;
						i_1933_ = (i_2070_ | i_2071_) >>> 8;
						int i_2072_ = i_1936_;
						for (int i_2073_ = -i_1931_; i_2073_ < 0; i_2073_++) {
							int i_2074_ = ((i_1937_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2075_ = -i_1930_; i_2075_ < 0; i_2075_++) {
								int i_2076_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_1936_ >> 16) + i_2074_]);
								if (i_2076_ != 0) {
									int i_2077_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2076_ & 0xff]);
									i_2070_ = ((i_2077_ & 0xff00ff) * i_2068_ & ~0xff00ff);
									i_2071_ = ((i_2077_ & 0xff00) * i_2068_ & 0xff0000);
									i_2077_ = (((i_2070_ | i_2071_) >>> 8) + i_1933_);
									int i_2078_ = is[i_1945_];
									int i_2079_ = i_2077_ + i_2078_;
									int i_2080_ = ((i_2077_ & 0xff00ff) + (i_2078_ & 0xff00ff));
									i_2078_ = ((i_2080_ & 0x1000100) + (i_2079_ - i_2080_ & 0x10000));
									is[i_1945_++] = (i_2079_ - i_2078_ | i_2078_ - (i_2078_ >>> 8));
								} else
									i_1945_++;
								i_1936_ += i_1941_;
							}
							i_1937_ += i_1942_;
							i_1936_ = i_2072_;
							i_1945_ += i_1946_;
						}
					} else
						throw new IllegalArgumentException();
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	void method747(boolean bool, boolean bool_2081_, boolean bool_2082_, int i, int i_2083_, float f, int i_2084_, int i_2085_, int i_2086_, int i_2087_, int i_2088_, int i_2089_, boolean bool_2090_) {
		if (i_2084_ > 0 && i_2085_ > 0 && (bool || bool_2081_)) {
			int i_2091_ = 0;
			int i_2092_ = 0;
			int i_2093_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
			int i_2094_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
			int i_2095_ = (i_2093_ << 16) / i_2084_;
			int i_2096_ = (i_2094_ << 16) / i_2085_;
			if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
				int i_2097_ = (((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_2095_ - 1) / i_2095_);
				i += i_2097_;
				i_2091_ += (i_2097_ * i_2095_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
				int i_2098_ = (((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_2096_ - 1) / i_2096_);
				i_2083_ += i_2098_;
				i_2092_ += (i_2098_ * i_2096_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9358 < i_2093_)
				i_2084_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_2091_ + i_2095_ - 1) / i_2095_;
			if (((Class61_Sub3_Sub3) this).anInt9325 < i_2094_)
				i_2085_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_2092_ + i_2096_ - 1) / i_2096_;
			int i_2099_ = i + i_2083_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2100_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_2084_);
			if (i_2083_ + i_2085_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_2085_ -= (i_2083_ + i_2085_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_2083_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2101_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2083_);
				i_2085_ -= i_2101_;
				i_2099_ += i_2101_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2092_ += i_2096_ * i_2101_;
			}
			if (i + i_2084_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2102_ = (i + i_2084_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_2084_ -= i_2102_;
				i_2100_ += i_2102_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2103_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_2084_ -= i_2103_;
				i_2099_ += i_2103_;
				i_2091_ += i_2095_ * i_2103_;
				i_2100_ += i_2103_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2088_ == 0) {
				if (i_2086_ == 1) {
					int i_2104_ = i_2091_;
					for (int i_2105_ = -i_2085_; i_2105_ < 0; i_2105_++) {
						int i_2106_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2107_ = -i_2084_; i_2107_ < 0; i_2107_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								if (bool)
									is[i_2099_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2106_]) & 0xff)]);
								if (bool_2081_ && bool_2090_)
									fs[i_2099_] = f;
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2104_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 0) {
					int i_2108_ = (i_2087_ & 0xff0000) >> 16;
					int i_2109_ = (i_2087_ & 0xff00) >> 8;
					int i_2110_ = i_2087_ & 0xff;
					int i_2111_ = i_2091_;
					for (int i_2112_ = -i_2085_; i_2112_ < 0; i_2112_++) {
						int i_2113_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2114_ = -i_2084_; i_2114_ < 0; i_2114_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								if (bool) {
									int i_2115_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2113_]) & 0xff)]);
									int i_2116_ = ((i_2115_ & 0xff0000) * i_2108_ & ~0xffffff);
									int i_2117_ = ((i_2115_ & 0xff00) * i_2109_ & 0xff0000);
									int i_2118_ = (i_2115_ & 0xff) * i_2110_ & 0xff00;
									is[i_2099_] = (i_2116_ | i_2117_ | i_2118_) >>> 8;
								}
								if (bool_2081_ && bool_2090_)
									fs[i_2099_] = f;
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2111_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 3) {
					int i_2119_ = i_2091_;
					for (int i_2120_ = -i_2085_; i_2120_ < 0; i_2120_++) {
						int i_2121_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2122_ = -i_2084_; i_2122_ < 0; i_2122_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								if (bool) {
									byte i_2123_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2121_]);
									int i_2124_ = (i_2123_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2123_]) : 0);
									int i_2125_ = i_2124_ + i_2087_;
									int i_2126_ = ((i_2124_ & 0xff00ff) + (i_2087_ & 0xff00ff));
									int i_2127_ = ((i_2126_ & 0x1000100) + (i_2125_ - i_2126_ & 0x10000));
									is[i_2099_] = (i_2125_ - i_2127_ | i_2127_ - (i_2127_ >>> 8));
								}
								if (bool_2081_ && bool_2090_)
									fs[i_2099_] = f;
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2119_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 2) {
					int i_2128_ = i_2087_ >>> 24;
					int i_2129_ = 256 - i_2128_;
					int i_2130_ = (i_2087_ & 0xff00ff) * i_2129_ & ~0xff00ff;
					int i_2131_ = (i_2087_ & 0xff00) * i_2129_ & 0xff0000;
					i_2087_ = (i_2130_ | i_2131_) >>> 8;
					int i_2132_ = i_2091_;
					for (int i_2133_ = -i_2085_; i_2133_ < 0; i_2133_++) {
						int i_2134_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2135_ = -i_2084_; i_2135_ < 0; i_2135_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								if (bool) {
									int i_2136_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2134_]) & 0xff)]);
									i_2130_ = ((i_2136_ & 0xff00ff) * i_2128_ & ~0xff00ff);
									i_2131_ = ((i_2136_ & 0xff00) * i_2128_ & 0xff0000);
									is[i_2099_] = (((i_2130_ | i_2131_) >>> 8) + i_2087_);
								}
								if (bool_2081_ && bool_2090_)
									fs[i_2099_] = f;
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2132_;
						i_2099_ += i_2100_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2088_ == 1) {
				if (i_2086_ == 1) {
					int i_2137_ = i_2091_;
					for (int i_2138_ = -i_2085_; i_2138_ < 0; i_2138_++) {
						int i_2139_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2140_ = -i_2084_; i_2140_ < 0; i_2140_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								int i_2141_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2139_]);
								if (i_2141_ != 0) {
									if (bool)
										is[i_2099_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2141_ & 0xff]);
									if (bool_2081_ && bool_2090_)
										fs[i_2099_] = f;
								}
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2137_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 0) {
					int i_2142_ = i_2091_;
					if ((i_2087_ & 0xffffff) == 16777215) {
						int i_2143_ = i_2087_ >>> 24;
						int i_2144_ = 256 - i_2143_;
						for (int i_2145_ = -i_2085_; i_2145_ < 0; i_2145_++) {
							int i_2146_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2147_ = -i_2084_; i_2147_ < 0; i_2147_++) {
								if (!bool_2081_ || f < fs[i_2099_]) {
									int i_2148_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2146_]);
									if (i_2148_ != 0) {
										if (bool) {
											int i_2149_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2148_ & 0xff]);
											int i_2150_ = is[i_2099_];
											is[i_2099_] = (((((i_2149_ & 0xff00ff) * i_2143_) + ((i_2150_ & 0xff00ff) * i_2144_)) & ~0xff00ff) + ((((i_2149_ & 0xff00) * i_2143_) + ((i_2150_ & 0xff00) * i_2144_)) & 0xff0000)) >> 8;
										}
										if (bool_2081_ && bool_2090_)
											fs[i_2099_] = f;
									}
								}
								i_2091_ += i_2095_;
								i_2099_++;
							}
							i_2092_ += i_2096_;
							i_2091_ = i_2142_;
							i_2099_ += i_2100_;
						}
					} else {
						int i_2151_ = (i_2087_ & 0xff0000) >> 16;
						int i_2152_ = (i_2087_ & 0xff00) >> 8;
						int i_2153_ = i_2087_ & 0xff;
						int i_2154_ = i_2087_ >>> 24;
						int i_2155_ = 256 - i_2154_;
						for (int i_2156_ = -i_2085_; i_2156_ < 0; i_2156_++) {
							int i_2157_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2158_ = -i_2084_; i_2158_ < 0; i_2158_++) {
								if (!bool_2081_ || f < fs[i_2099_]) {
									int i_2159_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2157_]);
									if (i_2159_ != 0) {
										int i_2160_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2159_ & 0xff]);
										if (i_2154_ != 255) {
											if (bool) {
												int i_2161_ = (((i_2160_ & 0xff0000) * i_2151_) & ~0xffffff);
												int i_2162_ = (((i_2160_ & 0xff00) * i_2152_) & 0xff0000);
												int i_2163_ = (((i_2160_ & 0xff) * i_2153_) & 0xff00);
												i_2160_ = (i_2161_ | i_2162_ | i_2163_) >>> 8;
												int i_2164_ = is[i_2099_];
												is[i_2099_] = (((((i_2160_ & 0xff00ff) * i_2154_) + ((i_2164_ & 0xff00ff) * i_2155_)) & ~0xff00ff) + ((((i_2160_ & 0xff00) * i_2154_) + ((i_2164_ & 0xff00) * i_2155_)) & 0xff0000)) >> 8;
											}
											if (bool_2081_ && bool_2090_)
												fs[i_2099_] = f;
										} else {
											if (bool) {
												int i_2165_ = (((i_2160_ & 0xff0000) * i_2151_) & ~0xffffff);
												int i_2166_ = (((i_2160_ & 0xff00) * i_2152_) & 0xff0000);
												int i_2167_ = (((i_2160_ & 0xff) * i_2153_) & 0xff00);
												is[i_2099_] = (i_2165_ | i_2166_ | i_2167_) >>> 8;
											}
											if (bool_2081_ && bool_2090_)
												fs[i_2099_] = f;
										}
									}
								}
								i_2091_ += i_2095_;
								i_2099_++;
							}
							i_2092_ += i_2096_;
							i_2091_ = i_2142_;
							i_2099_ += i_2100_;
						}
					}
				} else if (i_2086_ == 3) {
					int i_2168_ = i_2091_;
					int i_2169_ = i_2087_ >>> 24;
					int i_2170_ = 256 - i_2169_;
					for (int i_2171_ = -i_2085_; i_2171_ < 0; i_2171_++) {
						int i_2172_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2173_ = -i_2084_; i_2173_ < 0; i_2173_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								if (bool) {
									byte i_2174_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2172_]);
									int i_2175_ = (i_2174_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2174_]) : 0);
									int i_2176_ = i_2175_ + i_2087_;
									int i_2177_ = ((i_2175_ & 0xff00ff) + (i_2087_ & 0xff00ff));
									int i_2178_ = ((i_2177_ & 0x1000100) + (i_2176_ - i_2177_ & 0x10000));
									i_2178_ = (i_2176_ - i_2178_ | i_2178_ - (i_2178_ >>> 8));
									if (i_2175_ == 0 && i_2169_ != 255) {
										i_2175_ = i_2178_;
										i_2178_ = is[i_2099_];
										i_2178_ = ((((i_2175_ & 0xff00ff) * i_2169_ + ((i_2178_ & 0xff00ff) * i_2170_)) & ~0xff00ff) + (((i_2175_ & 0xff00) * i_2169_ + ((i_2178_ & 0xff00) * i_2170_)) & 0xff0000)) >> 8;
									}
									is[i_2099_] = i_2178_;
								}
								if (bool_2081_ && bool_2090_)
									fs[i_2099_] = f;
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2168_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 2) {
					int i_2179_ = i_2087_ >>> 24;
					int i_2180_ = 256 - i_2179_;
					int i_2181_ = (i_2087_ & 0xff00ff) * i_2180_ & ~0xff00ff;
					int i_2182_ = (i_2087_ & 0xff00) * i_2180_ & 0xff0000;
					i_2087_ = (i_2181_ | i_2182_) >>> 8;
					int i_2183_ = i_2091_;
					for (int i_2184_ = -i_2085_; i_2184_ < 0; i_2184_++) {
						int i_2185_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2186_ = -i_2084_; i_2186_ < 0; i_2186_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								int i_2187_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2185_]);
								if (i_2187_ != 0) {
									if (bool) {
										int i_2188_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2187_ & 0xff]);
										i_2181_ = ((i_2188_ & 0xff00ff) * i_2179_ & ~0xff00ff);
										i_2182_ = ((i_2188_ & 0xff00) * i_2179_ & 0xff0000);
										is[i_2099_] = ((i_2181_ | i_2182_) >>> 8) + i_2087_;
									}
									if (bool_2081_ && bool_2090_)
										fs[i_2099_] = f;
								}
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2183_;
						i_2099_ += i_2100_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2088_ == 2) {
				if (i_2086_ == 1) {
					int i_2189_ = i_2091_;
					for (int i_2190_ = -i_2085_; i_2190_ < 0; i_2190_++) {
						int i_2191_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2192_ = -i_2084_; i_2192_ < 0; i_2192_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								int i_2193_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2191_]);
								if (i_2193_ != 0) {
									if (bool) {
										int i_2194_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2193_ & 0xff]);
										int i_2195_ = is[i_2099_];
										int i_2196_ = i_2194_ + i_2195_;
										int i_2197_ = ((i_2194_ & 0xff00ff) + (i_2195_ & 0xff00ff));
										i_2195_ = ((i_2197_ & 0x1000100) + (i_2196_ - i_2197_ & 0x10000));
										is[i_2099_] = (i_2196_ - i_2195_ | i_2195_ - (i_2195_ >>> 8));
									}
									if (bool_2081_ && bool_2090_)
										fs[i_2099_] = f;
								}
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2189_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 0) {
					int i_2198_ = i_2091_;
					int i_2199_ = (i_2087_ & 0xff0000) >> 16;
					int i_2200_ = (i_2087_ & 0xff00) >> 8;
					int i_2201_ = i_2087_ & 0xff;
					for (int i_2202_ = -i_2085_; i_2202_ < 0; i_2202_++) {
						int i_2203_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2204_ = -i_2084_; i_2204_ < 0; i_2204_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								int i_2205_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2203_]);
								if (i_2205_ != 0) {
									if (bool) {
										int i_2206_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2205_ & 0xff]);
										int i_2207_ = ((i_2206_ & 0xff0000) * i_2199_ & ~0xffffff);
										int i_2208_ = ((i_2206_ & 0xff00) * i_2200_ & 0xff0000);
										int i_2209_ = ((i_2206_ & 0xff) * i_2201_ & 0xff00);
										i_2206_ = (i_2207_ | i_2208_ | i_2209_) >>> 8;
										int i_2210_ = is[i_2099_];
										int i_2211_ = i_2206_ + i_2210_;
										int i_2212_ = ((i_2206_ & 0xff00ff) + (i_2210_ & 0xff00ff));
										i_2210_ = ((i_2212_ & 0x1000100) + (i_2211_ - i_2212_ & 0x10000));
										is[i_2099_] = (i_2211_ - i_2210_ | i_2210_ - (i_2210_ >>> 8));
									}
									if (bool_2081_ && bool_2090_)
										fs[i_2099_] = f;
								}
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2198_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 3) {
					int i_2213_ = i_2091_;
					for (int i_2214_ = -i_2085_; i_2214_ < 0; i_2214_++) {
						int i_2215_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2216_ = -i_2084_; i_2216_ < 0; i_2216_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								if (bool) {
									byte i_2217_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2215_]);
									int i_2218_ = (i_2217_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2217_]) : 0);
									int i_2219_ = i_2218_ + i_2087_;
									int i_2220_ = ((i_2218_ & 0xff00ff) + (i_2087_ & 0xff00ff));
									int i_2221_ = ((i_2220_ & 0x1000100) + (i_2219_ - i_2220_ & 0x10000));
									i_2218_ = (i_2219_ - i_2221_ | i_2221_ - (i_2221_ >>> 8));
									i_2221_ = is[i_2099_];
									i_2219_ = i_2218_ + i_2221_;
									i_2220_ = (i_2218_ & 0xff00ff) + (i_2221_ & 0xff00ff);
									i_2221_ = ((i_2220_ & 0x1000100) + (i_2219_ - i_2220_ & 0x10000));
									is[i_2099_] = (i_2219_ - i_2221_ | i_2221_ - (i_2221_ >>> 8));
								}
								if (bool_2081_ && bool_2090_)
									fs[i_2099_] = f;
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2213_;
						i_2099_ += i_2100_;
					}
				} else if (i_2086_ == 2) {
					int i_2222_ = i_2087_ >>> 24;
					int i_2223_ = 256 - i_2222_;
					int i_2224_ = (i_2087_ & 0xff00ff) * i_2223_ & ~0xff00ff;
					int i_2225_ = (i_2087_ & 0xff00) * i_2223_ & 0xff0000;
					i_2087_ = (i_2224_ | i_2225_) >>> 8;
					int i_2226_ = i_2091_;
					for (int i_2227_ = -i_2085_; i_2227_ < 0; i_2227_++) {
						int i_2228_ = ((i_2092_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2229_ = -i_2084_; i_2229_ < 0; i_2229_++) {
							if (!bool_2081_ || f < fs[i_2099_]) {
								int i_2230_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2091_ >> 16) + i_2228_]);
								if (i_2230_ != 0) {
									if (bool) {
										int i_2231_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2230_ & 0xff]);
										i_2224_ = ((i_2231_ & 0xff00ff) * i_2222_ & ~0xff00ff);
										i_2225_ = ((i_2231_ & 0xff00) * i_2222_ & 0xff0000);
										i_2231_ = (((i_2224_ | i_2225_) >>> 8) + i_2087_);
										int i_2232_ = is[i_2099_];
										int i_2233_ = i_2231_ + i_2232_;
										int i_2234_ = ((i_2231_ & 0xff00ff) + (i_2232_ & 0xff00ff));
										i_2232_ = ((i_2234_ & 0x1000100) + (i_2233_ - i_2234_ & 0x10000));
										is[i_2099_] = (i_2233_ - i_2232_ | i_2232_ - (i_2232_ >>> 8));
									}
									if (bool_2081_ && bool_2090_)
										fs[i_2099_] = f;
								}
							}
							i_2091_ += i_2095_;
							i_2099_++;
						}
						i_2092_ += i_2096_;
						i_2091_ = i_2226_;
						i_2099_ += i_2100_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method744(boolean bool, boolean bool_2235_, boolean bool_2236_, int i, int i_2237_, float f, int i_2238_, int i_2239_, int i_2240_, int i_2241_, int i_2242_, int i_2243_, boolean bool_2244_) {
		if (i_2238_ > 0 && i_2239_ > 0 && (bool || bool_2235_)) {
			int i_2245_ = 0;
			int i_2246_ = 0;
			int i_2247_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
			int i_2248_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
			int i_2249_ = (i_2247_ << 16) / i_2238_;
			int i_2250_ = (i_2248_ << 16) / i_2239_;
			if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
				int i_2251_ = (((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_2249_ - 1) / i_2249_);
				i += i_2251_;
				i_2245_ += (i_2251_ * i_2249_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
				int i_2252_ = (((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_2250_ - 1) / i_2250_);
				i_2237_ += i_2252_;
				i_2246_ += (i_2252_ * i_2250_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9358 < i_2247_)
				i_2238_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_2245_ + i_2249_ - 1) / i_2249_;
			if (((Class61_Sub3_Sub3) this).anInt9325 < i_2248_)
				i_2239_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_2246_ + i_2250_ - 1) / i_2250_;
			int i_2253_ = i + i_2237_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2254_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_2238_);
			if (i_2237_ + i_2239_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_2239_ -= (i_2237_ + i_2239_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_2237_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2255_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2237_);
				i_2239_ -= i_2255_;
				i_2253_ += i_2255_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2246_ += i_2250_ * i_2255_;
			}
			if (i + i_2238_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2256_ = (i + i_2238_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_2238_ -= i_2256_;
				i_2254_ += i_2256_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2257_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_2238_ -= i_2257_;
				i_2253_ += i_2257_;
				i_2245_ += i_2249_ * i_2257_;
				i_2254_ += i_2257_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2242_ == 0) {
				if (i_2240_ == 1) {
					int i_2258_ = i_2245_;
					for (int i_2259_ = -i_2239_; i_2259_ < 0; i_2259_++) {
						int i_2260_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2261_ = -i_2238_; i_2261_ < 0; i_2261_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								if (bool)
									is[i_2253_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2260_]) & 0xff)]);
								if (bool_2235_ && bool_2244_)
									fs[i_2253_] = f;
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2258_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 0) {
					int i_2262_ = (i_2241_ & 0xff0000) >> 16;
					int i_2263_ = (i_2241_ & 0xff00) >> 8;
					int i_2264_ = i_2241_ & 0xff;
					int i_2265_ = i_2245_;
					for (int i_2266_ = -i_2239_; i_2266_ < 0; i_2266_++) {
						int i_2267_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2268_ = -i_2238_; i_2268_ < 0; i_2268_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								if (bool) {
									int i_2269_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2267_]) & 0xff)]);
									int i_2270_ = ((i_2269_ & 0xff0000) * i_2262_ & ~0xffffff);
									int i_2271_ = ((i_2269_ & 0xff00) * i_2263_ & 0xff0000);
									int i_2272_ = (i_2269_ & 0xff) * i_2264_ & 0xff00;
									is[i_2253_] = (i_2270_ | i_2271_ | i_2272_) >>> 8;
								}
								if (bool_2235_ && bool_2244_)
									fs[i_2253_] = f;
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2265_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 3) {
					int i_2273_ = i_2245_;
					for (int i_2274_ = -i_2239_; i_2274_ < 0; i_2274_++) {
						int i_2275_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2276_ = -i_2238_; i_2276_ < 0; i_2276_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								if (bool) {
									byte i_2277_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2275_]);
									int i_2278_ = (i_2277_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2277_]) : 0);
									int i_2279_ = i_2278_ + i_2241_;
									int i_2280_ = ((i_2278_ & 0xff00ff) + (i_2241_ & 0xff00ff));
									int i_2281_ = ((i_2280_ & 0x1000100) + (i_2279_ - i_2280_ & 0x10000));
									is[i_2253_] = (i_2279_ - i_2281_ | i_2281_ - (i_2281_ >>> 8));
								}
								if (bool_2235_ && bool_2244_)
									fs[i_2253_] = f;
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2273_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 2) {
					int i_2282_ = i_2241_ >>> 24;
					int i_2283_ = 256 - i_2282_;
					int i_2284_ = (i_2241_ & 0xff00ff) * i_2283_ & ~0xff00ff;
					int i_2285_ = (i_2241_ & 0xff00) * i_2283_ & 0xff0000;
					i_2241_ = (i_2284_ | i_2285_) >>> 8;
					int i_2286_ = i_2245_;
					for (int i_2287_ = -i_2239_; i_2287_ < 0; i_2287_++) {
						int i_2288_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2289_ = -i_2238_; i_2289_ < 0; i_2289_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								if (bool) {
									int i_2290_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2288_]) & 0xff)]);
									i_2284_ = ((i_2290_ & 0xff00ff) * i_2282_ & ~0xff00ff);
									i_2285_ = ((i_2290_ & 0xff00) * i_2282_ & 0xff0000);
									is[i_2253_] = (((i_2284_ | i_2285_) >>> 8) + i_2241_);
								}
								if (bool_2235_ && bool_2244_)
									fs[i_2253_] = f;
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2286_;
						i_2253_ += i_2254_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2242_ == 1) {
				if (i_2240_ == 1) {
					int i_2291_ = i_2245_;
					for (int i_2292_ = -i_2239_; i_2292_ < 0; i_2292_++) {
						int i_2293_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2294_ = -i_2238_; i_2294_ < 0; i_2294_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								int i_2295_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2293_]);
								if (i_2295_ != 0) {
									if (bool)
										is[i_2253_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2295_ & 0xff]);
									if (bool_2235_ && bool_2244_)
										fs[i_2253_] = f;
								}
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2291_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 0) {
					int i_2296_ = i_2245_;
					if ((i_2241_ & 0xffffff) == 16777215) {
						int i_2297_ = i_2241_ >>> 24;
						int i_2298_ = 256 - i_2297_;
						for (int i_2299_ = -i_2239_; i_2299_ < 0; i_2299_++) {
							int i_2300_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2301_ = -i_2238_; i_2301_ < 0; i_2301_++) {
								if (!bool_2235_ || f < fs[i_2253_]) {
									int i_2302_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2300_]);
									if (i_2302_ != 0) {
										if (bool) {
											int i_2303_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2302_ & 0xff]);
											int i_2304_ = is[i_2253_];
											is[i_2253_] = (((((i_2303_ & 0xff00ff) * i_2297_) + ((i_2304_ & 0xff00ff) * i_2298_)) & ~0xff00ff) + ((((i_2303_ & 0xff00) * i_2297_) + ((i_2304_ & 0xff00) * i_2298_)) & 0xff0000)) >> 8;
										}
										if (bool_2235_ && bool_2244_)
											fs[i_2253_] = f;
									}
								}
								i_2245_ += i_2249_;
								i_2253_++;
							}
							i_2246_ += i_2250_;
							i_2245_ = i_2296_;
							i_2253_ += i_2254_;
						}
					} else {
						int i_2305_ = (i_2241_ & 0xff0000) >> 16;
						int i_2306_ = (i_2241_ & 0xff00) >> 8;
						int i_2307_ = i_2241_ & 0xff;
						int i_2308_ = i_2241_ >>> 24;
						int i_2309_ = 256 - i_2308_;
						for (int i_2310_ = -i_2239_; i_2310_ < 0; i_2310_++) {
							int i_2311_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2312_ = -i_2238_; i_2312_ < 0; i_2312_++) {
								if (!bool_2235_ || f < fs[i_2253_]) {
									int i_2313_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2311_]);
									if (i_2313_ != 0) {
										int i_2314_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2313_ & 0xff]);
										if (i_2308_ != 255) {
											if (bool) {
												int i_2315_ = (((i_2314_ & 0xff0000) * i_2305_) & ~0xffffff);
												int i_2316_ = (((i_2314_ & 0xff00) * i_2306_) & 0xff0000);
												int i_2317_ = (((i_2314_ & 0xff) * i_2307_) & 0xff00);
												i_2314_ = (i_2315_ | i_2316_ | i_2317_) >>> 8;
												int i_2318_ = is[i_2253_];
												is[i_2253_] = (((((i_2314_ & 0xff00ff) * i_2308_) + ((i_2318_ & 0xff00ff) * i_2309_)) & ~0xff00ff) + ((((i_2314_ & 0xff00) * i_2308_) + ((i_2318_ & 0xff00) * i_2309_)) & 0xff0000)) >> 8;
											}
											if (bool_2235_ && bool_2244_)
												fs[i_2253_] = f;
										} else {
											if (bool) {
												int i_2319_ = (((i_2314_ & 0xff0000) * i_2305_) & ~0xffffff);
												int i_2320_ = (((i_2314_ & 0xff00) * i_2306_) & 0xff0000);
												int i_2321_ = (((i_2314_ & 0xff) * i_2307_) & 0xff00);
												is[i_2253_] = (i_2319_ | i_2320_ | i_2321_) >>> 8;
											}
											if (bool_2235_ && bool_2244_)
												fs[i_2253_] = f;
										}
									}
								}
								i_2245_ += i_2249_;
								i_2253_++;
							}
							i_2246_ += i_2250_;
							i_2245_ = i_2296_;
							i_2253_ += i_2254_;
						}
					}
				} else if (i_2240_ == 3) {
					int i_2322_ = i_2245_;
					int i_2323_ = i_2241_ >>> 24;
					int i_2324_ = 256 - i_2323_;
					for (int i_2325_ = -i_2239_; i_2325_ < 0; i_2325_++) {
						int i_2326_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2327_ = -i_2238_; i_2327_ < 0; i_2327_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								if (bool) {
									byte i_2328_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2326_]);
									int i_2329_ = (i_2328_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2328_]) : 0);
									int i_2330_ = i_2329_ + i_2241_;
									int i_2331_ = ((i_2329_ & 0xff00ff) + (i_2241_ & 0xff00ff));
									int i_2332_ = ((i_2331_ & 0x1000100) + (i_2330_ - i_2331_ & 0x10000));
									i_2332_ = (i_2330_ - i_2332_ | i_2332_ - (i_2332_ >>> 8));
									if (i_2329_ == 0 && i_2323_ != 255) {
										i_2329_ = i_2332_;
										i_2332_ = is[i_2253_];
										i_2332_ = ((((i_2329_ & 0xff00ff) * i_2323_ + ((i_2332_ & 0xff00ff) * i_2324_)) & ~0xff00ff) + (((i_2329_ & 0xff00) * i_2323_ + ((i_2332_ & 0xff00) * i_2324_)) & 0xff0000)) >> 8;
									}
									is[i_2253_] = i_2332_;
								}
								if (bool_2235_ && bool_2244_)
									fs[i_2253_] = f;
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2322_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 2) {
					int i_2333_ = i_2241_ >>> 24;
					int i_2334_ = 256 - i_2333_;
					int i_2335_ = (i_2241_ & 0xff00ff) * i_2334_ & ~0xff00ff;
					int i_2336_ = (i_2241_ & 0xff00) * i_2334_ & 0xff0000;
					i_2241_ = (i_2335_ | i_2336_) >>> 8;
					int i_2337_ = i_2245_;
					for (int i_2338_ = -i_2239_; i_2338_ < 0; i_2338_++) {
						int i_2339_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2340_ = -i_2238_; i_2340_ < 0; i_2340_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								int i_2341_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2339_]);
								if (i_2341_ != 0) {
									if (bool) {
										int i_2342_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2341_ & 0xff]);
										i_2335_ = ((i_2342_ & 0xff00ff) * i_2333_ & ~0xff00ff);
										i_2336_ = ((i_2342_ & 0xff00) * i_2333_ & 0xff0000);
										is[i_2253_] = ((i_2335_ | i_2336_) >>> 8) + i_2241_;
									}
									if (bool_2235_ && bool_2244_)
										fs[i_2253_] = f;
								}
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2337_;
						i_2253_ += i_2254_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2242_ == 2) {
				if (i_2240_ == 1) {
					int i_2343_ = i_2245_;
					for (int i_2344_ = -i_2239_; i_2344_ < 0; i_2344_++) {
						int i_2345_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2346_ = -i_2238_; i_2346_ < 0; i_2346_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								int i_2347_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2345_]);
								if (i_2347_ != 0) {
									if (bool) {
										int i_2348_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2347_ & 0xff]);
										int i_2349_ = is[i_2253_];
										int i_2350_ = i_2348_ + i_2349_;
										int i_2351_ = ((i_2348_ & 0xff00ff) + (i_2349_ & 0xff00ff));
										i_2349_ = ((i_2351_ & 0x1000100) + (i_2350_ - i_2351_ & 0x10000));
										is[i_2253_] = (i_2350_ - i_2349_ | i_2349_ - (i_2349_ >>> 8));
									}
									if (bool_2235_ && bool_2244_)
										fs[i_2253_] = f;
								}
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2343_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 0) {
					int i_2352_ = i_2245_;
					int i_2353_ = (i_2241_ & 0xff0000) >> 16;
					int i_2354_ = (i_2241_ & 0xff00) >> 8;
					int i_2355_ = i_2241_ & 0xff;
					for (int i_2356_ = -i_2239_; i_2356_ < 0; i_2356_++) {
						int i_2357_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2358_ = -i_2238_; i_2358_ < 0; i_2358_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								int i_2359_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2357_]);
								if (i_2359_ != 0) {
									if (bool) {
										int i_2360_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2359_ & 0xff]);
										int i_2361_ = ((i_2360_ & 0xff0000) * i_2353_ & ~0xffffff);
										int i_2362_ = ((i_2360_ & 0xff00) * i_2354_ & 0xff0000);
										int i_2363_ = ((i_2360_ & 0xff) * i_2355_ & 0xff00);
										i_2360_ = (i_2361_ | i_2362_ | i_2363_) >>> 8;
										int i_2364_ = is[i_2253_];
										int i_2365_ = i_2360_ + i_2364_;
										int i_2366_ = ((i_2360_ & 0xff00ff) + (i_2364_ & 0xff00ff));
										i_2364_ = ((i_2366_ & 0x1000100) + (i_2365_ - i_2366_ & 0x10000));
										is[i_2253_] = (i_2365_ - i_2364_ | i_2364_ - (i_2364_ >>> 8));
									}
									if (bool_2235_ && bool_2244_)
										fs[i_2253_] = f;
								}
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2352_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 3) {
					int i_2367_ = i_2245_;
					for (int i_2368_ = -i_2239_; i_2368_ < 0; i_2368_++) {
						int i_2369_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2370_ = -i_2238_; i_2370_ < 0; i_2370_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								if (bool) {
									byte i_2371_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2369_]);
									int i_2372_ = (i_2371_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2371_]) : 0);
									int i_2373_ = i_2372_ + i_2241_;
									int i_2374_ = ((i_2372_ & 0xff00ff) + (i_2241_ & 0xff00ff));
									int i_2375_ = ((i_2374_ & 0x1000100) + (i_2373_ - i_2374_ & 0x10000));
									i_2372_ = (i_2373_ - i_2375_ | i_2375_ - (i_2375_ >>> 8));
									i_2375_ = is[i_2253_];
									i_2373_ = i_2372_ + i_2375_;
									i_2374_ = (i_2372_ & 0xff00ff) + (i_2375_ & 0xff00ff);
									i_2375_ = ((i_2374_ & 0x1000100) + (i_2373_ - i_2374_ & 0x10000));
									is[i_2253_] = (i_2373_ - i_2375_ | i_2375_ - (i_2375_ >>> 8));
								}
								if (bool_2235_ && bool_2244_)
									fs[i_2253_] = f;
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2367_;
						i_2253_ += i_2254_;
					}
				} else if (i_2240_ == 2) {
					int i_2376_ = i_2241_ >>> 24;
					int i_2377_ = 256 - i_2376_;
					int i_2378_ = (i_2241_ & 0xff00ff) * i_2377_ & ~0xff00ff;
					int i_2379_ = (i_2241_ & 0xff00) * i_2377_ & 0xff0000;
					i_2241_ = (i_2378_ | i_2379_) >>> 8;
					int i_2380_ = i_2245_;
					for (int i_2381_ = -i_2239_; i_2381_ < 0; i_2381_++) {
						int i_2382_ = ((i_2246_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2383_ = -i_2238_; i_2383_ < 0; i_2383_++) {
							if (!bool_2235_ || f < fs[i_2253_]) {
								int i_2384_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2245_ >> 16) + i_2382_]);
								if (i_2384_ != 0) {
									if (bool) {
										int i_2385_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2384_ & 0xff]);
										i_2378_ = ((i_2385_ & 0xff00ff) * i_2376_ & ~0xff00ff);
										i_2379_ = ((i_2385_ & 0xff00) * i_2376_ & 0xff0000);
										i_2385_ = (((i_2378_ | i_2379_) >>> 8) + i_2241_);
										int i_2386_ = is[i_2253_];
										int i_2387_ = i_2385_ + i_2386_;
										int i_2388_ = ((i_2385_ & 0xff00ff) + (i_2386_ & 0xff00ff));
										i_2386_ = ((i_2388_ & 0x1000100) + (i_2387_ - i_2388_ & 0x10000));
										is[i_2253_] = (i_2387_ - i_2386_ | i_2386_ - (i_2386_ >>> 8));
									}
									if (bool_2235_ && bool_2244_)
										fs[i_2253_] = f;
								}
							}
							i_2245_ += i_2249_;
							i_2253_++;
						}
						i_2246_ += i_2250_;
						i_2245_ = i_2380_;
						i_2253_ += i_2254_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method754(boolean bool, boolean bool_2389_, boolean bool_2390_, int i, int i_2391_, float f, int i_2392_, int i_2393_, int i_2394_, int i_2395_, int i_2396_, int i_2397_, boolean bool_2398_) {
		if (i_2392_ > 0 && i_2393_ > 0 && (bool || bool_2389_)) {
			int i_2399_ = 0;
			int i_2400_ = 0;
			int i_2401_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
			int i_2402_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
			int i_2403_ = (i_2401_ << 16) / i_2392_;
			int i_2404_ = (i_2402_ << 16) / i_2393_;
			if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
				int i_2405_ = (((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_2403_ - 1) / i_2403_);
				i += i_2405_;
				i_2399_ += (i_2405_ * i_2403_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
				int i_2406_ = (((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_2404_ - 1) / i_2404_);
				i_2391_ += i_2406_;
				i_2400_ += (i_2406_ * i_2404_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9358 < i_2401_)
				i_2392_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_2399_ + i_2403_ - 1) / i_2403_;
			if (((Class61_Sub3_Sub3) this).anInt9325 < i_2402_)
				i_2393_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_2400_ + i_2404_ - 1) / i_2404_;
			int i_2407_ = i + i_2391_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2408_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_2392_);
			if (i_2391_ + i_2393_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_2393_ -= (i_2391_ + i_2393_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_2391_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2409_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2391_);
				i_2393_ -= i_2409_;
				i_2407_ += i_2409_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2400_ += i_2404_ * i_2409_;
			}
			if (i + i_2392_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2410_ = (i + i_2392_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_2392_ -= i_2410_;
				i_2408_ += i_2410_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2411_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_2392_ -= i_2411_;
				i_2407_ += i_2411_;
				i_2399_ += i_2403_ * i_2411_;
				i_2408_ += i_2411_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2396_ == 0) {
				if (i_2394_ == 1) {
					int i_2412_ = i_2399_;
					for (int i_2413_ = -i_2393_; i_2413_ < 0; i_2413_++) {
						int i_2414_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2415_ = -i_2392_; i_2415_ < 0; i_2415_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								if (bool)
									is[i_2407_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2414_]) & 0xff)]);
								if (bool_2389_ && bool_2398_)
									fs[i_2407_] = f;
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2412_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 0) {
					int i_2416_ = (i_2395_ & 0xff0000) >> 16;
					int i_2417_ = (i_2395_ & 0xff00) >> 8;
					int i_2418_ = i_2395_ & 0xff;
					int i_2419_ = i_2399_;
					for (int i_2420_ = -i_2393_; i_2420_ < 0; i_2420_++) {
						int i_2421_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2422_ = -i_2392_; i_2422_ < 0; i_2422_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								if (bool) {
									int i_2423_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2421_]) & 0xff)]);
									int i_2424_ = ((i_2423_ & 0xff0000) * i_2416_ & ~0xffffff);
									int i_2425_ = ((i_2423_ & 0xff00) * i_2417_ & 0xff0000);
									int i_2426_ = (i_2423_ & 0xff) * i_2418_ & 0xff00;
									is[i_2407_] = (i_2424_ | i_2425_ | i_2426_) >>> 8;
								}
								if (bool_2389_ && bool_2398_)
									fs[i_2407_] = f;
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2419_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 3) {
					int i_2427_ = i_2399_;
					for (int i_2428_ = -i_2393_; i_2428_ < 0; i_2428_++) {
						int i_2429_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2430_ = -i_2392_; i_2430_ < 0; i_2430_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								if (bool) {
									byte i_2431_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2429_]);
									int i_2432_ = (i_2431_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2431_]) : 0);
									int i_2433_ = i_2432_ + i_2395_;
									int i_2434_ = ((i_2432_ & 0xff00ff) + (i_2395_ & 0xff00ff));
									int i_2435_ = ((i_2434_ & 0x1000100) + (i_2433_ - i_2434_ & 0x10000));
									is[i_2407_] = (i_2433_ - i_2435_ | i_2435_ - (i_2435_ >>> 8));
								}
								if (bool_2389_ && bool_2398_)
									fs[i_2407_] = f;
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2427_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 2) {
					int i_2436_ = i_2395_ >>> 24;
					int i_2437_ = 256 - i_2436_;
					int i_2438_ = (i_2395_ & 0xff00ff) * i_2437_ & ~0xff00ff;
					int i_2439_ = (i_2395_ & 0xff00) * i_2437_ & 0xff0000;
					i_2395_ = (i_2438_ | i_2439_) >>> 8;
					int i_2440_ = i_2399_;
					for (int i_2441_ = -i_2393_; i_2441_ < 0; i_2441_++) {
						int i_2442_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2443_ = -i_2392_; i_2443_ < 0; i_2443_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								if (bool) {
									int i_2444_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2442_]) & 0xff)]);
									i_2438_ = ((i_2444_ & 0xff00ff) * i_2436_ & ~0xff00ff);
									i_2439_ = ((i_2444_ & 0xff00) * i_2436_ & 0xff0000);
									is[i_2407_] = (((i_2438_ | i_2439_) >>> 8) + i_2395_);
								}
								if (bool_2389_ && bool_2398_)
									fs[i_2407_] = f;
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2440_;
						i_2407_ += i_2408_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2396_ == 1) {
				if (i_2394_ == 1) {
					int i_2445_ = i_2399_;
					for (int i_2446_ = -i_2393_; i_2446_ < 0; i_2446_++) {
						int i_2447_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2448_ = -i_2392_; i_2448_ < 0; i_2448_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								int i_2449_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2447_]);
								if (i_2449_ != 0) {
									if (bool)
										is[i_2407_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2449_ & 0xff]);
									if (bool_2389_ && bool_2398_)
										fs[i_2407_] = f;
								}
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2445_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 0) {
					int i_2450_ = i_2399_;
					if ((i_2395_ & 0xffffff) == 16777215) {
						int i_2451_ = i_2395_ >>> 24;
						int i_2452_ = 256 - i_2451_;
						for (int i_2453_ = -i_2393_; i_2453_ < 0; i_2453_++) {
							int i_2454_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2455_ = -i_2392_; i_2455_ < 0; i_2455_++) {
								if (!bool_2389_ || f < fs[i_2407_]) {
									int i_2456_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2454_]);
									if (i_2456_ != 0) {
										if (bool) {
											int i_2457_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2456_ & 0xff]);
											int i_2458_ = is[i_2407_];
											is[i_2407_] = (((((i_2457_ & 0xff00ff) * i_2451_) + ((i_2458_ & 0xff00ff) * i_2452_)) & ~0xff00ff) + ((((i_2457_ & 0xff00) * i_2451_) + ((i_2458_ & 0xff00) * i_2452_)) & 0xff0000)) >> 8;
										}
										if (bool_2389_ && bool_2398_)
											fs[i_2407_] = f;
									}
								}
								i_2399_ += i_2403_;
								i_2407_++;
							}
							i_2400_ += i_2404_;
							i_2399_ = i_2450_;
							i_2407_ += i_2408_;
						}
					} else {
						int i_2459_ = (i_2395_ & 0xff0000) >> 16;
						int i_2460_ = (i_2395_ & 0xff00) >> 8;
						int i_2461_ = i_2395_ & 0xff;
						int i_2462_ = i_2395_ >>> 24;
						int i_2463_ = 256 - i_2462_;
						for (int i_2464_ = -i_2393_; i_2464_ < 0; i_2464_++) {
							int i_2465_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2466_ = -i_2392_; i_2466_ < 0; i_2466_++) {
								if (!bool_2389_ || f < fs[i_2407_]) {
									int i_2467_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2465_]);
									if (i_2467_ != 0) {
										int i_2468_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2467_ & 0xff]);
										if (i_2462_ != 255) {
											if (bool) {
												int i_2469_ = (((i_2468_ & 0xff0000) * i_2459_) & ~0xffffff);
												int i_2470_ = (((i_2468_ & 0xff00) * i_2460_) & 0xff0000);
												int i_2471_ = (((i_2468_ & 0xff) * i_2461_) & 0xff00);
												i_2468_ = (i_2469_ | i_2470_ | i_2471_) >>> 8;
												int i_2472_ = is[i_2407_];
												is[i_2407_] = (((((i_2468_ & 0xff00ff) * i_2462_) + ((i_2472_ & 0xff00ff) * i_2463_)) & ~0xff00ff) + ((((i_2468_ & 0xff00) * i_2462_) + ((i_2472_ & 0xff00) * i_2463_)) & 0xff0000)) >> 8;
											}
											if (bool_2389_ && bool_2398_)
												fs[i_2407_] = f;
										} else {
											if (bool) {
												int i_2473_ = (((i_2468_ & 0xff0000) * i_2459_) & ~0xffffff);
												int i_2474_ = (((i_2468_ & 0xff00) * i_2460_) & 0xff0000);
												int i_2475_ = (((i_2468_ & 0xff) * i_2461_) & 0xff00);
												is[i_2407_] = (i_2473_ | i_2474_ | i_2475_) >>> 8;
											}
											if (bool_2389_ && bool_2398_)
												fs[i_2407_] = f;
										}
									}
								}
								i_2399_ += i_2403_;
								i_2407_++;
							}
							i_2400_ += i_2404_;
							i_2399_ = i_2450_;
							i_2407_ += i_2408_;
						}
					}
				} else if (i_2394_ == 3) {
					int i_2476_ = i_2399_;
					int i_2477_ = i_2395_ >>> 24;
					int i_2478_ = 256 - i_2477_;
					for (int i_2479_ = -i_2393_; i_2479_ < 0; i_2479_++) {
						int i_2480_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2481_ = -i_2392_; i_2481_ < 0; i_2481_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								if (bool) {
									byte i_2482_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2480_]);
									int i_2483_ = (i_2482_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2482_]) : 0);
									int i_2484_ = i_2483_ + i_2395_;
									int i_2485_ = ((i_2483_ & 0xff00ff) + (i_2395_ & 0xff00ff));
									int i_2486_ = ((i_2485_ & 0x1000100) + (i_2484_ - i_2485_ & 0x10000));
									i_2486_ = (i_2484_ - i_2486_ | i_2486_ - (i_2486_ >>> 8));
									if (i_2483_ == 0 && i_2477_ != 255) {
										i_2483_ = i_2486_;
										i_2486_ = is[i_2407_];
										i_2486_ = ((((i_2483_ & 0xff00ff) * i_2477_ + ((i_2486_ & 0xff00ff) * i_2478_)) & ~0xff00ff) + (((i_2483_ & 0xff00) * i_2477_ + ((i_2486_ & 0xff00) * i_2478_)) & 0xff0000)) >> 8;
									}
									is[i_2407_] = i_2486_;
								}
								if (bool_2389_ && bool_2398_)
									fs[i_2407_] = f;
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2476_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 2) {
					int i_2487_ = i_2395_ >>> 24;
					int i_2488_ = 256 - i_2487_;
					int i_2489_ = (i_2395_ & 0xff00ff) * i_2488_ & ~0xff00ff;
					int i_2490_ = (i_2395_ & 0xff00) * i_2488_ & 0xff0000;
					i_2395_ = (i_2489_ | i_2490_) >>> 8;
					int i_2491_ = i_2399_;
					for (int i_2492_ = -i_2393_; i_2492_ < 0; i_2492_++) {
						int i_2493_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2494_ = -i_2392_; i_2494_ < 0; i_2494_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								int i_2495_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2493_]);
								if (i_2495_ != 0) {
									if (bool) {
										int i_2496_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2495_ & 0xff]);
										i_2489_ = ((i_2496_ & 0xff00ff) * i_2487_ & ~0xff00ff);
										i_2490_ = ((i_2496_ & 0xff00) * i_2487_ & 0xff0000);
										is[i_2407_] = ((i_2489_ | i_2490_) >>> 8) + i_2395_;
									}
									if (bool_2389_ && bool_2398_)
										fs[i_2407_] = f;
								}
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2491_;
						i_2407_ += i_2408_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2396_ == 2) {
				if (i_2394_ == 1) {
					int i_2497_ = i_2399_;
					for (int i_2498_ = -i_2393_; i_2498_ < 0; i_2498_++) {
						int i_2499_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2500_ = -i_2392_; i_2500_ < 0; i_2500_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								int i_2501_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2499_]);
								if (i_2501_ != 0) {
									if (bool) {
										int i_2502_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2501_ & 0xff]);
										int i_2503_ = is[i_2407_];
										int i_2504_ = i_2502_ + i_2503_;
										int i_2505_ = ((i_2502_ & 0xff00ff) + (i_2503_ & 0xff00ff));
										i_2503_ = ((i_2505_ & 0x1000100) + (i_2504_ - i_2505_ & 0x10000));
										is[i_2407_] = (i_2504_ - i_2503_ | i_2503_ - (i_2503_ >>> 8));
									}
									if (bool_2389_ && bool_2398_)
										fs[i_2407_] = f;
								}
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2497_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 0) {
					int i_2506_ = i_2399_;
					int i_2507_ = (i_2395_ & 0xff0000) >> 16;
					int i_2508_ = (i_2395_ & 0xff00) >> 8;
					int i_2509_ = i_2395_ & 0xff;
					for (int i_2510_ = -i_2393_; i_2510_ < 0; i_2510_++) {
						int i_2511_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2512_ = -i_2392_; i_2512_ < 0; i_2512_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								int i_2513_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2511_]);
								if (i_2513_ != 0) {
									if (bool) {
										int i_2514_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2513_ & 0xff]);
										int i_2515_ = ((i_2514_ & 0xff0000) * i_2507_ & ~0xffffff);
										int i_2516_ = ((i_2514_ & 0xff00) * i_2508_ & 0xff0000);
										int i_2517_ = ((i_2514_ & 0xff) * i_2509_ & 0xff00);
										i_2514_ = (i_2515_ | i_2516_ | i_2517_) >>> 8;
										int i_2518_ = is[i_2407_];
										int i_2519_ = i_2514_ + i_2518_;
										int i_2520_ = ((i_2514_ & 0xff00ff) + (i_2518_ & 0xff00ff));
										i_2518_ = ((i_2520_ & 0x1000100) + (i_2519_ - i_2520_ & 0x10000));
										is[i_2407_] = (i_2519_ - i_2518_ | i_2518_ - (i_2518_ >>> 8));
									}
									if (bool_2389_ && bool_2398_)
										fs[i_2407_] = f;
								}
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2506_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 3) {
					int i_2521_ = i_2399_;
					for (int i_2522_ = -i_2393_; i_2522_ < 0; i_2522_++) {
						int i_2523_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2524_ = -i_2392_; i_2524_ < 0; i_2524_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								if (bool) {
									byte i_2525_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2523_]);
									int i_2526_ = (i_2525_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2525_]) : 0);
									int i_2527_ = i_2526_ + i_2395_;
									int i_2528_ = ((i_2526_ & 0xff00ff) + (i_2395_ & 0xff00ff));
									int i_2529_ = ((i_2528_ & 0x1000100) + (i_2527_ - i_2528_ & 0x10000));
									i_2526_ = (i_2527_ - i_2529_ | i_2529_ - (i_2529_ >>> 8));
									i_2529_ = is[i_2407_];
									i_2527_ = i_2526_ + i_2529_;
									i_2528_ = (i_2526_ & 0xff00ff) + (i_2529_ & 0xff00ff);
									i_2529_ = ((i_2528_ & 0x1000100) + (i_2527_ - i_2528_ & 0x10000));
									is[i_2407_] = (i_2527_ - i_2529_ | i_2529_ - (i_2529_ >>> 8));
								}
								if (bool_2389_ && bool_2398_)
									fs[i_2407_] = f;
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2521_;
						i_2407_ += i_2408_;
					}
				} else if (i_2394_ == 2) {
					int i_2530_ = i_2395_ >>> 24;
					int i_2531_ = 256 - i_2530_;
					int i_2532_ = (i_2395_ & 0xff00ff) * i_2531_ & ~0xff00ff;
					int i_2533_ = (i_2395_ & 0xff00) * i_2531_ & 0xff0000;
					i_2395_ = (i_2532_ | i_2533_) >>> 8;
					int i_2534_ = i_2399_;
					for (int i_2535_ = -i_2393_; i_2535_ < 0; i_2535_++) {
						int i_2536_ = ((i_2400_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2537_ = -i_2392_; i_2537_ < 0; i_2537_++) {
							if (!bool_2389_ || f < fs[i_2407_]) {
								int i_2538_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2399_ >> 16) + i_2536_]);
								if (i_2538_ != 0) {
									if (bool) {
										int i_2539_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2538_ & 0xff]);
										i_2532_ = ((i_2539_ & 0xff00ff) * i_2530_ & ~0xff00ff);
										i_2533_ = ((i_2539_ & 0xff00) * i_2530_ & 0xff0000);
										i_2539_ = (((i_2532_ | i_2533_) >>> 8) + i_2395_);
										int i_2540_ = is[i_2407_];
										int i_2541_ = i_2539_ + i_2540_;
										int i_2542_ = ((i_2539_ & 0xff00ff) + (i_2540_ & 0xff00ff));
										i_2540_ = ((i_2542_ & 0x1000100) + (i_2541_ - i_2542_ & 0x10000));
										is[i_2407_] = (i_2541_ - i_2540_ | i_2540_ - (i_2540_ >>> 8));
									}
									if (bool_2389_ && bool_2398_)
										fs[i_2407_] = f;
								}
							}
							i_2399_ += i_2403_;
							i_2407_++;
						}
						i_2400_ += i_2404_;
						i_2399_ = i_2534_;
						i_2407_ += i_2408_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method748(boolean bool, boolean bool_2543_, boolean bool_2544_, int i, int i_2545_, float f, int i_2546_, int i_2547_, int i_2548_, int i_2549_, int i_2550_, int i_2551_, boolean bool_2552_) {
		if (i_2546_ > 0 && i_2547_ > 0 && (bool || bool_2543_)) {
			int i_2553_ = 0;
			int i_2554_ = 0;
			int i_2555_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
			int i_2556_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
			int i_2557_ = (i_2555_ << 16) / i_2546_;
			int i_2558_ = (i_2556_ << 16) / i_2547_;
			if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
				int i_2559_ = (((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_2557_ - 1) / i_2557_);
				i += i_2559_;
				i_2553_ += (i_2559_ * i_2557_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
				int i_2560_ = (((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_2558_ - 1) / i_2558_);
				i_2545_ += i_2560_;
				i_2554_ += (i_2560_ * i_2558_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9358 < i_2555_)
				i_2546_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_2553_ + i_2557_ - 1) / i_2557_;
			if (((Class61_Sub3_Sub3) this).anInt9325 < i_2556_)
				i_2547_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_2554_ + i_2558_ - 1) / i_2558_;
			int i_2561_ = i + i_2545_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2562_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_2546_);
			if (i_2545_ + i_2547_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_2547_ -= (i_2545_ + i_2547_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_2545_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2563_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2545_);
				i_2547_ -= i_2563_;
				i_2561_ += i_2563_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2554_ += i_2558_ * i_2563_;
			}
			if (i + i_2546_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2564_ = (i + i_2546_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_2546_ -= i_2564_;
				i_2562_ += i_2564_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2565_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_2546_ -= i_2565_;
				i_2561_ += i_2565_;
				i_2553_ += i_2557_ * i_2565_;
				i_2562_ += i_2565_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2550_ == 0) {
				if (i_2548_ == 1) {
					int i_2566_ = i_2553_;
					for (int i_2567_ = -i_2547_; i_2567_ < 0; i_2567_++) {
						int i_2568_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2569_ = -i_2546_; i_2569_ < 0; i_2569_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								if (bool)
									is[i_2561_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2568_]) & 0xff)]);
								if (bool_2543_ && bool_2552_)
									fs[i_2561_] = f;
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2566_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 0) {
					int i_2570_ = (i_2549_ & 0xff0000) >> 16;
					int i_2571_ = (i_2549_ & 0xff00) >> 8;
					int i_2572_ = i_2549_ & 0xff;
					int i_2573_ = i_2553_;
					for (int i_2574_ = -i_2547_; i_2574_ < 0; i_2574_++) {
						int i_2575_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2576_ = -i_2546_; i_2576_ < 0; i_2576_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								if (bool) {
									int i_2577_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2575_]) & 0xff)]);
									int i_2578_ = ((i_2577_ & 0xff0000) * i_2570_ & ~0xffffff);
									int i_2579_ = ((i_2577_ & 0xff00) * i_2571_ & 0xff0000);
									int i_2580_ = (i_2577_ & 0xff) * i_2572_ & 0xff00;
									is[i_2561_] = (i_2578_ | i_2579_ | i_2580_) >>> 8;
								}
								if (bool_2543_ && bool_2552_)
									fs[i_2561_] = f;
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2573_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 3) {
					int i_2581_ = i_2553_;
					for (int i_2582_ = -i_2547_; i_2582_ < 0; i_2582_++) {
						int i_2583_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2584_ = -i_2546_; i_2584_ < 0; i_2584_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								if (bool) {
									byte i_2585_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2583_]);
									int i_2586_ = (i_2585_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2585_]) : 0);
									int i_2587_ = i_2586_ + i_2549_;
									int i_2588_ = ((i_2586_ & 0xff00ff) + (i_2549_ & 0xff00ff));
									int i_2589_ = ((i_2588_ & 0x1000100) + (i_2587_ - i_2588_ & 0x10000));
									is[i_2561_] = (i_2587_ - i_2589_ | i_2589_ - (i_2589_ >>> 8));
								}
								if (bool_2543_ && bool_2552_)
									fs[i_2561_] = f;
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2581_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 2) {
					int i_2590_ = i_2549_ >>> 24;
					int i_2591_ = 256 - i_2590_;
					int i_2592_ = (i_2549_ & 0xff00ff) * i_2591_ & ~0xff00ff;
					int i_2593_ = (i_2549_ & 0xff00) * i_2591_ & 0xff0000;
					i_2549_ = (i_2592_ | i_2593_) >>> 8;
					int i_2594_ = i_2553_;
					for (int i_2595_ = -i_2547_; i_2595_ < 0; i_2595_++) {
						int i_2596_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2597_ = -i_2546_; i_2597_ < 0; i_2597_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								if (bool) {
									int i_2598_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2596_]) & 0xff)]);
									i_2592_ = ((i_2598_ & 0xff00ff) * i_2590_ & ~0xff00ff);
									i_2593_ = ((i_2598_ & 0xff00) * i_2590_ & 0xff0000);
									is[i_2561_] = (((i_2592_ | i_2593_) >>> 8) + i_2549_);
								}
								if (bool_2543_ && bool_2552_)
									fs[i_2561_] = f;
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2594_;
						i_2561_ += i_2562_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2550_ == 1) {
				if (i_2548_ == 1) {
					int i_2599_ = i_2553_;
					for (int i_2600_ = -i_2547_; i_2600_ < 0; i_2600_++) {
						int i_2601_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2602_ = -i_2546_; i_2602_ < 0; i_2602_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								int i_2603_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2601_]);
								if (i_2603_ != 0) {
									if (bool)
										is[i_2561_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2603_ & 0xff]);
									if (bool_2543_ && bool_2552_)
										fs[i_2561_] = f;
								}
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2599_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 0) {
					int i_2604_ = i_2553_;
					if ((i_2549_ & 0xffffff) == 16777215) {
						int i_2605_ = i_2549_ >>> 24;
						int i_2606_ = 256 - i_2605_;
						for (int i_2607_ = -i_2547_; i_2607_ < 0; i_2607_++) {
							int i_2608_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2609_ = -i_2546_; i_2609_ < 0; i_2609_++) {
								if (!bool_2543_ || f < fs[i_2561_]) {
									int i_2610_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2608_]);
									if (i_2610_ != 0) {
										if (bool) {
											int i_2611_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2610_ & 0xff]);
											int i_2612_ = is[i_2561_];
											is[i_2561_] = (((((i_2611_ & 0xff00ff) * i_2605_) + ((i_2612_ & 0xff00ff) * i_2606_)) & ~0xff00ff) + ((((i_2611_ & 0xff00) * i_2605_) + ((i_2612_ & 0xff00) * i_2606_)) & 0xff0000)) >> 8;
										}
										if (bool_2543_ && bool_2552_)
											fs[i_2561_] = f;
									}
								}
								i_2553_ += i_2557_;
								i_2561_++;
							}
							i_2554_ += i_2558_;
							i_2553_ = i_2604_;
							i_2561_ += i_2562_;
						}
					} else {
						int i_2613_ = (i_2549_ & 0xff0000) >> 16;
						int i_2614_ = (i_2549_ & 0xff00) >> 8;
						int i_2615_ = i_2549_ & 0xff;
						int i_2616_ = i_2549_ >>> 24;
						int i_2617_ = 256 - i_2616_;
						for (int i_2618_ = -i_2547_; i_2618_ < 0; i_2618_++) {
							int i_2619_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2620_ = -i_2546_; i_2620_ < 0; i_2620_++) {
								if (!bool_2543_ || f < fs[i_2561_]) {
									int i_2621_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2619_]);
									if (i_2621_ != 0) {
										int i_2622_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2621_ & 0xff]);
										if (i_2616_ != 255) {
											if (bool) {
												int i_2623_ = (((i_2622_ & 0xff0000) * i_2613_) & ~0xffffff);
												int i_2624_ = (((i_2622_ & 0xff00) * i_2614_) & 0xff0000);
												int i_2625_ = (((i_2622_ & 0xff) * i_2615_) & 0xff00);
												i_2622_ = (i_2623_ | i_2624_ | i_2625_) >>> 8;
												int i_2626_ = is[i_2561_];
												is[i_2561_] = (((((i_2622_ & 0xff00ff) * i_2616_) + ((i_2626_ & 0xff00ff) * i_2617_)) & ~0xff00ff) + ((((i_2622_ & 0xff00) * i_2616_) + ((i_2626_ & 0xff00) * i_2617_)) & 0xff0000)) >> 8;
											}
											if (bool_2543_ && bool_2552_)
												fs[i_2561_] = f;
										} else {
											if (bool) {
												int i_2627_ = (((i_2622_ & 0xff0000) * i_2613_) & ~0xffffff);
												int i_2628_ = (((i_2622_ & 0xff00) * i_2614_) & 0xff0000);
												int i_2629_ = (((i_2622_ & 0xff) * i_2615_) & 0xff00);
												is[i_2561_] = (i_2627_ | i_2628_ | i_2629_) >>> 8;
											}
											if (bool_2543_ && bool_2552_)
												fs[i_2561_] = f;
										}
									}
								}
								i_2553_ += i_2557_;
								i_2561_++;
							}
							i_2554_ += i_2558_;
							i_2553_ = i_2604_;
							i_2561_ += i_2562_;
						}
					}
				} else if (i_2548_ == 3) {
					int i_2630_ = i_2553_;
					int i_2631_ = i_2549_ >>> 24;
					int i_2632_ = 256 - i_2631_;
					for (int i_2633_ = -i_2547_; i_2633_ < 0; i_2633_++) {
						int i_2634_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2635_ = -i_2546_; i_2635_ < 0; i_2635_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								if (bool) {
									byte i_2636_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2634_]);
									int i_2637_ = (i_2636_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2636_]) : 0);
									int i_2638_ = i_2637_ + i_2549_;
									int i_2639_ = ((i_2637_ & 0xff00ff) + (i_2549_ & 0xff00ff));
									int i_2640_ = ((i_2639_ & 0x1000100) + (i_2638_ - i_2639_ & 0x10000));
									i_2640_ = (i_2638_ - i_2640_ | i_2640_ - (i_2640_ >>> 8));
									if (i_2637_ == 0 && i_2631_ != 255) {
										i_2637_ = i_2640_;
										i_2640_ = is[i_2561_];
										i_2640_ = ((((i_2637_ & 0xff00ff) * i_2631_ + ((i_2640_ & 0xff00ff) * i_2632_)) & ~0xff00ff) + (((i_2637_ & 0xff00) * i_2631_ + ((i_2640_ & 0xff00) * i_2632_)) & 0xff0000)) >> 8;
									}
									is[i_2561_] = i_2640_;
								}
								if (bool_2543_ && bool_2552_)
									fs[i_2561_] = f;
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2630_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 2) {
					int i_2641_ = i_2549_ >>> 24;
					int i_2642_ = 256 - i_2641_;
					int i_2643_ = (i_2549_ & 0xff00ff) * i_2642_ & ~0xff00ff;
					int i_2644_ = (i_2549_ & 0xff00) * i_2642_ & 0xff0000;
					i_2549_ = (i_2643_ | i_2644_) >>> 8;
					int i_2645_ = i_2553_;
					for (int i_2646_ = -i_2547_; i_2646_ < 0; i_2646_++) {
						int i_2647_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2648_ = -i_2546_; i_2648_ < 0; i_2648_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								int i_2649_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2647_]);
								if (i_2649_ != 0) {
									if (bool) {
										int i_2650_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2649_ & 0xff]);
										i_2643_ = ((i_2650_ & 0xff00ff) * i_2641_ & ~0xff00ff);
										i_2644_ = ((i_2650_ & 0xff00) * i_2641_ & 0xff0000);
										is[i_2561_] = ((i_2643_ | i_2644_) >>> 8) + i_2549_;
									}
									if (bool_2543_ && bool_2552_)
										fs[i_2561_] = f;
								}
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2645_;
						i_2561_ += i_2562_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2550_ == 2) {
				if (i_2548_ == 1) {
					int i_2651_ = i_2553_;
					for (int i_2652_ = -i_2547_; i_2652_ < 0; i_2652_++) {
						int i_2653_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2654_ = -i_2546_; i_2654_ < 0; i_2654_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								int i_2655_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2653_]);
								if (i_2655_ != 0) {
									if (bool) {
										int i_2656_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2655_ & 0xff]);
										int i_2657_ = is[i_2561_];
										int i_2658_ = i_2656_ + i_2657_;
										int i_2659_ = ((i_2656_ & 0xff00ff) + (i_2657_ & 0xff00ff));
										i_2657_ = ((i_2659_ & 0x1000100) + (i_2658_ - i_2659_ & 0x10000));
										is[i_2561_] = (i_2658_ - i_2657_ | i_2657_ - (i_2657_ >>> 8));
									}
									if (bool_2543_ && bool_2552_)
										fs[i_2561_] = f;
								}
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2651_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 0) {
					int i_2660_ = i_2553_;
					int i_2661_ = (i_2549_ & 0xff0000) >> 16;
					int i_2662_ = (i_2549_ & 0xff00) >> 8;
					int i_2663_ = i_2549_ & 0xff;
					for (int i_2664_ = -i_2547_; i_2664_ < 0; i_2664_++) {
						int i_2665_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2666_ = -i_2546_; i_2666_ < 0; i_2666_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								int i_2667_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2665_]);
								if (i_2667_ != 0) {
									if (bool) {
										int i_2668_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2667_ & 0xff]);
										int i_2669_ = ((i_2668_ & 0xff0000) * i_2661_ & ~0xffffff);
										int i_2670_ = ((i_2668_ & 0xff00) * i_2662_ & 0xff0000);
										int i_2671_ = ((i_2668_ & 0xff) * i_2663_ & 0xff00);
										i_2668_ = (i_2669_ | i_2670_ | i_2671_) >>> 8;
										int i_2672_ = is[i_2561_];
										int i_2673_ = i_2668_ + i_2672_;
										int i_2674_ = ((i_2668_ & 0xff00ff) + (i_2672_ & 0xff00ff));
										i_2672_ = ((i_2674_ & 0x1000100) + (i_2673_ - i_2674_ & 0x10000));
										is[i_2561_] = (i_2673_ - i_2672_ | i_2672_ - (i_2672_ >>> 8));
									}
									if (bool_2543_ && bool_2552_)
										fs[i_2561_] = f;
								}
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2660_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 3) {
					int i_2675_ = i_2553_;
					for (int i_2676_ = -i_2547_; i_2676_ < 0; i_2676_++) {
						int i_2677_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2678_ = -i_2546_; i_2678_ < 0; i_2678_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								if (bool) {
									byte i_2679_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2677_]);
									int i_2680_ = (i_2679_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2679_]) : 0);
									int i_2681_ = i_2680_ + i_2549_;
									int i_2682_ = ((i_2680_ & 0xff00ff) + (i_2549_ & 0xff00ff));
									int i_2683_ = ((i_2682_ & 0x1000100) + (i_2681_ - i_2682_ & 0x10000));
									i_2680_ = (i_2681_ - i_2683_ | i_2683_ - (i_2683_ >>> 8));
									i_2683_ = is[i_2561_];
									i_2681_ = i_2680_ + i_2683_;
									i_2682_ = (i_2680_ & 0xff00ff) + (i_2683_ & 0xff00ff);
									i_2683_ = ((i_2682_ & 0x1000100) + (i_2681_ - i_2682_ & 0x10000));
									is[i_2561_] = (i_2681_ - i_2683_ | i_2683_ - (i_2683_ >>> 8));
								}
								if (bool_2543_ && bool_2552_)
									fs[i_2561_] = f;
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2675_;
						i_2561_ += i_2562_;
					}
				} else if (i_2548_ == 2) {
					int i_2684_ = i_2549_ >>> 24;
					int i_2685_ = 256 - i_2684_;
					int i_2686_ = (i_2549_ & 0xff00ff) * i_2685_ & ~0xff00ff;
					int i_2687_ = (i_2549_ & 0xff00) * i_2685_ & 0xff0000;
					i_2549_ = (i_2686_ | i_2687_) >>> 8;
					int i_2688_ = i_2553_;
					for (int i_2689_ = -i_2547_; i_2689_ < 0; i_2689_++) {
						int i_2690_ = ((i_2554_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2691_ = -i_2546_; i_2691_ < 0; i_2691_++) {
							if (!bool_2543_ || f < fs[i_2561_]) {
								int i_2692_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2553_ >> 16) + i_2690_]);
								if (i_2692_ != 0) {
									if (bool) {
										int i_2693_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2692_ & 0xff]);
										i_2686_ = ((i_2693_ & 0xff00ff) * i_2684_ & ~0xff00ff);
										i_2687_ = ((i_2693_ & 0xff00) * i_2684_ & 0xff0000);
										i_2693_ = (((i_2686_ | i_2687_) >>> 8) + i_2549_);
										int i_2694_ = is[i_2561_];
										int i_2695_ = i_2693_ + i_2694_;
										int i_2696_ = ((i_2693_ & 0xff00ff) + (i_2694_ & 0xff00ff));
										i_2694_ = ((i_2696_ & 0x1000100) + (i_2695_ - i_2696_ & 0x10000));
										is[i_2561_] = (i_2695_ - i_2694_ | i_2694_ - (i_2694_ >>> 8));
									}
									if (bool_2543_ && bool_2552_)
										fs[i_2561_] = f;
								}
							}
							i_2553_ += i_2557_;
							i_2561_++;
						}
						i_2554_ += i_2558_;
						i_2553_ = i_2688_;
						i_2561_ += i_2562_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method749(boolean bool, boolean bool_2697_, boolean bool_2698_, int i, int i_2699_, float f, int i_2700_, int i_2701_, int i_2702_, int i_2703_, int i_2704_, int i_2705_, boolean bool_2706_) {
		if (i_2700_ > 0 && i_2701_ > 0 && (bool || bool_2697_)) {
			int i_2707_ = 0;
			int i_2708_ = 0;
			int i_2709_ = (((Class61_Sub3_Sub3) this).anInt9352 + ((Class61_Sub3_Sub3) this).anInt9358 + ((Class61_Sub3_Sub3) this).anInt9328);
			int i_2710_ = (((Class61_Sub3_Sub3) this).anInt9327 + ((Class61_Sub3_Sub3) this).anInt9325 + ((Class61_Sub3_Sub3) this).anInt9337);
			int i_2711_ = (i_2709_ << 16) / i_2700_;
			int i_2712_ = (i_2710_ << 16) / i_2701_;
			if (((Class61_Sub3_Sub3) this).anInt9352 > 0) {
				int i_2713_ = (((((Class61_Sub3_Sub3) this).anInt9352 << 16) + i_2711_ - 1) / i_2711_);
				i += i_2713_;
				i_2707_ += (i_2713_ * i_2711_ - (((Class61_Sub3_Sub3) this).anInt9352 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9327 > 0) {
				int i_2714_ = (((((Class61_Sub3_Sub3) this).anInt9327 << 16) + i_2712_ - 1) / i_2712_);
				i_2699_ += i_2714_;
				i_2708_ += (i_2714_ * i_2712_ - (((Class61_Sub3_Sub3) this).anInt9327 << 16));
			}
			if (((Class61_Sub3_Sub3) this).anInt9358 < i_2709_)
				i_2700_ = ((((Class61_Sub3_Sub3) this).anInt9358 << 16) - i_2707_ + i_2711_ - 1) / i_2711_;
			if (((Class61_Sub3_Sub3) this).anInt9325 < i_2710_)
				i_2701_ = ((((Class61_Sub3_Sub3) this).anInt9325 << 16) - i_2708_ + i_2712_ - 1) / i_2712_;
			int i_2715_ = i + i_2699_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
			int i_2716_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618 * -1504772933) - i_2700_);
			if (i_2699_ + i_2701_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624 * 31822541))
				i_2701_ -= (i_2699_ + i_2701_ - (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8624) * 31822541);
			if (i_2699_ < (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481)) {
				int i_2717_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8623) * -1679642481 - i_2699_);
				i_2701_ -= i_2717_;
				i_2715_ += i_2717_ * ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8618) * -1504772933);
				i_2708_ += i_2712_ * i_2717_;
			}
			if (i + i_2700_ > (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8635) * -1071049483) {
				int i_2718_ = (i + i_2700_ - (((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8635) * -1071049483);
				i_2700_ -= i_2718_;
				i_2716_ += i_2718_;
			}
			if (i < (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anInt8621 * 512290825)) {
				int i_2719_ = ((((Class_ra_Sub3) (((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355)).anInt8621) * 512290825 - i);
				i_2700_ -= i_2719_;
				i_2715_ += i_2719_;
				i_2707_ += i_2711_ * i_2719_;
				i_2716_ += i_2719_;
			}
			float[] fs = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).aFloatArray8620);
			int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
			if (i_2704_ == 0) {
				if (i_2702_ == 1) {
					int i_2720_ = i_2707_;
					for (int i_2721_ = -i_2701_; i_2721_ < 0; i_2721_++) {
						int i_2722_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2723_ = -i_2700_; i_2723_ < 0; i_2723_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								if (bool)
									is[i_2715_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2722_]) & 0xff)]);
								if (bool_2697_ && bool_2706_)
									fs[i_2715_] = f;
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2720_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 0) {
					int i_2724_ = (i_2703_ & 0xff0000) >> 16;
					int i_2725_ = (i_2703_ & 0xff00) >> 8;
					int i_2726_ = i_2703_ & 0xff;
					int i_2727_ = i_2707_;
					for (int i_2728_ = -i_2701_; i_2728_ < 0; i_2728_++) {
						int i_2729_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2730_ = -i_2700_; i_2730_ < 0; i_2730_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								if (bool) {
									int i_2731_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2729_]) & 0xff)]);
									int i_2732_ = ((i_2731_ & 0xff0000) * i_2724_ & ~0xffffff);
									int i_2733_ = ((i_2731_ & 0xff00) * i_2725_ & 0xff0000);
									int i_2734_ = (i_2731_ & 0xff) * i_2726_ & 0xff00;
									is[i_2715_] = (i_2732_ | i_2733_ | i_2734_) >>> 8;
								}
								if (bool_2697_ && bool_2706_)
									fs[i_2715_] = f;
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2727_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 3) {
					int i_2735_ = i_2707_;
					for (int i_2736_ = -i_2701_; i_2736_ < 0; i_2736_++) {
						int i_2737_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2738_ = -i_2700_; i_2738_ < 0; i_2738_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								if (bool) {
									byte i_2739_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2737_]);
									int i_2740_ = (i_2739_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2739_]) : 0);
									int i_2741_ = i_2740_ + i_2703_;
									int i_2742_ = ((i_2740_ & 0xff00ff) + (i_2703_ & 0xff00ff));
									int i_2743_ = ((i_2742_ & 0x1000100) + (i_2741_ - i_2742_ & 0x10000));
									is[i_2715_] = (i_2741_ - i_2743_ | i_2743_ - (i_2743_ >>> 8));
								}
								if (bool_2697_ && bool_2706_)
									fs[i_2715_] = f;
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2735_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 2) {
					int i_2744_ = i_2703_ >>> 24;
					int i_2745_ = 256 - i_2744_;
					int i_2746_ = (i_2703_ & 0xff00ff) * i_2745_ & ~0xff00ff;
					int i_2747_ = (i_2703_ & 0xff00) * i_2745_ & 0xff0000;
					i_2703_ = (i_2746_ | i_2747_) >>> 8;
					int i_2748_ = i_2707_;
					for (int i_2749_ = -i_2701_; i_2749_ < 0; i_2749_++) {
						int i_2750_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2751_ = -i_2700_; i_2751_ < 0; i_2751_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								if (bool) {
									int i_2752_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2750_]) & 0xff)]);
									i_2746_ = ((i_2752_ & 0xff00ff) * i_2744_ & ~0xff00ff);
									i_2747_ = ((i_2752_ & 0xff00) * i_2744_ & 0xff0000);
									is[i_2715_] = (((i_2746_ | i_2747_) >>> 8) + i_2703_);
								}
								if (bool_2697_ && bool_2706_)
									fs[i_2715_] = f;
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2748_;
						i_2715_ += i_2716_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2704_ == 1) {
				if (i_2702_ == 1) {
					int i_2753_ = i_2707_;
					for (int i_2754_ = -i_2701_; i_2754_ < 0; i_2754_++) {
						int i_2755_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2756_ = -i_2700_; i_2756_ < 0; i_2756_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								int i_2757_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2755_]);
								if (i_2757_ != 0) {
									if (bool)
										is[i_2715_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2757_ & 0xff]);
									if (bool_2697_ && bool_2706_)
										fs[i_2715_] = f;
								}
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2753_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 0) {
					int i_2758_ = i_2707_;
					if ((i_2703_ & 0xffffff) == 16777215) {
						int i_2759_ = i_2703_ >>> 24;
						int i_2760_ = 256 - i_2759_;
						for (int i_2761_ = -i_2701_; i_2761_ < 0; i_2761_++) {
							int i_2762_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2763_ = -i_2700_; i_2763_ < 0; i_2763_++) {
								if (!bool_2697_ || f < fs[i_2715_]) {
									int i_2764_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2762_]);
									if (i_2764_ != 0) {
										if (bool) {
											int i_2765_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2764_ & 0xff]);
											int i_2766_ = is[i_2715_];
											is[i_2715_] = (((((i_2765_ & 0xff00ff) * i_2759_) + ((i_2766_ & 0xff00ff) * i_2760_)) & ~0xff00ff) + ((((i_2765_ & 0xff00) * i_2759_) + ((i_2766_ & 0xff00) * i_2760_)) & 0xff0000)) >> 8;
										}
										if (bool_2697_ && bool_2706_)
											fs[i_2715_] = f;
									}
								}
								i_2707_ += i_2711_;
								i_2715_++;
							}
							i_2708_ += i_2712_;
							i_2707_ = i_2758_;
							i_2715_ += i_2716_;
						}
					} else {
						int i_2767_ = (i_2703_ & 0xff0000) >> 16;
						int i_2768_ = (i_2703_ & 0xff00) >> 8;
						int i_2769_ = i_2703_ & 0xff;
						int i_2770_ = i_2703_ >>> 24;
						int i_2771_ = 256 - i_2770_;
						for (int i_2772_ = -i_2701_; i_2772_ < 0; i_2772_++) {
							int i_2773_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
							for (int i_2774_ = -i_2700_; i_2774_ < 0; i_2774_++) {
								if (!bool_2697_ || f < fs[i_2715_]) {
									int i_2775_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2773_]);
									if (i_2775_ != 0) {
										int i_2776_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2775_ & 0xff]);
										if (i_2770_ != 255) {
											if (bool) {
												int i_2777_ = (((i_2776_ & 0xff0000) * i_2767_) & ~0xffffff);
												int i_2778_ = (((i_2776_ & 0xff00) * i_2768_) & 0xff0000);
												int i_2779_ = (((i_2776_ & 0xff) * i_2769_) & 0xff00);
												i_2776_ = (i_2777_ | i_2778_ | i_2779_) >>> 8;
												int i_2780_ = is[i_2715_];
												is[i_2715_] = (((((i_2776_ & 0xff00ff) * i_2770_) + ((i_2780_ & 0xff00ff) * i_2771_)) & ~0xff00ff) + ((((i_2776_ & 0xff00) * i_2770_) + ((i_2780_ & 0xff00) * i_2771_)) & 0xff0000)) >> 8;
											}
											if (bool_2697_ && bool_2706_)
												fs[i_2715_] = f;
										} else {
											if (bool) {
												int i_2781_ = (((i_2776_ & 0xff0000) * i_2767_) & ~0xffffff);
												int i_2782_ = (((i_2776_ & 0xff00) * i_2768_) & 0xff0000);
												int i_2783_ = (((i_2776_ & 0xff) * i_2769_) & 0xff00);
												is[i_2715_] = (i_2781_ | i_2782_ | i_2783_) >>> 8;
											}
											if (bool_2697_ && bool_2706_)
												fs[i_2715_] = f;
										}
									}
								}
								i_2707_ += i_2711_;
								i_2715_++;
							}
							i_2708_ += i_2712_;
							i_2707_ = i_2758_;
							i_2715_ += i_2716_;
						}
					}
				} else if (i_2702_ == 3) {
					int i_2784_ = i_2707_;
					int i_2785_ = i_2703_ >>> 24;
					int i_2786_ = 256 - i_2785_;
					for (int i_2787_ = -i_2701_; i_2787_ < 0; i_2787_++) {
						int i_2788_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2789_ = -i_2700_; i_2789_ < 0; i_2789_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								if (bool) {
									byte i_2790_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2788_]);
									int i_2791_ = (i_2790_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2790_]) : 0);
									int i_2792_ = i_2791_ + i_2703_;
									int i_2793_ = ((i_2791_ & 0xff00ff) + (i_2703_ & 0xff00ff));
									int i_2794_ = ((i_2793_ & 0x1000100) + (i_2792_ - i_2793_ & 0x10000));
									i_2794_ = (i_2792_ - i_2794_ | i_2794_ - (i_2794_ >>> 8));
									if (i_2791_ == 0 && i_2785_ != 255) {
										i_2791_ = i_2794_;
										i_2794_ = is[i_2715_];
										i_2794_ = ((((i_2791_ & 0xff00ff) * i_2785_ + ((i_2794_ & 0xff00ff) * i_2786_)) & ~0xff00ff) + (((i_2791_ & 0xff00) * i_2785_ + ((i_2794_ & 0xff00) * i_2786_)) & 0xff0000)) >> 8;
									}
									is[i_2715_] = i_2794_;
								}
								if (bool_2697_ && bool_2706_)
									fs[i_2715_] = f;
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2784_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 2) {
					int i_2795_ = i_2703_ >>> 24;
					int i_2796_ = 256 - i_2795_;
					int i_2797_ = (i_2703_ & 0xff00ff) * i_2796_ & ~0xff00ff;
					int i_2798_ = (i_2703_ & 0xff00) * i_2796_ & 0xff0000;
					i_2703_ = (i_2797_ | i_2798_) >>> 8;
					int i_2799_ = i_2707_;
					for (int i_2800_ = -i_2701_; i_2800_ < 0; i_2800_++) {
						int i_2801_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2802_ = -i_2700_; i_2802_ < 0; i_2802_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								int i_2803_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2801_]);
								if (i_2803_ != 0) {
									if (bool) {
										int i_2804_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2803_ & 0xff]);
										i_2797_ = ((i_2804_ & 0xff00ff) * i_2795_ & ~0xff00ff);
										i_2798_ = ((i_2804_ & 0xff00) * i_2795_ & 0xff0000);
										is[i_2715_] = ((i_2797_ | i_2798_) >>> 8) + i_2703_;
									}
									if (bool_2697_ && bool_2706_)
										fs[i_2715_] = f;
								}
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2799_;
						i_2715_ += i_2716_;
					}
				} else
					throw new IllegalArgumentException();
			} else if (i_2704_ == 2) {
				if (i_2702_ == 1) {
					int i_2805_ = i_2707_;
					for (int i_2806_ = -i_2701_; i_2806_ < 0; i_2806_++) {
						int i_2807_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2808_ = -i_2700_; i_2808_ < 0; i_2808_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								int i_2809_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2807_]);
								if (i_2809_ != 0) {
									if (bool) {
										int i_2810_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2809_ & 0xff]);
										int i_2811_ = is[i_2715_];
										int i_2812_ = i_2810_ + i_2811_;
										int i_2813_ = ((i_2810_ & 0xff00ff) + (i_2811_ & 0xff00ff));
										i_2811_ = ((i_2813_ & 0x1000100) + (i_2812_ - i_2813_ & 0x10000));
										is[i_2715_] = (i_2812_ - i_2811_ | i_2811_ - (i_2811_ >>> 8));
									}
									if (bool_2697_ && bool_2706_)
										fs[i_2715_] = f;
								}
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2805_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 0) {
					int i_2814_ = i_2707_;
					int i_2815_ = (i_2703_ & 0xff0000) >> 16;
					int i_2816_ = (i_2703_ & 0xff00) >> 8;
					int i_2817_ = i_2703_ & 0xff;
					for (int i_2818_ = -i_2701_; i_2818_ < 0; i_2818_++) {
						int i_2819_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2820_ = -i_2700_; i_2820_ < 0; i_2820_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								int i_2821_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2819_]);
								if (i_2821_ != 0) {
									if (bool) {
										int i_2822_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2821_ & 0xff]);
										int i_2823_ = ((i_2822_ & 0xff0000) * i_2815_ & ~0xffffff);
										int i_2824_ = ((i_2822_ & 0xff00) * i_2816_ & 0xff0000);
										int i_2825_ = ((i_2822_ & 0xff) * i_2817_ & 0xff00);
										i_2822_ = (i_2823_ | i_2824_ | i_2825_) >>> 8;
										int i_2826_ = is[i_2715_];
										int i_2827_ = i_2822_ + i_2826_;
										int i_2828_ = ((i_2822_ & 0xff00ff) + (i_2826_ & 0xff00ff));
										i_2826_ = ((i_2828_ & 0x1000100) + (i_2827_ - i_2828_ & 0x10000));
										is[i_2715_] = (i_2827_ - i_2826_ | i_2826_ - (i_2826_ >>> 8));
									}
									if (bool_2697_ && bool_2706_)
										fs[i_2715_] = f;
								}
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2814_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 3) {
					int i_2829_ = i_2707_;
					for (int i_2830_ = -i_2701_; i_2830_ < 0; i_2830_++) {
						int i_2831_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2832_ = -i_2700_; i_2832_ < 0; i_2832_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								if (bool) {
									byte i_2833_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2831_]);
									int i_2834_ = (i_2833_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2833_]) : 0);
									int i_2835_ = i_2834_ + i_2703_;
									int i_2836_ = ((i_2834_ & 0xff00ff) + (i_2703_ & 0xff00ff));
									int i_2837_ = ((i_2836_ & 0x1000100) + (i_2835_ - i_2836_ & 0x10000));
									i_2834_ = (i_2835_ - i_2837_ | i_2837_ - (i_2837_ >>> 8));
									i_2837_ = is[i_2715_];
									i_2835_ = i_2834_ + i_2837_;
									i_2836_ = (i_2834_ & 0xff00ff) + (i_2837_ & 0xff00ff);
									i_2837_ = ((i_2836_ & 0x1000100) + (i_2835_ - i_2836_ & 0x10000));
									is[i_2715_] = (i_2835_ - i_2837_ | i_2837_ - (i_2837_ >>> 8));
								}
								if (bool_2697_ && bool_2706_)
									fs[i_2715_] = f;
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2829_;
						i_2715_ += i_2716_;
					}
				} else if (i_2702_ == 2) {
					int i_2838_ = i_2703_ >>> 24;
					int i_2839_ = 256 - i_2838_;
					int i_2840_ = (i_2703_ & 0xff00ff) * i_2839_ & ~0xff00ff;
					int i_2841_ = (i_2703_ & 0xff00) * i_2839_ & 0xff0000;
					i_2703_ = (i_2840_ | i_2841_) >>> 8;
					int i_2842_ = i_2707_;
					for (int i_2843_ = -i_2701_; i_2843_ < 0; i_2843_++) {
						int i_2844_ = ((i_2708_ >> 16) * ((Class61_Sub3_Sub3) this).anInt9358);
						for (int i_2845_ = -i_2700_; i_2845_ < 0; i_2845_++) {
							if (!bool_2697_ || f < fs[i_2715_]) {
								int i_2846_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(i_2707_ >> 16) + i_2844_]);
								if (i_2846_ != 0) {
									if (bool) {
										int i_2847_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2846_ & 0xff]);
										i_2840_ = ((i_2847_ & 0xff00ff) * i_2838_ & ~0xff00ff);
										i_2841_ = ((i_2847_ & 0xff00) * i_2838_ & 0xff0000);
										i_2847_ = (((i_2840_ | i_2841_) >>> 8) + i_2703_);
										int i_2848_ = is[i_2715_];
										int i_2849_ = i_2847_ + i_2848_;
										int i_2850_ = ((i_2847_ & 0xff00ff) + (i_2848_ & 0xff00ff));
										i_2848_ = ((i_2850_ & 0x1000100) + (i_2849_ - i_2850_ & 0x10000));
										is[i_2715_] = (i_2849_ - i_2848_ | i_2848_ - (i_2848_ >>> 8));
									}
									if (bool_2697_ && bool_2706_)
										fs[i_2715_] = f;
								}
							}
							i_2707_ += i_2711_;
							i_2715_++;
						}
						i_2708_ += i_2712_;
						i_2707_ = i_2842_;
						i_2715_ += i_2716_;
					}
				} else
					throw new IllegalArgumentException();
			} else
				throw new IllegalArgumentException();
		}
	}

	void method755(int i, int i_2851_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_2852_ = anInt9356;
					while (i_2852_ < 0) {
						int i_2853_ = anInt9339;
						int i_2854_ = anInt9346;
						int i_2855_ = anInt9324;
						int i_2856_ = anInt9347;
						if (i_2854_ >= 0 && i_2855_ >= 0 && i_2854_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0 && i_2855_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							for (/**/; i_2856_ < 0; i_2856_++) {
								int i_2857_ = (((i_2855_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_2854_ >> 12));
								int i_2858_ = i_2853_++;
								if (i_2851_ == 0) {
									if (i == 1)
										is[i_2858_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]) & 0xff)]);
									else if (i == 0) {
										int i_2859_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]) & 0xff)]);
										int i_2860_ = ((i_2859_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_2861_ = ((i_2859_ & 0xff00) * anInt9354 & 0xff0000);
										int i_2862_ = ((i_2859_ & 0xff) * anInt9333 & 0xff00);
										is[i_2858_] = (i_2860_ | i_2861_ | i_2862_) >>> 8;
									} else if (i == 3) {
										int i_2863_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]) & 0xff)]);
										int i_2864_ = anInt9350;
										int i_2865_ = i_2863_ + i_2864_;
										int i_2866_ = ((i_2863_ & 0xff00ff) + (i_2864_ & 0xff00ff));
										int i_2867_ = ((i_2866_ & 0x1000100) + (i_2865_ - i_2866_ & 0x10000));
										is[i_2858_] = (i_2865_ - i_2867_ | i_2867_ - (i_2867_ >>> 8));
									} else if (i == 2) {
										int i_2868_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]) & 0xff)]);
										int i_2869_ = ((i_2868_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_2870_ = ((i_2868_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_2858_] = ((i_2869_ | i_2870_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 1) {
									if (i == 1) {
										int i_2871_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										if (i_2871_ != 0)
											is[i_2858_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2871_ & 0xff]);
									} else if (i == 0) {
										int i_2872_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										if (i_2872_ != 0) {
											int i_2873_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2872_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_2874_ = anInt9350 >>> 24;
												int i_2875_ = 256 - i_2874_;
												int i_2876_ = is[i_2858_];
												is[i_2858_] = (((((i_2873_ & 0xff00ff) * i_2874_) + ((i_2876_ & 0xff00ff) * i_2875_)) & ~0xff00ff) + ((((i_2873_ & 0xff00) * i_2874_) + ((i_2876_ & 0xff00) * i_2875_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_2877_ = (((i_2873_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_2878_ = (((i_2873_ & 0xff00) * anInt9354) & 0xff0000);
												int i_2879_ = (((i_2873_ & 0xff) * anInt9333) & 0xff00);
												i_2873_ = (i_2877_ | i_2878_ | i_2879_) >>> 8;
												int i_2880_ = is[i_2858_];
												is[i_2858_] = (((((i_2873_ & 0xff00ff) * anInt9351) + ((i_2880_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_2873_ & 0xff00) * anInt9351) + ((i_2880_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_2881_ = (((i_2873_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_2882_ = (((i_2873_ & 0xff00) * anInt9354) & 0xff0000);
												int i_2883_ = (((i_2873_ & 0xff) * anInt9333) & 0xff00);
												is[i_2858_] = (i_2881_ | i_2882_ | i_2883_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2884_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										int i_2885_ = (i_2884_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2884_]) : 0);
										int i_2886_ = anInt9350;
										int i_2887_ = i_2885_ + i_2886_;
										int i_2888_ = ((i_2885_ & 0xff00ff) + (i_2886_ & 0xff00ff));
										int i_2889_ = ((i_2888_ & 0x1000100) + (i_2887_ - i_2888_ & 0x10000));
										i_2889_ = (i_2887_ - i_2889_ | i_2889_ - (i_2889_ >>> 8));
										if (i_2885_ == 0 && anInt9351 != 255) {
											i_2885_ = i_2889_;
											i_2889_ = is[i_2858_];
											i_2889_ = (((((i_2885_ & 0xff00ff) * anInt9351) + ((i_2889_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_2885_ & 0xff00) * anInt9351) + ((i_2889_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_2858_] = i_2889_;
									} else if (i == 2) {
										int i_2890_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										if (i_2890_ != 0) {
											int i_2891_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2890_ & 0xff]);
											int i_2892_ = (((i_2891_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_2893_ = (((i_2891_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_2858_++] = (((i_2892_ | i_2893_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 2) {
									if (i == 1) {
										int i_2894_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										if (i_2894_ != 0) {
											int i_2895_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2894_ & 0xff]);
											int i_2896_ = is[i_2858_];
											int i_2897_ = i_2895_ + i_2896_;
											int i_2898_ = ((i_2895_ & 0xff00ff) + (i_2896_ & 0xff00ff));
											i_2896_ = ((i_2898_ & 0x1000100) + (i_2897_ - i_2898_ & 0x10000));
											is[i_2858_] = (i_2897_ - i_2896_ | i_2896_ - (i_2896_ >>> 8));
										}
									} else if (i == 0) {
										int i_2899_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										if (i_2899_ != 0) {
											int i_2900_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2899_ & 0xff]);
											int i_2901_ = (((i_2900_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_2902_ = (((i_2900_ & 0xff00) * anInt9354) & 0xff0000);
											int i_2903_ = ((i_2900_ & 0xff) * anInt9333 & 0xff00);
											i_2900_ = (i_2901_ | i_2902_ | i_2903_) >>> 8;
											int i_2904_ = is[i_2858_];
											int i_2905_ = i_2900_ + i_2904_;
											int i_2906_ = ((i_2900_ & 0xff00ff) + (i_2904_ & 0xff00ff));
											i_2904_ = ((i_2906_ & 0x1000100) + (i_2905_ - i_2906_ & 0x10000));
											is[i_2858_] = (i_2905_ - i_2904_ | i_2904_ - (i_2904_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2907_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										int i_2908_ = (i_2907_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2907_]) : 0);
										int i_2909_ = anInt9350;
										int i_2910_ = i_2908_ + i_2909_;
										int i_2911_ = ((i_2908_ & 0xff00ff) + (i_2909_ & 0xff00ff));
										int i_2912_ = ((i_2911_ & 0x1000100) + (i_2910_ - i_2911_ & 0x10000));
										i_2912_ = (i_2910_ - i_2912_ | i_2912_ - (i_2912_ >>> 8));
										if (i_2908_ == 0 && anInt9351 != 255) {
											i_2908_ = i_2912_;
											i_2912_ = is[i_2858_];
											i_2912_ = (((((i_2908_ & 0xff00ff) * anInt9351) + ((i_2912_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_2908_ & 0xff00) * anInt9351) + ((i_2912_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_2858_] = i_2912_;
									} else if (i == 2) {
										int i_2913_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2857_]);
										if (i_2913_ != 0) {
											int i_2914_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2913_ & 0xff]);
											int i_2915_ = (((i_2914_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_2916_ = (((i_2914_ & 0xff00) * anInt9351) & 0xff0000);
											i_2914_ = ((i_2915_ | i_2916_) >>> 8) + anInt9323;
											int i_2917_ = is[i_2858_];
											int i_2918_ = i_2914_ + i_2917_;
											int i_2919_ = ((i_2914_ & 0xff00ff) + (i_2917_ & 0xff00ff));
											i_2917_ = ((i_2919_ & 0x1000100) + (i_2918_ - i_2919_ & 0x10000));
											is[i_2858_] = (i_2918_ - i_2917_ | i_2917_ - (i_2917_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_2852_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_2920_ = anInt9356;
					while (i_2920_ < 0) {
						int i_2921_ = anInt9339;
						int i_2922_ = anInt9346;
						int i_2923_ = anInt9324 + anInt9349;
						int i_2924_ = anInt9347;
						if (i_2922_ >= 0 && i_2922_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0) {
							int i_2925_;
							if ((i_2925_ = (i_2923_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
								i_2925_ = (anInt9341 - i_2925_) / anInt9341;
								i_2924_ += i_2925_;
								i_2923_ += anInt9341 * i_2925_;
								i_2921_ += i_2925_;
							}
							if ((i_2925_ = (i_2923_ - anInt9341) / anInt9341) > i_2924_)
								i_2924_ = i_2925_;
							for (/**/; i_2924_ < 0; i_2924_++) {
								int i_2926_ = (((i_2923_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_2922_ >> 12));
								int i_2927_ = i_2921_++;
								if (i_2851_ == 0) {
									if (i == 1)
										is[i_2927_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]) & 0xff)]);
									else if (i == 0) {
										int i_2928_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]) & 0xff)]);
										int i_2929_ = ((i_2928_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_2930_ = ((i_2928_ & 0xff00) * anInt9354 & 0xff0000);
										int i_2931_ = ((i_2928_ & 0xff) * anInt9333 & 0xff00);
										is[i_2927_] = (i_2929_ | i_2930_ | i_2931_) >>> 8;
									} else if (i == 3) {
										int i_2932_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]) & 0xff)]);
										int i_2933_ = anInt9350;
										int i_2934_ = i_2932_ + i_2933_;
										int i_2935_ = ((i_2932_ & 0xff00ff) + (i_2933_ & 0xff00ff));
										int i_2936_ = ((i_2935_ & 0x1000100) + (i_2934_ - i_2935_ & 0x10000));
										is[i_2927_] = (i_2934_ - i_2936_ | i_2936_ - (i_2936_ >>> 8));
									} else if (i == 2) {
										int i_2937_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]) & 0xff)]);
										int i_2938_ = ((i_2937_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_2939_ = ((i_2937_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_2927_] = ((i_2938_ | i_2939_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 1) {
									if (i == 1) {
										int i_2940_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										if (i_2940_ != 0)
											is[i_2927_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2940_ & 0xff]);
									} else if (i == 0) {
										int i_2941_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										if (i_2941_ != 0) {
											int i_2942_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2941_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_2943_ = anInt9350 >>> 24;
												int i_2944_ = 256 - i_2943_;
												int i_2945_ = is[i_2927_];
												is[i_2927_] = (((((i_2942_ & 0xff00ff) * i_2943_) + ((i_2945_ & 0xff00ff) * i_2944_)) & ~0xff00ff) + ((((i_2942_ & 0xff00) * i_2943_) + ((i_2945_ & 0xff00) * i_2944_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_2946_ = (((i_2942_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_2947_ = (((i_2942_ & 0xff00) * anInt9354) & 0xff0000);
												int i_2948_ = (((i_2942_ & 0xff) * anInt9333) & 0xff00);
												i_2942_ = (i_2946_ | i_2947_ | i_2948_) >>> 8;
												int i_2949_ = is[i_2927_];
												is[i_2927_] = (((((i_2942_ & 0xff00ff) * anInt9351) + ((i_2949_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_2942_ & 0xff00) * anInt9351) + ((i_2949_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_2950_ = (((i_2942_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_2951_ = (((i_2942_ & 0xff00) * anInt9354) & 0xff0000);
												int i_2952_ = (((i_2942_ & 0xff) * anInt9333) & 0xff00);
												is[i_2927_] = (i_2950_ | i_2951_ | i_2952_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_2953_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										int i_2954_ = (i_2953_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2953_]) : 0);
										int i_2955_ = anInt9350;
										int i_2956_ = i_2954_ + i_2955_;
										int i_2957_ = ((i_2954_ & 0xff00ff) + (i_2955_ & 0xff00ff));
										int i_2958_ = ((i_2957_ & 0x1000100) + (i_2956_ - i_2957_ & 0x10000));
										i_2958_ = (i_2956_ - i_2958_ | i_2958_ - (i_2958_ >>> 8));
										if (i_2954_ == 0 && anInt9351 != 255) {
											i_2954_ = i_2958_;
											i_2958_ = is[i_2927_];
											i_2958_ = (((((i_2954_ & 0xff00ff) * anInt9351) + ((i_2958_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_2954_ & 0xff00) * anInt9351) + ((i_2958_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_2927_] = i_2958_;
									} else if (i == 2) {
										int i_2959_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										if (i_2959_ != 0) {
											int i_2960_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2959_ & 0xff]);
											int i_2961_ = (((i_2960_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_2962_ = (((i_2960_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_2927_++] = (((i_2961_ | i_2962_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 2) {
									if (i == 1) {
										int i_2963_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										if (i_2963_ != 0) {
											int i_2964_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2963_ & 0xff]);
											int i_2965_ = is[i_2927_];
											int i_2966_ = i_2964_ + i_2965_;
											int i_2967_ = ((i_2964_ & 0xff00ff) + (i_2965_ & 0xff00ff));
											i_2965_ = ((i_2967_ & 0x1000100) + (i_2966_ - i_2967_ & 0x10000));
											is[i_2927_] = (i_2966_ - i_2965_ | i_2965_ - (i_2965_ >>> 8));
										}
									} else if (i == 0) {
										int i_2968_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										if (i_2968_ != 0) {
											int i_2969_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2968_ & 0xff]);
											int i_2970_ = (((i_2969_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_2971_ = (((i_2969_ & 0xff00) * anInt9354) & 0xff0000);
											int i_2972_ = ((i_2969_ & 0xff) * anInt9333 & 0xff00);
											i_2969_ = (i_2970_ | i_2971_ | i_2972_) >>> 8;
											int i_2973_ = is[i_2927_];
											int i_2974_ = i_2969_ + i_2973_;
											int i_2975_ = ((i_2969_ & 0xff00ff) + (i_2973_ & 0xff00ff));
											i_2973_ = ((i_2975_ & 0x1000100) + (i_2974_ - i_2975_ & 0x10000));
											is[i_2927_] = (i_2974_ - i_2973_ | i_2973_ - (i_2973_ >>> 8));
										}
									} else if (i == 3) {
										byte i_2976_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										int i_2977_ = (i_2976_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_2976_]) : 0);
										int i_2978_ = anInt9350;
										int i_2979_ = i_2977_ + i_2978_;
										int i_2980_ = ((i_2977_ & 0xff00ff) + (i_2978_ & 0xff00ff));
										int i_2981_ = ((i_2980_ & 0x1000100) + (i_2979_ - i_2980_ & 0x10000));
										i_2981_ = (i_2979_ - i_2981_ | i_2981_ - (i_2981_ >>> 8));
										if (i_2977_ == 0 && anInt9351 != 255) {
											i_2977_ = i_2981_;
											i_2981_ = is[i_2927_];
											i_2981_ = (((((i_2977_ & 0xff00ff) * anInt9351) + ((i_2981_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_2977_ & 0xff00) * anInt9351) + ((i_2981_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_2927_] = i_2981_;
									} else if (i == 2) {
										int i_2982_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2926_]);
										if (i_2982_ != 0) {
											int i_2983_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_2982_ & 0xff]);
											int i_2984_ = (((i_2983_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_2985_ = (((i_2983_ & 0xff00) * anInt9351) & 0xff0000);
											i_2983_ = ((i_2984_ | i_2985_) >>> 8) + anInt9323;
											int i_2986_ = is[i_2927_];
											int i_2987_ = i_2983_ + i_2986_;
											int i_2988_ = ((i_2983_ & 0xff00ff) + (i_2986_ & 0xff00ff));
											i_2986_ = ((i_2988_ & 0x1000100) + (i_2987_ - i_2988_ & 0x10000));
											is[i_2927_] = (i_2987_ - i_2986_ | i_2986_ - (i_2986_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2923_ += anInt9341;
							}
						}
						i_2920_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_2989_ = anInt9356;
					while (i_2989_ < 0) {
						int i_2990_ = anInt9339;
						int i_2991_ = anInt9346;
						int i_2992_ = anInt9324 + anInt9349;
						int i_2993_ = anInt9347;
						if (i_2991_ >= 0 && i_2991_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0) {
							if (i_2992_ < 0) {
								int i_2994_ = (anInt9341 - 1 - i_2992_) / anInt9341;
								i_2993_ += i_2994_;
								i_2992_ += anInt9341 * i_2994_;
								i_2990_ += i_2994_;
							}
							int i_2995_;
							if ((i_2995_ = (1 + i_2992_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_2993_)
								i_2993_ = i_2995_;
							for (/**/; i_2993_ < 0; i_2993_++) {
								int i_2996_ = (((i_2992_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_2991_ >> 12));
								int i_2997_ = i_2990_++;
								if (i_2851_ == 0) {
									if (i == 1)
										is[i_2997_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]) & 0xff)]);
									else if (i == 0) {
										int i_2998_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]) & 0xff)]);
										int i_2999_ = ((i_2998_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3000_ = ((i_2998_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3001_ = ((i_2998_ & 0xff) * anInt9333 & 0xff00);
										is[i_2997_] = (i_2999_ | i_3000_ | i_3001_) >>> 8;
									} else if (i == 3) {
										int i_3002_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]) & 0xff)]);
										int i_3003_ = anInt9350;
										int i_3004_ = i_3002_ + i_3003_;
										int i_3005_ = ((i_3002_ & 0xff00ff) + (i_3003_ & 0xff00ff));
										int i_3006_ = ((i_3005_ & 0x1000100) + (i_3004_ - i_3005_ & 0x10000));
										is[i_2997_] = (i_3004_ - i_3006_ | i_3006_ - (i_3006_ >>> 8));
									} else if (i == 2) {
										int i_3007_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]) & 0xff)]);
										int i_3008_ = ((i_3007_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3009_ = ((i_3007_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_2997_] = ((i_3008_ | i_3009_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 1) {
									if (i == 1) {
										int i_3010_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										if (i_3010_ != 0)
											is[i_2997_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3010_ & 0xff]);
									} else if (i == 0) {
										int i_3011_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										if (i_3011_ != 0) {
											int i_3012_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3011_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_3013_ = anInt9350 >>> 24;
												int i_3014_ = 256 - i_3013_;
												int i_3015_ = is[i_2997_];
												is[i_2997_] = (((((i_3012_ & 0xff00ff) * i_3013_) + ((i_3015_ & 0xff00ff) * i_3014_)) & ~0xff00ff) + ((((i_3012_ & 0xff00) * i_3013_) + ((i_3015_ & 0xff00) * i_3014_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_3016_ = (((i_3012_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3017_ = (((i_3012_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3018_ = (((i_3012_ & 0xff) * anInt9333) & 0xff00);
												i_3012_ = (i_3016_ | i_3017_ | i_3018_) >>> 8;
												int i_3019_ = is[i_2997_];
												is[i_2997_] = (((((i_3012_ & 0xff00ff) * anInt9351) + ((i_3019_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3012_ & 0xff00) * anInt9351) + ((i_3019_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_3020_ = (((i_3012_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3021_ = (((i_3012_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3022_ = (((i_3012_ & 0xff) * anInt9333) & 0xff00);
												is[i_2997_] = (i_3020_ | i_3021_ | i_3022_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3023_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										int i_3024_ = (i_3023_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3023_]) : 0);
										int i_3025_ = anInt9350;
										int i_3026_ = i_3024_ + i_3025_;
										int i_3027_ = ((i_3024_ & 0xff00ff) + (i_3025_ & 0xff00ff));
										int i_3028_ = ((i_3027_ & 0x1000100) + (i_3026_ - i_3027_ & 0x10000));
										i_3028_ = (i_3026_ - i_3028_ | i_3028_ - (i_3028_ >>> 8));
										if (i_3024_ == 0 && anInt9351 != 255) {
											i_3024_ = i_3028_;
											i_3028_ = is[i_2997_];
											i_3028_ = (((((i_3024_ & 0xff00ff) * anInt9351) + ((i_3028_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3024_ & 0xff00) * anInt9351) + ((i_3028_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_2997_] = i_3028_;
									} else if (i == 2) {
										int i_3029_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										if (i_3029_ != 0) {
											int i_3030_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3029_ & 0xff]);
											int i_3031_ = (((i_3030_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3032_ = (((i_3030_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_2997_++] = (((i_3031_ | i_3032_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 2) {
									if (i == 1) {
										int i_3033_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										if (i_3033_ != 0) {
											int i_3034_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3033_ & 0xff]);
											int i_3035_ = is[i_2997_];
											int i_3036_ = i_3034_ + i_3035_;
											int i_3037_ = ((i_3034_ & 0xff00ff) + (i_3035_ & 0xff00ff));
											i_3035_ = ((i_3037_ & 0x1000100) + (i_3036_ - i_3037_ & 0x10000));
											is[i_2997_] = (i_3036_ - i_3035_ | i_3035_ - (i_3035_ >>> 8));
										}
									} else if (i == 0) {
										int i_3038_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										if (i_3038_ != 0) {
											int i_3039_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3038_ & 0xff]);
											int i_3040_ = (((i_3039_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3041_ = (((i_3039_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3042_ = ((i_3039_ & 0xff) * anInt9333 & 0xff00);
											i_3039_ = (i_3040_ | i_3041_ | i_3042_) >>> 8;
											int i_3043_ = is[i_2997_];
											int i_3044_ = i_3039_ + i_3043_;
											int i_3045_ = ((i_3039_ & 0xff00ff) + (i_3043_ & 0xff00ff));
											i_3043_ = ((i_3045_ & 0x1000100) + (i_3044_ - i_3045_ & 0x10000));
											is[i_2997_] = (i_3044_ - i_3043_ | i_3043_ - (i_3043_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3046_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										int i_3047_ = (i_3046_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3046_]) : 0);
										int i_3048_ = anInt9350;
										int i_3049_ = i_3047_ + i_3048_;
										int i_3050_ = ((i_3047_ & 0xff00ff) + (i_3048_ & 0xff00ff));
										int i_3051_ = ((i_3050_ & 0x1000100) + (i_3049_ - i_3050_ & 0x10000));
										i_3051_ = (i_3049_ - i_3051_ | i_3051_ - (i_3051_ >>> 8));
										if (i_3047_ == 0 && anInt9351 != 255) {
											i_3047_ = i_3051_;
											i_3051_ = is[i_2997_];
											i_3051_ = (((((i_3047_ & 0xff00ff) * anInt9351) + ((i_3051_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3047_ & 0xff00) * anInt9351) + ((i_3051_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_2997_] = i_3051_;
									} else if (i == 2) {
										int i_3052_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_2996_]);
										if (i_3052_ != 0) {
											int i_3053_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3052_ & 0xff]);
											int i_3054_ = (((i_3053_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3055_ = (((i_3053_ & 0xff00) * anInt9351) & 0xff0000);
											i_3053_ = ((i_3054_ | i_3055_) >>> 8) + anInt9323;
											int i_3056_ = is[i_2997_];
											int i_3057_ = i_3053_ + i_3056_;
											int i_3058_ = ((i_3053_ & 0xff00ff) + (i_3056_ & 0xff00ff));
											i_3056_ = ((i_3058_ & 0x1000100) + (i_3057_ - i_3058_ & 0x10000));
											is[i_2997_] = (i_3057_ - i_3056_ | i_3056_ - (i_3056_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_2992_ += anInt9341;
							}
						}
						i_2989_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_3059_ = anInt9356;
					while (i_3059_ < 0) {
						int i_3060_ = anInt9339;
						int i_3061_ = anInt9346 + anInt9348;
						int i_3062_ = anInt9324;
						int i_3063_ = anInt9347;
						if (i_3062_ >= 0 && i_3062_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							int i_3064_;
							if ((i_3064_ = (i_3061_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_3064_ = (anInt9340 - i_3064_) / anInt9340;
								i_3063_ += i_3064_;
								i_3061_ += anInt9340 * i_3064_;
								i_3060_ += i_3064_;
							}
							if ((i_3064_ = (i_3061_ - anInt9340) / anInt9340) > i_3063_)
								i_3063_ = i_3064_;
							for (/**/; i_3063_ < 0; i_3063_++) {
								int i_3065_ = (((i_3062_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3061_ >> 12));
								int i_3066_ = i_3060_++;
								if (i_2851_ == 0) {
									if (i == 1)
										is[i_3066_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]) & 0xff)]);
									else if (i == 0) {
										int i_3067_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]) & 0xff)]);
										int i_3068_ = ((i_3067_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3069_ = ((i_3067_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3070_ = ((i_3067_ & 0xff) * anInt9333 & 0xff00);
										is[i_3066_] = (i_3068_ | i_3069_ | i_3070_) >>> 8;
									} else if (i == 3) {
										int i_3071_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]) & 0xff)]);
										int i_3072_ = anInt9350;
										int i_3073_ = i_3071_ + i_3072_;
										int i_3074_ = ((i_3071_ & 0xff00ff) + (i_3072_ & 0xff00ff));
										int i_3075_ = ((i_3074_ & 0x1000100) + (i_3073_ - i_3074_ & 0x10000));
										is[i_3066_] = (i_3073_ - i_3075_ | i_3075_ - (i_3075_ >>> 8));
									} else if (i == 2) {
										int i_3076_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]) & 0xff)]);
										int i_3077_ = ((i_3076_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3078_ = ((i_3076_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3066_] = ((i_3077_ | i_3078_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 1) {
									if (i == 1) {
										int i_3079_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										if (i_3079_ != 0)
											is[i_3066_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3079_ & 0xff]);
									} else if (i == 0) {
										int i_3080_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										if (i_3080_ != 0) {
											int i_3081_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3080_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_3082_ = anInt9350 >>> 24;
												int i_3083_ = 256 - i_3082_;
												int i_3084_ = is[i_3066_];
												is[i_3066_] = (((((i_3081_ & 0xff00ff) * i_3082_) + ((i_3084_ & 0xff00ff) * i_3083_)) & ~0xff00ff) + ((((i_3081_ & 0xff00) * i_3082_) + ((i_3084_ & 0xff00) * i_3083_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_3085_ = (((i_3081_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3086_ = (((i_3081_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3087_ = (((i_3081_ & 0xff) * anInt9333) & 0xff00);
												i_3081_ = (i_3085_ | i_3086_ | i_3087_) >>> 8;
												int i_3088_ = is[i_3066_];
												is[i_3066_] = (((((i_3081_ & 0xff00ff) * anInt9351) + ((i_3088_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3081_ & 0xff00) * anInt9351) + ((i_3088_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_3089_ = (((i_3081_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3090_ = (((i_3081_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3091_ = (((i_3081_ & 0xff) * anInt9333) & 0xff00);
												is[i_3066_] = (i_3089_ | i_3090_ | i_3091_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3092_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										int i_3093_ = (i_3092_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3092_]) : 0);
										int i_3094_ = anInt9350;
										int i_3095_ = i_3093_ + i_3094_;
										int i_3096_ = ((i_3093_ & 0xff00ff) + (i_3094_ & 0xff00ff));
										int i_3097_ = ((i_3096_ & 0x1000100) + (i_3095_ - i_3096_ & 0x10000));
										i_3097_ = (i_3095_ - i_3097_ | i_3097_ - (i_3097_ >>> 8));
										if (i_3093_ == 0 && anInt9351 != 255) {
											i_3093_ = i_3097_;
											i_3097_ = is[i_3066_];
											i_3097_ = (((((i_3093_ & 0xff00ff) * anInt9351) + ((i_3097_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3093_ & 0xff00) * anInt9351) + ((i_3097_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3066_] = i_3097_;
									} else if (i == 2) {
										int i_3098_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										if (i_3098_ != 0) {
											int i_3099_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3098_ & 0xff]);
											int i_3100_ = (((i_3099_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3101_ = (((i_3099_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_3066_++] = (((i_3100_ | i_3101_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_2851_ == 2) {
									if (i == 1) {
										int i_3102_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										if (i_3102_ != 0) {
											int i_3103_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3102_ & 0xff]);
											int i_3104_ = is[i_3066_];
											int i_3105_ = i_3103_ + i_3104_;
											int i_3106_ = ((i_3103_ & 0xff00ff) + (i_3104_ & 0xff00ff));
											i_3104_ = ((i_3106_ & 0x1000100) + (i_3105_ - i_3106_ & 0x10000));
											is[i_3066_] = (i_3105_ - i_3104_ | i_3104_ - (i_3104_ >>> 8));
										}
									} else if (i == 0) {
										int i_3107_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										if (i_3107_ != 0) {
											int i_3108_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3107_ & 0xff]);
											int i_3109_ = (((i_3108_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3110_ = (((i_3108_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3111_ = ((i_3108_ & 0xff) * anInt9333 & 0xff00);
											i_3108_ = (i_3109_ | i_3110_ | i_3111_) >>> 8;
											int i_3112_ = is[i_3066_];
											int i_3113_ = i_3108_ + i_3112_;
											int i_3114_ = ((i_3108_ & 0xff00ff) + (i_3112_ & 0xff00ff));
											i_3112_ = ((i_3114_ & 0x1000100) + (i_3113_ - i_3114_ & 0x10000));
											is[i_3066_] = (i_3113_ - i_3112_ | i_3112_ - (i_3112_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3115_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										int i_3116_ = (i_3115_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3115_]) : 0);
										int i_3117_ = anInt9350;
										int i_3118_ = i_3116_ + i_3117_;
										int i_3119_ = ((i_3116_ & 0xff00ff) + (i_3117_ & 0xff00ff));
										int i_3120_ = ((i_3119_ & 0x1000100) + (i_3118_ - i_3119_ & 0x10000));
										i_3120_ = (i_3118_ - i_3120_ | i_3120_ - (i_3120_ >>> 8));
										if (i_3116_ == 0 && anInt9351 != 255) {
											i_3116_ = i_3120_;
											i_3120_ = is[i_3066_];
											i_3120_ = (((((i_3116_ & 0xff00ff) * anInt9351) + ((i_3120_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3116_ & 0xff00) * anInt9351) + ((i_3120_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3066_] = i_3120_;
									} else if (i == 2) {
										int i_3121_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3065_]);
										if (i_3121_ != 0) {
											int i_3122_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3121_ & 0xff]);
											int i_3123_ = (((i_3122_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3124_ = (((i_3122_ & 0xff00) * anInt9351) & 0xff0000);
											i_3122_ = ((i_3123_ | i_3124_) >>> 8) + anInt9323;
											int i_3125_ = is[i_3066_];
											int i_3126_ = i_3122_ + i_3125_;
											int i_3127_ = ((i_3122_ & 0xff00ff) + (i_3125_ & 0xff00ff));
											i_3125_ = ((i_3127_ & 0x1000100) + (i_3126_ - i_3127_ & 0x10000));
											is[i_3066_] = (i_3126_ - i_3125_ | i_3125_ - (i_3125_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3061_ += anInt9340;
							}
						}
						i_3059_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_3128_ = anInt9356;
					while (i_3128_ < 0) {
						int i_3129_ = anInt9339;
						int i_3130_ = anInt9346 + anInt9348;
						int i_3131_ = anInt9324 + anInt9349;
						int i_3132_ = anInt9347;
						int i_3133_;
						if ((i_3133_ = i_3130_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) >= 0) {
							i_3133_ = (anInt9340 - i_3133_) / anInt9340;
							i_3132_ += i_3133_;
							i_3130_ += anInt9340 * i_3133_;
							i_3131_ += anInt9341 * i_3133_;
							i_3129_ += i_3133_;
						}
						if ((i_3133_ = (i_3130_ - anInt9340) / anInt9340) > i_3132_)
							i_3132_ = i_3133_;
						if ((i_3133_ = i_3131_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_3133_ = (anInt9341 - i_3133_) / anInt9341;
							i_3132_ += i_3133_;
							i_3130_ += anInt9340 * i_3133_;
							i_3131_ += anInt9341 * i_3133_;
							i_3129_ += i_3133_;
						}
						if ((i_3133_ = (i_3131_ - anInt9341) / anInt9341) > i_3132_)
							i_3132_ = i_3133_;
						for (/**/; i_3132_ < 0; i_3132_++) {
							int i_3134_ = (((i_3131_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3130_ >> 12));
							int i_3135_ = i_3129_++;
							if (i_2851_ == 0) {
								if (i == 1)
									is[i_3135_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]) & 0xff]);
								else if (i == 0) {
									int i_3136_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]) & 0xff]);
									int i_3137_ = ((i_3136_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3138_ = ((i_3136_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3139_ = ((i_3136_ & 0xff) * anInt9333 & 0xff00);
									is[i_3135_] = (i_3137_ | i_3138_ | i_3139_) >>> 8;
								} else if (i == 3) {
									int i_3140_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]) & 0xff]);
									int i_3141_ = anInt9350;
									int i_3142_ = i_3140_ + i_3141_;
									int i_3143_ = ((i_3140_ & 0xff00ff) + (i_3141_ & 0xff00ff));
									int i_3144_ = ((i_3143_ & 0x1000100) + (i_3142_ - i_3143_ & 0x10000));
									is[i_3135_] = (i_3142_ - i_3144_ | i_3144_ - (i_3144_ >>> 8));
								} else if (i == 2) {
									int i_3145_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]) & 0xff]);
									int i_3146_ = ((i_3145_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3147_ = ((i_3145_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3135_] = (((i_3146_ | i_3147_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_2851_ == 1) {
								if (i == 1) {
									int i_3148_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									if (i_3148_ != 0)
										is[i_3135_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3148_ & 0xff]);
								} else if (i == 0) {
									int i_3149_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									if (i_3149_ != 0) {
										int i_3150_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3149_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_3151_ = anInt9350 >>> 24;
											int i_3152_ = 256 - i_3151_;
											int i_3153_ = is[i_3135_];
											is[i_3135_] = (((((i_3150_ & 0xff00ff) * i_3151_) + ((i_3153_ & 0xff00ff) * i_3152_)) & ~0xff00ff) + ((((i_3150_ & 0xff00) * i_3151_) + ((i_3153_ & 0xff00) * i_3152_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_3154_ = (((i_3150_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3155_ = (((i_3150_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3156_ = ((i_3150_ & 0xff) * anInt9333 & 0xff00);
											i_3150_ = (i_3154_ | i_3155_ | i_3156_) >>> 8;
											int i_3157_ = is[i_3135_];
											is[i_3135_] = (((((i_3150_ & 0xff00ff) * anInt9351) + ((i_3157_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3150_ & 0xff00) * anInt9351) + ((i_3157_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_3158_ = (((i_3150_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3159_ = (((i_3150_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3160_ = ((i_3150_ & 0xff) * anInt9333 & 0xff00);
											is[i_3135_] = (i_3158_ | i_3159_ | i_3160_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3161_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									int i_3162_ = (i_3161_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3161_]) : 0);
									int i_3163_ = anInt9350;
									int i_3164_ = i_3162_ + i_3163_;
									int i_3165_ = ((i_3162_ & 0xff00ff) + (i_3163_ & 0xff00ff));
									int i_3166_ = ((i_3165_ & 0x1000100) + (i_3164_ - i_3165_ & 0x10000));
									i_3166_ = (i_3164_ - i_3166_ | i_3166_ - (i_3166_ >>> 8));
									if (i_3162_ == 0 && anInt9351 != 255) {
										i_3162_ = i_3166_;
										i_3166_ = is[i_3135_];
										i_3166_ = (((((i_3162_ & 0xff00ff) * anInt9351) + ((i_3166_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3162_ & 0xff00) * anInt9351) + ((i_3166_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3135_] = i_3166_;
								} else if (i == 2) {
									int i_3167_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									if (i_3167_ != 0) {
										int i_3168_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3167_ & 0xff]);
										int i_3169_ = ((i_3168_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3170_ = ((i_3168_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3135_++] = ((i_3169_ | i_3170_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2851_ == 2) {
								if (i == 1) {
									int i_3171_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									if (i_3171_ != 0) {
										int i_3172_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3171_ & 0xff]);
										int i_3173_ = is[i_3135_];
										int i_3174_ = i_3172_ + i_3173_;
										int i_3175_ = ((i_3172_ & 0xff00ff) + (i_3173_ & 0xff00ff));
										i_3173_ = ((i_3175_ & 0x1000100) + (i_3174_ - i_3175_ & 0x10000));
										is[i_3135_] = (i_3174_ - i_3173_ | i_3173_ - (i_3173_ >>> 8));
									}
								} else if (i == 0) {
									int i_3176_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									if (i_3176_ != 0) {
										int i_3177_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3176_ & 0xff]);
										int i_3178_ = ((i_3177_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3179_ = ((i_3177_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3180_ = ((i_3177_ & 0xff) * anInt9333 & 0xff00);
										i_3177_ = (i_3178_ | i_3179_ | i_3180_) >>> 8;
										int i_3181_ = is[i_3135_];
										int i_3182_ = i_3177_ + i_3181_;
										int i_3183_ = ((i_3177_ & 0xff00ff) + (i_3181_ & 0xff00ff));
										i_3181_ = ((i_3183_ & 0x1000100) + (i_3182_ - i_3183_ & 0x10000));
										is[i_3135_] = (i_3182_ - i_3181_ | i_3181_ - (i_3181_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3184_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									int i_3185_ = (i_3184_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3184_]) : 0);
									int i_3186_ = anInt9350;
									int i_3187_ = i_3185_ + i_3186_;
									int i_3188_ = ((i_3185_ & 0xff00ff) + (i_3186_ & 0xff00ff));
									int i_3189_ = ((i_3188_ & 0x1000100) + (i_3187_ - i_3188_ & 0x10000));
									i_3189_ = (i_3187_ - i_3189_ | i_3189_ - (i_3189_ >>> 8));
									if (i_3185_ == 0 && anInt9351 != 255) {
										i_3185_ = i_3189_;
										i_3189_ = is[i_3135_];
										i_3189_ = (((((i_3185_ & 0xff00ff) * anInt9351) + ((i_3189_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3185_ & 0xff00) * anInt9351) + ((i_3189_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3135_] = i_3189_;
								} else if (i == 2) {
									int i_3190_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3134_]);
									if (i_3190_ != 0) {
										int i_3191_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3190_ & 0xff]);
										int i_3192_ = ((i_3191_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3193_ = ((i_3191_ & 0xff00) * anInt9351 & 0xff0000);
										i_3191_ = (((i_3192_ | i_3193_) >>> 8) + anInt9323);
										int i_3194_ = is[i_3135_];
										int i_3195_ = i_3191_ + i_3194_;
										int i_3196_ = ((i_3191_ & 0xff00ff) + (i_3194_ & 0xff00ff));
										i_3194_ = ((i_3196_ & 0x1000100) + (i_3195_ - i_3196_ & 0x10000));
										is[i_3135_] = (i_3195_ - i_3194_ | i_3194_ - (i_3194_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3130_ += anInt9340;
							i_3131_ += anInt9341;
						}
						i_3128_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_3197_ = anInt9356;
					while (i_3197_ < 0) {
						int i_3198_ = anInt9339;
						int i_3199_ = anInt9346 + anInt9348;
						int i_3200_ = anInt9324 + anInt9349;
						int i_3201_ = anInt9347;
						int i_3202_;
						if ((i_3202_ = i_3199_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) >= 0) {
							i_3202_ = (anInt9340 - i_3202_) / anInt9340;
							i_3201_ += i_3202_;
							i_3199_ += anInt9340 * i_3202_;
							i_3200_ += anInt9341 * i_3202_;
							i_3198_ += i_3202_;
						}
						if ((i_3202_ = (i_3199_ - anInt9340) / anInt9340) > i_3201_)
							i_3201_ = i_3202_;
						if (i_3200_ < 0) {
							i_3202_ = (anInt9341 - 1 - i_3200_) / anInt9341;
							i_3201_ += i_3202_;
							i_3199_ += anInt9340 * i_3202_;
							i_3200_ += anInt9341 * i_3202_;
							i_3198_ += i_3202_;
						}
						if ((i_3202_ = (1 + i_3200_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_3201_)
							i_3201_ = i_3202_;
						for (/**/; i_3201_ < 0; i_3201_++) {
							int i_3203_ = (((i_3200_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3199_ >> 12));
							int i_3204_ = i_3198_++;
							if (i_2851_ == 0) {
								if (i == 1)
									is[i_3204_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]) & 0xff]);
								else if (i == 0) {
									int i_3205_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]) & 0xff]);
									int i_3206_ = ((i_3205_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3207_ = ((i_3205_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3208_ = ((i_3205_ & 0xff) * anInt9333 & 0xff00);
									is[i_3204_] = (i_3206_ | i_3207_ | i_3208_) >>> 8;
								} else if (i == 3) {
									int i_3209_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]) & 0xff]);
									int i_3210_ = anInt9350;
									int i_3211_ = i_3209_ + i_3210_;
									int i_3212_ = ((i_3209_ & 0xff00ff) + (i_3210_ & 0xff00ff));
									int i_3213_ = ((i_3212_ & 0x1000100) + (i_3211_ - i_3212_ & 0x10000));
									is[i_3204_] = (i_3211_ - i_3213_ | i_3213_ - (i_3213_ >>> 8));
								} else if (i == 2) {
									int i_3214_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]) & 0xff]);
									int i_3215_ = ((i_3214_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3216_ = ((i_3214_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3204_] = (((i_3215_ | i_3216_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_2851_ == 1) {
								if (i == 1) {
									int i_3217_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									if (i_3217_ != 0)
										is[i_3204_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3217_ & 0xff]);
								} else if (i == 0) {
									int i_3218_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									if (i_3218_ != 0) {
										int i_3219_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3218_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_3220_ = anInt9350 >>> 24;
											int i_3221_ = 256 - i_3220_;
											int i_3222_ = is[i_3204_];
											is[i_3204_] = (((((i_3219_ & 0xff00ff) * i_3220_) + ((i_3222_ & 0xff00ff) * i_3221_)) & ~0xff00ff) + ((((i_3219_ & 0xff00) * i_3220_) + ((i_3222_ & 0xff00) * i_3221_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_3223_ = (((i_3219_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3224_ = (((i_3219_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3225_ = ((i_3219_ & 0xff) * anInt9333 & 0xff00);
											i_3219_ = (i_3223_ | i_3224_ | i_3225_) >>> 8;
											int i_3226_ = is[i_3204_];
											is[i_3204_] = (((((i_3219_ & 0xff00ff) * anInt9351) + ((i_3226_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3219_ & 0xff00) * anInt9351) + ((i_3226_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_3227_ = (((i_3219_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3228_ = (((i_3219_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3229_ = ((i_3219_ & 0xff) * anInt9333 & 0xff00);
											is[i_3204_] = (i_3227_ | i_3228_ | i_3229_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3230_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									int i_3231_ = (i_3230_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3230_]) : 0);
									int i_3232_ = anInt9350;
									int i_3233_ = i_3231_ + i_3232_;
									int i_3234_ = ((i_3231_ & 0xff00ff) + (i_3232_ & 0xff00ff));
									int i_3235_ = ((i_3234_ & 0x1000100) + (i_3233_ - i_3234_ & 0x10000));
									i_3235_ = (i_3233_ - i_3235_ | i_3235_ - (i_3235_ >>> 8));
									if (i_3231_ == 0 && anInt9351 != 255) {
										i_3231_ = i_3235_;
										i_3235_ = is[i_3204_];
										i_3235_ = (((((i_3231_ & 0xff00ff) * anInt9351) + ((i_3235_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3231_ & 0xff00) * anInt9351) + ((i_3235_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3204_] = i_3235_;
								} else if (i == 2) {
									int i_3236_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									if (i_3236_ != 0) {
										int i_3237_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3236_ & 0xff]);
										int i_3238_ = ((i_3237_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3239_ = ((i_3237_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3204_++] = ((i_3238_ | i_3239_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2851_ == 2) {
								if (i == 1) {
									int i_3240_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									if (i_3240_ != 0) {
										int i_3241_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3240_ & 0xff]);
										int i_3242_ = is[i_3204_];
										int i_3243_ = i_3241_ + i_3242_;
										int i_3244_ = ((i_3241_ & 0xff00ff) + (i_3242_ & 0xff00ff));
										i_3242_ = ((i_3244_ & 0x1000100) + (i_3243_ - i_3244_ & 0x10000));
										is[i_3204_] = (i_3243_ - i_3242_ | i_3242_ - (i_3242_ >>> 8));
									}
								} else if (i == 0) {
									int i_3245_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									if (i_3245_ != 0) {
										int i_3246_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3245_ & 0xff]);
										int i_3247_ = ((i_3246_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3248_ = ((i_3246_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3249_ = ((i_3246_ & 0xff) * anInt9333 & 0xff00);
										i_3246_ = (i_3247_ | i_3248_ | i_3249_) >>> 8;
										int i_3250_ = is[i_3204_];
										int i_3251_ = i_3246_ + i_3250_;
										int i_3252_ = ((i_3246_ & 0xff00ff) + (i_3250_ & 0xff00ff));
										i_3250_ = ((i_3252_ & 0x1000100) + (i_3251_ - i_3252_ & 0x10000));
										is[i_3204_] = (i_3251_ - i_3250_ | i_3250_ - (i_3250_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3253_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									int i_3254_ = (i_3253_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3253_]) : 0);
									int i_3255_ = anInt9350;
									int i_3256_ = i_3254_ + i_3255_;
									int i_3257_ = ((i_3254_ & 0xff00ff) + (i_3255_ & 0xff00ff));
									int i_3258_ = ((i_3257_ & 0x1000100) + (i_3256_ - i_3257_ & 0x10000));
									i_3258_ = (i_3256_ - i_3258_ | i_3258_ - (i_3258_ >>> 8));
									if (i_3254_ == 0 && anInt9351 != 255) {
										i_3254_ = i_3258_;
										i_3258_ = is[i_3204_];
										i_3258_ = (((((i_3254_ & 0xff00ff) * anInt9351) + ((i_3258_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3254_ & 0xff00) * anInt9351) + ((i_3258_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3204_] = i_3258_;
								} else if (i == 2) {
									int i_3259_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3203_]);
									if (i_3259_ != 0) {
										int i_3260_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3259_ & 0xff]);
										int i_3261_ = ((i_3260_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3262_ = ((i_3260_ & 0xff00) * anInt9351 & 0xff0000);
										i_3260_ = (((i_3261_ | i_3262_) >>> 8) + anInt9323);
										int i_3263_ = is[i_3204_];
										int i_3264_ = i_3260_ + i_3263_;
										int i_3265_ = ((i_3260_ & 0xff00ff) + (i_3263_ & 0xff00ff));
										i_3263_ = ((i_3265_ & 0x1000100) + (i_3264_ - i_3265_ & 0x10000));
										is[i_3204_] = (i_3264_ - i_3263_ | i_3263_ - (i_3263_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3199_ += anInt9340;
							i_3200_ += anInt9341;
						}
						i_3197_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_3266_ = anInt9356;
				while (i_3266_ < 0) {
					int i_3267_ = anInt9339;
					int i_3268_ = anInt9346 + anInt9348;
					int i_3269_ = anInt9324;
					int i_3270_ = anInt9347;
					if (i_3269_ >= 0 && i_3269_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
						if (i_3268_ < 0) {
							int i_3271_ = (anInt9340 - 1 - i_3268_) / anInt9340;
							i_3270_ += i_3271_;
							i_3268_ += anInt9340 * i_3271_;
							i_3267_ += i_3271_;
						}
						int i_3272_;
						if ((i_3272_ = (1 + i_3268_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_3270_)
							i_3270_ = i_3272_;
						for (/**/; i_3270_ < 0; i_3270_++) {
							int i_3273_ = (((i_3269_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3268_ >> 12));
							int i_3274_ = i_3267_++;
							if (i_2851_ == 0) {
								if (i == 1)
									is[i_3274_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]) & 0xff]);
								else if (i == 0) {
									int i_3275_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]) & 0xff]);
									int i_3276_ = ((i_3275_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3277_ = ((i_3275_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3278_ = ((i_3275_ & 0xff) * anInt9333 & 0xff00);
									is[i_3274_] = (i_3276_ | i_3277_ | i_3278_) >>> 8;
								} else if (i == 3) {
									int i_3279_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]) & 0xff]);
									int i_3280_ = anInt9350;
									int i_3281_ = i_3279_ + i_3280_;
									int i_3282_ = ((i_3279_ & 0xff00ff) + (i_3280_ & 0xff00ff));
									int i_3283_ = ((i_3282_ & 0x1000100) + (i_3281_ - i_3282_ & 0x10000));
									is[i_3274_] = (i_3281_ - i_3283_ | i_3283_ - (i_3283_ >>> 8));
								} else if (i == 2) {
									int i_3284_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]) & 0xff]);
									int i_3285_ = ((i_3284_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3286_ = ((i_3284_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3274_] = (((i_3285_ | i_3286_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_2851_ == 1) {
								if (i == 1) {
									int i_3287_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									if (i_3287_ != 0)
										is[i_3274_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3287_ & 0xff]);
								} else if (i == 0) {
									int i_3288_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									if (i_3288_ != 0) {
										int i_3289_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3288_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_3290_ = anInt9350 >>> 24;
											int i_3291_ = 256 - i_3290_;
											int i_3292_ = is[i_3274_];
											is[i_3274_] = (((((i_3289_ & 0xff00ff) * i_3290_) + ((i_3292_ & 0xff00ff) * i_3291_)) & ~0xff00ff) + ((((i_3289_ & 0xff00) * i_3290_) + ((i_3292_ & 0xff00) * i_3291_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_3293_ = (((i_3289_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3294_ = (((i_3289_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3295_ = ((i_3289_ & 0xff) * anInt9333 & 0xff00);
											i_3289_ = (i_3293_ | i_3294_ | i_3295_) >>> 8;
											int i_3296_ = is[i_3274_];
											is[i_3274_] = (((((i_3289_ & 0xff00ff) * anInt9351) + ((i_3296_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3289_ & 0xff00) * anInt9351) + ((i_3296_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_3297_ = (((i_3289_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3298_ = (((i_3289_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3299_ = ((i_3289_ & 0xff) * anInt9333 & 0xff00);
											is[i_3274_] = (i_3297_ | i_3298_ | i_3299_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3300_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									int i_3301_ = (i_3300_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3300_]) : 0);
									int i_3302_ = anInt9350;
									int i_3303_ = i_3301_ + i_3302_;
									int i_3304_ = ((i_3301_ & 0xff00ff) + (i_3302_ & 0xff00ff));
									int i_3305_ = ((i_3304_ & 0x1000100) + (i_3303_ - i_3304_ & 0x10000));
									i_3305_ = (i_3303_ - i_3305_ | i_3305_ - (i_3305_ >>> 8));
									if (i_3301_ == 0 && anInt9351 != 255) {
										i_3301_ = i_3305_;
										i_3305_ = is[i_3274_];
										i_3305_ = (((((i_3301_ & 0xff00ff) * anInt9351) + ((i_3305_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3301_ & 0xff00) * anInt9351) + ((i_3305_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3274_] = i_3305_;
								} else if (i == 2) {
									int i_3306_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									if (i_3306_ != 0) {
										int i_3307_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3306_ & 0xff]);
										int i_3308_ = ((i_3307_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3309_ = ((i_3307_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3274_++] = ((i_3308_ | i_3309_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_2851_ == 2) {
								if (i == 1) {
									int i_3310_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									if (i_3310_ != 0) {
										int i_3311_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3310_ & 0xff]);
										int i_3312_ = is[i_3274_];
										int i_3313_ = i_3311_ + i_3312_;
										int i_3314_ = ((i_3311_ & 0xff00ff) + (i_3312_ & 0xff00ff));
										i_3312_ = ((i_3314_ & 0x1000100) + (i_3313_ - i_3314_ & 0x10000));
										is[i_3274_] = (i_3313_ - i_3312_ | i_3312_ - (i_3312_ >>> 8));
									}
								} else if (i == 0) {
									int i_3315_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									if (i_3315_ != 0) {
										int i_3316_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3315_ & 0xff]);
										int i_3317_ = ((i_3316_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3318_ = ((i_3316_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3319_ = ((i_3316_ & 0xff) * anInt9333 & 0xff00);
										i_3316_ = (i_3317_ | i_3318_ | i_3319_) >>> 8;
										int i_3320_ = is[i_3274_];
										int i_3321_ = i_3316_ + i_3320_;
										int i_3322_ = ((i_3316_ & 0xff00ff) + (i_3320_ & 0xff00ff));
										i_3320_ = ((i_3322_ & 0x1000100) + (i_3321_ - i_3322_ & 0x10000));
										is[i_3274_] = (i_3321_ - i_3320_ | i_3320_ - (i_3320_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3323_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									int i_3324_ = (i_3323_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3323_]) : 0);
									int i_3325_ = anInt9350;
									int i_3326_ = i_3324_ + i_3325_;
									int i_3327_ = ((i_3324_ & 0xff00ff) + (i_3325_ & 0xff00ff));
									int i_3328_ = ((i_3327_ & 0x1000100) + (i_3326_ - i_3327_ & 0x10000));
									i_3328_ = (i_3326_ - i_3328_ | i_3328_ - (i_3328_ >>> 8));
									if (i_3324_ == 0 && anInt9351 != 255) {
										i_3324_ = i_3328_;
										i_3328_ = is[i_3274_];
										i_3328_ = (((((i_3324_ & 0xff00ff) * anInt9351) + ((i_3328_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3324_ & 0xff00) * anInt9351) + ((i_3328_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3274_] = i_3328_;
								} else if (i == 2) {
									int i_3329_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3273_]);
									if (i_3329_ != 0) {
										int i_3330_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3329_ & 0xff]);
										int i_3331_ = ((i_3330_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3332_ = ((i_3330_ & 0xff00) * anInt9351 & 0xff0000);
										i_3330_ = (((i_3331_ | i_3332_) >>> 8) + anInt9323);
										int i_3333_ = is[i_3274_];
										int i_3334_ = i_3330_ + i_3333_;
										int i_3335_ = ((i_3330_ & 0xff00ff) + (i_3333_ & 0xff00ff));
										i_3333_ = ((i_3335_ & 0x1000100) + (i_3334_ - i_3335_ & 0x10000));
										is[i_3274_] = (i_3334_ - i_3333_ | i_3333_ - (i_3333_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3268_ += anInt9340;
						}
					}
					i_3266_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_3336_ = anInt9356; i_3336_ < 0; i_3336_++) {
					int i_3337_ = anInt9339;
					int i_3338_ = anInt9346 + anInt9348;
					int i_3339_ = anInt9324 + anInt9349;
					int i_3340_ = anInt9347;
					if (i_3338_ < 0) {
						int i_3341_ = (anInt9340 - 1 - i_3338_) / anInt9340;
						i_3340_ += i_3341_;
						i_3338_ += anInt9340 * i_3341_;
						i_3339_ += anInt9341 * i_3341_;
						i_3337_ += i_3341_;
					}
					int i_3342_;
					if ((i_3342_ = (1 + i_3338_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_3340_)
						i_3340_ = i_3342_;
					if ((i_3342_ = i_3339_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
						i_3342_ = (anInt9341 - i_3342_) / anInt9341;
						i_3340_ += i_3342_;
						i_3338_ += anInt9340 * i_3342_;
						i_3339_ += anInt9341 * i_3342_;
						i_3337_ += i_3342_;
					}
					if ((i_3342_ = (i_3339_ - anInt9341) / anInt9341) > i_3340_)
						i_3340_ = i_3342_;
					for (/**/; i_3340_ < 0; i_3340_++) {
						int i_3343_ = (((i_3339_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3338_ >> 12));
						int i_3344_ = i_3337_++;
						if (i_2851_ == 0) {
							if (i == 1)
								is[i_3344_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]) & 0xff]);
							else if (i == 0) {
								int i_3345_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]) & 0xff]);
								int i_3346_ = ((i_3345_ & 0xff0000) * anInt9353 & ~0xffffff);
								int i_3347_ = ((i_3345_ & 0xff00) * anInt9354 & 0xff0000);
								int i_3348_ = (i_3345_ & 0xff) * anInt9333 & 0xff00;
								is[i_3344_] = (i_3346_ | i_3347_ | i_3348_) >>> 8;
							} else if (i == 3) {
								int i_3349_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]) & 0xff]);
								int i_3350_ = anInt9350;
								int i_3351_ = i_3349_ + i_3350_;
								int i_3352_ = ((i_3349_ & 0xff00ff) + (i_3350_ & 0xff00ff));
								int i_3353_ = ((i_3352_ & 0x1000100) + (i_3351_ - i_3352_ & 0x10000));
								is[i_3344_] = i_3351_ - i_3353_ | i_3353_ - (i_3353_ >>> 8);
							} else if (i == 2) {
								int i_3354_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]) & 0xff]);
								int i_3355_ = ((i_3354_ & 0xff00ff) * anInt9351 & ~0xff00ff);
								int i_3356_ = ((i_3354_ & 0xff00) * anInt9351 & 0xff0000);
								is[i_3344_] = ((i_3355_ | i_3356_) >>> 8) + anInt9323;
							} else
								throw new IllegalArgumentException();
						} else if (i_2851_ == 1) {
							if (i == 1) {
								int i_3357_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								if (i_3357_ != 0)
									is[i_3344_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3357_ & 0xff]);
							} else if (i == 0) {
								int i_3358_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								if (i_3358_ != 0) {
									int i_3359_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3358_ & 0xff]);
									if ((anInt9350 & 0xffffff) == 16777215) {
										int i_3360_ = anInt9350 >>> 24;
										int i_3361_ = 256 - i_3360_;
										int i_3362_ = is[i_3344_];
										is[i_3344_] = ((((i_3359_ & 0xff00ff) * i_3360_ + ((i_3362_ & 0xff00ff) * i_3361_)) & ~0xff00ff) + (((i_3359_ & 0xff00) * i_3360_ + ((i_3362_ & 0xff00) * i_3361_)) & 0xff0000)) >> 8;
									} else if (anInt9351 != 255) {
										int i_3363_ = ((i_3359_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3364_ = ((i_3359_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3365_ = ((i_3359_ & 0xff) * anInt9333 & 0xff00);
										i_3359_ = (i_3363_ | i_3364_ | i_3365_) >>> 8;
										int i_3366_ = is[i_3344_];
										is[i_3344_] = (((((i_3359_ & 0xff00ff) * anInt9351) + ((i_3366_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3359_ & 0xff00) * anInt9351) + ((i_3366_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									} else {
										int i_3367_ = ((i_3359_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3368_ = ((i_3359_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3369_ = ((i_3359_ & 0xff) * anInt9333 & 0xff00);
										is[i_3344_] = (i_3367_ | i_3368_ | i_3369_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3370_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								int i_3371_ = (i_3370_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3370_]) : 0);
								int i_3372_ = anInt9350;
								int i_3373_ = i_3371_ + i_3372_;
								int i_3374_ = ((i_3371_ & 0xff00ff) + (i_3372_ & 0xff00ff));
								int i_3375_ = ((i_3374_ & 0x1000100) + (i_3373_ - i_3374_ & 0x10000));
								i_3375_ = i_3373_ - i_3375_ | i_3375_ - (i_3375_ >>> 8);
								if (i_3371_ == 0 && anInt9351 != 255) {
									i_3371_ = i_3375_;
									i_3375_ = is[i_3344_];
									i_3375_ = ((((i_3371_ & 0xff00ff) * anInt9351 + ((i_3375_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_3371_ & 0xff00) * anInt9351 + ((i_3375_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_3344_] = i_3375_;
							} else if (i == 2) {
								int i_3376_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								if (i_3376_ != 0) {
									int i_3377_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3376_ & 0xff]);
									int i_3378_ = ((i_3377_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3379_ = ((i_3377_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3344_++] = ((i_3378_ | i_3379_) >>> 8) + anInt9323;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2851_ == 2) {
							if (i == 1) {
								int i_3380_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								if (i_3380_ != 0) {
									int i_3381_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3380_ & 0xff]);
									int i_3382_ = is[i_3344_];
									int i_3383_ = i_3381_ + i_3382_;
									int i_3384_ = ((i_3381_ & 0xff00ff) + (i_3382_ & 0xff00ff));
									i_3382_ = ((i_3384_ & 0x1000100) + (i_3383_ - i_3384_ & 0x10000));
									is[i_3344_] = (i_3383_ - i_3382_ | i_3382_ - (i_3382_ >>> 8));
								}
							} else if (i == 0) {
								int i_3385_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								if (i_3385_ != 0) {
									int i_3386_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3385_ & 0xff]);
									int i_3387_ = ((i_3386_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3388_ = ((i_3386_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3389_ = ((i_3386_ & 0xff) * anInt9333 & 0xff00);
									i_3386_ = (i_3387_ | i_3388_ | i_3389_) >>> 8;
									int i_3390_ = is[i_3344_];
									int i_3391_ = i_3386_ + i_3390_;
									int i_3392_ = ((i_3386_ & 0xff00ff) + (i_3390_ & 0xff00ff));
									i_3390_ = ((i_3392_ & 0x1000100) + (i_3391_ - i_3392_ & 0x10000));
									is[i_3344_] = (i_3391_ - i_3390_ | i_3390_ - (i_3390_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3393_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								int i_3394_ = (i_3393_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3393_]) : 0);
								int i_3395_ = anInt9350;
								int i_3396_ = i_3394_ + i_3395_;
								int i_3397_ = ((i_3394_ & 0xff00ff) + (i_3395_ & 0xff00ff));
								int i_3398_ = ((i_3397_ & 0x1000100) + (i_3396_ - i_3397_ & 0x10000));
								i_3398_ = i_3396_ - i_3398_ | i_3398_ - (i_3398_ >>> 8);
								if (i_3394_ == 0 && anInt9351 != 255) {
									i_3394_ = i_3398_;
									i_3398_ = is[i_3344_];
									i_3398_ = ((((i_3394_ & 0xff00ff) * anInt9351 + ((i_3398_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_3394_ & 0xff00) * anInt9351 + ((i_3398_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_3344_] = i_3398_;
							} else if (i == 2) {
								int i_3399_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3343_]);
								if (i_3399_ != 0) {
									int i_3400_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3399_ & 0xff]);
									int i_3401_ = ((i_3400_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3402_ = ((i_3400_ & 0xff00) * anInt9351 & 0xff0000);
									i_3400_ = (((i_3401_ | i_3402_) >>> 8) + anInt9323);
									int i_3403_ = is[i_3344_];
									int i_3404_ = i_3400_ + i_3403_;
									int i_3405_ = ((i_3400_ & 0xff00ff) + (i_3403_ & 0xff00ff));
									i_3403_ = ((i_3405_ & 0x1000100) + (i_3404_ - i_3405_ & 0x10000));
									is[i_3344_] = (i_3404_ - i_3403_ | i_3403_ - (i_3403_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3338_ += anInt9340;
						i_3339_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_3406_ = anInt9356; i_3406_ < 0; i_3406_++) {
					int i_3407_ = anInt9339;
					int i_3408_ = anInt9346 + anInt9348;
					int i_3409_ = anInt9324 + anInt9349;
					int i_3410_ = anInt9347;
					if (i_3408_ < 0) {
						int i_3411_ = (anInt9340 - 1 - i_3408_) / anInt9340;
						i_3410_ += i_3411_;
						i_3408_ += anInt9340 * i_3411_;
						i_3409_ += anInt9341 * i_3411_;
						i_3407_ += i_3411_;
					}
					int i_3412_;
					if ((i_3412_ = (1 + i_3408_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_3410_)
						i_3410_ = i_3412_;
					if (i_3409_ < 0) {
						i_3412_ = (anInt9341 - 1 - i_3409_) / anInt9341;
						i_3410_ += i_3412_;
						i_3408_ += anInt9340 * i_3412_;
						i_3409_ += anInt9341 * i_3412_;
						i_3407_ += i_3412_;
					}
					if ((i_3412_ = (1 + i_3409_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_3410_)
						i_3410_ = i_3412_;
					for (/**/; i_3410_ < 0; i_3410_++) {
						int i_3413_ = (((i_3409_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3408_ >> 12));
						int i_3414_ = i_3407_++;
						if (i_2851_ == 0) {
							if (i == 1)
								is[i_3414_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]) & 0xff]);
							else if (i == 0) {
								int i_3415_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]) & 0xff]);
								int i_3416_ = ((i_3415_ & 0xff0000) * anInt9353 & ~0xffffff);
								int i_3417_ = ((i_3415_ & 0xff00) * anInt9354 & 0xff0000);
								int i_3418_ = (i_3415_ & 0xff) * anInt9333 & 0xff00;
								is[i_3414_] = (i_3416_ | i_3417_ | i_3418_) >>> 8;
							} else if (i == 3) {
								int i_3419_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]) & 0xff]);
								int i_3420_ = anInt9350;
								int i_3421_ = i_3419_ + i_3420_;
								int i_3422_ = ((i_3419_ & 0xff00ff) + (i_3420_ & 0xff00ff));
								int i_3423_ = ((i_3422_ & 0x1000100) + (i_3421_ - i_3422_ & 0x10000));
								is[i_3414_] = i_3421_ - i_3423_ | i_3423_ - (i_3423_ >>> 8);
							} else if (i == 2) {
								int i_3424_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]) & 0xff]);
								int i_3425_ = ((i_3424_ & 0xff00ff) * anInt9351 & ~0xff00ff);
								int i_3426_ = ((i_3424_ & 0xff00) * anInt9351 & 0xff0000);
								is[i_3414_] = ((i_3425_ | i_3426_) >>> 8) + anInt9323;
							} else
								throw new IllegalArgumentException();
						} else if (i_2851_ == 1) {
							if (i == 1) {
								int i_3427_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								if (i_3427_ != 0)
									is[i_3414_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3427_ & 0xff]);
							} else if (i == 0) {
								int i_3428_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								if (i_3428_ != 0) {
									int i_3429_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3428_ & 0xff]);
									if ((anInt9350 & 0xffffff) == 16777215) {
										int i_3430_ = anInt9350 >>> 24;
										int i_3431_ = 256 - i_3430_;
										int i_3432_ = is[i_3414_];
										is[i_3414_] = ((((i_3429_ & 0xff00ff) * i_3430_ + ((i_3432_ & 0xff00ff) * i_3431_)) & ~0xff00ff) + (((i_3429_ & 0xff00) * i_3430_ + ((i_3432_ & 0xff00) * i_3431_)) & 0xff0000)) >> 8;
									} else if (anInt9351 != 255) {
										int i_3433_ = ((i_3429_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3434_ = ((i_3429_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3435_ = ((i_3429_ & 0xff) * anInt9333 & 0xff00);
										i_3429_ = (i_3433_ | i_3434_ | i_3435_) >>> 8;
										int i_3436_ = is[i_3414_];
										is[i_3414_] = (((((i_3429_ & 0xff00ff) * anInt9351) + ((i_3436_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3429_ & 0xff00) * anInt9351) + ((i_3436_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									} else {
										int i_3437_ = ((i_3429_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3438_ = ((i_3429_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3439_ = ((i_3429_ & 0xff) * anInt9333 & 0xff00);
										is[i_3414_] = (i_3437_ | i_3438_ | i_3439_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3440_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								int i_3441_ = (i_3440_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3440_]) : 0);
								int i_3442_ = anInt9350;
								int i_3443_ = i_3441_ + i_3442_;
								int i_3444_ = ((i_3441_ & 0xff00ff) + (i_3442_ & 0xff00ff));
								int i_3445_ = ((i_3444_ & 0x1000100) + (i_3443_ - i_3444_ & 0x10000));
								i_3445_ = i_3443_ - i_3445_ | i_3445_ - (i_3445_ >>> 8);
								if (i_3441_ == 0 && anInt9351 != 255) {
									i_3441_ = i_3445_;
									i_3445_ = is[i_3414_];
									i_3445_ = ((((i_3441_ & 0xff00ff) * anInt9351 + ((i_3445_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_3441_ & 0xff00) * anInt9351 + ((i_3445_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_3414_] = i_3445_;
							} else if (i == 2) {
								int i_3446_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								if (i_3446_ != 0) {
									int i_3447_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3446_ & 0xff]);
									int i_3448_ = ((i_3447_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3449_ = ((i_3447_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3414_++] = ((i_3448_ | i_3449_) >>> 8) + anInt9323;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_2851_ == 2) {
							if (i == 1) {
								int i_3450_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								if (i_3450_ != 0) {
									int i_3451_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3450_ & 0xff]);
									int i_3452_ = is[i_3414_];
									int i_3453_ = i_3451_ + i_3452_;
									int i_3454_ = ((i_3451_ & 0xff00ff) + (i_3452_ & 0xff00ff));
									i_3452_ = ((i_3454_ & 0x1000100) + (i_3453_ - i_3454_ & 0x10000));
									is[i_3414_] = (i_3453_ - i_3452_ | i_3452_ - (i_3452_ >>> 8));
								}
							} else if (i == 0) {
								int i_3455_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								if (i_3455_ != 0) {
									int i_3456_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3455_ & 0xff]);
									int i_3457_ = ((i_3456_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3458_ = ((i_3456_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3459_ = ((i_3456_ & 0xff) * anInt9333 & 0xff00);
									i_3456_ = (i_3457_ | i_3458_ | i_3459_) >>> 8;
									int i_3460_ = is[i_3414_];
									int i_3461_ = i_3456_ + i_3460_;
									int i_3462_ = ((i_3456_ & 0xff00ff) + (i_3460_ & 0xff00ff));
									i_3460_ = ((i_3462_ & 0x1000100) + (i_3461_ - i_3462_ & 0x10000));
									is[i_3414_] = (i_3461_ - i_3460_ | i_3460_ - (i_3460_ >>> 8));
								}
							} else if (i == 3) {
								byte i_3463_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								int i_3464_ = (i_3463_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3463_]) : 0);
								int i_3465_ = anInt9350;
								int i_3466_ = i_3464_ + i_3465_;
								int i_3467_ = ((i_3464_ & 0xff00ff) + (i_3465_ & 0xff00ff));
								int i_3468_ = ((i_3467_ & 0x1000100) + (i_3466_ - i_3467_ & 0x10000));
								i_3468_ = i_3466_ - i_3468_ | i_3468_ - (i_3468_ >>> 8);
								if (i_3464_ == 0 && anInt9351 != 255) {
									i_3464_ = i_3468_;
									i_3468_ = is[i_3414_];
									i_3468_ = ((((i_3464_ & 0xff00ff) * anInt9351 + ((i_3468_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_3464_ & 0xff00) * anInt9351 + ((i_3468_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_3414_] = i_3468_;
							} else if (i == 2) {
								int i_3469_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3413_]);
								if (i_3469_ != 0) {
									int i_3470_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3469_ & 0xff]);
									int i_3471_ = ((i_3470_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3472_ = ((i_3470_ & 0xff00) * anInt9351 & 0xff0000);
									i_3470_ = (((i_3471_ | i_3472_) >>> 8) + anInt9323);
									int i_3473_ = is[i_3414_];
									int i_3474_ = i_3470_ + i_3473_;
									int i_3475_ = ((i_3470_ & 0xff00ff) + (i_3473_ & 0xff00ff));
									i_3473_ = ((i_3475_ & 0x1000100) + (i_3474_ - i_3475_ & 0x10000));
									is[i_3414_] = (i_3474_ - i_3473_ | i_3473_ - (i_3473_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3408_ += anInt9340;
						i_3409_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method750(int i, int i_3476_) {
		int[] is = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_3477_ = anInt9356;
					while (i_3477_ < 0) {
						int i_3478_ = anInt9339;
						int i_3479_ = anInt9346;
						int i_3480_ = anInt9324;
						int i_3481_ = anInt9347;
						if (i_3479_ >= 0 && i_3480_ >= 0 && i_3479_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0 && i_3480_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							for (/**/; i_3481_ < 0; i_3481_++) {
								int i_3482_ = (((i_3480_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3479_ >> 12));
								int i_3483_ = i_3478_++;
								if (i_3476_ == 0) {
									if (i == 1)
										is[i_3483_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]) & 0xff)]);
									else if (i == 0) {
										int i_3484_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]) & 0xff)]);
										int i_3485_ = ((i_3484_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3486_ = ((i_3484_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3487_ = ((i_3484_ & 0xff) * anInt9333 & 0xff00);
										is[i_3483_] = (i_3485_ | i_3486_ | i_3487_) >>> 8;
									} else if (i == 3) {
										int i_3488_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]) & 0xff)]);
										int i_3489_ = anInt9350;
										int i_3490_ = i_3488_ + i_3489_;
										int i_3491_ = ((i_3488_ & 0xff00ff) + (i_3489_ & 0xff00ff));
										int i_3492_ = ((i_3491_ & 0x1000100) + (i_3490_ - i_3491_ & 0x10000));
										is[i_3483_] = (i_3490_ - i_3492_ | i_3492_ - (i_3492_ >>> 8));
									} else if (i == 2) {
										int i_3493_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]) & 0xff)]);
										int i_3494_ = ((i_3493_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3495_ = ((i_3493_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3483_] = ((i_3494_ | i_3495_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 1) {
									if (i == 1) {
										int i_3496_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										if (i_3496_ != 0)
											is[i_3483_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3496_ & 0xff]);
									} else if (i == 0) {
										int i_3497_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										if (i_3497_ != 0) {
											int i_3498_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3497_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_3499_ = anInt9350 >>> 24;
												int i_3500_ = 256 - i_3499_;
												int i_3501_ = is[i_3483_];
												is[i_3483_] = (((((i_3498_ & 0xff00ff) * i_3499_) + ((i_3501_ & 0xff00ff) * i_3500_)) & ~0xff00ff) + ((((i_3498_ & 0xff00) * i_3499_) + ((i_3501_ & 0xff00) * i_3500_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_3502_ = (((i_3498_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3503_ = (((i_3498_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3504_ = (((i_3498_ & 0xff) * anInt9333) & 0xff00);
												i_3498_ = (i_3502_ | i_3503_ | i_3504_) >>> 8;
												int i_3505_ = is[i_3483_];
												is[i_3483_] = (((((i_3498_ & 0xff00ff) * anInt9351) + ((i_3505_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3498_ & 0xff00) * anInt9351) + ((i_3505_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_3506_ = (((i_3498_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3507_ = (((i_3498_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3508_ = (((i_3498_ & 0xff) * anInt9333) & 0xff00);
												is[i_3483_] = (i_3506_ | i_3507_ | i_3508_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3509_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										int i_3510_ = (i_3509_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3509_]) : 0);
										int i_3511_ = anInt9350;
										int i_3512_ = i_3510_ + i_3511_;
										int i_3513_ = ((i_3510_ & 0xff00ff) + (i_3511_ & 0xff00ff));
										int i_3514_ = ((i_3513_ & 0x1000100) + (i_3512_ - i_3513_ & 0x10000));
										i_3514_ = (i_3512_ - i_3514_ | i_3514_ - (i_3514_ >>> 8));
										if (i_3510_ == 0 && anInt9351 != 255) {
											i_3510_ = i_3514_;
											i_3514_ = is[i_3483_];
											i_3514_ = (((((i_3510_ & 0xff00ff) * anInt9351) + ((i_3514_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3510_ & 0xff00) * anInt9351) + ((i_3514_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3483_] = i_3514_;
									} else if (i == 2) {
										int i_3515_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										if (i_3515_ != 0) {
											int i_3516_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3515_ & 0xff]);
											int i_3517_ = (((i_3516_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3518_ = (((i_3516_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_3483_++] = (((i_3517_ | i_3518_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 2) {
									if (i == 1) {
										int i_3519_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										if (i_3519_ != 0) {
											int i_3520_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3519_ & 0xff]);
											int i_3521_ = is[i_3483_];
											int i_3522_ = i_3520_ + i_3521_;
											int i_3523_ = ((i_3520_ & 0xff00ff) + (i_3521_ & 0xff00ff));
											i_3521_ = ((i_3523_ & 0x1000100) + (i_3522_ - i_3523_ & 0x10000));
											is[i_3483_] = (i_3522_ - i_3521_ | i_3521_ - (i_3521_ >>> 8));
										}
									} else if (i == 0) {
										int i_3524_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										if (i_3524_ != 0) {
											int i_3525_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3524_ & 0xff]);
											int i_3526_ = (((i_3525_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3527_ = (((i_3525_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3528_ = ((i_3525_ & 0xff) * anInt9333 & 0xff00);
											i_3525_ = (i_3526_ | i_3527_ | i_3528_) >>> 8;
											int i_3529_ = is[i_3483_];
											int i_3530_ = i_3525_ + i_3529_;
											int i_3531_ = ((i_3525_ & 0xff00ff) + (i_3529_ & 0xff00ff));
											i_3529_ = ((i_3531_ & 0x1000100) + (i_3530_ - i_3531_ & 0x10000));
											is[i_3483_] = (i_3530_ - i_3529_ | i_3529_ - (i_3529_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3532_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										int i_3533_ = (i_3532_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3532_]) : 0);
										int i_3534_ = anInt9350;
										int i_3535_ = i_3533_ + i_3534_;
										int i_3536_ = ((i_3533_ & 0xff00ff) + (i_3534_ & 0xff00ff));
										int i_3537_ = ((i_3536_ & 0x1000100) + (i_3535_ - i_3536_ & 0x10000));
										i_3537_ = (i_3535_ - i_3537_ | i_3537_ - (i_3537_ >>> 8));
										if (i_3533_ == 0 && anInt9351 != 255) {
											i_3533_ = i_3537_;
											i_3537_ = is[i_3483_];
											i_3537_ = (((((i_3533_ & 0xff00ff) * anInt9351) + ((i_3537_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3533_ & 0xff00) * anInt9351) + ((i_3537_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3483_] = i_3537_;
									} else if (i == 2) {
										int i_3538_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3482_]);
										if (i_3538_ != 0) {
											int i_3539_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3538_ & 0xff]);
											int i_3540_ = (((i_3539_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3541_ = (((i_3539_ & 0xff00) * anInt9351) & 0xff0000);
											i_3539_ = ((i_3540_ | i_3541_) >>> 8) + anInt9323;
											int i_3542_ = is[i_3483_];
											int i_3543_ = i_3539_ + i_3542_;
											int i_3544_ = ((i_3539_ & 0xff00ff) + (i_3542_ & 0xff00ff));
											i_3542_ = ((i_3544_ & 0x1000100) + (i_3543_ - i_3544_ & 0x10000));
											is[i_3483_] = (i_3543_ - i_3542_ | i_3542_ - (i_3542_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
							}
						}
						i_3477_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_3545_ = anInt9356;
					while (i_3545_ < 0) {
						int i_3546_ = anInt9339;
						int i_3547_ = anInt9346;
						int i_3548_ = anInt9324 + anInt9349;
						int i_3549_ = anInt9347;
						if (i_3547_ >= 0 && i_3547_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0) {
							int i_3550_;
							if ((i_3550_ = (i_3548_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
								i_3550_ = (anInt9341 - i_3550_) / anInt9341;
								i_3549_ += i_3550_;
								i_3548_ += anInt9341 * i_3550_;
								i_3546_ += i_3550_;
							}
							if ((i_3550_ = (i_3548_ - anInt9341) / anInt9341) > i_3549_)
								i_3549_ = i_3550_;
							for (/**/; i_3549_ < 0; i_3549_++) {
								int i_3551_ = (((i_3548_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3547_ >> 12));
								int i_3552_ = i_3546_++;
								if (i_3476_ == 0) {
									if (i == 1)
										is[i_3552_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]) & 0xff)]);
									else if (i == 0) {
										int i_3553_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]) & 0xff)]);
										int i_3554_ = ((i_3553_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3555_ = ((i_3553_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3556_ = ((i_3553_ & 0xff) * anInt9333 & 0xff00);
										is[i_3552_] = (i_3554_ | i_3555_ | i_3556_) >>> 8;
									} else if (i == 3) {
										int i_3557_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]) & 0xff)]);
										int i_3558_ = anInt9350;
										int i_3559_ = i_3557_ + i_3558_;
										int i_3560_ = ((i_3557_ & 0xff00ff) + (i_3558_ & 0xff00ff));
										int i_3561_ = ((i_3560_ & 0x1000100) + (i_3559_ - i_3560_ & 0x10000));
										is[i_3552_] = (i_3559_ - i_3561_ | i_3561_ - (i_3561_ >>> 8));
									} else if (i == 2) {
										int i_3562_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]) & 0xff)]);
										int i_3563_ = ((i_3562_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3564_ = ((i_3562_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3552_] = ((i_3563_ | i_3564_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 1) {
									if (i == 1) {
										int i_3565_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										if (i_3565_ != 0)
											is[i_3552_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3565_ & 0xff]);
									} else if (i == 0) {
										int i_3566_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										if (i_3566_ != 0) {
											int i_3567_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3566_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_3568_ = anInt9350 >>> 24;
												int i_3569_ = 256 - i_3568_;
												int i_3570_ = is[i_3552_];
												is[i_3552_] = (((((i_3567_ & 0xff00ff) * i_3568_) + ((i_3570_ & 0xff00ff) * i_3569_)) & ~0xff00ff) + ((((i_3567_ & 0xff00) * i_3568_) + ((i_3570_ & 0xff00) * i_3569_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_3571_ = (((i_3567_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3572_ = (((i_3567_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3573_ = (((i_3567_ & 0xff) * anInt9333) & 0xff00);
												i_3567_ = (i_3571_ | i_3572_ | i_3573_) >>> 8;
												int i_3574_ = is[i_3552_];
												is[i_3552_] = (((((i_3567_ & 0xff00ff) * anInt9351) + ((i_3574_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3567_ & 0xff00) * anInt9351) + ((i_3574_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_3575_ = (((i_3567_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3576_ = (((i_3567_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3577_ = (((i_3567_ & 0xff) * anInt9333) & 0xff00);
												is[i_3552_] = (i_3575_ | i_3576_ | i_3577_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3578_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										int i_3579_ = (i_3578_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3578_]) : 0);
										int i_3580_ = anInt9350;
										int i_3581_ = i_3579_ + i_3580_;
										int i_3582_ = ((i_3579_ & 0xff00ff) + (i_3580_ & 0xff00ff));
										int i_3583_ = ((i_3582_ & 0x1000100) + (i_3581_ - i_3582_ & 0x10000));
										i_3583_ = (i_3581_ - i_3583_ | i_3583_ - (i_3583_ >>> 8));
										if (i_3579_ == 0 && anInt9351 != 255) {
											i_3579_ = i_3583_;
											i_3583_ = is[i_3552_];
											i_3583_ = (((((i_3579_ & 0xff00ff) * anInt9351) + ((i_3583_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3579_ & 0xff00) * anInt9351) + ((i_3583_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3552_] = i_3583_;
									} else if (i == 2) {
										int i_3584_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										if (i_3584_ != 0) {
											int i_3585_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3584_ & 0xff]);
											int i_3586_ = (((i_3585_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3587_ = (((i_3585_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_3552_++] = (((i_3586_ | i_3587_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 2) {
									if (i == 1) {
										int i_3588_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										if (i_3588_ != 0) {
											int i_3589_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3588_ & 0xff]);
											int i_3590_ = is[i_3552_];
											int i_3591_ = i_3589_ + i_3590_;
											int i_3592_ = ((i_3589_ & 0xff00ff) + (i_3590_ & 0xff00ff));
											i_3590_ = ((i_3592_ & 0x1000100) + (i_3591_ - i_3592_ & 0x10000));
											is[i_3552_] = (i_3591_ - i_3590_ | i_3590_ - (i_3590_ >>> 8));
										}
									} else if (i == 0) {
										int i_3593_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										if (i_3593_ != 0) {
											int i_3594_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3593_ & 0xff]);
											int i_3595_ = (((i_3594_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3596_ = (((i_3594_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3597_ = ((i_3594_ & 0xff) * anInt9333 & 0xff00);
											i_3594_ = (i_3595_ | i_3596_ | i_3597_) >>> 8;
											int i_3598_ = is[i_3552_];
											int i_3599_ = i_3594_ + i_3598_;
											int i_3600_ = ((i_3594_ & 0xff00ff) + (i_3598_ & 0xff00ff));
											i_3598_ = ((i_3600_ & 0x1000100) + (i_3599_ - i_3600_ & 0x10000));
											is[i_3552_] = (i_3599_ - i_3598_ | i_3598_ - (i_3598_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3601_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										int i_3602_ = (i_3601_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3601_]) : 0);
										int i_3603_ = anInt9350;
										int i_3604_ = i_3602_ + i_3603_;
										int i_3605_ = ((i_3602_ & 0xff00ff) + (i_3603_ & 0xff00ff));
										int i_3606_ = ((i_3605_ & 0x1000100) + (i_3604_ - i_3605_ & 0x10000));
										i_3606_ = (i_3604_ - i_3606_ | i_3606_ - (i_3606_ >>> 8));
										if (i_3602_ == 0 && anInt9351 != 255) {
											i_3602_ = i_3606_;
											i_3606_ = is[i_3552_];
											i_3606_ = (((((i_3602_ & 0xff00ff) * anInt9351) + ((i_3606_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3602_ & 0xff00) * anInt9351) + ((i_3606_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3552_] = i_3606_;
									} else if (i == 2) {
										int i_3607_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3551_]);
										if (i_3607_ != 0) {
											int i_3608_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3607_ & 0xff]);
											int i_3609_ = (((i_3608_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3610_ = (((i_3608_ & 0xff00) * anInt9351) & 0xff0000);
											i_3608_ = ((i_3609_ | i_3610_) >>> 8) + anInt9323;
											int i_3611_ = is[i_3552_];
											int i_3612_ = i_3608_ + i_3611_;
											int i_3613_ = ((i_3608_ & 0xff00ff) + (i_3611_ & 0xff00ff));
											i_3611_ = ((i_3613_ & 0x1000100) + (i_3612_ - i_3613_ & 0x10000));
											is[i_3552_] = (i_3612_ - i_3611_ | i_3611_ - (i_3611_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3548_ += anInt9341;
							}
						}
						i_3545_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_3614_ = anInt9356;
					while (i_3614_ < 0) {
						int i_3615_ = anInt9339;
						int i_3616_ = anInt9346;
						int i_3617_ = anInt9324 + anInt9349;
						int i_3618_ = anInt9347;
						if (i_3616_ >= 0 && i_3616_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) < 0) {
							if (i_3617_ < 0) {
								int i_3619_ = (anInt9341 - 1 - i_3617_) / anInt9341;
								i_3618_ += i_3619_;
								i_3617_ += anInt9341 * i_3619_;
								i_3615_ += i_3619_;
							}
							int i_3620_;
							if ((i_3620_ = (1 + i_3617_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_3618_)
								i_3618_ = i_3620_;
							for (/**/; i_3618_ < 0; i_3618_++) {
								int i_3621_ = (((i_3617_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3616_ >> 12));
								int i_3622_ = i_3615_++;
								if (i_3476_ == 0) {
									if (i == 1)
										is[i_3622_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]) & 0xff)]);
									else if (i == 0) {
										int i_3623_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]) & 0xff)]);
										int i_3624_ = ((i_3623_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3625_ = ((i_3623_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3626_ = ((i_3623_ & 0xff) * anInt9333 & 0xff00);
										is[i_3622_] = (i_3624_ | i_3625_ | i_3626_) >>> 8;
									} else if (i == 3) {
										int i_3627_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]) & 0xff)]);
										int i_3628_ = anInt9350;
										int i_3629_ = i_3627_ + i_3628_;
										int i_3630_ = ((i_3627_ & 0xff00ff) + (i_3628_ & 0xff00ff));
										int i_3631_ = ((i_3630_ & 0x1000100) + (i_3629_ - i_3630_ & 0x10000));
										is[i_3622_] = (i_3629_ - i_3631_ | i_3631_ - (i_3631_ >>> 8));
									} else if (i == 2) {
										int i_3632_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]) & 0xff)]);
										int i_3633_ = ((i_3632_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3634_ = ((i_3632_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3622_] = ((i_3633_ | i_3634_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 1) {
									if (i == 1) {
										int i_3635_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										if (i_3635_ != 0)
											is[i_3622_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3635_ & 0xff]);
									} else if (i == 0) {
										int i_3636_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										if (i_3636_ != 0) {
											int i_3637_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3636_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_3638_ = anInt9350 >>> 24;
												int i_3639_ = 256 - i_3638_;
												int i_3640_ = is[i_3622_];
												is[i_3622_] = (((((i_3637_ & 0xff00ff) * i_3638_) + ((i_3640_ & 0xff00ff) * i_3639_)) & ~0xff00ff) + ((((i_3637_ & 0xff00) * i_3638_) + ((i_3640_ & 0xff00) * i_3639_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_3641_ = (((i_3637_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3642_ = (((i_3637_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3643_ = (((i_3637_ & 0xff) * anInt9333) & 0xff00);
												i_3637_ = (i_3641_ | i_3642_ | i_3643_) >>> 8;
												int i_3644_ = is[i_3622_];
												is[i_3622_] = (((((i_3637_ & 0xff00ff) * anInt9351) + ((i_3644_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3637_ & 0xff00) * anInt9351) + ((i_3644_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_3645_ = (((i_3637_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3646_ = (((i_3637_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3647_ = (((i_3637_ & 0xff) * anInt9333) & 0xff00);
												is[i_3622_] = (i_3645_ | i_3646_ | i_3647_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3648_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										int i_3649_ = (i_3648_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3648_]) : 0);
										int i_3650_ = anInt9350;
										int i_3651_ = i_3649_ + i_3650_;
										int i_3652_ = ((i_3649_ & 0xff00ff) + (i_3650_ & 0xff00ff));
										int i_3653_ = ((i_3652_ & 0x1000100) + (i_3651_ - i_3652_ & 0x10000));
										i_3653_ = (i_3651_ - i_3653_ | i_3653_ - (i_3653_ >>> 8));
										if (i_3649_ == 0 && anInt9351 != 255) {
											i_3649_ = i_3653_;
											i_3653_ = is[i_3622_];
											i_3653_ = (((((i_3649_ & 0xff00ff) * anInt9351) + ((i_3653_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3649_ & 0xff00) * anInt9351) + ((i_3653_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3622_] = i_3653_;
									} else if (i == 2) {
										int i_3654_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										if (i_3654_ != 0) {
											int i_3655_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3654_ & 0xff]);
											int i_3656_ = (((i_3655_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3657_ = (((i_3655_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_3622_++] = (((i_3656_ | i_3657_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 2) {
									if (i == 1) {
										int i_3658_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										if (i_3658_ != 0) {
											int i_3659_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3658_ & 0xff]);
											int i_3660_ = is[i_3622_];
											int i_3661_ = i_3659_ + i_3660_;
											int i_3662_ = ((i_3659_ & 0xff00ff) + (i_3660_ & 0xff00ff));
											i_3660_ = ((i_3662_ & 0x1000100) + (i_3661_ - i_3662_ & 0x10000));
											is[i_3622_] = (i_3661_ - i_3660_ | i_3660_ - (i_3660_ >>> 8));
										}
									} else if (i == 0) {
										int i_3663_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										if (i_3663_ != 0) {
											int i_3664_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3663_ & 0xff]);
											int i_3665_ = (((i_3664_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3666_ = (((i_3664_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3667_ = ((i_3664_ & 0xff) * anInt9333 & 0xff00);
											i_3664_ = (i_3665_ | i_3666_ | i_3667_) >>> 8;
											int i_3668_ = is[i_3622_];
											int i_3669_ = i_3664_ + i_3668_;
											int i_3670_ = ((i_3664_ & 0xff00ff) + (i_3668_ & 0xff00ff));
											i_3668_ = ((i_3670_ & 0x1000100) + (i_3669_ - i_3670_ & 0x10000));
											is[i_3622_] = (i_3669_ - i_3668_ | i_3668_ - (i_3668_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3671_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										int i_3672_ = (i_3671_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3671_]) : 0);
										int i_3673_ = anInt9350;
										int i_3674_ = i_3672_ + i_3673_;
										int i_3675_ = ((i_3672_ & 0xff00ff) + (i_3673_ & 0xff00ff));
										int i_3676_ = ((i_3675_ & 0x1000100) + (i_3674_ - i_3675_ & 0x10000));
										i_3676_ = (i_3674_ - i_3676_ | i_3676_ - (i_3676_ >>> 8));
										if (i_3672_ == 0 && anInt9351 != 255) {
											i_3672_ = i_3676_;
											i_3676_ = is[i_3622_];
											i_3676_ = (((((i_3672_ & 0xff00ff) * anInt9351) + ((i_3676_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3672_ & 0xff00) * anInt9351) + ((i_3676_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3622_] = i_3676_;
									} else if (i == 2) {
										int i_3677_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3621_]);
										if (i_3677_ != 0) {
											int i_3678_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3677_ & 0xff]);
											int i_3679_ = (((i_3678_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3680_ = (((i_3678_ & 0xff00) * anInt9351) & 0xff0000);
											i_3678_ = ((i_3679_ | i_3680_) >>> 8) + anInt9323;
											int i_3681_ = is[i_3622_];
											int i_3682_ = i_3678_ + i_3681_;
											int i_3683_ = ((i_3678_ & 0xff00ff) + (i_3681_ & 0xff00ff));
											i_3681_ = ((i_3683_ & 0x1000100) + (i_3682_ - i_3683_ & 0x10000));
											is[i_3622_] = (i_3682_ - i_3681_ | i_3681_ - (i_3681_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3617_ += anInt9341;
							}
						}
						i_3614_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_3684_ = anInt9356;
					while (i_3684_ < 0) {
						int i_3685_ = anInt9339;
						int i_3686_ = anInt9346 + anInt9348;
						int i_3687_ = anInt9324;
						int i_3688_ = anInt9347;
						if (i_3687_ >= 0 && i_3687_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							int i_3689_;
							if ((i_3689_ = (i_3686_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_3689_ = (anInt9340 - i_3689_) / anInt9340;
								i_3688_ += i_3689_;
								i_3686_ += anInt9340 * i_3689_;
								i_3685_ += i_3689_;
							}
							if ((i_3689_ = (i_3686_ - anInt9340) / anInt9340) > i_3688_)
								i_3688_ = i_3689_;
							for (/**/; i_3688_ < 0; i_3688_++) {
								int i_3690_ = (((i_3687_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3686_ >> 12));
								int i_3691_ = i_3685_++;
								if (i_3476_ == 0) {
									if (i == 1)
										is[i_3691_] = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]) & 0xff)]);
									else if (i == 0) {
										int i_3692_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]) & 0xff)]);
										int i_3693_ = ((i_3692_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3694_ = ((i_3692_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3695_ = ((i_3692_ & 0xff) * anInt9333 & 0xff00);
										is[i_3691_] = (i_3693_ | i_3694_ | i_3695_) >>> 8;
									} else if (i == 3) {
										int i_3696_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]) & 0xff)]);
										int i_3697_ = anInt9350;
										int i_3698_ = i_3696_ + i_3697_;
										int i_3699_ = ((i_3696_ & 0xff00ff) + (i_3697_ & 0xff00ff));
										int i_3700_ = ((i_3699_ & 0x1000100) + (i_3698_ - i_3699_ & 0x10000));
										is[i_3691_] = (i_3698_ - i_3700_ | i_3700_ - (i_3700_ >>> 8));
									} else if (i == 2) {
										int i_3701_ = (((Class61_Sub3_Sub3) this).anIntArray10096[((((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]) & 0xff)]);
										int i_3702_ = ((i_3701_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3703_ = ((i_3701_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3691_] = ((i_3702_ | i_3703_) >>> 8) + anInt9323;
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 1) {
									if (i == 1) {
										int i_3704_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										if (i_3704_ != 0)
											is[i_3691_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3704_ & 0xff]);
									} else if (i == 0) {
										int i_3705_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										if (i_3705_ != 0) {
											int i_3706_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3705_ & 0xff]);
											if ((anInt9350 & 0xffffff) == 16777215) {
												int i_3707_ = anInt9350 >>> 24;
												int i_3708_ = 256 - i_3707_;
												int i_3709_ = is[i_3691_];
												is[i_3691_] = (((((i_3706_ & 0xff00ff) * i_3707_) + ((i_3709_ & 0xff00ff) * i_3708_)) & ~0xff00ff) + ((((i_3706_ & 0xff00) * i_3707_) + ((i_3709_ & 0xff00) * i_3708_)) & 0xff0000)) >> 8;
											} else if (anInt9351 != 255) {
												int i_3710_ = (((i_3706_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3711_ = (((i_3706_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3712_ = (((i_3706_ & 0xff) * anInt9333) & 0xff00);
												i_3706_ = (i_3710_ | i_3711_ | i_3712_) >>> 8;
												int i_3713_ = is[i_3691_];
												is[i_3691_] = (((((i_3706_ & 0xff00ff) * anInt9351) + ((i_3713_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3706_ & 0xff00) * anInt9351) + ((i_3713_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
											} else {
												int i_3714_ = (((i_3706_ & 0xff0000) * anInt9353) & ~0xffffff);
												int i_3715_ = (((i_3706_ & 0xff00) * anInt9354) & 0xff0000);
												int i_3716_ = (((i_3706_ & 0xff) * anInt9333) & 0xff00);
												is[i_3691_] = (i_3714_ | i_3715_ | i_3716_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_3717_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										int i_3718_ = (i_3717_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3717_]) : 0);
										int i_3719_ = anInt9350;
										int i_3720_ = i_3718_ + i_3719_;
										int i_3721_ = ((i_3718_ & 0xff00ff) + (i_3719_ & 0xff00ff));
										int i_3722_ = ((i_3721_ & 0x1000100) + (i_3720_ - i_3721_ & 0x10000));
										i_3722_ = (i_3720_ - i_3722_ | i_3722_ - (i_3722_ >>> 8));
										if (i_3718_ == 0 && anInt9351 != 255) {
											i_3718_ = i_3722_;
											i_3722_ = is[i_3691_];
											i_3722_ = (((((i_3718_ & 0xff00ff) * anInt9351) + ((i_3722_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3718_ & 0xff00) * anInt9351) + ((i_3722_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3691_] = i_3722_;
									} else if (i == 2) {
										int i_3723_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										if (i_3723_ != 0) {
											int i_3724_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3723_ & 0xff]);
											int i_3725_ = (((i_3724_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3726_ = (((i_3724_ & 0xff00) * anInt9351) & 0xff0000);
											is[i_3691_++] = (((i_3725_ | i_3726_) >>> 8) + anInt9323);
										}
									} else
										throw new IllegalArgumentException();
								} else if (i_3476_ == 2) {
									if (i == 1) {
										int i_3727_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										if (i_3727_ != 0) {
											int i_3728_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3727_ & 0xff]);
											int i_3729_ = is[i_3691_];
											int i_3730_ = i_3728_ + i_3729_;
											int i_3731_ = ((i_3728_ & 0xff00ff) + (i_3729_ & 0xff00ff));
											i_3729_ = ((i_3731_ & 0x1000100) + (i_3730_ - i_3731_ & 0x10000));
											is[i_3691_] = (i_3730_ - i_3729_ | i_3729_ - (i_3729_ >>> 8));
										}
									} else if (i == 0) {
										int i_3732_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										if (i_3732_ != 0) {
											int i_3733_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3732_ & 0xff]);
											int i_3734_ = (((i_3733_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3735_ = (((i_3733_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3736_ = ((i_3733_ & 0xff) * anInt9333 & 0xff00);
											i_3733_ = (i_3734_ | i_3735_ | i_3736_) >>> 8;
											int i_3737_ = is[i_3691_];
											int i_3738_ = i_3733_ + i_3737_;
											int i_3739_ = ((i_3733_ & 0xff00ff) + (i_3737_ & 0xff00ff));
											i_3737_ = ((i_3739_ & 0x1000100) + (i_3738_ - i_3739_ & 0x10000));
											is[i_3691_] = (i_3738_ - i_3737_ | i_3737_ - (i_3737_ >>> 8));
										}
									} else if (i == 3) {
										byte i_3740_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										int i_3741_ = (i_3740_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3740_]) : 0);
										int i_3742_ = anInt9350;
										int i_3743_ = i_3741_ + i_3742_;
										int i_3744_ = ((i_3741_ & 0xff00ff) + (i_3742_ & 0xff00ff));
										int i_3745_ = ((i_3744_ & 0x1000100) + (i_3743_ - i_3744_ & 0x10000));
										i_3745_ = (i_3743_ - i_3745_ | i_3745_ - (i_3745_ >>> 8));
										if (i_3741_ == 0 && anInt9351 != 255) {
											i_3741_ = i_3745_;
											i_3745_ = is[i_3691_];
											i_3745_ = (((((i_3741_ & 0xff00ff) * anInt9351) + ((i_3745_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3741_ & 0xff00) * anInt9351) + ((i_3745_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										}
										is[i_3691_] = i_3745_;
									} else if (i == 2) {
										int i_3746_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3690_]);
										if (i_3746_ != 0) {
											int i_3747_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3746_ & 0xff]);
											int i_3748_ = (((i_3747_ & 0xff00ff) * anInt9351) & ~0xff00ff);
											int i_3749_ = (((i_3747_ & 0xff00) * anInt9351) & 0xff0000);
											i_3747_ = ((i_3748_ | i_3749_) >>> 8) + anInt9323;
											int i_3750_ = is[i_3691_];
											int i_3751_ = i_3747_ + i_3750_;
											int i_3752_ = ((i_3747_ & 0xff00ff) + (i_3750_ & 0xff00ff));
											i_3750_ = ((i_3752_ & 0x1000100) + (i_3751_ - i_3752_ & 0x10000));
											is[i_3691_] = (i_3751_ - i_3750_ | i_3750_ - (i_3750_ >>> 8));
										}
									}
								} else
									throw new IllegalArgumentException();
								i_3686_ += anInt9340;
							}
						}
						i_3684_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_3753_ = anInt9356;
					while (i_3753_ < 0) {
						int i_3754_ = anInt9339;
						int i_3755_ = anInt9346 + anInt9348;
						int i_3756_ = anInt9324 + anInt9349;
						int i_3757_ = anInt9347;
						int i_3758_;
						if ((i_3758_ = i_3755_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) >= 0) {
							i_3758_ = (anInt9340 - i_3758_) / anInt9340;
							i_3757_ += i_3758_;
							i_3755_ += anInt9340 * i_3758_;
							i_3756_ += anInt9341 * i_3758_;
							i_3754_ += i_3758_;
						}
						if ((i_3758_ = (i_3755_ - anInt9340) / anInt9340) > i_3757_)
							i_3757_ = i_3758_;
						if ((i_3758_ = i_3756_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_3758_ = (anInt9341 - i_3758_) / anInt9341;
							i_3757_ += i_3758_;
							i_3755_ += anInt9340 * i_3758_;
							i_3756_ += anInt9341 * i_3758_;
							i_3754_ += i_3758_;
						}
						if ((i_3758_ = (i_3756_ - anInt9341) / anInt9341) > i_3757_)
							i_3757_ = i_3758_;
						for (/**/; i_3757_ < 0; i_3757_++) {
							int i_3759_ = (((i_3756_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3755_ >> 12));
							int i_3760_ = i_3754_++;
							if (i_3476_ == 0) {
								if (i == 1)
									is[i_3760_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]) & 0xff]);
								else if (i == 0) {
									int i_3761_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]) & 0xff]);
									int i_3762_ = ((i_3761_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3763_ = ((i_3761_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3764_ = ((i_3761_ & 0xff) * anInt9333 & 0xff00);
									is[i_3760_] = (i_3762_ | i_3763_ | i_3764_) >>> 8;
								} else if (i == 3) {
									int i_3765_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]) & 0xff]);
									int i_3766_ = anInt9350;
									int i_3767_ = i_3765_ + i_3766_;
									int i_3768_ = ((i_3765_ & 0xff00ff) + (i_3766_ & 0xff00ff));
									int i_3769_ = ((i_3768_ & 0x1000100) + (i_3767_ - i_3768_ & 0x10000));
									is[i_3760_] = (i_3767_ - i_3769_ | i_3769_ - (i_3769_ >>> 8));
								} else if (i == 2) {
									int i_3770_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]) & 0xff]);
									int i_3771_ = ((i_3770_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3772_ = ((i_3770_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3760_] = (((i_3771_ | i_3772_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_3476_ == 1) {
								if (i == 1) {
									int i_3773_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									if (i_3773_ != 0)
										is[i_3760_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3773_ & 0xff]);
								} else if (i == 0) {
									int i_3774_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									if (i_3774_ != 0) {
										int i_3775_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3774_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_3776_ = anInt9350 >>> 24;
											int i_3777_ = 256 - i_3776_;
											int i_3778_ = is[i_3760_];
											is[i_3760_] = (((((i_3775_ & 0xff00ff) * i_3776_) + ((i_3778_ & 0xff00ff) * i_3777_)) & ~0xff00ff) + ((((i_3775_ & 0xff00) * i_3776_) + ((i_3778_ & 0xff00) * i_3777_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_3779_ = (((i_3775_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3780_ = (((i_3775_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3781_ = ((i_3775_ & 0xff) * anInt9333 & 0xff00);
											i_3775_ = (i_3779_ | i_3780_ | i_3781_) >>> 8;
											int i_3782_ = is[i_3760_];
											is[i_3760_] = (((((i_3775_ & 0xff00ff) * anInt9351) + ((i_3782_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3775_ & 0xff00) * anInt9351) + ((i_3782_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_3783_ = (((i_3775_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3784_ = (((i_3775_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3785_ = ((i_3775_ & 0xff) * anInt9333 & 0xff00);
											is[i_3760_] = (i_3783_ | i_3784_ | i_3785_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3786_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									int i_3787_ = (i_3786_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3786_]) : 0);
									int i_3788_ = anInt9350;
									int i_3789_ = i_3787_ + i_3788_;
									int i_3790_ = ((i_3787_ & 0xff00ff) + (i_3788_ & 0xff00ff));
									int i_3791_ = ((i_3790_ & 0x1000100) + (i_3789_ - i_3790_ & 0x10000));
									i_3791_ = (i_3789_ - i_3791_ | i_3791_ - (i_3791_ >>> 8));
									if (i_3787_ == 0 && anInt9351 != 255) {
										i_3787_ = i_3791_;
										i_3791_ = is[i_3760_];
										i_3791_ = (((((i_3787_ & 0xff00ff) * anInt9351) + ((i_3791_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3787_ & 0xff00) * anInt9351) + ((i_3791_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3760_] = i_3791_;
								} else if (i == 2) {
									int i_3792_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									if (i_3792_ != 0) {
										int i_3793_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3792_ & 0xff]);
										int i_3794_ = ((i_3793_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3795_ = ((i_3793_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3760_++] = ((i_3794_ | i_3795_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3476_ == 2) {
								if (i == 1) {
									int i_3796_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									if (i_3796_ != 0) {
										int i_3797_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3796_ & 0xff]);
										int i_3798_ = is[i_3760_];
										int i_3799_ = i_3797_ + i_3798_;
										int i_3800_ = ((i_3797_ & 0xff00ff) + (i_3798_ & 0xff00ff));
										i_3798_ = ((i_3800_ & 0x1000100) + (i_3799_ - i_3800_ & 0x10000));
										is[i_3760_] = (i_3799_ - i_3798_ | i_3798_ - (i_3798_ >>> 8));
									}
								} else if (i == 0) {
									int i_3801_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									if (i_3801_ != 0) {
										int i_3802_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3801_ & 0xff]);
										int i_3803_ = ((i_3802_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3804_ = ((i_3802_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3805_ = ((i_3802_ & 0xff) * anInt9333 & 0xff00);
										i_3802_ = (i_3803_ | i_3804_ | i_3805_) >>> 8;
										int i_3806_ = is[i_3760_];
										int i_3807_ = i_3802_ + i_3806_;
										int i_3808_ = ((i_3802_ & 0xff00ff) + (i_3806_ & 0xff00ff));
										i_3806_ = ((i_3808_ & 0x1000100) + (i_3807_ - i_3808_ & 0x10000));
										is[i_3760_] = (i_3807_ - i_3806_ | i_3806_ - (i_3806_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3809_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									int i_3810_ = (i_3809_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3809_]) : 0);
									int i_3811_ = anInt9350;
									int i_3812_ = i_3810_ + i_3811_;
									int i_3813_ = ((i_3810_ & 0xff00ff) + (i_3811_ & 0xff00ff));
									int i_3814_ = ((i_3813_ & 0x1000100) + (i_3812_ - i_3813_ & 0x10000));
									i_3814_ = (i_3812_ - i_3814_ | i_3814_ - (i_3814_ >>> 8));
									if (i_3810_ == 0 && anInt9351 != 255) {
										i_3810_ = i_3814_;
										i_3814_ = is[i_3760_];
										i_3814_ = (((((i_3810_ & 0xff00ff) * anInt9351) + ((i_3814_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3810_ & 0xff00) * anInt9351) + ((i_3814_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3760_] = i_3814_;
								} else if (i == 2) {
									int i_3815_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3759_]);
									if (i_3815_ != 0) {
										int i_3816_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3815_ & 0xff]);
										int i_3817_ = ((i_3816_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3818_ = ((i_3816_ & 0xff00) * anInt9351 & 0xff0000);
										i_3816_ = (((i_3817_ | i_3818_) >>> 8) + anInt9323);
										int i_3819_ = is[i_3760_];
										int i_3820_ = i_3816_ + i_3819_;
										int i_3821_ = ((i_3816_ & 0xff00ff) + (i_3819_ & 0xff00ff));
										i_3819_ = ((i_3821_ & 0x1000100) + (i_3820_ - i_3821_ & 0x10000));
										is[i_3760_] = (i_3820_ - i_3819_ | i_3819_ - (i_3819_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3755_ += anInt9340;
							i_3756_ += anInt9341;
						}
						i_3753_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_3822_ = anInt9356;
					while (i_3822_ < 0) {
						int i_3823_ = anInt9339;
						int i_3824_ = anInt9346 + anInt9348;
						int i_3825_ = anInt9324 + anInt9349;
						int i_3826_ = anInt9347;
						int i_3827_;
						if ((i_3827_ = i_3824_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) >= 0) {
							i_3827_ = (anInt9340 - i_3827_) / anInt9340;
							i_3826_ += i_3827_;
							i_3824_ += anInt9340 * i_3827_;
							i_3825_ += anInt9341 * i_3827_;
							i_3823_ += i_3827_;
						}
						if ((i_3827_ = (i_3824_ - anInt9340) / anInt9340) > i_3826_)
							i_3826_ = i_3827_;
						if (i_3825_ < 0) {
							i_3827_ = (anInt9341 - 1 - i_3825_) / anInt9341;
							i_3826_ += i_3827_;
							i_3824_ += anInt9340 * i_3827_;
							i_3825_ += anInt9341 * i_3827_;
							i_3823_ += i_3827_;
						}
						if ((i_3827_ = (1 + i_3825_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_3826_)
							i_3826_ = i_3827_;
						for (/**/; i_3826_ < 0; i_3826_++) {
							int i_3828_ = (((i_3825_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3824_ >> 12));
							int i_3829_ = i_3823_++;
							if (i_3476_ == 0) {
								if (i == 1)
									is[i_3829_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]) & 0xff]);
								else if (i == 0) {
									int i_3830_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]) & 0xff]);
									int i_3831_ = ((i_3830_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3832_ = ((i_3830_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3833_ = ((i_3830_ & 0xff) * anInt9333 & 0xff00);
									is[i_3829_] = (i_3831_ | i_3832_ | i_3833_) >>> 8;
								} else if (i == 3) {
									int i_3834_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]) & 0xff]);
									int i_3835_ = anInt9350;
									int i_3836_ = i_3834_ + i_3835_;
									int i_3837_ = ((i_3834_ & 0xff00ff) + (i_3835_ & 0xff00ff));
									int i_3838_ = ((i_3837_ & 0x1000100) + (i_3836_ - i_3837_ & 0x10000));
									is[i_3829_] = (i_3836_ - i_3838_ | i_3838_ - (i_3838_ >>> 8));
								} else if (i == 2) {
									int i_3839_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]) & 0xff]);
									int i_3840_ = ((i_3839_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3841_ = ((i_3839_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3829_] = (((i_3840_ | i_3841_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_3476_ == 1) {
								if (i == 1) {
									int i_3842_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									if (i_3842_ != 0)
										is[i_3829_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3842_ & 0xff]);
								} else if (i == 0) {
									int i_3843_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									if (i_3843_ != 0) {
										int i_3844_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3843_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_3845_ = anInt9350 >>> 24;
											int i_3846_ = 256 - i_3845_;
											int i_3847_ = is[i_3829_];
											is[i_3829_] = (((((i_3844_ & 0xff00ff) * i_3845_) + ((i_3847_ & 0xff00ff) * i_3846_)) & ~0xff00ff) + ((((i_3844_ & 0xff00) * i_3845_) + ((i_3847_ & 0xff00) * i_3846_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_3848_ = (((i_3844_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3849_ = (((i_3844_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3850_ = ((i_3844_ & 0xff) * anInt9333 & 0xff00);
											i_3844_ = (i_3848_ | i_3849_ | i_3850_) >>> 8;
											int i_3851_ = is[i_3829_];
											is[i_3829_] = (((((i_3844_ & 0xff00ff) * anInt9351) + ((i_3851_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3844_ & 0xff00) * anInt9351) + ((i_3851_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_3852_ = (((i_3844_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3853_ = (((i_3844_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3854_ = ((i_3844_ & 0xff) * anInt9333 & 0xff00);
											is[i_3829_] = (i_3852_ | i_3853_ | i_3854_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3855_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									int i_3856_ = (i_3855_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3855_]) : 0);
									int i_3857_ = anInt9350;
									int i_3858_ = i_3856_ + i_3857_;
									int i_3859_ = ((i_3856_ & 0xff00ff) + (i_3857_ & 0xff00ff));
									int i_3860_ = ((i_3859_ & 0x1000100) + (i_3858_ - i_3859_ & 0x10000));
									i_3860_ = (i_3858_ - i_3860_ | i_3860_ - (i_3860_ >>> 8));
									if (i_3856_ == 0 && anInt9351 != 255) {
										i_3856_ = i_3860_;
										i_3860_ = is[i_3829_];
										i_3860_ = (((((i_3856_ & 0xff00ff) * anInt9351) + ((i_3860_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3856_ & 0xff00) * anInt9351) + ((i_3860_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3829_] = i_3860_;
								} else if (i == 2) {
									int i_3861_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									if (i_3861_ != 0) {
										int i_3862_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3861_ & 0xff]);
										int i_3863_ = ((i_3862_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3864_ = ((i_3862_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3829_++] = ((i_3863_ | i_3864_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3476_ == 2) {
								if (i == 1) {
									int i_3865_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									if (i_3865_ != 0) {
										int i_3866_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3865_ & 0xff]);
										int i_3867_ = is[i_3829_];
										int i_3868_ = i_3866_ + i_3867_;
										int i_3869_ = ((i_3866_ & 0xff00ff) + (i_3867_ & 0xff00ff));
										i_3867_ = ((i_3869_ & 0x1000100) + (i_3868_ - i_3869_ & 0x10000));
										is[i_3829_] = (i_3868_ - i_3867_ | i_3867_ - (i_3867_ >>> 8));
									}
								} else if (i == 0) {
									int i_3870_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									if (i_3870_ != 0) {
										int i_3871_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3870_ & 0xff]);
										int i_3872_ = ((i_3871_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3873_ = ((i_3871_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3874_ = ((i_3871_ & 0xff) * anInt9333 & 0xff00);
										i_3871_ = (i_3872_ | i_3873_ | i_3874_) >>> 8;
										int i_3875_ = is[i_3829_];
										int i_3876_ = i_3871_ + i_3875_;
										int i_3877_ = ((i_3871_ & 0xff00ff) + (i_3875_ & 0xff00ff));
										i_3875_ = ((i_3877_ & 0x1000100) + (i_3876_ - i_3877_ & 0x10000));
										is[i_3829_] = (i_3876_ - i_3875_ | i_3875_ - (i_3875_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3878_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									int i_3879_ = (i_3878_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3878_]) : 0);
									int i_3880_ = anInt9350;
									int i_3881_ = i_3879_ + i_3880_;
									int i_3882_ = ((i_3879_ & 0xff00ff) + (i_3880_ & 0xff00ff));
									int i_3883_ = ((i_3882_ & 0x1000100) + (i_3881_ - i_3882_ & 0x10000));
									i_3883_ = (i_3881_ - i_3883_ | i_3883_ - (i_3883_ >>> 8));
									if (i_3879_ == 0 && anInt9351 != 255) {
										i_3879_ = i_3883_;
										i_3883_ = is[i_3829_];
										i_3883_ = (((((i_3879_ & 0xff00ff) * anInt9351) + ((i_3883_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3879_ & 0xff00) * anInt9351) + ((i_3883_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3829_] = i_3883_;
								} else if (i == 2) {
									int i_3884_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3828_]);
									if (i_3884_ != 0) {
										int i_3885_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3884_ & 0xff]);
										int i_3886_ = ((i_3885_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3887_ = ((i_3885_ & 0xff00) * anInt9351 & 0xff0000);
										i_3885_ = (((i_3886_ | i_3887_) >>> 8) + anInt9323);
										int i_3888_ = is[i_3829_];
										int i_3889_ = i_3885_ + i_3888_;
										int i_3890_ = ((i_3885_ & 0xff00ff) + (i_3888_ & 0xff00ff));
										i_3888_ = ((i_3890_ & 0x1000100) + (i_3889_ - i_3890_ & 0x10000));
										is[i_3829_] = (i_3889_ - i_3888_ | i_3888_ - (i_3888_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3824_ += anInt9340;
							i_3825_ += anInt9341;
						}
						i_3822_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_3891_ = anInt9356;
				while (i_3891_ < 0) {
					int i_3892_ = anInt9339;
					int i_3893_ = anInt9346 + anInt9348;
					int i_3894_ = anInt9324;
					int i_3895_ = anInt9347;
					if (i_3894_ >= 0 && i_3894_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
						if (i_3893_ < 0) {
							int i_3896_ = (anInt9340 - 1 - i_3893_) / anInt9340;
							i_3895_ += i_3896_;
							i_3893_ += anInt9340 * i_3896_;
							i_3892_ += i_3896_;
						}
						int i_3897_;
						if ((i_3897_ = (1 + i_3893_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_3895_)
							i_3895_ = i_3897_;
						for (/**/; i_3895_ < 0; i_3895_++) {
							int i_3898_ = (((i_3894_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3893_ >> 12));
							int i_3899_ = i_3892_++;
							if (i_3476_ == 0) {
								if (i == 1)
									is[i_3899_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]) & 0xff]);
								else if (i == 0) {
									int i_3900_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]) & 0xff]);
									int i_3901_ = ((i_3900_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_3902_ = ((i_3900_ & 0xff00) * anInt9354 & 0xff0000);
									int i_3903_ = ((i_3900_ & 0xff) * anInt9333 & 0xff00);
									is[i_3899_] = (i_3901_ | i_3902_ | i_3903_) >>> 8;
								} else if (i == 3) {
									int i_3904_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]) & 0xff]);
									int i_3905_ = anInt9350;
									int i_3906_ = i_3904_ + i_3905_;
									int i_3907_ = ((i_3904_ & 0xff00ff) + (i_3905_ & 0xff00ff));
									int i_3908_ = ((i_3907_ & 0x1000100) + (i_3906_ - i_3907_ & 0x10000));
									is[i_3899_] = (i_3906_ - i_3908_ | i_3908_ - (i_3908_ >>> 8));
								} else if (i == 2) {
									int i_3909_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]) & 0xff]);
									int i_3910_ = ((i_3909_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_3911_ = ((i_3909_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3899_] = (((i_3910_ | i_3911_) >>> 8) + anInt9323);
								} else
									throw new IllegalArgumentException();
							} else if (i_3476_ == 1) {
								if (i == 1) {
									int i_3912_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									if (i_3912_ != 0)
										is[i_3899_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3912_ & 0xff]);
								} else if (i == 0) {
									int i_3913_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									if (i_3913_ != 0) {
										int i_3914_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3913_ & 0xff]);
										if ((anInt9350 & 0xffffff) == 16777215) {
											int i_3915_ = anInt9350 >>> 24;
											int i_3916_ = 256 - i_3915_;
											int i_3917_ = is[i_3899_];
											is[i_3899_] = (((((i_3914_ & 0xff00ff) * i_3915_) + ((i_3917_ & 0xff00ff) * i_3916_)) & ~0xff00ff) + ((((i_3914_ & 0xff00) * i_3915_) + ((i_3917_ & 0xff00) * i_3916_)) & 0xff0000)) >> 8;
										} else if (anInt9351 != 255) {
											int i_3918_ = (((i_3914_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3919_ = (((i_3914_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3920_ = ((i_3914_ & 0xff) * anInt9333 & 0xff00);
											i_3914_ = (i_3918_ | i_3919_ | i_3920_) >>> 8;
											int i_3921_ = is[i_3899_];
											is[i_3899_] = (((((i_3914_ & 0xff00ff) * anInt9351) + ((i_3921_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3914_ & 0xff00) * anInt9351) + ((i_3921_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
										} else {
											int i_3922_ = (((i_3914_ & 0xff0000) * anInt9353) & ~0xffffff);
											int i_3923_ = (((i_3914_ & 0xff00) * anInt9354) & 0xff0000);
											int i_3924_ = ((i_3914_ & 0xff) * anInt9333 & 0xff00);
											is[i_3899_] = (i_3922_ | i_3923_ | i_3924_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_3925_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									int i_3926_ = (i_3925_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3925_]) : 0);
									int i_3927_ = anInt9350;
									int i_3928_ = i_3926_ + i_3927_;
									int i_3929_ = ((i_3926_ & 0xff00ff) + (i_3927_ & 0xff00ff));
									int i_3930_ = ((i_3929_ & 0x1000100) + (i_3928_ - i_3929_ & 0x10000));
									i_3930_ = (i_3928_ - i_3930_ | i_3930_ - (i_3930_ >>> 8));
									if (i_3926_ == 0 && anInt9351 != 255) {
										i_3926_ = i_3930_;
										i_3930_ = is[i_3899_];
										i_3930_ = (((((i_3926_ & 0xff00ff) * anInt9351) + ((i_3930_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3926_ & 0xff00) * anInt9351) + ((i_3930_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3899_] = i_3930_;
								} else if (i == 2) {
									int i_3931_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									if (i_3931_ != 0) {
										int i_3932_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3931_ & 0xff]);
										int i_3933_ = ((i_3932_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3934_ = ((i_3932_ & 0xff00) * anInt9351 & 0xff0000);
										is[i_3899_++] = ((i_3933_ | i_3934_) >>> 8) + anInt9323;
									}
								} else
									throw new IllegalArgumentException();
							} else if (i_3476_ == 2) {
								if (i == 1) {
									int i_3935_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									if (i_3935_ != 0) {
										int i_3936_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3935_ & 0xff]);
										int i_3937_ = is[i_3899_];
										int i_3938_ = i_3936_ + i_3937_;
										int i_3939_ = ((i_3936_ & 0xff00ff) + (i_3937_ & 0xff00ff));
										i_3937_ = ((i_3939_ & 0x1000100) + (i_3938_ - i_3939_ & 0x10000));
										is[i_3899_] = (i_3938_ - i_3937_ | i_3937_ - (i_3937_ >>> 8));
									}
								} else if (i == 0) {
									int i_3940_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									if (i_3940_ != 0) {
										int i_3941_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3940_ & 0xff]);
										int i_3942_ = ((i_3941_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3943_ = ((i_3941_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3944_ = ((i_3941_ & 0xff) * anInt9333 & 0xff00);
										i_3941_ = (i_3942_ | i_3943_ | i_3944_) >>> 8;
										int i_3945_ = is[i_3899_];
										int i_3946_ = i_3941_ + i_3945_;
										int i_3947_ = ((i_3941_ & 0xff00ff) + (i_3945_ & 0xff00ff));
										i_3945_ = ((i_3947_ & 0x1000100) + (i_3946_ - i_3947_ & 0x10000));
										is[i_3899_] = (i_3946_ - i_3945_ | i_3945_ - (i_3945_ >>> 8));
									}
								} else if (i == 3) {
									byte i_3948_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									int i_3949_ = (i_3948_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3948_]) : 0);
									int i_3950_ = anInt9350;
									int i_3951_ = i_3949_ + i_3950_;
									int i_3952_ = ((i_3949_ & 0xff00ff) + (i_3950_ & 0xff00ff));
									int i_3953_ = ((i_3952_ & 0x1000100) + (i_3951_ - i_3952_ & 0x10000));
									i_3953_ = (i_3951_ - i_3953_ | i_3953_ - (i_3953_ >>> 8));
									if (i_3949_ == 0 && anInt9351 != 255) {
										i_3949_ = i_3953_;
										i_3953_ = is[i_3899_];
										i_3953_ = (((((i_3949_ & 0xff00ff) * anInt9351) + ((i_3953_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3949_ & 0xff00) * anInt9351) + ((i_3953_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									}
									is[i_3899_] = i_3953_;
								} else if (i == 2) {
									int i_3954_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3898_]);
									if (i_3954_ != 0) {
										int i_3955_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3954_ & 0xff]);
										int i_3956_ = ((i_3955_ & 0xff00ff) * anInt9351 & ~0xff00ff);
										int i_3957_ = ((i_3955_ & 0xff00) * anInt9351 & 0xff0000);
										i_3955_ = (((i_3956_ | i_3957_) >>> 8) + anInt9323);
										int i_3958_ = is[i_3899_];
										int i_3959_ = i_3955_ + i_3958_;
										int i_3960_ = ((i_3955_ & 0xff00ff) + (i_3958_ & 0xff00ff));
										i_3958_ = ((i_3960_ & 0x1000100) + (i_3959_ - i_3960_ & 0x10000));
										is[i_3899_] = (i_3959_ - i_3958_ | i_3958_ - (i_3958_ >>> 8));
									}
								}
							} else
								throw new IllegalArgumentException();
							i_3893_ += anInt9340;
						}
					}
					i_3891_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				for (int i_3961_ = anInt9356; i_3961_ < 0; i_3961_++) {
					int i_3962_ = anInt9339;
					int i_3963_ = anInt9346 + anInt9348;
					int i_3964_ = anInt9324 + anInt9349;
					int i_3965_ = anInt9347;
					if (i_3963_ < 0) {
						int i_3966_ = (anInt9340 - 1 - i_3963_) / anInt9340;
						i_3965_ += i_3966_;
						i_3963_ += anInt9340 * i_3966_;
						i_3964_ += anInt9341 * i_3966_;
						i_3962_ += i_3966_;
					}
					int i_3967_;
					if ((i_3967_ = (1 + i_3963_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_3965_)
						i_3965_ = i_3967_;
					if ((i_3967_ = i_3964_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
						i_3967_ = (anInt9341 - i_3967_) / anInt9341;
						i_3965_ += i_3967_;
						i_3963_ += anInt9340 * i_3967_;
						i_3964_ += anInt9341 * i_3967_;
						i_3962_ += i_3967_;
					}
					if ((i_3967_ = (i_3964_ - anInt9341) / anInt9341) > i_3965_)
						i_3965_ = i_3967_;
					for (/**/; i_3965_ < 0; i_3965_++) {
						int i_3968_ = (((i_3964_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_3963_ >> 12));
						int i_3969_ = i_3962_++;
						if (i_3476_ == 0) {
							if (i == 1)
								is[i_3969_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]) & 0xff]);
							else if (i == 0) {
								int i_3970_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]) & 0xff]);
								int i_3971_ = ((i_3970_ & 0xff0000) * anInt9353 & ~0xffffff);
								int i_3972_ = ((i_3970_ & 0xff00) * anInt9354 & 0xff0000);
								int i_3973_ = (i_3970_ & 0xff) * anInt9333 & 0xff00;
								is[i_3969_] = (i_3971_ | i_3972_ | i_3973_) >>> 8;
							} else if (i == 3) {
								int i_3974_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]) & 0xff]);
								int i_3975_ = anInt9350;
								int i_3976_ = i_3974_ + i_3975_;
								int i_3977_ = ((i_3974_ & 0xff00ff) + (i_3975_ & 0xff00ff));
								int i_3978_ = ((i_3977_ & 0x1000100) + (i_3976_ - i_3977_ & 0x10000));
								is[i_3969_] = i_3976_ - i_3978_ | i_3978_ - (i_3978_ >>> 8);
							} else if (i == 2) {
								int i_3979_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]) & 0xff]);
								int i_3980_ = ((i_3979_ & 0xff00ff) * anInt9351 & ~0xff00ff);
								int i_3981_ = ((i_3979_ & 0xff00) * anInt9351 & 0xff0000);
								is[i_3969_] = ((i_3980_ | i_3981_) >>> 8) + anInt9323;
							} else
								throw new IllegalArgumentException();
						} else if (i_3476_ == 1) {
							if (i == 1) {
								int i_3982_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								if (i_3982_ != 0)
									is[i_3969_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3982_ & 0xff]);
							} else if (i == 0) {
								int i_3983_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								if (i_3983_ != 0) {
									int i_3984_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_3983_ & 0xff]);
									if ((anInt9350 & 0xffffff) == 16777215) {
										int i_3985_ = anInt9350 >>> 24;
										int i_3986_ = 256 - i_3985_;
										int i_3987_ = is[i_3969_];
										is[i_3969_] = ((((i_3984_ & 0xff00ff) * i_3985_ + ((i_3987_ & 0xff00ff) * i_3986_)) & ~0xff00ff) + (((i_3984_ & 0xff00) * i_3985_ + ((i_3987_ & 0xff00) * i_3986_)) & 0xff0000)) >> 8;
									} else if (anInt9351 != 255) {
										int i_3988_ = ((i_3984_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3989_ = ((i_3984_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3990_ = ((i_3984_ & 0xff) * anInt9333 & 0xff00);
										i_3984_ = (i_3988_ | i_3989_ | i_3990_) >>> 8;
										int i_3991_ = is[i_3969_];
										is[i_3969_] = (((((i_3984_ & 0xff00ff) * anInt9351) + ((i_3991_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_3984_ & 0xff00) * anInt9351) + ((i_3991_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									} else {
										int i_3992_ = ((i_3984_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_3993_ = ((i_3984_ & 0xff00) * anInt9354 & 0xff0000);
										int i_3994_ = ((i_3984_ & 0xff) * anInt9333 & 0xff00);
										is[i_3969_] = (i_3992_ | i_3993_ | i_3994_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_3995_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								int i_3996_ = (i_3995_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_3995_]) : 0);
								int i_3997_ = anInt9350;
								int i_3998_ = i_3996_ + i_3997_;
								int i_3999_ = ((i_3996_ & 0xff00ff) + (i_3997_ & 0xff00ff));
								int i_4000_ = ((i_3999_ & 0x1000100) + (i_3998_ - i_3999_ & 0x10000));
								i_4000_ = i_3998_ - i_4000_ | i_4000_ - (i_4000_ >>> 8);
								if (i_3996_ == 0 && anInt9351 != 255) {
									i_3996_ = i_4000_;
									i_4000_ = is[i_3969_];
									i_4000_ = ((((i_3996_ & 0xff00ff) * anInt9351 + ((i_4000_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_3996_ & 0xff00) * anInt9351 + ((i_4000_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_3969_] = i_4000_;
							} else if (i == 2) {
								int i_4001_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								if (i_4001_ != 0) {
									int i_4002_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4001_ & 0xff]);
									int i_4003_ = ((i_4002_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_4004_ = ((i_4002_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_3969_++] = ((i_4003_ | i_4004_) >>> 8) + anInt9323;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3476_ == 2) {
							if (i == 1) {
								int i_4005_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								if (i_4005_ != 0) {
									int i_4006_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4005_ & 0xff]);
									int i_4007_ = is[i_3969_];
									int i_4008_ = i_4006_ + i_4007_;
									int i_4009_ = ((i_4006_ & 0xff00ff) + (i_4007_ & 0xff00ff));
									i_4007_ = ((i_4009_ & 0x1000100) + (i_4008_ - i_4009_ & 0x10000));
									is[i_3969_] = (i_4008_ - i_4007_ | i_4007_ - (i_4007_ >>> 8));
								}
							} else if (i == 0) {
								int i_4010_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								if (i_4010_ != 0) {
									int i_4011_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4010_ & 0xff]);
									int i_4012_ = ((i_4011_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_4013_ = ((i_4011_ & 0xff00) * anInt9354 & 0xff0000);
									int i_4014_ = ((i_4011_ & 0xff) * anInt9333 & 0xff00);
									i_4011_ = (i_4012_ | i_4013_ | i_4014_) >>> 8;
									int i_4015_ = is[i_3969_];
									int i_4016_ = i_4011_ + i_4015_;
									int i_4017_ = ((i_4011_ & 0xff00ff) + (i_4015_ & 0xff00ff));
									i_4015_ = ((i_4017_ & 0x1000100) + (i_4016_ - i_4017_ & 0x10000));
									is[i_3969_] = (i_4016_ - i_4015_ | i_4015_ - (i_4015_ >>> 8));
								}
							} else if (i == 3) {
								byte i_4018_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								int i_4019_ = (i_4018_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_4018_]) : 0);
								int i_4020_ = anInt9350;
								int i_4021_ = i_4019_ + i_4020_;
								int i_4022_ = ((i_4019_ & 0xff00ff) + (i_4020_ & 0xff00ff));
								int i_4023_ = ((i_4022_ & 0x1000100) + (i_4021_ - i_4022_ & 0x10000));
								i_4023_ = i_4021_ - i_4023_ | i_4023_ - (i_4023_ >>> 8);
								if (i_4019_ == 0 && anInt9351 != 255) {
									i_4019_ = i_4023_;
									i_4023_ = is[i_3969_];
									i_4023_ = ((((i_4019_ & 0xff00ff) * anInt9351 + ((i_4023_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_4019_ & 0xff00) * anInt9351 + ((i_4023_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_3969_] = i_4023_;
							} else if (i == 2) {
								int i_4024_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_3968_]);
								if (i_4024_ != 0) {
									int i_4025_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4024_ & 0xff]);
									int i_4026_ = ((i_4025_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_4027_ = ((i_4025_ & 0xff00) * anInt9351 & 0xff0000);
									i_4025_ = (((i_4026_ | i_4027_) >>> 8) + anInt9323);
									int i_4028_ = is[i_3969_];
									int i_4029_ = i_4025_ + i_4028_;
									int i_4030_ = ((i_4025_ & 0xff00ff) + (i_4028_ & 0xff00ff));
									i_4028_ = ((i_4030_ & 0x1000100) + (i_4029_ - i_4030_ & 0x10000));
									is[i_3969_] = (i_4029_ - i_4028_ | i_4028_ - (i_4028_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_3963_ += anInt9340;
						i_3964_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				for (int i_4031_ = anInt9356; i_4031_ < 0; i_4031_++) {
					int i_4032_ = anInt9339;
					int i_4033_ = anInt9346 + anInt9348;
					int i_4034_ = anInt9324 + anInt9349;
					int i_4035_ = anInt9347;
					if (i_4033_ < 0) {
						int i_4036_ = (anInt9340 - 1 - i_4033_) / anInt9340;
						i_4035_ += i_4036_;
						i_4033_ += anInt9340 * i_4036_;
						i_4034_ += anInt9341 * i_4036_;
						i_4032_ += i_4036_;
					}
					int i_4037_;
					if ((i_4037_ = (1 + i_4033_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4035_)
						i_4035_ = i_4037_;
					if (i_4034_ < 0) {
						i_4037_ = (anInt9341 - 1 - i_4034_) / anInt9341;
						i_4035_ += i_4037_;
						i_4033_ += anInt9340 * i_4037_;
						i_4034_ += anInt9341 * i_4037_;
						i_4032_ += i_4037_;
					}
					if ((i_4037_ = (1 + i_4034_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4035_)
						i_4035_ = i_4037_;
					for (/**/; i_4035_ < 0; i_4035_++) {
						int i_4038_ = (((i_4034_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4033_ >> 12));
						int i_4039_ = i_4032_++;
						if (i_3476_ == 0) {
							if (i == 1)
								is[i_4039_] = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]) & 0xff]);
							else if (i == 0) {
								int i_4040_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]) & 0xff]);
								int i_4041_ = ((i_4040_ & 0xff0000) * anInt9353 & ~0xffffff);
								int i_4042_ = ((i_4040_ & 0xff00) * anInt9354 & 0xff0000);
								int i_4043_ = (i_4040_ & 0xff) * anInt9333 & 0xff00;
								is[i_4039_] = (i_4041_ | i_4042_ | i_4043_) >>> 8;
							} else if (i == 3) {
								int i_4044_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]) & 0xff]);
								int i_4045_ = anInt9350;
								int i_4046_ = i_4044_ + i_4045_;
								int i_4047_ = ((i_4044_ & 0xff00ff) + (i_4045_ & 0xff00ff));
								int i_4048_ = ((i_4047_ & 0x1000100) + (i_4046_ - i_4047_ & 0x10000));
								is[i_4039_] = i_4046_ - i_4048_ | i_4048_ - (i_4048_ >>> 8);
							} else if (i == 2) {
								int i_4049_ = (((Class61_Sub3_Sub3) this).anIntArray10096[(((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]) & 0xff]);
								int i_4050_ = ((i_4049_ & 0xff00ff) * anInt9351 & ~0xff00ff);
								int i_4051_ = ((i_4049_ & 0xff00) * anInt9351 & 0xff0000);
								is[i_4039_] = ((i_4050_ | i_4051_) >>> 8) + anInt9323;
							} else
								throw new IllegalArgumentException();
						} else if (i_3476_ == 1) {
							if (i == 1) {
								int i_4052_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								if (i_4052_ != 0)
									is[i_4039_] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4052_ & 0xff]);
							} else if (i == 0) {
								int i_4053_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								if (i_4053_ != 0) {
									int i_4054_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4053_ & 0xff]);
									if ((anInt9350 & 0xffffff) == 16777215) {
										int i_4055_ = anInt9350 >>> 24;
										int i_4056_ = 256 - i_4055_;
										int i_4057_ = is[i_4039_];
										is[i_4039_] = ((((i_4054_ & 0xff00ff) * i_4055_ + ((i_4057_ & 0xff00ff) * i_4056_)) & ~0xff00ff) + (((i_4054_ & 0xff00) * i_4055_ + ((i_4057_ & 0xff00) * i_4056_)) & 0xff0000)) >> 8;
									} else if (anInt9351 != 255) {
										int i_4058_ = ((i_4054_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_4059_ = ((i_4054_ & 0xff00) * anInt9354 & 0xff0000);
										int i_4060_ = ((i_4054_ & 0xff) * anInt9333 & 0xff00);
										i_4054_ = (i_4058_ | i_4059_ | i_4060_) >>> 8;
										int i_4061_ = is[i_4039_];
										is[i_4039_] = (((((i_4054_ & 0xff00ff) * anInt9351) + ((i_4061_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + ((((i_4054_ & 0xff00) * anInt9351) + ((i_4061_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
									} else {
										int i_4062_ = ((i_4054_ & 0xff0000) * anInt9353 & ~0xffffff);
										int i_4063_ = ((i_4054_ & 0xff00) * anInt9354 & 0xff0000);
										int i_4064_ = ((i_4054_ & 0xff) * anInt9333 & 0xff00);
										is[i_4039_] = (i_4062_ | i_4063_ | i_4064_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_4065_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								int i_4066_ = (i_4065_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_4065_]) : 0);
								int i_4067_ = anInt9350;
								int i_4068_ = i_4066_ + i_4067_;
								int i_4069_ = ((i_4066_ & 0xff00ff) + (i_4067_ & 0xff00ff));
								int i_4070_ = ((i_4069_ & 0x1000100) + (i_4068_ - i_4069_ & 0x10000));
								i_4070_ = i_4068_ - i_4070_ | i_4070_ - (i_4070_ >>> 8);
								if (i_4066_ == 0 && anInt9351 != 255) {
									i_4066_ = i_4070_;
									i_4070_ = is[i_4039_];
									i_4070_ = ((((i_4066_ & 0xff00ff) * anInt9351 + ((i_4070_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_4066_ & 0xff00) * anInt9351 + ((i_4070_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_4039_] = i_4070_;
							} else if (i == 2) {
								int i_4071_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								if (i_4071_ != 0) {
									int i_4072_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4071_ & 0xff]);
									int i_4073_ = ((i_4072_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_4074_ = ((i_4072_ & 0xff00) * anInt9351 & 0xff0000);
									is[i_4039_++] = ((i_4073_ | i_4074_) >>> 8) + anInt9323;
								}
							} else
								throw new IllegalArgumentException();
						} else if (i_3476_ == 2) {
							if (i == 1) {
								int i_4075_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								if (i_4075_ != 0) {
									int i_4076_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4075_ & 0xff]);
									int i_4077_ = is[i_4039_];
									int i_4078_ = i_4076_ + i_4077_;
									int i_4079_ = ((i_4076_ & 0xff00ff) + (i_4077_ & 0xff00ff));
									i_4077_ = ((i_4079_ & 0x1000100) + (i_4078_ - i_4079_ & 0x10000));
									is[i_4039_] = (i_4078_ - i_4077_ | i_4077_ - (i_4077_ >>> 8));
								}
							} else if (i == 0) {
								int i_4080_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								if (i_4080_ != 0) {
									int i_4081_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4080_ & 0xff]);
									int i_4082_ = ((i_4081_ & 0xff0000) * anInt9353 & ~0xffffff);
									int i_4083_ = ((i_4081_ & 0xff00) * anInt9354 & 0xff0000);
									int i_4084_ = ((i_4081_ & 0xff) * anInt9333 & 0xff00);
									i_4081_ = (i_4082_ | i_4083_ | i_4084_) >>> 8;
									int i_4085_ = is[i_4039_];
									int i_4086_ = i_4081_ + i_4085_;
									int i_4087_ = ((i_4081_ & 0xff00ff) + (i_4085_ & 0xff00ff));
									i_4085_ = ((i_4087_ & 0x1000100) + (i_4086_ - i_4087_ & 0x10000));
									is[i_4039_] = (i_4086_ - i_4085_ | i_4085_ - (i_4085_ >>> 8));
								}
							} else if (i == 3) {
								byte i_4088_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								int i_4089_ = (i_4088_ > 0 ? (((Class61_Sub3_Sub3) this).anIntArray10096[i_4088_]) : 0);
								int i_4090_ = anInt9350;
								int i_4091_ = i_4089_ + i_4090_;
								int i_4092_ = ((i_4089_ & 0xff00ff) + (i_4090_ & 0xff00ff));
								int i_4093_ = ((i_4092_ & 0x1000100) + (i_4091_ - i_4092_ & 0x10000));
								i_4093_ = i_4091_ - i_4093_ | i_4093_ - (i_4093_ >>> 8);
								if (i_4089_ == 0 && anInt9351 != 255) {
									i_4089_ = i_4093_;
									i_4093_ = is[i_4039_];
									i_4093_ = ((((i_4089_ & 0xff00ff) * anInt9351 + ((i_4093_ & 0xff00ff) * anInt9335)) & ~0xff00ff) + (((i_4089_ & 0xff00) * anInt9351 + ((i_4093_ & 0xff00) * anInt9335)) & 0xff0000)) >> 8;
								}
								is[i_4039_] = i_4093_;
							} else if (i == 2) {
								int i_4094_ = (((Class61_Sub3_Sub3) this).aByteArray10095[i_4038_]);
								if (i_4094_ != 0) {
									int i_4095_ = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4094_ & 0xff]);
									int i_4096_ = ((i_4095_ & 0xff00ff) * anInt9351 & ~0xff00ff);
									int i_4097_ = ((i_4095_ & 0xff00) * anInt9351 & 0xff0000);
									i_4095_ = (((i_4096_ | i_4097_) >>> 8) + anInt9323);
									int i_4098_ = is[i_4039_];
									int i_4099_ = i_4095_ + i_4098_;
									int i_4100_ = ((i_4095_ & 0xff00ff) + (i_4098_ & 0xff00ff));
									i_4098_ = ((i_4100_ & 0x1000100) + (i_4099_ - i_4100_ & 0x10000));
									is[i_4039_] = (i_4099_ - i_4098_ | i_4098_ - (i_4098_ >>> 8));
								}
							}
						} else
							throw new IllegalArgumentException();
						i_4033_ += anInt9340;
						i_4034_ += anInt9341;
					}
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method746(int[] is, int[] is_4101_, int i, int i_4102_) {
		int[] is_4103_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_4103_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_4104_ = anInt9356;
					while (i_4104_ < 0) {
						int i_4105_ = i_4104_ + i_4102_;
						if (i_4105_ >= 0) {
							if (i_4105_ >= is.length)
								break;
							int i_4106_ = anInt9339;
							int i_4107_ = anInt9346;
							int i_4108_ = anInt9324;
							int i_4109_ = anInt9347;
							if (i_4107_ >= 0 && i_4108_ >= 0 && (i_4107_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0 && (i_4108_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4110_ = is[i_4105_] - i;
								int i_4111_ = -is_4101_[i_4105_];
								int i_4112_ = i_4110_ - (i_4106_ - anInt9339);
								if (i_4112_ > 0) {
									i_4106_ += i_4112_;
									i_4109_ += i_4112_;
									i_4107_ += anInt9340 * i_4112_;
									i_4108_ += anInt9341 * i_4112_;
								} else
									i_4111_ -= i_4112_;
								if (i_4109_ < i_4111_)
									i_4109_ = i_4111_;
								for (/**/; i_4109_ < 0; i_4109_++) {
									int i_4113_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4108_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4107_ >> 12))]);
									if (i_4113_ != 0)
										is_4103_[i_4106_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4113_ & 0xff]);
									else
										i_4106_++;
								}
							}
						}
						i_4104_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4114_ = anInt9356;
					while (i_4114_ < 0) {
						int i_4115_ = i_4114_ + i_4102_;
						if (i_4115_ >= 0) {
							if (i_4115_ >= is.length)
								break;
							int i_4116_ = anInt9339;
							int i_4117_ = anInt9346;
							int i_4118_ = anInt9324 + anInt9349;
							int i_4119_ = anInt9347;
							if (i_4117_ >= 0 && (i_4117_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								int i_4120_;
								if ((i_4120_ = (i_4118_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
									i_4120_ = (anInt9341 - i_4120_) / anInt9341;
									i_4119_ += i_4120_;
									i_4118_ += anInt9341 * i_4120_;
									i_4116_ += i_4120_;
								}
								if ((i_4120_ = (i_4118_ - anInt9341) / anInt9341) > i_4119_)
									i_4119_ = i_4120_;
								int i_4121_ = is[i_4115_] - i;
								int i_4122_ = -is_4101_[i_4115_];
								int i_4123_ = i_4121_ - (i_4116_ - anInt9339);
								if (i_4123_ > 0) {
									i_4116_ += i_4123_;
									i_4119_ += i_4123_;
									i_4117_ += anInt9340 * i_4123_;
									i_4118_ += anInt9341 * i_4123_;
								} else
									i_4122_ -= i_4123_;
								if (i_4119_ < i_4122_)
									i_4119_ = i_4122_;
								for (/**/; i_4119_ < 0; i_4119_++) {
									int i_4124_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4118_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4117_ >> 12))]);
									if (i_4124_ != 0)
										is_4103_[i_4116_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4124_ & 0xff]);
									else
										i_4116_++;
									i_4118_ += anInt9341;
								}
							}
						}
						i_4114_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4125_ = anInt9356;
					while (i_4125_ < 0) {
						int i_4126_ = i_4125_ + i_4102_;
						if (i_4126_ >= 0) {
							if (i_4126_ >= is.length)
								break;
							int i_4127_ = anInt9339;
							int i_4128_ = anInt9346;
							int i_4129_ = anInt9324 + anInt9349;
							int i_4130_ = anInt9347;
							if (i_4128_ >= 0 && (i_4128_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								if (i_4129_ < 0) {
									int i_4131_ = ((anInt9341 - 1 - i_4129_) / anInt9341);
									i_4130_ += i_4131_;
									i_4129_ += anInt9341 * i_4131_;
									i_4127_ += i_4131_;
								}
								int i_4132_;
								if ((i_4132_ = (1 + i_4129_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4130_)
									i_4130_ = i_4132_;
								int i_4133_ = is[i_4126_] - i;
								int i_4134_ = -is_4101_[i_4126_];
								int i_4135_ = i_4133_ - (i_4127_ - anInt9339);
								if (i_4135_ > 0) {
									i_4127_ += i_4135_;
									i_4130_ += i_4135_;
									i_4128_ += anInt9340 * i_4135_;
									i_4129_ += anInt9341 * i_4135_;
								} else
									i_4134_ -= i_4135_;
								if (i_4130_ < i_4134_)
									i_4130_ = i_4134_;
								for (/**/; i_4130_ < 0; i_4130_++) {
									int i_4136_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4129_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4128_ >> 12))]);
									if (i_4136_ != 0)
										is_4103_[i_4127_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4136_ & 0xff]);
									else
										i_4127_++;
									i_4129_ += anInt9341;
								}
							}
						}
						i_4125_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_4137_ = anInt9356;
					while (i_4137_ < 0) {
						int i_4138_ = i_4137_ + i_4102_;
						if (i_4138_ >= 0) {
							if (i_4138_ >= is.length)
								break;
							int i_4139_ = anInt9339;
							int i_4140_ = anInt9346 + anInt9348;
							int i_4141_ = anInt9324;
							int i_4142_ = anInt9347;
							if (i_4141_ >= 0 && (i_4141_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4143_;
								if ((i_4143_ = (i_4140_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
									i_4143_ = (anInt9340 - i_4143_) / anInt9340;
									i_4142_ += i_4143_;
									i_4140_ += anInt9340 * i_4143_;
									i_4139_ += i_4143_;
								}
								if ((i_4143_ = (i_4140_ - anInt9340) / anInt9340) > i_4142_)
									i_4142_ = i_4143_;
								int i_4144_ = is[i_4138_] - i;
								int i_4145_ = -is_4101_[i_4138_];
								int i_4146_ = i_4144_ - (i_4139_ - anInt9339);
								if (i_4146_ > 0) {
									i_4139_ += i_4146_;
									i_4142_ += i_4146_;
									i_4140_ += anInt9340 * i_4146_;
									i_4141_ += anInt9341 * i_4146_;
								} else
									i_4145_ -= i_4146_;
								if (i_4142_ < i_4145_)
									i_4142_ = i_4145_;
								for (/**/; i_4142_ < 0; i_4142_++) {
									int i_4147_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4141_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4140_ >> 12))]);
									if (i_4147_ != 0)
										is_4103_[i_4139_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4147_ & 0xff]);
									else
										i_4139_++;
									i_4140_ += anInt9340;
								}
							}
						}
						i_4137_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4148_ = anInt9356;
					while (i_4148_ < 0) {
						int i_4149_ = i_4148_ + i_4102_;
						if (i_4149_ >= 0) {
							if (i_4149_ >= is.length)
								break;
							int i_4150_ = anInt9339;
							int i_4151_ = anInt9346 + anInt9348;
							int i_4152_ = anInt9324 + anInt9349;
							int i_4153_ = anInt9347;
							int i_4154_;
							if ((i_4154_ = (i_4151_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4154_ = (anInt9340 - i_4154_) / anInt9340;
								i_4153_ += i_4154_;
								i_4151_ += anInt9340 * i_4154_;
								i_4152_ += anInt9341 * i_4154_;
								i_4150_ += i_4154_;
							}
							if ((i_4154_ = (i_4151_ - anInt9340) / anInt9340) > i_4153_)
								i_4153_ = i_4154_;
							if ((i_4154_ = (i_4152_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
								i_4154_ = (anInt9341 - i_4154_) / anInt9341;
								i_4153_ += i_4154_;
								i_4151_ += anInt9340 * i_4154_;
								i_4152_ += anInt9341 * i_4154_;
								i_4150_ += i_4154_;
							}
							if ((i_4154_ = (i_4152_ - anInt9341) / anInt9341) > i_4153_)
								i_4153_ = i_4154_;
							int i_4155_ = is[i_4149_] - i;
							int i_4156_ = -is_4101_[i_4149_];
							int i_4157_ = i_4155_ - (i_4150_ - anInt9339);
							if (i_4157_ > 0) {
								i_4150_ += i_4157_;
								i_4153_ += i_4157_;
								i_4151_ += anInt9340 * i_4157_;
								i_4152_ += anInt9341 * i_4157_;
							} else
								i_4156_ -= i_4157_;
							if (i_4153_ < i_4156_)
								i_4153_ = i_4156_;
							for (/**/; i_4153_ < 0; i_4153_++) {
								int i_4158_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4152_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4151_ >> 12))]);
								if (i_4158_ != 0)
									is_4103_[i_4150_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4158_ & 0xff]);
								else
									i_4150_++;
								i_4151_ += anInt9340;
								i_4152_ += anInt9341;
							}
						}
						i_4148_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4159_ = anInt9356;
					while (i_4159_ < 0) {
						int i_4160_ = i_4159_ + i_4102_;
						if (i_4160_ >= 0) {
							if (i_4160_ >= is.length)
								break;
							int i_4161_ = anInt9339;
							int i_4162_ = anInt9346 + anInt9348;
							int i_4163_ = anInt9324 + anInt9349;
							int i_4164_ = anInt9347;
							int i_4165_;
							if ((i_4165_ = (i_4162_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4165_ = (anInt9340 - i_4165_) / anInt9340;
								i_4164_ += i_4165_;
								i_4162_ += anInt9340 * i_4165_;
								i_4163_ += anInt9341 * i_4165_;
								i_4161_ += i_4165_;
							}
							if ((i_4165_ = (i_4162_ - anInt9340) / anInt9340) > i_4164_)
								i_4164_ = i_4165_;
							if (i_4163_ < 0) {
								i_4165_ = (anInt9341 - 1 - i_4163_) / anInt9341;
								i_4164_ += i_4165_;
								i_4162_ += anInt9340 * i_4165_;
								i_4163_ += anInt9341 * i_4165_;
								i_4161_ += i_4165_;
							}
							if ((i_4165_ = (1 + i_4163_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4164_)
								i_4164_ = i_4165_;
							int i_4166_ = is[i_4160_] - i;
							int i_4167_ = -is_4101_[i_4160_];
							int i_4168_ = i_4166_ - (i_4161_ - anInt9339);
							if (i_4168_ > 0) {
								i_4161_ += i_4168_;
								i_4164_ += i_4168_;
								i_4162_ += anInt9340 * i_4168_;
								i_4163_ += anInt9341 * i_4168_;
							} else
								i_4167_ -= i_4168_;
							if (i_4164_ < i_4167_)
								i_4164_ = i_4167_;
							for (/**/; i_4164_ < 0; i_4164_++) {
								int i_4169_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4163_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4162_ >> 12))]);
								if (i_4169_ != 0)
									is_4103_[i_4161_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4169_ & 0xff]);
								else
									i_4161_++;
								i_4162_ += anInt9340;
								i_4163_ += anInt9341;
							}
						}
						i_4159_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_4170_ = anInt9356;
				while (i_4170_ < 0) {
					int i_4171_ = i_4170_ + i_4102_;
					if (i_4171_ >= 0) {
						if (i_4171_ >= is.length)
							break;
						int i_4172_ = anInt9339;
						int i_4173_ = anInt9346 + anInt9348;
						int i_4174_ = anInt9324;
						int i_4175_ = anInt9347;
						if (i_4174_ >= 0 && i_4174_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							if (i_4173_ < 0) {
								int i_4176_ = (anInt9340 - 1 - i_4173_) / anInt9340;
								i_4175_ += i_4176_;
								i_4173_ += anInt9340 * i_4176_;
								i_4172_ += i_4176_;
							}
							int i_4177_;
							if ((i_4177_ = (1 + i_4173_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4175_)
								i_4175_ = i_4177_;
							int i_4178_ = is[i_4171_] - i;
							int i_4179_ = -is_4101_[i_4171_];
							int i_4180_ = i_4178_ - (i_4172_ - anInt9339);
							if (i_4180_ > 0) {
								i_4172_ += i_4180_;
								i_4175_ += i_4180_;
								i_4173_ += anInt9340 * i_4180_;
								i_4174_ += anInt9341 * i_4180_;
							} else
								i_4179_ -= i_4180_;
							if (i_4175_ < i_4179_)
								i_4175_ = i_4179_;
							for (/**/; i_4175_ < 0; i_4175_++) {
								int i_4181_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4174_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4173_ >> 12))]);
								if (i_4181_ != 0)
									is_4103_[i_4172_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4181_ & 0xff]);
								else
									i_4172_++;
								i_4173_ += anInt9340;
							}
						}
					}
					i_4170_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_4182_ = anInt9356;
				while (i_4182_ < 0) {
					int i_4183_ = i_4182_ + i_4102_;
					if (i_4183_ >= 0) {
						if (i_4183_ >= is.length)
							break;
						int i_4184_ = anInt9339;
						int i_4185_ = anInt9346 + anInt9348;
						int i_4186_ = anInt9324 + anInt9349;
						int i_4187_ = anInt9347;
						if (i_4185_ < 0) {
							int i_4188_ = (anInt9340 - 1 - i_4185_) / anInt9340;
							i_4187_ += i_4188_;
							i_4185_ += anInt9340 * i_4188_;
							i_4186_ += anInt9341 * i_4188_;
							i_4184_ += i_4188_;
						}
						int i_4189_;
						if ((i_4189_ = (1 + i_4185_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4187_)
							i_4187_ = i_4189_;
						if ((i_4189_ = i_4186_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_4189_ = (anInt9341 - i_4189_) / anInt9341;
							i_4187_ += i_4189_;
							i_4185_ += anInt9340 * i_4189_;
							i_4186_ += anInt9341 * i_4189_;
							i_4184_ += i_4189_;
						}
						if ((i_4189_ = (i_4186_ - anInt9341) / anInt9341) > i_4187_)
							i_4187_ = i_4189_;
						int i_4190_ = is[i_4183_] - i;
						int i_4191_ = -is_4101_[i_4183_];
						int i_4192_ = i_4190_ - (i_4184_ - anInt9339);
						if (i_4192_ > 0) {
							i_4184_ += i_4192_;
							i_4187_ += i_4192_;
							i_4185_ += anInt9340 * i_4192_;
							i_4186_ += anInt9341 * i_4192_;
						} else
							i_4191_ -= i_4192_;
						if (i_4187_ < i_4191_)
							i_4187_ = i_4191_;
						for (/**/; i_4187_ < 0; i_4187_++) {
							int i_4193_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4186_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4185_ >> 12))]);
							if (i_4193_ != 0)
								is_4103_[i_4184_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4193_ & 0xff]);
							else
								i_4184_++;
							i_4185_ += anInt9340;
							i_4186_ += anInt9341;
						}
					}
					i_4182_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_4194_ = anInt9356;
				while (i_4194_ < 0) {
					int i_4195_ = i_4194_ + i_4102_;
					if (i_4195_ >= 0) {
						if (i_4195_ >= is.length)
							break;
						int i_4196_ = anInt9339;
						int i_4197_ = anInt9346 + anInt9348;
						int i_4198_ = anInt9324 + anInt9349;
						int i_4199_ = anInt9347;
						if (i_4197_ < 0) {
							int i_4200_ = (anInt9340 - 1 - i_4197_) / anInt9340;
							i_4199_ += i_4200_;
							i_4197_ += anInt9340 * i_4200_;
							i_4198_ += anInt9341 * i_4200_;
							i_4196_ += i_4200_;
						}
						int i_4201_;
						if ((i_4201_ = (1 + i_4197_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4199_)
							i_4199_ = i_4201_;
						if (i_4198_ < 0) {
							i_4201_ = (anInt9341 - 1 - i_4198_) / anInt9341;
							i_4199_ += i_4201_;
							i_4197_ += anInt9340 * i_4201_;
							i_4198_ += anInt9341 * i_4201_;
							i_4196_ += i_4201_;
						}
						if ((i_4201_ = (1 + i_4198_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4199_)
							i_4199_ = i_4201_;
						int i_4202_ = is[i_4195_] - i;
						int i_4203_ = -is_4101_[i_4195_];
						int i_4204_ = i_4202_ - (i_4196_ - anInt9339);
						if (i_4204_ > 0) {
							i_4196_ += i_4204_;
							i_4199_ += i_4204_;
							i_4197_ += anInt9340 * i_4204_;
							i_4198_ += anInt9341 * i_4204_;
						} else
							i_4203_ -= i_4204_;
						if (i_4199_ < i_4203_)
							i_4199_ = i_4203_;
						for (/**/; i_4199_ < 0; i_4199_++) {
							int i_4205_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4198_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4197_ >> 12))]);
							if (i_4205_ != 0)
								is_4103_[i_4196_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4205_ & 0xff]);
							else
								i_4196_++;
							i_4197_ += anInt9340;
							i_4198_ += anInt9341;
						}
					}
					i_4194_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method751(int[] is, int[] is_4206_, int i, int i_4207_) {
		int[] is_4208_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_4208_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_4209_ = anInt9356;
					while (i_4209_ < 0) {
						int i_4210_ = i_4209_ + i_4207_;
						if (i_4210_ >= 0) {
							if (i_4210_ >= is.length)
								break;
							int i_4211_ = anInt9339;
							int i_4212_ = anInt9346;
							int i_4213_ = anInt9324;
							int i_4214_ = anInt9347;
							if (i_4212_ >= 0 && i_4213_ >= 0 && (i_4212_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0 && (i_4213_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4215_ = is[i_4210_] - i;
								int i_4216_ = -is_4206_[i_4210_];
								int i_4217_ = i_4215_ - (i_4211_ - anInt9339);
								if (i_4217_ > 0) {
									i_4211_ += i_4217_;
									i_4214_ += i_4217_;
									i_4212_ += anInt9340 * i_4217_;
									i_4213_ += anInt9341 * i_4217_;
								} else
									i_4216_ -= i_4217_;
								if (i_4214_ < i_4216_)
									i_4214_ = i_4216_;
								for (/**/; i_4214_ < 0; i_4214_++) {
									int i_4218_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4213_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4212_ >> 12))]);
									if (i_4218_ != 0)
										is_4208_[i_4211_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4218_ & 0xff]);
									else
										i_4211_++;
								}
							}
						}
						i_4209_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4219_ = anInt9356;
					while (i_4219_ < 0) {
						int i_4220_ = i_4219_ + i_4207_;
						if (i_4220_ >= 0) {
							if (i_4220_ >= is.length)
								break;
							int i_4221_ = anInt9339;
							int i_4222_ = anInt9346;
							int i_4223_ = anInt9324 + anInt9349;
							int i_4224_ = anInt9347;
							if (i_4222_ >= 0 && (i_4222_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								int i_4225_;
								if ((i_4225_ = (i_4223_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
									i_4225_ = (anInt9341 - i_4225_) / anInt9341;
									i_4224_ += i_4225_;
									i_4223_ += anInt9341 * i_4225_;
									i_4221_ += i_4225_;
								}
								if ((i_4225_ = (i_4223_ - anInt9341) / anInt9341) > i_4224_)
									i_4224_ = i_4225_;
								int i_4226_ = is[i_4220_] - i;
								int i_4227_ = -is_4206_[i_4220_];
								int i_4228_ = i_4226_ - (i_4221_ - anInt9339);
								if (i_4228_ > 0) {
									i_4221_ += i_4228_;
									i_4224_ += i_4228_;
									i_4222_ += anInt9340 * i_4228_;
									i_4223_ += anInt9341 * i_4228_;
								} else
									i_4227_ -= i_4228_;
								if (i_4224_ < i_4227_)
									i_4224_ = i_4227_;
								for (/**/; i_4224_ < 0; i_4224_++) {
									int i_4229_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4223_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4222_ >> 12))]);
									if (i_4229_ != 0)
										is_4208_[i_4221_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4229_ & 0xff]);
									else
										i_4221_++;
									i_4223_ += anInt9341;
								}
							}
						}
						i_4219_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4230_ = anInt9356;
					while (i_4230_ < 0) {
						int i_4231_ = i_4230_ + i_4207_;
						if (i_4231_ >= 0) {
							if (i_4231_ >= is.length)
								break;
							int i_4232_ = anInt9339;
							int i_4233_ = anInt9346;
							int i_4234_ = anInt9324 + anInt9349;
							int i_4235_ = anInt9347;
							if (i_4233_ >= 0 && (i_4233_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								if (i_4234_ < 0) {
									int i_4236_ = ((anInt9341 - 1 - i_4234_) / anInt9341);
									i_4235_ += i_4236_;
									i_4234_ += anInt9341 * i_4236_;
									i_4232_ += i_4236_;
								}
								int i_4237_;
								if ((i_4237_ = (1 + i_4234_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4235_)
									i_4235_ = i_4237_;
								int i_4238_ = is[i_4231_] - i;
								int i_4239_ = -is_4206_[i_4231_];
								int i_4240_ = i_4238_ - (i_4232_ - anInt9339);
								if (i_4240_ > 0) {
									i_4232_ += i_4240_;
									i_4235_ += i_4240_;
									i_4233_ += anInt9340 * i_4240_;
									i_4234_ += anInt9341 * i_4240_;
								} else
									i_4239_ -= i_4240_;
								if (i_4235_ < i_4239_)
									i_4235_ = i_4239_;
								for (/**/; i_4235_ < 0; i_4235_++) {
									int i_4241_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4234_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4233_ >> 12))]);
									if (i_4241_ != 0)
										is_4208_[i_4232_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4241_ & 0xff]);
									else
										i_4232_++;
									i_4234_ += anInt9341;
								}
							}
						}
						i_4230_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_4242_ = anInt9356;
					while (i_4242_ < 0) {
						int i_4243_ = i_4242_ + i_4207_;
						if (i_4243_ >= 0) {
							if (i_4243_ >= is.length)
								break;
							int i_4244_ = anInt9339;
							int i_4245_ = anInt9346 + anInt9348;
							int i_4246_ = anInt9324;
							int i_4247_ = anInt9347;
							if (i_4246_ >= 0 && (i_4246_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4248_;
								if ((i_4248_ = (i_4245_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
									i_4248_ = (anInt9340 - i_4248_) / anInt9340;
									i_4247_ += i_4248_;
									i_4245_ += anInt9340 * i_4248_;
									i_4244_ += i_4248_;
								}
								if ((i_4248_ = (i_4245_ - anInt9340) / anInt9340) > i_4247_)
									i_4247_ = i_4248_;
								int i_4249_ = is[i_4243_] - i;
								int i_4250_ = -is_4206_[i_4243_];
								int i_4251_ = i_4249_ - (i_4244_ - anInt9339);
								if (i_4251_ > 0) {
									i_4244_ += i_4251_;
									i_4247_ += i_4251_;
									i_4245_ += anInt9340 * i_4251_;
									i_4246_ += anInt9341 * i_4251_;
								} else
									i_4250_ -= i_4251_;
								if (i_4247_ < i_4250_)
									i_4247_ = i_4250_;
								for (/**/; i_4247_ < 0; i_4247_++) {
									int i_4252_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4246_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4245_ >> 12))]);
									if (i_4252_ != 0)
										is_4208_[i_4244_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4252_ & 0xff]);
									else
										i_4244_++;
									i_4245_ += anInt9340;
								}
							}
						}
						i_4242_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4253_ = anInt9356;
					while (i_4253_ < 0) {
						int i_4254_ = i_4253_ + i_4207_;
						if (i_4254_ >= 0) {
							if (i_4254_ >= is.length)
								break;
							int i_4255_ = anInt9339;
							int i_4256_ = anInt9346 + anInt9348;
							int i_4257_ = anInt9324 + anInt9349;
							int i_4258_ = anInt9347;
							int i_4259_;
							if ((i_4259_ = (i_4256_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4259_ = (anInt9340 - i_4259_) / anInt9340;
								i_4258_ += i_4259_;
								i_4256_ += anInt9340 * i_4259_;
								i_4257_ += anInt9341 * i_4259_;
								i_4255_ += i_4259_;
							}
							if ((i_4259_ = (i_4256_ - anInt9340) / anInt9340) > i_4258_)
								i_4258_ = i_4259_;
							if ((i_4259_ = (i_4257_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
								i_4259_ = (anInt9341 - i_4259_) / anInt9341;
								i_4258_ += i_4259_;
								i_4256_ += anInt9340 * i_4259_;
								i_4257_ += anInt9341 * i_4259_;
								i_4255_ += i_4259_;
							}
							if ((i_4259_ = (i_4257_ - anInt9341) / anInt9341) > i_4258_)
								i_4258_ = i_4259_;
							int i_4260_ = is[i_4254_] - i;
							int i_4261_ = -is_4206_[i_4254_];
							int i_4262_ = i_4260_ - (i_4255_ - anInt9339);
							if (i_4262_ > 0) {
								i_4255_ += i_4262_;
								i_4258_ += i_4262_;
								i_4256_ += anInt9340 * i_4262_;
								i_4257_ += anInt9341 * i_4262_;
							} else
								i_4261_ -= i_4262_;
							if (i_4258_ < i_4261_)
								i_4258_ = i_4261_;
							for (/**/; i_4258_ < 0; i_4258_++) {
								int i_4263_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4257_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4256_ >> 12))]);
								if (i_4263_ != 0)
									is_4208_[i_4255_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4263_ & 0xff]);
								else
									i_4255_++;
								i_4256_ += anInt9340;
								i_4257_ += anInt9341;
							}
						}
						i_4253_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4264_ = anInt9356;
					while (i_4264_ < 0) {
						int i_4265_ = i_4264_ + i_4207_;
						if (i_4265_ >= 0) {
							if (i_4265_ >= is.length)
								break;
							int i_4266_ = anInt9339;
							int i_4267_ = anInt9346 + anInt9348;
							int i_4268_ = anInt9324 + anInt9349;
							int i_4269_ = anInt9347;
							int i_4270_;
							if ((i_4270_ = (i_4267_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4270_ = (anInt9340 - i_4270_) / anInt9340;
								i_4269_ += i_4270_;
								i_4267_ += anInt9340 * i_4270_;
								i_4268_ += anInt9341 * i_4270_;
								i_4266_ += i_4270_;
							}
							if ((i_4270_ = (i_4267_ - anInt9340) / anInt9340) > i_4269_)
								i_4269_ = i_4270_;
							if (i_4268_ < 0) {
								i_4270_ = (anInt9341 - 1 - i_4268_) / anInt9341;
								i_4269_ += i_4270_;
								i_4267_ += anInt9340 * i_4270_;
								i_4268_ += anInt9341 * i_4270_;
								i_4266_ += i_4270_;
							}
							if ((i_4270_ = (1 + i_4268_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4269_)
								i_4269_ = i_4270_;
							int i_4271_ = is[i_4265_] - i;
							int i_4272_ = -is_4206_[i_4265_];
							int i_4273_ = i_4271_ - (i_4266_ - anInt9339);
							if (i_4273_ > 0) {
								i_4266_ += i_4273_;
								i_4269_ += i_4273_;
								i_4267_ += anInt9340 * i_4273_;
								i_4268_ += anInt9341 * i_4273_;
							} else
								i_4272_ -= i_4273_;
							if (i_4269_ < i_4272_)
								i_4269_ = i_4272_;
							for (/**/; i_4269_ < 0; i_4269_++) {
								int i_4274_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4268_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4267_ >> 12))]);
								if (i_4274_ != 0)
									is_4208_[i_4266_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4274_ & 0xff]);
								else
									i_4266_++;
								i_4267_ += anInt9340;
								i_4268_ += anInt9341;
							}
						}
						i_4264_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_4275_ = anInt9356;
				while (i_4275_ < 0) {
					int i_4276_ = i_4275_ + i_4207_;
					if (i_4276_ >= 0) {
						if (i_4276_ >= is.length)
							break;
						int i_4277_ = anInt9339;
						int i_4278_ = anInt9346 + anInt9348;
						int i_4279_ = anInt9324;
						int i_4280_ = anInt9347;
						if (i_4279_ >= 0 && i_4279_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							if (i_4278_ < 0) {
								int i_4281_ = (anInt9340 - 1 - i_4278_) / anInt9340;
								i_4280_ += i_4281_;
								i_4278_ += anInt9340 * i_4281_;
								i_4277_ += i_4281_;
							}
							int i_4282_;
							if ((i_4282_ = (1 + i_4278_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4280_)
								i_4280_ = i_4282_;
							int i_4283_ = is[i_4276_] - i;
							int i_4284_ = -is_4206_[i_4276_];
							int i_4285_ = i_4283_ - (i_4277_ - anInt9339);
							if (i_4285_ > 0) {
								i_4277_ += i_4285_;
								i_4280_ += i_4285_;
								i_4278_ += anInt9340 * i_4285_;
								i_4279_ += anInt9341 * i_4285_;
							} else
								i_4284_ -= i_4285_;
							if (i_4280_ < i_4284_)
								i_4280_ = i_4284_;
							for (/**/; i_4280_ < 0; i_4280_++) {
								int i_4286_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4279_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4278_ >> 12))]);
								if (i_4286_ != 0)
									is_4208_[i_4277_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4286_ & 0xff]);
								else
									i_4277_++;
								i_4278_ += anInt9340;
							}
						}
					}
					i_4275_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_4287_ = anInt9356;
				while (i_4287_ < 0) {
					int i_4288_ = i_4287_ + i_4207_;
					if (i_4288_ >= 0) {
						if (i_4288_ >= is.length)
							break;
						int i_4289_ = anInt9339;
						int i_4290_ = anInt9346 + anInt9348;
						int i_4291_ = anInt9324 + anInt9349;
						int i_4292_ = anInt9347;
						if (i_4290_ < 0) {
							int i_4293_ = (anInt9340 - 1 - i_4290_) / anInt9340;
							i_4292_ += i_4293_;
							i_4290_ += anInt9340 * i_4293_;
							i_4291_ += anInt9341 * i_4293_;
							i_4289_ += i_4293_;
						}
						int i_4294_;
						if ((i_4294_ = (1 + i_4290_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4292_)
							i_4292_ = i_4294_;
						if ((i_4294_ = i_4291_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_4294_ = (anInt9341 - i_4294_) / anInt9341;
							i_4292_ += i_4294_;
							i_4290_ += anInt9340 * i_4294_;
							i_4291_ += anInt9341 * i_4294_;
							i_4289_ += i_4294_;
						}
						if ((i_4294_ = (i_4291_ - anInt9341) / anInt9341) > i_4292_)
							i_4292_ = i_4294_;
						int i_4295_ = is[i_4288_] - i;
						int i_4296_ = -is_4206_[i_4288_];
						int i_4297_ = i_4295_ - (i_4289_ - anInt9339);
						if (i_4297_ > 0) {
							i_4289_ += i_4297_;
							i_4292_ += i_4297_;
							i_4290_ += anInt9340 * i_4297_;
							i_4291_ += anInt9341 * i_4297_;
						} else
							i_4296_ -= i_4297_;
						if (i_4292_ < i_4296_)
							i_4292_ = i_4296_;
						for (/**/; i_4292_ < 0; i_4292_++) {
							int i_4298_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4291_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4290_ >> 12))]);
							if (i_4298_ != 0)
								is_4208_[i_4289_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4298_ & 0xff]);
							else
								i_4289_++;
							i_4290_ += anInt9340;
							i_4291_ += anInt9341;
						}
					}
					i_4287_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_4299_ = anInt9356;
				while (i_4299_ < 0) {
					int i_4300_ = i_4299_ + i_4207_;
					if (i_4300_ >= 0) {
						if (i_4300_ >= is.length)
							break;
						int i_4301_ = anInt9339;
						int i_4302_ = anInt9346 + anInt9348;
						int i_4303_ = anInt9324 + anInt9349;
						int i_4304_ = anInt9347;
						if (i_4302_ < 0) {
							int i_4305_ = (anInt9340 - 1 - i_4302_) / anInt9340;
							i_4304_ += i_4305_;
							i_4302_ += anInt9340 * i_4305_;
							i_4303_ += anInt9341 * i_4305_;
							i_4301_ += i_4305_;
						}
						int i_4306_;
						if ((i_4306_ = (1 + i_4302_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4304_)
							i_4304_ = i_4306_;
						if (i_4303_ < 0) {
							i_4306_ = (anInt9341 - 1 - i_4303_) / anInt9341;
							i_4304_ += i_4306_;
							i_4302_ += anInt9340 * i_4306_;
							i_4303_ += anInt9341 * i_4306_;
							i_4301_ += i_4306_;
						}
						if ((i_4306_ = (1 + i_4303_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4304_)
							i_4304_ = i_4306_;
						int i_4307_ = is[i_4300_] - i;
						int i_4308_ = -is_4206_[i_4300_];
						int i_4309_ = i_4307_ - (i_4301_ - anInt9339);
						if (i_4309_ > 0) {
							i_4301_ += i_4309_;
							i_4304_ += i_4309_;
							i_4302_ += anInt9340 * i_4309_;
							i_4303_ += anInt9341 * i_4309_;
						} else
							i_4308_ -= i_4309_;
						if (i_4304_ < i_4308_)
							i_4304_ = i_4308_;
						for (/**/; i_4304_ < 0; i_4304_++) {
							int i_4310_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4303_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4302_ >> 12))]);
							if (i_4310_ != 0)
								is_4208_[i_4301_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4310_ & 0xff]);
							else
								i_4301_++;
							i_4302_ += anInt9340;
							i_4303_ += anInt9341;
						}
					}
					i_4299_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method752(int[] is, int[] is_4311_, int i, int i_4312_) {
		int[] is_4313_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_4313_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_4314_ = anInt9356;
					while (i_4314_ < 0) {
						int i_4315_ = i_4314_ + i_4312_;
						if (i_4315_ >= 0) {
							if (i_4315_ >= is.length)
								break;
							int i_4316_ = anInt9339;
							int i_4317_ = anInt9346;
							int i_4318_ = anInt9324;
							int i_4319_ = anInt9347;
							if (i_4317_ >= 0 && i_4318_ >= 0 && (i_4317_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0 && (i_4318_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4320_ = is[i_4315_] - i;
								int i_4321_ = -is_4311_[i_4315_];
								int i_4322_ = i_4320_ - (i_4316_ - anInt9339);
								if (i_4322_ > 0) {
									i_4316_ += i_4322_;
									i_4319_ += i_4322_;
									i_4317_ += anInt9340 * i_4322_;
									i_4318_ += anInt9341 * i_4322_;
								} else
									i_4321_ -= i_4322_;
								if (i_4319_ < i_4321_)
									i_4319_ = i_4321_;
								for (/**/; i_4319_ < 0; i_4319_++) {
									int i_4323_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4318_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4317_ >> 12))]);
									if (i_4323_ != 0)
										is_4313_[i_4316_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4323_ & 0xff]);
									else
										i_4316_++;
								}
							}
						}
						i_4314_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4324_ = anInt9356;
					while (i_4324_ < 0) {
						int i_4325_ = i_4324_ + i_4312_;
						if (i_4325_ >= 0) {
							if (i_4325_ >= is.length)
								break;
							int i_4326_ = anInt9339;
							int i_4327_ = anInt9346;
							int i_4328_ = anInt9324 + anInt9349;
							int i_4329_ = anInt9347;
							if (i_4327_ >= 0 && (i_4327_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								int i_4330_;
								if ((i_4330_ = (i_4328_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
									i_4330_ = (anInt9341 - i_4330_) / anInt9341;
									i_4329_ += i_4330_;
									i_4328_ += anInt9341 * i_4330_;
									i_4326_ += i_4330_;
								}
								if ((i_4330_ = (i_4328_ - anInt9341) / anInt9341) > i_4329_)
									i_4329_ = i_4330_;
								int i_4331_ = is[i_4325_] - i;
								int i_4332_ = -is_4311_[i_4325_];
								int i_4333_ = i_4331_ - (i_4326_ - anInt9339);
								if (i_4333_ > 0) {
									i_4326_ += i_4333_;
									i_4329_ += i_4333_;
									i_4327_ += anInt9340 * i_4333_;
									i_4328_ += anInt9341 * i_4333_;
								} else
									i_4332_ -= i_4333_;
								if (i_4329_ < i_4332_)
									i_4329_ = i_4332_;
								for (/**/; i_4329_ < 0; i_4329_++) {
									int i_4334_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4328_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4327_ >> 12))]);
									if (i_4334_ != 0)
										is_4313_[i_4326_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4334_ & 0xff]);
									else
										i_4326_++;
									i_4328_ += anInt9341;
								}
							}
						}
						i_4324_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4335_ = anInt9356;
					while (i_4335_ < 0) {
						int i_4336_ = i_4335_ + i_4312_;
						if (i_4336_ >= 0) {
							if (i_4336_ >= is.length)
								break;
							int i_4337_ = anInt9339;
							int i_4338_ = anInt9346;
							int i_4339_ = anInt9324 + anInt9349;
							int i_4340_ = anInt9347;
							if (i_4338_ >= 0 && (i_4338_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								if (i_4339_ < 0) {
									int i_4341_ = ((anInt9341 - 1 - i_4339_) / anInt9341);
									i_4340_ += i_4341_;
									i_4339_ += anInt9341 * i_4341_;
									i_4337_ += i_4341_;
								}
								int i_4342_;
								if ((i_4342_ = (1 + i_4339_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4340_)
									i_4340_ = i_4342_;
								int i_4343_ = is[i_4336_] - i;
								int i_4344_ = -is_4311_[i_4336_];
								int i_4345_ = i_4343_ - (i_4337_ - anInt9339);
								if (i_4345_ > 0) {
									i_4337_ += i_4345_;
									i_4340_ += i_4345_;
									i_4338_ += anInt9340 * i_4345_;
									i_4339_ += anInt9341 * i_4345_;
								} else
									i_4344_ -= i_4345_;
								if (i_4340_ < i_4344_)
									i_4340_ = i_4344_;
								for (/**/; i_4340_ < 0; i_4340_++) {
									int i_4346_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4339_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4338_ >> 12))]);
									if (i_4346_ != 0)
										is_4313_[i_4337_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4346_ & 0xff]);
									else
										i_4337_++;
									i_4339_ += anInt9341;
								}
							}
						}
						i_4335_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_4347_ = anInt9356;
					while (i_4347_ < 0) {
						int i_4348_ = i_4347_ + i_4312_;
						if (i_4348_ >= 0) {
							if (i_4348_ >= is.length)
								break;
							int i_4349_ = anInt9339;
							int i_4350_ = anInt9346 + anInt9348;
							int i_4351_ = anInt9324;
							int i_4352_ = anInt9347;
							if (i_4351_ >= 0 && (i_4351_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4353_;
								if ((i_4353_ = (i_4350_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
									i_4353_ = (anInt9340 - i_4353_) / anInt9340;
									i_4352_ += i_4353_;
									i_4350_ += anInt9340 * i_4353_;
									i_4349_ += i_4353_;
								}
								if ((i_4353_ = (i_4350_ - anInt9340) / anInt9340) > i_4352_)
									i_4352_ = i_4353_;
								int i_4354_ = is[i_4348_] - i;
								int i_4355_ = -is_4311_[i_4348_];
								int i_4356_ = i_4354_ - (i_4349_ - anInt9339);
								if (i_4356_ > 0) {
									i_4349_ += i_4356_;
									i_4352_ += i_4356_;
									i_4350_ += anInt9340 * i_4356_;
									i_4351_ += anInt9341 * i_4356_;
								} else
									i_4355_ -= i_4356_;
								if (i_4352_ < i_4355_)
									i_4352_ = i_4355_;
								for (/**/; i_4352_ < 0; i_4352_++) {
									int i_4357_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4351_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4350_ >> 12))]);
									if (i_4357_ != 0)
										is_4313_[i_4349_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4357_ & 0xff]);
									else
										i_4349_++;
									i_4350_ += anInt9340;
								}
							}
						}
						i_4347_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4358_ = anInt9356;
					while (i_4358_ < 0) {
						int i_4359_ = i_4358_ + i_4312_;
						if (i_4359_ >= 0) {
							if (i_4359_ >= is.length)
								break;
							int i_4360_ = anInt9339;
							int i_4361_ = anInt9346 + anInt9348;
							int i_4362_ = anInt9324 + anInt9349;
							int i_4363_ = anInt9347;
							int i_4364_;
							if ((i_4364_ = (i_4361_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4364_ = (anInt9340 - i_4364_) / anInt9340;
								i_4363_ += i_4364_;
								i_4361_ += anInt9340 * i_4364_;
								i_4362_ += anInt9341 * i_4364_;
								i_4360_ += i_4364_;
							}
							if ((i_4364_ = (i_4361_ - anInt9340) / anInt9340) > i_4363_)
								i_4363_ = i_4364_;
							if ((i_4364_ = (i_4362_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
								i_4364_ = (anInt9341 - i_4364_) / anInt9341;
								i_4363_ += i_4364_;
								i_4361_ += anInt9340 * i_4364_;
								i_4362_ += anInt9341 * i_4364_;
								i_4360_ += i_4364_;
							}
							if ((i_4364_ = (i_4362_ - anInt9341) / anInt9341) > i_4363_)
								i_4363_ = i_4364_;
							int i_4365_ = is[i_4359_] - i;
							int i_4366_ = -is_4311_[i_4359_];
							int i_4367_ = i_4365_ - (i_4360_ - anInt9339);
							if (i_4367_ > 0) {
								i_4360_ += i_4367_;
								i_4363_ += i_4367_;
								i_4361_ += anInt9340 * i_4367_;
								i_4362_ += anInt9341 * i_4367_;
							} else
								i_4366_ -= i_4367_;
							if (i_4363_ < i_4366_)
								i_4363_ = i_4366_;
							for (/**/; i_4363_ < 0; i_4363_++) {
								int i_4368_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4362_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4361_ >> 12))]);
								if (i_4368_ != 0)
									is_4313_[i_4360_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4368_ & 0xff]);
								else
									i_4360_++;
								i_4361_ += anInt9340;
								i_4362_ += anInt9341;
							}
						}
						i_4358_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4369_ = anInt9356;
					while (i_4369_ < 0) {
						int i_4370_ = i_4369_ + i_4312_;
						if (i_4370_ >= 0) {
							if (i_4370_ >= is.length)
								break;
							int i_4371_ = anInt9339;
							int i_4372_ = anInt9346 + anInt9348;
							int i_4373_ = anInt9324 + anInt9349;
							int i_4374_ = anInt9347;
							int i_4375_;
							if ((i_4375_ = (i_4372_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4375_ = (anInt9340 - i_4375_) / anInt9340;
								i_4374_ += i_4375_;
								i_4372_ += anInt9340 * i_4375_;
								i_4373_ += anInt9341 * i_4375_;
								i_4371_ += i_4375_;
							}
							if ((i_4375_ = (i_4372_ - anInt9340) / anInt9340) > i_4374_)
								i_4374_ = i_4375_;
							if (i_4373_ < 0) {
								i_4375_ = (anInt9341 - 1 - i_4373_) / anInt9341;
								i_4374_ += i_4375_;
								i_4372_ += anInt9340 * i_4375_;
								i_4373_ += anInt9341 * i_4375_;
								i_4371_ += i_4375_;
							}
							if ((i_4375_ = (1 + i_4373_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4374_)
								i_4374_ = i_4375_;
							int i_4376_ = is[i_4370_] - i;
							int i_4377_ = -is_4311_[i_4370_];
							int i_4378_ = i_4376_ - (i_4371_ - anInt9339);
							if (i_4378_ > 0) {
								i_4371_ += i_4378_;
								i_4374_ += i_4378_;
								i_4372_ += anInt9340 * i_4378_;
								i_4373_ += anInt9341 * i_4378_;
							} else
								i_4377_ -= i_4378_;
							if (i_4374_ < i_4377_)
								i_4374_ = i_4377_;
							for (/**/; i_4374_ < 0; i_4374_++) {
								int i_4379_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4373_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4372_ >> 12))]);
								if (i_4379_ != 0)
									is_4313_[i_4371_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4379_ & 0xff]);
								else
									i_4371_++;
								i_4372_ += anInt9340;
								i_4373_ += anInt9341;
							}
						}
						i_4369_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_4380_ = anInt9356;
				while (i_4380_ < 0) {
					int i_4381_ = i_4380_ + i_4312_;
					if (i_4381_ >= 0) {
						if (i_4381_ >= is.length)
							break;
						int i_4382_ = anInt9339;
						int i_4383_ = anInt9346 + anInt9348;
						int i_4384_ = anInt9324;
						int i_4385_ = anInt9347;
						if (i_4384_ >= 0 && i_4384_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							if (i_4383_ < 0) {
								int i_4386_ = (anInt9340 - 1 - i_4383_) / anInt9340;
								i_4385_ += i_4386_;
								i_4383_ += anInt9340 * i_4386_;
								i_4382_ += i_4386_;
							}
							int i_4387_;
							if ((i_4387_ = (1 + i_4383_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4385_)
								i_4385_ = i_4387_;
							int i_4388_ = is[i_4381_] - i;
							int i_4389_ = -is_4311_[i_4381_];
							int i_4390_ = i_4388_ - (i_4382_ - anInt9339);
							if (i_4390_ > 0) {
								i_4382_ += i_4390_;
								i_4385_ += i_4390_;
								i_4383_ += anInt9340 * i_4390_;
								i_4384_ += anInt9341 * i_4390_;
							} else
								i_4389_ -= i_4390_;
							if (i_4385_ < i_4389_)
								i_4385_ = i_4389_;
							for (/**/; i_4385_ < 0; i_4385_++) {
								int i_4391_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4384_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4383_ >> 12))]);
								if (i_4391_ != 0)
									is_4313_[i_4382_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4391_ & 0xff]);
								else
									i_4382_++;
								i_4383_ += anInt9340;
							}
						}
					}
					i_4380_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_4392_ = anInt9356;
				while (i_4392_ < 0) {
					int i_4393_ = i_4392_ + i_4312_;
					if (i_4393_ >= 0) {
						if (i_4393_ >= is.length)
							break;
						int i_4394_ = anInt9339;
						int i_4395_ = anInt9346 + anInt9348;
						int i_4396_ = anInt9324 + anInt9349;
						int i_4397_ = anInt9347;
						if (i_4395_ < 0) {
							int i_4398_ = (anInt9340 - 1 - i_4395_) / anInt9340;
							i_4397_ += i_4398_;
							i_4395_ += anInt9340 * i_4398_;
							i_4396_ += anInt9341 * i_4398_;
							i_4394_ += i_4398_;
						}
						int i_4399_;
						if ((i_4399_ = (1 + i_4395_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4397_)
							i_4397_ = i_4399_;
						if ((i_4399_ = i_4396_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_4399_ = (anInt9341 - i_4399_) / anInt9341;
							i_4397_ += i_4399_;
							i_4395_ += anInt9340 * i_4399_;
							i_4396_ += anInt9341 * i_4399_;
							i_4394_ += i_4399_;
						}
						if ((i_4399_ = (i_4396_ - anInt9341) / anInt9341) > i_4397_)
							i_4397_ = i_4399_;
						int i_4400_ = is[i_4393_] - i;
						int i_4401_ = -is_4311_[i_4393_];
						int i_4402_ = i_4400_ - (i_4394_ - anInt9339);
						if (i_4402_ > 0) {
							i_4394_ += i_4402_;
							i_4397_ += i_4402_;
							i_4395_ += anInt9340 * i_4402_;
							i_4396_ += anInt9341 * i_4402_;
						} else
							i_4401_ -= i_4402_;
						if (i_4397_ < i_4401_)
							i_4397_ = i_4401_;
						for (/**/; i_4397_ < 0; i_4397_++) {
							int i_4403_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4396_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4395_ >> 12))]);
							if (i_4403_ != 0)
								is_4313_[i_4394_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4403_ & 0xff]);
							else
								i_4394_++;
							i_4395_ += anInt9340;
							i_4396_ += anInt9341;
						}
					}
					i_4392_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_4404_ = anInt9356;
				while (i_4404_ < 0) {
					int i_4405_ = i_4404_ + i_4312_;
					if (i_4405_ >= 0) {
						if (i_4405_ >= is.length)
							break;
						int i_4406_ = anInt9339;
						int i_4407_ = anInt9346 + anInt9348;
						int i_4408_ = anInt9324 + anInt9349;
						int i_4409_ = anInt9347;
						if (i_4407_ < 0) {
							int i_4410_ = (anInt9340 - 1 - i_4407_) / anInt9340;
							i_4409_ += i_4410_;
							i_4407_ += anInt9340 * i_4410_;
							i_4408_ += anInt9341 * i_4410_;
							i_4406_ += i_4410_;
						}
						int i_4411_;
						if ((i_4411_ = (1 + i_4407_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4409_)
							i_4409_ = i_4411_;
						if (i_4408_ < 0) {
							i_4411_ = (anInt9341 - 1 - i_4408_) / anInt9341;
							i_4409_ += i_4411_;
							i_4407_ += anInt9340 * i_4411_;
							i_4408_ += anInt9341 * i_4411_;
							i_4406_ += i_4411_;
						}
						if ((i_4411_ = (1 + i_4408_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4409_)
							i_4409_ = i_4411_;
						int i_4412_ = is[i_4405_] - i;
						int i_4413_ = -is_4311_[i_4405_];
						int i_4414_ = i_4412_ - (i_4406_ - anInt9339);
						if (i_4414_ > 0) {
							i_4406_ += i_4414_;
							i_4409_ += i_4414_;
							i_4407_ += anInt9340 * i_4414_;
							i_4408_ += anInt9341 * i_4414_;
						} else
							i_4413_ -= i_4414_;
						if (i_4409_ < i_4413_)
							i_4409_ = i_4413_;
						for (/**/; i_4409_ < 0; i_4409_++) {
							int i_4415_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4408_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4407_ >> 12))]);
							if (i_4415_ != 0)
								is_4313_[i_4406_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4415_ & 0xff]);
							else
								i_4406_++;
							i_4407_ += anInt9340;
							i_4408_ += anInt9341;
						}
					}
					i_4404_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}

	void method753(int[] is, int[] is_4416_, int i, int i_4417_) {
		int[] is_4418_ = (((Class_ra_Sub3) ((Class61_Sub3_Sub3) this).aClass_ra_Sub3_9355).anIntArray8630);
		if (is_4418_ != null) {
			if (anInt9340 == 0) {
				if (anInt9341 == 0) {
					int i_4419_ = anInt9356;
					while (i_4419_ < 0) {
						int i_4420_ = i_4419_ + i_4417_;
						if (i_4420_ >= 0) {
							if (i_4420_ >= is.length)
								break;
							int i_4421_ = anInt9339;
							int i_4422_ = anInt9346;
							int i_4423_ = anInt9324;
							int i_4424_ = anInt9347;
							if (i_4422_ >= 0 && i_4423_ >= 0 && (i_4422_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0 && (i_4423_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4425_ = is[i_4420_] - i;
								int i_4426_ = -is_4416_[i_4420_];
								int i_4427_ = i_4425_ - (i_4421_ - anInt9339);
								if (i_4427_ > 0) {
									i_4421_ += i_4427_;
									i_4424_ += i_4427_;
									i_4422_ += anInt9340 * i_4427_;
									i_4423_ += anInt9341 * i_4427_;
								} else
									i_4426_ -= i_4427_;
								if (i_4424_ < i_4426_)
									i_4424_ = i_4426_;
								for (/**/; i_4424_ < 0; i_4424_++) {
									int i_4428_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4423_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4422_ >> 12))]);
									if (i_4428_ != 0)
										is_4418_[i_4421_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4428_ & 0xff]);
									else
										i_4421_++;
								}
							}
						}
						i_4419_++;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4429_ = anInt9356;
					while (i_4429_ < 0) {
						int i_4430_ = i_4429_ + i_4417_;
						if (i_4430_ >= 0) {
							if (i_4430_ >= is.length)
								break;
							int i_4431_ = anInt9339;
							int i_4432_ = anInt9346;
							int i_4433_ = anInt9324 + anInt9349;
							int i_4434_ = anInt9347;
							if (i_4432_ >= 0 && (i_4432_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								int i_4435_;
								if ((i_4435_ = (i_4433_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
									i_4435_ = (anInt9341 - i_4435_) / anInt9341;
									i_4434_ += i_4435_;
									i_4433_ += anInt9341 * i_4435_;
									i_4431_ += i_4435_;
								}
								if ((i_4435_ = (i_4433_ - anInt9341) / anInt9341) > i_4434_)
									i_4434_ = i_4435_;
								int i_4436_ = is[i_4430_] - i;
								int i_4437_ = -is_4416_[i_4430_];
								int i_4438_ = i_4436_ - (i_4431_ - anInt9339);
								if (i_4438_ > 0) {
									i_4431_ += i_4438_;
									i_4434_ += i_4438_;
									i_4432_ += anInt9340 * i_4438_;
									i_4433_ += anInt9341 * i_4438_;
								} else
									i_4437_ -= i_4438_;
								if (i_4434_ < i_4437_)
									i_4434_ = i_4437_;
								for (/**/; i_4434_ < 0; i_4434_++) {
									int i_4439_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4433_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4432_ >> 12))]);
									if (i_4439_ != 0)
										is_4418_[i_4431_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4439_ & 0xff]);
									else
										i_4431_++;
									i_4433_ += anInt9341;
								}
							}
						}
						i_4429_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4440_ = anInt9356;
					while (i_4440_ < 0) {
						int i_4441_ = i_4440_ + i_4417_;
						if (i_4441_ >= 0) {
							if (i_4441_ >= is.length)
								break;
							int i_4442_ = anInt9339;
							int i_4443_ = anInt9346;
							int i_4444_ = anInt9324 + anInt9349;
							int i_4445_ = anInt9347;
							if (i_4443_ >= 0 && (i_4443_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12)) < 0) {
								if (i_4444_ < 0) {
									int i_4446_ = ((anInt9341 - 1 - i_4444_) / anInt9341);
									i_4445_ += i_4446_;
									i_4444_ += anInt9341 * i_4446_;
									i_4442_ += i_4446_;
								}
								int i_4447_;
								if ((i_4447_ = (1 + i_4444_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4445_)
									i_4445_ = i_4447_;
								int i_4448_ = is[i_4441_] - i;
								int i_4449_ = -is_4416_[i_4441_];
								int i_4450_ = i_4448_ - (i_4442_ - anInt9339);
								if (i_4450_ > 0) {
									i_4442_ += i_4450_;
									i_4445_ += i_4450_;
									i_4443_ += anInt9340 * i_4450_;
									i_4444_ += anInt9341 * i_4450_;
								} else
									i_4449_ -= i_4450_;
								if (i_4445_ < i_4449_)
									i_4445_ = i_4449_;
								for (/**/; i_4445_ < 0; i_4445_++) {
									int i_4451_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4444_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4443_ >> 12))]);
									if (i_4451_ != 0)
										is_4418_[i_4442_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4451_ & 0xff]);
									else
										i_4442_++;
									i_4444_ += anInt9341;
								}
							}
						}
						i_4440_++;
						anInt9346 += anInt9342;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9340 < 0) {
				if (anInt9341 == 0) {
					int i_4452_ = anInt9356;
					while (i_4452_ < 0) {
						int i_4453_ = i_4452_ + i_4417_;
						if (i_4453_ >= 0) {
							if (i_4453_ >= is.length)
								break;
							int i_4454_ = anInt9339;
							int i_4455_ = anInt9346 + anInt9348;
							int i_4456_ = anInt9324;
							int i_4457_ = anInt9347;
							if (i_4456_ >= 0 && (i_4456_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) < 0) {
								int i_4458_;
								if ((i_4458_ = (i_4455_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
									i_4458_ = (anInt9340 - i_4458_) / anInt9340;
									i_4457_ += i_4458_;
									i_4455_ += anInt9340 * i_4458_;
									i_4454_ += i_4458_;
								}
								if ((i_4458_ = (i_4455_ - anInt9340) / anInt9340) > i_4457_)
									i_4457_ = i_4458_;
								int i_4459_ = is[i_4453_] - i;
								int i_4460_ = -is_4416_[i_4453_];
								int i_4461_ = i_4459_ - (i_4454_ - anInt9339);
								if (i_4461_ > 0) {
									i_4454_ += i_4461_;
									i_4457_ += i_4461_;
									i_4455_ += anInt9340 * i_4461_;
									i_4456_ += anInt9341 * i_4461_;
								} else
									i_4460_ -= i_4461_;
								if (i_4457_ < i_4460_)
									i_4457_ = i_4460_;
								for (/**/; i_4457_ < 0; i_4457_++) {
									int i_4462_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4456_ >> 12) * (((Class61_Sub3_Sub3) this).anInt9358)) + (i_4455_ >> 12))]);
									if (i_4462_ != 0)
										is_4418_[i_4454_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4462_ & 0xff]);
									else
										i_4454_++;
									i_4455_ += anInt9340;
								}
							}
						}
						i_4452_++;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else if (anInt9341 < 0) {
					int i_4463_ = anInt9356;
					while (i_4463_ < 0) {
						int i_4464_ = i_4463_ + i_4417_;
						if (i_4464_ >= 0) {
							if (i_4464_ >= is.length)
								break;
							int i_4465_ = anInt9339;
							int i_4466_ = anInt9346 + anInt9348;
							int i_4467_ = anInt9324 + anInt9349;
							int i_4468_ = anInt9347;
							int i_4469_;
							if ((i_4469_ = (i_4466_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4469_ = (anInt9340 - i_4469_) / anInt9340;
								i_4468_ += i_4469_;
								i_4466_ += anInt9340 * i_4469_;
								i_4467_ += anInt9341 * i_4469_;
								i_4465_ += i_4469_;
							}
							if ((i_4469_ = (i_4466_ - anInt9340) / anInt9340) > i_4468_)
								i_4468_ = i_4469_;
							if ((i_4469_ = (i_4467_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12))) >= 0) {
								i_4469_ = (anInt9341 - i_4469_) / anInt9341;
								i_4468_ += i_4469_;
								i_4466_ += anInt9340 * i_4469_;
								i_4467_ += anInt9341 * i_4469_;
								i_4465_ += i_4469_;
							}
							if ((i_4469_ = (i_4467_ - anInt9341) / anInt9341) > i_4468_)
								i_4468_ = i_4469_;
							int i_4470_ = is[i_4464_] - i;
							int i_4471_ = -is_4416_[i_4464_];
							int i_4472_ = i_4470_ - (i_4465_ - anInt9339);
							if (i_4472_ > 0) {
								i_4465_ += i_4472_;
								i_4468_ += i_4472_;
								i_4466_ += anInt9340 * i_4472_;
								i_4467_ += anInt9341 * i_4472_;
							} else
								i_4471_ -= i_4472_;
							if (i_4468_ < i_4471_)
								i_4468_ = i_4471_;
							for (/**/; i_4468_ < 0; i_4468_++) {
								int i_4473_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4467_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4466_ >> 12))]);
								if (i_4473_ != 0)
									is_4418_[i_4465_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4473_ & 0xff]);
								else
									i_4465_++;
								i_4466_ += anInt9340;
								i_4467_ += anInt9341;
							}
						}
						i_4463_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				} else {
					int i_4474_ = anInt9356;
					while (i_4474_ < 0) {
						int i_4475_ = i_4474_ + i_4417_;
						if (i_4475_ >= 0) {
							if (i_4475_ >= is.length)
								break;
							int i_4476_ = anInt9339;
							int i_4477_ = anInt9346 + anInt9348;
							int i_4478_ = anInt9324 + anInt9349;
							int i_4479_ = anInt9347;
							int i_4480_;
							if ((i_4480_ = (i_4477_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12))) >= 0) {
								i_4480_ = (anInt9340 - i_4480_) / anInt9340;
								i_4479_ += i_4480_;
								i_4477_ += anInt9340 * i_4480_;
								i_4478_ += anInt9341 * i_4480_;
								i_4476_ += i_4480_;
							}
							if ((i_4480_ = (i_4477_ - anInt9340) / anInt9340) > i_4479_)
								i_4479_ = i_4480_;
							if (i_4478_ < 0) {
								i_4480_ = (anInt9341 - 1 - i_4478_) / anInt9341;
								i_4479_ += i_4480_;
								i_4477_ += anInt9340 * i_4480_;
								i_4478_ += anInt9341 * i_4480_;
								i_4476_ += i_4480_;
							}
							if ((i_4480_ = (1 + i_4478_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4479_)
								i_4479_ = i_4480_;
							int i_4481_ = is[i_4475_] - i;
							int i_4482_ = -is_4416_[i_4475_];
							int i_4483_ = i_4481_ - (i_4476_ - anInt9339);
							if (i_4483_ > 0) {
								i_4476_ += i_4483_;
								i_4479_ += i_4483_;
								i_4477_ += anInt9340 * i_4483_;
								i_4478_ += anInt9341 * i_4483_;
							} else
								i_4482_ -= i_4483_;
							if (i_4479_ < i_4482_)
								i_4479_ = i_4482_;
							for (/**/; i_4479_ < 0; i_4479_++) {
								int i_4484_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4478_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4477_ >> 12))]);
								if (i_4484_ != 0)
									is_4418_[i_4476_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4484_ & 0xff]);
								else
									i_4476_++;
								i_4477_ += anInt9340;
								i_4478_ += anInt9341;
							}
						}
						i_4474_++;
						anInt9346 += anInt9342;
						anInt9324 += anInt9343;
						anInt9339 += anInt9338;
					}
				}
			} else if (anInt9341 == 0) {
				int i_4485_ = anInt9356;
				while (i_4485_ < 0) {
					int i_4486_ = i_4485_ + i_4417_;
					if (i_4486_ >= 0) {
						if (i_4486_ >= is.length)
							break;
						int i_4487_ = anInt9339;
						int i_4488_ = anInt9346 + anInt9348;
						int i_4489_ = anInt9324;
						int i_4490_ = anInt9347;
						if (i_4489_ >= 0 && i_4489_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) < 0) {
							if (i_4488_ < 0) {
								int i_4491_ = (anInt9340 - 1 - i_4488_) / anInt9340;
								i_4490_ += i_4491_;
								i_4488_ += anInt9340 * i_4491_;
								i_4487_ += i_4491_;
							}
							int i_4492_;
							if ((i_4492_ = (1 + i_4488_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4490_)
								i_4490_ = i_4492_;
							int i_4493_ = is[i_4486_] - i;
							int i_4494_ = -is_4416_[i_4486_];
							int i_4495_ = i_4493_ - (i_4487_ - anInt9339);
							if (i_4495_ > 0) {
								i_4487_ += i_4495_;
								i_4490_ += i_4495_;
								i_4488_ += anInt9340 * i_4495_;
								i_4489_ += anInt9341 * i_4495_;
							} else
								i_4494_ -= i_4495_;
							if (i_4490_ < i_4494_)
								i_4490_ = i_4494_;
							for (/**/; i_4490_ < 0; i_4490_++) {
								int i_4496_ = (((Class61_Sub3_Sub3) this).aByteArray10095[((i_4489_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358 + (i_4488_ >> 12))]);
								if (i_4496_ != 0)
									is_4418_[i_4487_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4496_ & 0xff]);
								else
									i_4487_++;
								i_4488_ += anInt9340;
							}
						}
					}
					i_4485_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else if (anInt9341 < 0) {
				int i_4497_ = anInt9356;
				while (i_4497_ < 0) {
					int i_4498_ = i_4497_ + i_4417_;
					if (i_4498_ >= 0) {
						if (i_4498_ >= is.length)
							break;
						int i_4499_ = anInt9339;
						int i_4500_ = anInt9346 + anInt9348;
						int i_4501_ = anInt9324 + anInt9349;
						int i_4502_ = anInt9347;
						if (i_4500_ < 0) {
							int i_4503_ = (anInt9340 - 1 - i_4500_) / anInt9340;
							i_4502_ += i_4503_;
							i_4500_ += anInt9340 * i_4503_;
							i_4501_ += anInt9341 * i_4503_;
							i_4499_ += i_4503_;
						}
						int i_4504_;
						if ((i_4504_ = (1 + i_4500_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4502_)
							i_4502_ = i_4504_;
						if ((i_4504_ = i_4501_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12)) >= 0) {
							i_4504_ = (anInt9341 - i_4504_) / anInt9341;
							i_4502_ += i_4504_;
							i_4500_ += anInt9340 * i_4504_;
							i_4501_ += anInt9341 * i_4504_;
							i_4499_ += i_4504_;
						}
						if ((i_4504_ = (i_4501_ - anInt9341) / anInt9341) > i_4502_)
							i_4502_ = i_4504_;
						int i_4505_ = is[i_4498_] - i;
						int i_4506_ = -is_4416_[i_4498_];
						int i_4507_ = i_4505_ - (i_4499_ - anInt9339);
						if (i_4507_ > 0) {
							i_4499_ += i_4507_;
							i_4502_ += i_4507_;
							i_4500_ += anInt9340 * i_4507_;
							i_4501_ += anInt9341 * i_4507_;
						} else
							i_4506_ -= i_4507_;
						if (i_4502_ < i_4506_)
							i_4502_ = i_4506_;
						for (/**/; i_4502_ < 0; i_4502_++) {
							int i_4508_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4501_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4500_ >> 12))]);
							if (i_4508_ != 0)
								is_4418_[i_4499_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4508_ & 0xff]);
							else
								i_4499_++;
							i_4500_ += anInt9340;
							i_4501_ += anInt9341;
						}
					}
					i_4497_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			} else {
				int i_4509_ = anInt9356;
				while (i_4509_ < 0) {
					int i_4510_ = i_4509_ + i_4417_;
					if (i_4510_ >= 0) {
						if (i_4510_ >= is.length)
							break;
						int i_4511_ = anInt9339;
						int i_4512_ = anInt9346 + anInt9348;
						int i_4513_ = anInt9324 + anInt9349;
						int i_4514_ = anInt9347;
						if (i_4512_ < 0) {
							int i_4515_ = (anInt9340 - 1 - i_4512_) / anInt9340;
							i_4514_ += i_4515_;
							i_4512_ += anInt9340 * i_4515_;
							i_4513_ += anInt9341 * i_4515_;
							i_4511_ += i_4515_;
						}
						int i_4516_;
						if ((i_4516_ = (1 + i_4512_ - (((Class61_Sub3_Sub3) this).anInt9358 << 12) - anInt9340) / anInt9340) > i_4514_)
							i_4514_ = i_4516_;
						if (i_4513_ < 0) {
							i_4516_ = (anInt9341 - 1 - i_4513_) / anInt9341;
							i_4514_ += i_4516_;
							i_4512_ += anInt9340 * i_4516_;
							i_4513_ += anInt9341 * i_4516_;
							i_4511_ += i_4516_;
						}
						if ((i_4516_ = (1 + i_4513_ - (((Class61_Sub3_Sub3) this).anInt9325 << 12) - anInt9341) / anInt9341) > i_4514_)
							i_4514_ = i_4516_;
						int i_4517_ = is[i_4510_] - i;
						int i_4518_ = -is_4416_[i_4510_];
						int i_4519_ = i_4517_ - (i_4511_ - anInt9339);
						if (i_4519_ > 0) {
							i_4511_ += i_4519_;
							i_4514_ += i_4519_;
							i_4512_ += anInt9340 * i_4519_;
							i_4513_ += anInt9341 * i_4519_;
						} else
							i_4518_ -= i_4519_;
						if (i_4514_ < i_4518_)
							i_4514_ = i_4518_;
						for (/**/; i_4514_ < 0; i_4514_++) {
							int i_4520_ = (((Class61_Sub3_Sub3) this).aByteArray10095[(((i_4513_ >> 12) * ((Class61_Sub3_Sub3) this).anInt9358) + (i_4512_ >> 12))]);
							if (i_4520_ != 0)
								is_4418_[i_4511_++] = (((Class61_Sub3_Sub3) this).anIntArray10096[i_4520_ & 0xff]);
							else
								i_4511_++;
							i_4512_ += anInt9340;
							i_4513_ += anInt9341;
						}
					}
					i_4509_++;
					anInt9346 += anInt9342;
					anInt9324 += anInt9343;
					anInt9339 += anInt9338;
				}
			}
		}
	}
}
