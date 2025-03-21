/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.EventQueue;

public class Class170 {
	static int anInt1708 = 11;
	static int anInt1709 = 9;
	static int anInt1710 = 3;
	static int anInt1711 = 1;
	static int anInt1712 = 2;
	long aLong1713;
	static int anInt1714 = 4;
	static int anInt1715 = 5;
	static int anInt1716 = 6;
	static int anInt1717 = 7;
	static int anInt1718 = 8;
	static int anInt1719 = 10;
	int anInt1720 = 362102679;
	Class471 aClass471_1721 = new Class471();
	static int anInt1722 = 12;
	static int anInt1723 = 13;
	static EventQueue anEventQueue1724;
	public static int anInt1725;

	public Class170(Buffer class330_sub46) {
		method2036(class330_sub46, -1725070830);
	}

	void method2036(Buffer class330_sub46, int i) {
		try {
			((Class170) this).aLong1713 = class330_sub46.readLong(438481095) * -4223606839463011819L;
			((Class170) this).anInt1720 = class330_sub46.readInt((byte) 44) * -362102679;
			for (int i_0_ = class330_sub46.readUnsignedByte(-128977343); 0 != i_0_; i_0_ = class330_sub46.readUnsignedByte(2004497547)) {
				Class330_Sub12 class330_sub12;
				if (3 == i_0_)
					class330_sub12 = new Class330_Sub12_Sub1(this);
				else if (1 == i_0_)
					class330_sub12 = new Class330_Sub12_Sub6(this);
				else if (13 == i_0_)
					class330_sub12 = new Class330_Sub12_Sub8(this);
				else if (i_0_ == 4)
					class330_sub12 = new Class330_Sub12_Sub5(this);
				else if (i_0_ == 6)
					class330_sub12 = new Class330_Sub12_Sub12(this);
				else if (5 == i_0_)
					class330_sub12 = new Class330_Sub12_Sub11(this);
				else if (i_0_ == 2)
					class330_sub12 = new Class330_Sub12_Sub13(this);
				else if (i_0_ == 7)
					class330_sub12 = new Class330_Sub12_Sub9(this);
				else if (i_0_ == 8)
					class330_sub12 = new Class330_Sub12_Sub7(this);
				else if (i_0_ == 9)
					class330_sub12 = new Class330_Sub12_Sub4(this);
				else if (i_0_ == 10)
					class330_sub12 = new Class330_Sub12_Sub3(this);
				else if (11 == i_0_)
					class330_sub12 = new Class330_Sub12_Sub2(this);
				else if (12 == i_0_)
					class330_sub12 = new Class330_Sub12_Sub10(this);
				else
					throw new RuntimeException("");
				class330_sub12.method3294(class330_sub46, (byte) 64);
				((Class170) this).aClass471_1721.method5878(class330_sub12, (short) 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.r(").append(')').toString());
		}
	}

	public void method2037(Class154 class154, int i) {
		try {
			if ((((Class154) class154).aLong1648 * 6910651671258133193L != ((Class170) this).aLong1713 * 1148306229647402301L) || (1287573465 * ((Class170) this).anInt1720 != ((Class154) class154).anInt1643 * 122803211))
				throw new RuntimeException("");
			for (Class330_Sub12 class330_sub12 = (Class330_Sub12) ((Class170) this).aClass471_1721.method5869(539664854); class330_sub12 != null; class330_sub12 = (Class330_Sub12) ((Class170) this).aClass471_1721.method5873((byte) -58))
				class330_sub12.method3293(class154, -1845348264);
			((Class154) class154).anInt1643 += 2099976099;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.j(").append(')').toString());
		}
	}

	public static Class200 method2038(Buffer class330_sub46, short i) {
		try {
			int i_1_ = class330_sub46.readInt((byte) 7);
			return new Class200(i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.r(").append(')').toString());
		}
	}

	static final int method2039(int i, int i_2_, byte i_3_) {
		try {
			int i_4_ = (AbstractQueue_Sub1.method6486(i - 1, i_2_ - 1, (byte) -122) + AbstractQueue_Sub1.method6486(i + 1, i_2_ - 1, (byte) -6) + AbstractQueue_Sub1.method6486(i - 1, i_2_ + 1, (byte) -31) + AbstractQueue_Sub1.method6486(1 + i, 1 + i_2_, (byte) -35));
			int i_5_ = (AbstractQueue_Sub1.method6486(i - 1, i_2_, (byte) -64) + AbstractQueue_Sub1.method6486(i + 1, i_2_, (byte) -60) + AbstractQueue_Sub1.method6486(i, i_2_ - 1, (byte) -115) + AbstractQueue_Sub1.method6486(i, 1 + i_2_, (byte) -57));
			int i_6_ = AbstractQueue_Sub1.method6486(i, i_2_, (byte) -41);
			return i_5_ / 8 + i_4_ / 16 + i_6_ / 4;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.y(").append(')').toString());
		}
	}

	static final void method2040(Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, 1240263334);
			Class120 class120 = Class3.aClass120Array56[i_7_ >> 16];
			Class481.method6023(iComponentDefinitions, class120, class430, -2050555881);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.en(").append(')').toString());
		}
	}

	static final void method2041(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (-576053059 * ((Class430) class430).aClass330_Sub39_4395.anInt7760);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.yb(").append(')').toString());
		}
	}

	static final void method2042(Class430 class430, byte i) {
		try {
			int i_8_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_8_, 1640917394);
			Class120 class120 = Class3.aClass120Array56[i_8_ >> 16];
			Class116.method1416(iComponentDefinitions, class120, class430, (byte) 63);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.it(").append(')').toString());
		}
	}

	static void method2043(int i) {
		try {
			Class238.aClass355_2583.method4110((byte) -25);
			Class464_Sub23.aClass350_8712.method4033((byte) 0);
			Class394.aClient4082.method3901((byte) -4);
			Class475.aCanvas5700.setBackground(Color.black);
			client.anInt9201 = -472330947;
			Class238.aClass355_2583 = Class386.method4436(Class475.aCanvas5700, (short) -17625);
			Class464_Sub23.aClass350_8712 = Class169.method2032(Class475.aCanvas5700, true, (byte) 91);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.fp(").append(')').toString());
		}
	}

	static final void method2044(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1305 = Class288.method2886(string, class430, 1101762745);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gy.lb(").append(')').toString());
		}
	}
}
