/* IsaacCipher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class IsaacCipher {
	int anInt5828;
	static int anInt5829 = 256;
	static int anInt5830 = 1020;
	int anInt5831;
	static int anInt5832 = 8;
	int[] anIntArray5833;
	int anInt5834;
	int[] anIntArray5835 = new int[256];
	int anInt5836;
	static int anInt5837;
	static IComponentDefinitions aClass114_5838;

	public final int method6042(int i) {
		try {
			if (854864939 * ((IsaacCipher) this).anInt5831 == 0) {
				method6045(-548591214);
				((IsaacCipher) this).anInt5831 = 250249984;
			}
			if (Loader.isaacDisabled)
				return 0;
			return (((IsaacCipher) this).anIntArray5833[((IsaacCipher) this).anInt5831 * 854864939 - 1]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.j(").append(')').toString());
		}
	}

	public final int method6043(int i) {
		try {
			if (0 == ((IsaacCipher) this).anInt5831 * 854864939) {
				method6045(-548591214);
				((IsaacCipher) this).anInt5831 = 250249984;
			}
			if (Loader.isaacDisabled)
				return 0;
			return (((IsaacCipher) this).anIntArray5833[(((IsaacCipher) this).anInt5831 -= 286190211) * 854864939]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.r(").append(')').toString());
		}
	}

	final void method6044(byte i) {
		try {
			int i_0_ = -1640531527;
			int i_1_ = -1640531527;
			int i_2_ = -1640531527;
			int i_3_ = -1640531527;
			int i_4_ = -1640531527;
			int i_5_ = -1640531527;
			int i_6_ = -1640531527;
			int i_7_ = -1640531527;
			for (int i_8_ = 0; i_8_ < 4; i_8_++) {
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
			}
			for (int i_9_ = 0; i_9_ < 256; i_9_ += 8) {
				i_7_ += ((IsaacCipher) this).anIntArray5833[i_9_];
				i_6_ += ((IsaacCipher) this).anIntArray5833[1 + i_9_];
				i_5_ += ((IsaacCipher) this).anIntArray5833[i_9_ + 2];
				i_4_ += ((IsaacCipher) this).anIntArray5833[i_9_ + 3];
				i_3_ += ((IsaacCipher) this).anIntArray5833[i_9_ + 4];
				i_2_ += ((IsaacCipher) this).anIntArray5833[i_9_ + 5];
				i_1_ += ((IsaacCipher) this).anIntArray5833[i_9_ + 6];
				i_0_ += ((IsaacCipher) this).anIntArray5833[7 + i_9_];
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
				((IsaacCipher) this).anIntArray5835[i_9_] = i_7_;
				((IsaacCipher) this).anIntArray5835[i_9_ + 1] = i_6_;
				((IsaacCipher) this).anIntArray5835[i_9_ + 2] = i_5_;
				((IsaacCipher) this).anIntArray5835[3 + i_9_] = i_4_;
				((IsaacCipher) this).anIntArray5835[i_9_ + 4] = i_3_;
				((IsaacCipher) this).anIntArray5835[i_9_ + 5] = i_2_;
				((IsaacCipher) this).anIntArray5835[i_9_ + 6] = i_1_;
				((IsaacCipher) this).anIntArray5835[i_9_ + 7] = i_0_;
			}
			for (int i_10_ = 0; i_10_ < 256; i_10_ += 8) {
				i_7_ += ((IsaacCipher) this).anIntArray5835[i_10_];
				i_6_ += ((IsaacCipher) this).anIntArray5835[i_10_ + 1];
				i_5_ += ((IsaacCipher) this).anIntArray5835[i_10_ + 2];
				i_4_ += ((IsaacCipher) this).anIntArray5835[i_10_ + 3];
				i_3_ += ((IsaacCipher) this).anIntArray5835[4 + i_10_];
				i_2_ += ((IsaacCipher) this).anIntArray5835[5 + i_10_];
				i_1_ += ((IsaacCipher) this).anIntArray5835[6 + i_10_];
				i_0_ += ((IsaacCipher) this).anIntArray5835[7 + i_10_];
				i_7_ ^= i_6_ << 11;
				i_4_ += i_7_;
				i_6_ += i_5_;
				i_6_ ^= i_5_ >>> 2;
				i_3_ += i_6_;
				i_5_ += i_4_;
				i_5_ ^= i_4_ << 8;
				i_2_ += i_5_;
				i_4_ += i_3_;
				i_4_ ^= i_3_ >>> 16;
				i_1_ += i_4_;
				i_3_ += i_2_;
				i_3_ ^= i_2_ << 10;
				i_0_ += i_3_;
				i_2_ += i_1_;
				i_2_ ^= i_1_ >>> 4;
				i_7_ += i_2_;
				i_1_ += i_0_;
				i_1_ ^= i_0_ << 8;
				i_6_ += i_1_;
				i_0_ += i_7_;
				i_0_ ^= i_7_ >>> 9;
				i_5_ += i_0_;
				i_7_ += i_6_;
				((IsaacCipher) this).anIntArray5835[i_10_] = i_7_;
				((IsaacCipher) this).anIntArray5835[i_10_ + 1] = i_6_;
				((IsaacCipher) this).anIntArray5835[i_10_ + 2] = i_5_;
				((IsaacCipher) this).anIntArray5835[i_10_ + 3] = i_4_;
				((IsaacCipher) this).anIntArray5835[4 + i_10_] = i_3_;
				((IsaacCipher) this).anIntArray5835[i_10_ + 5] = i_2_;
				((IsaacCipher) this).anIntArray5835[i_10_ + 6] = i_1_;
				((IsaacCipher) this).anIntArray5835[i_10_ + 7] = i_0_;
			}
			method6045(-548591214);
			((IsaacCipher) this).anInt5831 = 250249984;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.p(").append(')').toString());
		}
	}

	public IsaacCipher(int[] is) {
		((IsaacCipher) this).anIntArray5833 = new int[256];
		for (int i = 0; i < is.length; i++)
			((IsaacCipher) this).anIntArray5833[i] = is[i];
		method6044((byte) -31);
	}

	final void method6045(int i) {
		try {
			((IsaacCipher) this).anInt5828 += (((IsaacCipher) this).anInt5836 += -1890105143) * -31173665;
			for (int i_11_ = 0; i_11_ < 256; i_11_++) {
				int i_12_ = ((IsaacCipher) this).anIntArray5835[i_11_];
				if (0 == (i_11_ & 0x2)) {
					if (0 == (i_11_ & 0x1))
						((IsaacCipher) this).anInt5834 = (1963298753 * (-281640895 * ((IsaacCipher) this).anInt5834 ^ (((IsaacCipher) this).anInt5834 * -281640895 << 13)));
					else
						((IsaacCipher) this).anInt5834 = (1963298753 * (-281640895 * ((IsaacCipher) this).anInt5834 ^ (((IsaacCipher) this).anInt5834 * -281640895 >>> 6)));
				} else if ((i_11_ & 0x1) == 0)
					((IsaacCipher) this).anInt5834 = (1963298753 * (-281640895 * ((IsaacCipher) this).anInt5834 ^ (((IsaacCipher) this).anInt5834 * -281640895 << 2)));
				else
					((IsaacCipher) this).anInt5834 = (1963298753 * (((IsaacCipher) this).anInt5834 * -281640895 ^ (((IsaacCipher) this).anInt5834 * -281640895 >>> 16)));
				((IsaacCipher) this).anInt5834 += 1963298753 * (((IsaacCipher) this).anIntArray5835[128 + i_11_ & 0xff]);
				int i_13_;
				((IsaacCipher) this).anIntArray5835[i_11_] = i_13_ = (-281640895 * ((IsaacCipher) this).anInt5834 + ((IsaacCipher) this).anIntArray5835[(i_12_ & 0x3fc) >> 2] + ((IsaacCipher) this).anInt5828 * -1073822297);
				((IsaacCipher) this).anIntArray5833[i_11_] = (((IsaacCipher) this).anInt5828 = -739929577 * ((((IsaacCipher) this).anIntArray5835[(i_13_ >> 8 & 0x3fc) >> 2]) + i_12_)) * -1073822297;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.i(").append(')').toString());
		}
	}

	public static int method6046(int i, int i_14_) {
		try {
			i = (i >>> 1 & 0x55555555) + (i & 0x55555555);
			i = (i & 0x33333333) + (i >>> 2 & 0x33333333);
			i = i + (i >>> 4) & 0xf0f0f0f;
			i += i >>> 8;
			i += i >>> 16;
			return i & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.i(").append(')').toString());
		}
	}

	public static IndexTable method6047(CacheIndex class124, boolean bool, int i, boolean bool_15_, byte i_16_) {
		try {
			if (null == Class429.aClass282_Sub1Array4368)
				Class429.aClass282_Sub1Array4368 = new Class282_Sub1[Class158_Sub1.getCacheIndex(2008981379)];
			Class339 class339 = null;
			int i_17_ = class124.method1519((byte) 1);
			if (null != client.aClass489_6624)
				class339 = new Class339(i_17_, client.aClass489_6624, Class440.aClass489Array4481[i_17_], 1500000);
			Class429.aClass282_Sub1Array4368[i_17_] = Class422.aClass277_4322.method2732(i_17_, class339, Class207.aClass339_1952, (short) -5102);
			Class429.aClass282_Sub1Array4368[i_17_].method2819(2027024279);
			return new IndexTable(Class429.aClass282_Sub1Array4368[i_17_], bool, i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.ff(").append(')').toString());
		}
	}

	public static void method6048(String string, boolean bool, int i, int i_18_, int i_19_) {
		try {
			Class283.method2825(string, bool, i, i_18_, null, false, 12179920);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.mf(").append(')').toString());
		}
	}

	public static long method6049(CharSequence charsequence, int i) {
		try {
			int i_20_ = charsequence.length();
			long l = 0L;
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
				l = (l << 5) - l + (long) charsequence.charAt(i_21_);
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.b(").append(')').toString());
		}
	}

	static final void method6050(Class_ra class_ra, Interface_ma interface_ma, int i) {
		try {
			if (null != Class354_Sub1.aClass330_Sub36_Sub12_3497) {
				Class312.method3111((byte) 98);
				Class312.method3111((byte) 20);
				if (-1755364031 * Class354_Sub1.anInt7977 < 10) {
					if (!Class354_Sub1.aClass280_3498.method2773(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation, 553184423)) {
						Class354_Sub1.anInt7977 = (Class434.aClass280_6560.method2775((Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation), (byte) -79)) / 10 * 1160268481;
						return;
					}
					Class524.method6254((byte) -125);
					Class354_Sub1.anInt7977 = -1282217078;
				}
				if (10 == -1755364031 * Class354_Sub1.anInt7977) {
					Class354_Sub1.anInt3510 = (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9709 * 1726790277) >> 6 << 6;
					Class354_Sub1.anInt3516 = (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9704 * -841906451) >> 6 << 6;
					Class354_Sub1.anInt3524 = 64 + (((Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9706) * 68376715 >> 6 << 6) - Class354_Sub1.anInt3510);
					Class354_Sub1.anInt3513 = 64 + (((Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9712) * -2011054591 >> 6 << 6) - Class354_Sub1.anInt3516);
					int[] is = new int[3];
					int i_22_ = -1;
					int i_23_ = -1;
					Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
					Class381 class381 = client.aClass304_9030.method3022(-1817830627);
					if (Class354_Sub1.aClass330_Sub36_Sub12_3497.method3484((Class263_Sub2.myPlayer.aByte8658), (((int) class260.aFloat2716 >> 9) + class381.gameSceneBaseX * -1261027839), (-1542584207 * class381.gameSceneBaseY + ((int) class260.aFloat2711 >> 9)), is, (byte) -30)) {
						i_22_ = is[1] - Class354_Sub1.anInt3510;
						i_23_ = is[2] - Class354_Sub1.anInt3516;
					}
					if (!Class354_Sub1.aBoolean7984 && i_22_ >= 0 && i_22_ < Class354_Sub1.anInt3524 && i_23_ >= 0 && i_23_ < Class354_Sub1.anInt3513) {
						i_22_ += (int) (Math.random() * 10.0) - 5;
						i_23_ += (int) (Math.random() * 10.0) - 5;
						Class204.anInt6517 = -358183253 * i_22_;
						Class149_Sub1.anInt8867 = i_23_ * 940446489;
					} else if (-2061281777 * Class354_Sub1.anInt7982 != -1 && Class354_Sub1.anInt7978 * -373289239 != -1) {
						Class354_Sub1.aClass330_Sub36_Sub12_3497.method3481(Class354_Sub1.anInt7982 * -2061281777, -373289239 * Class354_Sub1.anInt7978, is, (byte) -82);
						if (is != null) {
							Class204.anInt6517 = -358183253 * (is[1] - Class354_Sub1.anInt3510);
							Class149_Sub1.anInt8867 = ((is[2] - Class354_Sub1.anInt3516) * 940446489);
						}
						Class354_Sub1.anInt7978 = 1620334247;
						Class354_Sub1.anInt7982 = -1547360495;
						Class354_Sub1.aBoolean7984 = false;
					} else {
						Class354_Sub1.aClass330_Sub36_Sub12_3497.method3481((Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9702) * 518332863 >> 14 & 0x3fff, 518332863 * (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9702) & 0x3fff, is, (byte) 97);
						Class204.anInt6517 = (is[1] - Class354_Sub1.anInt3510) * -358183253;
						Class149_Sub1.anInt8867 = (is[2] - Class354_Sub1.anInt3516) * 940446489;
					}
					if ((Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710 * -1315354427) == 37) {
						Class354_Sub1.aFloat3507 = 3.0F;
						Class354_Sub1.aFloat3520 = 3.0F;
					} else if (-1315354427 * (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710) == 50) {
						Class354_Sub1.aFloat3507 = 4.0F;
						Class354_Sub1.aFloat3520 = 4.0F;
					} else if (75 == (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710) * -1315354427) {
						Class354_Sub1.aFloat3507 = 6.0F;
						Class354_Sub1.aFloat3520 = 6.0F;
					} else if (-1315354427 * (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710) == 100) {
						Class354_Sub1.aFloat3507 = 8.0F;
						Class354_Sub1.aFloat3520 = 8.0F;
					} else if (200 == (Class354_Sub1.aClass330_Sub36_Sub12_3497.anInt9710) * -1315354427) {
						Class354_Sub1.aFloat3507 = 16.0F;
						Class354_Sub1.aFloat3520 = 16.0F;
					} else {
						Class354_Sub1.aFloat3507 = 8.0F;
						Class354_Sub1.aFloat3520 = 8.0F;
					}
					Class354_Sub1.anInt3521 = (int) Class354_Sub1.aFloat3507 >> 1;
					Class354_Sub1.aByteArrayArrayArray3502 = Class142.method1656(Class354_Sub1.anInt3521, 1573525299);
					Class541.method6331(271028029);
					Class354_Sub1.method4099();
					Class171.aClass471_1730 = new Class471();
					Class354_Sub1.anInt3500 += (int) (Math.random() * 5.0) - 2;
					if (Class354_Sub1.anInt3500 < -8)
						Class354_Sub1.anInt3500 = -8;
					if (Class354_Sub1.anInt3500 > 8)
						Class354_Sub1.anInt3500 = 8;
					Class354_Sub1.anInt3501 += (int) (Math.random() * 5.0) - 2;
					if (Class354_Sub1.anInt3501 < -16)
						Class354_Sub1.anInt3501 = -16;
					if (Class354_Sub1.anInt3501 > 16)
						Class354_Sub1.anInt3501 = 16;
					Class354_Sub1.method4104(interface_ma, (Class354_Sub1.anInt3500 >> 2 << 10), Class354_Sub1.anInt3501 >> 1);
					Class354_Sub1.aClass380_3529.method4391(1024, 256, -1687792028);
					Class354_Sub1.aClass552_3493.method6383(256, 256, (byte) 32);
					Class354_Sub1.aClass463_3515.method5707(4096, -1631740600);
					Class428.aClass370_4364.method4316(256, (byte) -39);
					Class354_Sub1.anInt7977 = 1730533140;
				} else if (-1755364031 * Class354_Sub1.anInt7977 == 20) {
					Class475.method5944(true, -1503225972);
					Class354_Sub1.loadMap(class_ra, Class354_Sub1.anInt3500, Class354_Sub1.anInt3501);
					Class354_Sub1.anInt7977 = 896632124;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -12);
				} else if (60 == Class354_Sub1.anInt7977 * -1755364031) {
					if (Class354_Sub1.aClass280_3498.method2769(new StringBuilder().append(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation).append("_staticelements").toString(), -690425734)) {
						if (!Class354_Sub1.aClass280_3498.method2773(new StringBuilder().append(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation).append("_staticelements").toString(), -336464278))
							return;
						Class354_Sub1.aClass351_3508 = (Class434.method5563(Class354_Sub1.aClass280_3498, new StringBuilder().append(Class354_Sub1.aClass330_Sub36_Sub12_3497.mapLocation).append("_staticelements").toString(), client.aBoolean9123, (byte) 0));
					} else
						Class354_Sub1.aClass351_3508 = new Class351(0);
					Class354_Sub1.method4089();
					Class354_Sub1.anInt7977 = -385584954;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -28);
				} else if (Class354_Sub1.anInt7977 * -1755364031 == 70) {
					Class420.aClass8_4308 = new Class8(class_ra, 11, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = -1199746807;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 87);
				} else if (Class354_Sub1.anInt7977 * -1755364031 == 73) {
					Class440.aClass8_4483 = new Class8(class_ra, 12, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = -2013908660;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -7);
				} else if (76 == Class354_Sub1.anInt7977 * -1755364031) {
					Class362.aClass8_3799 = new Class8(class_ra, 14, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 1466896783;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -41);
				} else if (Class354_Sub1.anInt7977 * -1755364031 == 79) {
					Class354_Sub1.aClass8_7985 = new Class8(class_ra, 17, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 652734930;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -117);
				} else if (82 == -1755364031 * Class354_Sub1.anInt7977) {
					Class533.aClass8_6915 = new Class8(class_ra, 19, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = -161426923;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 23);
				} else if (-1755364031 * Class354_Sub1.anInt7977 == 85) {
					Class255.aClass8_2664 = new Class8(class_ra, 22, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = -975588776;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 69);
				} else if (88 == Class354_Sub1.anInt7977 * -1755364031) {
					Class555.aClass8_6383 = new Class8(class_ra, 26, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = -1789750629;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) 93);
				} else {
					Class152.aClass8_1630 = new Class8(class_ra, 30, true, Class475.aCanvas5700);
					Class354_Sub1.anInt7977 = 62731108;
					Class475.method5944(true, -1503225972);
					Class376.method4367((byte) -38);
					System.gc();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.bh(").append(')').toString());
		}
	}

	static ClientScript method6051(Class545 class545, int i, int i_24_, byte i_25_) {
		try {
			int i_26_ = 1656426943 * class545.anInt6992 | i << 10;
			ClientScript class330_sub36_sub8 = ((ClientScript) Class424.aClass378_4326.method4377((long) i_26_ << 16));
			if (class330_sub36_sub8 != null)
				return class330_sub36_sub8;
			byte[] is = (Class543.aClass280_6255.method2761(Class543.aClass280_6255.method2768(i_26_, (byte) -61), 398431352));
			if (null != is) {
				if (is.length <= 1)
					return null;
				try {
					class330_sub36_sub8 = Class403.method4730(is, -2119755956);
				} catch (Exception exception) {
					throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_26_).toString());
				}
				class330_sub36_sub8.aClass545_9679 = class545;
				Class424.aClass378_4326.method4378(class330_sub36_sub8, (long) i_26_ << 16);
				return class330_sub36_sub8;
			}
			i_26_ = 1656426943 * class545.anInt6992 | i_24_ + 65536 << 10;
			class330_sub36_sub8 = ((ClientScript) Class424.aClass378_4326.method4377((long) i_26_ << 16));
			if (class330_sub36_sub8 != null)
				return class330_sub36_sub8;
			is = (Class543.aClass280_6255.method2761(Class543.aClass280_6255.method2768(i_26_, (byte) -77), 1686902060));
			if (null != is) {
				if (is.length <= 1)
					return null;
				try {
					class330_sub36_sub8 = Class403.method4730(is, -2139308649);
				} catch (Exception exception) {
					throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_26_).toString());
				}
				class330_sub36_sub8.aClass545_9679 = class545;
				Class424.aClass378_4326.method4378(class330_sub36_sub8, (long) i_26_ << 16);
				return class330_sub36_sub8;
			}
			i_26_ = 1656426943 * class545.anInt6992 | 0x3fffc00;
			class330_sub36_sub8 = ((ClientScript) Class424.aClass378_4326.method4377((long) i_26_ << 16));
			if (class330_sub36_sub8 != null)
				return class330_sub36_sub8;
			is = (Class543.aClass280_6255.method2761(Class543.aClass280_6255.method2768(i_26_, (byte) -88), 2035831625));
			if (is != null) {
				if (is.length <= 1)
					return null;
				try {
					class330_sub36_sub8 = Class403.method4730(is, -2027109360);
				} catch (Exception exception) {
					throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_26_).toString());
				}
				class330_sub36_sub8.aClass545_9679 = class545;
				Class424.aClass378_4326.method4378(class330_sub36_sub8, (long) i_26_ << 16);
				return class330_sub36_sub8;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.i(").append(')').toString());
		}
	}

	public static Class365 method6052(Buffer class330_sub46, int i) {
		try {
			int i_27_ = class330_sub46.readUnsignedByte(-185870809);
			int[] is = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				is[i_28_] = class330_sub46.readUnsignedByte(1026528737);
			return new Class365(is);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ue.o(").append(')').toString());
		}
	}
}
