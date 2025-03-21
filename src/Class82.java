/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82 {
	static int anInt676;
	static int anInt677;
	static int anInt678;
	static int[] anIntArray679;
	static int anInt680;
	static int anInt681;
	static int anInt682;
	static int anInt683;

	public static void method956(Class_ra class_ra, int[] is, int i) {
		method963(class_ra, is, 0, is.length, i, null, null);
	}

	public static void method957(Class_ra class_ra, int[] is, int i, int[] is_0_, int[] is_1_) {
		method963(class_ra, is, 0, is.length, i, is_0_, is_1_);
	}

	static void method958(int i, int i_2_) {
		if (i_2_ > i + 4) {
			int i_3_ = i;
			int i_4_ = anIntArray679[i_3_];
			int i_5_ = anIntArray679[i_3_ + 1];
			int i_6_ = anIntArray679[i_3_ + 2];
			int i_7_ = anIntArray679[i_3_ + 3];
			for (int i_8_ = i + 4; i_8_ < i_2_; i_8_ += 4) {
				int i_9_ = anIntArray679[i_8_ + 1];
				if (i_9_ < i_5_) {
					anIntArray679[i_3_] = anIntArray679[i_8_];
					anIntArray679[i_3_ + 1] = i_9_;
					anIntArray679[i_3_ + 2] = anIntArray679[i_8_ + 2];
					anIntArray679[i_3_ + 3] = anIntArray679[i_8_ + 3];
					i_3_ += 4;
					anIntArray679[i_8_] = anIntArray679[i_3_];
					anIntArray679[i_8_ + 1] = anIntArray679[i_3_ + 1];
					anIntArray679[i_8_ + 2] = anIntArray679[i_3_ + 2];
					anIntArray679[i_8_ + 3] = anIntArray679[i_3_ + 3];
				}
			}
			anIntArray679[i_3_] = i_4_;
			anIntArray679[i_3_ + 1] = i_5_;
			anIntArray679[i_3_ + 2] = i_6_;
			anIntArray679[i_3_ + 3] = i_7_;
			method958(i, i_3_);
			method958(i_3_ + 4, i_2_);
		}
	}

	static void method959() {
		anInt680 = 0;
	}

	static boolean method960(int i) {
		int i_10_ = anInt676;
		int i_11_ = anInt683;
		int i_12_ = anInt681;
		int i_13_;
		for (/**/; i_11_ >= i_10_; i_11_ = i_13_) {
			anInt681 = ++i_12_;
			if (i_12_ >= i)
				return false;
			i_13_ = anInt678;
			for (/**/; i_10_ < anInt680; i_10_ += 4) {
				int i_14_ = anIntArray679[i_10_ + 1];
				if (i_12_ < i_14_)
					break;
				int i_15_ = anIntArray679[i_10_];
				int i_16_ = anIntArray679[i_10_ + 2];
				int i_17_ = anIntArray679[i_10_ + 3];
				int i_18_ = (i_16_ - i_15_ << 16) / (i_17_ - i_14_);
				int i_19_ = (i_15_ << 16) + 32768;
				anIntArray679[i_10_] = i_19_;
				anIntArray679[i_10_ + 2] = i_18_;
			}
			for (int i_20_ = i_13_; i_20_ < i_10_; i_20_ += 4) {
				int i_21_ = anIntArray679[i_20_ + 3];
				if (i_12_ >= i_21_) {
					anIntArray679[i_20_] = anIntArray679[i_13_];
					anIntArray679[i_20_ + 1] = anIntArray679[i_13_ + 1];
					anIntArray679[i_20_ + 2] = anIntArray679[i_13_ + 2];
					anIntArray679[i_20_ + 3] = anIntArray679[i_13_ + 3];
					i_13_ += 4;
				}
			}
			if (i_13_ == anInt680) {
				anInt680 = 0;
				return false;
			}
			method964(i_13_, i_10_);
			anInt678 = i_13_;
			anInt676 = i_10_;
		}
		anInt677 = anIntArray679[i_11_] >> 16;
		anInt682 = anIntArray679[i_11_ + 4] >> 16;
		anIntArray679[i_11_] += anIntArray679[i_11_ + 2];
		anIntArray679[i_11_ + 4] += anIntArray679[i_11_ + 6];
		i_11_ += 8;
		anInt683 = i_11_;
		return true;
	}

	static void method961(int i) {
		if (anInt680 < 0) {
			anInt683 = 0;
			anInt676 = 0;
			anInt678 = 0;
			anInt681 = 2147483646;
		} else {
			method958(0, anInt680);
			int i_22_ = anIntArray679[1];
			if (i_22_ < i)
				i_22_ = i;
			int i_23_ = 0;
			int i_24_;
			for (i_24_ = 0; i_24_ < anInt680; i_24_ += 4) {
				int i_25_ = anIntArray679[i_24_ + 1];
				if (i_22_ < i_25_)
					break;
				int i_26_ = anIntArray679[i_24_];
				int i_27_ = anIntArray679[i_24_ + 2];
				int i_28_ = anIntArray679[i_24_ + 3];
				int i_29_ = (i_27_ - i_26_ << 16) / (i_28_ - i_25_);
				int i_30_ = (i_26_ << 16) + 32768;
				anIntArray679[i_24_] = i_30_ + (i_22_ - i_25_) * i_29_;
				anIntArray679[i_24_ + 2] = i_29_;
			}
			anInt678 = i_23_;
			anInt676 = i_24_;
			anInt683 = i_24_;
			anInt681 = i_22_ - 1;
		}
	}

	static void method962(int[] is, int i, int i_31_) {
		int i_32_ = anInt680 + (i_31_ << 1);
		if (anIntArray679 == null || anIntArray679.length < i_32_) {
			int[] is_33_ = new int[i_32_];
			for (int i_34_ = 0; i_34_ < anInt680; i_34_++)
				is_33_[i_34_] = anIntArray679[i_34_];
			anIntArray679 = is_33_;
		}
		i_31_ += i;
		int i_35_ = i_31_ - 2;
		for (int i_36_ = i; i_36_ < i_31_; i_36_ += 2) {
			int i_37_ = is[i_35_ + 1];
			int i_38_ = is[i_36_ + 1];
			if (i_37_ < i_38_) {
				anIntArray679[anInt680++] = is[i_35_];
				anIntArray679[anInt680++] = i_37_;
				anIntArray679[anInt680++] = is[i_36_];
				anIntArray679[anInt680++] = i_38_;
			} else if (i_38_ < i_37_) {
				anIntArray679[anInt680++] = is[i_36_];
				anIntArray679[anInt680++] = i_38_;
				anIntArray679[anInt680++] = is[i_35_];
				anIntArray679[anInt680++] = i_37_;
			}
			i_35_ = i_36_;
		}
	}

	static void method963(Class_ra class_ra, int[] is, int i, int i_39_, int i_40_, int[] is_41_, int[] is_42_) {
		int[] is_43_ = new int[4];
		class_ra.qa(is_43_);
		if (is_41_ != null && is_43_[3] - is_43_[1] != is_41_.length)
			throw new IllegalStateException();
		method959();
		method962(is, i, i_39_);
		method961(is_43_[1]);
		while (method960(is_43_[3])) {
			int i_44_ = anInt677;
			int i_45_ = anInt682;
			int i_46_ = anInt681;
			if (is_41_ != null) {
				int i_47_ = i_46_ - is_43_[1];
				if (i_44_ < is_41_[i_47_] + is_43_[0])
					i_44_ = is_41_[i_47_] + is_43_[0];
				if (i_45_ > is_41_[i_47_] + is_42_[i_47_] + is_43_[0])
					i_45_ = is_41_[i_47_] + is_42_[i_47_] + is_43_[0];
				if (i_45_ - i_44_ <= 0)
					continue;
			}
			class_ra.XA(i_44_, i_46_, i_45_ - i_44_, i_40_, 1);
		}
	}

	Class82() throws Throwable {
		throw new Error();
	}

	static void method964(int i, int i_48_) {
		for (/**/; i_48_ >= i + 8; i_48_ -= 4) {
			boolean bool = true;
			for (int i_49_ = i + 4; i_49_ < i_48_; i_49_ += 4) {
				int i_50_ = anIntArray679[i_49_ - 4];
				int i_51_ = anIntArray679[i_49_];
				if (i_50_ > i_51_) {
					bool = false;
					anIntArray679[i_49_ - 4] = i_51_;
					anIntArray679[i_49_] = i_50_;
					i_50_ = anIntArray679[i_49_ - 2];
					anIntArray679[i_49_ - 2] = anIntArray679[i_49_ + 2];
					anIntArray679[i_49_ + 2] = i_50_;
					i_50_ = anIntArray679[i_49_ - 1];
					anIntArray679[i_49_ - 1] = anIntArray679[i_49_ + 3];
					anIntArray679[i_49_ + 3] = i_50_;
				}
			}
			if (bool)
				break;
		}
	}
}
