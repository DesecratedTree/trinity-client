/* Class556 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class556 {
	static int[] anIntArray6385;
	static Class562 aClass562_6386;
	static int anInt6387 = 0;
	static int anInt6388 = 3;
	static int anInt6389 = 0;
	static Class470 aClass470_6390;
	public static String aString6391;
	public static Class510 aClass510_6392;

	Class556() throws Throwable {
		throw new Error();
	}

	static final void method6403(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 758503054);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class424.method5306(iComponentDefinitions, class120, class430, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.om(").append(')').toString());
		}
	}

	static final void method6404(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_1_ < 0 || i_1_ > 5)
				i_1_ = 2;
			Class171.method2046(i_1_, false, -680623927);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.akp(").append(')').toString());
		}
	}

	static final void method6405(Class430 class430, int i) {
		try {
			long l = Class312.method3111((byte) 64);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) (l / 86400000L) - 11745;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.amx(").append(')').toString());
		}
	}

	public static void method6406(int i, int i_2_, String string, String string_3_, String string_4_, String string_5_, int i_6_) {
		try {
			Class81.sendSpeech(i, i_2_, string, string_3_, string_4_, string_5_, null, -1, (byte) 55);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.p(").append(')').toString());
		}
	}

	static final void method6407(Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, -570367591);
			Class120 class120 = Class3.aClass120Array56[i_7_ >> 16];
			Class515.method6205(iComponentDefinitions, class120, class430, -1137296399);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.hz(").append(')').toString());
		}
	}

	public static final void method6408(IComponentDefinitions[] class114s, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_) {
		try {
			Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
			for (int i_16_ = 0; i_16_ < class114s.length; i_16_++) {
				IComponentDefinitions iComponentDefinitions = class114s[i_16_];
				if (null == iComponentDefinitions) {
					if (i_15_ == -1426748510) {
						/* empty */
					}
				} else {
					if (iComponentDefinitions.anInt1211 * 861085587 != i) {
						if (i != -1412584499)
							continue;
						if (iComponentDefinitions != client.aClass114_9165) {
							if (i_15_ != -1426748510)
								continue;
							break;
						}
					}
					int i_17_;
					if (i_14_ == -1) {
						client.aRectangleArray9252[197858337 * client.anInt9213].setBounds(i_12_ + iComponentDefinitions.anInt1329 * -1036156047, i_13_ + -1600154343 * iComponentDefinitions.anInt1209, -681123409 * iComponentDefinitions.anInt1210, iComponentDefinitions.anInt1348 * 694142557);
						i_17_ = (client.anInt9213 += -341217311) * 197858337 - 1;
					} else
						i_17_ = i_14_;
					iComponentDefinitions.anInt1358 = i_17_ * 523871659;
					iComponentDefinitions.anInt1359 = client.anInt8981 * 1132145407;
					if (client.method3918(iComponentDefinitions)) {
						if (i_15_ == -1426748510) {
							/* empty */
						}
					} else {
						if (0 != -853879291 * iComponentDefinitions.anInt1207)
							Class424.method5308(iComponentDefinitions, -745732592);
						int i_18_ = iComponentDefinitions.anInt1329 * -1036156047 + i_12_;
						int i_19_ = i_13_ + iComponentDefinitions.anInt1209 * -1600154343;
						int i_20_ = -84166611 * iComponentDefinitions.anInt1226;
						if (client.aBoolean9161 && ((client.method3924(iComponentDefinitions).anInt7510 * -1700263873) != 0 || 0 == 1849136745 * iComponentDefinitions.anInt1198) && i_20_ > 127)
							i_20_ = 127;
						if (iComponentDefinitions == client.aClass114_9165) {
							if (i != -1412584499 && ((2036851291 * IComponentDefinitions.anInt1174 == iComponentDefinitions.anInt1291 * 1790809361) || (IComponentDefinitions.anInt1327 * -1166511997 == iComponentDefinitions.anInt1291 * 1790809361) || client.method3924(iComponentDefinitions).method3267(516693227))) {
								Class379.aClass114Array3952 = class114s;
								Class430.anInt4399 = i_12_ * 1729772039;
								Class550.anInt6289 = i_13_ * 1222334837;
								continue;
							}
							if (client.aBoolean9178 && client.aBoolean9170) {
								int i_21_ = Class464_Sub23.aClass350_8712.method4030(34823472);
								int i_22_ = Class464_Sub23.aClass350_8712.method4031((short) 24758);
								i_21_ -= client.anInt8994 * 850852017;
								i_22_ -= 1215125603 * client.anInt9054;
								if (i_21_ < client.anInt9171 * -1059134679)
									i_21_ = client.anInt9171 * -1059134679;
								if (-681123409 * iComponentDefinitions.anInt1210 + i_21_ > (client.anInt9171 * -1059134679 + client.anInt9173 * 1647641369))
									i_21_ = (-1059134679 * client.anInt9171 + 1647641369 * client.anInt9173 - -681123409 * iComponentDefinitions.anInt1210);
								if (i_22_ < -1908682901 * client.anInt9172)
									i_22_ = client.anInt9172 * -1908682901;
								if (i_22_ + iComponentDefinitions.anInt1348 * 694142557 > (client.anInt9172 * -1908682901 + -907175705 * client.anInt9174))
									i_22_ = (client.anInt9174 * -907175705 + client.anInt9172 * -1908682901 - iComponentDefinitions.anInt1348 * 694142557);
								if (client.method3924(iComponentDefinitions).method3267(516693227))
									Class524.method6252(i_21_, i_22_, (iComponentDefinitions.anInt1210 * -681123409), (iComponentDefinitions.anInt1348 * 694142557), (byte) 38);
								i_18_ = i_21_;
								i_19_ = i_22_;
							}
							if (1790809361 * iComponentDefinitions.anInt1291 == -1166511997 * IComponentDefinitions.anInt1327)
								i_20_ = 128;
						}
						int i_23_;
						int i_24_;
						int i_25_;
						int i_26_;
						if (1849136745 * iComponentDefinitions.anInt1198 == 2) {
							i_23_ = i_8_;
							i_24_ = i_9_;
							i_25_ = i_10_;
							i_26_ = i_11_;
						} else {
							int i_27_ = i_18_ + -681123409 * iComponentDefinitions.anInt1210;
							int i_28_ = 694142557 * iComponentDefinitions.anInt1348 + i_19_;
							if (1849136745 * iComponentDefinitions.anInt1198 == 9) {
								i_27_++;
								i_28_++;
							}
							i_23_ = i_18_ > i_8_ ? i_18_ : i_8_;
							i_24_ = i_19_ > i_9_ ? i_19_ : i_9_;
							i_25_ = i_27_ < i_10_ ? i_27_ : i_10_;
							i_26_ = i_28_ < i_11_ ? i_28_ : i_11_;
						}
						if (i_23_ < i_25_) {
							if (i_24_ >= i_26_) {
								if (i_15_ == -1426748510) {
									/* empty */
								}
							} else {
								if (0 != -853879291 * iComponentDefinitions.anInt1207) {
									if ((-853879291 * iComponentDefinitions.anInt1207 == -462171043 * IComponentDefinitions.anInt1307) || (iComponentDefinitions.anInt1207 * -853879291 == (IComponentDefinitions.anInt1341 * 624272509))) {
										Class361.aClass_ra3793.method4804();
										Class95_Sub21.method1168(i_18_, i_19_, iComponentDefinitions.anInt1210 * -681123409, 694142557 * iComponentDefinitions.anInt1348, (IComponentDefinitions.anInt1341 * 624272509 == (iComponentDefinitions.anInt1207 * -853879291)), -704632228);
										Class95_Sub1.method1107(i_17_, i_23_, i_24_, i_25_, i_26_, i_18_, i_19_, 446343493);
										Class361.aClass_ra3793.au();
										Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										client.aBooleanArray9230[i_17_] = true;
										continue;
									}
									if ((IComponentDefinitions.anInt1178 * -1713237605 == iComponentDefinitions.anInt1207 * -853879291) && 2 == (1909266069 * client.anInt8987)) {
										if ((iComponentDefinitions.method1396(Class361.aClass_ra3793, (byte) -97)) == null) {
											if (i_15_ == -1426748510)
												throw new IllegalStateException();
										} else {
											Class233.method2362((byte) -18);
											Class233.method2363(Class361.aClass_ra3793, iComponentDefinitions, i_18_, i_19_, -1571986388);
											Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										}
										continue;
									}
									if (IComponentDefinitions.anInt1185 * 543316677 == -853879291 * iComponentDefinitions.anInt1207) {
										Class473.method5914((Class361.aClass_ra3793), i_18_, i_19_, iComponentDefinitions, 1973099486);
										continue;
									}
									if (IComponentDefinitions.anInt1186 * 508882589 == iComponentDefinitions.anInt1207 * -853879291) {
										Class375.method4358(Class361.aClass_ra3793, i_18_, i_19_, iComponentDefinitions, (-421168987 * iComponentDefinitions.anInt1224 % 64), 571378317);
										continue;
									}
									if (190904113 * IComponentDefinitions.anInt1179 == iComponentDefinitions.anInt1207 * -853879291) {
										if ((iComponentDefinitions.method1396(Class361.aClass_ra3793, (byte) -96)) == null) {
											if (i_15_ == -1426748510)
												break;
										} else {
											Class361.aClass_ra3793.method4804();
											Class432_Sub1_Sub1_Sub6.method5516(iComponentDefinitions, i_18_, i_19_, (byte) 103);
											Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										}
										continue;
									}
									if (iComponentDefinitions.anInt1207 * -853879291 == -1879269017 * IComponentDefinitions.anInt1180) {
										Class238.method2375(Class361.aClass_ra3793, Class230.anInterface_ma2446, i_18_, i_19_, -681123409 * iComponentDefinitions.anInt1210, iComponentDefinitions.anInt1348 * 694142557, (short) 7513);
										client.aBooleanArray9230[i_17_] = true;
										Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										continue;
									}
									if (IComponentDefinitions.anInt1181 * 458796745 == -853879291 * iComponentDefinitions.anInt1207) {
										Class516.method6206(Class361.aClass_ra3793, i_18_, i_19_, -681123409 * iComponentDefinitions.anInt1210, iComponentDefinitions.anInt1348 * 694142557, -627186632);
										client.aBooleanArray9230[i_17_] = true;
										Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										continue;
									}
									if (1848926715 * IComponentDefinitions.anInt1343 == -853879291 * iComponentDefinitions.anInt1207) {
										if (client.aBoolean8983 || client.aBoolean8984) {
											Class118.method1430(i_18_, i_19_, iComponentDefinitions, -808973908);
											client.aBooleanArray9230[i_17_] = true;
										}
										continue;
									}
								}
								if (1849136745 * iComponentDefinitions.anInt1198 == 0) {
									if ((-853879291 * iComponentDefinitions.anInt1207 == -1566369725 * IComponentDefinitions.anInt1197) && Class361.aClass_ra3793.cg())
										Class361.aClass_ra3793.db(0, 0, -1969079741 * Class300.anInt3058, -1548608507 * Class146.anInt1615);
									method6408(class114s, 751119487 * iComponentDefinitions.anInt1196, i_23_, i_24_, i_25_, i_26_, i_18_ - (-1526325919 * iComponentDefinitions.anInt1220), i_19_ - (742281531 * iComponentDefinitions.anInt1221), i_17_, bool, 1478353689);
									if (iComponentDefinitions.aClass114Array1219 != null)
										method6408(iComponentDefinitions.aClass114Array1219, (iComponentDefinitions.anInt1196 * 751119487), i_23_, i_24_, i_25_, i_26_, (i_18_ - (-1526325919 * iComponentDefinitions.anInt1220)), i_19_ - (iComponentDefinitions.anInt1221 * 742281531), i_17_, bool, 737385419);
									Class330_Sub48 class330_sub48 = ((Class330_Sub48) (client.aClass497_9284.method6094((long) (751119487 * iComponentDefinitions.anInt1196))));
									if (class330_sub48 != null)
										Class330_Sub38.method3541((class330_sub48.anInt7859 * 856598855), i_23_, i_24_, i_25_, i_26_, i_18_, i_19_, i_17_, (byte) 3);
									if (iComponentDefinitions.anInt1207 * -853879291 == IComponentDefinitions.anInt1197 * -1566369725) {
										if (Class361.aClass_ra3793.cg())
											Class361.aClass_ra3793.ds();
										if (0 == client.anInt8987 * 1909266069) {
											int i_29_ = (1217836457 * client.anInt9044);
											int i_30_ = (client.anInt9045 * -1716898733);
											int i_31_ = (client.anInt9070 * 1130636257);
											int i_32_ = (1616069465 * client.anInt9047);
											if (822953439 * client.anInt8981 < (-1114955027 * client.anInt9043)) {
												float f = ((float) (((client.anInt8981) * 822953439) - (646655779 * (client.anInt8969))) * 1.0F / (float) ((-1114955027 * (client.anInt9043)) - (646655779 * (client.anInt8969))));
												i_29_ = (int) (((float) (-137644505 * (Class119.anInt1398)) * (1.0F - f)) + (f * (float) (1217836457 * client.anInt9044)));
												i_30_ = (int) (((float) (-1716898733 * (client.anInt9045)) * f) + ((float) (1532586421 * (Class166_Sub1.anInt7324)) * (1.0F - f)));
												i_31_ = (int) ((f * (float) ((client.anInt9070) * 1130636257)) + ((1.0F - f) * (float) (-1181075911 * Class404.anInt4160)));
												i_32_ = (int) ((f * (float) ((client.anInt9047) * 1616069465)) + ((1.0F - f) * (float) ((Class554.anInt6378) * 976688875)));
											}
											if (i_29_ > 0)
												Class361.aClass_ra3793.method4789(i_23_, i_24_, i_25_ - i_23_, i_26_ - i_24_, (i_29_ << 24 | i_30_ << 16 | i_31_ << 8 | i_32_), 463754225);
										}
									}
									Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
								}
								if (!client.aBooleanArray9263[i_17_] && -891808043 * client.anInt9218 <= 1) {
									if (i_15_ == -1426748510) {
										/* empty */
									}
								} else if (3 == (1849136745 * iComponentDefinitions.anInt1198)) {
									if (i_20_ == 0) {
										if (iComponentDefinitions.aBoolean1225)
											Class361.aClass_ra3793.B(i_18_, i_19_, (-681123409 * iComponentDefinitions.anInt1210), (694142557 * iComponentDefinitions.anInt1348), (~0xffffff | (iComponentDefinitions.anInt1224 * -421168987)), 0);
										else
											Class361.aClass_ra3793.bl(i_18_, i_19_, (-681123409 * iComponentDefinitions.anInt1210), (iComponentDefinitions.anInt1348 * 694142557), (~0xffffff | (-421168987 * iComponentDefinitions.anInt1224)), 0);
									} else if (iComponentDefinitions.aBoolean1225)
										Class361.aClass_ra3793.B(i_18_, i_19_, iComponentDefinitions.anInt1210 * -681123409, iComponentDefinitions.anInt1348 * 694142557, (255 - (i_20_ & 0xff) << 24 | ((-421168987 * iComponentDefinitions.anInt1224) & 0xffffff)), 1);
									else
										Class361.aClass_ra3793.bl(i_18_, i_19_, -681123409 * iComponentDefinitions.anInt1210, 694142557 * iComponentDefinitions.anInt1348, (255 - (i_20_ & 0xff) << 24 | ((-421168987 * iComponentDefinitions.anInt1224) & 0xffffff)), 1);
								} else if (4 == (1849136745 * iComponentDefinitions.anInt1198)) {
									int i_33_ = 255 - (i_20_ & 0xff);
									if (0 == i_33_) {
										if (i_15_ == -1426748510) {
											/* empty */
										}
									} else {
										Class263 class263 = (iComponentDefinitions.method1390(Class219.aClass230_2183, client.anInterface12_9243, 1114693815));
										if (class263 == null) {
											if (IComponentDefinitions.aBoolean1193)
												Class404.method4738(iComponentDefinitions, 833366986);
										} else {
											int i_34_ = (iComponentDefinitions.anInt1224 * -421168987);
											String string = iComponentDefinitions.aString1266;
											if ((iComponentDefinitions.anInt1335 * -1053848421) != -1) {
												ItemDefinitions itemDefinitions = (aClass510_6392.getItemDefinitions((-1053848421 * iComponentDefinitions.anInt1335), (byte) -115));
												string = itemDefinitions.name;
												if (null == string)
													string = "null";
												if (((itemDefinitions.anInt6736 * 1369390791) == 1 || ((115606283 * iComponentDefinitions.anInt1336) != 1)) && (-1 != (iComponentDefinitions.anInt1336 * 115606283)))
													string = new StringBuilder().append(Class146.method1738(16748608, -849826454)).append(string).append(Class215.aString2079).append(" x").append(Class143.method1663(((iComponentDefinitions.anInt1336) * 115606283), 1807333950)).toString();
											}
											if (-1 != (-1191962979 * iComponentDefinitions.anInt1292)) {
												string = (Class337.method3956((iComponentDefinitions.anInt1292 * -1191962979), 1444458195));
												if (null == string)
													string = "";
											}
											if (iComponentDefinitions == client.aClass114_9078) {
												string = (Class526.aClass526_6188.method6257((Class429.aClass454_4369), 991479434));
												i_34_ = (-421168987 * iComponentDefinitions.anInt1224);
											}
											if (client.aBoolean9164)
												Class361.aClass_ra3793.o(i_18_, i_19_, (iComponentDefinitions.anInt1210 * -681123409) + i_18_, ((694142557 * iComponentDefinitions.anInt1348) + i_19_));
											i_33_ <<= 24;
											if (iComponentDefinitions.aBoolean1357)
												class263.method2611(string, i_18_, i_19_, (-681123409 * iComponentDefinitions.anInt1210), (iComponentDefinitions.anInt1348 * 694142557), i_33_ | i_34_, (iComponentDefinitions.aBoolean1270 ? i_33_ : -1), (iComponentDefinitions.anInt1268 * 654960235), (iComponentDefinitions.anInt1279 * -831570027), client.aRandom9066, (Class382.anInt6680 * -74764097), client.anIntArray8955, Class57.aClass61Array6599, null, -2097010758);
											else
												class263.method2596(string, i_18_, i_19_, (-681123409 * iComponentDefinitions.anInt1210), (694142557 * iComponentDefinitions.anInt1348), i_33_ | i_34_, (iComponentDefinitions.aBoolean1270 ? i_33_ : -1), (654960235 * iComponentDefinitions.anInt1268), (iComponentDefinitions.anInt1279 * -831570027), (-427156389 * iComponentDefinitions.anInt1267), (2077528199 * iComponentDefinitions.anInt1271), Class57.aClass61Array6599, null, null, 0, 0, (byte) 29);
											if (client.aBoolean9164)
												Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										}
									}
								} else if (1849136745 * iComponentDefinitions.anInt1198 == 5) {
									if (iComponentDefinitions.anInt1275 * -732237595 >= 0)
										iComponentDefinitions.method1392(Class341.aClass342_3397, Class446.aClass131_5549, (byte) 14).method3080(Class361.aClass_ra3793, 0, i_18_, i_19_, iComponentDefinitions.anInt1210 * -681123409, 694142557 * iComponentDefinitions.anInt1348, (395219803 * iComponentDefinitions.anInt1259 << 3), (45468891 * iComponentDefinitions.anInt1340 << 3), 0, 0, (byte) 12);
									else {
										Class61 class61;
										if (-1 != (-1053848421 * iComponentDefinitions.anInt1335)) {
											Class408 class408 = (iComponentDefinitions.aBoolean1337 ? (Class263_Sub2.myPlayer.aClass408_10240) : null);
											class61 = (aClass510_6392.method6167(Class361.aClass_ra3793, (-1053848421 * iComponentDefinitions.anInt1335), (115606283 * iComponentDefinitions.anInt1336), (iComponentDefinitions.anInt1232 * -1722421195), (~0xffffff | (-1651839469 * iComponentDefinitions.anInt1233)), (iComponentDefinitions.anInt1255 * 161077829), class408, 1555805803));
										} else if ((-1191962979 * iComponentDefinitions.anInt1292) != -1)
											class61 = (Class121.method1449(Class361.aClass_ra3793, (-1191962979 * iComponentDefinitions.anInt1292), -1266115092));
										else
											class61 = (iComponentDefinitions.method1406(Class361.aClass_ra3793, 1844998142));
										if (null != class61) {
											int i_35_ = class61.method318();
											int i_36_ = class61.method683();
											int i_37_ = 255 - (i_20_ & 0xff);
											if (i_37_ != 0) {
												int i_38_;
												if (-1 == (iComponentDefinitions.anInt1224 * -421168987))
													i_38_ = 16777215;
												else {
													i_38_ = ((-421168987 * (iComponentDefinitions.anInt1224)) & 0xffffff);
													if (i_38_ == 0)
														i_38_ = 16777215;
												}
												i_38_ |= i_37_ << 24;
												boolean bool_39_ = i_38_ != -1;
												if (iComponentDefinitions.aBoolean1355) {
													Class361.aClass_ra3793.o(i_18_, i_19_, (i_18_ + (-681123409 * (iComponentDefinitions.anInt1210))), (i_19_ + (694142557 * (iComponentDefinitions.anInt1348))));
													if ((1434092661 * iComponentDefinitions.anInt1184) != 0) {
														int i_40_ = ((i_35_ - 1 + (-681123409 * (iComponentDefinitions.anInt1210))) / i_35_);
														int i_41_ = (((694142557 * (iComponentDefinitions.anInt1348)) + (i_36_ - 1)) / i_36_);
														for (int i_42_ = 0; i_42_ < i_40_; i_42_++) {
															for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
																if (bool_39_)
																	class61.method686((((float) i_35_ / 2.0F) + (float) (i_42_ * i_35_ + i_18_)), (((float) i_36_ / 2.0F) + (float) (i_36_ * i_43_ + i_19_)), 4096, ((iComponentDefinitions.anInt1184) * 1434092661), 0, i_38_, 1);
																else
																	class61.method695((((float) i_35_ / 2.0F) + (float) (i_35_ * i_42_ + i_18_)), ((float) (i_19_ + i_43_ * i_36_) + ((float) i_36_ / 2.0F)), 4096, ((iComponentDefinitions.anInt1184) * 1434092661));
															}
														}
													} else if (bool_39_)
														class61.method694(i_18_, i_19_, ((iComponentDefinitions.anInt1210) * -681123409), ((iComponentDefinitions.anInt1348) * 694142557), 0, i_38_, 1);
													else
														class61.method721(i_18_, i_19_, (-681123409 * (iComponentDefinitions.anInt1210)), (694142557 * (iComponentDefinitions.anInt1348)));
													Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
												} else if (bool_39_) {
													if ((iComponentDefinitions.anInt1184 * 1434092661) != 0)
														class61.method686((((float) (-681123409 * (iComponentDefinitions.anInt1210)) / 2.0F) + (float) i_18_), ((float) i_19_ + ((float) ((iComponentDefinitions.anInt1348) * 694142557) / 2.0F)), (1847259136 * (iComponentDefinitions.anInt1210) / i_35_), (1434092661 * (iComponentDefinitions.anInt1184)), 0, i_38_, 1);
													else if ((((iComponentDefinitions.anInt1210) * -681123409) != i_35_) || ((694142557 * (iComponentDefinitions.anInt1348)) != i_36_))
														class61.method691(i_18_, i_19_, (-681123409 * (iComponentDefinitions.anInt1210)), (694142557 * (iComponentDefinitions.anInt1348)), 0, i_38_, 1);
													else
														class61.method688(i_18_, i_19_, 0, i_38_, 1);
												} else if (0 != (1434092661 * (iComponentDefinitions.anInt1184)))
													class61.method695(((float) i_18_ + ((float) (-681123409 * (iComponentDefinitions.anInt1210)) / 2.0F)), ((float) i_19_ + ((float) ((iComponentDefinitions.anInt1348) * 694142557) / 2.0F)), (iComponentDefinitions.anInt1210 * 1847259136 / i_35_), (1434092661 * (iComponentDefinitions.anInt1184)));
												else if (((-681123409 * (iComponentDefinitions.anInt1210)) != i_35_) || (i_36_ != ((iComponentDefinitions.anInt1348) * 694142557)))
													class61.method690(i_18_, i_19_, (iComponentDefinitions.anInt1210 * -681123409), (694142557 * (iComponentDefinitions.anInt1348)));
												else
													class61.method687(i_18_, i_19_);
											}
										} else if (IComponentDefinitions.aBoolean1193)
											Class404.method4738(iComponentDefinitions, 1169416470);
									}
								} else if (6 == (1849136745 * iComponentDefinitions.anInt1198)) {
									Class361.aClass_ra3793.method4804();
									client.aClass304_9030.method3008(334372619).method4585((short) -22033);
									Class387 class387 = null;
									int i_44_ = 2048;
									if (1067996733 * iComponentDefinitions.anInt1199 != 0)
										i_44_ |= 0x80000;
									int i_45_ = 0;
									if (-1 != -1053848421 * iComponentDefinitions.anInt1335) {
										ItemDefinitions itemDefinitions = (aClass510_6392.getItemDefinitions((iComponentDefinitions.anInt1335 * -1053848421), (byte) -27));
										if (null != itemDefinitions) {
											itemDefinitions = (itemDefinitions.method6282((115606283 * iComponentDefinitions.anInt1336), (byte) -1));
											class387 = (itemDefinitions.method6281(Class361.aClass_ra3793, i_44_, 1, (iComponentDefinitions.aBoolean1337 ? (Class263_Sub2.myPlayer.aClass408_10240) : null), iComponentDefinitions.aClass477_1344, 0, 0, 0, 0, 1681056721));
											if (class387 != null)
												i_45_ = -class387.YA() >> 1;
											else
												Class404.method4738(iComponentDefinitions, 390168423);
										}
									} else if (-276075115 * iComponentDefinitions.anInt1238 == 3) {
										int i_46_ = -1576413395 * iComponentDefinitions.anInt1239;
										if (i_46_ >= 0 && i_46_ < 2048) {
											Player class432_sub1_sub1_sub1_sub1 = (client.players[i_46_]);
											if ((null != class432_sub1_sub1_sub1_sub1) && ((client.anInt9121 * 1478725729) == i_46_ || ((Class96.method1184((class432_sub1_sub1_sub1_sub1.aString10221), 1826545490)) == (iComponentDefinitions.anInt1240 * -591748167)))) {
												class387 = (iComponentDefinitions.method1402(Class361.aClass_ra3793, i_44_, Class102.aClass362_924, (Class425.aClass169_4344), (Class158_Sub3.aClass553_8875), aClass510_6392, (Class201.aClass436_6511), (Class158.aClass561_6474), (iComponentDefinitions.aClass477_1344), (class432_sub1_sub1_sub1_sub1.aClass408_10240), (byte) 52));
												if (class387 == null && IComponentDefinitions.aBoolean1193)
													Class404.method4738(iComponentDefinitions, 624206877);
											}
										}
									} else if (5 == (-276075115 * iComponentDefinitions.anInt1238)) {
										int i_47_ = iComponentDefinitions.anInt1239 * -1576413395;
										if (i_47_ >= 0 && i_47_ < 2048) {
											Player class432_sub1_sub1_sub1_sub1 = (client.players[i_47_]);
											if ((class432_sub1_sub1_sub1_sub1 != null) && (i_47_ == (client.anInt9121 * 1478725729) || ((Class96.method1184((class432_sub1_sub1_sub1_sub1.aString10221), 1497860706)) == (-591748167 * (iComponentDefinitions.anInt1240)))))
												class387 = (class432_sub1_sub1_sub1_sub1.aClass408_10240.method4762(Class361.aClass_ra3793, i_44_, Class102.aClass362_924, (Class425.aClass169_4344), (Class158_Sub3.aClass553_8875), aClass510_6392, (Class201.aClass436_6511), (Class158.aClass561_6474), (iComponentDefinitions.aClass477_1344), null, null, null, 0, true, (Console.aClass421_4266), (byte) -123));
										}
									} else if (8 == (-276075115 * iComponentDefinitions.anInt1238) || 9 == (iComponentDefinitions.anInt1238 * -276075115)) {
										Class330_Sub1 class330_sub1 = (Class321.method3178((-1576413395 * iComponentDefinitions.anInt1239), false, (short) 19528));
										if (null != class330_sub1)
											class387 = (class330_sub1.method3260(Class361.aClass_ra3793, i_44_, iComponentDefinitions.aClass477_1344, (-591748167 * iComponentDefinitions.anInt1240), (iComponentDefinitions.anInt1238 * -276075115) == 9, (iComponentDefinitions.aBoolean1337 ? (Class263_Sub2.myPlayer.aClass408_10240) : null), (byte) 125));
									} else if (null == iComponentDefinitions.aClass477_1344 || !(iComponentDefinitions.aClass477_1344.method5966(513571361))) {
										class387 = (iComponentDefinitions.method1402(Class361.aClass_ra3793, i_44_, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, null, (Class263_Sub2.myPlayer.aClass408_10240), (byte) 98));
										if (class387 == null && IComponentDefinitions.aBoolean1193)
											Class404.method4738(iComponentDefinitions, 1316518348);
									} else {
										class387 = (iComponentDefinitions.method1402(Class361.aClass_ra3793, i_44_, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, iComponentDefinitions.aClass477_1344, (Class263_Sub2.myPlayer.aClass408_10240), (byte) 26));
										if (null == class387 && IComponentDefinitions.aBoolean1193)
											Class404.method4738(iComponentDefinitions, 734388074);
									}
									if (class387 != null) {
										if (1067996733 * iComponentDefinitions.anInt1199 != 0)
											class387.PA((iComponentDefinitions.anInt1260 * 30958309), (310700929 * iComponentDefinitions.anInt1205), (iComponentDefinitions.anInt1262 * 1294060735), (iComponentDefinitions.anInt1199 * 1067996733));
										int i_48_;
										if (-1329832751 * iComponentDefinitions.anInt1290 > 0)
											i_48_ = (((iComponentDefinitions.anInt1210 * -681123409) << 9) / (iComponentDefinitions.anInt1290 * -1329832751));
										else
											i_48_ = 512;
										int i_49_;
										if (iComponentDefinitions.anInt1256 * 899896193 > 0)
											i_49_ = (((iComponentDefinitions.anInt1348 * 694142557) << 9) / (899896193 * iComponentDefinitions.anInt1256));
										else
											i_49_ = 512;
										int i_50_ = i_18_ + (iComponentDefinitions.anInt1210 * -681123409 / 2);
										int i_51_ = ((694142557 * iComponentDefinitions.anInt1348 / 2) + i_19_);
										if (!iComponentDefinitions.aBoolean1241) {
											i_50_ += i_48_ * (iComponentDefinitions.anInt1247 * -596078455) >> 9;
											i_51_ += i_49_ * (iComponentDefinitions.anInt1315 * -415359471) >> 9;
										}
										client.aClass247_8975.method2460();
										Class361.aClass_ra3793.cw(client.aClass247_8975);
										Class249 class249 = Class361.aClass_ra3793.cz();
										int i_52_ = client.aClass304_9030.method2992(1403532609);
										int i_53_ = client.aClass304_9030.method2993(-809701857);
										i_53_ += (iComponentDefinitions.anInt1354 * -1843384083);
										if (iComponentDefinitions.aBoolean1253) {
											if ((Class147.anInt1621 * -1551406343) == 2) {
												if (iComponentDefinitions.aBoolean1241)
													class249.method2494((float) i_50_, (float) i_51_, (float) i_48_, (float) i_49_, (Class401_Sub1.aClass145_Sub1_8249.method1703(-1917350593)), (Class401_Sub1.aClass145_Sub1_8249.method1704(2115258158)), (float) ((Class300.anInt3058) * -1969079741), (float) (-1548608507 * (Class146.anInt1615)), (float) (-1843384083 * (iComponentDefinitions.anInt1354)));
												else
													class249.method2494((float) i_50_, (float) i_51_, (float) i_48_, (float) i_49_, (Class401_Sub1.aClass145_Sub1_8249.method1703(-1856856284)), (Class401_Sub1.aClass145_Sub1_8249.method1704(-940909231)), (float) (-1969079741 * (Class300.anInt3058)), (float) (-1548608507 * (Class146.anInt1615)), (float) (((iComponentDefinitions.anInt1354) * -1843384083) << 2));
											} else if (iComponentDefinitions.aBoolean1241)
												class249.method2494((float) i_50_, (float) i_51_, (float) i_48_, (float) i_49_, (float) i_52_, (float) i_53_, (float) ((Class300.anInt3058) * -1969079741), (float) ((Class146.anInt1615) * -1548608507), (float) ((iComponentDefinitions.anInt1354) * -1843384083));
											else
												class249.method2494((float) i_50_, (float) i_51_, (float) i_48_, (float) i_49_, (float) i_52_, (float) i_53_, (float) ((Class300.anInt3058) * -1969079741), (float) (-1548608507 * (Class146.anInt1615)), (float) (((iComponentDefinitions.anInt1354) * -1843384083) << 2));
										} else if (2 == (Class147.anInt1621 * -1551406343))
											class249.method2493((float) i_50_, (float) i_51_, (float) i_48_, (float) i_49_, Class401_Sub1.aClass145_Sub1_8249.method1703(-1996713254), Class401_Sub1.aClass145_Sub1_8249.method1704(509964639), (float) (Class300.anInt3058 * -1969079741), (float) (-1548608507 * (Class146.anInt1615)));
										else
											class249.method2493((float) i_50_, (float) i_51_, (float) i_48_, (float) i_49_, (float) i_52_, (float) i_53_, (float) (-1969079741 * (Class300.anInt3058)), (float) (-1548608507 * (Class146.anInt1615)));
										Class361.aClass_ra3793.ci(class249);
										Class361.aClass_ra3793.ba(2, 0);
										if (iComponentDefinitions.aBoolean1254)
											Class361.aClass_ra3793.RA(false);
										if (iComponentDefinitions.aBoolean1241) {
											client.aClass247_8976.method2473(1.0F, 0.0F, 0.0F, (Class257.method2541(-76375931 * iComponentDefinitions.anInt1296)));
											client.aClass247_8976.method2462(0.0F, 1.0F, 0.0F, (Class257.method2541(iComponentDefinitions.anInt1245 * 2005289635)));
											client.aClass247_8976.method2462(0.0F, 0.0F, 1.0F, (Class257.method2541(iComponentDefinitions.anInt1248 * 843208871)));
											client.aClass247_8976.method2474((float) (-596078455 * (iComponentDefinitions.anInt1247)), (float) (iComponentDefinitions.anInt1315 * -415359471), (float) (iComponentDefinitions.anInt1208 * 1105131003));
										} else {
											int i_54_ = (((Class257.anIntArray2683[((-76375931 * iComponentDefinitions.anInt1296) << 3)]) * ((-1843384083 * iComponentDefinitions.anInt1354) << 2)) >> 14);
											int i_55_ = (((Class257.anIntArray2684[(iComponentDefinitions.anInt1296 * -76375931) << 3]) * ((-1843384083 * iComponentDefinitions.anInt1354) << 2)) >> 14);
											client.aClass247_8976.method2473(0.0F, 0.0F, 1.0F, (Class257.method2541(-(843208871 * iComponentDefinitions.anInt1248) << 3)));
											client.aClass247_8976.method2462(0.0F, 1.0F, 0.0F, (Class257.method2541((iComponentDefinitions.anInt1245 * 2005289635) << 3)));
											client.aClass247_8976.method2474((float) ((-106182925 * (iComponentDefinitions.anInt1321)) << 2), (float) (i_45_ + (((1080667159 * (iComponentDefinitions.anInt1243)) << 2) + i_54_)), (float) (((1080667159 * (iComponentDefinitions.anInt1243)) << 2) + i_55_));
											client.aClass247_8976.method2462(1.0F, 0.0F, 0.0F, (Class257.method2541((iComponentDefinitions.anInt1296 * -76375931) << 3)));
										}
										iComponentDefinitions.method1403(Class361.aClass_ra3793, class387, client.aClass247_8976, client.anInt8981 * 822953439, -851394769);
										Class361.aClass_ra3793.method4787(true);
										Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										if (client.aBoolean9164)
											Class361.aClass_ra3793.o(i_18_, i_19_, (i_18_ + (-681123409 * iComponentDefinitions.anInt1210)), i_19_ + (iComponentDefinitions.anInt1348 * 694142557));
										class387.method4475((client.aClass247_8976), null, 1);
										if (!iComponentDefinitions.aBoolean1253 && iComponentDefinitions.aClass388_1361 != null)
											Class361.aClass_ra3793.cm(iComponentDefinitions.aClass388_1361.method4574());
										if (client.aBoolean9164)
											Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										Class361.aClass_ra3793.method4787(false);
										Class361.aClass_ra3793.L();
										Class361.aClass_ra3793.r(i_8_, i_9_, i_10_, i_11_);
										if (iComponentDefinitions.aBoolean1254)
											Class361.aClass_ra3793.RA(true);
									}
								} else if (1849136745 * iComponentDefinitions.anInt1198 == 9) {
									int i_56_;
									int i_57_;
									int i_58_;
									int i_59_;
									if (iComponentDefinitions.aBoolean1228) {
										i_56_ = i_18_;
										i_57_ = (694142557 * iComponentDefinitions.anInt1348 + i_19_);
										i_58_ = i_18_ + (iComponentDefinitions.anInt1210 * -681123409);
										i_59_ = i_19_;
									} else {
										i_56_ = i_18_;
										i_57_ = i_19_;
										i_58_ = i_18_ + (-681123409 * iComponentDefinitions.anInt1210);
										i_59_ = i_19_ + (694142557 * iComponentDefinitions.anInt1348);
									}
									if (iComponentDefinitions.anInt1227 * -1792472805 == 1)
										Class361.aClass_ra3793.br(i_56_, i_57_, i_58_, i_59_, ~0xffffff | (iComponentDefinitions.anInt1224 * -421168987), 0);
									else
										Class361.aClass_ra3793.by(i_56_, i_57_, i_58_, i_59_, ~0xffffff | (iComponentDefinitions.anInt1224 * -421168987), -1792472805 * iComponentDefinitions.anInt1227, 0);
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.kq(").append(')').toString());
		}
	}

	static final void method6409(Class430 class430, byte i) {
		try {
			int i_60_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_60_, 875740189);
			Class120 class120 = Class3.aClass120Array56[i_60_ >> 16];
			Class215.method2237(iComponentDefinitions, class120, class430, (short) 24667);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.cc(").append(')').toString());
		}
	}

	public static void method6410(Buffer class330_sub46, int i, byte i_61_) {
		try {
			Class330_Sub47 class330_sub47 = new Class330_Sub47();
			((Class330_Sub47) class330_sub47).anInt7852 = class330_sub46.readUnsignedByte(1733084739) * -911140095;
			((Class330_Sub47) class330_sub47).anInt7856 = class330_sub46.readInt((byte) 78) * -1326825787;
			((Class330_Sub47) class330_sub47).anIntArray7853 = new int[(((Class330_Sub47) class330_sub47).anInt7852 * -1406671615)];
			((Class330_Sub47) class330_sub47).anIntArray7851 = new int[(((Class330_Sub47) class330_sub47).anInt7852 * -1406671615)];
			((Class330_Sub47) class330_sub47).aFieldArray7855 = new Field[(-1406671615 * ((Class330_Sub47) class330_sub47).anInt7852)];
			((Class330_Sub47) class330_sub47).anIntArray7854 = new int[(((Class330_Sub47) class330_sub47).anInt7852 * -1406671615)];
			((Class330_Sub47) class330_sub47).aMethodArray7857 = new Method[(((Class330_Sub47) class330_sub47).anInt7852 * -1406671615)];
			((Class330_Sub47) class330_sub47).aByteArrayArrayArray7858 = (new byte[((Class330_Sub47) class330_sub47).anInt7852 * -1406671615][][]);
			for (int i_62_ = 0; (i_62_ < ((Class330_Sub47) class330_sub47).anInt7852 * -1406671615); i_62_++) {
				try {
					int i_63_ = class330_sub46.readUnsignedByte(1325383721);
					if (i_63_ == 0 || 1 == i_63_ || 2 == i_63_) {
						String string = class330_sub46.readString(-117351309);
						String string_64_ = class330_sub46.readString(-1162434101);
						int i_65_ = 0;
						if (1 == i_63_)
							i_65_ = class330_sub46.readInt((byte) 108);
						((Class330_Sub47) class330_sub47).anIntArray7853[i_62_] = i_63_;
						((Class330_Sub47) class330_sub47).anIntArray7854[i_62_] = i_65_;
						if (Class121.method1447(string, 1689565292).getClassLoader() == null)
							throw new SecurityException();
						((Class330_Sub47) class330_sub47).aFieldArray7855[i_62_] = Class121.method1447(string, 1893627833).getDeclaredField(string_64_);
					} else if (3 == i_63_ || i_63_ == 4) {
						String string = class330_sub46.readString(993611143);
						String string_66_ = class330_sub46.readString(1483275269);
						int i_67_ = class330_sub46.readUnsignedByte(209844017);
						String[] strings = new String[i_67_];
						for (int i_68_ = 0; i_68_ < i_67_; i_68_++)
							strings[i_68_] = class330_sub46.readString(-688144962);
						String string_69_ = class330_sub46.readString(107419023);
						byte[][] is = new byte[i_67_][];
						if (3 == i_63_) {
							for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
								int i_71_ = class330_sub46.readInt((byte) 33);
								is[i_70_] = new byte[i_71_];
								class330_sub46.readBytes(is[i_70_], 0, i_71_, 1274334002);
							}
						}
						((Class330_Sub47) class330_sub47).anIntArray7853[i_62_] = i_63_;
						Class[] var_classes = new Class[i_67_];
						for (int i_72_ = 0; i_72_ < i_67_; i_72_++)
							var_classes[i_72_] = Class121.method1447(strings[i_72_], 1726089807);
						Class var_class = Class121.method1447(string_69_, 2142212688);
						if (Class121.method1447(string, 1783643801).getClassLoader() == null)
							throw new SecurityException();
						Method[] methods = Class121.method1447(string, 1767355687).getDeclaredMethods();
						Method[] methods_73_ = methods;
						for (int i_74_ = 0; i_74_ < methods_73_.length; i_74_++) {
							Method method = methods_73_[i_74_];
							if (method.getName().equals(string_66_)) {
								Class[] var_classes_75_ = method.getParameterTypes();
								if (var_classes_75_.length == var_classes.length) {
									boolean bool = true;
									for (int i_76_ = 0; i_76_ < var_classes.length; i_76_++) {
										if (var_classes_75_[i_76_] != var_classes[i_76_]) {
											bool = false;
											break;
										}
									}
									if (bool && var_class == method.getReturnType())
										((Class330_Sub47) class330_sub47).aMethodArray7857[i_62_] = method;
								}
							}
						}
						((Class330_Sub47) class330_sub47).aByteArrayArrayArray7858[i_62_] = is;
					}
				} catch (ClassNotFoundException classnotfoundexception) {
					((Class330_Sub47) class330_sub47).anIntArray7851[i_62_] = -1;
				} catch (SecurityException securityexception) {
					((Class330_Sub47) class330_sub47).anIntArray7851[i_62_] = -2;
				} catch (NullPointerException nullpointerexception) {
					((Class330_Sub47) class330_sub47).anIntArray7851[i_62_] = -3;
				} catch (Exception exception) {
					((Class330_Sub47) class330_sub47).anIntArray7851[i_62_] = -4;
				} catch (Throwable throwable) {
					((Class330_Sub47) class330_sub47).anIntArray7851[i_62_] = -5;
				}
			}
			Class520.aClass471_6016.method5878(class330_sub47, (short) 8192);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("x.p(").append(')').toString());
		}
	}
}
