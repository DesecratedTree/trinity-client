/* Class36_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class36_Sub1 extends Class36 {
	int anInt7019;
	int anInt7020;

	Class36_Sub1(Class_ra_Sub1 class_ra_sub1, int i, int i_0_, int i_1_, boolean bool, int[] is, int i_2_, int i_3_, boolean bool_4_) {
		super(class_ra_sub1, i, Class72.aClass72_620, Class86.aClass86_714, i_0_ * i_1_, bool);
		((Class36_Sub1) this).anInt7020 = i_0_;
		((Class36_Sub1) this).anInt7019 = i_1_;
		if (bool_4_) {
			int[] is_5_ = new int[is.length];
			for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
				int i_7_ = i_6_ * i_0_;
				int i_8_ = (i_1_ - i_6_ - 1) * i_0_;
				for (int i_9_ = 0; i_9_ < i_0_; i_9_++)
					is_5_[i_7_++] = is[i_8_++];
			}
			is = is_5_;
		}
		((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
		if (((Class36_Sub1) this).anInt375 == 34037 || !bool || i_2_ != 0 || i_3_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(((Class36_Sub1) this).anInt375, 0, Class_ra_Sub1.method4870(((Class36_Sub1) this).aClass72_376, ((Class36_Sub1) this).aClass86_370), ((Class36_Sub1) this).anInt7020, ((Class36_Sub1) this).anInt7019, 0, 32993, (((Class_ra_Sub1) ((Class36_Sub1) this).aClass_ra_Sub1_373).anInt8331), is, i_3_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			method508(false);
		} else {
			method513(((Class36_Sub1) this).anInt375, Class_ra_Sub1.method4870((((Class36_Sub1) this).aClass72_376), (((Class36_Sub1) this).aClass86_370)), ((Class36_Sub1) this).anInt7020, ((Class36_Sub1) this).anInt7019, 32993, ((Class_ra_Sub1) ((Class36_Sub1) this).aClass_ra_Sub1_373).anInt8331, is);
			method508(true);
		}
		method515(true);
	}

	Class36_Sub1(Class_ra_Sub1 class_ra_sub1, int i, Class72 class72, Class86 class86, int i_10_, int i_11_, boolean bool, byte[] is, Class72 class72_12_, boolean bool_13_) {
		super(class_ra_sub1, i, class72, class86, i_10_ * i_11_, bool);
		((Class36_Sub1) this).anInt7020 = i_10_;
		((Class36_Sub1) this).anInt7019 = i_11_;
		if (bool_13_) {
			byte[] is_14_ = new byte[is.length];
			for (int i_15_ = 0; i_15_ < i_11_; i_15_++) {
				int i_16_ = i_15_ * i_10_;
				int i_17_ = (i_11_ - i_15_ - 1) * i_10_;
				for (int i_18_ = 0; i_18_ < i_10_; i_18_++)
					is_14_[i_16_++] = is[i_17_++];
			}
			is = is_14_;
		}
		((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && ((Class36_Sub1) this).anInt375 != 34037) {
			method514(i, Class_ra_Sub1.method4870((((Class36_Sub1) this).aClass72_376), (((Class36_Sub1) this).aClass86_370)), i_10_, i_11_, class72_12_, is);
			method508(true);
		} else {
			OpenGL.glTexImage2Dub(((Class36_Sub1) this).anInt375, 0, Class_ra_Sub1.method4870(((Class36_Sub1) this).aClass72_376, ((Class36_Sub1) this).aClass86_370), ((Class36_Sub1) this).anInt7020, ((Class36_Sub1) this).anInt7019, 0, Class_ra_Sub1.method4864(class72_12_), 5121, is, 0);
			method508(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		method515(true);
	}

	Class36_Sub1(Class_ra_Sub1 class_ra_sub1, int i, Class72 class72, Class86 class86, int i_19_, int i_20_, boolean bool, float[] fs, Class72 class72_21_) {
		super(class_ra_sub1, i, class72, class86, i_19_ * i_20_, bool);
		((Class36_Sub1) this).anInt7020 = i_19_;
		((Class36_Sub1) this).anInt7019 = i_20_;
		((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
		if (bool && ((Class36_Sub1) this).anInt375 != 34037) {
			method517(i, Class_ra_Sub1.method4870((((Class36_Sub1) this).aClass72_376), (((Class36_Sub1) this).aClass86_370)), i_19_, i_20_, class72_21_, fs);
			method508(true);
		} else {
			OpenGL.glTexImage2Df(((Class36_Sub1) this).anInt375, 0, Class_ra_Sub1.method4870(((Class36_Sub1) this).aClass72_376, ((Class36_Sub1) this).aClass86_370), ((Class36_Sub1) this).anInt7020, ((Class36_Sub1) this).anInt7019, 0, Class_ra_Sub1.method4864(class72_21_), 5126, fs, 0);
			method508(false);
		}
		method515(true);
	}

	void method518(boolean bool, boolean bool_22_) {
		if (((Class36_Sub1) this).anInt375 == 3553) {
			((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
			OpenGL.glTexParameteri(((Class36_Sub1) this).anInt375, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(((Class36_Sub1) this).anInt375, 10243, bool_22_ ? 10497 : 33071);
		}
	}

	void method519(int i, int i_23_, int i_24_, int i_25_, byte[] is, Class72 class72, int i_26_, int i_27_, boolean bool) {
		if (i_27_ == 0)
			i_27_ = i_24_;
		if (bool) {
			int i_28_ = class72.anInt609 * 2145490527;
			int i_29_ = i_28_ * i_24_;
			int i_30_ = i_28_ * i_27_;
			byte[] is_31_ = new byte[i_29_ * i_25_];
			for (int i_32_ = 0; i_32_ < i_25_; i_32_++) {
				int i_33_ = i_32_ * i_29_;
				int i_34_ = (i_25_ - i_32_ - 1) * i_30_ + i_26_;
				for (int i_35_ = 0; i_35_ < i_29_; i_35_++)
					is_31_[i_33_++] = is[i_34_++];
			}
			is = is_31_;
		}
		((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_27_ != i_24_)
			OpenGL.glPixelStorei(3314, i_27_);
		OpenGL.glTexSubImage2Dub(((Class36_Sub1) this).anInt375, 0, i, (((Class36_Sub1) this).anInt7019 - i_23_ - i_25_), i_24_, i_25_, Class_ra_Sub1.method4864(class72), 5121, is, i_26_);
		if (i_27_ != i_24_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method520(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		Class76 class76 = ((Class36_Sub1) this).aClass_ra_Sub1_373.method4782((byte) 0);
		if (class76 != null) {
			int i_41_ = class76.method857() - (i_40_ + i_38_);
			((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
			OpenGL.glCopyTexSubImage2D(((Class36_Sub1) this).anInt375, 0, i, (((Class36_Sub1) this).anInt7019 - (i_36_ + i_38_)), i_39_, i_41_, i_37_, i_38_);
			OpenGL.glFlush();
		}
	}

	Interface8_Impl1_Impl1 method521(int i) {
		return new Class54(this, i);
	}

	Class36_Sub1(Class_ra_Sub1 class_ra_sub1, int i, int i_42_, int i_43_, int i_44_, int i_45_) {
		super(class_ra_sub1, i, Class72.aClass72_614, Class86.aClass86_714, i_44_ * i_45_, false);
		((Class36_Sub1) this).anInt7020 = i_44_;
		((Class36_Sub1) this).anInt7019 = i_45_;
		((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
		Class76 class76 = ((Class36_Sub1) this).aClass_ra_Sub1_373.method4782((byte) 0);
		if (class76 != null) {
			int i_46_ = class76.method857() - (i_43_ + i_45_);
			int i_47_ = Class_ra_Sub1.method4870(((Class36_Sub1) this).aClass72_376, ((Class36_Sub1) this).aClass86_370);
			OpenGL.glCopyTexImage2D(((Class36_Sub1) this).anInt375, 0, i_47_, i_42_, i_46_, i_44_, i_45_, 0);
		}
		method515(true);
	}

	void method522(int i, int i_48_, int i_49_, int i_50_, int[] is, int i_51_, int i_52_, boolean bool) {
		if (i_52_ == 0)
			i_52_ = i_49_;
		if (bool) {
			int[] is_53_ = new int[i_49_ * i_50_];
			for (int i_54_ = 0; i_54_ < i_50_; i_54_++) {
				int i_55_ = i_54_ * i_49_;
				int i_56_ = (i_50_ - i_54_ - 1) * i_52_ + i_51_;
				for (int i_57_ = 0; i_57_ < i_49_; i_57_++)
					is_53_[i_55_++] = is[i_56_++];
			}
			is = is_53_;
		}
		((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
		if (i_49_ != i_52_)
			OpenGL.glPixelStorei(3314, i_52_);
		OpenGL.glTexSubImage2Di(((Class36_Sub1) this).anInt375, 0, i, (((Class36_Sub1) this).anInt7019 - i_48_ - i_50_), i_49_, i_50_, 32993, (((Class_ra_Sub1) ((Class36_Sub1) this).aClass_ra_Sub1_373).anInt8331), is, i_51_);
		if (i_49_ != i_52_)
			OpenGL.glPixelStorei(3314, 0);
	}

	Interface8_Impl1_Impl2 method523(int i) {
		return new Class54(this, i);
	}

	Class36_Sub1(Class_ra_Sub1 class_ra_sub1, int i, Class72 class72, Class86 class86, int i_58_, int i_59_) {
		super(class_ra_sub1, i, class72, class86, i_58_ * i_59_, false);
		((Class36_Sub1) this).anInt7020 = i_58_;
		((Class36_Sub1) this).anInt7019 = i_59_;
		((Class36_Sub1) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glTexImage2Dub(((Class36_Sub1) this).anInt375, 0, Class_ra_Sub1.method4870(((Class36_Sub1) this).aClass72_376, ((Class36_Sub1) this).aClass86_370), i_58_, i_59_, 0, Class_ra_Sub1.method4864(((Class36_Sub1) this).aClass72_376), 5121, null, 0);
		method515(true);
	}
}
