/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class244 {
	public float aFloat2608;
	static int anInt2609;
	static int anInt2610;
	static Class244[] aClass244Array2611 = new Class244[0];
	public float aFloat2612;
	public float aFloat2613;
	public float aFloat2614;

	final void method2415(Class244 class244_0_) {
		aFloat2608 += class244_0_.aFloat2608;
		aFloat2612 += class244_0_.aFloat2612;
		aFloat2613 += class244_0_.aFloat2613;
		aFloat2614 += class244_0_.aFloat2614;
	}

	public Class244(Class244 class244_1_) {
		method2419(class244_1_);
	}

	public static Class244 method2416(Class244 class244) {
		synchronized (aClass244Array2611) {
			if (anInt2610 == 0) {
				Class244 class244_2_ = new Class244(class244);
				return class244_2_;
			}
			aClass244Array2611[--anInt2610].method2419(class244);
			Class244 class244_3_ = aClass244Array2611[anInt2610];
			return class244_3_;
		}
	}

	public void method2417() {
		synchronized (aClass244Array2611) {
			if (anInt2610 < anInt2609 - 1)
				aClass244Array2611[anInt2610++] = this;
		}
	}

	public Class244() {
		method2421();
	}

	public Class244(float f, float f_4_, float f_5_) {
		method2420(f, f_4_, f_5_);
	}

	void method2418(float f, float f_6_, float f_7_, float f_8_) {
		aFloat2608 = f;
		aFloat2612 = f_6_;
		aFloat2613 = f_7_;
		aFloat2614 = f_8_;
	}

	public void method2419(Class244 class244_9_) {
		aFloat2608 = class244_9_.aFloat2608;
		aFloat2612 = class244_9_.aFloat2612;
		aFloat2613 = class244_9_.aFloat2613;
		aFloat2614 = class244_9_.aFloat2614;
	}

	public void method2420(float f, float f_10_, float f_11_) {
		method2427(0.0F, 1.0F, 0.0F, f);
		Class244 class244_12_ = method2428();
		class244_12_.method2427(1.0F, 0.0F, 0.0F, f_10_);
		method2429(class244_12_);
		class244_12_.method2427(0.0F, 0.0F, 1.0F, f_11_);
		method2429(class244_12_);
		class244_12_.method2417();
	}

	final void method2421() {
		aFloat2613 = 0.0F;
		aFloat2612 = 0.0F;
		aFloat2608 = 0.0F;
		aFloat2614 = 1.0F;
	}

	final void method2422() {
		aFloat2608 = -aFloat2608;
		aFloat2612 = -aFloat2612;
		aFloat2613 = -aFloat2613;
		aFloat2614 = -aFloat2614;
	}

	public final void method2423() {
		aFloat2608 = -aFloat2608;
		aFloat2612 = -aFloat2612;
		aFloat2613 = -aFloat2613;
	}

	final void method2424() {
		float f = 1.0F / method2433(this);
		aFloat2608 *= f;
		aFloat2612 *= f;
		aFloat2613 *= f;
		aFloat2614 *= f;
	}

	public void method2425(Class260 class260, float f) {
		method2427(class260.aFloat2716, class260.aFloat2715, class260.aFloat2711, f);
	}

	final float method2426(Class244 class244_13_) {
		return (aFloat2608 * class244_13_.aFloat2608 + aFloat2612 * class244_13_.aFloat2612 + aFloat2613 * class244_13_.aFloat2613 + aFloat2614 * class244_13_.aFloat2614);
	}

	public void method2427(float f, float f_14_, float f_15_, float f_16_) {
		float f_17_ = (float) Math.sin((double) (f_16_ * 0.5F));
		float f_18_ = (float) Math.cos((double) (f_16_ * 0.5F));
		aFloat2608 = f * f_17_;
		aFloat2612 = f_14_ * f_17_;
		aFloat2613 = f_15_ * f_17_;
		aFloat2614 = f_18_;
	}

	public static Class244 method2428() {
		synchronized (aClass244Array2611) {
			if (anInt2610 == 0) {
				Class244 class244 = new Class244();
				return class244;
			}
			aClass244Array2611[--anInt2610].method2421();
			Class244 class244 = aClass244Array2611[anInt2610];
			return class244;
		}
	}

	public final void method2429(Class244 class244_19_) {
		method2418((class244_19_.aFloat2614 * aFloat2608 + class244_19_.aFloat2608 * aFloat2614 + class244_19_.aFloat2612 * aFloat2613 - class244_19_.aFloat2613 * aFloat2612), (class244_19_.aFloat2614 * aFloat2612 - class244_19_.aFloat2608 * aFloat2613 + class244_19_.aFloat2612 * aFloat2614 + class244_19_.aFloat2613 * aFloat2608), (class244_19_.aFloat2614 * aFloat2613 + class244_19_.aFloat2608 * aFloat2612 - class244_19_.aFloat2612 * aFloat2608 + class244_19_.aFloat2613 * aFloat2614), (class244_19_.aFloat2614 * aFloat2614 - class244_19_.aFloat2608 * aFloat2608 - class244_19_.aFloat2612 * aFloat2612 - class244_19_.aFloat2613 * aFloat2613));
	}

	final void method2430(float f) {
		aFloat2608 *= f;
		aFloat2612 *= f;
		aFloat2613 *= f;
		aFloat2614 *= f;
	}

	static final Class244 method2431(Class244 class244, float f) {
		Class244 class244_20_ = method2416(class244);
		class244_20_.method2430(f);
		return class244_20_;
	}

	public final void method2432(Class244 class244_21_, float f) {
		if (method2426(class244_21_) < 0.0F)
			method2422();
		method2430(1.0F - f);
		Class244 class244_22_ = method2431(class244_21_, f);
		method2415(class244_22_);
		class244_22_.method2417();
		method2424();
	}

	public String toString() {
		return new StringBuilder().append(aFloat2608).append(",").append(aFloat2612).append(",").append(aFloat2613).append(",").append(aFloat2614).toString();
	}

	static {
		new Class244();
	}

	static final float method2433(Class244 class244) {
		return (float) Math.sqrt((double) method2435(class244, class244));
	}

	public void method2434(Buffer class330_sub46) {
		aFloat2608 = class330_sub46.method3760(-1279245802);
		aFloat2612 = class330_sub46.method3760(-1279245802);
		aFloat2613 = class330_sub46.method3760(-1279245802);
		aFloat2614 = class330_sub46.method3760(-1279245802);
	}

	static final float method2435(Class244 class244, Class244 class244_23_) {
		return class244.method2426(class244_23_);
	}

	public static void method2436(int i) {
		anInt2609 = i;
		aClass244Array2611 = new Class244[i];
		anInt2610 = 0;
	}

	static Class244 method2437(float f, float f_24_, float f_25_, float f_26_) {
		synchronized (aClass244Array2611) {
			if (anInt2610 == 0) {
				Class244 class244 = new Class244(f, f_24_, f_25_, f_26_);
				return class244;
			}
			aClass244Array2611[--anInt2610].method2418(f, f_24_, f_25_, f_26_);
			Class244 class244 = aClass244Array2611[anInt2610];
			return class244;
		}
	}

	public Class244(float f, float f_27_, float f_28_, float f_29_) {
		method2418(f, f_27_, f_28_, f_29_);
	}

	public static final Class244 method2438(Class244 class244) {
		Class244 class244_30_ = method2416(class244);
		class244_30_.method2423();
		return class244_30_;
	}

	static final Class244 method2439(Class244 class244, Class244 class244_31_) {
		Class244 class244_32_ = method2416(class244);
		class244_32_.method2429(class244_31_);
		return class244_32_;
	}
}
