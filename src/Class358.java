/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class358 {
	static float aFloat3705 = 3.0F;
	boolean aBoolean3706;
	int[] anIntArray3707;
	int[] anIntArray3708;
	static int anInt3709 = 100;
	Class356 aClass356_3710;
	Class347 aClass347_3711;
	boolean aBoolean3712;
	int[][][] anIntArrayArrayArray3713;
	int anInt3714;
	int anInt3715;
	static Class_ra aClass_ra3716;
	int[] anIntArray3717;
	int anInt3718;
	Class385[] aClass385Array3719;
	int anInt3720;
	Class385[] aClass385Array3721;
	int[] anIntArray3722;
	Class385[] aClass385Array3723;
	public boolean aBoolean3724 = true;
	int anInt3725;
	int anInt3726;
	int[] anIntArray3727;
	int anInt3728;
	int[] anIntArray3729;
	Class385[] aClass385Array3730;
	float[] aFloatArray3731;
	int[] anIntArray3732;
	int anInt3733;
	static int anInt3734 = 10;
	boolean aBoolean3735;

	Class358(Class356 class356) {
		((Class358) this).aBoolean3706 = true;
		((Class358) this).aBoolean3712 = false;
		((Class358) this).anInt3726 = 0;
		((Class358) this).aFloatArray3731 = new float[3];
		((Class358) this).anIntArray3732 = new int[2];
		((Class358) this).anInt3733 = -1;
		((Class358) this).anInt3725 = -1;
		((Class358) this).aBoolean3735 = true;
		((Class358) this).anInt3728 = ((Class356) class356).anInt3656 * 415703703;
		((Class358) this).anInt3714 = ((Class356) class356).anInt3656 * 415703703;
		((Class358) this).aClass356_3710 = class356;
		((Class358) this).aClass385Array3730 = new Class385[549];
		((Class358) this).anInt3715 = 0;
		((Class358) this).aClass385Array3719 = new Class385[2049];
		((Class358) this).anInt3718 = 0;
		((Class358) this).aClass385Array3721 = new Class385[1001];
		((Class358) this).anInt3720 = 0;
		((Class358) this).aClass385Array3723 = new Class385[1049];
		((Class358) this).anInt3726 = 0;
		((Class358) this).anIntArrayArrayArray3713 = (new int[((Class358) this).aClass356_3710.anInt3650 * 1886598059][((Class358) this).aClass356_3710.anInt3667 * -265955713 + 1][((Class358) this).aClass356_3710.anInt3654 * 95955317 + 1]);
		((Class358) this).aBoolean3712 = false;
		if (((Class356) ((Class358) this).aClass356_3710).aClass_ra3645 instanceof ja)
			aBoolean3724 = false;
		else
			aBoolean3724 = true;
		if (aBoolean3724)
			((Class358) this).aClass347_3711 = new Class347(this);
	}

	public void method4216(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_5_ = i_1_ << (((Class358) this).aClass356_3710.anInt3641 * 916917461);
				int i_6_ = i_5_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703;
				int i_7_ = i_2_ << (((Class358) this).aClass356_3710.anInt3641 * 916917461);
				int i_8_ = i_7_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703;
				int i_9_ = ((Class358) this).aClass356_3710.aClass_xaArray3701[i_0_].method6417(i_1_, i_2_, -497011610);
				int i_10_ = ((Class358) this).aClass356_3710.aClass_xaArray3701[i_0_].method6417(i_1_ + 1, i_2_ + 1, -2047706292);
				((Class358) this).aClass385Array3721[((Class358) this).anInt3720++] = new Class385(((Class358) this).aClass356_3710, i, i_0_, i_5_, i_6_, i_6_, i_5_, i_9_, i_10_, i_10_ - i_3_, i_9_ - i_3_, i_7_, i_8_, i_8_, i_7_);
			} else {
				int i_11_ = ((i_1_ << (((Class358) this).aClass356_3710.anInt3641 * 916917461)) + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703);
				int i_12_ = i_11_ - (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703;
				int i_13_ = i_2_ << (((Class358) this).aClass356_3710.anInt3641 * 916917461);
				int i_14_ = i_13_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703;
				int i_15_ = ((Class358) this).aClass356_3710.aClass_xaArray3701[i_0_].method6417(i_1_ + 1, i_2_, 1333662320);
				int i_16_ = ((Class358) this).aClass356_3710.aClass_xaArray3701[i_0_].method6417(i_1_, i_2_ + 1, -1656362526);
				((Class358) this).aClass385Array3721[((Class358) this).anInt3720++] = new Class385(((Class358) this).aClass356_3710, i, i_0_, i_11_, i_12_, i_12_, i_11_, i_15_, i_16_, i_16_ - i_3_, i_15_ - i_3_, i_13_, i_14_, i_14_, i_13_);
			}
		} else {
			Class340 class340 = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i_0_][i_1_][i_2_]);
			if (class340 == null)
				((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i_0_][i_1_][i_2_] = class340 = new Class340(i_0_);
			if (i == 1) {
				((Class340) class340).aShort3392 = (short) i_3_;
				((Class340) class340).aShort3387 = (short) i_4_;
			} else if (i == 2) {
				((Class340) class340).aShort3389 = (short) i_3_;
				((Class340) class340).aShort3390 = (short) i_4_;
			}
			if (((Class358) this).aBoolean3712)
				method4221();
		}
	}

	public void method4217(int i, int i_17_, int i_18_, int i_19_) {
		if (i == 8 || i == 16) {
			for (int i_20_ = 0; i_20_ < ((Class358) this).anInt3720; i_20_++) {
				Class385 class385 = ((Class358) this).aClass385Array3721[i_20_];
				if (((Class385) class385).aByte3975 == i && ((Class385) class385).aByte3972 == i_17_ && ((((Class385) class385).aShort3977 == i_18_ && ((Class385) class385).aShort3971 == i_19_) || (((Class385) class385).aShort3978 == i_18_ && ((Class385) class385).aShort3980 == i_19_))) {
					if (i_20_ != ((Class358) this).anInt3720)
						System.arraycopy(((Class358) this).aClass385Array3721, i_20_ + 1, ((Class358) this).aClass385Array3721, i_20_, ((((Class358) this).aClass385Array3721).length - (i_20_ + 1)));
					((Class358) this).anInt3720--;
					break;
				}
			}
		} else {
			Class340 class340 = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i_17_][i_18_][i_19_]);
			if (class340 != null) {
				if (i == 1)
					((Class340) class340).aShort3392 = (short) 0;
				else if (i == 2)
					((Class340) class340).aShort3389 = (short) 0;
			}
			method4221();
		}
	}

	public void method4218() {
		method4221();
	}

	boolean method4219(int i, int i_21_, int i_22_) {
		if (!aBoolean3724 || !((Class358) this).aBoolean3706)
			return false;
		if (((Class347) ((Class358) this).aClass347_3711).anInt3432 < 100)
			return false;
		int i_23_ = ((Class358) this).anIntArrayArrayArray3713[i][i_21_][i_22_];
		if (i_23_ == -(((Class356) ((Class358) this).aClass356_3710).anInt3682 * -1897521885))
			return false;
		if (i_23_ == (((Class356) ((Class358) this).aClass356_3710).anInt3682 * -1897521885))
			return true;
		if (((Class358) this).aClass356_3710.aClass_xaArray3676 == ((Class358) this).aClass356_3710.aClass_xaArray3658)
			return false;
		int i_24_ = i_21_ << ((Class358) this).aClass356_3710.anInt3641 * 916917461;
		int i_25_ = i_22_ << ((Class358) this).aClass356_3710.anInt3641 * 916917461;
		if (method4229(i_24_ + 1, ((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_21_, i_22_, -810122471), i_25_ + 1, i_24_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703 - 1, ((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_21_ + 1, i_22_ + 1, 1686219418), i_25_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703 - 1, i_24_ + 1, ((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_21_, i_22_ + 1, 1387631521), i_25_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703 - 1) && method4229(i_24_ + 1, ((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_21_, i_22_, -135559782), i_25_ + 1, (i_24_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703 - 1), ((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_21_ + 1, i_22_, 1906630126), i_25_ + 1, (i_24_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703 - 1), ((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_21_ + 1, i_22_ + 1, -738347726), (i_25_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703 - 1))) {
			((Class358) this).anIntArrayArrayArray3713[i][i_21_][i_22_] = (((Class356) ((Class358) this).aClass356_3710).anInt3682 * -1897521885);
			return true;
		}
		((Class358) this).anIntArrayArrayArray3713[i][i_21_][i_22_] = -(((Class356) ((Class358) this).aClass356_3710).anInt3682 * -1897521885);
		return false;
	}

	final boolean method4220(int i, int i_26_, int i_27_) {
		aClass_ra3716.method_do((float) i, (float) i_26_, (float) i_27_, ((Class358) this).aFloatArray3731);
		if (((Class358) this).aFloatArray3731[2] < 50.0F)
			return false;
		((Class358) this).aFloatArray3731[0] /= 3.0F;
		((Class358) this).aFloatArray3731[1] /= 3.0F;
		return true;
	}

	void method4221() {
		for (int i = 0; i < ((Class358) this).anInt3718; i++)
			((Class358) this).aClass385Array3719[i] = null;
		((Class358) this).anInt3718 = 0;
		for (int i = 0; i < ((Class358) this).aClass356_3710.anInt3650 * 1886598059; i++) {
			for (int i_28_ = 0; (i_28_ < ((Class358) this).aClass356_3710.anInt3667 * -265955713); i_28_++) {
				for (int i_29_ = 0; (i_29_ < ((Class358) this).aClass356_3710.anInt3654 * 95955317); i_29_++) {
					Class340 class340 = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_29_][i_28_]);
					if (class340 != null) {
						if (((Class340) class340).aShort3392 > 0)
							((Class340) class340).aShort3392 *= -1;
						if (((Class340) class340).aShort3389 > 0)
							((Class340) class340).aShort3389 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < ((Class358) this).aClass356_3710.anInt3650 * 1886598059; i++) {
			for (int i_30_ = 0; (i_30_ < ((Class358) this).aClass356_3710.anInt3667 * -265955713); i_30_++) {
				for (int i_31_ = 0; (i_31_ < ((Class358) this).aClass356_3710.anInt3654 * 95955317); i_31_++) {
					Class340 class340 = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_31_][i_30_]);
					if (class340 != null) {
						boolean bool = ((((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[0][i_31_][i_30_]) != null && (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[0][i_31_][i_30_].aClass340_3380) != null);
						if (((Class340) class340).aShort3392 < 0) {
							int i_32_ = i_30_;
							int i_33_ = i_30_;
							int i_34_ = i;
							int i_35_ = i;
							Class340 class340_36_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_31_][i_32_ - 1]);
							int i_37_;
							for (i_37_ = (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_31_, i_30_, 898360984)); (i_32_ > 0 && class340_36_ != null && ((Class340) class340_36_).aShort3392 < 0 && (((Class340) class340_36_).aShort3392 == ((Class340) class340).aShort3392) && (((Class340) class340_36_).aShort3387 == ((Class340) class340).aShort3387) && i_37_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_31_, i_32_ - 1, 2137212182)) && (i_32_ - 1 <= 0 || (i_37_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_31_, i_32_ - 2, 1401278260)))) && i_33_ - i_32_ <= 10); class340_36_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_31_][i_32_ - 1]))
								i_32_--;
							for (class340_36_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_31_][i_33_ + 1]); (i_33_ < (((Class358) this).aClass356_3710.anInt3654) * 95955317 && class340_36_ != null && ((Class340) class340_36_).aShort3392 < 0 && (((Class340) class340_36_).aShort3392 == ((Class340) class340).aShort3392) && (((Class340) class340_36_).aShort3387 == ((Class340) class340).aShort3387) && i_37_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_31_, i_33_ + 1, 2047896844)) && (i_33_ + 1 >= ((((Class358) this).aClass356_3710.anInt3654) * 95955317) || (i_37_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_31_, i_33_ + 2, -533453240)))) && i_33_ - i_32_ <= 10); class340_36_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_31_][i_33_ + 1]))
								i_33_++;
							int i_38_ = i_35_ - i_34_ + 1;
							int i_39_ = ((Class358) this).aClass356_3710.aClass_xaArray3701[bool ? i_34_ + 1 : i_34_].method6417(i_31_, i_32_, -49512996);
							int i_40_ = (i_39_ + ((Class340) class340).aShort3392 * i_38_);
							int i_41_ = (((Class358) this).aClass356_3710.aClass_xaArray3701[bool ? i_34_ + 1 : i_34_].method6417(i_31_, i_33_ + 1, 2110811991));
							int i_42_ = (i_41_ + ((Class340) class340).aShort3392 * i_38_);
							int i_43_ = i_31_ << (((Class358) this).aClass356_3710.anInt3641) * 916917461;
							int i_44_ = i_32_ << (((Class358) this).aClass356_3710.anInt3641) * 916917461;
							int i_45_ = ((i_33_ << (((Class358) this).aClass356_3710.anInt3641) * 916917461) + (((Class356) (((Class358) this).aClass356_3710)).anInt3656 * 415703703));
							((Class358) this).aClass385Array3719[((Class358) this).anInt3718++] = (new Class385(((Class358) this).aClass356_3710, 1, i_35_, i_43_ + ((Class340) class340).aShort3387, i_43_ + ((Class340) class340).aShort3387, i_43_ + ((Class340) class340).aShort3387, i_43_ + ((Class340) class340).aShort3387, i_39_, i_41_, i_42_, i_40_, i_44_, i_45_, i_45_, i_44_));
							for (int i_46_ = i_34_; i_46_ <= i_35_; i_46_++) {
								for (int i_47_ = i_32_; i_47_ <= i_33_; i_47_++)
									((Class340) (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i_46_][i_31_][i_47_])).aShort3392 *= -1;
							}
						}
						if (((Class340) class340).aShort3389 < 0) {
							int i_48_ = i_31_;
							int i_49_ = i_31_;
							int i_50_ = i;
							int i_51_ = i;
							Class340 class340_52_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_48_ - 1][i_30_]);
							int i_53_;
							for (i_53_ = (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_31_, i_30_, 1744796133)); (i_48_ > 0 && class340_52_ != null && ((Class340) class340_52_).aShort3389 < 0 && (((Class340) class340_52_).aShort3389 == ((Class340) class340).aShort3389) && (((Class340) class340_52_).aShort3390 == ((Class340) class340).aShort3390) && i_53_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_48_ - 1, i_30_, 737759792)) && (i_48_ - 1 <= 0 || (i_53_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_48_ - 2, i_30_, 492325148)))) && i_49_ - i_48_ <= 10); class340_52_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_48_ - 1][i_30_]))
								i_48_--;
							for (class340_52_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_49_ + 1][i_30_]); (i_49_ < (((Class358) this).aClass356_3710.anInt3667) * -265955713 && class340_52_ != null && ((Class340) class340_52_).aShort3389 < 0 && (((Class340) class340_52_).aShort3389 == ((Class340) class340).aShort3389) && (((Class340) class340_52_).aShort3390 == ((Class340) class340).aShort3390) && i_53_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_49_ + 1, i_30_, -1363578179)) && (i_49_ + 1 >= ((((Class358) this).aClass356_3710.anInt3667) * -265955713) || (i_53_ == (((Class358) this).aClass356_3710.aClass_xaArray3701[i].method6417(i_49_ + 2, i_30_, 914971992)))) && i_49_ - i_48_ <= 10); class340_52_ = (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i][i_49_ + 1][i_30_]))
								i_49_++;
							int i_54_ = i_51_ - i_50_ + 1;
							int i_55_ = ((Class358) this).aClass356_3710.aClass_xaArray3701[bool ? i_50_ + 1 : i_50_].method6417(i_48_, i_30_, -1210976807);
							int i_56_ = (i_55_ + ((Class340) class340).aShort3389 * i_54_);
							int i_57_ = (((Class358) this).aClass356_3710.aClass_xaArray3701[bool ? i_50_ + 1 : i_50_].method6417(i_49_ + 1, i_30_, 1791576999));
							int i_58_ = (i_57_ + ((Class340) class340).aShort3389 * i_54_);
							int i_59_ = i_48_ << (((Class358) this).aClass356_3710.anInt3641) * 916917461;
							int i_60_ = ((i_49_ << (((Class358) this).aClass356_3710.anInt3641) * 916917461) + (((Class356) (((Class358) this).aClass356_3710)).anInt3656 * 415703703));
							int i_61_ = i_30_ << (((Class358) this).aClass356_3710.anInt3641) * 916917461;
							((Class358) this).aClass385Array3719[((Class358) this).anInt3718++] = (new Class385(((Class358) this).aClass356_3710, 2, i_51_, i_59_, i_60_, i_60_, i_59_, i_55_, i_57_, i_58_, i_56_, i_61_ + ((Class340) class340).aShort3390, i_61_ + ((Class340) class340).aShort3390, i_61_ + ((Class340) class340).aShort3390, i_61_ + ((Class340) class340).aShort3390));
							for (int i_62_ = i_50_; i_62_ <= i_51_; i_62_++) {
								for (int i_63_ = i_48_; i_63_ <= i_49_; i_63_++)
									((Class340) (((Class358) this).aClass356_3710.aClass340ArrayArrayArray3653[i_62_][i_63_][i_30_])).aShort3389 *= -1;
							}
						}
					}
				}
			}
		}
		((Class358) this).aBoolean3712 = true;
	}

	void method4222(Class_ra class_ra, int i) {
		aClass_ra3716 = class_ra;
		if (!aBoolean3724 || !((Class358) this).aBoolean3706)
			((Class358) this).anInt3726 = 0;
		else {
			if (((Class358) this).aBoolean3735)
				((Class356) ((Class358) this).aClass356_3710).aClass509_3646.method6161(1688032175);
			aClass_ra3716.method4803(((Class358) this).anIntArray3732);
			if ((((Class358) this).anInt3733 != (int) ((float) ((Class358) this).anIntArray3732[0] / 3.0F)) || (((Class358) this).anInt3725 != (int) ((float) ((Class358) this).anIntArray3732[1] / 3.0F))) {
				((Class358) this).anInt3733 = (int) ((float) ((Class358) this).anIntArray3732[0] / 3.0F);
				((Class358) this).anInt3725 = (int) ((float) ((Class358) this).anIntArray3732[1] / 3.0F);
				((Class358) this).anIntArray3717 = new int[(((Class358) this).anInt3733 * ((Class358) this).anInt3725)];
			}
			((Class358) this).anInt3726 = 0;
			for (int i_64_ = 0; i_64_ < ((Class358) this).anInt3715; i_64_++)
				method4231(aClass_ra3716, ((Class358) this).aClass385Array3730[i_64_], i);
			for (int i_65_ = 0; i_65_ < ((Class358) this).anInt3718; i_65_++)
				method4231(aClass_ra3716, ((Class358) this).aClass385Array3719[i_65_], i);
			for (int i_66_ = 0; i_66_ < ((Class358) this).anInt3720; i_66_++)
				method4231(aClass_ra3716, ((Class358) this).aClass385Array3721[i_66_], i);
			((Class347) ((Class358) this).aClass347_3711).anInt3432 = 0;
			if (((Class358) this).anInt3726 > 0) {
				int i_67_ = ((Class358) this).anIntArray3717.length;
				int i_68_ = i_67_ - i_67_ & 0x7;
				int i_69_ = 0;
				while (i_69_ < i_68_) {
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
				}
				while (i_69_ < i_67_)
					((Class358) this).anIntArray3717[i_69_++] = 2147483647;
				((Class347) ((Class358) this).aClass347_3711).anInt3431 = 1;
				for (int i_70_ = 0; i_70_ < ((Class358) this).anInt3726; i_70_++) {
					Class385 class385 = ((Class358) this).aClass385Array3723[i_70_];
					((Class358) this).aClass347_3711.method4017(((Class385) class385).aShortArray3985[0], ((Class385) class385).aShortArray3985[1], ((Class385) class385).aShortArray3985[3], ((Class385) class385).aShortArray3981[0], ((Class385) class385).aShortArray3981[1], ((Class385) class385).aShortArray3981[3], ((Class385) class385).aShortArray3986[0], ((Class385) class385).aShortArray3986[1], ((Class385) class385).aShortArray3986[3]);
					((Class358) this).aClass347_3711.method4017(((Class385) class385).aShortArray3985[1], ((Class385) class385).aShortArray3985[2], ((Class385) class385).aShortArray3985[3], ((Class385) class385).aShortArray3981[1], ((Class385) class385).aShortArray3981[2], ((Class385) class385).aShortArray3981[3], ((Class385) class385).aShortArray3986[1], ((Class385) class385).aShortArray3986[2], ((Class385) class385).aShortArray3986[3]);
				}
				((Class347) ((Class358) this).aClass347_3711).anInt3431 = 2;
			}
			if (((Class358) this).aBoolean3735)
				((Class356) ((Class358) this).aClass356_3710).aClass509_3646.method6161(1688032175);
		}
	}

	boolean method4223(int i, int i_71_, int i_72_, int i_73_) {
		if (!aBoolean3724 || !((Class358) this).aBoolean3706)
			return false;
		if (((Class347) ((Class358) this).aClass347_3711).anInt3432 < 100)
			return false;
		if (!method4219(i, i_71_, i_72_))
			return false;
		int i_74_ = i_71_ << ((Class358) this).aClass356_3710.anInt3641 * 916917461;
		int i_75_ = i_72_ << ((Class358) this).aClass356_3710.anInt3641 * 916917461;
		if (method4225(i_74_, ((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_71_, i_72_, 314993764), i_75_, (((Class356) ((Class358) this).aClass356_3710).anInt3656 * 415703703), i_73_, (((Class356) ((Class358) this).aClass356_3710).anInt3656 * 415703703)))
			return true;
		return false;
	}

	final boolean method4224(Class348 class348) {
		if (class348 == null)
			return false;
		return method4225(((Class348) class348).anInt3439, ((Class348) class348).anInt3435, ((Class348) class348).anInt3440, (((Class348) class348).anInt3441 - ((Class348) class348).anInt3439), (((Class348) class348).anInt3443 - ((Class348) class348).anInt3435), (((Class348) class348).anInt3444 - ((Class348) class348).anInt3440));
	}

	final boolean method4225(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
		int i_81_ = i + i_78_;
		int i_82_ = i_76_ + i_79_;
		int i_83_ = i_77_ + i_80_;
		if (!method4229(i, i_82_, i_77_, i_81_, i_82_, i_83_, i, i_82_, i_83_))
			return false;
		if (!method4229(i, i_82_, i_77_, i_81_, i_82_, i_77_, i_81_, i_82_, i_83_))
			return false;
		if (i < (((Class356) ((Class358) this).aClass356_3710).anInt3665 * 1408033563)) {
			if (!method4229(i, i_76_, i_83_, i, i_82_, i_77_, i, i_82_, i_83_))
				return false;
			if (!method4229(i, i_76_, i_83_, i, i_76_, i_77_, i, i_82_, i_77_))
				return false;
		} else {
			if (!method4229(i_81_, i_76_, i_83_, i_81_, i_82_, i_77_, i_81_, i_82_, i_83_))
				return false;
			if (!method4229(i_81_, i_76_, i_83_, i_81_, i_76_, i_77_, i_81_, i_82_, i_77_))
				return false;
		}
		if (i_77_ < (((Class356) ((Class358) this).aClass356_3710).anInt3680 * -28071893)) {
			if (!method4229(i, i_76_, i_77_, i_81_, i_82_, i_77_, i, i_82_, i_77_))
				return false;
			if (!method4229(i, i_76_, i_77_, i_81_, i_76_, i_77_, i_81_, i_82_, i_77_))
				return false;
		} else {
			if (!method4229(i, i_76_, i_83_, i_81_, i_82_, i_83_, i, i_82_, i_83_))
				return false;
			if (!method4229(i, i_76_, i_83_, i_81_, i_76_, i_83_, i_81_, i_82_, i_83_))
				return false;
		}
		return true;
	}

	public void method4226(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_) {
		((Class358) this).aClass385Array3730[((Class358) this).anInt3715++] = new Class385(((Class358) this).aClass356_3710, i, i_84_, i_85_, i_86_, i_86_, i_85_, i_89_, i_90_, i_90_, i_89_, i_87_, i_87_, i_88_, i_88_);
	}

	boolean method4227(int i, int i_91_, int i_92_, int i_93_, int i_94_, Class348 class348) {
		if (!aBoolean3724 || !((Class358) this).aBoolean3706)
			return false;
		if (((Class347) ((Class358) this).aClass347_3711).anInt3432 < 100)
			return false;
		if (i_91_ == i_92_ && i_93_ == i_94_) {
			if (!method4219(i, i_91_, i_93_))
				return false;
			if (method4224(class348))
				return true;
			return false;
		}
		for (int i_95_ = i_91_; i_95_ <= i_92_; i_95_++) {
			for (int i_96_ = i_93_; i_96_ <= i_94_; i_96_++) {
				if (((Class358) this).anIntArrayArrayArray3713[i][i_95_][i_96_] == -((((Class356) ((Class358) this).aClass356_3710).anInt3682) * -1897521885))
					return false;
			}
		}
		if (!method4224(class348))
			return false;
		return true;
	}

	boolean method4228(Class385 class385, int i) {
		if (!method4220(((Class385) class385).anIntArray3979[i], ((Class385) class385).anIntArray3982[i], ((Class385) class385).anIntArray3983[i]))
			return false;
		((Class385) class385).aShortArray3981[i] = (short) (int) ((Class358) this).aFloatArray3731[0];
		((Class385) class385).aShortArray3985[i] = (short) (int) ((Class358) this).aFloatArray3731[1];
		((Class385) class385).aShortArray3986[i] = (short) (int) ((Class358) this).aFloatArray3731[2];
		return true;
	}

	final boolean method4229(int i, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_) {
		if (!method4220(i, i_97_, i_98_))
			return false;
		i = (int) ((Class358) this).aFloatArray3731[0];
		i_97_ = (int) ((Class358) this).aFloatArray3731[1];
		i_98_ = (int) ((Class358) this).aFloatArray3731[2];
		if (!method4220(i_99_, i_100_, i_101_))
			return false;
		i_99_ = (int) ((Class358) this).aFloatArray3731[0];
		i_100_ = (int) ((Class358) this).aFloatArray3731[1];
		i_101_ = (int) ((Class358) this).aFloatArray3731[2];
		if (!method4220(i_102_, i_103_, i_104_))
			return false;
		i_102_ = (int) ((Class358) this).aFloatArray3731[0];
		i_103_ = (int) ((Class358) this).aFloatArray3731[1];
		i_104_ = (int) ((Class358) this).aFloatArray3731[2];
		return ((Class358) this).aClass347_3711.method4017(i_97_, i_100_, i_103_, i, i_99_, i_102_, i_98_, i_101_, i_104_);
	}

	boolean method4230(Class432_Sub1_Sub5 class432_sub1_sub5, int i, int i_105_, int i_106_) {
		if (!aBoolean3724 || !((Class358) this).aBoolean3706)
			return false;
		if (((Class347) ((Class358) this).aClass347_3711).anInt3432 < 100)
			return false;
		if (!method4219(i, i_105_, i_106_))
			return false;
		int i_107_ = i_105_ << ((Class358) this).aClass356_3710.anInt3641 * 916917461;
		int i_108_ = i_106_ << ((Class358) this).aClass356_3710.anInt3641 * 916917461;
		int i_109_ = (((Class358) this).aClass356_3710.aClass_xaArray3676[i].method6417(i_105_, i_106_, 1897311919) - 1);
		int i_110_ = i_109_ + class432_sub1_sub5.method5370(-1863971100);
		if (class432_sub1_sub5.aShort9931 == 1) {
			if (!method4229(i_107_, i_109_, i_108_, i_107_, i_110_, i_108_, i_107_, i_110_, (i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703)))
				return false;
			if (!method4229(i_107_, i_109_, i_108_, i_107_, i_110_, (i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703), i_107_, i_109_, (i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703)))
				return false;
			return true;
		}
		if (class432_sub1_sub5.aShort9931 == 2) {
			if (!method4229(i_107_, i_109_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_110_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_107_, i_110_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703))
				return false;
			if (!method4229(i_107_, i_109_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_109_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_110_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703))
				return false;
			return true;
		}
		if (class432_sub1_sub5.aShort9931 == 4) {
			if (!method4229(i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_109_, i_108_, i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_110_, i_108_, i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_110_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703))
				return false;
			if (!method4229(i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_109_, i_108_, i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_110_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703, i_109_, i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703))
				return false;
			return true;
		}
		if (class432_sub1_sub5.aShort9931 == 8) {
			if (!method4229(i_107_, i_109_, i_108_, (i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703), i_110_, i_108_, i_107_, i_110_, i_108_))
				return false;
			if (!method4229(i_107_, i_109_, i_108_, (i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703), i_109_, i_108_, (i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3656) * 415703703), i_110_, i_108_))
				return false;
			return true;
		}
		if (class432_sub1_sub5.aShort9931 == 16) {
			if (!method4225(i_107_, i_109_, (i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163), (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163, i_110_, (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163))
				return false;
			return true;
		}
		if (class432_sub1_sub5.aShort9931 == 32) {
			if (!method4225((i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163), i_109_, (i_108_ + (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163), (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163, i_110_, (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163))
				return false;
			return true;
		}
		if (class432_sub1_sub5.aShort9931 == 64) {
			if (!method4225((i_107_ + (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163), i_109_, i_108_, (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163, i_110_, (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163))
				return false;
			return true;
		}
		if (class432_sub1_sub5.aShort9931 == 128) {
			if (!method4225(i_107_, i_109_, i_108_, (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163, i_110_, (((Class356) ((Class358) this).aClass356_3710).anInt3643) * 5094163))
				return false;
			return true;
		}
		return true;
	}

	void method4231(Class_ra class_ra, Class385 class385, int i) {
		aClass_ra3716 = class_ra;
		if (((Class358) this).anIntArray3708 != null && ((Class385) class385).aByte3972 >= i) {
			for (int i_111_ = 0; i_111_ < ((Class358) this).anIntArray3708.length; i_111_++) {
				if (((Class358) this).anIntArray3708[i_111_] != -1000000 && ((((Class385) class385).anIntArray3982[0] <= ((Class358) this).anIntArray3708[i_111_]) || (((Class385) class385).anIntArray3982[1] <= ((Class358) this).anIntArray3708[i_111_]) || (((Class385) class385).anIntArray3982[2] <= ((Class358) this).anIntArray3708[i_111_]) || (((Class385) class385).anIntArray3982[3] <= ((Class358) this).anIntArray3708[i_111_])) && ((((Class385) class385).anIntArray3979[0] <= ((Class358) this).anIntArray3707[i_111_]) || (((Class385) class385).anIntArray3979[1] <= ((Class358) this).anIntArray3707[i_111_]) || (((Class385) class385).anIntArray3979[2] <= ((Class358) this).anIntArray3707[i_111_]) || (((Class385) class385).anIntArray3979[3] <= ((Class358) this).anIntArray3707[i_111_])) && ((((Class385) class385).anIntArray3979[0] >= ((Class358) this).anIntArray3722[i_111_]) || (((Class385) class385).anIntArray3979[1] >= ((Class358) this).anIntArray3722[i_111_]) || (((Class385) class385).anIntArray3979[2] >= ((Class358) this).anIntArray3722[i_111_]) || (((Class385) class385).anIntArray3979[3] >= ((Class358) this).anIntArray3722[i_111_])) && ((((Class385) class385).anIntArray3983[0] <= ((Class358) this).anIntArray3727[i_111_]) || (((Class385) class385).anIntArray3983[1] <= ((Class358) this).anIntArray3727[i_111_]) || (((Class385) class385).anIntArray3983[2] <= ((Class358) this).anIntArray3727[i_111_]) || (((Class385) class385).anIntArray3983[3] <= ((Class358) this).anIntArray3727[i_111_])) && ((((Class385) class385).anIntArray3983[0] >= ((Class358) this).anIntArray3729[i_111_]) || (((Class385) class385).anIntArray3983[1] >= ((Class358) this).anIntArray3729[i_111_]) || (((Class385) class385).anIntArray3983[2] >= ((Class358) this).anIntArray3729[i_111_]) || (((Class385) class385).anIntArray3983[3] >= ((Class358) this).anIntArray3729[i_111_])))
					return;
			}
		}
		if (((Class385) class385).aByte3975 == 1) {
			int i_112_ = (((Class385) class385).aShort3977 - (((Class356) ((Class358) this).aClass356_3710).anInt3640 * 315907165) + (((Class356) ((Class358) this).aClass356_3710).anInt3673 * 316617313));
			if (i_112_ >= 0 && i_112_ <= ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313)) {
				int i_113_ = (((Class385) class385).aShort3971 - (((Class356) ((Class358) this).aClass356_3710).anInt3651) * 875564685 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_113_ < 0)
					i_113_ = 0;
				else if (i_113_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					return;
				int i_114_ = (((Class385) class385).aShort3980 - (((Class356) ((Class358) this).aClass356_3710).anInt3651) * 875564685 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_114_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673 * 316617313) + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					i_114_ = ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				else if (i_114_ < 0)
					return;
				boolean bool = false;
				while_91_: do {
					do {
						if (i_113_ > i_114_)
							break while_91_;
					} while (!((Class356) ((Class358) this).aClass356_3710).aBooleanArrayArray3700[i_112_][i_113_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) ((((Class356) (((Class358) this).aClass356_3710)).anInt3665 * 1408033563) - ((Class385) class385).anIntArray3979[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) ((Class358) this).anInt3728) && method4228(class385, 0) && method4228(class385, 1) && method4228(class385, 2) && method4228(class385, 3))
						((Class358) this).aClass385Array3723[((Class358) this).anInt3726++] = class385;
				}
			}
		} else if (((Class385) class385).aByte3975 == 2) {
			int i_115_ = (((Class385) class385).aShort3971 - (((Class356) ((Class358) this).aClass356_3710).anInt3651 * 875564685) + (((Class356) ((Class358) this).aClass356_3710).anInt3673 * 316617313));
			if (i_115_ >= 0 && i_115_ <= ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313)) {
				int i_116_ = (((Class385) class385).aShort3977 - (((Class356) ((Class358) this).aClass356_3710).anInt3640) * 315907165 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_116_ < 0)
					i_116_ = 0;
				else if (i_116_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					return;
				int i_117_ = (((Class385) class385).aShort3978 - (((Class356) ((Class358) this).aClass356_3710).anInt3640) * 315907165 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_117_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673 * 316617313) + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					i_117_ = ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				else if (i_117_ < 0)
					return;
				boolean bool = false;
				while_92_: do {
					do {
						if (i_116_ > i_117_)
							break while_92_;
					} while (!((Class356) ((Class358) this).aClass356_3710).aBooleanArrayArray3700[i_116_++][i_115_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) ((((Class356) (((Class358) this).aClass356_3710)).anInt3680 * -28071893) - ((Class385) class385).anIntArray3983[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) ((Class358) this).anInt3728) && method4228(class385, 0) && method4228(class385, 1) && method4228(class385, 2) && method4228(class385, 3))
						((Class358) this).aClass385Array3723[((Class358) this).anInt3726++] = class385;
				}
			}
		} else if (((Class385) class385).aByte3975 == 16 || ((Class385) class385).aByte3975 == 8) {
			int i_118_ = (((Class385) class385).aShort3977 - (((Class356) ((Class358) this).aClass356_3710).anInt3640 * 315907165) + (((Class356) ((Class358) this).aClass356_3710).anInt3673 * 316617313));
			if (i_118_ >= 0 && i_118_ <= ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313)) {
				int i_119_ = (((Class385) class385).aShort3971 - (((Class356) ((Class358) this).aClass356_3710).anInt3651) * 875564685 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_119_ >= 0 && (i_119_ <= ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313)) && (((Class356) ((Class358) this).aClass356_3710).aBooleanArrayArray3700[i_118_][i_119_])) {
					float f = (float) ((((Class356) (((Class358) this).aClass356_3710)).anInt3665 * 1408033563) - ((Class385) class385).anIntArray3979[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_120_ = (float) ((((Class356) (((Class358) this).aClass356_3710)).anInt3680 * -28071893) - ((Class385) class385).anIntArray3983[0]);
					if (f_120_ < 0.0F)
						f_120_ *= -1.0F;
					if ((!(f < (float) ((Class358) this).anInt3728) || !(f_120_ < (float) ((Class358) this).anInt3728)) && method4228(class385, 0) && method4228(class385, 1) && method4228(class385, 2) && method4228(class385, 3))
						((Class358) this).aClass385Array3723[((Class358) this).anInt3726++] = class385;
				}
			}
		} else if (((Class385) class385).aByte3975 == 4) {
			float f = (float) (((Class385) class385).anIntArray3982[0] - (((Class356) ((Class358) this).aClass356_3710).anInt3677) * -186684567);
			if (!(f <= (float) ((Class358) this).anInt3714)) {
				int i_121_ = (((Class385) class385).aShort3971 - (((Class356) ((Class358) this).aClass356_3710).anInt3651) * 875564685 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_121_ < 0)
					i_121_ = 0;
				else if (i_121_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					return;
				int i_122_ = (((Class385) class385).aShort3980 - (((Class356) ((Class358) this).aClass356_3710).anInt3651) * 875564685 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_122_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673 * 316617313) + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					i_122_ = ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				else if (i_122_ < 0)
					return;
				int i_123_ = (((Class385) class385).aShort3977 - (((Class356) ((Class358) this).aClass356_3710).anInt3640) * 315907165 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_123_ < 0)
					i_123_ = 0;
				else if (i_123_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					return;
				int i_124_ = (((Class385) class385).aShort3978 - (((Class356) ((Class358) this).aClass356_3710).anInt3640) * 315907165 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				if (i_124_ > ((((Class356) ((Class358) this).aClass356_3710).anInt3673 * 316617313) + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313))
					i_124_ = ((((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313 + (((Class356) ((Class358) this).aClass356_3710).anInt3673) * 316617313);
				else if (i_124_ < 0)
					return;
				boolean bool = false;
				while_93_: for (int i_125_ = i_123_; i_125_ <= i_124_; i_125_++) {
					for (int i_126_ = i_121_; i_126_ <= i_122_; i_126_++) {
						if (((Class356) ((Class358) this).aClass356_3710).aBooleanArrayArray3700[i_125_][i_126_]) {
							bool = true;
							break while_93_;
						}
					}
				}
				if (bool && method4228(class385, 0) && method4228(class385, 1) && method4228(class385, 2) && method4228(class385, 3))
					((Class358) this).aClass385Array3723[((Class358) this).anInt3726++] = class385;
			}
		}
	}
}
