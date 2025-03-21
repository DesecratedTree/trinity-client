/* Class479 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class479 implements Iterator {
	Class330_Sub36 aClass330_Sub36_5726;
	Class330_Sub36 aClass330_Sub36_5727 = null;
	Class472 aClass472_5728;

	void method6010(int i) {
		try {
			((Class479) this).aClass330_Sub36_5726 = (((Class479) this).aClass472_5728.aClass330_Sub36_5613.aClass330_Sub36_7735);
			((Class479) this).aClass330_Sub36_5727 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.f(").append(')').toString());
		}
	}

	public Object next() {
		try {
			Class330_Sub36 class330_sub36 = ((Class479) this).aClass330_Sub36_5726;
			if (class330_sub36 == ((Class479) this).aClass472_5728.aClass330_Sub36_5613) {
				class330_sub36 = null;
				((Class479) this).aClass330_Sub36_5726 = null;
			} else
				((Class479) this).aClass330_Sub36_5726 = class330_sub36.aClass330_Sub36_7735;
			((Class479) this).aClass330_Sub36_5727 = class330_sub36;
			return class330_sub36;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.next(").append(')').toString());
		}
	}

	public void remove() {
		try {
			if (null == ((Class479) this).aClass330_Sub36_5727)
				throw new IllegalStateException();
			((Class479) this).aClass330_Sub36_5727.method3439((byte) -106);
			((Class479) this).aClass330_Sub36_5727 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.remove(").append(')').toString());
		}
	}

	public boolean hasNext() {
		try {
			return (((Class479) this).aClass472_5728.aClass330_Sub36_5613 != ((Class479) this).aClass330_Sub36_5726);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.hasNext(").append(')').toString());
		}
	}

	public Class330_Sub36 method6011(byte i) {
		try {
			method6010(743443457);
			return (Class330_Sub36) next();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.z(").append(')').toString());
		}
	}

	public Class479(Class472 class472) {
		((Class479) this).aClass472_5728 = class472;
		((Class479) this).aClass330_Sub36_5726 = (((Class479) this).aClass472_5728.aClass330_Sub36_5613.aClass330_Sub36_7735);
		((Class479) this).aClass330_Sub36_5727 = null;
	}

	public static void method6012(byte i) {
		try {
			for (Class330_Sub43 class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6099((byte) 20)); null != class330_sub43; class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6098((short) -32768)))
				Class502.method6132(-1340253797 * ((Class330_Sub43) class330_sub43).anInt7819, (byte) -19);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.w(").append(')').toString());
		}
	}

	static final void method6013(Class432_Sub1 class432_sub1, int i, int i_0_) {
		try {
			Class276.method2729(class432_sub1, i, false, -2128331407);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.jo(").append(')').toString());
		}
	}

	public static void method6014(int i) {
		try {
			Class95_Sub11.method1129(-1, 255, 1749277043);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.y(").append(')').toString());
		}
	}

	public static Interface26 method6015(Interface26[] interface26s, int i, byte i_1_) {
		try {
			Interface26[] interface26s_2_ = interface26s;
			for (int i_3_ = 0; i_3_ < interface26s_2_.length; i_3_++) {
				Interface26 interface26 = interface26s_2_[i_3_];
				if (i == interface26.method297((short) -7218))
					return interface26;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.r(").append(')').toString());
		}
	}

	static final void method6016(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_4_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_5_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			int i_6_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 2]);
			Class498.method6110(9, i_4_ << 16 | i_5_, i_6_, "", (byte) 41);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tv.anb(").append(')').toString());
		}
	}
}
