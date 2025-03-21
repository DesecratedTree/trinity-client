/* Class325_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325_Sub4 extends Class325 {
	public Class343 aClass343_7485;
	Class467 aClass467_7486 = new Class467();

	public boolean method3222(short i) {
		try {
			return ((Class325_Sub4) this).aClass467_7486.method5855(1671356272);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acj.p(").append(')').toString());
		}
	}

	public Class325_Sub2 method3223(int i, int i_0_) {
		try {
			Class325_Sub2 class325_sub2 = (Class325_Sub2) ((Class325_Sub4) this).aClass467_7486.method5854(-84367540);
			if (null == class325_sub2 || class325_sub2.anInt7481 * -1246971115 > i)
				return null;
			for (Class325_Sub2 class325_sub2_1_ = (Class325_Sub2) ((Class325_Sub4) this).aClass467_7486.method5857(-1740521876); (null != class325_sub2_1_ && -1246971115 * class325_sub2_1_.anInt7481 <= i); class325_sub2_1_ = (Class325_Sub2) ((Class325_Sub4) this).aClass467_7486.method5857(-1753340479)) {
				class325_sub2.method3204(428757222);
				class325_sub2 = class325_sub2_1_;
			}
			if ((aClass343_7485.anInt3408 * 841512963 + (-1246971115 * class325_sub2.anInt7481 + class325_sub2.anInt7478 * 1001591409)) > i)
				return class325_sub2;
			class325_sub2.method3204(-641152913);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acj.i(").append(')').toString());
		}
	}

	public void method3224(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			Class325_Sub2 class325_sub2 = null;
			int i_6_ = 0;
			for (Class325_Sub2 class325_sub2_7_ = (Class325_Sub2) ((Class325_Sub4) this).aClass467_7486.method5854(-888476427); null != class325_sub2_7_; class325_sub2_7_ = (Class325_Sub2) ((Class325_Sub4) this).aClass467_7486.method5857(-1708013574)) {
				i_6_++;
				if (-1246971115 * class325_sub2_7_.anInt7481 == i) {
					class325_sub2_7_.method3214(i, i_2_, i_3_, i_4_, (byte) 81);
					return;
				}
				if (class325_sub2_7_.anInt7481 * -1246971115 <= i)
					class325_sub2 = class325_sub2_7_;
			}
			if (null == class325_sub2) {
				if (i_6_ < 468371873 * Class396.aClass417_4108.anInt4290)
					((Class325_Sub4) this).aClass467_7486.method5856(new Class325_Sub2(i, i_2_, i_3_, i_4_), 682232543);
			} else {
				Class6.method406(new Class325_Sub2(i, i_2_, i_3_, i_4_), class325_sub2, (byte) 0);
				if (i_6_ >= Class396.aClass417_4108.anInt4290 * 468371873)
					((Class325_Sub4) this).aClass467_7486.method5854(-144573806).method3204(1996032816);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acj.j(").append(')').toString());
		}
	}

	public Class325_Sub4(Class343 class343) {
		aClass343_7485 = class343;
	}

	public static String method3225(int i, int i_8_) {
		try {
			return new StringBuilder().append("<img=").append(i).append(">").toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acj.r(").append(')').toString());
		}
	}

	public static Class147 method3226(int i, byte i_9_) {
		try {
			Class147[] class147s = Class464_Sub10.method5776(850461417);
			for (int i_10_ = 0; i_10_ < class147s.length; i_10_++) {
				Class147 class147 = class147s[i_10_];
				if (i == ((Class147) class147).anInt1619 * -1282509553)
					return class147;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acj.j(").append(')').toString());
		}
	}
}
