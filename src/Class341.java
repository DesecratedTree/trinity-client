/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class341 {
	Class367 aClass367_3393;
	IndexTable aClass280_3394;
	Class367 aClass367_3395 = new Class367(64);
	IndexTable aClass280_3396;
	public static Class342 aClass342_3397;

	public Class343 method3972(int i, byte i_0_) {
		try {
			Class343 class343;
			synchronized (((Class341) this).aClass367_3395) {
				class343 = (Class343) ((Class341) this).aClass367_3395.get((long) i);
			}
			if (class343 != null)
				return class343;
			byte[] is;
			synchronized (((Class341) this).aClass280_3394) {
				is = (((Class341) this).aClass280_3394.getFile(-989081113 * Class103.aClass103_942.anInt982, i));
			}
			class343 = new Class343();
			((Class343) class343).aClass341_3406 = this;
			if (null != is)
				class343.method3992(new Buffer(is), -1942976432);
			synchronized (((Class341) this).aClass367_3395) {
				((Class341) this).aClass367_3395.put(class343, (long) i);
			}
			return class343;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.r(").append(')').toString());
		}
	}

	public void method3973(byte i) {
		try {
			synchronized (((Class341) this).aClass367_3395) {
				((Class341) this).aClass367_3395.method4298((byte) 115);
			}
			synchronized (((Class341) this).aClass367_3393) {
				((Class341) this).aClass367_3393.method4298((byte) 119);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.j(").append(')').toString());
		}
	}

	public void method3974(int i) {
		try {
			synchronized (((Class341) this).aClass367_3395) {
				((Class341) this).aClass367_3395.method4296(-242876545);
			}
			synchronized (((Class341) this).aClass367_3393) {
				((Class341) this).aClass367_3393.method4296(-1818798287);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.p(").append(')').toString());
		}
	}

	public void method3975(int i, byte i_1_) {
		try {
			synchronized (((Class341) this).aClass367_3395) {
				((Class341) this).aClass367_3395.method4292(i, (byte) 56);
			}
			synchronized (((Class341) this).aClass367_3393) {
				((Class341) this).aClass367_3393.method4292(i, (byte) 98);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.i(").append(')').toString());
		}
	}

	public Class341(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_2_) {
		((Class341) this).aClass367_3393 = new Class367(20);
		((Class341) this).aClass280_3396 = class280_2_;
		((Class341) this).aClass280_3394 = class280;
		((Class341) this).aClass280_3394.method2763((-989081113 * (Class103.aClass103_942.anInt982)), -2138473822);
	}

	static final void method3976(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1261 = Class288.method2886(string, class430, 1147081971);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.nr(").append(')').toString());
		}
	}

	static final void method3977(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class230.method2344(string, (byte) 69);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.wm(").append(')').toString());
		}
	}

	static final void method3978(Class430 class430, int i) {
		try {
			Class525.method6255(-232055034);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.ang(").append(')').toString());
		}
	}

	public static void method3979(int[] is, int[] is_3_, int i) {
		try {
			if (null == is || is_3_ == null) {
				Class458.anIntArray5565 = null;
				Class11.anIntArray167 = null;
				Class125.aByteArrayArrayArray1459 = null;
			} else {
				Class458.anIntArray5565 = is;
				Class11.anIntArray167 = new int[is.length];
				Class125.aByteArrayArrayArray1459 = new byte[is.length][][];
				for (int i_4_ = 0; i_4_ < Class458.anIntArray5565.length; i_4_++)
					Class125.aByteArrayArrayArray1459[i_4_] = new byte[is_3_[i_4_]][];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.r(").append(')').toString());
		}
	}

	static final void method3980(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (((Class430) class430).aClass330_Sub39_4395.aClass153Array7759[i_5_].anInt1631) * -1541463749;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.yd(").append(')').toString());
		}
	}

	static final void method3981(Class430 class430, byte i) {
		try {
			boolean bool = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) != 0);
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = Class451.method5631((long) i_6_, 0, bool, Class429.aClass454_4369, -1348038301);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.aan(").append(')').toString());
		}
	}

	static void method3982(Class_ra class_ra, Class330_Sub38 class330_sub38, Class372 class372, int i) {
		try {
			Class61 class61 = class372.method4326(class_ra, -2045573393);
			if (null != class61) {
				int i_7_ = class61.method681();
				if (class61.method682() > i_7_)
					i_7_ = class61.method682();
				int i_8_ = 10;
				int i_9_ = 1175619289 * class330_sub38.anInt7754;
				int i_10_ = class330_sub38.anInt7750 * 1653279497;
				int i_11_ = 0;
				int i_12_ = 0;
				int i_13_ = 0;
				if (null != class372.aString3909) {
					i_11_ = (Class543.aClass524_6254.method6244(class372.aString3909, null, Class354_Sub1.aStringArray7988, null, 1400145808));
					for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
						String string = Class354_Sub1.aStringArray7988[i_14_];
						if (i_14_ < i_11_ - 1)
							string = string.substring(0, string.length() - 4);
						int i_15_ = Class362.aClass8_3799.method417(string);
						if (i_15_ > i_12_)
							i_12_ = i_15_;
					}
					i_13_ = (Class362.aClass8_3799.method420() * i_11_ + Class362.aClass8_3799.method415() / 2);
				}
				int i_16_ = 1175619289 * class330_sub38.anInt7754 + i_7_ / 2;
				int i_17_ = 1653279497 * class330_sub38.anInt7750;
				if (i_9_ < Class354_Sub1.anInt3527 + i_7_) {
					i_9_ = Class354_Sub1.anInt3527;
					i_16_ = i_12_ / 2 + (i_8_ + (i_7_ / 2 + Class354_Sub1.anInt3527)) + 5;
				} else if (i_9_ > Class354_Sub1.anInt3511 - i_7_) {
					i_9_ = Class354_Sub1.anInt3511 - i_7_;
					i_16_ = (Class354_Sub1.anInt3511 - i_7_ / 2 - i_8_ - i_12_ / 2 - 5);
				}
				if (i_10_ < i_7_ + Class354_Sub1.anInt3528) {
					i_10_ = Class354_Sub1.anInt3528;
					i_17_ = i_8_ + Class354_Sub1.anInt3528 + i_7_ / 2;
				} else if (i_10_ > Class354_Sub1.anInt3530 - i_7_) {
					i_10_ = Class354_Sub1.anInt3530 - i_7_;
					i_17_ = Class354_Sub1.anInt3530 - i_7_ / 2 - i_8_ - i_13_;
				}
				int i_18_ = ((int) (Math.atan2((double) (i_9_ - (class330_sub38.anInt7754 * 1175619289)), (double) (i_10_ - (1653279497 * (class330_sub38.anInt7750)))) / 3.141592653589793 * 32767.0) & 0xffff);
				class61.method695((float) i_9_ + (float) i_7_ / 2.0F, (float) i_7_ / 2.0F + (float) i_10_, 4096, i_18_);
				int i_19_ = -2;
				int i_20_ = -2;
				int i_21_ = -2;
				int i_22_ = -2;
				if (null != class372.aString3909) {
					i_19_ = i_16_ - i_12_ / 2 - 5;
					i_20_ = i_17_;
					i_21_ = 10 + (i_19_ + i_12_);
					i_22_ = (i_20_ + Class362.aClass8_3799.method420() * i_11_ + 3);
					if (0 != 1346364371 * class372.anInt3902)
						class_ra.method4789(i_19_, i_20_, i_21_ - i_19_, i_22_ - i_20_, 1346364371 * class372.anInt3902, 463754225);
					if (-1739000105 * class372.anInt3882 != 0)
						class_ra.method4788(i_19_, i_20_, i_21_ - i_19_, i_22_ - i_20_, -1739000105 * class372.anInt3882, (byte) -58);
					for (int i_23_ = 0; i_23_ < i_11_; i_23_++) {
						String string = Class354_Sub1.aStringArray7988[i_23_];
						if (i_23_ < i_11_ - 1)
							string = string.substring(0, string.length() - 4);
						Class362.aClass8_3799.method418(class_ra, string, i_16_, i_17_, (class372.anInt3903 * 1249196777), true);
						i_17_ += Class362.aClass8_3799.method420();
					}
				}
				if (-1 != class372.anInt3872 * -19592741 || class372.aString3909 != null) {
					Class330_Sub7 class330_sub7 = new Class330_Sub7(class330_sub38);
					i_7_ >>= 1;
					((Class330_Sub7) class330_sub7).anInt7546 = 1951011357 * (i_9_ - i_7_);
					((Class330_Sub7) class330_sub7).anInt7553 = -463713427 * (i_9_ + i_7_);
					((Class330_Sub7) class330_sub7).anInt7548 = 950469751 * (i_10_ - i_7_);
					((Class330_Sub7) class330_sub7).anInt7545 = (i_7_ + i_10_) * 1512582467;
					((Class330_Sub7) class330_sub7).anInt7549 = 1358995639 * i_19_;
					((Class330_Sub7) class330_sub7).anInt7550 = 1642847929 * i_21_;
					((Class330_Sub7) class330_sub7).anInt7551 = i_20_ * 2144115257;
					((Class330_Sub7) class330_sub7).anInt7547 = i_22_ * -2081742315;
					Class171.aClass471_1730.method5878(class330_sub7, (short) 8192);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("of.cb(").append(')').toString());
		}
	}
}
