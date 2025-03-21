/* Class330_Sub49_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub49_Sub1 extends Class330_Sub49 {
	static int anInt9841 = 4;
	byte[] aByteArray9842 = new byte[512];
	static int anInt9843 = 4;
	static int anInt9844 = 0;
	short[] aShortArray9845;
	int anInt9846;
	short[] aShortArray9847;
	static int anInt9848 = 1638;
	int anInt9849 = 0;
	int anInt9850 = 1673664476;
	int anInt9851 = -197967564;
	int anInt9852 = 2124597948;
	boolean aBoolean9853;
	static boolean aBoolean9854 = true;
	static int anInt9855 = 8;

	void method3849(int i, int[] is, byte i_0_) {
		try {
			int i_1_ = (Class511.anIntArray5954[i] * (((Class330_Sub49_Sub1) this).anInt9851 * 853207173));
			if (1 == ((Class330_Sub49_Sub1) this).anInt9852 * 138667087) {
				int i_2_ = ((Class330_Sub49_Sub1) this).aShortArray9845[0];
				int i_3_ = ((Class330_Sub49_Sub1) this).aShortArray9847[0] << 12;
				int i_4_ = (i_3_ * (853207173 * ((Class330_Sub49_Sub1) this).anInt9851) >> 12);
				int i_5_ = ((1549519815 * ((Class330_Sub49_Sub1) this).anInt9850 * i_3_) >> 12);
				int i_6_ = i_3_ * i_1_ >> 12;
				int i_7_ = i_6_ >> 12;
				int i_8_ = i_7_ + 1;
				if (i_8_ >= i_4_)
					i_8_ = 0;
				i_6_ &= 0xfff;
				int i_9_ = Class223.anIntArray2362[i_6_];
				int i_10_ = (((Class330_Sub49_Sub1) this).aByteArray9842[i_7_ & 0xff] & 0xff);
				int i_11_ = (((Class330_Sub49_Sub1) this).aByteArray9842[i_8_ & 0xff] & 0xff);
				if (((Class330_Sub49_Sub1) this).aBoolean9853) {
					for (int i_12_ = 0; i_12_ < -1507352525 * Class511.anInt5948; i_12_++) {
						int i_13_ = (((Class330_Sub49_Sub1) this).anInt9850 * 1549519815 * Class511.anIntArray5949[i_12_]);
						int i_14_ = method3852(i_3_ * i_13_ >> 12, i_6_, i_10_, i_11_, i_9_, i_5_, 570450423);
						i_14_ = i_2_ * i_14_ >> 12;
						is[i_12_] = 2048 + (i_14_ >> 1);
					}
				} else {
					for (int i_15_ = 0; i_15_ < -1507352525 * Class511.anInt5948; i_15_++) {
						int i_16_ = (((Class330_Sub49_Sub1) this).anInt9850 * 1549519815 * Class511.anIntArray5949[i_15_]);
						int i_17_ = method3852(i_3_ * i_16_ >> 12, i_6_, i_10_, i_11_, i_9_, i_5_, 1736448918);
						is[i_15_] = i_2_ * i_17_ >> 12;
					}
				}
			} else {
				int i_18_ = ((Class330_Sub49_Sub1) this).aShortArray9845[0];
				if (i_18_ > 8 || i_18_ < -8) {
					int i_19_ = (((Class330_Sub49_Sub1) this).aShortArray9847[0] << 12);
					int i_20_ = ((((Class330_Sub49_Sub1) this).anInt9851 * 853207173 * i_19_) >> 12);
					int i_21_ = ((((Class330_Sub49_Sub1) this).anInt9850 * 1549519815 * i_19_) >> 12);
					int i_22_ = i_1_ * i_19_ >> 12;
					int i_23_ = i_22_ >> 12;
					int i_24_ = 1 + i_23_;
					if (i_24_ >= i_20_)
						i_24_ = 0;
					i_22_ &= 0xfff;
					int i_25_ = Class223.anIntArray2362[i_22_];
					int i_26_ = ((((Class330_Sub49_Sub1) this).aByteArray9842[i_23_ & 0xff]) & 0xff);
					int i_27_ = ((((Class330_Sub49_Sub1) this).aByteArray9842[i_24_ & 0xff]) & 0xff);
					for (int i_28_ = 0; i_28_ < -1507352525 * Class511.anInt5948; i_28_++) {
						int i_29_ = (((Class330_Sub49_Sub1) this).anInt9850 * 1549519815 * Class511.anIntArray5949[i_28_]);
						int i_30_ = method3852(i_29_ * i_19_ >> 12, i_22_, i_26_, i_27_, i_25_, i_21_, 1315923484);
						is[i_28_] = i_30_ * i_18_ >> 12;
					}
				}
				for (int i_31_ = 1; (i_31_ < 138667087 * ((Class330_Sub49_Sub1) this).anInt9852); i_31_++) {
					i_18_ = ((Class330_Sub49_Sub1) this).aShortArray9845[i_31_];
					if (i_18_ > 8 || i_18_ < -8) {
						int i_32_ = ((((Class330_Sub49_Sub1) this).aShortArray9847[i_31_]) << 12);
						int i_33_ = ((853207173 * ((Class330_Sub49_Sub1) this).anInt9851 * i_32_) >> 12);
						int i_34_ = ((1549519815 * ((Class330_Sub49_Sub1) this).anInt9850 * i_32_) >> 12);
						int i_35_ = i_32_ * i_1_ >> 12;
						int i_36_ = i_35_ >> 12;
						int i_37_ = i_36_ + 1;
						if (i_37_ >= i_33_)
							i_37_ = 0;
						i_35_ &= 0xfff;
						int i_38_ = Class223.anIntArray2362[i_35_];
						int i_39_ = ((((Class330_Sub49_Sub1) this).aByteArray9842[i_36_ & 0xff]) & 0xff);
						int i_40_ = ((((Class330_Sub49_Sub1) this).aByteArray9842[i_37_ & 0xff]) & 0xff);
						if (((Class330_Sub49_Sub1) this).aBoolean9853 && i_31_ == (((Class330_Sub49_Sub1) this).anInt9852 * 138667087) - 1) {
							for (int i_41_ = 0; i_41_ < -1507352525 * Class511.anInt5948; i_41_++) {
								int i_42_ = (Class511.anIntArray5949[i_41_] * (1549519815 * (((Class330_Sub49_Sub1) this).anInt9850)));
								int i_43_ = method3852(i_42_ * i_32_ >> 12, i_35_, i_39_, i_40_, i_38_, i_34_, 466053670);
								i_43_ = is[i_41_] + (i_43_ * i_18_ >> 12);
								is[i_41_] = 2048 + (i_43_ >> 1);
							}
						} else {
							for (int i_44_ = 0; i_44_ < Class511.anInt5948 * -1507352525; i_44_++) {
								int i_45_ = (Class511.anIntArray5949[i_44_] * ((((Class330_Sub49_Sub1) this).anInt9850) * 1549519815));
								int i_46_ = method3852(i_45_ * i_32_ >> 12, i_35_, i_39_, i_40_, i_38_, i_34_, 1322077465);
								is[i_44_] += i_46_ * i_18_ >> 12;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajv.r(").append(')').toString());
		}
	}

	void method3850(int i) {
		try {
			((Class330_Sub49_Sub1) this).aByteArray9842 = Class511.method6176(-345374061 * ((Class330_Sub49_Sub1) this).anInt9849, (byte) -53);
			method3851((byte) 1);
			for (int i_47_ = 138667087 * ((Class330_Sub49_Sub1) this).anInt9852 - 1; i_47_ >= 1; i_47_--) {
				short i_48_ = ((Class330_Sub49_Sub1) this).aShortArray9845[i_47_];
				if (i_48_ > 8 || i_48_ < -8)
					break;
				((Class330_Sub49_Sub1) this).anInt9852 -= 1604891311;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajv.i(").append(')').toString());
		}
	}

	Class330_Sub49_Sub1() {
		super(0, true);
		((Class330_Sub49_Sub1) this).anInt9846 = -554748930;
		((Class330_Sub49_Sub1) this).aBoolean9853 = true;
	}

	void method3851(byte i) {
		try {
			if (-944615731 * ((Class330_Sub49_Sub1) this).anInt9846 > 0) {
				((Class330_Sub49_Sub1) this).aShortArray9845 = (new short[138667087 * ((Class330_Sub49_Sub1) this).anInt9852]);
				((Class330_Sub49_Sub1) this).aShortArray9847 = (new short[138667087 * ((Class330_Sub49_Sub1) this).anInt9852]);
				for (int i_49_ = 0; (i_49_ < 138667087 * ((Class330_Sub49_Sub1) this).anInt9852); i_49_++) {
					((Class330_Sub49_Sub1) this).aShortArray9845[i_49_] = (short) (int) ((Math.pow((double) ((float) (-944615731 * (((Class330_Sub49_Sub1) this).anInt9846)) / 4096.0F), (double) i_49_)) * 4096.0);
					((Class330_Sub49_Sub1) this).aShortArray9847[i_49_] = (short) (int) Math.pow(2.0, (double) i_49_);
				}
			} else if (((Class330_Sub49_Sub1) this).aShortArray9845 != null && (((Class330_Sub49_Sub1) this).aShortArray9845.length == (((Class330_Sub49_Sub1) this).anInt9852 * 138667087))) {
				((Class330_Sub49_Sub1) this).aShortArray9847 = (new short[((Class330_Sub49_Sub1) this).anInt9852 * 138667087]);
				for (int i_50_ = 0; (i_50_ < ((Class330_Sub49_Sub1) this).anInt9852 * 138667087); i_50_++)
					((Class330_Sub49_Sub1) this).aShortArray9847[i_50_] = (short) (int) Math.pow(2.0, (double) i_50_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajv.p(").append(')').toString());
		}
	}

	int method3852(int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_) {
		try {
			int i_57_ = i >> 12;
			int i_58_ = 1 + i_57_;
			if (i_58_ >= i_55_)
				i_58_ = 0;
			i &= 0xfff;
			i_57_ &= 0xff;
			i_58_ &= 0xff;
			int i_59_ = i - 4096;
			int i_60_ = i_51_ - 4096;
			int i_61_ = Class223.anIntArray2362[i];
			int i_62_ = (((Class330_Sub49_Sub1) this).aByteArray9842[i_57_ + i_52_] & 0x3);
			int i_63_;
			if (i_62_ <= 1)
				i_63_ = i_62_ == 0 ? i_51_ + i : i_51_ - i;
			else
				i_63_ = 2 == i_62_ ? i - i_51_ : -i - i_51_;
			i_62_ = (((Class330_Sub49_Sub1) this).aByteArray9842[i_58_ + i_52_] & 0x3);
			int i_64_;
			if (i_62_ <= 1)
				i_64_ = 0 == i_62_ ? i_51_ + i_59_ : i_51_ - i_59_;
			else
				i_64_ = 2 == i_62_ ? i_59_ - i_51_ : -i_59_ - i_51_;
			int i_65_ = (i_61_ * (i_64_ - i_63_) >> 12) + i_63_;
			i_62_ = (((Class330_Sub49_Sub1) this).aByteArray9842[i_53_ + i_57_] & 0x3);
			if (i_62_ <= 1)
				i_63_ = i_62_ == 0 ? i + i_60_ : i_60_ - i;
			else
				i_63_ = 2 == i_62_ ? i - i_60_ : -i - i_60_;
			i_62_ = (((Class330_Sub49_Sub1) this).aByteArray9842[i_53_ + i_58_] & 0x3);
			if (i_62_ <= 1)
				i_64_ = 0 == i_62_ ? i_60_ + i_59_ : i_60_ - i_59_;
			else
				i_64_ = i_62_ == 2 ? i_59_ - i_60_ : -i_59_ - i_60_;
			int i_66_ = ((i_64_ - i_63_) * i_61_ >> 12) + i_63_;
			return i_65_ + ((i_66_ - i_65_) * i_54_ >> 12);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajv.j(").append(')').toString());
		}
	}
}
