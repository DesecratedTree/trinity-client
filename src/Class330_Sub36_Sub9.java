/* Class330_Sub36_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub36_Sub9 extends Class330_Sub36 {
	public String aString9683;
	public int[] anIntArray9684;
	public char[] aCharArray9685;
	public int[] anIntArray9686;
	public char[] aCharArray9687;

	public int method3475(char c, int i) {
		try {
			if (anIntArray9686 == null)
				return -1;
			for (int i_0_ = 0; i_0_ < anIntArray9686.length; i_0_++) {
				if (c == aCharArray9687[i_0_])
					return anIntArray9686[i_0_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajh.p(").append(')').toString());
		}
	}

	void method3476(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_1_ = class330_sub46.readUnsignedByte(44353150);
				if (i_1_ == 0) {
					if (i == 1)
						break;
					break;
				}
				method3478(class330_sub46, i_1_, (byte) 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajh.r(").append(')').toString());
		}
	}

	public int method3477(char c, int i) {
		try {
			if (null == anIntArray9684)
				return -1;
			for (int i_2_ = 0; i_2_ < anIntArray9684.length; i_2_++) {
				if (aCharArray9685[i_2_] == c)
					return anIntArray9684[i_2_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajh.i(").append(')').toString());
		}
	}

	void method3478(Buffer class330_sub46, int i, byte i_3_) {
		try {
			do {
				if (1 == i)
					aString9683 = class330_sub46.readString(1344116228);
				else if (2 == i) {
					int i_4_ = class330_sub46.readUnsignedByte(888920228);
					anIntArray9684 = new int[i_4_];
					aCharArray9685 = new char[i_4_];
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
						anIntArray9684[i_5_] = class330_sub46.readUnsignedShort(900531876);
						byte i_6_ = class330_sub46.readByte((byte) 50);
						aCharArray9685[i_5_] = (0 == i_6_ ? '\0' : Class127.method1546(i_6_, -2006988968));
					}
				} else if (i == 3) {
					int i_7_ = class330_sub46.readUnsignedByte(1195026007);
					anIntArray9686 = new int[i_7_];
					aCharArray9687 = new char[i_7_];
					for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
						anIntArray9686[i_8_] = class330_sub46.readUnsignedShort(1233380124);
						byte i_9_ = class330_sub46.readByte((byte) 90);
						aCharArray9687[i_8_] = (i_9_ == 0 ? '\0' : Class127.method1546(i_9_, -2113515503));
					}
				} else if (i == 4)
					break;
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajh.j(").append(')').toString());
		}
	}

	void method3479(int i) {
		try {
			if (anIntArray9686 != null) {
				for (int i_10_ = 0; i_10_ < anIntArray9686.length; i_10_++)
					anIntArray9686[i_10_] |= 0x8000;
			}
			if (anIntArray9684 != null) {
				for (int i_11_ = 0; i_11_ < anIntArray9684.length; i_11_++)
					anIntArray9684[i_11_] |= 0x8000;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajh.o(").append(')').toString());
		}
	}

	Class330_Sub36_Sub9() {
		/* empty */
	}
}
