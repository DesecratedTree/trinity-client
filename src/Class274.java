/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class274 {
	static int[] anIntArray2764;
	Class418 aClass418_2765;
	boolean aBoolean2766;
	protected Class356 aClass356_2767;
	int[] anIntArray2768;
	public int anInt2769 = 0;
	protected int anInt2770;
	public boolean aBoolean2771;
	public boolean aBoolean2772;
	public boolean aBoolean2773;
	public int anInt2774;
	static int anInt2775 = 0;
	protected int anInt2776;
	public boolean aBoolean2777;
	public boolean aBoolean2778 = false;
	int anInt2779;
	protected boolean aBoolean2780;
	byte[][][] aByteArrayArrayArray2781;
	byte[][][] aByteArrayArrayArray2782;
	static int anInt2783 = 2;
	byte[][][] aByteArrayArrayArray2784;
	protected byte[][][] aByteArrayArrayArray2785;
	int[] anIntArray2786;
	static int[] anIntArray2787 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	static int anInt2788 = 1;
	int[] anIntArray2789;
	int[] anIntArray2790;
	static int anInt2791 = 0;
	static int anInt2792 = 1;
	public int[][][] anIntArrayArrayArray2793;
	static int anInt2794 = 3;
	boolean aBoolean2795;
	static int anInt2796 = 2;
	static int anInt2797 = 4;
	int[] anIntArray2798;
	static int anInt2799 = 16;
	static int anInt2800 = 32;
	static int anInt2801 = 64;
	static int anInt2802 = 128;
	static int anInt2803 = 256;
	static int anInt2804 = 512;
	static boolean[][] aBooleanArrayArray2805;
	static int[] anIntArray2806 = { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
	int[] anIntArray2807;
	static int[] anIntArray2808;
	static int[] anIntArray2809;
	int[] anIntArray2810;
	protected Class281 aClass281_2811;
	static int[] anIntArray2812;
	static boolean[][] aBooleanArrayArray2813;
	int anInt2814;
	static int[][] anIntArrayArray2815;
	static int[][] anIntArrayArray2816;
	int[] anIntArray2817;
	static int[][] anIntArrayArray2818;
	Class499 aClass499_2819;
	static int[][] anIntArrayArray2820;
	static int[][] anIntArrayArray2821;
	static int[][] anIntArrayArray2822;
	static int[] anIntArray2823;
	public byte[][][] aByteArrayArrayArray2824;
	static int[] anIntArray2825 = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	static int[][] anIntArrayArray2826;
	static int[][] anIntArrayArray2827;
	int[] anIntArray2828;
	int[] anIntArray2829;
	int[] anIntArray2830;
	int[] anIntArray2831;
	static boolean[][] aBooleanArrayArray2832;
	int[] anIntArray2833;
	static int anInt2834 = 8;
	int anInt2835;
	int anInt2836;
	int anInt2837;
	static int[][] anIntArrayArray2838;
	int anInt2839;
	int anInt2840;
	int anInt2841;
	boolean aBoolean2842;
	int[] anIntArray2843;
	static int[][] anIntArrayArray2844;
	boolean aBoolean2845;
	int anInt2846;
	static int[][] anIntArrayArray2847;
	static boolean[][] aBooleanArrayArray2848;
	byte[][][] aByteArrayArrayArray2849;
	int[] anIntArray2850;
	int[] anIntArray2851;
	static Class357 aClass357_2852;

	public void method2684(int i) {
		try {
			aBoolean2780 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.r(").append(')').toString());
		}
	}

	public void method2685(int i) {
		try {
			((Class274) this).anIntArray2786 = null;
			((Class274) this).anIntArray2851 = null;
			((Class274) this).anIntArray2807 = null;
			((Class274) this).anIntArray2789 = null;
			((Class274) this).anIntArray2790 = null;
			aBoolean2780 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.j(").append(')').toString());
		}
	}

	public final void method2686(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			for (int i_4_ = 0; i_4_ < -392146777 * anInt2774; i_4_++)
				method2687(i_4_, i, i_0_, i_1_, i_2_, (short) 7350);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.i(").append(')').toString());
		}
	}

	public final void method2687(int i, int i_5_, int i_6_, int i_7_, int i_8_, short i_9_) {
		try {
			for (int i_10_ = i_6_; i_10_ < i_8_ + i_6_; i_10_++) {
				for (int i_11_ = i_5_; i_11_ < i_5_ + i_7_; i_11_++) {
					if (i_11_ >= 0 && i_11_ < -1752239247 * anInt2770 && i_10_ >= 0 && i_10_ < anInt2776 * 1154287061)
						anIntArrayArrayArray2793[i][i_11_][i_10_] = i > 0 ? (anIntArrayArrayArray2793[i - 1][i_11_][i_10_]) - 960 : 0;
				}
			}
			if (i_5_ > 0 && i_5_ < -1752239247 * anInt2770) {
				for (int i_12_ = 1 + i_6_; i_12_ < i_8_ + i_6_; i_12_++) {
					if (i_12_ >= 0 && i_12_ < anInt2776 * 1154287061)
						anIntArrayArrayArray2793[i][i_5_][i_12_] = anIntArrayArrayArray2793[i][i_5_ - 1][i_12_];
				}
			}
			if (i_6_ > 0 && i_6_ < anInt2776 * 1154287061) {
				for (int i_13_ = 1 + i_5_; i_13_ < i_5_ + i_7_; i_13_++) {
					if (i_13_ >= 0 && i_13_ < anInt2770 * -1752239247)
						anIntArrayArrayArray2793[i][i_13_][i_6_] = anIntArrayArrayArray2793[i][i_13_][i_6_ - 1];
				}
			}
			if (i_5_ >= 0 && i_6_ >= 0 && i_5_ < -1752239247 * anInt2770 && i_6_ < 1154287061 * anInt2776) {
				if (0 == i) {
					if (i_5_ > 0 && anIntArrayArrayArray2793[i][i_5_ - 1][i_6_] != 0)
						anIntArrayArrayArray2793[i][i_5_][i_6_] = anIntArrayArrayArray2793[i][i_5_ - 1][i_6_];
					else if (i_6_ > 0 && (anIntArrayArrayArray2793[i][i_5_][i_6_ - 1] != 0))
						anIntArrayArrayArray2793[i][i_5_][i_6_] = anIntArrayArrayArray2793[i][i_5_][i_6_ - 1];
					else if (i_5_ > 0 && i_6_ > 0 && 0 != (anIntArrayArrayArray2793[i][i_5_ - 1][i_6_ - 1]))
						anIntArrayArrayArray2793[i][i_5_][i_6_] = anIntArrayArrayArray2793[i][i_5_ - 1][i_6_ - 1];
				} else if (i_5_ > 0 && (anIntArrayArrayArray2793[i - 1][i_5_ - 1][i_6_] != anIntArrayArrayArray2793[i][i_5_ - 1][i_6_]))
					anIntArrayArrayArray2793[i][i_5_][i_6_] = anIntArrayArrayArray2793[i][i_5_ - 1][i_6_];
				else if (i_6_ > 0 && (anIntArrayArrayArray2793[i - 1][i_5_][i_6_ - 1] != anIntArrayArrayArray2793[i][i_5_][i_6_ - 1]))
					anIntArrayArrayArray2793[i][i_5_][i_6_] = anIntArrayArrayArray2793[i][i_5_][i_6_ - 1];
				else if (i_5_ > 0 && i_6_ > 0 && ((anIntArrayArrayArray2793[i - 1][i_5_ - 1][i_6_ - 1]) != (anIntArrayArrayArray2793[i][i_5_ - 1][i_6_ - 1])))
					anIntArrayArrayArray2793[i][i_5_][i_6_] = anIntArrayArrayArray2793[i][i_5_ - 1][i_6_ - 1];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.p(").append(')').toString());
		}
	}

	public final void method2688(Buffer class330_sub46, int i, int i_14_, int i_15_, int i_16_, Class307[] class307s, byte i_17_) {
		try {
			if (!aBoolean2777) {
				for (int i_18_ = 0; i_18_ < 4; i_18_++) {
					Class307 class307 = class307s[i_18_];
					for (int i_19_ = 0; i_19_ < 64; i_19_++) {
						for (int i_20_ = 0; i_20_ < 64; i_20_++) {
							int i_21_ = i + i_19_;
							int i_22_ = i_14_ + i_20_;
							if (i_21_ >= 0 && i_21_ < anInt2770 * -1752239247 && i_22_ >= 0 && i_22_ < anInt2776 * 1154287061)
								class307.method3064(i_21_, i_22_, -2097533432);
						}
					}
				}
			}
			int i_23_ = i_15_ + i;
			int i_24_ = i_16_ + i_14_;
			for (int i_25_ = 0; i_25_ < -392146777 * anInt2774; i_25_++) {
				for (int i_26_ = 0; i_26_ < 64; i_26_++) {
					for (int i_27_ = 0; i_27_ < 64; i_27_++)
						method2700(class330_sub46, i_25_, i_26_ + i, i_14_ + i_27_, 0, 0, i_26_ + i_23_, i_24_ + i_27_, 0, false, 398818901);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.o(").append(')').toString());
		}
	}

	public final void method2689(Buffer class330_sub46, int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, Class307[] class307s, int i_34_) {
		try {
			int i_35_ = (i_31_ & 0x7) * 8;
			int i_36_ = (i_32_ & 0x7) * 8;
			if (!aBoolean2777) {
				Class307 class307 = class307s[i];
				for (int i_37_ = 0; i_37_ < 8; i_37_++) {
					for (int i_38_ = 0; i_38_ < 8; i_38_++) {
						int i_39_ = (i_28_ + Class142.method1649(i_37_ & 0x7, i_38_ & 0x7, i_33_, -1720556143));
						int i_40_ = (i_29_ + Class100.method1211(i_37_ & 0x7, i_38_ & 0x7, i_33_, (byte) -119));
						if (i_39_ > 0 && i_39_ < -1752239247 * anInt2770 - 1 && i_40_ > 0 && i_40_ < 1154287061 * anInt2776 - 1)
							class307.method3064(i_39_, i_40_, -2058282225);
					}
				}
			}
			int i_41_ = (i_31_ & ~0x7) << 3;
			int i_42_ = (i_32_ & ~0x7) << 3;
			int i_43_ = 0;
			int i_44_ = 0;
			if (1 == i_33_)
				i_44_ = 1;
			else if (2 == i_33_) {
				i_43_ = 1;
				i_44_ = 1;
			} else if (3 == i_33_)
				i_43_ = 1;
			for (int i_45_ = 0; i_45_ < -392146777 * anInt2774; i_45_++) {
				for (int i_46_ = 0; i_46_ < 64; i_46_++) {
					for (int i_47_ = 0; i_47_ < 64; i_47_++) {
						if (i_30_ == i_45_ && i_46_ >= i_35_ && i_46_ <= i_35_ + 8 && i_47_ >= i_36_ && i_47_ <= 8 + i_36_) {
							int i_48_;
							int i_49_;
							if (8 + i_35_ == i_46_ || i_36_ + 8 == i_47_) {
								if (i_33_ == 0) {
									i_48_ = i_28_ + (i_46_ - i_35_);
									i_49_ = i_47_ - i_36_ + i_29_;
								} else if (1 == i_33_) {
									i_48_ = i_47_ - i_36_ + i_28_;
									i_49_ = 8 + i_29_ - (i_46_ - i_35_);
								} else if (2 == i_33_) {
									i_48_ = 8 + i_28_ - (i_46_ - i_35_);
									i_49_ = i_29_ + 8 - (i_47_ - i_36_);
								} else {
									i_48_ = 8 + i_28_ - (i_47_ - i_36_);
									i_49_ = i_46_ - i_35_ + i_29_;
								}
								method2700(class330_sub46, i, i_48_, i_49_, 0, 0, i_46_ + i_41_, i_42_ + i_47_, 0, true, 1857225152);
							} else {
								i_48_ = i_28_ + Class142.method1649(i_46_ & 0x7, i_47_ & 0x7, i_33_, -1637589623);
								i_49_ = i_29_ + Class100.method1211(i_46_ & 0x7, i_47_ & 0x7, i_33_, (byte) -105);
								method2700(class330_sub46, i, i_48_, i_49_, i_43_, i_44_, i_41_ + i_46_, i_42_ + i_47_, i_33_, false, 736128986);
							}
							if (63 == i_46_ || 63 == i_47_) {
								int i_50_ = 1;
								if (63 == i_46_ && 63 == i_47_)
									i_50_ = 3;
								for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
									int i_52_ = i_46_;
									int i_53_ = i_47_;
									if (0 == i_51_) {
										i_52_ = i_46_ == 63 ? 64 : i_46_;
										i_53_ = 63 == i_47_ ? 64 : i_47_;
									} else if (i_51_ == 1)
										i_52_ = 64;
									else if (2 == i_51_)
										i_53_ = 64;
									int i_54_;
									int i_55_;
									if (i_33_ == 0) {
										i_54_ = i_28_ + (i_52_ - i_35_);
										i_55_ = i_29_ + (i_53_ - i_36_);
									} else if (1 == i_33_) {
										i_54_ = i_28_ + (i_53_ - i_36_);
										i_55_ = i_29_ + 8 - (i_52_ - i_35_);
									} else if (2 == i_33_) {
										i_54_ = i_28_ + 8 - (i_52_ - i_35_);
										i_55_ = i_29_ + 8 - (i_53_ - i_36_);
									} else {
										i_54_ = i_28_ + 8 - (i_53_ - i_36_);
										i_55_ = i_29_ + (i_52_ - i_35_);
									}
									if (i_54_ >= 0 && i_54_ < anInt2770 * -1752239247 && i_55_ >= 0 && i_55_ < 1154287061 * anInt2776)
										anIntArrayArrayArray2793[i][i_54_][i_55_] = (anIntArrayArrayArray2793[i][i_48_ + i_43_][i_44_ + i_49_]);
								}
							}
						} else
							method2700(class330_sub46, 0, -1, -1, 0, 0, 0, 0, 0, false, 1851568556);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.s(").append(')').toString());
		}
	}

	public final void method2690(int i, int[][] is, int i_56_) {
		try {
			int[][] is_57_ = anIntArrayArrayArray2793[i];
			for (int i_58_ = 0; i_58_ < -1752239247 * anInt2770 + 1; i_58_++) {
				for (int i_59_ = 0; i_59_ < 1154287061 * anInt2776 + 1; i_59_++)
					is_57_[i_58_][i_59_] += is[i_58_][i_59_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.z(").append(')').toString());
		}
	}

	public void method2691(Class_ra class_ra, int[][][] is, Class307[] class307s, int i) {
		try {
			if (!aBoolean2777) {
				for (int i_60_ = 0; i_60_ < 4; i_60_++) {
					for (int i_61_ = 0; i_61_ < -1752239247 * anInt2770; i_61_++) {
						for (int i_62_ = 0; i_62_ < 1154287061 * anInt2776; i_62_++) {
							if (((aClass281_2811.aByteArrayArrayArray2916[i_60_][i_61_][i_62_]) & 0x1) != 0) {
								int i_63_ = i_60_;
								if (((aClass281_2811.aByteArrayArrayArray2916[1][i_61_][i_62_]) & 0x2) != 0)
									i_63_--;
								if (i_63_ >= 0)
									class307s[i_63_].method3059(i_61_, i_62_, -2097498208);
							}
						}
					}
				}
			}
			for (int i_64_ = 0; i_64_ < anInt2774 * -392146777; i_64_++) {
				int i_65_ = 0;
				int i_66_ = 0;
				if (!aBoolean2777) {
					if (aBoolean2778)
						i_66_ |= 0x8;
					if (aBoolean2771)
						i_65_ |= 0x2;
					if (anInt2769 * -1360791857 != 0) {
						i_65_ |= 0x1;
						i_66_ |= 0x10;
					}
				}
				if (aBoolean2771)
					i_66_ |= 0x7;
				if (!aBoolean2773)
					i_66_ |= 0x20;
				int[][] is_67_ = (is != null && i_64_ < is.length ? is[i_64_] : anIntArrayArrayArray2793[i_64_]);
				aClass356_2767.method4174(i_64_, class_ra.cn(anInt2770 * -1752239247, anInt2776 * 1154287061, (anIntArrayArrayArray2793[i_64_]), is_67_, 512, i_65_, i_66_), (byte) -47);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.w(").append(')').toString());
		}
	}

	public final void method2692(Class_ra class_ra, Class_xa class_xa, Class_xa class_xa_68_, int i) {
		try {
			int[][] is = new int[anInt2770 * -1752239247][anInt2776 * 1154287061];
			if (null == ((Class274) this).anIntArray2786 || (1154287061 * anInt2776 != ((Class274) this).anIntArray2786.length)) {
				((Class274) this).anIntArray2786 = new int[anInt2776 * 1154287061];
				((Class274) this).anIntArray2851 = new int[anInt2776 * 1154287061];
				((Class274) this).anIntArray2807 = new int[1154287061 * anInt2776];
				((Class274) this).anIntArray2789 = new int[anInt2776 * 1154287061];
				((Class274) this).anIntArray2790 = new int[1154287061 * anInt2776];
			}
			for (int i_69_ = 0; i_69_ < -392146777 * anInt2774; i_69_++) {
				for (int i_70_ = 0; i_70_ < anInt2776 * 1154287061; i_70_++) {
					((Class274) this).anIntArray2786[i_70_] = 0;
					((Class274) this).anIntArray2851[i_70_] = 0;
					((Class274) this).anIntArray2807[i_70_] = 0;
					((Class274) this).anIntArray2789[i_70_] = 0;
					((Class274) this).anIntArray2790[i_70_] = 0;
				}
				for (int i_71_ = -5; i_71_ < anInt2770 * -1752239247; i_71_++) {
					for (int i_72_ = 0; i_72_ < 1154287061 * anInt2776; i_72_++) {
						int i_73_ = 5 + i_71_;
						if (i_73_ < -1752239247 * anInt2770) {
							int i_74_ = ((((Class274) this).aByteArrayArrayArray2849[i_69_][i_73_][i_72_]) & 0xff);
							if (i_74_ > 0) {
								Class491 class491 = ((Class274) this).aClass499_2819.method6111(i_74_ - 1, 763082869);
								((Class274) this).anIntArray2786[i_72_] += 373696947 * class491.anInt5855;
								((Class274) this).anIntArray2851[i_72_] += class491.anInt5861 * -1366776891;
								((Class274) this).anIntArray2807[i_72_] += -2143339753 * class491.anInt5862;
								((Class274) this).anIntArray2789[i_72_] += -201962627 * class491.anInt5863;
								((Class274) this).anIntArray2790[i_72_]++;
							}
						}
						int i_75_ = i_71_ - 5;
						if (i_75_ >= 0) {
							int i_76_ = ((((Class274) this).aByteArrayArrayArray2849[i_69_][i_75_][i_72_]) & 0xff);
							if (i_76_ > 0) {
								Class491 class491 = ((Class274) this).aClass499_2819.method6111(i_76_ - 1, -1265067711);
								((Class274) this).anIntArray2786[i_72_] -= class491.anInt5855 * 373696947;
								((Class274) this).anIntArray2851[i_72_] -= class491.anInt5861 * -1366776891;
								((Class274) this).anIntArray2807[i_72_] -= -2143339753 * class491.anInt5862;
								((Class274) this).anIntArray2789[i_72_] -= class491.anInt5863 * -201962627;
								((Class274) this).anIntArray2790[i_72_]--;
							}
						}
					}
					if (i_71_ >= 0) {
						int i_77_ = 0;
						int i_78_ = 0;
						int i_79_ = 0;
						int i_80_ = 0;
						int i_81_ = 0;
						for (int i_82_ = -5; i_82_ < 1154287061 * anInt2776; i_82_++) {
							int i_83_ = i_82_ + 5;
							if (i_83_ < 1154287061 * anInt2776) {
								i_77_ += ((Class274) this).anIntArray2786[i_83_];
								i_78_ += ((Class274) this).anIntArray2851[i_83_];
								i_79_ += ((Class274) this).anIntArray2807[i_83_];
								i_80_ += ((Class274) this).anIntArray2789[i_83_];
								i_81_ += ((Class274) this).anIntArray2790[i_83_];
							}
							int i_84_ = i_82_ - 5;
							if (i_84_ >= 0) {
								i_77_ -= ((Class274) this).anIntArray2786[i_84_];
								i_78_ -= ((Class274) this).anIntArray2851[i_84_];
								i_79_ -= ((Class274) this).anIntArray2807[i_84_];
								i_80_ -= ((Class274) this).anIntArray2789[i_84_];
								i_81_ -= ((Class274) this).anIntArray2790[i_84_];
							}
							if (i_82_ >= 0 && i_80_ > 0 && i_81_ > 0)
								is[i_71_][i_82_] = Class230.method2338(i_77_ * 256 / i_80_, i_78_ / i_81_, i_79_ / i_81_, 706521325);
						}
					}
				}
				if (aBoolean2772)
					method2694(class_ra, aClass356_2767.aClass_xaArray3676[i_69_], i_69_, is, i_69_ == 0 ? class_xa : null, i_69_ == 0 ? class_xa_68_ : null, 1293422102);
				else
					method2693(class_ra, aClass356_2767.aClass_xaArray3676[i_69_], i_69_, is, i_69_ == 0 ? class_xa : null, i_69_ == 0 ? class_xa_68_ : null, (byte) 3);
				((Class274) this).aByteArrayArrayArray2849[i_69_] = null;
				((Class274) this).aByteArrayArrayArray2784[i_69_] = null;
				((Class274) this).aByteArrayArrayArray2781[i_69_] = null;
				((Class274) this).aByteArrayArrayArray2782[i_69_] = null;
			}
			if (!aBoolean2777) {
				if (0 != anInt2769 * -1360791857)
					aClass356_2767.method4176((byte) -15);
				if (aBoolean2771)
					aClass356_2767.method4169(2019842103);
			}
			for (int i_85_ = 0; i_85_ < anInt2774 * -392146777; i_85_++)
				aClass356_2767.aClass_xaArray3676[i_85_].SA();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.n(").append(')').toString());
		}
	}

	void method2693(Class_ra class_ra, Class_xa class_xa, int i, int[][] is, Class_xa class_xa_86_, Class_xa class_xa_87_, byte i_88_) {
		try {
			for (int i_89_ = 0; i_89_ < anInt2770 * -1752239247; i_89_++) {
				for (int i_90_ = 0; i_90_ < 1154287061 * anInt2776; i_90_++) {
					byte i_91_ = (((Class274) this).aByteArrayArrayArray2781[i][i_89_][i_90_]);
					byte i_92_ = (((Class274) this).aByteArrayArrayArray2782[i][i_89_][i_90_]);
					int i_93_ = ((((Class274) this).aByteArrayArrayArray2784[i][i_89_][i_90_]) & 0xff);
					int i_94_ = ((((Class274) this).aByteArrayArrayArray2849[i][i_89_][i_90_]) & 0xff);
					Class425 class425 = (i_93_ != 0 ? ((Class274) this).aClass418_2765.method5271(i_93_ - 1, -979208929) : null);
					Class491 class491 = (0 != i_94_ ? ((Class274) this).aClass499_2819.method6111(i_94_ - 1, 85044826) : null);
					if (i_91_ == 0 && class425 == null)
						i_91_ = (byte) 12;
					Class425 class425_95_ = class425;
					if (null != class425 && -1 == -865055911 * class425.anInt4330 && -1 == class425.anInt4340 * 2023656477) {
						class425_95_ = class425;
						class425 = null;
					}
					if (class425 == null && class491 == null) {
						if (i_88_ != 3)
							throw new IllegalStateException();
					} else {
						((Class274) this).anInt2846 = 1188715823 * anIntArray2806[i_91_];
						((Class274) this).anInt2835 = anIntArray2787[i_91_] * -574992129;
						int i_96_ = ((null != class491 ? ((Class274) this).anInt2846 * 5769679 : 0) + (null != class425 ? 1671737087 * ((Class274) this).anInt2835 : 0));
						int i_97_ = 0;
						((Class274) this).anInt2836 = 0;
						((Class274) this).anInt2839 = -288716387 * (class425 != null ? class425.anInt4331 * -946700571 : -1);
						int i_98_ = (class491 != null ? 883877799 * class491.anInt5856 : -1);
						int[] is_99_ = new int[i_96_];
						int[] is_100_ = new int[i_96_];
						int[] is_101_ = new int[i_96_];
						int[] is_102_ = new int[i_96_];
						int[] is_103_ = new int[i_96_];
						int[] is_104_ = new int[i_96_];
						int[] is_105_ = ((null != class425 && -1 != class425.anInt4340 * 2023656477) ? new int[i_96_] : null);
						if (class425 != null) {
							for (int i_106_ = 0; (i_106_ < 1671737087 * ((Class274) this).anInt2835); i_106_++) {
								is_99_[i_97_] = (anIntArrayArray2815[i_91_][(((Class274) this).anInt2836 * -863950871)]);
								is_100_[i_97_] = (anIntArrayArray2816[i_91_][(-863950871 * ((Class274) this).anInt2836)]);
								is_101_[i_97_] = (anIntArrayArray2818[i_91_][(((Class274) this).anInt2836 * -863950871)]);
								is_103_[i_97_] = 1586185397 * ((Class274) this).anInt2839;
								is_104_[i_97_] = class425.anInt4334 * -1121418561;
								is_102_[i_97_] = -865055911 * class425.anInt4330;
								if (null != is_105_)
									is_105_[i_97_] = 2023656477 * class425.anInt4340;
								i_97_++;
								((Class274) this).anInt2836 += -71557031;
							}
							if (!aBoolean2777 && i == 0)
								aClass356_2767.method4141(i_89_, i_90_, -1452552863 * class425.anInt4336, 471103400 * class425.anInt4339, class425.anInt4338 * -1032037181, -506973775 * class425.anInt4327, class425.anInt4342 * -927139259, class425.anInt4343 * -1022951757, -1191360068);
						} else
							((Class274) this).anInt2836 += -1033587033 * ((Class274) this).anInt2835;
						if (class491 != null) {
							for (int i_107_ = 0; (i_107_ < ((Class274) this).anInt2846 * 5769679); i_107_++) {
								is_99_[i_97_] = (anIntArrayArray2815[i_91_][(-863950871 * ((Class274) this).anInt2836)]);
								is_100_[i_97_] = (anIntArrayArray2816[i_91_][(((Class274) this).anInt2836 * -863950871)]);
								is_101_[i_97_] = (anIntArrayArray2818[i_91_][(((Class274) this).anInt2836 * -863950871)]);
								is_103_[i_97_] = i_98_;
								is_104_[i_97_] = 1529883341 * class491.anInt5857;
								is_102_[i_97_] = is[i_89_][i_90_];
								if (null != is_105_)
									is_105_[i_97_] = is_102_[i_97_];
								i_97_++;
								((Class274) this).anInt2836 += -71557031;
							}
						}
						int i_108_ = anIntArray2812.length;
						int[] is_109_ = new int[i_108_];
						int[] is_110_ = new int[i_108_];
						int[] is_111_ = null != class_xa_87_ ? new int[i_108_] : null;
						int[] is_112_ = (null != class_xa_87_ || class_xa_86_ != null ? new int[i_108_] : null);
						for (int i_113_ = 0; i_113_ < i_108_; i_113_++) {
							int i_114_ = anIntArray2812[i_113_];
							int i_115_ = anIntArray2823[i_113_];
							if (0 == i_92_) {
								is_109_[i_113_] = i_114_;
								is_110_[i_113_] = i_115_;
							} else if (1 == i_92_) {
								int i_116_ = i_114_;
								is_109_[i_113_] = i_115_;
								is_110_[i_113_] = 512 - i_116_;
							} else if (2 == i_92_) {
								is_109_[i_113_] = 512 - i_114_;
								is_110_[i_113_] = 512 - i_115_;
							} else if (3 == i_92_) {
								int i_117_ = i_114_;
								is_109_[i_113_] = 512 - i_115_;
								is_110_[i_113_] = i_117_;
							}
							if (is_111_ != null && aBooleanArrayArray2813[i_91_][i_113_]) {
								int i_118_ = is_109_[i_113_] + (i_89_ << 9);
								int i_119_ = (i_90_ << 9) + is_110_[i_113_];
								is_111_[i_113_] = (class_xa_87_.method6416(i_118_, i_119_, -1741309040) - class_xa.method6416(i_118_, i_119_, -630716431));
							}
							if (null != is_112_) {
								if (class_xa_87_ != null && !(aBooleanArrayArray2813[i_91_][i_113_])) {
									int i_120_ = (i_89_ << 9) + is_109_[i_113_];
									int i_121_ = (i_90_ << 9) + is_110_[i_113_];
									is_112_[i_113_] = (class_xa.method6416(i_120_, i_121_, -790639871) - (class_xa_87_.method6416(i_120_, i_121_, 833112737)));
								} else if (null != class_xa_86_ && !(aBooleanArrayArray2805[i_91_][i_113_])) {
									int i_122_ = is_109_[i_113_] + (i_89_ << 9);
									int i_123_ = is_110_[i_113_] + (i_90_ << 9);
									is_112_[i_113_] = (class_xa_86_.method6416(i_122_, i_123_, 1172484870) - class_xa.method6416(i_122_, i_123_, -504824189));
								}
							}
						}
						int i_124_ = class_xa.method6417(i_89_, i_90_, 680996032);
						int i_125_ = class_xa.method6417(i_89_ + 1, i_90_, -334311535);
						int i_126_ = class_xa.method6417(1 + i_89_, 1 + i_90_, -961690867);
						int i_127_ = class_xa.method6417(i_89_, i_90_ + 1, -944018418);
						boolean bool = aClass281_2811.method2788(i_89_, i_90_, (byte) -20);
						if (bool && i > 1 || !bool && i > 0) {
							boolean bool_128_ = true;
							if (null != class491 && !class491.aBoolean5859)
								bool_128_ = false;
							else if (i_94_ == 0 && i_91_ != 0)
								bool_128_ = false;
							else if (i_93_ > 0 && null != class425_95_ && !class425_95_.aBoolean4332)
								bool_128_ = false;
							if (bool_128_ && i_125_ == i_124_ && i_124_ == i_126_ && i_127_ == i_124_)
								aByteArrayArrayArray2785[i][i_89_][i_90_] |= 0x4;
						}
						Class77 class77 = new Class77();
						if (aBoolean2777) {
							class77.anInt652 = (aClass356_2767.method4138(i_89_, i_90_, 473714740) * -1037349593);
							class77.anInt650 = (aClass356_2767.method4157(i_89_, i_90_, 1660062816) * -2010008277);
							class77.anInt651 = (aClass356_2767.method4183(i_89_, i_90_, 1622515706) * -533215263);
							class77.anInt653 = (aClass356_2767.method4139(i_89_, i_90_, (byte) 1) * -1441052161);
							class77.anInt654 = (aClass356_2767.method4140(i_89_, i_90_, -2076184624) * -1973971575);
							class77.anInt655 = (aClass356_2767.method4179(i_89_, i_90_, (byte) 0) * 414539137);
						}
						class_xa.method6413(i_89_, i_90_, is_109_, is_111_, is_110_, is_112_, is_99_, is_100_, is_101_, is_102_, is_105_, is_103_, is_104_, class77, false);
						aClass356_2767.method4137(i, i_89_, i_90_, (byte) -12);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.l(").append(')').toString());
		}
	}

	void method2694(Class_ra class_ra, Class_xa class_xa, int i, int[][] is, Class_xa class_xa_129_, Class_xa class_xa_130_, int i_131_) {
		try {
			byte[][] is_132_ = ((Class274) this).aByteArrayArrayArray2781[i];
			byte[][] is_133_ = ((Class274) this).aByteArrayArrayArray2782[i];
			byte[][] is_134_ = ((Class274) this).aByteArrayArrayArray2849[i];
			byte[][] is_135_ = ((Class274) this).aByteArrayArrayArray2784[i];
			boolean[] bools = new boolean[4];
			for (int i_136_ = 0; i_136_ < -1752239247 * anInt2770; i_136_++) {
				int i_137_ = (i_136_ < -1752239247 * anInt2770 - 1 ? i_136_ + 1 : i_136_);
				for (int i_138_ = 0; i_138_ < 1154287061 * anInt2776; i_138_++) {
					int i_139_ = (i_138_ < 1154287061 * anInt2776 - 1 ? i_138_ + 1 : i_138_);
					((Class274) this).anInt2779 = 871311181 * is_132_[i_136_][i_138_];
					((Class274) this).anInt2836 = -71557031 * is_133_[i_136_][i_138_];
					int i_140_ = is_135_[i_136_][i_138_] & 0xff;
					int i_141_ = is_134_[i_136_][i_138_] & 0xff;
					if (i_140_ == 0 && 0 == i_141_) {
						if (i_131_ <= -346504561) {
							/* empty */
						}
					} else {
						Class425 class425 = (0 != i_140_ ? ((Class274) this).aClass418_2765.method5271(i_140_ - 1, -1742654407) : null);
						Class491 class491 = (i_141_ != 0 ? ((Class274) this).aClass499_2819.method6111(i_141_ - 1, 392260597) : null);
						if (-416650875 * ((Class274) this).anInt2779 == 0 && null == class425)
							((Class274) this).anInt2779 = 1865799580;
						((Class274) this).aBoolean2842 = false;
						((Class274) this).aBoolean2795 = false;
						boolean[] bools_142_ = bools;
						boolean[] bools_143_ = bools;
						boolean[] bools_144_ = bools;
						bools[3] = false;
						bools_144_[2] = false;
						bools_143_[1] = false;
						bools_142_[0] = false;
						Class425 class425_145_ = class425;
						if (class425 != null) {
							if (-865055911 * class425.anInt4330 == -1 && -1 == class425.anInt4340 * 2023656477) {
								class425_145_ = class425;
								class425 = null;
							} else if (class491 != null && 0 != (((Class274) this).anInt2779 * -416650875))
								((Class274) this).aBoolean2795 = class425.aBoolean4337;
						}
						((Class274) this).anInt2836 = method2699(i_141_, i_136_, i_138_, i_137_, i_139_, class_xa, is_134_, 1824730125) * -71557031;
						for (int i_146_ = 0; i_146_ < 13; i_146_++) {
							((Class274) this).anIntArray2833[i_146_] = -1;
							((Class274) this).anIntArray2810[i_146_] = 1;
						}
						method2701(class_ra, class425, class491, i_136_, i_138_, is_132_, is_133_, is_135_, bools, -301347162);
						((Class274) this).aBoolean2766 = (!((Class274) this).aBoolean2795 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
						method2695(class425, class491, 409648502);
						int i_147_ = (((Class274) this).anInt2835 * 1671737087 + ((Class274) this).anInt2846 * 5769679);
						if (i_147_ <= 0)
							aClass356_2767.method4137(i, i_136_, i_138_, (byte) -63);
						else {
							if (bools[0])
								i_147_++;
							if (bools[2])
								i_147_++;
							if (bools[1])
								i_147_++;
							if (bools[3])
								i_147_++;
							((Class274) this).anInt2837 = 0;
							((Class274) this).anInt2814 = 0;
							int i_148_ = 3 * i_147_;
							int[] is_149_ = (((Class274) this).aBoolean2845 ? new int[i_148_] : null);
							int[] is_150_ = new int[i_148_];
							int[] is_151_ = new int[i_148_];
							int[] is_152_ = new int[i_148_];
							int[] is_153_ = new int[i_148_];
							int[] is_154_ = new int[i_148_];
							int[] is_155_ = (class_xa_130_ != null ? new int[i_148_] : null);
							int[] is_156_ = ((class_xa_130_ != null || class_xa_129_ != null) ? new int[i_148_] : null);
							method2696(class_ra, i, i_136_, i_138_, class425, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, class_xa, class_xa_130_, class_xa_129_, 1892465296);
							int i_157_ = is_134_[i_136_][i_139_] & 0xff;
							int i_158_ = is_134_[i_137_][i_139_] & 0xff;
							int i_159_ = is_134_[i_137_][i_138_] & 0xff;
							method2697(class_ra, i, i_136_, i_138_, i_137_, i_139_, class491, i_141_, i_157_, i_158_, i_159_, bools, is_149_, is_150_, is_151_, is_152_, is_153_, is_154_, is_155_, is_156_, is, class_xa, class_xa_130_, class_xa_129_, 254432524);
							method2702(class_xa, class491, class425_145_, i, i_136_, i_138_, i_137_, i_139_, i_141_, i_140_, (byte) 41);
							Class77 class77 = new Class77();
							if (aBoolean2777) {
								class77.anInt652 = (aClass356_2767.method4138(i_136_, i_138_, 1993501343) * -1037349593);
								class77.anInt650 = (aClass356_2767.method4157(i_136_, i_138_, -147964416) * -2010008277);
								class77.anInt651 = (aClass356_2767.method4183(i_136_, i_138_, 1622515706) * -533215263);
								class77.anInt653 = (aClass356_2767.method4139(i_136_, i_138_, (byte) 1) * -1441052161);
								class77.anInt654 = (aClass356_2767.method4140(i_136_, i_138_, -2060348423) * -1973971575);
								class77.anInt655 = (aClass356_2767.method4179(i_136_, i_138_, (byte) 0) * 414539137);
							}
							class_xa.method6425(i_136_, i_138_, is_150_, is_155_, is_151_, is_156_, is_152_, is_149_, is_153_, is_154_, class77, (((Class274) this).aBoolean2842));
							aClass356_2767.method4137(i, i_136_, i_138_, (byte) -118);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.b(").append(')').toString());
		}
	}

	void method2695(Class425 class425, Class491 class491, int i) {
		try {
			if (((Class274) this).aBoolean2766) {
				((Class274) this).anIntArray2768 = (anIntArrayArray2815[((Class274) this).anInt2779 * -416650875]);
				((Class274) this).anIntArray2817 = (anIntArrayArray2816[((Class274) this).anInt2779 * -416650875]);
				((Class274) this).anIntArray2850 = (anIntArrayArray2818[-416650875 * ((Class274) this).anInt2779]);
				((Class274) this).anInt2835 = -574992129 * (class425 != null ? anIntArray2787[(((Class274) this).anInt2779) * -416650875] : 0);
				((Class274) this).anInt2846 = 1188715823 * (null != class491 ? anIntArray2806[(((Class274) this).anInt2779) * -416650875] : 0);
			} else if (((Class274) this).aBoolean2795) {
				((Class274) this).anIntArray2768 = (anIntArrayArray2847[-416650875 * ((Class274) this).anInt2779]);
				((Class274) this).anIntArray2817 = (anIntArrayArray2838[((Class274) this).anInt2779 * -416650875]);
				((Class274) this).anIntArray2850 = (anIntArrayArray2827[-416650875 * ((Class274) this).anInt2779]);
				((Class274) this).anInt2835 = (null != class425 ? (anIntArray2809[((Class274) this).anInt2779 * -416650875]) : 0) * -574992129;
				((Class274) this).anInt2846 = (null != class491 ? (anIntArray2764[-416650875 * ((Class274) this).anInt2779]) : 0) * 1188715823;
				((Class274) this).anIntArray2843 = (anIntArrayArray2844[-416650875 * ((Class274) this).anInt2779]);
			} else {
				((Class274) this).anIntArray2768 = (anIntArrayArray2820[((Class274) this).anInt2779 * -416650875]);
				((Class274) this).anIntArray2817 = (anIntArrayArray2821[-416650875 * ((Class274) this).anInt2779]);
				((Class274) this).anIntArray2850 = (anIntArrayArray2822[((Class274) this).anInt2779 * -416650875]);
				((Class274) this).anInt2835 = (class425 != null ? (anIntArray2825[-416650875 * ((Class274) this).anInt2779]) : 0) * -574992129;
				((Class274) this).anInt2846 = (1188715823 * (null != class491 ? (anIntArray2808[-416650875 * ((Class274) this).anInt2779]) : 0));
				((Class274) this).anIntArray2843 = (anIntArrayArray2826[((Class274) this).anInt2779 * -416650875]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.u(").append(')').toString());
		}
	}

	void method2696(Class_ra class_ra, int i, int i_160_, int i_161_, Class425 class425, boolean[] bools, int[] is, int[] is_162_, int[] is_163_, int[] is_164_, int[] is_165_, int[] is_166_, int[] is_167_, int[] is_168_, Class_xa class_xa, Class_xa class_xa_169_, Class_xa class_xa_170_, int i_171_) {
		try {
			((Class274) this).anInt2841 = -1520628991;
			((Class274) this).anInt2839 = 288716387;
			((Class274) this).anInt2840 = 751772416;
			if (class425 != null) {
				((Class274) this).anInt2841 = -1543642713 * class425.anInt4330;
				((Class274) this).anInt2839 = -781033615 * class425.anInt4331;
				((Class274) this).anInt2840 = class425.anInt4334 * -1894362851;
				int i_172_ = Class243.method2408(class_ra, class425, -1845939325);
				for (int i_173_ = 0; i_173_ < ((Class274) this).anInt2835 * 1671737087; i_173_++) {
					boolean bool = false;
					int i_174_;
					if ((bools[0 - ((Class274) this).anInt2836 * -863950871 & 0x3]) && (((Class274) this).anIntArray2843[0] == 1524032579 * ((Class274) this).anInt2837)) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[1] = 1;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[3] = 1;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						i_174_ = 6;
					} else if (bools[2 - (-863950871 * ((Class274) this).anInt2836) & 0x3] && (1524032579 * ((Class274) this).anInt2837 == ((Class274) this).anIntArray2843[2])) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[1] = 5;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[3] = 5;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						i_174_ = 6;
					} else if (bools[1 - (-863950871 * ((Class274) this).anInt2836) & 0x3] && (1524032579 * ((Class274) this).anInt2837 == ((Class274) this).anIntArray2843[1])) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[1] = 3;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[3] = 3;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						i_174_ = 6;
					} else if (bools[3 - (-863950871 * ((Class274) this).anInt2836) & 0x3] && (((Class274) this).anIntArray2843[3] == (1524032579 * ((Class274) this).anInt2837))) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[1] = 7;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[3] = 7;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						i_174_ = 6;
					} else {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[1] = (((Class274) this).anIntArray2817[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						i_174_ = 3;
					}
					for (int i_175_ = 0; i_175_ < i_174_; i_175_++) {
						int i_176_ = ((Class274) this).anIntArray2828[i_175_];
						int i_177_ = (i_176_ - (-1727901742 * ((Class274) this).anInt2836) & 0x7);
						int i_178_ = anIntArray2812[i_176_];
						int i_179_ = anIntArray2823[i_176_];
						int i_180_;
						int i_181_;
						if (((Class274) this).anInt2836 * -863950871 == 1) {
							i_180_ = i_179_;
							i_181_ = 512 - i_178_;
						} else if (2 == (((Class274) this).anInt2836 * -863950871)) {
							i_180_ = 512 - i_178_;
							i_181_ = 512 - i_179_;
						} else if (-863950871 * ((Class274) this).anInt2836 == 3) {
							i_180_ = 512 - i_179_;
							i_181_ = i_178_;
						} else {
							i_180_ = i_178_;
							i_181_ = i_179_;
						}
						is_162_[((Class274) this).anInt2814 * 1932695231] = i_180_;
						is_163_[1932695231 * ((Class274) this).anInt2814] = i_181_;
						if (is_167_ != null && (aBooleanArrayArray2813[-416650875 * ((Class274) this).anInt2779][i_176_])) {
							int i_182_ = i_180_ + (i_160_ << 9);
							int i_183_ = (i_161_ << 9) + i_181_;
							is_167_[((Class274) this).anInt2814 * 1932695231] = (class_xa_169_.method6416(i_182_, i_183_, 1843190726) - class_xa.method6416(i_182_, i_183_, -571311704));
						}
						if (is_168_ != null) {
							if (null != class_xa_169_ && !(aBooleanArrayArray2813[-416650875 * ((Class274) this).anInt2779][i_176_])) {
								int i_184_ = (i_160_ << 9) + i_180_;
								int i_185_ = i_181_ + (i_161_ << 9);
								is_168_[(1932695231 * ((Class274) this).anInt2814)] = (class_xa.method6416(i_184_, i_185_, 2101626033) - (class_xa_169_.method6416(i_184_, i_185_, -1614622864)));
							} else if (null != class_xa_170_ && !(aBooleanArrayArray2805[(((Class274) this).anInt2779 * -416650875)][i_176_])) {
								int i_186_ = (i_160_ << 9) + i_180_;
								int i_187_ = (i_161_ << 9) + i_181_;
								is_168_[(((Class274) this).anInt2814 * 1932695231)] = (class_xa_170_.method6416(i_186_, i_187_, 1474204618) - class_xa.method6416(i_186_, i_187_, -513460137));
							}
						}
						if (i_176_ < 8 && (((Class274) this).anIntArray2833[i_177_] > class425.anInt4341 * -1522729271)) {
							if (is != null)
								is[((Class274) this).anInt2814 * 1932695231] = ((Class274) this).anIntArray2830[i_177_];
							is_166_[1932695231 * ((Class274) this).anInt2814] = ((Class274) this).anIntArray2798[i_177_];
							is_165_[((Class274) this).anInt2814 * 1932695231] = ((Class274) this).anIntArray2831[i_177_];
							is_164_[((Class274) this).anInt2814 * 1932695231] = ((Class274) this).anIntArray2829[i_177_];
						} else {
							if (null != is)
								is[((Class274) this).anInt2814 * 1932695231] = i_172_;
							is_165_[((Class274) this).anInt2814 * 1932695231] = class425.anInt4331 * -946700571;
							is_166_[((Class274) this).anInt2814 * 1932695231] = -1121418561 * class425.anInt4334;
							is_164_[((Class274) this).anInt2814 * 1932695231] = -639366401 * ((Class274) this).anInt2841;
						}
						((Class274) this).anInt2814 += 1769724223;
					}
					((Class274) this).anInt2837 += 70879339;
				}
				if (!aBoolean2777 && i == 0)
					aClass356_2767.method4141(i_160_, i_161_, class425.anInt4336 * -1452552863, 471103400 * class425.anInt4339, -1032037181 * class425.anInt4338, -506973775 * class425.anInt4327, -927139259 * class425.anInt4342, -1022951757 * class425.anInt4343, -155734822);
				if (((Class274) this).anInt2779 * -416650875 != 12 && -1 != class425.anInt4330 * -865055911 && class425.aBoolean4335)
					((Class274) this).aBoolean2842 = true;
			} else if (((Class274) this).aBoolean2766)
				((Class274) this).anInt2837 += 70879339 * (anIntArray2787[((Class274) this).anInt2779 * -416650875]);
			else if (((Class274) this).aBoolean2795)
				((Class274) this).anInt2837 += (anIntArray2809[-416650875 * ((Class274) this).anInt2779]) * 70879339;
			else
				((Class274) this).anInt2837 += (anIntArray2825[((Class274) this).anInt2779 * -416650875]) * 70879339;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.x(").append(')').toString());
		}
	}

	void method2697(Class_ra class_ra, int i, int i_188_, int i_189_, int i_190_, int i_191_, Class491 class491, int i_192_, int i_193_, int i_194_, int i_195_, boolean[] bools, int[] is, int[] is_196_, int[] is_197_, int[] is_198_, int[] is_199_, int[] is_200_, int[] is_201_, int[] is_202_, int[][] is_203_, Class_xa class_xa, Class_xa class_xa_204_, Class_xa class_xa_205_, int i_206_) {
		try {
			if (class491 != null) {
				if (i_193_ == 0)
					i_193_ = i_192_;
				if (0 == i_194_)
					i_194_ = i_192_;
				if (0 == i_195_)
					i_195_ = i_192_;
				Class491 class491_207_ = ((Class274) this).aClass499_2819.method6111(i_192_ - 1, 1243764314);
				Class491 class491_208_ = ((Class274) this).aClass499_2819.method6111(i_193_ - 1, 1383347721);
				Class491 class491_209_ = ((Class274) this).aClass499_2819.method6111(i_194_ - 1, -759688870);
				Class491 class491_210_ = ((Class274) this).aClass499_2819.method6111(i_195_ - 1, 706325163);
				for (int i_211_ = 0; i_211_ < 5769679 * ((Class274) this).anInt2846; i_211_++) {
					boolean bool = false;
					int i_212_;
					if ((bools[0 - ((Class274) this).anInt2836 * -863950871 & 0x3]) && (((Class274) this).anIntArray2843[0] == 1524032579 * ((Class274) this).anInt2837)) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[1] = 1;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[3] = 1;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						i_212_ = 6;
					} else if (bools[2 - (((Class274) this).anInt2836 * -863950871) & 0x3] && (((Class274) this).anIntArray2843[2] == (1524032579 * ((Class274) this).anInt2837))) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[1] = 5;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[3] = 5;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						i_212_ = 6;
					} else if (bools[1 - (-863950871 * ((Class274) this).anInt2836) & 0x3] && (((Class274) this).anIntArray2843[1] == (((Class274) this).anInt2837 * 1524032579))) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[1] = 3;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[3] = 3;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						i_212_ = 6;
					} else if (bools[3 - (-863950871 * ((Class274) this).anInt2836) & 0x3] && (((Class274) this).anIntArray2843[3] == (1524032579 * ((Class274) this).anInt2837))) {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[1] = 7;
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[3] = 7;
						((Class274) this).anIntArray2828[4] = (((Class274) this).anIntArray2817[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[5] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						i_212_ = 6;
					} else {
						((Class274) this).anIntArray2828[0] = (((Class274) this).anIntArray2768[1524032579 * ((Class274) this).anInt2837]);
						((Class274) this).anIntArray2828[1] = (((Class274) this).anIntArray2817[((Class274) this).anInt2837 * 1524032579]);
						((Class274) this).anIntArray2828[2] = (((Class274) this).anIntArray2850[((Class274) this).anInt2837 * 1524032579]);
						i_212_ = 3;
					}
					for (int i_213_ = 0; i_213_ < i_212_; i_213_++) {
						int i_214_ = ((Class274) this).anIntArray2828[i_213_];
						int i_215_ = (i_214_ - (-1727901742 * ((Class274) this).anInt2836) & 0x7);
						int i_216_ = anIntArray2812[i_214_];
						int i_217_ = anIntArray2823[i_214_];
						int i_218_;
						int i_219_;
						if (((Class274) this).anInt2836 * -863950871 == 1) {
							i_218_ = i_217_;
							i_219_ = 512 - i_216_;
						} else if (-863950871 * ((Class274) this).anInt2836 == 2) {
							i_218_ = 512 - i_216_;
							i_219_ = 512 - i_217_;
						} else if (-863950871 * ((Class274) this).anInt2836 == 3) {
							i_218_ = 512 - i_217_;
							i_219_ = i_216_;
						} else {
							i_218_ = i_216_;
							i_219_ = i_217_;
						}
						is_196_[((Class274) this).anInt2814 * 1932695231] = i_218_;
						is_197_[1932695231 * ((Class274) this).anInt2814] = i_219_;
						if (null != is_201_ && (aBooleanArrayArray2813[-416650875 * ((Class274) this).anInt2779][i_214_])) {
							int i_220_ = (i_188_ << 9) + i_218_;
							int i_221_ = i_219_ + (i_189_ << 9);
							is_201_[1932695231 * ((Class274) this).anInt2814] = (class_xa_204_.method6416(i_220_, i_221_, -114767367) - class_xa.method6416(i_220_, i_221_, 1518741189));
						}
						if (is_202_ != null) {
							if (null != class_xa_204_ && !(aBooleanArrayArray2813[((Class274) this).anInt2779 * -416650875][i_214_])) {
								int i_222_ = i_218_ + (i_188_ << 9);
								int i_223_ = i_219_ + (i_189_ << 9);
								is_202_[(1932695231 * ((Class274) this).anInt2814)] = (class_xa.method6416(i_222_, i_223_, 216263772) - (class_xa_204_.method6416(i_222_, i_223_, -1899898656)));
							} else if (class_xa_205_ != null && !(aBooleanArrayArray2805[(-416650875 * ((Class274) this).anInt2779)][i_214_])) {
								int i_224_ = i_218_ + (i_188_ << 9);
								int i_225_ = (i_189_ << 9) + i_219_;
								is_202_[(1932695231 * ((Class274) this).anInt2814)] = (class_xa_205_.method6416(i_224_, i_225_, -1929317740) - class_xa.method6416(i_224_, i_225_, 1756903258));
							}
						}
						if (i_214_ < 8 && ((Class274) this).anIntArray2833[i_215_] >= 0) {
							if (null != is)
								is[((Class274) this).anInt2814 * 1932695231] = ((Class274) this).anIntArray2830[i_215_];
							is_200_[((Class274) this).anInt2814 * 1932695231] = ((Class274) this).anIntArray2798[i_215_];
							is_199_[1932695231 * ((Class274) this).anInt2814] = ((Class274) this).anIntArray2831[i_215_];
							is_198_[1932695231 * ((Class274) this).anInt2814] = ((Class274) this).anIntArray2829[i_215_];
						} else {
							if (((Class274) this).aBoolean2795 && (aBooleanArrayArray2813[((Class274) this).anInt2779 * -416650875][i_214_])) {
								is_199_[(((Class274) this).anInt2814 * 1932695231)] = 1586185397 * ((Class274) this).anInt2839;
								is_200_[(1932695231 * ((Class274) this).anInt2814)] = 1289934987 * ((Class274) this).anInt2840;
								is_198_[(((Class274) this).anInt2814 * 1932695231)] = -639366401 * ((Class274) this).anInt2841;
							} else if (i_218_ == 0 && 0 == i_219_) {
								is_198_[(((Class274) this).anInt2814 * 1932695231)] = is_203_[i_188_][i_189_];
								is_199_[(1932695231 * ((Class274) this).anInt2814)] = class491_207_.anInt5856 * 883877799;
								is_200_[(((Class274) this).anInt2814 * 1932695231)] = 1529883341 * class491_207_.anInt5857;
							} else if (i_218_ == 0 && 512 == i_219_) {
								is_198_[(((Class274) this).anInt2814 * 1932695231)] = is_203_[i_188_][i_191_];
								is_199_[(1932695231 * ((Class274) this).anInt2814)] = class491_208_.anInt5856 * 883877799;
								is_200_[(((Class274) this).anInt2814 * 1932695231)] = 1529883341 * class491_208_.anInt5857;
							} else if (512 == i_218_ && i_219_ == 512) {
								is_198_[(((Class274) this).anInt2814 * 1932695231)] = is_203_[i_190_][i_191_];
								is_199_[(((Class274) this).anInt2814 * 1932695231)] = 883877799 * class491_209_.anInt5856;
								is_200_[(((Class274) this).anInt2814 * 1932695231)] = 1529883341 * class491_209_.anInt5857;
							} else if (512 == i_218_ && 0 == i_219_) {
								is_198_[(1932695231 * ((Class274) this).anInt2814)] = is_203_[i_190_][i_189_];
								is_199_[(1932695231 * ((Class274) this).anInt2814)] = 883877799 * class491_210_.anInt5856;
								is_200_[(((Class274) this).anInt2814 * 1932695231)] = class491_210_.anInt5857 * 1529883341;
							} else {
								if (i_218_ < 256) {
									if (i_219_ < 256) {
										is_199_[1932695231 * (((Class274) this).anInt2814)] = (883877799 * class491_207_.anInt5856);
										is_200_[(((Class274) this).anInt2814 * 1932695231)] = (1529883341 * class491_207_.anInt5857);
									} else {
										is_199_[1932695231 * (((Class274) this).anInt2814)] = (883877799 * class491_208_.anInt5856);
										is_200_[1932695231 * (((Class274) this).anInt2814)] = (1529883341 * class491_208_.anInt5857);
									}
								} else if (i_219_ < 256) {
									is_199_[(((Class274) this).anInt2814 * 1932695231)] = 883877799 * class491_210_.anInt5856;
									is_200_[(1932695231 * ((Class274) this).anInt2814)] = 1529883341 * class491_210_.anInt5857;
								} else {
									is_199_[(1932695231 * ((Class274) this).anInt2814)] = class491_209_.anInt5856 * 883877799;
									is_200_[(1932695231 * ((Class274) this).anInt2814)] = class491_209_.anInt5857 * 1529883341;
								}
								int i_226_ = Class413.method5239((is_203_[i_188_][i_189_]), (is_203_[i_190_][i_189_]), i_218_ << 7 >> 9, 1856353678);
								int i_227_ = Class413.method5239((is_203_[i_188_][i_191_]), (is_203_[i_190_][i_191_]), i_218_ << 7 >> 9, 1970878735);
								is_198_[(1932695231 * ((Class274) this).anInt2814)] = Class413.method5239(i_226_, i_227_, i_219_ << 7 >> 9, 1861037359);
							}
							if (is != null)
								is[1932695231 * ((Class274) this).anInt2814] = is_198_[(1932695231 * ((Class274) this).anInt2814)];
						}
						((Class274) this).anInt2814 += 1769724223;
					}
					((Class274) this).anInt2837 += 70879339;
				}
				if (-416650875 * ((Class274) this).anInt2779 != 0 && class491.aBoolean5858)
					((Class274) this).aBoolean2842 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.g(").append(')').toString());
		}
	}

	final void method2698(Class_ra class_ra, Class425 class425, Class491 class491, int i, int i_228_, int i_229_, int i_230_, byte[][] is, byte[][] is_231_, byte[][] is_232_, boolean[] bools, int i_233_) {
		try {
			boolean[] bools_234_ = (class425 != null && class425.aBoolean4337 ? (aBooleanArrayArray2832[((Class274) this).anInt2779 * -416650875]) : (aBooleanArrayArray2848[((Class274) this).anInt2779 * -416650875]));
			if (i_228_ > 0) {
				if (i > 0) {
					int i_235_ = is[i - 1][i_228_ - 1] & 0xff;
					if (i_235_ > 0) {
						Class425 class425_236_ = ((Class274) this).aClass418_2765.method5271(i_235_ - 1, -1766007477);
						if (-865055911 * class425_236_.anInt4330 != -1 && class425_236_.aBoolean4337) {
							byte i_237_ = is_231_[i - 1][i_228_ - 1];
							int i_238_ = 2 * is_232_[i - 1][i_228_ - 1] + 4 & 0x7;
							int i_239_ = Class243.method2408(class_ra, class425_236_, -1926734524);
							if (aBooleanArrayArray2813[i_237_][i_238_]) {
								((Class274) this).anIntArray2829[0] = -865055911 * class425_236_.anInt4330;
								((Class274) this).anIntArray2830[0] = i_239_;
								((Class274) this).anIntArray2831[0] = -946700571 * class425_236_.anInt4331;
								((Class274) this).anIntArray2798[0] = -1121418561 * class425_236_.anInt4334;
								((Class274) this).anIntArray2833[0] = -1522729271 * class425_236_.anInt4341;
								((Class274) this).anIntArray2810[0] = 256;
							}
						}
					}
				}
				if (i < i_229_ - 1) {
					int i_240_ = is[1 + i][i_228_ - 1] & 0xff;
					if (i_240_ > 0) {
						Class425 class425_241_ = ((Class274) this).aClass418_2765.method5271(i_240_ - 1, -2142581678);
						if (class425_241_.anInt4330 * -865055911 != -1 && class425_241_.aBoolean4337) {
							byte i_242_ = is_231_[1 + i][i_228_ - 1];
							int i_243_ = 6 + is_232_[i + 1][i_228_ - 1] * 2 & 0x7;
							int i_244_ = Class243.method2408(class_ra, class425_241_, -1883061927);
							if (aBooleanArrayArray2813[i_242_][i_243_]) {
								((Class274) this).anIntArray2829[2] = -865055911 * class425_241_.anInt4330;
								((Class274) this).anIntArray2830[2] = i_244_;
								((Class274) this).anIntArray2831[2] = -946700571 * class425_241_.anInt4331;
								((Class274) this).anIntArray2798[2] = class425_241_.anInt4334 * -1121418561;
								((Class274) this).anIntArray2833[2] = class425_241_.anInt4341 * -1522729271;
								((Class274) this).anIntArray2810[2] = 512;
							}
						}
					}
				}
			}
			if (i_228_ < i_230_ - 1) {
				if (i > 0) {
					int i_245_ = is[i - 1][i_228_ + 1] & 0xff;
					if (i_245_ > 0) {
						Class425 class425_246_ = ((Class274) this).aClass418_2765.method5271(i_245_ - 1, -1806551287);
						if (-865055911 * class425_246_.anInt4330 != -1 && class425_246_.aBoolean4337) {
							byte i_247_ = is_231_[i - 1][i_228_ + 1];
							int i_248_ = 2 + is_232_[i - 1][1 + i_228_] * 2 & 0x7;
							int i_249_ = Class243.method2408(class_ra, class425_246_, -2067675629);
							if (aBooleanArrayArray2813[i_247_][i_248_]) {
								((Class274) this).anIntArray2829[6] = -865055911 * class425_246_.anInt4330;
								((Class274) this).anIntArray2830[6] = i_249_;
								((Class274) this).anIntArray2831[6] = -946700571 * class425_246_.anInt4331;
								((Class274) this).anIntArray2798[6] = class425_246_.anInt4334 * -1121418561;
								((Class274) this).anIntArray2833[6] = class425_246_.anInt4341 * -1522729271;
								((Class274) this).anIntArray2810[6] = 64;
							}
						}
					}
				}
				if (i < i_229_ - 1) {
					int i_250_ = is[1 + i][i_228_ + 1] & 0xff;
					if (i_250_ > 0) {
						Class425 class425_251_ = ((Class274) this).aClass418_2765.method5271(i_250_ - 1, -977273002);
						if (-1 != class425_251_.anInt4330 * -865055911 && class425_251_.aBoolean4337) {
							byte i_252_ = is_231_[i + 1][1 + i_228_];
							int i_253_ = 0 + is_232_[i + 1][1 + i_228_] * 2 & 0x7;
							int i_254_ = Class243.method2408(class_ra, class425_251_, -1926561137);
							if (aBooleanArrayArray2813[i_252_][i_253_]) {
								((Class274) this).anIntArray2829[4] = -865055911 * class425_251_.anInt4330;
								((Class274) this).anIntArray2830[4] = i_254_;
								((Class274) this).anIntArray2831[4] = -946700571 * class425_251_.anInt4331;
								((Class274) this).anIntArray2798[4] = -1121418561 * class425_251_.anInt4334;
								((Class274) this).anIntArray2833[4] = class425_251_.anInt4341 * -1522729271;
								((Class274) this).anIntArray2810[4] = 128;
							}
						}
					}
				}
			}
			if (i_228_ > 0) {
				int i_255_ = is[i][i_228_ - 1] & 0xff;
				if (i_255_ > 0) {
					Class425 class425_256_ = ((Class274) this).aClass418_2765.method5271(i_255_ - 1, -1025926519);
					if (-865055911 * class425_256_.anInt4330 != -1) {
						byte i_257_ = is_231_[i][i_228_ - 1];
						int i_258_ = is_232_[i][i_228_ - 1];
						if (class425_256_.aBoolean4337) {
							int i_259_ = 2;
							int i_260_ = i_258_ * 2 + 4;
							int i_261_ = Class243.method2408(class_ra, class425_256_, -2083695943);
							for (int i_262_ = 0; i_262_ < 3; i_262_++) {
								i_260_ &= 0x7;
								i_259_ &= 0x7;
								if (aBooleanArrayArray2813[i_257_][i_260_] && ((((Class274) this).anIntArray2833[i_259_]) <= (-1522729271 * class425_256_.anInt4341))) {
									((Class274) this).anIntArray2829[i_259_] = -865055911 * class425_256_.anInt4330;
									((Class274) this).anIntArray2830[i_259_] = i_261_;
									((Class274) this).anIntArray2831[i_259_] = -946700571 * class425_256_.anInt4331;
									((Class274) this).anIntArray2798[i_259_] = (-1121418561 * class425_256_.anInt4334);
									if ((((Class274) this).anIntArray2833[i_259_]) == (class425_256_.anInt4341 * -1522729271))
										((Class274) this).anIntArray2810[i_259_] |= 0x20;
									else
										((Class274) this).anIntArray2810[i_259_] = 32;
									((Class274) this).anIntArray2833[i_259_] = (-1522729271 * class425_256_.anInt4341);
								}
								i_260_++;
								i_259_--;
							}
							if (!bools_234_[0 + (((Class274) this).anInt2836 * -863950871) & 0x3])
								bools[0] = (aBooleanArrayArray2832[i_257_][i_258_ + 2 & 0x3]);
						} else if (!bools_234_[(-863950871 * ((Class274) this).anInt2836 + 0) & 0x3])
							bools[0] = (aBooleanArrayArray2848[i_257_][i_258_ + 2 & 0x3]);
					}
				}
			}
			if (i_228_ < i_230_ - 1) {
				int i_263_ = is[i][1 + i_228_] & 0xff;
				if (i_263_ > 0) {
					Class425 class425_264_ = ((Class274) this).aClass418_2765.method5271(i_263_ - 1, -2071999727);
					if (-1 != -865055911 * class425_264_.anInt4330) {
						byte i_265_ = is_231_[i][i_228_ + 1];
						int i_266_ = is_232_[i][1 + i_228_];
						if (class425_264_.aBoolean4337) {
							int i_267_ = 4;
							int i_268_ = 2 + 2 * i_266_;
							int i_269_ = Class243.method2408(class_ra, class425_264_, -1924849648);
							for (int i_270_ = 0; i_270_ < 3; i_270_++) {
								i_268_ &= 0x7;
								i_267_ &= 0x7;
								if (aBooleanArrayArray2813[i_265_][i_268_] && ((((Class274) this).anIntArray2833[i_267_]) <= (-1522729271 * class425_264_.anInt4341))) {
									((Class274) this).anIntArray2829[i_267_] = class425_264_.anInt4330 * -865055911;
									((Class274) this).anIntArray2830[i_267_] = i_269_;
									((Class274) this).anIntArray2831[i_267_] = -946700571 * class425_264_.anInt4331;
									((Class274) this).anIntArray2798[i_267_] = (-1121418561 * class425_264_.anInt4334);
									if (class425_264_.anInt4341 * -1522729271 == (((Class274) this).anIntArray2833[i_267_]))
										((Class274) this).anIntArray2810[i_267_] |= 0x10;
									else
										((Class274) this).anIntArray2810[i_267_] = 16;
									((Class274) this).anIntArray2833[i_267_] = (-1522729271 * class425_264_.anInt4341);
								}
								i_268_--;
								i_267_++;
							}
							if (!bools_234_[2 + (((Class274) this).anInt2836 * -863950871) & 0x3])
								bools[2] = (aBooleanArrayArray2832[i_265_][0 + i_266_ & 0x3]);
						} else if (!bools_234_[(-863950871 * ((Class274) this).anInt2836 + 2) & 0x3])
							bools[2] = (aBooleanArrayArray2848[i_265_][0 + i_266_ & 0x3]);
					}
				}
			}
			if (i > 0) {
				int i_271_ = is[i - 1][i_228_] & 0xff;
				if (i_271_ > 0) {
					Class425 class425_272_ = ((Class274) this).aClass418_2765.method5271(i_271_ - 1, -1825140633);
					if (class425_272_.anInt4330 * -865055911 != -1) {
						byte i_273_ = is_231_[i - 1][i_228_];
						int i_274_ = is_232_[i - 1][i_228_];
						if (class425_272_.aBoolean4337) {
							int i_275_ = 6;
							int i_276_ = 2 * i_274_ + 4;
							int i_277_ = Class243.method2408(class_ra, class425_272_, -2130126832);
							for (int i_278_ = 0; i_278_ < 3; i_278_++) {
								i_276_ &= 0x7;
								i_275_ &= 0x7;
								if (aBooleanArrayArray2813[i_273_][i_276_] && ((((Class274) this).anIntArray2833[i_275_]) <= (-1522729271 * class425_272_.anInt4341))) {
									((Class274) this).anIntArray2829[i_275_] = -865055911 * class425_272_.anInt4330;
									((Class274) this).anIntArray2830[i_275_] = i_277_;
									((Class274) this).anIntArray2831[i_275_] = class425_272_.anInt4331 * -946700571;
									((Class274) this).anIntArray2798[i_275_] = (class425_272_.anInt4334 * -1121418561);
									if (class425_272_.anInt4341 * -1522729271 == (((Class274) this).anIntArray2833[i_275_]))
										((Class274) this).anIntArray2810[i_275_] |= 0x8;
									else
										((Class274) this).anIntArray2810[i_275_] = 8;
									((Class274) this).anIntArray2833[i_275_] = (-1522729271 * class425_272_.anInt4341);
								}
								i_276_--;
								i_275_++;
							}
							if (!bools_234_[(3 + -863950871 * ((Class274) this).anInt2836 & 0x3)])
								bools[3] = (aBooleanArrayArray2832[i_273_][1 + i_274_ & 0x3]);
						} else if (!bools_234_[(((Class274) this).anInt2836 * -863950871) + 3 & 0x3])
							bools[3] = (aBooleanArrayArray2848[i_273_][i_274_ + 1 & 0x3]);
					}
				}
			}
			if (i < i_229_ - 1) {
				int i_279_ = is[1 + i][i_228_] & 0xff;
				if (i_279_ > 0) {
					Class425 class425_280_ = ((Class274) this).aClass418_2765.method5271(i_279_ - 1, -2129078445);
					if (-865055911 * class425_280_.anInt4330 != -1) {
						byte i_281_ = is_231_[i + 1][i_228_];
						int i_282_ = is_232_[1 + i][i_228_];
						if (class425_280_.aBoolean4337) {
							int i_283_ = 4;
							int i_284_ = 2 * i_282_ + 6;
							int i_285_ = Class243.method2408(class_ra, class425_280_, -1883163946);
							for (int i_286_ = 0; i_286_ < 3; i_286_++) {
								i_284_ &= 0x7;
								i_283_ &= 0x7;
								if (aBooleanArrayArray2813[i_281_][i_284_] && ((((Class274) this).anIntArray2833[i_283_]) <= (-1522729271 * class425_280_.anInt4341))) {
									((Class274) this).anIntArray2829[i_283_] = -865055911 * class425_280_.anInt4330;
									((Class274) this).anIntArray2830[i_283_] = i_285_;
									((Class274) this).anIntArray2831[i_283_] = class425_280_.anInt4331 * -946700571;
									((Class274) this).anIntArray2798[i_283_] = (-1121418561 * class425_280_.anInt4334);
									if (-1522729271 * class425_280_.anInt4341 == (((Class274) this).anIntArray2833[i_283_]))
										((Class274) this).anIntArray2810[i_283_] |= 0x4;
									else
										((Class274) this).anIntArray2810[i_283_] = 4;
									((Class274) this).anIntArray2833[i_283_] = (-1522729271 * class425_280_.anInt4341);
								}
								i_284_++;
								i_283_--;
							}
							if (!bools_234_[(-863950871 * ((Class274) this).anInt2836 + 1 & 0x3)])
								bools[1] = (aBooleanArrayArray2832[i_281_][i_282_ + 3 & 0x3]);
						} else if (!bools_234_[(((Class274) this).anInt2836 * -863950871) + 1 & 0x3])
							bools[1] = (aBooleanArrayArray2848[i_281_][3 + i_282_ & 0x3]);
					}
				}
			}
			if (class425 != null && class425.aBoolean4337) {
				int i_287_ = Class243.method2408(class_ra, class425, -1925921773);
				for (int i_288_ = 0; i_288_ < 8; i_288_++) {
					int i_289_ = (i_288_ - ((Class274) this).anInt2836 * -1727901742 & 0x7);
					if ((aBooleanArrayArray2813[-416650875 * ((Class274) this).anInt2779][i_288_]) && (((Class274) this).anIntArray2833[i_289_] <= -1522729271 * class425.anInt4341)) {
						((Class274) this).anIntArray2829[i_289_] = -865055911 * class425.anInt4330;
						((Class274) this).anIntArray2830[i_289_] = i_287_;
						((Class274) this).anIntArray2831[i_289_] = -946700571 * class425.anInt4331;
						((Class274) this).anIntArray2798[i_289_] = -1121418561 * class425.anInt4334;
						if (((Class274) this).anIntArray2833[i_289_] == class425.anInt4341 * -1522729271)
							((Class274) this).anIntArray2810[i_289_] |= 0x2;
						else
							((Class274) this).anIntArray2810[i_289_] = 2;
						((Class274) this).anIntArray2833[i_289_] = -1522729271 * class425.anInt4341;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.c(").append(')').toString());
		}
	}

	int method2699(int i, int i_290_, int i_291_, int i_292_, int i_293_, Class_xa class_xa, byte[][] is, int i_294_) {
		try {
			if ((0 == -416650875 * ((Class274) this).anInt2779 || -416650875 * ((Class274) this).anInt2779 == 12) && i_290_ > 0 && i_291_ > 0 && i_290_ < -1752239247 * anInt2770 && i_291_ < 1154287061 * anInt2776) {
				int i_295_ = 0;
				int i_296_ = 0;
				int i_297_ = 0;
				int i_298_ = 0;
				i_295_ = i_295_ + (i == is[i_290_ - 1][i_291_ - 1] ? 1 : -1);
				i_296_ = i_296_ + (i == is[i_292_][i_291_ - 1] ? 1 : -1);
				i_297_ = i_297_ + (i == is[i_292_][i_293_] ? 1 : -1);
				i_298_ = i_298_ + (i == is[i_290_ - 1][i_293_] ? 1 : -1);
				if (i == is[i_290_][i_291_ - 1]) {
					i_295_++;
					i_296_++;
				} else {
					i_295_--;
					i_296_--;
				}
				if (is[i_292_][i_291_] == i) {
					i_296_++;
					i_297_++;
				} else {
					i_296_--;
					i_297_--;
				}
				if (i == is[i_290_][i_293_]) {
					i_297_++;
					i_298_++;
				} else {
					i_297_--;
					i_298_--;
				}
				if (is[i_290_ - 1][i_291_] == i) {
					i_298_++;
					i_295_++;
				} else {
					i_298_--;
					i_295_--;
				}
				int i_299_ = i_295_ - i_297_;
				if (i_299_ < 0)
					i_299_ = -i_299_;
				int i_300_ = i_296_ - i_298_;
				if (i_300_ < 0)
					i_300_ = -i_300_;
				if (i_299_ == i_300_) {
					i_299_ = (class_xa.method6417(i_290_, i_291_, 422408186) - class_xa.method6417(i_292_, i_293_, -2129566801));
					if (i_299_ < 0)
						i_299_ = -i_299_;
					i_300_ = (class_xa.method6417(i_292_, i_291_, 1235404677) - class_xa.method6417(i_290_, i_293_, -21796736));
					if (i_300_ < 0)
						i_300_ = -i_300_;
				}
				return i_299_ < i_300_ ? 1 : 0;
			}
			return -863950871 * ((Class274) this).anInt2836;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.k(").append(')').toString());
		}
	}

	final void method2700(Buffer class330_sub46, int i, int i_301_, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_, boolean bool, int i_308_) {
		try {
			if (i_307_ == 1)
				i_304_ = 1;
			else if (2 == i_307_) {
				i_303_ = 1;
				i_304_ = 1;
			} else if (3 == i_307_)
				i_303_ = 1;
			if (i_301_ >= 0 && i_301_ < -1752239247 * anInt2770 && i_302_ >= 0 && i_302_ < 1154287061 * anInt2776) {
				if (!aBoolean2777 && !bool)
					aClass281_2811.aByteArrayArrayArray2916[i][i_301_][i_302_] = (byte) 0;
				for (;;) {
					int i_309_ = class330_sub46.readUnsignedByte(245066705);
					if (0 == i_309_) {
						if (aBoolean2777)
							anIntArrayArrayArray2793[0][i_301_ + i_303_][i_302_ + i_304_] = 0;
						else if (0 == i)
							anIntArrayArrayArray2793[0][i_301_ + i_303_][i_304_ + i_302_] = -Class156.method1827(932731 + i_305_, 556238 + i_306_, (short) -1127) * 8 << 2;
						else
							anIntArrayArrayArray2793[i][i_303_ + i_301_][i_302_ + i_304_] = (anIntArrayArrayArray2793[i - 1][i_303_ + i_301_][i_302_ + i_304_]) - 960;
						break;
					}
					if (1 == i_309_) {
						int i_310_ = class330_sub46.readUnsignedByte(721575280);
						if (!aBoolean2777) {
							if (1 == i_310_)
								i_310_ = 0;
							if (0 == i)
								anIntArrayArrayArray2793[0][i_301_ + i_303_][i_302_ + i_304_] = 8 * -i_310_ << 2;
							else
								anIntArrayArrayArray2793[i][i_301_ + i_303_][i_304_ + i_302_] = ((anIntArrayArrayArray2793[i - 1][i_301_ + i_303_][i_304_ + i_302_]) - (8 * i_310_ << 2));
						} else
							anIntArrayArrayArray2793[0][i_303_ + i_301_][i_302_ + i_304_] = 8 * i_310_ << 2;
						break;
					}
					if (i_309_ <= 49) {
						if (bool)
							class330_sub46.readUnsignedByte(-184696035);
						else {
							((Class274) this).aByteArrayArrayArray2784[i][i_301_][i_302_] = class330_sub46.readByte((byte) -18);
							((Class274) this).aByteArrayArrayArray2781[i][i_301_][i_302_] = (byte) ((i_309_ - 2) / 4);
							((Class274) this).aByteArrayArrayArray2782[i][i_301_][i_302_] = (byte) (i_309_ - 2 + i_307_ & 0x3);
						}
					} else if (i_309_ <= 81) {
						if (!aBoolean2777 && !bool)
							aClass281_2811.aByteArrayArrayArray2916[i][i_301_][i_302_] = (byte) (i_309_ - 49);
					} else if (bool) {
						if (i_308_ <= 16777472) {
							/* empty */
						}
					} else
						((Class274) this).aByteArrayArrayArray2849[i][i_301_][i_302_] = (byte) (i_309_ - 81);
				}
			} else {
				for (;;) {
					int i_311_ = class330_sub46.readUnsignedByte(-300191902);
					if (0 == i_311_) {
						if (i_308_ <= 16777472) {
							/* empty */
						}
						break;
					}
					if (i_311_ == 1) {
						class330_sub46.readUnsignedByte(1328063917);
						break;
					}
					if (i_311_ <= 49)
						class330_sub46.readUnsignedByte(740240134);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.f(").append(')').toString());
		}
	}

	Class274(Class356 class356, int i, int i_312_, int i_313_, boolean bool, Class418 class418, Class499 class499, Class281 class281) {
		aBoolean2771 = false;
		aBoolean2772 = false;
		aBoolean2773 = false;
		((Class274) this).anIntArray2828 = new int[6];
		((Class274) this).anIntArray2829 = new int[13];
		((Class274) this).anIntArray2830 = new int[13];
		((Class274) this).anIntArray2831 = new int[13];
		((Class274) this).anIntArray2798 = new int[13];
		((Class274) this).anIntArray2833 = new int[13];
		((Class274) this).anIntArray2810 = new int[13];
		((Class274) this).anInt2837 = 0;
		((Class274) this).anInt2814 = 0;
		((Class274) this).anIntArray2843 = null;
		aClass356_2767 = class356;
		anInt2774 = i * -2041555177;
		anInt2770 = 1844538769 * i_312_;
		anInt2776 = i_313_ * -1810625667;
		aBoolean2777 = bool;
		((Class274) this).aClass418_2765 = class418;
		((Class274) this).aClass499_2819 = class499;
		aClass281_2811 = class281;
		((Class274) this).aByteArrayArrayArray2849 = (new byte[-392146777 * anInt2774][-1752239247 * anInt2770][1154287061 * anInt2776]);
		((Class274) this).aByteArrayArrayArray2784 = (new byte[-392146777 * anInt2774][-1752239247 * anInt2770][anInt2776 * 1154287061]);
		((Class274) this).aByteArrayArrayArray2781 = (new byte[-392146777 * anInt2774][-1752239247 * anInt2770][1154287061 * anInt2776]);
		((Class274) this).aByteArrayArrayArray2782 = (new byte[-392146777 * anInt2774][-1752239247 * anInt2770][1154287061 * anInt2776]);
		anIntArrayArrayArray2793 = (new int[anInt2774 * -392146777][1 + -1752239247 * anInt2770][1 + 1154287061 * anInt2776]);
		aByteArrayArrayArray2785 = (new byte[-392146777 * anInt2774][1 + anInt2770 * -1752239247][anInt2776 * 1154287061 + 1]);
	}

	void method2701(Class_ra class_ra, Class425 class425, Class491 class491, int i, int i_314_, byte[][] is, byte[][] is_315_, byte[][] is_316_, boolean[] bools, int i_317_) {
		try {
			boolean[] bools_318_ = (null != class425 && class425.aBoolean4337 ? (aBooleanArrayArray2832[-416650875 * ((Class274) this).anInt2779]) : (aBooleanArrayArray2848[-416650875 * ((Class274) this).anInt2779]));
			method2698(class_ra, class425, class491, i, i_314_, anInt2770 * -1752239247, 1154287061 * anInt2776, is_316_, is, is_315_, bools, -917455368);
			((Class274) this).aBoolean2845 = null != class425 && (class425.anInt4330 * -865055911 != 2023656477 * class425.anInt4340);
			if (!((Class274) this).aBoolean2845) {
				for (int i_319_ = 0; i_319_ < 8; i_319_++) {
					if (((Class274) this).anIntArray2833[i_319_] >= 0 && (((Class274) this).anIntArray2830[i_319_] != ((Class274) this).anIntArray2829[i_319_])) {
						((Class274) this).aBoolean2845 = true;
						break;
					}
				}
			}
			if (!bools_318_[((Class274) this).anInt2836 * -863950871 + 1 & 0x3]) {
				boolean[] bools_320_ = bools;
				int i_321_ = 1;
				bools_320_[i_321_] = (bools_320_[i_321_] | 0 == (((Class274) this).anIntArray2810[2] & ((Class274) this).anIntArray2810[4]));
			}
			if (!bools_318_[((Class274) this).anInt2836 * -863950871 + 3 & 0x3]) {
				boolean[] bools_322_ = bools;
				int i_323_ = 3;
				bools_322_[i_323_] = (bools_322_[i_323_] | (((Class274) this).anIntArray2810[6] & ((Class274) this).anIntArray2810[0]) == 0);
			}
			if (!bools_318_[((Class274) this).anInt2836 * -863950871 + 0 & 0x3]) {
				boolean[] bools_324_ = bools;
				int i_325_ = 0;
				bools_324_[i_325_] = (bools_324_[i_325_] | (((Class274) this).anIntArray2810[0] & ((Class274) this).anIntArray2810[2]) == 0);
			}
			if (!bools_318_[2 + ((Class274) this).anInt2836 * -863950871 & 0x3]) {
				boolean[] bools_326_ = bools;
				int i_327_ = 2;
				bools_326_[i_327_] = (bools_326_[i_327_] | 0 == (((Class274) this).anIntArray2810[4] & ((Class274) this).anIntArray2810[6]));
			}
			if (!((Class274) this).aBoolean2795 && (0 == -416650875 * ((Class274) this).anInt2779 || 12 == ((Class274) this).anInt2779 * -416650875)) {
				if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
					boolean[] bools_328_ = bools;
					bools[3] = false;
					bools_328_[0] = false;
					((Class274) this).anInt2779 = (((Class274) this).anInt2779 * -416650875 == 0 ? 13 : 14) * 871311181;
					((Class274) this).anInt2836 = 0;
				} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
					boolean[] bools_329_ = bools;
					bools[1] = false;
					bools_329_[0] = false;
					((Class274) this).anInt2779 = (-416650875 * ((Class274) this).anInt2779 == 0 ? 13 : 14) * 871311181;
					((Class274) this).anInt2836 = -214671093;
				} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
					boolean[] bools_330_ = bools;
					bools[2] = false;
					bools_330_[1] = false;
					((Class274) this).anInt2779 = (871311181 * (((Class274) this).anInt2779 * -416650875 == 0 ? 13 : 14));
					((Class274) this).anInt2836 = -143114062;
				} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
					boolean[] bools_331_ = bools;
					bools[3] = false;
					bools_331_[2] = false;
					((Class274) this).anInt2779 = (-416650875 * ((Class274) this).anInt2779 == 0 ? 13 : 14) * 871311181;
					((Class274) this).anInt2836 = -71557031;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.q(").append(')').toString());
		}
	}

	static {
		anIntArray2808 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray2809 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray2764 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray2812 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray2823 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBooleanArrayArray2813 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBooleanArrayArray2805 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray2815 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray2816 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray2818 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBooleanArrayArray2848 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray2826 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray2820 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray2821 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray2822 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBooleanArrayArray2832 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray2844 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray2847 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray2838 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray2827 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	void method2702(Class_xa class_xa, Class491 class491, Class425 class425, int i, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_, int i_337_, byte i_338_) {
		try {
			int i_339_ = class_xa.method6417(i_332_, i_333_, -1896395813);
			int i_340_ = class_xa.method6417(i_334_, i_333_, 948674307);
			int i_341_ = class_xa.method6417(i_334_, i_335_, 1516176167);
			int i_342_ = class_xa.method6417(i_332_, i_335_, 1528574078);
			boolean bool = aClass281_2811.method2788(i_332_, i_333_, (byte) -88);
			if (bool && i > 1 || !bool && i > 0) {
				boolean bool_343_ = true;
				if (class491 != null && !class491.aBoolean5859)
					bool_343_ = false;
				else if (0 == i_336_ && 0 != -416650875 * ((Class274) this).anInt2779)
					bool_343_ = false;
				else if (i_337_ > 0 && null != class425 && !class425.aBoolean4332)
					bool_343_ = false;
				if (bool_343_ && i_339_ == i_340_ && i_339_ == i_341_ && i_342_ == i_339_)
					aByteArrayArrayArray2785[i][i_332_][i_333_] |= 0x4;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.d(").append(')').toString());
		}
	}

	static final void method2703(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			IComponentDefinitions.method1408(iComponentDefinitions, class120, class430, -2046890112);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.kw(").append(')').toString());
		}
	}

	public static Class366 method2704(int i, int i_344_, int i_345_, int i_346_, int i_347_, short i_348_) {
		try {
			Class363.aClass366_Sub5_3800.anInt3854 = i * -1089827279;
			Class363.aClass366_Sub5_3800.anInt3853 = i_344_ * 1307742219;
			Class363.aClass366_Sub5_3800.anInt3852 = 1706819999 * i_345_;
			Class363.aClass366_Sub5_3800.anInt3855 = i_346_ * 1343860585;
			((Class366_Sub5) Class363.aClass366_Sub5_3800).anInt8008 = i_347_ * -359234675;
			return Class363.aClass366_Sub5_3800;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.i(").append(')').toString());
		}
	}

	static final void method2705(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int[] is = Class278.method2740(string, class430, (byte) 0);
			if (null != is)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1213 = Class288.method2886(string, class430, 2108980833);
			iComponentDefinitions.anIntArray1311 = is;
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lk.mc(").append(')').toString());
		}
	}
}
