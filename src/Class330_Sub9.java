/* Class330_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class330_Sub9 extends Class330 {
	public Class471 aClass471_7573 = new Class471();

	Class330_Sub9() {
		/* empty */
	}

	static final void method3282(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			((Class430) class430).anInt4376 -= 1514958270;
			int i_0_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_1_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string.substring(i_0_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acn.aau(").append(')').toString());
		}
	}

	public static Class_ra method3283(Canvas canvas, Interface_ma interface_ma, int i, int i_2_, int i_3_) {
		try {
			return new ja(canvas, interface_ma, i, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acn.r(").append(')').toString());
		}
	}

	static final void method3284(Class430 class430, byte i) {
		try {
			Class432_Sub1_Sub4_Sub2.anInt10001 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acn.adz(").append(')').toString());
		}
	}

	static int method3285(char c, Class454 class454, int i) {
		try {
			int i_4_ = c << 4;
			if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
				int i_5_ = Character.toLowerCase(c);
				i_4_ = 1 + (i_5_ << 4);
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acn.p(").append(')').toString());
		}
	}

	public static void method3286(int i) {
		try {
			if (Class239.anInterface14Array2584 != null) {
				Interface14[] interface14s = Class239.anInterface14Array2584;
				for (int i_6_ = 0; i_6_ < interface14s.length; i_6_++) {
					Interface14 interface14 = interface14s[i_6_];
					interface14.method203(-942418178);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acn.s(").append(')').toString());
		}
	}
}
