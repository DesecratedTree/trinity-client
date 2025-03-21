/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class211 {
	static Class211 aClass211_2058;
	static Class211 aClass211_2059 = new Class211();
	static Class211 aClass211_2060 = new Class211();
	static boolean aBoolean2061;
	public static Class505 aClass505_2062;

	static {
		aClass211_2058 = new Class211();
	}

	public int method2221(int i, int i_0_, byte i_1_) {
		try {
			int i_2_ = (-1548608507 * Class146.anInt1615 > i_0_ ? Class146.anInt1615 * -1548608507 : i_0_);
			if (this == aClass211_2059)
				return 0;
			if (aClass211_2058 == this)
				return i_2_ - i;
			if (aClass211_2060 == this)
				return (i_2_ - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iw.j(").append(')').toString());
		}
	}

	Class211() {
		/* empty */
	}

	public static String method2222(long l) {
		try {
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if (l % 37L == 0L)
				return null;
			int i = 0;
			for (long l_3_ = l; 0L != l_3_; l_3_ /= 37L)
				i++;
			StringBuilder stringbuilder = new StringBuilder(i);
			while (0L != l) {
				long l_4_ = l;
				l /= 37L;
				char c = Class443.aCharArray4493[(int) (l_4_ - 37L * l)];
				if ('_' == c) {
					int i_5_ = stringbuilder.length() - 1;
					stringbuilder.setCharAt(i_5_, Character.toUpperCase(stringbuilder.charAt(i_5_)));
					c = '\u00a0';
				}
				stringbuilder.append(c);
			}
			stringbuilder.reverse();
			stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iw.i(").append(')').toString());
		}
	}

	static final void method2223(Class430 class430, short i) {
		try {
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_6_, -781817212);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = iComponentDefinitions.aString1266;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iw.rx(").append(')').toString());
		}
	}
}
