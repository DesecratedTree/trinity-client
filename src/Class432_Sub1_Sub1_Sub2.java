/* Class432_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432_Sub1_Sub1_Sub2 extends Class432_Sub1_Sub1 {
	int anInt10176;
	boolean aBoolean10177;
	public int anInt10178;
	public int anInt10179;
	double aDouble10180;
	int anInt10181;
	public int anInt10182;
	double aDouble10183;
	public int anInt10184;
	double aDouble10185;
	int anInt10186;
	boolean aBoolean10187 = false;
	int anInt10188;
	double aDouble10189;
	double aDouble10190;
	int anInt10191;
	int anInt10192;
	Class477 aClass477_10193;
	int anInt10194 = 0;
	boolean aBoolean10195 = false;
	Class388 aClass388_10196;
	int anInt10197;

	void method5490() {
		Class260 class260 = method5346().aClass260_2606;
		aShort9922 = aShort9920 = (short) (int) (class260.aFloat2716 / 512.0F);
		aShort9921 = aShort9923 = (short) (int) (class260.aFloat2711 / 512.0F);
	}

	boolean method5395(int i) {
		try {
			return ((Class432_Sub1_Sub1_Sub2) this).aBoolean10195;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.bg(").append(')').toString());
		}
	}

	void method5491() {
		Class260 class260 = method5346().aClass260_2606;
		aShort9922 = aShort9920 = (short) (int) (class260.aFloat2716 / 512.0F);
		aShort9921 = aShort9923 = (short) (int) (class260.aFloat2711 / 512.0F);
	}

	public int method5492(byte i) {
		try {
			return ((Class432_Sub1_Sub1_Sub2) this).anInt10191 * 1477675525;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.r(").append(')').toString());
		}
	}

	public Class348 method5383(Class_ra class_ra, int i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.bt(").append(')').toString());
		}
	}

	public void method5493(byte i) {
		try {
			if (!((Class432_Sub1_Sub1_Sub2) this).aBoolean10187) {
				if (((Class432_Sub1_Sub1_Sub2) this).anInt10186 * 1985875449 != 0) {
					Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = null;
					if (0 == client.anInt8987 * 1909266069)
						class432_sub1_sub1_sub1 = Class96.aClass85Array854[(((Class432_Sub1_Sub1_Sub2) this).anInt10186 * 1985875449) - 1].method973(-1160484525);
					else if ((((Class432_Sub1_Sub1_Sub2) this).anInt10186 * 1985875449) < 0) {
						int i_0_ = (-(((Class432_Sub1_Sub1_Sub2) this).anInt10186 * 1985875449) - 1);
						if (client.anInt9121 * 1478725729 == i_0_)
							class432_sub1_sub1_sub1 = (Class263_Sub2.myPlayer);
						else
							class432_sub1_sub1_sub1 = (client.players[i_0_]);
					} else {
						int i_1_ = (((Class432_Sub1_Sub1_Sub2) this).anInt10186 * 1985875449) - 1;
						Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_1_));
						if (class330_sub35 != null)
							class432_sub1_sub1_sub1 = ((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733);
					}
					if (null != class432_sub1_sub1_sub1) {
						Class260 class260 = (class432_sub1_sub1_sub1.method5346().aClass260_2606);
						method5348(class260.aFloat2716, (float) ((Class431.method5342((int) class260.aFloat2716, (int) class260.aFloat2711, aByte8658, 1996761881)) - (84215597 * ((Class432_Sub1_Sub1_Sub2) this).anInt10188)), class260.aFloat2711);
						if ((((Class432_Sub1_Sub1_Sub2) this).anInt10176 * -405747095) >= 0) {
							Class364 class364 = class432_sub1_sub1_sub1.method5436(-1179227035);
							int i_2_ = 0;
							int i_3_ = 0;
							if (class364.anIntArrayArray3807 != null && null != (class364.anIntArrayArray3807[(-405747095 * ((Class432_Sub1_Sub1_Sub2) this).anInt10176)])) {
								i_2_ += (class364.anIntArrayArray3807[(-405747095 * (((Class432_Sub1_Sub1_Sub2) this).anInt10176))][0]);
								i_3_ += (class364.anIntArrayArray3807[(-405747095 * (((Class432_Sub1_Sub1_Sub2) this).anInt10176))][2]);
							}
							if (null != class364.anIntArrayArray3845 && ((class364.anIntArrayArray3845[-405747095 * ((Class432_Sub1_Sub1_Sub2) this).anInt10176]) != null)) {
								i_2_ += (class364.anIntArrayArray3845[(((Class432_Sub1_Sub1_Sub2) this).anInt10176) * -405747095][0]);
								i_3_ += (class364.anIntArrayArray3845[(-405747095 * (((Class432_Sub1_Sub1_Sub2) this).anInt10176))][2]);
							}
							if (0 != i_2_ || i_3_ != 0) {
								int i_4_ = class432_sub1_sub1_sub1.aClass238_10053.method2370(90316937);
								int i_5_ = i_4_;
								if (null != (class432_sub1_sub1_sub1.anIntArray10049) && (class432_sub1_sub1_sub1.anIntArray10049[(-405747095 * (((Class432_Sub1_Sub1_Sub2) this).anInt10176))]) != -1)
									i_5_ = (class432_sub1_sub1_sub1.anIntArray10049[(((Class432_Sub1_Sub1_Sub2) this).anInt10176) * -405747095]);
								int i_6_ = i_5_ - i_4_ & 0x3fff;
								int i_7_ = Class257.anIntArray2683[i_6_];
								int i_8_ = Class257.anIntArray2684[i_6_];
								int i_9_ = i_8_ * i_2_ + i_7_ * i_3_ >> 14;
								i_3_ = i_3_ * i_8_ - i_2_ * i_7_ >> 14;
								i_2_ = i_9_;
								Class260 class260_10_ = Class260.method2549(method5346().aClass260_2606);
								class260_10_.aFloat2716 += (float) i_2_;
								class260_10_.aFloat2711 += (float) i_3_;
								method5349(class260_10_);
								class260_10_.method2550();
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.i(").append(')').toString());
		}
	}

	final void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_11_, int i_12_, boolean bool, int i_13_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.bz(").append(')').toString());
		}
	}

	public final void method5494(int i, int i_14_) {
		try {
			((Class432_Sub1_Sub1_Sub2) this).aBoolean10187 = true;
			Class241 class241 = new Class241(method5346());
			class241.aClass260_2606.aFloat2716 += ((Class432_Sub1_Sub1_Sub2) this).aDouble10180 * (double) i;
			class241.aClass260_2606.aFloat2711 += (double) i * ((Class432_Sub1_Sub1_Sub2) this).aDouble10189;
			if (((Class432_Sub1_Sub1_Sub2) this).aBoolean10177)
				class241.aClass260_2606.aFloat2715 = (float) (Class431.method5342((int) (class241.aClass260_2606.aFloat2716), (int) (class241.aClass260_2606.aFloat2711), aByte8658, 1996761881) - (((Class432_Sub1_Sub1_Sub2) this).anInt10188 * 84215597));
			else if (-1 != (1321239355 * ((Class432_Sub1_Sub1_Sub2) this).anInt10181)) {
				class241.aClass260_2606.aFloat2715 += (((double) i * ((Class432_Sub1_Sub1_Sub2) this).aDouble10185) + (((Class432_Sub1_Sub1_Sub2) this).aDouble10183 * 0.5 * (double) i * (double) i));
				((Class432_Sub1_Sub1_Sub2) this).aDouble10185 += (((Class432_Sub1_Sub1_Sub2) this).aDouble10183 * (double) i);
			} else
				class241.aClass260_2606.aFloat2715 += (((Class432_Sub1_Sub1_Sub2) this).aDouble10185 * (double) i);
			class241.aClass244_2607.method2427(1.0F, 0.0F, 0.0F, (float) Math.atan2((((Class432_Sub1_Sub1_Sub2) this).aDouble10185), (((Class432_Sub1_Sub1_Sub2) this).aDouble10190)));
			Class244 class244 = Class244.method2428();
			class244.method2427(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class432_Sub1_Sub1_Sub2) this).aDouble10180, ((Class432_Sub1_Sub1_Sub2) this).aDouble10189) - 3.1415927F));
			class241.aClass244_2607.method2429(class244);
			class244.method2417();
			method5353(class241);
			if (((Class432_Sub1_Sub1_Sub2) this).aClass477_10193.method5981(1, 636984754) && ((Class432_Sub1_Sub1_Sub2) this).aClass477_10193.method5978((byte) -124))
				((Class432_Sub1_Sub1_Sub2) this).aClass477_10193.method5979((byte) -37);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.p(").append(')').toString());
		}
	}

	Class387 method5495(Class_ra class_ra, int i, byte i_15_) {
		try {
			Class437 class437 = (Class136.aClass416_1527.method5254(((Class432_Sub1_Sub1_Sub2) this).anInt10192 * 1826691967, 1684752020));
			return class437.method5583(class_ra, i, (((Class432_Sub1_Sub1_Sub2) this).aClass477_10193), (byte) 2, 1319777347);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.o(").append(')').toString());
		}
	}

	Class353 method5405(Class_ra class_ra, int i) {
		try {
			Class387 class387 = method5495(class_ra, 2048, (byte) -28);
			if (class387 == null)
				return null;
			Class247 class247 = method5355();
			method5496(class_ra, class387, class247, -1882958789);
			Class353 class353 = Class497.method6105(false, (byte) 16);
			class387.method4475(class247, aClass80Array8656[0], 0);
			if (null != ((Class432_Sub1_Sub1_Sub2) this).aClass388_10196) {
				Class81 class81 = ((Class432_Sub1_Sub1_Sub2) this).aClass388_10196.method4570();
				class_ra.cm(class81);
			}
			((Class432_Sub1_Sub1_Sub2) this).aBoolean10195 = class387.i();
			class387.n();
			((Class432_Sub1_Sub1_Sub2) this).anInt10194 = class387.YA() * 281048457;
			return class353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.bf(").append(')').toString());
		}
	}

	void method5404(Class_ra class_ra, int i) {
		try {
			Class387 class387 = method5495(class_ra, 0, (byte) -121);
			if (class387 != null) {
				Class247 class247 = method5355();
				((Class432_Sub1_Sub1_Sub2) this).anInt10194 = class387.YA() * 281048457;
				class387.n();
				method5496(class_ra, class387, class247, -591685766);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.bl(").append(')').toString());
		}
	}

	void method5406(int i) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			aShort9922 = aShort9920 = (short) (int) (class260.aFloat2716 / 512.0F);
			aShort9921 = aShort9923 = (short) (int) (class260.aFloat2711 / 512.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.ca(").append(')').toString());
		}
	}

	void method5496(Class_ra class_ra, Class387 class387, Class247 class247, int i) {
		try {
			class387.method4463(class247);
			Class93[] class93s = class387.method4464();
			Class64[] class64s = class387.method4445();
			if ((((Class432_Sub1_Sub1_Sub2) this).aClass388_10196 == null || (((Class432_Sub1_Sub1_Sub2) this).aClass388_10196.aBoolean3992)) && (class93s != null || class64s != null))
				((Class432_Sub1_Sub1_Sub2) this).aClass388_10196 = Class388.method4571(client.anInt8981 * 822953439, true);
			if (null != ((Class432_Sub1_Sub1_Sub2) this).aClass388_10196) {
				((Class432_Sub1_Sub1_Sub2) this).aClass388_10196.method4568(class_ra, (long) (client.anInt8981 * 822953439), class93s, class64s, false);
				((Class432_Sub1_Sub1_Sub2) this).aClass388_10196.method4573(aByte8658, aShort9922, aShort9920, aShort9921, aShort9923);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.s(").append(')').toString());
		}
	}

	public void method5497(int i) {
		try {
			if (((Class432_Sub1_Sub1_Sub2) this).aClass388_10196 != null)
				((Class432_Sub1_Sub1_Sub2) this).aClass388_10196.method4572();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.f(").append(')').toString());
		}
	}

	boolean method5358(Class_ra class_ra, int i, int i_16_, int i_17_) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.br(").append(')').toString());
		}
	}

	final boolean method5360(short i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.bi(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub1_Sub2(Class356 class356, int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, boolean bool, int i_30_, int i_31_) {
		super(class356, i_18_, i_19_, i_20_, Class431.method5342(i_20_, i_21_, i_18_, 1996761881) - i_22_, i_21_, i_20_ >> 9, i_20_ >> 9, i_21_ >> 9, i_21_ >> 9, false, (byte) 0);
		((Class432_Sub1_Sub1_Sub2) this).anInt10191 = 0;
		((Class432_Sub1_Sub1_Sub2) this).anInt10192 = 743089279 * i;
		anInt10179 = -475993417 * i_23_;
		anInt10182 = -2145718361 * i_24_;
		((Class432_Sub1_Sub1_Sub2) this).anInt10181 = 1733647859 * i_25_;
		((Class432_Sub1_Sub1_Sub2) this).anInt10197 = -1388796911 * i_26_;
		((Class432_Sub1_Sub1_Sub2) this).anInt10186 = i_27_ * 951002185;
		anInt10184 = -1698798547 * i_28_;
		((Class432_Sub1_Sub1_Sub2) this).anInt10188 = i_22_ * -532160347;
		anInt10178 = -943624171 * i_29_;
		((Class432_Sub1_Sub1_Sub2) this).aBoolean10177 = bool;
		((Class432_Sub1_Sub1_Sub2) this).aBoolean10187 = false;
		((Class432_Sub1_Sub1_Sub2) this).anInt10176 = i_30_ * 1874945497;
		((Class432_Sub1_Sub1_Sub2) this).anInt10191 = i_31_ * 524792525;
		int i_32_ = (Class136.aClass416_1527.method5254(1826691967 * ((Class432_Sub1_Sub1_Sub2) this).anInt10192, 1450833416).anInt4431) * 1258856743;
		((Class432_Sub1_Sub1_Sub2) this).aClass477_10193 = new Class477_Sub2(this, false);
		((Class432_Sub1_Sub1_Sub2) this).aClass477_10193.method5988(i_32_, (byte) 42);
		method5373(1, 605208091);
	}

	final boolean method5391() {
		return false;
	}

	final void method5393(int i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.be(").append(')').toString());
		}
	}

	boolean method5375() {
		return false;
	}

	boolean method5376() {
		return false;
	}

	boolean method5377() {
		return ((Class432_Sub1_Sub1_Sub2) this).aBoolean10195;
	}

	boolean method5378() {
		return ((Class432_Sub1_Sub1_Sub2) this).aBoolean10195;
	}

	boolean method5379() {
		return ((Class432_Sub1_Sub1_Sub2) this).aBoolean10195;
	}

	public int method5364() {
		return ((Class432_Sub1_Sub1_Sub2) this).anInt10194 * -2032234311;
	}

	boolean method5390(Class_ra class_ra, int i, int i_33_) {
		return false;
	}

	public int method5394() {
		return ((Class432_Sub1_Sub1_Sub2) this).anInt10194 * -2032234311;
	}

	public int method5381() {
		return ((Class432_Sub1_Sub1_Sub2) this).anInt10194 * -2032234311;
	}

	public Class348 method5357(Class_ra class_ra) {
		return null;
	}

	public Class348 method5385(Class_ra class_ra) {
		return null;
	}

	public Class348 method5386(Class_ra class_ra) {
		return null;
	}

	public Class348 method5362(Class_ra class_ra) {
		return null;
	}

	public Class348 method5388(Class_ra class_ra) {
		return null;
	}

	Class353 method5380(Class_ra class_ra) {
		Class387 class387 = method5495(class_ra, 2048, (byte) -24);
		if (class387 == null)
			return null;
		Class247 class247 = method5355();
		method5496(class_ra, class387, class247, -217670607);
		Class353 class353 = Class497.method6105(false, (byte) 16);
		class387.method4475(class247, aClass80Array8656[0], 0);
		if (null != ((Class432_Sub1_Sub1_Sub2) this).aClass388_10196) {
			Class81 class81 = ((Class432_Sub1_Sub1_Sub2) this).aClass388_10196.method4570();
			class_ra.cm(class81);
		}
		((Class432_Sub1_Sub1_Sub2) this).aBoolean10195 = class387.i();
		class387.n();
		((Class432_Sub1_Sub1_Sub2) this).anInt10194 = class387.YA() * 281048457;
		return class353;
	}

	boolean method5382(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.ao(").append(')').toString());
		}
	}

	boolean method5389(Class_ra class_ra, int i, int i_34_) {
		return false;
	}

	boolean method5374() {
		return false;
	}

	public final void method5498(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		try {
			Class260 class260 = Class260.method2549(method5346().aClass260_2606);
			if (!((Class432_Sub1_Sub1_Sub2) this).aBoolean10187) {
				float f = (float) i - class260.aFloat2716;
				float f_39_ = (float) i_35_ - class260.aFloat2711;
				float f_40_ = (float) Math.sqrt((double) (f * f + f_39_ * f_39_));
				if (0.0F != f_40_) {
					class260.aFloat2716 += (float) (((Class432_Sub1_Sub1_Sub2) this).anInt10197 * 1274072305) * f / f_40_;
					class260.aFloat2711 += (float) (((Class432_Sub1_Sub1_Sub2) this).anInt10197 * 1274072305) * f_39_ / f_40_;
				}
				if (((Class432_Sub1_Sub1_Sub2) this).aBoolean10177)
					class260.aFloat2715 = (float) (Class431.method5342((int) (class260.aFloat2716), (int) (class260.aFloat2711), aByte8658, 1996761881) - 84215597 * ((Class432_Sub1_Sub1_Sub2) this).anInt10188);
				method5349(class260);
			}
			double d = (double) (1 + anInt10182 * -1776891881 - i_37_);
			((Class432_Sub1_Sub1_Sub2) this).aDouble10180 = (double) ((float) i - class260.aFloat2716) / d;
			((Class432_Sub1_Sub1_Sub2) this).aDouble10189 = (double) ((float) i_35_ - class260.aFloat2711) / d;
			((Class432_Sub1_Sub1_Sub2) this).aDouble10190 = Math.sqrt((((Class432_Sub1_Sub1_Sub2) this).aDouble10189 * ((Class432_Sub1_Sub1_Sub2) this).aDouble10189) + (((Class432_Sub1_Sub1_Sub2) this).aDouble10180 * (((Class432_Sub1_Sub1_Sub2) this).aDouble10180)));
			if (-1 != 1321239355 * ((Class432_Sub1_Sub1_Sub2) this).anInt10181) {
				if (!((Class432_Sub1_Sub1_Sub2) this).aBoolean10187)
					((Class432_Sub1_Sub1_Sub2) this).aDouble10185 = (-((Class432_Sub1_Sub1_Sub2) this).aDouble10190 * Math.tan(0.02454369 * (double) (1321239355 * ((Class432_Sub1_Sub1_Sub2) this).anInt10181)));
				((Class432_Sub1_Sub1_Sub2) this).aDouble10183 = (2.0 * ((double) ((float) i_36_ - class260.aFloat2715) - d * ((Class432_Sub1_Sub1_Sub2) this).aDouble10185) / (d * d));
			} else
				((Class432_Sub1_Sub1_Sub2) this).aDouble10185 = (double) ((float) i_36_ - class260.aFloat2715) / d;
			class260.method2550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.j(").append(')').toString());
		}
	}

	final void method5387() {
		throw new IllegalStateException();
	}

	final void method5384() {
		throw new IllegalStateException();
	}

	public int method5370(int i) {
		try {
			return ((Class432_Sub1_Sub1_Sub2) this).anInt10194 * -2032234311;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("alj.bo(").append(')').toString());
		}
	}

	public Class348 method5401(Class_ra class_ra) {
		return null;
	}

	final void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_41_, int i_42_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_43_, int i_44_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_45_, int i_46_, boolean bool) {
		throw new IllegalStateException();
	}

	public int method5366() {
		return ((Class432_Sub1_Sub1_Sub2) this).anInt10194 * -2032234311;
	}

	void method5361(Class_ra class_ra) {
		Class387 class387 = method5495(class_ra, 0, (byte) -90);
		if (class387 != null) {
			Class247 class247 = method5355();
			((Class432_Sub1_Sub1_Sub2) this).anInt10194 = class387.YA() * 281048457;
			class387.n();
			method5496(class_ra, class387, class247, 1900721819);
		}
	}
}
