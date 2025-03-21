/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class522 {
	public boolean aBoolean6018 = false;
	public int anInt6019;
	public int anInt6020;
	Class552 aClass552_6021;

	void method6226(Buffer class330_sub46, int i, byte i_0_) {
		try {
			if (1 == i)
				anInt6019 = class330_sub46.readBigSmart(-1963212209) * 1123871025;
			else if (i == 2)
				anInt6020 = class330_sub46.readUnsignedTriByte(-1401356047) * 898898643;
			else if (3 == i)
				aBoolean6018 = true;
			else if (4 == i)
				anInt6019 = -1123871025;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vo.j(").append(')').toString());
		}
	}

	Class522() {
		/* empty */
	}

	public Class61 method6227(Class_ra class_ra, int i, boolean bool, byte i_1_) {
		try {
			long l = (long) (anInt6019 * -1331179567 | i << 16 | (bool ? 262144 : 0) | 1409150453 * class_ra.anInt4226 << 19);
			Class61 class61 = (Class61) ((Class552) ((Class522) this).aClass552_6021).aClass367_6363.get(l);
			if (class61 != null)
				return class61;
			if (!((Class552) ((Class522) this).aClass552_6021).aClass280_6358.method2750(-1331179567 * anInt6019, -1940970232))
				return null;
			Class87 class87 = Class53.method643((((Class552) (((Class522) this).aClass552_6021)).aClass280_6358), -1331179567 * anInt6019, 0);
			if (null != class87) {
				class87.method992();
				if (bool)
					class87.method999();
				for (int i_2_ = 0; i_2_ < i; i_2_++)
					class87.method1000();
			}
			class61 = class_ra.bw(class87, true);
			if (null != class61)
				((Class552) ((Class522) this).aClass552_6021).aClass367_6363.put(class61, l);
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vo.i(").append(')').toString());
		}
	}

	void method6228(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_3_ = class330_sub46.readUnsignedByte(-235083345);
				if (i_3_ == 0) {
					if (i != 185624338) {
						/* empty */
					}
					break;
				}
				method6226(class330_sub46, i_3_, (byte) 10);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vo.r(").append(')').toString());
		}
	}

	public boolean method6229(int i) {
		try {
			return ((Class552) ((Class522) this).aClass552_6021).aClass280_6358.method2750(-1331179567 * anInt6019, 795135034);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vo.p(").append(')').toString());
		}
	}

	public static boolean method6230(int i, int i_4_) {
		try {
			return (i == 6 || i == 5 || i == 3 || i == 18 || i == 14 || 8 == i || 17 == i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vo.fo(").append(')').toString());
		}
	}

	static final void method6231(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_5_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_6_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			Class537 class537 = Class301.aClass543_3059.method6339(i_6_, -446667577);
			if (class537.method6321((byte) -19))
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = Class158_Sub3.aClass553_8875.method6392(i_5_, 1537817168).method6376(i_6_, class537.aString6236, 1220901222);
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (Class158_Sub3.aClass553_8875.method6392(i_5_, -1322207524).method6370(i_6_, -735399997 * class537.anInt6235, (byte) 79));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vo.abj(").append(')').toString());
		}
	}
}
