/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class139 {
	int[] anIntArray1534;
	static short aShort1535;

	public Class139(int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 1); i <<= 1) {
			/* empty */
		}
		((Class139) this).anIntArray1534 = new int[i + i];
		for (int i_0_ = 0; i_0_ < i + i; i_0_++)
			((Class139) this).anIntArray1534[i_0_] = -1;
		for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
			int i_2_;
			for (i_2_ = is[i_1_] & i - 1; ((Class139) this).anIntArray1534[1 + (i_2_ + i_2_)] != -1; i_2_ = 1 + i_2_ & i - 1) {
				/* empty */
			}
			((Class139) this).anIntArray1534[i_2_ + i_2_] = is[i_1_];
			((Class139) this).anIntArray1534[i_2_ + i_2_ + 1] = i_1_;
		}
	}

	public int getArchiveFileId(int i, int i_3_) {
		try {
			int i_4_ = (((Class139) this).anIntArray1534.length >> 1) - 1;
			int i_5_ = i & i_4_;
			for (;;) {
				int i_6_ = ((Class139) this).anIntArray1534[i_5_ + i_5_ + 1];
				if (i_6_ == -1)
					return -1;
				if (((Class139) this).anIntArray1534[i_5_ + i_5_] == i)
					return i_6_;
				i_5_ = i_5_ + 1 & i_4_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.r(").append(')').toString());
		}
	}

	static final void method1608(Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (-843487341 * client.anInt9257 == 2 && i_7_ < 652732387 * client.anInt9256)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = client.aClass99Array9259[i_7_].aBoolean909 ? 1 : 0;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.xs(").append(')').toString());
		}
	}

	static final void method1609(Class430 class430, int i) {
		try {
			if (Class106.aClass330_Sub39_1009 != null) {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
				((Class430) class430).aClass330_Sub39_4395 = Class106.aClass330_Sub39_1009;
			} else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.yh(").append(')').toString());
		}
	}

	static final void method1610(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_8_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_9_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			if (i_9_ == -1)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class370.aClass268_6770.method2659(i_8_, 1272082105).method3477((char) i_9_, -1625646287);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.adp(").append(')').toString());
		}
	}

	static final void method1611(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub6_7882, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1 ? 1 : 0, 1776378129);
			client.aClass304_9030.method3032(-1899581580);
			Class435.method5568(2055925381);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.ajf(").append(')').toString());
		}
	}

	static final void method1612(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class435.anInt4424 * 133535485;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.aok(").append(')').toString());
		}
	}

	public static Class120 method1613(int i, int[] is, Class120 class120, boolean bool, int i_10_) {
		try {
			if (!Class330_Sub12_Sub9.aClass280_9534.method2777(i, (byte) -3))
				return null;
			int i_11_ = Class330_Sub12_Sub9.aClass280_9534.method2763(i, -2079977606);
			IComponentDefinitions[] class114s;
			if (0 == i_11_)
				class114s = new IComponentDefinitions[0];
			else if (class120 == null)
				class114s = new IComponentDefinitions[i_11_];
			else
				class114s = class120.aClass114Array1400;
			if (class120 == null)
				class120 = new Class120(bool, class114s);
			else {
				class120.aClass114Array1400 = class114s;
				class120.aBoolean1402 = bool;
			}
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				if (null == class120.aClass114Array1400[i_12_]) {
					byte[] is_13_ = Class330_Sub12_Sub9.aClass280_9534.method2756(i, i_12_, is, -1664100359);
					if (is_13_ != null) {
						IComponentDefinitions iComponentDefinitions = (class120.aClass114Array1400[i_12_] = new IComponentDefinitions());
						iComponentDefinitions.anInt1196 = 1163826047 * (i_12_ + (i << 16));
						iComponentDefinitions.method1387(new Buffer(is_13_), (byte) 28);
						if (i == 506) {
							if (iComponentDefinitions.aStringArray1284 != null)
								iComponentDefinitions.aStringArray1284[0] = "Select";
						} else if (i == 791) {
							if (iComponentDefinitions.aStringArray1284 != null) {
								for (int ii = 0; ii < iComponentDefinitions.aStringArray1284.length; ii++) {
									if (iComponentDefinitions.aStringArray1284[ii].equals("Kill 'em all"))
										iComponentDefinitions.aStringArray1284[ii] = "Yes";
									else if (iComponentDefinitions.aStringArray1284[ii].equals("Ignore 5"))
										iComponentDefinitions.aStringArray1284[ii] = "No";
								}
							}
						}
					}
				}
			}
			return class120;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.s(").append(')').toString());
		}
	}

	public static int[] method1614(int i, int i_14_) {
		try {
			int[] is = new int[3];
			Class452.method5637(Class401.method4717(i, 2135510359));
			is[0] = Class528.aCalendar6215.get(5);
			is[1] = Class528.aCalendar6215.get(2);
			is[2] = Class528.aCalendar6215.get(1);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.z(").append(')').toString());
		}
	}

	static final void method1615(Class430 class430, short i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_15_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_16_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class2.aClass523_44.method6233(i_15_, 1930306781).anIntArray9661[i_16_]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fo.adh(").append(')').toString());
		}
	}
}
