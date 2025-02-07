
/* Class298_Sub48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Preferences extends Class298 {
	public DisplayModePreference displayMode;
	static int anInt7544 = 23;
	public static int anInt7545 = 245;
	public static int anInt7546 = 500;
	public Class422_Sub2 aClass422_Sub2_7547;
	public Class422_Sub10 aClass422_Sub10_7548;
	public Class422_Sub13 aClass422_Sub13_7549;
	public Class422_Sub13 antialiasing;
	public Class422_Sub6 aClass422_Sub6_7551;
	public Class422_Sub1 aClass422_Sub1_7552;
	public Class422_Sub29 aClass422_Sub29_7553;
	public Class422_Sub24 aClass422_Sub24_7554;
	public Class422_Sub9 aClass422_Sub9_7555;
	public Class422_Sub3 aClass422_Sub3_7556;
	public Class422_Sub16 aClass422_Sub16_7557;
	public Class422_Sub11 aClass422_Sub11_7558;
	static int anInt7559 = 40;
	public Class422_Sub15 aClass422_Sub15_7560;
	public Class422_Sub18 aClass422_Sub18_7561;
	Class417 aClass417_7562;
	public Class422_Sub4 aClass422_Sub4_7563;
	public Class422_Sub17 aClass422_Sub17_7564;
	public Class422_Sub17 aClass422_Sub17_7565;
	public Class422_Sub8 aClass422_Sub8_7566;
	public Class422_Sub19 aClass422_Sub19_7567;
	Class411 aClass411_7568;
	public Class422_Sub25 aClass422_Sub25_7569;
	public Class422_Sub14 aClass422_Sub14_7570;
	public Class422_Sub14 graphicsMode;
	public Class422_Sub5 aClass422_Sub5_7572;
	public Class422_Sub28 aClass422_Sub28_7573;
	public DisplayModePreference aClass422_Sub12_7574;
	public Class422_Sub30 aClass422_Sub30_7575;
	public Class422_Sub23 aClass422_Sub23_7576;
	public Class422_Sub26 aClass422_Sub26_7577;
	public Class422_Sub20 aClass422_Sub20_7578;
	public Class422_Sub27 aClass422_Sub27_7579;
	public Class422_Sub21 aClass422_Sub21_7580;
	public Class422_Sub7 aClass422_Sub7_7581;
	public Class422_Sub29 aClass422_Sub29_7582;
	public Class422_Sub29 aClass422_Sub29_7583;
	public Class422_Sub29 aClass422_Sub29_7584;
	static int anInt7585 = 27;
	public Class422_Sub22 aClass422_Sub22_7586;
	public Class422_Sub29 aClass422_Sub29_7587;
	public static String username;
	public static int rememberUsername;
	
	void method3536(short i) {
		try {
			aClass422_Sub13_7549.method5673((byte) 52);
			antialiasing.method5673((byte) 99);
			aClass422_Sub6_7551.method5645(-537563818);
			aClass422_Sub1_7552.method5624((byte) 61);
			aClass422_Sub11_7558.method5665((byte) -6);
			aClass422_Sub24_7554.method5712((byte) -33);
			aClass422_Sub9_7555.method5656(1954264806);
			aClass422_Sub3_7556.method5634((byte) -91);
			aClass422_Sub28_7573.method5723(-921904225);
			aClass422_Sub2_7547.method5627(67108864);
			aClass422_Sub25_7569.method5715((byte) -33);
			aClass422_Sub15_7560.method5683(-2119597982);
			aClass422_Sub7_7581.method5649(-801698141);
			aClass422_Sub10_7548.method5659(-879410912);
			aClass422_Sub4_7563.method5637(1352488412);
			aClass422_Sub17_7564.method5688(1996990972);
			aClass422_Sub17_7565.method5688(1853645608);
			aClass422_Sub8_7566.method5652((short) 769);
			aClass422_Sub19_7567.method5697((short) -142);
			aClass422_Sub18_7561.method5691(-1894585587);
			aClass422_Sub16_7557.method5685(1466344729);
			aClass422_Sub14_7570.method5678((byte) 28);
			graphicsMode.method5678((byte) -80);
			aClass422_Sub5_7572.method5640(-500168009);
			displayMode.method5670(1079042483);
			aClass422_Sub12_7574.method5670(1079042483);
			aClass422_Sub30_7575.method5731(1430761433);
			aClass422_Sub23_7576.method5708(-604043841);
			aClass422_Sub26_7577.method5718(316051104);
			aClass422_Sub20_7578.method5699(-2131884322);
			aClass422_Sub27_7579.method5721((byte) -88);
			aClass422_Sub21_7580.method5702(1691541488);
			aClass422_Sub29_7553.method5727((byte) -23);
			aClass422_Sub29_7582.method5727((byte) -24);
			aClass422_Sub29_7583.method5727((byte) -13);
			aClass422_Sub29_7584.method5727((byte) -1);
			aClass422_Sub29_7587.method5727((byte) -15);
			aClass422_Sub22_7586.method5707((byte) 124);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.d(").append(')').toString());
		}
	}

	void reset(boolean force, int i) {
		try {
			if (force || aClass422_Sub13_7549 == null)
				aClass422_Sub13_7549 = new Class422_Sub13(this);
			if (force || antialiasing == null)
				antialiasing = new Class422_Sub13(aClass422_Sub13_7549.method5675(-2009967400), this);
			if (force || null == aClass422_Sub6_7551)
				aClass422_Sub6_7551 = new Class422_Sub6(this);
			if (force || null == aClass422_Sub1_7552)
				aClass422_Sub1_7552 = new Class422_Sub1(this);
			if (force || null == aClass422_Sub11_7558)
				aClass422_Sub11_7558 = new Class422_Sub11(this);
			if (force || aClass422_Sub24_7554 == null)
				aClass422_Sub24_7554 = new Class422_Sub24(this);
			if (force || null == aClass422_Sub9_7555)
				aClass422_Sub9_7555 = new Class422_Sub9(this);
			if (force || null == aClass422_Sub3_7556)
				aClass422_Sub3_7556 = new Class422_Sub3(this);
			if (force || aClass422_Sub28_7573 == null)
				aClass422_Sub28_7573 = new Class422_Sub28(this);
			if (force || aClass422_Sub2_7547 == null)
				aClass422_Sub2_7547 = new Class422_Sub2(this);
			if (force || aClass422_Sub25_7569 == null)
				aClass422_Sub25_7569 = new Class422_Sub25(this);
			if (force || aClass422_Sub15_7560 == null)
				aClass422_Sub15_7560 = new Class422_Sub15(this);
			if (force || aClass422_Sub7_7581 == null)
				aClass422_Sub7_7581 = new Class422_Sub7(this);
			if (force || null == aClass422_Sub10_7548)
				aClass422_Sub10_7548 = new Class422_Sub10(this);
			if (force || null == aClass422_Sub4_7563)
				aClass422_Sub4_7563 = new Class422_Sub4(this);
			if (force || aClass422_Sub17_7564 == null)
				aClass422_Sub17_7564 = new Class422_Sub17(this);
			if (force || aClass422_Sub17_7565 == null)
				aClass422_Sub17_7565 = new Class422_Sub17(aClass422_Sub17_7564.method5689(-2013953489), this);
			if (force || null == aClass422_Sub8_7566)
				aClass422_Sub8_7566 = new Class422_Sub8(this);
			if (force || aClass422_Sub19_7567 == null)
				aClass422_Sub19_7567 = new Class422_Sub19(this);
			if (force || null == aClass422_Sub18_7561)
				aClass422_Sub18_7561 = new Class422_Sub18(this);
			if (force || null == aClass422_Sub16_7557)
				aClass422_Sub16_7557 = new Class422_Sub16(this);
			if (force || null == aClass422_Sub14_7570)
				aClass422_Sub14_7570 = new Class422_Sub14(this);
			if (force || graphicsMode == null)
				graphicsMode = new Class422_Sub14(aClass422_Sub14_7570.method5677(-1476305765), this);
			if (force || aClass422_Sub5_7572 == null)
				aClass422_Sub5_7572 = new Class422_Sub5(this);
			if (force || displayMode == null)
				displayMode = new DisplayModePreference(this);
			if (force || aClass422_Sub12_7574 == null)
				aClass422_Sub12_7574 = new DisplayModePreference(displayMode.get((byte) 55), this);
			if (force || null == aClass422_Sub30_7575)
				aClass422_Sub30_7575 = new Class422_Sub30(this);
			if (force || null == aClass422_Sub23_7576)
				aClass422_Sub23_7576 = new Class422_Sub23(this);
			if (force || aClass422_Sub26_7577 == null)
				aClass422_Sub26_7577 = new Class422_Sub26(this);
			if (force || null == aClass422_Sub20_7578)
				aClass422_Sub20_7578 = new Class422_Sub20(this);
			if (force || null == aClass422_Sub27_7579)
				aClass422_Sub27_7579 = new Class422_Sub27(this);
			if (force || aClass422_Sub21_7580 == null)
				aClass422_Sub21_7580 = new Class422_Sub21(this);
			if (force || aClass422_Sub29_7553 == null)
				aClass422_Sub29_7553 = new Class422_Sub29(this);
			if (force || null == aClass422_Sub29_7582)
				aClass422_Sub29_7582 = new Class422_Sub29(this);
			if (force || null == aClass422_Sub29_7583)
				aClass422_Sub29_7583 = new Class422_Sub29(this);
			if (force || null == aClass422_Sub29_7584)
				aClass422_Sub29_7584 = new Class422_Sub29(this);
			if (force || null == aClass422_Sub29_7587)
				aClass422_Sub29_7587 = new Class422_Sub29(this);
			if (force || aClass422_Sub22_7586 == null)
				aClass422_Sub22_7586 = new Class422_Sub22(this);
			if (force || client.zoom == 0)
				client.zoom = 600;
			if (force || username == null)
				username = "";
			if (force || rememberUsername == 0)
				rememberUsername = 2;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.f(").append(')').toString());
		}
	}

	void method3538(RsByteBuffer class298_sub53, int protocol, int i_0_) {
		try {
			aClass422_Sub1_7552 = new Class422_Sub1(class298_sub53.readUnsignedByte(), this);
			class298_sub53.index += 116413311;
			aClass422_Sub17_7564 = new Class422_Sub17(class298_sub53.readUnsignedByte() + 1, this);
			aClass422_Sub2_7547 = new Class422_Sub2(class298_sub53.readUnsignedByte(), this);
			class298_sub53.index += 116413311;
			aClass422_Sub25_7569 = new Class422_Sub25(class298_sub53.readUnsignedByte(), this);
			aClass422_Sub9_7555 = new Class422_Sub9(class298_sub53.readUnsignedByte(), this);
			class298_sub53.readUnsignedByte();
			aClass422_Sub18_7561 = new Class422_Sub18(class298_sub53.readUnsignedByte(), this);
			int i_1_ = class298_sub53.readUnsignedByte();
			int i_2_ = 0;
			if (protocol >= 17)
				i_2_ = class298_sub53.readUnsignedByte();
			aClass422_Sub7_7581 = new Class422_Sub7(i_1_ > i_2_ ? i_1_ : i_2_, this);
			boolean bool = true;
			boolean bool_3_ = true;
			if (protocol >= 2) {
				bool = class298_sub53.readUnsignedByte() == 1;
				if (protocol >= 17)
					bool_3_ = class298_sub53.readUnsignedByte() == 1;
			} else {
				bool = class298_sub53.readUnsignedByte() == 1;
				class298_sub53.readUnsignedByte();
			}
			aClass422_Sub15_7560 = new Class422_Sub15(bool | bool_3_ ? 1 : 0, this);
			aClass422_Sub5_7572 = new Class422_Sub5(class298_sub53.readUnsignedByte(), this);
			aClass422_Sub3_7556 = new Class422_Sub3(class298_sub53.readUnsignedByte(), this);
			aClass422_Sub13_7549 = new Class422_Sub13(class298_sub53.readUnsignedByte(), this);
			aClass422_Sub22_7586 = new Class422_Sub22(class298_sub53.readUnsignedByte(), this);
			aClass422_Sub29_7553 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 20)
				aClass422_Sub29_7583 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
			else
				aClass422_Sub29_7583 = new Class422_Sub29(aClass422_Sub29_7553.method5726(-2142505283), this);
			aClass422_Sub29_7584 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
			aClass422_Sub29_7582 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 21)
				aClass422_Sub29_7587 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
			else
				aClass422_Sub29_7587 = new Class422_Sub29(aClass422_Sub29_7584.method5726(-2141789529), this);
			if (protocol >= 1) {
				class298_sub53.readUnsignedShort();
				class298_sub53.readUnsignedShort();
			}
			if (protocol >= 3 && protocol < 6)
				class298_sub53.readUnsignedByte();
			if (protocol >= 4)
				aClass422_Sub4_7563 = new Class422_Sub4(class298_sub53.readUnsignedByte(), this);
			class298_sub53.readInt((byte) -17);
			if (protocol >= 6)
				displayMode = new DisplayModePreference(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 7)
				aClass422_Sub27_7579 = new Class422_Sub27(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 8)
				class298_sub53.readUnsignedByte();
			if (protocol >= 9)
				aClass422_Sub11_7558 = new Class422_Sub11(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 10)
				aClass422_Sub6_7551 = new Class422_Sub6(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 11)
				aClass422_Sub30_7575 = new Class422_Sub30(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 12)
				aClass422_Sub25_7569 = new Class422_Sub25(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 13)
				aClass422_Sub28_7573 = new Class422_Sub28(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 14)
				aClass422_Sub14_7570 = new Class422_Sub14(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 15)
				aClass422_Sub26_7577 = new Class422_Sub26(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 16)
				aClass422_Sub16_7557 = new Class422_Sub16(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 18)
				aClass422_Sub23_7576 = new Class422_Sub23(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 19)
				aClass422_Sub8_7566 = new Class422_Sub8(class298_sub53.readUnsignedByte(), this);
			if (protocol >= 22)
				aClass422_Sub20_7578 = new Class422_Sub20(class298_sub53.readUnsignedByte(), this);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.b(").append(')').toString());
		}
	}

	public void method3539(Class422_Sub14 class422_sub14, boolean bool, int i) {
		try {
			class422_sub14.method5680(bool, 987947106);
			method3536((short) -12304);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.k(").append(')').toString());
		}
	}

	public void method3540(Preference class422, int i, int i_4_) {
		try {
			class422.method5613(i, -1130882310);
			method3536((short) -7745);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.i(").append(')').toString());
		}
	}

	public Class411 method3541(byte i) {
		try {
			return ((Preferences) this).aClass411_7568;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.u(").append(')').toString());
		}
	}

	public RsByteBuffer encode(int i) {
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(40 + 2 + 8 + 1);
			class298_sub53.writeByte(30);
			class298_sub53.writeByte(aClass422_Sub13_7549.method5675(-263957055));
			class298_sub53.writeByte(aClass422_Sub6_7551.method5647(-1699421232));
			class298_sub53.writeByte(aClass422_Sub1_7552.method5625(434246407));
			class298_sub53.writeByte(aClass422_Sub11_7558.method5667(-369768513));
			class298_sub53.writeByte(aClass422_Sub24_7554.method5713((byte) 23));
			class298_sub53.writeByte(aClass422_Sub9_7555.method5655(1995968381));
			class298_sub53.writeByte(aClass422_Sub3_7556.method5633(-521957289));
			class298_sub53.writeByte(aClass422_Sub28_7573.method5724(1089456139));
			class298_sub53.writeByte(aClass422_Sub2_7547.method5629(-952901154));
			class298_sub53.writeByte(aClass422_Sub25_7569.method5716((byte) -44));
			class298_sub53.writeByte(aClass422_Sub15_7560.method5684(-1895382088));
			class298_sub53.writeByte(aClass422_Sub7_7581.method5650(79813518));
			class298_sub53.writeByte(aClass422_Sub10_7548.method5661((byte) 124));
			class298_sub53.writeByte(aClass422_Sub4_7563.method5636(-487880226));
			class298_sub53.writeByte(aClass422_Sub17_7564.method5689(-2013953489));
			class298_sub53.writeByte(aClass422_Sub8_7566.method5654(-1747444886));
			class298_sub53.writeByte(aClass422_Sub19_7567.method5695(-1741518508));
			class298_sub53.writeByte(aClass422_Sub18_7561.method5693(-1354329238));
			class298_sub53.writeByte(aClass422_Sub16_7557.method5687(1872936450));
			class298_sub53.writeByte(aClass422_Sub14_7570.method5677(-605734712));
			class298_sub53.writeByte(0);
			class298_sub53.writeByte(aClass422_Sub5_7572.method5642(-1219854302));
			class298_sub53.writeByte(displayMode.get((byte) 99));
			class298_sub53.writeByte(aClass422_Sub30_7575.method5730(2045848485));
			class298_sub53.writeByte(aClass422_Sub23_7576.method5709(594825158));
			class298_sub53.writeByte(aClass422_Sub26_7577.method5717((byte) 1));
			class298_sub53.writeByte(aClass422_Sub20_7578.method5700(-227415438));
			class298_sub53.writeByte(aClass422_Sub27_7579.method5720((byte) -45));
			class298_sub53.writeByte(aClass422_Sub21_7580.method5703((byte) -47));
			class298_sub53.writeByte(aClass422_Sub29_7553.method5726(-2146682284));
			class298_sub53.writeByte(aClass422_Sub29_7582.method5726(-2142574071));
			class298_sub53.writeByte(aClass422_Sub29_7583.method5726(-2142179744));
			class298_sub53.writeByte(aClass422_Sub29_7584.method5726(-2145558245));
			class298_sub53.writeByte(aClass422_Sub29_7587.method5726(-2147404124));
			class298_sub53.writeByte(aClass422_Sub22_7586.method5706((byte) 98));
			class298_sub53.writeShort(client.zoom, 0);
			class298_sub53.writeLong(stringToLong(username));
			class298_sub53.writeByte(rememberUsername);
			return class298_sub53;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.p(").append(')').toString());
		}
	}
	
	public static final long stringToLong(String s) {
		long l = 0L;
		for (int i = 0; i < s.length() && i < 12; i++) {
			char c = s.charAt(i);
			l *= 37L;
			if (c >= 'A' && c <= 'Z')
				l += (1 + c) - 65;
			else if (c >= 'a' && c <= 'z')
				l += (1 + c) - 97;
			else if (c >= '0' && c <= '9')
				l += (27 + c) - 48;
		}
		while (l % 37L == 0L && l != 0L) {
			l /= 37L;
		}
		return l;
	}

	
	public static final char[] VALID_CHARS = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	
	public static final String longToString(long l) {
		if (l <= 0L || l >= 0x5b5b57f8a98a5dd1L)
			return "";
		int i = 0;
		char ac[] = new char[12];
		while (l != 0L) {
			long l1 = l;
			l /= 37L;
			ac[11 - i++] = VALID_CHARS[(int) (l1 - l * 37L)];
		}
		return new String(ac, 12 - i, i);
	}

	public Class417 method3543(int i) {
		try {
			return ((Preferences) this).aClass417_7562;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.x(").append(')').toString());
		}
	}

	void decode(RsByteBuffer class298_sub53, int i) {
		try {
			if (class298_sub53 == null || null == class298_sub53.buffer)
				reset(true, -273116061);
			else {
				int protocol = class298_sub53.readUnsignedByte();
				if (protocol < 23) {
					try {
						method3538(class298_sub53, protocol, 1254790663);
					} catch (Exception exception) {
						reset(true, 971392217);
					}
					reset(false, 964241731);
				} else if (protocol > 30)
					reset(true, -1917001762);
				else {
					aClass422_Sub13_7549 = new Class422_Sub13(class298_sub53.readUnsignedByte(), this);
					antialiasing = new Class422_Sub13(aClass422_Sub13_7549.method5675(-1467162774), this);
					aClass422_Sub6_7551 = new Class422_Sub6(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub1_7552 = new Class422_Sub1(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub11_7558 = new Class422_Sub11(class298_sub53.readUnsignedByte(), this);
					if (protocol >= 27)
						aClass422_Sub24_7554 = new Class422_Sub24(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub9_7555 = new Class422_Sub9(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub3_7556 = new Class422_Sub3(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub28_7573 = new Class422_Sub28(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub2_7547 = new Class422_Sub2(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub25_7569 = new Class422_Sub25(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub15_7560 = new Class422_Sub15(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub7_7581 = new Class422_Sub7(class298_sub53.readUnsignedByte(), this);
					if (protocol >= 24)
						aClass422_Sub10_7548 = new Class422_Sub10(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub4_7563 = new Class422_Sub4(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub17_7564 = new Class422_Sub17(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub17_7565 = new Class422_Sub17(aClass422_Sub17_7564.method5689(-2013953489), this);
					aClass422_Sub8_7566 = new Class422_Sub8(class298_sub53.readUnsignedByte(), this);
					if (protocol >= 25)
						aClass422_Sub19_7567 = new Class422_Sub19(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub18_7561 = new Class422_Sub18(class298_sub53.readUnsignedByte(), this);
					if (protocol <= 25)
						class298_sub53.index += 116413311;
					aClass422_Sub16_7557 = new Class422_Sub16(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub14_7570 = new Class422_Sub14(class298_sub53.readUnsignedByte(), this);
					graphicsMode = new Class422_Sub14(aClass422_Sub14_7570.method5677(-1765693260), this);
					class298_sub53.readUnsignedByte();
					aClass422_Sub5_7572 = new Class422_Sub5(class298_sub53.readUnsignedByte(), this);
					displayMode = new DisplayModePreference(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub12_7574 = new DisplayModePreference(displayMode.get((byte) 124), this);
					aClass422_Sub30_7575 = new Class422_Sub30(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub23_7576 = new Class422_Sub23(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub26_7577 = new Class422_Sub26(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub20_7578 = new Class422_Sub20(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub27_7579 = new Class422_Sub27(class298_sub53.readUnsignedByte(), this);
					if (protocol >= 26)
						aClass422_Sub21_7580 = new Class422_Sub21(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub29_7553 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub29_7582 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub29_7583 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub29_7584 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub29_7587 = new Class422_Sub29(class298_sub53.readUnsignedByte(), this);
					aClass422_Sub22_7586 = new Class422_Sub22(class298_sub53.readUnsignedByte(), this);
					if (protocol >= 28)
						client.zoom = class298_sub53.readUnsignedShort();
					if (protocol >= 29)
						username = longToString(class298_sub53.readLong((short) 0));
					if (protocol >= 30)
						rememberUsername = class298_sub53.readUnsignedByte();
					reset(false, 95343379);
				}
			}
			method3536((short) -25361);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aco.a(").append(')').toString());
		}
	}

	public Preferences(Class411 class411, int i) {
		((Preferences) this).aClass411_7568 = class411;
		((Preferences) this).aClass417_7562 = new Class417(Class291.maximumMemory * 1126040225, Class291.availableCPU * 1090452523, (Class344.aString3687.toLowerCase().indexOf("arm") != -1));
		graphicsMode = new Class422_Sub14(i, this);
		reset(true, -214971626);
	}

	public Preferences(RsByteBuffer class298_sub53, Class411 class411, int i) {
		((Preferences) this).aClass411_7568 = class411;
		((Preferences) this).aClass417_7562 = new Class417(Class291.maximumMemory * 1126040225, 1090452523 * Class291.availableCPU, Class344.aString3687.indexOf("arm") != -1);
		graphicsMode = new Class422_Sub14(i, this);
		decode(class298_sub53, -2103020083);
	}
}
