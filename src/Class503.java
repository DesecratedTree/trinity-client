/* Class503 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class503 {
	public static boolean aBoolean5914 = true;
	public static String aString5915;
	static int anInt5916;

	Class503() throws Throwable {
		throw new Error();
	}

	static final void method6133(Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class43.method590(string, -1928689146);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uu.wg(").append(')').toString());
		}
	}

	static final void method6134(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class354.method4083(i_0_);
			if (class330_sub36_sub12 == null) {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			} else {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (class330_sub36_sub12.anInt9702 * 518332863 >> 14 & 0x3fff);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 518332863 * class330_sub36_sub12.anInt9702 & 0x3fff;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uu.aew(").append(')').toString());
		}
	}

	static void method6135(Class_ra class_ra, Class473 class473, int i, int i_1_, int i_2_, byte i_3_) {
		try {
			Class522 class522 = Class497.aClass552_5884.method6382(-573273839 * class473.anInt5652, 1519259108);
			if (class522.anInt6019 * -1331179567 != -1) {
				if (class473.aBoolean5653) {
					i += class473.anInt5654 * 1571145659;
					i &= 0x3;
				} else
					i = 0;
				Class61 class61 = class522.method6227(class_ra, i, class473.aBoolean5655, (byte) -6);
				if (null != class61) {
					int i_4_ = 564595847 * class473.anInt5674;
					int i_5_ = -639841087 * class473.anInt5680;
					if (1 == (i & 0x1)) {
						i_4_ = class473.anInt5680 * -639841087;
						i_5_ = 564595847 * class473.anInt5674;
					}
					int i_6_ = class61.method318();
					int i_7_ = class61.method683();
					if (class522.aBoolean6018) {
						i_6_ = i_4_ * 4;
						i_7_ = 4 * i_5_;
					}
					if (class522.anInt6020 * 116608347 != 0)
						class61.method691(i_1_, i_2_ - (i_5_ - 1) * 4, i_6_, i_7_, 0, (~0xffffff | class522.anInt6020 * 116608347), 1);
					else
						class61.method690(i_1_, i_2_ - 4 * (i_5_ - 1), i_6_, i_7_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uu.w(").append(')').toString());
		}
	}
}
