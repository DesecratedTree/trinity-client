/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class289 {
	int anInt2957;
	int[] anIntArray2958;
	int anInt2959;
	int[] anIntArray2960;
	float[][] aFloatArrayArray2961;
	int[] anIntArray2962;

	static int method2891(int i, int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow((double) i, 1.0 / (double) i_0_) + 1; Class437.method5585(i_1_, i_0_, (byte) 16) > i; i_1_--) {
			/* empty */
		}
		return i_1_;
	}

	Class289() {
		Class330_Sub41.method3694(24);
		((Class289) this).anInt2959 = Class330_Sub41.method3694(16);
		((Class289) this).anInt2957 = Class330_Sub41.method3694(24);
		((Class289) this).anIntArray2962 = new int[((Class289) this).anInt2957];
		boolean bool = Class330_Sub41.method3698() != 0;
		if (bool) {
			int i = 0;
			int i_2_ = Class330_Sub41.method3694(5) + 1;
			while (i < ((Class289) this).anInt2957) {
				int i_3_ = (Class330_Sub41.method3694(Class64.method779(((Class289) this).anInt2957 - i, -300060441)));
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
					((Class289) this).anIntArray2962[i++] = i_2_;
				i_2_++;
			}
		} else {
			boolean bool_5_ = Class330_Sub41.method3698() != 0;
			for (int i = 0; i < ((Class289) this).anInt2957; i++) {
				if (bool_5_ && Class330_Sub41.method3698() == 0)
					((Class289) this).anIntArray2962[i] = 0;
				else
					((Class289) this).anIntArray2962[i] = Class330_Sub41.method3694(5) + 1;
			}
		}
		method2894();
		int i = Class330_Sub41.method3694(4);
		if (i > 0) {
			float f = Class330_Sub41.method3706(Class330_Sub41.method3694(32));
			float f_6_ = Class330_Sub41.method3706(Class330_Sub41.method3694(32));
			int i_7_ = Class330_Sub41.method3694(4) + 1;
			boolean bool_8_ = Class330_Sub41.method3698() != 0;
			int i_9_;
			if (i == 1)
				i_9_ = method2891(((Class289) this).anInt2957, ((Class289) this).anInt2959);
			else
				i_9_ = (((Class289) this).anInt2957 * ((Class289) this).anInt2959);
			((Class289) this).anIntArray2960 = new int[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				((Class289) this).anIntArray2960[i_10_] = Class330_Sub41.method3694(i_7_);
			((Class289) this).aFloatArrayArray2961 = (new float[((Class289) this).anInt2957][((Class289) this).anInt2959]);
			if (i == 1) {
				for (int i_11_ = 0; i_11_ < ((Class289) this).anInt2957; i_11_++) {
					float f_12_ = 0.0F;
					int i_13_ = 1;
					for (int i_14_ = 0; i_14_ < ((Class289) this).anInt2959; i_14_++) {
						int i_15_ = i_11_ / i_13_ % i_9_;
						float f_16_ = (((float) ((Class289) this).anIntArray2960[i_15_] * f_6_) + f + f_12_);
						((Class289) this).aFloatArrayArray2961[i_11_][i_14_] = f_16_;
						if (bool_8_)
							f_12_ = f_16_;
						i_13_ *= i_9_;
					}
				}
			} else {
				for (int i_17_ = 0; i_17_ < ((Class289) this).anInt2957; i_17_++) {
					float f_18_ = 0.0F;
					int i_19_ = i_17_ * ((Class289) this).anInt2959;
					for (int i_20_ = 0; i_20_ < ((Class289) this).anInt2959; i_20_++) {
						float f_21_ = (((float) ((Class289) this).anIntArray2960[i_19_] * f_6_) + f + f_18_);
						((Class289) this).aFloatArrayArray2961[i_17_][i_20_] = f_21_;
						if (bool_8_)
							f_18_ = f_21_;
						i_19_++;
					}
				}
			}
		}
	}

	int method2892() {
		int i;
		for (i = 0; ((Class289) this).anIntArray2958[i] >= 0; i = (Class330_Sub41.method3698() != 0 ? ((Class289) this).anIntArray2958[i] : i + 1)) {
			/* empty */
		}
		return ((Class289) this).anIntArray2958[i] ^ 0xffffffff;
	}

	float[] method2893() {
		return ((Class289) this).aFloatArrayArray2961[method2892()];
	}

	void method2894() {
		int[] is = new int[((Class289) this).anInt2957];
		int[] is_22_ = new int[33];
		for (int i = 0; i < ((Class289) this).anInt2957; i++) {
			int i_23_ = ((Class289) this).anIntArray2962[i];
			if (i_23_ != 0) {
				int i_24_ = 1 << 32 - i_23_;
				int i_25_ = is_22_[i_23_];
				is[i] = i_25_;
				int i_26_;
				if ((i_25_ & i_24_) != 0)
					i_26_ = is_22_[i_23_ - 1];
				else {
					i_26_ = i_25_ | i_24_;
					for (int i_27_ = i_23_ - 1; i_27_ >= 1; i_27_--) {
						int i_28_ = is_22_[i_27_];
						if (i_28_ != i_25_)
							break;
						int i_29_ = 1 << 32 - i_27_;
						if ((i_28_ & i_29_) != 0) {
							is_22_[i_27_] = is_22_[i_27_ - 1];
							break;
						}
						is_22_[i_27_] = i_28_ | i_29_;
					}
				}
				is_22_[i_23_] = i_26_;
				for (int i_30_ = i_23_ + 1; i_30_ <= 32; i_30_++) {
					int i_31_ = is_22_[i_30_];
					if (i_31_ == i_25_)
						is_22_[i_30_] = i_26_;
				}
			}
		}
		((Class289) this).anIntArray2958 = new int[8];
		int i = 0;
		for (int i_32_ = 0; i_32_ < ((Class289) this).anInt2957; i_32_++) {
			int i_33_ = ((Class289) this).anIntArray2962[i_32_];
			if (i_33_ != 0) {
				int i_34_ = is[i_32_];
				int i_35_ = 0;
				for (int i_36_ = 0; i_36_ < i_33_; i_36_++) {
					int i_37_ = -2147483648 >>> i_36_;
					if ((i_34_ & i_37_) != 0) {
						if (((Class289) this).anIntArray2958[i_35_] == 0)
							((Class289) this).anIntArray2958[i_35_] = i;
						i_35_ = ((Class289) this).anIntArray2958[i_35_];
					} else
						i_35_++;
					if (i_35_ >= ((Class289) this).anIntArray2958.length) {
						int[] is_38_ = (new int[((Class289) this).anIntArray2958.length * 2]);
						for (int i_39_ = 0; i_39_ < ((Class289) this).anIntArray2958.length; i_39_++)
							is_38_[i_39_] = ((Class289) this).anIntArray2958[i_39_];
						((Class289) this).anIntArray2958 = is_38_;
					}
					i_37_ >>>= 1;
				}
				((Class289) this).anIntArray2958[i_35_] = i_32_ ^ 0xffffffff;
				if (i_35_ >= i)
					i = i_35_ + 1;
			}
		}
	}
}
