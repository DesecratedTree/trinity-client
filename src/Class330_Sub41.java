/* Class330_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class330_Sub41 extends Class330 {
	boolean aBoolean7772;
	int anInt7773;
	static float[] aFloatArray7774;
	int anInt7775;
	byte[][] aByteArrayArray7776;
	boolean aBoolean7777;
	static byte[] aByteArray7778;
	static int anInt7779;
	static int anInt7780;
	static int anInt7781;
	static float[] aFloatArray7782;
	static Class289[] aClass289Array7783;
	static Class290[] aClass290Array7784;
	int anInt7785;
	static Class298[] aClass298Array7786;
	int anInt7787;
	static int[] anIntArray7788;
	static boolean aBoolean7789 = false;
	float[] aFloatArray7790;
	static float[] aFloatArray7791;
	int anInt7792;
	static float[] aFloatArray7793;
	static boolean[] aBooleanArray7794;
	static Class320[] aClass320Array7795;
	static int[] anIntArray7796;
	static float[] aFloatArray7797;
	static float[] aFloatArray7798;
	static float[] aFloatArray7799;
	static int anInt7800;
	int anInt7801;
	static int[] anIntArray7802;
	float[] aFloatArray7803;
	int anInt7804 = 0;
	int anInt7805;
	int anInt7806 = 0;

	static void method3692(byte[] is, int i) {
		aByteArray7778 = is;
		anInt7779 = i;
		anInt7780 = 0;
	}

	int method3693() {
		return ((Class330_Sub41) this).anInt7804;
	}

	static int method3694(int i) {
		int i_0_ = 0;
		int i_1_ = 0;
		int i_2_;
		for (/**/; i >= 8 - anInt7780; i -= i_2_) {
			i_2_ = 8 - anInt7780;
			int i_3_ = (1 << i_2_) - 1;
			i_0_ += (aByteArray7778[anInt7779] >> anInt7780 & i_3_) << i_1_;
			anInt7780 = 0;
			anInt7779++;
			i_1_ += i_2_;
		}
		if (i > 0) {
			i_2_ = (1 << i) - 1;
			i_0_ += (aByteArray7778[anInt7779] >> anInt7780 & i_2_) << i_1_;
			anInt7780 += i;
		}
		return i_0_;
	}

	void method3695(byte[] is) throws IOException {
		Buffer class330_sub46 = new Buffer(is);
		((Class330_Sub41) this).anInt7773 = class330_sub46.readInt((byte) 9);
		((Class330_Sub41) this).anInt7792 = class330_sub46.readInt((byte) 42);
		((Class330_Sub41) this).anInt7775 = class330_sub46.readInt((byte) 14);
		((Class330_Sub41) this).anInt7787 = class330_sub46.readInt((byte) 61);
		if (((Class330_Sub41) this).anInt7787 < 0) {
			((Class330_Sub41) this).anInt7787 = ((Class330_Sub41) this).anInt7787 ^ 0xffffffff;
			((Class330_Sub41) this).aBoolean7777 = true;
		}
		int i = class330_sub46.readInt((byte) 95);
		if (i < 0)
			throw new IOException();
		((Class330_Sub41) this).aByteArrayArray7776 = new byte[i][];
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			int i_5_ = 0;
			int i_6_;
			do {
				i_6_ = class330_sub46.readUnsignedByte(31792929);
				i_5_ += i_6_;
			} while (i_6_ >= 255);
			byte[] is_7_ = new byte[i_5_];
			class330_sub46.readBytes(is_7_, 0, i_5_, 1274334002);
			((Class330_Sub41) this).aByteArrayArray7776[i_4_] = is_7_;
		}
	}

	static boolean method3696(IndexTable class280) {
		if (!aBoolean7789) {
			byte[] is = class280.getFile(0, 0);
			if (is == null)
				return false;
			method3705(is);
		}
		return true;
	}

	public static Class330_Sub41 method3697(IndexTable class280, int i) {
		if (!method3696(class280)) {
			class280.method2750(i, -1476418872);
			return null;
		}
		byte[] is = class280.method2761(i, 2138157519);
		if (is == null)
			return null;
		Class330_Sub41 class330_sub41 = null;
		try {
			class330_sub41 = new Class330_Sub41(is);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
		return class330_sub41;
	}

	static int method3698() {
		int i = aByteArray7778[anInt7779] >> anInt7780 & 0x1;
		anInt7780++;
		anInt7779 += anInt7780 >> 3;
		anInt7780 &= 0x7;
		return i;
	}

	public Class330_Sub29_Sub1_Sub1 method3699() {
		Class279.method2745(this, -1575652650);
		if (!method3701() || ((((Class330_Sub41) this).anInt7804 > ((Class330_Sub41) this).anInt7773) && (((Class330_Sub41) this).anInt7806 > (((Class330_Sub41) this).anInt7773 / Class362.method4257(-641066210)))))
			return (new Class330_Sub29_Sub1_Sub1(((Class330_Sub41) this).anInt7773, this, ((Class330_Sub41) this).aFloatArray7803, ((Class330_Sub41) this).anInt7775, ((Class330_Sub41) this).anInt7787, ((Class330_Sub41) this).aBoolean7777));
		return null;
	}

	int method3700(int i) {
		int i_8_ = 0;
		if (((Class330_Sub41) this).aFloatArray7803 == null) {
			((Class330_Sub41) this).anInt7785 = 0;
			((Class330_Sub41) this).aFloatArray7790 = new float[anInt7800];
			((Class330_Sub41) this).aFloatArray7803 = new float[((Class330_Sub41) this).anInt7792];
			((Class330_Sub41) this).anInt7804 = 0;
			((Class330_Sub41) this).anInt7805 = 0;
		}
		for (/**/; (i > ((Class330_Sub41) this).anInt7804 && (((Class330_Sub41) this).anInt7805 < ((Class330_Sub41) this).aByteArrayArray7776.length)); ((Class330_Sub41) this).anInt7805++) {
			float[] fs = method3707(((Class330_Sub41) this).anInt7805);
			if (fs != null) {
				int i_9_ = ((Class330_Sub41) this).anInt7804;
				int i_10_ = fs.length;
				if (i_10_ > ((Class330_Sub41) this).anInt7792 - i_9_)
					i_10_ = ((Class330_Sub41) this).anInt7792 - i_9_;
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					((Class330_Sub41) this).aFloatArray7803[i_9_++] = fs[i_11_];
				i_8_ += i_9_ - ((Class330_Sub41) this).anInt7804;
				((Class330_Sub41) this).anInt7804 = i_9_;
			}
		}
		return i_8_;
	}

	boolean method3701() {
		return (((Class330_Sub41) this).anInt7804 < ((Class330_Sub41) this).anInt7792 - 1);
	}

	int method3702() {
		return ((Class330_Sub41) this).anInt7773;
	}

	static Class330_Sub41 method3703(IndexTable class280, int i, int i_12_) {
		if (!method3696(class280)) {
			class280.hasStoredFile(i, i_12_, (byte) 32);
			return null;
		}
		byte[] is = class280.getFile(i, i_12_);
		if (is == null)
			return null;
		Class330_Sub41 class330_sub41 = null;
		try {
			class330_sub41 = new Class330_Sub41(is);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
		return class330_sub41;
	}

	void method3704(int i) {
		if (i > ((Class330_Sub41) this).anInt7792 - 1)
			i = ((Class330_Sub41) this).anInt7792 - 1;
		if (i > ((Class330_Sub41) this).anInt7804)
			((Class330_Sub41) this).anInt7806 = method3700(i);
		else
			((Class330_Sub41) this).anInt7806 = 0;
		if (!method3701())
			((Class330_Sub41) this).aFloatArray7790 = null;
	}

	Class330_Sub41(byte[] is) throws IOException {
		method3695(is);
	}

	static void method3705(byte[] is) {
		method3692(is, 0);
		anInt7781 = 1 << method3694(4);
		anInt7800 = 1 << method3694(4);
		aFloatArray7791 = new float[anInt7800];
		for (int i = 0; i < 2; i++) {
			int i_13_ = i != 0 ? anInt7800 : anInt7781;
			int i_14_ = i_13_ >> 1;
			int i_15_ = i_13_ >> 2;
			int i_16_ = i_13_ >> 3;
			float[] fs = new float[i_14_];
			for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
				fs[2 * i_17_] = (float) Math.cos((double) (4 * i_17_) * 3.141592653589793 / (double) i_13_);
				fs[2 * i_17_ + 1] = -(float) Math.sin((double) (4 * i_17_) * 3.141592653589793 / (double) i_13_);
			}
			float[] fs_18_ = new float[i_14_];
			for (int i_19_ = 0; i_19_ < i_15_; i_19_++) {
				fs_18_[2 * i_19_] = (float) Math.cos((double) (2 * i_19_ + 1) * 3.141592653589793 / (double) (2 * i_13_));
				fs_18_[2 * i_19_ + 1] = (float) Math.sin((double) (2 * i_19_ + 1) * 3.141592653589793 / (double) (2 * i_13_));
			}
			float[] fs_20_ = new float[i_15_];
			for (int i_21_ = 0; i_21_ < i_16_; i_21_++) {
				fs_20_[2 * i_21_] = (float) Math.cos((double) (4 * i_21_ + 2) * 3.141592653589793 / (double) i_13_);
				fs_20_[2 * i_21_ + 1] = -(float) Math.sin((double) (4 * i_21_ + 2) * 3.141592653589793 / (double) i_13_);
			}
			int[] is_22_ = new int[i_16_];
			int i_23_ = Class64.method779(i_16_ - 1, -1064394116);
			for (int i_24_ = 0; i_24_ < i_16_; i_24_++)
				is_22_[i_24_] = Class307.method3073(i_24_, i_23_, -833340950);
			if (i != 0) {
				aFloatArray7798 = fs;
				aFloatArray7799 = fs_18_;
				aFloatArray7782 = fs_20_;
				anIntArray7802 = is_22_;
			} else {
				aFloatArray7774 = fs;
				aFloatArray7793 = fs_18_;
				aFloatArray7797 = fs_20_;
				anIntArray7788 = is_22_;
			}
		}
		int i = method3694(8) + 1;
		aClass289Array7783 = new Class289[i];
		for (int i_25_ = 0; i_25_ < i; i_25_++)
			aClass289Array7783[i_25_] = new Class289();
		int i_26_ = method3694(6) + 1;
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
			method3694(16);
		i_26_ = method3694(6) + 1;
		aClass290Array7784 = new Class290[i_26_];
		for (int i_28_ = 0; i_28_ < i_26_; i_28_++)
			aClass290Array7784[i_28_] = new Class290();
		int i_29_ = method3694(6) + 1;
		aClass320Array7795 = new Class320[i_29_];
		for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
			aClass320Array7795[i_30_] = new Class320();
		int i_31_ = method3694(6) + 1;
		aClass298Array7786 = new Class298[i_31_];
		for (int i_32_ = 0; i_32_ < i_31_; i_32_++)
			aClass298Array7786[i_32_] = new Class298();
		int i_33_ = method3694(6) + 1;
		aBooleanArray7794 = new boolean[i_33_];
		anIntArray7796 = new int[i_33_];
		for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
			aBooleanArray7794[i_34_] = method3698() != 0;
			method3694(16);
			method3694(16);
			anIntArray7796[i_34_] = method3694(8);
		}
		aBoolean7789 = true;
	}

	static float method3706(int i) {
		int i_35_ = i & 0x1fffff;
		int i_36_ = i & ~0x7fffffff;
		int i_37_ = (i & 0x7fe00000) >> 21;
		if (i_36_ != 0)
			i_35_ = -i_35_;
		return (float) ((double) i_35_ * Math.pow(2.0, (double) (i_37_ - 788)));
	}

	float[] method3707(int i) {
		method3692(((Class330_Sub41) this).aByteArrayArray7776[i], 0);
		method3698();
		int i_38_ = method3694(Class64.method779(anIntArray7796.length - 1, -2049844321));
		boolean bool = aBooleanArray7794[i_38_];
		int i_39_ = bool ? anInt7800 : anInt7781;
		boolean bool_40_ = false;
		boolean bool_41_ = false;
		if (bool) {
			bool_40_ = method3698() != 0;
			bool_41_ = method3698() != 0;
		}
		int i_42_ = i_39_ >> 1;
		int i_43_;
		int i_44_;
		int i_45_;
		if (bool && !bool_40_) {
			i_43_ = (i_39_ >> 2) - (anInt7781 >> 2);
			i_44_ = (i_39_ >> 2) + (anInt7781 >> 2);
			i_45_ = anInt7781 >> 1;
		} else {
			i_43_ = 0;
			i_44_ = i_42_;
			i_45_ = i_39_ >> 1;
		}
		int i_46_;
		int i_47_;
		int i_48_;
		if (bool && !bool_41_) {
			i_46_ = i_39_ - (i_39_ >> 2) - (anInt7781 >> 2);
			i_47_ = i_39_ - (i_39_ >> 2) + (anInt7781 >> 2);
			i_48_ = anInt7781 >> 1;
		} else {
			i_46_ = i_42_;
			i_47_ = i_39_;
			i_48_ = i_39_ >> 1;
		}
		Class298 class298 = aClass298Array7786[anIntArray7796[i_38_]];
		int i_49_ = ((Class298) class298).anInt3055;
		int i_50_ = ((Class298) class298).anIntArray3054[i_49_];
		boolean bool_51_ = !aClass290Array7784[i_50_].method2898();
		boolean bool_52_ = bool_51_;
		for (i_50_ = 0; i_50_ < ((Class298) class298).anInt3053; i_50_++) {
			Class320 class320 = (aClass320Array7795[((Class298) class298).anIntArray3052[i_50_]]);
			float[] fs = aFloatArray7791;
			class320.method3170(fs, i_39_ >> 1, bool_52_);
		}
		if (!bool_51_) {
			i_50_ = ((Class298) class298).anInt3055;
			int i_53_ = ((Class298) class298).anIntArray3054[i_50_];
			aClass290Array7784[i_53_].method2895(aFloatArray7791, i_39_ >> 1);
		}
		if (bool_51_) {
			for (i_50_ = i_39_ >> 1; i_50_ < i_39_; i_50_++)
				aFloatArray7791[i_50_] = 0.0F;
		} else {
			i_50_ = i_39_ >> 1;
			int i_54_ = i_39_ >> 2;
			int i_55_ = i_39_ >> 3;
			float[] fs = aFloatArray7791;
			for (int i_56_ = 0; i_56_ < i_50_; i_56_++)
				fs[i_56_] *= 0.5F;
			for (int i_57_ = i_50_; i_57_ < i_39_; i_57_++)
				fs[i_57_] = -fs[i_39_ - i_57_ - 1];
			float[] fs_58_ = bool ? aFloatArray7798 : aFloatArray7774;
			float[] fs_59_ = bool ? aFloatArray7799 : aFloatArray7793;
			float[] fs_60_ = bool ? aFloatArray7782 : aFloatArray7797;
			int[] is = bool ? anIntArray7802 : anIntArray7788;
			for (int i_61_ = 0; i_61_ < i_54_; i_61_++) {
				float f = fs[4 * i_61_] - fs[i_39_ - 4 * i_61_ - 1];
				float f_62_ = fs[4 * i_61_ + 2] - fs[i_39_ - 4 * i_61_ - 3];
				float f_63_ = fs_58_[2 * i_61_];
				float f_64_ = fs_58_[2 * i_61_ + 1];
				fs[i_39_ - 4 * i_61_ - 1] = f * f_63_ - f_62_ * f_64_;
				fs[i_39_ - 4 * i_61_ - 3] = f * f_64_ + f_62_ * f_63_;
			}
			for (int i_65_ = 0; i_65_ < i_55_; i_65_++) {
				float f = fs[i_50_ + 3 + 4 * i_65_];
				float f_66_ = fs[i_50_ + 1 + 4 * i_65_];
				float f_67_ = fs[4 * i_65_ + 3];
				float f_68_ = fs[4 * i_65_ + 1];
				fs[i_50_ + 3 + 4 * i_65_] = f + f_67_;
				fs[i_50_ + 1 + 4 * i_65_] = f_66_ + f_68_;
				float f_69_ = fs_58_[i_50_ - 4 - 4 * i_65_];
				float f_70_ = fs_58_[i_50_ - 3 - 4 * i_65_];
				fs[4 * i_65_ + 3] = (f - f_67_) * f_69_ - (f_66_ - f_68_) * f_70_;
				fs[4 * i_65_ + 1] = (f_66_ - f_68_) * f_69_ + (f - f_67_) * f_70_;
			}
			int i_71_ = Class64.method779(i_39_ - 1, -1919924175);
			for (int i_72_ = 0; i_72_ < i_71_ - 3; i_72_++) {
				int i_73_ = i_39_ >> i_72_ + 2;
				int i_74_ = 8 << i_72_;
				for (int i_75_ = 0; i_75_ < 2 << i_72_; i_75_++) {
					int i_76_ = i_39_ - i_73_ * 2 * i_75_;
					int i_77_ = i_39_ - i_73_ * (2 * i_75_ + 1);
					for (int i_78_ = 0; i_78_ < i_39_ >> i_72_ + 4; i_78_++) {
						int i_79_ = 4 * i_78_;
						float f = fs[i_76_ - 1 - i_79_];
						float f_80_ = fs[i_76_ - 3 - i_79_];
						float f_81_ = fs[i_77_ - 1 - i_79_];
						float f_82_ = fs[i_77_ - 3 - i_79_];
						fs[i_76_ - 1 - i_79_] = f + f_81_;
						fs[i_76_ - 3 - i_79_] = f_80_ + f_82_;
						float f_83_ = fs_58_[i_78_ * i_74_];
						float f_84_ = fs_58_[i_78_ * i_74_ + 1];
						fs[i_77_ - 1 - i_79_] = (f - f_81_) * f_83_ - (f_80_ - f_82_) * f_84_;
						fs[i_77_ - 3 - i_79_] = (f_80_ - f_82_) * f_83_ + (f - f_81_) * f_84_;
					}
				}
			}
			for (int i_85_ = 1; i_85_ < i_55_ - 1; i_85_++) {
				int i_86_ = is[i_85_];
				if (i_85_ < i_86_) {
					int i_87_ = 8 * i_85_;
					int i_88_ = 8 * i_86_;
					float f = fs[i_87_ + 1];
					fs[i_87_ + 1] = fs[i_88_ + 1];
					fs[i_88_ + 1] = f;
					f = fs[i_87_ + 3];
					fs[i_87_ + 3] = fs[i_88_ + 3];
					fs[i_88_ + 3] = f;
					f = fs[i_87_ + 5];
					fs[i_87_ + 5] = fs[i_88_ + 5];
					fs[i_88_ + 5] = f;
					f = fs[i_87_ + 7];
					fs[i_87_ + 7] = fs[i_88_ + 7];
					fs[i_88_ + 7] = f;
				}
			}
			for (int i_89_ = 0; i_89_ < i_50_; i_89_++)
				fs[i_89_] = fs[2 * i_89_ + 1];
			for (int i_90_ = 0; i_90_ < i_55_; i_90_++) {
				fs[i_39_ - 1 - 2 * i_90_] = fs[4 * i_90_];
				fs[i_39_ - 2 - 2 * i_90_] = fs[4 * i_90_ + 1];
				fs[i_39_ - i_54_ - 1 - 2 * i_90_] = fs[4 * i_90_ + 2];
				fs[i_39_ - i_54_ - 2 - 2 * i_90_] = fs[4 * i_90_ + 3];
			}
			for (int i_91_ = 0; i_91_ < i_55_; i_91_++) {
				float f = fs_60_[2 * i_91_];
				float f_92_ = fs_60_[2 * i_91_ + 1];
				float f_93_ = fs[i_50_ + 2 * i_91_];
				float f_94_ = fs[i_50_ + 2 * i_91_ + 1];
				float f_95_ = fs[i_39_ - 2 - 2 * i_91_];
				float f_96_ = fs[i_39_ - 1 - 2 * i_91_];
				float f_97_ = f_92_ * (f_93_ - f_95_) + f * (f_94_ + f_96_);
				fs[i_50_ + 2 * i_91_] = (f_93_ + f_95_ + f_97_) * 0.5F;
				fs[i_39_ - 2 - 2 * i_91_] = (f_93_ + f_95_ - f_97_) * 0.5F;
				f_97_ = f_92_ * (f_94_ + f_96_) - f * (f_93_ - f_95_);
				fs[i_50_ + 2 * i_91_ + 1] = (f_94_ - f_96_ + f_97_) * 0.5F;
				fs[i_39_ - 1 - 2 * i_91_] = (-f_94_ + f_96_ + f_97_) * 0.5F;
			}
			for (int i_98_ = 0; i_98_ < i_54_; i_98_++) {
				fs[i_98_] = (fs[2 * i_98_ + i_50_] * fs_59_[2 * i_98_] + fs[2 * i_98_ + 1 + i_50_] * fs_59_[2 * i_98_ + 1]);
				fs[i_50_ - 1 - i_98_] = (fs[2 * i_98_ + i_50_] * fs_59_[2 * i_98_ + 1] - fs[2 * i_98_ + 1 + i_50_] * fs_59_[2 * i_98_]);
			}
			for (int i_99_ = 0; i_99_ < i_54_; i_99_++)
				fs[i_39_ - i_54_ + i_99_] = -fs[i_99_];
			for (int i_100_ = 0; i_100_ < i_54_; i_100_++)
				fs[i_100_] = fs[i_54_ + i_100_];
			for (int i_101_ = 0; i_101_ < i_54_; i_101_++)
				fs[i_54_ + i_101_] = -fs[i_54_ - i_101_ - 1];
			for (int i_102_ = 0; i_102_ < i_54_; i_102_++)
				fs[i_50_ + i_102_] = fs[i_39_ - i_102_ - 1];
			for (int i_103_ = i_43_; i_103_ < i_44_; i_103_++) {
				float f = (float) Math.sin(((double) (i_103_ - i_43_) + 0.5) / (double) i_45_ * 0.5 * 3.141592653589793);
				aFloatArray7791[i_103_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
			for (int i_104_ = i_46_; i_104_ < i_47_; i_104_++) {
				float f = (float) Math.sin((((double) (i_104_ - i_46_) + 0.5) / (double) i_48_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
				aFloatArray7791[i_104_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
			}
		}
		float[] fs = null;
		if (((Class330_Sub41) this).anInt7785 > 0) {
			int i_105_ = ((Class330_Sub41) this).anInt7785 + i_39_ >> 2;
			fs = new float[i_105_];
			if (!((Class330_Sub41) this).aBoolean7772) {
				for (int i_106_ = 0; i_106_ < ((Class330_Sub41) this).anInt7801; i_106_++) {
					int i_107_ = (((Class330_Sub41) this).anInt7785 >> 1) + i_106_;
					fs[i_106_] += ((Class330_Sub41) this).aFloatArray7790[i_107_];
				}
			}
			if (!bool_51_) {
				for (int i_108_ = i_43_; i_108_ < i_39_ >> 1; i_108_++) {
					int i_109_ = fs.length - (i_39_ >> 1) + i_108_;
					fs[i_109_] += aFloatArray7791[i_108_];
				}
			}
		}
		float[] fs_110_ = ((Class330_Sub41) this).aFloatArray7790;
		((Class330_Sub41) this).aFloatArray7790 = aFloatArray7791;
		aFloatArray7791 = fs_110_;
		((Class330_Sub41) this).anInt7785 = i_39_;
		((Class330_Sub41) this).anInt7801 = i_47_ - (i_39_ >> 1);
		((Class330_Sub41) this).aBoolean7772 = bool_51_;
		return fs;
	}
}
