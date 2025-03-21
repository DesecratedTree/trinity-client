/* Class447 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class447 {
	IndexTable aClass280_5550;
	Class367 aClass367_5551 = new Class367(64);

	public Class438 method5621(int i, byte i_0_) {
		try {
			Class438 class438;
			synchronized (((Class447) this).aClass367_5551) {
				class438 = (Class438) ((Class447) this).aClass367_5551.get((long) i);
			}
			if (class438 != null)
				return class438;
			byte[] is = (((Class447) this).aClass280_5550.getFile(-989081113 * Class103.aClass103_949.anInt982, i));
			class438 = new Class438();
			if (null != is)
				class438.method5591(new Buffer(is), 788801052);
			synchronized (((Class447) this).aClass367_5551) {
				((Class447) this).aClass367_5551.put(class438, (long) i);
			}
			return class438;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sm.r(").append(')').toString());
		}
	}

	public Class447(Class435 class435, Class454 class454, IndexTable class280) {
		((Class447) this).aClass280_5550 = class280;
		if (((Class447) this).aClass280_5550 != null)
			((Class447) this).aClass280_5550.method2763(Class103.aClass103_949.anInt982 * -989081113, -2099005501);
	}

	public void method5622(int i) {
		try {
			synchronized (((Class447) this).aClass367_5551) {
				((Class447) this).aClass367_5551.method4296(-1829052930);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sm.p(").append(')').toString());
		}
	}

	public void method5623(int i, int i_1_) {
		try {
			synchronized (((Class447) this).aClass367_5551) {
				((Class447) this).aClass367_5551.method4292(i, (byte) 6);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sm.i(").append(')').toString());
		}
	}

	public void method5624(byte i) {
		try {
			synchronized (((Class447) this).aClass367_5551) {
				((Class447) this).aClass367_5551.method4298((byte) 25);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sm.j(").append(')').toString());
		}
	}

	static final void method5625(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub20_7888.method5807((byte) 101) == 2 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sm.alr(").append(')').toString());
		}
	}

	static void method5626(Class330_Sub34 class330_sub34, int i, int i_2_, int i_3_, int i_4_) {
		try {
			class330_sub34.aClass330_Sub46_Sub2_7729.addInt1(i, (byte) 15);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEShortA(i_3_, -1450921191);
			class330_sub34.aClass330_Sub46_Sub2_7729.addLEShort(i_2_, -676872267);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sm.kw(").append(')').toString());
		}
	}

	static byte method5627(int i, int i_5_, byte i_6_) {
		try {
			if (-344921723 * Class476.aClass476_6902.anInt6882 != i)
				return (byte) 0;
			if (0 == (i_5_ & 0x1))
				return (byte) 1;
			return (byte) 2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sm.bs(").append(')').toString());
		}
	}
}
