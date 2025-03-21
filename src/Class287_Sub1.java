/* Class287_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class287_Sub1 extends Class287 implements Interface11_Impl3_Impl1 {
	int anInt10079;
	int anInt10080;

	public void method109(boolean bool, boolean bool_0_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexParameteri(((Class287_Sub1) this).anInt6554, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class287_Sub1) this).anInt6554, 10243, bool_0_ ? 10497 : 33071);
	}

	public float method105(float f) {
		return f / (float) ((Class287_Sub1) this).anInt10079;
	}

	Class287_Sub1(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, int i, int i_1_, boolean bool, byte[] is, int i_2_, int i_3_) {
		super(class_ra_sub2_sub1, 3553, class72, Class86.aClass86_714, i * i_1_, bool);
		((Class287_Sub1) this).anInt10079 = i;
		((Class287_Sub1) this).anInt10080 = i_1_;
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_3_ != 0 || i_2_ != 0) {
			OpenGL.glPixelStorei(3314, i_3_);
			Class72 class72_4_ = ((Class287_Sub1) this).aClass72_6546;
			if (((Class287_Sub1) this).aClass72_6546 != null) {
				/* empty */
			}
			if (class72_4_ == Class72.aClass72_617)
				OpenGL.glCompressedTexImage2Dub((((Class287_Sub1) this).anInt6554), 0, 33777, i, i_1_, 0, i * i_1_ / 2, is, i_2_);
			else {
				Class72 class72_5_ = ((Class287_Sub1) this).aClass72_6546;
				if (((Class287_Sub1) this).aClass72_6546 != null) {
					/* empty */
				}
				if (class72_5_ == Class72.aClass72_618)
					OpenGL.glCompressedTexImage2Dub((((Class287_Sub1) this).anInt6554), 0, 33779, i, i_1_, 0, i * i_1_, is, i_2_);
				else
					OpenGL.glTexImage2Dub(((Class287_Sub1) this).anInt6554, 0, Class_ra_Sub2_Sub1.method5141((((Class287_Sub1) this).aClass72_6546), (((Class287_Sub1) this).aClass86_6545)), i, i_1_, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub1) this).aClass72_6546), 5121, is, i_2_);
			}
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2878(((Class287_Sub1) this).anInt6554, i, i_1_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class287_Sub1(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, int i, int i_6_, boolean bool, float[] fs, int i_7_, int i_8_) {
		super(class_ra_sub2_sub1, 3553, class72, Class86.aClass86_717, i * i_6_, bool);
		((Class287_Sub1) this).anInt10079 = i;
		((Class287_Sub1) this).anInt10080 = i_6_;
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (!bool || i_8_ != 0 || i_7_ != 0) {
			OpenGL.glPixelStorei(3314, i_8_);
			OpenGL.glTexImage2Df(((Class287_Sub1) this).anInt6554, 0, (Class_ra_Sub2_Sub1.method5141(((Class287_Sub1) this).aClass72_6546, ((Class287_Sub1) this).aClass86_6545)), i, i_6_, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub1) this).aClass72_6546), 5126, fs, i_7_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2882(((Class287_Sub1) this).anInt6554, i, i_6_, fs);
	}

	public int method137() {
		return ((Class287_Sub1) this).anInt10079;
	}

	public int method108() {
		return ((Class287_Sub1) this).anInt10080;
	}

	Class287_Sub1(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, int i, int i_9_, boolean bool, int[] is, int i_10_, int i_11_) {
		super(class_ra_sub2_sub1, 3553, Class72.aClass72_620, Class86.aClass86_714, i * i_9_, bool);
		((Class287_Sub1) this).anInt10079 = i;
		((Class287_Sub1) this).anInt10080 = i_9_;
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (!bool || i_11_ != 0 || i_10_ != 0) {
			OpenGL.glPixelStorei(3314, i_11_);
			OpenGL.glTexImage2Di(((Class287_Sub1) this).anInt6554, 0, 6408, ((Class287_Sub1) this).anInt10079, ((Class287_Sub1) this).anInt10080, 0, 32993, ((Class_ra_Sub2_Sub1) (((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550)).anInt9884, is, i_10_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2881(((Class287_Sub1) this).anInt6554, i, i_9_, is);
	}

	public void method165() {
		super.method166();
	}

	public float method123() {
		return 1.0F;
	}

	public float method114() {
		return 1.0F;
	}

	public boolean method113() {
		return true;
	}

	public Interface8_Impl1_Impl2 method168(int i) {
		return new Class272(this, i);
	}

	public void method118(int i, int i_12_, int i_13_, int i_14_, int[] is, int i_15_, int i_16_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, i_16_);
		OpenGL.glTexSubImage2Di(((Class287_Sub1) this).anInt6554, 0, i, i_12_, i_13_, i_14_, 32993, ((Class_ra_Sub2_Sub1) (((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550)).anInt9884, is, i_15_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public int method116() {
		return ((Class287_Sub1) this).anInt10079;
	}

	public int method140() {
		return ((Class287_Sub1) this).anInt10080;
	}

	public void method110(int i, int i_17_, int i_18_, int i_19_, int[] is, int i_20_) {
		int[] is_21_ = new int[(((Class287_Sub1) this).anInt10079 * ((Class287_Sub1) this).anInt10080)];
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(((Class287_Sub1) this).anInt6554, 0, 32993, 5121, is_21_, 0);
		for (int i_22_ = 0; i_22_ < i_19_; i_22_++)
			System.arraycopy(is_21_, ((i_17_ + (i_19_ - 1) - i_22_) * ((Class287_Sub1) this).anInt10079), is, i_20_ + i_22_ * i_18_, i_18_);
	}

	public void method131(int i, int i_23_, int i_24_, int i_25_, int[] is, int i_26_) {
		int[] is_27_ = new int[(((Class287_Sub1) this).anInt10079 * ((Class287_Sub1) this).anInt10080)];
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(((Class287_Sub1) this).anInt6554, 0, 32993, 5121, is_27_, 0);
		for (int i_28_ = 0; i_28_ < i_25_; i_28_++)
			System.arraycopy(is_27_, ((i_23_ + (i_25_ - 1) - i_28_) * ((Class287_Sub1) this).anInt10079), is, i_26_ + i_28_ * i_24_, i_24_);
	}

	public void method122(boolean bool, boolean bool_29_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexParameteri(((Class287_Sub1) this).anInt6554, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class287_Sub1) this).anInt6554, 10243, bool_29_ ? 10497 : 33071);
	}

	public void method166() {
		super.method166();
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

	public float method106(float f) {
		return f / (float) ((Class287_Sub1) this).anInt10079;
	}

	public boolean method115() {
		return super.method115();
	}

	public float method112(float f) {
		return f / (float) ((Class287_Sub1) this).anInt10080;
	}

	public float method132(float f) {
		return f / (float) ((Class287_Sub1) this).anInt10080;
	}

	public void method117(int i, int i_30_, int i_31_, int i_32_, byte[] is, Class72 class72, int i_33_, int i_34_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_34_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub1) this).anInt6554, 0, i, i_30_, i_31_, i_32_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_33_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public boolean method120() {
		return true;
	}

	public int method141() {
		return ((Class287_Sub1) this).anInt10080;
	}

	public void method111(int i, int i_35_, int i_36_, int i_37_, int[] is, int i_38_, int i_39_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, i_39_);
		OpenGL.glTexSubImage2Di(((Class287_Sub1) this).anInt6554, 0, i, i_35_, i_36_, i_37_, 32993, ((Class_ra_Sub2_Sub1) (((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550)).anInt9884, is, i_38_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method129(int i, int i_40_, int i_41_, int i_42_, int[] is, int i_43_, int i_44_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, i_44_);
		OpenGL.glTexSubImage2Di(((Class287_Sub1) this).anInt6554, 0, i, i_40_, i_41_, i_42_, 32993, ((Class_ra_Sub2_Sub1) (((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550)).anInt9884, is, i_43_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method125(int i, int i_45_, int i_46_, int i_47_, byte[] is, Class72 class72, int i_48_, int i_49_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_49_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub1) this).anInt6554, 0, i, i_45_, i_46_, i_47_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_48_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method2883(int i, int i_50_, int i_51_, int i_52_, float[] fs, Class72 class72, int i_53_, int i_54_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, i_54_);
		OpenGL.glTexSubImage2Df(((Class287_Sub1) this).anInt6554, 0, i, i_50_, i_51_, i_52_, Class_ra_Sub2_Sub1.method5152(class72), 5121, fs, i_53_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method127(int i, int i_55_, int i_56_, int i_57_, byte[] is, Class72 class72, int i_58_, int i_59_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_59_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub1) this).anInt6554, 0, i, i_55_, i_56_, i_57_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_58_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method128(int i, int i_60_, int i_61_, int i_62_, byte[] is, Class72 class72, int i_63_, int i_64_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_64_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub1) this).anInt6554, 0, i, i_60_, i_61_, i_62_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_63_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method107(int i, int i_65_, int i_66_, int i_67_, byte[] is, Class72 class72, int i_68_, int i_69_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_69_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub1) this).anInt6554, 0, i, i_65_, i_66_, i_67_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_68_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method130(int i, int i_70_, int i_71_, int i_72_, byte[] is, Class72 class72, int i_73_, int i_74_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_74_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub1) this).anInt6554, 0, i, i_70_, i_71_, i_72_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_73_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method139() {
		return ((Class287_Sub1) this).anInt10080;
	}

	public void method119(int i, int i_75_, int i_76_, int i_77_, int[] is, int i_78_) {
		int[] is_79_ = new int[(((Class287_Sub1) this).anInt10079 * ((Class287_Sub1) this).anInt10080)];
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(((Class287_Sub1) this).anInt6554, 0, 32993, 5121, is_79_, 0);
		for (int i_80_ = 0; i_80_ < i_77_; i_80_++)
			System.arraycopy(is_79_, ((i_75_ + (i_77_ - 1) - i_80_) * ((Class287_Sub1) this).anInt10079), is, i_78_ + i_80_ * i_76_, i_76_);
	}

	public Interface8_Impl1_Impl2 method169(int i) {
		return new Class272(this, i);
	}

	public float method134() {
		return 1.0F;
	}

	public float method135() {
		return 1.0F;
	}

	public boolean method136() {
		return super.method115();
	}

	public void method164() {
		super.method166();
	}

	public void method162() {
		super.method166();
	}

	public float method104(float f) {
		return f / (float) ((Class287_Sub1) this).anInt10080;
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}

	public int method124() {
		return ((Class287_Sub1) this).anInt10080;
	}

	public int method138() {
		return ((Class287_Sub1) this).anInt10080;
	}

	Class287_Sub1(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, Class86 class86, int i, int i_81_) {
		super(class_ra_sub2_sub1, 3553, class72, class86, i * i_81_, false);
		((Class287_Sub1) this).anInt10079 = i;
		((Class287_Sub1) this).anInt10080 = i_81_;
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexImage2Dub(((Class287_Sub1) this).anInt6554, 0, Class_ra_Sub2_Sub1.method5141((((Class287_Sub1) this).aClass72_6546), (((Class287_Sub1) this).aClass86_6545)), i, i_81_, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub1) this).aClass72_6546), Class_ra_Sub2_Sub1.method5147(((Class287_Sub1) this).aClass86_6545), null, 0);
	}

	public boolean method121() {
		return true;
	}

	public float method133() {
		return 1.0F;
	}

	public void method126(int i, int i_82_, int i_83_, int i_84_, byte[] is, Class72 class72, int i_85_, int i_86_) {
		((Class287_Sub1) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_86_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub1) this).anInt6554, 0, i, i_82_, i_83_, i_84_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_85_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
