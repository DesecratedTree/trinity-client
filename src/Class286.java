/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class286 {
	public int anInt2945;
	public int anInt2946;
	public int anInt2947;
	public int anInt2948;
	byte aByte2949;
	public int anInt2950;

	public Class286(Buffer class330_sub46) {
		((Class286) this).aByte2949 = class330_sub46.readByte((byte) -73);
		anInt2947 = class330_sub46.readUnsignedShort(1407017287) * 1675281693;
		anInt2945 = class330_sub46.readInt((byte) 96) * 1156205547;
		anInt2948 = class330_sub46.readInt((byte) 32) * -1648770777;
		anInt2946 = class330_sub46.readInt((byte) 17) * 1635938773;
		anInt2950 = class330_sub46.readInt((byte) 121) * -640116387;
	}

	public int method2868(int i) {
		try {
			return ((Class286) this).aByte2949 & 0x7;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.r(").append(')').toString());
		}
	}

	public int method2869(int i) {
		try {
			return (((Class286) this).aByte2949 & 0x8) == 8 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.j(").append(')').toString());
		}
	}

	public Class286() {
		/* empty */
	}

	static final void method2870(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			Class535 class535 = Class95_Sub7.aClass536_7157.method6315(i_0_, 1600259515);
			if ('\001' != class535.aChar6227)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			Integer integer = ((Integer) Class332.anObjectArray6640[208789853 * class535.anInt6226]);
			if (null == integer)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else {
				int i_1_ = (31 == class535.anInt6225 * -842459447 ? -1 : (1 << -842459447 * class535.anInt6225 + 1) - 1);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = ((integer.intValue() & i_1_) >>> class535.anInt6228 * -374810341);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.bx(").append(')').toString());
		}
	}

	static final void method2871(Class430 class430, byte i) {
		try {
			int i_2_ = client.aClass497_9284.method6096(1428254711);
			if (client.windowPaneId * 1522181389 != -1)
				i_2_++;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.anf(").append(')').toString());
		}
	}

	static int method2872(int i, int i_3_) {
		try {
			if (0 == i)
				return 128;
			if (i == 1)
				return 64;
			if (i == 2)
				return 256;
			if (i == 3)
				return 512;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.r(").append(')').toString());
		}
	}

	static final void method2873(int i) {
		try {
			Class379.aClass114Array3952 = null;
			Class330_Sub38.method3541(1522181389 * client.windowPaneId, 0, 0, Class300.anInt3058 * -1969079741, Class146.anInt1615 * -1548608507, 0, 0, -1, (byte) 3);
			if (null != Class379.aClass114Array3952) {
				Class556.method6408(Class379.aClass114Array3952, -1412584499, 0, 0, -1969079741 * Class300.anInt3058, -1548608507 * Class146.anInt1615, Class430.anInt4399 * 1107170231, Class550.anInt6289 * -1082790179, ((IsaacCipher.aClass114_5838 == client.aClass114_9242) ? -1 : (client.aClass114_9242.anInt1358 * -1533268733)), true, -809270634);
				Class379.aClass114Array3952 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.kn(").append(')').toString());
		}
	}

	static final void method2874(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 31717837 * Class360.anInt3760;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class360.anInt3785 * -561279413;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -2052083449 * Class360.anInt3784;
			Class360.anInt3760 = 1929169398;
			Class360.anInt3785 = 251114653;
			Class360.anInt3784 = 1231360841;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.ajz(").append(')').toString());
		}
	}

	static Class330_Sub36_Sub12 method2875(IndexTable class280, int i, int i_4_, byte i_5_) {
		try {
			Buffer class330_sub46 = new Buffer(class280.getFile(i, i_4_));
			Class330_Sub36_Sub12 class330_sub36_sub12 = (new Class330_Sub36_Sub12(i_4_, class330_sub46.readString(-802929058), class330_sub46.readString(-215525662), class330_sub46.readInt((byte) 85), class330_sub46.readInt((byte) 117), class330_sub46.readUnsignedByte(1722253571) == 1, class330_sub46.readUnsignedByte(2049999455), class330_sub46.readUnsignedByte(520598759)));
			int i_6_ = class330_sub46.readUnsignedByte(1270752187);
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				((Class330_Sub36_Sub12) class330_sub36_sub12).aClass471_9711.method5878(new Class330_Sub45(class330_sub46.readUnsignedByte(99693839), class330_sub46.readUnsignedShort(1821206440), class330_sub46.readUnsignedShort(1204294714), class330_sub46.readUnsignedShort(28180444), class330_sub46.readUnsignedShort(1656593943), class330_sub46.readUnsignedShort(239449846), class330_sub46.readUnsignedShort(507596865), class330_sub46.readUnsignedShort(221192694), class330_sub46.readUnsignedShort(379598483)), (short) 8192);
			class330_sub36_sub12.method3483(-1539117435);
			return class330_sub36_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.s(").append(')').toString());
		}
	}

	static final String method2876(String string, String string_8_, String string_9_, int i) {
		try {
			for (int i_10_ = string.indexOf(string_8_); i_10_ != -1; i_10_ = string.indexOf(string_8_, i_10_ + string_9_.length()))
				string = new StringBuilder().append(string.substring(0, i_10_)).append(string_9_).append(string.substring(i_10_ + string_8_.length())).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lx.o(").append(')').toString());
		}
	}
}
