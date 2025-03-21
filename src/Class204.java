/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class204 implements Interface10 {
	public Class195 aClass195_6512;
	public int anInt6513;
	public Class211 aClass211_6514;
	public int anInt6515;
	public int anInt6516;
	public static int anInt6517;

	public Class198 method161() {
		return Class198.aClass198_1920;
	}

	Class204(int i, Class195 class195, Class211 class211, int i_0_, int i_1_) {
		anInt6513 = i * 765769395;
		aClass195_6512 = class195;
		aClass211_6514 = class211;
		anInt6515 = 889037733 * i_0_;
		anInt6516 = i_1_ * 1843004335;
	}

	public Class198 method160() {
		return Class198.aClass198_1920;
	}

	public Class198 method159(byte i) {
		try {
			return Class198.aClass198_1920;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ip.j(").append(')').toString());
		}
	}

	static final void method2180(Class430 class430, short i) {
		try {
			((Class430) class430).anInt4380 -= 2099007437;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ip.bo(").append(')').toString());
		}
	}

	static final void method2181(Class430 class430, int i) {
		try {
			Class232.aClass232_2458.method2357(1367286494);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ip.agj(").append(')').toString());
		}
	}

	static final void method2182(Class213 class213, int i) {
		try {
			Class330_Sub46_Sub2 buffer = ((Class1) client.aClass1_9025).aClass330_Sub46_Sub2_17;
			if (class213 == Class213.aClass213_2075) {
				int i_2_ = buffer.readUnsignedByte(687968312);
				int i_3_ = Class153.anInt1634 * -1437420083 + (i_2_ >> 4 & 0x7);
				int i_4_ = (i_2_ & 0x7) + IsaacCipher.anInt5837 * -520028443;
				int i_5_ = buffer.readUnsignedShort(1753745904);
				if (i_5_ == 65535)
					i_5_ = -1;
				int i_6_ = buffer.readUnsignedShort(12386264);
				int i_7_ = buffer.readUnsignedShort(481364777);
				int i_8_ = buffer.readUnsignedByte(646921925);
				int i_9_ = buffer.readShort(-1100583751);
				if (client.aClass304_9030.method2985(-2000724256) != OutgoingPacketManager.aClass310_3212) {
					if (i_3_ >= 0 && i_4_ >= 0 && i_3_ < client.aClass304_9030.method2990(-561354872) && i_4_ < client.aClass304_9030.method3033((byte) 8)) {
						if (i_5_ == -1) {
							Class330_Sub36_Sub2 class330_sub36_sub2 = ((Class330_Sub36_Sub2) (client.aClass497_9216.method6094((long) (i_3_ << 16 | i_4_))));
							if (null != class330_sub36_sub2) {
								((Class330_Sub36_Sub2) class330_sub36_sub2).aClass432_Sub1_Sub1_Sub4_9624.method5503(888749273);
								class330_sub36_sub2.method3252(1331464088);
							}
						} else {
							int i_10_ = 256 + i_3_ * 512;
							int i_11_ = 256 + 512 * i_4_;
							int i_12_ = Class1.anInt39 * -2027989865;
							if (i_12_ < 3 && client.aClass304_9030.method2995(2120248897).method2788(i_3_, i_4_, (byte) -22))
								i_12_++;
							Class432_Sub1_Sub1_Sub4 class432_sub1_sub1_sub4 = (new Class432_Sub1_Sub1_Sub4(client.aClass304_9030.method3023(-400722441), i_5_, i_7_, -2027989865 * Class1.anInt39, i_12_, i_10_, Class431.method5342(i_10_, i_11_, (-2027989865 * Class1.anInt39), 1996761881) - i_6_, i_11_, i_3_, i_3_, i_4_, i_4_, i_8_, false, i_9_));
							client.aClass497_9216.method6097((new Class330_Sub36_Sub2(class432_sub1_sub1_sub4)), (long) (i_3_ << 16 | i_4_));
						}
					}
				}
			} else if (class213 == Class213.aClass213_2067) {
				int i_13_ = buffer.readInt1((byte) 2);
				int i_14_ = buffer.readUnsignedByteS(-400233324);
				int i_15_ = i_14_ >> 2;
				int i_16_ = i_14_ & 0x3;
				int i_17_ = client.anIntArray9036[i_15_];
				int i_18_ = buffer.readUnsignedByte(-234562340);
				int i_19_ = (i_18_ >> 4 & 0x7) + -1437420083 * Class153.anInt1634;
				int i_20_ = (i_18_ & 0x7) + IsaacCipher.anInt5837 * -520028443;
				if (client.aClass304_9030.method2985(-2130248212) != OutgoingPacketManager.aClass310_3212)
					Class147.method1744(Class1.anInt39 * -2027989865, i_19_, i_20_, i_17_, i_15_, i_16_, i_13_, -1319057223);
			} else if (class213 == Class213.aClass213_2072) {
				int i_21_ = buffer.readUnsignedLEShort(15163594);
				int i_22_ = buffer.readUnsignedByteS(-400233324);
				Class381 class381 = client.aClass304_9030.method3022(1280086314);
				int i_23_ = -520028443 * IsaacCipher.anInt5837 + (i_22_ & 0x7);
				int i_24_ = class381.gameSceneBaseY * -1542584207 + i_23_;
				int i_25_ = Class153.anInt1634 * -1437420083 + (i_22_ >> 4 & 0x7);
				int i_26_ = i_25_ + -1261027839 * class381.gameSceneBaseX;
				Class330_Sub9 class330_sub9 = ((Class330_Sub9) (client.aClass497_9138.method6094((long) (-2027989865 * Class1.anInt39 << 28 | i_24_ << 14 | i_26_))));
				if (class330_sub9 != null) {
					for (Class330_Sub3 class330_sub3 = (Class330_Sub3) class330_sub9.aClass471_7573.method5869(539664854); null != class330_sub3; class330_sub3 = (Class330_Sub3) class330_sub9.aClass471_7573.method5873((byte) -23)) {
						if (-862355691 * class330_sub3.anInt7513 == (i_21_ & 0x7fff)) {
							class330_sub3.method3252(-415448584);
							break;
						}
					}
					if (class330_sub9.aClass471_7573.method5876(-1286769633))
						class330_sub9.method3252(-845971576);
					if (i_25_ >= 0 && i_23_ >= 0 && (i_25_ < client.aClass304_9030.method2990(-1360696539)) && (i_23_ < client.aClass304_9030.method3033((byte) -126)))
						Class343.method4001(-2027989865 * Class1.anInt39, i_25_, i_23_, -334637075);
				}
			} else if (Class213.aClass213_2076 == class213) {
				buffer.readUnsignedByte(2071169702);
				int i_27_ = buffer.readUnsignedByte(1213079441);
				int i_28_ = -1437420083 * Class153.anInt1634 + (i_27_ >> 4 & 0x7);
				int i_29_ = -520028443 * IsaacCipher.anInt5837 + (i_27_ & 0x7);
				int i_30_ = buffer.readUnsignedShort(-130816981);
				int i_31_ = buffer.readUnsignedByte(281468919);
				int i_32_ = buffer.readUnsignedTriByte(-1401356047);
				String string = buffer.readString(1682728244);
				if (client.aClass304_9030.method2985(-1980492469) != OutgoingPacketManager.aClass310_3212)
					Class297.method2970(-2027989865 * Class1.anInt39, i_28_, i_29_, i_31_, i_30_, i_32_, string, (byte) 48);
			} else if (class213 == Class213.aClass213_2065) {
				int i_33_ = buffer.readUnsignedByte(994647971);
				boolean bool = (i_33_ & 0x80) != 0;
				int i_34_ = Class153.anInt1634 * -1437420083 + (i_33_ >> 3 & 0x7);
				int i_35_ = -520028443 * IsaacCipher.anInt5837 + (i_33_ & 0x7);
				int i_36_ = i_34_ + buffer.readByte((byte) -7);
				int i_37_ = i_35_ + buffer.readByte((byte) -51);
				int i_38_ = buffer.readShort(-1100583751);
				int i_39_ = buffer.readUnsignedShort(1464139792);
				int i_40_ = buffer.readUnsignedByte(989418380) * 4;
				int i_41_ = buffer.readUnsignedByte(545566562) * 4;
				int i_42_ = buffer.readUnsignedShort(2097670185);
				int i_43_ = buffer.readUnsignedShort(1594795378);
				int i_44_ = buffer.readUnsignedByte(1617674320);
				int i_45_ = buffer.readUnsignedShort(1262907969);
				int i_46_ = buffer.readShort(-1100583751);
				if (i_44_ == 255)
					i_44_ = -1;
				if (client.aClass304_9030.method2985(-2016462332) != OutgoingPacketManager.aClass310_3212) {
					if (i_34_ >= 0 && i_35_ >= 0 && (i_34_ < client.aClass304_9030.method2990(-1678145578)) && i_35_ < client.aClass304_9030.method3033((byte) 15) && i_36_ >= 0 && i_37_ >= 0 && (i_36_ < client.aClass304_9030.method2990(-1548117869)) && i_37_ < client.aClass304_9030.method3033((byte) -62) && i_39_ != 65535) {
						i_34_ = 512 * i_34_ + 256;
						i_35_ = 256 + 512 * i_35_;
						i_36_ = 512 * i_36_ + 256;
						i_37_ = i_37_ * 512 + 256;
						i_40_ <<= 2;
						i_41_ <<= 2;
						i_45_ <<= 2;
						Class432_Sub1_Sub1_Sub2 class432_sub1_sub1_sub2 = (new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), i_39_, -2027989865 * Class1.anInt39, Class1.anInt39 * -2027989865, i_34_, i_35_, i_40_, i_42_ + client.anInt8981 * 822953439, i_43_ + 822953439 * client.anInt8981, i_44_, i_45_, 0, i_38_, i_41_, bool, -1, i_46_));
						class432_sub1_sub1_sub2.method5498(i_36_, i_37_, Class431.method5342(i_36_, i_37_, Class1.anInt39 * -2027989865, 1996761881) - i_41_, client.anInt8981 * 822953439 + i_42_, -1340068339);
						client.aClass471_9139.method5878(new Class330_Sub36_Sub11(class432_sub1_sub1_sub2), (short) 8192);
					}
				}
			} else if (Class213.aClass213_2071 == class213) {
				int i_47_ = buffer.readUnsignedByte(2080808108);
				int i_48_ = Class153.anInt1634 * -1437420083 + (i_47_ >> 4 & 0x7);
				int i_49_ = (i_47_ & 0x7) + IsaacCipher.anInt5837 * -520028443;
				int i_50_ = buffer.readUnsignedShort(276332810);
				if (i_50_ == 65535)
					i_50_ = -1;
				int i_51_ = buffer.readUnsignedByte(1428271957);
				int i_52_ = i_51_ >> 4 & 0xf;
				int i_53_ = i_51_ & 0x7;
				int i_54_ = buffer.readUnsignedByte(1539914928);
				int i_55_ = buffer.readUnsignedByte(1188858785);
				int i_56_ = buffer.readUnsignedShort(-113903355);
				if (client.aClass304_9030.method2985(-2090344282) != OutgoingPacketManager.aClass310_3212) {
					if (i_48_ >= 0 && i_49_ >= 0 && (i_48_ < client.aClass304_9030.method2990(-1979964386)) && (i_49_ < client.aClass304_9030.method3033((byte) -19))) {
						int i_57_ = 1 + i_52_;
						if ((Class263_Sub2.myPlayer.anIntArray10018[0]) >= i_48_ - i_57_ && (Class263_Sub2.myPlayer.anIntArray10018[0]) <= i_57_ + i_48_ && (Class263_Sub2.myPlayer.anIntArray10059[0]) >= i_49_ - i_57_ && (Class263_Sub2.myPlayer.anIntArray10059[0]) <= i_49_ + i_57_)
							Class258.method2544(i_50_, i_53_, i_54_, i_55_, i_52_ + ((i_49_ << 8) + (((Class1.anInt39 * -2027989865) << 24) + (i_48_ << 16))), i_56_, (short) -6127);
					}
				}
			} else if (class213 == Class213.aClass213_2064) {
				int i_58_ = buffer.readUnsignedByteC(-243015761);
				int i_59_ = -1437420083 * Class153.anInt1634 + (i_58_ >> 4 & 0x7);
				int i_60_ = (i_58_ & 0x7) + -520028443 * IsaacCipher.anInt5837;
				int i_61_ = buffer.readUnsignedByteA(-741334169);
				int i_62_ = i_61_ >> 2;
				int i_63_ = i_61_ & 0x3;
				int i_64_ = client.anIntArray9036[i_62_];
				if (client.aClass304_9030.method2985(-2027100634).method3097((short) -12872) || (i_59_ >= 0 && i_60_ >= 0 && (i_59_ < client.aClass304_9030.method2990(-1198931324)) && (i_60_ < client.aClass304_9030.method3033((byte) -38))))
					IncomingPacket.method2272(Class1.anInt39 * -2027989865, i_59_, i_60_, i_64_, -1, i_62_, i_63_, -1421433272);
			} else if (Class213.aClass213_2069 == class213) {
				int i_65_ = buffer.readInt2(-793658723);
				int i_66_ = buffer.readUnsignedByteS(-400233324);
				int i_67_ = (i_66_ >> 4 & 0x7) + -1437420083 * Class153.anInt1634;
				int i_68_ = IsaacCipher.anInt5837 * -520028443 + (i_66_ & 0x7);
				int i_69_ = buffer.readUnsignedByteA(-741334169);
				int i_70_ = i_69_ >> 2;
				int i_71_ = i_69_ & 0x3;
				int i_72_ = client.anIntArray9036[i_70_];
				if (client.aClass304_9030.method2985(-2142827734).method3097((short) -2470) || (i_67_ >= 0 && i_68_ >= 0 && (i_67_ < client.aClass304_9030.method2990(-1718029859)) && (i_68_ < client.aClass304_9030.method3033((byte) -117))))
					IncomingPacket.method2272(Class1.anInt39 * -2027989865, i_67_, i_68_, i_72_, i_65_, i_70_, i_71_, -614543416);
			} else if (class213 == Class213.aClass213_2070) {
				int i_73_ = buffer.readUnsignedByte(678342501);
				int i_74_ = Class153.anInt1634 * 1420127130 + (i_73_ >> 4 & 0xf);
				int i_75_ = (i_73_ & 0xf) + IsaacCipher.anInt5837 * -1040056886;
				int i_76_ = buffer.readUnsignedByte(536311338);
				boolean bool = (i_76_ & 0x1) != 0;
				boolean bool_77_ = (i_76_ & 0x2) != 0;
				int i_78_ = bool_77_ ? i_76_ >> 2 : -1;
				int i_79_ = i_74_ + buffer.readByte((byte) 45);
				int i_80_ = i_75_ + buffer.readByte((byte) 14);
				int i_81_ = buffer.readShort(-1100583751);
				int i_82_ = buffer.readShort(-1100583751);
				int i_83_ = buffer.readUnsignedShort(-272595655);
				int i_84_ = buffer.readUnsignedByte(38470525);
				if (bool_77_)
					i_84_ = (byte) i_84_;
				else
					i_84_ *= 4;
				int i_85_ = buffer.readUnsignedByte(302079796) * 4;
				int i_86_ = buffer.readUnsignedShort(1347614744);
				int i_87_ = buffer.readUnsignedShort(422530978);
				int i_88_ = buffer.readUnsignedByte(415506371);
				int i_89_ = buffer.readUnsignedShort(1151781696);
				if (i_88_ == 255)
					i_88_ = -1;
				int i_90_ = buffer.readShort(-1100583751);
				if (client.aClass304_9030.method2985(-2099247709) != OutgoingPacketManager.aClass310_3212) {
					if (i_74_ >= 0 && i_75_ >= 0 && (i_74_ < client.aClass304_9030.method2990(-550340860) * 2) && i_75_ < client.aClass304_9030.method2990(-1077753913) * 2 && i_79_ >= 0 && i_80_ >= 0 && i_79_ < client.aClass304_9030.method3033((byte) -115) * 2 && (i_80_ < client.aClass304_9030.method3033((byte) -50) * 2) && 65535 != i_83_) {
						i_74_ = 256 * i_74_;
						i_75_ *= 256;
						i_79_ *= 256;
						i_80_ *= 256;
						i_84_ <<= 2;
						i_85_ <<= 2;
						i_89_ <<= 2;
						Class288.method2889(i_83_, i_81_, i_82_, i_78_, i_84_, i_85_, i_74_, i_75_, i_79_, i_80_, i_86_, i_87_, i_88_, i_89_, bool, i_90_, -1810287182);
					}
				}
			} else if (class213 == Class213.aClass213_2068) {
				int i_91_ = buffer.readUnsignedByteS(-400233324);
				int i_92_ = i_91_ >> 2;
				int i_93_ = client.anIntArray9036[i_92_];
				int i_94_ = buffer.readUnsignedByteS(-400233324);
				int i_95_ = buffer.readInt2(-793658723);
				Class473 class473 = client.aClass304_9030.method3025((byte) 13).method5705(i_95_, (byte) -80);
				int i_96_ = buffer.readUnsignedByteS(-400233324);
				int i_97_ = -1437420083 * Class153.anInt1634 + (i_96_ >> 4 & 0x7);
				int i_98_ = (i_96_ & 0x7) + -520028443 * IsaacCipher.anInt5837;
				if (-344921723 * Class476.aClass476_6878.anInt6882 == i_92_)
					i_92_ = Class476.aClass476_6898.anInt6882 * -344921723;
				int i_99_ = 0;
				if (null != class473.aByteArray5633) {
					int i_100_ = -1;
					for (int i_101_ = 0; i_101_ < class473.aByteArray5633.length; i_101_++) {
						if (i_92_ == class473.aByteArray5633[i_101_]) {
							i_100_ = i_101_;
							break;
						}
					}
					i_99_ = class473.anIntArrayArray5684[i_100_].length;
				}
				int i_102_ = 0;
				if (class473.aShortArray5623 != null)
					i_102_ = class473.aShortArray5623.length;
				int i_103_ = 0;
				if (null != class473.aShortArray5626)
					i_103_ = class473.aShortArray5626.length;
				if (1 == (i_94_ & 0x1))
					Class381.method4401(Class1.anInt39 * -2027989865, i_97_, i_98_, i_93_, i_95_, i_92_, null, -1970273708);
				else {
					int[] is = null;
					if (2 == (i_94_ & 0x2)) {
						is = new int[i_99_];
						for (int i_104_ = 0; i_104_ < i_99_; i_104_++)
							is[i_104_] = buffer.readInt((byte) 77);
					}
					short[] is_105_ = null;
					if ((i_94_ & 0x4) == 4) {
						is_105_ = new short[i_102_];
						for (int i_106_ = 0; i_106_ < i_102_; i_106_++)
							is_105_[i_106_] = (short) buffer.readUnsignedShort(294691930);
					}
					short[] is_107_ = null;
					if ((i_94_ & 0x8) == 8) {
						is_107_ = new short[i_103_];
						for (int i_108_ = 0; i_108_ < i_103_; i_108_++)
							is_107_[i_108_] = (short) buffer.readUnsignedShort(748460200);
					}
					Class381.method4401(-2027989865 * Class1.anInt39, i_97_, i_98_, i_93_, i_95_, i_92_, new Class481((5169499050832428819L * (Class330_Sub10.aLong7576)), is, is_105_, is_107_), -1686855103);
					Class330_Sub10.aLong7576 += 5730844830599717659L;
				}
			} else if (Class213.aClass213_2073 == class213) {
				int i_109_ = buffer.readInt((byte) 29);
				int i_110_ = buffer.readUnsignedByte(2026672900);
				client.aClass304_9030.method3025((byte) 13).method5705(i_109_, (byte) -96).method5895(i_110_, (byte) -77);
			} else if (class213 == Class213.aClass213_2074) {
				int i_111_ = buffer.readUnsignedLEShort(15163594);
				int i_112_ = buffer.readUnsignedLEShort(15163594);
				int i_113_ = buffer.readUnsignedByteC(-243015761);
				Class381 class381 = client.aClass304_9030.method3022(-596690517);
				int i_114_ = -520028443 * IsaacCipher.anInt5837 + (i_113_ & 0x7);
				int i_115_ = class381.gameSceneBaseY * -1542584207 + i_114_;
				int i_116_ = (i_113_ >> 4 & 0x7) + -1437420083 * Class153.anInt1634;
				int i_117_ = class381.gameSceneBaseX * -1261027839 + i_116_;
				boolean bool = (i_116_ >= 0 && i_114_ >= 0 && i_116_ < client.aClass304_9030.method2990(-1897460985) && i_114_ < client.aClass304_9030.method3033((byte) -80));
				if (bool || client.aClass304_9030.method2985(-2067239322).method3097((short) -1717)) {
					Class125.method1526(Class1.anInt39 * -2027989865, i_117_, i_115_, new Class330_Sub3(i_112_, i_111_), 289486883);
					if (bool)
						Class343.method4001(Class1.anInt39 * -2027989865, i_116_, i_114_, -334637075);
				}
			} else if (Class213.aClass213_2063 == class213) {
				int i_118_ = buffer.readUnsignedByte(1647062437);
				int i_119_ = (i_118_ >> 4 & 0x7) + Class153.anInt1634 * -1437420083;
				int i_120_ = (i_118_ & 0x7) + -520028443 * IsaacCipher.anInt5837;
				int i_121_ = buffer.readUnsignedShort(1268600414);
				if (65535 == i_121_)
					i_121_ = -1;
				int i_122_ = buffer.readUnsignedByte(912349719);
				int i_123_ = i_122_ >> 4 & 0xf;
				int i_124_ = i_122_ & 0x7;
				int i_125_ = buffer.readUnsignedByte(1305333233);
				int i_126_ = buffer.readUnsignedByte(1554160902);
				int i_127_ = buffer.readUnsignedShort(882666397);
				boolean bool = buffer.readUnsignedByte(2042061478) == 1;
				if (client.aClass304_9030.method2985(-2082337438) != OutgoingPacketManager.aClass310_3212) {
					if (i_119_ >= 0 && i_120_ >= 0 && (i_119_ < client.aClass304_9030.method2990(-1436368713)) && (i_120_ < client.aClass304_9030.method3033((byte) 11))) {
						int i_128_ = i_123_ + 1;
						if ((Class263_Sub2.myPlayer.anIntArray10018[0]) >= i_119_ - i_128_ && (Class263_Sub2.myPlayer.anIntArray10018[0]) <= i_128_ + i_119_ && (Class263_Sub2.myPlayer.anIntArray10059[0]) >= i_120_ - i_128_ && (Class263_Sub2.myPlayer.anIntArray10059[0]) <= i_120_ + i_128_)
							Class157.method1833(i_121_, i_124_, i_125_, i_126_, ((i_120_ << 8) + (((Class1.anInt39 * -2027989865) << 24) + (i_119_ << 16)) + i_123_), bool, i_127_, 373696947);
					}
				}
			} else if (class213 == Class213.aClass213_2077) {
				int i_129_ = buffer.readUnsignedByte(17999475);
				Class381 class381 = client.aClass304_9030.method3022(-1366657133);
				int i_130_ = (i_129_ & 0x7) + -520028443 * IsaacCipher.anInt5837;
				int i_131_ = -1542584207 * class381.gameSceneBaseY + i_130_;
				int i_132_ = Class153.anInt1634 * -1437420083 + (i_129_ >> 4 & 0x7);
				int i_133_ = -1261027839 * class381.gameSceneBaseX + i_132_;
				int i_134_ = buffer.readUnsignedShort(1626437268);
				int i_135_ = buffer.readUnsignedShort(1070207259);
				int i_136_ = buffer.readUnsignedShort(1966794586);
				if (null != client.aClass497_9138) {
					Class330_Sub9 class330_sub9 = ((Class330_Sub9) (client.aClass497_9138.method6094((long) (Class1.anInt39 * -2027989865 << 28 | i_131_ << 14 | i_133_))));
					if (null != class330_sub9) {
						for (Class330_Sub3 class330_sub3 = (Class330_Sub3) class330_sub9.aClass471_7573.method5869(539664854); class330_sub3 != null; class330_sub3 = ((Class330_Sub3) class330_sub9.aClass471_7573.method5873((byte) -84))) {
							if ((-862355691 * class330_sub3.anInt7513 == (i_134_ & 0x7fff)) && (-1010001415 * ((Class330_Sub3) class330_sub3).anInt7512 == i_135_)) {
								class330_sub3.method3252(-1303332432);
								((Class330_Sub3) class330_sub3).anInt7512 = 1311692873 * i_136_;
								Class125.method1526((-2027989865 * Class1.anInt39), i_133_, i_131_, class330_sub3, 209291836);
								break;
							}
						}
						if (i_132_ >= 0 && i_130_ >= 0 && i_132_ < client.aClass304_9030.method2990(-1708538371) && i_130_ < client.aClass304_9030.method3033((byte) -47))
							Class343.method4001(-2027989865 * Class1.anInt39, i_132_, i_130_, -334637075);
					}
				}
			} else if (class213 == Class213.aClass213_2066) {
				int i_137_ = buffer.readUnsignedLEShort(15163594);
				int i_138_ = buffer.readUnsignedByteA(-741334169);
				Class381 class381 = client.aClass304_9030.method3022(1148738300);
				int i_139_ = (i_138_ & 0x7) + IsaacCipher.anInt5837 * -520028443;
				int i_140_ = -1542584207 * class381.gameSceneBaseY + i_139_;
				int i_141_ = (i_138_ >> 4 & 0x7) + -1437420083 * Class153.anInt1634;
				int i_142_ = class381.gameSceneBaseX * -1261027839 + i_141_;
				int i_143_ = buffer.readUnsignedLEShort(15163594);
				int i_144_ = buffer.readUnsignedShort(1083997210);
				if (client.anInt9121 * 1478725729 != i_143_) {
					boolean bool = (i_141_ >= 0 && i_139_ >= 0 && i_141_ < client.aClass304_9030.method2990(-1604667338) && i_139_ < client.aClass304_9030.method3033((byte) -118));
					if (bool || client.aClass304_9030.method2985(-2064977687).method3097((short) -22342)) {
						Class125.method1526(Class1.anInt39 * -2027989865, i_142_, i_140_, new Class330_Sub3(i_144_, i_137_), -380736688);
						if (bool)
							Class343.method4001(Class1.anInt39 * -2027989865, i_141_, i_139_, -334637075);
					}
				}
			} else {
				Class207.method2195(new StringBuilder().append("").append(class213).toString(), new RuntimeException(), -306254718);
				Class330_Sub31.logout(false, 1433475490);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ip.jp(").append(')').toString());
		}
	}

	static void method2183(IComponentDefinitions iComponentDefinitions, int i) {
		try {
			if (5 == 1849136745 * iComponentDefinitions.anInt1198 && -1 != iComponentDefinitions.anInt1335 * -1053848421)
				Class136.method1596(Class361.aClass_ra3793, iComponentDefinitions, 1348212927);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ip.ls(").append(')').toString());
		}
	}

	static final void method2184(Class430 class430, int i) {
		try {
			IComponentDefinitions iComponentDefinitions = (((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396.aClass120_10067.method1440((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), (byte) -62));
			iComponentDefinitions.aClass114Array1347 = null;
			iComponentDefinitions.aClass114Array1219 = null;
			Class404.method4738(iComponentDefinitions, 765240590);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ip.arg(").append(')').toString());
		}
	}

	public static int method2185(CharSequence charsequence, byte i) {
		try {
			return Class240.method2399(charsequence, 10, true, -2016724024);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ip.o(").append(')').toString());
		}
	}
}
