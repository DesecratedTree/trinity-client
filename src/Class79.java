/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class79 {
	int[] anIntArray659;
	int[] anIntArray660;
	int[] anIntArray661;
	int[] anIntArray662;
	int[] anIntArray663;
	int[] anIntArray664;
	int[] anIntArray665;
	public static Class380 aClass380_666;
	static Class330_Sub36_Sub10 aClass330_Sub36_Sub10_667;

	Class79(Buffer class330_sub46) {
		int i = class330_sub46.readSmart(-1399287914);
		((Class79) this).anIntArray659 = new int[i];
		((Class79) this).anIntArray664 = new int[i];
		((Class79) this).anIntArray661 = new int[i];
		((Class79) this).anIntArray662 = new int[i];
		((Class79) this).anIntArray663 = new int[i];
		((Class79) this).anIntArray660 = new int[i];
		((Class79) this).anIntArray665 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			((Class79) this).anIntArray659[i_0_] = class330_sub46.readUnsignedShort(-192297881) - 5120;
			((Class79) this).anIntArray661[i_0_] = class330_sub46.readUnsignedShort(1513719678) - 5120;
			((Class79) this).anIntArray664[i_0_] = class330_sub46.readShort(-1100583751);
			((Class79) this).anIntArray663[i_0_] = class330_sub46.readUnsignedShort(1659671482) - 5120;
			((Class79) this).anIntArray665[i_0_] = class330_sub46.readUnsignedShort(1028345551) - 5120;
			((Class79) this).anIntArray660[i_0_] = class330_sub46.readShort(-1100583751);
			((Class79) this).anIntArray662[i_0_] = class330_sub46.readShort(-1100583751);
		}
	}

	void method937(int i, byte i_1_) {
		try {
			int[][] is = new int[((Class79) this).anIntArray659.length << 1][4];
			for (int i_2_ = 0; i_2_ < ((Class79) this).anIntArray659.length; i_2_++) {
				is[i_2_ * 2][0] = ((Class79) this).anIntArray659[i_2_];
				is[2 * i_2_][1] = ((Class79) this).anIntArray664[i_2_];
				is[2 * i_2_][2] = ((Class79) this).anIntArray661[i_2_];
				is[2 * i_2_][3] = ((Class79) this).anIntArray662[i_2_];
				is[i_2_ * 2 + 1][0] = ((Class79) this).anIntArray663[i_2_];
				is[1 + 2 * i_2_][1] = ((Class79) this).anIntArray660[i_2_];
				is[1 + 2 * i_2_][2] = ((Class79) this).anIntArray665[i_2_];
				is[1 + 2 * i_2_][3] = ((Class79) this).anIntArray662[i_2_];
			}
			client.anIntArrayArrayArray9082[i] = is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("de.r(").append(')').toString());
		}
	}

	static final void method938(Class430 class430, byte i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) (Math.random() * (double) i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("de.zb(").append(')').toString());
		}
	}

	static final void method939(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub11_7879.method5778(-1804246572) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("de.alf(").append(')').toString());
		}
	}

	static final void method940(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub11_7879, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1 ? 1 : 0, 578342775);
			Class435.method5568(1842100498);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("de.akn(").append(')').toString());
		}
	}

	static final void method941(Class430 class430, byte i) {
		try {
			if (-1551406343 * Class147.anInt1621 == 2)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (int) ((double) Class401_Sub1.aClass145_Sub1_8249.method1713(1747463346) * 2607.5945876176133) >> 3;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (int) client.aFloat9141 >> 3;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("de.agu(").append(')').toString());
		}
	}

	static final void method942(Class430 class430, short i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, -752494825);
			Class120 class120 = Class3.aClass120Array56[i_4_ >> 16];
			Class462.method5704(iComponentDefinitions, class120, class430, (byte) -43);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("de.ec(").append(')').toString());
		}
	}

	static void method943(Buffer class330_sub46, int i, int i_5_) {
		try {
			if (Class332.aClass489_6607 != null) {
				try {
					Class332.aClass489_6607.method6055(0L);
					Class332.aClass489_6607.method6053((class330_sub46.payload), i, 24, -2105283850);
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("de.u(").append(')').toString());
		}
	}
}
