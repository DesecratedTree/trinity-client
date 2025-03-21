/* Class475_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class475_Sub2 extends Class475 {
	float aFloat8739;
	float aFloat8740 = 0.0F;
	Class245 aClass245_8741;

	public void method5948(Class245 class245, int i, short i_0_) {
		try {
			((Class475_Sub2) this).aClass245_8741 = class245;
			((Class475_Sub2) this).aFloat8740 = 0.0F;
			((Class475_Sub2) this).aFloat8739 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agg.x(").append(')').toString());
		}
	}

	public void method5923(float f, int i) {
		try {
			float f_1_ = ((Class475_Sub2) this).aClass245_8741.method2447();
			if (!(((Class475_Sub2) this).aFloat8740 >= f_1_)) {
				((Class475_Sub2) this).aFloat8739 = method5951(f_1_, ((Class475_Sub2) this).aFloat8739, f, -672608515);
				((Class475_Sub2) this).aFloat8740 += ((Class475_Sub2) this).aFloat8739;
				if (((Class475_Sub2) this).aFloat8740 > f_1_)
					((Class475_Sub2) this).aFloat8740 = f_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agg.r(").append(')').toString());
		}
	}

	public boolean method5924(int i) {
		try {
			return ((Class475_Sub2) this).aClass245_8741 != null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agg.j(").append(')').toString());
		}
	}

	public Class260 method5932(int i) {
		try {
			return (Class260.method2549(((Class475_Sub2) this).aClass245_8741.method2443(((Class475_Sub2) this).aFloat8740)));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agg.i(").append(')').toString());
		}
	}

	abstract float method5949(float f, float f_2_, float f_3_);

	public void method5922(Class138 class138, Class247 class247, int i, int i_4_, int i_5_) {
		try {
			Class260 class260 = Class260.method2549(((Class475_Sub2) this).aClass145_5699.method1705(-14479435));
			class260.aFloat2716 -= (float) i;
			class260.aFloat2711 -= (float) i_4_;
			Class260 class260_6_ = (Class260.method2549(((Class475_Sub2) this).aClass245_8741.method2443(((Class475_Sub2) this).aFloat8740)));
			class260_6_.aFloat2716 -= (float) i;
			class260_6_.aFloat2711 -= (float) i_4_;
			float f = ((Class475_Sub2) this).aClass245_8741.method2446(((Class475_Sub2) this).aFloat8740);
			Class260 class260_7_ = Class260.method2561(class260_6_, class260);
			class260_7_.method2557();
			Class244 class244 = new Class244();
			class244.method2425(class260_7_, f);
			Class260 class260_8_ = Class260.method2577(0.0F, 1.0F, 0.0F);
			Class260 class260_9_ = Class260.method2564(class260_7_, class260_8_);
			class260_8_ = Class260.method2564(class260_9_, class260_7_);
			class260_8_.method2570(class244);
			class260.aFloat2715 *= -1.0F;
			class260_6_.aFloat2715 *= -1.0F;
			class247.method2457(class260.aFloat2716, class260.aFloat2715, class260.aFloat2711, class260_6_.aFloat2716, class260_6_.aFloat2715, class260_6_.aFloat2711, class260_8_.aFloat2716, class260_8_.aFloat2715, class260_8_.aFloat2711);
			class260.method2550();
			class260_6_.method2550();
			class260_8_.method2550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agg.p(").append(')').toString());
		}
	}

	public void method5925(Buffer class330_sub46, int i) {
		try {
			((Class475_Sub2) this).aClass245_8741 = new Class245(class330_sub46);
			((Class475_Sub2) this).aFloat8740 = 0.0F;
			((Class475_Sub2) this).aFloat8739 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agg.o(").append(')').toString());
		}
	}

	public void method5934(Class138 class138, Class247 class247, int i, int i_10_) {
		Class260 class260 = Class260.method2549(((Class475_Sub2) this).aClass145_5699.method1705(1401620435));
		class260.aFloat2716 -= (float) i;
		class260.aFloat2711 -= (float) i_10_;
		Class260 class260_11_ = (Class260.method2549(((Class475_Sub2) this).aClass245_8741.method2443(((Class475_Sub2) this).aFloat8740)));
		class260_11_.aFloat2716 -= (float) i;
		class260_11_.aFloat2711 -= (float) i_10_;
		float f = ((Class475_Sub2) this).aClass245_8741.method2446(((Class475_Sub2) this).aFloat8740);
		Class260 class260_12_ = Class260.method2561(class260_11_, class260);
		class260_12_.method2557();
		Class244 class244 = new Class244();
		class244.method2425(class260_12_, f);
		Class260 class260_13_ = Class260.method2577(0.0F, 1.0F, 0.0F);
		Class260 class260_14_ = Class260.method2564(class260_12_, class260_13_);
		class260_13_ = Class260.method2564(class260_14_, class260_12_);
		class260_13_.method2570(class244);
		class260.aFloat2715 *= -1.0F;
		class260_11_.aFloat2715 *= -1.0F;
		class247.method2457(class260.aFloat2716, class260.aFloat2715, class260.aFloat2711, class260_11_.aFloat2716, class260_11_.aFloat2715, class260_11_.aFloat2711, class260_13_.aFloat2716, class260_13_.aFloat2715, class260_13_.aFloat2711);
		class260.method2550();
		class260_11_.method2550();
		class260_13_.method2550();
	}

	abstract float method5950(float f, float f_15_, float f_16_);

	public void method5928(float f) {
		float f_17_ = ((Class475_Sub2) this).aClass245_8741.method2447();
		if (!(((Class475_Sub2) this).aFloat8740 >= f_17_)) {
			((Class475_Sub2) this).aFloat8739 = method5951(f_17_, ((Class475_Sub2) this).aFloat8739, f, -399834867);
			((Class475_Sub2) this).aFloat8740 += ((Class475_Sub2) this).aFloat8739;
			if (((Class475_Sub2) this).aFloat8740 > f_17_)
				((Class475_Sub2) this).aFloat8740 = f_17_;
		}
	}

	public void method5927(float f) {
		float f_18_ = ((Class475_Sub2) this).aClass245_8741.method2447();
		if (!(((Class475_Sub2) this).aFloat8740 >= f_18_)) {
			((Class475_Sub2) this).aFloat8739 = method5951(f_18_, ((Class475_Sub2) this).aFloat8739, f, -1263832036);
			((Class475_Sub2) this).aFloat8740 += ((Class475_Sub2) this).aFloat8739;
			if (((Class475_Sub2) this).aFloat8740 > f_18_)
				((Class475_Sub2) this).aFloat8740 = f_18_;
		}
	}

	Class475_Sub2(Class145 class145) {
		super(class145);
		((Class475_Sub2) this).aFloat8739 = 0.0F;
	}

	public void method5930(float f) {
		float f_19_ = ((Class475_Sub2) this).aClass245_8741.method2447();
		if (!(((Class475_Sub2) this).aFloat8740 >= f_19_)) {
			((Class475_Sub2) this).aFloat8739 = method5951(f_19_, ((Class475_Sub2) this).aFloat8739, f, -2127809769);
			((Class475_Sub2) this).aFloat8740 += ((Class475_Sub2) this).aFloat8739;
			if (((Class475_Sub2) this).aFloat8740 > f_19_)
				((Class475_Sub2) this).aFloat8740 = f_19_;
		}
	}

	public boolean method5931() {
		return ((Class475_Sub2) this).aClass245_8741 != null;
	}

	public void method5929(float f) {
		float f_20_ = ((Class475_Sub2) this).aClass245_8741.method2447();
		if (!(((Class475_Sub2) this).aFloat8740 >= f_20_)) {
			((Class475_Sub2) this).aFloat8739 = method5951(f_20_, ((Class475_Sub2) this).aFloat8739, f, -1457196442);
			((Class475_Sub2) this).aFloat8740 += ((Class475_Sub2) this).aFloat8739;
			if (((Class475_Sub2) this).aFloat8740 > f_20_)
				((Class475_Sub2) this).aFloat8740 = f_20_;
		}
	}

	public void method5933(Class138 class138, Class247 class247, int i, int i_21_) {
		Class260 class260 = Class260.method2549(((Class475_Sub2) this).aClass145_5699.method1705(1709764866));
		class260.aFloat2716 -= (float) i;
		class260.aFloat2711 -= (float) i_21_;
		Class260 class260_22_ = (Class260.method2549(((Class475_Sub2) this).aClass245_8741.method2443(((Class475_Sub2) this).aFloat8740)));
		class260_22_.aFloat2716 -= (float) i;
		class260_22_.aFloat2711 -= (float) i_21_;
		float f = ((Class475_Sub2) this).aClass245_8741.method2446(((Class475_Sub2) this).aFloat8740);
		Class260 class260_23_ = Class260.method2561(class260_22_, class260);
		class260_23_.method2557();
		Class244 class244 = new Class244();
		class244.method2425(class260_23_, f);
		Class260 class260_24_ = Class260.method2577(0.0F, 1.0F, 0.0F);
		Class260 class260_25_ = Class260.method2564(class260_23_, class260_24_);
		class260_24_ = Class260.method2564(class260_25_, class260_23_);
		class260_24_.method2570(class244);
		class260.aFloat2715 *= -1.0F;
		class260_22_.aFloat2715 *= -1.0F;
		class247.method2457(class260.aFloat2716, class260.aFloat2715, class260.aFloat2711, class260_22_.aFloat2716, class260_22_.aFloat2715, class260_22_.aFloat2711, class260_24_.aFloat2716, class260_24_.aFloat2715, class260_24_.aFloat2711);
		class260.method2550();
		class260_22_.method2550();
		class260_24_.method2550();
	}

	public boolean method5926() {
		return ((Class475_Sub2) this).aClass245_8741 != null;
	}

	abstract float method5951(float f, float f_26_, float f_27_, int i);

	public void method5936(Buffer class330_sub46) {
		((Class475_Sub2) this).aClass245_8741 = new Class245(class330_sub46);
		((Class475_Sub2) this).aFloat8740 = 0.0F;
		((Class475_Sub2) this).aFloat8739 = 0.0F;
	}

	public Class260 method5935() {
		return (Class260.method2549(((Class475_Sub2) this).aClass245_8741.method2443(((Class475_Sub2) this).aFloat8740)));
	}

	public static void method5952(int i, String string, int i_28_) {
		try {
			Class556.method6406(i, 0, "", "", "", string, -1777247013);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agg.i(").append(')').toString());
		}
	}
}
