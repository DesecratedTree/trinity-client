/* Class330_Sub36_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class330_Sub36_Sub17 extends Class330_Sub36 implements Interface8_Impl1_Impl2_Impl2 {
	int anInt10167;
	int anInt10168;
	Class_ra_Sub1 aClass_ra_Sub1_10169;
	int anInt10170;
	Class86 aClass86_10171;
	Class72 aClass72_10172;
	int anInt10173;
	static int[] anIntArray10174 = new int[1];

	Class330_Sub36_Sub17(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i, int i_0_, int i_1_) {
		((Class330_Sub36_Sub17) this).aClass_ra_Sub1_10169 = class_ra_sub1;
		((Class330_Sub36_Sub17) this).anInt10173 = i;
		((Class330_Sub36_Sub17) this).anInt10170 = i_0_;
		((Class330_Sub36_Sub17) this).aClass72_10172 = class72;
		((Class330_Sub36_Sub17) this).aClass86_10171 = class86;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10174, 0);
		((Class330_Sub36_Sub17) this).anInt10168 = anIntArray10174[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class330_Sub36_Sub17) this).anInt10168);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_1_, Class_ra_Sub1.method4870((((Class330_Sub36_Sub17) this).aClass72_10172), (((Class330_Sub36_Sub17) this).aClass86_10171)), ((Class330_Sub36_Sub17) this).anInt10173, ((Class330_Sub36_Sub17) this).anInt10170);
		((Class330_Sub36_Sub17) this).anInt10167 = (((Class330_Sub36_Sub17) this).anInt10173 * ((Class330_Sub36_Sub17) this).anInt10170 * (((Class330_Sub36_Sub17) this).aClass72_10172.anInt609 * 2145490527) * (((Class330_Sub36_Sub17) this).aClass86_10171.anInt724 * -1615628035));
	}

	public int method60() {
		return ((Class330_Sub36_Sub17) this).anInt10170;
	}

	public int method55() {
		return ((Class330_Sub36_Sub17) this).anInt10170;
	}

	public int method61() {
		return ((Class330_Sub36_Sub17) this).anInt10170;
	}

	public void method53() {
		if (((Class330_Sub36_Sub17) this).anInt10168 > 0) {
			int[] is = new int[1];
			is[0] = ((Class330_Sub36_Sub17) this).anInt10168;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class330_Sub36_Sub17) this).anInt10168 = 0;
		}
	}

	void method3534() {
		if (((Class330_Sub36_Sub17) this).anInt10168 > 0) {
			((Class330_Sub36_Sub17) this).aClass_ra_Sub1_10169.method4861(((Class330_Sub36_Sub17) this).anInt10168, ((Class330_Sub36_Sub17) this).anInt10167);
			((Class330_Sub36_Sub17) this).anInt10168 = 0;
		}
	}

	public void method1(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class330_Sub36_Sub17) this).anInt10168));
	}

	public int method58() {
		return ((Class330_Sub36_Sub17) this).anInt10173;
	}

	public int method57() {
		return ((Class330_Sub36_Sub17) this).anInt10173;
	}

	public int method56() {
		return ((Class330_Sub36_Sub17) this).anInt10173;
	}

	public int method59() {
		return ((Class330_Sub36_Sub17) this).anInt10170;
	}

	public int method54() {
		return ((Class330_Sub36_Sub17) this).anInt10173;
	}

	public void method52() {
		if (((Class330_Sub36_Sub17) this).anInt10168 > 0) {
			int[] is = new int[1];
			is[0] = ((Class330_Sub36_Sub17) this).anInt10168;
			OpenGL.glDeleteRenderbuffersEXT(1, is, 0);
			((Class330_Sub36_Sub17) this).anInt10168 = 0;
		}
	}

	Class330_Sub36_Sub17(Class_ra_Sub1 class_ra_sub1, Class72 class72, Class86 class86, int i, int i_2_) {
		((Class330_Sub36_Sub17) this).aClass_ra_Sub1_10169 = class_ra_sub1;
		((Class330_Sub36_Sub17) this).anInt10173 = i;
		((Class330_Sub36_Sub17) this).anInt10170 = i_2_;
		((Class330_Sub36_Sub17) this).aClass72_10172 = class72;
		((Class330_Sub36_Sub17) this).aClass86_10171 = class86;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray10174, 0);
		((Class330_Sub36_Sub17) this).anInt10168 = anIntArray10174[0];
		OpenGL.glBindRenderbufferEXT(36161, ((Class330_Sub36_Sub17) this).anInt10168);
		OpenGL.glRenderbufferStorageEXT(36161, Class_ra_Sub1.method4870((((Class330_Sub36_Sub17) this).aClass72_10172), (((Class330_Sub36_Sub17) this).aClass86_10171)), ((Class330_Sub36_Sub17) this).anInt10173, ((Class330_Sub36_Sub17) this).anInt10170);
		((Class330_Sub36_Sub17) this).anInt10167 = (((Class330_Sub36_Sub17) this).anInt10173 * ((Class330_Sub36_Sub17) this).anInt10170 * (((Class330_Sub36_Sub17) this).aClass72_10172.anInt609 * 2145490527) * (((Class330_Sub36_Sub17) this).aClass86_10171.anInt724 * -1615628035));
	}

	public void method2(int i) {
		OpenGL.glFramebufferRenderbufferEXT(36160, i, 36161, (((Class330_Sub36_Sub17) this).anInt10168));
	}
}
