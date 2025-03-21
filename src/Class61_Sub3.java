/* Class61_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class61_Sub3 extends Class61 {
	static int anInt9323;
	static int anInt9324;
	int anInt9325;
	static int anInt9326;
	int anInt9327;
	int anInt9328;
	static int anInt9329;
	int[] anIntArray9330;
	static int anInt9331 = 12;
	static int anInt9332 = 8;
	static int anInt9333;
	static int anInt9334;
	static int anInt9335;
	static int anInt9336;
	int anInt9337;
	static int anInt9338;
	static int anInt9339;
	static int anInt9340;
	static int anInt9341;
	static int anInt9342;
	static int anInt9343;
	static int anInt9344;
	static int anInt9345 = 4;
	static int anInt9346;
	static int anInt9347;
	static int anInt9348;
	static int anInt9349;
	static int anInt9350;
	static int anInt9351 = 0;
	int anInt9352;
	static int anInt9353;
	static int anInt9354;
	Class_ra_Sub3 aClass_ra_Sub3_9355;
	static int anInt9356;
	static int anInt9357;
	int anInt9358;

	static {
		anInt9335 = 0;
		anInt9353 = 0;
		anInt9354 = 0;
		anInt9333 = 0;
		anInt9329 = 0;
		anInt9357 = 0;
		anInt9323 = 0;
	}

	public void method717(int i, int i_0_, int i_1_, int i_2_) {
		((Class61_Sub3) this).anInt9352 = i;
		((Class61_Sub3) this).anInt9327 = i_0_;
		((Class61_Sub3) this).anInt9328 = i_1_;
		((Class61_Sub3) this).anInt9337 = i_2_;
	}

	public int method711() {
		return (((Class61_Sub3) this).anInt9327 + ((Class61_Sub3) this).anInt9325 + ((Class61_Sub3) this).anInt9337);
	}

	public int method681() {
		return ((Class61_Sub3) this).anInt9358;
	}

	public int method682() {
		return ((Class61_Sub3) this).anInt9325;
	}

	public int method318() {
		return (((Class61_Sub3) this).anInt9352 + ((Class61_Sub3) this).anInt9358 + ((Class61_Sub3) this).anInt9328);
	}

	public int method683() {
		return (((Class61_Sub3) this).anInt9327 + ((Class61_Sub3) this).anInt9325 + ((Class61_Sub3) this).anInt9337);
	}

	public abstract void method688(int i, int i_3_, int i_4_, int i_5_, int i_6_);

	public abstract void method689(int i, int i_7_, Class_ta class_ta, int i_8_, int i_9_);

	public void method701(int i, int i_10_, int i_11_, int i_12_) {
		((Class61_Sub3) this).anInt9352 = i;
		((Class61_Sub3) this).anInt9327 = i_10_;
		((Class61_Sub3) this).anInt9328 = i_11_;
		((Class61_Sub3) this).anInt9337 = i_12_;
	}

	abstract void method742(boolean bool, boolean bool_13_, boolean bool_14_, int i, int i_15_, float f, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, boolean bool_22_);

	public void method694(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (((Class61_Sub3) this).anIntArray9330 == null)
			((Class61_Sub3) this).anIntArray9330 = new int[4];
		((Class61_Sub3) this).aClass_ra_Sub3_9355.qa(((Class61_Sub3) this).anIntArray9330);
		((Class61_Sub3) this).aClass_ra_Sub3_9355.o((((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825, (((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481, i + i_24_, i_23_ + i_25_);
		int i_29_ = method318();
		int i_30_ = method683();
		int i_31_ = (i_24_ + i_29_ - 1) / i_29_;
		int i_32_ = (i_25_ + i_30_ - 1) / i_30_;
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
			int i_34_ = i_33_ * i_30_;
			for (int i_35_ = 0; i_35_ < i_31_; i_35_++)
				method688(i + i_35_ * i_29_, i_23_ + i_34_, i_26_, i_27_, i_28_);
		}
		((Class61_Sub3) this).aClass_ra_Sub3_9355.r(((Class61_Sub3) this).anIntArray9330[0], ((Class61_Sub3) this).anIntArray9330[1], ((Class61_Sub3) this).anIntArray9330[2], ((Class61_Sub3) this).anIntArray9330[3]);
	}

	boolean method743(float f, float f_36_, float f_37_, float f_38_, float f_39_, float f_40_) {
		int i = (((Class61_Sub3) this).anInt9352 + ((Class61_Sub3) this).anInt9358 + ((Class61_Sub3) this).anInt9328);
		int i_41_ = (((Class61_Sub3) this).anInt9327 + ((Class61_Sub3) this).anInt9325 + ((Class61_Sub3) this).anInt9337);
		if (i != ((Class61_Sub3) this).anInt9358 || i_41_ != ((Class61_Sub3) this).anInt9325) {
			float f_42_ = (f_37_ - f) / (float) i;
			float f_43_ = (f_38_ - f_36_) / (float) i;
			float f_44_ = (f_39_ - f) / (float) i_41_;
			float f_45_ = (f_40_ - f_36_) / (float) i_41_;
			float f_46_ = f_44_ * (float) ((Class61_Sub3) this).anInt9327;
			float f_47_ = f_45_ * (float) ((Class61_Sub3) this).anInt9327;
			float f_48_ = f_42_ * (float) ((Class61_Sub3) this).anInt9352;
			float f_49_ = f_43_ * (float) ((Class61_Sub3) this).anInt9352;
			float f_50_ = -f_42_ * (float) ((Class61_Sub3) this).anInt9328;
			float f_51_ = -f_43_ * (float) ((Class61_Sub3) this).anInt9328;
			float f_52_ = -f_44_ * (float) ((Class61_Sub3) this).anInt9337;
			float f_53_ = -f_45_ * (float) ((Class61_Sub3) this).anInt9337;
			f += f_48_ + f_46_;
			f_36_ += f_49_ + f_47_;
			f_37_ += f_50_ + f_46_;
			f_38_ += f_51_ + f_47_;
			f_39_ += f_48_ + f_52_;
			f_40_ += f_49_ + f_53_;
		}
		float f_54_ = f_39_ + (f_37_ - f);
		float f_55_ = f_38_ + (f_40_ - f_36_);
		float f_56_;
		float f_57_;
		if (f < f_37_) {
			f_56_ = f;
			f_57_ = f_37_;
		} else {
			f_56_ = f_37_;
			f_57_ = f;
		}
		if (f_39_ < f_56_)
			f_56_ = f_39_;
		if (f_54_ < f_56_)
			f_56_ = f_54_;
		if (f_39_ > f_57_)
			f_57_ = f_39_;
		if (f_54_ > f_57_)
			f_57_ = f_54_;
		float f_58_;
		float f_59_;
		if (f_36_ < f_38_) {
			f_58_ = f_36_;
			f_59_ = f_38_;
		} else {
			f_58_ = f_38_;
			f_59_ = f_36_;
		}
		if (f_40_ < f_58_)
			f_58_ = f_40_;
		if (f_55_ < f_58_)
			f_58_ = f_55_;
		if (f_40_ > f_59_)
			f_59_ = f_40_;
		if (f_55_ > f_59_)
			f_59_ = f_55_;
		if (f_56_ < (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825))
			f_56_ = (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8621 * 512290825);
		if (f_57_ > (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8635 * -1071049483))
			f_57_ = (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8635 * -1071049483);
		if (f_58_ < (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481))
			f_58_ = (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8623 * -1679642481);
		if (f_59_ > (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541))
			f_59_ = (float) (((Class_ra_Sub3) (((Class61_Sub3) this).aClass_ra_Sub3_9355)).anInt8624 * 31822541);
		f_57_ = f_56_ - f_57_;
		if (f_57_ >= 0.0F)
			return false;
		f_59_ = f_58_ - f_59_;
		if (f_59_ >= 0.0F)
			return false;
		anInt9338 = (((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8618) * -1504772933;
		anInt9339 = (int) ((float) ((int) f_58_ * anInt9338) + f_56_);
		float f_60_ = (f_37_ - f) * (f_40_ - f_36_) - (f_38_ - f_36_) * (f_39_ - f);
		float f_61_ = (f_39_ - f) * (f_38_ - f_36_) - (f_40_ - f_36_) * (f_37_ - f);
		anInt9340 = (int) ((f_40_ - f_36_) * 4096.0F * (float) ((Class61_Sub3) this).anInt9358 / f_60_);
		anInt9341 = (int) ((f_38_ - f_36_) * 4096.0F * (float) ((Class61_Sub3) this).anInt9325 / f_61_);
		anInt9342 = (int) ((f_39_ - f) * 4096.0F * (float) ((Class61_Sub3) this).anInt9358 / f_61_);
		anInt9343 = (int) ((f_37_ - f) * 4096.0F * (float) ((Class61_Sub3) this).anInt9325 / f_60_);
		anInt9344 = (int) (f_56_ * 16.0F + 8.0F - (f + f_37_ + f_39_ + f_54_) / 4.0F * 16.0F);
		anInt9326 = (int) (f_58_ * 16.0F + 8.0F - (f_36_ + f_38_ + f_40_ + f_55_) / 4.0F * 16.0F);
		anInt9346 = ((((Class61_Sub3) this).anInt9358 >> 1 << 12) + (anInt9326 * anInt9342 >> 4));
		anInt9324 = ((((Class61_Sub3) this).anInt9325 >> 1 << 12) + (anInt9326 * anInt9343 >> 4));
		anInt9348 = anInt9344 * anInt9340 >> 4;
		anInt9349 = anInt9344 * anInt9341 >> 4;
		anInt9334 = (int) f_56_;
		anInt9347 = (int) f_57_;
		anInt9336 = (int) f_58_;
		anInt9356 = (int) f_59_;
		return true;
	}

	public void method726(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (((Class61_Sub3) this).anIntArray9330 == null)
			((Class61_Sub3) this).anIntArray9330 = new int[4];
		((Class61_Sub3) this).aClass_ra_Sub3_9355.qa(((Class61_Sub3) this).anIntArray9330);
		((Class61_Sub3) this).aClass_ra_Sub3_9355.o((((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825, (((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481, i + i_63_, i_62_ + i_64_);
		int i_68_ = method318();
		int i_69_ = method683();
		int i_70_ = (i_63_ + i_68_ - 1) / i_68_;
		int i_71_ = (i_64_ + i_69_ - 1) / i_69_;
		for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
			int i_73_ = i_72_ * i_69_;
			for (int i_74_ = 0; i_74_ < i_70_; i_74_++)
				method688(i + i_74_ * i_68_, i_62_ + i_73_, i_65_, i_66_, i_67_);
		}
		((Class61_Sub3) this).aClass_ra_Sub3_9355.r(((Class61_Sub3) this).anIntArray9330[0], ((Class61_Sub3) this).anIntArray9330[1], ((Class61_Sub3) this).anIntArray9330[2], ((Class61_Sub3) this).anIntArray9330[3]);
	}

	public void method680(int[] is) {
		is[0] = ((Class61_Sub3) this).anInt9352;
		is[1] = ((Class61_Sub3) this).anInt9327;
		is[2] = ((Class61_Sub3) this).anInt9328;
		is[3] = ((Class61_Sub3) this).anInt9337;
	}

	abstract void method744(boolean bool, boolean bool_75_, boolean bool_76_, int i, int i_77_, float f, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, boolean bool_84_);

	void method730(float f, float f_85_, float f_86_, float f_87_, float f_88_, float f_89_, int i, int i_90_, int i_91_, int i_92_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_85_, f_86_, f_87_, f_88_, f_89_)) {
			anInt9350 = i_90_;
			if (i != 1) {
				anInt9351 = i_90_ >>> 24;
				anInt9335 = 256 - anInt9351;
				if (i == 0) {
					anInt9353 = (i_90_ & 0xff0000) >> 16;
					anInt9354 = (i_90_ & 0xff00) >> 8;
					anInt9333 = i_90_ & 0xff;
				} else if (i == 2) {
					anInt9329 = i_90_ >>> 24;
					anInt9357 = 256 - anInt9329;
					int i_93_ = (i_90_ & 0xff00ff) * anInt9357 & ~0xff00ff;
					int i_94_ = (i_90_ & 0xff00) * anInt9357 & 0xff0000;
					anInt9323 = (i_93_ | i_94_) >>> 8;
				}
			}
			method756(i, i_91_);
		}
	}

	abstract void method745(int[] is, int[] is_95_, int i, int i_96_);

	public abstract void method685(int i, int i_97_, int i_98_, int i_99_, int i_100_);

	abstract void method746(int[] is, int[] is_101_, int i, int i_102_);

	abstract void method709(int i, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_);

	abstract void method710(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_);

	abstract void method706(int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_);

	abstract void method712(int i, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_);

	abstract void method747(boolean bool, boolean bool_131_, boolean bool_132_, int i, int i_133_, float f, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, boolean bool_140_);

	abstract void method736(int i, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_);

	public int method702() {
		return ((Class61_Sub3) this).anInt9358;
	}

	abstract void method748(boolean bool, boolean bool_148_, boolean bool_149_, int i, int i_150_, float f, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, boolean bool_157_);

	abstract void method749(boolean bool, boolean bool_158_, boolean bool_159_, int i, int i_160_, float f, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, boolean bool_167_);

	public abstract void method708(int i, int i_168_, Class_ta class_ta, int i_169_, int i_170_);

	abstract void method750(int i, int i_171_);

	void method732(float f, float f_172_, float f_173_, float f_174_, float f_175_, float f_176_, int i, Class_ta class_ta, int i_177_, int i_178_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_172_, f_173_, f_174_, f_175_, f_176_)) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			method745(((Class_ta_Sub3) class_ta_sub3).anIntArray8661, ((Class_ta_Sub3) class_ta_sub3).anIntArray8662, anInt9334 - i_177_, -i_178_ - (anInt9356 - anInt9336));
		}
	}

	abstract void method751(int[] is, int[] is_179_, int i, int i_180_);

	abstract void method752(int[] is, int[] is_181_, int i, int i_182_);

	abstract void method753(int[] is, int[] is_183_, int i, int i_184_);

	abstract void method754(boolean bool, boolean bool_185_, boolean bool_186_, int i, int i_187_, float f, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_, boolean bool_194_);

	abstract void method755(int i, int i_195_);

	public int method714() {
		return ((Class61_Sub3) this).anInt9358;
	}

	public int method699() {
		return ((Class61_Sub3) this).anInt9358;
	}

	public int method716() {
		return ((Class61_Sub3) this).anInt9358;
	}

	public int method693() {
		return ((Class61_Sub3) this).anInt9325;
	}

	public int method718() {
		return ((Class61_Sub3) this).anInt9325;
	}

	public int method719() {
		return ((Class61_Sub3) this).anInt9325;
	}

	public int method316() {
		return (((Class61_Sub3) this).anInt9352 + ((Class61_Sub3) this).anInt9358 + ((Class61_Sub3) this).anInt9328);
	}

	public int method315() {
		return (((Class61_Sub3) this).anInt9352 + ((Class61_Sub3) this).anInt9358 + ((Class61_Sub3) this).anInt9328);
	}

	abstract void method756(int i, int i_196_);

	public abstract void method700(int i, int i_197_, int i_198_, int i_199_, int i_200_);

	public int method724() {
		return (((Class61_Sub3) this).anInt9327 + ((Class61_Sub3) this).anInt9325 + ((Class61_Sub3) this).anInt9337);
	}

	public int method723() {
		return (((Class61_Sub3) this).anInt9327 + ((Class61_Sub3) this).anInt9325 + ((Class61_Sub3) this).anInt9337);
	}

	public int method317() {
		return (((Class61_Sub3) this).anInt9352 + ((Class61_Sub3) this).anInt9358 + ((Class61_Sub3) this).anInt9328);
	}

	public void method725(int i, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (((Class61_Sub3) this).anIntArray9330 == null)
			((Class61_Sub3) this).anIntArray9330 = new int[4];
		((Class61_Sub3) this).aClass_ra_Sub3_9355.qa(((Class61_Sub3) this).anIntArray9330);
		((Class61_Sub3) this).aClass_ra_Sub3_9355.o((((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825, (((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481, i + i_202_, i_201_ + i_203_);
		int i_207_ = method318();
		int i_208_ = method683();
		int i_209_ = (i_202_ + i_207_ - 1) / i_207_;
		int i_210_ = (i_203_ + i_208_ - 1) / i_208_;
		for (int i_211_ = 0; i_211_ < i_210_; i_211_++) {
			int i_212_ = i_211_ * i_208_;
			for (int i_213_ = 0; i_213_ < i_209_; i_213_++)
				method688(i + i_213_ * i_207_, i_201_ + i_212_, i_204_, i_205_, i_206_);
		}
		((Class61_Sub3) this).aClass_ra_Sub3_9355.r(((Class61_Sub3) this).anIntArray9330[0], ((Class61_Sub3) this).anIntArray9330[1], ((Class61_Sub3) this).anIntArray9330[2], ((Class61_Sub3) this).anIntArray9330[3]);
	}

	void method733(float f, float f_214_, float f_215_, float f_216_, float f_217_, float f_218_, int i, Class_ta class_ta, int i_219_, int i_220_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_214_, f_215_, f_216_, f_217_, f_218_)) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			method745(((Class_ta_Sub3) class_ta_sub3).anIntArray8661, ((Class_ta_Sub3) class_ta_sub3).anIntArray8662, anInt9334 - i_219_, -i_220_ - (anInt9356 - anInt9336));
		}
	}

	public void method727(int i, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (((Class61_Sub3) this).anIntArray9330 == null)
			((Class61_Sub3) this).anIntArray9330 = new int[4];
		((Class61_Sub3) this).aClass_ra_Sub3_9355.qa(((Class61_Sub3) this).anIntArray9330);
		((Class61_Sub3) this).aClass_ra_Sub3_9355.o((((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8621) * 512290825, (((Class_ra_Sub3) ((Class61_Sub3) this).aClass_ra_Sub3_9355).anInt8623) * -1679642481, i + i_222_, i_221_ + i_223_);
		int i_227_ = method318();
		int i_228_ = method683();
		int i_229_ = (i_222_ + i_227_ - 1) / i_227_;
		int i_230_ = (i_223_ + i_228_ - 1) / i_228_;
		for (int i_231_ = 0; i_231_ < i_230_; i_231_++) {
			int i_232_ = i_231_ * i_228_;
			for (int i_233_ = 0; i_233_ < i_229_; i_233_++)
				method688(i + i_233_ * i_227_, i_221_ + i_232_, i_224_, i_225_, i_226_);
		}
		((Class61_Sub3) this).aClass_ra_Sub3_9355.r(((Class61_Sub3) this).anIntArray9330[0], ((Class61_Sub3) this).anIntArray9330[1], ((Class61_Sub3) this).anIntArray9330[2], ((Class61_Sub3) this).anIntArray9330[3]);
	}

	void method703(float f, float f_234_, float f_235_, float f_236_, float f_237_, float f_238_, int i, Class_ta class_ta, int i_239_, int i_240_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_234_, f_235_, f_236_, f_237_, f_238_)) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			method745(((Class_ta_Sub3) class_ta_sub3).anIntArray8661, ((Class_ta_Sub3) class_ta_sub3).anIntArray8662, anInt9334 - i_239_, -i_240_ - (anInt9356 - anInt9336));
		}
	}

	Class61_Sub3(Class_ra_Sub3 class_ra_sub3, int i, int i_241_) {
		((Class61_Sub3) this).aClass_ra_Sub3_9355 = class_ra_sub3;
		((Class61_Sub3) this).anInt9358 = i;
		((Class61_Sub3) this).anInt9325 = i_241_;
	}

	void method728(float f, float f_242_, float f_243_, float f_244_, float f_245_, float f_246_, int i, int i_247_, int i_248_, int i_249_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_242_, f_243_, f_244_, f_245_, f_246_)) {
			anInt9350 = i_247_;
			if (i != 1) {
				anInt9351 = i_247_ >>> 24;
				anInt9335 = 256 - anInt9351;
				if (i == 0) {
					anInt9353 = (i_247_ & 0xff0000) >> 16;
					anInt9354 = (i_247_ & 0xff00) >> 8;
					anInt9333 = i_247_ & 0xff;
				} else if (i == 2) {
					anInt9329 = i_247_ >>> 24;
					anInt9357 = 256 - anInt9329;
					int i_250_ = (i_247_ & 0xff00ff) * anInt9357 & ~0xff00ff;
					int i_251_ = (i_247_ & 0xff00) * anInt9357 & 0xff0000;
					anInt9323 = (i_250_ | i_251_) >>> 8;
				}
			}
			method756(i, i_248_);
		}
	}

	public void method692(int[] is) {
		is[0] = ((Class61_Sub3) this).anInt9352;
		is[1] = ((Class61_Sub3) this).anInt9327;
		is[2] = ((Class61_Sub3) this).anInt9328;
		is[3] = ((Class61_Sub3) this).anInt9337;
	}

	void method720(float f, float f_252_, float f_253_, float f_254_, float f_255_, float f_256_, int i, Class_ta class_ta, int i_257_, int i_258_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_252_, f_253_, f_254_, f_255_, f_256_)) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			method745(((Class_ta_Sub3) class_ta_sub3).anIntArray8661, ((Class_ta_Sub3) class_ta_sub3).anIntArray8662, anInt9334 - i_257_, -i_258_ - (anInt9356 - anInt9336));
		}
	}

	void method731(float f, float f_259_, float f_260_, float f_261_, float f_262_, float f_263_, int i, Class_ta class_ta, int i_264_, int i_265_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_259_, f_260_, f_261_, f_262_, f_263_)) {
			Class_ta_Sub3 class_ta_sub3 = (Class_ta_Sub3) class_ta;
			method745(((Class_ta_Sub3) class_ta_sub3).anIntArray8661, ((Class_ta_Sub3) class_ta_sub3).anIntArray8662, anInt9334 - i_264_, -i_265_ - (anInt9356 - anInt9336));
		}
	}

	void method735(float f, float f_266_, float f_267_, float f_268_, float f_269_, float f_270_, int i, int i_271_, int i_272_, int i_273_) {
		if (((Class61_Sub3) this).aClass_ra_Sub3_9355.method5187())
			throw new IllegalStateException();
		if (method743(f, f_266_, f_267_, f_268_, f_269_, f_270_)) {
			anInt9350 = i_271_;
			if (i != 1) {
				anInt9351 = i_271_ >>> 24;
				anInt9335 = 256 - anInt9351;
				if (i == 0) {
					anInt9353 = (i_271_ & 0xff0000) >> 16;
					anInt9354 = (i_271_ & 0xff00) >> 8;
					anInt9333 = i_271_ & 0xff;
				} else if (i == 2) {
					anInt9329 = i_271_ >>> 24;
					anInt9357 = 256 - anInt9329;
					int i_274_ = (i_271_ & 0xff00ff) * anInt9357 & ~0xff00ff;
					int i_275_ = (i_271_ & 0xff00) * anInt9357 & 0xff0000;
					anInt9323 = (i_274_ | i_275_) >>> 8;
				}
			}
			method756(i, i_272_);
		}
	}

	public int method696() {
		return (((Class61_Sub3) this).anInt9327 + ((Class61_Sub3) this).anInt9325 + ((Class61_Sub3) this).anInt9337);
	}
}
