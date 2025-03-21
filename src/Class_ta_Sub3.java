/* Class_ta_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_ta_Sub3 extends Class_ta {
	int[] anIntArray8661;
	int[] anIntArray8662;

	Class_ta_Sub3(int i, int i_0_, int[] is, int[] is_1_) {
		((Class_ta_Sub3) this).anIntArray8661 = is;
		((Class_ta_Sub3) this).anIntArray8662 = is_1_;
	}

	static final void method5684(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_2_ == -1) {
				int i_3_ = i_2_ >> 14 & 0x3fff;
				int i_4_ = i_2_ & 0x3fff;
				Class381 class381 = client.aClass304_9030.method3022(2005692921);
				i_3_ -= -1261027839 * class381.gameSceneBaseX;
				if (i_3_ < 0)
					i_3_ = 0;
				else if (i_3_ >= client.aClass304_9030.method2990(-1230718412))
					i_3_ = client.aClass304_9030.method2990(-965199704);
				i_4_ -= class381.gameSceneBaseY * -1542584207;
				if (i_4_ < 0)
					i_4_ = 0;
				else if (i_4_ >= client.aClass304_9030.method3033((byte) -38))
					i_4_ = client.aClass304_9030.method3033((byte) -58);
				Class457.anInt6844 = -1651776935 * (256 + (i_3_ << 9));
				Class439.anInt4456 = ((i_4_ << 9) + 256) * -1180637393;
			} else {
				Class457.anInt6844 = 1651776935;
				Class439.anInt4456 = 1180637393;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yq.ahh(").append(')').toString());
		}
	}

	static final void method5685(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1639912027;
			Class115.method1415((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]), (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]), (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 2]), (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 3]), (((Class430) class430).anIntArray4387[4 + ((Class430) class430).anInt4376 * 1632830751]), (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yq.tr(").append(')').toString());
		}
	}

	static String method5686(int i, Class454 class454, int i_5_) {
		try {
			if (i < 100000)
				return new StringBuilder().append("<col=ffff00>").append(i).append("</col>").toString();
			if (i < 10000000)
				return new StringBuilder().append("<col=ffffff>").append(i / 1000).append(Class526.aClass526_6177.method6257(class454, 991479434)).append("</col>").toString();
			return new StringBuilder().append("<col=00ff80>").append(i / 1000000).append(Class526.aClass526_6175.method6257(class454, 991479434)).append("</col>").toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yq.b(").append(')').toString());
		}
	}
}
