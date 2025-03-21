/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public abstract class Class287 implements Interface11 {
	Class86 aClass86_6545;
	Class72 aClass72_6546;
	static int anInt6547 = 0;
	int anInt6548;
	static int anInt6549 = 32879;
	Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_6550;
	int anInt6551;
	static int anInt6552 = 3553;
	static int anInt6553 = 34067;
	int anInt6554;
	boolean aBoolean6555;
	static int anInt6556 = 34037;
	Class189 aClass189_6557 = Class189.aClass189_1856;
	static int[] anIntArray6558 = new int[1];

	void method2877() {
		((Class287) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (((Class287) this).aClass189_6557 == Class189.aClass189_1856) {
			OpenGL.glTexParameteri(((Class287) this).anInt6554, 10241, (((Class287) this).aBoolean6555 ? 9987 : 9729));
			OpenGL.glTexParameteri(((Class287) this).anInt6554, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(((Class287) this).anInt6554, 10241, (((Class287) this).aBoolean6555 ? 9984 : 9728));
			OpenGL.glTexParameteri(((Class287) this).anInt6554, 10240, 9728);
		}
	}

	public void method166() {
		int i = ((Class287) this).aClass_ra_Sub2_Sub1_6550.method4954();
		int i_0_ = (((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i]);
		if (i_0_ != ((Class287) this).anInt6554) {
			if (i_0_ != 0) {
				OpenGL.glBindTexture(i_0_, 0);
				OpenGL.glDisable(i_0_);
			}
			OpenGL.glEnable(((Class287) this).anInt6554);
			((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i] = ((Class287) this).anInt6554;
		}
		OpenGL.glBindTexture(((Class287) this).anInt6554, ((Class287) this).anInt6551);
	}

	public void method163(Class189 class189) {
		if (((Class287) this).aClass189_6557 != class189) {
			((Class287) this).aClass189_6557 = class189;
			method2877();
		}
	}

	boolean method115() {
		int i = method2879();
		((Class287) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGenerateMipmapEXT(((Class287) this).anInt6554);
		((Class287) this).aBoolean6555 = true;
		method2877();
		method2880(i);
		return true;
	}

	void method2878(int i, int i_1_, int i_2_, byte[] is) {
		if (i_1_ > 0 && !Class380.method4393(i_1_, -957524527))
			throw new IllegalArgumentException("");
		if (i_2_ > 0 && !Class380.method4393(i_2_, -1554843569))
			throw new IllegalArgumentException("");
		int i_3_ = ((Class287) this).aClass72_6546.anInt609 * 2145490527;
		int i_4_ = 0;
		int i_5_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_6_ = i_1_ >> 1;
		int i_7_ = i_2_ >> 1;
		byte[] is_8_ = is;
		byte[] is_9_ = new byte[i_6_ * i_7_ * i_3_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_4_, Class_ra_Sub2_Sub1.method5141(((Class287) this).aClass72_6546, (((Class287) this).aClass86_6545)), i_1_, i_2_, 0, Class_ra_Sub2_Sub1.method5152(((Class287) this).aClass72_6546), 5121, is_8_, 0);
			if (i_5_ <= 1)
				break;
			int i_10_ = i_1_ * i_3_;
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
				int i_12_ = i_11_;
				int i_13_ = i_11_;
				int i_14_ = i_13_ + i_10_;
				for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
					for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
						int i_17_ = is_8_[i_13_];
						i_13_ += i_3_;
						i_17_ += is_8_[i_13_];
						i_13_ += i_3_;
						i_17_ += is_8_[i_14_];
						i_14_ += i_3_;
						i_17_ += is_8_[i_14_];
						i_14_ += i_3_;
						is_9_[i_12_] = (byte) (i_17_ >> 2);
						i_12_ += i_3_;
					}
					i_13_ += i_10_;
					i_14_ += i_10_;
				}
			}
			byte[] is_18_ = is_9_;
			is_9_ = is_8_;
			is_8_ = is_18_;
			i_1_ = i_6_;
			i_2_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	int method2879() {
		int i = (((Class287) this).aClass72_6546.anInt609 * 2145490527 * (((Class287) this).aClass86_6545.anInt724 * -1615628035) * ((Class287) this).anInt6548);
		return ((Class287) this).aBoolean6555 ? i * 4 / 3 : i;
	}

	void method2880(int i) {
		((Class287) this).aClass_ra_Sub2_Sub1_6550.anInt8465 -= i;
		((Class287) this).aClass_ra_Sub2_Sub1_6550.anInt8465 += method2879();
	}

	void method2881(int i, int i_19_, int i_20_, int[] is) {
		if (i_19_ > 0 && !Class380.method4393(i_19_, -1805114641))
			throw new IllegalArgumentException("");
		if (i_20_ > 0 && !Class380.method4393(i_20_, -1428923774))
			throw new IllegalArgumentException("");
		if (((Class287) this).aClass72_6546 != Class72.aClass72_620)
			throw new IllegalArgumentException("");
		int i_21_ = 0;
		int i_22_ = i_19_ < i_20_ ? i_19_ : i_20_;
		int i_23_ = i_19_ >> 1;
		int i_24_ = i_20_ >> 1;
		int[] is_25_ = is;
		int[] is_26_ = new int[i_23_ * i_24_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_21_, Class_ra_Sub2_Sub1.method5141(((Class287) this).aClass72_6546, (((Class287) this).aClass86_6545)), i_19_, i_20_, 0, 32993, ((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anInt9884, is_25_, 0);
			if (i_22_ <= 1)
				break;
			int i_27_ = 0;
			int i_28_ = 0;
			int i_29_ = i_28_ + i_19_;
			for (int i_30_ = 0; i_30_ < i_24_; i_30_++) {
				for (int i_31_ = 0; i_31_ < i_23_; i_31_++) {
					int i_32_ = is_25_[i_28_++];
					int i_33_ = is_25_[i_28_++];
					int i_34_ = is_25_[i_29_++];
					int i_35_ = is_25_[i_29_++];
					int i_36_ = i_32_ >> 24 & 0xff;
					int i_37_ = i_32_ >> 16 & 0xff;
					int i_38_ = i_32_ >> 8 & 0xff;
					int i_39_ = i_32_ & 0xff;
					i_36_ += i_33_ >> 24 & 0xff;
					i_37_ += i_33_ >> 16 & 0xff;
					i_38_ += i_33_ >> 8 & 0xff;
					i_39_ += i_33_ & 0xff;
					i_36_ += i_34_ >> 24 & 0xff;
					i_37_ += i_34_ >> 16 & 0xff;
					i_38_ += i_34_ >> 8 & 0xff;
					i_39_ += i_34_ & 0xff;
					i_36_ += i_35_ >> 24 & 0xff;
					i_37_ += i_35_ >> 16 & 0xff;
					i_38_ += i_35_ >> 8 & 0xff;
					i_39_ += i_35_ & 0xff;
					is_26_[i_27_++] = ((i_36_ & 0x3fc) << 22 | (i_37_ & 0x3fc) << 14 | (i_38_ & 0x3fc) << 6 | (i_39_ & 0x3fc) >> 2);
				}
				i_28_ += i_19_;
				i_29_ += i_19_;
			}
			int[] is_40_ = is_26_;
			is_26_ = is_25_;
			is_25_ = is_40_;
			i_19_ = i_23_;
			i_20_ = i_24_;
			i_23_ >>= 1;
			i_24_ >>= 1;
			i_22_ >>= 1;
			i_21_++;
		}
	}

	public void method162() {
		int i = ((Class287) this).aClass_ra_Sub2_Sub1_6550.method4954();
		int i_41_ = (((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i]);
		if (i_41_ != ((Class287) this).anInt6554) {
			if (i_41_ != 0) {
				OpenGL.glBindTexture(i_41_, 0);
				OpenGL.glDisable(i_41_);
			}
			OpenGL.glEnable(((Class287) this).anInt6554);
			((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i] = ((Class287) this).anInt6554;
		}
		OpenGL.glBindTexture(((Class287) this).anInt6554, ((Class287) this).anInt6551);
	}

	public void method52() {
		if (((Class287) this).anInt6551 > 0) {
			((Class287) this).aClass_ra_Sub2_Sub1_6550.method5153(((Class287) this).anInt6551, method2879());
			((Class287) this).anInt6551 = 0;
		}
	}

	public void method164() {
		int i = ((Class287) this).aClass_ra_Sub2_Sub1_6550.method4954();
		int i_42_ = (((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i]);
		if (i_42_ != ((Class287) this).anInt6554) {
			if (i_42_ != 0) {
				OpenGL.glBindTexture(i_42_, 0);
				OpenGL.glDisable(i_42_);
			}
			OpenGL.glEnable(((Class287) this).anInt6554);
			((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i] = ((Class287) this).anInt6554;
		}
		OpenGL.glBindTexture(((Class287) this).anInt6554, ((Class287) this).anInt6551);
	}

	public void method165() {
		int i = ((Class287) this).aClass_ra_Sub2_Sub1_6550.method4954();
		int i_43_ = (((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i]);
		if (i_43_ != ((Class287) this).anInt6554) {
			if (i_43_ != 0) {
				OpenGL.glBindTexture(i_43_, 0);
				OpenGL.glDisable(i_43_);
			}
			OpenGL.glEnable(((Class287) this).anInt6554);
			((Class_ra_Sub2_Sub1) ((Class287) this).aClass_ra_Sub2_Sub1_6550).anIntArray9874[i] = ((Class287) this).anInt6554;
		}
		OpenGL.glBindTexture(((Class287) this).anInt6554, ((Class287) this).anInt6551);
	}

	public void method167(Class189 class189) {
		if (((Class287) this).aClass189_6557 != class189) {
			((Class287) this).aClass189_6557 = class189;
			method2877();
		}
	}

	Class287(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, int i, Class72 class72, Class86 class86, int i_44_, boolean bool) {
		((Class287) this).aClass_ra_Sub2_Sub1_6550 = class_ra_sub2_sub1;
		((Class287) this).anInt6554 = i;
		((Class287) this).aClass72_6546 = class72;
		((Class287) this).aClass86_6545 = class86;
		((Class287) this).aBoolean6555 = bool;
		((Class287) this).anInt6548 = i_44_;
		OpenGL.glGenTextures(1, anIntArray6558, 0);
		((Class287) this).anInt6551 = anIntArray6558[0];
		method2877();
		method2880(0);
	}

	void method2882(int i, int i_45_, int i_46_, float[] fs) {
		if (i_45_ > 0 && !Class380.method4393(i_45_, 74045787))
			throw new IllegalArgumentException("");
		if (i_46_ > 0 && !Class380.method4393(i_46_, -1234209220))
			throw new IllegalArgumentException("");
		int i_47_ = ((Class287) this).aClass72_6546.anInt609 * 2145490527;
		int i_48_ = 0;
		int i_49_ = i_45_ < i_46_ ? i_45_ : i_46_;
		int i_50_ = i_45_ >> 1;
		int i_51_ = i_46_ >> 1;
		float[] fs_52_ = fs;
		float[] fs_53_ = new float[i_50_ * i_51_ * i_47_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_48_, Class_ra_Sub2_Sub1.method5141(((Class287) this).aClass72_6546, (((Class287) this).aClass86_6545)), i_45_, i_46_, 0, Class_ra_Sub2_Sub1.method5152(((Class287) this).aClass72_6546), 5126, fs_52_, 0);
			if (i_49_ <= 1)
				break;
			int i_54_ = i_45_ * i_47_;
			for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
				int i_56_ = i_55_;
				int i_57_ = i_55_;
				int i_58_ = i_57_ + i_54_;
				for (int i_59_ = 0; i_59_ < i_51_; i_59_++) {
					for (int i_60_ = 0; i_60_ < i_50_; i_60_++) {
						float f = fs_52_[i_57_];
						i_57_ += i_47_;
						f += fs_52_[i_57_];
						i_57_ += i_47_;
						f += fs_52_[i_58_];
						i_58_ += i_47_;
						f += fs_52_[i_58_];
						i_58_ += i_47_;
						fs_53_[i_56_] = f * 0.25F;
						i_56_ += i_47_;
					}
					i_57_ += i_54_;
					i_58_ += i_54_;
				}
			}
			float[] fs_61_ = fs_53_;
			fs_53_ = fs_52_;
			fs_52_ = fs_61_;
			i_45_ = i_50_;
			i_46_ = i_51_;
			i_50_ >>= 1;
			i_51_ >>= 1;
			i_49_ >>= 1;
			i_48_++;
		}
	}

	public void method53() {
		if (((Class287) this).anInt6551 > 0) {
			((Class287) this).aClass_ra_Sub2_Sub1_6550.method5153(((Class287) this).anInt6551, method2879());
			((Class287) this).anInt6551 = 0;
		}
	}
}
