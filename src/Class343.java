/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class343 {
	int anInt3400;
	static int anInt3401 = 70;
	public int anInt3402 = -682452573;
	public int anInt3403;
	public int anInt3404;
	int anInt3405;
	Class341 aClass341_3406;
	int anInt3407;
	public int anInt3408;
	int anInt3409;
	public int anInt3410 = 896904269;

	Class343() {
		anInt3404 = 443203305;
		anInt3403 = -1272622243;
		anInt3408 = 1628199618;
		((Class343) this).anInt3407 = -1194305465;
		((Class343) this).anInt3400 = -872664395;
		((Class343) this).anInt3409 = 603065347;
		((Class343) this).anInt3405 = 96873297;
	}

	void method3992(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(942304020);
				if (0 == i_0_) {
					if (i >= 16711680)
						throw new IllegalStateException();
					break;
				}
				method3998(class330_sub46, i_0_, 2099435777);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.r(").append(')').toString());
		}
	}

	public Class61 method3993(Class_ra class_ra, int i) {
		try {
			if (1211903625 * ((Class343) this).anInt3407 < 0)
				return null;
			Class61 class61 = ((Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (((Class343) this).anInt3407 * 1211903625))));
			if (null == class61) {
				method3996(class_ra, (byte) 70);
				class61 = (Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (1211903625 * ((Class343) this).anInt3407)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.i(").append(')').toString());
		}
	}

	public Class61 method3994(Class_ra class_ra, byte i) {
		try {
			if (((Class343) this).anInt3400 * 899765347 < 0)
				return null;
			Class61 class61 = ((Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (((Class343) this).anInt3400 * 899765347))));
			if (null == class61) {
				method3996(class_ra, (byte) 91);
				class61 = (Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (((Class343) this).anInt3400 * 899765347)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.p(").append(')').toString());
		}
	}

	public Class61 method3995(Class_ra class_ra, byte i) {
		try {
			if (249692751 * ((Class343) this).anInt3405 < 0)
				return method3994(class_ra, (byte) 69);
			Class61 class61 = ((Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (249692751 * ((Class343) this).anInt3405))));
			if (class61 == null) {
				method3996(class_ra, (byte) 122);
				class61 = (Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (((Class343) this).anInt3405 * 249692751)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.s(").append(')').toString());
		}
	}

	void method3996(Class_ra class_ra, byte i) {
		try {
			IndexTable class280 = ((Class341) ((Class343) this).aClass341_3406).aClass280_3396;
			if (((Class343) this).anInt3407 * 1211903625 >= 0 && ((((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (((Class343) this).anInt3407 * 1211903625))) == null) && class280.method2750((1211903625 * ((Class343) this).anInt3407), 5598017)) {
				Class87 class87 = Class53.method640(class280, (1211903625 * ((Class343) this).anInt3407));
				((Class341) ((Class343) this).aClass341_3406).aClass367_3393.put(class_ra.bw(class87, true), (long) (1211903625 * ((Class343) this).anInt3407));
			}
			if (((Class343) this).anInt3400 * 899765347 >= 0 && (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (899765347 * ((Class343) this).anInt3400))) == null && class280.method2750(((Class343) this).anInt3400 * 899765347, 1178091840)) {
				Class87 class87 = Class53.method640(class280, (899765347 * ((Class343) this).anInt3400));
				((Class341) ((Class343) this).aClass341_3406).aClass367_3393.put(class_ra.bw(class87, true), (long) (((Class343) this).anInt3400 * 899765347));
			}
			if (((Class343) this).anInt3409 * 1110573397 >= 0 && ((((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (1110573397 * ((Class343) this).anInt3409))) == null) && class280.method2750((((Class343) this).anInt3409 * 1110573397), 2057365049)) {
				Class87 class87 = Class53.method640(class280, (1110573397 * ((Class343) this).anInt3409));
				((Class341) ((Class343) this).aClass341_3406).aClass367_3393.put(class_ra.bw(class87, true), (long) (((Class343) this).anInt3409 * 1110573397));
			}
			if (249692751 * ((Class343) this).anInt3405 >= 0 && (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (249692751 * ((Class343) this).anInt3405))) == null && class280.method2750(((Class343) this).anInt3405 * 249692751, -1397622600)) {
				Class87 class87 = Class53.method640(class280, (249692751 * ((Class343) this).anInt3405));
				((Class341) ((Class343) this).aClass341_3406).aClass367_3393.put(class_ra.bw(class87, true), (long) (((Class343) this).anInt3405 * 249692751));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.f(").append(')').toString());
		}
	}

	public Class61 method3997(Class_ra class_ra, int i) {
		try {
			if (((Class343) this).anInt3409 * 1110573397 < 0)
				return method3993(class_ra, -1457902513);
			Class61 class61 = ((Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (1110573397 * ((Class343) this).anInt3409))));
			if (class61 == null) {
				method3996(class_ra, (byte) 55);
				class61 = (Class61) (((Class341) ((Class343) this).aClass341_3406).aClass367_3393.get((long) (((Class343) this).anInt3409 * 1110573397)));
			}
			return class61;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.o(").append(')').toString());
		}
	}

	void method3998(Buffer class330_sub46, int i, int i_1_) {
		try {
			if (i == 1)
				class330_sub46.readUnsignedShort(1231399509);
			else if (2 == i)
				anInt3402 = class330_sub46.readUnsignedByte(1554118640) * -1720663203;
			else if (3 == i)
				anInt3410 = class330_sub46.readUnsignedByte(204258058) * 1536231091;
			else if (4 == i)
				anInt3404 = 0;
			else if (i == 5)
				anInt3408 = class330_sub46.readUnsignedShort(546892687) * -774376789;
			else if (i == 6)
				class330_sub46.readUnsignedByte(544335161);
			else if (7 == i)
				((Class343) this).anInt3407 = class330_sub46.readBigSmart(-539619645) * 1194305465;
			else if (i == 8)
				((Class343) this).anInt3400 = class330_sub46.readBigSmart(-1081524480) * 872664395;
			else if (9 == i)
				((Class343) this).anInt3409 = class330_sub46.readBigSmart(-897982363) * -603065347;
			else if (i == 10)
				((Class343) this).anInt3405 = class330_sub46.readBigSmart(-1541792050) * -96873297;
			else if (11 == i)
				anInt3404 = class330_sub46.readUnsignedShort(568650462) * -443203305;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.j(").append(')').toString());
		}
	}

	static final void method3999(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class263.method2614((char) i_2_, -546641566) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.aae(").append(')').toString());
		}
	}

	static String method4000(long l, int i, int i_3_) {
		try {
			Class452.method5637(l);
			int i_4_ = Class528.aCalendar6215.get(5);
			int i_5_ = Class528.aCalendar6215.get(2) + 1;
			int i_6_ = Class528.aCalendar6215.get(1);
			return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("/").append(i_5_ / 10).append(i_5_ % 10).append("/").append(i_6_ % 100 / 10).append(i_6_ % 10).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.p(").append(')').toString());
		}
	}

	public static void method4001(int i, int i_7_, int i_8_, int i_9_) {
		try {
			Class381 class381 = client.aClass304_9030.method3022(1236678797);
			int i_10_ = i_7_ + -1261027839 * class381.gameSceneBaseX;
			int i_11_ = -1542584207 * class381.gameSceneBaseY + i_8_;
			if (client.aClass304_9030.method3023(-400722441) != null && (client.aClass304_9030.method2985(-2137909458) != OutgoingPacketManager.aClass310_3212) && i_7_ >= 0 && i_8_ >= 0 && i_7_ < client.aClass304_9030.method2990(-1338682676) && i_8_ < client.aClass304_9030.method3033((byte) -61)) {
				long l = (long) (i << 28 | i_11_ << 14 | i_10_);
				Class330_Sub9 class330_sub9 = (Class330_Sub9) client.aClass497_9138.method6094(l);
				if (null == class330_sub9)
					client.aClass304_9030.method3023(-400722441).method4151(i, i_7_, i_8_, 380985859);
				else {
					Class330_Sub3 class330_sub3 = ((Class330_Sub3) class330_sub9.aClass471_7573.method5869(539664854));
					if (class330_sub3 == null)
						client.aClass304_9030.method3023(-400722441).method4151(i, i_7_, i_8_, 2017609898);
					else {
						Class432_Sub1_Sub2_Sub1 class432_sub1_sub2_sub1 = ((Class432_Sub1_Sub2_Sub1) client.aClass304_9030.method3023(-400722441).method4151(i, i_7_, i_8_, 1675110866));
						if (null == class432_sub1_sub2_sub1)
							class432_sub1_sub2_sub1 = (new Class432_Sub1_Sub2_Sub1(client.aClass304_9030.method3023(-400722441), i_7_ << 265, client.aClass304_9030.method3023(-400722441).aClass_xaArray3676[i].method6417(i_7_, i_8_, 2111540853), i_8_ << 265, i, i));
						else {
							Class432_Sub1_Sub2_Sub1 class432_sub1_sub2_sub1_12_ = class432_sub1_sub2_sub1;
							class432_sub1_sub2_sub1.anInt10211 = 1612123175;
							class432_sub1_sub2_sub1_12_.anInt10207 = -712872217;
							class432_sub1_sub2_sub1.aClass356_8655 = client.aClass304_9030.method3023(-400722441);
						}
						class432_sub1_sub2_sub1.anInt10217 = 1873050943 * class330_sub3.anInt7513;
						class432_sub1_sub2_sub1.anInt10208 = (((Class330_Sub3) class330_sub3).anInt7512 * -499646395);
						while_90_: do {
							Class330_Sub3 class330_sub3_13_;
							while_89_: do {
								do {
									class330_sub3_13_ = ((Class330_Sub3) class330_sub9.aClass471_7573.method5873((byte) -72));
									if (class330_sub3_13_ == null) {
										if (i_9_ == -334637075)
											break while_90_;
										break;
									}
									if ((-862355691 * class330_sub3_13_.anInt7513) != (class432_sub1_sub2_sub1.anInt10217 * 670214827))
										break while_89_;
								} while (i_9_ == -334637075);
								return;
							} while (false);
							class432_sub1_sub2_sub1.anInt10207 = class330_sub3_13_.anInt7513 * 1798917645;
							class432_sub1_sub2_sub1.anInt10210 = 530423125 * ((Class330_Sub3) class330_sub3_13_).anInt7512;
							for (;;) {
								Class330_Sub3 class330_sub3_14_ = ((Class330_Sub3) class330_sub9.aClass471_7573.method5873((byte) -4));
								if (class330_sub3_14_ == null) {
									if (i_9_ == -334637075)
										break;
									return;
								}
								if ((670214827 * class432_sub1_sub2_sub1.anInt10217) != (class330_sub3_14_.anInt7513 * -862355691)) {
									if ((class432_sub1_sub2_sub1.anInt10207 * -60081367) == (class330_sub3_14_.anInt7513 * -862355691)) {
										if (i_9_ != -334637075) {
											/* empty */
										}
									} else {
										class432_sub1_sub2_sub1.anInt10211 = (1472571341 * class330_sub3_14_.anInt7513);
										class432_sub1_sub2_sub1.anInt10212 = 767235871 * (((Class330_Sub3) class330_sub3_14_).anInt7512);
									}
								}
							}
						} while (false);
						int i_15_ = Class431.method5342((i_7_ << 9) + 256, (i_8_ << 9) + 256, i, 1996761881);
						class432_sub1_sub2_sub1.method5348((float) (i_7_ << 265), (float) i_15_, (float) (i_8_ << 265));
						class432_sub1_sub2_sub1.anInt10213 = 0;
						class432_sub1_sub2_sub1.aByte8658 = (byte) i;
						class432_sub1_sub2_sub1.aByte8654 = (byte) i;
						if (client.aClass304_9030.method2995(1945924571).method2788(i_7_, i_8_, (byte) -48))
							class432_sub1_sub2_sub1.aByte8654++;
						client.aClass304_9030.method3023(-400722441).method4143(i, i_7_, i_8_, i_15_, class432_sub1_sub2_sub1, 1689004629);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oh.jv(").append(')').toString());
		}
	}
}
