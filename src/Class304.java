/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Iterator;

public class Class304 {
	int anInt3065;
	OutgoingPacketManager aClass310_3066;
	int[] anIntArray3067;
	Class389 aClass389_3068;
	Class274_Sub1 aClass274_Sub1_3069;
	Class274_Sub1 aClass274_Sub1_3070;
	Class381 aClass381_3071 = new Class381();
	Class381 aClass381_3072 = new Class381();
	int anInt3073;
	int anInt3074;
	int[] anIntArray3075;
	int anInt3076;
	Class134 aClass134_3077;
	int anInt3078;
	Class281 aClass281_3079;
	int anInt3080;
	Class463 aClass463_3081;
	Class330_Sub36_Sub12 aClass330_Sub36_Sub12_3082;
	OutgoingPacketManager aClass310_3083;
	Class312 aClass312_3084 = new Class312(0, 0, 0, 0);
	float aFloat3085;
	int[][][] anIntArrayArrayArray3086;
	Class307[] aClass307Array3087 = new Class307[4];
	int[][] anIntArrayArray3088;
	int[][] anIntArrayArray3089;
	byte[][][] aByteArrayArrayArray3090;
	Class270 aClass270_3091;
	byte[][] aByteArrayArray3092;
	int anInt3093;
	Class351 aClass351_3094;
	int anInt3095;
	byte[][] aByteArrayArray3096;
	int[] anIntArray3097;
	public boolean aBoolean3098;
	int[] anIntArray3099;
	Class356 aClass356_3100;
	int[] anIntArray3101;
	int[][] anIntArrayArray3102;
	boolean aBoolean3103;
	byte[][] aByteArrayArray3104;
	byte[][] aByteArrayArray3105;
	byte[][] aByteArrayArray3106;
	int[] anIntArray3107;
	int anInt3108;
	public long aLong3109;
	int anInt3110 = 0;

