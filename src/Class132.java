/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class132 {
	static Class132 aClass132_1503;
	static Class132 aClass132_1504 = new Class132(0);
	static Class401_Sub1[] aClass401_Sub1Array1505;
	static int anInt1506;

	static {
		aClass132_1503 = new Class132(1);
	}

	Class132(int i) {
		/* empty */
	}

	static final void method1565(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			Class62.method767((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]), (((Class430) class430).anIntArray4387[1 + (((Class430) class430).anInt4376 * 1632830751)]), (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 * 1632830751 + 2)]), -1329357390);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fh.tw(").append(')').toString());
		}
	}

	public static void method1566(byte i) {
		try {
			if (null != Class239.aClass240_2592)
				Class239.aClass240_2592.method2391(1705635690);
			if (null != Class330_Sub36_Sub14_Sub1.aThread10138) {
				for (;;) {
					try {
						Class330_Sub36_Sub14_Sub1.aThread10138.join();
						break;
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fh.u(").append(')').toString());
		}
	}

	public static byte[] method1567(CharSequence charsequence, int i) {
		try {
			int i_0_ = charsequence.length();
			byte[] is = new byte[i_0_];
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
				char c = charsequence.charAt(i_1_);
				if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
					is[i_1_] = (byte) c;
				else if (c == '\u20ac')
					is[i_1_] = (byte) -128;
				else if ('\u201a' == c)
					is[i_1_] = (byte) -126;
				else if ('\u0192' == c)
					is[i_1_] = (byte) -125;
				else if (c == '\u201e')
					is[i_1_] = (byte) -124;
				else if (c == '\u2026')
					is[i_1_] = (byte) -123;
				else if ('\u2020' == c)
					is[i_1_] = (byte) -122;
				else if ('\u2021' == c)
					is[i_1_] = (byte) -121;
				else if (c == '\u02c6')
					is[i_1_] = (byte) -120;
				else if ('\u2030' == c)
					is[i_1_] = (byte) -119;
				else if ('\u0160' == c)
					is[i_1_] = (byte) -118;
				else if (c == '\u2039')
					is[i_1_] = (byte) -117;
				else if (c == '\u0152')
					is[i_1_] = (byte) -116;
				else if ('\u017d' == c)
					is[i_1_] = (byte) -114;
				else if (c == '\u2018')
					is[i_1_] = (byte) -111;
				else if ('\u2019' == c)
					is[i_1_] = (byte) -110;
				else if ('\u201c' == c)
					is[i_1_] = (byte) -109;
				else if ('\u201d' == c)
					is[i_1_] = (byte) -108;
				else if (c == '\u2022')
					is[i_1_] = (byte) -107;
				else if (c == '\u2013')
					is[i_1_] = (byte) -106;
				else if ('\u2014' == c)
					is[i_1_] = (byte) -105;
				else if ('\u02dc' == c)
					is[i_1_] = (byte) -104;
				else if ('\u2122' == c)
					is[i_1_] = (byte) -103;
				else if (c == '\u0161')
					is[i_1_] = (byte) -102;
				else if ('\u203a' == c)
					is[i_1_] = (byte) -101;
				else if (c == '\u0153')
					is[i_1_] = (byte) -100;
				else if (c == '\u017e')
					is[i_1_] = (byte) -98;
				else if ('\u0178' == c)
					is[i_1_] = (byte) -97;
				else
					is[i_1_] = (byte) 63;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fh.o(").append(')').toString());
		}
	}

	static final void method1568(long l) {
		try {
			Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
			int i = client.anInt9156 * -1001744883 + (int) class260.aFloat2716;
			int i_2_ = 1012106921 * client.anInt9056 + (int) class260.aFloat2711;
			if (690880753 * IndexTable.anInt2906 - i < -2000 || 690880753 * IndexTable.anInt2906 - i > 2000 || -977385539 * Class308.anInt3194 - i_2_ < -2000 || Class308.anInt3194 * -977385539 - i_2_ > 2000) {
				IndexTable.anInt2906 = i * 1410396177;
				Class308.anInt3194 = i_2_ * -562451563;
			}
			if (i != IndexTable.anInt2906 * 690880753) {
				int i_3_ = i - 690880753 * IndexTable.anInt2906;
				int i_4_ = (int) ((long) i_3_ * l / 320L);
				if (i_3_ > 0) {
					if (i_4_ == 0)
						i_4_ = 1;
					else if (i_4_ > i_3_)
						i_4_ = i_3_;
				} else if (i_4_ == 0)
					i_4_ = -1;
				else if (i_4_ < i_3_)
					i_4_ = i_3_;
				IndexTable.anInt2906 += i_4_ * 1410396177;
			}
			if (Class308.anInt3194 * -977385539 != i_2_) {
				int i_5_ = i_2_ - -977385539 * Class308.anInt3194;
				int i_6_ = (int) (l * (long) i_5_ / 320L);
				if (i_5_ > 0) {
					if (0 == i_6_)
						i_6_ = 1;
					else if (i_6_ > i_5_)
						i_6_ = i_5_;
				} else if (i_6_ == 0)
					i_6_ = -1;
				else if (i_6_ < i_5_)
					i_6_ = i_5_;
				Class308.anInt3194 += -562451563 * i_6_;
			}
			client.aFloat9141 += (float) l * client.aFloat9072 / 6.0F;
			client.aFloat9250 += client.aFloat9124 * (float) l / 6.0F;
			Class344.method4003(-722522641);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fh.hk(").append(')').toString());
		}
	}

	public static int method1569(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, byte i_12_) {
		try {
			if (1 == (i_11_ & 0x1)) {
				int i_13_ = i_9_;
				i_9_ = i_10_;
				i_10_ = i_13_;
			}
			i_8_ &= 0x3;
			if (i_8_ == 0)
				return i;
			if (1 == i_8_)
				return i_7_;
			if (2 == i_8_)
				return 7 - i - (i_9_ - 1);
			return 7 - i_7_ - (i_10_ - 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fh.o(").append(')').toString());
		}
	}
}
