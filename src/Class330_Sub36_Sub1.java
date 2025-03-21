/* Class330_Sub36_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub36_Sub1 extends Class330_Sub36 implements Interface21 {
	public int[] anIntArray9287;
	public int[] anIntArray9288;
	public int anInt9289 = 0;
	public int anInt9290 = 0;

	void method3440(Buffer class330_sub46, int i, int i_0_) {
		try {
			if (i == 2)
				anInt9290 = class330_sub46.readUnsignedShort(1106068410) * -749620587;
			else if (4 == i) {
				anInt9289 = class330_sub46.readUnsignedByte(162202350) * -2111469807;
				anIntArray9288 = new int[-458733071 * anInt9289];
				anIntArray9287 = new int[anInt9289 * -458733071];
				for (int i_1_ = 0; i_1_ < -458733071 * anInt9289; i_1_++) {
					anIntArray9288[i_1_] = class330_sub46.readUnsignedShort(-395269504);
					anIntArray9287[i_1_] = class330_sub46.readUnsignedShort(1642513968);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aev.j(").append(')').toString());
		}
	}

	void method3441(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_2_ = class330_sub46.readUnsignedByte(1736631748);
				if (i_2_ == 0) {
					if (i != 0) {
						/* empty */
					}
					break;
				}
				method3440(class330_sub46, i_2_, -1721968349);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aev.r(").append(')').toString());
		}
	}

	Class330_Sub36_Sub1() {
		/* empty */
	}

	public static void method3442(int i, int i_3_) {
		try {
			Class354_Sub1.anInt7987 = -1284625249;
			Class354_Sub1.anInt7980 = i * -651096279;
			Class448.anInt5556 = -1741404779;
			Class101.anInt6456 = 1758134756;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aev.cu(").append(')').toString());
		}
	}
}
