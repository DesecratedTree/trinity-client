/* Class393 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class Class393 {
	static Queue aQueue4064;
	static long aLong4065 = -6188720877669888719L;
	static boolean aBoolean4066;
	static Class397_Sub1 aClass397_Sub1_4067;
	static int anInt4068 = 0;
	static Class397_Sub2 aClass397_Sub2_4069;

	Class393() throws Throwable {
		throw new Error();
	}

	static {
		aBoolean4066 = true;
		aClass397_Sub1_4067 = new Class397_Sub1();
		aClass397_Sub2_4069 = new Class397_Sub2();
		aQueue4064 = new LinkedList();
	}

	static void method4615(int i) {
		try {
			if (null == Console.anIntArray4263)
				Console.anIntArray4263 = new int[65536];
			else
				return;
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			int i_0_ = 0;
			for (int i_1_ = 0; i_1_ < 512; i_1_++) {
				float f = (0.0078125F + (float) (i_1_ >> 3) / 64.0F) * 360.0F;
				float f_2_ = (float) (i_1_ & 0x7) / 8.0F + 0.0625F;
				for (int i_3_ = 0; i_3_ < 128; i_3_++) {
					float f_4_ = (float) i_3_ / 128.0F;
					float f_5_ = 0.0F;
					float f_6_ = 0.0F;
					float f_7_ = 0.0F;
					float f_8_ = f / 60.0F;
					int i_9_ = (int) f_8_;
					int i_10_ = i_9_ % 6;
					float f_11_ = f_8_ - (float) i_9_;
					float f_12_ = f_4_ * (1.0F - f_2_);
					float f_13_ = (1.0F - f_2_ * f_11_) * f_4_;
					float f_14_ = f_4_ * (1.0F - (1.0F - f_11_) * f_2_);
					if (0 == i_10_) {
						f_5_ = f_4_;
						f_6_ = f_14_;
						f_7_ = f_12_;
					} else if (i_10_ == 1) {
						f_5_ = f_13_;
						f_6_ = f_4_;
						f_7_ = f_12_;
					} else if (i_10_ == 2) {
						f_5_ = f_12_;
						f_6_ = f_4_;
						f_7_ = f_14_;
					} else if (3 == i_10_) {
						f_5_ = f_12_;
						f_6_ = f_13_;
						f_7_ = f_4_;
					} else if (4 == i_10_) {
						f_5_ = f_14_;
						f_6_ = f_12_;
						f_7_ = f_4_;
					} else if (5 == i_10_) {
						f_5_ = f_4_;
						f_6_ = f_12_;
						f_7_ = f_13_;
					}
					f_5_ = (float) Math.pow((double) f_5_, d);
					f_6_ = (float) Math.pow((double) f_6_, d);
					f_7_ = (float) Math.pow((double) f_7_, d);
					int i_15_ = (int) (f_5_ * 256.0F);
					int i_16_ = (int) (f_6_ * 256.0F);
					int i_17_ = (int) (f_7_ * 256.0F);
					int i_18_ = -16777216 + (i_15_ << 16) + (i_16_ << 8) + i_17_;
					Console.anIntArray4263[i_0_++] = i_18_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qg.i(").append(')').toString());
		}
	}

	static final void method4616(Class330_Sub36_Sub10 class330_sub36_sub10, Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class51.method633(class330_sub36_sub10, 1619014583);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = Class477_Sub2.method6000(class330_sub36_sub10, -548389464);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = Class_ta.method5679(class330_sub36_sub10, (short) 15152);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = Class535.method6310(class330_sub36_sub10, 1234456048);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qg.d(").append(')').toString());
		}
	}

	static final void method4617(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_19_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_20_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_21_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 2]);
			Class498.method6110(10, i_19_ << 16 | i_20_, i_21_, "", (byte) 25);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qg.anj(").append(')').toString());
		}
	}

	static final void method4618(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_22_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_23_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			Class426 class426;
			if (((Class430) class430).aBoolean4398)
				class426 = ((Class430) class430).aClass426_4384;
			else
				class426 = ((Class430) class430).aClass426_4370;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class426.method5315((((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067), i_22_, i_23_, (byte) 22) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qg.aqo(").append(')').toString());
		}
	}

	static final void method4619(Class430 class430, int i) throws Exception_Sub4 {
		try {
			int i_24_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class401_Sub1.aClass145_Sub1_8249.method1696(Class96.method1180(i_24_, 83075234), true, (byte) -119);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qg.ahu(").append(')').toString());
		}
	}
}
