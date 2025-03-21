/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class441 {
	public static int anInt4484 = -6;
	public static int anInt4485 = 20;
	public static int anInt4486 = -5;
	public static int anInt4487 = -4;
	public static int anInt4488 = -1;

	Class441() throws Throwable {
		throw new Error();
	}

	static final void method5610(int i, int[] is, byte i_0_) {
		try {
			if (Class397_Sub1.method4681(i, is, -1482330727)) {
				IComponentDefinitions[] class114s = Class3.aClass120Array56[i].aClass114Array1400;
				for (int i_1_ = 0; i_1_ < class114s.length; i_1_++) {
					IComponentDefinitions iComponentDefinitions = class114s[i_1_];
					if (null != iComponentDefinitions && iComponentDefinitions.aClass477_1344 != null)
						iComponentDefinitions.aClass477_1344.method5979((byte) 5);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sg.lc(").append(')').toString());
		}
	}

	static final void method5611(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class420.method5287(iComponentDefinitions, class120, class430, -705635953);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sg.da(").append(')').toString());
		}
	}
}
