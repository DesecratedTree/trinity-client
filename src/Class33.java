/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class33 {
	int anInt359;

	void method502() {
		OpenGL.glEndList();
	}

	void method503(char c) {
		OpenGL.glCallList(((Class33) this).anInt359 + c);
	}

	void method504(int i) {
		OpenGL.glNewList(((Class33) this).anInt359 + i, 4864);
	}

	Class33(Class_ra_Sub1 class_ra_sub1, int i) {
		((Class33) this).anInt359 = OpenGL.glGenLists(i);
	}
}
