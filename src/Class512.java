/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class512 {
	public int anInt5956;
	public int anInt5957;
	public int anInt5958;
	public int anInt5959 = 0;

	void method6187(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(-72560018);
				if (0 == i_0_) {
					if (i != -225890361) {
						/* empty */
					}
					break;
				}
				method6188(class330_sub46, i_0_, (byte) 4);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ve.r(").append(')').toString());
		}
	}

	void method6188(Buffer class330_sub46, int i, byte i_1_) {
		try {
			if (i == 1)
				anInt5959 = class330_sub46.readUnsignedByte(1226877042) * -1097130021;
			else if (i == 2)
				anInt5956 = class330_sub46.readUnsignedShort(-375074735) * 1399156759;
			else if (i == 3)
				anInt5958 = class330_sub46.readUnsignedShort(1251378150) * -1212228389;
			else if (i == 4)
				anInt5957 = class330_sub46.readShort(-1100583751) * 569709769;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ve.j(").append(')').toString());
		}
	}

	Class512() {
		anInt5957 = 0;
		anInt5958 = -152643584;
		anInt5956 = 729856000;
	}

	public static Class330_Sub28 method6189(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			synchronized (Class330_Sub28.aClass330_Sub28Array7718) {
				if (0 == 1418379869 * Class330_Sub28.anInt7715) {
					Class330_Sub28 class330_sub28 = new Class330_Sub28(i, i_2_, i_3_, i_4_);
					return class330_sub28;
				}
				Class330_Sub28.aClass330_Sub28Array7718[(Class330_Sub28.anInt7715 -= -832691723) * 1418379869].method3401(i, i_2_, i_3_, i_4_, 1633883814);
				Class330_Sub28 class330_sub28 = (Class330_Sub28.aClass330_Sub28Array7718[Class330_Sub28.anInt7715 * 1418379869]);
				return class330_sub28;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ve.r(").append(')').toString());
		}
	}

	static final void method6190(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class337.method3953(iComponentDefinitions, class430, -245717078);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ve.rg(").append(')').toString());
		}
	}

	static void method6191(int i, int i_6_, byte i_7_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(12, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = i_6_ * 229745735;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ve.ah(").append(')').toString());
		}
	}

	static void method6192(int i, int i_8_, int i_9_, boolean bool, int i_10_, boolean bool_11_, int i_12_) {
		try {
			if (i < i_8_) {
				int i_13_ = (i + i_8_) / 2;
				int i_14_ = i;
				Class401_Sub1 class401_sub1 = Class507.aClass401_Sub1Array5935[i_13_];
				Class507.aClass401_Sub1Array5935[i_13_] = Class507.aClass401_Sub1Array5935[i_8_];
				Class507.aClass401_Sub1Array5935[i_8_] = class401_sub1;
				for (int i_15_ = i; i_15_ < i_8_; i_15_++) {
					if (Class143.method1661((Class507.aClass401_Sub1Array5935[i_15_]), class401_sub1, i_9_, bool, i_10_, bool_11_, (short) 5384) <= 0) {
						Class401_Sub1 class401_sub1_16_ = Class507.aClass401_Sub1Array5935[i_15_];
						Class507.aClass401_Sub1Array5935[i_15_] = Class507.aClass401_Sub1Array5935[i_14_];
						Class507.aClass401_Sub1Array5935[i_14_++] = class401_sub1_16_;
					}
				}
				Class507.aClass401_Sub1Array5935[i_8_] = Class507.aClass401_Sub1Array5935[i_14_];
				Class507.aClass401_Sub1Array5935[i_14_] = class401_sub1;
				method6192(i, i_14_ - 1, i_9_, bool, i_10_, bool_11_, 695721163);
				method6192(1 + i_14_, i_8_, i_9_, bool, i_10_, bool_11_, -2025203205);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ve.n(").append(')').toString());
		}
	}

	static final void method6193(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -790144721 * iComponentDefinitions.anInt1287;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ve.ql(").append(')').toString());
		}
	}
}
