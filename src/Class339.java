/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public final class Class339 {
	Class489 aClass489_3375;
	Class489 aClass489_3376 = null;
	int anInt3377;
	int anInt3378;
	static byte[] aByteArray3379 = new byte[520];

	public byte[] method3961(int i, byte i_0_) {
		try {
			synchronized (((Class339) this).aClass489_3376) {
				byte[] is;
				try {
					if (((Class339) this).aClass489_3375.method6056(1964420626) < (long) (i * 6 + 6)) {
						byte[] is_1_ = null;
						return is_1_;
					}
					((Class339) this).aClass489_3375.method6055((long) (i * 6));
					((Class339) this).aClass489_3375.method6057(aByteArray3379, 0, 6, (byte) 0);
					int i_2_ = (((aByteArray3379[1] & 0xff) << 8) + ((aByteArray3379[0] & 0xff) << 16) + (aByteArray3379[2] & 0xff));
					int i_3_ = ((aByteArray3379[5] & 0xff) + (((aByteArray3379[3] & 0xff) << 16) + ((aByteArray3379[4] & 0xff) << 8)));
					if (i_2_ < 0 || i_2_ > 2027698751 * ((Class339) this).anInt3377) {
						byte[] is_4_ = null;
						return is_4_;
					}
					if (i_3_ <= 0 || (long) i_3_ > ((Class339) this).aClass489_3376.method6056(1346259262) / 520L) {
						byte[] is_5_ = null;
						return is_5_;
					}
					byte[] is_6_ = new byte[i_2_];
					int i_7_ = 0;
					int i_8_ = 0;
					while (i_7_ < i_2_) {
						if (0 == i_3_) {
							byte[] is_9_ = null;
							return is_9_;
						}
						((Class339) this).aClass489_3376.method6055((long) (i_3_ * 520));
						int i_10_ = i_2_ - i_7_;
						int i_11_;
						int i_12_;
						int i_13_;
						int i_14_;
						int i_15_;
						if (i > 65535) {
							if (i_10_ > 510)
								i_10_ = 510;
							i_11_ = 10;
							((Class339) this).aClass489_3376.method6057(aByteArray3379, 0, i_10_ + i_11_, (byte) 0);
							i_12_ = (((aByteArray3379[2] & 0xff) << 8) + (((aByteArray3379[0] & 0xff) << 24) + ((aByteArray3379[1] & 0xff) << 16)) + (aByteArray3379[3] & 0xff));
							i_13_ = ((aByteArray3379[5] & 0xff) + ((aByteArray3379[4] & 0xff) << 8));
							i_14_ = ((aByteArray3379[8] & 0xff) + (((aByteArray3379[6] & 0xff) << 16) + ((aByteArray3379[7] & 0xff) << 8)));
							i_15_ = aByteArray3379[9] & 0xff;
						} else {
							if (i_10_ > 512)
								i_10_ = 512;
							i_11_ = 8;
							((Class339) this).aClass489_3376.method6057(aByteArray3379, 0, i_11_ + i_10_, (byte) 0);
							i_12_ = ((aByteArray3379[1] & 0xff) + ((aByteArray3379[0] & 0xff) << 8));
							i_13_ = ((aByteArray3379[3] & 0xff) + ((aByteArray3379[2] & 0xff) << 8));
							i_14_ = (((aByteArray3379[4] & 0xff) << 16) + ((aByteArray3379[5] & 0xff) << 8) + (aByteArray3379[6] & 0xff));
							i_15_ = aByteArray3379[7] & 0xff;
						}
						if (i != i_12_ || i_13_ != i_8_ || (-435668967 * ((Class339) this).anInt3378 != i_15_)) {
							byte[] is_16_ = null;
							return is_16_;
						}
						if (i_14_ < 0 || (long) i_14_ > (((Class339) this).aClass489_3376.method6056(1587944818) / 520L)) {
							byte[] is_17_ = null;
							return is_17_;
						}
						int i_18_ = i_10_ + i_11_;
						for (int i_19_ = i_11_; i_19_ < i_18_; i_19_++)
							is_6_[i_7_++] = aByteArray3379[i_19_];
						i_3_ = i_14_;
						i_8_++;
					}
					is = is_6_;
				} catch (IOException ioexception) {
					byte[] is_20_ = null;
					return is_20_;
				}
				return is;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.r(").append(')').toString());
		}
	}

	public Class339(int i, Class489 class489, Class489 class489_21_, int i_22_) {
		((Class339) this).aClass489_3375 = null;
		((Class339) this).anInt3377 = -2139981800;
		((Class339) this).anInt3378 = -23616471 * i;
		((Class339) this).aClass489_3376 = class489;
		((Class339) this).aClass489_3375 = class489_21_;
		((Class339) this).anInt3377 = i_22_ * -1392593473;
	}

	public boolean method3962(int i, byte[] is, int i_23_, short i_24_) {
		try {
			synchronized (((Class339) this).aClass489_3376) {
				if (i_23_ < 0 || i_23_ > 2027698751 * ((Class339) this).anInt3377)
					throw new IllegalArgumentException();
				boolean bool = method3963(i, is, i_23_, true, (byte) 1);
				if (!bool)
					bool = method3963(i, is, i_23_, false, (byte) 1);
				boolean bool_25_ = bool;
				return bool_25_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.j(").append(')').toString());
		}
	}

	public String toString() {
		try {
			return new StringBuilder().append("").append(-435668967 * ((Class339) this).anInt3378).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.toString(").append(')').toString());
		}
	}

	boolean method3963(int i, byte[] is, int i_26_, boolean bool, byte i_27_) {
		try {
			synchronized (((Class339) this).aClass489_3376) {
				boolean bool_28_;
				try {
					int i_29_;
					if (bool) {
						if (((Class339) this).aClass489_3375.method6056(1717947132) < (long) (6 + 6 * i)) {
							boolean bool_30_ = false;
							return bool_30_;
						}
						((Class339) this).aClass489_3375.method6055((long) (6 * i));
						((Class339) this).aClass489_3375.method6057(aByteArray3379, 0, 6, (byte) 0);
						i_29_ = (((aByteArray3379[3] & 0xff) << 16) + ((aByteArray3379[4] & 0xff) << 8) + (aByteArray3379[5] & 0xff));
						if (i_29_ <= 0 || (long) i_29_ > (((Class339) this).aClass489_3376.method6056(1664669101) / 520L)) {
							boolean bool_31_ = false;
							return bool_31_;
						}
					} else {
						i_29_ = (int) ((((Class339) this).aClass489_3376.method6056(2059038941) + 519L) / 520L);
						if (i_29_ == 0)
							i_29_ = 1;
					}
					aByteArray3379[0] = (byte) (i_26_ >> 16);
					aByteArray3379[1] = (byte) (i_26_ >> 8);
					aByteArray3379[2] = (byte) i_26_;
					aByteArray3379[3] = (byte) (i_29_ >> 16);
					aByteArray3379[4] = (byte) (i_29_ >> 8);
					aByteArray3379[5] = (byte) i_29_;
					((Class339) this).aClass489_3375.method6055((long) (6 * i));
					((Class339) this).aClass489_3375.method6053(aByteArray3379, 0, 6, -2105283850);
					int i_32_ = 0;
					int i_33_ = 0;
					while (i_32_ < i_26_) {
						int i_34_ = 0;
						if (bool) {
							((Class339) this).aClass489_3376.method6055((long) (520 * i_29_));
							int i_35_;
							int i_36_;
							int i_37_;
							if (i > 65535) {
								try {
									((Class339) this).aClass489_3376.method6057(aByteArray3379, 0, 10, (byte) 0);
								} catch (EOFException eofexception) {
									break;
								}
								i_35_ = ((aByteArray3379[3] & 0xff) + (((aByteArray3379[1] & 0xff) << 16) + ((aByteArray3379[0] & 0xff) << 24) + ((aByteArray3379[2] & 0xff) << 8)));
								i_36_ = ((aByteArray3379[5] & 0xff) + ((aByteArray3379[4] & 0xff) << 8));
								i_34_ = (((aByteArray3379[6] & 0xff) << 16) + ((aByteArray3379[7] & 0xff) << 8) + (aByteArray3379[8] & 0xff));
								i_37_ = aByteArray3379[9] & 0xff;
							} else {
								try {
									((Class339) this).aClass489_3376.method6057(aByteArray3379, 0, 8, (byte) 0);
								} catch (EOFException eofexception) {
									break;
								}
								i_35_ = (((aByteArray3379[0] & 0xff) << 8) + (aByteArray3379[1] & 0xff));
								i_36_ = (((aByteArray3379[2] & 0xff) << 8) + (aByteArray3379[3] & 0xff));
								i_34_ = (((aByteArray3379[5] & 0xff) << 8) + ((aByteArray3379[4] & 0xff) << 16) + (aByteArray3379[6] & 0xff));
								i_37_ = aByteArray3379[7] & 0xff;
							}
							if (i != i_35_ || i_33_ != i_36_ || (((Class339) this).anInt3378 * -435668967 != i_37_)) {
								boolean bool_38_ = false;
								return bool_38_;
							}
							if (i_34_ < 0 || ((long) i_34_ > ((Class339) this).aClass489_3376.method6056(2099186270) / 520L)) {
								boolean bool_39_ = false;
								return bool_39_;
							}
						}
						if (0 == i_34_) {
							bool = false;
							i_34_ = (int) ((((Class339) this).aClass489_3376.method6056(1106838837) + 519L) / 520L);
							if (i_34_ == 0)
								i_34_++;
							if (i_29_ == i_34_)
								i_34_++;
						}
						if (i_26_ - i_32_ <= 512)
							i_34_ = 0;
						if (i > 65535) {
							aByteArray3379[0] = (byte) (i >> 24);
							aByteArray3379[1] = (byte) (i >> 16);
							aByteArray3379[2] = (byte) (i >> 8);
							aByteArray3379[3] = (byte) i;
							aByteArray3379[4] = (byte) (i_33_ >> 8);
							aByteArray3379[5] = (byte) i_33_;
							aByteArray3379[6] = (byte) (i_34_ >> 16);
							aByteArray3379[7] = (byte) (i_34_ >> 8);
							aByteArray3379[8] = (byte) i_34_;
							aByteArray3379[9] = (byte) (-435668967 * ((Class339) this).anInt3378);
							((Class339) this).aClass489_3376.method6055((long) (i_29_ * 520));
							((Class339) this).aClass489_3376.method6053(aByteArray3379, 0, 10, -2105283850);
							int i_40_ = i_26_ - i_32_;
							if (i_40_ > 510)
								i_40_ = 510;
							((Class339) this).aClass489_3376.method6053(is, i_32_, i_40_, -2105283850);
							i_32_ += i_40_;
						} else {
							aByteArray3379[0] = (byte) (i >> 8);
							aByteArray3379[1] = (byte) i;
							aByteArray3379[2] = (byte) (i_33_ >> 8);
							aByteArray3379[3] = (byte) i_33_;
							aByteArray3379[4] = (byte) (i_34_ >> 16);
							aByteArray3379[5] = (byte) (i_34_ >> 8);
							aByteArray3379[6] = (byte) i_34_;
							aByteArray3379[7] = (byte) (((Class339) this).anInt3378 * -435668967);
							((Class339) this).aClass489_3376.method6055((long) (520 * i_29_));
							((Class339) this).aClass489_3376.method6053(aByteArray3379, 0, 8, -2105283850);
							int i_41_ = i_26_ - i_32_;
							if (i_41_ > 512)
								i_41_ = 512;
							((Class339) this).aClass489_3376.method6053(is, i_32_, i_41_, -2105283850);
							i_32_ += i_41_;
						}
						i_29_ = i_34_;
						i_33_++;
					}
					bool_28_ = true;
				} catch (IOException ioexception) {
					boolean bool_42_ = false;
					return bool_42_;
				}
				return bool_28_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.i(").append(')').toString());
		}
	}

	static final void method3964(Class430 class430, byte i) {
		try {
			int i_43_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_43_ >> 14 & 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.td(").append(')').toString());
		}
	}

	static final void method3965(Class430 class430, int i) {
		try {
			Class95_Sub12_Sub1.method1141(-1696107092);
			client.aClass304_9030.method3032(768219532);
			Class435.method5568(1905725687);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.aoo(").append(')').toString());
		}
	}

	static final void method3966(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class307.method3074(string, 1980644324);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.we(").append(')').toString());
		}
	}

	public static void method3967(String string, boolean bool, int i, String string_44_, byte i_45_) {
		try {
			Class283.method2825(string, bool, i, -1, string_44_, true, 1759280233);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("od.me(").append(')').toString());
		}
	}
}
