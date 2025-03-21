/* Class527 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class527 {
	IndexTable aClass280_6209;
	IndexTable aClass280_6210;
	Class367 aClass367_6211 = new Class367(64);
	Class367 aClass367_6212 = new Class367(2);
	public static int anInt6213;

	public Class529 method6264(int i, int i_0_) {
		try {
			Class529 class529;
			synchronized (((Class527) this).aClass367_6211) {
				class529 = (Class529) ((Class527) this).aClass367_6211.get((long) i);
			}
			if (class529 != null)
				return class529;
			byte[] is;
			synchronized (((Class527) this).aClass280_6210) {
				is = (((Class527) this).aClass280_6210.getFile(-989081113 * Class103.aClass103_957.anInt982, i));
			}
			class529 = new Class529();
			((Class529) class529).aClass527_6220 = this;
			if (is != null)
				class529.method6273(new Buffer(is), 1298888433);
			synchronized (((Class527) this).aClass367_6211) {
				((Class527) this).aClass367_6211.put(class529, (long) i);
			}
			return class529;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vv.r(").append(')').toString());
		}
	}

	public void method6265(byte i) {
		try {
			synchronized (((Class527) this).aClass367_6211) {
				((Class527) this).aClass367_6211.method4298((byte) 28);
			}
			synchronized (((Class527) this).aClass367_6212) {
				((Class527) this).aClass367_6212.method4298((byte) 103);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vv.j(").append(')').toString());
		}
	}

	public void method6266(int i, int i_1_) {
		try {
			synchronized (((Class527) this).aClass367_6211) {
				((Class527) this).aClass367_6211.method4292(i, (byte) 85);
			}
			synchronized (((Class527) this).aClass367_6212) {
				((Class527) this).aClass367_6212.method4292(i, (byte) 50);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vv.i(").append(')').toString());
		}
	}

	public Class527(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_2_) {
		((Class527) this).aClass280_6210 = class280;
		((Class527) this).aClass280_6209 = class280_2_;
		((Class527) this).aClass280_6210.method2763((-989081113 * (Class103.aClass103_957.anInt982)), -2134875129);
	}

	public void method6267(byte i) {
		try {
			synchronized (((Class527) this).aClass367_6211) {
				((Class527) this).aClass367_6211.method4296(1279169151);
			}
			synchronized (((Class527) this).aClass367_6212) {
				((Class527) this).aClass367_6212.method4296(1319245621);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vv.p(").append(')').toString());
		}
	}

	static final void method6268(int i, int i_3_, byte i_4_) {
		try {
			if (Class397_Sub1.method4681(i, null, 1269754919))
				Class562.method6475((Class3.aClass120Array56[i].aClass114Array1400), i_3_, (byte) -17);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vv.lv(").append(')').toString());
		}
	}

	static boolean method6269(int i) {
		try {
			if (6 != client.anInt8995 * -296919301)
				return false;
			if (Class434.method5564(-1557921116) || Class509.method6165(47374417))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vv.ap(").append(')').toString());
		}
	}

	static final boolean method6270(int i, int i_5_, int i_6_, Class366 class366, Class307 class307, int i_7_) {
		try {
			int i_8_ = i;
			int i_9_ = i_5_;
			int i_10_ = 64;
			int i_11_ = 64;
			int i_12_ = i - i_10_;
			int i_13_ = i_5_ - i_11_;
			Class295.anIntArrayArray3015[i_10_][i_11_] = 99;
			Class295.anIntArrayArray3019[i_10_][i_11_] = 0;
			int i_14_ = 0;
			int i_15_ = 0;
			Class295.anIntArray3013[i_14_] = i_8_;
			Class295.anIntArray3020[i_14_++] = i_9_;
			int[][] is = class307.anIntArrayArray3166;
			while_108_: while (i_15_ != i_14_) {
				i_8_ = Class295.anIntArray3013[i_15_];
				i_9_ = Class295.anIntArray3020[i_15_];
				i_15_ = 1 + i_15_ & 0xfff;
				i_10_ = i_8_ - i_12_;
				i_11_ = i_9_ - i_13_;
				int i_16_ = i_8_ - 1241210193 * class307.anInt3162;
				int i_17_ = i_9_ - 1001570543 * class307.anInt3163;
				if (class366.method4274(i_6_, i_8_, i_9_, class307, -1816537952)) {
					Class295.anInt3017 = i_8_ * -394834289;
					Class202.anInt1936 = i_9_ * 505306171;
					return true;
				}
				int i_18_ = Class295.anIntArrayArray3019[i_10_][i_11_] + 1;
				while_101_: do {
					if (i_10_ > 0) {
						if (0 != (Class295.anIntArrayArray3015[i_10_ - 1][i_11_])) {
							if (i_7_ != 1001616597) {
								/* empty */
							}
						} else if ((is[i_16_ - 1][i_17_] & 0x43a40000) != 0) {
							if (i_7_ != 1001616597) {
								/* empty */
							}
						} else if (0 != (is[i_16_ - 1][i_6_ + i_17_ - 1] & 0x4e240000)) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else {
							for (int i_19_ = 1; i_19_ < i_6_ - 1; i_19_++) {
								if ((is[i_16_ - 1][i_19_ + i_17_] & 0x4fa40000) != 0) {
									if (i_7_ != 1001616597) {
										/* empty */
									}
									break while_101_;
								}
							}
							Class295.anIntArray3013[i_14_] = i_8_ - 1;
							Class295.anIntArray3020[i_14_] = i_9_;
							i_14_ = 1 + i_14_ & 0xfff;
							Class295.anIntArrayArray3015[i_10_ - 1][i_11_] = 2;
							Class295.anIntArrayArray3019[i_10_ - 1][i_11_] = i_18_;
						}
					}
				} while (false);
				while_102_: do {
					if (i_10_ < 128 - i_6_) {
						if (Class295.anIntArrayArray3015[1 + i_10_][i_11_] != 0) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else if ((is[i_16_ + i_6_][i_17_] & 0x60e40000) != 0) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else if (0 != (is[i_16_ + i_6_][i_17_ + i_6_ - 1] & 0x78240000)) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else {
							for (int i_20_ = 1; i_20_ < i_6_ - 1; i_20_++) {
								if (0 != (is[i_16_ + i_6_][i_17_ + i_20_] & 0x78e40000)) {
									if (i_7_ != 1001616597)
										throw new IllegalStateException();
									break while_102_;
								}
							}
							Class295.anIntArray3013[i_14_] = i_8_ + 1;
							Class295.anIntArray3020[i_14_] = i_9_;
							i_14_ = i_14_ + 1 & 0xfff;
							Class295.anIntArrayArray3015[1 + i_10_][i_11_] = 8;
							Class295.anIntArrayArray3019[1 + i_10_][i_11_] = i_18_;
						}
					}
				} while (false);
				while_103_: do {
					if (i_11_ > 0) {
						if (Class295.anIntArrayArray3015[i_10_][i_11_ - 1] != 0) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else if ((is[i_16_][i_17_ - 1] & 0x43a40000) != 0) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else if (0 != (is[i_6_ + i_16_ - 1][i_17_ - 1] & 0x60e40000)) {
							if (i_7_ != 1001616597) {
								/* empty */
							}
						} else {
							for (int i_21_ = 1; i_21_ < i_6_ - 1; i_21_++) {
								if (0 != (is[i_16_ + i_21_][i_17_ - 1] & 0x63e40000)) {
									if (i_7_ != 1001616597) {
										/* empty */
									}
									break while_103_;
								}
							}
							Class295.anIntArray3013[i_14_] = i_8_;
							Class295.anIntArray3020[i_14_] = i_9_ - 1;
							i_14_ = i_14_ + 1 & 0xfff;
							Class295.anIntArrayArray3015[i_10_][i_11_ - 1] = 1;
							Class295.anIntArrayArray3019[i_10_][i_11_ - 1] = i_18_;
						}
					}
				} while (false);
				while_104_: do {
					if (i_11_ < 128 - i_6_) {
						if (Class295.anIntArrayArray3015[i_10_][i_11_ + 1] != 0) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else if ((is[i_16_][i_6_ + i_17_] & 0x4e240000) != 0) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else if (0 != (is[i_6_ + i_16_ - 1][i_6_ + i_17_] & 0x78240000)) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else {
							for (int i_22_ = 1; i_22_ < i_6_ - 1; i_22_++) {
								if ((is[i_22_ + i_16_][i_6_ + i_17_] & 0x7e240000) != 0) {
									if (i_7_ != 1001616597) {
										/* empty */
									}
									break while_104_;
								}
							}
							Class295.anIntArray3013[i_14_] = i_8_;
							Class295.anIntArray3020[i_14_] = 1 + i_9_;
							i_14_ = i_14_ + 1 & 0xfff;
							Class295.anIntArrayArray3015[i_10_][1 + i_11_] = 4;
							Class295.anIntArrayArray3019[i_10_][i_11_ + 1] = i_18_;
						}
					}
				} while (false);
				while_105_: do {
					if (i_10_ > 0 && i_11_ > 0) {
						if (Class295.anIntArrayArray3015[i_10_ - 1][i_11_ - 1] != 0) {
							if (i_7_ != 1001616597) {
								/* empty */
							}
						} else if (0 != (is[i_16_ - 1][i_17_ - 1] & 0x43a40000)) {
							if (i_7_ != 1001616597) {
								/* empty */
							}
						} else {
							for (int i_23_ = 1; i_23_ < i_6_; i_23_++) {
								if (0 != (is[i_16_ - 1][i_23_ + (i_17_ - 1)] & 0x4fa40000)) {
									if (i_7_ != 1001616597)
										throw new IllegalStateException();
									break while_105_;
								}
								if (0 != (is[i_16_ - 1 + i_23_][i_17_ - 1] & 0x63e40000)) {
									if (i_7_ != 1001616597)
										throw new IllegalStateException();
									break while_105_;
								}
							}
							Class295.anIntArray3013[i_14_] = i_8_ - 1;
							Class295.anIntArray3020[i_14_] = i_9_ - 1;
							i_14_ = i_14_ + 1 & 0xfff;
							Class295.anIntArrayArray3015[i_10_ - 1][i_11_ - 1] = 3;
							Class295.anIntArrayArray3019[i_10_ - 1][i_11_ - 1] = i_18_;
						}
					}
				} while (false);
				while_106_: do {
					if (i_10_ < 128 - i_6_ && i_11_ > 0) {
						if (0 != (Class295.anIntArrayArray3015[1 + i_10_][i_11_ - 1])) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else if ((is[i_6_ + i_16_][i_17_ - 1] & 0x60e40000) != 0) {
							if (i_7_ != 1001616597) {
								/* empty */
							}
						} else {
							for (int i_24_ = 1; i_24_ < i_6_; i_24_++) {
								if ((is[i_16_ + i_6_][i_24_ + (i_17_ - 1)] & 0x78e40000) != 0) {
									if (i_7_ != 1001616597) {
										/* empty */
									}
									break while_106_;
								}
								if (0 != (is[i_16_ + i_24_][i_17_ - 1] & 0x63e40000)) {
									if (i_7_ != 1001616597)
										throw new IllegalStateException();
									break while_106_;
								}
							}
							Class295.anIntArray3013[i_14_] = i_8_ + 1;
							Class295.anIntArray3020[i_14_] = i_9_ - 1;
							i_14_ = 1 + i_14_ & 0xfff;
							Class295.anIntArrayArray3015[i_10_ + 1][i_11_ - 1] = 9;
							Class295.anIntArrayArray3019[i_10_ + 1][i_11_ - 1] = i_18_;
						}
					}
				} while (false);
				while_107_: do {
					if (i_10_ > 0 && i_11_ < 128 - i_6_) {
						if (Class295.anIntArrayArray3015[i_10_ - 1][1 + i_11_] != 0) {
							if (i_7_ != 1001616597) {
								/* empty */
							}
						} else if ((is[i_16_ - 1][i_17_ + i_6_] & 0x4e240000) != 0) {
							if (i_7_ != 1001616597)
								throw new IllegalStateException();
						} else {
							for (int i_25_ = 1; i_25_ < i_6_; i_25_++) {
								if ((is[i_16_ - 1][i_25_ + i_17_] & 0x4fa40000) != 0) {
									if (i_7_ != 1001616597)
										throw new IllegalStateException();
									break while_107_;
								}
								if (0 != (is[i_16_ - 1 + i_25_][i_17_ + i_6_] & 0x7e240000)) {
									if (i_7_ != 1001616597)
										throw new IllegalStateException();
									break while_107_;
								}
							}
							Class295.anIntArray3013[i_14_] = i_8_ - 1;
							Class295.anIntArray3020[i_14_] = 1 + i_9_;
							i_14_ = 1 + i_14_ & 0xfff;
							Class295.anIntArrayArray3015[i_10_ - 1][1 + i_11_] = 6;
							Class295.anIntArrayArray3019[i_10_ - 1][1 + i_11_] = i_18_;
						}
					}
				} while (false);
				if (i_10_ < 128 - i_6_ && i_11_ < 128 - i_6_) {
					if (0 != (Class295.anIntArrayArray3015[i_10_ + 1][1 + i_11_])) {
						if (i_7_ != 1001616597)
							throw new IllegalStateException();
					} else if ((is[i_16_ + i_6_][i_6_ + i_17_] & 0x78240000) != 0) {
						if (i_7_ != 1001616597)
							throw new IllegalStateException();
					} else {
						for (int i_26_ = 1; i_26_ < i_6_; i_26_++) {
							if ((is[i_26_ + i_16_][i_17_ + i_6_] & 0x7e240000) != 0) {
								if (i_7_ != 1001616597) {
									/* empty */
								}
								continue while_108_;
							}
							if ((is[i_16_ + i_6_][i_26_ + i_17_] & 0x78e40000) != 0) {
								if (i_7_ != 1001616597) {
									/* empty */
								}
								continue while_108_;
							}
						}
						Class295.anIntArray3013[i_14_] = i_8_ + 1;
						Class295.anIntArray3020[i_14_] = 1 + i_9_;
						i_14_ = 1 + i_14_ & 0xfff;
						Class295.anIntArrayArray3015[1 + i_10_][1 + i_11_] = 12;
						Class295.anIntArrayArray3019[i_10_ + 1][1 + i_11_] = i_18_;
					}
				}
			}
			Class295.anInt3017 = -394834289 * i_8_;
			Class202.anInt1936 = 505306171 * i_9_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vv.p(").append(')').toString());
		}
	}
}
