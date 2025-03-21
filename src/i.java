/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class i extends Class_xa implements Interface28 {
	ja aJa6938;
	Class471 aClass471_6939 = new Class471();
	long nativeid;

	native void ar(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int[] is);

	native void G(ja var_ja, ba var_ba, int i, int i_5_, int[][] is, int[][] is_6_, int i_7_, int i_8_, int i_9_);

	protected void finalize() {
		if (((i) this).nativeid != 0L)
			Class71.method827(this, 242671403);
	}

	public native void ma(boolean bool);

	native void ak(ja var_ja, ba var_ba, int i, int i_10_, int[][] is, int[][] is_11_, int i_12_, int i_13_, int i_14_);

	public native Class_na y(int i, int i_15_, Class_na class_na);

	native void A(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int[] is);

	native void t(float[] fs);

	public void method6412(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean[][] bools) {
		((i) this).aJa6938.nd().method354(this, i, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, bools);
	}

	public void method6423(int i, int i_27_, int i_28_, boolean[][] bools, boolean bool, int i_29_) {
		int i_30_ = 0;
		float[] fs = new float[((i) this).aClass471_6939.method5875(-181868484)];
		for (Class330_Sub14 class330_sub14 = ((Class330_Sub14) ((i) this).aClass471_6939.method5869(539664854)); class330_sub14 != null; class330_sub14 = (Class330_Sub14) ((i) this).aClass471_6939.method5873((byte) -103))
			fs[i_30_++] = class330_sub14.method3317(1005991516);
		t(fs);
		for (int i_31_ = 0; i_31_ < i_28_ + i_28_; i_31_++) {
			for (int i_32_ = 0; i_32_ < i_28_ + i_28_; i_32_++) {
				if (bools[i_31_][i_32_]) {
					int i_33_ = i - i_28_ + i_31_;
					int i_34_ = i_27_ - i_28_ + i_32_;
					if (i_33_ >= 0 && i_33_ < anInt6397 * 1972554729 && i_34_ >= 0 && i_34_ < anInt6393 * 24567321)
						((i) this).aJa6938.nd().method363(this, i_33_, i_34_);
				}
			}
		}
	}

	public void method6415(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, boolean[][] bools) {
		((i) this).aJa6938.nd().method354(this, i, i_35_, i_36_, i_37_, i_38_, i_39_, i_40_, bools);
	}

	public native Class_na w(int i, int i_41_, Class_na class_na);

	public native void UA(Class_na class_na, int i, int i_42_, int i_43_, int i_44_, boolean bool);

	i(ja var_ja, ba var_ba, int i, int i_45_, int[][] is, int[][] is_46_, int i_47_, int i_48_, int i_49_) {
		super(i, i_45_, i_47_, is);
		((i) this).aJa6938 = var_ja;
		G(((i) this).aJa6938, var_ba, i, i_45_, anIntArrayArray6394, is_46_, i_47_, i_48_, i_49_);
	}

	public boolean method6418(Class_na class_na, int i, int i_50_, int i_51_, int i_52_, boolean bool) {
		return true;
	}

	public void method6420(Class330_Sub14 class330_sub14, int[] is) {
		((i) this).aClass471_6939.method5878(class330_sub14, (short) 8192);
		A(class330_sub14.hashCode(), class330_sub14.method3318(1015243074), class330_sub14.method3311((byte) 71), class330_sub14.method3312((short) -12371), class330_sub14.method3316((byte) 4), class330_sub14.method3313(-1097585580), is);
	}

	public native Class_na h(int i, int i_53_, Class_na class_na);

	native void az(int i, int i_54_, int[] is, int[] is_55_, int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, int[] is_61_, int i_62_, int i_63_, int i_64_, boolean bool);

	public native void n(int i, int i_65_, int i_66_);

	public native void LA(int i, int i_67_, int i_68_);

	public native void b(int i, int i_69_, int i_70_);

	public native void SA();

	native void ya(int i, int i_71_, int[] is, int[] is_72_, int[] is_73_, int[] is_74_, int[] is_75_, int[] is_76_, int[] is_77_, int[] is_78_, int i_79_, int i_80_, int i_81_, boolean bool);

	public final void method6422(int i, int i_82_, int[] is, int[] is_83_, int[] is_84_, int[] is_85_, int[] is_86_, int[] is_87_, int[] is_88_, int[] is_89_, Class77 class77, boolean bool) {
		ya(i, i_82_, is, is_83_, is_84_, is_85_, is_86_, is_87_, is_88_, is_89_, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375, bool);
	}

	public final void method6419(int i, int i_90_, int[] is, int[] is_91_, int[] is_92_, int[] is_93_, int[] is_94_, int[] is_95_, int[] is_96_, int[] is_97_, Class77 class77, boolean bool) {
		ya(i, i_90_, is, is_91_, is_92_, is_93_, is_94_, is_95_, is_96_, is_97_, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375, bool);
	}

	public native void d();

	public native void c();

	public void method6421(int i, int i_98_, int i_99_, boolean[][] bools, boolean bool, int i_100_) {
		int i_101_ = 0;
		float[] fs = new float[((i) this).aClass471_6939.method5875(801494646)];
		for (Class330_Sub14 class330_sub14 = ((Class330_Sub14) ((i) this).aClass471_6939.method5869(539664854)); class330_sub14 != null; class330_sub14 = (Class330_Sub14) ((i) this).aClass471_6939.method5873((byte) -81))
			fs[i_101_++] = class330_sub14.method3317(-786700961);
		t(fs);
		for (int i_102_ = 0; i_102_ < i_99_ + i_99_; i_102_++) {
			for (int i_103_ = 0; i_103_ < i_99_ + i_99_; i_103_++) {
				if (bools[i_102_][i_103_]) {
					int i_104_ = i - i_99_ + i_102_;
					int i_105_ = i_98_ - i_99_ + i_103_;
					if (i_104_ >= 0 && i_104_ < anInt6397 * 1972554729 && i_105_ >= 0 && i_105_ < anInt6393 * 24567321)
						((i) this).aJa6938.nd().method363(this, i_104_, i_105_);
				}
			}
		}
	}

	public native void NA(Class_na class_na, int i, int i_106_, int i_107_, int i_108_, boolean bool);

	public void method6428(int i, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, boolean[][] bools) {
		((i) this).aJa6938.nd().method354(this, i, i_109_, i_110_, i_111_, i_112_, i_113_, i_114_, bools);
	}

	public void method6414(int i, int i_115_, int[] is, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_, int[] is_121_, int[] is_122_, int[] is_123_, int[] is_124_, int[] is_125_, Class77 class77, boolean bool) {
		boolean bool_126_ = false;
		if (is_122_ != null) {
			int[] is_127_ = is_122_;
			for (int i_128_ = 0; i_128_ < is_127_.length; i_128_++) {
				int i_129_ = is_127_[i_128_];
				if (i_129_ != -1) {
					bool_126_ = true;
					break;
				}
			}
		}
		int i_130_ = is_122_.length;
		int[] is_131_ = new int[i_130_ * 3];
		int[] is_132_ = new int[i_130_ * 3];
		int[] is_133_ = new int[i_130_ * 3];
		int[] is_134_ = new int[i_130_ * 3];
		int[] is_135_ = new int[i_130_ * 3];
		int[] is_136_ = is_123_ != null ? new int[i_130_ * 3] : null;
		int[] is_137_ = is_116_ != null ? new int[i_130_ * 3] : null;
		int[] is_138_ = is_118_ != null ? new int[i_130_ * 3] : null;
		int i_139_ = 0;
		for (int i_140_ = 0; i_140_ < i_130_; i_140_++) {
			int i_141_ = is_119_[i_140_];
			int i_142_ = is_120_[i_140_];
			int i_143_ = is_121_[i_140_];
			is_131_[i_139_] = is[i_141_];
			is_132_[i_139_] = is_117_[i_141_];
			is_133_[i_139_] = is_122_[i_140_];
			is_134_[i_139_] = is_124_[i_140_];
			is_135_[i_139_] = is_125_[i_140_];
			if (is_123_ != null)
				is_136_[i_139_] = is_123_[i_140_];
			if (is_116_ != null)
				is_137_[i_139_] = is_116_[i_141_];
			if (is_118_ != null)
				is_138_[i_139_] = is_118_[i_141_];
			i_139_++;
			is_131_[i_139_] = is[i_142_];
			is_132_[i_139_] = is_117_[i_142_];
			is_133_[i_139_] = is_122_[i_140_];
			is_134_[i_139_] = is_124_[i_140_];
			is_135_[i_139_] = is_125_[i_140_];
			if (is_123_ != null)
				is_136_[i_139_] = is_123_[i_140_];
			if (is_116_ != null)
				is_137_[i_139_] = is_116_[i_142_];
			if (is_118_ != null)
				is_138_[i_139_] = is_118_[i_142_];
			i_139_++;
			is_131_[i_139_] = is[i_143_];
			is_132_[i_139_] = is_117_[i_143_];
			is_133_[i_139_] = is_122_[i_140_];
			is_134_[i_139_] = is_124_[i_140_];
			is_135_[i_139_] = is_125_[i_140_];
			if (is_123_ != null)
				is_136_[i_139_] = is_123_[i_140_];
			if (is_116_ != null)
				is_137_[i_139_] = is_116_[i_143_];
			if (is_118_ != null)
				is_138_[i_139_] = is_118_[i_143_];
			i_139_++;
		}
		if (bool_126_ || is_136_ != null)
			ya(i, i_115_, is_131_, is_137_, is_132_, is_138_, is_133_, is_136_, is_134_, is_135_, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375, bool);
	}

	public native void x(boolean bool);

	public boolean method6424(Class_na class_na, int i, int i_144_, int i_145_, int i_146_, boolean bool) {
		return true;
	}

	public native void ai(Class_na class_na, int i, int i_147_, int i_148_, int i_149_, boolean bool);

	public native void ac(Class_na class_na, int i, int i_150_, int i_151_, int i_152_, boolean bool);

	public native void al(Class_na class_na, int i, int i_153_, int i_154_, int i_155_, boolean bool);

	public final void method6425(int i, int i_156_, int[] is, int[] is_157_, int[] is_158_, int[] is_159_, int[] is_160_, int[] is_161_, int[] is_162_, int[] is_163_, Class77 class77, boolean bool) {
		ya(i, i_156_, is, is_157_, is_158_, is_159_, is_160_, is_161_, is_162_, is_163_, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375, bool);
	}

	public void method6427(Class330_Sub14 class330_sub14, int[] is) {
		((i) this).aClass471_6939.method5878(class330_sub14, (short) 8192);
		A(class330_sub14.hashCode(), class330_sub14.method3318(-609610609), class330_sub14.method3311((byte) -77), class330_sub14.method3312((short) 7995), class330_sub14.method3316((byte) -20), class330_sub14.method3313(-1641840770), is);
	}

	public void method6429(Class330_Sub14 class330_sub14, int[] is) {
		((i) this).aClass471_6939.method5878(class330_sub14, (short) 8192);
		A(class330_sub14.hashCode(), class330_sub14.method3318(-1449530980), class330_sub14.method3311((byte) -1), class330_sub14.method3312((short) 14945), class330_sub14.method3316((byte) -52), class330_sub14.method3313(-938611038), is);
	}

	void method6450() {
		if (((i) this).nativeid != 0L)
			Class71.method827(this, 1890972237);
	}

	void method6451() {
		if (((i) this).nativeid != 0L)
			Class71.method827(this, -1227547993);
	}

	public void method6426(Class330_Sub14 class330_sub14, int[] is) {
		((i) this).aClass471_6939.method5878(class330_sub14, (short) 8192);
		A(class330_sub14.hashCode(), class330_sub14.method3318(1533626295), class330_sub14.method3311((byte) 114), class330_sub14.method3312((short) 16690), class330_sub14.method3316((byte) 30), class330_sub14.method3313(-646407257), is);
	}

	public native void ay(Class_na class_na, int i, int i_164_, int i_165_, int i_166_, boolean bool);

	native void ag(ja var_ja, ba var_ba, int i, int i_167_, int[][] is, int[][] is_168_, int i_169_, int i_170_, int i_171_);

	public void method6411(int i, int i_172_, int[] is, int[] is_173_, int[] is_174_, int[] is_175_, int[] is_176_, int[] is_177_, int[] is_178_, int[] is_179_, int[] is_180_, int[] is_181_, int[] is_182_, Class77 class77, boolean bool) {
		boolean bool_183_ = false;
		if (is_179_ != null) {
			int[] is_184_ = is_179_;
			for (int i_185_ = 0; i_185_ < is_184_.length; i_185_++) {
				int i_186_ = is_184_[i_185_];
				if (i_186_ != -1) {
					bool_183_ = true;
					break;
				}
			}
		}
		int i_187_ = is_179_.length;
		int[] is_188_ = new int[i_187_ * 3];
		int[] is_189_ = new int[i_187_ * 3];
		int[] is_190_ = new int[i_187_ * 3];
		int[] is_191_ = new int[i_187_ * 3];
		int[] is_192_ = new int[i_187_ * 3];
		int[] is_193_ = is_180_ != null ? new int[i_187_ * 3] : null;
		int[] is_194_ = is_173_ != null ? new int[i_187_ * 3] : null;
		int[] is_195_ = is_175_ != null ? new int[i_187_ * 3] : null;
		int i_196_ = 0;
		for (int i_197_ = 0; i_197_ < i_187_; i_197_++) {
			int i_198_ = is_176_[i_197_];
			int i_199_ = is_177_[i_197_];
			int i_200_ = is_178_[i_197_];
			is_188_[i_196_] = is[i_198_];
			is_189_[i_196_] = is_174_[i_198_];
			is_190_[i_196_] = is_179_[i_197_];
			is_191_[i_196_] = is_181_[i_197_];
			is_192_[i_196_] = is_182_[i_197_];
			if (is_180_ != null)
				is_193_[i_196_] = is_180_[i_197_];
			if (is_173_ != null)
				is_194_[i_196_] = is_173_[i_198_];
			if (is_175_ != null)
				is_195_[i_196_] = is_175_[i_198_];
			i_196_++;
			is_188_[i_196_] = is[i_199_];
			is_189_[i_196_] = is_174_[i_199_];
			is_190_[i_196_] = is_179_[i_197_];
			is_191_[i_196_] = is_181_[i_197_];
			is_192_[i_196_] = is_182_[i_197_];
			if (is_180_ != null)
				is_193_[i_196_] = is_180_[i_197_];
			if (is_173_ != null)
				is_194_[i_196_] = is_173_[i_199_];
			if (is_175_ != null)
				is_195_[i_196_] = is_175_[i_199_];
			i_196_++;
			is_188_[i_196_] = is[i_200_];
			is_189_[i_196_] = is_174_[i_200_];
			is_190_[i_196_] = is_179_[i_197_];
			is_191_[i_196_] = is_181_[i_197_];
			is_192_[i_196_] = is_182_[i_197_];
			if (is_180_ != null)
				is_193_[i_196_] = is_180_[i_197_];
			if (is_173_ != null)
				is_194_[i_196_] = is_173_[i_200_];
			if (is_175_ != null)
				is_195_[i_196_] = is_175_[i_200_];
			i_196_++;
		}
		if (bool_183_ || is_193_ != null)
			ya(i, i_172_, is_188_, is_194_, is_189_, is_195_, is_190_, is_193_, is_191_, is_192_, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375, bool);
	}

	native void ah(int i, int i_201_, int[] is, int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, int[] is_208_, int i_209_, int i_210_, int i_211_, boolean bool);

	native void av(int i, int i_212_, int[] is, int[] is_213_, int[] is_214_, int[] is_215_, int[] is_216_, int[] is_217_, int[] is_218_, int[] is_219_, int i_220_, int i_221_, int i_222_, boolean bool);

	public native void l(int i, int i_223_, int i_224_);

	public void method6413(int i, int i_225_, int[] is, int[] is_226_, int[] is_227_, int[] is_228_, int[] is_229_, int[] is_230_, int[] is_231_, int[] is_232_, int[] is_233_, int[] is_234_, int[] is_235_, Class77 class77, boolean bool) {
		boolean bool_236_ = false;
		if (is_232_ != null) {
			int[] is_237_ = is_232_;
			for (int i_238_ = 0; i_238_ < is_237_.length; i_238_++) {
				int i_239_ = is_237_[i_238_];
				if (i_239_ != -1) {
					bool_236_ = true;
					break;
				}
			}
		}
		int i_240_ = is_232_.length;
		int[] is_241_ = new int[i_240_ * 3];
		int[] is_242_ = new int[i_240_ * 3];
		int[] is_243_ = new int[i_240_ * 3];
		int[] is_244_ = new int[i_240_ * 3];
		int[] is_245_ = new int[i_240_ * 3];
		int[] is_246_ = is_233_ != null ? new int[i_240_ * 3] : null;
		int[] is_247_ = is_226_ != null ? new int[i_240_ * 3] : null;
		int[] is_248_ = is_228_ != null ? new int[i_240_ * 3] : null;
		int i_249_ = 0;
		for (int i_250_ = 0; i_250_ < i_240_; i_250_++) {
			int i_251_ = is_229_[i_250_];
			int i_252_ = is_230_[i_250_];
			int i_253_ = is_231_[i_250_];
			is_241_[i_249_] = is[i_251_];
			is_242_[i_249_] = is_227_[i_251_];
			is_243_[i_249_] = is_232_[i_250_];
			is_244_[i_249_] = is_234_[i_250_];
			is_245_[i_249_] = is_235_[i_250_];
			if (is_233_ != null)
				is_246_[i_249_] = is_233_[i_250_];
			if (is_226_ != null)
				is_247_[i_249_] = is_226_[i_251_];
			if (is_228_ != null)
				is_248_[i_249_] = is_228_[i_251_];
			i_249_++;
			is_241_[i_249_] = is[i_252_];
			is_242_[i_249_] = is_227_[i_252_];
			is_243_[i_249_] = is_232_[i_250_];
			is_244_[i_249_] = is_234_[i_250_];
			is_245_[i_249_] = is_235_[i_250_];
			if (is_233_ != null)
				is_246_[i_249_] = is_233_[i_250_];
			if (is_226_ != null)
				is_247_[i_249_] = is_226_[i_252_];
			if (is_228_ != null)
				is_248_[i_249_] = is_228_[i_252_];
			i_249_++;
			is_241_[i_249_] = is[i_253_];
			is_242_[i_249_] = is_227_[i_253_];
			is_243_[i_249_] = is_232_[i_250_];
			is_244_[i_249_] = is_234_[i_250_];
			is_245_[i_249_] = is_235_[i_250_];
			if (is_233_ != null)
				is_246_[i_249_] = is_233_[i_250_];
			if (is_226_ != null)
				is_247_[i_249_] = is_226_[i_253_];
			if (is_228_ != null)
				is_248_[i_249_] = is_228_[i_253_];
			i_249_++;
		}
		if (bool_236_ || is_246_ != null)
			ya(i, i_225_, is_241_, is_247_, is_242_, is_248_, is_243_, is_246_, is_244_, is_245_, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375, bool);
	}

	public native void aj(Class_na class_na, int i, int i_254_, int i_255_, int i_256_, boolean bool);

	public native void as(Class_na class_na, int i, int i_257_, int i_258_, int i_259_, boolean bool);

	native void am(int i, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_, int[] is);

	native void au(int i, int i_265_, int i_266_, int i_267_, int i_268_, int i_269_, int[] is);

	native void ae(float[] fs);

	native void ao(float[] fs);

	native void bg(float[] fs);
}
