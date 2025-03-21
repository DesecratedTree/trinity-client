/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class27 {
	int anInt315 = 1600;
	Class330_Sub46_Sub1 aClass330_Sub46_Sub1_316;
	int anInt317 = 64;
	Class44 aClass44_318;
	Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray319;
	Class44 aClass44_320;
	int anInt321 = 64;
	int[] anIntArray322;
	int anInt323 = 768;
	int anInt324;
	float[] aFloatArray325 = new float[16];
	int[] anIntArray326;
	Class44 aClass44_327;
	Interface1 anInterface1_328;
	Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray329;
	int[] anIntArray330;
	int anInt331;
	static float aFloat332;

	void method491(Class_ra_Sub1 class_ra_sub1, Class81 class81) {
		if (((Class_ra_Sub1) class_ra_sub1).aClass249_8378 != null) {
			method493(class_ra_sub1);
			float f = (((Class_ra_Sub1) class_ra_sub1).aClass249_8378.aFloatArray2631[2]);
			float f_0_ = (((Class_ra_Sub1) class_ra_sub1).aClass249_8378.aFloatArray2631[6]);
			float f_1_ = (((Class_ra_Sub1) class_ra_sub1).aClass249_8378.aFloatArray2631[10]);
			float f_2_ = (((Class_ra_Sub1) class_ra_sub1).aClass249_8378.aFloatArray2631[14]);
			try {
				int i = 0;
				int i_3_ = 2147483647;
				int i_4_ = 0;
				Class325_Sub3 class325_sub3 = class81.aClass461_675.aClass325_Sub3_5569;
				for (Class325_Sub3 class325_sub3_5_ = class325_sub3.aClass325_Sub3_7483; class325_sub3_5_ != class325_sub3; class325_sub3_5_ = class325_sub3_5_.aClass325_Sub3_7483) {
					Class325_Sub3_Sub1 class325_sub3_sub1 = (Class325_Sub3_Sub1) class325_sub3_5_;
					int i_6_ = (int) (f * (float) (class325_sub3_sub1.anInt9497 >> 12) + f_0_ * (float) (class325_sub3_sub1.anInt9493 >> 12) + f_1_ * (float) (class325_sub3_sub1.anInt9489 >> 12) + f_2_);
					if (i_6_ > i_4_)
						i_4_ = i_6_;
					if (i_6_ < i_3_)
						i_3_ = i_6_;
					((Class27) this).anIntArray326[i++] = i_6_;
				}
				int i_7_ = i_4_ - i_3_;
				int i_8_;
				if (i_7_ + 2 > 1600) {
					i_8_ = (1 + Class64.method779(i_7_, -1147535038) - ((Class27) this).anInt324);
					i_7_ = (i_7_ >> i_8_) + 2;
				} else {
					i_8_ = 0;
					i_7_ += 2;
				}
				Class325_Sub3 class325_sub3_9_ = class325_sub3.aClass325_Sub3_7483;
				i = 0;
				int i_10_ = -2;
				boolean bool = true;
				boolean bool_11_ = true;
				while (class325_sub3_9_ != class325_sub3) {
					((Class27) this).anInt331 = 0;
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
						((Class27) this).anIntArray322[i_12_] = 0;
					for (int i_13_ = 0; i_13_ < 64; i_13_++)
						((Class27) this).anIntArray330[i_13_] = 0;
					for (/**/; class325_sub3_9_ != class325_sub3; class325_sub3_9_ = class325_sub3_9_.aClass325_Sub3_7483) {
						Class325_Sub3_Sub1 class325_sub3_sub1 = (Class325_Sub3_Sub1) class325_sub3_9_;
						if (bool_11_) {
							i_10_ = class325_sub3_sub1.anInt9492;
							bool = class325_sub3_sub1.aBoolean9496;
							bool_11_ = false;
						}
						if (i > 0 && (i_10_ != class325_sub3_sub1.anInt9492 || bool != class325_sub3_sub1.aBoolean9496)) {
							bool_11_ = true;
							break;
						}
						int i_14_ = (((Class27) this).anIntArray326[i++] - i_3_ >> i_8_);
						if (i_14_ < 1600) {
							if (((Class27) this).anIntArray322[i_14_] < 64)
								((Class27) this).aClass325_Sub3_Sub1ArrayArray329[i_14_][((Class27) this).anIntArray322[i_14_]++] = class325_sub3_sub1;
							else {
								if (((Class27) this).anIntArray322[i_14_] == 64) {
									if (((Class27) this).anInt331 == 64)
										continue;
									((Class27) this).anIntArray322[i_14_] += 1 + ((Class27) this).anInt331++;
								}
								((Class27) this).aClass325_Sub3_Sub1ArrayArray319[(((Class27) this).anIntArray322[i_14_] - 64 - 1)][((Class27) this).anIntArray330[(((Class27) this).anIntArray322[i_14_]) - 64 - 1]++] = class325_sub3_sub1;
							}
						}
					}
					if (i_10_ >= 0)
						class_ra_sub1.method4841(i_10_);
					else
						class_ra_sub1.method4841(-1);
					if (bool && (((Class_ra_Sub1) class_ra_sub1).aFloat8372 != aFloat332))
						class_ra_sub1.IA(aFloat332);
					else if (((Class_ra_Sub1) class_ra_sub1).aFloat8372 != 1.0F)
						class_ra_sub1.IA(1.0F);
					method495(class_ra_sub1, i_7_);
				}
			} catch (Exception exception) {
				/* empty */
			}
			method494(class_ra_sub1);
		}
	}

	Class27() {
		((Class27) this).aClass330_Sub46_Sub1_316 = new Class330_Sub46_Sub1(786336);
		((Class27) this).anInt321 = 64;
		((Class27) this).anInt323 = 768;
		((Class27) this).anInt315 = 1600;
		((Class27) this).anInt324 = Class64.method779(1600, -1102929761);
		((Class27) this).anInt317 = 64;
		((Class27) this).anIntArray326 = new int[8191];
		((Class27) this).anIntArray322 = new int[1600];
		((Class27) this).anIntArray330 = new int[64];
		((Class27) this).aClass325_Sub3_Sub1ArrayArray329 = new Class325_Sub3_Sub1[1600][64];
		((Class27) this).aClass325_Sub3_Sub1ArrayArray319 = new Class325_Sub3_Sub1[64][768];
		((Class27) this).anInt331 = 0;
	}

	void method492(Class_ra_Sub1 class_ra_sub1) {
		((Class27) this).anInterface1_328 = class_ra_sub1.method4835(24, null, 196584, true);
		((Class27) this).aClass44_320 = new Class44(((Class27) this).anInterface1_328, 5126, 2, 0);
		((Class27) this).aClass44_318 = new Class44(((Class27) this).anInterface1_328, 5126, 3, 8);
		((Class27) this).aClass44_327 = new Class44(((Class27) this).anInterface1_328, 5121, 4, 20);
	}

	void method493(Class_ra_Sub1 class_ra_sub1) {
		aFloat332 = ((Class_ra_Sub1) class_ra_sub1).aFloat8372;
		class_ra_sub1.method4840();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		class_ra_sub1.method4815(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method494(Class_ra_Sub1 class_ra_sub1) {
		class_ra_sub1.method4815(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (((Class_ra_Sub1) class_ra_sub1).aFloat8372 != aFloat332)
			class_ra_sub1.IA(aFloat332);
	}

	void method495(Class_ra_Sub1 class_ra_sub1, int i) {
		OpenGL.glGetFloatv(2982, ((Class27) this).aFloatArray325, 0);
		float f = ((Class27) this).aFloatArray325[0];
		float f_15_ = ((Class27) this).aFloatArray325[4];
		float f_16_ = ((Class27) this).aFloatArray325[8];
		float f_17_ = ((Class27) this).aFloatArray325[1];
		float f_18_ = ((Class27) this).aFloatArray325[5];
		float f_19_ = ((Class27) this).aFloatArray325[9];
		float f_20_ = f + f_17_;
		float f_21_ = f_15_ + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f - f_17_;
		float f_24_ = f_15_ - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f;
		float f_27_ = f_18_ - f_15_;
		float f_28_ = f_19_ - f_16_;
		((Class27) this).aClass330_Sub46_Sub1_316.offset = 0;
		if (((Class_ra_Sub1) class_ra_sub1).aBoolean8407) {
			for (int i_29_ = i - 1; i_29_ >= 0; i_29_--) {
				int i_30_ = (((Class27) this).anIntArray322[i_29_] > 64 ? 64 : ((Class27) this).anIntArray322[i_29_]);
				if (i_30_ > 0) {
					for (int i_31_ = i_30_ - 1; i_31_ >= 0; i_31_--) {
						Class325_Sub3_Sub1 class325_sub3_sub1 = (((Class27) this).aClass325_Sub3_Sub1ArrayArray329[i_29_][i_31_]);
						int i_32_ = class325_sub3_sub1.anInt9490;
						byte i_33_ = (byte) (i_32_ >> 16);
						byte i_34_ = (byte) (i_32_ >> 8);
						byte i_35_ = (byte) i_32_;
						byte i_36_ = (byte) (i_32_ >>> 24);
						float f_37_ = (float) (class325_sub3_sub1.anInt9497 >> 12);
						float f_38_ = (float) (class325_sub3_sub1.anInt9493 >> 12);
						float f_39_ = (float) (class325_sub3_sub1.anInt9489 >> 12);
						int i_40_ = class325_sub3_sub1.anInt9494 >> 12;
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_37_ + f_20_ * (float) -i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_38_ + f_21_ * (float) -i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_39_ + f_22_ * (float) -i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_33_, (byte) 1);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_34_, (byte) 50);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_35_, (byte) 125);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_36_, (byte) 32);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_37_ + f_26_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_38_ + f_27_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_39_ + f_28_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_33_, (byte) 111);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_34_, (byte) 10);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_35_, (byte) 85);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_36_, (byte) 35);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_37_ + f_20_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_38_ + f_21_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_39_ + f_22_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_33_, (byte) 45);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_34_, (byte) 125);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_35_, (byte) 21);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_36_, (byte) 125);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_37_ + f_23_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_38_ + f_24_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_39_ + f_25_ * (float) i_40_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_33_, (byte) 68);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_34_, (byte) 39);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_35_, (byte) 11);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_36_, (byte) 23);
					}
					if (((Class27) this).anIntArray322[i_29_] > 64) {
						int i_41_ = ((Class27) this).anIntArray322[i_29_] - 64 - 1;
						for (int i_42_ = ((Class27) this).anIntArray330[i_41_] - 1; i_42_ >= 0; i_42_--) {
							Class325_Sub3_Sub1 class325_sub3_sub1 = (((Class27) this).aClass325_Sub3_Sub1ArrayArray319[i_41_][i_42_]);
							int i_43_ = class325_sub3_sub1.anInt9490;
							byte i_44_ = (byte) (i_43_ >> 16);
							byte i_45_ = (byte) (i_43_ >> 8);
							byte i_46_ = (byte) i_43_;
							byte i_47_ = (byte) (i_43_ >>> 24);
							float f_48_ = (float) (class325_sub3_sub1.anInt9497 >> 12);
							float f_49_ = (float) (class325_sub3_sub1.anInt9493 >> 12);
							float f_50_ = (float) (class325_sub3_sub1.anInt9489 >> 12);
							int i_51_ = class325_sub3_sub1.anInt9494 >> 12;
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_48_ + f_20_ * (float) -i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_49_ + f_21_ * (float) -i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_50_ + f_22_ * (float) -i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_44_, (byte) 110);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_45_, (byte) 77);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_46_, (byte) 49);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_47_, (byte) 53);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_48_ + f_26_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_49_ + f_27_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_50_ + f_28_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_44_, (byte) 13);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_45_, (byte) 46);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_46_, (byte) 46);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_47_, (byte) 64);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_48_ + f_20_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_49_ + f_21_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_50_ + f_22_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_44_, (byte) 73);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_45_, (byte) 73);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_46_, (byte) 25);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_47_, (byte) 68);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_48_ + f_23_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_49_ + f_24_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3819(f_50_ + f_25_ * (float) i_51_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_44_, (byte) 109);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_45_, (byte) 33);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_46_, (byte) 54);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_47_, (byte) 15);
						}
					}
				}
			}
		} else {
			for (int i_52_ = i - 1; i_52_ >= 0; i_52_--) {
				int i_53_ = (((Class27) this).anIntArray322[i_52_] > 64 ? 64 : ((Class27) this).anIntArray322[i_52_]);
				if (i_53_ > 0) {
					for (int i_54_ = i_53_ - 1; i_54_ >= 0; i_54_--) {
						Class325_Sub3_Sub1 class325_sub3_sub1 = (((Class27) this).aClass325_Sub3_Sub1ArrayArray329[i_52_][i_54_]);
						int i_55_ = class325_sub3_sub1.anInt9490;
						byte i_56_ = (byte) (i_55_ >> 16);
						byte i_57_ = (byte) (i_55_ >> 8);
						byte i_58_ = (byte) i_55_;
						byte i_59_ = (byte) (i_55_ >>> 24);
						float f_60_ = (float) (class325_sub3_sub1.anInt9497 >> 12);
						float f_61_ = (float) (class325_sub3_sub1.anInt9493 >> 12);
						float f_62_ = (float) (class325_sub3_sub1.anInt9489 >> 12);
						int i_63_ = class325_sub3_sub1.anInt9494 >> 12;
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_60_ + f_20_ * (float) -i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_61_ + f_21_ * (float) -i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_62_ + f_22_ * (float) -i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_56_, (byte) 107);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_57_, (byte) 3);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_58_, (byte) 38);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_59_, (byte) 22);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_60_ + f_26_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_61_ + f_27_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_62_ + f_28_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_56_, (byte) 34);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_57_, (byte) 122);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_58_, (byte) 66);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_59_, (byte) 51);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_60_ + f_20_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_61_ + f_21_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_62_ + f_22_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_56_, (byte) 79);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_57_, (byte) 55);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_58_, (byte) 38);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_59_, (byte) 90);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_60_ + f_23_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_61_ + f_24_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_62_ + f_25_ * (float) i_63_);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_56_, (byte) 88);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_57_, (byte) 95);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_58_, (byte) 92);
						((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_59_, (byte) 9);
					}
					if (((Class27) this).anIntArray322[i_52_] > 64) {
						int i_64_ = ((Class27) this).anIntArray322[i_52_] - 64 - 1;
						for (int i_65_ = ((Class27) this).anIntArray330[i_64_] - 1; i_65_ >= 0; i_65_--) {
							Class325_Sub3_Sub1 class325_sub3_sub1 = (((Class27) this).aClass325_Sub3_Sub1ArrayArray319[i_64_][i_65_]);
							int i_66_ = class325_sub3_sub1.anInt9490;
							byte i_67_ = (byte) (i_66_ >> 16);
							byte i_68_ = (byte) (i_66_ >> 8);
							byte i_69_ = (byte) i_66_;
							byte i_70_ = (byte) (i_66_ >>> 24);
							float f_71_ = (float) (class325_sub3_sub1.anInt9497 >> 12);
							float f_72_ = (float) (class325_sub3_sub1.anInt9493 >> 12);
							float f_73_ = (float) (class325_sub3_sub1.anInt9489 >> 12);
							int i_74_ = class325_sub3_sub1.anInt9494 >> 12;
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_71_ + f_20_ * (float) -i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_72_ + f_21_ * (float) -i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_73_ + f_22_ * (float) -i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_67_, (byte) 32);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_68_, (byte) 73);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_69_, (byte) 15);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_70_, (byte) 61);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_71_ + f_26_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_72_ + f_27_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_73_ + f_28_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_67_, (byte) 39);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_68_, (byte) 46);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_69_, (byte) 70);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_70_, (byte) 33);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_71_ + f_20_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_72_ + f_21_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_73_ + f_22_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_67_, (byte) 32);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_68_, (byte) 48);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_69_, (byte) 47);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_70_, (byte) 103);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(1.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(0.0F);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_71_ + f_23_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_72_ + f_24_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.method3818(f_73_ + f_25_ * (float) i_74_);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_67_, (byte) 41);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_68_, (byte) 112);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_69_, (byte) 109);
							((Class27) this).aClass330_Sub46_Sub1_316.addByte(i_70_, (byte) 26);
						}
					}
				}
			}
		}
		if (((Class27) this).aClass330_Sub46_Sub1_316.offset * -824785231 != 0) {
			((Class27) this).anInterface1_328.method12(24, ((Class27) this).aClass330_Sub46_Sub1_316.payload, (((Class27) this).aClass330_Sub46_Sub1_316.offset * -824785231));
			class_ra_sub1.method4869(((Class27) this).aClass44_318, null, ((Class27) this).aClass44_327, ((Class27) this).aClass44_320);
			class_ra_sub1.method4881(7, 0, (((Class27) this).aClass330_Sub46_Sub1_316.offset) * -824785231 / 24);
		}
	}
}
