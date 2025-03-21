/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class148 implements Runnable {
	InetAddress anInetAddress1622;
	volatile String aString1623;

	public String method1746(int i) {
		try {
			return ((Class148) this).aString1623;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.r(").append(')').toString());
		}
	}

	public void run() {
		try {
			((Class148) this).aString1623 = ((Class148) this).anInetAddress1622.getHostName();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.run(").append(')').toString());
		}
	}

	Class148(int i) throws UnknownHostException {
		((Class148) this).anInetAddress1622 = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff), (byte) (i >> 16 & 0xff), (byte) (i >> 8 & 0xff), (byte) (i & 0xff) });
	}

	static final void method1747(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 2007105397);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class439.method5599(iComponentDefinitions, class120, false, 0, class430, (byte) 94);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.hw(").append(')').toString());
		}
	}

	static final void method1748(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anInt4376 -= -1015143242;
			byte[] is = null;
			byte[] is_1_ = null;
			int i_2_;
			for (i_2_ = 0; i_2_ < 10; i_2_ += 2) {
				if ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + i_2_]) < 0) {
					if (i != 975148730) {
						/* empty */
					}
					break;
				}
			}
			if (i_2_ > 0) {
				is = new byte[i_2_ / 2];
				is_1_ = new byte[i_2_ / 2];
				for (i_2_ -= 2; i_2_ >= 0; i_2_ -= 2) {
					is[i_2_ / 2] = (byte) (((Class430) class430).anIntArray4387[i_2_ + 1632830751 * (((Class430) class430).anInt4376)]);
					is_1_[i_2_ / 2] = (byte) (((Class430) class430).anIntArray4387[i_2_ + (((Class430) class430).anInt4376 * 1632830751) + 1]);
				}
			}
			Class123.method1507(iComponentDefinitions, is, is_1_, class430, -2031668772);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.kc(").append(')').toString());
		}
	}

	static final void method1749(Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (-296919301 * client.anInt8995 != 15 || Class434.method5564(-1908258007))
				client.aByte9283 = (byte) -5;
			else if (string.length() > 20)
				client.aByte9283 = (byte) -4;
			else {
				client.aByte9283 = (byte) -1;
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2543, client.aClass1_9060.aClass488_22, -449004703);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 28);
				int i_3_ = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -113);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3751(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_3_, 1720365324);
				client.aClass1_9060.method378(class330_sub34, -277698596);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.abm(").append(')').toString());
		}
	}

	static final void method1750(Class430 class430, int i) {
		try {
			Class330_Sub38 class330_sub38 = Class158_Sub3.method1857(16711935);
			if (null == class330_sub38) {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			} else {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -558904089 * class330_sub38.anInt7755;
				int i_4_ = (class330_sub38.anInt7751 * 1693642153 << 28 | (-1917247207 * class330_sub38.anInt7756 + Class354.anInt3510) << 14 | (Class354.anInt3516 + 779987703 * class330_sub38.anInt7753));
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = i_4_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.aei(").append(')').toString());
		}
	}

	static final void method1751(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			client.aShort9245 = (short) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			if (client.aShort9245 <= 0)
				client.aShort9245 = (short) 256;
			client.aShort9016 = (short) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			if (client.aShort9016 <= 0)
				client.aShort9016 = (short) 320;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.amy(").append(')').toString());
		}
	}

	static final void method1752(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_5_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_6_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			Class537 class537 = Class301.aClass543_3059.method6339(i_6_, -1460827564);
			if (class537.method6321((byte) 38))
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = (Class79.aClass380_666.method4387(i_5_, (byte) -54).method4328(i_6_, class537.aString6236, (short) 4937));
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (Class79.aClass380_666.method4387(i_5_, (byte) -90).method4329(i_6_, class537.anInt6235 * -735399997, (byte) 43));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.aoa(").append(')').toString());
		}
	}

	static final void method1753(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 100 == -1755364031 * Class354_Sub1.anInt7977 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.aem(").append(')').toString());
		}
	}

	static final void method1754(Class430 class430, int i) {
		try {
			Class432_Sub1_Sub4_Sub1.method5540(class430, -1685413346);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.sz(").append(')').toString());
		}
	}

	public static void method1755(Class61[] class61s, int i) {
		try {
			Class144.anInt1577 = class61s.length * -940536913;
			Class_na.aClass61Array9725 = new Class61[10 + Class144.anInt1577 * -1296454833];
			Class444.anIntArray4495 = new int[-1296454833 * Class144.anInt1577 + 10];
			System.arraycopy(class61s, 0, Class_na.aClass61Array9725, 0, -1296454833 * Class144.anInt1577);
			for (int i_7_ = 0; i_7_ < -1296454833 * Class144.anInt1577; i_7_++)
				Class444.anIntArray4495[i_7_] = Class_na.aClass61Array9725[i_7_].method683();
			for (int i_8_ = Class144.anInt1577 * -1296454833; i_8_ < Class_na.aClass61Array9725.length; i_8_++)
				Class444.anIntArray4495[i_8_] = 12;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("g.aw(").append(')').toString());
		}
	}
}