	public OutgoingPacketManager method2985(int i) {
		try {
			return aClass310_3066;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.r(").append(')').toString());
		}
	}

	public Class270 method2986(byte i) {
		try {
			return aClass270_3091;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.j(").append(')').toString());
		}
	}

	public int method2987(int i) {
		try {
			return 100 - (-670654436 * anInt3110 / (-2001416157 * anInt3093));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.i(").append(')').toString());
		}
	}

	public int method2988(int i) {
		try {
			return 100 - (anInt3078 * 750501540 / (108475103 * anInt3095));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.p(").append(')').toString());
		}
	}

	public float method2989(int i) {
		try {
			return aFloat3085;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.n(").append(')').toString());
		}
	}

	public int method2990(int i) {
		try {
			return 154004499 * anInt3108;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.s(").append(')').toString());
		}
	}

	void sendMapRegion(Class330_Sub46_Sub2 class330_sub46_sub2, int i) {
		try {
			int mapSize = class330_sub46_sub2.readUnsignedByte(1366694690);
			int chunkY = class330_sub46_sub2.readUnsignedShort(1218738432);
			boolean forceRefresh = class330_sub46_sub2.readUnsignedByteS(-400233324) == 1;
			int chunkX = class330_sub46_sub2.readUnsignedLEShortA(503411274);
			if (!aBoolean3103)
				method3013(-421274603);
			method3012(Class103.method1230(mapSize, 1984950980), -2073494742);
			int i_3_ = ((class330_sub46_sub2.payload.length - class330_sub46_sub2.offset * -824785231) / 16);
			anIntArrayArray3102 = new int[i_3_][4];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				for (int i_5_ = 0; i_5_ < 4; i_5_++) {
					anIntArrayArray3102[i_4_][i_5_] = class330_sub46_sub2.readInt((byte) 95);
				}
			}
			anIntArray3067 = new int[i_3_];
			anIntArray3097 = new int[i_3_];
			anIntArray3075 = new int[i_3_];
			anIntArray3099 = null;
			aByteArrayArray3096 = new byte[i_3_][];
			aByteArrayArray3104 = new byte[i_3_][];
			aByteArrayArray3105 = null;
			anIntArray3107 = new int[i_3_];
			anIntArray3101 = new int[i_3_];
			aByteArrayArray3106 = new byte[i_3_][];
			aByteArrayArray3092 = new byte[i_3_][];
			i_3_ = 0;
			for (int i_6_ = (chunkX - (154004499 * anInt3108 >> 4)) / 8; i_6_ <= (chunkX + (anInt3108 * 154004499 >> 4)) / 8; i_6_++) {
				for (int i_7_ = (chunkY - (-1676046053 * anInt3076 >> 4)) / 8; i_7_ <= (chunkY + (anInt3076 * -1676046053 >> 4)) / 8; i_7_++) {
					anIntArray3067[i_3_] = i_7_ + (i_6_ << 8);
					anIntArray3097[i_3_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, false, i_6_, i_7_, (byte) 4), 323600977));
					anIntArray3075[i_3_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, false, i_6_, i_7_, (byte) 4), 323600977));
					anIntArray3107[i_3_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, true, i_6_, i_7_, (byte) 4), 323600977));
					anIntArray3101[i_3_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, true, i_6_, i_7_, (byte) 4), 323600977));
					i_3_++;
				}
			}
			method3014(chunkX, chunkY, 16, forceRefresh, (byte) 61);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.as(").append(')').toString());
		}
	}

	public int method2992(int i) {
		try {
			return -1024511583 * anInt3080;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.l(").append(')').toString());
		}
	}

	public int method2993(int i) {
		try {
			return anInt3065 * -9462737;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.b(").append(')').toString());
		}
	}

	public byte[][] method2994(int i, int i_8_) {
		try {
			if (aClass274_Sub1_3070 != null && (aClass274_Sub1_3070.aByteArrayArrayArray2824) != null && (aClass274_Sub1_3070.aByteArrayArrayArray2824[i]) != null)
				return (aClass274_Sub1_3070.aByteArrayArrayArray2824[i]);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.q(").append(')').toString());
		}
	}

	public Class281 method2995(int i) {
		try {
			return aClass281_3079;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.u(").append(')').toString());
		}
	}

	public Class307 method2996(int i, int i_9_) {
		try {
			return aClass307Array3087[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.x(").append(')').toString());
		}
	}

	public int[][] method2997(byte i) {
		try {
			return anIntArrayArray3088;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.c(").append(')').toString());
		}
	}

	public int[][] method2998(int i) {
		try {
			return anIntArrayArray3089;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.a(").append(')').toString());
		}
	}

	public byte[][][] method2999(int i) {
		try {
			return aByteArrayArrayArray3090;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.e(").append(')').toString());
		}
	}

	public void method3000(byte[][][] is, int i) {
		try {
			aByteArrayArrayArray3090 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.m(").append(')').toString());
		}
	}

	public Class274_Sub1 method3001(byte i) {
		try {
			return aClass274_Sub1_3070;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.t(").append(')').toString());
		}
	}

	public void method3002(Class463 class463, int i) {
		try {
			aClass463_3081 = class463;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.h(").append(')').toString());
		}
	}

	public void method3003(int i) {
		try {
			if (aClass356_3100 != null) {
				Class110.method1357((byte) 18);
				aClass356_3100.aClass338_3697.method3959((byte) 0);
				aClass356_3100 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.v(").append(')').toString());
		}
	}

	public void method3004(byte i) {
		try {
			aClass270_3091 = Class270.aClass270_2751;
			anInt3110 = 0;
			anInt3093 = 1601331083;
			anInt3078 = 0;
			anInt3095 = -786888417;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ay(").append(')').toString());
		}
	}

	public void method3005(int i) {
		try {
			aClass389_3068 = new Class389(Class361.aClass_ra3793, anInt3108 * 154004499 >> 3, -1676046053 * anInt3076 >> 3);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ac(").append(')').toString());
		}
	}

	public void method3006(int i) {
		try {
			anInt3080 = 1197300680;
			anInt3065 = (int) (34.46 * (double) (anInt3108 * 154004499)) * 1873750735;
			anInt3065 = (anInt3065 * -9462737 << 2) * 1873750735;
			if (Class361.aClass_ra3793.at())
				anInt3065 += 1582669312;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.al(").append(')').toString());
		}
	}

	void method3007(Class304 class304_10_, byte i) {
		try {
			boolean bool = ((Class304) class304_10_).aBoolean3103;
			((Class304) class304_10_).aBoolean3103 = aBoolean3103;
			aBoolean3103 = bool;
			OutgoingPacketManager class310 = ((Class304) class304_10_).aClass310_3083;
			((Class304) class304_10_).aClass310_3083 = aClass310_3083;
			aClass310_3083 = class310;
			((Class304) class304_10_).aClass381_3072 = aClass381_3071;
			aClass381_3072 = ((Class304) class304_10_).aClass381_3071;
			aClass389_3068.method4588(class304_10_.method3008(851431066), 1874433724);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.at(").append(')').toString());
		}
	}

	public Class389 method3008(int i) {
		try {
			return aClass389_3068;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.g(").append(')').toString());
		}
	}

	void method3009(int i) {
		try {
			method3012(Class103.method1230(Class448.aClass330_Sub50_5555.aClass464_Sub18_7877.method5801((byte) 7), 1955702852), 233923902);
			int i_11_ = -1261027839 * aClass381_3071.gameSceneBaseX;
			int i_12_ = aClass381_3071.gameSceneBaseY * -1542584207;
			int i_13_ = (-1795110955 * Class471.anInt5612 >> 12) + (i_11_ >> 3);
			int i_14_ = (i_12_ >> 3) + (Class325_Sub3.anInt7484 * 1947030235 >> 12);
			Class263_Sub2.myPlayer.aByte8658 = (byte) 0;
			Class85.anInt712 = 0;
			Class263_Sub2.myPlayer.method5463(8, 8, (short) 1007);
			int i_15_ = 18;
			anIntArrayArray3102 = new int[i_15_][4];
			anIntArray3067 = new int[i_15_];
			anIntArray3097 = new int[i_15_];
			anIntArray3075 = new int[i_15_];
			anIntArray3099 = new int[i_15_];
			aByteArrayArray3096 = new byte[i_15_][];
			aByteArrayArray3104 = new byte[i_15_][];
			aByteArrayArray3105 = new byte[i_15_][];
			anIntArray3107 = new int[i_15_];
			anIntArray3101 = new int[i_15_];
			aByteArrayArray3106 = new byte[i_15_][];
			aByteArrayArray3092 = new byte[i_15_][];
			i_15_ = 0;
			for (int i_16_ = (i_13_ - (154004499 * anInt3108 >> 4)) / 8; i_16_ <= ((anInt3108 * 154004499 >> 4) + i_13_) / 8; i_16_++) {
				for (int i_17_ = (i_14_ - (-1676046053 * anInt3076 >> 4)) / 8; (i_17_ <= (i_14_ + (anInt3076 * -1676046053 >> 4)) / 8); i_17_++) {
					int i_18_ = i_17_ + (i_16_ << 8);
					anIntArray3067[i_15_] = i_18_;
					anIntArray3097[i_15_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, false, i_16_, i_17_, (byte) 4), 323600977));
					anIntArray3075[i_15_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, false, i_16_, i_17_, (byte) 4), 323600977));
					anIntArray3099[i_15_] = ItemDefinitions.aClass280_6752.method2754(new StringBuilder().append("n").append(i_16_).append('_').append(i_17_).toString(), 323600977);
					anIntArray3107[i_15_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, true, i_16_, i_17_, (byte) 4), 323600977));
					anIntArray3101[i_15_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, true, i_16_, i_17_, (byte) 4), 323600977));
					if (anIntArray3099[i_15_] == -1) {
						anIntArray3097[i_15_] = -1;
						anIntArray3075[i_15_] = -1;
						anIntArray3107[i_15_] = -1;
						anIntArray3101[i_15_] = -1;
					}
					i_15_++;
				}
			}
			for (int i_19_ = i_15_; i_19_ < anIntArray3099.length; i_19_++) {
				anIntArray3099[i_19_] = -1;
				anIntArray3097[i_19_] = -1;
				anIntArray3075[i_19_] = -1;
				anIntArray3107[i_19_] = -1;
				anIntArray3101[i_19_] = -1;
			}
			int i_20_;
			if (-296919301 * client.anInt8995 == 6)
				i_20_ = 5;
			else if (11 == client.anInt8995 * -296919301)
				i_20_ = 7;
			else if (-296919301 * client.anInt8995 == 15)
				i_20_ = 19;
			else if (-296919301 * client.anInt8995 == 14)
				i_20_ = 17;
			else
				throw new RuntimeException(new StringBuilder().append("").append(client.anInt8995 * -296919301).toString());
			method3014(i_13_, i_14_, i_20_, false, (byte) -32);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ai(").append(')').toString());
		}
	}

	void method3010(Class330_Sub46_Sub2 buffer, int i) {
		try {
			int loadType = buffer.readUnsignedByteC(-243015761);
			if (loadType == 1)
				aClass310_3066 = OutgoingPacketManager.aClass310_3209;
			else if (loadType == 2)
				aClass310_3066 = OutgoingPacketManager.aClass310_3214;
			else if (3 == loadType)
				aClass310_3066 = OutgoingPacketManager.aClass310_3211;
			else if (4 == loadType)
				aClass310_3066 = OutgoingPacketManager.aClass310_3208;
			int chunkY = buffer.readUnsignedLEShortA(623241511);
			int forceRefreshMask = buffer.readUnsignedByteS(-400233324);
			boolean forceRefresh = (forceRefreshMask & 0x1) != 0;
			int mapSize = buffer.readUnsignedByte(578584919);
			int chunkX = buffer.readUnsignedShortA((byte) -17);
			if (!aBoolean3103)
				method3013(-421274603);
			method3012(Class103.method1230(mapSize, 1893328996), 228549929);
			buffer.method3820(894025231);
			for (int i_26_ = 0; i_26_ < 4; i_26_++) {
				for (int i_27_ = 0; i_27_ < anInt3108 * 154004499 >> 3; i_27_++) {
					for (int i_28_ = 0; (i_28_ < anInt3076 * -1676046053 >> 3); i_28_++) {
						int i_29_ = buffer.readBits(1);
						if (i_29_ == 1)
							anIntArrayArrayArray3086[i_26_][i_27_][i_28_] = buffer.readBits(26);
						else
							anIntArrayArrayArray3086[i_26_][i_27_][i_28_] = -1;
					}
				}
			}
			buffer.method3824(742824106);
			int i_30_ = ((buffer.payload.length - -824785231 * buffer.offset) / 16);
			anIntArrayArray3102 = new int[i_30_][4];
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
				for (int i_32_ = 0; i_32_ < 4; i_32_++)
					anIntArrayArray3102[i_31_][i_32_] = buffer.readInt((byte) 60);
			}
			anIntArray3067 = new int[i_30_];
			anIntArray3097 = new int[i_30_];
			anIntArray3075 = new int[i_30_];
			anIntArray3099 = null;
			aByteArrayArray3096 = new byte[i_30_][];
			aByteArrayArray3104 = new byte[i_30_][];
			aByteArrayArray3105 = null;
			anIntArray3107 = new int[i_30_];
			anIntArray3101 = new int[i_30_];
			aByteArrayArray3106 = new byte[i_30_][];
			aByteArrayArray3092 = new byte[i_30_][];
			i_30_ = 0;
			for (int i_33_ = 0; i_33_ < 4; i_33_++) {
				for (int i_34_ = 0; i_34_ < 154004499 * anInt3108 >> 3; i_34_++) {
					for (int i_35_ = 0; (i_35_ < -1676046053 * anInt3076 >> 3); i_35_++) {
						int i_36_ = (anIntArrayArrayArray3086[i_33_][i_34_][i_35_]);
						if (i_36_ != -1) {
							int i_37_ = i_36_ >> 14 & 0x3ff;
							int i_38_ = i_36_ >> 3 & 0x7ff;
							int i_39_ = i_38_ / 8 + (i_37_ / 8 << 8);
							for (int i_40_ = 0; i_40_ < i_30_; i_40_++) {
								if (i_39_ == (anIntArray3067[i_40_])) {
									i_39_ = -1;
									break;
								}
							}
							if (-1 != i_39_) {
								anIntArray3067[i_30_] = i_39_;
								int i_41_ = i_39_ >> 8 & 0xff;
								int i_42_ = i_39_ & 0xff;
								anIntArray3097[i_30_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, false, i_41_, i_42_, (byte) 4), 323600977));
								anIntArray3075[i_30_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, false, i_41_, i_42_, (byte) 4), 323600977));
								anIntArray3107[i_30_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, true, i_41_, i_42_, (byte) 4), 323600977));
								anIntArray3101[i_30_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, true, i_41_, i_42_, (byte) 4), 323600977));
								i_30_++;
							}
						}
					}
				}
			}
			method3014(chunkX, chunkY, 16, forceRefresh, (byte) 5);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.aj(").append(')').toString());
		}
	}

	public Class304(boolean bool) {
		anInt3093 = 1601331083;
		anInt3078 = 0;
		anInt3095 = -786888417;
		aBoolean3098 = false;
		aBoolean3103 = bool;
	}

	void method3011(Class274_Sub1 class274_sub1, byte[][] is, int i) {
		try {
			for (int i_43_ = 0; i_43_ < class274_sub1.anInt2774 * -392146777; i_43_++) {
				if (!aBoolean3103)
					Class233.method2362((byte) 24);
				for (int i_44_ = 0; i_44_ < anInt3108 * 154004499 >> 3; i_44_++) {
					for (int i_45_ = 0; (i_45_ < anInt3076 * -1676046053 >> 3); i_45_++) {
						int i_46_ = (anIntArrayArrayArray3086[i_43_][i_44_][i_45_]);
						if (-1 != i_46_) {
							int i_47_ = i_46_ >> 24 & 0x3;
							if (!class274_sub1.aBoolean2777 || 0 == i_47_) {
								int i_48_ = i_46_ >> 1 & 0x3;
								int i_49_ = i_46_ >> 14 & 0x3ff;
								int i_50_ = i_46_ >> 3 & 0x7ff;
								int i_51_ = i_50_ / 8 + (i_49_ / 8 << 8);
								for (int i_52_ = 0; i_52_ < (((Class304) this).anIntArray3067).length; i_52_++) {
									if (i_51_ == (((Class304) this).anIntArray3067[i_52_]) && null != is[i_52_]) {
										class274_sub1.method2712(Class361.aClass_ra3793, is[i_52_], i_43_, i_44_ * 8, 8 * i_45_, i_47_, (i_49_ & 0x7) * 8, 8 * (i_50_ & 0x7), i_48_, (((Class304) this).aClass307Array3087), -295315817);
										break;
									}
								}
							}
						}
						if (aBoolean3103)
							method3018(5, -824780886);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ar(").append(')').toString());
		}
	}

	void method3012(Class134 class134, int i) {
		try {
			if (class134 != aClass134_3077) {
				anInt3108 = (anInt3076 = -510762003 * class134.anInt1511) * -1652140071;
				anIntArrayArrayArray3086 = (new int[4][154004499 * anInt3108 >> 3][-1676046053 * anInt3076 >> 3]);
				anIntArrayArray3088 = (new int[154004499 * anInt3108][anInt3076 * -1676046053]);
				anIntArrayArray3089 = (new int[anInt3108 * 154004499][-1676046053 * anInt3076]);
				for (int i_53_ = 0; i_53_ < 4; i_53_++)
					aClass307Array3087[i_53_] = Class123.method1505((154004499 * anInt3108), (-1676046053 * anInt3076), 1219541411);
				aByteArrayArrayArray3090 = (new byte[4][154004499 * anInt3108][-1676046053 * anInt3076]);
				aClass281_3079 = new Class281(4, 154004499 * anInt3108, anInt3076 * -1676046053);
				method3005(1944727347);
				aClass134_3077 = class134;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.an(").append(')').toString());
		}
	}

	void method3013(int i) {
		try {
			if (OutgoingPacketManager.aClass310_3212 != aClass310_3066 && (OutgoingPacketManager.aClass310_3212 != aClass310_3083)) {
				if (aClass310_3066 == OutgoingPacketManager.aClass310_3209 || (aClass310_3066 == OutgoingPacketManager.aClass310_3211) || ((aClass310_3066 != aClass310_3083) && ((aClass310_3066 == OutgoingPacketManager.aClass310_3210) || (OutgoingPacketManager.aClass310_3210 == aClass310_3083)))) {
					client.anInt9017 = 0;
					client.anInt9232 = 0;
					client.aClass497_9014.method6100(65280);
				}
				aClass310_3083 = aClass310_3066;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.af(").append(')').toString());
		}
	}

	void method3014(int i, int i_54_, int i_55_, boolean bool, byte i_56_) {
		try {
			if (1909266069 * client.anInt8987 == 1) {
				if (aBoolean3103)
					throw new IllegalStateException();
				client.anInt8987 = 244844922;
				client.anInt9265 = -608204173;
			}
			if (bool || i != anInt3073 * 1686716041 || anInt3074 * 579246643 != i_54_) {
				anInt3073 = -373844039 * i;
				anInt3074 = i_54_ * 1001255163;
				if (!aBoolean3103) {
					Class227.method2311(i_55_, -1188873169);
					Class95_Sub22.method1175(Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -468374783);
				}
				if (aClass381_3071 != null)
					aClass381_3072 = aClass381_3071;
				else
					aClass381_3072 = new Class381(0, 0, 0);
				aClass381_3071 = (new Class381(0, 8 * (1686716041 * anInt3073 - (154004499 * anInt3108 >> 4)), 8 * (579246643 * anInt3074 - (-1676046053 * anInt3076 >> 4))));
				aClass330_Sub36_Sub12_3082 = Class354.method4100((aClass381_3071.gameSceneBaseX) * -1261027839, -1542584207 * (((Class304) this).aClass381_3071.gameSceneBaseY));
				aClass351_3094 = null;
				if (!aBoolean3103)
					method3015(i_55_, 1581007294);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.aq(").append(')').toString());
		}
	}

	void method3015(int i, int i_57_) {
		try {
			int i_58_ = (aClass381_3071.gameSceneBaseX * -1261027839 - -1261027839 * aClass381_3072.gameSceneBaseX);
			int i_59_ = (aClass381_3071.gameSceneBaseY * -1542584207 - -1542584207 * aClass381_3072.gameSceneBaseY);
			if (16 == i) {
				for (int i_60_ = 0; i_60_ < client.anInt9232 * -1183709625; i_60_++) {
					Class330_Sub35 class330_sub35 = client.aClass330_Sub35Array9015[i_60_];
					if (null != class330_sub35) {
						NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
						for (int i_61_ = 0; i_61_ < (class432_sub1_sub1_sub1_sub2.anIntArray10018).length; i_61_++) {
							class432_sub1_sub1_sub1_sub2.anIntArray10018[i_61_] -= i_58_;
							class432_sub1_sub1_sub1_sub2.anIntArray10059[i_61_] -= i_59_;
						}
						Class260 class260 = Class260.method2549(class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
						class260.aFloat2716 -= (float) (i_58_ * 512);
						class260.aFloat2711 -= (float) (512 * i_59_);
						class432_sub1_sub1_sub1_sub2.method5349(class260);
						class260.method2550();
					}
				}
			} else {
				boolean bool = false;
				client.anInt9017 = 0;
				int i_62_ = 1540892160 * anInt3108 - 512;
				int i_63_ = anInt3076 * 857880064 - 512;
				for (int i_64_ = 0; i_64_ < client.anInt9232 * -1183709625; i_64_++) {
					Class330_Sub35 class330_sub35 = client.aClass330_Sub35Array9015[i_64_];
					if (class330_sub35 != null) {
						NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
						Class260 class260 = Class260.method2549(class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
						class260.aFloat2716 -= (float) (512 * i_58_);
						class260.aFloat2711 -= (float) (i_59_ * 512);
						class432_sub1_sub1_sub1_sub2.method5349(class260);
						if ((int) class260.aFloat2716 < 0 || (int) class260.aFloat2716 > i_62_ || (int) class260.aFloat2711 < 0 || (int) class260.aFloat2711 > i_63_) {
							class432_sub1_sub1_sub1_sub2.method5475(null, 1918950667);
							class330_sub35.method3252(1117404046);
							bool = true;
						} else {
							boolean bool_65_ = true;
							for (int i_66_ = 0; i_66_ < (class432_sub1_sub1_sub1_sub2.anIntArray10018).length; i_66_++) {
								class432_sub1_sub1_sub1_sub2.anIntArray10018[i_66_] -= i_58_;
								class432_sub1_sub1_sub1_sub2.anIntArray10059[i_66_] -= i_59_;
								if ((class432_sub1_sub1_sub1_sub2.anIntArray10018[i_66_]) < 0 || ((class432_sub1_sub1_sub1_sub2.anIntArray10018[i_66_]) >= (anInt3108 * 154004499)) || (class432_sub1_sub1_sub1_sub2.anIntArray10059[i_66_]) < 0 || ((class432_sub1_sub1_sub1_sub2.anIntArray10059[i_66_]) >= (anInt3076 * -1676046053)))
									bool_65_ = false;
							}
							if (bool_65_)
								client.anIntArray9018[((client.anInt9017 += -948929865) * -823688441) - 1] = (-1654044763 * (class432_sub1_sub1_sub1_sub2.anInt10008));
							else {
								class432_sub1_sub1_sub1_sub2.method5475(null, 1918950667);
								class330_sub35.method3252(-359845100);
								bool = true;
							}
						}
						class260.method2550();
					}
				}
				if (bool) {
					client.anInt9232 = (client.aClass497_9014.method6096(-36658531) * 93438839);
					int i_67_ = 0;
					Iterator iterator = client.aClass497_9014.iterator();
					while (iterator.hasNext()) {
						Class330_Sub35 class330_sub35 = (Class330_Sub35) iterator.next();
						client.aClass330_Sub35Array9015[i_67_++] = class330_sub35;
					}
				}
			}
			for (int i_68_ = 0; i_68_ < 2048; i_68_++) {
				Player class432_sub1_sub1_sub1_sub1 = client.players[i_68_];
				if (null != class432_sub1_sub1_sub1_sub1) {
					for (int i_69_ = 0; i_69_ < (class432_sub1_sub1_sub1_sub1.anIntArray10018).length; i_69_++) {
						class432_sub1_sub1_sub1_sub1.anIntArray10018[i_69_] -= i_58_;
						class432_sub1_sub1_sub1_sub1.anIntArray10059[i_69_] -= i_59_;
					}
					Class260 class260 = Class260.method2549(class432_sub1_sub1_sub1_sub1.method5346().aClass260_2606);
					class260.aFloat2716 -= (float) (512 * i_58_);
					class260.aFloat2711 -= (float) (512 * i_59_);
					class432_sub1_sub1_sub1_sub1.method5349(class260);
					class260.method2550();
				}
			}
			Class3[] class3s = client.aClass3Array8986;
			for (int i_70_ = 0; i_70_ < class3s.length; i_70_++) {
				Class3 class3 = class3s[i_70_];
				if (class3 != null) {
					class3.anInt51 -= i_58_ * -2076874240;
					class3.anInt50 -= i_59_ * -445165056;
				}
			}
			for (Class330_Sub10 class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854)); class330_sub10 != null; class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -76)) {
				class330_sub10.anInt7582 -= i_58_ * 1369794171;
				class330_sub10.anInt7577 -= i_59_ * -275578269;
				if (aClass310_3066 != OutgoingPacketManager.aClass310_3208 && (-533165901 * class330_sub10.anInt7582 < 0 || 2127793995 * class330_sub10.anInt7577 < 0 || (class330_sub10.anInt7582 * -533165901 >= anInt3108 * 154004499) || (class330_sub10.anInt7577 * 2127793995 >= anInt3076 * -1676046053)))
					class330_sub10.method3252(141600088);
			}
			for (Class330_Sub10 class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854)); class330_sub10 != null; class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -94)) {
				class330_sub10.anInt7582 -= i_58_ * 1369794171;
				class330_sub10.anInt7577 -= -275578269 * i_59_;
				if (aClass310_3066 != OutgoingPacketManager.aClass310_3208 && (class330_sub10.anInt7582 * -533165901 < 0 || 2127793995 * class330_sub10.anInt7577 < 0 || (-533165901 * class330_sub10.anInt7582 >= 154004499 * anInt3108) || (class330_sub10.anInt7577 * 2127793995 >= -1676046053 * anInt3076)))
					class330_sub10.method3252(-1462156832);
			}
			for (Class330_Sub9 class330_sub9 = ((Class330_Sub9) client.aClass497_9138.method6099((byte) -13)); class330_sub9 != null; class330_sub9 = ((Class330_Sub9) client.aClass497_9138.method6098((short) -32768))) {
				int i_71_ = (int) ((-6154793640677333111L * class330_sub9.aLong3341 >> 28) & 0x3L);
				int i_72_ = (int) (-6154793640677333111L * class330_sub9.aLong3341 & 0x3fffL);
				int i_73_ = i_72_ - -1261027839 * (((Class304) this).aClass381_3071.gameSceneBaseX);
				int i_74_ = (int) ((class330_sub9.aLong3341 * -6154793640677333111L >> 14) & 0x3fffL);
				int i_75_ = i_74_ - -1542584207 * (((Class304) this).aClass381_3071.gameSceneBaseY);
				if (aClass356_3100 != null) {
					if (i_73_ < 0 || i_75_ < 0 || i_73_ >= anInt3108 * 154004499 || i_75_ >= -1676046053 * anInt3076 || i_73_ >= -265955713 * (((Class304) this).aClass356_3100.anInt3667) || i_75_ >= 95955317 * (((Class304) this).aClass356_3100.anInt3654)) {
						if (OutgoingPacketManager.aClass310_3208 != aClass310_3066)
							class330_sub9.method3252(-1716082395);
					} else if ((aClass356_3100.aClass340ArrayArrayArray3653) != null)
						aClass356_3100.method4151(i_71_, i_73_, i_75_, -1355719328);
				}
			}
			if (Class9.anInt146 * 552157293 != 0) {
				Class9.anInt146 -= i_58_ * 192203109;
				Class9.anInt151 -= i_59_ * 527198423;
			}
			Class562.method6472((byte) 0);
			Class481.method6020(false, 1031914129);
			if (16 == i) {
				client.anInt9068 -= -681765376 * i_58_;
				client.anInt9069 -= -1987711488 * i_59_;
				IndexTable.anInt2906 -= 568336896 * i_58_;
				Class308.anInt3194 -= i_59_ * -212391424;
				if (5 != Class147.anInt1621 * -1551406343) {
					Class147.anInt1621 = -780346076;
					Class439.anInt4456 = 1180637393;
					Class457.anInt6844 = 1651776935;
				}
			} else {
				Class204_Sub1.anInt8947 -= i_58_ * 802944399;
				Class151.anInt6671 -= i_59_ * -952384087;
				Class150_Sub2.anInt7270 -= -1823532171 * i_58_;
				Class330_Sub39.anInt7766 -= 1859428019 * i_59_;
				Class471.anInt5612 -= 1081276928 * i_58_;
				Class325_Sub3.anInt7484 -= 1085449728 * i_59_;
				if (Math.abs(i_58_) > 154004499 * anInt3108 || (Math.abs(i_59_) > -1676046053 * anInt3076))
					aClass389_3068.method4582(-426326148);
			}
			Class330_Sub14.method3319((byte) 0);
			Class_ta.method5674((byte) 1);
			client.aClass497_9216.method6100(65280);
			client.aClass471_9139.method5866(613065745);
			client.aClass467_9061.method5851(65536);
			Class491.method6075(-1676046053);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.aa(").append(')').toString());
		}
	}

	void method3016(int i) {
		try {
			aClass274_Sub1_3069 = null;
			aClass274_Sub1_3070 = null;
			for (int i_76_ = 0; i_76_ < 4; i_76_++) {
				if (aClass307Array3087[i_76_] != null)
					aClass307Array3087[i_76_].method3067(1980764775);
			}
			if (null != aClass281_3079)
				aClass281_3079.method2785((byte) 0);
			if (null != aClass389_3068)
				aClass389_3068.method4591(-2057764547);
			if (null != aClass356_3100) {
				aClass356_3100.aClass338_3697.method3959((byte) 0);
				aClass356_3100 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ab(").append(')').toString());
		}
	}

	public boolean method3017(int i) {
		try {
			if (!aBoolean3103)
				Class475.method5944(false, -1503225972);
			anInt3110 = 0;
			for (int i_77_ = 0; i_77_ < aByteArrayArray3096.length; i_77_++) {
				if (anIntArray3097[i_77_] != -1 && null == aByteArrayArray3096[i_77_]) {
					aByteArrayArray3096[i_77_] = ItemDefinitions.aClass280_6752.getFile((((Class304) this).anIntArray3097[i_77_]), 0);
					if (aByteArrayArray3096[i_77_] == null)
						anInt3110 += 1704971999;
				}
				if (-1 != anIntArray3075[i_77_] && null == aByteArrayArray3104[i_77_]) {
					aByteArrayArray3104[i_77_] = (ItemDefinitions.aClass280_6752.method2756(anIntArray3075[i_77_], 0, anIntArrayArray3102[i_77_], -1666669322));
					if (aByteArrayArray3104[i_77_] == null)
						anInt3110 += 1704971999;
				}
				if (-1 != anIntArray3107[i_77_] && null == aByteArrayArray3106[i_77_]) {
					aByteArrayArray3106[i_77_] = ItemDefinitions.aClass280_6752.getFile((((Class304) this).anIntArray3107[i_77_]), 0);
					if (aByteArrayArray3106[i_77_] == null)
						anInt3110 += 1704971999;
				}
				if (-1 != anIntArray3101[i_77_] && null == aByteArrayArray3092[i_77_]) {
					aByteArrayArray3092[i_77_] = ItemDefinitions.aClass280_6752.getFile((((Class304) this).anIntArray3101[i_77_]), 0);
					if (null == aByteArrayArray3092[i_77_])
						anInt3110 += 1704971999;
				}
				if (anIntArray3099 != null && null == aByteArrayArray3105[i_77_] && anIntArray3099[i_77_] != -1) {
					aByteArrayArray3105[i_77_] = (ItemDefinitions.aClass280_6752.method2756(anIntArray3099[i_77_], 0, anIntArrayArray3102[i_77_], 1046571839));
					if (aByteArrayArray3105[i_77_] == null)
						anInt3110 += 1704971999;
				}
			}
			if (null == aClass351_3094) {
				if (aClass330_Sub36_Sub12_3082 != null && (Class434.aClass280_6560.method2769(new StringBuilder().append(aClass330_Sub36_Sub12_3082.mapLocation).append("_staticelements").toString(), -1423601887))) {
					if (!Class434.aClass280_6560.method2773(new StringBuilder().append(aClass330_Sub36_Sub12_3082.mapLocation).append("_staticelements").toString(), 1375995397))
						anInt3110 += 1704971999;
					else
						aClass351_3094 = (Class434.method5563(Class434.aClass280_6560, new StringBuilder().append(((Class304) this).aClass330_Sub36_Sub12_3082.mapLocation).append("_staticelements").toString(), client.aBoolean9123, (byte) 0));
				} else
					aClass351_3094 = new Class351(0);
			}
			if (-393253601 * anInt3110 > 0) {
				if (anInt3093 * -2001416157 < -393253601 * anInt3110)
					anInt3093 = -1741897515 * anInt3110;
				aClass270_3091 = Class270.aClass270_2749;
				return false;
			}
			anInt3078 = 0;
			for (int i_78_ = 0; i_78_ < aByteArrayArray3096.length; i_78_++) {
				byte[] is = aByteArrayArray3104[i_78_];
				if (is != null) {
					int i_79_ = ((anIntArray3067[i_78_] >> 8) * 64 - (-1261027839 * aClass381_3071.gameSceneBaseX));
					int i_80_ = ((anIntArray3067[i_78_] & 0xff) * 64 - -1542584207 * (((Class304) this).aClass381_3071.gameSceneBaseY));
					if (aClass310_3066.method3098((byte) 101)) {
						i_79_ = 10;
						i_80_ = 10;
					}
					int i_81_ = Class144.method1670(aClass463_3081, is, i_79_, i_80_, (anInt3108 * 154004499), (anInt3076 * -1676046053), (byte) 23);
					if (i_81_ > 0)
						anInt3078 += i_81_ * 810717937;
				}
				is = aByteArrayArray3092[i_78_];
				if (null != is) {
					int i_82_ = ((anIntArray3067[i_78_] >> 8) * 64 - (-1261027839 * aClass381_3071.gameSceneBaseX));
					int i_83_ = ((anIntArray3067[i_78_] & 0xff) * 64 - -1542584207 * (((Class304) this).aClass381_3071.gameSceneBaseY));
					if (aClass310_3066.method3098((byte) 60)) {
						i_82_ = 10;
						i_83_ = 10;
					}
					int i_84_ = Class144.method1670(aClass463_3081, is, i_82_, i_83_, (anInt3108 * 154004499), (anInt3076 * -1676046053), (byte) 57);
					if (i_84_ > 0)
						anInt3078 += 810717937 * i_84_;
				}
			}
			if (anInt3078 * -636740079 > 0) {
				if (anInt3095 * 108475103 < anInt3078 * -636740079)
					anInt3095 = anInt3078 * -1523630833;
				aClass270_3091 = Class270.aClass270_2750;
				return false;
			}
			if (!aBoolean3103 && aClass270_3091 != Class270.aClass270_2751)
				Class95_Sub22.method1175(new StringBuilder().append(Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434)).append(Class215.aString2084).append("(100%)").toString(), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, 20991783);
			aClass270_3091 = Class270.aClass270_2752;
			if (!aBoolean3103)
				Class233.method2362((byte) 108);
			if (!aBoolean3103) {
				for (int i_85_ = 0; i_85_ < 2048; i_85_++) {
					Player class432_sub1_sub1_sub1_sub1 = client.players[i_85_];
					if (class432_sub1_sub1_sub1_sub1 != null)
						class432_sub1_sub1_sub1_sub1.aClass356_8655 = null;
				}
				for (int i_86_ = 0; i_86_ < client.aClass330_Sub35Array9015.length; i_86_++) {
					Class330_Sub35 class330_sub35 = client.aClass330_Sub35Array9015[i_86_];
					if (null != class330_sub35)
						((Class432_Sub1) class330_sub35.anObject7733).aClass356_8655 = null;
				}
			}
			if (!aBoolean3103)
				Class50.method632(true, (byte) 58);
			if (!aBoolean3103)
				Class479.method6012((byte) 89);
			boolean bool = false;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2) {
				for (int i_87_ = 0; i_87_ < aByteArrayArray3096.length; i_87_++) {
					if (aByteArrayArray3092[i_87_] != null || (null != aByteArrayArray3106[i_87_])) {
						bool = true;
						break;
					}
				}
			}
			int i_88_ = (Class325_Sub4.method3226(Class448.aClass330_Sub50_5555.aClass464_Sub19_7876.method5804((short) 878), (byte) 1).anInt1616 * -593443016);
			if (Class361.aClass_ra3793.at())
				i_88_++;
			method3006(-54076957);
			method3016(-1009803501);
			aClass356_3100 = new Class356(Class361.aClass_ra3793, 9, 4, 154004499 * anInt3108, anInt3076 * -1676046053, i_88_, bool, Class361.aClass_ra3793.cr() > 0);
			aClass356_3100.method4134(false, (byte) 87);
			aClass356_3100.method4132(1207704965 * client.anInt8993, 590937471);
			if (client.anInt8993 * 1207704965 != 0)
				aClass356_3100.method4133(Class125.aClass263_1454, (byte) 1);
			else
				aClass356_3100.method4133(null, (byte) 1);
			aClass312_3084 = new Class312();
			aFloat3085 = -0.05F + (float) (Math.random() / 10.0);
			aClass274_Sub1_3070 = new Class274_Sub1(aClass356_3100, aClass463_3081, 4, 154004499 * anInt3108, anInt3076 * -1676046053, false, aClass281_3079, aClass389_3068);
			aClass274_Sub1_3070.method2684(-649324936);
			aClass274_Sub1_3070.anInt2769 = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(719119529) * 971722799;
			aClass274_Sub1_3070.aBoolean2778 = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2;
			aClass274_Sub1_3070.aBoolean2771 = Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1;
			aClass274_Sub1_3070.aBoolean2772 = Class448.aClass330_Sub50_5555.aClass464_Sub27_7881.method5833(16777215) == 1;
			aClass274_Sub1_3070.aBoolean2773 = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1200271171) == 1;
			if (!aClass310_3066.method3098((byte) 25))
				method3019(aClass274_Sub1_3070, aByteArrayArray3096, (byte) 1);
			else
				method3030(aClass274_Sub1_3070, aByteArrayArray3096, -2081508232);
			if (aBoolean3103)
				method3018(50, -824780886);
			aClass389_3068.method4590(anInt3108 * 154004499 >> 4, -1676046053 * anInt3076 >> 4, (byte) -26);
			aClass389_3068.method4589(this, 1937805770);
			if (bool) {
				aClass356_3100.method4134(true, (byte) 118);
				aClass274_Sub1_3069 = new Class274_Sub1(aClass356_3100, aClass463_3081, 1, (154004499 * anInt3108), (anInt3076 * -1676046053), true, aClass281_3079, aClass389_3068);
				aClass274_Sub1_3069.method2684(-649324936);
				aClass274_Sub1_3069.anInt2769 = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(934517496) * 971722799;
				aClass274_Sub1_3069.aBoolean2778 = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542) == 2;
				aClass274_Sub1_3069.aBoolean2771 = Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1;
				aClass274_Sub1_3069.aBoolean2772 = Class448.aClass330_Sub50_5555.aClass464_Sub27_7881.method5833(16777215) == 1;
				aClass274_Sub1_3069.aBoolean2773 = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1169857314) == 1;
				if (!aClass310_3066.method3098((byte) 27)) {
					method3019(aClass274_Sub1_3069, aByteArrayArray3106, (byte) 1);
					if (!aBoolean3103)
						Class475.method5944(true, -1503225972);
				} else {
					method3030(aClass274_Sub1_3069, aByteArrayArray3106, -2081508232);
					if (!aBoolean3103)
						Class475.method5944(true, -1503225972);
				}
				aClass274_Sub1_3069.method2690(0, (aClass274_Sub1_3070.anIntArrayArrayArray2793[0]), 742260464);
				aClass274_Sub1_3069.method2691(Class361.aClass_ra3793, null, null, 713445039);
				aClass356_3100.method4134(false, (byte) 24);
				if (aBoolean3103)
					method3018(50, -824780886);
			}
			aClass274_Sub1_3070.method2691(Class361.aClass_ra3793, bool ? (aClass274_Sub1_3069.anIntArrayArrayArray2793) : null, aClass307Array3087, 713445039);
			if (!aClass310_3066.method3098((byte) 70)) {
				if (!aBoolean3103)
					Class475.method5944(true, -1503225972);
				method3021(aClass274_Sub1_3070, aByteArrayArray3104, -270218177);
				if (aByteArrayArray3105 != null)
					method3020((short) -21957);
			} else {
				if (!aBoolean3103)
					Class475.method5944(true, -1503225972);
				method3011(aClass274_Sub1_3070, aByteArrayArray3104, -2036852831);
			}
			if (!aBoolean3103)
				Class475.method5944(true, -1503225972);
			aClass274_Sub1_3070.method2692(Class361.aClass_ra3793, (bool ? aClass356_3100.aClass_xaArray3658[0] : null), null, -336472512);
			if (aBoolean3103)
				method3018(75, -824780886);
			aClass274_Sub1_3070.method2710(Class361.aClass_ra3793, false, (byte) 0);
			if (aBoolean3103)
				method3018(75, -824780886);
			if (!aBoolean3103)
				Class475.method5944(true, -1503225972);
			if (bool) {
				aClass356_3100.method4134(true, (byte) 32);
				if (!aBoolean3103)
					Class475.method5944(true, -1503225972);
				if (!aClass310_3066.method3098((byte) 104))
					method3021(aClass274_Sub1_3069, aByteArrayArray3092, -621308179);
				else
					method3011(aClass274_Sub1_3069, aByteArrayArray3092, -2005371185);
				if (!aBoolean3103)
					Class475.method5944(true, -1503225972);
				aClass274_Sub1_3069.method2692(Class361.aClass_ra3793, null, aClass356_3100.aClass_xaArray3701[0], 200434880);
				aClass274_Sub1_3069.method2710(Class361.aClass_ra3793, true, (byte) 0);
				if (!aBoolean3103)
					Class475.method5944(true, -1503225972);
				aClass356_3100.method4134(false, (byte) 7);
				if (aBoolean3103)
					method3018(50, -824780886);
			}
			aClass274_Sub1_3070.method2685(411186681);
			if (null != aClass274_Sub1_3069)
				aClass274_Sub1_3069.method2685(411186681);
			aClass356_3100.method4135((byte) 5);
			if (aBoolean3103) {
				Class312.method3111((byte) 66);
				while (!Class361.aClass_ra3793.method4790((byte) -86))
					method3018(1, -824780886);
			}
			boolean bool_89_ = false;
			if (aBoolean3103) {
				Class304 class304_90_ = client.aClass304_9030;
				method3007(class304_90_, (byte) -20);
				Class43.aClass276_10073.method2722(class304_90_, 1686232468);
				bool_89_ = true;
				Class312.method3111((byte) 43);
				synchronized (client.anObject9081) {
					client.aBoolean9031 = true;
					try {
						client.anObject9081.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				client.aClass304_9030 = this;
				class304_90_.method3016(-160596144);
				method3015(16, 1972528594);
				method3013(-421274603);
			} else {
				Class233.method2362((byte) -84);
				aClass389_3068.method4583(-1560304679);
				Class376.method4367((byte) 3);
			}
			for (int i_91_ = 0; i_91_ < 4; i_91_++) {
				for (int i_92_ = 0; i_92_ < 154004499 * anInt3108; i_92_++) {
					for (int i_93_ = 0; i_93_ < -1676046053 * anInt3076; i_93_++)
						Class343.method4001(i_91_, i_92_, i_93_, -334637075);
				}
			}
			for (int i_94_ = 0; i_94_ < client.aClass327Array8999.length; i_94_++) {
				if (null != client.aClass327Array8999[i_94_])
					client.aClass327Array8999[i_94_].method3233(aClass356_3100, (byte) 0);
			}
			Class282.method2812(1470552195);
			Class305.method3048((byte) 53);
			if (Class147.method1739((byte) -48) == Class331.aClass331_3343 && client.aClass1_9025.method380(-1551151736) != null && 16 == client.anInt8995 * -296919301) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2476, client.aClass1_9025.aClass488_22, -490531725);
				class330_sub34.aClass330_Sub46_Sub2_7729.addInt(1057001181, 1965508160);
				client.aClass1_9025.method378(class330_sub34, -2127987691);
			}
			if (!aClass310_3066.method3098((byte) 52)) {
				int i_95_ = ((anInt3073 * 1686716041 - (154004499 * anInt3108 >> 4)) / 8);
				int i_96_ = ((1686716041 * anInt3073 + (anInt3108 * 154004499 >> 4)) / 8);
				int i_97_ = ((anInt3074 * 579246643 - (anInt3076 * -1676046053 >> 4)) / 8);
				int i_98_ = (((-1676046053 * anInt3076 >> 4) + anInt3074 * 579246643) / 8);
				for (int i_99_ = i_95_ - 1; i_99_ <= i_96_ + 1; i_99_++) {
					for (int i_100_ = i_97_ - 1; i_100_ <= 1 + i_98_; i_100_++) {
						if (i_99_ >= i_95_ && i_99_ <= i_96_ && i_100_ >= i_97_ && i_100_ <= i_98_) {
							if (i != 186314141) {
								/* empty */
							}
						} else {
							ItemDefinitions.aClass280_6752.method2774(method3024(true, false, i_99_, i_100_, (byte) 4), 2065037001);
							ItemDefinitions.aClass280_6752.method2774(method3024(false, false, i_99_, i_100_, (byte) 4), 2065037001);
							ItemDefinitions.aClass280_6752.method2774(method3024(true, true, i_99_, i_100_, (byte) 4), 2065037001);
							ItemDefinitions.aClass280_6752.method2774(method3024(false, true, i_99_, i_100_, (byte) 4), 2065037001);
						}
					}
				}
			}
			if (5 == client.anInt8995 * -296919301)
				Class227.method2311(6, -1188873169);
			else if (19 == -296919301 * client.anInt8995)
				Class227.method2311(15, -1188873169);
			else if (-296919301 * client.anInt8995 == 7)
				Class227.method2311(11, -1188873169);
			else if (-296919301 * client.anInt8995 == 17)
				Class227.method2311(14, -1188873169);
			else {
				Class227.method2311(1, -1188873169);
				if (client.aClass1_9025.method380(-957829122) != null) {
					Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.REGION_UPDATE_PACKET, client.aClass1_9025.aClass488_22, -544451447);
					client.aClass1_9025.method378(class330_sub34, -927877476);
				}
			}
			Class421.method5293((byte) 120);
			if (aBoolean3098) {
				Class56.panelBoxMessage(Long.toString(Class312.method3111((byte) 111) - (aLong3109 * -7651927744591639643L)), -1728185520);
				aBoolean3098 = false;
			}
			if (bool_89_) {
				synchronized (client.anObject9032) {
					client.anObject9032.notify();
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ak(").append(')').toString());
		}
	}

	void method3018(int i, int i_101_) {
		try {
			try {
				Thread.sleep((long) i);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ag(").append(')').toString());
		}
	}

	void method3019(Class274_Sub1 class274_sub1, byte[][] is, byte i) {
		try {
			int i_102_ = is.length;
			for (int i_103_ = 0; i_103_ < i_102_; i_103_++) {
				byte[] is_104_ = is[i_103_];
				if (null != is_104_) {
					Buffer class330_sub46 = new Buffer(is_104_);
					int i_105_ = anIntArray3067[i_103_] >> 8;
					int i_106_ = anIntArray3067[i_103_] & 0xff;
					int i_107_ = (i_105_ * 64 - -1261027839 * (((Class304) this).aClass381_3071.gameSceneBaseX));
					int i_108_ = (i_106_ * 64 - -1542584207 * (((Class304) this).aClass381_3071.gameSceneBaseY));
					if (!aBoolean3103)
						Class233.method2362((byte) 2);
					class274_sub1.method2688(class330_sub46, i_107_, i_108_, -1261027839 * (((Class304) this).aClass381_3071.gameSceneBaseX), (aClass381_3071.gameSceneBaseY) * -1542584207, (((Class304) this).aClass307Array3087), (byte) -21);
					class274_sub1.method2707(Class361.aClass_ra3793, class330_sub46, i_107_, i_108_, (byte) 1);
				}
			}
			for (int i_109_ = 0; i_109_ < i_102_; i_109_++) {
				int i_110_ = ((anIntArray3067[i_109_] >> 8) * 64 - (aClass381_3071.gameSceneBaseX * -1261027839));
				int i_111_ = ((anIntArray3067[i_109_] & 0xff) * 64 - (aClass381_3071.gameSceneBaseY * -1542584207));
				byte[] is_112_ = is[i_109_];
				if (null == is_112_ && anInt3074 * 579246643 < 800) {
					if (!aBoolean3103)
						Class233.method2362((byte) 20);
					class274_sub1.method2686(i_110_, i_111_, 64, 64, 1540852282);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.az(").append(')').toString());
		}
	}

	void method3020(short i) {
		try {
			int i_113_ = aByteArrayArray3105.length;
			for (int i_114_ = 0; i_114_ < i_113_; i_114_++) {
				if (aByteArrayArray3105[i_114_] == null) {
					if (i >= 8192)
						throw new IllegalStateException();
				} else {
					int i_115_ = -1;
					for (int i_116_ = 0; i_116_ < client.anInt9035 * -742032903; i_116_++) {
						if (anIntArray3067[i_114_] == client.anIntArray9034[i_116_]) {
							i_115_ = i_116_;
							break;
						}
					}
					if (-1 == i_115_) {
						client.anIntArray9034[client.anInt9035 * -742032903] = anIntArray3067[i_114_];
						i_115_ = (client.anInt9035 += 746584137) * -742032903 - 1;
					}
					Buffer class330_sub46 = new Buffer(((Class304) this).aByteArrayArray3105[i_114_]);
					int i_117_ = 0;
					while ((-824785231 * class330_sub46.offset < (aByteArrayArray3105[i_114_]).length) && i_117_ < 511) {
						if (-823688441 * client.anInt9017 >= 1023) {
							if (i >= 8192)
								throw new IllegalStateException();
							break;
						}
						int i_118_ = i_115_ | i_117_++ << 6;
						int i_119_ = class330_sub46.readUnsignedShort(117886083);
						int i_120_ = i_119_ >> 14;
						int i_121_ = i_119_ >> 7 & 0x3f;
						int i_122_ = i_119_ & 0x3f;
						int i_123_ = (((anIntArray3067[i_114_] >> 8) * 64) - (aClass381_3071.gameSceneBaseX * -1261027839) + i_121_);
						int i_124_ = (i_122_ + ((anIntArray3067[i_114_] & 0xff) * 64 - (aClass381_3071.gameSceneBaseY * -1542584207)));
						Class551 class551 = (Class158_Sub3.aClass553_8875.method6392(class330_sub46.readUnsignedShort(545001925), -903488850));
						Class330_Sub35 class330_sub35 = (Class330_Sub35) client.aClass497_9014.method6094((long) i_118_);
						if (null == class330_sub35 && (class551.aByte6322 & 0x1) > 0 && i_123_ >= 0 && (i_123_ + -1943771105 * class551.anInt6295 < anInt3108 * 154004499) && i_124_ >= 0 && (i_124_ + class551.anInt6295 * -1943771105 < -1676046053 * anInt3076)) {
							NPC class432_sub1_sub1_sub1_sub2 = (new NPC(aClass356_3100));
							class432_sub1_sub1_sub1_sub2.anInt10008 = 662194221 * i_118_;
							Class330_Sub35 class330_sub35_125_ = (new Class330_Sub35(class432_sub1_sub1_sub1_sub2));
							client.aClass497_9014.method6097(class330_sub35_125_, (long) i_118_);
							client.aClass330_Sub35Array9015[((client.anInt9232 += 93438839) * -1183709625 - 1)] = class330_sub35_125_;
							client.anIntArray9018[((client.anInt9017 += -948929865) * -823688441 - 1)] = i_118_;
							class432_sub1_sub1_sub1_sub2.anInt10069 = client.anInt8981 * 1923340057;
							class432_sub1_sub1_sub1_sub2.method5475(class551, 1918950667);
							class432_sub1_sub1_sub1_sub2.method5420(-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295), (short) -18855);
							class432_sub1_sub1_sub1_sub2.anInt10051 = 543987723 * ((-922219293 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6325)) << 3);
							class432_sub1_sub1_sub1_sub2.method5411((class432_sub1_sub1_sub1_sub2.aClass551_10251.aClass293_6315.method2912((byte) -94).method297((short) -16073) << 11) & 0x3fff, true, 272541087);
							class432_sub1_sub1_sub1_sub2.method5478(i_120_, i_123_, i_124_, true, class432_sub1_sub1_sub1_sub2.method5453(-954851024), -1737258822);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.am(").append(')').toString());
		}
	}

	void method3021(Class274_Sub1 class274_sub1, byte[][] is, int i) {
		try {
			int i_126_ = aByteArrayArray3096.length;
			for (int i_127_ = 0; i_127_ < i_126_; i_127_++) {
				byte[] is_128_ = is[i_127_];
				if (null != is_128_) {
					int i_129_ = (64 * (anIntArray3067[i_127_] >> 8) - (-1261027839 * aClass381_3071.gameSceneBaseX));
					int i_130_ = ((anIntArray3067[i_127_] & 0xff) * 64 - (aClass381_3071.gameSceneBaseY * -1542584207));
					if (!aBoolean3103)
						Class233.method2362((byte) 21);
					class274_sub1.method2709(Class361.aClass_ra3793, is_128_, i_129_, i_130_, (((Class304) this).aClass307Array3087), 714454992);
					if (aBoolean3103)
						method3018(10, -824780886);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.av(").append(')').toString());
		}
	}

	public Class381 method3022(int i) {
		try {
			return aClass381_3071;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.o(").append(')').toString());
		}
	}

	public Class356 method3023(int i) {
		try {
			return aClass356_3100;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.k(").append(')').toString());
		}
	}

	String method3024(boolean bool, boolean bool_131_, int i, int i_132_, byte i_133_) {
		try {
			String string = "";
			if (bool)
				string = new StringBuilder().append(string).append("m").append(i).append('_').append(i_132_).toString();
			else
				string = new StringBuilder().append(string).append("l").append(i).append('_').append(i_132_).toString();
			if (bool_131_)
				string = new StringBuilder().append('u').append(string).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ad(").append(')').toString());
		}
	}

	public Class463 method3025(byte i) {
		try {
			return aClass463_3081;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.d(").append(')').toString());
		}
	}

	public void method3026(Class300 class300, int i) {
		try {
			aClass310_3066 = ((Class300) class300).aClass310_3057;
			if (OutgoingPacketManager.aClass310_3215 == aClass310_3066)
				method3009(1798838922);
			else if (OutgoingPacketManager.aClass310_3210 == aClass310_3066)
				sendMapRegion(((Class300) class300).aClass330_Sub46_Sub2_3056, 1343505300);
			else if (OutgoingPacketManager.aClass310_3212 == aClass310_3066)
				method3029(-255360127);
			else if (aClass310_3066.method3098((byte) 91))
				method3010(((Class300) class300).aClass330_Sub46_Sub2_3056, 1143246584);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ap(").append(')').toString());
		}
	}

	public Class312 method3027(byte i) {
		try {
			return aClass312_3084;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.w(").append(')').toString());
		}
	}

	public void method3028(int i) {
		try {
			aClass381_3071 = new Class381();
			anInt3074 = 0;
			anInt3073 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.y(").append(')').toString());
		}
	}

	void method3029(int i) {
		try {
			aClass310_3083 = aClass310_3066;
			method3012(Class134.aClass134_1515, 2119844909);
			for (int i_134_ = 0; i_134_ < 4; i_134_++) {
				for (int i_135_ = 0; i_135_ < anInt3108 * 154004499 >> 3; i_135_++) {
					for (int i_136_ = 0; (i_136_ < -1676046053 * anInt3076 >> 3); i_136_++)
						anIntArrayArrayArray3086[i_134_][i_135_][i_136_] = -1;
				}
			}
			for (Class330_Sub17 class330_sub17 = ((Class330_Sub17) Class96.aClass471_856.method5869(539664854)); null != class330_sub17; class330_sub17 = ((Class330_Sub17) Class96.aClass471_856.method5873((byte) -54))) {
				int i_137_ = 1260090803 * class330_sub17.anInt7629;
				boolean bool = (i_137_ & 0x1) == 1;
				int i_138_ = 942966043 * class330_sub17.anInt7622 >> 3;
				int i_139_ = class330_sub17.anInt7627 * 1188711933 >> 3;
				int i_140_ = class330_sub17.anInt7623 * -32947705;
				int i_141_ = -437866715 * class330_sub17.anInt7626;
				int i_142_ = class330_sub17.anInt7625 * -141272929;
				int i_143_ = class330_sub17.anInt7621 * 474638961;
				int i_144_ = class330_sub17.anInt7624 * -1284027483;
				int i_145_ = class330_sub17.anInt7628 * -234054123;
				int i_146_ = 0;
				int i_147_ = 0;
				int i_148_ = 1;
				int i_149_ = 1;
				if (i_137_ == 1) {
					i_147_ = i_144_ - 1;
					i_148_ = -1;
				} else if (2 == i_137_) {
					i_147_ = i_144_ - 1;
					i_146_ = i_145_ - 1;
					i_148_ = -1;
					i_149_ = -1;
				} else if (i_137_ == 3) {
					i_146_ = i_145_ - 1;
					i_148_ = 1;
					i_149_ = -1;
				}
				int i_150_ = i_139_;
				while (i_150_ < i_145_ + i_139_) {
					int i_151_ = i_147_;
					int i_152_ = i_138_;
					while (i_152_ < i_144_ + i_138_) {
						if (bool)
							anIntArrayArrayArray3086[i_143_][i_146_ + i_140_][i_151_ + i_141_] = ((i_150_ << 3) + ((i_142_ << 24) + (i_152_ << 14)) + (i_137_ << 1));
						else
							anIntArrayArrayArray3086[i_143_][i_140_ + i_151_][i_146_ + i_141_] = (i_137_ << 1) + ((i_152_ << 14) + (i_142_ << 24) + (i_150_ << 3));
						i_152_++;
						i_151_ += i_148_;
					}
					i_150_++;
					i_146_ += i_149_;
				}
			}
			int i_153_ = Class140_Sub1.anIntArrayArray7262.length;
			anIntArray3067 = new int[i_153_];
			anIntArray3097 = new int[i_153_];
			anIntArray3075 = new int[i_153_];
			anIntArray3099 = null;
			aByteArrayArray3096 = new byte[i_153_][];
			aByteArrayArray3104 = new byte[i_153_][];
			aByteArrayArray3105 = null;
			anIntArray3107 = new int[i_153_];
			anIntArray3101 = new int[i_153_];
			aByteArrayArray3106 = new byte[i_153_][];
			aByteArrayArray3092 = new byte[i_153_][];
			i_153_ = 0;
			for (Class330_Sub17 class330_sub17 = ((Class330_Sub17) Class96.aClass471_856.method5869(539664854)); class330_sub17 != null; class330_sub17 = ((Class330_Sub17) Class96.aClass471_856.method5873((byte) 10))) {
				int i_154_ = class330_sub17.anInt7622 * 942966043 >>> 3;
				int i_155_ = class330_sub17.anInt7627 * 1188711933 >>> 3;
				int i_156_ = i_154_ + -1284027483 * class330_sub17.anInt7624;
				if ((i_156_ & 0x7) == 0)
					i_156_--;
				i_156_ >>>= 3;
				int i_157_ = i_155_ + class330_sub17.anInt7628 * -234054123;
				if (0 == (i_157_ & 0x7))
					i_157_--;
				i_157_ >>>= 3;
				for (int i_158_ = i_154_ >>> 3; i_158_ <= i_156_; i_158_++) {
					while_81_: for (int i_159_ = i_155_ >>> 3; i_159_ <= i_157_; i_159_++) {
						int i_160_ = i_158_ << 8 | i_159_;
						for (int i_161_ = 0; i_161_ < i_153_; i_161_++) {
							if (i_160_ == anIntArray3067[i_161_]) {
								if (i != -255360127)
									throw new IllegalStateException();
								continue while_81_;
							}
						}
						anIntArray3067[i_153_] = i_160_;
						anIntArray3097[i_153_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, false, i_158_, i_159_, (byte) 4), 323600977));
						anIntArray3075[i_153_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, false, i_158_, i_159_, (byte) 4), 323600977));
						anIntArray3107[i_153_] = (ItemDefinitions.aClass280_6752.method2754(method3024(true, true, i_158_, i_159_, (byte) 4), 323600977));
						anIntArray3101[i_153_] = (ItemDefinitions.aClass280_6752.method2754(method3024(false, true, i_158_, i_159_, (byte) 4), 323600977));
						i_153_++;
					}
				}
			}
			anIntArrayArray3102 = Class140_Sub1.anIntArrayArray7262;
			Class140_Sub1.anIntArrayArray7262 = null;
			method3014(154004499 * anInt3108 >> 4, -1676046053 * anInt3076 >> 4, 16, false, (byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ax(").append(')').toString());
		}
	}

	void method3030(Class274_Sub1 class274_sub1, byte[][] is, int i) {
		try {
			for (int i_162_ = 0; i_162_ < -392146777 * class274_sub1.anInt2774; i_162_++) {
				if (!aBoolean3103)
					Class233.method2362((byte) -14);
				for (int i_163_ = 0; i_163_ < 154004499 * anInt3108 >> 3; i_163_++) {
					for (int i_164_ = 0; (i_164_ < anInt3076 * -1676046053 >> 3); i_164_++) {
						int i_165_ = (anIntArrayArrayArray3086[i_162_][i_163_][i_164_]);
						if (i_165_ != -1) {
							int i_166_ = i_165_ >> 24 & 0x3;
							if (!class274_sub1.aBoolean2777 || 0 == i_166_) {
								int i_167_ = i_165_ >> 1 & 0x3;
								int i_168_ = i_165_ >> 14 & 0x3ff;
								int i_169_ = i_165_ >> 3 & 0x7ff;
								int i_170_ = (i_168_ / 8 << 8) + i_169_ / 8;
								for (int i_171_ = 0; i_171_ < (((Class304) this).anIntArray3067).length; i_171_++) {
									if ((anIntArray3067[i_171_]) == i_170_ && is[i_171_] != null) {
										Buffer class330_sub46 = new Buffer(is[i_171_]);
										class274_sub1.method2689(class330_sub46, i_162_, 8 * i_163_, 8 * i_164_, i_166_, i_168_, i_169_, i_167_, (((Class304) this).aClass307Array3087), -817388189);
										class274_sub1.method2708(Class361.aClass_ra3793, class330_sub46, i_162_, 8 * i_163_, 8 * i_164_, i_166_, i_168_, i_169_, i_167_, 1926745313);
										break;
									}
								}
							}
						}
					}
				}
			}
			for (int i_172_ = 0; i_172_ < -392146777 * class274_sub1.anInt2774; i_172_++) {
				if (!aBoolean3103)
					Class233.method2362((byte) 68);
				for (int i_173_ = 0; i_173_ < anInt3108 * 154004499 >> 3; i_173_++) {
					for (int i_174_ = 0; (i_174_ < anInt3076 * -1676046053 >> 3); i_174_++) {
						int i_175_ = (anIntArrayArrayArray3086[i_172_][i_173_][i_174_]);
						if (-1 == i_175_)
							class274_sub1.method2687(i_172_, 8 * i_173_, i_174_ * 8, 8, 8, (short) 24892);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.ah(").append(')').toString());
		}
	}

	public Class351 method3031(byte i) {
		try {
			return aClass351_3094;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.z(").append(')').toString());
		}
	}

	public void method3032(int i) {
		try {
			if (aBoolean3103) {
				method3004((byte) 24);
				Class517.method6212(true, -1340583301);
				Class304 class304_176_ = client.aClass304_9030;
				anIntArray3067 = ((Class304) class304_176_).anIntArray3067;
				anIntArray3097 = ((Class304) class304_176_).anIntArray3097;
				anIntArray3075 = ((Class304) class304_176_).anIntArray3075;
				anIntArray3099 = ((Class304) class304_176_).anIntArray3099;
				anIntArray3107 = ((Class304) class304_176_).anIntArray3107;
				anIntArray3101 = ((Class304) class304_176_).anIntArray3101;
				anIntArrayArray3102 = ((Class304) class304_176_).anIntArrayArray3102;
				aByteArrayArray3096 = ((Class304) class304_176_).aByteArrayArray3096;
				aByteArrayArray3104 = ((Class304) class304_176_).aByteArrayArray3104;
				aByteArrayArray3105 = ((Class304) class304_176_).aByteArrayArray3105;
				aByteArrayArray3106 = ((Class304) class304_176_).aByteArrayArray3106;
				aByteArrayArray3092 = ((Class304) class304_176_).aByteArrayArray3092;
				aClass307Array3087 = ((Class304) class304_176_).aClass307Array3087;
				aClass281_3079 = ((Class304) class304_176_).aClass281_3079;
				aClass389_3068 = ((Class304) class304_176_).aClass389_3068;
				anIntArrayArrayArray3086 = ((Class304) class304_176_).anIntArrayArrayArray3086;
				anInt3080 = 1 * ((Class304) class304_176_).anInt3080;
				anInt3065 = 1 * ((Class304) class304_176_).anInt3065;
				aClass330_Sub36_Sub12_3082 = ((Class304) class304_176_).aClass330_Sub36_Sub12_3082;
				aClass351_3094 = ((Class304) class304_176_).aClass351_3094;
				anIntArrayArray3088 = ((Class304) class304_176_).anIntArrayArray3088;
				anIntArrayArray3089 = ((Class304) class304_176_).anIntArrayArray3089;
				aByteArrayArrayArray3090 = ((Class304) class304_176_).aByteArrayArrayArray3090;
				aClass310_3066 = ((Class304) class304_176_).aClass310_3066;
				aClass134_3077 = ((Class304) class304_176_).aClass134_3077;
				aClass381_3071 = ((Class304) class304_176_).aClass381_3071;
				aClass381_3072 = ((Class304) class304_176_).aClass381_3072;
				anInt3073 = 1 * ((Class304) class304_176_).anInt3073;
				anInt3074 = 1 * ((Class304) class304_176_).anInt3074;
				anInt3108 = 1 * ((Class304) class304_176_).anInt3108;
				anInt3076 = 1 * ((Class304) class304_176_).anInt3076;
			} else if (-296919301 * client.anInt8995 == 6)
				Class227.method2311(5, -1188873169);
			else if (15 == client.anInt8995 * -296919301)
				Class227.method2311(19, -1188873169);
			else if (11 == -296919301 * client.anInt8995)
				Class227.method2311(7, -1188873169);
			else if (1 == client.anInt8995 * -296919301)
				Class227.method2311(16, -1188873169);
			else if (14 == -296919301 * client.anInt8995)
				Class227.method2311(17, -1188873169);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.aw(").append(')').toString());
		}
	}

	public int method3033(byte i) {
		try {
			return -1676046053 * anInt3076;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.f(").append(')').toString());
		}
	}

	static final void method3034(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_177_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_178_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			if (Class3.aClass120Array56[i_177_] == null)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else {
				String string = (Class3.aClass120Array56[i_177_].aClass114Array1400[i_178_].aString1360);
				if (null == string)
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
				else
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = string;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.anh(").append(')').toString());
		}
	}

	static final void method3035(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			iComponentDefinitions.aString1283 = (String) (((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 -= 2087905371) * -1378875437)]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.jt(").append(')').toString());
		}
	}

	static void method3036(Class_ra class_ra, Class_ta class_ta, IComponentDefinitions iComponentDefinitions, int i, int i_179_, int i_180_, int i_181_, int i_182_, byte i_183_) {
		try {
			Class372 class372 = Class79.aClass380_666.method4387(i_182_, (byte) -47);
			if (class372 != null && class372.aBoolean3884 && class372.method4327(Class158.aClass561_6474, (byte) 51)) {
				if (null != class372.anIntArray3897) {
					int[] is = new int[class372.anIntArray3897.length];
					for (int i_184_ = 0; i_184_ < is.length / 2; i_184_++) {
						int i_185_;
						if (5 == Class147.anInt1621 * -1551406343)
							i_185_ = (int) client.aFloat9141 & 0x3fff;
						else
							i_185_ = ((int) client.aFloat9141 + client.anInt9149 * -603680235) & 0x3fff;
						int i_186_ = Class257.anIntArray2683[i_185_];
						int i_187_ = Class257.anIntArray2684[i_185_];
						if (5 != Class147.anInt1621 * -1551406343) {
							i_186_ = 256 * i_186_ / (client.anInt9063 * 1113850905 + 256);
							i_187_ = (i_187_ * 256 / (256 + 1113850905 * client.anInt9063));
						}
						is[2 * i_184_] = ((((i_187_ * (class372.anIntArray3897[2 * i_184_] * 4 + i_180_)) + i_186_ * (i_181_ + 4 * (class372.anIntArray3897[1 + 2 * i_184_]))) >> 14) + (i + iComponentDefinitions.anInt1210 * -681123409 / 2));
						is[1 + 2 * i_184_] = (i_179_ + 694142557 * iComponentDefinitions.anInt1348 / 2 - ((i_187_ * (4 * (class372.anIntArray3897[2 * i_184_ + 1]) + i_181_) - i_186_ * (4 * (class372.anIntArray3897[i_184_ * 2]) + i_180_)) >> 14));
					}
					Class122 class122 = iComponentDefinitions.method1396(class_ra, (byte) -105);
					if (class122 != null)
						Class82.method957(class_ra, is, -321787043 * class372.anInt3900, class122.anIntArray1404, class122.anIntArray1406);
					if (-212754189 * class372.anInt3875 > 0) {
						for (int i_188_ = 0; i_188_ < is.length / 2 - 1; i_188_++) {
							int i_189_ = is[2 * i_188_];
							int i_190_ = is[1 + 2 * i_188_];
							int i_191_ = is[(i_188_ + 1) * 2];
							int i_192_ = is[(1 + i_188_) * 2 + 1];
							if (i_191_ < i_189_) {
								int i_193_ = i_189_;
								int i_194_ = i_190_;
								i_189_ = i_191_;
								i_190_ = i_192_;
								i_191_ = i_193_;
								i_192_ = i_194_;
							} else if (i_189_ == i_191_ && i_192_ < i_190_) {
								int i_195_ = i_190_;
								i_190_ = i_192_;
								i_192_ = i_195_;
							}
							class_ra.be(i_189_, i_190_, i_191_, i_192_, (class372.anIntArray3908[(class372.aByteArray3912[i_188_] & 0xff)]), 1, class_ta, i, i_179_, class372.anInt3875 * -212754189, -1858380137 * class372.anInt3881, -1758479397 * class372.anInt3905);
						}
						int i_196_ = is[is.length - 2];
						int i_197_ = is[is.length - 1];
						int i_198_ = is[0];
						int i_199_ = is[1];
						if (i_198_ < i_196_) {
							int i_200_ = i_196_;
							int i_201_ = i_197_;
							i_196_ = i_198_;
							i_197_ = i_199_;
							i_198_ = i_200_;
							i_199_ = i_201_;
						} else if (i_198_ == i_196_ && i_199_ < i_197_) {
							int i_202_ = i_197_;
							i_197_ = i_199_;
							i_199_ = i_202_;
						}
						class_ra.be(i_196_, i_197_, i_198_, i_199_, (class372.anIntArray3908[((class372.aByteArray3912[class372.aByteArray3912.length - 1]) & 0xff)]), 1, class_ta, i, i_179_, -212754189 * class372.anInt3875, class372.anInt3881 * -1858380137, -1758479397 * class372.anInt3905);
					} else {
						for (int i_203_ = 0; i_203_ < is.length / 2 - 1; i_203_++)
							class_ra.bi(is[2 * i_203_], is[1 + 2 * i_203_], is[(i_203_ + 1) * 2], is[(1 + i_203_) * 2 + 1], (class372.anIntArray3908[(class372.aByteArray3912[i_203_] & 0xff)]), 1, class_ta, i, i_179_);
						class_ra.bi(is[is.length - 2], is[is.length - 1], is[0], is[1], (class372.anIntArray3908[((class372.aByteArray3912[class372.aByteArray3912.length - 1]) & 0xff)]), 1, class_ta, i, i_179_);
					}
				}
				Class61 class61 = null;
				if (class372.anInt3872 * -19592741 != -1) {
					class61 = class372.method4325(class_ra, false, -1743466339);
					if (class61 != null)
						Class464_Sub3.method5744(iComponentDefinitions, class_ta, i, i_179_, i_180_, i_181_, class61, (byte) 0);
				}
				if (class372.aString3909 != null) {
					int i_204_ = 0;
					if (class61 != null)
						i_204_ = class61.method682();
					Class263 class263 = Class125.aClass263_1454;
					Class524 class524 = Class543.aClass524_6254;
					if (1 == class372.anInt3876 * 1422337301) {
						class263 = Class464_Sub22.aClass263_8709;
						class524 = Class386.aClass524_3989;
					}
					if (class372.anInt3876 * 1422337301 == 2) {
						class263 = Class166_Sub3_Sub2.aClass263_9483;
						class524 = Class477_Sub1.aClass524_8749;
					}
					Class315.method3139(iComponentDefinitions, class_ta, i, i_179_, i_180_, i_181_, i_204_, class372.aString3909, class263, class524, class372.anInt3903 * 1249196777, -1367566886);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.q(").append(')').toString());
		}
	}

	static void method3037(Class549_Sub1 class549_sub1, int i, int i_205_, int i_206_) {
		try {
			class549_sub1.method6362(i, (byte) -34);
			int i_207_;
			if (i_205_ > 20049) {
				Class283.method2828(1651757454);
				i_207_ = 4;
			} else if (i_205_ > 10036) {
				Class95_Sub12_Sub1.method1141(-2137507047);
				i_207_ = 3;
			} else if (i_205_ > 5025) {
				Class51.method634(1129678322);
				i_207_ = 2;
			} else {
				Class330_Sub18.method3342(true, -1779888560);
				i_207_ = 1;
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1264441102) != i) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, i, 233119885);
				Class171.method2046(i, false, 375330234);
			} else
				Class448.aClass330_Sub50_5555.method3857(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895, true, 933751973);
			Class435.method5568(2017550207);
			class549_sub1.method6360(i_207_, 95955317);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mr.f(").append(')').toString());
		}
	}
}
