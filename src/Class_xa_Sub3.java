/* Class_xa_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_xa_Sub3 extends Class_xa {
	Class4[][] aClass4ArrayArray8832;
	static int anInt8833 = -1694498816;
	static int anInt8834 = 1;
	static int anInt8835 = 2;
	float aFloat8836;
	static int anInt8837 = 64;
	int anInt8838;
	Class31[][] aClass31ArrayArray8839;
	Class17[][] aClass17ArrayArray8840;
	static boolean aBoolean8841 = false;
	Class14[][] aClass14ArrayArray8842;
	Class42[][] aClass42ArrayArray8843;
	float aFloat8844;
	float aFloat8845;
	float aFloat8846;
	float aFloat8847;
	Class_ra_Sub3 aClass_ra_Sub3_8848;
	float aFloat8849;
	float aFloat8850;
	static boolean aBoolean8851 = true;
	float aFloat8852;
	float aFloat8853;
	float aFloat8854;
	float aFloat8855;
	static int anInt8856 = 4;
	float aFloat8857;
	byte[][] aByteArrayArray8858;
	float aFloat8859;
	byte[][] aByteArrayArray8860;
	float aFloat8861;
	static boolean aBoolean8862 = true;
	float aFloat8863;
	float aFloat8864;

	public void LA(int i, int i_0_, int i_1_) {
		if (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_0_] < i_1_)
			((Class_xa_Sub3) this).aByteArrayArray8858[i][i_0_] = (byte) i_1_;
	}

	public void method6413(int i, int i_2_, int[] is, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, Class77 class77, boolean bool) {
		if (((Class_xa_Sub3) this).aClass31ArrayArray8839 == null) {
			((Class_xa_Sub3) this).aClass31ArrayArray8839 = new Class31[anInt6397 * 1972554729][anInt6393 * 24567321];
			((Class_xa_Sub3) this).aClass17ArrayArray8840 = new Class17[anInt6397 * 1972554729][anInt6393 * 24567321];
		} else if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null || ((Class_xa_Sub3) this).aClass42ArrayArray8843 != null)
			throw new IllegalStateException();
		boolean bool_13_ = false;
		if (is_9_.length == 2 && is_6_.length == 2 && (is_9_[0] == is_9_[1] || is_11_[0] != -1 && is_11_[0] == is_11_[1])) {
			bool_13_ = true;
			for (int i_14_ = 1; i_14_ < 2; i_14_++) {
				int i_15_ = is[is_6_[i_14_]];
				int i_16_ = is_4_[is_6_[i_14_]];
				if (i_15_ != 0 && i_15_ != anInt6395 * 550173571 || i_16_ != 0 && i_16_ != anInt6395 * 550173571) {
					bool_13_ = false;
					break;
				}
			}
		}
		if (!bool_13_) {
			Class17 class17 = new Class17();
			short i_17_ = (short) is.length;
			int i_18_ = (short) is_9_.length;
			((Class17) class17).aShort217 = i_17_;
			((Class17) class17).aShortArray222 = new short[i_17_];
			((Class17) class17).aShortArray227 = new short[i_17_];
			((Class17) class17).aShortArray218 = new short[i_17_];
			((Class17) class17).aShortArray221 = new short[i_17_];
			for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
				int i_20_ = is[i_19_];
				int i_21_ = is_4_[i_19_];
				if (i_20_ == 0 && i_21_ == 0)
					((Class17) class17).aShortArray222[i_19_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_]));
				else if (i_20_ == 0 && i_21_ == anInt6395 * 550173571)
					((Class17) class17).aShortArray222[i_19_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_ + 1]));
				else if (i_20_ == anInt6395 * 550173571 && i_21_ == anInt6395 * 550173571)
					((Class17) class17).aShortArray222[i_19_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_ + 1]));
				else if (i_20_ == anInt6395 * 550173571 && i_21_ == 0)
					((Class17) class17).aShortArray222[i_19_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_]));
				else {
					int i_22_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_] - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_])) * (anInt6395 * 550173571 - i_20_) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_])) * i_20_);
					int i_23_ = (((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_ + 1])) * (anInt6395 * 550173571 - i_20_) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_ + 1])) * i_20_);
					((Class17) class17).aShortArray222[i_19_] = (short) ((i_22_ * (anInt6395 * 550173571 - i_21_) + i_23_ * i_21_) >> anInt6396 * -2132608442);
				}
				int i_24_ = (i << anInt6396 * -1066304221) + i_20_;
				int i_25_ = (i_2_ << anInt6396 * -1066304221) + i_21_;
				((Class17) class17).aShortArray227[i_19_] = (short) i_20_;
				((Class17) class17).aShortArray221[i_19_] = (short) i_21_;
				((Class17) class17).aShortArray218[i_19_] = (short) (method6416(i_24_, i_25_, 778721202) + (is_3_ != null ? is_3_[i_19_] : 0));
				if (((Class17) class17).aShortArray222[i_19_] < 2)
					((Class17) class17).aShortArray222[i_19_] = (short) 2;
			}
			boolean bool_26_ = false;
			int i_27_ = 0;
			for (int i_28_ = 0; i_28_ < i_18_; i_28_++) {
				if (is_9_[i_28_] >= 0 || is_10_ != null && is_10_[i_28_] >= 0)
					i_27_++;
				int i_29_ = is_11_[i_28_];
				if (i_29_ != -1) {
					Class56 class56 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_29_, 1261224992);
					if (!class56.aBoolean533) {
						bool_26_ = true;
						if (method6447(class56.aByte525) || class56.aByte531 != 0 || class56.aByte530 != 0)
							((Class17) class17).aByte216 |= 0x4;
					}
				}
			}
			((Class17) class17).anIntArray228 = new int[i_27_];
			if (is_10_ != null)
				((Class17) class17).anIntArray229 = new int[i_27_];
			((Class17) class17).aShortArray223 = new short[i_27_];
			((Class17) class17).aShortArray224 = new short[i_27_];
			((Class17) class17).aShortArray225 = new short[i_27_];
			if (bool_26_) {
				((Class17) class17).aShortArray226 = new short[i_27_];
				((Class17) class17).aShortArray219 = new short[i_27_];
			}
			for (int i_30_ = 0; i_30_ < i_18_; i_30_++) {
				if (is_9_[i_30_] >= 0 || is_10_ != null && is_10_[i_30_] >= 0) {
					if (is_9_[i_30_] >= 0)
						((Class17) class17).anIntArray228[(((Class17) class17).aShort220)] = Class356.modifyColor(is_9_[i_30_], (byte) 1);
					else
						((Class17) class17).anIntArray228[(((Class17) class17).aShort220)] = -1;
					if (is_10_ != null) {
						if (is_10_[i_30_] != -1)
							((Class17) class17).anIntArray229[((Class17) class17).aShort220] = Class356.modifyColor(is_10_[i_30_], (byte) 1);
						else
							((Class17) class17).anIntArray229[((Class17) class17).aShort220] = -1;
					}
					((Class17) class17).aShortArray223[(((Class17) class17).aShort220)] = (short) is_6_[i_30_];
					((Class17) class17).aShortArray224[(((Class17) class17).aShort220)] = (short) is_7_[i_30_];
					((Class17) class17).aShortArray225[(((Class17) class17).aShort220)] = (short) is_8_[i_30_];
					if (bool_26_) {
						if (is_11_[i_30_] != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_11_[i_30_], -246846698).aBoolean533)) {
							((Class17) class17).aShortArray226[((Class17) class17).aShort220] = (short) is_11_[i_30_];
							((Class17) class17).aShortArray219[((Class17) class17).aShort220] = (short) is_12_[i_30_];
						} else
							((Class17) class17).aShortArray226[((Class17) class17).aShort220] = (short) -1;
					}
					((Class17) class17).aShort220++;
				}
			}
			((Class_xa_Sub3) this).aClass17ArrayArray8840[i][i_2_] = class17;
		} else if (is_9_[0] >= 0 || is_10_ != null && is_10_[0] >= 0) {
			Class31 class31 = new Class31();
			int i_31_ = is_9_[0];
			int i_32_ = is_11_[0];
			if (is_10_ != null) {
				((Class31) class31).anInt357 = (Class330_Sub26_Sub1.method3395(Class356.modifyColor(is_10_[0], (byte) 1), (((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_] - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_])), -1494179361));
				if (i_31_ == -1)
					((Class31) class31).aByte355 |= 0x2;
			}
			if ((anIntArrayArray6394[i][i_2_] == anIntArrayArray6394[i + 1][i_2_]) && (anIntArrayArray6394[i][i_2_] == anIntArrayArray6394[i + 1][i_2_ + 1]) && (anIntArrayArray6394[i][i_2_] == anIntArrayArray6394[i][i_2_ + 1]))
				((Class31) class31).aByte355 |= 0x1;
			Class56 class56 = null;
			if (i_32_ != -1)
				class56 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_32_, -707547549);
			if (class56 != null && (((Class31) class31).aByte355 & 0x2) == 0 && !class56.aBoolean533) {
				((Class31) class31).aShort353 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_]));
				((Class31) class31).aShort354 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_]));
				((Class31) class31).aShort352 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_ + 1]));
				((Class31) class31).aShort356 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_ + 1]));
				((Class31) class31).aShort358 = (short) i_32_;
				if (method6447(class56.aByte525) || class56.aByte531 != 0 || class56.aByte530 != 0)
					((Class31) class31).aByte355 |= 0x4;
			} else {
				short i_33_ = Class356.modifyColor(i_31_, (byte) 1);
				((Class31) class31).aShort353 = (short) (Class330_Sub26_Sub1.method3395(i_33_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_])), -786580447));
				((Class31) class31).aShort354 = (short) (Class330_Sub26_Sub1.method3395(i_33_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_])), -1057315487));
				((Class31) class31).aShort352 = (short) (Class330_Sub26_Sub1.method3395(i_33_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_2_ + 1])), -1356452566));
				((Class31) class31).aShort356 = (short) (Class330_Sub26_Sub1.method3395(i_33_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_2_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_2_ + 1])), -1496865034));
				((Class31) class31).aShort358 = (short) -1;
			}
			((Class_xa_Sub3) this).aClass31ArrayArray8839[i][i_2_] = class31;
		}
	}

	public void method6411(int i, int i_34_, int[] is, int[] is_35_, int[] is_36_, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_, int[] is_41_, int[] is_42_, int[] is_43_, int[] is_44_, Class77 class77, boolean bool) {
		if (((Class_xa_Sub3) this).aClass31ArrayArray8839 == null) {
			((Class_xa_Sub3) this).aClass31ArrayArray8839 = new Class31[anInt6397 * 1972554729][anInt6393 * 24567321];
			((Class_xa_Sub3) this).aClass17ArrayArray8840 = new Class17[anInt6397 * 1972554729][anInt6393 * 24567321];
		} else if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null || ((Class_xa_Sub3) this).aClass42ArrayArray8843 != null)
			throw new IllegalStateException();
		boolean bool_45_ = false;
		if (is_41_.length == 2 && is_38_.length == 2 && (is_41_[0] == is_41_[1] || is_43_[0] != -1 && is_43_[0] == is_43_[1])) {
			bool_45_ = true;
			for (int i_46_ = 1; i_46_ < 2; i_46_++) {
				int i_47_ = is[is_38_[i_46_]];
				int i_48_ = is_36_[is_38_[i_46_]];
				if (i_47_ != 0 && i_47_ != anInt6395 * 550173571 || i_48_ != 0 && i_48_ != anInt6395 * 550173571) {
					bool_45_ = false;
					break;
				}
			}
		}
		if (!bool_45_) {
			Class17 class17 = new Class17();
			short i_49_ = (short) is.length;
			int i_50_ = (short) is_41_.length;
			((Class17) class17).aShort217 = i_49_;
			((Class17) class17).aShortArray222 = new short[i_49_];
			((Class17) class17).aShortArray227 = new short[i_49_];
			((Class17) class17).aShortArray218 = new short[i_49_];
			((Class17) class17).aShortArray221 = new short[i_49_];
			for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
				int i_52_ = is[i_51_];
				int i_53_ = is_36_[i_51_];
				if (i_52_ == 0 && i_53_ == 0)
					((Class17) class17).aShortArray222[i_51_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_]));
				else if (i_52_ == 0 && i_53_ == anInt6395 * 550173571)
					((Class17) class17).aShortArray222[i_51_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_ + 1]));
				else if (i_52_ == anInt6395 * 550173571 && i_53_ == anInt6395 * 550173571)
					((Class17) class17).aShortArray222[i_51_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_ + 1]));
				else if (i_52_ == anInt6395 * 550173571 && i_53_ == 0)
					((Class17) class17).aShortArray222[i_51_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_]));
				else {
					int i_54_ = (((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_])) * (anInt6395 * 550173571 - i_52_) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_])) * i_52_);
					int i_55_ = (((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_ + 1])) * (anInt6395 * 550173571 - i_52_) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_ + 1])) * i_52_);
					((Class17) class17).aShortArray222[i_51_] = (short) ((i_54_ * (anInt6395 * 550173571 - i_53_) + i_55_ * i_53_) >> anInt6396 * -2132608442);
				}
				int i_56_ = (i << anInt6396 * -1066304221) + i_52_;
				int i_57_ = (i_34_ << anInt6396 * -1066304221) + i_53_;
				((Class17) class17).aShortArray227[i_51_] = (short) i_52_;
				((Class17) class17).aShortArray221[i_51_] = (short) i_53_;
				((Class17) class17).aShortArray218[i_51_] = (short) (method6416(i_56_, i_57_, 1254823433) + (is_35_ != null ? is_35_[i_51_] : 0));
				if (((Class17) class17).aShortArray222[i_51_] < 2)
					((Class17) class17).aShortArray222[i_51_] = (short) 2;
			}
			boolean bool_58_ = false;
			int i_59_ = 0;
			for (int i_60_ = 0; i_60_ < i_50_; i_60_++) {
				if (is_41_[i_60_] >= 0 || is_42_ != null && is_42_[i_60_] >= 0)
					i_59_++;
				int i_61_ = is_43_[i_60_];
				if (i_61_ != -1) {
					Class56 class56 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_61_, -1311016614);
					if (!class56.aBoolean533) {
						bool_58_ = true;
						if (method6447(class56.aByte525) || class56.aByte531 != 0 || class56.aByte530 != 0)
							((Class17) class17).aByte216 |= 0x4;
					}
				}
			}
			((Class17) class17).anIntArray228 = new int[i_59_];
			if (is_42_ != null)
				((Class17) class17).anIntArray229 = new int[i_59_];
			((Class17) class17).aShortArray223 = new short[i_59_];
			((Class17) class17).aShortArray224 = new short[i_59_];
			((Class17) class17).aShortArray225 = new short[i_59_];
			if (bool_58_) {
				((Class17) class17).aShortArray226 = new short[i_59_];
				((Class17) class17).aShortArray219 = new short[i_59_];
			}
			for (int i_62_ = 0; i_62_ < i_50_; i_62_++) {
				if (is_41_[i_62_] >= 0 || is_42_ != null && is_42_[i_62_] >= 0) {
					if (is_41_[i_62_] >= 0)
						((Class17) class17).anIntArray228[(((Class17) class17).aShort220)] = Class356.modifyColor(is_41_[i_62_], (byte) 1);
					else
						((Class17) class17).anIntArray228[(((Class17) class17).aShort220)] = -1;
					if (is_42_ != null) {
						if (is_42_[i_62_] != -1)
							((Class17) class17).anIntArray229[((Class17) class17).aShort220] = Class356.modifyColor(is_42_[i_62_], (byte) 1);
						else
							((Class17) class17).anIntArray229[((Class17) class17).aShort220] = -1;
					}
					((Class17) class17).aShortArray223[(((Class17) class17).aShort220)] = (short) is_38_[i_62_];
					((Class17) class17).aShortArray224[(((Class17) class17).aShort220)] = (short) is_39_[i_62_];
					((Class17) class17).aShortArray225[(((Class17) class17).aShort220)] = (short) is_40_[i_62_];
					if (bool_58_) {
						if (is_43_[i_62_] != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_43_[i_62_], 501755662).aBoolean533)) {
							((Class17) class17).aShortArray226[((Class17) class17).aShort220] = (short) is_43_[i_62_];
							((Class17) class17).aShortArray219[((Class17) class17).aShort220] = (short) is_44_[i_62_];
						} else
							((Class17) class17).aShortArray226[((Class17) class17).aShort220] = (short) -1;
					}
					((Class17) class17).aShort220++;
				}
			}
			((Class_xa_Sub3) this).aClass17ArrayArray8840[i][i_34_] = class17;
		} else if (is_41_[0] >= 0 || is_42_ != null && is_42_[0] >= 0) {
			Class31 class31 = new Class31();
			int i_63_ = is_41_[0];
			int i_64_ = is_43_[0];
			if (is_42_ != null) {
				((Class31) class31).anInt357 = (Class330_Sub26_Sub1.method3395(Class356.modifyColor(is_42_[0], (byte) 1), (((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_] - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_])), -1749159568));
				if (i_63_ == -1)
					((Class31) class31).aByte355 |= 0x2;
			}
			if ((anIntArrayArray6394[i][i_34_] == anIntArrayArray6394[i + 1][i_34_]) && (anIntArrayArray6394[i][i_34_] == anIntArrayArray6394[i + 1][i_34_ + 1]) && (anIntArrayArray6394[i][i_34_] == anIntArrayArray6394[i][i_34_ + 1]))
				((Class31) class31).aByte355 |= 0x1;
			Class56 class56 = null;
			if (i_64_ != -1)
				class56 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_64_, 474600756);
			if (class56 != null && (((Class31) class31).aByte355 & 0x2) == 0 && !class56.aBoolean533) {
				((Class31) class31).aShort353 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_]));
				((Class31) class31).aShort354 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_]));
				((Class31) class31).aShort352 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_ + 1]));
				((Class31) class31).aShort356 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_ + 1]));
				((Class31) class31).aShort358 = (short) i_64_;
				if (method6447(class56.aByte525) || class56.aByte531 != 0 || class56.aByte530 != 0)
					((Class31) class31).aByte355 |= 0x4;
			} else {
				short i_65_ = Class356.modifyColor(i_63_, (byte) 1);
				((Class31) class31).aShort353 = (short) (Class330_Sub26_Sub1.method3395(i_65_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_])), -569129609));
				((Class31) class31).aShort354 = (short) (Class330_Sub26_Sub1.method3395(i_65_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_])), -1500544324));
				((Class31) class31).aShort352 = (short) (Class330_Sub26_Sub1.method3395(i_65_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_34_ + 1])), -1737398457));
				((Class31) class31).aShort356 = (short) (Class330_Sub26_Sub1.method3395(i_65_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_34_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_34_ + 1])), -1977156237));
				((Class31) class31).aShort358 = (short) -1;
			}
			((Class_xa_Sub3) this).aClass31ArrayArray8839[i][i_34_] = class31;
		}
	}

	static int method6442(int i, int i_66_) {
		int i_67_ = (i & 0xff0000) * i_66_ >> 23;
		if (i_67_ < 2)
			i_67_ = 2;
		else if (i_67_ > 253)
			i_67_ = 253;
		int i_68_ = (i & 0xff00) * i_66_ >> 15;
		if (i_68_ < 2)
			i_68_ = 2;
		else if (i_68_ > 253)
			i_68_ = 253;
		int i_69_ = (i & 0xff) * i_66_ >> 7;
		if (i_69_ < 2)
			i_69_ = 2;
		else if (i_69_ > 253)
			i_69_ = 253;
		return i_67_ << 16 | i_68_ << 8 | i_69_;
	}

	public void ac(Class_na class_na, int i, int i_70_, int i_71_, int i_72_, boolean bool) {
		/* empty */
	}

	public void method6423(int i, int i_73_, int i_74_, boolean[][] bools, boolean bool, int i_75_) {
		if ((((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).anIntArray8630) == null || (((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).aFloatArray8620) == null)
			throw new IllegalStateException("");
		Class249 class249 = (((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).aClass249_8634);
		((Class_xa_Sub3) this).aFloat8844 = class249.aFloatArray2631[0];
		((Class_xa_Sub3) this).aFloat8845 = class249.aFloatArray2631[1];
		((Class_xa_Sub3) this).aFloat8836 = class249.aFloatArray2631[2];
		((Class_xa_Sub3) this).aFloat8846 = class249.aFloatArray2631[3];
		((Class_xa_Sub3) this).aFloat8861 = class249.aFloatArray2631[4];
		((Class_xa_Sub3) this).aFloat8849 = class249.aFloatArray2631[5];
		((Class_xa_Sub3) this).aFloat8850 = class249.aFloatArray2631[6];
		((Class_xa_Sub3) this).aFloat8864 = class249.aFloatArray2631[7];
		((Class_xa_Sub3) this).aFloat8852 = class249.aFloatArray2631[8];
		((Class_xa_Sub3) this).aFloat8853 = class249.aFloatArray2631[9];
		((Class_xa_Sub3) this).aFloat8854 = class249.aFloatArray2631[10];
		((Class_xa_Sub3) this).aFloat8855 = class249.aFloatArray2631[11];
		((Class_xa_Sub3) this).aFloat8863 = class249.aFloatArray2631[12];
		((Class_xa_Sub3) this).aFloat8847 = class249.aFloatArray2631[13];
		((Class_xa_Sub3) this).aFloat8857 = class249.aFloatArray2631[14];
		((Class_xa_Sub3) this).aFloat8859 = class249.aFloatArray2631[15];
		for (int i_76_ = 0; i_76_ < i_74_ + i_74_; i_76_++) {
			for (int i_77_ = 0; i_77_ < i_74_ + i_74_; i_77_++) {
				if (bools[i_76_][i_77_]) {
					int i_78_ = i - i_74_ + i_76_;
					int i_79_ = i_73_ - i_74_ + i_77_;
					if (i_78_ >= 0 && i_78_ < anInt6397 * 1972554729 && i_79_ >= 0 && i_79_ < anInt6393 * 24567321)
						method6443(i_78_, i_79_, i_75_);
				}
			}
		}
	}

	void method6443(int i, int i_80_, int i_81_) {
		Class6 class6 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		((Class38) ((Class6) class6).aClass38_94).anInt402 = 0;
		if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null)
			method6449(i, i_80_, ((Class6) class6).aBoolean91, class6, ((Class6) class6).aClass38_94, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122, ((Class6) class6).aFloatArray125, ((Class6) class6).aFloatArray126, ((Class6) class6).aFloatArray127, i_81_);
		else if (((Class_xa_Sub3) this).aClass31ArrayArray8839 != null)
			method6444(i, i_80_, ((Class6) class6).aClass38_94, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122, ((Class6) class6).aFloatArray125, ((Class6) class6).aFloatArray126, ((Class6) class6).aFloatArray127, i_81_);
		else if (((Class_xa_Sub3) this).aClass42ArrayArray8843 != null)
			method6445(i, i_80_, ((Class6) class6).aBoolean91, class6, ((Class6) class6).aClass38_94, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122, ((Class6) class6).aFloatArray125, ((Class6) class6).aFloatArray126, ((Class6) class6).aFloatArray127, i_81_);
	}

	void method6444(int i, int i_82_, Class38 class38, float[] fs, float[] fs_83_, float[] fs_84_, float[] fs_85_, float[] fs_86_, int i_87_) {
		Class31 class31 = ((Class_xa_Sub3) this).aClass31ArrayArray8839[i][i_82_];
		if (class31 != null) {
			if ((((Class31) class31).aByte355 & 0x2) == 0) {
				if (i_87_ != 0) {
					if ((((Class31) class31).aByte355 & 0x4) != 0) {
						if ((i_87_ & 0x1) != 0)
							return;
					} else if ((i_87_ & 0x2) != 0)
						return;
				}
				int i_88_ = i * (anInt6395 * 550173571);
				int i_89_ = i_88_ + anInt6395 * 550173571;
				int i_90_ = i_82_ * (anInt6395 * 550173571);
				int i_91_ = i_90_ + anInt6395 * 550173571;
				float f;
				float f_92_;
				float f_93_;
				float f_94_;
				float f_95_;
				float f_96_;
				float f_97_;
				float f_98_;
				float f_99_;
				float f_100_;
				float f_101_;
				float f_102_;
				float f_103_;
				float f_104_;
				float f_105_;
				float f_106_;
				if ((((Class31) class31).aByte355 & 0x1) != 0) {
					int i_107_ = anIntArrayArray6394[i][i_82_];
					float f_108_ = ((Class_xa_Sub3) this).aFloat8850 * (float) i_107_;
					float f_109_ = ((Class_xa_Sub3) this).aFloat8864 * (float) i_107_;
					float f_110_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_88_ + f_108_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_90_)));
					f = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_88_ + f_109_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_90_)));
					if (f_110_ < -f)
						return;
					float f_111_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_89_ + f_108_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_90_)));
					f_92_ = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_89_ + f_109_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_90_)));
					if (f_111_ < -f_92_)
						return;
					float f_112_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_89_ + f_108_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_91_)));
					f_93_ = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_89_ + f_109_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_91_)));
					if (f_112_ < -f_93_)
						return;
					float f_113_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_88_ + f_108_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_91_)));
					f_94_ = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_88_ + f_109_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_91_)));
					if (f_113_ < -f_94_)
						return;
					float f_114_ = ((Class_xa_Sub3) this).aFloat8861 * (float) i_107_;
					float f_115_ = ((Class_xa_Sub3) this).aFloat8849 * (float) i_107_;
					float f_116_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_88_ + f_114_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_90_)));
					f_95_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_116_ / f);
					float f_117_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_88_ + f_115_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_90_)));
					f_96_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_117_ / f);
					f_97_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_110_ / f);
					float f_118_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_89_ + f_114_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_90_)));
					f_98_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_118_ / f_92_);
					float f_119_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_89_ + f_115_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_90_)));
					f_99_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_119_ / f_92_);
					f_100_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_111_ / f_92_);
					float f_120_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_89_ + f_114_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_91_)));
					f_101_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_120_ / f_93_);
					float f_121_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_89_ + f_115_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_91_)));
					f_102_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_121_ / f_93_);
					f_103_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_112_ / f_93_);
					float f_122_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_88_ + f_114_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_91_)));
					f_104_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_122_ / f_94_);
					float f_123_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_88_ + f_115_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_91_)));
					f_105_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_123_ / f_94_);
					f_106_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_113_ / f_94_);
				} else {
					int i_124_ = anIntArrayArray6394[i][i_82_];
					int i_125_ = anIntArrayArray6394[i + 1][i_82_];
					int i_126_ = anIntArrayArray6394[i + 1][i_82_ + 1];
					int i_127_ = anIntArrayArray6394[i][i_82_ + 1];
					float f_128_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8850 * (float) i_124_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_90_)));
					f = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8864 * (float) i_124_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_90_)));
					if (f_128_ < -f)
						return;
					float f_129_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8850 * (float) i_125_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_90_)));
					f_92_ = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8864 * (float) i_125_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_90_)));
					if (f_129_ < -f_92_)
						return;
					float f_130_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8850 * (float) i_126_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_91_)));
					f_93_ = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8864 * (float) i_126_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_91_)));
					if (f_130_ < -f_93_)
						return;
					float f_131_ = (((Class_xa_Sub3) this).aFloat8857 + (((Class_xa_Sub3) this).aFloat8836 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8850 * (float) i_127_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_91_)));
					f_94_ = (((Class_xa_Sub3) this).aFloat8859 + (((Class_xa_Sub3) this).aFloat8846 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8864 * (float) i_127_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_91_)));
					if (f_131_ < -f_94_)
						return;
					float f_132_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8861 * (float) i_124_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_90_)));
					f_95_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_132_ / f);
					float f_133_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8849 * (float) i_124_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_90_)));
					f_96_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_133_ / f);
					f_97_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_128_ / f);
					float f_134_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8861 * (float) i_125_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_90_)));
					f_98_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_134_ / f_92_);
					float f_135_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8849 * (float) i_125_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_90_)));
					f_99_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_135_ / f_92_);
					f_100_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_129_ / f_92_);
					float f_136_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8861 * (float) i_126_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_91_)));
					f_101_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_136_ / f_93_);
					float f_137_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_89_ + (((Class_xa_Sub3) this).aFloat8849 * (float) i_126_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_91_)));
					f_102_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_137_ / f_93_);
					f_103_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_130_ / f_93_);
					float f_138_ = (((Class_xa_Sub3) this).aFloat8863 + (((Class_xa_Sub3) this).aFloat8844 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8861 * (float) i_127_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_91_)));
					f_104_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_138_ / f_94_);
					float f_139_ = (((Class_xa_Sub3) this).aFloat8847 + (((Class_xa_Sub3) this).aFloat8845 * (float) i_88_ + (((Class_xa_Sub3) this).aFloat8849 * (float) i_127_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_91_)));
					f_105_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_139_ / f_94_);
					f_106_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_131_ / f_94_);
				}
				if (((f_101_ - f_104_) * (f_99_ - f_105_) - (f_102_ - f_105_) * (f_98_ - f_104_)) > 0.0F) {
					((Class38) class38).aBoolean387 = (f_101_ < 0.0F || f_104_ < 0.0F || f_98_ < 0.0F || f_101_ > (float) ((Class38) class38).anInt396 || f_104_ > (float) ((Class38) class38).anInt396 || f_98_ > (float) ((Class38) class38).anInt396);
					if (((Class31) class31).aShort358 >= 0)
						class38.method541(true, true, false, f_102_, f_105_, f_99_, f_101_, f_104_, f_98_, f_103_, f_106_, f_100_, f_93_, f_94_, f_92_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | (Console.anIntArray4263[(((Class31) class31).aShort352 & 0xffff)]) & 0xffffff, ~0xffffff | (Console.anIntArray4263[(((Class31) class31).aShort356 & 0xffff)]) & 0xffffff, ~0xffffff | (Console.anIntArray4263[(((Class31) class31).aShort354 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class31) class31).aShort358);
					else
						class38.method544(true, true, false, f_102_, f_105_, f_99_, f_101_, f_104_, f_98_, f_103_, f_106_, f_100_, (float) (((Class31) class31).aShort352 & 0xffff), (float) (((Class31) class31).aShort356 & 0xffff), (float) (((Class31) class31).aShort354 & 0xffff));
				}
				if (((f_95_ - f_98_) * (f_105_ - f_99_) - (f_96_ - f_99_) * (f_104_ - f_98_)) > 0.0F) {
					((Class38) class38).aBoolean387 = (f_95_ < 0.0F || f_98_ < 0.0F || f_104_ < 0.0F || f_95_ > (float) ((Class38) class38).anInt396 || f_98_ > (float) ((Class38) class38).anInt396 || f_104_ > (float) ((Class38) class38).anInt396);
					if (((Class31) class31).aShort358 >= 0)
						class38.method541(true, true, false, f_96_, f_99_, f_105_, f_95_, f_98_, f_104_, f_97_, f_100_, f_106_, f, f_92_, f_94_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | (Console.anIntArray4263[(((Class31) class31).aShort353 & 0xffff)]) & 0xffffff, ~0xffffff | (Console.anIntArray4263[(((Class31) class31).aShort354 & 0xffff)]) & 0xffffff, ~0xffffff | (Console.anIntArray4263[(((Class31) class31).aShort356 & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class31) class31).aShort358);
					else
						class38.method544(true, true, false, f_96_, f_99_, f_105_, f_95_, f_98_, f_104_, f_97_, f_100_, f_106_, (float) (((Class31) class31).aShort353 & 0xffff), (float) (((Class31) class31).aShort354 & 0xffff), (float) (((Class31) class31).aShort356 & 0xffff));
				}
			}
		} else {
			Class17 class17 = ((Class_xa_Sub3) this).aClass17ArrayArray8840[i][i_82_];
			if (class17 != null) {
				if (i_87_ != 0) {
					if ((((Class17) class17).aByte216 & 0x4) != 0) {
						if ((i_87_ & 0x1) != 0)
							return;
					} else if ((i_87_ & 0x2) != 0)
						return;
				}
				for (int i_140_ = 0; i_140_ < ((Class17) class17).aShort217; i_140_++) {
					int i_141_ = (((Class17) class17).aShortArray227[i_140_] + (i << anInt6396 * -1066304221));
					short i_142_ = ((Class17) class17).aShortArray218[i_140_];
					int i_143_ = (((Class17) class17).aShortArray221[i_140_] + (i_82_ << anInt6396 * -1066304221));
					float f = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_141_) + (((Class_xa_Sub3) this).aFloat8850 * (float) i_142_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_143_)));
					float f_144_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_141_) + (((Class_xa_Sub3) this).aFloat8864 * (float) i_142_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_143_)));
					if (f < -f_144_)
						return;
					float f_145_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_141_) + (((Class_xa_Sub3) this).aFloat8861 * (float) i_142_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_143_)));
					float f_146_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_141_) + (((Class_xa_Sub3) this).aFloat8849 * (float) i_142_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_143_)));
					fs[i_140_] = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_145_ / f_144_);
					fs_83_[i_140_] = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_146_ / f_144_);
					fs_84_[i_140_] = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f / f_144_);
					fs_85_[i_140_] = f_144_;
				}
				if (((Class17) class17).aShortArray226 != null) {
					for (int i_147_ = 0; i_147_ < ((Class17) class17).aShort220; i_147_++) {
						short i_148_ = ((Class17) class17).aShortArray223[i_147_];
						short i_149_ = ((Class17) class17).aShortArray224[i_147_];
						short i_150_ = ((Class17) class17).aShortArray225[i_147_];
						float f = fs[i_148_];
						float f_151_ = fs[i_149_];
						float f_152_ = fs[i_150_];
						float f_153_ = fs_83_[i_148_];
						float f_154_ = fs_83_[i_149_];
						float f_155_ = fs_83_[i_150_];
						if (((f - f_151_) * (f_155_ - f_154_) - (f_153_ - f_154_) * (f_152_ - f_151_)) > 0.0F) {
							((Class38) class38).aBoolean387 = (f < 0.0F || f_151_ < 0.0F || f_152_ < 0.0F || f > (float) ((Class38) class38).anInt396 || (f_151_ > (float) ((Class38) class38).anInt396) || f_152_ > (float) (((Class38) class38).anInt396));
							short i_156_ = ((Class17) class17).aShortArray226[i_147_];
							if (i_156_ != -1)
								class38.method541(true, true, false, f_153_, f_154_, f_155_, f, f_151_, f_152_, fs_84_[i_148_], fs_84_[i_149_], fs_84_[i_150_], fs_85_[i_148_], fs_85_[i_149_], fs_85_[i_150_], ((float) (((Class17) class17).aShortArray227[i_148_]) / (float) (anInt6395 * 550173571)), ((float) (((Class17) class17).aShortArray227[i_149_]) / (float) (anInt6395 * 550173571)), ((float) (((Class17) class17).aShortArray227[i_150_]) / (float) (anInt6395 * 550173571)), ((float) (((Class17) class17).aShortArray221[i_148_]) / (float) (anInt6395 * 550173571)), ((float) (((Class17) class17).aShortArray221[i_149_]) / (float) (anInt6395 * 550173571)), ((float) (((Class17) class17).aShortArray221[i_150_]) / (float) (anInt6395 * 550173571)), ~0xffffff | (Console.anIntArray4263[((((Class17) class17).aShortArray222[i_148_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Console.anIntArray4263[((((Class17) class17).aShortArray222[i_149_]) & 0xffff)]) & 0xffffff, ~0xffffff | (Console.anIntArray4263[((((Class17) class17).aShortArray222[i_150_]) & 0xffff)]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F, i_156_);
							else {
								int i_157_ = (((Class17) class17).anIntArray228[i_147_]);
								if (i_157_ != -1)
									class38.method544(true, true, false, f_153_, f_154_, f_155_, f, f_151_, f_152_, fs_84_[i_148_], fs_84_[i_149_], fs_84_[i_150_], (float) (Class330_Sub26_Sub1.method3395(i_157_, (((Class17) class17).aShortArray222[i_148_]), -1614100959)), (float) (Class330_Sub26_Sub1.method3395(i_157_, (((Class17) class17).aShortArray222[i_149_]), -499171606)), (float) (Class330_Sub26_Sub1.method3395(i_157_, (((Class17) class17).aShortArray222[i_150_]), -1536577299)));
							}
						}
					}
				} else {
					for (int i_158_ = 0; i_158_ < ((Class17) class17).aShort220; i_158_++) {
						short i_159_ = ((Class17) class17).aShortArray223[i_158_];
						short i_160_ = ((Class17) class17).aShortArray224[i_158_];
						short i_161_ = ((Class17) class17).aShortArray225[i_158_];
						float f = fs[i_159_];
						float f_162_ = fs[i_160_];
						float f_163_ = fs[i_161_];
						float f_164_ = fs_83_[i_159_];
						float f_165_ = fs_83_[i_160_];
						float f_166_ = fs_83_[i_161_];
						if (((f - f_162_) * (f_166_ - f_165_) - (f_164_ - f_165_) * (f_163_ - f_162_)) > 0.0F) {
							int i_167_ = ((Class17) class17).anIntArray228[i_158_];
							if (i_167_ != -1) {
								((Class38) class38).aBoolean387 = (f < 0.0F || f_162_ < 0.0F || f_163_ < 0.0F || f > (float) (((Class38) class38).anInt396) || f_162_ > (float) (((Class38) class38).anInt396) || f_163_ > (float) (((Class38) class38).anInt396));
								class38.method544(true, true, false, f_164_, f_165_, f_166_, f, f_162_, f_163_, fs_84_[i_159_], fs_84_[i_160_], fs_84_[i_161_], (float) (Class330_Sub26_Sub1.method3395(i_167_, (((Class17) class17).aShortArray222[i_159_]), -924777541)), (float) (Class330_Sub26_Sub1.method3395(i_167_, (((Class17) class17).aShortArray222[i_160_]), -1482298670)), (float) (Class330_Sub26_Sub1.method3395(i_167_, (((Class17) class17).aShortArray222[i_161_]), -603231994)));
							}
						}
					}
				}
			}
		}
	}

	public void NA(Class_na class_na, int i, int i_168_, int i_169_, int i_170_, boolean bool) {
		/* empty */
	}

	void method6445(int i, int i_171_, boolean bool, Class6 class6, Class38 class38, float[] fs, float[] fs_172_, float[] fs_173_, float[] fs_174_, float[] fs_175_, int i_176_) {
		Class42 class42 = ((Class_xa_Sub3) this).aClass42ArrayArray8843[i][i_171_];
		if (i_176_ == 0 || (i_176_ & 0x2) == 0) {
			if (class42 != null) {
				for (int i_177_ = 0; i_177_ < ((Class42) class42).aShort433; i_177_++) {
					int i_178_ = (((Class42) class42).aShortArray432[i_177_] + (i << anInt6396 * -1066304221));
					int i_179_ = ((Class42) class42).aShortArray431[i_177_];
					int i_180_ = (((Class42) class42).aShortArray434[i_177_] + (i_171_ << anInt6396 * -1066304221));
					float f = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_178_) + (((Class_xa_Sub3) this).aFloat8850 * (float) i_179_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_180_)));
					float f_181_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_178_) + (((Class_xa_Sub3) this).aFloat8864 * (float) i_179_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_180_)));
					if (f < -f_181_)
						return;
					fs_175_[i_177_] = 0.0F;
					if (bool) {
						float f_182_ = f - ((Class6) class6).aFloat87;
						if (f_182_ > 0.0F) {
							f_182_ /= ((Class6) class6).aFloat104;
							if (f_182_ > 1.0F)
								f_182_ = 1.0F;
							fs_175_[i_177_] = f_182_;
							int i_183_ = (int) ((float) (((Class42) class42).aShortArray440[i_177_]) * f_182_);
							if (i_183_ > 0)
								i_179_ -= i_183_;
						}
					} else if (((Class6) class6).aBoolean86) {
						float f_184_ = f - ((Class6) class6).aFloat87;
						if (f_184_ > 0.0F) {
							fs_175_[i_177_] = f_184_ / ((Class6) class6).aFloat104;
							if (fs_175_[i_177_] > 1.0F)
								fs_175_[i_177_] = 1.0F;
						}
					}
					float f_185_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_178_) + (((Class_xa_Sub3) this).aFloat8861 * (float) i_179_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_180_)));
					float f_186_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_178_) + (((Class_xa_Sub3) this).aFloat8849 * (float) i_179_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_180_)));
					fs[i_177_] = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_185_ / f_181_);
					fs_172_[i_177_] = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_186_ / f_181_);
					fs_173_[i_177_] = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f / f_181_);
					fs_174_[i_177_] = f_181_;
				}
				float f = (float) (anInt6395 * 550173571);
				for (int i_187_ = 0; i_187_ < ((Class42) class42).aShort430; i_187_++) {
					int i_188_ = i_187_ * 3;
					int i_189_ = i_188_ + 1;
					int i_190_ = i_189_ + 1;
					float f_191_ = fs[i_188_];
					float f_192_ = fs[i_189_];
					float f_193_ = fs[i_190_];
					float f_194_ = fs_172_[i_188_];
					float f_195_ = fs_172_[i_189_];
					float f_196_ = fs_172_[i_190_];
					if (((f_191_ - f_192_) * (f_196_ - f_195_) - (f_194_ - f_195_) * (f_193_ - f_192_)) > 0.0F) {
						((Class38) class38).aBoolean387 = (f_191_ < 0.0F || f_192_ < 0.0F || f_193_ < 0.0F || f_191_ > (float) ((Class38) class38).anInt396 || f_192_ > (float) ((Class38) class38).anInt396 || (f_193_ > (float) ((Class38) class38).anInt396));
						if (fs_175_[i_188_] + fs_175_[i_189_] + fs_175_[i_190_] < 3.0F) {
							int i_197_ = i << anInt6396 * -1066304221;
							int i_198_ = i_171_ << anInt6396 * -1066304221;
							if ((((Class42) class42).anIntArray438[i_188_] & 0xffffff) != 0) {
								if ((((Class42) class42).aShortArray436[i_188_] == (((Class42) class42).aShortArray436[i_189_])) && ((((Class42) class42).aShortArray436[i_188_]) == (((Class42) class42).aShortArray436[i_190_])) && ((((Class42) class42).aShortArray437[i_188_]) == (((Class42) class42).aShortArray437[i_189_])) && ((((Class42) class42).aShortArray437[i_188_]) == (((Class42) class42).aShortArray437[i_190_])))
									class38.method541(true, true, false, f_194_, f_195_, f_196_, f_191_, f_192_, f_193_, fs_173_[i_188_], fs_173_[i_189_], fs_173_[i_190_], fs_174_[i_188_], fs_174_[i_189_], fs_174_[i_190_], ((float) (i_197_ + (((Class42) class42).aShortArray432[i_188_])) / (float) (((Class42) class42).aShortArray437[i_188_])), ((float) (i_197_ + (((Class42) class42).aShortArray432[i_189_])) / (float) (((Class42) class42).aShortArray437[i_189_])), ((float) (i_197_ + (((Class42) class42).aShortArray432[i_190_])) / (float) (((Class42) class42).aShortArray437[i_190_])), ((float) (i_198_ + (((Class42) class42).aShortArray434[i_188_])) / (float) (((Class42) class42).aShortArray437[i_188_])), ((float) (i_198_ + (((Class42) class42).aShortArray434[i_189_])) / (float) (((Class42) class42).aShortArray437[i_189_])), ((float) (i_198_ + (((Class42) class42).aShortArray434[i_190_])) / (float) (((Class42) class42).aShortArray437[i_190_])), (((Class42) class42).anIntArray438[i_188_]), (((Class42) class42).anIntArray438[i_189_]), (((Class42) class42).anIntArray438[i_190_]), ((Class6) class6).anInt88 * 536502941, fs_175_[i_188_] * 255.0F, fs_175_[i_189_] * 255.0F, fs_175_[i_190_] * 255.0F, (((Class42) class42).aShortArray436[i_188_]));
								else
									class38.method546(true, true, false, f_194_, f_195_, f_196_, f_191_, f_192_, f_193_, fs_173_[i_188_], fs_173_[i_189_], fs_173_[i_190_], fs_174_[i_188_], fs_174_[i_189_], fs_174_[i_190_], (float) (i_197_ + (((Class42) class42).aShortArray432[i_188_])) / f, (float) (i_197_ + (((Class42) class42).aShortArray432[i_189_])) / f, (float) (i_197_ + (((Class42) class42).aShortArray432[i_190_])) / f, (float) (i_198_ + (((Class42) class42).aShortArray434[i_188_])) / f, (float) (i_198_ + (((Class42) class42).aShortArray434[i_189_])) / f, (float) (i_198_ + (((Class42) class42).aShortArray434[i_190_])) / f, (((Class42) class42).anIntArray438[i_188_]), (((Class42) class42).anIntArray438[i_189_]), (((Class42) class42).anIntArray438[i_190_]), ((Class6) class6).anInt88 * 536502941, fs_175_[i_188_] * 255.0F, fs_175_[i_189_] * 255.0F, fs_175_[i_190_] * 255.0F, (((Class42) class42).aShortArray436[i_188_]), f / (float) (((Class42) class42).aShortArray437[i_188_]), (((Class42) class42).aShortArray436[i_189_]), f / (float) (((Class42) class42).aShortArray437[i_189_]), (((Class42) class42).aShortArray436[i_190_]), f / (float) (((Class42) class42).aShortArray437[i_190_]));
							}
						} else
							class38.method539(true, true, false, f_194_, f_195_, f_196_, f_191_, f_192_, f_193_, fs_173_[i_188_], fs_173_[i_189_], fs_173_[i_190_], (((Class6) class6).anInt88 * 536502941));
					}
				}
			}
		}
	}

	public Class_na w(int i, int i_199_, Class_na class_na) {
		return null;
	}

	public void method6415(int i, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, boolean[][] bools) {
		Class6 class6 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		Class38 class38 = ((Class6) class6).aClass38_94;
		((Class38) class38).anInt402 = 0;
		((Class38) class38).aBoolean387 = true;
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5197();
		if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null || ((Class_xa_Sub3) this).aClass42ArrayArray8843 != null)
			method6448(i, i_200_, i_201_, i_202_, i_203_, i_204_, i_205_, bools, class6, class38, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122);
		else if (((Class_xa_Sub3) this).aClass31ArrayArray8839 != null)
			method6446(i, i_200_, i_201_, i_202_, i_203_, i_204_, i_205_, bools, class6, class38, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122);
	}

	public void ai(Class_na class_na, int i, int i_206_, int i_207_, int i_208_, boolean bool) {
		/* empty */
	}

	public void ay(Class_na class_na, int i, int i_209_, int i_210_, int i_211_, boolean bool) {
		/* empty */
	}

	public boolean method6424(Class_na class_na, int i, int i_212_, int i_213_, int i_214_, boolean bool) {
		return false;
	}

	public boolean method6418(Class_na class_na, int i, int i_215_, int i_216_, int i_217_, boolean bool) {
		return false;
	}

	public void method6429(Class330_Sub14 class330_sub14, int[] is) {
		/* empty */
	}

	public void method6420(Class330_Sub14 class330_sub14, int[] is) {
		/* empty */
	}

	public void n(int i, int i_218_, int i_219_) {
		if (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_218_] < i_219_)
			((Class_xa_Sub3) this).aByteArrayArray8858[i][i_218_] = (byte) i_219_;
	}

	public void l(int i, int i_220_, int i_221_) {
		if (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_220_] < i_221_)
			((Class_xa_Sub3) this).aByteArrayArray8858[i][i_220_] = (byte) i_221_;
	}

	public void b(int i, int i_222_, int i_223_) {
		if (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_222_] < i_223_)
			((Class_xa_Sub3) this).aByteArrayArray8858[i][i_222_] = (byte) i_223_;
	}

	public void method6414(int i, int i_224_, int[] is, int[] is_225_, int[] is_226_, int[] is_227_, int[] is_228_, int[] is_229_, int[] is_230_, int[] is_231_, int[] is_232_, int[] is_233_, int[] is_234_, Class77 class77, boolean bool) {
		if (((Class_xa_Sub3) this).aClass31ArrayArray8839 == null) {
			((Class_xa_Sub3) this).aClass31ArrayArray8839 = new Class31[anInt6397 * 1972554729][anInt6393 * 24567321];
			((Class_xa_Sub3) this).aClass17ArrayArray8840 = new Class17[anInt6397 * 1972554729][anInt6393 * 24567321];
		} else if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null || ((Class_xa_Sub3) this).aClass42ArrayArray8843 != null)
			throw new IllegalStateException();
		boolean bool_235_ = false;
		if (is_231_.length == 2 && is_228_.length == 2 && (is_231_[0] == is_231_[1] || is_233_[0] != -1 && is_233_[0] == is_233_[1])) {
			bool_235_ = true;
			for (int i_236_ = 1; i_236_ < 2; i_236_++) {
				int i_237_ = is[is_228_[i_236_]];
				int i_238_ = is_226_[is_228_[i_236_]];
				if (i_237_ != 0 && i_237_ != anInt6395 * 550173571 || i_238_ != 0 && i_238_ != anInt6395 * 550173571) {
					bool_235_ = false;
					break;
				}
			}
		}
		if (!bool_235_) {
			Class17 class17 = new Class17();
			short i_239_ = (short) is.length;
			int i_240_ = (short) is_231_.length;
			((Class17) class17).aShort217 = i_239_;
			((Class17) class17).aShortArray222 = new short[i_239_];
			((Class17) class17).aShortArray227 = new short[i_239_];
			((Class17) class17).aShortArray218 = new short[i_239_];
			((Class17) class17).aShortArray221 = new short[i_239_];
			for (int i_241_ = 0; i_241_ < i_239_; i_241_++) {
				int i_242_ = is[i_241_];
				int i_243_ = is_226_[i_241_];
				if (i_242_ == 0 && i_243_ == 0)
					((Class17) class17).aShortArray222[i_241_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_]));
				else if (i_242_ == 0 && i_243_ == anInt6395 * 550173571)
					((Class17) class17).aShortArray222[i_241_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_ + 1]));
				else if (i_242_ == anInt6395 * 550173571 && i_243_ == anInt6395 * 550173571)
					((Class17) class17).aShortArray222[i_241_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_ + 1]));
				else if (i_242_ == anInt6395 * 550173571 && i_243_ == 0)
					((Class17) class17).aShortArray222[i_241_] = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_]));
				else {
					int i_244_ = (((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_])) * (anInt6395 * 550173571 - i_242_) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_])) * i_242_);
					int i_245_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_ + 1])) * (anInt6395 * 550173571 - i_242_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_ + 1])) * i_242_);
					((Class17) class17).aShortArray222[i_241_] = (short) ((i_244_ * (anInt6395 * 550173571 - i_243_) + i_245_ * i_243_) >> anInt6396 * -2132608442);
				}
				int i_246_ = (i << anInt6396 * -1066304221) + i_242_;
				int i_247_ = (i_224_ << anInt6396 * -1066304221) + i_243_;
				((Class17) class17).aShortArray227[i_241_] = (short) i_242_;
				((Class17) class17).aShortArray221[i_241_] = (short) i_243_;
				((Class17) class17).aShortArray218[i_241_] = (short) (method6416(i_246_, i_247_, 1243910374) + (is_225_ != null ? is_225_[i_241_] : 0));
				if (((Class17) class17).aShortArray222[i_241_] < 2)
					((Class17) class17).aShortArray222[i_241_] = (short) 2;
			}
			boolean bool_248_ = false;
			int i_249_ = 0;
			for (int i_250_ = 0; i_250_ < i_240_; i_250_++) {
				if (is_231_[i_250_] >= 0 || is_232_ != null && is_232_[i_250_] >= 0)
					i_249_++;
				int i_251_ = is_233_[i_250_];
				if (i_251_ != -1) {
					Class56 class56 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_251_, 1138989349);
					if (!class56.aBoolean533) {
						bool_248_ = true;
						if (method6447(class56.aByte525) || class56.aByte531 != 0 || class56.aByte530 != 0)
							((Class17) class17).aByte216 |= 0x4;
					}
				}
			}
			((Class17) class17).anIntArray228 = new int[i_249_];
			if (is_232_ != null)
				((Class17) class17).anIntArray229 = new int[i_249_];
			((Class17) class17).aShortArray223 = new short[i_249_];
			((Class17) class17).aShortArray224 = new short[i_249_];
			((Class17) class17).aShortArray225 = new short[i_249_];
			if (bool_248_) {
				((Class17) class17).aShortArray226 = new short[i_249_];
				((Class17) class17).aShortArray219 = new short[i_249_];
			}
			for (int i_252_ = 0; i_252_ < i_240_; i_252_++) {
				if (is_231_[i_252_] >= 0 || is_232_ != null && is_232_[i_252_] >= 0) {
					if (is_231_[i_252_] >= 0)
						((Class17) class17).anIntArray228[(((Class17) class17).aShort220)] = Class356.modifyColor(is_231_[i_252_], (byte) 1);
					else
						((Class17) class17).anIntArray228[(((Class17) class17).aShort220)] = -1;
					if (is_232_ != null) {
						if (is_232_[i_252_] != -1)
							((Class17) class17).anIntArray229[((Class17) class17).aShort220] = Class356.modifyColor(is_232_[i_252_], (byte) 1);
						else
							((Class17) class17).anIntArray229[((Class17) class17).aShort220] = -1;
					}
					((Class17) class17).aShortArray223[(((Class17) class17).aShort220)] = (short) is_228_[i_252_];
					((Class17) class17).aShortArray224[(((Class17) class17).aShort220)] = (short) is_229_[i_252_];
					((Class17) class17).aShortArray225[(((Class17) class17).aShort220)] = (short) is_230_[i_252_];
					if (bool_248_) {
						if (is_233_[i_252_] != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_233_[i_252_], -1175095151).aBoolean533)) {
							((Class17) class17).aShortArray226[((Class17) class17).aShort220] = (short) is_233_[i_252_];
							((Class17) class17).aShortArray219[((Class17) class17).aShort220] = (short) is_234_[i_252_];
						} else
							((Class17) class17).aShortArray226[((Class17) class17).aShort220] = (short) -1;
					}
					((Class17) class17).aShort220++;
				}
			}
			((Class_xa_Sub3) this).aClass17ArrayArray8840[i][i_224_] = class17;
		} else if (is_231_[0] >= 0 || is_232_ != null && is_232_[0] >= 0) {
			Class31 class31 = new Class31();
			int i_253_ = is_231_[0];
			int i_254_ = is_233_[0];
			if (is_232_ != null) {
				((Class31) class31).anInt357 = (Class330_Sub26_Sub1.method3395(Class356.modifyColor(is_232_[0], (byte) 1), (((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_] - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_])), -1233293600));
				if (i_253_ == -1)
					((Class31) class31).aByte355 |= 0x2;
			}
			if ((anIntArrayArray6394[i][i_224_] == anIntArrayArray6394[i + 1][i_224_]) && (anIntArrayArray6394[i][i_224_] == anIntArrayArray6394[i + 1][i_224_ + 1]) && (anIntArrayArray6394[i][i_224_] == anIntArrayArray6394[i][i_224_ + 1]))
				((Class31) class31).aByte355 |= 0x1;
			Class56 class56 = null;
			if (i_254_ != -1)
				class56 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_254_, 682812971);
			if (class56 != null && (((Class31) class31).aByte355 & 0x2) == 0 && !class56.aBoolean533) {
				((Class31) class31).aShort353 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_]));
				((Class31) class31).aShort354 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_]));
				((Class31) class31).aShort352 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_ + 1]));
				((Class31) class31).aShort356 = (short) ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_ + 1]));
				((Class31) class31).aShort358 = (short) i_254_;
				if (method6447(class56.aByte525) || class56.aByte531 != 0 || class56.aByte530 != 0)
					((Class31) class31).aByte355 |= 0x4;
			} else {
				short i_255_ = Class356.modifyColor(i_253_, (byte) 1);
				((Class31) class31).aShort353 = (short) (Class330_Sub26_Sub1.method3395(i_255_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_])), -970386991));
				((Class31) class31).aShort354 = (short) (Class330_Sub26_Sub1.method3395(i_255_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_])), -539895228));
				((Class31) class31).aShort352 = (short) (Class330_Sub26_Sub1.method3395(i_255_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_224_ + 1])), -449633141));
				((Class31) class31).aShort356 = (short) (Class330_Sub26_Sub1.method3395(i_255_, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_224_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_224_ + 1])), -1839105251));
				((Class31) class31).aShort358 = (short) -1;
			}
			((Class_xa_Sub3) this).aClass31ArrayArray8839[i][i_224_] = class31;
		}
	}

	public void UA(Class_na class_na, int i, int i_256_, int i_257_, int i_258_, boolean bool) {
		/* empty */
	}

	public void method6422(int i, int i_259_, int[] is, int[] is_260_, int[] is_261_, int[] is_262_, int[] is_263_, int[] is_264_, int[] is_265_, int[] is_266_, Class77 class77, boolean bool) {
		boolean bool_267_ = (((Class_xa_Sub3) this).anInt8838 & 0x20) == 0;
		if (((Class_xa_Sub3) this).aClass4ArrayArray8832 == null && !bool_267_) {
			((Class_xa_Sub3) this).aClass4ArrayArray8832 = new Class4[anInt6397 * 1972554729][anInt6393 * 24567321];
			((Class_xa_Sub3) this).aClass14ArrayArray8842 = new Class14[anInt6397 * 1972554729][anInt6393 * 24567321];
		} else if (((Class_xa_Sub3) this).aClass42ArrayArray8843 == null && bool_267_)
			((Class_xa_Sub3) this).aClass42ArrayArray8843 = new Class42[anInt6397 * 1972554729][anInt6393 * 24567321];
		else if (((Class_xa_Sub3) this).aClass31ArrayArray8839 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_268_ = 0; i_268_ < is_263_.length; i_268_++) {
				if (is_263_[i_268_] == -1)
					is_263_[i_268_] = 0;
				else
					is_263_[i_268_] = (Console.anIntArray4263[(Class356.modifyColor(is_263_[i_268_], (byte) 1) & 0xffff)]) << 8 | 0xff;
			}
			if (is_264_ != null) {
				for (int i_269_ = 0; i_269_ < is_264_.length; i_269_++) {
					if (is_264_[i_269_] == -1)
						is_264_[i_269_] = 0;
					else
						is_264_[i_269_] = (Console.anIntArray4263[(Class356.modifyColor(is_264_[i_269_], (byte) 1) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_267_) {
				Class42 class42 = new Class42();
				((Class42) class42).aShort433 = (short) is.length;
				((Class42) class42).aShort430 = (short) (is.length / 3);
				((Class42) class42).aShortArray432 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray431 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray434 = new short[((Class42) class42).aShort433];
				((Class42) class42).anIntArray438 = new int[((Class42) class42).aShort433];
				((Class42) class42).aShortArray436 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray437 = new short[((Class42) class42).aShort433];
				((Class42) class42).aByteArray439 = new byte[((Class42) class42).aShort433];
				if (is_262_ != null)
					((Class42) class42).aShortArray440 = new short[((Class42) class42).aShort433];
				for (int i_270_ = 0; i_270_ < ((Class42) class42).aShort433; i_270_++) {
					int i_271_ = is[i_270_];
					int i_272_ = is_261_[i_270_];
					boolean bool_273_ = false;
					int i_274_;
					if (i_271_ == 0 && i_272_ == 0)
						i_274_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_]));
					else if (i_271_ == 0 && i_272_ == anInt6395 * 550173571)
						i_274_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_ + 1]));
					else if (i_271_ == anInt6395 * 550173571 && i_272_ == anInt6395 * 550173571)
						i_274_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1]));
					else if (i_271_ == anInt6395 * 550173571 && i_272_ == 0)
						i_274_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_]));
					else {
						int i_275_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_])) * (anInt6395 * 550173571 - i_271_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_])) * i_271_);
						int i_276_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_ + 1])) * (anInt6395 * 550173571 - i_271_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1])) * i_271_);
						i_274_ = (i_275_ * (anInt6395 * 550173571 - i_272_) + i_276_ * i_272_) >> anInt6396 * -2132608442;
					}
					int i_277_ = (i << anInt6396 * -1066304221) + i_271_;
					int i_278_ = (i_259_ << anInt6396 * -1066304221) + i_272_;
					((Class42) class42).aShortArray432[i_270_] = (short) i_271_;
					((Class42) class42).aShortArray434[i_270_] = (short) i_272_;
					((Class42) class42).aShortArray431[i_270_] = (short) (method6416(i_277_, i_278_, -860909987) + (is_260_ != null ? is_260_[i_270_] : 0));
					if (i_274_ < 0)
						i_274_ = 0;
					if (is_263_[i_270_] == 0) {
						((Class42) class42).anIntArray438[i_270_] = 0;
						if (is_264_ != null)
							((Class42) class42).aByteArray439[i_270_] = (byte) i_274_;
					} else {
						int i_279_ = 0;
						if (is_262_ != null) {
							int i_280_ = (((Class42) class42).aShortArray440[i_270_] = (short) is_262_[i_270_]);
							if (class77.anInt650 * -348036733 != 0) {
								i_279_ = 255 * i_280_ / (class77.anInt650 * -348036733);
								if (i_279_ < 0)
									i_279_ = 0;
								else if (i_279_ > 255)
									i_279_ = 255;
							}
						}
						int i_281_ = -16777216;
						if (is_265_[i_270_] != -1 && method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_265_[i_270_], 2099636472).aByte525))
							i_281_ = -1694498816;
						((Class42) class42).anIntArray438[i_270_] = i_281_ | (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_270_] >> 8, i_274_), class77.anInt652 * -576105833, i_279_, (byte) 24));
						if (is_264_ != null)
							((Class42) class42).aByteArray439[i_270_] = (byte) i_274_;
					}
					((Class42) class42).aShortArray436[i_270_] = (short) is_265_[i_270_];
					((Class42) class42).aShortArray437[i_270_] = (short) is_266_[i_270_];
				}
				if (is_264_ != null)
					((Class42) class42).anIntArray435 = new int[((Class42) class42).aShort430];
				for (int i_282_ = 0; i_282_ < ((Class42) class42).aShort430; i_282_++) {
					int i_283_ = i_282_ * 3;
					if (is_264_ != null && is_264_[i_283_] != 0)
						((Class42) class42).anIntArray435[i_282_] = ~0xffffff | is_264_[i_283_] >> 8;
				}
				((Class_xa_Sub3) this).aClass42ArrayArray8843[i][i_259_] = class42;
			} else {
				boolean bool_284_ = true;
				int i_285_ = -1;
				int i_286_ = -1;
				int i_287_ = -1;
				int i_288_ = -1;
				if (is.length == 6) {
					for (int i_289_ = 0; i_289_ < 6; i_289_++) {
						if (is[i_289_] == 0 && is_261_[i_289_] == 0) {
							if (i_285_ != -1 && is_263_[i_285_] != is_263_[i_289_]) {
								bool_284_ = false;
								break;
							}
							i_285_ = i_289_;
						} else if (is[i_289_] == anInt6395 * 550173571 && is_261_[i_289_] == 0) {
							if (i_286_ != -1 && is_263_[i_286_] != is_263_[i_289_]) {
								bool_284_ = false;
								break;
							}
							i_286_ = i_289_;
						} else if (is[i_289_] == anInt6395 * 550173571 && (is_261_[i_289_] == anInt6395 * 550173571)) {
							if (i_287_ != -1 && is_263_[i_287_] != is_263_[i_289_]) {
								bool_284_ = false;
								break;
							}
							i_287_ = i_289_;
						} else if (is[i_289_] == 0 && (is_261_[i_289_] == anInt6395 * 550173571)) {
							if (i_288_ != -1 && is_263_[i_288_] != is_263_[i_289_]) {
								bool_284_ = false;
								break;
							}
							i_288_ = i_289_;
						}
					}
					if (i_285_ == -1 || i_286_ == -1 || i_287_ == -1 || i_288_ == -1)
						bool_284_ = false;
					if (bool_284_) {
						if (is_260_ != null) {
							for (int i_290_ = 0; i_290_ < 4; i_290_++) {
								if (is_260_[i_290_] != 0) {
									bool_284_ = false;
									break;
								}
							}
						}
						if (bool_284_) {
							for (int i_291_ = 1; i_291_ < 4; i_291_++) {
								if (is[i_291_] != is[0] && (is[i_291_] != is[0] + anInt6395 * 550173571) && (is[i_291_] != is[0] - anInt6395 * 550173571)) {
									bool_284_ = false;
									break;
								}
								if (is_261_[i_291_] != is_261_[0] && (is_261_[i_291_] != is_261_[0] + anInt6395 * 550173571) && (is_261_[i_291_] != (is_261_[0] - anInt6395 * 550173571))) {
									bool_284_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_284_ = false;
				if (bool_284_) {
					Class4 class4 = new Class4();
					int i_292_ = is_263_[0];
					int i_293_ = is_265_[0];
					if (is_264_ != null) {
						((Class4) class4).anInt66 = is_264_[0] >> 8;
						if (i_292_ == 0)
							((Class4) class4).aByte65 |= 0x2;
					} else if (i_292_ == 0)
						return;
					if ((anIntArrayArray6394[i][i_259_] == anIntArrayArray6394[i + 1][i_259_]) && (anIntArrayArray6394[i][i_259_] == anIntArrayArray6394[i + 1][i_259_ + 1]) && (anIntArrayArray6394[i][i_259_] == anIntArrayArray6394[i][i_259_ + 1]))
						((Class4) class4).aByte65 |= 0x1;
					if (i_293_ != -1 && (((Class4) class4).aByte65 & 0x2) == 0 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_293_, -1981010076).aBoolean533)) {
						int i_294_;
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_294_ = 255 * is_262_[i_285_] / (class77.anInt650 * -348036733);
							if (i_294_ < 0)
								i_294_ = 0;
							else if (i_294_ > 255)
								i_294_ = 255;
						} else
							i_294_ = 0;
						((Class4) class4).anInt59 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_285_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_]))), class77.anInt652 * -576105833, i_294_, (byte) 55));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt59 |= (255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_])) << 25);
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_294_ = 255 * is_262_[i_286_] / (class77.anInt650 * -348036733);
							if (i_294_ < 0)
								i_294_ = 0;
							else if (i_294_ > 255)
								i_294_ = 255;
						} else
							i_294_ = 0;
						((Class4) class4).anInt64 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_286_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_]))), class77.anInt652 * -576105833, i_294_, (byte) 8));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt64 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_])) << 25;
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_294_ = 255 * is_262_[i_287_] / (class77.anInt650 * -348036733);
							if (i_294_ < 0)
								i_294_ = 0;
							else if (i_294_ > 255)
								i_294_ = 255;
						} else
							i_294_ = 0;
						((Class4) class4).anInt60 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_287_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1]))), class77.anInt652 * -576105833, i_294_, (byte) 81));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt60 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1])) << 25;
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_294_ = 255 * is_262_[i_288_] / (class77.anInt650 * -348036733);
							if (i_294_ < 0)
								i_294_ = 0;
							else if (i_294_ > 255)
								i_294_ = 255;
						} else
							i_294_ = 0;
						((Class4) class4).anInt58 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_288_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_ + 1]))), class77.anInt652 * -576105833, i_294_, (byte) 47));
						((Class4) class4).aShort67 = (short) i_293_;
					} else {
						int i_295_;
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_295_ = 255 * is_262_[i_285_] / (class77.anInt650 * -348036733);
							if (i_295_ < 0)
								i_295_ = 0;
							else if (i_295_ > 255)
								i_295_ = 255;
						} else
							i_295_ = 0;
						((Class4) class4).anInt59 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_285_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_]))), class77.anInt652 * -576105833, i_295_, (byte) 109));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt59 |= (255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_])) << 25);
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_295_ = 255 * is_262_[i_286_] / (class77.anInt650 * -348036733);
							if (i_295_ < 0)
								i_295_ = 0;
							else if (i_295_ > 255)
								i_295_ = 255;
						} else
							i_295_ = 0;
						((Class4) class4).anInt64 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_286_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_]))), class77.anInt652 * -576105833, i_295_, (byte) 49));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt64 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_])) << 25;
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_295_ = 255 * is_262_[i_287_] / (class77.anInt650 * -348036733);
							if (i_295_ < 0)
								i_295_ = 0;
							else if (i_295_ > 255)
								i_295_ = 255;
						} else
							i_295_ = 0;
						((Class4) class4).anInt60 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_287_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1]))), class77.anInt652 * -576105833, i_295_, (byte) 103));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt60 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1])) << 25;
						if (is_262_ != null && class77.anInt650 * -348036733 != 0) {
							i_295_ = 255 * is_262_[i_288_] / (class77.anInt650 * -348036733);
							if (i_295_ < 0)
								i_295_ = 0;
							else if (i_295_ > 255)
								i_295_ = 255;
						} else
							i_295_ = 0;
						((Class4) class4).anInt58 = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_288_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_ + 1]))), class77.anInt652 * -576105833, i_295_, (byte) 41));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt58 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_ + 1])) << 25;
						((Class4) class4).aShort67 = (short) -1;
					}
					if (is_262_ != null) {
						((Class4) class4).aShort57 = (short) is_262_[i_287_];
						((Class4) class4).aShort63 = (short) is_262_[i_288_];
						((Class4) class4).aShort61 = (short) is_262_[i_286_];
						((Class4) class4).aShort62 = (short) is_262_[i_285_];
					}
					((Class_xa_Sub3) this).aClass4ArrayArray8832[i][i_259_] = class4;
				} else {
					Class14 class14 = new Class14();
					((Class14) class14).aShort177 = (short) is.length;
					((Class14) class14).aShort185 = (short) (is.length / 3);
					((Class14) class14).aShortArray179 = new short[((Class14) class14).aShort177];
					((Class14) class14).aShortArray180 = new short[((Class14) class14).aShort177];
					((Class14) class14).aShortArray181 = new short[((Class14) class14).aShort177];
					((Class14) class14).anIntArray183 = new int[((Class14) class14).aShort177];
					if (is_262_ != null)
						((Class14) class14).aShortArray182 = new short[((Class14) class14).aShort177];
					for (int i_296_ = 0; i_296_ < ((Class14) class14).aShort177; i_296_++) {
						int i_297_ = is[i_296_];
						int i_298_ = is_261_[i_296_];
						boolean bool_299_ = false;
						int i_300_;
						if (i_297_ == 0 && i_298_ == 0)
							i_300_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_]));
						else if (i_297_ == 0 && i_298_ == anInt6395 * 550173571)
							i_300_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_ + 1]));
						else if (i_297_ == anInt6395 * 550173571 && i_298_ == anInt6395 * 550173571)
							i_300_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1]));
						else if (i_297_ == anInt6395 * 550173571 && i_298_ == 0)
							i_300_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_]));
						else {
							int i_301_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_])) * (anInt6395 * 550173571 - i_297_)) + (((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_])) * i_297_));
							int i_302_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_259_ + 1])) * (anInt6395 * 550173571 - i_297_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_259_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_259_ + 1])) * i_297_);
							i_300_ = (i_301_ * (anInt6395 * 550173571 - i_298_) + i_302_ * i_298_ >> anInt6396 * -2132608442);
						}
						int i_303_ = (i << anInt6396 * -1066304221) + i_297_;
						int i_304_ = (i_259_ << anInt6396 * -1066304221) + i_298_;
						((Class14) class14).aShortArray179[i_296_] = (short) i_297_;
						((Class14) class14).aShortArray181[i_296_] = (short) i_298_;
						((Class14) class14).aShortArray180[i_296_] = (short) (method6416(i_303_, i_304_, 1383068495) + (is_260_ != null ? is_260_[i_296_] : 0));
						if (i_300_ < 0)
							i_300_ = 0;
						if (is_263_[i_296_] == 0) {
							if (is_264_ != null)
								((Class14) class14).anIntArray183[i_296_] = i_300_ << 25;
							else
								((Class14) class14).anIntArray183[i_296_] = 0;
						} else {
							int i_305_ = 0;
							if (is_262_ != null) {
								int i_306_ = (((Class14) class14).aShortArray182[i_296_] = (short) is_262_[i_296_]);
								if (class77.anInt650 * -348036733 != 0) {
									i_305_ = 255 * i_306_ / (class77.anInt650 * -348036733);
									if (i_305_ < 0)
										i_305_ = 0;
									else if (i_305_ > 255)
										i_305_ = 255;
								}
							}
							((Class14) class14).anIntArray183[i_296_] = (Class95_Sub12_Sub1.method1139(method6442(is_263_[i_296_] >> 8, i_300_), class77.anInt652 * -576105833, i_305_, (byte) 39));
							if (is_264_ != null)
								((Class14) class14).anIntArray183[i_296_] |= i_300_ << 25;
						}
					}
					boolean bool_307_ = false;
					for (int i_308_ = 0; i_308_ < ((Class14) class14).aShort185; i_308_++) {
						if (is_265_[i_308_ * 3] != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_265_[i_308_ * 3], -1315395319).aBoolean533))
							bool_307_ = true;
					}
					if (is_264_ != null)
						((Class14) class14).anIntArray186 = new int[((Class14) class14).aShort185];
					if (bool_307_) {
						((Class14) class14).aShortArray176 = new short[((Class14) class14).aShort185];
						((Class14) class14).aShortArray184 = new short[((Class14) class14).aShort185];
					}
					for (int i_309_ = 0; i_309_ < ((Class14) class14).aShort185; i_309_++) {
						int i_310_ = i_309_ * 3;
						if (is_264_ != null && is_264_[i_310_] != 0)
							((Class14) class14).anIntArray186[i_309_] = is_264_[i_310_] >> 8;
						if (bool_307_) {
							int i_311_ = i_310_ + 1;
							int i_312_ = i_311_ + 1;
							boolean bool_313_ = false;
							boolean bool_314_ = true;
							int i_315_ = is_265_[i_310_];
							if (i_315_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, 867500621).aBoolean533))
								bool_314_ = false;
							else
								bool_313_ = true;
							i_315_ = is_265_[i_311_];
							if (i_315_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, -800945425).aBoolean533))
								bool_314_ = false;
							else
								bool_313_ = true;
							i_315_ = is_265_[i_312_];
							if (i_315_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, 432820356).aBoolean533))
								bool_314_ = false;
							else
								bool_313_ = true;
							if (bool_314_) {
								((Class14) class14).aShortArray176[i_309_] = (short) i_315_;
								((Class14) class14).aShortArray184[i_309_] = (short) is_266_[i_310_];
							} else {
								if (bool_313_) {
									i_315_ = is_265_[i_310_];
									if (i_315_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, 1087139946).aBoolean533))
										((Class14) class14).anIntArray183[i_310_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, -2082580768).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
									i_315_ = is_265_[i_311_];
									if (i_315_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, 1992403432).aBoolean533))
										((Class14) class14).anIntArray183[i_311_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, -987148408).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
									i_315_ = is_265_[i_312_];
									if (i_315_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, 1255381007).aBoolean533))
										((Class14) class14).anIntArray183[i_312_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_315_, 1401574915).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
								}
								((Class14) class14).aShortArray176[i_309_] = (short) -1;
							}
						}
					}
					((Class_xa_Sub3) this).aClass14ArrayArray8842[i][i_259_] = class14;
				}
			}
		}
	}

	public void method6419(int i, int i_316_, int[] is, int[] is_317_, int[] is_318_, int[] is_319_, int[] is_320_, int[] is_321_, int[] is_322_, int[] is_323_, Class77 class77, boolean bool) {
		boolean bool_324_ = (((Class_xa_Sub3) this).anInt8838 & 0x20) == 0;
		if (((Class_xa_Sub3) this).aClass4ArrayArray8832 == null && !bool_324_) {
			((Class_xa_Sub3) this).aClass4ArrayArray8832 = new Class4[anInt6397 * 1972554729][anInt6393 * 24567321];
			((Class_xa_Sub3) this).aClass14ArrayArray8842 = new Class14[anInt6397 * 1972554729][anInt6393 * 24567321];
		} else if (((Class_xa_Sub3) this).aClass42ArrayArray8843 == null && bool_324_)
			((Class_xa_Sub3) this).aClass42ArrayArray8843 = new Class42[anInt6397 * 1972554729][anInt6393 * 24567321];
		else if (((Class_xa_Sub3) this).aClass31ArrayArray8839 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_325_ = 0; i_325_ < is_320_.length; i_325_++) {
				if (is_320_[i_325_] == -1)
					is_320_[i_325_] = 0;
				else
					is_320_[i_325_] = (Console.anIntArray4263[(Class356.modifyColor(is_320_[i_325_], (byte) 1) & 0xffff)]) << 8 | 0xff;
			}
			if (is_321_ != null) {
				for (int i_326_ = 0; i_326_ < is_321_.length; i_326_++) {
					if (is_321_[i_326_] == -1)
						is_321_[i_326_] = 0;
					else
						is_321_[i_326_] = (Console.anIntArray4263[(Class356.modifyColor(is_321_[i_326_], (byte) 1) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_324_) {
				Class42 class42 = new Class42();
				((Class42) class42).aShort433 = (short) is.length;
				((Class42) class42).aShort430 = (short) (is.length / 3);
				((Class42) class42).aShortArray432 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray431 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray434 = new short[((Class42) class42).aShort433];
				((Class42) class42).anIntArray438 = new int[((Class42) class42).aShort433];
				((Class42) class42).aShortArray436 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray437 = new short[((Class42) class42).aShort433];
				((Class42) class42).aByteArray439 = new byte[((Class42) class42).aShort433];
				if (is_319_ != null)
					((Class42) class42).aShortArray440 = new short[((Class42) class42).aShort433];
				for (int i_327_ = 0; i_327_ < ((Class42) class42).aShort433; i_327_++) {
					int i_328_ = is[i_327_];
					int i_329_ = is_318_[i_327_];
					boolean bool_330_ = false;
					int i_331_;
					if (i_328_ == 0 && i_329_ == 0)
						i_331_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_]));
					else if (i_328_ == 0 && i_329_ == anInt6395 * 550173571)
						i_331_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_ + 1]));
					else if (i_328_ == anInt6395 * 550173571 && i_329_ == anInt6395 * 550173571)
						i_331_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1]));
					else if (i_328_ == anInt6395 * 550173571 && i_329_ == 0)
						i_331_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_]));
					else {
						int i_332_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_])) * (anInt6395 * 550173571 - i_328_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_])) * i_328_);
						int i_333_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_ + 1])) * (anInt6395 * 550173571 - i_328_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1])) * i_328_);
						i_331_ = (i_332_ * (anInt6395 * 550173571 - i_329_) + i_333_ * i_329_) >> anInt6396 * -2132608442;
					}
					int i_334_ = (i << anInt6396 * -1066304221) + i_328_;
					int i_335_ = (i_316_ << anInt6396 * -1066304221) + i_329_;
					((Class42) class42).aShortArray432[i_327_] = (short) i_328_;
					((Class42) class42).aShortArray434[i_327_] = (short) i_329_;
					((Class42) class42).aShortArray431[i_327_] = (short) (method6416(i_334_, i_335_, 93619635) + (is_317_ != null ? is_317_[i_327_] : 0));
					if (i_331_ < 0)
						i_331_ = 0;
					if (is_320_[i_327_] == 0) {
						((Class42) class42).anIntArray438[i_327_] = 0;
						if (is_321_ != null)
							((Class42) class42).aByteArray439[i_327_] = (byte) i_331_;
					} else {
						int i_336_ = 0;
						if (is_319_ != null) {
							int i_337_ = (((Class42) class42).aShortArray440[i_327_] = (short) is_319_[i_327_]);
							if (class77.anInt650 * -348036733 != 0) {
								i_336_ = 255 * i_337_ / (class77.anInt650 * -348036733);
								if (i_336_ < 0)
									i_336_ = 0;
								else if (i_336_ > 255)
									i_336_ = 255;
							}
						}
						int i_338_ = -16777216;
						if (is_322_[i_327_] != -1 && method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_322_[i_327_], -1240738228).aByte525))
							i_338_ = -1694498816;
						((Class42) class42).anIntArray438[i_327_] = i_338_ | (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_327_] >> 8, i_331_), class77.anInt652 * -576105833, i_336_, (byte) 14));
						if (is_321_ != null)
							((Class42) class42).aByteArray439[i_327_] = (byte) i_331_;
					}
					((Class42) class42).aShortArray436[i_327_] = (short) is_322_[i_327_];
					((Class42) class42).aShortArray437[i_327_] = (short) is_323_[i_327_];
				}
				if (is_321_ != null)
					((Class42) class42).anIntArray435 = new int[((Class42) class42).aShort430];
				for (int i_339_ = 0; i_339_ < ((Class42) class42).aShort430; i_339_++) {
					int i_340_ = i_339_ * 3;
					if (is_321_ != null && is_321_[i_340_] != 0)
						((Class42) class42).anIntArray435[i_339_] = ~0xffffff | is_321_[i_340_] >> 8;
				}
				((Class_xa_Sub3) this).aClass42ArrayArray8843[i][i_316_] = class42;
			} else {
				boolean bool_341_ = true;
				int i_342_ = -1;
				int i_343_ = -1;
				int i_344_ = -1;
				int i_345_ = -1;
				if (is.length == 6) {
					for (int i_346_ = 0; i_346_ < 6; i_346_++) {
						if (is[i_346_] == 0 && is_318_[i_346_] == 0) {
							if (i_342_ != -1 && is_320_[i_342_] != is_320_[i_346_]) {
								bool_341_ = false;
								break;
							}
							i_342_ = i_346_;
						} else if (is[i_346_] == anInt6395 * 550173571 && is_318_[i_346_] == 0) {
							if (i_343_ != -1 && is_320_[i_343_] != is_320_[i_346_]) {
								bool_341_ = false;
								break;
							}
							i_343_ = i_346_;
						} else if (is[i_346_] == anInt6395 * 550173571 && (is_318_[i_346_] == anInt6395 * 550173571)) {
							if (i_344_ != -1 && is_320_[i_344_] != is_320_[i_346_]) {
								bool_341_ = false;
								break;
							}
							i_344_ = i_346_;
						} else if (is[i_346_] == 0 && (is_318_[i_346_] == anInt6395 * 550173571)) {
							if (i_345_ != -1 && is_320_[i_345_] != is_320_[i_346_]) {
								bool_341_ = false;
								break;
							}
							i_345_ = i_346_;
						}
					}
					if (i_342_ == -1 || i_343_ == -1 || i_344_ == -1 || i_345_ == -1)
						bool_341_ = false;
					if (bool_341_) {
						if (is_317_ != null) {
							for (int i_347_ = 0; i_347_ < 4; i_347_++) {
								if (is_317_[i_347_] != 0) {
									bool_341_ = false;
									break;
								}
							}
						}
						if (bool_341_) {
							for (int i_348_ = 1; i_348_ < 4; i_348_++) {
								if (is[i_348_] != is[0] && (is[i_348_] != is[0] + anInt6395 * 550173571) && (is[i_348_] != is[0] - anInt6395 * 550173571)) {
									bool_341_ = false;
									break;
								}
								if (is_318_[i_348_] != is_318_[0] && (is_318_[i_348_] != is_318_[0] + anInt6395 * 550173571) && (is_318_[i_348_] != (is_318_[0] - anInt6395 * 550173571))) {
									bool_341_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_341_ = false;
				if (bool_341_) {
					Class4 class4 = new Class4();
					int i_349_ = is_320_[0];
					int i_350_ = is_322_[0];
					if (is_321_ != null) {
						((Class4) class4).anInt66 = is_321_[0] >> 8;
						if (i_349_ == 0)
							((Class4) class4).aByte65 |= 0x2;
					} else if (i_349_ == 0)
						return;
					if ((anIntArrayArray6394[i][i_316_] == anIntArrayArray6394[i + 1][i_316_]) && (anIntArrayArray6394[i][i_316_] == anIntArrayArray6394[i + 1][i_316_ + 1]) && (anIntArrayArray6394[i][i_316_] == anIntArrayArray6394[i][i_316_ + 1]))
						((Class4) class4).aByte65 |= 0x1;
					if (i_350_ != -1 && (((Class4) class4).aByte65 & 0x2) == 0 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_350_, -1162183605).aBoolean533)) {
						int i_351_;
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_351_ = 255 * is_319_[i_342_] / (class77.anInt650 * -348036733);
							if (i_351_ < 0)
								i_351_ = 0;
							else if (i_351_ > 255)
								i_351_ = 255;
						} else
							i_351_ = 0;
						((Class4) class4).anInt59 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_342_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_]))), class77.anInt652 * -576105833, i_351_, (byte) 43));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt59 |= (255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_])) << 25);
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_351_ = 255 * is_319_[i_343_] / (class77.anInt650 * -348036733);
							if (i_351_ < 0)
								i_351_ = 0;
							else if (i_351_ > 255)
								i_351_ = 255;
						} else
							i_351_ = 0;
						((Class4) class4).anInt64 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_343_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_]))), class77.anInt652 * -576105833, i_351_, (byte) 12));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt64 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_])) << 25;
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_351_ = 255 * is_319_[i_344_] / (class77.anInt650 * -348036733);
							if (i_351_ < 0)
								i_351_ = 0;
							else if (i_351_ > 255)
								i_351_ = 255;
						} else
							i_351_ = 0;
						((Class4) class4).anInt60 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_344_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1]))), class77.anInt652 * -576105833, i_351_, (byte) 7));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt60 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1])) << 25;
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_351_ = 255 * is_319_[i_345_] / (class77.anInt650 * -348036733);
							if (i_351_ < 0)
								i_351_ = 0;
							else if (i_351_ > 255)
								i_351_ = 255;
						} else
							i_351_ = 0;
						((Class4) class4).anInt58 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_345_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_ + 1]))), class77.anInt652 * -576105833, i_351_, (byte) 3));
						((Class4) class4).aShort67 = (short) i_350_;
					} else {
						int i_352_;
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_352_ = 255 * is_319_[i_342_] / (class77.anInt650 * -348036733);
							if (i_352_ < 0)
								i_352_ = 0;
							else if (i_352_ > 255)
								i_352_ = 255;
						} else
							i_352_ = 0;
						((Class4) class4).anInt59 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_342_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_]))), class77.anInt652 * -576105833, i_352_, (byte) 88));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt59 |= (255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_])) << 25);
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_352_ = 255 * is_319_[i_343_] / (class77.anInt650 * -348036733);
							if (i_352_ < 0)
								i_352_ = 0;
							else if (i_352_ > 255)
								i_352_ = 255;
						} else
							i_352_ = 0;
						((Class4) class4).anInt64 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_343_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_]))), class77.anInt652 * -576105833, i_352_, (byte) 123));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt64 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_])) << 25;
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_352_ = 255 * is_319_[i_344_] / (class77.anInt650 * -348036733);
							if (i_352_ < 0)
								i_352_ = 0;
							else if (i_352_ > 255)
								i_352_ = 255;
						} else
							i_352_ = 0;
						((Class4) class4).anInt60 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_344_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1]))), class77.anInt652 * -576105833, i_352_, (byte) 21));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt60 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1])) << 25;
						if (is_319_ != null && class77.anInt650 * -348036733 != 0) {
							i_352_ = 255 * is_319_[i_345_] / (class77.anInt650 * -348036733);
							if (i_352_ < 0)
								i_352_ = 0;
							else if (i_352_ > 255)
								i_352_ = 255;
						} else
							i_352_ = 0;
						((Class4) class4).anInt58 = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_345_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_ + 1]))), class77.anInt652 * -576105833, i_352_, (byte) 27));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt58 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_ + 1])) << 25;
						((Class4) class4).aShort67 = (short) -1;
					}
					if (is_319_ != null) {
						((Class4) class4).aShort57 = (short) is_319_[i_344_];
						((Class4) class4).aShort63 = (short) is_319_[i_345_];
						((Class4) class4).aShort61 = (short) is_319_[i_343_];
						((Class4) class4).aShort62 = (short) is_319_[i_342_];
					}
					((Class_xa_Sub3) this).aClass4ArrayArray8832[i][i_316_] = class4;
				} else {
					Class14 class14 = new Class14();
					((Class14) class14).aShort177 = (short) is.length;
					((Class14) class14).aShort185 = (short) (is.length / 3);
					((Class14) class14).aShortArray179 = new short[((Class14) class14).aShort177];
					((Class14) class14).aShortArray180 = new short[((Class14) class14).aShort177];
					((Class14) class14).aShortArray181 = new short[((Class14) class14).aShort177];
					((Class14) class14).anIntArray183 = new int[((Class14) class14).aShort177];
					if (is_319_ != null)
						((Class14) class14).aShortArray182 = new short[((Class14) class14).aShort177];
					for (int i_353_ = 0; i_353_ < ((Class14) class14).aShort177; i_353_++) {
						int i_354_ = is[i_353_];
						int i_355_ = is_318_[i_353_];
						boolean bool_356_ = false;
						int i_357_;
						if (i_354_ == 0 && i_355_ == 0)
							i_357_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_]));
						else if (i_354_ == 0 && i_355_ == anInt6395 * 550173571)
							i_357_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_ + 1]));
						else if (i_354_ == anInt6395 * 550173571 && i_355_ == anInt6395 * 550173571)
							i_357_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1]));
						else if (i_354_ == anInt6395 * 550173571 && i_355_ == 0)
							i_357_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_]));
						else {
							int i_358_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_])) * (anInt6395 * 550173571 - i_354_)) + (((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_])) * i_354_));
							int i_359_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_316_ + 1])) * (anInt6395 * 550173571 - i_354_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_316_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_316_ + 1])) * i_354_);
							i_357_ = (i_358_ * (anInt6395 * 550173571 - i_355_) + i_359_ * i_355_ >> anInt6396 * -2132608442);
						}
						int i_360_ = (i << anInt6396 * -1066304221) + i_354_;
						int i_361_ = (i_316_ << anInt6396 * -1066304221) + i_355_;
						((Class14) class14).aShortArray179[i_353_] = (short) i_354_;
						((Class14) class14).aShortArray181[i_353_] = (short) i_355_;
						((Class14) class14).aShortArray180[i_353_] = (short) (method6416(i_360_, i_361_, 394582232) + (is_317_ != null ? is_317_[i_353_] : 0));
						if (i_357_ < 0)
							i_357_ = 0;
						if (is_320_[i_353_] == 0) {
							if (is_321_ != null)
								((Class14) class14).anIntArray183[i_353_] = i_357_ << 25;
							else
								((Class14) class14).anIntArray183[i_353_] = 0;
						} else {
							int i_362_ = 0;
							if (is_319_ != null) {
								int i_363_ = (((Class14) class14).aShortArray182[i_353_] = (short) is_319_[i_353_]);
								if (class77.anInt650 * -348036733 != 0) {
									i_362_ = 255 * i_363_ / (class77.anInt650 * -348036733);
									if (i_362_ < 0)
										i_362_ = 0;
									else if (i_362_ > 255)
										i_362_ = 255;
								}
							}
							((Class14) class14).anIntArray183[i_353_] = (Class95_Sub12_Sub1.method1139(method6442(is_320_[i_353_] >> 8, i_357_), class77.anInt652 * -576105833, i_362_, (byte) 92));
							if (is_321_ != null)
								((Class14) class14).anIntArray183[i_353_] |= i_357_ << 25;
						}
					}
					boolean bool_364_ = false;
					for (int i_365_ = 0; i_365_ < ((Class14) class14).aShort185; i_365_++) {
						if (is_322_[i_365_ * 3] != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_322_[i_365_ * 3], 514621033).aBoolean533))
							bool_364_ = true;
					}
					if (is_321_ != null)
						((Class14) class14).anIntArray186 = new int[((Class14) class14).aShort185];
					if (bool_364_) {
						((Class14) class14).aShortArray176 = new short[((Class14) class14).aShort185];
						((Class14) class14).aShortArray184 = new short[((Class14) class14).aShort185];
					}
					for (int i_366_ = 0; i_366_ < ((Class14) class14).aShort185; i_366_++) {
						int i_367_ = i_366_ * 3;
						if (is_321_ != null && is_321_[i_367_] != 0)
							((Class14) class14).anIntArray186[i_366_] = is_321_[i_367_] >> 8;
						if (bool_364_) {
							int i_368_ = i_367_ + 1;
							int i_369_ = i_368_ + 1;
							boolean bool_370_ = false;
							boolean bool_371_ = true;
							int i_372_ = is_322_[i_367_];
							if (i_372_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, 2095980761).aBoolean533))
								bool_371_ = false;
							else
								bool_370_ = true;
							i_372_ = is_322_[i_368_];
							if (i_372_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, 954668308).aBoolean533))
								bool_371_ = false;
							else
								bool_370_ = true;
							i_372_ = is_322_[i_369_];
							if (i_372_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, 1494848954).aBoolean533))
								bool_371_ = false;
							else
								bool_370_ = true;
							if (bool_371_) {
								((Class14) class14).aShortArray176[i_366_] = (short) i_372_;
								((Class14) class14).aShortArray184[i_366_] = (short) is_323_[i_367_];
							} else {
								if (bool_370_) {
									i_372_ = is_322_[i_367_];
									if (i_372_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, 1837870968).aBoolean533))
										((Class14) class14).anIntArray183[i_367_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, -1774245736).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
									i_372_ = is_322_[i_368_];
									if (i_372_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, 257614280).aBoolean533))
										((Class14) class14).anIntArray183[i_368_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, -883188782).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
									i_372_ = is_322_[i_369_];
									if (i_372_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, 1035863759).aBoolean533))
										((Class14) class14).anIntArray183[i_369_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_372_, 633806980).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
								}
								((Class14) class14).aShortArray176[i_366_] = (short) -1;
							}
						}
					}
					((Class_xa_Sub3) this).aClass14ArrayArray8842[i][i_316_] = class14;
				}
			}
		}
	}

	public void d() {
		((Class_xa_Sub3) this).aByteArrayArray8860 = null;
		((Class_xa_Sub3) this).aByteArrayArray8858 = null;
	}

	public void c() {
		((Class_xa_Sub3) this).aByteArrayArray8860 = null;
		((Class_xa_Sub3) this).aByteArrayArray8858 = null;
	}

	public void method6425(int i, int i_373_, int[] is, int[] is_374_, int[] is_375_, int[] is_376_, int[] is_377_, int[] is_378_, int[] is_379_, int[] is_380_, Class77 class77, boolean bool) {
		boolean bool_381_ = (((Class_xa_Sub3) this).anInt8838 & 0x20) == 0;
		if (((Class_xa_Sub3) this).aClass4ArrayArray8832 == null && !bool_381_) {
			((Class_xa_Sub3) this).aClass4ArrayArray8832 = new Class4[anInt6397 * 1972554729][anInt6393 * 24567321];
			((Class_xa_Sub3) this).aClass14ArrayArray8842 = new Class14[anInt6397 * 1972554729][anInt6393 * 24567321];
		} else if (((Class_xa_Sub3) this).aClass42ArrayArray8843 == null && bool_381_)
			((Class_xa_Sub3) this).aClass42ArrayArray8843 = new Class42[anInt6397 * 1972554729][anInt6393 * 24567321];
		else if (((Class_xa_Sub3) this).aClass31ArrayArray8839 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_382_ = 0; i_382_ < is_377_.length; i_382_++) {
				if (is_377_[i_382_] == -1)
					is_377_[i_382_] = 0;
				else
					is_377_[i_382_] = (Console.anIntArray4263[(Class356.modifyColor(is_377_[i_382_], (byte) 1) & 0xffff)]) << 8 | 0xff;
			}
			if (is_378_ != null) {
				for (int i_383_ = 0; i_383_ < is_378_.length; i_383_++) {
					if (is_378_[i_383_] == -1)
						is_378_[i_383_] = 0;
					else
						is_378_[i_383_] = (Console.anIntArray4263[(Class356.modifyColor(is_378_[i_383_], (byte) 1) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_381_) {
				Class42 class42 = new Class42();
				((Class42) class42).aShort433 = (short) is.length;
				((Class42) class42).aShort430 = (short) (is.length / 3);
				((Class42) class42).aShortArray432 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray431 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray434 = new short[((Class42) class42).aShort433];
				((Class42) class42).anIntArray438 = new int[((Class42) class42).aShort433];
				((Class42) class42).aShortArray436 = new short[((Class42) class42).aShort433];
				((Class42) class42).aShortArray437 = new short[((Class42) class42).aShort433];
				((Class42) class42).aByteArray439 = new byte[((Class42) class42).aShort433];
				if (is_376_ != null)
					((Class42) class42).aShortArray440 = new short[((Class42) class42).aShort433];
				for (int i_384_ = 0; i_384_ < ((Class42) class42).aShort433; i_384_++) {
					int i_385_ = is[i_384_];
					int i_386_ = is_375_[i_384_];
					boolean bool_387_ = false;
					int i_388_;
					if (i_385_ == 0 && i_386_ == 0)
						i_388_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_]));
					else if (i_385_ == 0 && i_386_ == anInt6395 * 550173571)
						i_388_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_ + 1]));
					else if (i_385_ == anInt6395 * 550173571 && i_386_ == anInt6395 * 550173571)
						i_388_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1]));
					else if (i_385_ == anInt6395 * 550173571 && i_386_ == 0)
						i_388_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_]));
					else {
						int i_389_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_])) * (anInt6395 * 550173571 - i_385_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_])) * i_385_);
						int i_390_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_ + 1])) * (anInt6395 * 550173571 - i_385_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1])) * i_385_);
						i_388_ = (i_389_ * (anInt6395 * 550173571 - i_386_) + i_390_ * i_386_) >> anInt6396 * -2132608442;
					}
					int i_391_ = (i << anInt6396 * -1066304221) + i_385_;
					int i_392_ = (i_373_ << anInt6396 * -1066304221) + i_386_;
					((Class42) class42).aShortArray432[i_384_] = (short) i_385_;
					((Class42) class42).aShortArray434[i_384_] = (short) i_386_;
					((Class42) class42).aShortArray431[i_384_] = (short) (method6416(i_391_, i_392_, -642653786) + (is_374_ != null ? is_374_[i_384_] : 0));
					if (i_388_ < 0)
						i_388_ = 0;
					if (is_377_[i_384_] == 0) {
						((Class42) class42).anIntArray438[i_384_] = 0;
						if (is_378_ != null)
							((Class42) class42).aByteArray439[i_384_] = (byte) i_388_;
					} else {
						int i_393_ = 0;
						if (is_376_ != null) {
							int i_394_ = (((Class42) class42).aShortArray440[i_384_] = (short) is_376_[i_384_]);
							if (class77.anInt650 * -348036733 != 0) {
								i_393_ = 255 * i_394_ / (class77.anInt650 * -348036733);
								if (i_393_ < 0)
									i_393_ = 0;
								else if (i_393_ > 255)
									i_393_ = 255;
							}
						}
						int i_395_ = -16777216;
						if (is_379_[i_384_] != -1 && method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_379_[i_384_], -1560832540).aByte525))
							i_395_ = -1694498816;
						((Class42) class42).anIntArray438[i_384_] = i_395_ | (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_384_] >> 8, i_388_), class77.anInt652 * -576105833, i_393_, (byte) 3));
						if (is_378_ != null)
							((Class42) class42).aByteArray439[i_384_] = (byte) i_388_;
					}
					((Class42) class42).aShortArray436[i_384_] = (short) is_379_[i_384_];
					((Class42) class42).aShortArray437[i_384_] = (short) is_380_[i_384_];
				}
				if (is_378_ != null)
					((Class42) class42).anIntArray435 = new int[((Class42) class42).aShort430];
				for (int i_396_ = 0; i_396_ < ((Class42) class42).aShort430; i_396_++) {
					int i_397_ = i_396_ * 3;
					if (is_378_ != null && is_378_[i_397_] != 0)
						((Class42) class42).anIntArray435[i_396_] = ~0xffffff | is_378_[i_397_] >> 8;
				}
				((Class_xa_Sub3) this).aClass42ArrayArray8843[i][i_373_] = class42;
			} else {
				boolean bool_398_ = true;
				int i_399_ = -1;
				int i_400_ = -1;
				int i_401_ = -1;
				int i_402_ = -1;
				if (is.length == 6) {
					for (int i_403_ = 0; i_403_ < 6; i_403_++) {
						if (is[i_403_] == 0 && is_375_[i_403_] == 0) {
							if (i_399_ != -1 && is_377_[i_399_] != is_377_[i_403_]) {
								bool_398_ = false;
								break;
							}
							i_399_ = i_403_;
						} else if (is[i_403_] == anInt6395 * 550173571 && is_375_[i_403_] == 0) {
							if (i_400_ != -1 && is_377_[i_400_] != is_377_[i_403_]) {
								bool_398_ = false;
								break;
							}
							i_400_ = i_403_;
						} else if (is[i_403_] == anInt6395 * 550173571 && (is_375_[i_403_] == anInt6395 * 550173571)) {
							if (i_401_ != -1 && is_377_[i_401_] != is_377_[i_403_]) {
								bool_398_ = false;
								break;
							}
							i_401_ = i_403_;
						} else if (is[i_403_] == 0 && (is_375_[i_403_] == anInt6395 * 550173571)) {
							if (i_402_ != -1 && is_377_[i_402_] != is_377_[i_403_]) {
								bool_398_ = false;
								break;
							}
							i_402_ = i_403_;
						}
					}
					if (i_399_ == -1 || i_400_ == -1 || i_401_ == -1 || i_402_ == -1)
						bool_398_ = false;
					if (bool_398_) {
						if (is_374_ != null) {
							for (int i_404_ = 0; i_404_ < 4; i_404_++) {
								if (is_374_[i_404_] != 0) {
									bool_398_ = false;
									break;
								}
							}
						}
						if (bool_398_) {
							for (int i_405_ = 1; i_405_ < 4; i_405_++) {
								if (is[i_405_] != is[0] && (is[i_405_] != is[0] + anInt6395 * 550173571) && (is[i_405_] != is[0] - anInt6395 * 550173571)) {
									bool_398_ = false;
									break;
								}
								if (is_375_[i_405_] != is_375_[0] && (is_375_[i_405_] != is_375_[0] + anInt6395 * 550173571) && (is_375_[i_405_] != (is_375_[0] - anInt6395 * 550173571))) {
									bool_398_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_398_ = false;
				if (bool_398_) {
					Class4 class4 = new Class4();
					int i_406_ = is_377_[0];
					int i_407_ = is_379_[0];
					if (is_378_ != null) {
						((Class4) class4).anInt66 = is_378_[0] >> 8;
						if (i_406_ == 0)
							((Class4) class4).aByte65 |= 0x2;
					} else if (i_406_ == 0)
						return;
					if ((anIntArrayArray6394[i][i_373_] == anIntArrayArray6394[i + 1][i_373_]) && (anIntArrayArray6394[i][i_373_] == anIntArrayArray6394[i + 1][i_373_ + 1]) && (anIntArrayArray6394[i][i_373_] == anIntArrayArray6394[i][i_373_ + 1]))
						((Class4) class4).aByte65 |= 0x1;
					if (i_407_ != -1 && (((Class4) class4).aByte65 & 0x2) == 0 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_407_, 2008329902).aBoolean533)) {
						int i_408_;
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_408_ = 255 * is_376_[i_399_] / (class77.anInt650 * -348036733);
							if (i_408_ < 0)
								i_408_ = 0;
							else if (i_408_ > 255)
								i_408_ = 255;
						} else
							i_408_ = 0;
						((Class4) class4).anInt59 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_399_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_]))), class77.anInt652 * -576105833, i_408_, (byte) 60));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt59 |= (255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_])) << 25);
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_408_ = 255 * is_376_[i_400_] / (class77.anInt650 * -348036733);
							if (i_408_ < 0)
								i_408_ = 0;
							else if (i_408_ > 255)
								i_408_ = 255;
						} else
							i_408_ = 0;
						((Class4) class4).anInt64 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_400_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_]))), class77.anInt652 * -576105833, i_408_, (byte) 54));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt64 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_])) << 25;
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_408_ = 255 * is_376_[i_401_] / (class77.anInt650 * -348036733);
							if (i_408_ < 0)
								i_408_ = 0;
							else if (i_408_ > 255)
								i_408_ = 255;
						} else
							i_408_ = 0;
						((Class4) class4).anInt60 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_401_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1]))), class77.anInt652 * -576105833, i_408_, (byte) 74));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt60 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1])) << 25;
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_408_ = 255 * is_376_[i_402_] / (class77.anInt650 * -348036733);
							if (i_408_ < 0)
								i_408_ = 0;
							else if (i_408_ > 255)
								i_408_ = 255;
						} else
							i_408_ = 0;
						((Class4) class4).anInt58 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_402_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_ + 1]))), class77.anInt652 * -576105833, i_408_, (byte) 115));
						((Class4) class4).aShort67 = (short) i_407_;
					} else {
						int i_409_;
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_409_ = 255 * is_376_[i_399_] / (class77.anInt650 * -348036733);
							if (i_409_ < 0)
								i_409_ = 0;
							else if (i_409_ > 255)
								i_409_ = 255;
						} else
							i_409_ = 0;
						((Class4) class4).anInt59 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_399_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_]))), class77.anInt652 * -576105833, i_409_, (byte) 108));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt59 |= (255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_])) << 25);
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_409_ = 255 * is_376_[i_400_] / (class77.anInt650 * -348036733);
							if (i_409_ < 0)
								i_409_ = 0;
							else if (i_409_ > 255)
								i_409_ = 255;
						} else
							i_409_ = 0;
						((Class4) class4).anInt64 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_400_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_]))), class77.anInt652 * -576105833, i_409_, (byte) 111));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt64 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_])) << 25;
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_409_ = 255 * is_376_[i_401_] / (class77.anInt650 * -348036733);
							if (i_409_ < 0)
								i_409_ = 0;
							else if (i_409_ > 255)
								i_409_ = 255;
						} else
							i_409_ = 0;
						((Class4) class4).anInt60 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_401_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1]))), class77.anInt652 * -576105833, i_409_, (byte) 123));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt60 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1])) << 25;
						if (is_376_ != null && class77.anInt650 * -348036733 != 0) {
							i_409_ = 255 * is_376_[i_402_] / (class77.anInt650 * -348036733);
							if (i_409_ < 0)
								i_409_ = 0;
							else if (i_409_ > 255)
								i_409_ = 255;
						} else
							i_409_ = 0;
						((Class4) class4).anInt58 = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_402_] >> 8, ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_ + 1]))), class77.anInt652 * -576105833, i_409_, (byte) 7));
						if (((Class4) class4).anInt66 != 0)
							((Class4) class4).anInt58 |= 255 - ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_ + 1])) << 25;
						((Class4) class4).aShort67 = (short) -1;
					}
					if (is_376_ != null) {
						((Class4) class4).aShort57 = (short) is_376_[i_401_];
						((Class4) class4).aShort63 = (short) is_376_[i_402_];
						((Class4) class4).aShort61 = (short) is_376_[i_400_];
						((Class4) class4).aShort62 = (short) is_376_[i_399_];
					}
					((Class_xa_Sub3) this).aClass4ArrayArray8832[i][i_373_] = class4;
				} else {
					Class14 class14 = new Class14();
					((Class14) class14).aShort177 = (short) is.length;
					((Class14) class14).aShort185 = (short) (is.length / 3);
					((Class14) class14).aShortArray179 = new short[((Class14) class14).aShort177];
					((Class14) class14).aShortArray180 = new short[((Class14) class14).aShort177];
					((Class14) class14).aShortArray181 = new short[((Class14) class14).aShort177];
					((Class14) class14).anIntArray183 = new int[((Class14) class14).aShort177];
					if (is_376_ != null)
						((Class14) class14).aShortArray182 = new short[((Class14) class14).aShort177];
					for (int i_410_ = 0; i_410_ < ((Class14) class14).aShort177; i_410_++) {
						int i_411_ = is[i_410_];
						int i_412_ = is_375_[i_410_];
						boolean bool_413_ = false;
						int i_414_;
						if (i_411_ == 0 && i_412_ == 0)
							i_414_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_]));
						else if (i_411_ == 0 && i_412_ == anInt6395 * 550173571)
							i_414_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_ + 1]));
						else if (i_411_ == anInt6395 * 550173571 && i_412_ == anInt6395 * 550173571)
							i_414_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1]));
						else if (i_411_ == anInt6395 * 550173571 && i_412_ == 0)
							i_414_ = ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_]));
						else {
							int i_415_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_])) * (anInt6395 * 550173571 - i_411_)) + (((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_])) * i_411_));
							int i_416_ = ((((((Class_xa_Sub3) this).aByteArrayArray8860[i][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i][i_373_ + 1])) * (anInt6395 * 550173571 - i_411_)) + ((((Class_xa_Sub3) this).aByteArrayArray8860[i + 1][i_373_ + 1]) - (((Class_xa_Sub3) this).aByteArrayArray8858[i + 1][i_373_ + 1])) * i_411_);
							i_414_ = (i_415_ * (anInt6395 * 550173571 - i_412_) + i_416_ * i_412_ >> anInt6396 * -2132608442);
						}
						int i_417_ = (i << anInt6396 * -1066304221) + i_411_;
						int i_418_ = (i_373_ << anInt6396 * -1066304221) + i_412_;
						((Class14) class14).aShortArray179[i_410_] = (short) i_411_;
						((Class14) class14).aShortArray181[i_410_] = (short) i_412_;
						((Class14) class14).aShortArray180[i_410_] = (short) (method6416(i_417_, i_418_, -1034659155) + (is_374_ != null ? is_374_[i_410_] : 0));
						if (i_414_ < 0)
							i_414_ = 0;
						if (is_377_[i_410_] == 0) {
							if (is_378_ != null)
								((Class14) class14).anIntArray183[i_410_] = i_414_ << 25;
							else
								((Class14) class14).anIntArray183[i_410_] = 0;
						} else {
							int i_419_ = 0;
							if (is_376_ != null) {
								int i_420_ = (((Class14) class14).aShortArray182[i_410_] = (short) is_376_[i_410_]);
								if (class77.anInt650 * -348036733 != 0) {
									i_419_ = 255 * i_420_ / (class77.anInt650 * -348036733);
									if (i_419_ < 0)
										i_419_ = 0;
									else if (i_419_ > 255)
										i_419_ = 255;
								}
							}
							((Class14) class14).anIntArray183[i_410_] = (Class95_Sub12_Sub1.method1139(method6442(is_377_[i_410_] >> 8, i_414_), class77.anInt652 * -576105833, i_419_, (byte) 12));
							if (is_378_ != null)
								((Class14) class14).anIntArray183[i_410_] |= i_414_ << 25;
						}
					}
					boolean bool_421_ = false;
					for (int i_422_ = 0; i_422_ < ((Class14) class14).aShort185; i_422_++) {
						if (is_379_[i_422_ * 3] != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(is_379_[i_422_ * 3], -1003064196).aBoolean533))
							bool_421_ = true;
					}
					if (is_378_ != null)
						((Class14) class14).anIntArray186 = new int[((Class14) class14).aShort185];
					if (bool_421_) {
						((Class14) class14).aShortArray176 = new short[((Class14) class14).aShort185];
						((Class14) class14).aShortArray184 = new short[((Class14) class14).aShort185];
					}
					for (int i_423_ = 0; i_423_ < ((Class14) class14).aShort185; i_423_++) {
						int i_424_ = i_423_ * 3;
						if (is_378_ != null && is_378_[i_424_] != 0)
							((Class14) class14).anIntArray186[i_423_] = is_378_[i_424_] >> 8;
						if (bool_421_) {
							int i_425_ = i_424_ + 1;
							int i_426_ = i_425_ + 1;
							boolean bool_427_ = false;
							boolean bool_428_ = true;
							int i_429_ = is_379_[i_424_];
							if (i_429_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, -2010794146).aBoolean533))
								bool_428_ = false;
							else
								bool_427_ = true;
							i_429_ = is_379_[i_425_];
							if (i_429_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, -478928567).aBoolean533))
								bool_428_ = false;
							else
								bool_427_ = true;
							i_429_ = is_379_[i_426_];
							if (i_429_ == -1 || (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, -2046969811).aBoolean533))
								bool_428_ = false;
							else
								bool_427_ = true;
							if (bool_428_) {
								((Class14) class14).aShortArray176[i_423_] = (short) i_429_;
								((Class14) class14).aShortArray184[i_423_] = (short) is_380_[i_424_];
							} else {
								if (bool_427_) {
									i_429_ = is_379_[i_424_];
									if (i_429_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, 1649154611).aBoolean533))
										((Class14) class14).anIntArray183[i_424_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, 1475639993).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
									i_429_ = is_379_[i_425_];
									if (i_429_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, -1854515274).aBoolean533))
										((Class14) class14).anIntArray183[i_425_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, -23480291).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
									i_429_ = is_379_[i_426_];
									if (i_429_ != -1 && !(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, -1409891090).aBoolean533))
										((Class14) class14).anIntArray183[i_426_] = (Console.anIntArray4263[(Class356.modifyColor((((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_429_, -1149372548).aShort523) & 0xffff, (byte) 1)) & 0xffff]);
								}
								((Class14) class14).aShortArray176[i_423_] = (short) -1;
							}
						}
					}
					((Class_xa_Sub3) this).aClass14ArrayArray8842[i][i_373_] = class14;
				}
			}
		}
	}

	void method6446(int i, int i_430_, int i_431_, int i_432_, int i_433_, int i_434_, int i_435_, boolean[][] bools, Class6 class6, Class38 class38, float[] fs, float[] fs_436_) {
		int i_437_ = (i_435_ - i_433_) * i_431_ / 256;
		int i_438_ = i_431_ >> 8;
		boolean bool = ((Class6) class6).aBoolean111;
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848.RA(false);
		((Class38) class38).aBoolean384 = false;
		((Class38) class38).aBoolean383 = false;
		int i_439_ = i;
		int i_440_ = i_430_ + i_437_;
		for (int i_441_ = i_432_; i_441_ < i_434_; i_441_++) {
			for (int i_442_ = i_433_; i_442_ < i_435_; i_442_++) {
				if (bools[i_441_ - i_432_][i_442_ - i_433_]) {
					if ((((Class_xa_Sub3) this).aClass31ArrayArray8839[i_441_][i_442_]) != null) {
						Class31 class31 = (((Class_xa_Sub3) this).aClass31ArrayArray8839[i_441_][i_442_]);
						if (((Class31) class31).aShort358 != -1 && (((Class31) class31).aByte355 & 0x2) == 0 && ((Class31) class31).anInt357 == -1) {
							int i_443_ = (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5192(((Class31) class31).aShort358));
							class38.method544(true, true, false, (float) (i_440_ - i_438_), (float) (i_440_ - i_438_), (float) i_440_, (float) (i_439_ + i_438_), (float) i_439_, (float) (i_439_ + i_438_), 100.0F, 100.0F, 100.0F, (float) (Class330_Sub26_Sub1.method3395(i_443_, (((Class31) class31).aShort352 & 0xffff), -929632453)), (float) (Class330_Sub26_Sub1.method3395(i_443_, (((Class31) class31).aShort356 & 0xffff), -2002385742)), (float) (Class330_Sub26_Sub1.method3395(i_443_, (((Class31) class31).aShort354 & 0xffff), -2017523924)));
							class38.method544(true, true, false, (float) i_440_, (float) i_440_, (float) (i_440_ - i_438_), (float) i_439_, (float) (i_439_ + i_438_), (float) i_439_, 100.0F, 100.0F, 100.0F, (float) (Class330_Sub26_Sub1.method3395(i_443_, (((Class31) class31).aShort353 & 0xffff), -975672290)), (float) (Class330_Sub26_Sub1.method3395(i_443_, (((Class31) class31).aShort354 & 0xffff), -1889442372)), (float) (Class330_Sub26_Sub1.method3395(i_443_, (((Class31) class31).aShort356 & 0xffff), -432331062)));
						} else if (((Class31) class31).anInt357 == -1) {
							class38.method544(true, true, false, (float) (i_440_ - i_438_), (float) (i_440_ - i_438_), (float) i_440_, (float) (i_439_ + i_438_), (float) i_439_, (float) (i_439_ + i_438_), 100.0F, 100.0F, 100.0F, (float) (((Class31) class31).aShort352 & 0xffff), (float) (((Class31) class31).aShort356 & 0xffff), (float) (((Class31) class31).aShort354 & 0xffff));
							class38.method544(true, true, false, (float) i_440_, (float) i_440_, (float) (i_440_ - i_438_), (float) i_439_, (float) (i_439_ + i_438_), (float) i_439_, 100.0F, 100.0F, 100.0F, (float) (((Class31) class31).aShort353 & 0xffff), (float) (((Class31) class31).aShort354 & 0xffff), (float) (((Class31) class31).aShort356 & 0xffff));
						} else {
							int i_444_ = ((Class31) class31).anInt357;
							class38.method544(true, true, false, (float) (i_440_ - i_438_), (float) (i_440_ - i_438_), (float) i_440_, (float) (i_439_ + i_438_), (float) i_439_, (float) (i_439_ + i_438_), 100.0F, 100.0F, 100.0F, (float) i_444_, (float) i_444_, (float) i_444_);
							class38.method544(true, true, false, (float) i_440_, (float) i_440_, (float) (i_440_ - i_438_), (float) i_439_, (float) (i_439_ + i_438_), (float) i_439_, 100.0F, 100.0F, 100.0F, (float) i_444_, (float) i_444_, (float) i_444_);
						}
					} else if ((((Class_xa_Sub3) this).aClass17ArrayArray8840[i_441_][i_442_]) != null) {
						Class17 class17 = (((Class_xa_Sub3) this).aClass17ArrayArray8840[i_441_][i_442_]);
						for (int i_445_ = 0; i_445_ < ((Class17) class17).aShort217; i_445_++) {
							fs[i_445_] = (float) (i_439_ + ((((Class17) class17).aShortArray227[i_445_]) * i_438_ / (anInt6395 * 550173571)));
							fs_436_[i_445_] = (float) (i_440_ - ((((Class17) class17).aShortArray221[i_445_]) * i_438_ / (anInt6395 * 550173571)));
						}
						for (int i_446_ = 0; i_446_ < ((Class17) class17).aShort220; i_446_++) {
							short i_447_ = ((Class17) class17).aShortArray223[i_446_];
							short i_448_ = ((Class17) class17).aShortArray224[i_446_];
							short i_449_ = ((Class17) class17).aShortArray225[i_446_];
							float f = fs[i_447_];
							float f_450_ = fs[i_448_];
							float f_451_ = fs[i_449_];
							float f_452_ = fs_436_[i_447_];
							float f_453_ = fs_436_[i_448_];
							float f_454_ = fs_436_[i_449_];
							if (((Class17) class17).anIntArray229 != null && (((Class17) class17).anIntArray229[i_446_] != -1)) {
								int i_455_ = (((Class17) class17).anIntArray229[i_446_]);
								class38.method544(true, true, false, f_452_, f_453_, f_454_, f, f_450_, f_451_, 100.0F, 100.0F, 100.0F, (float) (Class330_Sub26_Sub1.method3395(i_455_, (((Class17) class17).aShortArray222[i_447_]), -2115240740)), (float) (Class330_Sub26_Sub1.method3395(i_455_, (((Class17) class17).aShortArray222[i_448_]), -1108589641)), (float) (Class330_Sub26_Sub1.method3395(i_455_, (((Class17) class17).aShortArray222[i_449_]), -1143954343)));
							} else if ((((Class17) class17).aShortArray226 != null) && (((Class17) class17).aShortArray226[i_446_]) != -1) {
								int i_456_ = (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5192(((Class17) class17).aShortArray226[i_446_]));
								class38.method544(true, true, false, f_452_, f_453_, f_454_, f, f_450_, f_451_, 100.0F, 100.0F, 100.0F, (float) (Class330_Sub26_Sub1.method3395(i_456_, (((Class17) class17).aShortArray222[i_447_]), -786729625)), (float) (Class330_Sub26_Sub1.method3395(i_456_, (((Class17) class17).aShortArray222[i_448_]), -1514840218)), (float) (Class330_Sub26_Sub1.method3395(i_456_, (((Class17) class17).aShortArray222[i_449_]), -1858352889)));
							} else {
								int i_457_ = (((Class17) class17).anIntArray228[i_446_]);
								class38.method544(true, true, false, f_452_, f_453_, f_454_, f, f_450_, f_451_, 100.0F, 100.0F, 100.0F, (float) (Class330_Sub26_Sub1.method3395(i_457_, (((Class17) class17).aShortArray222[i_447_]), -1881528283)), (float) (Class330_Sub26_Sub1.method3395(i_457_, (((Class17) class17).aShortArray222[i_448_]), -1267683334)), (float) (Class330_Sub26_Sub1.method3395(i_457_, (((Class17) class17).aShortArray222[i_449_]), -1121038589)));
							}
						}
					}
				}
				i_440_ -= i_438_;
			}
			i_440_ = i_430_ + i_437_;
			i_439_ += i_438_;
		}
		((Class38) class38).aBoolean384 = true;
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848.RA(bool);
	}

	boolean method6447(int i) {
		if ((((Class_xa_Sub3) this).anInt8838 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	public Class_na h(int i, int i_458_, Class_na class_na) {
		return null;
	}

	public void al(Class_na class_na, int i, int i_459_, int i_460_, int i_461_, boolean bool) {
		/* empty */
	}

	public void method6428(int i, int i_462_, int i_463_, int i_464_, int i_465_, int i_466_, int i_467_, boolean[][] bools) {
		Class6 class6 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		Class38 class38 = ((Class6) class6).aClass38_94;
		((Class38) class38).anInt402 = 0;
		((Class38) class38).aBoolean387 = true;
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5197();
		if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null || ((Class_xa_Sub3) this).aClass42ArrayArray8843 != null)
			method6448(i, i_462_, i_463_, i_464_, i_465_, i_466_, i_467_, bools, class6, class38, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122);
		else if (((Class_xa_Sub3) this).aClass31ArrayArray8839 != null)
			method6446(i, i_462_, i_463_, i_464_, i_465_, i_466_, i_467_, bools, class6, class38, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122);
	}

	public void SA() {
		((Class_xa_Sub3) this).aByteArrayArray8860 = null;
		((Class_xa_Sub3) this).aByteArrayArray8858 = null;
	}

	public Class_na y(int i, int i_468_, Class_na class_na) {
		return null;
	}

	void method6448(int i, int i_469_, int i_470_, int i_471_, int i_472_, int i_473_, int i_474_, boolean[][] bools, Class6 class6, Class38 class38, float[] fs, float[] fs_475_) {
		int i_476_ = (i_474_ - i_472_) * i_470_ / 256;
		int i_477_ = i_470_ >> 8;
		boolean bool = ((Class6) class6).aBoolean111;
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848.RA(false);
		((Class38) class38).aBoolean384 = false;
		((Class38) class38).aBoolean383 = false;
		int i_478_ = i;
		int i_479_ = i_469_ + i_476_;
		for (int i_480_ = i_471_; i_480_ < i_473_; i_480_++) {
			for (int i_481_ = i_472_; i_481_ < i_474_; i_481_++) {
				if (bools[i_480_ - i_471_][i_481_ - i_472_]) {
					if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null) {
						if ((((Class_xa_Sub3) this).aClass4ArrayArray8832[i_480_][i_481_]) != null) {
							Class4 class4 = (((Class_xa_Sub3) this).aClass4ArrayArray8832[i_480_][i_481_]);
							if (((Class4) class4).aShort67 != -1 && (((Class4) class4).aByte65 & 0x2) == 0 && ((Class4) class4).anInt66 == 0) {
								int i_482_ = (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5192(((Class4) class4).aShort67));
								class38.method544(true, true, false, (float) (i_479_ - i_477_), (float) (i_479_ - i_477_), (float) i_479_, (float) (i_478_ + i_477_), (float) i_478_, (float) (i_478_ + i_477_), 100.0F, 100.0F, 100.0F, (float) (Class330_Sub26_Sub1.method3395(i_482_, ((Class4) class4).anInt60, -1102852190)), (float) (Class330_Sub26_Sub1.method3395(i_482_, ((Class4) class4).anInt58, -1383035213)), (float) (Class330_Sub26_Sub1.method3395(i_482_, ((Class4) class4).anInt64, -437984137)));
								class38.method544(true, true, false, (float) i_479_, (float) i_479_, (float) (i_479_ - i_477_), (float) i_478_, (float) (i_478_ + i_477_), (float) i_478_, 100.0F, 100.0F, 100.0F, (float) (Class330_Sub26_Sub1.method3395(i_482_, ((Class4) class4).anInt59, -2069241891)), (float) (Class330_Sub26_Sub1.method3395(i_482_, ((Class4) class4).anInt64, -1210876116)), (float) (Class330_Sub26_Sub1.method3395(i_482_, ((Class4) class4).anInt58, -1801226598)));
							} else if (((Class4) class4).anInt66 == 0) {
								class38.method538(true, true, false, (float) (i_479_ - i_477_), (float) (i_479_ - i_477_), (float) i_479_, (float) (i_478_ + i_477_), (float) i_478_, (float) (i_478_ + i_477_), 100.0F, 100.0F, 100.0F, ((Class4) class4).anInt60, ((Class4) class4).anInt58, ((Class4) class4).anInt64);
								class38.method538(true, true, false, (float) i_479_, (float) i_479_, (float) (i_479_ - i_477_), (float) i_478_, (float) (i_478_ + i_477_), (float) i_478_, 100.0F, 100.0F, 100.0F, ((Class4) class4).anInt59, ((Class4) class4).anInt64, ((Class4) class4).anInt58);
							} else {
								int i_483_ = ((Class4) class4).anInt66;
								class38.method538(true, true, false, (float) (i_479_ - i_477_), (float) (i_479_ - i_477_), (float) i_479_, (float) (i_478_ + i_477_), (float) i_478_, (float) (i_478_ + i_477_), 100.0F, 100.0F, 100.0F, Class355.method4125(i_483_, ((((Class4) class4).anInt60) & ~0xffffff), -680411139), Class355.method4125(i_483_, ((((Class4) class4).anInt58) & ~0xffffff), -680411139), Class355.method4125(i_483_, ((((Class4) class4).anInt64) & ~0xffffff), -680411139));
								class38.method538(true, true, false, (float) i_479_, (float) i_479_, (float) (i_479_ - i_477_), (float) i_478_, (float) (i_478_ + i_477_), (float) i_478_, 100.0F, 100.0F, 100.0F, Class355.method4125(i_483_, ((((Class4) class4).anInt59) & ~0xffffff), -680411139), Class355.method4125(i_483_, ((((Class4) class4).anInt64) & ~0xffffff), -680411139), Class355.method4125(i_483_, ((((Class4) class4).anInt58) & ~0xffffff), -680411139));
							}
						} else if ((((Class_xa_Sub3) this).aClass14ArrayArray8842[i_480_][i_481_]) != null) {
							Class14 class14 = (((Class_xa_Sub3) this).aClass14ArrayArray8842[i_480_][i_481_]);
							for (int i_484_ = 0; i_484_ < ((Class14) class14).aShort177; i_484_++) {
								fs[i_484_] = (float) (i_478_ + ((((Class14) class14).aShortArray179[i_484_]) * i_477_ / (anInt6395 * 550173571)));
								fs_475_[i_484_] = (float) (i_479_ - ((((Class14) class14).aShortArray181[i_484_]) * i_477_ / (anInt6395 * 550173571)));
							}
							for (int i_485_ = 0; i_485_ < ((Class14) class14).aShort185; i_485_++) {
								int i_486_ = i_485_ * 3;
								int i_487_ = i_486_ + 1;
								int i_488_ = i_487_ + 1;
								float f = fs[i_486_];
								float f_489_ = fs[i_487_];
								float f_490_ = fs[i_488_];
								float f_491_ = fs_475_[i_486_];
								float f_492_ = fs_475_[i_487_];
								float f_493_ = fs_475_[i_488_];
								if (((Class14) class14).anIntArray186 != null && (((Class14) class14).anIntArray186[i_485_]) != 0 && ((((Class14) class14).aShortArray176 == null) || ((((Class14) class14).aShortArray176 != null) && ((((Class14) class14).aShortArray176[i_485_]) == -1)))) {
									int i_494_ = (((Class14) class14).anIntArray186[i_485_]);
									class38.method538(true, true, false, f_491_, f_492_, f_493_, f, f_489_, f_490_, 100.0F, 100.0F, 100.0F, (Class355.method4125(i_494_, -16777216 - ((((Class14) class14).anIntArray183[i_486_]) & ~0xffffff), -680411139)), (Class355.method4125(i_494_, -16777216 - ((((Class14) class14).anIntArray183[i_487_]) & ~0xffffff), -680411139)), (Class355.method4125(i_494_, -16777216 - ((((Class14) class14).anIntArray183[i_488_]) & ~0xffffff), -680411139)));
								} else if ((((Class14) class14).aShortArray176 != null) && ((((Class14) class14).aShortArray176[i_485_]) != -1)) {
									int i_495_ = (((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5192(((Class14) class14).aShortArray176[i_485_]));
									class38.method544(true, true, false, f_491_, f_492_, f_493_, f, f_489_, f_490_, 100.0F, 100.0F, 100.0F, (float) i_495_, (float) i_495_, (float) i_495_);
								} else
									class38.method538(true, true, false, f_491_, f_492_, f_493_, f, f_489_, f_490_, 100.0F, 100.0F, 100.0F, (((Class14) class14).anIntArray183[i_486_]), (((Class14) class14).anIntArray183[i_487_]), (((Class14) class14).anIntArray183[i_488_]));
							}
						}
					} else if ((((Class_xa_Sub3) this).aClass42ArrayArray8843[i_480_][i_481_]) != null) {
						Class42 class42 = (((Class_xa_Sub3) this).aClass42ArrayArray8843[i_480_][i_481_]);
						for (int i_496_ = 0; i_496_ < ((Class42) class42).aShort433; i_496_++) {
							fs[i_496_] = (float) (i_478_ + ((((Class42) class42).aShortArray432[i_496_]) * i_477_ / (anInt6395 * 550173571)));
							fs_475_[i_496_] = (float) (i_479_ - ((((Class42) class42).aShortArray434[i_496_]) * i_477_ / (anInt6395 * 550173571)));
						}
						for (int i_497_ = 0; i_497_ < ((Class42) class42).aShort430; i_497_++) {
							int i_498_ = i_497_ * 3;
							int i_499_ = i_498_ + 1;
							int i_500_ = i_499_ + 1;
							float f = fs[i_498_];
							float f_501_ = fs[i_499_];
							float f_502_ = fs[i_500_];
							float f_503_ = fs_475_[i_498_];
							float f_504_ = fs_475_[i_499_];
							float f_505_ = fs_475_[i_500_];
							if (((Class42) class42).anIntArray435 != null && (((Class42) class42).anIntArray435[i_497_] != 0)) {
								int i_506_ = (((Class42) class42).anIntArray435[i_497_]);
								class38.method538(true, true, false, f_503_, f_504_, f_505_, f, f_501_, f_502_, 100.0F, 100.0F, 100.0F, i_506_, i_506_, i_506_);
							} else
								class38.method538(true, true, false, f_503_, f_504_, f_505_, f, f_501_, f_502_, 100.0F, 100.0F, 100.0F, ((Class42) class42).anIntArray438[i_498_], ((Class42) class42).anIntArray438[i_499_], (((Class42) class42).anIntArray438[i_500_]));
						}
					}
				}
				i_479_ -= i_477_;
			}
			i_479_ = i_469_ + i_476_;
			i_478_ += i_477_;
		}
		((Class38) class38).aBoolean384 = true;
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848.RA(bool);
	}

	Class_xa_Sub3(Class_ra_Sub3 class_ra_sub3, int i, int i_507_, int i_508_, int i_509_, int[][] is, int[][] is_510_, int i_511_) {
		super(i_508_, i_509_, i_511_, is);
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848 = class_ra_sub3;
		((Class_xa_Sub3) this).anInt8838 = i_507_;
		((Class_xa_Sub3) this).aByteArrayArray8860 = new byte[i_508_ + 1][i_509_ + 1];
		int i_512_ = ((((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).anInt8645) * -581366659 >> 9);
		for (int i_513_ = 1; i_513_ < i_509_; i_513_++) {
			for (int i_514_ = 1; i_514_ < i_508_; i_514_++) {
				int i_515_ = i_512_;
				int i_516_ = (is_510_[i_514_ + 1][i_513_] - is_510_[i_514_ - 1][i_513_]);
				int i_517_ = (is_510_[i_514_][i_513_ + 1] - is_510_[i_514_][i_513_ - 1]);
				int i_518_ = (int) Math.sqrt((double) (i_516_ * i_516_ + 512 * i_511_ + i_517_ * i_517_));
				int i_519_ = (i_516_ << 8) / i_518_;
				int i_520_ = -512 * i_511_ / i_518_;
				int i_521_ = (i_517_ << 8) / i_518_;
				i_515_ += ((((Class_ra_Sub3) (((Class_xa_Sub3) this).aClass_ra_Sub3_8848)).anInt8625 * 1926837141 * i_519_) + (((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).anInt8626) * -1582112117 * i_520_ + (((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).anInt8627) * -1580311717 * i_521_) >> 17;
				i_515_ >>= 1;
				if (i_515_ < 2)
					i_515_ = 2;
				else if (i_515_ > 126)
					i_515_ = 126;
				((Class_xa_Sub3) this).aByteArrayArray8860[i_514_][i_513_] = (byte) i_515_;
			}
		}
		((Class_xa_Sub3) this).aByteArrayArray8858 = new byte[i_508_ + 1][i_509_ + 1];
	}

	void method6449(int i, int i_522_, boolean bool, Class6 class6, Class38 class38, float[] fs, float[] fs_523_, float[] fs_524_, float[] fs_525_, float[] fs_526_, int i_527_) {
		Class4 class4 = ((Class_xa_Sub3) this).aClass4ArrayArray8832[i][i_522_];
		if (class4 != null) {
			if ((((Class4) class4).aByte65 & 0x2) == 0) {
				if (i_527_ != 0) {
					if ((((Class4) class4).aByte65 & 0x4) != 0) {
						if ((i_527_ & 0x1) != 0)
							return;
					} else if ((i_527_ & 0x2) != 0)
						return;
				}
				int i_528_ = i * (anInt6395 * 550173571);
				int i_529_ = i_528_ + anInt6395 * 550173571;
				int i_530_ = i_522_ * (anInt6395 * 550173571);
				int i_531_ = i_530_ + anInt6395 * 550173571;
				float f = 0.0F;
				float f_532_ = 0.0F;
				float f_533_ = 0.0F;
				float f_534_ = 0.0F;
				float f_535_;
				float f_536_;
				float f_537_;
				float f_538_;
				float f_539_;
				float f_540_;
				float f_541_;
				float f_542_;
				float f_543_;
				float f_544_;
				float f_545_;
				float f_546_;
				float f_547_;
				float f_548_;
				float f_549_;
				float f_550_;
				if ((((Class4) class4).aByte65 & 0x1) != 0 && !bool) {
					int i_551_ = anIntArrayArray6394[i][i_522_];
					float f_552_ = ((Class_xa_Sub3) this).aFloat8850 * (float) i_551_;
					float f_553_ = ((Class_xa_Sub3) this).aFloat8864 * (float) i_551_;
					float f_554_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_528_) + f_552_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_530_)));
					f_535_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_528_) + f_553_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_530_)));
					if (f_554_ < -f_535_)
						return;
					float f_555_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_529_) + f_552_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_530_)));
					f_536_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_529_) + f_553_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_530_)));
					if (f_555_ < -f_536_)
						return;
					float f_556_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_529_) + f_552_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_531_)));
					f_537_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_529_) + f_553_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_531_)));
					if (f_556_ < -f_537_)
						return;
					float f_557_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_528_) + f_552_ + (((Class_xa_Sub3) this).aFloat8854 * (float) i_531_)));
					f_538_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_528_) + f_553_ + (((Class_xa_Sub3) this).aFloat8855 * (float) i_531_)));
					if (f_557_ < -f_538_)
						return;
					f_539_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_554_ / f_535_);
					f_540_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_555_ / f_536_);
					f_541_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_556_ / f_537_);
					f_542_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_557_ / f_538_);
					if (((Class6) class6).aBoolean86) {
						float f_558_ = f_554_ - ((Class6) class6).aFloat87;
						if (f_558_ > 0.0F) {
							f = f_558_ / ((Class6) class6).aFloat104;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_558_ = f_555_ - ((Class6) class6).aFloat87;
						if (f_558_ > 0.0F) {
							f_532_ = f_558_ / ((Class6) class6).aFloat104;
							if (f_532_ > 1.0F)
								f_532_ = 1.0F;
						}
						f_558_ = f_556_ - ((Class6) class6).aFloat87;
						if (f_558_ > 0.0F) {
							f_533_ = f_558_ / ((Class6) class6).aFloat104;
							if (f_533_ > 1.0F)
								f_533_ = 1.0F;
						}
						f_558_ = f_557_ - ((Class6) class6).aFloat87;
						if (f_558_ > 0.0F) {
							f_534_ = f_558_ / ((Class6) class6).aFloat104;
							if (f_534_ > 1.0F)
								f_534_ = 1.0F;
						}
					}
					float f_559_ = ((Class_xa_Sub3) this).aFloat8861 * (float) i_551_;
					float f_560_ = ((Class_xa_Sub3) this).aFloat8849 * (float) i_551_;
					float f_561_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_528_) + f_559_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_530_)));
					f_543_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_561_ / f_535_);
					float f_562_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_528_) + f_560_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_530_)));
					f_544_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_562_ / f_535_);
					float f_563_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_529_) + f_559_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_530_)));
					f_545_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_563_ / f_536_);
					float f_564_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_529_) + f_560_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_530_)));
					f_546_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_564_ / f_536_);
					float f_565_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_529_) + f_559_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_531_)));
					f_547_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_565_ / f_537_);
					float f_566_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_529_) + f_560_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_531_)));
					f_548_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_566_ / f_537_);
					float f_567_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_528_) + f_559_ + (((Class_xa_Sub3) this).aFloat8852 * (float) i_531_)));
					f_549_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_567_ / f_538_);
					float f_568_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_528_) + f_560_ + (((Class_xa_Sub3) this).aFloat8853 * (float) i_531_)));
					f_550_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_568_ / f_538_);
				} else {
					int i_569_ = anIntArrayArray6394[i][i_522_];
					int i_570_ = anIntArrayArray6394[i + 1][i_522_];
					int i_571_ = anIntArrayArray6394[i + 1][i_522_ + 1];
					int i_572_ = anIntArrayArray6394[i][i_522_ + 1];
					float f_573_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8850 * (float) i_569_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_530_)));
					f_535_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8864 * (float) i_569_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_530_)));
					if (f_573_ < -f_535_)
						return;
					float f_574_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8850 * (float) i_570_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_530_)));
					f_536_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8864 * (float) i_570_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_530_)));
					if (f_574_ < -f_536_)
						return;
					float f_575_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8850 * (float) i_571_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_531_)));
					f_537_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8864 * (float) i_571_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_531_)));
					if (f_575_ < -f_537_)
						return;
					float f_576_ = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8850 * (float) i_572_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_531_)));
					f_538_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8864 * (float) i_572_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_531_)));
					if (f_576_ < -f_538_)
						return;
					f_539_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_573_ / f_535_);
					f_540_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_574_ / f_536_);
					f_541_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_575_ / f_537_);
					f_542_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f_576_ / f_538_);
					if (bool) {
						float f_577_ = f_573_ - ((Class6) class6).aFloat87;
						if (f_577_ > 0.0F) {
							f_577_ /= ((Class6) class6).aFloat104;
							if (f_577_ > 1.0F)
								f_577_ = 1.0F;
							f = f_577_;
							int i_578_ = (int) ((float) ((Class4) class4).aShort62 * f_577_);
							if (i_578_ > 0)
								i_569_ -= i_578_;
						}
						f_577_ = f_574_ - ((Class6) class6).aFloat87;
						if (f_577_ > 0.0F) {
							f_577_ /= ((Class6) class6).aFloat104;
							if (f_577_ > 1.0F)
								f_577_ = 1.0F;
							f_532_ = f_577_;
							int i_579_ = (int) ((float) ((Class4) class4).aShort61 * f_577_);
							if (i_579_ > 0)
								i_570_ -= i_579_;
						}
						f_577_ = f_575_ - ((Class6) class6).aFloat87;
						if (f_577_ > 0.0F) {
							f_577_ /= ((Class6) class6).aFloat104;
							if (f_577_ > 1.0F)
								f_577_ = 1.0F;
							f_533_ = f_577_;
							int i_580_ = (int) ((float) ((Class4) class4).aShort57 * f_577_);
							if (i_580_ > 0)
								i_571_ -= i_580_;
						}
						f_577_ = f_576_ - ((Class6) class6).aFloat87;
						if (f_577_ > 0.0F) {
							f_577_ /= ((Class6) class6).aFloat104;
							if (f_577_ > 1.0F)
								f_577_ = 1.0F;
							f_534_ = f_577_;
							int i_581_ = (int) ((float) ((Class4) class4).aShort63 * f_577_);
							if (i_581_ > 0)
								i_572_ -= i_581_;
						}
					} else if (((Class6) class6).aBoolean86) {
						float f_582_ = f_573_ - ((Class6) class6).aFloat87;
						if (f_582_ > 0.0F) {
							f = f_582_ / ((Class6) class6).aFloat104;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_582_ = f_574_ - ((Class6) class6).aFloat87;
						if (f_582_ > 0.0F) {
							f_532_ = f_582_ / ((Class6) class6).aFloat104;
							if (f_532_ > 1.0F)
								f_532_ = 1.0F;
						}
						f_582_ = f_575_ - ((Class6) class6).aFloat87;
						if (f_582_ > 0.0F) {
							f_533_ = f_582_ / ((Class6) class6).aFloat104;
							if (f_533_ > 1.0F)
								f_533_ = 1.0F;
						}
						f_582_ = f_576_ - ((Class6) class6).aFloat87;
						if (f_582_ > 0.0F) {
							f_534_ = f_582_ / ((Class6) class6).aFloat104;
							if (f_534_ > 1.0F)
								f_534_ = 1.0F;
						}
					}
					float f_583_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8861 * (float) i_569_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_530_)));
					f_543_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_583_ / f_535_);
					float f_584_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8849 * (float) i_569_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_530_)));
					f_544_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_584_ / f_535_);
					float f_585_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8861 * (float) i_570_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_530_)));
					f_545_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_585_ / f_536_);
					float f_586_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8849 * (float) i_570_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_530_)));
					f_546_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_586_ / f_536_);
					float f_587_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8861 * (float) i_571_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_531_)));
					f_547_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_587_ / f_537_);
					float f_588_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_529_) + (((Class_xa_Sub3) this).aFloat8849 * (float) i_571_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_531_)));
					f_548_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_588_ / f_537_);
					float f_589_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8861 * (float) i_572_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_531_)));
					f_549_ = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_589_ / f_538_);
					float f_590_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_528_) + (((Class_xa_Sub3) this).aFloat8849 * (float) i_572_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_531_)));
					f_550_ = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_590_ / f_538_);
				}
				boolean bool_591_ = (((Class4) class4).aShort67 != -1 && method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(((Class4) class4).aShort67, 898771112).aByte525));
				float f_592_ = f_532_ + f_533_ + f_534_;
				if (((f_547_ - f_549_) * (f_546_ - f_550_) - (f_548_ - f_550_) * (f_545_ - f_549_)) > 0.0F) {
					((Class38) class38).aBoolean387 = (f_547_ < 0.0F || f_549_ < 0.0F || f_545_ < 0.0F || f_547_ > (float) ((Class38) class38).anInt396 || f_549_ > (float) ((Class38) class38).anInt396 || f_545_ > (float) ((Class38) class38).anInt396);
					if (f_592_ < 3.0F) {
						if (f_592_ > 0.0F) {
							if (((Class4) class4).aShort67 >= 0) {
								int i_593_ = -16777216;
								if (bool_591_)
									i_593_ = -1694498816;
								class38.method541(true, true, false, f_548_, f_550_, f_546_, f_547_, f_549_, f_545_, f_541_, f_542_, f_540_, f_537_, f_538_, f_536_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, (i_593_ | ((Class4) class4).anInt60 & 0xffffff), (i_593_ | ((Class4) class4).anInt58 & 0xffffff), (i_593_ | ((Class4) class4).anInt64 & 0xffffff), ((Class6) class6).anInt88 * 536502941, f_533_ * 255.0F, f_534_ * 255.0F, f_532_ * 255.0F, ((Class4) class4).aShort67);
							} else {
								if (bool_591_)
									((Class38) class38).anInt402 = 100;
								class38.method538(true, true, false, f_548_, f_550_, f_546_, f_547_, f_549_, f_545_, f_541_, f_542_, f_540_, (Class355.method4125(((Class4) class4).anInt60, ((int) (f_533_ * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)), (Class355.method4125(((Class4) class4).anInt58, ((int) (f_534_ * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)), (Class355.method4125(((Class4) class4).anInt64, ((int) (f_532_ * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)));
								((Class38) class38).anInt402 = 0;
							}
						} else if (((Class4) class4).aShort67 >= 0) {
							int i_594_ = -16777216;
							if (bool_591_)
								i_594_ = -1694498816;
							class38.method541(true, true, false, f_548_, f_550_, f_546_, f_547_, f_549_, f_545_, f_541_, f_542_, f_540_, f_537_, f_538_, f_536_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_594_ | ((Class4) class4).anInt60 & 0xffffff, i_594_ | ((Class4) class4).anInt58 & 0xffffff, i_594_ | ((Class4) class4).anInt64 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class4) class4).aShort67);
						} else {
							if (bool_591_)
								((Class38) class38).anInt402 = 100;
							class38.method538(true, true, false, f_548_, f_550_, f_546_, f_547_, f_549_, f_545_, f_541_, f_542_, f_540_, ((Class4) class4).anInt60, ((Class4) class4).anInt58, ((Class4) class4).anInt64);
							((Class38) class38).anInt402 = 0;
						}
					} else
						class38.method539(true, true, false, f_548_, f_550_, f_546_, f_547_, f_549_, f_545_, f_541_, f_542_, f_540_, (((Class6) class6).anInt88 * 536502941));
				}
				f_592_ = f + f_532_ + f_534_;
				if (((f_543_ - f_545_) * (f_550_ - f_546_) - (f_544_ - f_546_) * (f_549_ - f_545_)) > 0.0F) {
					((Class38) class38).aBoolean387 = (f_543_ < 0.0F || f_545_ < 0.0F || f_549_ < 0.0F || f_543_ > (float) ((Class38) class38).anInt396 || f_545_ > (float) ((Class38) class38).anInt396 || f_549_ > (float) ((Class38) class38).anInt396);
					if (f_592_ < 3.0F) {
						if (bool_591_)
							((Class38) class38).anInt402 = -1694498816;
						if (f_592_ > 0.0F) {
							if (((Class4) class4).aShort67 >= 0) {
								int i_595_ = -16777216;
								if (bool_591_)
									i_595_ = -1694498816;
								class38.method541(true, true, false, f_544_, f_546_, f_550_, f_543_, f_545_, f_549_, f_539_, f_540_, f_542_, f_535_, f_536_, f_538_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, (i_595_ | ((Class4) class4).anInt59 & 0xffffff), (i_595_ | ((Class4) class4).anInt64 & 0xffffff), (i_595_ | ((Class4) class4).anInt58 & 0xffffff), ((Class6) class6).anInt88 * 536502941, f * 255.0F, f_532_ * 255.0F, f_534_ * 255.0F, ((Class4) class4).aShort67);
							} else {
								if (bool_591_)
									((Class38) class38).anInt402 = 100;
								class38.method538(true, true, false, f_544_, f_546_, f_550_, f_543_, f_545_, f_549_, f_539_, f_540_, f_542_, Class355.method4125((((Class4) class4).anInt59), (((int) (f * 255.0F) << 24) | ((((Class6) class6).anInt88) * 536502941)), -680411139), (Class355.method4125(((Class4) class4).anInt64, ((int) (f_532_ * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)), (Class355.method4125(((Class4) class4).anInt58, ((int) (f_534_ * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)));
								((Class38) class38).anInt402 = 0;
							}
						} else if (((Class4) class4).aShort67 >= 0) {
							int i_596_ = -16777216;
							if (bool_591_)
								i_596_ = -1694498816;
							class38.method541(true, true, false, f_544_, f_546_, f_550_, f_543_, f_545_, f_549_, f_539_, f_540_, f_542_, f_535_, f_536_, f_538_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_596_ | ((Class4) class4).anInt59 & 0xffffff, i_596_ | ((Class4) class4).anInt64 & 0xffffff, i_596_ | ((Class4) class4).anInt58 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, ((Class4) class4).aShort67);
						} else {
							if (bool_591_)
								((Class38) class38).anInt402 = 100;
							class38.method538(true, true, false, f_544_, f_546_, f_550_, f_543_, f_545_, f_549_, f_539_, f_540_, f_542_, ((Class4) class4).anInt59, ((Class4) class4).anInt64, ((Class4) class4).anInt58);
							((Class38) class38).anInt402 = 0;
						}
					} else
						class38.method539(true, true, false, f_544_, f_546_, f_550_, f_543_, f_545_, f_549_, f_539_, f_540_, f_542_, (((Class6) class6).anInt88 * 536502941));
				}
			}
		} else {
			Class14 class14 = ((Class_xa_Sub3) this).aClass14ArrayArray8842[i][i_522_];
			if (class14 != null) {
				if (i_527_ != 0) {
					if ((((Class14) class14).aByte178 & 0x4) != 0) {
						if ((i_527_ & 0x1) != 0)
							return;
					} else if ((i_527_ & 0x2) != 0)
						return;
				}
				for (int i_597_ = 0; i_597_ < ((Class14) class14).aShort177; i_597_++) {
					int i_598_ = (((Class14) class14).aShortArray179[i_597_] + (i << anInt6396 * -1066304221));
					int i_599_ = ((Class14) class14).aShortArray180[i_597_];
					int i_600_ = (((Class14) class14).aShortArray181[i_597_] + (i_522_ << anInt6396 * -1066304221));
					float f = (((Class_xa_Sub3) this).aFloat8857 + ((((Class_xa_Sub3) this).aFloat8836 * (float) i_598_) + (((Class_xa_Sub3) this).aFloat8850 * (float) i_599_) + (((Class_xa_Sub3) this).aFloat8854 * (float) i_600_)));
					float f_601_ = (((Class_xa_Sub3) this).aFloat8859 + ((((Class_xa_Sub3) this).aFloat8846 * (float) i_598_) + (((Class_xa_Sub3) this).aFloat8864 * (float) i_599_) + (((Class_xa_Sub3) this).aFloat8855 * (float) i_600_)));
					if (f < -f_601_)
						return;
					float f_602_ = (((Class38) class38).aFloat394 + ((Class38) class38).aFloat395 * f / f_601_);
					fs_526_[i_597_] = 0.0F;
					if (bool) {
						float f_603_ = f - ((Class6) class6).aFloat87;
						if (f_603_ > 0.0F) {
							f_603_ /= ((Class6) class6).aFloat104;
							if (f_603_ > 1.0F)
								f_603_ = 1.0F;
							fs_526_[i_597_] = f_603_;
							int i_604_ = (int) ((float) (((Class14) class14).aShortArray182[i_597_]) * f_603_);
							if (i_604_ > 0)
								i_599_ -= i_604_;
						}
					} else if (((Class6) class6).aBoolean86) {
						float f_605_ = f - ((Class6) class6).aFloat87;
						if (f_605_ > 0.0F) {
							fs_526_[i_597_] = f_605_ / ((Class6) class6).aFloat104;
							if (fs_526_[i_597_] > 1.0F)
								fs_526_[i_597_] = 1.0F;
						}
					}
					float f_606_ = (((Class_xa_Sub3) this).aFloat8863 + ((((Class_xa_Sub3) this).aFloat8844 * (float) i_598_) + (((Class_xa_Sub3) this).aFloat8861 * (float) i_599_) + (((Class_xa_Sub3) this).aFloat8852 * (float) i_600_)));
					float f_607_ = (((Class_xa_Sub3) this).aFloat8847 + ((((Class_xa_Sub3) this).aFloat8845 * (float) i_598_) + (((Class_xa_Sub3) this).aFloat8849 * (float) i_599_) + (((Class_xa_Sub3) this).aFloat8853 * (float) i_600_)));
					fs[i_597_] = (((Class38) class38).aFloat411 + ((Class38) class38).aFloat391 * f_606_ / f_601_);
					fs_523_[i_597_] = (((Class38) class38).aFloat392 + ((Class38) class38).aFloat420 * f_607_ / f_601_);
					fs_524_[i_597_] = f_602_;
					fs_525_[i_597_] = f_601_;
				}
				if (((Class14) class14).aShortArray176 != null) {
					for (int i_608_ = 0; i_608_ < ((Class14) class14).aShort185; i_608_++) {
						int i_609_ = i_608_ * 3;
						int i_610_ = i_609_ + 1;
						int i_611_ = i_610_ + 1;
						float f = fs[i_609_];
						float f_612_ = fs[i_610_];
						float f_613_ = fs[i_611_];
						float f_614_ = fs_523_[i_609_];
						float f_615_ = fs_523_[i_610_];
						float f_616_ = fs_523_[i_611_];
						float f_617_ = (fs_526_[i_609_] + fs_526_[i_610_] + fs_526_[i_611_]);
						if (((f - f_612_) * (f_616_ - f_615_) - (f_614_ - f_615_) * (f_613_ - f_612_)) > 0.0F) {
							((Class38) class38).aBoolean387 = (f < 0.0F || f_612_ < 0.0F || f_613_ < 0.0F || f > (float) ((Class38) class38).anInt396 || (f_612_ > (float) ((Class38) class38).anInt396) || f_613_ > (float) (((Class38) class38).anInt396));
							short i_618_ = ((Class14) class14).aShortArray176[i_608_];
							if (f_617_ < 3.0F) {
								if (f_617_ > 0.0F) {
									if (i_618_ != -1) {
										int i_619_ = -16777216;
										if (i_618_ != -1 && (method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_618_, 104908176).aByte525)))
											i_619_ = -1694498816;
										class38.method541(true, true, false, f_614_, f_615_, f_616_, f, f_612_, f_613_, fs_524_[i_609_], fs_524_[i_610_], fs_524_[i_611_], fs_525_[i_609_], fs_525_[i_610_], fs_525_[i_611_], ((float) (((Class14) class14).aShortArray179[i_609_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray179[i_610_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray179[i_611_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray181[i_609_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray181[i_610_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray181[i_611_]) / (float) (anInt6395 * 550173571)), i_619_ | ((((Class14) class14).anIntArray183[i_609_]) & 0xffffff), i_619_ | ((((Class14) class14).anIntArray183[i_610_]) & 0xffffff), i_619_ | ((((Class14) class14).anIntArray183[i_611_]) & 0xffffff), (((Class6) class6).anInt88 * 536502941), fs_526_[i_609_] * 255.0F, fs_526_[i_610_] * 255.0F, fs_526_[i_611_] * 255.0F, i_618_);
									} else if (((((Class14) class14).anIntArray183[i_609_]) & 0xffffff) != 0) {
										if (i_618_ != -1 && (method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_618_, 567185265).aByte525)))
											((Class38) class38).anInt402 = -1694498816;
										class38.method538(true, true, false, f_614_, f_615_, f_616_, f, f_612_, f_613_, fs_524_[i_609_], fs_524_[i_610_], fs_524_[i_611_], (Class355.method4125((((Class14) class14).anIntArray183[i_609_]), ((int) (fs_526_[i_609_] * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)), (Class355.method4125((((Class14) class14).anIntArray183[i_610_]), ((int) (fs_526_[i_610_] * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)), (Class355.method4125((((Class14) class14).anIntArray183[i_611_]), ((int) (fs_526_[i_611_] * 255.0F) << 24 | (((Class6) class6).anInt88 * 536502941)), -680411139)));
										((Class38) class38).anInt402 = 0;
									}
								} else if (i_618_ != -1) {
									int i_620_ = -16777216;
									if (i_618_ != -1 && method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_618_, -1780427458).aByte525))
										i_620_ = -1694498816;
									class38.method541(true, true, false, f_614_, f_615_, f_616_, f, f_612_, f_613_, fs_524_[i_609_], fs_524_[i_610_], fs_524_[i_611_], fs_525_[i_609_], fs_525_[i_610_], fs_525_[i_611_], ((float) (((Class14) class14).aShortArray179[i_609_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray179[i_610_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray179[i_611_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray181[i_609_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray181[i_610_]) / (float) (anInt6395 * 550173571)), ((float) (((Class14) class14).aShortArray181[i_611_]) / (float) (anInt6395 * 550173571)), i_620_ | ((((Class14) class14).anIntArray183[i_609_]) & 0xffffff), i_620_ | ((((Class14) class14).anIntArray183[i_610_]) & 0xffffff), i_620_ | ((((Class14) class14).anIntArray183[i_611_]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, i_618_);
								} else if (((((Class14) class14).anIntArray183[i_609_]) & 0xffffff) != 0) {
									if (i_618_ != -1 && method6447(((Class_xa_Sub3) this).aClass_ra_Sub3_8848.anInterface_ma4227.method221(i_618_, 1024870057).aByte525))
										((Class38) class38).anInt402 = -1694498816;
									class38.method538(true, true, false, f_614_, f_615_, f_616_, f, f_612_, f_613_, fs_524_[i_609_], fs_524_[i_610_], fs_524_[i_611_], (((Class14) class14).anIntArray183[i_609_]), (((Class14) class14).anIntArray183[i_610_]), (((Class14) class14).anIntArray183[i_611_]));
									((Class38) class38).anInt402 = 0;
								}
							} else
								class38.method539(true, true, false, f_614_, f_615_, f_616_, f, f_612_, f_613_, fs_524_[i_609_], fs_524_[i_610_], fs_524_[i_611_], (((Class6) class6).anInt88 * 536502941));
						}
					}
				} else {
					for (int i_621_ = 0; i_621_ < ((Class14) class14).aShort185; i_621_++) {
						int i_622_ = i_621_ * 3;
						int i_623_ = i_622_ + 1;
						int i_624_ = i_623_ + 1;
						float f = fs[i_622_];
						float f_625_ = fs[i_623_];
						float f_626_ = fs[i_624_];
						float f_627_ = fs_523_[i_622_];
						float f_628_ = fs_523_[i_623_];
						float f_629_ = fs_523_[i_624_];
						float f_630_ = (fs_526_[i_622_] + fs_526_[i_623_] + fs_526_[i_624_]);
						if (((f - f_625_) * (f_629_ - f_628_) - (f_627_ - f_628_) * (f_626_ - f_625_)) > 0.0F) {
							((Class38) class38).aBoolean387 = (f < 0.0F || f_625_ < 0.0F || f_626_ < 0.0F || f > (float) ((Class38) class38).anInt396 || (f_625_ > (float) ((Class38) class38).anInt396) || f_626_ > (float) (((Class38) class38).anInt396));
							if (f_630_ < 3.0F) {
								if (f_630_ > 0.0F) {
									if (((((Class14) class14).anIntArray183[i_622_]) & 0xffffff) != 0)
										class38.method538(true, true, false, f_627_, f_628_, f_629_, f, f_625_, f_626_, fs_524_[i_622_], fs_524_[i_623_], fs_524_[i_624_], (Class442.method5612((((Class14) class14).anIntArray183[i_622_]), (((Class6) class6).anInt88 * 536502941), fs_526_[i_622_] * 255.0F, -1027106511)), (Class442.method5612((((Class14) class14).anIntArray183[i_623_]), (((Class6) class6).anInt88 * 536502941), fs_526_[i_623_] * 255.0F, -1027106511)), (Class442.method5612((((Class14) class14).anIntArray183[i_624_]), (((Class6) class6).anInt88 * 536502941), fs_526_[i_624_] * 255.0F, -1027106511)));
								} else if (((((Class14) class14).anIntArray183[i_622_]) & 0xffffff) != 0)
									class38.method538(true, true, false, f_627_, f_628_, f_629_, f, f_625_, f_626_, fs_524_[i_622_], fs_524_[i_623_], fs_524_[i_624_], (((Class14) class14).anIntArray183[i_622_]), (((Class14) class14).anIntArray183[i_623_]), (((Class14) class14).anIntArray183[i_624_]));
							} else
								class38.method539(true, true, false, f_627_, f_628_, f_629_, f, f_625_, f_626_, fs_524_[i_622_], fs_524_[i_623_], fs_524_[i_624_], (((Class6) class6).anInt88 * 536502941));
						}
					}
				}
			}
		}
	}

	public void method6426(Class330_Sub14 class330_sub14, int[] is) {
		/* empty */
	}

	public void method6427(Class330_Sub14 class330_sub14, int[] is) {
		/* empty */
	}

	public void method6412(int i, int i_631_, int i_632_, int i_633_, int i_634_, int i_635_, int i_636_, boolean[][] bools) {
		Class6 class6 = ((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5206(Thread.currentThread());
		Class38 class38 = ((Class6) class6).aClass38_94;
		((Class38) class38).anInt402 = 0;
		((Class38) class38).aBoolean387 = true;
		((Class_xa_Sub3) this).aClass_ra_Sub3_8848.method5197();
		if (((Class_xa_Sub3) this).aClass4ArrayArray8832 != null || ((Class_xa_Sub3) this).aClass42ArrayArray8843 != null)
			method6448(i, i_631_, i_632_, i_633_, i_634_, i_635_, i_636_, bools, class6, class38, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122);
		else if (((Class_xa_Sub3) this).aClass31ArrayArray8839 != null)
			method6446(i, i_631_, i_632_, i_633_, i_634_, i_635_, i_636_, bools, class6, class38, ((Class6) class6).aFloatArray84, ((Class6) class6).aFloatArray122);
	}

	public void method6421(int i, int i_637_, int i_638_, boolean[][] bools, boolean bool, int i_639_) {
		if ((((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).anIntArray8630) == null || (((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).aFloatArray8620) == null)
			throw new IllegalStateException("");
		Class249 class249 = (((Class_ra_Sub3) ((Class_xa_Sub3) this).aClass_ra_Sub3_8848).aClass249_8634);
		((Class_xa_Sub3) this).aFloat8844 = class249.aFloatArray2631[0];
		((Class_xa_Sub3) this).aFloat8845 = class249.aFloatArray2631[1];
		((Class_xa_Sub3) this).aFloat8836 = class249.aFloatArray2631[2];
		((Class_xa_Sub3) this).aFloat8846 = class249.aFloatArray2631[3];
		((Class_xa_Sub3) this).aFloat8861 = class249.aFloatArray2631[4];
		((Class_xa_Sub3) this).aFloat8849 = class249.aFloatArray2631[5];
		((Class_xa_Sub3) this).aFloat8850 = class249.aFloatArray2631[6];
		((Class_xa_Sub3) this).aFloat8864 = class249.aFloatArray2631[7];
		((Class_xa_Sub3) this).aFloat8852 = class249.aFloatArray2631[8];
		((Class_xa_Sub3) this).aFloat8853 = class249.aFloatArray2631[9];
		((Class_xa_Sub3) this).aFloat8854 = class249.aFloatArray2631[10];
		((Class_xa_Sub3) this).aFloat8855 = class249.aFloatArray2631[11];
		((Class_xa_Sub3) this).aFloat8863 = class249.aFloatArray2631[12];
		((Class_xa_Sub3) this).aFloat8847 = class249.aFloatArray2631[13];
		((Class_xa_Sub3) this).aFloat8857 = class249.aFloatArray2631[14];
		((Class_xa_Sub3) this).aFloat8859 = class249.aFloatArray2631[15];
		for (int i_640_ = 0; i_640_ < i_638_ + i_638_; i_640_++) {
			for (int i_641_ = 0; i_641_ < i_638_ + i_638_; i_641_++) {
				if (bools[i_640_][i_641_]) {
					int i_642_ = i - i_638_ + i_640_;
					int i_643_ = i_637_ - i_638_ + i_641_;
					if (i_642_ >= 0 && i_642_ < anInt6397 * 1972554729 && i_643_ >= 0 && i_643_ < anInt6393 * 24567321)
						method6443(i_642_, i_643_, i_639_);
				}
			}
		}
	}

	public void as(Class_na class_na, int i, int i_644_, int i_645_, int i_646_, boolean bool) {
		/* empty */
	}

	public void aj(Class_na class_na, int i, int i_647_, int i_648_, int i_649_, boolean bool) {
		/* empty */
	}
}
