/* Class223_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class223_Sub2_Sub2 extends Class223_Sub2 {
	byte[] aByteArray9487;

	Class223_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	void method2294(int i, byte i_0_) {
		int i_1_ = i * 2;
		int i_2_ = i_0_ & 0xff;
		((Class223_Sub2_Sub2) this).aByteArray9487[i_1_++] = (byte) (3 * i_2_ >> 5);
		((Class223_Sub2_Sub2) this).aByteArray9487[i_1_] = (byte) (3 * i_2_ >> 5);
	}

	byte[] method2297(int i, int i_3_, int i_4_) {
		((Class223_Sub2_Sub2) this).aByteArray9487 = new byte[i * i_3_ * i_4_ * 2];
		method2279(i, i_3_, i_4_);
		return ((Class223_Sub2_Sub2) this).aByteArray9487;
	}

	void method2298(int i, byte i_5_) {
		int i_6_ = i * 2;
		int i_7_ = i_5_ & 0xff;
		((Class223_Sub2_Sub2) this).aByteArray9487[i_6_++] = (byte) (3 * i_7_ >> 5);
		((Class223_Sub2_Sub2) this).aByteArray9487[i_6_] = (byte) (3 * i_7_ >> 5);
	}
}
