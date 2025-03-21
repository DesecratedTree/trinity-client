/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheIndex {
	public static CacheIndex INDEX_18;
	public static CacheIndex INDEX_1;
	public static CacheIndex INDEX_2;
	public static CacheIndex INDEX_3;
	public static CacheIndex INDEX_16;
	public static CacheIndex INDEX_5;
	public static CacheIndex INDEX_6;
	public static CacheIndex INDEX_7;
	public static CacheIndex INDEX_8;
	public static CacheIndex INDEX_9;
	static int cacheIndex;
	public static CacheIndex INDEX_33;
	public static CacheIndex INDEX_35;
	public static CacheIndex INDEX_28;
	public static CacheIndex INDEX_17;
	public static CacheIndex INDEX_15;
	public static CacheIndex aClass124_1426 = new CacheIndex(0, "", false, false);
	public static CacheIndex INDEX_10;
	public static CacheIndex INDEX_21;
	public static CacheIndex INDEX_19;
	public static CacheIndex INDEX_20;
	public static CacheIndex INDEX_11;
	public static CacheIndex INDEX_22;
	public static CacheIndex INDEX_23;
	public static CacheIndex INDEX_24;
	public static CacheIndex INDEX_25;
	public static CacheIndex INDEX_26;
	public static CacheIndex INDEX_27;
	public static CacheIndex INDEX_13;
	public static CacheIndex INDEX_14;
	public static CacheIndex INDEX_30;
	public static CacheIndex INDEX_31;
	public static CacheIndex INDEX_29;
	public static CacheIndex INDEX_34;
	public static CacheIndex INDEX_4;
	public static CacheIndex INDEX_32;
	public static CacheIndex INDEX_36;
	public static CacheIndex INDEX_37;
	int anInt1448;
	public static CacheIndex INDEX_12;
	public static Class154 aClass154_1450;

	CacheIndex(int i, String string, boolean bool, boolean bool_0_) {
		((CacheIndex) this).anInt1448 = 1212336999 * i;
	}

	public int method1519(byte i) {
		try {
			return ((CacheIndex) this).anInt1448 * 488644695;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ez.j(").append(')').toString());
		}
	}

	static {
		INDEX_1 = new CacheIndex(1, "", false, false);
		INDEX_2 = new CacheIndex(2, "", true, false);
		INDEX_3 = new CacheIndex(3, "", true, false);
		INDEX_4 = new CacheIndex(4, "", false, false);
		INDEX_5 = new CacheIndex(5, "", false, false);
		INDEX_6 = new CacheIndex(6, "", false, false);
		INDEX_7 = new CacheIndex(7, "", false, false);
		INDEX_8 = new CacheIndex(8, "", false, false);
		INDEX_9 = new CacheIndex(9, "", false, false);
		INDEX_10 = new CacheIndex(10, "", false, false);
		INDEX_11 = new CacheIndex(11, "", false, false);
		INDEX_12 = new CacheIndex(12, "", false, false);
		INDEX_13 = new CacheIndex(13, "", false, false);
		INDEX_14 = new CacheIndex(14, "", false, false);
		INDEX_15 = new CacheIndex(15, "", false, false);
		INDEX_16 = new CacheIndex(16, "", true, false);
		INDEX_17 = new CacheIndex(17, "", true, false);
		INDEX_18 = new CacheIndex(18, "", true, false);
		INDEX_19 = new CacheIndex(19, "", true, false);
		INDEX_20 = new CacheIndex(20, "", true, false);
		INDEX_21 = new CacheIndex(21, "", true, false);
		INDEX_22 = new CacheIndex(22, "", true, false);
		INDEX_23 = new CacheIndex(23, "", true, false);
		INDEX_24 = new CacheIndex(24, "", true, false);
		INDEX_25 = new CacheIndex(25, "", true, false);
		INDEX_26 = new CacheIndex(26, "", false, false);
		INDEX_27 = new CacheIndex(27, "", false, false);
		INDEX_28 = new CacheIndex(28, "", false, false);
		INDEX_29 = new CacheIndex(29, "", false, false);
		INDEX_30 = new CacheIndex(30, "", false, false);
		INDEX_31 = new CacheIndex(31, "", false, false);
		INDEX_32 = new CacheIndex(32, "", false, false);
		INDEX_33 = new CacheIndex(33, "", false, false);
		INDEX_34 = new CacheIndex(34, "", false, false);
		INDEX_35 = new CacheIndex(35, "", true, false);
		INDEX_36 = new CacheIndex(36, "", false, false);
		INDEX_37 = new CacheIndex(37, "", false, false);
		cacheIndex = -951624919;
	}

	static final void method1520(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class354.anInt3510 + 1926560771 * Class204.anInt6517;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -694314711 * Class149_Sub1.anInt8867 + Class354.anInt3516;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ez.aec(").append(')').toString());
		}
	}

	static String method1521(CharSequence charsequence, Class547 class547, int i) {
		try {
			if (charsequence == null)
				return null;
			int i_1_ = 0;
			int i_2_;
			for (i_2_ = charsequence.length(); i_1_ < i_2_ && Class162.method1916(charsequence.charAt(i_1_), -1061652348); i_1_++) {
				/* empty */
			}
			for (/**/; (i_2_ > i_1_ && Class162.method1916(charsequence.charAt(i_2_ - 1), -1972760693)); i_2_--) {
				/* empty */
			}
			int i_3_ = i_2_ - i_1_;
			if (i_3_ < 1 || i_3_ > Class391.method4605(class547, (byte) 27))
				return null;
			StringBuilder stringbuilder = new StringBuilder(i_3_);
			for (int i_4_ = i_1_; i_4_ < i_2_; i_4_++) {
				char c = charsequence.charAt(i_4_);
				if (!Class95.method1106(c, (byte) 6)) {
					if (i == -677627593)
						throw new IllegalStateException();
				} else {
					char c_5_ = Class72.method831(c, (byte) -103);
					if (c_5_ == 0) {
						if (i == -677627593) {
							/* empty */
						}
					} else
						stringbuilder.append(c_5_);
				}
			}
			if (stringbuilder.length() == 0)
				return null;
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ez.o(").append(')').toString());
		}
	}

	static boolean method1522(int i, byte i_6_) {
		try {
			return i == 12 || 2 == i || 10 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ez.fm(").append(')').toString());
		}
	}

	public static final void method1523(int i) {
		try {
			if (!client.aBoolean9075) {
				client.aFloat9072 += (-24.0F - client.aFloat9072) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9075 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ez.hy(").append(')').toString());
		}
	}
}
