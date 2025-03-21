/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class431 implements Runnable {
	public void run() {
		try {
			try {
				Class509.anIcmpService_Sub1_5947.run();
			} catch (Throwable throwable) {
				/* empty */
			}
			Class509.anIcmpService_Sub1_5947 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.run(").append(')').toString());
		}
	}

	static final void method5337(IComponentDefinitions iComponentDefinitions, int i, int i_0_, Class430 class430, int i_1_) {
		try {
			if (null == iComponentDefinitions.anIntArray1278) {
				if (i_0_ > 0) {
					iComponentDefinitions.aByteArrayArray1351 = new byte[11][];
					iComponentDefinitions.aByteArrayArray1276 = new byte[11][];
					iComponentDefinitions.anIntArray1277 = new int[11];
					iComponentDefinitions.anIntArray1278 = new int[11];
				} else
					return;
			}
			iComponentDefinitions.anIntArray1278[i] = i_0_;
			if (i_0_ > 0)
				iComponentDefinitions.aBoolean1274 = true;
			else {
				iComponentDefinitions.aBoolean1274 = false;
				for (int i_2_ = 0; i_2_ < iComponentDefinitions.aByteArrayArray1351.length; i_2_++) {
					if (null != iComponentDefinitions.aByteArrayArray1351[i_2_] || iComponentDefinitions.anIntArray1278[i_2_] > 0) {
						iComponentDefinitions.aBoolean1274 = true;
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.kb(").append(')').toString());
		}
	}

	static final void method5338(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class122.method1451(iComponentDefinitions, class120, class430, (byte) 110);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.lf(").append(')').toString());
		}
	}

	static final void method5339(Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_3_, 130375010);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -421168987 * iComponentDefinitions.anInt1224;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.rn(").append(')').toString());
		}
	}

	static final void method5340(Class430 class430, short i) {
		try {
			if (-843487341 * client.anInt9257 == 0)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = client.anInt9261 * -1187306419;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.ws(").append(')').toString());
		}
	}

	static final void method5341(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_4_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_5_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_4_ % i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.zt(").append(')').toString());
		}
	}

	public static final int method5342(int i, int i_6_, int i_7_, int i_8_) {
		try {
			if (client.aClass304_9030.method3023(-400722441) == null)
				return 0;
			int i_9_ = i >> 9;
			int i_10_ = i_6_ >> 9;
			if (i_9_ < 0 || i_10_ < 0 || i_9_ > client.aClass304_9030.method2990(-2036253777) - 1 || i_10_ > client.aClass304_9030.method3033((byte) -51) - 1)
				return 0;
			int i_11_ = i_7_;
			if (i_11_ < 3 && ((client.aClass304_9030.method2995(1762355482).aByteArrayArrayArray2916[1][i_9_][i_10_]) & 0x2) != 0)
				i_11_++;
			return client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[i_11_].method6416(i, i_6_, -885579250);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.je(").append(')').toString());
		}
	}

	static String method5343(int[] is, int i) {
		try {
			StringBuilder stringbuilder = new StringBuilder();
			int i_12_ = Class144.anInt1577 * -1296454833;
			for (int i_13_ = 0; i_13_ < is.length; i_13_++) {
				Class395 class395 = Class131.aClass407_1502.method4752(is[i_13_], -1254118809);
				if (-1 == 765963899 * class395.anInt4105) {
					if (i >= 1142890664)
						throw new IllegalStateException();
				} else {
					Class61 class61 = ((Class61) (Class484.aClass367_5788.get((long) (class395.anInt4105 * 765963899))));
					if (null == class61) {
						Class87 class87 = Class53.method643(Class540.aClass280_6249, class395.anInt4105 * 765963899, 0);
						if (null != class87) {
							class61 = Class361.aClass_ra3793.bw(class87, true);
							Class484.aClass367_5788.put(class61, (long) (765963899 * class395.anInt4105));
						}
					}
					if (class61 != null) {
						Class_na.aClass61Array9725[i_12_] = class61;
						stringbuilder.append(" <img=").append(i_12_).append(">");
						i_12_++;
					}
				}
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.bf(").append(')').toString());
		}
	}

	static final void method5344(Class430 class430, short i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 159670669 * Class428.anInt4353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rx.aof(").append(')').toString());
		}
	}
}
