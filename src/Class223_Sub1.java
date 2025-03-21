/* Class223_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class223_Sub1 extends Class223 {
	int anInt7356;
	byte[] aByteArray7357;
	int anInt7358;
	int[] anIntArray7359 = new int[((Class223_Sub1) this).anInt2361];

	void method2285() {
		((Class223_Sub1) this).anInt7358 = Math.abs(((Class223_Sub1) this).anInt7358);
		if (((Class223_Sub1) this).anInt7358 >= 4096)
			((Class223_Sub1) this).anInt7358 = 4095;
		method2289(((Class223_Sub1) this).anInt7356++, (byte) (((Class223_Sub1) this).anInt7358 >> 4));
		((Class223_Sub1) this).anInt7358 = 0;
	}

	void method2275() {
		((Class223_Sub1) this).anInt7356 = 0;
		((Class223_Sub1) this).anInt7358 = 0;
	}

	void method2282(int i, int i_0_) {
		((Class223_Sub1) this).anInt7358 += i_0_ * ((Class223_Sub1) this).anIntArray7359[i] >> 12;
	}

	void method2276(int i, int i_1_) {
		((Class223_Sub1) this).anInt7358 += i_1_ * ((Class223_Sub1) this).anIntArray7359[i] >> 12;
	}

	Class223_Sub1(int i, int i_2_, int i_3_, int i_4_, int i_5_, float f) {
		super(i, i_2_, i_3_, i_4_, i_5_);
		for (int i_6_ = 0; i_6_ < ((Class223_Sub1) this).anInt2361; i_6_++)
			((Class223_Sub1) this).anIntArray7359[i_6_] = (short) (int) (Math.pow((double) f, (double) i_6_) * 4096.0);
	}

	void method2283() {
		((Class223_Sub1) this).anInt7356 = 0;
		((Class223_Sub1) this).anInt7358 = 0;
	}

	void method2284() {
		((Class223_Sub1) this).anInt7356 = 0;
		((Class223_Sub1) this).anInt7358 = 0;
	}

	void method2281() {
		((Class223_Sub1) this).anInt7356 = 0;
		((Class223_Sub1) this).anInt7358 = 0;
	}

	void method2288() {
		((Class223_Sub1) this).anInt7358 = Math.abs(((Class223_Sub1) this).anInt7358);
		if (((Class223_Sub1) this).anInt7358 >= 4096)
			((Class223_Sub1) this).anInt7358 = 4095;
		method2289(((Class223_Sub1) this).anInt7356++, (byte) (((Class223_Sub1) this).anInt7358 >> 4));
		((Class223_Sub1) this).anInt7358 = 0;
	}

	void method2286() {
		((Class223_Sub1) this).anInt7358 = Math.abs(((Class223_Sub1) this).anInt7358);
		if (((Class223_Sub1) this).anInt7358 >= 4096)
			((Class223_Sub1) this).anInt7358 = 4095;
		method2289(((Class223_Sub1) this).anInt7356++, (byte) (((Class223_Sub1) this).anInt7358 >> 4));
		((Class223_Sub1) this).anInt7358 = 0;
	}

	void method2287(int i, int i_7_) {
		((Class223_Sub1) this).anInt7358 += i_7_ * ((Class223_Sub1) this).anIntArray7359[i] >> 12;
	}

	void method2289(int i, byte i_8_) {
		((Class223_Sub1) this).aByteArray7357[((Class223_Sub1) this).anInt7356++] = (byte) (127 + ((i_8_ & 0xff) >> 1));
	}
}
