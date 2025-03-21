/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class72 {
	public int anInt609;
	public static Class72 aClass72_610;
	public static Class72 aClass72_611;
	public static Class72 aClass72_612;
	public static Class72 aClass72_613;
	public static Class72 aClass72_614 = new Class72(9, 3);
	static Class72 aClass72_615;
	static Class72 aClass72_616;
	public static Class72 aClass72_617;
	public static Class72 aClass72_618;
	public int anInt619;
	public static Class72 aClass72_620 = new Class72(3, 4);
	static long aLong621;

	static {
		aClass72_611 = new Class72(2, 1);
		aClass72_612 = new Class72(4, 1);
		aClass72_613 = new Class72(6, 2);
		aClass72_610 = new Class72(7, 1);
		aClass72_615 = new Class72(5, 3);
		aClass72_616 = new Class72(0, 4);
		aClass72_617 = new Class72(8, 1);
		aClass72_618 = new Class72(1, 1);
	}

	Class72(int i, int i_0_) {
		anInt619 = i * 61169301;
		anInt609 = 1612989855 * i_0_;
	}

	static void method828(int i, byte i_1_) {
		try {
			if (i == 7)
				throw new Error();
			if (i == 2)
				throw new OutOfMemoryError();
			try {
				if (25 == i)
					Class26.method488(1123692809);
				else if (9 == i)
					Class56.panelBoxMessage(new StringBuilder().append("").append(Class332.anInt6603 * 2061800443).toString(), -1893746310);
				else if (i == 19) {
					Class358 class358 = (client.aClass304_9030.method3023(-400722441).aClass358_3649);
					class358.aBoolean3724 = !class358.aBoolean3724;
				} else if (i == 29)
					client.aBoolean8983 = true;
				else if (15 == i)
					client.aBoolean8983 = false;
				else if (16 == i)
					client.aClass467_9061.method5851(65536);
				else if (i == 4) {
					Class317.method3151(1565557914);
					for (int i_2_ = 0; i_2_ < 10; i_2_++)
						System.gc();
					Runtime runtime = Runtime.getRuntime();
					int i_3_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					Class56.panelBoxMessage(new StringBuilder().append("").append(i_3_).toString(), -1426354986);
				} else if (i == 6) {
					Class317.method3151(1751858754);
					for (int i_4_ = 0; i_4_ < 10; i_4_++)
						System.gc();
					Runtime runtime = Runtime.getRuntime();
					int i_5_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					Class56.panelBoxMessage(new StringBuilder().append("").append(i_5_).toString(), -159316383);
					Class464_Sub20.method5808((byte) 41);
					Class317.method3151(1830977337);
					for (int i_6_ = 0; i_6_ < 10; i_6_++)
						System.gc();
					i_5_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					Class56.panelBoxMessage(new StringBuilder().append("").append(i_5_).toString(), -546772254);
				} else if (24 == i)
					Class56.panelBoxMessage((Class263.aClass321_2734.method332((byte) 93) ? "Success" : "Failure"), 1495568406);
				else if (13 == i)
					Class507.aClass498_5930.method6107(45333286);
				else if (14 == i)
					Class140_Sub1.aClass285_7263.method2840((byte) -36);
				else if (i == 21)
					Class140_Sub1.aClass285_7263.method2848(1142070066);
				else if (i == 11)
					Class475.aCanvas5700.setLocation(50, 50);
				else if (i == 17)
					Class475.aCanvas5700.setLocation((-1722268593 * Class332.anInt6611), (1819216065 * Class332.anInt6612));
				else if (i == 8)
					Class456.method5654(-1616080563);
				else if (28 == i) {
					client.aClass304_9030.aLong3109 = (Class312.method3111((byte) 52) * 7868587444006626349L);
					client.aClass304_9030.aBoolean3098 = true;
					Class456.method5654(642699565);
				} else if (22 == i) {
					Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
					Class56.panelBoxMessage(new StringBuilder().append((int) class260.aFloat2716 >> 9).append(" ").append((int) class260.aFloat2711 >> 9).toString(), 303048347);
				} else if (i == 26) {
					Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
					Class56.panelBoxMessage(new StringBuilder().append("").append(client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[(Class263_Sub2.myPlayer.aByte8658)].method6417((int) class260.aFloat2716 >> 9, (int) class260.aFloat2711 >> 9, 279916142)).toString(), -509174722);
				} else if (1 == i) {
					Class56.panelBoxMessage(new StringBuilder().append(IComponentDefinitions.aClass367_1189.method4294(-1386154340)).append(" ").append(IComponentDefinitions.aClass367_1189.method4293((byte) -4)).toString(), -674217801);
					Class56.panelBoxMessage(new StringBuilder().append(IComponentDefinitions.aClass367_1310.method4294(1403308757)).append(" ").append(IComponentDefinitions.aClass367_1310.method4293((byte) -72)).toString(), -414993413);
					Class56.panelBoxMessage(new StringBuilder().append(Class556.aClass510_6392.aClass399_6780.method4697()).append(" ").append(Class556.aClass510_6392.aClass399_6780.method4694()).toString(), -2000238023);
				} else if (10 == i)
					Class50.method632(false, (byte) -16);
				else if (27 == i) {
					client.aBoolean8984 = !client.aBoolean8984;
					Class361.aClass_ra3793.dh(client.aBoolean8984);
					Class201_Sub1.method2166(1632830751);
				} else if (i == 23) {
					client.anInt8993 = 0;
					client.aClass304_9030.method3032(-1272232072);
				} else if (i == 20) {
					client.anInt8993 = 1745179469;
					client.aClass304_9030.method3032(1463901217);
				} else if (i == 5) {
					client.anInt8993 = -804608358;
					client.aClass304_9030.method3032(1698562823);
				}
			} catch (Exception exception) {
				Class56.panelBoxMessage((Class526.aClass526_6139.method6257(Class429.aClass454_4369, 991479434)), -446415173);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cx.g(").append(')').toString());
		}
	}

	public static boolean method829(CharSequence charsequence, int i) {
		try {
			return Class117.method1424(charsequence, 10, true, 1537138453);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cx.i(").append(')').toString());
		}
	}

	static final void method830(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean9273 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cx.ajd(").append(')').toString());
		}
	}

	static char method831(char c, byte i) {
		try {
			switch (c) {
			case '\u00c7':
			case '\u00e7':
				return 'c';
			case '\u00d1':
			case '\u00f1':
				return 'n';
			case '\u00d2':
			case '\u00d3':
			case '\u00d4':
			case '\u00d5':
			case '\u00d6':
			case '\u00f2':
			case '\u00f3':
			case '\u00f4':
			case '\u00f5':
			case '\u00f6':
				return 'o';
			case '#':
			case '[':
			case ']':
				return c;
			default:
				return Character.toLowerCase(c);
			case '\u00ff':
			case '\u0178':
				return 'y';
			case '\u00c0':
			case '\u00c1':
			case '\u00c2':
			case '\u00c3':
			case '\u00c4':
			case '\u00e0':
			case '\u00e1':
			case '\u00e2':
			case '\u00e3':
			case '\u00e4':
				return 'a';
			case '\u00c8':
			case '\u00c9':
			case '\u00ca':
			case '\u00cb':
			case '\u00e8':
			case '\u00e9':
			case '\u00ea':
			case '\u00eb':
				return 'e';
			case '\u00df':
				return 'b';
			case '\u00cd':
			case '\u00ce':
			case '\u00cf':
			case '\u00ed':
			case '\u00ee':
			case '\u00ef':
				return 'i';
			case ' ':
			case '-':
			case '_':
			case '\u00a0':
				return '_';
			case '\u00d9':
			case '\u00da':
			case '\u00db':
			case '\u00dc':
			case '\u00f9':
			case '\u00fa':
			case '\u00fb':
			case '\u00fc':
				return 'u';
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cx.s(").append(')').toString());
		}
	}

	static final void method832(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			Class197.method2147((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]), (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]), (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 2]), (((Class430) class430).anIntArray4387[3 + ((Class430) class430).anInt4376 * 1632830751]), true, 256, -980353334);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cx.tl(").append(')').toString());
		}
	}

	public static void method833(boolean bool, byte i) {
		try {
			if (null == Class239.aClass240_2592)
				Class532.method6302((byte) 84);
			if (bool)
				Class239.aClass240_2592.method2392((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cx.p(").append(')').toString());
		}
	}
}
