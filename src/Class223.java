/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class223 {
	static int anInt2352 = 4096;
	int anInt2353;
	static int anInt2354 = 4095;
	short[] aShortArray2355;
	short[] aShortArray2356 = new short[512];
	static int anInt2357 = 12;
	int anInt2358;
	int anInt2359;
	int anInt2360;
	int anInt2361;
	public static int[] anIntArray2362 = new int[4096];

	Class223(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		((Class223) this).anInt2353 = 0;
		((Class223) this).anInt2358 = 4;
		((Class223) this).anInt2359 = 4;
		((Class223) this).anInt2360 = 4;
		((Class223) this).anInt2361 = 4;
		((Class223) this).anInt2353 = i;
		((Class223) this).anInt2358 = i_1_;
		((Class223) this).anInt2359 = i_2_;
		((Class223) this).anInt2360 = i_3_;
		((Class223) this).anInt2361 = i_0_;
		method2274();
		method2280();
	}

	void method2274() {
		((Class223) this).aShortArray2355 = new short[((Class223) this).anInt2361];
		for (int i = 0; i < ((Class223) this).anInt2361; i++)
			((Class223) this).aShortArray2355[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	abstract void method2275();

	abstract void method2276(int i, int i_4_);

	static int method2277(int i, int i_5_, int i_6_, int i_7_) {
		int i_8_ = i & 0xf;
		int i_9_ = i_8_ < 8 ? i_5_ : i_6_;
		int i_10_ = i_8_ < 4 ? i_6_ : i_8_ == 12 || i_8_ == 14 ? i_5_ : i_7_;
		return (((i_8_ & 0x1) == 0 ? i_9_ : -i_9_) + ((i_8_ & 0x2) == 0 ? i_10_ : -i_10_));
	}

	static final int method2278(int i) {
		int i_11_ = i * (i * i >> 12) >> 12;
		int i_12_ = i * 6 - 61440;
		int i_13_ = 40960 + (i_12_ * i >> 12);
		return i_13_ * i_11_ >> 12;
	}

	void method2279(int i, int i_14_, int i_15_) {
		int[] is = new int[i];
		int[] is_16_ = new int[i_14_];
		int[] is_17_ = new int[i_15_];
		for (int i_18_ = 0; i_18_ < i; i_18_++)
			is[i_18_] = (i_18_ << 12) / i;
		for (int i_19_ = 0; i_19_ < i_14_; i_19_++)
			is_16_[i_19_] = (i_19_ << 12) / i_14_;
		for (int i_20_ = 0; i_20_ < i_15_; i_20_++)
			is_17_[i_20_] = (i_20_ << 12) / i_15_;
		method2275();
		for (int i_21_ = 0; i_21_ < i_15_; i_21_++) {
			for (int i_22_ = 0; i_22_ < i_14_; i_22_++) {
				for (int i_23_ = 0; i_23_ < i; i_23_++) {
					for (int i_24_ = 0; i_24_ < ((Class223) this).anInt2361; i_24_++) {
						int i_25_ = ((Class223) this).aShortArray2355[i_24_] << 12;
						int i_26_ = ((Class223) this).anInt2358 * i_25_ >> 12;
						int i_27_ = ((Class223) this).anInt2359 * i_25_ >> 12;
						int i_28_ = ((Class223) this).anInt2360 * i_25_ >> 12;
						int i_29_ = is[i_23_] * i_25_ >> 12;
						int i_30_ = is_16_[i_22_] * i_25_ >> 12;
						int i_31_ = is_17_[i_21_] * i_25_ >> 12;
						i_29_ *= ((Class223) this).anInt2358;
						i_30_ *= ((Class223) this).anInt2359;
						i_31_ *= ((Class223) this).anInt2360;
						int i_32_ = i_29_ >> 12;
						int i_33_ = i_32_ + 1;
						i_32_ &= 0xff;
						int i_34_ = i_30_ >> 12;
						int i_35_ = i_34_ + 1;
						i_34_ &= 0xff;
						int i_36_ = i_31_ >> 12;
						int i_37_ = i_36_ + 1;
						i_36_ &= 0xff;
						if (i_33_ >= i_26_)
							i_33_ = 0;
						else
							i_33_ &= 0xff;
						if (i_35_ >= i_27_)
							i_35_ = 0;
						else
							i_35_ &= 0xff;
						if (i_37_ >= i_28_)
							i_37_ = 0;
						else
							i_37_ &= 0xff;
						i_29_ &= 0xfff;
						i_30_ &= 0xfff;
						i_31_ &= 0xfff;
						int i_38_ = anIntArray2362[i_29_];
						int i_39_ = anIntArray2362[i_30_];
						int i_40_ = anIntArray2362[i_31_];
						int i_41_ = i_29_ - 4096;
						int i_42_ = i_30_ - 4096;
						int i_43_ = i_31_ - 4096;
						int i_44_ = ((Class223) this).aShortArray2356[i_36_];
						int i_45_ = ((Class223) this).aShortArray2356[i_37_];
						int i_46_ = ((Class223) this).aShortArray2356[i_34_ + i_44_];
						int i_47_ = ((Class223) this).aShortArray2356[i_35_ + i_44_];
						int i_48_ = ((Class223) this).aShortArray2356[i_34_ + i_45_];
						int i_49_ = ((Class223) this).aShortArray2356[i_35_ + i_45_];
						int i_50_ = method2277((((Class223) this).aShortArray2356[i_32_ + i_46_]), i_29_, i_30_, i_31_);
						int i_51_ = method2277((((Class223) this).aShortArray2356[i_33_ + i_46_]), i_41_, i_30_, i_31_);
						int i_52_ = i_50_ + (i_38_ * (i_51_ - i_50_) >> 12);
						i_50_ = method2277((((Class223) this).aShortArray2356[i_32_ + i_47_]), i_29_, i_42_, i_31_);
						i_51_ = method2277((((Class223) this).aShortArray2356[i_33_ + i_47_]), i_41_, i_42_, i_31_);
						int i_53_ = i_50_ + (i_38_ * (i_51_ - i_50_) >> 12);
						int i_54_ = i_52_ + (i_39_ * (i_53_ - i_52_) >> 12);
						i_50_ = method2277((((Class223) this).aShortArray2356[i_32_ + i_48_]), i_29_, i_30_, i_43_);
						i_51_ = method2277((((Class223) this).aShortArray2356[i_33_ + i_48_]), i_41_, i_30_, i_43_);
						i_52_ = i_50_ + (i_38_ * (i_51_ - i_50_) >> 12);
						i_50_ = method2277((((Class223) this).aShortArray2356[i_32_ + i_49_]), i_29_, i_42_, i_43_);
						i_51_ = method2277((((Class223) this).aShortArray2356[i_33_ + i_49_]), i_41_, i_42_, i_43_);
						i_53_ = i_50_ + (i_38_ * (i_51_ - i_50_) >> 12);
						int i_55_ = i_52_ + (i_39_ * (i_53_ - i_52_) >> 12);
						method2276(i_24_, i_54_ + (i_40_ * (i_55_ - i_54_) >> 12));
					}
					method2288();
				}
			}
		}
	}

	void method2280() {
		Random random = new Random((long) ((Class223) this).anInt2353);
		for (int i = 0; i < 255; i++)
			((Class223) this).aShortArray2356[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_56_ = 255 - i;
			int i_57_ = Class9.method423(random, i_56_, (byte) 30);
			short i_58_ = ((Class223) this).aShortArray2356[i_57_];
			((Class223) this).aShortArray2356[i_57_] = ((Class223) this).aShortArray2356[i_56_];
			((Class223) this).aShortArray2356[i_56_] = ((Class223) this).aShortArray2356[i_56_ + 256] = i_58_;
		}
	}

	abstract void method2281();

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray2362[i] = method2278(i);
	}

	abstract void method2282(int i, int i_59_);

	abstract void method2283();

	abstract void method2284();

	abstract void method2285();

	abstract void method2286();

	abstract void method2287(int i, int i_60_);

	abstract void method2288();
}
