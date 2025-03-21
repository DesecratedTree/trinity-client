/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class500 {
	public char aChar5894;

	void method6119(Buffer class330_sub46, int i, int i_0_) {
		try {
			if (i == 1)
				aChar5894 = Class127.method1546(class330_sub46.readByte((byte) 61), -1942091319);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uq.j(").append(')').toString());
		}
	}

	void method6120(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_1_ = class330_sub46.readUnsignedByte(151562798);
				if (0 == i_1_) {
					if (i == 4)
						throw new IllegalStateException();
					break;
				}
				method6119(class330_sub46, i_1_, 877846450);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uq.r(").append(')').toString());
		}
	}

	Class500() {
		/* empty */
	}

	static final void method6121(byte i) {
		try {
			Class490.method6070(971985001);
			client.aClass304_9030.method3028(-952865634);
			for (int i_2_ = 0; i_2_ < client.aClass3Array8986.length; i_2_++)
				client.aClass3Array8986[i_2_] = null;
			for (int i_3_ = 0; i_3_ < client.aClass327Array8999.length; i_3_++)
				client.aClass327Array8999[i_3_] = null;
			Class429.method5327((byte) -93);
			for (int i_4_ = 0; i_4_ < 2048; i_4_++)
				client.players[i_4_] = null;
			client.anInt9017 = 0;
			client.aClass497_9014.method6100(65280);
			client.anInt9232 = 0;
			client.aClass497_9138.method6100(65280);
			Class340.method3971(-1660984500);
			client.anInt9027 = 0;
			Class158.aClass561_6474.method6463((short) -7175);
			Class412.aClass154_4258 = null;
			CacheIndex.aClass154_1450 = null;
			Class_ra_Sub3.aClass330_Sub39_8652 = null;
			Class106.aClass330_Sub39_1009 = null;
			Class95_Sub5.aClass422_7146 = null;
			Class198.aLong1925 = 0L;
			Class513.method6194((byte) -16);
			Class_ta.method5676(-1158114613);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uq.gq(").append(')').toString());
		}
	}

	static final void method6122(byte i) {
		try {
			for (int i_5_ = Class158.aClass561_6474.method6462(true, 1103662088); i_5_ != -1; i_5_ = Class158.aClass561_6474.method6462(false, 1103662088)) {
				Class334.method3934(i_5_, (byte) 22);
				client.anIntArray9185[(client.anInt9186 += -1529535355) * 1483027533 - 1 & 0x1f] = i_5_;
			}
			for (Class330_Sub36_Sub3 class330_sub36_sub3 = Class167.method2024(-848220559); class330_sub36_sub3 != null; class330_sub36_sub3 = Class167.method2024(-848220559)) {
				int i_6_ = class330_sub36_sub3.method3446((byte) 2);
				long l = class330_sub36_sub3.method3448(1898035200);
				if (1 == i_6_) {
					Class555.anIntArray6382[(int) l] = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1544632969;
					client.aBoolean9206 |= Class330_Sub26.aBooleanArray7696[(int) l];
					client.anIntArray9237[((client.anInt9192 += -1165018713) * 740679191) - 1 & 0x1f] = (int) l;
				} else if (2 == i_6_) {
					Class258.aStringArray2710[(int) l] = (((Class330_Sub36_Sub3) class330_sub36_sub3).aString9649);
					client.anIntArray9193[((client.anInt9142 += 529737475) * -1876427861) - 1 & 0x1f] = (int) l;
				} else if (i_6_ == 3) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 1601248574);
					if (((Class330_Sub36_Sub3) class330_sub36_sub3) != null && iComponentDefinitions != null) {
						if (!((Class330_Sub36_Sub3) class330_sub36_sub3).aString9649.equals(iComponentDefinitions.aString1266)) {
							iComponentDefinitions.aString1266 = (((Class330_Sub36_Sub3) class330_sub36_sub3).aString9649);
							Class404.method4738(iComponentDefinitions, 922283701);
						}
					}
				} else if (22 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 199092072);
					if ((-1544632969 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 == 1) != iComponentDefinitions.aBoolean1357) {
						iComponentDefinitions.aBoolean1357 = (-1544632969 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 == 1);
						Class404.method4738(iComponentDefinitions, 469126614);
					}
				} else if (4 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, -1625063960);
					int i_7_ = ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1544632969);
					int i_8_ = (-1486813275 * (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626));
					int i_9_ = (-873042695 * (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9627));
					if (i_7_ != iComponentDefinitions.anInt1238 * -276075115 || -1576413395 * iComponentDefinitions.anInt1239 != i_8_ || iComponentDefinitions.anInt1240 * -591748167 != i_9_) {
						iComponentDefinitions.anInt1238 = i_7_ * 743404989;
						iComponentDefinitions.anInt1239 = -1266970459 * i_8_;
						iComponentDefinitions.anInt1240 = -2082049399 * i_9_;
						iComponentDefinitions.aClass538_1362 = null;
						Class404.method4738(iComponentDefinitions, 1208498697);
					}
				} else if (i_6_ == 5) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, -505975534);
					if (-1544632969 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 != iComponentDefinitions.anInt1345 * 53799397) {
						if ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1544632969 != -1) {
							if (null == iComponentDefinitions.aClass477_1344)
								iComponentDefinitions.aClass477_1344 = new Class477_Sub1();
							iComponentDefinitions.aClass477_1344.method5988(-1544632969 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629, (byte) 31);
						} else
							iComponentDefinitions.aClass477_1344 = null;
						iComponentDefinitions.anInt1345 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * 1115016235;
						Class404.method4738(iComponentDefinitions, 357465935);
					}
				} else if (i_6_ == 6) {
					int i_10_ = (-1544632969 * (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629));
					int i_11_ = i_10_ >> 10 & 0x1f;
					int i_12_ = i_10_ >> 5 & 0x1f;
					int i_13_ = i_10_ & 0x1f;
					int i_14_ = (i_11_ << 19) + (i_12_ << 11) + (i_13_ << 3);
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, -1343592928);
					if (-421168987 * iComponentDefinitions.anInt1224 != i_14_) {
						iComponentDefinitions.anInt1224 = 597536557 * i_14_;
						Class404.method4738(iComponentDefinitions, 773218967);
					}
				} else if (7 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 1025372923);
					boolean bool = 1 == -1544632969 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629;
					if (iComponentDefinitions.aBoolean1215 != bool) {
						iComponentDefinitions.aBoolean1215 = bool;
						Class404.method4738(iComponentDefinitions, 1609679141);
					}
				} else if (8 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 1837215512);
					if ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 * -1544632969) != -76375931 * iComponentDefinitions.anInt1296 || ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626) * -1486813275 != iComponentDefinitions.anInt1245 * 2005289635) || ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9627) * -873042695 != -1843384083 * iComponentDefinitions.anInt1354)) {
						iComponentDefinitions.anInt1296 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1119697717;
						iComponentDefinitions.anInt1245 = -1737584361 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626;
						iComponentDefinitions.anInt1354 = 157796029 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9627;
						if (iComponentDefinitions.anInt1335 * -1053848421 != -1) {
							if (-1329832751 * iComponentDefinitions.anInt1290 > 0)
								iComponentDefinitions.anInt1354 = -1341543195 * (1141251488 * iComponentDefinitions.anInt1354 / (iComponentDefinitions.anInt1290 * -1329832751));
							else if (iComponentDefinitions.anInt1346 * 2044329613 > 0)
								iComponentDefinitions.anInt1354 = -1341543195 * (1141251488 * iComponentDefinitions.anInt1354 / (iComponentDefinitions.anInt1346 * 2044329613));
						}
						Class404.method4738(iComponentDefinitions, 1216291359);
					}
				} else if (9 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 465014860);
					if ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 * -1544632969) != iComponentDefinitions.anInt1335 * -1053848421 || (-1486813275 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626 != iComponentDefinitions.anInt1336 * 115606283)) {
						iComponentDefinitions.anInt1335 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * 598843989;
						iComponentDefinitions.anInt1336 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626) * 737594895;
						Class404.method4738(iComponentDefinitions, 1343401842);
					}
				} else if (10 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, -1006727191);
					if ((iComponentDefinitions.anInt1321 * -106182925 != (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1544632969) || (iComponentDefinitions.anInt1243 * 1080667159 != -1486813275 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626) || (-873042695 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9627 != iComponentDefinitions.anInt1248 * 843208871)) {
						iComponentDefinitions.anInt1321 = 401387629 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629;
						iComponentDefinitions.anInt1243 = 138105763 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626;
						iComponentDefinitions.anInt1248 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9627) * -603578017;
						Class404.method4738(iComponentDefinitions, 2001539798);
					}
				} else if (i_6_ == 11) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, -404958945);
					iComponentDefinitions.aByte1200 = (byte) 0;
					iComponentDefinitions.anInt1329 = (iComponentDefinitions.anInt1192 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * 266615097) * 956518815;
					iComponentDefinitions.aByte1201 = (byte) 0;
					iComponentDefinitions.anInt1209 = (iComponentDefinitions.anInt1324 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626) * 1858816759) * 2098734779;
					Class404.method4738(iComponentDefinitions, 1999132746);
				} else if (12 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 1972991712);
					int i_15_ = ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1544632969);
					if (iComponentDefinitions != null && 0 == 1849136745 * iComponentDefinitions.anInt1198) {
						if (i_15_ > (-284059687 * iComponentDefinitions.anInt1223 - 694142557 * iComponentDefinitions.anInt1348))
							i_15_ = (iComponentDefinitions.anInt1223 * -284059687 - 694142557 * iComponentDefinitions.anInt1348);
						if (i_15_ < 0)
							i_15_ = 0;
						if (iComponentDefinitions.anInt1221 * 742281531 != i_15_) {
							iComponentDefinitions.anInt1221 = i_15_ * 383541235;
							Class404.method4738(iComponentDefinitions, 1833708129);
						}
					}
				} else if (i_6_ == 14) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 943716427);
					iComponentDefinitions.anInt1229 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1005987687;
				} else if (i_6_ == 15) {
					Class9.aBoolean141 = true;
					Class9.anInt146 = -1121298701 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629;
					Class9.anInt151 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626) * 842298259;
				} else if (i_6_ == 16) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, -1367726127);
					iComponentDefinitions.anInt1264 = 1609747211 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629;
				} else if (20 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 99913265);
					iComponentDefinitions.aBoolean1265 = -1544632969 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 == 1;
				} else if (i_6_ == 21) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, -96112799);
					iComponentDefinitions.aBoolean1237 = 1 == -1544632969 * ((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629;
				} else if (i_6_ == 17) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 1787759762);
					iComponentDefinitions.anInt1292 = (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -2019031517;
				} else if (18 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 701545310);
					int i_16_ = (int) (l >> 32);
					iComponentDefinitions.method1391(i_16_, (short) (-1544632969 * (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629)), (short) ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626) * -1486813275), (byte) -81);
				} else if (19 == i_6_) {
					IComponentDefinitions iComponentDefinitions = Class95.method1101((int) l, 952203099);
					int i_17_ = (int) (l >> 32);
					iComponentDefinitions.method1401(i_17_, (short) ((((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629) * -1544632969), (short) (-1486813275 * (((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626)), 2002592125);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uq.gt(").append(')').toString());
		}
	}
}
