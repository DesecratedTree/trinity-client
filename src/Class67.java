/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class67 {
	Class497 aClass497_579;
	int anInt580;
	public static IndexTable aClass280_581;

	public void method790(int i) {
		try {
			if (((Class67) this).aClass497_579 != null)
				((Class67) this).aClass497_579.method6100(65280);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.r(").append(')').toString());
		}
	}

	public void method791(int i, int i_0_, int i_1_) {
		try {
			if (null == ((Class67) this).aClass497_579)
				((Class67) this).aClass497_579 = new Class497(-1986841853 * ((Class67) this).anInt580);
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class67) this).aClass497_579.method6094((long) i));
			if (class330_sub23 != null)
				class330_sub23.anInt7693 = -457940705 * i_0_;
			else {
				class330_sub23 = new Class330_Sub23(i_0_);
				((Class67) this).aClass497_579.method6097(class330_sub23, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.j(").append(')').toString());
		}
	}

	public int method792(int i, byte i_2_) {
		try {
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class67) this).aClass497_579.method6094((long) i));
			if (class330_sub23 != null)
				return class330_sub23.anInt7693 * 393599711;
			Class500 class500 = Class499.aClass495_5893.method6086(i, (byte) 1);
			if (class500.aChar5894 != 'i')
				return -1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.i(").append(')').toString());
		}
	}

	Class67(int i) {
		((Class67) this).anInt580 = -274378837 * i;
	}

	public int method793(int i, int i_3_) {
		try {
			Class438 class438 = Class95_Sub10.aClass447_7170.method5621(i, (byte) 3);
			int i_4_ = class438.anInt4447 * -1472864963;
			int i_5_ = (31 == class438.anInt4448 * -359030647 ? -1 : (1 << 1 + class438.anInt4448 * -359030647) - 1);
			return ((method792(i_4_, (byte) -39) & i_5_) >>> 1670785459 * class438.anInt4446);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.p(").append(')').toString());
		}
	}

	static final void method794(Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class135.method1585(string, i_6_, 693051023);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.ww(").append(')').toString());
		}
	}

	public static boolean method795(char c, short i) {
		try {
			return c >= '0' && c <= '9';
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.q(").append(')').toString());
		}
	}

	static final void method796(Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_7_ >> 28;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.uj(").append(')').toString());
		}
	}

	static final void method797(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cs.uk(").append(')').toString());
		}
	}
}
