/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class344 implements Interface26 {
	public static Class344 aClass344_6811;
	int anInt6812;
	static Class344 aClass344_6813 = new Class344(0);
	static int anInt6814;

	public int method299() {
		return -1815606911 * ((Class344) this).anInt6812;
	}

	static {
		aClass344_6811 = new Class344(1);
	}

	Class344(int i) {
		((Class344) this).anInt6812 = -80595327 * i;
	}

	public int method297(short i) {
		try {
			return -1815606911 * ((Class344) this).anInt6812;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oi.j(").append(')').toString());
		}
	}

	public int method298() {
		return -1815606911 * ((Class344) this).anInt6812;
	}

	public int method300() {
		return -1815606911 * ((Class344) this).anInt6812;
	}

	public int method301() {
		return -1815606911 * ((Class344) this).anInt6812;
	}

	static final void method4002(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4378 -= -119156554;
			String string = (String) (((Class430) class430).anObjectArray4386[((Class430) class430).anInt4378 * -1378875437]);
			String string_0_ = ((String) (((Class430) class430).anObjectArray4386[1 + ((Class430) class430).anInt4378 * -1378875437]));
			if ((Class263_Sub2.myPlayer.aClass408_10240) != null && (Class263_Sub2.myPlayer.aClass408_10240.aBoolean4213))
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = string_0_;
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oi.aaf(").append(')').toString());
		}
	}

	static final void method4003(int i) {
		try {
			if (client.aFloat9250 < 1034.0F)
				client.aFloat9250 = 1034.0F;
			if (client.aFloat9250 > 2839.0F)
				client.aFloat9250 = 2839.0F;
			for (/**/; client.aFloat9141 >= 16384.0F; client.aFloat9141 -= 16384.0F) {
				/* empty */
			}
			for (/**/; client.aFloat9141 < 0.0F; client.aFloat9141 += 16384.0F) {
				/* empty */
			}
			Class281 class281 = client.aClass304_9030.method2995(1812381571);
			Class356 class356 = client.aClass304_9030.method3023(-400722441);
			int i_1_ = IndexTable.anInt2906 * 690880753 >> 9;
			int i_2_ = Class308.anInt3194 * -977385539 >> 9;
			int i_3_ = Class431.method5342(IndexTable.anInt2906 * 690880753, Class308.anInt3194 * -977385539, Class85.anInt712 * -127654579, 1996761881);
			int i_4_ = 0;
			if (i_1_ > 3 && i_2_ > 3 && i_1_ < client.aClass304_9030.method2990(-877386405) - 4 && i_2_ < client.aClass304_9030.method3033((byte) -103) - 4) {
				for (int i_5_ = i_1_ - 4; i_5_ <= i_1_ + 4; i_5_++) {
					for (int i_6_ = i_2_ - 4; i_6_ <= 4 + i_2_; i_6_++) {
						int i_7_ = Class85.anInt712 * -127654579;
						if (i_7_ < 3 && class281.method2788(i_5_, i_6_, (byte) -26))
							i_7_++;
						int i_8_ = 0;
						byte[][] is = client.aClass304_9030.method2994(i_7_, 1087692644);
						if (null != is)
							i_8_ = 8 * (is[i_5_][i_6_] & 0xff) << 2;
						if (class356.aClass_xaArray3676 != null && class356.aClass_xaArray3676[i_7_] != null) {
							int i_9_ = (i_3_ - (class356.aClass_xaArray3676[i_7_].method6417(i_5_, i_6_, -627582710) - i_8_));
							if (i_9_ > i_4_)
								i_4_ = i_9_;
						}
					}
				}
			}
			int i_10_ = 1536 * (i_4_ >> 2);
			if (i_10_ > 786432)
				i_10_ = 786432;
			if (i_10_ < 262144)
				i_10_ = 262144;
			if (i_10_ > client.anInt9272 * 1018235063)
				client.anInt9272 += ((i_10_ - 1018235063 * client.anInt9272) / 24 * 2128368903);
			else if (i_10_ < 1018235063 * client.anInt9272)
				client.anInt9272 += 2128368903 * ((i_10_ - client.anInt9272 * 1018235063) / 80);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oi.hr(").append(')').toString());
		}
	}
}
