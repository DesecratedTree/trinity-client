/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class275 {
	public static int anInt2853 = 1;
	public static int anInt2854 = 0;
	public static int anInt2855 = 5;
	public static int anInt2856 = 2;
	public static int anInt2857 = 6;

	Class275() throws Throwable {
		throw new Error();
	}

	static final void method2716(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -1697603561 * ((Class430) class430).aClass154_4391.anInt1649;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ll.xd(").append(')').toString());
		}
	}

	public static int method2717(CharSequence charsequence, int i, int i_0_, byte[] is, int i_1_, int i_2_) {
		try {
			int i_3_ = i_0_ - i;
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				char c = charsequence.charAt(i_4_ + i);
				if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
					is[i_1_ + i_4_] = (byte) c;
				else if ('\u20ac' == c)
					is[i_4_ + i_1_] = (byte) -128;
				else if (c == '\u201a')
					is[i_4_ + i_1_] = (byte) -126;
				else if ('\u0192' == c)
					is[i_4_ + i_1_] = (byte) -125;
				else if (c == '\u201e')
					is[i_1_ + i_4_] = (byte) -124;
				else if ('\u2026' == c)
					is[i_4_ + i_1_] = (byte) -123;
				else if (c == '\u2020')
					is[i_4_ + i_1_] = (byte) -122;
				else if ('\u2021' == c)
					is[i_1_ + i_4_] = (byte) -121;
				else if (c == '\u02c6')
					is[i_4_ + i_1_] = (byte) -120;
				else if (c == '\u2030')
					is[i_1_ + i_4_] = (byte) -119;
				else if (c == '\u0160')
					is[i_4_ + i_1_] = (byte) -118;
				else if (c == '\u2039')
					is[i_1_ + i_4_] = (byte) -117;
				else if (c == '\u0152')
					is[i_4_ + i_1_] = (byte) -116;
				else if ('\u017d' == c)
					is[i_1_ + i_4_] = (byte) -114;
				else if (c == '\u2018')
					is[i_1_ + i_4_] = (byte) -111;
				else if (c == '\u2019')
					is[i_4_ + i_1_] = (byte) -110;
				else if ('\u201c' == c)
					is[i_1_ + i_4_] = (byte) -109;
				else if (c == '\u201d')
					is[i_1_ + i_4_] = (byte) -108;
				else if ('\u2022' == c)
					is[i_4_ + i_1_] = (byte) -107;
				else if (c == '\u2013')
					is[i_4_ + i_1_] = (byte) -106;
				else if (c == '\u2014')
					is[i_1_ + i_4_] = (byte) -105;
				else if (c == '\u02dc')
					is[i_4_ + i_1_] = (byte) -104;
				else if (c == '\u2122')
					is[i_4_ + i_1_] = (byte) -103;
				else if (c == '\u0161')
					is[i_1_ + i_4_] = (byte) -102;
				else if ('\u203a' == c)
					is[i_4_ + i_1_] = (byte) -101;
				else if ('\u0153' == c)
					is[i_4_ + i_1_] = (byte) -100;
				else if ('\u017e' == c)
					is[i_1_ + i_4_] = (byte) -98;
				else if ('\u0178' == c)
					is[i_1_ + i_4_] = (byte) -97;
				else
					is[i_1_ + i_4_] = (byte) 63;
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ll.s(").append(')').toString());
		}
	}

	public static void method2718(int i, int i_5_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(7, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ll.l(").append(')').toString());
		}
	}
}
