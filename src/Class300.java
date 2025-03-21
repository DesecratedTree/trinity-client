/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class300 {
	Class330_Sub46_Sub2 aClass330_Sub46_Sub2_3056;
	OutgoingPacketManager aClass310_3057;
	public static int anInt3058;

	public Class300(OutgoingPacketManager class310, Class330_Sub46_Sub2 class330_sub46_sub2) {
		((Class300) this).aClass310_3057 = class310;
		((Class300) this).aClass330_Sub46_Sub2_3056 = class330_sub46_sub2;
	}

	public static Class369[] method2974(int i) {
		try {
			return (new Class369[] { Class369.aClass369_6818, Class369.aClass369_6815, Class369.aClass369_6817 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mn.r(").append(')').toString());
		}
	}

	static final void method2975(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1348 * 694142557;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mn.pg(").append(')').toString());
		}
	}

	static final void method2976(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (Class3.aClass120Array56[i_0_] == null)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else {
				String string = (Class3.aClass120Array56[i_0_].aClass114Array1400[0].aString1360);
				if (null == string)
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
				else
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = string.substring(0, string.indexOf(':'));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mn.ans(").append(')').toString());
		}
	}

	public static String method2977(byte[] is, byte i) {
		try {
			return Class125.method1525(is, 0, is.length, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mn.f(").append(')').toString());
		}
	}
}
