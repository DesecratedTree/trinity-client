/* Class464_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class464_Sub23 extends Class464 {
	public boolean aBoolean8710;
	boolean aBoolean8711 = true;
	public static Class350 aClass350_8712;

	public Class464_Sub23(int i, Class330_Sub50 class330_sub50) {
		super(i, class330_sub50);
		aBoolean8710 = false;
	}

	public void method5817(int i) {
		try {
			if (anInt5587 * 295364903 < 0 || 295364903 * anInt5587 > 5)
				anInt5587 = method5715(-2113362178) * 1558443671;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.l(").append(')').toString());
		}
	}

	int method5715(int i) {
		try {
			aBoolean8710 = true;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.r(").append(')').toString());
		}
	}

	public int method5716(int i, int i_0_) {
		try {
			if (i == 3 && !Class489.method6063(-1102372689).method331("jagdx", 640260927))
				return 3;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.j(").append(')').toString());
		}
	}

	void method5720(int i) {
		aBoolean8710 = false;
		anInt5587 = i * 1558443671;
	}

	void method5722(int i, byte i_1_) {
		try {
			aBoolean8710 = false;
			anInt5587 = i * 1558443671;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.p(").append(')').toString());
		}
	}

	public void method5818(boolean bool, int i) {
		try {
			((Class464_Sub23) this).aBoolean8711 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.u(").append(')').toString());
		}
	}

	public int method5819(int i) {
		try {
			return 295364903 * anInt5587;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.k(").append(')').toString());
		}
	}

	int method5718() {
		aBoolean8710 = true;
		return 2;
	}

	public int method5714(int i) {
		if (i == 3 && !Class489.method6063(-1102372689).method331("jagdx", 1638075024))
			return 3;
		return 2;
	}

	void method5719(int i) {
		aBoolean8710 = false;
		anInt5587 = i * 1558443671;
	}

	void method5721(int i) {
		aBoolean8710 = false;
		anInt5587 = i * 1558443671;
	}

	public boolean method5820(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.b(").append(')').toString());
		}
	}

	public Class464_Sub23(Class330_Sub50 class330_sub50) {
		super(class330_sub50);
		aBoolean8710 = false;
	}

	boolean method5821(int i) {
		try {
			return ((Class464_Sub23) this).aBoolean8711;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.q(").append(')').toString());
		}
	}

	static final void method5822(Class430 class430, int i) {
		try {
			Class330_Sub28 class330_sub28 = (Class330_Sub28) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class401_Sub1.aClass145_Sub1_8249.method1693(-706036662) != Class136.aClass136_1524)
				throw new RuntimeException();
			Class166_Sub1 class166_sub1 = ((Class166_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1707(2102816052));
			class166_sub1.method1997(class330_sub28, (byte) 41);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.ahw(").append(')').toString());
		}
	}

	static final void method5823(Class430 class430, short i) {
		try {
			int i_2_ = ((((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]) >> 16);
			int i_3_ = ((((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]) & 0xffff);
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_4_ < 0 || i_4_ > 5000)
				throw new RuntimeException();
			((Class430) class430).anIntArray4373[i_2_] = i_4_;
			int i_5_ = -1;
			if (i_3_ == 105)
				i_5_ = 0;
			for (int i_6_ = 0; i_6_ < i_4_; i_6_++)
				((Class430) class430).anIntArrayArray4374[i_2_][i_6_] = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afu.ar(").append(')').toString());
		}
	}
}
