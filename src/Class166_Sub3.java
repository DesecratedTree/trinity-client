/* Class166_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class166_Sub3 extends Class166 {
	float aFloat7335 = 0.0F;
	Class245 aClass245_7336;
	float aFloat7337 = 0.0F;

	public Class260 method1968(byte i) {
		try {
			return (Class260.method2549(((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335)));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.i(").append(')').toString());
		}
	}

	public void method2012(Class245 class245, int i, int i_0_) {
		try {
			((Class166_Sub3) this).aClass245_7336 = class245;
			((Class166_Sub3) this).aFloat7335 = 0.0F;
			((Class166_Sub3) this).aFloat7337 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.h(").append(')').toString());
		}
	}

	public void method1966(float f, Class307 class307, int[][][] is, int i) {
		try {
			float f_1_ = ((Class166_Sub3) this).aClass245_7336.method2447();
			if (!(((Class166_Sub3) this).aFloat7335 >= f_1_)) {
				((Class166_Sub3) this).aFloat7337 = method2014(f_1_, ((Class166_Sub3) this).aFloat7337, f, 263075199);
				((Class166_Sub3) this).aFloat7335 += ((Class166_Sub3) this).aFloat7337;
				if (((Class166_Sub3) this).aFloat7335 > f_1_)
					((Class166_Sub3) this).aFloat7335 = f_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.r(").append(')').toString());
		}
	}

	public boolean method1976() {
		return ((Class166_Sub3) this).aClass245_7336 != null;
	}

	public Class260 method1979() {
		return (Class260.method2549(((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335)));
	}

	public Class330_Sub28 method1969(byte i) {
		try {
			Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
			return new Class330_Sub28(0, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.p(").append(')').toString());
		}
	}

	public boolean method1985(int i) {
		try {
			return ((Class166_Sub3) this).aClass245_7336 != null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.j(").append(')').toString());
		}
	}

	public void method1970(Class138 class138, int i, int i_2_, byte i_3_) {
		try {
			Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
			class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
			class138.anInt1531 = 1868671083 * (int) -class260.aFloat2715;
			class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.o(").append(')').toString());
		}
	}

	public void method1974(Buffer class330_sub46, short i) {
		try {
			((Class166_Sub3) this).aClass245_7336 = new Class245(class330_sub46);
			((Class166_Sub3) this).aFloat7335 = 0.0F;
			((Class166_Sub3) this).aFloat7337 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.s(").append(')').toString());
		}
	}

	public void method1972(float f, Class307 class307, int[][][] is) {
		float f_4_ = ((Class166_Sub3) this).aClass245_7336.method2447();
		if (!(((Class166_Sub3) this).aFloat7335 >= f_4_)) {
			((Class166_Sub3) this).aFloat7337 = method2014(f_4_, ((Class166_Sub3) this).aFloat7337, f, 813429827);
			((Class166_Sub3) this).aFloat7335 += ((Class166_Sub3) this).aFloat7337;
			if (((Class166_Sub3) this).aFloat7335 > f_4_)
				((Class166_Sub3) this).aFloat7335 = f_4_;
		}
	}

	public void method1973(float f, Class307 class307, int[][][] is) {
		float f_5_ = ((Class166_Sub3) this).aClass245_7336.method2447();
		if (!(((Class166_Sub3) this).aFloat7335 >= f_5_)) {
			((Class166_Sub3) this).aFloat7337 = method2014(f_5_, ((Class166_Sub3) this).aFloat7337, f, 1019213278);
			((Class166_Sub3) this).aFloat7335 += ((Class166_Sub3) this).aFloat7337;
			if (((Class166_Sub3) this).aFloat7335 > f_5_)
				((Class166_Sub3) this).aFloat7335 = f_5_;
		}
	}

	public void method1983(float f, Class307 class307, int[][][] is) {
		float f_6_ = ((Class166_Sub3) this).aClass245_7336.method2447();
		if (!(((Class166_Sub3) this).aFloat7335 >= f_6_)) {
			((Class166_Sub3) this).aFloat7337 = method2014(f_6_, ((Class166_Sub3) this).aFloat7337, f, 1171438837);
			((Class166_Sub3) this).aFloat7335 += ((Class166_Sub3) this).aFloat7337;
			if (((Class166_Sub3) this).aFloat7335 > f_6_)
				((Class166_Sub3) this).aFloat7335 = f_6_;
		}
	}

	public boolean method1975() {
		return ((Class166_Sub3) this).aClass245_7336 != null;
	}

	public boolean method1978() {
		return ((Class166_Sub3) this).aClass245_7336 != null;
	}

	public boolean method1971() {
		return ((Class166_Sub3) this).aClass245_7336 != null;
	}

	public Class330_Sub28 method1980() {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		return new Class330_Sub28(0, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
	}

	public Class330_Sub28 method1981() {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		return new Class330_Sub28(0, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
	}

	abstract float method2013(float f, float f_7_, float f_8_);

	abstract float method2014(float f, float f_9_, float f_10_, int i);

	public void method1986(Class138 class138, int i, int i_11_) {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
		class138.anInt1531 = 1868671083 * (int) -class260.aFloat2715;
		class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_11_);
	}

	public Class330_Sub28 method1982() {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		return new Class330_Sub28(0, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
	}

	public Class330_Sub28 method1984() {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		return new Class330_Sub28(0, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
	}

	public void method1967(Class138 class138, int i, int i_12_) {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
		class138.anInt1531 = 1868671083 * (int) -class260.aFloat2715;
		class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_12_);
	}

	public void method1977(Class138 class138, int i, int i_13_) {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
		class138.anInt1531 = 1868671083 * (int) -class260.aFloat2715;
		class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_13_);
	}

	public void method1965(Buffer class330_sub46) {
		((Class166_Sub3) this).aClass245_7336 = new Class245(class330_sub46);
		((Class166_Sub3) this).aFloat7335 = 0.0F;
		((Class166_Sub3) this).aFloat7337 = 0.0F;
	}

	Class166_Sub3(Class145 class145) {
		super(class145);
	}

	public float method2015(int i) {
		try {
			return ((Class166_Sub3) this).aClass245_7336.method2444(((Class166_Sub3) this).aFloat7335);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aas.v(").append(')').toString());
		}
	}

	public Class330_Sub28 method1987() {
		Class260 class260 = ((Class166_Sub3) this).aClass245_7336.method2443(((Class166_Sub3) this).aFloat7335);
		return new Class330_Sub28(0, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
	}
}
