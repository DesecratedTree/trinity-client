/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class20 {
	int modelColorIndex;
	boolean aBoolean245;
	short aShort246;
	short aShort247;
	byte aByte248;
	byte aByte249;
	short aShort250;
	int anInt251;

	Class20(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
		((Class20) this).modelColorIndex = 1028839953 * i;
		((Class20) this).aShort250 = (short) i_3_;
		((Class20) this).aShort246 = (short) i_4_;
		((Class20) this).aShort247 = (short) i_5_;
		((Class20) this).aByte249 = (byte) i_6_;
		((Class20) this).aByte248 = (byte) i_7_;
		((Class20) this).aBoolean245 = bool;
		((Class20) this).anInt251 = i_8_ * -104300771;
	}

	public static Class61 method464(IndexTable class280, int i, int i_9_) {
		try {
			Class61 class61 = (Class61) Class248.aClass367_6588.get((long) i);
			if (null == class61) {
				if (Class207.aBoolean1951)
					class61 = Class361.aClass_ra3793.bw(Class53.method640(class280, i), true);
				else
					class61 = Class306.method3052(class280.method2761(i, 2140313693), -410643814);
				Class248.aClass367_6588.put(class61, (long) i);
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("au.j(").append(')').toString());
		}
	}

	static int method465(Class330_Sub36_Sub13 class330_sub36_sub13, Class524 class524, byte i) {
		try {
			String string = Class401.method4715(class330_sub36_sub13, -1160642131);
			return class524.method6248(string, Class_na.aClass61Array9725, -1708509606);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("au.bt(").append(')').toString());
		}
	}

	static final int method466(int i, int i_10_, int i_11_, int i_12_, byte i_13_) {
		try {
			int i_14_ = 65536 - Class257.anIntArray2684[i_11_ * 8192 / i_12_] >> 1;
			return ((65536 - i_14_) * i >> 16) + (i_10_ * i_14_ >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("au.h(").append(')').toString());
		}
	}

	static final void method467(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			iComponentDefinitions.anInt1289 = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) * 1355109371;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("au.jc(").append(')').toString());
		}
	}

	static final void method468(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1338 = Class288.method2886(string, class430, 2081714739);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("au.mj(").append(')').toString());
		}
	}

	static void method469(int i, int i_15_, int i_16_, int i_17_) {
		try {
			if (1008 == i)
				Class230.method2339(Class545.aClass545_6995, i_15_, i_16_, 535391737);
			else if (1009 == i)
				Class230.method2339(Class545.aClass545_7000, i_15_, i_16_, -1249606309);
			else if (i == 1010)
				Class230.method2339(Class545.aClass545_6996, i_15_, i_16_, -1479277575);
			else if (1011 == i)
				Class230.method2339(Class545.aClass545_6997, i_15_, i_16_, 979838879);
			else if (1012 == i)
				Class230.method2339(Class545.aClass545_7013, i_15_, i_16_, 533945711);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("au.cm(").append(')').toString());
		}
	}

	static final void method470(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_18_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_19_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			Class426 class426;
			if (((Class430) class430).aBoolean4398)
				class426 = ((Class430) class430).aClass426_4384;
			else
				class426 = ((Class430) class430).aClass426_4370;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (-1 != i_19_ && class426.method5316(i_18_, i_19_, (byte) -88) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("au.bd(").append(')').toString());
		}
	}
}
