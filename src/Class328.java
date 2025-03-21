/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class328 {
	int[] anIntArray3328 = new int[2];
	static float aFloat3329 = 8.0F;
	int[][][] anIntArrayArrayArray3330 = new int[2][2][4];
	int[][][] anIntArrayArrayArray3331 = new int[2][2][4];
	int[] anIntArray3332 = new int[2];
	static float[][] aFloatArrayArray3333 = new float[2][8];
	static int anInt3334 = 4;
	static float aFloat3335;
	static int anInt3336;
	static float aFloat3337 = 100.0F;
	static float aFloat3338 = 32.703197F;
	static int[][] anIntArrayArray3339 = new int[2][8];

	float method3242(int i, int i_0_, float f) {
		float f_1_ = ((float) ((Class328) this).anIntArrayArrayArray3331[i][0][i_0_] + f * (float) ((((Class328) this).anIntArrayArrayArray3331[i][1][i_0_]) - (((Class328) this).anIntArrayArrayArray3331[i][0][i_0_])));
		f_1_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_1_ / 20.0F));
	}

	static float method3243(float f) {
		float f_2_ = 32.703197F * (float) Math.pow(2.0, (double) f);
		return f_2_ * 3.1415927F / 11025.0F;
	}

	float method3244(int i, int i_3_, float f) {
		float f_4_ = ((float) ((Class328) this).anIntArrayArrayArray3330[i][0][i_3_] + f * (float) ((((Class328) this).anIntArrayArrayArray3330[i][1][i_3_]) - (((Class328) this).anIntArrayArrayArray3330[i][0][i_3_])));
		f_4_ *= 1.2207031E-4F;
		return method3243(f_4_);
	}

	int method3245(int i, float f) {
		if (i == 0) {
			float f_5_ = ((float) ((Class328) this).anIntArray3332[0] + (float) (((Class328) this).anIntArray3332[1] - ((Class328) this).anIntArray3332[0]) * f);
			f_5_ *= 0.0030517578F;
			aFloat3335 = (float) Math.pow(0.1, (double) (f_5_ / 20.0F));
			anInt3336 = (int) (aFloat3335 * 65536.0F);
		}
		if (((Class328) this).anIntArray3328[i] == 0)
			return 0;
		float f_6_ = method3242(i, 0, f);
		aFloatArrayArray3333[i][0] = -2.0F * f_6_ * (float) Math.cos((double) method3244(i, 0, f));
		aFloatArrayArray3333[i][1] = f_6_ * f_6_;
		for (int i_7_ = 1; i_7_ < ((Class328) this).anIntArray3328[i]; i_7_++) {
			f_6_ = method3242(i, i_7_, f);
			float f_8_ = (-2.0F * f_6_ * (float) Math.cos((double) method3244(i, i_7_, f)));
			float f_9_ = f_6_ * f_6_;
			aFloatArrayArray3333[i][i_7_ * 2 + 1] = aFloatArrayArray3333[i][i_7_ * 2 - 1] * f_9_;
			aFloatArrayArray3333[i][i_7_ * 2] = (aFloatArrayArray3333[i][i_7_ * 2 - 1] * f_8_ + aFloatArrayArray3333[i][i_7_ * 2 - 2] * f_9_);
			for (int i_10_ = i_7_ * 2 - 1; i_10_ >= 2; i_10_--)
				aFloatArrayArray3333[i][i_10_] += (aFloatArrayArray3333[i][i_10_ - 1] * f_8_ + aFloatArrayArray3333[i][i_10_ - 2] * f_9_);
			aFloatArrayArray3333[i][1] += aFloatArrayArray3333[i][0] * f_8_ + f_9_;
			aFloatArrayArray3333[i][0] += f_8_;
		}
		if (i == 0) {
			for (int i_11_ = 0; i_11_ < ((Class328) this).anIntArray3328[0] * 2; i_11_++)
				aFloatArrayArray3333[0][i_11_] *= aFloat3335;
		}
		for (int i_12_ = 0; i_12_ < ((Class328) this).anIntArray3328[i] * 2; i_12_++)
			anIntArrayArray3339[i][i_12_] = (int) (aFloatArrayArray3333[i][i_12_] * 65536.0F);
		return ((Class328) this).anIntArray3328[i] * 2;
	}

	final void method3246(Buffer class330_sub46, Class309 class309) {
		int i = class330_sub46.readUnsignedByte(1960559461);
		((Class328) this).anIntArray3328[0] = i >> 4;
		((Class328) this).anIntArray3328[1] = i & 0xf;
		if (i != 0) {
			((Class328) this).anIntArray3332[0] = class330_sub46.readUnsignedShort(-237157167);
			((Class328) this).anIntArray3332[1] = class330_sub46.readUnsignedShort(1238998448);
			int i_13_ = class330_sub46.readUnsignedByte(2086873983);
			for (int i_14_ = 0; i_14_ < 2; i_14_++) {
				for (int i_15_ = 0; i_15_ < ((Class328) this).anIntArray3328[i_14_]; i_15_++) {
					((Class328) this).anIntArrayArrayArray3330[i_14_][0][i_15_] = class330_sub46.readUnsignedShort(886404091);
					((Class328) this).anIntArrayArrayArray3331[i_14_][0][i_15_] = class330_sub46.readUnsignedShort(1371281231);
				}
			}
			for (int i_16_ = 0; i_16_ < 2; i_16_++) {
				for (int i_17_ = 0; i_17_ < ((Class328) this).anIntArray3328[i_16_]; i_17_++) {
					if ((i_13_ & 1 << i_16_ * 4 << i_17_) != 0) {
						((Class328) this).anIntArrayArrayArray3330[i_16_][1][i_17_] = class330_sub46.readUnsignedShort(132401599);
						((Class328) this).anIntArrayArrayArray3331[i_16_][1][i_17_] = class330_sub46.readUnsignedShort(-28267792);
					} else {
						((Class328) this).anIntArrayArrayArray3330[i_16_][1][i_17_] = (((Class328) this).anIntArrayArrayArray3330[i_16_][0][i_17_]);
						((Class328) this).anIntArrayArrayArray3331[i_16_][1][i_17_] = (((Class328) this).anIntArrayArrayArray3331[i_16_][0][i_17_]);
					}
				}
			}
			if (i_13_ != 0 || (((Class328) this).anIntArray3332[1] != ((Class328) this).anIntArray3332[0]))
				class309.method3094(class330_sub46);
		} else {
			int[] is = ((Class328) this).anIntArray3332;
			((Class328) this).anIntArray3332[1] = 0;
			is[0] = 0;
		}
	}

	Class328() {
		/* empty */
	}
}
