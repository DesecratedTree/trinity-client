/* Class553 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class553 {
	IndexTable aClass280_6364;
	Class454 aClass454_6365;
	boolean aBoolean6366;
	Class367 aClass367_6367;
	IndexTable aClass280_6368;
	Class435 aClass435_6369;
	Class367 aClass367_6370;
	Class367 aClass367_6371 = new Class367(64);
	int anInt6372;
	String[] aStringArray6373;

	public void method6387(boolean bool, int i) {
		try {
			if (((Class553) this).aBoolean6366 != bool) {
				((Class553) this).aBoolean6366 = bool;
				method6388((byte) 10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.j(").append(')').toString());
		}
	}

	public void method6388(byte i) {
		try {
			synchronized (((Class553) this).aClass367_6371) {
				((Class553) this).aClass367_6371.method4298((byte) 99);
			}
			synchronized (((Class553) this).aClass367_6370) {
				((Class553) this).aClass367_6370.method4298((byte) 112);
			}
			synchronized (((Class553) this).aClass367_6367) {
				((Class553) this).aClass367_6367.method4298((byte) 21);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.p(").append(')').toString());
		}
	}

	public void method6389(int i) {
		try {
			synchronized (((Class553) this).aClass367_6370) {
				((Class553) this).aClass367_6370.method4298((byte) 72);
			}
			synchronized (((Class553) this).aClass367_6367) {
				((Class553) this).aClass367_6367.method4298((byte) 45);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.o(").append(')').toString());
		}
	}

	public void method6390(int i, int i_0_) {
		try {
			((Class553) this).anInt6372 = 98558801 * i;
			synchronized (((Class553) this).aClass367_6370) {
				((Class553) this).aClass367_6370.method4298((byte) 71);
			}
			synchronized (((Class553) this).aClass367_6367) {
				((Class553) this).aClass367_6367.method4298((byte) 111);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.i(").append(')').toString());
		}
	}

	public void method6391(int i) {
		try {
			synchronized (((Class553) this).aClass367_6371) {
				((Class553) this).aClass367_6371.method4296(-1334914376);
			}
			synchronized (((Class553) this).aClass367_6370) {
				((Class553) this).aClass367_6370.method4296(-1053665866);
			}
			synchronized (((Class553) this).aClass367_6367) {
				((Class553) this).aClass367_6367.method4296(-78016161);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.f(").append(')').toString());
		}
	}

	public Class551 method6392(int i, int i_1_) {
		try {
			Class551 class551;
			synchronized (((Class553) this).aClass367_6371) {
				class551 = (Class551) ((Class553) this).aClass367_6371.get((long) i);
			}
			if (class551 != null)
				return class551;
			byte[] is;
			synchronized (((Class553) this).aClass280_6364) {
				is = (((Class553) this).aClass280_6364.getFile(Class103.aClass103_940.method1228(i, -1572263562), Class103.aClass103_940.method1227(i, (byte) -77)));
			}
			class551 = new Class551();
			class551.anInt6293 = i * -258995813;
			((Class551) class551).aClass553_6292 = this;
			class551.aStringArray6311 = (String[]) ((Class553) this).aStringArray6373.clone();
			if (null != is)
				class551.method6365(new Buffer(is), (short) 27252);
			class551.method6375(-1810737051);
			synchronized (((Class553) this).aClass367_6371) {
				((Class553) this).aClass367_6371.put(class551, (long) i);
			}
			return class551;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.r(").append(')').toString());
		}
	}

	public Class553(Class435 class435, Class454 class454, boolean bool, IndexTable class280, IndexTable class280_2_) {
		((Class553) this).aClass367_6370 = new Class367(50);
		((Class553) this).aClass367_6367 = new Class367(5);
		((Class553) this).aClass435_6369 = class435;
		((Class553) this).aClass454_6365 = class454;
		((Class553) this).aBoolean6366 = bool;
		((Class553) this).aClass280_6364 = class280;
		((Class553) this).aClass280_6368 = class280_2_;
		if (null != ((Class553) this).aClass280_6364) {
			int i = ((Class553) this).aClass280_6364.method2764(1866904367) - 1;
			Class103.aClass103_940.method1226((byte) 0);
			((Class553) this).aClass280_6364.method2763(i, -2145797577);
		}
		if (((Class553) this).aClass435_6369 == Class435.aClass435_4421)
			((Class553) this).aStringArray6373 = (new String[] { null, null, null, null, null, Class526.aClass526_6068.method6257((((Class553) this).aClass454_6365), 991479434) });
		else
			((Class553) this).aStringArray6373 = new String[] { null, null, null, null, null, null };
	}

	public void method6393(int i, int i_3_) {
		try {
			synchronized (((Class553) this).aClass367_6371) {
				((Class553) this).aClass367_6371.method4292(i, (byte) 96);
			}
			synchronized (((Class553) this).aClass367_6370) {
				((Class553) this).aClass367_6370.method4292(i, (byte) 75);
			}
			synchronized (((Class553) this).aClass367_6367) {
				((Class553) this).aClass367_6367.method4292(i, (byte) 26);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.s(").append(')').toString());
		}
	}

	static final void method6394(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class91.method1069(iComponentDefinitions, class120, class430, 454213422);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.ea(").append(')').toString());
		}
	}

	public static Class_ra method6395(Canvas canvas, Interface_ma interface_ma, int i, int i_4_, int i_5_) {
		try {
			return new Class_ra_Sub3(canvas, interface_ma, i, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ww.r(").append(')').toString());
		}
	}
}
