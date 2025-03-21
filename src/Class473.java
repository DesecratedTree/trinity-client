/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class473 {
	public boolean aBoolean5615;
	public boolean aBoolean5616;
	int[] anIntArray5617;
	public String aString5618 = "null";
	int anInt5619;
	static int anInt5620 = 6;
	public boolean aBoolean5621;
	byte[] aByteArray5622;
	public short[] aShortArray5623;
	byte[] aByteArray5624;
	short[] aShortArray5625;
	public short[] aShortArray5626;
	byte[] aByteArray5627;
	public int anInt5628;
	byte aByte5629;
	byte aByte5630;
	public static short[] aShortArray5631 = new short[256];
	byte aByte5632 = 0;
	public byte[] aByteArray5633;
	int anInt5634;
	public int anInt5635;
	public boolean aBoolean5636;
	public int anInt5637;
	byte aByte5638;
	int anInt5639;
	public int anInt5640;
	public int anInt5641;
	public int anInt5642;
	public int anInt5643;
	int[] anIntArray5644;
	int[] anIntArray5645;
	public int anInt5646;
	public boolean aBoolean5647;
	public boolean aBoolean5648;
	public String[] aStringArray5649;
	public int anInt5650;
	public int anInt5651;
	public int anInt5652;
	public boolean aBoolean5653;
	public int anInt5654;
	public boolean aBoolean5655;
	public boolean aBoolean5656;
	public int anInt5657;
	int anInt5658;
	int anInt5659;
	int anInt5660;
	byte aByte5661;
	public int anInt5662;
	int anInt5663;
	int anInt5664;
	int anInt5665;
	int anInt5666;
	public boolean aBoolean5667;
	public boolean aBoolean5668;
	public boolean aBoolean5669;
	public int anInt5670;
	Class463 aClass463_5671;
	int anInt5672;
	int anInt5673;
	public int anInt5674 = 1726740791;
	public int anInt5675;
	public int anInt5676;
	public int anInt5677;
	public int[] anIntArray5678;
	public int anInt5679;
	public int anInt5680 = -398867647;
	public int[] anIntArray5681;
	short[] aShortArray5682;
	public boolean aBoolean5683;
	public int[][] anIntArrayArray5684;
	public boolean aBoolean5685;
	int anInt5686;
	Class497 aClass497_5687;
	public boolean aBoolean5688;
	public int anInt5689;
	public boolean aBoolean5690;
	int anInt5691;
	public boolean aBoolean5692;
	public int[] anIntArray5693;
	static int anInt5694 = 127007;
	public static int anInt5695;

	void method5893(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(558287874);
				if (i_0_ == 0) {
					if (i < 1972979007)
						break;
					break;
				}
				method5894(class330_sub46, i_0_, 561621539);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.r(").append(')').toString());
		}
	}

	void method5894(Buffer class330_sub46, int i, int i_1_) {
		try {
			if (i == 1) {
				int i_2_ = class330_sub46.readUnsignedByte(679421791);
				aByteArray5633 = new byte[i_2_];
				anIntArrayArray5684 = new int[i_2_][];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					aByteArray5633[i_3_] = class330_sub46.readByte((byte) -16);
					int i_4_ = class330_sub46.readUnsignedByte(1000558998);
					anIntArrayArray5684[i_3_] = new int[i_4_];
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
						anIntArrayArray5684[i_3_][i_5_] = class330_sub46.readBigSmart(-1758367486);
				}
			} else if (i == 2)
				aString5618 = class330_sub46.readString(-846327259);
			else if (14 == i)
				anInt5674 = class330_sub46.readUnsignedByte(1920295740) * 1726740791;
			else if (15 == i)
				anInt5680 = class330_sub46.readUnsignedByte(168163818) * -398867647;
			else if (i == 17) {
				anInt5635 = 0;
				aBoolean5636 = false;
			} else if (18 == i)
				aBoolean5636 = false;
			else if (19 == i)
				anInt5637 = class330_sub46.readUnsignedByte(2139937693) * -1311087757;
			else if (i == 21)
				((Class473) this).aByte5638 = (byte) 1;
			else if (i == 22)
				aBoolean5647 = true;
			else if (i == 23)
				anInt5641 = 1435205305;
			else if (24 == i) {
				int i_6_ = class330_sub46.readBigSmart(-2060811680);
				if (-1 != i_6_)
					((Class473) this).anIntArray5644 = new int[] { i_6_ };
			} else if (i == 27)
				anInt5635 = -928432501;
			else if (28 == i)
				anInt5646 = ((class330_sub46.readUnsignedByte(413952470) << 2) * -1630276039);
			else if (29 == i)
				((Class473) this).anInt5639 = class330_sub46.readByte((byte) -85) * 1800419753;
			else if (39 == i)
				((Class473) this).anInt5691 = class330_sub46.readByte((byte) 21) * -326546409;
			else if (i >= 30 && i < 35)
				aStringArray5649[i - 30] = class330_sub46.readString(-1623546899);
			else if (40 == i) {
				int i_7_ = class330_sub46.readUnsignedByte(1109028870);
				((Class473) this).aShortArray5682 = new short[i_7_];
				aShortArray5623 = new short[i_7_];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
					((Class473) this).aShortArray5682[i_8_] = (short) class330_sub46.readUnsignedShort(1877074007);
					aShortArray5623[i_8_] = (short) class330_sub46.readUnsignedShort(1512189943);
				}
			} else if (41 == i) {
				int i_9_ = class330_sub46.readUnsignedByte(98548825);
				((Class473) this).aShortArray5625 = new short[i_9_];
				aShortArray5626 = new short[i_9_];
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
					((Class473) this).aShortArray5625[i_10_] = (short) class330_sub46.readUnsignedShort(499841000);
					aShortArray5626[i_10_] = (short) class330_sub46.readUnsignedShort(1519943345);
				}
			} else if (42 == i) {
				int i_11_ = class330_sub46.readUnsignedByte(1458881202);
				((Class473) this).aByteArray5624 = new byte[i_11_];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
					((Class473) this).aByteArray5624[i_12_] = class330_sub46.readByte((byte) 92);
			} else if (44 == i) {
				int i_13_ = class330_sub46.readUnsignedShort(1121534826);
				int i_14_ = 0;
				for (int i_15_ = i_13_; i_15_ > 0; i_15_ >>= 1)
					i_14_++;
				((Class473) this).aByteArray5627 = new byte[i_14_];
				byte i_16_ = 0;
				for (int i_17_ = 0; i_17_ < i_14_; i_17_++) {
					if ((i_13_ & 1 << i_17_) > 0) {
						((Class473) this).aByteArray5627[i_17_] = i_16_;
						i_16_++;
					} else
						((Class473) this).aByteArray5627[i_17_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_18_ = class330_sub46.readUnsignedShort(-299297793);
				int i_19_ = 0;
				for (int i_20_ = i_18_; i_20_ > 0; i_20_ >>= 1)
					i_19_++;
				((Class473) this).aByteArray5622 = new byte[i_19_];
				byte i_21_ = 0;
				for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
					if ((i_18_ & 1 << i_22_) > 0) {
						((Class473) this).aByteArray5622[i_22_] = i_21_;
						i_21_++;
					} else
						((Class473) this).aByteArray5622[i_22_] = (byte) -1;
				}
			} else if (i == 62)
				aBoolean5656 = true;
			else if (64 == i)
				aBoolean5669 = false;
			else if (i == 65)
				((Class473) this).anInt5658 = class330_sub46.readUnsignedShort(2020821427) * 411640467;
			else if (i == 66)
				((Class473) this).anInt5659 = class330_sub46.readUnsignedShort(908750802) * -703012927;
			else if (67 == i)
				((Class473) this).anInt5660 = class330_sub46.readUnsignedShort(1947475497) * 2011770421;
			else if (69 == i)
				class330_sub46.readUnsignedByte(1076906878);
			else if (70 == i)
				((Class473) this).anInt5686 = (class330_sub46.readShort(-1100583751) << 2) * 84492147;
			else if (i == 71)
				((Class473) this).anInt5619 = ((class330_sub46.readShort(-1100583751) << 2) * -1371448325);
			else if (72 == i)
				((Class473) this).anInt5663 = ((class330_sub46.readShort(-1100583751) << 2) * 488210503);
			else if (73 == i)
				aBoolean5667 = true;
			else if (74 == i)
				aBoolean5668 = true;
			else if (i == 75)
				anInt5640 = class330_sub46.readUnsignedByte(1909343902) * -1888786619;
			else if (77 == i || 92 == i) {
				((Class473) this).anInt5672 = class330_sub46.readUnsignedShort(1157819824) * 1182334513;
				if (65535 == ((Class473) this).anInt5672 * -729834799)
					((Class473) this).anInt5672 = -1182334513;
				((Class473) this).anInt5673 = class330_sub46.readUnsignedShort(1404924389) * 528051037;
				if (65535 == 1937326325 * ((Class473) this).anInt5673)
					((Class473) this).anInt5673 = -528051037;
				int i_23_ = -1;
				if (92 == i)
					i_23_ = class330_sub46.readBigSmart(-1712777337);
				int i_24_ = class330_sub46.readUnsignedByte(1000900380);
				anIntArray5678 = new int[2 + i_24_];
				for (int i_25_ = 0; i_25_ <= i_24_; i_25_++)
					anIntArray5678[i_25_] = class330_sub46.readBigSmart(-621821685);
				anIntArray5678[1 + i_24_] = i_23_;
			} else if (i == 78) {
				anInt5650 = class330_sub46.readUnsignedShort(1960488242) * 1435181289;
				anInt5675 = class330_sub46.readUnsignedByte(961576771) * 2057700513;
			} else if (79 == i) {
				anInt5679 = class330_sub46.readUnsignedShort(149508987) * -1105307631;
				anInt5628 = class330_sub46.readUnsignedShort(1572546000) * 216079769;
				anInt5675 = class330_sub46.readUnsignedByte(799669580) * 2057700513;
				int i_26_ = class330_sub46.readUnsignedByte(498259176);
				anIntArray5681 = new int[i_26_];
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
					anIntArray5681[i_27_] = class330_sub46.readUnsignedShort(-247196595);
			} else if (i == 81) {
				((Class473) this).aByte5638 = (byte) 2;
				((Class473) this).anInt5634 = class330_sub46.readUnsignedByte(446148821) * -831928064;
			} else if (82 == i)
				aBoolean5690 = true;
			else if (i == 88)
				aBoolean5685 = false;
			else if (89 == i)
				aBoolean5648 = false;
			else if (i == 91)
				aBoolean5621 = true;
			else if (93 == i) {
				((Class473) this).aByte5638 = (byte) 3;
				((Class473) this).anInt5634 = class330_sub46.readUnsignedShort(1515863237) * -1848743479;
			} else if (94 == i)
				((Class473) this).aByte5638 = (byte) 4;
			else if (95 == i) {
				((Class473) this).aByte5638 = (byte) 5;
				((Class473) this).anInt5634 = class330_sub46.readShort(-1100583751) * -1848743479;
			} else if (i == 97)
				aBoolean5653 = true;
			else if (i == 98)
				aBoolean5688 = true;
			else if (99 == i || 100 == i) {
				class330_sub46.readUnsignedByte(1197648028);
				class330_sub46.readUnsignedShort(1880359968);
			} else if (i == 101)
				anInt5654 = class330_sub46.readUnsignedByte(-32165944) * -632822413;
			else if (102 == i)
				anInt5652 = class330_sub46.readUnsignedShort(603603868) * 1148422129;
			else if (i == 103)
				anInt5641 = 0;
			else if (104 == i)
				anInt5677 = class330_sub46.readUnsignedByte(659384878) * 372096619;
			else if (i == 105)
				aBoolean5655 = true;
			else if (i == 106) {
				int i_28_ = class330_sub46.readUnsignedByte(-259483933);
				int i_29_ = 0;
				((Class473) this).anIntArray5644 = new int[i_28_];
				((Class473) this).anIntArray5645 = new int[i_28_];
				for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
					((Class473) this).anIntArray5644[i_30_] = class330_sub46.readBigSmart(-782385596);
					i_29_ += ((Class473) this).anIntArray5645[i_30_] = class330_sub46.readUnsignedByte(945032375);
				}
				for (int i_31_ = 0; i_31_ < i_28_; i_31_++)
					((Class473) this).anIntArray5645[i_31_] = (65535 * ((Class473) this).anIntArray5645[i_31_] / i_29_);
			} else if (i == 107)
				anInt5651 = class330_sub46.readUnsignedShort(1383425123) * 324289985;
			else if (i >= 150 && i < 155) {
				aStringArray5649[i - 150] = class330_sub46.readString(804302639);
				if (!((Class463) ((Class473) this).aClass463_5671).aBoolean5584)
					aStringArray5649[i - 150] = null;
			} else if (i == 160) {
				int i_32_ = class330_sub46.readUnsignedByte(1012112626);
				anIntArray5693 = new int[i_32_];
				for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
					anIntArray5693[i_33_] = class330_sub46.readUnsignedShort(356947477);
			} else if (i == 162) {
				((Class473) this).aByte5638 = (byte) 3;
				((Class473) this).anInt5634 = class330_sub46.readInt((byte) 74) * -1848743479;
			} else if (163 == i) {
				((Class473) this).aByte5629 = class330_sub46.readByte((byte) -8);
				((Class473) this).aByte5630 = class330_sub46.readByte((byte) -2);
				((Class473) this).aByte5661 = class330_sub46.readByte((byte) -1);
				((Class473) this).aByte5632 = class330_sub46.readByte((byte) -101);
			} else if (164 == i)
				((Class473) this).anInt5664 = class330_sub46.readShort(-1100583751) * -604142443;
			else if (165 == i)
				((Class473) this).anInt5665 = class330_sub46.readShort(-1100583751) * -1446257807;
			else if (i == 166)
				((Class473) this).anInt5666 = class330_sub46.readShort(-1100583751) * 132025299;
			else if (i == 167)
				anInt5670 = class330_sub46.readUnsignedShort(1684374579) * 836987259;
			else if (i == 168)
				aBoolean5615 = true;
			else if (169 == i)
				aBoolean5616 = true;
			else if (170 == i)
				anInt5642 = class330_sub46.readSmart(-1035546029) * 443128809;
			else if (171 == i)
				anInt5643 = class330_sub46.readSmart(-1442870272) * -1159087103;
			else if (i == 173) {
				anInt5689 = class330_sub46.readUnsignedShort(55858290) * -443208005;
				anInt5662 = class330_sub46.readUnsignedShort(928442961) * 1802605033;
			} else if (i == 177)
				aBoolean5692 = true;
			else if (178 == i)
				anInt5676 = class330_sub46.readUnsignedByte(1021320627) * -1962063897;
			else if (i == 189)
				aBoolean5683 = true;
			else if (i >= 190 && i < 196) {
				if (null == ((Class473) this).anIntArray5617) {
					((Class473) this).anIntArray5617 = new int[6];
					Arrays.fill(((Class473) this).anIntArray5617, -1);
				}
				((Class473) this).anIntArray5617[i - 190] = class330_sub46.readUnsignedShort(20987896);
			} else if (249 == i) {
				int i_34_ = class330_sub46.readUnsignedByte(-85137837);
				if (((Class473) this).aClass497_5687 == null) {
					int i_35_ = Class136.method1594(i_34_, 1909090493);
					((Class473) this).aClass497_5687 = new Class497(i_35_);
				}
				for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
					boolean bool = class330_sub46.readUnsignedByte(319633765) == 1;
					int i_37_ = class330_sub46.readUnsignedTriByte(-1401356047);
					Class330 class330;
					if (bool)
						class330 = new Class330_Sub35(class330_sub46.readString(-669082569));
					else
						class330 = new Class330_Sub23(class330_sub46.readInt((byte) 69));
					((Class473) this).aClass497_5687.method6097(class330, (long) i_37_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.j(").append(')').toString());
		}
	}

	public final boolean method5895(int i, byte i_38_) {
		try {
			if (anIntArrayArray5684 == null)
				return true;
			boolean bool = true;
			synchronized (((Class463) ((Class473) this).aClass463_5671).aClass280_5575) {
				for (int i_39_ = 0; i_39_ < aByteArray5633.length; i_39_++) {
					if (i == aByteArray5633[i_39_]) {
						for (int i_40_ = 0; i_40_ < anIntArrayArray5684[i_39_].length; i_40_++) {
							if (!((Class463) ((Class473) this).aClass463_5671).aClass280_5575.hasStoredFile(anIntArrayArray5684[i_39_][i_40_], 0, (byte) 32))
								bool = false;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.p(").append(')').toString());
		}
	}

	public final boolean method5896(int i) {
		try {
			if (null == anIntArrayArray5684)
				return true;
			boolean bool = true;
			synchronized (((Class463) ((Class473) this).aClass463_5671).aClass280_5575) {
				for (int i_41_ = 0; i_41_ < anIntArrayArray5684.length; i_41_++) {
					for (int i_42_ = 0; i_42_ < anIntArrayArray5684[i_41_].length; i_42_++)
						bool &= (((Class463) ((Class473) this).aClass463_5671).aClass280_5575.hasStoredFile(anIntArrayArray5684[i_41_][i_42_], 0, (byte) 32));
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.o(").append(')').toString());
		}
	}

	public final synchronized Class485 method5897(Class_ra class_ra, int i, int i_43_, int i_44_, Class_xa class_xa, Class_xa class_xa_45_, int i_46_, int i_47_, int i_48_, boolean bool, Class481 class481, byte i_49_) {
		try {
			if (Class432_Sub1_Sub1_Sub1.method5459(i_43_, (byte) 0))
				i_43_ = -344921723 * Class476.aClass476_6899.anInt6882;
			long l = (long) ((anInt5657 * 1996927381 << 10) + (i_43_ << 3) + i_44_);
			l |= (long) (1409150453 * class_ra.anInt4226 << 29);
			if (class481 != null)
				l |= (7764679082563636783L * ((Class481) class481).aLong5767 << 32);
			int i_50_ = i;
			if (3 == ((Class473) this).aByte5638)
				i_50_ |= 0x7;
			else {
				if (0 != ((Class473) this).aByte5638 || 0 != -109607535 * ((Class473) this).anInt5665)
					i_50_ |= 0x2;
				if (0 != 181085885 * ((Class473) this).anInt5664)
					i_50_ |= 0x1;
				if (((Class473) this).anInt5666 * -682163109 != 0)
					i_50_ |= 0x4;
			}
			if (bool)
				i_50_ |= 0x40000;
			boolean bool_51_ = (((Class473) this).aByte5638 != 0 && (class_xa != null || class_xa_45_ != null));
			boolean bool_52_ = (0 != ((Class473) this).anInt5664 * 181085885 || 0 != -109607535 * ((Class473) this).anInt5665 || 0 != -682163109 * ((Class473) this).anInt5666);
			Class485 class485;
			synchronized (((Class463) ((Class473) this).aClass463_5671).aClass367_5579) {
				class485 = (Class485) ((Class463) ((Class473) this).aClass463_5671).aClass367_5579.get(l);
			}
			Class387 class387 = (Class387) (null != class485 ? class485.anObject5824 : null);
			Class_na class_na = null;
			do {
				if (null == class387 || class_ra.ct(class387.m(), i_50_) != 0) {
					if (class387 != null)
						i_50_ = class_ra.cd(i_50_, class387.m());
					int i_53_ = i_50_;
					if (i_43_ == -344921723 * Class476.aClass476_6898.anInt6882 && i_44_ > 3)
						i_53_ |= 0x5;
					class387 = method5899(class_ra, i_53_, i_43_, i_44_, class481, (byte) 15);
					if (class387 == null)
						return null;
					if (-344921723 * Class476.aClass476_6898.anInt6882 == i_43_ && i_44_ > 3)
						class387.f(2048);
					if (bool && !bool_51_ && !bool_52_)
						class_na = class387.ga(null);
					class387.KA(i_50_);
					class485 = new Class485(class387, class_na);
					synchronized (((Class463) ((Class473) this).aClass463_5671).aClass367_5579) {
						((Class463) ((Class473) this).aClass463_5671).aClass367_5579.put(class485, l);
						break;
					}
				}
				class_na = (Class_na) class485.anObject5823;
				if (bool && class_na == null && !bool_51_ && !bool_52_)
					class_na = (Class_na) (class485.anObject5823 = class387.ga(null));
			} while (false);
			if (bool_51_ || bool_52_) {
				class387 = class387.method4446((byte) 0, i_50_, true);
				if (bool_51_)
					class387.pa(((Class473) this).aByte5638, ((Class473) this).anInt5634 * 569376889, class_xa, class_xa_45_, i_46_, i_47_, i_48_);
				if (bool_52_)
					class387.ia(((Class473) this).anInt5664 * 181085885, ((Class473) this).anInt5665 * -109607535, -682163109 * ((Class473) this).anInt5666);
				if (bool)
					class_na = class387.ga(null);
				class387.KA(i);
			} else
				class387 = class387.method4446((byte) 0, i, true);
			((Class463) ((Class473) this).aClass463_5671).aClass485_5582.anObject5824 = class387;
			((Class463) ((Class473) this).aClass463_5671).aClass485_5582.anObject5823 = class_na;
			return (((Class463) ((Class473) this).aClass463_5671).aClass485_5582);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.s(").append(')').toString());
		}
	}

	public final synchronized Class387 method5898(Class_ra class_ra, int i, int i_54_, int i_55_, Class_xa class_xa, Class_xa class_xa_56_, int i_57_, int i_58_, int i_59_, Class477 class477, Class481 class481, int i_60_) {
		try {
			if (Class432_Sub1_Sub1_Sub1.method5459(i_54_, (byte) 0))
				i_54_ = -344921723 * Class476.aClass476_6899.anInt6882;
			long l = (long) (i_55_ + ((1996927381 * anInt5657 << 10) + (i_54_ << 3)));
			int i_61_ = i;
			l |= (long) (1409150453 * class_ra.anInt4226 << 29);
			if (class481 != null)
				l |= (7764679082563636783L * ((Class481) class481).aLong5767 << 32);
			if (null != class477)
				i |= class477.method5975(-13338400);
			if (3 == ((Class473) this).aByte5638)
				i |= 0x7;
			else {
				if (0 != ((Class473) this).aByte5638 || 0 != -109607535 * ((Class473) this).anInt5665)
					i |= 0x2;
				if (((Class473) this).anInt5664 * 181085885 != 0)
					i |= 0x1;
				if (0 != ((Class473) this).anInt5666 * -682163109)
					i |= 0x4;
			}
			if (-344921723 * Class476.aClass476_6898.anInt6882 == i_54_ && i_55_ > 3)
				i |= 0x5;
			Class387 class387;
			synchronized (((Class463) ((Class473) this).aClass463_5671).aClass367_5574) {
				class387 = (Class387) ((Class463) ((Class473) this).aClass463_5671).aClass367_5574.get(l);
			}
			if (null == class387 || class_ra.ct(class387.m(), i) != 0) {
				if (class387 != null)
					i = class_ra.cd(i, class387.m());
				class387 = method5899(class_ra, i, i_54_, i_55_, class481, (byte) 15);
				if (class387 == null)
					return null;
				synchronized (((Class463) ((Class473) this).aClass463_5671).aClass367_5574) {
					((Class463) ((Class473) this).aClass463_5671).aClass367_5574.put(class387, l);
				}
			}
			boolean bool = false;
			if (null != class477) {
				class387 = class387.method4446((byte) 1, i, true);
				bool = true;
				class477.method5976(class387, i_55_ & 0x3, -494881896);
			}
			if (Class476.aClass476_6898.anInt6882 * -344921723 == i_54_ && i_55_ > 3) {
				if (!bool) {
					class387 = class387.method4446((byte) 3, i, true);
					bool = true;
				}
				class387.f(2048);
			}
			if (((Class473) this).aByte5638 != 0) {
				if (!bool) {
					class387 = class387.method4446((byte) 3, i, true);
					bool = true;
				}
				class387.pa(((Class473) this).aByte5638, ((Class473) this).anInt5634 * 569376889, class_xa, class_xa_56_, i_57_, i_58_, i_59_);
			}
			if (181085885 * ((Class473) this).anInt5664 != 0 || -109607535 * ((Class473) this).anInt5665 != 0 || 0 != -682163109 * ((Class473) this).anInt5666) {
				if (!bool) {
					class387 = class387.method4446((byte) 3, i, true);
					bool = true;
				}
				class387.ia(((Class473) this).anInt5664 * 181085885, ((Class473) this).anInt5665 * -109607535, -682163109 * ((Class473) this).anInt5666);
			}
			if (bool)
				class387.KA(i_61_);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.f(").append(')').toString());
		}
	}

	Class387 method5899(Class_ra class_ra, int i, int i_62_, int i_63_, Class481 class481, byte i_64_) {
		try {
			int i_65_ = 64 + -1629783399 * ((Class473) this).anInt5639;
			int i_66_ = 850 + ((Class473) this).anInt5691 * -187213245;
			int i_67_ = i;
			boolean bool = (aBoolean5656 || (-344921723 * Class476.aClass476_6880.anInt6882 == i_62_ && i_63_ > 3));
			if (bool)
				i |= 0x10;
			if (i_63_ == 0) {
				if (204295067 * ((Class473) this).anInt5658 != 128 || ((Class473) this).anInt5686 * 1624178107 != 0)
					i |= 0x1;
				if (128 != ((Class473) this).anInt5660 * -624479203 || ((Class473) this).anInt5663 * -157931145 != 0)
					i |= 0x4;
			} else
				i |= 0xd;
			if (128 != ((Class473) this).anInt5659 * 2021339201 || 0 != ((Class473) this).anInt5619 * -1889831117)
				i |= 0x2;
			if (null != ((Class473) this).aShortArray5682)
				i |= 0x4000;
			if (((Class473) this).aShortArray5625 != null)
				i |= 0x8000;
			if (((Class473) this).aByte5632 != 0)
				i |= 0x80000;
			Class387 class387 = null;
			if (null != aByteArray5633) {
				int i_68_ = -1;
				for (int i_69_ = 0; i_69_ < aByteArray5633.length; i_69_++) {
					if (aByteArray5633[i_69_] == i_62_) {
						i_68_ = i_69_;
						break;
					}
				}
				if (i_68_ == -1)
					return null;
				int[] is = ((class481 != null && ((Class481) class481).anIntArray5768 != null) ? ((Class481) class481).anIntArray5768 : anIntArrayArray5684[i_68_]);
				int i_70_ = is.length;
				if (i_70_ > 0) {
					long l = (long) (class_ra.anInt4226 * 1409150453);
					for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
						l = 67783L * l + (long) is[i_71_];
					synchronized (((Class463) ((Class473) this).aClass463_5671).aClass367_5578) {
						class387 = ((Class387) ((Class463) ((Class473) this).aClass463_5671).aClass367_5578.get(l));
					}
					if (null != class387) {
						if (i_65_ != class387.c())
							i |= 0x1000;
						if (i_66_ != class387.Z())
							i |= 0x2000;
					}
					if (null == class387 || class_ra.ct(class387.m(), i) != 0) {
						int i_72_ = i | 0x1f01f;
						if (class387 != null)
							i_72_ = class_ra.cd(i_72_, class387.m());
						Model class98 = null;
						synchronized (((Class463) ((Class473) this).aClass463_5671).aClass98Array5583) {
							for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
								synchronized (((Class463) (((Class473) this).aClass463_5671)).aClass280_5575) {
									class98 = (Model.loadModel((((Class463) (((Class473) this).aClass463_5671)).aClass280_5575), is[i_73_], 0));
								}
								if (null == class98) {
									Class387 class387_74_ = null;
									return class387_74_;
								}
								if (class98.anInt881 < 13)
									class98.method1196(2);
								if (i_70_ > 1)
									((Class463) ((Class473) this).aClass463_5671).aClass98Array5583[i_73_] = class98;
							}
							if (i_70_ > 1)
								class98 = new Model((((Class463) (((Class473) this).aClass463_5671)).aClass98Array5583), i_70_);
						}
						class387 = class_ra.cb(class98, i_72_, (1869027947 * (((Class463) (((Class473) this).aClass463_5671)).anInt5581)), i_65_, i_66_);
						synchronized (((Class463) ((Class473) this).aClass463_5671).aClass367_5578) {
							((Class463) ((Class473) this).aClass463_5671).aClass367_5578.put(class387, l);
						}
					}
				}
			}
			if (class387 == null)
				return null;
			Class387 class387_75_ = class387.method4446((byte) 0, i, true);
			if (i_65_ != class387.c())
				class387_75_.p(i_65_);
			if (i_66_ != class387.Z())
				class387_75_.Q(i_66_);
			if (bool)
				class387_75_.wa();
			if (i_62_ == -344921723 * Class476.aClass476_6899.anInt6882 && i_63_ > 3) {
				class387_75_.S(2048);
				class387_75_.ia(180, 0, -180);
			}
			i_63_ &= 0x3;
			if (1 == i_63_)
				class387_75_.S(4096);
			else if (i_63_ == 2)
				class387_75_.S(8192);
			else if (3 == i_63_)
				class387_75_.S(12288);
			if (((Class473) this).aShortArray5682 != null) {
				short[] is;
				if (class481 != null && null != ((Class481) class481).aShortArray5769)
					is = ((Class481) class481).aShortArray5769;
				else
					is = aShortArray5623;
				for (int i_76_ = 0; i_76_ < ((Class473) this).aShortArray5682.length; i_76_++) {
					if (null != ((Class473) this).aByteArray5624 && i_76_ < ((Class473) this).aByteArray5624.length)
						class387_75_.color((((Class473) this).aShortArray5682[i_76_]), aShortArray5631[(((Class473) this).aByteArray5624[i_76_]) & 0xff]);
					else
						class387_75_.color((((Class473) this).aShortArray5682[i_76_]), is[i_76_]);
				}
			}
			if (((Class473) this).aShortArray5625 != null) {
				short[] is;
				if (class481 != null && ((Class481) class481).aShortArray5770 != null)
					is = ((Class481) class481).aShortArray5770;
				else
					is = aShortArray5626;
				for (int i_77_ = 0; i_77_ < ((Class473) this).aShortArray5625.length; i_77_++)
					class387_75_.paintTexture(((Class473) this).aShortArray5625[i_77_], is[i_77_]);
			}
			if (((Class473) this).aByte5632 != 0)
				class387_75_.PA(((Class473) this).aByte5629, ((Class473) this).aByte5630, ((Class473) this).aByte5661, ((Class473) this).aByte5632 & 0xff);
			if (128 != ((Class473) this).anInt5658 * 204295067 || ((Class473) this).anInt5659 * 2021339201 != 128 || 128 != ((Class473) this).anInt5660 * -624479203)
				class387_75_.oa(((Class473) this).anInt5658 * 204295067, ((Class473) this).anInt5659 * 2021339201, ((Class473) this).anInt5660 * -624479203);
			if (1624178107 * ((Class473) this).anInt5686 != 0 || ((Class473) this).anInt5619 * -1889831117 != 0 || ((Class473) this).anInt5663 * -157931145 != 0)
				class387_75_.ia(((Class473) this).anInt5686 * 1624178107, ((Class473) this).anInt5619 * -1889831117, ((Class473) this).anInt5663 * -157931145);
			class387_75_.KA(i_67_);
			return class387_75_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.z(").append(')').toString());
		}
	}

	public final Class473 method5900(Interface29 interface29, byte i) {
		try {
			int i_78_ = -1;
			if (-729834799 * ((Class473) this).anInt5672 != -1)
				i_78_ = interface29.method310((-729834799 * ((Class473) this).anInt5672), -1792016667);
			else if (-1 != ((Class473) this).anInt5673 * 1937326325)
				i_78_ = interface29.method306((1937326325 * ((Class473) this).anInt5673), 1964280124);
			if (i_78_ < 0 || i_78_ >= anIntArray5678.length - 1) {
				int i_79_ = anIntArray5678[anIntArray5678.length - 1];
				if (i_79_ != -1)
					return ((Class473) this).aClass463_5671.method5705(i_79_, (byte) -57);
				return null;
			}
			if (-1 == anIntArray5678[i_78_])
				return null;
			return ((Class473) this).aClass463_5671.method5705(anIntArray5678[i_78_], (byte) -64);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.w(").append(')').toString());
		}
	}

	public int method5901(int i, int i_80_, int i_81_) {
		try {
			if (null == ((Class473) this).aClass497_5687)
				return i_80_;
			Class330_Sub23 class330_sub23 = ((Class330_Sub23) ((Class473) this).aClass497_5687.method6094((long) i));
			if (null == class330_sub23)
				return i_80_;
			return 393599711 * class330_sub23.anInt7693;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.n(").append(')').toString());
		}
	}

	public String method5902(int i, String string, int i_82_) {
		try {
			if (null == ((Class473) this).aClass497_5687)
				return string;
			Class330_Sub35 class330_sub35 = ((Class330_Sub35) ((Class473) this).aClass497_5687.method6094((long) i));
			if (class330_sub35 == null)
				return string;
			return (String) class330_sub35.anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.l(").append(')').toString());
		}
	}

	public int method5903(int i) {
		try {
			if (null != ((Class473) this).anIntArray5644) {
				if (((Class473) this).anIntArray5644.length > 1) {
					int i_83_ = (int) (Math.random() * 65535.0);
					for (int i_84_ = 0; i_84_ < ((Class473) this).anIntArray5644.length; i_84_++) {
						if (i_83_ <= ((Class473) this).anIntArray5645[i_84_])
							return ((Class473) this).anIntArray5644[i_84_];
						i_83_ -= ((Class473) this).anIntArray5645[i_84_];
					}
				} else
					return ((Class473) this).anIntArray5644[0];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.u(").append(')').toString());
		}
	}

	public boolean method5904(byte i) {
		try {
			return ((Class473) this).anIntArray5644 != null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.k(").append(')').toString());
		}
	}

	Class473() {
		anInt5635 = -1856865002;
		aBoolean5636 = true;
		anInt5637 = 1311087757;
		((Class473) this).aByte5638 = (byte) 0;
		((Class473) this).anInt5634 = 1848743479;
		aBoolean5647 = false;
		anInt5641 = -1435205305;
		anInt5642 = 201894336;
		anInt5643 = 0;
		((Class473) this).anIntArray5644 = null;
		((Class473) this).anIntArray5645 = null;
		anInt5646 = -1258451392;
		((Class473) this).anInt5639 = 0;
		((Class473) this).anInt5691 = 0;
		anInt5651 = -324289985;
		anInt5652 = -1148422129;
		aBoolean5653 = false;
		anInt5654 = 0;
		aBoolean5655 = false;
		aBoolean5656 = false;
		aBoolean5669 = true;
		((Class473) this).anInt5658 = 1150372224;
		((Class473) this).anInt5659 = 208658560;
		((Class473) this).anInt5660 = -191423872;
		((Class473) this).anInt5686 = 0;
		((Class473) this).anInt5619 = 0;
		((Class473) this).anInt5663 = 0;
		((Class473) this).anInt5664 = 0;
		((Class473) this).anInt5665 = 0;
		((Class473) this).anInt5666 = 0;
		aBoolean5667 = false;
		aBoolean5668 = false;
		anInt5640 = 1888786619;
		anInt5670 = 0;
		((Class473) this).anInt5672 = -1182334513;
		((Class473) this).anInt5673 = -528051037;
		anInt5650 = -1435181289;
		anInt5675 = 0;
		anInt5676 = 0;
		anInt5677 = 395357333;
		aBoolean5615 = false;
		anInt5679 = 0;
		anInt5628 = 0;
		aBoolean5616 = false;
		aBoolean5648 = true;
		aBoolean5690 = false;
		aBoolean5685 = true;
		aBoolean5621 = false;
		aBoolean5688 = false;
		anInt5689 = -1792099584;
		anInt5662 = 1905387776;
		aBoolean5692 = false;
		aBoolean5683 = false;
	}

	public int[] method5905(int i) {
		try {
			return ((Class473) this).anIntArray5644;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.x(").append(')').toString());
		}
	}

	public boolean method5906(int i, int i_85_) {
		try {
			if (null != ((Class473) this).anIntArray5644 && -1 != i) {
				for (int i_86_ = 0; i_86_ < ((Class473) this).anIntArray5644.length; i_86_++) {
					if (i == ((Class473) this).anIntArray5644[i_86_])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.g(").append(')').toString());
		}
	}

	public boolean method5907(int i) {
		try {
			if (null == anIntArray5678)
				return -1 != -194791591 * anInt5650 || anIntArray5681 != null;
			for (int i_87_ = 0; i_87_ < anIntArray5678.length; i_87_++) {
				if (anIntArray5678[i_87_] != -1) {
					Class473 class473_88_ = ((Class473) this).aClass463_5671.method5705(anIntArray5678[i_87_], (byte) -96);
					if (-1 != -194791591 * class473_88_.anInt5650 || null != class473_88_.anIntArray5681)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.b(").append(')').toString());
		}
	}

	public int method5908(int i, int i_89_) {
		try {
			if (((Class473) this).anIntArray5617 == null)
				return -1;
			return ((Class473) this).anIntArray5617[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.d(").append(')').toString());
		}
	}

	public boolean method5909(byte i) {
		try {
			return (((Class473) this).anIntArray5644 != null && ((Class473) this).anIntArray5644.length > 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.q(").append(')').toString());
		}
	}

	void method5910(int i) {
		try {
			if (-1012368965 * anInt5637 == -1) {
				anInt5637 = 0;
				if (null != aByteArray5633 && aByteArray5633.length == 1 && (-344921723 * Class476.aClass476_6898.anInt6882 == aByteArray5633[0]))
					anInt5637 = -1311087757;
				for (int i_90_ = 0; i_90_ < 5; i_90_++) {
					if (aStringArray5649[i_90_] != null) {
						anInt5637 = -1311087757;
						break;
					}
				}
			}
			if (2018907021 * anInt5640 == -1)
				anInt5640 = -1888786619 * (0 != anInt5635 * -146884317 ? 1 : 0);
			if (method5904((byte) -29) || aBoolean5688 || null != anIntArray5678)
				aBoolean5692 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.i(").append(')').toString());
		}
	}

	static String method5911(IComponentDefinitions iComponentDefinitions, int i) {
		try {
			if (client.method3924(iComponentDefinitions).method3265((byte) 1) == 0)
				return null;
			if (iComponentDefinitions.aString1194 == null || iComponentDefinitions.aString1194.trim().length() == 0) {
				if (client.aBoolean9161)
					return "Hidden-use";
				return null;
			}
			return iComponentDefinitions.aString1194;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.mh(").append(')').toString());
		}
	}

	static void method5912(int i, boolean bool, int i_91_) {
		try {
			Class330_Sub1 class330_sub1 = Class321.method3178(i, bool, (short) 10814);
			if (class330_sub1 != null) {
				for (int i_92_ = 0; (i_92_ < ((Class330_Sub1) class330_sub1).anIntArray7500.length); i_92_++) {
					((Class330_Sub1) class330_sub1).anIntArray7500[i_92_] = -1;
					((Class330_Sub1) class330_sub1).anIntArray7497[i_92_] = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.z(").append(')').toString());
		}
	}

	static final void method5913(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			iComponentDefinitions.anInt1192 = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]) * 308110031;
			iComponentDefinitions.anInt1324 = (-284859029 * (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]));
			int i_93_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			if (i_93_ < 0)
				i_93_ = 0;
			else if (i_93_ > 5)
				i_93_ = 5;
			int i_94_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 3]);
			if (i_94_ < 0)
				i_94_ = 0;
			else if (i_94_ > 5)
				i_94_ = 5;
			iComponentDefinitions.aByte1200 = (byte) i_93_;
			iComponentDefinitions.aByte1201 = (byte) i_94_;
			Class404.method4738(iComponentDefinitions, 1149708019);
			Class544.method6345(class120, iComponentDefinitions, (byte) -55);
			if (iComponentDefinitions.anInt1198 * 1849136745 == 0)
				Class156.method1829(class120, iComponentDefinitions, false, -168449002);
			if (-790144721 * iComponentDefinitions.anInt1287 == -1 && !class120.aBoolean1402)
				Class119.method1438(iComponentDefinitions.anInt1196 * 751119487, -592236977);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.co(").append(')').toString());
		}
	}

	static void method5914(Class_ra class_ra, int i, int i_95_, IComponentDefinitions iComponentDefinitions, int i_96_) {
		try {
			int i_97_ = 63;
			int i_98_ = 7;
			for (int i_99_ = 63; i_99_ >= 0; i_99_--) {
				int i_100_ = (i_99_ & 0x3f) << 10 | (i_98_ & 0x7) << 7 | i_97_ & 0x7f;
				Class318.method3166(false, true, -1368286637);
				int i_101_ = Console.colorArray[i_100_];
				Class95_Sub12.method1137(false, true, 1727231043);
				class_ra.B(i, i_95_ + ((63 - i_99_) * (iComponentDefinitions.anInt1348 * 694142557) >> 6), iComponentDefinitions.anInt1210 * -681123409, (694142557 * iComponentDefinitions.anInt1348 >> 6) + 1, ~0xffffff | i_101_, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tp.r(").append(')').toString());
		}
	}
}
