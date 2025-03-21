/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class144 {
	static Class144 aClass144_1572 = new Class144(0, true);
	boolean aBoolean1573;
	static Class144 aClass144_1574;
	int anInt1575;
	static Class144 aClass144_1576 = new Class144(1, true);
	static int anInt1577;

	static {
		aClass144_1574 = new Class144(2, false);
	}

	Class144(int i, boolean bool) {
		((Class144) this).anInt1575 = 775816579 * i;
		((Class144) this).aBoolean1573 = bool;
	}

	static final void method1664(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1390004513;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.ak(").append(')').toString());
		}
	}

	static final void method1665(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -1157612929);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class120.method1443(iComponentDefinitions, class120, class430, -2001973845);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.ks(").append(')').toString());
		}
	}

	static final void method1666(Class430 class430, byte i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class67.method795((char) i_1_, (short) 32271) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.aad(").append(')').toString());
		}
	}

	static int method1667(int i, int i_2_, byte i_3_) {
		try {
			int i_4_ = i >> 31 & i_2_ - 1;
			return i_4_ + (i + (i >>> 31)) % i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.n(").append(')').toString());
		}
	}

	public static Class117 method1668(int i, byte i_5_) {
		try {
			if (i < 0 || i >= 100)
				return null;
			return Class119.aClass117Array1394[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.s(").append(')').toString());
		}
	}

	static final void method1669(Class430 class430, byte i) {
		try {
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_6_, 1400519055);
			Class120 class120 = Class3.aClass120Array56[i_6_ >> 16];
			Class138.method1604(iComponentDefinitions, class120, class430, -374277570);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.jr(").append(')').toString());
		}
	}

	public static final int method1670(Class463 class463, byte[] is, int i, int i_7_, int i_8_, int i_9_, byte i_10_) {
		try {
			int i_11_ = 0;
			Buffer class330_sub46 = new Buffer(is);
			int i_12_ = -1;
			for (;;) {
				int i_13_ = class330_sub46.method3767(1558443671);
				if (i_13_ == 0) {
					if (i_10_ <= 1) {
						/* empty */
					}
					break;
				}
				i_12_ += i_13_;
				int i_14_ = 0;
				boolean bool = false;
				for (;;) {
					if (bool) {
						int i_15_ = class330_sub46.readSmart(-726812354);
						if (0 == i_15_) {
							if (i_10_ <= 1)
								throw new IllegalStateException();
							break;
						}
						class330_sub46.readUnsignedByte(2133764591);
					} else {
						int i_16_ = class330_sub46.readSmart(-2109338683);
						if (i_16_ == 0) {
							if (i_10_ <= 1) {
								/* empty */
							}
							break;
						}
						i_14_ += i_16_ - 1;
						int i_17_ = i_14_ & 0x3f;
						int i_18_ = i_14_ >> 6 & 0x3f;
						int i_19_ = class330_sub46.readUnsignedByte(1396223744) >> 2;
						int i_20_ = i + i_18_;
						int i_21_ = i_17_ + i_7_;
						if (i_20_ > 0 && i_21_ > 0 && i_20_ < i_8_ - 1 && i_21_ < i_9_ - 1) {
							Class473 class473 = class463.method5705(i_12_, (byte) -12);
							if ((-344921723 * Class476.aClass476_6900.anInt6882 == i_19_) && (Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535) == 0) && 0 == -1012368965 * class473.anInt5637 && 1 != class473.anInt5635 * -146884317 && !class473.aBoolean5667) {
								if (i_10_ <= 1) {
									/* empty */
								}
							} else {
								if (!class473.method5896(715560437))
									i_11_++;
								bool = true;
							}
						}
					}
				}
			}
			return i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.ce(").append(')').toString());
		}
	}

	static final void method1671(int i, int i_22_, int i_23_, int i_24_) {
		try {
			String string = new StringBuilder().append("tele ").append(i).append(Class215.aString2081).append(i_22_ >> 6).append(Class215.aString2081).append(i_23_ >> 6).append(Class215.aString2081).append(i_22_ & 0x3f).append(Class215.aString2081).append(i_23_ & 0x3f).toString();
			System.out.println(string);
			Console.method5241(string, true, false, -1706594685);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fv.ha(").append(')').toString());
		}
	}
}
