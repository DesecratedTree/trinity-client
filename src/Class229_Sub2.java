/* Class229_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class229_Sub2 extends Class229 implements Interface11_Impl1 {
	int anInt8917;

	public void method166() {
		((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method164() {
		((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method53() {
		super.method53();
	}

	public void method163(Class189 class189) {
		super.method163(class189);
	}

	public void method52() {
		super.method53();
	}

	Class229_Sub2(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, int i, boolean bool, int[][] is) {
		super(class_ra_sub2_sub2, Class72.aClass72_620, Class86.aClass86_714, bool && ((Class_ra_Sub2_Sub2) class_ra_sub2_sub2).aBoolean9911, i * i * 6);
		((Class229_Sub2) this).anInt8917 = i;
		if (((Class229_Sub2) this).aBoolean6487)
			((Class229_Sub2) this).aLong6488 = (IDirect3DDevice.CreateCubeTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub2) this).anInt8917, 0, 1024, 21, 1));
		else
			((Class229_Sub2) this).aLong6488 = (IDirect3DDevice.CreateCubeTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub2) this).anInt8917, 1, 0, 21, 1));
		ByteBuffer bytebuffer = ((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			bytebuffer.clear();
			bytebuffer.asIntBuffer().put(is[i_0_]);
			IDirect3DCubeTexture.Upload(((Class229_Sub2) this).aLong6488, i_0_, 0, 0, 0, ((Class229_Sub2) this).anInt8917, ((Class229_Sub2) this).anInt8917, ((Class229_Sub2) this).anInt8917 * 4, 0, (((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
		}
	}

	public void method162() {
		((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method165() {
		((Class229_Sub2) this).aClass_ra_Sub2_Sub2_6484.method5165(this);
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}
}
