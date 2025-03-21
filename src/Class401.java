/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class401 {
	int anInt4127;
	static int anInt4128 = 2;
	static int anInt4129 = 4;
	static int anInt4130 = 8;
	public int anInt4131;
	static int anInt4132 = 1;
	public int anInt4133;

	public boolean method4709(int i) {
		try {
			return (551859137 * anInt4131 & 0x2) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.j(").append(')').toString());
		}
	}

	public boolean method4710(byte i) {
		try {
			return 0 != (anInt4131 * 551859137 & 0x4);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.i(").append(')').toString());
		}
	}

	Class401() {
		/* empty */
	}

	public boolean method4711(byte i) {
		try {
			return 0 != (551859137 * anInt4131 & 0x1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.r(").append(')').toString());
		}
	}

	public boolean method4712(byte i) {
		try {
			return 0 != (551859137 * anInt4131 & 0x8);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.p(").append(')').toString());
		}
	}

	static final void method4713(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class429.method5326(iComponentDefinitions, class120, class430, -813555107);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.oc(").append(')').toString());
		}
	}

	static final void method4714(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub29_7903.method5839((short) 255) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.alb(").append(')').toString());
		}
	}

	static String method4715(Class330_Sub36_Sub13 class330_sub36_sub13, int i) {
		try {
			return new StringBuilder().append(((Class330_Sub36_Sub13) class330_sub36_sub13).aString9717).append(Class146.method1738(16777215, -849826454)).append(" >").toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.bo(").append(')').toString());
		}
	}

	public static final void method4716(int i) {
		try {
			Class1 class1 = Class426.method5317(1908590306);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.JOIN_FRIEND_CHAT_PACKET, class1.aClass488_22, -239204966);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 24);
			class1.method378(class330_sub34, -1662623356);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.ma(").append(')').toString());
		}
	}

	public static long method4717(int i, int i_0_) {
		try {
			return 86400000L * (long) (11745 + i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.n(").append(')').toString());
		}
	}

	static final void method4718(Class430 class430, int i) {
		try {
			boolean bool = false;
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (client.aBoolean9198) {
				try {
					Object object = Class232.aClass232_2461.method2355((new Object[] { string }), -1424372457);
					if (null != object)
						bool = ((Boolean) object).booleanValue();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.apb(").append(')').toString());
		}
	}

	public static void method4719(int i, int i_1_, int i_2_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(19, (long) i_1_ << 32 | (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qq.ai(").append(')').toString());
		}
	}
}
