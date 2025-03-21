/* Class561 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class561 implements Interface29 {
	static long aLong6974 = 500L;
	static long aLong6975 = 4611686018427387903L;
	static long aLong6976 = 4611686018427387904L;
	static long aLong6977 = 1L;
	int[] anIntArray6978;
	static int[] anIntArray6979 = new int[32];
	public int[] anIntArray6980;
	Class497 aClass497_6981 = new Class497(128);
	public static boolean aBoolean6982;

	int method6462(boolean bool, int i) {
		try {
			long l = Class312.method3111((byte) 64);
			for (Class330_Sub22 class330_sub22 = (Class330_Sub22) (bool ? ((Class561) this).aClass497_6981.method6099((byte) -51) : ((Class561) this).aClass497_6981.method6098((short) -32768)); null != class330_sub22; class330_sub22 = (Class330_Sub22) ((Class561) this).aClass497_6981.method6098((short) -32768)) {
				if ((-4509106026118440599L * class330_sub22.aLong7692 & 0x3fffffffffffffffL) < l) {
					if ((class330_sub22.aLong7692 * -4509106026118440599L & 0x4000000000000000L) != 0L) {
						int i_0_ = (int) (class330_sub22.aLong3341 * -6154793640677333111L);
						anIntArray6980[i_0_] = ((Class561) this).anIntArray6978[i_0_];
						class330_sub22.method3252(1488561806);
						return i_0_;
					}
					class330_sub22.method3252(160597995);
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.r(").append(')').toString());
		}
	}

	void method6463(short i) {
		try {
			for (int i_1_ = 0; i_1_ < 1876003131 * Class366_Sub4.aClass231_8007.anInt6763; i_1_++) {
				((Class561) this).anIntArray6978[i_1_] = 0;
				anIntArray6980[i_1_] = 0;
			}
			((Class561) this).aClass497_6981 = new Class497(128);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.j(").append(')').toString());
		}
	}

	public void method6464(int i, int i_2_, int i_3_) {
		try {
			anIntArray6980[i] = i_2_;
			Class330_Sub22 class330_sub22 = ((Class330_Sub22) ((Class561) this).aClass497_6981.method6094((long) i));
			if (class330_sub22 != null)
				class330_sub22.aLong7692 = (Class312.method3111((byte) 40) + 500L) * 2625245114264389337L;
			else {
				class330_sub22 = new Class330_Sub22(Class312.method3111((byte) 38) + 500L);
				((Class561) this).aClass497_6981.method6097(class330_sub22, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.i(").append(')').toString());
		}
	}

	public void method6465(int i, int i_4_, short i_5_) {
		try {
			Class382 class382 = Class428.aClass370_4364.method4312(i, (byte) 20);
			int i_6_ = -1094124161 * class382.anInt6675;
			int i_7_ = 946379215 * class382.anInt6676;
			int i_8_ = 151044347 * class382.anInt6677;
			int i_9_ = anIntArray6979[i_8_ - i_7_];
			if (i_4_ < 0 || i_4_ > i_9_)
				i_4_ = 0;
			i_9_ <<= i_7_;
			method6464(i_6_, (anIntArray6980[i_6_] & (i_9_ ^ 0xffffffff) | i_4_ << i_7_ & i_9_), 244452946);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.o(").append(')').toString());
		}
	}

	void sendConfigByFile(int i, int i_10_, int i_11_) {
		try {
			Class382 class382 = Class428.aClass370_4364.method4312(i, (byte) -49);
			int i_12_ = -1094124161 * class382.anInt6675;
			int i_13_ = class382.anInt6676 * 946379215;
			int i_14_ = class382.anInt6677 * 151044347;
			int i_15_ = anIntArray6979[i_14_ - i_13_];
			if (i_10_ < 0 || i_10_ > i_15_)
				i_10_ = 0;
			i_15_ <<= i_13_;
			sendConfig(i_12_, (((Class561) this).anIntArray6978[i_12_] & (i_15_ ^ 0xffffffff)) | i_10_ << i_13_ & i_15_, -1099000711);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.s(").append(')').toString());
		}
	}

	public int method306(int i, int i_16_) {
		try {
			return anIntArray6980[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.f(").append(')').toString());
		}
	}

	public int method310(int i, int i_17_) {
		try {
			Class382 class382 = Class428.aClass370_4364.method4312(i, (byte) -60);
			int i_18_ = class382.anInt6675 * -1094124161;
			int i_19_ = class382.anInt6676 * 946379215;
			int i_20_ = class382.anInt6677 * 151044347;
			int i_21_ = anIntArray6979[i_20_ - i_19_];
			return anIntArray6980[i_18_] >> i_19_ & i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.z(").append(')').toString());
		}
	}

	public int method308(int i) {
		return anIntArray6980[i];
	}

	public int method312(int i) {
		Class382 class382 = Class428.aClass370_4364.method4312(i, (byte) -5);
		int i_22_ = class382.anInt6675 * -1094124161;
		int i_23_ = class382.anInt6676 * 946379215;
		int i_24_ = class382.anInt6677 * 151044347;
		int i_25_ = anIntArray6979[i_24_ - i_23_];
		return anIntArray6980[i_22_] >> i_23_ & i_25_;
	}

	public Class561() {
		((Class561) this).anIntArray6978 = new int[1876003131 * Class366_Sub4.aClass231_8007.anInt6763];
		anIntArray6980 = new int[1876003131 * Class366_Sub4.aClass231_8007.anInt6763];
	}

	static {
		int i = 2;
		for (int i_26_ = 0; i_26_ < 32; i_26_++) {
			anIntArray6979[i_26_] = i - 1;
			i += i;
		}
	}

	public int method309(int i) {
		return anIntArray6980[i];
	}

	public int method314(int i) {
		return anIntArray6980[i];
	}

	public int method311(int i) {
		return anIntArray6980[i];
	}

	void sendConfig(int i, int i_27_, int i_28_) {
		try {
			((Class561) this).anIntArray6978[i] = i_27_;
			Class330_Sub22 class330_sub22 = ((Class330_Sub22) ((Class561) this).aClass497_6981.method6094((long) i));
			if (class330_sub22 != null) {
				if (4611686018427387905L != -4509106026118440599L * class330_sub22.aLong7692)
					class330_sub22.aLong7692 = (Class312.method3111((byte) 22) + 500L | 0x4000000000000000L) * 2625245114264389337L;
			} else {
				class330_sub22 = new Class330_Sub22(4611686018427387905L);
				((Class561) this).aClass497_6981.method6097(class330_sub22, (long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.p(").append(')').toString());
		}
	}

	public int method313(int i) {
		Class382 class382 = Class428.aClass370_4364.method4312(i, (byte) -70);
		int i_29_ = class382.anInt6675 * -1094124161;
		int i_30_ = class382.anInt6676 * 946379215;
		int i_31_ = class382.anInt6677 * 151044347;
		int i_32_ = anIntArray6979[i_31_ - i_30_];
		return anIntArray6980[i_29_] >> i_30_ & i_32_;
	}

	public int method307(int i) {
		Class382 class382 = Class428.aClass370_4364.method4312(i, (byte) -38);
		int i_33_ = class382.anInt6675 * -1094124161;
		int i_34_ = class382.anInt6676 * 946379215;
		int i_35_ = class382.anInt6677 * 151044347;
		int i_36_ = anIntArray6979[i_35_ - i_34_];
		return anIntArray6980[i_33_] >> i_34_ & i_36_;
	}

	static final void method6468(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class360.anInt3786 * 1521504319;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.aib(").append(')').toString());
		}
	}

	static final void method6469(Class430 class430, int i) {
		try {
			int i_37_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class426 class426;
			if (((Class430) class430).aBoolean4398)
				class426 = ((Class430) class430).aClass426_4384;
			else
				class426 = ((Class430) class430).aClass426_4370;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class426.method5315((((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067), i_37_, -1, (byte) -81) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.ara(").append(')').toString());
		}
	}

	static final void method6470(Class430 class430, byte i) {
		try {
			Class392.method4610((((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396), class430, 462768199);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("y.aro(").append(')').toString());
		}
	}
}
