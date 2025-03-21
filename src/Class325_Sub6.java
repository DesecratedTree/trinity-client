/* Class325_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325_Sub6 extends Class325 {
	int anInt7490;
	int anInt7491;
	int anInt7492;
	int anInt7493;
	int anInt7494;
	int anInt7495;
	String aString7496;

	Class325_Sub6() {
		/* empty */
	}

	public static Class330_Sub38 method3228(int i) {
		try {
			if (Class354_Sub1.aClass471_3509 == null || null == Class354_Sub1.aClass474_7992)
				return null;
			for (Class330_Sub38 class330_sub38 = (Class330_Sub38) Class354_Sub1.aClass474_7992.next(); class330_sub38 != null; class330_sub38 = (Class330_Sub38) Class354_Sub1.aClass474_7992.next()) {
				Class372 class372 = (Class354_Sub1.aClass380_3529.method4387(-558904089 * class330_sub38.anInt7755, (byte) -98));
				if (class372 != null && class372.aBoolean3910 && class372.method4327(Class354_Sub1.anInterface29_3496, (byte) 55))
					return class330_sub38;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acv.cx(").append(')').toString());
		}
	}

	static final Class430 method3229(byte i) {
		try {
			if (1054408377 * Class428.anInt4360 == Class428.anArrayList4351.size())
				Class428.anArrayList4351.add(new Class430());
			Class430 class430 = (Class430) Class428.anArrayList4351.get(Class428.anInt4360 * 1054408377);
			Class428.anInt4360 += 987604873;
			return class430;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acv.r(").append(')').toString());
		}
	}
}
