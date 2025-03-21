/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class209 {
	public int anInt1981;
	public Class330_Sub36_Sub4 aClass330_Sub36_Sub4_1982;
	public int[] anIntArray1983;
	static Interface_ma anInterface_ma1984;
	public static IndexTable aClass280_1985;

	static final void method2208(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -425760845);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class499.method6117(iComponentDefinitions, class120, class430, (byte) -70);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iu.mb(").append(')').toString());
		}
	}

	static final void method2209(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class330_Sub1.method3261(iComponentDefinitions, class120, class430, 35632);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iu.oe(").append(')').toString());
		}
	}

	static boolean method2210(String string, String string_1_, int i) {
		try {
			Class360.anInt3791 = -180602592;
			Class360.aClass1_3783 = client.aClass1_9025;
			return Class528.method6272(false, false, string, string_1_, -1L);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iu.x(").append(')').toString());
		}
	}

	static final void method2211(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			Class402 class402 = Class128.aClass400_1478.method4700(i_2_, -1997925829);
			if (class402 == null)
				throw new RuntimeException();
			Integer integer = (((Class430) class430).aClass154_4391.method1800((client.aClass435_9146.anInt4417 * -1358018753 << 16 | -1407972537 * class402.anInt4135), -1423434161 * class402.anInt4136, 1867065457 * class402.anInt4134, (byte) 75));
			int i_3_;
			if (null == integer)
				i_3_ = 0;
			else
				i_3_ = integer.intValue();
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("iu.bn(").append(')').toString());
		}
	}
}
