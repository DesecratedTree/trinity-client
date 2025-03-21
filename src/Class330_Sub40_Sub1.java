/* Class330_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class330_Sub40_Sub1 extends Class330_Sub40 {
	int anInt9726;
	static Class273 aClass273_9727 = new Class273(64, Class271.aClass271_2755);
	boolean aBoolean9728;
	int anInt9729;
	static int anInt9730 = 100;
	int anInt9731;
	int anInt9732;
	int anInt9733;
	boolean aBoolean9734;
	Class471 aClass471_9735 = new Class471();

	static final void method3571(long l) {
		try {
			int i = client.anInt9068 * 1983170851;
			int i_0_ = client.anInt9069 * -427254073;
			if (i != 690880753 * IndexTable.anInt2906) {
				int i_1_ = i - IndexTable.anInt2906 * 690880753;
				int i_2_ = (int) (l * (long) i_1_ / 320L);
				if (i_1_ > 0) {
					if (i_2_ == 0)
						i_2_ = 1;
					else if (i_2_ > i_1_)
						i_2_ = i_1_;
				} else if (0 == i_2_)
					i_2_ = -1;
				else if (i_2_ < i_1_)
					i_2_ = i_1_;
				IndexTable.anInt2906 += 1410396177 * i_2_;
			}
			if (i_0_ != Class308.anInt3194 * -977385539) {
				int i_3_ = i_0_ - -977385539 * Class308.anInt3194;
				int i_4_ = (int) (l * (long) i_3_ / 320L);
				if (i_3_ > 0) {
					if (0 == i_4_)
						i_4_ = 1;
					else if (i_4_ > i_3_)
						i_4_ = i_3_;
				} else if (0 == i_4_)
					i_4_ = -1;
				else if (i_4_ < i_3_)
					i_4_ = i_3_;
				Class308.anInt3194 += -562451563 * i_4_;
			}
			client.aFloat9141 += 8.0F * (client.aFloat9072 * (float) l / 40.0F);
			client.aFloat9250 += 8.0F * (client.aFloat9124 * (float) l / 40.0F);
			Class344.method4003(575222518);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.hl(").append(')').toString());
		}
	}

	public void method3572(int i, int i_5_) {
		try {
			((Class330_Sub40_Sub1) this).anInt9732 = -580907511 * i;
			((Class330_Sub40_Sub1) this).anInt9733 = i * 1276003891;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.ai(").append(')').toString());
		}
	}

	synchronized void method3564(int[] is, int i, int i_6_) {
		try {
			if (!((Class330_Sub40_Sub1) this).aBoolean9728) {
				if (method3573(-1408375895) == null) {
					if (((Class330_Sub40_Sub1) this).aBoolean9734) {
						method3252(-1628430281);
						aClass273_9727.method2678(-2107149980);
					}
				} else {
					int i_7_ = i + i_6_;
					if (Class296.aBoolean3023)
						i_7_ <<= 1;
					int i_8_ = 0;
					int i_9_ = 0;
					if (2051112119 * ((Class330_Sub40_Sub1) this).anInt9729 == 2)
						i_9_ = 1;
					while (i < i_7_) {
						Class330_Sub32 class330_sub32 = method3573(-1408375895);
						if (class330_sub32 == null)
							break;
						short[][] is_10_;
						for (is_10_ = (((Class330_Sub32) class330_sub32).aShortArrayArray7725); (i < i_7_ && (((Class330_Sub40_Sub1) this).anInt9731 * -775205259) < is_10_[0].length); ((Class330_Sub40_Sub1) this).anInt9731 += -1271295523) {
							if (Class296.aBoolean3023) {
								is[i++] = (334356537 * ((Class330_Sub40_Sub1) this).anInt9732 * (is_10_[i_8_][-775205259 * ((Class330_Sub40_Sub1) this).anInt9731]));
								is[i++] = ((is_10_[i_9_][-775205259 * ((Class330_Sub40_Sub1) this).anInt9731]) * ((((Class330_Sub40_Sub1) this).anInt9733) * -849992453));
							} else
								is[i++] += ((-849992453 * (((Class330_Sub40_Sub1) this).anInt9733) * (is_10_[i_9_][(((Class330_Sub40_Sub1) this).anInt9731) * -775205259])) + (334356537 * (((Class330_Sub40_Sub1) this).anInt9732) * (is_10_[i_8_][(((Class330_Sub40_Sub1) this).anInt9731) * -775205259])));
						}
						if (-775205259 * ((Class330_Sub40_Sub1) this).anInt9731 >= is_10_[0].length)
							method3580(237299714);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.s(").append(')').toString());
		}
	}

	synchronized void method3555(int i) {
		try {
			if (!((Class330_Sub40_Sub1) this).aBoolean9728) {
				for (;;) {
					Class330_Sub32 class330_sub32 = method3573(-1408375895);
					if (null == class330_sub32) {
						if (((Class330_Sub40_Sub1) this).aBoolean9734) {
							method3252(-1646245803);
							aClass273_9727.method2678(1543289822);
						}
						break;
					}
					if (((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - -775205259 * ((Class330_Sub40_Sub1) this).anInt9731) > i) {
						((Class330_Sub40_Sub1) this).anInt9731 += i * -1271295523;
						break;
					}
					i -= ((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - (((Class330_Sub40_Sub1) this).anInt9731 * -775205259));
					method3580(237299714);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.f(").append(')').toString());
		}
	}

	synchronized void method3569(int i) {
		if (!((Class330_Sub40_Sub1) this).aBoolean9728) {
			for (;;) {
				Class330_Sub32 class330_sub32 = method3573(-1408375895);
				if (null == class330_sub32) {
					if (((Class330_Sub40_Sub1) this).aBoolean9734) {
						method3252(581268329);
						aClass273_9727.method2678(-1490920972);
					}
					break;
				}
				if (((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - -775205259 * ((Class330_Sub40_Sub1) this).anInt9731) > i) {
					((Class330_Sub40_Sub1) this).anInt9731 += i * -1271295523;
					break;
				}
				i -= ((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - ((Class330_Sub40_Sub1) this).anInt9731 * -775205259);
				method3580(237299714);
			}
		}
	}

	synchronized Class330_Sub32 method3573(int i) {
		try {
			return (Class330_Sub32) ((Class330_Sub40_Sub1) this).aClass471_9735.method5869(539664854);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.aj(").append(')').toString());
		}
	}

	synchronized void method3565(int[] is, int i, int i_11_) {
		if (!((Class330_Sub40_Sub1) this).aBoolean9728) {
			if (method3573(-1408375895) == null) {
				if (((Class330_Sub40_Sub1) this).aBoolean9734) {
					method3252(167456154);
					aClass273_9727.method2678(-443268378);
				}
			} else {
				int i_12_ = i + i_11_;
				if (Class296.aBoolean3023)
					i_12_ <<= 1;
				int i_13_ = 0;
				int i_14_ = 0;
				if (2051112119 * ((Class330_Sub40_Sub1) this).anInt9729 == 2)
					i_14_ = 1;
				while (i < i_12_) {
					Class330_Sub32 class330_sub32 = method3573(-1408375895);
					if (class330_sub32 == null)
						break;
					short[][] is_15_;
					for (is_15_ = (((Class330_Sub32) class330_sub32).aShortArrayArray7725); i < i_12_ && (((Class330_Sub40_Sub1) this).anInt9731 * -775205259) < is_15_[0].length; ((Class330_Sub40_Sub1) this).anInt9731 += -1271295523) {
						if (Class296.aBoolean3023) {
							is[i++] = (334356537 * ((Class330_Sub40_Sub1) this).anInt9732 * (is_15_[i_13_][-775205259 * ((Class330_Sub40_Sub1) this).anInt9731]));
							is[i++] = ((is_15_[i_14_][-775205259 * (((Class330_Sub40_Sub1) this).anInt9731)]) * (((Class330_Sub40_Sub1) this).anInt9733 * -849992453));
						} else
							is[i++] += ((-849992453 * ((Class330_Sub40_Sub1) this).anInt9733 * (is_15_[i_14_][(((Class330_Sub40_Sub1) this).anInt9731) * -775205259])) + (334356537 * ((Class330_Sub40_Sub1) this).anInt9732 * (is_15_[i_13_][(((Class330_Sub40_Sub1) this).anInt9731) * -775205259])));
					}
					if (-775205259 * ((Class330_Sub40_Sub1) this).anInt9731 >= is_15_[0].length)
						method3580(237299714);
				}
			}
		}
	}

	Class330_Sub32 method3574(int i, double d) {
		try {
			long l = (long) ((((Class330_Sub40_Sub1) this).anInt9729 * 2051112119 << 32) | i);
			Class330_Sub32 class330_sub32 = ((Class330_Sub32) aClass273_9727.method2680(Long.valueOf(l), -2120731619));
			if (null != class330_sub32) {
				((Class330_Sub32) class330_sub32).aDouble7726 = d;
				aClass273_9727.method2674(Long.valueOf(l), -314619036);
			} else
				class330_sub32 = new Class330_Sub32((new short[2051112119 * ((Class330_Sub40_Sub1) this).anInt9729][i]), d);
			return class330_sub32;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.ad(").append(')').toString());
		}
	}

	synchronized void method3575(Class330_Sub32 class330_sub32, byte i) {
		try {
			for (/**/; ((Class330_Sub40_Sub1) this).anInt9726 * -1969793483 >= 100; ((Class330_Sub40_Sub1) this).anInt9726 -= 346410013)
				((Class330_Sub40_Sub1) this).aClass471_9735.method5867((short) 8960);
			((Class330_Sub40_Sub1) this).aClass471_9735.method5878(class330_sub32, (short) 8192);
			((Class330_Sub40_Sub1) this).anInt9726 += 346410013;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.an(").append(')').toString());
		}
	}

	synchronized double method3576(int i) {
		try {
			if (((Class330_Sub40_Sub1) this).anInt9726 * -1969793483 < 1)
				return -1.0;
			Class330_Sub32 class330_sub32 = (Class330_Sub32) ((Class330_Sub40_Sub1) this).aClass471_9735.method5869(539664854);
			if (null == class330_sub32)
				return -1.0;
			return (((Class330_Sub32) class330_sub32).aDouble7726 - (double) ((float) (((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length / (float) Class296.anInt3047));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.af(").append(')').toString());
		}
	}

	synchronized void method3577(byte i) {
		try {
			((Class330_Sub40_Sub1) this).aBoolean9734 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.aq(").append(')').toString());
		}
	}

	Class330_Sub40 method3558() {
		return null;
	}

	Class330_Sub40 method3552() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.j(").append(')').toString());
		}
	}

	static final int method3578(int i, int i_16_) {
		try {
			int i_17_ = i & 0x3f;
			int i_18_ = i >> 6 & 0x3;
			if (i_17_ == 18) {
				if (i_18_ == 0)
					return 1;
				if (i_18_ == 1)
					return 2;
				if (i_18_ == 2)
					return 4;
				if (3 == i_18_)
					return 8;
			} else if (19 == i_17_ || 21 == i_17_) {
				if (i_18_ == 0)
					return 16;
				if (1 == i_18_)
					return 32;
				if (2 == i_18_)
					return 64;
				if (3 == i_18_)
					return 128;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.iq(").append(')').toString());
		}
	}

	Class330_Sub40 method3557() {
		return null;
	}

	Class330_Sub40 method3559() {
		return null;
	}

	int method3560() {
		return 1;
	}

	int method3570() {
		return 1;
	}

	int method3553() {
		return 1;
	}

	int method3567() {
		return 1;
	}

	int method3554() {
		return 1;
	}

	int method3561() {
		return 1;
	}

	synchronized void method3566(int i) {
		if (!((Class330_Sub40_Sub1) this).aBoolean9728) {
			for (;;) {
				Class330_Sub32 class330_sub32 = method3573(-1408375895);
				if (null == class330_sub32) {
					if (((Class330_Sub40_Sub1) this).aBoolean9734) {
						method3252(-9247384);
						aClass273_9727.method2678(1961593559);
					}
					break;
				}
				if (((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - -775205259 * ((Class330_Sub40_Sub1) this).anInt9731) > i) {
					((Class330_Sub40_Sub1) this).anInt9731 += i * -1271295523;
					break;
				}
				i -= ((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - ((Class330_Sub40_Sub1) this).anInt9731 * -775205259);
				method3580(237299714);
			}
		}
	}

	synchronized int method3579(int i) {
		try {
			return ((Class330_Sub40_Sub1) this).anInt9726 * -1969793483;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.as(").append(')').toString());
		}
	}

	Class330_Sub40 method3556() {
		return null;
	}

	synchronized void method3568(int i) {
		if (!((Class330_Sub40_Sub1) this).aBoolean9728) {
			for (;;) {
				Class330_Sub32 class330_sub32 = method3573(-1408375895);
				if (null == class330_sub32) {
					if (((Class330_Sub40_Sub1) this).aBoolean9734) {
						method3252(-749221245);
						aClass273_9727.method2678(-37338157);
					}
					break;
				}
				if (((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - -775205259 * ((Class330_Sub40_Sub1) this).anInt9731) > i) {
					((Class330_Sub40_Sub1) this).anInt9731 += i * -1271295523;
					break;
				}
				i -= ((((Class330_Sub32) class330_sub32).aShortArrayArray7725[0]).length - ((Class330_Sub40_Sub1) this).anInt9731 * -775205259);
				method3580(237299714);
			}
		}
	}

	synchronized void method3580(int i) {
		try {
			Class330_Sub32 class330_sub32 = method3573(-1408375895);
			if (class330_sub32 != null) {
				class330_sub32.method3252(-2026732080);
				((Class330_Sub40_Sub1) this).anInt9731 = 0;
				((Class330_Sub40_Sub1) this).anInt9726 -= 346410013;
				aClass273_9727.method2676(Long.valueOf(class330_sub32.method3433(1150698309)), class330_sub32, -270625351);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.ax(").append(')').toString());
		}
	}

	Class330_Sub40 method3550() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.i(").append(')').toString());
		}
	}

	Class330_Sub40_Sub1(int i) {
		((Class330_Sub40_Sub1) this).anInt9726 = 0;
		((Class330_Sub40_Sub1) this).anInt9732 = 1611532544;
		((Class330_Sub40_Sub1) this).anInt9733 = 239481600;
		((Class330_Sub40_Sub1) this).anInt9729 = -470933241 * i;
	}

	public static String method3581(long l, int i, boolean bool, int i_19_) {
		try {
			Calendar calendar;
			if (bool) {
				Class22.method475(l);
				calendar = Class528.aCalendar6217;
			} else {
				Class452.method5637(l);
				calendar = Class528.aCalendar6215;
			}
			int i_20_ = calendar.get(5);
			int i_21_ = calendar.get(2);
			int i_22_ = calendar.get(1);
			int i_23_ = calendar.get(11);
			int i_24_ = calendar.get(12);
			if (3 == i)
				return Class95_Sub2.method1109(l, i, bool, -1393544315);
			return new StringBuilder().append(Integer.toString(i_20_ / 10)).append(i_20_ % 10).append("-").append(Class528.aStringArrayArray6216[i][i_21_]).append("-").append(i_22_).append(" ").append(i_23_ / 10).append(i_23_ % 10).append(":").append(i_24_ / 10).append(i_24_ % 10).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.j(").append(')').toString());
		}
	}

	static final void method3582(Class430 class430, int i) {
		try {
			int i_25_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5716(i_25_, -1030808461);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.aqw(").append(')').toString());
		}
	}

	int method3562() {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.p(").append(')').toString());
		}
	}

	synchronized void method3583(boolean bool, int i) {
		try {
			((Class330_Sub40_Sub1) this).aBoolean9728 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.aa(").append(')').toString());
		}
	}

	public static void method3584(long[] ls, Object[] objects, byte i) {
		try {
			Class13.method439(ls, objects, 0, ls.length - 1, 776512794);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.n(").append(')').toString());
		}
	}

	static final void method3585(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4380 -= -96952422;
			if ((((Class430) class430).aLongArray4379[((Class430) class430).anInt4380 * -1969146619]) > (((Class430) class430).aLongArray4379[1 + -1969146619 * ((Class430) class430).anInt4380]))
				((Class430) class430).anInt4397 += ((((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]) * 1996761881);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aij.br(").append(')').toString());
		}
	}
}
