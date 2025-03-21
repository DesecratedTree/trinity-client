/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class382 implements Interface21 {
	public int anInt6675;
	public int anInt6676;
	public int anInt6677;
	static boolean[] aBooleanArray6678;
	public static IndexTable aClass280_6679;
	public static int anInt6680;

	Class382() {
		/* empty */
	}

	void method4403(Buffer class330_sub46, int i, int i_0_) {
		try {
			if (1 == i) {
				anInt6675 = class330_sub46.readUnsignedShort(1059879321) * 1842397823;
				anInt6676 = class330_sub46.readUnsignedByte(2147295822) * 1502596399;
				anInt6677 = class330_sub46.readUnsignedByte(433529772) * 1415793203;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pw.j(").append(')').toString());
		}
	}

	void method4404(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_1_ = class330_sub46.readUnsignedByte(-244810126);
				if (0 == i_1_) {
					if (i <= -1309826898)
						throw new IllegalStateException();
					break;
				}
				method4403(class330_sub46, i_1_, -1865790399);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pw.r(").append(')').toString());
		}
	}

	static final void method4405(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, -1215593542);
			Class120 class120 = Class3.aClass120Array56[i_2_ >> 16];
			Preferences.method2923(iComponentDefinitions, class120, class430, 1553537538);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pw.ft(").append(')').toString());
		}
	}

	static final void method4406(Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class556.aClass510_6392.getItemDefinitions(i_3_, (byte) -119).anInt6705) * 1746589427;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pw.abq(").append(')').toString());
		}
	}

	static final void method4407(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, 431425382);
			Class60.method676(iComponentDefinitions, class430, (byte) 10);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pw.km(").append(')').toString());
		}
	}

	public static float method4408(float f, float f_5_, int i) {
		try {
			double d = Math.atan2((double) f, (double) f_5_);
			if (d < 0.0)
				d = 3.141592653589793 + (d + 3.141592653589793);
			return (float) d;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pw.j(").append(')').toString());
		}
	}
}
