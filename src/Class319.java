/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class319 {
	static void method3167(int i, int i_0_, int i_1_, int i_2_, Class335 class335, float f, float f_3_, float f_4_, float f_5_, float f_6_, byte[] is, int i_7_) {
		for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
			method3168(i_8_, i, i_0_, i_1_, i_2_, class335, f, f_3_, f_4_, f_5_, f_6_, is, i_7_);
			i_7_ += i * i_0_;
		}
	}

	static void method3168(int i, int i_9_, int i_10_, int i_11_, int i_12_, Class335 class335, float f, float f_13_, float f_14_, float f_15_, float f_16_, byte[] is, int i_17_) {
		int i_18_ = i_9_ * i_10_;
		float[] fs = new float[i_18_];
		for (int i_19_ = 0; i_19_ < i_12_; i_19_++) {
			int i_20_ = i_17_;
			class335.method3939(i, i_9_, i_10_, i_11_, f / (float) i_9_, f_13_ / (float) i_10_, f_14_ / (float) i_11_, f_15_ * 127.0F, fs, 0);
			for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
				is[i_20_] += fs[i_21_];
				i_20_++;
			}
			f *= 2.0F;
			f_13_ *= 2.0F;
			f_14_ *= 2.0F;
			f_15_ *= f_16_;
		}
		int i_22_ = i_17_;
		for (int i_23_ = 0; i_23_ < i_18_; i_23_++) {
			is[i_22_] = (byte) (is[i_22_] + 127);
			i_22_++;
		}
	}

	public static byte[] method3169(int i, int i_24_, int i_25_, int i_26_, Class335 class335, float f, float f_27_, float f_28_, float f_29_, float f_30_) {
		byte[] is = new byte[i * i_24_ * i_25_];
		method3167(i, i_24_, i_25_, i_26_, class335, f, f_27_, f_28_, f_29_, f_30_, is, 0);
		return is;
	}

	Class319() throws Throwable {
		throw new Error();
	}
}
