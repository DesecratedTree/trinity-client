/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class245 {
	Class253[] aClass253Array2615 = new Class253[1];
	float[] aFloatArray2616 = new float[2];

	public float method2440(float f) {
		int i = (int) f;
		if (i + 1 < ((Class245) this).aFloatArray2616.length) {
			float f_0_ = ((Class245) this).aFloatArray2616[i];
			float f_1_ = ((Class245) this).aFloatArray2616[i + 1];
			float f_2_ = f - (float) i;
			return (1.0F - f_2_) * f_0_ + f_2_ * f_1_;
		}
		return (((Class245) this).aFloatArray2616[((Class245) this).aFloatArray2616.length - 1]);
	}

	float method2441(int i) {
		return ((Class245) this).aFloatArray2616[i];
	}

	public Class260 method2442(float f) {
		int i = (int) f;
		if (i < ((Class245) this).aClass253Array2615.length)
			return ((Class245) this).aClass253Array2615[i].method2530(f - (float) i);
		return ((Class245) this).aClass253Array2615[((Class245) this).aClass253Array2615.length - 1].method2530(1.0F);
	}

	public Class260 method2443(float f) {
		float f_3_ = 0.0F;
		float f_4_ = 0.0F;
		for (int i = 0; i < ((Class245) this).aClass253Array2615.length; i++) {
			f_4_ += ((Class245) this).aClass253Array2615[i].method2531();
			if (f < f_4_) {
				float f_5_ = ((Class245) this).aClass253Array2615[i].method2532(f - f_3_);
				return ((Class245) this).aClass253Array2615[i].method2530(f_5_);
			}
			f_3_ = f_4_;
		}
		return ((Class245) this).aClass253Array2615[((Class245) this).aClass253Array2615.length - 1].method2530(1.0F);
	}

	public float method2444(float f) {
		float f_6_ = 0.0F;
		float f_7_ = 0.0F;
		for (int i = 0; i < ((Class245) this).aClass253Array2615.length; i++) {
			f_7_ += ((Class245) this).aClass253Array2615[i].method2531();
			if (f < f_7_)
				return (((Class245) this).aClass253Array2615[i].method2532(f - f_6_) + (float) i);
			f_6_ = f_7_;
		}
		return (float) ((Class245) this).aClass253Array2615.length;
	}

	void method2445(Class260 class260, Class260 class260_8_, float f) {
		Class253[] class253s = new Class253[((Class245) this).aClass253Array2615.length + 1];
		System.arraycopy(((Class245) this).aClass253Array2615, 0, class253s, 0, ((Class245) this).aClass253Array2615.length);
		Class253 class253 = new Class253();
		Class253 class253_9_ = (((Class245) this).aClass253Array2615[((Class245) this).aClass253Array2615.length - 1]);
		class253.method2529(0, class253_9_.method2534(3));
		Class260 class260_10_ = Class260.method2561(class253_9_.method2534(3), class253_9_.method2534(2));
		class253.method2529(1, Class260.method2578(class253_9_.method2534(3), class260_10_));
		class253.method2529(3, class260);
		class253.method2529(2, class260_8_);
		class253s[class253s.length - 1] = class253;
		((Class245) this).aClass253Array2615 = class253s;
		float[] fs = new float[((Class245) this).aFloatArray2616.length + 1];
		System.arraycopy(((Class245) this).aFloatArray2616, 0, fs, 0, ((Class245) this).aFloatArray2616.length);
		fs[fs.length - 1] = f;
		((Class245) this).aFloatArray2616 = fs;
	}

	public float method2446(float f) {
		float f_11_ = 0.0F;
		float f_12_ = 0.0F;
		float f_13_ = method2441(0);
		float f_14_ = 0.0F;
		for (int i = 0; i < ((Class245) this).aClass253Array2615.length; i++) {
			f_12_ += ((Class245) this).aClass253Array2615[i].method2531();
			f_14_ = method2441(i + 1);
			if (f < f_12_) {
				float f_15_ = (f - f_11_) / (f_12_ - f_11_);
				float f_16_ = f_14_ - f_13_;
				if ((double) f_16_ > 3.141592653589793)
					f_16_ -= 6.2831855F;
				else if ((double) f_16_ < -3.141592653589793)
					f_16_ += 6.2831855F;
				return f_13_ + f_16_ * f_15_;
			}
			f_11_ = f_12_;
			f_13_ = f_14_;
		}
		return (((Class245) this).aFloatArray2616[((Class245) this).aFloatArray2616.length - 1]);
	}

	public Class245(Buffer class330_sub46) {
		int i = class330_sub46.readSmart(-105201095);
		((Class245) this).aClass253Array2615[0] = new Class253();
		((Class245) this).aClass253Array2615[0].method2529(0, new Class260(class330_sub46));
		((Class245) this).aClass253Array2615[0].method2529(1, new Class260(class330_sub46));
		((Class245) this).aFloatArray2616[0] = class330_sub46.method3760(-1279245802);
		((Class245) this).aClass253Array2615[0].method2529(3, new Class260(class330_sub46));
		((Class245) this).aClass253Array2615[0].method2529(2, new Class260(class330_sub46));
		((Class245) this).aFloatArray2616[1] = class330_sub46.method3760(-1279245802);
		for (int i_17_ = 2; i_17_ < i; i_17_++) {
			Class260 class260 = new Class260(class330_sub46);
			Class260 class260_18_ = new Class260(class330_sub46);
			method2445(class260, class260_18_, class330_sub46.method3760(-1279245802));
		}
	}

	public float method2447() {
		float f = 0.0F;
		for (int i = 0; i < ((Class245) this).aClass253Array2615.length; i++)
			f += ((Class245) this).aClass253Array2615[i].method2531();
		return f;
	}
}
