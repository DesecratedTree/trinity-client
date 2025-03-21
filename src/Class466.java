/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class466 {
	static int anInt5591 = 6;
	static Class480 aClass480_5592 = new Class480();
	static int anInt5593 = 16;
	static int anInt5594 = 4096;
	static int anInt5595 = 1;
	static int anInt5596 = 23;
	static int anInt5597 = 50;
	static int anInt5598 = 0;

	public static int method5843(byte[] is, int i, byte[] is_0_, int i_1_, int i_2_) {
		synchronized (aClass480_5592) {
			((Class480) aClass480_5592).aByteArray5735 = is_0_;
			((Class480) aClass480_5592).anInt5749 = i_2_ * 1642735159;
			((Class480) aClass480_5592).aByteArray5738 = is;
			((Class480) aClass480_5592).anInt5739 = 0;
			((Class480) aClass480_5592).anInt5740 = i * -1878719425;
			((Class480) aClass480_5592).anInt5745 = 0;
			((Class480) aClass480_5592).anInt5732 = 0;
			((Class480) aClass480_5592).anInt5737 = 0;
			((Class480) aClass480_5592).anInt5733 = 0;
			method5847(aClass480_5592);
			i -= ((Class480) aClass480_5592).anInt5740 * -2019234881;
			((Class480) aClass480_5592).aByteArray5735 = null;
			((Class480) aClass480_5592).aByteArray5738 = null;
			int i_3_ = i;
			return i_3_;
		}
	}

	static byte method5844(Class480 class480) {
		return (byte) method5848(1, class480);
	}

	static void method5845(Class480 class480) {
		byte i = ((Class480) class480).aByte5742;
		int i_4_ = ((Class480) class480).anInt5743 * -269622201;
		int i_5_ = ((Class480) class480).anInt5736 * 1578680173;
		int i_6_ = ((Class480) class480).anInt5730 * -1864093483;
		int[] is = Class99.anIntArray917;
		int i_7_ = ((Class480) class480).anInt5748 * 1497279317;
		byte[] is_8_ = ((Class480) class480).aByteArray5738;
		int i_9_ = ((Class480) class480).anInt5739 * -2094496983;
		int i_10_ = ((Class480) class480).anInt5740 * -2019234881;
		int i_11_ = i_10_;
		int i_12_ = ((Class480) class480).anInt5766 * -440125861 + 1;
		while_98_: for (;;) {
			if (i_4_ > 0) {
				for (;;) {
					if (i_10_ == 0)
						break while_98_;
					if (i_4_ == 1)
						break;
					is_8_[i_9_] = i;
					i_4_--;
					i_9_++;
					i_10_--;
				}
				if (i_10_ == 0) {
					i_4_ = 1;
					break;
				}
				is_8_[i_9_] = i;
				i_9_++;
				i_10_--;
			}
			for (;;) {
				if (i_5_ == i_12_) {
					i_4_ = 0;
					break while_98_;
				}
				i = (byte) i_6_;
				i_7_ = is[i_7_];
				int i_13_ = (byte) i_7_;
				i_7_ >>= 8;
				i_5_++;
				if (i_13_ != i_6_) {
					i_6_ = i_13_;
					if (i_10_ == 0) {
						i_4_ = 1;
						break while_98_;
					}
					is_8_[i_9_] = i;
					i_9_++;
					i_10_--;
				} else {
					if (i_5_ != i_12_)
						break;
					if (i_10_ == 0) {
						i_4_ = 1;
						break while_98_;
					}
					is_8_[i_9_] = i;
					i_9_++;
					i_10_--;
				}
			}
			i_4_ = 2;
			i_7_ = is[i_7_];
			int i_14_ = (byte) i_7_;
			i_7_ >>= 8;
			if (++i_5_ != i_12_) {
				if (i_14_ != i_6_)
					i_6_ = i_14_;
				else {
					i_4_ = 3;
					i_7_ = is[i_7_];
					i_14_ = (byte) i_7_;
					i_7_ >>= 8;
					if (++i_5_ != i_12_) {
						if (i_14_ != i_6_)
							i_6_ = i_14_;
						else {
							i_7_ = is[i_7_];
							i_14_ = (byte) i_7_;
							i_7_ >>= 8;
							i_5_++;
							i_4_ = (i_14_ & 0xff) + 4;
							i_7_ = is[i_7_];
							i_6_ = (byte) i_7_;
							i_7_ >>= 8;
							i_5_++;
						}
					}
				}
			}
		}
		int i_15_ = ((Class480) class480).anInt5733 * 140002283;
		((Class480) class480).anInt5733 += (i_11_ - i_10_) * 1672465603;
		if (((Class480) class480).anInt5733 * 140002283 >= i_15_) {
			/* empty */
		}
		((Class480) class480).aByte5742 = i;
		((Class480) class480).anInt5743 = i_4_ * -1684109961;
		((Class480) class480).anInt5736 = i_5_ * 537928293;
		((Class480) class480).anInt5730 = i_6_ * -711489411;
		Class99.anIntArray917 = is;
		((Class480) class480).anInt5748 = i_7_ * -188745219;
		((Class480) class480).aByteArray5738 = is_8_;
		((Class480) class480).anInt5739 = i_9_ * 596691225;
		((Class480) class480).anInt5740 = i_10_ * -1878719425;
	}

	static byte method5846(Class480 class480) {
		return (byte) method5848(8, class480);
	}

	static void method5847(Class480 class480) {
		boolean bool = false;
		boolean bool_16_ = false;
		boolean bool_17_ = false;
		boolean bool_18_ = false;
		boolean bool_19_ = false;
		boolean bool_20_ = false;
		boolean bool_21_ = false;
		boolean bool_22_ = false;
		boolean bool_23_ = false;
		boolean bool_24_ = false;
		boolean bool_25_ = false;
		boolean bool_26_ = false;
		boolean bool_27_ = false;
		boolean bool_28_ = false;
		boolean bool_29_ = false;
		boolean bool_30_ = false;
		boolean bool_31_ = false;
		boolean bool_32_ = false;
		int i = 0;
		int[] is = null;
		int[] is_33_ = null;
		int[] is_34_ = null;
		((Class480) class480).anInt5746 = -1641282259;
		if (Class99.anIntArray917 == null)
			Class99.anIntArray917 = new int[((Class480) class480).anInt5746 * -1771895520];
		boolean bool_35_ = true;
		while (bool_35_) {
			byte i_36_ = method5846(class480);
			if (i_36_ == 23)
				break;
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5846(class480);
			i_36_ = method5844(class480);
			if (i_36_ == 0) {
				/* empty */
			}
			((Class480) class480).anInt5747 = 0;
			int i_37_ = method5846(class480);
			((Class480) class480).anInt5747 = (((Class480) class480).anInt5747 * -328303043 << 8 | i_37_ & 0xff) * -571111147;
			i_37_ = method5846(class480);
			((Class480) class480).anInt5747 = (((Class480) class480).anInt5747 * -328303043 << 8 | i_37_ & 0xff) * -571111147;
			i_37_ = method5846(class480);
			((Class480) class480).anInt5747 = (((Class480) class480).anInt5747 * -328303043 << 8 | i_37_ & 0xff) * -571111147;
			for (int i_38_ = 0; i_38_ < 16; i_38_++) {
				i_36_ = method5844(class480);
				if (i_36_ == 1)
					((Class480) class480).aBooleanArray5755[i_38_] = true;
				else
					((Class480) class480).aBooleanArray5755[i_38_] = false;
			}
			for (int i_39_ = 0; i_39_ < 256; i_39_++)
				((Class480) class480).aBooleanArray5754[i_39_] = false;
			for (int i_40_ = 0; i_40_ < 16; i_40_++) {
				if (((Class480) class480).aBooleanArray5755[i_40_]) {
					for (int i_41_ = 0; i_41_ < 16; i_41_++) {
						i_36_ = method5844(class480);
						if (i_36_ == 1)
							((Class480) class480).aBooleanArray5754[(i_40_ * 16 + i_41_)] = true;
					}
				}
			}
			method5849(class480);
			int i_42_ = ((Class480) class480).anInt5729 * 1868789477 + 2;
			int i_43_ = method5848(3, class480);
			int i_44_ = method5848(15, class480);
			for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
				int i_46_ = 0;
				for (;;) {
					i_36_ = method5844(class480);
					if (i_36_ == 0)
						break;
					i_46_++;
				}
				((Class480) class480).aByteArray5760[i_45_] = (byte) i_46_;
			}
			byte[] is_47_ = new byte[6];
			for (byte i_48_ = 0; i_48_ < i_43_; i_48_++)
				is_47_[i_48_] = i_48_;
			for (int i_49_ = 0; i_49_ < i_44_; i_49_++) {
				byte i_50_ = ((Class480) class480).aByteArray5760[i_49_];
				byte i_51_ = is_47_[i_50_];
				for (/**/; i_50_ > 0; i_50_--)
					is_47_[i_50_] = is_47_[i_50_ - 1];
				is_47_[0] = i_51_;
				((Class480) class480).aByteArray5765[i_49_] = i_51_;
			}
			for (int i_52_ = 0; i_52_ < i_43_; i_52_++) {
				int i_53_ = method5848(5, class480);
				for (int i_54_ = 0; i_54_ < i_42_; i_54_++) {
					for (;;) {
						i_36_ = method5844(class480);
						if (i_36_ == 0)
							break;
						i_36_ = method5844(class480);
						if (i_36_ == 0)
							i_53_++;
						else
							i_53_--;
					}
					((Class480) class480).aByteArrayArray5761[i_52_][i_54_] = (byte) i_53_;
				}
			}
			for (int i_55_ = 0; i_55_ < i_43_; i_55_++) {
				int i_56_ = 32;
				byte i_57_ = 0;
				for (int i_58_ = 0; i_58_ < i_42_; i_58_++) {
					if (((Class480) class480).aByteArrayArray5761[i_55_][i_58_] > i_57_)
						i_57_ = (((Class480) class480).aByteArrayArray5761[i_55_][i_58_]);
					if (((Class480) class480).aByteArrayArray5761[i_55_][i_58_] < i_56_)
						i_56_ = (((Class480) class480).aByteArrayArray5761[i_55_][i_58_]);
				}
				method5850(((Class480) class480).anIntArrayArray5762[i_55_], ((Class480) class480).anIntArrayArray5763[i_55_], ((Class480) class480).anIntArrayArray5764[i_55_], ((Class480) class480).aByteArrayArray5761[i_55_], i_56_, i_57_, i_42_);
				((Class480) class480).anIntArray5751[i_55_] = i_56_;
			}
			int i_59_ = ((Class480) class480).anInt5729 * 1868789477 + 1;
			int i_60_ = -1;
			int i_61_ = 0;
			for (int i_62_ = 0; i_62_ <= 255; i_62_++)
				((Class480) class480).anIntArray5750[i_62_] = 0;
			int i_63_ = 4095;
			for (int i_64_ = 15; i_64_ >= 0; i_64_--) {
				for (int i_65_ = 15; i_65_ >= 0; i_65_--) {
					((Class480) class480).aByteArray5734[i_63_] = (byte) (i_64_ * 16 + i_65_);
					i_63_--;
				}
				((Class480) class480).anIntArray5758[i_64_] = i_63_ + 1;
			}
			int i_66_ = 0;
			if (i_61_ == 0) {
				i_60_++;
				i_61_ = 50;
				byte i_67_ = ((Class480) class480).aByteArray5765[i_60_];
				i = ((Class480) class480).anIntArray5751[i_67_];
				is = ((Class480) class480).anIntArrayArray5762[i_67_];
				is_34_ = ((Class480) class480).anIntArrayArray5764[i_67_];
				is_33_ = ((Class480) class480).anIntArrayArray5763[i_67_];
			}
			i_61_--;
			int i_68_ = i;
			int i_69_;
			int i_70_;
			for (i_70_ = method5848(i_68_, class480); i_70_ > is[i_68_]; i_70_ = i_70_ << 1 | i_69_) {
				i_68_++;
				i_69_ = method5844(class480);
			}
			int i_71_ = is_34_[i_70_ - is_33_[i_68_]];
			while (i_71_ != i_59_) {
				if (i_71_ == 0 || i_71_ == 1) {
					int i_72_ = -1;
					int i_73_ = 1;
					do {
						if (i_71_ == 0)
							i_72_ += 1 * i_73_;
						else if (i_71_ == 1)
							i_72_ += 2 * i_73_;
						i_73_ *= 2;
						if (i_61_ == 0) {
							i_60_++;
							i_61_ = 50;
							byte i_74_ = ((Class480) class480).aByteArray5765[i_60_];
							i = ((Class480) class480).anIntArray5751[i_74_];
							is = (((Class480) class480).anIntArrayArray5762[i_74_]);
							is_34_ = (((Class480) class480).anIntArrayArray5764[i_74_]);
							is_33_ = (((Class480) class480).anIntArrayArray5763[i_74_]);
						}
						i_61_--;
						i_68_ = i;
						for (i_70_ = method5848(i_68_, class480); i_70_ > is[i_68_]; i_70_ = i_70_ << 1 | i_69_) {
							i_68_++;
							i_69_ = method5844(class480);
						}
						i_71_ = is_34_[i_70_ - is_33_[i_68_]];
					} while (i_71_ == 0 || i_71_ == 1);
					i_72_++;
					i_37_ = (((Class480) class480).aByteArray5756[((((Class480) class480).aByteArray5734[((Class480) class480).anIntArray5758[0]]) & 0xff)]);
					((Class480) class480).anIntArray5750[i_37_ & 0xff] += i_72_;
					for (/**/; i_72_ > 0; i_72_--) {
						Class99.anIntArray917[i_66_] = i_37_ & 0xff;
						i_66_++;
					}
				} else {
					int i_75_ = i_71_ - 1;
					if (i_75_ < 16) {
						int i_76_ = ((Class480) class480).anIntArray5758[0];
						i_36_ = (((Class480) class480).aByteArray5734[i_76_ + i_75_]);
						for (/**/; i_75_ > 3; i_75_ -= 4) {
							int i_77_ = i_76_ + i_75_;
							((Class480) class480).aByteArray5734[i_77_] = (((Class480) class480).aByteArray5734[i_77_ - 1]);
							((Class480) class480).aByteArray5734[i_77_ - 1] = (((Class480) class480).aByteArray5734[i_77_ - 2]);
							((Class480) class480).aByteArray5734[i_77_ - 2] = (((Class480) class480).aByteArray5734[i_77_ - 3]);
							((Class480) class480).aByteArray5734[i_77_ - 3] = (((Class480) class480).aByteArray5734[i_77_ - 4]);
						}
						for (/**/; i_75_ > 0; i_75_--)
							((Class480) class480).aByteArray5734[i_76_ + i_75_] = (((Class480) class480).aByteArray5734[i_76_ + i_75_ - 1]);
						((Class480) class480).aByteArray5734[i_76_] = i_36_;
					} else {
						int i_78_ = i_75_ / 16;
						int i_79_ = i_75_ % 16;
						int i_80_ = (((Class480) class480).anIntArray5758[i_78_] + i_79_);
						i_36_ = ((Class480) class480).aByteArray5734[i_80_];
						for (/**/; (i_80_ > ((Class480) class480).anIntArray5758[i_78_]); i_80_--)
							((Class480) class480).aByteArray5734[i_80_] = (((Class480) class480).aByteArray5734[i_80_ - 1]);
						((Class480) class480).anIntArray5758[i_78_]++;
						for (/**/; i_78_ > 0; i_78_--) {
							((Class480) class480).anIntArray5758[i_78_]--;
							((Class480) class480).aByteArray5734[((Class480) class480).anIntArray5758[i_78_]] = (((Class480) class480).aByteArray5734[(((Class480) class480).anIntArray5758[i_78_ - 1]) + 16 - 1]);
						}
						((Class480) class480).anIntArray5758[0]--;
						((Class480) class480).aByteArray5734[((Class480) class480).anIntArray5758[0]] = i_36_;
						if (((Class480) class480).anIntArray5758[0] == 0) {
							i_63_ = 4095;
							for (int i_81_ = 15; i_81_ >= 0; i_81_--) {
								for (int i_82_ = 15; i_82_ >= 0; i_82_--) {
									((Class480) class480).aByteArray5734[i_63_] = (((Class480) class480).aByteArray5734[(((Class480) class480).anIntArray5758[i_81_]) + i_82_]);
									i_63_--;
								}
								((Class480) class480).anIntArray5758[i_81_] = i_63_ + 1;
							}
						}
					}
					((Class480) class480).anIntArray5750[(((Class480) class480).aByteArray5756[i_36_ & 0xff] & 0xff)]++;
					Class99.anIntArray917[i_66_] = (((Class480) class480).aByteArray5756[i_36_ & 0xff] & 0xff);
					i_66_++;
					if (i_61_ == 0) {
						i_60_++;
						i_61_ = 50;
						byte i_83_ = ((Class480) class480).aByteArray5765[i_60_];
						i = ((Class480) class480).anIntArray5751[i_83_];
						is = ((Class480) class480).anIntArrayArray5762[i_83_];
						is_34_ = ((Class480) class480).anIntArrayArray5764[i_83_];
						is_33_ = ((Class480) class480).anIntArrayArray5763[i_83_];
					}
					i_61_--;
					i_68_ = i;
					for (i_70_ = method5848(i_68_, class480); i_70_ > is[i_68_]; i_70_ = i_70_ << 1 | i_69_) {
						i_68_++;
						i_69_ = method5844(class480);
					}
					i_71_ = is_34_[i_70_ - is_33_[i_68_]];
				}
			}
			((Class480) class480).anInt5743 = 0;
			((Class480) class480).aByte5742 = (byte) 0;
			((Class480) class480).anIntArray5753[0] = 0;
			for (int i_84_ = 1; i_84_ <= 256; i_84_++)
				((Class480) class480).anIntArray5753[i_84_] = ((Class480) class480).anIntArray5750[i_84_ - 1];
			for (int i_85_ = 1; i_85_ <= 256; i_85_++)
				((Class480) class480).anIntArray5753[i_85_] += ((Class480) class480).anIntArray5753[i_85_ - 1];
			for (int i_86_ = 0; i_86_ < i_66_; i_86_++) {
				i_37_ = (byte) (Class99.anIntArray917[i_86_] & 0xff);
				Class99.anIntArray917[(((Class480) class480).anIntArray5753[i_37_ & 0xff])] |= i_86_ << 8;
				((Class480) class480).anIntArray5753[i_37_ & 0xff]++;
			}
			((Class480) class480).anInt5748 = ((Class99.anIntArray917[((Class480) class480).anInt5747 * -328303043]) >> 8) * -188745219;
			((Class480) class480).anInt5736 = 0;
			((Class480) class480).anInt5748 = Class99.anIntArray917[(((Class480) class480).anInt5748 * 1497279317)] * -188745219;
			((Class480) class480).anInt5730 = ((byte) (((Class480) class480).anInt5748 * 1497279317 & 0xff) * -711489411);
			Class480 class480_87_;
			((Class480) (class480_87_ = class480)).anInt5748 = ((((Class480) class480_87_).anInt5748 * 1497279317 >> 8) * -188745219);
			((Class480) class480).anInt5736 += 537928293;
			((Class480) class480).anInt5766 = i_66_ * 377096659;
			method5845(class480);
			if ((((Class480) class480).anInt5736 * 1578680173 == ((Class480) class480).anInt5766 * -440125861 + 1) && ((Class480) class480).anInt5743 * -269622201 == 0)
				bool_35_ = true;
			else
				bool_35_ = false;
		}
	}

	static int method5848(int i, Class480 class480) {
		for (;;) {
			if (((Class480) class480).anInt5745 * 34949899 >= i) {
				int i_88_ = ((((Class480) class480).anInt5732 * -1584714501 >> ((Class480) class480).anInt5745 * 34949899 - i) & (1 << i) - 1);
				((Class480) class480).anInt5745 -= i * -388585309;
				return i_88_;
			}
			((Class480) class480).anInt5732 = ((((Class480) class480).anInt5732 * -1584714501 << 8 | (((Class480) class480).aByteArray5735[((Class480) class480).anInt5749 * 648834951]) & 0xff) * -455082445);
			((Class480) class480).anInt5745 += 1186284824;
			((Class480) class480).anInt5749 += 1642735159;
			((Class480) class480).anInt5737 += 465101089;
			if (((Class480) class480).anInt5737 * -597433631 == 0) {
				/* empty */
			}
		}
	}

	static void method5849(Class480 class480) {
		((Class480) class480).anInt5729 = 0;
		for (int i = 0; i < 256; i++) {
			if (((Class480) class480).aBooleanArray5754[i]) {
				((Class480) class480).aByteArray5756[((Class480) class480).anInt5729 * 1868789477] = (byte) i;
				((Class480) class480).anInt5729 += 561141485;
			}
		}
	}

	static void method5850(int[] is, int[] is_89_, int[] is_90_, byte[] is_91_, int i, int i_92_, int i_93_) {
		int i_94_ = 0;
		for (int i_95_ = i; i_95_ <= i_92_; i_95_++) {
			for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
				if (is_91_[i_96_] == i_95_) {
					is_90_[i_94_] = i_96_;
					i_94_++;
				}
			}
		}
		for (int i_97_ = 0; i_97_ < 23; i_97_++)
			is_89_[i_97_] = 0;
		for (int i_98_ = 0; i_98_ < i_93_; i_98_++)
			is_89_[is_91_[i_98_] + 1]++;
		for (int i_99_ = 1; i_99_ < 23; i_99_++)
			is_89_[i_99_] += is_89_[i_99_ - 1];
		for (int i_100_ = 0; i_100_ < 23; i_100_++)
			is[i_100_] = 0;
		int i_101_ = 0;
		for (int i_102_ = i; i_102_ <= i_92_; i_102_++) {
			i_101_ += is_89_[i_102_ + 1] - is_89_[i_102_];
			is[i_102_] = i_101_ - 1;
			i_101_ <<= 1;
		}
		for (int i_103_ = i + 1; i_103_ <= i_92_; i_103_++)
			is_89_[i_103_] = (is[i_103_ - 1] + 1 << 1) - is_89_[i_103_];
	}

	Class466() throws Throwable {
		throw new Error();
	}
}
