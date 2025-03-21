/* Class287_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class287_Sub2 extends Class287 implements Interface11_Impl2 {
	int anInt8948;
	int anInt8949;
	int anInt8950;

	public void method163(Class189 class189) {
		super.method163(class189);
	}

	public void method166() {
		super.method166();
	}

	public void method162() {
		super.method166();
	}

	public void method53() {
		super.method53();
	}

	public void method52() {
		super.method53();
	}

	Class287_Sub2(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class_ra_sub2_sub1, 32879, class72, Class86.aClass86_714, i * i_0_ * i_1_, bool);
		((Class287_Sub2) this).anInt8948 = i;
		((Class287_Sub2) this).anInt8949 = i_0_;
		((Class287_Sub2) this).anInt8950 = i_1_;
		((Class287_Sub2) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(((Class287_Sub2) this).anInt6554, 0, (Class_ra_Sub2_Sub1.method5141(((Class287_Sub2) this).aClass72_6546, ((Class287_Sub2) this).aClass86_6545)), ((Class287_Sub2) this).anInt8948, ((Class287_Sub2) this).anInt8949, ((Class287_Sub2) this).anInt8950, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub2) this).aClass72_6546), 5121, is, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (bool)
			method115();
	}

	public void method164() {
		super.method166();
	}

	public void method165() {
		super.method166();
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}
}
