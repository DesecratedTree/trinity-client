/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class11 {
	static Class_ra aClass_ra164;
	static Class263 aClass263_165;
	static Class471 aClass471_166 = new Class471();
	static int[] anIntArray167;

	Class11() throws Throwable {
		throw new Error();
	}

	static void method428(Class430 class430, byte i) {
		try {
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), -1762749075).aString4084);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("al.r(").append(')').toString());
		}
	}

	static final void method429(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class430.method5334(-2029779553);
			if (class330_sub36_sub12 != null) {
				boolean bool = class330_sub36_sub12.method3484(i_0_ >> 28 & 0x3, i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff, Class428.anIntArray4354, (byte) -50);
				if (bool)
					Class83.method968(Class428.anIntArray4354[1], Class428.anIntArray4354[2], (byte) -25);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("al.aez(").append(')').toString());
		}
	}

	static final void method430(Class430 class430, int i) {
		try {
			CacheIndex.method1523(1963242337);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("al.agp(").append(')').toString());
		}
	}

	static Class371 method431(Buffer class330_sub46, int i) {
		try {
			int i_1_ = class330_sub46.readUnsignedByte(602430291);
			int i_2_ = class330_sub46.readUnsignedByte(464901887);
			return new Class371(i_1_, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("al.o(").append(')').toString());
		}
	}

	static final void method432(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aShort9245;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aShort9016;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("al.amd(").append(')').toString());
		}
	}

	public static void method433(Class440 class440, int i, Class432_Sub1 class432_sub1, int i_3_) {
		try {
			if (-1098735395 * Class333.anInt3360 < 50 && (class440 != null && null != class440.anIntArrayArray4463 && i < class440.anIntArrayArray4463.length && class440.anIntArrayArray4463[i] != null) && (class432_sub1.aByte8658 == (Class263_Sub2.myPlayer.aByte8658))) {
				int i_4_ = class440.anIntArrayArray4463[i][0];
				int i_5_ = i_4_ >> 8;
				int i_6_ = i_4_ >> 5 & 0x7;
				int i_7_ = i_4_ & 0x1f;
				if (class440.anIntArrayArray4463[i].length > 1) {
					int i_8_ = (int) (Math.random() * (double) (class440.anIntArrayArray4463[i]).length);
					if (i_8_ > 0)
						i_5_ = class440.anIntArrayArray4463[i][i_8_];
				}
				int i_9_ = 256;
				if (class440.anIntArray4468 != null && class440.anIntArray4478 != null)
					i_9_ = ((int) (Math.random() * (double) (class440.anIntArray4478[i] - class440.anIntArray4468[i])) + class440.anIntArray4468[i]);
				int i_10_ = (null == class440.anIntArray4476 ? 255 : class440.anIntArray4476[i]);
				if (0 == i_7_) {
					if (class432_sub1 == Class263_Sub2.myPlayer) {
						if (class440.aBoolean4475)
							Class197.method2147(i_5_, i_6_, 0, i_10_, false, i_9_, -1437909969);
						else
							Class115.method1415(i_5_, i_6_, 0, i_10_, i_9_, (byte) -1);
					}
				} else {
					if (class432_sub1 == Class263_Sub2.myPlayer) {
						if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7894.method5841(-2040322733) == 0)
							return;
					} else if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-1841564715) == 0)
						return;
					if (class440.anInt4480 * 1719688515 != -1) {
						int i_11_ = 0;
						if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub1)
							i_11_ = ((Class432_Sub1_Sub1_Sub1) class432_sub1).method5434(516943081);
						else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub4)
							i_11_ = ((Class432_Sub1_Sub1_Sub4) class432_sub1).method5504((byte) -11);
						else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub2)
							i_11_ = ((Class432_Sub1_Sub1_Sub2) class432_sub1).method5492((byte) 2);
						if (i_11_ != 0 && i_11_ != Class263_Sub2.myPlayer.method5434(1819133214) && 1139093383 * client.anInt9158 != i_11_) {
							i_10_ = (i_10_ * (1719688515 * class440.anInt4480) / 100);
							if (i_10_ < 0)
								i_10_ = 0;
							else if (i_10_ > 255)
								i_10_ = 255;
						}
					}
					Class260 class260 = class432_sub1.method5346().aClass260_2606;
					int i_12_ = (int) class260.aFloat2716 - 256 >> 9;
					int i_13_ = (int) class260.aFloat2711 - 256 >> 9;
					int i_14_ = ((Class263_Sub2.myPlayer == class432_sub1) ? 0 : (i_13_ << 8) + ((class432_sub1.aByte8658 << 24) + (i_12_ << 16)) + i_7_);
					Class333.aClass316Array3347[(Class333.anInt3360 += -228509835) * -1098735395 - 1] = new Class316((class440.aBoolean4475 ? (byte) 2 : (byte) 1), i_5_, i_6_, 0, i_10_, i_14_, i_9_, class432_sub1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("al.n(").append(')').toString());
		}
	}
}
