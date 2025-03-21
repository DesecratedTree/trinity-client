/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class270 {
	public static Class270 aClass270_2749;
	public static Class270 aClass270_2750;
	static Class270 aClass270_2751 = new Class270();
	static Class270 aClass270_2752;

	Class270() {
		/* empty */
	}

	static {
		aClass270_2749 = new Class270();
		aClass270_2750 = new Class270();
		aClass270_2752 = new Class270();
	}

	static final void method2666(boolean bool, Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -3292387);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			if (bool)
				Class490.method6069(class120, iComponentDefinitions, -561981326);
			else
				Class76.method867(class120, iComponentDefinitions, -1574952012);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lg.ch(").append(')').toString());
		}
	}

	static final void method2667(Class430 class430, byte i) {
		try {
			Class354_Sub1.aBoolean7989 = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lg.aeg(").append(')').toString());
		}
	}

	static final void method2669(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			if (-1 == (-790144721 * ((Class426) class426).aClass114_4345.anInt1287)) {
				if (((Class430) class430).aBoolean4398)
					throw new RuntimeException("");
				throw new RuntimeException("");
			}
			IComponentDefinitions iComponentDefinitions = class426.method5314(-1843900651);
			iComponentDefinitions.aClass114Array1347[((Class426) class426).aClass114_4345.anInt1287 * -790144721] = null;
			Class404.method4738(iComponentDefinitions, 1958895613);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lg.bj(").append(')').toString());
		}
	}

	static final void method2670(Class430 class430, int i) {
		try {
			int i_417_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_417_, -1874418445);
			Class120 class120 = Class3.aClass120Array56[i_417_ >> 16];
			Class330_Sub36_Sub16.method3512(iComponentDefinitions, class120, class430, (byte) 15);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lg.jl(").append(')').toString());
		}
	}

	static final void method2671(Class430 class430, int i) {
		try {
			Class_na.method3521(true, -2099682415);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lg.si(").append(')').toString());
		}
	}
}
