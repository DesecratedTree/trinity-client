/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class380 {
	public static int anInt3954 = 128;
	IndexTable aClass280_3955;
	Class367 aClass367_3956;
	public static int anInt3957 = 64;
	Class367 aClass367_3958 = new Class367(128);
	IndexTable aClass280_3959;
	static String[] aStringArray3960;

	public Class372 method4387(int i, byte i_0_) {
		try {
			Class372 class372;
			synchronized (((Class380) this).aClass367_3958) {
				class372 = (Class372) ((Class380) this).aClass367_3958.get((long) i);
			}
			if (null != class372)
				return class372;
			byte[] is;
			synchronized (((Class380) this).aClass280_3959) {
				is = (((Class380) this).aClass280_3959.getFile(-989081113 * Class103.aClass103_960.anInt982, i));
			}
			class372 = new Class372();
			class372.anInt3871 = i * -1840363191;
			((Class372) class372).aClass380_3904 = this;
			if (null != is)
				class372.method4323(new Buffer(is), 50990247);
			class372.method4324((byte) 56);
			synchronized (((Class380) this).aClass367_3958) {
				((Class380) this).aClass367_3958.put(class372, (long) i);
			}
			return class372;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.r(").append(')').toString());
		}
	}

	public void method4388(int i) {
		try {
			synchronized (((Class380) this).aClass367_3958) {
				((Class380) this).aClass367_3958.method4298((byte) 27);
			}
			synchronized (((Class380) this).aClass367_3956) {
				((Class380) this).aClass367_3956.method4298((byte) 59);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.i(").append(')').toString());
		}
	}

	public void method4389(int i, byte i_1_) {
		try {
			synchronized (((Class380) this).aClass367_3958) {
				((Class380) this).aClass367_3958.method4292(i, (byte) 39);
			}
			synchronized (((Class380) this).aClass367_3956) {
				((Class380) this).aClass367_3956.method4292(i, (byte) 83);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.p(").append(')').toString());
		}
	}

	public void method4390(int i) {
		try {
			synchronized (((Class380) this).aClass367_3958) {
				((Class380) this).aClass367_3958.method4296(1289706930);
			}
			synchronized (((Class380) this).aClass367_3956) {
				((Class380) this).aClass367_3956.method4296(919831944);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.o(").append(')').toString());
		}
	}

	public void method4391(int i, int i_2_, int i_3_) {
		try {
			((Class380) this).aClass367_3958 = new Class367(i);
			((Class380) this).aClass367_3956 = new Class367(i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.j(").append(')').toString());
		}
	}

	public Class380(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_4_) {
		((Class380) this).aClass367_3956 = new Class367(64);
		((Class380) this).aClass280_3959 = class280;
		((Class380) this).aClass280_3955 = class280_4_;
		((Class380) this).aClass280_3959.method2763((-989081113 * (Class103.aClass103_960.anInt982)), -2088833459);
	}

	static final void method4392(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class162.method1915((char) i_5_, -2138245903) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.aam(").append(')').toString());
		}
	}

	public static boolean method4393(int i, int i_6_) {
		try {
			return (i & -i) == i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.s(").append(')').toString());
		}
	}

	static void method4394(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1] = Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1]), -2125645711).method4638(Class158.aClass561_6474, 1579238983) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.l(").append(')').toString());
		}
	}

	public static final void method4395(IComponentDefinitions iComponentDefinitions, int i, int i_7_, byte i_8_) {
		try {
			if (client.aClass114_9165 == null && !Class484.aBoolean5782 && (null != iComponentDefinitions && Class497.method6102(iComponentDefinitions, 972705327))) {
				client.aClass114_9165 = iComponentDefinitions;
				client.aClass114_9242 = Class195.method2139(iComponentDefinitions, (byte) 8);
				client.anInt8994 = i * 94654545;
				client.anInt9054 = -1980241589 * i_7_;
				Class307.anInt3169 = 0;
				client.aBoolean9178 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pu.le(").append(')').toString());
		}
	}
}
