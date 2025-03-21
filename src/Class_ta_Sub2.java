/* Class_ta_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ta_Sub2 extends Class_ta {
	Class36_Sub1_Sub1 aClass36_Sub1_Sub1_8660;

	static Class_ta_Sub2 method5683(Class_ra_Sub1 class_ra_sub1, int i, int i_0_, int[] is, int[] is_1_) {
		byte[] is_2_ = new byte[i * i_0_];
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			int i_4_ = i_3_ * i + is[i_3_];
			for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
				is_2_[i_4_++] = (byte) -1;
		}
		return new Class_ta_Sub2(class_ra_sub1, i, i_0_, is_2_);
	}

	Class_ta_Sub2(Class_ra_Sub1 class_ra_sub1, int i, int i_6_, byte[] is) {
		((Class_ta_Sub2) this).aClass36_Sub1_Sub1_8660 = Class36_Sub1_Sub1.method526(class_ra_sub1, Class72.aClass72_611, Class86.aClass86_714, i, i_6_, false, is, Class72.aClass72_611);
		((Class_ta_Sub2) this).aClass36_Sub1_Sub1_8660.method518(false, false);
	}
}
