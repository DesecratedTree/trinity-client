/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class331 {
	public static Class331 aClass331_3343 = new Class331();
	static Class331 aClass331_3344 = new Class331();
	static Class331 aClass331_3345 = new Class331();

	Class331() {
		/* empty */
	}

	static final void method3874(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class372 class372 = Class79.aClass380_666.method4387(i_0_, (byte) -101);
			if (null == class372.aString3909)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = class372.aString3909;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nu.aoc(").append(')').toString());
		}
	}

	static final void method3875(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			boolean bool = true;
			if (i_1_ < 0)
				bool = 0 == (1 + i_1_) % 4;
			else if (i_1_ < 1582)
				bool = 0 == i_1_ % 4;
			else if (i_1_ % 4 != 0)
				bool = false;
			else if (0 != i_1_ % 100)
				bool = true;
			else if (i_1_ % 400 != 0)
				bool = false;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nu.ams(").append(')').toString());
		}
	}

	static final void method3876(short i) {
		try {
			if (1788170519 * client.anInt9026 > 1) {
				client.anInt9026 -= 473233063;
				client.anInt9208 = 1439714889 * client.anInt9268;
			}
			if (client.aClass1_9025.aBoolean37) {
				client.aClass1_9025.aBoolean37 = false;
				Class291_Sub1.method2907(91912557);
			} else {
				if (!Class484.aBoolean5782)
					Class_ta.method5676(1324006253);
				for (int i_2_ = 0; i_2_ < 100; i_2_++) {
					if (!Class432_Sub1_Sub4_Sub1.method5539(client.aClass1_9025, -1379939382)) {
						if (i >= 255) {
							/* empty */
						}
						break;
					}
				}
				if (-296919301 * client.anInt8995 == 1) {
					while (Class513.method6196(-895388267)) {
						Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2563, (client.aClass1_9025.aClass488_22), 926655254);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 62);
						int i_3_ = (-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset));
						Class12.method435((class330_sub34.aClass330_Sub46_Sub2_7729), (byte) 0);
						class330_sub34.aClass330_Sub46_Sub2_7729.method3751(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_3_, -2065658084);
						client.aClass1_9025.method378(class330_sub34, -1404587260);
					}
					if (null != Class95_Sub5.aClass422_7146) {
						if (1908091451 * Class95_Sub5.aClass422_7146.anInt4319 != -1) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2561, (client.aClass1_9025.aClass488_22), 1928404374);
							if (null == Class412.aGarbageCollectorMXBean4257 || !Class412.aGarbageCollectorMXBean4257.isValid()) {
								try {
									Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
									while (iterator.hasNext()) {
										GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
										if (garbagecollectormxbean.isValid()) {
											Class412.aGarbageCollectorMXBean4257 = garbagecollectormxbean;
											client.aLong9153 = 3504572913697504947L;
											client.aLong9267 = 3760833418005358083L;
										}
									}
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							long l = Class312.method3111((byte) 108);
							int i_4_ = -1;
							if (Class412.aGarbageCollectorMXBean4257 != null) {
								long l_5_ = Class412.aGarbageCollectorMXBean4257.getCollectionTime();
								if (-1L != (7196916596642827093L * client.aLong9267)) {
									long l_6_ = l_5_ - (7196916596642827093L * client.aLong9267);
									long l_7_ = l - (client.aLong9153 * 1905655185252179845L);
									if (l_7_ != 0L)
										i_4_ = (int) (100L * l_6_ / l_7_);
								}
								client.aLong9267 = l_5_ * -3760833418005358083L;
								client.aLong9153 = l * -3504572913697504947L;
							}
							class330_sub34.aClass330_Sub46_Sub2_7729.addByteS(client.anInt6603 * 2061800443, 2122635192);
							class330_sub34.aClass330_Sub46_Sub2_7729.addByteS(i_4_, 1314294435);
							class330_sub34.aClass330_Sub46_Sub2_7729.addShortA((1908091451 * Class95_Sub5.aClass422_7146.anInt4319), -1157074887);
							client.aClass1_9025.method378(class330_sub34, -517901652);
							Class95_Sub5.aClass422_7146 = null;
							Class198.aLong1925 = -8034545742671189607L * (30000L + l);
						}
					} else if (Class312.method3111((byte) 47) >= Class198.aLong1925 * -3642002920351573335L)
						Class95_Sub5.aClass422_7146 = client.aClass423_9029.method5298((Class507.aClass498_5930.aString5886), -1556529629);
					if (!Loader.DISABLE_USELESS_PACKETS) {
						Class198.method2153(1711899375);
					}
					Class462.method5702(1228581246);
					Class330_Sub44 class330_sub44 = ((Class330_Sub44) client.aClass471_8997.method5869(539664854));
					if (client.aClass304_9030.method3023(-400722441) != null) {
						if (3 == -1551406343 * Class147.anInt1621)
							Class250.method2520((byte) -99);
						else if (-1551406343 * Class147.anInt1621 == 1)
							Class353.method4078((byte) 42);
					}
					if (client.aBoolean9074)
						client.aBoolean9074 = false;
					else
						client.aFloat9124 /= 2.0F;
					if (client.aBoolean9075)
						client.aBoolean9075 = false;
					else
						client.aFloat9072 /= 2.0F;
					if (Class353.method4076((byte) -43))
						Class108.method1350(316677539);
					else {
						try {
							if (-1551406343 * Class147.anInt1621 != 2) {
								Class401_Sub1.aClass145_Sub1_8249.method1673(Class130.aClass130_1495, (byte) 108);
								if (Class401_Sub1.aClass145_Sub1_8249.method1707(1832355563) == null)
									Class401_Sub1.aClass145_Sub1_8249.method1674(Class136.aClass136_1524, false, 1213337437);
								if (Class401_Sub1.aClass145_Sub1_8249.method1715(-1340050610) == null)
									Class401_Sub1.aClass145_Sub1_8249.method1696(Class146.aClass146_1607, false, (byte) -18);
								if (Class401_Sub1.aClass145_Sub1_8249.method1693(-898154364) != Class136.aClass136_1524)
									Class401_Sub1.aClass145_Sub1_8249.method1674(Class136.aClass136_1524, false, 1147045339);
								Class401_Sub1.aClass145_Sub1_8249.method1678(Class260.method2577(99999.0F, 99999.0F, 99999.0F), (byte) -43);
								Class401_Sub1.aClass145_Sub1_8249.method1684((Class260.method2577(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)), (byte) -20);
								Class166_Sub1 class166_sub1 = ((Class166_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1707(1828614637));
								Class381 class381 = client.aClass304_9030.method3022(-998954287);
								class166_sub1.method1997((Class512.method6189(-127654579 * Class85.anInt712, (-1795110955 * Class471.anInt5612 + class381.gameSceneBaseX * -1401159168), -(Gfx.anInt578 * 2005017147), (1947030235 * Class325_Sub3.anInt7484 + 470868480 * class381.gameSceneBaseY), 2009420278)), (byte) 101);
								if (Class401_Sub1.aClass145_Sub1_8249.method1718(1736826387) != Class146.aClass146_1607)
									Class401_Sub1.aClass145_Sub1_8249.method1696(Class146.aClass146_1607, false, (byte) -3);
								Class401_Sub1.aClass145_Sub1_8249.method1716(Class260.method2577(99999.0F, 99999.0F, 99999.0F), -398585119);
								Class401_Sub1.aClass145_Sub1_8249.method1676((Class260.method2577(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)), -224519221);
								Class475_Sub4 class475_sub4 = ((Class475_Sub4) Class401_Sub1.aClass145_Sub1_8249.method1715(1605914806));
								class475_sub4.method5956(Class263_Sub2.myPlayer.method79(694177009), -545306617);
							}
							Class401_Sub1.aClass145_Sub1_8249.method1677((float) (Class312.method3111((byte) 96) - (1191391766335198033L * Class483.aLong5774)) / 1000.0F, (client.aClass304_9030.method2996(-127654579 * Class85.anInt712, 1875135057)), (client.aClass304_9030.method3001((byte) 124).anIntArrayArrayArray2793), -276171327);
							Class483.aLong5774 = (Class312.method3111((byte) 90) * -2300878542481582671L);
						} catch (Exception_Sub4 exception_sub4) {
							/* empty */
						}
					}
					Class159_Sub1.method1875(-1375405766);
					if (1 == client.anInt8995 * -296919301) {
						client.aClass304_9030.method3008(1098521028).method4589(client.aClass304_9030, 293125111);
						Class64.method776(2094664761);
						Class208.method2207(-1935357213);
						if (-1552893151 * client.anInt9199 > 10)
							((Class1) client.aClass1_9025).anInt30 += 384801153;
						if ((-1933924735 * ((Class1) client.aClass1_9025).anInt30) > 2250)
							Class291_Sub1.method2907(-805603873);
						else {
							if (client.anInt8987 * 1909266069 == 2) {
								Class76_Sub2.method911(655177390);
								Class334.method3933((byte) -100);
							} else if (Class274_Sub1.aClass411_7413.anInterface20_4245.method283(class330_sub44, client.anInterface18Array9004, 1129657189 * client.anInt9003, Class238.aClass355_2583, (byte) 26))
								Class10.method426(false, 609697129);
							else {
								if (client.anInt8987 * 1909266069 == 4 && (Class263_Sub2.method2623(-358951611 * client.anInt9265, -2031927868))) {
									client.aClass304_9030.method3026(new Class300(OutgoingPacketManager.aClass310_3212, null), 1977327619);
									client.anInt8987 = 367267383;
								}
								if (3 == client.anInt8987 * 1909266069 && -296919301 * client.anInt8995 != 16) {
									Class96.aClass497_857.method6100(65280);
									client.anInt8987 = 0;
									client.anInt9040 = client.anInt8981 * 1274188015;
									client.anInt9041 = 0;
									Class423.method5301(-1840397717);
								}
								if (0 == 1909266069 * client.anInt8987) {
									int i_8_ = (822953439 * client.anInt8981 - -644040175 * client.anInt9040);
									while_85_: do {
										if (client.anInt9041 * 1554816407 < (Class467.aClass95Array5599).length) {
											do {
												Class95 class95 = (Class467.aClass95Array5599[(client.anInt9041 * 1554816407)]);
												if ((class95.anInt851 * -277013713) > i_8_) {
													if (i >= 255) {
														/* empty */
													}
													break while_85_;
												}
												class95.method1095(2139144293);
												if (0 != (1909266069 * client.anInt8987))
													break while_85_;
											} while (((client.anInt9041 += 2064101927) * 1554816407) < (Class467.aClass95Array5599).length);
											if (i >= 255)
												return;
										}
									} while (false);
									if (0 == client.anInt8987 * 1909266069) {
										for (int i_9_ = 0; i_9_ < (Class96.aClass85Array854).length; i_9_++) {
											Class85 class85 = (Class96.aClass85Array854[i_9_]);
											if (!class85.aBoolean705) {
												if (i >= 255) {
													/* empty */
												}
											} else {
												Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = (class85.method973(-1160484525));
												Class520.method6223(class432_sub1_sub1_sub1, true, -1427272240);
											}
										}
									}
								}
							}
							Buffer.method3815((byte) 62);
							Class268.method2663(1719688515);
							Class500.method6122((byte) -59);
							client.anInt9210 += 69522641;
							if (client.anInt9062 * 265021783 != 0) {
								client.anInt9101 += -1124284700;
								if (client.anInt9101 * -1661888851 >= 400)
									client.anInt9062 = 0;
							}
							if (Class64.aClass114_569 != null) {
								client.anInt9103 += 199870195;
								if (client.anInt9103 * -1829125573 >= 15) {
									Class404.method4738(Class64.aClass114_569, 595623494);
									Class64.aClass114_569 = null;
								}
							}
							client.aClass114_9200 = null;
							client.aBoolean9175 = false;
							client.aBoolean9170 = false;
							Class354_Sub1.aClass114_7976 = null;
							Class198.method2155(null, -1, -1, 325168703);
							if (!client.aBoolean9150)
								client.anInt9147 = 907195093;
							Class415.method5247(2022060179);
							client.anInt9268 += -654059805;
							if (client.aBoolean9254) {
								System.out.println("Coordinations:"+Class166.anInt1700 * 1277439025+", "+Class464_Sub27.anInt8725 * -574729609+", "+-1192922471 * Class268.anInt2748);
								Class330_Sub34 class330_sub34 = Class238.method2377((OutgoingPacket.CLOSE_WORLD_MAP_PACKET), (client.aClass1_9025.aClass488_22), 1674283186);
								class330_sub34.aClass330_Sub46_Sub2_7729.addInt((Class166.anInt1700 * 1277439025 << 28 | (Class464_Sub27.anInt8725 * -574729609 << 14) | -1192922471 * Class268.anInt2748), (byte) 15);
								client.aClass1_9025.method378(class330_sub34, -505482364);
								client.aBoolean9254 = false;
							}
							for (;;) {
								Class330_Sub42 class330_sub42 = ((Class330_Sub42) client.aClass471_9209.method5867((short) 8960));
								if (class330_sub42 == null) {
									if (i >= 255) {
										/* empty */
									}
									break;
								}
								IComponentDefinitions iComponentDefinitions = class330_sub42.aClass114_7809;
								if (-790144721 * iComponentDefinitions.anInt1287 >= 0) {
									IComponentDefinitions class114_10_ = Class95.method1101((861085587 * (iComponentDefinitions.anInt1211)), 2007161054);
									if (null == class114_10_ || (null == class114_10_.aClass114Array1347) || (-790144721 * iComponentDefinitions.anInt1287 >= (class114_10_.aClass114Array1347).length))
										continue;
									if (iComponentDefinitions != (class114_10_.aClass114Array1347[(-790144721 * iComponentDefinitions.anInt1287)])) {
										if (i < 255)
											continue;
										return;
									}
								}
								Class117.method1423(class330_sub42, -1631194987);
							}
							for (;;) {
								Class330_Sub42 class330_sub42 = ((Class330_Sub42) client.aClass471_9219.method5867((short) 8960));
								if (class330_sub42 == null) {
									if (i >= 255)
										throw new IllegalStateException();
									break;
								}
								IComponentDefinitions iComponentDefinitions = class330_sub42.aClass114_7809;
								if (-790144721 * iComponentDefinitions.anInt1287 >= 0) {
									IComponentDefinitions class114_11_ = Class95.method1101(((iComponentDefinitions.anInt1211) * 861085587), 1681843331);
									if (class114_11_ == null || (null == class114_11_.aClass114Array1347) || (-790144721 * iComponentDefinitions.anInt1287 >= (class114_11_.aClass114Array1347).length))
										continue;
									if ((class114_11_.aClass114Array1347[-790144721 * iComponentDefinitions.anInt1287]) != iComponentDefinitions) {
										if (i < 255)
											continue;
										return;
									}
								}
								Class117.method1423(class330_sub42, -1631194987);
							}
							for (;;) {
								Class330_Sub42 class330_sub42 = ((Class330_Sub42) client.aClass471_9280.method5867((short) 8960));
								if (null == class330_sub42) {
									if (i >= 255)
										throw new IllegalStateException();
									break;
								}
								IComponentDefinitions iComponentDefinitions = class330_sub42.aClass114_7809;
								if (-790144721 * iComponentDefinitions.anInt1287 >= 0) {
									IComponentDefinitions class114_12_ = Class95.method1101(((iComponentDefinitions.anInt1211) * 861085587), 452721389);
									if (class114_12_ == null || (class114_12_.aClass114Array1347 == null) || (iComponentDefinitions.anInt1287 * -790144721 >= (class114_12_.aClass114Array1347).length))
										continue;
									if ((class114_12_.aClass114Array1347[iComponentDefinitions.anInt1287 * -790144721]) != iComponentDefinitions) {
										if (i < 255)
											continue;
										return;
									}
								}
								Class117.method1423(class330_sub42, -1631194987);
							}
							if (Class354_Sub1.aClass114_7976 == null)
								client.anInt9179 = 0;
							if (client.aClass114_9165 != null)
								Class138.method1606((byte) 1);
							Class157.method1830(-1404292361);
							if (-2051927139 * client.anInt9182 > 0 && Class238.aClass355_2583.isKeyHeld(82, 1087324266) && Class238.aClass355_2583.isKeyHeld(81, 1101561335) && 0 != 40356559 * client.mouseNotches) {
								int i_13_ = ((Class263_Sub2.myPlayer.aByte8658) - 40356559 * client.mouseNotches);
								if (i_13_ < 0)
									i_13_ = 0;
								else if (i_13_ > 3)
									i_13_ = 3;
								Class381 class381 = client.aClass304_9030.method3022(-1017473696);
								Class144.method1671(i_13_, ((Class263_Sub2.myPlayer.anIntArray10018[0]) + -1261027839 * class381.gameSceneBaseX), (class381.gameSceneBaseY * -1542584207 + (Class263_Sub2.myPlayer.anIntArray10059[0])), -80060749);
							}
							for (int i_14_ = 0; i_14_ < 5; i_14_++)
								client.anIntArray9046[i_14_]++;
							if (client.aBoolean9206 && (7469708061286789973L * client.aLong8990 < Class312.method3111((byte) 45) - 60000L))
								Class330_Sub11.method3291(-1726849227);
							for (Class325_Sub5 class325_sub5 = ((Class325_Sub5) client.aClass467_9260.method5854(-216609499)); null != class325_sub5; class325_sub5 = ((Class325_Sub5) client.aClass467_9260.method5857(-1964236973))) {
								if ((long) ((((Class325_Sub5) class325_sub5).anInt7487) * -1877380321) < (Class312.method3111((byte) 94) / 1000L - 5L)) {
									if ((((Class325_Sub5) class325_sub5).aShort7489) > 0)
										Class556.method6406(5, 0, "", "", "", new StringBuilder().append(((Class325_Sub5) class325_sub5).aString7488).append(Class526.aClass526_6165.method6257(Class429.aClass454_4369, 991479434)).toString(), -1791250225);
									if (0 == (((Class325_Sub5) class325_sub5).aShort7489))
										Class556.method6406(5, 0, "", "", "", new StringBuilder().append(((Class325_Sub5) class325_sub5).aString7488).append(Class526.aClass526_6159.method6257(Class429.aClass454_4369, 991479434)).toString(), -1650728746);
									class325_sub5.method3204(209569057);
								}
							}
							client.anInt9197 += -560717379;
							if (client.anInt9197 * -2036653675 > 503) {
								client.anInt9197 = 0;
								int i_15_ = (int) (Math.random() * 8.0);
								if ((i_15_ & 0x1) == 1)
									client.anInt9156 += 1528626021 * client.anInt9055;
								if (2 == (i_15_ & 0x2))
									client.anInt9056 += -1377068409 * client.anInt9057;
								if ((i_15_ & 0x4) == 4)
									client.anInt9058 += 1566921477 * client.anInt9168;
							}
							if (-1001744883 * client.anInt9156 < -52)
								client.anInt9055 = 1778394050;
							if (client.anInt9156 * -1001744883 > 54)
								client.anInt9055 = -1778394050;
							if (1012106921 * client.anInt9056 < -57)
								client.anInt9057 = -899867202;
							if (client.anInt9056 * 1012106921 > 64)
								client.anInt9057 = 899867202;
							if (-630459895 * client.anInt9058 < -40)
								client.anInt9168 = -1436749147;
							if (client.anInt9058 * -630459895 > 44)
								client.anInt9168 = 1436749147;
							client.anInt9131 += -63549801;
							if (client.anInt9131 * 2110656807 > 503) {
								client.anInt9131 = 0;
								int i_16_ = (int) (Math.random() * 8.0);
								if (1 == (i_16_ & 0x1))
									client.anInt9149 += -1177904145 * client.anInt8978;
								if (2 == (i_16_ & 0x2))
									client.anInt9063 += 271502349 * client.anInt9049;
							}
							if (-603680235 * client.anInt9149 < -61)
								client.anInt8978 = 411704102;
							if (client.anInt9149 * -603680235 > 64)
								client.anInt8978 = -411704102;
							if (client.anInt9063 * 1113850905 < -20)
								client.anInt9049 = 1610041741;
							if (client.anInt9063 * 1113850905 > 10)
								client.anInt9049 = -1610041741;
							client.aClass1_9025.anInt29 += -1349860145;
							if (936362543 * client.aClass1_9025.anInt29 > 50) {
								Class330_Sub34 class330_sub34 = Class238.method2377((OutgoingPacket.PING_PACKET), (client.aClass1_9025.aClass488_22), 475273273);
								client.aClass1_9025.method378(class330_sub34, -51491010);
							}
							if (client.aBoolean9114) {
								Class419.method5279(-374810341);
								client.aBoolean9114 = false;
							}
							try {
								client.aClass1_9025.method381(1544190798);
							} catch (IOException ioexception) {
								Class291_Sub1.method2907(-86093097);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nu.gc(").append(')').toString());
		}
	}

	public static int method3877(CharSequence charsequence, int i) {
		try {
			int i_17_ = charsequence.length();
			int i_18_ = 0;
			for (int i_19_ = 0; i_19_ < i_17_; i_19_++)
				i_18_ = ((i_18_ << 5) - i_18_ + ItemEquipDefinitions.method6216(charsequence.charAt(i_19_), -1709325533));
			return i_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nu.n(").append(')').toString());
		}
	}
}
