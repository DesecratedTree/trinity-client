/* Exception_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub4 extends Exception {
	Exception_Sub4() {
		/* empty */
	}

	static final void method344(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			((Class430) class430).anInt4376 -= 1514958270;
			int i_1_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			if (i_1_ < 0 || i_1_ >= ((Class430) class430).anIntArray4373[i_0_])
				throw new RuntimeException();
			((Class430) class430).anIntArrayArray4374[i_0_][i_1_] = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agy.au(").append(')').toString());
		}
	}
}
