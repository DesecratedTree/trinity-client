/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class36 {
	static int anInt367 = 3552;
	static int anInt368 = 3553;
	static int anInt369 = 32879;
	Class86 aClass86_370;
	static int anInt371 = 34037;
	static int anInt372 = 5121;
	Class_ra_Sub1 aClass_ra_Sub1_373;
	int anInt374;
	int anInt375;
	Class72 aClass72_376;
	static int anInt377 = 34067;
	boolean aBoolean378;
	boolean aBoolean379 = false;
	int anInt380;
	static int[] anIntArray381 = new int[1];

	void method507() {
		((Class36) this).aClass_ra_Sub1_373.method4844(this);
		if (((Class36) this).aBoolean379) {
			OpenGL.glTexParameteri(((Class36) this).anInt375, 10241, ((Class36) this).aBoolean378 ? 9987 : 9729);
			OpenGL.glTexParameteri(((Class36) this).anInt375, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class36) this).anInt375, 10241, ((Class36) this).aBoolean378 ? 9984 : 9728);
			OpenGL.glTexParameteri(((Class36) this).anInt375, 10240, 9728);
		}
	}

	Class36(Class_ra_Sub1 class_ra_sub1, int i, Class72 class72, Class86 class86, int i_0_, boolean bool) {
		((Class36) this).aClass_ra_Sub1_373 = class_ra_sub1;
		((Class36) this).anInt375 = i;
		((Class36) this).aClass72_376 = class72;
		((Class36) this).aClass86_370 = class86;
		((Class36) this).aBoolean378 = bool;
		((Class36) this).anInt380 = i_0_;
		OpenGL.glGenTextures(1, anIntArray381, 0);
		((Class36) this).anInt374 = anIntArray381[0];
		method511(0);
	}

	void method508(boolean bool) {
		if (((Class36) this).aBoolean378 != bool) {
			int i = method512();
			((Class36) this).aBoolean378 = true;
			method507();
			method511(i);
		}
	}

	void method509() {
		if (((Class36) this).anInt374 > 0) {
			((Class_ra_Sub1) ((Class36) this).aClass_ra_Sub1_373).anInt8310 -= method512();
			int[] is = new int[1];
			is[0] = ((Class36) this).anInt374;
			OpenGL.glDeleteTextures(1, is, 0);
			((Class36) this).anInt374 = 0;
		}
	}

	void method510() {
		if (((Class36) this).anInt374 > 0) {
			((Class36) this).aClass_ra_Sub1_373.method4814(((Class36) this).anInt374, method512());
			((Class36) this).anInt374 = 0;
		}
	}

	void method511(int i) {
		((Class_ra_Sub1) ((Class36) this).aClass_ra_Sub1_373).anInt8310 -= i;
		((Class_ra_Sub1) ((Class36) this).aClass_ra_Sub1_373).anInt8310 += method512();
	}

	int method512() {
		int i = (((Class36) this).aClass72_376.anInt609 * 2145490527 * (((Class36) this).aClass86_370.anInt724 * -1615628035) * ((Class36) this).anInt380);
		return ((Class36) this).aBoolean378 ? i * 4 / 3 : i;
	}

	static void method513(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int[] is) {
		if (i_2_ > 0 && !Class380.method4393(i_2_, -1761810254))
			throw new IllegalArgumentException("");
		if (i_3_ > 0 && !Class380.method4393(i_3_, 797060375))
			throw new IllegalArgumentException("");
		if (i_4_ != 32993)
			throw new IllegalArgumentException("");
		int i_6_ = 0;
		int i_7_ = i_2_ < i_3_ ? i_2_ : i_3_;
		int i_8_ = i_2_ >> 1;
		int i_9_ = i_3_ >> 1;
		int[] is_10_ = is;
		int[] is_11_ = new int[i_8_ * i_9_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_6_, i_1_, i_2_, i_3_, 0, i_4_, i_5_, is_10_, 0);
			if (i_7_ <= 1)
				break;
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = i_13_ + i_2_;
			for (int i_15_ = 0; i_15_ < i_9_; i_15_++) {
				for (int i_16_ = 0; i_16_ < i_8_; i_16_++) {
					int i_17_ = is_10_[i_13_++];
					int i_18_ = is_10_[i_13_++];
					int i_19_ = is_10_[i_14_++];
					int i_20_ = is_10_[i_14_++];
					int i_21_ = i_17_ >> 24 & 0xff;
					int i_22_ = i_17_ >> 16 & 0xff;
					int i_23_ = i_17_ >> 8 & 0xff;
					int i_24_ = i_17_ & 0xff;
					i_21_ += i_18_ >> 24 & 0xff;
					i_22_ += i_18_ >> 16 & 0xff;
					i_23_ += i_18_ >> 8 & 0xff;
					i_24_ += i_18_ & 0xff;
					i_21_ += i_19_ >> 24 & 0xff;
					i_22_ += i_19_ >> 16 & 0xff;
					i_23_ += i_19_ >> 8 & 0xff;
					i_24_ += i_19_ & 0xff;
					i_21_ += i_20_ >> 24 & 0xff;
					i_22_ += i_20_ >> 16 & 0xff;
					i_23_ += i_20_ >> 8 & 0xff;
					i_24_ += i_20_ & 0xff;
					is_11_[i_12_++] = ((i_21_ & 0x3fc) << 22 | (i_22_ & 0x3fc) << 14 | (i_23_ & 0x3fc) << 6 | (i_24_ & 0x3fc) >> 2);
				}
				i_13_ += i_2_;
				i_14_ += i_2_;
			}
			int[] is_25_ = is_11_;
			is_11_ = is_10_;
			is_10_ = is_25_;
			i_2_ = i_8_;
			i_3_ = i_9_;
			i_8_ >>= 1;
			i_9_ >>= 1;
			i_7_ >>= 1;
			i_6_++;
		}
	}

	static void method514(int i, int i_26_, int i_27_, int i_28_, Class72 class72, byte[] is) {
		if (i_27_ > 0 && !Class380.method4393(i_27_, -1318755597))
			throw new IllegalArgumentException("");
		if (i_28_ > 0 && !Class380.method4393(i_28_, -6817872))
			throw new IllegalArgumentException("");
		int i_29_ = class72.anInt609 * 2145490527;
		int i_30_ = 0;
		int i_31_ = i_27_ < i_28_ ? i_27_ : i_28_;
		int i_32_ = i_27_ >> 1;
		int i_33_ = i_28_ >> 1;
		byte[] is_34_ = is;
		byte[] is_35_ = new byte[i_32_ * i_33_ * i_29_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_30_, i_26_, i_27_, i_28_, 0, Class_ra_Sub1.method4864(class72), 5121, is_34_, 0);
			if (i_31_ <= 1)
				break;
			int i_36_ = i_27_ * i_29_;
			for (int i_37_ = 0; i_37_ < i_29_; i_37_++) {
				int i_38_ = i_37_;
				int i_39_ = i_37_;
				int i_40_ = i_39_ + i_36_;
				for (int i_41_ = 0; i_41_ < i_33_; i_41_++) {
					for (int i_42_ = 0; i_42_ < i_32_; i_42_++) {
						int i_43_ = is_34_[i_39_];
						i_39_ += i_29_;
						i_43_ += is_34_[i_39_];
						i_39_ += i_29_;
						i_43_ += is_34_[i_40_];
						i_40_ += i_29_;
						i_43_ += is_34_[i_40_];
						i_40_ += i_29_;
						is_35_[i_38_] = (byte) (i_43_ >> 2);
						i_38_ += i_29_;
					}
					i_39_ += i_36_;
					i_40_ += i_36_;
				}
			}
			byte[] is_44_ = is_35_;
			is_35_ = is_34_;
			is_34_ = is_44_;
			i_27_ = i_32_;
			i_28_ = i_33_;
			i_32_ >>= 1;
			i_33_ >>= 1;
			i_31_ >>= 1;
			i_30_++;
		}
	}

	void method515(boolean bool) {
		if (((Class36) this).aBoolean379 != bool) {
			((Class36) this).aBoolean379 = bool;
			method507();
		}
	}

	boolean method516() {
		if (((Class_ra_Sub1) ((Class36) this).aClass_ra_Sub1_373).aBoolean8429) {
			int i = method512();
			((Class36) this).aClass_ra_Sub1_373.method4844(this);
			OpenGL.glGenerateMipmapEXT(((Class36) this).anInt375);
			((Class36) this).aBoolean378 = true;
			method507();
			method511(i);
			return true;
		}
		return false;
	}

	static void method517(int i, int i_45_, int i_46_, int i_47_, Class72 class72, float[] fs) {
		if (i_46_ > 0 && !Class380.method4393(i_46_, -66493799))
			throw new IllegalArgumentException("");
		if (i_47_ > 0 && !Class380.method4393(i_47_, -1238641233))
			throw new IllegalArgumentException("");
		int i_48_ = class72.anInt609 * 2145490527;
		int i_49_ = 0;
		int i_50_ = i_46_ < i_47_ ? i_46_ : i_47_;
		int i_51_ = i_46_ >> 1;
		int i_52_ = i_47_ >> 1;
		float[] fs_53_ = fs;
		float[] fs_54_ = new float[i_51_ * i_52_ * i_48_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_49_, i_45_, i_46_, i_47_, 0, Class_ra_Sub1.method4864(class72), 5126, fs_53_, 0);
			if (i_50_ <= 1)
				break;
			int i_55_ = i_46_ * i_48_;
			for (int i_56_ = 0; i_56_ < i_48_; i_56_++) {
				int i_57_ = i_56_;
				int i_58_ = i_56_;
				int i_59_ = i_58_ + i_55_;
				for (int i_60_ = 0; i_60_ < i_52_; i_60_++) {
					for (int i_61_ = 0; i_61_ < i_51_; i_61_++) {
						float f = fs_53_[i_58_];
						i_58_ += i_48_;
						f += fs_53_[i_58_];
						i_58_ += i_48_;
						f += fs_53_[i_59_];
						i_59_ += i_48_;
						f += fs_53_[i_59_];
						i_59_ += i_48_;
						fs_54_[i_57_] = f * 0.25F;
						i_57_ += i_48_;
					}
					i_58_ += i_55_;
					i_59_ += i_55_;
				}
			}
			float[] fs_62_ = fs_54_;
			fs_54_ = fs_53_;
			fs_53_ = fs_62_;
			i_46_ = i_51_;
			i_47_ = i_52_;
			i_51_ >>= 1;
			i_52_ >>= 1;
			i_50_ >>= 1;
			i_49_++;
		}
	}
}
