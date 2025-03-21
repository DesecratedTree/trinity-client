/* Class92_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class92_Sub2_Sub2 extends Class92_Sub2 {
	static int[] anIntArray9422 = new int[4];
	Class36_Sub3 aClass36_Sub3_9423;
	Class_ra_Sub1 aClass_ra_Sub1_9424;

	int method1083() {
		return (((Class36_Sub3) ((Class92_Sub2_Sub2) this).aClass36_Sub3_9423).anInt7030);
	}

	Class36_Sub3 method1079() {
		return ((Class92_Sub2_Sub2) this).aClass36_Sub3_9423;
	}

	boolean method1084(Class36_Sub3 class36_sub3, Class36_Sub3 class36_sub3_0_, float f) {
		boolean bool = true;
		Class76_Sub2_Sub2 class76_sub2_sub2 = (((Class_ra_Sub1) ((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424).aClass76_Sub2_Sub2_8434);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.qa(anIntArray9422);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.L();
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4874();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, ((Class36_Sub3) (((Class92_Sub2_Sub2) this).aClass36_Sub3_9423)).anInt7030, ((Class36_Sub3) (((Class92_Sub2_Sub2) this).aClass36_Sub3_9423)).anInt7030);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4853(false);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4854(false);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4816(false);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4815(false);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4841(-2);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4843(1);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4850(0.0F, 0.0F, 0.0F, f);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4831(34165, 34165);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4844(class36_sub3_0_);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4843(0);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4836(1);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4844(class36_sub3);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4785(class76_sub2_sub2, (byte) 1);
		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class76_sub2_sub2.method901(0, ((Class92_Sub2_Sub2) this).aClass36_Sub3_9423.method532(i_1_, 0));
			class76_sub2_sub2.method918(0);
			if (class76_sub2_sub2.method902()) {
				OpenGL.glBegin(7);
				switch (i_1_) {
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class76_sub2_sub2.method901(0, null);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4802(class76_sub2_sub2, (byte) 0);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4843(1);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4844(null);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4831(8448, 8448);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4843(0);
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.method4844(null);
		OpenGL.glPopAttrib();
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424.r(anIntArray9422[0], anIntArray9422[1], anIntArray9422[2], anIntArray9422[3]);
		if (bool && !((Class_ra_Sub1) (((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424)).aBoolean8403)
			((Class92_Sub2_Sub2) this).aClass36_Sub3_9423.method516();
		return bool;
	}

	Class36_Sub3 method1078() {
		return ((Class92_Sub2_Sub2) this).aClass36_Sub3_9423;
	}

	Class36_Sub3 method1080() {
		return ((Class92_Sub2_Sub2) this).aClass36_Sub3_9423;
	}

	Class92_Sub2_Sub2(Class_ra_Sub1 class_ra_sub1, int i) {
		((Class92_Sub2_Sub2) this).aClass_ra_Sub1_9424 = class_ra_sub1;
		((Class92_Sub2_Sub2) this).aClass36_Sub3_9423 = new Class36_Sub3(class_ra_sub1, Class72.aClass72_620, Class86.aClass86_714, i);
	}

	Class36_Sub3 method1081() {
		return ((Class92_Sub2_Sub2) this).aClass36_Sub3_9423;
	}

	Class36_Sub3 method1082() {
		return ((Class92_Sub2_Sub2) this).aClass36_Sub3_9423;
	}
}
