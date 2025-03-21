/* Class405 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class405 {
	int anInt4163;
	int anInt4164;
	int anInt4165;
	int anInt4166;
	int anInt4167;
	int anInt4168;
	int anInt4169;
	int anInt4170;
	int anInt4171;
	int anInt4172;
	int anInt4173;
	int anInt4174;

	boolean method4740(Class405 class405_0_, int i) {
		try {
			if ((536331609 * ((Class405) this).anInt4165 == ((Class405) class405_0_).anInt4165 * 536331609) && (327971141 * ((Class405) class405_0_).anInt4173 == ((Class405) this).anInt4173 * 327971141) && (-80060749 * ((Class405) class405_0_).anInt4169 == ((Class405) this).anInt4169 * -80060749))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.r(").append(')').toString());
		}
	}

	Class405() {
		/* empty */
	}

	static final void method4741(IComponentDefinitions iComponentDefinitions, int i, byte[] is, byte[] is_1_, Class430 class430, int i_2_) {
		try {
			if (iComponentDefinitions.aByteArrayArray1351 == null) {
				if (is != null) {
					iComponentDefinitions.aByteArrayArray1351 = new byte[11][];
					iComponentDefinitions.aByteArrayArray1276 = new byte[11][];
					iComponentDefinitions.anIntArray1277 = new int[11];
					iComponentDefinitions.anIntArray1278 = new int[11];
				} else
					return;
			}
			iComponentDefinitions.aByteArrayArray1351[i] = is;
			if (is != null)
				iComponentDefinitions.aBoolean1274 = true;
			else {
				iComponentDefinitions.aBoolean1274 = false;
				for (int i_3_ = 0; i_3_ < iComponentDefinitions.aByteArrayArray1351.length; i_3_++) {
					if (null != iComponentDefinitions.aByteArrayArray1351[i_3_] || iComponentDefinitions.anIntArray1278[i_3_] > 0) {
						iComponentDefinitions.aBoolean1274 = true;
						break;
					}
				}
			}
			iComponentDefinitions.aByteArrayArray1276[i] = is_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.ku(").append(')').toString());
		}
	}

	static final void method4742(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_4_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_5_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_4_ - i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.zc(").append(')').toString());
		}
	}

	static final void method4743(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_6_ == -1)
				throw new RuntimeException("");
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = new StringBuilder().append(string).append((char) i_6_).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.aay(").append(')').toString());
		}
	}

	static final void method4744(Class430 class430, int i) {
		try {
			if (Class503.aBoolean5914 && null != Class130.aFrame1498)
				Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(-1280106931), -1, -1, false, -1772393953);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.afr(").append(')').toString());
		}
	}

	static final void method4745(Class430 class430, int i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, 945582861);
			Class120 class120 = Class3.aClass120Array56[i_7_ >> 16];
			Class13.method440(iComponentDefinitions, class120, class430, -1502402238);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.op(").append(')').toString());
		}
	}

	static final void method4746(Class430 class430, int i) {
		try {
			int i_8_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class475_Sub1.method5947(((((Class430) class430).aClass330_Sub39_4395) == Class106.aClass330_Sub39_1009), i_8_, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.yn(").append(')').toString());
		}
	}

	static void method4747(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int i, int i_9_, int i_10_, int i_11_) {
		try {
			Class364 class364 = class432_sub1_sub1_sub1.method5436(951426650);
			Class477_Sub3 class477_sub3 = class432_sub1_sub1_sub1.aClass477_Sub3_10039;
			int i_12_ = ((class432_sub1_sub1_sub1.anInt10015 * 1643473031 - 142833127 * (class432_sub1_sub1_sub1.aClass238_10053.anInt2581)) & 0x3fff);
			if (Class299.aClass299_6809.aByte6805 == i) {
				if (i_12_ != 0 || class432_sub1_sub1_sub1.anInt10050 * -423961127 > 25) {
					if (i_10_ < 0 && -1 != class364.anInt3812 * -1649099791) {
						class477_sub3.method5969((class364.anInt3812 * -1649099791), false, true, -1358368698);
						class477_sub3.aBoolean8752 = false;
					} else if (i_10_ > 0 && -659327243 * class364.anInt3829 != -1) {
						class477_sub3.method5969((-659327243 * class364.anInt3829), false, true, -1438575340);
						class477_sub3.aBoolean8752 = false;
					} else if (!class477_sub3.aBoolean8752 || !(class364.method4264(class477_sub3.method5967((byte) -74), 1127211891))) {
						class477_sub3.method5969(class364.method4268(2139015436), false, true, 878793426);
						class477_sub3.aBoolean8752 = class432_sub1_sub1_sub1.aClass477_Sub3_10039.method5966(-1328344406);
					}
				} else if (!class477_sub3.aBoolean8752 || !class364.method4264(class477_sub3.method5967((byte) -59), 2088602327)) {
					class477_sub3.method5969(class364.method4268(2141235971), false, true, -1667772701);
					class477_sub3.aBoolean8752 = class477_sub3.method5966(-1177557398);
				}
			} else if (-2029779553 * class432_sub1_sub1_sub1.anInt10028 != -1 && (i_12_ >= 10240 || i_12_ <= 2048)) {
				int i_13_ = ((client.anIntArray9053[i_9_] - (class432_sub1_sub1_sub1.aClass238_10053.anInt2581 * 142833127)) & 0x3fff);
				if (i == Class299.aClass299_6808.aByte6805 && -1 != 702160037 * class364.anInt3818) {
					if (i_13_ > 2048 && i_13_ <= 6144 && class364.anInt3821 * 1886047885 != -1)
						class477_sub3.method5969((class364.anInt3821 * 1886047885), false, true, -880448917);
					else if (i_13_ >= 10240 && i_13_ < 14336 && class364.anInt3851 * 1164735859 != -1)
						class477_sub3.method5969((1164735859 * class364.anInt3851), false, true, -3822235);
					else if (i_13_ > 6144 && i_13_ < 10240 && -1 != 1110452161 * class364.anInt3819)
						class477_sub3.method5969((class364.anInt3819 * 1110452161), false, true, -1714623943);
					else
						class477_sub3.method5969((class364.anInt3818 * 702160037), false, true, -1848068236);
				} else if (i == Class299.aClass299_6806.aByte6805 && class364.anInt3822 * 1853423603 != -1) {
					if (i_13_ > 2048 && i_13_ <= 6144 && class364.anInt3825 * -828007095 != -1)
						class477_sub3.method5969((-828007095 * class364.anInt3825), false, true, 71509579);
					else if (i_13_ >= 10240 && i_13_ < 14336 && -1 != class364.anInt3824 * 17130543)
						class477_sub3.method5969(class364.anInt3824 * 17130543, false, true, 1630866811);
					else if (i_13_ > 6144 && i_13_ < 10240 && 187748475 * class364.anInt3823 != -1)
						class477_sub3.method5969((class364.anInt3823 * 187748475), false, true, 1252235565);
					else
						class477_sub3.method5969((1853423603 * class364.anInt3822), false, true, -1856024186);
				} else if (i_13_ > 2048 && i_13_ <= 6144 && -1 != class364.anInt3817 * 1083222597)
					class477_sub3.method5969(class364.anInt3817 * 1083222597, false, true, 1819226736);
				else if (i_13_ >= 10240 && i_13_ < 14336 && class364.anInt3836 * 119327185 != -1)
					class477_sub3.method5969(class364.anInt3836 * 119327185, false, true, -607420335);
				else if (i_13_ > 6144 && i_13_ < 10240 && class364.anInt3815 * -1290952703 != -1)
					class477_sub3.method5969(-1290952703 * class364.anInt3815, false, true, -1203896768);
				else
					class477_sub3.method5969(class364.anInt3814 * 441580483, false, true, -1629074596);
				class477_sub3.aBoolean8752 = false;
			} else if (i_12_ != 0 || (class432_sub1_sub1_sub1.anInt10050 * -423961127 > 25)) {
				if (Class299.aClass299_6808.aByte6805 == i && -1 != class364.anInt3818 * 702160037) {
					if (i_10_ < 0 && -1 != -1549872533 * class364.anInt3828)
						class477_sub3.method5969((class364.anInt3828 * -1549872533), false, true, 1511634417);
					else if (i_10_ > 0 && class364.anInt3840 * 1660861201 != -1)
						class477_sub3.method5969((1660861201 * class364.anInt3840), false, true, 1088422901);
					else
						class477_sub3.method5969((class364.anInt3818 * 702160037), false, true, 870762897);
				} else if (i == Class299.aClass299_6806.aByte6805 && -1 != 1853423603 * class364.anInt3822) {
					if (i_10_ < 0 && -1 != 27779393 * class364.anInt3826)
						class477_sub3.method5969(class364.anInt3826 * 27779393, false, true, -484366516);
					else if (i_10_ > 0 && -923174325 * class364.anInt3827 != -1)
						class477_sub3.method5969((-923174325 * class364.anInt3827), false, true, -878022026);
					else
						class477_sub3.method5969((1853423603 * class364.anInt3822), false, true, 264346497);
				} else if (i_10_ < 0 && 789126047 * class364.anInt3830 != -1)
					class477_sub3.method5969(789126047 * class364.anInt3830, false, true, 1070948049);
				else if (i_10_ > 0 && 2015625873 * class364.anInt3831 != -1)
					class477_sub3.method5969(2015625873 * class364.anInt3831, false, true, 1826401721);
				else
					class477_sub3.method5969(441580483 * class364.anInt3814, false, true, -1566341575);
				class477_sub3.aBoolean8752 = false;
			} else {
				if (i == Class299.aClass299_6808.aByte6805 && 702160037 * class364.anInt3818 != -1)
					class477_sub3.method5969(class364.anInt3818 * 702160037, false, true, -349380316);
				else if (Class299.aClass299_6806.aByte6805 == i && -1 != class364.anInt3822 * 1853423603)
					class477_sub3.method5969(class364.anInt3822 * 1853423603, false, true, 337295169);
				else
					class477_sub3.method5969(class364.anInt3814 * 441580483, false, true, -1225023720);
				class477_sub3.aBoolean8752 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qv.ih(").append(')').toString());
		}
	}
}
