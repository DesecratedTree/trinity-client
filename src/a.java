/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class a implements Interface28 {
	long nativeid;
	ja aJa6929;
	Runnable aRunnable6930;
	Class249 aClass249_6931;
	h[] aHArray6932;
	h[] aHArray6933 = new h[7];

	native void ae(long l, long l_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean[][] bools);

	void method345() {
		((a) this).aRunnable6930 = Thread.currentThread();
		method346();
	}

	native void K(long l, Class_ra class_ra, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_);

	protected void finalize() {
		if (((a) this).nativeid != 0L)
			Class71.method827(this, 1121399368);
	}

	native void ha(long l, Class_ra class_ra, int i, int i_13_);

	public void ma(boolean bool) {
		R(((a) this).nativeid, bool);
	}

	native void R(long l, boolean bool);

	void method346() {
		JA(((a) this).nativeid);
	}

	native void JA(long l);

	native void ax(long l, long l_14_, long l_15_, int i, int i_16_, int i_17_, boolean bool);

	native void b(long l, Class_ra class_ra, int[] is, int[] is_18_, int[] is_19_, short[] is_20_, int i);

	void method347(Class_ra class_ra, int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		K(((a) this).nativeid, class_ra, i, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_);
	}

	void method348(Class_ra class_ra, int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		K(((a) this).nativeid, class_ra, i, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_);
	}

	void method349(Class_ra class_ra, int[] is, int[] is_33_, int[] is_34_, short[] is_35_, int i) {
		b(((a) this).nativeid, class_ra, is, is_33_, is_34_, is_35_, i);
	}

	native void aw(long l, Class_ra class_ra, int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_);

	void method350(Class387 class387, Class247 class247, int[] is, int i) {
		((a) this).aClass249_6931.method2508(class247);
		wa(((a) this).nativeid, ((h) (h) class387).nativeid, ((a) this).aClass249_6931.aFloatArray2631, is, i);
	}

	native void at(long l, Class_ra class_ra, int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_);

	boolean method351(Class387 class387, int i, int i_48_, Class247 class247, boolean bool) {
		((a) this).aClass249_6931.method2508(class247);
		return ya(((a) this).nativeid, ((h) (h) class387).nativeid, i, i_48_, ((a) this).aClass249_6931.aFloatArray2631, bool);
	}

	native void ar(long l, long l_49_, int i, int i_50_);

	void method352(Class387 class387, int[] is, Class247 class247) {
		((a) this).aClass249_6931.method2508(class247);
		J(((a) this).nativeid, ((h) (h) class387).nativeid, is, ((a) this).aClass249_6931.aFloatArray2631);
	}

	native void J(long l, long l_51_, int[] is, float[] fs);

	void method353() {
		if (((a) this).nativeid != 0L)
			Class71.method827(this, -25912037);
	}

	native void v(long l, long l_52_, int i, int i_53_);

	void method354(Class_xa class_xa, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, boolean[][] bools) {
		i(((a) this).nativeid, ((i) (i) class_xa).nativeid, i, i_54_, i_55_, i_56_, i_57_, i_58_, i_59_, bools);
	}

	Class387 method355(h var_h, byte i, int i_60_, boolean bool) {
		boolean bool_61_ = false;
		h var_h_62_;
		h var_h_63_;
		if (i > 0 && i <= 7) {
			var_h_63_ = ((a) this).aHArray6932[i - 1];
			var_h_62_ = ((a) this).aHArray6933[i - 1];
			bool_61_ = true;
		} else
			var_h_62_ = var_h_63_ = new h(((a) this).aJa6929);
		var_h.BA(var_h_62_, var_h_63_, i_60_, bool_61_, bool);
		((h) var_h_62_).aClass93Array6936 = ((h) var_h).aClass93Array6936;
		((h) var_h_62_).aClass64Array6937 = ((h) var_h).aClass64Array6937;
		return var_h_62_;
	}

	a(ja var_ja, int i, int i_64_) {
		((a) this).aHArray6932 = new h[7];
		((a) this).aJa6929 = var_ja;
		for (int i_65_ = 0; i_65_ < 7; i_65_++) {
			((a) this).aHArray6933[i_65_] = new h(((a) this).aJa6929);
			((a) this).aHArray6932[i_65_] = new h(((a) this).aJa6929);
		}
		((a) this).aClass249_6931 = new Class249();
		ha(((a) this).nativeid, var_ja, i, i_64_);
	}

	void method356() {
		if (((a) this).nativeid != 0L)
			Class71.method827(this, -110768144);
	}

	public void x(boolean bool) {
		R(((a) this).nativeid, bool);
	}

	void method357() {
		((a) this).aRunnable6930 = Thread.currentThread();
		method346();
	}

	void method358() {
		((a) this).aRunnable6930 = Thread.currentThread();
		method346();
	}

	void method359(Class_ra class_ra, int[] is, int[] is_66_, int[] is_67_, short[] is_68_, int i) {
		b(((a) this).nativeid, class_ra, is, is_66_, is_67_, is_68_, i);
	}

	Class387 method360(h var_h, byte i, int i_69_, boolean bool) {
		boolean bool_70_ = false;
		h var_h_71_;
		h var_h_72_;
		if (i > 0 && i <= 7) {
			var_h_72_ = ((a) this).aHArray6932[i - 1];
			var_h_71_ = ((a) this).aHArray6933[i - 1];
			bool_70_ = true;
		} else
			var_h_71_ = var_h_72_ = new h(((a) this).aJa6929);
		var_h.BA(var_h_71_, var_h_72_, i_69_, bool_70_, bool);
		((h) var_h_71_).aClass93Array6936 = ((h) var_h).aClass93Array6936;
		((h) var_h_71_).aClass64Array6937 = ((h) var_h).aClass64Array6937;
		return var_h_71_;
	}

	native boolean ya(long l, long l_73_, int i, int i_74_, float[] fs, boolean bool);

	native void P(long l, long l_75_, long l_76_, int i, int i_77_, int i_78_, boolean bool);

	native void e(long l, boolean bool);

	void method361(Class_ra class_ra, int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		K(((a) this).nativeid, class_ra, i, i_79_, i_80_, i_81_, i_82_, i_83_, i_84_);
	}

	void method362(Class_ra class_ra, int[] is, int[] is_85_, int[] is_86_, short[] is_87_, int i) {
		b(((a) this).nativeid, class_ra, is, is_85_, is_86_, is_87_, i);
	}

	native void ao(long l, long l_88_, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, boolean[][] bools);

	native void y(long l, Class_ra class_ra, int[] is, int[] is_95_, int[] is_96_, short[] is_97_, int i);

	native void i(long l, long l_98_, int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, boolean[][] bools);

	native void ak(long l, long l_105_, int[] is, float[] fs);

	void method363(Class_xa class_xa, int i, int i_106_) {
		v(((a) this).nativeid, ((i) (i) class_xa).nativeid, i, i_106_);
	}

	native void c(long l, Class_ra class_ra, int i, int i_107_);

	native void wa(long l, long l_108_, float[] fs, int[] is, int i);

	void method364(Class387 class387, Class387 class387_109_, int i, int i_110_, int i_111_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class387).nativeid, ((h) (h) class387_109_).nativeid, i, i_110_, i_111_, bool);
	}

	void method365(Class387 class387, Class387 class387_112_, int i, int i_113_, int i_114_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class387).nativeid, ((h) (h) class387_112_).nativeid, i, i_113_, i_114_, bool);
	}

	void method366(Class387 class387, Class387 class387_115_, int i, int i_116_, int i_117_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class387).nativeid, ((h) (h) class387_115_).nativeid, i, i_116_, i_117_, bool);
	}

	void method367(Class387 class387, Class387 class387_118_, int i, int i_119_, int i_120_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class387).nativeid, ((h) (h) class387_118_).nativeid, i, i_119_, i_120_, bool);
	}

	native void an(long l, long l_121_, float[] fs, int[] is, int i);

	void method368(Class387 class387, Class247 class247, int[] is, int i) {
		((a) this).aClass249_6931.method2508(class247);
		wa(((a) this).nativeid, ((h) (h) class387).nativeid, ((a) this).aClass249_6931.aFloatArray2631, is, i);
	}

	void method369(Class_ra class_ra, int[] is, int[] is_122_, int[] is_123_, short[] is_124_, int i) {
		b(((a) this).nativeid, class_ra, is, is_122_, is_123_, is_124_, i);
	}

	boolean method370(Class387 class387, int i, int i_125_, Class247 class247, boolean bool) {
		((a) this).aClass249_6931.method2508(class247);
		return ya(((a) this).nativeid, ((h) (h) class387).nativeid, i, i_125_, ((a) this).aClass249_6931.aFloatArray2631, bool);
	}

	void method371(Class387 class387, int[] is, Class247 class247) {
		((a) this).aClass249_6931.method2508(class247);
		J(((a) this).nativeid, ((h) (h) class387).nativeid, is, ((a) this).aClass249_6931.aFloatArray2631);
	}

	void method372(Class387 class387, int[] is, Class247 class247) {
		((a) this).aClass249_6931.method2508(class247);
		J(((a) this).nativeid, ((h) (h) class387).nativeid, is, ((a) this).aClass249_6931.aFloatArray2631);
	}

	native void ab(long l, long l_126_, int[] is, float[] fs);

	native void a(long l, boolean bool);

	void method373(Class_xa class_xa, int i, int i_127_) {
		v(((a) this).nativeid, ((i) (i) class_xa).nativeid, i, i_127_);
	}

	void method374(Class_xa class_xa, int i, int i_128_) {
		v(((a) this).nativeid, ((i) (i) class_xa).nativeid, i, i_128_);
	}

	native void ah(long l, long l_129_, int i, int i_130_);

	native void av(long l, long l_131_, int i, int i_132_);

	Class387 method375(h var_h, byte i, int i_133_, boolean bool) {
		boolean bool_134_ = false;
		h var_h_135_;
		h var_h_136_;
		if (i > 0 && i <= 7) {
			var_h_136_ = ((a) this).aHArray6932[i - 1];
			var_h_135_ = ((a) this).aHArray6933[i - 1];
			bool_134_ = true;
		} else
			var_h_135_ = var_h_136_ = new h(((a) this).aJa6929);
		var_h.BA(var_h_135_, var_h_136_, i_133_, bool_134_, bool);
		((h) var_h_135_).aClass93Array6936 = ((h) var_h).aClass93Array6936;
		((h) var_h_135_).aClass64Array6937 = ((h) var_h).aClass64Array6937;
		return var_h_135_;
	}

	native void am(long l, long l_137_, int i, int i_138_);

	native void au(long l, long l_139_, int i, int i_140_);

	void method376(Class387 class387, Class387 class387_141_, int i, int i_142_, int i_143_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class387).nativeid, ((h) (h) class387_141_).nativeid, i, i_142_, i_143_, bool);
	}

	native void ay(long l, Class_ra class_ra, int[] is, int[] is_144_, int[] is_145_, short[] is_146_, int i);

	native void bg(long l, long l_147_, int i, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, boolean[][] bools);
}
