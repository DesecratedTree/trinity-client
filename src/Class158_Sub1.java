/* Class158_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class158_Sub1 extends Class158 {
	void method1842(boolean bool, int i, int i_0_, short i_1_) {
		try {
			Class361.aClass_ra3793.bl(i - 2, i_0_, (((Class158_Sub1) this).aClass201_6469.anInt6505 * 1790195679 + 4), 2 + (-2072821429 * ((Class158_Sub1) this).aClass201_6469.anInt6503), 549629193 * ((Class201_Sub3) ((Class158_Sub1) this).aClass201_6469).anInt8945, 0);
			Class361.aClass_ra3793.bl(i - 1, i_0_ + 1, 2 + ((((Class158_Sub1) this).aClass201_6469.anInt6505) * 1790195679), -2072821429 * (((Class158_Sub1) this).aClass201_6469.anInt6503), 0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aan.w(").append(')').toString());
		}
	}

	void method1840(boolean bool, int i, int i_2_, int i_3_) {
		try {
			int i_4_ = (method1839(-1370872478) * (1790195679 * ((Class158_Sub1) this).aClass201_6469.anInt6505) / 10000);
			Class361.aClass_ra3793.B(i, i_2_ + 2, i_4_, (-2072821429 * (((Class158_Sub1) this).aClass201_6469.anInt6503) - 2), (((Class201_Sub3) ((Class158_Sub1) this).aClass201_6469).anInt8944) * 397859873, 0);
			Class361.aClass_ra3793.B(i + i_4_, 2 + i_2_, (1790195679 * (((Class158_Sub1) this).aClass201_6469.anInt6505) - i_4_), (((Class158_Sub1) this).aClass201_6469.anInt6503) * -2072821429 - 2, 0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aan.n(").append(')').toString());
		}
	}

	void method1838(boolean bool, int i, int i_5_) {
		int i_6_ = (method1839(-567469374) * (1790195679 * ((Class158_Sub1) this).aClass201_6469.anInt6505) / 10000);
		Class361.aClass_ra3793.B(i, i_5_ + 2, i_6_, -2072821429 * (((Class158_Sub1) this).aClass201_6469.anInt6503) - 2, (((Class201_Sub3) ((Class158_Sub1) this).aClass201_6469).anInt8944) * 397859873, 0);
		Class361.aClass_ra3793.B(i + i_6_, 2 + i_5_, (1790195679 * ((Class158_Sub1) this).aClass201_6469.anInt6505 - i_6_), ((Class158_Sub1) this).aClass201_6469.anInt6503 * -2072821429 - 2, 0, 0);
	}

	void method1841(boolean bool, int i, int i_7_) {
		Class361.aClass_ra3793.bl(i - 2, i_7_, ((Class158_Sub1) this).aClass201_6469.anInt6505 * 1790195679 + 4, 2 + -2072821429 * ((Class158_Sub1) this).aClass201_6469.anInt6503, 549629193 * ((Class201_Sub3) ((Class158_Sub1) this).aClass201_6469).anInt8945, 0);
		Class361.aClass_ra3793.bl(i - 1, i_7_ + 1, 2 + (((Class158_Sub1) this).aClass201_6469.anInt6505) * 1790195679, -2072821429 * (((Class158_Sub1) this).aClass201_6469.anInt6503), 0, 0);
	}

	Class158_Sub1(IndexTable class280, IndexTable class280_8_, Class201_Sub3 class201_sub3) {
		super(class280, class280_8_, (Class201) class201_sub3);
	}

	void method1837(boolean bool, int i, int i_9_) {
		int i_10_ = (method1839(-1775848316) * (1790195679 * ((Class158_Sub1) this).aClass201_6469.anInt6505) / 10000);
		Class361.aClass_ra3793.B(i, i_9_ + 2, i_10_, -2072821429 * (((Class158_Sub1) this).aClass201_6469.anInt6503) - 2, (((Class201_Sub3) ((Class158_Sub1) this).aClass201_6469).anInt8944) * 397859873, 0);
		Class361.aClass_ra3793.B(i + i_10_, 2 + i_9_, (1790195679 * ((Class158_Sub1) this).aClass201_6469.anInt6505 - i_10_), ((Class158_Sub1) this).aClass201_6469.anInt6503 * -2072821429 - 2, 0, 0);
	}

	public static final void method1847(String string, byte i) {
		try {
			if (null != string) {
				String string_11_ = Class531.method6297(string, -2111042801);
				if (string_11_ != null) {
					for (int i_12_ = 0; i_12_ < -1187306419 * client.anInt9261; i_12_++) {
						Class75 class75 = client.aClass75Array8982[i_12_];
						String string_13_ = class75.aString646;
						String string_14_ = Class531.method6297(string_13_, -1790446972);
						if (Class432_Sub1_Sub5_Sub2.method5553(string, string_11_, string_13_, string_14_, 236900769)) {
							client.anInt9261 -= 1237365893;
							for (int i_15_ = i_12_; i_15_ < client.anInt9261 * -1187306419; i_15_++)
								client.aClass75Array8982[i_15_] = client.aClass75Array8982[i_15_ + 1];
							client.anInt9023 = 640746829 * client.anInt9268;
							Class1 class1 = Class426.method5317(1772923778);
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.REMOVE_IGNORE_PACKET, class1.aClass488_22, 1279612929);
							class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(string, -1144107884), (byte) 79);
							class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -23);
							class1.method378(class330_sub34, -1547705612);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aan.mq(").append(')').toString());
		}
	}

	static final void method1848(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_16_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_17_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			if ((Class263_Sub2.myPlayer.aClass408_10240) != null) {
				for (int i_18_ = 0; i_18_ < Class151.anIntArray6669.length; i_18_++) {
					if (Class151.anIntArray6669[i_18_] == i_16_) {
						Class263_Sub2.myPlayer.aClass408_10240.method4765(i_18_, i_17_, Class425.aClass169_4344, -1640074224);
						return;
					}
				}
				for (int i_19_ = 0; i_19_ < Class151.anIntArray6667.length; i_19_++) {
					if (Class151.anIntArray6667[i_19_] == i_16_) {
						Class263_Sub2.myPlayer.aClass408_10240.method4765(i_19_, i_17_, Class425.aClass169_4344, -1286397419);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aan.cb(").append(')').toString());
		}
	}

	static final void method1849(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_20_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			boolean bool = ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]) == 1);
			if (Class354_Sub1.aClass497_7990 != null) {
				Class330 class330 = Class354_Sub1.aClass497_7990.method6094((long) i_20_);
				if (class330 != null && !bool)
					class330.method3252(1403772349);
				else if (null == class330 && bool) {
					class330 = new Class330();
					Class354_Sub1.aClass497_7990.method6097(class330, (long) i_20_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aan.afi(").append(')').toString());
		}
	}

	public static int getCacheIndex(int i) {
		try {
			if (-1 == CacheIndex.cacheIndex * 1462537959) {
				CacheIndex[] class124s = Class277.getCacheIndecies(-1660774536);
				for (int i_21_ = 0; i_21_ < class124s.length; i_21_++) {
					CacheIndex class124 = class124s[i_21_];
					if (((CacheIndex) class124).anInt1448 * 488644695 > CacheIndex.cacheIndex * 1462537959)
						CacheIndex.cacheIndex = ((CacheIndex) class124).anInt1448 * 1362814225;
				}
				CacheIndex.cacheIndex += 951624919;
			}
			return 1462537959 * CacheIndex.cacheIndex;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aan.i(").append(')').toString());
		}
	}

	static final void method1851(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			IComponentDefinitions class114_22_ = Class433.method5561(class120, iComponentDefinitions, 369012573);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (class114_22_ == null ? -1 : class114_22_.anInt1196 * 751119487);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aan.px(").append(')').toString());
		}
	}
}
