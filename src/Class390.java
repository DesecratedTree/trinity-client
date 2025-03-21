/* Class390 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class390 {
	public static Class390 aClass390_4034 = new Class390(0, 2, 2, 1);
	static Class390 aClass390_4035;
	public static Class390 aClass390_4036;
	static Class390 aClass390_4037;
	public static Class390 aClass390_4038;
	public int anInt4039;
	static Class390 aClass390_4040;
	static Class390 aClass390_4041;
	public static Class390 aClass390_4042;
	public static Class390 aClass390_4043;
	static Class390 aClass390_4044;
	static Class390 aClass390_4045;
	static Class390 aClass390_4046;
	static Class390 aClass390_4047;
	public int anInt4048;
	public int anInt4049;
	public int anInt4050;
	public static Class390 aClass390_4051 = new Class390(1, 2, 2, 0);

	static {
		aClass390_4045 = new Class390(2, 4, 4, 0);
		aClass390_4037 = new Class390(4, 1, 1, 1);
		aClass390_4038 = new Class390(6, 0, 4, 2);
		aClass390_4036 = new Class390(7, 0, 1, 1);
		aClass390_4040 = new Class390(8, 0, 4, 1);
		aClass390_4041 = new Class390(9, 0, 4, 1);
		aClass390_4042 = new Class390(10, 2, 2, 0);
		aClass390_4043 = new Class390(11, 0, 1, 2);
		aClass390_4044 = new Class390(12, 0, 1, 0);
		aClass390_4035 = new Class390(13, 0, 1, 0);
		aClass390_4046 = new Class390(14, 0, 4, 1);
		aClass390_4047 = new Class390(15, 0, 1, 0);
	}

	Class390(int i, int i_0_, int i_1_, int i_2_) {
		anInt4048 = 2075441921 * i;
		anInt4049 = -1902217297 * i_0_;
		anInt4050 = -1160172487 * i_1_;
		anInt4039 = -1981744287 * i_2_;
	}

	public static void method4600(long[] ls, int[] is, byte i) {
		try {
			Class384.method4415(ls, is, 0, ls.length - 1, -1442854304);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qd.s(").append(')').toString());
		}
	}

	static final void method4601(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class147.anInt1621 * -1551406343 == 4 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qd.ahf(").append(')').toString());
		}
	}

	public static int method4602(byte[] is, int i, CharSequence charsequence, byte i_3_) {
		try {
			int i_4_ = charsequence.length();
			int i_5_ = i;
			for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
				int i_7_ = charsequence.charAt(i_6_);
				if (i_7_ <= 127)
					is[i_5_++] = (byte) i_7_;
				else if (i_7_ <= 2047) {
					is[i_5_++] = (byte) (0xc0 | i_7_ >> 6);
					is[i_5_++] = (byte) (0x80 | i_7_ & 0x3f);
				} else {
					is[i_5_++] = (byte) (0xe0 | i_7_ >> 12);
					is[i_5_++] = (byte) (0x80 | i_7_ >> 6 & 0x3f);
					is[i_5_++] = (byte) (0x80 | i_7_ & 0x3f);
				}
			}
			return i_5_ - i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qd.j(").append(')').toString());
		}
	}
}
