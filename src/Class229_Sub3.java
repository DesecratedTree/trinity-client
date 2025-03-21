/* Class229_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

public class Class229_Sub3 extends Class229 implements Interface11_Impl2 {
	int anInt8918;
	int anInt8919;
	int anInt8920;

	public void method163(Class189 class189) {
		super.method163(class189);
	}

	long method2318() {
		return ((Class229_Sub3) this).aLong6488;
	}

	public void method166() {
		((Class229_Sub3) this).aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	public void method52() {
		super.method53();
	}

	public void method165() {
		((Class229_Sub3) this).aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	public void method53() {
		super.method53();
	}

	public void method164() {
		((Class229_Sub3) this).aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	public void method162() {
		((Class229_Sub3) this).aClass_ra_Sub2_Sub2_6484.method5164(this);
	}

	long method2325() {
		return ((Class229_Sub3) this).aLong6488;
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}

	long method2326() {
		return ((Class229_Sub3) this).aLong6488;
	}

	Class229_Sub3(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, int i, int i_0_, int i_1_, boolean bool, byte[] is) {
		super(class_ra_sub2_sub2, class72, Class86.aClass86_714, false, i * i_0_ * i_1_);
		((Class229_Sub3) this).anInt8920 = i;
		((Class229_Sub3) this).anInt8919 = i_0_;
		((Class229_Sub3) this).anInt8918 = i_1_;
		((Class229_Sub3) this).aLong6488 = (IDirect3DDevice.CreateVolumeTexture(((Class_ra_Sub2_Sub2) ((Class229_Sub3) this).aClass_ra_Sub2_Sub2_6484).aLong9891, i, i_0_, i_1_, 1, 0, Class_ra_Sub2_Sub2.method5183(class72, ((Class229_Sub3) this).aClass86_6486), 1));
		ByteBuffer bytebuffer = ((Class229_Sub3) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is);
		IDirect3DVolumeTexture.Upload(((Class229_Sub3) this).aLong6488, 0, 0, 0, 0, ((Class229_Sub3) this).anInt8920, ((Class229_Sub3) this).anInt8919, ((Class229_Sub3) this).anInt8918, (((Class229_Sub3) this).anInt8920 * (class72.anInt609 * 2145490527)), 0, (((Class229_Sub3) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
	}
}
