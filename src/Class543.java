/* Class543 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class543 {
	Class367 aClass367_6252 = new Class367(64);
	IndexTable aClass280_6253;
	static Class524 aClass524_6254;
	public static IndexTable aClass280_6255;

	public Class537 method6339(int i, int i_0_) {
		try {
			Class537 class537;
			synchronized (((Class543) this).aClass367_6252) {
				class537 = (Class537) ((Class543) this).aClass367_6252.get((long) i);
			}
			if (class537 != null)
				return class537;
			byte[] is;
			synchronized (((Class543) this).aClass280_6253) {
				is = (((Class543) this).aClass280_6253.getFile(Class103.aClass103_935.anInt982 * -989081113, i));
			}
			class537 = new Class537();
			if (null != is)
				class537.method6320(new Buffer(is), (byte) 1);
			synchronized (((Class543) this).aClass367_6252) {
				((Class543) this).aClass367_6252.put(class537, (long) i);
			}
			return class537;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wm.r(").append(')').toString());
		}
	}

	public void method6340(int i) {
		try {
			synchronized (((Class543) this).aClass367_6252) {
				((Class543) this).aClass367_6252.method4298((byte) 80);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wm.j(").append(')').toString());
		}
	}

	public void method6341(int i, byte i_1_) {
		try {
			synchronized (((Class543) this).aClass367_6252) {
				((Class543) this).aClass367_6252.method4292(i, (byte) 100);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wm.i(").append(')').toString());
		}
	}

	public void method6342(int i) {
		try {
			synchronized (((Class543) this).aClass367_6252) {
				((Class543) this).aClass367_6252.method4296(1485805794);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wm.p(").append(')').toString());
		}
	}

	public Class543(Class435 class435, Class454 class454, IndexTable class280) {
		((Class543) this).aClass280_6253 = class280;
		if (((Class543) this).aClass280_6253 != null)
			((Class543) this).aClass280_6253.method2763(Class103.aClass103_935.anInt982 * -989081113, -2042945303);
	}

	static final void method6343(IComponentDefinitions iComponentDefinitions, Class430 class430, int i) {
		try {
			if (client.method3924(iComponentDefinitions).method3263((byte) -100) && null == client.aClass114_9078) {
				Class43.method589(751119487 * iComponentDefinitions.anInt1196, -790144721 * iComponentDefinitions.anInt1287, (byte) 50);
				client.aClass114_9078 = Class166.method1993(iComponentDefinitions.anInt1196 * 751119487, iComponentDefinitions.anInt1287 * -790144721, 534399539);
				Class404.method4738(client.aClass114_9078, 598354517);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wm.cy(").append(')').toString());
		}
	}

	static final void method6344(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, -1553533397);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1223 * -284059687;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wm.rq(").append(')').toString());
		}
	}
}
