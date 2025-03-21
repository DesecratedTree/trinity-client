/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class495 {
	Class367 aClass367_5870 = new Class367(64);
	IndexTable aClass280_5871;
	public static Class515 aClass515_5872;

	public Class500 method6086(int i, byte i_0_) {
		try {
			Class500 class500;
			synchronized (((Class495) this).aClass367_5870) {
				class500 = (Class500) ((Class495) this).aClass367_5870.get((long) i);
			}
			if (class500 != null)
				return class500;
			byte[] is = ((Class495) this).aClass280_5871.getFile(((Class103.aClass103_948.anInt982) * -989081113), i);
			class500 = new Class500();
			if (null != is)
				class500.method6120(new Buffer(is), (byte) 49);
			synchronized (((Class495) this).aClass367_5870) {
				((Class495) this).aClass367_5870.put(class500, (long) i);
			}
			return class500;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ul.r(").append(')').toString());
		}
	}

	public void method6087(int i) {
		try {
			synchronized (((Class495) this).aClass367_5870) {
				((Class495) this).aClass367_5870.method4298((byte) 67);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ul.j(").append(')').toString());
		}
	}

	public void method6088(int i, int i_1_) {
		try {
			synchronized (((Class495) this).aClass367_5870) {
				((Class495) this).aClass367_5870.method4292(i, (byte) 108);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ul.i(").append(')').toString());
		}
	}

	public void method6089(int i) {
		try {
			synchronized (((Class495) this).aClass367_5870) {
				((Class495) this).aClass367_5870.method4296(-1880836915);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ul.p(").append(')').toString());
		}
	}

	public Class495(Class435 class435, Class454 class454, IndexTable class280) {
		((Class495) this).aClass280_5871 = class280;
		if (null != ((Class495) this).aClass280_5871)
			((Class495) this).aClass280_5871.method2763(-989081113 * Class103.aClass103_948.anInt982, -2037121268);
	}

	static final void method6090(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (-1 == i_2_)
				throw new RuntimeException();
			Class506 class506 = Class211.aClass505_2062.method6140(i_2_, 1402864961);
			if ('s' != class506.aChar5921)
				throw new RuntimeException();
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class506.method6146(string, (byte) 1) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ul.vh(").append(')').toString());
		}
	}

	static boolean method6091(int i, short i_3_) {
		try {
			return 15 == i || 11 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ul.fz(").append(')').toString());
		}
	}
}
