/* Class223_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class223_Sub2_Sub1 extends Class223_Sub2 {
	byte[] aByteArray9486;

	byte[] method2295(int i, int i_0_, int i_1_) {
		((Class223_Sub2_Sub1) this).aByteArray9486 = new byte[i * i_0_ * i_1_ * 2];
		method2279(i, i_0_, i_1_);
		return ((Class223_Sub2_Sub1) this).aByteArray9486;
	}

	void method2294(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		((Class223_Sub2_Sub1) this).aByteArray9486[i_3_++] = (byte) -1;
		((Class223_Sub2_Sub1) this).aByteArray9486[i_3_] = (byte) (3 * i_4_ >> 5);
	}

	Class223_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method2296(int i, byte i_5_) {
		int i_6_ = i * 2;
		int i_7_ = i_5_ & 0xff;
		((Class223_Sub2_Sub1) this).aByteArray9486[i_6_++] = (byte) -1;
		((Class223_Sub2_Sub1) this).aByteArray9486[i_6_] = (byte) (3 * i_7_ >> 5);
	}
}
