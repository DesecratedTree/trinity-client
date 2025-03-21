/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122 {
	public int[] anIntArray1404;
	public int anInt1405;
	public int[] anIntArray1406;
	public int anInt1407;
	public Class_ta aClass_ta1408;
	int anInt1409;

	public boolean method1450(int i, int i_0_, byte i_1_) {
		try {
			if (i_0_ >= 0 && i_0_ < anIntArray1404.length) {
				int i_2_ = anIntArray1404[i_0_];
				if (i >= i_2_ && i <= i_2_ + anIntArray1406[i_0_])
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ex.r(").append(')').toString());
		}
	}

	Class122(int i, int i_3_, int[] is, int[] is_4_, Class_ta class_ta, int i_5_) {
		anInt1407 = 253081013 * i;
		anInt1405 = 117434457 * i_3_;
		anIntArray1406 = is;
		anIntArray1404 = is_4_;
		aClass_ta1408 = class_ta;
		((Class122) this).anInt1409 = 628662211 * i_5_;
	}

	static final void method1451(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int[] is = Class278.method2740(string, class430, (byte) 0);
			if (null != is)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1306 = Class288.method2886(string, class430, 1955551114);
			iComponentDefinitions.anIntArray1230 = is;
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ex.lc(").append(')').toString());
		}
	}
}
