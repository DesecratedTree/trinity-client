/* Class464_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class464_Sub13 extends Class464 {
	public static int anInt8690 = 1;
	public static int anInt8691 = 0;

	public boolean method5785(int i) {
		try {
			if (aClass330_Sub50_5589.method3858((byte) 123) == Class435.aClass435_4421)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afk.b(").append(')').toString());
		}
	}

	public Class464_Sub13(int i, Class330_Sub50 class330_sub50) {
		super(i, class330_sub50);
	}

	public void method5786(int i) {
		try {
			if (aClass330_Sub50_5589.method3858((byte) 25) != Class435.aClass435_4421)
				anInt5587 = 1558443671;
			if (anInt5587 * 295364903 != 0 && 295364903 * anInt5587 != 1)
				anInt5587 = method5715(-702458835) * 1558443671;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afk.l(").append(')').toString());
		}
	}

	void method5722(int i, byte i_0_) {
		try {
			anInt5587 = i * 1558443671;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afk.p(").append(')').toString());
		}
	}

	int method5718() {
		return 1;
	}

	public int method5716(int i, int i_1_) {
		try {
			if (aClass330_Sub50_5589.method3858((byte) 106) == Class435.aClass435_4421) {
				if (0 == i || aClass330_Sub50_5589.aClass464_Sub27_7881.method5833(16777215) == 1)
					return 1;
				return 2;
			}
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afk.j(").append(')').toString());
		}
	}

	public int method5714(int i) {
		if (aClass330_Sub50_5589.method3858((byte) 90) == Class435.aClass435_4421) {
			if (0 == i || aClass330_Sub50_5589.aClass464_Sub27_7881.method5833(16777215) == 1)
				return 1;
			return 2;
		}
		return 3;
	}

	int method5715(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afk.r(").append(')').toString());
		}
	}

	void method5719(int i) {
		anInt5587 = i * 1558443671;
	}

	void method5721(int i) {
		anInt5587 = i * 1558443671;
	}

	void method5720(int i) {
		anInt5587 = i * 1558443671;
	}

	public int method5787(int i) {
		try {
			return anInt5587 * 295364903;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afk.k(").append(')').toString());
		}
	}

	public Class464_Sub13(Class330_Sub50 class330_sub50) {
		super(class330_sub50);
	}

	static final void method5788(Class430 class430, int i) {
		try {
			NPC class432_sub1_sub1_sub1_sub2 = ((NPC) ((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396);
			String string = class432_sub1_sub1_sub1_sub2.aString10259;
			Class551 class551 = class432_sub1_sub1_sub1_sub2.aClass551_10251;
			if (null != class551.anIntArray6326) {
				class551 = class551.method6371(Class158.aClass561_6474, (byte) 19);
				if (class551 == null)
					string = "";
				else
					string = class551.aString6323;
			}
			if (null == string)
				string = "";
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("afk.arx(").append(')').toString());
		}
	}
}
