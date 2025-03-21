/* Class95_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95_Sub13 extends Class95 {
	int anInt7178;
	int anInt7179;
	static int anInt7180;
	static int anInt7181;

	boolean method1142() {
		Class440 class440 = Class201.aClass436_6511.method5570((((Class95_Sub13) this).anInt7179) * -1077530493, 937821806);
		return class440.method5600(1970323974);
	}

	boolean method1143() {
		Class440 class440 = Class201.aClass436_6511.method5570((((Class95_Sub13) this).anInt7179) * -1077530493, -627420196);
		return class440.method5600(1356117566);
	}

	public void method1095(int i) {
		try {
			Class88 class88 = (Class96.aClass88Array855[((Class95_Sub13) this).anInt7178 * -403245111]);
			Class147.method1744(-116947565 * ((Class88) class88).anInt725, -807907255 * ((Class88) class88).anInt727, ((Class88) class88).anInt729 * -1122588811, (((Class88) class88).aClass476_726.anInt6901 * -130763309), (((Class88) class88).aClass476_726.anInt6882 * -344921723), -761944079 * ((Class88) class88).anInt730, ((Class95_Sub13) this).anInt7179 * -1077530493, -1888601790);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zm.j(").append(')').toString());
		}
	}

	Class95_Sub13(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub13) this).anInt7178 = class330_sub46.readUnsignedShort(979544814) * -1041051015;
		((Class95_Sub13) this).anInt7179 = class330_sub46.readBigSmart(-1752227383) * -1273520597;
	}

	public void method1098() {
		Class88 class88 = (Class96.aClass88Array855[((Class95_Sub13) this).anInt7178 * -403245111]);
		Class147.method1744(-116947565 * ((Class88) class88).anInt725, -807907255 * ((Class88) class88).anInt727, ((Class88) class88).anInt729 * -1122588811, (((Class88) class88).aClass476_726.anInt6901 * -130763309), (((Class88) class88).aClass476_726.anInt6882 * -344921723), -761944079 * ((Class88) class88).anInt730, ((Class95_Sub13) this).anInt7179 * -1077530493, -1469013054);
	}

	public void method1099() {
		Class88 class88 = (Class96.aClass88Array855[((Class95_Sub13) this).anInt7178 * -403245111]);
		Class147.method1744(-116947565 * ((Class88) class88).anInt725, -807907255 * ((Class88) class88).anInt727, ((Class88) class88).anInt729 * -1122588811, (((Class88) class88).aClass476_726.anInt6901 * -130763309), (((Class88) class88).aClass476_726.anInt6882 * -344921723), -761944079 * ((Class88) class88).anInt730, ((Class95_Sub13) this).anInt7179 * -1077530493, -2022058328);
	}

	public void method1100() {
		Class88 class88 = (Class96.aClass88Array855[((Class95_Sub13) this).anInt7178 * -403245111]);
		Class147.method1744(-116947565 * ((Class88) class88).anInt725, -807907255 * ((Class88) class88).anInt727, ((Class88) class88).anInt729 * -1122588811, (((Class88) class88).aClass476_726.anInt6901 * -130763309), (((Class88) class88).aClass476_726.anInt6882 * -344921723), -761944079 * ((Class88) class88).anInt730, ((Class95_Sub13) this).anInt7179 * -1077530493, -1267266752);
	}

	boolean method1144() {
		Class440 class440 = Class201.aClass436_6511.method5570((((Class95_Sub13) this).anInt7179) * -1077530493, 1353050092);
		return class440.method5600(736320696);
	}

	boolean method1097(int i) {
		try {
			Class440 class440 = Class201.aClass436_6511.method5570(((((Class95_Sub13) this).anInt7179) * -1077530493), -1406900897);
			return class440.method5600(1574653534);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zm.p(").append(')').toString());
		}
	}

	public static void method1145(Player class432_sub1_sub1_sub1_sub1, byte i) {
		try {
			Class330_Sub20 class330_sub20 = ((Class330_Sub20) (Class330_Sub20.aClass497_7651.method6094((long) (-1654044763 * class432_sub1_sub1_sub1_sub1.anInt10008))));
			if (null != class330_sub20) {
				if (null != (((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675)) {
					Class511.aClass330_Sub40_Sub4_5951.method3685(((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675);
					((Class330_Sub20) class330_sub20).aClass330_Sub40_Sub3_7675 = null;
				}
				class330_sub20.method3252(-1805293750);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zm.f(").append(')').toString());
		}
	}

	static final boolean method1146(Class340[][][] class340s, int i, int i_0_, int i_1_, boolean bool, int i_2_) {
		try {
			byte[][][] is = client.aClass304_9030.method2999(-580390108);
			byte i_3_ = (bool ? (byte) 1 : (byte) (-500310177 * client.anInt9092 & 0xff));
			if (i_3_ == is[Class85.anInt712 * -127654579][i_0_][i_1_])
				return false;
			Class281 class281 = client.aClass304_9030.method2995(1296490404);
			if (((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_0_][i_1_]) & 0x4) == 0)
				return false;
			int i_4_ = 0;
			int i_5_ = 0;
			client.anIntArray9065[i_4_] = i_0_;
			client.anIntArray9050[i_4_++] = i_1_;
			is[-127654579 * Class85.anInt712][i_0_][i_1_] = i_3_;
			while (i_5_ != i_4_) {
				int i_6_ = client.anIntArray9065[i_5_] & 0xffff;
				int i_7_ = client.anIntArray9065[i_5_] >> 16 & 0xff;
				int i_8_ = client.anIntArray9065[i_5_] >> 24 & 0xff;
				int i_9_ = client.anIntArray9050[i_5_] & 0xffff;
				int i_10_ = client.anIntArray9050[i_5_] >> 16 & 0xff;
				i_5_ = i_5_ + 1 & 0xfff;
				boolean bool_11_ = false;
				if (0 == ((class281.aByteArrayArrayArray2916[-127654579 * Class85.anInt712][i_6_][i_9_]) & 0x4))
					bool_11_ = true;
				boolean bool_12_ = false;
				if (null != class340s) {
					int i_13_ = 1 + Class85.anInt712 * -127654579;
					while_122_: for (/**/; i_13_ <= 3; i_13_++) {
						if (null == class340s[i_13_]) {
							if (i_2_ != -1496633717)
								throw new IllegalStateException();
						} else if (0 == ((class281.aByteArrayArrayArray2916[i_13_][i_6_][i_9_]) & 0x8)) {
							if (bool_11_ && null != class340s[i_13_][i_6_][i_9_]) {
								if (null != (class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3382)) {
									int i_14_ = Class330_Sub40_Sub1.method3578(i_7_, -1509477333);
									if ((class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3382.aShort9931) == i_14_)
										continue;
									if (null != (class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3383) && i_14_ == (class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3383.aShort9931)) {
										if (i_2_ != -1496633717) {
											/* empty */
										}
										continue;
									}
									if (0 != i_8_) {
										int i_15_ = (Class330_Sub40_Sub1.method3578(i_8_, -1509477333));
										if (i_15_ == (class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3382.aShort9931))
											continue;
										if ((class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3383) != null && (class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3383.aShort9931) == i_15_) {
											if (i_2_ != -1496633717) {
												/* empty */
											}
											continue;
										}
									}
									if (0 != i_10_) {
										int i_16_ = (Class330_Sub40_Sub1.method3578(i_10_, -1509477333));
										if ((class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3382.aShort9931) == i_16_)
											continue;
										if (null != (class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3383) && (class340s[i_13_][i_6_][i_9_].aClass432_Sub1_Sub5_3383.aShort9931) == i_16_) {
											if (i_2_ != -1496633717)
												throw new IllegalStateException();
											continue;
										}
									}
								}
								Class340 class340 = class340s[i_13_][i_6_][i_9_];
								if (class340.aClass352_3388 != null) {
									for (Class352 class352 = class340.aClass352_3388; null != class352; class352 = class352.aClass352_3483) {
										Class432_Sub1_Sub1 class432_sub1_sub1 = (class352.aClass432_Sub1_Sub1_3484);
										if (class432_sub1_sub1 instanceof Interface2) {
											Interface2 interface2 = ((Interface2) class432_sub1_sub1);
											int i_17_ = interface2.method21(1020268653);
											int i_18_ = interface2.method33((byte) -5);
											if (i_17_ == 21)
												i_17_ = 19;
											int i_19_ = i_17_ | i_18_ << 6;
											if (i_19_ == i_7_) {
												if (i_2_ != -1496633717)
													throw new IllegalStateException();
												continue while_122_;
											}
											if (i_8_ != 0 && i_19_ == i_8_) {
												if (i_2_ != -1496633717)
													throw new IllegalStateException();
												continue while_122_;
											}
											if (i_10_ != 0 && i_10_ == i_19_) {
												if (i_2_ != -1496633717) {
													/* empty */
												}
												continue while_122_;
											}
										}
									}
								}
							}
							Class340 class340 = class340s[i_13_][i_6_][i_9_];
							if (null != class340 && class340.aClass352_3388 != null) {
								for (Class352 class352 = class340.aClass352_3388; null != class352; class352 = class352.aClass352_3483) {
									Class432_Sub1_Sub1 class432_sub1_sub1 = class352.aClass432_Sub1_Sub1_3484;
									if ((class432_sub1_sub1.aShort9920 != class432_sub1_sub1.aShort9922) || (class432_sub1_sub1.aShort9923 != (class432_sub1_sub1.aShort9921))) {
										for (int i_20_ = (class432_sub1_sub1.aShort9922); i_20_ <= (class432_sub1_sub1.aShort9920); i_20_++) {
											for (int i_21_ = (class432_sub1_sub1.aShort9921); i_21_ <= (class432_sub1_sub1.aShort9923); i_21_++)
												is[i_13_][i_20_][i_21_] = i_3_;
										}
									}
								}
							}
							is[i_13_][i_6_][i_9_] = i_3_;
							bool_12_ = true;
						}
					}
				}
				if (bool_12_) {
					int i_22_ = client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[1 + -127654579 * Class85.anInt712].method6417(i_6_, i_9_, 280598206);
					if (client.anIntArray9108[i] < i_22_)
						client.anIntArray9108[i] = i_22_;
					int i_23_ = i_6_ << 9;
					int i_24_ = i_9_ << 9;
					if (client.anIntArray8973[i] > i_23_)
						client.anIntArray8973[i] = i_23_;
					else if (client.anIntArray8952[i] < i_23_)
						client.anIntArray8952[i] = i_23_;
					if (client.anIntArray9112[i] > i_24_)
						client.anIntArray9112[i] = i_24_;
					else if (client.anIntArray9169[i] < i_24_)
						client.anIntArray9169[i] = i_24_;
				}
				if (bool_11_) {
					if (i_2_ != -1496633717)
						throw new IllegalStateException();
				} else {
					if (i_6_ >= 1 && (is[-127654579 * Class85.anInt712][i_6_ - 1][i_9_] != i_3_)) {
						client.anIntArray9065[i_4_] = i_6_ - 1 | 0x120000 | ~0x2cffffff;
						client.anIntArray9050[i_4_] = i_9_ | 0x130000;
						i_4_ = 1 + i_4_ & 0xfff;
						is[Class85.anInt712 * -127654579][i_6_ - 1][i_9_] = i_3_;
					}
					if (++i_9_ < client.aClass304_9030.method3033((byte) -92)) {
						if (i_6_ - 1 >= 0 && (is[Class85.anInt712 * -127654579][i_6_ - 1][i_9_]) != i_3_ && 0 == ((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_6_][i_9_]) & 0x4) && 0 == ((class281.aByteArrayArrayArray2916[-127654579 * Class85.anInt712][i_6_ - 1][i_9_ - 1]) & 0x4)) {
							client.anIntArray9065[i_4_] = i_6_ - 1 | 0x120000 | 0x52000000;
							client.anIntArray9050[i_4_] = i_9_ | 0x130000;
							i_4_ = 1 + i_4_ & 0xfff;
							is[Class85.anInt712 * -127654579][i_6_ - 1][i_9_] = i_3_;
						}
						if (is[Class85.anInt712 * -127654579][i_6_][i_9_] != i_3_) {
							client.anIntArray9065[i_4_] = i_6_ | 0x520000 | 0x13000000;
							client.anIntArray9050[i_4_] = i_9_ | 0x530000;
							i_4_ = 1 + i_4_ & 0xfff;
							is[Class85.anInt712 * -127654579][i_6_][i_9_] = i_3_;
						}
						if ((i_6_ + 1 < client.aClass304_9030.method2990(-1486452349)) && i_3_ != (is[-127654579 * Class85.anInt712][1 + i_6_][i_9_]) && ((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_6_][i_9_]) & 0x4) == 0 && 0 == ((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_6_ + 1][i_9_ - 1]) & 0x4)) {
							client.anIntArray9065[i_4_] = i_6_ + 1 | 0x520000 | ~0x6dffffff;
							client.anIntArray9050[i_4_] = i_9_ | 0x530000;
							i_4_ = 1 + i_4_ & 0xfff;
							is[Class85.anInt712 * -127654579][1 + i_6_][i_9_] = i_3_;
						}
					}
					i_9_--;
					if ((1 + i_6_ < client.aClass304_9030.method2990(-1834484623)) && (is[Class85.anInt712 * -127654579][i_6_ + 1][i_9_] != i_3_)) {
						client.anIntArray9065[i_4_] = 1 + i_6_ | 0x920000 | 0x53000000;
						client.anIntArray9050[i_4_] = i_9_ | 0x930000;
						i_4_ = 1 + i_4_ & 0xfff;
						is[Class85.anInt712 * -127654579][i_6_ + 1][i_9_] = i_3_;
					}
					if (--i_9_ >= 0) {
						if (i_6_ - 1 >= 0 && (is[Class85.anInt712 * -127654579][i_6_ - 1][i_9_]) != i_3_ && ((class281.aByteArrayArrayArray2916[-127654579 * Class85.anInt712][i_6_][i_9_]) & 0x4) == 0 && ((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_6_ - 1][1 + i_9_]) & 0x4) == 0) {
							client.anIntArray9065[i_4_] = i_6_ - 1 | 0xd20000 | 0x12000000;
							client.anIntArray9050[i_4_] = i_9_ | 0xd30000;
							i_4_ = 1 + i_4_ & 0xfff;
							is[-127654579 * Class85.anInt712][i_6_ - 1][i_9_] = i_3_;
						}
						if (i_3_ != is[-127654579 * Class85.anInt712][i_6_][i_9_]) {
							client.anIntArray9065[i_4_] = i_6_ | 0xd20000 | ~0x6cffffff;
							client.anIntArray9050[i_4_] = i_9_ | 0xd30000;
							i_4_ = i_4_ + 1 & 0xfff;
							is[-127654579 * Class85.anInt712][i_6_][i_9_] = i_3_;
						}
						if ((1 + i_6_ < client.aClass304_9030.method2990(-1677778006)) && i_3_ != (is[-127654579 * Class85.anInt712][i_6_ + 1][i_9_]) && ((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_6_][i_9_]) & 0x4) == 0 && ((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_6_ + 1][1 + i_9_]) & 0x4) == 0) {
							client.anIntArray9065[i_4_] = i_6_ + 1 | 0x920000 | ~0x2dffffff;
							client.anIntArray9050[i_4_] = i_9_ | 0x930000;
							i_4_ = 1 + i_4_ & 0xfff;
							is[-127654579 * Class85.anInt712][1 + i_6_][i_9_] = i_3_;
						}
					}
				}
			}
			if (-1000000 != client.anIntArray9108[i]) {
				client.anIntArray9108[i] += 40;
				client.anIntArray8973[i] -= 512;
				client.anIntArray8952[i] += 512;
				client.anIntArray9169[i] += 512;
				client.anIntArray9112[i] -= 512;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zm.ix(").append(')').toString());
		}
	}

	static void method1147(Class348 class348, int i, int i_25_, int i_26_, Class387 class387, int i_27_) {
		try {
			if (class387 != null)
				class348.method4020(i, i_25_, i_26_, class387.N(), class387.RA(), class387.ya(), class387.YA(), class387.o(), class387.AA(), class387.ha());
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zm.ga(").append(')').toString());
		}
	}
}
