/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class220 {
	public static int anInt2184 = 742;
	public static int anInt2185 = 1;
	static int anInt2186;

	Class220() throws Throwable {
		throw new Error();
	}

	static final void method2261(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class208.method2201(iComponentDefinitions, class120, class430, -268308450);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jg.gb(").append(')').toString());
		}
	}

	static final void method2262(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1334 = Class288.method2886(string, class430, 1757100971);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jg.nk(").append(')').toString());
		}
	}

	public static void method2263(Class545 class545, int i, int i_0_, Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int i_1_, int i_2_) {
		try {
			Class430 class430 = Class325_Sub6.method3229((byte) 96);
			((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396 = class432_sub1_sub1_sub1;
			((Class430) class430).anInt4392 = i_1_ * 213838697;
			Class217.method2252(class545, i, i_0_, class430, -1815664917);
			((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396 = null;
			((Class430) class430).anInt4392 = -213838697;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jg.f(").append(')').toString());
		}
	}

	public static final int method2264(int i, int i_3_, int i_4_) {
		try {
			if (-1 == i)
				return 12345678;
			i_3_ = i_3_ * (i & 0x7f) >> 7;
			if (i_3_ < 2)
				i_3_ = 2;
			else if (i_3_ > 126)
				i_3_ = 126;
			return (i & 0xff80) + i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jg.l(").append(')').toString());
		}
	}

	static final void method2265(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_5_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_6_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			Class380.method4395(((Class426) class426).aClass114_4345, i_5_, i_6_, (byte) 41);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jg.sm(").append(')').toString());
		}
	}

	static void method2266(IComponentDefinitions iComponentDefinitions, int i, int i_7_, int i_8_) {
		try {
			if (iComponentDefinitions.aByte1200 == 0)
				iComponentDefinitions.anInt1329 = iComponentDefinitions.anInt1192 * 956518815;
			else if (iComponentDefinitions.aByte1200 == 1)
				iComponentDefinitions.anInt1329 = ((iComponentDefinitions.anInt1192 * -836869073 + (i - -681123409 * iComponentDefinitions.anInt1210) / 2) * 867229073);
			else if (iComponentDefinitions.aByte1200 == 2)
				iComponentDefinitions.anInt1329 = (i - iComponentDefinitions.anInt1210 * -681123409 - iComponentDefinitions.anInt1192 * -836869073) * 867229073;
			else if (3 == iComponentDefinitions.aByte1200)
				iComponentDefinitions.anInt1329 = 867229073 * (iComponentDefinitions.anInt1192 * -836869073 * i >> 14);
			else if (4 == iComponentDefinitions.aByte1200)
				iComponentDefinitions.anInt1329 = (((-836869073 * iComponentDefinitions.anInt1192 * i >> 14) + (i - iComponentDefinitions.anInt1210 * -681123409) / 2) * 867229073);
			else
				iComponentDefinitions.anInt1329 = (i - iComponentDefinitions.anInt1210 * -681123409 - (-836869073 * iComponentDefinitions.anInt1192 * i >> 14)) * 867229073;
			if (iComponentDefinitions.aByte1201 == 0)
				iComponentDefinitions.anInt1209 = 2098734779 * iComponentDefinitions.anInt1324;
			else if (iComponentDefinitions.aByte1201 == 1)
				iComponentDefinitions.anInt1209 = ((i_7_ - iComponentDefinitions.anInt1348 * 694142557) / 2 + iComponentDefinitions.anInt1324 * 873176899) * 654767913;
			else if (2 == iComponentDefinitions.aByte1201)
				iComponentDefinitions.anInt1209 = (i_7_ - 694142557 * iComponentDefinitions.anInt1348 - 873176899 * iComponentDefinitions.anInt1324) * 654767913;
			else if (3 == iComponentDefinitions.aByte1201)
				iComponentDefinitions.anInt1209 = (873176899 * iComponentDefinitions.anInt1324 * i_7_ >> 14) * 654767913;
			else if (4 == iComponentDefinitions.aByte1201)
				iComponentDefinitions.anInt1209 = (((i_7_ - 694142557 * iComponentDefinitions.anInt1348) / 2 + (i_7_ * (iComponentDefinitions.anInt1324 * 873176899) >> 14)) * 654767913);
			else
				iComponentDefinitions.anInt1209 = 654767913 * (i_7_ - iComponentDefinitions.anInt1348 * 694142557 - (873176899 * iComponentDefinitions.anInt1324 * i_7_ >> 14));
			if (client.aBoolean9161 && (client.method3924(iComponentDefinitions).anInt7510 * -1700263873 != 0 || iComponentDefinitions.anInt1198 * 1849136745 == 0)) {
				if (-1036156047 * iComponentDefinitions.anInt1329 < 0)
					iComponentDefinitions.anInt1329 = 0;
				else if ((-1036156047 * iComponentDefinitions.anInt1329 + iComponentDefinitions.anInt1210 * -681123409) > i)
					iComponentDefinitions.anInt1329 = 867229073 * (i - iComponentDefinitions.anInt1210 * -681123409);
				if (-1600154343 * iComponentDefinitions.anInt1209 < 0)
					iComponentDefinitions.anInt1209 = 0;
				else if ((694142557 * iComponentDefinitions.anInt1348 + iComponentDefinitions.anInt1209 * -1600154343) > i_7_)
					iComponentDefinitions.anInt1209 = (i_7_ - 694142557 * iComponentDefinitions.anInt1348) * 654767913;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jg.lo(").append(')').toString());
		}
	}
}
