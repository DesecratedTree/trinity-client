/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class183 {
	int anInt1805;
	Class_xa_Sub2 aClass_xa_Sub2_1806;
	int anInt1807;
	int anInt1808;
	byte[] aByteArray1809;
	int anInt1810;
	Class182[][] aClass182ArrayArray1811;
	int anInt1812;
	Class_ra_Sub2 aClass_ra_Sub2_1813;

	void method2066(Class140 class140, int i, int i_0_, int i_1_, boolean[][] bools, boolean bool) {
		((Class183) this).aClass_ra_Sub2_1813.RA(false);
		float f = 1.0F / (float) (((Class_ra_Sub2) ((Class183) this).aClass_ra_Sub2_1813).anInt8539 * 128);
		if (bool) {
			for (int i_2_ = 0; i_2_ < ((Class183) this).anInt1808; i_2_++) {
				int i_3_ = i_2_ << ((Class183) this).anInt1812;
				int i_4_ = i_2_ + 1 << ((Class183) this).anInt1812;
				for (int i_5_ = 0; i_5_ < ((Class183) this).anInt1810; i_5_++) {
					if (((Class183) this).aClass182ArrayArray1811[i_5_][i_2_] != null) {
						int i_6_ = i_5_ << ((Class183) this).anInt1812;
						int i_7_ = i_5_ + 1 << ((Class183) this).anInt1812;
						while_67_: for (int i_8_ = i_6_; i_8_ < i_7_; i_8_++) {
							if (i_8_ - i >= -i_1_ && i_8_ - i <= i_1_) {
								for (int i_9_ = i_3_; i_9_ < i_4_; i_9_++) {
									if (i_9_ - i_0_ >= -i_1_ && i_9_ - i_0_ <= i_1_ && (bools[i_8_ - i + i_1_][i_9_ - i_0_ + i_1_])) {
										class140.aClass249_1546.method2486(f, f, 1.0F, 1.0F);
										class140.aClass249_1546.aFloatArray2631[12] = (float) -i_5_;
										class140.aClass249_1546.aFloatArray2631[13] = (float) -i_2_;
										((Class183) this).aClass182ArrayArray1811[i_5_][i_2_].method2063(class140);
										break while_67_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[(((Class183) this).anInt1808 * ((Class183) this).anInt1810)];
			ByteBuffer bytebuffer = ((Class183) this).aClass_ra_Sub2_1813.aByteBuffer8458;
			bytebuffer.clear();
			int i_10_ = 0;
			for (int i_11_ = 0; i_11_ < ((Class183) this).anInt1808; i_11_++) {
				int i_12_ = i_11_ << ((Class183) this).anInt1812;
				int i_13_ = i_11_ + 1 << ((Class183) this).anInt1812;
				for (int i_14_ = 0; i_14_ < ((Class183) this).anInt1810; i_14_++) {
					Class182 class182 = (((Class183) this).aClass182ArrayArray1811[i_14_][i_11_]);
					int i_15_ = 0;
					if (class182 != null) {
						int i_16_ = i_14_ << ((Class183) this).anInt1812;
						int i_17_ = i_14_ + 1 << ((Class183) this).anInt1812;
						for (int i_18_ = i_12_; i_18_ < i_13_; i_18_++) {
							if (i_18_ - i_0_ >= -i_1_ && i_18_ - i_0_ <= i_1_) {
								int i_19_ = i_18_ * ((((Class183) this).aClass_xa_Sub2_1806.anInt6397) * 1972554729) + i_16_;
								for (int i_20_ = i_16_; i_20_ < i_17_; i_20_++) {
									if (i_20_ - i >= -i_1_ && i_20_ - i <= i_1_ && (bools[i_20_ - i + i_1_][i_18_ - i_0_ + i_1_])) {
										short[] is_21_ = (((Class_xa_Sub2) (((Class183) this).aClass_xa_Sub2_1806)).aShortArrayArray8798[i_19_]);
										if (is_21_ != null) {
											for (int i_22_ = 0; i_22_ < is_21_.length; i_22_++) {
												bytebuffer.putShort(is_21_[i_22_]);
												i_15_++;
											}
										}
									}
									i_19_++;
								}
							}
						}
					}
					is[i_10_] = i_15_;
					i_10_++;
				}
			}
			if (bytebuffer.position() != 0) {
				int i_23_ = bytebuffer.position();
				Interface9_Impl2 interface9_impl2 = ((Class183) this).aClass_ra_Sub2_1813.method4909(i_23_ / 2);
				interface9_impl2.method97(0, i_23_, (((Class183) this).aClass_ra_Sub2_1813.aLong8459));
				int i_24_ = 0;
				i_10_ = 0;
				for (int i_25_ = 0; i_25_ < ((Class183) this).anInt1808; i_25_++) {
					for (int i_26_ = 0; i_26_ < ((Class183) this).anInt1810; i_26_++) {
						if (is[i_10_] != 0) {
							class140.aClass249_1546.method2486(f, f, 1.0F, 1.0F);
							class140.aClass249_1546.aFloatArray2631[12] = (float) -i_26_;
							class140.aClass249_1546.aFloatArray2631[13] = (float) -i_25_;
							((Class183) this).aClass182ArrayArray1811[i_26_][i_25_].method2064(class140, interface9_impl2, i_24_, is[i_10_] / 3);
							i_24_ += is[i_10_];
						}
						i_10_++;
					}
				}
			}
		}
		((Class183) this).aClass_ra_Sub2_1813.RA(true);
	}

	void method2067() {
		((Class183) this).aClass182ArrayArray1811 = (new Class182[((Class183) this).anInt1810][((Class183) this).anInt1808]);
		for (int i = 0; i < ((Class183) this).anInt1808; i++) {
			for (int i_27_ = 0; i_27_ < ((Class183) this).anInt1810; i_27_++) {
				((Class183) this).aClass182ArrayArray1811[i_27_][i] = new Class182(((Class183) this).aClass_ra_Sub2_1813, this, ((Class183) this).aClass_xa_Sub2_1806, i_27_, i, ((Class183) this).anInt1812, i_27_ * 128 + 1, i * 128 + 1);
				if (((Class182) (((Class183) this).aClass182ArrayArray1811[i_27_][i])).anInt1798 == 0)
					((Class183) this).aClass182ArrayArray1811[i_27_][i] = null;
			}
		}
	}

	void method2068(Class_na class_na, int i, int i_28_) {
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		i += ((Class_na_Sub1) class_na_sub1).anInt10158 + 1;
		i_28_ += ((Class_na_Sub1) class_na_sub1).anInt10156 + 1;
		int i_29_ = i + i_28_ * ((Class183) this).anInt1807;
		int i_30_ = 0;
		int i_31_ = ((Class_na_Sub1) class_na_sub1).anInt10159;
		int i_32_ = ((Class_na_Sub1) class_na_sub1).anInt10157;
		int i_33_ = ((Class183) this).anInt1807 - i_32_;
		int i_34_ = 0;
		if (i_28_ <= 0) {
			int i_35_ = 1 - i_28_;
			i_31_ -= i_35_;
			i_30_ += i_35_ * i_32_;
			i_29_ += i_35_ * ((Class183) this).anInt1807;
			i_28_ = 1;
		}
		if (i_28_ + i_31_ >= ((Class183) this).anInt1805) {
			int i_36_ = i_28_ + i_31_ + 1 - ((Class183) this).anInt1805;
			i_31_ -= i_36_;
		}
		if (i <= 0) {
			int i_37_ = 1 - i;
			i_32_ -= i_37_;
			i_30_ += i_37_;
			i_29_ += i_37_;
			i_34_ += i_37_;
			i_33_ += i_37_;
			i = 1;
		}
		if (i + i_32_ >= ((Class183) this).anInt1807) {
			int i_38_ = i + i_32_ + 1 - ((Class183) this).anInt1807;
			i_32_ -= i_38_;
			i_34_ += i_38_;
			i_33_ += i_38_;
		}
		if (i_32_ > 0 && i_31_ > 0) {
			method2071(((Class183) this).aByteArray1809, ((Class_na_Sub1) class_na_sub1).aByteArray10160, i_30_, i_29_, i_32_, i_31_, i_33_, i_34_);
			method2073(i, i_28_, i_32_, i_31_);
		}
	}

	void method2069(Class_na class_na, int i, int i_39_) {
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		i += ((Class_na_Sub1) class_na_sub1).anInt10158 + 1;
		i_39_ += ((Class_na_Sub1) class_na_sub1).anInt10156 + 1;
		int i_40_ = i + i_39_ * ((Class183) this).anInt1807;
		int i_41_ = 0;
		int i_42_ = ((Class_na_Sub1) class_na_sub1).anInt10159;
		int i_43_ = ((Class_na_Sub1) class_na_sub1).anInt10157;
		int i_44_ = ((Class183) this).anInt1807 - i_43_;
		int i_45_ = 0;
		if (i_39_ <= 0) {
			int i_46_ = 1 - i_39_;
			i_42_ -= i_46_;
			i_41_ += i_46_ * i_43_;
			i_40_ += i_46_ * ((Class183) this).anInt1807;
			i_39_ = 1;
		}
		if (i_39_ + i_42_ >= ((Class183) this).anInt1805) {
			int i_47_ = i_39_ + i_42_ + 1 - ((Class183) this).anInt1805;
			i_42_ -= i_47_;
		}
		if (i <= 0) {
			int i_48_ = 1 - i;
			i_43_ -= i_48_;
			i_41_ += i_48_;
			i_40_ += i_48_;
			i_45_ += i_48_;
			i_44_ += i_48_;
			i = 1;
		}
		if (i + i_43_ >= ((Class183) this).anInt1807) {
			int i_49_ = i + i_43_ + 1 - ((Class183) this).anInt1807;
			i_43_ -= i_49_;
			i_45_ += i_49_;
			i_44_ += i_49_;
		}
		if (i_43_ > 0 && i_42_ > 0) {
			method2074(((Class183) this).aByteArray1809, ((Class_na_Sub1) class_na_sub1).aByteArray10160, i_41_, i_40_, i_43_, i_42_, i_44_, i_45_);
			method2073(i, i_39_, i_43_, i_42_);
		}
	}

	boolean method2070(Class_na class_na, int i, int i_50_) {
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		i += ((Class_na_Sub1) class_na_sub1).anInt10158 + 1;
		i_50_ += ((Class_na_Sub1) class_na_sub1).anInt10156 + 1;
		int i_51_ = i + i_50_ * ((Class183) this).anInt1807;
		int i_52_ = ((Class_na_Sub1) class_na_sub1).anInt10159;
		int i_53_ = ((Class_na_Sub1) class_na_sub1).anInt10157;
		int i_54_ = ((Class183) this).anInt1807 - i_53_;
		if (i_50_ <= 0) {
			int i_55_ = 1 - i_50_;
			i_52_ -= i_55_;
			i_51_ += i_55_ * ((Class183) this).anInt1807;
			i_50_ = 1;
		}
		if (i_50_ + i_52_ >= ((Class183) this).anInt1805) {
			int i_56_ = i_50_ + i_52_ + 1 - ((Class183) this).anInt1805;
			i_52_ -= i_56_;
		}
		if (i <= 0) {
			int i_57_ = 1 - i;
			i_53_ -= i_57_;
			i_51_ += i_57_;
			i_54_ += i_57_;
			i = 1;
		}
		if (i + i_53_ >= ((Class183) this).anInt1807) {
			int i_58_ = i + i_53_ + 1 - ((Class183) this).anInt1807;
			i_53_ -= i_58_;
			i_54_ += i_58_;
		}
		if (i_53_ <= 0 || i_52_ <= 0)
			return false;
		int i_59_ = 8;
		i_54_ += (i_59_ - 1) * ((Class183) this).anInt1807;
		return method2072(((Class183) this).aByteArray1809, i_51_, i_53_, i_52_, i_54_, i_59_);
	}

	static final void method2071(byte[] is, byte[] is_60_, int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_) {
		int i_66_ = -(i_62_ >> 2);
		i_62_ = -(i_62_ & 0x3);
		for (int i_67_ = -i_63_; i_67_ < 0; i_67_++) {
			for (int i_68_ = i_66_; i_68_ < 0; i_68_++) {
				is[i_61_++] += is_60_[i++];
				is[i_61_++] += is_60_[i++];
				is[i_61_++] += is_60_[i++];
				is[i_61_++] += is_60_[i++];
			}
			for (int i_69_ = i_62_; i_69_ < 0; i_69_++)
				is[i_61_++] += is_60_[i++];
			i_61_ += i_64_;
			i += i_65_;
		}
	}

	static final boolean method2072(byte[] is, int i, int i_70_, int i_71_, int i_72_, int i_73_) {
		int i_74_ = i_70_ % i_73_;
		int i_75_;
		if (i_74_ != 0)
			i_75_ = i_73_ - i_74_;
		else
			i_75_ = 0;
		int i_76_ = -((i_71_ + i_73_ - 1) / i_73_);
		int i_77_ = -((i_70_ + i_73_ - 1) / i_73_);
		for (int i_78_ = i_76_; i_78_ < 0; i_78_++) {
			for (int i_79_ = i_77_; i_79_ < 0; i_79_++) {
				if (is[i] == 0)
					return true;
				i += i_73_;
			}
			i -= i_75_;
			if (is[i - 1] == 0)
				return true;
			i += i_72_;
		}
		return false;
	}

	void method2073(int i, int i_80_, int i_81_, int i_82_) {
		if (((Class183) this).aClass182ArrayArray1811 != null) {
			int i_83_ = i - 1 >> 7;
			int i_84_ = i - 1 + i_81_ - 1 >> 7;
			int i_85_ = i_80_ - 1 >> 7;
			int i_86_ = i_80_ - 1 + i_82_ - 1 >> 7;
			for (int i_87_ = i_83_; i_87_ <= i_84_; i_87_++) {
				Class182[] class182s = ((Class183) this).aClass182ArrayArray1811[i_87_];
				for (int i_88_ = i_85_; i_88_ <= i_86_; i_88_++) {
					if (class182s[i_88_] != null)
						((Class182) class182s[i_88_]).aBoolean1794 = true;
				}
			}
		}
	}

	Class183(Class_ra_Sub2 class_ra_sub2, Class_xa_Sub2 class_xa_sub2) {
		((Class183) this).aClass_ra_Sub2_1813 = class_ra_sub2;
		((Class183) this).aClass_xa_Sub2_1806 = class_xa_sub2;
		((Class183) this).anInt1807 = 2 + ((((Class183) this).aClass_xa_Sub2_1806.anInt6397 * 1972554729 * (((Class183) this).aClass_xa_Sub2_1806.anInt6395 * 550173571)) >> (((Class_ra_Sub2) ((Class183) this).aClass_ra_Sub2_1813).anInt8536));
		((Class183) this).anInt1805 = 2 + ((((Class183) this).aClass_xa_Sub2_1806.anInt6393 * 24567321 * (((Class183) this).aClass_xa_Sub2_1806.anInt6395 * 550173571)) >> (((Class_ra_Sub2) ((Class183) this).aClass_ra_Sub2_1813).anInt8536));
		((Class183) this).aByteArray1809 = (new byte[((Class183) this).anInt1807 * ((Class183) this).anInt1805]);
		((Class183) this).anInt1812 = (7 + (((Class_ra_Sub2) ((Class183) this).aClass_ra_Sub2_1813).anInt8536) - (((Class183) this).aClass_xa_Sub2_1806.anInt6396 * -1066304221));
		((Class183) this).anInt1810 = (((Class183) this).aClass_xa_Sub2_1806.anInt6397 * 1972554729 >> ((Class183) this).anInt1812);
		((Class183) this).anInt1808 = (((Class183) this).aClass_xa_Sub2_1806.anInt6393 * 24567321 >> ((Class183) this).anInt1812);
	}

	static final void method2074(byte[] is, byte[] is_89_, int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_) {
		int i_95_ = -(i_91_ >> 2);
		i_91_ = -(i_91_ & 0x3);
		for (int i_96_ = -i_92_; i_96_ < 0; i_96_++) {
			for (int i_97_ = i_95_; i_97_ < 0; i_97_++) {
				is[i_90_++] -= is_89_[i++];
				is[i_90_++] -= is_89_[i++];
				is[i_90_++] -= is_89_[i++];
				is[i_90_++] -= is_89_[i++];
			}
			for (int i_98_ = i_91_; i_98_ < 0; i_98_++)
				is[i_90_++] -= is_89_[i++];
			i_90_ += i_93_;
			i += i_94_;
		}
	}
}
