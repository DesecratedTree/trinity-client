/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class61 implements Interface30 {
	public abstract Interface8_Impl1_Impl2 method678();

	final void method679(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, Class_ta class_ta, int i, int i_5_) {
		method703(f, f_0_, f_1_, f_2_, f_3_, f_4_, 1, class_ta, i, i_5_);
	}

	public abstract void method680(int[] is);

	public abstract int method681();

	public abstract int method318();

	public abstract int method682();

	public abstract int method683();

	public abstract Interface8_Impl1_Impl2 method684();

	public abstract void method685(int i, int i_6_, int i_7_, int i_8_, int i_9_);

	public final void method686(float f, float f_10_, int i, int i_11_, int i_12_, int i_13_, int i_14_) {
		method697(f, f_10_, (float) method318() / 2.0F, (float) method683() / 2.0F, i, i_11_, i_12_, i_13_, i_14_);
	}

	public final void method687(int i, int i_15_) {
		method688(i, i_15_, 1, -1, 1);
	}

	public abstract void method688(int i, int i_16_, int i_17_, int i_18_, int i_19_);

	public abstract void method689(int i, int i_20_, Class_ta class_ta, int i_21_, int i_22_);

	public final void method690(int i, int i_23_, int i_24_, int i_25_) {
		method736(i, i_23_, i_24_, i_25_, 1, -1, 1, 1);
	}

	public final void method691(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		method736(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, 1);
	}

	public abstract void method692(int[] is);

	public abstract int method693();

	public abstract void method694(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_);

	public final void method695(float f, float f_38_, int i, int i_39_) {
		method697(f, f_38_, (float) method318() / 2.0F, (float) method683() / 2.0F, i, i_39_, 1, -1, 1);
	}

	public abstract int method696();

	final void method697(float f, float f_40_, float f_41_, float f_42_, int i, int i_43_, int i_44_, int i_45_, int i_46_) {
		if (i != 0) {
			double d = (double) (i_43_ & 0xffff) * 9.587379924285257E-5;
			float f_47_ = (float) Math.sin(d) * (float) i;
			float f_48_ = (float) Math.cos(d) * (float) i;
			float f_49_ = (-f_41_ * f_48_ + -f_42_ * f_47_) / 4096.0F + f;
			float f_50_ = (--f_41_ * f_47_ + -f_42_ * f_48_) / 4096.0F + f_40_;
			float f_51_ = ((((float) method318() - f_41_) * f_48_ + -f_42_ * f_47_) / 4096.0F + f);
			float f_52_ = ((-((float) method318() - f_41_) * f_47_ + -f_42_ * f_48_) / 4096.0F + f_40_);
			float f_53_ = ((-f_41_ * f_48_ + ((float) method683() - f_42_) * f_47_) / 4096.0F + f);
			float f_54_ = ((--f_41_ * f_47_ + ((float) method683() - f_42_) * f_48_) / 4096.0F + f_40_);
			method715(f_49_, f_50_, f_51_, f_52_, f_53_, f_54_, i_44_, i_45_, i_46_);
		}
	}

	public final void method698(float f, float f_55_, int i, int i_56_, Class_ta class_ta, int i_57_, int i_58_) {
		method734(f, f_55_, (float) method318() / 2.0F, (float) method683() / 2.0F, i, i_56_, class_ta, i_57_, i_58_);
	}

	public abstract int method699();

	public abstract void method700(int i, int i_59_, int i_60_, int i_61_, int i_62_);

	public abstract void method701(int i, int i_63_, int i_64_, int i_65_);

	public abstract int method702();

	abstract void method703(float f, float f_66_, float f_67_, float f_68_, float f_69_, float f_70_, int i, Class_ta class_ta, int i_71_, int i_72_);

	public abstract void method704(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_);

	public abstract void method705(int i, int i_78_, int i_79_);

	abstract void method706(int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_);

	public abstract Interface8_Impl1_Impl2 method707();

	Class61() {
		/* empty */
	}

	public abstract void method708(int i, int i_87_, Class_ta class_ta, int i_88_, int i_89_);

	abstract void method709(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_);

	abstract void method710(int i, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_);

	public abstract int method711();

	abstract void method712(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_);

	public abstract Interface8_Impl1_Impl2 method713();

	public abstract int method714();

	public final void method715(float f, float f_111_, float f_112_, float f_113_, float f_114_, float f_115_, int i, int i_116_, int i_117_) {
		method735(f, f_111_, f_112_, f_113_, f_114_, f_115_, i, i_116_, i_117_, 1);
	}

	public abstract int method716();

	public abstract void method717(int i, int i_118_, int i_119_, int i_120_);

	public abstract int method718();

	public abstract int method719();

	public abstract int method316();

	public abstract int method315();

	abstract void method720(float f, float f_121_, float f_122_, float f_123_, float f_124_, float f_125_, int i, Class_ta class_ta, int i_126_, int i_127_);

	public final void method721(int i, int i_128_, int i_129_, int i_130_) {
		method694(i, i_128_, i_129_, i_130_, 1, -1, 1);
	}

	public abstract void method722(int i, int i_131_, int i_132_);

	public abstract int method723();

	public abstract int method724();

	public abstract void method725(int i, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_);

	public abstract void method726(int i, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_);

	public abstract void method727(int i, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_);

	abstract void method728(float f, float f_151_, float f_152_, float f_153_, float f_154_, float f_155_, int i, int i_156_, int i_157_, int i_158_);

	public abstract Interface8_Impl1_Impl2 method729();

	abstract void method730(float f, float f_159_, float f_160_, float f_161_, float f_162_, float f_163_, int i, int i_164_, int i_165_, int i_166_);

	abstract void method731(float f, float f_167_, float f_168_, float f_169_, float f_170_, float f_171_, int i, Class_ta class_ta, int i_172_, int i_173_);

	abstract void method732(float f, float f_174_, float f_175_, float f_176_, float f_177_, float f_178_, int i, Class_ta class_ta, int i_179_, int i_180_);

	abstract void method733(float f, float f_181_, float f_182_, float f_183_, float f_184_, float f_185_, int i, Class_ta class_ta, int i_186_, int i_187_);

	public final void method734(float f, float f_188_, float f_189_, float f_190_, int i, int i_191_, Class_ta class_ta, int i_192_, int i_193_) {
		if (i != 0) {
			double d = (double) (i_191_ & 0xffff) * 9.587379924285257E-5;
			float f_194_ = (float) Math.sin(d) * (float) i;
			float f_195_ = (float) Math.cos(d) * (float) i;
			float f_196_ = (-f_189_ * f_195_ + -f_190_ * f_194_) / 4096.0F + f;
			float f_197_ = (--f_189_ * f_194_ + -f_190_ * f_195_) / 4096.0F + f_188_;
			float f_198_ = ((((float) method318() - f_189_) * f_195_ + -f_190_ * f_194_) / 4096.0F + f);
			float f_199_ = ((-((float) method318() - f_189_) * f_194_ + -f_190_ * f_195_) / 4096.0F + f_188_);
			float f_200_ = ((-f_189_ * f_195_ + ((float) method683() - f_190_) * f_194_) / 4096.0F + f);
			float f_201_ = ((--f_189_ * f_194_ + ((float) method683() - f_190_) * f_195_) / 4096.0F + f_188_);
			method679(f_196_, f_197_, f_198_, f_199_, f_200_, f_201_, class_ta, i_192_, i_193_);
		}
	}

	abstract void method735(float f, float f_202_, float f_203_, float f_204_, float f_205_, float f_206_, int i, int i_207_, int i_208_, int i_209_);

	abstract void method736(int i, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_);

	public abstract int method317();

	public abstract void method737(int i, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_);
}
