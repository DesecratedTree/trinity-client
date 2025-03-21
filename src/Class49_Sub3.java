/* Class49_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class49_Sub3 extends Class49 {
	static char aChar7052 = '\0';
	boolean aBoolean7053 = false;
	Class33 aClass33_7054;
	static char aChar7055 = '\001';

	void method620(int i, int i_0_) {
		/* empty */
	}

	boolean method601() {
		return true;
	}

	void method602(boolean bool) {
		Class36_Sub3 class36_sub3 = ((Class49_Sub3) this).aClass_ra_Sub1_478.method4832();
		if (((Class49_Sub3) this).aClass33_7054 != null && class36_sub3 != null && bool) {
			((Class49_Sub3) this).aClass33_7054.method503('\0');
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(class36_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class_ra_Sub1) ((Class49_Sub3) this).aClass_ra_Sub1_478).aClass249_8359.method2502(((Class_ra_Sub1) ((Class49_Sub3) this).aClass_ra_Sub1_478).aFloatArray8348)), 0);
			OpenGL.glScalef(-1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub3) this).aBoolean7053 = true;
		} else
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 34168, 770);
	}

	void method608(boolean bool) {
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	void method604() {
		if (((Class49_Sub3) this).aBoolean7053) {
			((Class49_Sub3) this).aClass33_7054.method503('\001');
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
		} else
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub3) this).aBoolean7053 = false;
	}

	Class49_Sub3(Class_ra_Sub1 class_ra_sub1) {
		super(class_ra_sub1);
		if (((Class_ra_Sub1) class_ra_sub1).aBoolean8420) {
			((Class49_Sub3) this).aClass33_7054 = new Class33(class_ra_sub1, 2);
			((Class49_Sub3) this).aClass33_7054.method504(0);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(34165, 7681);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4847(2, 34168, 770);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 34167, 770);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub3) this).aClass33_7054.method502();
			((Class49_Sub3) this).aClass33_7054.method504(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 8448);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4847(2, 34166, 770);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub3) this).aClass33_7054.method502();
		}
	}

	void method600(Class36 class36, int i) {
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4836(i);
	}

	boolean method605() {
		return true;
	}

	void method607(boolean bool) {
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	void method609(boolean bool) {
		Class36_Sub3 class36_sub3 = ((Class49_Sub3) this).aClass_ra_Sub1_478.method4832();
		if (((Class49_Sub3) this).aClass33_7054 != null && class36_sub3 != null && bool) {
			((Class49_Sub3) this).aClass33_7054.method503('\0');
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(class36_sub3);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class_ra_Sub1) ((Class49_Sub3) this).aClass_ra_Sub1_478).aClass249_8359.method2502(((Class_ra_Sub1) ((Class49_Sub3) this).aClass_ra_Sub1_478).aFloatArray8348)), 0);
			OpenGL.glScalef(-1.0F, -1.0F, -1.0F);
			OpenGL.glMatrixMode(5888);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
			((Class49_Sub3) this).aBoolean7053 = true;
		} else
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 34168, 770);
	}

	void method610(boolean bool) {
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	void method619(int i, int i_1_) {
		/* empty */
	}

	void method612(boolean bool) {
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 7681);
	}

	void method614() {
		if (((Class49_Sub3) this).aBoolean7053) {
			((Class49_Sub3) this).aClass33_7054.method503('\001');
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
		} else
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub3) this).aBoolean7053 = false;
	}

	boolean method611() {
		return true;
	}

	void method603() {
		if (((Class49_Sub3) this).aBoolean7053) {
			((Class49_Sub3) this).aClass33_7054.method503('\001');
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
		} else
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub3) this).aBoolean7053 = false;
	}

	void method615(Class36 class36, int i) {
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method616(Class36 class36, int i) {
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(class36);
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4836(i);
	}

	void method617(int i, int i_2_) {
		/* empty */
	}

	void method618(int i, int i_3_) {
		/* empty */
	}

	void method613() {
		if (((Class49_Sub3) this).aBoolean7053) {
			((Class49_Sub3) this).aClass33_7054.method503('\001');
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(1);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4844(null);
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4843(0);
		} else
			((Class49_Sub3) this).aClass_ra_Sub1_478.method4848(0, 5890, 770);
		((Class49_Sub3) this).aClass_ra_Sub1_478.method4831(8448, 8448);
		((Class49_Sub3) this).aBoolean7053 = false;
	}

	void method621(int i, int i_4_) {
		/* empty */
	}

	void method606(int i, int i_5_) {
		/* empty */
	}
}
