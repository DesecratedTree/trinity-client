/* Class432_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class432_Sub1_Sub1_Sub1 extends Class432_Sub1_Sub1 implements Interface6 {
	public int anInt10006;
	int anInt10007;
	public int anInt10008;
	int anInt10009 = 1589206767;
	public int anInt10010;
	boolean aBoolean10011;
	public boolean aBoolean10012;
	public int anInt10013;
	public int anInt10014;
	public int anInt10015;
	int anInt10016;
	public byte[] aByteArray10017;
	public int[] anIntArray10018;
	public Class477_Sub2_Sub1[] aClass477_Sub2_Sub1Array10019;
	Class60 aClass60_10020;
	byte aByte10021;
	public int[] anIntArray10022;
	int anInt10023;
	public int[] anIntArray10024;
	public byte aByte10025;
	public int[] anIntArray10026;
	public Class467 aClass467_10027;
	public int anInt10028;
	public int[] anIntArray10029;
	public int[] anIntArray10030;
	static int anInt10031 = 20;
	public Class477 aClass477_10032;
	public Gfx[] graphics;
	public int anInt10034;
	int anInt10035;
	public int anInt10036;
	int anInt10037;
	public int anInt10038;
	public Class477_Sub3 aClass477_Sub3_10039;
	public int anInt10040;
	public int anInt10041;
	public int anInt10042;
	public byte aByte10043;
	public byte aByte10044;
	public int anInt10045;
	int anInt10046;
	public int[] anIntArray10047;
	Class388 aClass388_10048;
	public int[] anIntArray10049;
	public int anInt10050;
	public int anInt10051;
	public int anInt10052;
	public Class238 aClass238_10053;
	public Class238 aClass238_10054;
	public Class238 aClass238_10055;
	public int anInt10056;
	public int anInt10057;
	public int anInt10058;
	public int[] anIntArray10059;
	public int anInt10060;
	public int[] anIntArray10061;
	public int anInt10062;
	public byte aByte10063;
	boolean aBoolean10064;
	static int anInt10065 = 5;
	public Class387[] aClass387Array10066;
	public Class120 aClass120_10067;
	public int anInt10068;
	public int anInt10069;

	public abstract Class60 method5408();

	void method5409(Class_ra class_ra, Class387[] class387s, Class247 class247, boolean bool, int i) {
		try {
			if (!bool) {
				int i_0_ = 0;
				int i_1_ = 0;
				int i_2_ = 0;
				int i_3_ = 0;
				int i_4_ = -1;
				int i_5_ = -1;
				Class93[][] class93s = new Class93[class387s.length][];
				Class64[][] class64s = new Class64[class387s.length][];
				for (int i_6_ = 0; i_6_ < class387s.length; i_6_++) {
					if (class387s[i_6_] != null) {
						class387s[i_6_].method4463(class247);
						class93s[i_6_] = class387s[i_6_].method4464();
						class64s[i_6_] = class387s[i_6_].method4445();
						if (class93s[i_6_] != null) {
							i_4_ = i_6_;
							i_1_++;
							i_0_ += class93s[i_6_].length;
						}
						if (null != class64s[i_6_]) {
							i_5_ = i_6_;
							i_3_++;
							i_2_ += class64s[i_6_].length;
						}
					}
				}
				if ((((Class432_Sub1_Sub1_Sub1) this).aClass388_10048 == null || (((Class432_Sub1_Sub1_Sub1) this).aClass388_10048.aBoolean3992)) && (i_1_ > 0 || i_3_ > 0))
					((Class432_Sub1_Sub1_Sub1) this).aClass388_10048 = Class388.method4571(822953439 * client.anInt8981, true);
				if (null != ((Class432_Sub1_Sub1_Sub1) this).aClass388_10048) {
					Object object = null;
					Class93[] class93s_7_;
					if (i_1_ == 1)
						class93s_7_ = class93s[i_4_];
					else {
						class93s_7_ = new Class93[i_0_];
						int i_8_ = 0;
						for (int i_9_ = 0; i_9_ < class387s.length; i_9_++) {
							if (null != class93s[i_9_]) {
								System.arraycopy(class93s[i_9_], 0, class93s_7_, i_8_, class93s[i_9_].length);
								i_8_ += class93s[i_9_].length;
							}
						}
					}
					Object object_10_ = null;
					Class64[] class64s_11_;
					if (1 == i_3_)
						class64s_11_ = class64s[i_5_];
					else {
						class64s_11_ = new Class64[i_2_];
						int i_12_ = 0;
						for (int i_13_ = 0; i_13_ < class387s.length; i_13_++) {
							if (null != class64s[i_13_]) {
								System.arraycopy(class64s[i_13_], 0, class64s_11_, i_12_, class64s[i_13_].length);
								i_12_ += class64s[i_13_].length;
							}
						}
					}
					((Class432_Sub1_Sub1_Sub1) this).aClass388_10048.method4568(class_ra, (long) (client.anInt8981 * 822953439), class93s_7_, class64s_11_, false);
					((Class432_Sub1_Sub1_Sub1) this).aBoolean10064 = true;
				}
			} else if (((Class432_Sub1_Sub1_Sub1) this).aClass388_10048 != null)
				((Class432_Sub1_Sub1_Sub1) this).aClass388_10048.method4565((long) (822953439 * client.anInt8981));
			if (null != ((Class432_Sub1_Sub1_Sub1) this).aClass388_10048)
				((Class432_Sub1_Sub1_Sub1) this).aClass388_10048.method4573(aByte8658, aShort9922, aShort9920, aShort9921, aShort9923);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.c(").append(')').toString());
		}
	}

	Class432_Sub1_Sub1_Sub1(Class356 class356, int i) {
		super(class356, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		((Class432_Sub1_Sub1_Sub1) this).anInt10007 = -1627815936;
		aBoolean10012 = true;
		anInt10013 = 0;
		anInt10014 = 298349393;
		anInt10052 = 0;
		((Class432_Sub1_Sub1_Sub1) this).anInt10037 = 0;
		((Class432_Sub1_Sub1_Sub1) this).aByte10021 = (byte) 0;
		anIntArray10022 = new int[708108473 * Class396.aClass417_4108.anInt4273];
		anIntArray10047 = new int[708108473 * Class396.aClass417_4108.anInt4273];
		anIntArray10024 = new int[708108473 * Class396.aClass417_4108.anInt4273];
		anIntArray10061 = new int[708108473 * Class396.aClass417_4108.anInt4273];
		anIntArray10026 = new int[Class396.aClass417_4108.anInt4273 * 708108473];
		aClass467_10027 = new Class467();
		anInt10028 = 825108897;
		anIntArray10030 = null;
		aClass477_Sub3_10039 = new Class477_Sub3(this, false);
		aClass477_10032 = new Class477_Sub2(this, false);
		anInt10041 = -1442866505;
		anInt10042 = 887346907;
		aByte10025 = (byte) 0;
		anInt10069 = 0;
		anInt10050 = 0;
		anInt10051 = 1821903616;
		aClass238_10053 = new Class238();
		aClass238_10054 = new Class238();
		aClass238_10055 = new Class238();
		anInt10056 = 0;
		anInt10060 = 0;
		anInt10006 = 0;
		anInt10062 = 0;
		((Class432_Sub1_Sub1_Sub1) this).aBoolean10064 = false;
		((Class432_Sub1_Sub1_Sub1) this).aBoolean10011 = false;
		anInt10068 = 105152227;
		((Class432_Sub1_Sub1_Sub1) this).anInt10016 = 2072128755;
		anIntArray10018 = new int[i];
		anIntArray10059 = new int[i];
		aByteArray10017 = new byte[i];
		aClass387Array10066 = new Class387[5];
		graphics = new Gfx[4];
		for (int i_14_ = 0; i_14_ < 4; i_14_++)
			graphics[i_14_] = new Gfx(this);
		aClass477_Sub2_Sub1Array10019 = (new Class477_Sub2_Sub1[Console.aClass421_4266.disabledEquipmentSlots.length]);
	}

	boolean method5382(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.ao(").append(')').toString());
		}
	}

	boolean method5395(int i) {
		try {
			return ((Class432_Sub1_Sub1_Sub1) this).aBoolean10011;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.bg(").append(')').toString());
		}
	}

	public void method5410(int i, byte i_15_) {
		try {
			Class364 class364 = method5436(-1347452953);
			if (-641669167 * class364.anInt3841 != 0 || 1733505955 * anInt10051 != 0) {
				aClass238_10053.method2371(-1408508694);
				int i_16_ = i - 142833127 * aClass238_10053.anInt2581 & 0x3fff;
				if (i_16_ > 8192)
					anInt10015 = 52878647 * (142833127 * aClass238_10053.anInt2581 - (16384 - i_16_));
				else
					anInt10015 = 52878647 * (142833127 * aClass238_10053.anInt2581 + i_16_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.q(").append(')').toString());
		}
	}

	public void method5411(int i, boolean bool, int i_17_) {
		try {
			Class364 class364 = method5436(345708333);
			if (bool || 0 != class364.anInt3841 * -641669167 || anInt10051 * 1733505955 != 0) {
				anInt10015 = (i & 0x3fff) * 52878647;
				aClass238_10053.method2369(1643473031 * anInt10015, -1621322213);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.u(").append(')').toString());
		}
	}

	public int method5412(int i) {
		try {
			Class364 class364 = method5436(1742314241);
			int i_18_ = 142833127 * aClass238_10053.anInt2581;
			boolean bool;
			if (0 != -641669167 * class364.anInt3841)
				bool = aClass238_10053.method2372(1643473031 * anInt10015, (-641669167 * class364.anInt3841), (class364.anInt3842 * -2021586415), -2002828831);
			else
				bool = aClass238_10053.method2372(1643473031 * anInt10015, anInt10051 * 1733505955, anInt10051 * 1733505955, -311035554);
			int i_19_ = 142833127 * aClass238_10053.anInt2581 - i_18_;
			if (i_19_ != 0)
				anInt10050 += -537406871;
			else {
				anInt10050 = 0;
				aClass238_10053.method2369(anInt10015 * 1643473031, -756949144);
			}
			if (bool) {
				if (0 != -640493031 * class364.anInt3843) {
					if (i_19_ > 0)
						aClass238_10054.method2372(916050153 * class364.anInt3816, class364.anInt3843 * -640493031, class364.anInt3838 * 576903207, -1093599923);
					else
						aClass238_10054.method2372(-(916050153 * class364.anInt3816), class364.anInt3843 * -640493031, class364.anInt3838 * 576903207, -287960438);
				}
				if (class364.anInt3839 * -362615677 != 0)
					aClass238_10055.method2372(class364.anInt3848 * 1337095293, class364.anInt3839 * -362615677, (class364.anInt3847 * -1905056407), -2113259361);
			} else {
				if (0 != class364.anInt3843 * -640493031)
					aClass238_10054.method2372(0, class364.anInt3843 * -640493031, class364.anInt3838 * 576903207, 1829400304);
				else
					aClass238_10054.method2369(0, -1175658972);
				if (class364.anInt3839 * -362615677 != 0)
					aClass238_10055.method2372(0, -362615677 * class364.anInt3839, (class364.anInt3847 * -1905056407), 641214297);
				else
					aClass238_10055.method2369(0, -1146187852);
			}
			return i_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.x(").append(')').toString());
		}
	}

	public void method5413(int[] is, int[] is_20_, byte i) {
		try {
			if (null == anIntArray10029 && is != null)
				anIntArray10029 = new int[Console.aClass421_4266.disabledEquipmentSlots.length];
			else if (null == is) {
				anIntArray10029 = null;
				return;
			}
			for (int i_21_ = 0; i_21_ < anIntArray10029.length; i_21_++)
				anIntArray10029[i_21_] = -1;
			for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
				int i_23_ = is_20_[i_22_];
				int i_24_ = 0;
				while (i_24_ < anIntArray10029.length) {
					if (0 != (i_23_ & 0x1))
						anIntArray10029[i_24_] = is[i_22_];
					i_24_++;
					i_23_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.g(").append(')').toString());
		}
	}

	public int method5414() {
		Class364 class364 = method5436(417051079);
		int i;
		if (-1 != -701222927 * class364.anInt3850)
			i = class364.anInt3850 * -701222927;
		else if (((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347 == -32768)
			i = 200;
		else
			i = -(((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347);
		Class241 class241 = method5346();
		int i_25_ = (int) class241.aClass260_2606.aFloat2716 >> 9;
		int i_26_ = (int) class241.aClass260_2606.aFloat2711 >> 9;
		if (aClass356_8655 != null && i_25_ >= 1 && i_26_ >= 1 && i_25_ <= client.aClass304_9030.method2990(-713811601) - 1 && i_26_ <= client.aClass304_9030.method3033((byte) -70) - 1) {
			Class340 class340 = (aClass356_8655.aClass340ArrayArrayArray3653[aByte8658][i_25_][i_26_]);
			if (null != class340 && null != class340.aClass432_Sub1_Sub4_3386)
				return class340.aClass432_Sub1_Sub4_3386.aShort9927 + i;
		}
		return i;
	}

	public final void sendGraphics(int i, int i_27_, int i_28_, int i_29_, boolean bool, int i_30_, byte i_31_) {
		try {
			Gfx class66 = graphics[i_30_];
			int i_32_ = class66.id * 888084571;
			if (-1 != i && -1 != i_32_) {
				if (i == i_32_) {
					Class437 class437 = Class136.aClass416_1527.method5254(i, -1733627848);
					if (class437.aBoolean4443 && 1258856743 * class437.anInt4431 != -1) {
						Class440 class440 = (Class201.aClass436_6511.method5570(1258856743 * class437.anInt4431, 1850891820));
						int i_33_ = class440.anInt4472 * -2030693815;
						if (i_33_ == 0)
							return;
						if (2 == i_33_) {
							class66.aClass477_573.method5980((byte) 51);
							return;
						}
					}
				} else {
					Class437 class437 = Class136.aClass416_1527.method5254(i, 15599428);
					Class437 class437_34_ = Class136.aClass416_1527.method5254(i_32_, 358750657);
					if (-1 != class437.anInt4431 * 1258856743 && class437_34_.anInt4431 * 1258856743 != -1) {
						Class440 class440 = (Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -1953165768));
						Class440 class440_35_ = (Class201.aClass436_6511.method5570(class437_34_.anInt4431 * 1258856743, 707470478));
						if (-233463405 * class440.anInt4470 < -233463405 * class440_35_.anInt4470)
							return;
					}
				}
			}
			int i_36_ = 0;
			if (i != -1 && !(Class136.aClass416_1527.method5254(i, 50173823).aBoolean4443))
				i_36_ = 2;
			if (-1 != i && bool)
				i_36_ = 1;
			class66.id = -1988601901 * i;
			class66.anInt572 = i_29_ * -761522437;
			class66.height = (i_27_ >> 16) * 1203531965;
			class66.anInt575 = i_28_ * -1423578783;
			class66.aClass477_573.method5970((-1 != i ? ((Class136.aClass416_1527.method5254(i, 1992434143).anInt4431) * 1258856743) : -1), i_27_ & 0xffff, i_36_, false, -2104192346);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.a(").append(')').toString());
		}
	}

	public final void method5416(int i) {
		try {
			anInt10056 = 0;
			anInt10006 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.e(").append(')').toString());
		}
	}

	Class432_Sub1_Sub1_Sub1(Class356 class356) {
		this(class356, 10);
	}

	public final void method5417(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		try {
			Class343 class343 = OutgoingPacket.aClass341_2578.method3972(i, (byte) 104);
			Class325_Sub4 class325_sub4 = null;
			Class325_Sub4 class325_sub4_43_ = null;
			int i_44_ = class343.anInt3410 * -452257669;
			int i_45_ = 0;
			for (Class325_Sub4 class325_sub4_46_ = (Class325_Sub4) aClass467_10027.method5854(-247950509); class325_sub4_46_ != null; class325_sub4_46_ = ((Class325_Sub4) aClass467_10027.method5857(-2136399523))) {
				i_45_++;
				if (class343 == class325_sub4_46_.aClass343_7485) {
					class325_sub4_46_.method3224(i_37_ + i_39_, i_40_, i_41_, i_38_, 390449265);
					return;
				}
				if (878749941 * class325_sub4_46_.aClass343_7485.anInt3402 <= 878749941 * class343.anInt3402)
					class325_sub4 = class325_sub4_46_;
				if (class325_sub4_46_.aClass343_7485.anInt3410 * -452257669 > i_44_) {
					class325_sub4_43_ = class325_sub4_46_;
					i_44_ = (class325_sub4_46_.aClass343_7485.anInt3410 * -452257669);
				}
			}
			if (null != class325_sub4_43_ || i_45_ < Class396.aClass417_4108.anInt4278 * 1958473527) {
				Class325_Sub4 class325_sub4_47_ = new Class325_Sub4(class343);
				if (null == class325_sub4)
					aClass467_10027.method5856(class325_sub4_47_, 682232543);
				else
					Class6.method406(class325_sub4_47_, class325_sub4, (byte) 0);
				class325_sub4_47_.method3224(i_39_ + i_37_, i_40_, i_41_, i_38_, -960188539);
				if (i_45_ >= Class396.aClass417_4108.anInt4278 * 1958473527)
					class325_sub4_43_.method3204(1239277349);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.bs(").append(')').toString());
		}
	}

	public final void method5418(int i, int i_48_) {
		try {
			Class343 class343 = OutgoingPacket.aClass341_2578.method3972(i, (byte) 3);
			for (Class325_Sub4 class325_sub4 = (Class325_Sub4) aClass467_10027.method5854(-1332963436); null != class325_sub4; class325_sub4 = ((Class325_Sub4) aClass467_10027.method5857(-1991669461))) {
				if (class325_sub4.aClass343_7485 == class343) {
					class325_sub4.method3204(986915706);
					break;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.bk(").append(')').toString());
		}
	}

	public void method5419(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
		try {
			if (!method5429(414417032)) {
				if (-1 != i)
					client.aBooleanArray9230[i] = true;
				else {
					for (int i_56_ = 0; i_56_ < 113; i_56_++)
						client.aBooleanArray9230[i_56_] = true;
				}
			} else
				Class556.method6408(aClass120_10067.method1442((byte) 73), -1, i_49_, i_50_, i_51_, i_52_, i_53_, i_54_, i, false, 1628989560);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.da(").append(')').toString());
		}
	}

	public void method5420(int i, short i_57_) {
		try {
			((Class432_Sub1_Sub1_Sub1) this).anInt10009 = i * 1589206767;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.bn(").append(')').toString());
		}
	}

	public void method5406(int i) {
		try {
			int i_58_ = ((-32272369 * ((Class432_Sub1_Sub1_Sub1) this).anInt10009 - 1 << 8) + 240);
			Class260 class260 = method5346().aClass260_2606;
			aShort9922 = (short) ((int) class260.aFloat2716 - i_58_ >> 9);
			aShort9921 = (short) ((int) class260.aFloat2711 - i_58_ >> 9);
			aShort9920 = (short) (i_58_ + (int) class260.aFloat2716 >> 9);
			aShort9923 = (short) ((int) class260.aFloat2711 + i_58_ >> 9);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.ca(").append(')').toString());
		}
	}

	void method5421(Class387 class387, int i) {
		try {
			int i_59_ = 142833127 * aClass238_10054.anInt2581;
			int i_60_ = 142833127 * aClass238_10055.anInt2581;
			if (i_59_ != 0 || 0 != i_60_) {
				int i_61_ = class387.YA() / 2;
				class387.ia(0, -i_61_, 0);
				class387.EA(i_59_ & 0x3fff);
				class387.t(i_60_ & 0x3fff);
				class387.ia(0, i_61_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.ct(").append(')').toString());
		}
	}

	public int method5363(int i) {
		try {
			Class364 class364 = method5436(1491582545);
			int i_62_;
			if (-1 != -701222927 * class364.anInt3850)
				i_62_ = class364.anInt3850 * -701222927;
			else if (((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347 == -32768)
				i_62_ = 200;
			else
				i_62_ = -(((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347);
			Class241 class241 = method5346();
			int i_63_ = (int) class241.aClass260_2606.aFloat2716 >> 9;
			int i_64_ = (int) class241.aClass260_2606.aFloat2711 >> 9;
			if (aClass356_8655 != null && i_63_ >= 1 && i_64_ >= 1 && i_63_ <= client.aClass304_9030.method2990(-595056193) - 1 && i_64_ <= client.aClass304_9030.method3033((byte) -91) - 1) {
				Class340 class340 = (aClass356_8655.aClass340ArrayArrayArray3653[aByte8658][i_63_][i_64_]);
				if (null != class340 && null != class340.aClass432_Sub1_Sub4_3386)
					return (class340.aClass432_Sub1_Sub4_3386.aShort9927 + i_62_);
			}
			return i_62_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.bc(").append(')').toString());
		}
	}

	abstract int method5422();

	public final void method5423(int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_) {
		try {
			boolean bool = true;
			boolean bool_71_ = true;
			for (int i_72_ = 0; i_72_ < 708108473 * Class396.aClass417_4108.anInt4273; i_72_++) {
				if (anIntArray10024[i_72_] > i_68_)
					bool = false;
				else
					bool_71_ = false;
			}
			int i_73_ = -1;
			int i_74_ = -1;
			int i_75_ = 0;
			if (i >= 0) {
				Class375 class375 = Class142.aClass368_1568.method4305(i, -2064329575);
				i_74_ = 173042781 * class375.anInt3931;
				i_75_ = class375.anInt3922 * -581817307;
			}
			if (bool_71_) {
				if (i_74_ == -1)
					return;
				i_73_ = 0;
				int i_76_ = 0;
				if (0 == i_74_)
					i_76_ = anIntArray10024[0];
				else if (i_74_ == 1)
					i_76_ = anIntArray10047[0];
				for (int i_77_ = 1; i_77_ < 708108473 * Class396.aClass417_4108.anInt4273; i_77_++) {
					if (0 == i_74_) {
						if (anIntArray10024[i_77_] < i_76_) {
							i_73_ = i_77_;
							i_76_ = anIntArray10024[i_77_];
						}
					} else if (i_74_ == 1 && anIntArray10047[i_77_] < i_76_) {
						i_73_ = i_77_;
						i_76_ = anIntArray10047[i_77_];
					}
				}
				if (i_74_ == 1 && i_76_ >= i_65_)
					return;
			} else {
				if (bool)
					((Class432_Sub1_Sub1_Sub1) this).aByte10021 = (byte) 0;
				for (int i_78_ = 0; i_78_ < Class396.aClass417_4108.anInt4273 * 708108473; i_78_++) {
					int i_79_ = ((Class432_Sub1_Sub1_Sub1) this).aByte10021;
					((Class432_Sub1_Sub1_Sub1) this).aByte10021 = (byte) ((1 + (((Class432_Sub1_Sub1_Sub1) this).aByte10021)) % (708108473 * Class396.aClass417_4108.anInt4273));
					if (anIntArray10024[i_79_] <= i_68_) {
						i_73_ = i_79_;
						break;
					}
				}
			}
			if (i_73_ >= 0) {
				anIntArray10022[i_73_] = i;
				anIntArray10047[i_73_] = i_65_;
				anIntArray10061[i_73_] = i_66_;
				anIntArray10026[i_73_] = i_67_;
				anIntArray10024[i_73_] = i_69_ + (i_75_ + i_68_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.m(").append(')').toString());
		}
	}

	abstract int method5424(byte i);

	public void method5425(int i) {
		try {
			if (null != ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020 && (((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).aString556) != null) {
				((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).anInt558 -= 544982333;
				if (((Class60) (((Class432_Sub1_Sub1_Sub1) this).aClass60_10020)).anInt558 * 1952266773 == 0)
					((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).aString556 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.cg(").append(')').toString());
		}
	}

	public void method5426() {
		int i = ((-32272369 * ((Class432_Sub1_Sub1_Sub1) this).anInt10009 - 1 << 8) + 240);
		Class260 class260 = method5346().aClass260_2606;
		aShort9922 = (short) ((int) class260.aFloat2716 - i >> 9);
		aShort9921 = (short) ((int) class260.aFloat2711 - i >> 9);
		aShort9920 = (short) (i + (int) class260.aFloat2716 >> 9);
		aShort9923 = (short) ((int) class260.aFloat2711 + i >> 9);
	}

	public void method5427(String string, int i, int i_80_, int i_81_, byte i_82_) {
		try {
			if (null == ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020)
				((Class432_Sub1_Sub1_Sub1) this).aClass60_10020 = new Class60();
			((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).aString556 = string;
			((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).anInt555 = 1642351287 * i;
			((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).anInt554 = 1687686081 * i_80_;
			((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).anInt558 = (((Class60) ((Class432_Sub1_Sub1_Sub1) this).aClass60_10020).anInt557 = i_81_ * -115157411) * 503970913;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.db(").append(')').toString());
		}
	}

	public abstract int method5428();

	boolean method5429(int i) {
		try {
			if (-1 == 241513413 * ((Class432_Sub1_Sub1_Sub1) this).anInt10016)
				return false;
			return method5430((241513413 * ((Class432_Sub1_Sub1_Sub1) this).anInt10016), (byte) -94);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.dg(").append(')').toString());
		}
	}

	boolean method5430(int i, byte i_83_) {
		try {
			if (anInt10068 * 2084653365 == i)
				return true;
			aClass120_10067 = Class139.method1613(i, null, null, true, 158913463);
			if (aClass120_10067 == null)
				return false;
			anInt10068 = i * -105152227;
			Class94.method1091(aClass120_10067.aClass114Array1400, (byte) -18);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.dz(").append(')').toString());
		}
	}

	void method5431(byte i) {
		try {
			if (-1 != anInt10068 * 2084653365) {
				Class152.method1790(2084653365 * anInt10068, -577035539);
				aClass120_10067 = null;
				anInt10068 = 105152227;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.dr(").append(')').toString());
		}
	}

	public void method5432(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_) {
		try {
			if (method5429(-1715224994))
				client.method3917(aClass120_10067, aClass120_10067.method1442((byte) -24), -1, i, i_84_, i_85_, i_86_, i_87_, i_88_, i_89_, i_90_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.do(").append(')').toString());
		}
	}

	public void method5433(int i, int i_92_, boolean bool, int i_93_) {
		try {
			if (method5429(-745247645))
				ItemEquipDefinitions.method6214(aClass120_10067.aClass114Array1400, -1, i, i_92_, bool, (byte) 24);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.dh(").append(')').toString());
		}
	}

	public abstract int method5434(int i);

	boolean method5374() {
		return false;
	}

	public abstract int method5435(int i);

	boolean method5376() {
		return false;
	}

	boolean method5377() {
		return ((Class432_Sub1_Sub1_Sub1) this).aBoolean10011;
	}

	boolean method5378() {
		return ((Class432_Sub1_Sub1_Sub1) this).aBoolean10011;
	}

	public Class364 method5436(int i) {
		try {
			int i_94_ = method5424((byte) -70);
			if (-1 == i_94_)
				return Class362.aClass364_3794;
			return Class102.aClass362_924.method4254(i_94_, 1312631242);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.co(").append(')').toString());
		}
	}

	public int method5394() {
		if (-32768 == ((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347)
			return 0;
		return -2053612347 * ((Class432_Sub1_Sub1_Sub1) this).anInt10007;
	}

	public int method5381() {
		if (-32768 == ((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347)
			return 0;
		return -2053612347 * ((Class432_Sub1_Sub1_Sub1) this).anInt10007;
	}

	public int method5366() {
		if (-32768 == ((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347)
			return 0;
		return -2053612347 * ((Class432_Sub1_Sub1_Sub1) this).anInt10007;
	}

	public abstract Class60 method5437(byte i);

	void method5438(int i, int i_95_, int i_96_, int i_97_, int i_98_, byte i_99_) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			int i_100_ = aShort9920 + aShort9922 >> 1;
			int i_101_ = aShort9923 + aShort9921 >> 1;
			int i_102_ = Class257.anIntArray2683[i];
			int i_103_ = Class257.anIntArray2684[i];
			int i_104_ = -i_95_ / 2;
			int i_105_ = -i_96_ / 2;
			int i_106_ = i_102_ * i_105_ + i_104_ * i_103_ >> 14;
			int i_107_ = i_105_ * i_103_ - i_104_ * i_102_ >> 14;
			int i_108_ = Class166_Sub1.method1999((int) class260.aFloat2716 + i_106_, i_107_ + (int) class260.aFloat2711, i_100_, i_101_, aByte8658, (byte) 73);
			int i_109_ = i_95_ / 2;
			int i_110_ = -i_96_ / 2;
			int i_111_ = i_103_ * i_109_ + i_110_ * i_102_ >> 14;
			int i_112_ = i_103_ * i_110_ - i_102_ * i_109_ >> 14;
			int i_113_ = Class166_Sub1.method1999(i_111_ + (int) class260.aFloat2716, (int) class260.aFloat2711 + i_112_, i_100_, i_101_, aByte8658, (byte) 49);
			int i_114_ = -i_95_ / 2;
			int i_115_ = i_96_ / 2;
			int i_116_ = i_114_ * i_103_ + i_115_ * i_102_ >> 14;
			int i_117_ = i_115_ * i_103_ - i_102_ * i_114_ >> 14;
			int i_118_ = Class166_Sub1.method1999((int) class260.aFloat2716 + i_116_, (int) class260.aFloat2711 + i_117_, i_100_, i_101_, aByte8658, (byte) 123);
			int i_119_ = i_95_ / 2;
			int i_120_ = i_96_ / 2;
			int i_121_ = i_102_ * i_120_ + i_103_ * i_119_ >> 14;
			int i_122_ = i_120_ * i_103_ - i_102_ * i_119_ >> 14;
			int i_123_ = Class166_Sub1.method1999((int) class260.aFloat2716 + i_121_, (int) class260.aFloat2711 + i_122_, i_100_, i_101_, aByte8658, (byte) 79);
			int i_124_ = i_108_ < i_113_ ? i_108_ : i_113_;
			int i_125_ = i_118_ < i_123_ ? i_118_ : i_123_;
			int i_126_ = i_113_ < i_123_ ? i_113_ : i_123_;
			int i_127_ = i_108_ < i_118_ ? i_108_ : i_118_;
			((Class432_Sub1_Sub1_Sub1) this).anInt10023 = ((int) (Math.atan2((double) (i_124_ - i_125_), (double) i_96_) * 2607.5945876176133) & 0x3fff) * 385609853;
			((Class432_Sub1_Sub1_Sub1) this).anInt10035 = ((int) (Math.atan2((double) (i_127_ - i_126_), (double) i_95_) * 2607.5945876176133) & 0x3fff) * 1088471969;
			if (0 != ((Class432_Sub1_Sub1_Sub1) this).anInt10023 * -1612642091 && 0 != i_97_) {
				int i_128_ = 16384 - i_97_;
				if (-1612642091 * ((Class432_Sub1_Sub1_Sub1) this).anInt10023 > 8192) {
					if ((-1612642091 * ((Class432_Sub1_Sub1_Sub1) this).anInt10023) < i_128_)
						((Class432_Sub1_Sub1_Sub1) this).anInt10023 = 385609853 * i_128_;
				} else if ((-1612642091 * ((Class432_Sub1_Sub1_Sub1) this).anInt10023) > i_97_)
					((Class432_Sub1_Sub1_Sub1) this).anInt10023 = i_97_ * 385609853;
			}
			if (2131353697 * ((Class432_Sub1_Sub1_Sub1) this).anInt10035 != 0 && i_98_ != 0) {
				int i_129_ = 16384 - i_98_;
				if (2131353697 * ((Class432_Sub1_Sub1_Sub1) this).anInt10035 > 8192) {
					if ((((Class432_Sub1_Sub1_Sub1) this).anInt10035 * 2131353697) < i_129_)
						((Class432_Sub1_Sub1_Sub1) this).anInt10035 = 1088471969 * i_129_;
				} else if ((((Class432_Sub1_Sub1_Sub1) this).anInt10035 * 2131353697) > i_98_)
					((Class432_Sub1_Sub1_Sub1) this).anInt10035 = i_98_ * 1088471969;
			}
			((Class432_Sub1_Sub1_Sub1) this).anInt10046 = (i_108_ + i_123_) * -566693559;
			if (i_113_ + i_118_ < ((Class432_Sub1_Sub1_Sub1) this).anInt10046 * 335728889)
				((Class432_Sub1_Sub1_Sub1) this).anInt10046 = -566693559 * (i_118_ + i_113_);
			((Class432_Sub1_Sub1_Sub1) this).anInt10046 = ((((Class432_Sub1_Sub1_Sub1) this).anInt10046 * 335728889 >> 1) - (int) class260.aFloat2715) * -566693559;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.cn(").append(')').toString());
		}
	}

	public abstract boolean method5439();

	public int method5440() {
		Class364 class364 = method5436(1581967567);
		int i;
		if (-1 != -701222927 * class364.anInt3850)
			i = class364.anInt3850 * -701222927;
		else if (((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347 == -32768)
			i = 200;
		else
			i = -(((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347);
		Class241 class241 = method5346();
		int i_130_ = (int) class241.aClass260_2606.aFloat2716 >> 9;
		int i_131_ = (int) class241.aClass260_2606.aFloat2711 >> 9;
		if (aClass356_8655 != null && i_130_ >= 1 && i_131_ >= 1 && i_130_ <= client.aClass304_9030.method2990(-1148204811) - 1 && i_131_ <= client.aClass304_9030.method3033((byte) -127) - 1) {
			Class340 class340 = (aClass356_8655.aClass340ArrayArrayArray3653[aByte8658][i_130_][i_131_]);
			if (null != class340 && null != class340.aClass432_Sub1_Sub4_3386)
				return class340.aClass432_Sub1_Sub4_3386.aShort9927 + i;
		}
		return i;
	}

	public abstract boolean method5441(byte i);

	public abstract boolean method5442();

	public void method5443() {
		int i = ((-32272369 * ((Class432_Sub1_Sub1_Sub1) this).anInt10009 - 1 << 8) + 240);
		Class260 class260 = method5346().aClass260_2606;
		aShort9922 = (short) ((int) class260.aFloat2716 - i >> 9);
		aShort9921 = (short) ((int) class260.aFloat2711 - i >> 9);
		aShort9920 = (short) (i + (int) class260.aFloat2716 >> 9);
		aShort9923 = (short) ((int) class260.aFloat2711 + i >> 9);
	}

	public abstract boolean method5444();

	public void method5445(int i, int i_132_) {
		try {
			if (241513413 * ((Class432_Sub1_Sub1_Sub1) this).anInt10016 != anInt10068 * 2084653365)
				method5431((byte) -120);
			((Class432_Sub1_Sub1_Sub1) this).anInt10016 = -2072128755 * i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.ds(").append(')').toString());
		}
	}

	boolean method5379() {
		return ((Class432_Sub1_Sub1_Sub1) this).aBoolean10011;
	}

	abstract int method5446();

	public int method5364() {
		if (-32768 == ((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347)
			return 0;
		return -2053612347 * ((Class432_Sub1_Sub1_Sub1) this).anInt10007;
	}

	public abstract int method5447();

	public abstract int method5448();

	void method5449(Class_ra class_ra, Class364 class364, int i, int i_133_, int i_134_, int i_135_, int i_136_) {
		try {
			for (int i_137_ = 0; i_137_ < graphics.length; i_137_++) {
				byte i_138_ = 0;
				if (i_137_ == 0)
					i_138_ = (byte) 2;
				else if (1 == i_137_)
					i_138_ = (byte) 5;
				else if (i_137_ == 2)
					i_138_ = (byte) 1;
				else if (3 == i_137_)
					i_138_ = (byte) 7;
				Gfx class66 = graphics[i_137_];
				if (class66.id * 888084571 != -1 && !class66.aClass477_573.method5972(-776556553)) {
					Class437 class437 = Class136.aClass416_1527.method5254((class66.id * 888084571), -501311522);
					boolean bool = (class437.aByte4444 == 3 && (0 != i_133_ || 0 != i_134_));
					int i_139_ = i;
					if (bool)
						i_139_ |= 0x7;
					else {
						if (0 != class66.anInt575 * 569408161)
							i_139_ |= 0x5;
						if (0 != 1086786197 * class66.height)
							i_139_ |= 0x2;
						if (-1211464653 * class66.anInt572 >= 0)
							i_139_ |= 0x7;
					}
					Class387 class387 = (aClass387Array10066[1 + i_137_] = class437.method5583(class_ra, i_139_, class66.aClass477_573, i_138_, -1713910521));
					if (class387 != null) {
						if (class66.anInt572 * -1211464653 >= 0 && null != class364.anIntArrayArray3807 && null != (class364.anIntArrayArray3807[class66.anInt572 * -1211464653])) {
							int i_140_ = 0;
							int i_141_ = 0;
							int i_142_ = 0;
							if (class364.anIntArrayArray3807 != null && (null != (class364.anIntArrayArray3807[class66.anInt572 * -1211464653]))) {
								i_140_ += (class364.anIntArrayArray3807[-1211464653 * class66.anInt572][0]);
								i_141_ += (class364.anIntArrayArray3807[class66.anInt572 * -1211464653][1]);
								i_142_ += (class364.anIntArrayArray3807[class66.anInt572 * -1211464653][2]);
							}
							if (null != class364.anIntArrayArray3845 && (null != (class364.anIntArrayArray3845[-1211464653 * class66.anInt572]))) {
								i_140_ += (class364.anIntArrayArray3845[-1211464653 * class66.anInt572][0]);
								i_141_ += (class364.anIntArrayArray3845[-1211464653 * class66.anInt572][1]);
								i_142_ += (class364.anIntArrayArray3845[class66.anInt572 * -1211464653][2]);
							}
							if (0 != i_142_ || i_140_ != 0) {
								int i_143_ = i_135_;
								if (anIntArray10049 != null && ((anIntArray10049[-1211464653 * class66.anInt572]) != -1))
									i_143_ = (anIntArray10049[-1211464653 * class66.anInt572]);
								int i_144_ = ((class66.anInt575 * -2083190784 + i_143_ - i_135_) & 0x3fff);
								if (i_144_ != 0)
									class387.f(i_144_);
								int i_145_ = Class257.anIntArray2683[i_144_];
								int i_146_ = Class257.anIntArray2684[i_144_];
								int i_147_ = i_140_ * i_146_ + i_145_ * i_142_ >> 14;
								i_142_ = i_142_ * i_146_ - i_145_ * i_140_ >> 14;
								i_140_ = i_147_;
							}
							class387.ia(i_140_, i_141_, i_142_);
						} else if (0 != 569408161 * class66.anInt575)
							class387.f(-2083190784 * class66.anInt575);
						if (class66.height * 1086786197 != 0)
							class387.ia(0, -(class66.height * 1086786197) << 2, 0);
						if (bool) {
							if ((((Class432_Sub1_Sub1_Sub1) this).anInt10023 * -1612642091) != 0)
								class387.t(-1612642091 * (((Class432_Sub1_Sub1_Sub1) this).anInt10023));
							if (0 != 2131353697 * ((Class432_Sub1_Sub1_Sub1) this).anInt10035)
								class387.EA(2131353697 * (((Class432_Sub1_Sub1_Sub1) this).anInt10035));
							if ((((Class432_Sub1_Sub1_Sub1) this).anInt10046 * 335728889) != 0)
								class387.ia(0, (335728889 * ((Class432_Sub1_Sub1_Sub1) this).anInt10046), 0);
						}
					}
				} else
					aClass387Array10066[i_137_ + 1] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.cd(").append(')').toString());
		}
	}

	public abstract boolean method5450();

	public abstract boolean method5451();

	boolean method5375() {
		return false;
	}

	public abstract Class60 method5452();

	public int method5370(int i) {
		try {
			if (-32768 == ((Class432_Sub1_Sub1_Sub1) this).anInt10007 * -2053612347)
				return 0;
			return -2053612347 * ((Class432_Sub1_Sub1_Sub1) this).anInt10007;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.bo(").append(')').toString());
		}
	}

	public int method5453(int i) {
		try {
			return -32272369 * ((Class432_Sub1_Sub1_Sub1) this).anInt10009;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.bu(").append(')').toString());
		}
	}

	public boolean method5454(int i, int i_148_, byte i_149_) {
		try {
			if (null == anIntArray10049) {
				if (-1 == i_148_)
					return true;
				anIntArray10049 = new int[Console.aClass421_4266.disabledEquipmentSlots.length];
				for (int i_150_ = 0; i_150_ < Console.aClass421_4266.disabledEquipmentSlots.length; i_150_++)
					anIntArray10049[i_150_] = -1;
			}
			Class364 class364 = method5436(1099929383);
			int i_151_ = 256;
			if (class364.anIntArray3835 != null && class364.anIntArray3835[i] > 0)
				i_151_ = class364.anIntArray3835[i];
			if (i_148_ == -1) {
				if (-1 == anIntArray10049[i])
					return true;
				int i_152_ = aClass238_10053.method2370(784491199);
				int i_153_ = anIntArray10049[i];
				int i_154_ = i_152_ - i_153_;
				if (i_154_ >= -i_151_ && i_154_ <= i_151_) {
					anIntArray10049[i] = -1;
					for (int i_155_ = 0; (i_155_ < Console.aClass421_4266.disabledEquipmentSlots.length); i_155_++) {
						if (-1 != anIntArray10049[i_155_])
							return true;
					}
					anIntArray10049 = null;
					return true;
				}
				if (i_154_ > 0 && i_154_ <= 8192 || i_154_ <= -8192)
					anIntArray10049[i] = i_153_ + i_151_ & 0x3fff;
				else
					anIntArray10049[i] = i_153_ - i_151_ & 0x3fff;
				return false;
			}
			if (-1 == anIntArray10049[i])
				anIntArray10049[i] = aClass238_10053.method2370(1437066561);
			int i_156_ = anIntArray10049[i];
			int i_157_ = i_148_ - i_156_;
			if (i_157_ >= -i_151_ && i_157_ <= i_151_) {
				anIntArray10049[i] = i_148_;
				return true;
			}
			if (i_157_ > 0 && i_157_ <= 8192 || i_157_ <= -8192)
				anIntArray10049[i] = i_156_ + i_151_ & 0x3fff;
			else
				anIntArray10049[i] = i_156_ - i_151_ & 0x3fff;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.d(").append(')').toString());
		}
	}

	public abstract int method5455();

	public abstract int method5456();

	public abstract Class60 method5457();

	public static boolean method5458(String string, int i) {
		try {
			if (null == string)
				return false;
			for (int i_158_ = 0; i_158_ < client.anInt9256 * 652732387; i_158_++) {
				if (string.equalsIgnoreCase(client.aClass99Array9259[i_158_].aString915))
					return true;
			}
			if (string.equalsIgnoreCase(Class263_Sub2.myPlayer.aString10221))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.mr(").append(')').toString());
		}
	}

	static boolean method5459(int i, byte i_159_) {
		try {
			return (i >= -344921723 * Class476.aClass476_6899.anInt6882 && i <= -344921723 * Class476.aClass476_6887.anInt6882);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aab.p(").append(')').toString());
		}
	}
}
