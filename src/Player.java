/* Player - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Player extends Class432_Sub1_Sub1_Sub1 {
	public boolean hidden;
	public String aString10221;
	public String displayName;
	String aString10223;
	public byte female = 0;
	public boolean isNPC;
	public int pkIcon = 1612772929;
	String title;
	public int anInt10228;
	public int anInt10229;
	public int anInt10230;
	public int anInt10231;
	public int anInt10232;
	public boolean aBoolean10233;
	public boolean aBoolean10234;
	public int anInt10235;
	public int anInt10236;
	public int anInt10237;
	public int anInt10238;
	public int anInt10239;
	public Class408 aClass408_10240;
	public int anInt10241;
	int renderId;
	public boolean aBoolean10243;
	public int anInt10244;
	public int anInt10245;
	public int anInt10246;
	public boolean aBoolean10247;
	public int prayerIcon = 641566597;
	public Class65 aClass65_10249;
	public static IndexTable aClass280_10250;

	public Class348 method5386(Class_ra class_ra) {
		return null;
	}

	public Player(Class356 class356, int i) {
		super(class356, i);
		anInt10228 = 0;
		anInt10229 = 0;
		anInt10230 = -1030261929;
		anInt10231 = 0;
		anInt10232 = 194786635;
		aBoolean10233 = false;
		anInt10246 = 0;
		anInt10235 = 2097070563;
		anInt10241 = 1433676431;
		anInt10237 = -517032045;
		anInt10238 = 1903636343;
		isNPC = false;
		anInt10236 = 0;
		anInt10239 = 1099480451;
		aBoolean10243 = false;
		aBoolean10234 = false;
		hidden = false;
		aBoolean10247 = false;
		aClass65_10249 = new Class65(16);
	}

	public String method5460(boolean bool, int i) {
		try {
			if (bool)
				return displayName;
			return aString10221;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hk(").append(')').toString());
		}
	}

	Class353 method5405(Class_ra class_ra, int i) {
		try {
			if (aClass408_10240 == null || !method5461(class_ra, 2048, -1003715179))
				return null;
			Class247 class247 = class_ra.cj();
			Class247 class247_0_ = method5355();
			Class241 class241 = method5346();
			int i_1_ = aClass238_10053.method2370(1553527579);
			Class340 class340 = (aClass356_8655.aClass340ArrayArrayArray3653[aByte8658][(int) class241.aClass260_2606.aFloat2716 >> 9][(int) class241.aClass260_2606.aFloat2711 >> 9]);
			if (null != class340 && class340.aClass432_Sub1_Sub4_3386 != null) {
				int i_2_ = ((anInt10037 * -311619403) - class340.aClass432_Sub1_Sub4_3386.aShort9927);
				anInt10037 = (int) ((float) ((anInt10037) * -311619403) - (float) i_2_ / 10.0F) * -692101731;
			} else
				anInt10037 = (int) ((float) (-311619403 * (anInt10037)) - (float) ((anInt10037) * -311619403) / 10.0F) * -692101731;
			class247.method2454(class247_0_);
			class247.method2474(0.0F, (float) (-20 - anInt10037 * -311619403), 0.0F);
			Class353 class353 = null;
			aBoolean10011 = false;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -68) == 1) {
				Class364 class364 = method5436(863604007);
				if (class364.aBoolean3820 && (aClass408_10240.anInt4210 * 1648243515 == -1 || (Class158_Sub3.aClass553_8875.method6392(aClass408_10240.anInt4210 * 1648243515, -804288586).aBoolean6331))) {
					Class477 class477 = ((aClass477_10032.method5966(461368510) && aClass477_10032.method5972(-776556553)) ? aClass477_10032 : null);
					Class477_Sub3 class477_sub3 = ((aClass477_Sub3_10039.method5966(1577780919) && (!aClass477_Sub3_10039.aBoolean8752 || null == class477)) ? aClass477_Sub3_10039 : null);
					Class387 class387 = (Class436.method5575(class_ra, i_1_, -1612642091 * anInt10023, 2131353697 * (anInt10035), (anInt10046 * 335728889), 1, aClass387Array10066[0], 0, 0, 160, 240, (class477_sub3 != null ? (Class477) class477_sub3 : class477), (byte) -42));
					if (class387 != null) {
						if (null == aClass80Array8656 || (aClass80Array8656.length < 1 + aClass387Array10066.length))
							method5373(aClass387Array10066.length + 1, 519636417);
						class353 = Class497.method6105(true, (byte) 16);
						aBoolean10011 = true;
						class_ra.RA(false);
						class387.method4475(class247, (aClass80Array8656[aClass387Array10066.length]), 0);
						class_ra.RA(true);
					}
				}
			}
			if (Class263_Sub2.myPlayer == this) {
				for (int i_3_ = client.aClass3Array8986.length - 1; i_3_ >= 0; i_3_--) {
					Class3 class3 = client.aClass3Array8986[i_3_];
					if (class3 != null && -1 != class3.anInt52 * -671052695) {
						if (class3.anInt53 * -1598012345 == 1) {
							Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) (539258015 * class3.anInt47))));
							if (null != class330_sub35) {
								NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
								Class260 class260 = (Class260.method2561(class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606, Class263_Sub2.myPlayer.method5346().aClass260_2606));
								int i_4_ = (int) class260.aFloat2716;
								int i_5_ = (int) class260.aFloat2711;
								method5473(class_ra, class247, aClass387Array10066[0], (long) i_4_, (long) i_5_, class3.anInt52 * -671052695, 92160000L);
							}
						}
						if (2 == class3.anInt53 * -1598012345) {
							Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
							long l = (long) (class3.anInt51 * -729840739 - (int) class260.aFloat2716);
							long l_6_ = (long) (-848947047 * class3.anInt50 - (int) class260.aFloat2711);
							long l_7_ = (long) (class3.anInt49 * -1507987917 << 9);
							l_7_ *= l_7_;
							method5473(class_ra, class247, aClass387Array10066[0], l, l_6_, class3.anInt52 * -671052695, l_7_);
						}
						if (-1598012345 * class3.anInt53 == 10 && 539258015 * class3.anInt47 >= 0 && (class3.anInt47 * 539258015 < (client.players).length)) {
							Player class432_sub1_sub1_sub1_sub1_8_ = (client.players[class3.anInt47 * 539258015]);
							if (class432_sub1_sub1_sub1_sub1_8_ != null) {
								Class260 class260 = (Class260.method2561(class432_sub1_sub1_sub1_sub1_8_.method5346().aClass260_2606, Class263_Sub2.myPlayer.method5346().aClass260_2606));
								int i_9_ = (int) class260.aFloat2716;
								int i_10_ = (int) class260.aFloat2711;
								method5473(class_ra, class247, aClass387Array10066[0], (long) i_9_, (long) i_10_, -671052695 * class3.anInt52, 92160000L);
							}
						}
					}
				}
			}
			class247.method2454(class247_0_);
			class247.method2474(0.0F, (float) (-5 - anInt10037 * -311619403), 0.0F);
			if (aClass80Array8656 == null || aClass80Array8656.length < aClass387Array10066.length)
				method5373(aClass387Array10066.length, 1916828018);
			if (null == class353)
				class353 = Class497.method6105(true, (byte) 16);
			method5409(class_ra, aClass387Array10066, class247, false, -1010551968);
			for (int i_11_ = 0; i_11_ < aClass387Array10066.length; i_11_++) {
				if (aClass387Array10066[i_11_] != null)
					aClass387Array10066[i_11_].method4475(class247, aClass80Array8656[i_11_], ((this == Class263_Sub2.myPlayer) ? 1 : 0));
			}
			if (aClass388_10048 != null) {
				Class81 class81 = aClass388_10048.method4570();
				class_ra.cm(class81);
			}
			for (int i_12_ = 0; i_12_ < aClass387Array10066.length; i_12_++) {
				if (null != aClass387Array10066[i_12_])
					aBoolean10011 |= aClass387Array10066[i_12_].i();
				aClass387Array10066[i_12_] = null;
			}
			anInt10010 = 1833919797 * client.anInt9092;
			return class353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.bf(").append(')').toString());
		}
	}

	void method5404(Class_ra class_ra, int i) {
		try {
			if (aClass408_10240 != null && (aBoolean10064 || method5461(class_ra, 0, -1137651797))) {
				Class247 class247 = class_ra.cj();
				class247.method2455(method5346());
				class247.method2474(0.0F, -5.0F, 0.0F);
				method5409(class_ra, aClass387Array10066, class247, aBoolean10064, -614967942);
				for (int i_13_ = 0; i_13_ < aClass387Array10066.length; i_13_++)
					aClass387Array10066[i_13_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.bl(").append(')').toString());
		}
	}

	public Player(Class356 class356) {
		super(class356);
		anInt10228 = 0;
		anInt10229 = 0;
		anInt10230 = -1030261929;
		anInt10231 = 0;
		anInt10232 = 194786635;
		aBoolean10233 = false;
		anInt10246 = 0;
		anInt10235 = 2097070563;
		anInt10241 = 1433676431;
		anInt10237 = -517032045;
		anInt10238 = 1903636343;
		isNPC = false;
		anInt10236 = 0;
		anInt10239 = 1099480451;
		aBoolean10243 = false;
		aBoolean10234 = false;
		hidden = false;
		aBoolean10247 = false;
		aClass65_10249 = new Class65(16);
	}

	boolean method5461(Class_ra class_ra, int i, int i_14_) {
		try {
			int i_15_ = i;
			Class364 class364 = method5436(-1829126070);
			Class477 class477 = ((aClass477_10032.method5966(1219746848) && !aClass477_10032.method5972(-776556553)) ? aClass477_10032 : null);
			Class477_Sub3 class477_sub3 = (aClass477_Sub3_10039.method5966(417704895) && !aBoolean10233 && (!aClass477_Sub3_10039.aBoolean8752 || null == class477)) ? aClass477_Sub3_10039 : null;
			int i_16_ = -1592628307 * class364.anInt3832;
			int i_17_ = class364.anInt3844 * 1012798073;
			if (i_16_ != 0 || 0 != i_17_ || 0 != 916050153 * class364.anInt3816 || 1337095293 * class364.anInt3848 != 0)
				i |= 0x7;
			int i_18_ = aClass238_10053.method2370(1015116997);
			boolean bool = (0 != aByte10025 && 822953439 * client.anInt8981 >= -1380082439 * anInt10041 && client.anInt8981 * 822953439 < 36555437 * anInt10042);
			if (bool)
				i |= 0x80000;
			Class387 class387 = (aClass387Array10066[0] = aClass408_10240.method4762(class_ra, i, Class102.aClass362_924, Class425.aClass169_4344, Class158_Sub3.aClass553_8875, Class556.aClass510_6392, Class201.aClass436_6511, Class158.aClass561_6474, class477, class477_sub3, aClass477_Sub2_Sub1Array10019, anIntArray10049, i_18_, true, Console.aClass421_4266, (byte) -113));
			int i_19_ = Class99.method1203((byte) -67);
			if (-270157335 * Class332.anInt6617 < 96 && i_19_ > 50)
				Class464_Sub20.method5808((byte) 71);
			if (Class457.aClass457_6834 != Class404.aClass457_4162 && i_19_ < 50) {
				int i_20_;
				for (i_20_ = 50 - i_19_; i_20_ > 621120579 * client.anInt8980; client.anInt8980 += -689823637)
					Class230.aByteArrayArray2447[621120579 * client.anInt8980] = new byte[102400];
				while (i_20_ < client.anInt8980 * 621120579) {
					client.anInt8980 -= -689823637;
					Class230.aByteArrayArray2447[client.anInt8980 * 621120579] = null;
				}
			} else if (Class457.aClass457_6834 != Class404.aClass457_4162) {
				Class230.aByteArrayArray2447 = new byte[50][];
				client.anInt8980 = 0;
			}
			if (null == class387)
				return false;
			anInt10007 = class387.YA() * 947831309;
			class387.n();
			method5421(class387, -776036997);
			if (0 != i_16_ || i_17_ != 0) {
				method5438(i_18_, i_16_, i_17_, class364.anInt3834 * -1057586663, 421741757 * class364.anInt3837, (byte) 105);
				if ((-1612642091 * anInt10023) != 0)
					class387.t(-1612642091 * anInt10023);
				if (0 != (anInt10035 * 2131353697))
					class387.EA(2131353697 * anInt10035);
				if ((anInt10046 * 335728889) != 0)
					class387.ia(0, (anInt10046) * 335728889, 0);
			} else
				method5438(i_18_, method5453(-909169994) << 9, method5453(-1416511966) << 9, 0, 0, (byte) 46);
			if (bool)
				class387.PA(aByte10043, aByte10044, aByte10063, aByte10025 & 0xff);
			if (!aBoolean10233)
				method5449(class_ra, class364, i_15_, i_16_, i_17_, i_18_, -711203220);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hi(").append(')').toString());
		}
	}

	public Class260 method78() {
		return Class260.method2548();
	}

	final void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_21_, int i_22_, boolean bool) {
		throw new IllegalStateException();
	}

	public final void method5462(int i, int i_23_, byte i_24_, int i_25_) {
		try {
			if (aClass477_10032.method5966(-1590974360) && (aClass477_10032.method5986((byte) -89).anInt4460 * 1438048041) == 1) {
				anIntArray10030 = null;
				aClass477_10032.method5988(-1, (byte) 35);
			}
			for (int i_26_ = 0; i_26_ < graphics.length; i_26_++) {
				if (888084571 * graphics[i_26_].id != -1) {
					Class437 class437 = (Class136.aClass416_1527.method5254(888084571 * graphics[i_26_].id, 101012129));
					if (class437.aBoolean4443 && -1 != 1258856743 * class437.anInt4431 && (Class201.aClass436_6511.method5570(class437.anInt4431 * 1258856743, -510246995).anInt4460) * 1438048041 == 1) {
						graphics[i_26_].aClass477_573.method5988(-1, (byte) 13);
						graphics[i_26_].id = 1988601901;
					}
				}
			}
			anInt10232 = 194786635;
			if (i < 0 || i >= client.aClass304_9030.method2990(-1508793626) || i_23_ < 0 || i_23_ >= client.aClass304_9030.method3033((byte) -53))
				method5463(i, i_23_, (short) 1007);
			else if (anIntArray10018[0] < 0 || (anIntArray10018[0] >= client.aClass304_9030.method2990(-1841443466)) || anIntArray10059[0] < 0 || (anIntArray10059[0] >= client.aClass304_9030.method3033((byte) -42)))
				method5463(i, i_23_, (short) 1007);
			else {
				if (Class299.aClass299_6808.aByte6805 == i_24_)
					Class90.method1064(this, i, i_23_, Class299.aClass299_6808.aByte6805, -1052550139);
				method5464(i, i_23_, i_24_, (byte) 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hl(").append(')').toString());
		}
	}

	public void method5463(int i, int i_27_, short i_28_) {
		try {
			anInt10056 = 0;
			anInt10006 = 0;
			anInt10060 = 0;
			anIntArray10018[0] = i;
			anIntArray10059[0] = i_27_;
			int i_29_ = method5453(-1349282652);
			Class260 class260 = Class260.method2549(method5346().aClass260_2606);
			class260.aFloat2716 = (float) (anIntArray10018[0] * 512 + 256 * i_29_);
			class260.aFloat2711 = (float) (512 * anIntArray10059[0] + i_29_ * 256);
			method5349(class260);
			class260.method2550();
			if (Class263_Sub2.myPlayer == this)
				client.aClass304_9030.method3008(241630128).method4582(575659132);
			if (null != aClass388_10048)
				aClass388_10048.method4563();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hf(").append(')').toString());
		}
	}

	public final void method5464(int i, int i_30_, byte i_31_, byte i_32_) {
		try {
			if (815331179 * anInt10056 < anIntArray10018.length - 1)
				anInt10056 += 393772355;
			for (int i_33_ = 815331179 * anInt10056; i_33_ > 0; i_33_--) {
				anIntArray10018[i_33_] = anIntArray10018[i_33_ - 1];
				anIntArray10059[i_33_] = anIntArray10059[i_33_ - 1];
				aByteArray10017[i_33_] = aByteArray10017[i_33_ - 1];
			}
			anIntArray10018[0] = i;
			anIntArray10059[0] = i_30_;
			aByteArray10017[0] = i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.ht(").append(')').toString());
		}
	}

	public boolean method5450() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class348 method5383(Class_ra class_ra, int i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.bt(").append(')').toString());
		}
	}

	public final boolean method5465(byte i) {
		try {
			if (null == aClass408_10240)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hc(").append(')').toString());
		}
	}

	public int method5435(int i) {
		try {
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.cu(").append(')').toString());
		}
	}

	boolean method5358(Class_ra class_ra, int i, int i_34_, int i_35_) {
		try {
			if (aClass408_10240 == null || !method5461(class_ra, 131072, -2055251511))
				return false;
			Class247 class247 = method5355();
			boolean bool = false;
			for (int i_36_ = 0; i_36_ < aClass387Array10066.length; i_36_++) {
				if (aClass387Array10066[i_36_] != null && aClass387Array10066[i_36_].method4458(i, i_34_, class247, true, 0)) {
					bool = true;
					break;
				}
			}
			for (int i_37_ = 0; i_37_ < aClass387Array10066.length; i_37_++)
				aClass387Array10066[i_37_] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.br(").append(')').toString());
		}
	}

	final boolean method5360(short i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.bi(").append(')').toString());
		}
	}

	final void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_38_, int i_39_, boolean bool, int i_40_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.bz(").append(')').toString());
		}
	}

	final void method5393(int i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.be(").append(')').toString());
		}
	}

	public boolean method5441(byte i) {
		try {
			return Class396.aClass417_4108.aBoolean4276;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.cx(").append(')').toString());
		}
	}

	public Class60 method5437(byte i) {
		try {
			if (null != aClass60_10020) {
				if (((Class60) (aClass60_10020)).aString556 == null)
					return null;
				if (1708636109 * client.anInt9227 == 0 || client.anInt9227 * 1708636109 == 3 || (1 == client.anInt9227 * 1708636109 && Class432_Sub1_Sub1_Sub1.method5458(aString10221, -47306769)))
					return (aClass60_10020);
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.cc(").append(')').toString());
		}
	}

	public void method5466(String string, int i, int i_41_, int i_42_) {
		try {
			method5427(string, i, i_41_, (Class362.method4257(1095252149) * (-2114418557 * Class396.aClass417_4108.anInt4283)), (byte) 47);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hy(").append(')').toString());
		}
	}

	public Class330_Sub28 method79(int i) {
		try {
			Class381 class381 = client.aClass304_9030.method3022(-913150236);
			return (Class512.method6189(aByte8658, ((int) method5346().aClass260_2606.aFloat2716 + -1401159168 * class381.gameSceneBaseX), -(int) method5346().aClass260_2606.aFloat2715, ((int) method5346().aClass260_2606.aFloat2711 + 470868480 * class381.gameSceneBaseY), 2009420278));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.r(").append(')').toString());
		}
	}

	public Class244 method72(int i) {
		try {
			Class244 class244 = Class244.method2428();
			class244.method2420(Class257.method2541(142833127 * (aClass238_10053.anInt2581)), 0.0F, 0.0F);
			return class244;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.j(").append(')').toString());
		}
	}

	public Class260 method73(int i) {
		try {
			return Class260.method2548();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.i(").append(')').toString());
		}
	}

	public int method5434(int i) {
		try {
			return -(anInt10008 * -1654044763) - 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.dt(").append(')').toString());
		}
	}

	int method5422() {
		return 1813242273 * renderId;
	}

	public Class348 method5385(Class_ra class_ra) {
		return null;
	}

	public Class244 method76() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(142833127 * aClass238_10053.anInt2581), 0.0F, 0.0F);
		return class244;
	}

	public Class260 method81() {
		return Class260.method2548();
	}

	public Class348 method5388(Class_ra class_ra) {
		return null;
	}

	Class353 method5380(Class_ra class_ra) {
		if (aClass408_10240 == null || !method5461(class_ra, 2048, -1257184497))
			return null;
		Class247 class247 = class_ra.cj();
		Class247 class247_43_ = method5355();
		Class241 class241 = method5346();
		int i = aClass238_10053.method2370(-461289761);
		Class340 class340 = (aClass356_8655.aClass340ArrayArrayArray3653[aByte8658][(int) class241.aClass260_2606.aFloat2716 >> 9][(int) class241.aClass260_2606.aFloat2711 >> 9]);
		if (null != class340 && class340.aClass432_Sub1_Sub4_3386 != null) {
			int i_44_ = ((anInt10037 * -311619403) - class340.aClass432_Sub1_Sub4_3386.aShort9927);
			anInt10037 = (int) ((float) ((anInt10037) * -311619403) - (float) i_44_ / 10.0F) * -692101731;
		} else
			anInt10037 = (int) ((float) (-311619403 * (anInt10037)) - (float) ((anInt10037) * -311619403) / 10.0F) * -692101731;
		class247.method2454(class247_43_);
		class247.method2474(0.0F, (float) (-20 - (anInt10037) * -311619403), 0.0F);
		Class353 class353 = null;
		aBoolean10011 = false;
		if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -106) == 1) {
			Class364 class364 = method5436(-996774346);
			if (class364.aBoolean3820 && (aClass408_10240.anInt4210 * 1648243515 == -1 || (Class158_Sub3.aClass553_8875.method6392(aClass408_10240.anInt4210 * 1648243515, -2000117426).aBoolean6331))) {
				Class477 class477 = ((aClass477_10032.method5966(470991555) && aClass477_10032.method5972(-776556553)) ? aClass477_10032 : null);
				Class477_Sub3 class477_sub3 = ((aClass477_Sub3_10039.method5966(2128014906) && (!aClass477_Sub3_10039.aBoolean8752 || null == class477)) ? aClass477_Sub3_10039 : null);
				Class387 class387 = (Class436.method5575(class_ra, i, (-1612642091 * anInt10023), (2131353697 * anInt10035), (anInt10046 * 335728889), 1, aClass387Array10066[0], 0, 0, 160, 240, (class477_sub3 != null ? (Class477) class477_sub3 : class477), (byte) -16));
				if (class387 != null) {
					if (null == aClass80Array8656 || (aClass80Array8656.length < 1 + aClass387Array10066.length))
						method5373(aClass387Array10066.length + 1, 1015273004);
					class353 = Class497.method6105(true, (byte) 16);
					aBoolean10011 = true;
					class_ra.RA(false);
					class387.method4475(class247, (aClass80Array8656[aClass387Array10066.length]), 0);
					class_ra.RA(true);
				}
			}
		}
		if (Class263_Sub2.myPlayer == this) {
			for (int i_45_ = client.aClass3Array8986.length - 1; i_45_ >= 0; i_45_--) {
				Class3 class3 = client.aClass3Array8986[i_45_];
				if (class3 != null && -1 != class3.anInt52 * -671052695) {
					if (class3.anInt53 * -1598012345 == 1) {
						Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) (539258015 * class3.anInt47))));
						if (null != class330_sub35) {
							NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
							Class260 class260 = (Class260.method2561((class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606), Class263_Sub2.myPlayer.method5346().aClass260_2606));
							int i_46_ = (int) class260.aFloat2716;
							int i_47_ = (int) class260.aFloat2711;
							method5473(class_ra, class247, aClass387Array10066[0], (long) i_46_, (long) i_47_, class3.anInt52 * -671052695, 92160000L);
						}
					}
					if (2 == class3.anInt53 * -1598012345) {
						Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
						long l = (long) (class3.anInt51 * -729840739 - (int) class260.aFloat2716);
						long l_48_ = (long) (-848947047 * class3.anInt50 - (int) class260.aFloat2711);
						long l_49_ = (long) (class3.anInt49 * -1507987917 << 9);
						l_49_ *= l_49_;
						method5473(class_ra, class247, aClass387Array10066[0], l, l_48_, class3.anInt52 * -671052695, l_49_);
					}
					if (-1598012345 * class3.anInt53 == 10 && 539258015 * class3.anInt47 >= 0 && (class3.anInt47 * 539258015 < (client.players).length)) {
						Player class432_sub1_sub1_sub1_sub1_50_ = (client.players[class3.anInt47 * 539258015]);
						if (class432_sub1_sub1_sub1_sub1_50_ != null) {
							Class260 class260 = (Class260.method2561(class432_sub1_sub1_sub1_sub1_50_.method5346().aClass260_2606, Class263_Sub2.myPlayer.method5346().aClass260_2606));
							int i_51_ = (int) class260.aFloat2716;
							int i_52_ = (int) class260.aFloat2711;
							method5473(class_ra, class247, aClass387Array10066[0], (long) i_51_, (long) i_52_, -671052695 * class3.anInt52, 92160000L);
						}
					}
				}
			}
		}
		class247.method2454(class247_43_);
		class247.method2474(0.0F, (float) (-5 - (anInt10037) * -311619403), 0.0F);
		if (aClass80Array8656 == null || aClass80Array8656.length < aClass387Array10066.length)
			method5373(aClass387Array10066.length, 572838718);
		if (null == class353)
			class353 = Class497.method6105(true, (byte) 16);
		method5409(class_ra, aClass387Array10066, class247, false, 757149189);
		for (int i_53_ = 0; i_53_ < aClass387Array10066.length; i_53_++) {
			if (aClass387Array10066[i_53_] != null)
				aClass387Array10066[i_53_].method4475(class247, aClass80Array8656[i_53_], (this == Class263_Sub2.myPlayer ? 1 : 0));
		}
		if (aClass388_10048 != null) {
			Class81 class81 = aClass388_10048.method4570();
			class_ra.cm(class81);
		}
		for (int i_54_ = 0; i_54_ < aClass387Array10066.length; i_54_++) {
			if (null != aClass387Array10066[i_54_])
				aBoolean10011 |= aClass387Array10066[i_54_].i();
			aClass387Array10066[i_54_] = null;
		}
		anInt10010 = 1833919797 * client.anInt9092;
		return class353;
	}

	void method5361(Class_ra class_ra) {
		if (aClass408_10240 != null && (aBoolean10064 || method5461(class_ra, 0, -1190335429))) {
			Class247 class247 = class_ra.cj();
			class247.method2455(method5346());
			class247.method2474(0.0F, -5.0F, 0.0F);
			method5409(class_ra, aClass387Array10066, class247, aBoolean10064, 678970274);
			for (int i = 0; i < aClass387Array10066.length; i++)
				aClass387Array10066[i] = null;
		}
	}

	boolean method5389(Class_ra class_ra, int i, int i_55_) {
		if (aClass408_10240 == null || !method5461(class_ra, 131072, -1649144417))
			return false;
		Class247 class247 = method5355();
		boolean bool = false;
		for (int i_56_ = 0; i_56_ < aClass387Array10066.length; i_56_++) {
			if (aClass387Array10066[i_56_] != null && aClass387Array10066[i_56_].method4458(i, i_55_, class247, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_57_ = 0; i_57_ < aClass387Array10066.length; i_57_++)
			aClass387Array10066[i_57_] = null;
		return bool;
	}

	final boolean method5391() {
		return false;
	}

	final void method5387() {
		throw new IllegalStateException();
	}

	final void method5384() {
		throw new IllegalStateException();
	}

	public int method5467() {
		if (aClass408_10240 != null && -1 != aClass408_10240.anInt4210 * 1648243515)
			return ((Class158_Sub3.aClass553_8875.method6392(1648243515 * aClass408_10240.anInt4210, -459672421).anInt6295) * -1943771105);
		return super.method5453(-1812300211);
	}

	public int method5468() {
		if (aClass408_10240 != null && -1 != aClass408_10240.anInt4210 * 1648243515)
			return ((Class158_Sub3.aClass553_8875.method6392(1648243515 * aClass408_10240.anInt4210, 1256217860).anInt6295) * -1943771105);
		return super.method5453(-1326643592);
	}

	public int method5469() {
		if (aClass408_10240 != null && -1 != aClass408_10240.anInt4210 * 1648243515)
			return ((Class158_Sub3.aClass553_8875.method6392(1648243515 * aClass408_10240.anInt4210, -445287415).anInt6295) * -1943771105);
		return super.method5453(-1987141837);
	}

	public int method5470() {
		if (aClass408_10240 != null && -1 != aClass408_10240.anInt4210 * 1648243515)
			return ((Class158_Sub3.aClass553_8875.method6392(1648243515 * aClass408_10240.anInt4210, -2110455100).anInt6295) * -1943771105);
		return super.method5453(-1078024714);
	}

	int method5446() {
		return 1813242273 * renderId;
	}

	public Class348 method5401(Class_ra class_ra) {
		return null;
	}

	public int method5447() {
		return -1;
	}

	public int method5448() {
		return -1;
	}

	public int method5455() {
		return -1;
	}

	public Class60 method5452() {
		if (null != aClass60_10020) {
			if (((Class60) (aClass60_10020)).aString556 == null)
				return null;
			if (1708636109 * client.anInt9227 == 0 || client.anInt9227 * 1708636109 == 3 || (1 == client.anInt9227 * 1708636109 && Class432_Sub1_Sub1_Sub1.method5458(aString10221, 343202080)))
				return aClass60_10020;
		}
		return null;
	}

	public boolean method5442() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class244 method77() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(142833127 * aClass238_10053.anInt2581), 0.0F, 0.0F);
		return class244;
	}

	public boolean method5451() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public boolean method5439() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class60 method5408() {
		if (null != aClass60_10020) {
			if (((Class60) (aClass60_10020)).aString556 == null)
				return null;
			if (1708636109 * client.anInt9227 == 0 || client.anInt9227 * 1708636109 == 3 || (1 == client.anInt9227 * 1708636109 && Class432_Sub1_Sub1_Sub1.method5458(aString10221, 1204891282)))
				return aClass60_10020;
		}
		return null;
	}

	public String method5471(boolean bool, int i) {
		try {
			String string = "";
			if (title != null)
				string = title;
			if (bool)
				string = new StringBuilder().append(string).append(displayName).toString();
			else
				string = new StringBuilder().append(string).append(aString10221).toString();
			if (null != aString10223)
				string = new StringBuilder().append(string).append(aString10223).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hq(").append(')').toString());
		}
	}

	public Class330_Sub28 method80() {
		Class381 class381 = client.aClass304_9030.method3022(1274822907);
		return (Class512.method6189(aByte8658, ((int) method5346().aClass260_2606.aFloat2716 + -1401159168 * class381.gameSceneBaseX), -(int) method5346().aClass260_2606.aFloat2715, ((int) method5346().aClass260_2606.aFloat2711 + 470868480 * class381.gameSceneBaseY), 2009420278));
	}

	public int method5428() {
		return -(anInt10008 * -1654044763) - 1;
	}

	final void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_58_, int i_59_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_60_, int i_61_, boolean bool) {
		throw new IllegalStateException();
	}

	public Class60 method5457() {
		if (null != aClass60_10020) {
			if (((Class60) (aClass60_10020)).aString556 == null)
				return null;
			if (1708636109 * client.anInt9227 == 0 || client.anInt9227 * 1708636109 == 3 || (1 == client.anInt9227 * 1708636109 && Class432_Sub1_Sub1_Sub1.method5458(aString10221, -229316765)))
				return aClass60_10020;
		}
		return null;
	}

	public Class348 method5362(Class_ra class_ra) {
		return null;
	}

	int method5424(byte i) {
		try {
			return (1813242273 * renderId);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.cf(").append(')').toString());
		}
	}

	public Class244 method74() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(142833127 * aClass238_10053.anInt2581), 0.0F, 0.0F);
		return class244;
	}

	boolean method5390(Class_ra class_ra, int i, int i_62_) {
		if (aClass408_10240 == null || !method5461(class_ra, 131072, -1141969707))
			return false;
		Class247 class247 = method5355();
		boolean bool = false;
		for (int i_63_ = 0; i_63_ < aClass387Array10066.length; i_63_++) {
			if (aClass387Array10066[i_63_] != null && aClass387Array10066[i_63_].method4458(i, i_62_, class247, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_64_ = 0; i_64_ < aClass387Array10066.length; i_64_++)
			aClass387Array10066[i_64_] = null;
		return bool;
	}

	public int method5456() {
		return -(anInt10008 * -1654044763) - 1;
	}

	public final void sendAppearance(Buffer buffer, int i) {
		try {
			buffer.offset = 0;
			int flag = buffer.readUnsignedByte(909197228);
			female = (byte) (flag & 0x1);
			boolean bool = isNPC;
			isNPC = 0 != (flag & 0x2);
			boolean showSkillLevel = (flag & 0x4) != 0;
			int i_67_ = super.method5453(-1832128296);
			method5420(1 + (flag >> 3 & 0x7), (short) -23720);
			boolean hasTitle = 0 != (flag & 0x40);
			boolean isCustomTitle = (flag & 0x80) != 0;
			Class260 class260 = Class260.method2549(method5346().aClass260_2606);
			class260.aFloat2716 += (float) (method5453(-614699555) - i_67_ << 8);
			class260.aFloat2711 += (float) (method5453(-807456602) - i_67_ << 8);
			method5349(class260);
			class260.method2550();
			//can't read jag string
			if (hasTitle)
				title = buffer.readJagString((byte) 6);
			else
				title = null;
			if (isCustomTitle)
				aString10223 = buffer.readJagString((byte) 6);
			else
				aString10223 = null;
			pkIcon = buffer.readByte((byte) 2) * -1612772929;
			prayerIcon = buffer.readByte((byte) -64) * -641566597;
			hidden = buffer.readByte((byte) -77) == 1;
			if (Class404.aClass457_4162 == Class457.aClass457_6834 && -2051927139 * client.anInt9182 >= 2)
				hidden = false;
			int i_70_ = -1;
			anInt10246 = 0;
			int[] is = new int[Console.aClass421_4266.disabledEquipmentSlots.length];
			ItemEquipDefinitions[] class518s = new ItemEquipDefinitions[Console.aClass421_4266.disabledEquipmentSlots.length];
			ItemDefinitions[] itemDefinitions = new ItemDefinitions[Console.aClass421_4266.disabledEquipmentSlots.length];
			for (int i_71_ = 0; i_71_ < Console.aClass421_4266.disabledEquipmentSlots.length; i_71_++) {
				if (1 != Console.aClass421_4266.disabledEquipmentSlots[i_71_]) {
					int i_72_ = buffer.readUnsignedByte(1563560306);
					if (i_72_ == 0)
						is[i_71_] = 0;
					else {
						int i_73_ = buffer.readUnsignedByte(1239789401);
						int i_74_ = i_73_ + (i_72_ << 8);
						if (i_71_ == 0 && i_74_ == 65535) {
							i_70_ = buffer.readBigSmart(-1914076770);
							anInt10246 = (buffer.readUnsignedByte(1631974157) * -1190225651);
							break;
						}
						if (i_74_ >= 16384) {
							i_74_ -= 16384;
							is[i_71_] = i_74_ | 0x40000000;
							itemDefinitions[i_71_] = Class556.aClass510_6392.getItemDefinitions(i_74_, (byte) -119);
							int i_75_ = itemDefinitions[i_71_].anInt6742 * -1398825521;
							if (i_75_ != 0)
								anInt10246 = -1190225651 * i_75_;
						} else
							is[i_71_] = i_74_ - 256 | ~0x7fffffff;
					}
				}
			}
			if (-1 == i_70_) {
				int i_76_ = buffer.readUnsignedShort(1778963863);
				int i_77_ = 0;
				for (int i_78_ = 0; i_78_ < Console.aClass421_4266.disabledEquipmentSlots.length; i_78_++) {
					if (0 != Console.aClass421_4266.disabledEquipmentSlots[i_78_]) {
						if (i >= 917947717)
							throw new IllegalStateException();
					} else {
						if (0 != (i_76_ & 1 << i_77_) && itemDefinitions[i_78_] != null) {
							class518s[i_78_] = Class509.getModifiedColorDefinitions(itemDefinitions[i_78_], buffer, -266430554);
						}
						i_77_++;
					}
				}
			}
			int[] is_79_ = new int[10];
			for (int i_80_ = 0; i_80_ < 10; i_80_++) {
				int i_81_ = buffer.readUnsignedByte(1543362293);
				if (Class408.modifiedModelColors.length < 1 || i_81_ < 0 || i_81_ >= (Class408.modifiedModelColors[i_80_][0]).length)
					i_81_ = 0;
				is_79_[i_80_] = i_81_;
			}
			renderId = buffer.readUnsignedShort(1132209300) * 550257249;
			displayName = buffer.readString(-111554441);
			aString10221 = displayName;
			if (Class263_Sub2.myPlayer == this)
				RuntimeException_Sub2.aString6440 = displayName;
			anInt10228 = buffer.readUnsignedByte(-154374674) * -1133701181;
			if (showSkillLevel) {
				anInt10231 = buffer.readUnsignedShort(1990974442) * 1984819857;
				if (18091633 * anInt10231 == 65535)
					anInt10231 = -1984819857;
				anInt10229 = anInt10228 * 453480323;
				anInt10230 = -1030261929;
			} else {
				anInt10231 = 0;
				anInt10229 = buffer.readUnsignedByte(1450162969) * -1821502007;
				anInt10230 = buffer.readUnsignedByte(1039107854) * 1030261929;
				if (-695019623 * anInt10230 == 255)
					anInt10230 = -1030261929;
			}
			int i_82_ = anInt10236 * 1762959971;
			anInt10236 = buffer.readUnsignedByte(110031962) * 1365176139;
			if (anInt10236 * 1762959971 != 0) {
				int i_83_ = 61699125 * anInt10235;
				int i_84_ = -242988143 * anInt10241;
				int i_85_ = anInt10237 * -1828847259;
				int i_86_ = anInt10238 * 313632185;
				int i_87_ = -817434155 * anInt10239;
				anInt10235 = buffer.readUnsignedShort(84175290) * -2097070563;
				anInt10241 = buffer.readUnsignedShort(3843677) * -1433676431;
				anInt10237 = buffer.readUnsignedShort(-66796915) * 517032045;
				anInt10238 = buffer.readUnsignedShort(1929763777) * -1903636343;
				anInt10239 = buffer.readUnsignedByte(502435342) * -180961411;
				if (isNPC != bool || i_82_ != anInt10236 * 1762959971 || anInt10235 * 61699125 != i_83_ || i_84_ != anInt10241 * -242988143 || i_85_ != -1828847259 * anInt10237 || anInt10238 * 313632185 != i_86_ || anInt10239 * -817434155 != i_87_)
					Class_ra_Sub3.method5212(this, 629226878);
			} else
				Class95_Sub13.method1145(this, (byte) -51);
			if (aClass408_10240 == null)
				aClass408_10240 = new Class408();
			int i_88_ = 1648243515 * aClass408_10240.anInt4210;
			int[] is_89_ = aClass408_10240.anIntArray4205;
			aClass408_10240.method4757(method5424((byte) -55), is, class518s, is_79_, 1 == female, i_70_, -377076171);
			if (i_70_ != i_88_) {
				class260 = Class260.method2549(method5346().aClass260_2606);
				class260.aFloat2716 = (float) ((anIntArray10018[0] << 9) + (method5453(-1355739283) << 8));
				class260.aFloat2711 = (float) ((anIntArray10059[0] << 9) + (method5453(-284022228) << 8));
				method5349(class260);
				class260.method2550();
			}
			if (client.anInt9121 * 1478725729 == anInt10008 * -1654044763 && is_89_ != null) {
				for (int i_90_ = 0; i_90_ < is_79_.length; i_90_++) {
					if (is_89_[i_90_] != is_79_[i_90_]) {
						Class556.aClass510_6392.method6171(2067341806);
						break;
					}
				}
			}
			if (aClass388_10048 != null)
				aClass388_10048.method4563();
			if (aClass477_Sub3_10039.method5966(434597075) && aClass477_Sub3_10039.aBoolean8752) {
				Class364 class364 = method5436(17272628);
				if (!class364.method4264(aClass477_Sub3_10039.method5967((byte) -6), 1984042108)) {
					aClass477_Sub3_10039.method5988(-1, (byte) 11);
					aClass477_Sub3_10039.aBoolean8752 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hm(").append(')').toString());
		}
	}

	void method5473(Class_ra class_ra, Class247 class247, Class387 class387, long l, long l_91_, int i, long l_92_) {
		try {
			long l_93_ = l * l + l_91_ * l_91_;
			if (l_93_ >= 262144L && l_93_ <= l_92_) {
				int i_94_ = ((int) ((Math.atan2((double) l, (double) l_91_) * 2607.5945876176133) - (double) aClass238_10053.method2370(454576520)) & 0x3fff);
				Class387 class387_95_ = (Class526.method6258(class_ra, i_94_, (-1612642091 * anInt10023), (2131353697 * anInt10035), (335728889 * anInt10046), i, -317256750));
				if (class387_95_ != null) {
					class_ra.RA(false);
					class387_95_.method4475(class247, null, 0);
					class_ra.RA(true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.hv(").append(')').toString());
		}
	}
	
	public static int getVolumeDistance(Player player) {
		int x1 = Class263_Sub2.myPlayer.anIntArray10018[0];
		int y1 = Class263_Sub2.myPlayer.anIntArray10059[0];
		int x2 = player.anIntArray10018[0];
		int y2 = player.anIntArray10059[0];
		System.out.println(x1+", "+y1+", "+x2+", "+y2);
		System.out.println(Class263_Sub2.myPlayer+", "+player);
		System.out.println(Class263_Sub2.myPlayer == player);
		int distance = (int) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println(distance);
		if (distance > 30)
			return 1;
		return 100-(distance*3);
	}

	public boolean method5444() {
		return Class396.aClass417_4108.aBoolean4276;
	}

	public Class244 method71() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(142833127 * aClass238_10053.anInt2581), 0.0F, 0.0F);
		return class244;
	}

	public int method5453(int i) {
		try {
			if (aClass408_10240 != null && -1 != aClass408_10240.anInt4210 * 1648243515)
				return ((Class158_Sub3.aClass553_8875.method6392(1648243515 * aClass408_10240.anInt4210, 227471962).anInt6295) * -1943771105);
			return super.method5453(-1794093608);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahg.bu(").append(')').toString());
		}
	}

	public Class244 method83() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(142833127 * aClass238_10053.anInt2581), 0.0F, 0.0F);
		return class244;
	}

	public Class244 method75() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(142833127 * aClass238_10053.anInt2581), 0.0F, 0.0F);
		return class244;
	}

	public Class260 method82() {
		return Class260.method2548();
	}

	public Class348 method5357(Class_ra class_ra) {
		return null;
	}
}
