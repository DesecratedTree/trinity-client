/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365 implements Interface20 {
	int[] anIntArray6653;

	public boolean method283(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355, byte i_0_) {
		try {
			int[] is = ((Class365) this).anIntArray6653;
			for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
				int i_2_ = is[i_1_];
				if (!class355.isKeyHeld(i_2_, 619938802))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pf.r(").append(')').toString());
		}
	}

	Class365(int[] is) {
		((Class365) this).anIntArray6653 = is;
	}

	public boolean method282(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355) {
		int[] is = ((Class365) this).anIntArray6653;
		for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
			int i_4_ = is[i_3_];
			if (!class355.isKeyHeld(i_4_, -951889871))
				return false;
		}
		return true;
	}

	public boolean method284(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355) {
		int[] is = ((Class365) this).anIntArray6653;
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			int i_6_ = is[i_5_];
			if (!class355.isKeyHeld(i_6_, 881274768))
				return false;
		}
		return true;
	}

	public boolean method285(Class330_Sub44 class330_sub44, Interface18[] interface18s, int i, Class355 class355) {
		int[] is = ((Class365) this).anIntArray6653;
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
			int i_8_ = is[i_7_];
			if (!class355.isKeyHeld(i_8_, -1963222194))
				return false;
		}
		return true;
	}

	static final void method4269(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class304.method3035(iComponentDefinitions, class120, class430, (byte) -23);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pf.jm(").append(')').toString());
		}
	}

	static final void method4270(Class430 class430, short i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			if ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]) != (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]))
				((Class430) class430).anInt4397 += ((((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]) * 1996761881);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pf.y(").append(')').toString());
		}
	}

	public static void method4271(int i) {
		try {
			Class110.aClass330_Sub40_Sub2_1155.method3594(-1636338413);
			MusicManager.currentState = 1408571369;
			Class110.musicArchive = null;
			Class288.aClass330_Sub40_Sub2_2955 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pf.w(").append(')').toString());
		}
	}

	static final void method4272(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_9_, 1898737865);
			Class120 class120 = Class3.aClass120Array56[i_9_ >> 16];
			Class274.method2705(iComponentDefinitions, class120, class430, 447127941);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pf.mq(").append(')').toString());
		}
	}
}
