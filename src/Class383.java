/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class383 {
	Class383() throws Throwable {
		throw new Error();
	}

	public static Class137 method4409(int i, byte i_0_) {
		try {
			if (i == ((Class137) Class137.aClass137_1530).anInt1528 * -845424805)
				return Class137.aClass137_1530;
			if (((Class137) Class137.aClass137_1529).anInt1528 * -845424805 == i)
				return Class137.aClass137_1529;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("px.r(").append(')').toString());
		}
	}

	static final void method4410(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions(i_1_, (byte) -127);
			if (i_2_ >= 1 && i_2_ <= 5 && itemDefinitions.groundOptions[i_2_ - 1] != null)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = itemDefinitions.groundOptions[i_2_ - 1];
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("px.aas(").append(')').toString());
		}
	}

	static Class469[] method4411(short i) {
		try {
			return (new Class469[] { Class469.aClass469_5605, Class469.aClass469_5602, Class469.aClass469_5606, Class469.aClass469_5603, Class469.aClass469_5604 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("px.r(").append(')').toString());
		}
	}

	public static void method4412(byte i) {
		try {
			Class508.method6158(-752340859);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("px.j(").append(')').toString());
		}
	}

	static final void method4413(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class429.method5330(string, -2115076953);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("px.ain(").append(')').toString());
		}
	}

	static final void method4414(Class330_Sub46_Sub2 class330_sub46_sub2, int i) {
		try {
			int i_3_ = 0;
			class330_sub46_sub2.method3820(1206919867);
			for (int i_4_ = 0; i_4_ < -1468156857 * Class15.anInt192; i_4_++) {
				int i_5_ = Class15.anIntArray187[i_4_];
				if ((Class15.aByteArray189[i_5_] & 0x1) == 0) {
					if (i_3_ > 0) {
						i_3_--;
						Class15.aByteArray189[i_5_] |= 0x2;
					} else {
						int i_6_ = class330_sub46_sub2.readBits(1);
						if (0 == i_6_) {
							i_3_ = Class334.method3937(class330_sub46_sub2, 1986382750);
							Class15.aByteArray189[i_5_] |= 0x2;
						} else
							Class499.method6118(class330_sub46_sub2, i_5_, 769528925);
					}
				}
			}
			class330_sub46_sub2.method3824(1045571776);
			if (0 != i_3_)
				throw new RuntimeException();
			class330_sub46_sub2.method3820(1452352898);
			for (int i_7_ = 0; i_7_ < Class15.anInt192 * -1468156857; i_7_++) {
				int i_8_ = Class15.anIntArray187[i_7_];
				if ((Class15.aByteArray189[i_8_] & 0x1) != 0) {
					if (i_3_ > 0) {
						i_3_--;
						Class15.aByteArray189[i_8_] |= 0x2;
					} else {
						int i_9_ = class330_sub46_sub2.readBits(1);
						if (i_9_ == 0) {
							i_3_ = Class334.method3937(class330_sub46_sub2, 1986382750);
							Class15.aByteArray189[i_8_] |= 0x2;
						} else
							Class499.method6118(class330_sub46_sub2, i_8_, 2101708867);
					}
				}
			}
			class330_sub46_sub2.method3824(1585066155);
			if (i_3_ != 0)
				throw new RuntimeException();
			class330_sub46_sub2.method3820(848105913);
			for (int i_10_ = 0; i_10_ < Class15.anInt193 * -1052726831; i_10_++) {
				int i_11_ = Class15.anIntArray195[i_10_];
				if (0 != (Class15.aByteArray189[i_11_] & 0x1)) {
					if (i_3_ > 0) {
						i_3_--;
						Class15.aByteArray189[i_11_] |= 0x2;
					} else {
						int i_12_ = class330_sub46_sub2.readBits(1);
						if (0 == i_12_) {
							i_3_ = Class334.method3937(class330_sub46_sub2, 1986382750);
							Class15.aByteArray189[i_11_] |= 0x2;
						} else if (Class_ra_Sub3.method5218(class330_sub46_sub2, i_11_, 1076434295))
							Class15.aByteArray189[i_11_] |= 0x2;
					}
				}
			}
			class330_sub46_sub2.method3824(503132829);
			if (i_3_ != 0)
				throw new RuntimeException();
			class330_sub46_sub2.method3820(1134751691);
			for (int i_13_ = 0; i_13_ < -1052726831 * Class15.anInt193; i_13_++) {
				int i_14_ = Class15.anIntArray195[i_13_];
				if (0 == (Class15.aByteArray189[i_14_] & 0x1)) {
					if (i_3_ > 0) {
						i_3_--;
						Class15.aByteArray189[i_14_] |= 0x2;
					} else {
						int i_15_ = class330_sub46_sub2.readBits(1);
						if (i_15_ == 0) {
							i_3_ = Class334.method3937(class330_sub46_sub2, 1986382750);
							Class15.aByteArray189[i_14_] |= 0x2;
						} else if (Class_ra_Sub3.method5218(class330_sub46_sub2, i_14_, 568755198))
							Class15.aByteArray189[i_14_] |= 0x2;
					}
				}
			}
			class330_sub46_sub2.method3824(-1091019833);
			if (i_3_ != 0)
				throw new RuntimeException();
			Class15.anInt192 = 0;
			Class15.anInt193 = 0;
			for (int i_16_ = 1; i_16_ < 2048; i_16_++) {
				Class15.aByteArray189[i_16_] >>= 1;
				Player class432_sub1_sub1_sub1_sub1 = client.players[i_16_];
				if (class432_sub1_sub1_sub1_sub1 != null)
					Class15.anIntArray187[(Class15.anInt192 += 1854780791) * -1468156857 - 1] = i_16_;
				else
					Class15.anIntArray195[(Class15.anInt193 += 12078897) * -1052726831 - 1] = i_16_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("px.i(").append(')').toString());
		}
	}
}
