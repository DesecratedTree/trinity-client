/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class463 {
	Class454 aClass454_5571;
	IndexTable aClass280_5572;
	Class367 aClass367_5573 = new Class367(256);
	Class367 aClass367_5574;
	IndexTable aClass280_5575;
	public static int anInt5576 = 256;
	Class435 aClass435_5577;
	Class367 aClass367_5578 = new Class367(500);
	Class367 aClass367_5579 = new Class367(30);
	String[] aStringArray5580;
	int anInt5581;
	Class485 aClass485_5582;
	Model[] aClass98Array5583;
	boolean aBoolean5584;
	static int anInt5585;

	public Class473 method5705(int i, byte i_0_) {
		try {
			Class473 class473;
			synchronized (((Class463) this).aClass367_5573) {
				class473 = (Class473) ((Class463) this).aClass367_5573.get((long) i);
			}
			if (class473 != null)
				return class473;
			byte[] is;
			synchronized (((Class463) this).aClass280_5572) {
				is = (((Class463) this).aClass280_5572.getFile(Class103.aClass103_930.method1228(i, 1720566382), Class103.aClass103_930.method1227(i, (byte) 35)));
			}
			class473 = new Class473();
			class473.anInt5657 = 741609917 * i;
			((Class473) class473).aClass463_5671 = this;
			class473.aStringArray5649 = (String[]) ((Class463) this).aStringArray5580.clone();
			if (is != null)
				class473.method5893(new Buffer(is), -1245006566);
			class473.method5910(743130918);
			if (class473.aBoolean5668) {
				class473.anInt5635 = 0;
				class473.aBoolean5636 = false;
			}
			if (!((Class463) this).aBoolean5584 && class473.aBoolean5621) {
				class473.aStringArray5649 = null;
				class473.anIntArray5693 = null;
			}
			synchronized (((Class463) this).aClass367_5573) {
				((Class463) this).aClass367_5573.put(class473, (long) i);
			}
			return class473;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.r(").append(')').toString());
		}
	}

	public Class463(Class435 class435, Class454 class454, boolean bool, IndexTable class280, IndexTable class280_1_) {
		((Class463) this).aClass367_5574 = new Class367(50);
		((Class463) this).aClass98Array5583 = new Model[4];
		((Class463) this).aClass485_5582 = new Class485(null, null);
		((Class463) this).aClass435_5577 = class435;
		((Class463) this).aClass454_5571 = class454;
		((Class463) this).aBoolean5584 = bool;
		((Class463) this).aClass280_5572 = class280;
		((Class463) this).aClass280_5575 = class280_1_;
		if (null != ((Class463) this).aClass280_5572) {
			int i = ((Class463) this).aClass280_5572.method2764(1867016684) - 1;
			Class103.aClass103_930.method1226((byte) 0);
			((Class463) this).aClass280_5572.method2763(i, -2004295678);
		}
		if (Class435.aClass435_4421 == ((Class463) this).aClass435_5577)
			((Class463) this).aStringArray5580 = (new String[] { null, null, null, null, null, Class526.aClass526_6068.method6257((((Class463) this).aClass454_5571), 991479434) });
		else
			((Class463) this).aStringArray5580 = new String[] { null, null, null, null, null, null };
	}

	public void method5706(boolean bool, byte i) {
		try {
			if (((Class463) this).aBoolean5584 != bool) {
				((Class463) this).aBoolean5584 = bool;
				method5711(-2123151503);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.j(").append(')').toString());
		}
	}

	public void method5707(int i, int i_2_) {
		try {
			((Class463) this).aClass367_5573 = new Class367(i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.p(").append(')').toString());
		}
	}

	public void method5708(int i, byte i_3_) {
		try {
			synchronized (((Class463) this).aClass367_5573) {
				((Class463) this).aClass367_5573.method4292(i, (byte) 116);
			}
			synchronized (((Class463) this).aClass367_5578) {
				((Class463) this).aClass367_5578.method4292(i, (byte) 23);
			}
			synchronized (((Class463) this).aClass367_5579) {
				((Class463) this).aClass367_5579.method4292(i, (byte) 28);
			}
			synchronized (((Class463) this).aClass367_5574) {
				((Class463) this).aClass367_5574.method4292(i, (byte) 20);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.s(").append(')').toString());
		}
	}

	public void method5709(int i) {
		try {
			synchronized (((Class463) this).aClass367_5573) {
				((Class463) this).aClass367_5573.method4296(301258714);
			}
			synchronized (((Class463) this).aClass367_5578) {
				((Class463) this).aClass367_5578.method4296(1248504925);
			}
			synchronized (((Class463) this).aClass367_5579) {
				((Class463) this).aClass367_5579.method4296(-1348146252);
			}
			synchronized (((Class463) this).aClass367_5574) {
				((Class463) this).aClass367_5574.method4296(-1753319835);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.f(").append(')').toString());
		}
	}

	public void method5710(int i, byte i_4_) {
		try {
			((Class463) this).anInt5581 = i * -541212093;
			synchronized (((Class463) this).aClass367_5578) {
				((Class463) this).aClass367_5578.method4298((byte) 19);
			}
			synchronized (((Class463) this).aClass367_5579) {
				((Class463) this).aClass367_5579.method4298((byte) 22);
			}
			synchronized (((Class463) this).aClass367_5574) {
				((Class463) this).aClass367_5574.method4298((byte) 86);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.i(").append(')').toString());
		}
	}

	public void method5711(int i) {
		try {
			synchronized (((Class463) this).aClass367_5573) {
				((Class463) this).aClass367_5573.method4298((byte) 114);
			}
			synchronized (((Class463) this).aClass367_5578) {
				((Class463) this).aClass367_5578.method4298((byte) 35);
			}
			synchronized (((Class463) this).aClass367_5579) {
				((Class463) this).aClass367_5579.method4298((byte) 1);
			}
			synchronized (((Class463) this).aClass367_5574) {
				((Class463) this).aClass367_5574.method4298((byte) 59);
			}
			((Class463) this).aClass98Array5583 = new Model[4];
			((Class463) this).aClass485_5582 = new Class485(null, null);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.o(").append(')').toString());
		}
	}

	static final void method5712(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_5_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_6_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_5_ | 1 << i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.zk(").append(')').toString());
		}
	}

	static final void method5713(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class541.method6333(iComponentDefinitions, class120, class430, -1582602249);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tf.ls(").append(')').toString());
		}
	}
}
