/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class461 {
	public Class325_Sub3 aClass325_Sub3_5569 = new Class325_Sub3();
	Class325_Sub3 aClass325_Sub3_5570;

	public void method5693(Class325_Sub3 class325_sub3, int i) {
		try {
			if (null != class325_sub3.aClass325_Sub3_7482)
				class325_sub3.method3216((byte) -31);
			class325_sub3.aClass325_Sub3_7482 = aClass325_Sub3_5569.aClass325_Sub3_7482;
			class325_sub3.aClass325_Sub3_7483 = aClass325_Sub3_5569;
			class325_sub3.aClass325_Sub3_7482.aClass325_Sub3_7483 = class325_sub3;
			class325_sub3.aClass325_Sub3_7483.aClass325_Sub3_7482 = class325_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.r(").append(')').toString());
		}
	}

	public Class325_Sub3 method5694(int i) {
		try {
			Class325_Sub3 class325_sub3 = aClass325_Sub3_5569.aClass325_Sub3_7483;
			if (aClass325_Sub3_5569 == class325_sub3) {
				((Class461) this).aClass325_Sub3_5570 = null;
				return null;
			}
			((Class461) this).aClass325_Sub3_5570 = class325_sub3.aClass325_Sub3_7483;
			return class325_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.j(").append(')').toString());
		}
	}

	public Class325_Sub3 method5695(int i) {
		try {
			Class325_Sub3 class325_sub3 = ((Class461) this).aClass325_Sub3_5570;
			if (aClass325_Sub3_5569 == class325_sub3) {
				((Class461) this).aClass325_Sub3_5570 = null;
				return null;
			}
			((Class461) this).aClass325_Sub3_5570 = class325_sub3.aClass325_Sub3_7483;
			return class325_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.i(").append(')').toString());
		}
	}

	public void method5696(int i) {
		try {
			for (;;) {
				Class325_Sub3 class325_sub3 = aClass325_Sub3_5569.aClass325_Sub3_7483;
				if (aClass325_Sub3_5569 == class325_sub3) {
					if (i == -923633274)
						throw new IllegalStateException();
					break;
				}
				class325_sub3.method3216((byte) -46);
			}
			((Class461) this).aClass325_Sub3_5570 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.p(").append(')').toString());
		}
	}

	public int method5697(int i) {
		try {
			int i_0_ = 0;
			for (Class325_Sub3 class325_sub3 = aClass325_Sub3_5569.aClass325_Sub3_7483; aClass325_Sub3_5569 != class325_sub3; class325_sub3 = class325_sub3.aClass325_Sub3_7483)
				i_0_++;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.o(").append(')').toString());
		}
	}

	public Class461() {
		aClass325_Sub3_5569.aClass325_Sub3_7483 = aClass325_Sub3_5569;
		aClass325_Sub3_5569.aClass325_Sub3_7482 = aClass325_Sub3_5569;
	}

	public boolean method5698(int i) {
		try {
			return (aClass325_Sub3_5569 == aClass325_Sub3_5569.aClass325_Sub3_7483);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.s(").append(')').toString());
		}
	}

	public static Class524 method5699(IndexTable class280, int i, int i_1_, int i_2_) {
		try {
			byte[] is = class280.getFile(i, i_1_);
			if (is == null)
				return null;
			return new Class524(is);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.r(").append(')').toString());
		}
	}

	static final void method5700(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5743((byte) 9) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.alu(").append(')').toString());
		}
	}

	static void method5701(int i, int i_3_, int i_4_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(6, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = i_3_ * 229745735;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tc.aq(").append(')').toString());
		}
	}
}
