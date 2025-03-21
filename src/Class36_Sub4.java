/* Class36_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class36_Sub4 extends Class36 {
	int anInt7031;

	Class36_Sub4(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i, byte[] is, Class72 class72_0_) {
		super(class_ra_sub1, 3552, class72, class86, i, false);
		((Class36_Sub4) this).anInt7031 = i;
		((Class36_Sub4) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(((Class36_Sub4) this).anInt375, 0, Class_ra_Sub1.method4870((((Class36_Sub4) this).aClass72_376), (((Class36_Sub4) this).aClass86_370)), ((Class36_Sub4) this).anInt7031, 0, Class_ra_Sub1.method4864(class72_0_), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		method515(true);
	}

	void method533(boolean bool) {
		((Class36_Sub4) this).aClass_ra_Sub1_373.method4844(this);
		OpenGL.glTexParameteri(((Class36_Sub4) this).anInt375, 10242, bool ? 10497 : 33071);
	}
}
