/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81 {
	public static int anInt674 = 8191;
	public Class461 aClass461_675 = new Class461();

	public static void method945(int i, int i_0_) {
		try {
			Class542.anInt6251 = -1528681797 * i;
			IComponentDefinitions.aClass367_1310.method4298((byte) 4);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.d(").append(')').toString());
		}
	}

	static final void method946(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class439.method5599(iComponentDefinitions, class120, false, 1, class430, (byte) 51);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.hj(").append(')').toString());
		}
	}

	static final void method947(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class117 class117 = Class144.method1668(i_1_, (byte) 16);
			String string = "";
			if (null != class117 && class117.aString1386 != null)
				string = class117.aString1386;
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.acg(").append(')').toString());
		}
	}

	static final void method948(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, 595113170);
			Class120 class120 = Class3.aClass120Array56[i_2_ >> 16];
			Class246.method2453(iComponentDefinitions, class120, class430, -1328366066);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.mu(").append(')').toString());
		}
	}

	static final void method949(Class430 class430, int i) {
		try {
			boolean bool = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1);
			if (bool)
				Class147.anInt1621 = 1757310610;
			else
				Class340.method3971(998972413);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.aio(").append(')').toString());
		}
	}

	public static int method950(int i, int i_3_, byte i_4_) {
		try {
			int i_5_ = i >>> 31;
			return (i_5_ + i) / i_3_ - i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.w(").append(')').toString());
		}
	}

	static final boolean method951(Class463 class463, int i, int i_6_, int i_7_) {
		try {
			Class473 class473 = class463.method5705(i, (byte) -95);
			if (i_6_ == 11)
				i_6_ = 10;
			if (i_6_ >= 5 && i_6_ <= 8)
				i_6_ = 4;
			return class473.method5895(i_6_, (byte) -78);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.cz(").append(')').toString());
		}
	}

	static final void method952(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int i) {
		try {
			if (null != class432_sub1_sub1_sub1.anIntArray10029 || null != class432_sub1_sub1_sub1.anIntArray10049) {
				boolean bool = true;
				Class381 class381 = client.aClass304_9030.method3022(1417101658);
				for (int i_8_ = 0; i_8_ < class432_sub1_sub1_sub1.anIntArray10029.length; i_8_++) {
					int i_9_ = -1;
					if (null != class432_sub1_sub1_sub1.anIntArray10029)
						i_9_ = class432_sub1_sub1_sub1.anIntArray10029[i_8_];
					if (i_9_ == -1) {
						if (!class432_sub1_sub1_sub1.method5454(i_8_, -1, (byte) 122))
							bool = false;
					} else {
						bool = false;
						boolean bool_10_ = false;
						boolean bool_11_ = false;
						Class260 class260 = (class432_sub1_sub1_sub1.method5346().aClass260_2606);
						int i_12_;
						int i_13_;
						if ((i_9_ & ~0x3fffffff) == -1073741824) {
							int i_14_ = i_9_ & 0xfffffff;
							int i_15_ = i_14_ >> 14;
							int i_16_ = i_14_ & 0x3fff;
							i_12_ = ((int) class260.aFloat2716 - (((i_15_ - -1261027839 * class381.gameSceneBaseX) * 512) + 256));
							i_13_ = ((int) class260.aFloat2711 - (256 + (i_16_ - (class381.gameSceneBaseY * -1542584207)) * 512));
						} else if (0 != (i_9_ & 0x8000)) {
							int i_17_ = i_9_ & 0x7fff;
							Player class432_sub1_sub1_sub1_sub1 = (client.players[i_17_]);
							if (null != class432_sub1_sub1_sub1_sub1) {
								Class260 class260_18_ = (class432_sub1_sub1_sub1_sub1.method5346().aClass260_2606);
								i_12_ = ((int) class260.aFloat2716 - (int) class260_18_.aFloat2716);
								i_13_ = ((int) class260.aFloat2711 - (int) class260_18_.aFloat2711);
							} else {
								class432_sub1_sub1_sub1.method5454(i_8_, -1, (byte) 95);
								continue;
							}
						} else {
							Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_9_));
							if (null != class330_sub35) {
								NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
								Class260 class260_19_ = (class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
								i_12_ = ((int) class260.aFloat2716 - (int) class260_19_.aFloat2716);
								i_13_ = ((int) class260.aFloat2711 - (int) class260_19_.aFloat2711);
							} else {
								class432_sub1_sub1_sub1.method5454(i_8_, -1, (byte) 114);
								continue;
							}
						}
						if (i_12_ != 0 || i_13_ != 0)
							class432_sub1_sub1_sub1.method5454(i_8_, (int) (Math.atan2((double) i_12_, (double) i_13_) * 2607.5945876176133) & 0x3fff, (byte) 82);
					}
				}
				if (bool) {
					class432_sub1_sub1_sub1.anIntArray10029 = null;
					class432_sub1_sub1_sub1.anIntArray10049 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.hh(").append(')').toString());
		}
	}

	static void method953(int i, byte i_20_) {
		try {
			synchronized (Class459.aClass367_5566) {
				Class459.aClass367_5566.method4292(i, (byte) 6);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.p(").append(')').toString());
		}
	}

	public static void sendSpeech(int i, int i_21_, String string, String string_22_, String string_23_, String string_24_, String string_25_, int i_26_, byte i_27_) {
		try {
			Class117 class117 = Class119.aClass117Array1394[99];
			for (int i_28_ = 99; i_28_ > 0; i_28_--)
				Class119.aClass117Array1394[i_28_] = Class119.aClass117Array1394[i_28_ - 1];
			if (class117 == null)
				class117 = new Class117(i, i_21_, string, string_22_, string_23_, string_25_, i_26_, string_24_);
			else
				class117.method1422(i, i_21_, string, string_22_, string_23_, string_25_, i_26_, string_24_, 1381524931);
			Class119.aClass117Array1394[0] = class117;
			Class119.anInt1395 += -88131639;
			client.anInt9028 = client.anInt9268 * -1257448029;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dg.o(").append(')').toString());
		}
	}
}
