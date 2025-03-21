/* Class287_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class287_Sub4 extends Class287 implements Interface11_Impl1 {
	static int anInt8951 = 34069;

	public void method166() {
		super.method166();
	}

	Class287_Sub4(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, int i, boolean bool, int[][] is) {
		super(class_ra_sub2_sub1, 34067, Class72.aClass72_620, Class86.aClass86_714, i * i * 6, bool);
		((Class287_Sub4) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (bool) {
			for (int i_0_ = 0; i_0_ < 6; i_0_++)
				method2881(34069 + i_0_, i, i, is[i_0_]);
		} else {
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				OpenGL.glTexImage2Di(34069 + i_1_, 0, Class_ra_Sub2_Sub1.method5141((((Class287_Sub4) this).aClass72_6546), (((Class287_Sub4) this).aClass86_6545)), i, i, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub4) this).aClass72_6546), (((Class_ra_Sub2_Sub1) ((Class287_Sub4) this).aClass_ra_Sub2_Sub1_6550).anInt9884), is[i_1_], 0);
		}
	}

	public void method163(Class189 class189) {
		super.method163(class189);
	}

	public void method53() {
		super.method53();
	}

	public void method52() {
		super.method53();
	}

	public void method164() {
		super.method166();
	}

	public void method162() {
		super.method166();
	}

	public void method165() {
		super.method166();
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}
}
