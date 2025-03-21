/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class88 {
	int anInt725;
	Class476 aClass476_726;
	int anInt727;
	int anInt728;
	int anInt729;
	int anInt730;

	void method1048(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			IncomingPacket.method2272(i, i_0_, i_1_, (-130763309 * ((Class88) this).aClass476_726.anInt6901), ((Class88) this).anInt728 * -244970465, (-344921723 * ((Class88) this).aClass476_726.anInt6882), i_2_, -1519253705);
			((Class88) this).anInt725 = 421093531 * i;
			((Class88) this).anInt727 = 591176185 * i_0_;
			((Class88) this).anInt729 = 1710076125 * i_1_;
			((Class88) this).anInt730 = -1559336687 * i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.r(").append(')').toString());
		}
	}

	void method1049(int i) {
		try {
			IncomingPacket.method2272(-116947565 * ((Class88) this).anInt725, -807907255 * ((Class88) this).anInt727, ((Class88) this).anInt729 * -1122588811, -130763309 * ((Class88) this).aClass476_726.anInt6901, -1, -344921723 * ((Class88) this).aClass476_726.anInt6882, -761944079 * ((Class88) this).anInt730, -432124637);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.j(").append(')').toString());
		}
	}

	boolean method1050(int i) {
		try {
			if (((Class88) this).anInt728 * -244970465 >= 0) {
				Class473 class473 = Class201.aClass463_6510.method5705(((((Class88) this).anInt728) * -244970465), (byte) -33);
				boolean bool = class473.method5895(-344921723 * (((Class88) this).aClass476_726.anInt6882), (byte) -103);
				int[] is = class473.method5905(-401787340);
				if (null != is) {
					int[] is_4_ = is;
					for (int i_5_ = 0; i_5_ < is_4_.length; i_5_++) {
						int i_6_ = is_4_[i_5_];
						bool &= Class201.aClass436_6511.method5570(i_6_, -2080479661).method5600(2018969373);
					}
				}
				return bool;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.i(").append(')').toString());
		}
	}

	Class88(Buffer class330_sub46) {
		((Class88) this).anInt728 = class330_sub46.readBigSmart(-2115176254) * -874090529;
		((Class88) this).aClass476_726 = ((Class476) Class479.method6015(Class329.method3250(2121020296), class330_sub46.readUnsignedByte(516218932), (byte) 107));
	}

	static final void method1051(Class430 class430, short i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, 1955655997);
			Class120 class120 = Class3.aClass120Array56[i_7_ >> 16];
			Class473.method5913(iComponentDefinitions, class120, class430, 2112186201);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.cm(").append(')').toString());
		}
	}

	static final void method1052(Class430 class430, byte i) {
		try {
			int i_8_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_8_, 1588291391);
			Class120 class120 = Class3.aClass120Array56[i_8_ >> 16];
			Class122.method1451(iComponentDefinitions, class120, class430, (byte) 16);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.lr(").append(')').toString());
		}
	}

	static final void method1053(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (((Class430) class430).aClass330_Sub39_4395.method3544((String) (((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 -= 2087905371) * -1378875437)]), (byte) 8));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.yf(").append(')').toString());
		}
	}

	static void method1054(int i, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_) {
		try {
			long l = (long) (i | (bool ? -2147483648 : 0));
			Class330_Sub1 class330_sub1 = (Class330_Sub1) Class330_Sub1.aClass497_7501.method6094(l);
			if (null == class330_sub1) {
				class330_sub1 = new Class330_Sub1();
				Class330_Sub1.aClass497_7501.method6097(class330_sub1, l);
			}
			if (((Class330_Sub1) class330_sub1).anIntArray7500.length <= i_9_) {
				int[] is = new int[i_9_ + 1];
				int[] is_13_ = new int[1 + i_9_];
				for (int i_14_ = 0; (i_14_ < ((Class330_Sub1) class330_sub1).anIntArray7500.length); i_14_++) {
					is[i_14_] = (((Class330_Sub1) class330_sub1).anIntArray7500[i_14_]);
					is_13_[i_14_] = (((Class330_Sub1) class330_sub1).anIntArray7497[i_14_]);
				}
				for (int i_15_ = (((Class330_Sub1) class330_sub1).anIntArray7500).length; i_15_ < i_9_; i_15_++) {
					is[i_15_] = -1;
					is_13_[i_15_] = 0;
				}
				((Class330_Sub1) class330_sub1).anIntArray7500 = is;
				((Class330_Sub1) class330_sub1).anIntArray7497 = is_13_;
			}
			((Class330_Sub1) class330_sub1).anIntArray7500[i_9_] = i_10_;
			((Class330_Sub1) class330_sub1).anIntArray7497[i_9_] = i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.f(").append(')').toString());
		}
	}

	static final void method1055(Class430 class430, int i) {
		try {
			((Class430) class430).aLongArray4379[((((Class430) class430).anInt4380 += 2099007437) * -1969146619 - 1)] = (((Class430) class430).aLongArray4372[(((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397])]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dn.bt(").append(')').toString());
		}
	}
}
