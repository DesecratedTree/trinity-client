/* Class223_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class223_Sub1_Sub2 extends Class223_Sub1 {
	byte[] aByteArray9485;

	byte[] method2292(int i, int i_0_, int i_1_) {
		((Class223_Sub1_Sub2) this).aByteArray9485 = new byte[i * i_0_ * i_1_ * 2];
		method2279(i, i_0_, i_1_);
		return ((Class223_Sub1_Sub2) this).aByteArray9485;
	}

	Class223_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	void method2289(int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
		((Class223_Sub1_Sub2) this).aByteArray9485[i_3_++] = i_2_;
		((Class223_Sub1_Sub2) this).aByteArray9485[i_3_] = i_2_;
	}

	void method2293(int i, byte i_4_) {
		int i_5_ = i * 2;
		i_4_ = (byte) (127 + ((i_4_ & 0xff) >> 1));
		((Class223_Sub1_Sub2) this).aByteArray9485[i_5_++] = i_4_;
		((Class223_Sub1_Sub2) this).aByteArray9485[i_5_] = i_4_;
	}
}
