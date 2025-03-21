/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Model {
	public int[] anIntArray872;
	public short[] aShortArray873;
	public int anInt874;
	public int[] anIntArray875;
	public byte[] aByteArray876;
	public int[] anIntArray877;
	public Class93[] aClass93Array878;
	public short[] aShortArray879;
	public int[] anIntArray880;
	public int anInt881 = 12;
	public int anInt882;
	public short[] aShortArray883;
	public byte[] aByteArray884;
	public byte[] aByteArray885;
	public short[] aShortArray886;
	public byte[] aByteArray887;
	public short[] aShortArray888;
	public int[] anIntArray889;
	public int[] anIntArray890;
	public byte aByte891;
	public short[] aShortArray892;
	public Class64[] aClass64Array893;
	public byte[] aByteArray894;
	public short[] aShortArray895;
	public short[] aShortArray896;
	public int anInt897 = 0;
	public int[] anIntArray898;
	public int[] anIntArray899;
	public int[] anIntArray900;
	public int[] anIntArray901;
	public int[] anIntArray902;
	public short[] aShortArray903;
	public int anInt904;
	public byte[] aByteArray905;
	public byte[] aByteArray906;
	public short[] aShortArray907;
	public Class94[] aClass94Array908;

	Model(byte[] is) {
		anInt874 = 0;
		anInt904 = 0;
		aByte891 = (byte) 0;
		anInt882 = 0;
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
			method1201(is);
		else
			method1199(is);
	}

	public void color(short i, short i_0_) {
		for (int i_1_ = 0; i_1_ < anInt904; i_1_++) {
			if (aShortArray873[i_1_] == i)
				aShortArray873[i_1_] = i_0_;
		}
	}

	public Model(Model[] class98s, int i) {
		anInt874 = 0;
		anInt904 = 0;
		aByte891 = (byte) 0;
		anInt882 = 0;
		anInt897 = 0;
		anInt904 = 0;
		anInt882 = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		boolean bool = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		aByte891 = (byte) -1;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			Model class98_11_ = class98s[i_10_];
			if (class98_11_ != null) {
				anInt897 += class98_11_.anInt897;
				anInt904 += class98_11_.anInt904;
				anInt882 += class98_11_.anInt882;
				if (class98_11_.aClass93Array878 != null)
					i_2_ += class98_11_.aClass93Array878.length;
				if (class98_11_.aClass64Array893 != null)
					i_3_ += class98_11_.aClass64Array893.length;
				if (class98_11_.aClass94Array908 != null)
					i_4_ += class98_11_.aClass94Array908.length;
				bool = bool | class98_11_.aByteArray884 != null;
				if (class98_11_.aByteArray885 != null)
					bool_5_ = true;
				else {
					if (aByte891 == -1)
						aByte891 = class98_11_.aByte891;
					if (aByte891 != class98_11_.aByte891)
						bool_5_ = true;
				}
				bool_6_ = bool_6_ | class98_11_.aByteArray876 != null;
				bool_7_ = bool_7_ | class98_11_.aByteArray887 != null;
				bool_8_ = bool_8_ | class98_11_.aShortArray896 != null;
				bool_9_ = bool_9_ | class98_11_.anIntArray890 != null;
			}
		}
		anIntArray875 = new int[anInt897];
		anIntArray889 = new int[anInt897];
		anIntArray877 = new int[anInt897];
		anIntArray880 = new int[anInt897];
		aShortArray879 = new short[anInt897];
		aShortArray888 = new short[anInt904];
		aShortArray907 = new short[anInt904];
		aShortArray883 = new short[anInt904];
		if (bool)
			aByteArray884 = new byte[anInt904];
		if (bool_5_)
			aByteArray885 = new byte[anInt904];
		if (bool_6_)
			aByteArray876 = new byte[anInt904];
		if (bool_7_)
			aByteArray887 = new byte[anInt904];
		aShortArray873 = new short[anInt904];
		if (bool_8_)
			aShortArray896 = new short[anInt904];
		if (bool_9_)
			anIntArray890 = new int[anInt904];
		aShortArray892 = new short[anInt904];
		if (anInt882 > 0) {
			aByteArray894 = new byte[anInt882];
			aShortArray895 = new short[anInt882];
			aShortArray903 = new short[anInt882];
			aShortArray886 = new short[anInt882];
			anIntArray898 = new int[anInt882];
			anIntArray899 = new int[anInt882];
			anIntArray900 = new int[anInt882];
			aByteArray906 = new byte[anInt882];
			aByteArray905 = new byte[anInt882];
			anIntArray901 = new int[anInt882];
			anIntArray902 = new int[anInt882];
			anIntArray872 = new int[anInt882];
		}
		if (i_4_ > 0)
			aClass94Array908 = new Class94[i_4_];
		if (i_2_ > 0)
			aClass93Array878 = new Class93[i_2_];
		if (i_3_ > 0)
			aClass64Array893 = new Class64[i_3_];
		anInt897 = 0;
		anInt904 = 0;
		anInt882 = 0;
		i_2_ = 0;
		i_3_ = 0;
		i_4_ = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			short i_13_ = (short) (1 << i_12_);
			Model class98_14_ = class98s[i_12_];
			if (class98_14_ != null) {
				if (class98_14_.aClass94Array908 != null) {
					for (int i_15_ = 0; i_15_ < class98_14_.aClass94Array908.length; i_15_++) {
						Class94 class94 = class98_14_.aClass94Array908[i_15_];
						aClass94Array908[i_4_++] = class94.method1090((class94.anInt848 * -1401356047) + anInt904, (byte) 64);
					}
				}
				for (int i_16_ = 0; i_16_ < class98_14_.anInt904; i_16_++) {
					if (bool && class98_14_.aByteArray884 != null)
						aByteArray884[anInt904] = class98_14_.aByteArray884[i_16_];
					if (bool_5_) {
						if (class98_14_.aByteArray885 != null)
							aByteArray885[anInt904] = class98_14_.aByteArray885[i_16_];
						else
							aByteArray885[anInt904] = class98_14_.aByte891;
					}
					if (bool_6_ && class98_14_.aByteArray876 != null)
						aByteArray876[anInt904] = class98_14_.aByteArray876[i_16_];
					if (bool_8_) {
						if (class98_14_.aShortArray896 != null)
							aShortArray896[anInt904] = class98_14_.aShortArray896[i_16_];
						else
							aShortArray896[anInt904] = (short) -1;
					}
					if (bool_9_) {
						if (class98_14_.anIntArray890 != null)
							anIntArray890[anInt904] = class98_14_.anIntArray890[i_16_];
						else
							anIntArray890[anInt904] = -1;
					}
					aShortArray888[anInt904] = (short) method1186(class98_14_, class98_14_.aShortArray888[i_16_], i_13_);
					aShortArray907[anInt904] = (short) method1186(class98_14_, class98_14_.aShortArray907[i_16_], i_13_);
					aShortArray883[anInt904] = (short) method1186(class98_14_, class98_14_.aShortArray883[i_16_], i_13_);
					aShortArray892[anInt904] = i_13_;
					aShortArray873[anInt904] = class98_14_.aShortArray873[i_16_];
					anInt904++;
				}
				if (class98_14_.aClass93Array878 != null) {
					for (int i_17_ = 0; i_17_ < class98_14_.aClass93Array878.length; i_17_++) {
						int i_18_ = method1186(class98_14_, (class98_14_.aClass93Array878[i_17_].anInt841) * -1670679901, i_13_);
						int i_19_ = method1186(class98_14_, (class98_14_.aClass93Array878[i_17_].anInt835) * -614748507, i_13_);
						int i_20_ = method1186(class98_14_, (class98_14_.aClass93Array878[i_17_].anInt836) * -878748965, i_13_);
						aClass93Array878[i_2_] = class98_14_.aClass93Array878[i_17_].method1086(i_18_, i_19_, i_20_, -684124160);
						i_2_++;
					}
				}
				if (class98_14_.aClass64Array893 != null) {
					for (int i_21_ = 0; i_21_ < class98_14_.aClass64Array893.length; i_21_++) {
						int i_22_ = method1186(class98_14_, (class98_14_.aClass64Array893[i_21_].anInt566) * 1669844747, i_13_);
						aClass64Array893[i_3_] = class98_14_.aClass64Array893[i_21_].method772(i_22_, 2139208707);
						i_3_++;
					}
				}
			}
		}
		int i_23_ = 0;
		anInt874 = anInt897;
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			short i_25_ = (short) (1 << i_24_);
			Model class98_26_ = class98s[i_24_];
			if (class98_26_ != null) {
				for (int i_27_ = 0; i_27_ < class98_26_.anInt904; i_27_++) {
					if (bool_7_)
						aByteArray887[i_23_++] = (byte) ((class98_26_.aByteArray887 != null && (class98_26_.aByteArray887[i_27_] != -1)) ? (class98_26_.aByteArray887[i_27_] + anInt882) : -1);
				}
				for (int i_28_ = 0; i_28_ < class98_26_.anInt882; i_28_++) {
					byte i_29_ = (aByteArray894[anInt882] = class98_26_.aByteArray894[i_28_]);
					if (i_29_ == 0) {
						aShortArray895[anInt882] = (short) method1186(class98_26_, (class98_26_.aShortArray895[i_28_]), i_25_);
						aShortArray903[anInt882] = (short) method1186(class98_26_, (class98_26_.aShortArray903[i_28_]), i_25_);
						aShortArray886[anInt882] = (short) method1186(class98_26_, (class98_26_.aShortArray886[i_28_]), i_25_);
					}
					if (i_29_ >= 1 && i_29_ <= 3) {
						aShortArray895[anInt882] = class98_26_.aShortArray895[i_28_];
						aShortArray903[anInt882] = class98_26_.aShortArray903[i_28_];
						aShortArray886[anInt882] = class98_26_.aShortArray886[i_28_];
						anIntArray898[anInt882] = class98_26_.anIntArray898[i_28_];
						anIntArray899[anInt882] = class98_26_.anIntArray899[i_28_];
						anIntArray900[anInt882] = class98_26_.anIntArray900[i_28_];
						aByteArray906[anInt882] = class98_26_.aByteArray906[i_28_];
						aByteArray905[anInt882] = class98_26_.aByteArray905[i_28_];
						anIntArray901[anInt882] = class98_26_.anIntArray901[i_28_];
					}
					if (i_29_ == 2) {
						anIntArray902[anInt882] = class98_26_.anIntArray902[i_28_];
						anIntArray872[anInt882] = class98_26_.anIntArray872[i_28_];
					}
					anInt882++;
				}
			}
		}
	}

	final int method1186(Model class98_30_, int i, short i_31_) {
		int i_32_ = class98_30_.anIntArray875[i];
		int i_33_ = class98_30_.anIntArray889[i];
		int i_34_ = class98_30_.anIntArray877[i];
		for (int i_35_ = 0; i_35_ < anInt897; i_35_++) {
			if (i_32_ == anIntArray875[i_35_] && i_33_ == anIntArray889[i_35_] && i_34_ == anIntArray877[i_35_]) {
				aShortArray879[i_35_] |= i_31_;
				return i_35_;
			}
		}
		anIntArray875[anInt897] = i_32_;
		anIntArray889[anInt897] = i_33_;
		anIntArray877[anInt897] = i_34_;
		aShortArray879[anInt897] = i_31_;
		anIntArray880[anInt897] = (class98_30_.anIntArray880 != null ? class98_30_.anIntArray880[i] : -1);
		return anInt897++;
	}

	void method1187(Buffer class330_sub46, Buffer class330_sub46_36_) {
		short i = 0;
		short i_37_ = 0;
		short i_38_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < anInt904; i_40_++) {
			int i_41_ = class330_sub46_36_.readUnsignedByte(2142376075);
			if (i_41_ == 1) {
				i = (short) (class330_sub46.method3764((byte) -115) + i_39_);
				i_39_ = i;
				i_37_ = (short) (class330_sub46.method3764((byte) -76) + i_39_);
				i_39_ = i_37_;
				i_38_ = (short) (class330_sub46.method3764((byte) -73) + i_39_);
				i_39_ = i_38_;
				aShortArray888[i_40_] = i;
				aShortArray907[i_40_] = i_37_;
				aShortArray883[i_40_] = i_38_;
				if (i > anInt874)
					anInt874 = i;
				if (i_37_ > anInt874)
					anInt874 = i_37_;
				if (i_38_ > anInt874)
					anInt874 = i_38_;
			}
			if (i_41_ == 2) {
				i_37_ = i_38_;
				i_38_ = (short) (class330_sub46.method3764((byte) -83) + i_39_);
				i_39_ = i_38_;
				aShortArray888[i_40_] = i;
				aShortArray907[i_40_] = i_37_;
				aShortArray883[i_40_] = i_38_;
				if (i_38_ > anInt874)
					anInt874 = i_38_;
			}
			if (i_41_ == 3) {
				i = i_38_;
				i_38_ = (short) (class330_sub46.method3764((byte) -16) + i_39_);
				i_39_ = i_38_;
				aShortArray888[i_40_] = i;
				aShortArray907[i_40_] = i_37_;
				aShortArray883[i_40_] = i_38_;
				if (i_38_ > anInt874)
					anInt874 = i_38_;
			}
			if (i_41_ == 4) {
				short i_42_ = i;
				i = i_37_;
				i_37_ = i_42_;
				i_38_ = (short) (class330_sub46.method3764((byte) -48) + i_39_);
				i_39_ = i_38_;
				aShortArray888[i_40_] = i;
				aShortArray907[i_40_] = i_37_;
				aShortArray883[i_40_] = i_38_;
				if (i_38_ > anInt874)
					anInt874 = i_38_;
			}
		}
		anInt874++;
	}

	void method1188(Buffer class330_sub46, Buffer class330_sub46_43_, Buffer class330_sub46_44_, Buffer class330_sub46_45_, Buffer class330_sub46_46_, Buffer class330_sub46_47_) {
		for (int i = 0; i < anInt882; i++) {
			int i_48_ = aByteArray894[i] & 0xff;
			if (i_48_ == 0) {
				aShortArray895[i] = (short) class330_sub46.readUnsignedShort(2106544161);
				aShortArray903[i] = (short) class330_sub46.readUnsignedShort(-98434463);
				aShortArray886[i] = (short) class330_sub46.readUnsignedShort(429046454);
			}
			if (i_48_ == 1) {
				aShortArray895[i] = (short) class330_sub46_43_.readUnsignedShort(-330637354);
				aShortArray903[i] = (short) class330_sub46_43_.readUnsignedShort(295679632);
				aShortArray886[i] = (short) class330_sub46_43_.readUnsignedShort(-14545206);
				if (anInt881 < 15) {
					anIntArray898[i] = class330_sub46_44_.readUnsignedShort(1084220173);
					if (anInt881 < 14)
						anIntArray899[i] = class330_sub46_44_.readUnsignedShort(776846546);
					else
						anIntArray899[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray900[i] = class330_sub46_44_.readUnsignedShort(971335567);
				} else {
					anIntArray898[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray899[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray900[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
				}
				aByteArray906[i] = class330_sub46_45_.readByte((byte) 46);
				aByteArray905[i] = class330_sub46_46_.readByte((byte) -24);
				anIntArray901[i] = class330_sub46_47_.readByte((byte) -17);
			}
			if (i_48_ == 2) {
				aShortArray895[i] = (short) class330_sub46_43_.readUnsignedShort(428050357);
				aShortArray903[i] = (short) class330_sub46_43_.readUnsignedShort(1687213687);
				aShortArray886[i] = (short) class330_sub46_43_.readUnsignedShort(1276651407);
				if (anInt881 < 15) {
					anIntArray898[i] = class330_sub46_44_.readUnsignedShort(1389677726);
					if (anInt881 < 14)
						anIntArray899[i] = class330_sub46_44_.readUnsignedShort(499537125);
					else
						anIntArray899[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray900[i] = class330_sub46_44_.readUnsignedShort(1190376554);
				} else {
					anIntArray898[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray899[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray900[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
				}
				aByteArray906[i] = class330_sub46_45_.readByte((byte) 44);
				aByteArray905[i] = class330_sub46_46_.readByte((byte) -23);
				anIntArray901[i] = class330_sub46_47_.readByte((byte) -33);
				anIntArray902[i] = class330_sub46_47_.readByte((byte) -36);
				anIntArray872[i] = class330_sub46_47_.readByte((byte) 1);
			}
			if (i_48_ == 3) {
				aShortArray895[i] = (short) class330_sub46_43_.readUnsignedShort(-422482628);
				aShortArray903[i] = (short) class330_sub46_43_.readUnsignedShort(104799886);
				aShortArray886[i] = (short) class330_sub46_43_.readUnsignedShort(1829755323);
				if (anInt881 < 15) {
					anIntArray898[i] = class330_sub46_44_.readUnsignedShort(1986860333);
					if (anInt881 < 14)
						anIntArray899[i] = class330_sub46_44_.readUnsignedShort(-160592019);
					else
						anIntArray899[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray900[i] = class330_sub46_44_.readUnsignedShort(834700309);
				} else {
					anIntArray898[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray899[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
					anIntArray900[i] = class330_sub46_44_.readUnsignedTriByte(-1401356047);
				}
				aByteArray906[i] = class330_sub46_45_.readByte((byte) -47);
				aByteArray905[i] = class330_sub46_46_.readByte((byte) 90);
				anIntArray901[i] = class330_sub46_47_.readByte((byte) 59);
			}
		}
	}

	public int method1189(int i, int i_49_, int i_50_) {
		for (int i_51_ = 0; i_51_ < anInt897; i_51_++) {
			if (anIntArray875[i_51_] == i && anIntArray889[i_51_] == i_49_ && anIntArray877[i_51_] == i_50_)
				return i_51_;
		}
		anIntArray875[anInt897] = i;
		anIntArray889[anInt897] = i_49_;
		anIntArray877[anInt897] = i_50_;
		anInt874 = anInt897 + 1;
		return anInt897++;
	}

	public int method1190(int i, int i_52_, int i_53_, byte i_54_, byte i_55_, short i_56_, byte i_57_, short i_58_) {
		aShortArray888[anInt904] = (short) i;
		aShortArray907[anInt904] = (short) i_52_;
		aShortArray883[anInt904] = (short) i_53_;
		aByteArray884[anInt904] = i_54_;
		aByteArray887[anInt904] = i_55_;
		aShortArray873[anInt904] = i_56_;
		aByteArray876[anInt904] = i_57_;
		aShortArray896[anInt904] = i_58_;
		return anInt904++;
	}

	public byte method1191(short i, short i_59_, short i_60_, short i_61_, short i_62_, short i_63_, byte i_64_, byte i_65_, byte i_66_) {
		if (anInt882 >= 255)
			throw new IllegalStateException();
		aByteArray894[anInt882] = (byte) 3;
		aShortArray895[anInt882] = i;
		aShortArray903[anInt882] = i_59_;
		aShortArray886[anInt882] = i_60_;
		anIntArray898[anInt882] = i_61_;
		anIntArray899[anInt882] = i_62_;
		anIntArray900[anInt882] = i_63_;
		aByteArray906[anInt882] = i_64_;
		aByteArray905[anInt882] = i_65_;
		anIntArray901[anInt882] = i_66_;
		return (byte) anInt882++;
	}

	public int[][] method1192() {
		int[] is = new int[256];
		int i = 0;
		for (int i_67_ = 0; i_67_ < anInt904; i_67_++) {
			int i_68_ = anIntArray890[i_67_];
			if (i_68_ >= 0) {
				is[i_68_]++;
				if (i_68_ > i)
					i = i_68_;
			}
		}
		int[][] is_69_ = new int[i + 1][];
		for (int i_70_ = 0; i_70_ <= i; i_70_++) {
			is_69_[i_70_] = new int[is[i_70_]];
			is[i_70_] = 0;
		}
		for (int i_71_ = 0; i_71_ < anInt904; i_71_++) {
			int i_72_ = anIntArray890[i_71_];
			if (i_72_ >= 0)
				is_69_[i_72_][is[i_72_]++] = i_71_;
		}
		return is_69_;
	}

	public int[][] method1193() {
		int[] is = new int[256];
		int i = 0;
		for (int i_73_ = 0; i_73_ < aClass94Array908.length; i_73_++) {
			int i_74_ = aClass94Array908[i_73_].anInt847 * 165131415;
			if (i_74_ >= 0) {
				is[i_74_]++;
				if (i_74_ > i)
					i = i_74_;
			}
		}
		int[][] is_75_ = new int[i + 1][];
		for (int i_76_ = 0; i_76_ <= i; i_76_++) {
			is_75_[i_76_] = new int[is[i_76_]];
			is[i_76_] = 0;
		}
		for (int i_77_ = 0; i_77_ < aClass94Array908.length; i_77_++) {
			int i_78_ = aClass94Array908[i_77_].anInt847 * 165131415;
			if (i_78_ >= 0)
				is_75_[i_78_][is[i_78_]++] = i_77_;
		}
		return is_75_;
	}

	public void method1194(int i, int i_79_, int i_80_) {
		for (int i_81_ = 0; i_81_ < anInt897; i_81_++) {
			anIntArray875[i_81_] += i;
			anIntArray889[i_81_] += i_79_;
			anIntArray877[i_81_] += i_80_;
		}
	}

	public void method1195(int i, int i_82_, int i_83_) {
		if (i_83_ != 0) {
			int i_84_ = Class257.anIntArray2683[i_83_];
			int i_85_ = Class257.anIntArray2684[i_83_];
			for (int i_86_ = 0; i_86_ < anInt897; i_86_++) {
				int i_87_ = ((anIntArray889[i_86_] * i_84_ + anIntArray875[i_86_] * i_85_) >> 14);
				anIntArray889[i_86_] = (anIntArray889[i_86_] * i_85_ - anIntArray875[i_86_] * i_84_) >> 14;
				anIntArray875[i_86_] = i_87_;
			}
		}
		if (i != 0) {
			int i_88_ = Class257.anIntArray2683[i];
			int i_89_ = Class257.anIntArray2684[i];
			for (int i_90_ = 0; i_90_ < anInt897; i_90_++) {
				int i_91_ = ((anIntArray889[i_90_] * i_89_ - anIntArray877[i_90_] * i_88_) >> 14);
				anIntArray877[i_90_] = (anIntArray889[i_90_] * i_88_ + anIntArray877[i_90_] * i_89_) >> 14;
				anIntArray889[i_90_] = i_91_;
			}
		}
		if (i_82_ != 0) {
			int i_92_ = Class257.anIntArray2683[i_82_];
			int i_93_ = Class257.anIntArray2684[i_82_];
			for (int i_94_ = 0; i_94_ < anInt897; i_94_++) {
				int i_95_ = ((anIntArray877[i_94_] * i_92_ + anIntArray875[i_94_] * i_93_) >> 14);
				anIntArray877[i_94_] = (anIntArray877[i_94_] * i_93_ - anIntArray875[i_94_] * i_92_) >> 14;
				anIntArray875[i_94_] = i_95_;
			}
		}
	}

	public void method1196(int i) {
		for (int i_96_ = 0; i_96_ < anInt897; i_96_++) {
			anIntArray875[i_96_] <<= i;
			anIntArray889[i_96_] <<= i;
			anIntArray877[i_96_] <<= i;
		}
		if (anInt882 > 0 && anIntArray898 != null) {
			for (int i_97_ = 0; i_97_ < anIntArray898.length; i_97_++) {
				anIntArray898[i_97_] <<= i;
				anIntArray899[i_97_] <<= i;
				if (aByteArray894[i_97_] != 1)
					anIntArray900[i_97_] <<= i;
			}
		}
	}

	public int[][] method1197(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_98_ = bool ? anInt897 : anInt874;
		for (int i_99_ = 0; i_99_ < i_98_; i_99_++) {
			int i_100_ = anIntArray880[i_99_];
			if (i_100_ >= 0) {
				is[i_100_]++;
				if (i_100_ > i)
					i = i_100_;
			}
		}
		int[][] is_101_ = new int[i + 1][];
		for (int i_102_ = 0; i_102_ <= i; i_102_++) {
			is_101_[i_102_] = new int[is[i_102_]];
			is[i_102_] = 0;
		}
		for (int i_103_ = 0; i_103_ < i_98_; i_103_++) {
			int i_104_ = anIntArray880[i_103_];
			if (i_104_ >= 0)
				is_101_[i_104_][is[i_104_]++] = i_103_;
		}
		return is_101_;
	}
	
	public static Model loadModel(IndexTable class280, int archiveId, int fileId) {
		byte[] is = class280.getFile(archiveId, fileId);
		if (is == null)
			return null;
		return new Model(is);
	}
	
	void method1199(byte[] is) {
		boolean bool = false;
		boolean bool_106_ = false;
		Buffer class330_sub46 = new Buffer(is);
		Buffer class330_sub46_107_ = new Buffer(is);
		Buffer class330_sub46_108_ = new Buffer(is);
		Buffer class330_sub46_109_ = new Buffer(is);
		Buffer class330_sub46_110_ = new Buffer(is);
		class330_sub46.offset = (is.length - 18) * 323600977;
		anInt897 = class330_sub46.readUnsignedShort(-337614095);
		anInt904 = class330_sub46.readUnsignedShort(1788131083);
		anInt882 = class330_sub46.readUnsignedByte(-240992681);
		int i = class330_sub46.readUnsignedByte(1659643237);
		int i_111_ = class330_sub46.readUnsignedByte(1195480174);
		int i_112_ = class330_sub46.readUnsignedByte(2143275570);
		int i_113_ = class330_sub46.readUnsignedByte(382337706);
		int i_114_ = class330_sub46.readUnsignedByte(1216838880);
		int i_115_ = class330_sub46.readUnsignedShort(619517959);
		int i_116_ = class330_sub46.readUnsignedShort(2050039188);
		int i_117_ = class330_sub46.readUnsignedShort(1791197088);
		int i_118_ = class330_sub46.readUnsignedShort(2085935111);
		int i_119_ = 0;
		int i_120_ = i_119_;
		i_119_ += anInt897;
		int i_121_ = i_119_;
		i_119_ += anInt904;
		int i_122_ = i_119_;
		if (i_111_ == 255)
			i_119_ += anInt904;
		int i_123_ = i_119_;
		if (i_113_ == 1)
			i_119_ += anInt904;
		int i_124_ = i_119_;
		if (i == 1)
			i_119_ += anInt904;
		int i_125_ = i_119_;
		if (i_114_ == 1)
			i_119_ += anInt897;
		int i_126_ = i_119_;
		if (i_112_ == 1)
			i_119_ += anInt904;
		int i_127_ = i_119_;
		i_119_ += i_118_;
		int i_128_ = i_119_;
		i_119_ += anInt904 * 2;
		int i_129_ = i_119_;
		i_119_ += anInt882 * 6;
		int i_130_ = i_119_;
		i_119_ += i_115_;
		int i_131_ = i_119_;
		i_119_ += i_116_;
		int i_132_ = i_119_;
		i_119_ += i_117_;
		anIntArray875 = new int[anInt897];
		anIntArray889 = new int[anInt897];
		anIntArray877 = new int[anInt897];
		aShortArray888 = new short[anInt904];
		aShortArray907 = new short[anInt904];
		aShortArray883 = new short[anInt904];
		if (anInt882 > 0) {
			aByteArray894 = new byte[anInt882];
			aShortArray895 = new short[anInt882];
			aShortArray903 = new short[anInt882];
			aShortArray886 = new short[anInt882];
		}
		if (i_114_ == 1)
			anIntArray880 = new int[anInt897];
		if (i == 1) {
			aByteArray884 = new byte[anInt904];
			aByteArray887 = new byte[anInt904];
			aShortArray896 = new short[anInt904];
		}
		if (i_111_ == 255)
			aByteArray885 = new byte[anInt904];
		else
			aByte891 = (byte) i_111_;
		if (i_112_ == 1)
			aByteArray876 = new byte[anInt904];
		if (i_113_ == 1)
			anIntArray890 = new int[anInt904];
		aShortArray873 = new short[anInt904];
		class330_sub46.offset = i_120_ * 323600977;
		class330_sub46_107_.offset = i_130_ * 323600977;
		class330_sub46_108_.offset = i_131_ * 323600977;
		class330_sub46_109_.offset = i_132_ * 323600977;
		class330_sub46_110_.offset = i_125_ * 323600977;
		int i_133_ = 0;
		int i_134_ = 0;
		int i_135_ = 0;
		for (int i_136_ = 0; i_136_ < anInt897; i_136_++) {
			int i_137_ = class330_sub46.readUnsignedByte(1891310221);
			int i_138_ = 0;
			if ((i_137_ & 0x1) != 0)
				i_138_ = class330_sub46_107_.method3764((byte) -97);
			int i_139_ = 0;
			if ((i_137_ & 0x2) != 0)
				i_139_ = class330_sub46_108_.method3764((byte) -44);
			int i_140_ = 0;
			if ((i_137_ & 0x4) != 0)
				i_140_ = class330_sub46_109_.method3764((byte) -39);
			anIntArray875[i_136_] = i_133_ + i_138_;
			anIntArray889[i_136_] = i_134_ + i_139_;
			anIntArray877[i_136_] = i_135_ + i_140_;
			i_133_ = anIntArray875[i_136_];
			i_134_ = anIntArray889[i_136_];
			i_135_ = anIntArray877[i_136_];
			if (i_114_ == 1)
				anIntArray880[i_136_] = class330_sub46_110_.readUnsignedByte(-62972647);
		}
		class330_sub46.offset = i_128_ * 323600977;
		class330_sub46_107_.offset = i_124_ * 323600977;
		class330_sub46_108_.offset = i_122_ * 323600977;
		class330_sub46_109_.offset = i_126_ * 323600977;
		class330_sub46_110_.offset = i_123_ * 323600977;
		for (int i_141_ = 0; i_141_ < anInt904; i_141_++) {
			aShortArray873[i_141_] = (short) class330_sub46.readUnsignedShort(537620520);
			if (i == 1) {
				int i_142_ = class330_sub46_107_.readUnsignedByte(122249945);
				if ((i_142_ & 0x1) == 1) {
					aByteArray884[i_141_] = (byte) 1;
					bool = true;
				} else
					aByteArray884[i_141_] = (byte) 0;
				if ((i_142_ & 0x2) == 2) {
					aByteArray887[i_141_] = (byte) (i_142_ >> 2);
					aShortArray896[i_141_] = aShortArray873[i_141_];
					aShortArray873[i_141_] = (short) 127;
					if (aShortArray896[i_141_] != -1)
						bool_106_ = true;
				} else {
					aByteArray887[i_141_] = (byte) -1;
					aShortArray896[i_141_] = (short) -1;
				}
			}
			if (i_111_ == 255)
				aByteArray885[i_141_] = class330_sub46_108_.readByte((byte) -30);
			if (i_112_ == 1)
				aByteArray876[i_141_] = class330_sub46_109_.readByte((byte) -18);
			if (i_113_ == 1)
				anIntArray890[i_141_] = class330_sub46_110_.readUnsignedByte(1070293671);
		}
		anInt874 = -1;
		class330_sub46.offset = i_127_ * 323600977;
		class330_sub46_107_.offset = i_121_ * 323600977;
		short i_143_ = 0;
		short i_144_ = 0;
		short i_145_ = 0;
		int i_146_ = 0;
		for (int i_147_ = 0; i_147_ < anInt904; i_147_++) {
			int i_148_ = class330_sub46_107_.readUnsignedByte(1930748222);
			if (i_148_ == 1) {
				i_143_ = (short) (class330_sub46.method3764((byte) -46) + i_146_);
				i_146_ = i_143_;
				i_144_ = (short) (class330_sub46.method3764((byte) -15) + i_146_);
				i_146_ = i_144_;
				i_145_ = (short) (class330_sub46.method3764((byte) -102) + i_146_);
				i_146_ = i_145_;
				aShortArray888[i_147_] = i_143_;
				aShortArray907[i_147_] = i_144_;
				aShortArray883[i_147_] = i_145_;
				if (i_143_ > anInt874)
					anInt874 = i_143_;
				if (i_144_ > anInt874)
					anInt874 = i_144_;
				if (i_145_ > anInt874)
					anInt874 = i_145_;
			}
			if (i_148_ == 2) {
				i_144_ = i_145_;
				i_145_ = (short) (class330_sub46.method3764((byte) -14) + i_146_);
				i_146_ = i_145_;
				aShortArray888[i_147_] = i_143_;
				aShortArray907[i_147_] = i_144_;
				aShortArray883[i_147_] = i_145_;
				if (i_145_ > anInt874)
					anInt874 = i_145_;
			}
			if (i_148_ == 3) {
				i_143_ = i_145_;
				i_145_ = (short) (class330_sub46.method3764((byte) -38) + i_146_);
				i_146_ = i_145_;
				aShortArray888[i_147_] = i_143_;
				aShortArray907[i_147_] = i_144_;
				aShortArray883[i_147_] = i_145_;
				if (i_145_ > anInt874)
					anInt874 = i_145_;
			}
			if (i_148_ == 4) {
				short i_149_ = i_143_;
				i_143_ = i_144_;
				i_144_ = i_149_;
				i_145_ = (short) (class330_sub46.method3764((byte) -94) + i_146_);
				i_146_ = i_145_;
				aShortArray888[i_147_] = i_143_;
				aShortArray907[i_147_] = i_144_;
				aShortArray883[i_147_] = i_145_;
				if (i_145_ > anInt874)
					anInt874 = i_145_;
			}
		}
		anInt874++;
		class330_sub46.offset = i_129_ * 323600977;
		for (int i_150_ = 0; i_150_ < anInt882; i_150_++) {
			aByteArray894[i_150_] = (byte) 0;
			aShortArray895[i_150_] = (short) class330_sub46.readUnsignedShort(1466689221);
			aShortArray903[i_150_] = (short) class330_sub46.readUnsignedShort(780151818);
			aShortArray886[i_150_] = (short) class330_sub46.readUnsignedShort(1649548031);
		}
		if (aByteArray887 != null) {
			boolean bool_151_ = false;
			for (int i_152_ = 0; i_152_ < anInt904; i_152_++) {
				int i_153_ = aByteArray887[i_152_] & 0xff;
				if (i_153_ != 255) {
					if (((aShortArray895[i_153_] & 0xffff) == aShortArray888[i_152_]) && ((aShortArray903[i_153_] & 0xffff) == aShortArray907[i_152_]) && ((aShortArray886[i_153_] & 0xffff) == aShortArray883[i_152_]))
						aByteArray887[i_152_] = (byte) -1;
					else
						bool_151_ = true;
				}
			}
			if (!bool_151_)
				aByteArray887 = null;
		}
		if (!bool_106_)
			aShortArray896 = null;
		if (!bool)
			aByteArray884 = null;
	}

	public void method1200(short i, short i_154_) {
		if (aShortArray896 != null) {
			for (int i_155_ = 0; i_155_ < anInt904; i_155_++) {
				if (aShortArray896[i_155_] == i)
					aShortArray896[i_155_] = i_154_;
			}
		}
	}

	// model header
	void method1201(byte[] is) {
		Buffer class330_sub46 = new Buffer(is);
		Buffer class330_sub46_156_ = new Buffer(is);
		Buffer class330_sub46_157_ = new Buffer(is);
		Buffer class330_sub46_158_ = new Buffer(is);
		Buffer class330_sub46_159_ = new Buffer(is);
		Buffer class330_sub46_160_ = new Buffer(is);
		Buffer class330_sub46_161_ = new Buffer(is);
		class330_sub46.offset = (is.length - 23) * 323600977;
		anInt897 = class330_sub46.readUnsignedShort(433365965);
		anInt904 = class330_sub46.readUnsignedShort(683679571);
		anInt882 = class330_sub46.readUnsignedByte(1518668569);
		int i = class330_sub46.readUnsignedByte(-58139969);
		boolean bool = (i & 0x1) == 1;
		boolean bool_162_ = (i & 0x2) == 2;
		boolean bool_163_ = (i & 0x4) == 4;
		boolean bool_164_ = (i & 0x8) == 8;
		boolean bool_165_ = (i & 0x10) == 16;
		boolean bool_166_ = (i & 0x20) == 32;
		boolean bool_167_ = (i & 0x40) == 64;
		if (bool_164_) {
			class330_sub46.offset -= -2029760457;
			anInt881 = class330_sub46.readUnsignedByte(1701980003);
			class330_sub46.offset += 1941605862;
		}
		int i_168_ = class330_sub46.readUnsignedByte(-218576769);
		int i_169_ = class330_sub46.readUnsignedByte(528636776);
		int i_170_ = class330_sub46.readUnsignedByte(1774304611);
		int i_171_ = class330_sub46.readUnsignedByte(656147885);
		int i_172_ = class330_sub46.readUnsignedByte(2045781703);
		int i_173_ = class330_sub46.readUnsignedShort(1878929232);
		int i_174_ = class330_sub46.readUnsignedShort(-241264153);
		int i_175_ = class330_sub46.readUnsignedShort(1307321827);
		int i_176_ = class330_sub46.readUnsignedShort(1562826396);
		int i_177_ = class330_sub46.readUnsignedShort(24298905);
		int i_178_;
		if (bool_165_)
			i_178_ = class330_sub46.readUnsignedShort(-196376343);
		else if (i_172_ == 1)
			i_178_ = anInt897;
		else
			i_178_ = 0;
		int i_179_;
		if (bool_166_)
			i_179_ = class330_sub46.readUnsignedShort(-51588720);
		else if (i_170_ == 1)
			i_179_ = anInt904;
		else
			i_179_ = 0;
		int i_180_ = 0;
		int i_181_ = 0;
		int i_182_ = 0;
		if (anInt882 > 0) {
			aByteArray894 = new byte[anInt882];
			class330_sub46.offset = 0;
			for (int i_183_ = 0; i_183_ < anInt882; i_183_++) {
				byte i_184_ = (aByteArray894[i_183_] = class330_sub46.readByte((byte) -8));
				if (i_184_ == 0)
					i_180_++;
				if (i_184_ >= 1 && i_184_ <= 3)
					i_181_++;
				if (i_184_ == 2)
					i_182_++;
			}
		}
		int i_185_ = anInt882;
		int i_186_ = i_185_;
		i_185_ += anInt897;
		int i_187_ = i_185_;
		if (bool)
			i_185_ += anInt904;
		int i_188_ = i_185_;
		i_185_ += anInt904;
		int i_189_ = i_185_;
		if (i_168_ == 255)
			i_185_ += anInt904;
		int i_190_ = i_185_;
		i_185_ += i_179_;
		int i_191_ = i_185_;
		i_185_ += i_178_;
		int i_192_ = i_185_;
		if (i_169_ == 1)
			i_185_ += anInt904;
		int i_193_ = i_185_;
		i_185_ += i_176_;
		int i_194_ = i_185_;
		if (i_171_ == 1)
			i_185_ += anInt904 * 2;
		int i_195_ = i_185_;
		i_185_ += i_177_;
		int i_196_ = i_185_;
		i_185_ += anInt904 * 2;
		int i_197_ = i_185_;
		i_185_ += i_173_;
		int i_198_ = i_185_;
		i_185_ += i_174_;
		int i_199_ = i_185_;
		i_185_ += i_175_;
		int i_200_ = i_185_;
		i_185_ += i_180_ * 6;
		int i_201_ = i_185_;
		i_185_ += i_181_ * 6;
		int i_202_ = 6;
		if (anInt881 == 14)
			i_202_ = 7;
		else if (anInt881 >= 15)
			i_202_ = 9;
		int i_203_ = i_185_;
		i_185_ += i_181_ * i_202_;
		int i_204_ = i_185_;
		i_185_ += i_181_;
		int i_205_ = i_185_;
		i_185_ += i_181_;
		int i_206_ = i_185_;
		i_185_ += i_181_ + i_182_ * 2;
		int i_207_ = i_185_;
		anIntArray875 = new int[anInt897];
		anIntArray889 = new int[anInt897];
		anIntArray877 = new int[anInt897];
		aShortArray888 = new short[anInt904];
		aShortArray907 = new short[anInt904];
		aShortArray883 = new short[anInt904];
		if (i_172_ == 1)
			anIntArray880 = new int[anInt897];
		if (bool)
			aByteArray884 = new byte[anInt904];
		if (i_168_ == 255)
			aByteArray885 = new byte[anInt904];
		else
			aByte891 = (byte) i_168_;
		if (i_169_ == 1)
			aByteArray876 = new byte[anInt904];
		if (i_170_ == 1)
			anIntArray890 = new int[anInt904];
		if (i_171_ == 1)
			aShortArray896 = new short[anInt904];
		if (i_171_ == 1 && anInt882 > 0)
			aByteArray887 = new byte[anInt904];
		aShortArray873 = new short[anInt904];
		if (anInt882 > 0) {
			aShortArray895 = new short[anInt882];
			aShortArray903 = new short[anInt882];
			aShortArray886 = new short[anInt882];
			if (i_181_ > 0) {
				anIntArray898 = new int[i_181_];
				anIntArray899 = new int[i_181_];
				anIntArray900 = new int[i_181_];
				aByteArray906 = new byte[i_181_];
				aByteArray905 = new byte[i_181_];
				anIntArray901 = new int[i_181_];
			}
			if (i_182_ > 0) {
				anIntArray902 = new int[i_182_];
				anIntArray872 = new int[i_182_];
			}
		}
		class330_sub46.offset = i_186_ * 323600977;
		class330_sub46_156_.offset = i_197_ * 323600977;
		class330_sub46_157_.offset = i_198_ * 323600977;
		class330_sub46_158_.offset = i_199_ * 323600977;
		class330_sub46_159_.offset = i_191_ * 323600977;
		int i_208_ = 0;
		int i_209_ = 0;
		int i_210_ = 0;
		for (int i_211_ = 0; i_211_ < anInt897; i_211_++) {
			int i_212_ = class330_sub46.readUnsignedByte(1734337503);
			int i_213_ = 0;
			if ((i_212_ & 0x1) != 0)
				i_213_ = class330_sub46_156_.method3764((byte) -66);
			int i_214_ = 0;
			if ((i_212_ & 0x2) != 0)
				i_214_ = class330_sub46_157_.method3764((byte) -52);
			int i_215_ = 0;
			if ((i_212_ & 0x4) != 0)
				i_215_ = class330_sub46_158_.method3764((byte) -8);
			anIntArray875[i_211_] = i_208_ + i_213_;
			anIntArray889[i_211_] = i_209_ + i_214_;
			anIntArray877[i_211_] = i_210_ + i_215_;
			i_208_ = anIntArray875[i_211_];
			i_209_ = anIntArray889[i_211_];
			i_210_ = anIntArray877[i_211_];
			if (i_172_ == 1) {
				if (bool_165_)
					anIntArray880[i_211_] = class330_sub46_159_.method3766(576644875);
				else {
					anIntArray880[i_211_] = class330_sub46_159_.readUnsignedByte(1320610501);
					if (anIntArray880[i_211_] == 255)
						anIntArray880[i_211_] = -1;
				}
			}
		}
		class330_sub46.offset = i_196_ * 323600977;
		class330_sub46_156_.offset = i_187_ * 323600977;
		class330_sub46_157_.offset = i_189_ * 323600977;
		class330_sub46_158_.offset = i_192_ * 323600977;
		class330_sub46_159_.offset = i_190_ * 323600977;
		class330_sub46_160_.offset = i_194_ * 323600977;
		class330_sub46_161_.offset = i_195_ * 323600977;
		for (int i_216_ = 0; i_216_ < anInt904; i_216_++) {
			aShortArray873[i_216_] = (short) class330_sub46.readUnsignedShort(-36958518);
			if (bool)
				aByteArray884[i_216_] = class330_sub46_156_.readByte((byte) 123);
			if (i_168_ == 255)
				aByteArray885[i_216_] = class330_sub46_157_.readByte((byte) 8);
			if (i_169_ == 1)
				aByteArray876[i_216_] = class330_sub46_158_.readByte((byte) 52);
			if (i_170_ == 1) {
				if (bool_166_)
					anIntArray890[i_216_] = class330_sub46_159_.method3766(758954019);
				else {
					anIntArray890[i_216_] = class330_sub46_159_.readUnsignedByte(-195197649);
					if (anIntArray890[i_216_] == 255)
						anIntArray890[i_216_] = -1;
				}
			}
			if (i_171_ == 1)
				aShortArray896[i_216_] = (short) (class330_sub46_160_.readUnsignedShort(-13191811) - 1);
			if (aByteArray887 != null) {
				if (aShortArray896[i_216_] != -1)
					aByteArray887[i_216_] = (byte) (class330_sub46_161_.readUnsignedByte(552329779) - 1);
				else
					aByteArray887[i_216_] = (byte) -1;
			}
		}
		anInt874 = -1;
		class330_sub46.offset = i_193_ * 323600977;
		class330_sub46_156_.offset = i_188_ * 323600977;
		method1187(class330_sub46, class330_sub46_156_);
		class330_sub46.offset = i_200_ * 323600977;
		class330_sub46_156_.offset = i_201_ * 323600977;
		class330_sub46_157_.offset = i_203_ * 323600977;
		class330_sub46_158_.offset = i_204_ * 323600977;
		class330_sub46_159_.offset = i_205_ * 323600977;
		class330_sub46_160_.offset = i_206_ * 323600977;
		method1188(class330_sub46, class330_sub46_156_, class330_sub46_157_, class330_sub46_158_, class330_sub46_159_, class330_sub46_160_);
		class330_sub46.offset = i_207_ * 323600977;
		if (bool_162_) {
			int i_217_ = class330_sub46.readUnsignedByte(-68733198);
			if (i_217_ > 0) {
				aClass93Array878 = new Class93[i_217_];
				for (int i_218_ = 0; i_218_ < i_217_; i_218_++) {
					int i_219_ = class330_sub46.readUnsignedShort(1788677630);
					int i_220_ = class330_sub46.readUnsignedShort(2109892113);
					byte i_221_;
					if (i_168_ == 255)
						i_221_ = aByteArray885[i_220_];
					else
						i_221_ = (byte) i_168_;
					aClass93Array878[i_218_] = new Class93(i_219_, aShortArray888[i_220_], aShortArray907[i_220_], aShortArray883[i_220_], i_221_);
				}
			}
			int i_222_ = class330_sub46.readUnsignedByte(76580719);
			if (i_222_ > 0) {
				aClass64Array893 = new Class64[i_222_];
				for (int i_223_ = 0; i_223_ < i_222_; i_223_++) {
					int i_224_ = class330_sub46.readUnsignedShort(1700881713);
					int i_225_ = class330_sub46.readUnsignedShort(717017163);
					aClass64Array893[i_223_] = new Class64(i_224_, i_225_);
				}
			}
		}
		if (bool_163_) {
			int i_226_ = class330_sub46.readUnsignedByte(1064194340);
			if (i_226_ > 0) {
				aClass94Array908 = new Class94[i_226_];
				for (int i_227_ = 0; i_227_ < i_226_; i_227_++) {
					int i_228_ = class330_sub46.readUnsignedShort(-31369305);
					int i_229_ = class330_sub46.readUnsignedShort(1832190582);
					int i_230_;
					if (bool_167_)
						i_230_ = class330_sub46.method3766(-73764939);
					else {
						i_230_ = class330_sub46.readUnsignedByte(-258315802);
						if (i_230_ == 255)
							i_230_ = -1;
					}
					byte i_231_ = class330_sub46.readByte((byte) -18);
					aClass94Array908[i_227_] = new Class94(i_228_, i_229_, i_230_, i_231_);
				}
			}
		}
	}

	public Model(int i, int i_232_, int i_233_) {
		anInt874 = 0;
		anInt904 = 0;
		aByte891 = (byte) 0;
		anInt882 = 0;
		anIntArray875 = new int[i];
		anIntArray889 = new int[i];
		anIntArray877 = new int[i];
		anIntArray880 = new int[i];
		aShortArray888 = new short[i_232_];
		aShortArray907 = new short[i_232_];
		aShortArray883 = new short[i_232_];
		aByteArray884 = new byte[i_232_];
		aByteArray885 = new byte[i_232_];
		aByteArray876 = new byte[i_232_];
		aByteArray887 = new byte[i_232_];
		aShortArray873 = new short[i_232_];
		aShortArray896 = new short[i_232_];
		anIntArray890 = new int[i_232_];
		if (i_233_ > 0) {
			aByteArray894 = new byte[i_233_];
			aShortArray895 = new short[i_233_];
			aShortArray903 = new short[i_233_];
			aShortArray886 = new short[i_233_];
			anIntArray898 = new int[i_233_];
			anIntArray899 = new int[i_233_];
			anIntArray900 = new int[i_233_];
			aByteArray906 = new byte[i_233_];
			aByteArray905 = new byte[i_233_];
			anIntArray901 = new int[i_233_];
			anIntArray902 = new int[i_233_];
			anIntArray872 = new int[i_233_];
		}
	}
}
