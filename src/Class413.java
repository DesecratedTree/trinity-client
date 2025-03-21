/* Class413 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class413 {
	public static int anInt4259 = 6;
	public static int anInt4260;

	Class413() throws Throwable {
		throw new Error();
	}

	static final void method5238(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -97701783);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 1080667159 * iComponentDefinitions.anInt1243;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("re.rs(").append(')').toString());
		}
	}

	static final int method5239(int i, int i_1_, int i_2_, int i_3_) {
		try {
			if (i_1_ == i)
				return i;
			int i_4_ = 128 - i_2_;
			int i_5_ = i_2_ * (i_1_ & 0x7f) + i_4_ * (i & 0x7f) >> 7;
			int i_6_ = (i & 0x380) * i_4_ + i_2_ * (i_1_ & 0x380) >> 7;
			int i_7_ = (i_1_ & 0xfc00) * i_2_ + i_4_ * (i & 0xfc00) >> 7;
			return i_7_ & 0xfc00 | i_6_ & 0x380 | i_5_ & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("re.e(").append(')').toString());
		}
	}
}
