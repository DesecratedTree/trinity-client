/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class201 implements Interface10 {
	public int anInt6501;
	public Class211 aClass211_6502;
	public int anInt6503;
	public int anInt6504;
	public int anInt6505;
	public int anInt6506;
	public Class195 aClass195_6507;
	public int anInt6508;
	public int anInt6509;
	public static Class463 aClass463_6510;
	public static Class436 aClass436_6511;

	public Class198 method159(byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("il.j(").append(')').toString());
		}
	}

	public Class198 method160() {
		return null;
	}

	Class201(Class195 class195, Class211 class211, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass195_6507 = class195;
		aClass211_6502 = class211;
		anInt6501 = i * 1820924411;
		anInt6504 = -423627263 * i_0_;
		anInt6505 = 1298809887 * i_1_;
		anInt6503 = i_2_ * 1332822115;
		anInt6506 = -1815363765 * i_3_;
		anInt6508 = -650116793 * i_4_;
		anInt6509 = -952984271 * i_5_;
	}

	public Class198 method161() {
		return null;
	}

	static void method2162(String[] strings, short[] is, int i, int i_6_, int i_7_) {
		try {
			if (i < i_6_) {
				int i_8_ = (i_6_ + i) / 2;
				int i_9_ = i;
				String string = strings[i_8_];
				strings[i_8_] = strings[i_6_];
				strings[i_6_] = string;
				short i_10_ = is[i_8_];
				is[i_8_] = is[i_6_];
				is[i_6_] = i_10_;
				for (int i_11_ = i; i_11_ < i_6_; i_11_++) {
					if (null == string || (strings[i_11_] != null && strings[i_11_].compareTo(string) < (i_11_ & 0x1))) {
						String string_12_ = strings[i_11_];
						strings[i_11_] = strings[i_9_];
						strings[i_9_] = string_12_;
						short i_13_ = is[i_11_];
						is[i_11_] = is[i_9_];
						is[i_9_++] = i_13_;
					}
				}
				strings[i_6_] = strings[i_9_];
				strings[i_9_] = string;
				is[i_6_] = is[i_9_];
				is[i_9_] = i_10_;
				method2162(strings, is, i, i_9_ - 1, 568290200);
				method2162(strings, is, 1 + i_9_, i_6_, -1045454460);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("il.j(").append(')').toString());
		}
	}

	static final void method2163(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7874, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), -1584894524);
			Class171.method2046(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1155813826), false, -1681519333);
			Class435.method5568(1758556281);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("il.akc(").append(')').toString());
		}
	}

	static void method2164(boolean bool, byte i) {
		try {
			Class5.aString73 = Class5.aString73.trim();
			if (Class5.aString73.length() != 0) {
				Class56.panelBoxMessage(new StringBuilder().append("--> ").append(Class5.aString73).toString(), -1622987561);
				Console.method5241(Class5.aString73, false, bool, 797488543);
				Class5.anInt72 = 0;
				if (!bool) {
					Class5.anInt76 = 0;
					Class5.aString73 = "";
				} else
					Class5.anInt76 = Class5.aString73.length() * 616558173;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("il.l(").append(')').toString());
		}
	}

	static final void method2165(Class430 class430, int i) {
		try {
			int i_14_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_14_, -1625237497);
			Class120 class120 = Class3.aClass120Array56[i_14_ >> 16];
			Class478.method6009(iComponentDefinitions, class120, class430, 178880377);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("il.eu(").append(')').toString());
		}
	}
}
