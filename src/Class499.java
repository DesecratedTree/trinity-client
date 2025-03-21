/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class499 {
	Class367 aClass367_5891 = new Class367(128);
	IndexTable aClass280_5892;
	public static Class495 aClass495_5893;

	public Class491 method6111(int i, int i_0_) {
		try {
			Class491 class491;
			synchronized (((Class499) this).aClass367_5891) {
				class491 = (Class491) ((Class499) this).aClass367_5891.get((long) i);
			}
			if (null != class491)
				return class491;
			byte[] is;
			synchronized (((Class499) this).aClass280_5892) {
				is = (((Class499) this).aClass280_5892.getFile(-989081113 * Class103.aClass103_979.anInt982, i));
			}
			class491 = new Class491();
			if (is != null)
				class491.method6072(new Buffer(is), -666486656);
			synchronized (((Class499) this).aClass367_5891) {
				((Class499) this).aClass367_5891.put(class491, (long) i);
			}
			return class491;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.r(").append(')').toString());
		}
	}

	public void method6112(int i, byte i_1_) {
		try {
			synchronized (((Class499) this).aClass367_5891) {
				((Class499) this).aClass367_5891.method4292(i, (byte) 123);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.i(").append(')').toString());
		}
	}

	public void method6113(byte i) {
		try {
			synchronized (((Class499) this).aClass367_5891) {
				((Class499) this).aClass367_5891.method4296(-1743767723);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.p(").append(')').toString());
		}
	}

	public void method6114(int i) {
		try {
			synchronized (((Class499) this).aClass367_5891) {
				((Class499) this).aClass367_5891.method4298((byte) 10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.j(").append(')').toString());
		}
	}

	public Class499(Class435 class435, Class454 class454, IndexTable class280) {
		((Class499) this).aClass280_5892 = class280;
		((Class499) this).aClass280_5892.method2763((Class103.aClass103_979.anInt982) * -989081113, -2024697536);
	}

	static final void method6115(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ENTER_LONG_PACKET, client.aClass1_9025.aClass488_22, 553502432);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(string.length() + 1, (byte) 51);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -94);
			client.aClass1_9025.method378(class330_sub34, -484648979);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.so(").append(')').toString());
		}
	}

	static boolean method6116(int i) {
		try {
			Class360.anInt3791 = -67725972;
			Class360.aClass1_3783 = client.aClass1_9060;
			return (Class528.method6272(-3453250751665093531L * Class360.aLong3750 == -1L, true, "", "", -3453250751665093531L * Class360.aLong3750));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.c(").append(')').toString());
		}
	}

	static final void method6117(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1322 = Class288.method2886(string, class430, 1915163569);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.ms(").append(')').toString());
		}
	}

	static void method6118(Class330_Sub46_Sub2 class330_sub46_sub2, int i, int i_2_) {
		try {
			Class381 class381 = client.aClass304_9030.method3022(-318680070);
			boolean bool = class330_sub46_sub2.readBits(1) == 1;
			if (bool)
				Class15.anIntArray196[(Class15.anInt197 += 1507365673) * 614054169 - 1] = i;
			int i_3_ = class330_sub46_sub2.readBits(2);
			Player class432_sub1_sub1_sub1_sub1 = client.players[i];
			if (0 == i_3_) {
				if (bool)
					class432_sub1_sub1_sub1_sub1.aBoolean10243 = false;
				else {
					if (i == 1478725729 * client.anInt9121)
						throw new RuntimeException();
					Class26 class26 = Class15.aClass26Array198[i] = new Class26();
					((Class26) class26).anInt313 = (((class432_sub1_sub1_sub1_sub1.anIntArray10059[0] + class381.gameSceneBaseY * -1542584207) >> 6) + (((class381.gameSceneBaseX * -1261027839 + (class432_sub1_sub1_sub1_sub1.anIntArray10018[0])) >> 6 << 14) + (class432_sub1_sub1_sub1_sub1.aByte8658 << 28))) * 992654047;
					if (-1136372835 * class432_sub1_sub1_sub1_sub1.anInt10232 != -1)
						((Class26) class26).anInt310 = (1135913553 * class432_sub1_sub1_sub1_sub1.anInt10232);
					else
						((Class26) class26).anInt310 = class432_sub1_sub1_sub1_sub1.aClass238_10053.method2370(1038569201) * 2121487685;
					((Class26) class26).anInt309 = class432_sub1_sub1_sub1_sub1.anInt10028 * 269841531;
					((Class26) class26).aBoolean312 = class432_sub1_sub1_sub1_sub1.aBoolean10234;
					((Class26) class26).aBoolean311 = class432_sub1_sub1_sub1_sub1.aBoolean10247;
					if (class432_sub1_sub1_sub1_sub1.anInt10236 * 1762959971 > 0)
						Class95_Sub13.method1145(class432_sub1_sub1_sub1_sub1, (byte) 6);
					client.players[i] = null;
					if (class330_sub46_sub2.readBits(1) != 0)
						Class_ra_Sub3.method5218(class330_sub46_sub2, i, 1447266133);
				}
			} else if (i_3_ == 1) {
				int i_4_ = class330_sub46_sub2.readBits(3);
				int i_5_ = class432_sub1_sub1_sub1_sub1.anIntArray10018[0];
				int i_6_ = class432_sub1_sub1_sub1_sub1.anIntArray10059[0];
				if (0 == i_4_) {
					i_5_--;
					i_6_--;
				} else if (i_4_ == 1)
					i_6_--;
				else if (i_4_ == 2) {
					i_5_++;
					i_6_--;
				} else if (i_4_ == 3)
					i_5_--;
				else if (4 == i_4_)
					i_5_++;
				else if (i_4_ == 5) {
					i_5_--;
					i_6_++;
				} else if (i_4_ == 6)
					i_6_++;
				else if (i_4_ == 7) {
					i_5_++;
					i_6_++;
				}
				if (bool) {
					class432_sub1_sub1_sub1_sub1.anInt10244 = i_5_ * 1255554295;
					class432_sub1_sub1_sub1_sub1.anInt10245 = i_6_ * -1107645291;
					class432_sub1_sub1_sub1_sub1.aBoolean10243 = true;
				} else
					class432_sub1_sub1_sub1_sub1.method5462(i_5_, i_6_, (Class15.aByteArray190[i]), -1717192951);
			} else if (2 == i_3_) {
				int i_7_ = class330_sub46_sub2.readBits(4);
				int i_8_ = class432_sub1_sub1_sub1_sub1.anIntArray10018[0];
				int i_9_ = class432_sub1_sub1_sub1_sub1.anIntArray10059[0];
				if (i_7_ == 0) {
					i_8_ -= 2;
					i_9_ -= 2;
				} else if (1 == i_7_) {
					i_8_--;
					i_9_ -= 2;
				} else if (i_7_ == 2)
					i_9_ -= 2;
				else if (i_7_ == 3) {
					i_8_++;
					i_9_ -= 2;
				} else if (4 == i_7_) {
					i_8_ += 2;
					i_9_ -= 2;
				} else if (i_7_ == 5) {
					i_8_ -= 2;
					i_9_--;
				} else if (i_7_ == 6) {
					i_8_ += 2;
					i_9_--;
				} else if (i_7_ == 7)
					i_8_ -= 2;
				else if (i_7_ == 8)
					i_8_ += 2;
				else if (i_7_ == 9) {
					i_8_ -= 2;
					i_9_++;
				} else if (10 == i_7_) {
					i_8_ += 2;
					i_9_++;
				} else if (i_7_ == 11) {
					i_8_ -= 2;
					i_9_ += 2;
				} else if (i_7_ == 12) {
					i_8_--;
					i_9_ += 2;
				} else if (13 == i_7_)
					i_9_ += 2;
				else if (14 == i_7_) {
					i_8_++;
					i_9_ += 2;
				} else if (i_7_ == 15) {
					i_8_ += 2;
					i_9_ += 2;
				}
				if (bool) {
					class432_sub1_sub1_sub1_sub1.anInt10244 = i_8_ * 1255554295;
					class432_sub1_sub1_sub1_sub1.anInt10245 = -1107645291 * i_9_;
					class432_sub1_sub1_sub1_sub1.aBoolean10243 = true;
				} else
					class432_sub1_sub1_sub1_sub1.method5462(i_8_, i_9_, (Class15.aByteArray190[i]), -110910597);
			} else {
				int i_10_ = class330_sub46_sub2.readBits(1);
				if (0 == i_10_) {
					int i_11_ = class330_sub46_sub2.readBits(12);
					int i_12_ = i_11_ >> 10;
					int i_13_ = i_11_ >> 5 & 0x1f;
					if (i_13_ > 15)
						i_13_ -= 32;
					int i_14_ = i_11_ & 0x1f;
					if (i_14_ > 15)
						i_14_ -= 32;
					int i_15_ = (i_13_ + class432_sub1_sub1_sub1_sub1.anIntArray10018[0]);
					int i_16_ = (class432_sub1_sub1_sub1_sub1.anIntArray10059[0] + i_14_);
					if (bool) {
						class432_sub1_sub1_sub1_sub1.anInt10244 = i_15_ * 1255554295;
						class432_sub1_sub1_sub1_sub1.anInt10245 = -1107645291 * i_16_;
						class432_sub1_sub1_sub1_sub1.aBoolean10243 = true;
					} else
						class432_sub1_sub1_sub1_sub1.method5462(i_15_, i_16_, (Class15.aByteArray190[i]), 521036773);
					class432_sub1_sub1_sub1_sub1.aByte8658 = class432_sub1_sub1_sub1_sub1.aByte8654 = (byte) ((class432_sub1_sub1_sub1_sub1.aByte8658 + i_12_) & 0x3);
					if (client.aClass304_9030.method2995(738668836).method2788(i_15_, i_16_, (byte) 38))
						class432_sub1_sub1_sub1_sub1.aByte8654++;
					if (1478725729 * client.anInt9121 == i && (class432_sub1_sub1_sub1_sub1.aByte8658 != -127654579 * Class85.anInt712))
						Class85.anInt712 = (963615621 * class432_sub1_sub1_sub1_sub1.aByte8658);
				} else {
					int i_17_ = class330_sub46_sub2.readBits(30);
					int i_18_ = i_17_ >> 28;
					int i_19_ = i_17_ >> 14 & 0x3fff;
					int i_20_ = i_17_ & 0x3fff;
					int i_21_ = (((class432_sub1_sub1_sub1_sub1.anIntArray10018[0] + -1261027839 * class381.gameSceneBaseX + i_19_) & 0x3fff) - -1261027839 * class381.gameSceneBaseX);
					int i_22_ = (((class432_sub1_sub1_sub1_sub1.anIntArray10059[0] + class381.gameSceneBaseY * -1542584207 + i_20_) & 0x3fff) - -1542584207 * class381.gameSceneBaseY);
					if (bool) {
						class432_sub1_sub1_sub1_sub1.anInt10244 = 1255554295 * i_21_;
						class432_sub1_sub1_sub1_sub1.anInt10245 = -1107645291 * i_22_;
						class432_sub1_sub1_sub1_sub1.aBoolean10243 = true;
					} else
						class432_sub1_sub1_sub1_sub1.method5462(i_21_, i_22_, (Class15.aByteArray190[i]), 1347933233);
					class432_sub1_sub1_sub1_sub1.aByte8658 = class432_sub1_sub1_sub1_sub1.aByte8654 = (byte) ((class432_sub1_sub1_sub1_sub1.aByte8658 + i_18_) & 0x3);
					if (client.aClass304_9030.method2995(749068925).method2788(i_21_, i_22_, (byte) -98))
						class432_sub1_sub1_sub1_sub1.aByte8654++;
					if (i == client.anInt9121 * 1478725729)
						Class85.anInt712 = (class432_sub1_sub1_sub1_sub1.aByte8658 * 963615621);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("up.o(").append(')').toString());
		}
	}
}
