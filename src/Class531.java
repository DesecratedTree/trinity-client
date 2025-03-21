/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class531 {
	Class330_Sub36_Sub6[] aClass330_Sub36_Sub6Array6222;
	int anInt6223;
	IndexTable aClass280_6224;

	public Class531(Class435 class435, Class454 class454, IndexTable class280, boolean bool) {
		((Class531) this).aClass280_6224 = class280;
		((Class531) this).anInt6223 = (((Class531) this).aClass280_6224.method2763((-989081113 * (Class103.aClass103_963.anInt982)), -2041512686) * -615479325);
		if (bool) {
			((Class531) this).aClass330_Sub36_Sub6Array6222 = (new Class330_Sub36_Sub6[34141643 * ((Class531) this).anInt6223]);
			for (int i = 0; i < ((Class531) this).anInt6223 * 34141643; i++) {
				byte[] is;
				synchronized (((Class531) this).aClass280_6224) {
					is = (((Class531) this).aClass280_6224.getFile(Class103.aClass103_963.anInt982 * -989081113, i));
				}
				Class330_Sub36_Sub6 class330_sub36_sub6 = new Class330_Sub36_Sub6();
				if (null != is)
					class330_sub36_sub6.method3463(new Buffer(is), -2142942579);
				((Class531) this).aClass330_Sub36_Sub6Array6222[i] = class330_sub36_sub6;
			}
		}
	}

	public Class330_Sub36_Sub6 method6296(int i, int i_0_) {
		try {
			if (i < 0)
				return new Class330_Sub36_Sub6();
			return ((Class531) this).aClass330_Sub36_Sub6Array6222[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vz.r(").append(')').toString());
		}
	}

	public static String method6297(CharSequence charsequence, int i) {
		try {
			return CacheIndex.method1521(charsequence, null, -239647845);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vz.p(").append(')').toString());
		}
	}

	static boolean method6298(int i, int i_1_) {
		try {
			if (9 == i || i == 10 || i == 11 || i == 12 || i == 13 || 1003 == i)
				return true;
			if (i == 8)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vz.br(").append(')').toString());
		}
	}
}
