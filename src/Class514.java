/* Class514 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class514 {
	public int anInt5967 = 21824477;
	static int anInt5968 = 1;
	public char aChar5969;
	public static int anInt5970 = 0;

	void method6199(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(4497355);
				if (0 == i_0_) {
					if (i >= -1687185181)
						throw new IllegalStateException();
					break;
				}
				method6200(class330_sub46, i_0_, (byte) 106);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vg.r(").append(')').toString());
		}
	}

	void method6200(Buffer class330_sub46, int i, byte i_1_) {
		try {
			if (i == 1)
				aChar5969 = Class127.method1546(class330_sub46.readByte((byte) -9), -2083396432);
			else if (i == 2)
				anInt5967 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vg.j(").append(')').toString());
		}
	}

	Class514() {
		/* empty */
	}

	static final void method6201(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			Class472 class472 = Class354.method4082(i_2_ >> 14 & 0x3fff, i_2_ & 0x3fff);
			boolean bool = false;
			for (Class330_Sub36_Sub12 class330_sub36_sub12 = (Class330_Sub36_Sub12) class472.method5884((byte) 112); null != class330_sub36_sub12; class330_sub36_sub12 = ((Class330_Sub36_Sub12) class472.method5886((short) 8192))) {
				if (class330_sub36_sub12.anInt9708 * -1647784587 == i_3_) {
					bool = true;
					break;
				}
			}
			if (bool)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vg.aes(").append(')').toString());
		}
	}

	static final void method6202(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, -291201542);
			Class120 class120 = Class3.aClass120Array56[i_4_ >> 16];
			Class304.method3035(iComponentDefinitions, class120, class430, (byte) -115);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vg.ja(").append(')').toString());
		}
	}
}
