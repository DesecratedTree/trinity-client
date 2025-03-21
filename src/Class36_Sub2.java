/* Class36_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class36_Sub2 extends Class36 {
	int anInt7021;
	int anInt7022;
	int anInt7023;

	void method531(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		((Class36_Sub2) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glCopyTexSubImage3D(((Class36_Sub2) this).anInt375, 0, i, i_0_, i_1_, i_4_, i_5_, i_2_, i_3_);
		OpenGL.glFlush();
	}

	Class36_Sub2(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i, int i_6_, int i_7_, byte[] is, Class72 class72_8_) {
		super(class_ra_sub1, 32879, class72, class86, i * i_6_ * i_7_, false);
		((Class36_Sub2) this).anInt7022 = i;
		((Class36_Sub2) this).anInt7021 = i_6_;
		((Class36_Sub2) this).anInt7023 = i_7_;
		((Class36_Sub2) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(((Class36_Sub2) this).anInt375, 0, Class_ra_Sub1.method4870(((Class36_Sub2) this).aClass72_376, ((Class36_Sub2) this).aClass86_370), ((Class36_Sub2) this).anInt7022, ((Class36_Sub2) this).anInt7021, ((Class36_Sub2) this).anInt7023, 0, Class_ra_Sub1.method4864(class72_8_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method515(true);
	}

	Class36_Sub2(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i, int i_9_, int i_10_) {
		super(class_ra_sub1, 32879, class72, class86, i * i_9_ * i_10_, false);
		((Class36_Sub2) this).anInt7022 = i;
		((Class36_Sub2) this).anInt7021 = i_9_;
		((Class36_Sub2) this).anInt7023 = i_10_;
		((Class36_Sub2) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glTexImage3Dub(((Class36_Sub2) this).anInt375, 0, Class_ra_Sub1.method4870(((Class36_Sub2) this).aClass72_376, ((Class36_Sub2) this).aClass86_370), ((Class36_Sub2) this).anInt7022, ((Class36_Sub2) this).anInt7021, ((Class36_Sub2) this).anInt7023, 0, Class_ra_Sub1.method4864(((Class36_Sub2) this).aClass72_376), 5121, null, 0);
		method515(true);
	}
}
