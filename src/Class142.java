/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class142 {
	static Class143 aClass143_1567;
	public static Class368 aClass368_1568;

	Class142() throws Throwable {
		throw new Error();
	}

	public static int method1649(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i_1_ &= 0x3;
			if (0 == i_1_)
				return i;
			if (1 == i_1_)
				return i_0_;
			if (i_1_ == 2)
				return 7 - i;
			return 7 - i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.r(").append(')').toString());
		}
	}

	static final void method1650(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class152.method1788(iComponentDefinitions, class120, class430, -160154297);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.jq(").append(')').toString());
		}
	}

	static final void method1651(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_3_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_4_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			if (i_3_ == 0)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else if (0 == i_4_)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 2147483647;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (int) Math.pow((double) i_3_, 1.0 / (double) i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.zi(").append(')').toString());
		}
	}

	static final void method1652(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class556.aClass510_6392.getItemDefinitions(i_5_, (byte) -3).anInt6736) * 1369390791 == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.abd(").append(')').toString());
		}
	}

	static final void method1653(Class430 class430, int i) {
		try {
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_6_, 1763765593);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 1765410959 * iComponentDefinitions.anInt1229;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.rb(").append(')').toString());
		}
	}

	static final void method1654(Class430 class430, byte i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, 1384849724);
			Class120 class120 = Class3.aClass120Array56[i_7_ >> 16];
			Class121.method1445(iComponentDefinitions, class120, class430, 680050935);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.lq(").append(')').toString());
		}
	}

	static final void method1655(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class116.method1416(iComponentDefinitions, class120, class430, (byte) 123);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.id(").append(')').toString());
		}
	}

	public static byte[][][] method1656(int i, int i_8_) {
		try {
			byte[][][] is = new byte[8][4][];
			int i_9_ = i;
			int i_10_ = i;
			byte[] is_11_ = new byte[i_9_ * i_10_];
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < i_10_; i_13_++) {
				for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
					if (i_14_ <= i_13_)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[0][0] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_15_ = i_10_ - 1; i_15_ >= 0; i_15_--) {
				for (int i_16_ = 0; i_16_ < i_10_; i_16_++) {
					if (i_16_ <= i_15_)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[0][1] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
				for (int i_18_ = 0; i_18_ < i_9_; i_18_++) {
					if (i_18_ >= i_17_)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[0][2] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_19_ = i_10_ - 1; i_19_ >= 0; i_19_--) {
				for (int i_20_ = 0; i_20_ < i_9_; i_20_++) {
					if (i_20_ >= i_19_)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[0][3] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_21_ = i_10_ - 1; i_21_ >= 0; i_21_--) {
				for (int i_22_ = 0; i_22_ < i_9_; i_22_++) {
					if (i_22_ <= i_21_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[1][0] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_23_ = 0; i_23_ < i_10_; i_23_++) {
				for (int i_24_ = 0; i_24_ < i_9_; i_24_++) {
					if (i_12_ < 0 || i_12_ >= is_11_.length)
						i_12_++;
					else {
						if (i_24_ >= i_23_ << 1)
							is_11_[i_12_] = (byte) -1;
						i_12_++;
					}
				}
			}
			is[1][1] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_25_ = 0; i_25_ < i_10_; i_25_++) {
				for (int i_26_ = i_9_ - 1; i_26_ >= 0; i_26_--) {
					if (i_26_ <= i_25_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[1][2] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_27_ = i_10_ - 1; i_27_ >= 0; i_27_--) {
				for (int i_28_ = i_9_ - 1; i_28_ >= 0; i_28_--) {
					if (i_28_ >= i_27_ << 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[1][3] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_29_ = i_10_ - 1; i_29_ >= 0; i_29_--) {
				for (int i_30_ = i_9_ - 1; i_30_ >= 0; i_30_--) {
					if (i_30_ <= i_29_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[2][0] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_31_ = i_10_ - 1; i_31_ >= 0; i_31_--) {
				for (int i_32_ = 0; i_32_ < i_9_; i_32_++) {
					if (i_32_ >= i_31_ << 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[2][1] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_33_ = 0; i_33_ < i_10_; i_33_++) {
				for (int i_34_ = 0; i_34_ < i_9_; i_34_++) {
					if (i_34_ <= i_33_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[2][2] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_35_ = 0; i_35_ < i_10_; i_35_++) {
				for (int i_36_ = i_9_ - 1; i_36_ >= 0; i_36_--) {
					if (i_36_ >= i_35_ << 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[2][3] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_37_ = i_10_ - 1; i_37_ >= 0; i_37_--) {
				for (int i_38_ = 0; i_38_ < i_9_; i_38_++) {
					if (i_38_ >= i_37_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[3][0] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_39_ = 0; i_39_ < i_10_; i_39_++) {
				for (int i_40_ = 0; i_40_ < i_9_; i_40_++) {
					if (i_40_ <= i_39_ << 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[3][1] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_41_ = 0; i_41_ < i_10_; i_41_++) {
				for (int i_42_ = i_9_ - 1; i_42_ >= 0; i_42_--) {
					if (i_42_ >= i_41_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[3][2] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_43_ = i_10_ - 1; i_43_ >= 0; i_43_--) {
				for (int i_44_ = i_9_ - 1; i_44_ >= 0; i_44_--) {
					if (i_44_ <= i_43_ << 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[3][3] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_45_ = i_10_ - 1; i_45_ >= 0; i_45_--) {
				for (int i_46_ = i_9_ - 1; i_46_ >= 0; i_46_--) {
					if (i_46_ >= i_45_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[4][0] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_47_ = i_10_ - 1; i_47_ >= 0; i_47_--) {
				for (int i_48_ = 0; i_48_ < i_9_; i_48_++) {
					if (i_48_ <= i_47_ << 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[4][1] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_49_ = 0; i_49_ < i_10_; i_49_++) {
				for (int i_50_ = 0; i_50_ < i_9_; i_50_++) {
					if (i_50_ >= i_49_ >> 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[4][2] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_51_ = 0; i_51_ < i_10_; i_51_++) {
				for (int i_52_ = i_9_ - 1; i_52_ >= 0; i_52_--) {
					if (i_52_ <= i_51_ << 1)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[4][3] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_53_ = 0; i_53_ < i_10_; i_53_++) {
				for (int i_54_ = 0; i_54_ < i_9_; i_54_++) {
					if (i_54_ <= i_9_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[5][0] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_55_ = 0; i_55_ < i_10_; i_55_++) {
				for (int i_56_ = 0; i_56_ < i_9_; i_56_++) {
					if (i_55_ <= i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[5][1] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_57_ = 0; i_57_ < i_10_; i_57_++) {
				for (int i_58_ = 0; i_58_ < i_9_; i_58_++) {
					if (i_58_ >= i_9_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[5][2] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_59_ = 0; i_59_ < i_10_; i_59_++) {
				for (int i_60_ = 0; i_60_ < i_9_; i_60_++) {
					if (i_59_ >= i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[5][3] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_61_ = 0; i_61_ < i_10_; i_61_++) {
				for (int i_62_ = 0; i_62_ < i_9_; i_62_++) {
					if (i_62_ <= i_61_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[6][0] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_63_ = i_10_ - 1; i_63_ >= 0; i_63_--) {
				for (int i_64_ = 0; i_64_ < i_9_; i_64_++) {
					if (i_64_ <= i_63_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[6][1] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_65_ = i_10_ - 1; i_65_ >= 0; i_65_--) {
				for (int i_66_ = i_9_ - 1; i_66_ >= 0; i_66_--) {
					if (i_66_ <= i_65_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[6][2] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_67_ = 0; i_67_ < i_10_; i_67_++) {
				for (int i_68_ = i_9_ - 1; i_68_ >= 0; i_68_--) {
					if (i_68_ <= i_67_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[6][3] = is_11_;
			is_11_ = new byte[i_10_ * i_9_];
			i_12_ = 0;
			for (int i_69_ = 0; i_69_ < i_10_; i_69_++) {
				for (int i_70_ = 0; i_70_ < i_9_; i_70_++) {
					if (i_70_ >= i_69_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[7][0] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_71_ = i_10_ - 1; i_71_ >= 0; i_71_--) {
				for (int i_72_ = 0; i_72_ < i_9_; i_72_++) {
					if (i_72_ >= i_71_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[7][1] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_73_ = i_10_ - 1; i_73_ >= 0; i_73_--) {
				for (int i_74_ = i_9_ - 1; i_74_ >= 0; i_74_--) {
					if (i_74_ >= i_73_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[7][2] = is_11_;
			is_11_ = new byte[i_9_ * i_10_];
			i_12_ = 0;
			for (int i_75_ = 0; i_75_ < i_10_; i_75_++) {
				for (int i_76_ = i_9_ - 1; i_76_ >= 0; i_76_--) {
					if (i_76_ >= i_75_ - i_10_ / 2)
						is_11_[i_12_] = (byte) -1;
					i_12_++;
				}
			}
			is[7][3] = is_11_;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ft.j(").append(')').toString());
		}
	}
}
