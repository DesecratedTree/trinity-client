/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class342 {
	Class367 aClass367_3398 = new Class367(16);
	IndexTable aClass280_3399;

	public void method3983(int i) {
		try {
			synchronized (((Class342) this).aClass367_3398) {
				((Class342) this).aClass367_3398.method4298((byte) 36);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.i(").append(')').toString());
		}
	}

	Class337 method3984(int i, int i_0_) {
		try {
			Class337 class337;
			synchronized (((Class342) this).aClass367_3398) {
				class337 = (Class337) ((Class342) this).aClass367_3398.get((long) i);
			}
			if (null != class337)
				return class337;
			byte[] is;
			synchronized (((Class342) this).aClass280_3399) {
				is = (((Class342) this).aClass280_3399.getFile(Class103.aClass103_953.anInt982 * -989081113, i));
			}
			class337 = new Class337();
			if (is != null)
				class337.method3947(new Buffer(is), -1186925657);
			synchronized (((Class342) this).aClass367_3398) {
				((Class342) this).aClass367_3398.put(class337, (long) i);
			}
			return class337;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.r(").append(')').toString());
		}
	}

	public Class308 method3985(int i, int i_1_, int i_2_, int i_3_, Class131 class131, byte i_4_) {
		try {
			Class311[] class311s = null;
			Class337 class337 = method3984(i, 166743);
			if (((Class337) class337).anIntArray3367 != null) {
				class311s = (new Class311[((Class337) class337).anIntArray3367.length]);
				for (int i_5_ = 0; i_5_ < class311s.length; i_5_++) {
					Class127 class127 = class131.method1561((((Class337) class337).anIntArray3367[i_5_]), (byte) -11);
					class311s[i_5_] = new Class311(class127.anInt1468 * 1270381391, class127.anInt1471 * -857151947, class127.anInt1466 * 498241325, class127.anInt1467 * 667499379, 792569815 * class127.anInt1465, -2064281963 * class127.anInt1473, -300713121 * class127.anInt1470, class127.aBoolean1469, class127.anInt1472 * 1457354651, 1442828687 * class127.anInt1464, -1560383147 * class127.anInt1474);
				}
			}
			return new Class308(248672497 * ((Class337) class337).anInt3365, class311s, ((Class337) class337).anInt3369 * 374998109, i_1_, i_2_, i_3_, ((Class337) class337).aClass344_3368, ((Class337) class337).anInt3366 * -1522093175);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.j(").append(')').toString());
		}
	}

	public void method3986(int i) {
		try {
			synchronized (((Class342) this).aClass367_3398) {
				((Class342) this).aClass367_3398.method4296(-354865469);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.o(").append(')').toString());
		}
	}

	public Class342(Class435 class435, Class454 class454, IndexTable class280) {
		((Class342) this).aClass280_3399 = class280;
		((Class342) this).aClass280_3399.method2763((Class103.aClass103_953.anInt982) * -989081113, -2066818594);
	}

	public void method3987(int i, int i_6_) {
		try {
			synchronized (((Class342) this).aClass367_3398) {
				((Class342) this).aClass367_3398.method4292(i, (byte) 73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.p(").append(')').toString());
		}
	}

	static final void method3988(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class391.method4603(iComponentDefinitions, class120, class430, -1004775530);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.hy(").append(')').toString());
		}
	}

	static final void method3989(Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, -1168145827);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1245 * 2005289635;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.ra(").append(')').toString());
		}
	}

	public static void method3990(float f, Class260 class260, Class244 class244, Class260 class260_8_, Class260 class260_9_, Class260 class260_10_, float f_11_, int i) {
		try {
			if (!class260_8_.method2555(class260)) {
				Class260 class260_12_ = Class260.method2577(0.0F, 0.0F, 0.0F);
				Class260 class260_13_ = Class260.method2549(Class260.method2561(class260_8_, class260));
				class260_13_.method2570(class244);
				Class260 class260_14_ = Class260.method2561(class260_13_, class260_12_);
				float f_15_ = class260_14_.method2565();
				if (class260_10_.aFloat2716 == Float.POSITIVE_INFINITY || Float.isNaN(class260.aFloat2716) || f_15_ > 5120.0F) {
					class260.method2582(class260_8_);
					class260_9_.method2554();
				} else {
					class244.method2423();
					Class260 class260_16_ = Class260.method2577(1.0F, 0.0F, 0.0F);
					Class260 class260_17_ = Class260.method2577(0.0F, 1.0F, 0.0F);
					Class260 class260_18_ = Class260.method2577(0.0F, 0.0F, 1.0F);
					class260_16_.method2570(class244);
					class260_17_.method2570(class244);
					class260_18_.method2570(class244);
					Class260 class260_19_ = (Class260.method2577(Class260.method2562(class260_16_, class260_9_), Class260.method2562(class260_17_, class260_9_), Class260.method2562(class260_18_, class260_9_)));
					Class260 class260_20_ = Class260.method2549(class260_19_);
					Class260 class260_21_ = Class260.method2577((class260_14_.aFloat2716 * class260_10_.aFloat2716), (class260_10_.aFloat2715 * class260_14_.aFloat2715), (class260_10_.aFloat2711 * class260_14_.aFloat2711));
					class260_20_.method2571(class260_21_, f);
					class260_20_.method2569(f_11_);
					Class260 class260_22_ = Class260.method2574(class260_16_, class260_20_.aFloat2716);
					class260_22_.method2571(class260_17_, class260_20_.aFloat2715);
					class260_22_.method2571(class260_18_, class260_20_.aFloat2711);
					class260_9_.method2582(class260_22_);
					if (f_15_ < 1.0F) {
						class260.method2582(class260_8_);
						class260_9_.method2554();
					} else
						class260.method2558(Class260.method2574(class260_9_, f));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.r(").append(')').toString());
		}
	}

	static final void method3991(Class430 class430, int i) {
		try {
			int i_23_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class158.aClass561_6474.method310(i_23_, -1799781963);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("og.as(").append(')').toString());
		}
	}
}
