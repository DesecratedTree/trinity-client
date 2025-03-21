/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class403 {
	static Class111 aClass111_4138;

	Class403() throws Throwable {
		throw new Error();
	}

	static final void method4727(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_0_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			boolean bool = ((((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]) == 1);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub23_7908), i_0_, -2004622175);
			if (!bool)
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub16_7900, 0, 889855724);
			Class435.method5568(1302531203);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qs.akv(").append(')').toString());
		}
	}

	public static void method4728(int i) {
		try {
			Class520.aClass471_6016 = new Class471();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qs.r(").append(')').toString());
		}
	}

	static final void method4729(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_1_, 1258927588);
			Class120 class120 = Class3.aClass120Array56[i_1_ >> 16];
			Class363.method4258(iComponentDefinitions, class120, class430, (byte) -119);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qs.lk(").append(')').toString());
		}
	}

	static ClientScript method4730(byte[] is, int i) {
		try {
			return new ClientScript(new Buffer(is));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qs.p(").append(')').toString());
		}
	}

	static int method4731(byte i) {
		try {
			if (null == client.aClass114_9165) {
				if (!Class484.aBoolean5782) {
					if (Class534.aClass412_6788.aBoolean4255) {
						if (Class439.aClass330_Sub36_Sub10_4455 != null)
							return (-1231317789 * (((Class330_Sub36_Sub10) Class439.aClass330_Sub36_Sub10_4455).anInt9690));
					} else if (Class418.aClass330_Sub36_Sub10_4298 != null)
						return (-1231317789 * (((Class330_Sub36_Sub10) Class418.aClass330_Sub36_Sub10_4298).anInt9690));
				} else {
					Class524 class524 = Class359.method4239((byte) 52);
					int i_2_ = Class464_Sub23.aClass350_8712.method4030(34823472);
					int i_3_ = Class464_Sub23.aClass350_8712.method4031((short) 23726);
					if (!Class484.aBoolean5783) {
						if (i_2_ > 1574464115 * Class89.anInt736 && i_2_ < (1151799299 * Class550.anInt6288 + 1574464115 * Class89.anInt736)) {
							int i_4_ = -1;
							for (int i_5_ = 0; i_5_ < Class484.anInt5786 * -2008486989; i_5_++) {
								if (Class484.aBoolean5807) {
									int i_6_ = (((-2008486989 * Class484.anInt5786 - 1 - i_5_) * (1764744137 * Class484.anInt5779)) + (1 + (20 + (1798024257 * Class85.anInt713) + (-2093225349 * class524.anInt6033))));
									if ((i_3_ > (i_6_ - -2093225349 * class524.anInt6033 - 1)) && i_3_ < i_6_ + (class524.anInt6035 * 143160877))
										i_4_ = i_5_;
								} else {
									int i_7_ = (((-2008486989 * Class484.anInt5786 - 1 - i_5_) * (Class484.anInt5779 * 1764744137)) + (Class85.anInt713 * 1798024257 + 31));
									if (i_3_ > i_7_ - (class524.anInt6033 * -2093225349) - 1 && i_3_ < i_7_ + (class524.anInt6035 * 143160877))
										i_4_ = i_5_;
								}
							}
							if (i_4_ != -1) {
								int i_8_ = 0;
								Class474 class474 = new Class474(Class484.aClass471_5791);
								for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) class474.method5916(-1755972658)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) class474.next())) {
									if (i_8_++ == i_4_)
										return (-1231317789 * (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9690));
								}
							}
						}
					} else if (i_2_ > 1574464115 * Class89.anInt736 && i_2_ < (1574464115 * Class89.anInt736 + Class550.anInt6288 * 1151799299)) {
						int i_9_ = -1;
						for (int i_10_ = 0; i_10_ < Class484.anInt5790 * -1388920107; i_10_++) {
							if (Class484.aBoolean5807) {
								int i_11_ = (i_10_ * (Class484.anInt5779 * 1764744137) + (1 + (class524.anInt6033 * -2093225349 + (20 + (Class85.anInt713 * 1798024257)))));
								if (i_3_ > (i_11_ - class524.anInt6033 * -2093225349 - 1) && i_3_ < (class524.anInt6035 * 143160877 + i_11_))
									i_9_ = i_10_;
							} else {
								int i_12_ = (Class484.anInt5779 * 1764744137 * i_10_ + (31 + 1798024257 * Class85.anInt713));
								if (i_3_ > (i_12_ - class524.anInt6033 * -2093225349 - 1) && i_3_ < i_12_ + (class524.anInt6035 * 143160877))
									i_9_ = i_10_;
							}
						}
						if (i_9_ != -1) {
							int i_13_ = 0;
							Class479 class479 = new Class479(Class484.aClass472_5793);
							for (Class330_Sub36_Sub13 class330_sub36_sub13 = ((Class330_Sub36_Sub13) class479.method6011((byte) 90)); class330_sub36_sub13 != null; class330_sub36_sub13 = ((Class330_Sub36_Sub13) class479.next())) {
								if (i_13_++ == i_9_)
									return (-1231317789 * (((Class330_Sub36_Sub10) (Class330_Sub36_Sub10) (((Class330_Sub36_Sub13) class330_sub36_sub13).aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735)).anInt9690));
							}
						}
					} else if (null != Class484.aClass330_Sub36_Sub13_5784 && i_2_ > Class62.anInt561 * -165713069 && i_2_ < (-165713069 * Class62.anInt561 + 1702380591 * Class116.anInt1374)) {
						int i_14_ = -1;
						for (int i_15_ = 0; i_15_ < (((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).anInt9715) * -213703795; i_15_++) {
							if (Class484.aBoolean5807) {
								int i_16_ = (1 + (1131870491 * Class246.anInt6586 + 20 + class524.anInt6033 * -2093225349) + (1764744137 * Class484.anInt5779 * i_15_));
								if (i_3_ > (i_16_ - -2093225349 * class524.anInt6033 - 1) && i_3_ < (class524.anInt6035 * 143160877 + i_16_))
									i_14_ = i_15_;
							} else {
								int i_17_ = (Class246.anInt6586 * 1131870491 + 31 + i_15_ * (1764744137 * Class484.anInt5779));
								if (i_3_ > (i_17_ - -2093225349 * class524.anInt6033 - 1) && i_3_ < (143160877 * class524.anInt6035 + i_17_))
									i_14_ = i_15_;
							}
						}
						if (i_14_ != -1) {
							int i_18_ = 0;
							Class479 class479 = new Class479(((Class330_Sub36_Sub13) (Class484.aClass330_Sub36_Sub13_5784)).aClass472_9716);
							for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) class479.method6011((byte) 23)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) class479.next())) {
								if (i_18_++ == i_14_)
									return (-1231317789 * (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9690));
							}
						}
					}
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qs.as(").append(')').toString());
		}
	}

	static Class549_Sub1 method4732(int i) {
		try {
			Class549_Sub1 class549_sub1 = new Class549_Sub1();
			boolean bool = true;
			boolean bool_19_ = false;
			boolean bool_20_ = false;
			if (Class375.aClass330_Sub51_3933.anInt7946 * -140064631 < 512 && 0 != Class375.aClass330_Sub51_3933.anInt7946 * -140064631) {
				bool = false;
				class549_sub1.method6361(128, -2127242190);
			}
			if (Class212.aString6533.startsWith("win")) {
				bool_20_ = true;
				bool_19_ = true;
			} else
				bool_19_ = true;
			if (Class16.aBoolean212) {
				class549_sub1.method6361(8, -2128651558);
				bool = false;
			}
			if (Class16.aBoolean204) {
				class549_sub1.method6361(16, -2135499950);
				bool_19_ = false;
			}
			if (Class16.aBoolean214) {
				class549_sub1.method6361(32, -2128522125);
				bool_20_ = false;
			}
			if (!bool && !bool_19_ && !bool_20_) {
				Class494.method6085(class549_sub1, (byte) -29);
				return class549_sub1;
			}
			int i_21_ = -1;
			int i_22_ = -1;
			int i_23_ = -1;
			if (bool) {
				try {
					i_21_ = Class70.method817(2, 1000, (byte) 49);
					if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(261126456) == 2)
						class549_sub1.method6361(1, -2128546931);
				} catch (Exception exception) {
					class549_sub1.method6361(1024, -2147184995);
				}
			}
			if (bool_20_) {
				try {
					i_23_ = Class70.method817(3, 1000, (byte) 45);
					if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(138738280) == 3) {
						class549_sub1.method6361(4, -2139705264);
						Class51 class51 = Class361.aClass_ra3793.f();
						long l = (class51.aLong492 * -194081332353103341L & 0xffffffffffffL);
						switch (class51.anInt488 * 239892561) {
						case 4098: {
							boolean bool_24_ = l >= 60129613779L;
							bool_19_ &= bool_24_;
							if (!bool_24_)
								class549_sub1.method6361(512, -2146108865);
							break;
						}
						case 4318: {
							boolean bool_25_ = l >= 64425238954L;
							bool_19_ &= bool_25_;
							if (!bool_25_) {
								class549_sub1.method6361(256, -2142554279);
								break;
							}
							break;
						}
						}
					}
				} catch (Exception exception) {
					class549_sub1.method6361(4096, -2130394968);
				}
			}
			if (bool_19_) {
				try {
					i_22_ = Class70.method817(1, 1000, (byte) 51);
					if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(1210166121) == 1)
						class549_sub1.method6361(2, -2130491029);
				} catch (Exception exception) {
					class549_sub1.method6361(2048, -2142251536);
				}
			}
			if (-1 == i_21_ && i_22_ == -1 && -1 == i_23_) {
				Class494.method6085(class549_sub1, (byte) -63);
				return class549_sub1;
			}
			class549_sub1.method6363(3, i_23_, (byte) 44);
			class549_sub1.method6363(1, i_22_, (byte) 10);
			class549_sub1.method6363(2, i_21_, (byte) 127);
			i_23_ *= 1.3F;
			i_22_ *= 1.1F;
			if (i_21_ > i_23_ && i_21_ > i_22_)
				Class424.method5307(class549_sub1, i_21_, -1663605350);
			else if (i_23_ > i_22_)
				Class304.method3037(class549_sub1, 3, i_23_, 49769283);
			else
				Class304.method3037(class549_sub1, 1, i_22_, -2119344526);
			return class549_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qs.p(").append(')').toString());
		}
	}

	static final void method4733(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aBoolean1244 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
			Class404.method4738(iComponentDefinitions, 1491595431);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qs.fz(").append(')').toString());
		}
	}
}
