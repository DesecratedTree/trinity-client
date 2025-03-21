/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class ja extends Class_ra implements Interface28 {
	static int[] anIntArray6940;
	long nativeid;
	ba aBa6941;
	int anInt6942;
	Class249 aClass249_6943;
	float aFloat6944;
	Class249 aClass249_6945;
	static int[] anIntArray6946;
	Class247 aClass247_6947;
	float aFloat6948;
	Class249 aClass249_6949;
	Class249 aClass249_6950;
	static byte[] aByteArray6951;
	Class247 aClass247_6952;
	float aFloat6953;
	int anInt6954;
	int anInt6955;
	boolean aBoolean6956;
	static int anInt6957 = 4;
	static int anInt6958 = 104;
	static int anInt6959 = 20;
	float aFloat6960;
	static int anInt6961 = 24573;
	static int[] anIntArray6962;
	static float[] aFloatArray6963;
	boolean aBoolean6964 = false;
	Class471 aClass471_6965;
	static float[] aFloatArray6966;
	a[] anAArray6967;
	static int[] anIntArray6968;
	static int[] anIntArray6969;
	static int[] anIntArray6970;
	static short[] aShortArray6971;
	static int[] anIntArray6972 = new int[Math.max(Math.max(104, 20), 24573)];
	static int anInt6973 = 20;

	public Class_v gs(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).aClass471_6965.method5878(var_ba, (short) 8192);
		return var_ba;
	}

	public boolean ac() {
		return false;
	}

	native void YA(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);

	public native void J(int i);

	native void da();

	native void Y(int i);

	native void n(Class_v class_v);

	native void Q(int i, int[] is, float[] fs);

	Object WA() {
		return new aa(this);
	}

	public void fq(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		XA(i, i_5_, i_6_, i_8_, i_9_);
		XA(i, i_5_ + i_7_ - 1, i_6_, i_8_, i_9_);
		G(i, i_5_ + 1, i_7_ - 1, i_8_, i_9_);
		G(i + i_6_ - 1, i_5_ + 1, i_7_ - 1, i_8_, i_9_);
	}

	public boolean ei() {
		return true;
	}

	native void F(short i, int[] is, short i_10_, int i_11_, byte i_12_, byte i_13_, int i_14_, boolean bool, byte i_15_, byte i_16_, byte i_17_, byte i_18_, boolean bool_19_, boolean bool_20_, boolean bool_21_, boolean bool_22_, boolean bool_23_, byte i_24_, boolean bool_25_, boolean bool_26_, int i_27_);

	native void ng();

	protected void finalize() {
		method4781(628001038);
		if (((ja) this).nativeid != 0L)
			Class71.method827(this, -149503806);
	}

	public native void ma(boolean bool);

	public Class61 bj(int i, int i_28_, int i_29_, int i_30_, boolean bool) {
		return new fa(this, i, i_28_, i_29_, i_30_, !bool);
	}

	public Class51 f() {
		return new Class51(0, "SSE", 1, "CPU", 0L);
	}

	public int hd(int i, int i_31_) {
		return i | i_31_;
	}

	boolean SA(short i) {
		synchronized (anInterface_ma4227) {
			Class56 class56 = anInterface_ma4227.method221(i, -228034789);
			if (class56 == null) {
				boolean bool = false;
				return bool;
			}
			int i_32_ = class56.anInt532 * -1963453415;
			if (!anInterface_ma4227.method237(i, ((class56.aClass369_524 != Class369.aClass369_6817) ? Class377.aClass377_3934 : Class377.aClass377_3935), 0.7F, i_32_, i_32_, true, 2146191042)) {
				boolean bool = false;
				return bool;
			}
			int[] is;
			if (class56.aClass369_524 != Class369.aClass369_6817)
				is = anInterface_ma4227.method220(i, 0.7F, i_32_, i_32_, true, -1802565290);
			else
				is = anInterface_ma4227.method231(i, 0.7F, i_32_, i_32_, true, 458532706);
			int[] is_33_;
			if (i_32_ == 64) {
				is_33_ = new int[16384];
				for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
					for (int i_35_ = 0; i_35_ < i_32_; i_35_++) {
						int i_36_ = 2 * (i_34_ + i_35_ * 128);
						is_33_[i_36_] = is_33_[i_36_ + 1] = is_33_[i_36_ + 128] = is_33_[i_36_ + 128 + 1] = is[i_34_ + i_35_ * i_32_];
					}
				}
			} else
				is_33_ = is;
			F(i, is_33_, class56.aShort523, class56.aClass369_524.method297((short) 10327), class56.aByte525, class56.aByte526, class56.anInt527 * -2120684159, class56.anInt532 * -1963453415 == 64, class56.aByte529, class56.aByte534, class56.aByte531, class56.aByte530, class56.aBoolean533, class56.aBoolean519, class56.aBoolean517, class56.aBoolean536, class56.aBoolean537, class56.aByte538, class56.aBoolean508, class56.aBoolean514, class56.anInt520 * -721577829);
		}
		return true;
	}

	void u() {
		if (!((ja) this).aBoolean6964) {
			((ja) this).anAArray6967 = null;
			((ja) this).aBa6941 = null;
			((ja) this).aClass249_6945 = null;
			for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -29))
				var_ba.ha();
			((ja) this).aClass471_6965.method5866(613065745);
			da();
			if (((ja) this).aBoolean6956) {
				Class95_Sub12.method1137(false, true, 796132207);
				((ja) this).aBoolean6956 = false;
			}
			h();
			Class71.method824(-612430983);
			((ja) this).aBoolean6964 = true;
		}
	}

	native void nk(int i, int[] is, float[] fs);

	public boolean ec() {
		return false;
	}

	public Class247 kx() {
		return ((ja) this).aClass247_6952;
	}

	public boolean e() {
		return true;
	}

	public boolean t() {
		return true;
	}

	public boolean v() {
		return false;
	}

	public boolean ay() {
		return false;
	}

	public boolean y() {
		return true;
	}

	public Class61 ha(int i, int i_37_, boolean bool, boolean bool_38_) {
		return new fa(this, i, i_37_, bool_38_);
	}

	native void ou(za var_za);

	public boolean at() {
		return true;
	}

	native void AA(float[] fs);

	void w(int i, int i_39_) throws Exception_Sub1 {
		za var_za = (za) method4800(-924859015);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method883(i, i_39_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -20408);
	}

	native void ok(short i, short i_40_, int i_41_, byte i_42_, byte i_43_, int i_44_, boolean bool, byte i_45_, byte i_46_, byte i_47_, byte i_48_, boolean bool_49_, boolean bool_50_, boolean bool_51_, boolean bool_52_, boolean bool_53_, byte i_54_, boolean bool_55_, boolean bool_56_, int i_57_);

	public native int[] ar(int i, int i_58_, int i_59_, int i_60_);

	public void am() {
		/* empty */
	}

	Class76_Sub1 ak(Canvas canvas, int i, int i_61_) {
		return new za(this, canvas, i, i_61_);
	}

	native void PA(za var_za);

	native void d(long l, long l_62_);

	public void au() {
		((ja) this).aFloat6953 = (float) method4782((byte) 0).method856() / 2.0F;
		((ja) this).aFloat6948 = (float) method4782((byte) 0).method857() / 2.0F;
		((ja) this).aFloat6960 = ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = ((ja) this).aFloat6948;
		k();
	}

	native void k();

	public void kl(Class247 class247) {
		((ja) this).aClass247_6947 = class247;
		((ja) this).aClass249_6943.method2508(class247);
		AA(((ja) this).aClass249_6943.aFloatArray2631);
		((ja) this).aClass249_6950.method2484(((ja) this).aClass249_6943, ((ja) this).aClass249_6949);
	}

	native void A(int i, int i_63_, int i_64_, int i_65_);

	public native void GA(float f, float f_66_);

	public native void L();

	public native void r(int i, int i_67_, int i_68_, int i_69_);

	public native void o(int i, int i_70_, int i_71_, int i_72_);

	public native void qa(int[] is);

	public native void ba(int i, int i_73_);

	public void bl(int i, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_) {
		XA(i, i_74_, i_75_, i_77_, i_78_);
		XA(i, i_74_ + i_76_ - 1, i_75_, i_77_, i_78_);
		G(i, i_74_ + 1, i_76_ - 1, i_77_, i_78_);
		G(i + i_75_ - 1, i_74_ + 1, i_76_ - 1, i_77_, i_78_);
	}

	public native void B(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_);

	public void method_do(float f, float f_84_, float f_85_, float[] fs) {
		float f_86_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * f + ((ja) this).aClass249_6950.aFloatArray2631[7] * f_84_ + ((ja) this).aClass249_6950.aFloatArray2631[11] * f_85_);
		float f_87_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * f + ((ja) this).aClass249_6950.aFloatArray2631[4] * f_84_ + ((ja) this).aClass249_6950.aFloatArray2631[8] * f_85_);
		float f_88_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * f + ((ja) this).aClass249_6950.aFloatArray2631[5] * f_84_ + ((ja) this).aClass249_6950.aFloatArray2631[9] * f_85_);
		float f_89_ = (((ja) this).aClass249_6943.aFloatArray2631[14] + ((ja) this).aClass249_6943.aFloatArray2631[2] * f + ((ja) this).aClass249_6943.aFloatArray2631[6] * f_84_ + ((ja) this).aClass249_6943.aFloatArray2631[10] * f_85_);
		fs[0] = ((ja) this).aFloat6960 + ((ja) this).aFloat6953 * f_87_ / f_86_;
		fs[1] = ((ja) this).aFloat6944 + ((ja) this).aFloat6948 * f_88_ / f_86_;
		fs[2] = f_89_;
	}

	public void kt(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, Class_ta class_ta, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_) {
		/* empty */
	}

	public native void XA(int i, int i_100_, int i_101_, int i_102_, int i_103_);

	public native void G(int i, int i_104_, int i_105_, int i_106_, int i_107_);

	public void br(int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_) {
		YA(i, i_108_, i_109_, i_110_, i_111_, i_112_);
	}

	public void bi(int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, Class_ta class_ta, int i_118_, int i_119_) {
		R(i, i_113_, i_114_, i_115_, i_116_, i_117_, class_ta, i_118_, i_119_);
	}

	native void CA(int i, int i_120_, int i_121_, int i_122_, int i_123_);

	void iy(float f, float f_124_, float f_125_, float f_126_, float f_127_, float f_128_) {
		/* empty */
	}

	public boolean eh() {
		return true;
	}

	public native void fg(int i, int i_129_, int i_130_, int i_131_);

	public int bp(int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_) {
		int i_137_ = 0;
		float f = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[6] * (float) i_132_ + (((ja) this).aClass249_6950.aFloatArray2631[10] * (float) i_133_));
		float f_138_ = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * (float) i_134_ + ((ja) this).aClass249_6950.aFloatArray2631[6] * (float) i_135_ + (((ja) this).aClass249_6950.aFloatArray2631[10] * (float) i_136_));
		float f_139_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[7] * (float) i_132_ + (((ja) this).aClass249_6950.aFloatArray2631[11] * (float) i_133_));
		float f_140_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * (float) i_134_ + ((ja) this).aClass249_6950.aFloatArray2631[7] * (float) i_135_ + (((ja) this).aClass249_6950.aFloatArray2631[11] * (float) i_136_));
		if (f < -f_139_ && f_138_ < -f_140_)
			i_137_ |= 0x10;
		else if (f > f_139_ && f_138_ > f_140_)
			i_137_ |= 0x20;
		float f_141_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[4] * (float) i_132_ + (((ja) this).aClass249_6950.aFloatArray2631[8] * (float) i_133_));
		float f_142_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * (float) i_134_ + ((ja) this).aClass249_6950.aFloatArray2631[4] * (float) i_135_ + (((ja) this).aClass249_6950.aFloatArray2631[8] * (float) i_136_));
		if (f_141_ < -f_139_ && f_142_ < -f_140_)
			i_137_ |= 0x1;
		if (f_141_ > f_139_ && f_142_ > f_140_)
			i_137_ |= 0x2;
		float f_143_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[5] * (float) i_132_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * (float) i_133_));
		float f_144_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * (float) i_134_ + ((ja) this).aClass249_6950.aFloatArray2631[5] * (float) i_135_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * (float) i_136_));
		if (f_143_ < -f_139_ && f_144_ < -f_140_)
			i_137_ |= 0x4;
		if (f_143_ > f_139_ && f_144_ > f_140_)
			i_137_ |= 0x8;
		return i_137_;
	}

	public int cr() {
		return 4;
	}

	public void dr(float f, float f_145_, float f_146_, float[] fs) {
		float f_147_ = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * f + ((ja) this).aClass249_6950.aFloatArray2631[6] * f_145_ + ((ja) this).aClass249_6950.aFloatArray2631[10] * f_146_);
		float f_148_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * f + ((ja) this).aClass249_6950.aFloatArray2631[7] * f_145_ + ((ja) this).aClass249_6950.aFloatArray2631[11] * f_146_);
		if (f_147_ < -f_148_ || f_147_ > f_148_) {
			float[] fs_149_ = fs;
			float[] fs_150_ = fs;
			fs[2] = Float.NaN;
			fs_150_[1] = Float.NaN;
			fs_149_[0] = Float.NaN;
		} else {
			float f_151_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * f + ((ja) this).aClass249_6950.aFloatArray2631[4] * f_145_ + ((ja) this).aClass249_6950.aFloatArray2631[8] * f_146_);
			if (f_151_ < -f_148_ || f_151_ > f_148_) {
				float[] fs_152_ = fs;
				float[] fs_153_ = fs;
				fs[2] = Float.NaN;
				fs_153_[1] = Float.NaN;
				fs_152_[0] = Float.NaN;
			} else {
				float f_154_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * f + ((ja) this).aClass249_6950.aFloatArray2631[5] * f_145_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * f_146_));
				if (f_154_ < -f_148_ || f_154_ > f_148_) {
					float[] fs_155_ = fs;
					float[] fs_156_ = fs;
					fs[2] = Float.NaN;
					fs_156_[1] = Float.NaN;
					fs_155_[0] = Float.NaN;
				} else {
					float f_157_ = (((ja) this).aClass249_6943.aFloatArray2631[14] + ((ja) this).aClass249_6943.aFloatArray2631[2] * f + (((ja) this).aClass249_6943.aFloatArray2631[6] * f_145_) + (((ja) this).aClass249_6943.aFloatArray2631[10] * f_146_));
					fs[0] = (((ja) this).aFloat6960 + ((ja) this).aFloat6953 * f_151_ / f_148_);
					fs[1] = (((ja) this).aFloat6944 + ((ja) this).aFloat6948 * f_154_ / f_148_);
					fs[2] = f_157_;
				}
			}
		}
	}

	public Class_v bx(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).aClass471_6965.method5878(var_ba, (short) 8192);
		return var_ba;
	}

	public void bm(Class_v class_v) {
		((ja) this).aBa6941 = (ba) class_v;
		n(class_v);
	}

	public Class61 bn(int i, int i_158_, boolean bool, boolean bool_159_) {
		return new fa(this, i, i_158_, bool_159_);
	}

	public Class61 bu(int[] is, int i, int i_160_, int i_161_, int i_162_, boolean bool) {
		return new fa(this, is, i, i_160_, i_161_, i_162_, false);
	}

	public native void jh();

	public boolean a() {
		return true;
	}

	public final void dg(int i, Class77 class77) {
		M(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	native void ny();

	public Class263 ce(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		int[] is = new int[class87_sub2s.length];
		int[] is_163_ = new int[class87_sub2s.length];
		boolean bool_164_ = false;
		for (int i = 0; i < class87_sub2s.length; i++) {
			is[i] = class87_sub2s[i].anInt7112;
			is_163_[i] = class87_sub2s[i].anInt7107;
			if (class87_sub2s[i].aByteArray7115 != null)
				bool_164_ = true;
		}
		if (bool) {
			if (bool_164_)
				return new ea(this, ((ja) this).aBa6941, class524, class87_sub2s, null);
			return new m(this, ((ja) this).aBa6941, class524, class87_sub2s, null);
		}
		if (bool_164_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).aBa6941, class524, class87_sub2s, null);
	}

	public void cy(int i) {
		((ja) this).anInt6954 = ((ja) this).anInt6942 = i;
		if (((ja) this).anInt6955 > 1)
			throw new IllegalStateException();
		nr(((ja) this).anInt6955);
		nf(0);
	}

	public Class387 cb(Model class98, int i, int i_165_, int i_166_, int i_167_) {
		return new h(this, ((ja) this).aBa6941, class98, i, i_165_, i_166_, i_167_);
	}

	native void pz(int i, int i_168_, int i_169_, int i_170_);

	public int cd(int i, int i_171_) {
		return i | i_171_;
	}

	Interface8_Impl1_Impl2 px(int i, int i_172_) {
		return (fa) bn(i, i_172_, false, true);
	}

	public Class249 cz() {
		return ((ja) this).aClass249_6945;
	}

	public Class247 cj() {
		return ((ja) this).aClass247_6952;
	}

	void nr(int i) {
		((ja) this).anInt6955 = i;
		((ja) this).anAArray6967 = new a[((ja) this).anInt6955];
		for (int i_173_ = 0; i_173_ < ((ja) this).anInt6955; i_173_++)
			((ja) this).anAArray6967[i_173_] = new a(this, ((ja) this).anInt6954, ((ja) this).anInt6942);
	}

	void nf(int i) {
		((ja) this).anAArray6967[i].method345();
	}

	a nd() {
		for (int i = 0; i < ((ja) this).anInt6955; i++) {
			if (((a) ((ja) this).anAArray6967[i]).aRunnable6930 == Thread.currentThread())
				return ((ja) this).anAArray6967[i];
		}
		return null;
	}

	public void cm(Class81 class81) {
		if (!class81.aClass461_675.method5698(107915522)) {
			nc(class81, false);
			nd().method369(this, anIntArray6968, anIntArray6969, anIntArray6970, aShortArray6971, class81.aClass461_675.method5697(698144030));
		}
	}

	void jc(float f, float f_174_, float f_175_, float f_176_, float f_177_, float f_178_) {
		/* empty */
	}

	public Class247 cq() {
		return ((ja) this).aClass247_6947;
	}

	public native void ij(float f);

	public void ci(Class249 class249) {
		((ja) this).aClass249_6949 = class249;
		wa(((ja) this).aClass249_6949.aFloatArray2631);
		((ja) this).aClass249_6950.method2484(((ja) this).aClass249_6943, ((ja) this).aClass249_6949);
	}

	native void wa(float[] fs);

	public void kk() {
		((ja) this).aFloat6953 = (float) method4782((byte) 0).method856() / 2.0F;
		((ja) this).aFloat6948 = (float) method4782((byte) 0).method857() / 2.0F;
		((ja) this).aFloat6960 = ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = ((ja) this).aFloat6948;
		k();
	}

	public native void IA(float f);

	native void na(int i, int[] is, float[] fs);

	public native void fx(int i, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_);

	public native void c(int i, int i_184_, int i_185_);

	public native void RA(boolean bool);

	public void ck(int i, Class330_Sub14[] class330_sub14s) {
		int i_186_ = 0;
		for (int i_187_ = 0; i_187_ < i; i_187_++) {
			anIntArray6940[i_186_++] = class330_sub14s[i_187_].method3318(598949538);
			anIntArray6940[i_186_++] = class330_sub14s[i_187_].method3311((byte) -42);
			anIntArray6940[i_186_++] = class330_sub14s[i_187_].method3312((short) -13455);
			anIntArray6940[i_186_++] = class330_sub14s[i_187_].method3316((byte) 7);
			aFloatArray6966[i_187_] = class330_sub14s[i_187_].method3317(1379340223);
			anIntArray6940[i_186_++] = class330_sub14s[i_187_].method3313(-934085165);
		}
		Q(i, anIntArray6940, aFloatArray6966);
	}

	public Class92 cl(int i, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_) {
		return null;
	}

	public Class92 cp(Class92 class92, Class92 class92_193_, float f, Class92 class92_194_) {
		return null;
	}

	public void cf(Class92 class92) {
		/* empty */
	}

	public void db(int i, int i_195_, int i_196_, int i_197_) {
		/* empty */
	}

	native void q(Interface_ma interface_ma, int i, int i_198_);

	public void bz(int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_) {
		/* empty */
	}

	public void ca() {
		/* empty */
	}

	native void pk(int i, int i_207_, int i_208_, int i_209_);

	native void on(float[] fs);

	public final void dz(int i, Class77 class77) {
		JA(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	native void JA(int i, int i_210_, int i_211_, int i_212_);

	public native void O();

	public int lo() {
		return 4;
	}

	native void M(int i, int i_213_, int i_214_, int i_215_);

	native void ov(float[] fs);

	Interface8_Impl1_Impl2 no(int i, int i_216_) {
		return (fa) bn(i, i_216_, false, true);
	}

	public Interface8_Impl1_Impl2 az(int i, int i_217_, Class72 class72, Class86 class86, int i_218_) {
		return no(i, i_217_);
	}

	public void dh(boolean bool) {
		/* empty */
	}

	public Interface8_Impl1_Impl1 av(int i, int i_219_, int i_220_) {
		return new oa(i, i_219_);
	}

	native void ob(int i, int i_221_, int i_222_, int i_223_);

	public native void ks(boolean bool);

	public Class51 dq() {
		return new Class51(0, "SSE", 1, "CPU", 0L);
	}

	void dv(int i, int i_224_) throws Exception_Sub1 {
		za var_za = (za) method4800(-924859015);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method883(i, i_224_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -6895);
	}

	void dc(int i, int i_225_) throws Exception_Sub1 {
		za var_za = (za) method4800(-924859015);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method883(i, i_225_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 3178);
	}

	public native void gx(int i, int i_226_, int i_227_, int i_228_, int i_229_);

	void dl(int i, int i_230_) throws Exception_Sub1 {
		za var_za = (za) method4800(-924859015);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method883(i, i_230_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -1884);
	}

	void dm(int i, int i_231_) throws Exception_Sub1 {
		za var_za = (za) method4800(-924859015);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method883(i, i_231_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 4585);
	}

	public void du() {
		/* empty */
	}

	public Class263 ho(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		int[] is = new int[class87_sub2s.length];
		int[] is_232_ = new int[class87_sub2s.length];
		boolean bool_233_ = false;
		for (int i = 0; i < class87_sub2s.length; i++) {
			is[i] = class87_sub2s[i].anInt7112;
			is_232_[i] = class87_sub2s[i].anInt7107;
			if (class87_sub2s[i].aByteArray7115 != null)
				bool_233_ = true;
		}
		if (bool) {
			if (bool_233_)
				return new ea(this, ((ja) this).aBa6941, class524, class87_sub2s, null);
			return new m(this, ((ja) this).aBa6941, class524, class87_sub2s, null);
		}
		if (bool_233_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).aBa6941, class524, class87_sub2s, null);
	}

	public void dy() {
		/* empty */
	}

	public void dx() {
		/* empty */
	}

	void dd() {
		if (!((ja) this).aBoolean6964) {
			((ja) this).anAArray6967 = null;
			((ja) this).aBa6941 = null;
			((ja) this).aClass249_6945 = null;
			for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -105))
				var_ba.ha();
			((ja) this).aClass471_6965.method5866(613065745);
			da();
			if (((ja) this).aBoolean6956) {
				Class95_Sub12.method1137(false, true, -153353186);
				((ja) this).aBoolean6956 = false;
			}
			h();
			Class71.method824(-1538331687);
			((ja) this).aBoolean6964 = true;
		}
	}

	void de() {
		if (!((ja) this).aBoolean6964) {
			((ja) this).anAArray6967 = null;
			((ja) this).aBa6941 = null;
			((ja) this).aClass249_6945 = null;
			for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -114))
				var_ba.ha();
			((ja) this).aClass471_6965.method5866(613065745);
			da();
			if (((ja) this).aBoolean6956) {
				Class95_Sub12.method1137(false, true, -259053021);
				((ja) this).aBoolean6956 = false;
			}
			h();
			Class71.method824(649268242);
			((ja) this).aBoolean6964 = true;
		}
	}

	public native void DA(int i, Class_ta class_ta, int i_234_, int i_235_);

	void di() {
		if (!((ja) this).aBoolean6964) {
			((ja) this).anAArray6967 = null;
			((ja) this).aBa6941 = null;
			((ja) this).aClass249_6945 = null;
			for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -65))
				var_ba.ha();
			((ja) this).aClass471_6965.method5866(613065745);
			da();
			if (((ja) this).aBoolean6956) {
				Class95_Sub12.method1137(false, true, 1950593660);
				((ja) this).aBoolean6956 = false;
			}
			h();
			Class71.method824(39901464);
			((ja) this).aBoolean6964 = true;
		}
	}

	public void dk(int i) {
		Class71.method826(-35950879);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -74))
			var_ba.u();
	}

	public void bk(int i, int i_236_, float f, int i_237_, int i_238_, float f_239_, int i_240_, int i_241_, float f_242_, int i_243_, int i_244_, int i_245_, int i_246_) {
		throw new IllegalStateException();
	}

	public native int dp();

	public boolean ed() {
		return true;
	}

	public boolean ea() {
		return true;
	}

	public void ds() {
		/* empty */
	}

	public boolean ew() {
		return true;
	}

	public Class249 kc() {
		return ((ja) this).aClass249_6945;
	}

	public boolean em() {
		return true;
	}

	public void by(int i, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_) {
		nd().method361(this, i, i_247_, i_248_, i_249_, i_250_, i_251_, i_252_);
	}

	void dn() {
		if (!((ja) this).aBoolean6964) {
			((ja) this).anAArray6967 = null;
			((ja) this).aBa6941 = null;
			((ja) this).aClass249_6945 = null;
			for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -125))
				var_ba.ha();
			((ja) this).aClass471_6965.method5866(613065745);
			da();
			if (((ja) this).aBoolean6956) {
				Class95_Sub12.method1137(false, true, 1263109120);
				((ja) this).aBoolean6956 = false;
			}
			h();
			Class71.method824(1829269278);
			((ja) this).aBoolean6964 = true;
		}
	}

	public native int za();

	public native void gb(int i, int i_253_, int i_254_, int i_255_, int i_256_, int i_257_, byte[] is, int i_258_, int i_259_);

	public boolean ee() {
		return false;
	}

	public boolean ez() {
		return true;
	}

	public boolean ex() {
		return true;
	}

	public boolean ev() {
		return false;
	}

	public ja(Canvas canvas, Interface_ma interface_ma, int i, int i_260_) {
		super(interface_ma);
		((ja) this).nativeid = 0L;
		((ja) this).aClass471_6965 = new Class471();
		((ja) this).anInt6954 = 4096;
		((ja) this).anInt6942 = 4096;
		((ja) this).aBoolean6956 = false;
		try {
			if (!Class489.method6063(-1102372689).method327("sw3d", -1803295169))
				throw new RuntimeException("");
			Class71.method823((short) 17894);
			q(anInterface_ma4227, anInterface_ma4227.method219(-333379895), 0);
			Class318.method3166(false, true, -1368286637);
			((ja) this).aBoolean6956 = true;
			((ja) this).aClass249_6945 = new Class249();
			new Class260();
			((ja) this).aClass247_6952 = new Class247();
			new Class244();
			((ja) this).aClass249_6943 = new Class249();
			((ja) this).aClass249_6949 = new Class249();
			((ja) this).aClass249_6950 = new Class249();
			cw(new Class247());
			ci(new Class249());
			nr(1);
			nf(0);
			if (canvas != null) {
				method4780(canvas, i, i_260_, (short) -2793);
				method4784(canvas, -949621299);
			}
			int i_261_ = anInterface_ma4227.method219(-333379895);
			for (short i_262_ = 0; i_262_ < i_261_; i_262_++) {
				Class56 class56 = anInterface_ma4227.method221(i_262_, -82786481);
				if (class56 != null)
					V(i_262_, class56.aShort523, class56.aClass369_524.method297((short) -4947), class56.aByte525, class56.aByte526, class56.anInt527 * -2120684159, class56.anInt532 * -1963453415 == 64, class56.aByte529, class56.aByte534, class56.aByte531, class56.aByte530, class56.aBoolean533, class56.aBoolean519, class56.aBoolean517, class56.aBoolean536, class56.aBoolean537, class56.aByte538, class56.aBoolean508, class56.aBoolean514, class56.anInt520 * -721577829);
			}
		} catch (Throwable throwable) {
			method4781(628001038);
			throw new RuntimeException();
		}
	}

	native void oz(short i, int[] is, short i_263_, int i_264_, byte i_265_, byte i_266_, int i_267_, boolean bool, byte i_268_, byte i_269_, byte i_270_, byte i_271_, boolean bool_272_, boolean bool_273_, boolean bool_274_, boolean bool_275_, boolean bool_276_, byte i_277_, boolean bool_278_, boolean bool_279_, int i_280_);

	public boolean et() {
		return true;
	}

	public boolean ey() {
		return true;
	}

	public boolean ej() {
		return true;
	}

	public boolean ek() {
		return true;
	}

	public boolean eb() {
		return true;
	}

	public boolean eg() {
		return true;
	}

	public void eo(boolean bool) {
		/* empty */
	}

	public Interface8_Impl1_Impl1 ah(int i, int i_281_) {
		return new oa(i, i_281_);
	}

	public void eu(boolean bool) {
		/* empty */
	}

	Class76_Sub1 es(Canvas canvas, int i, int i_282_) {
		return new za(this, canvas, i, i_282_);
	}

	Class76_Sub1 fu(Canvas canvas, int i, int i_283_) {
		return new za(this, canvas, i, i_283_);
	}

	Class76_Sub1 ft(Canvas canvas, int i, int i_284_) {
		return new za(this, canvas, i, i_284_);
	}

	public native int[] fm(int i, int i_285_, int i_286_, int i_287_);

	public boolean cg() {
		return false;
	}

	public void fo(int i, int i_288_, int i_289_, int i_290_) {
		((ja) this).aFloat6953 = (float) i_289_ / 2.0F;
		((ja) this).aFloat6948 = (float) i_290_ / 2.0F;
		((ja) this).aFloat6960 = (float) i + ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = (float) i_288_ + ((ja) this).aFloat6948;
		A(i, i_288_, i_289_, i_290_);
	}

	public void fj(int i, int i_291_, int i_292_, int i_293_) {
		((ja) this).aFloat6953 = (float) i_292_ / 2.0F;
		((ja) this).aFloat6948 = (float) i_293_ / 2.0F;
		((ja) this).aFloat6960 = (float) i + ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = (float) i_291_ + ((ja) this).aFloat6948;
		A(i, i_291_, i_292_, i_293_);
	}

	public native void gj(int i, int i_294_, int i_295_, int i_296_, int i_297_);

	public native void fz(float f, float f_298_);

	public native void fc(int i, int i_299_, int i_300_, int i_301_);

	public Interface8_Impl1_Impl1 kb(int i, int i_302_, int i_303_) {
		return new oa(i, i_302_);
	}

	public native void fy(int i, int i_304_, int i_305_, int i_306_);

	public void ji(int i, int i_307_, int i_308_, int i_309_) {
		/* empty */
	}

	public native void fh(int i, int i_310_, int i_311_, int i_312_);

	public native void fl(int[] is);

	public native void fv(int[] is);

	public native void ff(int[] is);

	public boolean cu() {
		return false;
	}

	public native void fn(int i, int i_313_);

	public native void ik(int i, float f, float f_314_, float f_315_, float f_316_, float f_317_);

	public native void fd(int i, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_);

	public native void ga(int i, int i_323_, int i_324_, int i_325_, int i_326_);

	public native void fw(int i, int i_327_, int i_328_, int i_329_, int i_330_, int i_331_);

	public native void fp(int i, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_, byte[] is, int i_337_, int i_338_);

	public native void fb(int i, int i_339_, int i_340_, int i_341_, int i_342_, int i_343_, byte[] is, int i_344_, int i_345_);

	public Class_ta ch(int i, int i_346_, int[] is, int[] is_347_) {
		return new wa(this, ((ja) this).aBa6941, i, i_346_, is, is_347_);
	}

	native void gn(int i, int i_348_, int i_349_, int i_350_, int i_351_);

	public native void gd(int i, int i_352_, int i_353_, int i_354_, int i_355_);

	public native void N(int i, int i_356_, int i_357_, int i_358_, int i_359_, int i_360_, byte[] is, int i_361_, int i_362_);

	public int gv(int i, int i_363_, int i_364_, int i_365_, int i_366_, int i_367_) {
		int i_368_ = 0;
		float f = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[6] * (float) i_363_ + (((ja) this).aClass249_6950.aFloatArray2631[10] * (float) i_364_));
		float f_369_ = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * (float) i_365_ + ((ja) this).aClass249_6950.aFloatArray2631[6] * (float) i_366_ + (((ja) this).aClass249_6950.aFloatArray2631[10] * (float) i_367_));
		float f_370_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[7] * (float) i_363_ + (((ja) this).aClass249_6950.aFloatArray2631[11] * (float) i_364_));
		float f_371_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * (float) i_365_ + ((ja) this).aClass249_6950.aFloatArray2631[7] * (float) i_366_ + (((ja) this).aClass249_6950.aFloatArray2631[11] * (float) i_367_));
		if (f < -f_370_ && f_369_ < -f_371_)
			i_368_ |= 0x10;
		else if (f > f_370_ && f_369_ > f_371_)
			i_368_ |= 0x20;
		float f_372_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[4] * (float) i_363_ + (((ja) this).aClass249_6950.aFloatArray2631[8] * (float) i_364_));
		float f_373_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * (float) i_365_ + ((ja) this).aClass249_6950.aFloatArray2631[4] * (float) i_366_ + (((ja) this).aClass249_6950.aFloatArray2631[8] * (float) i_367_));
		if (f_372_ < -f_370_ && f_373_ < -f_371_)
			i_368_ |= 0x1;
		if (f_372_ > f_370_ && f_373_ > f_371_)
			i_368_ |= 0x2;
		float f_374_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[5] * (float) i_363_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * (float) i_364_));
		float f_375_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * (float) i_365_ + ((ja) this).aClass249_6950.aFloatArray2631[5] * (float) i_366_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * (float) i_367_));
		if (f_374_ < -f_370_ && f_375_ < -f_371_)
			i_368_ |= 0x4;
		if (f_374_ > f_370_ && f_375_ > f_371_)
			i_368_ |= 0x8;
		return i_368_;
	}

	public native void ib(int i, int i_376_, int i_377_);

	public native void gl(int i, int i_378_, int i_379_, int i_380_, int i_381_);

	public void gz(int i, int i_382_, int i_383_, int i_384_, int i_385_, int i_386_) {
		YA(i, i_382_, i_383_, i_384_, i_385_, i_386_);
	}

	public boolean ie() {
		return false;
	}

	public void gk(int i, int i_387_, int i_388_, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_) {
		/* empty */
	}

	public void gw(int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, Class_ta class_ta, int i_400_, int i_401_) {
		R(i, i_395_, i_396_, i_397_, i_398_, i_399_, class_ta, i_400_, i_401_);
	}

	public void ge(int i, int i_402_, int i_403_, int i_404_, int i_405_, int i_406_, int i_407_) {
		nd().method361(this, i, i_402_, i_403_, i_404_, i_405_, i_406_, i_407_);
	}

	public void df() {
		/* empty */
	}

	public void gq(int i, int i_408_, int i_409_, int i_410_, int i_411_, int i_412_, int i_413_) {
		nd().method361(this, i, i_408_, i_409_, i_410_, i_411_, i_412_, i_413_);
	}

	public void be(int i, int i_414_, int i_415_, int i_416_, int i_417_, int i_418_, Class_ta class_ta, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_) {
		/* empty */
	}

	public int gf(int i, int i_424_, int i_425_, int i_426_, int i_427_, int i_428_) {
		int i_429_ = 0;
		float f = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[6] * (float) i_424_ + (((ja) this).aClass249_6950.aFloatArray2631[10] * (float) i_425_));
		float f_430_ = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * (float) i_426_ + ((ja) this).aClass249_6950.aFloatArray2631[6] * (float) i_427_ + (((ja) this).aClass249_6950.aFloatArray2631[10] * (float) i_428_));
		float f_431_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[7] * (float) i_424_ + (((ja) this).aClass249_6950.aFloatArray2631[11] * (float) i_425_));
		float f_432_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * (float) i_426_ + ((ja) this).aClass249_6950.aFloatArray2631[7] * (float) i_427_ + (((ja) this).aClass249_6950.aFloatArray2631[11] * (float) i_428_));
		if (f < -f_431_ && f_430_ < -f_432_)
			i_429_ |= 0x10;
		else if (f > f_431_ && f_430_ > f_432_)
			i_429_ |= 0x20;
		float f_433_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[4] * (float) i_424_ + (((ja) this).aClass249_6950.aFloatArray2631[8] * (float) i_425_));
		float f_434_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * (float) i_426_ + ((ja) this).aClass249_6950.aFloatArray2631[4] * (float) i_427_ + (((ja) this).aClass249_6950.aFloatArray2631[8] * (float) i_428_));
		if (f_433_ < -f_431_ && f_434_ < -f_432_)
			i_429_ |= 0x1;
		if (f_433_ > f_431_ && f_434_ > f_432_)
			i_429_ |= 0x2;
		float f_435_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * (float) i + ((ja) this).aClass249_6950.aFloatArray2631[5] * (float) i_424_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * (float) i_425_));
		float f_436_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * (float) i_426_ + ((ja) this).aClass249_6950.aFloatArray2631[5] * (float) i_427_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * (float) i_428_));
		if (f_435_ < -f_431_ && f_436_ < -f_432_)
			i_429_ |= 0x4;
		if (f_435_ > f_431_ && f_436_ > f_432_)
			i_429_ |= 0x8;
		return i_429_;
	}

	public Interface8_Impl1_Impl1 kv(int i, int i_437_, int i_438_) {
		return new oa(i, i_437_);
	}

	public Class_v gi(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).aClass471_6965.method5878(var_ba, (short) 8192);
		return var_ba;
	}

	native void oq(int i, int[] is, float[] fs);

	public void go(Class_v class_v) {
		((ja) this).aBa6941 = (ba) class_v;
		n(class_v);
	}

	public Class76_Sub2 jk() {
		return new o(this);
	}

	public void gc(Class_v class_v) {
		((ja) this).aBa6941 = (ba) class_v;
		n(class_v);
	}

	public Class61 gt(int i, int i_439_, boolean bool, boolean bool_440_) {
		return new fa(this, i, i_439_, bool_440_);
	}

	public Class61 gm(int i, int i_441_, boolean bool, boolean bool_442_) {
		return new fa(this, i, i_441_, bool_442_);
	}

	native void oa(short i, int[] is, short i_443_, int i_444_, byte i_445_, byte i_446_, int i_447_, boolean bool, byte i_448_, byte i_449_, byte i_450_, byte i_451_, boolean bool_452_, boolean bool_453_, boolean bool_454_, boolean bool_455_, boolean bool_456_, byte i_457_, boolean bool_458_, boolean bool_459_, int i_460_);

	public void dw(int i) {
		Class71.method826(-1305512390);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -44))
			var_ba.u();
	}

	public Class61 hm(int[] is, int i, int i_461_, int i_462_, int i_463_, boolean bool) {
		return new fa(this, is, i, i_461_, i_462_, i_463_, false);
	}

	public Class61 hv(int[] is, int i, int i_464_, int i_465_, int i_466_, boolean bool) {
		return new fa(this, is, i, i_464_, i_465_, i_466_, false);
	}

	public Class61 hi(Class87 class87, boolean bool) {
		fa var_fa = new fa(this, class87.method1031(false), 0, class87.method986(), class87.method986(), class87.method994(), false);
		var_fa.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return var_fa;
	}

	public Class61 hq(Class87 class87, boolean bool) {
		fa var_fa = new fa(this, class87.method1031(false), 0, class87.method986(), class87.method986(), class87.method994(), false);
		var_fa.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return var_fa;
	}

	native void oh();

	public native void x(boolean bool);

	public void fa(int i, int i_467_, int i_468_, int i_469_) {
		((ja) this).aFloat6953 = (float) i_468_ / 2.0F;
		((ja) this).aFloat6948 = (float) i_469_ / 2.0F;
		((ja) this).aFloat6960 = (float) i + ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = (float) i_467_ + ((ja) this).aFloat6948;
		A(i, i_467_, i_468_, i_469_);
	}

	public Class61 ht(int i, int i_470_, int i_471_, int i_472_, boolean bool) {
		return new fa(this, i, i_470_, i_471_, i_472_, !bool);
	}

	public Class_ta hc(int i, int i_473_, int[] is, int[] is_474_) {
		return new wa(this, ((ja) this).aBa6941, i, i_473_, is, is_474_);
	}

	public Class_ta hy(int i, int i_475_, int[] is, int[] is_476_) {
		return new wa(this, ((ja) this).aBa6941, i, i_475_, is, is_476_);
	}

	public native void hu(int i, Class_ta class_ta, int i_477_, int i_478_);

	public native void hr(int i, Class_ta class_ta, int i_479_, int i_480_);

	public final void jm(int i, Class77 class77) {
		M(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	public void hw(int i) {
		((ja) this).anInt6954 = ((ja) this).anInt6942 = i;
		if (((ja) this).anInt6955 > 1)
			throw new IllegalStateException();
		nr(((ja) this).anInt6955);
		nf(0);
	}

	native void V(short i, short i_481_, int i_482_, byte i_483_, byte i_484_, int i_485_, boolean bool, byte i_486_, byte i_487_, byte i_488_, byte i_489_, boolean bool_490_, boolean bool_491_, boolean bool_492_, boolean bool_493_, boolean bool_494_, byte i_495_, boolean bool_496_, boolean bool_497_, int i_498_);

	native void oo(long l, long l_499_);

	public Class76_Sub2 jp() {
		return new o(this);
	}

	public Class387 hb(Model class98, int i, int i_500_, int i_501_, int i_502_) {
		return new h(this, ((ja) this).aBa6941, class98, i, i_500_, i_501_, i_502_);
	}

	public int he(int i, int i_503_) {
		int i_504_ = i & 0xfffff;
		int i_505_ = i_503_ & 0xfffff;
		return i_504_ & i_505_ ^ i_505_;
	}

	public Class387 hg(Model class98, int i, int i_506_, int i_507_, int i_508_) {
		return new h(this, ((ja) this).aBa6941, class98, i, i_506_, i_507_, i_508_);
	}

	public int hj(int i, int i_509_) {
		return i | i_509_;
	}

	public Class_xa hx(int i, int i_510_, int[][] is, int[][] is_511_, int i_512_, int i_513_, int i_514_) {
		return new i(this, ((ja) this).aBa6941, i, i_510_, is, is_511_, i_512_, i_513_, i_514_);
	}

	public Class_xa hp(int i, int i_515_, int[][] is, int[][] is_516_, int i_517_, int i_518_, int i_519_) {
		return new i(this, ((ja) this).aBa6941, i, i_515_, is, is_516_, i_517_, i_518_, i_519_);
	}

	public void ii(int i, Class330_Sub14[] class330_sub14s) {
		int i_520_ = 0;
		for (int i_521_ = 0; i_521_ < i; i_521_++) {
			anIntArray6940[i_520_++] = class330_sub14s[i_521_].method3318(-1475966422);
			anIntArray6940[i_520_++] = class330_sub14s[i_521_].method3311((byte) 15);
			anIntArray6940[i_520_++] = class330_sub14s[i_521_].method3312((short) 23360);
			anIntArray6940[i_520_++] = class330_sub14s[i_521_].method3316((byte) -90);
			aFloatArray6966[i_521_] = class330_sub14s[i_521_].method3317(176628296);
			anIntArray6940[i_520_++] = class330_sub14s[i_521_].method3313(-1570836542);
		}
		Q(i, anIntArray6940, aFloatArray6966);
	}

	public Class247 ih() {
		return ((ja) this).aClass247_6947;
	}

	public void ir(Class249 class249) {
		((ja) this).aClass249_6949 = class249;
		wa(((ja) this).aClass249_6949.aFloatArray2631);
		((ja) this).aClass249_6950.method2484(((ja) this).aClass249_6943, ((ja) this).aClass249_6949);
	}

	public Class249 io() {
		return ((ja) this).aClass249_6949;
	}

	public Class249 ic() {
		return ((ja) this).aClass249_6949;
	}

	void od(Class81 class81, boolean bool) {
		int i = 0;
		int i_522_ = 0;
		int i_523_ = 0;
		int i_524_ = 0;
		int i_525_ = 0;
		for (Class325_Sub3_Sub1 class325_sub3_sub1 = ((Class325_Sub3_Sub1) class81.aClass461_675.method5694(74598965)); class325_sub3_sub1 != null; class325_sub3_sub1 = ((Class325_Sub3_Sub1) class81.aClass461_675.method5695(1102015006))) {
			anIntArray6968[i++] = class325_sub3_sub1.anInt9497;
			anIntArray6968[i++] = class325_sub3_sub1.anInt9493;
			anIntArray6968[i++] = class325_sub3_sub1.anInt9489;
			anIntArray6969[i_522_++] = class325_sub3_sub1.anInt9490;
			aShortArray6971[i_524_++] = (short) class325_sub3_sub1.anInt9492;
			anIntArray6970[i_523_++] = class325_sub3_sub1.anInt9494;
			if (bool)
				aByteArray6951[i_525_++] = class325_sub3_sub1.aByte9488;
		}
	}

	public native void ia(float f);

	native void og(int i, int i_526_, int i_527_, int i_528_);

	public void g(int i) {
		Class71.method826(-1594867633);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).aClass471_6965.method5869(539664854); var_ba != null; var_ba = (ba) ((ja) this).aClass471_6965.method5873((byte) -50))
			var_ba.u();
	}

	public Class76_Sub2 jw() {
		return new o(this);
	}

	public native void iw(int i);

	public boolean al() {
		return true;
	}

	public native void iz(int i, float f, float f_529_, float f_530_, float f_531_, float f_532_);

	public native void ig(int i, int i_533_, int i_534_);

	public Class92 ix(int i, int i_535_, int i_536_, int i_537_, int i_538_, int i_539_) {
		return null;
	}

	public void fr() {
		/* empty */
	}

	public Class92 ip(int i, int i_540_, int i_541_, int i_542_, int i_543_, int i_544_) {
		return null;
	}

	public Class61 hl(int i, int i_545_, int i_546_, int i_547_, boolean bool) {
		return new fa(this, i, i_545_, i_546_, i_547_, !bool);
	}

	public Class92 in(Class92 class92, Class92 class92_548_, float f, Class92 class92_549_) {
		return null;
	}

	public void is(Class92 class92) {
		/* empty */
	}

	public boolean iv() {
		return false;
	}

	public boolean it() {
		return false;
	}

	public void id() {
		/* empty */
	}

	public void im() {
		/* empty */
	}

	native void nx(Class_v class_v);

	public int ct(int i, int i_550_) {
		int i_551_ = i & 0xfffff;
		int i_552_ = i_550_ & 0xfffff;
		return i_551_ & i_552_ ^ i_552_;
	}

	public Class92 iq(int i, int i_553_, int i_554_, int i_555_, int i_556_, int i_557_) {
		return null;
	}

	void ju(float f, float f_558_, float f_559_, float f_560_, float f_561_, float f_562_) {
		/* empty */
	}

	public void jn(int i, int i_563_, int i_564_, int i_565_) {
		/* empty */
	}

	public void jg(int i, int i_566_, int i_567_, int i_568_) {
		/* empty */
	}

	public Class247 kw() {
		return ((ja) this).aClass247_6952;
	}

	public boolean eq() {
		return true;
	}

	public void jt() {
		/* empty */
	}

	public final void ja(int i, Class77 class77) {
		M(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	public Class61 hf(int i, int i_569_, int i_570_, int i_571_, boolean bool) {
		return new fa(this, i, i_569_, i_570_, i_571_, !bool);
	}

	public Class61 bw(Class87 class87, boolean bool) {
		fa var_fa = new fa(this, class87.method1031(false), 0, class87.method986(), class87.method986(), class87.method994(), false);
		var_fa.method717(class87.method983(), class87.method990(), class87.method989(), class87.method991());
		return var_fa;
	}

	public final void jf(int i, Class77 class77) {
		M(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	public final void jb(int i, Class77 class77) {
		M(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	public final void jj(int i, Class77 class77) {
		JA(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	public native void method_if(int i, int i_572_, int i_573_);

	public final void jq(int i, Class77 class77) {
		JA(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	public boolean aw() {
		return true;
	}

	public void jr(int i, int i_574_, float f, int i_575_, int i_576_, float f_577_, int i_578_, int i_579_, float f_580_, int i_581_, int i_582_, int i_583_, int i_584_) {
		throw new IllegalStateException();
	}

	public Class61 hk(int i, int i_585_, int i_586_, int i_587_, boolean bool) {
		return new fa(this, i, i_585_, i_586_, i_587_, !bool);
	}

	native void oe(float[] fs);

	public boolean en() {
		return true;
	}

	public Class61 hz(int i, int i_588_, boolean bool, boolean bool_589_) {
		return new fa(this, i, i_588_, bool_589_);
	}

	public Class76_Sub2 jy() {
		return new o(this);
	}

	public void jz(float f, float f_590_, float f_591_, float[] fs) {
		float f_592_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * f + ((ja) this).aClass249_6950.aFloatArray2631[7] * f_590_ + ((ja) this).aClass249_6950.aFloatArray2631[11] * f_591_);
		float f_593_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * f + ((ja) this).aClass249_6950.aFloatArray2631[4] * f_590_ + ((ja) this).aClass249_6950.aFloatArray2631[8] * f_591_);
		float f_594_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * f + ((ja) this).aClass249_6950.aFloatArray2631[5] * f_590_ + ((ja) this).aClass249_6950.aFloatArray2631[9] * f_591_);
		float f_595_ = (((ja) this).aClass249_6943.aFloatArray2631[14] + ((ja) this).aClass249_6943.aFloatArray2631[2] * f + ((ja) this).aClass249_6943.aFloatArray2631[6] * f_590_ + ((ja) this).aClass249_6943.aFloatArray2631[10] * f_591_);
		fs[0] = (((ja) this).aFloat6960 + ((ja) this).aFloat6953 * f_593_ / f_592_);
		fs[1] = (((ja) this).aFloat6944 + ((ja) this).aFloat6948 * f_594_ / f_592_);
		fs[2] = f_595_;
	}

	public native void fe(int i, int i_596_, int i_597_, int i_598_);

	public Class76_Sub2 jv() {
		return new o(this);
	}

	public Interface8_Impl1_Impl2 jx(int i, int i_599_, Class72 class72, Class86 class86, int i_600_) {
		return no(i, i_599_);
	}

	public Interface8_Impl1_Impl1 kp(int i, int i_601_) {
		return new oa(i, i_601_);
	}

	public final void je(int i, Class77 class77) {
		JA(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	public Interface8_Impl1_Impl1 kh(int i, int i_602_, int i_603_) {
		return new oa(i, i_602_);
	}

	public void cw(Class247 class247) {
		((ja) this).aClass247_6947 = class247;
		((ja) this).aClass249_6943.method2508(class247);
		AA(((ja) this).aClass249_6943.aFloatArray2631);
		((ja) this).aClass249_6950.method2484(((ja) this).aClass249_6943, ((ja) this).aClass249_6949);
	}

	public boolean er() {
		return true;
	}

	synchronized void gy() {
		method4781(628001038);
		if (((ja) this).nativeid != 0L)
			Class71.method827(this, -873273575);
	}

	public boolean kj() {
		return true;
	}

	public boolean ka() {
		return true;
	}

	public boolean km() {
		return true;
	}

	public boolean ky() {
		return false;
	}

	public boolean ku() {
		return false;
	}

	public native void fi(int i, int i_604_);

	public void ae(int i, int i_605_, int i_606_, int i_607_) {
		((ja) this).aFloat6953 = (float) i_606_ / 2.0F;
		((ja) this).aFloat6948 = (float) i_607_ / 2.0F;
		((ja) this).aFloat6960 = (float) i + ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = (float) i_605_ + ((ja) this).aFloat6948;
		A(i, i_605_, i_606_, i_607_);
	}

	public void ef(boolean bool) {
		/* empty */
	}

	public Class249 kf() {
		return ((ja) this).aClass249_6945;
	}

	public boolean el() {
		return true;
	}

	public native void il(int i);

	public void gp(Class_v class_v) {
		((ja) this).aBa6941 = (ba) class_v;
		n(class_v);
	}

	a ol() {
		for (int i = 0; i < ((ja) this).anInt6955; i++) {
			if (((a) ((ja) this).anAArray6967[i]).aRunnable6930 == Thread.currentThread())
				return ((ja) this).anAArray6967[i];
		}
		return null;
	}

	public void kq() {
		((ja) this).aFloat6953 = (float) method4782((byte) 0).method856() / 2.0F;
		((ja) this).aFloat6948 = (float) method4782((byte) 0).method857() / 2.0F;
		((ja) this).aFloat6960 = ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = ((ja) this).aFloat6948;
		k();
	}

	public void kg() {
		((ja) this).aFloat6953 = (float) method4782((byte) 0).method856() / 2.0F;
		((ja) this).aFloat6948 = (float) method4782((byte) 0).method857() / 2.0F;
		((ja) this).aFloat6960 = ((ja) this).aFloat6953;
		((ja) this).aFloat6944 = ((ja) this).aFloat6948;
		k();
	}

	void nc(Class81 class81, boolean bool) {
		int i = 0;
		int i_608_ = 0;
		int i_609_ = 0;
		int i_610_ = 0;
		int i_611_ = 0;
		for (Class325_Sub3_Sub1 class325_sub3_sub1 = ((Class325_Sub3_Sub1) class81.aClass461_675.method5694(1991035183)); class325_sub3_sub1 != null; class325_sub3_sub1 = ((Class325_Sub3_Sub1) class81.aClass461_675.method5695(316000903))) {
			anIntArray6968[i++] = class325_sub3_sub1.anInt9497;
			anIntArray6968[i++] = class325_sub3_sub1.anInt9493;
			anIntArray6968[i++] = class325_sub3_sub1.anInt9489;
			anIntArray6969[i_608_++] = class325_sub3_sub1.anInt9490;
			aShortArray6971[i_610_++] = (short) class325_sub3_sub1.anInt9492;
			anIntArray6970[i_609_++] = class325_sub3_sub1.anInt9494;
			if (bool)
				aByteArray6951[i_611_++] = class325_sub3_sub1.aByte9488;
		}
	}

	public native void ko();

	public native void kz();

	native void ox(za var_za);

	public void kd(Class247 class247) {
		((ja) this).aClass247_6947 = class247;
		((ja) this).aClass249_6943.method2508(class247);
		AA(((ja) this).aClass249_6943.aFloatArray2631);
		((ja) this).aClass249_6950.method2484(((ja) this).aClass249_6943, ((ja) this).aClass249_6949);
	}

	public Class387 hs(Model class98, int i, int i_612_, int i_613_, int i_614_) {
		return new h(this, ((ja) this).aBa6941, class98, i, i_612_, i_613_, i_614_);
	}

	public native void kr(boolean bool);

	public native void lp(boolean bool);

	public int ln() {
		return 4;
	}

	synchronized void gg() {
		method4781(628001038);
		if (((ja) this).nativeid != 0L)
			Class71.method827(this, -1037215170);
	}

	public void gh(int i, int i_615_, int i_616_, int i_617_, int i_618_, int i_619_, int i_620_) {
		nd().method361(this, i, i_615_, i_616_, i_617_, i_618_, i_619_, i_620_);
	}

	native void nw(Interface_ma interface_ma, int i, int i_621_);

	native void np(Interface_ma interface_ma, int i, int i_622_);

	native void nz(int i, int i_623_, int i_624_, int i_625_, int i_626_, int i_627_);

	native void nn(int i, int i_628_, int i_629_, int i_630_, int i_631_, int i_632_);

	native void nt();

	public Class_xa cn(int i, int i_633_, int[][] is, int[][] is_634_, int i_635_, int i_636_, int i_637_) {
		return new i(this, ((ja) this).aBa6941, i, i_633_, is, is_634_, i_635_, i_636_, i_637_);
	}

	public Class249 cs() {
		return ((ja) this).aClass249_6949;
	}

	native void ns(int i);

	native void nm(int i);

	public boolean ep() {
		return false;
	}

	public Class76_Sub2 ag() {
		return new o(this);
	}

	public void gr(int i, int i_638_, int i_639_, int i_640_, int i_641_, int i_642_) {
		YA(i, i_638_, i_639_, i_640_, i_641_, i_642_);
	}

	public native void m(int i, float f, float f_643_, float f_644_, float f_645_, float f_646_);

	native void R(int i, int i_647_, int i_648_, int i_649_, int i_650_, int i_651_, Class_ta class_ta, int i_652_, int i_653_);

	native void ot(short i, short i_654_, int i_655_, byte i_656_, byte i_657_, int i_658_, boolean bool, byte i_659_, byte i_660_, byte i_661_, byte i_662_, boolean bool_663_, boolean bool_664_, boolean bool_665_, boolean bool_666_, boolean bool_667_, byte i_668_, boolean bool_669_, boolean bool_670_, int i_671_);

	public void jd(float f, float f_672_, float f_673_, float[] fs) {
		float f_674_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * f + ((ja) this).aClass249_6950.aFloatArray2631[7] * f_672_ + ((ja) this).aClass249_6950.aFloatArray2631[11] * f_673_);
		float f_675_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * f + ((ja) this).aClass249_6950.aFloatArray2631[4] * f_672_ + ((ja) this).aClass249_6950.aFloatArray2631[8] * f_673_);
		float f_676_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * f + ((ja) this).aClass249_6950.aFloatArray2631[5] * f_672_ + ((ja) this).aClass249_6950.aFloatArray2631[9] * f_673_);
		float f_677_ = (((ja) this).aClass249_6943.aFloatArray2631[14] + ((ja) this).aClass249_6943.aFloatArray2631[2] * f + ((ja) this).aClass249_6943.aFloatArray2631[6] * f_672_ + ((ja) this).aClass249_6943.aFloatArray2631[10] * f_673_);
		fs[0] = (((ja) this).aFloat6960 + ((ja) this).aFloat6953 * f_675_ / f_674_);
		fs[1] = (((ja) this).aFloat6944 + ((ja) this).aFloat6948 * f_676_ / f_674_);
		fs[2] = f_677_;
	}

	public native void ke();

	public void l() {
		/* empty */
	}

	void dj(int i, int i_678_) throws Exception_Sub1 {
		za var_za = (za) method4800(-924859015);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method883(i, i_678_);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 27553);
	}

	native void oj(za var_za);

	public void hn(int i) {
		((ja) this).anInt6954 = ((ja) this).anInt6942 = i;
		if (((ja) this).anInt6955 > 1)
			throw new IllegalStateException();
		nr(((ja) this).anInt6955);
		nf(0);
	}

	native void op(long l, long l_679_);

	void cc(float f, float f_680_, float f_681_, float f_682_, float f_683_, float f_684_) {
		/* empty */
	}

	void h() {
		System.gc();
		System.runFinalization();
		Class71.method826(-384631976);
	}

	native void of();

	public Class51 dt() {
		return new Class51(0, "SSE", 1, "CPU", 0L);
	}

	static {
		aFloatArray6963 = new float[20];
		anIntArray6962 = new int[6];
		anIntArray6940 = anIntArray6972;
		aFloatArray6966 = aFloatArray6963;
		anIntArray6946 = anIntArray6972;
		anIntArray6968 = anIntArray6972;
		anIntArray6969 = new int[8191];
		anIntArray6970 = new int[8191];
		aShortArray6971 = new short[8191];
		aByteArray6951 = new byte[8191];
	}

	public final void jo(int i, Class77 class77) {
		M(i, class77.anInt652 * -576105833, class77.anInt650 * -348036733, class77.anInt651 * -892945375);
	}

	void oc(int i) {
		((ja) this).anAArray6967[i].method345();
	}

	public void jl(float f, float f_685_, float f_686_, float[] fs) {
		float f_687_ = (((ja) this).aClass249_6950.aFloatArray2631[14] + ((ja) this).aClass249_6950.aFloatArray2631[2] * f + ((ja) this).aClass249_6950.aFloatArray2631[6] * f_685_ + ((ja) this).aClass249_6950.aFloatArray2631[10] * f_686_);
		float f_688_ = (((ja) this).aClass249_6950.aFloatArray2631[15] + ((ja) this).aClass249_6950.aFloatArray2631[3] * f + ((ja) this).aClass249_6950.aFloatArray2631[7] * f_685_ + ((ja) this).aClass249_6950.aFloatArray2631[11] * f_686_);
		if (f_687_ < -f_688_ || f_687_ > f_688_) {
			float[] fs_689_ = fs;
			float[] fs_690_ = fs;
			fs[2] = Float.NaN;
			fs_690_[1] = Float.NaN;
			fs_689_[0] = Float.NaN;
		} else {
			float f_691_ = (((ja) this).aClass249_6950.aFloatArray2631[12] + ((ja) this).aClass249_6950.aFloatArray2631[0] * f + ((ja) this).aClass249_6950.aFloatArray2631[4] * f_685_ + ((ja) this).aClass249_6950.aFloatArray2631[8] * f_686_);
			if (f_691_ < -f_688_ || f_691_ > f_688_) {
				float[] fs_692_ = fs;
				float[] fs_693_ = fs;
				fs[2] = Float.NaN;
				fs_693_[1] = Float.NaN;
				fs_692_[0] = Float.NaN;
			} else {
				float f_694_ = (((ja) this).aClass249_6950.aFloatArray2631[13] + ((ja) this).aClass249_6950.aFloatArray2631[1] * f + ((ja) this).aClass249_6950.aFloatArray2631[5] * f_685_ + (((ja) this).aClass249_6950.aFloatArray2631[9] * f_686_));
				if (f_694_ < -f_688_ || f_694_ > f_688_) {
					float[] fs_695_ = fs;
					float[] fs_696_ = fs;
					fs[2] = Float.NaN;
					fs_696_[1] = Float.NaN;
					fs_695_[0] = Float.NaN;
				} else {
					float f_697_ = (((ja) this).aClass249_6943.aFloatArray2631[14] + ((ja) this).aClass249_6943.aFloatArray2631[2] * f + (((ja) this).aClass249_6943.aFloatArray2631[6] * f_685_) + (((ja) this).aClass249_6943.aFloatArray2631[10] * f_686_));
					fs[0] = (((ja) this).aFloat6960 + ((ja) this).aFloat6953 * f_691_ / f_688_);
					fs[1] = (((ja) this).aFloat6944 + ((ja) this).aFloat6948 * f_694_ / f_688_);
					fs[2] = f_697_;
				}
			}
		}
	}

	a ow() {
		for (int i = 0; i < ((ja) this).anInt6955; i++) {
			if (((a) ((ja) this).anAArray6967[i]).aRunnable6930 == Thread.currentThread())
				return ((ja) this).anAArray6967[i];
		}
		return null;
	}

	public void js(int i, int i_698_, int i_699_, int i_700_) {
		/* empty */
	}

	native void os(float[] fs);

	public void gu(int i, int i_701_, int i_702_, int i_703_, int i_704_, int i_705_, int i_706_) {
		nd().method361(this, i, i_701_, i_702_, i_703_, i_704_, i_705_, i_706_);
	}

	public Class92 iu(Class92 class92, Class92 class92_707_, float f, Class92 class92_708_) {
		return null;
	}

	native void oy(float[] fs);

	native void om(int i, int i_709_, int i_710_, int i_711_);

	native void or(int i, int i_712_, int i_713_, int i_714_);

	public void kn(Class81 class81) {
		if (!class81.aClass461_675.method5698(-1515781372)) {
			nc(class81, false);
			nd().method369(this, anIntArray6968, anIntArray6969, anIntArray6970, aShortArray6971, class81.aClass461_675.method5697(66131531));
		}
	}

	public void ki(int i, int i_715_, int i_716_, int i_717_, int i_718_, int i_719_, Class_ta class_ta, int i_720_, int i_721_, int i_722_, int i_723_, int i_724_) {
		/* empty */
	}

	native void pw(int i, int i_725_, int i_726_, int i_727_);

	native void pd(int i, int i_728_, int i_729_, int i_730_);

	native void pg(int i, int i_731_, int i_732_, int i_733_);

	Interface8_Impl1_Impl2 pn(int i, int i_734_) {
		return (fa) bn(i, i_734_, false, true);
	}

	Interface8_Impl1_Impl2 pq(int i, int i_735_) {
		return (fa) bn(i, i_735_, false, true);
	}

	native void oi(int i, int i_736_, int i_737_, int i_738_);
}
