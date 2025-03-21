/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class467 {
	public static Class95[] aClass95Array5599;
	Class325 aClass325_5600;
	Class325 aClass325_5601 = new Class325();

	public void method5851(int i) {
		try {
			for (;;) {
				Class325 class325 = ((Class467) this).aClass325_5601.aClass325_3314;
				if (class325 == ((Class467) this).aClass325_5601) {
					if (i != 65536) {
						/* empty */
					}
					break;
				}
				class325.method3204(664523);
			}
			((Class467) this).aClass325_5600 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.r(").append(')').toString());
		}
	}

	public void method5852(Class325 class325, byte i) {
		try {
			if (null != class325.aClass325_3315)
				class325.method3204(-64237813);
			class325.aClass325_3315 = ((Class467) this).aClass325_5601.aClass325_3315;
			class325.aClass325_3314 = ((Class467) this).aClass325_5601;
			class325.aClass325_3315.aClass325_3314 = class325;
			class325.aClass325_3314.aClass325_3315 = class325;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.j(").append(')').toString());
		}
	}

	public Class467() {
		((Class467) this).aClass325_5601.aClass325_3314 = ((Class467) this).aClass325_5601;
		((Class467) this).aClass325_5601.aClass325_3315 = ((Class467) this).aClass325_5601;
	}

	public Class325 method5853(byte i) {
		try {
			Class325 class325 = ((Class467) this).aClass325_5601.aClass325_3314;
			if (((Class467) this).aClass325_5601 == class325)
				return null;
			class325.method3204(2036236452);
			return class325;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.o(").append(')').toString());
		}
	}

	public Class325 method5854(int i) {
		try {
			Class325 class325 = ((Class467) this).aClass325_5601.aClass325_3314;
			if (class325 == ((Class467) this).aClass325_5601) {
				((Class467) this).aClass325_5600 = null;
				return null;
			}
			((Class467) this).aClass325_5600 = class325.aClass325_3314;
			return class325;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.s(").append(')').toString());
		}
	}

	public boolean method5855(int i) {
		try {
			return (((Class467) this).aClass325_5601 == ((Class467) this).aClass325_5601.aClass325_3314);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.z(").append(')').toString());
		}
	}

	public void method5856(Class325 class325, int i) {
		try {
			if (class325.aClass325_3315 != null)
				class325.method3204(480412354);
			class325.aClass325_3315 = ((Class467) this).aClass325_5601;
			class325.aClass325_3314 = ((Class467) this).aClass325_5601.aClass325_3314;
			class325.aClass325_3315.aClass325_3314 = class325;
			class325.aClass325_3314.aClass325_3315 = class325;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.i(").append(')').toString());
		}
	}

	public Class325 method5857(int i) {
		try {
			Class325 class325 = ((Class467) this).aClass325_5600;
			if (class325 == ((Class467) this).aClass325_5601) {
				((Class467) this).aClass325_5600 = null;
				return null;
			}
			((Class467) this).aClass325_5600 = class325.aClass325_3314;
			return class325;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.f(").append(')').toString());
		}
	}

	public static int method5858(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (1 == (i_4_ & 0x1)) {
				int i_6_ = i_2_;
				i_2_ = i_3_;
				i_3_ = i_6_;
			}
			i_1_ &= 0x3;
			if (i_1_ == 0)
				return i_0_;
			if (i_1_ == 1)
				return 7 - i - (i_2_ - 1);
			if (2 == i_1_)
				return 7 - i_0_ - (i_3_ - 1);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.s(").append(')').toString());
		}
	}

	public static void method5859(int i) {
		try {
			if (null != Class95_Sub11.aClass296_7171)
				Class95_Sub11.aClass296_7171.method2937();
			if (Class330_Sub42.aClass296_7818 != null)
				Class330_Sub42.aClass296_7818.method2937();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tj.o(").append(')').toString());
		}
	}
}
