/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class440 {
	public static boolean aBoolean4457 = false;
	Class436 aClass436_4458;
	public int anInt4459;
	public int anInt4460;
	public int[] anIntArray4461;
	public int anInt4462;
	public int[][] anIntArrayArray4463;
	public int anInt4464 = 1656603379;
	public boolean[] aBooleanArray4465;
	public int[] anIntArray4466;
	Class497 aClass497_4467;
	public int[] anIntArray4468;
	public int anInt4469;
	public int anInt4470 = -1396295929;
	public int[] anIntArray4471;
	public int anInt4472;
	public boolean aBoolean4473;
	public int anInt4474 = -581730223;
	public boolean aBoolean4475;
	public int[] anIntArray4476;
	public int anInt4477;
	public int[] anIntArray4478;
	public boolean aBoolean4479;
	public int anInt4480;
	protected static Class489[] aClass489Array4481;
	public static int anInt4482;
	static Class8 aClass8_4483;

	public boolean method5600(int i) {
		try {
			if (anIntArray4471 == null)
				return true;
			boolean bool = true;
			int[] is = anIntArray4471;
			for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
				int i_1_ = is[i_0_];
				if (((Class440) this).aClass436_4458.method5574(i_1_ >>> 16, -107490936) == null)
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.p(").append(')').toString());
		}
	}

	void method5601(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_2_ = class330_sub46.readUnsignedByte(-222784225);
				if (i_2_ == 0) {
					if (i != 1039140702) {
						/* empty */
					}
					break;
				}
				method5602(class330_sub46, i_2_, 723339666);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.r(").append(')').toString());
		}
	}

	void method5602(Buffer class330_sub46, int i, int i_3_) {
		try {
			if (i == 1) {
				int i_4_ = class330_sub46.readUnsignedShort(989694058);
				anIntArray4466 = new int[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
					anIntArray4466[i_5_] = class330_sub46.readUnsignedShort(972028286);
				anIntArray4471 = new int[i_4_];
				for (int i_6_ = 0; i_6_ < i_4_; i_6_++)
					anIntArray4471[i_6_] = class330_sub46.readUnsignedShort(-57869157);
				for (int i_7_ = 0; i_7_ < i_4_; i_7_++)
					anIntArray4471[i_7_] = ((class330_sub46.readUnsignedShort(1770465606) << 16) + anIntArray4471[i_7_]);
			} else if (i == 2)
				anInt4464 = class330_sub46.readUnsignedShort(1902356571) * -1656603379;
			else if (i == 3) {
				aBooleanArray4465 = new boolean[256];
				int i_8_ = class330_sub46.readUnsignedByte(1784349458);
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
					aBooleanArray4465[class330_sub46.readUnsignedByte(-232329253)] = true;
			} else if (i == 5)
				anInt4470 = class330_sub46.readUnsignedByte(1202023527) * -1138252645;
			else if (6 == i)
				anInt4474 = class330_sub46.readUnsignedShort(1897123831) * 581730223;
			else if (i == 7)
				anInt4462 = class330_sub46.readUnsignedShort(-67380386) * -966303783;
			else if (i == 8)
				anInt4469 = class330_sub46.readUnsignedByte(-137066199) * 1853601525;
			else if (9 == i)
				anInt4477 = class330_sub46.readUnsignedByte(236030852) * -1545891995;
			else if (i == 10)
				anInt4460 = class330_sub46.readUnsignedByte(1758772250) * 1004154137;
			else if (i == 11)
				anInt4472 = class330_sub46.readUnsignedByte(-96444664) * 1793490937;
			else if (12 == i) {
				int i_10_ = class330_sub46.readUnsignedByte(48551826);
				anIntArray4461 = new int[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					anIntArray4461[i_11_] = class330_sub46.readUnsignedShort(1681041407);
				for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
					anIntArray4461[i_12_] = ((class330_sub46.readUnsignedShort(1188850609) << 16) + anIntArray4461[i_12_]);
			} else if (i == 13) {
				int i_13_ = class330_sub46.readUnsignedShort(-43639832);
				anIntArrayArray4463 = new int[i_13_][];
				for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
					int i_15_ = class330_sub46.readUnsignedByte(-120787933);
					if (i_15_ > 0) {
						anIntArrayArray4463[i_14_] = new int[i_15_];
						anIntArrayArray4463[i_14_][0] = class330_sub46.readUnsignedTriByte(-1401356047);
						for (int i_16_ = 1; i_16_ < i_15_; i_16_++)
							anIntArrayArray4463[i_14_][i_16_] = class330_sub46.readUnsignedShort(1333908566);
					}
				}
			} else if (i == 14)
				aBoolean4473 = true;
			else if (i == 15)
				aBoolean4479 = true;
			else if (16 == i) {
				if (i_3_ <= 626970176) {
					/* empty */
				}
			} else if (i == 18)
				aBoolean4475 = true;
			else if (i == 19) {
				if (null == anIntArray4476) {
					anIntArray4476 = new int[anIntArrayArray4463.length];
					for (int i_17_ = 0; i_17_ < anIntArrayArray4463.length; i_17_++)
						anIntArray4476[i_17_] = 255;
				}
				anIntArray4476[class330_sub46.readUnsignedByte(917006959)] = class330_sub46.readUnsignedByte(1143235980);
			} else if (i == 20) {
				if (anIntArray4468 == null || anIntArray4478 == null) {
					anIntArray4468 = new int[anIntArrayArray4463.length];
					anIntArray4478 = new int[anIntArrayArray4463.length];
					for (int i_18_ = 0; i_18_ < anIntArrayArray4463.length; i_18_++) {
						anIntArray4468[i_18_] = 256;
						anIntArray4478[i_18_] = 256;
					}
				}
				int i_19_ = class330_sub46.readUnsignedByte(-100838560);
				anIntArray4468[i_19_] = class330_sub46.readUnsignedShort(621617751);
				anIntArray4478[i_19_] = class330_sub46.readUnsignedShort(1404685210);
			} else if (22 == i)
				anInt4480 = class330_sub46.readUnsignedByte(854434700) * 614995819;
			else if (249 == i) {
				int i_20_ = class330_sub46.readUnsignedByte(-213747423);
				if (null == ((Class440) this).aClass497_4467) {
					int i_21_ = Class136.method1594(i_20_, 2127338250);
					((Class440) this).aClass497_4467 = new Class497(i_21_);
				}
				for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
					boolean bool = class330_sub46.readUnsignedByte(831389514) == 1;
					int i_23_ = class330_sub46.readUnsignedTriByte(-1401356047);
					Class330 class330;
					if (bool)
						class330 = new Class330_Sub35(class330_sub46.readString(1374053223));
					else
						class330 = new Class330_Sub23(class330_sub46.readInt((byte) 5));
					((Class440) this).aClass497_4467.method6097(class330, (long) i_23_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.j(").append(')').toString());
		}
	}

	public int method5603(int i, int i_24_, int i_25_) {
		try {
			if (null == ((Class440) this).aClass497_4467)
				return i_24_;
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class440) this).aClass497_4467.method6094((long) i));
			if (class330_sub23 == null)
				return i_24_;
			return class330_sub23.anInt7693 * 393599711;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.o(").append(')').toString());
		}
	}

	Class440() {
		anInt4462 = 966303783;
		anInt4469 = -1177042753;
		anInt4477 = 1545891995;
		anInt4460 = -1004154137;
		anInt4472 = -707985422;
		aBoolean4473 = false;
		aBoolean4479 = false;
		aBoolean4475 = false;
		anInt4480 = -614995819;
	}

	public String method5604(int i, String string, int i_26_) {
		try {
			if (((Class440) this).aClass497_4467 == null)
				return string;
			Class330_Sub35 class330_sub35 = ((Class330_Sub35) ((Class440) this).aClass497_4467.method6094((long) i));
			if (null == class330_sub35)
				return string;
			return (String) class330_sub35.anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.s(").append(')').toString());
		}
	}

	void method5605(int i) {
		try {
			if (anInt4477 * -1566438803 == -1) {
				if (aBooleanArray4465 != null)
					anInt4477 = 1203183306;
				else
					anInt4477 = 0;
			}
			if (anInt4460 * 1438048041 == -1) {
				if (aBooleanArray4465 != null)
					anInt4460 = 2008308274;
				else
					anInt4460 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.i(").append(')').toString());
		}
	}

	static final void method5606(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class395.method4646(iComponentDefinitions, class120, class430, 1047843340);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.hq(").append(')').toString());
		}
	}

	static void method5607(int i) {
		try {
			Class9.anInt140 = 0;
			Class9.anInt138 = -744570957;
			Class9.anInt146 = -192203109;
			Class9.anInt151 = -527198423;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.r(").append(')').toString());
		}
	}

	static final void method5608(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_27_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_28_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions(i_27_, (byte) -34);
			if (i_28_ >= 1 && i_28_ <= 5 && null != itemDefinitions.inventoryOptions[i_28_ - 1])
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = itemDefinitions.inventoryOptions[i_28_ - 1];
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.abx(").append(')').toString());
		}
	}

	static final void method5609(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class474.method5920(-439994178);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("sf.acl(").append(')').toString());
		}
	}
}
