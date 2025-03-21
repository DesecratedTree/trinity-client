/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class264 implements Interface8_Impl1_Impl2, Interface8_Impl1_Impl1, Interface8_Impl1_Impl2_Impl1 {
	Class72 aClass72_10267;
	Class86 aClass86_10268;
	int anInt10269;
	int anInt10270;
	Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_10271;
	int anInt10272;

	public void method53() {
		if (((Class264) this).anInt10272 > 0) {
			int[] is = new int[1];
			is[0] = ((Class264) this).anInt10272;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class264) this).anInt10272 = 0;
		}
	}

	Class264(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, Class86 class86, int i, int i_0_, int i_1_) {
		((Class264) this).aClass72_10267 = class72;
		((Class264) this).aClass86_10268 = class86;
		((Class264) this).anInt10269 = i;
		((Class264) this).anInt10270 = i_0_;
		((Class264) this).aClass_ra_Sub2_Sub1_10271 = class_ra_sub2_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		((Class264) this).anInt10272 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class264) this).anInt10272);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class_ra_Sub2_Sub1.method5141(((Class264) this).aClass72_10267, ((Class264) this).aClass86_10268), i, i_0_);
	}

	public int method54() {
		return ((Class264) this).anInt10269;
	}

	public void method217(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class264) this).anInt10272);
	}

	Class264(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, Class86 class86, int i, int i_2_) {
		((Class264) this).aClass72_10267 = class72;
		((Class264) this).aClass86_10268 = class86;
		((Class264) this).anInt10269 = i;
		((Class264) this).anInt10270 = i_2_;
		((Class264) this).aClass_ra_Sub2_Sub1_10271 = class_ra_sub2_sub1;
		int[] is = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, is, 0);
		((Class264) this).anInt10272 = is[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class264) this).anInt10272);
		OpenGL.glRenderbufferStorageEXT(36161, Class_ra_Sub2_Sub1.method5141(((Class264) this).aClass72_10267, ((Class264) this).aClass86_10268), i, i_2_);
	}

	void method2644() {
		if (((Class264) this).anInt10272 > 0) {
			((Class264) this).aClass_ra_Sub2_Sub1_10271.method5140(((Class264) this).anInt10272, (((Class264) this).anInt10269 * ((Class264) this).anInt10270 * (((Class264) this).aClass86_10268.anInt724 * -1615628035) * (((Class264) this).aClass72_10267.anInt609 * 2145490527)));
			((Class264) this).anInt10272 = 0;
		}
	}

	public int method58() {
		return ((Class264) this).anInt10269;
	}

	public int method55() {
		return ((Class264) this).anInt10270;
	}

	public int method56() {
		return ((Class264) this).anInt10269;
	}

	public int method60() {
		return ((Class264) this).anInt10270;
	}

	public int method61() {
		return ((Class264) this).anInt10270;
	}

	public void method52() {
		if (((Class264) this).anInt10272 > 0) {
			int[] is = new int[1];
			is[0] = ((Class264) this).anInt10272;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class264) this).anInt10272 = 0;
		}
	}

	public int method59() {
		return ((Class264) this).anInt10270;
	}

	public void method215(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class264) this).anInt10272);
	}

	public void method216(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, ((Class264) this).anInt10272);
	}

	public int method57() {
		return ((Class264) this).anInt10269;
	}
}
