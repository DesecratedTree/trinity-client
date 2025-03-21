/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemEquipDefinitions {
	public int[] maleEquipIds = new int[3];
	static int anInt6005 = 2;
	static int anInt6006 = 4;
	public int[] femaleEquipIds = new int[3];
	static int anInt6008 = 8;
	public short[] aShortArray6009 = new short[2];
	public int[] archiveIds2 = new int[2];
	public int[] archiveIds = new int[2];
	public short[] moreModifiedColors = new short[4];
	static int anInt6013 = 1;
	
	ItemEquipDefinitions(ItemDefinitions itemDefinitions) {
		if (itemDefinitions == null) {
			return;
		}
		maleEquipIds[0] = -1243726545 * ((ItemDefinitions) itemDefinitions).maleEquip1;
		maleEquipIds[1] = ((ItemDefinitions) itemDefinitions).maleEquip2 * -1680993213;
		maleEquipIds[2] = ((ItemDefinitions) itemDefinitions).maleEquip3 * 833495753;
		femaleEquipIds[0] = ((ItemDefinitions) itemDefinitions).femaleEquip1 * 376794177;
		femaleEquipIds[1] = ((ItemDefinitions) itemDefinitions).femaleEquip2 * -789178437;
		femaleEquipIds[2] = ((ItemDefinitions) itemDefinitions).femaleEquip3 * 1740510153;
		archiveIds2[0] = -1751509087 * ((ItemDefinitions) itemDefinitions).archiveID3;
		archiveIds2[1] = ((ItemDefinitions) itemDefinitions).archiveID4 * 654976021;
		archiveIds[0] = ((ItemDefinitions) itemDefinitions).archiveID * -1993499219;
		archiveIds[1] = ((ItemDefinitions) itemDefinitions).archiveID2 * 203069975;
		if (null != ((ItemDefinitions) itemDefinitions).modifiedModelColors) {
			moreModifiedColors = new short[((ItemDefinitions) itemDefinitions).modifiedModelColors.length];
			System.arraycopy(((ItemDefinitions) itemDefinitions).modifiedModelColors, 0, moreModifiedColors, 0, moreModifiedColors.length);
		}
		if (((ItemDefinitions) itemDefinitions).modifiedModelTextures != null) {
			aShortArray6009 = new short[((ItemDefinitions) itemDefinitions).modifiedModelTextures.length];
			System.arraycopy(((ItemDefinitions) itemDefinitions).modifiedModelTextures, 0, aShortArray6009, 0, aShortArray6009.length);
		}
	}

	static final void method6213(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (null != client.aString8968 && i_0_ < Class452.anInt5561 * 1374414177)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class95_Sub22.aClass13Array7210[i_0_].aByte173;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vk.wd(").append(')').toString());
		}
	}

	public static void method6214(IComponentDefinitions[] class114s, int i, int i_1_, int i_2_, boolean bool, byte i_3_) {
		try {
			for (int i_4_ = 0; i_4_ < class114s.length; i_4_++) {
				IComponentDefinitions iComponentDefinitions = class114s[i_4_];
				if (iComponentDefinitions == null) {
					if (i_3_ <= 1)
						break;
				} else if (i != 861085587 * iComponentDefinitions.anInt1211) {
					if (i_3_ <= 1) {
						/* empty */
					}
				} else {
					Class432_Sub1_Sub3_Sub1.method5527(iComponentDefinitions, i_1_, i_2_, bool, (byte) 63);
					Class220.method2266(iComponentDefinitions, i_1_, i_2_, 65280);
					if (-1526325919 * iComponentDefinitions.anInt1220 > (-527289817 * iComponentDefinitions.anInt1222 - -681123409 * iComponentDefinitions.anInt1210))
						iComponentDefinitions.anInt1220 = (iComponentDefinitions.anInt1222 * -553569145 - 389728527 * iComponentDefinitions.anInt1210);
					if (-1526325919 * iComponentDefinitions.anInt1220 < 0)
						iComponentDefinitions.anInt1220 = 0;
					if (742281531 * iComponentDefinitions.anInt1221 > (-284059687 * iComponentDefinitions.anInt1223 - iComponentDefinitions.anInt1348 * 694142557))
						iComponentDefinitions.anInt1221 = (-1719096837 * iComponentDefinitions.anInt1223 - iComponentDefinitions.anInt1348 * 1181863239);
					if (iComponentDefinitions.anInt1221 * 742281531 < 0)
						iComponentDefinitions.anInt1221 = 0;
					if (0 == iComponentDefinitions.anInt1198 * 1849136745)
						Class540.method6327(class114s, iComponentDefinitions, bool, -1373642655);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vk.lp(").append(')').toString());
		}
	}

	static void method6215(byte i) {
		try {
			Class360.aClass1_3783.method382(-204240300);
			((Class1) Class360.aClass1_3783).aClass330_Sub46_Sub2_17.offset = 0;
			((Class1) Class360.aClass1_3783).aClass222_20 = null;
			((Class1) Class360.aClass1_3783).aClass222_35 = null;
			((Class1) Class360.aClass1_3783).aClass222_36 = null;
			((Class1) Class360.aClass1_3783).anInt30 = 0;
			client.anInt9026 = 0;
			Class24.method484(-308227103);
			client.anInt9257 = 0;
			client.anInt9256 = 0;
			client.anInt9261 = 0;
			client.aString8968 = null;
			Class452.anInt5561 = 0;
			Class95_Sub22.aClass13Array7210 = null;
			Class412.aClass154_4258 = null;
			CacheIndex.aClass154_1450 = null;
			Class457.method5663((short) 255);
			for (int i_5_ = 0; i_5_ < 25; i_5_++) {
				client.anIntArray9117[i_5_] = 0;
				client.anIntArray9143[i_5_] = 0;
				client.anIntArray9144[i_5_] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vk.ac(").append(')').toString());
		}
	}

	public static byte method6216(char c, int i) {
		try {
			byte i_6_;
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				i_6_ = (byte) c;
			else if ('\u20ac' == c)
				i_6_ = (byte) -128;
			else if (c == '\u201a')
				i_6_ = (byte) -126;
			else if ('\u0192' == c)
				i_6_ = (byte) -125;
			else if (c == '\u201e')
				i_6_ = (byte) -124;
			else if (c == '\u2026')
				i_6_ = (byte) -123;
			else if ('\u2020' == c)
				i_6_ = (byte) -122;
			else if (c == '\u2021')
				i_6_ = (byte) -121;
			else if ('\u02c6' == c)
				i_6_ = (byte) -120;
			else if (c == '\u2030')
				i_6_ = (byte) -119;
			else if (c == '\u0160')
				i_6_ = (byte) -118;
			else if (c == '\u2039')
				i_6_ = (byte) -117;
			else if (c == '\u0152')
				i_6_ = (byte) -116;
			else if (c == '\u017d')
				i_6_ = (byte) -114;
			else if (c == '\u2018')
				i_6_ = (byte) -111;
			else if ('\u2019' == c)
				i_6_ = (byte) -110;
			else if (c == '\u201c')
				i_6_ = (byte) -109;
			else if (c == '\u201d')
				i_6_ = (byte) -108;
			else if ('\u2022' == c)
				i_6_ = (byte) -107;
			else if (c == '\u2013')
				i_6_ = (byte) -106;
			else if (c == '\u2014')
				i_6_ = (byte) -105;
			else if ('\u02dc' == c)
				i_6_ = (byte) -104;
			else if (c == '\u2122')
				i_6_ = (byte) -103;
			else if (c == '\u0161')
				i_6_ = (byte) -102;
			else if (c == '\u203a')
				i_6_ = (byte) -101;
			else if ('\u0153' == c)
				i_6_ = (byte) -100;
			else if ('\u017e' == c)
				i_6_ = (byte) -98;
			else if (c == '\u0178')
				i_6_ = (byte) -97;
			else
				i_6_ = (byte) 63;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vk.r(").append(')').toString());
		}
	}
}
