/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class538 {
	public short[] aShortArray6239;
	public int[] anIntArray6240;
	public short[] aShortArray6241;
	public long aLong6242;
	public static IndexTable aClass280_6243;

	public Class538(long l, int[] is, short[] is_0_, short[] is_1_) {
		aLong6242 = l * 7415089317549594679L;
		anIntArray6240 = is;
		aShortArray6241 = is_0_;
		aShortArray6239 = is_1_;
	}

	public Class538(Class551 class551, boolean bool) {
		if (bool) {
			anIntArray6240 = new int[class551.anIntArray6296.length];
			System.arraycopy(class551.anIntArray6296, 0, anIntArray6240, 0, anIntArray6240.length);
		} else {
			anIntArray6240 = new int[class551.anIntArray6297.length];
			System.arraycopy(class551.anIntArray6297, 0, anIntArray6240, 0, anIntArray6240.length);
		}
		if (class551.aShortArray6301 != null) {
			aShortArray6241 = new short[class551.aShortArray6301.length];
			System.arraycopy(class551.aShortArray6301, 0, aShortArray6241, 0, aShortArray6241.length);
		}
		if (class551.aShortArray6349 != null) {
			aShortArray6239 = new short[class551.aShortArray6349.length];
			System.arraycopy(class551.aShortArray6349, 0, aShortArray6239, 0, aShortArray6239.length);
		}
	}

	static void method6324(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wh.u(").append(')').toString());
		}
	}

	static void method6325(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1]), -1471193697).anInt4097) * 1402796267;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wh.p(").append(')').toString());
		}
	}
}
