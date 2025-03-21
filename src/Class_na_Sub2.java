/* Class_na_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_na_Sub2 extends Class_na {
	int anInt10161;
	int anInt10162;
	int anInt10163;
	static int anInt10164 = 16;
	int anInt10165;
	byte[] aByteArray10166;

	void method3529(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = 0;
		if (i_0_ != i)
			i_5_ = (i_3_ - i_2_ << 16) / (i_0_ - i);
		int i_6_ = 0;
		if (i_1_ != i_0_)
			i_6_ = (i_4_ - i_3_ << 16) / (i_1_ - i_0_);
		int i_7_ = 0;
		if (i_1_ != i)
			i_7_ = (i_2_ - i_4_ << 16) / (i - i_1_);
		if (i <= i_0_ && i <= i_1_) {
			if (i_0_ < i_1_) {
				i_4_ = i_2_ <<= 16;
				if (i < 0) {
					i_4_ -= i_7_ * i;
					i_2_ -= i_5_ * i;
					i = 0;
				}
				i_3_ <<= 16;
				if (i_0_ < 0) {
					i_3_ -= i_6_ * i_0_;
					i_0_ = 0;
				}
				if (i != i_0_ && i_7_ < i_5_ || i == i_0_ && i_7_ > i_6_) {
					i_1_ -= i_0_;
					i_0_ -= i;
					i *= ((Class_na_Sub2) this).anInt10162;
					while (--i_0_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_4_ >> 16, i_2_ >> 16);
						i_4_ += i_7_;
						i_2_ += i_5_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_4_ >> 16, i_3_ >> 16);
						i_4_ += i_7_;
						i_3_ += i_6_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
				} else {
					i_1_ -= i_0_;
					i_0_ -= i;
					i *= ((Class_na_Sub2) this).anInt10162;
					while (--i_0_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_2_ >> 16, i_4_ >> 16);
						i_4_ += i_7_;
						i_2_ += i_5_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_3_ >> 16, i_4_ >> 16);
						i_4_ += i_7_;
						i_3_ += i_6_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
				}
			} else {
				i_3_ = i_2_ <<= 16;
				if (i < 0) {
					i_3_ -= i_7_ * i;
					i_2_ -= i_5_ * i;
					i = 0;
				}
				i_4_ <<= 16;
				if (i_1_ < 0) {
					i_4_ -= i_6_ * i_1_;
					i_1_ = 0;
				}
				if (i != i_1_ && i_7_ < i_5_ || i == i_1_ && i_6_ > i_5_) {
					i_0_ -= i_1_;
					i_1_ -= i;
					i *= ((Class_na_Sub2) this).anInt10162;
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_3_ >> 16, i_2_ >> 16);
						i_3_ += i_7_;
						i_2_ += i_5_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i_0_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_4_ >> 16, i_2_ >> 16);
						i_4_ += i_6_;
						i_2_ += i_5_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
				} else {
					i_0_ -= i_1_;
					i_1_ -= i;
					i *= ((Class_na_Sub2) this).anInt10162;
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_2_ >> 16, i_3_ >> 16);
						i_3_ += i_7_;
						i_2_ += i_5_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i_0_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i, 0, i_2_ >> 16, i_4_ >> 16);
						i_4_ += i_6_;
						i_2_ += i_5_;
						i += ((Class_na_Sub2) this).anInt10162;
					}
				}
			}
		} else if (i_0_ <= i_1_) {
			if (i_1_ < i) {
				i_2_ = i_3_ <<= 16;
				if (i_0_ < 0) {
					i_2_ -= i_5_ * i_0_;
					i_3_ -= i_6_ * i_0_;
					i_0_ = 0;
				}
				i_4_ <<= 16;
				if (i_1_ < 0) {
					i_4_ -= i_7_ * i_1_;
					i_1_ = 0;
				}
				if (i_0_ != i_1_ && i_5_ < i_6_ || i_0_ == i_1_ && i_5_ > i_7_) {
					i -= i_1_;
					i_1_ -= i_0_;
					i_0_ *= ((Class_na_Sub2) this).anInt10162;
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_2_ >> 16, i_3_ >> 16);
						i_2_ += i_5_;
						i_3_ += i_6_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_2_ >> 16, i_4_ >> 16);
						i_2_ += i_5_;
						i_4_ += i_7_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
				} else {
					i -= i_1_;
					i_1_ -= i_0_;
					i_0_ *= ((Class_na_Sub2) this).anInt10162;
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_3_ >> 16, i_2_ >> 16);
						i_2_ += i_5_;
						i_3_ += i_6_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_4_ >> 16, i_2_ >> 16);
						i_2_ += i_5_;
						i_4_ += i_7_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
				}
			} else {
				i_4_ = i_3_ <<= 16;
				if (i_0_ < 0) {
					i_4_ -= i_5_ * i_0_;
					i_3_ -= i_6_ * i_0_;
					i_0_ = 0;
				}
				i_2_ <<= 16;
				if (i < 0) {
					i_2_ -= i_7_ * i;
					i = 0;
				}
				if (i_5_ < i_6_) {
					i_1_ -= i;
					i -= i_0_;
					i_0_ *= ((Class_na_Sub2) this).anInt10162;
					while (--i >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_4_ >> 16, i_3_ >> 16);
						i_4_ += i_5_;
						i_3_ += i_6_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_2_ >> 16, i_3_ >> 16);
						i_2_ += i_7_;
						i_3_ += i_6_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
				} else {
					i_1_ -= i;
					i -= i_0_;
					i_0_ *= ((Class_na_Sub2) this).anInt10162;
					while (--i >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_3_ >> 16, i_4_ >> 16);
						i_4_ += i_5_;
						i_3_ += i_6_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
					while (--i_1_ >= 0) {
						method3533(((Class_na_Sub2) this).aByteArray10166, i_0_, 0, i_3_ >> 16, i_2_ >> 16);
						i_2_ += i_7_;
						i_3_ += i_6_;
						i_0_ += ((Class_na_Sub2) this).anInt10162;
					}
				}
			}
		} else if (i < i_0_) {
			i_3_ = i_4_ <<= 16;
			if (i_1_ < 0) {
				i_3_ -= i_6_ * i_1_;
				i_4_ -= i_7_ * i_1_;
				i_1_ = 0;
			}
			i_2_ <<= 16;
			if (i < 0) {
				i_2_ -= i_5_ * i;
				i = 0;
			}
			if (i_6_ < i_7_) {
				i_0_ -= i;
				i -= i_1_;
				i_1_ *= ((Class_na_Sub2) this).anInt10162;
				while (--i >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_3_ >> 16, i_4_ >> 16);
					i_3_ += i_6_;
					i_4_ += i_7_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
				while (--i_0_ >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_3_ >> 16, i_2_ >> 16);
					i_3_ += i_6_;
					i_2_ += i_5_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
			} else {
				i_0_ -= i;
				i -= i_1_;
				i_1_ *= ((Class_na_Sub2) this).anInt10162;
				while (--i >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_4_ >> 16, i_3_ >> 16);
					i_3_ += i_6_;
					i_4_ += i_7_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
				while (--i_0_ >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_2_ >> 16, i_3_ >> 16);
					i_3_ += i_6_;
					i_2_ += i_5_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
			}
		} else {
			i_2_ = i_4_ <<= 16;
			if (i_1_ < 0) {
				i_2_ -= i_6_ * i_1_;
				i_4_ -= i_7_ * i_1_;
				i_1_ = 0;
			}
			i_3_ <<= 16;
			if (i_0_ < 0) {
				i_3_ -= i_5_ * i_0_;
				i_0_ = 0;
			}
			if (i_6_ < i_7_) {
				i -= i_0_;
				i_0_ -= i_1_;
				i_1_ *= ((Class_na_Sub2) this).anInt10162;
				while (--i_0_ >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_2_ >> 16, i_4_ >> 16);
					i_2_ += i_6_;
					i_4_ += i_7_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
				while (--i >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_3_ >> 16, i_4_ >> 16);
					i_3_ += i_5_;
					i_4_ += i_7_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
			} else {
				i -= i_0_;
				i_0_ -= i_1_;
				i_1_ *= ((Class_na_Sub2) this).anInt10162;
				while (--i_0_ >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_4_ >> 16, i_2_ >> 16);
					i_2_ += i_6_;
					i_4_ += i_7_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
				while (--i >= 0) {
					method3533(((Class_na_Sub2) this).aByteArray10166, i_1_, 0, i_4_ >> 16, i_3_ >> 16);
					i_3_ += i_5_;
					i_4_ += i_7_;
					i_1_ += ((Class_na_Sub2) this).anInt10162;
				}
			}
		}
	}

	void method3530(int i, int i_8_, int i_9_, int i_10_) {
		((Class_na_Sub2) this).anInt10165 = i;
		((Class_na_Sub2) this).anInt10161 = i_8_;
		((Class_na_Sub2) this).anInt10162 = i_9_ - i;
		((Class_na_Sub2) this).anInt10163 = i_10_ - i_8_;
	}

	boolean method3531(int i, int i_11_) {
		return ((Class_na_Sub2) this).aByteArray10166.length >= i * i_11_;
	}

	void method3532() {
		int i = -1;
		int i_12_ = ((Class_na_Sub2) this).aByteArray10166.length - 8;
		while (i < i_12_) {
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
		}
		while (i < ((Class_na_Sub2) this).aByteArray10166.length - 1)
			((Class_na_Sub2) this).aByteArray10166[++i] = (byte) 0;
	}

	static final void method3533(byte[] is, int i, int i_13_, int i_14_, int i_15_) {
		if (i_14_ < i_15_) {
			i += i_14_;
			i_13_ = i_15_ - i_14_ >> 2;
			while (--i_13_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_13_ = i_15_ - i_14_ & 0x3;
			while (--i_13_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	Class_na_Sub2(Class_ra_Sub1 class_ra_sub1, int i, int i_16_) {
		((Class_na_Sub2) this).aByteArray10166 = new byte[i * i_16_];
	}
}
