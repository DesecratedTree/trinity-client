/* Class432_Sub1_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPC extends Class432_Sub1_Sub1_Sub1 {
	public Class551 aClass551_10251;
	public int anInt10252;
	public static int anInt10253 = 1097384721;
	public Class538 aClass538_10254;
	int anInt10255;
	public static int anInt10256 = -247557835;
	public int anInt10257;
	public int anInt10258;
	public String aString10259;
	public Class67 aClass67_10260;
	public int anInt10261 = 1889414385;
	int[] anIntArray10262;
	int[] anIntArray10263;
	int anInt10264;
	int anInt10265;
	int anInt10266;

	public Class244 method75() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(aClass238_10053.anInt2581 * 142833127), 0.0F, 0.0F);
		return class244;
	}

	void method5474(int i) {
		try {
			((NPC) this).anInt10266 = (32 + (int) (Math.random() * 4.0)) * 1134855901;
			((NPC) this).anInt10264 = (3 + (int) (Math.random() * 2.0)) * 1723253765;
			((NPC) this).anInt10265 = (16 + (int) (Math.random() * 3.0)) * -1195730921;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(601409658) == 1)
				((NPC) this).anInt10255 = (int) (Math.random() * 6.0) * -1363293169;
			else
				((NPC) this).anInt10255 = (int) (Math.random() * 12.0) * -1363293169;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hm(").append(')').toString());
		}
	}

	public void method5475(Class551 class551, int i) {
		try {
			if (class551 != aClass551_10251 && Class484.aBoolean5782 && Class378.method4380(-1654044763 * anInt10008, -1137361974))
				Class513.method6194((byte) -37);
			aClass551_10251 = class551;
			if (aClass551_10251 != null) {
				aString10259 = aClass551_10251.aString6323;
				anInt10258 = aClass551_10251.anInt6348 * 810663093;
			}
			if (null != ((NPC) this).aClass388_10048)
				((NPC) this).aClass388_10048.method4563();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hv(").append(')').toString());
		}
	}

	public Class348 method5383(Class_ra class_ra, int i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.bt(").append(')').toString());
		}
	}

	final void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_0_, int i_1_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method5476(int i, int i_2_, int i_3_, int i_4_) {
		try {
			((NPC) this).anIntArray10263[i] = i_2_;
			((NPC) this).anIntArray10262[i] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hy(").append(')').toString());
		}
	}

	public final void method5477(Class293 class293, int i, byte i_5_) {
		try {
			int i_6_ = anIntArray10018[0];
			int i_7_ = anIntArray10059[0];
			switch (7494763 * class293.anInt6802) {
			case 4:
				i_7_--;
				break;
			case 3:
				i_7_++;
				break;
			case 5:
				i_6_--;
				break;
			case 6:
				i_6_++;
				break;
			case 2:
				i_6_--;
				i_7_--;
				break;
			case 0:
				i_6_--;
				i_7_++;
				break;
			case 1:
				i_6_++;
				i_7_--;
				break;
			case 7:
				i_6_++;
				i_7_++;
				break;
			}
			if (aClass477_10032.method5966(-179328072) && (aClass477_10032.method5986((byte) -104).anInt4460 * 1438048041) == 1) {
				anIntArray10030 = null;
				aClass477_10032.method5988(-1, (byte) -92);
			}
			for (int i_8_ = 0; i_8_ < graphics.length; i_8_++) {
				if (-1 != 888084571 * graphics[i_8_].id) {
					Class437 class437 = (Class136.aClass416_1527.method5254(888084571 * graphics[i_8_].id, 1331355162));
					if (class437.aBoolean4443 && -1 != class437.anInt4431 * 1258856743 && (Class201.aClass436_6511.method5570(1258856743 * class437.anInt4431, -407001567).anInt4460) * 1438048041 == 1) {
						graphics[i_8_].aClass477_573.method5988(-1, (byte) -2);
						graphics[i_8_].id = 1988601901;
					}
				}
			}
			if (815331179 * anInt10056 < anIntArray10018.length - 1)
				anInt10056 += 393772355;
			for (int i_9_ = anInt10056 * 815331179; i_9_ > 0; i_9_--) {
				anIntArray10018[i_9_] = anIntArray10018[i_9_ - 1];
				anIntArray10059[i_9_] = anIntArray10059[i_9_ - 1];
				aByteArray10017[i_9_] = aByteArray10017[i_9_ - 1];
			}
			anIntArray10018[0] = i_6_;
			anIntArray10059[0] = i_7_;
			aByteArray10017[0] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hq(").append(')').toString());
		}
	}

	public void method5478(int i, int i_10_, int i_11_, boolean bool, int i_12_, int i_13_) {
		try {
			aByte8658 = aByte8654 = (byte) i;
			if (client.aClass304_9030.method2995(1217564503).method2788(i_10_, i_11_, (byte) -14))
				aByte8654++;
			if (aClass477_10032.method5966(1324837661) && (aClass477_10032.method5986((byte) -17).anInt4460 * 1438048041) == 1) {
				anIntArray10030 = null;
				aClass477_10032.method5988(-1, (byte) -71);
			}
			for (int i_14_ = 0; i_14_ < graphics.length; i_14_++) {
				if (-1 != graphics[i_14_].id * 888084571) {
					Class437 class437 = (Class136.aClass416_1527.method5254(888084571 * graphics[i_14_].id, -1730035429));
					if (class437.aBoolean4443 && -1 != class437.anInt4431 * 1258856743 && (Class201.aClass436_6511.method5570(1258856743 * class437.anInt4431, -1355671259).anInt4460) * 1438048041 == 1) {
						graphics[i_14_].aClass477_573.method5988(-1, (byte) -38);
						graphics[i_14_].id = 1988601901;
					}
				}
			}
			if (!bool) {
				int i_15_ = i_10_ - anIntArray10018[0];
				int i_16_ = i_11_ - anIntArray10059[0];
				if (i_15_ >= -8 && i_15_ <= 8 && i_16_ >= -8 && i_16_ <= 8) {
					if (anInt10056 * 815331179 < anIntArray10018.length - 1)
						anInt10056 += 393772355;
					for (int i_17_ = anInt10056 * 815331179; i_17_ > 0; i_17_--) {
						anIntArray10018[i_17_] = anIntArray10018[i_17_ - 1];
						anIntArray10059[i_17_] = anIntArray10059[i_17_ - 1];
						aByteArray10017[i_17_] = aByteArray10017[i_17_ - 1];
					}
					anIntArray10018[0] = i_10_;
					anIntArray10059[0] = i_11_;
					aByteArray10017[0] = Class299.aClass299_6807.aByte6805;
					return;
				}
			}
			anInt10056 = 0;
			anInt10006 = 0;
			anInt10060 = 0;
			anIntArray10018[0] = i_10_;
			anIntArray10059[0] = i_11_;
			Class260 class260 = Class260.method2549(method5346().aClass260_2606);
			class260.aFloat2716 = (float) ((anIntArray10018[0] << 9) + (i_12_ << 8));
			class260.aFloat2711 = (float) ((anIntArray10059[0] << 9) + (i_12_ << 8));
			method5349(class260);
			class260.method2550();
			if (null != ((NPC) this).aClass388_10048)
				((NPC) this).aClass388_10048.method4563();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hk(").append(')').toString());
		}
	}

	int method5479() {
		if (aClass551_10251 == null)
			return 0;
		return -1813147045 * aClass551_10251.anInt6356;
	}

	Class353 method5405(Class_ra class_ra, int i) {
		try {
			if (aClass551_10251 == null || !method5483(class_ra, 526336, (byte) 24))
				return null;
			Class247 class247 = method5355();
			Class241 class241 = method5346();
			Class247 class247_18_ = class_ra.cj();
			int i_19_ = aClass238_10053.method2370(1559042988);
			Class340 class340 = (aClass356_8655.aClass340ArrayArrayArray3653[aByte8658][(int) class241.aClass260_2606.aFloat2716 >> 9][(int) class241.aClass260_2606.aFloat2711 >> 9]);
			if (null != class340 && null != class340.aClass432_Sub1_Sub4_3386) {
				int i_20_ = ((-311619403 * ((NPC) this).anInt10037) - class340.aClass432_Sub1_Sub4_3386.aShort9927);
				((NPC) this).anInt10037 = (-692101731 * (int) ((float) ((((NPC) this).anInt10037) * -311619403) - (float) i_20_ / 10.0F));
			} else
				((NPC) this).anInt10037 = (int) ((float) ((((NPC) this).anInt10037) * -311619403) - (float) ((((NPC) this).anInt10037) * -311619403) / 10.0F) * -692101731;
			class247_18_.method2454(class247);
			class247_18_.method2474(0.0F, (float) (-20 - -311619403 * (((NPC) this).anInt10037)), 0.0F);
			Class364 class364 = method5436(2048037895);
			Class551 class551 = (null != aClass551_10251.anIntArray6326 ? aClass551_10251.method6371(Class158.aClass561_6474, (byte) 106) : aClass551_10251);
			((NPC) this).aBoolean10011 = false;
			Class353 class353 = null;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -29) == 1 && class551.aBoolean6331 && class364.aBoolean3820) {
				Class477 class477 = ((aClass477_10032.method5966(-264528540) && aClass477_10032.method5972(-776556553)) ? aClass477_10032 : null);
				Class477_Sub3 class477_sub3 = ((aClass477_Sub3_10039.method5966(959965011) && (!aClass477_Sub3_10039.aBoolean8752 || class477 == null)) ? aClass477_Sub3_10039 : null);
				Class387 class387 = (Class436.method5575(class_ra, i_19_, (-1612642091 * ((NPC) this).anInt10023), (((NPC) this).anInt10035 * 2131353697), (((NPC) this).anInt10046 * 335728889), -1943771105 * aClass551_10251.anInt6295, aClass387Array10066[0], aClass551_10251.aShort6332 & 0xffff, aClass551_10251.aShort6333 & 0xffff, aClass551_10251.aByte6334 & 0xff, aClass551_10251.aByte6335 & 0xff, (class477_sub3 != null ? (Class477) class477_sub3 : class477), (byte) -14));
				if (null != class387) {
					if (aClass80Array8656 == null || (aClass80Array8656.length < aClass387Array10066.length + 1))
						method5373(aClass387Array10066.length + 1, 1188701298);
					class353 = Class497.method6105(method5486(-2083112399), (byte) 16);
					((NPC) this).aBoolean10011 = true;
					class_ra.RA(false);
					class387.method4475(class247_18_, (aClass80Array8656[aClass387Array10066.length]), 0);
					class_ra.RA(true);
				}
			}
			if (null == aClass80Array8656 || aClass80Array8656.length < aClass387Array10066.length)
				method5373(aClass387Array10066.length, 570139356);
			if (class353 == null)
				class353 = Class497.method6105(method5486(-2094339524), (byte) 16);
			method5409(class_ra, aClass387Array10066, class247_18_, false, -232994275);
			for (int i_21_ = 0; i_21_ < aClass387Array10066.length; i_21_++) {
				if (aClass387Array10066[i_21_] != null) {
					if (aClass551_10251.aBoolean6357)
						aClass387Array10066[i_21_].PA((((NPC) this).anInt10266 * 1294827893), -1167628083 * ((NPC) this).anInt10264, (((NPC) this).anInt10265 * -1769726041), 1250140911 * ((NPC) this).anInt10255);
					aClass387Array10066[i_21_].method4475(class247_18_, aClass80Array8656[i_21_], 0);
				}
			}
			if (((NPC) this).aClass388_10048 != null) {
				Class81 class81 = ((NPC) this).aClass388_10048.method4570();
				class_ra.cm(class81);
			}
			for (int i_22_ = 0; i_22_ < aClass387Array10066.length; i_22_++) {
				if (aClass387Array10066[i_22_] != null)
					((NPC) this).aBoolean10011 |= aClass387Array10066[i_22_].i();
				aClass387Array10066[i_22_] = null;
			}
			anInt10010 = client.anInt9092 * 1833919797;
			return class353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.bf(").append(')').toString());
		}
	}

	public int method5363(int i) {
		try {
			if (aClass551_10251.anIntArray6326 != null) {
				Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 67);
				if (class551 != null && -1 != -1461448351 * class551.anInt6299)
					return class551.anInt6299 * -1461448351;
			}
			return (-1461448351 * aClass551_10251.anInt6299 != -1 ? aClass551_10251.anInt6299 * -1461448351 : super.method5363(-1774023018));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.bc(").append(')').toString());
		}
	}

	public NPC(Class356 class356, int i) {
		super(class356, i);
		anInt10252 = -257803485;
		anInt10257 = -1164465883;
		aClass67_10260 = new Class67(32);
		((NPC) this).anIntArray10263 = new int[6];
		((NPC) this).anIntArray10262 = new int[6];
		method5474(-1463297950);
	}

	int method5359(int i) {
		try {
			if (aClass551_10251 == null)
				return 0;
			return -1813147045 * aClass551_10251.anInt6356;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.fp(").append(')').toString());
		}
	}

	boolean method5358(Class_ra class_ra, int i, int i_23_, int i_24_) {
		try {
			if (null == aClass551_10251 || !method5483(class_ra, 131072, (byte) -11))
				return false;
			Class247 class247 = method5355();
			boolean bool = false;
			for (int i_25_ = 0; i_25_ < aClass387Array10066.length; i_25_++) {
				if (null != aClass387Array10066[i_25_]) {
					boolean bool_26_;
					while_16_: do {
						do {
							if (aClass551_10251.anInt6356 * -1813147045 <= 0) {
								if (aClass551_10251.anInt6353 * -1468847803 == -1) {
									if (1 != (-1943771105 * aClass551_10251.anInt6295))
										break;
									if (i_24_ >= 90742394)
										throw new IllegalStateException();
								} else if (1 != (-1468847803 * aClass551_10251.anInt6353))
									break;
							}
							bool_26_ = true;
							break while_16_;
						} while (false);
						bool_26_ = false;
					} while (false);
					boolean bool_27_ = bool_26_;
					boolean bool_28_ = (aClass387Array10066[i_25_].method4458(i, i_23_, class247, bool_27_, -1813147045 * aClass551_10251.anInt6356));
					if (bool_28_) {
						bool = true;
						break;
					}
				}
			}
			for (int i_29_ = 0; i_29_ < aClass387Array10066.length; i_29_++)
				aClass387Array10066[i_29_] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.br(").append(')').toString());
		}
	}

	final boolean method5360(short i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.bi(").append(')').toString());
		}
	}

	final void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_30_, int i_31_, boolean bool, int i_32_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.bz(").append(')').toString());
		}
	}

	public Class348 method5386(Class_ra class_ra) {
		return null;
	}

	public int method5480(int i, int i_33_) {
		try {
			return ((NPC) this).anIntArray10263[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.ht(").append(')').toString());
		}
	}

	public void method5481(String string, int i, int i_34_, byte i_35_) {
		try {
			int i_36_ = (Class362.method4257(-1634342689) * (Class396.aClass417_4108.anInt4289 * 1225858749));
			method5427(string, i, i_34_, i_36_, (byte) -5);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hu(").append(')').toString());
		}
	}

	public Class60 method5408() {
		if (null != ((NPC) this).aClass60_10020 && ((Class60) (((NPC) this).aClass60_10020)).aString556 == null)
			return null;
		return ((NPC) this).aClass60_10020;
	}

	public Class60 method5437(byte i) {
		try {
			if (null != ((NPC) this).aClass60_10020 && ((Class60) (((NPC) this).aClass60_10020)).aString556 == null)
				return null;
			return ((NPC) this).aClass60_10020;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.cc(").append(')').toString());
		}
	}

	void method5404(Class_ra class_ra, int i) {
		try {
			if (null != aClass551_10251 && (((NPC) this).aBoolean10064 || method5483(class_ra, 0, (byte) 79))) {
				Class247 class247 = class_ra.cj();
				class247.method2454(method5355());
				class247.method2474(0.0F, -5.0F, 0.0F);
				method5409(class_ra, aClass387Array10066, class247, ((NPC) this).aBoolean10064, 900974383);
				for (int i_37_ = 0; i_37_ < aClass387Array10066.length; i_37_++)
					aClass387Array10066[i_37_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.bl(").append(')').toString());
		}
	}

	public Class330_Sub28 method79(int i) {
		try {
			Class381 class381 = client.aClass304_9030.method3022(-1949930154);
			return (Class512.method6189(aByte8658, ((int) method5346().aClass260_2606.aFloat2716 + -1401159168 * class381.gameSceneBaseX), -(int) method5346().aClass260_2606.aFloat2715, ((int) method5346().aClass260_2606.aFloat2711 + 470868480 * class381.gameSceneBaseY), 2009420278));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.r(").append(')').toString());
		}
	}

	public Class244 method72(int i) {
		try {
			Class244 class244 = Class244.method2428();
			class244.method2420(Class257.method2541(aClass238_10053.anInt2581 * 142833127), 0.0F, 0.0F);
			return class244;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.j(").append(')').toString());
		}
	}

	public Class244 method74() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(aClass238_10053.anInt2581 * 142833127), 0.0F, 0.0F);
		return class244;
	}

	public Class348 method5401(Class_ra class_ra) {
		return null;
	}

	public Class348 method5357(Class_ra class_ra) {
		return null;
	}

	public Class348 method5385(Class_ra class_ra) {
		return null;
	}

	public int method5434(int i) {
		try {
			return 1 + anInt10008 * -1654044763;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.dt(").append(')').toString());
		}
	}

	public Class348 method5362(Class_ra class_ra) {
		return null;
	}

	final void method5384() {
		throw new IllegalStateException();
	}

	Class353 method5380(Class_ra class_ra) {
		if (aClass551_10251 == null || !method5483(class_ra, 526336, (byte) 61))
			return null;
		Class247 class247 = method5355();
		Class241 class241 = method5346();
		Class247 class247_38_ = class_ra.cj();
		int i = aClass238_10053.method2370(1544938548);
		Class340 class340 = (aClass356_8655.aClass340ArrayArrayArray3653[aByte8658][(int) class241.aClass260_2606.aFloat2716 >> 9][(int) class241.aClass260_2606.aFloat2711 >> 9]);
		if (null != class340 && null != class340.aClass432_Sub1_Sub4_3386) {
			int i_39_ = ((-311619403 * ((NPC) this).anInt10037) - class340.aClass432_Sub1_Sub4_3386.aShort9927);
			((NPC) this).anInt10037 = -692101731 * (int) ((float) (((NPC) this).anInt10037 * -311619403) - (float) i_39_ / 10.0F);
		} else
			((NPC) this).anInt10037 = (int) ((float) ((((NPC) this).anInt10037) * -311619403) - (float) ((((NPC) this).anInt10037) * -311619403) / 10.0F) * -692101731;
		class247_38_.method2454(class247);
		class247_38_.method2474(0.0F, (float) (-20 - (-311619403 * ((NPC) this).anInt10037)), 0.0F);
		Class364 class364 = method5436(-2056145666);
		Class551 class551 = (null != aClass551_10251.anIntArray6326 ? aClass551_10251.method6371(Class158.aClass561_6474, (byte) 39) : aClass551_10251);
		((NPC) this).aBoolean10011 = false;
		Class353 class353 = null;
		if (Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5815((byte) -41) == 1 && class551.aBoolean6331 && class364.aBoolean3820) {
			Class477 class477 = ((aClass477_10032.method5966(-2112440070) && aClass477_10032.method5972(-776556553)) ? aClass477_10032 : null);
			Class477_Sub3 class477_sub3 = ((aClass477_Sub3_10039.method5966(291661312) && (!aClass477_Sub3_10039.aBoolean8752 || class477 == null)) ? aClass477_Sub3_10039 : null);
			Class387 class387 = Class436.method5575(class_ra, i, (-1612642091 * (((NPC) this).anInt10023)), (((NPC) this).anInt10035) * 2131353697, (((NPC) this).anInt10046) * 335728889, -1943771105 * aClass551_10251.anInt6295, aClass387Array10066[0], aClass551_10251.aShort6332 & 0xffff, aClass551_10251.aShort6333 & 0xffff, aClass551_10251.aByte6334 & 0xff, aClass551_10251.aByte6335 & 0xff, (class477_sub3 != null ? (Class477) class477_sub3 : class477), (byte) -122);
			if (null != class387) {
				if (aClass80Array8656 == null || (aClass80Array8656.length < aClass387Array10066.length + 1))
					method5373(aClass387Array10066.length + 1, 1237114248);
				class353 = Class497.method6105(method5486(-2115514083), (byte) 16);
				((NPC) this).aBoolean10011 = true;
				class_ra.RA(false);
				class387.method4475(class247_38_, (aClass80Array8656[aClass387Array10066.length]), 0);
				class_ra.RA(true);
			}
		}
		if (null == aClass80Array8656 || aClass80Array8656.length < aClass387Array10066.length)
			method5373(aClass387Array10066.length, 329510369);
		if (class353 == null)
			class353 = Class497.method6105(method5486(-2045673194), (byte) 16);
		method5409(class_ra, aClass387Array10066, class247_38_, false, 1702265034);
		for (int i_40_ = 0; i_40_ < aClass387Array10066.length; i_40_++) {
			if (aClass387Array10066[i_40_] != null) {
				if (aClass551_10251.aBoolean6357)
					aClass387Array10066[i_40_].PA((((NPC) this).anInt10266 * 1294827893), (-1167628083 * ((NPC) this).anInt10264), (((NPC) this).anInt10265 * -1769726041), (1250140911 * ((NPC) this).anInt10255));
				aClass387Array10066[i_40_].method4475(class247_38_, aClass80Array8656[i_40_], 0);
			}
		}
		if (((NPC) this).aClass388_10048 != null) {
			Class81 class81 = ((NPC) this).aClass388_10048.method4570();
			class_ra.cm(class81);
		}
		for (int i_41_ = 0; i_41_ < aClass387Array10066.length; i_41_++) {
			if (aClass387Array10066[i_41_] != null)
				((NPC) this).aBoolean10011 |= aClass387Array10066[i_41_].i();
			aClass387Array10066[i_41_] = null;
		}
		anInt10010 = client.anInt9092 * 1833919797;
		return class353;
	}

	void method5361(Class_ra class_ra) {
		if (null != aClass551_10251 && (((NPC) this).aBoolean10064 || method5483(class_ra, 0, (byte) 45))) {
			Class247 class247 = class_ra.cj();
			class247.method2454(method5355());
			class247.method2474(0.0F, -5.0F, 0.0F);
			method5409(class_ra, aClass387Array10066, class247, ((NPC) this).aBoolean10064, -1589845729);
			for (int i = 0; i < aClass387Array10066.length; i++)
				aClass387Array10066[i] = null;
		}
	}

	public final boolean method5482(byte i) {
		try {
			if (null == aClass551_10251)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hl(").append(')').toString());
		}
	}

	boolean method5390(Class_ra class_ra, int i, int i_42_) {
		if (null == aClass551_10251 || !method5483(class_ra, 131072, (byte) 23))
			return false;
		Class247 class247 = method5355();
		boolean bool = false;
		for (int i_43_ = 0; i_43_ < aClass387Array10066.length; i_43_++) {
			if (null != aClass387Array10066[i_43_]) {
				boolean bool_44_;
				while_17_: do {
					do {
						if (aClass551_10251.anInt6356 * -1813147045 <= 0) {
							if (aClass551_10251.anInt6353 * -1468847803 == -1) {
								if (1 != -1943771105 * aClass551_10251.anInt6295)
									break;
							} else if (1 != (-1468847803 * aClass551_10251.anInt6353))
								break;
						}
						bool_44_ = true;
						break while_17_;
					} while (false);
					bool_44_ = false;
				} while (false);
				boolean bool_45_ = bool_44_;
				boolean bool_46_ = aClass387Array10066[i_43_].method4458(i, i_42_, class247, bool_45_, (-1813147045 * (aClass551_10251.anInt6356)));
				if (bool_46_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_47_ = 0; i_47_ < aClass387Array10066.length; i_47_++)
			aClass387Array10066[i_47_] = null;
		return bool;
	}

	final boolean method5391() {
		return false;
	}

	public int method5414() {
		if (aClass551_10251.anIntArray6326 != null) {
			Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 123);
			if (class551 != null && -1 != -1461448351 * class551.anInt6299)
				return class551.anInt6299 * -1461448351;
		}
		return (-1461448351 * aClass551_10251.anInt6299 != -1 ? aClass551_10251.anInt6299 * -1461448351 : super.method5363(-1911269869));
	}

	public int method5440() {
		if (aClass551_10251.anIntArray6326 != null) {
			Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 89);
			if (class551 != null && -1 != -1461448351 * class551.anInt6299)
				return class551.anInt6299 * -1461448351;
		}
		return (-1461448351 * aClass551_10251.anInt6299 != -1 ? aClass551_10251.anInt6299 * -1461448351 : super.method5363(-1789010117));
	}

	int method5446() {
		if (anInt10257 * 423212371 != -1)
			return 423212371 * anInt10257;
		if (aClass551_10251.anIntArray6326 != null) {
			Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 98);
			if (null != class551 && -1 != -1303151019 * class551.anInt6338)
				return class551.anInt6338 * -1303151019;
		}
		return aClass551_10251.anInt6338 * -1303151019;
	}

	int method5422() {
		if (anInt10257 * 423212371 != -1)
			return 423212371 * anInt10257;
		if (aClass551_10251.anIntArray6326 != null) {
			Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 7);
			if (null != class551 && -1 != -1303151019 * class551.anInt6338)
				return class551.anInt6338 * -1303151019;
		}
		return aClass551_10251.anInt6338 * -1303151019;
	}

	public int method5447() {
		if (aClass551_10251.anIntArray6326 != null) {
			Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 43);
			if (class551 != null && -1 != class551.anInt6324 * -1339732299)
				return class551.anInt6324 * -1339732299;
		}
		return aClass551_10251.anInt6324 * -1339732299;
	}

	public int method5448() {
		if (aClass551_10251.anIntArray6326 != null) {
			Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 121);
			if (class551 != null && -1 != class551.anInt6324 * -1339732299)
				return class551.anInt6324 * -1339732299;
		}
		return aClass551_10251.anInt6324 * -1339732299;
	}

	boolean method5483(Class_ra class_ra, int i, byte i_48_) {
		try {
			int i_49_ = i;
			Class364 class364 = method5436(1142603878);
			Class477 class477 = ((aClass477_10032.method5966(130027514) && !aClass477_10032.method5972(-776556553)) ? aClass477_10032 : null);
			Class477_Sub3 class477_sub3 = ((aClass477_Sub3_10039.method5966(-1916993430) && (!aClass477_Sub3_10039.aBoolean8752 || null == class477)) ? aClass477_Sub3_10039 : null);
			int i_50_ = class364.anInt3832 * -1592628307;
			int i_51_ = 1012798073 * class364.anInt3844;
			if (0 != i_50_ || i_51_ != 0 || 0 != class364.anInt3816 * 916050153 || class364.anInt3848 * 1337095293 != 0)
				i |= 0x7;
			boolean bool = (aByte10025 != 0 && client.anInt8981 * 822953439 >= -1380082439 * anInt10041 && 822953439 * client.anInt8981 < anInt10042 * 36555437);
			if (bool)
				i |= 0x80000;
			int i_52_ = aClass238_10053.method2370(1954034407);
			Class387 class387 = (aClass387Array10066[0] = aClass551_10251.method6367(class_ra, i, Class102.aClass362_924, Class158.aClass561_6474, class477, class477_sub3, aClass477_Sub2_Sub1Array10019, anIntArray10049, i_52_, aClass538_10254, method5424((byte) -32), false, -1355404431));
			if (null == class387)
				return false;
			((NPC) this).anInt10007 = class387.YA() * 947831309;
			class387.n();
			method5421(class387, -776036997);
			if (0 != i_50_ || 0 != i_51_) {
				method5438(i_52_, i_50_, i_51_, -1057586663 * class364.anInt3834, 421741757 * class364.anInt3837, (byte) 76);
				if ((((NPC) this).anInt10023 * -1612642091) != 0)
					aClass387Array10066[0].t(-1612642091 * ((NPC) this).anInt10023);
				if ((2131353697 * ((NPC) this).anInt10035) != 0)
					aClass387Array10066[0].EA(((NPC) this).anInt10035 * 2131353697);
				if ((335728889 * ((NPC) this).anInt10046) != 0)
					aClass387Array10066[0].ia(0, 335728889 * (((NPC) this).anInt10046), 0);
			} else
				method5438(i_52_, method5453(-890018159) << 9, method5453(-1494009283) << 9, 0, 0, (byte) 17);
			if (bool)
				class387.PA(aByte10043, aByte10044, aByte10063, aByte10025 & 0xff);
			method5449(class_ra, class364, i_49_, i_50_, i_51_, i_52_, -711203220);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hi(").append(')').toString());
		}
	}

	public boolean method5444() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public Class260 method73(int i) {
		try {
			return Class260.method2548();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.i(").append(')').toString());
		}
	}

	public boolean method5450() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public boolean method5451() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public NPC(Class356 class356) {
		super(class356);
		anInt10252 = -257803485;
		anInt10257 = -1164465883;
		aClass67_10260 = new Class67(32);
		((NPC) this).anIntArray10263 = new int[6];
		((NPC) this).anIntArray10262 = new int[6];
		method5474(-851137745);
	}

	public Class244 method77() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(aClass238_10053.anInt2581 * 142833127), 0.0F, 0.0F);
		return class244;
	}

	public Class60 method5452() {
		if (null != ((NPC) this).aClass60_10020 && ((Class60) (((NPC) this).aClass60_10020)).aString556 == null)
			return null;
		return ((NPC) this).aClass60_10020;
	}

	public Class60 method5457() {
		if (null != ((NPC) this).aClass60_10020 && ((Class60) (((NPC) this).aClass60_10020)).aString556 == null)
			return null;
		return ((NPC) this).aClass60_10020;
	}

	public int method5456() {
		return 1 + anInt10008 * -1654044763;
	}

	public int method5428() {
		return 1 + anInt10008 * -1654044763;
	}

	int method5484() {
		if (aClass551_10251 == null)
			return 0;
		return -1813147045 * aClass551_10251.anInt6356;
	}

	public boolean method5442() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	final void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_53_, int i_54_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_55_, int i_56_, boolean bool) {
		throw new IllegalStateException();
	}

	int method5485() {
		if (aClass551_10251 == null)
			return 0;
		return -1813147045 * aClass551_10251.anInt6356;
	}

	public Class330_Sub28 method80() {
		Class381 class381 = client.aClass304_9030.method3022(-1159179877);
		return (Class512.method6189(aByte8658, ((int) method5346().aClass260_2606.aFloat2716 + -1401159168 * class381.gameSceneBaseX), -(int) method5346().aClass260_2606.aFloat2715, ((int) method5346().aClass260_2606.aFloat2711 + 470868480 * class381.gameSceneBaseY), 2009420278));
	}

	public Class244 method71() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(aClass238_10053.anInt2581 * 142833127), 0.0F, 0.0F);
		return class244;
	}

	public Class244 method76() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(aClass238_10053.anInt2581 * 142833127), 0.0F, 0.0F);
		return class244;
	}

	public int method5435(int i) {
		try {
			if (aClass551_10251.anIntArray6326 != null) {
				Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 115);
				if (class551 != null && -1 != class551.anInt6324 * -1339732299)
					return class551.anInt6324 * -1339732299;
			}
			return aClass551_10251.anInt6324 * -1339732299;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.cu(").append(')').toString());
		}
	}

	public Class244 method83() {
		Class244 class244 = Class244.method2428();
		class244.method2420(Class257.method2541(aClass238_10053.anInt2581 * 142833127), 0.0F, 0.0F);
		return class244;
	}

	public Class348 method5388(Class_ra class_ra) {
		return null;
	}

	boolean method5389(Class_ra class_ra, int i, int i_57_) {
		if (null == aClass551_10251 || !method5483(class_ra, 131072, (byte) 39))
			return false;
		Class247 class247 = method5355();
		boolean bool = false;
		for (int i_58_ = 0; i_58_ < aClass387Array10066.length; i_58_++) {
			if (null != aClass387Array10066[i_58_]) {
				boolean bool_59_;
				while_18_: do {
					do {
						if (aClass551_10251.anInt6356 * -1813147045 <= 0) {
							if (aClass551_10251.anInt6353 * -1468847803 == -1) {
								if (1 != -1943771105 * aClass551_10251.anInt6295)
									break;
							} else if (1 != (-1468847803 * aClass551_10251.anInt6353))
								break;
						}
						bool_59_ = true;
						break while_18_;
					} while (false);
					bool_59_ = false;
				} while (false);
				boolean bool_60_ = bool_59_;
				boolean bool_61_ = aClass387Array10066[i_58_].method4458(i, i_57_, class247, bool_60_, (-1813147045 * (aClass551_10251.anInt6356)));
				if (bool_61_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_62_ = 0; i_62_ < aClass387Array10066.length; i_62_++)
			aClass387Array10066[i_62_] = null;
		return bool;
	}

	public boolean method5439() {
		return Class396.aClass417_4108.aBoolean4288;
	}

	public Class260 method82() {
		return Class260.method2548();
	}

	final void method5387() {
		throw new IllegalStateException();
	}

	final void method5393(int i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.be(").append(')').toString());
		}
	}

	boolean method5486(int i) {
		try {
			return aClass551_10251.aBoolean6329;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hf(").append(')').toString());
		}
	}

	public Class260 method78() {
		return Class260.method2548();
	}

	int method5424(byte i) {
		try {
			if (anInt10257 * 423212371 != -1)
				return 423212371 * anInt10257;
			if (aClass551_10251.anIntArray6326 != null) {
				Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 86);
				if (null != class551 && -1 != -1303151019 * class551.anInt6338)
					return class551.anInt6338 * -1303151019;
			}
			return aClass551_10251.anInt6338 * -1303151019;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.cf(").append(')').toString());
		}
	}

	public boolean method5441(byte i) {
		try {
			return Class396.aClass417_4108.aBoolean4288;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.cx(").append(')').toString());
		}
	}

	public int method5455() {
		if (aClass551_10251.anIntArray6326 != null) {
			Class551 class551 = aClass551_10251.method6371(Class158.aClass561_6474, (byte) 115);
			if (class551 != null && -1 != class551.anInt6324 * -1339732299)
				return class551.anInt6324 * -1339732299;
		}
		return aClass551_10251.anInt6324 * -1339732299;
	}

	public Class260 method81() {
		return Class260.method2548();
	}

	public int method5487(int i, byte i_63_) {
		try {
			return ((NPC) this).anIntArray10262[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.hc(").append(')').toString());
		}
	}

	public static int method5488(int i) {
		try {
			Class549_Sub1 class549_sub1 = Class403.method4732(-469849646);
			Class345.method4012(class549_sub1, (short) 442);
			return class549_sub1.method6359((short) -24919);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.i(").append(')').toString());
		}
	}

	static final void method5489(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 499815028;
			Class513.method6194((byte) -41);
			Class258.method2545(987427245);
			Class513.anInt5964 = (-2036341573 * (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]));
			Class333.anInt3361 = ((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]) * 1385086419);
			Class_na.anInt9724 = (1792719461 * (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]));
			Class452.anInt5560 = ((((Class430) class430).anIntArray4387[3 + ((Class430) class430).anInt4376 * 1632830751]) * 1300133687);
			Class513.anInt5965 = ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 4]) * -1984871363);
			Class170.anInt1725 = (-1388007435 * (((Class430) class430).anIntArray4387[5 + ((Class430) class430).anInt4376 * 1632830751]));
			Class486.anInt5825 = (-913260699 * (((Class430) class430).anIntArray4387[6 + 1632830751 * ((Class430) class430).anInt4376]));
			IndexTable.anInt2908 = (-2100116777 * (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 7]));
			Class484.anInt5808 = ((((Class430) class430).anIntArray4387[8 + ((Class430) class430).anInt4376 * 1632830751]) * 1324467211);
			Class451.anInt6643 = ((((Class430) class430).anIntArray4387[9 + 1632830751 * ((Class430) class430).anInt4376]) * -2131823559);
			Class171.anInt1727 = ((((Class430) class430).anIntArray4387[10 + ((Class430) class430).anInt4376 * 1632830751]) * -77265445);
			Class457.anInt6842 = (-706207773 * (((Class430) class430).anIntArray4387[11 + ((Class430) class430).anInt4376 * 1632830751]));
			Class540.aClass280_6249.method2750(350647061 * Class513.anInt5965, -630136309);
			Class540.aClass280_6249.method2750(1270039645 * Class170.anInt1725, -530857321);
			Class540.aClass280_6249.method2750(Class486.anInt5825 * -319726995, -1477095284);
			Class540.aClass280_6249.method2750(IndexTable.anInt2908 * 1638486247, 977885231);
			Class540.aClass280_6249.method2750(-1498962013 * Class484.anInt5808, -746057900);
			Class540.aClass280_6249.method2750(Class457.anInt6842 * 839261643, 1877905592);
			Class484.aClass280_5822.method2750(Class457.anInt6842 * 839261643, 656599113);
			Class326.aClass61_3321 = null;
			Class150_Sub2.aClass61_7271 = null;
			Class291.aClass61_2980 = null;
			Class448.aClass61_5554 = null;
			Class146.aClass61_1614 = null;
			Class313.aClass61_6650 = null;
			Class99.aClass61_918 = null;
			Class330_Sub36_Sub12.aClass61_9714 = null;
			Class484.aBoolean5807 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aho.afl(").append(')').toString());
		}
	}
}
