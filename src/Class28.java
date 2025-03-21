/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class28 {
	int anInt333;
	Class_ra_Sub1 aClass_ra_Sub1_334;
	static int[] anIntArray335 = new int[2];

	Class28(Class_ra_Sub1 class_ra_sub1, int i, Class35[] class35s) {
		((Class28) this).aClass_ra_Sub1_334 = class_ra_sub1;
		((Class28) this).anInt333 = i;
	}

	static Class28 method496(Class_ra_Sub1 class_ra_sub1, Class35[] class35s) {
		for (int i = 0; i < class35s.length; i++) {
			if (class35s[i] == null || ((Class35) class35s[i]).anInt366 <= 0)
				return null;
		}
		int i = OpenGL.glCreateProgram();
		for (int i_0_ = 0; i_0_ < class35s.length; i_0_++)
			OpenGL.glAttachShader(i, ((Class35) class35s[i_0_]).anInt366);
		OpenGL.glLinkProgram(i);
		OpenGL.glGetProgramiv(i, 35714, anIntArray335, 0);
		if (anIntArray335[0] == 0) {
			OpenGL.glGetProgramiv(i, 35716, anIntArray335, 1);
			if (anIntArray335[1] > 1) {
				byte[] is = new byte[anIntArray335[1]];
				OpenGL.glGetProgramInfoLog(i, anIntArray335[1], anIntArray335, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray335[0] == 0) {
				for (int i_1_ = 0; i_1_ < class35s.length; i_1_++)
					OpenGL.glDetachShader(i, ((Class35) class35s[i_1_]).anInt366);
				OpenGL.glDeleteProgram(i);
				return null;
			}
		}
		return new Class28(class_ra_sub1, i, class35s);
	}
}
