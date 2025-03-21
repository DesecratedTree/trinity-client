/* Class274_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class274_Sub1 extends Class274 {
	static int anInt7400 = 2;
	static boolean aBoolean7401;
	static int anInt7402 = 0;
	static int anInt7403 = 1;
	static int[] anIntArray7404;
	static int anInt7405 = 3;
	static int[] anIntArray7406;
	Class463 aClass463_7407;
	static int[] anIntArray7408;
	int anInt7409 = -1729351545;
	static boolean aBoolean7410 = false;
	Class389 aClass389_7411;
	static int[] anIntArray7412;
	public static Class411 aClass411_7413;

	void method2706(Class_ra class_ra, int i, int i_0_, int i_1_, int i_2_, Class307 class307, int i_3_) {
		try {
			Interface2 interface2 = method2713(i, i_0_, i_1_, i_2_, (byte) 81);
			if (interface2 != null) {
				Class473 class473 = (((Class274_Sub1) this).aClass463_7407.method5705(interface2.method34((short) -3423), (byte) -111));
				int i_4_ = interface2.method21(1020268653);
				int i_5_ = interface2.method33((byte) -84);
				if (class473.method5907(169244819))
					Class250.method2521(i, i_1_, i_2_, class473, 535906678);
				if (interface2.method31(1268217323))
					interface2.method26(class_ra, -1090516231);
				if (0 == i_0_) {
					aClass356_2767.method4175(i, i_1_, i_2_, -313230374);
					aClass356_2767.method4147(i, i_1_, i_2_, (byte) -80);
					if (0 != class473.anInt5635 * -146884317)
						class307.method3057(i_1_, i_2_, i_4_, i_5_, class473.aBoolean5636, !class473.aBoolean5668, -1836235908);
					if (class473.anInt5641 * 1793271689 == 1) {
						if (i_5_ == 0)
							aClass356_2767.aClass358_3649.method4217(1, i, i_1_, i_2_);
						else if (1 == i_5_)
							aClass356_2767.aClass358_3649.method4217(2, i, i_1_, i_2_ + 1);
						else if (2 == i_5_)
							aClass356_2767.aClass358_3649.method4217(1, i, 1 + i_1_, i_2_);
						else if (3 == i_5_)
							aClass356_2767.aClass358_3649.method4217(2, i, i_1_, i_2_);
					}
				} else if (1 == i_0_) {
					aClass356_2767.method4148(i, i_1_, i_2_, (byte) 83);
					aClass356_2767.method4149(i, i_1_, i_2_, 67881025);
				} else if (i_0_ == 2) {
					aClass356_2767.method4181(i, i_1_, i_2_, client.anInterface19_9266, (byte) 60);
					if (class473.anInt5635 * -146884317 != 0 && (564595847 * class473.anInt5674 + i_1_ < -1752239247 * anInt2770) && (564595847 * class473.anInt5674 + i_2_ < anInt2776 * 1154287061) && (-639841087 * class473.anInt5680 + i_1_ < anInt2770 * -1752239247) && (i_2_ + class473.anInt5680 * -639841087 < 1154287061 * anInt2776))
						class307.method3062(i_1_, i_2_, 564595847 * class473.anInt5674, -639841087 * class473.anInt5680, i_5_, class473.aBoolean5636, !class473.aBoolean5668, (short) 12281);
					if (i_4_ == Class476.aClass476_6902.anInt6882 * -344921723) {
						if ((i_5_ & 0x1) == 0)
							aClass356_2767.aClass358_3649.method4217(8, i, i_1_, i_2_);
						else
							aClass356_2767.aClass358_3649.method4217(16, i, i_1_, i_2_);
					}
				} else if (3 == i_0_) {
					aClass356_2767.method4150(i, i_1_, i_2_, -114690229);
					if (class473.anInt5635 * -146884317 == 1)
						class307.method3068(i_1_, i_2_, -362549354);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.cn(").append(')').toString());
		}
	}

	public final void method2707(Class_ra class_ra, Buffer class330_sub46, int i, int i_6_, byte i_7_) {
		try {
			if (!aBoolean2777) {
				boolean bool = false;
				Class394 class394 = null;
				while_2_: do {
					for (;;) {
						if (-824785231 * class330_sub46.offset >= class330_sub46.payload.length)
							break while_2_;
						int i_8_ = class330_sub46.readUnsignedByte(1594183149);
						if (i_8_ == 0) {
							if (null == class394)
								class394 = new Class394(class330_sub46, (((Class274_Sub1) this).aClass389_7411));
							else
								class394.method4621(class330_sub46, (((Class274_Sub1) this).aClass389_7411), -1282592518);
						} else if (1 == i_8_) {
							int i_9_ = class330_sub46.readUnsignedByte(1109076957);
							if (i_9_ > 0) {
								for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
									Class349 class349 = new Class349(class_ra, (916917461 * (aClass356_2767.anInt3641)), class330_sub46, 2);
									if (-1305972379 * class349.anInt3472 == 31) {
										Class512 class512 = (Class233.aClass519_2467.method6217(class330_sub46.readUnsignedShort(-107253215), (byte) 0));
										class349.method4022(class512.anInt5959 * 457426003, class512.anInt5956 * -1004615769, -147472557 * class512.anInt5958, -1835580039 * class512.anInt5957, -1019406119);
									}
									if (class_ra.cr() > 0) {
										Class330_Sub14 class330_sub14 = class349.aClass330_Sub14_3467;
										int i_11_ = (class330_sub14.method3318(2110977511) + (i << 9));
										int i_12_ = (class330_sub14.method3312((short) -3777) + (i_6_ << 9));
										int i_13_ = i_11_ >> 9;
										int i_14_ = i_12_ >> 9;
										if (i_13_ >= 0 && i_14_ >= 0 && i_13_ < anInt2770 * -1752239247 && (i_14_ < 1154287061 * anInt2776)) {
											class330_sub14.method3315(i_11_, ((anIntArrayArrayArray2793[(1583989685 * class349.anInt3470)][i_13_][i_14_]) - (class330_sub14.method3311((byte) 54))), i_12_, (byte) 7);
											aClass356_2767.method4170(class349, 589444029);
										}
									}
								}
							}
						} else if (2 == i_8_) {
							if (class394 == null)
								class394 = new Class394();
							class394.method4622(class330_sub46, 305130712);
						} else if (128 == i_8_) {
							if (null == class394)
								class394 = new Class394();
							class394.method4623(class330_sub46, (((Class274_Sub1) this).aClass389_7411), (byte) -90);
						} else {
							if (i_8_ != 129)
								break;
							if (aByteArrayArrayArray2824 == null)
								aByteArrayArrayArray2824 = new byte[4][][];
							for (int i_15_ = 0; i_15_ < 4; i_15_++) {
								byte i_16_ = class330_sub46.readByte((byte) -40);
								if (0 == i_16_ && (aByteArrayArrayArray2824[i_15_] != null)) {
									int i_17_ = i;
									int i_18_ = 64 + i;
									int i_19_ = i_6_;
									int i_20_ = 64 + i_6_;
									if (i_17_ < 0)
										i_17_ = 0;
									else if (i_17_ >= anInt2770 * -1752239247)
										i_17_ = -1752239247 * anInt2770;
									if (i_18_ < 0)
										i_18_ = 0;
									else if (i_18_ >= anInt2770 * -1752239247)
										i_18_ = -1752239247 * anInt2770;
									if (i_19_ < 0)
										i_19_ = 0;
									else if (i_19_ >= anInt2776 * 1154287061)
										i_19_ = 1154287061 * anInt2776;
									if (i_20_ < 0)
										i_20_ = 0;
									else if (i_20_ >= 1154287061 * anInt2776)
										i_20_ = anInt2776 * 1154287061;
									for (/**/; i_17_ < i_18_; i_17_++) {
										for (/**/; i_19_ < i_20_; i_19_++)
											aByteArrayArrayArray2824[i_15_][i_17_][i_19_] = (byte) 0;
									}
								} else if (i_16_ == 1) {
									if (aByteArrayArrayArray2824[i_15_] == null)
										aByteArrayArrayArray2824[i_15_] = (new byte[-1752239247 * anInt2770 + 1][1 + anInt2776 * 1154287061]);
									for (int i_21_ = 0; i_21_ < 64; i_21_ += 4) {
										for (int i_22_ = 0; i_22_ < 64; i_22_ += 4) {
											byte i_23_ = class330_sub46.readByte((byte) -97);
											for (int i_24_ = i + i_21_; i_24_ < i + i_21_ + 4; i_24_++) {
												for (int i_25_ = i_22_ + i_6_; i_25_ < i_6_ + i_22_ + 4; i_25_++) {
													if (i_24_ >= 0 && (i_24_ < (-1752239247 * anInt2770)) && i_25_ >= 0 && (i_25_ < (anInt2776 * 1154287061)))
														aByteArrayArrayArray2824[i_15_][i_24_][i_25_] = i_23_;
												}
											}
										}
									}
								} else if (i_16_ == 2) {
									if (null == aByteArrayArrayArray2824[i_15_])
										aByteArrayArrayArray2824[i_15_] = (new byte[anInt2770 * -1752239247 + 1][anInt2776 * 1154287061 + 1]);
									if (i_15_ > 0) {
										int i_26_ = i;
										int i_27_ = i + 64;
										int i_28_ = i_6_;
										int i_29_ = i_6_ + 64;
										if (i_26_ < 0)
											i_26_ = 0;
										else if (i_26_ >= -1752239247 * anInt2770)
											i_26_ = anInt2770 * -1752239247;
										if (i_27_ < 0)
											i_27_ = 0;
										else if (i_27_ >= anInt2770 * -1752239247)
											i_27_ = anInt2770 * -1752239247;
										if (i_28_ < 0)
											i_28_ = 0;
										else if (i_28_ >= anInt2776 * 1154287061)
											i_28_ = 1154287061 * anInt2776;
										if (i_29_ < 0)
											i_29_ = 0;
										else if (i_29_ >= 1154287061 * anInt2776)
											i_29_ = 1154287061 * anInt2776;
										for (/**/; i_26_ < i_27_; i_26_++) {
											for (/**/; i_28_ < i_29_; i_28_++)
												aByteArrayArrayArray2824[i_15_][i_26_][i_28_] = (aByteArrayArrayArray2824[i_15_ - 1][i_26_][i_28_]);
										}
									}
								}
							}
							bool = true;
						}
					}
					throw new IllegalStateException("");
				} while (false);
				if (null != class394) {
					for (int i_30_ = 0; i_30_ < 8; i_30_++) {
						for (int i_31_ = 0; i_31_ < 8; i_31_++) {
							int i_32_ = (i >> 3) + i_30_;
							int i_33_ = (i_6_ >> 3) + i_31_;
							if (i_32_ >= 0 && i_32_ < -1752239247 * anInt2770 >> 3 && i_33_ >= 0 && i_33_ < anInt2776 * 1154287061 >> 3)
								((Class274_Sub1) this).aClass389_7411.method4586(i_32_, i_33_, class394, (byte) 0);
						}
					}
				}
				if (!bool && aByteArrayArrayArray2824 != null) {
					for (int i_34_ = 0; i_34_ < 4; i_34_++) {
						if (aByteArrayArrayArray2824[i_34_] != null) {
							for (int i_35_ = 0; i_35_ < 16; i_35_++) {
								for (int i_36_ = 0; i_36_ < 16; i_36_++) {
									int i_37_ = i_35_ + (i >> 2);
									int i_38_ = (i_6_ >> 2) + i_36_;
									if (i_37_ >= 0 && i_37_ < 26 && i_38_ >= 0 && i_38_ < 26)
										aByteArrayArrayArray2824[i_34_][i_37_][i_38_] = (byte) 0;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.bb(").append(')').toString());
		}
	}

	public final void method2708(Class_ra class_ra, Buffer class330_sub46, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_) {
		try {
			if (!aBoolean2777) {
				boolean bool = false;
				Class394 class394 = null;
				int i_46_ = 8 * (i_42_ & 0x7);
				int i_47_ = (i_43_ & 0x7) * 8;
				while_3_: do {
					for (;;) {
						if (-824785231 * class330_sub46.offset >= class330_sub46.payload.length)
							break while_3_;
						int i_48_ = class330_sub46.readUnsignedByte(204604354);
						if (0 == i_48_) {
							if (class394 == null)
								class394 = new Class394(class330_sub46, (((Class274_Sub1) this).aClass389_7411));
							else
								class394.method4621(class330_sub46, (((Class274_Sub1) this).aClass389_7411), 296572065);
						} else if (i_48_ == 1) {
							int i_49_ = class330_sub46.readUnsignedByte(1379010698);
							if (i_49_ > 0) {
								for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
									Class349 class349 = new Class349(class_ra, (916917461 * (aClass356_2767.anInt3641)), class330_sub46, 2);
									if (31 == class349.anInt3472 * -1305972379) {
										Class512 class512 = (Class233.aClass519_2467.method6217(class330_sub46.readUnsignedShort(-414035857), (byte) 0));
										class349.method4022(class512.anInt5959 * 457426003, class512.anInt5956 * -1004615769, -147472557 * class512.anInt5958, class512.anInt5957 * -1835580039, 1869280719);
									}
									if (class_ra.cr() > 0) {
										Class330_Sub14 class330_sub14 = class349.aClass330_Sub14_3467;
										int i_51_ = (class330_sub14.method3318(417063984) >> 9);
										int i_52_ = (class330_sub14.method3312((short) -10437) >> 9);
										if ((1583989685 * class349.anInt3470 == i_41_) && i_51_ >= i_46_ && i_51_ < 8 + i_46_ && i_52_ >= i_47_ && i_52_ < i_47_ + 8) {
											int i_53_ = ((i_39_ << 9) + (Class168.method2027((class330_sub14.method3318(-2075921429)) & 0xfff, ((class330_sub14.method3312((short) 11988)) & 0xfff), i_44_, -1291791072)));
											int i_54_ = ((i_40_ << 9) + (Class134.method1573((class330_sub14.method3318(-1105776869)) & 0xfff, ((class330_sub14.method3312((short) 2688)) & 0xfff), i_44_, 1500917129)));
											i_51_ = i_53_ >> 9;
											i_52_ = i_54_ >> 9;
											if (i_51_ >= 0 && i_52_ >= 0 && (i_51_ < -1752239247 * anInt2770) && i_52_ < (1154287061 * anInt2776)) {
												class330_sub14.method3315(i_53_, ((anIntArrayArrayArray2793[i_41_][i_51_][i_52_]) - (class330_sub14.method3311((byte) 5))), i_54_, (byte) 7);
												aClass356_2767.method4170(class349, 463740307);
											}
										}
									}
								}
							}
						} else if (i_48_ == 2) {
							if (null == class394)
								class394 = new Class394();
							class394.method4622(class330_sub46, 894280959);
						} else if (i_48_ == 128) {
							if (null == class394)
								class394 = new Class394();
							class394.method4623(class330_sub46, (((Class274_Sub1) this).aClass389_7411), (byte) -4);
						} else {
							if (129 != i_48_)
								break;
							if (null == aByteArrayArrayArray2824)
								aByteArrayArrayArray2824 = new byte[4][][];
							int i_55_ = 0;
							for (/**/; i_55_ < 4; i_55_++) {
								byte i_56_ = class330_sub46.readByte((byte) 49);
								if (0 == i_56_ && null != aByteArrayArrayArray2824[i]) {
									if (i_55_ <= i_41_) {
										int i_57_ = i_39_;
										int i_58_ = 7 + i_39_;
										int i_59_ = i_40_;
										int i_60_ = 7 + i_40_;
										if (i_57_ < 0)
											i_57_ = 0;
										else if (i_57_ >= anInt2770 * -1752239247)
											i_57_ = anInt2770 * -1752239247;
										if (i_58_ < 0)
											i_58_ = 0;
										else if (i_58_ >= anInt2770 * -1752239247)
											i_58_ = anInt2770 * -1752239247;
										if (i_59_ < 0)
											i_59_ = 0;
										else if (i_59_ >= anInt2776 * 1154287061)
											i_59_ = anInt2776 * 1154287061;
										if (i_60_ < 0)
											i_60_ = 0;
										else if (i_60_ >= 1154287061 * anInt2776)
											i_60_ = anInt2776 * 1154287061;
										for (/**/; i_57_ < i_58_; i_57_++) {
											for (/**/; i_59_ < i_60_; i_59_++)
												aByteArrayArrayArray2824[i][i_57_][i_59_] = (byte) 0;
										}
									}
								} else if (1 == i_56_) {
									if (null == aByteArrayArrayArray2824[i])
										aByteArrayArrayArray2824[i] = (new byte[1 + anInt2770 * -1752239247][1154287061 * anInt2776 + 1]);
									for (int i_61_ = 0; i_61_ < 64; i_61_ += 4) {
										for (int i_62_ = 0; i_62_ < 64; i_62_ += 4) {
											byte i_63_ = class330_sub46.readByte((byte) -30);
											if (i_55_ <= i_41_) {
												for (int i_64_ = i_61_; i_64_ < i_61_ + 4; i_64_++) {
													for (int i_65_ = i_62_; i_65_ < i_62_ + 4; i_65_++) {
														if (i_64_ >= i_46_ && (i_64_ < 8 + i_46_) && i_65_ >= i_47_ && (i_65_ < i_47_ + 8)) {
															int i_66_ = (i_39_ + (Class142.method1649((i_64_ & 0x7), (i_65_ & 0x7), i_44_, -1436891375)));
															int i_67_ = (i_40_ + (Class100.method1211((i_64_ & 0x7), (i_65_ & 0x7), i_44_, (byte) -115)));
															if (i_66_ >= 0 && (i_66_ < (anInt2770 * -1752239247)) && i_67_ >= 0 && (i_67_ < (1154287061 * anInt2776))) {
																aByteArrayArrayArray2824[i][i_66_][i_67_] = i_63_;
																bool = true;
															}
														}
													}
												}
											}
										}
									}
								} else if (2 == i_56_)
									continue;
							}
						}
					}
					throw new IllegalStateException("");
				} while (false);
				if (null != class394)
					((Class274_Sub1) this).aClass389_7411.method4586(i_39_ >> 3, i_40_ >> 3, class394, (byte) 0);
				if (!bool && aByteArrayArrayArray2824 != null && aByteArrayArrayArray2824[i] != null) {
					int i_68_ = i_39_ + 7;
					int i_69_ = i_40_ + 7;
					for (int i_70_ = i_39_; i_70_ < i_68_; i_70_++) {
						for (int i_71_ = i_40_; i_71_ < i_69_; i_71_++)
							aByteArrayArrayArray2824[i][i_70_][i_71_] = (byte) 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.ch(").append(')').toString());
		}
	}

	public final void method2709(Class_ra class_ra, byte[] is, int i, int i_72_, Class307[] class307s, int i_73_) {
		try {
			Buffer class330_sub46 = new Buffer(is);
			int i_74_ = -1;
			for (;;) {
				int i_75_ = class330_sub46.method3767(1558443671);
				if (i_75_ == 0) {
					if (i_73_ <= -1465543556) {
						/* empty */
					}
					break;
				}
				i_74_ += i_75_;
				int i_76_ = 0;
				for (;;) {
					int i_77_ = class330_sub46.readSmart(-1923126169);
					if (0 == i_77_) {
						if (i_73_ <= -1465543556)
							throw new IllegalStateException();
						break;
					}
					i_76_ += i_77_ - 1;
					int i_78_ = i_76_ & 0x3f;
					int i_79_ = i_76_ >> 6 & 0x3f;
					int i_80_ = i_76_ >> 12;
					int i_81_ = class330_sub46.readUnsignedByte(1984479636);
					int i_82_ = i_81_ >> 2;
					int i_83_ = i_81_ & 0x3;
					int i_84_ = i_79_ + i;
					int i_85_ = i_78_ + i_72_;
					if (i_84_ > 0 && i_85_ > 0 && i_84_ < anInt2770 * -1752239247 - 1 && i_85_ < 1154287061 * anInt2776 - 1) {
						Class307 class307 = null;
						if (!aBoolean2777) {
							int i_86_ = i_80_;
							if (2 == ((aClass281_2811.aByteArrayArrayArray2916[1][i_84_][i_85_]) & 0x2))
								i_86_--;
							if (i_86_ >= 0)
								class307 = class307s[i_86_];
						}
						method2711(class_ra, i_80_, i_80_, i_84_, i_85_, i_74_, i_83_, i_82_, class307, -1, -2116256852);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.cj(").append(')').toString());
		}
	}

	public final void method2710(Class_ra class_ra, boolean bool, byte i) {
		try {
			aClass356_2767.method4162();
			if (!bool) {
				if (anInt2774 * -392146777 > 1) {
					for (int i_87_ = 0; i_87_ < -1752239247 * anInt2770; i_87_++) {
						for (int i_88_ = 0; i_88_ < anInt2776 * 1154287061; i_88_++) {
							if (2 == ((aClass281_2811.aByteArrayArrayArray2916[1][i_87_][i_88_]) & 0x2))
								aClass356_2767.method4182(i_87_, i_88_, 1238624321);
						}
					}
				}
				for (int i_89_ = 0; i_89_ < anInt2774 * -392146777; i_89_++) {
					for (int i_90_ = 0; i_90_ <= 1154287061 * anInt2776; i_90_++) {
						for (int i_91_ = 0; i_91_ <= -1752239247 * anInt2770; i_91_++) {
							if (0 != ((aByteArrayArrayArray2785[i_89_][i_91_][i_90_]) & 0x4)) {
								int i_92_ = i_91_;
								int i_93_ = i_91_;
								int i_94_ = i_90_;
								int i_95_;
								for (i_95_ = i_90_; (i_94_ > 0 && ((aByteArrayArrayArray2785[i_89_][i_91_][i_94_ - 1]) & 0x4) != 0 && i_95_ - i_94_ < 10); i_94_--) {
									/* empty */
								}
								for (/**/; (i_95_ < 1154287061 * anInt2776 && 0 != ((aByteArrayArrayArray2785[i_89_][i_91_][1 + i_95_]) & 0x4) && i_95_ - i_94_ < 10); i_95_++) {
									/* empty */
								}
								while_4_: for (/**/; i_92_ > 0 && i_93_ - i_92_ < 10; i_92_--) {
									for (int i_96_ = i_94_; i_96_ <= i_95_; i_96_++) {
										if (((aByteArrayArrayArray2785[i_89_][i_92_ - 1][i_96_]) & 0x4) == 0) {
											if (i != 0) {
												/* empty */
											}
											break while_4_;
										}
									}
								}
								while_5_: for (/**/; (i_93_ < -1752239247 * anInt2770 && i_93_ - i_92_ < 10); i_93_++) {
									for (int i_97_ = i_94_; i_97_ <= i_95_; i_97_++) {
										if (0 == ((aByteArrayArrayArray2785[i_89_][i_93_ + 1][i_97_]) & 0x4)) {
											if (i != 0)
												throw new IllegalStateException();
											break while_5_;
										}
									}
								}
								if ((i_93_ - i_92_ + 1) * (1 + (i_95_ - i_94_)) >= 4) {
									int i_98_ = (anIntArrayArrayArray2793[i_89_][i_92_][i_94_]);
									aClass356_2767.aClass358_3649.method4226(4, i_89_, i_92_ << 9, (i_93_ << 9) + 512, i_94_ << 9, (i_95_ << 9) + 512, i_98_, i_98_);
									for (int i_99_ = i_92_; i_99_ <= i_93_; i_99_++) {
										for (int i_100_ = i_94_; i_100_ <= i_95_; i_100_++)
											aByteArrayArrayArray2785[i_89_][i_99_][i_100_] &= ~0x4;
									}
								}
							}
						}
					}
				}
				aClass356_2767.aClass358_3649.method4218();
			}
			aByteArrayArrayArray2785 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.cm(").append(')').toString());
		}
	}

	final void method2711(Class_ra class_ra, int i, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, Class307 class307, int i_107_, int i_108_) {
		try {
			if (i_101_ < -1106725819 * ((Class274_Sub1) this).anInt7409)
				((Class274_Sub1) this).anInt7409 = i_101_ * -1709425011;
			Class473 class473 = ((Class274_Sub1) this).aClass463_7407.method5705(i_104_, (byte) -89);
			if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1116574347) != 0 || !class473.aBoolean5690) {
				int i_109_;
				int i_110_;
				if (i_105_ == 1 || 3 == i_105_) {
					i_109_ = -639841087 * class473.anInt5680;
					i_110_ = 564595847 * class473.anInt5674;
				} else {
					i_109_ = class473.anInt5674 * 564595847;
					i_110_ = -639841087 * class473.anInt5680;
				}
				int i_111_;
				int i_112_;
				if (i_109_ + i_102_ <= -1752239247 * anInt2770) {
					i_111_ = (i_109_ >> 1) + i_102_;
					i_112_ = i_102_ + (i_109_ + 1 >> 1);
				} else {
					i_111_ = i_102_;
					i_112_ = i_102_ + 1;
				}
				int i_113_;
				int i_114_;
				if (i_110_ + i_103_ <= anInt2776 * 1154287061) {
					i_113_ = i_103_ + (i_110_ >> 1);
					i_114_ = i_103_ + (1 + i_110_ >> 1);
				} else {
					i_113_ = i_103_;
					i_114_ = i_103_ + 1;
				}
				Class_xa class_xa = aClass356_2767.aClass_xaArray3676[i];
				int i_115_ = ((class_xa.method6417(i_111_, i_113_, -928240312) + class_xa.method6417(i_112_, i_113_, 1838614218) + class_xa.method6417(i_111_, i_114_, -1827714293) + class_xa.method6417(i_112_, i_114_, -129823424)) >> 2);
				int i_116_ = (i_102_ << 9) + (i_109_ << 8);
				int i_117_ = (i_103_ << 9) + (i_110_ << 8);
				boolean bool = aBoolean2780 && !aBoolean2777 && class473.aBoolean5647;
				if (class473.method5907(1145498232))
					Class_ra.method4809(i_101_, i_102_, i_103_, i_105_, class473, null, null, -1229578866);
				boolean bool_118_ = (-1 == i_107_ && !class473.method5904((byte) -38) && class473.anIntArray5678 == null && !class473.aBoolean5688 && !class473.aBoolean5692);
				if (!aBoolean7410 || ((!Class262.method2593(i_106_, -848197694) || class473.anInt5641 * 1793271689 == 1) && (!Class141.method1648(i_106_, -684657474) || 0 != class473.anInt5641 * 1793271689))) {
					if (i_106_ == Class476.aClass476_6900.anInt6882 * -344921723) {
						if (Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5757(65535) != 0 || -1012368965 * class473.anInt5637 != 0 || class473.anInt5635 * -146884317 == 1 || class473.aBoolean5667) {
							Class432_Sub1_Sub4 class432_sub1_sub4;
							if (bool_118_) {
								Class432_Sub1_Sub4_Sub2 class432_sub1_sub4_sub2 = (new Class432_Sub1_Sub4_Sub2(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_101_, i, i_116_, i_115_, i_117_, aBoolean2777, i_105_, bool));
								if (class432_sub1_sub4_sub2.method31(1211534700))
									class432_sub1_sub4_sub2.method25(class_ra, 843961968);
								class432_sub1_sub4 = class432_sub1_sub4_sub2;
							} else
								class432_sub1_sub4 = (new Class432_Sub1_Sub4_Sub1(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_101_, i, i_116_, i_115_, i_117_, aBoolean2777, i_105_, i_107_));
							aClass356_2767.method4142(i_101_, i_102_, i_103_, class432_sub1_sub4, (byte) 109);
							if (1 == class473.anInt5635 * -146884317 && null != class307)
								class307.method3060(i_102_, i_103_, 1303500119);
						}
					} else if ((Class476.aClass476_6898.anInt6882 * -344921723 == i_106_) || i_106_ == -344921723 * (Class476.aClass476_6878.anInt6882)) {
						Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6 = null;
						Class432_Sub1_Sub1 class432_sub1_sub1;
						int i_119_;
						if (bool_118_) {
							Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6_120_ = (new Class432_Sub1_Sub1_Sub6(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_101_, i, i_116_, i_115_, i_117_, aBoolean2777, i_102_, i_109_ + i_102_ - 1, i_103_, i_110_ + i_103_ - 1, i_106_, i_105_, bool));
							i_119_ = class432_sub1_sub1_sub6_120_.method5512(-1238563174);
							class432_sub1_sub1 = class432_sub1_sub1_sub6_120_;
							class432_sub1_sub1_sub6 = class432_sub1_sub1_sub6_120_;
						} else {
							class432_sub1_sub1 = (new Class432_Sub1_Sub1_Sub5(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_101_, i, i_116_, i_115_, i_117_, aBoolean2777, i_102_, i_102_ + i_109_ - 1, i_103_, i_103_ + i_110_ - 1, i_106_, i_105_, i_107_));
							i_119_ = 15;
						}
						if (aClass356_2767.method4145(class432_sub1_sub1, false, -936218714)) {
							if (class432_sub1_sub1_sub6 != null && class432_sub1_sub1_sub6.method31(1009538210))
								class432_sub1_sub1_sub6.method25(class_ra, 843961968);
							if (class473.aBoolean5669 && aBoolean2780) {
								if (i_119_ > 30)
									i_119_ = 30;
								for (int i_121_ = 0; i_121_ <= i_109_; i_121_++) {
									for (int i_122_ = 0; i_122_ <= i_110_; i_122_++)
										class_xa.LA(i_121_ + i_102_, i_122_ + i_103_, i_119_);
								}
							}
						}
						if (class473.anInt5635 * -146884317 != 0 && null != class307)
							class307.method3058(i_102_, i_103_, i_109_, i_110_, class473.aBoolean5636, !class473.aBoolean5668, 1048177648);
					} else if (Class141.method1648(i_106_, -51382735) || Class282.method2813(i_106_, 807610786)) {
						Class432_Sub1_Sub1 class432_sub1_sub1;
						if (bool_118_) {
							Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6 = (new Class432_Sub1_Sub1_Sub6(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_101_, i, i_116_, i_115_, i_117_, aBoolean2777, i_102_, i_102_ + i_109_ - 1, i_103_, i_110_ + i_103_ - 1, i_106_, i_105_, bool));
							if (class432_sub1_sub1_sub6.method31(745790932))
								class432_sub1_sub1_sub6.method25(class_ra, 843961968);
							class432_sub1_sub1 = class432_sub1_sub1_sub6;
						} else
							class432_sub1_sub1 = (new Class432_Sub1_Sub1_Sub5(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_101_, i, i_116_, i_115_, i_117_, aBoolean2777, i_102_, i_109_ + i_102_ - 1, i_103_, i_110_ + i_103_ - 1, i_106_, i_105_, i_107_));
						aClass356_2767.method4145(class432_sub1_sub1, false, -80772243);
						if (aBoolean2780 && !aBoolean2777 && Class141.method1648(i_106_, -580897730) && i_106_ != (Class476.aClass476_6889.anInt6882 * -344921723) && i_101_ > 0 && 1793271689 * class473.anInt5641 != 0)
							aByteArrayArrayArray2785[i_101_][i_102_][i_103_] |= 0x4;
						if (0 != -146884317 * class473.anInt5635 && class307 != null)
							class307.method3058(i_102_, i_103_, i_109_, i_110_, class473.aBoolean5636, !class473.aBoolean5668, 291536074);
					} else if (method2715(class_ra, i_106_, i_105_, bool_118_, class473, i_107_, i_101_, i, i_116_, i_115_, i_117_, i_102_, i_103_, bool, class_xa, class307, i_109_, i_110_, 923167251) || method2714(class_ra, i_106_, i_105_, bool_118_, class473, i_107_, i_101_, i, i_116_, i_115_, i_117_, i_102_, i_103_, (byte) -84)) {
						/* empty */
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.cb(").append(')').toString());
		}
	}

	public Class274_Sub1(Class356 class356, Class463 class463, int i, int i_123_, int i_124_, boolean bool, Class281 class281, Class389 class389) {
		super(class356, i, i_123_, i_124_, bool, Class141.aClass418_1566, Class478.aClass499_5725, class281);
		((Class274_Sub1) this).aClass463_7407 = class463;
		((Class274_Sub1) this).aClass389_7411 = class389;
	}

	public final void method2712(Class_ra class_ra, byte[] is, int i, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, Class307[] class307s, int i_131_) {
		try {
			Buffer class330_sub46 = new Buffer(is);
			int i_132_ = -1;
			for (;;) {
				int i_133_ = class330_sub46.method3767(1558443671);
				if (i_133_ == 0) {
					if (i_131_ == 116560950)
						throw new IllegalStateException();
					break;
				}
				i_132_ += i_133_;
				int i_134_ = 0;
				for (;;) {
					int i_135_ = class330_sub46.readSmart(-48285498);
					if (i_135_ == 0) {
						if (i_131_ == 116560950) {
							/* empty */
						}
						break;
					}
					i_134_ += i_135_ - 1;
					int i_136_ = i_134_ & 0x3f;
					int i_137_ = i_134_ >> 6 & 0x3f;
					int i_138_ = i_134_ >> 12;
					int i_139_ = class330_sub46.readUnsignedByte(2094041054);
					int i_140_ = i_139_ >> 2;
					int i_141_ = i_139_ & 0x3;
					if (i_127_ == i_138_ && i_137_ >= i_128_ && i_137_ < i_128_ + 8 && i_136_ >= i_129_ && i_136_ < 8 + i_129_) {
						Class473 class473 = ((Class274_Sub1) this).aClass463_7407.method5705(i_132_, (byte) 3);
						int i_142_ = (i_125_ + Class132.method1569(i_137_ & 0x7, i_136_ & 0x7, i_130_, (class473.anInt5674 * 564595847), (class473.anInt5680 * -639841087), i_141_, (byte) 0));
						int i_143_ = (i_126_ + Class467.method5858(i_137_ & 0x7, i_136_ & 0x7, i_130_, (564595847 * class473.anInt5674), (-639841087 * class473.anInt5680), i_141_, -645347990));
						if (i_142_ > 0 && i_143_ > 0 && i_142_ < -1752239247 * anInt2770 - 1 && i_143_ < 1154287061 * anInt2776 - 1) {
							Class307 class307 = null;
							if (!aBoolean2777) {
								int i_144_ = i;
								if (2 == ((aClass281_2811.aByteArrayArrayArray2916[1][i_142_][i_143_]) & 0x2))
									i_144_--;
								if (i_144_ >= 0)
									class307 = class307s[i_144_];
							}
							method2711(class_ra, i, i, i_142_, i_143_, i_132_, i_130_ + i_141_ & 0x3, i_140_, class307, -1, -220306150);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.cy(").append(')').toString());
		}
	}

	Interface2 method2713(int i, int i_145_, int i_146_, int i_147_, byte i_148_) {
		try {
			Interface2 interface2 = null;
			if (i_145_ == 0)
				interface2 = (Interface2) aClass356_2767.method4154(i, i_146_, i_147_, -2040838155);
			if (1 == i_145_)
				interface2 = (Interface2) aClass356_2767.method4156(i, i_146_, i_147_, 588582562);
			if (2 == i_145_)
				interface2 = ((Interface2) aClass356_2767.method4158(i, i_146_, i_147_, client.anInterface19_9266, (byte) 102));
			if (3 == i_145_)
				interface2 = (Interface2) aClass356_2767.method4177(i, i_146_, i_147_, 1315717432);
			return interface2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.co(").append(')').toString());
		}
	}

	static {
		aBoolean7401 = false;
		anIntArray7406 = new int[] { 1, 0, -1, 0 };
		anIntArray7404 = new int[] { 0, -1, 0, 1 };
		anIntArray7408 = new int[] { 1, -1, -1, 1 };
		anIntArray7412 = new int[] { -1, -1, 1, 1 };
	}

	boolean method2714(Class_ra class_ra, int i, int i_149_, boolean bool, Class473 class473, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, byte i_158_) {
		try {
			if (Class476.aClass476_6899.anInt6882 * -344921723 == i) {
				Class432_Sub1_Sub3 class432_sub1_sub3;
				if (bool) {
					Class432_Sub1_Sub3_Sub1 class432_sub1_sub3_sub1 = new Class432_Sub1_Sub3_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, 0, 0, i, i_149_);
					if (class432_sub1_sub3_sub1.method31(1370147630))
						class432_sub1_sub3_sub1.method25(class_ra, 843961968);
					class432_sub1_sub3 = class432_sub1_sub3_sub1;
				} else
					class432_sub1_sub3 = new Class432_Sub1_Sub3_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, 0, 0, i, i_149_, i_150_);
				aClass356_2767.method4144(i_151_, i_156_, i_157_, class432_sub1_sub3, null, 260058532);
				return true;
			}
			if (-344921723 * Class476.aClass476_6897.anInt6882 == i) {
				int i_159_ = 65;
				Interface2 interface2 = ((Interface2) aClass356_2767.method4154(i_151_, i_156_, i_157_, -2040838155));
				if (null != interface2)
					i_159_ = (((Class274_Sub1) this).aClass463_7407.method5705(interface2.method34((short) -1023), (byte) -53).anInt5646) * 254744585 + 1;
				Class432_Sub1_Sub3 class432_sub1_sub3;
				if (bool) {
					Class432_Sub1_Sub3_Sub1 class432_sub1_sub3_sub1 = (new Class432_Sub1_Sub3_Sub1(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, i_159_ * anIntArray7406[i_149_], anIntArray7404[i_149_] * i_159_, i, i_149_));
					if (class432_sub1_sub3_sub1.method31(983909135))
						class432_sub1_sub3_sub1.method25(class_ra, 843961968);
					class432_sub1_sub3 = class432_sub1_sub3_sub1;
				} else
					class432_sub1_sub3 = (new Class432_Sub1_Sub3_Sub2(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, anIntArray7406[i_149_] * i_159_, i_159_ * anIntArray7404[i_149_], i, i_149_, i_150_));
				aClass356_2767.method4144(i_151_, i_156_, i_157_, class432_sub1_sub3, null, 377048580);
				return true;
			}
			if (i == Class476.aClass476_6885.anInt6882 * -344921723) {
				int i_160_ = 33;
				Interface2 interface2 = ((Interface2) aClass356_2767.method4154(i_151_, i_156_, i_157_, -2040838155));
				if (interface2 != null)
					i_160_ = (((Class274_Sub1) this).aClass463_7407.method5705(interface2.method34((short) -1547), (byte) -38).anInt5646) * 254744585 / 2 + 1;
				Class432_Sub1_Sub3 class432_sub1_sub3;
				if (bool) {
					Class432_Sub1_Sub3_Sub1 class432_sub1_sub3_sub1 = (new Class432_Sub1_Sub3_Sub1(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, i_160_ * anIntArray7406[i_149_], i_160_ * anIntArray7404[i_149_], i, i_149_ + 4));
					if (class432_sub1_sub3_sub1.method31(1741438771))
						class432_sub1_sub3_sub1.method25(class_ra, 843961968);
					class432_sub1_sub3 = class432_sub1_sub3_sub1;
				} else
					class432_sub1_sub3 = (new Class432_Sub1_Sub3_Sub2(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, anIntArray7408[i_149_] * i_160_, i_160_ * anIntArray7412[i_149_], i, 4 + i_149_, i_150_));
				aClass356_2767.method4144(i_151_, i_156_, i_157_, class432_sub1_sub3, null, -1534867012);
				return true;
			}
			if (i == Class476.aClass476_6886.anInt6882 * -344921723) {
				int i_161_ = 2 + i_149_ & 0x3;
				Class432_Sub1_Sub3 class432_sub1_sub3;
				if (bool) {
					Class432_Sub1_Sub3_Sub1 class432_sub1_sub3_sub1 = new Class432_Sub1_Sub3_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, 0, 0, i, i_161_ + 4);
					if (class432_sub1_sub3_sub1.method31(1906136815))
						class432_sub1_sub3_sub1.method25(class_ra, 843961968);
					class432_sub1_sub3 = class432_sub1_sub3_sub1;
				} else
					class432_sub1_sub3 = new Class432_Sub1_Sub3_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, 0, 0, i, i_161_ + 4, i_150_);
				aClass356_2767.method4144(i_151_, i_156_, i_157_, class432_sub1_sub3, null, -844156577);
				return true;
			}
			if (-344921723 * Class476.aClass476_6887.anInt6882 == i) {
				int i_162_ = i_149_ + 2 & 0x3;
				int i_163_ = 33;
				Interface2 interface2 = ((Interface2) aClass356_2767.method4154(i_151_, i_156_, i_157_, -2040838155));
				if (null != interface2)
					i_163_ = (((Class274_Sub1) this).aClass463_7407.method5705(interface2.method34((short) -20399), (byte) 17).anInt5646) * 254744585 / 2 + 1;
				Class432_Sub1_Sub3 class432_sub1_sub3;
				Class432_Sub1_Sub3 class432_sub1_sub3_164_;
				if (bool) {
					Class432_Sub1_Sub3_Sub1 class432_sub1_sub3_sub1 = (new Class432_Sub1_Sub3_Sub1(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, i_163_ * anIntArray7408[i_149_], anIntArray7412[i_149_] * i_163_, i, i_149_ + 4));
					Class432_Sub1_Sub3_Sub1 class432_sub1_sub3_sub1_165_ = new Class432_Sub1_Sub3_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, 0, 0, i, i_162_ + 4);
					if (class432_sub1_sub3_sub1.method31(1604704468))
						class432_sub1_sub3_sub1.method25(class_ra, 843961968);
					if (class432_sub1_sub3_sub1_165_.method31(643232993))
						class432_sub1_sub3_sub1_165_.method25(class_ra, 843961968);
					class432_sub1_sub3 = class432_sub1_sub3_sub1;
					class432_sub1_sub3_164_ = class432_sub1_sub3_sub1_165_;
				} else {
					Class432_Sub1_Sub3_Sub2 class432_sub1_sub3_sub2 = (new Class432_Sub1_Sub3_Sub2(aClass356_2767, class_ra, ((Class274_Sub1) this).aClass463_7407, class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, i_163_ * anIntArray7408[i_149_], anIntArray7412[i_149_] * i_163_, i, i_149_ + 4, i_150_));
					Class432_Sub1_Sub3_Sub2 class432_sub1_sub3_sub2_166_ = new Class432_Sub1_Sub3_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_151_, i_152_, i_153_, i_154_, i_155_, aBoolean2777, 0, 0, i, 4 + i_162_, i_150_);
					class432_sub1_sub3 = class432_sub1_sub3_sub2;
					class432_sub1_sub3_164_ = class432_sub1_sub3_sub2_166_;
				}
				aClass356_2767.method4144(i_151_, i_156_, i_157_, class432_sub1_sub3, class432_sub1_sub3_164_, -2122928068);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.cd(").append(')').toString());
		}
	}

	boolean method2715(Class_ra class_ra, int i, int i_167_, boolean bool, Class473 class473, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, boolean bool_176_, Class_xa class_xa, Class307 class307, int i_177_, int i_178_, int i_179_) {
		try {
			if (i == -344921723 * Class476.aClass476_6883.anInt6882) {
				int i_180_ = 1793271689 * class473.anInt5641;
				if (aBoolean7401 && class473.anInt5641 * 1793271689 == -1)
					i_180_ = 1;
				Class432_Sub1_Sub5 class432_sub1_sub5;
				if (bool) {
					Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = new Class432_Sub1_Sub5_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_167_, bool_176_);
					if (class432_sub1_sub5_sub1.method31(807710265))
						class432_sub1_sub5_sub1.method25(class_ra, 843961968);
					class432_sub1_sub5 = class432_sub1_sub5_sub1;
				} else
					class432_sub1_sub5 = new Class432_Sub1_Sub5_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_167_, i_168_);
				aClass356_2767.method4180(i_169_, i_174_, i_175_, class432_sub1_sub5, null, 1505128875);
				if (i_167_ == 0) {
					if (aBoolean2780 && class473.aBoolean5669) {
						class_xa.LA(i_174_, i_175_, 50);
						class_xa.LA(i_174_, i_175_ + 1, 50);
					}
					if (i_180_ == 1 && !aBoolean2777)
						aClass356_2767.aClass358_3649.method4216(1, i_169_, i_174_, i_175_, -966857639 * class473.anInt5642, 1193690113 * class473.anInt5643);
				} else if (i_167_ == 1) {
					if (aBoolean2780 && class473.aBoolean5669) {
						class_xa.LA(i_174_, 1 + i_175_, 50);
						class_xa.LA(1 + i_174_, i_175_ + 1, 50);
					}
					if (i_180_ == 1 && !aBoolean2777)
						aClass356_2767.aClass358_3649.method4216(2, i_169_, i_174_, i_175_ + 1, -966857639 * class473.anInt5642, -(class473.anInt5643 * 1193690113));
				} else if (i_167_ == 2) {
					if (aBoolean2780 && class473.aBoolean5669) {
						class_xa.LA(i_174_ + 1, i_175_, 50);
						class_xa.LA(i_174_ + 1, i_175_ + 1, 50);
					}
					if (i_180_ == 1 && !aBoolean2777)
						aClass356_2767.aClass358_3649.method4216(1, i_169_, i_174_ + 1, i_175_, -966857639 * class473.anInt5642, -(1193690113 * class473.anInt5643));
				} else if (3 == i_167_) {
					if (aBoolean2780 && class473.aBoolean5669) {
						class_xa.LA(i_174_, i_175_, 50);
						class_xa.LA(i_174_ + 1, i_175_, 50);
					}
					if (i_180_ == 1 && !aBoolean2777)
						aClass356_2767.aClass358_3649.method4216(2, i_169_, i_174_, i_175_, -966857639 * class473.anInt5642, 1193690113 * class473.anInt5643);
				}
				if (class473.anInt5635 * -146884317 != 0 && null != class307)
					class307.method3063(i_174_, i_175_, i, i_167_, class473.aBoolean5636, !class473.aBoolean5668, -385586251);
				if (64 != 254744585 * class473.anInt5646)
					aClass356_2767.method4184(i_169_, i_174_, i_175_, 254744585 * class473.anInt5646, -1507395092);
				return true;
			}
			if (i == -344921723 * Class476.aClass476_6879.anInt6882) {
				Class432_Sub1_Sub5 class432_sub1_sub5;
				if (bool) {
					Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = new Class432_Sub1_Sub5_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_167_, bool_176_);
					if (class432_sub1_sub5_sub1.method31(1298368502))
						class432_sub1_sub5_sub1.method25(class_ra, 843961968);
					class432_sub1_sub5 = class432_sub1_sub5_sub1;
				} else
					class432_sub1_sub5 = new Class432_Sub1_Sub5_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_167_, i_168_);
				aClass356_2767.method4180(i_169_, i_174_, i_175_, class432_sub1_sub5, null, 1597220367);
				if (class473.aBoolean5669 && aBoolean2780) {
					if (0 == i_167_)
						class_xa.LA(i_174_, i_175_ + 1, 50);
					else if (1 == i_167_)
						class_xa.LA(1 + i_174_, 1 + i_175_, 50);
					else if (2 == i_167_)
						class_xa.LA(1 + i_174_, i_175_, 50);
					else if (i_167_ == 3)
						class_xa.LA(i_174_, i_175_, 50);
				}
				if (0 != -146884317 * class473.anInt5635 && null != class307)
					class307.method3063(i_174_, i_175_, i, i_167_, class473.aBoolean5636, !class473.aBoolean5668, -385586251);
				return true;
			}
			if (-344921723 * Class476.aClass476_6880.anInt6882 == i) {
				int i_181_ = 1 + i_167_ & 0x3;
				Class432_Sub1_Sub5 class432_sub1_sub5;
				Class432_Sub1_Sub5 class432_sub1_sub5_182_;
				if (bool) {
					Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = new Class432_Sub1_Sub5_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_167_ + 4, bool_176_);
					Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1_183_ = new Class432_Sub1_Sub5_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_181_, bool_176_);
					if (class432_sub1_sub5_sub1.method31(1462264228))
						class432_sub1_sub5_sub1.method25(class_ra, 843961968);
					if (class432_sub1_sub5_sub1_183_.method31(1550195409))
						class432_sub1_sub5_sub1_183_.method25(class_ra, 843961968);
					class432_sub1_sub5 = class432_sub1_sub5_sub1;
					class432_sub1_sub5_182_ = class432_sub1_sub5_sub1_183_;
				} else {
					class432_sub1_sub5 = new Class432_Sub1_Sub5_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, 4 + i_167_, i_168_);
					class432_sub1_sub5_182_ = new Class432_Sub1_Sub5_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_181_, i_168_);
				}
				aClass356_2767.method4180(i_169_, i_174_, i_175_, class432_sub1_sub5, class432_sub1_sub5_182_, 1248257883);
				if ((class473.anInt5641 * 1793271689 == 1 || aBoolean7401 && -1 == class473.anInt5641 * 1793271689) && !aBoolean2777) {
					if (0 == i_167_) {
						aClass356_2767.aClass358_3649.method4216(1, i_169_, i_174_, i_175_, -966857639 * class473.anInt5642, class473.anInt5643 * 1193690113);
						aClass356_2767.aClass358_3649.method4216(2, i_169_, i_174_, 1 + i_175_, class473.anInt5642 * -966857639, class473.anInt5643 * 1193690113);
					} else if (1 == i_167_) {
						aClass356_2767.aClass358_3649.method4216(1, i_169_, 1 + i_174_, i_175_, -966857639 * class473.anInt5642, class473.anInt5643 * 1193690113);
						aClass356_2767.aClass358_3649.method4216(2, i_169_, i_174_, i_175_ + 1, class473.anInt5642 * -966857639, class473.anInt5643 * 1193690113);
					} else if (i_167_ == 2) {
						aClass356_2767.aClass358_3649.method4216(1, i_169_, 1 + i_174_, i_175_, -966857639 * class473.anInt5642, class473.anInt5643 * 1193690113);
						aClass356_2767.aClass358_3649.method4216(2, i_169_, i_174_, i_175_, -966857639 * class473.anInt5642, class473.anInt5643 * 1193690113);
					} else if (i_167_ == 3) {
						aClass356_2767.aClass358_3649.method4216(1, i_169_, i_174_, i_175_, -966857639 * class473.anInt5642, class473.anInt5643 * 1193690113);
						aClass356_2767.aClass358_3649.method4216(2, i_169_, i_174_, i_175_, -966857639 * class473.anInt5642, class473.anInt5643 * 1193690113);
					}
				}
				if (0 != -146884317 * class473.anInt5635 && class307 != null)
					class307.method3063(i_174_, i_175_, i, i_167_, class473.aBoolean5636, !class473.aBoolean5668, -385586251);
				if (64 != class473.anInt5646 * 254744585)
					aClass356_2767.method4184(i_169_, i_174_, i_175_, 254744585 * class473.anInt5646, -2054214909);
				return true;
			}
			if (i == -344921723 * Class476.aClass476_6881.anInt6882) {
				Class432_Sub1_Sub5 class432_sub1_sub5;
				if (bool) {
					Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = new Class432_Sub1_Sub5_Sub1(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_167_, bool_176_);
					if (class432_sub1_sub5_sub1.method31(1781125525))
						class432_sub1_sub5_sub1.method25(class_ra, 843961968);
					class432_sub1_sub5 = class432_sub1_sub5_sub1;
				} else
					class432_sub1_sub5 = new Class432_Sub1_Sub5_Sub2(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i, i_167_, i_168_);
				aClass356_2767.method4180(i_169_, i_174_, i_175_, class432_sub1_sub5, null, 1298228129);
				if (class473.aBoolean5669 && aBoolean2780) {
					if (i_167_ == 0)
						class_xa.LA(i_174_, i_175_ + 1, 50);
					else if (1 == i_167_)
						class_xa.LA(i_174_ + 1, i_175_ + 1, 50);
					else if (i_167_ == 2)
						class_xa.LA(1 + i_174_, i_175_, 50);
					else if (3 == i_167_)
						class_xa.LA(i_174_, i_175_, 50);
				}
				if (-146884317 * class473.anInt5635 != 0 && null != class307)
					class307.method3063(i_174_, i_175_, i, i_167_, class473.aBoolean5636, !class473.aBoolean5668, -385586251);
				return true;
			}
			if (i == -344921723 * Class476.aClass476_6902.anInt6882) {
				Class432_Sub1_Sub1 class432_sub1_sub1;
				if (bool) {
					Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6 = new Class432_Sub1_Sub1_Sub6(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i_174_, i_174_, i_175_, i_175_, i, i_167_, bool_176_);
					if (class432_sub1_sub1_sub6.method31(581989413))
						class432_sub1_sub1_sub6.method25(class_ra, 843961968);
					class432_sub1_sub1 = class432_sub1_sub1_sub6;
				} else
					class432_sub1_sub1 = new Class432_Sub1_Sub1_Sub5(aClass356_2767, class_ra, (((Class274_Sub1) this).aClass463_7407), class473, i_169_, i_170_, i_171_, i_172_, i_173_, aBoolean2777, i_174_, i_174_ + i_177_ - 1, i_175_, i_178_ + i_175_ - 1, i, i_167_, i_168_);
				aClass356_2767.method4145(class432_sub1_sub1, false, 1556130493);
				if (1 == class473.anInt5641 * 1793271689 && !aBoolean2777) {
					int i_184_;
					if (0 == (i_167_ & 0x1))
						i_184_ = 8;
					else
						i_184_ = 16;
					aClass356_2767.aClass358_3649.method4216(i_184_, i_169_, i_174_, i_175_, -966857639 * class473.anInt5642, 0);
				}
				if (0 != class473.anInt5635 * -146884317 && null != class307)
					class307.method3058(i_174_, i_175_, i_177_, i_178_, class473.aBoolean5636, !class473.aBoolean5668, 294543916);
				if (64 != class473.anInt5646 * 254744585)
					aClass356_2767.method4184(i_169_, i_174_, i_175_, 254744585 * class473.anInt5646, -1574216885);
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("abb.ct(").append(')').toString());
		}
	}
}
