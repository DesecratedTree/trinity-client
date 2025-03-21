/* Class416 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class416 {
	Class367 aClass367_4267 = new Class367(64);
	IndexTable aClass280_4268;
	int anInt4269;
	Class367 aClass367_4270 = new Class367(60);
	IndexTable aClass280_4271;

	public void method5250(int i, short i_0_) {
		try {
			synchronized (((Class416) this).aClass367_4267) {
				((Class416) this).aClass367_4267.method4292(i, (byte) 118);
			}
			synchronized (((Class416) this).aClass367_4270) {
				((Class416) this).aClass367_4270.method4292(i, (byte) 113);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.p(").append(')').toString());
		}
	}

	public void method5251(int i, int i_1_) {
		try {
			((Class416) this).anInt4269 = -1873923769 * i;
			synchronized (((Class416) this).aClass367_4270) {
				((Class416) this).aClass367_4270.method4298((byte) 79);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.j(").append(')').toString());
		}
	}

	public Class416(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_2_) {
		((Class416) this).aClass280_4271 = class280;
		((Class416) this).aClass280_4268 = class280_2_;
		int i = ((Class416) this).aClass280_4271.method2764(2104710672) - 1;
		Class103.aClass103_927.method1226((byte) 0);
		((Class416) this).aClass280_4271.method2763(i, -2054015234);
	}

	public void method5252(int i) {
		try {
			synchronized (((Class416) this).aClass367_4267) {
				((Class416) this).aClass367_4267.method4296(-970046526);
			}
			synchronized (((Class416) this).aClass367_4270) {
				((Class416) this).aClass367_4270.method4296(-970674617);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.o(").append(')').toString());
		}
	}

	public void method5253(short i) {
		try {
			synchronized (((Class416) this).aClass367_4267) {
				((Class416) this).aClass367_4267.method4298((byte) 73);
			}
			synchronized (((Class416) this).aClass367_4270) {
				((Class416) this).aClass367_4270.method4298((byte) 114);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.i(").append(')').toString());
		}
	}

	public Class437 method5254(int i, int i_3_) {
		try {
			Class437 class437;
			synchronized (((Class416) this).aClass367_4267) {
				class437 = (Class437) ((Class416) this).aClass367_4267.get((long) i);
			}
			if (null != class437)
				return class437;
			byte[] is;
			synchronized (((Class416) this).aClass280_4271) {
				is = (((Class416) this).aClass280_4271.getFile(Class103.aClass103_927.method1228(i, 1491459717), Class103.aClass103_927.method1227(i, (byte) -32)));
			}
			class437 = new Class437();
			((Class437) class437).aClass416_4442 = this;
			((Class437) class437).anInt4429 = i * -816416815;
			if (is != null)
				class437.method5580(new Buffer(is), -1903137404);
			synchronized (((Class416) this).aClass367_4267) {
				((Class416) this).aClass367_4267.put(class437, (long) i);
			}
			return class437;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.r(").append(')').toString());
		}
	}

	public static Class470[] method5255(int i) {
		try {
			return (new Class470[] { Class470.aClass470_6864, Class470.aClass470_6866, Class470.aClass470_6865, Class470.aClass470_6869, Class470.aClass470_6863, Class470.aClass470_6871, Class470.aClass470_6867, Class470.aClass470_6868, Class470.aClass470_6873, Class470.aClass470_6876, Class470.aClass470_6870, Class470.aClass470_6872, Class470.aClass470_6874, Class470.aClass470_6875 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.r(").append(')').toString());
		}
	}

	public static final void method5256(Class432_Sub1 class432_sub1, int i, int i_4_) {
		try {
			Class276.method2729(class432_sub1, i, true, -2104233343);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.jm(").append(')').toString());
		}
	}

	static final void method5257(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class117 class117 = Class144.method1668(i_5_, (byte) 16);
			int i_6_ = -1;
			if (class117 != null)
				i_6_ = class117.anInt1385 * -234939133;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.acn(").append(')').toString());
		}
	}

	static final void method5258(int i) {
		try {
			Class141.aClass418_1566.method5272(5, (byte) 9);
			Class478.aClass499_5725.method6112(5, (byte) 0);
			Class425.aClass169_4344.method2028(5, -408081780);
			client.aClass304_9030.method3025((byte) 13).method5708(5, (byte) -4);
			Class158_Sub3.aClass553_8875.method6393(5, 1828251714);
			Class556.aClass510_6392.method6172(5, 1462668355);
			Class201.aClass436_6511.method5571(5, 807828311);
			Class136.aClass416_1527.method5250(5, (short) 25061);
			Class428.aClass370_4364.method4314(5, 1924694733);
			Class366_Sub4.aClass231_8007.method2348(5, -2123984948);
			Class499.aClass495_5893.method6088(5, -73159301);
			Class95_Sub10.aClass447_7170.method5623(5, 1560998046);
			Class95_Sub7.aClass536_7157.method6317(5, (byte) -122);
			Class128.aClass400_1478.method4701(5, 738589039);
			Class102.aClass362_924.method4252(5, (byte) -122);
			Class79.aClass380_666.method4389(5, (byte) 77);
			Class497.aClass552_5884.method6384(5, (short) -18019);
			Class301.aClass543_3059.method6341(5, (byte) -106);
			Class341.aClass342_3397.method3987(5, 1663084328);
			Class446.aClass131_5549.method1559(5, 1793975433);
			Class233.aClass519_2467.method6220(5, -2030717279);
			Class363.aClass527_3806.method6266(5, -554588865);
			Class142.aClass368_1568.method4307(5, (short) 5890);
			OutgoingPacket.aClass341_2578.method3975(5, (byte) 43);
			Class305.method3042(5, 1287718104);
			Class15.method445(50, -780447313);
			Class219.aClass230_2183.method2337(50, -1571685277);
			Class385.method4429(5, 2064578514);
			Class81.method953(5, (byte) -7);
			client.aClass367_8974.method4292(5, (byte) 53);
			Class484.aClass367_5788.method4292(5, (byte) 74);
			Class428.aClass367_4355.method4292(5, (byte) 124);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.gf(").append(')').toString());
		}
	}

	public static boolean method5259(byte i) {
		try {
			if (MusicManager.currentState * 242692185 != 0)
				return true;
			return Class110.aClass330_Sub40_Sub2_1155.method3595(-1841646113);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.k(").append(')').toString());
		}
	}

	static final void method5260(Class430 class430, byte i) throws Exception_Sub4 {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_7_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			float f = ((float) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]) / 1000.0F);
			Class401_Sub1.aClass145_Sub1_8249.method1683(i_7_, f, -1426800827);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.aig(").append(')').toString());
		}
	}

	static final void method5261(Class430 class430, short i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_8_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_9_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			int i_10_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			Class141 class141 = Class217.method2247(i_8_, -585750078);
			float f = (float) i_9_;
			if (class141 == Class141.aClass141_1562 || Class141.aClass141_1559 == class141 || class141 == Class141.aClass141_1564)
				f = Class257.method2541(i_9_);
			Class330_Sub36_Sub15_Sub2 class330_sub36_sub15_sub2 = new Class330_Sub36_Sub15_Sub2(Class401_Sub1.aClass145_Sub1_8249.method1728(1009977096), class141, f, (float) i_10_ / 1000.0F);
			Class401_Sub1.aClass145_Sub1_8249.method1702(class330_sub36_sub15_sub2, 261226932);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 514349311 * class330_sub36_sub15_sub2.anInt9720;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rh.ahk(").append(')').toString());
		}
	}
}
