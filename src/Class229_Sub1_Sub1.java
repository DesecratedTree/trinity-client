/* Class229_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.r;

public class Class229_Sub1_Sub1 extends Class229_Sub1 implements Interface11_Impl3_Impl1 {
	public boolean method120() {
		return super.method113();
	}

	public Interface8_Impl1_Impl2 method169(int i) {
		return new Class237(this, i);
	}

	public void method126(int i, int i_0_, int i_1_, int i_2_, byte[] is, Class72 class72, int i_3_, int i_4_) {
		super.method117(i, i_0_, i_1_, i_2_, is, class72, i_3_, i_4_);
	}

	public int method137() {
		return super.method137();
	}

	public int method108() {
		return super.method108();
	}

	public float method106(float f) {
		return super.method106(f);
	}

	public void method130(int i, int i_5_, int i_6_, int i_7_, byte[] is, Class72 class72, int i_8_, int i_9_) {
		super.method117(i, i_5_, i_6_, i_7_, is, class72, i_8_, i_9_);
	}

	public boolean method113() {
		return super.method113();
	}

	public float method134() {
		return super.method123();
	}

	public void method162() {
		super.method166();
	}

	public void method117(int i, int i_10_, int i_11_, int i_12_, byte[] is, Class72 class72, int i_13_, int i_14_) {
		super.method117(i, i_10_, i_11_, i_12_, is, class72, i_13_, i_14_);
	}

	public void method118(int i, int i_15_, int i_16_, int i_17_, int[] is, int i_18_, int i_19_) {
		super.method118(i, i_15_, i_16_, i_17_, is, i_18_, i_19_);
	}

	public float method114() {
		return super.method114();
	}

	public boolean method115() {
		return super.method115();
	}

	public void method166() {
		super.method166();
	}

	public void method125(int i, int i_20_, int i_21_, int i_22_, byte[] is, Class72 class72, int i_23_, int i_24_) {
		super.method117(i, i_20_, i_21_, i_22_, is, class72, i_23_, i_24_);
	}

	public boolean method136() {
		return super.method115();
	}

	public void method52() {
		super.method53();
	}

	public int method116() {
		return super.method137();
	}

	public float method105(float f) {
		return super.method106(f);
	}

	public float method104(float f) {
		return super.method104(f);
	}

	public void method129(int i, int i_25_, int i_26_, int i_27_, int[] is, int i_28_, int i_29_) {
		super.method118(i, i_25_, i_26_, i_27_, is, i_28_, i_29_);
	}

	public void method111(int i, int i_30_, int i_31_, int i_32_, int[] is, int i_33_, int i_34_) {
		super.method118(i, i_30_, i_31_, i_32_, is, i_33_, i_34_);
	}

	public boolean method121() {
		return super.method113();
	}

	public float method123() {
		return super.method123();
	}

	public int method139() {
		return super.method108();
	}

	public void method53() {
		super.method53();
	}

	public void method109(boolean bool, boolean bool_35_) {
		super.method109(bool, bool_35_);
	}

	public void method122(boolean bool, boolean bool_36_) {
		super.method109(bool, bool_36_);
	}

	public void method127(int i, int i_37_, int i_38_, int i_39_, byte[] is, Class72 class72, int i_40_, int i_41_) {
		super.method117(i, i_37_, i_38_, i_39_, is, class72, i_40_, i_41_);
	}

	public float method132(float f) {
		return super.method104(f);
	}

	public void method107(int i, int i_42_, int i_43_, int i_44_, byte[] is, Class72 class72, int i_45_, int i_46_) {
		super.method117(i, i_42_, i_43_, i_44_, is, class72, i_45_, i_46_);
	}

	public void method128(int i, int i_47_, int i_48_, int i_49_, byte[] is, Class72 class72, int i_50_, int i_51_) {
		super.method117(i, i_47_, i_48_, i_49_, is, class72, i_50_, i_51_);
	}

	public void method131(int i, int i_52_, int i_53_, int i_54_, int[] is, int i_55_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class229_Sub1_Sub1) this).aLong6488, 0);
		long l_56_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub2_Sub2) (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484)).aLong9891), i_53_, i_54_, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect((((Class_ra_Sub2_Sub2) (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484)).aLong9891), l, i, i_52_, i_53_, i_54_, l_56_, 0, 0, i_53_, i_54_, 1))) {
			IDirect3DSurface.Download(l_56_, 0, 0, i_53_, i_54_, i_53_ * 4, 16, (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
			((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.clear();
			((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_56_);
	}

	public void method119(int i, int i_57_, int i_58_, int i_59_, int[] is, int i_60_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class229_Sub1_Sub1) this).aLong6488, 0);
		long l_61_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub2_Sub2) (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484)).aLong9891), i_58_, i_59_, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect((((Class_ra_Sub2_Sub2) (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484)).aLong9891), l, i, i_57_, i_58_, i_59_, l_61_, 0, 0, i_58_, i_59_, 1))) {
			IDirect3DSurface.Download(l_61_, 0, 0, i_58_, i_59_, i_58_ * 4, 16, (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
			((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.clear();
			((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_61_);
	}

	public float method133() {
		return super.method123();
	}

	public float method112(float f) {
		return super.method104(f);
	}

	public float method135() {
		return super.method114();
	}

	public void method163(Class189 class189) {
		super.method163(class189);
	}

	public void method164() {
		super.method166();
	}

	Class229_Sub1_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, Class86 class86, int i, int i_62_) {
		super(class_ra_sub2_sub2, class72, class86, i, i_62_, 1025, 0);
	}

	public void method165() {
		super.method166();
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}

	public int method124() {
		return super.method108();
	}

	public int method138() {
		return super.method108();
	}

	public void method110(int i, int i_63_, int i_64_, int i_65_, int[] is, int i_66_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class229_Sub1_Sub1) this).aLong6488, 0);
		long l_67_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub2_Sub2) (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484)).aLong9891), i_64_, i_65_, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect((((Class_ra_Sub2_Sub2) (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484)).aLong9891), l, i, i_63_, i_64_, i_65_, l_67_, 0, 0, i_64_, i_65_, 1))) {
			IDirect3DSurface.Download(l_67_, 0, 0, i_64_, i_65_, i_64_ * 4, 16, (((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
			((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.clear();
			((Class229_Sub1_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_67_);
	}

	public int method140() {
		return super.method108();
	}

	public int method141() {
		return super.method108();
	}

	public Interface8_Impl1_Impl2 method168(int i) {
		return new Class237(this, i);
	}
}
