/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class147 {
	public int anInt1616;
	static Class147 aClass147_1617;
	static Class147 aClass147_1618;
	int anInt1619;
	static Class147 aClass147_1620 = new Class147(0, 4);
	public static int anInt1621;

	static {
		aClass147_1617 = new Class147(1, 5);
		aClass147_1618 = new Class147(2, 6);
	}

	Class147(int i, int i_0_) {
		((Class147) this).anInt1619 = 214555119 * i;
		anInt1616 = i_0_ * 706181847;
	}

	public static Class331 method1739(byte i) {
		try {
			return Class332.aClass331_6632;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fz.aa(").append(')').toString());
		}
	}

	static final void method1740(Class430 class430, byte i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_1_, 743564255);
			Class120 class120 = Class3.aClass120Array56[i_1_ >> 16];
			Class220.method2262(iComponentDefinitions, class120, class430, -679189266);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fz.oq(").append(')').toString());
		}
	}

	static final void method1741(Class430 class430, int i) {
		try {
			Class315_Sub1.method3143((byte) -30);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fz.aiq(").append(')').toString());
		}
	}

	static void method1742(int i, boolean bool, int i_2_) {
		try {
			if (bool) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2486, client.aClass1_9025.aClass488_22, 1707405364);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort(i, (byte) 7);
				client.aClass1_9025.method378(class330_sub34, -1680958893);
			} else
				Class230.method2339(Class545.aClass545_7001, i, -1, 531560327);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fz.p(").append(')').toString());
		}
	}

	public static Class366 method1743(int i, int i_3_, int i_4_) {
		try {
			Class363.aClass366_Sub1_3802.anInt3854 = i * -1089827279;
			Class363.aClass366_Sub1_3802.anInt3853 = 1307742219 * i_3_;
			Class363.aClass366_Sub1_3802.anInt3852 = 1706819999;
			Class363.aClass366_Sub1_3802.anInt3855 = 1343860585;
			return Class363.aClass366_Sub1_3802;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fz.r(").append(')').toString());
		}
	}

	public static void method1744(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			if (i_5_ >= 0 && i_6_ >= 0 && i_5_ < client.aClass304_9030.method2990(-1284629251) - 1 && i_6_ < client.aClass304_9030.method3033((byte) -95) - 1) {
				if (client.aClass304_9030.method3023(-400722441) != null) {
					if (0 == i_7_) {
						Interface2 interface2 = ((Interface2) client.aClass304_9030.method3023(-400722441).method4154(i, i_5_, i_6_, -2040838155));
						Interface2 interface2_12_ = ((Interface2) client.aClass304_9030.method3023(-400722441).method4155(i, i_5_, i_6_, 1734131488));
						if (null != interface2 && 2 != i_8_) {
							if (interface2 instanceof Class432_Sub1_Sub5_Sub2)
								((Class432_Sub1_Sub5_Sub2) interface2).aClass70_9977.method802(i_10_, 1654052063);
							else
								Class551.method6379(i, i_7_, i_5_, i_6_, interface2.method34((short) -22655), i_9_, i_8_, i_10_, 1185709556);
						}
						if (null != interface2_12_) {
							if (interface2_12_ instanceof Class432_Sub1_Sub5_Sub2)
								((Class432_Sub1_Sub5_Sub2) interface2_12_).aClass70_9977.method802(i_10_, 1654052063);
							else
								Class551.method6379(i, i_7_, i_5_, i_6_, interface2_12_.method34((short) -18783), i_9_, i_8_, i_10_, 1367086849);
						}
					} else if (i_7_ == 1) {
						Interface2 interface2 = ((Interface2) client.aClass304_9030.method3023(-400722441).method4156(i, i_5_, i_6_, 2099392181));
						if (null != interface2) {
							if (interface2 instanceof Class432_Sub1_Sub3_Sub2)
								((Class432_Sub1_Sub3_Sub2) interface2).aClass70_10002.method802(i_10_, 1654052063);
							else {
								int i_13_ = interface2.method34((short) -13882);
								if (i_8_ == 4 || i_8_ == 5)
									Class551.method6379(i, i_7_, i_5_, i_6_, i_13_, i_9_, 4, i_10_, 1241759411);
								else if (i_8_ == 6)
									Class551.method6379(i, i_7_, i_5_, i_6_, i_13_, 4 + i_9_, 4, i_10_, 1293139515);
								else if (7 == i_8_)
									Class551.method6379(i, i_7_, i_5_, i_6_, i_13_, 4 + (2 + i_9_ & 0x3), 4, i_10_, 1395579419);
								else if (i_8_ == 8) {
									Class551.method6379(i, i_7_, i_5_, i_6_, i_13_, 4 + i_9_, 4, i_10_, 1796456179);
									Class551.method6379(i, i_7_, i_5_, i_6_, i_13_, (i_9_ + 2 & 0x3) + 4, 4, i_10_, 1036886944);
								}
							}
						}
					} else if (2 == i_7_) {
						Interface2 interface2 = ((Interface2) (client.aClass304_9030.method3023(-400722441).method4158(i, i_5_, i_6_, client.anInterface19_9266, (byte) 27)));
						if (null != interface2) {
							if (11 == i_8_)
								i_8_ = 10;
							if (interface2 instanceof Class432_Sub1_Sub1_Sub5)
								((Class432_Sub1_Sub1_Sub5) interface2).aClass70_9941.method802(i_10_, 1654052063);
							else
								Class551.method6379(i, i_7_, i_5_, i_6_, interface2.method34((short) -24669), i_9_, i_8_, i_10_, 1615074904);
						}
					} else if (i_7_ == 3) {
						Interface2 interface2 = ((Interface2) client.aClass304_9030.method3023(-400722441).method4177(i, i_5_, i_6_, 1315717432));
						if (interface2 != null) {
							if (interface2 instanceof Class432_Sub1_Sub4_Sub1)
								((Class432_Sub1_Sub4_Sub1) interface2).aClass70_9945.method802(i_10_, 1654052063);
							else
								Class551.method6379(i, i_7_, i_5_, i_6_, interface2.method34((short) -8726), i_9_, i_8_, i_10_, 1186711654);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fz.kj(").append(')').toString());
		}
	}

	static final void method1745(Class430 class430, short i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class542.method6336(iComponentDefinitions, class120, class430, 2098630892);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fz.iw(").append(')').toString());
		}
	}
}
