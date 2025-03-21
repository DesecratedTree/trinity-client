/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class238 {
	public int anInt2581;
	int anInt2582;
	public static Class355 aClass355_2583;

	public void method2369(int i, int i_0_) {
		try {
			anInt2581 = 1218629079 * i;
			((Class238) this).anInt2582 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.j(").append(')').toString());
		}
	}

	public int method2370(int i) {
		try {
			return anInt2581 * 142833127 & 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.i(").append(')').toString());
		}
	}

	public void method2371(int i) {
		try {
			anInt2581 = (142833127 * anInt2581 & 0x3fff) * 1218629079;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.p(").append(')').toString());
		}
	}

	public boolean method2372(int i, int i_1_, int i_2_, int i_3_) {
		try {
			int i_4_ = ((Class238) this).anInt2582 * 1853612053;
			if (142833127 * anInt2581 == i && 0 == ((Class238) this).anInt2582 * 1853612053)
				return false;
			boolean bool;
			if (((Class238) this).anInt2582 * 1853612053 == 0) {
				if ((i > anInt2581 * 142833127 && i <= anInt2581 * 142833127 + i_1_) || (i < 142833127 * anInt2581 && i >= anInt2581 * 142833127 - i_1_)) {
					anInt2581 = 1218629079 * i;
					return false;
				}
				bool = true;
			} else if (1853612053 * ((Class238) this).anInt2582 > 0 && i > 142833127 * anInt2581) {
				int i_5_ = (1853612053 * ((Class238) this).anInt2582 * (1853612053 * ((Class238) this).anInt2582) / (i_1_ * 2));
				int i_6_ = i_5_ + anInt2581 * 142833127;
				if (i_6_ >= i || i_6_ < 142833127 * anInt2581)
					bool = false;
				else
					bool = true;
			} else if (1853612053 * ((Class238) this).anInt2582 < 0 && i < 142833127 * anInt2581) {
				int i_7_ = (((Class238) this).anInt2582 * 1853612053 * (((Class238) this).anInt2582 * 1853612053) / (2 * i_1_));
				int i_8_ = 142833127 * anInt2581 - i_7_;
				if (i_8_ <= i || i_8_ > anInt2581 * 142833127)
					bool = false;
				else
					bool = true;
			} else
				bool = false;
			if (bool) {
				if (i > 142833127 * anInt2581) {
					((Class238) this).anInt2582 += i_1_ * -1222054083;
					if (0 != i_2_ && 1853612053 * ((Class238) this).anInt2582 > i_2_)
						((Class238) this).anInt2582 = -1222054083 * i_2_;
				} else {
					((Class238) this).anInt2582 -= -1222054083 * i_1_;
					if (i_2_ != 0 && ((Class238) this).anInt2582 * 1853612053 < -i_2_)
						((Class238) this).anInt2582 = -1222054083 * -i_2_;
				}
				if (i_4_ != 1853612053 * ((Class238) this).anInt2582) {
					int i_9_ = (((Class238) this).anInt2582 * 1853612053 * (((Class238) this).anInt2582 * 1853612053) / (2 * i_1_));
					if (i > 142833127 * anInt2581) {
						if (anInt2581 * 142833127 + i_9_ > i)
							((Class238) this).anInt2582 = i_4_ * -1222054083;
					} else if (i < anInt2581 * 142833127 && anInt2581 * 142833127 - i_9_ < i)
						((Class238) this).anInt2582 = i_4_ * -1222054083;
				}
			} else if (1853612053 * ((Class238) this).anInt2582 > 0) {
				((Class238) this).anInt2582 -= i_1_ * -1222054083;
				if (((Class238) this).anInt2582 * 1853612053 < 0)
					((Class238) this).anInt2582 = 0;
			} else {
				((Class238) this).anInt2582 += -1222054083 * i_1_;
				if (1853612053 * ((Class238) this).anInt2582 > 0)
					((Class238) this).anInt2582 = 0;
			}
			anInt2581 += (1218629079 * (i_4_ + ((Class238) this).anInt2582 * 1853612053 >> 1));
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.r(").append(')').toString());
		}
	}

	static final void method2373(Class430 class430, int i) {
		try {
			int i_10_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_10_, 544580868);
			Class120 class120 = Class3.aClass120Array56[i_10_ >> 16];
			Class201_Sub2.method2170(iComponentDefinitions, class120, class430, 1612451864);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.ex(").append(')').toString());
		}
	}

	static final void method2374(Class430 class430, int i) {
		try {
			int i_11_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_11_, 1230262886);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1264 * 479023813;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.sb(").append(')').toString());
		}
	}

	static void method2375(Class_ra class_ra, Interface_ma interface_ma, int i, int i_12_, int i_13_, int i_14_, short i_15_) {
		try {
			if (-1755364031 * Class354_Sub1.anInt7977 < 100)
				IsaacCipher.method6050(class_ra, interface_ma, 1100916704);
			class_ra.r(i, i_12_, i_13_ + i, i_14_ + i_12_);
			if (-1755364031 * Class354_Sub1.anInt7977 < 100) {
				int i_16_ = 20;
				int i_17_ = i + i_13_ / 2;
				int i_18_ = i_14_ / 2 + i_12_ - 18 - i_16_;
				class_ra.B(i, i_12_, i_13_, i_14_, -16777216, 0);
				class_ra.bl(i_17_ - 152, i_18_, 304, 34, client.aColorArray9006[client.anInt8957 * -1667441567].getRGB(), 0);
				class_ra.B(i_17_ - 150, 2 + i_18_, Class354_Sub1.anInt7977 * -971124797, 30, client.aColorArray9005[client.anInt8957 * -1667441567].getRGB(), 0);
				Class166_Sub3_Sub2.aClass263_9483.method2595(Class526.aClass526_6154.method6257(Class429.aClass454_4369, 991479434), i_17_, i_16_ + i_18_, client.aColorArray9007[client.anInt8957 * -1667441567].getRGB(), -1, 1346047438);
			} else {
				int i_19_ = (1926560771 * Class204.anInt6517 - (int) ((float) i_13_ / Class354_Sub1.aFloat3507));
				int i_20_ = (Class149_Sub1.anInt8867 * -694314711 + (int) ((float) i_14_ / Class354_Sub1.aFloat3507));
				int i_21_ = ((int) ((float) i_13_ / Class354_Sub1.aFloat3507) + 1926560771 * Class204.anInt6517);
				int i_22_ = (-694314711 * Class149_Sub1.anInt8867 - (int) ((float) i_14_ / Class354_Sub1.aFloat3507));
				Class557.anInt6399 = ((1926560771 * Class204.anInt6517 - (int) ((float) i_13_ / Class354_Sub1.aFloat3507)) * 1804631793);
				Class475.anInt5701 = ((Class149_Sub1.anInt8867 * -694314711 - (int) ((float) i_14_ / Class354_Sub1.aFloat3507)) * 2047442887);
				Class379.anInt3953 = ((int) ((float) (2 * i_13_) / Class354_Sub1.aFloat3507) * 414881509);
				Class525.anInt6037 = -1394428911 * (int) ((float) (2 * i_14_) / Class354_Sub1.aFloat3507);
				Class354_Sub1.method4090(i_19_ + Class354_Sub1.anInt3510, i_20_ + Class354_Sub1.anInt3516, Class354_Sub1.anInt3510 + i_21_, i_22_ + Class354_Sub1.anInt3516, i, i_12_, i + i_13_, 1 + (i_12_ + i_14_));
				Class354_Sub1.method4091(class_ra);
				Class471 class471 = Class354_Sub1.method4098(class_ra);
				Class398.method4687(class_ra, class471, 0, 0, (byte) 113);
				if (Class448.anInt5556 * -927753929 > 0) {
					Class101.anInt6456 -= 1692618593;
					if (0 == Class101.anInt6456 * -1484286815) {
						Class448.anInt5556 -= -2012124025;
						Class101.anInt6456 = -507366508;
					}
				}
				if (client.aBoolean8983) {
					int i_23_ = i_13_ + i - 5;
					int i_24_ = i_12_ + i_14_ - 8;
					Class464_Sub22.aClass263_8709.method2612(new StringBuilder().append("Fps:").append(2061800443 * Class332.anInt6603).toString(), i_23_, i_24_, 16776960, -1, (short) 3376);
					i_24_ -= 15;
					Runtime runtime = Runtime.getRuntime();
					int i_25_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					int i_26_ = 16776960;
					if (i_25_ > 65536)
						i_26_ = 16711680;
					Class464_Sub22.aClass263_8709.method2612(new StringBuilder().append("Mem:").append(i_25_).append("k").toString(), i_23_, i_24_, i_26_, -1, (short) 1882);
					i_24_ -= 15;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.ce(").append(')').toString());
		}
	}

	static boolean method2376(int i, int i_27_) {
		try {
			return (i == 59 || i == 2 || 8 == i || i == 17 || i == 15 || 16 == i || 58 == i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.bn(").append(')').toString());
		}
	}

	public static Class330_Sub34 method2377(OutgoingPacket outgoingPacket, IsaacCipher isaacCipher, int i) {
		try {
			Class330_Sub34 class330_sub34 = Class239.method2383((byte) 64);
			((Class330_Sub34) class330_sub34).aClass234_7732 = outgoingPacket;
			((Class330_Sub34) class330_sub34).anInt7728 = ((OutgoingPacket) outgoingPacket).anInt2577 * 2060600651;
			if (-1 == ((Class330_Sub34) class330_sub34).anInt7728 * -1568379379)
				class330_sub34.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(260);
			else if (((Class330_Sub34) class330_sub34).anInt7728 * -1568379379 == -2)
				class330_sub34.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(10000);
			else if (-1568379379 * ((Class330_Sub34) class330_sub34).anInt7728 <= 18)
				class330_sub34.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(20);
			else if (((Class330_Sub34) class330_sub34).anInt7728 * -1568379379 <= 98)
				class330_sub34.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(100);
			else
				class330_sub34.aClass330_Sub46_Sub2_7729 = new Class330_Sub46_Sub2(260);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3821(isaacCipher, -398103403);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3822((((OutgoingPacket) ((Class330_Sub34) class330_sub34).aClass234_7732).anInt2576) * 1198818811, -1034808700);
			class330_sub34.anInt7730 = 0;
			return class330_sub34;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.j(").append(')').toString());
		}
	}

	static final void method2378(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class475_Sub5.method5958(-296919301 * client.anInt8995, 885477300) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("k.agk(").append(')').toString());
		}
	}
}
