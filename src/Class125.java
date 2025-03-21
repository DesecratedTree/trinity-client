/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125 {
	static int anInt1451;
	static int anInt1452;
	static int anInt1453;
	public static Class263 aClass263_1454;
	static int anInt1455;
	static int anInt1456;
	static Class61[] aClass61Array1457;
	public static int anInt1458;
	static byte[][][] aByteArrayArrayArray1459;

	Class125() throws Throwable {
		throw new Error();
	}

	static final void method1524(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 198067769);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class375.method4354(iComponentDefinitions, class120, class430, (byte) -74);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("f.fe(").append(')').toString());
		}
	}

	public static String method1525(byte[] is, int i, int i_1_, byte i_2_) {
		try {
			char[] cs = new char[i_1_];
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
				int i_5_ = is[i + i_4_] & 0xff;
				if (i_5_ == 0) {
					if (i_2_ != 1) {
						/* empty */
					}
				} else {
					if (i_5_ >= 128 && i_5_ < 160) {
						int i_6_ = Class458.aCharArray5564[i_5_ - 128];
						if (0 == i_6_)
							i_6_ = 63;
						i_5_ = i_6_;
					}
					cs[i_3_++] = (char) i_5_;
				}
			}
			return new String(cs, 0, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("f.z(").append(')').toString());
		}
	}

	static void method1526(int i, int i_7_, int i_8_, Class330_Sub3 class330_sub3, int i_9_) {
		try {
			long l = (long) (i << 28 | i_8_ << 14 | i_7_);
			Class330_Sub9 class330_sub9 = (Class330_Sub9) client.aClass497_9138.method6094(l);
			if (null == class330_sub9) {
				class330_sub9 = new Class330_Sub9();
				client.aClass497_9138.method6097(class330_sub9, l);
				class330_sub9.aClass471_7573.method5878(class330_sub3, (short) 8192);
			} else {
				ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions((-862355691 * (class330_sub3.anInt7513)), (byte) -4);
				int i_10_ = itemDefinitions.value * -1519860237;
				if (1 == itemDefinitions.anInt6736 * 1369390791)
					i_10_ *= (((Class330_Sub3) class330_sub3).anInt7512 * -1010001415) + 1;
				for (Class330_Sub3 class330_sub3_11_ = (Class330_Sub3) class330_sub9.aClass471_7573.method5869(539664854); class330_sub3_11_ != null; class330_sub3_11_ = (Class330_Sub3) class330_sub9.aClass471_7573.method5873((byte) -22)) {
					itemDefinitions = (Class556.aClass510_6392.getItemDefinitions(-862355691 * class330_sub3_11_.anInt7513, (byte) -99));
					int i_12_ = itemDefinitions.value * -1519860237;
					if (1 == itemDefinitions.anInt6736 * 1369390791)
						i_12_ *= 1 + (((Class330_Sub3) class330_sub3_11_).anInt7512) * -1010001415;
					if (i_10_ > i_12_) {
						Class511.method6186(class330_sub3, class330_sub3_11_, -1884670110);
						return;
					}
				}
				class330_sub9.aClass471_7573.method5878(class330_sub3, (short) 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("f.jk(").append(')').toString());
		}
	}

	public static void method1527(int i, int i_13_) {
		try {
			Class128.method1551(new Class462(i), -1793814050);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("f.j(").append(')').toString());
		}
	}

	public static int method1528(byte[] is, int i, int i_14_) {
		try {
			return Class106.method1325(is, 0, i, -2079606110);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("f.j(").append(')').toString());
		}
	}

	static final void method1529(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class196.method2146(iComponentDefinitions, class120, class430, (byte) -108);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("f.dz(").append(')').toString());
		}
	}

	static final void method1530(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			((Class430) class430).anInt4376 -= 124953757;
			int i_15_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_16_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_17_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 2]);
			IsaacCipher.method6048(string, 1 == i_15_, i_16_, i_17_, -1726056090);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -2048805097 * Class440.anInt4482;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("f.abg(").append(')').toString());
		}
	}
}
