/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class443 {
	static long[] aLongArray4492;
	static char[] aCharArray4493 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	static {
		aLongArray4492 = new long[12];
		for (int i = 0; i < aLongArray4492.length; i++)
			aLongArray4492[i] = (long) Math.pow(37.0, (double) i);
	}

	Class443() throws Throwable {
		throw new Error();
	}

	static final void method5613(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class246.method2453(iComponentDefinitions, class120, class430, -828851911);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("si.mo(").append(')').toString());
		}
	}

	static boolean method5614(byte i) {
		try {
			if (null == Class422.aClass330_Sub36_Sub10_4321)
				return false;
			if ((((Class330_Sub36_Sub10) Class422.aClass330_Sub36_Sub10_4321).anInt9699) * 400571611 >= 2000)
				((Class330_Sub36_Sub10) Class422.aClass330_Sub36_Sub10_4321).anInt9699 -= -1426540432;
			if ((((Class330_Sub36_Sub10) Class422.aClass330_Sub36_Sub10_4321).anInt9699) * 400571611 == 1007)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("si.w(").append(')').toString());
		}
	}

	static void method5615(int i, String string, int i_0_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(3, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).aString9649 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("si.ax(").append(')').toString());
		}
	}
}
