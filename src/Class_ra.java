/* Class_ra - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class_ra {
	protected static int anInt4219 = 8;
	public static int anInt4220 = 1;
	protected static int anInt4221 = 1;
	public static int anInt4222 = 3;
	public static int anInt4223 = 5;
	static int anInt4224 = 8;
	public static int anInt4225 = 0;
	public int anInt4226;
	public Interface_ma anInterface_ma4227;
	protected Class76 aClass76_4228;
	static int anInt4229 = 4;
	public static int anInt4230 = 2;
	protected Hashtable aHashtable4231;
	protected static int anInt4232 = 2;
	protected static int anInt4233 = 4;
	protected Class76_Sub1 aClass76_Sub1_4234;
	protected static int anInt4235 = 16;
	protected static int anInt4236 = 32;
	static boolean[] aBooleanArray4237 = new boolean[8];
	int anInt4238 = -1828897599;
	public static int anInt4239 = 2;
	public static int anInt4240 = 1;
	public static int anInt4241 = 0;
	Class76_Sub2[] aClass76_Sub2Array4242;

	public abstract boolean em();

	public abstract Class61 bu(int[] is, int i, int i_0_, int i_1_, int i_2_, boolean bool);

	public final void method4780(Canvas canvas, int i, int i_3_, short i_4_) {
		try {
			if (!aHashtable4231.containsKey(canvas)) {
				Class377.method4375(canvas, -1433851980);
				method4805(canvas, ak(canvas, i, i_3_), 1850446711);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.ax(").append(')').toString());
		}
	}

	abstract void w(int i, int i_5_) throws Exception_Sub1;

	public abstract void l();

	public void method4781(int i) {
		try {
			aBooleanArray4237[1409150453 * anInt4226] = false;
			Enumeration enumeration = aHashtable4231.keys();
			while (enumeration.hasMoreElements()) {
				Canvas canvas = (Canvas) enumeration.nextElement();
				Class76_Sub1 class76_sub1 = (Class76_Sub1) aHashtable4231.get(canvas);
				class76_sub1.method179();
			}
			u();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.b(").append(')').toString());
		}
	}

	public abstract boolean ec();

	public abstract void fq(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_);

	public abstract void gh(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_);

	public abstract boolean a();

	public abstract void ef(boolean bool);

	public abstract boolean t();

	public abstract void B(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_);

	public abstract boolean v();

	public abstract boolean ay();

	public abstract boolean al();

	public abstract Class92 iu(Class92 class92, Class92 class92_22_, float f, Class92 class92_23_);

	public abstract boolean aw();

	public abstract Class249 kf();

	public final Class76 method4782(byte i) {
		try {
			return aClass76_4228;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.as(").append(')').toString());
		}
	}

	public abstract void id();

	public abstract void gd(int i, int i_24_, int i_25_, int i_26_, int i_27_);

	public abstract void js(int i, int i_28_, int i_29_, int i_30_);

	public final void method4783(Canvas canvas, int i) {
		try {
			if (aHashtable4231.containsKey(canvas)) {
				Class76_Sub1 class76_sub1 = (Class76_Sub1) aHashtable4231.get(canvas);
				class76_sub1.method179();
				aHashtable4231.remove(canvas);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.an(").append(')').toString());
		}
	}

	public final void method4784(Canvas canvas, int i) {
		try {
			Class76_Sub1 class76_sub1 = (Class76_Sub1) aHashtable4231.get(canvas);
			if (null == class76_sub1)
				throw new RuntimeException();
			if (1505668287 * ((Class_ra) this).anInt4238 > 0 || aClass76_4228 != aClass76_Sub1_4234)
				throw new RuntimeException();
			if (null != aClass76_4228)
				aClass76_4228.method862();
			if (1505668287 * ((Class_ra) this).anInt4238 < 0)
				aClass76_4228 = class76_sub1;
			aClass76_Sub1_4234 = class76_sub1;
			class76_sub1.method174();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.af(").append(')').toString());
		}
	}

	public abstract void by(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_);

	public final void method4785(Class76_Sub2 class76_sub2, byte i) {
		try {
			if (((Class_ra) this).anInt4238 * 1505668287 >= 3)
				throw new RuntimeException();
			if (((Class_ra) this).anInt4238 * 1505668287 >= 0)
				((Class_ra) this).aClass76_Sub2Array4242[1505668287 * ((Class_ra) this).anInt4238].method862();
			else
				aClass76_Sub1_4234.method862();
			aClass76_4228 = ((Class_ra) this).aClass76_Sub2Array4242[((((Class_ra) this).anInt4238 += 1828897599) * 1505668287)] = class76_sub2;
			class76_sub2.method174();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.aa(").append(')').toString());
		}
	}

	abstract Class76_Sub1 fu(Canvas canvas, int i, int i_37_);

	abstract Class76_Sub1 ak(Canvas canvas, int i, int i_38_);

	abstract void dn();

	public abstract Interface8_Impl1_Impl1 ah(int i, int i_39_);

	public abstract void gr(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_);

	public abstract void am();

	public final void method4786(int i) throws Exception_Sub1 {
		try {
			w(0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.z(").append(')').toString());
		}
	}

	public abstract void ae(int i, int i_45_, int i_46_, int i_47_);

	public abstract void GA(float f, float f_48_);

	public abstract boolean e();

	public abstract void r(int i, int i_49_, int i_50_, int i_51_);

	public abstract void o(int i, int i_52_, int i_53_, int i_54_);

	public void method4787(boolean bool) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.ao(").append(')').toString());
		}
	}

	public abstract void qa(int[] is);

	public abstract boolean ea();

	public final void method4788(int i, int i_55_, int i_56_, int i_57_, int i_58_, byte i_59_) {
		try {
			bl(i, i_55_, i_56_, i_57_, i_58_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bg(").append(')').toString());
		}
	}

	public final void method4789(int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		try {
			B(i, i_60_, i_61_, i_62_, i_63_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bs(").append(')').toString());
		}
	}

	public boolean method4790(byte i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.co(").append(')').toString());
		}
	}

	public abstract Class247 cq();

	public abstract Class92 cp(Class92 class92, Class92 class92_65_, float f, Class92 class92_66_);

	public final void method4791(int i, int i_67_, int i_68_, int i_69_, int i_70_, byte i_71_) {
		try {
			br(i, i_67_, i_68_, i_69_, i_70_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bf(").append(')').toString());
		}
	}

	public abstract void bl(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_);

	public abstract Class76_Sub2 ag();

	public abstract void N(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, byte[] is, int i_82_, int i_83_);

	public abstract Class_v gi(int i);

	public final void method4792(int i, int i_84_, int i_85_, int i_86_, short i_87_) {
		try {
			XA(i, i_84_, i_85_, i_86_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bt(").append(')').toString());
		}
	}

	public abstract void G(int i, int i_88_, int i_89_, int i_90_, int i_91_);

	public abstract void br(int i, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_);

	public abstract void ig(int i, int i_97_, int i_98_);

	public abstract void bz(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_);

	public abstract void be(int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, Class_ta class_ta, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_);

	public final void method4793(int i, int i_117_, int i_118_, int i_119_, int i_120_) {
		try {
			CA(i, i_117_, i_118_, i_119_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bo(").append(')').toString());
		}
	}

	abstract void dd();

	public abstract Class_v bx(int i);

	public abstract void bm(Class_v class_v);

	public Class61 method4794(int i, int i_121_, boolean bool, int i_122_) {
		try {
			return bn(i, i_121_, bool, false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bq(").append(')').toString());
		}
	}

	public abstract Class61 bn(int i, int i_123_, boolean bool, boolean bool_124_);

	public abstract void g(int i);

	public Class61 method4795(int[] is, int i, int i_125_, int i_126_, int i_127_, byte i_128_) {
		try {
			return bu(is, i, i_125_, i_126_, i_127_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bv(").append(')').toString());
		}
	}

	public abstract Class61 bj(int i, int i_129_, int i_130_, int i_131_, boolean bool);

	public abstract void bi(int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, Class_ta class_ta, int i_137_, int i_138_);

	public void method4796() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bd(").append(')').toString());
		}
	}

	public void method4797() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bb(").append(')').toString());
		}
	}

	public abstract Class_ta ch(int i, int i_139_, int[] is, int[] is_140_);

	public abstract void DA(int i, Class_ta class_ta, int i_141_, int i_142_);

	public abstract Class263 ce(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool);

	public abstract Class249 cz();

	public abstract Class247 cj();

	public abstract void cy(int i);

	public abstract Class387 cb(Model class98, int i, int i_143_, int i_144_, int i_145_);

	public abstract int ct(int i, int i_146_);

	public abstract Interface8_Impl1_Impl2 az(int i, int i_147_, Class72 class72, Class86 class86, int i_148_);

	public abstract Class_xa cn(int i, int i_149_, int[][] is, int[][] is_150_, int i_151_, int i_152_, int i_153_);

	public abstract Class249 kc();

	public abstract void hn(int i);

	public abstract boolean y();

	public abstract Class_xa hx(int i, int i_154_, int[][] is, int[][] is_155_, int i_156_, int i_157_, int i_158_);

	public abstract void RA(boolean bool);

	public abstract Class249 cs();

	public abstract void fr();

	public abstract void m(int i, float f, float f_159_, float f_160_, float f_161_, float f_162_);

	public abstract void ds();

	public abstract void c(int i, int i_163_, int i_164_);

	public abstract int cr();

	public abstract void ck(int i, Class330_Sub14[] class330_sub14s);

	public abstract void ko();

	public abstract void gu(int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_);

	public abstract void cf(Class92 class92);

	public abstract boolean cu();

	public abstract void ca();

	public abstract boolean cg();

	public void method4798(float f, float f_171_, float f_172_, int i) {
		try {
			cc(f, f_171_, f_172_, 0.0F, 1.0F, 1.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.cx(").append(')').toString());
		}
	}

	public abstract Class61 hi(Class87 class87, boolean bool);

	public abstract void db(int i, int i_173_, int i_174_, int i_175_);

	public abstract void dg(int i, Class77 class77);

	public abstract void dz(int i, Class77 class77);

	public abstract void O();

	public abstract void dr(float f, float f_176_, float f_177_, float[] fs);

	public abstract void method_do(float f, float f_178_, float f_179_, float[] fs);

	public abstract void dh(boolean bool);

	public abstract Class51 dt();

	public abstract Class51 dq();

	abstract void dv(int i, int i_180_) throws Exception_Sub1;

	abstract void dc(int i, int i_181_) throws Exception_Sub1;

	public abstract void gp(Class_v class_v);

	abstract void dm(int i, int i_182_) throws Exception_Sub1;

	public abstract void df();

	public abstract void dy();

	public abstract void fc(int i, int i_183_, int i_184_, int i_185_);

	public abstract void IA(float f);

	abstract void de();

	public abstract int gv(int i, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_);

	abstract void di();

	public abstract void dk(int i);

	public abstract void dw(int i);

	public abstract int dp();

	public abstract boolean ed();

	public abstract boolean en();

	public abstract boolean ej();

	public abstract boolean ew();

	public Class330_Sub14 method4799(int i, int i_191_, int i_192_, int i_193_, int i_194_, float f) {
		try {
			return new Class330_Sub14(i, i_191_, i_192_, i_193_, i_194_, f);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.cv(").append(')').toString());
		}
	}

	public abstract void J(int i);

	public abstract boolean eh();

	public abstract Class92 ip(int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_);

	final Class76_Sub1 method4800(int i) {
		try {
			return aClass76_Sub1_4234;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.aj(").append(')').toString());
		}
	}

	public abstract int[] ar(int i, int i_200_, int i_201_, int i_202_);

	public abstract boolean ee();

	public abstract boolean ez();

	public abstract boolean ex();

	public abstract Interface8_Impl1_Impl1 kv(int i, int i_203_, int i_204_);

	abstract void cc(float f, float f_205_, float f_206_, float f_207_, float f_208_, float f_209_);

	public abstract Class92 ix(int i, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_);

	public abstract boolean er();

	public abstract void jf(int i, Class77 class77);

	public abstract boolean eq();

	public abstract void jz(float f, float f_215_, float f_216_, float[] fs);

	public abstract boolean eb();

	public abstract boolean eg();

	public abstract void eo(boolean bool);

	public abstract void dx();

	public abstract void eu(boolean bool);

	abstract Class76_Sub1 es(Canvas canvas, int i, int i_217_);

	public abstract boolean ac();

	abstract Class76_Sub1 ft(Canvas canvas, int i, int i_218_);

	abstract void dl(int i, int i_219_) throws Exception_Sub1;

	public abstract void fo(int i, int i_220_, int i_221_, int i_222_);

	public abstract void fj(int i, int i_223_, int i_224_, int i_225_);

	public abstract void fa(int i, int i_226_, int i_227_, int i_228_);

	abstract void ju(float f, float f_229_, float f_230_, float f_231_, float f_232_, float f_233_);

	public final void method4801(int i, int i_234_, int i_235_, int i_236_, int i_237_) {
		try {
			G(i, i_234_, i_235_, i_236_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bc(").append(')').toString());
		}
	}

	public abstract void fg(int i, int i_238_, int i_239_, int i_240_);

	public abstract void fy(int i, int i_241_, int i_242_, int i_243_);

	public abstract void fe(int i, int i_244_, int i_245_, int i_246_);

	public abstract void fh(int i, int i_247_, int i_248_, int i_249_);

	public abstract void fl(int[] is);

	public abstract boolean ek();

	public abstract void bk(int i, int i_250_, float f, int i_251_, int i_252_, float f_253_, int i_254_, int i_255_, float f_256_, int i_257_, int i_258_, int i_259_, int i_260_);

	public abstract void fi(int i, int i_261_);

	public abstract void fn(int i, int i_262_);

	public abstract void cm(Class81 class81);

	public abstract void ks(boolean bool);

	public abstract void fx(int i, int i_263_, int i_264_, int i_265_, int i_266_, int i_267_);

	public abstract void fw(int i, int i_268_, int i_269_, int i_270_, int i_271_, int i_272_);

	public abstract void fp(int i, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, byte[] is, int i_278_, int i_279_);

	public abstract void au();

	public abstract void gb(int i, int i_280_, int i_281_, int i_282_, int i_283_, int i_284_, byte[] is, int i_285_, int i_286_);

	abstract void gn(int i, int i_287_, int i_288_, int i_289_, int i_290_);

	public abstract int[] fm(int i, int i_291_, int i_292_, int i_293_);

	public abstract void gx(int i, int i_294_, int i_295_, int i_296_, int i_297_);

	public abstract void ga(int i, int i_298_, int i_299_, int i_300_, int i_301_);

	public abstract void gl(int i, int i_302_, int i_303_, int i_304_, int i_305_);

	public abstract void gz(int i, int i_306_, int i_307_, int i_308_, int i_309_, int i_310_);

	public abstract boolean ei();

	public abstract void gk(int i, int i_311_, int i_312_, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_);

	public abstract int za();

	public abstract void ge(int i, int i_319_, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_);

	public abstract void jn(int i, int i_325_, int i_326_, int i_327_);

	public abstract void gq(int i, int i_328_, int i_329_, int i_330_, int i_331_, int i_332_, int i_333_);

	public abstract int bp(int i, int i_334_, int i_335_, int i_336_, int i_337_, int i_338_);

	public abstract int gf(int i, int i_339_, int i_340_, int i_341_, int i_342_, int i_343_);

	public abstract boolean ep();

	public abstract Class_v gs(int i);

	public abstract void go(Class_v class_v);

	public abstract void ji(int i, int i_344_, int i_345_, int i_346_);

	abstract void dj(int i, int i_347_) throws Exception_Sub1;

	public abstract Class61 gt(int i, int i_348_, boolean bool, boolean bool_349_);

	public abstract Class61 gm(int i, int i_350_, boolean bool, boolean bool_351_);

	public abstract void ba(int i, int i_352_);

	public abstract Class61 ha(int i, int i_353_, boolean bool, boolean bool_354_);

	public abstract Class61 hm(int[] is, int i, int i_355_, int i_356_, int i_357_, boolean bool);

	public abstract Class61 hv(int[] is, int i, int i_358_, int i_359_, int i_360_, boolean bool);

	public abstract Class61 bw(Class87 class87, boolean bool);

	public abstract void ci(Class249 class249);

	public abstract Class61 hk(int i, int i_361_, int i_362_, int i_363_, boolean bool);

	public abstract Class61 hl(int i, int i_364_, int i_365_, int i_366_, boolean bool);

	public abstract Class61 hf(int i, int i_367_, int i_368_, int i_369_, boolean bool);

	public abstract Class61 ht(int i, int i_370_, int i_371_, int i_372_, boolean bool);

	public abstract Class_ta hc(int i, int i_373_, int[] is, int[] is_374_);

	public abstract Class_ta hy(int i, int i_375_, int[] is, int[] is_376_);

	public abstract Interface8_Impl1_Impl1 kh(int i, int i_377_, int i_378_);

	public abstract void hr(int i, Class_ta class_ta, int i_379_, int i_380_);

	public abstract void cw(Class247 class247);

	public abstract void hw(int i);

	public abstract boolean et();

	public abstract Class387 hg(Model class98, int i, int i_381_, int i_382_, int i_383_);

	public abstract Class387 hb(Model class98, int i, int i_384_, int i_385_, int i_386_);

	public abstract int he(int i, int i_387_);

	public abstract int hd(int i, int i_388_);

	public abstract int hj(int i, int i_389_);

	public abstract int cd(int i, int i_390_);

	public abstract Class_xa hp(int i, int i_391_, int[][] is, int[][] is_392_, int i_393_, int i_394_, int i_395_);

	public abstract void ii(int i, Class330_Sub14[] class330_sub14s);

	public abstract Class247 ih();

	public final void method4802(Class76_Sub2 class76_sub2, byte i) {
		try {
			if (1505668287 * ((Class_ra) this).anInt4238 < 0 || (class76_sub2 != (((Class_ra) this).aClass76_Sub2Array4242[1505668287 * ((Class_ra) this).anInt4238])))
				throw new RuntimeException();
			((Class_ra) this).aClass76_Sub2Array4242[(((Class_ra) this).anInt4238 -= 1828897599) * 1505668287 + 1] = null;
			class76_sub2.method862();
			if (((Class_ra) this).anInt4238 * 1505668287 >= 0) {
				aClass76_4228 = (((Class_ra) this).aClass76_Sub2Array4242[1505668287 * ((Class_ra) this).anInt4238]);
				((Class_ra) this).aClass76_Sub2Array4242[1505668287 * ((Class_ra) this).anInt4238].method174();
			} else {
				aClass76_4228 = aClass76_Sub1_4234;
				aClass76_Sub1_4234.method174();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.ab(").append(')').toString());
		}
	}

	public abstract Class249 io();

	public abstract Class249 ic();

	public abstract void ij(float f);

	public abstract void ia(float f);

	public abstract void ik(int i, float f, float f_396_, float f_397_, float f_398_, float f_399_);

	public abstract void iz(int i, float f, float f_400_, float f_401_, float f_402_, float f_403_);

	public abstract void il(int i);

	public abstract void iw(int i);

	public abstract void method_if(int i, int i_404_, int i_405_);

	public abstract void ib(int i, int i_406_, int i_407_);

	public abstract void jq(int i, Class77 class77);

	public void method4803(int[] is) {
		try {
			if (null != aClass76_Sub1_4234) {
				is[0] = aClass76_Sub1_4234.method856();
				is[1] = aClass76_Sub1_4234.method857();
			} else {
				int[] is_408_ = is;
				is[1] = 0;
				is_408_[0] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.ai(").append(')').toString());
		}
	}

	public abstract Class92 iq(int i, int i_409_, int i_410_, int i_411_, int i_412_, int i_413_);

	public abstract void fv(int[] is);

	public abstract void XA(int i, int i_414_, int i_415_, int i_416_, int i_417_);

	public abstract Class92 in(Class92 class92, Class92 class92_418_, float f, Class92 class92_419_);

	public abstract void is(Class92 class92);

	public abstract boolean iv();

	public abstract boolean it();

	abstract void iy(float f, float f_420_, float f_421_, float f_422_, float f_423_, float f_424_);

	public abstract void im();

	public abstract boolean ie();

	public abstract void ff(int[] is);

	abstract void jc(float f, float f_425_, float f_426_, float f_427_, float f_428_, float f_429_);

	public abstract Interface8_Impl1_Impl1 av(int i, int i_430_, int i_431_);

	public abstract void ke();

	public abstract void jg(int i, int i_432_, int i_433_, int i_434_);

	public void method4804() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.bh(").append(')').toString());
		}
	}

	public abstract Class76_Sub2 jv();

	public abstract void jt();

	public abstract void ja(int i, Class77 class77);

	public abstract void jm(int i, Class77 class77);

	public abstract void L();

	public abstract void du();

	public abstract void jb(int i, Class77 class77);

	public abstract void jj(int i, Class77 class77);

	final void method4805(Canvas canvas, Class76_Sub1 class76_sub1, int i) {
		try {
			if (null == class76_sub1)
				throw new RuntimeException();
			aHashtable4231.put(canvas, class76_sub1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.ad(").append(')').toString());
		}
	}

	public abstract Class51 f();

	public abstract void jh();

	public abstract void jr(int i, int i_435_, float f, int i_436_, int i_437_, float f_438_, int i_439_, int i_440_, float f_441_, int i_442_, int i_443_, int i_444_, int i_445_);

	public abstract void jd(float f, float f_446_, float f_447_, float[] fs);

	public abstract void jl(float f, float f_448_, float f_449_, float[] fs);

	public abstract Class76_Sub2 jw();

	public abstract Class76_Sub2 jy();

	public abstract Class76_Sub2 jp();

	public abstract Class76_Sub2 jk();

	public abstract Class263 ho(Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool);

	public abstract Interface8_Impl1_Impl2 jx(int i, int i_450_, Class72 class72, Class86 class86, int i_451_);

	public abstract Interface8_Impl1_Impl1 kp(int i, int i_452_);

	public abstract Interface8_Impl1_Impl1 kb(int i, int i_453_, int i_454_);

	public abstract boolean ev();

	public abstract void kr(boolean bool);

	public abstract Class92 cl(int i, int i_455_, int i_456_, int i_457_, int i_458_, int i_459_);

	protected void finalize() {
		try {
			method4781(628001038);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.finalize(").append(')').toString());
		}
	}

	public abstract void fz(float f, float f_460_);

	public abstract boolean km();

	public abstract boolean ky();

	public abstract boolean ku();

	public abstract void kt(int i, int i_461_, int i_462_, int i_463_, int i_464_, int i_465_, Class_ta class_ta, int i_466_, int i_467_, int i_468_, int i_469_, int i_470_);

	public abstract void ki(int i, int i_471_, int i_472_, int i_473_, int i_474_, int i_475_, Class_ta class_ta, int i_476_, int i_477_, int i_478_, int i_479_, int i_480_);

	public abstract Class61 hq(Class87 class87, boolean bool);

	abstract void u();

	public abstract Class247 kx();

	public abstract Class247 kw();

	public abstract void kn(Class81 class81);

	public abstract void kk();

	Class_ra(Interface_ma interface_ma) {
		aHashtable4231 = new Hashtable();
		((Class_ra) this).aClass76_Sub2Array4242 = new Class76_Sub2[4];
		anInterface_ma4227 = interface_ma;
		int i = -1;
		for (int i_481_ = 0; i_481_ < 8; i_481_++) {
			if (!aBooleanArray4237[i_481_]) {
				aBooleanArray4237[i_481_] = true;
				i = i_481_;
				break;
			}
		}
		if (-1 == i)
			throw new IllegalStateException("");
		anInt4226 = i * -953706915;
	}

	public abstract void kg();

	public abstract void kq();

	public abstract void kz();

	public abstract void kl(Class247 class247);

	public abstract void kd(Class247 class247);

	public abstract void gw(int i, int i_482_, int i_483_, int i_484_, int i_485_, int i_486_, Class_ta class_ta, int i_487_, int i_488_);

	public abstract void hu(int i, Class_ta class_ta, int i_489_, int i_490_);

	public abstract void lp(boolean bool);

	public abstract int ln();

	public abstract int lo();

	public abstract boolean ka();

	public abstract boolean at();

	public abstract void gj(int i, int i_491_, int i_492_, int i_493_, int i_494_);

	public abstract boolean kj();

	public abstract void fd(int i, int i_495_, int i_496_, int i_497_, int i_498_, int i_499_);

	abstract void CA(int i, int i_500_, int i_501_, int i_502_, int i_503_);

	public abstract Class61 hz(int i, int i_504_, boolean bool, boolean bool_505_);

	public abstract void gc(Class_v class_v);

	public abstract void fb(int i, int i_506_, int i_507_, int i_508_, int i_509_, int i_510_, byte[] is, int i_511_, int i_512_);

	public final void method4806(Canvas canvas, int i, int i_513_, byte i_514_) {
		try {
			Class76_Sub1 class76_sub1 = (Class76_Sub1) aHashtable4231.get(canvas);
			if (null == class76_sub1)
				throw new RuntimeException();
			class76_sub1.method876(i, i_513_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.aq(").append(')').toString());
		}
	}

	public abstract void ir(Class249 class249);

	public abstract boolean el();

	public abstract void jo(int i, Class77 class77);

	public abstract boolean ey();

	public abstract void je(int i, Class77 class77);

	public abstract Class387 hs(Model class98, int i, int i_515_, int i_516_, int i_517_);

	static final void method4807(Class430 class430, byte i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub28_7885, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), -440047250);
			client.aClass304_9030.method3032(451712917);
			Class435.method5568(2134993785);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.akq(").append(')').toString());
		}
	}

	public static void method4808(int i, int i_518_, int i_519_, int i_520_, int i_521_, int i_522_, int i_523_, int i_524_) {
		try {
			Class18.method452(i_522_, i_523_, 100, 1943615713);
			Class333.aClass326_3363 = new Class326(i, i_518_ << 9, i_519_ << 9, i_520_ << 8, 8 * i_521_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.x(").append(')').toString());
		}
	}

	public static void method4809(int i, int i_525_, int i_526_, int i_527_, Class473 class473, NPC class432_sub1_sub1_sub1_sub2, Player class432_sub1_sub1_sub1_sub1, int i_528_) {
		try {
			Class330_Sub20 class330_sub20 = new Class330_Sub20();
			((Class330_Sub20) class330_sub20).anInt7652 = 1446866647 * i;
			((Class330_Sub20) class330_sub20).anInt7671 = (i_525_ << 9) * 141456317;
			((Class330_Sub20) class330_sub20).anInt7654 = (i_526_ << 9) * 2069485977;
			if (class473 != null) {
				((Class330_Sub20) class330_sub20).aClass473_7682 = class473;
				int i_529_ = 564595847 * class473.anInt5674;
				int i_530_ = class473.anInt5680 * -639841087;
				if (1 == i_527_ || 3 == i_527_) {
					i_529_ = -639841087 * class473.anInt5680;
					i_530_ = class473.anInt5674 * 564595847;
				}
				((Class330_Sub20) class330_sub20).anInt7656 = 359630341 * (i_525_ + i_529_ << 9);
				((Class330_Sub20) class330_sub20).anInt7668 = 2135081075 * (i_526_ + i_530_ << 9);
				((Class330_Sub20) class330_sub20).anInt7655 = class473.anInt5650 * 726193647;
				((Class330_Sub20) class330_sub20).aBoolean7672 = class473.aBoolean5615;
				((Class330_Sub20) class330_sub20).anInt7658 = -1956893969 * (1058070369 * class473.anInt5675 << 9);
				((Class330_Sub20) class330_sub20).anInt7659 = -762806283 * class473.anInt5677;
				((Class330_Sub20) class330_sub20).anInt7676 = 368168931 * class473.anInt5679;
				((Class330_Sub20) class330_sub20).anInt7677 = 291238759 * class473.anInt5628;
				((Class330_Sub20) class330_sub20).anIntArray7678 = class473.anIntArray5681;
				((Class330_Sub20) class330_sub20).aBoolean7662 = class473.aBoolean5616;
				((Class330_Sub20) class330_sub20).anInt7680 = 1228463319 * class473.anInt5662;
				((Class330_Sub20) class330_sub20).anInt7669 = class473.anInt5689 * -662143729;
				((Class330_Sub20) class330_sub20).anInt7679 = (class473.anInt5676 * -952443945 << 9) * 1403003527;
				if (null != class473.anIntArray5678) {
					((Class330_Sub20) class330_sub20).aBoolean7653 = true;
					class330_sub20.method3373((byte) -44);
				}
				if (null != ((Class330_Sub20) class330_sub20).anIntArray7678)
					((Class330_Sub20) class330_sub20).anInt7670 = (((((Class330_Sub20) class330_sub20).anInt7676 * 996172827) + (int) (Math.random() * (double) ((-1128686737 * ((Class330_Sub20) class330_sub20).anInt7677) - (996172827 * (((Class330_Sub20) class330_sub20).anInt7676))))) * 945549449);
				Class330_Sub20.aClass471_7649.method5878(class330_sub20, (short) 8192);
			} else if (class432_sub1_sub1_sub1_sub2 != null) {
				((Class330_Sub20) class330_sub20).aClass432_Sub1_Sub1_Sub1_Sub2_7661 = class432_sub1_sub1_sub1_sub2;
				Class551 class551 = class432_sub1_sub1_sub1_sub2.aClass551_10251;
				if (class551.anIntArray6326 != null) {
					((Class330_Sub20) class330_sub20).aBoolean7653 = true;
					class551 = class551.method6371(Class158.aClass561_6474, (byte) 77);
				}
				if (class551 != null) {
					((Class330_Sub20) class330_sub20).anInt7656 = ((class551.anInt6295 * -1943771105 + i_525_ << 9) * 359630341);
					((Class330_Sub20) class330_sub20).anInt7668 = (2135081075 * (-1943771105 * class551.anInt6295 + i_526_ << 9));
					((Class330_Sub20) class330_sub20).anInt7655 = Class412.method5237(class432_sub1_sub1_sub1_sub2, 114678110) * 63805063;
					((Class330_Sub20) class330_sub20).aBoolean7672 = class551.aBoolean6346;
					((Class330_Sub20) class330_sub20).anInt7658 = (1028590487 * class551.anInt6343 << 9) * -1956893969;
					((Class330_Sub20) class330_sub20).anInt7659 = 833376945 * class551.anInt6320;
					((Class330_Sub20) class330_sub20).anInt7680 = 1413623899 * class551.anInt6350;
					((Class330_Sub20) class330_sub20).anInt7669 = 871140649 * class551.anInt6354;
					((Class330_Sub20) class330_sub20).anInt7679 = 1403003527 * (-1281122485 * class551.anInt6290 << 9);
				}
				Class330_Sub20.aClass471_7650.method5878(class330_sub20, (short) 8192);
			} else if (null != class432_sub1_sub1_sub1_sub1) {
				((Class330_Sub20) class330_sub20).aClass432_Sub1_Sub1_Sub1_Sub1_7667 = class432_sub1_sub1_sub1_sub1;
				((Class330_Sub20) class330_sub20).anInt7656 = ((i_525_ + class432_sub1_sub1_sub1_sub1.method5453(-1307347299)) << 9) * 359630341;
				((Class330_Sub20) class330_sub20).anInt7668 = ((i_526_ + class432_sub1_sub1_sub1_sub1.method5453(-1605842940)) << 9) * 2135081075;
				((Class330_Sub20) class330_sub20).anInt7655 = Class162.method1918(class432_sub1_sub1_sub1_sub1, (byte) -56) * 63805063;
				((Class330_Sub20) class330_sub20).aBoolean7672 = class432_sub1_sub1_sub1_sub1.isNPC;
				((Class330_Sub20) class330_sub20).anInt7658 = (1762959971 * class432_sub1_sub1_sub1_sub1.anInt10236 << 9) * -1956893969;
				((Class330_Sub20) class330_sub20).anInt7659 = class432_sub1_sub1_sub1_sub1.anInt10239 * 39694771;
				((Class330_Sub20) class330_sub20).anInt7680 = -1111052544;
				((Class330_Sub20) class330_sub20).anInt7669 = -418646784;
				((Class330_Sub20) class330_sub20).anInt7679 = 0;
				Class330_Sub20.aClass497_7651.method6097(class330_sub20, (long) (-1654044763 * class432_sub1_sub1_sub1_sub1.anInt10008));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ra.p(").append(')').toString());
		}
	}
}
