/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class426 {
	IComponentDefinitions aClass114_4345;
	Class120 aClass120_4346;

	void method5313(byte i) {
		try {
			((Class426) this).aClass120_4346 = null;
			((Class426) this).aClass114_4345 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rs.p(").append(')').toString());
		}
	}

	IComponentDefinitions method5314(int i) {
		try {
			return (((Class426) this).aClass120_4346.method1440(((Class426) this).aClass114_4345.anInt1196 * 751119487, (byte) 26));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rs.r(").append(')').toString());
		}
	}

	boolean method5315(Class120 class120, int i, int i_0_, byte i_1_) {
		try {
			if (class120 != null) {
				IComponentDefinitions iComponentDefinitions = class120.method1440(i, (byte) 35);
				if (iComponentDefinitions != null) {
					((Class426) this).aClass120_4346 = class120;
					((Class426) this).aClass114_4345 = iComponentDefinitions;
					return true;
				}
			}
			method5313((byte) 3);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rs.i(").append(')').toString());
		}
	}

	Class426() {
		/* empty */
	}

	boolean method5316(int i, int i_2_, byte i_3_) {
		try {
			IComponentDefinitions iComponentDefinitions = Class166.method1993(i, i_2_, 534399539);
			if (null != iComponentDefinitions) {
				((Class426) this).aClass120_4346 = Class3.aClass120Array56[i >> 16];
				((Class426) this).aClass114_4345 = iComponentDefinitions;
				return true;
			}
			method5313((byte) 5);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rs.j(").append(')').toString());
		}
	}

	public static Class1 method5317(int i) {
		try {
			if (Class226.method2307(-296919301 * client.anInt8995, (byte) 49))
				return client.aClass1_9060;
			return client.aClass1_9025;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rs.fi(").append(')').toString());
		}
	}

	public static Class401_Sub1 method5318(int i) {
		try {
			if (-571265167 * Class507.anInt5936 < Class507.aClass401_Sub1Array5935.length)
				return (Class507.aClass401_Sub1Array5935[(Class507.anInt5936 += 474329489) * -571265167 - 1]);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rs.f(").append(')').toString());
		}
	}
}
