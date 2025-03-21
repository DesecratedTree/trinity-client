/* Class464_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class464_Sub21 extends Class464 {
	public static int anInt8705 = 1;
	public static int anInt8706 = 0;

	public void method5809(int i) {
		try {
			if (aClass330_Sub50_5589.aClass464_Sub23_7895.method5821(-1953915254) && !Class312.method3114(aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(-458126647), 1222807169))
				anInt5587 = 0;
			if (anInt5587 * 295364903 < 0 || anInt5587 * 295364903 > 1)
				anInt5587 = method5715(59437370) * 1558443671;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.l(").append(')').toString());
		}
	}

	public Class464_Sub21(int i, Class330_Sub50 class330_sub50) {
		super(i, class330_sub50);
	}

	void method5720(int i) {
		anInt5587 = 1558443671 * i;
	}

	public boolean method5810(int i) {
		try {
			if (!Class312.method3114(aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(-2114809539), 1645534680))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.b(").append(')').toString());
		}
	}

	public int method5716(int i, int i_0_) {
		try {
			if (!Class312.method3114(aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(66827234), 1711419475))
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.j(").append(')').toString());
		}
	}

	void method5722(int i, byte i_1_) {
		try {
			anInt5587 = 1558443671 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.p(").append(')').toString());
		}
	}

	public int method5811(int i) {
		try {
			return 295364903 * anInt5587;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.k(").append(')').toString());
		}
	}

	void method5719(int i) {
		anInt5587 = 1558443671 * i;
	}

	public int method5714(int i) {
		if (!Class312.method3114(aClass330_Sub50_5589.aClass464_Sub23_7895.method5819(-340390552), 1714824564))
			return 3;
		return 1;
	}

	int method5715(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.r(").append(')').toString());
		}
	}

	int method5718() {
		return 0;
	}

	public Class464_Sub21(Class330_Sub50 class330_sub50) {
		super(class330_sub50);
	}

	void method5721(int i) {
		anInt5587 = 1558443671 * i;
	}

	static void method5812(Class_ra class_ra, byte[][][] is, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, byte i_11_) {
		try {
			if (i_8_ != 0 && i != 0) {
				if (i_8_ == 9) {
					i_8_ = 1;
					i_9_ = i_9_ + 1 & 0x3;
				}
				if (10 == i_8_) {
					i_8_ = 1;
					i_9_ = 3 + i_9_ & 0x3;
				}
				if (i_8_ == 11) {
					i_8_ = 8;
					i_9_ = i_9_ + 3 & 0x3;
				}
				class_ra.N(i_2_, i_3_, i_6_, i_7_, i_4_, i_5_, is[i_8_ - 1][i_9_], i, i_10_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.r(").append(')').toString());
		}
	}

	public static final void method5813(long l) {
		try {
			if (l > 0L) {
				if (l % 10L == 0L) {
					Class243.method2414(l - 1L);
					Class243.method2414(1L);
				} else
					Class243.method2414(l);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afs.r(").append(')').toString());
		}
	}
}
