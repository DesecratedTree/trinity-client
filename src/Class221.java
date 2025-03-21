/* Class221 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class221 implements Interface21 {
	public int anInt6672 = 0;
	public char aChar6673;
	static int anInt6674;

	void method2267(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(1099544411);
				if (i_0_ == 0) {
					if (i >= 0) {
						/* empty */
					}
					break;
				}
				method2268(class330_sub46, i_0_, (byte) 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jh.r(").append(')').toString());
		}
	}

	void method2268(Buffer class330_sub46, int i, byte i_1_) {
		try {
			if (1 == i)
				aChar6673 = Class127.method1546(class330_sub46.readByte((byte) -57), -2082122036);
			else if (5 == i)
				anInt6672 = class330_sub46.readUnsignedShort(1908218697) * 1422996285;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jh.j(").append(')').toString());
		}
	}

	Class221() {
		/* empty */
	}

	static final void method2269(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_3_ = client.aClass286Array9234[i_2_].method2868(238704630);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_3_ == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jh.yz(").append(')').toString());
		}
	}

	static final void method2270(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_4_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_5_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			if (i_4_ >= 0 && i_4_ < 2)
				client.anIntArrayArrayArray9082[i_4_] = new int[i_5_ << 1][4];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jh.afg(").append(')').toString());
		}
	}

	static void method2271(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 2] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 2]), -1340533401).method4641(Class158.aClass561_6474, (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1]), 2092109083)) ? 1 : 0;
			((Class430) class430).anInt4376 -= -1390004513;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jh.e(").append(')').toString());
		}
	}
}
