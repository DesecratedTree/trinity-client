/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class151 implements Interface21 {
	
	short[] aShortArray6660;
	Class169 aClass169_6661;
	short[] aShortArray6662;
	short[] aShortArray6663;
	short[] aShortArray6664;
	int[] anIntArray6665;
	byte[] aByteArray6666;
	public static int[] anIntArray6667;
	int[] anIntArray6668 = { -1, -1, -1, -1, -1 };
	public static int[] anIntArray6669 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	byte[] aByteArray6670;
	public static int anInt6671;
	
	void method1774(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(-52970576);
				if (i_0_ == 0) {
					if (i <= 16) {
						/* empty */
					}
					break;
				}
				method1775(class330_sub46, i_0_, (byte) 6);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.r(").append(')').toString());
		}
	}
	
	void method1775(Buffer class330_sub46, int i, byte i_1_) {
		try {
			if (1 == i)
				class330_sub46.readUnsignedByte(-166547034);
			else if (i == 2) {
				int i_2_ = class330_sub46.readUnsignedByte(-272178801);
				((Class151) this).anIntArray6665 = new int[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
					((Class151) this).anIntArray6665[i_3_] = class330_sub46.readBigSmart(-1009147701);
			} else if (3 == i) {
				if (i_1_ == 1) {
					/* empty */
				}
			} else if (40 == i) {
				int i_4_ = class330_sub46.readUnsignedByte(-310766364);
				((Class151) this).aShortArray6662 = new short[i_4_];
				((Class151) this).aShortArray6663 = new short[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					((Class151) this).aShortArray6662[i_5_] = (short) class330_sub46.readUnsignedShort(-245223536);
					((Class151) this).aShortArray6663[i_5_] = (short) class330_sub46.readUnsignedShort(591825377);
				}
			} else if (i == 41) {
				int i_6_ = class330_sub46.readUnsignedByte(2123149401);
				((Class151) this).aShortArray6664 = new short[i_6_];
				((Class151) this).aShortArray6660 = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					((Class151) this).aShortArray6664[i_7_] = (short) class330_sub46.readUnsignedShort(1778287785);
					((Class151) this).aShortArray6660[i_7_] = (short) class330_sub46.readUnsignedShort(-76461780);
				}
			} else if (44 == i) {
				int i_8_ = class330_sub46.readUnsignedShort(148486881);
				int i_9_ = 0;
				for (int i_10_ = i_8_; i_10_ > 0; i_10_ >>= 1)
					i_9_++;
				((Class151) this).aByteArray6666 = new byte[i_9_];
				byte i_11_ = 0;
				for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
					if ((i_8_ & 1 << i_12_) > 0) {
						((Class151) this).aByteArray6666[i_12_] = i_11_;
						i_11_++;
					} else
						((Class151) this).aByteArray6666[i_12_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_13_ = class330_sub46.readUnsignedShort(521654237);
				int i_14_ = 0;
				for (int i_15_ = i_13_; i_15_ > 0; i_15_ >>= 1)
					i_14_++;
				((Class151) this).aByteArray6670 = new byte[i_14_];
				byte i_16_ = 0;
				for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
					if ((i_13_ & 1 << i_17_) > 0) {
						((Class151) this).aByteArray6670[i_17_] = i_16_;
						i_16_++;
					} else
						((Class151) this).aByteArray6670[i_17_] = (byte) -1;
				}
			} else if (i >= 60 && i < 70)
				((Class151) this).anIntArray6668[i - 60] = class330_sub46.readBigSmart(-1047249075);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.j(").append(')').toString());
		}
	}
	
	public boolean method1776(int i) {
		try {
			if (null == ((Class151) this).anIntArray6665)
				return true;
			boolean bool = true;
			synchronized (((Class169) ((Class151) this).aClass169_6661).aClass280_6761) {
				for (int i_18_ = 0; i_18_ < ((Class151) this).anIntArray6665.length; i_18_++) {
					if (!((Class169) ((Class151) this).aClass169_6661).aClass280_6761.hasStoredFile(((Class151) this).anIntArray6665[i_18_], 0, (byte) 32))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.i(").append(')').toString());
		}
	}
	
	public boolean method1777(short i) {
		try {
			boolean bool = true;
			synchronized (((Class169) ((Class151) this).aClass169_6661).aClass280_6761) {
				for (int i_19_ = 0; i_19_ < 5; i_19_++) {
					if (-1 != ((Class151) this).anIntArray6668[i_19_] && !(((Class169) ((Class151) this).aClass169_6661).aClass280_6761.hasStoredFile(((Class151) this).anIntArray6668[i_19_], 0, (byte) 32)))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.o(").append(')').toString());
		}
	}
	
	public Model method1778(int i) {
		try {
			Model[] class98s = new Model[5];
			int i_20_ = 0;
			synchronized (((Class169) ((Class151) this).aClass169_6661).aClass280_6761) {
				for (int i_21_ = 0; i_21_ < 5; i_21_++) {
					if (((Class151) this).anIntArray6668[i_21_] != -1)
						class98s[i_20_++] = (Model.loadModel((((Class169) ((Class151) this).aClass169_6661).aClass280_6761), ((Class151) this).anIntArray6668[i_21_], 0));
				}
			}
			for (int i_22_ = 0; i_22_ < 5; i_22_++) {
				if (class98s[i_22_] != null && class98s[i_22_].anInt881 < 13)
					class98s[i_22_].method1196(2);
			}
			Model class98 = new Model(class98s, i_20_);
			if (null != ((Class151) this).aShortArray6662) {
				for (int i_23_ = 0; i_23_ < ((Class151) this).aShortArray6662.length; i_23_++)
					class98.color((((Class151) this).aShortArray6662[i_23_]), (((Class151) this).aShortArray6663[i_23_]));
			}
			if (((Class151) this).aShortArray6664 != null) {
				for (int i_24_ = 0; i_24_ < ((Class151) this).aShortArray6664.length; i_24_++)
					class98.method1200((((Class151) this).aShortArray6664[i_24_]), (((Class151) this).aShortArray6660[i_24_]));
			}
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.s(").append(')').toString());
		}
	}
	
	Class151() {
		/* empty */
	}
	
	static {
		anIntArray6667 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
	}

	public Model method1779(byte i) {
		try {
			if (((Class151) this).anIntArray6665 == null)
				return null;
			Model[] class98s = new Model[((Class151) this).anIntArray6665.length];
			synchronized (((Class169) ((Class151) this).aClass169_6661).aClass280_6761) {
				for (int i_25_ = 0; i_25_ < ((Class151) this).anIntArray6665.length; i_25_++)
					class98s[i_25_] = Model.loadModel((((Class169) (((Class151) this).aClass169_6661)).aClass280_6761), (((Class151) this).anIntArray6665[i_25_]), 0);
			}
			for (int i_26_ = 0; i_26_ < ((Class151) this).anIntArray6665.length; i_26_++) {
				if (class98s[i_26_].anInt881 < 13)
					class98s[i_26_].method1196(2);
			}
			Model class98;
			if (class98s.length == 1)
				class98 = class98s[0];
			else
				class98 = new Model(class98s, class98s.length);
			if (null == class98)
				return null;
			if (null != ((Class151) this).aShortArray6662) {
				for (int i_27_ = 0; i_27_ < ((Class151) this).aShortArray6662.length; i_27_++)
					class98.color((((Class151) this).aShortArray6662[i_27_]), (((Class151) this).aShortArray6663[i_27_]));
			}
			if (null != ((Class151) this).aShortArray6664) {
				for (int i_28_ = 0; i_28_ < ((Class151) this).aShortArray6664.length; i_28_++)
					class98.method1200((((Class151) this).aShortArray6664[i_28_]), (((Class151) this).aShortArray6660[i_28_]));
			}
			return class98;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.p(").append(')').toString());
		}
	}

	static final void method1780(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).aClass154_4391.aBoolean1642 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.xw(").append(')').toString());
		}
	}

	static final void method1781(Class430 class430, byte i) {
		try {
			int i_29_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (client.anInt9257 * -843487341 == 2 && i_29_ < 652732387 * client.anInt9256)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1409329275 * client.aClass99Array9259[i_29_].anInt911;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gd.wv(").append(')').toString());
		}
	}
}
