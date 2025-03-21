/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class439 {
	static int anInt4449 = 0;
	static int anInt4450 = 0;
	static int anInt4451 = 0;
	static byte[][] aByteArrayArray4452 = new byte[1000][];
	static byte[][] aByteArrayArray4453 = new byte[250][];
	static byte[][] aByteArrayArray4454 = new byte[50][];
	static Class330_Sub36_Sub10 aClass330_Sub36_Sub10_4455;
	public static int anInt4456;

	public static synchronized byte[] method5596(int i, int i_0_) {
		try {
			if (100 == i && -1838000653 * anInt4449 > 0) {
				byte[] is = (aByteArrayArray4452[(anInt4449 -= -2086122693) * -1838000653]);
				aByteArrayArray4452[-1838000653 * anInt4449] = null;
				return is;
			}
			if (5000 == i && -531209371 * anInt4450 > 0) {
				byte[] is = (aByteArrayArray4453[(anInt4450 -= 497620589) * -531209371]);
				aByteArrayArray4453[-531209371 * anInt4450] = null;
				return is;
			}
			if (30000 == i && anInt4451 * -2049862237 > 0) {
				byte[] is = (aByteArrayArray4454[(anInt4451 -= -740538869) * -2049862237]);
				aByteArrayArray4454[anInt4451 * -2049862237] = null;
				return is;
			}
			if (null != Class125.aByteArrayArrayArray1459) {
				for (int i_1_ = 0; i_1_ < Class458.anIntArray5565.length; i_1_++) {
					if (Class458.anIntArray5565[i_1_] == i && Class11.anIntArray167[i_1_] > 0) {
						byte[] is = (Class125.aByteArrayArrayArray1459[i_1_][--Class11.anIntArray167[i_1_]]);
						Class125.aByteArrayArrayArray1459[i_1_][Class11.anIntArray167[i_1_]] = null;
						return is;
					}
				}
			}
			return new byte[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("se.j(").append(')').toString());
		}
	}

	Class439() throws Throwable {
		throw new Error();
	}

	public static void method5597(int i, String string, int i_2_) {
		try {
			int i_3_ = -1468156857 * Class15.anInt192;
			int[] is = Class15.anIntArray187;
			boolean bool = false;
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				Player class432_sub1_sub1_sub1_sub1 = client.players[is[i_4_]];
				if (null != class432_sub1_sub1_sub1_sub1 && (Class263_Sub2.myPlayer != class432_sub1_sub1_sub1_sub1) && class432_sub1_sub1_sub1_sub1.aString10221 != null && class432_sub1_sub1_sub1_sub1.aString10221.equalsIgnoreCase(string)) {
					OutgoingPacket outgoingPacket = null;
					if (1 == i)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION1_PACKET;
					else if (i == 4)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION3_PACKET;
					else if (i == 5)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION4_PACKET;
					else if (6 == i)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION6_PACKET;
					else if (i == 7)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION7_PACKET;
					else if (i == 9)
						outgoingPacket = OutgoingPacket.PLAYER_OPTION9_PACKET;
					if (outgoingPacket != null) {
						Class330_Sub34 class330_sub34 = Class238.method2377(outgoingPacket, (client.aClass1_9025.aClass488_22), 76114328);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 119);
						class330_sub34.aClass330_Sub46_Sub2_7729.addShortA(is[i_4_], -1722903839);
						client.aClass1_9025.method378(class330_sub34, -959598633);
					}
					bool = true;
					break;
				}
			}
			if (!bool)
				Class475_Sub2.method5952(4, new StringBuilder().append(Class526.aClass526_6201.method6257(Class429.aClass454_4369, 991479434)).append(string).toString(), -1817856742);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("se.km(").append(')').toString());
		}
	}

	static boolean method5598(Interface20 interface20, Class330_Sub44 class330_sub44, int i) {
		try {
			return (interface20 != null && interface20.method283(class330_sub44, client.anInterface18Array9004, client.anInt9003 * 1129657189, Class238.aClass355_2583, (byte) 46));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("se.o(").append(')').toString());
		}
	}

	static final void method5599(IComponentDefinitions iComponentDefinitions, Class120 class120, boolean bool, int i, Class430 class430, byte i_5_) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_6_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_7_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			if (-790144721 * iComponentDefinitions.anInt1287 == -1 && !class120.aBoolean1402) {
				Class465.method5842(751119487 * iComponentDefinitions.anInt1196, -680748183);
				Class330_Sub10.method3288(iComponentDefinitions.anInt1196 * 751119487, (byte) 1);
				Class149_Sub1.method1767(iComponentDefinitions.anInt1196 * 751119487, 1056791926);
			}
			if (-1 == i_6_) {
				iComponentDefinitions.anInt1238 = 743404989;
				iComponentDefinitions.anInt1239 = 1266970459;
				iComponentDefinitions.anInt1335 = -1074231699;
			} else {
				iComponentDefinitions.anInt1335 = 1074231699 * i_6_;
				iComponentDefinitions.anInt1336 = i_7_ * 1019228323;
				iComponentDefinitions.aBoolean1337 = bool;
				ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions(i_6_, (byte) -105);
				iComponentDefinitions.anInt1296 = 621744729 * itemDefinitions.modelRotation1;
				iComponentDefinitions.anInt1245 = 1031423121 * itemDefinitions.modelRotation2;
				iComponentDefinitions.anInt1248 = itemDefinitions.anInt6717 * -1858813331;
				iComponentDefinitions.anInt1321 = -760287123 * itemDefinitions.modelOffset1;
				iComponentDefinitions.anInt1243 = itemDefinitions.modelOffset2 * 783716839;
				iComponentDefinitions.anInt1354 = -1563419057 * itemDefinitions.modelZoom;
				iComponentDefinitions.anInt1255 = 302524557 * i;
				if (-1329832751 * iComponentDefinitions.anInt1290 > 0)
					iComponentDefinitions.anInt1354 = -1341543195 * (1141251488 * iComponentDefinitions.anInt1354 / (iComponentDefinitions.anInt1290 * -1329832751));
				else if (2044329613 * iComponentDefinitions.anInt1346 > 0)
					iComponentDefinitions.anInt1354 = (1141251488 * iComponentDefinitions.anInt1354 / (iComponentDefinitions.anInt1346 * 2044329613) * -1341543195);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("se.hu(").append(')').toString());
		}
	}
}
