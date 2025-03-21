/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class371 implements Interface20 {
	int anInt6654;
	int anInt6655;

	public boolean method285(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355) {
		for (int i_0_ = 0; i_0_ < i && i_0_ < interface18s.length; i_0_++) {
			Interface18 interface18 = interface18s[i_0_];
			if (null != interface18 && (interface18.method264((byte) 0) == ((Class371) this).anInt6654 * 733116869) && (interface18.method268((byte) -127) == ((Class371) this).anInt6655 * -800172069))
				return true;
		}
		return false;
	}

	public boolean method282(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355) {
		for (int i_1_ = 0; i_1_ < i && i_1_ < interface18s.length; i_1_++) {
			Interface18 interface18 = interface18s[i_1_];
			if (null != interface18 && (interface18.method264((byte) 0) == ((Class371) this).anInt6654 * 733116869) && (interface18.method268((byte) -81) == ((Class371) this).anInt6655 * -800172069))
				return true;
		}
		return false;
	}

	public boolean method284(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355) {
		for (int i_2_ = 0; i_2_ < i && i_2_ < interface18s.length; i_2_++) {
			Interface18 interface18 = interface18s[i_2_];
			if (null != interface18 && (interface18.method264((byte) 0) == ((Class371) this).anInt6654 * 733116869) && (interface18.method268((byte) -125) == ((Class371) this).anInt6655 * -800172069))
				return true;
		}
		return false;
	}

	public boolean method283(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355, byte i_3_) {
		try {
			for (int i_4_ = 0; i_4_ < i && i_4_ < interface18s.length; i_4_++) {
				Interface18 interface18 = interface18s[i_4_];
				if (null == interface18) {
					if (i_3_ <= 0) {
						/* empty */
					}
				} else if ((interface18.method264((byte) 0) == ((Class371) this).anInt6654 * 733116869) && (interface18.method268((byte) -38) == ((Class371) this).anInt6655 * -800172069))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pl.r(").append(')').toString());
		}
	}

	Class371(int i, int i_5_) {
		((Class371) this).anInt6654 = i * -1269129971;
		((Class371) this).anInt6655 = 485870675 * i_5_;
	}

	static final void method4319(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class196.method2144(iComponentDefinitions, class120, class430, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pl.mk(").append(')').toString());
		}
	}

	static final void method4320(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_6_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_7_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			int i_8_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			Class498.method6110(6, i_6_ << 16 | i_7_, i_8_, "", (byte) 67);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pl.ane(").append(')').toString());
		}
	}

	static boolean method4321(int i) {
		try {
			if (null != client.aByteArray8959)
				return Class395.method4647(-1865505322);
			if (-1 != Class360.anInt3749 * -1208084343)
				return Class232.method2360(-904052712);
			return Class209.method2210(Class360.username, Class360.password, 185547004);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pl.r(").append(')').toString());
		}
	}

	static final void method4322(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_9_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_10_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class475.method5938(i_9_, i_10_, false, -1356996440);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pl.tv(").append(')').toString());
		}
	}
}
