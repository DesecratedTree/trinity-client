/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class278 {
	int[] archiveIds;
	int anInt2870;
	Class139 class139;
	int[] anIntArray2872;
	static int anInt2873 = 7;
	int anInt2874;
	int[] anIntArray2875;
	int[][] anIntArrayArray2876;
	int archiveSize;
	int[] anIntArray2878;
	byte[][] aByteArrayArray2879;
	int[] anIntArray2880;
	byte[] aByteArray2881;
	int[][] anIntArrayArray2882;
	int anInt2883;
	Class139[] class139s;
	int[] anIntArray2885;

	Class278(byte[] is, int i, byte[] is_0_) {
		((Class278) this).anInt2870 = Class125.method1528(is, is.length, 283126520) * -1689326505;
		if (1411825511 * ((Class278) this).anInt2870 != i)
			throw new RuntimeException();
		if (is_0_ != null) {
			if (is_0_.length != 64)
				throw new RuntimeException();
			((Class278) this).aByteArray2881 = Class562.method6473(is, 0, is.length, (byte) -59);
			for (int i_1_ = 0; i_1_ < 64; i_1_++) {
				if (((Class278) this).aByteArray2881[i_1_] != is_0_[i_1_])
					throw new RuntimeException();
			}
		}
		method2737(is, -1152721345);
	}

	void method2737(byte[] is, int i) {
		try {
			Buffer class330_sub46 = new Buffer(Class143.method1659(is, (short) -315));
			int i_2_ = class330_sub46.readUnsignedByte(2118019095);
			if (i_2_ < 5 || i_2_ > 7)
				throw new RuntimeException();
			if (i_2_ >= 6)
				((Class278) this).anInt2874 = class330_sub46.readInt((byte) 71) * 265240323;
			else
				((Class278) this).anInt2874 = 0;
			int i_3_ = class330_sub46.readUnsignedByte(447371117);
			boolean bool = 0 != (i_3_ & 0x1);
			boolean bool_4_ = 0 != (i_3_ & 0x2);
			if (i_2_ >= 7)
				((Class278) this).anInt2883 = class330_sub46.method3768(373696947) * -1164789285;
			else
				((Class278) this).anInt2883 = class330_sub46.readUnsignedShort(-295148049) * -1164789285;
			int i_5_ = 0;
			int i_6_ = -1;
			((Class278) this).archiveIds = new int[((Class278) this).anInt2883 * -1914660269];
			if (i_2_ >= 7) {
				for (int i_7_ = 0; i_7_ < -1914660269 * ((Class278) this).anInt2883; i_7_++) {
					((Class278) this).archiveIds[i_7_] = i_5_ += class330_sub46.method3768(373696947);
					if (((Class278) this).archiveIds[i_7_] > i_6_)
						i_6_ = ((Class278) this).archiveIds[i_7_];
				}
			} else {
				for (int i_8_ = 0; i_8_ < ((Class278) this).anInt2883 * -1914660269; i_8_++) {
					((Class278) this).archiveIds[i_8_] = i_5_ += class330_sub46.readUnsignedShort(43030293);
					if (((Class278) this).archiveIds[i_8_] > i_6_)
						i_6_ = ((Class278) this).archiveIds[i_8_];
				}
			}
			((Class278) this).archiveSize = (i_6_ + 1) * 554055083;
			((Class278) this).anIntArray2878 = new int[1334516995 * ((Class278) this).archiveSize];
			if (bool_4_)
				((Class278) this).aByteArrayArray2879 = new byte[((Class278) this).archiveSize * 1334516995][];
			((Class278) this).anIntArray2880 = new int[1334516995 * ((Class278) this).archiveSize];
			((Class278) this).anIntArray2872 = new int[1334516995 * ((Class278) this).archiveSize];
			((Class278) this).anIntArrayArray2882 = new int[1334516995 * ((Class278) this).archiveSize][];
			((Class278) this).anIntArray2885 = new int[1334516995 * ((Class278) this).archiveSize];
			if (bool) {
				((Class278) this).anIntArray2875 = new int[((Class278) this).archiveSize * 1334516995];
				for (int i_9_ = 0; i_9_ < ((Class278) this).archiveSize * 1334516995; i_9_++)
					((Class278) this).anIntArray2875[i_9_] = -1;
				for (int i_10_ = 0; i_10_ < -1914660269 * ((Class278) this).anInt2883; i_10_++)
					((Class278) this).anIntArray2875[(((Class278) this).archiveIds[i_10_])] = class330_sub46.readInt((byte) 96);
				((Class278) this).class139 = new Class139(((Class278) this).anIntArray2875);
			}
			for (int i_11_ = 0; i_11_ < ((Class278) this).anInt2883 * -1914660269; i_11_++)
				((Class278) this).anIntArray2878[(((Class278) this).archiveIds[i_11_])] = class330_sub46.readInt((byte) 33);
			if (bool_4_) {
				for (int i_12_ = 0; i_12_ < ((Class278) this).anInt2883 * -1914660269; i_12_++) {
					byte[] is_13_ = new byte[64];
					class330_sub46.readBytes(is_13_, 0, 64, 1274334002);
					((Class278) this).aByteArrayArray2879[((Class278) this).archiveIds[i_12_]] = is_13_;
				}
			}
			for (int i_14_ = 0; i_14_ < ((Class278) this).anInt2883 * -1914660269; i_14_++)
				((Class278) this).anIntArray2880[(((Class278) this).archiveIds[i_14_])] = class330_sub46.readInt((byte) 28);
			if (i_2_ >= 7) {
				for (int i_15_ = 0; i_15_ < -1914660269 * ((Class278) this).anInt2883; i_15_++)
					((Class278) this).anIntArray2872[(((Class278) this).archiveIds[i_15_])] = class330_sub46.method3768(373696947);
				for (int i_16_ = 0; i_16_ < ((Class278) this).anInt2883 * -1914660269; i_16_++) {
					int i_17_ = ((Class278) this).archiveIds[i_16_];
					int i_18_ = ((Class278) this).anIntArray2872[i_17_];
					i_5_ = 0;
					int i_19_ = -1;
					((Class278) this).anIntArrayArray2882[i_17_] = new int[i_18_];
					for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
						int i_21_ = (((Class278) this).anIntArrayArray2882[i_17_][i_20_] = i_5_ += class330_sub46.method3768(373696947));
						if (i_21_ > i_19_)
							i_19_ = i_21_;
					}
					((Class278) this).anIntArray2885[i_17_] = 1 + i_19_;
					if (i_18_ == 1 + i_19_)
						((Class278) this).anIntArrayArray2882[i_17_] = null;
				}
			} else {
				for (int i_22_ = 0; i_22_ < -1914660269 * ((Class278) this).anInt2883; i_22_++)
					((Class278) this).anIntArray2872[(((Class278) this).archiveIds[i_22_])] = class330_sub46.readUnsignedShort(1817748295);
				for (int i_23_ = 0; i_23_ < ((Class278) this).anInt2883 * -1914660269; i_23_++) {
					int i_24_ = ((Class278) this).archiveIds[i_23_];
					int i_25_ = ((Class278) this).anIntArray2872[i_24_];
					i_5_ = 0;
					int i_26_ = -1;
					((Class278) this).anIntArrayArray2882[i_24_] = new int[i_25_];
					for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
						int i_28_ = (((Class278) this).anIntArrayArray2882[i_24_][i_27_] = i_5_ += class330_sub46.readUnsignedShort(-195203348));
						if (i_28_ > i_26_)
							i_26_ = i_28_;
					}
					((Class278) this).anIntArray2885[i_24_] = 1 + i_26_;
					if (i_25_ == i_26_ + 1)
						((Class278) this).anIntArrayArray2882[i_24_] = null;
				}
			}
			if (bool) {
				((Class278) this).anIntArrayArray2876 = new int[1 + i_6_][];
				((Class278) this).class139s = new Class139[1 + i_6_];
				for (int i_29_ = 0; i_29_ < -1914660269 * ((Class278) this).anInt2883; i_29_++) {
					int i_30_ = ((Class278) this).archiveIds[i_29_];
					int i_31_ = ((Class278) this).anIntArray2872[i_30_];
					((Class278) this).anIntArrayArray2876[i_30_] = new int[((Class278) this).anIntArray2885[i_30_]];
					for (int i_32_ = 0; i_32_ < ((Class278) this).anIntArray2885[i_30_]; i_32_++)
						((Class278) this).anIntArrayArray2876[i_30_][i_32_] = -1;
					for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
						int i_34_;
						if (null != ((Class278) this).anIntArrayArray2882[i_30_])
							i_34_ = (((Class278) this).anIntArrayArray2882[i_30_][i_33_]);
						else
							i_34_ = i_33_;
						((Class278) this).anIntArrayArray2876[i_30_][i_34_] = class330_sub46.readInt((byte) 122);
					}
					((Class278) this).class139s[i_30_] = new Class139(((Class278) this).anIntArrayArray2876[i_30_]);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lo.r(").append(')').toString());
		}
	}

	public static void method2738(IndexTable class280, IndexTable class280_35_, IndexTable class280_36_, IndexTable class280_37_, byte i) {
		try {
			Class330_Sub12_Sub9.aClass280_9534 = class280;
			Class284.aClass280_2927 = class280_35_;
			Class26.aClass280_314 = class280_36_;
			Class3.aClass120Array56 = new Class120[Class330_Sub12_Sub9.aClass280_9534.method2764(1775235790)];
			Class382.aBooleanArray6678 = new boolean[Class330_Sub12_Sub9.aClass280_9534.method2764(1483518956)];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lo.r(").append(')').toString());
		}
	}

	static int method2739(int i, byte i_38_) {
		try {
			if (16711935 == i)
				return -1;
			return Class404.method4739(i, -1769481276);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lo.p(").append(')').toString());
		}
	}

	static final int[] method2740(String string, Class430 class430, byte i) {
		try {
			int[] is = null;
			if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
				int i_39_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
				if (i_39_ > 0) {
					is = new int[i_39_];
					while (i_39_-- > 0)
						is[i_39_] = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lo.kz(").append(')').toString());
		}
	}

	static final void method2741(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4378 -= -119156554;
			String string = (String) (((Class430) class430).anObjectArray4386[((Class430) class430).anInt4378 * -1378875437]);
			String string_40_ = ((String) (((Class430) class430).anObjectArray4386[1 + ((Class430) class430).anInt4378 * -1378875437]));
			if (-2051927139 * client.anInt9182 != 0 || ((!client.aBoolean9083 || client.aBoolean9228) && !client.aBoolean9073)) {
				Class1 class1 = Class426.method5317(1848002995);
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.SEND_PM_PACKET, class1.aClass488_22, 793942574);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 47);
				int i_41_ = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) 0);
				Class210.method2220(class330_sub34.aClass330_Sub46_Sub2_7729, string_40_, -381654745);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3772(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_41_, (byte) 47);
				class1.method378(class330_sub34, -923937685);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lo.ack(").append(')').toString());
		}
	}

	public static void method2742(byte i) {
		try {
			if (Class507.aBoolean5939) {
				if (Class507.anInt5931 * 725098089 < Class125.anInt1458 * 1010387987)
					Class507.anInt5931 = Class125.anInt1458 * 1299742491;
				while (Class507.anInt5931 * 725098089 < -49635837 * Class509.anInt5946) {
					Class401_Sub1 class401_sub1 = Class23.method476(725098089 * Class507.anInt5931, (byte) 88);
					if (null == class401_sub1 || class401_sub1.anInt8248 * 284224351 != -1)
						Class507.anInt5931 += -1854451239;
					else {
						if (null == Class507.aClass422_5938)
							Class507.aClass422_5938 = (client.aClass423_9029.method5298(class401_sub1.aString8247, -1464772424));
						int i_42_ = Class507.aClass422_5938.anInt4319 * 1908091451;
						if (i_42_ == -1)
							break;
						class401_sub1.anInt8248 = i_42_ * -683396961;
						Class507.anInt5931 += -1854451239;
						Class507.aClass422_5938 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lo.r(").append(')').toString());
		}
	}
}
