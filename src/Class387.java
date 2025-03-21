/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class387 {
	
	protected boolean aBoolean3990 = false;
	static float aFloat3991 = 3.1415927F;

	public abstract void method4440(Class247 class247, Class80 class80, int i);

	void method4441(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, float[] fs, int i_5_, float f, float[] fs_6_) {
		i -= i_2_;
		i_0_ -= i_3_;
		i_1_ -= i_4_;
		float f_7_ = (float) i * fs[0] + (float) i_0_ * fs[1] + (float) i_1_ * fs[2];
		float f_8_ = (float) i * fs[3] + (float) i_0_ * fs[4] + (float) i_1_ * fs[5];
		float f_9_ = (float) i * fs[6] + (float) i_0_ * fs[7] + (float) i_1_ * fs[8];
		float f_10_ = (float) Math.sqrt((double) (f_7_ * f_7_ + f_8_ * f_8_ + f_9_ * f_9_));
		float f_11_ = ((float) Math.atan2((double) f_7_, (double) f_9_) / 6.2831855F + 0.5F);
		float f_12_ = ((float) Math.asin((double) (f_8_ / f_10_)) / 3.1415927F + 0.5F + f);
		if (i_5_ == 1) {
			float f_13_ = f_11_;
			f_11_ = -f_12_;
			f_12_ = f_13_;
		} else if (i_5_ == 2) {
			f_11_ = -f_11_;
			f_12_ = -f_12_;
		} else if (i_5_ == 3) {
			float f_14_ = f_11_;
			f_11_ = f_12_;
			f_12_ = -f_14_;
		}
		fs_6_[0] = f_11_;
		fs_6_[1] = f_12_;
	}

	int method4442(float f, float f_15_, float f_16_) {
		float f_17_ = f < 0.0F ? -f : f;
		float f_18_ = f_15_ < 0.0F ? -f_15_ : f_15_;
		float f_19_ = f_16_ < 0.0F ? -f_16_ : f_16_;
		if (f_18_ > f_17_ && f_18_ > f_19_) {
			if (f_15_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_19_ > f_17_ && f_19_ > f_18_) {
			if (f_16_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	void method4443(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, float[] fs, int i_26_, float f, float f_27_, float f_28_, float[] fs_29_) {
		i -= i_22_;
		i_20_ -= i_23_;
		i_21_ -= i_24_;
		float f_30_ = ((float) i * fs[0] + (float) i_20_ * fs[1] + (float) i_21_ * fs[2]);
		float f_31_ = ((float) i * fs[3] + (float) i_20_ * fs[4] + (float) i_21_ * fs[5]);
		float f_32_ = ((float) i * fs[6] + (float) i_20_ * fs[7] + (float) i_21_ * fs[8]);
		float f_33_;
		float f_34_;
		if (i_25_ == 0) {
			f_33_ = f_30_ + f + 0.5F;
			f_34_ = -f_32_ + f_28_ + 0.5F;
		} else if (i_25_ == 1) {
			f_33_ = f_30_ + f + 0.5F;
			f_34_ = f_32_ + f_28_ + 0.5F;
		} else if (i_25_ == 2) {
			f_33_ = -f_30_ + f + 0.5F;
			f_34_ = -f_31_ + f_27_ + 0.5F;
		} else if (i_25_ == 3) {
			f_33_ = f_30_ + f + 0.5F;
			f_34_ = -f_31_ + f_27_ + 0.5F;
		} else if (i_25_ == 4) {
			f_33_ = f_32_ + f_28_ + 0.5F;
			f_34_ = -f_31_ + f_27_ + 0.5F;
		} else {
			f_33_ = -f_32_ + f_28_ + 0.5F;
			f_34_ = -f_31_ + f_27_ + 0.5F;
		}
		if (i_26_ == 1) {
			float f_35_ = f_33_;
			f_33_ = -f_34_;
			f_34_ = f_35_;
		} else if (i_26_ == 2) {
			f_33_ = -f_33_;
			f_34_ = -f_34_;
		} else if (i_26_ == 3) {
			float f_36_ = f_33_;
			f_33_ = f_34_;
			f_34_ = -f_36_;
		}
		fs_29_[0] = f_33_;
		fs_29_[1] = f_34_;
	}

	Class97 method4444(Model class98, int[] is, int i) {
		int[] is_37_ = null;
		int[] is_38_ = null;
		int[] is_39_ = null;
		float[][] fs = null;
		if (class98.aByteArray887 != null) {
			int i_40_ = class98.anInt882;
			int[] is_41_ = new int[i_40_];
			int[] is_42_ = new int[i_40_];
			int[] is_43_ = new int[i_40_];
			int[] is_44_ = new int[i_40_];
			int[] is_45_ = new int[i_40_];
			int[] is_46_ = new int[i_40_];
			for (int i_47_ = 0; i_47_ < i_40_; i_47_++) {
				is_41_[i_47_] = 2147483647;
				is_42_[i_47_] = -2147483647;
				is_43_[i_47_] = 2147483647;
				is_44_[i_47_] = -2147483647;
				is_45_[i_47_] = 2147483647;
				is_46_[i_47_] = -2147483647;
			}
			for (int i_48_ = 0; i_48_ < i; i_48_++) {
				int i_49_ = is[i_48_];
				if (class98.aByteArray887[i_49_] != -1) {
					int i_50_ = class98.aByteArray887[i_49_] & 0xff;
					for (int i_51_ = 0; i_51_ < 3; i_51_++) {
						short i_52_;
						if (i_51_ == 0)
							i_52_ = class98.aShortArray888[i_49_];
						else if (i_51_ == 1)
							i_52_ = class98.aShortArray907[i_49_];
						else
							i_52_ = class98.aShortArray883[i_49_];
						int i_53_ = class98.anIntArray875[i_52_];
						int i_54_ = class98.anIntArray889[i_52_];
						int i_55_ = class98.anIntArray877[i_52_];
						if (i_53_ < is_41_[i_50_])
							is_41_[i_50_] = i_53_;
						if (i_53_ > is_42_[i_50_])
							is_42_[i_50_] = i_53_;
						if (i_54_ < is_43_[i_50_])
							is_43_[i_50_] = i_54_;
						if (i_54_ > is_44_[i_50_])
							is_44_[i_50_] = i_54_;
						if (i_55_ < is_45_[i_50_])
							is_45_[i_50_] = i_55_;
						if (i_55_ > is_46_[i_50_])
							is_46_[i_50_] = i_55_;
					}
				}
			}
			is_37_ = new int[i_40_];
			is_38_ = new int[i_40_];
			is_39_ = new int[i_40_];
			fs = new float[i_40_][];
			for (int i_56_ = 0; i_56_ < i_40_; i_56_++) {
				byte i_57_ = class98.aByteArray894[i_56_];
				if (i_57_ > 0) {
					is_37_[i_56_] = (is_41_[i_56_] + is_42_[i_56_]) / 2;
					is_38_[i_56_] = (is_43_[i_56_] + is_44_[i_56_]) / 2;
					is_39_[i_56_] = (is_45_[i_56_] + is_46_[i_56_]) / 2;
					float f;
					float f_58_;
					float f_59_;
					if (i_57_ == 1) {
						int i_60_ = class98.anIntArray898[i_56_];
						if (i_60_ == 0) {
							f = 1.0F;
							f_59_ = 1.0F;
						} else if (i_60_ > 0) {
							f = 1.0F;
							f_59_ = (float) i_60_ / 1024.0F;
						} else {
							f_59_ = 1.0F;
							f = (float) -i_60_ / 1024.0F;
						}
						f_58_ = 64.0F / (float) class98.anIntArray899[i_56_];
					} else if (i_57_ == 2) {
						f = 64.0F / (float) class98.anIntArray898[i_56_];
						f_58_ = 64.0F / (float) class98.anIntArray899[i_56_];
						f_59_ = 64.0F / (float) class98.anIntArray900[i_56_];
					} else {
						f = (float) class98.anIntArray898[i_56_] / 1024.0F;
						f_58_ = (float) class98.anIntArray899[i_56_] / 1024.0F;
						f_59_ = (float) class98.anIntArray900[i_56_] / 1024.0F;
					}
					fs[i_56_] = method4459(class98.aShortArray895[i_56_], class98.aShortArray903[i_56_], class98.aShortArray886[i_56_], class98.aByteArray906[i_56_] & 0xff, f, f_58_, f_59_);
				}
			}
		}
		return new Class97(this, is_37_, is_38_, is_39_, fs);
	}

	public abstract Class64[] method4445();

	public abstract Class387 method4446(byte i, int i_61_, boolean bool);

	public abstract void KA(int i);

	public abstract int m();

	abstract void bu(int i, int i_62_, int i_63_, int i_64_);

	public abstract int N();

	public abstract int ah();

	public abstract void t(int i);

	public abstract void EA(int i);

	public abstract void bo(int i);

	public abstract int c();

	public abstract void oa(int i, int i_65_, int i_66_);

	public abstract void pa(int i, int i_67_, Class_xa class_xa, Class_xa class_xa_68_, int i_69_, int i_70_, int i_71_);

	void method4447(Class_xa class_xa, int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		boolean bool = false;
		boolean bool_78_ = false;
		boolean bool_79_ = false;
		int i_80_ = -i_74_ / 2;
		int i_81_ = -i_75_ / 2;
		int i_82_ = class_xa.method6416(i + i_80_, i_73_ + i_81_, 413516870);
		int i_83_ = i_74_ / 2;
		int i_84_ = -i_75_ / 2;
		int i_85_ = class_xa.method6416(i + i_83_, i_73_ + i_84_, 983756267);
		int i_86_ = -i_74_ / 2;
		int i_87_ = i_75_ / 2;
		int i_88_ = class_xa.method6416(i + i_86_, i_73_ + i_87_, 328284671);
		int i_89_ = i_74_ / 2;
		int i_90_ = i_75_ / 2;
		int i_91_ = class_xa.method6416(i + i_89_, i_73_ + i_90_, -16503745);
		int i_92_ = i_82_ < i_85_ ? i_82_ : i_85_;
		int i_93_ = i_88_ < i_91_ ? i_88_ : i_91_;
		int i_94_ = i_85_ < i_91_ ? i_85_ : i_91_;
		int i_95_ = i_82_ < i_88_ ? i_82_ : i_88_;
		if (i_75_ != 0) {
			int i_96_ = ((int) (Math.atan2((double) (i_92_ - i_93_), (double) i_75_) * 2607.5945876176133) & 0x3fff);
			if (i_96_ != 0) {
				if (i_76_ != 0) {
					if (i_96_ > 8192) {
						int i_97_ = 16384 - i_76_;
						if (i_96_ < i_97_)
							i_96_ = i_97_;
					} else if (i_96_ > i_76_)
						i_96_ = i_76_;
				}
				t(i_96_);
			}
		}
		if (i_74_ != 0) {
			int i_98_ = ((int) (Math.atan2((double) (i_95_ - i_94_), (double) i_74_) * 2607.5945876176133) & 0x3fff);
			if (i_98_ != 0) {
				if (i_77_ != 0) {
					if (i_98_ > 8192) {
						int i_99_ = 16384 - i_77_;
						if (i_98_ < i_99_)
							i_98_ = i_99_;
					} else if (i_98_ > i_77_)
						i_98_ = i_77_;
				}
				EA(i_98_);
			}
		}
		int i_100_ = i_82_ + i_91_;
		if (i_85_ + i_88_ < i_100_)
			i_100_ = i_85_ + i_88_;
		i_100_ = (i_100_ >> 1) - i_72_;
		if (i_100_ != 0)
			ia(0, i_100_, 0);
	}

	abstract void method4448();

	public final void method4449(Class330_Sub36_Sub5 class330_sub36_sub5, int i, Class330_Sub36_Sub5 class330_sub36_sub5_101_, int i_102_, int i_103_, int i_104_, int i_105_, boolean bool) {
		if (i != -1) {
			method4455();
			if (!ea())
				method4448();
			else {
				Class84 class84 = (((Class330_Sub36_Sub5) class330_sub36_sub5).aClass84Array9665[i]);
				Class330_Sub18 class330_sub18 = ((Class84) class84).aClass330_Sub18_692;
				Class84 class84_106_ = null;
				if (class330_sub36_sub5_101_ != null) {
					class84_106_ = (((Class330_Sub36_Sub5) class330_sub36_sub5_101_).aClass84Array9665[i_102_]);
					if (((Class84) class84_106_).aClass330_Sub18_692 != class330_sub18)
						class84_106_ = null;
				}
				method4453(class330_sub18, class84, class84_106_, i_103_, i_104_, i_105_, null, false, bool, 65535, null);
				ka();
				method4448();
			}
		}
	}

	public final void method4450(Class330_Sub36_Sub5 class330_sub36_sub5, int i, Class330_Sub36_Sub5 class330_sub36_sub5_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, boolean bool, int[] is) {
		if (i != -1) {
			method4455();
			if (!ea())
				method4448();
			else {
				Class84 class84 = (((Class330_Sub36_Sub5) class330_sub36_sub5).aClass84Array9665[i]);
				Class330_Sub18 class330_sub18 = ((Class84) class84).aClass330_Sub18_692;
				Class84 class84_113_ = null;
				if (class330_sub36_sub5_107_ != null) {
					class84_113_ = (((Class330_Sub36_Sub5) class330_sub36_sub5_107_).aClass84Array9665[i_108_]);
					if (((Class84) class84_113_).aClass330_Sub18_692 != class330_sub18)
						class84_113_ = null;
				}
				method4453(class330_sub18, class84, class84_113_, i_109_, i_110_, i_111_, null, false, bool, i_112_, is);
				ka();
				method4448();
			}
		}
	}

	abstract void method4451(int i, int[] is, int i_114_, int i_115_, int i_116_, int i_117_, boolean bool);

	public abstract Class64[] method4452();

	void method4453(Class330_Sub18 class330_sub18, Class84 class84, Class84 class84_118_, int i, int i_119_, int i_120_, boolean[] bools, boolean bool, boolean bool_121_, int i_122_, int[] is) {
		if (class84_118_ == null || i == 0) {
			for (int i_123_ = 0; i_123_ < ((Class84) class84).anInt686; i_123_++) {
				short i_124_ = ((Class84) class84).aShortArray696[i_123_];
				if (bools == null || bools[i_124_] == bool || (((Class330_Sub18) class330_sub18).anIntArray7642[i_124_]) == 0) {
					short i_125_ = ((Class84) class84).aShortArray693[i_123_];
					if (i_125_ != -1)
						method4454(0, (((Class330_Sub18) class330_sub18).anIntArrayArray7643[i_125_]), 0, 0, 0, i_120_, bool_121_, i_122_ & (((Class330_Sub18) class330_sub18).anIntArray7641[i_125_]), is);
					method4454((((Class330_Sub18) class330_sub18).anIntArray7642[i_124_]), (((Class330_Sub18) class330_sub18).anIntArrayArray7643[i_124_]), ((Class84) class84).aShortArray691[i_123_], ((Class84) class84).aShortArray694[i_123_], ((Class84) class84).aShortArray695[i_123_], i_120_, bool_121_, i_122_ & (((Class330_Sub18) class330_sub18).anIntArray7641[i_124_]), is);
				}
			}
		} else {
			int i_126_ = 0;
			int i_127_ = 0;
			for (int i_128_ = 0; (i_128_ < ((Class330_Sub18) class330_sub18).anInt7640 * 1664515899); i_128_++) {
				boolean bool_129_ = false;
				if (i_126_ < ((Class84) class84).anInt686 && ((Class84) class84).aShortArray696[i_126_] == i_128_)
					bool_129_ = true;
				boolean bool_130_ = false;
				if (i_127_ < ((Class84) class84_118_).anInt686 && (((Class84) class84_118_).aShortArray696[i_127_] == i_128_))
					bool_130_ = true;
				if (bool_129_ || bool_130_) {
					if (bools != null && bools[i_128_] != bool && (((Class330_Sub18) class330_sub18).anIntArray7642[i_128_]) != 0) {
						if (bool_129_)
							i_126_++;
						if (bool_130_)
							i_127_++;
					} else {
						int i_131_ = 0;
						int i_132_ = (((Class330_Sub18) class330_sub18).anIntArray7642[i_128_]);
						if (i_132_ == 3 || i_132_ == 10)
							i_131_ = 128;
						int i_133_;
						int i_134_;
						int i_135_;
						short i_136_;
						byte i_137_;
						if (bool_129_) {
							i_133_ = ((Class84) class84).aShortArray691[i_126_];
							i_134_ = ((Class84) class84).aShortArray694[i_126_];
							i_135_ = ((Class84) class84).aShortArray695[i_126_];
							i_136_ = ((Class84) class84).aShortArray693[i_126_];
							i_137_ = ((Class84) class84).aByteArray697[i_126_];
							i_126_++;
						} else {
							i_133_ = i_131_;
							i_134_ = i_131_;
							i_135_ = i_131_;
							i_136_ = (short) -1;
							i_137_ = (byte) 0;
						}
						int i_138_;
						int i_139_;
						int i_140_;
						short i_141_;
						byte i_142_;
						if (bool_130_) {
							i_138_ = (((Class84) class84_118_).aShortArray691[i_127_]);
							i_139_ = (((Class84) class84_118_).aShortArray694[i_127_]);
							i_140_ = (((Class84) class84_118_).aShortArray695[i_127_]);
							i_141_ = (((Class84) class84_118_).aShortArray693[i_127_]);
							i_142_ = (((Class84) class84_118_).aByteArray697[i_127_]);
							i_127_++;
						} else {
							i_138_ = i_131_;
							i_139_ = i_131_;
							i_140_ = i_131_;
							i_141_ = (short) -1;
							i_142_ = (byte) 0;
						}
						int i_143_;
						int i_144_;
						int i_145_;
						if ((i_137_ & 0x2) != 0 || (i_142_ & 0x1) != 0) {
							i_143_ = i_133_;
							i_144_ = i_134_;
							i_145_ = i_135_;
						} else if (i_132_ == 2) {
							int i_146_ = i_138_ - i_133_ & 0x3fff;
							int i_147_ = i_139_ - i_134_ & 0x3fff;
							int i_148_ = i_140_ - i_135_ & 0x3fff;
							if (i_146_ >= 8192)
								i_146_ -= 16384;
							if (i_147_ >= 8192)
								i_147_ -= 16384;
							if (i_148_ >= 8192)
								i_148_ -= 16384;
							i_143_ = i_133_ + i_146_ * i / i_119_ & 0x3fff;
							i_144_ = i_134_ + i_147_ * i / i_119_ & 0x3fff;
							i_145_ = i_135_ + i_148_ * i / i_119_ & 0x3fff;
						} else if (i_132_ == 9) {
							int i_149_ = i_138_ - i_133_ & 0x3fff;
							if (i_149_ >= 8192)
								i_149_ -= 16384;
							i_143_ = i_133_ + i_149_ * i / i_119_ & 0x3fff;
							i_145_ = 0;
							i_144_ = 0;
						} else if (i_132_ == 7) {
							int i_150_ = i_138_ - i_133_ & 0x3f;
							if (i_150_ >= 32)
								i_150_ -= 64;
							i_143_ = i_133_ + i_150_ * i / i_119_ & 0x3f;
							i_144_ = i_134_ + (i_139_ - i_134_) * i / i_119_;
							i_145_ = i_135_ + (i_140_ - i_135_) * i / i_119_;
						} else {
							i_143_ = i_133_ + (i_138_ - i_133_) * i / i_119_;
							i_144_ = i_134_ + (i_139_ - i_134_) * i / i_119_;
							i_145_ = i_135_ + (i_140_ - i_135_) * i / i_119_;
						}
						if (i_136_ != -1)
							method4454(0, (((Class330_Sub18) class330_sub18).anIntArrayArray7643[i_136_]), 0, 0, 0, i_120_, bool_121_, (i_122_ & (((Class330_Sub18) class330_sub18).anIntArray7641[i_136_])), is);
						else if (i_141_ != -1)
							method4454(0, (((Class330_Sub18) class330_sub18).anIntArrayArray7643[i_141_]), 0, 0, 0, i_120_, bool_121_, (i_122_ & (((Class330_Sub18) class330_sub18).anIntArray7641[i_141_])), is);
						method4454(i_132_, (((Class330_Sub18) class330_sub18).anIntArrayArray7643[i_128_]), i_143_, i_144_, i_145_, i_120_, bool_121_, i_122_ & (((Class330_Sub18) class330_sub18).anIntArray7641[i_128_]), is);
					}
				}
			}
		}
	}

	void method4454(int i, int[] is, int i_151_, int i_152_, int i_153_, int i_154_, boolean bool, int i_155_, int[] is_156_) {
		if (i_154_ == 1) {
			if (i == 0 || i == 1) {
				int i_157_ = -i_151_;
				i_151_ = i_153_;
				i_153_ = i_157_;
			} else if (i == 3) {
				int i_158_ = i_151_;
				i_151_ = i_153_;
				i_153_ = i_158_;
			} else if (i == 2) {
				int i_159_ = i_151_;
				i_151_ = -i_153_ & 0x3fff;
				i_153_ = i_159_ & 0x3fff;
			}
		} else if (i_154_ == 2) {
			if (i == 0 || i == 1) {
				i_151_ = -i_151_;
				i_153_ = -i_153_;
			} else if (i == 2) {
				i_151_ = -i_151_ & 0x3fff;
				i_153_ = -i_153_ & 0x3fff;
			}
		} else if (i_154_ == 3) {
			if (i == 0 || i == 1) {
				int i_160_ = i_151_;
				i_151_ = -i_153_;
				i_153_ = i_160_;
			} else if (i == 3) {
				int i_161_ = i_151_;
				i_151_ = i_153_;
				i_153_ = i_161_;
			} else if (i == 2) {
				int i_162_ = i_151_;
				i_151_ = i_153_ & 0x3fff;
				i_153_ = -i_162_ & 0x3fff;
			}
		}
		if (i_155_ != 65535)
			e(i, is, i_151_, i_152_, i_153_, bool, i_155_, is_156_);
		else
			method4470(i, is, i_151_, i_152_, i_153_, i_154_, bool);
	}

	abstract boolean ea();

	public abstract void ia(int i, int i_163_, int i_164_);

	abstract void method4455();

	abstract void w(int i, int i_165_, int i_166_, int i_167_);

	abstract void ka();

	public final void method4456(Class330_Sub36_Sub5 class330_sub36_sub5, int i) {
		if (i != -1) {
			method4455();
			if (!ea())
				method4448();
			else {
				Class84 class84 = (((Class330_Sub36_Sub5) class330_sub36_sub5).aClass84Array9665[i]);
				Class330_Sub18 class330_sub18 = ((Class84) class84).aClass330_Sub18_692;
				for (int i_168_ = 0; i_168_ < ((Class84) class84).anInt686; i_168_++) {
					short i_169_ = ((Class84) class84).aShortArray696[i_168_];
					if (((Class330_Sub18) class330_sub18).aBooleanArray7644[i_169_]) {
						if (((Class84) class84).aShortArray693[i_168_] != -1)
							w(0, 0, 0, 0);
						w((((Class330_Sub18) class330_sub18).anIntArray7642[i_169_]), ((Class84) class84).aShortArray691[i_168_], ((Class84) class84).aShortArray694[i_168_], ((Class84) class84).aShortArray695[i_168_]);
					}
				}
				ka();
				method4448();
			}
		}
	}

	public final void method4457(Class330_Sub36_Sub5 class330_sub36_sub5, int i, Class330_Sub36_Sub5 class330_sub36_sub5_170_, int i_171_, int i_172_, int i_173_, Class330_Sub36_Sub5 class330_sub36_sub5_174_, int i_175_, Class330_Sub36_Sub5 class330_sub36_sub5_176_, int i_177_, int i_178_, int i_179_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_175_ == -1)
				method4449(class330_sub36_sub5, i, class330_sub36_sub5_170_, i_171_, i_172_, i_173_, 0, bool);
			else {
				method4455();
				if (!ea())
					method4448();
				else {
					Class84 class84 = (((Class330_Sub36_Sub5) class330_sub36_sub5).aClass84Array9665[i]);
					Class330_Sub18 class330_sub18 = ((Class84) class84).aClass330_Sub18_692;
					Class84 class84_180_ = null;
					if (class330_sub36_sub5_170_ != null) {
						class84_180_ = (((Class330_Sub36_Sub5) class330_sub36_sub5_170_).aClass84Array9665[i_171_]);
						if (((Class84) class84_180_).aClass330_Sub18_692 != class330_sub18)
							class84_180_ = null;
					}
					method4453(class330_sub18, class84, class84_180_, i_172_, i_173_, 0, bools, false, bool, 65535, null);
					Class84 class84_181_ = (((Class330_Sub36_Sub5) class330_sub36_sub5_174_).aClass84Array9665[i_175_]);
					Class84 class84_182_ = null;
					if (class330_sub36_sub5_176_ != null) {
						class84_182_ = (((Class330_Sub36_Sub5) class330_sub36_sub5_176_).aClass84Array9665[i_177_]);
						if (((Class84) class84_182_).aClass330_Sub18_692 != class330_sub18)
							class84_182_ = null;
					}
					method4470(0, new int[0], 0, 0, 0, 0, bool);
					method4453(((Class84) class84_181_).aClass330_Sub18_692, class84_181_, class84_182_, i_178_, i_179_, 0, bools, true, bool, 65535, null);
					ka();
					method4448();
				}
			}
		}
	}

	public abstract boolean method4458(int i, int i_183_, Class247 class247, boolean bool, int i_184_);

	public abstract void df(int i, int i_185_, int i_186_, int i_187_);

	public abstract int n();

	public abstract void ck(int i);

	public abstract int ya();

	public abstract int YA();

	public abstract int o();

	public abstract int AA();

	public abstract int ha();

	float[] method4459(int i, int i_188_, int i_189_, int i_190_, float f, float f_191_, float f_192_) {
		float[] fs = new float[9];
		float[] fs_193_ = new float[9];
		float f_194_ = (float) Math.cos((double) ((float) i_190_ * 0.024543693F));
		float f_195_ = (float) Math.sin((double) ((float) i_190_ * 0.024543693F));
		float f_196_ = 1.0F - f_194_;
		fs[0] = f_194_;
		fs[1] = 0.0F;
		fs[2] = f_195_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_195_;
		fs[7] = 0.0F;
		fs[8] = f_194_;
		float[] fs_197_ = new float[9];
		float f_198_ = 1.0F;
		float f_199_ = 0.0F;
		f_194_ = (float) i_188_ / 32767.0F;
		f_195_ = -(float) Math.sqrt((double) (1.0F - f_194_ * f_194_));
		f_196_ = 1.0F - f_194_;
		float f_200_ = (float) Math.sqrt((double) (i * i + i_189_ * i_189_));
		if (f_200_ == 0.0F && f_194_ == 0.0F)
			fs_193_ = fs;
		else {
			if (f_200_ != 0.0F) {
				f_198_ = (float) -i_189_ / f_200_;
				f_199_ = (float) i / f_200_;
			}
			fs_197_[0] = f_194_ + f_198_ * f_198_ * f_196_;
			fs_197_[1] = f_199_ * f_195_;
			fs_197_[2] = f_199_ * f_198_ * f_196_;
			fs_197_[3] = -f_199_ * f_195_;
			fs_197_[4] = f_194_;
			fs_197_[5] = f_198_ * f_195_;
			fs_197_[6] = f_198_ * f_199_ * f_196_;
			fs_197_[7] = -f_198_ * f_195_;
			fs_197_[8] = f_194_ + f_199_ * f_199_ * f_196_;
			fs_193_[0] = fs[0] * fs_197_[0] + fs[1] * fs_197_[3] + fs[2] * fs_197_[6];
			fs_193_[1] = fs[0] * fs_197_[1] + fs[1] * fs_197_[4] + fs[2] * fs_197_[7];
			fs_193_[2] = fs[0] * fs_197_[2] + fs[1] * fs_197_[5] + fs[2] * fs_197_[8];
			fs_193_[3] = fs[3] * fs_197_[0] + fs[4] * fs_197_[3] + fs[5] * fs_197_[6];
			fs_193_[4] = fs[3] * fs_197_[1] + fs[4] * fs_197_[4] + fs[5] * fs_197_[7];
			fs_193_[5] = fs[3] * fs_197_[2] + fs[4] * fs_197_[5] + fs[5] * fs_197_[8];
			fs_193_[6] = fs[6] * fs_197_[0] + fs[7] * fs_197_[3] + fs[8] * fs_197_[6];
			fs_193_[7] = fs[6] * fs_197_[1] + fs[7] * fs_197_[4] + fs[8] * fs_197_[7];
			fs_193_[8] = fs[6] * fs_197_[2] + fs[7] * fs_197_[5] + fs[8] * fs_197_[8];
		}
		fs_193_[0] *= f;
		fs_193_[1] *= f;
		fs_193_[2] *= f;
		fs_193_[3] *= f_191_;
		fs_193_[4] *= f_191_;
		fs_193_[5] *= f_191_;
		fs_193_[6] *= f_192_;
		fs_193_[7] *= f_192_;
		fs_193_[8] *= f_192_;
		return fs_193_;
	}

	public abstract void S(int i);

	public abstract void bg(int i);

	public abstract void method4460(byte i, byte[] is);

	public abstract void color(short i, short i_201_);

	public abstract void method4461(Class247 class247, Class80 class80, int i);

	public abstract void paintTexture(short i, short i_202_);

	public abstract void PA(int i, int i_203_, int i_204_, int i_205_);

	public abstract boolean method4462();

	public abstract boolean i();

	public abstract boolean u();

	public abstract void method4463(Class247 class247);

	public abstract Class93[] method4464();

	public abstract void da(short i, short i_206_);

	public abstract void method4465(Class247 class247);

	public abstract int cg();

	public abstract void method4466(Class387 class387_207_, int i, int i_208_, int i_209_, boolean bool);

	public abstract void method4467(Class387 class387_210_, int i, int i_211_, int i_212_, boolean bool);

	public abstract Class387 method4468(byte i, int i_213_, boolean bool);

	public abstract boolean method4469(int i, int i_214_, Class247 class247, boolean bool, int i_215_);

	public abstract void p(int i);

	public abstract int ar();

	public abstract int am();

	public abstract void ej();

	abstract void method4470(int i, int[] is, int i_216_, int i_217_, int i_218_, int i_219_, boolean bool);

	public abstract void ao(int i);

	public abstract int ct();

	public abstract void bs(int i);

	public abstract void au(int i);

	public abstract int RA();

	public abstract void bc(int i);

	public abstract void bf(int i);

	public abstract void bl(int i);

	public abstract void bk(int i);

	public abstract void br(int i);

	public abstract void bi(int i, int i_220_, int i_221_);

	public abstract void bz(int i, int i_222_, int i_223_);

	public abstract void bt(int i);

	public abstract boolean method4471();

	abstract void method4472();

	abstract void bx();

	abstract void method4473(int i, int[] is, int i_224_, int i_225_, int i_226_, int i_227_, boolean bool);

	abstract void method4474(int i, int[] is, int i_228_, int i_229_, int i_230_, int i_231_, boolean bool);

	public abstract void method4475(Class247 class247, Class80 class80, int i);

	public abstract Class93[] method4476();

	public abstract void method4477(Class247 class247, int i, boolean bool);

	public abstract void method4478(Class247 class247, int i, boolean bool);

	public abstract int cd();

	public abstract void by(int i, int i_232_, Class_xa class_xa, Class_xa class_xa_233_, int i_234_, int i_235_, int i_236_);

	public abstract int co();

	abstract void er(int i, int[] is, int i_237_, int i_238_, int i_239_, boolean bool, int i_240_, int[] is_241_);

	public abstract Class_na ce(Class_na class_na);

	public abstract int cz();

	public abstract int cj();

	public abstract void dm(int i, int i_242_, int i_243_, int i_244_);

	public abstract int cb();

	Class387() {
		/* empty */
	}

	public abstract void method4479();

	public abstract void method4480(Class387 class387_245_, int i, int i_246_, int i_247_, boolean bool);

	public abstract int cy();

	public abstract int cm();

	public abstract int cw();

	public abstract void method4481(Class247 class247, int i, boolean bool);

	public abstract int ci();

	public abstract void f(int i);

	public abstract int cr();

	abstract void ee(int i, int[] is, int i_248_, int i_249_, int i_250_, boolean bool, int i_251_, int[] is_252_);

	public abstract void Q(int i);

	public abstract void cl(int i);

	public abstract void cp(int i);

	public abstract void cf(int i);

	public abstract void cv(int i);

	public abstract int ca();

	abstract void e(int i, int[] is, int i_253_, int i_254_, int i_255_, boolean bool, int i_256_, int[] is_257_);

	public abstract int cx();

	public abstract int cc();

	public abstract int db();

	public abstract byte[] dg();

	public abstract byte[] dz();

	public abstract byte[] as();

	public abstract void method_do(short i, short i_258_);

	public abstract int Z();

	public abstract void dh(short i, short i_259_);

	public abstract void dt(short i, short i_260_);

	public abstract void dq(short i, short i_261_);

	public abstract void method4482(byte i, byte[] is);

	public abstract int cn();

	public abstract void dj(short i, short i_262_);

	public abstract void dl(short i, short i_263_);

	public abstract int ds();

	public abstract void du(int i, int i_264_, int i_265_, int i_266_);

	public abstract byte[] dr();

	public abstract Class93[] method4483();

	public abstract Class64[] method4484();

	public abstract Class64[] method4485();

	public abstract void method4486(byte i, byte[] is);

	public abstract boolean method4487();

	public abstract void method4488(Class247 class247, int i, boolean bool);

	public abstract boolean dw();

	public abstract boolean dp();

	public abstract void ed(int i);

	public abstract Class_na ga(Class_na class_na);

	public abstract boolean ew();

	public abstract boolean el();

	public abstract boolean em();

	abstract void method4489();

	abstract boolean ei();

	abstract void en(int i, int[] is, int i_267_, int i_268_, int i_269_, boolean bool, int i_270_, int[] is_271_);

	public abstract int av();

	public abstract void method4490(Class387 class387_272_, int i, int i_273_, int i_274_, boolean bool);

	public abstract void wa();

	public abstract void method4491();

	public abstract int cq();

	public abstract int cs();

	public abstract void be(int i, int i_275_, int i_276_);

	public abstract void cu(int i);

	void method4492(int i, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, float[] fs, float f, int i_282_, float f_283_, float[] fs_284_) {
		i -= i_279_;
		i_277_ -= i_280_;
		i_278_ -= i_281_;
		float f_285_ = ((float) i * fs[0] + (float) i_277_ * fs[1] + (float) i_278_ * fs[2]);
		float f_286_ = ((float) i * fs[3] + (float) i_277_ * fs[4] + (float) i_278_ * fs[5]);
		float f_287_ = ((float) i * fs[6] + (float) i_277_ * fs[7] + (float) i_278_ * fs[8]);
		float f_288_ = (((float) Math.atan2((double) f_285_, (double) f_287_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_288_ *= f;
		float f_289_ = f_286_ + 0.5F + f_283_;
		if (i_282_ == 1) {
			float f_290_ = f_288_;
			f_288_ = -f_289_;
			f_289_ = f_290_;
		} else if (i_282_ == 2) {
			f_288_ = -f_288_;
			f_289_ = -f_289_;
		} else if (i_282_ == 3) {
			float f_291_ = f_288_;
			f_288_ = f_289_;
			f_289_ = -f_291_;
		}
		fs_284_[0] = f_288_;
		fs_284_[1] = f_289_;
	}
}
