/* Class49_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49_Sub1 extends Class49 {
	static char aChar7032 = '\0';
	Class47 aClass47_7033;
	static char aChar7034 = '\001';
	Class33 aClass33_7035;
	Class36_Sub4 aClass36_Sub4_7036;
	static float[] aFloatArray7037 = { 0.0F, 0.0F, 0.0F, 0.0F };

	void method621(int i, int i_0_) {
		if ((i & 0x1) == 1) {
			if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int i_1_ = (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8304 % 4000 * 16 / 4000);
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[i_1_]);
			}
		} else if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[0]);
	}

	boolean method601() {
		return true;
	}

	void method602(boolean bool) {
		if ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382) > 0) {
			float f = -0.5F / (float) (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8382);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = f;
			aFloatArray7037[3] = (((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).aFloat8298) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray7037, 0);
			OpenGL.glPopMatrix();
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4867(0.5F, (float) ((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class49_Sub1) this).aClass36_Sub4_7036);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		}
		((Class49_Sub1) this).aClass33_7035.method503('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method620(int i, int i_2_) {
		if ((i & 0x1) == 1) {
			if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int i_3_ = (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8304 % 4000 * 16 / 4000);
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[i_3_]);
			}
		} else if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[0]);
	}

	void method600(Class36 class36, int i) {
		/* empty */
	}

	void method606(int i, int i_4_) {
		if ((i & 0x1) == 1) {
			if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int i_5_ = (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8304 % 4000 * 16 / 4000);
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[i_5_]);
			}
		} else if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[0]);
	}

	void method608(boolean bool) {
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(260, 8448);
	}

	void method622() {
		((Class49_Sub1) this).aClass33_7035 = new Class33(((Class49_Sub1) this).aClass_ra_Sub1_478, 2);
		((Class49_Sub1) this).aClass33_7035.method504(0);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(7681, 260);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		((Class49_Sub1) this).aClass33_7035.method502();
		((Class49_Sub1) this).aClass33_7035.method504(1);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4847(0, 5890, 768);
		OpenGL.glDisable(3168);
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		((Class49_Sub1) this).aClass33_7035.method502();
	}

	void method613() {
		((Class49_Sub1) this).aClass33_7035.method503('\001');
		if ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382) > 0) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		}
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	boolean method605() {
		return true;
	}

	boolean method611() {
		return true;
	}

	void method609(boolean bool) {
		if ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382) > 0) {
			float f = -0.5F / (float) (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8382);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = f;
			aFloatArray7037[3] = (((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).aFloat8298) * f + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, aFloatArray7037, 0);
			OpenGL.glPopMatrix();
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4867(0.5F, (float) ((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class49_Sub1) this).aClass36_Sub4_7036);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		}
		((Class49_Sub1) this).aClass33_7035.method503('\0');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	void method604() {
		((Class49_Sub1) this).aClass33_7035.method503('\001');
		if ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382) > 0) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		}
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method607(boolean bool) {
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(260, 8448);
	}

	void method612(boolean bool) {
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(260, 8448);
	}

	void method614() {
		((Class49_Sub1) this).aClass33_7035.method503('\001');
		if ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382) > 0) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		}
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method603() {
		((Class49_Sub1) this).aClass33_7035.method503('\001');
		if ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8382) > 0) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4867(1.0F, 0.0F);
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4843(0);
		}
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	void method615(Class36 class36, int i) {
		/* empty */
	}

	void method616(Class36 class36, int i) {
		/* empty */
	}

	void method617(int i, int i_6_) {
		if ((i & 0x1) == 1) {
			if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int i_7_ = (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8304 % 4000 * 16 / 4000);
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[i_7_]);
			}
		} else if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[0]);
	}

	void method618(int i, int i_8_) {
		if ((i & 0x1) == 1) {
			if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int i_9_ = (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8304 % 4000 * 16 / 4000);
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[i_9_]);
			}
		} else if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[0]);
	}

	void method619(int i, int i_10_) {
		if ((i & 0x1) == 1) {
			if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
				aFloatArray7037[0] = 0.0F;
				aFloatArray7037[1] = 0.0F;
				aFloatArray7037[2] = 0.0F;
				aFloatArray7037[3] = (float) ((((Class_ra_Sub1) ((Class49_Sub1) this).aClass_ra_Sub1_478).anInt8304) % 4000) / 4000.0F;
				OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
			} else {
				int i_11_ = (((Class_ra_Sub1) (((Class49_Sub1) this).aClass_ra_Sub1_478)).anInt8304 % 4000 * 16 / 4000);
				((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[i_11_]);
			}
		} else if (((Class47) ((Class49_Sub1) this).aClass47_7033).aBoolean462) {
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub2_464);
			aFloatArray7037[0] = 0.0F;
			aFloatArray7037[1] = 0.0F;
			aFloatArray7037[2] = 0.0F;
			aFloatArray7037[3] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, aFloatArray7037, 0);
		} else
			((Class49_Sub1) this).aClass_ra_Sub1_478.method4844(((Class47) ((Class49_Sub1) this).aClass47_7033).aClass36_Sub1Array461[0]);
	}

	Class49_Sub1(Class_ra_Sub1 class_ra_sub1, Class47 class47) {
		super(class_ra_sub1);
		((Class49_Sub1) this).aClass47_7033 = class47;
		method622();
		((Class49_Sub1) this).aClass36_Sub4_7036 = new Class36_Sub4(((Class49_Sub1) this).aClass_ra_Sub1_478, Class72.aClass72_611, Class86.aClass86_714, 2, new byte[] { 0, -1 }, Class72.aClass72_611);
		((Class49_Sub1) this).aClass36_Sub4_7036.method533(false);
	}

	void method610(boolean bool) {
		((Class49_Sub1) this).aClass_ra_Sub1_478.method4831(260, 8448);
	}
}
