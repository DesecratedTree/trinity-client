/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class208 {
	public int anInt1953;
	static IndexTable aClass280_1954;
	static int anInt1955 = 0;
	public static int anInt1956 = 1;
	public static int anInt1957 = 2;
	public static int anInt1958 = 0;
	public int anInt1959;
	public static int anInt1960 = 1;
	static int anInt1961 = 1;
	public int anInt1962;
	public static Class208[] aClass208Array1963 = new Class208[16];
	public static Class497 aClass497_1964;
	public int anInt1965 = 0;
	static Class367 aClass367_1966;
	public int anInt1967;
	public int anInt1968;
	int anInt1969;
	public int anInt1970;
	public static int anInt1971 = 0;
	public int anInt1972;
	static int anInt1973 = 1;
	public int anInt1974;
	static int anInt1975 = 2;
	public int anInt1976 = 0;
	boolean aBoolean1977 = false;
	public long aLong1978;
	static int anInt1979 = 0;
	public int anInt1980;

	void method2196(int i) {
		try {
			anInt1980 = 172441881 * (Class257.anIntArray2684[((Class208) this).anInt1969 * 299094937 << 3]);
			long l = (long) (2018198101 * anInt1970);
			long l_0_ = (long) (anInt1953 * -460016343);
			long l_1_ = (long) (-602604801 * anInt1972);
			anInt1962 = ((int) Math.sqrt((double) (l_1_ * l_1_ + (l * l + l_0_ * l_0_))) * -389749945);
			if (624635041 * anInt1974 == 0)
				anInt1974 = 596490081;
			if (0 == anInt1959 * -117675743)
				aLong1978 = 8500999125462044871L;
			else if (-117675743 * anInt1959 == 1) {
				aLong1978 = ((long) (-1864453192 * anInt1962 / (anInt1974 * 624635041)) * -4648495527037653191L);
				aLong1978 *= aLong1978 * -3534237462716707063L;
			} else if (2 == -117675743 * anInt1959)
				aLong1978 = -4648495527037653191L * (long) (-1864453192 * anInt1962 / (624635041 * anInt1974));
			if (((Class208) this).aBoolean1977)
				anInt1962 *= -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.o(").append(')').toString());
		}
	}

	void method2197(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_2_ = class330_sub46.readUnsignedByte(1599201044);
				if (0 == i_2_) {
					if (i == 2)
						throw new IllegalStateException();
					break;
				}
				method2198(class330_sub46, i_2_, 1069103436);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.i(").append(')').toString());
		}
	}

	void method2198(Buffer class330_sub46, int i, int i_3_) {
		try {
			if (i == 1)
				((Class208) this).anInt1969 = class330_sub46.readUnsignedShort(-406949323) * 793104553;
			else if (2 == i)
				class330_sub46.readUnsignedByte(483040893);
			else if (3 == i) {
				anInt1970 = class330_sub46.readInt((byte) 119) * -968381699;
				anInt1953 = class330_sub46.readInt((byte) 61) * 359315225;
				anInt1972 = class330_sub46.readInt((byte) 56) * 1926366463;
			} else if (4 == i) {
				anInt1959 = class330_sub46.readUnsignedByte(434602612) * -1930274079;
				anInt1974 = class330_sub46.readInt((byte) 84) * 596490081;
			} else if (i == 6)
				anInt1968 = class330_sub46.readUnsignedByte(528832674) * 471408275;
			else if (i == 8)
				anInt1965 = 580782865;
			else if (i == 9)
				anInt1976 = 2120634171;
			else if (10 == i)
				((Class208) this).aBoolean1977 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.p(").append(')').toString());
		}
	}

	static {
		aClass497_1964 = new Class497(16);
		aClass367_1966 = new Class367(64);
	}

	Class208() {
		/* empty */
	}

	public static Class330_Sub36_Sub10 method2199(int i) {
		try {
			return Class418.aClass330_Sub36_Sub10_4298;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.ax(").append(')').toString());
		}
	}

	static final void method2200(Class430 class430, byte i) {
		try {
			Class497 class497 = (((Class430) class430).aClass330_Sub36_Sub8_4393.aClass497Array9682[(((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397])]);
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) class497.method6094((long) ((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]));
			if (null != class330_sub23)
				((Class430) class430).anInt4397 += class330_sub23.anInt7693 * 717345991;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.bg(").append(')').toString());
		}
	}

	static final void method2201(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			iComponentDefinitions.anInt1247 = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]) * 799925689;
			iComponentDefinitions.anInt1315 = (-345992463 * (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]));
			Class404.method4738(iComponentDefinitions, 499051052);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.fp(").append(')').toString());
		}
	}

	static final void method2202(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, 905641405);
			Class120 class120 = Class3.aClass120Array56[i_4_ >> 16];
			Class_xa.method6431(iComponentDefinitions, class120, class430, 1695046565);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.gj(").append(')').toString());
		}
	}

	static final void method2203(Class430 class430, int i) {
		try {
			client.aBoolean9273 = true;
			Class62.method768(1574861703);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.ajo(").append(')').toString());
		}
	}

	static void method2204(Class120 class120, int i, int i_5_, int i_6_, boolean bool, Class430 class430, int i_7_) {
		try {
			if (i_5_ == 0)
				throw new RuntimeException();
			IComponentDefinitions iComponentDefinitions = class120.aClass114Array1400[i];
			if (iComponentDefinitions.aClass114Array1347 == null) {
				iComponentDefinitions.aClass114Array1347 = new IComponentDefinitions[i_6_ + 1];
				iComponentDefinitions.aClass114Array1219 = iComponentDefinitions.aClass114Array1347;
			}
			if (iComponentDefinitions.aClass114Array1347.length <= i_6_) {
				if (iComponentDefinitions.aClass114Array1219 == iComponentDefinitions.aClass114Array1347) {
					IComponentDefinitions[] class114s = new IComponentDefinitions[1 + i_6_];
					for (int i_8_ = 0; i_8_ < iComponentDefinitions.aClass114Array1347.length; i_8_++)
						class114s[i_8_] = iComponentDefinitions.aClass114Array1347[i_8_];
					iComponentDefinitions.aClass114Array1347 = iComponentDefinitions.aClass114Array1219 = class114s;
				} else {
					IComponentDefinitions[] class114s = new IComponentDefinitions[1 + i_6_];
					IComponentDefinitions[] class114s_9_ = new IComponentDefinitions[i_6_ + 1];
					for (int i_10_ = 0; i_10_ < iComponentDefinitions.aClass114Array1347.length; i_10_++) {
						class114s[i_10_] = iComponentDefinitions.aClass114Array1347[i_10_];
						class114s_9_[i_10_] = iComponentDefinitions.aClass114Array1219[i_10_];
					}
					iComponentDefinitions.aClass114Array1347 = class114s;
					iComponentDefinitions.aClass114Array1219 = class114s_9_;
				}
			}
			if (i_6_ > 0 && null == iComponentDefinitions.aClass114Array1347[i_6_ - 1])
				throw new RuntimeException(new StringBuilder().append("").append(i_6_ - 1).toString());
			IComponentDefinitions class114_11_ = new IComponentDefinitions();
			class114_11_.anInt1198 = 1711233497 * i_5_;
			class114_11_.anInt1211 = (class114_11_.anInt1196 = iComponentDefinitions.anInt1196 * 1) * -1810425115;
			class114_11_.anInt1287 = i_6_ * 271617487;
			iComponentDefinitions.aClass114Array1347[i_6_] = class114_11_;
			if (iComponentDefinitions.aClass114Array1347 != iComponentDefinitions.aClass114Array1219)
				iComponentDefinitions.aClass114Array1219[i_6_] = class114_11_;
			Class426 class426;
			if (bool)
				class426 = ((Class430) class430).aClass426_4384;
			else
				class426 = ((Class430) class430).aClass426_4370;
			((Class426) class426).aClass120_4346 = class120;
			((Class426) class426).aClass114_4345 = class114_11_;
			Class404.method4738(iComponentDefinitions, 1821643867);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.q(").append(')').toString());
		}
	}

	static final void method2205(int i, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_) {
		try {
			if (!bool && (i_12_ < 512 || i_13_ < 512 || i_12_ > (client.aClass304_9030.method2990(-1665273385) - 2) * 512 || i_13_ > (client.aClass304_9030.method3033((byte) -85) - 2) * 512)) {
				float[] fs = client.aFloatArray9253;
				client.aFloatArray9253[1] = -1.0F;
				fs[0] = -1.0F;
			} else {
				int i_17_ = Class431.method5342(i_12_, i_13_, i, 1996761881) - i_15_;
				client.aClass247_8975.method2454(Class361.aClass_ra3793.cq());
				client.aClass247_8975.method2474((float) i_14_, 0.0F, 0.0F);
				Class361.aClass_ra3793.cw(client.aClass247_8975);
				if (bool)
					Class361.aClass_ra3793.method_do((float) i_12_, (float) i_17_, (float) i_13_, client.aFloatArray9253);
				else
					Class361.aClass_ra3793.dr((float) i_12_, (float) i_17_, (float) i_13_, client.aFloatArray9253);
				client.aClass247_8975.method2474((float) -i_14_, 0.0F, 0.0F);
				Class361.aClass_ra3793.cw(client.aClass247_8975);
				client.aFloatArray9253[0] -= (float) (-1033514977 * client.anInt9251);
				client.aFloatArray9253[1] -= (float) (-1731646539 * client.anInt9166);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.jj(").append(')').toString());
		}
	}

	static void method2206(String[] strings, int[] is, int i, int i_18_, int i_19_) {
		try {
			if (i < i_18_) {
				int i_20_ = (i + i_18_) / 2;
				int i_21_ = i;
				String string = strings[i_20_];
				strings[i_20_] = strings[i_18_];
				strings[i_18_] = string;
				int i_22_ = is[i_20_];
				is[i_20_] = is[i_18_];
				is[i_18_] = i_22_;
				for (int i_23_ = i; i_23_ < i_18_; i_23_++) {
					if (null == string || (null != strings[i_23_] && strings[i_23_].compareTo(string) < (i_23_ & 0x1))) {
						String string_24_ = strings[i_23_];
						strings[i_23_] = strings[i_21_];
						strings[i_21_] = string_24_;
						int i_25_ = is[i_23_];
						is[i_23_] = is[i_21_];
						is[i_21_++] = i_25_;
					}
				}
				strings[i_18_] = strings[i_21_];
				strings[i_21_] = string;
				is[i_18_] = is[i_21_];
				is[i_21_] = i_22_;
				method2206(strings, is, i, i_21_ - 1, -202997718);
				method2206(strings, is, i_21_ + 1, i_18_, -121027225);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.p(").append(')').toString());
		}
	}

	public static final void method2207(int i) {
		try {
			Class62.method766((byte) -2);
			for (int i_26_ = 0; i_26_ < -1098735395 * Class333.anInt3360; i_26_++) {
				Class316 class316 = Class333.aClass316Array3347[i_26_];
				boolean bool = false;
				if (((Class316) class316).aClass330_Sub40_Sub3_3271 == null) {
					((Class316) class316).anInt3264 -= 12937331;
					if (2109177019 * ((Class316) class316).anInt3264 >= (class316.method3145(2086045403) ? -1500 : -10)) {
						if (1 == ((Class316) class316).aByte3266 && null == ((Class316) class316).aClass302_3268) {
							((Class316) class316).aClass302_3268 = Class302.method2982(Class428.aClass280_4362, (-660540327 * (((Class316) class316).anInt3262)), 0);
							if (((Class316) class316).aClass302_3268 == null) {
								if (i >= 16777215) {
									/* empty */
								}
								continue;
							}
							((Class316) class316).anInt3264 += ((Class316) class316).aClass302_3268.method2983() * 12937331;
						} else if (class316.method3145(1793106358) && (null == (((Class316) class316).aClass330_Sub41_3269) || ((((Class316) class316).aClass330_Sub29_Sub1_Sub1_3270) == null))) {
							if (((Class316) class316).aClass330_Sub41_3269 == null)
								((Class316) class316).aClass330_Sub41_3269 = (Class330_Sub41.method3697(Class145_Sub1.aClass280_7265, (-660540327 * ((Class316) class316).anInt3262)));
							if (null == (((Class316) class316).aClass330_Sub41_3269)) {
								if (i >= 16777215) {
									/* empty */
								}
								continue;
							}
							if (null == (((Class316) class316).aClass330_Sub29_Sub1_Sub1_3270)) {
								((Class316) class316).aClass330_Sub29_Sub1_Sub1_3270 = ((Class316) class316).aClass330_Sub41_3269.method3699();
								if ((((Class316) class316).aClass330_Sub29_Sub1_Sub1_3270) == null) {
									if (i >= 16777215)
										throw new IllegalStateException();
									continue;
								}
							}
						}
						if (2109177019 * ((Class316) class316).anInt3264 < 0) {
							int i_27_ = 8192;
							int i_28_;
							if (((Class316) class316).anInt3265 * 1896845805 != 0) {
								int i_29_ = (1896845805 * (((Class316) class316).anInt3265) >> 24 & 0x3);
								if ((Class263_Sub2.myPlayer.aByte8658) == i_29_) {
									int i_30_ = (((1896845805 * ((Class316) class316).anInt3265) & 0xff) << 9);
									int i_31_ = Class263_Sub2.myPlayer.method5453(-1353821625) << 8;
									Class260 class260 = Class263_Sub2.myPlayer.method5346().aClass260_2606;
									int i_32_ = ((((Class316) class316).anInt3265 * 1896845805) >> 16 & 0xff);
									int i_33_ = (i_31_ + ((i_32_ << 9) + 256 - (int) class260.aFloat2716));
									int i_34_ = ((((Class316) class316).anInt3265 * 1896845805) >> 8 & 0xff);
									int i_35_ = (i_31_ + ((i_34_ << 9) + 256 - (int) class260.aFloat2711));
									int i_36_ = (Math.abs(i_33_) + Math.abs(i_35_) - 512);
									if (i_36_ > i_30_) {
										((Class316) class316).anInt3264 = -935006573;
										continue;
									}
									if (i_36_ < 0)
										i_36_ = 0;
									i_28_ = ((i_30_ - i_36_) * Class448.aClass330_Sub50_5555.aClass464_Sub30_7887.method5841(-1864678409) * (((Class316) class316).anInt3272 * -768291637) / i_30_) >> 2;
									if (-1 != (((Class316) class316).anInt3261 * -1106899877)) {
										i_32_ = (((Class316) class316).anInt3261 * -1106899877);
										i_34_ = (((Class316) class316).anInt3273 * 862428661);
									}
									if (i_33_ != 0 || i_35_ != 0) {
										int i_37_ = ((-(-626349281 * Class145_Sub1.anInt7266) - (int) ((Math.atan2((double) i_33_, (double) i_35_)) * 2607.5945876176133) - 4096) & 0x3fff);
										if (i_37_ > 8192)
											i_37_ = 16384 - i_37_;
										int i_38_;
										if (i_36_ <= 0)
											i_38_ = 8192;
										else if (i_36_ >= 4096)
											i_38_ = 16384;
										else
											i_38_ = (8192 - i_36_) / 4096 + 8192;
										i_27_ = ((16384 - i_38_ >> 1) + i_37_ * i_38_ / 8192);
									}
								} else
									i_28_ = 0;
							} else
								i_28_ = ((-768291637 * ((Class316) class316).anInt3272 * (((Class316) class316).aByte3266 == 3 ? Class448.aClass330_Sub50_5555.aClass464_Sub30_7907.method5841(-2048920843) : Class448.aClass330_Sub50_5555.aClass464_Sub30_7894.method5841(-2001447348))) >> 2);
							if (i_28_ > 0) {
								if (((Class316) class316).aByte3266 == 1) {
									Object object = null;
									Class330_Sub29_Sub1_Sub2 class330_sub29_sub1_sub2 = (((Class316) class316).aClass302_3268.method2981().method3409(Class427.aClass294_4350));
									((Class316) class316).aClass330_Sub40_Sub3_3271 = (class330_sub29_sub1_sub2.method3403(-421532969 * (((Class316) class316).anInt3259), i_28_, i_27_));
								} else if (class316.method3145(1906833804))
									((Class316) class316).aClass330_Sub40_Sub3_3271 = (((Class316) class316).aClass330_Sub29_Sub1_Sub1_3270.method3403((((Class316) class316).anInt3259 * -421532969), i_28_, i_27_));
								((Class316) class316).aClass330_Sub40_Sub3_3271.method3624((-1495172043 * ((Class316) class316).anInt3258) - 1, -754472311);
								Class511.aClass330_Sub40_Sub4_5951.method3684(((Class316) class316).aClass330_Sub40_Sub3_3271);
							}
						}
					} else
						bool = true;
				} else if (!((Class316) class316).aClass330_Sub40_Sub3_3271.method3251(122249317))
					bool = true;
				if (bool) {
					Class333.anInt3360 -= -228509835;
					for (int i_39_ = i_26_; i_39_ < Class333.anInt3360 * -1098735395; i_39_++)
						Class333.aClass316Array3347[i_39_] = Class333.aClass316Array3347[i_39_ + 1];
					i_26_--;
				}
			}
			if (Class333.aBoolean3354 && !Class416.method5259((byte) 7)) {
				if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1940531327) != 0 && -1686333471 * Class333.musicId != -1) {
					if (Class333.aClass330_Sub40_Sub2_3355 != null)
						Class89.method1058(Class89.aClass280_735, -1686333471 * Class333.musicId, 0, Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-2098873436), false, Class333.aClass330_Sub40_Sub2_3355, (short) 15325);
					else
						Class217.method2255(Class89.aClass280_735, -1686333471 * Class333.musicId, 0, Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-1997820516), false, -656286804);
				}
				Class333.aBoolean3354 = false;
				Class333.aClass330_Sub40_Sub2_3355 = null;
			} else if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-2024757429) != 0 && Class333.musicId * -1686333471 != -1 && !Class416.method5259((byte) 7)) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2487, client.aClass1_9025.aClass488_22, 763602888);
				class330_sub34.aClass330_Sub46_Sub2_7729.addInt(Class333.musicId * -1686333471, 1965508160);
				client.aClass1_9025.method378(class330_sub34, -2072392183);
				Class333.musicId = 1299321823;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("it.w(").append(')').toString());
		}
	}
}
