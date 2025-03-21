/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class281 {
	public static int anInt2909 = 8;
	public static int anInt2910 = 2;
	static int anInt2911 = 2;
	static int anInt2912 = 1;
	public static int anInt2913 = 4;
	static int anInt2914;
	static int anInt2915 = 2;
	public byte[][][] aByteArrayArrayArray2916;
	static int anInt2917 = 16;
	static int anInt2918;

	public boolean method2784(int i, int i_0_, byte i_1_) {
		try {
			if (i < 0 || i_0_ < 0 || i >= aByteArrayArrayArray2916[3].length || i_0_ >= aByteArrayArrayArray2916[3][i].length)
				return false;
			return 0 != (aByteArrayArrayArray2916[3][i][i_0_] & 0x2);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.j(").append(')').toString());
		}
	}

	public void method2785(byte i) {
		try {
			for (int i_2_ = 0; i_2_ < aByteArrayArrayArray2916.length; i_2_++) {
				for (int i_3_ = 0; i_3_ < aByteArrayArrayArray2916[0].length; i_3_++) {
					for (int i_4_ = 0; i_4_ < aByteArrayArrayArray2916[0][0].length; i_4_++)
						aByteArrayArrayArray2916[i_2_][i_3_][i_4_] = (byte) 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.r(").append(')').toString());
		}
	}

	public boolean method2786(int i, int i_5_, int i_6_, int i_7_, byte i_8_) {
		try {
			if ((aByteArrayArrayArray2916[0][i_6_][i_7_] & 0x2) != 0)
				return true;
			if (0 != (aByteArrayArrayArray2916[i_5_][i_6_][i_7_] & 0x10))
				return false;
			if (method2787(i_5_, i_6_, i_7_, -1692997948) == i)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.p(").append(')').toString());
		}
	}

	int method2787(int i, int i_9_, int i_10_, int i_11_) {
		try {
			if (0 != (aByteArrayArrayArray2916[i][i_9_][i_10_] & 0x8))
				return 0;
			if (i > 0 && (aByteArrayArrayArray2916[1][i_9_][i_10_] & 0x2) != 0)
				return i - 1;
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.o(").append(')').toString());
		}
	}

	public boolean method2788(int i, int i_12_, byte i_13_) {
		try {
			if (i < 0 || i_12_ < 0 || i >= aByteArrayArrayArray2916[1].length || i_12_ >= aByteArrayArrayArray2916[1][i].length)
				return false;
			if (0 != (aByteArrayArrayArray2916[1][i][i_12_] & 0x2))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.i(").append(')').toString());
		}
	}

	public Class281(int i, int i_14_, int i_15_) {
		aByteArrayArrayArray2916 = new byte[i][i_14_][i_15_];
	}

	static final void method2789(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.anInt1354 = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) * -1341543195;
			Class404.method4738(iComponentDefinitions, 406237489);
			if (iComponentDefinitions.anInt1287 * -790144721 == -1 && !class120.aBoolean1402)
				Class330_Sub10.method3288(751119487 * iComponentDefinitions.anInt1196, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.fi(").append(')').toString());
		}
	}

	static final void method2790(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			int i_16_ = -1;
			int i_17_ = -1;
			Class122 class122 = iComponentDefinitions.method1396(Class361.aClass_ra3793, (byte) -81);
			if (class122 != null) {
				i_16_ = -1683271523 * class122.anInt1407;
				i_17_ = class122.anInt1405 * -1389305879;
			}
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_16_;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.qp(").append(')').toString());
		}
	}

	static final void method2791(int i, int i_18_, int i_19_, int i_20_, byte i_21_) {
		try {
			Class208.method2205(i, i_18_, i_19_, 0, i_20_, false, 1536669850);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.jb(").append(')').toString());
		}
	}

	static void method2792(int i, int i_22_) {
		try {
			if (!Loader.LOBBY_ENABLED || Class360.anInt3791 * 1260801089 == 108)
				Class360.anInt3781 = -126502199 * i;
			else if (Loader.LOBBY_ENABLED && 288 == Class360.anInt3791 * 1260801089)
				Class360.anInt3775 = -1878058163 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ls.y(").append(')').toString());
		}
	}
}
