/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class334 {
	Class334() throws Throwable {
		throw new Error();
	}

	static final void method3931(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub15_7902.method5792(981226512);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nx.ame(").append(')').toString());
		}
	}

	static final void method3932(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (!Class361.aClass_ra3793.ac())
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 3;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5716(i_0_, -1761361320);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nx.aqs(").append(')').toString());
		}
	}

	static final void method3933(byte i) {
		try {
			for (int i_1_ = 0; i_1_ < client.anInt9017 * -823688441; i_1_++) {
				int i_2_ = client.anIntArray9018[i_1_];
				Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_2_));
				if (class330_sub35 != null) {
					NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
					Class520.method6223(class432_sub1_sub1_sub1_sub2, false, 1801294468);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nx.hb(").append(')').toString());
		}
	}

	static final void method3934(int i, byte i_3_) {
		try {
			method3935((short) -12406);
			int i_4_ = ((Class366_Sub4.aClass231_8007.method2346(i, -1999941769).anInt6672) * 1231993877);
			if (0 != i_4_) {
				int i_5_ = Class158.aClass561_6474.anIntArray6980[i];
				if (i_4_ == 5)
					client.anInt9145 = -672329549 * i_5_;
				if (i_4_ == 6)
					client.anInt9011 = i_5_ * 641997669;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nx.la(").append(')').toString());
		}
	}

	public static void method3935(short i) {
		try {
			for (Class330_Sub20 class330_sub20 = ((Class330_Sub20) Class330_Sub20.aClass471_7649.method5869(539664854)); null != class330_sub20; class330_sub20 = ((Class330_Sub20) Class330_Sub20.aClass471_7649.method5873((byte) -9))) {
				if (((Class330_Sub20) class330_sub20).aBoolean7653)
					class330_sub20.method3373((byte) -58);
			}
			for (Class330_Sub20 class330_sub20 = ((Class330_Sub20) Class330_Sub20.aClass471_7650.method5869(539664854)); null != class330_sub20; class330_sub20 = (Class330_Sub20) Class330_Sub20.aClass471_7650.method5873((byte) -15)) {
				if (((Class330_Sub20) class330_sub20).aBoolean7653)
					class330_sub20.method3373((byte) -43);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nx.j(").append(')').toString());
		}
	}

	static final void method3936(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4378 -= -119156554;
			((Class430) class430).anInt4376 -= 1514958270;
			String string = (String) (((Class430) class430).anObjectArray4386[((Class430) class430).anInt4378 * -1378875437]);
			int i_6_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_7_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			String string_8_ = ((String) (((Class430) class430).anObjectArray4386[((Class430) class430).anInt4378 * -1378875437 + 1]));
			Class339.method3967(string, i_6_ == 1, i_7_, string_8_, (byte) 3);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class440.anInt4482 * -2048805097;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nx.abr(").append(')').toString());
		}
	}

	static int method3937(Class330_Sub46_Sub2 class330_sub46_sub2, int i) {
		try {
			int i_9_ = class330_sub46_sub2.readBits(2);
			int i_10_;
			if (0 == i_9_)
				i_10_ = 0;
			else if (1 == i_9_)
				i_10_ = class330_sub46_sub2.readBits(5);
			else if (i_9_ == 2)
				i_10_ = class330_sub46_sub2.readBits(8);
			else
				i_10_ = class330_sub46_sub2.readBits(11);
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nx.p(").append(')').toString());
		}
	}
}
