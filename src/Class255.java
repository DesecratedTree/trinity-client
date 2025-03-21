/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class255 {
	public static int anInt2644 = 11;
	public static int anInt2645 = 3;
	public static int anInt2646 = 10;
	public static int anInt2647 = 6;
	public static int anInt2648 = 2;
	public static int anInt2649 = 12;
	public static int anInt2650 = 18;
	public static int anInt2651 = 8;
	public static int anInt2652 = 19;
	public static int anInt2653 = 14;
	public static int anInt2654 = 5;
	public static int anInt2655 = 1;
	public static int anInt2656 = 16;
	public static int anInt2657 = 4;
	public static int anInt2658 = 9;
	public static int anInt2659 = 0;
	public static int anInt2660 = 13;
	public static int anInt2661 = 7;
	public static int anInt2662 = 15;
	public static int anInt2663 = 17;
	static Class8 aClass8_2664;

	Class255() throws Throwable {
		throw new Error();
	}

	static final void method2538(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 1191381798);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class542.method6336(iComponentDefinitions, class120, class430, 2098630892);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ks.il(").append(')').toString());
		}
	}

	public static boolean method2539(char c, int i) {
		try {
			if (c >= ' ' && c <= '~')
				return true;
			if (c >= '\u00a0' && c <= '\u00ff')
				return true;
			if (c == '\u20ac' || '\u0152' == c || c == '\u2014' || c == '\u0153' || '\u0178' == c)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ks.d(").append(')').toString());
		}
	}

	static void method2540(Class_ra class_ra, byte i) {
		try {
			if ((-949225339 * Class9.anInt138 != Class263_Sub2.myPlayer.aByte8658) && client.aClass304_9030.method3023(-400722441) != null) {
				Class312.method3111((byte) 125);
				if (Class330_Sub45.method3737(class_ra, (Class263_Sub2.myPlayer.aByte8658), -2028983508))
					Class9.anInt138 = 744570957 * (Class263_Sub2.myPlayer.aByte8658);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ks.p(").append(')').toString());
		}
	}
}
