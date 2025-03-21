/* Class36_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class36_Sub3 extends Class36 {
	static int anInt7024 = 34069;
	static int anInt7025 = 34074;
	static int anInt7026 = 34071;
	static int anInt7027 = 34072;
	static int anInt7028 = 34073;
	static int anInt7029 = 34070;
	int anInt7030;

	Class36_Sub3(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i, boolean bool, int[][] is) {
		super(class_ra_sub1, 34067, class72, class86, i * i * 6, bool);
		((Class36_Sub3) this).anInt7030 = i;
		((Class36_Sub3) this).aClass_ra_Sub1_373.method4844(this);
		if (bool) {
			for (int i_0_ = 0; i_0_ < 6; i_0_++)
				method513(34069 + i_0_, Class_ra_Sub1.method4870((((Class36_Sub3) this).aClass72_376), (((Class36_Sub3) this).aClass86_370)), i, i, 32993, ((Class_ra_Sub1) ((Class36_Sub3) this).aClass_ra_Sub1_373).anInt8331, is[i_0_]);
		} else {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				OpenGL.glTexImage2Di(34069 + i_1_, 0, (Class_ra_Sub1.method4870(((Class36_Sub3) this).aClass72_376, ((Class36_Sub3) this).aClass86_370)), i, i, 0, 32993, (((Class_ra_Sub1) (((Class36_Sub3) this).aClass_ra_Sub1_373)).anInt8331), is[i_1_], 0);
		}
		method515(true);
	}

	Class36_Sub3(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i) {
		super(class_ra_sub1, 34067, class72, class86, i * i * 6, false);
		((Class36_Sub3) this).anInt7030 = i;
		((Class36_Sub3) this).aClass_ra_Sub1_373.method4844(this);
		for (int i_2_ = 0; i_2_ < 6; i_2_++)
			OpenGL.glTexImage2Dub(34069 + i_2_, 0, Class_ra_Sub1.method4870(((Class36_Sub3) this).aClass72_376, ((Class36_Sub3) this).aClass86_370), i, i, 0, Class_ra_Sub1.method4864(((Class36_Sub3) this).aClass72_376), 5121, null, 0);
		method515(true);
	}

	Class36_Sub3(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i, boolean bool, byte[][] is, Class72 class72_3_) {
		super(class_ra_sub1, 34067, class72, class86, i * i * 6, bool);
		((Class36_Sub3) this).anInt7030 = i;
		((Class36_Sub3) this).aClass_ra_Sub1_373.method4844(this);
		for (int i_4_ = 0; i_4_ < 6; i_4_++)
			OpenGL.glTexImage2Dub(34069 + i_4_, 0, Class_ra_Sub1.method4870(((Class36_Sub3) this).aClass72_376, ((Class36_Sub3) this).aClass86_370), i, i, 0, Class_ra_Sub1.method4864(class72_3_), 5121, is[i_4_], 0);
		method515(true);
	}

	Interface8_Impl1_Impl2 method532(int i, int i_5_) {
		return new Class32(this, i, i_5_);
	}
}
