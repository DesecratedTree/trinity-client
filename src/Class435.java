/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class435 {
	public String aString4415;
	public static Class435 aClass435_4416;
	public int anInt4417;
	static Class435 aClass435_4418;
	static Class435 aClass435_4419;
	static Class435 aClass435_4420;
	public static Class435 aClass435_4421 = new Class435("elveron", "Elveron", 0);
	public String aString4422;
	static int anInt4423;
	public static int anInt4424;

	Class435(String string, String string_0_, int i) {
		aString4422 = string;
		aString4415 = string_0_;
		anInt4417 = i * 1476995263;
	}

	static {
		aClass435_4416 = new Class435("stellardawn", "Stellar Dawn", 1);
		aClass435_4420 = new Class435("game3", "Game 3", 2);
		aClass435_4418 = new Class435("game4", "Game 4", 3);
		aClass435_4419 = new Class435("game5", "Game 5", 4);
	}

	public static void method5568(int i) {
		try {
			Class490 class490 = null;
			try {
				class490 = Preferences.loadPreferences("", client.aClass435_9146.aString4422, true, 982021375);
				Buffer class330_sub46 = Class448.aClass330_Sub50_5555.method3861(628966525);
				class490.method6068(class330_sub46.payload, 0, class330_sub46.offset * -824785231, -1154489731);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (class490 != null)
					class490.method6064(-1943010853);
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sa.j(").append(')').toString());
		}
	}

	static void method5569(Class430 class430, int i) {
		try {
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), -1795220039).aString4091);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sa.j(").append(')').toString());
		}
	}
}
