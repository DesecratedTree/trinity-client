/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class508 implements Iterator {
	Class330 aClass330_5941 = null;
	Class330 aClass330_5942;
	Class497 aClass497_5943;
	int anInt5944;
	static int anInt5945;

	public Object next() {
		try {
			if (((Class508) this).aClass330_5942 != (((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[((Class508) this).anInt5944 * -2017034347 - 1])) {
				Class330 class330 = ((Class508) this).aClass330_5942;
				((Class508) this).aClass330_5942 = class330.aClass330_3340;
				((Class508) this).aClass330_5941 = class330;
				return class330;
			}
			while_100_: do {
				Class330 class330;
				do {
					if (((Class508) this).anInt5944 * -2017034347 >= (1545037013 * (((Class497) ((Class508) this).aClass497_5943).anInt5882)))
						break while_100_;
					class330 = (((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[((((Class508) this).anInt5944 += -1491283011) * -2017034347) - 1].aClass330_3340);
				} while ((((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[-2017034347 * ((Class508) this).anInt5944 - 1]) == class330);
				((Class508) this).aClass330_5942 = class330.aClass330_3340;
				((Class508) this).aClass330_5941 = class330;
				return class330;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.next(").append(')').toString());
		}
	}

	void method6155(int i) {
		try {
			((Class508) this).aClass330_5942 = (((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[0].aClass330_3340);
			((Class508) this).anInt5944 = -1491283011;
			((Class508) this).aClass330_5941 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.f(").append(')').toString());
		}
	}

	public void remove() {
		try {
			if (((Class508) this).aClass330_5941 == null)
				throw new IllegalStateException();
			((Class508) this).aClass330_5941.method3252(-698906095);
			((Class508) this).aClass330_5941 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.remove(").append(')').toString());
		}
	}

	public Class508(Class497 class497) {
		((Class508) this).aClass497_5943 = class497;
		method6155(-1898712553);
	}

	public boolean hasNext() {
		try {
			if (((Class508) this).aClass330_5942 != (((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[-2017034347 * ((Class508) this).anInt5944 - 1]))
				return true;
			while (((Class508) this).anInt5944 * -2017034347 < 1545037013 * ((Class497) (((Class508) this).aClass497_5943)).anInt5882) {
				if ((((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[((((Class508) this).anInt5944 += -1491283011) * -2017034347) - 1].aClass330_3340) != (((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[-2017034347 * ((Class508) this).anInt5944 - 1])) {
					((Class508) this).aClass330_5942 = (((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[((Class508) this).anInt5944 * -2017034347 - 1].aClass330_3340);
					return true;
				}
				((Class508) this).aClass330_5942 = (((Class497) ((Class508) this).aClass497_5943).aClass330Array5878[((Class508) this).anInt5944 * -2017034347 - 1]);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.hasNext(").append(')').toString());
		}
	}

	public Class330 method6156(int i) {
		try {
			method6155(2053645685);
			return (Class330) next();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.z(").append(')').toString());
		}
	}

	public static Class219[] method6157(int i) {
		try {
			return (new Class219[] { Class219.aClass219_2159, Class219.aClass219_2168, Class219.aClass219_2154, Class219.aClass219_2151, Class219.aClass219_2153, Class219.aClass219_2173, Class219.aClass219_2174, Class219.aClass219_2150, Class219.aClass219_2155, Class219.aClass219_2149, Class219.aClass219_2163, Class219.aClass219_2170, Class219.aClass219_2182, Class219.aClass219_2156, Class219.aClass219_2160, Class219.aClass219_2157, Class219.aClass219_2164, Class219.aClass219_2152, Class219.aClass219_2171, Class219.aClass219_2177, Class219.aClass219_2161, Class219.aClass219_2167, Class219.aClass219_2178, Class219.aClass219_2166, Class219.aClass219_2148, Class219.aClass219_2158, Class219.aClass219_2169, Class219.aClass219_2162, Class219.aClass219_2172, Class219.aClass219_2165, Class219.aClass219_2181, Class219.aClass219_2179, Class219.aClass219_2180, Class219.aClass219_2176 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.r(").append(')').toString());
		}
	}

	public static void method6158(int i) {
		try {
			if (Class509.anIcmpService_Sub1_5947 != null) {
				try {
					Class509.anIcmpService_Sub1_5947.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				Class509.anIcmpService_Sub1_5947 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.s(").append(')').toString());
		}
	}

	static final void method6159(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 563094173);
			if (null == iComponentDefinitions.aString1283)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = iComponentDefinitions.aString1283;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.sr(").append(')').toString());
		}
	}

	static void method6160(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1]), -1356066537).method4636(Class158.aClass561_6474, -1125970624) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uz.h(").append(')').toString());
		}
	}
}
