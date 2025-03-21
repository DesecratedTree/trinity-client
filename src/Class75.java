/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class75 {
	public String aString646;
	public String aString647;
	public boolean aBoolean648;

	Class75() {
		/* empty */
	}

	static final boolean method847(int i, int i_0_, Class366 class366, Class307 class307, short i_1_) {
		try {
			int i_2_ = i;
			int i_3_ = i_0_;
			int i_4_ = 64;
			int i_5_ = 64;
			int i_6_ = i - i_4_;
			int i_7_ = i_0_ - i_5_;
			Class295.anIntArrayArray3015[i_4_][i_5_] = 99;
			Class295.anIntArrayArray3019[i_4_][i_5_] = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			Class295.anIntArray3013[i_8_] = i_2_;
			Class295.anIntArray3020[i_8_++] = i_3_;
			int[][] is = class307.anIntArrayArray3166;
			while (i_8_ != i_9_) {
				i_2_ = Class295.anIntArray3013[i_9_];
				i_3_ = Class295.anIntArray3020[i_9_];
				i_9_ = i_9_ + 1 & 0xfff;
				i_4_ = i_2_ - i_6_;
				i_5_ = i_3_ - i_7_;
				int i_10_ = i_2_ - 1241210193 * class307.anInt3162;
				int i_11_ = i_3_ - 1001570543 * class307.anInt3163;
				if (class366.method4274(1, i_2_, i_3_, class307, -1782960669)) {
					Class295.anInt3017 = i_2_ * -394834289;
					Class202.anInt1936 = i_3_ * 505306171;
					return true;
				}
				int i_12_ = Class295.anIntArrayArray3019[i_4_][i_5_] + 1;
				if (i_4_ > 0 && Class295.anIntArrayArray3015[i_4_ - 1][i_5_] == 0 && 0 == (is[i_10_ - 1][i_11_] & 0x42240000)) {
					Class295.anIntArray3013[i_8_] = i_2_ - 1;
					Class295.anIntArray3020[i_8_] = i_3_;
					i_8_ = 1 + i_8_ & 0xfff;
					Class295.anIntArrayArray3015[i_4_ - 1][i_5_] = 2;
					Class295.anIntArrayArray3019[i_4_ - 1][i_5_] = i_12_;
				}
				if (i_4_ < 127 && 0 == Class295.anIntArrayArray3015[i_4_ + 1][i_5_] && (is[i_10_ + 1][i_11_] & 0x60240000) == 0) {
					Class295.anIntArray3013[i_8_] = i_2_ + 1;
					Class295.anIntArray3020[i_8_] = i_3_;
					i_8_ = 1 + i_8_ & 0xfff;
					Class295.anIntArrayArray3015[i_4_ + 1][i_5_] = 8;
					Class295.anIntArrayArray3019[1 + i_4_][i_5_] = i_12_;
				}
				if (i_5_ > 0 && 0 == Class295.anIntArrayArray3015[i_4_][i_5_ - 1] && 0 == (is[i_10_][i_11_ - 1] & 0x40a40000)) {
					Class295.anIntArray3013[i_8_] = i_2_;
					Class295.anIntArray3020[i_8_] = i_3_ - 1;
					i_8_ = i_8_ + 1 & 0xfff;
					Class295.anIntArrayArray3015[i_4_][i_5_ - 1] = 1;
					Class295.anIntArrayArray3019[i_4_][i_5_ - 1] = i_12_;
				}
				if (i_5_ < 127 && 0 == Class295.anIntArrayArray3015[i_4_][i_5_ + 1] && 0 == (is[i_10_][1 + i_11_] & 0x48240000)) {
					Class295.anIntArray3013[i_8_] = i_2_;
					Class295.anIntArray3020[i_8_] = i_3_ + 1;
					i_8_ = 1 + i_8_ & 0xfff;
					Class295.anIntArrayArray3015[i_4_][i_5_ + 1] = 4;
					Class295.anIntArrayArray3019[i_4_][i_5_ + 1] = i_12_;
				}
				if (i_4_ > 0 && i_5_ > 0 && Class295.anIntArrayArray3015[i_4_ - 1][i_5_ - 1] == 0 && (is[i_10_ - 1][i_11_ - 1] & 0x43a40000) == 0 && 0 == (is[i_10_ - 1][i_11_] & 0x42240000) && 0 == (is[i_10_][i_11_ - 1] & 0x40a40000)) {
					Class295.anIntArray3013[i_8_] = i_2_ - 1;
					Class295.anIntArray3020[i_8_] = i_3_ - 1;
					i_8_ = i_8_ + 1 & 0xfff;
					Class295.anIntArrayArray3015[i_4_ - 1][i_5_ - 1] = 3;
					Class295.anIntArrayArray3019[i_4_ - 1][i_5_ - 1] = i_12_;
				}
				if (i_4_ < 127 && i_5_ > 0 && 0 == Class295.anIntArrayArray3015[1 + i_4_][i_5_ - 1] && (is[1 + i_10_][i_11_ - 1] & 0x60e40000) == 0 && (is[i_10_ + 1][i_11_] & 0x60240000) == 0 && (is[i_10_][i_11_ - 1] & 0x40a40000) == 0) {
					Class295.anIntArray3013[i_8_] = 1 + i_2_;
					Class295.anIntArray3020[i_8_] = i_3_ - 1;
					i_8_ = i_8_ + 1 & 0xfff;
					Class295.anIntArrayArray3015[1 + i_4_][i_5_ - 1] = 9;
					Class295.anIntArrayArray3019[i_4_ + 1][i_5_ - 1] = i_12_;
				}
				if (i_4_ > 0 && i_5_ < 127 && 0 == Class295.anIntArrayArray3015[i_4_ - 1][1 + i_5_] && (is[i_10_ - 1][i_11_ + 1] & 0x4e240000) == 0 && (is[i_10_ - 1][i_11_] & 0x42240000) == 0 && (is[i_10_][1 + i_11_] & 0x48240000) == 0) {
					Class295.anIntArray3013[i_8_] = i_2_ - 1;
					Class295.anIntArray3020[i_8_] = 1 + i_3_;
					i_8_ = i_8_ + 1 & 0xfff;
					Class295.anIntArrayArray3015[i_4_ - 1][1 + i_5_] = 6;
					Class295.anIntArrayArray3019[i_4_ - 1][1 + i_5_] = i_12_;
				}
				if (i_4_ < 127 && i_5_ < 127 && Class295.anIntArrayArray3015[1 + i_4_][1 + i_5_] == 0 && (is[i_10_ + 1][i_11_ + 1] & 0x78240000) == 0 && (is[i_10_ + 1][i_11_] & 0x60240000) == 0 && (is[i_10_][1 + i_11_] & 0x48240000) == 0) {
					Class295.anIntArray3013[i_8_] = i_2_ + 1;
					Class295.anIntArray3020[i_8_] = 1 + i_3_;
					i_8_ = i_8_ + 1 & 0xfff;
					Class295.anIntArrayArray3015[1 + i_4_][i_5_ + 1] = 12;
					Class295.anIntArrayArray3019[1 + i_4_][1 + i_5_] = i_12_;
				}
			}
			Class295.anInt3017 = -394834289 * i_2_;
			Class202.anInt1936 = i_3_ * 505306171;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.j(").append(')').toString());
		}
	}

	public static void method848(Class545 class545, int i, int i_13_, Class410 class410, Class432_Sub1_Sub2_Sub1 class432_sub1_sub2_sub1, byte i_14_) {
		try {
			Class430 class430 = Class325_Sub6.method3229((byte) 69);
			((Class430) class430).aClass432_Sub1_Sub2_Sub1_4390 = class432_sub1_sub2_sub1;
			Class217.method2252(class545, i, i_13_, class430, -1808665712);
			((Class430) class430).aClass432_Sub1_Sub2_Sub1_4390 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.w(").append(')').toString());
		}
	}

	static final void method849(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 1688032175 * ((Class430) class430).aClass154_4391.anInt1655;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.xz(").append(')').toString());
		}
	}

	static final void method850(Class430 class430, int i) {
		try {
			Class474.method5921((((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]), (short) 2954);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.aij(").append(')').toString());
		}
	}

	static final void method851(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4378 -= -119156554;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class145.method1725((String) (((Class430) class430).anObjectArray4386[-1378875437 * ((Class430) class430).anInt4378]), ((String) (((Class430) class430).anObjectArray4386[1 + -1378875437 * ((Class430) class430).anInt4378])), Class429.aClass454_4369, -1715912811));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.aag(").append(')').toString());
		}
	}

	static void method852(int i) {
		try {
			try {
				File file = new File(Class291.aString2978, "random.dat");
				if (file.exists())
					Class332.aClass489_6607 = new Class489(new Class490(file, "rw", 25L), 24, 0);
				else {
					while_65_: for (int i_15_ = 0; i_15_ < Class22.aStringArray303.length; i_15_++) {
						for (int i_16_ = 0; i_16_ < Class455.aStringArray5562.length; i_16_++) {
							File file_17_ = new File(new StringBuilder().append(Class455.aStringArray5562[i_16_]).append(Class22.aStringArray303[i_15_]).append(File.separatorChar).append("random.dat").toString());
							if (file_17_.exists()) {
								Class332.aClass489_6607 = new Class489(new Class490(file_17_, "rw", 25L), 24, 0);
								break while_65_;
							}
						}
					}
				}
				if (Class332.aClass489_6607 == null) {
					RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
					int i_18_ = randomaccessfile.read();
					randomaccessfile.seek(0L);
					randomaccessfile.write(i_18_);
					randomaccessfile.seek(0L);
					randomaccessfile.close();
					Class332.aClass489_6607 = new Class489(new Class490(file, "rw", 25L), 24, 0);
				}
			} catch (IOException ioexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.w(").append(')').toString());
		}
	}

	static final void method853(int i) {
		try {
			for (Class330_Sub36_Sub11 class330_sub36_sub11 = ((Class330_Sub36_Sub11) client.aClass471_9139.method5869(539664854)); class330_sub36_sub11 != null; class330_sub36_sub11 = ((Class330_Sub36_Sub11) client.aClass471_9139.method5873((byte) -82))) {
				Class432_Sub1_Sub1_Sub2 class432_sub1_sub1_sub2 = (((Class330_Sub36_Sub11) class330_sub36_sub11).aClass432_Sub1_Sub1_Sub2_9701);
				if (client.anInt8981 * 822953439 > class432_sub1_sub1_sub2.anInt10182 * -1776891881) {
					class330_sub36_sub11.method3252(-1787429507);
					class432_sub1_sub1_sub2.method5497(9256887);
				} else if (client.anInt8981 * 822953439 >= (class432_sub1_sub1_sub2.anInt10179 * 1044517639)) {
					class432_sub1_sub1_sub2.method5493((byte) -72);
					if (-1801876571 * class432_sub1_sub1_sub2.anInt10184 > 0) {
						if (0 == client.anInt8987 * 1909266069) {
							Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class96.aClass85Array854[-1801876571 * (class432_sub1_sub1_sub2.anInt10184) - 1].method973(-1160484525);
							if (class432_sub1_sub1_sub1 != null) {
								Class260 class260 = (class432_sub1_sub1_sub1.method5346().aClass260_2606);
								if ((int) class260.aFloat2716 >= 0 && ((int) class260.aFloat2716 < client.aClass304_9030.method2990(-1697203109) * 512) && (int) class260.aFloat2711 >= 0 && ((int) class260.aFloat2711 < client.aClass304_9030.method3033((byte) -70) * 512))
									class432_sub1_sub1_sub2.method5498((int) class260.aFloat2716, (int) class260.aFloat2711, ((Class431.method5342((int) class260.aFloat2716, (int) class260.aFloat2711, class432_sub1_sub1_sub1.aByte8658, 1996761881)) - (class432_sub1_sub1_sub2.anInt10178 * -659628227)), client.anInt8981 * 822953439, 1398240737);
							}
						} else {
							Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) ((-1801876571 * (class432_sub1_sub1_sub2.anInt10184)) - 1))));
							if (class330_sub35 != null) {
								NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
								Class260 class260 = (class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
								if ((int) class260.aFloat2716 >= 0 && ((int) class260.aFloat2716 < client.aClass304_9030.method2990(-515537512) * 512) && (int) class260.aFloat2711 >= 0 && ((int) class260.aFloat2711 < client.aClass304_9030.method3033((byte) -119) * 512))
									class432_sub1_sub1_sub2.method5498((int) class260.aFloat2716, (int) class260.aFloat2711, ((Class431.method5342((int) class260.aFloat2716, (int) class260.aFloat2711, class432_sub1_sub1_sub2.aByte8658, 1996761881)) - (-659628227 * (class432_sub1_sub1_sub2.anInt10178))), client.anInt8981 * 822953439, 1691767688);
							}
						}
					}
					if (class432_sub1_sub1_sub2.anInt10184 * -1801876571 < 0) {
						int i_19_ = (-(class432_sub1_sub1_sub2.anInt10184 * -1801876571) - 1);
						Player class432_sub1_sub1_sub1_sub1;
						if (i_19_ == 1478725729 * client.anInt9121)
							class432_sub1_sub1_sub1_sub1 = (Class263_Sub2.myPlayer);
						else
							class432_sub1_sub1_sub1_sub1 = (client.players[i_19_]);
						if (class432_sub1_sub1_sub1_sub1 != null) {
							Class260 class260 = (class432_sub1_sub1_sub1_sub1.method5346().aClass260_2606);
							if ((int) class260.aFloat2716 >= 0 && ((int) class260.aFloat2716 < client.aClass304_9030.method2990(-1326666353) * 512) && (int) class260.aFloat2711 >= 0 && ((int) class260.aFloat2711 < client.aClass304_9030.method3033((byte) -77) * 512))
								class432_sub1_sub1_sub2.method5498((int) class260.aFloat2716, (int) class260.aFloat2711, ((Class431.method5342((int) class260.aFloat2716, (int) class260.aFloat2711, class432_sub1_sub1_sub2.aByte8658, 1996761881)) - -659628227 * (class432_sub1_sub1_sub2.anInt10178)), 822953439 * client.anInt8981, 564185227);
						}
					}
					class432_sub1_sub1_sub2.method5494(1872757809 * client.anInt9210, 444801972);
					client.aClass304_9030.method3023(-400722441).method4145(class432_sub1_sub1_sub2, true, 164771788);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.iy(").append(')').toString());
		}
	}

	public static final void method854(Class330_Sub48 class330_sub48, boolean bool, boolean bool_20_, int i) {
		try {
			int i_21_ = class330_sub48.anInt7859 * 856598855;
			int i_22_ = (int) (-6154793640677333111L * class330_sub48.aLong3341);
			class330_sub48.method3252(305076370);
			if (bool)
				Class308.method3091(i_21_, (byte) 32);
			Class432_Sub1_Sub1_Sub6.method5514(i_21_, 1965374521);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_22_, 2100183725);
			if (null != iComponentDefinitions)
				Class404.method4738(iComponentDefinitions, 1602850388);
			Class70.method818(-239640105);
			if (!bool_20_ && -1 != 1522181389 * client.windowPaneId)
				Class527.method6268(1522181389 * client.windowPaneId, 1, (byte) 94);
			Class508 class508 = new Class508(client.aClass497_9284);
			for (Class330_Sub48 class330_sub48_23_ = (Class330_Sub48) class508.method6156(257803485); null != class330_sub48_23_; class330_sub48_23_ = (Class330_Sub48) class508.next()) {
				if (!class330_sub48_23_.method3251(122249317)) {
					class330_sub48_23_ = (Class330_Sub48) class508.method6156(257803485);
					if (null == class330_sub48_23_) {
						if (i >= 662709241) {
							/* empty */
						}
						break;
					}
				}
				if (3 == class330_sub48_23_.anInt7860 * -1972674867) {
					int i_24_ = (int) (-6154793640677333111L * class330_sub48_23_.aLong3341);
					if (i_21_ == i_24_ >>> 16)
						method854(class330_sub48_23_, true, bool_20_, -294851699);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("d.lg(").append(')').toString());
		}
	}
}
