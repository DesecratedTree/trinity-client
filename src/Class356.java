/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class356 {
	int anInt3640;
	public int anInt3641;
	int anInt3642;
	int anInt3643;
	int anInt3644 = 16;
	Class_ra aClass_ra3645;
	Class509 aClass509_3646;
	boolean aBoolean3647;
	boolean aBoolean3648;
	public Class358 aClass358_3649;
	public int anInt3650;
	int anInt3651;
	long[][][] aLongArrayArrayArray3652;
	public Class340[][][] aClass340ArrayArrayArray3653;
	public int anInt3654;
	public Class340[][][] aClass340ArrayArrayArray3655;
	int anInt3656;
	public Class340[][][] aClass340ArrayArrayArray3657;
	public Class_xa[] aClass_xaArray3658;
	boolean[] aBooleanArray3659;
	boolean[][] aBooleanArrayArray3660;
	int anInt3661 = 0;
	byte[][] aByteArrayArray3662;
	byte[][] aByteArrayArray3663;
	byte[][] aByteArrayArray3664;
	int anInt3665;
	int anInt3666 = 10080;
	public int anInt3667;
	int anInt3668 = 5006;
	byte[][] aByteArrayArray3669;
	Class432_Sub1[] aClass432_Sub1Array3670;
	Class432_Sub1[] aClass432_Sub1Array3671;
	int anInt3672;
	int anInt3673;
	Class432_Sub1[] aClass432_Sub1Array3674;
	Class432_Sub1[] aClass432_Sub1Array3675;
	public Class_xa[] aClass_xaArray3676;
	int anInt3677;
	Class432_Sub1[] aClass432_Sub1Array3678;
	Class349[] aClass349Array3679;
	int anInt3680;
	int anInt3681;
	int anInt3682;
	int[][] anIntArrayArray3683;
	int anInt3684;
	Class432_Sub1_Sub1[] aClass432_Sub1_Sub1Array3685;
	int anInt3686;
	int anInt3687 = 5046;
	int anInt3688;
	int anInt3689;
	float[] aFloatArray3690;
	Class330_Sub14[] aClass330_Sub14Array3691;
	int anInt3692 = 65361;
	int anInt3693;
	public static boolean aBoolean3694 = true;
	short[][] aShortArrayArray3695;
	int anInt3696;
	public Class338 aClass338_3697;
	boolean[][] aBooleanArrayArray3698;
	int[] anIntArray3699;
	boolean[][] aBooleanArrayArray3700;
	public Class_xa[] aClass_xaArray3701;

	public void method4132(int i, int i_0_) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.r(").append(')').toString());
		}
	}

	public void method4133(Class263 class263, byte i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.j(").append(')').toString());
		}
	}

	public void method4134(boolean bool, byte i) {
		try {
			if (bool) {
				aClass340ArrayArrayArray3653 = aClass340ArrayArrayArray3657;
				aClass_xaArray3676 = aClass_xaArray3658;
			} else {
				aClass340ArrayArrayArray3653 = aClass340ArrayArrayArray3655;
				aClass_xaArray3676 = aClass_xaArray3701;
			}
			anInt3650 = aClass340ArrayArrayArray3653.length * 1316892419;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.i(").append(')').toString());
		}
	}

	public void method4135(byte i) {
		try {
			for (int i_1_ = 0; i_1_ < -265955713 * anInt3667; i_1_++) {
				for (int i_2_ = 0; i_2_ < 95955317 * anInt3654; i_2_++) {
					if (aClass340ArrayArrayArray3653[0][i_1_][i_2_] == null)
						aClass340ArrayArrayArray3653[0][i_1_][i_2_] = new Class340(0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.p(").append(')').toString());
		}
	}

	Class340 method4136(int i, int i_3_, int i_4_, byte i_5_) {
		try {
			if (aClass340ArrayArrayArray3653[i][i_3_][i_4_] == null) {
				boolean bool = (null != aClass340ArrayArrayArray3653[0][i_3_][i_4_] && null != (aClass340ArrayArrayArray3653[0][i_3_][i_4_].aClass340_3380));
				if (bool && i >= anInt3650 * 1886598059 - 1)
					return null;
				method4137(i, i_3_, i_4_, (byte) -53);
			}
			return aClass340ArrayArrayArray3653[i][i_3_][i_4_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.s(").append(')').toString());
		}
	}

	public void method4137(int i, int i_6_, int i_7_, byte i_8_) {
		try {
			boolean bool = (null != aClass340ArrayArrayArray3653[0][i_6_][i_7_] && (aClass340ArrayArrayArray3653[0][i_6_][i_7_].aClass340_3380) != null);
			for (int i_9_ = i; i_9_ >= 0; i_9_--) {
				if (aClass340ArrayArrayArray3653[i_9_][i_6_][i_7_] == null) {
					Class340 class340 = (aClass340ArrayArrayArray3653[i_9_][i_6_][i_7_] = new Class340(i_9_));
					if (bool)
						class340.aByte3381++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.f(").append(')').toString());
		}
	}

	public int method4138(int i, int i_10_, int i_11_) {
		try {
			return (null != ((Class356) this).anIntArrayArray3683 ? (((Class356) this).anIntArrayArray3683[i][i_10_] & 0xffffff) : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.n(").append(')').toString());
		}
	}

	public int method4139(int i, int i_12_, byte i_13_) {
		try {
			return (null != ((Class356) this).aByteArrayArray3662 ? ((Class356) this).aByteArrayArray3662[i][i_12_] & 0xff : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.b(").append(')').toString());
		}
	}

	public int method4140(int i, int i_14_, int i_15_) {
		try {
			return (((Class356) this).aByteArrayArray3663 != null ? ((Class356) this).aByteArrayArray3663[i][i_14_] & 0xff : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.k(").append(')').toString());
		}
	}

	public void method4141(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		try {
			if (null != ((Class356) this).anIntArrayArray3683)
				((Class356) this).anIntArrayArray3683[i][i_16_] = ~0xffffff | i_17_;
			if (null != ((Class356) this).aShortArrayArray3695)
				((Class356) this).aShortArrayArray3695[i][i_16_] = (short) i_18_;
			if (((Class356) this).aByteArrayArray3669 != null)
				((Class356) this).aByteArrayArray3669[i][i_16_] = (byte) i_19_;
			if (null != ((Class356) this).aByteArrayArray3662)
				((Class356) this).aByteArrayArray3662[i][i_16_] = (byte) i_20_;
			if (null != ((Class356) this).aByteArrayArray3663)
				((Class356) this).aByteArrayArray3663[i][i_16_] = (byte) i_21_;
			if (((Class356) this).aByteArrayArray3664 != null)
				((Class356) this).aByteArrayArray3664[i][i_16_] = (byte) i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.u(").append(')').toString());
		}
	}

	public void method4142(int i, int i_24_, int i_25_, Class432_Sub1_Sub4 class432_sub1_sub4, byte i_26_) {
		try {
			Class340 class340 = method4136(i, i_24_, i_25_, (byte) 16);
			if (null != class340) {
				class340.aClass432_Sub1_Sub4_3386 = class432_sub1_sub4;
				int i_27_ = aClass_xaArray3676 == aClass_xaArray3658 ? 1 : 0;
				if (class432_sub1_sub4.method5382(93762500)) {
					if (class432_sub1_sub4.method5395(1002424431)) {
						((Class432_Sub1_Sub4) class432_sub1_sub4).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3670[i_27_];
						((Class356) this).aClass432_Sub1Array3670[i_27_] = class432_sub1_sub4;
					} else {
						((Class432_Sub1_Sub4) class432_sub1_sub4).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3671[i_27_];
						((Class356) this).aClass432_Sub1Array3671[i_27_] = class432_sub1_sub4;
					}
				} else {
					((Class432_Sub1_Sub4) class432_sub1_sub4).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3678[i_27_];
					((Class356) this).aClass432_Sub1Array3678[i_27_] = class432_sub1_sub4;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.x(").append(')').toString());
		}
	}

	public void method4143(int i, int i_28_, int i_29_, int i_30_, Class432_Sub1_Sub2 class432_sub1_sub2, int i_31_) {
		try {
			Class340 class340 = method4136(i, i_28_, i_29_, (byte) 16);
			if (class340 != null) {
				class432_sub1_sub2.method5349(new Class260((float) ((((Class356) this).anInt3643 * 5094163) + (i_28_ << anInt3641 * 916917461)), (float) i_30_, (float) ((((Class356) this).anInt3643 * 5094163) + (i_29_ << 916917461 * anInt3641))));
				((Class340) class340).aClass432_Sub1_Sub2_3391 = class432_sub1_sub2;
				int i_32_ = aClass_xaArray3676 == aClass_xaArray3658 ? 1 : 0;
				if (class432_sub1_sub2.method5382(-31326851)) {
					if (class432_sub1_sub2.method5395(1526445933)) {
						((Class432_Sub1_Sub2) class432_sub1_sub2).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3670[i_32_];
						((Class356) this).aClass432_Sub1Array3670[i_32_] = class432_sub1_sub2;
					} else {
						((Class432_Sub1_Sub2) class432_sub1_sub2).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3671[i_32_];
						((Class356) this).aClass432_Sub1Array3671[i_32_] = class432_sub1_sub2;
					}
				} else {
					((Class432_Sub1_Sub2) class432_sub1_sub2).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3678[i_32_];
					((Class356) this).aClass432_Sub1Array3678[i_32_] = class432_sub1_sub2;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.g(").append(')').toString());
		}
	}

	public void method4144(int i, int i_33_, int i_34_, Class432_Sub1_Sub3 class432_sub1_sub3, Class432_Sub1_Sub3 class432_sub1_sub3_35_, int i_36_) {
		try {
			Class340 class340 = method4136(i, i_33_, i_34_, (byte) 16);
			if (class340 != null) {
				class340.aClass432_Sub1_Sub3_3384 = class432_sub1_sub3;
				class340.aClass432_Sub1_Sub3_3385 = class432_sub1_sub3_35_;
				int i_37_ = aClass_xaArray3676 == aClass_xaArray3658 ? 1 : 0;
				if (class432_sub1_sub3.method5382(-677214342)) {
					if (class432_sub1_sub3.method5395(895152694)) {
						((Class432_Sub1_Sub3) class432_sub1_sub3).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3670[i_37_];
						((Class356) this).aClass432_Sub1Array3670[i_37_] = class432_sub1_sub3;
					} else {
						((Class432_Sub1_Sub3) class432_sub1_sub3).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3671[i_37_];
						((Class356) this).aClass432_Sub1Array3671[i_37_] = class432_sub1_sub3;
					}
				} else {
					((Class432_Sub1_Sub3) class432_sub1_sub3).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3678[i_37_];
					((Class356) this).aClass432_Sub1Array3678[i_37_] = class432_sub1_sub3;
				}
				if (null != class432_sub1_sub3_35_) {
					if (class432_sub1_sub3_35_.method5382(495914029)) {
						if (class432_sub1_sub3_35_.method5395(1669573265)) {
							((Class432_Sub1_Sub3) class432_sub1_sub3_35_).aClass432_Sub1_8653 = (((Class356) this).aClass432_Sub1Array3670[i_37_]);
							((Class356) this).aClass432_Sub1Array3670[i_37_] = class432_sub1_sub3_35_;
						} else {
							((Class432_Sub1_Sub3) class432_sub1_sub3_35_).aClass432_Sub1_8653 = (((Class356) this).aClass432_Sub1Array3671[i_37_]);
							((Class356) this).aClass432_Sub1Array3671[i_37_] = class432_sub1_sub3_35_;
						}
					} else {
						((Class432_Sub1_Sub3) class432_sub1_sub3_35_).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3678[i_37_];
						((Class356) this).aClass432_Sub1Array3678[i_37_] = class432_sub1_sub3_35_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.c(").append(')').toString());
		}
	}

	public boolean method4145(Class432_Sub1_Sub1 class432_sub1_sub1, boolean bool, int i) {
		try {
			boolean bool_38_ = aClass_xaArray3676 == aClass_xaArray3658;
			int i_39_ = 0;
			short i_40_ = 0;
			byte i_41_ = 0;
			class432_sub1_sub1.method5406(987620598);
			if (class432_sub1_sub1.aShort9922 < 0 || class432_sub1_sub1.aShort9921 < 0 || class432_sub1_sub1.aShort9920 >= anInt3667 * -265955713 || class432_sub1_sub1.aShort9923 >= 95955317 * anInt3654)
				return false;
			short i_42_ = 0;
			for (int i_43_ = class432_sub1_sub1.aShort9922; i_43_ <= class432_sub1_sub1.aShort9920; i_43_++) {
				for (int i_44_ = class432_sub1_sub1.aShort9921; i_44_ <= class432_sub1_sub1.aShort9923; i_44_++) {
					Class340 class340 = method4136(class432_sub1_sub1.aByte8658, i_43_, i_44_, (byte) 16);
					if (class340 != null) {
						Class352 class352 = Class95_Sub2.method1110(class432_sub1_sub1, -772456061);
						Class352 class352_45_ = class340.aClass352_3388;
						if (null == class352_45_)
							class340.aClass352_3388 = class352;
						else {
							for (/**/; null != class352_45_.aClass352_3483; class352_45_ = class352_45_.aClass352_3483) {
								/* empty */
							}
							class352_45_.aClass352_3483 = class352;
						}
						if (bool_38_ && 0 != ((((Class356) this).anIntArrayArray3683[i_43_][i_44_]) & ~0xffffff)) {
							i_39_ = (((Class356) this).anIntArrayArray3683[i_43_][i_44_]);
							i_40_ = (((Class356) this).aShortArrayArray3695[i_43_][i_44_]);
							i_41_ = (((Class356) this).aByteArrayArray3669[i_43_][i_44_]);
						}
						if (!bool && class340.aClass432_Sub1_Sub4_3386 != null && (class340.aClass432_Sub1_Sub4_3386.aShort9927 > i_42_))
							i_42_ = class340.aClass432_Sub1_Sub4_3386.aShort9927;
					}
				}
			}
			if (bool_38_ && (i_39_ & ~0xffffff) != 0) {
				for (int i_46_ = class432_sub1_sub1.aShort9922; i_46_ <= class432_sub1_sub1.aShort9920; i_46_++) {
					for (int i_47_ = class432_sub1_sub1.aShort9921; i_47_ <= class432_sub1_sub1.aShort9923; i_47_++) {
						if (0 == ((((Class356) this).anIntArrayArray3683[i_46_][i_47_]) & ~0xffffff)) {
							((Class356) this).anIntArrayArray3683[i_46_][i_47_] = i_39_;
							((Class356) this).aShortArrayArray3695[i_46_][i_47_] = i_40_;
							((Class356) this).aByteArrayArray3669[i_46_][i_47_] = i_41_;
						}
					}
				}
			}
			if (bool) {
				((Class356) this).aClass432_Sub1_Sub1Array3685[((((Class356) this).anInt3661 += -916000687) * -1279764303 - 1)] = class432_sub1_sub1;
				class432_sub1_sub1.aClass356_8655 = this;
			} else {
				int i_48_ = aClass_xaArray3658 == aClass_xaArray3676 ? 1 : 0;
				if (class432_sub1_sub1.method5382(-1773334886)) {
					if (class432_sub1_sub1.method5395(512281498)) {
						((Class432_Sub1_Sub1) class432_sub1_sub1).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3670[i_48_];
						((Class356) this).aClass432_Sub1Array3670[i_48_] = class432_sub1_sub1;
					} else {
						((Class432_Sub1_Sub1) class432_sub1_sub1).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3671[i_48_];
						((Class356) this).aClass432_Sub1Array3671[i_48_] = class432_sub1_sub1;
					}
				} else {
					((Class432_Sub1_Sub1) class432_sub1_sub1).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3678[i_48_];
					((Class356) this).aClass432_Sub1Array3678[i_48_] = class432_sub1_sub1;
				}
			}
			if (bool) {
				Class260 class260 = Class260.method2549(class432_sub1_sub1.method5346().aClass260_2606);
				class260.aFloat2715 -= (float) i_42_;
				class432_sub1_sub1.method5349(class260);
				class260.method2550();
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.a(").append(')').toString());
		}
	}

	public void method4146(int i) {
		try {
			for (int i_49_ = 0; i_49_ < ((Class356) this).anInt3661 * -1279764303; i_49_++) {
				Class432_Sub1_Sub1 class432_sub1_sub1 = ((Class356) this).aClass432_Sub1_Sub1Array3685[i_49_];
				method4152(class432_sub1_sub1, true, -1916595763);
				((Class356) this).aClass432_Sub1_Sub1Array3685[i_49_] = null;
			}
			((Class356) this).anInt3661 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.m(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub5 method4147(int i, int i_50_, int i_51_, byte i_52_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_50_][i_51_];
			if (class340 != null) {
				method4153(class340.aClass432_Sub1_Sub5_3383, -177336810);
				if (null != class340.aClass432_Sub1_Sub5_3383) {
					Class432_Sub1_Sub5 class432_sub1_sub5 = class340.aClass432_Sub1_Sub5_3383;
					class340.aClass432_Sub1_Sub5_3383 = null;
					return class432_sub1_sub5;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.h(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub3 method4148(int i, int i_53_, int i_54_, byte i_55_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_53_][i_54_];
			if (null != class340) {
				method4153(class340.aClass432_Sub1_Sub3_3384, -171560969);
				if (null != class340.aClass432_Sub1_Sub3_3384) {
					Class432_Sub1_Sub3 class432_sub1_sub3 = class340.aClass432_Sub1_Sub3_3384;
					class340.aClass432_Sub1_Sub3_3384 = null;
					return class432_sub1_sub3;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.y(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub3 method4149(int i, int i_56_, int i_57_, int i_58_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_56_][i_57_];
			if (null != class340) {
				method4153(class340.aClass432_Sub1_Sub3_3385, 306199611);
				if (null != class340.aClass432_Sub1_Sub3_3385) {
					Class432_Sub1_Sub3 class432_sub1_sub3 = class340.aClass432_Sub1_Sub3_3385;
					class340.aClass432_Sub1_Sub3_3385 = null;
					return class432_sub1_sub3;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.v(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub4 method4150(int i, int i_59_, int i_60_, int i_61_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_59_][i_60_];
			if (null == class340)
				return null;
			method4153(class340.aClass432_Sub1_Sub4_3386, 501510921);
			if (null != class340.aClass432_Sub1_Sub4_3386) {
				Class432_Sub1_Sub4 class432_sub1_sub4 = class340.aClass432_Sub1_Sub4_3386;
				class340.aClass432_Sub1_Sub4_3386 = null;
				return class432_sub1_sub4;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ay(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub2 method4151(int i, int i_62_, int i_63_, int i_64_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_62_][i_63_];
			if (null == class340)
				return null;
			Class432_Sub1_Sub2 class432_sub1_sub2 = ((Class340) class340).aClass432_Sub1_Sub2_3391;
			((Class340) class340).aClass432_Sub1_Sub2_3391 = null;
			method4153(class432_sub1_sub2, 699142012);
			return class432_sub1_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ac(").append(')').toString());
		}
	}

	void method4152(Class432_Sub1_Sub1 class432_sub1_sub1, boolean bool, int i) {
		try {
			for (int i_65_ = class432_sub1_sub1.aShort9922; i_65_ <= class432_sub1_sub1.aShort9920; i_65_++) {
				for (int i_66_ = class432_sub1_sub1.aShort9921; i_66_ <= class432_sub1_sub1.aShort9923; i_66_++) {
					Class340 class340 = (aClass340ArrayArrayArray3653[class432_sub1_sub1.aByte8658][i_65_][i_66_]);
					if (class340 != null) {
						Class352 class352 = class340.aClass352_3388;
						Class352 class352_67_ = null;
						for (/**/; class352 != null; class352 = class352.aClass352_3483) {
							if (class432_sub1_sub1 == class352.aClass432_Sub1_Sub1_3484) {
								if (class352_67_ != null)
									class352_67_.aClass352_3483 = class352.aClass352_3483;
								else
									class340.aClass352_3388 = class352.aClass352_3483;
								class352.method4070(1161161265);
								break;
							}
							class352_67_ = class352;
						}
					}
				}
			}
			if (!bool)
				method4153(class432_sub1_sub1, -176937891);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.at(").append(')').toString());
		}
	}

	void method4153(Class432_Sub1 class432_sub1, int i) {
		try {
			if (null != class432_sub1) {
				class432_sub1.method5352();
				for (int i_68_ = 0; i_68_ < 2; i_68_++) {
					Class432_Sub1 class432_sub1_69_ = null;
					for (Class432_Sub1 class432_sub1_70_ = (((Class356) this).aClass432_Sub1Array3671[i_68_]); class432_sub1_70_ != null; class432_sub1_70_ = (((Class432_Sub1) class432_sub1_70_).aClass432_Sub1_8653)) {
						if (class432_sub1 == class432_sub1_70_) {
							if (null != class432_sub1_69_)
								((Class432_Sub1) class432_sub1_69_).aClass432_Sub1_8653 = (((Class432_Sub1) class432_sub1_70_).aClass432_Sub1_8653);
							else
								((Class356) this).aClass432_Sub1Array3671[i_68_] = (((Class432_Sub1) class432_sub1_70_).aClass432_Sub1_8653);
							return;
						}
						class432_sub1_69_ = class432_sub1_70_;
					}
					class432_sub1_69_ = null;
					for (Class432_Sub1 class432_sub1_71_ = (((Class356) this).aClass432_Sub1Array3670[i_68_]); null != class432_sub1_71_; class432_sub1_71_ = (((Class432_Sub1) class432_sub1_71_).aClass432_Sub1_8653)) {
						if (class432_sub1 == class432_sub1_71_) {
							if (class432_sub1_69_ != null)
								((Class432_Sub1) class432_sub1_69_).aClass432_Sub1_8653 = (((Class432_Sub1) class432_sub1_71_).aClass432_Sub1_8653);
							else
								((Class356) this).aClass432_Sub1Array3670[i_68_] = (((Class432_Sub1) class432_sub1_71_).aClass432_Sub1_8653);
							return;
						}
						class432_sub1_69_ = class432_sub1_71_;
					}
					class432_sub1_69_ = null;
					for (Class432_Sub1 class432_sub1_72_ = (((Class356) this).aClass432_Sub1Array3678[i_68_]); null != class432_sub1_72_; class432_sub1_72_ = (((Class432_Sub1) class432_sub1_72_).aClass432_Sub1_8653)) {
						if (class432_sub1_72_ == class432_sub1) {
							if (null != class432_sub1_69_)
								((Class432_Sub1) class432_sub1_69_).aClass432_Sub1_8653 = (((Class432_Sub1) class432_sub1_72_).aClass432_Sub1_8653);
							else
								((Class356) this).aClass432_Sub1Array3678[i_68_] = (((Class432_Sub1) class432_sub1_72_).aClass432_Sub1_8653);
							return;
						}
						class432_sub1_69_ = class432_sub1_72_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.aw(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub5 method4154(int i, int i_73_, int i_74_, int i_75_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_73_][i_74_];
			if (null == class340)
				return null;
			return class340.aClass432_Sub1_Sub5_3382;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ap(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub5 method4155(int i, int i_76_, int i_77_, int i_78_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_76_][i_77_];
			if (null == class340)
				return null;
			return class340.aClass432_Sub1_Sub5_3383;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ai(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub3 method4156(int i, int i_79_, int i_80_, int i_81_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_79_][i_80_];
			if (class340 == null)
				return null;
			return class340.aClass432_Sub1_Sub3_3384;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.as(").append(')').toString());
		}
	}

	public int method4157(int i, int i_82_, int i_83_) {
		try {
			return (null != ((Class356) this).aShortArrayArray3695 ? ((Class356) this).aShortArrayArray3695[i][i_82_] & 0xffff : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.w(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub1 method4158(int i, int i_84_, int i_85_, Interface19 interface19, byte i_86_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_84_][i_85_];
			if (class340 == null)
				return null;
			for (Class352 class352 = class340.aClass352_3388; null != class352; class352 = class352.aClass352_3483) {
				Class432_Sub1_Sub1 class432_sub1_sub1 = class352.aClass432_Sub1_Sub1_3484;
				if ((interface19 == null || interface19.method279(class432_sub1_sub1, 1106846753)) && class432_sub1_sub1.aShort9922 == i_84_ && class432_sub1_sub1.aShort9921 == i_85_)
					return class432_sub1_sub1;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ax(").append(')').toString());
		}
	}

	public Class352 method4159(int i, int i_87_, int i_88_, byte i_89_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_87_][i_88_];
			if (null == class340)
				return null;
			return class340.aClass352_3388;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ad(").append(')').toString());
		}
	}

	void method4160(Class432_Sub1 class432_sub1, int i, int i_90_, int i_91_, int i_92_) {
		try {
			if (i_90_ < anInt3667 * -265955713) {
				Class340 class340 = aClass340ArrayArrayArray3653[i][1 + i_90_][i_91_];
				if (class340 != null && class340.aClass432_Sub1_Sub4_3386 != null && class340.aClass432_Sub1_Sub4_3386.method5360((short) 15410)) {
					int i_93_ = (((aClass_xaArray3676[i].method6417(1 + i_90_, i_91_, -523616061) + aClass_xaArray3676[i].method6417(1 + (1 + i_90_), i_91_, 810075607) + aClass_xaArray3676[i].method6417(i_90_ + 1, i_91_ + 1, -786187269) + aClass_xaArray3676[i].method6417(1 + (1 + i_90_), 1 + i_91_, -1596412967)) / 4) - ((aClass_xaArray3676[i].method6417(i_90_, i_91_, 2129660045) + aClass_xaArray3676[i].method6417(1 + i_90_, i_91_, 2139283459) + aClass_xaArray3676[i].method6417(i_90_, 1 + i_91_, 161730017) + aClass_xaArray3676[i].method6417(1 + i_90_, 1 + i_91_, -1642592970)) / 4));
					class432_sub1.method5392(((Class356) this).aClass_ra3645, class340.aClass432_Sub1_Sub4_3386, (((Class356) this).anInt3656 * 415703703), i_93_, 0, true, 1198125389);
				}
			}
			if (i_91_ < -265955713 * anInt3667) {
				Class340 class340 = aClass340ArrayArrayArray3653[i][i_90_][i_91_ + 1];
				if (null != class340 && null != class340.aClass432_Sub1_Sub4_3386 && class340.aClass432_Sub1_Sub4_3386.method5360((short) 13910)) {
					int i_94_ = ((aClass_xaArray3676[i].method6417(i_90_, i_91_, -615730710) + aClass_xaArray3676[i].method6417(i_90_ + 1, i_91_ + 1, -101013461) + aClass_xaArray3676[i].method6417(i_90_, i_91_ + 1 + 1, 1674810612) + aClass_xaArray3676[i].method6417(i_90_ + 1, i_91_ + 1 + 1, -828381251)) / 4 - ((aClass_xaArray3676[i].method6417(i_90_, i_91_, 341097088) + aClass_xaArray3676[i].method6417(1 + i_90_, i_91_, -1404022210) + aClass_xaArray3676[i].method6417(i_90_, i_91_ + 1, 2061479686) + aClass_xaArray3676[i].method6417(i_90_ + 1, 1 + i_91_, -958969916)) / 4));
					class432_sub1.method5392(((Class356) this).aClass_ra3645, class340.aClass432_Sub1_Sub4_3386, 0, i_94_, (415703703 * ((Class356) this).anInt3656), true, 1198125389);
				}
			}
			if (i_90_ < anInt3667 * -265955713 && i_91_ < 95955317 * anInt3654) {
				Class340 class340 = aClass340ArrayArrayArray3653[i][1 + i_90_][i_91_ + 1];
				if (class340 != null && null != class340.aClass432_Sub1_Sub4_3386 && class340.aClass432_Sub1_Sub4_3386.method5360((short) 29716)) {
					int i_95_ = (((aClass_xaArray3676[i].method6417(1 + i_90_, 1 + i_91_, -2143438130) + aClass_xaArray3676[i].method6417(1 + (1 + i_90_), 1 + i_91_, 1516515705) + aClass_xaArray3676[i].method6417(i_90_ + 1, 1 + i_91_ + 1, -1837452871) + aClass_xaArray3676[i].method6417(i_90_ + 1 + 1, 1 + (1 + i_91_), -1547313680)) / 4) - ((aClass_xaArray3676[i].method6417(i_90_, i_91_, -1529286629) + aClass_xaArray3676[i].method6417(1 + i_90_, i_91_, 1901941357) + aClass_xaArray3676[i].method6417(i_90_, 1 + i_91_, -577350527) + aClass_xaArray3676[i].method6417(i_90_ + 1, i_91_ + 1, 145383739)) / 4));
					class432_sub1.method5392(((Class356) this).aClass_ra3645, class340.aClass432_Sub1_Sub4_3386, (((Class356) this).anInt3656 * 415703703), i_95_, (415703703 * ((Class356) this).anInt3656), true, 1198125389);
				}
			}
			if (i_90_ < anInt3667 * -265955713 && i_91_ > 0) {
				Class340 class340 = aClass340ArrayArrayArray3653[i][i_90_ + 1][i_91_ - 1];
				if (class340 != null && class340.aClass432_Sub1_Sub4_3386 != null && class340.aClass432_Sub1_Sub4_3386.method5360((short) 18875)) {
					int i_96_ = ((aClass_xaArray3676[i].method6417(1 + i_90_, i_91_ - 1, -663419260) + aClass_xaArray3676[i].method6417(1 + (i_90_ + 1), i_91_ - 1, -1775676169) + aClass_xaArray3676[i].method6417(i_90_ + 1, i_91_ + 1 - 1, -1353196899) + aClass_xaArray3676[i].method6417(1 + i_90_ + 1, 1 + i_91_ - 1, 2136867048)) / 4 - ((aClass_xaArray3676[i].method6417(i_90_, i_91_, 1835999986) + aClass_xaArray3676[i].method6417(i_90_ + 1, i_91_, -295860667) + aClass_xaArray3676[i].method6417(i_90_, i_91_ + 1, -361775837) + aClass_xaArray3676[i].method6417(1 + i_90_, 1 + i_91_, 1340939918)) / 4));
					class432_sub1.method5392(((Class356) this).aClass_ra3645, class340.aClass432_Sub1_Sub4_3386, (((Class356) this).anInt3656 * 415703703), i_96_, -(415703703 * ((Class356) this).anInt3656), true, 1198125389);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.aq(").append(')').toString());
		}
	}

	public void method4161(int i, int i_97_, int i_98_, int i_99_, byte[][][] is, int[] is_100_, int[] is_101_, int[] is_102_, int[] is_103_, int[] is_104_, int i_105_, byte i_106_, int i_107_, int i_108_, boolean bool, boolean bool_109_, int i_110_, boolean bool_111_) {
		((Class358) aClass358_3649).aBoolean3706 = true;
		((Class356) this).aBoolean3648 = bool_109_;
		((Class356) this).anInt3640 = 383801333 * (i_97_ >> 916917461 * anInt3641);
		((Class356) this).anInt3651 = (i_99_ >> anInt3641 * 916917461) * 2047960133;
		((Class356) this).anInt3665 = i_97_ * 495894291;
		((Class356) this).anInt3680 = i_99_ * 1381488259;
		((Class356) this).anInt3677 = i_98_ * 770954457;
		((Class356) this).anInt3686 = (833179871 * ((Class356) this).anInt3640 - -415400821 * ((Class356) this).anInt3673);
		if (((Class356) this).anInt3686 * 1508380227 < 0) {
			((Class356) this).anInt3684 = -(((Class356) this).anInt3686 * 2091626267);
			((Class356) this).anInt3686 = 0;
		} else
			((Class356) this).anInt3684 = 0;
		((Class356) this).anInt3688 = (((Class356) this).anInt3651 * 690603243 - ((Class356) this).anInt3673 * 1820630519);
		if (-83854233 * ((Class356) this).anInt3688 < 0) {
			((Class356) this).anInt3642 = -(((Class356) this).anInt3688 * -1405568687);
			((Class356) this).anInt3688 = 0;
		} else
			((Class356) this).anInt3642 = 0;
		((Class356) this).anInt3689 = (((Class356) this).anInt3640 * 561027835 + ((Class356) this).anInt3673 * 887951831);
		if (((Class356) this).anInt3689 * -711571833 > anInt3667 * -265955713)
			((Class356) this).anInt3689 = anInt3667 * -1228212663;
		((Class356) this).anInt3696 = (1809099331 * ((Class356) this).anInt3651 + ((Class356) this).anInt3673 * 102826927);
		if (((Class356) this).anInt3696 * -1399464209 > anInt3654 * 95955317)
			((Class356) this).anInt3696 = anInt3654 * -1026245157;
		boolean[][] bools = ((Class356) this).aBooleanArrayArray3700;
		boolean[][] bools_112_ = ((Class356) this).aBooleanArrayArray3698;
		if (((Class356) this).aBoolean3648) {
			for (int i_113_ = 0; i_113_ < 2 + (316617313 * ((Class356) this).anInt3673 + 316617313 * ((Class356) this).anInt3673); i_113_++) {
				int i_114_ = 0;
				int i_115_ = 0;
				for (int i_116_ = 0; i_116_ < (316617313 * ((Class356) this).anInt3673 + 316617313 * ((Class356) this).anInt3673 + 2); i_116_++) {
					if (i_116_ > 1)
						((Class356) this).anIntArray3699[i_116_ - 2] = i_114_;
					i_114_ = i_115_;
					int i_117_ = i_113_ + (315907165 * ((Class356) this).anInt3640 - ((Class356) this).anInt3673 * 316617313);
					int i_118_ = i_116_ + (((Class356) this).anInt3651 * 875564685 - 316617313 * ((Class356) this).anInt3673);
					if (i_117_ >= 0 && i_118_ >= 0 && i_117_ < -265955713 * anInt3667 && i_118_ < 95955317 * anInt3654) {
						int i_119_ = i_117_ << 916917461 * anInt3641;
						int i_120_ = i_118_ << 916917461 * anInt3641;
						int i_121_ = (aClass_xaArray3701[aClass_xaArray3701.length - 1].method6417(i_117_, i_118_, -205589578) - (1000 << 916917461 * anInt3641 - 7));
						int i_122_ = ((aClass_xaArray3658 != null ? (aClass_xaArray3658[0].method6417(i_117_, i_118_, 1875738700) + 415703703 * ((Class356) this).anInt3656) : (aClass_xaArray3701[0].method6417(i_117_, i_118_, -1149869294) + ((Class356) this).anInt3656 * 415703703)) + (1000 << 916917461 * anInt3641 - 7));
						i_115_ = ((Class356) this).aClass_ra3645.bp(i_119_, i_121_, i_120_, i_119_, i_122_, i_120_);
						((Class356) this).aBooleanArrayArray3698[i_113_][i_116_] = i_115_ == 0;
					} else {
						i_115_ = -1;
						((Class356) this).aBooleanArrayArray3698[i_113_][i_116_] = false;
					}
					if (i_113_ > 0 && i_116_ > 0) {
						int i_123_ = (((Class356) this).anIntArray3699[i_116_ - 1] & ((Class356) this).anIntArray3699[i_116_] & i_114_ & i_115_);
						((Class356) this).aBooleanArrayArray3700[i_113_ - 1][i_116_ - 1] = i_123_ == 0;
					}
				}
				((Class356) this).anIntArray3699[(((Class356) this).anInt3673 * 316617313 + 316617313 * ((Class356) this).anInt3673)] = i_114_;
				((Class356) this).anIntArray3699[1 + (316617313 * ((Class356) this).anInt3673 + 316617313 * ((Class356) this).anInt3673)] = i_115_;
			}
			if (!bool_111_)
				((Class358) aClass358_3649).aBoolean3706 = false;
			else {
				((Class358) aClass358_3649).anIntArray3708 = is_100_;
				((Class358) aClass358_3649).anIntArray3722 = is_101_;
				((Class358) aClass358_3649).anIntArray3707 = is_102_;
				((Class358) aClass358_3649).anIntArray3727 = is_103_;
				((Class358) aClass358_3649).anIntArray3729 = is_104_;
				aClass358_3649.method4222(((Class356) this).aClass_ra3645, i_105_);
			}
		} else {
			if (null == ((Class356) this).aBooleanArrayArray3660)
				((Class356) this).aBooleanArrayArray3660 = (new boolean[2 + (((Class356) this).anInt3673 * 316617313 + 316617313 * ((Class356) this).anInt3673)][2 + (316617313 * ((Class356) this).anInt3673 + 316617313 * ((Class356) this).anInt3673)]);
			for (int i_124_ = 0; i_124_ < ((Class356) this).aBooleanArrayArray3660.length; i_124_++) {
				for (int i_125_ = 0; (i_125_ < ((Class356) this).aBooleanArrayArray3660[0].length); i_125_++)
					((Class356) this).aBooleanArrayArray3660[i_124_][i_125_] = true;
			}
			((Class356) this).aBooleanArrayArray3698 = ((Class356) this).aBooleanArrayArray3660;
			((Class356) this).aBooleanArrayArray3700 = ((Class356) this).aBooleanArrayArray3660;
			((Class356) this).anInt3686 = 0;
			((Class356) this).anInt3688 = 0;
			((Class356) this).anInt3689 = anInt3667 * -1228212663;
			((Class356) this).anInt3696 = anInt3654 * -1026245157;
			((Class358) aClass358_3649).aBoolean3706 = false;
		}
		Class370.method4318(this, ((Class356) this).aClass_ra3645, -1200572325);
		if (!((Class338) aClass338_3697).aBoolean3370) {
			Iterator iterator = aClass338_3697.aList3373.iterator();
			while (iterator.hasNext()) {
				Class353 class353 = (Class353) iterator.next();
				iterator.remove();
				Class227.method2312(class353, 1251898116);
			}
		}
		if (((Class356) this).aBoolean3647) {
			for (int i_126_ = 0; i_126_ < ((Class356) this).anInt3693 * -2121762059; i_126_++)
				((Class356) this).aClass349Array3679[i_126_].method4024(i, bool, 614058570);
		}
		if (aClass340ArrayArrayArray3657 != null) {
			method4134(true, (byte) 124);
			((Class356) this).aClass_ra3645.dg(-1, new Class77(1583160, 40, 127, 63, 0, 0, 0));
			method4164(true, is, i_105_, i_106_, i_110_);
			((Class356) this).aClass_ra3645.O();
			method4134(false, (byte) 65);
		}
		method4164(false, is, i_105_, i_106_, i_110_);
		if (!((Class356) this).aBoolean3648) {
			((Class356) this).aBooleanArrayArray3700 = bools;
			((Class356) this).aBooleanArrayArray3698 = bools_112_;
		}
	}

	public void method4162() {
		for (int i = 0; i < 1886598059 * anInt3650; i++) {
			for (int i_127_ = 0; i_127_ < anInt3667 * -265955713; i_127_++) {
				for (int i_128_ = 0; i_128_ < 95955317 * anInt3654; i_128_++) {
					Class340 class340 = aClass340ArrayArrayArray3653[i][i_127_][i_128_];
					if (null != class340) {
						Class432_Sub1_Sub5 class432_sub1_sub5 = class340.aClass432_Sub1_Sub5_3382;
						Class432_Sub1_Sub5 class432_sub1_sub5_129_ = class340.aClass432_Sub1_Sub5_3383;
						if (class432_sub1_sub5 != null && class432_sub1_sub5.method5360((short) 19724)) {
							method4171(class432_sub1_sub5, i, i_127_, i_128_, 1, 1);
							if (class432_sub1_sub5_129_ != null && class432_sub1_sub5_129_.method5360((short) 27474)) {
								method4171(class432_sub1_sub5_129_, i, i_127_, i_128_, 1, 1);
								class432_sub1_sub5_129_.method5392(((Class356) this).aClass_ra3645, class432_sub1_sub5, 0, 0, 0, false, 1198125389);
								class432_sub1_sub5_129_.method5393(77834862);
							}
							class432_sub1_sub5.method5393(1108987533);
						}
						for (Class352 class352 = class340.aClass352_3388; null != class352; class352 = class352.aClass352_3483) {
							Class432_Sub1_Sub1 class432_sub1_sub1 = class352.aClass432_Sub1_Sub1_3484;
							if (class432_sub1_sub1 != null && class432_sub1_sub1.method5360((short) 20567)) {
								method4171(class432_sub1_sub1, i, i_127_, i_128_, 1 + (class432_sub1_sub1.aShort9920 - (class432_sub1_sub1.aShort9922)), 1 + (class432_sub1_sub1.aShort9923 - (class432_sub1_sub1.aShort9921)));
								class432_sub1_sub1.method5393(-85457232);
							}
						}
						Class432_Sub1_Sub4 class432_sub1_sub4 = class340.aClass432_Sub1_Sub4_3386;
						if (class432_sub1_sub4 != null && class432_sub1_sub4.method5360((short) 16744)) {
							method4160(class432_sub1_sub4, i, i_127_, i_128_, -307989589);
							class432_sub1_sub4.method5393(-47635591);
						}
					}
				}
			}
		}
	}

	void method4163(Class432_Sub1 class432_sub1, int i) {
		try {
			Class260 class260 = class432_sub1.method5346().aClass260_2606;
			((Class356) this).aClass_ra3645.method_do((float) (int) class260.aFloat2716, (float) ((int) class260.aFloat2715 + (class432_sub1.method5370(1175606023) >> 1)), (float) (int) class260.aFloat2711, ((Class356) this).aFloatArray3690);
			((Class432_Sub1) class432_sub1).anInt8657 = (int) ((Class356) this).aFloatArray3690[2] * 709430625;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ag(").append(')').toString());
		}
	}

	void method4164(boolean bool, byte[][][] is, int i, byte i_130_, int i_131_) {
		int i_132_ = bool ? 1 : 0;
		((Class356) this).anInt3672 = 0;
		((Class356) this).anInt3681 = 0;
		((Class356) this).anInt3682 += 1201601163;
		if (0 == (i_131_ & 0x2)) {
			for (Class432_Sub1 class432_sub1 = ((Class356) this).aClass432_Sub1Array3671[i_132_]; null != class432_sub1; class432_sub1 = ((Class432_Sub1) class432_sub1).aClass432_Sub1_8653) {
				method4163(class432_sub1, 2065572003);
				if (-1 != (((Class432_Sub1) class432_sub1).anInt8657 * -1215277407) && !method4165(class432_sub1, bool, is, i, i_130_))
					((Class356) this).aClass432_Sub1Array3675[((((Class356) this).anInt3672 += 924300629) * -1003839491) - 1] = class432_sub1;
			}
		}
		if ((i_131_ & 0x1) == 0) {
			for (Class432_Sub1 class432_sub1 = ((Class356) this).aClass432_Sub1Array3670[i_132_]; null != class432_sub1; class432_sub1 = ((Class432_Sub1) class432_sub1).aClass432_Sub1_8653) {
				method4163(class432_sub1, 1839996469);
				if ((-1215277407 * ((Class432_Sub1) class432_sub1).anInt8657 != -1) && !method4165(class432_sub1, bool, is, i, i_130_))
					((Class356) this).aClass432_Sub1Array3674[((((Class356) this).anInt3681 += 1063149301) * -2063147683) - 1] = class432_sub1;
			}
			for (Class432_Sub1 class432_sub1 = ((Class356) this).aClass432_Sub1Array3678[i_132_]; null != class432_sub1; class432_sub1 = ((Class432_Sub1) class432_sub1).aClass432_Sub1_8653) {
				method4163(class432_sub1, 1341385006);
				if (-1 != (-1215277407 * ((Class432_Sub1) class432_sub1).anInt8657) && !method4165(class432_sub1, bool, is, i, i_130_)) {
					if (class432_sub1.method5395(1473684780))
						((Class356) this).aClass432_Sub1Array3674[((((Class356) this).anInt3681 += 1063149301) * -2063147683) - 1] = class432_sub1;
					else
						((Class356) this).aClass432_Sub1Array3675[((((Class356) this).anInt3672 += 924300629) * -1003839491) - 1] = class432_sub1;
				}
			}
			if (!bool) {
				for (int i_133_ = 0; i_133_ < -1279764303 * ((Class356) this).anInt3661; i_133_++) {
					method4163((((Class356) this).aClass432_Sub1_Sub1Array3685[i_133_]), 1130270948);
					if ((((Class432_Sub1_Sub1) (((Class356) this).aClass432_Sub1_Sub1Array3685[i_133_])).anInt8657 * -1215277407) != -1 && !method4165((((Class356) this).aClass432_Sub1_Sub1Array3685[i_133_]), bool, is, i, i_130_)) {
						if (((Class356) this).aClass432_Sub1_Sub1Array3685[i_133_].method5395(1102195927))
							((Class356) this).aClass432_Sub1Array3674[((((Class356) this).anInt3681 += 1063149301) * -2063147683) - 1] = (((Class356) this).aClass432_Sub1_Sub1Array3685[i_133_]);
						else
							((Class356) this).aClass432_Sub1Array3675[((((Class356) this).anInt3672 += 924300629) * -1003839491) - 1] = (((Class356) this).aClass432_Sub1_Sub1Array3685[i_133_]);
					}
				}
			}
		}
		if (-1003839491 * ((Class356) this).anInt3672 > 0) {
			method4172(((Class356) this).aClass432_Sub1Array3675, 0, ((Class356) this).anInt3672 * -1003839491 - 1);
			for (int i_134_ = 0; i_134_ < ((Class356) this).anInt3672 * -1003839491; i_134_++)
				method4166(((Class356) this).aClass432_Sub1Array3675[i_134_], ((Class356) this).aClass330_Sub14Array3691);
		}
		if (((Class356) this).aBoolean3647)
			((Class356) this).aClass_ra3645.ck(0, null);
		if ((i_131_ & 0x2) == 0) {
			for (int i_135_ = 0; i_135_ < 1886598059 * anInt3650; i_135_++) {
				if (i_135_ >= i && null != is) {
					int i_136_ = ((Class356) this).aBooleanArrayArray3700.length;
					if ((((Class356) this).anInt3686 * 1508380227 + ((Class356) this).aBooleanArrayArray3700.length) > anInt3667 * -265955713)
						i_136_ -= (((Class356) this).aBooleanArrayArray3700.length + ((Class356) this).anInt3686 * 1508380227 - -265955713 * anInt3667);
					int i_137_ = ((Class356) this).aBooleanArrayArray3700[0].length;
					if ((((Class356) this).aBooleanArrayArray3700[0].length + ((Class356) this).anInt3688 * -83854233) > anInt3654 * 95955317)
						i_137_ -= ((((Class356) this).aBooleanArrayArray3700[0]).length + ((Class356) this).anInt3688 * -83854233 - anInt3654 * 95955317);
					boolean[][] bools = ((Class356) this).aBooleanArrayArray3698;
					if (((Class356) this).aBoolean3648) {
						for (int i_138_ = ((Class356) this).anInt3684 * -193787911; i_138_ < i_136_; i_138_++) {
							int i_139_ = (i_138_ + 1508380227 * ((Class356) this).anInt3686 - -193787911 * ((Class356) this).anInt3684);
							for (int i_140_ = (-1847923657 * ((Class356) this).anInt3642); i_140_ < i_137_; i_140_++) {
								bools[i_138_][i_140_] = false;
								if (((Class356) this).aBooleanArrayArray3700[i_138_][i_140_]) {
									int i_141_ = (i_140_ + (-83854233 * ((Class356) this).anInt3688) - (-1847923657 * ((Class356) this).anInt3642));
									for (int i_142_ = i_135_; i_142_ >= 0; i_142_--) {
										if ((null != (aClass340ArrayArrayArray3653[i_142_][i_139_][i_141_])) && (aClass340ArrayArrayArray3653[i_142_][i_139_][i_141_].aByte3381) == i_135_) {
											if ((i_142_ >= i && i_130_ == (is[i_142_][i_139_][i_141_])) || (aClass358_3649.method4219(i_135_, i_139_, i_141_)))
												bools[i_138_][i_140_] = false;
											else
												bools[i_138_][i_140_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass_xaArray3676[i_135_].method6423(315907165 * ((Class356) this).anInt3640, 875564685 * ((Class356) this).anInt3651, ((Class356) this).anInt3673 * 316617313, ((Class356) this).aBooleanArrayArray3698, false, i_131_);
				} else {
					int i_143_ = ((Class356) this).aBooleanArrayArray3700.length;
					if ((((Class356) this).aBooleanArrayArray3700.length + ((Class356) this).anInt3686 * 1508380227) > anInt3667 * -265955713)
						i_143_ -= (((Class356) this).aBooleanArrayArray3700.length + 1508380227 * ((Class356) this).anInt3686 - anInt3667 * -265955713);
					int i_144_ = ((Class356) this).aBooleanArrayArray3700[0].length;
					if ((((Class356) this).aBooleanArrayArray3700[0].length + ((Class356) this).anInt3688 * -83854233) > anInt3654 * 95955317)
						i_144_ -= (-83854233 * ((Class356) this).anInt3688 + (((Class356) this).aBooleanArrayArray3700[0]).length - 95955317 * anInt3654);
					boolean[][] bools = ((Class356) this).aBooleanArrayArray3698;
					if (((Class356) this).aBoolean3648) {
						for (int i_145_ = -193787911 * ((Class356) this).anInt3684; i_145_ < i_143_; i_145_++) {
							int i_146_ = (1508380227 * ((Class356) this).anInt3686 + i_145_ - ((Class356) this).anInt3684 * -193787911);
							for (int i_147_ = (-1847923657 * ((Class356) this).anInt3642); i_147_ < i_144_; i_147_++) {
								if ((((Class356) this).aBooleanArrayArray3700[i_145_][i_147_]) && !(aClass358_3649.method4219(i_135_, i_146_, ((((Class356) this).anInt3688 * -83854233) + i_147_ - (((Class356) this).anInt3642 * -1847923657)))))
									bools[i_145_][i_147_] = true;
								else
									bools[i_145_][i_147_] = false;
							}
						}
					}
					aClass_xaArray3676[i_135_].method6423(((Class356) this).anInt3640 * 315907165, ((Class356) this).anInt3651 * 875564685, ((Class356) this).anInt3673 * 316617313, ((Class356) this).aBooleanArrayArray3698, true, i_131_);
				}
			}
		}
		if (((Class356) this).anInt3681 * -2063147683 > 0) {
			method4173(((Class356) this).aClass432_Sub1Array3674, 0, ((Class356) this).anInt3681 * -2063147683 - 1);
			for (int i_148_ = 0; i_148_ < -2063147683 * ((Class356) this).anInt3681; i_148_++)
				method4166(((Class356) this).aClass432_Sub1Array3674[i_148_], ((Class356) this).aClass330_Sub14Array3691);
		}
	}

	boolean method4165(Class432_Sub1 class432_sub1, boolean bool, byte[][][] is, int i, byte i_149_) {
		if (!((Class356) this).aBoolean3648)
			return false;
		if (class432_sub1 instanceof Class432_Sub1_Sub1) {
			int i_150_ = ((Class432_Sub1_Sub1) class432_sub1).aShort9920;
			int i_151_ = ((Class432_Sub1_Sub1) class432_sub1).aShort9923;
			int i_152_ = ((Class432_Sub1_Sub1) class432_sub1).aShort9922;
			int i_153_ = ((Class432_Sub1_Sub1) class432_sub1).aShort9921;
			for (int i_154_ = i_152_; i_154_ <= i_150_; i_154_++) {
				for (int i_155_ = i_153_; i_155_ <= i_151_; i_155_++) {
					if (class432_sub1.aByte8654 < 1886598059 * anInt3650 && i_154_ >= ((Class356) this).anInt3686 * 1508380227 && i_154_ < -711571833 * ((Class356) this).anInt3689 && i_155_ >= -83854233 * ((Class356) this).anInt3688 && (i_155_ < ((Class356) this).anInt3696 * -1399464209)) {
						if ((is != null && class432_sub1.aByte8658 >= i && i_149_ == (is[class432_sub1.aByte8658][i_154_][i_155_])) || !class432_sub1.method5367((byte) -115) || class432_sub1.method5372((((Class356) this).aClass_ra3645), 33230288)) {
							if (!bool && i_154_ >= (((Class356) this).anInt3640 * 315907165) - 16 && i_154_ <= (((Class356) this).anInt3640 * 315907165) + 16 && i_155_ >= (((Class356) this).anInt3651 * 875564685) - 16 && i_155_ <= (((Class356) this).anInt3651 * 875564685) + 16)
								class432_sub1.method5404((((Class356) this).aClass_ra3645), -317112783);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class260 class260 = class432_sub1.method5346().aClass260_2606;
		int i_156_ = (int) class260.aFloat2716 >> anInt3641 * 916917461;
		int i_157_ = (int) class260.aFloat2711 >> anInt3641 * 916917461;
		if (class432_sub1.aByte8654 < 1886598059 * anInt3650 && i_156_ >= ((Class356) this).anInt3686 * 1508380227 && i_156_ < -711571833 * ((Class356) this).anInt3689 && i_157_ >= ((Class356) this).anInt3688 * -83854233 && i_157_ < ((Class356) this).anInt3696 * -1399464209) {
			if ((null != is && class432_sub1.aByte8658 >= i && i_149_ == is[class432_sub1.aByte8658][i_156_][i_157_]) || !class432_sub1.method5367((byte) -83) || class432_sub1.method5372(((Class356) this).aClass_ra3645, 418007110)) {
				if (!bool && i_156_ >= 315907165 * ((Class356) this).anInt3640 - 16 && i_156_ <= ((Class356) this).anInt3640 * 315907165 + 16 && i_157_ >= ((Class356) this).anInt3651 * 875564685 - 16 && i_157_ <= 16 + 875564685 * ((Class356) this).anInt3651)
					class432_sub1.method5404(((Class356) this).aClass_ra3645, -406227126);
				return true;
			}
			return false;
		}
		return true;
	}

	void method4166(Class432_Sub1 class432_sub1, Class330_Sub14[] class330_sub14s) {
		if (((Class356) this).aBoolean3647) {
			int i = class432_sub1.method5368(class330_sub14s, (byte) -16);
			((Class356) this).aClass_ra3645.ck(i, class330_sub14s);
		}
		if (aClass_xaArray3676 == aClass_xaArray3658) {
			boolean bool = false;
			boolean bool_158_ = false;
			Class260 class260 = class432_sub1.method5346().aClass260_2606;
			int i;
			int i_159_;
			if (class432_sub1 instanceof Class432_Sub1_Sub1) {
				i = ((Class432_Sub1_Sub1) class432_sub1).aShort9922;
				i_159_ = ((Class432_Sub1_Sub1) class432_sub1).aShort9921;
			} else {
				i = (int) class260.aFloat2716 >> 916917461 * anInt3641;
				i_159_ = (int) class260.aFloat2711 >> 916917461 * anInt3641;
			}
			Class77 class77 = new Class77();
			class77.anInt652 = method4138(i, i_159_, 360305750) * -1037349593;
			class77.anInt650 = method4157(i, i_159_, -498689986) * -2010008277;
			class77.anInt651 = method4183(i, i_159_, 1622515706) * -533215263;
			class77.anInt653 = method4139(i, i_159_, (byte) 1) * -1441052161;
			class77.anInt654 = method4140(i, i_159_, -2062399867) * -1973971575;
			class77.anInt655 = method4179(i, i_159_, (byte) 0) * 414539137;
			((Class356) this).aClass_ra3645.dz(aClass_xaArray3701[0].method6416((int) class260.aFloat2716, (int) class260.aFloat2711, -1925907639), class77);
		}
		Class353 class353 = class432_sub1.method5405(((Class356) this).aClass_ra3645, 12826234);
		if (null != class353) {
			if (((Class353) class353).aBoolean3487) {
				class353.aClass432_Sub1_3489 = class432_sub1;
				aClass338_3697.method3958(class353, (byte) 8);
			} else
				Class227.method2312(class353, 1103186905);
		}
	}

	public void method4167(Class_na class_na, int i, int i_160_, int i_161_, boolean[] bools, byte i_162_) {
		try {
			if (aClass_xaArray3658 != aClass_xaArray3676) {
				int i_163_ = aClass_xaArray3701[i].method6416(i_160_, i_161_, -1091474854);
				for (int i_164_ = 0; i_164_ <= i; i_164_++) {
					if (null == bools || bools[i_164_]) {
						Class_xa class_xa = aClass_xaArray3701[i_164_];
						if (class_xa == null) {
							if (i_162_ <= 0)
								throw new IllegalStateException();
						} else
							class_xa.NA(class_na, i_160_, (i_163_ - class_xa.method6416(i_160_, i_161_, -1670787251)), i_161_, 0, false);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.au(").append(')').toString());
		}
	}

	void method4168(int i, int i_165_, int i_166_) {
		try {
			Class_na class_na = null;
			for (int i_167_ = i; i_167_ < i_165_; i_167_++) {
				Class_xa class_xa = aClass_xaArray3701[i_167_];
				if (class_xa != null) {
					for (int i_168_ = 0; i_168_ < 95955317 * anInt3654; i_168_++) {
						for (int i_169_ = 0; i_169_ < anInt3667 * -265955713; i_169_++) {
							class_na = class_xa.w(i_169_, i_168_, class_na);
							if (null != class_na) {
								int i_170_ = i_169_ << anInt3641 * 916917461;
								int i_171_ = i_168_ << 916917461 * anInt3641;
								for (int i_172_ = i_167_ - 1; i_172_ >= 0; i_172_--) {
									Class_xa class_xa_173_ = aClass_xaArray3701[i_172_];
									if (class_xa_173_ == null) {
										if (i_166_ <= 621744729) {
											/* empty */
										}
									} else {
										int i_174_ = (class_xa.method6417(i_169_, i_168_, 724922351) - (class_xa_173_.method6417(i_169_, i_168_, -2059376734)));
										int i_175_ = (class_xa.method6417(i_169_ + 1, i_168_, -1631745858) - (class_xa_173_.method6417(1 + i_169_, i_168_, -511777741)));
										int i_176_ = (class_xa.method6417(i_169_ + 1, 1 + i_168_, -950685282) - (class_xa_173_.method6417(i_169_ + 1, 1 + i_168_, 1949994073)));
										int i_177_ = (class_xa.method6417(i_169_, 1 + i_168_, -1503561844) - (class_xa_173_.method6417(i_169_, i_168_ + 1, 1162347593)));
										class_xa_173_.UA(class_na, i_170_, ((i_175_ + i_174_ + i_176_ + i_177_) / 4), i_171_, 0, false);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ae(").append(')').toString());
		}
	}

	public void method4169(int i) {
		try {
			for (int i_178_ = 0; i_178_ < ((Class356) this).anInt3693 * -2121762059; i_178_++) {
				if (!((Class356) this).aBooleanArray3659[i_178_]) {
					Class349 class349 = ((Class356) this).aClass349Array3679[i_178_];
					Class330_Sub14 class330_sub14 = class349.aClass330_Sub14_3467;
					int i_179_ = class349.anInt3470 * 1583989685;
					int i_180_ = (class330_sub14.method3316((byte) 16) - ((Class356) this).anInt3643 * 5094163);
					int i_181_ = 1 + (2 * i_180_ >> 916917461 * anInt3641);
					int i_182_ = 0;
					int[] is = new int[i_181_ * i_181_];
					int i_183_ = (class330_sub14.method3318(1603365177) - i_180_ >> 916917461 * anInt3641);
					int i_184_ = (class330_sub14.method3312((short) -15802) - i_180_ >> 916917461 * anInt3641);
					int i_185_ = (class330_sub14.method3312((short) -12112) + i_180_ >> anInt3641 * 916917461);
					if (i_184_ < 0) {
						i_182_ -= i_184_;
						i_184_ = 0;
					}
					if (i_185_ >= anInt3654 * 95955317)
						i_185_ = 95955317 * anInt3654 - 1;
					for (int i_186_ = i_184_; i_186_ <= i_185_; i_186_++) {
						int i_187_ = ((Class349) class349).aShortArray3454[i_182_];
						int i_188_ = i_187_ >>> 8;
						int i_189_ = i_182_ * i_181_ + i_188_;
						int i_190_ = (i_187_ >>> 8) + i_183_;
						int i_191_ = (i_187_ & 0xff) + i_190_ - 1;
						if (i_190_ < 0) {
							i_189_ -= i_190_;
							i_190_ = 0;
						}
						if (i_191_ >= -265955713 * anInt3667)
							i_191_ = -265955713 * anInt3667 - 1;
						for (int i_192_ = i_190_; i_192_ <= i_191_; i_192_++) {
							int i_193_ = 1;
							Class432_Sub1_Sub1 class432_sub1_sub1 = method4158(i_179_, i_192_, i_186_, null, (byte) -40);
							if (null != class432_sub1_sub1 && (((Class432_Sub1_Sub1) class432_sub1_sub1).aByte9919) != 0) {
								if (1 == ((Class432_Sub1_Sub1) class432_sub1_sub1).aByte9919) {
									boolean bool = i_192_ - 1 >= i_190_;
									boolean bool_194_ = 1 + i_192_ <= i_191_;
									if (!bool && 1 + i_186_ <= i_185_) {
										int i_195_ = (((Class349) class349).aShortArray3454[1 + i_182_]);
										int i_196_ = i_183_ + (i_195_ >>> 8);
										int i_197_ = (i_195_ & 0xff) + i_196_;
										bool = (i_192_ > i_196_ && i_192_ < i_197_);
									}
									if (!bool_194_ && i_186_ - 1 >= i_184_) {
										int i_198_ = (((Class349) class349).aShortArray3454[i_182_ - 1]);
										int i_199_ = (i_198_ >>> 8) + i_183_;
										int i_200_ = (i_198_ & 0xff) + i_199_;
										bool_194_ = (i_192_ > i_199_ && i_192_ < i_200_);
									}
									if (bool && !bool_194_)
										i_193_ = 4;
									else if (bool_194_ && !bool)
										i_193_ = 2;
								} else {
									boolean bool = i_192_ - 1 >= i_190_;
									boolean bool_201_ = i_192_ + 1 <= i_191_;
									if (!bool && i_186_ - 1 >= i_184_) {
										int i_202_ = (((Class349) class349).aShortArray3454[i_182_ - 1]);
										int i_203_ = (i_202_ >>> 8) + i_183_;
										int i_204_ = i_203_ + (i_202_ & 0xff);
										bool = (i_192_ > i_203_ && i_192_ < i_204_);
									}
									if (!bool_201_ && 1 + i_186_ <= i_185_) {
										int i_205_ = (((Class349) class349).aShortArray3454[1 + i_182_]);
										int i_206_ = (i_205_ >>> 8) + i_183_;
										int i_207_ = (i_205_ & 0xff) + i_206_;
										bool_201_ = (i_192_ > i_206_ && i_192_ < i_207_);
									}
									if (bool && !bool_201_)
										i_193_ = 3;
									else if (bool_201_ && !bool)
										i_193_ = 5;
								}
							}
							is[i_189_++] = i_193_;
						}
						i_182_++;
					}
					((Class356) this).aBooleanArray3659[i_178_] = true;
					if (aBoolean3694)
						aClass_xaArray3676[i_179_].method6420(class330_sub14, is);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.bs(").append(')').toString());
		}
	}

	public void method4170(Class349 class349, int i) {
		try {
			if (-2121762059 * ((Class356) this).anInt3693 < 65361) {
				Class330_Sub14 class330_sub14 = class349.aClass330_Sub14_3467;
				((Class356) this).aClass349Array3679[-2121762059 * ((Class356) this).anInt3693] = class349;
				((Class356) this).aBooleanArray3659[((Class356) this).anInt3693 * -2121762059] = false;
				((Class356) this).anInt3693 += 598925661;
				int i_208_ = class349.anInt3470 * 1583989685;
				if (((Class349) class349).aBoolean3469)
					i_208_ = 0;
				int i_209_ = 1583989685 * class349.anInt3470;
				if (((Class349) class349).aBoolean3456)
					i_209_ = anInt3650 * 1886598059 - 1;
				for (int i_210_ = i_208_; i_210_ <= i_209_; i_210_++) {
					int i_211_ = 0;
					int i_212_ = ((class330_sub14.method3312((short) 7506) - class330_sub14.method3316((byte) 86) + ((Class356) this).anInt3643 * 5094163) >> anInt3641 * 916917461);
					if (i_212_ < 0) {
						i_211_ -= i_212_;
						i_212_ = 0;
					}
					int i_213_ = ((class330_sub14.method3312((short) -28879) + class330_sub14.method3316((byte) 43) - ((Class356) this).anInt3643 * 5094163) >> anInt3641 * 916917461);
					if (i_213_ >= 95955317 * anInt3654)
						i_213_ = 95955317 * anInt3654 - 1;
					for (int i_214_ = i_212_; i_214_ <= i_213_; i_214_++) {
						int i_215_ = ((Class349) class349).aShortArray3454[i_211_++];
						int i_216_ = (((class330_sub14.method3318(-1940570454) - class330_sub14.method3316((byte) 23) + 5094163 * ((Class356) this).anInt3643) >> 916917461 * anInt3641) + (i_215_ >>> 8));
						int i_217_ = i_216_ + (i_215_ & 0xff) - 1;
						if (i_216_ < 0)
							i_216_ = 0;
						if (i_217_ >= anInt3667 * -265955713)
							i_217_ = -265955713 * anInt3667 - 1;
						for (int i_218_ = i_216_; i_218_ <= i_217_; i_218_++) {
							long l = (((Class356) this).aLongArrayArrayArray3652[i_210_][i_218_][i_214_]);
							if ((l & 0xffffL) == 0L)
								((Class356) this).aLongArrayArrayArray3652[i_210_][i_218_][i_214_] = l | (long) (((Class356) this).anInt3693 * -2121762059);
							else if ((l & 0xffff0000L) == 0L)
								((Class356) this).aLongArrayArrayArray3652[i_210_][i_218_][i_214_] = l | (long) (((Class356) this).anInt3693 * -2121762059) << 16;
							else if (0L == (l & 0xffff00000000L))
								((Class356) this).aLongArrayArrayArray3652[i_210_][i_218_][i_214_] = l | (long) (-2121762059 * (((Class356) this).anInt3693)) << 32;
							else if ((l & ~0xffffffffffffL) == 0L)
								((Class356) this).aLongArrayArrayArray3652[i_210_][i_218_][i_214_] = l | (long) (-2121762059 * (((Class356) this).anInt3693)) << 48;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.bg(").append(')').toString());
		}
	}

	void method4171(Class432_Sub1 class432_sub1, int i, int i_219_, int i_220_, int i_221_, int i_222_) {
		boolean bool = true;
		int i_223_ = i_219_;
		int i_224_ = i_219_ + i_221_;
		int i_225_ = i_220_ - 1;
		int i_226_ = i_222_ + i_220_;
		for (int i_227_ = i; i_227_ <= i + 1; i_227_++) {
			if (i_227_ != anInt3650 * 1886598059) {
				for (int i_228_ = i_223_; i_228_ <= i_224_; i_228_++) {
					if (i_228_ >= 0 && i_228_ < -265955713 * anInt3667) {
						for (int i_229_ = i_225_; i_229_ <= i_226_; i_229_++) {
							if (i_229_ >= 0 && i_229_ < 95955317 * anInt3654 && (!bool || i_228_ >= i_224_ || i_229_ >= i_226_ || i_229_ < i_220_ && i_219_ != i_228_)) {
								Class340 class340 = (aClass340ArrayArrayArray3653[i_227_][i_228_][i_229_]);
								if (null != class340) {
									int i_230_ = (((aClass_xaArray3676[i_227_].method6417(i_228_, i_229_, -686084832)) + (aClass_xaArray3676[i_227_].method6417(1 + i_228_, i_229_, 375470806)) + (aClass_xaArray3676[i_227_].method6417(i_228_, 1 + i_229_, 1610388724)) + (aClass_xaArray3676[i_227_].method6417(i_228_ + 1, 1 + i_229_, 147671061))) / 4 - ((aClass_xaArray3676[i].method6417(i_219_, i_220_, 1672173976)) + (aClass_xaArray3676[i].method6417(1 + i_219_, i_220_, 751396985)) + (aClass_xaArray3676[i].method6417(i_219_, i_220_ + 1, -870234941)) + (aClass_xaArray3676[i].method6417(i_219_ + 1, i_220_ + 1, -1239912013))) / 4);
									Class432_Sub1_Sub5 class432_sub1_sub5 = class340.aClass432_Sub1_Sub5_3382;
									Class432_Sub1_Sub5 class432_sub1_sub5_231_ = class340.aClass432_Sub1_Sub5_3383;
									if (null != class432_sub1_sub5 && class432_sub1_sub5.method5360((short) 16856))
										class432_sub1.method5392(((Class356) this).aClass_ra3645, class432_sub1_sub5, ((415703703 * ((Class356) this).anInt3656 * (i_228_ - i_219_)) + (((Class356) this).anInt3643 * 5094163 * (1 - i_221_))), i_230_, ((((Class356) this).anInt3643 * 5094163 * (1 - i_222_)) + (((Class356) this).anInt3656 * 415703703 * (i_229_ - i_220_))), bool, 1198125389);
									if (null != class432_sub1_sub5_231_ && class432_sub1_sub5_231_.method5360((short) 8984))
										class432_sub1.method5392(((Class356) this).aClass_ra3645, class432_sub1_sub5_231_, (((1 - i_221_) * (((Class356) this).anInt3643 * 5094163)) + (((Class356) this).anInt3656 * 415703703 * (i_228_ - i_219_))), i_230_, (((i_229_ - i_220_) * (((Class356) this).anInt3656 * 415703703)) + ((1 - i_222_) * (((Class356) this).anInt3643 * 5094163))), bool, 1198125389);
									for (Class352 class352 = class340.aClass352_3388; class352 != null; class352 = class352.aClass352_3483) {
										Class432_Sub1_Sub1 class432_sub1_sub1 = (class352.aClass432_Sub1_Sub1_3484);
										if (null != class432_sub1_sub1 && class432_sub1_sub1.method5360((short) 13248) && (i_228_ == (class432_sub1_sub1.aShort9922) || i_228_ == i_223_) && ((class432_sub1_sub1.aShort9921 == i_229_) || i_225_ == i_229_)) {
											int i_232_ = 1 + ((class432_sub1_sub1.aShort9920) - (class432_sub1_sub1.aShort9922));
											int i_233_ = ((class432_sub1_sub1.aShort9923) - (class432_sub1_sub1.aShort9921) + 1);
											class432_sub1.method5392((((Class356) this).aClass_ra3645), class432_sub1_sub1, (((i_232_ - i_221_) * (5094163 * (((Class356) this).anInt3643))) + (415703703 * (((Class356) this).anInt3656) * ((class432_sub1_sub1.aShort9922) - i_219_))), i_230_, ((((class432_sub1_sub1.aShort9921) - i_220_) * ((((Class356) this).anInt3656) * 415703703)) + ((i_233_ - i_222_) * ((((Class356) this).anInt3643) * 5094163))), bool, 1198125389);
										}
									}
								}
							}
						}
					}
				}
				i_223_--;
				bool = false;
			}
		}
	}

	void method4172(Class432_Sub1[] class432_sub1s, int i, int i_234_) {
		if (i < i_234_) {
			int i_235_ = (i + i_234_) / 2;
			int i_236_ = i;
			Class432_Sub1 class432_sub1 = class432_sub1s[i_235_];
			class432_sub1s[i_235_] = class432_sub1s[i_234_];
			class432_sub1s[i_234_] = class432_sub1;
			int i_237_ = -1215277407 * ((Class432_Sub1) class432_sub1).anInt8657;
			for (int i_238_ = i; i_238_ < i_234_; i_238_++) {
				if ((-1215277407 * ((Class432_Sub1) class432_sub1s[i_238_]).anInt8657) < (i_238_ & 0x1) + i_237_) {
					Class432_Sub1 class432_sub1_239_ = class432_sub1s[i_238_];
					class432_sub1s[i_238_] = class432_sub1s[i_236_];
					class432_sub1s[i_236_++] = class432_sub1_239_;
				}
			}
			class432_sub1s[i_234_] = class432_sub1s[i_236_];
			class432_sub1s[i_236_] = class432_sub1;
			method4172(class432_sub1s, i, i_236_ - 1);
			method4172(class432_sub1s, i_236_ + 1, i_234_);
		}
	}

	void method4173(Class432_Sub1[] class432_sub1s, int i, int i_240_) {
		if (i < i_240_) {
			int i_241_ = (i_240_ + i) / 2;
			int i_242_ = i;
			Class432_Sub1 class432_sub1 = class432_sub1s[i_241_];
			class432_sub1s[i_241_] = class432_sub1s[i_240_];
			class432_sub1s[i_240_] = class432_sub1;
			int i_243_ = -1215277407 * ((Class432_Sub1) class432_sub1).anInt8657;
			for (int i_244_ = i; i_244_ < i_240_; i_244_++) {
				if ((((Class432_Sub1) class432_sub1s[i_244_]).anInt8657 * -1215277407) > (i_244_ & 0x1) + i_243_) {
					Class432_Sub1 class432_sub1_245_ = class432_sub1s[i_244_];
					class432_sub1s[i_244_] = class432_sub1s[i_242_];
					class432_sub1s[i_242_++] = class432_sub1_245_;
				}
			}
			class432_sub1s[i_240_] = class432_sub1s[i_242_];
			class432_sub1s[i_242_] = class432_sub1;
			method4173(class432_sub1s, i, i_242_ - 1);
			method4173(class432_sub1s, 1 + i_242_, i_240_);
		}
	}

	public void method4174(int i, Class_xa class_xa, byte i_246_) {
		try {
			aClass_xaArray3676[i] = class_xa;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.z(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub5 method4175(int i, int i_247_, int i_248_, int i_249_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_247_][i_248_];
			if (class340 != null) {
				method4153(class340.aClass432_Sub1_Sub5_3382, 1191940480);
				if (class340.aClass432_Sub1_Sub5_3382 != null) {
					Class432_Sub1_Sub5 class432_sub1_sub5 = class340.aClass432_Sub1_Sub5_3382;
					class340.aClass432_Sub1_Sub5_3382 = null;
					return class432_sub1_sub5;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.t(").append(')').toString());
		}
	}

	public void method4176(byte i) {
		try {
			method4168(1, 1886598059 * anInt3650, 1525613311);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.ao(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub4 method4177(int i, int i_250_, int i_251_, int i_252_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_250_][i_251_];
			if (null == class340 || class340.aClass432_Sub1_Sub4_3386 == null)
				return null;
			return class340.aClass432_Sub1_Sub4_3386;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.an(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub2 method4178(int i, int i_253_, int i_254_, int i_255_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_253_][i_254_];
			if (null == class340)
				return null;
			return ((Class340) class340).aClass432_Sub1_Sub2_3391;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.aj(").append(')').toString());
		}
	}

	public int method4179(int i, int i_256_, byte i_257_) {
		try {
			return (((Class356) this).aByteArrayArray3664 != null ? ((Class356) this).aByteArrayArray3664[i][i_256_] & 0xff : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.q(").append(')').toString());
		}
	}

	public void method4180(int i, int i_258_, int i_259_, Class432_Sub1_Sub5 class432_sub1_sub5, Class432_Sub1_Sub5 class432_sub1_sub5_260_, int i_261_) {
		try {
			Class340 class340 = method4136(i, i_258_, i_259_, (byte) 16);
			if (null != class340) {
				class340.aClass432_Sub1_Sub5_3382 = class432_sub1_sub5;
				class340.aClass432_Sub1_Sub5_3383 = class432_sub1_sub5_260_;
				int i_262_ = aClass_xaArray3676 == aClass_xaArray3658 ? 1 : 0;
				if (class432_sub1_sub5.method5382(1893573760)) {
					if (class432_sub1_sub5.method5395(1319252997)) {
						((Class432_Sub1_Sub5) class432_sub1_sub5).aClass432_Sub1_8653 = (((Class356) this).aClass432_Sub1Array3670[i_262_]);
						((Class356) this).aClass432_Sub1Array3670[i_262_] = class432_sub1_sub5;
					} else {
						((Class432_Sub1_Sub5) class432_sub1_sub5).aClass432_Sub1_8653 = (((Class356) this).aClass432_Sub1Array3671[i_262_]);
						((Class356) this).aClass432_Sub1Array3671[i_262_] = class432_sub1_sub5;
					}
				} else {
					((Class432_Sub1_Sub5) class432_sub1_sub5).aClass432_Sub1_8653 = ((Class356) this).aClass432_Sub1Array3678[i_262_];
					((Class356) this).aClass432_Sub1Array3678[i_262_] = class432_sub1_sub5;
				}
				if (null != class432_sub1_sub5_260_) {
					if (class432_sub1_sub5_260_.method5382(206516734)) {
						if (class432_sub1_sub5_260_.method5395(822469189)) {
							((Class432_Sub1_Sub5) class432_sub1_sub5_260_).aClass432_Sub1_8653 = (((Class356) this).aClass432_Sub1Array3670[i_262_]);
							((Class356) this).aClass432_Sub1Array3670[i_262_] = class432_sub1_sub5_260_;
						} else {
							((Class432_Sub1_Sub5) class432_sub1_sub5_260_).aClass432_Sub1_8653 = (((Class356) this).aClass432_Sub1Array3671[i_262_]);
							((Class356) this).aClass432_Sub1Array3671[i_262_] = class432_sub1_sub5_260_;
						}
					} else {
						((Class432_Sub1_Sub5) class432_sub1_sub5_260_).aClass432_Sub1_8653 = (((Class356) this).aClass432_Sub1Array3678[i_262_]);
						((Class356) this).aClass432_Sub1Array3678[i_262_] = class432_sub1_sub5_260_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.d(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub1 method4181(int i, int i_263_, int i_264_, Interface19 interface19, byte i_265_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_263_][i_264_];
			if (null == class340)
				return null;
			for (Class352 class352 = class340.aClass352_3388; class352 != null; class352 = class352.aClass352_3483) {
				Class432_Sub1_Sub1 class432_sub1_sub1 = class352.aClass432_Sub1_Sub1_3484;
				if ((null == interface19 || interface19.method279(class432_sub1_sub1, -1272911133)) && class432_sub1_sub1.aShort9922 == i_263_ && class432_sub1_sub1.aShort9921 == i_264_) {
					method4152(class432_sub1_sub1, false, -107809328);
					return class432_sub1_sub1;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.al(").append(')').toString());
		}
	}

	public void method4182(int i, int i_266_, int i_267_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[0][i][i_266_];
			for (int i_268_ = 0; i_268_ < 3; i_268_++) {
				Class340 class340_269_ = (aClass340ArrayArrayArray3653[i_268_][i][i_266_] = aClass340ArrayArrayArray3653[1 + i_268_][i][i_266_]);
				if (class340_269_ != null) {
					for (Class352 class352 = class340_269_.aClass352_3388; null != class352; class352 = class352.aClass352_3483) {
						Class432_Sub1_Sub1 class432_sub1_sub1 = class352.aClass432_Sub1_Sub1_3484;
						if (i == class432_sub1_sub1.aShort9922 && i_266_ == class432_sub1_sub1.aShort9921)
							class432_sub1_sub1.aByte8658--;
					}
					if (null != class340_269_.aClass432_Sub1_Sub4_3386)
						class340_269_.aClass432_Sub1_Sub4_3386.aByte8658--;
					if (class340_269_.aClass432_Sub1_Sub5_3382 != null)
						class340_269_.aClass432_Sub1_Sub5_3382.aByte8658--;
					if (class340_269_.aClass432_Sub1_Sub5_3383 != null)
						class340_269_.aClass432_Sub1_Sub5_3383.aByte8658--;
					if (class340_269_.aClass432_Sub1_Sub3_3384 != null)
						class340_269_.aClass432_Sub1_Sub3_3384.aByte8658--;
					if (null != class340_269_.aClass432_Sub1_Sub3_3385)
						class340_269_.aClass432_Sub1_Sub3_3385.aByte8658--;
				}
			}
			if (aClass340ArrayArrayArray3653[0][i][i_266_] == null) {
				aClass340ArrayArrayArray3653[0][i][i_266_] = new Class340(0);
				aClass340ArrayArrayArray3653[0][i][i_266_].aByte3381 = (byte) 1;
			}
			aClass340ArrayArrayArray3653[0][i][i_266_].aClass340_3380 = class340;
			aClass340ArrayArrayArray3653[3][i][i_266_] = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.o(").append(')').toString());
		}
	}

	public int method4183(int i, int i_270_, int i_271_) {
		try {
			return (((Class356) this).aByteArrayArray3669 != null ? ((Class356) this).aByteArrayArray3669[i][i_270_] & 0xff : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.l(").append(')').toString());
		}
	}

	public void method4184(int i, int i_272_, int i_273_, int i_274_, int i_275_) {
		try {
			Class340 class340 = aClass340ArrayArrayArray3653[i][i_272_][i_273_];
			if (class340 != null) {
				Class432_Sub1_Sub3 class432_sub1_sub3 = class340.aClass432_Sub1_Sub3_3384;
				Class432_Sub1_Sub3 class432_sub1_sub3_276_ = class340.aClass432_Sub1_Sub3_3385;
				if (null != class432_sub1_sub3) {
					class432_sub1_sub3.aShort9925 = (short) (class432_sub1_sub3.aShort9925 * i_274_ / (16 << 916917461 * anInt3641 - 7));
					class432_sub1_sub3.aShort9926 = (short) (class432_sub1_sub3.aShort9926 * i_274_ / (16 << anInt3641 * 916917461 - 7));
				}
				if (class432_sub1_sub3_276_ != null) {
					class432_sub1_sub3_276_.aShort9925 = (short) (i_274_ * class432_sub1_sub3_276_.aShort9925 / (16 << anInt3641 * 916917461 - 7));
					class432_sub1_sub3_276_.aShort9926 = (short) (i_274_ * class432_sub1_sub3_276_.aShort9926 / (16 << anInt3641 * 916917461 - 7));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.e(").append(')').toString());
		}
	}

	public Class356(Class_ra class_ra, int i, int i_277_, int i_278_, int i_279_, int i_280_, boolean bool, boolean bool_281_) {
		((Class356) this).anInt3668 = 5006;
		((Class356) this).aFloatArray3690 = new float[3];
		((Class356) this).aClass330_Sub14Array3691 = new Class330_Sub14[8];
		((Class356) this).anInt3692 = 65361;
		((Class356) this).aClass_ra3645 = class_ra;
		((Class356) this).aBoolean3647 = ((Class356) this).aClass_ra3645.cr() > 0;
		anInt3641 = -1075721091 * i;
		((Class356) this).anInt3656 = (1 << 916917461 * anInt3641) * 1462402343;
		((Class356) this).anInt3643 = 1036601115 * (415703703 * ((Class356) this).anInt3656 >> 1);
		anInt3650 = i_277_ * 1316892419;
		anInt3667 = -58726017 * i_278_;
		anInt3654 = 1358339805 * i_279_;
		((Class356) this).anInt3673 = i_280_ * -139136607;
		((Class356) this).aClass509_3646 = new Class509();
		aClass358_3649 = new Class358(this);
		aClass340ArrayArrayArray3655 = (new Class340[i_277_][anInt3667 * -265955713][95955317 * anInt3654]);
		aClass_xaArray3701 = new Class_xa[i_277_];
		if (bool) {
			((Class356) this).anIntArrayArray3683 = new int[anInt3667 * -265955713][95955317 * anInt3654];
			((Class356) this).aByteArrayArray3669 = new byte[-265955713 * anInt3667][95955317 * anInt3654];
			((Class356) this).aShortArrayArray3695 = new short[-265955713 * anInt3667][95955317 * anInt3654];
			((Class356) this).aByteArrayArray3662 = new byte[-265955713 * anInt3667][95955317 * anInt3654];
			((Class356) this).aByteArrayArray3663 = new byte[anInt3667 * -265955713][95955317 * anInt3654];
			((Class356) this).aByteArrayArray3664 = new byte[-265955713 * anInt3667][95955317 * anInt3654];
			aClass340ArrayArrayArray3657 = (new Class340[1][anInt3667 * -265955713][anInt3654 * 95955317]);
			aClass_xaArray3658 = new Class_xa[1];
		}
		if (bool_281_) {
			((Class356) this).aLongArrayArrayArray3652 = new long[i_277_][i_278_][i_279_];
			((Class356) this).aClass349Array3679 = new Class349[65361];
			((Class356) this).aBooleanArray3659 = new boolean[65361];
			((Class356) this).anInt3693 = 0;
		}
		method4134(false, (byte) 38);
		((Class356) this).aClass432_Sub1Array3671 = new Class432_Sub1[2];
		((Class356) this).aClass432_Sub1Array3670 = new Class432_Sub1[2];
		((Class356) this).aClass432_Sub1Array3678 = new Class432_Sub1[2];
		((Class356) this).aClass432_Sub1Array3675 = new Class432_Sub1[10080];
		((Class356) this).anInt3672 = 0;
		((Class356) this).aClass432_Sub1Array3674 = new Class432_Sub1[5046];
		((Class356) this).anInt3681 = 0;
		((Class356) this).aClass432_Sub1_Sub1Array3685 = new Class432_Sub1_Sub1[5006];
		((Class356) this).anInt3661 = 0;
		((Class356) this).aBooleanArrayArray3700 = (new boolean[(316617313 * ((Class356) this).anInt3673 + ((Class356) this).anInt3673 * 316617313 + 1)][(316617313 * ((Class356) this).anInt3673 + 316617313 * ((Class356) this).anInt3673 + 1)]);
		((Class356) this).aBooleanArrayArray3698 = (new boolean[2 + (((Class356) this).anInt3673 * 316617313 + 316617313 * ((Class356) this).anInt3673)][2 + (316617313 * ((Class356) this).anInt3673 + 316617313 * ((Class356) this).anInt3673)]);
		((Class356) this).anIntArray3699 = new int[2 + (((Class356) this).anInt3673 * 316617313 + 316617313 * ((Class356) this).anInt3673)];
		aClass338_3697 = new Class338(false);
	}

	public boolean method4185(Class_na class_na, int i, int i_282_, int i_283_, boolean[] bools, byte i_284_) {
		try {
			boolean bool = false;
			if (aClass_xaArray3658 != aClass_xaArray3676) {
				int i_285_ = aClass_xaArray3701[i].method6416(i_282_, i_283_, 1313874386);
				int i_286_ = 0;
				for (/**/; i_286_ <= i; i_286_++) {
					Class_xa class_xa = aClass_xaArray3701[i_286_];
					if (null == class_xa) {
						if (i_284_ == 2)
							throw new IllegalStateException();
					} else {
						int i_287_ = i_285_ - class_xa.method6416(i_282_, i_283_, -1482993169);
						if (null != bools) {
							bools[i_286_] = class_xa.method6418(class_na, i_282_, i_287_, i_283_, 0, false);
							if (!bools[i_286_]) {
								if (i_284_ == 2) {
									/* empty */
								}
								continue;
							}
						}
						class_xa.UA(class_na, i_282_, i_287_, i_283_, 0, false);
						bool = true;
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.am(").append(')').toString());
		}
	}

	static Class390[] method4186(byte i) {
		try {
			return (new Class390[] { Class390.aClass390_4035, Class390.aClass390_4043, Class390.aClass390_4047, Class390.aClass390_4037, Class390.aClass390_4044, Class390.aClass390_4038, Class390.aClass390_4034, Class390.aClass390_4040, Class390.aClass390_4041, Class390.aClass390_4036, Class390.aClass390_4051, Class390.aClass390_4045, Class390.aClass390_4046, Class390.aClass390_4042 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.r(").append(')').toString());
		}
	}

	public static short modifyColor(int i, byte i_288_) {
		try {
			int i_289_ = i >> 10 & 0x3f;
			int i_290_ = i >> 3 & 0x70;
			int i_291_ = i & 0x7f;
			i_290_ = (i_291_ <= 64 ? i_290_ * i_291_ >> 7 : i_290_ * (127 - i_291_) >> 7);
			int i_292_ = i_290_ + i_291_;
			int i_293_;
			if (i_292_ != 0)
				i_293_ = (i_290_ << 8) / i_292_;
			else
				i_293_ = i_290_ << 1;
			int i_294_ = i_292_;
			return (short) (i_289_ << 10 | i_293_ >> 4 << 7 | i_294_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.o(").append(')').toString());
		}
	}

	static final void method4188(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 1381829115 * Class330_Sub10.anInt7590;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.aoe(").append(')').toString());
		}
	}

	public static Class469 method4189(int i, byte i_295_) {
		try {
			Class469[] class469s = Class383.method4411((short) -12027);
			for (int i_296_ = 0; i_296_ < class469s.length; i_296_++) {
				Class469 class469 = class469s[i_296_];
				if (171998097 * class469.anInt5608 == i)
					return class469;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.j(").append(')').toString());
		}
	}

	static boolean method4190(byte i) {
		try {
			return Class476.method5961(Class534.aClass412_6788.aClass365_4252, (short) 128);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.r(").append(')').toString());
		}
	}

	static void method4191(int i) {
		try {
			Class330_Sub1.aClass497_7501.method6100(65280);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.n(").append(')').toString());
		}
	}

	static final void method4192(Class430 class430, int i) {
		try {
			int i_297_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class117 class117 = Class144.method1668(i_297_, (byte) 16);
			int i_298_ = -1;
			if (null != class117)
				i_298_ = -762120451 * class117.anInt1381;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_298_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ow.acx(").append(')').toString());
		}
	}
}
