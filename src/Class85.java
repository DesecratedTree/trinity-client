/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class85 {
	int anInt704;
	public boolean aBoolean705 = false;
	static int anInt706 = 25;
	public int anInt707;
	NPC aClass432_Sub1_Sub1_Sub1_Sub2_708 = null;
	Player aClass432_Sub1_Sub1_Sub1_Sub1_709 = null;
	int[] anIntArray710;
	static int[] anIntArray711;
	public static int anInt712;
	static int anInt713;

	boolean method969(short i) {
		try {
			if (514002571 * anInt707 >= 0) {
				Class551 class551 = Class158_Sub3.aClass553_8875.method6392(514002571 * anInt707, 739964309);
				boolean bool = class551.method6369(-859335134);
				if (((Class85) this).anIntArray710 == null) {
					Class364 class364 = Class102.aClass362_924.method4254((-1303151019 * (class551.anInt6338)), 1997266210);
					((Class85) this).anIntArray710 = class364.method4266((byte) 3);
				}
				int[] is = ((Class85) this).anIntArray710;
				for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
					int i_1_ = is[i_0_];
					bool &= Class201.aClass436_6511.method5570(i_1_, 1283399417).method5600(1449102354);
				}
				return bool;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.o(").append(')').toString());
		}
	}

	void method970(byte i) {
		try {
			((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708 = null;
			((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709 = null;
			aBoolean705 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.j(").append(')').toString());
		}
	}

	void method971(int i, int i_2_, int i_3_, byte i_4_) {
		try {
			if (((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708 != null)
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.method5478(i, i_2_, i_3_, true, ((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.method5453(-1960016466), -1737258822);
			else {
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8658 = ((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8654 = (byte) i;
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.method5463(i_2_, i_3_, (short) 1007);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.i(").append(')').toString());
		}
	}

	void method972(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			if (!aBoolean705) {
				aBoolean705 = true;
				if (anInt707 * 514002571 >= 0) {
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708 = (new NPC(client.aClass304_9030.method3023(-400722441), 25));
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10008 = ((Class85) this).anInt704 * -1264619667;
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10069 = 1923340057 * client.anInt8981;
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.method5475(Class158_Sub3.aClass553_8875.method6392(514002571 * anInt707, 1433387112), 1918950667);
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.method5420(-1943771105 * (((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.aClass551_10251.anInt6295), (short) -28377);
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10051 = ((((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.aClass551_10251.anInt6325) * -922219293 << 3) * 543987723;
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.anInt10052 = (((Class96.anInt858 += 651206033) * -116014223 - 1) * 112912163);
				} else {
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709 = (new Player(client.aClass304_9030.method3023(-400722441), 25));
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.sendAppearance(Class444.aClass330_Sub46_4496, 81081685);
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.anInt10008 = ((Class85) this).anInt704 * -1264619667;
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.anInt10069 = 1923340057 * client.anInt8981;
					((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.anInt10052 = (((Class96.anInt858 += 651206033) * -116014223 - 1) * 112912163);
				}
			}
			if (514002571 * anInt707 >= 0) {
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.method5478(i_6_, i, i_5_, true, ((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.method5453(-2096317917), -1737258822);
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708.method5411(i_7_, true, -415032903);
			} else {
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8658 = ((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.aByte8654 = (byte) i_6_;
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.method5463(i, i_5_, (short) 1007);
				((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709.method5411(i_7_, true, 1712159134);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.r(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub1_Sub1 method973(int i) {
		try {
			if (((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708 != null)
				return ((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub2_708;
			return ((Class85) this).aClass432_Sub1_Sub1_Sub1_Sub1_709;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.p(").append(')').toString());
		}
	}

	Class85(Buffer class330_sub46, int i) {
		((Class85) this).anInt704 = -344783935 * i;
		int i_9_ = class330_sub46.readUnsignedByte(-222833341);
		switch (i_9_) {
		case 1:
			anInt707 = 1845860061;
			break;
		default:
			anInt707 = 1845860061;
			break;
		case 0:
			anInt707 = class330_sub46.readBigSmart(-1881489425) * -1845860061;
		}
		class330_sub46.readString(-117729603);
	}

	public static Class210 method974(int i, int i_10_) {
		try {
			Class210 class210 = (Class210) Class210.aClass367_1994.get((long) i);
			if (class210 != null)
				return class210;
			byte[] is = Class210.aClass280_2033.getFile(0, i);
			class210 = new Class210();
			if (null != is)
				class210.method2212(new Buffer(is), (byte) -69);
			class210.method2213(-531050747);
			Class210.aClass367_1994.put(class210, (long) i);
			return class210;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.j(").append(')').toString());
		}
	}

	static final void method975(Class430 class430, byte i) {
		try {
			int i_11_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class372 class372 = Class79.aClass380_666.method4387(i_11_, (byte) -34);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -546800133 * class372.anInt3911;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.aop(").append(')').toString());
		}
	}

	static void method976(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 2] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 2]), -2081893146).anIntArrayArray4094[(((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1])][0]);
			((Class430) class430).anInt4376 -= -1390004513;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.k(").append(')').toString());
		}
	}

	static final void method977(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			((Class430) class430).anInt4376 -= 1514958270;
			int i_12_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_13_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			Class524 class524 = Class461.method5699(Class484.aClass280_5822, i_13_, 0, 1479980784);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class524.method6246(string, i_12_, Class57.aClass61Array6599, (byte) 21);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dk.aal(").append(')').toString());
		}
	}
}
