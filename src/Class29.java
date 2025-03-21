/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class29 {
	static int[] anIntArray336 = new int[1];
	static int anInt337 = 34336;
	int anInt338;
	Class_ra_Sub1 aClass_ra_Sub1_339;

	Class29(Class_ra_Sub1 class_ra_sub1, int i, int i_0_) {
		((Class29) this).aClass_ra_Sub1_339 = class_ra_sub1;
		((Class29) this).anInt338 = i_0_;
	}

	static Class29 method497(Class_ra_Sub1 class_ra_sub1, int i, String string) {
		int i_1_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_1_);
		OpenGL.glProgramStringARB(i, 34933, string);
		OpenGL.glGetIntegerv(34379, anIntArray336, 0);
		if (anIntArray336[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class29(class_ra_sub1, i, i_1_);
	}
}
