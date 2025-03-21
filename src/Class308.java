/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class308 {
	int anInt3170;
	static int anInt3171 = 512;
	int anInt3172;
	int anInt3173;
	int anInt3174;
	Class311[] aClass311Array3175;
	Class344 aClass344_3176;
	int anInt3177 = 2092767023;
	int anInt3178;
	int anInt3179;
	int anInt3180;
	Class61 aClass61_3181;
	Class311[] aClass311Array3182;
	int anInt3183;
	int anInt3184;
	boolean aBoolean3185 = true;
	int anInt3186;
	Class387 aClass387_3187;
	byte[] aByteArray3188;
	boolean aBoolean3189;
	Class311 aClass311_3190;
	int anInt3191;
	int anInt3192;
	Class308 aClass308_3193;
	public static int anInt3194;

	public boolean method3078(Class_ra class_ra, int i, int i_0_, int i_1_) {
		try {
			if (i != 712405041 * ((Class308) this).anInt3177) {
				((Class308) this).anInt3177 = -2092767023 * i;
				int i_2_ = Class385.method4425(i, (short) 15527);
				if (i_2_ > 512)
					i_2_ = 512;
				if (i_2_ <= 0)
					i_2_ = 1;
				if (390900321 * ((Class308) this).anInt3172 != i_2_) {
					((Class308) this).anInt3172 = i_2_ * 2111928737;
					((Class308) this).aClass61_3181 = null;
				}
				if (null != ((Class308) this).aClass311Array3182) {
					((Class308) this).anInt3179 = 0;
					int[] is = new int[((Class308) this).aClass311Array3182.length];
					for (int i_3_ = 0; i_3_ < ((Class308) this).aClass311Array3182.length; i_3_++) {
						Class311 class311 = ((Class308) this).aClass311Array3182[i_3_];
						if (class311.method3103(706116411 * ((Class308) this).anInt3178, 969866263 * ((Class308) this).anInt3184, 1879422505 * ((Class308) this).anInt3180, ((Class308) this).anInt3177 * 712405041)) {
							is[((Class308) this).anInt3179 * 2021421463] = ((Class311) class311).anInt3230;
							((Class308) this).aClass311Array3175[((((Class308) this).anInt3179 += 1333599783) * 2021421463) - 1] = class311;
						}
					}
					Class77.method926(is, ((Class308) this).aClass311Array3175, 0, (2021421463 * ((Class308) this).anInt3179 - 1), -164632396);
				}
				((Class308) this).aBoolean3185 = true;
			}
			boolean bool = false;
			if (((Class308) this).aBoolean3185) {
				((Class308) this).aBoolean3185 = false;
				for (int i_4_ = ((Class308) this).anInt3179 * 2021421463 - 1; i_4_ >= 0; i_4_--) {
					boolean bool_5_ = (((Class308) this).aClass311Array3175[i_4_].method3104(class_ra, ((Class308) this).aClass311_3190));
					Class308 class308_6_ = this;
					((Class308) class308_6_).aBoolean3185 = ((Class308) class308_6_).aBoolean3185 | !bool_5_;
					bool |= bool_5_;
				}
			}
			if (i_0_ == 0 || !class_ra.ay())
				((Class308) this).aClass387_3187 = null;
			else if (((Class308) this).aClass387_3187 == null && ((Class308) this).anInt3186 * 1877541877 >= 0)
				method3087(class_ra, (short) -21583);
			if (null != ((Class308) this).aClass308_3193 && this != ((Class308) this).aClass308_3193) {
				((Class308) this).aClass308_3193.method3079((byte) -1);
				bool |= ((Class308) this).aClass308_3193.method3078(class_ra, i, i_0_, 209825844);
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.z(").append(')').toString());
		}
	}

	public void method3079(byte i) {
		try {
			((Class308) this).aBoolean3189 = false;
			((Class308) this).aClass308_3193 = null;
			((Class308) this).anInt3191 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.o(").append(')').toString());
		}
	}

	public void method3080(Class_ra class_ra, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, byte i_15_) {
		try {
			method3082(class_ra, i, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, 0, i_14_, true, false, 560629645);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.n(").append(')').toString());
		}
	}

	public Class308 method3081(int i) {
		try {
			return ((Class308) this).aClass308_3193;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.f(").append(')').toString());
		}
	}

	public void method3082(Class_ra class_ra, int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, boolean bool, boolean bool_24_, int i_25_) {
		try {
			int i_26_ = 0;
			if (((Class308) this).aBoolean3189)
				i_26_ = ((Class308) this).anInt3191 * -1739382713;
			if (((Class308) this).aClass308_3193 != null) {
				Class308 class308_27_ = this;
				Class308 class308_28_ = ((Class308) this).aClass308_3193;
				if (class308_27_.hashCode() > class308_28_.hashCode()) {
					class308_27_ = ((Class308) this).aClass308_3193;
					class308_28_ = this;
					i_26_ = 255 - i_26_;
				}
				class308_27_.method3085(class_ra, i, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, bool, bool_24_, i_26_, (short) 2929);
				class308_28_.method3085(class_ra, i, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, false, bool_24_, 255 - i_26_, (short) 2929);
			} else
				method3085(class_ra, i, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, bool, bool_24_, i_26_, (short) 2929);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.l(").append(')').toString());
		}
	}

	public void method3083(int i, int i_29_, short i_30_) {
		try {
			if (((Class308) this).aBoolean3189) {
				/* empty */
			}
			((Class308) this).anInt3191 = (((Class308) this).anInt3170 * 1612341617 + (i * (i_29_ - 1612341617 * ((Class308) this).anInt3170) / 255)) * -214267529;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.i(").append(')').toString());
		}
	}

	public void method3084(Class308 class308_31_, int i) {
		try {
			if (((Class308) this).aBoolean3189)
				((Class308) this).anInt3170 = ((Class308) this).anInt3191 * -380452553;
			else if (class308_31_ != null && ((Class308) class308_31_).aBoolean3189)
				((Class308) this).anInt3170 = (-1712631441 - ((Class308) class308_31_).anInt3191 * -380452553);
			else
				((Class308) this).anInt3170 = 0;
			((Class308) this).aBoolean3189 = true;
			((Class308) this).aClass308_3193 = class308_31_;
			((Class308) this).anInt3191 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.p(").append(')').toString());
		}
	}

	void method3085(Class_ra class_ra, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, boolean bool, boolean bool_40_, int i_41_, short i_42_) {
		try {
			int i_43_ = 255 - i_41_;
			class_ra.method4796();
			if (null == ((Class308) this).aClass387_3187) {
				class_ra.ba(2, 0);
				i_37_ = i_37_ + i & 0x3fff;
				if (((Class308) this).anInt3174 * -1671226365 != -1 && 0 != 390900321 * ((Class308) this).anInt3172) {
					Class56 class56 = (Class209.anInterface_ma1984.method221(((Class308) this).anInt3174 * -1671226365, -227895114));
					if (null == ((Class308) this).aClass61_3181 && (Class209.anInterface_ma1984.method237(-1671226365 * ((Class308) this).anInt3174, (class56.aClass369_524 == Class369.aClass369_6817 ? Class377.aClass377_3935 : Class377.aClass377_3934), 0.7F, 390900321 * ((Class308) this).anInt3172, 390900321 * ((Class308) this).anInt3172, false, 2135230875))) {
						int[] is = (Class369.aClass369_6817 == class56.aClass369_524 ? (Class209.anInterface_ma1984.method231(-1671226365 * ((Class308) this).anInt3174, 0.7F, 390900321 * ((Class308) this).anInt3172, ((Class308) this).anInt3172 * 390900321, false, -443337019)) : (Class209.anInterface_ma1984.method220(-1671226365 * ((Class308) this).anInt3174, 0.7F, 390900321 * ((Class308) this).anInt3172, 390900321 * ((Class308) this).anInt3172, false, -1934755840)));
						((Class308) this).anInt3183 = is[0] * -1161908861;
						((Class308) this).anInt3173 = is[is.length - 1] * 1414352065;
						((Class308) this).aClass61_3181 = (class_ra.method4795(is, 0, -1963453415 * class56.anInt532, -1963453415 * class56.anInt532, -1963453415 * class56.anInt532, (byte) -49));
					}
					int i_44_ = (255 == i_43_ ? (Class369.aClass369_6817 == class56.aClass369_524 ? 1 : 0) : 1);
					if (i_44_ == 1 && bool)
						class_ra.B(i_32_, i_33_, i_34_, i_35_, i_39_, 0);
					if (((Class308) this).aClass61_3181 != null) {
						int i_45_ = i_35_ * i_36_ / -4096;
						int i_46_;
						for (i_46_ = (i_34_ - i_35_) / 2 + i_37_ * i_35_ / 4096; i_46_ > i_35_; i_46_ -= i_35_) {
							/* empty */
						}
						for (/**/; i_46_ < 0; i_46_ += i_35_) {
							/* empty */
						}
						if (((Class308) this).aClass344_3176 == Class344.aClass344_6811) {
							for (int i_47_ = i_46_ - i_35_; i_47_ < i_34_; i_47_ += i_35_)
								((Class308) this).aClass61_3181.method691(i_32_ + i_47_, i_33_ + i_45_, i_35_, i_35_, 0, i_43_ << 24 | 0xffffff, i_44_);
							if (0 != (-37762773 * ((Class308) this).anInt3183 & ~0xffffff))
								class_ra.method4789(0, 0, i_34_, i_33_ + i_45_ + 1, (-37762773 * (((Class308) this).anInt3183)), 463754225);
							if (0 != (-896974015 * ((Class308) this).anInt3173 & ~0xffffff))
								class_ra.method4789(0, i_45_ + i_33_ + i_35_, i_34_, i_35_ - (i_35_ + (i_33_ + i_45_)), -896974015 * ((Class308) this).anInt3173, 463754225);
						} else {
							for (/**/; i_45_ > i_35_; i_45_ -= i_35_) {
								/* empty */
							}
							for (/**/; i_45_ < 0; i_45_ += i_35_) {
								/* empty */
							}
							for (int i_48_ = i_46_ - i_35_; i_48_ < i_34_; i_48_ += i_35_) {
								for (int i_49_ = i_45_ - i_35_; i_49_ < i_35_; i_49_ += i_35_)
									((Class308) this).aClass61_3181.method691(i_32_ + i_48_, i_33_ + i_49_, i_35_, i_35_, 0, i_43_ << 24 | 0xffffff, i_44_);
							}
						}
					}
				} else
					class_ra.B(i_32_, i_33_, i_34_, i_35_, i_43_ << 24 | i_39_, 1);
			} else if (bool_40_) {
				Class249 class249 = class_ra.cs();
				Class249 class249_50_ = class_ra.cs();
				class249.aFloatArray2631[2] = class249.aFloatArray2631[3];
				class249.aFloatArray2631[6] = class249.aFloatArray2631[7];
				class249.aFloatArray2631[10] = class249.aFloatArray2631[11];
				class249.aFloatArray2631[14] = class249.aFloatArray2631[15];
				class_ra.ci(class249);
				method3086(class_ra, i_36_, i_37_, i_38_, i_41_, 24865515);
				class_ra.ci(class249_50_);
			} else {
				if (bool)
					class_ra.ba(3, i_39_);
				method3086(class_ra, i_36_, i_37_, i_38_, i_41_, 1756178562);
			}
			for (int i_51_ = 2021421463 * ((Class308) this).anInt3179 - 1; i_51_ >= 0; i_51_--)
				((Class308) this).aClass311Array3175[i_51_].method3105(class_ra, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, 706116411 * ((Class308) this).anInt3178, ((Class308) this).anInt3184 * 969866263, 1879422505 * ((Class308) this).anInt3180, i_43_);
			class_ra.ba(2, 0);
			class_ra.method4797();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.b(").append(')').toString());
		}
	}

	public Class308(int i, Class311[] class311s, int i_52_, int i_53_, int i_54_, int i_55_, Class344 class344, int i_56_) {
		((Class308) this).anInt3178 = i_53_ * -1577802253;
		((Class308) this).anInt3184 = -469107801 * i_54_;
		((Class308) this).anInt3180 = i_55_ * -1026406887;
		((Class308) this).anInt3174 = i * -1656656213;
		((Class308) this).aClass311Array3182 = class311s;
		((Class308) this).aClass344_3176 = class344;
		if (class311s != null) {
			((Class308) this).aClass311Array3175 = new Class311[class311s.length];
			((Class308) this).aClass311_3190 = i_52_ >= 0 ? class311s[i_52_] : null;
		} else {
			((Class308) this).aClass311Array3175 = null;
			((Class308) this).aClass311_3190 = null;
		}
		((Class308) this).anInt3186 = 629755997 * i_56_;
	}

	void method3086(Class_ra class_ra, int i, int i_57_, int i_58_, int i_59_, int i_60_) {
		try {
			Class247 class247 = class_ra.cq();
			Class247 class247_61_ = new Class247();
			class247_61_.method2476(0.0F, 0.0F, 0.0F);
			class247_61_.method2462(0.0F, -1.0F, 0.0F, Class257.method2541(-i_57_ & 0x3fff));
			class247_61_.method2462(-1.0F, 0.0F, 0.0F, Class257.method2541(-i & 0x3fff));
			class247_61_.method2462(0.0F, 0.0F, -1.0F, Class257.method2541(-i_58_ & 0x3fff));
			class_ra.cw(class247_61_);
			Class247 class247_62_ = new Class247();
			if (i_59_ != -1863272663 * ((Class308) this).anInt3192) {
				((Class308) this).aClass387_3187.method4460((byte) i_59_, (((Class308) this).aByteArray3188));
				((Class308) this).anInt3192 = i_59_ * -546188007;
			}
			((Class308) this).aClass387_3187.method4475(class247_62_, null, 0);
			class_ra.cw(class247);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.k(").append(')').toString());
		}
	}

	void method3087(Class_ra class_ra, short i) {
		try {
			try {
				boolean bool = (Class126_Sub2.aClass280_7229.method2777(((Class308) this).anInt3186 * 1877541877, (byte) 67));
				if (bool) {
					class_ra.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					Model class98 = Model.loadModel(Class126_Sub2.aClass280_7229, (((Class308) this).anInt3186 * 1877541877), 0);
					((Class308) this).aClass387_3187 = class_ra.cb(class98, 1099776, 0, 255, 1);
					byte[] is = ((Class308) this).aClass387_3187.as();
					if (is == null)
						((Class308) this).aByteArray3188 = null;
					else {
						((Class308) this).aByteArray3188 = new byte[is.length];
						System.arraycopy(is, 0, ((Class308) this).aByteArray3188, 0, is.length);
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.w(").append(')').toString());
		}
	}

	public boolean method3088(int i) {
		try {
			return ((Class308) this).aBoolean3189;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.s(").append(')').toString());
		}
	}

	static final void method3089(Class430 class430, int i) {
		try {
			if (client.anInt9257 * -843487341 == 0)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -2;
			else if (1 == -843487341 * client.anInt9257)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = client.anInt9256 * 652732387;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.ve(").append(')').toString());
		}
	}

	static final void method3090(Class430 class430, int i) {
		try {
			int i_63_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_63_ != Class448.aClass330_Sub50_5555.aClass464_Sub7_7891.method5760((byte) -24)) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub7_7891, i_63_, 519831538);
				Class435.method5568(1474846444);
				client.aBoolean9194 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.alv(").append(')').toString());
		}
	}

	public static void method3091(int i, byte i_64_) {
		try {
			Class382.aBooleanArray6678[i] = false;
			Class152.method1790(i, -1180587285);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.z(").append(')').toString());
		}
	}

	static final void method3092(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1390004513;
			int i_65_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			Class330_Sub48 class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6094((long) i_65_));
			if (null != class330_sub48 && 3 == class330_sub48.anInt7860 * -1972674867)
				Class75.method854(class330_sub48, true, true, -1760837025);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mv.se(").append(')').toString());
		}
	}
}
