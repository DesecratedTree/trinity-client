/* Class287_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class287_Sub3 extends Class287 implements Interface11_Impl3_Impl1 {
	int anInt10081;
	int anInt10082;

	public void method117(int i, int i_0_, int i_1_, int i_2_, byte[] is, Class72 class72, int i_3_, int i_4_) {
		if (i_4_ == 0)
			i_4_ = i_1_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_4_ != i_1_)
			OpenGL.glPixelStorei(3314, i_4_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub3) this).anInt6554, 0, i, i_0_, i_1_, i_2_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_3_);
		if (i_4_ != i_1_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public float method112(float f) {
		return f;
	}

	Class287_Sub3(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, int i, int i_5_, byte[] is, int i_6_, int i_7_) {
		super(class_ra_sub2_sub1, 34037, class72, Class86.aClass86_714, i * i_5_, false);
		((Class287_Sub3) this).anInt10082 = i;
		((Class287_Sub3) this).anInt10081 = i_5_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_7_);
		OpenGL.glTexImage2Dub(((Class287_Sub3) this).anInt6554, 0, (Class_ra_Sub2_Sub1.method5141(((Class287_Sub3) this).aClass72_6546, ((Class287_Sub3) this).aClass86_6545)), i, i_5_, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub3) this).aClass72_6546), 5121, is, i_6_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method109(boolean bool, boolean bool_8_) {
		/* empty */
	}

	public int method137() {
		return ((Class287_Sub3) this).anInt10082;
	}

	public void method128(int i, int i_9_, int i_10_, int i_11_, byte[] is, Class72 class72, int i_12_, int i_13_) {
		if (i_13_ == 0)
			i_13_ = i_10_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_13_ != i_10_)
			OpenGL.glPixelStorei(3314, i_13_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub3) this).anInt6554, 0, i, i_9_, i_10_, i_11_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_12_);
		if (i_13_ != i_10_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method52() {
		super.method53();
	}

	public float method104(float f) {
		return f;
	}

	public float method132(float f) {
		return f;
	}

	public float method114() {
		return 1.0F;
	}

	public boolean method113() {
		return false;
	}

	public boolean method115() {
		return super.method115();
	}

	public void method118(int i, int i_14_, int i_15_, int i_16_, int[] is, int i_17_, int i_18_) {
		if (i_18_ == 0)
			i_18_ = i_15_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (i_15_ != i_18_)
			OpenGL.glPixelStorei(3314, i_18_);
		OpenGL.glTexSubImage2Di(((Class287_Sub3) this).anInt6554, 0, i, i_14_, i_15_, i_16_, 32993, ((Class_ra_Sub2_Sub1) (((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550)).anInt9884, is, i_17_);
		if (i_15_ != i_18_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public boolean method121() {
		return false;
	}

	public void method163(Class189 class189) {
		super.method163(class189);
	}

	public Interface8_Impl1_Impl2 method169(int i) {
		return new Class265(this, i);
	}

	Class287_Sub3(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, int i, int i_19_, int[] is, int i_20_, int i_21_) {
		super(class_ra_sub2_sub1, 34037, Class72.aClass72_620, Class86.aClass86_714, i * i_19_, false);
		((Class287_Sub3) this).anInt10082 = i;
		((Class287_Sub3) this).anInt10081 = i_19_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, i_21_);
		OpenGL.glTexImage2Di(((Class287_Sub3) this).anInt6554, 0, 6408, ((Class287_Sub3) this).anInt10082, ((Class287_Sub3) this).anInt10081, 0, 32993, (((Class_ra_Sub2_Sub1) ((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550).anInt9884), is, i_20_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method123() {
		return 1.0F;
	}

	public void method127(int i, int i_22_, int i_23_, int i_24_, byte[] is, Class72 class72, int i_25_, int i_26_) {
		if (i_26_ == 0)
			i_26_ = i_23_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_26_ != i_23_)
			OpenGL.glPixelStorei(3314, i_26_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub3) this).anInt6554, 0, i, i_22_, i_23_, i_24_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_25_);
		if (i_26_ != i_23_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method53() {
		super.method53();
	}

	public float method134() {
		return 1.0F;
	}

	public int method116() {
		return ((Class287_Sub3) this).anInt10082;
	}

	public float method105(float f) {
		return f;
	}

	public boolean method136() {
		return super.method115();
	}

	public int method138() {
		return ((Class287_Sub3) this).anInt10081;
	}

	public boolean method120() {
		return false;
	}

	Class287_Sub3(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, int i, int i_27_, float[] fs, int i_28_, int i_29_) {
		super(class_ra_sub2_sub1, 34037, class72, Class86.aClass86_717, i * i_27_, false);
		((Class287_Sub3) this).anInt10082 = i;
		((Class287_Sub3) this).anInt10081 = i_27_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3314, i_29_);
		OpenGL.glTexImage2Df(((Class287_Sub3) this).anInt6554, 0, (Class_ra_Sub2_Sub1.method5141(((Class287_Sub3) this).aClass72_6546, ((Class287_Sub3) this).aClass86_6545)), i, i_27_, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub3) this).aClass72_6546), 5126, fs, i_28_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method122(boolean bool, boolean bool_30_) {
		/* empty */
	}

	public void method111(int i, int i_31_, int i_32_, int i_33_, int[] is, int i_34_, int i_35_) {
		if (i_35_ == 0)
			i_35_ = i_32_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (i_32_ != i_35_)
			OpenGL.glPixelStorei(3314, i_35_);
		OpenGL.glTexSubImage2Di(((Class287_Sub3) this).anInt6554, 0, i, i_31_, i_32_, i_33_, 32993, ((Class_ra_Sub2_Sub1) (((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550)).anInt9884, is, i_34_);
		if (i_32_ != i_35_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void method129(int i, int i_36_, int i_37_, int i_38_, int[] is, int i_39_, int i_40_) {
		if (i_40_ == 0)
			i_40_ = i_37_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		if (i_37_ != i_40_)
			OpenGL.glPixelStorei(3314, i_40_);
		OpenGL.glTexSubImage2Di(((Class287_Sub3) this).anInt6554, 0, i, i_36_, i_37_, i_38_, 32993, ((Class_ra_Sub2_Sub1) (((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550)).anInt9884, is, i_39_);
		if (i_37_ != i_40_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void method125(int i, int i_41_, int i_42_, int i_43_, byte[] is, Class72 class72, int i_44_, int i_45_) {
		if (i_45_ == 0)
			i_45_ = i_42_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_45_ != i_42_)
			OpenGL.glPixelStorei(3314, i_45_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub3) this).anInt6554, 0, i, i_41_, i_42_, i_43_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_44_);
		if (i_45_ != i_42_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method126(int i, int i_46_, int i_47_, int i_48_, byte[] is, Class72 class72, int i_49_, int i_50_) {
		if (i_50_ == 0)
			i_50_ = i_47_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_50_ != i_47_)
			OpenGL.glPixelStorei(3314, i_50_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub3) this).anInt6554, 0, i, i_46_, i_47_, i_48_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_49_);
		if (i_50_ != i_47_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}

	public void method131(int i, int i_51_, int i_52_, int i_53_, int[] is, int i_54_) {
		int[] is_55_ = new int[(((Class287_Sub3) this).anInt10082 * ((Class287_Sub3) this).anInt10081)];
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(((Class287_Sub3) this).anInt6554, 0, 32993, 5121, is_55_, 0);
		for (int i_56_ = 0; i_56_ < i_53_; i_56_++)
			System.arraycopy(is_55_, ((i_51_ + (i_53_ - 1) - i_56_) * ((Class287_Sub3) this).anInt10082), is, i_54_ + i_56_ * i_52_, i_52_);
	}

	public void method107(int i, int i_57_, int i_58_, int i_59_, byte[] is, Class72 class72, int i_60_, int i_61_) {
		if (i_61_ == 0)
			i_61_ = i_58_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_61_ != i_58_)
			OpenGL.glPixelStorei(3314, i_61_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub3) this).anInt6554, 0, i, i_57_, i_58_, i_59_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_60_);
		if (i_61_ != i_58_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method130(int i, int i_62_, int i_63_, int i_64_, byte[] is, Class72 class72, int i_65_, int i_66_) {
		if (i_66_ == 0)
			i_66_ = i_63_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_66_ != i_63_)
			OpenGL.glPixelStorei(3314, i_66_);
		OpenGL.glTexSubImage2Dub(((Class287_Sub3) this).anInt6554, 0, i, i_62_, i_63_, i_64_, Class_ra_Sub2_Sub1.method5152(class72), 5121, is, i_65_);
		if (i_66_ != i_63_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method108() {
		return ((Class287_Sub3) this).anInt10081;
	}

	public void method119(int i, int i_67_, int i_68_, int i_69_, int[] is, int i_70_) {
		int[] is_71_ = new int[(((Class287_Sub3) this).anInt10082 * ((Class287_Sub3) this).anInt10081)];
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(((Class287_Sub3) this).anInt6554, 0, 32993, 5121, is_71_, 0);
		for (int i_72_ = 0; i_72_ < i_69_; i_72_++)
			System.arraycopy(is_71_, ((i_67_ + (i_69_ - 1) - i_72_) * ((Class287_Sub3) this).anInt10082), is, i_70_ + i_72_ * i_68_, i_68_);
	}

	public float method133() {
		return 1.0F;
	}

	Class287_Sub3(Class_ra_Sub2_Sub1 class_ra_sub2_sub1, Class72 class72, Class86 class86, int i, int i_73_) {
		super(class_ra_sub2_sub1, 34037, class72, class86, i * i_73_, false);
		((Class287_Sub3) this).anInt10082 = i;
		((Class287_Sub3) this).anInt10081 = i_73_;
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glTexImage2Dub(((Class287_Sub3) this).anInt6554, 0, Class_ra_Sub2_Sub1.method5141((((Class287_Sub3) this).aClass72_6546), (((Class287_Sub3) this).aClass86_6545)), i, i_73_, 0, Class_ra_Sub2_Sub1.method5152(((Class287_Sub3) this).aClass72_6546), Class_ra_Sub2_Sub1.method5147(((Class287_Sub3) this).aClass86_6545), null, 0);
	}

	public float method135() {
		return 1.0F;
	}

	public void method110(int i, int i_74_, int i_75_, int i_76_, int[] is, int i_77_) {
		int[] is_78_ = new int[(((Class287_Sub3) this).anInt10082 * ((Class287_Sub3) this).anInt10081)];
		((Class287_Sub3) this).aClass_ra_Sub2_Sub1_6550.method4956(this);
		OpenGL.glGetTexImagei(((Class287_Sub3) this).anInt6554, 0, 32993, 5121, is_78_, 0);
		for (int i_79_ = 0; i_79_ < i_76_; i_79_++)
			System.arraycopy(is_78_, ((i_74_ + (i_76_ - 1) - i_79_) * ((Class287_Sub3) this).anInt10082), is, i_77_ + i_79_ * i_75_, i_75_);
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

	public int method141() {
		return ((Class287_Sub3) this).anInt10081;
	}

	public int method124() {
		return ((Class287_Sub3) this).anInt10081;
	}

	public void method166() {
		super.method166();
	}

	public int method139() {
		return ((Class287_Sub3) this).anInt10081;
	}

	public int method140() {
		return ((Class287_Sub3) this).anInt10081;
	}

	public float method106(float f) {
		return f;
	}

	public Interface8_Impl1_Impl2 method168(int i) {
		return new Class265(this, i);
	}
}
