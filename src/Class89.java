/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89 {
	int[] anIntArray731;
	static int anInt732 = 2;
	static int anInt733 = 0;
	int[] anIntArray734;
	public static IndexTable aClass280_735;
	static int anInt736;

	Class89(Buffer class330_sub46) {
		int i = class330_sub46.readSmart(-1046710252);
		((Class89) this).anIntArray731 = new int[i];
		((Class89) this).anIntArray734 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = class330_sub46.readUnsignedByte(1441521738);
			((Class89) this).anIntArray731[i_0_] = i_1_;
			int i_2_ = class330_sub46.readUnsignedShort(-378099376);
			int i_3_ = class330_sub46.readUnsignedShort(-93361015);
			((Class89) this).anIntArray734[i_0_] = i_3_ + (i_2_ << 16);
		}
	}

	void method1056(Class85 class85, int i, int i_4_) {
		try {
			int i_5_ = ((Class89) this).anIntArray734[0];
			class85.method971(i, i_5_ >>> 16, i_5_ & 0xffff, (byte) -37);
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = class85.method973(-1160484525);
			class432_sub1_sub1_sub1.anInt10056 = 0;
			for (int i_6_ = ((Class89) this).anIntArray731.length - 1; i_6_ >= 0; i_6_--) {
				int i_7_ = ((Class89) this).anIntArray731[i_6_];
				int i_8_ = ((Class89) this).anIntArray734[i_6_];
				class432_sub1_sub1_sub1.anIntArray10018[815331179 * class432_sub1_sub1_sub1.anInt10056] = i_8_ >> 16;
				class432_sub1_sub1_sub1.anIntArray10059[815331179 * class432_sub1_sub1_sub1.anInt10056] = i_8_ & 0xffff;
				byte i_9_ = Class299.aClass299_6807.aByte6805;
				if (i_7_ == 0)
					i_9_ = Class299.aClass299_6806.aByte6805;
				else if (i_7_ == 2)
					i_9_ = Class299.aClass299_6808.aByte6805;
				class432_sub1_sub1_sub1.aByteArray10017[class432_sub1_sub1_sub1.anInt10056 * 815331179] = i_9_;
				class432_sub1_sub1_sub1.anInt10056 += 393772355;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dp.r(").append(')').toString());
		}
	}

	static final void method1057(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4380 -= -96952422;
			if ((((Class430) class430).aLongArray4379[((Class430) class430).anInt4380 * -1969146619]) != (((Class430) class430).aLongArray4379[1 + -1969146619 * ((Class430) class430).anInt4380]))
				((Class430) class430).anInt4397 += (1996761881 * (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dp.bf(").append(')').toString());
		}
	}

	public static void method1058(IndexTable class280, int i, int i_10_, int i_11_, boolean bool, Class330_Sub40_Sub2 class330_sub40_sub2, short i_12_) {
		try {
			Class217.method2255(class280, i, i_10_, i_11_, bool, -1739353578);
			Class288.aClass330_Sub40_Sub2_2955 = class330_sub40_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dp.i(").append(')').toString());
		}
	}

	static final void method1059(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1332 = Class288.method2886(string, class430, 2049457508);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dp.ot(").append(')').toString());
		}
	}

	public static void method1060(byte i) {
		try {
			if (null == Class239.aClass258Array2585) {
				Class239.aClass258Array2585 = Class258.method2543((byte) 80);
				Class134.aClass258_1518 = Class239.aClass258Array2585[0];
				Class239.aLong2590 = Class312.method3111((byte) 37) * -4406923686660611771L;
			}
			if (null == Class239.aClass240_2592)
				Class532.method6302((byte) 96);
			Class258 class258 = Class134.aClass258_1518;
			int i_13_ = IComponentDefinitions.method1412((byte) 4);
			if (Class134.aClass258_1518 == class258) {
				Class163.aString1693 = ((Class258) Class134.aClass258_1518).aClass526_2685.method6257(Class429.aClass454_4369, 991479434);
				if (((Class258) Class134.aClass258_1518).aBoolean2704)
					Class230.anInt2445 = (195206069 * (i_13_ * ((((Class258) Class134.aClass258_1518).anInt2707) * 368214275 - 774429481 * (((Class258) Class134.aClass258_1518).anInt2706)) / 100 + (774429481 * (((Class258) Class134.aClass258_1518).anInt2706))));
				if (((Class258) Class134.aClass258_1518).aBoolean2709)
					Class163.aString1693 = new StringBuilder().append(Class163.aString1693).append(-793658723 * Class230.anInt2445).append("%").toString();
			} else if (Class134.aClass258_1518 == Class258.aClass258_2702) {
				Class239.aClass240_2592 = null;
				Class227.method2311(6, -1188873169);
				if (Class239.aBoolean2593) {
					Class239.aBoolean2593 = false;
					Class138.method1605(Class367.aString3863, Class464_Sub4.aString8670, 1801272631);
				}
			} else {
				Class163.aString1693 = ((Class258) class258).aClass526_2705.method6257(Class429.aClass454_4369, 991479434);
				if (((Class258) Class134.aClass258_1518).aBoolean2709)
					Class163.aString1693 = new StringBuilder().append(Class163.aString1693).append(((Class258) class258).anInt2707 * 368214275).append("%").toString();
				Class230.anInt2445 = ((Class258) class258).anInt2707 * 494405663;
				if (((Class258) Class134.aClass258_1518).aBoolean2704 || ((Class258) class258).aBoolean2704)
					Class239.aLong2590 = (Class312.method3111((byte) 19) * -4406923686660611771L);
			}
			if (Class239.aClass240_2592 != null) {
				Class239.aClass240_2592.method2386(Class239.aLong2590 * -1106992194717709939L, Class163.aString1693, -793658723 * Class230.anInt2445, Class134.aClass258_1518, 1495621861);
				if (Class239.anInterface14Array2584 != null) {
					for (int i_14_ = 1 + Class239.anInt2587 * 870468077; i_14_ < Class239.anInterface14Array2584.length; i_14_++) {
						if (Class239.anInterface14Array2584[i_14_].method212(2107876108) >= 100 && i_14_ - 1 == Class239.anInt2587 * 870468077 && 12 != -296919301 * client.anInt8995 && Class239.aClass240_2592.method2394(-1376454977)) {
							try {
								Class239.anInterface14Array2584[i_14_].method203(-141535543);
							} catch (Exception exception) {
								Class239.anInterface14Array2584 = null;
								break;
							}
							Class239.aClass240_2592.method2385(Class239.anInterface14Array2584[i_14_], -1891566874);
							Class239.anInt2587 += -211059739;
							if ((Class239.anInt2587 * 870468077 >= Class239.anInterface14Array2584.length - 1) && Class239.anInterface14Array2584.length > 1)
								Class239.anInt2587 = (Class239.aClass546_2588.method6353(1419887250) ? 0 : -1) * -211059739;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dp.j(").append(')').toString());
		}
	}

	static final void method1061(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class379.method4385(string, false, -1987119509);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dp.wz(").append(')').toString());
		}
	}
}
