/* Class95_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class95_Sub12 extends Class95 {
	int anInt7174;
	int anInt7175;
	int anInt7176;
	public static IndexTable aClass280_7177;

	boolean method1132() {
		Class437 class437 = Class136.aClass416_1527.method5254((((Class95_Sub12) this).anInt7176) * 493698779, -2051419548);
		boolean bool = class437.method5584((byte) -18);
		Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -1707515884);
		bool &= class440.method5600(717167219);
		return bool;
	}

	Class95_Sub12(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub12) this).anInt7176 = class330_sub46.readUnsignedShort(939973073) * 2026016083;
		((Class95_Sub12) this).anInt7175 = class330_sub46.readUnsignedShort(898769995) * 2129356313;
		((Class95_Sub12) this).anInt7174 = class330_sub46.readUnsignedByte(1059618174) * -1826829417;
	}

	boolean method1133() {
		Class437 class437 = Class136.aClass416_1527.method5254((((Class95_Sub12) this).anInt7176) * 493698779, 1942311935);
		boolean bool = class437.method5584((byte) -33);
		Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, 1930515879);
		bool &= class440.method5600(1196794637);
		return bool;
	}

	boolean method1097(int i) {
		try {
			Class437 class437 = Class136.aClass416_1527.method5254((((Class95_Sub12) this).anInt7176) * 493698779, 868130108);
			boolean bool = class437.method5584((byte) -4);
			Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, 1598878754);
			bool &= class440.method5600(1435413824);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zl.p(").append(')').toString());
		}
	}

	boolean method1134() {
		Class437 class437 = Class136.aClass416_1527.method5254((((Class95_Sub12) this).anInt7176) * 493698779, -2071246942);
		boolean bool = class437.method5584((byte) -122);
		Class440 class440 = Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -2121257239);
		bool &= class440.method5600(847791562);
		return bool;
	}

	static final void method1135(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int i) {
		try {
			Class477_Sub3 class477_sub3 = class432_sub1_sub1_sub1.aClass477_Sub3_10039;
			if (class477_sub3.method5966(-860204256) && class477_sub3.method5981(1, 1433823948) && class477_sub3.method5978((byte) -121)) {
				if (class477_sub3.aBoolean8752) {
					class477_sub3.method5969(class432_sub1_sub1_sub1.method5436(-2062547966).method4268(2096709438), false, true, 926576130);
					class477_sub3.aBoolean8752 = class477_sub3.method5966(13928949);
				}
				class477_sub3.method5979((byte) -17);
			}
			for (int i_0_ = 0; i_0_ < class432_sub1_sub1_sub1.graphics.length; i_0_++) {
				if ((class432_sub1_sub1_sub1.graphics[i_0_].id * 888084571) != -1) {
					Class477 class477 = (class432_sub1_sub1_sub1.graphics[i_0_].aClass477_573);
					if (class477.method5972(-776556553)) {
						Class437 class437 = (Class136.aClass416_1527.method5254(888084571 * (class432_sub1_sub1_sub1.graphics[i_0_].id), -734727840));
						Class440 class440 = class477.method5986((byte) -104);
						if (class437.aBoolean4443) {
							if (3 == class440.anInt4477 * -1566438803) {
								if ((-398029923 * class432_sub1_sub1_sub1.anInt10006) > 0 && ((1960954555 * class432_sub1_sub1_sub1.anInt10058) <= client.anInt8981 * 822953439) && ((class432_sub1_sub1_sub1.anInt10038 * 74284369) < 822953439 * client.anInt8981)) {
									class477.method5988(-1, (byte) -18);
									class432_sub1_sub1_sub1.graphics[i_0_].id = 1988601901;
									continue;
								}
							} else if (1 == class440.anInt4477 * -1566438803 && -398029923 * (class432_sub1_sub1_sub1.anInt10006) > 0 && ((class432_sub1_sub1_sub1.anInt10058 * 1960954555) <= client.anInt8981 * 822953439) && ((class432_sub1_sub1_sub1.anInt10038 * 74284369) < client.anInt8981 * 822953439)) {
								if (i != -745600378) {
									/* empty */
								}
								continue;
							}
						}
					}
					if (class477.method5981(1, 1269566725) && class477.method5978((byte) -14)) {
						class477.method5988(-1, (byte) 63);
						class432_sub1_sub1_sub1.graphics[i_0_].id = 1988601901;
					}
				}
			}
			Class477 class477 = class432_sub1_sub1_sub1.aClass477_10032;
			do {
				if (class477.method5966(-840889294)) {
					Class440 class440 = class477.method5986((byte) -60);
					if (class440.anInt4477 * -1566438803 == 3) {
						if (class432_sub1_sub1_sub1.anInt10006 * -398029923 > 0 && (class432_sub1_sub1_sub1.anInt10058 * 1960954555 <= 822953439 * client.anInt8981) && (class432_sub1_sub1_sub1.anInt10038 * 74284369 < client.anInt8981 * 822953439)) {
							class432_sub1_sub1_sub1.anIntArray10030 = null;
							class477.method5988(-1, (byte) -111);
							break;
						}
					} else if (1 == class440.anInt4477 * -1566438803) {
						if (class432_sub1_sub1_sub1.anInt10006 * -398029923 > 0 && (class432_sub1_sub1_sub1.anInt10058 * 1960954555 <= client.anInt8981 * 822953439) && (74284369 * class432_sub1_sub1_sub1.anInt10038 < 822953439 * client.anInt8981)) {
							class477.method5968(1, -1958240973);
							break;
						}
						class477.method5968(0, -1958240973);
					}
					if (class477.method5981(1, 865939858) && class477.method5978((byte) -41)) {
						class432_sub1_sub1_sub1.anIntArray10030 = null;
						class477.method5988(-1, (byte) -72);
					}
				}
			} while (false);
			for (int i_1_ = 0; i_1_ < (class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019).length; i_1_++) {
				Class477_Sub2_Sub1 class477_sub2_sub1 = (class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019[i_1_]);
				if (class477_sub2_sub1 == null) {
					if (i != -745600378)
						break;
				} else if (class477_sub2_sub1.anInt9940 * -1530713877 > 0)
					class477_sub2_sub1.anInt9940 -= -682475581;
				else if (class477_sub2_sub1.method5981(1, 699629043) && class477_sub2_sub1.method5978((byte) -30))
					class432_sub1_sub1_sub1.aClass477_Sub2_Sub1Array10019[i_1_] = null;
			}
		} catch (NullPointerException e) {
			System.out.println("oops");
			return;
		}
	}

	static final void method1136(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_3_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_4_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_5_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 3]);
			i_2_ += i_3_ << 14;
			i_2_ += i_4_ << 28;
			i_2_ += i_5_;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zl.uw(").append(')').toString());
		}
	}

	public static void method1137(boolean bool, boolean bool_6_, int i) {
		try {
			if (bool) {
				Console.anInt4262 -= -1528620851;
				if (Console.anInt4262 * -98397179 == 0)
					Console.anIntArray4263 = null;
			}
			if (bool_6_) {
				Console.anInt4261 -= -829750911;
				if (Console.anInt4261 * -1625866623 == 0)
					Console.colorArray = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zl.j(").append(')').toString());
		}
	}

	static final boolean method1138(int i, int i_7_, Class366 class366, Class307 class307, int i_8_) {
		try {
			int i_9_ = i;
			int i_10_ = i_7_;
			int i_11_ = 64;
			int i_12_ = 64;
			int i_13_ = i - i_11_;
			int i_14_ = i_7_ - i_12_;
			Class295.anIntArrayArray3015[i_11_][i_12_] = 99;
			Class295.anIntArrayArray3019[i_11_][i_12_] = 0;
			int i_15_ = 0;
			int i_16_ = 0;
			Class295.anIntArray3013[i_15_] = i_9_;
			Class295.anIntArray3020[i_15_++] = i_10_;
			int[][] is = class307.anIntArrayArray3166;
			while (i_15_ != i_16_) {
				i_9_ = Class295.anIntArray3013[i_16_];
				i_10_ = Class295.anIntArray3020[i_16_];
				i_16_ = 1 + i_16_ & 0xfff;
				i_11_ = i_9_ - i_13_;
				i_12_ = i_10_ - i_14_;
				int i_17_ = i_9_ - 1241210193 * class307.anInt3162;
				int i_18_ = i_10_ - 1001570543 * class307.anInt3163;
				if (class366.method4274(2, i_9_, i_10_, class307, -1070448394)) {
					Class295.anInt3017 = -394834289 * i_9_;
					Class202.anInt1936 = i_10_ * 505306171;
					return true;
				}
				int i_19_ = 1 + Class295.anIntArrayArray3019[i_11_][i_12_];
				if (i_11_ > 0) {
					if (Class295.anIntArrayArray3015[i_11_ - 1][i_12_] != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if ((is[i_17_ - 1][i_18_] & 0x43a40000) != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if ((is[i_17_ - 1][i_18_ + 1] & 0x4e240000) != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else {
						Class295.anIntArray3013[i_15_] = i_9_ - 1;
						Class295.anIntArray3020[i_15_] = i_10_;
						i_15_ = i_15_ + 1 & 0xfff;
						Class295.anIntArrayArray3015[i_11_ - 1][i_12_] = 2;
						Class295.anIntArrayArray3019[i_11_ - 1][i_12_] = i_19_;
					}
				}
				if (i_11_ < 126) {
					if (0 != Class295.anIntArrayArray3015[1 + i_11_][i_12_]) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[2 + i_17_][i_18_] & 0x60e40000)) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[i_17_ + 2][1 + i_18_] & 0x78240000)) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else {
						Class295.anIntArray3013[i_15_] = 1 + i_9_;
						Class295.anIntArray3020[i_15_] = i_10_;
						i_15_ = i_15_ + 1 & 0xfff;
						Class295.anIntArrayArray3015[i_11_ + 1][i_12_] = 8;
						Class295.anIntArrayArray3019[1 + i_11_][i_12_] = i_19_;
					}
				}
				if (i_12_ > 0) {
					if (Class295.anIntArrayArray3015[i_11_][i_12_ - 1] != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[i_17_][i_18_ - 1] & 0x43a40000)) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if (0 != (is[1 + i_17_][i_18_ - 1] & 0x60e40000)) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else {
						Class295.anIntArray3013[i_15_] = i_9_;
						Class295.anIntArray3020[i_15_] = i_10_ - 1;
						i_15_ = 1 + i_15_ & 0xfff;
						Class295.anIntArrayArray3015[i_11_][i_12_ - 1] = 1;
						Class295.anIntArrayArray3019[i_11_][i_12_ - 1] = i_19_;
					}
				}
				if (i_12_ < 126) {
					if (0 != Class295.anIntArrayArray3015[i_11_][1 + i_12_]) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if ((is[i_17_][i_18_ + 2] & 0x4e240000) != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[1 + i_17_][i_18_ + 2] & 0x78240000)) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else {
						Class295.anIntArray3013[i_15_] = i_9_;
						Class295.anIntArray3020[i_15_] = i_10_ + 1;
						i_15_ = i_15_ + 1 & 0xfff;
						Class295.anIntArrayArray3015[i_11_][1 + i_12_] = 4;
						Class295.anIntArrayArray3019[i_11_][i_12_ + 1] = i_19_;
					}
				}
				if (i_11_ > 0 && i_12_ > 0) {
					if (Class295.anIntArrayArray3015[i_11_ - 1][i_12_ - 1] != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[i_17_ - 1][i_18_] & 0x4fa40000)) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if (0 != (is[i_17_ - 1][i_18_ - 1] & 0x43a40000)) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[i_17_][i_18_ - 1] & 0x63e40000)) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else {
						Class295.anIntArray3013[i_15_] = i_9_ - 1;
						Class295.anIntArray3020[i_15_] = i_10_ - 1;
						i_15_ = i_15_ + 1 & 0xfff;
						Class295.anIntArrayArray3015[i_11_ - 1][i_12_ - 1] = 3;
						Class295.anIntArrayArray3019[i_11_ - 1][i_12_ - 1] = i_19_;
					}
				}
				if (i_11_ < 126 && i_12_ > 0) {
					if (0 != (Class295.anIntArrayArray3015[1 + i_11_][i_12_ - 1])) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[1 + i_17_][i_18_ - 1] & 0x63e40000)) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if (0 != (is[i_17_ + 2][i_18_ - 1] & 0x60e40000)) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if (0 != (is[2 + i_17_][i_18_] & 0x78e40000)) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else {
						Class295.anIntArray3013[i_15_] = 1 + i_9_;
						Class295.anIntArray3020[i_15_] = i_10_ - 1;
						i_15_ = 1 + i_15_ & 0xfff;
						Class295.anIntArrayArray3015[i_11_ + 1][i_12_ - 1] = 9;
						Class295.anIntArrayArray3019[i_11_ + 1][i_12_ - 1] = i_19_;
					}
				}
				if (i_11_ > 0 && i_12_ < 126) {
					if (0 != (Class295.anIntArrayArray3015[i_11_ - 1][1 + i_12_])) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if ((is[i_17_ - 1][1 + i_18_] & 0x4fa40000) != 0) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if ((is[i_17_ - 1][i_18_ + 2] & 0x4e240000) != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if ((is[i_17_][i_18_ + 2] & 0x7e240000) != 0) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else {
						Class295.anIntArray3013[i_15_] = i_9_ - 1;
						Class295.anIntArray3020[i_15_] = 1 + i_10_;
						i_15_ = i_15_ + 1 & 0xfff;
						Class295.anIntArrayArray3015[i_11_ - 1][i_12_ + 1] = 6;
						Class295.anIntArrayArray3019[i_11_ - 1][1 + i_12_] = i_19_;
					}
				}
				if (i_11_ < 126 && i_12_ < 126) {
					if (Class295.anIntArrayArray3015[1 + i_11_][1 + i_12_] != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if (0 != (is[1 + i_17_][i_18_ + 2] & 0x7e240000)) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else if ((is[i_17_ + 2][2 + i_18_] & 0x78240000) != 0) {
						if (i_8_ == -1183709625) {
							/* empty */
						}
					} else if ((is[2 + i_17_][i_18_ + 1] & 0x78e40000) != 0) {
						if (i_8_ == -1183709625)
							throw new IllegalStateException();
					} else {
						Class295.anIntArray3013[i_15_] = i_9_ + 1;
						Class295.anIntArray3020[i_15_] = 1 + i_10_;
						i_15_ = 1 + i_15_ & 0xfff;
						Class295.anIntArrayArray3015[1 + i_11_][1 + i_12_] = 12;
						Class295.anIntArrayArray3019[i_11_ + 1][1 + i_12_] = i_19_;
					}
				}
			}
			Class295.anInt3017 = i_9_ * -394834289;
			Class202.anInt1936 = i_10_ * 505306171;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zl.i(").append(')').toString());
		}
	}
}
