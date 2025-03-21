/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class395 {
	public int anInt4083;
	public String aString4084;
	Class497 aClass497_4085;
	int[] anIntArray4086;
	int[][] anIntArrayArray4087;
	public int anInt4088 = 0;
	public int[] anIntArray4089;
	Class407 aClass407_4090;
	public String aString4091;
	int[] anIntArray4092;
	public int[] anIntArray4093;
	public int[][] anIntArrayArray4094;
	public int anInt4095;
	public int[] anIntArray4096;
	public int anInt4097 = 0;
	int[] anIntArray4098;
	public String[] aStringArray4099;
	int[][] anIntArrayArray4100;
	public boolean aBoolean4101 = false;
	int[] anIntArray4102;
	public String[] aStringArray4103;
	int[] anIntArray4104;
	public int anInt4105 = 806158157;

	public boolean method4633(Interface29 interface29, byte i) {
		try {
			if (null != ((Class395) this).anIntArrayArray4100) {
				for (int i_0_ = 0; i_0_ < ((Class395) this).anIntArrayArray4100.length; i_0_++) {
					if (interface29.method306((((Class395) this).anIntArrayArray4100[i_0_][0]), 2101368483) >= ((Class395) this).anIntArrayArray4100[i_0_][1])
						return true;
				}
			}
			if (null != ((Class395) this).anIntArrayArray4087) {
				for (int i_1_ = 0; i_1_ < ((Class395) this).anIntArrayArray4087.length; i_1_++) {
					if (interface29.method310((((Class395) this).anIntArrayArray4087[i_1_][0]), -1547822371) >= ((Class395) this).anIntArrayArray4087[i_1_][1])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.s(").append(')').toString());
		}
	}

	public String method4634(int i, String string, int i_2_) {
		try {
			if (null == ((Class395) this).aClass497_4085)
				return string;
			Class330_Sub35 class330_sub35 = ((Class330_Sub35) ((Class395) this).aClass497_4085.method6094((long) i));
			if (class330_sub35 == null)
				return string;
			return (String) class330_sub35.anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.o(").append(')').toString());
		}
	}

	void method4635(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_3_ = class330_sub46.readUnsignedByte(600115599);
				if (0 == i_3_) {
					if (i == -725567700) {
						/* empty */
					}
					break;
				}
				method4644(class330_sub46, i_3_, 2084569173);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.r(").append(')').toString());
		}
	}

	public boolean method4636(Interface29 interface29, int i) {
		try {
			if (null != ((Class395) this).anIntArrayArray4100) {
				for (int i_4_ = 0; i_4_ < ((Class395) this).anIntArrayArray4100.length; i_4_++) {
					if (interface29.method306((((Class395) this).anIntArrayArray4100[i_4_][0]), 1469950036) >= ((Class395) this).anIntArrayArray4100[i_4_][2])
						return true;
				}
			}
			if (((Class395) this).anIntArrayArray4087 != null) {
				for (int i_5_ = 0; i_5_ < ((Class395) this).anIntArrayArray4087.length; i_5_++) {
					if (interface29.method310((((Class395) this).anIntArrayArray4087[i_5_][0]), -1865448241) >= ((Class395) this).anIntArrayArray4087[i_5_][2])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.f(").append(')').toString());
		}
	}

	public boolean method4637(Interface29 interface29, int[] is, byte i) {
		try {
			if (((Class395) this).aClass407_4090.method4753(interface29, 216426502) < -236526809 * anInt4095)
				return false;
			if (anIntArrayArray4094 != null) {
				for (int i_6_ = 0; i_6_ < anIntArrayArray4094.length; i_6_++) {
					if (is[anIntArrayArray4094[i_6_][0]] < anIntArrayArray4094[i_6_][1])
						return false;
				}
			}
			if (anIntArray4089 != null) {
				for (int i_7_ = 0; i_7_ < anIntArray4089.length; i_7_++) {
					if (!((Class395) this).aClass407_4090.method4752(anIntArray4089[i_7_], -1388697223).method4636(interface29, 1394770222))
						return false;
				}
			}
			if (anIntArray4096 != null) {
				for (int i_8_ = 0; i_8_ < anIntArray4096.length; i_8_++) {
					int i_9_ = interface29.method306(anIntArray4096[i_8_], 1433527744);
					if (i_9_ < ((Class395) this).anIntArray4104[i_8_] || i_9_ > ((Class395) this).anIntArray4098[i_8_])
						return false;
				}
			}
			if (anIntArray4093 != null) {
				for (int i_10_ = 0; i_10_ < anIntArray4093.length; i_10_++) {
					int i_11_ = interface29.method310(anIntArray4093[i_10_], -1985131301);
					if (i_11_ < ((Class395) this).anIntArray4086[i_10_] || i_11_ > ((Class395) this).anIntArray4102[i_10_])
						return false;
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.z(").append(')').toString());
		}
	}

	public boolean method4638(Interface29 interface29, int i) {
		try {
			if (((Class395) this).aClass407_4090.method4753(interface29, 1459163397) < -236526809 * anInt4095)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.w(").append(')').toString());
		}
	}

	public boolean method4639(int[] is, int i, byte i_12_) {
		try {
			if (anIntArrayArray4094 == null || i < 0 || i >= anIntArrayArray4094.length)
				return false;
			if (is[anIntArrayArray4094[i][0]] < anIntArrayArray4094[i][1])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.n(").append(')').toString());
		}
	}

	public boolean method4640(Interface29 interface29, int i, int i_13_) {
		try {
			if (null == anIntArray4096 || i < 0 || i >= anIntArray4096.length)
				return false;
			int i_14_ = interface29.method306(anIntArray4096[i], 856908869);
			if (i_14_ < ((Class395) this).anIntArray4104[i] || i_14_ > ((Class395) this).anIntArray4098[i])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.b(").append(')').toString());
		}
	}

	public boolean method4641(Interface29 interface29, int i, int i_15_) {
		try {
			if (anIntArray4093 == null || i < 0 || i >= anIntArray4093.length)
				return false;
			int i_16_ = interface29.method310(anIntArray4093[i], -731526083);
			if (i_16_ < ((Class395) this).anIntArray4086[i] || i_16_ > ((Class395) this).anIntArray4102[i])
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.k(").append(')').toString());
		}
	}

	public int method4642(int i, int i_17_, int i_18_) {
		try {
			if (null == ((Class395) this).aClass497_4085)
				return i_17_;
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class395) this).aClass497_4085.method6094((long) i));
			if (class330_sub23 == null)
				return i_17_;
			return 393599711 * class330_sub23.anInt7693;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.p(").append(')').toString());
		}
	}

	public boolean method4643(Interface29 interface29, int i, int i_19_) {
		try {
			if (anIntArray4089 == null || i < 0 || i >= anIntArray4089.length)
				return false;
			if (!((Class395) this).aClass407_4090.method4752(anIntArray4089[i], -1734068698).method4636(interface29, 1803825780))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.l(").append(')').toString());
		}
	}

	Class395() {
		/* empty */
	}

	void method4644(Buffer class330_sub46, int i, int i_20_) {
		try {
			if (i == 1)
				aString4084 = class330_sub46.readJagString((byte) 6);
			else if (i == 2)
				aString4091 = class330_sub46.readJagString((byte) 6);
			else if (3 == i) {
				int i_21_ = class330_sub46.readUnsignedByte(-197176457);
				((Class395) this).anIntArrayArray4100 = new int[i_21_][3];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					((Class395) this).anIntArrayArray4100[i_22_][0] = class330_sub46.readUnsignedShort(1610718739);
					((Class395) this).anIntArrayArray4100[i_22_][1] = class330_sub46.readInt((byte) 23);
					((Class395) this).anIntArrayArray4100[i_22_][2] = class330_sub46.readInt((byte) 116);
				}
			} else if (i == 4) {
				int i_23_ = class330_sub46.readUnsignedByte(1096168014);
				((Class395) this).anIntArrayArray4087 = new int[i_23_][3];
				for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
					((Class395) this).anIntArrayArray4087[i_24_][0] = class330_sub46.readUnsignedShort(302009230);
					((Class395) this).anIntArrayArray4087[i_24_][1] = class330_sub46.readInt((byte) 78);
					((Class395) this).anIntArrayArray4087[i_24_][2] = class330_sub46.readInt((byte) 3);
				}
			} else if (5 == i)
				class330_sub46.readUnsignedShort(1669341329);
			else if (i == 6)
				anInt4088 = class330_sub46.readUnsignedByte(258407634) * -1932555193;
			else if (7 == i)
				anInt4097 = class330_sub46.readUnsignedByte(-193324020) * -698224701;
			else if (i == 8)
				aBoolean4101 = true;
			else if (i == 9)
				anInt4083 = class330_sub46.readUnsignedByte(901319918) * 927608681;
			else if (i == 10) {
				int i_25_ = class330_sub46.readUnsignedByte(270438124);
				((Class395) this).anIntArray4092 = new int[i_25_];
				for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
					((Class395) this).anIntArray4092[i_26_] = class330_sub46.readInt((byte) 79);
			} else if (i == 12)
				class330_sub46.readInt((byte) 51);
			else if (i == 13) {
				int i_27_ = class330_sub46.readUnsignedByte(321928617);
				anIntArray4089 = new int[i_27_];
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
					anIntArray4089[i_28_] = class330_sub46.readUnsignedShort(761656926);
			} else if (i == 14) {
				int i_29_ = class330_sub46.readUnsignedByte(2012420008);
				anIntArrayArray4094 = new int[i_29_][2];
				for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
					anIntArrayArray4094[i_30_][0] = class330_sub46.readUnsignedByte(415329821);
					anIntArrayArray4094[i_30_][1] = class330_sub46.readUnsignedByte(1553444329);
				}
			} else if (i == 15)
				anInt4095 = class330_sub46.readUnsignedShort(1718158567) * -199074665;
			else if (17 == i)
				anInt4105 = class330_sub46.readBigSmart(-728949749) * -806158157;
			else if (i == 18) {
				int i_31_ = class330_sub46.readUnsignedByte(1252253691);
				anIntArray4096 = new int[i_31_];
				((Class395) this).anIntArray4104 = new int[i_31_];
				((Class395) this).anIntArray4098 = new int[i_31_];
				aStringArray4099 = new String[i_31_];
				for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
					anIntArray4096[i_32_] = class330_sub46.readInt((byte) 109);
					((Class395) this).anIntArray4104[i_32_] = class330_sub46.readInt((byte) 66);
					((Class395) this).anIntArray4098[i_32_] = class330_sub46.readInt((byte) 85);
					aStringArray4099[i_32_] = class330_sub46.readString(1532466241);
				}
			} else if (19 == i) {
				int i_33_ = class330_sub46.readUnsignedByte(670460405);
				anIntArray4093 = new int[i_33_];
				((Class395) this).anIntArray4086 = new int[i_33_];
				((Class395) this).anIntArray4102 = new int[i_33_];
				aStringArray4103 = new String[i_33_];
				for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
					anIntArray4093[i_34_] = class330_sub46.readInt((byte) 82);
					((Class395) this).anIntArray4086[i_34_] = class330_sub46.readInt((byte) 71);
					((Class395) this).anIntArray4102[i_34_] = class330_sub46.readInt((byte) 93);
					aStringArray4103[i_34_] = class330_sub46.readString(1344346412);
				}
			} else if (i == 249) {
				int i_35_ = class330_sub46.readUnsignedByte(-273471736);
				if (null == ((Class395) this).aClass497_4085) {
					int i_36_ = Class136.method1594(i_35_, 2072116951);
					((Class395) this).aClass497_4085 = new Class497(i_36_);
				}
				for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
					boolean bool = class330_sub46.readUnsignedByte(1532919942) == 1;
					int i_38_ = class330_sub46.readUnsignedTriByte(-1401356047);
					Class330 class330;
					if (bool)
						class330 = new Class330_Sub35(class330_sub46.readString(-1215066705));
					else
						class330 = new Class330_Sub23(class330_sub46.readInt((byte) 48));
					((Class395) this).aClass497_4085.method6097(class330, (long) i_38_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.j(").append(')').toString());
		}
	}

	void method4645(int i) {
		try {
			if (aString4091 == null)
				aString4091 = aString4084;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.i(").append(')').toString());
		}
	}

	static final void method4646(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			iComponentDefinitions.aBoolean1237 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) == 1;
			Class404.method4738(iComponentDefinitions, 1686568571);
			if (-1 == -790144721 * iComponentDefinitions.anInt1287 && !class120.aBoolean1402)
				Class411.method5231(iComponentDefinitions.anInt1196 * 751119487, -318977896);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.hv(").append(')').toString());
		}
	}

	static boolean method4647(int i) {
		try {
			Class360.anInt3791 = -180602592;
			Class360.aClass1_3783 = client.aClass1_9025;
			if (null != client.aByteArray8959) {
				Buffer class330_sub46 = new Buffer(client.aByteArray8959);
				Class360.aLong3750 = (class330_sub46.readLong(-653327152) * -717415731737899667L);
				Class360.socialName = (class330_sub46.readLong(627337622) * 853781492121528335L);
			}
			if (Class360.aLong3750 * -3453250751665093531L < 0L) {
				Class281.method2792(35, 111804978);
				return false;
			}
			return Class528.method6272(false, true, "", "", (Class360.aLong3750 * -3453250751665093531L));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.g(").append(')').toString());
		}
	}

	public static void method4648(float f, Class260 class260, Class260 class260_39_, Class260 class260_40_, Class260 class260_41_, Class260 class260_42_, float f_43_, float f_44_, byte i) {
		try {
			if (!class260_39_.method2555(class260)) {
				Class260 class260_45_ = Class260.method2561(class260_39_, class260);
				float f_46_ = class260_45_.method2565();
				if (f_43_ > 0.0F) {
					class260_41_ = Class260.method2549(class260_41_);
					class260_41_.method2567(f_44_ * (f_46_ / f_43_));
				}
				if (Float.POSITIVE_INFINITY == class260_41_.aFloat2716 || Float.isNaN(class260.aFloat2716) || f_46_ > 5120.0F) {
					class260.method2582(class260_39_);
					class260_40_.method2554();
				} else {
					Class260 class260_47_ = Class260.method2549(class260_40_);
					class260_47_.method2551();
					Class260 class260_48_ = Class260.method2568(class260_47_, class260_41_);
					Class260 class260_49_ = Class260.method2566(class260_47_, class260_48_);
					Class260 class260_50_ = Class260.method2549(class260_40_);
					Class260 class260_51_ = Class260.method2549(class260_45_);
					class260_51_.method2551();
					if (class260_49_.aFloat2716 > class260_51_.aFloat2716) {
						if (class260_45_.aFloat2716 < 0.0F) {
							class260_50_.aFloat2716 += f * class260_41_.aFloat2716;
							if (class260_50_.aFloat2716 > 0.0F)
								class260_50_.aFloat2716 = 0.0F;
						} else {
							class260_50_.aFloat2716 -= f * class260_41_.aFloat2716;
							if (class260_50_.aFloat2716 < 0.0F)
								class260_50_.aFloat2716 = 0.0F;
						}
					} else if (class260_47_.aFloat2716 < class260_42_.aFloat2716) {
						if (class260_45_.aFloat2716 < 0.0F) {
							class260_50_.aFloat2716 -= class260_41_.aFloat2716 * f;
							if (class260_50_.aFloat2716 < -class260_42_.aFloat2716)
								class260_50_.aFloat2716 = -class260_42_.aFloat2716;
						} else {
							class260_50_.aFloat2716 += class260_41_.aFloat2716 * f;
							if (class260_50_.aFloat2716 > class260_42_.aFloat2716)
								class260_50_.aFloat2716 = class260_42_.aFloat2716;
						}
					}
					if (class260_49_.aFloat2715 > class260_51_.aFloat2715) {
						if (class260_45_.aFloat2715 < 0.0F) {
							class260_50_.aFloat2715 += class260_41_.aFloat2715 * f;
							if (class260_50_.aFloat2715 > 0.0F)
								class260_50_.aFloat2715 = 0.0F;
						} else {
							class260_50_.aFloat2715 -= class260_41_.aFloat2715 * f;
							if (class260_50_.aFloat2715 < 0.0F)
								class260_50_.aFloat2715 = 0.0F;
						}
					} else if (class260_47_.aFloat2715 < class260_42_.aFloat2715) {
						if (class260_45_.aFloat2715 < 0.0F) {
							class260_50_.aFloat2715 -= class260_41_.aFloat2715 * f;
							if (class260_50_.aFloat2715 < -class260_42_.aFloat2715)
								class260_50_.aFloat2715 = -class260_42_.aFloat2715;
						} else {
							class260_50_.aFloat2715 += f * class260_41_.aFloat2715;
							if (class260_50_.aFloat2715 > class260_42_.aFloat2715)
								class260_50_.aFloat2715 = class260_42_.aFloat2715;
						}
					}
					if (class260_49_.aFloat2711 > class260_51_.aFloat2711) {
						if (class260_45_.aFloat2711 < 0.0F) {
							class260_50_.aFloat2711 += f * class260_41_.aFloat2711;
							if (class260_50_.aFloat2711 > 0.0F)
								class260_50_.aFloat2711 = 0.0F;
						} else {
							class260_50_.aFloat2711 -= class260_41_.aFloat2711 * f;
							if (class260_50_.aFloat2711 < 0.0F)
								class260_50_.aFloat2711 = 0.0F;
						}
					} else if (class260_47_.aFloat2711 < class260_42_.aFloat2711) {
						if (class260_45_.aFloat2711 < 0.0F) {
							class260_50_.aFloat2711 -= f * class260_41_.aFloat2711;
							if (class260_50_.aFloat2711 < -class260_42_.aFloat2711)
								class260_50_.aFloat2711 = -class260_42_.aFloat2711;
						} else {
							class260_50_.aFloat2711 += class260_41_.aFloat2711 * f;
							if (class260_50_.aFloat2711 > class260_42_.aFloat2711)
								class260_50_.aFloat2711 = class260_42_.aFloat2711;
						}
					}
					class260_40_.method2572(class260_50_, 0.8F);
					if (f_46_ < 10.0F && class260_40_.method2565() < 10.0F) {
						class260.method2582(class260_39_);
						class260_40_.method2554();
					} else
						class260.method2558(Class260.method2574(class260_40_, f));
					class260_47_.method2550();
					class260_50_.method2550();
					class260_51_.method2550();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.r(").append(')').toString());
		}
	}

	static final void method4649(Class430 class430, int i) throws Exception_Sub4 {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_52_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_53_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			int i_54_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_55_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 3]);
			Class260 class260 = Class260.method2577((float) i_52_, (float) i_53_, (float) i_54_);
			if (class260.aFloat2716 == -1.0F)
				class260.aFloat2716 = Float.POSITIVE_INFINITY;
			if (class260.aFloat2715 == -1.0F)
				class260.aFloat2715 = Float.POSITIVE_INFINITY;
			if (-1.0F == class260.aFloat2711)
				class260.aFloat2711 = Float.POSITIVE_INFINITY;
			Class401_Sub1.aClass145_Sub1_8249.method1684(class260, (byte) -120);
			Class401_Sub1.aClass145_Sub1_8249.method1719((float) i_55_ / 1000.0F, -88299728);
			class260.method2550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.aia(").append(')').toString());
		}
	}

	static final void method4650(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_56_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_57_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_56_ * i_57_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.zn(").append(')').toString());
		}
	}

	static final void method4651(Class430 class430, short i) throws Exception_Sub4 {
		try {
			int i_58_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class144 class144 = Preferences.method2922(i_58_, 1287288894);
			if (null == class144)
				throw new RuntimeException();
			Class401_Sub1.aClass145_Sub1_8249.method1692(class144, 2059508001);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qi.aip(").append(')').toString());
		}
	}
}
