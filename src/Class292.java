/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.Random;

public class Class292 {
	static int[] anIntArray2981;
	Class309 aClass309_2982;
	Class309 aClass309_2983;
	int anInt2984;
	static int[] anIntArray2985 = new int[32768];
	Class309 aClass309_2986;
	Class309 aClass309_2987;
	Class309 aClass309_2988;
	int[] anIntArray2989 = { 0, 0, 0, 0, 0 };
	int[] anIntArray2990 = { 0, 0, 0, 0, 0 };
	int[] anIntArray2991 = { 0, 0, 0, 0, 0 };
	int anInt2992 = 0;
	int anInt2993 = 100;
	Class328 aClass328_2994;
	Class309 aClass309_2995;
	int anInt2996 = 500;
	Class309 aClass309_2997;
	static int[] anIntArray2998;
	static int[] anIntArray2999;
	static int[] anIntArray3000;
	static int[] anIntArray3001;
	static double aDouble3002 = 1.0057929410678534;
	static int[] anIntArray3003;
	Class309 aClass309_3004;
	static int[] anIntArray3005;
	Class309 aClass309_3006;

	final int[] method2909(int i, int i_0_) {
		Arrays.fill(anIntArray2998, 0, i, 0);
		if (i_0_ < 10)
			return anIntArray2998;
		double d = (double) i / ((double) i_0_ + 0.0);
		((Class292) this).aClass309_2983.method3096();
		((Class292) this).aClass309_2982.method3096();
		int i_1_ = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (((Class292) this).aClass309_2988 != null) {
			((Class292) this).aClass309_2988.method3096();
			((Class292) this).aClass309_3004.method3096();
			i_1_ = (int) ((double) (((Class309) (((Class292) this).aClass309_2988)).anInt3197 - ((Class309) (((Class292) this).aClass309_2988)).anInt3198) * 32.768 / d);
			i_2_ = (int) ((double) ((Class309) ((Class292) this).aClass309_2988).anInt3198 * 32.768 / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (((Class292) this).aClass309_2997 != null) {
			((Class292) this).aClass309_2997.method3096();
			((Class292) this).aClass309_2986.method3096();
			i_4_ = (int) ((double) (((Class309) (((Class292) this).aClass309_2997)).anInt3197 - ((Class309) (((Class292) this).aClass309_2997)).anInt3198) * 32.768 / d);
			i_5_ = (int) ((double) ((Class309) ((Class292) this).aClass309_2997).anInt3198 * 32.768 / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (((Class292) this).anIntArray2989[i_7_] != 0) {
				anIntArray2981[i_7_] = 0;
				anIntArray3003[i_7_] = (int) ((double) ((Class292) this).anIntArray2991[i_7_] * d);
				anIntArray2999[i_7_] = (((Class292) this).anIntArray2989[i_7_] << 14) / 100;
				anIntArray3005[i_7_] = (int) ((double) (((Class309) (((Class292) this).aClass309_2983)).anInt3197 - (((Class309) ((Class292) this).aClass309_2983).anInt3198)) * 32.768 * Math.pow(1.0057929410678534, (double) (((Class292) this).anIntArray2990[i_7_])) / d);
				anIntArray3001[i_7_] = (int) ((double) ((Class309) (((Class292) this).aClass309_2983)).anInt3198 * 32.768 / d);
			}
		}
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			int i_9_ = ((Class292) this).aClass309_2983.method3095(i);
			int i_10_ = ((Class292) this).aClass309_2982.method3095(i);
			if (((Class292) this).aClass309_2988 != null) {
				int i_11_ = ((Class292) this).aClass309_2988.method3095(i);
				int i_12_ = ((Class292) this).aClass309_3004.method3095(i);
				i_9_ += method2910(i_3_, i_12_, (((Class309) (((Class292) this).aClass309_2988)).anInt3196)) >> 1;
				i_3_ += (i_11_ * i_1_ >> 16) + i_2_;
			}
			if (((Class292) this).aClass309_2997 != null) {
				int i_13_ = ((Class292) this).aClass309_2997.method3095(i);
				int i_14_ = ((Class292) this).aClass309_2986.method3095(i);
				i_10_ = i_10_ * ((method2910(i_6_, i_14_, (((Class309) (((Class292) this).aClass309_2997)).anInt3196)) >> 1) + 32768) >> 15;
				i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (((Class292) this).anIntArray2989[i_15_] != 0) {
					int i_16_ = i_8_ + anIntArray3003[i_15_];
					if (i_16_ < i) {
						anIntArray2998[i_16_] += method2910(anIntArray2981[i_15_], i_10_ * anIntArray2999[i_15_] >> 15, (((Class309) ((Class292) this).aClass309_2983).anInt3196));
						anIntArray2981[i_15_] += ((i_9_ * anIntArray3005[i_15_] >> 16) + anIntArray3001[i_15_]);
					}
				}
			}
		}
		if (((Class292) this).aClass309_2987 != null) {
			((Class292) this).aClass309_2987.method3096();
			((Class292) this).aClass309_3006.method3096();
			int i_17_ = 0;
			boolean bool = false;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < i; i_19_++) {
				int i_20_ = ((Class292) this).aClass309_2987.method3095(i);
				int i_21_ = ((Class292) this).aClass309_3006.method3095(i);
				int i_22_;
				if (bool_18_)
					i_22_ = ((((Class309) ((Class292) this).aClass309_2987).anInt3198) + (((((Class309) ((Class292) this).aClass309_2987).anInt3197) - (((Class309) ((Class292) this).aClass309_2987).anInt3198)) * i_20_ >> 8));
				else
					i_22_ = ((((Class309) ((Class292) this).aClass309_2987).anInt3198) + (((((Class309) ((Class292) this).aClass309_2987).anInt3197) - (((Class309) ((Class292) this).aClass309_2987).anInt3198)) * i_21_ >> 8));
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_)
					anIntArray2998[i_19_] = 0;
			}
		}
		if (((Class292) this).anInt2992 > 0 && ((Class292) this).anInt2993 > 0) {
			int i_23_ = (int) ((double) ((Class292) this).anInt2992 * d);
			for (int i_24_ = i_23_; i_24_ < i; i_24_++)
				anIntArray2998[i_24_] += (anIntArray2998[i_24_ - i_23_] * ((Class292) this).anInt2993 / 100);
		}
		if (((Class328) ((Class292) this).aClass328_2994).anIntArray3328[0] > 0 || (((Class328) ((Class292) this).aClass328_2994).anIntArray3328[1] > 0)) {
			((Class292) this).aClass309_2995.method3096();
			int i_25_ = ((Class292) this).aClass309_2995.method3095(i + 1);
			int i_26_ = ((Class292) this).aClass328_2994.method3245(0, (float) i_25_ / 65536.0F);
			int i_27_ = ((Class292) this).aClass328_2994.method3245(1, (float) i_25_ / 65536.0F);
			if (i >= i_26_ + i_27_) {
				int i_28_ = 0;
				int i_29_ = i_27_;
				if (i_29_ > i - i_26_)
					i_29_ = i - i_26_;
				for (/**/; i_28_ < i_29_; i_28_++) {
					int i_30_ = (int) (((long) anIntArray2998[i_28_ + i_26_] * (long) Class328.anInt3336) >> 16);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						i_30_ += (int) (((long) (anIntArray2998[i_28_ + i_26_ - 1 - i_31_]) * (long) (Class328.anIntArrayArray3339[0][i_31_])) >> 16);
					for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
						i_30_ -= (int) (((long) anIntArray2998[i_28_ - 1 - i_32_] * (long) (Class328.anIntArrayArray3339[1][i_32_])) >> 16);
					anIntArray2998[i_28_] = i_30_;
					i_25_ = ((Class292) this).aClass309_2995.method3095(i + 1);
				}
				i_29_ = 128;
				for (;;) {
					if (i_29_ > i - i_26_)
						i_29_ = i - i_26_;
					for (/**/; i_28_ < i_29_; i_28_++) {
						int i_33_ = (int) (((long) anIntArray2998[i_28_ + i_26_] * (long) Class328.anInt3336) >> 16);
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
							i_33_ += (int) (((long) (anIntArray2998[i_28_ + i_26_ - 1 - i_34_]) * (long) (Class328.anIntArrayArray3339[0][i_34_])) >> 16);
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
							i_33_ -= (int) (((long) (anIntArray2998[i_28_ - 1 - i_35_]) * (long) (Class328.anIntArrayArray3339[1][i_35_])) >> 16);
						anIntArray2998[i_28_] = i_33_;
						i_25_ = ((Class292) this).aClass309_2995.method3095(i + 1);
					}
					if (i_28_ >= i - i_26_)
						break;
					i_26_ = ((Class292) this).aClass328_2994.method3245(0, (float) i_25_ / 65536.0F);
					i_27_ = ((Class292) this).aClass328_2994.method3245(1, (float) i_25_ / 65536.0F);
					i_29_ += 128;
				}
				for (/**/; i_28_ < i; i_28_++) {
					int i_36_ = 0;
					for (int i_37_ = i_28_ + i_26_ - i; i_37_ < i_26_; i_37_++)
						i_36_ += (int) (((long) (anIntArray2998[i_28_ + i_26_ - 1 - i_37_]) * (long) (Class328.anIntArrayArray3339[0][i_37_])) >> 16);
					for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
						i_36_ -= (int) (((long) anIntArray2998[i_28_ - 1 - i_38_] * (long) (Class328.anIntArrayArray3339[1][i_38_])) >> 16);
					anIntArray2998[i_28_] = i_36_;
					i_25_ = ((Class292) this).aClass309_2995.method3095(i + 1);
				}
			}
		}
		for (int i_39_ = 0; i_39_ < i; i_39_++) {
			if (anIntArray2998[i_39_] < -32768)
				anIntArray2998[i_39_] = -32768;
			if (anIntArray2998[i_39_] > 32767)
				anIntArray2998[i_39_] = 32767;
		}
		return anIntArray2998;
	}

