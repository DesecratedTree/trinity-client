/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

public class Class70 {
	int anInt586;
	byte aByte587;
	byte aByte588;
	boolean[] aBooleanArray589;
	int anInt590;
	int anInt591;
	Class481 aClass481_592;
	boolean aBoolean593 = false;
	Class387 aClass387_594;
	Class477 aClass477_595;
	int anInt596;
	boolean aBoolean597;
	int anInt598;
	Class463 aClass463_599;
	boolean aBoolean600;
	Class_na aClass_na601;
	boolean aBoolean602;
	Class388 aClass388_603;
	int anInt604;
	Class432_Sub1 aClass432_Sub1_605;

	public void method802(int i, int i_0_) {
		try {
			((Class70) this).aBoolean597 = true;
			method807(false, i, 1, -1448432559);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.r(").append(')').toString());
		}
	}

	int method803(byte i) {
		try {
			return ((Class70) this).anInt598 * -1235134861;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.j(").append(')').toString());
		}
	}

	void method804(Class481 class481, byte i) {
		try {
			((Class70) this).aClass481_592 = class481;
			((Class70) this).aClass387_594 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.i(").append(')').toString());
		}
	}

	int method805(int i) {
		try {
			return -method803((byte) -5);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.p(").append(')').toString());
		}
	}

	final Class387 method806(Class_ra class_ra, int i, boolean bool, boolean bool_1_, int i_2_) {
		try {
			Class473 class473 = ((Class70) this).aClass463_599.method5705(((((Class70) this).anInt590) * -1290294537), (byte) -119);
			if (null != class473.anIntArray5678)
				class473 = class473.method5900((client.anInt8987 * 1909266069 == 0 ? (Interface29) (Class96.anInterface29_866) : Class158.aClass561_6474), (byte) -64);
			if (class473 == null) {
				method810(class_ra, 512290825);
				((Class70) this).anInt586 = -249619511;
				return null;
			}
			if (!((Class70) this).aBoolean597 && (((Class70) this).anInt586 * -373288569 != class473.anInt5657 * 1996927381)) {
				method807(true, -1, 0, -1992154865);
				((Class70) this).aBoolean602 = false;
				((Class70) this).aClass387_594 = null;
			}
			method811(((Class70) this).aClass432_Sub1_605, -968435666);
			if (bool_1_)
				bool_1_ = bool_1_ & (((Class70) this).aBoolean600 & !((Class70) this).aBoolean602 & Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(1578516356) != 0);
			if (bool && !bool_1_) {
				((Class70) this).anInt586 = 284744451 * class473.anInt5657;
				return null;
			}
			Class260 class260 = (((Class70) this).aClass432_Sub1_605.method5346().aClass260_2606);
			Class356 class356 = client.aClass304_9030.method3023(-400722441);
			if (bool_1_) {
				class356.method4167(((Class70) this).aClass_na601, ((Class70) this).aByte588, (int) class260.aFloat2716, (int) class260.aFloat2711, ((Class70) this).aBooleanArray589, (byte) 8);
				((Class70) this).aBoolean602 = false;
			}
			Class_xa class_xa = class356.aClass_xaArray3676[((Class70) this).aByte588];
			Class_xa class_xa_3_;
			if (((Class70) this).aBoolean593)
				class_xa_3_ = class356.aClass_xaArray3701[0];
			else
				class_xa_3_ = (((Class70) this).aByte588 < 3 ? (class356.aClass_xaArray3676[1 + ((Class70) this).aByte588]) : null);
			Class387 class387 = null;
			if (((Class70) this).aClass477_595.method5966(-572934831)) {
				if (bool_1_)
					i |= 0x40000;
				class387 = (class473.method5898(class_ra, i, (11 != -725103175 * ((Class70) this).anInt591 ? -725103175 * ((Class70) this).anInt591 : 10), (11 == ((Class70) this).anInt591 * -725103175 ? -721521107 * ((Class70) this).anInt604 + 4 : -721521107 * ((Class70) this).anInt604), class_xa, class_xa_3_, (int) class260.aFloat2716, class_xa.method6416((int) class260.aFloat2716, (int) class260.aFloat2711, 1159002493), (int) class260.aFloat2711, ((Class70) this).aClass477_595, ((Class70) this).aClass481_592, -459744035));
				if (class387 != null) {
					if (bool_1_) {
						if (((Class70) this).aBooleanArray589 == null)
							((Class70) this).aBooleanArray589 = new boolean[4];
						((Class70) this).aClass_na601 = class387.ga(((Class70) this).aClass_na601);
						class356.method4185(((Class70) this).aClass_na601, ((Class70) this).aByte588, (int) class260.aFloat2716, (int) class260.aFloat2711, ((Class70) this).aBooleanArray589, (byte) -29);
						((Class70) this).aBoolean602 = true;
					}
					((Class70) this).anInt598 = class387.YA() * -2001584453;
					class387.n();
				} else {
					((Class70) this).aBooleanArray589 = null;
					((Class70) this).aClass_na601 = null;
					((Class70) this).anInt598 = 0;
				}
				((Class70) this).aClass387_594 = null;
			} else if (null == ((Class70) this).aClass387_594 || (((Class70) this).aClass387_594.m() & i) != i || (1996927381 * class473.anInt5657 != ((Class70) this).anInt586 * -373288569)) {
				if (((Class70) this).aClass387_594 != null)
					i |= ((Class70) this).aClass387_594.m();
				Class485 class485 = (class473.method5897(class_ra, i, (11 != ((Class70) this).anInt591 * -725103175 ? -725103175 * ((Class70) this).anInt591 : 10), (((Class70) this).anInt591 * -725103175 == 11 ? -721521107 * ((Class70) this).anInt604 + 4 : -721521107 * ((Class70) this).anInt604), class_xa, class_xa_3_, (int) class260.aFloat2716, class_xa.method6416((int) class260.aFloat2716, (int) class260.aFloat2711, 700060381), (int) class260.aFloat2711, bool_1_, ((Class70) this).aClass481_592, (byte) -65));
				if (null != class485) {
					((Class70) this).aClass387_594 = class387 = (Class387) class485.anObject5824;
					if (bool_1_) {
						((Class70) this).aClass_na601 = (Class_na) class485.anObject5823;
						((Class70) this).aBooleanArray589 = null;
						class356.method4185(((Class70) this).aClass_na601, ((Class70) this).aByte588, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) -6);
						((Class70) this).aBoolean602 = true;
					}
					((Class70) this).anInt598 = class387.YA() * -2001584453;
					class387.n();
				} else {
					((Class70) this).aBooleanArray589 = null;
					((Class70) this).aClass_na601 = null;
					((Class70) this).aClass387_594 = null;
					((Class70) this).anInt598 = 0;
				}
			} else
				class387 = ((Class70) this).aClass387_594;
			((Class70) this).anInt586 = class473.anInt5657 * 284744451;
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.o(").append(')').toString());
		}
	}

	void method807(boolean bool, int i, int i_4_, int i_5_) {
		try {
			int i_6_ = i;
			boolean bool_7_ = false;
			if (i_6_ == -1) {
				Class473 class473 = (((Class70) this).aClass463_599.method5705(((Class70) this).anInt590 * -1290294537, (byte) -60));
				Class473 class473_8_ = class473;
				if (null != class473.anIntArray5678)
					class473 = (class473.method5900((0 == 1909266069 * client.anInt8987 ? (Interface29) Class96.anInterface29_866 : Class158.aClass561_6474), (byte) 115));
				if (class473 == null)
					return;
				if (class473 == class473_8_)
					class473_8_ = null;
				if (class473.method5904((byte) -99)) {
					if (bool && ((Class70) this).aClass477_595.method5966(-1718429659) && class473.method5906(((Class70) this).aClass477_595.method5967((byte) -58), -754593398))
						return;
					if (1996927381 * class473.anInt5657 != -373288569 * ((Class70) this).anInt586)
						bool_7_ = class473.aBoolean5648;
					i_6_ = class473.method5903(-1132870413);
					if (class473.method5909((byte) 39))
						i_4_ = 0;
					else
						i_4_ = 1;
				} else if (null != class473_8_ && class473_8_.method5904((byte) -88)) {
					if (bool && ((Class70) this).aClass477_595.method5966(1185661519) && class473_8_.method5906(((Class70) this).aClass477_595.method5967((byte) -79), -754593398))
						return;
					if (class473.anInt5657 * 1996927381 != -373288569 * ((Class70) this).anInt586)
						bool_7_ = class473_8_.aBoolean5648;
					i_6_ = class473_8_.method5903(-1132870413);
					if (class473_8_.method5909((byte) -2))
						i_4_ = 0;
					else
						i_4_ = 1;
				}
			}
			if (-1 == i_6_)
				((Class70) this).aClass477_595.method5987(-1, false, 789226672);
			else {
				((Class70) this).aClass477_595.method5970(i_6_, 0, i_4_, bool_7_, -2046551360);
				((Class70) this).anInt596 = -1420072865 * client.anInt8981;
				((Class70) this).aBoolean602 = false;
				((Class70) this).aClass387_594 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.l(").append(')').toString());
		}
	}

	boolean method808(int i) {
		try {
			return ((Class70) this).aBoolean600;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.f(").append(')').toString());
		}
	}

	void method809(Class_ra class_ra, Class387 class387, Class247 class247, int i, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_) {
		try {
			Class93[] class93s = class387.method4464();
			Class64[] class64s = class387.method4445();
			if ((null == ((Class70) this).aClass388_603 || ((Class70) this).aClass388_603.aBoolean3992) && (class93s != null || class64s != null)) {
				Class473 class473 = (((Class70) this).aClass463_599.method5705(((Class70) this).anInt590 * -1290294537, (byte) 3));
				if (class473.anIntArray5678 != null)
					class473 = (class473.method5900((0 == 1909266069 * client.anInt8987 ? (Interface29) Class96.anInterface29_866 : Class158.aClass561_6474), (byte) -14));
				if (null != class473)
					((Class70) this).aClass388_603 = Class388.method4571(client.anInt8981 * 822953439, true);
			}
			if (((Class70) this).aClass388_603 != null) {
				class387.method4463(class247);
				if (bool)
					((Class70) this).aClass388_603.method4568(class_ra, (long) (client.anInt8981 * 822953439), class93s, class64s, false);
				else
					((Class70) this).aClass388_603.method4565((long) (822953439 * client.anInt8981));
				((Class70) this).aClass388_603.method4573((((Class70) this).aByte587), i, i_9_, i_10_, i_11_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.s(").append(')').toString());
		}
	}

	void method810(Class_ra class_ra, int i) {
		try {
			if (null != ((Class70) this).aClass_na601) {
				Class260 class260 = (((Class70) this).aClass432_Sub1_605.method5346().aClass260_2606);
				client.aClass304_9030.method3023(-400722441).method4167(((Class70) this).aClass_na601, ((Class70) this).aByte588, (int) class260.aFloat2716, (int) class260.aFloat2711, ((Class70) this).aBooleanArray589, (byte) 19);
				((Class70) this).aBooleanArray589 = null;
				((Class70) this).aClass_na601 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.w(").append(')').toString());
		}
	}

	void method811(Class432_Sub1 class432_sub1, int i) {
		try {
			if (((Class70) this).aClass477_595.method5966(-26358226)) {
				if (((Class70) this).aClass477_595.method5981((822953439 * client.anInt8981 - -1028058495 * ((Class70) this).anInt596), 1836638831)) {
					if (Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(408206836) == 2)
						((Class70) this).aBoolean602 = false;
					if (((Class70) this).aClass477_595.method5978((byte) -69)) {
						((Class70) this).aClass477_595.method5988(-1, (byte) 7);
						((Class70) this).aBoolean597 = false;
						method807(false, -1, 0, -1540076211);
					}
				}
			} else
				method807(false, -1, 0, -2068590899);
			((Class70) this).anInt596 = -1420072865 * client.anInt8981;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.n(").append(')').toString());
		}
	}

	void method812(Class_ra class_ra, int i) {
		try {
			method806(class_ra, 262144, true, true, -1378875437);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.z(").append(')').toString());
		}
	}

	Class70(Class_ra class_ra, Class463 class463, Class473 class473, int i, int i_13_, int i_14_, int i_15_, Class432_Sub1 class432_sub1, boolean bool, int i_16_) {
		((Class70) this).anInt586 = -249619511;
		((Class70) this).anInt598 = 0;
		((Class70) this).aBoolean597 = false;
		((Class70) this).aBoolean602 = false;
		((Class70) this).aClass463_599 = class463;
		((Class70) this).anInt590 = class473.anInt5657 * -1889044269;
		((Class70) this).anInt591 = -681695095 * i;
		((Class70) this).anInt604 = 1532447141 * i_13_;
		((Class70) this).aClass432_Sub1_605 = class432_sub1;
		((Class70) this).aBoolean597 = -1 != i_16_;
		((Class70) this).aByte587 = (byte) i_14_;
		((Class70) this).aByte588 = (byte) i_15_;
		((Class70) this).aBoolean593 = bool;
		((Class70) this).aBoolean600 = (class_ra.y() && class473.aBoolean5685 && !((Class70) this).aBoolean593);
		((Class70) this).aClass477_595 = new Class477_Sub2(class432_sub1, false);
		method807(false, i_16_, 1, -1679742491);
	}

	static Class134[] method813(int i) {
		try {
			return (new Class134[] { Class134.aClass134_1513, Class134.aClass134_1515, Class134.aClass134_1512, Class134.aClass134_1517, Class134.aClass134_1514 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.r(").append(')').toString());
		}
	}

	static String method814(String string, int i) {
		try {
			if (Class550.OSName.startsWith("win"))
				return new StringBuilder().append(string).append(".dll").toString();
			if (Class550.OSName.startsWith("linux"))
				return new StringBuilder().append("lib").append(string).append(".so").toString();
			if (Class550.OSName.startsWith("mac"))
				return new StringBuilder().append("lib").append(string).append(".dylib").toString();
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.r(").append(')').toString());
		}
	}

	static final void method815(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_17_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_18_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			Class537 class537 = Class301.aClass543_3059.method6339(i_18_, -2039756334);
			if (class537.method6321((byte) -4))
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = client.aClass304_9030.method3025((byte) 13).method5705(i_17_, (byte) -28).method5902(i_18_, class537.aString6236, -470612980);
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (client.aClass304_9030.method3025((byte) 13).method5705(i_17_, (byte) -55).method5901(i_18_, class537.anInt6235 * -735399997, -1587675004));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.abo(").append(')').toString());
		}
	}

	static final void method816(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -8) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.alp(").append(')').toString());
		}
	}

	public static int method817(int i, int i_19_, byte i_20_) {
		try {
			if (1095002987 * Class396.aClass417_4108.anInt4282 == -1)
				return 1;
			if (i != Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(172214214)) {
				Class306.method3055(i, (Class526.aClass526_6132.method6257(Class429.aClass454_4369, 991479434)), true, (short) 27778);
				if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-766574404) != i)
					return -1;
			}
			int i_21_;
			try {
				Dimension dimension = Class475.aCanvas5700.getSize();
				Class95_Sub22.method1175(Class526.aClass526_6132.method6257(Class429.aClass454_4369, 991479434), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -485441382);
				Model class98 = Model.loadModel(Class95_Sub12.aClass280_7177, (Class396.aClass417_4108.anInt4282 * 1095002987), 0);
				long l = Class312.method3111((byte) 82);
				Class361.aClass_ra3793.L();
				client.aClass247_8975.method2476(0.0F, 256.0F, 0.0F);
				Class361.aClass_ra3793.cw(client.aClass247_8975);
				Class249 class249 = Class361.aClass_ra3793.cz();
				class249.method2493((float) (dimension.width / 2), (float) (dimension.height / 2), 512.0F, 512.0F, (float) client.aClass304_9030.method2992(1403532609), (float) client.aClass304_9030.method2993(-678427375), (float) dimension.width, (float) dimension.height);
				Class361.aClass_ra3793.ci(class249);
				Class361.aClass_ra3793.IA(1.0F);
				Class361.aClass_ra3793.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				Class387 class387 = Class361.aClass_ra3793.cb(class98, 2048, 64, 64, 768);
				int i_22_ = 0;
				while_64_: for (int i_23_ = 0; i_23_ < 500; i_23_++) {
					Class361.aClass_ra3793.ba(3, 0);
					for (int i_24_ = 15; i_24_ >= 0; i_24_--) {
						for (int i_25_ = 0; i_25_ <= i_24_; i_25_++) {
							client.aClass247_8976.method2476((float) (int) (((float) i_25_ - (float) i_24_ / 2.0F) * 512.0F), 0.0F, (float) (512 * (1 + i_24_)));
							class387.method4475(client.aClass247_8976, null, 0);
							i_22_++;
							if (Class312.method3111((byte) 31) - l >= (long) i_19_) {
								if (i_20_ == 0)
									throw new IllegalStateException();
								break while_64_;
							}
						}
					}
				}
				Class361.aClass_ra3793.l();
				long l_26_ = ((long) (1000 * i_22_) / (Class312.method3111((byte) 11) - l));
				Class361.aClass_ra3793.ba(3, 0);
				i_21_ = (int) l_26_;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				return -1;
			}
			return i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.gb(").append(')').toString());
		}
	}

	static void method818(int i) {
		try {
			for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); null != class330_sub36_sub10; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -115))) {
				if (Class228.method2313((((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 * 400571611), (byte) 31))
					Class78.method931(class330_sub36_sub10, 2084800754);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.t(").append(')').toString());
		}
	}

	static final void method819(Class430 class430, byte i) {
		try {
			int i_27_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aClass286Array9234[i_27_].anInt2948 * -1382048105;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.yk(").append(')').toString());
		}
	}

	public static Class213[] method820(byte i) {
		try {
			return (new Class213[] { Class213.aClass213_2063, Class213.aClass213_2064, Class213.aClass213_2074, Class213.aClass213_2066, Class213.aClass213_2067, Class213.aClass213_2065, Class213.aClass213_2069, Class213.aClass213_2070, Class213.aClass213_2071, Class213.aClass213_2072, Class213.aClass213_2073, Class213.aClass213_2068, Class213.aClass213_2075, Class213.aClass213_2076, Class213.aClass213_2077 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.r(").append(')').toString());
		}
	}

	public static Class366 method821(int i, int i_28_, int i_29_, int i_30_, Class476 class476, int i_31_, int i_32_) {
		try {
			Class363.aClass366_Sub3_3801.anInt3854 = i * -1089827279;
			Class363.aClass366_Sub3_3801.anInt3853 = 1307742219 * i_28_;
			Class363.aClass366_Sub3_3801.anInt3852 = 1706819999 * i_29_;
			Class363.aClass366_Sub3_3801.anInt3855 = i_30_ * 1343860585;
			((Class366_Sub3) Class363.aClass366_Sub3_3801).aClass476_8005 = class476;
			((Class366_Sub3) Class363.aClass366_Sub3_3801).anInt8006 = -610585295 * i_31_;
			return Class363.aClass366_Sub3_3801;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.o(").append(')').toString());
		}
	}

	public static void method822(int i, int i_33_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(4, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cv.z(").append(')').toString());
		}
	}
}
