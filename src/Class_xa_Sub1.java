/* Class_xa_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class_xa_Sub1 extends Class_xa {
	byte[][] aByteArrayArray8755;
	short[][] aShortArrayArray8756;
	Class_ra_Sub1 aClass_ra_Sub1_8757;
	float[][] aFloatArrayArray8758;
	int anInt8759;
	int anInt8760;
	int anInt8761;
	int[][][] anIntArrayArrayArray8762;
	Class497 aClass497_8763;
	Class330_Sub16[][][] aClass330_Sub16ArrayArrayArray8764;
	Class471 aClass471_8765 = new Class471();
	byte[][] aByteArrayArray8766;
	Class44 aClass44_8767;
	static int anInt8768 = 1;
	int[][][] anIntArrayArrayArray8769;
	int[][][] anIntArrayArrayArray8770;
	int[][][] anIntArrayArrayArray8771;
	int[][][] anIntArrayArrayArray8772;
	Class58 aClass58_8773;
	int anInt8774;
	Class330[] aClass330Array8775;
	Interface1 anInterface1_8776;
	Class44 aClass44_8777;
	Class44 aClass44_8778;
	int anInt8779;
	Class44 aClass44_8780;
	int anInt8781;
	int anInt8782;
	int anInt8783;
	float[][] aFloatArrayArray8784;
	float[][] aFloatArrayArray8785;
	int[][][] anIntArrayArrayArray8786;
	static int anInt8787 = 74;
	static float[] aFloatArray8788 = new float[16];

	public void ac(Class_na class_na, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_3_ = (i - (i_0_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8410) >> 8) >> ((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8296);
			int i_4_ = (i_1_ - (i_0_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method662(class_na, i_3_, i_4_);
		}
	}

	public void LA(int i, int i_5_, int i_6_) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_5_] & 0xff) < i_6_)
			((Class_xa_Sub1) this).aByteArrayArray8766[i][i_5_] = (byte) i_6_;
	}

	public void method6425(int i, int i_7_, int[] is, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, Class77 class77, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.anInterface_ma4227;
		if (is_10_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8771 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8771 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		if (is_8_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8770 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8770 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8786[i][i_7_] = is;
		((Class_xa_Sub1) this).anIntArrayArrayArray8769[i][i_7_] = is_9_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8762[i][i_7_] = is_11_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8772[i][i_7_] = is_12_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8771[i][i_7_] = is_10_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8770 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8770[i][i_7_] = is_8_;
		Class330_Sub16[] class330_sub16s = (((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764[i][i_7_] = new Class330_Sub16[is_11_.length]);
		for (int i_15_ = 0; i_15_ < is_11_.length; i_15_++) {
			int i_16_ = is_13_[i_15_];
			int i_17_ = is_14_[i_15_];
			if ((((Class_xa_Sub1) this).anInt8761 & 0x20) != 0 && i_16_ != -1 && interface_ma.method221(i_16_, 928735036).aBoolean533) {
				i_17_ = 128;
				i_16_ = -1;
			}
			long l = ((long) (class77.anInt651 * -892945375) << 48 | (long) (class77.anInt650 * -348036733) << 42 | (long) (class77.anInt652 * -576105833) << 28 | (long) (i_17_ << 14) | (long) i_16_);
			Class330 class330;
			for (class330 = ((Class_xa_Sub1) this).aClass497_8763.method6094(l); class330 != null; class330 = ((Class_xa_Sub1) this).aClass497_8763.method6095(107460649)) {
				Class330_Sub16 class330_sub16 = (Class330_Sub16) class330;
				if (((Class330_Sub16) class330_sub16).anInt7617 == i_16_ && (((Class330_Sub16) class330_sub16).aFloat7618 == (float) i_17_) && ((Class330_Sub16) class330_sub16).aClass77_7615.method925(class77, 215970799))
					break;
			}
			if (class330 == null) {
				class330_sub16s[i_15_] = new Class330_Sub16(this, i_16_, i_17_, class77);
				((Class_xa_Sub1) this).aClass497_8763.method6097(class330_sub16s[i_15_], l);
			} else
				class330_sub16s[i_15_] = (Class330_Sub16) class330;
		}
		if (bool)
			((Class_xa_Sub1) this).aByteArrayArray8755[i][i_7_] |= 0x1;
		if (is_11_.length > ((Class_xa_Sub1) this).anInt8782)
			((Class_xa_Sub1) this).anInt8782 = is_11_.length;
		((Class_xa_Sub1) this).anInt8781 += is_11_.length;
	}

	public void method6413(int i, int i_18_, int[] is, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, Class77 class77, boolean bool) {
		int i_29_ = is_25_.length;
		int[] is_30_ = new int[i_29_ * 3];
		int[] is_31_ = new int[i_29_ * 3];
		int[] is_32_ = new int[i_29_ * 3];
		int[] is_33_ = is_26_ != null ? new int[i_29_ * 3] : null;
		int[] is_34_ = new int[i_29_ * 3];
		int[] is_35_ = new int[i_29_ * 3];
		int[] is_36_ = is_19_ != null ? new int[i_29_ * 3] : null;
		int[] is_37_ = is_21_ != null ? new int[i_29_ * 3] : null;
		int i_38_ = 0;
		for (int i_39_ = 0; i_39_ < i_29_; i_39_++) {
			int i_40_ = is_22_[i_39_];
			int i_41_ = is_23_[i_39_];
			int i_42_ = is_24_[i_39_];
			is_30_[i_38_] = is[i_40_];
			is_31_[i_38_] = is_20_[i_40_];
			is_32_[i_38_] = is_25_[i_39_];
			is_34_[i_38_] = is_27_[i_39_];
			is_35_[i_38_] = is_28_[i_39_];
			if (is_26_ != null)
				is_33_[i_38_] = is_26_[i_39_];
			if (is_19_ != null)
				is_36_[i_38_] = is_19_[i_40_];
			if (is_21_ != null)
				is_37_[i_38_] = is_21_[i_40_];
			i_38_++;
			is_30_[i_38_] = is[i_41_];
			is_31_[i_38_] = is_20_[i_41_];
			is_32_[i_38_] = is_25_[i_39_];
			is_34_[i_38_] = is_27_[i_39_];
			is_35_[i_38_] = is_28_[i_39_];
			if (is_26_ != null)
				is_33_[i_38_] = is_26_[i_39_];
			if (is_19_ != null)
				is_36_[i_38_] = is_19_[i_41_];
			if (is_21_ != null)
				is_37_[i_38_] = is_21_[i_41_];
			i_38_++;
			is_30_[i_38_] = is[i_42_];
			is_31_[i_38_] = is_20_[i_42_];
			is_32_[i_38_] = is_25_[i_39_];
			is_34_[i_38_] = is_27_[i_39_];
			is_35_[i_38_] = is_28_[i_39_];
			if (is_26_ != null)
				is_33_[i_38_] = is_26_[i_39_];
			if (is_19_ != null)
				is_36_[i_38_] = is_19_[i_42_];
			if (is_21_ != null)
				is_37_[i_38_] = is_21_[i_42_];
			i_38_++;
		}
		method6425(i, i_18_, is_30_, is_36_, is_31_, is_37_, is_32_, is_33_, is_34_, is_35_, class77, bool);
	}

	public void SA() {
		if (((Class_xa_Sub1) this).anInt8781 > 0) {
			byte[][] is = (new byte[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1]);
			for (int i = 1; i < anInt6397 * 1972554729; i++) {
				for (int i_43_ = 1; i_43_ < anInt6393 * 24567321; i_43_++)
					is[i][i_43_] = (byte) (((((Class_xa_Sub1) this).aByteArrayArray8766[i - 1][i_43_]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i + 1][i_43_]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_43_ - 1]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_43_ + 1]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_43_]) >> 1));
			}
			((Class_xa_Sub1) this).aClass330Array8775 = new Class330[((Class_xa_Sub1) this).aClass497_8763.method6096(-1268504533)];
			((Class_xa_Sub1) this).aClass497_8763.method6093(((Class_xa_Sub1) this).aClass330Array8775, 23740248);
			for (int i = 0; i < ((Class_xa_Sub1) this).aClass330Array8775.length; i++)
				((Class330_Sub16) ((Class_xa_Sub1) this).aClass330Array8775[i]).method3337(((Class_xa_Sub1) this).anInt8781);
			int i = 24;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null)
				i += 4;
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aNativeHeap8308.j(((Class_xa_Sub1) this).anInt8781 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class330_Sub16[] class330_sub16s = new Class330_Sub16[((Class_xa_Sub1) this).anInt8781];
			int i_44_ = Class385.method4425(((Class_xa_Sub1) this).anInt8781 / 4, (short) 23141);
			if (i_44_ < 1)
				i_44_ = 1;
			Class497 class497 = new Class497(i_44_);
			Class330_Sub16[] class330_sub16s_45_ = new Class330_Sub16[((Class_xa_Sub1) this).anInt8782];
			for (int i_46_ = 0; i_46_ < anInt6397 * 1972554729; i_46_++) {
				for (int i_47_ = 0; i_47_ < anInt6393 * 24567321; i_47_++) {
					if ((((Class_xa_Sub1) this).anIntArrayArrayArray8762[i_46_][i_47_]) != null) {
						Class330_Sub16[] class330_sub16s_48_ = (((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764[i_46_][i_47_]);
						int[] is_49_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8786[i_46_][i_47_]);
						int[] is_50_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8769[i_46_][i_47_]);
						int[] is_51_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8772[i_46_][i_47_]);
						int[] is_52_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8762[i_46_][i_47_]);
						int[] is_53_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8770 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8770[i_46_][i_47_]) : null);
						int[] is_54_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8771[i_46_][i_47_]) : null);
						if (is_51_ == null)
							is_51_ = is_52_;
						float f = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_46_][i_47_]);
						float f_55_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_46_][i_47_]);
						float f_56_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_46_][i_47_]);
						float f_57_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_46_][i_47_ + 1]);
						float f_58_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_46_][i_47_ + 1]);
						float f_59_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_46_][i_47_ + 1]);
						float f_60_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_46_ + 1][i_47_ + 1]);
						float f_61_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_46_ + 1][i_47_ + 1]);
						float f_62_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_46_ + 1][i_47_ + 1]);
						float f_63_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_46_ + 1][i_47_]);
						float f_64_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_46_ + 1][i_47_]);
						float f_65_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_46_ + 1][i_47_]);
						int i_66_ = is[i_46_][i_47_] & 0xff;
						int i_67_ = is[i_46_][i_47_ + 1] & 0xff;
						int i_68_ = is[i_46_ + 1][i_47_ + 1] & 0xff;
						int i_69_ = is[i_46_ + 1][i_47_] & 0xff;
						int i_70_ = 0;
						while_110_: for (int i_71_ = 0; i_71_ < is_52_.length; i_71_++) {
							Class330_Sub16 class330_sub16 = class330_sub16s_48_[i_71_];
							for (int i_72_ = 0; i_72_ < i_70_; i_72_++) {
								if (class330_sub16s_45_[i_72_] == class330_sub16)
									continue while_110_;
							}
							class330_sub16s_45_[i_70_++] = class330_sub16;
						}
						short[] is_73_ = (((Class_xa_Sub1) this).aShortArrayArray8756[i_47_ * (anInt6397 * 1972554729) + i_46_] = new short[is_52_.length]);
						for (int i_74_ = 0; i_74_ < is_52_.length; i_74_++) {
							int i_75_ = ((i_46_ << anInt6396 * -1066304221) + is_49_[i_74_]);
							int i_76_ = ((i_47_ << anInt6396 * -1066304221) + is_50_[i_74_]);
							int i_77_ = i_75_ >> ((Class_xa_Sub1) this).anInt8779;
							int i_78_ = i_76_ >> ((Class_xa_Sub1) this).anInt8779;
							int i_79_ = is_52_[i_74_];
							int i_80_ = is_51_[i_74_];
							int i_81_ = is_53_ != null ? is_53_[i_74_] : 0;
							long l = ((long) i_80_ << 48 | (long) i_79_ << 32 | (long) (i_77_ << 16) | (long) i_78_);
							int i_82_ = is_49_[i_74_];
							int i_83_ = is_50_[i_74_];
							int i_84_ = 74;
							int i_85_ = 0;
							float f_86_ = 1.0F;
							float f_87_;
							float f_88_;
							float f_89_;
							if (i_82_ == 0 && i_83_ == 0) {
								f_87_ = f;
								f_88_ = f_55_;
								f_89_ = f_56_;
								i_84_ -= i_66_;
							} else if (i_82_ == 0 && i_83_ == anInt6395 * 550173571) {
								f_87_ = f_57_;
								f_88_ = f_58_;
								f_89_ = f_59_;
								i_84_ -= i_67_;
							} else if (i_82_ == anInt6395 * 550173571 && i_83_ == anInt6395 * 550173571) {
								f_87_ = f_60_;
								f_88_ = f_61_;
								f_89_ = f_62_;
								i_84_ -= i_68_;
							} else if (i_82_ == anInt6395 * 550173571 && i_83_ == 0) {
								f_87_ = f_63_;
								f_88_ = f_64_;
								f_89_ = f_65_;
								i_84_ -= i_69_;
							} else {
								float f_90_ = ((float) i_82_ / (float) (anInt6395 * 550173571));
								float f_91_ = ((float) i_83_ / (float) (anInt6395 * 550173571));
								float f_92_ = f + (f_63_ - f) * f_90_;
								float f_93_ = f_55_ + (f_64_ - f_55_) * f_90_;
								float f_94_ = f_56_ + (f_65_ - f_56_) * f_90_;
								float f_95_ = f_57_ + (f_60_ - f_57_) * f_90_;
								float f_96_ = f_58_ + (f_61_ - f_58_) * f_90_;
								float f_97_ = f_59_ + (f_62_ - f_59_) * f_90_;
								f_87_ = f_92_ + (f_95_ - f_92_) * f_91_;
								f_88_ = f_93_ + (f_96_ - f_93_) * f_91_;
								f_89_ = f_94_ + (f_97_ - f_94_) * f_91_;
								int i_98_ = i_66_ + ((i_69_ - i_66_) * i_82_ >> anInt6396 * -1066304221);
								int i_99_ = i_67_ + ((i_68_ - i_67_) * i_82_ >> anInt6396 * -1066304221);
								i_84_ -= i_98_ + ((i_99_ - i_98_) * i_83_ >> anInt6396 * -1066304221);
							}
							if (i_79_ != -1) {
								int i_100_ = (i_79_ & 0x7f) * i_84_ >> 7;
								if (i_100_ < 2)
									i_100_ = 2;
								else if (i_100_ > 126)
									i_100_ = 126;
								i_85_ = (Console.colorArray[i_79_ & 0xff80 | i_100_]);
								if ((((Class_xa_Sub1) this).anInt8761 & 0x7) == 0) {
									f_86_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[0]) * f_87_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[1]) * f_88_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[2]) * f_89_);
									f_86_ = (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8372 + (f_86_ * (f_86_ > 0.0F ? (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8373) : (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8374))));
								}
							}
							Class330 class330 = null;
							if (((i_75_ & ((Class_xa_Sub1) this).anInt8759 - 1) == 0) && ((i_76_ & ((Class_xa_Sub1) this).anInt8759 - 1) == 0))
								class330 = class497.method6094(l);
							int i_101_;
							if (class330 == null) {
								int i_102_;
								if (i_80_ != i_79_) {
									int i_103_ = (i_80_ & 0x7f) * i_84_ >> 7;
									if (i_103_ < 2)
										i_103_ = 2;
									else if (i_103_ > 126)
										i_103_ = 126;
									i_102_ = (Console.colorArray[i_80_ & 0xff80 | i_103_]);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) == 0) {
										float f_104_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[0]) * f_87_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[1]) * f_88_ + ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[2]) * f_89_));
										f_104_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8372) + (f_86_ * (f_86_ > 0.0F ? (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8373) : (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8374))));
										int i_105_ = i_102_ >> 16 & 0xff;
										int i_106_ = i_102_ >> 8 & 0xff;
										int i_107_ = i_102_ & 0xff;
										i_105_ *= f_104_;
										if (i_105_ < 0)
											i_105_ = 0;
										else if (i_105_ > 255)
											i_105_ = 255;
										i_106_ *= f_104_;
										if (i_106_ < 0)
											i_106_ = 0;
										else if (i_106_ > 255)
											i_106_ = 255;
										i_107_ *= f_104_;
										if (i_107_ < 0)
											i_107_ = 0;
										else if (i_107_ > 255)
											i_107_ = 255;
										i_102_ = (i_105_ << 16 | i_106_ << 8 | i_107_);
									}
								} else
									i_102_ = i_85_;
								if (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aBoolean8407) {
									stream.o((float) i_75_);
									stream.o((float) (method6416(i_75_, i_76_, 2074629282) + i_81_));
									stream.o((float) i_76_);
									stream.p((byte) (i_102_ >> 16));
									stream.p((byte) (i_102_ >> 8));
									stream.p((byte) i_102_);
									stream.p(-1);
									stream.o((float) i_75_);
									stream.o((float) i_76_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8771) != null)
										stream.o(is_54_ != null ? (float) (is_54_[i_74_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
										stream.o(f_87_);
										stream.o(f_88_);
										stream.o(f_89_);
									}
								} else {
									stream.s((float) i_75_);
									stream.s((float) (method6416(i_75_, i_76_, 310380952) + i_81_));
									stream.s((float) i_76_);
									stream.p((byte) (i_102_ >> 16));
									stream.p((byte) (i_102_ >> 8));
									stream.p((byte) i_102_);
									stream.p(-1);
									stream.s((float) i_75_);
									stream.s((float) i_76_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8771) != null)
										stream.s(is_54_ != null ? (float) (is_54_[i_74_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
										stream.s(f_87_);
										stream.s(f_88_);
										stream.s(f_89_);
									}
								}
								i_101_ = ((Class_xa_Sub1) this).anInt8774++;
								is_73_[i_74_] = (short) i_101_;
								if (i_79_ != -1)
									class330_sub16s[i_101_] = class330_sub16s_48_[i_74_];
								class497.method6097(new Class330_Sub24(is_73_[i_74_]), l);
							} else {
								is_73_[i_74_] = ((Class330_Sub24) class330).aShort7694;
								i_101_ = is_73_[i_74_] & 0xffff;
								if (i_79_ != -1 && ((class330_sub16s_48_[i_74_].aLong3341 * -6154793640677333111L) < (class330_sub16s[i_101_].aLong3341 * -6154793640677333111L)))
									class330_sub16s[i_101_] = class330_sub16s_48_[i_74_];
							}
							for (int i_108_ = 0; i_108_ < i_70_; i_108_++)
								class330_sub16s_45_[i_108_].method3336(i_101_, i_85_, i_84_, f_86_);
							((Class_xa_Sub1) this).anInt8783++;
						}
					}
				}
			}
			for (int i_109_ = 0; i_109_ < ((Class_xa_Sub1) this).anInt8774; i_109_++) {
				Class330_Sub16 class330_sub16 = class330_sub16s[i_109_];
				if (class330_sub16 != null)
					class330_sub16.method3338(i_109_);
			}
			for (int i_110_ = 0; i_110_ < anInt6397 * 1972554729; i_110_++) {
				for (int i_111_ = 0; i_111_ < anInt6393 * 24567321; i_111_++) {
					short[] is_112_ = (((Class_xa_Sub1) this).aShortArrayArray8756[i_111_ * (anInt6397 * 1972554729) + i_110_]);
					if (is_112_ != null) {
						int i_113_ = 0;
						int i_114_ = 0;
						while (i_114_ < is_112_.length) {
							int i_115_ = is_112_[i_114_++] & 0xffff;
							int i_116_ = is_112_[i_114_++] & 0xffff;
							int i_117_ = is_112_[i_114_++] & 0xffff;
							Class330_Sub16 class330_sub16 = class330_sub16s[i_115_];
							Class330_Sub16 class330_sub16_118_ = class330_sub16s[i_116_];
							Class330_Sub16 class330_sub16_119_ = class330_sub16s[i_117_];
							Class330_Sub16 class330_sub16_120_ = null;
							if (class330_sub16 != null) {
								class330_sub16.method3339(i_110_, i_111_, i_113_);
								class330_sub16_120_ = class330_sub16;
							}
							if (class330_sub16_118_ != null) {
								class330_sub16_118_.method3339(i_110_, i_111_, i_113_);
								if (class330_sub16_120_ == null || ((class330_sub16_118_.aLong3341 * -6154793640677333111L) < (class330_sub16_120_.aLong3341 * -6154793640677333111L)))
									class330_sub16_120_ = class330_sub16_118_;
							}
							if (class330_sub16_119_ != null) {
								class330_sub16_119_.method3339(i_110_, i_111_, i_113_);
								if (class330_sub16_120_ == null || ((class330_sub16_119_.aLong3341 * -6154793640677333111L) < (class330_sub16_120_.aLong3341 * -6154793640677333111L)))
									class330_sub16_120_ = class330_sub16_119_;
							}
							if (class330_sub16_120_ != null) {
								if (class330_sub16 != null)
									class330_sub16_120_.method3338(i_115_);
								if (class330_sub16_118_ != null)
									class330_sub16_120_.method3338(i_116_);
								if (class330_sub16_119_ != null)
									class330_sub16_120_.method3338(i_117_);
								class330_sub16_120_.method3339(i_110_, i_111_, i_113_);
							}
							i_113_++;
						}
					}
				}
			}
			stream.f();
			((Class_xa_Sub1) this).anInterface1_8776 = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4872(i, nativeheapbuffer, stream.j(), false);
			if (((Class_xa_Sub1) this).anInterface1_8776 instanceof Class46_Sub1)
				nativeheapbuffer.n();
			((Class_xa_Sub1) this).aClass44_8777 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, 0);
			((Class_xa_Sub1) this).aClass44_8778 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5121, 4, 12);
			int i_121_;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null) {
				((Class_xa_Sub1) this).aClass44_8780 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, 16);
				i_121_ = 28;
			} else {
				((Class_xa_Sub1) this).aClass44_8780 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 2, 16);
				i_121_ = 24;
			}
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0)
				((Class_xa_Sub1) this).aClass44_8767 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, i_121_);
			long[] ls = new long[((Class_xa_Sub1) this).aClass330Array8775.length];
			for (int i_122_ = 0; i_122_ < ((Class_xa_Sub1) this).aClass330Array8775.length; i_122_++) {
				Class330_Sub16 class330_sub16 = ((Class330_Sub16) ((Class_xa_Sub1) this).aClass330Array8775[i_122_]);
				ls[i_122_] = class330_sub16.aLong3341 * -6154793640677333111L;
				class330_sub16.method3341(((Class_xa_Sub1) this).anInt8774);
			}
			Class330_Sub40_Sub1.method3584(ls, (((Class_xa_Sub1) this).aClass330Array8775), (byte) 16);
			if (((Class_xa_Sub1) this).aClass58_8773 != null)
				((Class_xa_Sub1) this).aClass58_8773.method661();
		} else
			((Class_xa_Sub1) this).aClass58_8773 = null;
		if ((((Class_xa_Sub1) this).anInt8760 & 0x2) == 0) {
			((Class_xa_Sub1) this).anIntArrayArrayArray8769 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8786 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8762 = null;
		}
		((Class_xa_Sub1) this).anIntArrayArrayArray8771 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8772 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8770 = null;
		((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764 = null;
		((Class_xa_Sub1) this).aByteArrayArray8766 = null;
		((Class_xa_Sub1) this).aClass497_8763 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8758 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8785 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8784 = null;
	}

	public void method6423(int i, int i_123_, int i_124_, boolean[][] bools, boolean bool, int i_125_) {
		method6436(i, i_123_, i_124_, bools, bool, i_125_);
	}

	void method6436(int i, int i_126_, int i_127_, boolean[][] bools, boolean bool, int i_128_) {
		if (((Class_xa_Sub1) this).aClass330Array8775 != null) {
			int i_129_ = i_127_ + i_127_ + 1;
			i_129_ *= i_129_;
			if ((((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8301).length < i_129_)
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8301 = new int[i_129_];
			if ((((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381.payload).length < ((Class_xa_Sub1) this).anInt8783 * 2)
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(((Class_xa_Sub1) this).anInt8783 * 2);
			int i_130_ = i - i_127_;
			int i_131_ = i_130_;
			if (i_130_ < 0)
				i_130_ = 0;
			int i_132_ = i_126_ - i_127_;
			int i_133_ = i_132_;
			if (i_132_ < 0)
				i_132_ = 0;
			int i_134_ = i + i_127_;
			if (i_134_ > anInt6397 * 1972554729 - 1)
				i_134_ = anInt6397 * 1972554729 - 1;
			int i_135_ = i_126_ + i_127_;
			if (i_135_ > anInt6393 * 24567321 - 1)
				i_135_ = anInt6393 * 24567321 - 1;
			int i_136_ = 0;
			int[] is = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8301);
			for (int i_137_ = i_130_; i_137_ <= i_134_; i_137_++) {
				boolean[] bools_138_ = bools[i_137_ - i_131_];
				for (int i_139_ = i_132_; i_139_ <= i_135_; i_139_++) {
					if (bools_138_[i_139_ - i_133_])
						is[i_136_++] = i_139_ * (anInt6397 * 1972554729) + i_137_;
				}
			}
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4840();
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0);
			for (int i_140_ = 0; i_140_ < ((Class_xa_Sub1) this).aClass330Array8775.length - 0; i_140_++)
				((Class330_Sub16) ((Class_xa_Sub1) this).aClass330Array8775[i_140_]).method3340(is, i_136_);
			if (!((Class_xa_Sub1) this).aClass471_8765.method5876(-1146234440)) {
				int i_141_ = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8320);
				int i_142_ = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8382);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.c(0, i_142_, ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8286);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(false);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4815(false);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4859(128);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4841(-2);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4844(((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass36_Sub1_8400);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4831(8448, 7681);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4847(0, 34166, 770);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4848(0, 34167, 770);
				for (Class330 class330 = ((Class_xa_Sub1) this).aClass471_8765.method5869(539664854); class330 != null; class330 = ((Class_xa_Sub1) this).aClass471_8765.method5873((byte) -97)) {
					Class330_Sub8 class330_sub8 = (Class330_Sub8) class330;
					class330_sub8.method3279(i, i_126_, i_127_, bools);
				}
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4847(0, 5890, 768);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4848(0, 5890, 770);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4844(null);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.c(i_141_, i_142_, ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8286);
			}
			if (((Class_xa_Sub1) this).aClass58_8773 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4869(((Class_xa_Sub1) this).aClass44_8777, null, null, ((Class_xa_Sub1) this).aClass44_8780);
				((Class_xa_Sub1) this).aClass58_8773.method660(i, i_126_, i_127_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	public Class_na y(int i, int i_143_, Class_na class_na) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8755[i][i_143_] & 0x1) == 0)
			return null;
		int i_144_ = (anInt6395 * 550173571 >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_145_;
		if (class_na_sub2 != null && class_na_sub2.method3531(i_144_, i_144_)) {
			class_na_sub2_145_ = class_na_sub2;
			class_na_sub2_145_.method3532();
		} else
			class_na_sub2_145_ = new Class_na_Sub2(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, i_144_, i_144_);
		class_na_sub2_145_.method3530(0, 0, i_144_, i_144_);
		method6437(class_na_sub2_145_, i, i_143_);
		return class_na_sub2_145_;
	}

	public void method6411(int i, int i_146_, int[] is, int[] is_147_, int[] is_148_, int[] is_149_, int[] is_150_, int[] is_151_, int[] is_152_, int[] is_153_, int[] is_154_, int[] is_155_, int[] is_156_, Class77 class77, boolean bool) {
		int i_157_ = is_153_.length;
		int[] is_158_ = new int[i_157_ * 3];
		int[] is_159_ = new int[i_157_ * 3];
		int[] is_160_ = new int[i_157_ * 3];
		int[] is_161_ = is_154_ != null ? new int[i_157_ * 3] : null;
		int[] is_162_ = new int[i_157_ * 3];
		int[] is_163_ = new int[i_157_ * 3];
		int[] is_164_ = is_147_ != null ? new int[i_157_ * 3] : null;
		int[] is_165_ = is_149_ != null ? new int[i_157_ * 3] : null;
		int i_166_ = 0;
		for (int i_167_ = 0; i_167_ < i_157_; i_167_++) {
			int i_168_ = is_150_[i_167_];
			int i_169_ = is_151_[i_167_];
			int i_170_ = is_152_[i_167_];
			is_158_[i_166_] = is[i_168_];
			is_159_[i_166_] = is_148_[i_168_];
			is_160_[i_166_] = is_153_[i_167_];
			is_162_[i_166_] = is_155_[i_167_];
			is_163_[i_166_] = is_156_[i_167_];
			if (is_154_ != null)
				is_161_[i_166_] = is_154_[i_167_];
			if (is_147_ != null)
				is_164_[i_166_] = is_147_[i_168_];
			if (is_149_ != null)
				is_165_[i_166_] = is_149_[i_168_];
			i_166_++;
			is_158_[i_166_] = is[i_169_];
			is_159_[i_166_] = is_148_[i_169_];
			is_160_[i_166_] = is_153_[i_167_];
			is_162_[i_166_] = is_155_[i_167_];
			is_163_[i_166_] = is_156_[i_167_];
			if (is_154_ != null)
				is_161_[i_166_] = is_154_[i_167_];
			if (is_147_ != null)
				is_164_[i_166_] = is_147_[i_169_];
			if (is_149_ != null)
				is_165_[i_166_] = is_149_[i_169_];
			i_166_++;
			is_158_[i_166_] = is[i_170_];
			is_159_[i_166_] = is_148_[i_170_];
			is_160_[i_166_] = is_153_[i_167_];
			is_162_[i_166_] = is_155_[i_167_];
			is_163_[i_166_] = is_156_[i_167_];
			if (is_154_ != null)
				is_161_[i_166_] = is_154_[i_167_];
			if (is_147_ != null)
				is_164_[i_166_] = is_147_[i_170_];
			if (is_149_ != null)
				is_165_[i_166_] = is_149_[i_170_];
			i_166_++;
		}
		method6425(i, i_146_, is_158_, is_164_, is_159_, is_165_, is_160_, is_161_, is_162_, is_163_, class77, bool);
	}

	public void method6427(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub1) this).aClass471_8765.method5878(new Class330_Sub8(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, this, class330_sub14, is), (short) 8192);
	}

	public boolean method6418(Class_na class_na, int i, int i_171_, int i_172_, int i_173_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 == null || class_na == null)
			return false;
		int i_174_ = (i - (i_171_ * ((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8410 >> 8) >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296));
		int i_175_ = (i_172_ - (i_171_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8379) >> 8) >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296));
		return ((Class_xa_Sub1) this).aClass58_8773.method664(class_na, i_174_, i_175_);
	}

	public void UA(Class_na class_na, int i, int i_176_, int i_177_, int i_178_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_179_ = (i - (i_176_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8410) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			int i_180_ = (i_177_ - (i_176_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method667(class_na, i_179_, i_180_);
		}
	}

	public boolean method6424(Class_na class_na, int i, int i_181_, int i_182_, int i_183_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 == null || class_na == null)
			return false;
		int i_184_ = (i - (i_181_ * ((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8410 >> 8) >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296));
		int i_185_ = (i_182_ - (i_181_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8379) >> 8) >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296));
		return ((Class_xa_Sub1) this).aClass58_8773.method664(class_na, i_184_, i_185_);
	}

	public void method6421(int i, int i_186_, int i_187_, boolean[][] bools, boolean bool, int i_188_) {
		method6436(i, i_186_, i_187_, bools, bool, i_188_);
	}

	public void method6420(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub1) this).aClass471_8765.method5878(new Class330_Sub8(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, this, class330_sub14, is), (short) 8192);
	}

	public void n(int i, int i_189_, int i_190_) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_189_] & 0xff) < i_190_)
			((Class_xa_Sub1) this).aByteArrayArray8766[i][i_189_] = (byte) i_190_;
	}

	public void l(int i, int i_191_, int i_192_) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_191_] & 0xff) < i_192_)
			((Class_xa_Sub1) this).aByteArrayArray8766[i][i_191_] = (byte) i_192_;
	}

	public void b(int i, int i_193_, int i_194_) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_193_] & 0xff) < i_194_)
			((Class_xa_Sub1) this).aByteArrayArray8766[i][i_193_] = (byte) i_194_;
	}

	public void method6414(int i, int i_195_, int[] is, int[] is_196_, int[] is_197_, int[] is_198_, int[] is_199_, int[] is_200_, int[] is_201_, int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_, Class77 class77, boolean bool) {
		int i_206_ = is_202_.length;
		int[] is_207_ = new int[i_206_ * 3];
		int[] is_208_ = new int[i_206_ * 3];
		int[] is_209_ = new int[i_206_ * 3];
		int[] is_210_ = is_203_ != null ? new int[i_206_ * 3] : null;
		int[] is_211_ = new int[i_206_ * 3];
		int[] is_212_ = new int[i_206_ * 3];
		int[] is_213_ = is_196_ != null ? new int[i_206_ * 3] : null;
		int[] is_214_ = is_198_ != null ? new int[i_206_ * 3] : null;
		int i_215_ = 0;
		for (int i_216_ = 0; i_216_ < i_206_; i_216_++) {
			int i_217_ = is_199_[i_216_];
			int i_218_ = is_200_[i_216_];
			int i_219_ = is_201_[i_216_];
			is_207_[i_215_] = is[i_217_];
			is_208_[i_215_] = is_197_[i_217_];
			is_209_[i_215_] = is_202_[i_216_];
			is_211_[i_215_] = is_204_[i_216_];
			is_212_[i_215_] = is_205_[i_216_];
			if (is_203_ != null)
				is_210_[i_215_] = is_203_[i_216_];
			if (is_196_ != null)
				is_213_[i_215_] = is_196_[i_217_];
			if (is_198_ != null)
				is_214_[i_215_] = is_198_[i_217_];
			i_215_++;
			is_207_[i_215_] = is[i_218_];
			is_208_[i_215_] = is_197_[i_218_];
			is_209_[i_215_] = is_202_[i_216_];
			is_211_[i_215_] = is_204_[i_216_];
			is_212_[i_215_] = is_205_[i_216_];
			if (is_203_ != null)
				is_210_[i_215_] = is_203_[i_216_];
			if (is_196_ != null)
				is_213_[i_215_] = is_196_[i_218_];
			if (is_198_ != null)
				is_214_[i_215_] = is_198_[i_218_];
			i_215_++;
			is_207_[i_215_] = is[i_219_];
			is_208_[i_215_] = is_197_[i_219_];
			is_209_[i_215_] = is_202_[i_216_];
			is_211_[i_215_] = is_204_[i_216_];
			is_212_[i_215_] = is_205_[i_216_];
			if (is_203_ != null)
				is_210_[i_215_] = is_203_[i_216_];
			if (is_196_ != null)
				is_213_[i_215_] = is_196_[i_219_];
			if (is_198_ != null)
				is_214_[i_215_] = is_198_[i_219_];
			i_215_++;
		}
		method6425(i, i_195_, is_207_, is_213_, is_208_, is_214_, is_209_, is_210_, is_211_, is_212_, class77, bool);
	}

	public void method6428(int i, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, boolean[][] bools) {
		Class76 class76 = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4782((byte) 0);
		if (((Class_xa_Sub1) this).anInt8781 > 0 && class76 != null) {
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4874();
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4853(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4816(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4815(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4859(0);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4841(-2);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4844(null);
			aFloatArray8788[0] = (float) i_221_ / (128.0F * (float) (anInt6395 * 550173571) * (float) class76.method856());
			aFloatArray8788[1] = 0.0F;
			aFloatArray8788[2] = 0.0F;
			aFloatArray8788[3] = 0.0F;
			aFloatArray8788[4] = 0.0F;
			aFloatArray8788[5] = (float) i_221_ / (128.0F * (float) (anInt6395 * 550173571) * (float) class76.method857());
			aFloatArray8788[6] = 0.0F;
			aFloatArray8788[7] = 0.0F;
			aFloatArray8788[8] = 0.0F;
			aFloatArray8788[9] = 0.0F;
			aFloatArray8788[10] = 0.0F;
			aFloatArray8788[11] = 0.0F;
			aFloatArray8788[12] = -1.0F - ((float) (i_222_ * i_221_) / 128.0F - (float) (i * 2)) / (float) class76.method856();
			aFloatArray8788[13] = 1.0F - (((float) (2 * i_220_) + (float) (i_225_ * i_221_) / 128.0F) / (float) class76.method857());
			aFloatArray8788[14] = 0.0F;
			aFloatArray8788[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8788, 0);
			aFloatArray8788[0] = 1.0F;
			aFloatArray8788[1] = 0.0F;
			aFloatArray8788[2] = 0.0F;
			aFloatArray8788[3] = 0.0F;
			aFloatArray8788[4] = 0.0F;
			aFloatArray8788[5] = 0.0F;
			aFloatArray8788[6] = 1.0F;
			aFloatArray8788[7] = 0.0F;
			aFloatArray8788[8] = 0.0F;
			aFloatArray8788[9] = 1.0F;
			aFloatArray8788[10] = 0.0F;
			aFloatArray8788[11] = 0.0F;
			aFloatArray8788[12] = 0.0F;
			aFloatArray8788[13] = 0.0F;
			aFloatArray8788[14] = 0.0F;
			aFloatArray8788[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8788, 0);
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(true);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4878();
			} else
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4869(((Class_xa_Sub1) this).aClass44_8777, ((Class_xa_Sub1) this).aClass44_8767, ((Class_xa_Sub1) this).aClass44_8778, ((Class_xa_Sub1) this).aClass44_8780);
			if ((((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381.payload).length < ((Class_xa_Sub1) this).anInt8783 * 2)
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(((Class_xa_Sub1) this).anInt8783 * 2);
			else
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381.offset = 0;
			int i_226_ = 0;
			Class330_Sub46_Sub1 class330_sub46_sub1 = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381);
			if (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aBoolean8407) {
				for (int i_227_ = i_223_; i_227_ < i_225_; i_227_++) {
					int i_228_ = i_227_ * (anInt6397 * 1972554729) + i_222_;
					for (int i_229_ = i_222_; i_229_ < i_224_; i_229_++) {
						if (bools[i_229_ - i_222_][i_227_ - i_223_]) {
							short[] is = (((Class_xa_Sub1) this).aShortArrayArray8756[i_228_]);
							if (is != null) {
								for (int i_230_ = 0; i_230_ < is.length; i_230_++) {
									class330_sub46_sub1.addShort((is[i_230_] & 0xffff), (byte) 11);
									i_226_++;
								}
							}
						}
						i_228_++;
					}
				}
			} else {
				for (int i_231_ = i_223_; i_231_ < i_225_; i_231_++) {
					int i_232_ = i_231_ * (anInt6397 * 1972554729) + i_222_;
					for (int i_233_ = i_222_; i_233_ < i_224_; i_233_++) {
						if (bools[i_233_ - i_222_][i_231_ - i_223_]) {
							short[] is = (((Class_xa_Sub1) this).aShortArrayArray8756[i_232_]);
							if (is != null) {
								for (int i_234_ = 0; i_234_ < is.length; i_234_++) {
									class330_sub46_sub1.method3742(is[i_234_] & 0xffff, (short) 30331);
									i_226_++;
								}
							}
						}
						i_232_++;
					}
				}
			}
			if (i_226_ > 0) {
				Class34_Sub1 class34_sub1 = new Class34_Sub1((((Class_xa_Sub1) this).aClass_ra_Sub1_8757), 5123, class330_sub46_sub1.payload, (class330_sub46_sub1.offset * -824785231));
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4837(class34_sub1, 4, 0, i_226_);
			}
		}
	}

	public void al(Class_na class_na, int i, int i_235_, int i_236_, int i_237_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_238_ = (i - (i_235_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8410) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			int i_239_ = (i_236_ - (i_235_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method662(class_na, i_238_, i_239_);
		}
	}

	void method6437(Class_na_Sub2 class_na_sub2, int i, int i_240_) {
		int[] is = ((Class_xa_Sub1) this).anIntArrayArrayArray8786[i][i_240_];
		int[] is_241_ = ((Class_xa_Sub1) this).anIntArrayArrayArray8769[i][i_240_];
		int i_242_ = is.length;
		if ((((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8291).length < i_242_) {
			((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8291 = new int[i_242_];
			((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8427 = new int[i_242_];
		}
		int[] is_243_ = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8291);
		int[] is_244_ = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anIntArray8427);
		for (int i_245_ = 0; i_245_ < i_242_; i_245_++) {
			is_243_[i_245_] = is[i_245_] >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			is_244_[i_245_] = is_241_[i_245_] >> (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8296);
		}
		int i_246_ = 0;
		while (i_246_ < i_242_) {
			int i_247_ = is_243_[i_246_];
			int i_248_ = is_244_[i_246_++];
			int i_249_ = is_243_[i_246_];
			int i_250_ = is_244_[i_246_++];
			int i_251_ = is_243_[i_246_];
			int i_252_ = is_244_[i_246_++];
			if (((i_247_ - i_249_) * (i_250_ - i_252_) - (i_250_ - i_248_) * (i_251_ - i_249_)) > 0)
				class_na_sub2.method3529(i_248_, i_250_, i_252_, i_247_, i_249_, i_251_);
		}
	}

	public void d() {
		if (((Class_xa_Sub1) this).anInt8781 > 0) {
			byte[][] is = (new byte[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1]);
			for (int i = 1; i < anInt6397 * 1972554729; i++) {
				for (int i_253_ = 1; i_253_ < anInt6393 * 24567321; i_253_++)
					is[i][i_253_] = (byte) (((((Class_xa_Sub1) this).aByteArrayArray8766[i - 1][i_253_]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i + 1][i_253_]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_253_ - 1]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_253_ + 1]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_253_]) >> 1));
			}
			((Class_xa_Sub1) this).aClass330Array8775 = new Class330[((Class_xa_Sub1) this).aClass497_8763.method6096(1779567136)];
			((Class_xa_Sub1) this).aClass497_8763.method6093(((Class_xa_Sub1) this).aClass330Array8775, 2054339509);
			for (int i = 0; i < ((Class_xa_Sub1) this).aClass330Array8775.length; i++)
				((Class330_Sub16) ((Class_xa_Sub1) this).aClass330Array8775[i]).method3337(((Class_xa_Sub1) this).anInt8781);
			int i = 24;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null)
				i += 4;
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aNativeHeap8308.j(((Class_xa_Sub1) this).anInt8781 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class330_Sub16[] class330_sub16s = new Class330_Sub16[((Class_xa_Sub1) this).anInt8781];
			int i_254_ = Class385.method4425(((Class_xa_Sub1) this).anInt8781 / 4, (short) 23547);
			if (i_254_ < 1)
				i_254_ = 1;
			Class497 class497 = new Class497(i_254_);
			Class330_Sub16[] class330_sub16s_255_ = new Class330_Sub16[((Class_xa_Sub1) this).anInt8782];
			for (int i_256_ = 0; i_256_ < anInt6397 * 1972554729; i_256_++) {
				for (int i_257_ = 0; i_257_ < anInt6393 * 24567321; i_257_++) {
					if ((((Class_xa_Sub1) this).anIntArrayArrayArray8762[i_256_][i_257_]) != null) {
						Class330_Sub16[] class330_sub16s_258_ = (((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764[i_256_][i_257_]);
						int[] is_259_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8786[i_256_][i_257_]);
						int[] is_260_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8769[i_256_][i_257_]);
						int[] is_261_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8772[i_256_][i_257_]);
						int[] is_262_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8762[i_256_][i_257_]);
						int[] is_263_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8770 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8770[i_256_][i_257_]) : null);
						int[] is_264_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8771[i_256_][i_257_]) : null);
						if (is_261_ == null)
							is_261_ = is_262_;
						float f = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_256_][i_257_]);
						float f_265_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_256_][i_257_]);
						float f_266_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_256_][i_257_]);
						float f_267_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_256_][i_257_ + 1]);
						float f_268_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_256_][i_257_ + 1]);
						float f_269_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_256_][i_257_ + 1]);
						float f_270_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_256_ + 1][i_257_ + 1]);
						float f_271_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_256_ + 1][i_257_ + 1]);
						float f_272_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_256_ + 1][i_257_ + 1]);
						float f_273_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_256_ + 1][i_257_]);
						float f_274_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_256_ + 1][i_257_]);
						float f_275_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_256_ + 1][i_257_]);
						int i_276_ = is[i_256_][i_257_] & 0xff;
						int i_277_ = is[i_256_][i_257_ + 1] & 0xff;
						int i_278_ = is[i_256_ + 1][i_257_ + 1] & 0xff;
						int i_279_ = is[i_256_ + 1][i_257_] & 0xff;
						int i_280_ = 0;
						while_112_: for (int i_281_ = 0; i_281_ < is_262_.length; i_281_++) {
							Class330_Sub16 class330_sub16 = class330_sub16s_258_[i_281_];
							for (int i_282_ = 0; i_282_ < i_280_; i_282_++) {
								if (class330_sub16s_255_[i_282_] == class330_sub16)
									continue while_112_;
							}
							class330_sub16s_255_[i_280_++] = class330_sub16;
						}
						short[] is_283_ = (((Class_xa_Sub1) this).aShortArrayArray8756[i_257_ * (anInt6397 * 1972554729) + i_256_] = new short[is_262_.length]);
						for (int i_284_ = 0; i_284_ < is_262_.length; i_284_++) {
							int i_285_ = ((i_256_ << anInt6396 * -1066304221) + is_259_[i_284_]);
							int i_286_ = ((i_257_ << anInt6396 * -1066304221) + is_260_[i_284_]);
							int i_287_ = i_285_ >> ((Class_xa_Sub1) this).anInt8779;
							int i_288_ = i_286_ >> ((Class_xa_Sub1) this).anInt8779;
							int i_289_ = is_262_[i_284_];
							int i_290_ = is_261_[i_284_];
							int i_291_ = is_263_ != null ? is_263_[i_284_] : 0;
							long l = ((long) i_290_ << 48 | (long) i_289_ << 32 | (long) (i_287_ << 16) | (long) i_288_);
							int i_292_ = is_259_[i_284_];
							int i_293_ = is_260_[i_284_];
							int i_294_ = 74;
							int i_295_ = 0;
							float f_296_ = 1.0F;
							float f_297_;
							float f_298_;
							float f_299_;
							if (i_292_ == 0 && i_293_ == 0) {
								f_297_ = f;
								f_298_ = f_265_;
								f_299_ = f_266_;
								i_294_ -= i_276_;
							} else if (i_292_ == 0 && i_293_ == anInt6395 * 550173571) {
								f_297_ = f_267_;
								f_298_ = f_268_;
								f_299_ = f_269_;
								i_294_ -= i_277_;
							} else if (i_292_ == anInt6395 * 550173571 && i_293_ == anInt6395 * 550173571) {
								f_297_ = f_270_;
								f_298_ = f_271_;
								f_299_ = f_272_;
								i_294_ -= i_278_;
							} else if (i_292_ == anInt6395 * 550173571 && i_293_ == 0) {
								f_297_ = f_273_;
								f_298_ = f_274_;
								f_299_ = f_275_;
								i_294_ -= i_279_;
							} else {
								float f_300_ = ((float) i_292_ / (float) (anInt6395 * 550173571));
								float f_301_ = ((float) i_293_ / (float) (anInt6395 * 550173571));
								float f_302_ = f + (f_273_ - f) * f_300_;
								float f_303_ = f_265_ + (f_274_ - f_265_) * f_300_;
								float f_304_ = f_266_ + (f_275_ - f_266_) * f_300_;
								float f_305_ = f_267_ + (f_270_ - f_267_) * f_300_;
								float f_306_ = f_268_ + (f_271_ - f_268_) * f_300_;
								float f_307_ = f_269_ + (f_272_ - f_269_) * f_300_;
								f_297_ = f_302_ + (f_305_ - f_302_) * f_301_;
								f_298_ = f_303_ + (f_306_ - f_303_) * f_301_;
								f_299_ = f_304_ + (f_307_ - f_304_) * f_301_;
								int i_308_ = i_276_ + ((i_279_ - i_276_) * i_292_ >> anInt6396 * -1066304221);
								int i_309_ = i_277_ + ((i_278_ - i_277_) * i_292_ >> anInt6396 * -1066304221);
								i_294_ -= i_308_ + ((i_309_ - i_308_) * i_293_ >> anInt6396 * -1066304221);
							}
							if (i_289_ != -1) {
								int i_310_ = (i_289_ & 0x7f) * i_294_ >> 7;
								if (i_310_ < 2)
									i_310_ = 2;
								else if (i_310_ > 126)
									i_310_ = 126;
								i_295_ = (Console.colorArray[i_289_ & 0xff80 | i_310_]);
								if ((((Class_xa_Sub1) this).anInt8761 & 0x7) == 0) {
									f_296_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[0]) * f_297_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[1]) * f_298_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[2]) * f_299_);
									f_296_ = (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8372 + (f_296_ * (f_296_ > 0.0F ? (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8373) : (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8374))));
								}
							}
							Class330 class330 = null;
							if ((i_285_ & ((Class_xa_Sub1) this).anInt8759 - 1) == 0 && ((i_286_ & ((Class_xa_Sub1) this).anInt8759 - 1) == 0))
								class330 = class497.method6094(l);
							int i_311_;
							if (class330 == null) {
								int i_312_;
								if (i_290_ != i_289_) {
									int i_313_ = (i_290_ & 0x7f) * i_294_ >> 7;
									if (i_313_ < 2)
										i_313_ = 2;
									else if (i_313_ > 126)
										i_313_ = 126;
									i_312_ = (Console.colorArray[i_290_ & 0xff80 | i_313_]);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) == 0) {
										float f_314_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[0]) * f_297_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[1]) * f_298_ + ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[2]) * f_299_));
										f_314_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8372) + (f_296_ * (f_296_ > 0.0F ? (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8373) : (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8374))));
										int i_315_ = i_312_ >> 16 & 0xff;
										int i_316_ = i_312_ >> 8 & 0xff;
										int i_317_ = i_312_ & 0xff;
										i_315_ *= f_314_;
										if (i_315_ < 0)
											i_315_ = 0;
										else if (i_315_ > 255)
											i_315_ = 255;
										i_316_ *= f_314_;
										if (i_316_ < 0)
											i_316_ = 0;
										else if (i_316_ > 255)
											i_316_ = 255;
										i_317_ *= f_314_;
										if (i_317_ < 0)
											i_317_ = 0;
										else if (i_317_ > 255)
											i_317_ = 255;
										i_312_ = (i_315_ << 16 | i_316_ << 8 | i_317_);
									}
								} else
									i_312_ = i_295_;
								if (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aBoolean8407) {
									stream.o((float) i_285_);
									stream.o((float) (method6416(i_285_, i_286_, -1078462647) + i_291_));
									stream.o((float) i_286_);
									stream.p((byte) (i_312_ >> 16));
									stream.p((byte) (i_312_ >> 8));
									stream.p((byte) i_312_);
									stream.p(-1);
									stream.o((float) i_285_);
									stream.o((float) i_286_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8771) != null)
										stream.o(is_264_ != null ? (float) (is_264_[i_284_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
										stream.o(f_297_);
										stream.o(f_298_);
										stream.o(f_299_);
									}
								} else {
									stream.s((float) i_285_);
									stream.s((float) (method6416(i_285_, i_286_, -307482130) + i_291_));
									stream.s((float) i_286_);
									stream.p((byte) (i_312_ >> 16));
									stream.p((byte) (i_312_ >> 8));
									stream.p((byte) i_312_);
									stream.p(-1);
									stream.s((float) i_285_);
									stream.s((float) i_286_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8771) != null)
										stream.s(is_264_ != null ? (float) (is_264_[i_284_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
										stream.s(f_297_);
										stream.s(f_298_);
										stream.s(f_299_);
									}
								}
								i_311_ = ((Class_xa_Sub1) this).anInt8774++;
								is_283_[i_284_] = (short) i_311_;
								if (i_289_ != -1)
									class330_sub16s[i_311_] = class330_sub16s_258_[i_284_];
								class497.method6097(new Class330_Sub24(is_283_[i_284_]), l);
							} else {
								is_283_[i_284_] = ((Class330_Sub24) class330).aShort7694;
								i_311_ = is_283_[i_284_] & 0xffff;
								if (i_289_ != -1 && ((class330_sub16s_258_[i_284_].aLong3341 * -6154793640677333111L) < (class330_sub16s[i_311_].aLong3341 * -6154793640677333111L)))
									class330_sub16s[i_311_] = class330_sub16s_258_[i_284_];
							}
							for (int i_318_ = 0; i_318_ < i_280_; i_318_++)
								class330_sub16s_255_[i_318_].method3336(i_311_, i_295_, i_294_, f_296_);
							((Class_xa_Sub1) this).anInt8783++;
						}
					}
				}
			}
			for (int i_319_ = 0; i_319_ < ((Class_xa_Sub1) this).anInt8774; i_319_++) {
				Class330_Sub16 class330_sub16 = class330_sub16s[i_319_];
				if (class330_sub16 != null)
					class330_sub16.method3338(i_319_);
			}
			for (int i_320_ = 0; i_320_ < anInt6397 * 1972554729; i_320_++) {
				for (int i_321_ = 0; i_321_ < anInt6393 * 24567321; i_321_++) {
					short[] is_322_ = (((Class_xa_Sub1) this).aShortArrayArray8756[i_321_ * (anInt6397 * 1972554729) + i_320_]);
					if (is_322_ != null) {
						int i_323_ = 0;
						int i_324_ = 0;
						while (i_324_ < is_322_.length) {
							int i_325_ = is_322_[i_324_++] & 0xffff;
							int i_326_ = is_322_[i_324_++] & 0xffff;
							int i_327_ = is_322_[i_324_++] & 0xffff;
							Class330_Sub16 class330_sub16 = class330_sub16s[i_325_];
							Class330_Sub16 class330_sub16_328_ = class330_sub16s[i_326_];
							Class330_Sub16 class330_sub16_329_ = class330_sub16s[i_327_];
							Class330_Sub16 class330_sub16_330_ = null;
							if (class330_sub16 != null) {
								class330_sub16.method3339(i_320_, i_321_, i_323_);
								class330_sub16_330_ = class330_sub16;
							}
							if (class330_sub16_328_ != null) {
								class330_sub16_328_.method3339(i_320_, i_321_, i_323_);
								if (class330_sub16_330_ == null || ((class330_sub16_328_.aLong3341 * -6154793640677333111L) < (class330_sub16_330_.aLong3341 * -6154793640677333111L)))
									class330_sub16_330_ = class330_sub16_328_;
							}
							if (class330_sub16_329_ != null) {
								class330_sub16_329_.method3339(i_320_, i_321_, i_323_);
								if (class330_sub16_330_ == null || ((class330_sub16_329_.aLong3341 * -6154793640677333111L) < (class330_sub16_330_.aLong3341 * -6154793640677333111L)))
									class330_sub16_330_ = class330_sub16_329_;
							}
							if (class330_sub16_330_ != null) {
								if (class330_sub16 != null)
									class330_sub16_330_.method3338(i_325_);
								if (class330_sub16_328_ != null)
									class330_sub16_330_.method3338(i_326_);
								if (class330_sub16_329_ != null)
									class330_sub16_330_.method3338(i_327_);
								class330_sub16_330_.method3339(i_320_, i_321_, i_323_);
							}
							i_323_++;
						}
					}
				}
			}
			stream.f();
			((Class_xa_Sub1) this).anInterface1_8776 = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4872(i, nativeheapbuffer, stream.j(), false);
			if (((Class_xa_Sub1) this).anInterface1_8776 instanceof Class46_Sub1)
				nativeheapbuffer.n();
			((Class_xa_Sub1) this).aClass44_8777 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, 0);
			((Class_xa_Sub1) this).aClass44_8778 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5121, 4, 12);
			int i_331_;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null) {
				((Class_xa_Sub1) this).aClass44_8780 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, 16);
				i_331_ = 28;
			} else {
				((Class_xa_Sub1) this).aClass44_8780 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 2, 16);
				i_331_ = 24;
			}
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0)
				((Class_xa_Sub1) this).aClass44_8767 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, i_331_);
			long[] ls = new long[((Class_xa_Sub1) this).aClass330Array8775.length];
			for (int i_332_ = 0; i_332_ < ((Class_xa_Sub1) this).aClass330Array8775.length; i_332_++) {
				Class330_Sub16 class330_sub16 = ((Class330_Sub16) ((Class_xa_Sub1) this).aClass330Array8775[i_332_]);
				ls[i_332_] = class330_sub16.aLong3341 * -6154793640677333111L;
				class330_sub16.method3341(((Class_xa_Sub1) this).anInt8774);
			}
			Class330_Sub40_Sub1.method3584(ls, (((Class_xa_Sub1) this).aClass330Array8775), (byte) 16);
			if (((Class_xa_Sub1) this).aClass58_8773 != null)
				((Class_xa_Sub1) this).aClass58_8773.method661();
		} else
			((Class_xa_Sub1) this).aClass58_8773 = null;
		if ((((Class_xa_Sub1) this).anInt8760 & 0x2) == 0) {
			((Class_xa_Sub1) this).anIntArrayArrayArray8769 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8786 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8762 = null;
		}
		((Class_xa_Sub1) this).anIntArrayArrayArray8771 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8772 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8770 = null;
		((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764 = null;
		((Class_xa_Sub1) this).aByteArrayArray8766 = null;
		((Class_xa_Sub1) this).aClass497_8763 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8758 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8785 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8784 = null;
	}

	public void c() {
		if (((Class_xa_Sub1) this).anInt8781 > 0) {
			byte[][] is = (new byte[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1]);
			for (int i = 1; i < anInt6397 * 1972554729; i++) {
				for (int i_333_ = 1; i_333_ < anInt6393 * 24567321; i_333_++)
					is[i][i_333_] = (byte) (((((Class_xa_Sub1) this).aByteArrayArray8766[i - 1][i_333_]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i + 1][i_333_]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_333_ - 1]) >> 2) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_333_ + 1]) >> 3) + ((((Class_xa_Sub1) this).aByteArrayArray8766[i][i_333_]) >> 1));
			}
			((Class_xa_Sub1) this).aClass330Array8775 = new Class330[((Class_xa_Sub1) this).aClass497_8763.method6096(662711022)];
			((Class_xa_Sub1) this).aClass497_8763.method6093(((Class_xa_Sub1) this).aClass330Array8775, 496217807);
			for (int i = 0; i < ((Class_xa_Sub1) this).aClass330Array8775.length; i++)
				((Class330_Sub16) ((Class_xa_Sub1) this).aClass330Array8775[i]).method3337(((Class_xa_Sub1) this).anInt8781);
			int i = 24;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null)
				i += 4;
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0)
				i += 12;
			NativeHeapBuffer nativeheapbuffer = ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aNativeHeap8308.j(((Class_xa_Sub1) this).anInt8781 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Class330_Sub16[] class330_sub16s = new Class330_Sub16[((Class_xa_Sub1) this).anInt8781];
			int i_334_ = Class385.method4425(((Class_xa_Sub1) this).anInt8781 / 4, (short) 20316);
			if (i_334_ < 1)
				i_334_ = 1;
			Class497 class497 = new Class497(i_334_);
			Class330_Sub16[] class330_sub16s_335_ = new Class330_Sub16[((Class_xa_Sub1) this).anInt8782];
			for (int i_336_ = 0; i_336_ < anInt6397 * 1972554729; i_336_++) {
				for (int i_337_ = 0; i_337_ < anInt6393 * 24567321; i_337_++) {
					if ((((Class_xa_Sub1) this).anIntArrayArrayArray8762[i_336_][i_337_]) != null) {
						Class330_Sub16[] class330_sub16s_338_ = (((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764[i_336_][i_337_]);
						int[] is_339_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8786[i_336_][i_337_]);
						int[] is_340_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8769[i_336_][i_337_]);
						int[] is_341_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8772[i_336_][i_337_]);
						int[] is_342_ = (((Class_xa_Sub1) this).anIntArrayArrayArray8762[i_336_][i_337_]);
						int[] is_343_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8770 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8770[i_336_][i_337_]) : null);
						int[] is_344_ = ((((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null) ? (((Class_xa_Sub1) this).anIntArrayArrayArray8771[i_336_][i_337_]) : null);
						if (is_341_ == null)
							is_341_ = is_342_;
						float f = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_336_][i_337_]);
						float f_345_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_336_][i_337_]);
						float f_346_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_336_][i_337_]);
						float f_347_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_336_][i_337_ + 1]);
						float f_348_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_336_][i_337_ + 1]);
						float f_349_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_336_][i_337_ + 1]);
						float f_350_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_336_ + 1][i_337_ + 1]);
						float f_351_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_336_ + 1][i_337_ + 1]);
						float f_352_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_336_ + 1][i_337_ + 1]);
						float f_353_ = (((Class_xa_Sub1) this).aFloatArrayArray8784[i_336_ + 1][i_337_]);
						float f_354_ = (((Class_xa_Sub1) this).aFloatArrayArray8785[i_336_ + 1][i_337_]);
						float f_355_ = (((Class_xa_Sub1) this).aFloatArrayArray8758[i_336_ + 1][i_337_]);
						int i_356_ = is[i_336_][i_337_] & 0xff;
						int i_357_ = is[i_336_][i_337_ + 1] & 0xff;
						int i_358_ = is[i_336_ + 1][i_337_ + 1] & 0xff;
						int i_359_ = is[i_336_ + 1][i_337_] & 0xff;
						int i_360_ = 0;
						while_114_: for (int i_361_ = 0; i_361_ < is_342_.length; i_361_++) {
							Class330_Sub16 class330_sub16 = class330_sub16s_338_[i_361_];
							for (int i_362_ = 0; i_362_ < i_360_; i_362_++) {
								if (class330_sub16s_335_[i_362_] == class330_sub16)
									continue while_114_;
							}
							class330_sub16s_335_[i_360_++] = class330_sub16;
						}
						short[] is_363_ = (((Class_xa_Sub1) this).aShortArrayArray8756[i_337_ * (anInt6397 * 1972554729) + i_336_] = new short[is_342_.length]);
						for (int i_364_ = 0; i_364_ < is_342_.length; i_364_++) {
							int i_365_ = ((i_336_ << anInt6396 * -1066304221) + is_339_[i_364_]);
							int i_366_ = ((i_337_ << anInt6396 * -1066304221) + is_340_[i_364_]);
							int i_367_ = i_365_ >> ((Class_xa_Sub1) this).anInt8779;
							int i_368_ = i_366_ >> ((Class_xa_Sub1) this).anInt8779;
							int i_369_ = is_342_[i_364_];
							int i_370_ = is_341_[i_364_];
							int i_371_ = is_343_ != null ? is_343_[i_364_] : 0;
							long l = ((long) i_370_ << 48 | (long) i_369_ << 32 | (long) (i_367_ << 16) | (long) i_368_);
							int i_372_ = is_339_[i_364_];
							int i_373_ = is_340_[i_364_];
							int i_374_ = 74;
							int i_375_ = 0;
							float f_376_ = 1.0F;
							float f_377_;
							float f_378_;
							float f_379_;
							if (i_372_ == 0 && i_373_ == 0) {
								f_377_ = f;
								f_378_ = f_345_;
								f_379_ = f_346_;
								i_374_ -= i_356_;
							} else if (i_372_ == 0 && i_373_ == anInt6395 * 550173571) {
								f_377_ = f_347_;
								f_378_ = f_348_;
								f_379_ = f_349_;
								i_374_ -= i_357_;
							} else if (i_372_ == anInt6395 * 550173571 && i_373_ == anInt6395 * 550173571) {
								f_377_ = f_350_;
								f_378_ = f_351_;
								f_379_ = f_352_;
								i_374_ -= i_358_;
							} else if (i_372_ == anInt6395 * 550173571 && i_373_ == 0) {
								f_377_ = f_353_;
								f_378_ = f_354_;
								f_379_ = f_355_;
								i_374_ -= i_359_;
							} else {
								float f_380_ = ((float) i_372_ / (float) (anInt6395 * 550173571));
								float f_381_ = ((float) i_373_ / (float) (anInt6395 * 550173571));
								float f_382_ = f + (f_353_ - f) * f_380_;
								float f_383_ = f_345_ + (f_354_ - f_345_) * f_380_;
								float f_384_ = f_346_ + (f_355_ - f_346_) * f_380_;
								float f_385_ = f_347_ + (f_350_ - f_347_) * f_380_;
								float f_386_ = f_348_ + (f_351_ - f_348_) * f_380_;
								float f_387_ = f_349_ + (f_352_ - f_349_) * f_380_;
								f_377_ = f_382_ + (f_385_ - f_382_) * f_381_;
								f_378_ = f_383_ + (f_386_ - f_383_) * f_381_;
								f_379_ = f_384_ + (f_387_ - f_384_) * f_381_;
								int i_388_ = i_356_ + ((i_359_ - i_356_) * i_372_ >> anInt6396 * -1066304221);
								int i_389_ = i_357_ + ((i_358_ - i_357_) * i_372_ >> anInt6396 * -1066304221);
								i_374_ -= i_388_ + ((i_389_ - i_388_) * i_373_ >> anInt6396 * -1066304221);
							}
							if (i_369_ != -1) {
								int i_390_ = (i_369_ & 0x7f) * i_374_ >> 7;
								if (i_390_ < 2)
									i_390_ = 2;
								else if (i_390_ > 126)
									i_390_ = 126;
								i_375_ = (Console.colorArray[i_369_ & 0xff80 | i_390_]);
								if ((((Class_xa_Sub1) this).anInt8761 & 0x7) == 0) {
									f_376_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[0]) * f_377_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[1]) * f_378_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[2]) * f_379_);
									f_376_ = (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8372 + (f_376_ * (f_376_ > 0.0F ? (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8373) : (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8374))));
								}
							}
							Class330 class330 = null;
							if ((i_365_ & ((Class_xa_Sub1) this).anInt8759 - 1) == 0 && ((i_366_ & ((Class_xa_Sub1) this).anInt8759 - 1) == 0))
								class330 = class497.method6094(l);
							int i_391_;
							if (class330 == null) {
								int i_392_;
								if (i_370_ != i_369_) {
									int i_393_ = (i_370_ & 0x7f) * i_374_ >> 7;
									if (i_393_ < 2)
										i_393_ = 2;
									else if (i_393_ > 126)
										i_393_ = 126;
									i_392_ = (Console.colorArray[i_370_ & 0xff80 | i_393_]);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) == 0) {
										float f_394_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[0]) * f_377_ + (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[1]) * f_378_ + ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloatArray8366[2]) * f_379_));
										f_394_ = ((((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8372) + (f_376_ * (f_376_ > 0.0F ? (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8373) : (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aFloat8374))));
										int i_395_ = i_392_ >> 16 & 0xff;
										int i_396_ = i_392_ >> 8 & 0xff;
										int i_397_ = i_392_ & 0xff;
										i_395_ *= f_394_;
										if (i_395_ < 0)
											i_395_ = 0;
										else if (i_395_ > 255)
											i_395_ = 255;
										i_396_ *= f_394_;
										if (i_396_ < 0)
											i_396_ = 0;
										else if (i_396_ > 255)
											i_396_ = 255;
										i_397_ *= f_394_;
										if (i_397_ < 0)
											i_397_ = 0;
										else if (i_397_ > 255)
											i_397_ = 255;
										i_392_ = (i_395_ << 16 | i_396_ << 8 | i_397_);
									}
								} else
									i_392_ = i_375_;
								if (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).aBoolean8407) {
									stream.o((float) i_365_);
									stream.o((float) (method6416(i_365_, i_366_, 1269688705) + i_371_));
									stream.o((float) i_366_);
									stream.p((byte) (i_392_ >> 16));
									stream.p((byte) (i_392_ >> 8));
									stream.p((byte) i_392_);
									stream.p(-1);
									stream.o((float) i_365_);
									stream.o((float) i_366_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8771) != null)
										stream.o(is_344_ != null ? (float) (is_344_[i_364_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
										stream.o(f_377_);
										stream.o(f_378_);
										stream.o(f_379_);
									}
								} else {
									stream.s((float) i_365_);
									stream.s((float) (method6416(i_365_, i_366_, 1061843319) + i_371_));
									stream.s((float) i_366_);
									stream.p((byte) (i_392_ >> 16));
									stream.p((byte) (i_392_ >> 8));
									stream.p((byte) i_392_);
									stream.p(-1);
									stream.s((float) i_365_);
									stream.s((float) i_366_);
									if ((((Class_xa_Sub1) this).anIntArrayArrayArray8771) != null)
										stream.s(is_344_ != null ? (float) (is_344_[i_364_] - 1) : 0.0F);
									if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
										stream.s(f_377_);
										stream.s(f_378_);
										stream.s(f_379_);
									}
								}
								i_391_ = ((Class_xa_Sub1) this).anInt8774++;
								is_363_[i_364_] = (short) i_391_;
								if (i_369_ != -1)
									class330_sub16s[i_391_] = class330_sub16s_338_[i_364_];
								class497.method6097(new Class330_Sub24(is_363_[i_364_]), l);
							} else {
								is_363_[i_364_] = ((Class330_Sub24) class330).aShort7694;
								i_391_ = is_363_[i_364_] & 0xffff;
								if (i_369_ != -1 && ((class330_sub16s_338_[i_364_].aLong3341 * -6154793640677333111L) < (class330_sub16s[i_391_].aLong3341 * -6154793640677333111L)))
									class330_sub16s[i_391_] = class330_sub16s_338_[i_364_];
							}
							for (int i_398_ = 0; i_398_ < i_360_; i_398_++)
								class330_sub16s_335_[i_398_].method3336(i_391_, i_375_, i_374_, f_376_);
							((Class_xa_Sub1) this).anInt8783++;
						}
					}
				}
			}
			for (int i_399_ = 0; i_399_ < ((Class_xa_Sub1) this).anInt8774; i_399_++) {
				Class330_Sub16 class330_sub16 = class330_sub16s[i_399_];
				if (class330_sub16 != null)
					class330_sub16.method3338(i_399_);
			}
			for (int i_400_ = 0; i_400_ < anInt6397 * 1972554729; i_400_++) {
				for (int i_401_ = 0; i_401_ < anInt6393 * 24567321; i_401_++) {
					short[] is_402_ = (((Class_xa_Sub1) this).aShortArrayArray8756[i_401_ * (anInt6397 * 1972554729) + i_400_]);
					if (is_402_ != null) {
						int i_403_ = 0;
						int i_404_ = 0;
						while (i_404_ < is_402_.length) {
							int i_405_ = is_402_[i_404_++] & 0xffff;
							int i_406_ = is_402_[i_404_++] & 0xffff;
							int i_407_ = is_402_[i_404_++] & 0xffff;
							Class330_Sub16 class330_sub16 = class330_sub16s[i_405_];
							Class330_Sub16 class330_sub16_408_ = class330_sub16s[i_406_];
							Class330_Sub16 class330_sub16_409_ = class330_sub16s[i_407_];
							Class330_Sub16 class330_sub16_410_ = null;
							if (class330_sub16 != null) {
								class330_sub16.method3339(i_400_, i_401_, i_403_);
								class330_sub16_410_ = class330_sub16;
							}
							if (class330_sub16_408_ != null) {
								class330_sub16_408_.method3339(i_400_, i_401_, i_403_);
								if (class330_sub16_410_ == null || ((class330_sub16_408_.aLong3341 * -6154793640677333111L) < (class330_sub16_410_.aLong3341 * -6154793640677333111L)))
									class330_sub16_410_ = class330_sub16_408_;
							}
							if (class330_sub16_409_ != null) {
								class330_sub16_409_.method3339(i_400_, i_401_, i_403_);
								if (class330_sub16_410_ == null || ((class330_sub16_409_.aLong3341 * -6154793640677333111L) < (class330_sub16_410_.aLong3341 * -6154793640677333111L)))
									class330_sub16_410_ = class330_sub16_409_;
							}
							if (class330_sub16_410_ != null) {
								if (class330_sub16 != null)
									class330_sub16_410_.method3338(i_405_);
								if (class330_sub16_408_ != null)
									class330_sub16_410_.method3338(i_406_);
								if (class330_sub16_409_ != null)
									class330_sub16_410_.method3338(i_407_);
								class330_sub16_410_.method3339(i_400_, i_401_, i_403_);
							}
							i_403_++;
						}
					}
				}
			}
			stream.f();
			((Class_xa_Sub1) this).anInterface1_8776 = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4872(i, nativeheapbuffer, stream.j(), false);
			if (((Class_xa_Sub1) this).anInterface1_8776 instanceof Class46_Sub1)
				nativeheapbuffer.n();
			((Class_xa_Sub1) this).aClass44_8777 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, 0);
			((Class_xa_Sub1) this).aClass44_8778 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5121, 4, 12);
			int i_411_;
			if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null) {
				((Class_xa_Sub1) this).aClass44_8780 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, 16);
				i_411_ = 28;
			} else {
				((Class_xa_Sub1) this).aClass44_8780 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 2, 16);
				i_411_ = 24;
			}
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0)
				((Class_xa_Sub1) this).aClass44_8767 = new Class44(((Class_xa_Sub1) this).anInterface1_8776, 5126, 3, i_411_);
			long[] ls = new long[((Class_xa_Sub1) this).aClass330Array8775.length];
			for (int i_412_ = 0; i_412_ < ((Class_xa_Sub1) this).aClass330Array8775.length; i_412_++) {
				Class330_Sub16 class330_sub16 = ((Class330_Sub16) ((Class_xa_Sub1) this).aClass330Array8775[i_412_]);
				ls[i_412_] = class330_sub16.aLong3341 * -6154793640677333111L;
				class330_sub16.method3341(((Class_xa_Sub1) this).anInt8774);
			}
			Class330_Sub40_Sub1.method3584(ls, (((Class_xa_Sub1) this).aClass330Array8775), (byte) 16);
			if (((Class_xa_Sub1) this).aClass58_8773 != null)
				((Class_xa_Sub1) this).aClass58_8773.method661();
		} else
			((Class_xa_Sub1) this).aClass58_8773 = null;
		if ((((Class_xa_Sub1) this).anInt8760 & 0x2) == 0) {
			((Class_xa_Sub1) this).anIntArrayArrayArray8769 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8786 = null;
			((Class_xa_Sub1) this).anIntArrayArrayArray8762 = null;
		}
		((Class_xa_Sub1) this).anIntArrayArrayArray8771 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8772 = null;
		((Class_xa_Sub1) this).anIntArrayArrayArray8770 = null;
		((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764 = null;
		((Class_xa_Sub1) this).aByteArrayArray8766 = null;
		((Class_xa_Sub1) this).aClass497_8763 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8758 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8785 = null;
		((Class_xa_Sub1) this).aFloatArrayArray8784 = null;
	}

	public void method6419(int i, int i_413_, int[] is, int[] is_414_, int[] is_415_, int[] is_416_, int[] is_417_, int[] is_418_, int[] is_419_, int[] is_420_, Class77 class77, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.anInterface_ma4227;
		if (is_416_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8771 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8771 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		if (is_414_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8770 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8770 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8786[i][i_413_] = is;
		((Class_xa_Sub1) this).anIntArrayArrayArray8769[i][i_413_] = is_415_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8762[i][i_413_] = is_417_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8772[i][i_413_] = is_418_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8771[i][i_413_] = is_416_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8770 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8770[i][i_413_] = is_414_;
		Class330_Sub16[] class330_sub16s = (((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764[i][i_413_] = new Class330_Sub16[is_417_.length]);
		for (int i_421_ = 0; i_421_ < is_417_.length; i_421_++) {
			int i_422_ = is_419_[i_421_];
			int i_423_ = is_420_[i_421_];
			if ((((Class_xa_Sub1) this).anInt8761 & 0x20) != 0 && i_422_ != -1 && interface_ma.method221(i_422_, -581082045).aBoolean533) {
				i_423_ = 128;
				i_422_ = -1;
			}
			long l = ((long) (class77.anInt651 * -892945375) << 48 | (long) (class77.anInt650 * -348036733) << 42 | (long) (class77.anInt652 * -576105833) << 28 | (long) (i_423_ << 14) | (long) i_422_);
			Class330 class330;
			for (class330 = ((Class_xa_Sub1) this).aClass497_8763.method6094(l); class330 != null; class330 = ((Class_xa_Sub1) this).aClass497_8763.method6095(1632506727)) {
				Class330_Sub16 class330_sub16 = (Class330_Sub16) class330;
				if (((Class330_Sub16) class330_sub16).anInt7617 == i_422_ && (((Class330_Sub16) class330_sub16).aFloat7618 == (float) i_423_) && ((Class330_Sub16) class330_sub16).aClass77_7615.method925(class77, 910515191))
					break;
			}
			if (class330 == null) {
				class330_sub16s[i_421_] = new Class330_Sub16(this, i_422_, i_423_, class77);
				((Class_xa_Sub1) this).aClass497_8763.method6097(class330_sub16s[i_421_], l);
			} else
				class330_sub16s[i_421_] = (Class330_Sub16) class330;
		}
		if (bool)
			((Class_xa_Sub1) this).aByteArrayArray8755[i][i_413_] |= 0x1;
		if (is_417_.length > ((Class_xa_Sub1) this).anInt8782)
			((Class_xa_Sub1) this).anInt8782 = is_417_.length;
		((Class_xa_Sub1) this).anInt8781 += is_417_.length;
	}

	public void method6412(int i, int i_424_, int i_425_, int i_426_, int i_427_, int i_428_, int i_429_, boolean[][] bools) {
		Class76 class76 = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4782((byte) 0);
		if (((Class_xa_Sub1) this).anInt8781 > 0 && class76 != null) {
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4874();
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4853(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4816(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4815(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4859(0);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4841(-2);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4844(null);
			aFloatArray8788[0] = (float) i_425_ / (128.0F * (float) (anInt6395 * 550173571) * (float) class76.method856());
			aFloatArray8788[1] = 0.0F;
			aFloatArray8788[2] = 0.0F;
			aFloatArray8788[3] = 0.0F;
			aFloatArray8788[4] = 0.0F;
			aFloatArray8788[5] = (float) i_425_ / (128.0F * (float) (anInt6395 * 550173571) * (float) class76.method857());
			aFloatArray8788[6] = 0.0F;
			aFloatArray8788[7] = 0.0F;
			aFloatArray8788[8] = 0.0F;
			aFloatArray8788[9] = 0.0F;
			aFloatArray8788[10] = 0.0F;
			aFloatArray8788[11] = 0.0F;
			aFloatArray8788[12] = -1.0F - ((float) (i_426_ * i_425_) / 128.0F - (float) (i * 2)) / (float) class76.method856();
			aFloatArray8788[13] = 1.0F - (((float) (2 * i_424_) + (float) (i_429_ * i_425_) / 128.0F) / (float) class76.method857());
			aFloatArray8788[14] = 0.0F;
			aFloatArray8788[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8788, 0);
			aFloatArray8788[0] = 1.0F;
			aFloatArray8788[1] = 0.0F;
			aFloatArray8788[2] = 0.0F;
			aFloatArray8788[3] = 0.0F;
			aFloatArray8788[4] = 0.0F;
			aFloatArray8788[5] = 0.0F;
			aFloatArray8788[6] = 1.0F;
			aFloatArray8788[7] = 0.0F;
			aFloatArray8788[8] = 0.0F;
			aFloatArray8788[9] = 1.0F;
			aFloatArray8788[10] = 0.0F;
			aFloatArray8788[11] = 0.0F;
			aFloatArray8788[12] = 0.0F;
			aFloatArray8788[13] = 0.0F;
			aFloatArray8788[14] = 0.0F;
			aFloatArray8788[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8788, 0);
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(true);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4878();
			} else
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4869(((Class_xa_Sub1) this).aClass44_8777, ((Class_xa_Sub1) this).aClass44_8767, ((Class_xa_Sub1) this).aClass44_8778, ((Class_xa_Sub1) this).aClass44_8780);
			if ((((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381.payload).length < ((Class_xa_Sub1) this).anInt8783 * 2)
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(((Class_xa_Sub1) this).anInt8783 * 2);
			else
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381.offset = 0;
			int i_430_ = 0;
			Class330_Sub46_Sub1 class330_sub46_sub1 = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381);
			if (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aBoolean8407) {
				for (int i_431_ = i_427_; i_431_ < i_429_; i_431_++) {
					int i_432_ = i_431_ * (anInt6397 * 1972554729) + i_426_;
					for (int i_433_ = i_426_; i_433_ < i_428_; i_433_++) {
						if (bools[i_433_ - i_426_][i_431_ - i_427_]) {
							short[] is = (((Class_xa_Sub1) this).aShortArrayArray8756[i_432_]);
							if (is != null) {
								for (int i_434_ = 0; i_434_ < is.length; i_434_++) {
									class330_sub46_sub1.addShort((is[i_434_] & 0xffff), (byte) 120);
									i_430_++;
								}
							}
						}
						i_432_++;
					}
				}
			} else {
				for (int i_435_ = i_427_; i_435_ < i_429_; i_435_++) {
					int i_436_ = i_435_ * (anInt6397 * 1972554729) + i_426_;
					for (int i_437_ = i_426_; i_437_ < i_428_; i_437_++) {
						if (bools[i_437_ - i_426_][i_435_ - i_427_]) {
							short[] is = (((Class_xa_Sub1) this).aShortArrayArray8756[i_436_]);
							if (is != null) {
								for (int i_438_ = 0; i_438_ < is.length; i_438_++) {
									class330_sub46_sub1.method3742(is[i_438_] & 0xffff, (short) 2527);
									i_430_++;
								}
							}
						}
						i_436_++;
					}
				}
			}
			if (i_430_ > 0) {
				Class34_Sub1 class34_sub1 = new Class34_Sub1((((Class_xa_Sub1) this).aClass_ra_Sub1_8757), 5123, class330_sub46_sub1.payload, (class330_sub46_sub1.offset * -824785231));
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4837(class34_sub1, 4, 0, i_430_);
			}
		}
	}

	public void method6415(int i, int i_439_, int i_440_, int i_441_, int i_442_, int i_443_, int i_444_, boolean[][] bools) {
		Class76 class76 = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4782((byte) 0);
		if (((Class_xa_Sub1) this).anInt8781 > 0 && class76 != null) {
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4874();
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4853(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4816(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4815(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4859(0);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4841(-2);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4844(null);
			aFloatArray8788[0] = (float) i_440_ / (128.0F * (float) (anInt6395 * 550173571) * (float) class76.method856());
			aFloatArray8788[1] = 0.0F;
			aFloatArray8788[2] = 0.0F;
			aFloatArray8788[3] = 0.0F;
			aFloatArray8788[4] = 0.0F;
			aFloatArray8788[5] = (float) i_440_ / (128.0F * (float) (anInt6395 * 550173571) * (float) class76.method857());
			aFloatArray8788[6] = 0.0F;
			aFloatArray8788[7] = 0.0F;
			aFloatArray8788[8] = 0.0F;
			aFloatArray8788[9] = 0.0F;
			aFloatArray8788[10] = 0.0F;
			aFloatArray8788[11] = 0.0F;
			aFloatArray8788[12] = -1.0F - ((float) (i_441_ * i_440_) / 128.0F - (float) (i * 2)) / (float) class76.method856();
			aFloatArray8788[13] = 1.0F - (((float) (2 * i_439_) + (float) (i_444_ * i_440_) / 128.0F) / (float) class76.method857());
			aFloatArray8788[14] = 0.0F;
			aFloatArray8788[15] = 1.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(aFloatArray8788, 0);
			aFloatArray8788[0] = 1.0F;
			aFloatArray8788[1] = 0.0F;
			aFloatArray8788[2] = 0.0F;
			aFloatArray8788[3] = 0.0F;
			aFloatArray8788[4] = 0.0F;
			aFloatArray8788[5] = 0.0F;
			aFloatArray8788[6] = 1.0F;
			aFloatArray8788[7] = 0.0F;
			aFloatArray8788[8] = 0.0F;
			aFloatArray8788[9] = 1.0F;
			aFloatArray8788[10] = 0.0F;
			aFloatArray8788[11] = 0.0F;
			aFloatArray8788[12] = 0.0F;
			aFloatArray8788[13] = 0.0F;
			aFloatArray8788[14] = 0.0F;
			aFloatArray8788[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(aFloatArray8788, 0);
			if ((((Class_xa_Sub1) this).anInt8761 & 0x7) != 0) {
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(true);
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4878();
			} else
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4854(false);
			((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4869(((Class_xa_Sub1) this).aClass44_8777, ((Class_xa_Sub1) this).aClass44_8767, ((Class_xa_Sub1) this).aClass44_8778, ((Class_xa_Sub1) this).aClass44_8780);
			if ((((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381.payload).length < ((Class_xa_Sub1) this).anInt8783 * 2)
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381 = new Class330_Sub46_Sub1(((Class_xa_Sub1) this).anInt8783 * 2);
			else
				((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381.offset = 0;
			int i_445_ = 0;
			Class330_Sub46_Sub1 class330_sub46_sub1 = (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aClass330_Sub46_Sub1_8381);
			if (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).aBoolean8407) {
				for (int i_446_ = i_442_; i_446_ < i_444_; i_446_++) {
					int i_447_ = i_446_ * (anInt6397 * 1972554729) + i_441_;
					for (int i_448_ = i_441_; i_448_ < i_443_; i_448_++) {
						if (bools[i_448_ - i_441_][i_446_ - i_442_]) {
							short[] is = (((Class_xa_Sub1) this).aShortArrayArray8756[i_447_]);
							if (is != null) {
								for (int i_449_ = 0; i_449_ < is.length; i_449_++) {
									class330_sub46_sub1.addShort((is[i_449_] & 0xffff), (byte) 98);
									i_445_++;
								}
							}
						}
						i_447_++;
					}
				}
			} else {
				for (int i_450_ = i_442_; i_450_ < i_444_; i_450_++) {
					int i_451_ = i_450_ * (anInt6397 * 1972554729) + i_441_;
					for (int i_452_ = i_441_; i_452_ < i_443_; i_452_++) {
						if (bools[i_452_ - i_441_][i_450_ - i_442_]) {
							short[] is = (((Class_xa_Sub1) this).aShortArrayArray8756[i_451_]);
							if (is != null) {
								for (int i_453_ = 0; i_453_ < is.length; i_453_++) {
									class330_sub46_sub1.method3742(is[i_453_] & 0xffff, (short) 8682);
									i_445_++;
								}
							}
						}
						i_451_++;
					}
				}
			}
			if (i_445_ > 0) {
				Class34_Sub1 class34_sub1 = new Class34_Sub1((((Class_xa_Sub1) this).aClass_ra_Sub1_8757), 5123, class330_sub46_sub1.payload, (class330_sub46_sub1.offset * -824785231));
				((Class_xa_Sub1) this).aClass_ra_Sub1_8757.method4837(class34_sub1, 4, 0, i_445_);
			}
		}
	}

	public Class_na h(int i, int i_454_, Class_na class_na) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8755[i][i_454_] & 0x1) == 0)
			return null;
		int i_455_ = (anInt6395 * 550173571 >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_456_;
		if (class_na_sub2 != null && class_na_sub2.method3531(i_455_, i_455_)) {
			class_na_sub2_456_ = class_na_sub2;
			class_na_sub2_456_.method3532();
		} else
			class_na_sub2_456_ = new Class_na_Sub2(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, i_455_, i_455_);
		class_na_sub2_456_.method3530(0, 0, i_455_, i_455_);
		method6437(class_na_sub2_456_, i, i_454_);
		return class_na_sub2_456_;
	}

	public Class_na w(int i, int i_457_, Class_na class_na) {
		if ((((Class_xa_Sub1) this).aByteArrayArray8755[i][i_457_] & 0x1) == 0)
			return null;
		int i_458_ = (anInt6395 * 550173571 >> (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296));
		Class_na_Sub2 class_na_sub2 = (Class_na_Sub2) class_na;
		Class_na_Sub2 class_na_sub2_459_;
		if (class_na_sub2 != null && class_na_sub2.method3531(i_458_, i_458_)) {
			class_na_sub2_459_ = class_na_sub2;
			class_na_sub2_459_.method3532();
		} else
			class_na_sub2_459_ = new Class_na_Sub2(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, i_458_, i_458_);
		class_na_sub2_459_.method3530(0, 0, i_458_, i_458_);
		method6437(class_na_sub2_459_, i, i_457_);
		return class_na_sub2_459_;
	}

	public void ay(Class_na class_na, int i, int i_460_, int i_461_, int i_462_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_463_ = (i - (i_460_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8410) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			int i_464_ = (i_461_ - (i_460_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method662(class_na, i_463_, i_464_);
		}
	}

	public void method6422(int i, int i_465_, int[] is, int[] is_466_, int[] is_467_, int[] is_468_, int[] is_469_, int[] is_470_, int[] is_471_, int[] is_472_, Class77 class77, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub1) this).aClass_ra_Sub1_8757.anInterface_ma4227;
		if (is_468_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8771 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8771 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		if (is_466_ != null && ((Class_xa_Sub1) this).anIntArrayArrayArray8770 == null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8770 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8786[i][i_465_] = is;
		((Class_xa_Sub1) this).anIntArrayArrayArray8769[i][i_465_] = is_467_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8762[i][i_465_] = is_469_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8772[i][i_465_] = is_470_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8771 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8771[i][i_465_] = is_468_;
		if (((Class_xa_Sub1) this).anIntArrayArrayArray8770 != null)
			((Class_xa_Sub1) this).anIntArrayArrayArray8770[i][i_465_] = is_466_;
		Class330_Sub16[] class330_sub16s = (((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764[i][i_465_] = new Class330_Sub16[is_469_.length]);
		for (int i_473_ = 0; i_473_ < is_469_.length; i_473_++) {
			int i_474_ = is_471_[i_473_];
			int i_475_ = is_472_[i_473_];
			if ((((Class_xa_Sub1) this).anInt8761 & 0x20) != 0 && i_474_ != -1 && interface_ma.method221(i_474_, 1506652255).aBoolean533) {
				i_475_ = 128;
				i_474_ = -1;
			}
			long l = ((long) (class77.anInt651 * -892945375) << 48 | (long) (class77.anInt650 * -348036733) << 42 | (long) (class77.anInt652 * -576105833) << 28 | (long) (i_475_ << 14) | (long) i_474_);
			Class330 class330;
			for (class330 = ((Class_xa_Sub1) this).aClass497_8763.method6094(l); class330 != null; class330 = ((Class_xa_Sub1) this).aClass497_8763.method6095(1719602318)) {
				Class330_Sub16 class330_sub16 = (Class330_Sub16) class330;
				if (((Class330_Sub16) class330_sub16).anInt7617 == i_474_ && (((Class330_Sub16) class330_sub16).aFloat7618 == (float) i_475_) && ((Class330_Sub16) class330_sub16).aClass77_7615.method925(class77, 143744024))
					break;
			}
			if (class330 == null) {
				class330_sub16s[i_473_] = new Class330_Sub16(this, i_474_, i_475_, class77);
				((Class_xa_Sub1) this).aClass497_8763.method6097(class330_sub16s[i_473_], l);
			} else
				class330_sub16s[i_473_] = (Class330_Sub16) class330;
		}
		if (bool)
			((Class_xa_Sub1) this).aByteArrayArray8755[i][i_465_] |= 0x1;
		if (is_469_.length > ((Class_xa_Sub1) this).anInt8782)
			((Class_xa_Sub1) this).anInt8782 = is_469_.length;
		((Class_xa_Sub1) this).anInt8781 += is_469_.length;
	}

	Class_xa_Sub1(Class_ra_Sub1 class_ra_sub1, int i, int i_476_, int i_477_, int i_478_, int[][] is, int[][] is_479_, int i_480_) {
		super(i_477_, i_478_, i_480_, is);
		((Class_xa_Sub1) this).aClass_ra_Sub1_8757 = class_ra_sub1;
		((Class_xa_Sub1) this).anInt8779 = anInt6396 * -1066304221 - 2;
		((Class_xa_Sub1) this).anInt8759 = 1 << ((Class_xa_Sub1) this).anInt8779;
		((Class_xa_Sub1) this).anInt8760 = i;
		((Class_xa_Sub1) this).anInt8761 = i_476_;
		((Class_xa_Sub1) this).anIntArrayArrayArray8770 = new int[i_477_][i_478_][];
		((Class_xa_Sub1) this).aClass330_Sub16ArrayArrayArray8764 = new Class330_Sub16[i_477_][i_478_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8786 = new int[i_477_][i_478_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8769 = new int[i_477_][i_478_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8762 = new int[i_477_][i_478_][];
		((Class_xa_Sub1) this).anIntArrayArrayArray8772 = new int[i_477_][i_478_][];
		((Class_xa_Sub1) this).aShortArrayArray8756 = new short[i_477_ * i_478_][];
		((Class_xa_Sub1) this).aByteArrayArray8755 = new byte[i_477_][i_478_];
		((Class_xa_Sub1) this).aByteArrayArray8766 = new byte[i_477_ + 1][i_478_ + 1];
		((Class_xa_Sub1) this).aFloatArrayArray8784 = new float[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1];
		((Class_xa_Sub1) this).aFloatArrayArray8785 = new float[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1];
		((Class_xa_Sub1) this).aFloatArrayArray8758 = new float[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1];
		for (int i_481_ = 1; i_481_ < anInt6393 * 24567321; i_481_++) {
			for (int i_482_ = 1; i_482_ < anInt6397 * 1972554729; i_482_++) {
				int i_483_ = (is_479_[i_482_ + 1][i_481_] - is_479_[i_482_ - 1][i_481_]);
				int i_484_ = (is_479_[i_482_][i_481_ + 1] - is_479_[i_482_][i_481_ - 1]);
				float f = (float) (1.0 / Math.sqrt((double) (i_483_ * i_483_ + 4 * i_480_ * i_480_ + i_484_ * i_484_)));
				((Class_xa_Sub1) this).aFloatArrayArray8784[i_482_][i_481_] = (float) i_483_ * f;
				((Class_xa_Sub1) this).aFloatArrayArray8785[i_482_][i_481_] = (float) (-i_480_ * 2) * f;
				((Class_xa_Sub1) this).aFloatArrayArray8758[i_482_][i_481_] = (float) i_484_ * f;
			}
		}
		((Class_xa_Sub1) this).aClass497_8763 = new Class497(128);
		if ((((Class_xa_Sub1) this).anInt8761 & 0x10) != 0)
			((Class_xa_Sub1) this).aClass58_8773 = new Class58(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, this);
	}

	public void method6426(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub1) this).aClass471_8765.method5878(new Class330_Sub8(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, this, class330_sub14, is), (short) 8192);
	}

	public void ai(Class_na class_na, int i, int i_485_, int i_486_, int i_487_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_488_ = (i - (i_485_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8410) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			int i_489_ = (i_486_ - (i_485_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method667(class_na, i_488_, i_489_);
		}
	}

	public void method6429(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub1) this).aClass471_8765.method5878(new Class330_Sub8(((Class_xa_Sub1) this).aClass_ra_Sub1_8757, this, class330_sub14, is), (short) 8192);
	}

	public void NA(Class_na class_na, int i, int i_490_, int i_491_, int i_492_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_493_ = (i - (i_490_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8410) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			int i_494_ = (i_491_ - (i_490_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method662(class_na, i_493_, i_494_);
		}
	}

	public void as(Class_na class_na, int i, int i_495_, int i_496_, int i_497_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_498_ = (i - (i_495_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8410) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			int i_499_ = (i_496_ - (i_495_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method667(class_na, i_498_, i_499_);
		}
	}

	public void aj(Class_na class_na, int i, int i_500_, int i_501_, int i_502_, boolean bool) {
		if (((Class_xa_Sub1) this).aClass58_8773 != null && class_na != null) {
			int i_503_ = (i - (i_500_ * (((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8410) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			int i_504_ = (i_501_ - (i_500_ * (((Class_ra_Sub1) (((Class_xa_Sub1) this).aClass_ra_Sub1_8757)).anInt8379) >> 8) >> ((Class_ra_Sub1) ((Class_xa_Sub1) this).aClass_ra_Sub1_8757).anInt8296);
			((Class_xa_Sub1) this).aClass58_8773.method667(class_na, i_503_, i_504_);
		}
	}
}
