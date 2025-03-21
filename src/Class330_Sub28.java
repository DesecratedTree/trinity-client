/* Class330_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub28 extends Class330 {
	public int anInt7714;
	static int anInt7715;
	public int anInt7716;
	public int anInt7717;
	static Class330_Sub28[] aClass330_Sub28Array7718 = new Class330_Sub28[0];
	public int anInt7719;

	public Class260 method3400(int i) {
		try {
			return new Class260((float) (anInt7714 * -1265358745), (float) (anInt7717 * 2008248473), (float) (anInt7719 * 1488639791));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adi.i(").append(')').toString());
		}
	}

	void method3401(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			anInt7716 = -489987929 * i;
			anInt7714 = 545289047 * i_0_;
			anInt7717 = i_1_ * 338420649;
			anInt7719 = -157036593 * i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adi.j(").append(')').toString());
		}
	}

	public String toString() {
		try {
			return new StringBuilder().append("Level: ").append(anInt7716 * 2050246423).append(" Coord: ").append(anInt7714 * -1265358745).append(",").append(anInt7717 * 2008248473).append(",").append(anInt7719 * 1488639791).append(" Coord Split: ").append(anInt7714 * -1265358745 >> 15).append(",").append(anInt7719 * 1488639791 >> 15).append(",").append(-1265358745 * anInt7714 >> 9 & 0x3f).append(",").append(1488639791 * anInt7719 >> 9 & 0x3f).append(",").append(anInt7714 * -1265358745 & 0x1ff).append(",").append(1488639791 * anInt7719 & 0x1ff).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adi.toString(").append(')').toString());
		}
	}

	public Class330_Sub28(int i, int i_4_, int i_5_, int i_6_) {
		anInt7716 = -489987929 * i;
		anInt7714 = 545289047 * i_4_;
		anInt7717 = 338420649 * i_5_;
		anInt7719 = -157036593 * i_6_;
	}
}
