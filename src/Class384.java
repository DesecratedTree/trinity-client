/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class384 {
	static Class384 aClass384_3965;
	int anInt3966;
	static Class384 aClass384_3967;
	static Class384 aClass384_3968 = new Class384(0);
	static Class524 aClass524_3969;

	static {
		aClass384_3965 = new Class384(1);
		aClass384_3967 = new Class384(2);
	}

	Class384(int i) {
		((Class384) this).anInt3966 = 338014037 * i;
	}

	static void method4415(long[] ls, int[] is, int i, int i_0_, int i_1_) {
		try {
			if (i < i_0_) {
				int i_2_ = (i + i_0_) / 2;
				int i_3_ = i;
				long l = ls[i_2_];
				ls[i_2_] = ls[i_0_];
				ls[i_0_] = l;
				int i_4_ = is[i_2_];
				is[i_2_] = is[i_0_];
				is[i_0_] = i_4_;
				int i_5_ = 9223372036854775807L == l ? 0 : 1;
				for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
					if (ls[i_6_] < (long) (i_6_ & i_5_) + l) {
						long l_7_ = ls[i_6_];
						ls[i_6_] = ls[i_3_];
						ls[i_3_] = l_7_;
						int i_8_ = is[i_6_];
						is[i_6_] = is[i_3_];
						is[i_3_++] = i_8_;
					}
				}
				ls[i_0_] = ls[i_3_];
				ls[i_3_] = l;
				is[i_0_] = is[i_3_];
				is[i_3_] = i_4_;
				method4415(ls, is, i, i_3_ - 1, -1638247890);
				method4415(ls, is, 1 + i_3_, i_0_, -1312530787);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.f(").append(')').toString());
		}
	}

	static final void method4416(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 2005289635 * iComponentDefinitions.anInt1245;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.pl(").append(')').toString());
		}
	}

	static final void method4417(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_9_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_10_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class370.aClass268_6770.method2659(i_9_, 978025596).aCharArray9687[i_10_]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.ada(").append(')').toString());
		}
	}

	static final void method4418(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			Class18.method452((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]), (((Class430) class430).anIntArray4387[(1632830751 * ((Class430) class430).anInt4376 + 1)]), (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 * 1632830751 + 2)]), 366372738);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.ts(").append(')').toString());
		}
	}

	static final void method4419(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class412.method5235(iComponentDefinitions, class120, class430, 1521261276);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.eo(").append(')').toString());
		}
	}

	static final void method4420(Class430 class430, int i) {
		try {
			Class283.method2828(-929934114);
			client.aClass304_9030.method3032(-1160699564);
			Class435.method5568(1181451085);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.aoj(").append(')').toString());
		}
	}

	public static boolean method4421(byte i) {
		try {
			return null != Class544.anInterface33_6256;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.i(").append(')').toString());
		}
	}

	static final void method4422(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aBoolean1236 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
			Class404.method4738(iComponentDefinitions, 1947729414);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("py.fl(").append(')').toString());
		}
	}
}
