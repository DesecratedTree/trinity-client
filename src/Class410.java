/* Class410 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class410 {
	Class381 aClass381_4243;
	int anInt4244;

	public Class410(Class381 class381, int i) {
		((Class410) this).aClass381_4243 = class381;
		((Class410) this).anInt4244 = -451730883 * i;
	}

	public Class432_Sub1_Sub2_Sub1 method5219(byte i) {
		try {
			Class330_Sub9 class330_sub9 = ((Class330_Sub9) (client.aClass497_9138.method6094((long) ((((Class410) this).aClass381_4243.anInt3963 * 664489493) << 28 | (((Class410) this).aClass381_4243.gameSceneBaseY * -1542584207) << 14 | (((Class410) this).aClass381_4243.gameSceneBaseX * -1261027839)))));
			if (null == class330_sub9)
				return null;
			Class381 class381 = client.aClass304_9030.method3022(-114433940);
			int i_0_ = (-1261027839 * ((Class410) this).aClass381_4243.gameSceneBaseX - -1261027839 * class381.gameSceneBaseX);
			int i_1_ = (-1542584207 * ((Class410) this).aClass381_4243.gameSceneBaseY - class381.gameSceneBaseY * -1542584207);
			if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass304_9030.method2990(-756605541) && i_1_ < client.aClass304_9030.method3033((byte) -98)) {
				for (Class330_Sub3 class330_sub3 = (Class330_Sub3) class330_sub9.aClass471_7573.method5869(539664854); null != class330_sub3; class330_sub3 = (Class330_Sub3) class330_sub9.aClass471_7573.method5873((byte) -89)) {
					if (-862355691 * class330_sub3.anInt7513 == 1476330773 * ((Class410) this).anInt4244)
						return ((Class432_Sub1_Sub2_Sub1) (client.aClass304_9030.method3023(-400722441).method4178((((Class410) this).aClass381_4243.anInt3963 * 664489493), i_0_, i_1_, -140754170)));
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rb.r(").append(')').toString());
		}
	}

	static final void method5220(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub10_7873.method5772(355910202);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rb.amk(").append(')').toString());
		}
	}

	static final void method5221(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.anInt1271 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) * 412038455;
			Class404.method4738(iComponentDefinitions, 1523447317);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rb.gn(").append(')').toString());
		}
	}

	static final void method5222(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 988182221 * Class95_Sub17.anInt7193;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rb.aog(").append(')').toString());
		}
	}

	static Class227[] method5223(byte i) {
		try {
			return (new Class227[] { Class227.aClass227_2418, Class227.aClass227_2411, Class227.aClass227_2414, Class227.aClass227_2417, Class227.aClass227_2421, Class227.aClass227_2416, Class227.aClass227_2413, Class227.aClass227_2412, Class227.aClass227_2420, Class227.aClass227_2419, Class227.aClass227_2415 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rb.r(").append(')').toString());
		}
	}
}
