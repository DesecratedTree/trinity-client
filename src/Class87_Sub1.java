/* Class87_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87_Sub1 extends Class87 {
	int anInt7099;
	int anInt7100;
	int anInt7101;
	int anInt7102;
	int anInt7103;
	int anInt7104;
	int[] anIntArray7105;
	boolean aBoolean7106;

	public int method990() {
		return ((Class87_Sub1) this).anInt7100;
	}

	public boolean method1044() {
		return false;
	}

	public boolean method985() {
		return ((Class87_Sub1) this).aBoolean7106;
	}

	public int method986() {
		return ((Class87_Sub1) this).anInt7099;
	}

	public int method994() {
		return ((Class87_Sub1) this).anInt7101;
	}

	public void method1029(int i) {
		int i_0_ = 0;
		int[] is = new int[(((Class87_Sub1) this).anInt7099 * ((Class87_Sub1) this).anInt7101)];
		for (int i_1_ = 0; i_1_ < ((Class87_Sub1) this).anInt7101; i_1_++) {
			for (int i_2_ = 0; i_2_ < ((Class87_Sub1) this).anInt7099; i_2_++) {
				int i_3_ = ((Class87_Sub1) this).anIntArray7105[i_0_];
				if ((i_3_ & ~0xffffff) == 0) {
					if (i_2_ > 0 && (((Class87_Sub1) this).anIntArray7105[i_0_ - 1] & ~0xffffff) != 0)
						i_3_ = i;
					else if (i_1_ > 0 && ((((Class87_Sub1) this).anIntArray7105[i_0_ - ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_3_ = i;
					else if (i_2_ < ((Class87_Sub1) this).anInt7099 - 1 && (((Class87_Sub1) this).anIntArray7105[i_0_ + 1] & ~0xffffff) != 0)
						i_3_ = i;
					else if (i_1_ < ((Class87_Sub1) this).anInt7101 - 1 && ((((Class87_Sub1) this).anIntArray7105[i_0_ + ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_3_ = i;
				}
				is[i_0_++] = i_3_;
			}
		}
		((Class87_Sub1) this).anIntArray7105 = is;
	}

	public void method999() {
		int[] is = ((Class87_Sub1) this).anIntArray7105;
		for (int i = (((Class87_Sub1) this).anInt7101 >> 1) - 1; i >= 0; i--) {
			int i_4_ = i * ((Class87_Sub1) this).anInt7099;
			int i_5_ = ((((Class87_Sub1) this).anInt7101 - i - 1) * ((Class87_Sub1) this).anInt7099);
			for (int i_6_ = -((Class87_Sub1) this).anInt7099; i_6_ < 0; i_6_++) {
				int i_7_ = is[i_4_];
				is[i_4_] = is[i_5_];
				is[i_5_] = i_7_;
				i_4_++;
				i_5_++;
			}
		}
		int i = ((Class87_Sub1) this).anInt7100;
		((Class87_Sub1) this).anInt7100 = ((Class87_Sub1) this).anInt7103;
		((Class87_Sub1) this).anInt7103 = i;
	}

	public int[] method1037(boolean bool) {
		if (bool && (method993() != ((Class87_Sub1) this).anInt7099 || method1045() != ((Class87_Sub1) this).anInt7101)) {
			int i = method993();
			int[] is = new int[i * method1045()];
			for (int i_8_ = 0; i_8_ < ((Class87_Sub1) this).anInt7101; i_8_++) {
				int i_9_ = i_8_ * ((Class87_Sub1) this).anInt7099;
				int i_10_ = (((Class87_Sub1) this).anInt7104 + (i_8_ + ((Class87_Sub1) this).anInt7100) * i);
				for (int i_11_ = 0; i_11_ < ((Class87_Sub1) this).anInt7099; i_11_++) {
					is[i_10_++] = ((Class87_Sub1) this).anIntArray7105[i_9_];
					i_9_++;
				}
			}
			return is;
		}
		return ((Class87_Sub1) this).anIntArray7105;
	}

	public int method989() {
		return ((Class87_Sub1) this).anInt7102;
	}

	public void method997(int i) {
		for (int i_12_ = ((Class87_Sub1) this).anInt7101 - 1; i_12_ > 0; i_12_--) {
			int i_13_ = i_12_ * ((Class87_Sub1) this).anInt7099;
			for (int i_14_ = ((Class87_Sub1) this).anInt7099 - 1; i_14_ > 0; i_14_--) {
				if ((((Class87_Sub1) this).anIntArray7105[i_14_ + i_13_] & ~0xffffff) == 0 && ((((Class87_Sub1) this).anIntArray7105[i_14_ + i_13_ - 1 - ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
					((Class87_Sub1) this).anIntArray7105[i_14_ + i_13_] = i;
			}
		}
	}

	public int method991() {
		return ((Class87_Sub1) this).anInt7103;
	}

	public void method992() {
		((Class87_Sub1) this).anInt7103 = 0;
		((Class87_Sub1) this).anInt7100 = 0;
		((Class87_Sub1) this).anInt7102 = 0;
		((Class87_Sub1) this).anInt7104 = 0;
	}

	public void method1000() {
		int[] is = new int[(((Class87_Sub1) this).anInt7099 * ((Class87_Sub1) this).anInt7101)];
		int i = 0;
		for (int i_15_ = 0; i_15_ < ((Class87_Sub1) this).anInt7099; i_15_++) {
			for (int i_16_ = ((Class87_Sub1) this).anInt7101 - 1; i_16_ >= 0; i_16_--)
				is[i++] = (((Class87_Sub1) this).anIntArray7105[i_15_ + i_16_ * ((Class87_Sub1) this).anInt7099]);
		}
		((Class87_Sub1) this).anIntArray7105 = is;
		int i_17_ = ((Class87_Sub1) this).anInt7100;
		((Class87_Sub1) this).anInt7100 = ((Class87_Sub1) this).anInt7104;
		((Class87_Sub1) this).anInt7104 = ((Class87_Sub1) this).anInt7103;
		((Class87_Sub1) this).anInt7103 = ((Class87_Sub1) this).anInt7102;
		((Class87_Sub1) this).anInt7102 = ((Class87_Sub1) this).anInt7100;
		i_17_ = ((Class87_Sub1) this).anInt7101;
		((Class87_Sub1) this).anInt7101 = ((Class87_Sub1) this).anInt7099;
		((Class87_Sub1) this).anInt7099 = i_17_;
	}

	public void method1034(int i) {
		int i_18_ = 0;
		int[] is = new int[(((Class87_Sub1) this).anInt7099 * ((Class87_Sub1) this).anInt7101)];
		for (int i_19_ = 0; i_19_ < ((Class87_Sub1) this).anInt7101; i_19_++) {
			for (int i_20_ = 0; i_20_ < ((Class87_Sub1) this).anInt7099; i_20_++) {
				int i_21_ = ((Class87_Sub1) this).anIntArray7105[i_18_];
				if ((i_21_ & ~0xffffff) == 0) {
					if (i_20_ > 0 && (((Class87_Sub1) this).anIntArray7105[i_18_ - 1] & ~0xffffff) != 0)
						i_21_ = i;
					else if (i_19_ > 0 && ((((Class87_Sub1) this).anIntArray7105[i_18_ - ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_21_ = i;
					else if (i_20_ < ((Class87_Sub1) this).anInt7099 - 1 && ((((Class87_Sub1) this).anIntArray7105[i_18_ + 1]) & ~0xffffff) != 0)
						i_21_ = i;
					else if (i_19_ < ((Class87_Sub1) this).anInt7101 - 1 && ((((Class87_Sub1) this).anIntArray7105[i_18_ + ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_21_ = i;
				}
				is[i_18_++] = i_21_;
			}
		}
		((Class87_Sub1) this).anIntArray7105 = is;
	}

	public boolean method1007() {
		return ((Class87_Sub1) this).aBoolean7106;
	}

	public void method998() {
		int[] is = ((Class87_Sub1) this).anIntArray7105;
		for (int i = ((Class87_Sub1) this).anInt7101 - 1; i >= 0; i--) {
			int i_22_ = i * ((Class87_Sub1) this).anInt7099;
			for (int i_23_ = (i + 1) * ((Class87_Sub1) this).anInt7099; i_22_ < i_23_; i_22_++) {
				i_23_--;
				int i_24_ = is[i_22_];
				is[i_22_] = is[i_23_];
				is[i_23_] = i_24_;
			}
		}
		int i = ((Class87_Sub1) this).anInt7104;
		((Class87_Sub1) this).anInt7104 = ((Class87_Sub1) this).anInt7102;
		((Class87_Sub1) this).anInt7102 = i;
	}

	public void method1027(int i) {
		int i_25_ = method993();
		int i_26_ = method1045();
		if (((Class87_Sub1) this).anInt7099 != i_25_ || ((Class87_Sub1) this).anInt7101 != i_26_) {
			int i_27_ = i;
			if (i_27_ > ((Class87_Sub1) this).anInt7104)
				i_27_ = ((Class87_Sub1) this).anInt7104;
			int i_28_ = i;
			if ((i_28_ + ((Class87_Sub1) this).anInt7104 + ((Class87_Sub1) this).anInt7099) > i_25_)
				i_28_ = (i_25_ - ((Class87_Sub1) this).anInt7104 - ((Class87_Sub1) this).anInt7099);
			int i_29_ = i;
			if (i_29_ > ((Class87_Sub1) this).anInt7100)
				i_29_ = ((Class87_Sub1) this).anInt7100;
			int i_30_ = i;
			if ((i_30_ + ((Class87_Sub1) this).anInt7100 + ((Class87_Sub1) this).anInt7101) > i_26_)
				i_30_ = (i_26_ - ((Class87_Sub1) this).anInt7100 - ((Class87_Sub1) this).anInt7101);
			int i_31_ = ((Class87_Sub1) this).anInt7099 + i_27_ + i_28_;
			int i_32_ = ((Class87_Sub1) this).anInt7101 + i_29_ + i_30_;
			int[] is = new int[i_31_ * i_32_];
			for (int i_33_ = 0; i_33_ < ((Class87_Sub1) this).anInt7101; i_33_++) {
				int i_34_ = i_33_ * ((Class87_Sub1) this).anInt7099;
				int i_35_ = (i_33_ + i_29_) * i_31_ + i_27_;
				for (int i_36_ = 0; i_36_ < ((Class87_Sub1) this).anInt7099; i_36_++)
					is[i_35_++] = ((Class87_Sub1) this).anIntArray7105[i_34_++];
			}
			((Class87_Sub1) this).anInt7104 -= i_27_;
			((Class87_Sub1) this).anInt7100 -= i_29_;
			((Class87_Sub1) this).anInt7102 -= i_28_;
			((Class87_Sub1) this).anInt7103 -= i_30_;
			((Class87_Sub1) this).anInt7099 = i_31_;
			((Class87_Sub1) this).anInt7101 = i_32_;
			((Class87_Sub1) this).anIntArray7105 = is;
		}
	}

	public int method1021(int i, int i_37_) {
		return (((Class87_Sub1) this).anIntArray7105[i + i_37_ * ((Class87_Sub1) this).anInt7099]);
	}

	public int method1004(int i, int i_38_) {
		return (((Class87_Sub1) this).anIntArray7105[i + i_38_ * ((Class87_Sub1) this).anInt7099]);
	}

	public void method996(int i, int i_39_, int i_40_) {
		for (int i_41_ = 1; i_41_ < ((Class87_Sub1) this).anIntArray7105.length; i_41_++) {
			int i_42_ = ((Class87_Sub1) this).anIntArray7105[i_41_] >> 16 & 0xff;
			i_42_ += i;
			if (i_42_ < 0)
				i_42_ = 0;
			else if (i_42_ > 255)
				i_42_ = 255;
			int i_43_ = ((Class87_Sub1) this).anIntArray7105[i_41_] >> 8 & 0xff;
			i_43_ += i_39_;
			if (i_43_ < 0)
				i_43_ = 0;
			else if (i_43_ > 255)
				i_43_ = 255;
			int i_44_ = ((Class87_Sub1) this).anIntArray7105[i_41_] >> 0 & 0xff;
			i_44_ += i_40_;
			if (i_44_ < 0)
				i_44_ = 0;
			else if (i_44_ > 255)
				i_44_ = 255;
			((Class87_Sub1) this).anIntArray7105[i_41_] = (((Class87_Sub1) this).anIntArray7105[i_41_] & ~0xffffff | i_42_ << 16 | i_43_ << 8 | i_44_);
		}
	}

	public int method993() {
		return (((Class87_Sub1) this).anInt7099 + ((Class87_Sub1) this).anInt7104 + ((Class87_Sub1) this).anInt7102);
	}

	public boolean method1005() {
		return false;
	}

	public boolean method1015() {
		return false;
	}

	public boolean method1006() {
		return ((Class87_Sub1) this).aBoolean7106;
	}

	public void method1024() {
		((Class87_Sub1) this).anInt7103 = 0;
		((Class87_Sub1) this).anInt7100 = 0;
		((Class87_Sub1) this).anInt7102 = 0;
		((Class87_Sub1) this).anInt7104 = 0;
	}

	public int method1028() {
		return ((Class87_Sub1) this).anInt7104;
	}

	public int method1009() {
		return ((Class87_Sub1) this).anInt7099;
	}

	public int method1010() {
		return ((Class87_Sub1) this).anInt7099;
	}

	public int method1011() {
		return ((Class87_Sub1) this).anInt7101;
	}

	public int method1012() {
		return (((Class87_Sub1) this).anInt7099 + ((Class87_Sub1) this).anInt7104 + ((Class87_Sub1) this).anInt7102);
	}

	public int method1026() {
		return (((Class87_Sub1) this).anInt7099 + ((Class87_Sub1) this).anInt7104 + ((Class87_Sub1) this).anInt7102);
	}

	public int method1014() {
		return (((Class87_Sub1) this).anInt7101 + ((Class87_Sub1) this).anInt7100 + ((Class87_Sub1) this).anInt7103);
	}

	public int method1019() {
		return (((Class87_Sub1) this).anInt7101 + ((Class87_Sub1) this).anInt7100 + ((Class87_Sub1) this).anInt7103);
	}

	public boolean method1008() {
		return ((Class87_Sub1) this).aBoolean7106;
	}

	public void method1013() {
		((Class87_Sub1) this).anInt7103 = 0;
		((Class87_Sub1) this).anInt7100 = 0;
		((Class87_Sub1) this).anInt7102 = 0;
		((Class87_Sub1) this).anInt7104 = 0;
	}

	public void method995(int i) {
		int i_45_ = method993();
		int i_46_ = method1045();
		if (((Class87_Sub1) this).anInt7099 != i_45_ || ((Class87_Sub1) this).anInt7101 != i_46_) {
			int i_47_ = i;
			if (i_47_ > ((Class87_Sub1) this).anInt7104)
				i_47_ = ((Class87_Sub1) this).anInt7104;
			int i_48_ = i;
			if ((i_48_ + ((Class87_Sub1) this).anInt7104 + ((Class87_Sub1) this).anInt7099) > i_45_)
				i_48_ = (i_45_ - ((Class87_Sub1) this).anInt7104 - ((Class87_Sub1) this).anInt7099);
			int i_49_ = i;
			if (i_49_ > ((Class87_Sub1) this).anInt7100)
				i_49_ = ((Class87_Sub1) this).anInt7100;
			int i_50_ = i;
			if ((i_50_ + ((Class87_Sub1) this).anInt7100 + ((Class87_Sub1) this).anInt7101) > i_46_)
				i_50_ = (i_46_ - ((Class87_Sub1) this).anInt7100 - ((Class87_Sub1) this).anInt7101);
			int i_51_ = ((Class87_Sub1) this).anInt7099 + i_47_ + i_48_;
			int i_52_ = ((Class87_Sub1) this).anInt7101 + i_49_ + i_50_;
			int[] is = new int[i_51_ * i_52_];
			for (int i_53_ = 0; i_53_ < ((Class87_Sub1) this).anInt7101; i_53_++) {
				int i_54_ = i_53_ * ((Class87_Sub1) this).anInt7099;
				int i_55_ = (i_53_ + i_49_) * i_51_ + i_47_;
				for (int i_56_ = 0; i_56_ < ((Class87_Sub1) this).anInt7099; i_56_++)
					is[i_55_++] = ((Class87_Sub1) this).anIntArray7105[i_54_++];
			}
			((Class87_Sub1) this).anInt7104 -= i_47_;
			((Class87_Sub1) this).anInt7100 -= i_49_;
			((Class87_Sub1) this).anInt7102 -= i_48_;
			((Class87_Sub1) this).anInt7103 -= i_50_;
			((Class87_Sub1) this).anInt7099 = i_51_;
			((Class87_Sub1) this).anInt7101 = i_52_;
			((Class87_Sub1) this).anIntArray7105 = is;
		}
	}

	public int method1018() {
		return ((Class87_Sub1) this).anInt7102;
	}

	public int method988() {
		return ((Class87_Sub1) this).anInt7102;
	}

	public int method1045() {
		return (((Class87_Sub1) this).anInt7101 + ((Class87_Sub1) this).anInt7100 + ((Class87_Sub1) this).anInt7103);
	}

	public int method984() {
		return ((Class87_Sub1) this).anInt7100;
	}

	public int method1041() {
		return ((Class87_Sub1) this).anInt7103;
	}

	public int method1023() {
		return ((Class87_Sub1) this).anInt7103;
	}

	public int method987() {
		return ((Class87_Sub1) this).anInt7100;
	}

	public void method1025() {
		((Class87_Sub1) this).anInt7103 = 0;
		((Class87_Sub1) this).anInt7100 = 0;
		((Class87_Sub1) this).anInt7102 = 0;
		((Class87_Sub1) this).anInt7104 = 0;
	}

	public int method983() {
		return ((Class87_Sub1) this).anInt7104;
	}

	public int method1047(int i, int i_57_) {
		return (((Class87_Sub1) this).anIntArray7105[i + i_57_ * ((Class87_Sub1) this).anInt7099]);
	}

	public void method1002(int i) {
		int i_58_ = method993();
		int i_59_ = method1045();
		if (((Class87_Sub1) this).anInt7099 != i_58_ || ((Class87_Sub1) this).anInt7101 != i_59_) {
			int i_60_ = i;
			if (i_60_ > ((Class87_Sub1) this).anInt7104)
				i_60_ = ((Class87_Sub1) this).anInt7104;
			int i_61_ = i;
			if ((i_61_ + ((Class87_Sub1) this).anInt7104 + ((Class87_Sub1) this).anInt7099) > i_58_)
				i_61_ = (i_58_ - ((Class87_Sub1) this).anInt7104 - ((Class87_Sub1) this).anInt7099);
			int i_62_ = i;
			if (i_62_ > ((Class87_Sub1) this).anInt7100)
				i_62_ = ((Class87_Sub1) this).anInt7100;
			int i_63_ = i;
			if ((i_63_ + ((Class87_Sub1) this).anInt7100 + ((Class87_Sub1) this).anInt7101) > i_59_)
				i_63_ = (i_59_ - ((Class87_Sub1) this).anInt7100 - ((Class87_Sub1) this).anInt7101);
			int i_64_ = ((Class87_Sub1) this).anInt7099 + i_60_ + i_61_;
			int i_65_ = ((Class87_Sub1) this).anInt7101 + i_62_ + i_63_;
			int[] is = new int[i_64_ * i_65_];
			for (int i_66_ = 0; i_66_ < ((Class87_Sub1) this).anInt7101; i_66_++) {
				int i_67_ = i_66_ * ((Class87_Sub1) this).anInt7099;
				int i_68_ = (i_66_ + i_62_) * i_64_ + i_60_;
				for (int i_69_ = 0; i_69_ < ((Class87_Sub1) this).anInt7099; i_69_++)
					is[i_68_++] = ((Class87_Sub1) this).anIntArray7105[i_67_++];
			}
			((Class87_Sub1) this).anInt7104 -= i_60_;
			((Class87_Sub1) this).anInt7100 -= i_62_;
			((Class87_Sub1) this).anInt7102 -= i_61_;
			((Class87_Sub1) this).anInt7103 -= i_63_;
			((Class87_Sub1) this).anInt7099 = i_64_;
			((Class87_Sub1) this).anInt7101 = i_65_;
			((Class87_Sub1) this).anIntArray7105 = is;
		}
	}

	Class87_Sub1(int i, int i_70_, int[] is) {
		((Class87_Sub1) this).anInt7099 = i;
		((Class87_Sub1) this).anInt7101 = i_70_;
		((Class87_Sub1) this).anIntArray7105 = is;
	}

	public void method1030(int i) {
		int i_71_ = 0;
		int[] is = new int[(((Class87_Sub1) this).anInt7099 * ((Class87_Sub1) this).anInt7101)];
		for (int i_72_ = 0; i_72_ < ((Class87_Sub1) this).anInt7101; i_72_++) {
			for (int i_73_ = 0; i_73_ < ((Class87_Sub1) this).anInt7099; i_73_++) {
				int i_74_ = ((Class87_Sub1) this).anIntArray7105[i_71_];
				if ((i_74_ & ~0xffffff) == 0) {
					if (i_73_ > 0 && (((Class87_Sub1) this).anIntArray7105[i_71_ - 1] & ~0xffffff) != 0)
						i_74_ = i;
					else if (i_72_ > 0 && ((((Class87_Sub1) this).anIntArray7105[i_71_ - ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_74_ = i;
					else if (i_73_ < ((Class87_Sub1) this).anInt7099 - 1 && ((((Class87_Sub1) this).anIntArray7105[i_71_ + 1]) & ~0xffffff) != 0)
						i_74_ = i;
					else if (i_72_ < ((Class87_Sub1) this).anInt7101 - 1 && ((((Class87_Sub1) this).anIntArray7105[i_71_ + ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_74_ = i;
				}
				is[i_71_++] = i_74_;
			}
		}
		((Class87_Sub1) this).anIntArray7105 = is;
	}

	public void method1022(int i) {
		int i_75_ = 0;
		int[] is = new int[(((Class87_Sub1) this).anInt7099 * ((Class87_Sub1) this).anInt7101)];
		for (int i_76_ = 0; i_76_ < ((Class87_Sub1) this).anInt7101; i_76_++) {
			for (int i_77_ = 0; i_77_ < ((Class87_Sub1) this).anInt7099; i_77_++) {
				int i_78_ = ((Class87_Sub1) this).anIntArray7105[i_75_];
				if ((i_78_ & ~0xffffff) == 0) {
					if (i_77_ > 0 && (((Class87_Sub1) this).anIntArray7105[i_75_ - 1] & ~0xffffff) != 0)
						i_78_ = i;
					else if (i_76_ > 0 && ((((Class87_Sub1) this).anIntArray7105[i_75_ - ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_78_ = i;
					else if (i_77_ < ((Class87_Sub1) this).anInt7099 - 1 && ((((Class87_Sub1) this).anIntArray7105[i_75_ + 1]) & ~0xffffff) != 0)
						i_78_ = i;
					else if (i_76_ < ((Class87_Sub1) this).anInt7101 - 1 && ((((Class87_Sub1) this).anIntArray7105[i_75_ + ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
						i_78_ = i;
				}
				is[i_75_++] = i_78_;
			}
		}
		((Class87_Sub1) this).anIntArray7105 = is;
	}

	public void method1032(int i) {
		for (int i_79_ = ((Class87_Sub1) this).anInt7101 - 1; i_79_ > 0; i_79_--) {
			int i_80_ = i_79_ * ((Class87_Sub1) this).anInt7099;
			for (int i_81_ = ((Class87_Sub1) this).anInt7099 - 1; i_81_ > 0; i_81_--) {
				if ((((Class87_Sub1) this).anIntArray7105[i_81_ + i_80_] & ~0xffffff) == 0 && ((((Class87_Sub1) this).anIntArray7105[i_81_ + i_80_ - 1 - ((Class87_Sub1) this).anInt7099]) & ~0xffffff) != 0)
					((Class87_Sub1) this).anIntArray7105[i_81_ + i_80_] = i;
			}
		}
	}

	public void method1033() {
		int[] is = ((Class87_Sub1) this).anIntArray7105;
		for (int i = ((Class87_Sub1) this).anInt7101 - 1; i >= 0; i--) {
			int i_82_ = i * ((Class87_Sub1) this).anInt7099;
			for (int i_83_ = (i + 1) * ((Class87_Sub1) this).anInt7099; i_82_ < i_83_; i_82_++) {
				i_83_--;
				int i_84_ = is[i_82_];
				is[i_82_] = is[i_83_];
				is[i_83_] = i_84_;
			}
		}
		int i = ((Class87_Sub1) this).anInt7104;
		((Class87_Sub1) this).anInt7104 = ((Class87_Sub1) this).anInt7102;
		((Class87_Sub1) this).anInt7102 = i;
	}

	public void method1020() {
		int[] is = ((Class87_Sub1) this).anIntArray7105;
		for (int i = (((Class87_Sub1) this).anInt7101 >> 1) - 1; i >= 0; i--) {
			int i_85_ = i * ((Class87_Sub1) this).anInt7099;
			int i_86_ = ((((Class87_Sub1) this).anInt7101 - i - 1) * ((Class87_Sub1) this).anInt7099);
			for (int i_87_ = -((Class87_Sub1) this).anInt7099; i_87_ < 0; i_87_++) {
				int i_88_ = is[i_85_];
				is[i_85_] = is[i_86_];
				is[i_86_] = i_88_;
				i_85_++;
				i_86_++;
			}
		}
		int i = ((Class87_Sub1) this).anInt7100;
		((Class87_Sub1) this).anInt7100 = ((Class87_Sub1) this).anInt7103;
		((Class87_Sub1) this).anInt7103 = i;
	}

	public void method1035() {
		int[] is = new int[(((Class87_Sub1) this).anInt7099 * ((Class87_Sub1) this).anInt7101)];
		int i = 0;
		for (int i_89_ = 0; i_89_ < ((Class87_Sub1) this).anInt7099; i_89_++) {
			for (int i_90_ = ((Class87_Sub1) this).anInt7101 - 1; i_90_ >= 0; i_90_--)
				is[i++] = (((Class87_Sub1) this).anIntArray7105[i_89_ + i_90_ * ((Class87_Sub1) this).anInt7099]);
		}
		((Class87_Sub1) this).anIntArray7105 = is;
		int i_91_ = ((Class87_Sub1) this).anInt7100;
		((Class87_Sub1) this).anInt7100 = ((Class87_Sub1) this).anInt7104;
		((Class87_Sub1) this).anInt7104 = ((Class87_Sub1) this).anInt7103;
		((Class87_Sub1) this).anInt7103 = ((Class87_Sub1) this).anInt7102;
		((Class87_Sub1) this).anInt7102 = ((Class87_Sub1) this).anInt7100;
		i_91_ = ((Class87_Sub1) this).anInt7101;
		((Class87_Sub1) this).anInt7101 = ((Class87_Sub1) this).anInt7099;
		((Class87_Sub1) this).anInt7099 = i_91_;
	}

	public int method1016() {
		return (((Class87_Sub1) this).anInt7101 + ((Class87_Sub1) this).anInt7100 + ((Class87_Sub1) this).anInt7103);
	}

	public int[] method1031(boolean bool) {
		if (bool && (method993() != ((Class87_Sub1) this).anInt7099 || method1045() != ((Class87_Sub1) this).anInt7101)) {
			int i = method993();
			int[] is = new int[i * method1045()];
			for (int i_92_ = 0; i_92_ < ((Class87_Sub1) this).anInt7101; i_92_++) {
				int i_93_ = i_92_ * ((Class87_Sub1) this).anInt7099;
				int i_94_ = (((Class87_Sub1) this).anInt7104 + (i_92_ + ((Class87_Sub1) this).anInt7100) * i);
				for (int i_95_ = 0; i_95_ < ((Class87_Sub1) this).anInt7099; i_95_++) {
					is[i_94_++] = ((Class87_Sub1) this).anIntArray7105[i_93_];
					i_93_++;
				}
			}
			return is;
		}
		return ((Class87_Sub1) this).anIntArray7105;
	}

	public int[] method1038(boolean bool) {
		if (bool && (method993() != ((Class87_Sub1) this).anInt7099 || method1045() != ((Class87_Sub1) this).anInt7101)) {
			int i = method993();
			int[] is = new int[i * method1045()];
			for (int i_96_ = 0; i_96_ < ((Class87_Sub1) this).anInt7101; i_96_++) {
				int i_97_ = i_96_ * ((Class87_Sub1) this).anInt7099;
				int i_98_ = (((Class87_Sub1) this).anInt7104 + (i_96_ + ((Class87_Sub1) this).anInt7100) * i);
				for (int i_99_ = 0; i_99_ < ((Class87_Sub1) this).anInt7099; i_99_++) {
					is[i_98_++] = ((Class87_Sub1) this).anIntArray7105[i_97_];
					i_97_++;
				}
			}
			return is;
		}
		return ((Class87_Sub1) this).anIntArray7105;
	}

	public void method1039(int i, int i_100_, int i_101_) {
		for (int i_102_ = 1; i_102_ < ((Class87_Sub1) this).anIntArray7105.length; i_102_++) {
			int i_103_ = ((Class87_Sub1) this).anIntArray7105[i_102_] >> 16 & 0xff;
			i_103_ += i;
			if (i_103_ < 0)
				i_103_ = 0;
			else if (i_103_ > 255)
				i_103_ = 255;
			int i_104_ = ((Class87_Sub1) this).anIntArray7105[i_102_] >> 8 & 0xff;
			i_104_ += i_100_;
			if (i_104_ < 0)
				i_104_ = 0;
			else if (i_104_ > 255)
				i_104_ = 255;
			int i_105_ = ((Class87_Sub1) this).anIntArray7105[i_102_] >> 0 & 0xff;
			i_105_ += i_101_;
			if (i_105_ < 0)
				i_105_ = 0;
			else if (i_105_ > 255)
				i_105_ = 255;
			((Class87_Sub1) this).anIntArray7105[i_102_] = (((Class87_Sub1) this).anIntArray7105[i_102_] & ~0xffffff | i_103_ << 16 | i_104_ << 8 | i_105_);
		}
	}

	public void method1040(int i, int i_106_, int i_107_) {
		for (int i_108_ = 1; i_108_ < ((Class87_Sub1) this).anIntArray7105.length; i_108_++) {
			int i_109_ = ((Class87_Sub1) this).anIntArray7105[i_108_] >> 16 & 0xff;
			i_109_ += i;
			if (i_109_ < 0)
				i_109_ = 0;
			else if (i_109_ > 255)
				i_109_ = 255;
			int i_110_ = ((Class87_Sub1) this).anIntArray7105[i_108_] >> 8 & 0xff;
			i_110_ += i_106_;
			if (i_110_ < 0)
				i_110_ = 0;
			else if (i_110_ > 255)
				i_110_ = 255;
			int i_111_ = ((Class87_Sub1) this).anIntArray7105[i_108_] >> 0 & 0xff;
			i_111_ += i_107_;
			if (i_111_ < 0)
				i_111_ = 0;
			else if (i_111_ > 255)
				i_111_ = 255;
			((Class87_Sub1) this).anIntArray7105[i_108_] = (((Class87_Sub1) this).anIntArray7105[i_108_] & ~0xffffff | i_109_ << 16 | i_110_ << 8 | i_111_);
		}
	}

	public void method1043(int i, int i_112_, int i_113_) {
		for (int i_114_ = 1; i_114_ < ((Class87_Sub1) this).anIntArray7105.length; i_114_++) {
			int i_115_ = ((Class87_Sub1) this).anIntArray7105[i_114_] >> 16 & 0xff;
			i_115_ += i;
			if (i_115_ < 0)
				i_115_ = 0;
			else if (i_115_ > 255)
				i_115_ = 255;
			int i_116_ = ((Class87_Sub1) this).anIntArray7105[i_114_] >> 8 & 0xff;
			i_116_ += i_112_;
			if (i_116_ < 0)
				i_116_ = 0;
			else if (i_116_ > 255)
				i_116_ = 255;
			int i_117_ = ((Class87_Sub1) this).anIntArray7105[i_114_] >> 0 & 0xff;
			i_117_ += i_113_;
			if (i_117_ < 0)
				i_117_ = 0;
			else if (i_117_ > 255)
				i_117_ = 255;
			((Class87_Sub1) this).anIntArray7105[i_114_] = (((Class87_Sub1) this).anIntArray7105[i_114_] & ~0xffffff | i_115_ << 16 | i_116_ << 8 | i_117_);
		}
	}

	public void method1042(int i, int i_118_, int i_119_) {
		for (int i_120_ = 1; i_120_ < ((Class87_Sub1) this).anIntArray7105.length; i_120_++) {
			int i_121_ = ((Class87_Sub1) this).anIntArray7105[i_120_] >> 16 & 0xff;
			i_121_ += i;
			if (i_121_ < 0)
				i_121_ = 0;
			else if (i_121_ > 255)
				i_121_ = 255;
			int i_122_ = ((Class87_Sub1) this).anIntArray7105[i_120_] >> 8 & 0xff;
			i_122_ += i_118_;
			if (i_122_ < 0)
				i_122_ = 0;
			else if (i_122_ > 255)
				i_122_ = 255;
			int i_123_ = ((Class87_Sub1) this).anIntArray7105[i_120_] >> 0 & 0xff;
			i_123_ += i_119_;
			if (i_123_ < 0)
				i_123_ = 0;
			else if (i_123_ > 255)
				i_123_ = 255;
			((Class87_Sub1) this).anIntArray7105[i_120_] = (((Class87_Sub1) this).anIntArray7105[i_120_] & ~0xffffff | i_121_ << 16 | i_122_ << 8 | i_123_);
		}
	}

	public int method1001(int i, int i_124_) {
		return (((Class87_Sub1) this).anIntArray7105[i + i_124_ * ((Class87_Sub1) this).anInt7099]);
	}

	public void method1036() {
		int[] is = new int[(((Class87_Sub1) this).anInt7099 * ((Class87_Sub1) this).anInt7101)];
		int i = 0;
		for (int i_125_ = 0; i_125_ < ((Class87_Sub1) this).anInt7099; i_125_++) {
			for (int i_126_ = ((Class87_Sub1) this).anInt7101 - 1; i_126_ >= 0; i_126_--)
				is[i++] = (((Class87_Sub1) this).anIntArray7105[i_125_ + i_126_ * ((Class87_Sub1) this).anInt7099]);
		}
		((Class87_Sub1) this).anIntArray7105 = is;
		int i_127_ = ((Class87_Sub1) this).anInt7100;
		((Class87_Sub1) this).anInt7100 = ((Class87_Sub1) this).anInt7104;
		((Class87_Sub1) this).anInt7104 = ((Class87_Sub1) this).anInt7103;
		((Class87_Sub1) this).anInt7103 = ((Class87_Sub1) this).anInt7102;
		((Class87_Sub1) this).anInt7102 = ((Class87_Sub1) this).anInt7100;
		i_127_ = ((Class87_Sub1) this).anInt7101;
		((Class87_Sub1) this).anInt7101 = ((Class87_Sub1) this).anInt7099;
		((Class87_Sub1) this).anInt7099 = i_127_;
	}

	public int method1003(int i, int i_128_) {
		return (((Class87_Sub1) this).anIntArray7105[i + i_128_ * ((Class87_Sub1) this).anInt7099]);
	}

	public int method1046(int i, int i_129_) {
		return (((Class87_Sub1) this).anIntArray7105[i + i_129_ * ((Class87_Sub1) this).anInt7099]);
	}

	public int method1017() {
		return ((Class87_Sub1) this).anInt7104;
	}
}
