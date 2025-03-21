/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class13 {
	public String aString168;
	public int anInt169;
	String aString170;
	public String aString171;
	public String aString172;
	public byte aByte173;
	static Class87 aClass87_174;
	static short aShort175;

	Class13() {
		/* empty */
	}

	static final void method438(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class401_Sub1.aClass145_Sub1_8249.method1689(-265730369).anInt1496) * 625218477;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("an.ahp(").append(')').toString());
		}
	}

	static void method439(long[] ls, Object[] objects, int i, int i_0_, int i_1_) {
		try {
			if (i < i_0_) {
				int i_2_ = (i + i_0_) / 2;
				int i_3_ = i;
				long l = ls[i_2_];
				ls[i_2_] = ls[i_0_];
				ls[i_0_] = l;
				Object object = objects[i_2_];
				objects[i_2_] = objects[i_0_];
				objects[i_0_] = object;
				int i_4_ = 9223372036854775807L == l ? 0 : 1;
				for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
					if (ls[i_5_] < l + (long) (i_5_ & i_4_)) {
						long l_6_ = ls[i_5_];
						ls[i_5_] = ls[i_3_];
						ls[i_3_] = l_6_;
						Object object_7_ = objects[i_5_];
						objects[i_5_] = objects[i_3_];
						objects[i_3_++] = object_7_;
					}
				}
				ls[i_0_] = ls[i_3_];
				ls[i_3_] = l;
				objects[i_0_] = objects[i_3_];
				objects[i_3_] = object;
				method439(ls, objects, i, i_3_ - 1, 1930619533);
				method439(ls, objects, 1 + i_3_, i_0_, -1110408926);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("an.l(").append(')').toString());
		}
	}

	static final void method440(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int[] is = Class278.method2740(string, class430, (byte) 0);
			if (null != is)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1312 = Class288.method2886(string, class430, 1824237080);
			iComponentDefinitions.anIntArray1313 = is;
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("an.ou(").append(')').toString());
		}
	}

	public static Class201 method441(Buffer class330_sub46, byte i) {
		try {
			Class201 class201 = Class315.method3140(class330_sub46, (byte) 1);
			int i_8_ = class330_sub46.readInt((byte) 84);
			int i_9_ = class330_sub46.readInt((byte) 18);
			int i_10_ = class330_sub46.readBigSmart(-777588283);
			return new Class201_Sub1(class201.aClass195_6507, class201.aClass211_6502, 1735526707 * class201.anInt6501, class201.anInt6504 * 27527681, 1790195679 * class201.anInt6505, -2072821429 * class201.anInt6503, class201.anInt6506 * 644698723, class201.anInt6508 * 1983469687, class201.anInt6509 * 1582406609, i_8_, i_9_, i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("an.s(").append(')').toString());
		}
	}
}
