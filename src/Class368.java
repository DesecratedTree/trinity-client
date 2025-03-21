/* Class368 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class368 {
	Class367 aClass367_3865;
	IndexTable aClass280_3866;
	IndexTable aClass280_3867;
	Class367 aClass367_3868 = new Class367(20);
	static int anInt3869;

	public Class375 method4305(int i, int i_0_) {
		try {
			Class375 class375;
			synchronized (((Class368) this).aClass367_3865) {
				class375 = (Class375) ((Class368) this).aClass367_3865.get((long) i);
			}
			if (class375 != null)
				return class375;
			byte[] is;
			synchronized (((Class368) this).aClass280_3867) {
				is = (((Class368) this).aClass280_3867.getFile(-989081113 * Class103.aClass103_954.anInt982, i));
			}
			class375 = new Class375();
			((Class375) class375).aClass368_3928 = this;
			if (is != null)
				class375.method4346(new Buffer(is), (byte) 1);
			synchronized (((Class368) this).aClass367_3865) {
				((Class368) this).aClass367_3865.put(class375, (long) i);
			}
			return class375;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pi.r(").append(')').toString());
		}
	}

	public void method4306(short i) {
		try {
			synchronized (((Class368) this).aClass367_3865) {
				((Class368) this).aClass367_3865.method4298((byte) 20);
			}
			synchronized (((Class368) this).aClass367_3868) {
				((Class368) this).aClass367_3868.method4298((byte) 127);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pi.j(").append(')').toString());
		}
	}

	public void method4307(int i, short i_1_) {
		try {
			synchronized (((Class368) this).aClass367_3865) {
				((Class368) this).aClass367_3865.method4292(i, (byte) 104);
			}
			synchronized (((Class368) this).aClass367_3868) {
				((Class368) this).aClass367_3868.method4292(i, (byte) 44);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pi.i(").append(')').toString());
		}
	}

	public void method4308(int i) {
		try {
			synchronized (((Class368) this).aClass367_3865) {
				((Class368) this).aClass367_3865.method4296(169879179);
			}
			synchronized (((Class368) this).aClass367_3868) {
				((Class368) this).aClass367_3868.method4296(-477658572);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pi.p(").append(')').toString());
		}
	}

	public Class368(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_2_) {
		((Class368) this).aClass367_3865 = new Class367(64);
		((Class368) this).aClass280_3866 = class280_2_;
		((Class368) this).aClass280_3867 = class280;
		((Class368) this).aClass280_3867.method2763((Class103.aClass103_954.anInt982) * -989081113, -2051003570);
	}

	static final void method4309(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 1434092661 * iComponentDefinitions.anInt1184;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pi.pt(").append(')').toString());
		}
	}

	static final void method4310(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -1964238475 * ((Class430) class430).aClass154_4391.anInt1653;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pi.xc(").append(')').toString());
		}
	}
}
