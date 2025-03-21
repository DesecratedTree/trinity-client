/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class143 {
	byte[] aByteArray1569;
	int[] anIntArray1570;
	int[] anIntArray1571;

	public Class143(byte[] is) {
		int i = is.length;
		((Class143) this).anIntArray1570 = new int[i];
		((Class143) this).aByteArray1569 = is;
		int[] is_0_ = new int[33];
		((Class143) this).anIntArray1571 = new int[8];
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			int i_3_ = is[i_2_];
			if (0 != i_3_) {
				int i_4_ = 1 << 32 - i_3_;
				int i_5_ = is_0_[i_3_];
				((Class143) this).anIntArray1570[i_2_] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0)
					i_6_ = is_0_[i_3_ - 1];
				else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						int i_8_ = is_0_[i_7_];
						if (i_5_ != i_8_)
							break;
						int i_9_ = 1 << 32 - i_7_;
						if (0 != (i_8_ & i_9_)) {
							is_0_[i_7_] = is_0_[i_7_ - 1];
							break;
						}
						is_0_[i_7_] = i_8_ | i_9_;
					}
				}
				is_0_[i_3_] = i_6_;
				for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
					if (is_0_[i_10_] == i_5_)
						is_0_[i_10_] = i_6_;
				}
				int i_11_ = 0;
				for (int i_12_ = 0; i_12_ < i_3_; i_12_++) {
					int i_13_ = -2147483648 >>> i_12_;
					if (0 != (i_5_ & i_13_)) {
						if (((Class143) this).anIntArray1571[i_11_] == 0)
							((Class143) this).anIntArray1571[i_11_] = i_1_;
						i_11_ = ((Class143) this).anIntArray1571[i_11_];
					} else
						i_11_++;
					if (i_11_ >= ((Class143) this).anIntArray1571.length) {
						int[] is_14_ = (new int[((Class143) this).anIntArray1571.length * 2]);
						for (int i_15_ = 0; i_15_ < ((Class143) this).anIntArray1571.length; i_15_++)
							is_14_[i_15_] = ((Class143) this).anIntArray1571[i_15_];
						((Class143) this).anIntArray1571 = is_14_;
					}
					i_13_ >>>= 1;
				}
				((Class143) this).anIntArray1571[i_11_] = i_2_ ^ 0xffffffff;
				if (i_11_ >= i_1_)
					i_1_ = 1 + i_11_;
			}
		}
	}

	int method1657(byte[] is, int i, byte[] is_16_, int i_17_, int i_18_, int i_19_) {
		try {
			if (0 == i_18_)
				return 0;
			int i_20_ = 0;
			i_18_ += i_17_;
			int i_21_ = i;
			for (;;) {
				byte i_22_ = is[i_21_];
				if (i_22_ < 0)
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				int i_23_;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x40) != 0)
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				if (0 != (i_22_ & 0x20))
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				if (0 != (i_22_ & 0x10))
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				if (0 != (i_22_ & 0x8))
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x4) != 0)
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x2) != 0)
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485)
							throw new IllegalStateException();
						break;
					}
					i_20_ = 0;
				}
				if ((i_22_ & 0x1) != 0)
					i_20_ = ((Class143) this).anIntArray1571[i_20_];
				else
					i_20_++;
				if ((i_23_ = ((Class143) this).anIntArray1571[i_20_]) < 0) {
					is_16_[i_17_++] = (byte) (i_23_ ^ 0xffffffff);
					if (i_17_ >= i_18_) {
						if (i_19_ == -1776800485) {
							/* empty */
						}
						break;
					}
					i_20_ = 0;
				}
				i_21_++;
			}
			return i_21_ + 1 - i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fu.j(").append(')').toString());
		}
	}

	int method1658(byte[] is, int i, int i_24_, byte[] is_25_, int i_26_, int i_27_) {
		try {
			int i_28_ = 0;
			int i_29_ = i_26_ << 3;
			for (i_24_ += i; i < i_24_; i++) {
				int i_30_ = is[i] & 0xff;
				int i_31_ = ((Class143) this).anIntArray1570[i_30_];
				int i_32_ = ((Class143) this).aByteArray1569[i_30_];
				if (0 == i_32_)
					throw new RuntimeException(new StringBuilder().append("").append(i_30_).toString());
				int i_33_ = i_29_ >> 3;
				int i_34_ = i_29_ & 0x7;
				i_28_ &= -i_34_ >> 31;
				int i_35_ = (i_34_ + i_32_ - 1 >> 3) + i_33_;
				i_34_ += 24;
				is_25_[i_33_] = (byte) (i_28_ |= i_31_ >>> i_34_);
				if (i_33_ >= i_35_) {
					if (i_27_ != -1731548060)
						throw new IllegalStateException();
				} else {
					i_33_++;
					i_34_ -= 8;
					is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
					if (i_33_ >= i_35_) {
						if (i_27_ != -1731548060)
							throw new IllegalStateException();
					} else {
						i_33_++;
						i_34_ -= 8;
						is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
						if (i_33_ >= i_35_) {
							if (i_27_ != -1731548060) {
								/* empty */
							}
						} else {
							i_33_++;
							i_34_ -= 8;
							is_25_[i_33_] = (byte) (i_28_ = i_31_ >>> i_34_);
							if (i_33_ >= i_35_) {
								if (i_27_ != -1731548060)
									throw new IllegalStateException();
							} else {
								i_33_++;
								i_34_ -= 8;
								is_25_[i_33_] = (byte) (i_28_ = i_31_ << -i_34_);
							}
						}
					}
				}
				i_29_ += i_32_;
			}
			return (7 + i_29_ >> 3) - i_26_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fu.r(").append(')').toString());
		}
	}

	static final byte[] method1659(byte[] is, short i) {
		try {
			Buffer class330_sub46 = new Buffer(is);
			int i_36_ = class330_sub46.readUnsignedByte(426393987);
			int i_37_ = class330_sub46.readInt((byte) 5);
			if (i_37_ < 0 || (0 != IndexTable.anInt2893 * -42015609 && i_37_ > IndexTable.anInt2893 * -42015609))
				throw new RuntimeException();
			if (i_36_ == 0) {
				byte[] is_38_ = new byte[i_37_];
				class330_sub46.readBytes(is_38_, 0, i_37_, 1274334002);
				return is_38_;
			}
			int i_39_ = class330_sub46.readInt((byte) 43);
			if (i_39_ < 0 || (-42015609 * IndexTable.anInt2893 != 0 && i_39_ > -42015609 * IndexTable.anInt2893) || i_39_ >= 2000000)
				return new byte[1];
			byte[] is_40_ = new byte[i_39_];
			if (1 == i_36_)
				Class466.method5843(is_40_, i_39_, is, i_37_, 9);
			else {
				synchronized (IndexTable.aClass557_2895) {
					IndexTable.aClass557_2895.method6453(class330_sub46, is_40_, 1115965302);
				}
			}
			return is_40_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fu.ap(").append(')').toString());
		}
	}

	static final void method1660(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class201_Sub2.method2170(iComponentDefinitions, class120, class430, 516920560);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fu.ev(").append(')').toString());
		}
	}

	static int method1661(Class401_Sub1 class401_sub1, Class401_Sub1 class401_sub1_41_, int i, boolean bool, int i_42_, boolean bool_43_, short i_44_) {
		try {
			int i_45_ = Class437.method5589(class401_sub1, class401_sub1_41_, i, bool, 733265167);
			if (i_45_ != 0) {
				if (bool)
					return -i_45_;
				return i_45_;
			}
			if (-1 == i_42_)
				return 0;
			int i_46_ = Class437.method5589(class401_sub1, class401_sub1_41_, i_42_, bool_43_, 619379285);
			if (bool_43_)
				return -i_46_;
			return i_46_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fu.l(").append(')').toString());
		}
	}

	static byte method1662(int i, int i_47_, int i_48_) {
		try {
			if (i != -344921723 * Class476.aClass476_6902.anInt6882)
				return (byte) 0;
			if (0 == (i_47_ & 0x1))
				return (byte) 1;
			return (byte) 2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fu.bs(").append(')').toString());
		}
	}

	static final String method1663(int i, int i_49_) {
		try {
			String string = Integer.toString(i);
			for (int i_50_ = string.length() - 3; i_50_ > 0; i_50_ -= 3)
				string = new StringBuilder().append(string.substring(0, i_50_)).append(Class215.aString2081).append(string.substring(i_50_)).toString();
			if (string.length() > 9)
				return new StringBuilder().append(" ").append(Class146.method1738(65408, -849826454)).append(string.substring(0, string.length() - 8)).append(Class526.aClass526_6174.method6257(Class429.aClass454_4369, 991479434)).append(" (").append(string).append(")").append(Class215.aString2079).toString();
			if (string.length() > 6)
				return new StringBuilder().append(" ").append(Class146.method1738(16777215, -849826454)).append(string.substring(0, string.length() - 4)).append(Class526.aClass526_6176.method6257(Class429.aClass454_4369, 991479434)).append(" (").append(string).append(")").append(Class215.aString2079).toString();
			return new StringBuilder().append(" ").append(Class146.method1738(16776960, -849826454)).append(string).append(Class215.aString2079).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fu.ke(").append(')').toString());
		}
	}
}
