/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121 {
	static int volume;

	Class121() throws Throwable {
		throw new Error();
	}

	static final void method1445(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1297 = Class288.method2886(string, class430, 1174149420);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ew.lt(").append(')').toString());
		}
	}

	static final void method1446(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 1110013953);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class330_Sub48_Sub4.method3848(iComponentDefinitions, class120, class430, 861085587);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ew.lz(").append(')').toString());
		}
	}

	static Class method1447(String string, int i) throws ClassNotFoundException {
		try {
			if (string.equals("B"))
				return Byte.TYPE;
			if (string.equals("I"))
				return Integer.TYPE;
			if (string.equals("S"))
				return Short.TYPE;
			if (string.equals("J"))
				return Long.TYPE;
			if (string.equals("Z"))
				return Boolean.TYPE;
			if (string.equals("F"))
				return Float.TYPE;
			if (string.equals("D"))
				return Double.TYPE;
			if (string.equals("C"))
				return Character.TYPE;
			if (string.equals("void"))
				return Void.TYPE;
			return Class.forName(string);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ew.o(").append(')').toString());
		}
	}

	static void method1448(byte i) {
		try {
			MusicManager.currentState = 0;
			MusicManager.currentMusicFile = null;
			Class57.aClass305_6600 = null;
			Class110.musicArchive = null;
			Class288.aClass330_Sub40_Sub2_2955 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ew.d(").append(')').toString());
		}
	}

	public static Class61 method1449(Class_ra class_ra, int i, int i_1_) {
		try {
			Class330_Sub43 class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6094((long) i));
			if (class330_sub43 != null) {
				Class330_Sub31_Sub4 class330_sub31_sub4 = ((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3186((byte) 7);
				((Class330_Sub43) class330_sub43).aBoolean7821 = true;
				if (class330_sub31_sub4 != null) {
					((Class451) Class442.aClass451_4490).aClass_ra6641 = class_ra;
					return ((Class61) class330_sub31_sub4.method3432((Class442.aClass451_4490), -2069828812));
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ew.s(").append(')').toString());
		}
	}
}
