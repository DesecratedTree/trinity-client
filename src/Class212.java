/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class212 implements Interface10 {
	public int anInt6531;
	static int anInt6532;
	public static String aString6533;

	public Class198 method160() {
		return Class198.aClass198_1914;
	}

	public Class198 method159(byte i) {
		try {
			return Class198.aClass198_1914;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ix.j(").append(')').toString());
		}
	}

	public Class198 method161() {
		return Class198.aClass198_1914;
	}

	Class212(int i) {
		anInt6531 = -823748971 * i;
	}

	static final void method2224(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1328 = Class288.method2886(string, class430, 1929506200);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ix.nz(").append(')').toString());
		}
	}

	static final void method2225(int i) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub20_7889.method5807((byte) 43) == 2) {
				byte[][][] is = client.aClass304_9030.method2999(-580390108);
				byte i_0_ = (byte) (-500310177 * client.anInt9092 - 4 & 0xff);
				int i_1_ = (client.anInt9092 * -500310177 % client.aClass304_9030.method2990(-1204303899));
				for (int i_2_ = 0; i_2_ < 4; i_2_++) {
					for (int i_3_ = 0; i_3_ < client.aClass304_9030.method3033((byte) -26); i_3_++)
						is[i_2_][i_1_][i_3_] = i_0_;
				}
				if (-127654579 * Class85.anInt712 != 3) {
					for (int i_4_ = 0; i_4_ < 2; i_4_++) {
						client.anIntArray9108[i_4_] = -1000000;
						client.anIntArray8973[i_4_] = 1000000;
						client.anIntArray8952[i_4_] = 0;
						client.anIntArray9112[i_4_] = 1000000;
						client.anIntArray9169[i_4_] = 0;
					}
					Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
					int i_5_ = (int) class260.aFloat2716;
					int i_6_ = (int) class260.aFloat2711;
					Class281 class281 = client.aClass304_9030.method2995(1488360876);
					Class356 class356 = client.aClass304_9030.method3023(-400722441);
					while_68_: do {
						if (-1551406343 * Class147.anInt1621 == 4 || 2104837609 * Class457.anInt6844 != -1) {
							if (4 != -1551406343 * Class147.anInt1621) {
								i_5_ = 2104837609 * Class457.anInt6844;
								i_6_ = Class439.anInt4456 * -236470321;
							}
							if (((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_5_ >> 9][i_6_ >> 9]) & 0x4) != 0) {
								Class95_Sub13.method1146(class356.aClass340ArrayArrayArray3653, 0, i_5_ >> 9, i_6_ >> 9, false, -1496633717);
								break;
							}
							int i_7_ = -1795110955 * Class471.anInt5612 >> 9;
							int i_8_ = 1947030235 * Class325_Sub3.anInt7484 >> 9;
							int i_9_ = i_5_ >> 9;
							int i_10_ = i_6_ >> 9;
							if (class281.method2784(i_7_, i_8_, (byte) 99)) {
								int i_11_ = (Class431.method5342(-1795110955 * Class471.anInt5612, 1947030235 * Class325_Sub3.anInt7484, 3, 1996761881));
								if (2005017147 * Gfx.anInt578 >= i_11_)
									Class95_Sub13.method1146(class356.aClass340ArrayArrayArray3653, 1, i_7_, i_8_, false, -1496633717);
								break;
							}
							if (Class321.anInt7018 * -1875448275 < 2560) {
								int i_12_;
								if (i_9_ > i_7_)
									i_12_ = i_9_ - i_7_;
								else
									i_12_ = i_7_ - i_9_;
								int i_13_;
								if (i_10_ > i_8_)
									i_13_ = i_10_ - i_8_;
								else
									i_13_ = i_8_ - i_10_;
								if (i_12_ == 0 && i_13_ == 0 || i_12_ <= -client.aClass304_9030.method2990(-1984917279) || i_12_ >= client.aClass304_9030.method2990(-1827128951) || i_13_ <= -client.aClass304_9030.method3033((byte) -9) || i_13_ >= client.aClass304_9030.method3033((byte) -50)) {
									Class381 class381 = client.aClass304_9030.method3022(937096139);
									Class207.method2195(new StringBuilder().append(i_7_).append(Class215.aString2081).append(i_8_).append(" ").append(i_9_).append(Class215.aString2081).append(i_10_).append(" ").append(class381.gameSceneBaseX * -1261027839).append(Class215.aString2081).append(-1542584207 * class381.gameSceneBaseY).toString(), new RuntimeException(), -306254718);
									break;
								}
								if (i_12_ > i_13_) {
									int i_14_ = 65536 * i_13_ / i_12_;
									int i_15_ = 32768;
									for (;;) {
										if (i_9_ == i_7_)
											break while_68_;
										if (i_7_ < i_9_)
											i_7_++;
										else if (i_7_ > i_9_)
											i_7_--;
										if (((class281.aByteArrayArrayArray2916[-127654579 * Class85.anInt712][i_7_][i_8_]) & 0x4) != 0) {
											Class95_Sub13.method1146((class356.aClass340ArrayArrayArray3653), 1, i_7_, i_8_, false, -1496633717);
											break while_68_;
										}
										i_15_ += i_14_;
										if (i_15_ >= 65536) {
											i_15_ -= 65536;
											if (i_8_ < i_10_)
												i_8_++;
											else if (i_8_ > i_10_)
												i_8_--;
											if (((class281.aByteArrayArrayArray2916[(-127654579 * Class85.anInt712)][i_7_][i_8_]) & 0x4) != 0)
												break;
										}
									}
									Class95_Sub13.method1146(class356.aClass340ArrayArrayArray3653, 1, i_7_, i_8_, false, -1496633717);
								} else {
									int i_16_ = 65536 * i_12_ / i_13_;
									int i_17_ = 32768;
									for (;;) {
										if (i_10_ == i_8_)
											break while_68_;
										if (i_8_ < i_10_)
											i_8_++;
										else if (i_8_ > i_10_)
											i_8_--;
										if (((class281.aByteArrayArrayArray2916[Class85.anInt712 * -127654579][i_7_][i_8_]) & 0x4) != 0) {
											Class95_Sub13.method1146((class356.aClass340ArrayArrayArray3653), 1, i_7_, i_8_, false, -1496633717);
											break while_68_;
										}
										i_17_ += i_16_;
										if (i_17_ >= 65536) {
											i_17_ -= 65536;
											if (i_7_ < i_9_)
												i_7_++;
											else if (i_7_ > i_9_)
												i_7_--;
											if (0 != ((class281.aByteArrayArrayArray2916[(-127654579 * Class85.anInt712)][i_7_][i_8_]) & 0x4))
												break;
										}
									}
									Class95_Sub13.method1146(class356.aClass340ArrayArrayArray3653, 1, i_7_, i_8_, false, -1496633717);
								}
							}
						} else {
							int i_18_ = (Class431.method5342(Class471.anInt5612 * -1795110955, 1947030235 * Class325_Sub3.anInt7484, Class85.anInt712 * -127654579, 1996761881));
							if (i_18_ - Gfx.anInt578 * 2005017147 < 3200 && ((class281.aByteArrayArrayArray2916[-127654579 * Class85.anInt712][Class471.anInt5612 * -1795110955 >> 9][(Class325_Sub3.anInt7484 * 1947030235 >> 9)]) & 0x4) != 0)
								Class95_Sub13.method1146(class356.aClass340ArrayArrayArray3653, 1, Class471.anInt5612 * -1795110955 >> 9, 1947030235 * Class325_Sub3.anInt7484 >> 9, false, -1496633717);
						}
					} while (false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ix.ig(").append(')').toString());
		}
	}

	static void method2226(Class_ra class_ra, int i, int i_19_, int i_20_, int i_21_, int i_22_, Class263 class263, Class524 class524, String string, int i_23_) {
		try {
			int i_24_ = (255 - -1284398501 * Class333.anInt3361 - Class484.anInt5809 * -808857287);
			if (i_24_ < 0)
				i_24_ = 0;
			if (null == Class313.aClass61_6650 || Class146.aClass61_1614 == null) {
				if (Class540.aClass280_6249.method2750((Class513.anInt5965 * 350647061), -1962688676) && Class540.aClass280_6249.method2750((1270039645 * (Class170.anInt1725)), 1982843426)) {
					Class313.aClass61_6650 = class_ra.bw(Class53.method643((Class540.aClass280_6249), (Class513.anInt5965 * 350647061), 0), true);
					Class87 class87 = Class53.method643(Class540.aClass280_6249, 1270039645 * Class170.anInt1725, 0);
					Class146.aClass61_1614 = class_ra.bw(class87, true);
					class87.method998();
					Class448.aClass61_5554 = class_ra.bw(class87, true);
				} else
					class_ra.B(i, i_19_, i_20_, i_22_, i_24_ << 24 | Class513.anInt5964 * 1977663603, 1);
			}
			if (null != Class313.aClass61_6650 && Class146.aClass61_1614 != null) {
				int i_25_ = ((i_20_ - Class146.aClass61_1614.method681() * 2) / Class313.aClass61_6650.method681());
				for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
					Class313.aClass61_6650.method687((i + Class146.aClass61_1614.method681() + i_26_ * Class313.aClass61_6650.method681()), i_19_);
				Class146.aClass61_1614.method687(i, i_19_);
				Class448.aClass61_5554.method687(i_20_ + i - Class448.aClass61_5554.method681(), i_19_);
			}
			class263.method2594(string, i + 3, (i_19_ + class524.anInt6033 * -2093225349 + ((20 - -2093225349 * class524.anInt6033) / 2)), -1150764535 * Class451.anInt6643 | ~0xffffff, -1, 215745955);
			class_ra.B(i, i_19_ + i_22_, i_20_, i_21_ - i_22_, i_24_ << 24 | Class513.anInt5964 * 1977663603, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ix.ae(").append(')').toString());
		}
	}
}
