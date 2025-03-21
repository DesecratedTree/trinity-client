/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127 {
	public int anInt1464;
	public int anInt1465;
	public int anInt1466;
	public int anInt1467;
	public int anInt1468;
	public boolean aBoolean1469;
	public int anInt1470;
	public int anInt1471;
	public int anInt1472;
	public int anInt1473 = 1339975144;
	public int anInt1474;

	void method1542(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(2077404239);
				if (i_0_ == 0) {
					if (i > 1222628742)
						break;
					break;
				}
				method1543(class330_sub46, i_0_, -1792281236);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fc.r(").append(')').toString());
		}
	}

	Class127() {
		anInt1470 = -1259708575;
	}

	void method1543(Buffer class330_sub46, int i, int i_1_) {
		try {
			if (i == 1)
				anInt1473 = class330_sub46.readUnsignedShort(-65500571) * -1443115843;
			else if (2 == i)
				aBoolean1469 = true;
			else if (3 == i) {
				anInt1466 = class330_sub46.readShort(-1100583751) * -1427924827;
				anInt1467 = class330_sub46.readShort(-1100583751) * -2066128453;
				anInt1465 = class330_sub46.readShort(-1100583751) * -236373017;
			} else if (i == 4)
				anInt1468 = class330_sub46.readUnsignedByte(380418872) * -1612727377;
			else if (i == 5)
				anInt1471 = class330_sub46.readBigSmart(-1153386204) * -734807011;
			else if (6 == i)
				anInt1470 = class330_sub46.readUnsignedTriByte(-1401356047) * -367681377;
			else if (i == 7) {
				anInt1472 = class330_sub46.readShort(-1100583751) * 284628627;
				anInt1464 = class330_sub46.readShort(-1100583751) * 1658989935;
				anInt1474 = class330_sub46.readShort(-1100583751) * 173933565;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fc.j(").append(')').toString());
		}
	}

	static final void method1544(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class117 class117 = Class144.method1668(i_2_, (byte) 16);
			int i_3_ = 0;
			if (class117 != null)
				i_3_ = class117.anInt1380 * -2046881741;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fc.acw(").append(')').toString());
		}
	}

	static final void method1545(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_4_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_5_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_6_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			IComponentDefinitions iComponentDefinitions = Class166.method1993(i_4_ << 16 | i_5_, i_6_, 534399539);
			Class490.method6071(-1799482790);
			Class330_Sub2 class330_sub2 = client.method3924(iComponentDefinitions);
			Class400.method4708(iComponentDefinitions, class330_sub2.method3265((byte) 1), -968253727 * class330_sub2.anInt7502, -2070960103);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fc.aot(").append(')').toString());
		}
	}

	public static char method1546(byte i, int i_7_) {
		try {
			int i_8_ = i & 0xff;
			if (i_8_ == 0)
				throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_8_, 16)).toString());
			if (i_8_ >= 128 && i_8_ < 160) {
				int i_9_ = Class458.aCharArray5564[i_8_ - 128];
				if (i_9_ == 0)
					i_9_ = 63;
				i_8_ = i_9_;
			}
			return (char) i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fc.p(").append(')').toString());
		}
	}

	static final void method1547(Class430 class430, byte i) {
		try {
			int i_10_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class1 class1 = Class426.method5317(2135201871);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.CHAT_TYPE_PACKET, class1.aClass488_22, 1311536182);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i_10_, (byte) 15);
			class1.method378(class330_sub34, -1953941913);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("fc.aca(").append(')').toString());
		}
	}
}
