/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class337 {
	int anInt3365 = 2073133039;
	int anInt3366;
	int[] anIntArray3367;
	Class344 aClass344_3368;
	int anInt3369 = -1282666485;

	Class337() {
		((Class337) this).aClass344_3368 = Class344.aClass344_6813;
		((Class337) this).anInt3366 = 1296321863;
	}

	void method3947(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(-166017067);
				if (0 == i_0_) {
					if (i > -1197289649)
						break;
					break;
				}
				method3948(class330_sub46, i_0_, -1071056791);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.r(").append(')').toString());
		}
	}

	void method3948(Buffer class330_sub46, int i, int i_1_) {
		try {
			if (1 == i)
				((Class337) this).anInt3365 = class330_sub46.readUnsignedShort(512166737) * -2073133039;
			else if (2 == i) {
				((Class337) this).anIntArray3367 = new int[class330_sub46.readUnsignedByte(1036720484)];
				for (int i_2_ = 0; i_2_ < ((Class337) this).anIntArray3367.length; i_2_++)
					((Class337) this).anIntArray3367[i_2_] = class330_sub46.readUnsignedShort(1563351465);
			} else if (3 == i)
				((Class337) this).anInt3369 = class330_sub46.readUnsignedByte(1565105694) * 1282666485;
			else if (i == 4)
				((Class337) this).aClass344_3368 = ((Class344) Class479.method6015(Class110.method1356(1932880863), class330_sub46.readUnsignedByte(97519518), (byte) 31));
			else if (5 == i)
				((Class337) this).anInt3366 = class330_sub46.readBigSmart(-1227765511) * -1296321863;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.j(").append(')').toString());
		}
	}

	static final void method3949(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4397 += (1996761881 * (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.h(").append(')').toString());
		}
	}

	static final void method3950(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1323 = Class288.method2886(string, class430, 1640999832);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.mf(").append(')').toString());
		}
	}

	static final void method3951(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			client.anInt9215 = ((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]) * 1424838125);
			client.anInt9148 = ((((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]) * 1402418283);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.afo(").append(')').toString());
		}
	}

	static final void method3952(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class108.method1343((byte) 32).method297((short) 4024);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.ajm(").append(')').toString());
		}
	}

	static final void method3953(IComponentDefinitions iComponentDefinitions, Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_4_ = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) - 1);
			int i_5_ = i_4_;
			if (6 != iComponentDefinitions.anInt1238 * -276075115 && iComponentDefinitions.anInt1238 * -276075115 != 2)
				throw new RuntimeException("");
			Class551 class551 = Class158_Sub3.aClass553_8875.method6392((iComponentDefinitions.anInt1239 * -1576413395), -150553249);
			if (null == iComponentDefinitions.aClass538_1362)
				iComponentDefinitions.aClass538_1362 = new Class538(class551, -276075115 * iComponentDefinitions.anInt1238 == 6);
			iComponentDefinitions.aClass538_1362.aLong6242 = Class116.method1418(735911697) * 7415089317549594679L;
			if (class551.aByteArray6306 != null) {
				if (i_4_ < 0 || i_4_ >= class551.aByteArray6306.length)
					throw new RuntimeException("");
				i_5_ = class551.aByteArray6306[i_4_];
			}
			if (class551.aShortArray6349 == null || i_5_ < 0 || i_5_ >= class551.aShortArray6349.length)
				throw new RuntimeException("");
			iComponentDefinitions.aClass538_1362.aShortArray6239[i_5_] = (short) i_3_;
			Class404.method4738(iComponentDefinitions, 1470484612);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.rr(").append(')').toString());
		}
	}

	static final void method3954(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class24.method485(iComponentDefinitions, class120, class430, (byte) 78);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.kq(").append(')').toString());
		}
	}

	public static void method3955(int i, int i_6_, int i_7_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(18, (long) i_6_ << 32 | (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.ap(").append(')').toString());
		}
	}

	public static String method3956(int i, int i_8_) {
		try {
			Class330_Sub43 class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6094((long) i));
			if (class330_sub43 != null) {
				Class330_Sub31_Sub2 class330_sub31_sub2 = ((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3188(429349842);
				if (class330_sub31_sub2 != null) {
					double d = ((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3191(1225599839);
					if (((double) class330_sub31_sub2.method3423((byte) -70) <= d) && (double) class330_sub31_sub2.method3425(-2125491368) >= d)
						return class330_sub31_sub2.method3424((byte) 0);
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.o(").append(')').toString());
		}
	}

	static final void method3957(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (Class354_Sub1.aClass497_7991 != null) {
				Class330 class330 = Class354_Sub1.aClass497_7991.method6094((long) i_9_);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class330 != null ? 1 : 0;
			} else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ob.aep(").append(')').toString());
		}
	}
}
