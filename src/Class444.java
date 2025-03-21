/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class444 {
	public static int anInt4494 = 4;
	static int[] anIntArray4495;
	public static Buffer aClass330_Sub46_4496;

	Class444() throws Throwable {
		throw new Error();
	}

	static final void method5616(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_0_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_1_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 2]);
			if (i_1_ == -1)
				throw new RuntimeException();
			Class506 class506 = Class211.aClass505_2062.method6140(i_1_, 2072101095);
			if (class506.aChar5921 != i_0_)
				throw new RuntimeException();
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class506.method6146(Integer.valueOf(i_2_), (byte) 1) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sj.vg(").append(')').toString());
		}
	}

	static void method5617(int i) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(15, 0L);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sj.aw(").append(')').toString());
		}
	}

	static void method5618(int i) {
		try {
			if (Class333.aClass326_3362 != null) {
				Class333.aClass326_3362 = null;
				Class374.method4341(256, (short) 5639);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sj.d(").append(')').toString());
		}
	}
}
