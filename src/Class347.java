/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class347 {
	static int anInt3425 = -2000;
	static int anInt3426 = 8;
	static int anInt3427 = 39424;
	static int anInt3428 = 1;
	static int anInt3429 = 2;
	static int anInt3430 = 12;
	int anInt3431;
	int anInt3432 = 0;
	static int anInt3433 = 2000;
	Class358 aClass358_3434;

	final boolean method4017(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i > 2000 || i_0_ > 2000 || i_1_ > 2000 || i_2_ > 2000 || i_3_ > 2000 || i_4_ > 2000)
			return false;
		if (i < -2000 || i_0_ < -2000 || i_1_ < -2000 || i_2_ < -2000 || i_3_ < -2000 || i_4_ < -2000)
			return false;
		if (((Class347) this).anInt3431 == 2) {
			int i_8_ = i_2_ + i * (((Class358) ((Class347) this).aClass358_3434).anInt3733);
			if (i_8_ >= 0 && i_8_ < (((Class358) ((Class347) this).aClass358_3434).anIntArray3717).length && ((i_5_ << 8) - 39424 < (((Class358) ((Class347) this).aClass358_3434).anIntArray3717[i_8_])))
				return false;
			i_8_ = i_3_ + i_0_ * (((Class358) ((Class347) this).aClass358_3434).anInt3733);
			if (i_8_ >= 0 && i_8_ < (((Class358) ((Class347) this).aClass358_3434).anIntArray3717).length && ((i_6_ << 8) - 39424 < (((Class358) ((Class347) this).aClass358_3434).anIntArray3717[i_8_])))
				return false;
			i_8_ = i_4_ + i_1_ * (((Class358) ((Class347) this).aClass358_3434).anInt3733);
			if (i_8_ >= 0 && i_8_ < (((Class358) ((Class347) this).aClass358_3434).anIntArray3717).length && ((i_7_ << 8) - 39424 < (((Class358) ((Class347) this).aClass358_3434).anIntArray3717[i_8_])))
				return false;
		}
		int i_9_ = i_3_ - i_2_;
		int i_10_ = i_0_ - i;
		int i_11_ = i_4_ - i_2_;
		int i_12_ = i_1_ - i;
		int i_13_ = i_6_ - i_5_;
		int i_14_ = i_7_ - i_5_;
		if (i < i_0_ && i < i_1_) {
			i--;
			if (i_0_ > i_1_)
				i_0_++;
			else
				i_1_++;
		} else if (i_0_ < i_1_) {
			i_0_--;
			if (i > i_1_)
				i++;
			else
				i_1_++;
		} else {
			i_1_--;
			if (i > i_0_)
				i++;
			else
				i_0_++;
		}
		int i_15_ = 0;
		if (i_0_ != i)
			i_15_ = (i_3_ - i_2_ << 12) / (i_0_ - i);
		int i_16_ = 0;
		if (i_1_ != i_0_)
			i_16_ = (i_4_ - i_3_ << 12) / (i_1_ - i_0_);
		int i_17_ = 0;
		if (i_1_ != i)
			i_17_ = (i_2_ - i_4_ << 12) / (i - i_1_);
		int i_18_ = i_9_ * i_12_ - i_11_ * i_10_;
		if (i_18_ == 0)
			return false;
		int i_19_ = (i_13_ * i_12_ - i_14_ * i_10_ << 8) / i_18_;
		int i_20_ = (i_14_ * i_9_ - i_13_ * i_11_ << 8) / i_18_;
		if (i <= i_0_ && i <= i_1_) {
			if (i >= ((Class358) ((Class347) this).aClass358_3434).anInt3725)
				return true;
			if (i_0_ > ((Class358) ((Class347) this).aClass358_3434).anInt3725)
				i_0_ = ((Class358) ((Class347) this).aClass358_3434).anInt3725;
			if (i_1_ > ((Class358) ((Class347) this).aClass358_3434).anInt3725)
				i_1_ = ((Class358) ((Class347) this).aClass358_3434).anInt3725;
			i_5_ = (i_5_ << 8) - i_19_ * i_2_ + i_19_;
			if (i_0_ < i_1_) {
				i_4_ = i_2_ <<= 12;
				if (i < 0) {
					i_4_ -= i_17_ * i;
					i_2_ -= i_15_ * i;
					i_5_ -= i_20_ * i;
					i = 0;
				}
				i_3_ <<= 12;
				if (i_0_ < 0) {
					i_3_ -= i_16_ * i_0_;
					i_0_ = 0;
				}
				if (i != i_0_ && i_17_ < i_15_ || i == i_0_ && i_17_ > i_16_) {
					i_1_ -= i_0_;
					i_0_ -= i;
					i *= (((Class358) ((Class347) this).aClass358_3434).anInt3733);
					while (--i_0_ >= 0) {
						if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
							return false;
						i_4_ += i_17_;
						i_2_ += i_15_;
						i_5_ += i_20_;
						i += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
					}
					while (--i_1_ >= 0) {
						if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
							return false;
						i_4_ += i_17_;
						i_3_ += i_16_;
						i_5_ += i_20_;
						i += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
					}
					return true;
				}
				i_1_ -= i_0_;
				i_0_ -= i;
				i *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
				while (--i_0_ >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_4_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				while (--i_1_ >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_4_ += i_17_;
					i_3_ += i_16_;
					i_5_ += i_20_;
					i += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				return true;
			}
			i_3_ = i_2_ <<= 12;
			if (i < 0) {
				i_3_ -= i_17_ * i;
				i_2_ -= i_15_ * i;
				i_5_ -= i_20_ * i;
				i = 0;
			}
			i_4_ <<= 12;
			if (i_1_ < 0) {
				i_4_ -= i_16_ * i_1_;
				i_1_ = 0;
			}
			if (i != i_1_ && i_17_ < i_15_ || i == i_1_ && i_16_ > i_15_) {
				i_0_ -= i_1_;
				i_1_ -= i;
				i *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
				while (--i_1_ >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_3_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				while (--i_0_ >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_4_ += i_16_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				return true;
			}
			i_0_ -= i_1_;
			i_1_ -= i;
			i *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			while (--i_1_ >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_3_ += i_17_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			while (--i_0_ >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_4_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			return true;
		}
		if (i_0_ <= i_1_) {
			if (i_0_ >= ((Class358) ((Class347) this).aClass358_3434).anInt3725)
				return true;
			if (i_1_ > ((Class358) ((Class347) this).aClass358_3434).anInt3725)
				i_1_ = ((Class358) ((Class347) this).aClass358_3434).anInt3725;
			if (i > ((Class358) ((Class347) this).aClass358_3434).anInt3725)
				i = ((Class358) ((Class347) this).aClass358_3434).anInt3725;
			i_6_ = (i_6_ << 8) - i_19_ * i_3_ + i_19_;
			if (i_1_ < i) {
				i_2_ = i_3_ <<= 12;
				if (i_0_ < 0) {
					i_2_ -= i_15_ * i_0_;
					i_3_ -= i_16_ * i_0_;
					i_6_ -= i_20_ * i_0_;
					i_0_ = 0;
				}
				i_4_ <<= 12;
				if (i_1_ < 0) {
					i_4_ -= i_17_ * i_1_;
					i_1_ = 0;
				}
				if (i_0_ != i_1_ && i_15_ < i_16_ || i_0_ == i_1_ && i_15_ > i_17_) {
					i -= i_1_;
					i_1_ -= i_0_;
					i_0_ *= (((Class358) ((Class347) this).aClass358_3434).anInt3733);
					while (--i_1_ >= 0) {
						if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
							return false;
						i_2_ += i_15_;
						i_3_ += i_16_;
						i_6_ += i_20_;
						i_0_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
					}
					while (--i >= 0) {
						if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
							return false;
						i_2_ += i_15_;
						i_4_ += i_17_;
						i_6_ += i_20_;
						i_0_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
					}
					return true;
				}
				i -= i_1_;
				i_1_ -= i_0_;
				i_0_ *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
				while (--i_1_ >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_2_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				while (--i >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_2_ += i_15_;
					i_4_ += i_17_;
					i_6_ += i_20_;
					i_0_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				return true;
			}
			i_4_ = i_3_ <<= 12;
			if (i_0_ < 0) {
				i_4_ -= i_15_ * i_0_;
				i_3_ -= i_16_ * i_0_;
				i_6_ -= i_20_ * i_0_;
				i_0_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_17_ * i;
				i = 0;
			}
			if (i_15_ < i_16_) {
				i_1_ -= i;
				i -= i_0_;
				i_0_ *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
				while (--i >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_4_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				while (--i_1_ >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_2_ += i_17_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				return true;
			}
			i_1_ -= i;
			i -= i_0_;
			i_0_ *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			while (--i >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_4_ += i_15_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			while (--i_1_ >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_2_ += i_17_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			return true;
		}
		if (i_1_ >= ((Class358) ((Class347) this).aClass358_3434).anInt3725)
			return true;
		if (i > ((Class358) ((Class347) this).aClass358_3434).anInt3725)
			i = ((Class358) ((Class347) this).aClass358_3434).anInt3725;
		if (i_0_ > ((Class358) ((Class347) this).aClass358_3434).anInt3725)
			i_0_ = ((Class358) ((Class347) this).aClass358_3434).anInt3725;
		i_7_ = (i_7_ << 8) - i_19_ * i_4_ + i_19_;
		if (i < i_0_) {
			i_3_ = i_4_ <<= 12;
			if (i_1_ < 0) {
				i_3_ -= i_16_ * i_1_;
				i_4_ -= i_17_ * i_1_;
				i_7_ -= i_20_ * i_1_;
				i_1_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_15_ * i;
				i = 0;
			}
			if (i_16_ < i_17_) {
				i_0_ -= i;
				i -= i_1_;
				i_1_ *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
				while (--i >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_3_ += i_16_;
					i_4_ += i_17_;
					i_7_ += i_20_;
					i_1_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				while (--i_0_ >= 0) {
					if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, ((Class358) (((Class347) this).aClass358_3434)).anInt3733))
						return false;
					i_3_ += i_16_;
					i_2_ += i_15_;
					i_7_ += i_20_;
					i_1_ += (((Class358) ((Class347) this).aClass358_3434).anInt3733);
				}
				return true;
			}
			i_0_ -= i;
			i -= i_1_;
			i_1_ *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			while (--i >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_3_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			while (--i_0_ >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_3_ += i_16_;
				i_2_ += i_15_;
				i_7_ += i_20_;
				i_1_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			return true;
		}
		i_2_ = i_4_ <<= 12;
		if (i_1_ < 0) {
			i_2_ -= i_16_ * i_1_;
			i_4_ -= i_17_ * i_1_;
			i_7_ -= i_20_ * i_1_;
			i_1_ = 0;
		}
		i_3_ <<= 12;
		if (i_0_ < 0) {
			i_3_ -= i_15_ * i_0_;
			i_0_ = 0;
		}
		if (i_16_ < i_17_) {
			i -= i_0_;
			i_0_ -= i_1_;
			i_1_ *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			while (--i_0_ >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_2_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			while (--i >= 0) {
				if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
					return false;
				i_3_ += i_15_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
			}
			return true;
		}
		i -= i_0_;
		i_0_ -= i_1_;
		i_1_ *= ((Class358) ((Class347) this).aClass358_3434).anInt3733;
		while (--i_0_ >= 0) {
			if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
				return false;
			i_2_ += i_16_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
		}
		while (--i >= 0) {
			if (!method4018((((Class358) ((Class347) this).aClass358_3434).anIntArray3717), i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, (((Class358) ((Class347) this).aClass358_3434).anInt3733)))
				return false;
			i_3_ += i_15_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += ((Class358) ((Class347) this).aClass358_3434).anInt3733;
		}
		return true;
	}

	Class347(Class358 class358) {
		((Class347) this).aClass358_3434 = class358;
	}

	final boolean method4018(int[] is, int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		if (i_23_ > i_26_)
			i_23_ = i_26_;
		if (i_22_ < 0)
			i_22_ = 0;
		if (i_22_ >= i_23_)
			return true;
		i += i_22_ - 1;
		i_21_ = i_23_ - i_22_ >> 2;
		i_24_ += i_25_ * i_22_;
		if (((Class347) this).anInt3431 == 1) {
			((Class347) this).anInt3432 += i_21_;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
			}
			i_21_ = i_23_ - i_22_ & 0x3;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
			}
		} else {
			i_24_ -= 39424;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
			}
			i_21_ = i_23_ - i_22_ & 0x3;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
			}
		}
		return true;
	}
}
