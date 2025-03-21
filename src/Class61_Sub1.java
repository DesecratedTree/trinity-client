/* Class61_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61_Sub1 extends Class61 {
	int anInt9300;
	Interface11_Impl3 anInterface11_Impl3_9301;
	Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_9302;
	int anInt9303;
	int anInt9304;
	boolean aBoolean9305 = false;
	int anInt9306;
	boolean aBoolean9307;
	int anInt9308;
	Class_ra_Sub2 aClass_ra_Sub2_9309;
	boolean aBoolean9310;
	boolean aBoolean9311;
	boolean aBoolean9312;
	int anInt9313 = 0;

	void method738(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		((Class61_Sub1) this).anInterface11_Impl3_9301.method118(i, i_0_, i_1_, i_2_, is, i_3_, i_4_);
	}

	public void method694(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int i_11_ = i_5_ + i_7_;
			int i_12_ = i + i_6_;
			int i_13_ = method318();
			int i_14_ = method683();
			int i_15_ = i_5_ + ((Class61_Sub1) this).anInt9313;
			for (int i_16_ = i_15_ + ((Class61_Sub1) this).anInt9304; i_16_ <= i_11_; i_16_ += i_14_) {
				int i_17_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_18_ = i_17_ + ((Class61_Sub1) this).anInt9306; i_18_ <= i_12_; i_18_ += i_13_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_17_, (float) i_15_, (float) (i_17_ + ((Class61_Sub1) this).anInt9306), (float) (i_15_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_9_);
					i_17_ += i_13_;
				}
				if (i_17_ < i_12_) {
					int i_19_ = i_12_ - i_17_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_17_, (float) i_15_, (float) (i_17_ + i_19_), (float) (i_15_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((float) i_19_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_9_);
				}
				i_15_ += i_14_;
			}
			if (i_15_ < i_11_) {
				int i_20_ = i_11_ - i_15_;
				float f = ((float) i_20_ / (float) ((Class61_Sub1) this).anInt9304 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method114());
				int i_21_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_22_ = i_21_ + ((Class61_Sub1) this).anInt9306; i_22_ <= i_12_; i_22_ += i_13_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_21_, (float) i_15_, (float) (i_21_ + ((Class61_Sub1) this).anInt9306), (float) (i_15_ + i_20_), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_9_);
					i_21_ += i_13_;
				}
				if (i_21_ < i_12_) {
					int i_23_ = i_12_ - i_21_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_21_, (float) i_15_, (float) (i_21_ + i_23_), (float) (i_15_ + i_20_), 0.0F, 0.0F, ((float) i_23_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_9_);
				}
			}
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_10_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_8_, i_9_);
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_24_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			boolean bool = (((Class61_Sub1) this).aBoolean9307 && ((Class61_Sub1) this).anInt9313 == 0 && ((Class61_Sub1) this).anInt9303 == 0);
			boolean bool_25_ = (((Class61_Sub1) this).aBoolean9312 && ((Class61_Sub1) this).anInt9308 == 0 && ((Class61_Sub1) this).anInt9300 == 0);
			if (bool_25_ & bool) {
				class159.aClass249_1681.method2486((float) i_6_ * 2.0F / f, (float) i_7_ * 2.0F / f_24_, 1.0F, 1.0F);
				class159.aClass249_1681.aFloatArray2631[12] = ((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
				class159.aClass249_1681.aFloatArray2631[13] = ((float) i_5_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
				class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_6_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_7_), 1.0F, 1.0F);
				class159.method1862();
			} else if (bool_25_) {
				int i_26_ = i_5_ + i_7_;
				int i_27_ = method683();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_6_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
				int i_28_ = i_5_ + ((Class61_Sub1) this).anInt9313;
				for (int i_29_ = i_28_ + ((Class61_Sub1) this).anInt9304; i_29_ <= i_26_; i_29_ += i_27_) {
					class159.aClass249_1681.method2486((float) i_6_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_24_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_28_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_28_ += i_27_;
				}
				if (i_28_ < i_26_) {
					int i_30_ = i_26_ - i_28_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_6_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_30_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486((float) i_6_ * 2.0F / f, ((float) i_30_ * 2.0F / f_24_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_28_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else if (bool) {
				int i_31_ = i + i_6_;
				int i_32_ = method318();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_7_), 1.0F, 1.0F);
				int i_33_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_34_ = i_33_ + ((Class61_Sub1) this).anInt9306; i_34_ <= i_31_; i_34_ += i_32_) {
					class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) i_7_ * 2.0F / f_24_, 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_33_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_5_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_33_ += i_32_;
				}
				if (i_33_ < i_31_) {
					int i_35_ = i_31_ - i_33_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_35_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_7_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486(((float) i_35_ * 2.0F / f), ((float) i_7_ * 2.0F / f_24_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_33_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_5_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else {
				int i_36_ = i_5_ + i_7_;
				int i_37_ = i + i_6_;
				int i_38_ = method318();
				int i_39_ = method683();
				int i_40_ = i_5_ + ((Class61_Sub1) this).anInt9313;
				for (int i_41_ = i_40_ + ((Class61_Sub1) this).anInt9304; i_41_ <= i_36_; i_41_ += i_39_) {
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
					int i_42_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_43_ = i_42_ + ((Class61_Sub1) this).anInt9306; i_43_ <= i_37_; i_43_ += i_38_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_24_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_42_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_40_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_42_ += i_38_;
					}
					if (i_42_ < i_37_) {
						int i_44_ = i_37_ - i_42_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_44_), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
						class159.aClass249_1681.method2486((float) i_44_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_24_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_42_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_40_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
					i_40_ += i_39_;
				}
				if (i_40_ < i_36_) {
					int i_45_ = i_36_ - i_40_;
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_45_), 1.0F, 1.0F);
					int i_46_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_47_ = i_46_ + ((Class61_Sub1) this).anInt9306; i_47_ <= i_37_; i_47_ += i_38_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), (float) i_45_ * 2.0F / f_24_, 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_46_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_40_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_46_ += i_38_;
					}
					if (i_46_ < i_37_) {
						int i_48_ = i_37_ - i_46_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_48_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_45_), 1.0F, 1.0F);
						class159.aClass249_1681.method2486(((float) i_48_ * 2.0F / f), ((float) i_45_ * 2.0F / f_24_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_46_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_40_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_24_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
				}
			}
		}
	}

	Class61_Sub1(Class_ra_Sub2 class_ra_sub2, Interface11_Impl3 interface11_impl3) {
		this(class_ra_sub2, interface11_impl3, interface11_impl3.method137(), interface11_impl3.method108());
	}

	Class61_Sub1(Class_ra_Sub2 class_ra_sub2, Interface11_Impl3 interface11_impl3, int i, int i_49_) {
		((Class61_Sub1) this).anInt9308 = 0;
		((Class61_Sub1) this).anInt9303 = 0;
		((Class61_Sub1) this).anInt9300 = 0;
		((Class61_Sub1) this).aClass_ra_Sub2_9309 = class_ra_sub2;
		((Class61_Sub1) this).anInt9306 = i;
		((Class61_Sub1) this).anInt9304 = i_49_;
		((Class61_Sub1) this).anInterface11_Impl3_9301 = interface11_impl3;
		((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302 = null;
		((Class61_Sub1) this).aBoolean9310 = ((Class61_Sub1) this).anInterface11_Impl3_9301.method137() != i;
		((Class61_Sub1) this).aBoolean9311 = (((Class61_Sub1) this).anInterface11_Impl3_9301.method108() != i_49_);
		((Class61_Sub1) this).aBoolean9312 = (!((Class61_Sub1) this).aBoolean9310 && ((Class61_Sub1) this).anInterface11_Impl3_9301.method113());
		((Class61_Sub1) this).aBoolean9307 = (!((Class61_Sub1) this).aBoolean9311 && ((Class61_Sub1) this).anInterface11_Impl3_9301.method113());
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4894(12);
	}

	Class61_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_50_, int[] is, int i_51_, int i_52_) {
		((Class61_Sub1) this).anInt9308 = 0;
		((Class61_Sub1) this).anInt9303 = 0;
		((Class61_Sub1) this).anInt9300 = 0;
		((Class61_Sub1) this).aClass_ra_Sub2_9309 = class_ra_sub2;
		((Class61_Sub1) this).anInt9306 = i;
		((Class61_Sub1) this).anInt9304 = i_50_;
		((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302 = null;
		((Class61_Sub1) this).anInterface11_Impl3_9301 = class_ra_sub2.method4950(i, i_50_, false, is, i_51_, i_52_);
		((Class61_Sub1) this).anInterface11_Impl3_9301.method109(true, true);
		((Class61_Sub1) this).aBoolean9310 = ((Class61_Sub1) this).anInterface11_Impl3_9301.method137() != i;
		((Class61_Sub1) this).aBoolean9311 = (((Class61_Sub1) this).anInterface11_Impl3_9301.method108() != i_50_);
		((Class61_Sub1) this).aBoolean9312 = (!((Class61_Sub1) this).aBoolean9310 && ((Class61_Sub1) this).anInterface11_Impl3_9301.method113());
		((Class61_Sub1) this).aBoolean9307 = (!((Class61_Sub1) this).aBoolean9311 && ((Class61_Sub1) this).anInterface11_Impl3_9301.method113());
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4894(12);
	}

	public void method722(int i, int i_53_, int i_54_) {
		int[] is = (((Class61_Sub1) this).aClass_ra_Sub2_9309.ar(i, i_53_, ((Class61_Sub1) this).anInt9306, ((Class61_Sub1) this).anInt9304));
		int[] is_55_ = new int[(((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInt9304)];
		((Class61_Sub1) this).anInterface11_Impl3_9301.method110(0, 0, ((Class61_Sub1) this).anInt9306, ((Class61_Sub1) this).anInt9304, is_55_, 0);
		if (i_54_ == 0) {
			for (int i_56_ = 0; i_56_ < ((Class61_Sub1) this).anInt9304; i_56_++) {
				int i_57_ = i_56_ * ((Class61_Sub1) this).anInt9306;
				for (int i_58_ = 0; i_58_ < ((Class61_Sub1) this).anInt9306; i_58_++)
					is_55_[i_57_ + i_58_] = (is_55_[i_57_ + i_58_] & 0xffffff | is[i_57_ + i_58_] << 8 & ~0xffffff);
			}
		} else if (i_54_ == 1) {
			for (int i_59_ = 0; i_59_ < ((Class61_Sub1) this).anInt9304; i_59_++) {
				int i_60_ = i_59_ * ((Class61_Sub1) this).anInt9306;
				for (int i_61_ = 0; i_61_ < ((Class61_Sub1) this).anInt9306; i_61_++)
					is_55_[i_60_ + i_61_] = (is_55_[i_60_ + i_61_] & 0xffffff | is[i_60_ + i_61_] << 16 & ~0xffffff);
			}
		} else if (i_54_ == 2) {
			for (int i_62_ = 0; i_62_ < ((Class61_Sub1) this).anInt9304; i_62_++) {
				int i_63_ = i_62_ * ((Class61_Sub1) this).anInt9306;
				for (int i_64_ = 0; i_64_ < ((Class61_Sub1) this).anInt9306; i_64_++)
					is_55_[i_63_ + i_64_] = (is_55_[i_63_ + i_64_] & 0xffffff | is[i_63_ + i_64_] << 24 & ~0xffffff);
			}
		} else if (i_54_ == 3) {
			for (int i_65_ = 0; i_65_ < ((Class61_Sub1) this).anInt9304; i_65_++) {
				int i_66_ = i_65_ * ((Class61_Sub1) this).anInt9306;
				for (int i_67_ = 0; i_67_ < ((Class61_Sub1) this).anInt9306; i_67_++)
					is_55_[i_66_ + i_67_] = (is_55_[i_66_ + i_67_] & 0xffffff | (is[i_66_ + i_67_] != 0 ? -16777216 : 0));
			}
		}
		method738(0, 0, ((Class61_Sub1) this).anInt9306, ((Class61_Sub1) this).anInt9304, is_55_, 0, ((Class61_Sub1) this).anInt9306);
	}

	public void method717(int i, int i_68_, int i_69_, int i_70_) {
		((Class61_Sub1) this).anInt9308 = i;
		((Class61_Sub1) this).anInt9313 = i_68_;
		((Class61_Sub1) this).anInt9300 = i_69_;
		((Class61_Sub1) this).anInt9303 = i_70_;
		((Class61_Sub1) this).aBoolean9305 = (((Class61_Sub1) this).anInt9308 != 0 || ((Class61_Sub1) this).anInt9313 != 0 || ((Class61_Sub1) this).anInt9300 != 0 || ((Class61_Sub1) this).anInt9303 != 0);
	}

	public void method680(int[] is) {
		is[0] = ((Class61_Sub1) this).anInt9308;
		is[1] = ((Class61_Sub1) this).anInt9313;
		is[2] = ((Class61_Sub1) this).anInt9300;
		is[3] = ((Class61_Sub1) this).anInt9303;
	}

	public int method681() {
		return ((Class61_Sub1) this).anInt9306;
	}

	public int method318() {
		return (((Class61_Sub1) this).anInt9306 + ((Class61_Sub1) this).anInt9308 + ((Class61_Sub1) this).anInt9300);
	}

	public int method682() {
		return ((Class61_Sub1) this).anInt9304;
	}

	public int method683() {
		return (((Class61_Sub1) this).anInt9304 + ((Class61_Sub1) this).anInt9313 + ((Class61_Sub1) this).anInt9303);
	}

	public Interface8_Impl1_Impl2 method684() {
		return ((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302;
	}

	public int method315() {
		return (((Class61_Sub1) this).anInt9306 + ((Class61_Sub1) this).anInt9308 + ((Class61_Sub1) this).anInt9300);
	}

	public void method737(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_) {
		int[] is = ((Class61_Sub1) this).aClass_ra_Sub2_9309.ar(i_74_, i_75_, i_72_, i_73_);
		if (is != null) {
			for (int i_76_ = 0; i_76_ < is.length; i_76_++)
				is[i_76_] |= ~0xffffff;
			method738(i, i_71_, i_72_, i_73_, is, 0, i_72_);
		}
	}

	public void method689(int i, int i_77_, Class_ta class_ta, int i_78_, int i_79_) {
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
		Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
		class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
		class159.method1861(1, -1);
		i += ((Class61_Sub1) this).anInt9308;
		i_77_ += ((Class61_Sub1) this).anInt9313;
		float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float f_80_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_80_, 1.0F, 1.0F);
		class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
		class159.aClass249_1681.aFloatArray2631[13] = (((float) i_77_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_80_) - 1.0F;
		class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
		class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
		class159.anInt1685 = 0;
		class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
		Interface11_Impl3 interface11_impl3 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).anInterface11_Impl3_8659);
		class159.anInterface11_Impl3_1680 = interface11_impl3;
		class159.aClass249_1683.method2486(interface11_impl3.method106((float) ((Class61_Sub1) this).anInt9306), interface11_impl3.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.aClass249_1683.aFloatArray2631[12] = interface11_impl3.method106((float) (i - i_78_));
		class159.aClass249_1683.aFloatArray2631[13] = interface11_impl3.method104((float) (i_77_ - i_79_));
		class159.method1864();
	}

	void method720(float f, float f_81_, float f_82_, float f_83_, float f_84_, float f_85_, int i, Class_ta class_ta, int i_86_, int i_87_) {
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
		Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
		class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
		class159.method1861(1, -1);
		float f_88_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float f_89_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		class159.aClass249_1681.method2516();
		if (((Class61_Sub1) this).aBoolean9305) {
			float f_90_ = ((float) ((Class61_Sub1) this).anInt9306 / (float) method318());
			float f_91_ = ((float) ((Class61_Sub1) this).anInt9304 / (float) method683());
			class159.aClass249_1681.aFloatArray2631[0] = (f_82_ - f) * f_90_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_83_ - f_81_) * f_90_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_84_ - f) * f_91_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_85_ - f_81_) * f_91_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + (float) ((Class61_Sub1) this).anInt9308) * f_90_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
			class159.aClass249_1681.aFloatArray2631[13] = ((f_81_ + (float) ((Class61_Sub1) this).anInt9313) * f_91_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		} else {
			class159.aClass249_1681.aFloatArray2631[0] = f_82_ - f;
			class159.aClass249_1681.aFloatArray2631[1] = f_83_ - f_81_;
			class159.aClass249_1681.aFloatArray2631[4] = f_84_ - f;
			class159.aClass249_1681.aFloatArray2631[5] = f_85_ - f_81_;
			class159.aClass249_1681.aFloatArray2631[12] = f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901();
			class159.aClass249_1681.aFloatArray2631[13] = (f_81_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		}
		Class249 class249 = ((Class61_Sub1) this).aClass_ra_Sub2_9309.aClass249_8576;
		class249.method2516();
		class249.aFloatArray2631[0] = 2.0F / f_88_;
		class249.aFloatArray2631[5] = 2.0F / f_89_;
		class249.aFloatArray2631[12] = -1.0F;
		class249.aFloatArray2631[13] = -1.0F;
		class249.aFloatArray2631[14] = -1.0F;
		class159.aClass249_1681.method2483(class249);
		class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
		class159.anInt1685 = 0;
		class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
		Interface11_Impl3 interface11_impl3 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).anInterface11_Impl3_8659);
		class159.anInterface11_Impl3_1680 = interface11_impl3;
		class159.aClass249_1683.method2516();
		class159.aClass249_1683.aFloatArray2631[0] = (f_82_ - f) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[1] = (f_83_ - f_81_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[4] = (f_84_ - f) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[5] = (f_85_ - f_81_) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[12] = (f - (float) i_86_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[13] = (f_81_ - (float) i_87_) * interface11_impl3.method104(1.0F);
		class159.method1864();
	}

	public int method693() {
		return ((Class61_Sub1) this).anInt9304;
	}

	void method735(float f, float f_92_, float f_93_, float f_94_, float f_95_, float f_96_, int i, int i_97_, int i_98_, int i_99_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688)
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2092(f, f_92_, f_93_, f_94_, f_95_, f_96_, f_93_ + f_95_ - f, f_94_ + f_96_ - f_92_, 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_97_);
		else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_98_);
			if (((Class61_Sub1) this).aBoolean9305) {
				float f_100_ = (float) method318();
				float f_101_ = (float) method683();
				float f_102_ = (f_93_ - f) / f_100_;
				float f_103_ = (f_94_ - f_92_) / f_100_;
				float f_104_ = (f_95_ - f) / f_101_;
				float f_105_ = (f_96_ - f_92_) / f_101_;
				float f_106_ = f_104_ * (float) ((Class61_Sub1) this).anInt9313;
				float f_107_ = f_105_ * (float) ((Class61_Sub1) this).anInt9313;
				float f_108_ = f_102_ * (float) ((Class61_Sub1) this).anInt9308;
				float f_109_ = f_103_ * (float) ((Class61_Sub1) this).anInt9308;
				float f_110_ = -f_102_ * (float) ((Class61_Sub1) this).anInt9300;
				float f_111_ = -f_103_ * (float) ((Class61_Sub1) this).anInt9300;
				float f_112_ = -f_104_ * (float) ((Class61_Sub1) this).anInt9303;
				float f_113_ = -f_105_ * (float) ((Class61_Sub1) this).anInt9303;
				f = f + f_108_ + f_106_;
				f_92_ = f_92_ + f_109_ + f_107_;
				f_93_ = f_93_ + f_110_ + f_106_;
				f_94_ = f_94_ + f_111_ + f_107_;
				f_95_ = f_95_ + f_108_ + f_112_;
				f_96_ = f_96_ + f_109_ + f_113_;
			}
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i, i_97_);
			float f_114_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_115_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2516();
			class159.aClass249_1681.aFloatArray2631[0] = (f_93_ - f) * 2.0F / f_114_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_94_ - f_92_) * 2.0F / f_115_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_95_ - f) * 2.0F / f_114_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_96_ - f_92_) * 2.0F / f_115_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_114_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = ((f_92_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_115_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	void method703(float f, float f_116_, float f_117_, float f_118_, float f_119_, float f_120_, int i, Class_ta class_ta, int i_121_, int i_122_) {
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
		Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
		class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
		class159.method1861(1, -1);
		float f_123_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float f_124_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		class159.aClass249_1681.method2516();
		if (((Class61_Sub1) this).aBoolean9305) {
			float f_125_ = ((float) ((Class61_Sub1) this).anInt9306 / (float) method318());
			float f_126_ = ((float) ((Class61_Sub1) this).anInt9304 / (float) method683());
			class159.aClass249_1681.aFloatArray2631[0] = (f_117_ - f) * f_125_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_118_ - f_116_) * f_125_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_119_ - f) * f_126_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_120_ - f_116_) * f_126_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + (float) ((Class61_Sub1) this).anInt9308) * f_125_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
			class159.aClass249_1681.aFloatArray2631[13] = ((f_116_ + (float) ((Class61_Sub1) this).anInt9313) * f_126_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		} else {
			class159.aClass249_1681.aFloatArray2631[0] = f_117_ - f;
			class159.aClass249_1681.aFloatArray2631[1] = f_118_ - f_116_;
			class159.aClass249_1681.aFloatArray2631[4] = f_119_ - f;
			class159.aClass249_1681.aFloatArray2631[5] = f_120_ - f_116_;
			class159.aClass249_1681.aFloatArray2631[12] = f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901();
			class159.aClass249_1681.aFloatArray2631[13] = (f_116_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		}
		Class249 class249 = ((Class61_Sub1) this).aClass_ra_Sub2_9309.aClass249_8576;
		class249.method2516();
		class249.aFloatArray2631[0] = 2.0F / f_123_;
		class249.aFloatArray2631[5] = 2.0F / f_124_;
		class249.aFloatArray2631[12] = -1.0F;
		class249.aFloatArray2631[13] = -1.0F;
		class249.aFloatArray2631[14] = -1.0F;
		class159.aClass249_1681.method2483(class249);
		class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
		class159.anInt1685 = 0;
		class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
		Interface11_Impl3 interface11_impl3 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).anInterface11_Impl3_8659);
		class159.anInterface11_Impl3_1680 = interface11_impl3;
		class159.aClass249_1683.method2516();
		class159.aClass249_1683.aFloatArray2631[0] = (f_117_ - f) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[1] = (f_118_ - f_116_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[4] = (f_119_ - f) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[5] = (f_120_ - f_116_) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[12] = (f - (float) i_121_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[13] = (f_116_ - (float) i_122_) * interface11_impl3.method104(1.0F);
		class159.method1864();
	}

	public Interface8_Impl1_Impl2 method713() {
		return ((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302;
	}

	public void method705(int i, int i_127_, int i_128_) {
		int[] is = (((Class61_Sub1) this).aClass_ra_Sub2_9309.ar(i, i_127_, ((Class61_Sub1) this).anInt9306, ((Class61_Sub1) this).anInt9304));
		int[] is_129_ = new int[(((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInt9304)];
		((Class61_Sub1) this).anInterface11_Impl3_9301.method110(0, 0, ((Class61_Sub1) this).anInt9306, ((Class61_Sub1) this).anInt9304, is_129_, 0);
		if (i_128_ == 0) {
			for (int i_130_ = 0; i_130_ < ((Class61_Sub1) this).anInt9304; i_130_++) {
				int i_131_ = i_130_ * ((Class61_Sub1) this).anInt9306;
				for (int i_132_ = 0; i_132_ < ((Class61_Sub1) this).anInt9306; i_132_++)
					is_129_[i_131_ + i_132_] = (is_129_[i_131_ + i_132_] & 0xffffff | is[i_131_ + i_132_] << 8 & ~0xffffff);
			}
		} else if (i_128_ == 1) {
			for (int i_133_ = 0; i_133_ < ((Class61_Sub1) this).anInt9304; i_133_++) {
				int i_134_ = i_133_ * ((Class61_Sub1) this).anInt9306;
				for (int i_135_ = 0; i_135_ < ((Class61_Sub1) this).anInt9306; i_135_++)
					is_129_[i_134_ + i_135_] = (is_129_[i_134_ + i_135_] & 0xffffff | is[i_134_ + i_135_] << 16 & ~0xffffff);
			}
		} else if (i_128_ == 2) {
			for (int i_136_ = 0; i_136_ < ((Class61_Sub1) this).anInt9304; i_136_++) {
				int i_137_ = i_136_ * ((Class61_Sub1) this).anInt9306;
				for (int i_138_ = 0; i_138_ < ((Class61_Sub1) this).anInt9306; i_138_++)
					is_129_[i_137_ + i_138_] = (is_129_[i_137_ + i_138_] & 0xffffff | is[i_137_ + i_138_] << 24 & ~0xffffff);
			}
		} else if (i_128_ == 3) {
			for (int i_139_ = 0; i_139_ < ((Class61_Sub1) this).anInt9304; i_139_++) {
				int i_140_ = i_139_ * ((Class61_Sub1) this).anInt9306;
				for (int i_141_ = 0; i_141_ < ((Class61_Sub1) this).anInt9306; i_141_++)
					is_129_[i_140_ + i_141_] = (is_129_[i_140_ + i_141_] & 0xffffff | (is[i_140_ + i_141_] != 0 ? -16777216 : 0));
			}
		}
		method738(0, 0, ((Class61_Sub1) this).anInt9306, ((Class61_Sub1) this).anInt9304, is_129_, 0, ((Class61_Sub1) this).anInt9306);
	}

	public int method714() {
		return ((Class61_Sub1) this).anInt9306;
	}

	public void method685(int i, int i_142_, int i_143_, int i_144_, int i_145_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			i += ((Class61_Sub1) this).anInt9308;
			i_142_ += ((Class61_Sub1) this).anInt9313;
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_142_, (float) (i + ((Class61_Sub1) this).anInt9306), (float) (i_142_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_144_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_145_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_143_, i_144_);
			i += ((Class61_Sub1) this).anInt9308;
			i_142_ += ((Class61_Sub1) this).anInt9313;
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_146_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_146_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_142_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_146_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	public int method702() {
		return ((Class61_Sub1) this).anInt9306;
	}

	public Interface8_Impl1_Impl2 method678() {
		return ((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302;
	}

	public void method700(int i, int i_147_, int i_148_, int i_149_, int i_150_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			i += ((Class61_Sub1) this).anInt9308;
			i_147_ += ((Class61_Sub1) this).anInt9313;
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_147_, (float) (i + ((Class61_Sub1) this).anInt9306), (float) (i_147_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_149_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_150_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_148_, i_149_);
			i += ((Class61_Sub1) this).anInt9308;
			i_147_ += ((Class61_Sub1) this).anInt9313;
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_151_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_151_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_147_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_151_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	public void method692(int[] is) {
		is[0] = ((Class61_Sub1) this).anInt9308;
		is[1] = ((Class61_Sub1) this).anInt9313;
		is[2] = ((Class61_Sub1) this).anInt9300;
		is[3] = ((Class61_Sub1) this).anInt9303;
	}

	public void method708(int i, int i_152_, Class_ta class_ta, int i_153_, int i_154_) {
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
		Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
		class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
		class159.method1861(1, -1);
		i += ((Class61_Sub1) this).anInt9308;
		i_152_ += ((Class61_Sub1) this).anInt9313;
		float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float f_155_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_155_, 1.0F, 1.0F);
		class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
		class159.aClass249_1681.aFloatArray2631[13] = (((float) i_152_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_155_) - 1.0F;
		class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
		class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
		class159.anInt1685 = 0;
		class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
		Interface11_Impl3 interface11_impl3 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).anInterface11_Impl3_8659);
		class159.anInterface11_Impl3_1680 = interface11_impl3;
		class159.aClass249_1683.method2486(interface11_impl3.method106((float) ((Class61_Sub1) this).anInt9306), interface11_impl3.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.aClass249_1683.aFloatArray2631[12] = interface11_impl3.method106((float) (i - i_153_));
		class159.aClass249_1683.aFloatArray2631[13] = interface11_impl3.method104((float) (i_152_ - i_154_));
		class159.method1864();
	}

	public void method704(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_) {
		int[] is = ((Class61_Sub1) this).aClass_ra_Sub2_9309.ar(i_159_, i_160_, i_157_, i_158_);
		if (is != null) {
			for (int i_161_ = 0; i_161_ < is.length; i_161_++)
				is[i_161_] |= ~0xffffff;
			method738(i, i_156_, i_157_, i_158_, is, 0, i_157_);
		}
	}

	void method710(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (((Class61_Sub1) this).aBoolean9305) {
				i_163_ = i_163_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_164_ = i_164_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_163_ / ((Class61_Sub1) this).anInt9306);
				i_162_ += (((Class61_Sub1) this).anInt9313 * i_164_ / ((Class61_Sub1) this).anInt9304);
			}
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_162_, (float) (i + i_163_), (float) (i_162_ + i_164_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_166_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_167_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_165_, i_166_);
			if (((Class61_Sub1) this).aBoolean9305) {
				i_163_ = i_163_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_164_ = i_164_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_163_ / ((Class61_Sub1) this).anInt9306);
				i_162_ += (((Class61_Sub1) this).anInt9313 * i_164_ / ((Class61_Sub1) this).anInt9304);
			}
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_169_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) i_163_ * 2.0F / f, (float) i_164_ * 2.0F / f_169_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_162_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_169_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	void method706(int i, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (((Class61_Sub1) this).aBoolean9305) {
				i_171_ = i_171_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_172_ = i_172_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_171_ / ((Class61_Sub1) this).anInt9306);
				i_170_ += (((Class61_Sub1) this).anInt9313 * i_172_ / ((Class61_Sub1) this).anInt9304);
			}
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_170_, (float) (i + i_171_), (float) (i_170_ + i_172_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_174_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_175_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_173_, i_174_);
			if (((Class61_Sub1) this).aBoolean9305) {
				i_171_ = i_171_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_172_ = i_172_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_171_ / ((Class61_Sub1) this).anInt9306);
				i_170_ += (((Class61_Sub1) this).anInt9313 * i_172_ / ((Class61_Sub1) this).anInt9304);
			}
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_177_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) i_171_ * 2.0F / f, (float) i_172_ * 2.0F / f_177_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_170_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_177_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	void method712(int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (((Class61_Sub1) this).aBoolean9305) {
				i_179_ = i_179_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_180_ = i_180_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_179_ / ((Class61_Sub1) this).anInt9306);
				i_178_ += (((Class61_Sub1) this).anInt9313 * i_180_ / ((Class61_Sub1) this).anInt9304);
			}
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_178_, (float) (i + i_179_), (float) (i_178_ + i_180_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_182_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_183_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_181_, i_182_);
			if (((Class61_Sub1) this).aBoolean9305) {
				i_179_ = i_179_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_180_ = i_180_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_179_ / ((Class61_Sub1) this).anInt9306);
				i_178_ += (((Class61_Sub1) this).anInt9313 * i_180_ / ((Class61_Sub1) this).anInt9304);
			}
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_185_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) i_179_ * 2.0F / f, (float) i_180_ * 2.0F / f_185_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_178_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_185_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	public void method701(int i, int i_186_, int i_187_, int i_188_) {
		((Class61_Sub1) this).anInt9308 = i;
		((Class61_Sub1) this).anInt9313 = i_186_;
		((Class61_Sub1) this).anInt9300 = i_187_;
		((Class61_Sub1) this).anInt9303 = i_188_;
		((Class61_Sub1) this).aBoolean9305 = (((Class61_Sub1) this).anInt9308 != 0 || ((Class61_Sub1) this).anInt9313 != 0 || ((Class61_Sub1) this).anInt9300 != 0 || ((Class61_Sub1) this).anInt9303 != 0);
	}

	void method728(float f, float f_189_, float f_190_, float f_191_, float f_192_, float f_193_, int i, int i_194_, int i_195_, int i_196_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688)
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2092(f, f_189_, f_190_, f_191_, f_192_, f_193_, f_190_ + f_192_ - f, f_191_ + f_193_ - f_189_, 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_194_);
		else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_195_);
			if (((Class61_Sub1) this).aBoolean9305) {
				float f_197_ = (float) method318();
				float f_198_ = (float) method683();
				float f_199_ = (f_190_ - f) / f_197_;
				float f_200_ = (f_191_ - f_189_) / f_197_;
				float f_201_ = (f_192_ - f) / f_198_;
				float f_202_ = (f_193_ - f_189_) / f_198_;
				float f_203_ = f_201_ * (float) ((Class61_Sub1) this).anInt9313;
				float f_204_ = f_202_ * (float) ((Class61_Sub1) this).anInt9313;
				float f_205_ = f_199_ * (float) ((Class61_Sub1) this).anInt9308;
				float f_206_ = f_200_ * (float) ((Class61_Sub1) this).anInt9308;
				float f_207_ = -f_199_ * (float) ((Class61_Sub1) this).anInt9300;
				float f_208_ = -f_200_ * (float) ((Class61_Sub1) this).anInt9300;
				float f_209_ = -f_201_ * (float) ((Class61_Sub1) this).anInt9303;
				float f_210_ = -f_202_ * (float) ((Class61_Sub1) this).anInt9303;
				f = f + f_205_ + f_203_;
				f_189_ = f_189_ + f_206_ + f_204_;
				f_190_ = f_190_ + f_207_ + f_203_;
				f_191_ = f_191_ + f_208_ + f_204_;
				f_192_ = f_192_ + f_205_ + f_209_;
				f_193_ = f_193_ + f_206_ + f_210_;
			}
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i, i_194_);
			float f_211_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_212_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2516();
			class159.aClass249_1681.aFloatArray2631[0] = (f_190_ - f) * 2.0F / f_211_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_191_ - f_189_) * 2.0F / f_212_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_192_ - f) * 2.0F / f_211_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_193_ - f_189_) * 2.0F / f_212_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_211_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = ((f_189_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_212_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	Class61_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_213_, boolean bool, boolean bool_214_) {
		((Class61_Sub1) this).anInt9308 = 0;
		((Class61_Sub1) this).anInt9303 = 0;
		((Class61_Sub1) this).anInt9300 = 0;
		((Class61_Sub1) this).aClass_ra_Sub2_9309 = class_ra_sub2;
		((Class61_Sub1) this).anInt9306 = i;
		((Class61_Sub1) this).anInt9304 = i_213_;
		if (bool_214_) {
			Interface11_Impl3_Impl1 interface11_impl3_impl1 = class_ra_sub2.method4953((bool ? Class72.aClass72_620 : Class72.aClass72_614), Class86.aClass86_714, i, i_213_);
			((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302 = interface11_impl3_impl1.method169(0);
			((Class61_Sub1) this).anInterface11_Impl3_9301 = interface11_impl3_impl1;
		} else {
			((Class61_Sub1) this).anInterface11_Impl3_9301 = class_ra_sub2.method4904((bool ? Class72.aClass72_620 : Class72.aClass72_614), Class86.aClass86_714, i, i_213_);
			((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302 = null;
		}
		((Class61_Sub1) this).anInterface11_Impl3_9301.method109(true, true);
		((Class61_Sub1) this).aBoolean9310 = ((Class61_Sub1) this).anInterface11_Impl3_9301.method137() != i;
		((Class61_Sub1) this).aBoolean9311 = (((Class61_Sub1) this).anInterface11_Impl3_9301.method108() != i_213_);
		((Class61_Sub1) this).aBoolean9312 = (!((Class61_Sub1) this).aBoolean9310 && ((Class61_Sub1) this).anInterface11_Impl3_9301.method113());
		((Class61_Sub1) this).aBoolean9307 = (!((Class61_Sub1) this).aBoolean9311 && ((Class61_Sub1) this).anInterface11_Impl3_9301.method113());
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4894(12);
	}

	public int method699() {
		return ((Class61_Sub1) this).anInt9306;
	}

	public Interface8_Impl1_Impl2 method729() {
		return ((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302;
	}

	public void method688(int i, int i_215_, int i_216_, int i_217_, int i_218_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			i += ((Class61_Sub1) this).anInt9308;
			i_215_ += ((Class61_Sub1) this).anInt9313;
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_215_, (float) (i + ((Class61_Sub1) this).anInt9306), (float) (i_215_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_217_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_218_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_216_, i_217_);
			i += ((Class61_Sub1) this).anInt9308;
			i_215_ += ((Class61_Sub1) this).anInt9313;
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_219_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_219_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_215_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_219_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	public int method718() {
		return ((Class61_Sub1) this).anInt9304;
	}

	public int method719() {
		return ((Class61_Sub1) this).anInt9304;
	}

	public int method316() {
		return (((Class61_Sub1) this).anInt9306 + ((Class61_Sub1) this).anInt9308 + ((Class61_Sub1) this).anInt9300);
	}

	public Interface8_Impl1_Impl2 method707() {
		return ((Class61_Sub1) this).anInterface8_Impl1_Impl2_9302;
	}

	public int method317() {
		return (((Class61_Sub1) this).anInt9306 + ((Class61_Sub1) this).anInt9308 + ((Class61_Sub1) this).anInt9300);
	}

	public int method711() {
		return (((Class61_Sub1) this).anInt9304 + ((Class61_Sub1) this).anInt9313 + ((Class61_Sub1) this).anInt9303);
	}

	public int method724() {
		return (((Class61_Sub1) this).anInt9304 + ((Class61_Sub1) this).anInt9313 + ((Class61_Sub1) this).anInt9303);
	}

	public int method723() {
		return (((Class61_Sub1) this).anInt9304 + ((Class61_Sub1) this).anInt9313 + ((Class61_Sub1) this).anInt9303);
	}

	public int method696() {
		return (((Class61_Sub1) this).anInt9304 + ((Class61_Sub1) this).anInt9313 + ((Class61_Sub1) this).anInt9303);
	}

	void method709(int i, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (((Class61_Sub1) this).aBoolean9305) {
				i_221_ = i_221_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_222_ = i_222_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_221_ / ((Class61_Sub1) this).anInt9306);
				i_220_ += (((Class61_Sub1) this).anInt9313 * i_222_ / ((Class61_Sub1) this).anInt9304);
			}
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_220_, (float) (i + i_221_), (float) (i_220_ + i_222_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_224_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_225_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_223_, i_224_);
			if (((Class61_Sub1) this).aBoolean9305) {
				i_221_ = i_221_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_222_ = i_222_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_221_ / ((Class61_Sub1) this).anInt9306);
				i_220_ += (((Class61_Sub1) this).anInt9313 * i_222_ / ((Class61_Sub1) this).anInt9304);
			}
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_227_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) i_221_ * 2.0F / f, (float) i_222_ * 2.0F / f_227_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_220_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_227_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	public void method726(int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int i_234_ = i_228_ + i_230_;
			int i_235_ = i + i_229_;
			int i_236_ = method318();
			int i_237_ = method683();
			int i_238_ = i_228_ + ((Class61_Sub1) this).anInt9313;
			for (int i_239_ = i_238_ + ((Class61_Sub1) this).anInt9304; i_239_ <= i_234_; i_239_ += i_237_) {
				int i_240_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_241_ = i_240_ + ((Class61_Sub1) this).anInt9306; i_241_ <= i_235_; i_241_ += i_236_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_240_, (float) i_238_, (float) (i_240_ + ((Class61_Sub1) this).anInt9306), (float) (i_238_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_232_);
					i_240_ += i_236_;
				}
				if (i_240_ < i_235_) {
					int i_242_ = i_235_ - i_240_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_240_, (float) i_238_, (float) (i_240_ + i_242_), (float) (i_238_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((float) i_242_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_232_);
				}
				i_238_ += i_237_;
			}
			if (i_238_ < i_234_) {
				int i_243_ = i_234_ - i_238_;
				float f = ((float) i_243_ / (float) ((Class61_Sub1) this).anInt9304 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method114());
				int i_244_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_245_ = i_244_ + ((Class61_Sub1) this).anInt9306; i_245_ <= i_235_; i_245_ += i_236_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_244_, (float) i_238_, (float) (i_244_ + ((Class61_Sub1) this).anInt9306), (float) (i_238_ + i_243_), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_232_);
					i_244_ += i_236_;
				}
				if (i_244_ < i_235_) {
					int i_246_ = i_235_ - i_244_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_244_, (float) i_238_, (float) (i_244_ + i_246_), (float) (i_238_ + i_243_), 0.0F, 0.0F, ((float) i_246_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_232_);
				}
			}
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_233_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_231_, i_232_);
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_247_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			boolean bool = (((Class61_Sub1) this).aBoolean9307 && ((Class61_Sub1) this).anInt9313 == 0 && ((Class61_Sub1) this).anInt9303 == 0);
			boolean bool_248_ = (((Class61_Sub1) this).aBoolean9312 && ((Class61_Sub1) this).anInt9308 == 0 && ((Class61_Sub1) this).anInt9300 == 0);
			if (bool_248_ & bool) {
				class159.aClass249_1681.method2486((float) i_229_ * 2.0F / f, ((float) i_230_ * 2.0F / f_247_), 1.0F, 1.0F);
				class159.aClass249_1681.aFloatArray2631[12] = ((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
				class159.aClass249_1681.aFloatArray2631[13] = (((float) i_228_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_) - 1.0F;
				class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_229_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_230_), 1.0F, 1.0F);
				class159.method1862();
			} else if (bool_248_) {
				int i_249_ = i_228_ + i_230_;
				int i_250_ = method683();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_229_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
				int i_251_ = i_228_ + ((Class61_Sub1) this).anInt9313;
				for (int i_252_ = i_251_ + ((Class61_Sub1) this).anInt9304; i_252_ <= i_249_; i_252_ += i_250_) {
					class159.aClass249_1681.method2486((float) i_229_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_247_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_251_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_251_ += i_250_;
				}
				if (i_251_ < i_249_) {
					int i_253_ = i_249_ - i_251_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_229_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_253_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486(((float) i_229_ * 2.0F / f), ((float) i_253_ * 2.0F / f_247_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_251_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else if (bool) {
				int i_254_ = i + i_229_;
				int i_255_ = method318();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_230_), 1.0F, 1.0F);
				int i_256_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_257_ = i_256_ + ((Class61_Sub1) this).anInt9306; i_257_ <= i_254_; i_257_ += i_255_) {
					class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) i_230_ * 2.0F / f_247_, 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_256_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_228_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_256_ += i_255_;
				}
				if (i_256_ < i_254_) {
					int i_258_ = i_254_ - i_256_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_258_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_230_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486(((float) i_258_ * 2.0F / f), ((float) i_230_ * 2.0F / f_247_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_256_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_228_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else {
				int i_259_ = i_228_ + i_230_;
				int i_260_ = i + i_229_;
				int i_261_ = method318();
				int i_262_ = method683();
				int i_263_ = i_228_ + ((Class61_Sub1) this).anInt9313;
				for (int i_264_ = i_263_ + ((Class61_Sub1) this).anInt9304; i_264_ <= i_259_; i_264_ += i_262_) {
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
					int i_265_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_266_ = i_265_ + ((Class61_Sub1) this).anInt9306; i_266_ <= i_260_; i_266_ += i_261_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_247_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_265_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_263_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_265_ += i_261_;
					}
					if (i_265_ < i_260_) {
						int i_267_ = i_260_ - i_265_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_267_), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
						class159.aClass249_1681.method2486((float) i_267_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_247_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_265_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_263_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
					i_263_ += i_262_;
				}
				if (i_263_ < i_259_) {
					int i_268_ = i_259_ - i_263_;
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_268_), 1.0F, 1.0F);
					int i_269_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_270_ = i_269_ + ((Class61_Sub1) this).anInt9306; i_270_ <= i_260_; i_270_ += i_261_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), (float) i_268_ * 2.0F / f_247_, 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_269_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_263_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_269_ += i_261_;
					}
					if (i_269_ < i_260_) {
						int i_271_ = i_260_ - i_269_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_271_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_268_), 1.0F, 1.0F);
						class159.aClass249_1681.method2486(((float) i_271_ * 2.0F / f), ((float) i_268_ * 2.0F / f_247_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_269_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_263_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_247_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
				}
			}
		}
	}

	public void method727(int i, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int i_278_ = i_272_ + i_274_;
			int i_279_ = i + i_273_;
			int i_280_ = method318();
			int i_281_ = method683();
			int i_282_ = i_272_ + ((Class61_Sub1) this).anInt9313;
			for (int i_283_ = i_282_ + ((Class61_Sub1) this).anInt9304; i_283_ <= i_278_; i_283_ += i_281_) {
				int i_284_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_285_ = i_284_ + ((Class61_Sub1) this).anInt9306; i_285_ <= i_279_; i_285_ += i_280_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_284_, (float) i_282_, (float) (i_284_ + ((Class61_Sub1) this).anInt9306), (float) (i_282_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_276_);
					i_284_ += i_280_;
				}
				if (i_284_ < i_279_) {
					int i_286_ = i_279_ - i_284_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_284_, (float) i_282_, (float) (i_284_ + i_286_), (float) (i_282_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((float) i_286_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_276_);
				}
				i_282_ += i_281_;
			}
			if (i_282_ < i_278_) {
				int i_287_ = i_278_ - i_282_;
				float f = ((float) i_287_ / (float) ((Class61_Sub1) this).anInt9304 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method114());
				int i_288_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_289_ = i_288_ + ((Class61_Sub1) this).anInt9306; i_289_ <= i_279_; i_289_ += i_280_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_288_, (float) i_282_, (float) (i_288_ + ((Class61_Sub1) this).anInt9306), (float) (i_282_ + i_287_), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_276_);
					i_288_ += i_280_;
				}
				if (i_288_ < i_279_) {
					int i_290_ = i_279_ - i_288_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_288_, (float) i_282_, (float) (i_288_ + i_290_), (float) (i_282_ + i_287_), 0.0F, 0.0F, ((float) i_290_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_276_);
				}
			}
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_277_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_275_, i_276_);
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_291_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			boolean bool = (((Class61_Sub1) this).aBoolean9307 && ((Class61_Sub1) this).anInt9313 == 0 && ((Class61_Sub1) this).anInt9303 == 0);
			boolean bool_292_ = (((Class61_Sub1) this).aBoolean9312 && ((Class61_Sub1) this).anInt9308 == 0 && ((Class61_Sub1) this).anInt9300 == 0);
			if (bool_292_ & bool) {
				class159.aClass249_1681.method2486((float) i_273_ * 2.0F / f, ((float) i_274_ * 2.0F / f_291_), 1.0F, 1.0F);
				class159.aClass249_1681.aFloatArray2631[12] = ((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
				class159.aClass249_1681.aFloatArray2631[13] = (((float) i_272_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_) - 1.0F;
				class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_273_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_274_), 1.0F, 1.0F);
				class159.method1862();
			} else if (bool_292_) {
				int i_293_ = i_272_ + i_274_;
				int i_294_ = method683();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_273_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
				int i_295_ = i_272_ + ((Class61_Sub1) this).anInt9313;
				for (int i_296_ = i_295_ + ((Class61_Sub1) this).anInt9304; i_296_ <= i_293_; i_296_ += i_294_) {
					class159.aClass249_1681.method2486((float) i_273_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_291_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_295_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_295_ += i_294_;
				}
				if (i_295_ < i_293_) {
					int i_297_ = i_293_ - i_295_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_273_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_297_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486(((float) i_273_ * 2.0F / f), ((float) i_297_ * 2.0F / f_291_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_295_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else if (bool) {
				int i_298_ = i + i_273_;
				int i_299_ = method318();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_274_), 1.0F, 1.0F);
				int i_300_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_301_ = i_300_ + ((Class61_Sub1) this).anInt9306; i_301_ <= i_298_; i_301_ += i_299_) {
					class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) i_274_ * 2.0F / f_291_, 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_300_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_272_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_300_ += i_299_;
				}
				if (i_300_ < i_298_) {
					int i_302_ = i_298_ - i_300_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_302_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_274_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486(((float) i_302_ * 2.0F / f), ((float) i_274_ * 2.0F / f_291_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_300_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_272_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else {
				int i_303_ = i_272_ + i_274_;
				int i_304_ = i + i_273_;
				int i_305_ = method318();
				int i_306_ = method683();
				int i_307_ = i_272_ + ((Class61_Sub1) this).anInt9313;
				for (int i_308_ = i_307_ + ((Class61_Sub1) this).anInt9304; i_308_ <= i_303_; i_308_ += i_306_) {
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
					int i_309_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_310_ = i_309_ + ((Class61_Sub1) this).anInt9306; i_310_ <= i_304_; i_310_ += i_305_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_291_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_309_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_307_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_309_ += i_305_;
					}
					if (i_309_ < i_304_) {
						int i_311_ = i_304_ - i_309_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_311_), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
						class159.aClass249_1681.method2486((float) i_311_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_291_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_309_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_307_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
					i_307_ += i_306_;
				}
				if (i_307_ < i_303_) {
					int i_312_ = i_303_ - i_307_;
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_312_), 1.0F, 1.0F);
					int i_313_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_314_ = i_313_ + ((Class61_Sub1) this).anInt9306; i_314_ <= i_304_; i_314_ += i_305_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), (float) i_312_ * 2.0F / f_291_, 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_313_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_307_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_313_ += i_305_;
					}
					if (i_313_ < i_304_) {
						int i_315_ = i_304_ - i_313_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_315_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_312_), 1.0F, 1.0F);
						class159.aClass249_1681.method2486(((float) i_315_ * 2.0F / f), ((float) i_312_ * 2.0F / f_291_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_313_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_307_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_291_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
				}
			}
		}
	}

	void method730(float f, float f_316_, float f_317_, float f_318_, float f_319_, float f_320_, int i, int i_321_, int i_322_, int i_323_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688)
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2092(f, f_316_, f_317_, f_318_, f_319_, f_320_, f_317_ + f_319_ - f, f_318_ + f_320_ - f_316_, 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_321_);
		else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_322_);
			if (((Class61_Sub1) this).aBoolean9305) {
				float f_324_ = (float) method318();
				float f_325_ = (float) method683();
				float f_326_ = (f_317_ - f) / f_324_;
				float f_327_ = (f_318_ - f_316_) / f_324_;
				float f_328_ = (f_319_ - f) / f_325_;
				float f_329_ = (f_320_ - f_316_) / f_325_;
				float f_330_ = f_328_ * (float) ((Class61_Sub1) this).anInt9313;
				float f_331_ = f_329_ * (float) ((Class61_Sub1) this).anInt9313;
				float f_332_ = f_326_ * (float) ((Class61_Sub1) this).anInt9308;
				float f_333_ = f_327_ * (float) ((Class61_Sub1) this).anInt9308;
				float f_334_ = -f_326_ * (float) ((Class61_Sub1) this).anInt9300;
				float f_335_ = -f_327_ * (float) ((Class61_Sub1) this).anInt9300;
				float f_336_ = -f_328_ * (float) ((Class61_Sub1) this).anInt9303;
				float f_337_ = -f_329_ * (float) ((Class61_Sub1) this).anInt9303;
				f = f + f_332_ + f_330_;
				f_316_ = f_316_ + f_333_ + f_331_;
				f_317_ = f_317_ + f_334_ + f_330_;
				f_318_ = f_318_ + f_335_ + f_331_;
				f_319_ = f_319_ + f_332_ + f_336_;
				f_320_ = f_320_ + f_333_ + f_337_;
			}
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i, i_321_);
			float f_338_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_339_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2516();
			class159.aClass249_1681.aFloatArray2631[0] = (f_317_ - f) * 2.0F / f_338_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_318_ - f_316_) * 2.0F / f_339_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_319_ - f) * 2.0F / f_338_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_320_ - f_316_) * 2.0F / f_339_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_338_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = ((f_316_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_339_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	void method736(int i, int i_340_, int i_341_, int i_342_, int i_343_, int i_344_, int i_345_, int i_346_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			if (((Class61_Sub1) this).aBoolean9305) {
				i_341_ = i_341_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_342_ = i_342_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_341_ / ((Class61_Sub1) this).anInt9306);
				i_340_ += (((Class61_Sub1) this).anInt9313 * i_342_ / ((Class61_Sub1) this).anInt9304);
			}
			((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i, (float) i_340_, (float) (i + i_341_), (float) (i_340_ + i_342_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104(0.0F), ((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_344_);
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_345_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_343_, i_344_);
			if (((Class61_Sub1) this).aBoolean9305) {
				i_341_ = i_341_ * ((Class61_Sub1) this).anInt9306 / method318();
				i_342_ = i_342_ * ((Class61_Sub1) this).anInt9304 / method683();
				i += (((Class61_Sub1) this).anInt9308 * i_341_ / ((Class61_Sub1) this).anInt9306);
				i_340_ += (((Class61_Sub1) this).anInt9313 * i_342_ / ((Class61_Sub1) this).anInt9304);
			}
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_347_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486((float) i_341_ * 2.0F / f, (float) i_342_ * 2.0F / f_347_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_340_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_347_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			class159.method1862();
		}
	}

	public int method716() {
		return ((Class61_Sub1) this).anInt9306;
	}

	void method731(float f, float f_348_, float f_349_, float f_350_, float f_351_, float f_352_, int i, Class_ta class_ta, int i_353_, int i_354_) {
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
		Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
		class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
		class159.method1861(1, -1);
		float f_355_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float f_356_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		class159.aClass249_1681.method2516();
		if (((Class61_Sub1) this).aBoolean9305) {
			float f_357_ = ((float) ((Class61_Sub1) this).anInt9306 / (float) method318());
			float f_358_ = ((float) ((Class61_Sub1) this).anInt9304 / (float) method683());
			class159.aClass249_1681.aFloatArray2631[0] = (f_349_ - f) * f_357_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_350_ - f_348_) * f_357_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_351_ - f) * f_358_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_352_ - f_348_) * f_358_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + (float) ((Class61_Sub1) this).anInt9308) * f_357_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
			class159.aClass249_1681.aFloatArray2631[13] = ((f_348_ + (float) ((Class61_Sub1) this).anInt9313) * f_358_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		} else {
			class159.aClass249_1681.aFloatArray2631[0] = f_349_ - f;
			class159.aClass249_1681.aFloatArray2631[1] = f_350_ - f_348_;
			class159.aClass249_1681.aFloatArray2631[4] = f_351_ - f;
			class159.aClass249_1681.aFloatArray2631[5] = f_352_ - f_348_;
			class159.aClass249_1681.aFloatArray2631[12] = f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901();
			class159.aClass249_1681.aFloatArray2631[13] = (f_348_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		}
		Class249 class249 = ((Class61_Sub1) this).aClass_ra_Sub2_9309.aClass249_8576;
		class249.method2516();
		class249.aFloatArray2631[0] = 2.0F / f_355_;
		class249.aFloatArray2631[5] = 2.0F / f_356_;
		class249.aFloatArray2631[12] = -1.0F;
		class249.aFloatArray2631[13] = -1.0F;
		class249.aFloatArray2631[14] = -1.0F;
		class159.aClass249_1681.method2483(class249);
		class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
		class159.anInt1685 = 0;
		class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
		Interface11_Impl3 interface11_impl3 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).anInterface11_Impl3_8659);
		class159.anInterface11_Impl3_1680 = interface11_impl3;
		class159.aClass249_1683.method2516();
		class159.aClass249_1683.aFloatArray2631[0] = (f_349_ - f) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[1] = (f_350_ - f_348_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[4] = (f_351_ - f) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[5] = (f_352_ - f_348_) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[12] = (f - (float) i_353_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[13] = (f_348_ - (float) i_354_) * interface11_impl3.method104(1.0F);
		class159.method1864();
	}

	void method732(float f, float f_359_, float f_360_, float f_361_, float f_362_, float f_363_, int i, Class_ta class_ta, int i_364_, int i_365_) {
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
		Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
		class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
		class159.method1861(1, -1);
		float f_366_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float f_367_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		class159.aClass249_1681.method2516();
		if (((Class61_Sub1) this).aBoolean9305) {
			float f_368_ = ((float) ((Class61_Sub1) this).anInt9306 / (float) method318());
			float f_369_ = ((float) ((Class61_Sub1) this).anInt9304 / (float) method683());
			class159.aClass249_1681.aFloatArray2631[0] = (f_360_ - f) * f_368_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_361_ - f_359_) * f_368_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_362_ - f) * f_369_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_363_ - f_359_) * f_369_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + (float) ((Class61_Sub1) this).anInt9308) * f_368_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
			class159.aClass249_1681.aFloatArray2631[13] = ((f_359_ + (float) ((Class61_Sub1) this).anInt9313) * f_369_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		} else {
			class159.aClass249_1681.aFloatArray2631[0] = f_360_ - f;
			class159.aClass249_1681.aFloatArray2631[1] = f_361_ - f_359_;
			class159.aClass249_1681.aFloatArray2631[4] = f_362_ - f;
			class159.aClass249_1681.aFloatArray2631[5] = f_363_ - f_359_;
			class159.aClass249_1681.aFloatArray2631[12] = f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901();
			class159.aClass249_1681.aFloatArray2631[13] = (f_359_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		}
		Class249 class249 = ((Class61_Sub1) this).aClass_ra_Sub2_9309.aClass249_8576;
		class249.method2516();
		class249.aFloatArray2631[0] = 2.0F / f_366_;
		class249.aFloatArray2631[5] = 2.0F / f_367_;
		class249.aFloatArray2631[12] = -1.0F;
		class249.aFloatArray2631[13] = -1.0F;
		class249.aFloatArray2631[14] = -1.0F;
		class159.aClass249_1681.method2483(class249);
		class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
		class159.anInt1685 = 0;
		class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
		Interface11_Impl3 interface11_impl3 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).anInterface11_Impl3_8659);
		class159.anInterface11_Impl3_1680 = interface11_impl3;
		class159.aClass249_1683.method2516();
		class159.aClass249_1683.aFloatArray2631[0] = (f_360_ - f) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[1] = (f_361_ - f_359_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[4] = (f_362_ - f) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[5] = (f_363_ - f_359_) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[12] = (f - (float) i_364_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[13] = (f_359_ - (float) i_365_) * interface11_impl3.method104(1.0F);
		class159.method1864();
	}

	void method733(float f, float f_370_, float f_371_, float f_372_, float f_373_, float f_374_, int i, Class_ta class_ta, int i_375_, int i_376_) {
		((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
		Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
		class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
		class159.method1861(1, -1);
		float f_377_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
		float f_378_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
		class159.aClass249_1681.method2516();
		if (((Class61_Sub1) this).aBoolean9305) {
			float f_379_ = ((float) ((Class61_Sub1) this).anInt9306 / (float) method318());
			float f_380_ = ((float) ((Class61_Sub1) this).anInt9304 / (float) method683());
			class159.aClass249_1681.aFloatArray2631[0] = (f_371_ - f) * f_379_;
			class159.aClass249_1681.aFloatArray2631[1] = (f_372_ - f_370_) * f_379_;
			class159.aClass249_1681.aFloatArray2631[4] = (f_373_ - f) * f_380_;
			class159.aClass249_1681.aFloatArray2631[5] = (f_374_ - f_370_) * f_380_;
			class159.aClass249_1681.aFloatArray2631[12] = ((f + (float) ((Class61_Sub1) this).anInt9308) * f_379_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
			class159.aClass249_1681.aFloatArray2631[13] = ((f_370_ + (float) ((Class61_Sub1) this).anInt9313) * f_380_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		} else {
			class159.aClass249_1681.aFloatArray2631[0] = f_371_ - f;
			class159.aClass249_1681.aFloatArray2631[1] = f_372_ - f_370_;
			class159.aClass249_1681.aFloatArray2631[4] = f_373_ - f;
			class159.aClass249_1681.aFloatArray2631[5] = f_374_ - f_370_;
			class159.aClass249_1681.aFloatArray2631[12] = f + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901();
			class159.aClass249_1681.aFloatArray2631[13] = (f_370_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901());
		}
		Class249 class249 = ((Class61_Sub1) this).aClass_ra_Sub2_9309.aClass249_8576;
		class249.method2516();
		class249.aFloatArray2631[0] = 2.0F / f_377_;
		class249.aFloatArray2631[5] = 2.0F / f_378_;
		class249.aFloatArray2631[12] = -1.0F;
		class249.aFloatArray2631[13] = -1.0F;
		class249.aFloatArray2631[14] = -1.0F;
		class159.aClass249_1681.method2483(class249);
		class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
		class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
		class159.anInt1685 = 0;
		class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
		Interface11_Impl3 interface11_impl3 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).anInterface11_Impl3_8659);
		class159.anInterface11_Impl3_1680 = interface11_impl3;
		class159.aClass249_1683.method2516();
		class159.aClass249_1683.aFloatArray2631[0] = (f_371_ - f) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[1] = (f_372_ - f_370_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[4] = (f_373_ - f) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[5] = (f_374_ - f_370_) * interface11_impl3.method104(1.0F);
		class159.aClass249_1683.aFloatArray2631[12] = (f - (float) i_375_) * interface11_impl3.method106(1.0F);
		class159.aClass249_1683.aFloatArray2631[13] = (f_370_ - (float) i_376_) * interface11_impl3.method104(1.0F);
		class159.method1864();
	}

	public void method725(int i, int i_381_, int i_382_, int i_383_, int i_384_, int i_385_, int i_386_) {
		if (((Class61_Sub1) this).aClass_ra_Sub2_9309.method4903() != Class161.aClass161_1688) {
			int i_387_ = i_381_ + i_383_;
			int i_388_ = i + i_382_;
			int i_389_ = method318();
			int i_390_ = method683();
			int i_391_ = i_381_ + ((Class61_Sub1) this).anInt9313;
			for (int i_392_ = i_391_ + ((Class61_Sub1) this).anInt9304; i_392_ <= i_387_; i_392_ += i_390_) {
				int i_393_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_394_ = i_393_ + ((Class61_Sub1) this).anInt9306; i_394_ <= i_388_; i_394_ += i_389_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_393_, (float) i_391_, (float) (i_393_ + ((Class61_Sub1) this).anInt9306), (float) (i_391_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_385_);
					i_393_ += i_389_;
				}
				if (i_393_ < i_388_) {
					int i_395_ = i_388_ - i_393_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_393_, (float) i_391_, (float) (i_393_ + i_395_), (float) (i_391_ + ((Class61_Sub1) this).anInt9304), 0.0F, 0.0F, ((float) i_395_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), ((Class61_Sub1) this).anInterface11_Impl3_9301.method114(), ((Class61_Sub1) this).anInterface11_Impl3_9301, i_385_);
				}
				i_391_ += i_390_;
			}
			if (i_391_ < i_387_) {
				int i_396_ = i_387_ - i_391_;
				float f = ((float) i_396_ / (float) ((Class61_Sub1) this).anInt9304 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method114());
				int i_397_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_398_ = i_397_ + ((Class61_Sub1) this).anInt9306; i_398_ <= i_388_; i_398_ += i_389_) {
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_397_, (float) i_391_, (float) (i_397_ + ((Class61_Sub1) this).anInt9306), (float) (i_391_ + i_396_), 0.0F, 0.0F, ((Class61_Sub1) this).anInterface11_Impl3_9301.method123(), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_385_);
					i_397_ += i_389_;
				}
				if (i_397_ < i_388_) {
					int i_399_ = i_388_ - i_397_;
					((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass187_8556.method2086((float) i_397_, (float) i_391_, (float) (i_397_ + i_399_), (float) (i_391_ + i_396_), 0.0F, 0.0F, ((float) i_399_ / (float) ((Class61_Sub1) this).anInt9306 * ((Class61_Sub1) this).anInterface11_Impl3_9301.method123()), f, ((Class61_Sub1) this).anInterface11_Impl3_9301, i_385_);
				}
			}
		} else {
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4925();
			((Class61_Sub1) this).aClass_ra_Sub2_9309.method4970(i_386_);
			Class159 class159 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class61_Sub1) this).anInterface11_Impl3_9301;
			class159.method1861(i_384_, i_385_);
			float f = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method856();
			float f_400_ = (float) ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4782((byte) 0).method857();
			class159.anInterface9_Impl1_1678 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).anInterface9_Impl1_8600);
			class159.anInt1685 = 0;
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class61_Sub1) this).aClass_ra_Sub2_9309).aClass184_8603);
			boolean bool = (((Class61_Sub1) this).aBoolean9307 && ((Class61_Sub1) this).anInt9313 == 0 && ((Class61_Sub1) this).anInt9303 == 0);
			boolean bool_401_ = (((Class61_Sub1) this).aBoolean9312 && ((Class61_Sub1) this).anInt9308 == 0 && ((Class61_Sub1) this).anInt9300 == 0);
			if (bool_401_ & bool) {
				class159.aClass249_1681.method2486((float) i_382_ * 2.0F / f, ((float) i_383_ * 2.0F / f_400_), 1.0F, 1.0F);
				class159.aClass249_1681.aFloatArray2631[12] = ((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
				class159.aClass249_1681.aFloatArray2631[13] = (((float) i_381_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_) - 1.0F;
				class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_382_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_383_), 1.0F, 1.0F);
				class159.method1862();
			} else if (bool_401_) {
				int i_402_ = i_381_ + i_383_;
				int i_403_ = method683();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_382_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304), 1.0F, 1.0F);
				int i_404_ = i_381_ + ((Class61_Sub1) this).anInt9313;
				for (int i_405_ = i_404_ + ((Class61_Sub1) this).anInt9304; i_405_ <= i_402_; i_405_ += i_403_) {
					class159.aClass249_1681.method2486((float) i_382_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_400_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_404_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_404_ += i_403_;
				}
				if (i_404_ < i_402_) {
					int i_406_ = i_402_ - i_404_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_382_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_406_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486(((float) i_382_ * 2.0F / f), ((float) i_406_ * 2.0F / f_400_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f) - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_404_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else if (bool) {
				int i_407_ = i + i_382_;
				int i_408_ = method318();
				class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_383_), 1.0F, 1.0F);
				int i_409_ = i + ((Class61_Sub1) this).anInt9308;
				for (int i_410_ = i_409_ + ((Class61_Sub1) this).anInt9306; i_410_ <= i_407_; i_410_ += i_408_) {
					class159.aClass249_1681.method2486((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f, (float) i_383_ * 2.0F / f_400_, 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_409_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_381_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
					i_409_ += i_408_;
				}
				if (i_409_ < i_407_) {
					int i_411_ = i_407_ - i_409_;
					class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_411_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_383_), 1.0F, 1.0F);
					class159.aClass249_1681.method2486(((float) i_411_ * 2.0F / f), ((float) i_383_ * 2.0F / f_400_), 1.0F, 1.0F);
					class159.aClass249_1681.aFloatArray2631[12] = ((float) i_409_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
					class159.aClass249_1681.aFloatArray2631[13] = ((float) i_381_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
					class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
					class159.method1862();
				}
			} else {
				int i_412_ = i_381_ + i_383_;
				int i_413_ = i + i_382_;
				int i_414_ = method318();
				int i_415_ = method683();
				int i_416_ = i_381_ + ((Class61_Sub1) this).anInt9313;
				for (int i_417_ = i_416_ + ((Class61_Sub1) this).anInt9304; i_417_ <= i_412_; i_417_ += i_415_) {
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
					int i_418_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_419_ = i_418_ + ((Class61_Sub1) this).anInt9306; i_419_ <= i_413_; i_419_ += i_414_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_400_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_418_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_416_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_418_ += i_414_;
					}
					if (i_418_ < i_413_) {
						int i_420_ = i_413_ - i_418_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_420_), (((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) ((Class61_Sub1) this).anInt9304)), 1.0F, 1.0F);
						class159.aClass249_1681.method2486((float) i_420_ * 2.0F / f, ((float) ((Class61_Sub1) this).anInt9304 * 2.0F / f_400_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_418_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_416_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
					i_416_ += i_415_;
				}
				if (i_416_ < i_412_) {
					int i_421_ = i_412_ - i_416_;
					class159.aClass249_1682.method2486((((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) ((Class61_Sub1) this).anInt9306)), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_421_), 1.0F, 1.0F);
					int i_422_ = i + ((Class61_Sub1) this).anInt9308;
					for (int i_423_ = i_422_ + ((Class61_Sub1) this).anInt9306; i_423_ <= i_413_; i_423_ += i_414_) {
						class159.aClass249_1681.method2486(((float) ((Class61_Sub1) this).anInt9306 * 2.0F / f), (float) i_421_ * 2.0F / f_400_, 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_422_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_416_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
						i_422_ += i_414_;
					}
					if (i_422_ < i_413_) {
						int i_424_ = i_413_ - i_422_;
						class159.aClass249_1682.method2486(((Class61_Sub1) this).anInterface11_Impl3_9301.method106((float) i_424_), ((Class61_Sub1) this).anInterface11_Impl3_9301.method104((float) i_421_), 1.0F, 1.0F);
						class159.aClass249_1681.method2486(((float) i_424_ * 2.0F / f), ((float) i_421_ * 2.0F / f_400_), 1.0F, 1.0F);
						class159.aClass249_1681.aFloatArray2631[12] = ((float) i_422_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f - 1.0F;
						class159.aClass249_1681.aFloatArray2631[13] = ((float) i_416_ + ((Class61_Sub1) this).aClass_ra_Sub2_9309.method4901()) * 2.0F / f_400_ - 1.0F;
						class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
						class159.method1862();
					}
				}
			}
		}
	}
}
