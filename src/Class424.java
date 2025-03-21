/* Class424 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class424 {
	static Class378 aClass378_4326 = new Class378(128);

	Class424() throws Throwable {
		throw new Error();
	}

	static char method5305(char c, Class454 class454, byte i) {
		try {
			if (c >= '\u00c0' && c <= '\u00ff') {
				if (c >= '\u00c0' && c <= '\u00c6')
					return 'A';
				if (c == '\u00c7')
					return 'C';
				if (c >= '\u00c8' && c <= '\u00cb')
					return 'E';
				if (c >= '\u00cc' && c <= '\u00cf')
					return 'I';
				if ('\u00d1' == c && class454 != Class454.aClass454_6826)
					return 'N';
				if (c >= '\u00d2' && c <= '\u00d6')
					return 'O';
				if (c >= '\u00d9' && c <= '\u00dc')
					return 'U';
				if ('\u00dd' == c)
					return 'Y';
				if (c == '\u00df')
					return 's';
				if (c >= '\u00e0' && c <= '\u00e6')
					return 'a';
				if ('\u00e7' == c)
					return 'c';
				if (c >= '\u00e8' && c <= '\u00eb')
					return 'e';
				if (c >= '\u00ec' && c <= '\u00ef')
					return 'i';
				if ('\u00f1' == c && class454 != Class454.aClass454_6826)
					return 'n';
				if (c >= '\u00f2' && c <= '\u00f6')
					return 'o';
				if (c >= '\u00f9' && c <= '\u00fc')
					return 'u';
				if ('\u00fd' == c || c == '\u00ff')
					return 'y';
			}
			if ('\u0152' == c)
				return 'O';
			if ('\u0153' == c)
				return 'o';
			if ('\u0178' == c)
				return 'Y';
			return c;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rq.j(").append(')').toString());
		}
	}

	static final void method5306(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1316 = Class288.method2886(string, class430, 2051033008);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rq.oy(").append(')').toString());
		}
	}

	static void method5307(Class549_Sub1 class549_sub1, int i, int i_0_) {
		try {
			class549_sub1.method6362(2, (byte) 8);
			int i_1_;
			if (i > 12002) {
				Class283.method2828(116916103);
				i_1_ = 4;
			} else if (i > 5087) {
				Class95_Sub12_Sub1.method1141(496549938);
				i_1_ = 3;
			} else if (i > 2071) {
				Class51.method634(1559635556);
				i_1_ = 2;
			} else {
				Class330_Sub18.method3342(true, 1610528370);
				i_1_ = 1;
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-117764912) != 2) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 2, 1960726753);
				Class171.method2046(2, false, 1824985251);
			} else
				Class448.aClass330_Sub50_5555.method3857(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895, true, -448101109);
			Class435.method5568(1315555208);
			class549_sub1.method6360(i_1_, 95955317);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rq.s(").append(')').toString());
		}
	}

	static final void method5308(IComponentDefinitions iComponentDefinitions, int i) {
		try {
			if (-853879291 * iComponentDefinitions.anInt1207 == 545609657 * IComponentDefinitions.anInt1272) {
				if (null == (Class263_Sub2.myPlayer.aString10221)) {
					iComponentDefinitions.anInt1239 = 0;
					iComponentDefinitions.anInt1240 = 0;
				} else {
					iComponentDefinitions.anInt1296 = 2039737630;
					iComponentDefinitions.anInt1245 = ((int) (Math.sin((double) (client.anInt8981 * 822953439) / 40.0) * 256.0) & 0x7ff) * 825866507;
					iComponentDefinitions.anInt1238 = -577942351;
					iComponentDefinitions.anInt1239 = 1656594053 * client.anInt9121;
					iComponentDefinitions.anInt1240 = (Class96.method1184((Class263_Sub2.myPlayer.aString10221), 1713493636)) * -2082049399;
					Class477_Sub3 class477_sub3 = (Class263_Sub2.myPlayer.aClass477_Sub3_10039);
					if (null != class477_sub3) {
						if (null == iComponentDefinitions.aClass477_1344)
							iComponentDefinitions.aClass477_1344 = new Class477_Sub1();
						iComponentDefinitions.anInt1345 = (class477_sub3.method5967((byte) -21) * 1043475437);
						iComponentDefinitions.aClass477_1344.method5965(class477_sub3, 2141760373);
					} else
						iComponentDefinitions.aClass477_1344 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rq.lx(").append(')').toString());
		}
	}
}
