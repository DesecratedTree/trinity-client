/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class249 {
	public static Class249 aClass249_2630 = new Class249();
	public float[] aFloatArray2631;

	public Class249(Class249 class249_0_) {
		aFloatArray2631 = new float[16];
		method2510(class249_0_);
	}

	public void method2482(float[] fs) {
		float f = fs[0];
		float f_1_ = fs[1];
		float f_2_ = fs[2];
		fs[0] = (aFloatArray2631[0] * f + aFloatArray2631[4] * f_1_ + aFloatArray2631[8] * f_2_ + aFloatArray2631[12]);
		fs[1] = (aFloatArray2631[1] * f + aFloatArray2631[5] * f_1_ + aFloatArray2631[9] * f_2_ + aFloatArray2631[13]);
		fs[2] = (aFloatArray2631[2] * f + aFloatArray2631[6] * f_1_ + aFloatArray2631[10] * f_2_ + aFloatArray2631[14]);
	}

	public void method2483(Class249 class249_3_) {
		float f = (aFloatArray2631[0] * class249_3_.aFloatArray2631[0] + aFloatArray2631[1] * class249_3_.aFloatArray2631[4] + aFloatArray2631[2] * class249_3_.aFloatArray2631[8] + aFloatArray2631[3] * class249_3_.aFloatArray2631[12]);
		float f_4_ = (aFloatArray2631[0] * class249_3_.aFloatArray2631[1] + aFloatArray2631[1] * class249_3_.aFloatArray2631[5] + aFloatArray2631[2] * class249_3_.aFloatArray2631[9] + aFloatArray2631[3] * class249_3_.aFloatArray2631[13]);
		float f_5_ = (aFloatArray2631[0] * class249_3_.aFloatArray2631[2] + aFloatArray2631[1] * class249_3_.aFloatArray2631[6] + aFloatArray2631[2] * class249_3_.aFloatArray2631[10] + aFloatArray2631[3] * class249_3_.aFloatArray2631[14]);
		float f_6_ = (aFloatArray2631[0] * class249_3_.aFloatArray2631[3] + aFloatArray2631[1] * class249_3_.aFloatArray2631[7] + aFloatArray2631[2] * class249_3_.aFloatArray2631[11] + aFloatArray2631[3] * class249_3_.aFloatArray2631[15]);
		float f_7_ = (aFloatArray2631[4] * class249_3_.aFloatArray2631[0] + aFloatArray2631[5] * class249_3_.aFloatArray2631[4] + aFloatArray2631[6] * class249_3_.aFloatArray2631[8] + aFloatArray2631[7] * class249_3_.aFloatArray2631[12]);
		float f_8_ = (aFloatArray2631[4] * class249_3_.aFloatArray2631[1] + aFloatArray2631[5] * class249_3_.aFloatArray2631[5] + aFloatArray2631[6] * class249_3_.aFloatArray2631[9] + aFloatArray2631[7] * class249_3_.aFloatArray2631[13]);
		float f_9_ = (aFloatArray2631[4] * class249_3_.aFloatArray2631[2] + aFloatArray2631[5] * class249_3_.aFloatArray2631[6] + aFloatArray2631[6] * class249_3_.aFloatArray2631[10] + aFloatArray2631[7] * class249_3_.aFloatArray2631[14]);
		float f_10_ = (aFloatArray2631[4] * class249_3_.aFloatArray2631[3] + aFloatArray2631[5] * class249_3_.aFloatArray2631[7] + aFloatArray2631[6] * class249_3_.aFloatArray2631[11] + aFloatArray2631[7] * class249_3_.aFloatArray2631[15]);
		float f_11_ = (aFloatArray2631[8] * class249_3_.aFloatArray2631[0] + aFloatArray2631[9] * class249_3_.aFloatArray2631[4] + aFloatArray2631[10] * class249_3_.aFloatArray2631[8] + aFloatArray2631[11] * class249_3_.aFloatArray2631[12]);
		float f_12_ = (aFloatArray2631[8] * class249_3_.aFloatArray2631[1] + aFloatArray2631[9] * class249_3_.aFloatArray2631[5] + aFloatArray2631[10] * class249_3_.aFloatArray2631[9] + aFloatArray2631[11] * class249_3_.aFloatArray2631[13]);
		float f_13_ = (aFloatArray2631[8] * class249_3_.aFloatArray2631[2] + aFloatArray2631[9] * class249_3_.aFloatArray2631[6] + aFloatArray2631[10] * class249_3_.aFloatArray2631[10] + aFloatArray2631[11] * class249_3_.aFloatArray2631[14]);
		float f_14_ = (aFloatArray2631[8] * class249_3_.aFloatArray2631[3] + aFloatArray2631[9] * class249_3_.aFloatArray2631[7] + aFloatArray2631[10] * class249_3_.aFloatArray2631[11] + aFloatArray2631[11] * class249_3_.aFloatArray2631[15]);
		float f_15_ = (aFloatArray2631[12] * class249_3_.aFloatArray2631[0] + aFloatArray2631[13] * class249_3_.aFloatArray2631[4] + aFloatArray2631[14] * class249_3_.aFloatArray2631[8] + aFloatArray2631[15] * class249_3_.aFloatArray2631[12]);
		float f_16_ = (aFloatArray2631[12] * class249_3_.aFloatArray2631[1] + aFloatArray2631[13] * class249_3_.aFloatArray2631[5] + aFloatArray2631[14] * class249_3_.aFloatArray2631[9] + aFloatArray2631[15] * class249_3_.aFloatArray2631[13]);
		float f_17_ = (aFloatArray2631[12] * class249_3_.aFloatArray2631[2] + aFloatArray2631[13] * class249_3_.aFloatArray2631[6] + aFloatArray2631[14] * class249_3_.aFloatArray2631[10] + aFloatArray2631[15] * class249_3_.aFloatArray2631[14]);
		float f_18_ = (aFloatArray2631[12] * class249_3_.aFloatArray2631[3] + aFloatArray2631[13] * class249_3_.aFloatArray2631[7] + aFloatArray2631[14] * class249_3_.aFloatArray2631[11] + aFloatArray2631[15] * class249_3_.aFloatArray2631[15]);
		aFloatArray2631[0] = f;
		aFloatArray2631[1] = f_4_;
		aFloatArray2631[2] = f_5_;
		aFloatArray2631[3] = f_6_;
		aFloatArray2631[4] = f_7_;
		aFloatArray2631[5] = f_8_;
		aFloatArray2631[6] = f_9_;
		aFloatArray2631[7] = f_10_;
		aFloatArray2631[8] = f_11_;
		aFloatArray2631[9] = f_12_;
		aFloatArray2631[10] = f_13_;
		aFloatArray2631[11] = f_14_;
		aFloatArray2631[12] = f_15_;
		aFloatArray2631[13] = f_16_;
		aFloatArray2631[14] = f_17_;
		aFloatArray2631[15] = f_18_;
	}

	public void method2484(Class249 class249_19_, Class249 class249_20_) {
		float f = ((class249_19_.aFloatArray2631[0] * class249_20_.aFloatArray2631[0]) + (class249_19_.aFloatArray2631[1] * class249_20_.aFloatArray2631[4]) + (class249_19_.aFloatArray2631[2] * class249_20_.aFloatArray2631[8]) + (class249_19_.aFloatArray2631[3] * class249_20_.aFloatArray2631[12]));
		float f_21_ = ((class249_19_.aFloatArray2631[0] * class249_20_.aFloatArray2631[1]) + (class249_19_.aFloatArray2631[1] * class249_20_.aFloatArray2631[5]) + (class249_19_.aFloatArray2631[2] * class249_20_.aFloatArray2631[9]) + (class249_19_.aFloatArray2631[3] * class249_20_.aFloatArray2631[13]));
		float f_22_ = ((class249_19_.aFloatArray2631[0] * class249_20_.aFloatArray2631[2]) + (class249_19_.aFloatArray2631[1] * class249_20_.aFloatArray2631[6]) + (class249_19_.aFloatArray2631[2] * class249_20_.aFloatArray2631[10]) + (class249_19_.aFloatArray2631[3] * class249_20_.aFloatArray2631[14]));
		float f_23_ = ((class249_19_.aFloatArray2631[0] * class249_20_.aFloatArray2631[3]) + (class249_19_.aFloatArray2631[1] * class249_20_.aFloatArray2631[7]) + (class249_19_.aFloatArray2631[2] * class249_20_.aFloatArray2631[11]) + (class249_19_.aFloatArray2631[3] * class249_20_.aFloatArray2631[15]));
		float f_24_ = ((class249_19_.aFloatArray2631[4] * class249_20_.aFloatArray2631[0]) + (class249_19_.aFloatArray2631[5] * class249_20_.aFloatArray2631[4]) + (class249_19_.aFloatArray2631[6] * class249_20_.aFloatArray2631[8]) + (class249_19_.aFloatArray2631[7] * class249_20_.aFloatArray2631[12]));
		float f_25_ = ((class249_19_.aFloatArray2631[4] * class249_20_.aFloatArray2631[1]) + (class249_19_.aFloatArray2631[5] * class249_20_.aFloatArray2631[5]) + (class249_19_.aFloatArray2631[6] * class249_20_.aFloatArray2631[9]) + (class249_19_.aFloatArray2631[7] * class249_20_.aFloatArray2631[13]));
		float f_26_ = ((class249_19_.aFloatArray2631[4] * class249_20_.aFloatArray2631[2]) + (class249_19_.aFloatArray2631[5] * class249_20_.aFloatArray2631[6]) + (class249_19_.aFloatArray2631[6] * class249_20_.aFloatArray2631[10]) + (class249_19_.aFloatArray2631[7] * class249_20_.aFloatArray2631[14]));
		float f_27_ = ((class249_19_.aFloatArray2631[4] * class249_20_.aFloatArray2631[3]) + (class249_19_.aFloatArray2631[5] * class249_20_.aFloatArray2631[7]) + (class249_19_.aFloatArray2631[6] * class249_20_.aFloatArray2631[11]) + (class249_19_.aFloatArray2631[7] * class249_20_.aFloatArray2631[15]));
		float f_28_ = ((class249_19_.aFloatArray2631[8] * class249_20_.aFloatArray2631[0]) + (class249_19_.aFloatArray2631[9] * class249_20_.aFloatArray2631[4]) + (class249_19_.aFloatArray2631[10] * class249_20_.aFloatArray2631[8]) + (class249_19_.aFloatArray2631[11] * class249_20_.aFloatArray2631[12]));
		float f_29_ = ((class249_19_.aFloatArray2631[8] * class249_20_.aFloatArray2631[1]) + (class249_19_.aFloatArray2631[9] * class249_20_.aFloatArray2631[5]) + (class249_19_.aFloatArray2631[10] * class249_20_.aFloatArray2631[9]) + (class249_19_.aFloatArray2631[11] * class249_20_.aFloatArray2631[13]));
		float f_30_ = ((class249_19_.aFloatArray2631[8] * class249_20_.aFloatArray2631[2]) + (class249_19_.aFloatArray2631[9] * class249_20_.aFloatArray2631[6]) + (class249_19_.aFloatArray2631[10] * class249_20_.aFloatArray2631[10]) + (class249_19_.aFloatArray2631[11] * class249_20_.aFloatArray2631[14]));
		float f_31_ = ((class249_19_.aFloatArray2631[8] * class249_20_.aFloatArray2631[3]) + (class249_19_.aFloatArray2631[9] * class249_20_.aFloatArray2631[7]) + (class249_19_.aFloatArray2631[10] * class249_20_.aFloatArray2631[11]) + (class249_19_.aFloatArray2631[11] * class249_20_.aFloatArray2631[15]));
		float f_32_ = ((class249_19_.aFloatArray2631[12] * class249_20_.aFloatArray2631[0]) + (class249_19_.aFloatArray2631[13] * class249_20_.aFloatArray2631[4]) + (class249_19_.aFloatArray2631[14] * class249_20_.aFloatArray2631[8]) + (class249_19_.aFloatArray2631[15] * class249_20_.aFloatArray2631[12]));
		float f_33_ = ((class249_19_.aFloatArray2631[12] * class249_20_.aFloatArray2631[1]) + (class249_19_.aFloatArray2631[13] * class249_20_.aFloatArray2631[5]) + (class249_19_.aFloatArray2631[14] * class249_20_.aFloatArray2631[9]) + (class249_19_.aFloatArray2631[15] * class249_20_.aFloatArray2631[13]));
		float f_34_ = ((class249_19_.aFloatArray2631[12] * class249_20_.aFloatArray2631[2]) + (class249_19_.aFloatArray2631[13] * class249_20_.aFloatArray2631[6]) + (class249_19_.aFloatArray2631[14] * class249_20_.aFloatArray2631[10]) + (class249_19_.aFloatArray2631[15] * class249_20_.aFloatArray2631[14]));
		float f_35_ = ((class249_19_.aFloatArray2631[12] * class249_20_.aFloatArray2631[3]) + (class249_19_.aFloatArray2631[13] * class249_20_.aFloatArray2631[7]) + (class249_19_.aFloatArray2631[14] * class249_20_.aFloatArray2631[11]) + (class249_19_.aFloatArray2631[15] * class249_20_.aFloatArray2631[15]));
		aFloatArray2631[0] = f;
		aFloatArray2631[1] = f_21_;
		aFloatArray2631[2] = f_22_;
		aFloatArray2631[3] = f_23_;
		aFloatArray2631[4] = f_24_;
		aFloatArray2631[5] = f_25_;
		aFloatArray2631[6] = f_26_;
		aFloatArray2631[7] = f_27_;
		aFloatArray2631[8] = f_28_;
		aFloatArray2631[9] = f_29_;
		aFloatArray2631[10] = f_30_;
		aFloatArray2631[11] = f_31_;
		aFloatArray2631[12] = f_32_;
		aFloatArray2631[13] = f_33_;
		aFloatArray2631[14] = f_34_;
		aFloatArray2631[15] = f_35_;
	}

	public Class249() {
		aFloatArray2631 = new float[16];
		method2516();
	}

	public void method2485() {
		float f = 1.0F / method2513();
		float f_36_ = (aFloatArray2631[5] * aFloatArray2631[10] * aFloatArray2631[15] - aFloatArray2631[5] * aFloatArray2631[11] * aFloatArray2631[14] - aFloatArray2631[6] * aFloatArray2631[9] * aFloatArray2631[15] + aFloatArray2631[6] * aFloatArray2631[11] * aFloatArray2631[13] + aFloatArray2631[7] * aFloatArray2631[9] * aFloatArray2631[14] - (aFloatArray2631[7] * aFloatArray2631[10] * aFloatArray2631[13])) * f;
		float f_37_ = (-aFloatArray2631[1] * aFloatArray2631[10] * aFloatArray2631[15] + aFloatArray2631[1] * aFloatArray2631[11] * aFloatArray2631[14] + aFloatArray2631[2] * aFloatArray2631[9] * aFloatArray2631[15] - aFloatArray2631[2] * aFloatArray2631[11] * aFloatArray2631[13] - aFloatArray2631[3] * aFloatArray2631[9] * aFloatArray2631[14] + (aFloatArray2631[3] * aFloatArray2631[10] * aFloatArray2631[13])) * f;
		float f_38_ = ((aFloatArray2631[1] * aFloatArray2631[6] * aFloatArray2631[15] - aFloatArray2631[1] * aFloatArray2631[7] * aFloatArray2631[14] - aFloatArray2631[2] * aFloatArray2631[5] * aFloatArray2631[15] + aFloatArray2631[2] * aFloatArray2631[7] * aFloatArray2631[13] + aFloatArray2631[3] * aFloatArray2631[5] * aFloatArray2631[14] - (aFloatArray2631[3] * aFloatArray2631[6] * aFloatArray2631[13])) * f);
		float f_39_ = ((-aFloatArray2631[1] * aFloatArray2631[6] * aFloatArray2631[11] + aFloatArray2631[1] * aFloatArray2631[7] * aFloatArray2631[10] + aFloatArray2631[2] * aFloatArray2631[5] * aFloatArray2631[11] - aFloatArray2631[2] * aFloatArray2631[7] * aFloatArray2631[9] - aFloatArray2631[3] * aFloatArray2631[5] * aFloatArray2631[10] + aFloatArray2631[3] * aFloatArray2631[6] * aFloatArray2631[9]) * f);
		float f_40_ = (-aFloatArray2631[4] * aFloatArray2631[10] * aFloatArray2631[15] + aFloatArray2631[4] * aFloatArray2631[11] * aFloatArray2631[14] + aFloatArray2631[6] * aFloatArray2631[8] * aFloatArray2631[15] - aFloatArray2631[6] * aFloatArray2631[11] * aFloatArray2631[12] - aFloatArray2631[7] * aFloatArray2631[8] * aFloatArray2631[14] + (aFloatArray2631[7] * aFloatArray2631[10] * aFloatArray2631[12])) * f;
		float f_41_ = (aFloatArray2631[0] * aFloatArray2631[10] * aFloatArray2631[15] - aFloatArray2631[0] * aFloatArray2631[11] * aFloatArray2631[14] - aFloatArray2631[2] * aFloatArray2631[8] * aFloatArray2631[15] + aFloatArray2631[2] * aFloatArray2631[11] * aFloatArray2631[12] + aFloatArray2631[3] * aFloatArray2631[8] * aFloatArray2631[14] - (aFloatArray2631[3] * aFloatArray2631[10] * aFloatArray2631[12])) * f;
		float f_42_ = ((-aFloatArray2631[0] * aFloatArray2631[6] * aFloatArray2631[15] + aFloatArray2631[0] * aFloatArray2631[7] * aFloatArray2631[14] + aFloatArray2631[2] * aFloatArray2631[4] * aFloatArray2631[15] - aFloatArray2631[2] * aFloatArray2631[7] * aFloatArray2631[12] - aFloatArray2631[3] * aFloatArray2631[4] * aFloatArray2631[14] + (aFloatArray2631[3] * aFloatArray2631[6] * aFloatArray2631[12])) * f);
		float f_43_ = ((aFloatArray2631[0] * aFloatArray2631[6] * aFloatArray2631[11] - aFloatArray2631[0] * aFloatArray2631[7] * aFloatArray2631[10] - aFloatArray2631[2] * aFloatArray2631[4] * aFloatArray2631[11] + aFloatArray2631[2] * aFloatArray2631[7] * aFloatArray2631[8] + aFloatArray2631[3] * aFloatArray2631[4] * aFloatArray2631[10] - aFloatArray2631[3] * aFloatArray2631[6] * aFloatArray2631[8]) * f);
		float f_44_ = (aFloatArray2631[4] * aFloatArray2631[9] * aFloatArray2631[15] - aFloatArray2631[4] * aFloatArray2631[11] * aFloatArray2631[13] - aFloatArray2631[5] * aFloatArray2631[8] * aFloatArray2631[15] + aFloatArray2631[5] * aFloatArray2631[11] * aFloatArray2631[12] + aFloatArray2631[7] * aFloatArray2631[8] * aFloatArray2631[13] - (aFloatArray2631[7] * aFloatArray2631[9] * aFloatArray2631[12])) * f;
		float f_45_ = (-aFloatArray2631[0] * aFloatArray2631[9] * aFloatArray2631[15] + aFloatArray2631[0] * aFloatArray2631[11] * aFloatArray2631[13] + aFloatArray2631[1] * aFloatArray2631[8] * aFloatArray2631[15] - aFloatArray2631[1] * aFloatArray2631[11] * aFloatArray2631[12] - aFloatArray2631[3] * aFloatArray2631[8] * aFloatArray2631[13] + (aFloatArray2631[3] * aFloatArray2631[9] * aFloatArray2631[12])) * f;
		float f_46_ = ((aFloatArray2631[0] * aFloatArray2631[5] * aFloatArray2631[15] - aFloatArray2631[0] * aFloatArray2631[7] * aFloatArray2631[13] - aFloatArray2631[1] * aFloatArray2631[4] * aFloatArray2631[15] + aFloatArray2631[1] * aFloatArray2631[7] * aFloatArray2631[12] + aFloatArray2631[3] * aFloatArray2631[4] * aFloatArray2631[13] - (aFloatArray2631[3] * aFloatArray2631[5] * aFloatArray2631[12])) * f);
		float f_47_ = ((-aFloatArray2631[0] * aFloatArray2631[5] * aFloatArray2631[11] + aFloatArray2631[0] * aFloatArray2631[7] * aFloatArray2631[9] + aFloatArray2631[1] * aFloatArray2631[4] * aFloatArray2631[11] - aFloatArray2631[1] * aFloatArray2631[7] * aFloatArray2631[8] - aFloatArray2631[3] * aFloatArray2631[4] * aFloatArray2631[9] + aFloatArray2631[3] * aFloatArray2631[5] * aFloatArray2631[8]) * f);
		float f_48_ = (-aFloatArray2631[4] * aFloatArray2631[9] * aFloatArray2631[14] + aFloatArray2631[4] * aFloatArray2631[10] * aFloatArray2631[13] + aFloatArray2631[5] * aFloatArray2631[8] * aFloatArray2631[14] - aFloatArray2631[5] * aFloatArray2631[10] * aFloatArray2631[12] - aFloatArray2631[6] * aFloatArray2631[8] * aFloatArray2631[13] + (aFloatArray2631[6] * aFloatArray2631[9] * aFloatArray2631[12])) * f;
		float f_49_ = (aFloatArray2631[0] * aFloatArray2631[9] * aFloatArray2631[14] - aFloatArray2631[0] * aFloatArray2631[10] * aFloatArray2631[13] - aFloatArray2631[1] * aFloatArray2631[8] * aFloatArray2631[14] + aFloatArray2631[1] * aFloatArray2631[10] * aFloatArray2631[12] + aFloatArray2631[2] * aFloatArray2631[8] * aFloatArray2631[13] - (aFloatArray2631[2] * aFloatArray2631[9] * aFloatArray2631[12])) * f;
		float f_50_ = ((-aFloatArray2631[0] * aFloatArray2631[5] * aFloatArray2631[14] + aFloatArray2631[0] * aFloatArray2631[6] * aFloatArray2631[13] + aFloatArray2631[1] * aFloatArray2631[4] * aFloatArray2631[14] - aFloatArray2631[1] * aFloatArray2631[6] * aFloatArray2631[12] - aFloatArray2631[2] * aFloatArray2631[4] * aFloatArray2631[13] + (aFloatArray2631[2] * aFloatArray2631[5] * aFloatArray2631[12])) * f);
		float f_51_ = ((aFloatArray2631[0] * aFloatArray2631[5] * aFloatArray2631[10] - aFloatArray2631[0] * aFloatArray2631[6] * aFloatArray2631[9] - aFloatArray2631[1] * aFloatArray2631[4] * aFloatArray2631[10] + aFloatArray2631[1] * aFloatArray2631[6] * aFloatArray2631[8] + aFloatArray2631[2] * aFloatArray2631[4] * aFloatArray2631[9] - aFloatArray2631[2] * aFloatArray2631[5] * aFloatArray2631[8]) * f);
		aFloatArray2631[0] = f_36_;
		aFloatArray2631[1] = f_37_;
		aFloatArray2631[2] = f_38_;
		aFloatArray2631[3] = f_39_;
		aFloatArray2631[4] = f_40_;
		aFloatArray2631[5] = f_41_;
		aFloatArray2631[6] = f_42_;
		aFloatArray2631[7] = f_43_;
		aFloatArray2631[8] = f_44_;
		aFloatArray2631[9] = f_45_;
		aFloatArray2631[10] = f_46_;
		aFloatArray2631[11] = f_47_;
		aFloatArray2631[12] = f_48_;
		aFloatArray2631[13] = f_49_;
		aFloatArray2631[14] = f_50_;
		aFloatArray2631[15] = f_51_;
	}

	public void method2486(float f, float f_52_, float f_53_, float f_54_) {
		aFloatArray2631[0] = f;
		aFloatArray2631[1] = 0.0F;
		aFloatArray2631[2] = 0.0F;
		aFloatArray2631[3] = 0.0F;
		aFloatArray2631[4] = 0.0F;
		aFloatArray2631[5] = f_52_;
		aFloatArray2631[6] = 0.0F;
		aFloatArray2631[7] = 0.0F;
		aFloatArray2631[8] = 0.0F;
		aFloatArray2631[9] = 0.0F;
		aFloatArray2631[10] = f_53_;
		aFloatArray2631[11] = 0.0F;
		aFloatArray2631[12] = 0.0F;
		aFloatArray2631[13] = 0.0F;
		aFloatArray2631[14] = 0.0F;
		aFloatArray2631[15] = f_54_;
	}

	public boolean method2487() {
		return (aFloatArray2631[0] == 1.0F && aFloatArray2631[1] == 0.0F && aFloatArray2631[2] == 0.0F && aFloatArray2631[3] == 0.0F && aFloatArray2631[4] == 0.0F && aFloatArray2631[5] == 1.0F && aFloatArray2631[6] == 0.0F && aFloatArray2631[7] == 0.0F && aFloatArray2631[8] == 0.0F && aFloatArray2631[9] == 0.0F && aFloatArray2631[10] == 1.0F && aFloatArray2631[11] == 0.0F && aFloatArray2631[12] == 0.0F && aFloatArray2631[13] == 0.0F && aFloatArray2631[14] == 0.0F && aFloatArray2631[15] == 1.0F);
	}

	public void method2488(float f, float f_55_, float f_56_, float[] fs) {
		fs[0] = (aFloatArray2631[0] * f + aFloatArray2631[4] * f_55_ + aFloatArray2631[8] * f_56_);
		fs[1] = (aFloatArray2631[1] * f + aFloatArray2631[5] * f_55_ + aFloatArray2631[9] * f_56_);
		fs[2] = (aFloatArray2631[2] * f + aFloatArray2631[6] * f_55_ + aFloatArray2631[10] * f_56_);
		if (fs.length > 3)
			fs[3] = (aFloatArray2631[3] * f + aFloatArray2631[7] * f_55_ + aFloatArray2631[11] * f_56_);
	}

	public void method2489(float f, float f_57_, float f_58_, float f_59_, float f_60_, float f_61_) {
		aFloatArray2631[0] = 2.0F / (f_57_ - f);
		aFloatArray2631[1] = 0.0F;
		aFloatArray2631[2] = 0.0F;
		aFloatArray2631[3] = 0.0F;
		aFloatArray2631[4] = 0.0F;
		aFloatArray2631[5] = 2.0F / (f_59_ - f_58_);
		aFloatArray2631[6] = 0.0F;
		aFloatArray2631[7] = 0.0F;
		aFloatArray2631[8] = 0.0F;
		aFloatArray2631[9] = 0.0F;
		aFloatArray2631[10] = 2.0F / (f_61_ - f_60_);
		aFloatArray2631[11] = 0.0F;
		aFloatArray2631[12] = -(f_57_ + f) / (f_57_ - f);
		aFloatArray2631[13] = -(f_59_ + f_58_) / (f_59_ - f_58_);
		aFloatArray2631[14] = -(f_61_ + f_60_) / (f_61_ - f_60_);
		aFloatArray2631[15] = 1.0F;
	}

	public void method2490(float f, float f_62_, float f_63_, float f_64_) {
		float f_65_ = (float) (Math.tan((double) (f_63_ / 2.0F)) * (double) f);
		float f_66_ = (float) (Math.tan((double) (f_64_ / 2.0F)) * (double) f);
		method2492(-f_65_, f_65_, -f_66_, f_66_, f, f_62_);
	}

	public void method2491(float f, float f_67_, float f_68_) {
		method2489(-10000.0F / f_68_, 10000.0F / f_68_, -10000.0F / f_68_, 10000.0F / f_68_, f, f_67_);
	}

	void method2492(float f, float f_69_, float f_70_, float f_71_, float f_72_, float f_73_) {
		aFloatArray2631[0] = 2.0F * f_72_ / (f_69_ - f);
		aFloatArray2631[1] = 0.0F;
		aFloatArray2631[2] = 0.0F;
		aFloatArray2631[3] = 0.0F;
		aFloatArray2631[4] = 0.0F;
		aFloatArray2631[5] = 2.0F * f_72_ / (f_71_ - f_70_);
		aFloatArray2631[6] = 0.0F;
		aFloatArray2631[7] = 0.0F;
		aFloatArray2631[8] = (f_69_ + f) / (f_69_ - f);
		aFloatArray2631[9] = (f_71_ + f_70_) / (f_71_ - f_70_);
		aFloatArray2631[10] = (f_73_ + f_72_) / (f_73_ - f_72_);
		aFloatArray2631[11] = 1.0F;
		aFloatArray2631[12] = 0.0F;
		aFloatArray2631[13] = 0.0F;
		aFloatArray2631[14] = -(2.0F * f_73_ * f_72_) / (f_73_ - f_72_);
		aFloatArray2631[15] = 0.0F;
	}

	public void method2493(float f, float f_74_, float f_75_, float f_76_, float f_77_, float f_78_, float f_79_, float f_80_) {
		aFloatArray2631[0] = f_75_ * 2.0F / f_79_;
		aFloatArray2631[1] = 0.0F;
		aFloatArray2631[2] = 0.0F;
		aFloatArray2631[3] = 0.0F;
		aFloatArray2631[4] = 0.0F;
		aFloatArray2631[5] = f_76_ * 2.0F / f_80_;
		aFloatArray2631[6] = 0.0F;
		aFloatArray2631[7] = 0.0F;
		aFloatArray2631[8] = 2.0F * f / f_79_ - 1.0F;
		aFloatArray2631[9] = 2.0F * f_74_ / f_80_ - 1.0F;
		aFloatArray2631[10] = (f_78_ + f_77_) / (f_78_ - f_77_);
		aFloatArray2631[11] = 1.0F;
		aFloatArray2631[12] = 0.0F;
		aFloatArray2631[13] = 0.0F;
		aFloatArray2631[14] = 2.0F * f_78_ * f_77_ / (f_77_ - f_78_);
		aFloatArray2631[15] = 0.0F;
	}

	public void method2494(float f, float f_81_, float f_82_, float f_83_, float f_84_, float f_85_, float f_86_, float f_87_, float f_88_) {
		method2489(-(f * f_88_) / f_82_, f_88_ * (f_86_ - f) / f_82_, -(f_81_ * f_88_) / f_83_, f_88_ * (f_87_ - f_81_) / f_83_, f_84_, f_85_);
	}

	public float method2495() {
		return (-(aFloatArray2631[15] + aFloatArray2631[14]) / (aFloatArray2631[11] + aFloatArray2631[10]));
	}

	public float method2496() {
		return ((aFloatArray2631[14] - aFloatArray2631[15]) / (aFloatArray2631[11] - aFloatArray2631[10]));
	}

	public float[] method2497(float[] fs) {
		float f = aFloatArray2631[3] + aFloatArray2631[0];
		float f_89_ = aFloatArray2631[7] + aFloatArray2631[4];
		float f_90_ = aFloatArray2631[11] + aFloatArray2631[8];
		double d = Math.sqrt((double) (f * f + f_89_ * f_89_ + f_90_ * f_90_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_89_ / d);
		fs[2] = (float) ((double) f_90_ / d);
		fs[3] = (float) ((double) (aFloatArray2631[15] + aFloatArray2631[12]) / d);
		return fs;
	}

	public float[] method2498(float[] fs) {
		float f = aFloatArray2631[3] - aFloatArray2631[1];
		float f_91_ = aFloatArray2631[7] - aFloatArray2631[5];
		float f_92_ = aFloatArray2631[11] - aFloatArray2631[9];
		double d = Math.sqrt((double) (f * f + f_91_ * f_91_ + f_92_ * f_92_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_91_ / d);
		fs[2] = (float) ((double) f_92_ / d);
		fs[3] = (float) ((double) (aFloatArray2631[15] - aFloatArray2631[13]) / d);
		return fs;
	}

	public float[] method2499(float[] fs) {
		float f = aFloatArray2631[3] + aFloatArray2631[2];
		float f_93_ = aFloatArray2631[7] + aFloatArray2631[6];
		float f_94_ = aFloatArray2631[11] + aFloatArray2631[10];
		double d = Math.sqrt((double) (f * f + f_93_ * f_93_ + f_94_ * f_94_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_93_ / d);
		fs[2] = (float) ((double) f_94_ / d);
		fs[3] = (float) ((double) (aFloatArray2631[15] + aFloatArray2631[14]) / d);
		return fs;
	}

	public float[] method2500(float[] fs) {
		float f = aFloatArray2631[3] - aFloatArray2631[2];
		float f_95_ = aFloatArray2631[7] - aFloatArray2631[6];
		float f_96_ = aFloatArray2631[11] - aFloatArray2631[10];
		double d = Math.sqrt((double) (f * f + f_95_ * f_95_ + f_96_ * f_96_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_95_ / d);
		fs[2] = (float) ((double) f_96_ / d);
		fs[3] = (float) ((double) (aFloatArray2631[15] - aFloatArray2631[14]) / d);
		return fs;
	}

	public void method2501() {
		float f = aFloatArray2631[0];
		float f_97_ = aFloatArray2631[4];
		float f_98_ = aFloatArray2631[8];
		float f_99_ = aFloatArray2631[12];
		float f_100_ = aFloatArray2631[1];
		float f_101_ = aFloatArray2631[5];
		float f_102_ = aFloatArray2631[9];
		float f_103_ = aFloatArray2631[13];
		float f_104_ = aFloatArray2631[2];
		float f_105_ = aFloatArray2631[6];
		float f_106_ = aFloatArray2631[10];
		float f_107_ = aFloatArray2631[14];
		float f_108_ = aFloatArray2631[3];
		float f_109_ = aFloatArray2631[7];
		float f_110_ = aFloatArray2631[11];
		float f_111_ = aFloatArray2631[15];
		aFloatArray2631[0] = f;
		aFloatArray2631[1] = f_97_;
		aFloatArray2631[2] = f_98_;
		aFloatArray2631[3] = f_99_;
		aFloatArray2631[4] = f_100_;
		aFloatArray2631[5] = f_101_;
		aFloatArray2631[6] = f_102_;
		aFloatArray2631[7] = f_103_;
		aFloatArray2631[8] = f_104_;
		aFloatArray2631[9] = f_105_;
		aFloatArray2631[10] = f_106_;
		aFloatArray2631[11] = f_107_;
		aFloatArray2631[12] = f_108_;
		aFloatArray2631[13] = f_109_;
		aFloatArray2631[14] = f_110_;
		aFloatArray2631[15] = f_111_;
	}

	public float[] method2502(float[] fs) {
		System.arraycopy(aFloatArray2631, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method2503(float[] fs) {
		fs[0] = aFloatArray2631[0];
		fs[1] = aFloatArray2631[1];
		fs[2] = aFloatArray2631[2];
		fs[3] = aFloatArray2631[4];
		fs[4] = aFloatArray2631[5];
		fs[5] = aFloatArray2631[6];
		fs[6] = aFloatArray2631[8];
		fs[7] = aFloatArray2631[9];
		fs[8] = aFloatArray2631[10];
		return fs;
	}

	public float[] method2504(float[] fs) {
		fs[0] = aFloatArray2631[0];
		fs[1] = aFloatArray2631[4];
		fs[2] = aFloatArray2631[8];
		fs[3] = aFloatArray2631[12];
		fs[4] = aFloatArray2631[1];
		fs[5] = aFloatArray2631[5];
		fs[6] = aFloatArray2631[9];
		fs[7] = aFloatArray2631[13];
		fs[8] = aFloatArray2631[2];
		fs[9] = aFloatArray2631[6];
		fs[10] = aFloatArray2631[10];
		fs[11] = aFloatArray2631[14];
		fs[12] = aFloatArray2631[3];
		fs[13] = aFloatArray2631[7];
		fs[14] = aFloatArray2631[11];
		fs[15] = aFloatArray2631[15];
		return fs;
	}

	public float[] method2505(float[] fs) {
		fs[0] = aFloatArray2631[0];
		fs[1] = aFloatArray2631[1];
		fs[2] = aFloatArray2631[4];
		fs[3] = aFloatArray2631[5];
		fs[4] = aFloatArray2631[8];
		fs[5] = aFloatArray2631[9];
		fs[6] = aFloatArray2631[12];
		fs[7] = aFloatArray2631[13];
		return fs;
	}

	public float[] method2506(float[] fs) {
		fs[0] = aFloatArray2631[0];
		fs[1] = aFloatArray2631[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = aFloatArray2631[4];
		fs[5] = aFloatArray2631[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = aFloatArray2631[12];
		fs[9] = aFloatArray2631[13];
		fs[10] = aFloatArray2631[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method2507(int i, int i_112_, int i_113_, float f, float f_114_, float f_115_) {
		if (i != 0) {
			float f_116_ = Class256.aFloatArray2666[i & 0x3fff];
			float f_117_ = Class256.aFloatArray2665[i & 0x3fff];
			aFloatArray2631[0] = f_116_ * (float) i_112_;
			aFloatArray2631[5] = f_116_ * (float) i_113_;
			aFloatArray2631[1] = f_117_ * (float) i_112_;
			aFloatArray2631[4] = -f_117_ * (float) i_113_;
			aFloatArray2631[10] = 1.0F;
			float[] fs = aFloatArray2631;
			float[] fs_118_ = aFloatArray2631;
			float[] fs_119_ = aFloatArray2631;
			aFloatArray2631[9] = 0.0F;
			fs_119_[8] = 0.0F;
			fs_118_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			aFloatArray2631[0] = (float) i_112_;
			aFloatArray2631[5] = (float) i_113_;
			aFloatArray2631[10] = 1.0F;
			float[] fs = aFloatArray2631;
			float[] fs_120_ = aFloatArray2631;
			float[] fs_121_ = aFloatArray2631;
			float[] fs_122_ = aFloatArray2631;
			float[] fs_123_ = aFloatArray2631;
			aFloatArray2631[9] = 0.0F;
			fs_123_[8] = 0.0F;
			fs_122_[6] = 0.0F;
			fs_121_[4] = 0.0F;
			fs_120_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = aFloatArray2631;
		float[] fs_124_ = aFloatArray2631;
		aFloatArray2631[11] = 0.0F;
		fs_124_[7] = 0.0F;
		fs[3] = 0.0F;
		aFloatArray2631[15] = 1.0F;
		aFloatArray2631[12] = f;
		aFloatArray2631[13] = f_114_;
		aFloatArray2631[14] = f_115_;
	}

	public void method2508(Class247 class247) {
		aFloatArray2631[0] = ((Class247) class247).aFloat2618;
		aFloatArray2631[1] = ((Class247) class247).aFloat2619;
		aFloatArray2631[2] = ((Class247) class247).aFloat2617;
		aFloatArray2631[3] = 0.0F;
		aFloatArray2631[4] = ((Class247) class247).aFloat2620;
		aFloatArray2631[5] = ((Class247) class247).aFloat2622;
		aFloatArray2631[6] = ((Class247) class247).aFloat2623;
		aFloatArray2631[7] = 0.0F;
		aFloatArray2631[8] = ((Class247) class247).aFloat2626;
		aFloatArray2631[9] = ((Class247) class247).aFloat2625;
		aFloatArray2631[10] = ((Class247) class247).aFloat2624;
		aFloatArray2631[11] = 0.0F;
		aFloatArray2631[12] = ((Class247) class247).aFloat2627;
		aFloatArray2631[13] = ((Class247) class247).aFloat2628;
		aFloatArray2631[14] = ((Class247) class247).aFloat2629;
		aFloatArray2631[15] = 1.0F;
	}

	public float[] method2509(float[] fs) {
		fs[0] = aFloatArray2631[0];
		fs[1] = aFloatArray2631[4];
		fs[2] = aFloatArray2631[8];
		fs[3] = aFloatArray2631[12];
		fs[4] = aFloatArray2631[1];
		fs[5] = aFloatArray2631[5];
		fs[6] = aFloatArray2631[9];
		fs[7] = aFloatArray2631[13];
		return fs;
	}

	public void method2510(Class249 class249_125_) {
		System.arraycopy(class249_125_.aFloatArray2631, 0, aFloatArray2631, 0, 16);
	}

	public void method2511(float f, float f_126_, float f_127_, float[] fs) {
		fs[0] = (aFloatArray2631[0] * f + aFloatArray2631[4] * f_126_ + aFloatArray2631[8] * f_127_ + aFloatArray2631[12]);
		fs[1] = (aFloatArray2631[1] * f + aFloatArray2631[5] * f_126_ + aFloatArray2631[9] * f_127_ + aFloatArray2631[13]);
		fs[2] = (aFloatArray2631[2] * f + aFloatArray2631[6] * f_126_ + aFloatArray2631[10] * f_127_ + aFloatArray2631[14]);
		if (fs.length > 3)
			fs[3] = (aFloatArray2631[3] * f + aFloatArray2631[7] * f_126_ + aFloatArray2631[11] * f_127_ + aFloatArray2631[15]);
	}

	public float[] method2512(float[] fs) {
		float f = aFloatArray2631[3] + aFloatArray2631[1];
		float f_128_ = aFloatArray2631[7] + aFloatArray2631[5];
		float f_129_ = aFloatArray2631[11] + aFloatArray2631[9];
		double d = Math.sqrt((double) (f * f + f_128_ * f_128_ + f_129_ * f_129_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_128_ / d);
		fs[2] = (float) ((double) f_129_ / d);
		fs[3] = (float) ((double) (aFloatArray2631[15] + aFloatArray2631[13]) / d);
		return fs;
	}

	float method2513() {
		return ((aFloatArray2631[0] * aFloatArray2631[5] * aFloatArray2631[10] * aFloatArray2631[15]) - (aFloatArray2631[0] * aFloatArray2631[5] * aFloatArray2631[11] * aFloatArray2631[14]) - (aFloatArray2631[0] * aFloatArray2631[6] * aFloatArray2631[9] * aFloatArray2631[15]) + (aFloatArray2631[0] * aFloatArray2631[6] * aFloatArray2631[11] * aFloatArray2631[13]) + (aFloatArray2631[0] * aFloatArray2631[7] * aFloatArray2631[9] * aFloatArray2631[14]) - (aFloatArray2631[0] * aFloatArray2631[7] * aFloatArray2631[10] * aFloatArray2631[13]) - (aFloatArray2631[1] * aFloatArray2631[4] * aFloatArray2631[10] * aFloatArray2631[15]) + (aFloatArray2631[1] * aFloatArray2631[4] * aFloatArray2631[11] * aFloatArray2631[14]) + (aFloatArray2631[1] * aFloatArray2631[6] * aFloatArray2631[8] * aFloatArray2631[15]) - (aFloatArray2631[1] * aFloatArray2631[6] * aFloatArray2631[11] * aFloatArray2631[12]) - (aFloatArray2631[1] * aFloatArray2631[7] * aFloatArray2631[8] * aFloatArray2631[14]) + (aFloatArray2631[1] * aFloatArray2631[7] * aFloatArray2631[10] * aFloatArray2631[12]) + (aFloatArray2631[2] * aFloatArray2631[4] * aFloatArray2631[9] * aFloatArray2631[15]) - (aFloatArray2631[2] * aFloatArray2631[4] * aFloatArray2631[11] * aFloatArray2631[13]) - (aFloatArray2631[2] * aFloatArray2631[5] * aFloatArray2631[8] * aFloatArray2631[15]) + (aFloatArray2631[2] * aFloatArray2631[5] * aFloatArray2631[11] * aFloatArray2631[12]) + (aFloatArray2631[2] * aFloatArray2631[7] * aFloatArray2631[8] * aFloatArray2631[13]) - (aFloatArray2631[2] * aFloatArray2631[7] * aFloatArray2631[9] * aFloatArray2631[12]) - (aFloatArray2631[3] * aFloatArray2631[4] * aFloatArray2631[9] * aFloatArray2631[14]) + (aFloatArray2631[3] * aFloatArray2631[4] * aFloatArray2631[10] * aFloatArray2631[13]) + (aFloatArray2631[3] * aFloatArray2631[5] * aFloatArray2631[8] * aFloatArray2631[14]) - (aFloatArray2631[3] * aFloatArray2631[5] * aFloatArray2631[10] * aFloatArray2631[12]) - (aFloatArray2631[3] * aFloatArray2631[6] * aFloatArray2631[8] * aFloatArray2631[13]) + (aFloatArray2631[3] * aFloatArray2631[6] * aFloatArray2631[9] * aFloatArray2631[12]));
	}

	public float[] method2514(float[] fs) {
		System.arraycopy(aFloatArray2631, 0, fs, 0, 16);
		return fs;
	}

	public float[] method2515(float[] fs) {
		float f = aFloatArray2631[3] - aFloatArray2631[0];
		float f_130_ = aFloatArray2631[7] - aFloatArray2631[4];
		float f_131_ = aFloatArray2631[11] - aFloatArray2631[8];
		double d = Math.sqrt((double) (f * f + f_130_ * f_130_ + f_131_ * f_131_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_130_ / d);
		fs[2] = (float) ((double) f_131_ / d);
		fs[3] = (float) ((double) (aFloatArray2631[15] - aFloatArray2631[12]) / d);
		return fs;
	}

	public void method2516() {
		aFloatArray2631[0] = 1.0F;
		aFloatArray2631[1] = 0.0F;
		aFloatArray2631[2] = 0.0F;
		aFloatArray2631[3] = 0.0F;
		aFloatArray2631[4] = 0.0F;
		aFloatArray2631[5] = 1.0F;
		aFloatArray2631[6] = 0.0F;
		aFloatArray2631[7] = 0.0F;
		aFloatArray2631[8] = 0.0F;
		aFloatArray2631[9] = 0.0F;
		aFloatArray2631[10] = 1.0F;
		aFloatArray2631[11] = 0.0F;
		aFloatArray2631[12] = 0.0F;
		aFloatArray2631[13] = 0.0F;
		aFloatArray2631[14] = 0.0F;
		aFloatArray2631[15] = 1.0F;
	}
}
