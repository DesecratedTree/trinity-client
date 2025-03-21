/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class131 {
	IndexTable aClass280_1500;
	Class367 aClass367_1501 = new Class367(16);
	public static Class407 aClass407_1502;

	public void method1558(int i) {
		try {
			synchronized (((Class131) this).aClass367_1501) {
				((Class131) this).aClass367_1501.method4298((byte) 81);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fg.j(").append(')').toString());
		}
	}

	public void method1559(int i, int i_0_) {
		try {
			synchronized (((Class131) this).aClass367_1501) {
				((Class131) this).aClass367_1501.method4292(i, (byte) 37);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fg.i(").append(')').toString());
		}
	}

	public void method1560(int i) {
		try {
			synchronized (((Class131) this).aClass367_1501) {
				((Class131) this).aClass367_1501.method4296(538381811);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fg.p(").append(')').toString());
		}
	}

	public Class131(Class435 class435, Class454 class454, IndexTable class280) {
		((Class131) this).aClass280_1500 = class280;
		((Class131) this).aClass280_1500.method2763((-989081113 * (Class103.aClass103_947.anInt982)), -2010464000);
	}

	public Class127 method1561(int i, byte i_1_) {
		try {
			Class127 class127;
			synchronized (((Class131) this).aClass367_1501) {
				class127 = (Class127) ((Class131) this).aClass367_1501.get((long) i);
			}
			if (null != class127)
				return class127;
			byte[] is;
			synchronized (((Class131) this).aClass280_1500) {
				is = (((Class131) this).aClass280_1500.getFile(Class103.aClass103_947.anInt982 * -989081113, i));
			}
			class127 = new Class127();
			if (is != null)
				class127.method1542(new Buffer(is), 1699875310);
			synchronized (((Class131) this).aClass367_1501) {
				((Class131) this).aClass367_1501.put(class127, (long) i);
			}
			return class127;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fg.r(").append(')').toString());
		}
	}

	static final void method1562(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_2_ >= 1 && i_2_ <= 2) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897, i_2_, 1529848487);
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub8_7872, i_2_, 1830516867);
				Class435.method5568(1802265162);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fg.afc(").append(')').toString());
		}
	}

	static String method1563(IComponentDefinitions iComponentDefinitions, int i, int i_3_) {
		try {
			if (!client.method3924(iComponentDefinitions).method3264(i, -979598918) && iComponentDefinitions.anObjectArray1319 == null)
				return null;
			if (iComponentDefinitions.aStringArray1284 == null || iComponentDefinitions.aStringArray1284.length <= i || null == iComponentDefinitions.aStringArray1284[i] || iComponentDefinitions.aStringArray1284[i].trim().length() == 0) {
				if (client.aBoolean9161)
					return new StringBuilder().append("Hidden-").append(i).toString();
				return null;
			}
			return iComponentDefinitions.aStringArray1284[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fg.bp(").append(')').toString());
		}
	}

	static final void method1564(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aByte9283;
			if (-1 != client.aByte9283)
				client.aByte9283 = (byte) -6;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fg.aco(").append(')').toString());
		}
	}
}
