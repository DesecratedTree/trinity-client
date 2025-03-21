/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23 {
	static boolean aBoolean304 = false;

	Class23() throws Throwable {
		throw new Error();
	}

	public static Class401_Sub1 method476(int i, byte i_0_) {
		try {
			if (!Class398.aBoolean4117 || i < Class125.anInt1458 * 1010387987 || i > Class509.anInt5946 * -49635837)
				return null;
			return (Class132.aClass401_Sub1Array1505[i - Class125.anInt1458 * 1010387987]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ax.r(").append(')').toString());
		}
	}

	static final void method477(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_2_ = i_1_ >> 14 & 0x3fff;
			int i_3_ = i_1_ & 0x3fff;
			Class381 class381 = client.aClass304_9030.method3022(1197725750);
			i_2_ -= -1261027839 * class381.gameSceneBaseX;
			if (i_2_ < 0)
				i_2_ = 0;
			else if (i_2_ >= client.aClass304_9030.method2990(-624021327))
				i_2_ = client.aClass304_9030.method2990(-666472452);
			i_3_ -= class381.gameSceneBaseY * -1542584207;
			if (i_3_ < 0)
				i_3_ = 0;
			else if (i_3_ >= client.aClass304_9030.method3033((byte) -18))
				i_3_ = client.aClass304_9030.method3033((byte) -64);
			client.anInt9068 = ((i_2_ << 9) + 256) * 359378571;
			client.anInt9069 = ((i_3_ << 9) + 256) * 994362103;
			Class147.anInt1621 = 98309229;
			Class439.anInt4456 = 1180637393;
			Class457.anInt6844 = 1651776935;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ax.ahx(").append(')').toString());
		}
	}

	static final void method478(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -1870874309 * Class240.anInt2605;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ax.aow(").append(')').toString());
		}
	}

	static final void method479(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			Class402 class402 = Class128.aClass400_1478.method4700(i_4_, -644739134);
			if (class402 == null)
				throw new RuntimeException();
			Integer integer = (((Class430) class430).aClass154_4391.method1806(client.aClass435_9146.anInt4417 * -1358018753 << 16 | i_4_, (byte) 6));
			int i_5_;
			if (null == integer) {
				if (class402.aChar4137 == 'i' || '1' == class402.aChar4137)
					i_5_ = 0;
				else
					i_5_ = -1;
			} else
				i_5_ = integer.intValue();
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ax.bq(").append(')').toString());
		}
	}

	static final void method480(Class430 class430, byte i) {
		try {
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = ((Class430) class430).aClass330_Sub39_4395.aString7757;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ax.ys(").append(')').toString());
		}
	}
}
