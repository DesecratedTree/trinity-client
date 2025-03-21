/* Class263_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class263_Sub1 extends Class263 {
	Class33 aClass33_7369;
	Class_ra_Sub1 aClass_ra_Sub1_7370;
	Class36_Sub1_Sub1 aClass36_Sub1_Sub1_7371;
	boolean aBoolean7372;

	void method2604(char c, int i, int i_0_, int i_1_, boolean bool, Class_ta class_ta, int i_2_, int i_3_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		Class36_Sub1_Sub1 class36_sub1_sub1 = ((Class_ta_Sub2) class_ta_sub2).aClass36_Sub1_Sub1_8660;
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4839();
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(((Class263_Sub1) this).aClass36_Sub1_Sub1_7371);
		if (((Class263_Sub1) this).aBoolean7372 || bool) {
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 7681);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(class36_sub1_sub1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_4_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_2_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_4_, 0.0F, (float) -i_3_ * f_4_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		((Class263_Sub1) this).aClass33_7369.method503(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(8448, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(null);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(0);
		if (((Class263_Sub1) this).aBoolean7372 || bool)
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
	}

	void UA(char c, int i, int i_5_, int i_6_, boolean bool) {
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4839();
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(((Class263_Sub1) this).aClass36_Sub1_Sub1_7371);
		if (((Class263_Sub1) this).aBoolean7372 || bool) {
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 7681);
		OpenGL.glColor4ub((byte) (i_6_ >> 16), (byte) (i_6_ >> 8), (byte) i_6_, (byte) (i_6_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_5_, 0.0F);
		((Class263_Sub1) this).aClass33_7369.method503(c);
		OpenGL.glLoadIdentity();
		if (((Class263_Sub1) this).aBoolean7372 || bool)
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
	}

	void method2602(char c, int i, int i_7_, int i_8_, boolean bool, Class_ta class_ta, int i_9_, int i_10_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		Class36_Sub1_Sub1 class36_sub1_sub1 = ((Class_ta_Sub2) class_ta_sub2).aClass36_Sub1_Sub1_8660;
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4839();
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(((Class263_Sub1) this).aClass36_Sub1_Sub1_7371);
		if (((Class263_Sub1) this).aBoolean7372 || bool) {
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 7681);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(class36_sub1_sub1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_11_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_9_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_11_, 0.0F, (float) -i_10_ * f_11_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_8_ >> 16), (byte) (i_8_ >> 8), (byte) i_8_, (byte) (i_8_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_7_, 0.0F);
		((Class263_Sub1) this).aClass33_7369.method503(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(8448, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(null);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(0);
		if (((Class263_Sub1) this).aBoolean7372 || bool)
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
	}

	void method2603(char c, int i, int i_12_, int i_13_, boolean bool, Class_ta class_ta, int i_14_, int i_15_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		Class36_Sub1_Sub1 class36_sub1_sub1 = ((Class_ta_Sub2) class_ta_sub2).aClass36_Sub1_Sub1_8660;
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4839();
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(((Class263_Sub1) this).aClass36_Sub1_Sub1_7371);
		if (((Class263_Sub1) this).aBoolean7372 || bool) {
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 7681);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(class36_sub1_sub1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_16_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_14_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_16_, 0.0F, (float) -i_15_ * f_16_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_13_ >> 16), (byte) (i_13_ >> 8), (byte) i_13_, (byte) (i_13_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_12_, 0.0F);
		((Class263_Sub1) this).aClass33_7369.method503(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(8448, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(null);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(0);
		if (((Class263_Sub1) this).aBoolean7372 || bool)
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
	}

	void method2609(char c, int i, int i_17_, int i_18_, boolean bool, Class_ta class_ta, int i_19_, int i_20_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		Class36_Sub1_Sub1 class36_sub1_sub1 = ((Class_ta_Sub2) class_ta_sub2).aClass36_Sub1_Sub1_8660;
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4839();
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(((Class263_Sub1) this).aClass36_Sub1_Sub1_7371);
		if (((Class263_Sub1) this).aBoolean7372 || bool) {
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 7681);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(class36_sub1_sub1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_21_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_19_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_21_, 0.0F, (float) -i_20_ * f_21_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_18_ >> 16), (byte) (i_18_ >> 8), (byte) i_18_, (byte) (i_18_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_17_, 0.0F);
		((Class263_Sub1) this).aClass33_7369.method503(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(8448, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(null);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(0);
		if (((Class263_Sub1) this).aBoolean7372 || bool)
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
	}

	void c(char c, int i, int i_22_, int i_23_, boolean bool) {
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4839();
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(((Class263_Sub1) this).aClass36_Sub1_Sub1_7371);
		if (((Class263_Sub1) this).aBoolean7372 || bool) {
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 7681);
		OpenGL.glColor4ub((byte) (i_23_ >> 16), (byte) (i_23_ >> 8), (byte) i_23_, (byte) (i_23_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_22_, 0.0F);
		((Class263_Sub1) this).aClass33_7369.method503(c);
		OpenGL.glLoadIdentity();
		if (((Class263_Sub1) this).aBoolean7372 || bool)
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
	}

	Class263_Sub1(Class_ra_Sub1 class_ra_sub1, Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		super(class_ra_sub1, class524);
		((Class263_Sub1) this).aClass_ra_Sub1_7370 = class_ra_sub1;
		int i = 0;
		for (int i_24_ = 0; i_24_ < 256; i_24_++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i_24_];
			if (class87_sub2.anInt7107 > i)
				i = class87_sub2.anInt7107;
			if (class87_sub2.anInt7112 > i)
				i = class87_sub2.anInt7112;
		}
		int i_25_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_25_ * i_25_];
			for (int i_26_ = 0; i_26_ < 256; i_26_++) {
				Class87_Sub2 class87_sub2 = class87_sub2s[i_26_];
				int i_27_ = class87_sub2.anInt7107;
				int i_28_ = class87_sub2.anInt7112;
				int i_29_ = i_26_ % 16 * i;
				int i_30_ = i_26_ / 16 * i;
				int i_31_ = i_30_ * i_25_ + i_29_;
				int i_32_ = 0;
				if (class87_sub2.aByteArray7115 == null) {
					byte[] is_33_ = class87_sub2.aByteArray7114;
					for (int i_34_ = 0; i_34_ < i_27_; i_34_++) {
						for (int i_35_ = 0; i_35_ < i_28_; i_35_++)
							is[i_31_++] = (byte) (is_33_[i_32_++] == 0 ? 0 : -1);
						i_31_ += i_25_ - i_28_;
					}
				} else {
					byte[] is_36_ = class87_sub2.aByteArray7115;
					for (int i_37_ = 0; i_37_ < i_27_; i_37_++) {
						for (int i_38_ = 0; i_38_ < i_28_; i_38_++)
							is[i_31_++] = is_36_[i_32_++];
						i_31_ += i_25_ - i_28_;
					}
				}
			}
			((Class263_Sub1) this).aClass36_Sub1_Sub1_7371 = Class36_Sub1_Sub1.method526(class_ra_sub1, Class72.aClass72_611, Class86.aClass86_714, i_25_, i_25_, false, is, Class72.aClass72_611);
			((Class263_Sub1) this).aBoolean7372 = true;
		} else {
			int[] is = new int[i_25_ * i_25_];
			for (int i_39_ = 0; i_39_ < 256; i_39_++) {
				Class87_Sub2 class87_sub2 = class87_sub2s[i_39_];
				int[] is_40_ = class87_sub2.anIntArray7113;
				byte[] is_41_ = class87_sub2.aByteArray7115;
				byte[] is_42_ = class87_sub2.aByteArray7114;
				int i_43_ = class87_sub2.anInt7107;
				int i_44_ = class87_sub2.anInt7112;
				int i_45_ = i_39_ % 16 * i;
				int i_46_ = i_39_ / 16 * i;
				int i_47_ = i_46_ * i_25_ + i_45_;
				int i_48_ = 0;
				if (is_41_ != null) {
					for (int i_49_ = 0; i_49_ < i_43_; i_49_++) {
						for (int i_50_ = 0; i_50_ < i_44_; i_50_++) {
							is[i_47_++] = (is_41_[i_48_] << 24 | is_40_[is_42_[i_48_] & 0xff]);
							i_48_++;
						}
						i_47_ += i_25_ - i_44_;
					}
				} else {
					for (int i_51_ = 0; i_51_ < i_43_; i_51_++) {
						for (int i_52_ = 0; i_52_ < i_44_; i_52_++) {
							int i_53_;
							if ((i_53_ = is_42_[i_48_++]) != 0)
								is[i_47_++] = ~0xffffff | is_40_[i_53_ & 0xff];
							else
								i_47_++;
						}
						i_47_ += i_25_ - i_44_;
					}
				}
			}
			((Class263_Sub1) this).aClass36_Sub1_Sub1_7371 = Class36_Sub1_Sub1.method524(class_ra_sub1, i_25_, i_25_, false, is, 0, 0);
			((Class263_Sub1) this).aBoolean7372 = false;
		}
		((Class263_Sub1) this).aClass36_Sub1_Sub1_7371.method515(false);
		((Class263_Sub1) this).aClass33_7369 = new Class33(class_ra_sub1, 256);
		float f = (((Class36_Sub1_Sub1) ((Class263_Sub1) this).aClass36_Sub1_Sub1_7371).aFloat9362 / (float) (((Class36_Sub1_Sub1) ((Class263_Sub1) this).aClass36_Sub1_Sub1_7371).anInt9363));
		float f_54_ = (((Class36_Sub1_Sub1) ((Class263_Sub1) this).aClass36_Sub1_Sub1_7371).aFloat9361 / (float) (((Class36_Sub1_Sub1) ((Class263_Sub1) this).aClass36_Sub1_Sub1_7371).anInt9360));
		for (int i_55_ = 0; i_55_ < 256; i_55_++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i_55_];
			int i_56_ = class87_sub2.anInt7107;
			int i_57_ = class87_sub2.anInt7112;
			int i_58_ = class87_sub2.anInt7111;
			int i_59_ = class87_sub2.anInt7109;
			float f_60_ = (float) (i_55_ % 16 * i);
			float f_61_ = (float) (i_55_ / 16 * i);
			float f_62_ = f_60_ * f;
			float f_63_ = f_61_ * f_54_;
			float f_64_ = (f_60_ + (float) i_57_) * f;
			float f_65_ = (f_61_ + (float) i_56_) * f_54_;
			((Class263_Sub1) this).aClass33_7369.method504(i_55_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_62_, (((Class36_Sub1_Sub1) (((Class263_Sub1) this).aClass36_Sub1_Sub1_7371)).aFloat9361 - f_63_));
			OpenGL.glVertex2i(i_59_, i_58_);
			OpenGL.glTexCoord2f(f_62_, (((Class36_Sub1_Sub1) (((Class263_Sub1) this).aClass36_Sub1_Sub1_7371)).aFloat9361 - f_65_));
			OpenGL.glVertex2i(i_59_, i_58_ + i_56_);
			OpenGL.glTexCoord2f(f_64_, (((Class36_Sub1_Sub1) (((Class263_Sub1) this).aClass36_Sub1_Sub1_7371)).aFloat9361 - f_65_));
			OpenGL.glVertex2i(i_59_ + i_57_, i_58_ + i_56_);
			OpenGL.glTexCoord2f(f_64_, (((Class36_Sub1_Sub1) (((Class263_Sub1) this).aClass36_Sub1_Sub1_7371)).aFloat9361 - f_63_));
			OpenGL.glVertex2i(i_59_ + i_57_, i_58_);
			OpenGL.glEnd();
			((Class263_Sub1) this).aClass33_7369.method502();
		}
	}

	void method2610(char c, int i, int i_66_, int i_67_, boolean bool, Class_ta class_ta, int i_68_, int i_69_) {
		Class_ta_Sub2 class_ta_sub2 = (Class_ta_Sub2) class_ta;
		Class36_Sub1_Sub1 class36_sub1_sub1 = ((Class_ta_Sub2) class_ta_sub2).aClass36_Sub1_Sub1_8660;
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4839();
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(((Class263_Sub1) this).aClass36_Sub1_Sub1_7371);
		if (((Class263_Sub1) this).aBoolean7372 || bool) {
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		} else
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 7681);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(class36_sub1_sub1);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(7681, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9362 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9363);
		float f_70_ = (((Class36_Sub1_Sub1) class36_sub1_sub1).aFloat9361 / (float) ((Class36_Sub1_Sub1) class36_sub1_sub1).anInt9360);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_68_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_70_, 0.0F, (float) -i_69_ * f_70_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_67_ >> 16), (byte) (i_67_ >> 8), (byte) i_67_, (byte) (i_67_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_66_, 0.0F);
		((Class263_Sub1) this).aClass33_7369.method503(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4831(8448, 8448);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4844(null);
		((Class263_Sub1) this).aClass_ra_Sub1_7370.method4843(0);
		if (((Class263_Sub1) this).aBoolean7372 || bool)
			((Class263_Sub1) this).aClass_ra_Sub1_7370.method4847(0, 5890, 768);
	}
}
