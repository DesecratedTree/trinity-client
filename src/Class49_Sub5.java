/* Class49_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49_Sub5 extends Class49 {
	static float[] aFloatArray7066 = new float[4];
	Class47 aClass47_7067;
	Class33 aClass33_7068;
	static char aChar7069 = '\0';
	static char aChar7070 = '\001';

	void method610(boolean bool) {
		/* empty */
	}

	boolean method601() {
		return true;
	}

	void method602(boolean bool) {
		((Class49_Sub5) this).aClass33_7068.method503('\0');
		if (((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub2_466);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
		}
	}

	void method608(boolean bool) {
		/* empty */
	}

	void method609(boolean bool) {
		((Class49_Sub5) this).aClass33_7068.method503('\0');
		if (((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub2_466);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
		}
	}

	void method606(int i, int i_0_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_1_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_2_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (bool) {
			aFloatArray7066[0] = f_2_;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = f_2_;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = f_2_;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) (((Class_ra_Sub1) (((Class49_Sub5) this).aClass_ra_Sub1_478)).anInt8304) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (!((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			int i_3_ = (int) (f_1_ * (float) (((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304) * 16.0F);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub1Array465[i_3_ % 16]);
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = ((float) ((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304 * f_1_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		}
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	void method600(Class36 class36, int i) {
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method604() {
		((Class49_Sub5) this).aClass33_7068.method503('\001');
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	boolean method605() {
		return true;
	}

	boolean method611() {
		return true;
	}

	void method618(int i, int i_4_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_5_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (bool) {
			aFloatArray7066[0] = f_6_;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = f_6_;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = f_6_;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) (((Class_ra_Sub1) (((Class49_Sub5) this).aClass_ra_Sub1_478)).anInt8304) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (!((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			int i_7_ = (int) (f_5_ * (float) (((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304) * 16.0F);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub1Array465[i_7_ % 16]);
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = ((float) ((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304 * f_5_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		}
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	void method603() {
		((Class49_Sub5) this).aClass33_7068.method503('\001');
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	void method607(boolean bool) {
		/* empty */
	}

	void method612(boolean bool) {
		/* empty */
	}

	void method615(Class36 class36, int i) {
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method613() {
		((Class49_Sub5) this).aClass33_7068.method503('\001');
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	Class49_Sub5(Class_ra_Sub1 class_ra_sub1, Class47 class47) {
		super(class_ra_sub1);
		((Class49_Sub5) this).aClass47_7067 = class47;
		((Class49_Sub5) this).aClass33_7068 = new Class33(class_ra_sub1, 2);
		((Class49_Sub5) this).aClass33_7068.method504(0);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
		((Class49_Sub5) this).aClass33_7068.method502();
		((Class49_Sub5) this).aClass33_7068.method504(1);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462)
			OpenGL.glDisable(3170);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
		((Class49_Sub5) this).aClass33_7068.method502();
	}

	void method616(Class36 class36, int i) {
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method617(int i, int i_8_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_9_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_10_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (bool) {
			aFloatArray7066[0] = f_10_;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = f_10_;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = f_10_;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) (((Class_ra_Sub1) (((Class49_Sub5) this).aClass_ra_Sub1_478)).anInt8304) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (!((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			int i_11_ = (int) (f_9_ * (float) (((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304) * 16.0F);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub1Array465[i_11_ % 16]);
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = ((float) ((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304 * f_9_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		}
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	void method614() {
		((Class49_Sub5) this).aClass33_7068.method503('\001');
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(null);
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	void method619(int i, int i_12_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_13_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_14_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (bool) {
			aFloatArray7066[0] = f_14_;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = f_14_;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = f_14_;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) (((Class_ra_Sub1) (((Class49_Sub5) this).aClass_ra_Sub1_478)).anInt8304) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (!((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			int i_15_ = (int) (f_13_ * (float) (((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304) * 16.0F);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub1Array465[i_15_ % 16]);
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = ((float) ((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304 * f_13_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		}
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	void method620(int i, int i_16_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_17_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_18_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (bool) {
			aFloatArray7066[0] = f_18_;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = f_18_;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = f_18_;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) (((Class_ra_Sub1) (((Class49_Sub5) this).aClass_ra_Sub1_478)).anInt8304) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (!((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			int i_19_ = (int) (f_17_ * (float) (((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304) * 16.0F);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub1Array465[i_19_ % 16]);
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = ((float) ((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304 * f_17_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		}
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}

	void method621(int i, int i_20_) {
		float f = -5.0E-4F * (float) ((i & 0x3) + 1);
		float f_21_ = 5.0E-4F * (float) ((i >> 3 & 0x3) + 1);
		float f_22_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(1);
		if (bool) {
			aFloatArray7066[0] = f_22_;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = 0.0F;
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = f_22_;
			aFloatArray7066[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, aFloatArray7066, 0);
		aFloatArray7066[0] = 0.0F;
		aFloatArray7066[1] = f_22_;
		aFloatArray7066[2] = 0.0F;
		aFloatArray7066[3] = (float) (((Class_ra_Sub1) (((Class49_Sub5) this).aClass_ra_Sub1_478)).anInt8304) * f % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, aFloatArray7066, 0);
		if (!((Class47) ((Class49_Sub5) this).aClass47_7067).aBoolean462) {
			int i_23_ = (int) (f_21_ * (float) (((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304) * 16.0F);
			((Class49_Sub5) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub5) this).aClass47_7067).aClass36_Sub1Array465[i_23_ % 16]);
		} else {
			aFloatArray7066[0] = 0.0F;
			aFloatArray7066[1] = 0.0F;
			aFloatArray7066[2] = 0.0F;
			aFloatArray7066[3] = ((float) ((Class_ra_Sub1) ((Class49_Sub5) this).aClass_ra_Sub1_478).anInt8304 * f_21_ % 1.0F);
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7066, 0);
		}
		((Class49_Sub5) this).aClass_ra_Sub1_478.method4843(0);
	}
}
