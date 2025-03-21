/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class253 {
	float aFloat2636;
	Class260[] aClass260Array2637 = new Class260[4];
	float[] aFloatArray2638;

	void method2528() {
		((Class253) this).aFloat2636 = -1.0F;
		((Class253) this).aFloatArray2638 = null;
	}

	void method2529(int i, Class260 class260) {
		((Class253) this).aClass260Array2637[i].method2582(class260);
		method2528();
	}

	Class260 method2530(float f) {
		Class260 class260 = new Class260();
		float f_0_ = f * f;
		float f_1_ = f_0_ * f;
		float f_2_ = 3.0F * (((Class253) this).aClass260Array2637[1].aFloat2716 - ((Class253) this).aClass260Array2637[0].aFloat2716);
		float f_3_ = (3.0F * (((Class253) this).aClass260Array2637[2].aFloat2716 - ((Class253) this).aClass260Array2637[1].aFloat2716) - f_2_);
		float f_4_ = (((Class253) this).aClass260Array2637[3].aFloat2716 - ((Class253) this).aClass260Array2637[0].aFloat2716 - f_2_ - f_3_);
		class260.aFloat2716 = (f_4_ * f_1_ + f_3_ * f_0_ + f_2_ * f + ((Class253) this).aClass260Array2637[0].aFloat2716);
		f_2_ = 3.0F * (((Class253) this).aClass260Array2637[1].aFloat2715 - ((Class253) this).aClass260Array2637[0].aFloat2715);
		f_3_ = (3.0F * (((Class253) this).aClass260Array2637[2].aFloat2715 - ((Class253) this).aClass260Array2637[1].aFloat2715) - f_2_);
		f_4_ = (((Class253) this).aClass260Array2637[3].aFloat2715 - ((Class253) this).aClass260Array2637[0].aFloat2715 - f_2_ - f_3_);
		class260.aFloat2715 = (f_4_ * f_1_ + f_3_ * f_0_ + f_2_ * f + ((Class253) this).aClass260Array2637[0].aFloat2715);
		f_2_ = 3.0F * (((Class253) this).aClass260Array2637[1].aFloat2711 - ((Class253) this).aClass260Array2637[0].aFloat2711);
		f_3_ = (3.0F * (((Class253) this).aClass260Array2637[2].aFloat2711 - ((Class253) this).aClass260Array2637[1].aFloat2711) - f_2_);
		f_4_ = (((Class253) this).aClass260Array2637[3].aFloat2711 - ((Class253) this).aClass260Array2637[0].aFloat2711 - f_2_ - f_3_);
		class260.aFloat2711 = (f_4_ * f_1_ + f_3_ * f_0_ + f_2_ * f + ((Class253) this).aClass260Array2637[0].aFloat2711);
		return class260;
	}

	float method2531() {
		if (((Class253) this).aFloat2636 == -1.0F)
			method2533();
		return ((Class253) this).aFloat2636;
	}

	float method2532(float f) {
		if (((Class253) this).aFloat2636 == -1.0F)
			method2533();
		if (f <= 0.0F)
			return 0.0F;
		if (f >= ((Class253) this).aFloat2636)
			return 1.0F;
		float f_5_ = 0.0F;
		float f_6_ = ((Class253) this).aFloatArray2638[0];
		for (int i = 0; i < ((Class253) this).aFloatArray2638.length; i++) {
			if (f < f_6_) {
				float f_7_ = (f - f_5_) / (f_6_ - f_5_);
				float f_8_ = ((float) (i - 1) / (float) ((Class253) this).aFloatArray2638.length);
				float f_9_ = ((float) i / (float) ((Class253) this).aFloatArray2638.length);
				return f_8_ + (f_9_ - f_8_) * f_7_;
			}
			f_5_ = f_6_;
			f_6_ += ((Class253) this).aFloatArray2638[i];
		}
		float f_10_ = (f - f_5_) / (f_6_ - f_5_);
		float f_11_ = ((float) (((Class253) this).aFloatArray2638.length - 1) / (float) ((Class253) this).aFloatArray2638.length);
		return f_11_ + (1.0F - f_11_) * f_10_;
	}

	void method2533() {
		int i = 20;
		Class260 class260 = method2530(0.0F);
		float f = 0.0F;
		for (int i_12_ = 1; i_12_ <= i; i_12_++) {
			Class260 class260_13_ = method2530((float) i_12_ / (float) i);
			f += Class260.method2561(class260_13_, class260).method2565();
			class260 = class260_13_;
		}
		int i_14_ = (int) (f / 20.0F);
		if (i_14_ < i)
			i_14_ = i;
		((Class253) this).aFloatArray2638 = new float[i_14_];
		class260 = method2530(0.0F);
		float f_15_ = 0.0F;
		for (int i_16_ = 1; i_16_ <= i_14_; i_16_++) {
			Class260 class260_17_ = method2530((float) i_16_ / (float) i_14_);
			float f_18_ = Class260.method2561(class260_17_, class260).method2565();
			f_15_ += f_18_;
			((Class253) this).aFloatArray2638[i_16_ - 1] = f_18_;
			class260 = class260_17_;
		}
		((Class253) this).aFloat2636 = f_15_;
	}

	Class260 method2534(int i) {
		return ((Class253) this).aClass260Array2637[i];
	}

	Class253() {
		for (int i = 0; i < 4; i++)
			((Class253) this).aClass260Array2637[i] = new Class260();
		method2528();
	}
}
