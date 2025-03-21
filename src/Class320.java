/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320 {
	int anInt3284;
	int anInt3285;
	int anInt3286;
	int anInt3287 = Class330_Sub41.method3694(16);
	int anInt3288 = Class330_Sub41.method3694(24);
	int anInt3289;
	int[] anIntArray3290;

	void method3170(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = (((Class289) (Class330_Sub41.aClass289Array7783[((Class320) this).anInt3289])).anInt2959);
			int i_2_ = ((Class320) this).anInt3286 - ((Class320) this).anInt3288;
			int i_3_ = i_2_ / ((Class320) this).anInt3285;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class330_Sub41.aClass289Array7783[((Class320) this).anInt3289].method2892();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_)
								is[i_5_ + i_7_] = i_6_ % ((Class320) this).anInt3284;
							i_6_ /= ((Class320) this).anInt3284;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = (((Class320) this).anIntArray3290[i_9_ * 8 + i_4_]);
						if (i_10_ >= 0) {
							int i_11_ = (((Class320) this).anInt3288 + i_5_ * ((Class320) this).anInt3285);
							Class289 class289 = Class330_Sub41.aClass289Array7783[i_10_];
							if (((Class320) this).anInt3287 == 0) {
								int i_12_ = (((Class320) this).anInt3285 / ((Class289) class289).anInt2959);
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = class289.method2893();
									for (int i_15_ = 0; (i_15_ < ((Class289) class289).anInt2959); i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < ((Class320) this).anInt3285) {
									float[] fs_17_ = class289.method2893();
									for (int i_18_ = 0; (i_18_ < ((Class289) class289).anInt2959); i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_)
							break;
					}
				}
			}
		}
	}

	Class320() {
		((Class320) this).anInt3286 = Class330_Sub41.method3694(24);
		((Class320) this).anInt3285 = Class330_Sub41.method3694(24) + 1;
		((Class320) this).anInt3284 = Class330_Sub41.method3694(6) + 1;
		((Class320) this).anInt3289 = Class330_Sub41.method3694(8);
		int[] is = new int[((Class320) this).anInt3284];
		for (int i = 0; i < ((Class320) this).anInt3284; i++) {
			int i_19_ = 0;
			int i_20_ = Class330_Sub41.method3694(3);
			boolean bool = Class330_Sub41.method3698() != 0;
			if (bool)
				i_19_ = Class330_Sub41.method3694(5);
			is[i] = i_19_ << 3 | i_20_;
		}
		((Class320) this).anIntArray3290 = new int[((Class320) this).anInt3284 * 8];
		for (int i = 0; i < ((Class320) this).anInt3284 * 8; i++)
			((Class320) this).anIntArray3290[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class330_Sub41.method3694(8) : -1);
	}
}
