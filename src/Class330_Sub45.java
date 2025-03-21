/* Class330_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub45 extends Class330 {
	int anInt7834;
	int anInt7835;
	int anInt7836;
	int anInt7837;
	int anInt7838;
	int anInt7839;
	int anInt7840;
	int anInt7841;
	int anInt7842;

	boolean method3732(int i, int i_0_, byte i_1_) {
		try {
			if (i >= 432642357 * ((Class330_Sub45) this).anInt7835 && i <= -2118810563 * ((Class330_Sub45) this).anInt7841 && i_0_ >= 1977953189 * ((Class330_Sub45) this).anInt7840 && i_0_ <= ((Class330_Sub45) this).anInt7838 * -1950533523)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adz.r(").append(')').toString());
		}
	}

	boolean method3733(int i, int i_2_, int i_3_, int i_4_) {
		try {
			if (((Class330_Sub45) this).anInt7836 * 1127284619 == i && i_2_ >= 432642357 * ((Class330_Sub45) this).anInt7835 && i_2_ <= -2118810563 * ((Class330_Sub45) this).anInt7841 && i_3_ >= 1977953189 * ((Class330_Sub45) this).anInt7840 && i_3_ <= -1950533523 * ((Class330_Sub45) this).anInt7838)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adz.j(").append(')').toString());
		}
	}

	boolean method3734(int i, int i_5_, byte i_6_) {
		try {
			if (i >= 1457622909 * ((Class330_Sub45) this).anInt7839 && i <= ((Class330_Sub45) this).anInt7837 * -152371309 && i_5_ >= ((Class330_Sub45) this).anInt7834 * 1628532129 && i_5_ <= ((Class330_Sub45) this).anInt7842 * 1129089279)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adz.i(").append(')').toString());
		}
	}

	void method3735(int i, int i_7_, int[] is, int i_8_) {
		try {
			is[0] = ((Class330_Sub45) this).anInt7836 * 1127284619;
			is[1] = i + (((Class330_Sub45) this).anInt7835 * 432642357 - ((Class330_Sub45) this).anInt7839 * 1457622909);
			is[2] = (((Class330_Sub45) this).anInt7840 * 1977953189 - 1628532129 * ((Class330_Sub45) this).anInt7834 + i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adz.p(").append(')').toString());
		}
	}

	void method3736(int i, int i_9_, int[] is, int i_10_) {
		try {
			is[0] = 0;
			is[1] = (1457622909 * ((Class330_Sub45) this).anInt7839 - 432642357 * ((Class330_Sub45) this).anInt7835 + i);
			is[2] = (((Class330_Sub45) this).anInt7834 * 1628532129 - 1977953189 * ((Class330_Sub45) this).anInt7840 + i_9_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adz.o(").append(')').toString());
		}
	}

	Class330_Sub45(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		((Class330_Sub45) this).anInt7836 = 2106142755 * i;
		((Class330_Sub45) this).anInt7835 = -1882410723 * i_11_;
		((Class330_Sub45) this).anInt7840 = -1098267603 * i_12_;
		((Class330_Sub45) this).anInt7841 = i_13_ * 907293461;
		((Class330_Sub45) this).anInt7838 = 252678501 * i_14_;
		((Class330_Sub45) this).anInt7839 = 525246933 * i_15_;
		((Class330_Sub45) this).anInt7834 = -1370114463 * i_16_;
		((Class330_Sub45) this).anInt7837 = i_17_ * 761329307;
		((Class330_Sub45) this).anInt7842 = i_18_ * -1033734401;
	}

	static boolean method3737(Class_ra class_ra, int i, int i_19_) {
		try {
			class_ra.method4804();
			Class312.method3111((byte) 25);
			if (!class_ra.method4790((byte) -2))
				return false;
			int i_20_ = client.aClass304_9030.method2990(-1669415601);
			int i_21_ = client.aClass304_9030.method3033((byte) -108);
			Class281 class281 = client.aClass304_9030.method2995(1693038642);
			Class356 class356 = client.aClass304_9030.method3023(-400722441);
			int i_22_ = i_20_ / 2;
			int i_23_ = 0;
			int i_24_ = 0;
			boolean bool = true;
			for (int i_25_ = i_23_; i_25_ < i_20_ + i_23_; i_25_++) {
				for (int i_26_ = i_24_; i_26_ < i_24_ + i_21_; i_26_++) {
					for (int i_27_ = i; i_27_ <= 3; i_27_++) {
						if (class281.method2786(i, i_27_, i_25_, i_26_, (byte) -46)) {
							int i_28_ = i_27_;
							if (class281.method2788(i_25_, i_26_, (byte) -4))
								i_28_--;
							if (i_28_ >= 0)
								bool &= Class108.method1349(i_28_, i_25_, i_26_, (byte) -10);
						}
					}
				}
			}
			if (!bool)
				return false;
			int i_29_ = 48 + (4 * i_20_ + 48);
			int[] is = new int[i_29_ * i_29_];
			for (int i_30_ = 0; i_30_ < is.length; i_30_++)
				is[i_30_] = -16777216;
			Class76_Sub2 class76_sub2 = null;
			int i_31_ = 0;
			int i_32_ = 0;
			if (Class9.aBoolean139) {
				Class9.aClass61_152 = class_ra.bn(i_29_, i_29_, false, true);
				class76_sub2 = class_ra.ag();
				class76_sub2.method901(0, Class9.aClass61_152.method684());
				Interface8_Impl1_Impl1 interface8_impl1_impl1 = class_ra.ah(i_29_, i_29_);
				class76_sub2.method900(interface8_impl1_impl1);
				class_ra.method4785(class76_sub2, (byte) 1);
				i_22_ = i_20_;
				i_31_ = 48;
				i_32_ = 48;
				class_ra.ba(1, 0);
			} else
				Class9.aClass61_152 = class_ra.method4795(is, 0, i_29_, i_29_, i_29_, (byte) -65);
			client.aClass304_9030.method3008(372460794).method4585((short) -28212);
			int i_33_ = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + (238 + (int) (Math.random() * 20.0) - 10));
			int i_34_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
			int i_35_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0));
			boolean[][] bools = new boolean[2 + (1 + i_22_)][2 + (i_22_ + 1)];
			for (int i_36_ = i_23_; i_36_ < i_23_ + i_20_; i_36_ += i_22_) {
				for (int i_37_ = i_24_; i_37_ < i_21_ + i_24_; i_37_ += i_22_) {
					int i_38_ = i_31_;
					int i_39_ = i_32_;
					int i_40_ = i_36_;
					if (i_40_ > 0) {
						i_40_--;
						i_38_ += 4;
					}
					int i_41_ = i_37_;
					if (i_41_ > 0)
						i_41_--;
					int i_42_ = i_22_ + i_36_;
					if (i_42_ < i_20_)
						i_42_++;
					int i_43_ = i_37_ + i_22_;
					if (i_43_ < i_21_) {
						i_43_++;
						i_39_ += 4;
					}
					if (Class9.aBoolean150)
						class_ra.L();
					else
						class_ra.r(0, 0, 4 * i_22_ + i_38_, i_22_ * 4 + i_39_);
					class_ra.ba(3, -16777216);
					int i_44_ = i_22_;
					if (i_44_ > i_20_ - 1)
						i_44_ = i_20_ - 1;
					for (int i_45_ = i; i_45_ <= 3; i_45_++) {
						for (int i_46_ = 0; i_46_ <= i_44_; i_46_++) {
							for (int i_47_ = 0; i_47_ <= i_44_; i_47_++)
								bools[i_46_][i_47_] = class281.method2786(i, i_45_, i_40_ + i_46_, i_41_ + i_47_, (byte) -102);
						}
						class356.aClass_xaArray3701[i_45_].method6415(i_31_, i_32_, 1024, i_40_, i_41_, i_42_, i_43_, bools);
						if (!Class9.aBoolean149) {
							for (int i_48_ = -4; i_48_ < i_22_; i_48_++) {
								for (int i_49_ = -4; i_49_ < i_22_; i_49_++) {
									int i_50_ = i_48_ + i_36_;
									int i_51_ = i_37_ + i_49_;
									if (i_50_ >= i_23_ && i_51_ >= i_24_ && class281.method2786(i, i_45_, i_50_, i_51_, (byte) -75)) {
										int i_52_ = i_45_;
										if (class281.method2788(i_50_, i_51_, (byte) 77))
											i_52_--;
										if (i_52_ >= 0)
											Class200.method2160(class_ra, i_52_, i_50_, i_51_, i_48_ * 4 + i_38_, (i_39_ + (i_22_ - i_49_) * 4 - 4), i_33_, i_34_, 1030987439);
									}
								}
							}
						}
					}
					if (Class9.aBoolean149) {
						Class307 class307 = client.aClass304_9030.method2996(i, 1875135057);
						for (int i_53_ = 0; i_53_ < i_22_; i_53_++) {
							for (int i_54_ = 0; i_54_ < i_22_; i_54_++) {
								int i_55_ = i_53_ + i_36_;
								int i_56_ = i_54_ + i_37_;
								int i_57_ = (class307.anIntArrayArray3166[i_55_ - (class307.anInt3162 * 1241210193)][i_56_ - (1001570543 * class307.anInt3163)]);
								if ((i_57_ & 0x40240000) != 0)
									class_ra.method4789(i_38_ + 4 * i_53_, (i_39_ + (i_22_ - i_54_) * 4 - 4), 4, 4, -1713569622, 463754225);
								else if (0 != (i_57_ & 0x800000))
									class_ra.method4792(i_38_ + 4 * i_53_, (4 * (i_22_ - i_54_) + i_39_ - 4), 4, -1713569622, (short) 255);
								else if (0 != (i_57_ & 0x2000000))
									class_ra.method4801(3 + (i_53_ * 4 + i_38_), (i_39_ + 4 * (i_22_ - i_54_) - 4), 4, -1713569622, 1324152480);
								else if (0 != (i_57_ & 0x8000000))
									class_ra.method4792(i_53_ * 4 + i_38_, (i_39_ + 4 * (i_22_ - i_54_) - 4 + 3), 4, -1713569622, (short) 255);
								else if ((i_57_ & 0x20000000) != 0)
									class_ra.method4801(i_38_ + i_53_ * 4, (i_39_ + 4 * (i_22_ - i_54_) - 4), 4, -1713569622, -1530530100);
							}
						}
					}
					class_ra.B(i_38_, i_39_, i_22_ * 4, i_22_ * 4, i_35_, 2);
					class_ra.method4804();
					if (!Class9.aBoolean139) {
						Class9.aClass61_152.method737((i_36_ - i_23_) * 4 + 48, (i_21_ * 4 + 48 - (i_37_ - i_24_) * 4 - i_22_ * 4), 4 * i_22_, 4 * i_22_, i_38_, i_39_);
						if (Class9.aBoolean150) {
							Class9.aClass61_152.method687(256, 0);
							try {
								class_ra.method4786(1260498047);
								Class464_Sub21.method5813(2000L);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
			}
			if (Class9.aBoolean139) {
				class_ra.method4802(class76_sub2, (byte) 0);
				if (Class9.aBoolean150) {
					Class9.aClass61_152.method687(256, 0);
					try {
						class_ra.method4786(-1145171009);
						Class464_Sub21.method5813(2000L);
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
			class_ra.L();
			class_ra.ba(1, 1);
			Class464.method5726(-1630563614);
			Class463 class463 = client.aClass304_9030.method3025((byte) 13);
			Class9.anInt142 = 0;
			Class9.aClass471_145.method5866(613065745);
			if (!Class9.aBoolean149) {
				for (int i_58_ = i_23_; i_58_ < i_20_ + i_23_; i_58_++) {
					for (int i_59_ = i_24_; i_59_ < i_24_ + i_21_; i_59_++) {
						for (int i_60_ = i; i_60_ <= 1 + i && i_60_ <= 3; i_60_++) {
							if (class281.method2786(i, i_60_, i_58_, i_59_, (byte) -13)) {
								Interface2 interface2 = ((Interface2) class356.method4177(i_60_, i_58_, i_59_, 1315717432));
								if (null == interface2)
									interface2 = ((Interface2) (class356.method4158(i_60_, i_58_, i_59_, client.anInterface19_9266, (byte) 17)));
								if (interface2 == null)
									interface2 = ((Interface2) class356.method4154(i_60_, i_58_, i_59_, -2040838155));
								if (interface2 == null)
									interface2 = ((Interface2) class356.method4156(i_60_, i_58_, i_59_, -928440572));
								if (interface2 != null) {
									Class473 class473 = (class463.method5705(interface2.method34((short) -3029), (byte) -67));
									if (class473.aBoolean5621 && !client.aBoolean9123) {
										if (i_19_ >= -1705516168)
											throw new IllegalStateException();
									} else {
										int i_61_ = class473.anInt5651 * 1552992833;
										if (class473.anIntArray5678 != null) {
											for (int i_62_ = 0; (i_62_ < (class473.anIntArray5678).length); i_62_++) {
												if ((class473.anIntArray5678[i_62_]) != -1) {
													Class473 class473_63_ = (class463.method5705((class473.anIntArray5678[i_62_]), (byte) -125));
													if ((class473_63_.anInt5651 * 1552992833) >= 0)
														i_61_ = (1552992833 * (class473_63_.anInt5651));
												}
											}
										}
										if (i_61_ >= 0) {
											boolean bool_64_ = false;
											if (i_61_ >= 0) {
												Class372 class372 = (Class79.aClass380_666.method4387(i_61_, (byte) -38));
												if (class372 != null && class372.aBoolean3885)
													bool_64_ = true;
											}
											int i_65_ = i_58_;
											int i_66_ = i_59_;
											if (bool_64_) {
												int[][] is_67_ = (client.aClass304_9030.method2996(i_60_, 1875135057).anIntArrayArray3166);
												int i_68_ = ((client.aClass304_9030.method2996(i_60_, 1875135057).anInt3162) * 1241210193);
												int i_69_ = ((client.aClass304_9030.method2996(i_60_, 1875135057).anInt3163) * 1001570543);
												for (int i_70_ = 0; i_70_ < 10; i_70_++) {
													int i_71_ = (int) (Math.random() * 4.0);
													if (i_71_ == 0 && i_65_ > i_23_ && i_65_ > i_58_ - 3 && ((is_67_[(i_65_ - 1 - i_68_)][i_66_ - i_69_]) & 0x2c0108) == 0)
														i_65_--;
													if (i_71_ == 1 && i_65_ < (i_23_ + i_20_ - 1) && i_65_ < i_58_ + 3 && ((is_67_[(i_65_ + 1 - i_68_)][i_66_ - i_69_]) & 0x2c0180) == 0)
														i_65_++;
													if (2 == i_71_ && i_66_ > i_24_ && i_66_ > i_59_ - 3 && ((is_67_[i_65_ - i_68_][(i_66_ - 1 - i_69_)]) & 0x2c0102) == 0)
														i_66_--;
													if (3 == i_71_ && i_66_ < (i_24_ + i_21_ - 1) && i_66_ < 3 + i_59_ && 0 == ((is_67_[(i_65_ - i_68_)][(1 + i_66_ - i_69_)]) & 0x2c0120))
														i_66_++;
												}
											}
											Class9.anIntArray144[Class9.anInt142 * -1788950589] = (class473.anInt5657 * 1996927381);
											Class9.anIntArray148[-1788950589 * Class9.anInt142] = i_65_;
											Class9.anIntArray143[Class9.anInt142 * -1788950589] = i_66_;
											Class9.anInt142 += -1061363477;
										}
									}
								}
							}
						}
					}
				}
				Class351 class351 = client.aClass304_9030.method3031((byte) -128);
				if (null != class351) {
					Class79.aClass380_666.method4391(1024, 64, -1455679088);
					Class381 class381 = client.aClass304_9030.method3022(76581543);
					for (int i_72_ = 0; i_72_ < class351.anInt3479 * 733593777; i_72_++) {
						int i_73_ = class351.anIntArray3480[i_72_];
						if (i_73_ >> 28 == (Class263_Sub2.myPlayer.aByte8658)) {
							int i_74_ = ((i_73_ >> 14 & 0x3fff) - -1261027839 * class381.gameSceneBaseX);
							int i_75_ = ((i_73_ & 0x3fff) - class381.gameSceneBaseY * -1542584207);
							if (i_74_ >= 0 && i_74_ < i_20_ && i_75_ >= 0 && i_75_ < i_21_)
								Class9.aClass471_145.method5878(new Class330_Sub23(i_72_), (short) 8192);
							else {
								Class372 class372 = (Class79.aClass380_666.method4387(class351.anIntArray3481[i_72_], (byte) -76));
								if (null != class372.anIntArray3897 && (1744437513 * class372.anInt3870 + i_74_ >= 0)) {
									if (i_74_ + 2083089585 * class372.anInt3898 >= i_20_) {
										if (i_19_ >= -1705516168) {
											/* empty */
										}
									} else if ((1993049113 * class372.anInt3892 + i_75_) >= 0) {
										if ((i_75_ + class372.anInt3899 * 821827611) >= i_21_) {
											if (i_19_ >= -1705516168) {
												/* empty */
											}
										} else
											Class9.aClass471_145.method5878(new Class330_Sub23(i_72_), (short) 8192);
									}
								}
							}
						}
					}
					Class79.aClass380_666.method4391(128, 64, -1095042458);
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adz.o(").append(')').toString());
		}
	}

	static final void method3738(Class430 class430, int i) {
		try {
			float f = Class257.method2541(((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]);
			Class330_Sub36_Sub15_Sub1 class330_sub36_sub15_sub1 = new Class330_Sub36_Sub15_Sub1(Class401_Sub1.aClass145_Sub1_8249.method1728(1009977096), f);
			Class401_Sub1.aClass145_Sub1_8249.method1702(class330_sub36_sub15_sub1, 1159059609);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 514349311 * class330_sub36_sub15_sub1.anInt9720;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adz.aid(").append(')').toString());
		}
	}
}
