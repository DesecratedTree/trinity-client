/* Class_ta_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ta_Sub1 extends Class_ta {
	Interface11_Impl3 anInterface11_Impl3_8659;

	static Class_ta_Sub1 method5682(Class_ra_Sub2 class_ra_sub2, int i, int i_0_, int[] is, int[] is_1_) {
		if (class_ra_sub2.method5006(Class72.aClass72_611, Class86.aClass86_714)) {
			byte[] is_2_ = new byte[i * i_0_];
			for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
				int i_4_ = i_3_ * i + is[i_3_];
				for (int i_5_ = 0; i_5_ < is_1_[i_3_]; i_5_++)
					is_2_[i_4_++] = (byte) -1;
			}
			return new Class_ta_Sub1(class_ra_sub2, i, i_0_, is_2_);
		}
		int[] is_6_ = new int[i * i_0_];
		for (int i_7_ = 0; i_7_ < i_0_; i_7_++) {
			int i_8_ = i_7_ * i + is[i_7_];
			for (int i_9_ = 0; i_9_ < is_1_[i_7_]; i_9_++)
				is_6_[i_8_++] = -16777216;
		}
		return new Class_ta_Sub1(class_ra_sub2, i, i_0_, is_6_);
	}

	Class_ta_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_10_, int[] is) {
		((Class_ta_Sub1) this).anInterface11_Impl3_8659 = class_ra_sub2.method4944(i, i_10_, false, is);
		((Class_ta_Sub1) this).anInterface11_Impl3_8659.method109(false, false);
	}

	Class_ta_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_11_, byte[] is) {
		((Class_ta_Sub1) this).anInterface11_Impl3_8659 = class_ra_sub2.method4945(Class72.aClass72_611, i, i_11_, false, is);
		((Class_ta_Sub1) this).anInterface11_Impl3_8659.method109(false, false);
	}
}
