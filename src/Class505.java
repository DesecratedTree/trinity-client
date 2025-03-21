/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class505 {
	IndexTable aClass280_5919;
	Class367 aClass367_5920 = new Class367(128);

	public Class505(Class435 class435, Class454 class454, IndexTable class280) {
		((Class505) this).aClass280_5919 = class280;
		if (null != ((Class505) this).aClass280_5919) {
			int i = ((Class505) this).aClass280_5919.method2764(1877326746) - 1;
			Class103.aClass103_932.method1226((byte) 0);
			((Class505) this).aClass280_5919.method2763(i, -2045055152);
		}
	}

	public Class506 method6140(int i, int i_0_) {
		try {
			Class506 class506;
			synchronized (((Class505) this).aClass367_5920) {
				class506 = (Class506) ((Class505) this).aClass367_5920.get((long) i);
			}
			if (class506 != null)
				return class506;
			byte[] is = (((Class505) this).aClass280_5919.getFile(Class103.aClass103_932.method1228(i, -1867505395), Class103.aClass103_932.method1227(i, (byte) 31)));
			class506 = new Class506();
			if (null != is)
				class506.method6150(new Buffer(is), 1505010051);
			synchronized (((Class505) this).aClass367_5920) {
				((Class505) this).aClass367_5920.put(class506, (long) i);
			}
			return class506;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uw.r(").append(')').toString());
		}
	}

	static final void method6141(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class70.method817(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(50554890), 200, (byte) -38);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uw.amc(").append(')').toString());
		}
	}
}
