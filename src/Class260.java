/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class260 {
	public float aFloat2711;
	static int anInt2712;
	static int anInt2713;
	static Class260[] aClass260Array2714;
	public float aFloat2715;
	public float aFloat2716;

	public static Class260 method2548() {
		synchronized (aClass260Array2714) {
			if (anInt2713 == 0) {
				Class260 class260 = new Class260();
				return class260;
			}
			aClass260Array2714[--anInt2713].method2554();
			Class260 class260 = aClass260Array2714[anInt2713];
			return class260;
		}
	}

	public static Class260 method2549(Class260 class260) {
		synchronized (aClass260Array2714) {
			if (anInt2713 == 0) {
				Class260 class260_0_ = new Class260(class260);
				return class260_0_;
			}
			aClass260Array2714[--anInt2713].method2582(class260);
			Class260 class260_1_ = aClass260Array2714[anInt2713];
			return class260_1_;
		}
	}

	public void method2550() {
		synchronized (aClass260Array2714) {
			if (anInt2713 < anInt2712 - 1)
				aClass260Array2714[anInt2713++] = this;
		}
	}

	public Class260() {
		/* empty */
	}

	public Class260(float f, float f_2_, float f_3_) {
		aFloat2716 = f;
		aFloat2715 = f_2_;
		aFloat2711 = f_3_;
	}

	Class260(Class260 class260_4_) {
		aFloat2716 = class260_4_.aFloat2716;
		aFloat2715 = class260_4_.aFloat2715;
		aFloat2711 = class260_4_.aFloat2711;
	}

	public final void method2551() {
		if (aFloat2716 < 0.0F)
			aFloat2716 *= -1.0F;
		if (aFloat2715 < 0.0F)
			aFloat2715 *= -1.0F;
		if (aFloat2711 < 0.0F)
			aFloat2711 *= -1.0F;
	}

	public void method2552(Buffer class330_sub46) {
		aFloat2716 = class330_sub46.method3760(-1279245802);
		aFloat2715 = class330_sub46.method3760(-1279245802);
		aFloat2711 = class330_sub46.method3760(-1279245802);
	}

	public void method2553(float f, float f_5_, float f_6_) {
		aFloat2716 = f;
		aFloat2715 = f_5_;
		aFloat2711 = f_6_;
	}

	public final void method2554() {
		aFloat2711 = 0.0F;
		aFloat2715 = 0.0F;
		aFloat2716 = 0.0F;
	}

	public boolean method2555(Class260 class260_7_) {
		if (aFloat2716 != class260_7_.aFloat2716 || aFloat2715 != class260_7_.aFloat2715 || aFloat2711 != class260_7_.aFloat2711)
			return false;
		return true;
	}

	public final void method2556() {
		aFloat2716 = -aFloat2716;
		aFloat2715 = -aFloat2715;
		aFloat2711 = -aFloat2711;
	}

	public final void method2557() {
		float f = 1.0F / method2565();
		aFloat2716 *= f;
		aFloat2715 *= f;
		aFloat2711 *= f;
	}

	public final void method2558(Class260 class260_8_) {
		aFloat2716 += class260_8_.aFloat2716;
		aFloat2715 += class260_8_.aFloat2715;
		aFloat2711 += class260_8_.aFloat2711;
	}

	Class260(Buffer class330_sub46) {
		aFloat2716 = class330_sub46.method3760(-1279245802);
		aFloat2715 = class330_sub46.method3760(-1279245802);
		aFloat2711 = class330_sub46.method3760(-1279245802);
	}

	final void method2559(Class260 class260_9_) {
		aFloat2716 -= class260_9_.aFloat2716;
		aFloat2715 -= class260_9_.aFloat2715;
		aFloat2711 -= class260_9_.aFloat2711;
	}

	final void method2560(Class260 class260_10_) {
		aFloat2716 /= class260_10_.aFloat2716;
		aFloat2715 /= class260_10_.aFloat2715;
		aFloat2711 /= class260_10_.aFloat2711;
	}

	public static final Class260 method2561(Class260 class260, Class260 class260_11_) {
		Class260 class260_12_ = method2549(class260);
		class260_12_.method2559(class260_11_);
		return class260_12_;
	}

	public static final float method2562(Class260 class260, Class260 class260_13_) {
		return class260.method2576(class260_13_);
	}

	final void method2563(Class260 class260_14_) {
		method2553((aFloat2715 * class260_14_.aFloat2711 - aFloat2711 * class260_14_.aFloat2715), (aFloat2711 * class260_14_.aFloat2716 - aFloat2716 * class260_14_.aFloat2711), (aFloat2716 * class260_14_.aFloat2715 - aFloat2715 * class260_14_.aFloat2716));
	}

	public static final Class260 method2564(Class260 class260, Class260 class260_15_) {
		Class260 class260_16_ = method2549(class260);
		class260_16_.method2563(class260_15_);
		return class260_16_;
	}

	public final float method2565() {
		return (float) Math.sqrt((double) (aFloat2716 * aFloat2716 + aFloat2715 * aFloat2715 + aFloat2711 * aFloat2711));
	}

	public static final Class260 method2566(Class260 class260, Class260 class260_17_) {
		Class260 class260_18_ = method2549(class260);
		class260_18_.method2581(class260_17_);
		return class260_18_;
	}

	public final void method2567(float f) {
		aFloat2716 *= f;
		aFloat2715 *= f;
		aFloat2711 *= f;
	}

	public static final Class260 method2568(Class260 class260, Class260 class260_19_) {
		Class260 class260_20_ = method2549(class260);
		class260_20_.method2560(class260_19_);
		return class260_20_;
	}

	public final void method2569(float f) {
		aFloat2716 /= f;
		aFloat2715 /= f;
		aFloat2711 /= f;
	}

	public final void method2570(Class244 class244) {
		Class244 class244_21_ = Class244.method2437(aFloat2716, aFloat2715, aFloat2711, 0.0F);
		Class244 class244_22_ = Class244.method2438(class244);
		Class244 class244_23_ = Class244.method2439(class244_22_, class244_21_);
		class244_23_.method2429(class244);
		method2553(class244_23_.aFloat2608, class244_23_.aFloat2612, class244_23_.aFloat2613);
		class244_21_.method2417();
		class244_22_.method2417();
		class244_23_.method2417();
	}

	public final void method2571(Class260 class260_24_, float f) {
		aFloat2716 += class260_24_.aFloat2716 * f;
		aFloat2715 += class260_24_.aFloat2715 * f;
		aFloat2711 += class260_24_.aFloat2711 * f;
	}

	public final void method2572(Class260 class260_25_, float f) {
		method2567(1.0F - f);
		method2558(method2574(class260_25_, f));
	}

	static {
		new Class260(0.0F, 0.0F, 0.0F);
		aClass260Array2714 = new Class260[0];
	}

	public final void method2573(Class247 class247) {
		float f = aFloat2716;
		float f_26_ = aFloat2715;
		aFloat2716 = (((Class247) class247).aFloat2618 * f + ((Class247) class247).aFloat2620 * f_26_ + ((Class247) class247).aFloat2626 * aFloat2711 + ((Class247) class247).aFloat2627);
		aFloat2715 = (((Class247) class247).aFloat2619 * f + ((Class247) class247).aFloat2622 * f_26_ + ((Class247) class247).aFloat2625 * aFloat2711 + ((Class247) class247).aFloat2628);
		aFloat2711 = (((Class247) class247).aFloat2617 * f + ((Class247) class247).aFloat2623 * f_26_ + ((Class247) class247).aFloat2624 * aFloat2711 + ((Class247) class247).aFloat2629);
	}

	public static final Class260 method2574(Class260 class260, float f) {
		Class260 class260_27_ = method2549(class260);
		class260_27_.method2567(f);
		return class260_27_;
	}

	public final void method2575(Class247 class247) {
		float f = aFloat2716;
		float f_28_ = aFloat2715;
		aFloat2716 = (((Class247) class247).aFloat2618 * f + ((Class247) class247).aFloat2620 * f_28_ + ((Class247) class247).aFloat2626 * aFloat2711);
		aFloat2715 = (((Class247) class247).aFloat2619 * f + ((Class247) class247).aFloat2622 * f_28_ + ((Class247) class247).aFloat2625 * aFloat2711);
		aFloat2711 = (((Class247) class247).aFloat2617 * f + ((Class247) class247).aFloat2623 * f_28_ + ((Class247) class247).aFloat2624 * aFloat2711);
	}

	public final float method2576(Class260 class260_29_) {
		return (aFloat2716 * class260_29_.aFloat2716 + aFloat2715 * class260_29_.aFloat2715 + aFloat2711 * class260_29_.aFloat2711);
	}

	public String toString() {
		return new StringBuilder().append(aFloat2716).append(", ").append(aFloat2715).append(", ").append(aFloat2711).toString();
	}

	public static Class260 method2577(float f, float f_30_, float f_31_) {
		synchronized (aClass260Array2714) {
			if (anInt2713 == 0) {
				Class260 class260 = new Class260(f, f_30_, f_31_);
				return class260;
			}
			aClass260Array2714[--anInt2713].method2553(f, f_30_, f_31_);
			Class260 class260 = aClass260Array2714[anInt2713];
			return class260;
		}
	}

	public static final Class260 method2578(Class260 class260, Class260 class260_32_) {
		Class260 class260_33_ = method2549(class260);
		class260_33_.method2558(class260_32_);
		return class260_33_;
	}

	public final void method2579(float f, float f_34_, float f_35_) {
		aFloat2716 -= f;
		aFloat2715 -= f_34_;
		aFloat2711 -= f_35_;
	}

	public static void method2580(int i) {
		anInt2712 = i;
		aClass260Array2714 = new Class260[i];
		anInt2713 = 0;
	}

	final void method2581(Class260 class260_36_) {
		aFloat2716 *= class260_36_.aFloat2716;
		aFloat2715 *= class260_36_.aFloat2715;
		aFloat2711 *= class260_36_.aFloat2711;
	}

	public void method2582(Class260 class260_37_) {
		method2553(class260_37_.aFloat2716, class260_37_.aFloat2715, class260_37_.aFloat2711);
	}
}
