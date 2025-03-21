/* Class192_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class192_Sub1 extends Class192 {
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7338;
	public static float aFloat7339 = 0.25F;
	public static float aFloat7340 = 1.0F;
	public static float aFloat7341 = 1.0F;
	public static float aFloat7342 = 1.0F;
	Class123 aClass123_7343;
	boolean aBoolean7344;
	Class123 aClass123_7345;
	static int anInt7346 = 256;
	Class123 aClass123_7347;
	Class123 aClass123_7348;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7349;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7350;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7351;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7352;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7353;
	Class105 aClass105_7354;
	Class123 aClass123_7355;

	void method2115(int i, int i_0_) {
		/* empty */
	}

	boolean method2128() {
		return (aClass_ra_Sub2_1879.aBoolean8594 && aClass_ra_Sub2_1879.method4886());
	}

	boolean method2099() {
		return ((Class192_Sub1) this).aBoolean7344;
	}

	boolean method2113() {
		return ((Class192_Sub1) this).aBoolean7344;
	}

	void method2120(int i) {
		((Class192_Sub1) this).aClass105_7354.method1250();
	}

	int method2105() {
		return 4;
	}

	public Class192_Sub1(Class_ra_Sub2 class_ra_sub2) {
		super(class_ra_sub2);
	}

	void method2104(int i, Class76_Sub2 class76_sub2, Interface11_Impl3 interface11_impl3, Interface8_Impl1_Impl1 interface8_impl1_impl1, Interface11_Impl3 interface11_impl3_1_) {
		float f = aClass_ra_Sub2_1879.method4901();
		float f_2_ = (float) class76_sub2.method856();
		float f_3_ = (float) class76_sub2.method857();
		Interface11_Impl3 interface11_impl3_4_ = interface11_impl3;
		float f_5_ = f * 2.0F / f_2_;
		float f_6_ = -f * 2.0F / f_3_;
		float[] fs = { -1.0F + f_5_, 1.0F + f_6_, 0.0F, 0.0F, -1.0F + f_5_, -3.0F + f_6_, 0.0F, 2.0F, 3.0F + f_5_, 1.0F + f_6_, 2.0F, 0.0F };
		int i_7_ = (int) f_2_;
		int i_8_ = (int) f_3_;
		int i_9_ = i_7_;
		int i_10_ = i_8_;
		if (i == 0) {
			i_7_ = 256;
			i_8_ = 256;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7345);
			((Class192_Sub1) this).aClass105_7354.method1249();
		} else if (i == 1) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, aFloat7342 / f_2_, 0.0F, (byte) 95);
		} else if (i == 2) {
			i_7_ = 256;
			i_8_ = 256;
			i_9_ = i_7_;
			i_10_ = i_8_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / f_3_, (byte) 78);
		} else if (i == 3) {
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7347);
			interface11_impl3_4_ = interface11_impl3_1_;
			((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7350, 1, interface11_impl3, (byte) 116);
			((Class192_Sub1) this).aClass105_7354.method1249();
		}
		float f_11_ = (float) i_7_ / f_2_;
		float f_12_ = (float) i_8_ / f_3_;
		float f_13_ = (float) i_9_ / f_2_;
		float f_14_ = (float) i_10_ / f_3_;
		fs[8] = (fs[8] + 1.0F) * f_11_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_12_ + 1.0F;
		fs[10] *= f_13_;
		fs[7] *= f_14_;
		((Class192_Sub1) this).aClass105_7354.method1267(((Class192_Sub1) this).aClass330_Sub15_Sub1_7338, fs, -738302762);
		((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7349, 0, interface11_impl3_4_, (byte) 121);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, -187379429);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / f_2_, 256.0F / f_3_, 234403533);
		aClass_ra_Sub2_1879.ae(0, 0, i_7_, i_8_);
		aClass_ra_Sub2_1879.r(0, 0, i_7_, i_8_);
	}

	void method2123(int i, Class76_Sub2 class76_sub2, Interface11_Impl3 interface11_impl3, Interface8_Impl1_Impl1 interface8_impl1_impl1, Interface11_Impl3 interface11_impl3_15_) {
		float f = aClass_ra_Sub2_1879.method4901();
		float f_16_ = (float) class76_sub2.method856();
		float f_17_ = (float) class76_sub2.method857();
		Interface11_Impl3 interface11_impl3_18_ = interface11_impl3;
		float f_19_ = f * 2.0F / f_16_;
		float f_20_ = -f * 2.0F / f_17_;
		float[] fs = { -1.0F + f_19_, 1.0F + f_20_, 0.0F, 0.0F, -1.0F + f_19_, -3.0F + f_20_, 0.0F, 2.0F, 3.0F + f_19_, 1.0F + f_20_, 2.0F, 0.0F };
		int i_21_ = (int) f_16_;
		int i_22_ = (int) f_17_;
		int i_23_ = i_21_;
		int i_24_ = i_22_;
		if (i == 0) {
			i_21_ = 256;
			i_22_ = 256;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7345);
			((Class192_Sub1) this).aClass105_7354.method1249();
		} else if (i == 1) {
			i_21_ = 256;
			i_22_ = 256;
			i_23_ = i_21_;
			i_24_ = i_22_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, aFloat7342 / f_16_, 0.0F, (byte) 89);
		} else if (i == 2) {
			i_21_ = 256;
			i_22_ = 256;
			i_23_ = i_21_;
			i_24_ = i_22_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / f_17_, (byte) 73);
		} else if (i == 3) {
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7347);
			interface11_impl3_18_ = interface11_impl3_15_;
			((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7350, 1, interface11_impl3, (byte) 16);
			((Class192_Sub1) this).aClass105_7354.method1249();
		}
		float f_25_ = (float) i_21_ / f_16_;
		float f_26_ = (float) i_22_ / f_17_;
		float f_27_ = (float) i_23_ / f_16_;
		float f_28_ = (float) i_24_ / f_17_;
		fs[8] = (fs[8] + 1.0F) * f_25_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_26_ + 1.0F;
		fs[10] *= f_27_;
		fs[7] *= f_28_;
		((Class192_Sub1) this).aClass105_7354.method1267(((Class192_Sub1) this).aClass330_Sub15_Sub1_7338, fs, -468052265);
		((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7349, 0, interface11_impl3_18_, (byte) 7);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, -134148007);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / f_16_, 256.0F / f_17_, 1472371638);
		aClass_ra_Sub2_1879.ae(0, 0, i_21_, i_22_);
		aClass_ra_Sub2_1879.r(0, 0, i_21_, i_22_);
	}

	boolean method2121() {
		return ((Class192_Sub1) this).aBoolean7344;
	}

	void method2126(int i, Class76_Sub2 class76_sub2, Interface11_Impl3 interface11_impl3, Interface8_Impl1_Impl1 interface8_impl1_impl1, Interface11_Impl3 interface11_impl3_29_) {
		float f = aClass_ra_Sub2_1879.method4901();
		float f_30_ = (float) class76_sub2.method856();
		float f_31_ = (float) class76_sub2.method857();
		Interface11_Impl3 interface11_impl3_32_ = interface11_impl3;
		float f_33_ = f * 2.0F / f_30_;
		float f_34_ = -f * 2.0F / f_31_;
		float[] fs = { -1.0F + f_33_, 1.0F + f_34_, 0.0F, 0.0F, -1.0F + f_33_, -3.0F + f_34_, 0.0F, 2.0F, 3.0F + f_33_, 1.0F + f_34_, 2.0F, 0.0F };
		int i_35_ = (int) f_30_;
		int i_36_ = (int) f_31_;
		int i_37_ = i_35_;
		int i_38_ = i_36_;
		if (i == 0) {
			i_35_ = 256;
			i_36_ = 256;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7345);
			((Class192_Sub1) this).aClass105_7354.method1249();
		} else if (i == 1) {
			i_35_ = 256;
			i_36_ = 256;
			i_37_ = i_35_;
			i_38_ = i_36_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, aFloat7342 / f_30_, 0.0F, (byte) 107);
		} else if (i == 2) {
			i_35_ = 256;
			i_36_ = 256;
			i_37_ = i_35_;
			i_38_ = i_36_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / f_31_, (byte) 48);
		} else if (i == 3) {
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7347);
			interface11_impl3_32_ = interface11_impl3_29_;
			((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7350, 1, interface11_impl3, (byte) 100);
			((Class192_Sub1) this).aClass105_7354.method1249();
		}
		float f_39_ = (float) i_35_ / f_30_;
		float f_40_ = (float) i_36_ / f_31_;
		float f_41_ = (float) i_37_ / f_30_;
		float f_42_ = (float) i_38_ / f_31_;
		fs[8] = (fs[8] + 1.0F) * f_39_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_40_ + 1.0F;
		fs[10] *= f_41_;
		fs[7] *= f_42_;
		((Class192_Sub1) this).aClass105_7354.method1267(((Class192_Sub1) this).aClass330_Sub15_Sub1_7338, fs, -1774497982);
		((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7349, 0, interface11_impl3_32_, (byte) 118);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, 489186722);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / f_30_, 256.0F / f_31_, -922719645);
		aClass_ra_Sub2_1879.ae(0, 0, i_35_, i_36_);
		aClass_ra_Sub2_1879.r(0, 0, i_35_, i_36_);
	}

	boolean method2109() {
		return ((Class192_Sub1) this).aBoolean7344;
	}

	boolean method2110() {
		if (method2128()) {
			((Class192_Sub1) this).aClass105_7354 = aClass_ra_Sub2_1879.method4888("FilterBloom");
			if (((Class192_Sub1) this).aClass105_7354 == null)
				return false;
			try {
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7349 = ((Class192_Sub1) this).aClass105_7354.method1295("sceneTex", (byte) -12);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7350 = ((Class192_Sub1) this).aClass105_7354.method1295("bloomTex1", (byte) -8);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7352 = ((Class192_Sub1) this).aClass105_7354.method1295("params", (byte) -24);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7351 = ((Class192_Sub1) this).aClass105_7354.method1295("sampleSize", (byte) -123);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7353 = ((Class192_Sub1) this).aClass105_7354.method1295("pixelOffsetAndBloomScale", (byte) -55);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7338 = ((Class192_Sub1) this).aClass105_7354.method1295("PosAndTexCoords", (byte) -106);
				((Class192_Sub1) this).aClass105_7354.method1254("test", -335117481);
				((Class192_Sub1) this).aClass123_7343 = ((Class192_Sub1) this).aClass105_7354.method1254("techFullscreenTri", 1848981497);
				((Class192_Sub1) this).aClass123_7345 = ((Class192_Sub1) this).aClass105_7354.method1254("brightpass", 598092328);
				((Class192_Sub1) this).aClass123_7355 = ((Class192_Sub1) this).aClass105_7354.method1254("blur", -1092593792);
				((Class192_Sub1) this).aClass123_7347 = ((Class192_Sub1) this).aClass105_7354.method1254("composite", -1644520841);
				((Class192_Sub1) this).aClass123_7348 = ((Class192_Sub1) this).aClass105_7354.method1254("techDefault", -939790492);
			} catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
				return false;
			} catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
				return false;
			}
			if (!((Class192_Sub1) this).aClass123_7343.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7345.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7355.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7347.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7348.method1454())
				return false;
			((Class192_Sub1) this).aBoolean7344 = true;
			return true;
		}
		return false;
	}

	boolean method2111() {
		return ((Class192_Sub1) this).aBoolean7344;
	}

	void method2114() {
		/* empty */
	}

	void method2108() {
		/* empty */
	}

	int method2107() {
		return 1;
	}

	void method2100() {
		/* empty */
	}

	int method2129() {
		return 4;
	}

	void method2116(int i, int i_43_) {
		/* empty */
	}

	void method2117(int i, int i_44_) {
		/* empty */
	}

	boolean method2112() {
		if (method2128()) {
			((Class192_Sub1) this).aClass105_7354 = aClass_ra_Sub2_1879.method4888("FilterBloom");
			if (((Class192_Sub1) this).aClass105_7354 == null)
				return false;
			try {
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7349 = ((Class192_Sub1) this).aClass105_7354.method1295("sceneTex", (byte) -64);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7350 = ((Class192_Sub1) this).aClass105_7354.method1295("bloomTex1", (byte) -113);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7352 = ((Class192_Sub1) this).aClass105_7354.method1295("params", (byte) -39);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7351 = ((Class192_Sub1) this).aClass105_7354.method1295("sampleSize", (byte) -59);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7353 = ((Class192_Sub1) this).aClass105_7354.method1295("pixelOffsetAndBloomScale", (byte) -14);
				((Class192_Sub1) this).aClass330_Sub15_Sub1_7338 = ((Class192_Sub1) this).aClass105_7354.method1295("PosAndTexCoords", (byte) -8);
				((Class192_Sub1) this).aClass105_7354.method1254("test", -1480986540);
				((Class192_Sub1) this).aClass123_7343 = ((Class192_Sub1) this).aClass105_7354.method1254("techFullscreenTri", 220206553);
				((Class192_Sub1) this).aClass123_7345 = ((Class192_Sub1) this).aClass105_7354.method1254("brightpass", -1834924054);
				((Class192_Sub1) this).aClass123_7355 = ((Class192_Sub1) this).aClass105_7354.method1254("blur", -693825801);
				((Class192_Sub1) this).aClass123_7347 = ((Class192_Sub1) this).aClass105_7354.method1254("composite", 518750803);
				((Class192_Sub1) this).aClass123_7348 = ((Class192_Sub1) this).aClass105_7354.method1254("techDefault", 621422092);
			} catch (Exception_Sub2_Sub2 exception_sub2_sub2) {
				return false;
			} catch (Exception_Sub2_Sub1 exception_sub2_sub1) {
				return false;
			}
			if (!((Class192_Sub1) this).aClass123_7343.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7345.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7355.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7347.method1454())
				return false;
			if (!((Class192_Sub1) this).aClass123_7348.method1454())
				return false;
			((Class192_Sub1) this).aBoolean7344 = true;
			return true;
		}
		return false;
	}

	int method2130() {
		return 4;
	}

	int method2131() {
		return 1;
	}

	int method2132() {
		return 1;
	}

	void method2103(int i, int i_45_) {
		/* empty */
	}

	boolean method2119() {
		return ((Class192_Sub1) this).aBoolean7344;
	}

	void method2124(int i, Class76_Sub2 class76_sub2, Interface11_Impl3 interface11_impl3, Interface8_Impl1_Impl1 interface8_impl1_impl1, Interface11_Impl3 interface11_impl3_46_) {
		float f = aClass_ra_Sub2_1879.method4901();
		float f_47_ = (float) class76_sub2.method856();
		float f_48_ = (float) class76_sub2.method857();
		Interface11_Impl3 interface11_impl3_49_ = interface11_impl3;
		float f_50_ = f * 2.0F / f_47_;
		float f_51_ = -f * 2.0F / f_48_;
		float[] fs = { -1.0F + f_50_, 1.0F + f_51_, 0.0F, 0.0F, -1.0F + f_50_, -3.0F + f_51_, 0.0F, 2.0F, 3.0F + f_50_, 1.0F + f_51_, 2.0F, 0.0F };
		int i_52_ = (int) f_47_;
		int i_53_ = (int) f_48_;
		int i_54_ = i_52_;
		int i_55_ = i_53_;
		if (i == 0) {
			i_52_ = 256;
			i_53_ = 256;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7345);
			((Class192_Sub1) this).aClass105_7354.method1249();
		} else if (i == 1) {
			i_52_ = 256;
			i_53_ = 256;
			i_54_ = i_52_;
			i_55_ = i_53_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, aFloat7342 / f_47_, 0.0F, (byte) 42);
		} else if (i == 2) {
			i_52_ = 256;
			i_53_ = 256;
			i_54_ = i_52_;
			i_55_ = i_53_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / f_48_, (byte) 71);
		} else if (i == 3) {
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7347);
			interface11_impl3_49_ = interface11_impl3_46_;
			((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7350, 1, interface11_impl3, (byte) 116);
			((Class192_Sub1) this).aClass105_7354.method1249();
		}
		float f_56_ = (float) i_52_ / f_47_;
		float f_57_ = (float) i_53_ / f_48_;
		float f_58_ = (float) i_54_ / f_47_;
		float f_59_ = (float) i_55_ / f_48_;
		fs[8] = (fs[8] + 1.0F) * f_56_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_57_ + 1.0F;
		fs[10] *= f_58_;
		fs[7] *= f_59_;
		((Class192_Sub1) this).aClass105_7354.method1267(((Class192_Sub1) this).aClass330_Sub15_Sub1_7338, fs, -652851859);
		((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7349, 0, interface11_impl3_49_, (byte) 116);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, 1967515417);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / f_47_, 256.0F / f_48_, -1064840047);
		aClass_ra_Sub2_1879.ae(0, 0, i_52_, i_53_);
		aClass_ra_Sub2_1879.r(0, 0, i_52_, i_53_);
	}

	void method2125(int i, Class76_Sub2 class76_sub2, Interface11_Impl3 interface11_impl3, Interface8_Impl1_Impl1 interface8_impl1_impl1, Interface11_Impl3 interface11_impl3_60_) {
		float f = aClass_ra_Sub2_1879.method4901();
		float f_61_ = (float) class76_sub2.method856();
		float f_62_ = (float) class76_sub2.method857();
		Interface11_Impl3 interface11_impl3_63_ = interface11_impl3;
		float f_64_ = f * 2.0F / f_61_;
		float f_65_ = -f * 2.0F / f_62_;
		float[] fs = { -1.0F + f_64_, 1.0F + f_65_, 0.0F, 0.0F, -1.0F + f_64_, -3.0F + f_65_, 0.0F, 2.0F, 3.0F + f_64_, 1.0F + f_65_, 2.0F, 0.0F };
		int i_66_ = (int) f_61_;
		int i_67_ = (int) f_62_;
		int i_68_ = i_66_;
		int i_69_ = i_67_;
		if (i == 0) {
			i_66_ = 256;
			i_67_ = 256;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7345);
			((Class192_Sub1) this).aClass105_7354.method1249();
		} else if (i == 1) {
			i_66_ = 256;
			i_67_ = 256;
			i_68_ = i_66_;
			i_69_ = i_67_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, aFloat7342 / f_61_, 0.0F, (byte) 77);
		} else if (i == 2) {
			i_66_ = 256;
			i_67_ = 256;
			i_68_ = i_66_;
			i_69_ = i_67_;
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7355);
			((Class192_Sub1) this).aClass105_7354.method1249();
			((Class192_Sub1) this).aClass105_7354.method1262(((Class192_Sub1) this).aClass330_Sub15_Sub1_7351, 0.0F, aFloat7342 / f_62_, (byte) 35);
		} else if (i == 3) {
			((Class192_Sub1) this).aClass105_7354.method1258(((Class192_Sub1) this).aClass123_7347);
			interface11_impl3_63_ = interface11_impl3_60_;
			((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7350, 1, interface11_impl3, (byte) 25);
			((Class192_Sub1) this).aClass105_7354.method1249();
		}
		float f_70_ = (float) i_66_ / f_61_;
		float f_71_ = (float) i_67_ / f_62_;
		float f_72_ = (float) i_68_ / f_61_;
		float f_73_ = (float) i_69_ / f_62_;
		fs[8] = (fs[8] + 1.0F) * f_70_ - 1.0F;
		fs[5] = (fs[5] - 1.0F) * f_71_ + 1.0F;
		fs[10] *= f_72_;
		fs[7] *= f_73_;
		((Class192_Sub1) this).aClass105_7354.method1267(((Class192_Sub1) this).aClass330_Sub15_Sub1_7338, fs, -613379005);
		((Class192_Sub1) this).aClass105_7354.method1270(((Class192_Sub1) this).aClass330_Sub15_Sub1_7349, 0, interface11_impl3_63_, (byte) 44);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7352, aFloat7341, aFloat7339, aFloat7340, 0.0F, 1600105292);
		((Class192_Sub1) this).aClass105_7354.method1264(((Class192_Sub1) this).aClass330_Sub15_Sub1_7353, 0.0F, 0.0F, 256.0F / f_61_, 256.0F / f_62_, 1752044431);
		aClass_ra_Sub2_1879.ae(0, 0, i_66_, i_67_);
		aClass_ra_Sub2_1879.r(0, 0, i_66_, i_67_);
	}

	void method2101() {
		/* empty */
	}

	void method2118(int i) {
		((Class192_Sub1) this).aClass105_7354.method1250();
	}

	void method2127(int i) {
		((Class192_Sub1) this).aClass105_7354.method1250();
	}
}
