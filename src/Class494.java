/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

import jaclib.ping.Ping;

public class Class494 {
	int anInt5865;
	int anInt5866;
	int anInt5867;
	int anInt5868;
	int anInt5869;

	public int hashCode() {
		try {
			return ((Class494) this).anInt5867 * 1424076375;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uk.hashCode(").append(')').toString());
		}
	}

	Class494(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		((Class494) this).anInt5867 = i * 759504231;
		((Class494) this).anInt5866 = i_0_ * 2099417653;
		((Class494) this).anInt5869 = -1951802113 * i_1_;
		((Class494) this).anInt5868 = -1929726289 * i_2_;
		((Class494) this).anInt5865 = -1041566945 * i_3_;
	}

	static final void method6082(Class430 class430, int i) {
		try {
			boolean bool = ((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub20_7888), bool ? 2 : 1, 1501590547);
			Class448.aClass330_Sub50_5555.method3856((Class448.aClass330_Sub50_5555.aClass464_Sub20_7889), bool ? 2 : 1, 1551167623);
			Class282.method2812(1470552195);
			Class435.method5568(1856911935);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uk.ajt(").append(')').toString());
		}
	}

	public static int method6083(int i) {
		try {
			if (0 == 1270608003 * Class250.anInt2632) {
				Class517.aClass517_5979.method6210(new Class242("jaclib"), -1522230600);
				if (Class517.aClass517_5979.method6211(-1620246412).method321((byte) -118) != 100)
					return 1;
				if (!((Class242) Class517.aClass517_5979.method6211(-1846665524)).method2403((short) -28194)) {
					Class394.aClient4082.method3902((short) 255);
					Class373.method4338(-1934900879);
					try {
						Ping.init();
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				Class250.anInt2632 = -1893736917;
			}
			if (Class250.anInt2632 * 1270608003 == 1) {
				Class250.aClass517Array2633 = Class517.method6207(304846430);
				Class517.aClass517_5991.method6210(new Class252(Class382.aClass280_6679), -1522230600);
				Class517.aClass517_5977.method6210(new Class242("jaggl"), -1522230600);
				Class517.aClass517_5978.method6210(new Class242("jagdx"), -1522230600);
				Class517.aClass517_5985.method6210(new Class242("sw3d"), -1522230600);
				Class517.aClass517_5980.method6210(new Class242("hw3d"), -1522230600);
				Class517.aClass517_5981.method6210(new Class242("jagtheora"), -1522230600);
				Class517.aClass517_5982.method6210(new Class252(Class117.aClass280_1387), -1522230600);
				Class517.aClass517_6002.method6210(new Class252(client.aClass280_9286), -1522230600);
				Class517.aClass517_5984.method6210(new Class252(Class283.aClass280_2926), -1522230600);
				Class517.aClass517_5983.method6210(new Class252(Class355.aClass280_3637), -1522230600);
				Class517.aClass517_5986.method6210(new Class252(Class95_Sub11.clientScriptMap), -1522230600);
				Class517.aClass517_5975.method6210(new Class252(Class239.aClass280_2594), -1522230600);
				Class517.aClass517_5988.method6210(new Class252(Class24.aClass280_305), -1522230600);
				Class517.aClass517_5989.method6210(new Class252(Class307.animationDefinitions), -1522230600);
				Class517.aClass517_5990.method6210(new Class252(Player.aClass280_10250), -1522230600);
				Class517.aClass517_6003.method6210(new Class252(Class400.clientVarpBitDefinitions), -1522230600);
				Class517.aClass517_5992.method6210(new Class252(Class62.aClass280_560), -1522230600);
				Class517.aClass517_5993.method6210(new Class252(Class549.aClass280_6285), -1522230600);
				Class517.aClass517_5994.method6210(new Class252(Class330_Sub36_Sub14.aClass280_9719), -1522230600);
				Class517.aClass517_5995.method6210(new Class252(Class538.aClass280_6243), -1522230600);
				Class517.aClass517_5999.method6210(new Class243(Class562.aClass280_6437, "huffman"), -1522230600);
				Class517.aClass517_5996.method6210(new Class252(Class118.aClass280_1393), -1522230600);
				Class517.aClass517_5998.method6210(new Class252(Class543.aClass280_6255), -1522230600);
				Class517.aClass517_5976.method6210(new Class252(Class484.aClass280_5822), -1522230600);
				Class517.aClass517_6000.method6210(new Class262(Class434.aClass280_6560, "details"), -1522230600);
				for (int i_4_ = 0; i_4_ < Class250.aClass517Array2633.length; i_4_++) {
					if (Class250.aClass517Array2633[i_4_].method6211(-1728141082) == null)
						throw new RuntimeException();
				}
				int i_5_ = 0;
				Class517[] class517s = Class250.aClass517Array2633;
				for (int i_6_ = 0; i_6_ < class517s.length; i_6_++) {
					Class517 class517 = class517s[i_6_];
					int i_7_ = class517.method6208(-1138381574);
					int i_8_ = class517.method6211(2108498894).method321((byte) -97);
					i_5_ += i_8_ * i_7_ / 100;
				}
				Class250.anInt2634 = i_5_ * -1803770809;
				Class250.anInt2632 = 507493462;
			}
			if (Class250.aClass517Array2633 == null)
				return 100;
			int i_9_ = 0;
			int i_10_ = 0;
			boolean bool = true;
			Class517[] class517s = Class250.aClass517Array2633;
			for (int i_11_ = 0; i_11_ < class517s.length; i_11_++) {
				Class517 class517 = class517s[i_11_];
				int i_12_ = class517.method6208(-1138381574);
				int i_13_ = class517.method6211(2007119373).method321((byte) -22);
				if (i_13_ < 100)
					bool = false;
				i_9_ += i_12_;
				i_10_ += i_12_ * i_13_ / 100;
			}
			if (bool) {
				if (!((Class242) Class517.aClass517_5981.method6211(2135121500)).method2403((short) -22634))
					client.aBoolean9231 = Class394.aClient4082.method3891((byte) -26);
				Class250.aClass517Array2633 = null;
			}
			i_10_ -= 1051968887 * Class250.anInt2634;
			i_9_ -= 1051968887 * Class250.anInt2634;
			int i_14_ = i_9_ > 0 ? i_10_ * 100 / i_9_ : 100;
			if (!bool && i_14_ > 99)
				i_14_ = 99;
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uk.r(").append(')').toString());
		}
	}

	static void method6084(Class_ra class_ra, int i, int i_15_, int i_16_) {
		try {
			if (i >= 0 && i_15_ >= 0 && null != Class484.aClass249_5804) {
				Class381 class381 = client.aClass304_9030.method3022(1776686218);
				Class249 class249 = class_ra.cz();
				class_ra.ci(Class484.aClass249_5804);
				class_ra.cw(Class484.aClass247_5794);
				class_ra.r(Class484.anInt5800 * 1794131501, Class484.anInt5820 * 306018877, (1571591343 * Class484.anInt5802 + 1794131501 * Class484.anInt5800), (Class484.anInt5820 * 306018877 + 1980764775 * Class484.anInt5817));
				class_ra.ae(1794131501 * Class484.anInt5800, Class484.anInt5820 * 306018877, Class484.anInt5802 * 1571591343, 1980764775 * Class484.anInt5817);
				class249.method2508(Class484.aClass247_5794);
				class249.method2483(Class484.aClass249_5804);
				class249.method2485();
				int i_17_ = i - 1794131501 * Class484.anInt5800;
				int i_18_ = i_15_ - 306018877 * Class484.anInt5820;
				if (client.aClass304_9030.method3023(-400722441) != null && (!client.aBoolean9150 || 0 != (Class503.anInt5916 * -1357430571 & 0x40))) {
					int i_19_ = -1;
					int i_20_ = -1;
					float f = ((2.0F * (float) i_17_ / (float) (1571591343 * Class484.anInt5802)) - 1.0F);
					float f_21_ = (((float) i_18_ * 2.0F / (float) (1980764775 * Class484.anInt5817)) - 1.0F);
					class249.method2511(f, f_21_, -1.0F, Class484.aFloatArray5812);
					float f_22_ = (Class484.aFloatArray5812[0] / Class484.aFloatArray5812[3]);
					float f_23_ = (Class484.aFloatArray5812[1] / Class484.aFloatArray5812[3]);
					float f_24_ = (Class484.aFloatArray5812[2] / Class484.aFloatArray5812[3]);
					class249.method2511(f, f_21_, 1.0F, Class484.aFloatArray5812);
					float f_25_ = (Class484.aFloatArray5812[0] / Class484.aFloatArray5812[3]);
					float f_26_ = (Class484.aFloatArray5812[1] / Class484.aFloatArray5812[3]);
					float f_27_ = (Class484.aFloatArray5812[2] / Class484.aFloatArray5812[3]);
					float f_28_ = Class562.method6476(f_22_, f_23_, f_24_, f_25_, f_26_, f_27_, 4, -775125961);
					if (f_28_ > 0.0F) {
						float f_29_ = f_25_ - f_22_;
						float f_30_ = f_27_ - f_24_;
						int i_31_ = (int) (f_29_ * f_28_ + f_22_);
						int i_32_ = (int) (f_24_ + f_28_ * f_30_);
						i_19_ = i_31_ + (Class263_Sub2.myPlayer.method5453(-597496462) - 1 << 8) >> 9;
						i_20_ = i_32_ + (Class263_Sub2.myPlayer.method5453(-1029143523) - 1 << 8) >> 9;
						int i_33_ = (Class263_Sub2.myPlayer.aByte8658);
						if (i_33_ < 3 && ((client.aClass304_9030.method2995(2000997556).aByteArrayArrayArray2916[1][i_31_ >> 9][i_32_ >> 9]) & 0x2) != 0)
							i_33_++;
					}
					if (-1 != i_19_ && i_20_ != -1) {
						if (client.aBoolean9150 && 0 != (-1357430571 * Class503.anInt5916 & 0x40)) {
							IComponentDefinitions iComponentDefinitions = Class166.method1993((Class368.anInt3869 * 651152399), (client.anInt9151 * -1732113251), 534399539);
							if (iComponentDefinitions != null)
								Class360.method4241(client.aString9152, new StringBuilder().append(" ").append(Class215.aString2082).append(" ").toString(), -2126481065 * Class271.anInt2756, 59, -1, 0L, i_19_, i_20_, true, false, (long) (i_19_ << 32 | i_20_), true, (short) 140);
							else
								Class490.method6071(-1799482790);
						} else {
							if (Class211.aBoolean2061)
								Class360.method4241((Class526.aClass526_6145.method6257(Class429.aClass454_4369, 991479434)), "", -1, 60, -1, 0L, i_19_, i_20_, true, false, (long) (i_19_ << 32 | i_20_), true, (short) 140);
							Class360.method4241(Class276.aString2861, "", -417970913 * client.anInt9137, 23, -1, 0L, i_19_, i_20_, true, false, (long) (i_19_ << 32 | i_20_), true, (short) 140);
						}
					}
				}
				Class338 class338 = (client.aClass304_9030.method3023(-400722441).aClass338_3697);
				int i_34_ = i;
				int i_35_ = i_15_;
				List list = class338.aList3373;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class353 class353 = (Class353) iterator.next();
					if (!client.aBoolean9157 && (class353.aClass432_Sub1_3489.aByte8658 != (Class263_Sub2.myPlayer.aByte8658))) {
						if (i_16_ != 571238882)
							break;
					} else if (!class353.method4073(class_ra, i_34_, i_35_, -1561223091)) {
						if (i_16_ != 571238882) {
							/* empty */
						}
					} else {
						boolean bool = false;
						boolean bool_36_ = false;
						int i_37_;
						int i_38_;
						if (class353.aClass432_Sub1_3489 instanceof Class432_Sub1_Sub1) {
							i_37_ = ((Class432_Sub1_Sub1) class353.aClass432_Sub1_3489).aShort9922;
							i_38_ = ((Class432_Sub1_Sub1) class353.aClass432_Sub1_3489).aShort9921;
						} else {
							Class260 class260 = (class353.aClass432_Sub1_3489.method5346().aClass260_2606);
							i_37_ = (int) class260.aFloat2716 >> 9;
							i_38_ = (int) class260.aFloat2711 >> 9;
						}
						if (class353.aClass432_Sub1_3489 instanceof Player) {
							Player class432_sub1_sub1_sub1_sub1 = ((Player) class353.aClass432_Sub1_3489);
							int i_39_ = class432_sub1_sub1_sub1_sub1.method5453(-1711773220);
							Class260 class260 = (class432_sub1_sub1_sub1_sub1.method5346().aClass260_2606);
							if ((0 == (i_39_ & 0x1) && ((int) class260.aFloat2716 & 0x1ff) == 0 && 0 == ((int) class260.aFloat2711 & 0x1ff)) || ((i_39_ & 0x1) == 1 && (((int) class260.aFloat2716 & 0x1ff) == 256) && 256 == ((int) class260.aFloat2711 & 0x1ff))) {
								int i_40_ = ((int) class260.aFloat2716 - (class432_sub1_sub1_sub1_sub1.method5453(-1771618144) - 1 << 8));
								int i_41_ = ((int) class260.aFloat2711 - (class432_sub1_sub1_sub1_sub1.method5453(-1728918309) - 1 << 8));
								for (int i_42_ = 0; i_42_ < -823688441 * client.anInt9017; i_42_++) {
									Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) client.anIntArray9018[i_42_])));
									if (null == class330_sub35) {
										if (i_16_ != 571238882) {
											/* empty */
										}
									} else {
										NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
										if (client.anInt8981 * 822953439 != (723470927 * (class432_sub1_sub1_sub1_sub2.anInt10014))) {
											if (!class432_sub1_sub1_sub1_sub2.aBoolean10012) {
												if (i_16_ != 571238882)
													return;
											} else {
												Class260 class260_43_ = (class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
												int i_44_ = ((int) (class260_43_.aFloat2716) - (((class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295) * -1943771105) - 1 << 8));
												int i_45_ = ((int) (class260_43_.aFloat2711) - ((-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)) - 1 << 8));
												if (i_44_ >= i_40_ && (((class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295) * -1943771105) <= ((class432_sub1_sub1_sub1_sub1.method5453(-1082033193)) - (i_44_ - i_40_ >> 9))) && i_45_ >= i_41_ && ((-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)) <= ((class432_sub1_sub1_sub1_sub1.method5453(-2048326713)) - (i_45_ - i_41_ >> 9)))) {
													Class411.method5233(class432_sub1_sub1_sub1_sub2, ((Class263_Sub2.myPlayer.aByte8658) != (class353.aClass432_Sub1_3489.aByte8658)), -48366217);
													class432_sub1_sub1_sub1_sub2.anInt10014 = (523351921 * client.anInt8981);
												}
											}
										}
									}
								}
								int i_46_ = -1468156857 * Class15.anInt192;
								int[] is = Class15.anIntArray187;
								for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
									Player class432_sub1_sub1_sub1_sub1_48_ = (client.players[is[i_47_]]);
									if ((class432_sub1_sub1_sub1_sub1_48_ != null) && ((class432_sub1_sub1_sub1_sub1_48_.anInt10014) * 723470927 != client.anInt8981 * 822953439) && (class432_sub1_sub1_sub1_sub1_48_ != class432_sub1_sub1_sub1_sub1)) {
										if (!class432_sub1_sub1_sub1_sub1_48_.aBoolean10012) {
											if (i_16_ != 571238882)
												return;
										} else {
											Class260 class260_49_ = (class432_sub1_sub1_sub1_sub1_48_.method5346().aClass260_2606);
											int i_50_ = ((int) (class260_49_.aFloat2716) - ((class432_sub1_sub1_sub1_sub1_48_.method5453(-1540154324)) - 1 << 8));
											int i_51_ = ((int) (class260_49_.aFloat2711) - ((class432_sub1_sub1_sub1_sub1_48_.method5453(-974930706)) - 1 << 8));
											if (i_50_ >= i_40_ && (class432_sub1_sub1_sub1_sub1_48_.method5453(-299636042) <= ((class432_sub1_sub1_sub1_sub1.method5453(-1465405001)) - (i_50_ - i_40_ >> 9))) && i_51_ >= i_41_ && (class432_sub1_sub1_sub1_sub1_48_.method5453(-1955704316) <= ((class432_sub1_sub1_sub1_sub1.method5453(-1017325845)) - (i_51_ - i_41_ >> 9)))) {
												Class497.method6103(class432_sub1_sub1_sub1_sub1_48_, ((class353.aClass432_Sub1_3489.aByte8658) != (Class263_Sub2.myPlayer.aByte8658)), 1461262869);
												class432_sub1_sub1_sub1_sub1_48_.anInt10014 = (client.anInt8981 * 523351921);
											}
										}
									}
								}
							}
							if ((class432_sub1_sub1_sub1_sub1.anInt10014 * 723470927) == client.anInt8981 * 822953439) {
								if (i_16_ == 571238882)
									continue;
								break;
							}
							Class497.method6103(class432_sub1_sub1_sub1_sub1, (class353.aClass432_Sub1_3489.aByte8658 != (Class263_Sub2.myPlayer.aByte8658)), 1703070625);
							class432_sub1_sub1_sub1_sub1.anInt10014 = client.anInt8981 * 523351921;
						}
						if (class353.aClass432_Sub1_3489 instanceof NPC) {
							NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class353.aClass432_Sub1_3489);
							if (class432_sub1_sub1_sub1_sub2.aClass551_10251 != null) {
								Class260 class260 = (class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606);
								if ((((-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)) & 0x1) == 0 && 0 == ((int) class260.aFloat2716 & 0x1ff) && (((int) class260.aFloat2711 & 0x1ff) == 0)) || (((-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)) & 0x1) == 1 && (((int) class260.aFloat2716 & 0x1ff) == 256) && (((int) class260.aFloat2711 & 0x1ff) == 256))) {
									int i_52_ = ((int) class260.aFloat2716 - (((-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)) - 1) << 8));
									int i_53_ = ((int) class260.aFloat2711 - (((-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)) - 1) << 8));
									for (int i_54_ = 0; i_54_ < -823688441 * client.anInt9017; i_54_++) {
										Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) client.anIntArray9018[i_54_])));
										if (null == class330_sub35) {
											if (i_16_ != 571238882)
												throw new IllegalStateException();
										} else {
											NPC class432_sub1_sub1_sub1_sub2_55_ = ((NPC) (class330_sub35.anObject7733));
											if ((822953439 * client.anInt8981 != (723470927 * (class432_sub1_sub1_sub1_sub2_55_.anInt10014))) && (class432_sub1_sub1_sub1_sub2 != class432_sub1_sub1_sub1_sub2_55_)) {
												if (!class432_sub1_sub1_sub1_sub2_55_.aBoolean10012) {
													if (i_16_ != 571238882)
														throw new IllegalStateException();
												} else {
													Class260 class260_56_ = (class432_sub1_sub1_sub1_sub2_55_.method5346().aClass260_2606);
													int i_57_ = ((int) (class260_56_.aFloat2716) - (((class432_sub1_sub1_sub1_sub2_55_.aClass551_10251.anInt6295) * -1943771105) - 1 << 8));
													int i_58_ = ((int) (class260_56_.aFloat2711) - (((-1943771105 * (class432_sub1_sub1_sub1_sub2_55_.aClass551_10251.anInt6295)) - 1) << 8));
													if (i_57_ >= i_52_ && ((-1943771105 * (class432_sub1_sub1_sub1_sub2_55_.aClass551_10251.anInt6295)) <= (((class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295) * -1943771105) - ((i_57_ - i_52_) >> 9))) && i_58_ >= i_53_ && ((-1943771105 * (class432_sub1_sub1_sub1_sub2_55_.aClass551_10251.anInt6295)) <= (((class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295) * -1943771105) - ((i_58_ - i_53_) >> 9)))) {
														Class411.method5233(class432_sub1_sub1_sub1_sub2_55_, ((class353.aClass432_Sub1_3489.aByte8658) != (Class263_Sub2.myPlayer.aByte8658)), -1208420560);
														class432_sub1_sub1_sub1_sub2_55_.anInt10014 = (client.anInt8981 * 523351921);
													}
												}
											}
										}
									}
									int i_59_ = -1468156857 * Class15.anInt192;
									int[] is = Class15.anIntArray187;
									for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
										Player class432_sub1_sub1_sub1_sub1 = (client.players[is[i_60_]]);
										if ((class432_sub1_sub1_sub1_sub1 != null) && ((723470927 * (class432_sub1_sub1_sub1_sub1.anInt10014)) != (client.anInt8981 * 822953439))) {
											if (!class432_sub1_sub1_sub1_sub1.aBoolean10012) {
												if (i_16_ != 571238882)
													throw new IllegalStateException();
											} else {
												Class260 class260_61_ = (class432_sub1_sub1_sub1_sub1.method5346().aClass260_2606);
												int i_62_ = ((int) (class260_61_.aFloat2716) - ((class432_sub1_sub1_sub1_sub1.method5453(-1968581438)) - 1 << 8));
												int i_63_ = ((int) (class260_61_.aFloat2711) - ((class432_sub1_sub1_sub1_sub1.method5453(-1950825666)) - 1 << 8));
												if (i_62_ >= i_52_ && ((class432_sub1_sub1_sub1_sub1.method5453(-643151750)) <= ((-1943771105 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295)) - (i_62_ - i_52_ >> 9))) && i_63_ >= i_53_ && ((class432_sub1_sub1_sub1_sub1.method5453(-598492352)) <= (((class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295) * -1943771105) - (i_63_ - i_53_ >> 9)))) {
													Class497.method6103(class432_sub1_sub1_sub1_sub1, ((Class263_Sub2.myPlayer.aByte8658) != (class353.aClass432_Sub1_3489.aByte8658)), 1129218400);
													class432_sub1_sub1_sub1_sub1.anInt10014 = (523351921 * client.anInt8981);
												}
											}
										}
									}
								}
								if (822953439 * client.anInt8981 == (723470927 * (class432_sub1_sub1_sub1_sub2.anInt10014))) {
									if (i_16_ != 571238882)
										throw new IllegalStateException();
									continue;
								}
								Class411.method5233(class432_sub1_sub1_sub1_sub2, (class353.aClass432_Sub1_3489.aByte8658 != (Class263_Sub2.myPlayer.aByte8658)), -655767776);
								class432_sub1_sub1_sub1_sub2.anInt10014 = client.anInt8981 * 523351921;
							}
						}
						if (class353.aClass432_Sub1_3489 instanceof Class432_Sub1_Sub2_Sub1) {
							int i_64_ = i_37_ + -1261027839 * class381.gameSceneBaseX;
							int i_65_ = i_38_ + -1542584207 * class381.gameSceneBaseY;
							Class330_Sub9 class330_sub9 = ((Class330_Sub9) (client.aClass497_9138.method6094((long) ((class353.aClass432_Sub1_3489.aByte8658) << 28 | i_65_ << 14 | i_64_))));
							if (class330_sub9 != null) {
								int i_66_ = 0;
								Class330_Sub3 class330_sub3 = ((Class330_Sub3) class330_sub9.aClass471_7573.method5871((byte) -113));
								while (null != class330_sub3) {
									ItemDefinitions itemDefinitions = (Class556.aClass510_6392.getItemDefinitions((class330_sub3.anInt7513 * -862355691), (byte) -44));
									int i_67_;
									if (itemDefinitions.aBoolean6716)
										i_67_ = itemDefinitions.anInt6713 * -881260187;
									else if (itemDefinitions.aBoolean6707)
										i_67_ = 266533345 * (Class534.aClass412_6788.anInt4253);
									else
										i_67_ = -1925692033 * (Class534.aClass412_6788.anInt4254);
									if (client.aBoolean9150 && ((class353.aClass432_Sub1_3489.aByte8658) == (Class263_Sub2.myPlayer.aByte8658))) {
										Class537 class537 = (-1 != (1552382549 * OutgoingPacket.anInt2579) ? (Class301.aClass543_3059.method6339((1552382549 * OutgoingPacket.anInt2579), -876957206)) : null);
										if (0 != ((-1357430571 * Class503.anInt5916) & 0x1) && (null == class537 || ((itemDefinitions.method6287((OutgoingPacket.anInt2579 * 1552382549), (class537.anInt6235 * -735399997), 1309923611)) != (class537.anInt6235 * -735399997))))
											Class360.method4241(client.aString9152, new StringBuilder().append(client.aString9154).append(" ").append(Class215.aString2082).append(" ").append(Class146.method1738(i_67_, -849826454)).append(itemDefinitions.name).toString(), (-2126481065 * Class271.anInt2756), 17, -1, (long) ((class330_sub3.anInt7513) * -862355691), i_37_, i_38_, true, false, (long) i_66_, false, (short) 140);
									}
									if ((Class263_Sub2.myPlayer.aByte8658) == (class353.aClass432_Sub1_3489.aByte8658)) {
										String[] strings = itemDefinitions.groundOptions;
										for (int i_68_ = strings.length - 1; i_68_ >= 0; i_68_--) {
											if (null != strings[i_68_]) {
												int i_69_ = 0;
												int i_70_ = (client.anInt9148 * 1985599555);
												if (0 == i_68_)
													i_69_ = 18;
												if (1 == i_68_)
													i_69_ = 19;
												if (i_68_ == 2)
													i_69_ = 20;
												if (i_68_ == 3)
													i_69_ = 21;
												if (4 == i_68_)
													i_69_ = 22;
												if (5 == i_68_)
													i_69_ = 1004;
												int i_71_ = (itemDefinitions.method6289(i_68_, 1135555263));
												if (-1 != i_71_)
													i_70_ = i_71_;
												Class360.method4241(strings[i_68_], new StringBuilder().append(Class146.method1738(i_67_, -849826454)).append(itemDefinitions.name).toString(), i_70_, i_69_, -1, (long) (-862355691 * (class330_sub3.anInt7513)), i_37_, i_38_, true, false, (long) i_66_, false, (short) 140);
											}
										}
									}
									class330_sub3 = ((Class330_Sub3) class330_sub9.aClass471_7573.method5874(-1661705827));
									i_66_++;
								}
							}
						}
						if (class353.aClass432_Sub1_3489 instanceof Interface2) {
							Interface2 interface2 = (Interface2) class353.aClass432_Sub1_3489;
							Class473 class473 = (client.aClass304_9030.method3025((byte) 13).method5705(interface2.method34((short) -28471), (byte) -78));
							if (null != class473.anIntArray5678)
								class473 = class473.method5900((Class158.aClass561_6474), (byte) -72);
							if (class473 == null) {
								if (i_16_ != 571238882) {
									/* empty */
								}
							} else {
								if (client.aBoolean9150 && (class353.aClass432_Sub1_3489.aByte8658 == (Class263_Sub2.myPlayer.aByte8658))) {
									Class537 class537 = ((1552382549 * OutgoingPacket.anInt2579 != -1) ? (Class301.aClass543_3059.method6339(1552382549 * OutgoingPacket.anInt2579, -254533846)) : null);
									if ((Class503.anInt5916 * -1357430571 & 0x4) != 0 && (class537 == null || ((class473.method5901((1552382549 * OutgoingPacket.anInt2579), (class537.anInt6235 * -735399997), 1580513929)) != (class537.anInt6235 * -735399997))))
										Class360.method4241(client.aString9152, new StringBuilder().append(client.aString9154).append(" ").append(Class215.aString2082).append(" ").append(Class146.method1738(65535, -849826454)).append(class473.aString5618).toString(), Class271.anInt2756 * -2126481065, 2, -1, Class112.method1372(interface2, i_37_, i_38_, 1450998092), i_37_, i_38_, true, false, (long) interface2.hashCode(), false, (short) 140);
								}
								if ((Class263_Sub2.myPlayer.aByte8658) == (class353.aClass432_Sub1_3489.aByte8658)) {
									String[] strings = class473.aStringArray5649;
									if (null != strings) {
										for (int i_72_ = strings.length - 1; i_72_ >= 0; i_72_--) {
											if (strings[i_72_] != null) {
												int i_73_ = 0;
												int i_74_ = (client.anInt9148 * 1985599555);
												if (0 == i_72_)
													i_73_ = 3;
												if (i_72_ == 1)
													i_73_ = 4;
												if (i_72_ == 2)
													i_73_ = 5;
												if (i_72_ == 3)
													i_73_ = 6;
												if (i_72_ == 4)
													i_73_ = 1001;
												if (i_72_ == 5)
													i_73_ = 1002;
												int i_75_ = (class473.method5908(i_72_, -1655813558));
												if (-1 != i_75_)
													i_74_ = i_75_;
												Class360.method4241(strings[i_72_], new StringBuilder().append(Class146.method1738(65535, -849826454)).append(class473.aString5618).toString(), i_74_, i_73_, -1, (Class112.method1372(interface2, i_37_, i_38_, 1132960312)), i_37_, i_38_, true, false, (long) interface2.hashCode(), false, (short) 140);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uk.a(").append(')').toString());
		}
	}

	static void method6085(Class549_Sub1 class549_sub1, byte i) {
		try {
			class549_sub1.method6362(0, (byte) 57);
			int i_76_;
			if (Class332.anInt6617 * -270157335 >= 96) {
				int i_77_ = Class372.method4335((byte) 107);
				if (i_77_ <= 103) {
					Class283.method2828(-817082595);
					i_76_ = 4;
				} else if (i_77_ <= 500) {
					Class95_Sub12_Sub1.method1141(-1892843887);
					i_76_ = 3;
				} else if (i_77_ <= 1001) {
					Class51.method634(1235653257);
					i_76_ = 2;
				} else {
					Class330_Sub18.method3342(true, 1275568489);
					i_76_ = 1;
				}
				class549_sub1.method6363(0, i_77_, (byte) 91);
			} else {
				Class330_Sub18.method3342(true, -659284292);
				i_76_ = 1;
				class549_sub1.method6361(64, -2144652853);
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(581894501) != 0) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub23_7908, 0, -1652825798);
				Class171.method2046(0, false, 1920957857);
			} else
				Class448.aClass330_Sub50_5555.method3857(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895, true, 1712482685);
			Class435.method5568(2089116244);
			class549_sub1.method6360(i_76_, 95955317);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uk.o(").append(')').toString());
		}
	}
}
