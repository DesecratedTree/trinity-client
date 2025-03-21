/* Class432_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class432_Sub1_Sub1 extends Class432_Sub1 {
	byte aByte9919;
	public short aShort9920;
	public short aShort9921;
	public short aShort9922;
	public short aShort9923;
	public boolean aBoolean9924;

	int method5368(Class330_Sub14[] class330_sub14s, byte i) {
		try {
			int i_0_ = 0;
			while_40_: for (int i_1_ = aShort9922; i_1_ <= aShort9920; i_1_++) {
				for (int i_2_ = aShort9921; i_2_ <= aShort9923; i_2_++) {
					long l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_1_][i_2_]);
					long l_3_ = 0L;
					while_39_: while (l_3_ <= 48L) {
						int i_4_ = (int) (l >>> (int) l_3_ & 0xffffL);
						if (i_4_ <= 0)
							break;
						Class349 class349 = (((Class356) aClass356_8655).aClass349Array3679[i_4_ - 1]);
						for (int i_5_ = 0; i_5_ < i_0_; i_5_++) {
							if (class349.aClass330_Sub14_3467 == class330_sub14s[i_5_]) {
								l_3_ += 16L;
								continue while_39_;
							}
						}
						class330_sub14s[i_0_++] = class349.aClass330_Sub14_3467;
						if (4 == i_0_) {
							if (i >= 12)
								throw new IllegalStateException();
							break while_40_;
						}
						l_3_ += 16L;
					}
				}
			}
			for (int i_6_ = i_0_; i_6_ < 4; i_6_++)
				class330_sub14s[i_6_] = null;
			if (((Class432_Sub1_Sub1) this).aByte9919 != 0) {
				int i_7_ = (aShort9922 - ((Class356) aClass356_8655).anInt3640 * 315907165);
				int i_8_ = (aShort9921 - ((Class356) aClass356_8655).anInt3651 * 875564685);
				short i_9_;
				int i_10_;
				int i_11_;
				short i_12_;
				if (((Class432_Sub1_Sub1) this).aByte9919 == 1) {
					if (i_8_ > i_7_) {
						i_9_ = aShort9922;
						i_10_ = aShort9921 - 1;
						i_11_ = 1 + aShort9922;
						i_12_ = aShort9921;
					} else {
						i_9_ = aShort9922;
						i_10_ = aShort9921 + 1;
						i_11_ = aShort9922 - 1;
						i_12_ = aShort9921;
					}
				} else if (i_8_ > -i_7_) {
					i_9_ = aShort9922;
					i_10_ = aShort9921 - 1;
					i_11_ = aShort9922 - 1;
					i_12_ = aShort9921;
				} else {
					i_9_ = aShort9922;
					i_10_ = aShort9921 + 1;
					i_11_ = 1 + aShort9922;
					i_12_ = aShort9921;
				}
				int i_13_ = 0;
				while_44_: for (/**/; i_13_ < i_0_; i_13_++) {
					long l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_9_][i_10_]);
					while_41_: do {
						Class349 class349;
						do {
							if (0L == l)
								break while_41_;
							class349 = (((Class356) aClass356_8655).aClass349Array3679[(int) ((l & 0xffffL) - 1L)]);
							l >>>= 16;
						} while (class330_sub14s[i_13_] != class349.aClass330_Sub14_3467);
						if (i >= 12) {
							/* empty */
						}
						continue while_44_;
					} while (false);
					l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_11_][i_12_]);
					while_42_: do {
						Class349 class349;
						do {
							if (0L == l)
								break while_42_;
							class349 = (((Class356) aClass356_8655).aClass349Array3679[(int) ((l & 0xffffL) - 1L)]);
							l >>>= 16;
						} while (class330_sub14s[i_13_] != class349.aClass330_Sub14_3467);
						if (i >= 12) {
							/* empty */
						}
						continue while_44_;
					} while (false);
					for (int i_14_ = i_13_; i_14_ < i_0_ - 1; i_14_++)
						class330_sub14s[i_14_] = class330_sub14s[i_14_ + 1];
					i_0_--;
				}
			}
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akb.fb(").append(')').toString());
		}
	}

	void method5406(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akb.ca(").append(')').toString());
		}
	}

	boolean method5365(Class_ra class_ra) {
		return (aClass356_8655.aClass358_3649.method4227(aByte8654, aShort9922, aShort9920, aShort9921, aShort9923, method5383(class_ra, -296919301)));
	}

	int method5398(Class330_Sub14[] class330_sub14s) {
		int i = 0;
		while_46_: for (int i_15_ = aShort9922; i_15_ <= aShort9920; i_15_++) {
			for (int i_16_ = aShort9921; i_16_ <= aShort9923; i_16_++) {
				long l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_15_][i_16_]);
				long l_17_ = 0L;
				while_45_: while (l_17_ <= 48L) {
					int i_18_ = (int) (l >>> (int) l_17_ & 0xffffL);
					if (i_18_ <= 0)
						break;
					Class349 class349 = (((Class356) aClass356_8655).aClass349Array3679[i_18_ - 1]);
					for (int i_19_ = 0; i_19_ < i; i_19_++) {
						if (class349.aClass330_Sub14_3467 == class330_sub14s[i_19_]) {
							l_17_ += 16L;
							continue while_45_;
						}
					}
					class330_sub14s[i++] = class349.aClass330_Sub14_3467;
					if (4 == i)
						break while_46_;
					l_17_ += 16L;
				}
			}
		}
		for (int i_20_ = i; i_20_ < 4; i_20_++)
			class330_sub14s[i_20_] = null;
		if (((Class432_Sub1_Sub1) this).aByte9919 != 0) {
			int i_21_ = (aShort9922 - ((Class356) aClass356_8655).anInt3640 * 315907165);
			int i_22_ = (aShort9921 - ((Class356) aClass356_8655).anInt3651 * 875564685);
			short i_23_;
			int i_24_;
			int i_25_;
			short i_26_;
			if (((Class432_Sub1_Sub1) this).aByte9919 == 1) {
				if (i_22_ > i_21_) {
					i_23_ = aShort9922;
					i_24_ = aShort9921 - 1;
					i_25_ = 1 + aShort9922;
					i_26_ = aShort9921;
				} else {
					i_23_ = aShort9922;
					i_24_ = aShort9921 + 1;
					i_25_ = aShort9922 - 1;
					i_26_ = aShort9921;
				}
			} else if (i_22_ > -i_21_) {
				i_23_ = aShort9922;
				i_24_ = aShort9921 - 1;
				i_25_ = aShort9922 - 1;
				i_26_ = aShort9921;
			} else {
				i_23_ = aShort9922;
				i_24_ = aShort9921 + 1;
				i_25_ = 1 + aShort9922;
				i_26_ = aShort9921;
			}
			int i_27_ = 0;
			while_50_: for (/**/; i_27_ < i; i_27_++) {
				long l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_23_][i_24_]);
				while_47_: do {
					Class349 class349;
					do {
						if (0L == l)
							break while_47_;
						class349 = (((Class356) aClass356_8655).aClass349Array3679[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
					} while (class330_sub14s[i_27_] != class349.aClass330_Sub14_3467);
					continue while_50_;
				} while (false);
				l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_25_][i_26_]);
				while_48_: do {
					Class349 class349;
					do {
						if (0L == l)
							break while_48_;
						class349 = (((Class356) aClass356_8655).aClass349Array3679[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
					} while (class330_sub14s[i_27_] != class349.aClass330_Sub14_3467);
					continue while_50_;
				} while (false);
				for (int i_28_ = i_27_; i_28_ < i - 1; i_28_++)
					class330_sub14s[i_28_] = class330_sub14s[i_28_ + 1];
				i--;
			}
		}
		return i;
	}

	boolean method5372(Class_ra class_ra, int i) {
		try {
			return (aClass356_8655.aClass358_3649.method4227(aByte8654, aShort9922, aShort9920, aShort9921, aShort9923, method5383(class_ra, -296919301)));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akb.gb(").append(')').toString());
		}
	}

	boolean method5403() {
		for (int i = aShort9922; i <= aShort9920; i++) {
			for (int i_29_ = aShort9921; i_29_ <= aShort9923; i_29_++) {
				int i_30_ = (i - 315907165 * ((Class356) aClass356_8655).anInt3640 + ((Class356) aClass356_8655).anInt3673 * 316617313);
				if (i_30_ >= 0 && i_30_ < (((Class356) aClass356_8655).aBooleanArrayArray3700).length) {
					int i_31_ = (i_29_ - ((Class356) aClass356_8655).anInt3651 * 875564685 + (((Class356) aClass356_8655).anInt3673 * 316617313));
					if (i_31_ >= 0 && i_31_ < (((Class356) aClass356_8655).aBooleanArrayArray3700).length && (((Class356) aClass356_8655).aBooleanArrayArray3700[i_30_][i_31_]))
						return true;
				}
			}
		}
		return false;
	}

	Class432_Sub1_Sub1(Class356 class356, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, boolean bool, byte i_40_) {
		super(class356);
		aByte8658 = (byte) i;
		aByte8654 = (byte) i_32_;
		method5349(new Class260((float) i_33_, (float) i_34_, (float) i_35_));
		aShort9922 = (short) i_36_;
		aShort9920 = (short) i_37_;
		aShort9921 = (short) i_38_;
		aShort9923 = (short) i_39_;
		aBoolean9924 = bool;
		((Class432_Sub1_Sub1) this).aByte9919 = i_40_;
	}

	int method5399(Class330_Sub14[] class330_sub14s) {
		int i = 0;
		while_52_: for (int i_41_ = aShort9922; i_41_ <= aShort9920; i_41_++) {
			for (int i_42_ = aShort9921; i_42_ <= aShort9923; i_42_++) {
				long l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_41_][i_42_]);
				long l_43_ = 0L;
				while_51_: while (l_43_ <= 48L) {
					int i_44_ = (int) (l >>> (int) l_43_ & 0xffffL);
					if (i_44_ <= 0)
						break;
					Class349 class349 = (((Class356) aClass356_8655).aClass349Array3679[i_44_ - 1]);
					for (int i_45_ = 0; i_45_ < i; i_45_++) {
						if (class349.aClass330_Sub14_3467 == class330_sub14s[i_45_]) {
							l_43_ += 16L;
							continue while_51_;
						}
					}
					class330_sub14s[i++] = class349.aClass330_Sub14_3467;
					if (4 == i)
						break while_52_;
					l_43_ += 16L;
				}
			}
		}
		for (int i_46_ = i; i_46_ < 4; i_46_++)
			class330_sub14s[i_46_] = null;
		if (((Class432_Sub1_Sub1) this).aByte9919 != 0) {
			int i_47_ = (aShort9922 - ((Class356) aClass356_8655).anInt3640 * 315907165);
			int i_48_ = (aShort9921 - ((Class356) aClass356_8655).anInt3651 * 875564685);
			short i_49_;
			int i_50_;
			int i_51_;
			short i_52_;
			if (((Class432_Sub1_Sub1) this).aByte9919 == 1) {
				if (i_48_ > i_47_) {
					i_49_ = aShort9922;
					i_50_ = aShort9921 - 1;
					i_51_ = 1 + aShort9922;
					i_52_ = aShort9921;
				} else {
					i_49_ = aShort9922;
					i_50_ = aShort9921 + 1;
					i_51_ = aShort9922 - 1;
					i_52_ = aShort9921;
				}
			} else if (i_48_ > -i_47_) {
				i_49_ = aShort9922;
				i_50_ = aShort9921 - 1;
				i_51_ = aShort9922 - 1;
				i_52_ = aShort9921;
			} else {
				i_49_ = aShort9922;
				i_50_ = aShort9921 + 1;
				i_51_ = 1 + aShort9922;
				i_52_ = aShort9921;
			}
			int i_53_ = 0;
			while_56_: for (/**/; i_53_ < i; i_53_++) {
				long l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_49_][i_50_]);
				while_53_: do {
					Class349 class349;
					do {
						if (0L == l)
							break while_53_;
						class349 = (((Class356) aClass356_8655).aClass349Array3679[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
					} while (class330_sub14s[i_53_] != class349.aClass330_Sub14_3467);
					continue while_56_;
				} while (false);
				l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i_51_][i_52_]);
				while_54_: do {
					Class349 class349;
					do {
						if (0L == l)
							break while_54_;
						class349 = (((Class356) aClass356_8655).aClass349Array3679[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
					} while (class330_sub14s[i_53_] != class349.aClass330_Sub14_3467);
					continue while_56_;
				} while (false);
				for (int i_54_ = i_53_; i_54_ < i - 1; i_54_++)
					class330_sub14s[i_54_] = class330_sub14s[i_54_ + 1];
				i--;
			}
		}
		return i;
	}

	boolean method5400(Class_ra class_ra) {
		return (aClass356_8655.aClass358_3649.method4227(aByte8654, aShort9922, aShort9920, aShort9921, aShort9923, method5383(class_ra, -296919301)));
	}

	boolean method5402(Class_ra class_ra) {
		return (aClass356_8655.aClass358_3649.method4227(aByte8654, aShort9922, aShort9920, aShort9921, aShort9923, method5383(class_ra, -296919301)));
	}

	boolean method5367(byte i) {
		try {
			for (int i_55_ = aShort9922; i_55_ <= aShort9920; i_55_++) {
				for (int i_56_ = aShort9921; i_56_ <= aShort9923; i_56_++) {
					int i_57_ = (i_55_ - 315907165 * ((Class356) aClass356_8655).anInt3640 + (((Class356) aClass356_8655).anInt3673 * 316617313));
					if (i_57_ >= 0) {
						if (i_57_ >= (((Class356) aClass356_8655).aBooleanArrayArray3700).length) {
							if (i >= 1)
								throw new IllegalStateException();
						} else {
							int i_58_ = (i_56_ - (((Class356) aClass356_8655).anInt3651 * 875564685) + (((Class356) aClass356_8655).anInt3673 * 316617313));
							if (i_58_ >= 0) {
								if (i_58_ >= (((Class356) aClass356_8655).aBooleanArrayArray3700).length) {
									if (i >= 1) {
										/* empty */
									}
								} else if (((Class356) aClass356_8655).aBooleanArrayArray3700[i_57_][i_58_])
									return true;
							}
						}
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akb.gn(").append(')').toString());
		}
	}

	static final void method5407(Class430 class430, short i) {
		try {
			int i_59_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_59_, -957997072);
			Class120 class120 = Class3.aClass120Array56[i_59_ >> 16];
			Class162.method1912(iComponentDefinitions, class120, class430, 37711779);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akb.iq(").append(')').toString());
		}
	}
}
