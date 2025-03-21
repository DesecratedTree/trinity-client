/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class16 {
	static int anInt199 = 12002;
	static float aFloat200 = 1.3F;
	static float aFloat201 = 1.1F;
	static int anInt202 = 500;
	static int anInt203 = 5025;
	public static boolean aBoolean204;
	static int anInt205 = 5087;
	static int anInt206 = 20049;
	static int anInt207 = 2071;
	static int anInt208 = 103;
	static int anInt209 = 1001;
	static long aLong210 = 64425238954L;
	static long aLong211 = 60129613779L;
	public static boolean aBoolean212 = false;
	static int anInt213 = 10036;
	public static boolean aBoolean214;
	static long aLong215;

	static {
		aBoolean204 = false;
		aBoolean214 = false;
	}

	Class16() throws Throwable {
		throw new Error();
	}

	static final void method447(Class430 class430, int i) {
		try {
			if (Class282_Sub1.aShortArray7443 == null || (Class432_Sub1_Sub4_Sub2.anInt10001 * -1165310271 >= Class440.anInt4482 * -2048805097))
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (Class282_Sub1.aShortArray7443[((Class432_Sub1_Sub4_Sub2.anInt10001 += -1070151359) * -1165310271) - 1]) & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aq.ads(").append(')').toString());
		}
	}

	static final void method448(Class430 class430, int i) {
		try {
			if (Class238.aClass355_2583.isKeyHeld(86, -107362717))
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aq.adi(").append(')').toString());
		}
	}

	public static int method449(CharSequence charsequence, int i, int i_0_) {
		try {
			return Class240.method2399(charsequence, i, true, -1798249579);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aq.s(").append(')').toString());
		}
	}

	public static void method450(int i) {
		try {
			synchronized (Class394.aClient4082) {
				if (Class130.aFrame1498 != null) {
					/* empty */
				} else {
					Container container = Class432_Sub1_Sub3_Sub1.method5526((byte) 13);
					if (container == null) {
						/* empty */
					} else {
						client.anInt6609 = container.getSize().width * 1458663577;
						Class520.anInt6017 = container.getSize().height * 1944065029;
						if (Class267.aFrame2740 == container) {
							Insets insets = Class267.aFrame2740.getInsets();
							client.anInt6609 -= (insets.right + insets.left) * 1458663577;
							Class520.anInt6017 -= 1944065029 * (insets.bottom + insets.top);
						}
						if (client.anInt6609 * -1408375895 <= 0)
							client.anInt6609 = 1458663577;
						if (394893517 * Class520.anInt6017 <= 0)
							Class520.anInt6017 = 1944065029;
						if (Class545.method6347(1079239502) != 1)
							Class451.method5633(399066082);
						else {
							Class300.anInt3058 = client.anInt9207 * -126389055;
							client.anInt6611 = -759672145 * ((-1408375895 * client.anInt6609 - client.anInt9207 * 64571523) / 2);
							Class146.anInt1615 = client.anInt9118 * -537589265;
							client.anInt6612 = 0;
						}
						if (Class457.aClass457_6834 != Class404.aClass457_4162 && -1969079741 * Class300.anInt3058 < 1024 && Class146.anInt1615 * -1548608507 >= 768) {
							/* empty */
						}
						Class475.aCanvas5700.setSize((-1969079741 * Class300.anInt3058), (Class146.anInt1615 * -1548608507));
						if (Class361.aClass_ra3793 != null)
							Class361.aClass_ra3793.method4806(Class475.aCanvas5700, -1969079741 * Class300.anInt3058, -1548608507 * Class146.anInt1615, (byte) -19);
						if (container == Class267.aFrame2740) {
							Insets insets = Class267.aFrame2740.getInsets();
							Class475.aCanvas5700.setLocation(client.anInt6611 * -1722268593 + insets.left, insets.top + 1819216065 * client.anInt6612);
						} else
							Class475.aCanvas5700.setLocation((client.anInt6611 * -1722268593), (client.anInt6612 * 1819216065));
						Class158_Sub2.method1852(-891496377);
						if (-1 != 1522181389 * client.windowPaneId)
							Class476.method5960(true, (short) -13435);
						Class113.method1384(-1949719547);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aq.gj(").append(')').toString());
		}
	}

	static final void method451(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (!Class361.aClass_ra3793.v())
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 3;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub21_7875.method5716(i_1_, -966768485);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aq.aql(").append(')').toString());
		}
	}
}
