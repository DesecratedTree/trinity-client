/* Class61_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class61_Sub2 extends Class61 {
	boolean aBoolean9314;
	Class_ra_Sub1 aClass_ra_Sub1_9315;
	Class36_Sub1_Sub1 aClass36_Sub1_Sub1_9316;
	int anInt9317 = 0;
	int anInt9318;
	Class36_Sub1_Sub1 aClass36_Sub1_Sub1_9319;
	int anInt9320;
	int anInt9321;
	int anInt9322;

	public void method680(int[] is) {
		is[0] = ((Class61_Sub2) this).anInt9320;
		is[1] = ((Class61_Sub2) this).anInt9322;
		is[2] = ((Class61_Sub2) this).anInt9318;
		is[3] = ((Class61_Sub2) this).anInt9321;
	}

	void method736(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_6_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_5_);
		OpenGL.glColor4ub((byte) (i_4_ >> 16), (byte) (i_4_ >> 8), (byte) i_4_, (byte) (i_4_ >> 24));
		if (((Class61_Sub2) this).aBoolean9314) {
			float f = (float) i_1_ / (float) method318();
			float f_7_ = (float) i_2_ / (float) method683();
			float f_8_ = (float) i + (float) ((Class61_Sub2) this).anInt9320 * f;
			float f_9_ = ((float) i_0_ + (float) ((Class61_Sub2) this).anInt9322 * f_7_);
			float f_10_ = (f_8_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363) * f);
			float f_11_ = (f_9_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360) * f_7_);
			if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_3_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_8_, f_9_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_8_, f_11_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_10_, f_11_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_10_, f_9_);
				OpenGL.glEnd();
			} else {
				method740(i_3_);
				((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_8_, f_9_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_8_, f_11_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_10_, f_11_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_10_, f_9_);
				OpenGL.glEnd();
				method741();
			}
		} else if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_3_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_0_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_0_ + i_2_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_1_, i_0_ + i_2_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_1_, i_0_);
			OpenGL.glEnd();
		} else {
			method740(i_3_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_0_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_0_ + i_2_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_1_, i_0_ + i_2_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_1_, i_0_);
			OpenGL.glEnd();
			method741();
		}
	}

	Class61_Sub2(Class_ra_Sub1 class_ra_sub1, int i, int i_12_, int[] is, int i_13_, int i_14_) {
		((Class61_Sub2) this).aBoolean9314 = false;
		((Class61_Sub2) this).anInt9322 = 0;
		((Class61_Sub2) this).anInt9320 = 0;
		((Class61_Sub2) this).anInt9321 = 0;
		((Class61_Sub2) this).anInt9318 = 0;
		((Class61_Sub2) this).aClass_ra_Sub1_9315 = class_ra_sub1;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319 = Class36_Sub1_Sub1.method524(class_ra_sub1, i, i_12_, false, is, i_14_, i_13_);
	}

	public void method717(int i, int i_15_, int i_16_, int i_17_) {
		((Class61_Sub2) this).anInt9320 = i;
		((Class61_Sub2) this).anInt9322 = i_15_;
		((Class61_Sub2) this).anInt9318 = i_16_;
		((Class61_Sub2) this).anInt9321 = i_17_;
		((Class61_Sub2) this).aBoolean9314 = (((Class61_Sub2) this).anInt9320 != 0 || ((Class61_Sub2) this).anInt9322 != 0 || ((Class61_Sub2) this).anInt9318 != 0 || ((Class61_Sub2) this).anInt9321 != 0);
	}

	public void method701(int i, int i_18_, int i_19_, int i_20_) {
		((Class61_Sub2) this).anInt9320 = i;
		((Class61_Sub2) this).anInt9322 = i_18_;
		((Class61_Sub2) this).anInt9318 = i_19_;
		((Class61_Sub2) this).anInt9321 = i_20_;
		((Class61_Sub2) this).aBoolean9314 = (((Class61_Sub2) this).anInt9320 != 0 || ((Class61_Sub2) this).anInt9322 != 0 || ((Class61_Sub2) this).anInt9318 != 0 || ((Class61_Sub2) this).anInt9321 != 0);
	}

	public int method318() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363 + ((Class61_Sub2) this).anInt9320 + ((Class61_Sub2) this).anInt9318);
	}

	public int method682() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
	}

	public int method683() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360 + ((Class61_Sub2) this).anInt9322 + ((Class61_Sub2) this).anInt9321);
	}

	void method703(float f, float f_21_, float f_22_, float f_23_, float f_24_, float f_25_, int i, Class_ta class_ta, int i_26_, int i_27_) {
		Class36_Sub1_Sub1 class36_sub1_sub1 = (((Class_ta_Sub2) (Class_ta_Sub2) class_ta).aClass36_Sub1_Sub1_8660);
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_28_ = (float) method318();
			float f_29_ = (float) method683();
			float f_30_ = (f_22_ - f) / f_28_;
			float f_31_ = (f_23_ - f_21_) / f_28_;
			float f_32_ = (f_24_ - f) / f_29_;
			float f_33_ = (f_25_ - f_21_) / f_29_;
			float f_34_ = f_32_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_35_ = f_33_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_36_ = f_30_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_37_ = f_31_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_38_ = -f_30_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_39_ = -f_31_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_40_ = -f_32_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_41_ = -f_33_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_36_ + f_34_;
			f_21_ = f_21_ + f_37_ + f_35_;
			f_22_ = f_22_ + f_38_ + f_34_;
			f_23_ = f_23_ + f_39_ + f_35_;
			f_24_ = f_24_ + f_36_ + f_40_;
			f_25_ = f_25_ + f_37_ + f_41_;
		}
		float f_42_ = f_24_ + (f_22_ - f);
		float f_43_ = f_23_ + (f_25_ - f_21_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(class36_sub1_sub1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(7681, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(1);
		float f_44_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_45_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_44_ * (f - (float) i_26_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_45_ * (f_21_ - (float) i_27_)));
		OpenGL.glVertex2f(f, f_21_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_44_ * (f_24_ - (float) i_26_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_45_ * (f_25_ - (float) i_27_)));
		OpenGL.glVertex2f(f_24_, f_25_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_44_ * (f_42_ - (float) i_26_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_45_ * (f_43_ - (float) i_27_)));
		OpenGL.glVertex2f(f_42_, f_43_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_44_ * (f_22_ - (float) i_26_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_45_ * (f_23_ - (float) i_27_)));
		OpenGL.glVertex2f(f_22_, f_23_);
		OpenGL.glEnd();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
	}

	public void method737(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
		if (((Class_ra_Sub1) ((Class61_Sub2) this).aClass_ra_Sub1_9315).aBoolean8408) {
			int[] is = ((Class61_Sub2) this).aClass_ra_Sub1_9315.ar(i_49_, i_50_, i_47_, i_48_);
			if (is != null) {
				for (int i_51_ = 0; i_51_ < is.length; i_51_++)
					is[i_51_] |= ~0xffffff;
				method739(i, i_46_, i_47_, i_48_, is, 0, i_47_);
			}
		} else
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method520(i, i_46_, i_47_, i_48_, i_49_, i_50_);
	}

	public void method722(int i, int i_52_, int i_53_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 = (Class36_Sub1_Sub1.method527(((Class61_Sub2) this).aClass_ra_Sub1_9315, i, i_52_, ((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363, ((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360));
		((Class61_Sub2) this).anInt9317 = i_53_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method731(float f, float f_54_, float f_55_, float f_56_, float f_57_, float f_58_, int i, Class_ta class_ta, int i_59_, int i_60_) {
		Class36_Sub1_Sub1 class36_sub1_sub1 = (((Class_ta_Sub2) (Class_ta_Sub2) class_ta).aClass36_Sub1_Sub1_8660);
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_61_ = (float) method318();
			float f_62_ = (float) method683();
			float f_63_ = (f_55_ - f) / f_61_;
			float f_64_ = (f_56_ - f_54_) / f_61_;
			float f_65_ = (f_57_ - f) / f_62_;
			float f_66_ = (f_58_ - f_54_) / f_62_;
			float f_67_ = f_65_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_68_ = f_66_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_69_ = f_63_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_70_ = f_64_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_71_ = -f_63_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_72_ = -f_64_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_73_ = -f_65_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_74_ = -f_66_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_69_ + f_67_;
			f_54_ = f_54_ + f_70_ + f_68_;
			f_55_ = f_55_ + f_71_ + f_67_;
			f_56_ = f_56_ + f_72_ + f_68_;
			f_57_ = f_57_ + f_69_ + f_73_;
			f_58_ = f_58_ + f_70_ + f_74_;
		}
		float f_75_ = f_57_ + (f_55_ - f);
		float f_76_ = f_56_ + (f_58_ - f_54_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(class36_sub1_sub1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(7681, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(1);
		float f_77_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_78_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_77_ * (f - (float) i_59_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_78_ * (f_54_ - (float) i_60_)));
		OpenGL.glVertex2f(f, f_54_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_77_ * (f_57_ - (float) i_59_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_78_ * (f_58_ - (float) i_60_)));
		OpenGL.glVertex2f(f_57_, f_58_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_77_ * (f_75_ - (float) i_59_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_78_ * (f_76_ - (float) i_60_)));
		OpenGL.glVertex2f(f_75_, f_76_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_77_ * (f_55_ - (float) i_59_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_78_ * (f_56_ - (float) i_60_)));
		OpenGL.glVertex2f(f_55_, f_56_);
		OpenGL.glEnd();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
	}

	void method739(int i, int i_79_, int i_80_, int i_81_, int[] is, int i_82_, int i_83_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method522(i, i_79_, i_80_, i_81_, is, i_82_, i_83_, true);
	}

	public void method704(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		if (((Class_ra_Sub1) ((Class61_Sub2) this).aClass_ra_Sub1_9315).aBoolean8408) {
			int[] is = ((Class61_Sub2) this).aClass_ra_Sub1_9315.ar(i_87_, i_88_, i_85_, i_86_);
			if (is != null) {
				for (int i_89_ = 0; i_89_ < is.length; i_89_++)
					is[i_89_] |= ~0xffffff;
				method739(i, i_84_, i_85_, i_86_, is, 0, i_85_);
			}
		} else
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method520(i, i_84_, i_85_, i_86_, i_87_, i_88_);
	}

	void method740(int i) {
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(((Class61_Sub2) this).aClass_ra_Sub1_9315.method4846(i), 7681);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(1, 34167, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4848(0, 34168, 770);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9316);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(34479, 7681);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(1, 34166, 768);
		if (((Class61_Sub2) this).anInt9317 == 0)
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4850(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class61_Sub2) this).anInt9317 == 1)
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4850(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class61_Sub2) this).anInt9317 == 2)
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4850(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class61_Sub2) this).anInt9317 == 3)
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4850(128.5F, 128.5F, 128.5F, 0.0F);
	}

	public void method689(int i, int i_90_, Class_ta class_ta, int i_91_, int i_92_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		Class36_Sub1_Sub1 class36_sub1_sub1 = ((Class_ta_Sub2) class_ta_sub2).aClass36_Sub1_Sub1_8660;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(class36_sub1_sub1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(7681, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(1);
		i += ((Class61_Sub2) this).anInt9320;
		i_90_ += ((Class61_Sub2) this).anInt9322;
		int i_93_ = i + ((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363;
		int i_94_ = i_90_ + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
		float f = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_95_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		float f_96_ = (float) (i - i_91_) * f;
		float f_97_ = (float) (i_93_ - i_91_) * f;
		float f_98_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 - (float) (i_90_ - i_92_) * f_95_);
		float f_99_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 - (float) (i_94_ - i_92_) * f_95_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_96_, f_98_);
		OpenGL.glVertex2i(i, i_90_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_96_, f_99_);
		OpenGL.glVertex2i(i, i_90_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_97_, f_99_);
		OpenGL.glVertex2i(i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363), i_90_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_97_, f_98_);
		OpenGL.glVertex2i(i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363), i_90_);
		OpenGL.glEnd();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
	}

	public int method681() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
	}

	public void method694(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_) {
		int i_106_ = i + i_101_;
		int i_107_ = i_100_ + i_102_;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_105_);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_103_);
		OpenGL.glColor4ub((byte) (i_104_ >> 16), (byte) (i_104_ >> 8), (byte) i_104_, (byte) (i_104_ >> 24));
		if (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aBoolean9364 && !((Class61_Sub2) this).aBoolean9314) {
			float f = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361 * (float) i_102_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360));
			float f_108_ = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362 * (float) i_101_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_100_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_107_);
			OpenGL.glTexCoord2f(f_108_, 0.0F);
			OpenGL.glVertex2i(i_106_, i_107_);
			OpenGL.glTexCoord2f(f_108_, f);
			OpenGL.glVertex2i(i_106_, i_100_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class61_Sub2) this).anInt9320, (float) ((Class61_Sub2) this).anInt9322, 0.0F);
			int i_109_ = method318();
			int i_110_ = method683();
			int i_111_ = i_100_ + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
			OpenGL.glBegin(7);
			int i_112_ = i_100_;
			for (/**/; i_111_ <= i_107_; i_111_ += i_110_) {
				int i_113_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_114_ = i;
				while (i_113_ <= i_106_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_114_, i_112_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_114_, i_111_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
					OpenGL.glVertex2i(i_113_, i_111_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_113_, i_112_);
					i_113_ += i_109_;
					i_114_ += i_109_;
				}
				if (i_114_ < i_106_) {
					float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_106_ - i_114_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_114_, i_112_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_114_, i_111_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_106_, i_111_);
					OpenGL.glTexCoord2f(f, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_106_, i_112_);
				}
				i_112_ += i_110_;
			}
			if (i_112_ < i_107_) {
				float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361) * (float) (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360 - (i_107_ - i_112_)) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
				int i_115_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_116_ = i;
				while (i_115_ <= i_106_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_116_, i_112_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_116_, i_107_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), f);
					OpenGL.glVertex2i(i_115_, i_107_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_115_, i_112_);
					i_115_ += i_109_;
					i_116_ += i_109_;
				}
				if (i_116_ < i_106_) {
					float f_117_ = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_106_ - i_116_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_116_, i_112_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_116_, i_107_);
					OpenGL.glTexCoord2f(f_117_, f);
					OpenGL.glVertex2i(i_106_, i_107_);
					OpenGL.glTexCoord2f(f_117_, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_106_, i_112_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method735(float f, float f_118_, float f_119_, float f_120_, float f_121_, float f_122_, int i, int i_123_, int i_124_, int i_125_) {
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_126_ = (float) method318();
			float f_127_ = (float) method683();
			float f_128_ = (f_119_ - f) / f_126_;
			float f_129_ = (f_120_ - f_118_) / f_126_;
			float f_130_ = (f_121_ - f) / f_127_;
			float f_131_ = (f_122_ - f_118_) / f_127_;
			float f_132_ = f_130_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_133_ = f_131_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_134_ = f_128_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_135_ = f_129_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_136_ = -f_128_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_137_ = -f_129_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_138_ = -f_130_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_139_ = -f_131_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_134_ + f_132_;
			f_118_ = f_118_ + f_135_ + f_133_;
			f_119_ = f_119_ + f_136_ + f_132_;
			f_120_ = f_120_ + f_137_ + f_133_;
			f_121_ = f_121_ + f_134_ + f_138_;
			f_122_ = f_122_ + f_135_ + f_139_;
		}
		float f_140_ = f_121_ + (f_119_ - f);
		float f_141_ = f_120_ + (f_122_ - f_118_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_125_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_124_);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i);
		OpenGL.glColor4ub((byte) (i_123_ >> 16), (byte) (i_123_ >> 8), (byte) i_123_, (byte) (i_123_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361));
		OpenGL.glVertex2f(f, f_118_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_121_, f_122_);
		OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362), 0.0F);
		OpenGL.glVertex2f(f_140_, f_141_);
		OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362), (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361));
		OpenGL.glVertex2f(f_119_, f_120_);
		OpenGL.glEnd();
	}

	Class61_Sub2(Class_ra_Sub1 class_ra_sub1, int i, int i_142_, int i_143_, int i_144_) {
		((Class61_Sub2) this).aBoolean9314 = false;
		((Class61_Sub2) this).anInt9322 = 0;
		((Class61_Sub2) this).anInt9320 = 0;
		((Class61_Sub2) this).anInt9321 = 0;
		((Class61_Sub2) this).anInt9318 = 0;
		((Class61_Sub2) this).aClass_ra_Sub1_9315 = class_ra_sub1;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319 = Class36_Sub1_Sub1.method527(class_ra_sub1, i, i_142_, i_143_, i_144_);
	}

	public Interface8_Impl1_Impl2 method684() {
		return ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method523(0);
	}

	Class61_Sub2(Class_ra_Sub1 class_ra_sub1, int i, int i_145_, boolean bool) {
		((Class61_Sub2) this).aBoolean9314 = false;
		((Class61_Sub2) this).anInt9322 = 0;
		((Class61_Sub2) this).anInt9320 = 0;
		((Class61_Sub2) this).anInt9321 = 0;
		((Class61_Sub2) this).anInt9318 = 0;
		((Class61_Sub2) this).aClass_ra_Sub1_9315 = class_ra_sub1;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319 = Class36_Sub1_Sub1.method525(class_ra_sub1, (bool ? Class72.aClass72_620 : Class72.aClass72_614), Class86.aClass86_714, i, i_145_);
	}

	public Interface8_Impl1_Impl2 method713() {
		return ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method523(0);
	}

	public Interface8_Impl1_Impl2 method729() {
		return ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method523(0);
	}

	public Interface8_Impl1_Impl2 method707() {
		return ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method523(0);
	}

	public Interface8_Impl1_Impl2 method678() {
		return ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method523(0);
	}

	public void method700(int i, int i_146_, int i_147_, int i_148_, int i_149_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_149_);
		OpenGL.glColor4ub((byte) (i_148_ >> 16), (byte) (i_148_ >> 8), (byte) i_148_, (byte) (i_148_ >> 24));
		i += ((Class61_Sub2) this).anInt9320;
		i_146_ += ((Class61_Sub2) this).anInt9322;
		if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_147_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_146_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_146_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_146_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_146_);
			OpenGL.glEnd();
		} else {
			method740(i_147_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_146_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_146_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_146_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_146_);
			OpenGL.glEnd();
			method741();
		}
	}

	public void method685(int i, int i_150_, int i_151_, int i_152_, int i_153_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_153_);
		OpenGL.glColor4ub((byte) (i_152_ >> 16), (byte) (i_152_ >> 8), (byte) i_152_, (byte) (i_152_ >> 24));
		i += ((Class61_Sub2) this).anInt9320;
		i_150_ += ((Class61_Sub2) this).anInt9322;
		if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_151_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_150_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_150_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_150_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_150_);
			OpenGL.glEnd();
		} else {
			method740(i_151_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_150_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_150_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_150_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_150_);
			OpenGL.glEnd();
			method741();
		}
	}

	public void method708(int i, int i_154_, Class_ta class_ta, int i_155_, int i_156_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		Class36_Sub1_Sub1 class36_sub1_sub1 = ((Class_ta_Sub2) class_ta_sub2).aClass36_Sub1_Sub1_8660;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(class36_sub1_sub1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(7681, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(1);
		i += ((Class61_Sub2) this).anInt9320;
		i_154_ += ((Class61_Sub2) this).anInt9322;
		int i_157_ = i + ((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363;
		int i_158_ = i_154_ + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
		float f = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_159_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		float f_160_ = (float) (i - i_155_) * f;
		float f_161_ = (float) (i_157_ - i_155_) * f;
		float f_162_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 - (float) (i_154_ - i_156_) * f_159_);
		float f_163_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 - (float) (i_158_ - i_156_) * f_159_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_160_, f_162_);
		OpenGL.glVertex2i(i, i_154_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_160_, f_163_);
		OpenGL.glVertex2i(i, i_154_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_161_, f_163_);
		OpenGL.glVertex2i(i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363), i_154_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_161_, f_162_);
		OpenGL.glVertex2i(i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363), i_154_);
		OpenGL.glEnd();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
	}

	void method709(int i, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_170_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_169_);
		OpenGL.glColor4ub((byte) (i_168_ >> 16), (byte) (i_168_ >> 8), (byte) i_168_, (byte) (i_168_ >> 24));
		if (((Class61_Sub2) this).aBoolean9314) {
			float f = (float) i_165_ / (float) method318();
			float f_171_ = (float) i_166_ / (float) method683();
			float f_172_ = (float) i + (float) ((Class61_Sub2) this).anInt9320 * f;
			float f_173_ = ((float) i_164_ + (float) ((Class61_Sub2) this).anInt9322 * f_171_);
			float f_174_ = (f_172_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363) * f);
			float f_175_ = (f_173_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360) * f_171_);
			if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_167_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_172_, f_173_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_172_, f_175_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_174_, f_175_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_174_, f_173_);
				OpenGL.glEnd();
			} else {
				method740(i_167_);
				((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_172_, f_173_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_172_, f_175_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_174_, f_175_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_174_, f_173_);
				OpenGL.glEnd();
				method741();
			}
		} else if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_167_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_164_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_164_ + i_166_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_165_, i_164_ + i_166_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_165_, i_164_);
			OpenGL.glEnd();
		} else {
			method740(i_167_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_164_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_164_ + i_166_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_165_, i_164_ + i_166_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_165_, i_164_);
			OpenGL.glEnd();
			method741();
		}
	}

	public void method705(int i, int i_176_, int i_177_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 = (Class36_Sub1_Sub1.method527(((Class61_Sub2) this).aClass_ra_Sub1_9315, i, i_176_, ((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363, ((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360));
		((Class61_Sub2) this).anInt9317 = i_177_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method710(int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_184_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_183_);
		OpenGL.glColor4ub((byte) (i_182_ >> 16), (byte) (i_182_ >> 8), (byte) i_182_, (byte) (i_182_ >> 24));
		if (((Class61_Sub2) this).aBoolean9314) {
			float f = (float) i_179_ / (float) method318();
			float f_185_ = (float) i_180_ / (float) method683();
			float f_186_ = (float) i + (float) ((Class61_Sub2) this).anInt9320 * f;
			float f_187_ = ((float) i_178_ + (float) ((Class61_Sub2) this).anInt9322 * f_185_);
			float f_188_ = (f_186_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363) * f);
			float f_189_ = (f_187_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360) * f_185_);
			if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_181_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_186_, f_187_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_186_, f_189_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_188_, f_189_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_188_, f_187_);
				OpenGL.glEnd();
			} else {
				method740(i_181_);
				((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_186_, f_187_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_186_, f_189_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_188_, f_189_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_188_, f_187_);
				OpenGL.glEnd();
				method741();
			}
		} else if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_181_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_178_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_178_ + i_180_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_179_, i_178_ + i_180_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_179_, i_178_);
			OpenGL.glEnd();
		} else {
			method740(i_181_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_178_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_178_ + i_180_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_179_, i_178_ + i_180_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_179_, i_178_);
			OpenGL.glEnd();
			method741();
		}
	}

	public int method317() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363 + ((Class61_Sub2) this).anInt9320 + ((Class61_Sub2) this).anInt9318);
	}

	void method712(int i, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_196_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_195_);
		OpenGL.glColor4ub((byte) (i_194_ >> 16), (byte) (i_194_ >> 8), (byte) i_194_, (byte) (i_194_ >> 24));
		if (((Class61_Sub2) this).aBoolean9314) {
			float f = (float) i_191_ / (float) method318();
			float f_197_ = (float) i_192_ / (float) method683();
			float f_198_ = (float) i + (float) ((Class61_Sub2) this).anInt9320 * f;
			float f_199_ = ((float) i_190_ + (float) ((Class61_Sub2) this).anInt9322 * f_197_);
			float f_200_ = (f_198_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363) * f);
			float f_201_ = (f_199_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360) * f_197_);
			if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_193_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_198_, f_199_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_198_, f_201_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_200_, f_201_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_200_, f_199_);
				OpenGL.glEnd();
			} else {
				method740(i_193_);
				((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_198_, f_199_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_198_, f_201_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_200_, f_201_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_200_, f_199_);
				OpenGL.glEnd();
				method741();
			}
		} else if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_193_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_190_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_190_ + i_192_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_191_, i_190_ + i_192_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_191_, i_190_);
			OpenGL.glEnd();
		} else {
			method740(i_193_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_190_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_190_ + i_192_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_191_, i_190_ + i_192_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_191_, i_190_);
			OpenGL.glEnd();
			method741();
		}
	}

	public int method702() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
	}

	public int method714() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
	}

	public int method716() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
	}

	void method741() {
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(8448, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(1, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4848(0, 5890, 770);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(1, 34168, 768);
	}

	void method706(int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_208_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_207_);
		OpenGL.glColor4ub((byte) (i_206_ >> 16), (byte) (i_206_ >> 8), (byte) i_206_, (byte) (i_206_ >> 24));
		if (((Class61_Sub2) this).aBoolean9314) {
			float f = (float) i_203_ / (float) method318();
			float f_209_ = (float) i_204_ / (float) method683();
			float f_210_ = (float) i + (float) ((Class61_Sub2) this).anInt9320 * f;
			float f_211_ = ((float) i_202_ + (float) ((Class61_Sub2) this).anInt9322 * f_209_);
			float f_212_ = (f_210_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363) * f);
			float f_213_ = (f_211_ + (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360) * f_209_);
			if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
				((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_205_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_210_, f_211_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_210_, f_213_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_212_, f_213_);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_212_, f_211_);
				OpenGL.glEnd();
			} else {
				method740(i_205_);
				((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_210_, f_211_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_210_, f_213_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
				OpenGL.glVertex2f(f_212_, f_213_);
				OpenGL.glMultiTexCoord2f(33985, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
				OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
				OpenGL.glVertex2f(f_212_, f_211_);
				OpenGL.glEnd();
				method741();
			}
		} else if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_205_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_202_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_202_ + i_204_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_203_, i_202_ + i_204_);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_203_, i_202_);
			OpenGL.glEnd();
		} else {
			method740(i_205_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_202_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_202_ + i_204_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + i_203_, i_202_ + i_204_);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + i_203_, i_202_);
			OpenGL.glEnd();
			method741();
		}
	}

	public int method718() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
	}

	public int method719() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
	}

	public int method316() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363 + ((Class61_Sub2) this).anInt9320 + ((Class61_Sub2) this).anInt9318);
	}

	public int method315() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363 + ((Class61_Sub2) this).anInt9320 + ((Class61_Sub2) this).anInt9318);
	}

	public int method693() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
	}

	public int method724() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360 + ((Class61_Sub2) this).anInt9322 + ((Class61_Sub2) this).anInt9321);
	}

	public int method723() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360 + ((Class61_Sub2) this).anInt9322 + ((Class61_Sub2) this).anInt9321);
	}

	public void method726(int i, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_) {
		int i_220_ = i + i_215_;
		int i_221_ = i_214_ + i_216_;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_219_);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_217_);
		OpenGL.glColor4ub((byte) (i_218_ >> 16), (byte) (i_218_ >> 8), (byte) i_218_, (byte) (i_218_ >> 24));
		if (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aBoolean9364 && !((Class61_Sub2) this).aBoolean9314) {
			float f = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361 * (float) i_216_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360));
			float f_222_ = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362 * (float) i_215_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_214_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_221_);
			OpenGL.glTexCoord2f(f_222_, 0.0F);
			OpenGL.glVertex2i(i_220_, i_221_);
			OpenGL.glTexCoord2f(f_222_, f);
			OpenGL.glVertex2i(i_220_, i_214_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class61_Sub2) this).anInt9320, (float) ((Class61_Sub2) this).anInt9322, 0.0F);
			int i_223_ = method318();
			int i_224_ = method683();
			int i_225_ = i_214_ + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
			OpenGL.glBegin(7);
			int i_226_ = i_214_;
			for (/**/; i_225_ <= i_221_; i_225_ += i_224_) {
				int i_227_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_228_ = i;
				while (i_227_ <= i_220_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_228_, i_226_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_228_, i_225_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
					OpenGL.glVertex2i(i_227_, i_225_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_227_, i_226_);
					i_227_ += i_223_;
					i_228_ += i_223_;
				}
				if (i_228_ < i_220_) {
					float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_220_ - i_228_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_228_, i_226_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_228_, i_225_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_220_, i_225_);
					OpenGL.glTexCoord2f(f, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_220_, i_226_);
				}
				i_226_ += i_224_;
			}
			if (i_226_ < i_221_) {
				float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361) * (float) (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360 - (i_221_ - i_226_)) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
				int i_229_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_230_ = i;
				while (i_229_ <= i_220_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_230_, i_226_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_230_, i_221_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), f);
					OpenGL.glVertex2i(i_229_, i_221_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_229_, i_226_);
					i_229_ += i_223_;
					i_230_ += i_223_;
				}
				if (i_230_ < i_220_) {
					float f_231_ = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_220_ - i_230_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_230_, i_226_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_230_, i_221_);
					OpenGL.glTexCoord2f(f_231_, f);
					OpenGL.glVertex2i(i_220_, i_221_);
					OpenGL.glTexCoord2f(f_231_, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_220_, i_226_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public void method725(int i, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_) {
		int i_238_ = i + i_233_;
		int i_239_ = i_232_ + i_234_;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_237_);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_235_);
		OpenGL.glColor4ub((byte) (i_236_ >> 16), (byte) (i_236_ >> 8), (byte) i_236_, (byte) (i_236_ >> 24));
		if (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aBoolean9364 && !((Class61_Sub2) this).aBoolean9314) {
			float f = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361 * (float) i_234_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360));
			float f_240_ = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362 * (float) i_233_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_232_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_239_);
			OpenGL.glTexCoord2f(f_240_, 0.0F);
			OpenGL.glVertex2i(i_238_, i_239_);
			OpenGL.glTexCoord2f(f_240_, f);
			OpenGL.glVertex2i(i_238_, i_232_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class61_Sub2) this).anInt9320, (float) ((Class61_Sub2) this).anInt9322, 0.0F);
			int i_241_ = method318();
			int i_242_ = method683();
			int i_243_ = i_232_ + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
			OpenGL.glBegin(7);
			int i_244_ = i_232_;
			for (/**/; i_243_ <= i_239_; i_243_ += i_242_) {
				int i_245_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_246_ = i;
				while (i_245_ <= i_238_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_246_, i_244_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_246_, i_243_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
					OpenGL.glVertex2i(i_245_, i_243_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_245_, i_244_);
					i_245_ += i_241_;
					i_246_ += i_241_;
				}
				if (i_246_ < i_238_) {
					float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_238_ - i_246_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_246_, i_244_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_246_, i_243_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_238_, i_243_);
					OpenGL.glTexCoord2f(f, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_238_, i_244_);
				}
				i_244_ += i_242_;
			}
			if (i_244_ < i_239_) {
				float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361) * (float) (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360 - (i_239_ - i_244_)) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
				int i_247_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_248_ = i;
				while (i_247_ <= i_238_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_248_, i_244_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_248_, i_239_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), f);
					OpenGL.glVertex2i(i_247_, i_239_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_247_, i_244_);
					i_247_ += i_241_;
					i_248_ += i_241_;
				}
				if (i_248_ < i_238_) {
					float f_249_ = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_238_ - i_248_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_248_, i_244_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_248_, i_239_);
					OpenGL.glTexCoord2f(f_249_, f);
					OpenGL.glVertex2i(i_238_, i_239_);
					OpenGL.glTexCoord2f(f_249_, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_238_, i_244_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	public int method699() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
	}

	public void method727(int i, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_) {
		int i_256_ = i + i_251_;
		int i_257_ = i_250_ + i_252_;
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_255_);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_253_);
		OpenGL.glColor4ub((byte) (i_254_ >> 16), (byte) (i_254_ >> 8), (byte) i_254_, (byte) (i_254_ >> 24));
		if (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aBoolean9364 && !((Class61_Sub2) this).aBoolean9314) {
			float f = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361 * (float) i_252_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360));
			float f_258_ = (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362 * (float) i_251_ / (float) (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_250_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_257_);
			OpenGL.glTexCoord2f(f_258_, 0.0F);
			OpenGL.glVertex2i(i_256_, i_257_);
			OpenGL.glTexCoord2f(f_258_, f);
			OpenGL.glVertex2i(i_256_, i_250_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class61_Sub2) this).anInt9320, (float) ((Class61_Sub2) this).anInt9322, 0.0F);
			int i_259_ = method318();
			int i_260_ = method683();
			int i_261_ = i_250_ + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360);
			OpenGL.glBegin(7);
			int i_262_ = i_250_;
			for (/**/; i_261_ <= i_257_; i_261_ += i_260_) {
				int i_263_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_264_ = i;
				while (i_263_ <= i_256_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_264_, i_262_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_264_, i_261_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), 0.0F);
					OpenGL.glVertex2i(i_263_, i_261_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_263_, i_262_);
					i_263_ += i_259_;
					i_264_ += i_259_;
				}
				if (i_264_ < i_256_) {
					float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_256_ - i_264_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_264_, i_262_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_264_, i_261_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_256_, i_261_);
					OpenGL.glTexCoord2f(f, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_256_, i_262_);
				}
				i_262_ += i_260_;
			}
			if (i_262_ < i_257_) {
				float f = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361) * (float) (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360 - (i_257_ - i_262_)) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
				int i_265_ = i + (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9363);
				int i_266_ = i;
				while (i_265_ <= i_256_) {
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_266_, i_262_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_266_, i_257_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), f);
					OpenGL.glVertex2i(i_265_, i_257_);
					OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362), (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_265_, i_262_);
					i_265_ += i_259_;
					i_266_ += i_259_;
				}
				if (i_266_ < i_256_) {
					float f_267_ = ((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362) * (float) (i_256_ - i_266_) / (float) ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363);
					OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_266_, i_262_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_266_, i_257_);
					OpenGL.glTexCoord2f(f_267_, f);
					OpenGL.glVertex2i(i_256_, i_257_);
					OpenGL.glTexCoord2f(f_267_, (((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361));
					OpenGL.glVertex2i(i_256_, i_262_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method730(float f, float f_268_, float f_269_, float f_270_, float f_271_, float f_272_, int i, int i_273_, int i_274_, int i_275_) {
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_276_ = (float) method318();
			float f_277_ = (float) method683();
			float f_278_ = (f_269_ - f) / f_276_;
			float f_279_ = (f_270_ - f_268_) / f_276_;
			float f_280_ = (f_271_ - f) / f_277_;
			float f_281_ = (f_272_ - f_268_) / f_277_;
			float f_282_ = f_280_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_283_ = f_281_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_284_ = f_278_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_285_ = f_279_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_286_ = -f_278_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_287_ = -f_279_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_288_ = -f_280_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_289_ = -f_281_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_284_ + f_282_;
			f_268_ = f_268_ + f_285_ + f_283_;
			f_269_ = f_269_ + f_286_ + f_282_;
			f_270_ = f_270_ + f_287_ + f_283_;
			f_271_ = f_271_ + f_284_ + f_288_;
			f_272_ = f_272_ + f_285_ + f_289_;
		}
		float f_290_ = f_271_ + (f_269_ - f);
		float f_291_ = f_270_ + (f_272_ - f_268_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_275_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_274_);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i);
		OpenGL.glColor4ub((byte) (i_273_ >> 16), (byte) (i_273_ >> 8), (byte) i_273_, (byte) (i_273_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361));
		OpenGL.glVertex2f(f, f_268_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_271_, f_272_);
		OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362), 0.0F);
		OpenGL.glVertex2f(f_290_, f_291_);
		OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362), (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361));
		OpenGL.glVertex2f(f_269_, f_270_);
		OpenGL.glEnd();
	}

	void method728(float f, float f_292_, float f_293_, float f_294_, float f_295_, float f_296_, int i, int i_297_, int i_298_, int i_299_) {
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_300_ = (float) method318();
			float f_301_ = (float) method683();
			float f_302_ = (f_293_ - f) / f_300_;
			float f_303_ = (f_294_ - f_292_) / f_300_;
			float f_304_ = (f_295_ - f) / f_301_;
			float f_305_ = (f_296_ - f_292_) / f_301_;
			float f_306_ = f_304_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_307_ = f_305_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_308_ = f_302_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_309_ = f_303_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_310_ = -f_302_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_311_ = -f_303_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_312_ = -f_304_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_313_ = -f_305_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_308_ + f_306_;
			f_292_ = f_292_ + f_309_ + f_307_;
			f_293_ = f_293_ + f_310_ + f_306_;
			f_294_ = f_294_ + f_311_ + f_307_;
			f_295_ = f_295_ + f_308_ + f_312_;
			f_296_ = f_296_ + f_309_ + f_313_;
		}
		float f_314_ = f_295_ + (f_293_ - f);
		float f_315_ = f_294_ + (f_296_ - f_292_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i_299_ & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_298_);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i);
		OpenGL.glColor4ub((byte) (i_297_ >> 16), (byte) (i_297_ >> 8), (byte) i_297_, (byte) (i_297_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361));
		OpenGL.glVertex2f(f, f_292_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_295_, f_296_);
		OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362), 0.0F);
		OpenGL.glVertex2f(f_314_, f_315_);
		OpenGL.glTexCoord2f((((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9362), (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).aFloat9361));
		OpenGL.glVertex2f(f_293_, f_294_);
		OpenGL.glEnd();
	}

	public void method692(int[] is) {
		is[0] = ((Class61_Sub2) this).anInt9320;
		is[1] = ((Class61_Sub2) this).anInt9322;
		is[2] = ((Class61_Sub2) this).anInt9318;
		is[3] = ((Class61_Sub2) this).anInt9321;
	}

	public int method696() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360 + ((Class61_Sub2) this).anInt9322 + ((Class61_Sub2) this).anInt9321);
	}

	public void method688(int i, int i_316_, int i_317_, int i_318_, int i_319_) {
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515(false);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(i_319_);
		OpenGL.glColor4ub((byte) (i_318_ >> 16), (byte) (i_318_ >> 8), (byte) i_318_, (byte) (i_318_ >> 24));
		i += ((Class61_Sub2) this).anInt9320;
		i_316_ += ((Class61_Sub2) this).anInt9322;
		if (((Class61_Sub2) this).aClass36_Sub1_Sub1_9316 == null) {
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
			((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(i_317_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_316_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_316_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_316_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_316_);
			OpenGL.glEnd();
		} else {
			method740(i_317_);
			((Class61_Sub2) this).aClass36_Sub1_Sub1_9316.method515(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i, i_316_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_316_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_316_ + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9360);
			OpenGL.glMultiTexCoord2f(33985, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glTexCoord2f(((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
			OpenGL.glVertex2i(i + ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).anInt9363, i_316_);
			OpenGL.glEnd();
			method741();
		}
	}

	void method720(float f, float f_320_, float f_321_, float f_322_, float f_323_, float f_324_, int i, Class_ta class_ta, int i_325_, int i_326_) {
		Class36_Sub1_Sub1 class36_sub1_sub1 = (((Class_ta_Sub2) (Class_ta_Sub2) class_ta).aClass36_Sub1_Sub1_8660);
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_327_ = (float) method318();
			float f_328_ = (float) method683();
			float f_329_ = (f_321_ - f) / f_327_;
			float f_330_ = (f_322_ - f_320_) / f_327_;
			float f_331_ = (f_323_ - f) / f_328_;
			float f_332_ = (f_324_ - f_320_) / f_328_;
			float f_333_ = f_331_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_334_ = f_332_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_335_ = f_329_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_336_ = f_330_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_337_ = -f_329_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_338_ = -f_330_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_339_ = -f_331_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_340_ = -f_332_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_335_ + f_333_;
			f_320_ = f_320_ + f_336_ + f_334_;
			f_321_ = f_321_ + f_337_ + f_333_;
			f_322_ = f_322_ + f_338_ + f_334_;
			f_323_ = f_323_ + f_335_ + f_339_;
			f_324_ = f_324_ + f_336_ + f_340_;
		}
		float f_341_ = f_323_ + (f_321_ - f);
		float f_342_ = f_322_ + (f_324_ - f_320_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(class36_sub1_sub1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(7681, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(1);
		float f_343_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_344_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f - (float) i_325_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_344_ * (f_320_ - (float) i_326_)));
		OpenGL.glVertex2f(f, f_320_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f_323_ - (float) i_325_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_344_ * (f_324_ - (float) i_326_)));
		OpenGL.glVertex2f(f_323_, f_324_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f_341_ - (float) i_325_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_344_ * (f_342_ - (float) i_326_)));
		OpenGL.glVertex2f(f_341_, f_342_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f_321_ - (float) i_325_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_344_ * (f_322_ - (float) i_326_)));
		OpenGL.glVertex2f(f_321_, f_322_);
		OpenGL.glEnd();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
	}

	public int method711() {
		return (((Class36_Sub1_Sub1) ((Class61_Sub2) this).aClass36_Sub1_Sub1_9319).anInt9360 + ((Class61_Sub2) this).anInt9322 + ((Class61_Sub2) this).anInt9321);
	}

	void method732(float f, float f_345_, float f_346_, float f_347_, float f_348_, float f_349_, int i, Class_ta class_ta, int i_350_, int i_351_) {
		Class36_Sub1_Sub1 class36_sub1_sub1 = (((Class_ta_Sub2) (Class_ta_Sub2) class_ta).aClass36_Sub1_Sub1_8660);
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_352_ = (float) method318();
			float f_353_ = (float) method683();
			float f_354_ = (f_346_ - f) / f_352_;
			float f_355_ = (f_347_ - f_345_) / f_352_;
			float f_356_ = (f_348_ - f) / f_353_;
			float f_357_ = (f_349_ - f_345_) / f_353_;
			float f_358_ = f_356_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_359_ = f_357_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_360_ = f_354_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_361_ = f_355_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_362_ = -f_354_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_363_ = -f_355_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_364_ = -f_356_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_365_ = -f_357_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_360_ + f_358_;
			f_345_ = f_345_ + f_361_ + f_359_;
			f_346_ = f_346_ + f_362_ + f_358_;
			f_347_ = f_347_ + f_363_ + f_359_;
			f_348_ = f_348_ + f_360_ + f_364_;
			f_349_ = f_349_ + f_361_ + f_365_;
		}
		float f_366_ = f_348_ + (f_346_ - f);
		float f_367_ = f_347_ + (f_349_ - f_345_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(class36_sub1_sub1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(7681, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(1);
		float f_368_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_369_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_368_ * (f - (float) i_350_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_369_ * (f_345_ - (float) i_351_)));
		OpenGL.glVertex2f(f, f_345_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_368_ * (f_348_ - (float) i_350_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_369_ * (f_349_ - (float) i_351_)));
		OpenGL.glVertex2f(f_348_, f_349_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_368_ * (f_366_ - (float) i_350_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_369_ * (f_367_ - (float) i_351_)));
		OpenGL.glVertex2f(f_366_, f_367_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_368_ * (f_346_ - (float) i_350_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_369_ * (f_347_ - (float) i_351_)));
		OpenGL.glVertex2f(f_346_, f_347_);
		OpenGL.glEnd();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
	}

	void method733(float f, float f_370_, float f_371_, float f_372_, float f_373_, float f_374_, int i, Class_ta class_ta, int i_375_, int i_376_) {
		Class36_Sub1_Sub1 class36_sub1_sub1 = (((Class_ta_Sub2) (Class_ta_Sub2) class_ta).aClass36_Sub1_Sub1_8660);
		if (((Class61_Sub2) this).aBoolean9314) {
			float f_377_ = (float) method318();
			float f_378_ = (float) method683();
			float f_379_ = (f_371_ - f) / f_377_;
			float f_380_ = (f_372_ - f_370_) / f_377_;
			float f_381_ = (f_373_ - f) / f_378_;
			float f_382_ = (f_374_ - f_370_) / f_378_;
			float f_383_ = f_381_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_384_ = f_382_ * (float) ((Class61_Sub2) this).anInt9322;
			float f_385_ = f_379_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_386_ = f_380_ * (float) ((Class61_Sub2) this).anInt9320;
			float f_387_ = -f_379_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_388_ = -f_380_ * (float) ((Class61_Sub2) this).anInt9318;
			float f_389_ = -f_381_ * (float) ((Class61_Sub2) this).anInt9321;
			float f_390_ = -f_382_ * (float) ((Class61_Sub2) this).anInt9321;
			f = f + f_385_ + f_383_;
			f_370_ = f_370_ + f_386_ + f_384_;
			f_371_ = f_371_ + f_387_ + f_383_;
			f_372_ = f_372_ + f_388_ + f_384_;
			f_373_ = f_373_ + f_385_ + f_389_;
			f_374_ = f_374_ + f_386_ + f_390_;
		}
		float f_391_ = f_373_ + (f_371_ - f);
		float f_392_ = f_372_ + (f_374_ - f_370_);
		((Class61_Sub2) this).aClass36_Sub1_Sub1_9319.method515((i & 0x1) != 0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4838();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(((Class61_Sub2) this).aClass36_Sub1_Sub1_9319);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(class36_sub1_sub1);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4831(7681, 8448);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 34168, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4859(1);
		float f_393_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_394_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_393_ * (f - (float) i_375_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_394_ * (f_370_ - (float) i_376_)));
		OpenGL.glVertex2f(f, f_370_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_393_ * (f_373_ - (float) i_375_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_394_ * (f_374_ - (float) i_376_)));
		OpenGL.glVertex2f(f_373_, f_374_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_393_ * (f_391_ - (float) i_375_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_394_ * (f_392_ - (float) i_376_)));
		OpenGL.glVertex2f(f_391_, f_392_);
		OpenGL.glMultiTexCoord2f(33984, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9362, ((Class36_Sub1_Sub1) (((Class61_Sub2) this).aClass36_Sub1_Sub1_9319)).aFloat9361);
		OpenGL.glMultiTexCoord2f(33985, f_393_ * (f_371_ - (float) i_375_), ((((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361) - f_394_ * (f_372_ - (float) i_376_)));
		OpenGL.glVertex2f(f_371_, f_372_);
		OpenGL.glEnd();
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4847(0, 5890, 768);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4836(0);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4844(null);
		((Class61_Sub2) this).aClass_ra_Sub1_9315.method4843(0);
	}
}
