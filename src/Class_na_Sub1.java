/* Class_na_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_na_Sub1 extends Class_na {
	static int anInt10155 = 16;
	int anInt10156;
	int anInt10157;
	int anInt10158;
	int anInt10159;
	byte[] aByteArray10160;

	void method3524(int i, int i_0_, int i_1_, int i_2_) {
		((Class_na_Sub1) this).anInt10158 = i;
		((Class_na_Sub1) this).anInt10156 = i_0_;
		((Class_na_Sub1) this).anInt10157 = i_1_ - i;
		((Class_na_Sub1) this).anInt10159 = i_2_ - i_0_;
	}

	void method3525() {
		int i = -1;
		int i_3_ = ((Class_na_Sub1) this).aByteArray10160.length - 8;
		while (i < i_3_) {
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
		}
		while (i < ((Class_na_Sub1) this).aByteArray10160.length - 1)
			((Class_na_Sub1) this).aByteArray10160[++i] = (byte) 0;
	}

	Class_na_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_4_) {
		((Class_na_Sub1) this).aByteArray10160 = new byte[i * i_4_];
	}

	static final void method3526(byte[] is, int i, int i_5_, int i_6_, int i_7_) {
		if (i_6_ < i_7_) {
			i += i_6_;
			i_5_ = i_7_ - i_6_ >> 2;
			while (--i_5_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_5_ = i_7_ - i_6_ & 0x3;
			while (--i_5_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method3527(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = 0;
		if (i_8_ != i)
			i_13_ = (i_11_ - i_10_ << 16) / (i_8_ - i);
		int i_14_ = 0;
		if (i_9_ != i_8_)
			i_14_ = (i_12_ - i_11_ << 16) / (i_9_ - i_8_);
		int i_15_ = 0;
		if (i_9_ != i)
			i_15_ = (i_10_ - i_12_ << 16) / (i - i_9_);
		if (i <= i_8_ && i <= i_9_) {
			if (i_8_ < i_9_) {
				i_12_ = i_10_ <<= 16;
				if (i < 0) {
					i_12_ -= i_15_ * i;
					i_10_ -= i_13_ * i;
					i = 0;
				}
				i_11_ <<= 16;
				if (i_8_ < 0) {
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				if (i != i_8_ && i_15_ < i_13_ || i == i_8_ && i_15_ > i_14_) {
					i_9_ -= i_8_;
					i_8_ -= i;
					i *= ((Class_na_Sub1) this).anInt10157;
					while (--i_8_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
				} else {
					i_9_ -= i_8_;
					i_8_ -= i;
					i *= ((Class_na_Sub1) this).anInt10157;
					while (--i_8_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
				}
			} else {
				i_11_ = i_10_ <<= 16;
				if (i < 0) {
					i_11_ -= i_15_ * i;
					i_10_ -= i_13_ * i;
					i = 0;
				}
				i_12_ <<= 16;
				if (i_9_ < 0) {
					i_12_ -= i_14_ * i_9_;
					i_9_ = 0;
				}
				if (i != i_9_ && i_15_ < i_13_ || i == i_9_ && i_14_ > i_13_) {
					i_8_ -= i_9_;
					i_9_ -= i;
					i *= ((Class_na_Sub1) this).anInt10157;
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_11_ >> 16, i_10_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i_8_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
				} else {
					i_8_ -= i_9_;
					i_9_ -= i;
					i *= ((Class_na_Sub1) this).anInt10157;
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_10_ >> 16, i_11_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i_8_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += ((Class_na_Sub1) this).anInt10157;
					}
				}
			}
		} else if (i_8_ <= i_9_) {
			if (i_9_ < i) {
				i_10_ = i_11_ <<= 16;
				if (i_8_ < 0) {
					i_10_ -= i_13_ * i_8_;
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				i_12_ <<= 16;
				if (i_9_ < 0) {
					i_12_ -= i_15_ * i_9_;
					i_9_ = 0;
				}
				if (i_8_ != i_9_ && i_13_ < i_14_ || i_8_ == i_9_ && i_13_ > i_15_) {
					i -= i_9_;
					i_9_ -= i_8_;
					i_8_ *= ((Class_na_Sub1) this).anInt10157;
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_10_ >> 16, i_12_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
				} else {
					i -= i_9_;
					i_9_ -= i_8_;
					i_8_ *= ((Class_na_Sub1) this).anInt10157;
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_12_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
				}
			} else {
				i_12_ = i_11_ <<= 16;
				if (i_8_ < 0) {
					i_12_ -= i_13_ * i_8_;
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				i_10_ <<= 16;
				if (i < 0) {
					i_10_ -= i_15_ * i;
					i = 0;
				}
				if (i_13_ < i_14_) {
					i_9_ -= i;
					i -= i_8_;
					i_8_ *= ((Class_na_Sub1) this).anInt10157;
					while (--i >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
				} else {
					i_9_ -= i;
					i -= i_8_;
					i_8_ *= ((Class_na_Sub1) this).anInt10157;
					while (--i >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
					while (--i_9_ >= 0) {
						method3526(((Class_na_Sub1) this).aByteArray10160, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub1) this).anInt10157;
					}
				}
			}
		} else if (i < i_8_) {
			i_11_ = i_12_ <<= 16;
			if (i_9_ < 0) {
				i_11_ -= i_14_ * i_9_;
				i_12_ -= i_15_ * i_9_;
				i_9_ = 0;
			}
			i_10_ <<= 16;
			if (i < 0) {
				i_10_ -= i_13_ * i;
				i = 0;
			}
			if (i_14_ < i_15_) {
				i_8_ -= i;
				i -= i_9_;
				i_9_ *= ((Class_na_Sub1) this).anInt10157;
				while (--i >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
				while (--i_8_ >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_11_ >> 16, i_10_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
			} else {
				i_8_ -= i;
				i -= i_9_;
				i_9_ *= ((Class_na_Sub1) this).anInt10157;
				while (--i >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
				while (--i_8_ >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_10_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
			}
		} else {
			i_10_ = i_12_ <<= 16;
			if (i_9_ < 0) {
				i_10_ -= i_14_ * i_9_;
				i_12_ -= i_15_ * i_9_;
				i_9_ = 0;
			}
			i_11_ <<= 16;
			if (i_8_ < 0) {
				i_11_ -= i_13_ * i_8_;
				i_8_ = 0;
			}
			if (i_14_ < i_15_) {
				i -= i_8_;
				i_8_ -= i_9_;
				i_9_ *= ((Class_na_Sub1) this).anInt10157;
				while (--i_8_ >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_10_ >> 16, i_12_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
				while (--i >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
			} else {
				i -= i_8_;
				i_8_ -= i_9_;
				i_9_ *= ((Class_na_Sub1) this).anInt10157;
				while (--i_8_ >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_12_ >> 16, i_10_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
				while (--i >= 0) {
					method3526(((Class_na_Sub1) this).aByteArray10160, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub1) this).anInt10157;
				}
			}
		}
	}

	boolean method3528(int i, int i_16_) {
		return ((Class_na_Sub1) this).aByteArray10160.length >= i * i_16_;
	}
}
