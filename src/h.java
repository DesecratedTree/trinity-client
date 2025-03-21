/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class h extends Class387 implements Interface28 {
	ja aJa6934;
	long nativeid;
	ba aBa6935;
	Class93[] aClass93Array6936;
	Class64[] aClass64Array6937;

	public void method4486(byte i, byte[] is) {
		IA(i, is);
	}

	public native void p(int i);

	native void U(ja var_ja, ba var_ba, int i, int i_0_, int[] is, int[] is_1_, int[] is_2_, int[] is_3_, short[] is_4_, int i_5_, short[] is_6_, short[] is_7_, short[] is_8_, byte[] is_9_, byte[] is_10_, byte[] is_11_, byte[] is_12_, short[] is_13_, short[] is_14_, int[] is_15_, byte i_16_, short[] is_17_, int i_18_, byte[] is_19_, short[] is_20_, short[] is_21_, short[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, byte[] is_26_, byte[] is_27_, int[] is_28_, int[] is_29_, int[] is_30_, int[] is_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int[] is_38_);

	public native byte[] dg();

	protected void finalize() {
		if (((h) this).nativeid != 0L)
			Class71.method827(this, -80632000);
	}

	public native void x(boolean bool);

	public native boolean em();

	public void method4461(Class247 class247, Class80 class80, int i) {
		if (class80 == null)
			((h) this).aJa6934.nd().method350(this, class247, null, i);
		else {
			ja.anIntArray6962[5] = 0;
			((h) this).aJa6934.nd().method350(this, class247, ja.anIntArray6962, i);
			class80.anInt669 = ja.anIntArray6962[0];
			class80.anInt670 = ja.anIntArray6962[1];
			class80.anInt668 = ja.anIntArray6962[2];
			class80.anInt672 = ja.anIntArray6962[3];
			class80.anInt673 = ja.anIntArray6962[4];
			class80.aBoolean671 = ja.anIntArray6962[5] != 0;
		}
	}

	public Class387 method4446(byte i, int i_39_, boolean bool) {
		return ((h) this).aJa6934.nd().method355(this, i, i_39_, bool);
	}

	native void BA(h var_h_40_, h var_h_41_, int i, boolean bool, boolean bool_42_);

	public native void KA(int i);

	public native int m();

	public void method4479() {
		/* empty */
	}

	public native void f(int i);

	public native void S(int i);

	public native int ca();

	public native void EA(int i);

	public native void ia(int i, int i_43_, int i_44_);

	public Class64[] method4485() {
		return ((h) this).aClass64Array6937;
	}

	public void method4477(Class247 class247, int i, boolean bool) {
		Class249 class249 = ((a) ((h) this).aJa6934.nd()).aClass249_6931;
		class249.method2508(class247);
		aa(class249.aFloatArray2631, i, bool);
	}

	public native void pa(int i, int i_45_, Class_xa class_xa, Class_xa class_xa_46_, int i_47_, int i_48_, int i_49_);

	void method4455() {
		if (((ja) ((h) this).aJa6934).anInt6955 > 1) {
			synchronized (this) {
				while (aBoolean3990) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean3990 = true;
			}
		}
	}

	void method4448() {
		if (((ja) ((h) this).aJa6934).anInt6955 > 1) {
			synchronized (this) {
				aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	native boolean ea();

	final void method4470(int i, int[] is, int i_50_, int i_51_, int i_52_, int i_53_, boolean bool) {
		J(((h) this).nativeid, i, is, i_50_, i_51_, i_52_, i_53_, bool);
	}

	native void J(long l, int i, int[] is, int i_54_, int i_55_, int i_56_, int i_57_, boolean bool);

	public native void bl(int i);

	native void w(int i, int i_58_, int i_59_, int i_60_);

	public native int ct();

	public void method4488(Class247 class247, int i, boolean bool) {
		Class249 class249 = ((a) ((h) this).aJa6934.nd()).aClass249_6931;
		class249.method2508(class247);
		aa(class249.aFloatArray2631, i, bool);
	}

	native void aa(float[] fs, int i, boolean bool);

	public void method4475(Class247 class247, Class80 class80, int i) {
		if (class80 == null)
			((h) this).aJa6934.nd().method350(this, class247, null, i);
		else {
			ja.anIntArray6962[5] = 0;
			((h) this).aJa6934.nd().method350(this, class247, ja.anIntArray6962, i);
			class80.anInt669 = ja.anIntArray6962[0];
			class80.anInt670 = ja.anIntArray6962[1];
			class80.anInt668 = ja.anIntArray6962[2];
			class80.anInt672 = ja.anIntArray6962[3];
			class80.anInt673 = ja.anIntArray6962[4];
			class80.aBoolean671 = ja.anIntArray6962[5] != 0;
		}
	}

	public native int cz();

	public native void bt(int i);

	public Class64[] method4445() {
		return ((h) this).aClass64Array6937;
	}

	public native void ao(int i);

	public native int RA();

	public native int ya();

	public native int YA();

	public native int o();

	native void ba(ja var_ja);

	public native void bo(int i);

	public native Class_na ga(Class_na class_na);

	public native void Q(int i);

	public native int c();

	public native int Z();

	public native byte[] as();

	native void gn(byte i, byte[] is);

	public void method4460(byte i, byte[] is) {
		IA(i, is);
	}

	public native int N();

	public native int AA();

	public native void PA(int i, int i_61_, int i_62_, int i_63_);

	public boolean method4462() {
		return true;
	}

	public native boolean i();

	public native boolean u();

	public Class93[] method4464() {
		return ((h) this).aClass93Array6936;
	}

	public native void t(int i);

	public void method4490(Class387 class387, int i, int i_64_, int i_65_, boolean bool) {
		((h) this).aJa6934.nd().method376(this, class387, i, i_64_, i_65_, bool);
	}

	public void method4491() {
		/* empty */
	}

	public void method4466(Class387 class387, int i, int i_66_, int i_67_, boolean bool) {
		((h) this).aJa6934.nd().method376(this, class387, i, i_66_, i_67_, bool);
	}

	public native boolean el();

	public native void du(int i, int i_68_, int i_69_, int i_70_);

	public native int ah();

	public void method4478(Class247 class247, int i, boolean bool) {
		Class249 class249 = ((a) ((h) this).aJa6934.nd()).aClass249_6931;
		class249.method2508(class247);
		aa(class249.aFloatArray2631, i, bool);
	}

	public native int ar();

	public native int am();

	public native void au(int i);

	h(ja var_ja) {
		((h) this).aJa6934 = var_ja;
		((h) this).aBa6935 = null;
		ba(var_ja);
	}

	void method4557(int[] is, Class247 class247) {
		((h) this).aJa6934.nd().method352(this, is, class247);
	}

	public native void bg(int i);

	public native void bs(int i);

	native void ka();

	public Class64[] method4484() {
		return ((h) this).aClass64Array6937;
	}

	public void method4467(Class387 class387, int i, int i_71_, int i_72_, boolean bool) {
		((h) this).aJa6934.nd().method376(this, class387, i, i_71_, i_72_, bool);
	}

	public native void bf(int i);

	public boolean method4458(int i, int i_73_, Class247 class247, boolean bool, int i_74_) {
		return ((h) this).aJa6934.nd().method351(this, i, i_73_, class247, bool);
	}

	public native void paintTexture(short i, short i_75_);

	public native void br(int i);

	public native void bi(int i, int i_76_, int i_77_);

	public native void color(short i, short i_78_);

	public native void be(int i, int i_79_, int i_80_);

	public native void ma(boolean bool);

	void method4472() {
		if (((ja) ((h) this).aJa6934).anInt6955 > 1) {
			synchronized (this) {
				aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	native void bx();

	final void method4473(int i, int[] is, int i_81_, int i_82_, int i_83_, int i_84_, boolean bool) {
		J(((h) this).nativeid, i, is, i_81_, i_82_, i_83_, i_84_, bool);
	}

	final void method4474(int i, int[] is, int i_85_, int i_86_, int i_87_, int i_88_, boolean bool) {
		J(((h) this).nativeid, i, is, i_85_, i_86_, i_87_, i_88_, bool);
	}

	final void method4451(int i, int[] is, int i_89_, int i_90_, int i_91_, int i_92_, boolean bool) {
		J(((h) this).nativeid, i, is, i_89_, i_90_, i_91_, i_92_, bool);
	}

	native void bu(int i, int i_93_, int i_94_, int i_95_);

	native void fd(long l, int i, int[] is, int i_96_, int i_97_, int i_98_, int i_99_, boolean bool);

	void method4558() {
		if (((h) this).nativeid != 0L)
			Class71.method827(this, -85607329);
	}

	public native int cx();

	public native void wa();

	public void method4440(Class247 class247, Class80 class80, int i) {
		if (class80 == null)
			((h) this).aJa6934.nd().method350(this, class247, null, i);
		else {
			ja.anIntArray6962[5] = 0;
			((h) this).aJa6934.nd().method350(this, class247, ja.anIntArray6962, i);
			class80.anInt669 = ja.anIntArray6962[0];
			class80.anInt670 = ja.anIntArray6962[1];
			class80.anInt668 = ja.anIntArray6962[2];
			class80.anInt672 = ja.anIntArray6962[3];
			class80.anInt673 = ja.anIntArray6962[4];
			class80.aBoolean671 = ja.anIntArray6962[5] != 0;
		}
	}

	public void method4481(Class247 class247, int i, boolean bool) {
		Class249 class249 = ((a) ((h) this).aJa6934.nd()).aClass249_6931;
		class249.method2508(class247);
		aa(class249.aFloatArray2631, i, bool);
	}

	public void method4465(Class247 class247) {
		method4557(ja.anIntArray6946, class247);
		int i = 0;
		if (((h) this).aClass93Array6936 != null) {
			for (int i_100_ = 0; i_100_ < ((h) this).aClass93Array6936.length; i_100_++) {
				Class93 class93 = ((h) this).aClass93Array6936[i_100_];
				class93.anInt838 = ja.anIntArray6946[i++] * 432673201;
				class93.anInt832 = ja.anIntArray6946[i++] * -1138862783;
				class93.anInt840 = ja.anIntArray6946[i++] * -555868357;
				class93.anInt837 = ja.anIntArray6946[i++] * -707023853;
				class93.anInt842 = ja.anIntArray6946[i++] * -648890367;
				class93.anInt845 = ja.anIntArray6946[i++] * -1672139309;
				class93.anInt839 = ja.anIntArray6946[i++] * 488615051;
				class93.anInt844 = ja.anIntArray6946[i++] * 197668655;
				class93.anInt846 = ja.anIntArray6946[i++] * 471540135;
			}
		}
		if (((h) this).aClass64Array6937 != null) {
			for (int i_101_ = 0; i_101_ < ((h) this).aClass64Array6937.length; i_101_++) {
				Class64 class64 = ((h) this).aClass64Array6937[i_101_];
				Class64 class64_102_ = class64;
				if (class64.aClass64_562 != null)
					class64_102_ = class64.aClass64_562;
				if (class64.aClass249_568 == null)
					class64.aClass249_568 = new Class249();
				class64.aClass249_568.method2508(class247);
				class64_102_.anInt565 = ja.anIntArray6946[i++] * -686746519;
				class64_102_.anInt563 = ja.anIntArray6946[i++] * -635472619;
				class64_102_.anInt567 = ja.anIntArray6946[i++] * 1225142127;
			}
		}
	}

	public native void by(int i, int i_103_, Class_xa class_xa, Class_xa class_xa_104_, int i_105_, int i_106_, int i_107_);

	public native void bz(int i, int i_108_, int i_109_);

	public native int cj();

	public native int cy();

	public native int cb();

	public native int co();

	public native int cd();

	public native int cn();

	public boolean method4469(int i, int i_110_, Class247 class247, boolean bool, int i_111_) {
		return ((h) this).aJa6934.nd().method351(this, i, i_110_, class247, bool);
	}

	public native int cm();

	public native int cw();

	public native int cq();

	public native int ci();

	public native int cs();

	public native int cr();

	public native void cv(int i);

	public native void ck(int i);

	public native void cl(int i);

	public native void cp(int i);

	public native void cf(int i);

	public native void cu(int i);

	public native void bk(int i);

	public native int cg();

	h(ja var_ja, ba var_ba, Model class98, int i, int i_112_, int i_113_, int i_114_) {
		((h) this).aJa6934 = var_ja;
		((h) this).aBa6935 = var_ba;
		((h) this).aClass93Array6936 = class98.aClass93Array878;
		((h) this).aClass64Array6937 = class98.aClass64Array893;
		int i_115_ = (class98.aClass93Array878 == null ? 0 : class98.aClass93Array878.length);
		int i_116_ = (class98.aClass64Array893 == null ? 0 : class98.aClass64Array893.length);
		int i_117_ = 0;
		int[] is = new int[i_115_ * 3 + i_116_];
		for (int i_118_ = 0; i_118_ < i_115_; i_118_++) {
			is[i_117_++] = ((h) this).aClass93Array6936[i_118_].anInt841 * -1670679901;
			is[i_117_++] = ((h) this).aClass93Array6936[i_118_].anInt835 * -614748507;
			is[i_117_++] = ((h) this).aClass93Array6936[i_118_].anInt836 * -878748965;
		}
		for (int i_119_ = 0; i_119_ < i_116_; i_119_++)
			is[i_117_++] = ((h) this).aClass64Array6937[i_119_].anInt566 * 1669844747;
		int i_120_ = (class98.aClass94Array908 == null ? 0 : class98.aClass94Array908.length);
		int[] is_121_ = new int[i_120_ * 8];
		int i_122_ = 0;
		for (int i_123_ = 0; i_123_ < i_120_; i_123_++) {
			Class94 class94 = class98.aClass94Array908[i_123_];
			Class207 class207 = Class511.method6180(class94.anInt850 * 1490212127, (byte) 76);
			is_121_[i_122_++] = class94.anInt848 * -1401356047;
			is_121_[i_122_++] = class207.anInt1945 * 1234206275;
			is_121_[i_122_++] = class207.anInt1946 * -1366680355;
			is_121_[i_122_++] = class207.anInt1950 * 1569869573;
			is_121_[i_122_++] = class207.anInt1941 * -384448259;
			is_121_[i_122_++] = class207.anInt1947 * 1238436903;
			is_121_[i_122_++] = class207.aBoolean1948 ? -1 : 0;
		}
		for (int i_124_ = 0; i_124_ < i_120_; i_124_++) {
			Class94 class94 = class98.aClass94Array908[i_124_];
			is_121_[i_122_++] = class94.anInt847 * 165131415;
		}
		U(((h) this).aJa6934, ((h) this).aBa6935, class98.anInt897, class98.anInt874, class98.anIntArray875, class98.anIntArray889, class98.anIntArray877, class98.anIntArray880, class98.aShortArray879, class98.anInt904, class98.aShortArray888, class98.aShortArray907, class98.aShortArray883, class98.aByteArray884, class98.aByteArray885, class98.aByteArray876, class98.aByteArray887, class98.aShortArray873, class98.aShortArray896, class98.anIntArray890, class98.aByte891, class98.aShortArray892, class98.anInt882, class98.aByteArray894, class98.aShortArray895, class98.aShortArray903, class98.aShortArray886, class98.anIntArray898, class98.anIntArray899, class98.anIntArray900, class98.aByteArray906, class98.aByteArray905, class98.anIntArray901, class98.anIntArray902, class98.anIntArray872, is, i_115_, i_116_, i, i_112_, i_113_, i_114_, is_121_);
	}

	public native int cc();

	native void e(int i, int[] is, int i_125_, int i_126_, int i_127_, boolean bool, int i_128_, int[] is_129_);

	public native int ds();

	public native void bc(int i);

	public native byte[] dz();

	public native byte[] dr();

	public native void method_do(short i, short i_130_);

	public native int ha();

	public native void dh(short i, short i_131_);

	public native void dt(short i, short i_132_);

	public native void dq(short i, short i_133_);

	public void method4482(byte i, byte[] is) {
		IA(i, is);
	}

	public native void dj(short i, short i_134_);

	public void method4463(Class247 class247) {
		method4557(ja.anIntArray6946, class247);
		int i = 0;
		if (((h) this).aClass93Array6936 != null) {
			for (int i_135_ = 0; i_135_ < ((h) this).aClass93Array6936.length; i_135_++) {
				Class93 class93 = ((h) this).aClass93Array6936[i_135_];
				class93.anInt838 = ja.anIntArray6946[i++] * 432673201;
				class93.anInt832 = ja.anIntArray6946[i++] * -1138862783;
				class93.anInt840 = ja.anIntArray6946[i++] * -555868357;
				class93.anInt837 = ja.anIntArray6946[i++] * -707023853;
				class93.anInt842 = ja.anIntArray6946[i++] * -648890367;
				class93.anInt845 = ja.anIntArray6946[i++] * -1672139309;
				class93.anInt839 = ja.anIntArray6946[i++] * 488615051;
				class93.anInt844 = ja.anIntArray6946[i++] * 197668655;
				class93.anInt846 = ja.anIntArray6946[i++] * 471540135;
			}
		}
		if (((h) this).aClass64Array6937 != null) {
			for (int i_136_ = 0; i_136_ < ((h) this).aClass64Array6937.length; i_136_++) {
				Class64 class64 = ((h) this).aClass64Array6937[i_136_];
				Class64 class64_137_ = class64;
				if (class64.aClass64_562 != null)
					class64_137_ = class64.aClass64_562;
				if (class64.aClass249_568 == null)
					class64.aClass249_568 = new Class249();
				class64.aClass249_568.method2508(class247);
				class64_137_.anInt565 = ja.anIntArray6946[i++] * -686746519;
				class64_137_.anInt563 = ja.anIntArray6946[i++] * -635472619;
				class64_137_.anInt567 = ja.anIntArray6946[i++] * 1225142127;
			}
		}
	}

	public native Class_na ce(Class_na class_na);

	public native void dm(int i, int i_138_, int i_139_, int i_140_);

	public native int av();

	public native void df(int i, int i_141_, int i_142_, int i_143_);

	public Class93[] method4476() {
		return ((h) this).aClass93Array6936;
	}

	public Class93[] method4483() {
		return ((h) this).aClass93Array6936;
	}

	native void fp(byte i, byte[] is);

	native void IA(byte i, byte[] is);

	public Class64[] method4452() {
		return ((h) this).aClass64Array6937;
	}

	public boolean method4487() {
		return true;
	}

	public boolean method4471() {
		return true;
	}

	public native boolean dw();

	public native boolean dp();

	void method4559() {
		if (((h) this).nativeid != 0L)
			Class71.method827(this, -1162074582);
	}

	public native int n();

	public void method4480(Class387 class387, int i, int i_144_, int i_145_, boolean bool) {
		((h) this).aJa6934.nd().method376(this, class387, i, i_144_, i_145_, bool);
	}

	public native void ej();

	public native boolean ew();

	public native int db();

	void method4560(int[] is, Class247 class247) {
		((h) this).aJa6934.nd().method352(this, is, class247);
	}

	void method4489() {
		if (((ja) ((h) this).aJa6934).anInt6955 > 1) {
			synchronized (this) {
				while (aBoolean3990) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean3990 = true;
			}
		}
	}

	native boolean ei();

	native void er(int i, int[] is, int i_146_, int i_147_, int i_148_, boolean bool, int i_149_, int[] is_150_);

	native void en(int i, int[] is, int i_151_, int i_152_, int i_153_, boolean bool, int i_154_, int[] is_155_);

	native void ee(int i, int[] is, int i_156_, int i_157_, int i_158_, boolean bool, int i_159_, int[] is_160_);

	public native void da(short i, short i_161_);

	native void fl(ja var_ja);

	public Class387 method4468(byte i, int i_162_, boolean bool) {
		return ((h) this).aJa6934.nd().method355(this, i, i_162_, bool);
	}

	native void ff(h var_h_163_, h var_h_164_, int i, boolean bool, boolean bool_165_);

	native void fi(long l, int i, int[] is, int i_166_, int i_167_, int i_168_, int i_169_, boolean bool);

	native void fn(long l, int i, int[] is, int i_170_, int i_171_, int i_172_, int i_173_, boolean bool);

	native void fq(long l, int i, int[] is, int i_174_, int i_175_, int i_176_, int i_177_, boolean bool);

	public native void ed(int i);

	native void fx(float[] fs, int i, boolean bool);

	native void fw(byte i, byte[] is);

	public native void oa(int i, int i_178_, int i_179_);

	native void fb(byte i, byte[] is);

	native void gb(byte i, byte[] is);

	public native void dl(short i, short i_180_);
}
