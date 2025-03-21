/* Class330_Sub29_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub29_Sub1_Sub2 extends Class330_Sub29_Sub1 {
	byte[] aByteArray10135;

	public Class330_Sub40_Sub3 method3404(int i, int i_0_, int i_1_) {
		if (((Class330_Sub29_Sub1_Sub2) this).aByteArray10135 == null || ((Class330_Sub29_Sub1_Sub2) this).aByteArray10135.length == 0)
			return null;
		return new Class330_Sub40_Sub3_Sub1(this, i, i_0_, i_1_);
	}

	public Class330_Sub29_Sub1_Sub2 method3409(Preferences class294) {
		((Class330_Sub29_Sub1_Sub2) this).aByteArray10135 = class294.method2920((((Class330_Sub29_Sub1_Sub2) this).aByteArray10135), (byte) 107);
		anInt9586 = (class294.method2921(anInt9586 * 1143265305, -2103427961) * -744422359);
		if (anInt9588 * 1859454861 == ((Class330_Sub29_Sub1_Sub2) this).anInt9587 * 199431309)
			anInt9588 = (((Class330_Sub29_Sub1_Sub2) this).anInt9587 = (class294.method2919(anInt9588 * 1859454861, -297051820) * -1026896315)) * 624984321;
		else {
			anInt9588 = class294.method2919(anInt9588 * 1859454861, -1929566385) * 2130416453;
			((Class330_Sub29_Sub1_Sub2) this).anInt9587 = class294.method2919((((Class330_Sub29_Sub1_Sub2) this).anInt9587) * 199431309, -1031974828) * -1026896315;
			if (anInt9588 * 1859454861 == ((Class330_Sub29_Sub1_Sub2) this).anInt9587 * 199431309)
				anInt9588 -= 2130416453;
		}
		return this;
	}

	Class330_Sub29_Sub1_Sub2(int i, byte[] is, int i_2_, int i_3_) {
		anInt9586 = i * -744422359;
		((Class330_Sub29_Sub1_Sub2) this).aByteArray10135 = is;
		anInt9588 = i_2_ * 2130416453;
		((Class330_Sub29_Sub1_Sub2) this).anInt9587 = i_3_ * -1026896315;
	}

	public Class330_Sub40_Sub3 method3403(int i, int i_4_, int i_5_) {
		if (((Class330_Sub29_Sub1_Sub2) this).aByteArray10135 == null || ((Class330_Sub29_Sub1_Sub2) this).aByteArray10135.length == 0)
			return null;
		return new Class330_Sub40_Sub3_Sub1(this, i, i_4_, i_5_);
	}

	public int method3405() {
		return ((Class330_Sub29_Sub1_Sub2) this).aByteArray10135.length;
	}

	public int method3402() {
		return ((Class330_Sub29_Sub1_Sub2) this).aByteArray10135.length;
	}

	public int method3407() {
		return ((Class330_Sub29_Sub1_Sub2) this).aByteArray10135.length;
	}

	public Class330_Sub40_Sub3 method3406(int i, int i_6_, int i_7_) {
		if (((Class330_Sub29_Sub1_Sub2) this).aByteArray10135 == null || ((Class330_Sub29_Sub1_Sub2) this).aByteArray10135.length == 0)
			return null;
		return new Class330_Sub40_Sub3_Sub1(this, i, i_6_, i_7_);
	}
}