	final int method2910(int i, int i_40_, int i_41_) {
		if (i_41_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_40_;
			return -i_40_;
		}
		if (i_41_ == 2)
			return anIntArray3000[i & 0x7fff] * i_40_ >> 14;
		if (i_41_ == 3)
			return ((i & 0x7fff) * i_40_ >> 14) - i_40_;
		if (i_41_ == 4)
			return anIntArray2985[i / 2607 & 0x7fff] * i_40_;
		return 0;
	}

	Class292() {
		((Class292) this).anInt2984 = 0;
	}

	final void method2911(Buffer class330_sub46) {
		((Class292) this).aClass309_2983 = new Class309();
		((Class292) this).aClass309_2983.method3093(class330_sub46);
		((Class292) this).aClass309_2982 = new Class309();
		((Class292) this).aClass309_2982.method3093(class330_sub46);
		int i = class330_sub46.readUnsignedByte(242092668);
		if (i != 0) {
			class330_sub46.offset -= 323600977;
			((Class292) this).aClass309_2988 = new Class309();
			((Class292) this).aClass309_2988.method3093(class330_sub46);
			((Class292) this).aClass309_3004 = new Class309();
			((Class292) this).aClass309_3004.method3093(class330_sub46);
		}
		i = class330_sub46.readUnsignedByte(565383669);
		if (i != 0) {
			class330_sub46.offset -= 323600977;
			((Class292) this).aClass309_2997 = new Class309();
			((Class292) this).aClass309_2997.method3093(class330_sub46);
			((Class292) this).aClass309_2986 = new Class309();
			((Class292) this).aClass309_2986.method3093(class330_sub46);
		}
		i = class330_sub46.readUnsignedByte(1791202577);
		if (i != 0) {
			class330_sub46.offset -= 323600977;
			((Class292) this).aClass309_2987 = new Class309();
			((Class292) this).aClass309_2987.method3093(class330_sub46);
			((Class292) this).aClass309_3006 = new Class309();
			((Class292) this).aClass309_3006.method3093(class330_sub46);
		}
		for (int i_42_ = 0; i_42_ < 10; i_42_++) {
			int i_43_ = class330_sub46.readSmart(-1554194529);
			if (i_43_ == 0)
				break;
			((Class292) this).anIntArray2989[i_42_] = i_43_;
			((Class292) this).anIntArray2990[i_42_] = class330_sub46.method3764((byte) -38);
			((Class292) this).anIntArray2991[i_42_] = class330_sub46.readSmart(-322243806);
		}
		((Class292) this).anInt2992 = class330_sub46.readSmart(-1949455388);
		((Class292) this).anInt2993 = class330_sub46.readSmart(-1410893461);
		((Class292) this).anInt2996 = class330_sub46.readUnsignedShort(-69470865);
		((Class292) this).anInt2984 = class330_sub46.readUnsignedShort(1678664623);
		((Class292) this).aClass328_2994 = new Class328();
		((Class292) this).aClass309_2995 = new Class309();
		((Class292) this).aClass328_2994.method3246(class330_sub46, ((Class292) this).aClass309_2995);
	}

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray2985[i] = (random.nextInt() & 0x2) - 1;
		anIntArray3000 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray3000[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		anIntArray2998 = new int[220500];
		anIntArray2981 = new int[5];
		anIntArray3003 = new int[5];
		anIntArray2999 = new int[5];
		anIntArray3005 = new int[5];
		anIntArray3001 = new int[5];
	}
}
