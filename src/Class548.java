/* Class548 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class548 {
	public int anInt6262;
	public int anInt6263;
	public int anInt6264;

	Class548(int i, int i_0_, int i_1_) {
		anInt6264 = i * 1805443455;
		anInt6263 = -276119881 * i_0_;
		anInt6262 = i_1_ * -1198536083;
	}

	static final void method6357(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4388[(((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397])] = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wr.af(").append(')').toString());
		}
	}

	static Class432_Sub1_Sub1_Sub1 method6358(int i, int i_2_, int i_3_, int i_4_) {
		try {
			Class340 class340 = (client.aClass304_9030.method3023(-400722441).aClass340ArrayArrayArray3653[i][i_2_][i_3_]);
			if (null == class340)
				return null;
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = null;
			int i_5_ = -1;
			for (Class352 class352 = class340.aClass352_3388; class352 != null; class352 = class352.aClass352_3483) {
				Class432_Sub1_Sub1 class432_sub1_sub1 = class352.aClass432_Sub1_Sub1_3484;
				if (class432_sub1_sub1 instanceof Class432_Sub1_Sub1_Sub1) {
					Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1_6_ = (Class432_Sub1_Sub1_Sub1) class432_sub1_sub1;
					int i_7_ = ((class432_sub1_sub1_sub1_6_.method5453(-1776431320) - 1) * 256 + 252);
					Class260 class260 = (class432_sub1_sub1_sub1_6_.method5346().aClass260_2606);
					int i_8_ = (int) class260.aFloat2716 - i_7_ >> 9;
					int i_9_ = (int) class260.aFloat2711 - i_7_ >> 9;
					int i_10_ = i_7_ + (int) class260.aFloat2716 >> 9;
					int i_11_ = i_7_ + (int) class260.aFloat2711 >> 9;
					if (i_8_ <= i_2_ && i_9_ <= i_3_ && i_10_ >= i_2_ && i_11_ >= i_3_) {
						int i_12_ = (i_10_ + 1 - i_2_) * (i_11_ + 1 - i_3_);
						if (i_12_ > i_5_) {
							class432_sub1_sub1_sub1 = class432_sub1_sub1_sub1_6_;
							i_5_ = i_12_;
						}
					}
				}
			}
			return class432_sub1_sub1_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wr.im(").append(')').toString());
		}
	}
}
