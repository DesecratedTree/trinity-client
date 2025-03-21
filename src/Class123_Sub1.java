/* Class123_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class123_Sub1 extends Class123 {
	byte[] aByteArray8877;
	boolean aBoolean8878 = false;
	Class105_Sub1 aClass105_Sub1_8879;
	static float[] aFloatArray8880 = new float[16];
	long aLong8881;
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8882;
	byte[] aByteArray8883;
	static int anInt8884 = 1;
	static int anInt8885 = 0;
	boolean[] aBooleanArray8886;
	float[][] aFloatArrayArray8887 = new float[2][];
	long aLong8888;

	void method1496(int i, Class249 class249) {
		int i_0_ = i >> 16;
		int i_1_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2509(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_0_], i_1_, 8);
		((Class123_Sub1) this).aBooleanArray8886[i_0_] = true;
	}

	Class123_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class118 class118) {
		((Class123_Sub1) this).aBooleanArray8886 = new boolean[2];
		aString6481 = class118.aString1391;
		if (class118.aString1388 != null) {
			aString6480 = class118.aString1388;
			((Class123_Sub1) this).aByteArray8883 = class_ra_sub2_sub2.method5169(aString6480);
		}
		if (class118.aString1390 != null) {
			aString6482 = class118.aString1390;
			((Class123_Sub1) this).aByteArray8877 = class_ra_sub2_sub2.method5169(aString6482);
		}
		class_ra_sub2_sub2.method4993(this);
	}

	void method1494(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_2_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_3_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1028)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i_2_ >= 0)
			method1517(i_2_, fs, i);
		if (i_3_ >= 0)
			method1514(i_3_, fs, i);
	}

	public boolean method1469() {
		if (((Class123_Sub1) this).aBoolean8878)
			return true;
		((Class123_Sub1) this).aLong8888 = (((Class123_Sub1) this).aByteArray8883 == null ? 0L : (IDirect3DDevice.CreateVertexShader(((Class_ra_Sub2_Sub2) ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882).aLong9891, ((Class123_Sub1) this).aByteArray8883)));
		((Class123_Sub1) this).aLong8881 = (((Class123_Sub1) this).aByteArray8877 == null ? 0L : (IDirect3DDevice.CreatePixelShader(((Class_ra_Sub2_Sub2) ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882).aLong9891, ((Class123_Sub1) this).aByteArray8877)));
		if (((Class123_Sub1) this).aLong8888 == 0L && ((Class123_Sub1) this).aLong8881 == 0L)
			return false;
		int i = -1;
		for (int i_4_ = 0; i_4_ < ((Class123_Sub1) this).aClass105_Sub1_8879.method1255((byte) 1); i_4_++) {
			if (((Class123_Sub1) this).aClass105_Sub1_8879.method1256(i_4_, 1814689) == this) {
				i = i_4_;
				break;
			}
		}
		int i_5_ = ((Class123_Sub1) this).aClass105_Sub1_8879.method1282((byte) 4);
		int i_6_ = ((Class123_Sub1) this).aClass105_Sub1_8879.method1279(1709217003);
		for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub1) this).aClass105_Sub1_8879.method1298(i_7_, -929781559);
			class330_sub15_sub1.method3329(i);
		}
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub1) this).aClass105_Sub1_8879.method1280(i_8_, 207187206);
			class330_sub15_sub1.method3329(i);
		}
		int i_9_ = 0;
		int i_10_ = 0;
		int i_11_ = ((Class123_Sub1) this).aClass105_Sub1_8879.method1297(this, 468926985);
		for (int i_12_ = 0; i_12_ < i_5_ + i_6_; i_12_++) {
			Class330_Sub15_Sub1_Sub2 class330_sub15_sub1_sub2 = ((Class330_Sub15_Sub1_Sub2) (i_12_ < i_5_ ? ((Class123_Sub1) this).aClass105_Sub1_8879.method1298(i_12_, -929781559) : ((Class123_Sub1) this).aClass105_Sub1_8879.method1280(i_12_ - i_5_, -1991034839)));
			Class109 class109 = class330_sub15_sub1_sub2.method3323(1632830751);
			int i_13_ = 1;
			if (class109 == Class109.aClass109_1028) {
				class109 = class330_sub15_sub1_sub2.method3325(-944615731);
				i_13_ = class330_sub15_sub1_sub2.method3326(2883842);
			}
			switch (class109.anInt1104 * -1162917287) {
			case 19:
			case 44:
			case 80:
			case 114:
				i_13_ *= 3;
				break;
			case 7:
			case 51:
			case 62:
			case 118:
				break;
			case 17:
			case 28:
			case 79:
			case 81:
				i_13_ *= 4;
				break;
			case 13:
			case 31:
			case 91:
			case 115:
				i_13_ *= 2;
				break;
			default:
				i_13_ = 0;
			}
			if ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10131[i_11_]) >= 0) {
				int i_14_ = ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10131[i_11_]) + i_13_);
				if (i_9_ < i_14_)
					i_9_ = i_14_;
			}
			if ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10132[i_11_]) >= 0) {
				int i_15_ = ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10132[i_11_]) + i_13_);
				if (i_10_ < i_15_)
					i_10_ = i_15_;
			}
		}
		((Class123_Sub1) this).aFloatArrayArray8887[0] = new float[i_9_ * 4];
		((Class123_Sub1) this).aFloatArrayArray8887[1] = new float[i_10_ * 4];
		((Class123_Sub1) this).aBoolean8878 = true;
		return true;
	}

	void method1456(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_16_) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_17_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1149)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 1] = f_16_;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_17_ >= 0) {
			i_17_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_17_ + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_17_ + 1] = f_16_;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1457(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_18_, float f_19_) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_20_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1052)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 1] = f_18_;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 2] = f_19_;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_20_ >= 0) {
			i_20_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_20_ + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_20_ + 1] = f_18_;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_20_ + 2] = f_19_;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1475(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_21_, float f_22_, float f_23_) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_24_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1027)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 1] = f_21_;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 2] = f_22_;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 3] = f_23_;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_24_ >= 0) {
			i_24_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_24_ + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_24_ + 1] = f_21_;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_24_ + 2] = f_22_;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_24_ + 3] = f_23_;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1460(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_25_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1116)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0)
			method1517(i, class249.method2509(aFloatArray8880), 8);
		if (i_25_ >= 0)
			method1514(i_25_, class249.method2509(aFloatArray8880), 8);
	}

	void method1462(Class330_Sub15_Sub1 class330_sub15_sub1, int i, Interface11 interface11) {
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4955(i);
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4956(interface11);
	}

	void method1455(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_26_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i] = f;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_26_ >= 0) {
			i_26_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_26_] = f;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	public boolean method1454() {
		if (((Class123_Sub1) this).aBoolean8878)
			return true;
		((Class123_Sub1) this).aLong8888 = (((Class123_Sub1) this).aByteArray8883 == null ? 0L : (IDirect3DDevice.CreateVertexShader(((Class_ra_Sub2_Sub2) ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882).aLong9891, ((Class123_Sub1) this).aByteArray8883)));
		((Class123_Sub1) this).aLong8881 = (((Class123_Sub1) this).aByteArray8877 == null ? 0L : (IDirect3DDevice.CreatePixelShader(((Class_ra_Sub2_Sub2) ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882).aLong9891, ((Class123_Sub1) this).aByteArray8877)));
		if (((Class123_Sub1) this).aLong8888 == 0L && ((Class123_Sub1) this).aLong8881 == 0L)
			return false;
		int i = -1;
		for (int i_27_ = 0; i_27_ < ((Class123_Sub1) this).aClass105_Sub1_8879.method1255((byte) 112); i_27_++) {
			if (((Class123_Sub1) this).aClass105_Sub1_8879.method1256(i_27_, -1744506044) == this) {
				i = i_27_;
				break;
			}
		}
		int i_28_ = ((Class123_Sub1) this).aClass105_Sub1_8879.method1282((byte) 4);
		int i_29_ = ((Class123_Sub1) this).aClass105_Sub1_8879.method1279(865089682);
		for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub1) this).aClass105_Sub1_8879.method1298(i_30_, -929781559);
			class330_sub15_sub1.method3329(i);
		}
		for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class123_Sub1) this).aClass105_Sub1_8879.method1280(i_31_, -1868075267);
			class330_sub15_sub1.method3329(i);
		}
		int i_32_ = 0;
		int i_33_ = 0;
		int i_34_ = ((Class123_Sub1) this).aClass105_Sub1_8879.method1297(this, -250560090);
		for (int i_35_ = 0; i_35_ < i_28_ + i_29_; i_35_++) {
			Class330_Sub15_Sub1_Sub2 class330_sub15_sub1_sub2 = ((Class330_Sub15_Sub1_Sub2) (i_35_ < i_28_ ? ((Class123_Sub1) this).aClass105_Sub1_8879.method1298(i_35_, -929781559) : ((Class123_Sub1) this).aClass105_Sub1_8879.method1280(i_35_ - i_28_, 749784491)));
			Class109 class109 = class330_sub15_sub1_sub2.method3323(1632830751);
			int i_36_ = 1;
			if (class109 == Class109.aClass109_1028) {
				class109 = class330_sub15_sub1_sub2.method3325(-944615731);
				i_36_ = class330_sub15_sub1_sub2.method3326(2883842);
			}
			switch (class109.anInt1104 * -1162917287) {
			case 19:
			case 44:
			case 80:
			case 114:
				i_36_ *= 3;
				break;
			case 7:
			case 51:
			case 62:
			case 118:
				break;
			case 17:
			case 28:
			case 79:
			case 81:
				i_36_ *= 4;
				break;
			case 13:
			case 31:
			case 91:
			case 115:
				i_36_ *= 2;
				break;
			default:
				i_36_ = 0;
			}
			if ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10131[i_34_]) >= 0) {
				int i_37_ = ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10131[i_34_]) + i_36_);
				if (i_32_ < i_37_)
					i_32_ = i_37_;
			}
			if ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10132[i_34_]) >= 0) {
				int i_38_ = ((((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1_sub2).anIntArray10132[i_34_]) + i_36_);
				if (i_33_ < i_38_)
					i_33_ = i_38_;
			}
		}
		((Class123_Sub1) this).aFloatArrayArray8887[0] = new float[i_32_ * 4];
		((Class123_Sub1) this).aFloatArrayArray8887[1] = new float[i_33_ * 4];
		((Class123_Sub1) this).aBoolean8878 = true;
		return true;
	}

	void method1463(int i, float f, float f_39_, float f_40_) {
		int i_41_ = i >> 16;
		int i_42_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_41_][i_42_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_41_][i_42_ + 1] = f_39_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_41_][i_42_ + 2] = f_40_;
		((Class123_Sub1) this).aBooleanArray8886[i_41_] = true;
	}

	void method1502(int i, Class249 class249) {
		int i_43_ = i >> 16;
		int i_44_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2504(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_43_], i_44_, 16);
		((Class123_Sub1) this).aBooleanArray8886[i_43_] = true;
	}

	void method1498(int i, Class249 class249) {
		int i_45_ = i >> 16;
		int i_46_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2504(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_45_], i_46_, 12);
		((Class123_Sub1) this).aBooleanArray8886[i_45_] = true;
	}

	void method1466(int i, Class249 class249) {
		int i_47_ = i >> 16;
		int i_48_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2509(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_47_], i_48_, 8);
		((Class123_Sub1) this).aBooleanArray8886[i_47_] = true;
	}

	void method1467(int i, Class249 class249) {
		int i_49_ = i >> 16;
		int i_50_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2504(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_49_], i_50_, 16);
		((Class123_Sub1) this).aBooleanArray8886[i_49_] = true;
	}

	void method1465(int i, float f, float f_51_, float f_52_) {
		int i_53_ = i >> 16;
		int i_54_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_53_][i_54_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_53_][i_54_ + 1] = f_51_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_53_][i_54_ + 2] = f_52_;
		((Class123_Sub1) this).aBooleanArray8886[i_53_] = true;
	}

	void method1497(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_55_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1116)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0)
			method1517(i, class249.method2509(aFloatArray8880), 8);
		if (i_55_ >= 0)
			method1514(i_55_, class249.method2509(aFloatArray8880), 8);
	}

	final void method1514(int i, float[] fs, int i_56_) {
		Class453.method5640(fs, 0, ((Class123_Sub1) this).aFloatArrayArray8887[1], i * 4, i_56_);
		((Class123_Sub1) this).aBooleanArray8886[1] = true;
	}

	void method1453(int i, Class249 class249) {
		int i_57_ = i >> 16;
		int i_58_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2509(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_57_], i_58_, 8);
		((Class123_Sub1) this).aBooleanArray8886[i_57_] = true;
	}

	void method1515() {
		if (((Class123_Sub1) this).aBooleanArray8886[0]) {
			for (int i = 0; i < ((Class123_Sub1) this).aFloatArrayArray8887[0].length; i++)
				((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.anUnsafe8461.putFloat((((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.aLong8459 + (long) (i * 4)), ((Class123_Sub1) this).aFloatArrayArray8887[0][i]);
			IDirect3DDevice.SetVertexShaderConstantF(((Class_ra_Sub2_Sub2) ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882).aLong9891, 0, ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.aLong8459, ((Class123_Sub1) this).aFloatArrayArray8887[0].length / 4);
			((Class123_Sub1) this).aBooleanArray8886[0] = false;
		}
		if (((Class123_Sub1) this).aBooleanArray8886[1]) {
			for (int i = 0; i < ((Class123_Sub1) this).aFloatArrayArray8887[1].length; i++)
				((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.anUnsafe8461.putFloat((((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.aLong8459 + (long) (i * 4)), ((Class123_Sub1) this).aFloatArrayArray8887[1][i]);
			IDirect3DDevice.SetPixelShaderConstantF(((Class_ra_Sub2_Sub2) ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882).aLong9891, 0, ((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.aLong8459, ((Class123_Sub1) this).aFloatArrayArray8887[1].length / 4);
			((Class123_Sub1) this).aBooleanArray8886[1] = false;
		}
	}

	public void method53() {
		if (((Class123_Sub1) this).aLong8888 != 0L) {
			IUnknown.Release(((Class123_Sub1) this).aLong8888);
			((Class123_Sub1) this).aLong8888 = 0L;
		}
		if (((Class123_Sub1) this).aLong8881 != 0L) {
			IUnknown.Release(((Class123_Sub1) this).aLong8881);
			((Class123_Sub1) this).aLong8881 = 0L;
		}
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4883(this);
	}

	void method1516() {
		if (((Class123_Sub1) this).aLong8888 != 0L) {
			((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method5173(((Class123_Sub1) this).aLong8888);
			((Class123_Sub1) this).aLong8888 = 0L;
		}
		if (((Class123_Sub1) this).aLong8881 != 0L) {
			((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method5173(((Class123_Sub1) this).aLong8881);
			((Class123_Sub1) this).aLong8881 = 0L;
		}
	}

	public void method52() {
		if (((Class123_Sub1) this).aLong8888 != 0L) {
			IUnknown.Release(((Class123_Sub1) this).aLong8888);
			((Class123_Sub1) this).aLong8888 = 0L;
		}
		if (((Class123_Sub1) this).aLong8881 != 0L) {
			IUnknown.Release(((Class123_Sub1) this).aLong8881);
			((Class123_Sub1) this).aLong8881 = 0L;
		}
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4883(this);
	}

	void method1479(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_59_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_60_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1028)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i_59_ >= 0)
			method1517(i_59_, fs, i);
		if (i_60_ >= 0)
			method1514(i_60_, fs, i);
	}

	void method1470(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_61_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i] = f;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_61_ >= 0) {
			i_61_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_61_] = f;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1468(int i, int i_62_, Interface11 interface11) {
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4955(i_62_);
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4956(interface11);
	}

	void method1458(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_63_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i] = f;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_63_ >= 0) {
			i_63_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_63_] = f;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1473(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_64_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i] = f;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_64_ >= 0) {
			i_64_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_64_] = f;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1474(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_65_, float f_66_) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_67_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1052)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 1] = f_65_;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 2] = f_66_;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_67_ >= 0) {
			i_67_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_67_ + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_67_ + 1] = f_65_;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_67_ + 2] = f_66_;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1452(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_68_, float f_69_) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_70_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1052)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 1] = f_68_;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 2] = f_69_;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_70_ >= 0) {
			i_70_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_70_ + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_70_ + 1] = f_68_;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_70_ + 2] = f_69_;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1476(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_71_, float f_72_, float f_73_) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_74_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1027)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 1] = f_71_;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 2] = f_72_;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 3] = f_73_;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_74_ >= 0) {
			i_74_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_74_ + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_74_ + 1] = f_71_;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_74_ + 2] = f_72_;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_74_ + 3] = f_73_;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	Class123_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class105_Sub1 class105_sub1, Class118 class118) {
		this(class_ra_sub2_sub2, class118);
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882 = class_ra_sub2_sub2;
		((Class123_Sub1) this).aClass105_Sub1_8879 = class105_sub1;
	}

	void method1471(Class330_Sub15_Sub1 class330_sub15_sub1, float f) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_75_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if ((class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1050) && (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1096))
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i] = f;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_75_ >= 0) {
			i_75_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_75_] = f;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	final void method1517(int i, float[] fs, int i_76_) {
		Class453.method5640(fs, 0, ((Class123_Sub1) this).aFloatArrayArray8887[0], i * 4, i_76_);
		((Class123_Sub1) this).aBooleanArray8886[0] = true;
	}

	void method1488(int i, float[] fs, int i_77_) {
		int i_78_ = i >> 16;
		int i_79_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_78_], i_79_, i_77_);
		((Class123_Sub1) this).aBooleanArray8886[i_78_] = true;
	}

	void method1495(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_80_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_81_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1028)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i_80_ >= 0)
			method1517(i_80_, fs, i);
		if (i_81_ >= 0)
			method1514(i_81_, fs, i);
	}

	void method1489(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_82_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0)
			method1517(i, class249.method2504(aFloatArray8880), 16);
		if (i_82_ >= 0)
			method1514(i_82_, class249.method2504(aFloatArray8880), 16);
	}

	void method1483(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_83_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0)
			method1517(i, class249.method2504(aFloatArray8880), 16);
		if (i_83_ >= 0)
			method1514(i_83_, class249.method2504(aFloatArray8880), 16);
	}

	void method1484(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_84_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0)
			method1517(i, class249.method2504(aFloatArray8880), 16);
		if (i_84_ >= 0)
			method1514(i_84_, class249.method2504(aFloatArray8880), 16);
	}

	void method1485(Class330_Sub15_Sub1 class330_sub15_sub1, int i, Interface11 interface11) {
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4955(i);
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4956(interface11);
	}

	void method1486(Class330_Sub15_Sub1 class330_sub15_sub1, int i, Interface11 interface11) {
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4955(i);
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4956(interface11);
	}

	void method1487(int i, float f, float f_85_, float f_86_) {
		int i_87_ = i >> 16;
		int i_88_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_87_][i_88_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_87_][i_88_ + 1] = f_85_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_87_][i_88_ + 2] = f_86_;
		((Class123_Sub1) this).aBooleanArray8886[i_87_] = true;
	}

	void method1464(int i, float f, float f_89_, float f_90_, float f_91_) {
		int i_92_ = i >> 16;
		int i_93_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_92_][i_93_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_92_][i_93_ + 1] = f_89_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_92_][i_93_ + 2] = f_90_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_92_][i_93_ + 3] = f_91_;
		((Class123_Sub1) this).aBooleanArray8886[i_92_] = true;
	}

	void method1472(int i, float f, float f_94_, float f_95_) {
		int i_96_ = i >> 16;
		int i_97_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_96_][i_97_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_96_][i_97_ + 1] = f_94_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_96_][i_97_ + 2] = f_95_;
		((Class123_Sub1) this).aBooleanArray8886[i_96_] = true;
	}

	void method1501(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_98_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1116)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0)
			method1517(i, class249.method2509(aFloatArray8880), 8);
		if (i_98_ >= 0)
			method1514(i_98_, class249.method2509(aFloatArray8880), 8);
	}

	void method1503(int i, float f, float f_99_, float f_100_, float f_101_) {
		int i_102_ = i >> 16;
		int i_103_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_102_][i_103_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_102_][i_103_ + 1] = f_99_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_102_][i_103_ + 2] = f_100_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_102_][i_103_ + 3] = f_101_;
		((Class123_Sub1) this).aBooleanArray8886[i_102_] = true;
	}

	void method1480(int i, float f, float f_104_, float f_105_, float f_106_) {
		int i_107_ = i >> 16;
		int i_108_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_107_][i_108_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_107_][i_108_ + 1] = f_104_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_107_][i_108_ + 2] = f_105_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_107_][i_108_ + 3] = f_106_;
		((Class123_Sub1) this).aBooleanArray8886[i_107_] = true;
	}

	void method1461(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_109_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1069)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0)
			method1517(i, class249.method2504(aFloatArray8880), 16);
		if (i_109_ >= 0)
			method1514(i_109_, class249.method2504(aFloatArray8880), 16);
	}

	void method1490(int i, Class249 class249) {
		int i_110_ = i >> 16;
		int i_111_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2504(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_110_], i_111_, 12);
		((Class123_Sub1) this).aBooleanArray8886[i_110_] = true;
	}

	void method1477(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		int i_112_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_113_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1028)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i_112_ >= 0)
			method1517(i_112_, fs, i);
		if (i_113_ >= 0)
			method1514(i_113_, fs, i);
	}

	void method1482(int i, float f, float f_114_, float f_115_, float f_116_) {
		int i_117_ = i >> 16;
		int i_118_ = (i & 0xffff) * 4;
		((Class123_Sub1) this).aFloatArrayArray8887[i_117_][i_118_] = f;
		((Class123_Sub1) this).aFloatArrayArray8887[i_117_][i_118_ + 1] = f_114_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_117_][i_118_ + 2] = f_115_;
		((Class123_Sub1) this).aFloatArrayArray8887[i_117_][i_118_ + 3] = f_116_;
		((Class123_Sub1) this).aBooleanArray8886[i_117_] = true;
	}

	void method1492(int i, Class249 class249) {
		int i_119_ = i >> 16;
		int i_120_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2509(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_119_], i_120_, 8);
		((Class123_Sub1) this).aBooleanArray8886[i_119_] = true;
	}

	void method1481(int i, Class249 class249) {
		int i_121_ = i >> 16;
		int i_122_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2509(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_121_], i_122_, 8);
		((Class123_Sub1) this).aBooleanArray8886[i_121_] = true;
	}

	void method1500(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_123_) {
		int i = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3334();
		int i_124_ = ((Class330_Sub15_Sub1_Sub2) class330_sub15_sub1).method3335();
		if (class330_sub15_sub1.method3323(1632830751) != Class109.aClass109_1149)
			throw new IllegalArgumentException_Sub1(class330_sub15_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[0][i + 1] = f_123_;
			((Class123_Sub1) this).aBooleanArray8886[0] = true;
		}
		if (i_124_ >= 0) {
			i_124_ *= 4;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_124_ + 0] = f;
			((Class123_Sub1) this).aFloatArrayArray8887[1][i_124_ + 1] = f_123_;
			((Class123_Sub1) this).aBooleanArray8886[1] = true;
		}
	}

	void method1478(int i, Class249 class249) {
		int i_125_ = i >> 16;
		int i_126_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2504(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_125_], i_126_, 16);
		((Class123_Sub1) this).aBooleanArray8886[i_125_] = true;
	}

	void method1493(int i, float[] fs, int i_127_) {
		int i_128_ = i >> 16;
		int i_129_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_128_], i_129_, i_127_);
		((Class123_Sub1) this).aBooleanArray8886[i_128_] = true;
	}

	void method1459(int i, Class249 class249) {
		int i_130_ = i >> 16;
		int i_131_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2504(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_130_], i_131_, 16);
		((Class123_Sub1) this).aBooleanArray8886[i_130_] = true;
	}

	void method1504(int i, Class249 class249) {
		int i_132_ = i >> 16;
		int i_133_ = (i & 0xffff) * 4;
		System.arraycopy(class249.method2504(aFloatArray8880), 0, ((Class123_Sub1) this).aFloatArrayArray8887[i_132_], i_133_, 16);
		((Class123_Sub1) this).aBooleanArray8886[i_132_] = true;
	}

	void method1499(int i, int i_134_, Interface11 interface11) {
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4955(i_134_);
		((Class123_Sub1) this).aClass_ra_Sub2_Sub2_8882.method4956(interface11);
	}
}
