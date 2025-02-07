

public class SceneObjectPosition {
	public float x;
	static int anInt2452;
	static int anInt2453;
	public float y;
	public float aFloat2455;
	static SceneObjectPosition[] aClass217Array2456;

	static {
		new SceneObjectPosition(0.0F, 0.0F, 0.0F);
		aClass217Array2456 = new SceneObjectPosition[0];
	}

	public static SceneObjectPosition method2004(float f, float f_0_, float f_1_) {
		synchronized (aClass217Array2456) {
			if (anInt2453 == 0) {
				SceneObjectPosition class217 = new SceneObjectPosition(f, f_0_, f_1_);
				return class217;
			}
			aClass217Array2456[--anInt2453].method2007(f, f_0_, f_1_);
			SceneObjectPosition class217 = aClass217Array2456[anInt2453];
			return class217;
		}
	}

	public static SceneObjectPosition method2005(SceneObjectPosition class217) {
		synchronized (aClass217Array2456) {
			if (anInt2453 == 0) {
				SceneObjectPosition class217_2_ = new SceneObjectPosition(class217);
				return class217_2_;
			}
			aClass217Array2456[--anInt2453].method2013(class217);
			SceneObjectPosition class217_3_ = aClass217Array2456[anInt2453];
			return class217_3_;
		}
	}

	public void method2006() {
		synchronized (aClass217Array2456) {
			if (anInt2453 < anInt2452 - 1)
				aClass217Array2456[anInt2453++] = this;
		}
	}

	public SceneObjectPosition(float f, float f_4_, float f_5_) {
		x = f;
		aFloat2455 = f_4_;
		y = f_5_;
	}

	public void method2007(float f, float f_6_, float f_7_) {
		x = f;
		aFloat2455 = f_6_;
		y = f_7_;
	}

	final void method2008() {
		x = -x;
		aFloat2455 = -aFloat2455;
		y = -y;
	}

	final void method2009(SceneObjectPosition class217_8_) {
		x += class217_8_.x;
		aFloat2455 += class217_8_.aFloat2455;
		y += class217_8_.y;
	}

	public final void method2010(float f, float f_9_, float f_10_) {
		x -= f;
		aFloat2455 -= f_9_;
		y -= f_10_;
	}

	public static final SceneObjectPosition method2011(SceneObjectPosition class217, SceneObjectPosition class217_11_) {
		SceneObjectPosition class217_12_ = method2005(class217);
		class217_12_.method2015(class217_11_);
		return class217_12_;
	}

	public final float method2012() {
		return (float) Math.sqrt((double) (x * x + aFloat2455 * aFloat2455 + y * y));
	}

	public SceneObjectPosition() {
		/* empty */
	}

	SceneObjectPosition(SceneObjectPosition class217_13_) {
		x = class217_13_.x;
		aFloat2455 = class217_13_.aFloat2455;
		y = class217_13_.y;
	}

	public void method2013(SceneObjectPosition class217_14_) {
		method2007(class217_14_.x, class217_14_.aFloat2455, class217_14_.y);
	}

	public String toString() {
		return new StringBuilder().append(x).append(", ").append(aFloat2455).append(", ").append(y).toString();
	}

	final void method2014(Class218 class218) {
		Class218 class218_15_ = Class218.method2020(x, aFloat2455, y, 0.0F);
		Class218 class218_16_ = Class218.method2025(class218);
		Class218 class218_17_ = Class218.method2028(class218_16_, class218_15_);
		class218_17_.method2026(class218);
		method2007(((Class218) class218_17_).aFloat2461, ((Class218) class218_17_).aFloat2458, ((Class218) class218_17_).aFloat2462);
		class218_15_.method2029();
		class218_16_.method2029();
		class218_17_.method2029();
	}

	final void method2015(SceneObjectPosition class217_18_) {
		x -= class217_18_.x;
		aFloat2455 -= class217_18_.aFloat2455;
		y -= class217_18_.y;
	}

	public final void method2016(Class222 class222) {
		float f = x;
		float f_19_ = aFloat2455;
		x = (((Class222) class222).aFloat2494 * f + ((Class222) class222).aFloat2496 * f_19_ + ((Class222) class222).aFloat2499 * y + ((Class222) class222).aFloat2492);
		aFloat2455 = (((Class222) class222).aFloat2502 * f + ((Class222) class222).aFloat2497 * f_19_ + ((Class222) class222).aFloat2500 * y + ((Class222) class222).aFloat2503);
		y = (((Class222) class222).aFloat2495 * f + ((Class222) class222).aFloat2498 * f_19_ + ((Class222) class222).aFloat2501 * y + ((Class222) class222).aFloat2493);
	}

	public static void method2017(int i) {
		anInt2452 = i;
		aClass217Array2456 = new SceneObjectPosition[i];
		anInt2453 = 0;
	}

	public final void method2018(Class222 class222) {
		float f = x;
		float f_20_ = aFloat2455;
		x = (((Class222) class222).aFloat2494 * f + ((Class222) class222).aFloat2496 * f_20_ + ((Class222) class222).aFloat2499 * y);
		aFloat2455 = (((Class222) class222).aFloat2502 * f + ((Class222) class222).aFloat2497 * f_20_ + ((Class222) class222).aFloat2500 * y);
		y = (((Class222) class222).aFloat2495 * f + ((Class222) class222).aFloat2498 * f_20_ + ((Class222) class222).aFloat2501 * y);
	}
}
