import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325 {
	public Class325 aClass325_3314;
	public Class325 aClass325_3315;

	public void method3204(int i) {
		try {
			if (null != aClass325_3315) {
				aClass325_3315.aClass325_3314 = aClass325_3314;
				aClass325_3314.aClass325_3315 = aClass325_3315;
				aClass325_3314 = null;
				aClass325_3315 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.r(").append(')').toString());
		}
	}

	static void method3205(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1]), -1495153743).anInt4088) * -974103177;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.i(").append(')').toString());
		}
	}

	static final void method3206(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (((Class430) class430).anIntArray4388[(((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397])]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.an(").append(')').toString());
		}
	}

	static final void method3207(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ENTER_NAME_PACKET, client.aClass1_9025.aClass488_22, -113546669);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(string.length() + 1, (byte) 117);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -68);
			client.aClass1_9025.method378(class330_sub34, -333960194);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.ss(").append(')').toString());
		}
	}

	static void method3208(int i, String string, String string_0_, int i_1_) {
		try {
			if (client.aClass1_9025 != null) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2565, client.aClass1_9025.aClass488_22, 933136751);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort((1 + Class158_Sub3.method1856(string, -1844058675) + Class158_Sub3.method1856(string_0_, -1844058675)), (byte) 90);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i, (byte) 23);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3794(string_0_, -437351536);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3794(string, -733313873);
				client.aClass1_9025.method378(class330_sub34, -386502775);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.aru(").append(')').toString());
		}
	}

	public static Class401_Sub1 method3209(int i) {
		try {
			Class507.anInt5936 = 0;
			return Class426.method5318(-344813259);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.s(").append(')').toString());
		}
	}

	static final void method3210(Class430 class430, short i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean9198 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.agx(").append(')').toString());
		}
	}

	static final void method3211(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_3_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			((Class430) class430).aClass209_4385.anIntArray1983[i_2_] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.adl(").append(')').toString());
		}
	}

	static void method3212(int i) {
		try {
			if (Class332.anInt6637 * 1380704417 > 1)
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub26_7901, 4, 108878142);
			else
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub26_7901, 2, -735371252);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nn.b(").append(')').toString());
		}
	}
}
