/* Class387_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class387_Sub3 extends Class387 {
	Class64[] aClass64Array8160;
	boolean aBoolean8161 = false;
	Class6 aClass6_8162;
	Class6 aClass6_8163;
	Class38 aClass38_8164;
	Class_ra_Sub3 aClass_ra_Sub3_8165;
	static int anInt8166;
	static int anInt8167 = -1;
	static int anInt8168 = -2;
	static int anInt8169 = 4;
	Class387_Sub3[] aClass387_Sub3Array8170;
	static int anInt8171 = 618520;
	int anInt8172;
	short[] aShortArray8173;
	int anInt8174 = 0;
	static int anInt8175;
	int anInt8176;
	int[] anIntArray8177;
	int[] anIntArray8178;
	int[] anIntArray8179;
	int[] anIntArray8180;
	short[] aShortArray8181;
	Class21[] aClass21Array8182;
	Class21[] aClass21Array8183;
	int anInt8184;
	int anInt8185 = 0;
	short[] aShortArray8186;
	boolean aBoolean8187;
	float[][] aFloatArrayArray8188;
	float[][] aFloatArrayArray8189;
	int[] anIntArray8190;
	int[] anIntArray8191;
	int[] anIntArray8192;
	static int anInt8193 = 0;
	static int anInt8194 = 1;
	int[] anIntArray8195;
	int anInt8196;
	Class25[] aClass25Array8197;
	short aShort8198;
	static int anInt8199 = 2;
	byte[] aByteArray8200;
	short[] aShortArray8201;
	short[] modelColors;
	byte[] aByteArray8203;
	short[] aShortArray8204;
	int[][] anIntArrayArray8205;
	int[][] anIntArrayArray8206;
	boolean aBoolean8207;
	boolean aBoolean8208;
	int anInt8209;
	static int anInt8210 = 7;
	Class10[] aClass10Array8211;
	boolean aBoolean8212;
	Class93[] aClass93Array8213;
	short aShort8214;
	int anInt8215;
	Class20[] aClass20Array8216;
	short[] aShortArray8217;
	int[][] anIntArrayArray8218;
	int anInt8219;
	short aShort8220;
	int anInt8221;
	static int anInt8222 = 4096;
	short aShort8223;
	short aShort8224;
	short aShort8225;
	short aShort8226;
	short aShort8227;
	boolean aBoolean8228;
	boolean aBoolean8229;
	byte[] aByteArray8230;
	int[] anIntArray8231;
	float[] aFloatArray8232;
	float[] aFloatArray8233;
	float[] aFloatArray8234;
	float[] aFloatArray8235;
	int anInt8236;
	static int anInt8237 = 618648;
	int[] anIntArray8238;
	int[] anIntArray8239;
	int[] anIntArray8240;
	int[] anIntArray8241;
	short[] aShortArray8242;
	Class387_Sub3[] aClass387_Sub3Array8243;

	public void method4488(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub3) this).aShortArray8242 != null) {
			Class6 class6 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread());
			Class247 class247_0_ = ((Class6) class6).aClass247_98;
			class247_0_.method2454(class247);
			if (bool)
				class247_0_.method2459();
			Class249 class249 = ((Class6) class6).aClass249_99;
			class249.method2508(class247_0_);
			float[] fs = new float[3];
			for (int i_1_ = 0; i_1_ < ((Class387_Sub3) this).anInt8185; i_1_++) {
				if ((i & ((Class387_Sub3) this).aShortArray8242[i_1_]) != 0) {
					class249.method2511((float) ((Class387_Sub3) this).anIntArray8238[i_1_], (float) ((Class387_Sub3) this).anIntArray8195[i_1_], (float) ((Class387_Sub3) this).anIntArray8180[i_1_], fs);
					((Class387_Sub3) this).anIntArray8238[i_1_] = (int) fs[0];
					((Class387_Sub3) this).anIntArray8195[i_1_] = (int) fs[1];
					((Class387_Sub3) this).anIntArray8180[i_1_] = (int) fs[2];
				}
			}
		}
	}

	void method4529(Class6 class6) {
		((Class387_Sub3) this).aClass38_8164 = ((Class6) class6).aClass38_94;
		if (class6 != ((Class387_Sub3) this).aClass6_8162) {
			((Class387_Sub3) this).aClass6_8162 = class6;
			((Class387_Sub3) this).anIntArray8231 = ((Class6) ((Class387_Sub3) this).aClass6_8162).anIntArray123;
			((Class387_Sub3) this).aFloatArray8232 = (((Class6) ((Class387_Sub3) this).aClass6_8162).aFloatArray117);
			((Class387_Sub3) this).aFloatArray8233 = (((Class6) ((Class387_Sub3) this).aClass6_8162).aFloatArray103);
			((Class387_Sub3) this).aFloatArray8234 = (((Class6) ((Class387_Sub3) this).aClass6_8162).aFloatArray120);
			((Class387_Sub3) this).aFloatArray8235 = (((Class6) ((Class387_Sub3) this).aClass6_8162).aFloatArray105);
			((Class387_Sub3) this).anIntArray8177 = ((Class6) ((Class387_Sub3) this).aClass6_8162).anIntArray106;
			((Class387_Sub3) this).anIntArray8178 = ((Class6) ((Class387_Sub3) this).aClass6_8162).anIntArray107;
			((Class387_Sub3) this).anIntArray8179 = ((Class6) ((Class387_Sub3) this).aClass6_8162).anIntArray108;
			((Class387_Sub3) this).anIntArray8239 = ((Class6) ((Class387_Sub3) this).aClass6_8162).anIntArray109;
			((Class387_Sub3) this).anIntArray8240 = ((Class6) ((Class387_Sub3) this).aClass6_8162).anIntArray110;
			((Class387_Sub3) this).anIntArray8241 = ((Class6) ((Class387_Sub3) this).aClass6_8162).anIntArray96;
		}
	}

	void method4530(Thread thread) {
		Class6 class6 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(thread);
		if (class6 != ((Class387_Sub3) this).aClass6_8163) {
			((Class387_Sub3) this).aClass6_8163 = class6;
			((Class387_Sub3) this).aClass387_Sub3Array8170 = (((Class6) ((Class387_Sub3) this).aClass6_8163).aClass387_Sub3Array121);
			((Class387_Sub3) this).aClass387_Sub3Array8243 = (((Class6) ((Class387_Sub3) this).aClass6_8163).aClass387_Sub3Array102);
		}
	}

	void method4531() {
		((Class387_Sub3) this).aClass21Array8182 = new Class21[((Class387_Sub3) this).anInt8185];
		for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++)
			((Class387_Sub3) this).aClass21Array8182[i] = new Class21();
		for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
			short i_2_ = ((Class387_Sub3) this).aShortArray8173[i];
			short i_3_ = ((Class387_Sub3) this).aShortArray8186[i];
			short i_4_ = ((Class387_Sub3) this).aShortArray8217[i];
			int i_5_ = (((Class387_Sub3) this).anIntArray8238[i_3_] - ((Class387_Sub3) this).anIntArray8238[i_2_]);
			int i_6_ = (((Class387_Sub3) this).anIntArray8195[i_3_] - ((Class387_Sub3) this).anIntArray8195[i_2_]);
			int i_7_ = (((Class387_Sub3) this).anIntArray8180[i_3_] - ((Class387_Sub3) this).anIntArray8180[i_2_]);
			int i_8_ = (((Class387_Sub3) this).anIntArray8238[i_4_] - ((Class387_Sub3) this).anIntArray8238[i_2_]);
			int i_9_ = (((Class387_Sub3) this).anIntArray8195[i_4_] - ((Class387_Sub3) this).anIntArray8195[i_2_]);
			int i_10_ = (((Class387_Sub3) this).anIntArray8180[i_4_] - ((Class387_Sub3) this).anIntArray8180[i_2_]);
			int i_11_ = i_6_ * i_10_ - i_9_ * i_7_;
			int i_12_ = i_7_ * i_8_ - i_10_ * i_5_;
			int i_13_;
			for (i_13_ = i_5_ * i_9_ - i_8_ * i_6_; (i_11_ > 8192 || i_12_ > 8192 || i_13_ > 8192 || i_11_ < -8192 || i_12_ < -8192 || i_13_ < -8192); i_13_ >>= 1) {
				i_11_ >>= 1;
				i_12_ >>= 1;
			}
			int i_14_ = (int) Math.sqrt((double) (i_11_ * i_11_ + i_12_ * i_12_ + i_13_ * i_13_));
			if (i_14_ <= 0)
				i_14_ = 1;
			i_11_ = i_11_ * 256 / i_14_;
			i_12_ = i_12_ * 256 / i_14_;
			i_13_ = i_13_ * 256 / i_14_;
			byte i_15_;
			if (((Class387_Sub3) this).aByteArray8230 == null)
				i_15_ = (byte) 0;
			else
				i_15_ = ((Class387_Sub3) this).aByteArray8230[i];
			if (i_15_ == 0) {
				Class21 class21 = ((Class387_Sub3) this).aClass21Array8182[i_2_];
				((Class21) class21).anInt252 += i_11_;
				((Class21) class21).anInt253 += i_12_;
				((Class21) class21).anInt254 += i_13_;
				((Class21) class21).anInt255++;
				class21 = ((Class387_Sub3) this).aClass21Array8182[i_3_];
				((Class21) class21).anInt252 += i_11_;
				((Class21) class21).anInt253 += i_12_;
				((Class21) class21).anInt254 += i_13_;
				((Class21) class21).anInt255++;
				class21 = ((Class387_Sub3) this).aClass21Array8182[i_4_];
				((Class21) class21).anInt252 += i_11_;
				((Class21) class21).anInt253 += i_12_;
				((Class21) class21).anInt254 += i_13_;
				((Class21) class21).anInt255++;
			} else if (i_15_ == 1) {
				if (((Class387_Sub3) this).aClass25Array8197 == null)
					((Class387_Sub3) this).aClass25Array8197 = new Class25[((Class387_Sub3) this).anInt8184];
				Class25 class25 = (((Class387_Sub3) this).aClass25Array8197[i] = new Class25());
				((Class25) class25).anInt306 = i_11_;
				((Class25) class25).anInt307 = i_12_;
				((Class25) class25).anInt308 = i_13_;
			}
		}
	}

	void method4532(boolean bool) {
		do {
			if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
				synchronized (this) {
					method4549(bool);
					break;
				}
			}
			method4549(bool);
		} while (false);
	}

	public void PA(int i, int i_16_, int i_17_, int i_18_) {
		if ((((Class387_Sub3) this).anInt8172 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_19_ = 0; i_19_ < ((Class387_Sub3) this).anInt8184; i_19_++) {
			int i_20_ = ((Class387_Sub3) this).modelColors[i_19_] & 0xffff;
			int i_21_ = i_20_ >> 10 & 0x3f;
			int i_22_ = i_20_ >> 7 & 0x7;
			int i_23_ = i_20_ & 0x7f;
			if (i != -1)
				i_21_ += (i - i_21_) * i_18_ >> 7;
			if (i_16_ != -1)
				i_22_ += (i_16_ - i_22_) * i_18_ >> 7;
			if (i_17_ != -1)
				i_23_ += (i_17_ - i_23_) * i_18_ >> 7;
			((Class387_Sub3) this).modelColors[i_19_] = (short) (i_21_ << 10 | i_22_ << 7 | i_23_);
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_24_ = 0; i_24_ < ((Class387_Sub3) this).anInt8215; i_24_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_24_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_24_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	void method4473(int i, int[] is, int i_25_, int i_26_, int i_27_, int i_28_, boolean bool) {
		int i_29_ = is.length;
		if (i == 0) {
			i_25_ <<= 4;
			i_26_ <<= 4;
			i_27_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_30_ = 0; i_30_ < ((Class387_Sub3) this).anInt8174; i_30_++) {
					((Class387_Sub3) this).anIntArray8238[i_30_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_30_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_30_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_31_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_32_ = 0; i_32_ < i_29_; i_32_++) {
				int i_33_ = is[i_32_];
				if (i_33_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_34_ = ((Class387_Sub3) this).anIntArrayArray8205[i_33_];
					for (int i_35_ = 0; i_35_ < is_34_.length; i_35_++) {
						int i_36_ = is_34_[i_35_];
						((Class387_Sub3) this).anInt8209 += ((Class387_Sub3) this).anIntArray8238[i_36_];
						((Class387_Sub3) this).anInt8219 += ((Class387_Sub3) this).anIntArray8195[i_36_];
						((Class387_Sub3) this).anInt8221 += ((Class387_Sub3) this).anIntArray8180[i_36_];
						i_31_++;
					}
				}
			}
			if (i_31_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_31_ + i_25_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_31_ + i_26_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_31_ + i_27_;
			} else {
				((Class387_Sub3) this).anInt8209 = i_25_;
				((Class387_Sub3) this).anInt8219 = i_26_;
				((Class387_Sub3) this).anInt8221 = i_27_;
			}
		} else if (i == 1) {
			i_25_ <<= 4;
			i_26_ <<= 4;
			i_27_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_37_ = 0; i_37_ < ((Class387_Sub3) this).anInt8174; i_37_++) {
					((Class387_Sub3) this).anIntArray8238[i_37_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_37_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_37_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_38_ = 0; i_38_ < i_29_; i_38_++) {
				int i_39_ = is[i_38_];
				if (i_39_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_40_ = ((Class387_Sub3) this).anIntArrayArray8205[i_39_];
					for (int i_41_ = 0; i_41_ < is_40_.length; i_41_++) {
						int i_42_ = is_40_[i_41_];
						((Class387_Sub3) this).anIntArray8238[i_42_] += i_25_;
						((Class387_Sub3) this).anIntArray8195[i_42_] += i_26_;
						((Class387_Sub3) this).anIntArray8180[i_42_] += i_27_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_43_ = 0; i_43_ < i_29_; i_43_++) {
				int i_44_ = is[i_43_];
				if (i_44_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_45_ = ((Class387_Sub3) this).anIntArrayArray8205[i_44_];
					if ((i_28_ & 0x1) == 0) {
						for (int i_46_ = 0; i_46_ < is_45_.length; i_46_++) {
							int i_47_ = is_45_[i_46_];
							((Class387_Sub3) this).anIntArray8238[i_47_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_47_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_47_] -= ((Class387_Sub3) this).anInt8221;
							if (i_27_ != 0) {
								int i_48_ = Class257.anIntArray2683[i_27_];
								int i_49_ = Class257.anIntArray2684[i_27_];
								int i_50_ = ((((Class387_Sub3) this).anIntArray8195[i_47_]) * i_48_ + (((Class387_Sub3) this).anIntArray8238[i_47_]) * i_49_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_47_] = ((((Class387_Sub3) this).anIntArray8195[i_47_]) * i_49_ - (((Class387_Sub3) this).anIntArray8238[i_47_]) * i_48_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_47_] = i_50_;
							}
							if (i_25_ != 0) {
								int i_51_ = Class257.anIntArray2683[i_25_];
								int i_52_ = Class257.anIntArray2684[i_25_];
								int i_53_ = ((((Class387_Sub3) this).anIntArray8195[i_47_]) * i_52_ - (((Class387_Sub3) this).anIntArray8180[i_47_]) * i_51_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8180[i_47_] = ((((Class387_Sub3) this).anIntArray8195[i_47_]) * i_51_ + (((Class387_Sub3) this).anIntArray8180[i_47_]) * i_52_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_47_] = i_53_;
							}
							if (i_26_ != 0) {
								int i_54_ = Class257.anIntArray2683[i_26_];
								int i_55_ = Class257.anIntArray2684[i_26_];
								int i_56_ = ((((Class387_Sub3) this).anIntArray8180[i_47_]) * i_54_ + (((Class387_Sub3) this).anIntArray8238[i_47_]) * i_55_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8180[i_47_] = ((((Class387_Sub3) this).anIntArray8180[i_47_]) * i_55_ - (((Class387_Sub3) this).anIntArray8238[i_47_]) * i_54_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_47_] = i_56_;
							}
							((Class387_Sub3) this).anIntArray8238[i_47_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_47_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_47_] += ((Class387_Sub3) this).anInt8221;
						}
					} else {
						for (int i_57_ = 0; i_57_ < is_45_.length; i_57_++) {
							int i_58_ = is_45_[i_57_];
							((Class387_Sub3) this).anIntArray8238[i_58_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_58_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_58_] -= ((Class387_Sub3) this).anInt8221;
							if (i_25_ != 0) {
								int i_59_ = Class257.anIntArray2683[i_25_];
								int i_60_ = Class257.anIntArray2684[i_25_];
								int i_61_ = ((((Class387_Sub3) this).anIntArray8195[i_58_]) * i_60_ - (((Class387_Sub3) this).anIntArray8180[i_58_]) * i_59_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8180[i_58_] = ((((Class387_Sub3) this).anIntArray8195[i_58_]) * i_59_ + (((Class387_Sub3) this).anIntArray8180[i_58_]) * i_60_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_58_] = i_61_;
							}
							if (i_27_ != 0) {
								int i_62_ = Class257.anIntArray2683[i_27_];
								int i_63_ = Class257.anIntArray2684[i_27_];
								int i_64_ = ((((Class387_Sub3) this).anIntArray8195[i_58_]) * i_62_ + (((Class387_Sub3) this).anIntArray8238[i_58_]) * i_63_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_58_] = ((((Class387_Sub3) this).anIntArray8195[i_58_]) * i_63_ - (((Class387_Sub3) this).anIntArray8238[i_58_]) * i_62_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_58_] = i_64_;
							}
							if (i_26_ != 0) {
								int i_65_ = Class257.anIntArray2683[i_26_];
								int i_66_ = Class257.anIntArray2684[i_26_];
								int i_67_ = ((((Class387_Sub3) this).anIntArray8180[i_58_]) * i_65_ + (((Class387_Sub3) this).anIntArray8238[i_58_]) * i_66_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8180[i_58_] = ((((Class387_Sub3) this).anIntArray8180[i_58_]) * i_66_ - (((Class387_Sub3) this).anIntArray8238[i_58_]) * i_65_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_58_] = i_67_;
							}
							((Class387_Sub3) this).anIntArray8238[i_58_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_58_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_58_] += ((Class387_Sub3) this).anInt8221;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_68_ = 0; i_68_ < i_29_; i_68_++) {
				int i_69_ = is[i_68_];
				if (i_69_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_70_ = ((Class387_Sub3) this).anIntArrayArray8205[i_69_];
					for (int i_71_ = 0; i_71_ < is_70_.length; i_71_++) {
						int i_72_ = is_70_[i_71_];
						((Class387_Sub3) this).anIntArray8238[i_72_] -= ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_72_] -= ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_72_] -= ((Class387_Sub3) this).anInt8221;
						((Class387_Sub3) this).anIntArray8238[i_72_] = (((Class387_Sub3) this).anIntArray8238[i_72_] * i_25_ / 128);
						((Class387_Sub3) this).anIntArray8195[i_72_] = (((Class387_Sub3) this).anIntArray8195[i_72_] * i_26_ / 128);
						((Class387_Sub3) this).anIntArray8180[i_72_] = (((Class387_Sub3) this).anIntArray8180[i_72_] * i_27_ / 128);
						((Class387_Sub3) this).anIntArray8238[i_72_] += ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_72_] += ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_72_] += ((Class387_Sub3) this).anInt8221;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_73_ = 0; i_73_ < i_29_; i_73_++) {
					int i_74_ = is[i_73_];
					if (i_74_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_75_ = (((Class387_Sub3) this).anIntArrayArray8206[i_74_]);
						for (int i_76_ = 0; i_76_ < is_75_.length; i_76_++) {
							int i_77_ = is_75_[i_76_];
							int i_78_ = (((Class387_Sub3) this).aByteArray8200[i_77_] & 0xff) + i_25_ * 8;
							if (i_78_ < 0)
								i_78_ = 0;
							else if (i_78_ > 255)
								i_78_ = 255;
							((Class387_Sub3) this).aByteArray8200[i_77_] = (byte) i_78_;
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_79_ = 0; i_79_ < ((Class387_Sub3) this).anInt8215; i_79_++) {
						Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_79_];
						Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_79_];
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_80_ = 0; i_80_ < i_29_; i_80_++) {
					int i_81_ = is[i_80_];
					if (i_81_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_82_ = (((Class387_Sub3) this).anIntArrayArray8206[i_81_]);
						for (int i_83_ = 0; i_83_ < is_82_.length; i_83_++) {
							int i_84_ = is_82_[i_83_];
							int i_85_ = ((((Class387_Sub3) this).modelColors[i_84_]) & 0xffff);
							int i_86_ = i_85_ >> 10 & 0x3f;
							int i_87_ = i_85_ >> 7 & 0x7;
							int i_88_ = i_85_ & 0x7f;
							i_86_ = i_86_ + i_25_ & 0x3f;
							i_87_ += i_26_;
							if (i_87_ < 0)
								i_87_ = 0;
							else if (i_87_ > 7)
								i_87_ = 7;
							i_88_ += i_27_;
							if (i_88_ < 0)
								i_88_ = 0;
							else if (i_88_ > 127)
								i_88_ = 127;
							((Class387_Sub3) this).modelColors[i_84_] = (short) (i_86_ << 10 | i_87_ << 7 | i_88_);
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_89_ = 0; i_89_ < ((Class387_Sub3) this).anInt8215; i_89_++) {
						Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_89_];
						Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_89_];
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_90_ = 0; i_90_ < i_29_; i_90_++) {
					int i_91_ = is[i_90_];
					if (i_91_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_92_ = (((Class387_Sub3) this).anIntArrayArray8218[i_91_]);
						for (int i_93_ = 0; i_93_ < is_92_.length; i_93_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_92_[i_93_]]);
							((Class10) class10).anInt159 += i_25_ * 1013441605;
							((Class10) class10).anInt157 += i_26_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_94_ = 0; i_94_ < i_29_; i_94_++) {
					int i_95_ = is[i_94_];
					if (i_95_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_96_ = (((Class387_Sub3) this).anIntArrayArray8218[i_95_]);
						for (int i_97_ = 0; i_97_ < is_96_.length; i_97_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_96_[i_97_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_25_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_26_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_98_ = 0; i_98_ < i_29_; i_98_++) {
					int i_99_ = is[i_98_];
					if (i_99_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_100_ = (((Class387_Sub3) this).anIntArrayArray8218[i_99_]);
						for (int i_101_ = 0; i_101_ < is_100_.length; i_101_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_100_[i_101_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_25_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}

	int method4533(int i, int i_102_) {
		i_102_ = i_102_ * (i & 0x7f) >> 7;
		if (i_102_ < 2)
			i_102_ = 2;
		else if (i_102_ > 126)
			i_102_ = 126;
		return (i & 0xff80) + i_102_;
	}

	void method4534() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8174; i++) {
				int i_103_ = ((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8238[i] = ((Class387_Sub3) this).anIntArray8180[i];
				((Class387_Sub3) this).anIntArray8180[i] = -i_103_;
			}
			method4540();
		}
	}

	public void method4490(Class387 class387, int i, int i_104_, int i_105_, boolean bool) {
		Class387_Sub3 class387_sub3_106_ = (Class387_Sub3) class387;
		if ((((Class387_Sub3) this).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class387_Sub3) class387_sub3_106_).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		method4547();
		method4551();
		class387_sub3_106_.method4547();
		class387_sub3_106_.method4551();
		anInt8175++;
		int i_107_ = 0;
		int[] is = ((Class387_Sub3) class387_sub3_106_).anIntArray8238;
		int i_108_ = ((Class387_Sub3) class387_sub3_106_).anInt8185;
		for (int i_109_ = 0; i_109_ < ((Class387_Sub3) this).anInt8185; i_109_++) {
			Class21 class21 = ((Class387_Sub3) this).aClass21Array8182[i_109_];
			if (((Class21) class21).anInt255 != 0) {
				int i_110_ = ((Class387_Sub3) this).anIntArray8195[i_109_] - i_104_;
				if (i_110_ >= ((Class387_Sub3) class387_sub3_106_).aShort8214 && (i_110_ <= ((Class387_Sub3) class387_sub3_106_).aShort8223)) {
					int i_111_ = ((Class387_Sub3) this).anIntArray8238[i_109_] - i;
					if ((i_111_ >= ((Class387_Sub3) class387_sub3_106_).aShort8224) && i_111_ <= (((Class387_Sub3) class387_sub3_106_).aShort8225)) {
						int i_112_ = (((Class387_Sub3) this).anIntArray8180[i_109_] - i_105_);
						if (i_112_ >= (((Class387_Sub3) class387_sub3_106_).aShort8226) && i_112_ <= (((Class387_Sub3) class387_sub3_106_).aShort8227)) {
							for (int i_113_ = 0; i_113_ < i_108_; i_113_++) {
								Class21 class21_114_ = (((Class387_Sub3) class387_sub3_106_).aClass21Array8182[i_113_]);
								if (i_111_ == is[i_113_] && i_112_ == (((Class387_Sub3) class387_sub3_106_).anIntArray8180[i_113_]) && i_110_ == (((Class387_Sub3) class387_sub3_106_).anIntArray8195[i_113_]) && (((Class21) class21_114_).anInt255 != 0)) {
									if ((((Class387_Sub3) this).aClass21Array8183) == null)
										((Class387_Sub3) this).aClass21Array8183 = new Class21[((Class387_Sub3) this).anInt8185];
									if ((((Class387_Sub3) class387_sub3_106_).aClass21Array8183) == null)
										((Class387_Sub3) class387_sub3_106_).aClass21Array8183 = new Class21[i_108_];
									Class21 class21_115_ = (((Class387_Sub3) this).aClass21Array8183[i_109_]);
									if (class21_115_ == null)
										class21_115_ = ((Class387_Sub3) this).aClass21Array8183[i_109_] = new Class21(class21);
									Class21 class21_116_ = (((Class387_Sub3) class387_sub3_106_).aClass21Array8183[i_113_]);
									if (class21_116_ == null)
										class21_116_ = ((Class387_Sub3) class387_sub3_106_).aClass21Array8183[i_113_] = new Class21(class21_114_);
									((Class21) class21_115_).anInt252 += ((Class21) class21_114_).anInt252;
									((Class21) class21_115_).anInt253 += ((Class21) class21_114_).anInt253;
									((Class21) class21_115_).anInt254 += ((Class21) class21_114_).anInt254;
									((Class21) class21_115_).anInt255 += ((Class21) class21_114_).anInt255;
									((Class21) class21_116_).anInt252 += ((Class21) class21).anInt252;
									((Class21) class21_116_).anInt253 += ((Class21) class21).anInt253;
									((Class21) class21_116_).anInt254 += ((Class21) class21).anInt254;
									((Class21) class21_116_).anInt255 += ((Class21) class21).anInt255;
									i_107_++;
									((Class387_Sub3) this).anIntArray8239[i_109_] = anInt8175;
									((Class387_Sub3) this).anIntArray8240[i_113_] = anInt8175;
								}
							}
						}
					}
				}
			}
		}
		if (i_107_ >= 3 && bool) {
			for (int i_117_ = 0; i_117_ < ((Class387_Sub3) this).anInt8184; i_117_++) {
				if (((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8173[i_117_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8186[i_117_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8217[i_117_]]) == anInt8175)) {
					if (((Class387_Sub3) this).aByteArray8230 == null)
						((Class387_Sub3) this).aByteArray8230 = new byte[((Class387_Sub3) this).anInt8184];
					((Class387_Sub3) this).aByteArray8230[i_117_] = (byte) 2;
				}
			}
			for (int i_118_ = 0; i_118_ < ((Class387_Sub3) class387_sub3_106_).anInt8184; i_118_++) {
				if ((((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_106_).aShortArray8173[i_118_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_106_).aShortArray8186[i_118_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_106_).aShortArray8217[i_118_])]) == anInt8175) {
					if (((Class387_Sub3) class387_sub3_106_).aByteArray8230 == null)
						((Class387_Sub3) class387_sub3_106_).aByteArray8230 = new byte[(((Class387_Sub3) class387_sub3_106_).anInt8184)];
					((Class387_Sub3) class387_sub3_106_).aByteArray8230[i_118_] = (byte) 2;
				}
			}
		}
	}

	void method4535() {
		for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
			short i_119_ = (((Class387_Sub3) this).aShortArray8201 != null ? ((Class387_Sub3) this).aShortArray8201[i] : (short) -1);
			if (i_119_ == -1) {
				int i_120_ = ((Class387_Sub3) this).modelColors[i] & 0xffff;
				int i_121_ = (i_120_ & 0x7f) * ((Class387_Sub3) this).anInt8236 >> 7;
				short i_122_ = Class356.modifyColor(i_120_ & ~0x7f | i_121_, (byte) 1);
				if (((Class387_Sub3) this).anIntArray8192[i] == -1) {
					int i_123_ = ((Class387_Sub3) this).anIntArray8190[i] & ~0x1ffff;
					((Class387_Sub3) this).anIntArray8190[i] = i_123_ | Class330_Sub26_Sub1.method3395(i_122_, i_123_ >> 17, -866457710);
				} else if (((Class387_Sub3) this).anIntArray8192[i] != -2) {
					int i_124_ = ((Class387_Sub3) this).anIntArray8190[i] & ~0x1ffff;
					((Class387_Sub3) this).anIntArray8190[i] = i_124_ | Class330_Sub26_Sub1.method3395(i_122_, i_124_ >> 17, -1475304128);
					i_124_ = ((Class387_Sub3) this).anIntArray8191[i] & ~0x1ffff;
					((Class387_Sub3) this).anIntArray8191[i] = i_124_ | Class330_Sub26_Sub1.method3395(i_122_, i_124_ >> 17, -2144126028);
					i_124_ = ((Class387_Sub3) this).anIntArray8192[i] & ~0x1ffff;
					((Class387_Sub3) this).anIntArray8192[i] = i_124_ | Class330_Sub26_Sub1.method3395(i_122_, i_124_ >> 17, -430594482);
				}
			}
		}
		((Class387_Sub3) this).anInt8196 = 2;
	}

	Class387_Sub3(Class_ra_Sub3 class_ra_sub3, Model class98, int i, int i_125_, int i_126_, int i_127_) {
		((Class387_Sub3) this).anInt8184 = 0;
		((Class387_Sub3) this).anInt8196 = 0;
		((Class387_Sub3) this).aBoolean8208 = false;
		((Class387_Sub3) this).aBoolean8212 = false;
		((Class387_Sub3) this).aBoolean8187 = false;
		((Class387_Sub3) this).aBoolean8228 = false;
		((Class387_Sub3) this).aBoolean8229 = false;
		((Class387_Sub3) this).aClass_ra_Sub3_8165 = class_ra_sub3;
		((Class387_Sub3) this).anInt8172 = i;
		((Class387_Sub3) this).anInt8236 = i_125_;
		((Class387_Sub3) this).anInt8176 = i_126_;
		Interface_ma interface_ma = ((Class387_Sub3) this).aClass_ra_Sub3_8165.anInterface_ma4227;
		((Class387_Sub3) this).anInt8174 = class98.anInt897;
		((Class387_Sub3) this).anInt8185 = class98.anInt874;
		((Class387_Sub3) this).anIntArray8238 = class98.anIntArray875;
		((Class387_Sub3) this).anIntArray8195 = class98.anIntArray889;
		((Class387_Sub3) this).anIntArray8180 = class98.anIntArray877;
		((Class387_Sub3) this).anInt8184 = class98.anInt904;
		((Class387_Sub3) this).aShortArray8173 = class98.aShortArray888;
		((Class387_Sub3) this).aShortArray8186 = class98.aShortArray907;
		((Class387_Sub3) this).aShortArray8217 = class98.aShortArray883;
		((Class387_Sub3) this).aByteArray8203 = class98.aByteArray885;
		((Class387_Sub3) this).modelColors = class98.aShortArray873;
		((Class387_Sub3) this).aByteArray8200 = class98.aByteArray876;
		((Class387_Sub3) this).aShortArray8181 = class98.aShortArray892;
		((Class387_Sub3) this).aByteArray8230 = class98.aByteArray884;
		((Class387_Sub3) this).aClass93Array8213 = class98.aClass93Array878;
		((Class387_Sub3) this).aClass64Array8160 = class98.aClass64Array893;
		((Class387_Sub3) this).aShortArray8242 = class98.aShortArray879;
		int[] is = new int[((Class387_Sub3) this).anInt8184];
		for (int i_128_ = 0; i_128_ < ((Class387_Sub3) this).anInt8184; i_128_++)
			is[i_128_] = i_128_;
		long[] ls = new long[((Class387_Sub3) this).anInt8184];
		boolean bool = (((Class387_Sub3) this).anInt8172 & 0x100) != 0;
		for (int i_129_ = 0; i_129_ < ((Class387_Sub3) this).anInt8184; i_129_++) {
			int i_130_ = is[i_129_];
			Class56 class56 = null;
			int i_131_ = 0;
			int i_132_ = 0;
			int i_133_ = 0;
			int i_134_ = 0;
			if (class98.aClass94Array908 != null) {
				boolean bool_135_ = false;
				for (int i_136_ = 0; i_136_ < class98.aClass94Array908.length; i_136_++) {
					Class94 class94 = class98.aClass94Array908[i_136_];
					if (i_130_ == class94.anInt848 * -1401356047) {
						Class207 class207 = Class511.method6180((class94.anInt850 * 1490212127), (byte) 119);
						if (class207.aBoolean1948)
							bool_135_ = true;
						if (class207.anInt1950 * 1569869573 != -1) {
							Class56 class56_137_ = interface_ma.method221((class207.anInt1950 * 1569869573), 2051030540);
							if (class56_137_.aClass369_524 == Class369.aClass369_6817)
								((Class387_Sub3) this).aBoolean8228 = true;
						}
					}
				}
				if (bool_135_)
					ls[i_129_] = 9223372036854775807L;
			}
			int i_138_ = -1;
			if (class98.aShortArray896 != null) {
				i_138_ = class98.aShortArray896[i_130_];
				if (i_138_ != -1) {
					class56 = interface_ma.method221(i_138_ & 0xffff, 1516633017);
					if ((i_127_ & 0x40) == 0 || !class56.aBoolean533) {
						i_133_ = class56.aByte525;
						i_134_ = class56.aByte526;
					} else
						i_138_ = -1;
				}
			}
			boolean bool_139_ = ((((Class387_Sub3) this).aByteArray8200 != null && ((Class387_Sub3) this).aByteArray8200[i_130_] != 0) || (class56 != null && class56.aClass369_524 == Class369.aClass369_6817));
			if ((bool || bool_139_) && ((Class387_Sub3) this).aByteArray8203 != null)
				i_131_ += ((Class387_Sub3) this).aByteArray8203[i_130_] << 17;
			if (bool_139_)
				i_131_ += 65536;
			i_131_ += (i_133_ & 0xff) << 8;
			i_131_ += i_134_ & 0xff;
			i_132_ += (i_138_ & 0xffff) << 16;
			i_132_ += i_129_ & 0xffff;
			ls[i_129_] = ((long) i_131_ << 32) + (long) i_132_;
			((Class387_Sub3) this).aBoolean8228 |= bool_139_;
		}
		Class390.method4600(ls, is, (byte) 4);
		if (class98.aClass94Array908 != null) {
			((Class387_Sub3) this).anInt8215 = class98.aClass94Array908.length;
			((Class387_Sub3) this).aClass20Array8216 = new Class20[((Class387_Sub3) this).anInt8215];
			((Class387_Sub3) this).aClass10Array8211 = new Class10[((Class387_Sub3) this).anInt8215];
			for (int i_140_ = 0; i_140_ < class98.aClass94Array908.length; i_140_++) {
				Class94 class94 = class98.aClass94Array908[i_140_];
				Class207 class207 = Class511.method6180(class94.anInt850 * 1490212127, (byte) 91);
				int i_141_ = (Console.anIntArray4263[(class98.aShortArray873[class94.anInt848 * -1401356047] & 0xffff)]) & 0xffffff;
				i_141_ = i_141_ | 255 - (class98.aByteArray876 != null ? ((class98.aByteArray876[class94.anInt848 * -1401356047]) & 0xff) : 0) << 24;
				((Class387_Sub3) this).aClass20Array8216[i_140_] = (new Class20(class94.anInt848 * -1401356047, class98.aShortArray888[class94.anInt848 * -1401356047], class98.aShortArray907[class94.anInt848 * -1401356047], class98.aShortArray883[class94.anInt848 * -1401356047], class207.anInt1945 * 1234206275, class207.anInt1946 * -1366680355, class207.anInt1950 * 1569869573, class207.anInt1941 * -384448259, class207.anInt1947 * 1238436903, class207.aBoolean1948, class94.anInt849 * 1518395751));
				((Class387_Sub3) this).aClass10Array8211[i_140_] = new Class10(i_141_);
			}
		}
		((Class387_Sub3) this).aFloatArrayArray8188 = new float[((Class387_Sub3) this).anInt8184][];
		((Class387_Sub3) this).aFloatArrayArray8189 = new float[((Class387_Sub3) this).anInt8184][];
		Class97 class97 = method4444(class98, is, ((Class387_Sub3) this).anInt8184);
		Class6 class6 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread());
		float[] fs = ((Class6) class6).aFloatArray97;
		boolean bool_142_ = false;
		for (int i_143_ = 0; i_143_ < ((Class387_Sub3) this).anInt8184; i_143_++) {
			int i_144_ = is[i_143_];
			int i_145_;
			if (class98.aByteArray887 == null)
				i_145_ = -1;
			else
				i_145_ = class98.aByteArray887[i_144_];
			int i_146_ = (class98.aShortArray896 == null ? (int) -1 : class98.aShortArray896[i_144_]);
			if (i_146_ != -1 && (i_127_ & 0x40) != 0) {
				Class56 class56 = interface_ma.method221(i_146_ & 0xffff, 1617049978);
				if (class56.aBoolean533)
					i_146_ = -1;
			}
			if (i_146_ != -1) {
				bool_142_ = true;
				float[] fs_147_ = (((Class387_Sub3) this).aFloatArrayArray8188[i_144_] = new float[3]);
				float[] fs_148_ = (((Class387_Sub3) this).aFloatArrayArray8189[i_144_] = new float[3]);
				boolean bool_149_ = false;
				if (i_145_ == -1) {
					fs_147_[0] = 0.0F;
					fs_148_[0] = 1.0F;
					fs_147_[1] = 1.0F;
					fs_148_[1] = 1.0F;
					fs_147_[2] = 0.0F;
					fs_148_[2] = 0.0F;
				} else {
					i_145_ &= 0xff;
					byte i_150_ = class98.aByteArray894[i_145_];
					if (i_150_ == 0) {
						short i_151_ = ((Class387_Sub3) this).aShortArray8173[i_144_];
						short i_152_ = ((Class387_Sub3) this).aShortArray8186[i_144_];
						short i_153_ = ((Class387_Sub3) this).aShortArray8217[i_144_];
						short i_154_ = class98.aShortArray895[i_145_];
						short i_155_ = class98.aShortArray903[i_145_];
						short i_156_ = class98.aShortArray886[i_145_];
						float f = (float) (((Class387_Sub3) this).anIntArray8238[i_154_]);
						float f_157_ = (float) (((Class387_Sub3) this).anIntArray8195[i_154_]);
						float f_158_ = (float) (((Class387_Sub3) this).anIntArray8180[i_154_]);
						float f_159_ = ((float) (((Class387_Sub3) this).anIntArray8238[i_155_]) - f);
						float f_160_ = ((float) (((Class387_Sub3) this).anIntArray8195[i_155_]) - f_157_);
						float f_161_ = ((float) (((Class387_Sub3) this).anIntArray8180[i_155_]) - f_158_);
						float f_162_ = ((float) (((Class387_Sub3) this).anIntArray8238[i_156_]) - f);
						float f_163_ = ((float) (((Class387_Sub3) this).anIntArray8195[i_156_]) - f_157_);
						float f_164_ = ((float) (((Class387_Sub3) this).anIntArray8180[i_156_]) - f_158_);
						float f_165_ = ((float) (((Class387_Sub3) this).anIntArray8238[i_151_]) - f);
						float f_166_ = ((float) (((Class387_Sub3) this).anIntArray8195[i_151_]) - f_157_);
						float f_167_ = ((float) (((Class387_Sub3) this).anIntArray8180[i_151_]) - f_158_);
						float f_168_ = ((float) (((Class387_Sub3) this).anIntArray8238[i_152_]) - f);
						float f_169_ = ((float) (((Class387_Sub3) this).anIntArray8195[i_152_]) - f_157_);
						float f_170_ = ((float) (((Class387_Sub3) this).anIntArray8180[i_152_]) - f_158_);
						float f_171_ = ((float) (((Class387_Sub3) this).anIntArray8238[i_153_]) - f);
						float f_172_ = ((float) (((Class387_Sub3) this).anIntArray8195[i_153_]) - f_157_);
						float f_173_ = ((float) (((Class387_Sub3) this).anIntArray8180[i_153_]) - f_158_);
						float f_174_ = f_160_ * f_164_ - f_161_ * f_163_;
						float f_175_ = f_161_ * f_162_ - f_159_ * f_164_;
						float f_176_ = f_159_ * f_163_ - f_160_ * f_162_;
						float f_177_ = f_163_ * f_176_ - f_164_ * f_175_;
						float f_178_ = f_164_ * f_174_ - f_162_ * f_176_;
						float f_179_ = f_162_ * f_175_ - f_163_ * f_174_;
						float f_180_ = 1.0F / (f_177_ * f_159_ + f_178_ * f_160_ + f_179_ * f_161_);
						fs_147_[0] = (f_177_ * f_165_ + f_178_ * f_166_ + f_179_ * f_167_) * f_180_;
						fs_147_[1] = (f_177_ * f_168_ + f_178_ * f_169_ + f_179_ * f_170_) * f_180_;
						fs_147_[2] = (f_177_ * f_171_ + f_178_ * f_172_ + f_179_ * f_173_) * f_180_;
						f_177_ = f_160_ * f_176_ - f_161_ * f_175_;
						f_178_ = f_161_ * f_174_ - f_159_ * f_176_;
						f_179_ = f_159_ * f_175_ - f_160_ * f_174_;
						f_180_ = 1.0F / (f_177_ * f_162_ + f_178_ * f_163_ + f_179_ * f_164_);
						fs_148_[0] = (f_177_ * f_165_ + f_178_ * f_166_ + f_179_ * f_167_) * f_180_;
						fs_148_[1] = (f_177_ * f_168_ + f_178_ * f_169_ + f_179_ * f_170_) * f_180_;
						fs_148_[2] = (f_177_ * f_171_ + f_178_ * f_172_ + f_179_ * f_173_) * f_180_;
					} else {
						short i_181_ = ((Class387_Sub3) this).aShortArray8173[i_144_];
						short i_182_ = ((Class387_Sub3) this).aShortArray8186[i_144_];
						short i_183_ = ((Class387_Sub3) this).aShortArray8217[i_144_];
						int i_184_ = class97.anIntArray867[i_145_];
						int i_185_ = class97.anIntArray870[i_145_];
						int i_186_ = class97.anIntArray869[i_145_];
						float[] fs_187_ = class97.aFloatArrayArray868[i_145_];
						byte i_188_ = class98.aByteArray905[i_145_];
						float f = (float) class98.anIntArray901[i_145_] / 256.0F;
						if (i_150_ == 1) {
							float f_189_ = ((float) class98.anIntArray900[i_145_] / 1024.0F);
							method4492(((Class387_Sub3) this).anIntArray8238[i_181_], ((Class387_Sub3) this).anIntArray8195[i_181_], ((Class387_Sub3) this).anIntArray8180[i_181_], i_184_, i_185_, i_186_, fs_187_, f_189_, i_188_, f, fs);
							fs_147_[0] = fs[0];
							fs_148_[0] = fs[1];
							method4492(((Class387_Sub3) this).anIntArray8238[i_182_], ((Class387_Sub3) this).anIntArray8195[i_182_], ((Class387_Sub3) this).anIntArray8180[i_182_], i_184_, i_185_, i_186_, fs_187_, f_189_, i_188_, f, fs);
							fs_147_[1] = fs[0];
							fs_148_[1] = fs[1];
							method4492(((Class387_Sub3) this).anIntArray8238[i_183_], ((Class387_Sub3) this).anIntArray8195[i_183_], ((Class387_Sub3) this).anIntArray8180[i_183_], i_184_, i_185_, i_186_, fs_187_, f_189_, i_188_, f, fs);
							fs_147_[2] = fs[0];
							fs_148_[2] = fs[1];
							float f_190_ = f_189_ / 2.0F;
							if ((i_188_ & 0x1) == 0) {
								if (fs_147_[1] - fs_147_[0] > f_190_)
									fs_147_[1] -= f_189_;
								else if (fs_147_[0] - fs_147_[1] > f_190_)
									fs_147_[1] += f_189_;
								if (fs_147_[2] - fs_147_[0] > f_190_)
									fs_147_[2] -= f_189_;
								else if (fs_147_[0] - fs_147_[2] > f_190_)
									fs_147_[2] += f_189_;
							} else {
								if (fs_148_[1] - fs_148_[0] > f_190_)
									fs_148_[1] -= f_189_;
								else if (fs_148_[0] - fs_148_[1] > f_190_)
									fs_148_[1] += f_189_;
								if (fs_148_[2] - fs_148_[0] > f_190_)
									fs_148_[2] -= f_189_;
								else if (fs_148_[0] - fs_148_[2] > f_190_)
									fs_148_[2] += f_189_;
							}
						} else if (i_150_ == 2) {
							float f_191_ = ((float) class98.anIntArray902[i_145_] / 256.0F);
							float f_192_ = ((float) class98.anIntArray872[i_145_] / 256.0F);
							int i_193_ = ((((Class387_Sub3) this).anIntArray8238[i_182_]) - (((Class387_Sub3) this).anIntArray8238[i_181_]));
							int i_194_ = ((((Class387_Sub3) this).anIntArray8195[i_182_]) - (((Class387_Sub3) this).anIntArray8195[i_181_]));
							int i_195_ = ((((Class387_Sub3) this).anIntArray8180[i_182_]) - (((Class387_Sub3) this).anIntArray8180[i_181_]));
							int i_196_ = ((((Class387_Sub3) this).anIntArray8238[i_183_]) - (((Class387_Sub3) this).anIntArray8238[i_181_]));
							int i_197_ = ((((Class387_Sub3) this).anIntArray8195[i_183_]) - (((Class387_Sub3) this).anIntArray8195[i_181_]));
							int i_198_ = ((((Class387_Sub3) this).anIntArray8180[i_183_]) - (((Class387_Sub3) this).anIntArray8180[i_181_]));
							int i_199_ = i_194_ * i_198_ - i_197_ * i_195_;
							int i_200_ = i_195_ * i_196_ - i_198_ * i_193_;
							int i_201_ = i_193_ * i_197_ - i_196_ * i_194_;
							float f_202_ = (64.0F / (float) class98.anIntArray898[i_145_]);
							float f_203_ = (64.0F / (float) class98.anIntArray899[i_145_]);
							float f_204_ = (64.0F / (float) class98.anIntArray900[i_145_]);
							float f_205_ = (((float) i_199_ * fs_187_[0] + (float) i_200_ * fs_187_[1] + (float) i_201_ * fs_187_[2]) / f_202_);
							float f_206_ = (((float) i_199_ * fs_187_[3] + (float) i_200_ * fs_187_[4] + (float) i_201_ * fs_187_[5]) / f_203_);
							float f_207_ = (((float) i_199_ * fs_187_[6] + (float) i_200_ * fs_187_[7] + (float) i_201_ * fs_187_[8]) / f_204_);
							int i_208_ = method4442(f_205_, f_206_, f_207_);
							method4443(((Class387_Sub3) this).anIntArray8238[i_181_], ((Class387_Sub3) this).anIntArray8195[i_181_], ((Class387_Sub3) this).anIntArray8180[i_181_], i_184_, i_185_, i_186_, i_208_, fs_187_, i_188_, f, f_191_, f_192_, fs);
							fs_147_[0] = fs[0];
							fs_148_[0] = fs[1];
							method4443(((Class387_Sub3) this).anIntArray8238[i_182_], ((Class387_Sub3) this).anIntArray8195[i_182_], ((Class387_Sub3) this).anIntArray8180[i_182_], i_184_, i_185_, i_186_, i_208_, fs_187_, i_188_, f, f_191_, f_192_, fs);
							fs_147_[1] = fs[0];
							fs_148_[1] = fs[1];
							method4443(((Class387_Sub3) this).anIntArray8238[i_183_], ((Class387_Sub3) this).anIntArray8195[i_183_], ((Class387_Sub3) this).anIntArray8180[i_183_], i_184_, i_185_, i_186_, i_208_, fs_187_, i_188_, f, f_191_, f_192_, fs);
							fs_147_[2] = fs[0];
							fs_148_[2] = fs[1];
						} else if (i_150_ == 3) {
							method4441(((Class387_Sub3) this).anIntArray8238[i_181_], ((Class387_Sub3) this).anIntArray8195[i_181_], ((Class387_Sub3) this).anIntArray8180[i_181_], i_184_, i_185_, i_186_, fs_187_, i_188_, f, fs);
							fs_147_[0] = fs[0];
							fs_148_[0] = fs[1];
							method4441(((Class387_Sub3) this).anIntArray8238[i_182_], ((Class387_Sub3) this).anIntArray8195[i_182_], ((Class387_Sub3) this).anIntArray8180[i_182_], i_184_, i_185_, i_186_, fs_187_, i_188_, f, fs);
							fs_147_[1] = fs[0];
							fs_148_[1] = fs[1];
							method4441(((Class387_Sub3) this).anIntArray8238[i_183_], ((Class387_Sub3) this).anIntArray8195[i_183_], ((Class387_Sub3) this).anIntArray8180[i_183_], i_184_, i_185_, i_186_, fs_187_, i_188_, f, fs);
							fs_147_[2] = fs[0];
							fs_148_[2] = fs[1];
							if ((i_188_ & 0x1) == 0) {
								if (fs_147_[1] - fs_147_[0] > 0.5F)
									fs_147_[1]--;
								else if (fs_147_[0] - fs_147_[1] > 0.5F)
									fs_147_[1]++;
								if (fs_147_[2] - fs_147_[0] > 0.5F)
									fs_147_[2]--;
								else if (fs_147_[0] - fs_147_[2] > 0.5F)
									fs_147_[2]++;
							} else {
								if (fs_148_[1] - fs_148_[0] > 0.5F)
									fs_148_[1]--;
								else if (fs_148_[0] - fs_148_[1] > 0.5F)
									fs_148_[1]++;
								if (fs_148_[2] - fs_148_[0] > 0.5F)
									fs_148_[2]--;
								else if (fs_148_[0] - fs_148_[2] > 0.5F)
									fs_148_[2]++;
							}
						}
					}
				}
			}
		}
		if (!bool_142_) {
			((Class387_Sub3) this).aFloatArrayArray8189 = null;
			((Class387_Sub3) this).aFloatArrayArray8188 = null;
		}
		if (class98.anIntArray880 != null && (((Class387_Sub3) this).anInt8172 & 0x20) != 0)
			((Class387_Sub3) this).anIntArrayArray8205 = class98.method1197(true);
		if (class98.anIntArray890 != null && (((Class387_Sub3) this).anInt8172 & 0x180) != 0)
			((Class387_Sub3) this).anIntArrayArray8206 = class98.method1192();
		if (class98.aClass94Array908 != null && (((Class387_Sub3) this).anInt8172 & 0x400) != 0)
			((Class387_Sub3) this).anIntArrayArray8218 = class98.method1193();
		if (class98.aShortArray896 != null) {
			((Class387_Sub3) this).aShortArray8201 = new short[((Class387_Sub3) this).anInt8184];
			boolean bool_209_ = false;
			for (int i_210_ = 0; i_210_ < ((Class387_Sub3) this).anInt8184; i_210_++) {
				short i_211_ = class98.aShortArray896[i_210_];
				if (i_211_ != -1) {
					Class56 class56 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.anInterface_ma4227.method221(i_211_, -1249236205);
					if ((i_127_ & 0x40) == 0 || !class56.aBoolean533) {
						((Class387_Sub3) this).aShortArray8201[i_210_] = i_211_;
						bool_209_ = true;
						if (class56.aClass369_524 == Class369.aClass369_6817)
							((Class387_Sub3) this).aBoolean8228 = true;
						if (class56.aByte531 != 0 || class56.aByte530 != 0)
							((Class387_Sub3) this).aBoolean8229 = true;
					} else
						((Class387_Sub3) this).aShortArray8201[i_210_] = (short) -1;
				} else
					((Class387_Sub3) this).aShortArray8201[i_210_] = (short) -1;
			}
			if (!bool_209_)
				((Class387_Sub3) this).aShortArray8201 = null;
		} else
			((Class387_Sub3) this).aShortArray8201 = null;
		if (((Class387_Sub3) this).aBoolean8228 || ((Class387_Sub3) this).aClass20Array8216 != null) {
			((Class387_Sub3) this).aShortArray8204 = new short[((Class387_Sub3) this).anInt8184];
			for (int i_212_ = 0; i_212_ < ((Class387_Sub3) this).anInt8184; i_212_++)
				((Class387_Sub3) this).aShortArray8204[i_212_] = (short) is[i_212_];
		}
	}

	public void method4475(Class247 class247, Class80 class80, int i) {
		method4541(class247, class80, i);
	}

	Class387 method4536(Class387_Sub3 class387_sub3_213_, Class387_Sub3 class387_sub3_214_, int i, boolean bool, boolean bool_215_) {
		((Class387_Sub3) class387_sub3_213_).aBoolean8187 = ((Class387_Sub3) this).aBoolean8187;
		if (((Class387_Sub3) this).aBoolean8187) {
			((Class387_Sub3) class387_sub3_213_).aShort8225 = ((Class387_Sub3) this).aShort8225;
			((Class387_Sub3) class387_sub3_213_).aShort8223 = ((Class387_Sub3) this).aShort8223;
			((Class387_Sub3) class387_sub3_213_).aShort8227 = ((Class387_Sub3) this).aShort8227;
			((Class387_Sub3) class387_sub3_213_).aShort8224 = ((Class387_Sub3) this).aShort8224;
			((Class387_Sub3) class387_sub3_213_).aShort8214 = ((Class387_Sub3) this).aShort8214;
			((Class387_Sub3) class387_sub3_213_).aShort8226 = ((Class387_Sub3) this).aShort8226;
			((Class387_Sub3) class387_sub3_213_).aShort8220 = ((Class387_Sub3) this).aShort8220;
			((Class387_Sub3) class387_sub3_213_).aShort8198 = ((Class387_Sub3) this).aShort8198;
		}
		((Class387_Sub3) class387_sub3_213_).anInt8236 = ((Class387_Sub3) this).anInt8236;
		((Class387_Sub3) class387_sub3_213_).anInt8176 = ((Class387_Sub3) this).anInt8176;
		((Class387_Sub3) class387_sub3_213_).anInt8174 = ((Class387_Sub3) this).anInt8174;
		((Class387_Sub3) class387_sub3_213_).anInt8185 = ((Class387_Sub3) this).anInt8185;
		((Class387_Sub3) class387_sub3_213_).anInt8184 = ((Class387_Sub3) this).anInt8184;
		((Class387_Sub3) class387_sub3_213_).anInt8215 = ((Class387_Sub3) this).anInt8215;
		if ((i & 0x100) != 0)
			((Class387_Sub3) class387_sub3_213_).aBoolean8228 = true;
		else
			((Class387_Sub3) class387_sub3_213_).aBoolean8228 = ((Class387_Sub3) this).aBoolean8228;
		((Class387_Sub3) class387_sub3_213_).aBoolean8229 = ((Class387_Sub3) this).aBoolean8229;
		boolean bool_216_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_217_ = bool_216_ || (i & 0x1) != 0;
		boolean bool_218_ = bool_216_ || (i & 0x2) != 0;
		boolean bool_219_ = bool_216_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_217_ || bool_218_ || bool_219_) {
			if (bool_217_) {
				if (((Class387_Sub3) class387_sub3_214_).anIntArray8238 == null || ((((Class387_Sub3) class387_sub3_214_).anIntArray8238).length < ((Class387_Sub3) this).anInt8174))
					((Class387_Sub3) class387_sub3_213_).anIntArray8238 = ((Class387_Sub3) class387_sub3_214_).anIntArray8238 = new int[((Class387_Sub3) this).anInt8174];
				else
					((Class387_Sub3) class387_sub3_213_).anIntArray8238 = ((Class387_Sub3) class387_sub3_214_).anIntArray8238;
				for (int i_220_ = 0; i_220_ < ((Class387_Sub3) this).anInt8174; i_220_++)
					((Class387_Sub3) class387_sub3_213_).anIntArray8238[i_220_] = ((Class387_Sub3) this).anIntArray8238[i_220_];
			} else
				((Class387_Sub3) class387_sub3_213_).anIntArray8238 = ((Class387_Sub3) this).anIntArray8238;
			if (bool_218_) {
				if (((Class387_Sub3) class387_sub3_214_).anIntArray8195 == null || ((((Class387_Sub3) class387_sub3_214_).anIntArray8195).length < ((Class387_Sub3) this).anInt8174))
					((Class387_Sub3) class387_sub3_213_).anIntArray8195 = ((Class387_Sub3) class387_sub3_214_).anIntArray8195 = new int[((Class387_Sub3) this).anInt8174];
				else
					((Class387_Sub3) class387_sub3_213_).anIntArray8195 = ((Class387_Sub3) class387_sub3_214_).anIntArray8195;
				for (int i_221_ = 0; i_221_ < ((Class387_Sub3) this).anInt8174; i_221_++)
					((Class387_Sub3) class387_sub3_213_).anIntArray8195[i_221_] = ((Class387_Sub3) this).anIntArray8195[i_221_];
			} else
				((Class387_Sub3) class387_sub3_213_).anIntArray8195 = ((Class387_Sub3) this).anIntArray8195;
			if (bool_219_) {
				if (((Class387_Sub3) class387_sub3_214_).anIntArray8180 == null || ((((Class387_Sub3) class387_sub3_214_).anIntArray8180).length < ((Class387_Sub3) this).anInt8174))
					((Class387_Sub3) class387_sub3_213_).anIntArray8180 = ((Class387_Sub3) class387_sub3_214_).anIntArray8180 = new int[((Class387_Sub3) this).anInt8174];
				else
					((Class387_Sub3) class387_sub3_213_).anIntArray8180 = ((Class387_Sub3) class387_sub3_214_).anIntArray8180;
				for (int i_222_ = 0; i_222_ < ((Class387_Sub3) this).anInt8174; i_222_++)
					((Class387_Sub3) class387_sub3_213_).anIntArray8180[i_222_] = ((Class387_Sub3) this).anIntArray8180[i_222_];
			} else
				((Class387_Sub3) class387_sub3_213_).anIntArray8180 = ((Class387_Sub3) this).anIntArray8180;
		} else {
			((Class387_Sub3) class387_sub3_213_).anIntArray8238 = ((Class387_Sub3) this).anIntArray8238;
			((Class387_Sub3) class387_sub3_213_).anIntArray8195 = ((Class387_Sub3) this).anIntArray8195;
			((Class387_Sub3) class387_sub3_213_).anIntArray8180 = ((Class387_Sub3) this).anIntArray8180;
		}
		if ((i & 0x84080) != 0) {
			if (((Class387_Sub3) class387_sub3_214_).modelColors == null || (((Class387_Sub3) class387_sub3_214_).modelColors.length < ((Class387_Sub3) this).anInt8184)) {
				int i_223_ = ((Class387_Sub3) this).anInt8184;
				((Class387_Sub3) class387_sub3_213_).modelColors = ((Class387_Sub3) class387_sub3_214_).modelColors = new short[i_223_];
			} else
				((Class387_Sub3) class387_sub3_213_).modelColors = ((Class387_Sub3) class387_sub3_214_).modelColors;
			for (int i_224_ = 0; i_224_ < ((Class387_Sub3) this).anInt8184; i_224_++)
				((Class387_Sub3) class387_sub3_213_).modelColors[i_224_] = ((Class387_Sub3) this).modelColors[i_224_];
		} else
			((Class387_Sub3) class387_sub3_213_).modelColors = ((Class387_Sub3) this).modelColors;
		if ((i & 0x97018) != 0) {
			((Class387_Sub3) class387_sub3_213_).anInt8196 = 0;
			Class387_Sub3 class387_sub3_225_ = class387_sub3_213_;
			Class387_Sub3 class387_sub3_226_ = class387_sub3_213_;
			((Class387_Sub3) class387_sub3_213_).anIntArray8192 = null;
			((Class387_Sub3) class387_sub3_226_).anIntArray8191 = null;
			((Class387_Sub3) class387_sub3_225_).anIntArray8190 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_215_)
				method4532(false);
			if (((Class387_Sub3) this).anIntArray8190 != null) {
				if (((Class387_Sub3) class387_sub3_214_).anIntArray8190 == null || ((((Class387_Sub3) class387_sub3_214_).anIntArray8190).length < ((Class387_Sub3) this).anInt8184)) {
					int i_227_ = ((Class387_Sub3) this).anInt8184;
					((Class387_Sub3) class387_sub3_213_).anIntArray8190 = ((Class387_Sub3) class387_sub3_214_).anIntArray8190 = new int[i_227_];
					((Class387_Sub3) class387_sub3_213_).anIntArray8191 = ((Class387_Sub3) class387_sub3_214_).anIntArray8191 = new int[i_227_];
					((Class387_Sub3) class387_sub3_213_).anIntArray8192 = ((Class387_Sub3) class387_sub3_214_).anIntArray8192 = new int[i_227_];
				} else {
					((Class387_Sub3) class387_sub3_213_).anIntArray8190 = ((Class387_Sub3) class387_sub3_214_).anIntArray8190;
					((Class387_Sub3) class387_sub3_213_).anIntArray8191 = ((Class387_Sub3) class387_sub3_214_).anIntArray8191;
					((Class387_Sub3) class387_sub3_213_).anIntArray8192 = ((Class387_Sub3) class387_sub3_214_).anIntArray8192;
				}
				for (int i_228_ = 0; i_228_ < ((Class387_Sub3) this).anInt8184; i_228_++) {
					((Class387_Sub3) class387_sub3_213_).anIntArray8190[i_228_] = ((Class387_Sub3) this).anIntArray8190[i_228_];
					((Class387_Sub3) class387_sub3_213_).anIntArray8191[i_228_] = ((Class387_Sub3) this).anIntArray8191[i_228_];
					((Class387_Sub3) class387_sub3_213_).anIntArray8192[i_228_] = ((Class387_Sub3) this).anIntArray8192[i_228_];
				}
			}
			((Class387_Sub3) class387_sub3_213_).anInt8196 = ((Class387_Sub3) this).anInt8196;
		} else {
			if (bool_215_)
				method4532(false);
			((Class387_Sub3) class387_sub3_213_).anIntArray8190 = ((Class387_Sub3) this).anIntArray8190;
			((Class387_Sub3) class387_sub3_213_).anIntArray8191 = ((Class387_Sub3) this).anIntArray8191;
			((Class387_Sub3) class387_sub3_213_).anIntArray8192 = ((Class387_Sub3) this).anIntArray8192;
			((Class387_Sub3) class387_sub3_213_).anInt8196 = ((Class387_Sub3) this).anInt8196;
		}
		if ((i & 0x100) != 0) {
			if (((Class387_Sub3) class387_sub3_214_).aByteArray8200 == null || (((Class387_Sub3) class387_sub3_214_).aByteArray8200.length < ((Class387_Sub3) this).anInt8184)) {
				int i_229_ = ((Class387_Sub3) this).anInt8184;
				((Class387_Sub3) class387_sub3_213_).aByteArray8200 = ((Class387_Sub3) class387_sub3_214_).aByteArray8200 = new byte[i_229_];
			} else
				((Class387_Sub3) class387_sub3_213_).aByteArray8200 = ((Class387_Sub3) class387_sub3_214_).aByteArray8200;
			if (((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_230_ = 0; i_230_ < ((Class387_Sub3) this).anInt8184; i_230_++)
					((Class387_Sub3) class387_sub3_213_).aByteArray8200[i_230_] = ((Class387_Sub3) this).aByteArray8200[i_230_];
			} else {
				for (int i_231_ = 0; i_231_ < ((Class387_Sub3) this).anInt8184; i_231_++)
					((Class387_Sub3) class387_sub3_213_).aByteArray8200[i_231_] = (byte) 0;
			}
		} else
			((Class387_Sub3) class387_sub3_213_).aByteArray8200 = ((Class387_Sub3) this).aByteArray8200;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (((Class387_Sub3) class387_sub3_214_).aClass21Array8182 == null || ((((Class387_Sub3) class387_sub3_214_).aClass21Array8182).length < ((Class387_Sub3) this).anInt8185)) {
				int i_232_ = ((Class387_Sub3) this).anInt8185;
				((Class387_Sub3) class387_sub3_213_).aClass21Array8182 = ((Class387_Sub3) class387_sub3_214_).aClass21Array8182 = new Class21[i_232_];
			} else
				((Class387_Sub3) class387_sub3_213_).aClass21Array8182 = ((Class387_Sub3) class387_sub3_214_).aClass21Array8182;
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				for (int i_233_ = 0; i_233_ < ((Class387_Sub3) this).anInt8185; i_233_++)
					((Class387_Sub3) class387_sub3_213_).aClass21Array8182[i_233_] = new Class21(((Class387_Sub3) this).aClass21Array8182[i_233_]);
			} else
				((Class387_Sub3) class387_sub3_213_).aClass21Array8182 = null;
			if (((Class387_Sub3) this).aClass25Array8197 != null) {
				if ((((Class387_Sub3) class387_sub3_214_).aClass25Array8197 == null) || ((((Class387_Sub3) class387_sub3_214_).aClass25Array8197).length < ((Class387_Sub3) this).anInt8184)) {
					int i_234_ = ((Class387_Sub3) this).anInt8184;
					((Class387_Sub3) class387_sub3_213_).aClass25Array8197 = ((Class387_Sub3) class387_sub3_214_).aClass25Array8197 = new Class25[i_234_];
				} else
					((Class387_Sub3) class387_sub3_213_).aClass25Array8197 = (((Class387_Sub3) class387_sub3_214_).aClass25Array8197);
				for (int i_235_ = 0; i_235_ < ((Class387_Sub3) this).anInt8184; i_235_++)
					((Class387_Sub3) class387_sub3_213_).aClass25Array8197[i_235_] = ((((Class387_Sub3) this).aClass25Array8197[i_235_] != null) ? new Class25(((Class387_Sub3) this).aClass25Array8197[i_235_]) : null);
			} else
				((Class387_Sub3) class387_sub3_213_).aClass25Array8197 = null;
		} else {
			if (bool_215_)
				method4551();
			((Class387_Sub3) class387_sub3_213_).aClass21Array8182 = ((Class387_Sub3) this).aClass21Array8182;
			((Class387_Sub3) class387_sub3_213_).aClass25Array8197 = ((Class387_Sub3) this).aClass25Array8197;
		}
		if ((i & 0x8000) != 0) {
			if (((Class387_Sub3) this).aShortArray8201 == null)
				((Class387_Sub3) class387_sub3_213_).aShortArray8201 = null;
			else {
				if ((((Class387_Sub3) class387_sub3_214_).aShortArray8201 == null) || ((((Class387_Sub3) class387_sub3_214_).aShortArray8201).length < ((Class387_Sub3) this).anInt8184)) {
					int i_236_ = ((Class387_Sub3) this).anInt8184;
					((Class387_Sub3) class387_sub3_213_).aShortArray8201 = ((Class387_Sub3) class387_sub3_214_).aShortArray8201 = new short[i_236_];
				} else
					((Class387_Sub3) class387_sub3_213_).aShortArray8201 = ((Class387_Sub3) class387_sub3_214_).aShortArray8201;
				for (int i_237_ = 0; i_237_ < ((Class387_Sub3) this).anInt8184; i_237_++)
					((Class387_Sub3) class387_sub3_213_).aShortArray8201[i_237_] = ((Class387_Sub3) this).aShortArray8201[i_237_];
			}
		} else
			((Class387_Sub3) class387_sub3_213_).aShortArray8201 = ((Class387_Sub3) this).aShortArray8201;
		if ((i & 0x10000) != 0) {
			if (((Class387_Sub3) this).aByteArray8230 == null)
				((Class387_Sub3) class387_sub3_213_).aByteArray8230 = null;
			else {
				if (((Class387_Sub3) class387_sub3_214_).aByteArray8230 == null || ((((Class387_Sub3) class387_sub3_214_).aByteArray8230).length < ((Class387_Sub3) this).anInt8184)) {
					int i_238_ = (bool ? ((Class387_Sub3) this).anInt8184 + 100 : ((Class387_Sub3) this).anInt8184);
					((Class387_Sub3) class387_sub3_213_).aByteArray8230 = ((Class387_Sub3) class387_sub3_214_).aByteArray8230 = new byte[i_238_];
				} else
					((Class387_Sub3) class387_sub3_213_).aByteArray8230 = ((Class387_Sub3) class387_sub3_214_).aByteArray8230;
				for (int i_239_ = 0; i_239_ < ((Class387_Sub3) this).anInt8184; i_239_++)
					((Class387_Sub3) class387_sub3_213_).aByteArray8230[i_239_] = ((Class387_Sub3) this).aByteArray8230[i_239_];
			}
		} else
			((Class387_Sub3) class387_sub3_213_).aByteArray8230 = ((Class387_Sub3) this).aByteArray8230;
		if ((i & 0xc580) != 0) {
			if (((Class387_Sub3) class387_sub3_214_).aClass10Array8211 == null || ((((Class387_Sub3) class387_sub3_214_).aClass10Array8211).length < ((Class387_Sub3) this).anInt8215)) {
				int i_240_ = ((Class387_Sub3) this).anInt8215;
				((Class387_Sub3) class387_sub3_213_).aClass10Array8211 = ((Class387_Sub3) class387_sub3_214_).aClass10Array8211 = new Class10[i_240_];
				for (int i_241_ = 0; i_241_ < ((Class387_Sub3) this).anInt8215; i_241_++)
					((Class387_Sub3) class387_sub3_213_).aClass10Array8211[i_241_] = ((Class387_Sub3) this).aClass10Array8211[i_241_].method424(-1936012664);
			} else {
				((Class387_Sub3) class387_sub3_213_).aClass10Array8211 = ((Class387_Sub3) class387_sub3_214_).aClass10Array8211;
				for (int i_242_ = 0; i_242_ < ((Class387_Sub3) this).anInt8215; i_242_++)
					((Class387_Sub3) class387_sub3_213_).aClass10Array8211[i_242_].method425(((Class387_Sub3) this).aClass10Array8211[i_242_], 707409334);
			}
		} else
			((Class387_Sub3) class387_sub3_213_).aClass10Array8211 = ((Class387_Sub3) this).aClass10Array8211;
		if (((Class387_Sub3) this).aFloatArrayArray8188 != null && (i & 0x10) != 0) {
			if ((((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8188 == null) || ((((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8188).length < ((Class387_Sub3) this).anInt8184)) {
				int i_243_ = (bool ? ((Class387_Sub3) this).anInt8184 + 100 : ((Class387_Sub3) this).anInt8184);
				((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8188 = ((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8188 = new float[i_243_][3];
			} else
				((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8188 = (((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8188);
			for (int i_244_ = 0; i_244_ < ((Class387_Sub3) this).anInt8184; i_244_++) {
				if (((Class387_Sub3) this).aFloatArrayArray8188[i_244_] != null) {
					((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8188[i_244_][0] = (((Class387_Sub3) this).aFloatArrayArray8188[i_244_][0]);
					((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8188[i_244_][1] = (((Class387_Sub3) this).aFloatArrayArray8188[i_244_][1]);
					((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8188[i_244_][2] = (((Class387_Sub3) this).aFloatArrayArray8188[i_244_][2]);
				}
			}
			if ((((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8189 == null) || ((((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8189).length < ((Class387_Sub3) this).anInt8184)) {
				int i_245_ = (bool ? ((Class387_Sub3) this).anInt8184 + 100 : ((Class387_Sub3) this).anInt8184);
				((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8189 = ((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8189 = new float[i_245_][3];
			} else
				((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8189 = (((Class387_Sub3) class387_sub3_214_).aFloatArrayArray8189);
			for (int i_246_ = 0; i_246_ < ((Class387_Sub3) this).anInt8184; i_246_++) {
				if (((Class387_Sub3) this).aFloatArrayArray8189[i_246_] != null) {
					((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8189[i_246_][0] = (((Class387_Sub3) this).aFloatArrayArray8189[i_246_][0]);
					((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8189[i_246_][1] = (((Class387_Sub3) this).aFloatArrayArray8189[i_246_][1]);
					((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8189[i_246_][2] = (((Class387_Sub3) this).aFloatArrayArray8189[i_246_][2]);
				}
			}
		} else {
			((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8188 = ((Class387_Sub3) this).aFloatArrayArray8188;
			((Class387_Sub3) class387_sub3_213_).aFloatArrayArray8189 = ((Class387_Sub3) this).aFloatArrayArray8189;
		}
		((Class387_Sub3) class387_sub3_213_).anIntArrayArray8205 = ((Class387_Sub3) this).anIntArrayArray8205;
		((Class387_Sub3) class387_sub3_213_).anIntArrayArray8206 = ((Class387_Sub3) this).anIntArrayArray8206;
		((Class387_Sub3) class387_sub3_213_).anIntArrayArray8218 = ((Class387_Sub3) this).anIntArrayArray8218;
		((Class387_Sub3) class387_sub3_213_).aShortArray8242 = ((Class387_Sub3) this).aShortArray8242;
		((Class387_Sub3) class387_sub3_213_).aShortArray8181 = ((Class387_Sub3) this).aShortArray8181;
		((Class387_Sub3) class387_sub3_213_).aByteArray8203 = ((Class387_Sub3) this).aByteArray8203;
		((Class387_Sub3) class387_sub3_213_).aShortArray8173 = ((Class387_Sub3) this).aShortArray8173;
		((Class387_Sub3) class387_sub3_213_).aShortArray8186 = ((Class387_Sub3) this).aShortArray8186;
		((Class387_Sub3) class387_sub3_213_).aShortArray8217 = ((Class387_Sub3) this).aShortArray8217;
		((Class387_Sub3) class387_sub3_213_).aClass93Array8213 = ((Class387_Sub3) this).aClass93Array8213;
		((Class387_Sub3) class387_sub3_213_).aClass64Array8160 = ((Class387_Sub3) this).aClass64Array8160;
		((Class387_Sub3) class387_sub3_213_).aClass20Array8216 = ((Class387_Sub3) this).aClass20Array8216;
		((Class387_Sub3) class387_sub3_213_).aShortArray8204 = ((Class387_Sub3) this).aShortArray8204;
		((Class387_Sub3) class387_sub3_213_).anInt8172 = i;
		return class387_sub3_213_;
	}

	public int m() {
		return ((Class387_Sub3) this).anInt8172;
	}

	public void f(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method4534();
		else if (i == 8192)
			method4537();
		else if (i == 12288)
			method4538();
		else {
			int i_247_ = Class257.anIntArray2683[i];
			int i_248_ = Class257.anIntArray2684[i];
			synchronized (this) {
				for (int i_249_ = 0; i_249_ < ((Class387_Sub3) this).anInt8174; i_249_++) {
					int i_250_ = (((((Class387_Sub3) this).anIntArray8180[i_249_] * i_247_) + (((Class387_Sub3) this).anIntArray8238[i_249_] * i_248_)) >> 14);
					((Class387_Sub3) this).anIntArray8180[i_249_] = ((((Class387_Sub3) this).anIntArray8180[i_249_] * i_248_) - (((Class387_Sub3) this).anIntArray8238[i_249_] * i_247_)) >> 14;
					((Class387_Sub3) this).anIntArray8238[i_249_] = i_250_;
				}
				method4540();
			}
		}
	}

	public void S(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				if (i == 4096) {
					method4550();
					break;
				}
				if (i == 8192) {
					method4539();
					break;
				}
				if (i == 12288) {
					method4556();
					break;
				}
				int i_251_ = Class257.anIntArray2683[i];
				int i_252_ = Class257.anIntArray2684[i];
				synchronized (this) {
					for (int i_253_ = 0; i_253_ < ((Class387_Sub3) this).anInt8185; i_253_++) {
						int i_254_ = ((((Class387_Sub3) this).anIntArray8180[i_253_] * i_251_) + (((Class387_Sub3) this).anIntArray8238[i_253_] * i_252_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_253_] = ((((Class387_Sub3) this).anIntArray8180[i_253_] * i_252_) - (((Class387_Sub3) this).anIntArray8238[i_253_] * i_251_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_253_] = i_254_;
						if (((Class387_Sub3) this).aClass21Array8182[i_253_] != null) {
							i_254_ = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_253_])).anInt254) * i_251_ + (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_253_])).anInt252) * i_252_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_253_])).anInt254 = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_253_])).anInt254) * i_252_ - (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_253_])).anInt252) * i_251_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_253_])).anInt252 = i_254_;
						}
					}
					if (((Class387_Sub3) this).aClass25Array8197 != null) {
						for (int i_255_ = 0; i_255_ < ((Class387_Sub3) this).anInt8184; i_255_++) {
							if ((((Class387_Sub3) this).aClass25Array8197[i_255_]) != null) {
								int i_256_ = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_255_])).anInt308 * i_251_ + (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_255_])).anInt306 * i_252_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_255_])).anInt308 = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_255_])).anInt308 * i_252_ - (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_255_])).anInt306 * i_251_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_255_])).anInt306 = i_256_;
							}
						}
					}
					for (int i_257_ = ((Class387_Sub3) this).anInt8185; i_257_ < ((Class387_Sub3) this).anInt8174; i_257_++) {
						int i_258_ = ((((Class387_Sub3) this).anIntArray8180[i_257_] * i_251_) + (((Class387_Sub3) this).anIntArray8238[i_257_] * i_252_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_257_] = ((((Class387_Sub3) this).anIntArray8180[i_257_] * i_252_) - (((Class387_Sub3) this).anIntArray8238[i_257_] * i_251_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_257_] = i_258_;
					}
					((Class387_Sub3) this).anInt8196 = 0;
					((Class387_Sub3) this).aBoolean8187 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void KA(int i) {
		do {
			if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
				synchronized (this) {
					if ((((Class387_Sub3) this).anInt8172 & 0x10000) == 65536 && (i & 0x10000) == 0)
						method4532(true);
					((Class387_Sub3) this).anInt8172 = i;
					break;
				}
			}
			if ((((Class387_Sub3) this).anInt8172 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method4532(true);
			((Class387_Sub3) this).anInt8172 = i;
		} while (false);
	}

	void method4537() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8174; i++) {
				((Class387_Sub3) this).anIntArray8238[i] = -((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8180[i] = -((Class387_Sub3) this).anIntArray8180[i];
			}
			method4540();
		}
	}

	void method4538() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8174; i++) {
				int i_259_ = ((Class387_Sub3) this).anIntArray8180[i];
				((Class387_Sub3) this).anIntArray8180[i] = ((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8238[i] = -i_259_;
			}
			method4540();
		}
	}

	public Class64[] method4485() {
		return ((Class387_Sub3) this).aClass64Array8160;
	}

	void method4539() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++) {
				((Class387_Sub3) this).anIntArray8238[i] = -((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8180[i] = -((Class387_Sub3) this).anIntArray8180[i];
				if (((Class387_Sub3) this).aClass21Array8182[i] != null) {
					((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt252 = -((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt252;
					((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt254 = -((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt254;
				}
			}
			if (((Class387_Sub3) this).aClass25Array8197 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (((Class387_Sub3) this).aClass25Array8197[i] != null) {
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt306 = -((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt306;
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt308 = -((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt308;
					}
				}
			}
			for (int i = ((Class387_Sub3) this).anInt8185; i < ((Class387_Sub3) this).anInt8174; i++) {
				((Class387_Sub3) this).anIntArray8238[i] = -((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8180[i] = -((Class387_Sub3) this).anIntArray8180[i];
			}
			((Class387_Sub3) this).anInt8196 = 0;
			((Class387_Sub3) this).aBoolean8187 = false;
		}
	}

	void e(int i, int[] is, int i_260_, int i_261_, int i_262_, boolean bool, int i_263_, int[] is_264_) {
		int i_265_ = is.length;
		if (i == 0) {
			i_260_ <<= 4;
			i_261_ <<= 4;
			i_262_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_266_ = 0; i_266_ < ((Class387_Sub3) this).anInt8174; i_266_++) {
					((Class387_Sub3) this).anIntArray8238[i_266_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_266_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_266_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_267_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_268_ = 0; i_268_ < i_265_; i_268_++) {
				int i_269_ = is[i_268_];
				if (i_269_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_270_ = ((Class387_Sub3) this).anIntArrayArray8205[i_269_];
					for (int i_271_ = 0; i_271_ < is_270_.length; i_271_++) {
						int i_272_ = is_270_[i_271_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_263_ & (((Class387_Sub3) this).aShortArray8242[i_272_])) != 0) {
							((Class387_Sub3) this).anInt8209 += (((Class387_Sub3) this).anIntArray8238[i_272_]);
							((Class387_Sub3) this).anInt8219 += (((Class387_Sub3) this).anIntArray8195[i_272_]);
							((Class387_Sub3) this).anInt8221 += (((Class387_Sub3) this).anIntArray8180[i_272_]);
							i_267_++;
						}
					}
				}
			}
			if (i_267_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_267_ + i_260_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_267_ + i_261_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_267_ + i_262_;
				((Class387_Sub3) this).aBoolean8212 = true;
			} else {
				((Class387_Sub3) this).anInt8209 = i_260_;
				((Class387_Sub3) this).anInt8219 = i_261_;
				((Class387_Sub3) this).anInt8221 = i_262_;
			}
		} else if (i == 1) {
			if (is_264_ != null) {
				int i_273_ = ((is_264_[0] * i_260_ + is_264_[1] * i_261_ + is_264_[2] * i_262_ + 8192) >> 14);
				int i_274_ = ((is_264_[3] * i_260_ + is_264_[4] * i_261_ + is_264_[5] * i_262_ + 8192) >> 14);
				int i_275_ = ((is_264_[6] * i_260_ + is_264_[7] * i_261_ + is_264_[8] * i_262_ + 8192) >> 14);
				i_260_ = i_273_;
				i_261_ = i_274_;
				i_262_ = i_275_;
			}
			i_260_ <<= 4;
			i_261_ <<= 4;
			i_262_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_276_ = 0; i_276_ < ((Class387_Sub3) this).anInt8174; i_276_++) {
					((Class387_Sub3) this).anIntArray8238[i_276_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_276_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_276_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_277_ = 0; i_277_ < i_265_; i_277_++) {
				int i_278_ = is[i_277_];
				if (i_278_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_279_ = ((Class387_Sub3) this).anIntArrayArray8205[i_278_];
					for (int i_280_ = 0; i_280_ < is_279_.length; i_280_++) {
						int i_281_ = is_279_[i_280_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_263_ & (((Class387_Sub3) this).aShortArray8242[i_281_])) != 0) {
							((Class387_Sub3) this).anIntArray8238[i_281_] += i_260_;
							((Class387_Sub3) this).anIntArray8195[i_281_] += i_261_;
							((Class387_Sub3) this).anIntArray8180[i_281_] += i_262_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_264_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_282_ = 0; i_282_ < ((Class387_Sub3) this).anInt8174; i_282_++) {
						((Class387_Sub3) this).anIntArray8238[i_282_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_282_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_282_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_283_ = is_264_[9] << 4;
				int i_284_ = is_264_[10] << 4;
				int i_285_ = is_264_[11] << 4;
				int i_286_ = is_264_[12] << 4;
				int i_287_ = is_264_[13] << 4;
				int i_288_ = is_264_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_289_ = ((is_264_[0] * ((Class387_Sub3) this).anInt8209 + is_264_[3] * ((Class387_Sub3) this).anInt8219 + is_264_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_290_ = ((is_264_[1] * ((Class387_Sub3) this).anInt8209 + is_264_[4] * ((Class387_Sub3) this).anInt8219 + is_264_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_291_ = ((is_264_[2] * ((Class387_Sub3) this).anInt8209 + is_264_[5] * ((Class387_Sub3) this).anInt8219 + is_264_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_289_ += i_286_;
					i_290_ += i_287_;
					i_291_ += i_288_;
					((Class387_Sub3) this).anInt8209 = i_289_;
					((Class387_Sub3) this).anInt8219 = i_290_;
					((Class387_Sub3) this).anInt8221 = i_291_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int[] is_292_ = new int[9];
				int i_293_ = Class257.anIntArray2684[i_260_];
				int i_294_ = Class257.anIntArray2683[i_260_];
				int i_295_ = Class257.anIntArray2684[i_261_];
				int i_296_ = Class257.anIntArray2683[i_261_];
				int i_297_ = Class257.anIntArray2684[i_262_];
				int i_298_ = Class257.anIntArray2683[i_262_];
				int i_299_ = i_294_ * i_297_ + 8192 >> 14;
				int i_300_ = i_294_ * i_298_ + 8192 >> 14;
				is_292_[0] = i_295_ * i_297_ + i_296_ * i_300_ + 8192 >> 14;
				is_292_[1] = -i_295_ * i_298_ + i_296_ * i_299_ + 8192 >> 14;
				is_292_[2] = i_296_ * i_293_ + 8192 >> 14;
				is_292_[3] = i_293_ * i_298_ + 8192 >> 14;
				is_292_[4] = i_293_ * i_297_ + 8192 >> 14;
				is_292_[5] = -i_294_;
				is_292_[6] = -i_296_ * i_297_ + i_295_ * i_300_ + 8192 >> 14;
				is_292_[7] = i_296_ * i_298_ + i_295_ * i_299_ + 8192 >> 14;
				is_292_[8] = i_295_ * i_293_ + 8192 >> 14;
				int i_301_ = ((is_292_[0] * -((Class387_Sub3) this).anInt8209 + is_292_[1] * -((Class387_Sub3) this).anInt8219 + is_292_[2] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_302_ = ((is_292_[3] * -((Class387_Sub3) this).anInt8209 + is_292_[4] * -((Class387_Sub3) this).anInt8219 + is_292_[5] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_303_ = ((is_292_[6] * -((Class387_Sub3) this).anInt8209 + is_292_[7] * -((Class387_Sub3) this).anInt8219 + is_292_[8] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_304_ = i_301_ + ((Class387_Sub3) this).anInt8209;
				int i_305_ = i_302_ + ((Class387_Sub3) this).anInt8219;
				int i_306_ = i_303_ + ((Class387_Sub3) this).anInt8221;
				int[] is_307_ = new int[9];
				for (int i_308_ = 0; i_308_ < 3; i_308_++) {
					for (int i_309_ = 0; i_309_ < 3; i_309_++) {
						int i_310_ = 0;
						for (int i_311_ = 0; i_311_ < 3; i_311_++)
							i_310_ += (is_292_[i_308_ * 3 + i_311_] * is_264_[i_309_ * 3 + i_311_]);
						is_307_[i_308_ * 3 + i_309_] = i_310_ + 8192 >> 14;
					}
				}
				int i_312_ = ((is_292_[0] * i_286_ + is_292_[1] * i_287_ + is_292_[2] * i_288_ + 8192) >> 14);
				int i_313_ = ((is_292_[3] * i_286_ + is_292_[4] * i_287_ + is_292_[5] * i_288_ + 8192) >> 14);
				int i_314_ = ((is_292_[6] * i_286_ + is_292_[7] * i_287_ + is_292_[8] * i_288_ + 8192) >> 14);
				i_312_ += i_304_;
				i_313_ += i_305_;
				i_314_ += i_306_;
				int[] is_315_ = new int[9];
				for (int i_316_ = 0; i_316_ < 3; i_316_++) {
					for (int i_317_ = 0; i_317_ < 3; i_317_++) {
						int i_318_ = 0;
						for (int i_319_ = 0; i_319_ < 3; i_319_++)
							i_318_ += (is_264_[i_316_ * 3 + i_319_] * is_307_[i_317_ + i_319_ * 3]);
						is_315_[i_316_ * 3 + i_317_] = i_318_ + 8192 >> 14;
					}
				}
				int i_320_ = ((is_264_[0] * i_312_ + is_264_[1] * i_313_ + is_264_[2] * i_314_ + 8192) >> 14);
				int i_321_ = ((is_264_[3] * i_312_ + is_264_[4] * i_313_ + is_264_[5] * i_314_ + 8192) >> 14);
				int i_322_ = ((is_264_[6] * i_312_ + is_264_[7] * i_313_ + is_264_[8] * i_314_ + 8192) >> 14);
				i_320_ += i_283_;
				i_321_ += i_284_;
				i_322_ += i_285_;
				for (int i_323_ = 0; i_323_ < i_265_; i_323_++) {
					int i_324_ = is[i_323_];
					if (i_324_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_325_ = (((Class387_Sub3) this).anIntArrayArray8205[i_324_]);
						for (int i_326_ = 0; i_326_ < is_325_.length; i_326_++) {
							int i_327_ = is_325_[i_326_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_263_ & (((Class387_Sub3) this).aShortArray8242[i_327_])) != 0)) {
								int i_328_ = (is_315_[0] * (((Class387_Sub3) this).anIntArray8238[i_327_]) + is_315_[1] * (((Class387_Sub3) this).anIntArray8195[i_327_]) + is_315_[2] * (((Class387_Sub3) this).anIntArray8180[i_327_]) + 8192) >> 14;
								int i_329_ = (is_315_[3] * (((Class387_Sub3) this).anIntArray8238[i_327_]) + is_315_[4] * (((Class387_Sub3) this).anIntArray8195[i_327_]) + is_315_[5] * (((Class387_Sub3) this).anIntArray8180[i_327_]) + 8192) >> 14;
								int i_330_ = (is_315_[6] * (((Class387_Sub3) this).anIntArray8238[i_327_]) + is_315_[7] * (((Class387_Sub3) this).anIntArray8195[i_327_]) + is_315_[8] * (((Class387_Sub3) this).anIntArray8180[i_327_]) + 8192) >> 14;
								i_328_ += i_320_;
								i_329_ += i_321_;
								i_330_ += i_322_;
								((Class387_Sub3) this).anIntArray8238[i_327_] = i_328_;
								((Class387_Sub3) this).anIntArray8195[i_327_] = i_329_;
								((Class387_Sub3) this).anIntArray8180[i_327_] = i_330_;
							}
						}
					}
				}
			} else {
				for (int i_331_ = 0; i_331_ < i_265_; i_331_++) {
					int i_332_ = is[i_331_];
					if (i_332_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_333_ = (((Class387_Sub3) this).anIntArrayArray8205[i_332_]);
						for (int i_334_ = 0; i_334_ < is_333_.length; i_334_++) {
							int i_335_ = is_333_[i_334_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_263_ & (((Class387_Sub3) this).aShortArray8242[i_335_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_335_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_335_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_335_] -= ((Class387_Sub3) this).anInt8221;
								if (i_262_ != 0) {
									int i_336_ = Class257.anIntArray2683[i_262_];
									int i_337_ = Class257.anIntArray2684[i_262_];
									int i_338_ = ((((Class387_Sub3) this).anIntArray8195[i_335_]) * i_336_ + (((Class387_Sub3) this).anIntArray8238[i_335_]) * i_337_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_335_] = ((((Class387_Sub3) this).anIntArray8195[i_335_]) * i_337_ - (((Class387_Sub3) this).anIntArray8238[i_335_]) * i_336_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_335_] = i_338_;
								}
								if (i_260_ != 0) {
									int i_339_ = Class257.anIntArray2683[i_260_];
									int i_340_ = Class257.anIntArray2684[i_260_];
									int i_341_ = ((((Class387_Sub3) this).anIntArray8195[i_335_]) * i_340_ - (((Class387_Sub3) this).anIntArray8180[i_335_]) * i_339_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_335_] = ((((Class387_Sub3) this).anIntArray8195[i_335_]) * i_339_ + (((Class387_Sub3) this).anIntArray8180[i_335_]) * i_340_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_335_] = i_341_;
								}
								if (i_261_ != 0) {
									int i_342_ = Class257.anIntArray2683[i_261_];
									int i_343_ = Class257.anIntArray2684[i_261_];
									int i_344_ = ((((Class387_Sub3) this).anIntArray8180[i_335_]) * i_342_ + (((Class387_Sub3) this).anIntArray8238[i_335_]) * i_343_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_335_] = ((((Class387_Sub3) this).anIntArray8180[i_335_]) * i_343_ - (((Class387_Sub3) this).anIntArray8238[i_335_]) * i_342_ + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_335_] = i_344_;
								}
								((Class387_Sub3) this).anIntArray8238[i_335_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_335_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_335_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_264_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_345_ = 0; i_345_ < ((Class387_Sub3) this).anInt8174; i_345_++) {
						((Class387_Sub3) this).anIntArray8238[i_345_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_345_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_345_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_346_ = is_264_[9] << 4;
				int i_347_ = is_264_[10] << 4;
				int i_348_ = is_264_[11] << 4;
				int i_349_ = is_264_[12] << 4;
				int i_350_ = is_264_[13] << 4;
				int i_351_ = is_264_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_352_ = ((is_264_[0] * ((Class387_Sub3) this).anInt8209 + is_264_[3] * ((Class387_Sub3) this).anInt8219 + is_264_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_353_ = ((is_264_[1] * ((Class387_Sub3) this).anInt8209 + is_264_[4] * ((Class387_Sub3) this).anInt8219 + is_264_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_354_ = ((is_264_[2] * ((Class387_Sub3) this).anInt8209 + is_264_[5] * ((Class387_Sub3) this).anInt8219 + is_264_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_352_ += i_349_;
					i_353_ += i_350_;
					i_354_ += i_351_;
					((Class387_Sub3) this).anInt8209 = i_352_;
					((Class387_Sub3) this).anInt8219 = i_353_;
					((Class387_Sub3) this).anInt8221 = i_354_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int i_355_ = i_260_ << 15 >> 7;
				int i_356_ = i_261_ << 15 >> 7;
				int i_357_ = i_262_ << 15 >> 7;
				int i_358_ = i_355_ * -((Class387_Sub3) this).anInt8209 + 8192 >> 14;
				int i_359_ = i_356_ * -((Class387_Sub3) this).anInt8219 + 8192 >> 14;
				int i_360_ = i_357_ * -((Class387_Sub3) this).anInt8221 + 8192 >> 14;
				int i_361_ = i_358_ + ((Class387_Sub3) this).anInt8209;
				int i_362_ = i_359_ + ((Class387_Sub3) this).anInt8219;
				int i_363_ = i_360_ + ((Class387_Sub3) this).anInt8221;
				int[] is_364_ = new int[9];
				is_364_[0] = i_355_ * is_264_[0] + 8192 >> 14;
				is_364_[1] = i_355_ * is_264_[3] + 8192 >> 14;
				is_364_[2] = i_355_ * is_264_[6] + 8192 >> 14;
				is_364_[3] = i_356_ * is_264_[1] + 8192 >> 14;
				is_364_[4] = i_356_ * is_264_[4] + 8192 >> 14;
				is_364_[5] = i_356_ * is_264_[7] + 8192 >> 14;
				is_364_[6] = i_357_ * is_264_[2] + 8192 >> 14;
				is_364_[7] = i_357_ * is_264_[5] + 8192 >> 14;
				is_364_[8] = i_357_ * is_264_[8] + 8192 >> 14;
				int i_365_ = i_355_ * i_349_ + 8192 >> 14;
				int i_366_ = i_356_ * i_350_ + 8192 >> 14;
				int i_367_ = i_357_ * i_351_ + 8192 >> 14;
				i_365_ += i_361_;
				i_366_ += i_362_;
				i_367_ += i_363_;
				int[] is_368_ = new int[9];
				for (int i_369_ = 0; i_369_ < 3; i_369_++) {
					for (int i_370_ = 0; i_370_ < 3; i_370_++) {
						int i_371_ = 0;
						for (int i_372_ = 0; i_372_ < 3; i_372_++)
							i_371_ += (is_264_[i_369_ * 3 + i_372_] * is_364_[i_370_ + i_372_ * 3]);
						is_368_[i_369_ * 3 + i_370_] = i_371_ + 8192 >> 14;
					}
				}
				int i_373_ = ((is_264_[0] * i_365_ + is_264_[1] * i_366_ + is_264_[2] * i_367_ + 8192) >> 14);
				int i_374_ = ((is_264_[3] * i_365_ + is_264_[4] * i_366_ + is_264_[5] * i_367_ + 8192) >> 14);
				int i_375_ = ((is_264_[6] * i_365_ + is_264_[7] * i_366_ + is_264_[8] * i_367_ + 8192) >> 14);
				i_373_ += i_346_;
				i_374_ += i_347_;
				i_375_ += i_348_;
				for (int i_376_ = 0; i_376_ < i_265_; i_376_++) {
					int i_377_ = is[i_376_];
					if (i_377_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_378_ = (((Class387_Sub3) this).anIntArrayArray8205[i_377_]);
						for (int i_379_ = 0; i_379_ < is_378_.length; i_379_++) {
							int i_380_ = is_378_[i_379_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_263_ & (((Class387_Sub3) this).aShortArray8242[i_380_])) != 0)) {
								int i_381_ = (is_368_[0] * (((Class387_Sub3) this).anIntArray8238[i_380_]) + is_368_[1] * (((Class387_Sub3) this).anIntArray8195[i_380_]) + is_368_[2] * (((Class387_Sub3) this).anIntArray8180[i_380_]) + 8192) >> 14;
								int i_382_ = (is_368_[3] * (((Class387_Sub3) this).anIntArray8238[i_380_]) + is_368_[4] * (((Class387_Sub3) this).anIntArray8195[i_380_]) + is_368_[5] * (((Class387_Sub3) this).anIntArray8180[i_380_]) + 8192) >> 14;
								int i_383_ = (is_368_[6] * (((Class387_Sub3) this).anIntArray8238[i_380_]) + is_368_[7] * (((Class387_Sub3) this).anIntArray8195[i_380_]) + is_368_[8] * (((Class387_Sub3) this).anIntArray8180[i_380_]) + 8192) >> 14;
								i_381_ += i_373_;
								i_382_ += i_374_;
								i_383_ += i_375_;
								((Class387_Sub3) this).anIntArray8238[i_380_] = i_381_;
								((Class387_Sub3) this).anIntArray8195[i_380_] = i_382_;
								((Class387_Sub3) this).anIntArray8180[i_380_] = i_383_;
							}
						}
					}
				}
			} else {
				for (int i_384_ = 0; i_384_ < i_265_; i_384_++) {
					int i_385_ = is[i_384_];
					if (i_385_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_386_ = (((Class387_Sub3) this).anIntArrayArray8205[i_385_]);
						for (int i_387_ = 0; i_387_ < is_386_.length; i_387_++) {
							int i_388_ = is_386_[i_387_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_263_ & (((Class387_Sub3) this).aShortArray8242[i_388_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_388_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_388_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_388_] -= ((Class387_Sub3) this).anInt8221;
								((Class387_Sub3) this).anIntArray8238[i_388_] = (((Class387_Sub3) this).anIntArray8238[i_388_]) * i_260_ / 128;
								((Class387_Sub3) this).anIntArray8195[i_388_] = (((Class387_Sub3) this).anIntArray8195[i_388_]) * i_261_ / 128;
								((Class387_Sub3) this).anIntArray8180[i_388_] = (((Class387_Sub3) this).anIntArray8180[i_388_]) * i_262_ / 128;
								((Class387_Sub3) this).anIntArray8238[i_388_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_388_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_388_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_389_ = 0; i_389_ < i_265_; i_389_++) {
					int i_390_ = is[i_389_];
					if (i_390_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_391_ = (((Class387_Sub3) this).anIntArrayArray8206[i_390_]);
						for (int i_392_ = 0; i_392_ < is_391_.length; i_392_++) {
							int i_393_ = is_391_[i_392_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_263_ & (((Class387_Sub3) this).aShortArray8181[i_393_])) != 0)) {
								int i_394_ = (((((Class387_Sub3) this).aByteArray8200[i_393_]) & 0xff) + i_260_ * 8);
								if (i_394_ < 0)
									i_394_ = 0;
								else if (i_394_ > 255)
									i_394_ = 255;
								((Class387_Sub3) this).aByteArray8200[i_393_] = (byte) i_394_;
							}
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_395_ = 0; i_395_ < ((Class387_Sub3) this).anInt8215; i_395_++) {
						Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_395_];
						Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_395_];
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_396_ = 0; i_396_ < i_265_; i_396_++) {
					int i_397_ = is[i_396_];
					if (i_397_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_398_ = (((Class387_Sub3) this).anIntArrayArray8206[i_397_]);
						for (int i_399_ = 0; i_399_ < is_398_.length; i_399_++) {
							int i_400_ = is_398_[i_399_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_263_ & (((Class387_Sub3) this).aShortArray8181[i_400_])) != 0)) {
								int i_401_ = ((((Class387_Sub3) this).modelColors[i_400_]) & 0xffff);
								int i_402_ = i_401_ >> 10 & 0x3f;
								int i_403_ = i_401_ >> 7 & 0x7;
								int i_404_ = i_401_ & 0x7f;
								i_402_ = i_402_ + i_260_ & 0x3f;
								i_403_ += i_261_;
								if (i_403_ < 0)
									i_403_ = 0;
								else if (i_403_ > 7)
									i_403_ = 7;
								i_404_ += i_262_;
								if (i_404_ < 0)
									i_404_ = 0;
								else if (i_404_ > 127)
									i_404_ = 127;
								((Class387_Sub3) this).modelColors[i_400_] = (short) (i_402_ << 10 | i_403_ << 7 | i_404_);
							}
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_405_ = 0; i_405_ < ((Class387_Sub3) this).anInt8215; i_405_++) {
						Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_405_];
						Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_405_];
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_406_ = 0; i_406_ < i_265_; i_406_++) {
					int i_407_ = is[i_406_];
					if (i_407_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_408_ = (((Class387_Sub3) this).anIntArrayArray8218[i_407_]);
						for (int i_409_ = 0; i_409_ < is_408_.length; i_409_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_408_[i_409_]]);
							((Class10) class10).anInt159 += i_260_ * 1013441605;
							((Class10) class10).anInt157 += i_261_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_410_ = 0; i_410_ < i_265_; i_410_++) {
					int i_411_ = is[i_410_];
					if (i_411_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_412_ = (((Class387_Sub3) this).anIntArrayArray8218[i_411_]);
						for (int i_413_ = 0; i_413_ < is_412_.length; i_413_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_412_[i_413_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_260_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_261_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_414_ = 0; i_414_ < i_265_; i_414_++) {
					int i_415_ = is[i_414_];
					if (i_415_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_416_ = (((Class387_Sub3) this).anIntArrayArray8218[i_415_]);
						for (int i_417_ = 0; i_417_ < is_416_.length; i_417_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_416_[i_417_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_260_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}

	public void t(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x6) != 6)
			throw new IllegalStateException();
		int i_418_ = Class257.anIntArray2683[i];
		int i_419_ = Class257.anIntArray2684[i];
		synchronized (this) {
			for (int i_420_ = 0; i_420_ < ((Class387_Sub3) this).anInt8174; i_420_++) {
				int i_421_ = ((((Class387_Sub3) this).anIntArray8195[i_420_] * i_419_ - (((Class387_Sub3) this).anIntArray8180[i_420_] * i_418_)) >> 14);
				((Class387_Sub3) this).anIntArray8180[i_420_] = (((Class387_Sub3) this).anIntArray8195[i_420_] * i_418_ + (((Class387_Sub3) this).anIntArray8180[i_420_] * i_419_)) >> 14;
				((Class387_Sub3) this).anIntArray8195[i_420_] = i_421_;
			}
			method4540();
		}
	}

	public void EA(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x3) != 3)
			throw new IllegalStateException();
		int i_422_ = Class257.anIntArray2683[i];
		int i_423_ = Class257.anIntArray2684[i];
		synchronized (this) {
			for (int i_424_ = 0; i_424_ < ((Class387_Sub3) this).anInt8174; i_424_++) {
				int i_425_ = ((((Class387_Sub3) this).anIntArray8195[i_424_] * i_422_ + (((Class387_Sub3) this).anIntArray8238[i_424_] * i_423_)) >> 14);
				((Class387_Sub3) this).anIntArray8195[i_424_] = (((Class387_Sub3) this).anIntArray8195[i_424_] * i_423_ - (((Class387_Sub3) this).anIntArray8238[i_424_] * i_422_)) >> 14;
				((Class387_Sub3) this).anIntArray8238[i_424_] = i_425_;
			}
			method4540();
		}
	}

	public void cv(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8236 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	public void oa(int i, int i_426_, int i_427_) {
		if (i != 128 && (((Class387_Sub3) this).anInt8172 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_426_ != 128 && (((Class387_Sub3) this).anInt8172 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_427_ != 128 && (((Class387_Sub3) this).anInt8172 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_428_ = 0; i_428_ < ((Class387_Sub3) this).anInt8174; i_428_++) {
				((Class387_Sub3) this).anIntArray8238[i_428_] = ((Class387_Sub3) this).anIntArray8238[i_428_] * i >> 7;
				((Class387_Sub3) this).anIntArray8195[i_428_] = (((Class387_Sub3) this).anIntArray8195[i_428_] * i_426_ >> 7);
				((Class387_Sub3) this).anIntArray8180[i_428_] = (((Class387_Sub3) this).anIntArray8180[i_428_] * i_427_ >> 7);
			}
			((Class387_Sub3) this).aBoolean8187 = false;
		}
	}

	public boolean el() {
		return ((Class387_Sub3) this).aBoolean8228;
	}

	void method4540() {
		((Class387_Sub3) this).aClass21Array8182 = null;
		((Class387_Sub3) this).aClass21Array8183 = null;
		((Class387_Sub3) this).aClass25Array8197 = null;
		((Class387_Sub3) this).aBoolean8187 = false;
	}

	public Class387 method4446(byte i, int i_429_, boolean bool) {
		method4530(Thread.currentThread());
		boolean bool_430_ = false;
		Class387_Sub3 class387_sub3_431_;
		Class387_Sub3 class387_sub3_432_;
		if (i > 0 && i <= 7) {
			class387_sub3_432_ = ((Class387_Sub3) this).aClass387_Sub3Array8243[i - 1];
			class387_sub3_431_ = ((Class387_Sub3) this).aClass387_Sub3Array8170[i - 1];
			bool_430_ = true;
		} else
			class387_sub3_431_ = class387_sub3_432_ = new Class387_Sub3(((Class387_Sub3) this).aClass_ra_Sub3_8165);
		return method4536(class387_sub3_431_, class387_sub3_432_, i_429_, bool_430_, bool);
	}

	void method4448() {
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
			synchronized (this) {
				aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	boolean ea() {
		if (((Class387_Sub3) this).anIntArrayArray8205 == null)
			return false;
		((Class387_Sub3) this).anInt8209 = 0;
		((Class387_Sub3) this).anInt8219 = 0;
		((Class387_Sub3) this).anInt8221 = 0;
		return true;
	}

	void ka() {
		if (((Class387_Sub3) this).aBoolean8208) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8174; i++) {
				((Class387_Sub3) this).anIntArray8238[i] = ((Class387_Sub3) this).anIntArray8238[i] + 7 >> 4;
				((Class387_Sub3) this).anIntArray8195[i] = ((Class387_Sub3) this).anIntArray8195[i] + 7 >> 4;
				((Class387_Sub3) this).anIntArray8180[i] = ((Class387_Sub3) this).anIntArray8180[i] + 7 >> 4;
			}
			((Class387_Sub3) this).aBoolean8208 = false;
		}
		if (((Class387_Sub3) this).aBoolean8207) {
			method4553();
			((Class387_Sub3) this).aBoolean8207 = false;
		}
		((Class387_Sub3) this).aBoolean8187 = false;
	}

	void method4470(int i, int[] is, int i_433_, int i_434_, int i_435_, int i_436_, boolean bool) {
		int i_437_ = is.length;
		if (i == 0) {
			i_433_ <<= 4;
			i_434_ <<= 4;
			i_435_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_438_ = 0; i_438_ < ((Class387_Sub3) this).anInt8174; i_438_++) {
					((Class387_Sub3) this).anIntArray8238[i_438_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_438_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_438_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_439_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_440_ = 0; i_440_ < i_437_; i_440_++) {
				int i_441_ = is[i_440_];
				if (i_441_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_442_ = ((Class387_Sub3) this).anIntArrayArray8205[i_441_];
					for (int i_443_ = 0; i_443_ < is_442_.length; i_443_++) {
						int i_444_ = is_442_[i_443_];
						((Class387_Sub3) this).anInt8209 += ((Class387_Sub3) this).anIntArray8238[i_444_];
						((Class387_Sub3) this).anInt8219 += ((Class387_Sub3) this).anIntArray8195[i_444_];
						((Class387_Sub3) this).anInt8221 += ((Class387_Sub3) this).anIntArray8180[i_444_];
						i_439_++;
					}
				}
			}
			if (i_439_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_439_ + i_433_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_439_ + i_434_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_439_ + i_435_;
			} else {
				((Class387_Sub3) this).anInt8209 = i_433_;
				((Class387_Sub3) this).anInt8219 = i_434_;
				((Class387_Sub3) this).anInt8221 = i_435_;
			}
		} else if (i == 1) {
			i_433_ <<= 4;
			i_434_ <<= 4;
			i_435_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_445_ = 0; i_445_ < ((Class387_Sub3) this).anInt8174; i_445_++) {
					((Class387_Sub3) this).anIntArray8238[i_445_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_445_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_445_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_446_ = 0; i_446_ < i_437_; i_446_++) {
				int i_447_ = is[i_446_];
				if (i_447_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_448_ = ((Class387_Sub3) this).anIntArrayArray8205[i_447_];
					for (int i_449_ = 0; i_449_ < is_448_.length; i_449_++) {
						int i_450_ = is_448_[i_449_];
						((Class387_Sub3) this).anIntArray8238[i_450_] += i_433_;
						((Class387_Sub3) this).anIntArray8195[i_450_] += i_434_;
						((Class387_Sub3) this).anIntArray8180[i_450_] += i_435_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_451_ = 0; i_451_ < i_437_; i_451_++) {
				int i_452_ = is[i_451_];
				if (i_452_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_453_ = ((Class387_Sub3) this).anIntArrayArray8205[i_452_];
					if ((i_436_ & 0x1) == 0) {
						for (int i_454_ = 0; i_454_ < is_453_.length; i_454_++) {
							int i_455_ = is_453_[i_454_];
							((Class387_Sub3) this).anIntArray8238[i_455_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_455_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_455_] -= ((Class387_Sub3) this).anInt8221;
							if (i_435_ != 0) {
								int i_456_ = Class257.anIntArray2683[i_435_];
								int i_457_ = Class257.anIntArray2684[i_435_];
								int i_458_ = (((((Class387_Sub3) this).anIntArray8195[i_455_]) * i_456_ + (((Class387_Sub3) this).anIntArray8238[i_455_]) * i_457_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8195[i_455_] = ((((Class387_Sub3) this).anIntArray8195[i_455_]) * i_457_ - (((Class387_Sub3) this).anIntArray8238[i_455_]) * i_456_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_455_] = i_458_;
							}
							if (i_433_ != 0) {
								int i_459_ = Class257.anIntArray2683[i_433_];
								int i_460_ = Class257.anIntArray2684[i_433_];
								int i_461_ = (((((Class387_Sub3) this).anIntArray8195[i_455_]) * i_460_ - (((Class387_Sub3) this).anIntArray8180[i_455_]) * i_459_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_455_] = ((((Class387_Sub3) this).anIntArray8195[i_455_]) * i_459_ + (((Class387_Sub3) this).anIntArray8180[i_455_]) * i_460_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_455_] = i_461_;
							}
							if (i_434_ != 0) {
								int i_462_ = Class257.anIntArray2683[i_434_];
								int i_463_ = Class257.anIntArray2684[i_434_];
								int i_464_ = (((((Class387_Sub3) this).anIntArray8180[i_455_]) * i_462_ + (((Class387_Sub3) this).anIntArray8238[i_455_]) * i_463_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_455_] = ((((Class387_Sub3) this).anIntArray8180[i_455_]) * i_463_ - (((Class387_Sub3) this).anIntArray8238[i_455_]) * i_462_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_455_] = i_464_;
							}
							((Class387_Sub3) this).anIntArray8238[i_455_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_455_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_455_] += ((Class387_Sub3) this).anInt8221;
						}
					} else {
						for (int i_465_ = 0; i_465_ < is_453_.length; i_465_++) {
							int i_466_ = is_453_[i_465_];
							((Class387_Sub3) this).anIntArray8238[i_466_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_466_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_466_] -= ((Class387_Sub3) this).anInt8221;
							if (i_433_ != 0) {
								int i_467_ = Class257.anIntArray2683[i_433_];
								int i_468_ = Class257.anIntArray2684[i_433_];
								int i_469_ = (((((Class387_Sub3) this).anIntArray8195[i_466_]) * i_468_ - (((Class387_Sub3) this).anIntArray8180[i_466_]) * i_467_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_466_] = ((((Class387_Sub3) this).anIntArray8195[i_466_]) * i_467_ + (((Class387_Sub3) this).anIntArray8180[i_466_]) * i_468_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_466_] = i_469_;
							}
							if (i_435_ != 0) {
								int i_470_ = Class257.anIntArray2683[i_435_];
								int i_471_ = Class257.anIntArray2684[i_435_];
								int i_472_ = (((((Class387_Sub3) this).anIntArray8195[i_466_]) * i_470_ + (((Class387_Sub3) this).anIntArray8238[i_466_]) * i_471_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8195[i_466_] = ((((Class387_Sub3) this).anIntArray8195[i_466_]) * i_471_ - (((Class387_Sub3) this).anIntArray8238[i_466_]) * i_470_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_466_] = i_472_;
							}
							if (i_434_ != 0) {
								int i_473_ = Class257.anIntArray2683[i_434_];
								int i_474_ = Class257.anIntArray2684[i_434_];
								int i_475_ = (((((Class387_Sub3) this).anIntArray8180[i_466_]) * i_473_ + (((Class387_Sub3) this).anIntArray8238[i_466_]) * i_474_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_466_] = ((((Class387_Sub3) this).anIntArray8180[i_466_]) * i_474_ - (((Class387_Sub3) this).anIntArray8238[i_466_]) * i_473_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_466_] = i_475_;
							}
							((Class387_Sub3) this).anIntArray8238[i_466_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_466_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_466_] += ((Class387_Sub3) this).anInt8221;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_476_ = 0; i_476_ < i_437_; i_476_++) {
				int i_477_ = is[i_476_];
				if (i_477_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_478_ = ((Class387_Sub3) this).anIntArrayArray8205[i_477_];
					for (int i_479_ = 0; i_479_ < is_478_.length; i_479_++) {
						int i_480_ = is_478_[i_479_];
						((Class387_Sub3) this).anIntArray8238[i_480_] -= ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_480_] -= ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_480_] -= ((Class387_Sub3) this).anInt8221;
						((Class387_Sub3) this).anIntArray8238[i_480_] = (((Class387_Sub3) this).anIntArray8238[i_480_] * i_433_ / 128);
						((Class387_Sub3) this).anIntArray8195[i_480_] = (((Class387_Sub3) this).anIntArray8195[i_480_] * i_434_ / 128);
						((Class387_Sub3) this).anIntArray8180[i_480_] = (((Class387_Sub3) this).anIntArray8180[i_480_] * i_435_ / 128);
						((Class387_Sub3) this).anIntArray8238[i_480_] += ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_480_] += ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_480_] += ((Class387_Sub3) this).anInt8221;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_481_ = 0; i_481_ < i_437_; i_481_++) {
					int i_482_ = is[i_481_];
					if (i_482_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_483_ = (((Class387_Sub3) this).anIntArrayArray8206[i_482_]);
						for (int i_484_ = 0; i_484_ < is_483_.length; i_484_++) {
							int i_485_ = is_483_[i_484_];
							int i_486_ = (((((Class387_Sub3) this).aByteArray8200[i_485_]) & 0xff) + i_433_ * 8);
							if (i_486_ < 0)
								i_486_ = 0;
							else if (i_486_ > 255)
								i_486_ = 255;
							((Class387_Sub3) this).aByteArray8200[i_485_] = (byte) i_486_;
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_487_ = 0; i_487_ < ((Class387_Sub3) this).anInt8215; i_487_++) {
						Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_487_];
						Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_487_];
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_488_ = 0; i_488_ < i_437_; i_488_++) {
					int i_489_ = is[i_488_];
					if (i_489_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_490_ = (((Class387_Sub3) this).anIntArrayArray8206[i_489_]);
						for (int i_491_ = 0; i_491_ < is_490_.length; i_491_++) {
							int i_492_ = is_490_[i_491_];
							int i_493_ = ((((Class387_Sub3) this).modelColors[i_492_]) & 0xffff);
							int i_494_ = i_493_ >> 10 & 0x3f;
							int i_495_ = i_493_ >> 7 & 0x7;
							int i_496_ = i_493_ & 0x7f;
							i_494_ = i_494_ + i_433_ & 0x3f;
							i_495_ += i_434_;
							if (i_495_ < 0)
								i_495_ = 0;
							else if (i_495_ > 7)
								i_495_ = 7;
							i_496_ += i_435_;
							if (i_496_ < 0)
								i_496_ = 0;
							else if (i_496_ > 127)
								i_496_ = 127;
							((Class387_Sub3) this).modelColors[i_492_] = (short) (i_494_ << 10 | i_495_ << 7 | i_496_);
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_497_ = 0; i_497_ < ((Class387_Sub3) this).anInt8215; i_497_++) {
						Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_497_];
						Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_497_];
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_498_ = 0; i_498_ < i_437_; i_498_++) {
					int i_499_ = is[i_498_];
					if (i_499_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_500_ = (((Class387_Sub3) this).anIntArrayArray8218[i_499_]);
						for (int i_501_ = 0; i_501_ < is_500_.length; i_501_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_500_[i_501_]]);
							((Class10) class10).anInt159 += i_433_ * 1013441605;
							((Class10) class10).anInt157 += i_434_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_502_ = 0; i_502_ < i_437_; i_502_++) {
					int i_503_ = is[i_502_];
					if (i_503_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_504_ = (((Class387_Sub3) this).anIntArrayArray8218[i_503_]);
						for (int i_505_ = 0; i_505_ < is_504_.length; i_505_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_504_[i_505_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_433_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_434_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_506_ = 0; i_506_ < i_437_; i_506_++) {
					int i_507_ = is[i_506_];
					if (i_507_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_508_ = (((Class387_Sub3) this).anIntArrayArray8218[i_507_]);
						for (int i_509_ = 0; i_509_ < is_508_.length; i_509_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_508_[i_509_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_433_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}

	public Class93[] method4483() {
		return ((Class387_Sub3) this).aClass93Array8213;
	}

	void w(int i, int i_510_, int i_511_, int i_512_) {
		if (i == 0) {
			int i_513_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_514_ = 0; i_514_ < ((Class387_Sub3) this).anInt8174; i_514_++) {
				((Class387_Sub3) this).anInt8209 += ((Class387_Sub3) this).anIntArray8238[i_514_];
				((Class387_Sub3) this).anInt8219 += ((Class387_Sub3) this).anIntArray8195[i_514_];
				((Class387_Sub3) this).anInt8221 += ((Class387_Sub3) this).anIntArray8180[i_514_];
				i_513_++;
			}
			if (i_513_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_513_ + i_510_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_513_ + i_511_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_513_ + i_512_;
			} else {
				((Class387_Sub3) this).anInt8209 = i_510_;
				((Class387_Sub3) this).anInt8219 = i_511_;
				((Class387_Sub3) this).anInt8221 = i_512_;
			}
		} else if (i == 1) {
			for (int i_515_ = 0; i_515_ < ((Class387_Sub3) this).anInt8174; i_515_++) {
				((Class387_Sub3) this).anIntArray8238[i_515_] += i_510_;
				((Class387_Sub3) this).anIntArray8195[i_515_] += i_511_;
				((Class387_Sub3) this).anIntArray8180[i_515_] += i_512_;
			}
		} else if (i == 2) {
			for (int i_516_ = 0; i_516_ < ((Class387_Sub3) this).anInt8174; i_516_++) {
				((Class387_Sub3) this).anIntArray8238[i_516_] -= ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_516_] -= ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_516_] -= ((Class387_Sub3) this).anInt8221;
				if (i_512_ != 0) {
					int i_517_ = Class257.anIntArray2683[i_512_];
					int i_518_ = Class257.anIntArray2684[i_512_];
					int i_519_ = (((((Class387_Sub3) this).anIntArray8195[i_516_] * i_517_) + (((Class387_Sub3) this).anIntArray8238[i_516_] * i_518_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray8195[i_516_] = ((((Class387_Sub3) this).anIntArray8195[i_516_] * i_518_) - (((Class387_Sub3) this).anIntArray8238[i_516_] * i_517_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray8238[i_516_] = i_519_;
				}
				if (i_510_ != 0) {
					int i_520_ = Class257.anIntArray2683[i_510_];
					int i_521_ = Class257.anIntArray2684[i_510_];
					int i_522_ = (((((Class387_Sub3) this).anIntArray8195[i_516_] * i_521_) - (((Class387_Sub3) this).anIntArray8180[i_516_] * i_520_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray8180[i_516_] = ((((Class387_Sub3) this).anIntArray8195[i_516_] * i_520_) + (((Class387_Sub3) this).anIntArray8180[i_516_] * i_521_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray8195[i_516_] = i_522_;
				}
				if (i_511_ != 0) {
					int i_523_ = Class257.anIntArray2683[i_511_];
					int i_524_ = Class257.anIntArray2684[i_511_];
					int i_525_ = (((((Class387_Sub3) this).anIntArray8180[i_516_] * i_523_) + (((Class387_Sub3) this).anIntArray8238[i_516_] * i_524_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray8180[i_516_] = ((((Class387_Sub3) this).anIntArray8180[i_516_] * i_524_) - (((Class387_Sub3) this).anIntArray8238[i_516_] * i_523_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray8238[i_516_] = i_525_;
				}
				((Class387_Sub3) this).anIntArray8238[i_516_] += ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_516_] += ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_516_] += ((Class387_Sub3) this).anInt8221;
			}
		} else if (i == 3) {
			for (int i_526_ = 0; i_526_ < ((Class387_Sub3) this).anInt8174; i_526_++) {
				((Class387_Sub3) this).anIntArray8238[i_526_] -= ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_526_] -= ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_526_] -= ((Class387_Sub3) this).anInt8221;
				((Class387_Sub3) this).anIntArray8238[i_526_] = (((Class387_Sub3) this).anIntArray8238[i_526_] * i_510_ / 128);
				((Class387_Sub3) this).anIntArray8195[i_526_] = (((Class387_Sub3) this).anIntArray8195[i_526_] * i_511_ / 128);
				((Class387_Sub3) this).anIntArray8180[i_526_] = (((Class387_Sub3) this).anIntArray8180[i_526_] * i_512_ / 128);
				((Class387_Sub3) this).anIntArray8238[i_526_] += ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_526_] += ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_526_] += ((Class387_Sub3) this).anInt8221;
			}
		} else if (i == 5) {
			for (int i_527_ = 0; i_527_ < ((Class387_Sub3) this).anInt8184; i_527_++) {
				int i_528_ = ((((Class387_Sub3) this).aByteArray8200[i_527_] & 0xff) + i_510_ * 8);
				if (i_528_ < 0)
					i_528_ = 0;
				else if (i_528_ > 255)
					i_528_ = 255;
				((Class387_Sub3) this).aByteArray8200[i_527_] = (byte) i_528_;
			}
			if (((Class387_Sub3) this).aClass20Array8216 != null) {
				for (int i_529_ = 0; i_529_ < ((Class387_Sub3) this).anInt8215; i_529_++) {
					Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_529_];
					Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_529_];
					((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & 0xffffff | (255 - ((((Class387_Sub3) this).aByteArray8200[((Class20) class20).modelColorIndex * 1557092081]) & 0xff)) << 24) * 680837181;
				}
			}
		} else if (i == 7) {
			for (int i_530_ = 0; i_530_ < ((Class387_Sub3) this).anInt8184; i_530_++) {
				int i_531_ = ((Class387_Sub3) this).modelColors[i_530_] & 0xffff;
				int i_532_ = i_531_ >> 10 & 0x3f;
				int i_533_ = i_531_ >> 7 & 0x7;
				int i_534_ = i_531_ & 0x7f;
				i_532_ = i_532_ + i_510_ & 0x3f;
				i_533_ += i_511_;
				if (i_533_ < 0)
					i_533_ = 0;
				else if (i_533_ > 7)
					i_533_ = 7;
				i_534_ += i_512_;
				if (i_534_ < 0)
					i_534_ = 0;
				else if (i_534_ > 127)
					i_534_ = 127;
				((Class387_Sub3) this).modelColors[i_530_] = (short) (i_532_ << 10 | i_533_ << 7 | i_534_);
			}
			((Class387_Sub3) this).aBoolean8207 = true;
			if (((Class387_Sub3) this).aClass20Array8216 != null) {
				for (int i_535_ = 0; i_535_ < ((Class387_Sub3) this).anInt8215; i_535_++) {
					Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_535_];
					Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_535_];
					((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | ((Console.anIntArray4263[Class356.modifyColor(((((Class387_Sub3) this).modelColors[((((Class20) class20).modelColorIndex) * 1557092081)]) & 0xffff), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
				}
			}
		} else if (i == 8) {
			for (int i_536_ = 0; i_536_ < ((Class387_Sub3) this).anInt8215; i_536_++) {
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_536_];
				((Class10) class10).anInt159 += i_510_ * 1013441605;
				((Class10) class10).anInt157 += i_511_ * 1685996777;
			}
		} else if (i == 10) {
			for (int i_537_ = 0; i_537_ < ((Class387_Sub3) this).anInt8215; i_537_++) {
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_537_];
				((Class10) class10).aFloat154 = ((Class10) class10).aFloat154 * (float) i_510_ / 128.0F;
				((Class10) class10).aFloat155 = ((Class10) class10).aFloat155 * (float) i_511_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_538_ = 0; i_538_ < ((Class387_Sub3) this).anInt8215; i_538_++) {
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_538_];
				((Class10) class10).anInt158 = (((Class10) class10).anInt158 * -492325789 + i_510_ & 0x3fff) * 800091467;
			}
		}
	}

	public void method4467(Class387 class387, int i, int i_539_, int i_540_, boolean bool) {
		Class387_Sub3 class387_sub3_541_ = (Class387_Sub3) class387;
		if ((((Class387_Sub3) this).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class387_Sub3) class387_sub3_541_).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		method4547();
		method4551();
		class387_sub3_541_.method4547();
		class387_sub3_541_.method4551();
		anInt8175++;
		int i_542_ = 0;
		int[] is = ((Class387_Sub3) class387_sub3_541_).anIntArray8238;
		int i_543_ = ((Class387_Sub3) class387_sub3_541_).anInt8185;
		for (int i_544_ = 0; i_544_ < ((Class387_Sub3) this).anInt8185; i_544_++) {
			Class21 class21 = ((Class387_Sub3) this).aClass21Array8182[i_544_];
			if (((Class21) class21).anInt255 != 0) {
				int i_545_ = ((Class387_Sub3) this).anIntArray8195[i_544_] - i_539_;
				if (i_545_ >= ((Class387_Sub3) class387_sub3_541_).aShort8214 && (i_545_ <= ((Class387_Sub3) class387_sub3_541_).aShort8223)) {
					int i_546_ = ((Class387_Sub3) this).anIntArray8238[i_544_] - i;
					if ((i_546_ >= ((Class387_Sub3) class387_sub3_541_).aShort8224) && i_546_ <= (((Class387_Sub3) class387_sub3_541_).aShort8225)) {
						int i_547_ = (((Class387_Sub3) this).anIntArray8180[i_544_] - i_540_);
						if (i_547_ >= (((Class387_Sub3) class387_sub3_541_).aShort8226) && i_547_ <= (((Class387_Sub3) class387_sub3_541_).aShort8227)) {
							for (int i_548_ = 0; i_548_ < i_543_; i_548_++) {
								Class21 class21_549_ = (((Class387_Sub3) class387_sub3_541_).aClass21Array8182[i_548_]);
								if (i_546_ == is[i_548_] && i_547_ == (((Class387_Sub3) class387_sub3_541_).anIntArray8180[i_548_]) && i_545_ == (((Class387_Sub3) class387_sub3_541_).anIntArray8195[i_548_]) && (((Class21) class21_549_).anInt255 != 0)) {
									if ((((Class387_Sub3) this).aClass21Array8183) == null)
										((Class387_Sub3) this).aClass21Array8183 = new Class21[((Class387_Sub3) this).anInt8185];
									if ((((Class387_Sub3) class387_sub3_541_).aClass21Array8183) == null)
										((Class387_Sub3) class387_sub3_541_).aClass21Array8183 = new Class21[i_543_];
									Class21 class21_550_ = (((Class387_Sub3) this).aClass21Array8183[i_544_]);
									if (class21_550_ == null)
										class21_550_ = ((Class387_Sub3) this).aClass21Array8183[i_544_] = new Class21(class21);
									Class21 class21_551_ = (((Class387_Sub3) class387_sub3_541_).aClass21Array8183[i_548_]);
									if (class21_551_ == null)
										class21_551_ = ((Class387_Sub3) class387_sub3_541_).aClass21Array8183[i_548_] = new Class21(class21_549_);
									((Class21) class21_550_).anInt252 += ((Class21) class21_549_).anInt252;
									((Class21) class21_550_).anInt253 += ((Class21) class21_549_).anInt253;
									((Class21) class21_550_).anInt254 += ((Class21) class21_549_).anInt254;
									((Class21) class21_550_).anInt255 += ((Class21) class21_549_).anInt255;
									((Class21) class21_551_).anInt252 += ((Class21) class21).anInt252;
									((Class21) class21_551_).anInt253 += ((Class21) class21).anInt253;
									((Class21) class21_551_).anInt254 += ((Class21) class21).anInt254;
									((Class21) class21_551_).anInt255 += ((Class21) class21).anInt255;
									i_542_++;
									((Class387_Sub3) this).anIntArray8239[i_544_] = anInt8175;
									((Class387_Sub3) this).anIntArray8240[i_548_] = anInt8175;
								}
							}
						}
					}
				}
			}
		}
		if (i_542_ >= 3 && bool) {
			for (int i_552_ = 0; i_552_ < ((Class387_Sub3) this).anInt8184; i_552_++) {
				if (((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8173[i_552_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8186[i_552_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8217[i_552_]]) == anInt8175)) {
					if (((Class387_Sub3) this).aByteArray8230 == null)
						((Class387_Sub3) this).aByteArray8230 = new byte[((Class387_Sub3) this).anInt8184];
					((Class387_Sub3) this).aByteArray8230[i_552_] = (byte) 2;
				}
			}
			for (int i_553_ = 0; i_553_ < ((Class387_Sub3) class387_sub3_541_).anInt8184; i_553_++) {
				if ((((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_541_).aShortArray8173[i_553_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_541_).aShortArray8186[i_553_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_541_).aShortArray8217[i_553_])]) == anInt8175) {
					if (((Class387_Sub3) class387_sub3_541_).aByteArray8230 == null)
						((Class387_Sub3) class387_sub3_541_).aByteArray8230 = new byte[(((Class387_Sub3) class387_sub3_541_).anInt8184)];
					((Class387_Sub3) class387_sub3_541_).aByteArray8230[i_553_] = (byte) 2;
				}
			}
		}
	}

	void method4541(Class247 class247, Class80 class80, int i) {
		if (((Class387_Sub3) this).anInt8185 >= 1) {
			Class6 class6 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread());
			Class249 class249 = ((Class6) class6).aClass249_99;
			class249.method2508(class247);
			Class249 class249_554_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aClass249_8632);
			Class249 class249_555_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aClass249_8633);
			if (!((Class387_Sub3) this).aBoolean8187)
				method4547();
			boolean bool = class249.method2487();
			float[] fs = ((Class6) class6).aFloatArray89;
			class249.method2511(0.0F, (float) ((Class387_Sub3) this).aShort8214, 0.0F, fs);
			float f = fs[0];
			float f_556_ = fs[1];
			float f_557_ = fs[2];
			class249.method2511(0.0F, (float) ((Class387_Sub3) this).aShort8223, 0.0F, fs);
			float f_558_ = fs[0];
			float f_559_ = fs[1];
			float f_560_ = fs[2];
			for (int i_561_ = 0; i_561_ < 6; i_561_++) {
				float[] fs_562_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloatArrayArray8617[i_561_]);
				float f_563_ = (fs_562_[0] * f + fs_562_[1] * f_556_ + fs_562_[2] * f_557_ + fs_562_[3] + (float) ((Class387_Sub3) this).aShort8220);
				float f_564_ = (fs_562_[0] * f_558_ + fs_562_[1] * f_559_ + fs_562_[2] * f_560_ + fs_562_[3] + (float) ((Class387_Sub3) this).aShort8220);
				if (f_563_ < 0.0F && f_564_ < 0.0F)
					return;
			}
			float f_565_;
			float f_566_;
			if (bool) {
				f_565_ = class249_554_.aFloatArray2631[14];
				f_566_ = class249_554_.aFloatArray2631[6];
			} else {
				f_565_ = ((class249.aFloatArray2631[12] * class249_554_.aFloatArray2631[2]) + (class249.aFloatArray2631[13] * class249_554_.aFloatArray2631[6]) + (class249.aFloatArray2631[14] * class249_554_.aFloatArray2631[10]) + class249_554_.aFloatArray2631[14]);
				f_566_ = ((class249.aFloatArray2631[4] * class249_554_.aFloatArray2631[2]) + (class249.aFloatArray2631[5] * class249_554_.aFloatArray2631[6]) + (class249.aFloatArray2631[6] * class249_554_.aFloatArray2631[10]));
			}
			float f_567_ = f_565_ + (float) ((Class387_Sub3) this).aShort8214 * f_566_;
			float f_568_ = f_565_ + (float) ((Class387_Sub3) this).aShort8223 * f_566_;
			float f_569_ = (f_567_ > f_568_ ? f_567_ + (float) ((Class387_Sub3) this).aShort8220 : f_568_ + (float) ((Class387_Sub3) this).aShort8220);
			float f_570_ = (class249_555_.aFloatArray2631[10] * f_569_ + class249_555_.aFloatArray2631[14]);
			if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
				synchronized (this) {
					while (((Class387_Sub3) this).aBoolean8161) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					((Class387_Sub3) this).aBoolean8161 = true;
				}
			}
			method4529(class6);
			Class249 class249_571_ = ((Class6) ((Class387_Sub3) this).aClass6_8162).aClass249_100;
			class249_571_.method2510(class249);
			class249_571_.method2483(((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aClass249_8634);
			if ((i & 0x2) != 0)
				((Class387_Sub3) this).aClass38_8164.method536(true);
			else
				((Class387_Sub3) this).aClass38_8164.method536(false);
			boolean bool_572_ = false;
			((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat112 = ((Class38) ((Class387_Sub3) this).aClass38_8164).aFloat391;
			((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat114 = ((Class38) ((Class387_Sub3) this).aClass38_8164).aFloat420;
			((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat116 = ((Class38) ((Class387_Sub3) this).aClass38_8164).aFloat395;
			((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat118 = 1.0F / (((Class38) ((Class387_Sub3) this).aClass38_8164).aFloat395);
			((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat113 = ((Class38) ((Class387_Sub3) this).aClass38_8164).aFloat411;
			((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat115 = ((Class38) ((Class387_Sub3) this).aClass38_8164).aFloat392;
			((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat124 = ((Class38) ((Class387_Sub3) this).aClass38_8164).aFloat394;
			((Class6) ((Class387_Sub3) this).aClass6_8162).anInt119 = (((Class38) ((Class387_Sub3) this).aClass38_8164).anInt396 * -71748021);
			for (int i_573_ = 0; i_573_ < ((Class387_Sub3) this).anInt8174; i_573_++) {
				int i_574_ = ((Class387_Sub3) this).anIntArray8238[i_573_];
				int i_575_ = ((Class387_Sub3) this).anIntArray8195[i_573_];
				int i_576_ = ((Class387_Sub3) this).anIntArray8180[i_573_];
				float f_577_ = (class249_571_.aFloatArray2631[0] * (float) i_574_ + class249_571_.aFloatArray2631[4] * (float) i_575_ + class249_571_.aFloatArray2631[8] * (float) i_576_ + class249_571_.aFloatArray2631[12]);
				float f_578_ = (class249_571_.aFloatArray2631[1] * (float) i_574_ + class249_571_.aFloatArray2631[5] * (float) i_575_ + class249_571_.aFloatArray2631[9] * (float) i_576_ + class249_571_.aFloatArray2631[13]);
				float f_579_ = (class249_571_.aFloatArray2631[2] * (float) i_574_ + class249_571_.aFloatArray2631[6] * (float) i_575_ + class249_571_.aFloatArray2631[10] * (float) i_576_ + class249_571_.aFloatArray2631[14]);
				float f_580_ = (class249_571_.aFloatArray2631[3] * (float) i_574_ + class249_571_.aFloatArray2631[7] * (float) i_575_ + class249_571_.aFloatArray2631[11] * (float) i_576_ + class249_571_.aFloatArray2631[15]);
				((Class387_Sub3) this).aFloatArray8234[i_573_] = (((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat124 + (((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat116) * f_579_ / f_580_);
				((Class387_Sub3) this).aFloatArray8235[i_573_] = f_580_;
				if (f_579_ >= -f_580_) {
					((Class387_Sub3) this).aFloatArray8232[i_573_] = (float) (int) (((Class6) (((Class387_Sub3) this).aClass6_8162)).aFloat113 + (((Class6) (((Class387_Sub3) this).aClass6_8162)).aFloat112) * f_577_ / f_580_);
					((Class387_Sub3) this).aFloatArray8233[i_573_] = (float) (int) (((Class6) (((Class387_Sub3) this).aClass6_8162)).aFloat115 + (((Class6) (((Class387_Sub3) this).aClass6_8162)).aFloat114) * f_578_ / f_580_);
				} else {
					((Class387_Sub3) this).aFloatArray8232[i_573_] = -5000.0F;
					bool_572_ = true;
				}
				if (((Class6) ((Class387_Sub3) this).aClass6_8162).aBoolean91)
					((Class387_Sub3) this).anIntArray8231[i_573_] = (int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) i_574_) + (class249.aFloatArray2631[5] * (float) i_575_) + (class249.aFloatArray2631[9] * (float) i_576_)));
			}
			if (((Class387_Sub3) this).aClass20Array8216 != null) {
				for (int i_581_ = 0; i_581_ < ((Class387_Sub3) this).anInt8215; i_581_++) {
					Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_581_];
					Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_581_];
					short i_582_ = (((Class387_Sub3) this).aShortArray8173[((Class20) class20).modelColorIndex * 1557092081]);
					short i_583_ = (((Class387_Sub3) this).aShortArray8186[((Class20) class20).modelColorIndex * 1557092081]);
					short i_584_ = (((Class387_Sub3) this).aShortArray8217[((Class20) class20).modelColorIndex * 1557092081]);
					int i_585_ = ((((Class387_Sub3) this).anIntArray8238[i_582_] + ((Class387_Sub3) this).anIntArray8238[i_583_] + ((Class387_Sub3) this).anIntArray8238[i_584_]) / 3);
					int i_586_ = ((((Class387_Sub3) this).anIntArray8195[i_582_] + ((Class387_Sub3) this).anIntArray8195[i_583_] + ((Class387_Sub3) this).anIntArray8195[i_584_]) / 3);
					int i_587_ = ((((Class387_Sub3) this).anIntArray8180[i_582_] + ((Class387_Sub3) this).anIntArray8180[i_583_] + ((Class387_Sub3) this).anIntArray8180[i_584_]) / 3);
					float f_588_ = (class249_571_.aFloatArray2631[0] * (float) i_585_ + class249_571_.aFloatArray2631[4] * (float) i_586_ + class249_571_.aFloatArray2631[8] * (float) i_587_ + class249_571_.aFloatArray2631[12]);
					float f_589_ = (class249_571_.aFloatArray2631[1] * (float) i_585_ + class249_571_.aFloatArray2631[5] * (float) i_586_ + class249_571_.aFloatArray2631[9] * (float) i_587_ + class249_571_.aFloatArray2631[13]);
					float f_590_ = (class249_571_.aFloatArray2631[2] * (float) i_585_ + class249_571_.aFloatArray2631[6] * (float) i_586_ + class249_571_.aFloatArray2631[10] * (float) i_587_ + class249_571_.aFloatArray2631[14]);
					float f_591_ = (class249_571_.aFloatArray2631[3] * (float) i_585_ + class249_571_.aFloatArray2631[7] * (float) i_586_ + class249_571_.aFloatArray2631[11] * (float) i_587_ + class249_571_.aFloatArray2631[15]);
					f_590_ += ((class249_555_.aFloatArray2631[2] * (float) (((Class10) class10).anInt159 * 647335565)) + (class249_555_.aFloatArray2631[6] * (float) (((Class10) class10).anInt157 * 1511969625)));
					f_591_ += ((class249_555_.aFloatArray2631[3] * (float) (((Class10) class10).anInt159 * 647335565)) + (class249_555_.aFloatArray2631[7] * (float) (((Class10) class10).anInt157 * 1511969625)));
					if (f_590_ > -f_591_) {
						f_588_ += ((class249_555_.aFloatArray2631[0] * (float) (((Class10) class10).anInt159 * 647335565)) + (class249_555_.aFloatArray2631[4] * (float) (((Class10) class10).anInt157 * 1511969625)));
						f_589_ += ((class249_555_.aFloatArray2631[1] * (float) (((Class10) class10).anInt159 * 647335565)) + (class249_555_.aFloatArray2631[5] * (float) (((Class10) class10).anInt157 * 1511969625)));
						float f_592_ = ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8641) + (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8640) * f_588_ / f_591_);
						float f_593_ = ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8643) + (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8642) * f_589_ / f_591_);
						float f_594_ = (((Class10) class10).aFloat154 * (float) ((Class20) class20).aShort250);
						float f_595_ = (((Class10) class10).aFloat155 * (float) ((Class20) class20).aShort246);
						float f_596_ = (f_588_ + class249_555_.aFloatArray2631[0] * f_594_ + class249_555_.aFloatArray2631[4] * f_595_);
						float f_597_ = (f_589_ + class249_555_.aFloatArray2631[1] * f_594_ + class249_555_.aFloatArray2631[5] * f_595_);
						float f_598_ = (f_591_ + class249_555_.aFloatArray2631[3] * f_594_ + class249_555_.aFloatArray2631[7] * f_595_);
						float f_599_ = ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8641) + (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8640) * f_596_ / f_598_);
						float f_600_ = ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8643) + (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8642) * f_597_ / f_598_);
						((Class10) class10).anInt156 = (int) f_592_ * 1441599571;
						((Class10) class10).anInt160 = (int) f_593_ * -748015421;
						((Class10) class10).aFloat161 = ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8639) + ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8637) * (f_590_ - (class249_555_.aFloatArray2631[10] * (float) (((Class20) class20).anInt251 * -1269155019))) / f_591_));
						((Class10) class10).anInt162 = (int) (f_599_ < f_592_ ? f_592_ - f_599_ : f_599_ - f_592_) * -2134132629;
						((Class10) class10).anInt153 = (int) (f_600_ < f_593_ ? f_593_ - f_600_ : f_600_ - f_593_) * -299142915;
					} else {
						Class10 class10_601_ = class10;
						((Class10) class10).anInt153 = 0;
						((Class10) class10_601_).anInt162 = 0;
					}
				}
			}
			if (class80 != null) {
				boolean bool_602_ = false;
				boolean bool_603_ = true;
				int i_604_ = ((((Class387_Sub3) this).aShort8224 + ((Class387_Sub3) this).aShort8225) >> 1);
				int i_605_ = ((((Class387_Sub3) this).aShort8226 + ((Class387_Sub3) this).aShort8227) >> 1);
				int i_606_ = i_604_;
				short i_607_ = ((Class387_Sub3) this).aShort8214;
				int i_608_ = i_605_;
				float f_609_ = (class249_571_.aFloatArray2631[0] * (float) i_606_ + class249_571_.aFloatArray2631[4] * (float) i_607_ + class249_571_.aFloatArray2631[8] * (float) i_608_ + class249_571_.aFloatArray2631[12]);
				float f_610_ = (class249_571_.aFloatArray2631[1] * (float) i_606_ + class249_571_.aFloatArray2631[5] * (float) i_607_ + class249_571_.aFloatArray2631[9] * (float) i_608_ + class249_571_.aFloatArray2631[13]);
				float f_611_ = (class249_571_.aFloatArray2631[2] * (float) i_606_ + class249_571_.aFloatArray2631[6] * (float) i_607_ + class249_571_.aFloatArray2631[10] * (float) i_608_ + class249_571_.aFloatArray2631[14]);
				float f_612_ = (class249_571_.aFloatArray2631[3] * (float) i_606_ + class249_571_.aFloatArray2631[7] * (float) i_607_ + class249_571_.aFloatArray2631[11] * (float) i_608_ + class249_571_.aFloatArray2631[15]);
				if (f_611_ >= -f_612_) {
					class80.anInt669 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8641) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640) * f_609_ / f_612_);
					class80.anInt670 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8643) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8642) * f_610_ / f_612_);
				} else
					bool_602_ = true;
				i_606_ = i_604_;
				i_607_ = ((Class387_Sub3) this).aShort8223;
				i_608_ = i_605_;
				float f_613_ = (class249_571_.aFloatArray2631[0] * (float) i_606_ + class249_571_.aFloatArray2631[4] * (float) i_607_ + class249_571_.aFloatArray2631[8] * (float) i_608_ + class249_571_.aFloatArray2631[12]);
				float f_614_ = (class249_571_.aFloatArray2631[1] * (float) i_606_ + class249_571_.aFloatArray2631[5] * (float) i_607_ + class249_571_.aFloatArray2631[9] * (float) i_608_ + class249_571_.aFloatArray2631[13]);
				float f_615_ = (class249_571_.aFloatArray2631[2] * (float) i_606_ + class249_571_.aFloatArray2631[6] * (float) i_607_ + class249_571_.aFloatArray2631[10] * (float) i_608_ + class249_571_.aFloatArray2631[14]);
				float f_616_ = (class249_571_.aFloatArray2631[3] * (float) i_606_ + class249_571_.aFloatArray2631[7] * (float) i_607_ + class249_571_.aFloatArray2631[11] * (float) i_608_ + class249_571_.aFloatArray2631[15]);
				if (f_615_ >= -f_616_) {
					class80.anInt668 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8641) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640) * f_613_ / f_616_);
					class80.anInt672 = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8643) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8642) * f_614_ / f_616_);
				} else
					bool_602_ = true;
				if (bool_602_) {
					if (f_611_ < -f_612_ && f_615_ < -f_616_)
						bool_603_ = false;
					else if (f_611_ < -f_612_) {
						float f_617_ = (f_611_ + f_612_) / (f_615_ + f_616_) - 1.0F;
						float f_618_ = f_609_ + f_617_ * (f_613_ - f_609_);
						float f_619_ = f_610_ + f_617_ * (f_614_ - f_610_);
						float f_620_ = f_612_ + f_617_ * (f_616_ - f_612_);
						class80.anInt669 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8641) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640 * f_618_ / f_620_));
						class80.anInt670 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8643) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8642 * f_619_ / f_620_));
					} else if (f_615_ < -f_616_) {
						float f_621_ = (f_615_ + f_616_) / (f_611_ + f_612_) - 1.0F;
						float f_622_ = f_613_ + f_621_ * (f_609_ - f_613_);
						float f_623_ = f_614_ + f_621_ * (f_610_ - f_614_);
						float f_624_ = f_616_ + f_621_ * (f_612_ - f_616_);
						class80.anInt668 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8641) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640 * f_622_ / f_624_));
						class80.anInt672 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8643) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8642 * f_623_ / f_624_));
					}
				}
				if (bool_603_) {
					if (f_611_ / f_612_ > f_615_ / f_616_) {
						float f_625_ = (f_609_ + (class249_555_.aFloatArray2631[0] * (float) ((Class387_Sub3) this).aShort8220) + class249_555_.aFloatArray2631[12]);
						float f_626_ = (f_612_ + (class249_555_.aFloatArray2631[3] * (float) ((Class387_Sub3) this).aShort8220) + class249_555_.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8641) - (float) class80.anInt669 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640 * f_625_ / f_626_));
					} else {
						float f_627_ = (f_613_ + (class249_555_.aFloatArray2631[0] * (float) ((Class387_Sub3) this).aShort8220) + class249_555_.aFloatArray2631[12]);
						float f_628_ = (f_616_ + (class249_555_.aFloatArray2631[3] * (float) ((Class387_Sub3) this).aShort8220) + class249_555_.aFloatArray2631[15]);
						class80.anInt673 = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8641) - (float) class80.anInt668 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640 * f_627_ / f_628_));
					}
					class80.aBoolean671 = true;
				}
			}
			method4532(true);
			((Class38) ((Class387_Sub3) this).aClass38_8164).aBoolean384 = (i & 0x1) == 0;
			((Class38) ((Class387_Sub3) this).aClass38_8164).aBoolean383 = false;
			try {
				method4542((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anIntArray8630) != null, (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloatArray8620) != null, (i & 0x4) != 0, bool_572_, (((((Class6) ((Class387_Sub3) this).aClass6_8162).aBoolean86) && f_570_ > ((Class6) (((Class387_Sub3) this).aClass6_8162)).aFloat87) || (((Class6) ((Class387_Sub3) this).aClass6_8162).aBoolean91)));
			} catch (Exception exception) {
				/* empty */
			}
			if (((Class387_Sub3) this).aClass20Array8216 != null) {
				for (int i_629_ = 0; i_629_ < ((Class387_Sub3) this).anInt8184; i_629_++)
					((Class387_Sub3) this).anIntArray8241[i_629_] = -1;
			}
			((Class387_Sub3) this).aClass38_8164 = null;
			if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
				synchronized (this) {
					((Class387_Sub3) this).aBoolean8161 = false;
					this.notifyAll();
				}
			}
		}
	}

	final void method4542(boolean bool, boolean bool_630_, boolean bool_631_, boolean bool_632_, boolean bool_633_) {
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8215; i++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i];
				((Class387_Sub3) this).anIntArray8241[((Class20) class20).modelColorIndex * 1557092081] = i;
			}
		}
		if (((Class387_Sub3) this).aBoolean8228 || ((Class387_Sub3) this).aClass20Array8216 != null) {
			if ((((Class387_Sub3) this).anInt8172 & 0x100) == 0 && ((Class387_Sub3) this).aShortArray8204 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					short i_634_ = ((Class387_Sub3) this).aShortArray8204[i];
					method4544(bool, bool_630_, bool_631_, i_634_, bool_632_, bool_633_);
				}
			} else {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (!method4555(i) && !method4543(i))
						method4544(bool, bool_630_, bool_631_, i, bool_632_, bool_633_);
				}
				if (((Class387_Sub3) this).aByteArray8203 == null) {
					for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
						if (method4555(i) || method4543(i))
							method4544(bool, bool_630_, bool_631_, i, bool_632_, bool_633_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_635_ = 0; i_635_ < ((Class387_Sub3) this).anInt8184; i_635_++) {
							if ((((Class387_Sub3) this).aByteArray8203[i_635_] == i) && (method4555(i_635_) || method4543(i_635_)))
								method4544(bool, bool_630_, bool_631_, i_635_, bool_632_, bool_633_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++)
				method4544(bool, bool_630_, bool_631_, i, bool_632_, bool_633_);
		}
	}

	final boolean method4543(int i) {
		if (((Class387_Sub3) this).anIntArray8241 == null)
			return false;
		if (((Class387_Sub3) this).anIntArray8241[i] == -1)
			return false;
		return true;
	}

	final void method4544(boolean bool, boolean bool_636_, boolean bool_637_, int i, boolean bool_638_, boolean bool_639_) {
		if (((Class387_Sub3) this).anIntArray8192[i] != -2) {
			short i_640_ = ((Class387_Sub3) this).aShortArray8173[i];
			short i_641_ = ((Class387_Sub3) this).aShortArray8186[i];
			short i_642_ = ((Class387_Sub3) this).aShortArray8217[i];
			float f = ((Class387_Sub3) this).aFloatArray8232[i_640_];
			float f_643_ = ((Class387_Sub3) this).aFloatArray8232[i_641_];
			float f_644_ = ((Class387_Sub3) this).aFloatArray8232[i_642_];
			if (!bool_638_ || f != -5000.0F && f_643_ != -5000.0F && f_644_ != -5000.0F) {
				float f_645_ = ((Class387_Sub3) this).aFloatArray8233[i_640_];
				float f_646_ = ((Class387_Sub3) this).aFloatArray8233[i_641_];
				float f_647_ = ((Class387_Sub3) this).aFloatArray8233[i_642_];
				if (((Class387_Sub3) this).anIntArray8241[i] != -1 || ((f - f_643_) * (f_647_ - f_646_) - (f_645_ - f_646_) * (f_644_ - f_643_)) > 0.0F) {
					if (f < 0.0F || f_643_ < 0.0F || f_644_ < 0.0F || f > (float) (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt119 * 1568891747) || f_643_ > (float) ((((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt119) * 1568891747) || f_644_ > (float) ((((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt119) * 1568891747))
						((Class38) ((Class387_Sub3) this).aClass38_8164).aBoolean387 = true;
					else
						((Class38) ((Class387_Sub3) this).aClass38_8164).aBoolean387 = false;
					if (bool_639_) {
						int i_648_ = ((Class387_Sub3) this).anIntArray8241[i];
						if (i_648_ == -1 || !(((Class20) (((Class387_Sub3) this).aClass20Array8216[i_648_])).aBoolean245))
							method4545(bool, bool_636_, bool_637_, i);
					} else {
						int i_649_ = ((Class387_Sub3) this).anIntArray8241[i];
						if (i_649_ != -1) {
							Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_649_]);
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_649_]);
							if (!((Class20) class20).aBoolean245)
								method4554(bool, bool_636_, bool_637_, i);
							((Class387_Sub3) this).aClass_ra_Sub3_8165.method5201(bool, bool_636_, bool_637_, ((Class10) class10).anInt156 * 804500443, ((Class10) class10).anInt160 * -837681173, ((Class10) class10).aFloat161, ((Class10) class10).anInt162 * -1645530045, ((Class10) class10).anInt153 * 1900555349, ((Class20) class20).aShort247 & 0xffff, ((Class10) class10).anInt163 * 1548605205, ((Class20) class20).aByte249, ((Class20) class20).aByte248);
						} else
							method4554(bool, bool_636_, bool_637_, i);
					}
				}
			}
		}
	}

	final void method4545(boolean bool, boolean bool_650_, boolean bool_651_, int i) {
		if (!((Class6) ((Class387_Sub3) this).aClass6_8162).aBoolean91) {
			short i_652_ = ((Class387_Sub3) this).aShortArray8173[i];
			short i_653_ = ((Class387_Sub3) this).aShortArray8186[i];
			short i_654_ = ((Class387_Sub3) this).aShortArray8217[i];
			Class249 class249 = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aClass249_8633);
			float f = class249.aFloatArray2631[10];
			float f_655_ = class249.aFloatArray2631[14];
			float f_656_ = class249.aFloatArray2631[11];
			float f_657_ = class249.aFloatArray2631[15];
			float f_658_ = f_655_ * f_656_ - f * f_657_;
			float f_659_ = ((((Class387_Sub3) this).aFloatArray8234[i_652_] - ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat124) * ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat118);
			float f_660_ = ((((Class387_Sub3) this).aFloatArray8234[i_653_] - ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat124) * ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat118);
			float f_661_ = ((((Class387_Sub3) this).aFloatArray8234[i_654_] - ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat124) * ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat118);
			float f_662_ = f_659_ * f_658_ / (f_659_ * f_656_ - f);
			float f_663_ = f_660_ * f_658_ / (f_660_ * f_656_ - f);
			float f_664_ = f_661_ * f_658_ / (f_661_ * f_656_ - f);
			float f_665_ = ((f_662_ - ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat87) / ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat104);
			if (f_665_ > 1.0F)
				f_665_ = 1.0F;
			else if (f_665_ < 0.0F)
				f_665_ = 0.0F;
			float f_666_ = ((f_663_ - ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat87) / ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat104);
			if (f_666_ > 1.0F)
				f_666_ = 1.0F;
			else if (f_666_ < 0.0F)
				f_666_ = 0.0F;
			float f_667_ = ((f_664_ - ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat87) / ((Class6) ((Class387_Sub3) this).aClass6_8162).aFloat104);
			if (f_667_ > 1.0F)
				f_667_ = 1.0F;
			else if (f_667_ < 0.0F)
				f_667_ = 0.0F;
			float f_668_ = f_665_ + f_666_ + f_667_;
			if (!(f_668_ >= 3.0F)) {
				if (f_668_ <= 0.0F)
					method4554(bool, bool_650_, bool_651_, i);
				else {
					if (((Class387_Sub3) this).aByteArray8200 == null)
						((Class38) ((Class387_Sub3) this).aClass38_8164).anInt402 = 0;
					else
						((Class38) ((Class387_Sub3) this).aClass38_8164).anInt402 = ((Class387_Sub3) this).aByteArray8200[i] & 0xff;
					if (((Class387_Sub3) this).aShortArray8201 == null || ((Class387_Sub3) this).aShortArray8201[i] == -1) {
						if (((Class387_Sub3) this).anIntArray8192[i] == -1)
							((Class387_Sub3) this).aClass38_8164.method538(bool, bool_650_, bool_651_, (((Class387_Sub3) this).aFloatArray8233[i_652_]), (((Class387_Sub3) this).aFloatArray8233[i_653_]), (((Class387_Sub3) this).aFloatArray8233[i_654_]), (((Class387_Sub3) this).aFloatArray8232[i_652_]), (((Class387_Sub3) this).aFloatArray8232[i_653_]), (((Class387_Sub3) this).aFloatArray8232[i_654_]), (((Class387_Sub3) this).aFloatArray8234[i_652_]), (((Class387_Sub3) this).aFloatArray8234[i_653_]), (((Class387_Sub3) this).aFloatArray8234[i_654_]), Class442.method5612((Console.anIntArray4263[((((Class387_Sub3) this).anIntArray8190[i]) & 0xffff)]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88 * 536502941), f_665_ * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[((((Class387_Sub3) this).anIntArray8190[i]) & 0xffff)]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88 * 536502941), f_666_ * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[((((Class387_Sub3) this).anIntArray8190[i]) & 0xffff)]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88 * 536502941), f_667_ * 255.0F, -1027106511));
						else
							((Class387_Sub3) this).aClass38_8164.method538(bool, bool_650_, bool_651_, (((Class387_Sub3) this).aFloatArray8233[i_652_]), (((Class387_Sub3) this).aFloatArray8233[i_653_]), (((Class387_Sub3) this).aFloatArray8233[i_654_]), (((Class387_Sub3) this).aFloatArray8232[i_652_]), (((Class387_Sub3) this).aFloatArray8232[i_653_]), (((Class387_Sub3) this).aFloatArray8232[i_654_]), (((Class387_Sub3) this).aFloatArray8234[i_652_]), (((Class387_Sub3) this).aFloatArray8234[i_653_]), (((Class387_Sub3) this).aFloatArray8234[i_654_]), Class442.method5612((Console.anIntArray4263[((((Class387_Sub3) this).anIntArray8190[i]) & 0xffff)]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88 * 536502941), f_665_ * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[((((Class387_Sub3) this).anIntArray8191[i]) & 0xffff)]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88 * 536502941), f_666_ * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[((((Class387_Sub3) this).anIntArray8192[i]) & 0xffff)]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88 * 536502941), f_667_ * 255.0F, -1027106511));
					} else {
						int i_669_ = -16777216;
						if (((Class387_Sub3) this).aByteArray8200 != null)
							i_669_ = 255 - ((((Class387_Sub3) this).aByteArray8200[i]) & 0xff) << 24;
						if (((Class387_Sub3) this).anIntArray8192[i] == -1) {
							int i_670_ = (i_669_ | (((Class387_Sub3) this).anIntArray8190[i] & 0xffffff));
							((Class387_Sub3) this).aClass38_8164.method541(bool, bool_650_, bool_651_, (((Class387_Sub3) this).aFloatArray8233[i_652_]), (((Class387_Sub3) this).aFloatArray8233[i_653_]), (((Class387_Sub3) this).aFloatArray8233[i_654_]), (((Class387_Sub3) this).aFloatArray8232[i_652_]), (((Class387_Sub3) this).aFloatArray8232[i_653_]), (((Class387_Sub3) this).aFloatArray8232[i_654_]), (((Class387_Sub3) this).aFloatArray8234[i_652_]), (((Class387_Sub3) this).aFloatArray8234[i_653_]), (((Class387_Sub3) this).aFloatArray8234[i_654_]), (((Class387_Sub3) this).aFloatArray8235[i_652_]), (((Class387_Sub3) this).aFloatArray8235[i_653_]), (((Class387_Sub3) this).aFloatArray8235[i_654_]), (((Class387_Sub3) this).aFloatArrayArray8188[i][0]), (((Class387_Sub3) this).aFloatArrayArray8188[i][1]), (((Class387_Sub3) this).aFloatArrayArray8188[i][2]), (((Class387_Sub3) this).aFloatArrayArray8189[i][0]), (((Class387_Sub3) this).aFloatArrayArray8189[i][1]), (((Class387_Sub3) this).aFloatArrayArray8189[i][2]), i_670_, i_670_, i_670_, (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt88 * 536502941), f_665_ * 255.0F, f_666_ * 255.0F, f_667_ * 255.0F, ((Class387_Sub3) this).aShortArray8201[i]);
						} else
							((Class387_Sub3) this).aClass38_8164.method541(bool, bool_650_, bool_651_, (((Class387_Sub3) this).aFloatArray8233[i_652_]), (((Class387_Sub3) this).aFloatArray8233[i_653_]), (((Class387_Sub3) this).aFloatArray8233[i_654_]), (((Class387_Sub3) this).aFloatArray8232[i_652_]), (((Class387_Sub3) this).aFloatArray8232[i_653_]), (((Class387_Sub3) this).aFloatArray8232[i_654_]), (((Class387_Sub3) this).aFloatArray8234[i_652_]), (((Class387_Sub3) this).aFloatArray8234[i_653_]), (((Class387_Sub3) this).aFloatArray8234[i_654_]), (((Class387_Sub3) this).aFloatArray8235[i_652_]), (((Class387_Sub3) this).aFloatArray8235[i_653_]), (((Class387_Sub3) this).aFloatArray8235[i_654_]), (((Class387_Sub3) this).aFloatArrayArray8188[i][0]), (((Class387_Sub3) this).aFloatArrayArray8188[i][1]), (((Class387_Sub3) this).aFloatArrayArray8188[i][2]), (((Class387_Sub3) this).aFloatArrayArray8189[i][0]), (((Class387_Sub3) this).aFloatArrayArray8189[i][1]), (((Class387_Sub3) this).aFloatArrayArray8189[i][2]), i_669_ | (((Class387_Sub3) this).anIntArray8190[i]) & 0xffffff, i_669_ | (((Class387_Sub3) this).anIntArray8191[i]) & 0xffffff, i_669_ | (((Class387_Sub3) this).anIntArray8192[i]) & 0xffffff, (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt88 * 536502941), f_665_ * 255.0F, f_666_ * 255.0F, f_667_ * 255.0F, ((Class387_Sub3) this).aShortArray8201[i]);
					}
				}
			}
		} else {
			short i_671_ = ((Class387_Sub3) this).aShortArray8173[i];
			short i_672_ = ((Class387_Sub3) this).aShortArray8186[i];
			short i_673_ = ((Class387_Sub3) this).aShortArray8217[i];
			float f = 0.0F;
			float f_674_ = 0.0F;
			float f_675_ = 0.0F;
			if (((Class387_Sub3) this).anIntArray8231[i_671_] > (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt93 * -1466095361))
				f = 1.0F;
			else if (((Class387_Sub3) this).anIntArray8231[i_671_] > (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt92 * 579526949))
				f = ((float) ((((Class6) ((Class387_Sub3) this).aClass6_8162).anInt92) * 579526949 - ((Class387_Sub3) this).anIntArray8231[i_671_]) * 1.0F / (float) ((((Class6) ((Class387_Sub3) this).aClass6_8162).anInt92) * 579526949 - (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt93 * -1466095361)));
			if (((Class387_Sub3) this).anIntArray8231[i_672_] > (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt93 * -1466095361))
				f_674_ = 1.0F;
			else if (((Class387_Sub3) this).anIntArray8231[i_672_] > (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt92 * 579526949))
				f_674_ = ((float) ((((Class6) ((Class387_Sub3) this).aClass6_8162).anInt92) * 579526949 - (((Class387_Sub3) this).anIntArray8231[i_672_])) * 1.0F / (float) ((((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt92 * 579526949) - (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt93 * -1466095361)));
			if (((Class387_Sub3) this).anIntArray8231[i_673_] > (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt93 * -1466095361))
				f_675_ = 1.0F;
			else if (((Class387_Sub3) this).anIntArray8231[i_673_] > (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt92 * 579526949))
				f_675_ = ((float) ((((Class6) ((Class387_Sub3) this).aClass6_8162).anInt92) * 579526949 - (((Class387_Sub3) this).anIntArray8231[i_673_])) * 1.0F / (float) ((((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt92 * 579526949) - (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt93 * -1466095361)));
			if (((Class387_Sub3) this).aByteArray8200 == null)
				((Class38) ((Class387_Sub3) this).aClass38_8164).anInt402 = 0;
			else
				((Class38) ((Class387_Sub3) this).aClass38_8164).anInt402 = ((Class387_Sub3) this).aByteArray8200[i] & 0xff;
			if (((Class387_Sub3) this).aShortArray8201 == null || ((Class387_Sub3) this).aShortArray8201[i] == -1) {
				if (((Class387_Sub3) this).anIntArray8192[i] == -1)
					((Class387_Sub3) this).aClass38_8164.method538(bool, bool_650_, bool_651_, ((Class387_Sub3) this).aFloatArray8233[i_671_], ((Class387_Sub3) this).aFloatArray8233[i_672_], ((Class387_Sub3) this).aFloatArray8233[i_673_], ((Class387_Sub3) this).aFloatArray8232[i_671_], ((Class387_Sub3) this).aFloatArray8232[i_672_], ((Class387_Sub3) this).aFloatArray8232[i_673_], ((Class387_Sub3) this).aFloatArray8234[i_671_], ((Class387_Sub3) this).aFloatArray8234[i_672_], ((Class387_Sub3) this).aFloatArray8234[i_673_], Class442.method5612((Console.anIntArray4263[(((Class387_Sub3) this).anIntArray8190[i]) & 0xffff]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88) * 536502941, f * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[(((Class387_Sub3) this).anIntArray8190[i]) & 0xffff]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88) * 536502941, f_674_ * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[(((Class387_Sub3) this).anIntArray8190[i]) & 0xffff]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88) * 536502941, f_675_ * 255.0F, -1027106511));
				else
					((Class387_Sub3) this).aClass38_8164.method538(bool, bool_650_, bool_651_, ((Class387_Sub3) this).aFloatArray8233[i_671_], ((Class387_Sub3) this).aFloatArray8233[i_672_], ((Class387_Sub3) this).aFloatArray8233[i_673_], ((Class387_Sub3) this).aFloatArray8232[i_671_], ((Class387_Sub3) this).aFloatArray8232[i_672_], ((Class387_Sub3) this).aFloatArray8232[i_673_], ((Class387_Sub3) this).aFloatArray8234[i_671_], ((Class387_Sub3) this).aFloatArray8234[i_672_], ((Class387_Sub3) this).aFloatArray8234[i_673_], Class442.method5612((Console.anIntArray4263[(((Class387_Sub3) this).anIntArray8190[i]) & 0xffff]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88) * 536502941, f * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[(((Class387_Sub3) this).anIntArray8191[i]) & 0xffff]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88) * 536502941, f_674_ * 255.0F, -1027106511), Class442.method5612((Console.anIntArray4263[(((Class387_Sub3) this).anIntArray8192[i]) & 0xffff]), (((Class6) (((Class387_Sub3) this).aClass6_8162)).anInt88) * 536502941, f_675_ * 255.0F, -1027106511));
			} else {
				int i_676_ = -16777216;
				if (((Class387_Sub3) this).aByteArray8200 != null)
					i_676_ = 255 - (((Class387_Sub3) this).aByteArray8200[i] & 0xff) << 24;
				if (((Class387_Sub3) this).anIntArray8192[i] == -1) {
					int i_677_ = i_676_ | (((Class387_Sub3) this).anIntArray8190[i] & 0xffffff);
					((Class387_Sub3) this).aClass38_8164.method541(bool, bool_650_, bool_651_, ((Class387_Sub3) this).aFloatArray8233[i_671_], ((Class387_Sub3) this).aFloatArray8233[i_672_], ((Class387_Sub3) this).aFloatArray8233[i_673_], ((Class387_Sub3) this).aFloatArray8232[i_671_], ((Class387_Sub3) this).aFloatArray8232[i_672_], ((Class387_Sub3) this).aFloatArray8232[i_673_], ((Class387_Sub3) this).aFloatArray8234[i_671_], ((Class387_Sub3) this).aFloatArray8234[i_672_], ((Class387_Sub3) this).aFloatArray8234[i_673_], ((Class387_Sub3) this).aFloatArray8235[i_671_], ((Class387_Sub3) this).aFloatArray8235[i_672_], ((Class387_Sub3) this).aFloatArray8235[i_673_], ((Class387_Sub3) this).aFloatArrayArray8188[i][0], ((Class387_Sub3) this).aFloatArrayArray8188[i][1], ((Class387_Sub3) this).aFloatArrayArray8188[i][2], ((Class387_Sub3) this).aFloatArrayArray8189[i][0], ((Class387_Sub3) this).aFloatArrayArray8189[i][1], ((Class387_Sub3) this).aFloatArrayArray8189[i][2], i_677_, i_677_, i_677_, (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt88) * 536502941, f * 255.0F, f_674_ * 255.0F, f_675_ * 255.0F, ((Class387_Sub3) this).aShortArray8201[i]);
				} else
					((Class387_Sub3) this).aClass38_8164.method541(bool, bool_650_, bool_651_, ((Class387_Sub3) this).aFloatArray8233[i_671_], ((Class387_Sub3) this).aFloatArray8233[i_672_], ((Class387_Sub3) this).aFloatArray8233[i_673_], ((Class387_Sub3) this).aFloatArray8232[i_671_], ((Class387_Sub3) this).aFloatArray8232[i_672_], ((Class387_Sub3) this).aFloatArray8232[i_673_], ((Class387_Sub3) this).aFloatArray8234[i_671_], ((Class387_Sub3) this).aFloatArray8234[i_672_], ((Class387_Sub3) this).aFloatArray8234[i_673_], ((Class387_Sub3) this).aFloatArray8235[i_671_], ((Class387_Sub3) this).aFloatArray8235[i_672_], ((Class387_Sub3) this).aFloatArray8235[i_673_], ((Class387_Sub3) this).aFloatArrayArray8188[i][0], ((Class387_Sub3) this).aFloatArrayArray8188[i][1], ((Class387_Sub3) this).aFloatArrayArray8188[i][2], ((Class387_Sub3) this).aFloatArrayArray8189[i][0], ((Class387_Sub3) this).aFloatArrayArray8189[i][1], ((Class387_Sub3) this).aFloatArrayArray8189[i][2], i_676_ | (((Class387_Sub3) this).anIntArray8190[i] & 0xffffff), i_676_ | (((Class387_Sub3) this).anIntArray8191[i] & 0xffffff), i_676_ | (((Class387_Sub3) this).anIntArray8192[i] & 0xffffff), (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt88) * 536502941, f * 255.0F, f_674_ * 255.0F, f_675_ * 255.0F, ((Class387_Sub3) this).aShortArray8201[i]);
			}
		}
	}

	public boolean method4458(int i, int i_678_, Class247 class247, boolean bool, int i_679_) {
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 class249 = ((Class6) ((Class387_Sub3) this).aClass6_8162).aClass249_99;
		class249.method2508(class247);
		Class249 class249_680_ = ((Class6) ((Class387_Sub3) this).aClass6_8162).aClass249_100;
		class249_680_.method2510(class249);
		class249_680_.method2483(((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aClass249_8634);
		boolean bool_681_ = false;
		int i_682_ = 2147483647;
		int i_683_ = -2147483648;
		int i_684_ = 2147483647;
		int i_685_ = -2147483648;
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		int i_686_ = ((((Class387_Sub3) this).aShort8225 - ((Class387_Sub3) this).aShort8224) >> 1);
		int i_687_ = ((((Class387_Sub3) this).aShort8223 - ((Class387_Sub3) this).aShort8214) >> 1);
		int i_688_ = ((((Class387_Sub3) this).aShort8227 - ((Class387_Sub3) this).aShort8226) >> 1);
		int i_689_ = ((Class387_Sub3) this).aShort8224 + i_686_;
		int i_690_ = ((Class387_Sub3) this).aShort8214 + i_687_;
		int i_691_ = ((Class387_Sub3) this).aShort8226 + i_688_;
		int i_692_ = i_689_ - (i_686_ << i_679_);
		int i_693_ = i_690_ - (i_687_ << i_679_);
		int i_694_ = i_691_ - (i_688_ << i_679_);
		int i_695_ = i_689_ + (i_686_ << i_679_);
		int i_696_ = i_690_ + (i_687_ << i_679_);
		int i_697_ = i_691_ + (i_688_ << i_679_);
		((Class387_Sub3) this).anIntArray8177[0] = i_692_;
		((Class387_Sub3) this).anIntArray8178[0] = i_693_;
		((Class387_Sub3) this).anIntArray8179[0] = i_694_;
		((Class387_Sub3) this).anIntArray8177[1] = i_695_;
		((Class387_Sub3) this).anIntArray8178[1] = i_693_;
		((Class387_Sub3) this).anIntArray8179[1] = i_694_;
		((Class387_Sub3) this).anIntArray8177[2] = i_692_;
		((Class387_Sub3) this).anIntArray8178[2] = i_696_;
		((Class387_Sub3) this).anIntArray8179[2] = i_694_;
		((Class387_Sub3) this).anIntArray8177[3] = i_695_;
		((Class387_Sub3) this).anIntArray8178[3] = i_696_;
		((Class387_Sub3) this).anIntArray8179[3] = i_694_;
		((Class387_Sub3) this).anIntArray8177[4] = i_692_;
		((Class387_Sub3) this).anIntArray8178[4] = i_693_;
		((Class387_Sub3) this).anIntArray8179[4] = i_697_;
		((Class387_Sub3) this).anIntArray8177[5] = i_695_;
		((Class387_Sub3) this).anIntArray8178[5] = i_693_;
		((Class387_Sub3) this).anIntArray8179[5] = i_697_;
		((Class387_Sub3) this).anIntArray8177[6] = i_692_;
		((Class387_Sub3) this).anIntArray8178[6] = i_696_;
		((Class387_Sub3) this).anIntArray8179[6] = i_697_;
		((Class387_Sub3) this).anIntArray8177[7] = i_695_;
		((Class387_Sub3) this).anIntArray8178[7] = i_696_;
		((Class387_Sub3) this).anIntArray8179[7] = i_697_;
		for (int i_698_ = 0; i_698_ < 8; i_698_++) {
			int i_699_ = ((Class387_Sub3) this).anIntArray8177[i_698_];
			int i_700_ = ((Class387_Sub3) this).anIntArray8178[i_698_];
			int i_701_ = ((Class387_Sub3) this).anIntArray8179[i_698_];
			float f = (class249_680_.aFloatArray2631[2] * (float) i_699_ + class249_680_.aFloatArray2631[6] * (float) i_700_ + class249_680_.aFloatArray2631[10] * (float) i_701_ + class249_680_.aFloatArray2631[14]);
			float f_702_ = (class249_680_.aFloatArray2631[3] * (float) i_699_ + class249_680_.aFloatArray2631[7] * (float) i_700_ + class249_680_.aFloatArray2631[11] * (float) i_701_ + class249_680_.aFloatArray2631[15]);
			if (f >= -f_702_) {
				float f_703_ = (class249_680_.aFloatArray2631[0] * (float) i_699_ + class249_680_.aFloatArray2631[4] * (float) i_700_ + class249_680_.aFloatArray2631[8] * (float) i_701_ + class249_680_.aFloatArray2631[12]);
				float f_704_ = (class249_680_.aFloatArray2631[1] * (float) i_699_ + class249_680_.aFloatArray2631[5] * (float) i_700_ + class249_680_.aFloatArray2631[9] * (float) i_701_ + class249_680_.aFloatArray2631[13]);
				int i_705_ = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8641) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640) * f_703_ / f_702_);
				int i_706_ = (int) ((((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8643) + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8642) * f_704_ / f_702_);
				if (i_705_ < i_682_)
					i_682_ = i_705_;
				if (i_705_ > i_683_)
					i_683_ = i_705_;
				if (i_706_ < i_684_)
					i_684_ = i_706_;
				if (i_706_ > i_685_)
					i_685_ = i_706_;
				bool_681_ = true;
			}
		}
		if (bool_681_ && i > i_682_ && i < i_683_ && i_678_ > i_684_ && i_678_ < i_685_) {
			if (bool)
				return true;
			for (int i_707_ = 0; i_707_ < ((Class387_Sub3) this).anInt8174; i_707_++) {
				int i_708_ = ((Class387_Sub3) this).anIntArray8238[i_707_];
				int i_709_ = ((Class387_Sub3) this).anIntArray8195[i_707_];
				int i_710_ = ((Class387_Sub3) this).anIntArray8180[i_707_];
				float f = (class249_680_.aFloatArray2631[2] * (float) i_708_ + class249_680_.aFloatArray2631[6] * (float) i_709_ + class249_680_.aFloatArray2631[10] * (float) i_710_ + class249_680_.aFloatArray2631[14]);
				float f_711_ = (class249_680_.aFloatArray2631[3] * (float) i_708_ + class249_680_.aFloatArray2631[7] * (float) i_709_ + class249_680_.aFloatArray2631[11] * (float) i_710_ + class249_680_.aFloatArray2631[15]);
				if (f >= -f_711_) {
					float f_712_ = (class249_680_.aFloatArray2631[0] * (float) i_708_ + class249_680_.aFloatArray2631[4] * (float) i_709_ + class249_680_.aFloatArray2631[8] * (float) i_710_ + class249_680_.aFloatArray2631[12]);
					float f_713_ = (class249_680_.aFloatArray2631[1] * (float) i_708_ + class249_680_.aFloatArray2631[5] * (float) i_709_ + class249_680_.aFloatArray2631[9] * (float) i_710_ + class249_680_.aFloatArray2631[13]);
					((Class387_Sub3) this).aFloatArray8232[i_707_] = (float) (int) (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8641 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640 * f_712_ / f_711_));
					((Class387_Sub3) this).aFloatArray8233[i_707_] = (float) (int) (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8643 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8642 * f_713_ / f_711_));
				} else
					((Class387_Sub3) this).aFloatArray8232[i_707_] = -999999.0F;
			}
			for (int i_714_ = 0; i_714_ < ((Class387_Sub3) this).anInt8184; i_714_++) {
				if (((((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8173[i_714_]]) != -999999.0F) && ((((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8186[i_714_]]) != -999999.0F) && ((((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8217[i_714_]]) != -999999.0F) && (method4546(i, i_678_, (((Class387_Sub3) this).aFloatArray8233[((Class387_Sub3) this).aShortArray8173[i_714_]]), (((Class387_Sub3) this).aFloatArray8233[((Class387_Sub3) this).aShortArray8186[i_714_]]), (((Class387_Sub3) this).aFloatArray8233[((Class387_Sub3) this).aShortArray8217[i_714_]]), (((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8173[i_714_]]), (((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8186[i_714_]]), (((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8217[i_714_]]))))
					return true;
			}
		}
		return false;
	}

	boolean method4546(int i, int i_715_, float f, float f_716_, float f_717_, float f_718_, float f_719_, float f_720_) {
		if ((float) i_715_ < f && (float) i_715_ < f_716_ && (float) i_715_ < f_717_)
			return false;
		if ((float) i_715_ > f && (float) i_715_ > f_716_ && (float) i_715_ > f_717_)
			return false;
		if ((float) i < f_718_ && (float) i < f_719_ && (float) i < f_720_)
			return false;
		if ((float) i > f_718_ && (float) i > f_719_ && (float) i > f_720_)
			return false;
		return true;
	}

	public void method4463(Class247 class247) {
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 class249 = ((Class6) ((Class387_Sub3) this).aClass6_8162).aClass249_99;
		class249.method2508(class247);
		if (((Class387_Sub3) this).aClass93Array8213 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass93Array8213.length; i++) {
				Class93 class93 = ((Class387_Sub3) this).aClass93Array8213[i];
				Class93 class93_721_ = class93;
				if (class93.aClass93_833 != null)
					class93_721_ = class93.aClass93_833;
				class93_721_.anInt838 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt841 * -1670679901)])))) * 432673201);
				class93_721_.anInt832 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt841 * -1670679901)])))) * -1138862783);
				class93_721_.anInt840 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt841 * -1670679901)])))) * -555868357);
				class93_721_.anInt837 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt835 * -614748507)])))) * -707023853);
				class93_721_.anInt842 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt835 * -614748507)])))) * -648890367);
				class93_721_.anInt845 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt835 * -614748507)])))) * -1672139309);
				class93_721_.anInt839 = (int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt836 * -878748965)])))) * 488615051;
				class93_721_.anInt844 = (int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt836 * -878748965)])))) * 197668655;
				class93_721_.anInt846 = (int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt836 * -878748965)])))) * 471540135;
			}
		}
		if (((Class387_Sub3) this).aClass64Array8160 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass64Array8160.length; i++) {
				Class64 class64 = ((Class387_Sub3) this).aClass64Array8160[i];
				Class64 class64_722_ = class64;
				if (class64.aClass64_562 != null)
					class64_722_ = class64.aClass64_562;
				if (class64.aClass249_568 != null)
					class64.aClass249_568.method2510(class249);
				else
					class64.aClass249_568 = new Class249(class249);
				class64_722_.anInt565 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class64.anInt566 * 1669844747)])))) * -686746519);
				class64_722_.anInt563 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class64.anInt566 * 1669844747)])))) * -635472619);
				class64_722_.anInt567 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class64.anInt566 * 1669844747)])))) * 1225142127);
			}
		}
	}

	public void dm(int i, int i_723_, int i_724_, int i_725_) {
		if ((((Class387_Sub3) this).anInt8172 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_726_ = 0; i_726_ < ((Class387_Sub3) this).anInt8184; i_726_++) {
			int i_727_ = ((Class387_Sub3) this).modelColors[i_726_] & 0xffff;
			int i_728_ = i_727_ >> 10 & 0x3f;
			int i_729_ = i_727_ >> 7 & 0x7;
			int i_730_ = i_727_ & 0x7f;
			if (i != -1)
				i_728_ += (i - i_728_) * i_725_ >> 7;
			if (i_723_ != -1)
				i_729_ += (i_723_ - i_729_) * i_725_ >> 7;
			if (i_724_ != -1)
				i_730_ += (i_724_ - i_730_) * i_725_ >> 7;
			((Class387_Sub3) this).modelColors[i_726_] = (short) (i_728_ << 10 | i_729_ << 7 | i_730_);
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_731_ = 0; i_731_ < ((Class387_Sub3) this).anInt8215; i_731_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_731_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_731_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	void method4547() {
		if (!((Class387_Sub3) this).aBoolean8187) {
			int i = 0;
			int i_732_ = 0;
			int i_733_ = 32767;
			int i_734_ = 32767;
			int i_735_ = 32767;
			int i_736_ = -32768;
			int i_737_ = -32768;
			int i_738_ = -32768;
			for (int i_739_ = 0; i_739_ < ((Class387_Sub3) this).anInt8185; i_739_++) {
				int i_740_ = ((Class387_Sub3) this).anIntArray8238[i_739_];
				int i_741_ = ((Class387_Sub3) this).anIntArray8195[i_739_];
				int i_742_ = ((Class387_Sub3) this).anIntArray8180[i_739_];
				if (i_740_ < i_733_)
					i_733_ = i_740_;
				if (i_740_ > i_736_)
					i_736_ = i_740_;
				if (i_741_ < i_734_)
					i_734_ = i_741_;
				if (i_741_ > i_737_)
					i_737_ = i_741_;
				if (i_742_ < i_735_)
					i_735_ = i_742_;
				if (i_742_ > i_738_)
					i_738_ = i_742_;
				int i_743_ = i_740_ * i_740_ + i_742_ * i_742_;
				if (i_743_ > i)
					i = i_743_;
				i_743_ += i_741_ * i_741_;
				if (i_743_ > i_732_)
					i_732_ = i_743_;
			}
			((Class387_Sub3) this).aShort8224 = (short) i_733_;
			((Class387_Sub3) this).aShort8225 = (short) i_736_;
			((Class387_Sub3) this).aShort8214 = (short) i_734_;
			((Class387_Sub3) this).aShort8223 = (short) i_737_;
			((Class387_Sub3) this).aShort8226 = (short) i_735_;
			((Class387_Sub3) this).aShort8227 = (short) i_738_;
			((Class387_Sub3) this).aShort8220 = (short) (int) (Math.sqrt((double) i) + 0.99);
			((Class387_Sub3) this).aShort8198 = (short) (int) (Math.sqrt((double) i_732_) + 0.99);
			((Class387_Sub3) this).aBoolean8187 = true;
		}
	}

	public int N() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8220;
	}

	public int n() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8198;
	}

	public int ya() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8225;
	}

	public int cr() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8227;
	}

	public Class_na ga(Class_na class_na) {
		return null;
	}

	public int ha() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8227;
	}

	public void p(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8236 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	public Class387 method4468(byte i, int i_744_, boolean bool) {
		method4530(Thread.currentThread());
		boolean bool_745_ = false;
		Class387_Sub3 class387_sub3_746_;
		Class387_Sub3 class387_sub3_747_;
		if (i > 0 && i <= 7) {
			class387_sub3_747_ = ((Class387_Sub3) this).aClass387_Sub3Array8243[i - 1];
			class387_sub3_746_ = ((Class387_Sub3) this).aClass387_Sub3Array8170[i - 1];
			bool_745_ = true;
		} else
			class387_sub3_746_ = class387_sub3_747_ = new Class387_Sub3(((Class387_Sub3) this).aClass_ra_Sub3_8165);
		return method4536(class387_sub3_746_, class387_sub3_747_, i_744_, bool_745_, bool);
	}

	public int c() {
		return ((Class387_Sub3) this).anInt8236;
	}

	public int cc() {
		return ((Class387_Sub3) this).anInt8236;
	}

	public byte[] as() {
		return ((Class387_Sub3) this).aByteArray8200;
	}

	public void color(short modelColor, short modifiedModelColor) {
		for (int index = 0; index < ((Class387_Sub3) this).anInt8184; index++) {
			//((Class387_Sub3) this).modelColors[index] = -525;
			if (((Class387_Sub3) this).modelColors[index] == modelColor)
				((Class387_Sub3) this).modelColors[index] = modifiedModelColor;
				//20000;
				//(short) (modifiedModelColor + 10000 > Short.MAX_VALUE ? modifiedModelColor - 10000 : modifiedModelColor + 10000);
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_750_ = 0; i_750_ < ((Class387_Sub3) this).anInt8215; i_750_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_750_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_750_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	public void method4460(byte i, byte[] is) {
		if ((((Class387_Sub3) this).anInt8172 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class387_Sub3) this).aByteArray8200 == null)
			((Class387_Sub3) this).aByteArray8200 = new byte[((Class387_Sub3) this).anInt8184];
		if (is == null) {
			for (int i_751_ = 0; i_751_ < ((Class387_Sub3) this).anInt8184; i_751_++)
				((Class387_Sub3) this).aByteArray8200[i_751_] = i;
		} else {
			for (int i_752_ = 0; i_752_ < ((Class387_Sub3) this).anInt8184; i_752_++) {
				int i_753_ = 255 - ((255 - (is[i_752_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub3) this).aByteArray8200[i_752_] = (byte) i_753_;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	int method4548(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	public void method4440(Class247 class247, Class80 class80, int i) {
		method4541(class247, class80, i);
	}

	public Class93[] method4464() {
		return ((Class387_Sub3) this).aClass93Array8213;
	}

	public Class64[] method4445() {
		return ((Class387_Sub3) this).aClass64Array8160;
	}

	public boolean i() {
		return ((Class387_Sub3) this).aBoolean8228;
	}

	void method4472() {
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
			synchronized (this) {
				aBoolean3990 = false;
				this.notifyAll();
			}
		}
	}

	static {
		anInt8166 = 4096;
		anInt8175 = 0;
	}

	void method4549(boolean bool) {
		if (((Class387_Sub3) this).anInt8196 == 1)
			method4553();
		else if (((Class387_Sub3) this).anInt8196 == 2) {
			if ((((Class387_Sub3) this).anInt8172 & 0x97098) == 0 && ((Class387_Sub3) this).aFloatArrayArray8188 == null)
				((Class387_Sub3) this).modelColors = null;
			if (bool)
				((Class387_Sub3) this).aByteArray8230 = null;
		} else {
			method4551();
			int i = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8625) * 1926837141;
			int i_754_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8626) * -1582112117;
			int i_755_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8627) * -1580311717;
			int i_756_ = (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8645) * -581366659 >> 8;
			int i_757_ = 0;
			int i_758_ = 0;
			if (((Class387_Sub3) this).anInt8176 != 0) {
				i_757_ = (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).anInt8628 * 1204889856 / ((Class387_Sub3) this).anInt8176);
				i_758_ = (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).anInt8646 * -688105216 / ((Class387_Sub3) this).anInt8176);
			}
			if (((Class387_Sub3) this).anIntArray8190 == null) {
				((Class387_Sub3) this).anIntArray8190 = new int[((Class387_Sub3) this).anInt8184];
				((Class387_Sub3) this).anIntArray8191 = new int[((Class387_Sub3) this).anInt8184];
				((Class387_Sub3) this).anIntArray8192 = new int[((Class387_Sub3) this).anInt8184];
			}
			for (int i_759_ = 0; i_759_ < ((Class387_Sub3) this).anInt8184; i_759_++) {
				byte i_760_;
				if (((Class387_Sub3) this).aByteArray8230 == null)
					i_760_ = (byte) 0;
				else
					i_760_ = ((Class387_Sub3) this).aByteArray8230[i_759_];
				byte i_761_;
				if (((Class387_Sub3) this).aByteArray8200 == null)
					i_761_ = (byte) 0;
				else
					i_761_ = ((Class387_Sub3) this).aByteArray8200[i_759_];
				short i_762_;
				if (((Class387_Sub3) this).aShortArray8201 == null)
					i_762_ = (short) -1;
				else
					i_762_ = ((Class387_Sub3) this).aShortArray8201[i_759_];
				if (i_761_ == -2)
					i_760_ = (byte) 3;
				if (i_761_ == -1)
					i_760_ = (byte) 2;
				if (i_762_ == -1) {
					if (i_760_ == 0) {
						int i_763_ = (((Class387_Sub3) this).modelColors[i_759_] & 0xffff);
						int i_764_ = (((i_763_ & 0x7f) * ((Class387_Sub3) this).anInt8236) >> 7);
						short i_765_ = Class356.modifyColor(i_763_ & ~0x7f | i_764_, (byte) 1);
						Class21 class21;
						if (((Class387_Sub3) this).aClass21Array8183 != null && (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8173[i_759_])]) != null)
							class21 = (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8173[i_759_])]);
						else
							class21 = (((Class387_Sub3) this).aClass21Array8182[(((Class387_Sub3) this).aShortArray8173[i_759_])]);
						int i_766_ = ((i * ((Class21) class21).anInt252 + i_754_ * ((Class21) class21).anInt253 + i_755_ * ((Class21) class21).anInt254) / ((Class21) class21).anInt255) >> 16;
						int i_767_ = i_766_ > 256 ? i_757_ : i_758_;
						int i_768_ = (i_756_ >> 1) + (i_767_ * i_766_ >> 17);
						((Class387_Sub3) this).anIntArray8190[i_759_] = (i_768_ << 17 | Class330_Sub26_Sub1.method3395(i_765_, i_768_, -577928050));
						if (((Class387_Sub3) this).aClass21Array8183 != null && (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8186[i_759_])]) != null)
							class21 = (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8186[i_759_])]);
						else
							class21 = (((Class387_Sub3) this).aClass21Array8182[(((Class387_Sub3) this).aShortArray8186[i_759_])]);
						i_766_ = ((i * ((Class21) class21).anInt252 + i_754_ * ((Class21) class21).anInt253 + i_755_ * ((Class21) class21).anInt254) / ((Class21) class21).anInt255) >> 16;
						i_767_ = i_766_ > 256 ? i_757_ : i_758_;
						i_768_ = (i_756_ >> 1) + (i_767_ * i_766_ >> 17);
						((Class387_Sub3) this).anIntArray8191[i_759_] = (i_768_ << 17 | Class330_Sub26_Sub1.method3395(i_765_, i_768_, -1343514986));
						if (((Class387_Sub3) this).aClass21Array8183 != null && (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8217[i_759_])]) != null)
							class21 = (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8217[i_759_])]);
						else
							class21 = (((Class387_Sub3) this).aClass21Array8182[(((Class387_Sub3) this).aShortArray8217[i_759_])]);
						i_766_ = ((i * ((Class21) class21).anInt252 + i_754_ * ((Class21) class21).anInt253 + i_755_ * ((Class21) class21).anInt254) / ((Class21) class21).anInt255) >> 16;
						i_767_ = i_766_ > 256 ? i_757_ : i_758_;
						i_768_ = (i_756_ >> 1) + (i_767_ * i_766_ >> 17);
						((Class387_Sub3) this).anIntArray8192[i_759_] = (i_768_ << 17 | Class330_Sub26_Sub1.method3395(i_765_, i_768_, -2072299664));
					} else if (i_760_ == 1) {
						int i_769_ = (((Class387_Sub3) this).modelColors[i_759_] & 0xffff);
						int i_770_ = (((i_769_ & 0x7f) * ((Class387_Sub3) this).anInt8236) >> 7);
						short i_771_ = Class356.modifyColor(i_769_ & ~0x7f | i_770_, (byte) 1);
						Class25 class25 = ((Class387_Sub3) this).aClass25Array8197[i_759_];
						int i_772_ = ((i * ((Class25) class25).anInt306 + i_754_ * ((Class25) class25).anInt307 + i_755_ * ((Class25) class25).anInt308) >> 16);
						int i_773_ = i_772_ > 256 ? i_757_ : i_758_;
						int i_774_ = (i_756_ >> 1) + (i_773_ * i_772_ >> 17);
						((Class387_Sub3) this).anIntArray8190[i_759_] = (i_774_ << 17 | Class330_Sub26_Sub1.method3395(i_771_, i_774_, -761124492));
						((Class387_Sub3) this).anIntArray8192[i_759_] = -1;
					} else if (i_760_ == 3) {
						((Class387_Sub3) this).anIntArray8190[i_759_] = 128;
						((Class387_Sub3) this).anIntArray8192[i_759_] = -1;
					} else
						((Class387_Sub3) this).anIntArray8192[i_759_] = -2;
				} else {
					int i_775_ = (((Class387_Sub3) this).modelColors[i_759_] & 0xffff);
					if (i_760_ == 0) {
						Class21 class21;
						if (((Class387_Sub3) this).aClass21Array8183 != null && (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8173[i_759_])]) != null)
							class21 = (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8173[i_759_])]);
						else
							class21 = (((Class387_Sub3) this).aClass21Array8182[(((Class387_Sub3) this).aShortArray8173[i_759_])]);
						int i_776_ = ((i * ((Class21) class21).anInt252 + i_754_ * ((Class21) class21).anInt253 + i_755_ * ((Class21) class21).anInt254) / ((Class21) class21).anInt255) >> 16;
						int i_777_ = i_776_ > 256 ? i_757_ : i_758_;
						int i_778_ = method4548((i_756_ >> 2) + (i_777_ * i_776_ >> 18));
						((Class387_Sub3) this).anIntArray8190[i_759_] = i_778_ << 24 | method4552(i_775_, i_762_, i_778_);
						if (((Class387_Sub3) this).aClass21Array8183 != null && (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8186[i_759_])]) != null)
							class21 = (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8186[i_759_])]);
						else
							class21 = (((Class387_Sub3) this).aClass21Array8182[(((Class387_Sub3) this).aShortArray8186[i_759_])]);
						i_776_ = ((i * ((Class21) class21).anInt252 + i_754_ * ((Class21) class21).anInt253 + i_755_ * ((Class21) class21).anInt254) / ((Class21) class21).anInt255) >> 16;
						i_777_ = i_776_ > 256 ? i_757_ : i_758_;
						i_778_ = method4548((i_756_ >> 2) + (i_777_ * i_776_ >> 18));
						((Class387_Sub3) this).anIntArray8191[i_759_] = i_778_ << 24 | method4552(i_775_, i_762_, i_778_);
						if (((Class387_Sub3) this).aClass21Array8183 != null && (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8217[i_759_])]) != null)
							class21 = (((Class387_Sub3) this).aClass21Array8183[(((Class387_Sub3) this).aShortArray8217[i_759_])]);
						else
							class21 = (((Class387_Sub3) this).aClass21Array8182[(((Class387_Sub3) this).aShortArray8217[i_759_])]);
						i_776_ = ((i * ((Class21) class21).anInt252 + i_754_ * ((Class21) class21).anInt253 + i_755_ * ((Class21) class21).anInt254) / ((Class21) class21).anInt255) >> 16;
						i_777_ = i_776_ > 256 ? i_757_ : i_758_;
						i_778_ = method4548((i_756_ >> 2) + (i_777_ * i_776_ >> 18));
						((Class387_Sub3) this).anIntArray8192[i_759_] = i_778_ << 24 | method4552(i_775_, i_762_, i_778_);
					} else if (i_760_ == 1) {
						Class25 class25 = ((Class387_Sub3) this).aClass25Array8197[i_759_];
						int i_779_ = ((i * ((Class25) class25).anInt306 + i_754_ * ((Class25) class25).anInt307 + i_755_ * ((Class25) class25).anInt308) >> 16);
						int i_780_ = i_779_ > 256 ? i_757_ : i_758_;
						int i_781_ = method4548((i_756_ >> 2) + (i_780_ * i_779_ >> 18));
						((Class387_Sub3) this).anIntArray8190[i_759_] = i_781_ << 24 | method4552(i_775_, i_762_, i_781_);
						((Class387_Sub3) this).anIntArray8192[i_759_] = -1;
					} else
						((Class387_Sub3) this).anIntArray8192[i_759_] = -2;
				}
			}
			((Class387_Sub3) this).aClass21Array8182 = null;
			((Class387_Sub3) this).aClass21Array8183 = null;
			((Class387_Sub3) this).aClass25Array8197 = null;
			if ((((Class387_Sub3) this).anInt8172 & 0x97098) == 0 && ((Class387_Sub3) this).aFloatArrayArray8188 == null)
				((Class387_Sub3) this).modelColors = null;
			if (bool)
				((Class387_Sub3) this).aByteArray8230 = null;
			((Class387_Sub3) this).anInt8196 = 2;
		}
	}

	public int YA() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8214;
	}

	public int cm() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8214;
	}

	public int Z() {
		return ((Class387_Sub3) this).anInt8176;
	}

	public void da(short i, short i_782_) {
		for (int i_783_ = 0; i_783_ < ((Class387_Sub3) this).anInt8184; i_783_++) {
			if (((Class387_Sub3) this).modelColors[i_783_] == i)
				((Class387_Sub3) this).modelColors[i_783_] = i_782_;
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_784_ = 0; i_784_ < ((Class387_Sub3) this).anInt8215; i_784_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_784_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_784_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	void bx() {
		if (((Class387_Sub3) this).aBoolean8208) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8174; i++) {
				((Class387_Sub3) this).anIntArray8238[i] = ((Class387_Sub3) this).anIntArray8238[i] + 7 >> 4;
				((Class387_Sub3) this).anIntArray8195[i] = ((Class387_Sub3) this).anIntArray8195[i] + 7 >> 4;
				((Class387_Sub3) this).anIntArray8180[i] = ((Class387_Sub3) this).anIntArray8180[i] + 7 >> 4;
			}
			((Class387_Sub3) this).aBoolean8208 = false;
		}
		if (((Class387_Sub3) this).aBoolean8207) {
			method4553();
			((Class387_Sub3) this).aBoolean8207 = false;
		}
		((Class387_Sub3) this).aBoolean8187 = false;
	}

	public int AA() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8226;
	}

	public byte[] dg() {
		return ((Class387_Sub3) this).aByteArray8200;
	}

	public void method4480(Class387 class387, int i, int i_785_, int i_786_, boolean bool) {
		Class387_Sub3 class387_sub3_787_ = (Class387_Sub3) class387;
		if ((((Class387_Sub3) this).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class387_Sub3) class387_sub3_787_).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		method4547();
		method4551();
		class387_sub3_787_.method4547();
		class387_sub3_787_.method4551();
		anInt8175++;
		int i_788_ = 0;
		int[] is = ((Class387_Sub3) class387_sub3_787_).anIntArray8238;
		int i_789_ = ((Class387_Sub3) class387_sub3_787_).anInt8185;
		for (int i_790_ = 0; i_790_ < ((Class387_Sub3) this).anInt8185; i_790_++) {
			Class21 class21 = ((Class387_Sub3) this).aClass21Array8182[i_790_];
			if (((Class21) class21).anInt255 != 0) {
				int i_791_ = ((Class387_Sub3) this).anIntArray8195[i_790_] - i_785_;
				if (i_791_ >= ((Class387_Sub3) class387_sub3_787_).aShort8214 && (i_791_ <= ((Class387_Sub3) class387_sub3_787_).aShort8223)) {
					int i_792_ = ((Class387_Sub3) this).anIntArray8238[i_790_] - i;
					if ((i_792_ >= ((Class387_Sub3) class387_sub3_787_).aShort8224) && i_792_ <= (((Class387_Sub3) class387_sub3_787_).aShort8225)) {
						int i_793_ = (((Class387_Sub3) this).anIntArray8180[i_790_] - i_786_);
						if (i_793_ >= (((Class387_Sub3) class387_sub3_787_).aShort8226) && i_793_ <= (((Class387_Sub3) class387_sub3_787_).aShort8227)) {
							for (int i_794_ = 0; i_794_ < i_789_; i_794_++) {
								Class21 class21_795_ = (((Class387_Sub3) class387_sub3_787_).aClass21Array8182[i_794_]);
								if (i_792_ == is[i_794_] && i_793_ == (((Class387_Sub3) class387_sub3_787_).anIntArray8180[i_794_]) && i_791_ == (((Class387_Sub3) class387_sub3_787_).anIntArray8195[i_794_]) && (((Class21) class21_795_).anInt255 != 0)) {
									if ((((Class387_Sub3) this).aClass21Array8183) == null)
										((Class387_Sub3) this).aClass21Array8183 = new Class21[((Class387_Sub3) this).anInt8185];
									if ((((Class387_Sub3) class387_sub3_787_).aClass21Array8183) == null)
										((Class387_Sub3) class387_sub3_787_).aClass21Array8183 = new Class21[i_789_];
									Class21 class21_796_ = (((Class387_Sub3) this).aClass21Array8183[i_790_]);
									if (class21_796_ == null)
										class21_796_ = ((Class387_Sub3) this).aClass21Array8183[i_790_] = new Class21(class21);
									Class21 class21_797_ = (((Class387_Sub3) class387_sub3_787_).aClass21Array8183[i_794_]);
									if (class21_797_ == null)
										class21_797_ = ((Class387_Sub3) class387_sub3_787_).aClass21Array8183[i_794_] = new Class21(class21_795_);
									((Class21) class21_796_).anInt252 += ((Class21) class21_795_).anInt252;
									((Class21) class21_796_).anInt253 += ((Class21) class21_795_).anInt253;
									((Class21) class21_796_).anInt254 += ((Class21) class21_795_).anInt254;
									((Class21) class21_796_).anInt255 += ((Class21) class21_795_).anInt255;
									((Class21) class21_797_).anInt252 += ((Class21) class21).anInt252;
									((Class21) class21_797_).anInt253 += ((Class21) class21).anInt253;
									((Class21) class21_797_).anInt254 += ((Class21) class21).anInt254;
									((Class21) class21_797_).anInt255 += ((Class21) class21).anInt255;
									i_788_++;
									((Class387_Sub3) this).anIntArray8239[i_790_] = anInt8175;
									((Class387_Sub3) this).anIntArray8240[i_794_] = anInt8175;
								}
							}
						}
					}
				}
			}
		}
		if (i_788_ >= 3 && bool) {
			for (int i_798_ = 0; i_798_ < ((Class387_Sub3) this).anInt8184; i_798_++) {
				if (((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8173[i_798_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8186[i_798_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8217[i_798_]]) == anInt8175)) {
					if (((Class387_Sub3) this).aByteArray8230 == null)
						((Class387_Sub3) this).aByteArray8230 = new byte[((Class387_Sub3) this).anInt8184];
					((Class387_Sub3) this).aByteArray8230[i_798_] = (byte) 2;
				}
			}
			for (int i_799_ = 0; i_799_ < ((Class387_Sub3) class387_sub3_787_).anInt8184; i_799_++) {
				if ((((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_787_).aShortArray8173[i_799_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_787_).aShortArray8186[i_799_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_787_).aShortArray8217[i_799_])]) == anInt8175) {
					if (((Class387_Sub3) class387_sub3_787_).aByteArray8230 == null)
						((Class387_Sub3) class387_sub3_787_).aByteArray8230 = new byte[(((Class387_Sub3) class387_sub3_787_).anInt8184)];
					((Class387_Sub3) class387_sub3_787_).aByteArray8230[i_799_] = (byte) 2;
				}
			}
		}
	}

	public void method4466(Class387 class387, int i, int i_800_, int i_801_, boolean bool) {
		Class387_Sub3 class387_sub3_802_ = (Class387_Sub3) class387;
		if ((((Class387_Sub3) this).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class387_Sub3) class387_sub3_802_).anInt8172 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		method4547();
		method4551();
		class387_sub3_802_.method4547();
		class387_sub3_802_.method4551();
		anInt8175++;
		int i_803_ = 0;
		int[] is = ((Class387_Sub3) class387_sub3_802_).anIntArray8238;
		int i_804_ = ((Class387_Sub3) class387_sub3_802_).anInt8185;
		for (int i_805_ = 0; i_805_ < ((Class387_Sub3) this).anInt8185; i_805_++) {
			Class21 class21 = ((Class387_Sub3) this).aClass21Array8182[i_805_];
			if (((Class21) class21).anInt255 != 0) {
				int i_806_ = ((Class387_Sub3) this).anIntArray8195[i_805_] - i_800_;
				if (i_806_ >= ((Class387_Sub3) class387_sub3_802_).aShort8214 && (i_806_ <= ((Class387_Sub3) class387_sub3_802_).aShort8223)) {
					int i_807_ = ((Class387_Sub3) this).anIntArray8238[i_805_] - i;
					if ((i_807_ >= ((Class387_Sub3) class387_sub3_802_).aShort8224) && i_807_ <= (((Class387_Sub3) class387_sub3_802_).aShort8225)) {
						int i_808_ = (((Class387_Sub3) this).anIntArray8180[i_805_] - i_801_);
						if (i_808_ >= (((Class387_Sub3) class387_sub3_802_).aShort8226) && i_808_ <= (((Class387_Sub3) class387_sub3_802_).aShort8227)) {
							for (int i_809_ = 0; i_809_ < i_804_; i_809_++) {
								Class21 class21_810_ = (((Class387_Sub3) class387_sub3_802_).aClass21Array8182[i_809_]);
								if (i_807_ == is[i_809_] && i_808_ == (((Class387_Sub3) class387_sub3_802_).anIntArray8180[i_809_]) && i_806_ == (((Class387_Sub3) class387_sub3_802_).anIntArray8195[i_809_]) && (((Class21) class21_810_).anInt255 != 0)) {
									if ((((Class387_Sub3) this).aClass21Array8183) == null)
										((Class387_Sub3) this).aClass21Array8183 = new Class21[((Class387_Sub3) this).anInt8185];
									if ((((Class387_Sub3) class387_sub3_802_).aClass21Array8183) == null)
										((Class387_Sub3) class387_sub3_802_).aClass21Array8183 = new Class21[i_804_];
									Class21 class21_811_ = (((Class387_Sub3) this).aClass21Array8183[i_805_]);
									if (class21_811_ == null)
										class21_811_ = ((Class387_Sub3) this).aClass21Array8183[i_805_] = new Class21(class21);
									Class21 class21_812_ = (((Class387_Sub3) class387_sub3_802_).aClass21Array8183[i_809_]);
									if (class21_812_ == null)
										class21_812_ = ((Class387_Sub3) class387_sub3_802_).aClass21Array8183[i_809_] = new Class21(class21_810_);
									((Class21) class21_811_).anInt252 += ((Class21) class21_810_).anInt252;
									((Class21) class21_811_).anInt253 += ((Class21) class21_810_).anInt253;
									((Class21) class21_811_).anInt254 += ((Class21) class21_810_).anInt254;
									((Class21) class21_811_).anInt255 += ((Class21) class21_810_).anInt255;
									((Class21) class21_812_).anInt252 += ((Class21) class21).anInt252;
									((Class21) class21_812_).anInt253 += ((Class21) class21).anInt253;
									((Class21) class21_812_).anInt254 += ((Class21) class21).anInt254;
									((Class21) class21_812_).anInt255 += ((Class21) class21).anInt255;
									i_803_++;
									((Class387_Sub3) this).anIntArray8239[i_805_] = anInt8175;
									((Class387_Sub3) this).anIntArray8240[i_809_] = anInt8175;
								}
							}
						}
					}
				}
			}
		}
		if (i_803_ >= 3 && bool) {
			for (int i_813_ = 0; i_813_ < ((Class387_Sub3) this).anInt8184; i_813_++) {
				if (((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8173[i_813_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8186[i_813_]]) == anInt8175) && ((((Class387_Sub3) this).anIntArray8239[((Class387_Sub3) this).aShortArray8217[i_813_]]) == anInt8175)) {
					if (((Class387_Sub3) this).aByteArray8230 == null)
						((Class387_Sub3) this).aByteArray8230 = new byte[((Class387_Sub3) this).anInt8184];
					((Class387_Sub3) this).aByteArray8230[i_813_] = (byte) 2;
				}
			}
			for (int i_814_ = 0; i_814_ < ((Class387_Sub3) class387_sub3_802_).anInt8184; i_814_++) {
				if ((((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_802_).aShortArray8173[i_814_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_802_).aShortArray8186[i_814_])]) == anInt8175 && (((Class387_Sub3) this).anIntArray8240[(((Class387_Sub3) class387_sub3_802_).aShortArray8217[i_814_])]) == anInt8175) {
					if (((Class387_Sub3) class387_sub3_802_).aByteArray8230 == null)
						((Class387_Sub3) class387_sub3_802_).aByteArray8230 = new byte[(((Class387_Sub3) class387_sub3_802_).anInt8184)];
					((Class387_Sub3) class387_sub3_802_).aByteArray8230[i_814_] = (byte) 2;
				}
			}
		}
	}

	public int db() {
		return ((Class387_Sub3) this).anInt8176;
	}

	void method4550() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++) {
				int i_815_ = ((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8238[i] = ((Class387_Sub3) this).anIntArray8180[i];
				((Class387_Sub3) this).anIntArray8180[i] = -i_815_;
				if (((Class387_Sub3) this).aClass21Array8182[i] != null) {
					i_815_ = ((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt252;
					((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt252 = ((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt254;
					((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt254 = -i_815_;
				}
			}
			if (((Class387_Sub3) this).aClass25Array8197 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (((Class387_Sub3) this).aClass25Array8197[i] != null) {
						int i_816_ = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt306);
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt306 = ((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt308;
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt308 = -i_816_;
					}
				}
			}
			for (int i = ((Class387_Sub3) this).anInt8185; i < ((Class387_Sub3) this).anInt8174; i++) {
				int i_817_ = ((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8238[i] = ((Class387_Sub3) this).anIntArray8180[i];
				((Class387_Sub3) this).anIntArray8180[i] = -i_817_;
			}
			((Class387_Sub3) this).anInt8196 = 0;
			((Class387_Sub3) this).aBoolean8187 = false;
		}
	}

	public void bt(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				if (i == 4096) {
					method4550();
					break;
				}
				if (i == 8192) {
					method4539();
					break;
				}
				if (i == 12288) {
					method4556();
					break;
				}
				int i_818_ = Class257.anIntArray2683[i];
				int i_819_ = Class257.anIntArray2684[i];
				synchronized (this) {
					for (int i_820_ = 0; i_820_ < ((Class387_Sub3) this).anInt8185; i_820_++) {
						int i_821_ = ((((Class387_Sub3) this).anIntArray8180[i_820_] * i_818_) + (((Class387_Sub3) this).anIntArray8238[i_820_] * i_819_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_820_] = ((((Class387_Sub3) this).anIntArray8180[i_820_] * i_819_) - (((Class387_Sub3) this).anIntArray8238[i_820_] * i_818_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_820_] = i_821_;
						if (((Class387_Sub3) this).aClass21Array8182[i_820_] != null) {
							i_821_ = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_820_])).anInt254) * i_818_ + (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_820_])).anInt252) * i_819_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_820_])).anInt254 = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_820_])).anInt254) * i_819_ - (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_820_])).anInt252) * i_818_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_820_])).anInt252 = i_821_;
						}
					}
					if (((Class387_Sub3) this).aClass25Array8197 != null) {
						for (int i_822_ = 0; i_822_ < ((Class387_Sub3) this).anInt8184; i_822_++) {
							if ((((Class387_Sub3) this).aClass25Array8197[i_822_]) != null) {
								int i_823_ = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_822_])).anInt308 * i_818_ + (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_822_])).anInt306 * i_819_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_822_])).anInt308 = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_822_])).anInt308 * i_819_ - (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_822_])).anInt306 * i_818_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_822_])).anInt306 = i_823_;
							}
						}
					}
					for (int i_824_ = ((Class387_Sub3) this).anInt8185; i_824_ < ((Class387_Sub3) this).anInt8174; i_824_++) {
						int i_825_ = ((((Class387_Sub3) this).anIntArray8180[i_824_] * i_818_) + (((Class387_Sub3) this).anIntArray8238[i_824_] * i_819_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_824_] = ((((Class387_Sub3) this).anIntArray8180[i_824_] * i_819_) - (((Class387_Sub3) this).anIntArray8238[i_824_] * i_818_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_824_] = i_825_;
					}
					((Class387_Sub3) this).anInt8196 = 0;
					((Class387_Sub3) this).aBoolean8187 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public int ah() {
		return ((Class387_Sub3) this).anInt8172;
	}

	public int av() {
		return ((Class387_Sub3) this).anInt8172;
	}

	public int ar() {
		return ((Class387_Sub3) this).anInt8172;
	}

	public void method4478(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub3) this).aShortArray8242 != null) {
			Class6 class6 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread());
			Class247 class247_826_ = ((Class6) class6).aClass247_98;
			class247_826_.method2454(class247);
			if (bool)
				class247_826_.method2459();
			Class249 class249 = ((Class6) class6).aClass249_99;
			class249.method2508(class247_826_);
			float[] fs = new float[3];
			for (int i_827_ = 0; i_827_ < ((Class387_Sub3) this).anInt8185; i_827_++) {
				if ((i & ((Class387_Sub3) this).aShortArray8242[i_827_]) != 0) {
					class249.method2511((float) ((Class387_Sub3) this).anIntArray8238[i_827_], (float) ((Class387_Sub3) this).anIntArray8195[i_827_], (float) ((Class387_Sub3) this).anIntArray8180[i_827_], fs);
					((Class387_Sub3) this).anIntArray8238[i_827_] = (int) fs[0];
					((Class387_Sub3) this).anIntArray8195[i_827_] = (int) fs[1];
					((Class387_Sub3) this).anIntArray8180[i_827_] = (int) fs[2];
				}
			}
		}
	}

	public void au(int i) {
		do {
			if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
				synchronized (this) {
					if ((((Class387_Sub3) this).anInt8172 & 0x10000) == 65536 && (i & 0x10000) == 0)
						method4532(true);
					((Class387_Sub3) this).anInt8172 = i;
					break;
				}
			}
			if ((((Class387_Sub3) this).anInt8172 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method4532(true);
			((Class387_Sub3) this).anInt8172 = i;
		} while (false);
	}

	public void method4491() {
		/* empty */
	}

	void method4551() {
		if (((Class387_Sub3) this).anInt8196 == 0 && ((Class387_Sub3) this).aClass21Array8182 == null) {
			do {
				if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650 * -595900225) > 1) {
					synchronized (this) {
						method4531();
						break;
					}
				}
				method4531();
			} while (false);
		}
	}

	public void bg(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				if (i == 4096) {
					method4550();
					break;
				}
				if (i == 8192) {
					method4539();
					break;
				}
				if (i == 12288) {
					method4556();
					break;
				}
				int i_828_ = Class257.anIntArray2683[i];
				int i_829_ = Class257.anIntArray2684[i];
				synchronized (this) {
					for (int i_830_ = 0; i_830_ < ((Class387_Sub3) this).anInt8185; i_830_++) {
						int i_831_ = ((((Class387_Sub3) this).anIntArray8180[i_830_] * i_828_) + (((Class387_Sub3) this).anIntArray8238[i_830_] * i_829_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_830_] = ((((Class387_Sub3) this).anIntArray8180[i_830_] * i_829_) - (((Class387_Sub3) this).anIntArray8238[i_830_] * i_828_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_830_] = i_831_;
						if (((Class387_Sub3) this).aClass21Array8182[i_830_] != null) {
							i_831_ = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_830_])).anInt254) * i_828_ + (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_830_])).anInt252) * i_829_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_830_])).anInt254 = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_830_])).anInt254) * i_829_ - (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_830_])).anInt252) * i_828_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_830_])).anInt252 = i_831_;
						}
					}
					if (((Class387_Sub3) this).aClass25Array8197 != null) {
						for (int i_832_ = 0; i_832_ < ((Class387_Sub3) this).anInt8184; i_832_++) {
							if ((((Class387_Sub3) this).aClass25Array8197[i_832_]) != null) {
								int i_833_ = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_832_])).anInt308 * i_828_ + (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_832_])).anInt306 * i_829_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_832_])).anInt308 = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_832_])).anInt308 * i_829_ - (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_832_])).anInt306 * i_828_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_832_])).anInt306 = i_833_;
							}
						}
					}
					for (int i_834_ = ((Class387_Sub3) this).anInt8185; i_834_ < ((Class387_Sub3) this).anInt8174; i_834_++) {
						int i_835_ = ((((Class387_Sub3) this).anIntArray8180[i_834_] * i_828_) + (((Class387_Sub3) this).anIntArray8238[i_834_] * i_829_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_834_] = ((((Class387_Sub3) this).anIntArray8180[i_834_] * i_829_) - (((Class387_Sub3) this).anIntArray8238[i_834_] * i_828_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_834_] = i_835_;
					}
					((Class387_Sub3) this).anInt8196 = 0;
					((Class387_Sub3) this).aBoolean8187 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void bo(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				if (i == 4096) {
					method4550();
					break;
				}
				if (i == 8192) {
					method4539();
					break;
				}
				if (i == 12288) {
					method4556();
					break;
				}
				int i_836_ = Class257.anIntArray2683[i];
				int i_837_ = Class257.anIntArray2684[i];
				synchronized (this) {
					for (int i_838_ = 0; i_838_ < ((Class387_Sub3) this).anInt8185; i_838_++) {
						int i_839_ = ((((Class387_Sub3) this).anIntArray8180[i_838_] * i_836_) + (((Class387_Sub3) this).anIntArray8238[i_838_] * i_837_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_838_] = ((((Class387_Sub3) this).anIntArray8180[i_838_] * i_837_) - (((Class387_Sub3) this).anIntArray8238[i_838_] * i_836_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_838_] = i_839_;
						if (((Class387_Sub3) this).aClass21Array8182[i_838_] != null) {
							i_839_ = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_838_])).anInt254) * i_836_ + (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_838_])).anInt252) * i_837_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_838_])).anInt254 = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_838_])).anInt254) * i_837_ - (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_838_])).anInt252) * i_836_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_838_])).anInt252 = i_839_;
						}
					}
					if (((Class387_Sub3) this).aClass25Array8197 != null) {
						for (int i_840_ = 0; i_840_ < ((Class387_Sub3) this).anInt8184; i_840_++) {
							if ((((Class387_Sub3) this).aClass25Array8197[i_840_]) != null) {
								int i_841_ = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_840_])).anInt308 * i_836_ + (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_840_])).anInt306 * i_837_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_840_])).anInt308 = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_840_])).anInt308 * i_837_ - (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_840_])).anInt306 * i_836_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_840_])).anInt306 = i_841_;
							}
						}
					}
					for (int i_842_ = ((Class387_Sub3) this).anInt8185; i_842_ < ((Class387_Sub3) this).anInt8174; i_842_++) {
						int i_843_ = ((((Class387_Sub3) this).anIntArray8180[i_842_] * i_836_) + (((Class387_Sub3) this).anIntArray8238[i_842_] * i_837_)) >> 14;
						((Class387_Sub3) this).anIntArray8180[i_842_] = ((((Class387_Sub3) this).anIntArray8180[i_842_] * i_837_) - (((Class387_Sub3) this).anIntArray8238[i_842_] * i_836_)) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_842_] = i_843_;
					}
					((Class387_Sub3) this).anInt8196 = 0;
					((Class387_Sub3) this).aBoolean8187 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	int method4552(int i, short i_844_, int i_845_) {
		int i_846_ = Console.colorArray[method4533(i, i_845_)];
		Class56 class56 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.anInterface_ma4227.method221(i_844_ & 0xffff, 1089038157);
		int i_847_ = class56.aByte529 & 0xff;
		if (i_847_ != 0) {
			int i_848_ = 131586 * i_845_;
			if (i_847_ == 256)
				i_846_ = i_848_;
			else {
				int i_849_ = i_847_;
				int i_850_ = 256 - i_847_;
				i_846_ = ((((i_848_ & 0xff00ff) * i_849_ + (i_846_ & 0xff00ff) * i_850_) & ~0xff00ff) + (((i_848_ & 0xff00) * i_849_ + (i_846_ & 0xff00) * i_850_) & 0xff0000)) >> 8;
			}
		}
		int i_851_ = class56.aByte534 & 0xff;
		if (i_851_ != 0) {
			i_851_ += 256;
			int i_852_ = ((i_846_ & 0xff0000) >> 16) * i_851_;
			if (i_852_ > 65535)
				i_852_ = 65535;
			int i_853_ = ((i_846_ & 0xff00) >> 8) * i_851_;
			if (i_853_ > 65535)
				i_853_ = 65535;
			int i_854_ = (i_846_ & 0xff) * i_851_;
			if (i_854_ > 65535)
				i_854_ = 65535;
			i_846_ = (i_852_ << 8 & 0xff0000) + (i_853_ & 0xff00) + (i_854_ >> 8);
		}
		return i_846_;
	}

	public int cg() {
		return ((Class387_Sub3) this).anInt8236;
	}

	public int ca() {
		return ((Class387_Sub3) this).anInt8236;
	}

	public void cu(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8176 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	public int cz() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8220;
	}

	public void bc(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x6) != 6)
			throw new IllegalStateException();
		int i_855_ = Class257.anIntArray2683[i];
		int i_856_ = Class257.anIntArray2684[i];
		synchronized (this) {
			for (int i_857_ = 0; i_857_ < ((Class387_Sub3) this).anInt8174; i_857_++) {
				int i_858_ = ((((Class387_Sub3) this).anIntArray8195[i_857_] * i_856_ - (((Class387_Sub3) this).anIntArray8180[i_857_] * i_855_)) >> 14);
				((Class387_Sub3) this).anIntArray8180[i_857_] = (((Class387_Sub3) this).anIntArray8195[i_857_] * i_855_ + (((Class387_Sub3) this).anIntArray8180[i_857_] * i_856_)) >> 14;
				((Class387_Sub3) this).anIntArray8195[i_857_] = i_858_;
			}
			method4540();
		}
	}

	public void bf(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x3) != 3)
			throw new IllegalStateException();
		int i_859_ = Class257.anIntArray2683[i];
		int i_860_ = Class257.anIntArray2684[i];
		synchronized (this) {
			for (int i_861_ = 0; i_861_ < ((Class387_Sub3) this).anInt8174; i_861_++) {
				int i_862_ = ((((Class387_Sub3) this).anIntArray8195[i_861_] * i_859_ + (((Class387_Sub3) this).anIntArray8238[i_861_] * i_860_)) >> 14);
				((Class387_Sub3) this).anIntArray8195[i_861_] = (((Class387_Sub3) this).anIntArray8195[i_861_] * i_860_ - (((Class387_Sub3) this).anIntArray8238[i_861_] * i_859_)) >> 14;
				((Class387_Sub3) this).anIntArray8238[i_861_] = i_862_;
			}
			method4540();
		}
	}

	public void bl(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x3) != 3)
			throw new IllegalStateException();
		int i_863_ = Class257.anIntArray2683[i];
		int i_864_ = Class257.anIntArray2684[i];
		synchronized (this) {
			for (int i_865_ = 0; i_865_ < ((Class387_Sub3) this).anInt8174; i_865_++) {
				int i_866_ = ((((Class387_Sub3) this).anIntArray8195[i_865_] * i_863_ + (((Class387_Sub3) this).anIntArray8238[i_865_] * i_864_)) >> 14);
				((Class387_Sub3) this).anIntArray8195[i_865_] = (((Class387_Sub3) this).anIntArray8195[i_865_] * i_864_ - (((Class387_Sub3) this).anIntArray8238[i_865_] * i_863_)) >> 14;
				((Class387_Sub3) this).anIntArray8238[i_865_] = i_866_;
			}
			method4540();
		}
	}

	public void cf(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8176 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	public void br(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x3) != 3)
			throw new IllegalStateException();
		int i_867_ = Class257.anIntArray2683[i];
		int i_868_ = Class257.anIntArray2684[i];
		synchronized (this) {
			for (int i_869_ = 0; i_869_ < ((Class387_Sub3) this).anInt8174; i_869_++) {
				int i_870_ = ((((Class387_Sub3) this).anIntArray8195[i_869_] * i_867_ + (((Class387_Sub3) this).anIntArray8238[i_869_] * i_868_)) >> 14);
				((Class387_Sub3) this).anIntArray8195[i_869_] = (((Class387_Sub3) this).anIntArray8195[i_869_] * i_868_ - (((Class387_Sub3) this).anIntArray8238[i_869_] * i_867_)) >> 14;
				((Class387_Sub3) this).anIntArray8238[i_869_] = i_870_;
			}
			method4540();
		}
	}

	public void bi(int i, int i_871_, int i_872_) {
		if (i != 0 && (((Class387_Sub3) this).anInt8172 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_871_ != 0 && (((Class387_Sub3) this).anInt8172 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_872_ != 0 && (((Class387_Sub3) this).anInt8172 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_873_ = 0; i_873_ < ((Class387_Sub3) this).anInt8174; i_873_++) {
				((Class387_Sub3) this).anIntArray8238[i_873_] += i;
				((Class387_Sub3) this).anIntArray8195[i_873_] += i_871_;
				((Class387_Sub3) this).anIntArray8180[i_873_] += i_872_;
			}
		}
	}

	public void bz(int i, int i_874_, int i_875_) {
		if (i != 0 && (((Class387_Sub3) this).anInt8172 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_874_ != 0 && (((Class387_Sub3) this).anInt8172 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_875_ != 0 && (((Class387_Sub3) this).anInt8172 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_876_ = 0; i_876_ < ((Class387_Sub3) this).anInt8174; i_876_++) {
				((Class387_Sub3) this).anIntArray8238[i_876_] += i;
				((Class387_Sub3) this).anIntArray8195[i_876_] += i_874_;
				((Class387_Sub3) this).anIntArray8180[i_876_] += i_875_;
			}
		}
	}

	public void be(int i, int i_877_, int i_878_) {
		if (i != 128 && (((Class387_Sub3) this).anInt8172 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_877_ != 128 && (((Class387_Sub3) this).anInt8172 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_878_ != 128 && (((Class387_Sub3) this).anInt8172 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_879_ = 0; i_879_ < ((Class387_Sub3) this).anInt8174; i_879_++) {
				((Class387_Sub3) this).anIntArray8238[i_879_] = ((Class387_Sub3) this).anIntArray8238[i_879_] * i >> 7;
				((Class387_Sub3) this).anIntArray8195[i_879_] = (((Class387_Sub3) this).anIntArray8195[i_879_] * i_877_ >> 7);
				((Class387_Sub3) this).anIntArray8180[i_879_] = (((Class387_Sub3) this).anIntArray8180[i_879_] * i_878_ >> 7);
			}
			((Class387_Sub3) this).aBoolean8187 = false;
		}
	}

	public void by(int i, int i_880_, Class_xa class_xa, Class_xa class_xa_881_, int i_882_, int i_883_, int i_884_) {
		if (i == 3) {
			if ((((Class387_Sub3) this).anInt8172 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class387_Sub3) this).anInt8172 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		int i_885_ = i_882_ + ((Class387_Sub3) this).aShort8224;
		int i_886_ = i_882_ + ((Class387_Sub3) this).aShort8225;
		int i_887_ = i_884_ + ((Class387_Sub3) this).aShort8226;
		int i_888_ = i_884_ + ((Class387_Sub3) this).aShort8227;
		if (i == 4 || (i_885_ >= 0 && ((i_886_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6397 * 1972554729) && i_887_ >= 0 && ((i_888_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6393 * 24567321))) {
			int[][] is = class_xa.anIntArrayArray6394;
			int[][] is_889_ = null;
			if (class_xa_881_ != null)
				is_889_ = class_xa_881_.anIntArrayArray6394;
			if (i == 4 || i == 5) {
				if (class_xa_881_ == null || (i_885_ < 0 || ((i_886_ + class_xa_881_.anInt6395 * 550173571 >> class_xa_881_.anInt6396 * -1066304221) >= class_xa_881_.anInt6397 * 1972554729) || i_887_ < 0 || ((i_888_ + class_xa_881_.anInt6395 * 550173571 >> class_xa_881_.anInt6396 * -1066304221) >= class_xa_881_.anInt6393 * 24567321)))
					return;
			} else {
				i_885_ >>= class_xa.anInt6396 * -1066304221;
				i_886_ = (i_886_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				i_887_ >>= class_xa.anInt6396 * -1066304221;
				i_888_ = (i_888_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				if (is[i_885_][i_887_] == i_883_ && is[i_886_][i_887_] == i_883_ && is[i_885_][i_888_] == i_883_ && is[i_886_][i_888_] == i_883_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_890_ = class_xa.anInt6395 * 550173571 - 1;
					for (int i_891_ = 0; i_891_ < ((Class387_Sub3) this).anInt8185; i_891_++) {
						int i_892_ = (((Class387_Sub3) this).anIntArray8238[i_891_] + i_882_);
						int i_893_ = (((Class387_Sub3) this).anIntArray8180[i_891_] + i_884_);
						int i_894_ = i_892_ & i_890_;
						int i_895_ = i_893_ & i_890_;
						int i_896_ = i_892_ >> class_xa.anInt6396 * -1066304221;
						int i_897_ = i_893_ >> class_xa.anInt6396 * -1066304221;
						int i_898_ = (((is[i_896_][i_897_] * (class_xa.anInt6395 * 550173571 - i_894_)) + is[i_896_ + 1][i_897_] * i_894_) >> class_xa.anInt6396 * -1066304221);
						int i_899_ = (((is[i_896_][i_897_ + 1] * (class_xa.anInt6395 * 550173571 - i_894_)) + is[i_896_ + 1][i_897_ + 1] * i_894_) >> class_xa.anInt6396 * -1066304221);
						int i_900_ = (i_898_ * (class_xa.anInt6395 * 550173571 - i_895_) + i_899_ * i_895_ >> class_xa.anInt6396 * -1066304221);
						((Class387_Sub3) this).anIntArray8195[i_891_] = (((Class387_Sub3) this).anIntArray8195[i_891_] + i_900_ - i_883_);
					}
					for (int i_901_ = ((Class387_Sub3) this).anInt8185; i_901_ < ((Class387_Sub3) this).anInt8174; i_901_++) {
						int i_902_ = (((Class387_Sub3) this).anIntArray8238[i_901_] + i_882_);
						int i_903_ = (((Class387_Sub3) this).anIntArray8180[i_901_] + i_884_);
						int i_904_ = i_902_ & i_890_;
						int i_905_ = i_903_ & i_890_;
						int i_906_ = i_902_ >> class_xa.anInt6396 * -1066304221;
						int i_907_ = i_903_ >> class_xa.anInt6396 * -1066304221;
						if (i_906_ >= 0 && i_906_ < is.length - 1 && i_907_ >= 0 && i_907_ < is[0].length - 1) {
							int i_908_ = (((is[i_906_][i_907_] * (class_xa.anInt6395 * 550173571 - i_904_)) + is[i_906_ + 1][i_907_] * i_904_) >> class_xa.anInt6396 * -1066304221);
							int i_909_ = (((is[i_906_][i_907_ + 1] * (class_xa.anInt6395 * 550173571 - i_904_)) + is[i_906_ + 1][i_907_ + 1] * i_904_) >> class_xa.anInt6396 * -1066304221);
							int i_910_ = (i_908_ * (class_xa.anInt6395 * 550173571 - i_905_) + i_909_ * i_905_ >> class_xa.anInt6396 * -1066304221);
							((Class387_Sub3) this).anIntArray8195[i_901_] = (((Class387_Sub3) this).anIntArray8195[i_901_]) + i_910_ - i_883_;
						}
					}
				} else if (i == 2) {
					if (((Class387_Sub3) this).aShort8214 == 0)
						return;
					int i_911_ = class_xa.anInt6395 * 550173571 - 1;
					for (int i_912_ = 0; i_912_ < ((Class387_Sub3) this).anInt8185; i_912_++) {
						int i_913_ = ((((Class387_Sub3) this).anIntArray8195[i_912_] << 16) / ((Class387_Sub3) this).aShort8214);
						if (i_913_ < i_880_) {
							int i_914_ = ((((Class387_Sub3) this).anIntArray8238[i_912_]) + i_882_);
							int i_915_ = ((((Class387_Sub3) this).anIntArray8180[i_912_]) + i_884_);
							int i_916_ = i_914_ & i_911_;
							int i_917_ = i_915_ & i_911_;
							int i_918_ = i_914_ >> class_xa.anInt6396 * -1066304221;
							int i_919_ = i_915_ >> class_xa.anInt6396 * -1066304221;
							int i_920_ = (((is[i_918_][i_919_] * (class_xa.anInt6395 * 550173571 - i_916_)) + is[i_918_ + 1][i_919_] * i_916_) >> class_xa.anInt6396 * -1066304221);
							int i_921_ = (((is[i_918_][i_919_ + 1] * (class_xa.anInt6395 * 550173571 - i_916_)) + is[i_918_ + 1][i_919_ + 1] * i_916_) >> class_xa.anInt6396 * -1066304221);
							int i_922_ = (i_920_ * (class_xa.anInt6395 * 550173571 - i_917_) + i_921_ * i_917_ >> class_xa.anInt6396 * -1066304221);
							((Class387_Sub3) this).anIntArray8195[i_912_] = ((((Class387_Sub3) this).anIntArray8195[i_912_]) + ((i_922_ - i_883_) * (i_880_ - i_913_) / i_880_));
						} else
							((Class387_Sub3) this).anIntArray8195[i_912_] = (((Class387_Sub3) this).anIntArray8195[i_912_]);
					}
					for (int i_923_ = ((Class387_Sub3) this).anInt8185; i_923_ < ((Class387_Sub3) this).anInt8174; i_923_++) {
						int i_924_ = ((((Class387_Sub3) this).anIntArray8195[i_923_] << 16) / ((Class387_Sub3) this).aShort8214);
						if (i_924_ < i_880_) {
							int i_925_ = ((((Class387_Sub3) this).anIntArray8238[i_923_]) + i_882_);
							int i_926_ = ((((Class387_Sub3) this).anIntArray8180[i_923_]) + i_884_);
							int i_927_ = i_925_ & i_911_;
							int i_928_ = i_926_ & i_911_;
							int i_929_ = i_925_ >> class_xa.anInt6396 * -1066304221;
							int i_930_ = i_926_ >> class_xa.anInt6396 * -1066304221;
							if (i_929_ >= 0 && i_929_ < class_xa.anInt6397 * 1972554729 - 1 && i_930_ >= 0 && (i_930_ < class_xa.anInt6393 * 24567321 - 1)) {
								int i_931_ = (((is[i_929_][i_930_] * (class_xa.anInt6395 * 550173571 - i_927_)) + is[i_929_ + 1][i_930_] * i_927_) >> class_xa.anInt6396 * -1066304221);
								int i_932_ = (((is[i_929_][i_930_ + 1] * (class_xa.anInt6395 * 550173571 - i_927_)) + is[i_929_ + 1][i_930_ + 1] * i_927_) >> class_xa.anInt6396 * -1066304221);
								int i_933_ = (i_931_ * (class_xa.anInt6395 * 550173571 - i_928_) + i_932_ * i_928_ >> class_xa.anInt6396 * -1066304221);
								((Class387_Sub3) this).anIntArray8195[i_923_] = ((((Class387_Sub3) this).anIntArray8195[i_923_]) + ((i_933_ - i_883_) * (i_880_ - i_924_) / i_880_));
							}
						} else
							((Class387_Sub3) this).anIntArray8195[i_923_] = (((Class387_Sub3) this).anIntArray8195[i_923_]);
					}
				} else if (i == 3) {
					int i_934_ = (i_880_ & 0xff) * 4;
					int i_935_ = (i_880_ >> 8 & 0xff) * 4;
					int i_936_ = (i_880_ >> 16 & 0xff) << 6;
					int i_937_ = (i_880_ >> 24 & 0xff) << 6;
					if (i_882_ - (i_934_ >> 1) < 0 || ((i_882_ + (i_934_ >> 1) + class_xa.anInt6395 * 550173571) >= (class_xa.anInt6397 * 1972554729 << class_xa.anInt6396 * -1066304221)) || i_884_ - (i_935_ >> 1) < 0 || ((i_884_ + (i_935_ >> 1) + class_xa.anInt6395 * 550173571) >= (class_xa.anInt6393 * 24567321 << class_xa.anInt6396 * -1066304221)))
						return;
					method4447(class_xa, i_882_, i_883_, i_884_, i_934_, i_935_, i_936_, i_937_);
				} else if (i == 4) {
					int i_938_ = class_xa_881_.anInt6395 * 550173571 - 1;
					int i_939_ = (((Class387_Sub3) this).aShort8223 - ((Class387_Sub3) this).aShort8214);
					for (int i_940_ = 0; i_940_ < ((Class387_Sub3) this).anInt8185; i_940_++) {
						int i_941_ = (((Class387_Sub3) this).anIntArray8238[i_940_] + i_882_);
						int i_942_ = (((Class387_Sub3) this).anIntArray8180[i_940_] + i_884_);
						int i_943_ = i_941_ & i_938_;
						int i_944_ = i_942_ & i_938_;
						int i_945_ = i_941_ >> class_xa_881_.anInt6396 * -1066304221;
						int i_946_ = i_942_ >> class_xa_881_.anInt6396 * -1066304221;
						int i_947_ = (((is_889_[i_945_][i_946_] * (class_xa_881_.anInt6395 * 550173571 - i_943_)) + is_889_[i_945_ + 1][i_946_] * i_943_) >> class_xa_881_.anInt6396 * -1066304221);
						int i_948_ = (((is_889_[i_945_][i_946_ + 1] * (class_xa_881_.anInt6395 * 550173571 - i_943_)) + is_889_[i_945_ + 1][i_946_ + 1] * i_943_) >> class_xa_881_.anInt6396 * -1066304221);
						int i_949_ = (i_947_ * (class_xa_881_.anInt6395 * 550173571 - i_944_) + i_948_ * i_944_ >> class_xa_881_.anInt6396 * -1066304221);
						((Class387_Sub3) this).anIntArray8195[i_940_] = (((Class387_Sub3) this).anIntArray8195[i_940_] + (i_949_ - i_883_) + i_939_);
					}
					for (int i_950_ = ((Class387_Sub3) this).anInt8185; i_950_ < ((Class387_Sub3) this).anInt8174; i_950_++) {
						int i_951_ = (((Class387_Sub3) this).anIntArray8238[i_950_] + i_882_);
						int i_952_ = (((Class387_Sub3) this).anIntArray8180[i_950_] + i_884_);
						int i_953_ = i_951_ & i_938_;
						int i_954_ = i_952_ & i_938_;
						int i_955_ = i_951_ >> class_xa_881_.anInt6396 * -1066304221;
						int i_956_ = i_952_ >> class_xa_881_.anInt6396 * -1066304221;
						if (i_955_ >= 0 && (i_955_ < class_xa_881_.anInt6397 * 1972554729 - 1) && i_956_ >= 0 && (i_956_ < class_xa_881_.anInt6393 * 24567321 - 1)) {
							int i_957_ = (((is_889_[i_955_][i_956_] * (class_xa_881_.anInt6395 * 550173571 - i_953_)) + is_889_[i_955_ + 1][i_956_] * i_953_) >> class_xa_881_.anInt6396 * -1066304221);
							int i_958_ = (((is_889_[i_955_][i_956_ + 1] * (class_xa_881_.anInt6395 * 550173571 - i_953_)) + is_889_[i_955_ + 1][i_956_ + 1] * i_953_) >> class_xa_881_.anInt6396 * -1066304221);
							int i_959_ = ((i_957_ * (class_xa_881_.anInt6395 * 550173571 - i_954_)) + i_958_ * i_954_ >> class_xa_881_.anInt6396 * -1066304221);
							((Class387_Sub3) this).anIntArray8195[i_950_] = (((Class387_Sub3) this).anIntArray8195[i_950_]) + (i_959_ - i_883_) + i_939_;
						}
					}
				} else if (i == 5) {
					int i_960_ = class_xa_881_.anInt6395 * 550173571 - 1;
					int i_961_ = (((Class387_Sub3) this).aShort8223 - ((Class387_Sub3) this).aShort8214);
					for (int i_962_ = 0; i_962_ < ((Class387_Sub3) this).anInt8185; i_962_++) {
						int i_963_ = (((Class387_Sub3) this).anIntArray8238[i_962_] + i_882_);
						int i_964_ = (((Class387_Sub3) this).anIntArray8180[i_962_] + i_884_);
						int i_965_ = i_963_ & i_960_;
						int i_966_ = i_964_ & i_960_;
						int i_967_ = i_963_ >> class_xa.anInt6396 * -1066304221;
						int i_968_ = i_964_ >> class_xa.anInt6396 * -1066304221;
						int i_969_ = (((is[i_967_][i_968_] * (class_xa.anInt6395 * 550173571 - i_965_)) + is[i_967_ + 1][i_968_] * i_965_) >> class_xa.anInt6396 * -1066304221);
						int i_970_ = (((is[i_967_][i_968_ + 1] * (class_xa.anInt6395 * 550173571 - i_965_)) + is[i_967_ + 1][i_968_ + 1] * i_965_) >> class_xa.anInt6396 * -1066304221);
						int i_971_ = (i_969_ * (class_xa.anInt6395 * 550173571 - i_966_) + i_970_ * i_966_ >> class_xa.anInt6396 * -1066304221);
						i_969_ = (((is_889_[i_967_][i_968_] * (class_xa_881_.anInt6395 * 550173571 - i_965_)) + is_889_[i_967_ + 1][i_968_] * i_965_) >> class_xa_881_.anInt6396 * -1066304221);
						i_970_ = (((is_889_[i_967_][i_968_ + 1] * (class_xa_881_.anInt6395 * 550173571 - i_965_)) + is_889_[i_967_ + 1][i_968_ + 1] * i_965_) >> class_xa_881_.anInt6396 * -1066304221);
						int i_972_ = (i_969_ * (class_xa_881_.anInt6395 * 550173571 - i_966_) + i_970_ * i_966_ >> class_xa_881_.anInt6396 * -1066304221);
						int i_973_ = i_971_ - i_972_ - i_880_;
						((Class387_Sub3) this).anIntArray8195[i_962_] = ((((Class387_Sub3) this).anIntArray8195[i_962_] << 8) / i_961_ * i_973_ >> 8) - (i_883_ - i_971_);
					}
					for (int i_974_ = ((Class387_Sub3) this).anInt8185; i_974_ < ((Class387_Sub3) this).anInt8174; i_974_++) {
						int i_975_ = (((Class387_Sub3) this).anIntArray8238[i_974_] + i_882_);
						int i_976_ = (((Class387_Sub3) this).anIntArray8180[i_974_] + i_884_);
						int i_977_ = i_975_ & i_960_;
						int i_978_ = i_976_ & i_960_;
						int i_979_ = i_975_ >> class_xa.anInt6396 * -1066304221;
						int i_980_ = i_976_ >> class_xa.anInt6396 * -1066304221;
						if (i_979_ >= 0 && i_979_ < class_xa.anInt6397 * 1972554729 - 1 && (i_979_ < class_xa_881_.anInt6397 * 1972554729 - 1) && i_980_ >= 0 && i_980_ < class_xa.anInt6393 * 24567321 - 1 && (i_980_ < class_xa_881_.anInt6393 * 24567321 - 1)) {
							int i_981_ = (((is[i_979_][i_980_] * (class_xa.anInt6395 * 550173571 - i_977_)) + is[i_979_ + 1][i_980_] * i_977_) >> class_xa.anInt6396 * -1066304221);
							int i_982_ = (((is[i_979_][i_980_ + 1] * (class_xa.anInt6395 * 550173571 - i_977_)) + is[i_979_ + 1][i_980_ + 1] * i_977_) >> class_xa.anInt6396 * -1066304221);
							int i_983_ = (i_981_ * (class_xa.anInt6395 * 550173571 - i_978_) + i_982_ * i_978_ >> class_xa.anInt6396 * -1066304221);
							i_981_ = (((is_889_[i_979_][i_980_] * (class_xa_881_.anInt6395 * 550173571 - i_977_)) + is_889_[i_979_ + 1][i_980_] * i_977_) >> class_xa_881_.anInt6396 * -1066304221);
							i_982_ = (((is_889_[i_979_][i_980_ + 1] * (class_xa_881_.anInt6395 * 550173571 - i_977_)) + is_889_[i_979_ + 1][i_980_ + 1] * i_977_) >> class_xa_881_.anInt6396 * -1066304221);
							int i_984_ = ((i_981_ * (class_xa_881_.anInt6395 * 550173571 - i_978_)) + i_982_ * i_978_ >> class_xa_881_.anInt6396 * -1066304221);
							int i_985_ = i_983_ - i_984_ - i_880_;
							((Class387_Sub3) this).anIntArray8195[i_974_] = (((((Class387_Sub3) this).anIntArray8195[i_974_]) << 8) / i_961_ * i_985_ >> 8) - (i_883_ - i_983_);
						}
					}
				}
				((Class387_Sub3) this).aBoolean8187 = false;
			}
		}
	}

	public boolean u() {
		return ((Class387_Sub3) this).aBoolean8229;
	}

	public void pa(int i, int i_986_, Class_xa class_xa, Class_xa class_xa_987_, int i_988_, int i_989_, int i_990_) {
		if (i == 3) {
			if ((((Class387_Sub3) this).anInt8172 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class387_Sub3) this).anInt8172 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		int i_991_ = i_988_ + ((Class387_Sub3) this).aShort8224;
		int i_992_ = i_988_ + ((Class387_Sub3) this).aShort8225;
		int i_993_ = i_990_ + ((Class387_Sub3) this).aShort8226;
		int i_994_ = i_990_ + ((Class387_Sub3) this).aShort8227;
		if (i == 4 || (i_991_ >= 0 && ((i_992_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6397 * 1972554729) && i_993_ >= 0 && ((i_994_ + class_xa.anInt6395 * 550173571 >> class_xa.anInt6396 * -1066304221) < class_xa.anInt6393 * 24567321))) {
			int[][] is = class_xa.anIntArrayArray6394;
			int[][] is_995_ = null;
			if (class_xa_987_ != null)
				is_995_ = class_xa_987_.anIntArrayArray6394;
			if (i == 4 || i == 5) {
				if (class_xa_987_ == null || (i_991_ < 0 || ((i_992_ + class_xa_987_.anInt6395 * 550173571 >> class_xa_987_.anInt6396 * -1066304221) >= class_xa_987_.anInt6397 * 1972554729) || i_993_ < 0 || ((i_994_ + class_xa_987_.anInt6395 * 550173571 >> class_xa_987_.anInt6396 * -1066304221) >= class_xa_987_.anInt6393 * 24567321)))
					return;
			} else {
				i_991_ >>= class_xa.anInt6396 * -1066304221;
				i_992_ = (i_992_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				i_993_ >>= class_xa.anInt6396 * -1066304221;
				i_994_ = (i_994_ + (class_xa.anInt6395 * 550173571 - 1) >> class_xa.anInt6396 * -1066304221);
				if (is[i_991_][i_993_] == i_989_ && is[i_992_][i_993_] == i_989_ && is[i_991_][i_994_] == i_989_ && is[i_992_][i_994_] == i_989_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_996_ = class_xa.anInt6395 * 550173571 - 1;
					for (int i_997_ = 0; i_997_ < ((Class387_Sub3) this).anInt8185; i_997_++) {
						int i_998_ = (((Class387_Sub3) this).anIntArray8238[i_997_] + i_988_);
						int i_999_ = (((Class387_Sub3) this).anIntArray8180[i_997_] + i_990_);
						int i_1000_ = i_998_ & i_996_;
						int i_1001_ = i_999_ & i_996_;
						int i_1002_ = i_998_ >> class_xa.anInt6396 * -1066304221;
						int i_1003_ = i_999_ >> class_xa.anInt6396 * -1066304221;
						int i_1004_ = (((is[i_1002_][i_1003_] * (class_xa.anInt6395 * 550173571 - i_1000_)) + is[i_1002_ + 1][i_1003_] * i_1000_) >> class_xa.anInt6396 * -1066304221);
						int i_1005_ = (((is[i_1002_][i_1003_ + 1] * (class_xa.anInt6395 * 550173571 - i_1000_)) + is[i_1002_ + 1][i_1003_ + 1] * i_1000_) >> class_xa.anInt6396 * -1066304221);
						int i_1006_ = (i_1004_ * (class_xa.anInt6395 * 550173571 - i_1001_) + i_1005_ * i_1001_ >> class_xa.anInt6396 * -1066304221);
						((Class387_Sub3) this).anIntArray8195[i_997_] = (((Class387_Sub3) this).anIntArray8195[i_997_] + i_1006_ - i_989_);
					}
					for (int i_1007_ = ((Class387_Sub3) this).anInt8185; i_1007_ < ((Class387_Sub3) this).anInt8174; i_1007_++) {
						int i_1008_ = (((Class387_Sub3) this).anIntArray8238[i_1007_] + i_988_);
						int i_1009_ = (((Class387_Sub3) this).anIntArray8180[i_1007_] + i_990_);
						int i_1010_ = i_1008_ & i_996_;
						int i_1011_ = i_1009_ & i_996_;
						int i_1012_ = i_1008_ >> class_xa.anInt6396 * -1066304221;
						int i_1013_ = i_1009_ >> class_xa.anInt6396 * -1066304221;
						if (i_1012_ >= 0 && i_1012_ < is.length - 1 && i_1013_ >= 0 && i_1013_ < is[0].length - 1) {
							int i_1014_ = (((is[i_1012_][i_1013_] * (class_xa.anInt6395 * 550173571 - i_1010_)) + is[i_1012_ + 1][i_1013_] * i_1010_) >> class_xa.anInt6396 * -1066304221);
							int i_1015_ = (((is[i_1012_][i_1013_ + 1] * (class_xa.anInt6395 * 550173571 - i_1010_)) + is[i_1012_ + 1][i_1013_ + 1] * i_1010_) >> class_xa.anInt6396 * -1066304221);
							int i_1016_ = (i_1014_ * (class_xa.anInt6395 * 550173571 - i_1011_) + i_1015_ * i_1011_ >> class_xa.anInt6396 * -1066304221);
							((Class387_Sub3) this).anIntArray8195[i_1007_] = (((Class387_Sub3) this).anIntArray8195[i_1007_]) + i_1016_ - i_989_;
						}
					}
				} else if (i == 2) {
					if (((Class387_Sub3) this).aShort8214 == 0)
						return;
					int i_1017_ = class_xa.anInt6395 * 550173571 - 1;
					for (int i_1018_ = 0; i_1018_ < ((Class387_Sub3) this).anInt8185; i_1018_++) {
						int i_1019_ = ((((Class387_Sub3) this).anIntArray8195[i_1018_] << 16) / ((Class387_Sub3) this).aShort8214);
						if (i_1019_ < i_986_) {
							int i_1020_ = ((((Class387_Sub3) this).anIntArray8238[i_1018_]) + i_988_);
							int i_1021_ = ((((Class387_Sub3) this).anIntArray8180[i_1018_]) + i_990_);
							int i_1022_ = i_1020_ & i_1017_;
							int i_1023_ = i_1021_ & i_1017_;
							int i_1024_ = i_1020_ >> class_xa.anInt6396 * -1066304221;
							int i_1025_ = i_1021_ >> class_xa.anInt6396 * -1066304221;
							int i_1026_ = (((is[i_1024_][i_1025_] * (class_xa.anInt6395 * 550173571 - i_1022_)) + is[i_1024_ + 1][i_1025_] * i_1022_) >> class_xa.anInt6396 * -1066304221);
							int i_1027_ = (((is[i_1024_][i_1025_ + 1] * (class_xa.anInt6395 * 550173571 - i_1022_)) + is[i_1024_ + 1][i_1025_ + 1] * i_1022_) >> class_xa.anInt6396 * -1066304221);
							int i_1028_ = (i_1026_ * (class_xa.anInt6395 * 550173571 - i_1023_) + i_1027_ * i_1023_ >> class_xa.anInt6396 * -1066304221);
							((Class387_Sub3) this).anIntArray8195[i_1018_] = ((((Class387_Sub3) this).anIntArray8195[i_1018_]) + ((i_1028_ - i_989_) * (i_986_ - i_1019_) / i_986_));
						} else
							((Class387_Sub3) this).anIntArray8195[i_1018_] = (((Class387_Sub3) this).anIntArray8195[i_1018_]);
					}
					for (int i_1029_ = ((Class387_Sub3) this).anInt8185; i_1029_ < ((Class387_Sub3) this).anInt8174; i_1029_++) {
						int i_1030_ = ((((Class387_Sub3) this).anIntArray8195[i_1029_] << 16) / ((Class387_Sub3) this).aShort8214);
						if (i_1030_ < i_986_) {
							int i_1031_ = ((((Class387_Sub3) this).anIntArray8238[i_1029_]) + i_988_);
							int i_1032_ = ((((Class387_Sub3) this).anIntArray8180[i_1029_]) + i_990_);
							int i_1033_ = i_1031_ & i_1017_;
							int i_1034_ = i_1032_ & i_1017_;
							int i_1035_ = i_1031_ >> class_xa.anInt6396 * -1066304221;
							int i_1036_ = i_1032_ >> class_xa.anInt6396 * -1066304221;
							if (i_1035_ >= 0 && (i_1035_ < class_xa.anInt6397 * 1972554729 - 1) && i_1036_ >= 0 && (i_1036_ < class_xa.anInt6393 * 24567321 - 1)) {
								int i_1037_ = (((is[i_1035_][i_1036_] * (class_xa.anInt6395 * 550173571 - i_1033_)) + is[i_1035_ + 1][i_1036_] * i_1033_) >> class_xa.anInt6396 * -1066304221);
								int i_1038_ = (((is[i_1035_][i_1036_ + 1] * (class_xa.anInt6395 * 550173571 - i_1033_)) + (is[i_1035_ + 1][i_1036_ + 1] * i_1033_)) >> class_xa.anInt6396 * -1066304221);
								int i_1039_ = ((i_1037_ * (class_xa.anInt6395 * 550173571 - i_1034_)) + i_1038_ * i_1034_ >> class_xa.anInt6396 * -1066304221);
								((Class387_Sub3) this).anIntArray8195[i_1029_] = ((((Class387_Sub3) this).anIntArray8195[i_1029_]) + ((i_1039_ - i_989_) * (i_986_ - i_1030_) / i_986_));
							}
						} else
							((Class387_Sub3) this).anIntArray8195[i_1029_] = (((Class387_Sub3) this).anIntArray8195[i_1029_]);
					}
				} else if (i == 3) {
					int i_1040_ = (i_986_ & 0xff) * 4;
					int i_1041_ = (i_986_ >> 8 & 0xff) * 4;
					int i_1042_ = (i_986_ >> 16 & 0xff) << 6;
					int i_1043_ = (i_986_ >> 24 & 0xff) << 6;
					if (i_988_ - (i_1040_ >> 1) < 0 || ((i_988_ + (i_1040_ >> 1) + class_xa.anInt6395 * 550173571) >= (class_xa.anInt6397 * 1972554729 << class_xa.anInt6396 * -1066304221)) || i_990_ - (i_1041_ >> 1) < 0 || ((i_990_ + (i_1041_ >> 1) + class_xa.anInt6395 * 550173571) >= (class_xa.anInt6393 * 24567321 << class_xa.anInt6396 * -1066304221)))
						return;
					method4447(class_xa, i_988_, i_989_, i_990_, i_1040_, i_1041_, i_1042_, i_1043_);
				} else if (i == 4) {
					int i_1044_ = class_xa_987_.anInt6395 * 550173571 - 1;
					int i_1045_ = (((Class387_Sub3) this).aShort8223 - ((Class387_Sub3) this).aShort8214);
					for (int i_1046_ = 0; i_1046_ < ((Class387_Sub3) this).anInt8185; i_1046_++) {
						int i_1047_ = (((Class387_Sub3) this).anIntArray8238[i_1046_] + i_988_);
						int i_1048_ = (((Class387_Sub3) this).anIntArray8180[i_1046_] + i_990_);
						int i_1049_ = i_1047_ & i_1044_;
						int i_1050_ = i_1048_ & i_1044_;
						int i_1051_ = i_1047_ >> class_xa_987_.anInt6396 * -1066304221;
						int i_1052_ = i_1048_ >> class_xa_987_.anInt6396 * -1066304221;
						int i_1053_ = (((is_995_[i_1051_][i_1052_] * (class_xa_987_.anInt6395 * 550173571 - i_1049_)) + is_995_[i_1051_ + 1][i_1052_] * i_1049_) >> class_xa_987_.anInt6396 * -1066304221);
						int i_1054_ = (((is_995_[i_1051_][i_1052_ + 1] * (class_xa_987_.anInt6395 * 550173571 - i_1049_)) + is_995_[i_1051_ + 1][i_1052_ + 1] * i_1049_) >> class_xa_987_.anInt6396 * -1066304221);
						int i_1055_ = (i_1053_ * (class_xa_987_.anInt6395 * 550173571 - i_1050_) + i_1054_ * i_1050_ >> class_xa_987_.anInt6396 * -1066304221);
						((Class387_Sub3) this).anIntArray8195[i_1046_] = (((Class387_Sub3) this).anIntArray8195[i_1046_] + (i_1055_ - i_989_) + i_1045_);
					}
					for (int i_1056_ = ((Class387_Sub3) this).anInt8185; i_1056_ < ((Class387_Sub3) this).anInt8174; i_1056_++) {
						int i_1057_ = (((Class387_Sub3) this).anIntArray8238[i_1056_] + i_988_);
						int i_1058_ = (((Class387_Sub3) this).anIntArray8180[i_1056_] + i_990_);
						int i_1059_ = i_1057_ & i_1044_;
						int i_1060_ = i_1058_ & i_1044_;
						int i_1061_ = i_1057_ >> class_xa_987_.anInt6396 * -1066304221;
						int i_1062_ = i_1058_ >> class_xa_987_.anInt6396 * -1066304221;
						if (i_1061_ >= 0 && (i_1061_ < class_xa_987_.anInt6397 * 1972554729 - 1) && i_1062_ >= 0 && (i_1062_ < class_xa_987_.anInt6393 * 24567321 - 1)) {
							int i_1063_ = (((is_995_[i_1061_][i_1062_] * (class_xa_987_.anInt6395 * 550173571 - i_1059_)) + is_995_[i_1061_ + 1][i_1062_] * i_1059_) >> class_xa_987_.anInt6396 * -1066304221);
							int i_1064_ = (((is_995_[i_1061_][i_1062_ + 1] * (class_xa_987_.anInt6395 * 550173571 - i_1059_)) + (is_995_[i_1061_ + 1][i_1062_ + 1] * i_1059_)) >> class_xa_987_.anInt6396 * -1066304221);
							int i_1065_ = ((i_1063_ * (class_xa_987_.anInt6395 * 550173571 - i_1060_)) + i_1064_ * i_1060_ >> class_xa_987_.anInt6396 * -1066304221);
							((Class387_Sub3) this).anIntArray8195[i_1056_] = (((Class387_Sub3) this).anIntArray8195[i_1056_]) + (i_1065_ - i_989_) + i_1045_;
						}
					}
				} else if (i == 5) {
					int i_1066_ = class_xa_987_.anInt6395 * 550173571 - 1;
					int i_1067_ = (((Class387_Sub3) this).aShort8223 - ((Class387_Sub3) this).aShort8214);
					for (int i_1068_ = 0; i_1068_ < ((Class387_Sub3) this).anInt8185; i_1068_++) {
						int i_1069_ = (((Class387_Sub3) this).anIntArray8238[i_1068_] + i_988_);
						int i_1070_ = (((Class387_Sub3) this).anIntArray8180[i_1068_] + i_990_);
						int i_1071_ = i_1069_ & i_1066_;
						int i_1072_ = i_1070_ & i_1066_;
						int i_1073_ = i_1069_ >> class_xa.anInt6396 * -1066304221;
						int i_1074_ = i_1070_ >> class_xa.anInt6396 * -1066304221;
						int i_1075_ = (((is[i_1073_][i_1074_] * (class_xa.anInt6395 * 550173571 - i_1071_)) + is[i_1073_ + 1][i_1074_] * i_1071_) >> class_xa.anInt6396 * -1066304221);
						int i_1076_ = (((is[i_1073_][i_1074_ + 1] * (class_xa.anInt6395 * 550173571 - i_1071_)) + is[i_1073_ + 1][i_1074_ + 1] * i_1071_) >> class_xa.anInt6396 * -1066304221);
						int i_1077_ = (i_1075_ * (class_xa.anInt6395 * 550173571 - i_1072_) + i_1076_ * i_1072_ >> class_xa.anInt6396 * -1066304221);
						i_1075_ = (((is_995_[i_1073_][i_1074_] * (class_xa_987_.anInt6395 * 550173571 - i_1071_)) + is_995_[i_1073_ + 1][i_1074_] * i_1071_) >> class_xa_987_.anInt6396 * -1066304221);
						i_1076_ = (((is_995_[i_1073_][i_1074_ + 1] * (class_xa_987_.anInt6395 * 550173571 - i_1071_)) + is_995_[i_1073_ + 1][i_1074_ + 1] * i_1071_) >> class_xa_987_.anInt6396 * -1066304221);
						int i_1078_ = (i_1075_ * (class_xa_987_.anInt6395 * 550173571 - i_1072_) + i_1076_ * i_1072_ >> class_xa_987_.anInt6396 * -1066304221);
						int i_1079_ = i_1077_ - i_1078_ - i_986_;
						((Class387_Sub3) this).anIntArray8195[i_1068_] = ((((Class387_Sub3) this).anIntArray8195[i_1068_] << 8) / i_1067_ * i_1079_ >> 8) - (i_989_ - i_1077_);
					}
					for (int i_1080_ = ((Class387_Sub3) this).anInt8185; i_1080_ < ((Class387_Sub3) this).anInt8174; i_1080_++) {
						int i_1081_ = (((Class387_Sub3) this).anIntArray8238[i_1080_] + i_988_);
						int i_1082_ = (((Class387_Sub3) this).anIntArray8180[i_1080_] + i_990_);
						int i_1083_ = i_1081_ & i_1066_;
						int i_1084_ = i_1082_ & i_1066_;
						int i_1085_ = i_1081_ >> class_xa.anInt6396 * -1066304221;
						int i_1086_ = i_1082_ >> class_xa.anInt6396 * -1066304221;
						if (i_1085_ >= 0 && i_1085_ < class_xa.anInt6397 * 1972554729 - 1 && (i_1085_ < class_xa_987_.anInt6397 * 1972554729 - 1) && i_1086_ >= 0 && i_1086_ < class_xa.anInt6393 * 24567321 - 1 && (i_1086_ < class_xa_987_.anInt6393 * 24567321 - 1)) {
							int i_1087_ = (((is[i_1085_][i_1086_] * (class_xa.anInt6395 * 550173571 - i_1083_)) + is[i_1085_ + 1][i_1086_] * i_1083_) >> class_xa.anInt6396 * -1066304221);
							int i_1088_ = (((is[i_1085_][i_1086_ + 1] * (class_xa.anInt6395 * 550173571 - i_1083_)) + is[i_1085_ + 1][i_1086_ + 1] * i_1083_) >> class_xa.anInt6396 * -1066304221);
							int i_1089_ = (i_1087_ * (class_xa.anInt6395 * 550173571 - i_1084_) + i_1088_ * i_1084_ >> class_xa.anInt6396 * -1066304221);
							i_1087_ = (((is_995_[i_1085_][i_1086_] * (class_xa_987_.anInt6395 * 550173571 - i_1083_)) + is_995_[i_1085_ + 1][i_1086_] * i_1083_) >> class_xa_987_.anInt6396 * -1066304221);
							i_1088_ = (((is_995_[i_1085_][i_1086_ + 1] * (class_xa_987_.anInt6395 * 550173571 - i_1083_)) + (is_995_[i_1085_ + 1][i_1086_ + 1] * i_1083_)) >> class_xa_987_.anInt6396 * -1066304221);
							int i_1090_ = ((i_1087_ * (class_xa_987_.anInt6395 * 550173571 - i_1084_)) + i_1088_ * i_1084_ >> class_xa_987_.anInt6396 * -1066304221);
							int i_1091_ = i_1089_ - i_1090_ - i_986_;
							((Class387_Sub3) this).anIntArray8195[i_1080_] = (((((Class387_Sub3) this).anIntArray8195[i_1080_]) << 8) / i_1067_ * i_1091_ >> 8) - (i_989_ - i_1089_);
						}
					}
				}
				((Class387_Sub3) this).aBoolean8187 = false;
			}
		}
	}

	public void Q(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8176 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	void method4474(int i, int[] is, int i_1092_, int i_1093_, int i_1094_, int i_1095_, boolean bool) {
		int i_1096_ = is.length;
		if (i == 0) {
			i_1092_ <<= 4;
			i_1093_ <<= 4;
			i_1094_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1097_ = 0; i_1097_ < ((Class387_Sub3) this).anInt8174; i_1097_++) {
					((Class387_Sub3) this).anIntArray8238[i_1097_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1097_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1097_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_1098_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_1099_ = 0; i_1099_ < i_1096_; i_1099_++) {
				int i_1100_ = is[i_1099_];
				if (i_1100_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1101_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1100_];
					for (int i_1102_ = 0; i_1102_ < is_1101_.length; i_1102_++) {
						int i_1103_ = is_1101_[i_1102_];
						((Class387_Sub3) this).anInt8209 += ((Class387_Sub3) this).anIntArray8238[i_1103_];
						((Class387_Sub3) this).anInt8219 += ((Class387_Sub3) this).anIntArray8195[i_1103_];
						((Class387_Sub3) this).anInt8221 += ((Class387_Sub3) this).anIntArray8180[i_1103_];
						i_1098_++;
					}
				}
			}
			if (i_1098_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_1098_ + i_1092_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_1098_ + i_1093_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_1098_ + i_1094_;
			} else {
				((Class387_Sub3) this).anInt8209 = i_1092_;
				((Class387_Sub3) this).anInt8219 = i_1093_;
				((Class387_Sub3) this).anInt8221 = i_1094_;
			}
		} else if (i == 1) {
			i_1092_ <<= 4;
			i_1093_ <<= 4;
			i_1094_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1104_ = 0; i_1104_ < ((Class387_Sub3) this).anInt8174; i_1104_++) {
					((Class387_Sub3) this).anIntArray8238[i_1104_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1104_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1104_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_1105_ = 0; i_1105_ < i_1096_; i_1105_++) {
				int i_1106_ = is[i_1105_];
				if (i_1106_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1107_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1106_];
					for (int i_1108_ = 0; i_1108_ < is_1107_.length; i_1108_++) {
						int i_1109_ = is_1107_[i_1108_];
						((Class387_Sub3) this).anIntArray8238[i_1109_] += i_1092_;
						((Class387_Sub3) this).anIntArray8195[i_1109_] += i_1093_;
						((Class387_Sub3) this).anIntArray8180[i_1109_] += i_1094_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1110_ = 0; i_1110_ < i_1096_; i_1110_++) {
				int i_1111_ = is[i_1110_];
				if (i_1111_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1112_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1111_];
					if ((i_1095_ & 0x1) == 0) {
						for (int i_1113_ = 0; i_1113_ < is_1112_.length; i_1113_++) {
							int i_1114_ = is_1112_[i_1113_];
							((Class387_Sub3) this).anIntArray8238[i_1114_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1114_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1114_] -= ((Class387_Sub3) this).anInt8221;
							if (i_1094_ != 0) {
								int i_1115_ = Class257.anIntArray2683[i_1094_];
								int i_1116_ = Class257.anIntArray2684[i_1094_];
								int i_1117_ = (((((Class387_Sub3) this).anIntArray8195[i_1114_]) * i_1115_ + (((Class387_Sub3) this).anIntArray8238[i_1114_]) * i_1116_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8195[i_1114_] = ((((Class387_Sub3) this).anIntArray8195[i_1114_]) * i_1116_ - (((Class387_Sub3) this).anIntArray8238[i_1114_]) * i_1115_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1114_] = i_1117_;
							}
							if (i_1092_ != 0) {
								int i_1118_ = Class257.anIntArray2683[i_1092_];
								int i_1119_ = Class257.anIntArray2684[i_1092_];
								int i_1120_ = (((((Class387_Sub3) this).anIntArray8195[i_1114_]) * i_1119_ - (((Class387_Sub3) this).anIntArray8180[i_1114_]) * i_1118_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1114_] = ((((Class387_Sub3) this).anIntArray8195[i_1114_]) * i_1118_ + (((Class387_Sub3) this).anIntArray8180[i_1114_]) * i_1119_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_1114_] = i_1120_;
							}
							if (i_1093_ != 0) {
								int i_1121_ = Class257.anIntArray2683[i_1093_];
								int i_1122_ = Class257.anIntArray2684[i_1093_];
								int i_1123_ = (((((Class387_Sub3) this).anIntArray8180[i_1114_]) * i_1121_ + (((Class387_Sub3) this).anIntArray8238[i_1114_]) * i_1122_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1114_] = ((((Class387_Sub3) this).anIntArray8180[i_1114_]) * i_1122_ - (((Class387_Sub3) this).anIntArray8238[i_1114_]) * i_1121_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1114_] = i_1123_;
							}
							((Class387_Sub3) this).anIntArray8238[i_1114_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1114_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1114_] += ((Class387_Sub3) this).anInt8221;
						}
					} else {
						for (int i_1124_ = 0; i_1124_ < is_1112_.length; i_1124_++) {
							int i_1125_ = is_1112_[i_1124_];
							((Class387_Sub3) this).anIntArray8238[i_1125_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1125_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1125_] -= ((Class387_Sub3) this).anInt8221;
							if (i_1092_ != 0) {
								int i_1126_ = Class257.anIntArray2683[i_1092_];
								int i_1127_ = Class257.anIntArray2684[i_1092_];
								int i_1128_ = (((((Class387_Sub3) this).anIntArray8195[i_1125_]) * i_1127_ - (((Class387_Sub3) this).anIntArray8180[i_1125_]) * i_1126_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1125_] = ((((Class387_Sub3) this).anIntArray8195[i_1125_]) * i_1126_ + (((Class387_Sub3) this).anIntArray8180[i_1125_]) * i_1127_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_1125_] = i_1128_;
							}
							if (i_1094_ != 0) {
								int i_1129_ = Class257.anIntArray2683[i_1094_];
								int i_1130_ = Class257.anIntArray2684[i_1094_];
								int i_1131_ = (((((Class387_Sub3) this).anIntArray8195[i_1125_]) * i_1129_ + (((Class387_Sub3) this).anIntArray8238[i_1125_]) * i_1130_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8195[i_1125_] = ((((Class387_Sub3) this).anIntArray8195[i_1125_]) * i_1130_ - (((Class387_Sub3) this).anIntArray8238[i_1125_]) * i_1129_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1125_] = i_1131_;
							}
							if (i_1093_ != 0) {
								int i_1132_ = Class257.anIntArray2683[i_1093_];
								int i_1133_ = Class257.anIntArray2684[i_1093_];
								int i_1134_ = (((((Class387_Sub3) this).anIntArray8180[i_1125_]) * i_1132_ + (((Class387_Sub3) this).anIntArray8238[i_1125_]) * i_1133_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1125_] = ((((Class387_Sub3) this).anIntArray8180[i_1125_]) * i_1133_ - (((Class387_Sub3) this).anIntArray8238[i_1125_]) * i_1132_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1125_] = i_1134_;
							}
							((Class387_Sub3) this).anIntArray8238[i_1125_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1125_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1125_] += ((Class387_Sub3) this).anInt8221;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1135_ = 0; i_1135_ < i_1096_; i_1135_++) {
				int i_1136_ = is[i_1135_];
				if (i_1136_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1137_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1136_];
					for (int i_1138_ = 0; i_1138_ < is_1137_.length; i_1138_++) {
						int i_1139_ = is_1137_[i_1138_];
						((Class387_Sub3) this).anIntArray8238[i_1139_] -= ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_1139_] -= ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_1139_] -= ((Class387_Sub3) this).anInt8221;
						((Class387_Sub3) this).anIntArray8238[i_1139_] = (((Class387_Sub3) this).anIntArray8238[i_1139_] * i_1092_ / 128);
						((Class387_Sub3) this).anIntArray8195[i_1139_] = (((Class387_Sub3) this).anIntArray8195[i_1139_] * i_1093_ / 128);
						((Class387_Sub3) this).anIntArray8180[i_1139_] = (((Class387_Sub3) this).anIntArray8180[i_1139_] * i_1094_ / 128);
						((Class387_Sub3) this).anIntArray8238[i_1139_] += ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_1139_] += ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_1139_] += ((Class387_Sub3) this).anInt8221;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_1140_ = 0; i_1140_ < i_1096_; i_1140_++) {
					int i_1141_ = is[i_1140_];
					if (i_1141_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1142_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1141_]);
						for (int i_1143_ = 0; i_1143_ < is_1142_.length; i_1143_++) {
							int i_1144_ = is_1142_[i_1143_];
							int i_1145_ = (((((Class387_Sub3) this).aByteArray8200[i_1144_]) & 0xff) + i_1092_ * 8);
							if (i_1145_ < 0)
								i_1145_ = 0;
							else if (i_1145_ > 255)
								i_1145_ = 255;
							((Class387_Sub3) this).aByteArray8200[i_1144_] = (byte) i_1145_;
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1146_ = 0; i_1146_ < ((Class387_Sub3) this).anInt8215; i_1146_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1146_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1146_]);
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_1147_ = 0; i_1147_ < i_1096_; i_1147_++) {
					int i_1148_ = is[i_1147_];
					if (i_1148_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1149_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1148_]);
						for (int i_1150_ = 0; i_1150_ < is_1149_.length; i_1150_++) {
							int i_1151_ = is_1149_[i_1150_];
							int i_1152_ = ((((Class387_Sub3) this).modelColors[i_1151_]) & 0xffff);
							int i_1153_ = i_1152_ >> 10 & 0x3f;
							int i_1154_ = i_1152_ >> 7 & 0x7;
							int i_1155_ = i_1152_ & 0x7f;
							i_1153_ = i_1153_ + i_1092_ & 0x3f;
							i_1154_ += i_1093_;
							if (i_1154_ < 0)
								i_1154_ = 0;
							else if (i_1154_ > 7)
								i_1154_ = 7;
							i_1155_ += i_1094_;
							if (i_1155_ < 0)
								i_1155_ = 0;
							else if (i_1155_ > 127)
								i_1155_ = 127;
							((Class387_Sub3) this).modelColors[i_1151_] = (short) (i_1153_ << 10 | i_1154_ << 7 | i_1155_);
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1156_ = 0; i_1156_ < ((Class387_Sub3) this).anInt8215; i_1156_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1156_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1156_]);
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1157_ = 0; i_1157_ < i_1096_; i_1157_++) {
					int i_1158_ = is[i_1157_];
					if (i_1158_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1159_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1158_]);
						for (int i_1160_ = 0; i_1160_ < is_1159_.length; i_1160_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1159_[i_1160_]]);
							((Class10) class10).anInt159 += i_1092_ * 1013441605;
							((Class10) class10).anInt157 += i_1093_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1161_ = 0; i_1161_ < i_1096_; i_1161_++) {
					int i_1162_ = is[i_1161_];
					if (i_1162_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1163_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1162_]);
						for (int i_1164_ = 0; i_1164_ < is_1163_.length; i_1164_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1163_[i_1164_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_1092_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_1093_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1165_ = 0; i_1165_ < i_1096_; i_1165_++) {
					int i_1166_ = is[i_1165_];
					if (i_1166_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1167_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1166_]);
						for (int i_1168_ = 0; i_1168_ < is_1167_.length; i_1168_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1167_[i_1168_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_1092_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}

	void method4451(int i, int[] is, int i_1169_, int i_1170_, int i_1171_, int i_1172_, boolean bool) {
		int i_1173_ = is.length;
		if (i == 0) {
			i_1169_ <<= 4;
			i_1170_ <<= 4;
			i_1171_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1174_ = 0; i_1174_ < ((Class387_Sub3) this).anInt8174; i_1174_++) {
					((Class387_Sub3) this).anIntArray8238[i_1174_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1174_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1174_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_1175_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_1176_ = 0; i_1176_ < i_1173_; i_1176_++) {
				int i_1177_ = is[i_1176_];
				if (i_1177_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1178_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1177_];
					for (int i_1179_ = 0; i_1179_ < is_1178_.length; i_1179_++) {
						int i_1180_ = is_1178_[i_1179_];
						((Class387_Sub3) this).anInt8209 += ((Class387_Sub3) this).anIntArray8238[i_1180_];
						((Class387_Sub3) this).anInt8219 += ((Class387_Sub3) this).anIntArray8195[i_1180_];
						((Class387_Sub3) this).anInt8221 += ((Class387_Sub3) this).anIntArray8180[i_1180_];
						i_1175_++;
					}
				}
			}
			if (i_1175_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_1175_ + i_1169_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_1175_ + i_1170_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_1175_ + i_1171_;
			} else {
				((Class387_Sub3) this).anInt8209 = i_1169_;
				((Class387_Sub3) this).anInt8219 = i_1170_;
				((Class387_Sub3) this).anInt8221 = i_1171_;
			}
		} else if (i == 1) {
			i_1169_ <<= 4;
			i_1170_ <<= 4;
			i_1171_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1181_ = 0; i_1181_ < ((Class387_Sub3) this).anInt8174; i_1181_++) {
					((Class387_Sub3) this).anIntArray8238[i_1181_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1181_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1181_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_1182_ = 0; i_1182_ < i_1173_; i_1182_++) {
				int i_1183_ = is[i_1182_];
				if (i_1183_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1184_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1183_];
					for (int i_1185_ = 0; i_1185_ < is_1184_.length; i_1185_++) {
						int i_1186_ = is_1184_[i_1185_];
						((Class387_Sub3) this).anIntArray8238[i_1186_] += i_1169_;
						((Class387_Sub3) this).anIntArray8195[i_1186_] += i_1170_;
						((Class387_Sub3) this).anIntArray8180[i_1186_] += i_1171_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1187_ = 0; i_1187_ < i_1173_; i_1187_++) {
				int i_1188_ = is[i_1187_];
				if (i_1188_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1189_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1188_];
					if ((i_1172_ & 0x1) == 0) {
						for (int i_1190_ = 0; i_1190_ < is_1189_.length; i_1190_++) {
							int i_1191_ = is_1189_[i_1190_];
							((Class387_Sub3) this).anIntArray8238[i_1191_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1191_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1191_] -= ((Class387_Sub3) this).anInt8221;
							if (i_1171_ != 0) {
								int i_1192_ = Class257.anIntArray2683[i_1171_];
								int i_1193_ = Class257.anIntArray2684[i_1171_];
								int i_1194_ = (((((Class387_Sub3) this).anIntArray8195[i_1191_]) * i_1192_ + (((Class387_Sub3) this).anIntArray8238[i_1191_]) * i_1193_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8195[i_1191_] = ((((Class387_Sub3) this).anIntArray8195[i_1191_]) * i_1193_ - (((Class387_Sub3) this).anIntArray8238[i_1191_]) * i_1192_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1191_] = i_1194_;
							}
							if (i_1169_ != 0) {
								int i_1195_ = Class257.anIntArray2683[i_1169_];
								int i_1196_ = Class257.anIntArray2684[i_1169_];
								int i_1197_ = (((((Class387_Sub3) this).anIntArray8195[i_1191_]) * i_1196_ - (((Class387_Sub3) this).anIntArray8180[i_1191_]) * i_1195_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1191_] = ((((Class387_Sub3) this).anIntArray8195[i_1191_]) * i_1195_ + (((Class387_Sub3) this).anIntArray8180[i_1191_]) * i_1196_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_1191_] = i_1197_;
							}
							if (i_1170_ != 0) {
								int i_1198_ = Class257.anIntArray2683[i_1170_];
								int i_1199_ = Class257.anIntArray2684[i_1170_];
								int i_1200_ = (((((Class387_Sub3) this).anIntArray8180[i_1191_]) * i_1198_ + (((Class387_Sub3) this).anIntArray8238[i_1191_]) * i_1199_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1191_] = ((((Class387_Sub3) this).anIntArray8180[i_1191_]) * i_1199_ - (((Class387_Sub3) this).anIntArray8238[i_1191_]) * i_1198_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1191_] = i_1200_;
							}
							((Class387_Sub3) this).anIntArray8238[i_1191_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1191_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1191_] += ((Class387_Sub3) this).anInt8221;
						}
					} else {
						for (int i_1201_ = 0; i_1201_ < is_1189_.length; i_1201_++) {
							int i_1202_ = is_1189_[i_1201_];
							((Class387_Sub3) this).anIntArray8238[i_1202_] -= ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1202_] -= ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1202_] -= ((Class387_Sub3) this).anInt8221;
							if (i_1169_ != 0) {
								int i_1203_ = Class257.anIntArray2683[i_1169_];
								int i_1204_ = Class257.anIntArray2684[i_1169_];
								int i_1205_ = (((((Class387_Sub3) this).anIntArray8195[i_1202_]) * i_1204_ - (((Class387_Sub3) this).anIntArray8180[i_1202_]) * i_1203_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1202_] = ((((Class387_Sub3) this).anIntArray8195[i_1202_]) * i_1203_ + (((Class387_Sub3) this).anIntArray8180[i_1202_]) * i_1204_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8195[i_1202_] = i_1205_;
							}
							if (i_1171_ != 0) {
								int i_1206_ = Class257.anIntArray2683[i_1171_];
								int i_1207_ = Class257.anIntArray2684[i_1171_];
								int i_1208_ = (((((Class387_Sub3) this).anIntArray8195[i_1202_]) * i_1206_ + (((Class387_Sub3) this).anIntArray8238[i_1202_]) * i_1207_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8195[i_1202_] = ((((Class387_Sub3) this).anIntArray8195[i_1202_]) * i_1207_ - (((Class387_Sub3) this).anIntArray8238[i_1202_]) * i_1206_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1202_] = i_1208_;
							}
							if (i_1170_ != 0) {
								int i_1209_ = Class257.anIntArray2683[i_1170_];
								int i_1210_ = Class257.anIntArray2684[i_1170_];
								int i_1211_ = (((((Class387_Sub3) this).anIntArray8180[i_1202_]) * i_1209_ + (((Class387_Sub3) this).anIntArray8238[i_1202_]) * i_1210_ + 16383) >> 14);
								((Class387_Sub3) this).anIntArray8180[i_1202_] = ((((Class387_Sub3) this).anIntArray8180[i_1202_]) * i_1210_ - (((Class387_Sub3) this).anIntArray8238[i_1202_]) * i_1209_ + 16383) >> 14;
								((Class387_Sub3) this).anIntArray8238[i_1202_] = i_1211_;
							}
							((Class387_Sub3) this).anIntArray8238[i_1202_] += ((Class387_Sub3) this).anInt8209;
							((Class387_Sub3) this).anIntArray8195[i_1202_] += ((Class387_Sub3) this).anInt8219;
							((Class387_Sub3) this).anIntArray8180[i_1202_] += ((Class387_Sub3) this).anInt8221;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1212_ = 0; i_1212_ < i_1173_; i_1212_++) {
				int i_1213_ = is[i_1212_];
				if (i_1213_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1214_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1213_];
					for (int i_1215_ = 0; i_1215_ < is_1214_.length; i_1215_++) {
						int i_1216_ = is_1214_[i_1215_];
						((Class387_Sub3) this).anIntArray8238[i_1216_] -= ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_1216_] -= ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_1216_] -= ((Class387_Sub3) this).anInt8221;
						((Class387_Sub3) this).anIntArray8238[i_1216_] = (((Class387_Sub3) this).anIntArray8238[i_1216_] * i_1169_ / 128);
						((Class387_Sub3) this).anIntArray8195[i_1216_] = (((Class387_Sub3) this).anIntArray8195[i_1216_] * i_1170_ / 128);
						((Class387_Sub3) this).anIntArray8180[i_1216_] = (((Class387_Sub3) this).anIntArray8180[i_1216_] * i_1171_ / 128);
						((Class387_Sub3) this).anIntArray8238[i_1216_] += ((Class387_Sub3) this).anInt8209;
						((Class387_Sub3) this).anIntArray8195[i_1216_] += ((Class387_Sub3) this).anInt8219;
						((Class387_Sub3) this).anIntArray8180[i_1216_] += ((Class387_Sub3) this).anInt8221;
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_1217_ = 0; i_1217_ < i_1173_; i_1217_++) {
					int i_1218_ = is[i_1217_];
					if (i_1218_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1219_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1218_]);
						for (int i_1220_ = 0; i_1220_ < is_1219_.length; i_1220_++) {
							int i_1221_ = is_1219_[i_1220_];
							int i_1222_ = (((((Class387_Sub3) this).aByteArray8200[i_1221_]) & 0xff) + i_1169_ * 8);
							if (i_1222_ < 0)
								i_1222_ = 0;
							else if (i_1222_ > 255)
								i_1222_ = 255;
							((Class387_Sub3) this).aByteArray8200[i_1221_] = (byte) i_1222_;
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1223_ = 0; i_1223_ < ((Class387_Sub3) this).anInt8215; i_1223_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1223_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1223_]);
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_1224_ = 0; i_1224_ < i_1173_; i_1224_++) {
					int i_1225_ = is[i_1224_];
					if (i_1225_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1226_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1225_]);
						for (int i_1227_ = 0; i_1227_ < is_1226_.length; i_1227_++) {
							int i_1228_ = is_1226_[i_1227_];
							int i_1229_ = ((((Class387_Sub3) this).modelColors[i_1228_]) & 0xffff);
							int i_1230_ = i_1229_ >> 10 & 0x3f;
							int i_1231_ = i_1229_ >> 7 & 0x7;
							int i_1232_ = i_1229_ & 0x7f;
							i_1230_ = i_1230_ + i_1169_ & 0x3f;
							i_1231_ += i_1170_;
							if (i_1231_ < 0)
								i_1231_ = 0;
							else if (i_1231_ > 7)
								i_1231_ = 7;
							i_1232_ += i_1171_;
							if (i_1232_ < 0)
								i_1232_ = 0;
							else if (i_1232_ > 127)
								i_1232_ = 127;
							((Class387_Sub3) this).modelColors[i_1228_] = (short) (i_1230_ << 10 | i_1231_ << 7 | i_1232_);
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1233_ = 0; i_1233_ < ((Class387_Sub3) this).anInt8215; i_1233_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1233_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1233_]);
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1234_ = 0; i_1234_ < i_1173_; i_1234_++) {
					int i_1235_ = is[i_1234_];
					if (i_1235_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1236_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1235_]);
						for (int i_1237_ = 0; i_1237_ < is_1236_.length; i_1237_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1236_[i_1237_]]);
							((Class10) class10).anInt159 += i_1169_ * 1013441605;
							((Class10) class10).anInt157 += i_1170_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1238_ = 0; i_1238_ < i_1173_; i_1238_++) {
					int i_1239_ = is[i_1238_];
					if (i_1239_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1240_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1239_]);
						for (int i_1241_ = 0; i_1241_ < is_1240_.length; i_1241_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1240_[i_1241_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_1169_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_1170_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1242_ = 0; i_1242_ < i_1173_; i_1242_++) {
					int i_1243_ = is[i_1242_];
					if (i_1243_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1244_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1243_]);
						for (int i_1245_ = 0; i_1245_ < is_1244_.length; i_1245_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1244_[i_1245_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_1169_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}

	void bu(int i, int i_1246_, int i_1247_, int i_1248_) {
		if (i == 0) {
			int i_1249_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_1250_ = 0; i_1250_ < ((Class387_Sub3) this).anInt8174; i_1250_++) {
				((Class387_Sub3) this).anInt8209 += ((Class387_Sub3) this).anIntArray8238[i_1250_];
				((Class387_Sub3) this).anInt8219 += ((Class387_Sub3) this).anIntArray8195[i_1250_];
				((Class387_Sub3) this).anInt8221 += ((Class387_Sub3) this).anIntArray8180[i_1250_];
				i_1249_++;
			}
			if (i_1249_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_1249_ + i_1246_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_1249_ + i_1247_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_1249_ + i_1248_;
			} else {
				((Class387_Sub3) this).anInt8209 = i_1246_;
				((Class387_Sub3) this).anInt8219 = i_1247_;
				((Class387_Sub3) this).anInt8221 = i_1248_;
			}
		} else if (i == 1) {
			for (int i_1251_ = 0; i_1251_ < ((Class387_Sub3) this).anInt8174; i_1251_++) {
				((Class387_Sub3) this).anIntArray8238[i_1251_] += i_1246_;
				((Class387_Sub3) this).anIntArray8195[i_1251_] += i_1247_;
				((Class387_Sub3) this).anIntArray8180[i_1251_] += i_1248_;
			}
		} else if (i == 2) {
			for (int i_1252_ = 0; i_1252_ < ((Class387_Sub3) this).anInt8174; i_1252_++) {
				((Class387_Sub3) this).anIntArray8238[i_1252_] -= ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_1252_] -= ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_1252_] -= ((Class387_Sub3) this).anInt8221;
				if (i_1248_ != 0) {
					int i_1253_ = Class257.anIntArray2683[i_1248_];
					int i_1254_ = Class257.anIntArray2684[i_1248_];
					int i_1255_ = (((((Class387_Sub3) this).anIntArray8195[i_1252_] * i_1253_) + (((Class387_Sub3) this).anIntArray8238[i_1252_] * i_1254_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray8195[i_1252_] = ((((Class387_Sub3) this).anIntArray8195[i_1252_] * i_1254_) - (((Class387_Sub3) this).anIntArray8238[i_1252_] * i_1253_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray8238[i_1252_] = i_1255_;
				}
				if (i_1246_ != 0) {
					int i_1256_ = Class257.anIntArray2683[i_1246_];
					int i_1257_ = Class257.anIntArray2684[i_1246_];
					int i_1258_ = (((((Class387_Sub3) this).anIntArray8195[i_1252_] * i_1257_) - (((Class387_Sub3) this).anIntArray8180[i_1252_] * i_1256_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray8180[i_1252_] = ((((Class387_Sub3) this).anIntArray8195[i_1252_] * i_1256_) + (((Class387_Sub3) this).anIntArray8180[i_1252_] * i_1257_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray8195[i_1252_] = i_1258_;
				}
				if (i_1247_ != 0) {
					int i_1259_ = Class257.anIntArray2683[i_1247_];
					int i_1260_ = Class257.anIntArray2684[i_1247_];
					int i_1261_ = (((((Class387_Sub3) this).anIntArray8180[i_1252_] * i_1259_) + (((Class387_Sub3) this).anIntArray8238[i_1252_] * i_1260_) + 16383) >> 14);
					((Class387_Sub3) this).anIntArray8180[i_1252_] = ((((Class387_Sub3) this).anIntArray8180[i_1252_] * i_1260_) - (((Class387_Sub3) this).anIntArray8238[i_1252_] * i_1259_) + 16383) >> 14;
					((Class387_Sub3) this).anIntArray8238[i_1252_] = i_1261_;
				}
				((Class387_Sub3) this).anIntArray8238[i_1252_] += ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_1252_] += ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_1252_] += ((Class387_Sub3) this).anInt8221;
			}
		} else if (i == 3) {
			for (int i_1262_ = 0; i_1262_ < ((Class387_Sub3) this).anInt8174; i_1262_++) {
				((Class387_Sub3) this).anIntArray8238[i_1262_] -= ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_1262_] -= ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_1262_] -= ((Class387_Sub3) this).anInt8221;
				((Class387_Sub3) this).anIntArray8238[i_1262_] = (((Class387_Sub3) this).anIntArray8238[i_1262_] * i_1246_ / 128);
				((Class387_Sub3) this).anIntArray8195[i_1262_] = (((Class387_Sub3) this).anIntArray8195[i_1262_] * i_1247_ / 128);
				((Class387_Sub3) this).anIntArray8180[i_1262_] = (((Class387_Sub3) this).anIntArray8180[i_1262_] * i_1248_ / 128);
				((Class387_Sub3) this).anIntArray8238[i_1262_] += ((Class387_Sub3) this).anInt8209;
				((Class387_Sub3) this).anIntArray8195[i_1262_] += ((Class387_Sub3) this).anInt8219;
				((Class387_Sub3) this).anIntArray8180[i_1262_] += ((Class387_Sub3) this).anInt8221;
			}
		} else if (i == 5) {
			for (int i_1263_ = 0; i_1263_ < ((Class387_Sub3) this).anInt8184; i_1263_++) {
				int i_1264_ = ((((Class387_Sub3) this).aByteArray8200[i_1263_] & 0xff) + i_1246_ * 8);
				if (i_1264_ < 0)
					i_1264_ = 0;
				else if (i_1264_ > 255)
					i_1264_ = 255;
				((Class387_Sub3) this).aByteArray8200[i_1263_] = (byte) i_1264_;
			}
			if (((Class387_Sub3) this).aClass20Array8216 != null) {
				for (int i_1265_ = 0; i_1265_ < ((Class387_Sub3) this).anInt8215; i_1265_++) {
					Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1265_];
					Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1265_];
					((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & 0xffffff | (255 - ((((Class387_Sub3) this).aByteArray8200[((Class20) class20).modelColorIndex * 1557092081]) & 0xff)) << 24) * 680837181;
				}
			}
		} else if (i == 7) {
			for (int i_1266_ = 0; i_1266_ < ((Class387_Sub3) this).anInt8184; i_1266_++) {
				int i_1267_ = ((Class387_Sub3) this).modelColors[i_1266_] & 0xffff;
				int i_1268_ = i_1267_ >> 10 & 0x3f;
				int i_1269_ = i_1267_ >> 7 & 0x7;
				int i_1270_ = i_1267_ & 0x7f;
				i_1268_ = i_1268_ + i_1246_ & 0x3f;
				i_1269_ += i_1247_;
				if (i_1269_ < 0)
					i_1269_ = 0;
				else if (i_1269_ > 7)
					i_1269_ = 7;
				i_1270_ += i_1248_;
				if (i_1270_ < 0)
					i_1270_ = 0;
				else if (i_1270_ > 127)
					i_1270_ = 127;
				((Class387_Sub3) this).modelColors[i_1266_] = (short) (i_1268_ << 10 | i_1269_ << 7 | i_1270_);
			}
			((Class387_Sub3) this).aBoolean8207 = true;
			if (((Class387_Sub3) this).aClass20Array8216 != null) {
				for (int i_1271_ = 0; i_1271_ < ((Class387_Sub3) this).anInt8215; i_1271_++) {
					Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1271_];
					Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1271_];
					((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | ((Console.anIntArray4263[Class356.modifyColor(((((Class387_Sub3) this).modelColors[((((Class20) class20).modelColorIndex) * 1557092081)]) & 0xffff), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
				}
			}
		} else if (i == 8) {
			for (int i_1272_ = 0; i_1272_ < ((Class387_Sub3) this).anInt8215; i_1272_++) {
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1272_];
				((Class10) class10).anInt159 += i_1246_ * 1013441605;
				((Class10) class10).anInt157 += i_1247_ * 1685996777;
			}
		} else if (i == 10) {
			for (int i_1273_ = 0; i_1273_ < ((Class387_Sub3) this).anInt8215; i_1273_++) {
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1273_];
				((Class10) class10).aFloat154 = ((Class10) class10).aFloat154 * (float) i_1246_ / 128.0F;
				((Class10) class10).aFloat155 = ((Class10) class10).aFloat155 * (float) i_1247_ / 128.0F;
			}
		} else if (i == 9) {
			for (int i_1274_ = 0; i_1274_ < ((Class387_Sub3) this).anInt8215; i_1274_++) {
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1274_];
				((Class10) class10).anInt158 = (((Class10) class10).anInt158 * -492325789 + i_1246_ & 0x3fff) * 800091467;
			}
		}
	}

	public void method4477(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub3) this).aShortArray8242 != null) {
			Class6 class6 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread());
			Class247 class247_1275_ = ((Class6) class6).aClass247_98;
			class247_1275_.method2454(class247);
			if (bool)
				class247_1275_.method2459();
			Class249 class249 = ((Class6) class6).aClass249_99;
			class249.method2508(class247_1275_);
			float[] fs = new float[3];
			for (int i_1276_ = 0; i_1276_ < ((Class387_Sub3) this).anInt8185; i_1276_++) {
				if ((i & ((Class387_Sub3) this).aShortArray8242[i_1276_]) != 0) {
					class249.method2511((float) (((Class387_Sub3) this).anIntArray8238[i_1276_]), (float) (((Class387_Sub3) this).anIntArray8195[i_1276_]), (float) (((Class387_Sub3) this).anIntArray8180[i_1276_]), fs);
					((Class387_Sub3) this).anIntArray8238[i_1276_] = (int) fs[0];
					((Class387_Sub3) this).anIntArray8195[i_1276_] = (int) fs[1];
					((Class387_Sub3) this).anIntArray8180[i_1276_] = (int) fs[2];
				}
			}
		}
	}

	public void ed(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method4534();
		else if (i == 8192)
			method4537();
		else if (i == 12288)
			method4538();
		else {
			int i_1277_ = Class257.anIntArray2683[i];
			int i_1278_ = Class257.anIntArray2684[i];
			synchronized (this) {
				for (int i_1279_ = 0; i_1279_ < ((Class387_Sub3) this).anInt8174; i_1279_++) {
					int i_1280_ = (((((Class387_Sub3) this).anIntArray8180[i_1279_] * i_1277_) + (((Class387_Sub3) this).anIntArray8238[i_1279_] * i_1278_)) >> 14);
					((Class387_Sub3) this).anIntArray8180[i_1279_] = ((((Class387_Sub3) this).anIntArray8180[i_1279_] * i_1278_) - (((Class387_Sub3) this).anIntArray8238[i_1279_] * i_1277_)) >> 14;
					((Class387_Sub3) this).anIntArray8238[i_1279_] = i_1280_;
				}
				method4540();
			}
		}
	}

	public void method4481(Class247 class247, int i, boolean bool) {
		if (((Class387_Sub3) this).aShortArray8242 != null) {
			Class6 class6 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread());
			Class247 class247_1281_ = ((Class6) class6).aClass247_98;
			class247_1281_.method2454(class247);
			if (bool)
				class247_1281_.method2459();
			Class249 class249 = ((Class6) class6).aClass249_99;
			class249.method2508(class247_1281_);
			float[] fs = new float[3];
			for (int i_1282_ = 0; i_1282_ < ((Class387_Sub3) this).anInt8185; i_1282_++) {
				if ((i & ((Class387_Sub3) this).aShortArray8242[i_1282_]) != 0) {
					class249.method2511((float) (((Class387_Sub3) this).anIntArray8238[i_1282_]), (float) (((Class387_Sub3) this).anIntArray8195[i_1282_]), (float) (((Class387_Sub3) this).anIntArray8180[i_1282_]), fs);
					((Class387_Sub3) this).anIntArray8238[i_1282_] = (int) fs[0];
					((Class387_Sub3) this).anIntArray8195[i_1282_] = (int) fs[1];
					((Class387_Sub3) this).anIntArray8180[i_1282_] = (int) fs[2];
				}
			}
		}
	}

	public void method4461(Class247 class247, Class80 class80, int i) {
		method4541(class247, class80, i);
	}

	Class387_Sub3(Class_ra_Sub3 class_ra_sub3) {
		((Class387_Sub3) this).anInt8184 = 0;
		((Class387_Sub3) this).anInt8196 = 0;
		((Class387_Sub3) this).aBoolean8208 = false;
		((Class387_Sub3) this).aBoolean8212 = false;
		((Class387_Sub3) this).aBoolean8187 = false;
		((Class387_Sub3) this).aBoolean8228 = false;
		((Class387_Sub3) this).aBoolean8229 = false;
		((Class387_Sub3) this).aClass_ra_Sub3_8165 = class_ra_sub3;
	}

	public void ao(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				if (i == 4096) {
					method4550();
					break;
				}
				if (i == 8192) {
					method4539();
					break;
				}
				if (i == 12288) {
					method4556();
					break;
				}
				int i_1283_ = Class257.anIntArray2683[i];
				int i_1284_ = Class257.anIntArray2684[i];
				synchronized (this) {
					for (int i_1285_ = 0; i_1285_ < ((Class387_Sub3) this).anInt8185; i_1285_++) {
						int i_1286_ = (((((Class387_Sub3) this).anIntArray8180[i_1285_] * i_1283_) + (((Class387_Sub3) this).anIntArray8238[i_1285_]) * i_1284_) >> 14);
						((Class387_Sub3) this).anIntArray8180[i_1285_] = ((((Class387_Sub3) this).anIntArray8180[i_1285_] * i_1284_) - (((Class387_Sub3) this).anIntArray8238[i_1285_]) * i_1283_) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_1285_] = i_1286_;
						if (((Class387_Sub3) this).aClass21Array8182[i_1285_] != null) {
							i_1286_ = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1285_])).anInt254) * i_1283_ + (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1285_])).anInt252) * i_1284_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1285_])).anInt254 = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1285_])).anInt254) * i_1284_ - (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1285_])).anInt252) * i_1283_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1285_])).anInt252 = i_1286_;
						}
					}
					if (((Class387_Sub3) this).aClass25Array8197 != null) {
						for (int i_1287_ = 0; i_1287_ < ((Class387_Sub3) this).anInt8184; i_1287_++) {
							if ((((Class387_Sub3) this).aClass25Array8197[i_1287_]) != null) {
								int i_1288_ = (((((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1287_])).anInt308 * i_1283_) + (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1287_])).anInt306 * i_1284_)) >> 14);
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1287_])).anInt308 = ((((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1287_])).anInt308 * i_1284_) - (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1287_])).anInt306 * i_1283_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1287_])).anInt306 = i_1288_;
							}
						}
					}
					for (int i_1289_ = ((Class387_Sub3) this).anInt8185; i_1289_ < ((Class387_Sub3) this).anInt8174; i_1289_++) {
						int i_1290_ = (((((Class387_Sub3) this).anIntArray8180[i_1289_] * i_1283_) + (((Class387_Sub3) this).anIntArray8238[i_1289_]) * i_1284_) >> 14);
						((Class387_Sub3) this).anIntArray8180[i_1289_] = ((((Class387_Sub3) this).anIntArray8180[i_1289_] * i_1284_) - (((Class387_Sub3) this).anIntArray8238[i_1289_]) * i_1283_) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_1289_] = i_1290_;
					}
					((Class387_Sub3) this).anInt8196 = 0;
					((Class387_Sub3) this).aBoolean8187 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void method4479() {
		/* empty */
	}

	void method4553() {
		if (((Class387_Sub3) this).anInt8196 == 0)
			method4532(false);
		else {
			do {
				if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650 * -595900225) > 1) {
					synchronized (this) {
						method4535();
						break;
					}
				}
				method4535();
			} while (false);
		}
	}

	public void ia(int i, int i_1291_, int i_1292_) {
		if (i != 0 && (((Class387_Sub3) this).anInt8172 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1291_ != 0 && (((Class387_Sub3) this).anInt8172 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1292_ != 0 && (((Class387_Sub3) this).anInt8172 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1293_ = 0; i_1293_ < ((Class387_Sub3) this).anInt8174; i_1293_++) {
				((Class387_Sub3) this).anIntArray8238[i_1293_] += i;
				((Class387_Sub3) this).anIntArray8195[i_1293_] += i_1291_;
				((Class387_Sub3) this).anIntArray8180[i_1293_] += i_1292_;
			}
		}
	}

	public void wa() {
		if ((((Class387_Sub3) this).anInt8172 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8174; i++)
				((Class387_Sub3) this).anIntArray8180[i] = -((Class387_Sub3) this).anIntArray8180[i];
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++) {
					if (((Class387_Sub3) this).aClass21Array8182[i] != null)
						((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt254 = -((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt254;
				}
			}
			if (((Class387_Sub3) this).aClass21Array8183 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++) {
					if (((Class387_Sub3) this).aClass21Array8183[i] != null)
						((Class21) ((Class387_Sub3) this).aClass21Array8183[i]).anInt254 = -((Class21) (((Class387_Sub3) this).aClass21Array8183[i])).anInt254;
				}
			}
			if (((Class387_Sub3) this).aClass25Array8197 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (((Class387_Sub3) this).aClass25Array8197[i] != null)
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt308 = -((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt308;
				}
			}
			short[] is = ((Class387_Sub3) this).aShortArray8173;
			((Class387_Sub3) this).aShortArray8173 = ((Class387_Sub3) this).aShortArray8217;
			((Class387_Sub3) this).aShortArray8217 = is;
			if (((Class387_Sub3) this).aFloatArrayArray8188 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (((Class387_Sub3) this).aFloatArrayArray8188[i] != null) {
						float f = (((Class387_Sub3) this).aFloatArrayArray8188[i][0]);
						((Class387_Sub3) this).aFloatArrayArray8188[i][0] = (((Class387_Sub3) this).aFloatArrayArray8188[i][2]);
						((Class387_Sub3) this).aFloatArrayArray8188[i][2] = f;
					}
					if (((Class387_Sub3) this).aFloatArrayArray8189[i] != null) {
						float f = (((Class387_Sub3) this).aFloatArrayArray8189[i][0]);
						((Class387_Sub3) this).aFloatArrayArray8189[i][0] = (((Class387_Sub3) this).aFloatArrayArray8189[i][2]);
						((Class387_Sub3) this).aFloatArrayArray8189[i][2] = f;
					}
				}
			}
			((Class387_Sub3) this).aBoolean8187 = false;
			((Class387_Sub3) this).anInt8196 = 0;
		}
	}

	public boolean method4469(int i, int i_1294_, Class247 class247, boolean bool, int i_1295_) {
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 class249 = ((Class6) ((Class387_Sub3) this).aClass6_8162).aClass249_99;
		class249.method2508(class247);
		Class249 class249_1296_ = ((Class6) ((Class387_Sub3) this).aClass6_8162).aClass249_100;
		class249_1296_.method2510(class249);
		class249_1296_.method2483(((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aClass249_8634);
		boolean bool_1297_ = false;
		int i_1298_ = 2147483647;
		int i_1299_ = -2147483648;
		int i_1300_ = 2147483647;
		int i_1301_ = -2147483648;
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		int i_1302_ = ((((Class387_Sub3) this).aShort8225 - ((Class387_Sub3) this).aShort8224) >> 1);
		int i_1303_ = ((((Class387_Sub3) this).aShort8223 - ((Class387_Sub3) this).aShort8214) >> 1);
		int i_1304_ = ((((Class387_Sub3) this).aShort8227 - ((Class387_Sub3) this).aShort8226) >> 1);
		int i_1305_ = ((Class387_Sub3) this).aShort8224 + i_1302_;
		int i_1306_ = ((Class387_Sub3) this).aShort8214 + i_1303_;
		int i_1307_ = ((Class387_Sub3) this).aShort8226 + i_1304_;
		int i_1308_ = i_1305_ - (i_1302_ << i_1295_);
		int i_1309_ = i_1306_ - (i_1303_ << i_1295_);
		int i_1310_ = i_1307_ - (i_1304_ << i_1295_);
		int i_1311_ = i_1305_ + (i_1302_ << i_1295_);
		int i_1312_ = i_1306_ + (i_1303_ << i_1295_);
		int i_1313_ = i_1307_ + (i_1304_ << i_1295_);
		((Class387_Sub3) this).anIntArray8177[0] = i_1308_;
		((Class387_Sub3) this).anIntArray8178[0] = i_1309_;
		((Class387_Sub3) this).anIntArray8179[0] = i_1310_;
		((Class387_Sub3) this).anIntArray8177[1] = i_1311_;
		((Class387_Sub3) this).anIntArray8178[1] = i_1309_;
		((Class387_Sub3) this).anIntArray8179[1] = i_1310_;
		((Class387_Sub3) this).anIntArray8177[2] = i_1308_;
		((Class387_Sub3) this).anIntArray8178[2] = i_1312_;
		((Class387_Sub3) this).anIntArray8179[2] = i_1310_;
		((Class387_Sub3) this).anIntArray8177[3] = i_1311_;
		((Class387_Sub3) this).anIntArray8178[3] = i_1312_;
		((Class387_Sub3) this).anIntArray8179[3] = i_1310_;
		((Class387_Sub3) this).anIntArray8177[4] = i_1308_;
		((Class387_Sub3) this).anIntArray8178[4] = i_1309_;
		((Class387_Sub3) this).anIntArray8179[4] = i_1313_;
		((Class387_Sub3) this).anIntArray8177[5] = i_1311_;
		((Class387_Sub3) this).anIntArray8178[5] = i_1309_;
		((Class387_Sub3) this).anIntArray8179[5] = i_1313_;
		((Class387_Sub3) this).anIntArray8177[6] = i_1308_;
		((Class387_Sub3) this).anIntArray8178[6] = i_1312_;
		((Class387_Sub3) this).anIntArray8179[6] = i_1313_;
		((Class387_Sub3) this).anIntArray8177[7] = i_1311_;
		((Class387_Sub3) this).anIntArray8178[7] = i_1312_;
		((Class387_Sub3) this).anIntArray8179[7] = i_1313_;
		for (int i_1314_ = 0; i_1314_ < 8; i_1314_++) {
			int i_1315_ = ((Class387_Sub3) this).anIntArray8177[i_1314_];
			int i_1316_ = ((Class387_Sub3) this).anIntArray8178[i_1314_];
			int i_1317_ = ((Class387_Sub3) this).anIntArray8179[i_1314_];
			float f = (class249_1296_.aFloatArray2631[2] * (float) i_1315_ + class249_1296_.aFloatArray2631[6] * (float) i_1316_ + class249_1296_.aFloatArray2631[10] * (float) i_1317_ + class249_1296_.aFloatArray2631[14]);
			float f_1318_ = (class249_1296_.aFloatArray2631[3] * (float) i_1315_ + class249_1296_.aFloatArray2631[7] * (float) i_1316_ + class249_1296_.aFloatArray2631[11] * (float) i_1317_ + class249_1296_.aFloatArray2631[15]);
			if (f >= -f_1318_) {
				float f_1319_ = (class249_1296_.aFloatArray2631[0] * (float) i_1315_ + class249_1296_.aFloatArray2631[4] * (float) i_1316_ + class249_1296_.aFloatArray2631[8] * (float) i_1317_ + class249_1296_.aFloatArray2631[12]);
				float f_1320_ = (class249_1296_.aFloatArray2631[1] * (float) i_1315_ + class249_1296_.aFloatArray2631[5] * (float) i_1316_ + class249_1296_.aFloatArray2631[9] * (float) i_1317_ + class249_1296_.aFloatArray2631[13]);
				int i_1321_ = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8641) + (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8640) * f_1319_ / f_1318_);
				int i_1322_ = (int) ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8643) + (((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).aFloat8642) * f_1320_ / f_1318_);
				if (i_1321_ < i_1298_)
					i_1298_ = i_1321_;
				if (i_1321_ > i_1299_)
					i_1299_ = i_1321_;
				if (i_1322_ < i_1300_)
					i_1300_ = i_1322_;
				if (i_1322_ > i_1301_)
					i_1301_ = i_1322_;
				bool_1297_ = true;
			}
		}
		if (bool_1297_ && i > i_1298_ && i < i_1299_ && i_1294_ > i_1300_ && i_1294_ < i_1301_) {
			if (bool)
				return true;
			for (int i_1323_ = 0; i_1323_ < ((Class387_Sub3) this).anInt8174; i_1323_++) {
				int i_1324_ = ((Class387_Sub3) this).anIntArray8238[i_1323_];
				int i_1325_ = ((Class387_Sub3) this).anIntArray8195[i_1323_];
				int i_1326_ = ((Class387_Sub3) this).anIntArray8180[i_1323_];
				float f = (class249_1296_.aFloatArray2631[2] * (float) i_1324_ + class249_1296_.aFloatArray2631[6] * (float) i_1325_ + class249_1296_.aFloatArray2631[10] * (float) i_1326_ + class249_1296_.aFloatArray2631[14]);
				float f_1327_ = (class249_1296_.aFloatArray2631[3] * (float) i_1324_ + class249_1296_.aFloatArray2631[7] * (float) i_1325_ + class249_1296_.aFloatArray2631[11] * (float) i_1326_ + class249_1296_.aFloatArray2631[15]);
				if (f >= -f_1327_) {
					float f_1328_ = (class249_1296_.aFloatArray2631[0] * (float) i_1324_ + (class249_1296_.aFloatArray2631[4] * (float) i_1325_) + (class249_1296_.aFloatArray2631[8] * (float) i_1326_) + class249_1296_.aFloatArray2631[12]);
					float f_1329_ = (class249_1296_.aFloatArray2631[1] * (float) i_1324_ + (class249_1296_.aFloatArray2631[5] * (float) i_1325_) + (class249_1296_.aFloatArray2631[9] * (float) i_1326_) + class249_1296_.aFloatArray2631[13]);
					((Class387_Sub3) this).aFloatArray8232[i_1323_] = (float) (int) (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8641 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8640 * f_1328_ / f_1327_));
					((Class387_Sub3) this).aFloatArray8233[i_1323_] = (float) (int) (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8643 + (((Class_ra_Sub3) (((Class387_Sub3) this).aClass_ra_Sub3_8165)).aFloat8642 * f_1329_ / f_1327_));
				} else
					((Class387_Sub3) this).aFloatArray8232[i_1323_] = -999999.0F;
			}
			for (int i_1330_ = 0; i_1330_ < ((Class387_Sub3) this).anInt8184; i_1330_++) {
				if (((((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8173[i_1330_]]) != -999999.0F) && ((((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8186[i_1330_]]) != -999999.0F) && ((((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8217[i_1330_]]) != -999999.0F) && (method4546(i, i_1294_, (((Class387_Sub3) this).aFloatArray8233[((Class387_Sub3) this).aShortArray8173[i_1330_]]), (((Class387_Sub3) this).aFloatArray8233[((Class387_Sub3) this).aShortArray8186[i_1330_]]), (((Class387_Sub3) this).aFloatArray8233[((Class387_Sub3) this).aShortArray8217[i_1330_]]), (((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8173[i_1330_]]), (((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8186[i_1330_]]), (((Class387_Sub3) this).aFloatArray8232[((Class387_Sub3) this).aShortArray8217[i_1330_]]))))
					return true;
			}
		}
		return false;
	}

	public void method4465(Class247 class247) {
		method4529(((Class387_Sub3) this).aClass_ra_Sub3_8165.method5206(Thread.currentThread()));
		Class249 class249 = ((Class6) ((Class387_Sub3) this).aClass6_8162).aClass249_99;
		class249.method2508(class247);
		if (((Class387_Sub3) this).aClass93Array8213 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass93Array8213.length; i++) {
				Class93 class93 = ((Class387_Sub3) this).aClass93Array8213[i];
				Class93 class93_1331_ = class93;
				if (class93.aClass93_833 != null)
					class93_1331_ = class93.aClass93_833;
				class93_1331_.anInt838 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt841 * -1670679901)])))) * 432673201);
				class93_1331_.anInt832 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt841 * -1670679901)])))) * -1138862783);
				class93_1331_.anInt840 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt841 * -1670679901])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt841 * -1670679901)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt841 * -1670679901)])))) * -555868357);
				class93_1331_.anInt837 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt835 * -614748507)])))) * -707023853);
				class93_1331_.anInt842 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt835 * -614748507)])))) * -648890367);
				class93_1331_.anInt845 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt835 * -614748507])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[(class93.anInt835 * -614748507)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt835 * -614748507)])))) * -1672139309);
				class93_1331_.anInt839 = (int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt836 * -878748965)])))) * 488615051;
				class93_1331_.anInt844 = (int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt836 * -878748965)])))) * 197668655;
				class93_1331_.anInt846 = (int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[class93.anInt836 * -878748965])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class93.anInt836 * -878748965)])))) * 471540135;
			}
		}
		if (((Class387_Sub3) this).aClass64Array8160 != null) {
			for (int i = 0; i < ((Class387_Sub3) this).aClass64Array8160.length; i++) {
				Class64 class64 = ((Class387_Sub3) this).aClass64Array8160[i];
				Class64 class64_1332_ = class64;
				if (class64.aClass64_562 != null)
					class64_1332_ = class64.aClass64_562;
				if (class64.aClass249_568 != null)
					class64.aClass249_568.method2510(class249);
				else
					class64.aClass249_568 = new Class249(class249);
				class64_1332_.anInt565 = ((int) (class249.aFloatArray2631[12] + ((class249.aFloatArray2631[0] * (float) (((Class387_Sub3) this).anIntArray8238[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[4] * (float) (((Class387_Sub3) this).anIntArray8195[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[8] * (float) (((Class387_Sub3) this).anIntArray8180[(class64.anInt566 * 1669844747)])))) * -686746519);
				class64_1332_.anInt563 = ((int) (class249.aFloatArray2631[13] + ((class249.aFloatArray2631[1] * (float) (((Class387_Sub3) this).anIntArray8238[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[5] * (float) (((Class387_Sub3) this).anIntArray8195[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[9] * (float) (((Class387_Sub3) this).anIntArray8180[(class64.anInt566 * 1669844747)])))) * -635472619);
				class64_1332_.anInt567 = ((int) (class249.aFloatArray2631[14] + ((class249.aFloatArray2631[2] * (float) (((Class387_Sub3) this).anIntArray8238[class64.anInt566 * 1669844747])) + (class249.aFloatArray2631[6] * (float) (((Class387_Sub3) this).anIntArray8195[(class64.anInt566 * 1669844747)])) + (class249.aFloatArray2631[10] * (float) (((Class387_Sub3) this).anIntArray8180[(class64.anInt566 * 1669844747)])))) * 1225142127);
			}
		}
	}

	public Class_na ce(Class_na class_na) {
		return null;
	}

	public boolean method4462() {
		if (((Class387_Sub3) this).aShortArray8201 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub3) this).aShortArray8201.length; i++) {
			if (((Class387_Sub3) this).aShortArray8201[i] != -1 && !((Class387_Sub3) this).aClass_ra_Sub3_8165.method5189(((Class387_Sub3) this).aShortArray8201[i]))
				return false;
		}
		return true;
	}

	public int cj() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8198;
	}

	public int cy() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8198;
	}

	public int cb() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8198;
	}

	public int ct() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8224;
	}

	public int cd() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8225;
	}

	public int o() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8223;
	}

	public int co() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8214;
	}

	public int RA() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8224;
	}

	public int cw() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8223;
	}

	public int cq() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8223;
	}

	public int ci() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8223;
	}

	public int cs() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8226;
	}

	public byte[] dz() {
		return ((Class387_Sub3) this).aByteArray8200;
	}

	public void ck(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8236 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	public void cl(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8236 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	public void cp(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class387_Sub3) this).anInt8236 = i;
		((Class387_Sub3) this).anInt8196 = 0;
	}

	void er(int i, int[] is, int i_1333_, int i_1334_, int i_1335_, boolean bool, int i_1336_, int[] is_1337_) {
		int i_1338_ = is.length;
		if (i == 0) {
			i_1333_ <<= 4;
			i_1334_ <<= 4;
			i_1335_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1339_ = 0; i_1339_ < ((Class387_Sub3) this).anInt8174; i_1339_++) {
					((Class387_Sub3) this).anIntArray8238[i_1339_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1339_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1339_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_1340_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_1341_ = 0; i_1341_ < i_1338_; i_1341_++) {
				int i_1342_ = is[i_1341_];
				if (i_1342_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1343_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1342_];
					for (int i_1344_ = 0; i_1344_ < is_1343_.length; i_1344_++) {
						int i_1345_ = is_1343_[i_1344_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_1336_ & (((Class387_Sub3) this).aShortArray8242[i_1345_])) != 0) {
							((Class387_Sub3) this).anInt8209 += (((Class387_Sub3) this).anIntArray8238[i_1345_]);
							((Class387_Sub3) this).anInt8219 += (((Class387_Sub3) this).anIntArray8195[i_1345_]);
							((Class387_Sub3) this).anInt8221 += (((Class387_Sub3) this).anIntArray8180[i_1345_]);
							i_1340_++;
						}
					}
				}
			}
			if (i_1340_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_1340_ + i_1333_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_1340_ + i_1334_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_1340_ + i_1335_;
				((Class387_Sub3) this).aBoolean8212 = true;
			} else {
				((Class387_Sub3) this).anInt8209 = i_1333_;
				((Class387_Sub3) this).anInt8219 = i_1334_;
				((Class387_Sub3) this).anInt8221 = i_1335_;
			}
		} else if (i == 1) {
			if (is_1337_ != null) {
				int i_1346_ = ((is_1337_[0] * i_1333_ + is_1337_[1] * i_1334_ + is_1337_[2] * i_1335_ + 8192) >> 14);
				int i_1347_ = ((is_1337_[3] * i_1333_ + is_1337_[4] * i_1334_ + is_1337_[5] * i_1335_ + 8192) >> 14);
				int i_1348_ = ((is_1337_[6] * i_1333_ + is_1337_[7] * i_1334_ + is_1337_[8] * i_1335_ + 8192) >> 14);
				i_1333_ = i_1346_;
				i_1334_ = i_1347_;
				i_1335_ = i_1348_;
			}
			i_1333_ <<= 4;
			i_1334_ <<= 4;
			i_1335_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1349_ = 0; i_1349_ < ((Class387_Sub3) this).anInt8174; i_1349_++) {
					((Class387_Sub3) this).anIntArray8238[i_1349_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1349_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1349_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_1350_ = 0; i_1350_ < i_1338_; i_1350_++) {
				int i_1351_ = is[i_1350_];
				if (i_1351_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1352_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1351_];
					for (int i_1353_ = 0; i_1353_ < is_1352_.length; i_1353_++) {
						int i_1354_ = is_1352_[i_1353_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_1336_ & (((Class387_Sub3) this).aShortArray8242[i_1354_])) != 0) {
							((Class387_Sub3) this).anIntArray8238[i_1354_] += i_1333_;
							((Class387_Sub3) this).anIntArray8195[i_1354_] += i_1334_;
							((Class387_Sub3) this).anIntArray8180[i_1354_] += i_1335_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1337_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_1355_ = 0; i_1355_ < ((Class387_Sub3) this).anInt8174; i_1355_++) {
						((Class387_Sub3) this).anIntArray8238[i_1355_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_1355_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_1355_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_1356_ = is_1337_[9] << 4;
				int i_1357_ = is_1337_[10] << 4;
				int i_1358_ = is_1337_[11] << 4;
				int i_1359_ = is_1337_[12] << 4;
				int i_1360_ = is_1337_[13] << 4;
				int i_1361_ = is_1337_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_1362_ = ((is_1337_[0] * ((Class387_Sub3) this).anInt8209 + is_1337_[3] * ((Class387_Sub3) this).anInt8219 + is_1337_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1363_ = ((is_1337_[1] * ((Class387_Sub3) this).anInt8209 + is_1337_[4] * ((Class387_Sub3) this).anInt8219 + is_1337_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1364_ = ((is_1337_[2] * ((Class387_Sub3) this).anInt8209 + is_1337_[5] * ((Class387_Sub3) this).anInt8219 + is_1337_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_1362_ += i_1359_;
					i_1363_ += i_1360_;
					i_1364_ += i_1361_;
					((Class387_Sub3) this).anInt8209 = i_1362_;
					((Class387_Sub3) this).anInt8219 = i_1363_;
					((Class387_Sub3) this).anInt8221 = i_1364_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int[] is_1365_ = new int[9];
				int i_1366_ = Class257.anIntArray2684[i_1333_];
				int i_1367_ = Class257.anIntArray2683[i_1333_];
				int i_1368_ = Class257.anIntArray2684[i_1334_];
				int i_1369_ = Class257.anIntArray2683[i_1334_];
				int i_1370_ = Class257.anIntArray2684[i_1335_];
				int i_1371_ = Class257.anIntArray2683[i_1335_];
				int i_1372_ = i_1367_ * i_1370_ + 8192 >> 14;
				int i_1373_ = i_1367_ * i_1371_ + 8192 >> 14;
				is_1365_[0] = i_1368_ * i_1370_ + i_1369_ * i_1373_ + 8192 >> 14;
				is_1365_[1] = -i_1368_ * i_1371_ + i_1369_ * i_1372_ + 8192 >> 14;
				is_1365_[2] = i_1369_ * i_1366_ + 8192 >> 14;
				is_1365_[3] = i_1366_ * i_1371_ + 8192 >> 14;
				is_1365_[4] = i_1366_ * i_1370_ + 8192 >> 14;
				is_1365_[5] = -i_1367_;
				is_1365_[6] = -i_1369_ * i_1370_ + i_1368_ * i_1373_ + 8192 >> 14;
				is_1365_[7] = i_1369_ * i_1371_ + i_1368_ * i_1372_ + 8192 >> 14;
				is_1365_[8] = i_1368_ * i_1366_ + 8192 >> 14;
				int i_1374_ = ((is_1365_[0] * -((Class387_Sub3) this).anInt8209 + is_1365_[1] * -((Class387_Sub3) this).anInt8219 + is_1365_[2] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1375_ = ((is_1365_[3] * -((Class387_Sub3) this).anInt8209 + is_1365_[4] * -((Class387_Sub3) this).anInt8219 + is_1365_[5] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1376_ = ((is_1365_[6] * -((Class387_Sub3) this).anInt8209 + is_1365_[7] * -((Class387_Sub3) this).anInt8219 + is_1365_[8] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1377_ = i_1374_ + ((Class387_Sub3) this).anInt8209;
				int i_1378_ = i_1375_ + ((Class387_Sub3) this).anInt8219;
				int i_1379_ = i_1376_ + ((Class387_Sub3) this).anInt8221;
				int[] is_1380_ = new int[9];
				for (int i_1381_ = 0; i_1381_ < 3; i_1381_++) {
					for (int i_1382_ = 0; i_1382_ < 3; i_1382_++) {
						int i_1383_ = 0;
						for (int i_1384_ = 0; i_1384_ < 3; i_1384_++)
							i_1383_ += (is_1365_[i_1381_ * 3 + i_1384_] * is_1337_[i_1382_ * 3 + i_1384_]);
						is_1380_[i_1381_ * 3 + i_1382_] = i_1383_ + 8192 >> 14;
					}
				}
				int i_1385_ = ((is_1365_[0] * i_1359_ + is_1365_[1] * i_1360_ + is_1365_[2] * i_1361_ + 8192) >> 14);
				int i_1386_ = ((is_1365_[3] * i_1359_ + is_1365_[4] * i_1360_ + is_1365_[5] * i_1361_ + 8192) >> 14);
				int i_1387_ = ((is_1365_[6] * i_1359_ + is_1365_[7] * i_1360_ + is_1365_[8] * i_1361_ + 8192) >> 14);
				i_1385_ += i_1377_;
				i_1386_ += i_1378_;
				i_1387_ += i_1379_;
				int[] is_1388_ = new int[9];
				for (int i_1389_ = 0; i_1389_ < 3; i_1389_++) {
					for (int i_1390_ = 0; i_1390_ < 3; i_1390_++) {
						int i_1391_ = 0;
						for (int i_1392_ = 0; i_1392_ < 3; i_1392_++)
							i_1391_ += (is_1337_[i_1389_ * 3 + i_1392_] * is_1380_[i_1390_ + i_1392_ * 3]);
						is_1388_[i_1389_ * 3 + i_1390_] = i_1391_ + 8192 >> 14;
					}
				}
				int i_1393_ = ((is_1337_[0] * i_1385_ + is_1337_[1] * i_1386_ + is_1337_[2] * i_1387_ + 8192) >> 14);
				int i_1394_ = ((is_1337_[3] * i_1385_ + is_1337_[4] * i_1386_ + is_1337_[5] * i_1387_ + 8192) >> 14);
				int i_1395_ = ((is_1337_[6] * i_1385_ + is_1337_[7] * i_1386_ + is_1337_[8] * i_1387_ + 8192) >> 14);
				i_1393_ += i_1356_;
				i_1394_ += i_1357_;
				i_1395_ += i_1358_;
				for (int i_1396_ = 0; i_1396_ < i_1338_; i_1396_++) {
					int i_1397_ = is[i_1396_];
					if (i_1397_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1398_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1397_]);
						for (int i_1399_ = 0; i_1399_ < is_1398_.length; i_1399_++) {
							int i_1400_ = is_1398_[i_1399_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1336_ & (((Class387_Sub3) this).aShortArray8242[i_1400_])) != 0)) {
								int i_1401_ = (is_1388_[0] * (((Class387_Sub3) this).anIntArray8238[i_1400_]) + is_1388_[1] * (((Class387_Sub3) this).anIntArray8195[i_1400_]) + is_1388_[2] * (((Class387_Sub3) this).anIntArray8180[i_1400_]) + 8192) >> 14;
								int i_1402_ = (is_1388_[3] * (((Class387_Sub3) this).anIntArray8238[i_1400_]) + is_1388_[4] * (((Class387_Sub3) this).anIntArray8195[i_1400_]) + is_1388_[5] * (((Class387_Sub3) this).anIntArray8180[i_1400_]) + 8192) >> 14;
								int i_1403_ = (is_1388_[6] * (((Class387_Sub3) this).anIntArray8238[i_1400_]) + is_1388_[7] * (((Class387_Sub3) this).anIntArray8195[i_1400_]) + is_1388_[8] * (((Class387_Sub3) this).anIntArray8180[i_1400_]) + 8192) >> 14;
								i_1401_ += i_1393_;
								i_1402_ += i_1394_;
								i_1403_ += i_1395_;
								((Class387_Sub3) this).anIntArray8238[i_1400_] = i_1401_;
								((Class387_Sub3) this).anIntArray8195[i_1400_] = i_1402_;
								((Class387_Sub3) this).anIntArray8180[i_1400_] = i_1403_;
							}
						}
					}
				}
			} else {
				for (int i_1404_ = 0; i_1404_ < i_1338_; i_1404_++) {
					int i_1405_ = is[i_1404_];
					if (i_1405_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1406_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1405_]);
						for (int i_1407_ = 0; i_1407_ < is_1406_.length; i_1407_++) {
							int i_1408_ = is_1406_[i_1407_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1336_ & (((Class387_Sub3) this).aShortArray8242[i_1408_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_1408_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1408_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1408_] -= ((Class387_Sub3) this).anInt8221;
								if (i_1335_ != 0) {
									int i_1409_ = Class257.anIntArray2683[i_1335_];
									int i_1410_ = Class257.anIntArray2684[i_1335_];
									int i_1411_ = ((((Class387_Sub3) this).anIntArray8195[i_1408_]) * i_1409_ + ((((Class387_Sub3) this).anIntArray8238[i_1408_]) * i_1410_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_1408_] = ((((Class387_Sub3) this).anIntArray8195[i_1408_]) * i_1410_ - ((((Class387_Sub3) this).anIntArray8238[i_1408_]) * i_1409_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_1408_] = i_1411_;
								}
								if (i_1333_ != 0) {
									int i_1412_ = Class257.anIntArray2683[i_1333_];
									int i_1413_ = Class257.anIntArray2684[i_1333_];
									int i_1414_ = ((((Class387_Sub3) this).anIntArray8195[i_1408_]) * i_1413_ - ((((Class387_Sub3) this).anIntArray8180[i_1408_]) * i_1412_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_1408_] = ((((Class387_Sub3) this).anIntArray8195[i_1408_]) * i_1412_ + ((((Class387_Sub3) this).anIntArray8180[i_1408_]) * i_1413_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_1408_] = i_1414_;
								}
								if (i_1334_ != 0) {
									int i_1415_ = Class257.anIntArray2683[i_1334_];
									int i_1416_ = Class257.anIntArray2684[i_1334_];
									int i_1417_ = ((((Class387_Sub3) this).anIntArray8180[i_1408_]) * i_1415_ + ((((Class387_Sub3) this).anIntArray8238[i_1408_]) * i_1416_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_1408_] = ((((Class387_Sub3) this).anIntArray8180[i_1408_]) * i_1416_ - ((((Class387_Sub3) this).anIntArray8238[i_1408_]) * i_1415_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_1408_] = i_1417_;
								}
								((Class387_Sub3) this).anIntArray8238[i_1408_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1408_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1408_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1337_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_1418_ = 0; i_1418_ < ((Class387_Sub3) this).anInt8174; i_1418_++) {
						((Class387_Sub3) this).anIntArray8238[i_1418_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_1418_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_1418_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_1419_ = is_1337_[9] << 4;
				int i_1420_ = is_1337_[10] << 4;
				int i_1421_ = is_1337_[11] << 4;
				int i_1422_ = is_1337_[12] << 4;
				int i_1423_ = is_1337_[13] << 4;
				int i_1424_ = is_1337_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_1425_ = ((is_1337_[0] * ((Class387_Sub3) this).anInt8209 + is_1337_[3] * ((Class387_Sub3) this).anInt8219 + is_1337_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1426_ = ((is_1337_[1] * ((Class387_Sub3) this).anInt8209 + is_1337_[4] * ((Class387_Sub3) this).anInt8219 + is_1337_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1427_ = ((is_1337_[2] * ((Class387_Sub3) this).anInt8209 + is_1337_[5] * ((Class387_Sub3) this).anInt8219 + is_1337_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_1425_ += i_1422_;
					i_1426_ += i_1423_;
					i_1427_ += i_1424_;
					((Class387_Sub3) this).anInt8209 = i_1425_;
					((Class387_Sub3) this).anInt8219 = i_1426_;
					((Class387_Sub3) this).anInt8221 = i_1427_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int i_1428_ = i_1333_ << 15 >> 7;
				int i_1429_ = i_1334_ << 15 >> 7;
				int i_1430_ = i_1335_ << 15 >> 7;
				int i_1431_ = i_1428_ * -((Class387_Sub3) this).anInt8209 + 8192 >> 14;
				int i_1432_ = i_1429_ * -((Class387_Sub3) this).anInt8219 + 8192 >> 14;
				int i_1433_ = i_1430_ * -((Class387_Sub3) this).anInt8221 + 8192 >> 14;
				int i_1434_ = i_1431_ + ((Class387_Sub3) this).anInt8209;
				int i_1435_ = i_1432_ + ((Class387_Sub3) this).anInt8219;
				int i_1436_ = i_1433_ + ((Class387_Sub3) this).anInt8221;
				int[] is_1437_ = new int[9];
				is_1437_[0] = i_1428_ * is_1337_[0] + 8192 >> 14;
				is_1437_[1] = i_1428_ * is_1337_[3] + 8192 >> 14;
				is_1437_[2] = i_1428_ * is_1337_[6] + 8192 >> 14;
				is_1437_[3] = i_1429_ * is_1337_[1] + 8192 >> 14;
				is_1437_[4] = i_1429_ * is_1337_[4] + 8192 >> 14;
				is_1437_[5] = i_1429_ * is_1337_[7] + 8192 >> 14;
				is_1437_[6] = i_1430_ * is_1337_[2] + 8192 >> 14;
				is_1437_[7] = i_1430_ * is_1337_[5] + 8192 >> 14;
				is_1437_[8] = i_1430_ * is_1337_[8] + 8192 >> 14;
				int i_1438_ = i_1428_ * i_1422_ + 8192 >> 14;
				int i_1439_ = i_1429_ * i_1423_ + 8192 >> 14;
				int i_1440_ = i_1430_ * i_1424_ + 8192 >> 14;
				i_1438_ += i_1434_;
				i_1439_ += i_1435_;
				i_1440_ += i_1436_;
				int[] is_1441_ = new int[9];
				for (int i_1442_ = 0; i_1442_ < 3; i_1442_++) {
					for (int i_1443_ = 0; i_1443_ < 3; i_1443_++) {
						int i_1444_ = 0;
						for (int i_1445_ = 0; i_1445_ < 3; i_1445_++)
							i_1444_ += (is_1337_[i_1442_ * 3 + i_1445_] * is_1437_[i_1443_ + i_1445_ * 3]);
						is_1441_[i_1442_ * 3 + i_1443_] = i_1444_ + 8192 >> 14;
					}
				}
				int i_1446_ = ((is_1337_[0] * i_1438_ + is_1337_[1] * i_1439_ + is_1337_[2] * i_1440_ + 8192) >> 14);
				int i_1447_ = ((is_1337_[3] * i_1438_ + is_1337_[4] * i_1439_ + is_1337_[5] * i_1440_ + 8192) >> 14);
				int i_1448_ = ((is_1337_[6] * i_1438_ + is_1337_[7] * i_1439_ + is_1337_[8] * i_1440_ + 8192) >> 14);
				i_1446_ += i_1419_;
				i_1447_ += i_1420_;
				i_1448_ += i_1421_;
				for (int i_1449_ = 0; i_1449_ < i_1338_; i_1449_++) {
					int i_1450_ = is[i_1449_];
					if (i_1450_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1451_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1450_]);
						for (int i_1452_ = 0; i_1452_ < is_1451_.length; i_1452_++) {
							int i_1453_ = is_1451_[i_1452_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1336_ & (((Class387_Sub3) this).aShortArray8242[i_1453_])) != 0)) {
								int i_1454_ = (is_1441_[0] * (((Class387_Sub3) this).anIntArray8238[i_1453_]) + is_1441_[1] * (((Class387_Sub3) this).anIntArray8195[i_1453_]) + is_1441_[2] * (((Class387_Sub3) this).anIntArray8180[i_1453_]) + 8192) >> 14;
								int i_1455_ = (is_1441_[3] * (((Class387_Sub3) this).anIntArray8238[i_1453_]) + is_1441_[4] * (((Class387_Sub3) this).anIntArray8195[i_1453_]) + is_1441_[5] * (((Class387_Sub3) this).anIntArray8180[i_1453_]) + 8192) >> 14;
								int i_1456_ = (is_1441_[6] * (((Class387_Sub3) this).anIntArray8238[i_1453_]) + is_1441_[7] * (((Class387_Sub3) this).anIntArray8195[i_1453_]) + is_1441_[8] * (((Class387_Sub3) this).anIntArray8180[i_1453_]) + 8192) >> 14;
								i_1454_ += i_1446_;
								i_1455_ += i_1447_;
								i_1456_ += i_1448_;
								((Class387_Sub3) this).anIntArray8238[i_1453_] = i_1454_;
								((Class387_Sub3) this).anIntArray8195[i_1453_] = i_1455_;
								((Class387_Sub3) this).anIntArray8180[i_1453_] = i_1456_;
							}
						}
					}
				}
			} else {
				for (int i_1457_ = 0; i_1457_ < i_1338_; i_1457_++) {
					int i_1458_ = is[i_1457_];
					if (i_1458_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1459_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1458_]);
						for (int i_1460_ = 0; i_1460_ < is_1459_.length; i_1460_++) {
							int i_1461_ = is_1459_[i_1460_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1336_ & (((Class387_Sub3) this).aShortArray8242[i_1461_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_1461_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1461_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1461_] -= ((Class387_Sub3) this).anInt8221;
								((Class387_Sub3) this).anIntArray8238[i_1461_] = (((Class387_Sub3) this).anIntArray8238[i_1461_]) * i_1333_ / 128;
								((Class387_Sub3) this).anIntArray8195[i_1461_] = (((Class387_Sub3) this).anIntArray8195[i_1461_]) * i_1334_ / 128;
								((Class387_Sub3) this).anIntArray8180[i_1461_] = (((Class387_Sub3) this).anIntArray8180[i_1461_]) * i_1335_ / 128;
								((Class387_Sub3) this).anIntArray8238[i_1461_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1461_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1461_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_1462_ = 0; i_1462_ < i_1338_; i_1462_++) {
					int i_1463_ = is[i_1462_];
					if (i_1463_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1464_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1463_]);
						for (int i_1465_ = 0; i_1465_ < is_1464_.length; i_1465_++) {
							int i_1466_ = is_1464_[i_1465_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_1336_ & (((Class387_Sub3) this).aShortArray8181[i_1466_])) != 0)) {
								int i_1467_ = (((((Class387_Sub3) this).aByteArray8200[i_1466_]) & 0xff) + i_1333_ * 8);
								if (i_1467_ < 0)
									i_1467_ = 0;
								else if (i_1467_ > 255)
									i_1467_ = 255;
								((Class387_Sub3) this).aByteArray8200[i_1466_] = (byte) i_1467_;
							}
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1468_ = 0; i_1468_ < ((Class387_Sub3) this).anInt8215; i_1468_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1468_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1468_]);
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_1469_ = 0; i_1469_ < i_1338_; i_1469_++) {
					int i_1470_ = is[i_1469_];
					if (i_1470_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1471_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1470_]);
						for (int i_1472_ = 0; i_1472_ < is_1471_.length; i_1472_++) {
							int i_1473_ = is_1471_[i_1472_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_1336_ & (((Class387_Sub3) this).aShortArray8181[i_1473_])) != 0)) {
								int i_1474_ = ((((Class387_Sub3) this).modelColors[i_1473_]) & 0xffff);
								int i_1475_ = i_1474_ >> 10 & 0x3f;
								int i_1476_ = i_1474_ >> 7 & 0x7;
								int i_1477_ = i_1474_ & 0x7f;
								i_1475_ = i_1475_ + i_1333_ & 0x3f;
								i_1476_ += i_1334_;
								if (i_1476_ < 0)
									i_1476_ = 0;
								else if (i_1476_ > 7)
									i_1476_ = 7;
								i_1477_ += i_1335_;
								if (i_1477_ < 0)
									i_1477_ = 0;
								else if (i_1477_ > 127)
									i_1477_ = 127;
								((Class387_Sub3) this).modelColors[i_1473_] = (short) (i_1475_ << 10 | i_1476_ << 7 | i_1477_);
							}
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1478_ = 0; i_1478_ < ((Class387_Sub3) this).anInt8215; i_1478_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1478_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1478_]);
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1479_ = 0; i_1479_ < i_1338_; i_1479_++) {
					int i_1480_ = is[i_1479_];
					if (i_1480_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1481_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1480_]);
						for (int i_1482_ = 0; i_1482_ < is_1481_.length; i_1482_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1481_[i_1482_]]);
							((Class10) class10).anInt159 += i_1333_ * 1013441605;
							((Class10) class10).anInt157 += i_1334_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1483_ = 0; i_1483_ < i_1338_; i_1483_++) {
					int i_1484_ = is[i_1483_];
					if (i_1484_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1485_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1484_]);
						for (int i_1486_ = 0; i_1486_ < is_1485_.length; i_1486_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1485_[i_1486_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_1333_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_1334_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1487_ = 0; i_1487_ < i_1338_; i_1487_++) {
					int i_1488_ = is[i_1487_];
					if (i_1488_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1489_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1488_]);
						for (int i_1490_ = 0; i_1490_ < is_1489_.length; i_1490_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1489_[i_1490_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_1333_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}

	public void bk(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1491_ = Class257.anIntArray2683[i];
		int i_1492_ = Class257.anIntArray2684[i];
		synchronized (this) {
			for (int i_1493_ = 0; i_1493_ < ((Class387_Sub3) this).anInt8174; i_1493_++) {
				int i_1494_ = (((Class387_Sub3) this).anIntArray8195[i_1493_] * i_1491_ + (((Class387_Sub3) this).anIntArray8238[i_1493_] * i_1492_)) >> 14;
				((Class387_Sub3) this).anIntArray8195[i_1493_] = (((Class387_Sub3) this).anIntArray8195[i_1493_] * i_1492_ - (((Class387_Sub3) this).anIntArray8238[i_1493_] * i_1491_)) >> 14;
				((Class387_Sub3) this).anIntArray8238[i_1493_] = i_1494_;
			}
			method4540();
		}
	}

	void method4455() {
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
			synchronized (this) {
				while (aBoolean3990) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean3990 = true;
			}
		}
	}

	public Class93[] method4476() {
		return ((Class387_Sub3) this).aClass93Array8213;
	}

	public int cx() {
		return ((Class387_Sub3) this).anInt8236;
	}

	public int cn() {
		if (!((Class387_Sub3) this).aBoolean8187)
			method4547();
		return ((Class387_Sub3) this).aShort8225;
	}

	public boolean ew() {
		return ((Class387_Sub3) this).aBoolean8228;
	}

	public int ds() {
		return ((Class387_Sub3) this).anInt8176;
	}

	public Class64[] method4452() {
		return ((Class387_Sub3) this).aClass64Array8160;
	}

	public void method_do(short i, short i_1495_) {
		for (int i_1496_ = 0; i_1496_ < ((Class387_Sub3) this).anInt8184; i_1496_++) {
			if (((Class387_Sub3) this).modelColors[i_1496_] == i)
				((Class387_Sub3) this).modelColors[i_1496_] = i_1495_;
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_1497_ = 0; i_1497_ < ((Class387_Sub3) this).anInt8215; i_1497_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1497_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1497_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	final void method4554(boolean bool, boolean bool_1498_, boolean bool_1499_, int i) {
		short i_1500_ = ((Class387_Sub3) this).aShortArray8173[i];
		short i_1501_ = ((Class387_Sub3) this).aShortArray8186[i];
		short i_1502_ = ((Class387_Sub3) this).aShortArray8217[i];
		if (((Class387_Sub3) this).aShortArray8201 == null || ((Class387_Sub3) this).aShortArray8201[i] == -1) {
			if (((Class387_Sub3) this).aByteArray8200 == null)
				((Class38) ((Class387_Sub3) this).aClass38_8164).anInt402 = 0;
			else
				((Class38) ((Class387_Sub3) this).aClass38_8164).anInt402 = ((Class387_Sub3) this).aByteArray8200[i] & 0xff;
			if (((Class387_Sub3) this).anIntArray8192[i] == -1)
				((Class387_Sub3) this).aClass38_8164.method539(bool, bool_1498_, bool_1499_, ((Class387_Sub3) this).aFloatArray8233[i_1500_], ((Class387_Sub3) this).aFloatArray8233[i_1501_], ((Class387_Sub3) this).aFloatArray8233[i_1502_], ((Class387_Sub3) this).aFloatArray8232[i_1500_], ((Class387_Sub3) this).aFloatArray8232[i_1501_], ((Class387_Sub3) this).aFloatArray8232[i_1502_], ((Class387_Sub3) this).aFloatArray8234[i_1500_], ((Class387_Sub3) this).aFloatArray8234[i_1501_], ((Class387_Sub3) this).aFloatArray8234[i_1502_], (Console.anIntArray4263[((Class387_Sub3) this).anIntArray8190[i] & 0xffff]));
			else
				((Class387_Sub3) this).aClass38_8164.method544(bool, bool_1498_, bool_1499_, ((Class387_Sub3) this).aFloatArray8233[i_1500_], ((Class387_Sub3) this).aFloatArray8233[i_1501_], ((Class387_Sub3) this).aFloatArray8233[i_1502_], ((Class387_Sub3) this).aFloatArray8232[i_1500_], ((Class387_Sub3) this).aFloatArray8232[i_1501_], ((Class387_Sub3) this).aFloatArray8232[i_1502_], ((Class387_Sub3) this).aFloatArray8234[i_1500_], ((Class387_Sub3) this).aFloatArray8234[i_1501_], ((Class387_Sub3) this).aFloatArray8234[i_1502_], (float) (((Class387_Sub3) this).anIntArray8190[i] & 0xffff), (float) (((Class387_Sub3) this).anIntArray8191[i] & 0xffff), (float) (((Class387_Sub3) this).anIntArray8192[i] & 0xffff));
		} else {
			int i_1503_ = -16777216;
			if (((Class387_Sub3) this).aByteArray8200 != null)
				i_1503_ = 255 - (((Class387_Sub3) this).aByteArray8200[i] & 0xff) << 24;
			if (((Class387_Sub3) this).anIntArray8192[i] == -1) {
				int i_1504_ = (i_1503_ | ((Class387_Sub3) this).anIntArray8190[i] & 0xffffff);
				((Class387_Sub3) this).aClass38_8164.method541(bool, bool_1498_, bool_1499_, ((Class387_Sub3) this).aFloatArray8233[i_1500_], ((Class387_Sub3) this).aFloatArray8233[i_1501_], ((Class387_Sub3) this).aFloatArray8233[i_1502_], ((Class387_Sub3) this).aFloatArray8232[i_1500_], ((Class387_Sub3) this).aFloatArray8232[i_1501_], ((Class387_Sub3) this).aFloatArray8232[i_1502_], ((Class387_Sub3) this).aFloatArray8234[i_1500_], ((Class387_Sub3) this).aFloatArray8234[i_1501_], ((Class387_Sub3) this).aFloatArray8234[i_1502_], ((Class387_Sub3) this).aFloatArray8235[i_1500_], ((Class387_Sub3) this).aFloatArray8235[i_1501_], ((Class387_Sub3) this).aFloatArray8235[i_1502_], ((Class387_Sub3) this).aFloatArrayArray8188[i][0], ((Class387_Sub3) this).aFloatArrayArray8188[i][1], ((Class387_Sub3) this).aFloatArrayArray8188[i][2], ((Class387_Sub3) this).aFloatArrayArray8189[i][0], ((Class387_Sub3) this).aFloatArrayArray8189[i][1], ((Class387_Sub3) this).aFloatArrayArray8189[i][2], i_1504_, i_1504_, i_1504_, (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt88 * 536502941), 0.0F, 0.0F, 0.0F, ((Class387_Sub3) this).aShortArray8201[i]);
			} else
				((Class387_Sub3) this).aClass38_8164.method541(bool, bool_1498_, bool_1499_, ((Class387_Sub3) this).aFloatArray8233[i_1500_], ((Class387_Sub3) this).aFloatArray8233[i_1501_], ((Class387_Sub3) this).aFloatArray8233[i_1502_], ((Class387_Sub3) this).aFloatArray8232[i_1500_], ((Class387_Sub3) this).aFloatArray8232[i_1501_], ((Class387_Sub3) this).aFloatArray8232[i_1502_], ((Class387_Sub3) this).aFloatArray8234[i_1500_], ((Class387_Sub3) this).aFloatArray8234[i_1501_], ((Class387_Sub3) this).aFloatArray8234[i_1502_], ((Class387_Sub3) this).aFloatArray8235[i_1500_], ((Class387_Sub3) this).aFloatArray8235[i_1501_], ((Class387_Sub3) this).aFloatArray8235[i_1502_], ((Class387_Sub3) this).aFloatArrayArray8188[i][0], ((Class387_Sub3) this).aFloatArrayArray8188[i][1], ((Class387_Sub3) this).aFloatArrayArray8188[i][2], ((Class387_Sub3) this).aFloatArrayArray8189[i][0], ((Class387_Sub3) this).aFloatArrayArray8189[i][1], ((Class387_Sub3) this).aFloatArrayArray8189[i][2], (i_1503_ | ((Class387_Sub3) this).anIntArray8190[i] & 0xffffff), (i_1503_ | ((Class387_Sub3) this).anIntArray8191[i] & 0xffffff), (i_1503_ | ((Class387_Sub3) this).anIntArray8192[i] & 0xffffff), (((Class6) ((Class387_Sub3) this).aClass6_8162).anInt88 * 536502941), 0.0F, 0.0F, 0.0F, ((Class387_Sub3) this).aShortArray8201[i]);
		}
	}

	public void dh(short i, short i_1505_) {
		for (int i_1506_ = 0; i_1506_ < ((Class387_Sub3) this).anInt8184; i_1506_++) {
			if (((Class387_Sub3) this).modelColors[i_1506_] == i)
				((Class387_Sub3) this).modelColors[i_1506_] = i_1505_;
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_1507_ = 0; i_1507_ < ((Class387_Sub3) this).anInt8215; i_1507_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1507_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1507_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	public void dt(short i, short i_1508_) {
		for (int i_1509_ = 0; i_1509_ < ((Class387_Sub3) this).anInt8184; i_1509_++) {
			if (((Class387_Sub3) this).modelColors[i_1509_] == i)
				((Class387_Sub3) this).modelColors[i_1509_] = i_1508_;
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_1510_ = 0; i_1510_ < ((Class387_Sub3) this).anInt8215; i_1510_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1510_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1510_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	public void dq(short i, short i_1511_) {
		for (int i_1512_ = 0; i_1512_ < ((Class387_Sub3) this).anInt8184; i_1512_++) {
			if (((Class387_Sub3) this).modelColors[i_1512_] == i)
				((Class387_Sub3) this).modelColors[i_1512_] = i_1511_;
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_1513_ = 0; i_1513_ < ((Class387_Sub3) this).anInt8215; i_1513_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1513_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1513_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]), (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	public void method4482(byte i, byte[] is) {
		if ((((Class387_Sub3) this).anInt8172 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class387_Sub3) this).aByteArray8200 == null)
			((Class387_Sub3) this).aByteArray8200 = new byte[((Class387_Sub3) this).anInt8184];
		if (is == null) {
			for (int i_1514_ = 0; i_1514_ < ((Class387_Sub3) this).anInt8184; i_1514_++)
				((Class387_Sub3) this).aByteArray8200[i_1514_] = i;
		} else {
			for (int i_1515_ = 0; i_1515_ < ((Class387_Sub3) this).anInt8184; i_1515_++) {
				int i_1516_ = 255 - ((255 - (is[i_1515_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub3) this).aByteArray8200[i_1515_] = (byte) i_1516_;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	public void method4486(byte i, byte[] is) {
		if ((((Class387_Sub3) this).anInt8172 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class387_Sub3) this).aByteArray8200 == null)
			((Class387_Sub3) this).aByteArray8200 = new byte[((Class387_Sub3) this).anInt8184];
		if (is == null) {
			for (int i_1517_ = 0; i_1517_ < ((Class387_Sub3) this).anInt8184; i_1517_++)
				((Class387_Sub3) this).aByteArray8200[i_1517_] = i;
		} else {
			for (int i_1518_ = 0; i_1518_ < ((Class387_Sub3) this).anInt8184; i_1518_++) {
				int i_1519_ = 255 - ((255 - (is[i_1518_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class387_Sub3) this).aByteArray8200[i_1518_] = (byte) i_1519_;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	public void dj(short i, short i_1520_) {
		if (((Class387_Sub3) this).aShortArray8201 != null) {
			if (!((Class387_Sub3) this).aBoolean8229 && i_1520_ >= 0) {
				Class56 class56 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.anInterface_ma4227.method221(i_1520_ & 0xffff, 927426409);
				if (class56.aByte531 != 0 || class56.aByte530 != 0)
					((Class387_Sub3) this).aBoolean8229 = true;
			}
			for (int i_1521_ = 0; i_1521_ < ((Class387_Sub3) this).anInt8184; i_1521_++) {
				if (((Class387_Sub3) this).aShortArray8201[i_1521_] == i)
					((Class387_Sub3) this).aShortArray8201[i_1521_] = i_1520_;
			}
		}
	}

	public void dl(short i, short i_1522_) {
		if (((Class387_Sub3) this).aShortArray8201 != null) {
			if (!((Class387_Sub3) this).aBoolean8229 && i_1522_ >= 0) {
				Class56 class56 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.anInterface_ma4227.method221(i_1522_ & 0xffff, -1924332833);
				if (class56.aByte531 != 0 || class56.aByte530 != 0)
					((Class387_Sub3) this).aBoolean8229 = true;
			}
			for (int i_1523_ = 0; i_1523_ < ((Class387_Sub3) this).anInt8184; i_1523_++) {
				if (((Class387_Sub3) this).aShortArray8201[i_1523_] == i)
					((Class387_Sub3) this).aShortArray8201[i_1523_] = i_1522_;
			}
		}
	}

	final boolean method4555(int i) {
		if (((Class387_Sub3) this).aByteArray8200 == null)
			return false;
		if (((Class387_Sub3) this).aByteArray8200[i] == 0)
			return false;
		return true;
	}

	public void du(int i, int i_1524_, int i_1525_, int i_1526_) {
		if ((((Class387_Sub3) this).anInt8172 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_1527_ = 0; i_1527_ < ((Class387_Sub3) this).anInt8184; i_1527_++) {
			int i_1528_ = ((Class387_Sub3) this).modelColors[i_1527_] & 0xffff;
			int i_1529_ = i_1528_ >> 10 & 0x3f;
			int i_1530_ = i_1528_ >> 7 & 0x7;
			int i_1531_ = i_1528_ & 0x7f;
			if (i != -1)
				i_1529_ += (i - i_1529_) * i_1526_ >> 7;
			if (i_1524_ != -1)
				i_1530_ += (i_1524_ - i_1530_) * i_1526_ >> 7;
			if (i_1525_ != -1)
				i_1531_ += (i_1525_ - i_1531_) * i_1526_ >> 7;
			((Class387_Sub3) this).modelColors[i_1527_] = (short) (i_1529_ << 10 | i_1530_ << 7 | i_1531_);
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_1532_ = 0; i_1532_ < ((Class387_Sub3) this).anInt8215; i_1532_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1532_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1532_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	public void df(int i, int i_1533_, int i_1534_, int i_1535_) {
		if ((((Class387_Sub3) this).anInt8172 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_1536_ = 0; i_1536_ < ((Class387_Sub3) this).anInt8184; i_1536_++) {
			int i_1537_ = ((Class387_Sub3) this).modelColors[i_1536_] & 0xffff;
			int i_1538_ = i_1537_ >> 10 & 0x3f;
			int i_1539_ = i_1537_ >> 7 & 0x7;
			int i_1540_ = i_1537_ & 0x7f;
			if (i != -1)
				i_1538_ += (i - i_1538_) * i_1535_ >> 7;
			if (i_1533_ != -1)
				i_1539_ += (i_1533_ - i_1539_) * i_1535_ >> 7;
			if (i_1534_ != -1)
				i_1540_ += (i_1534_ - i_1540_) * i_1535_ >> 7;
			((Class387_Sub3) this).modelColors[i_1536_] = (short) (i_1538_ << 10 | i_1539_ << 7 | i_1540_);
		}
		if (((Class387_Sub3) this).aClass20Array8216 != null) {
			for (int i_1541_ = 0; i_1541_ < ((Class387_Sub3) this).anInt8215; i_1541_++) {
				Class20 class20 = ((Class387_Sub3) this).aClass20Array8216[i_1541_];
				Class10 class10 = ((Class387_Sub3) this).aClass10Array8211[i_1541_];
				((Class10) class10).anInt163 = (((Class10) class10).anInt163 * 1548605205 & ~0xffffff | ((Console.anIntArray4263[Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1) & 0xffff]) & 0xffffff)) * 680837181;
			}
		}
		if (((Class387_Sub3) this).anInt8196 == 2)
			((Class387_Sub3) this).anInt8196 = 1;
	}

	void method4556() {
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++) {
				int i_1542_ = ((Class387_Sub3) this).anIntArray8180[i];
				((Class387_Sub3) this).anIntArray8180[i] = ((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8238[i] = -i_1542_;
				if (((Class387_Sub3) this).aClass21Array8182[i] != null) {
					i_1542_ = ((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt254;
					((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt254 = ((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt252;
					((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt252 = -i_1542_;
				}
			}
			if (((Class387_Sub3) this).aClass25Array8197 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (((Class387_Sub3) this).aClass25Array8197[i] != null) {
						int i_1543_ = (((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt308);
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt308 = ((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt306;
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt306 = -i_1543_;
					}
				}
			}
			for (int i = ((Class387_Sub3) this).anInt8185; i < ((Class387_Sub3) this).anInt8174; i++) {
				int i_1544_ = ((Class387_Sub3) this).anIntArray8180[i];
				((Class387_Sub3) this).anIntArray8180[i] = ((Class387_Sub3) this).anIntArray8238[i];
				((Class387_Sub3) this).anIntArray8238[i] = -i_1544_;
			}
			((Class387_Sub3) this).anInt8196 = 0;
			((Class387_Sub3) this).aBoolean8187 = false;
		}
	}

	public int am() {
		return ((Class387_Sub3) this).anInt8172;
	}

	public Class64[] method4484() {
		return ((Class387_Sub3) this).aClass64Array8160;
	}

	public byte[] dr() {
		return ((Class387_Sub3) this).aByteArray8200;
	}

	public boolean method4487() {
		if (((Class387_Sub3) this).aShortArray8201 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub3) this).aShortArray8201.length; i++) {
			if (((Class387_Sub3) this).aShortArray8201[i] != -1 && !((Class387_Sub3) this).aClass_ra_Sub3_8165.method5189(((Class387_Sub3) this).aShortArray8201[i]))
				return false;
		}
		return true;
	}

	public boolean method4471() {
		if (((Class387_Sub3) this).aShortArray8201 == null)
			return true;
		for (int i = 0; i < ((Class387_Sub3) this).aShortArray8201.length; i++) {
			if (((Class387_Sub3) this).aShortArray8201[i] != -1 && !((Class387_Sub3) this).aClass_ra_Sub3_8165.method5189(((Class387_Sub3) this).aShortArray8201[i]))
				return false;
		}
		return true;
	}

	public boolean dw() {
		return ((Class387_Sub3) this).aBoolean8229;
	}

	public void bs(int i) {
		if ((((Class387_Sub3) this).anInt8172 & 0xd) != 13)
			throw new IllegalStateException();
		do {
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				if (i == 4096) {
					method4550();
					break;
				}
				if (i == 8192) {
					method4539();
					break;
				}
				if (i == 12288) {
					method4556();
					break;
				}
				int i_1545_ = Class257.anIntArray2683[i];
				int i_1546_ = Class257.anIntArray2684[i];
				synchronized (this) {
					for (int i_1547_ = 0; i_1547_ < ((Class387_Sub3) this).anInt8185; i_1547_++) {
						int i_1548_ = (((((Class387_Sub3) this).anIntArray8180[i_1547_] * i_1545_) + (((Class387_Sub3) this).anIntArray8238[i_1547_]) * i_1546_) >> 14);
						((Class387_Sub3) this).anIntArray8180[i_1547_] = ((((Class387_Sub3) this).anIntArray8180[i_1547_] * i_1546_) - (((Class387_Sub3) this).anIntArray8238[i_1547_]) * i_1545_) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_1547_] = i_1548_;
						if (((Class387_Sub3) this).aClass21Array8182[i_1547_] != null) {
							i_1548_ = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1547_])).anInt254) * i_1545_ + (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1547_])).anInt252) * i_1546_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1547_])).anInt254 = ((((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1547_])).anInt254) * i_1546_ - (((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1547_])).anInt252) * i_1545_) >> 14;
							((Class21) (((Class387_Sub3) this).aClass21Array8182[i_1547_])).anInt252 = i_1548_;
						}
					}
					if (((Class387_Sub3) this).aClass25Array8197 != null) {
						for (int i_1549_ = 0; i_1549_ < ((Class387_Sub3) this).anInt8184; i_1549_++) {
							if ((((Class387_Sub3) this).aClass25Array8197[i_1549_]) != null) {
								int i_1550_ = (((((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1549_])).anInt308 * i_1545_) + (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1549_])).anInt306 * i_1546_)) >> 14);
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1549_])).anInt308 = ((((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1549_])).anInt308 * i_1546_) - (((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1549_])).anInt306 * i_1545_)) >> 14;
								((Class25) (((Class387_Sub3) this).aClass25Array8197[i_1549_])).anInt306 = i_1550_;
							}
						}
					}
					for (int i_1551_ = ((Class387_Sub3) this).anInt8185; i_1551_ < ((Class387_Sub3) this).anInt8174; i_1551_++) {
						int i_1552_ = (((((Class387_Sub3) this).anIntArray8180[i_1551_] * i_1545_) + (((Class387_Sub3) this).anIntArray8238[i_1551_]) * i_1546_) >> 14);
						((Class387_Sub3) this).anIntArray8180[i_1551_] = ((((Class387_Sub3) this).anIntArray8180[i_1551_] * i_1546_) - (((Class387_Sub3) this).anIntArray8238[i_1551_]) * i_1545_) >> 14;
						((Class387_Sub3) this).anIntArray8238[i_1551_] = i_1552_;
					}
					((Class387_Sub3) this).anInt8196 = 0;
					((Class387_Sub3) this).aBoolean8187 = false;
					break;
				}
			}
			f(i);
		} while (false);
	}

	public void ej() {
		if ((((Class387_Sub3) this).anInt8172 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class387_Sub3) this).anInt8174; i++)
				((Class387_Sub3) this).anIntArray8180[i] = -((Class387_Sub3) this).anIntArray8180[i];
			if (((Class387_Sub3) this).aClass21Array8182 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++) {
					if (((Class387_Sub3) this).aClass21Array8182[i] != null)
						((Class21) ((Class387_Sub3) this).aClass21Array8182[i]).anInt254 = -((Class21) (((Class387_Sub3) this).aClass21Array8182[i])).anInt254;
				}
			}
			if (((Class387_Sub3) this).aClass21Array8183 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8185; i++) {
					if (((Class387_Sub3) this).aClass21Array8183[i] != null)
						((Class21) ((Class387_Sub3) this).aClass21Array8183[i]).anInt254 = -((Class21) (((Class387_Sub3) this).aClass21Array8183[i])).anInt254;
				}
			}
			if (((Class387_Sub3) this).aClass25Array8197 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (((Class387_Sub3) this).aClass25Array8197[i] != null)
						((Class25) ((Class387_Sub3) this).aClass25Array8197[i]).anInt308 = -((Class25) (((Class387_Sub3) this).aClass25Array8197[i])).anInt308;
				}
			}
			short[] is = ((Class387_Sub3) this).aShortArray8173;
			((Class387_Sub3) this).aShortArray8173 = ((Class387_Sub3) this).aShortArray8217;
			((Class387_Sub3) this).aShortArray8217 = is;
			if (((Class387_Sub3) this).aFloatArrayArray8188 != null) {
				for (int i = 0; i < ((Class387_Sub3) this).anInt8184; i++) {
					if (((Class387_Sub3) this).aFloatArrayArray8188[i] != null) {
						float f = (((Class387_Sub3) this).aFloatArrayArray8188[i][0]);
						((Class387_Sub3) this).aFloatArrayArray8188[i][0] = (((Class387_Sub3) this).aFloatArrayArray8188[i][2]);
						((Class387_Sub3) this).aFloatArrayArray8188[i][2] = f;
					}
					if (((Class387_Sub3) this).aFloatArrayArray8189[i] != null) {
						float f = (((Class387_Sub3) this).aFloatArrayArray8189[i][0]);
						((Class387_Sub3) this).aFloatArrayArray8189[i][0] = (((Class387_Sub3) this).aFloatArrayArray8189[i][2]);
						((Class387_Sub3) this).aFloatArrayArray8189[i][2] = f;
					}
				}
			}
			((Class387_Sub3) this).aBoolean8187 = false;
			((Class387_Sub3) this).anInt8196 = 0;
		}
	}

	public boolean dp() {
		return ((Class387_Sub3) this).aBoolean8229;
	}

	public boolean em() {
		return ((Class387_Sub3) this).aBoolean8228;
	}

	void method4489() {
		if ((((Class_ra_Sub3) ((Class387_Sub3) this).aClass_ra_Sub3_8165).anInt8650) * -595900225 > 1) {
			synchronized (this) {
				while (aBoolean3990) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean3990 = true;
			}
		}
	}

	boolean ei() {
		if (((Class387_Sub3) this).anIntArrayArray8205 == null)
			return false;
		((Class387_Sub3) this).anInt8209 = 0;
		((Class387_Sub3) this).anInt8219 = 0;
		((Class387_Sub3) this).anInt8221 = 0;
		return true;
	}

	public void paintTexture(short i, short i_1553_) {
		if (((Class387_Sub3) this).aShortArray8201 != null) {
			if (!((Class387_Sub3) this).aBoolean8229 && i_1553_ >= 0) {
				Class56 class56 = ((Class387_Sub3) this).aClass_ra_Sub3_8165.anInterface_ma4227.method221(i_1553_ & 0xffff, 1052663566);
				if (class56.aByte531 != 0 || class56.aByte530 != 0)
					((Class387_Sub3) this).aBoolean8229 = true;
			}
			for (int i_1554_ = 0; i_1554_ < ((Class387_Sub3) this).anInt8184; i_1554_++) {
				if (((Class387_Sub3) this).aShortArray8201[i_1554_] == i)
					((Class387_Sub3) this).aShortArray8201[i_1554_] = i_1553_;
			}
		}
	}

	void en(int i, int[] is, int i_1555_, int i_1556_, int i_1557_, boolean bool, int i_1558_, int[] is_1559_) {
		int i_1560_ = is.length;
		if (i == 0) {
			i_1555_ <<= 4;
			i_1556_ <<= 4;
			i_1557_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1561_ = 0; i_1561_ < ((Class387_Sub3) this).anInt8174; i_1561_++) {
					((Class387_Sub3) this).anIntArray8238[i_1561_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1561_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1561_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_1562_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_1563_ = 0; i_1563_ < i_1560_; i_1563_++) {
				int i_1564_ = is[i_1563_];
				if (i_1564_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1565_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1564_];
					for (int i_1566_ = 0; i_1566_ < is_1565_.length; i_1566_++) {
						int i_1567_ = is_1565_[i_1566_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_1558_ & (((Class387_Sub3) this).aShortArray8242[i_1567_])) != 0) {
							((Class387_Sub3) this).anInt8209 += (((Class387_Sub3) this).anIntArray8238[i_1567_]);
							((Class387_Sub3) this).anInt8219 += (((Class387_Sub3) this).anIntArray8195[i_1567_]);
							((Class387_Sub3) this).anInt8221 += (((Class387_Sub3) this).anIntArray8180[i_1567_]);
							i_1562_++;
						}
					}
				}
			}
			if (i_1562_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_1562_ + i_1555_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_1562_ + i_1556_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_1562_ + i_1557_;
				((Class387_Sub3) this).aBoolean8212 = true;
			} else {
				((Class387_Sub3) this).anInt8209 = i_1555_;
				((Class387_Sub3) this).anInt8219 = i_1556_;
				((Class387_Sub3) this).anInt8221 = i_1557_;
			}
		} else if (i == 1) {
			if (is_1559_ != null) {
				int i_1568_ = ((is_1559_[0] * i_1555_ + is_1559_[1] * i_1556_ + is_1559_[2] * i_1557_ + 8192) >> 14);
				int i_1569_ = ((is_1559_[3] * i_1555_ + is_1559_[4] * i_1556_ + is_1559_[5] * i_1557_ + 8192) >> 14);
				int i_1570_ = ((is_1559_[6] * i_1555_ + is_1559_[7] * i_1556_ + is_1559_[8] * i_1557_ + 8192) >> 14);
				i_1555_ = i_1568_;
				i_1556_ = i_1569_;
				i_1557_ = i_1570_;
			}
			i_1555_ <<= 4;
			i_1556_ <<= 4;
			i_1557_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1571_ = 0; i_1571_ < ((Class387_Sub3) this).anInt8174; i_1571_++) {
					((Class387_Sub3) this).anIntArray8238[i_1571_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1571_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1571_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_1572_ = 0; i_1572_ < i_1560_; i_1572_++) {
				int i_1573_ = is[i_1572_];
				if (i_1573_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1574_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1573_];
					for (int i_1575_ = 0; i_1575_ < is_1574_.length; i_1575_++) {
						int i_1576_ = is_1574_[i_1575_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_1558_ & (((Class387_Sub3) this).aShortArray8242[i_1576_])) != 0) {
							((Class387_Sub3) this).anIntArray8238[i_1576_] += i_1555_;
							((Class387_Sub3) this).anIntArray8195[i_1576_] += i_1556_;
							((Class387_Sub3) this).anIntArray8180[i_1576_] += i_1557_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1559_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_1577_ = 0; i_1577_ < ((Class387_Sub3) this).anInt8174; i_1577_++) {
						((Class387_Sub3) this).anIntArray8238[i_1577_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_1577_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_1577_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_1578_ = is_1559_[9] << 4;
				int i_1579_ = is_1559_[10] << 4;
				int i_1580_ = is_1559_[11] << 4;
				int i_1581_ = is_1559_[12] << 4;
				int i_1582_ = is_1559_[13] << 4;
				int i_1583_ = is_1559_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_1584_ = ((is_1559_[0] * ((Class387_Sub3) this).anInt8209 + is_1559_[3] * ((Class387_Sub3) this).anInt8219 + is_1559_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1585_ = ((is_1559_[1] * ((Class387_Sub3) this).anInt8209 + is_1559_[4] * ((Class387_Sub3) this).anInt8219 + is_1559_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1586_ = ((is_1559_[2] * ((Class387_Sub3) this).anInt8209 + is_1559_[5] * ((Class387_Sub3) this).anInt8219 + is_1559_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_1584_ += i_1581_;
					i_1585_ += i_1582_;
					i_1586_ += i_1583_;
					((Class387_Sub3) this).anInt8209 = i_1584_;
					((Class387_Sub3) this).anInt8219 = i_1585_;
					((Class387_Sub3) this).anInt8221 = i_1586_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int[] is_1587_ = new int[9];
				int i_1588_ = Class257.anIntArray2684[i_1555_];
				int i_1589_ = Class257.anIntArray2683[i_1555_];
				int i_1590_ = Class257.anIntArray2684[i_1556_];
				int i_1591_ = Class257.anIntArray2683[i_1556_];
				int i_1592_ = Class257.anIntArray2684[i_1557_];
				int i_1593_ = Class257.anIntArray2683[i_1557_];
				int i_1594_ = i_1589_ * i_1592_ + 8192 >> 14;
				int i_1595_ = i_1589_ * i_1593_ + 8192 >> 14;
				is_1587_[0] = i_1590_ * i_1592_ + i_1591_ * i_1595_ + 8192 >> 14;
				is_1587_[1] = -i_1590_ * i_1593_ + i_1591_ * i_1594_ + 8192 >> 14;
				is_1587_[2] = i_1591_ * i_1588_ + 8192 >> 14;
				is_1587_[3] = i_1588_ * i_1593_ + 8192 >> 14;
				is_1587_[4] = i_1588_ * i_1592_ + 8192 >> 14;
				is_1587_[5] = -i_1589_;
				is_1587_[6] = -i_1591_ * i_1592_ + i_1590_ * i_1595_ + 8192 >> 14;
				is_1587_[7] = i_1591_ * i_1593_ + i_1590_ * i_1594_ + 8192 >> 14;
				is_1587_[8] = i_1590_ * i_1588_ + 8192 >> 14;
				int i_1596_ = ((is_1587_[0] * -((Class387_Sub3) this).anInt8209 + is_1587_[1] * -((Class387_Sub3) this).anInt8219 + is_1587_[2] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1597_ = ((is_1587_[3] * -((Class387_Sub3) this).anInt8209 + is_1587_[4] * -((Class387_Sub3) this).anInt8219 + is_1587_[5] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1598_ = ((is_1587_[6] * -((Class387_Sub3) this).anInt8209 + is_1587_[7] * -((Class387_Sub3) this).anInt8219 + is_1587_[8] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1599_ = i_1596_ + ((Class387_Sub3) this).anInt8209;
				int i_1600_ = i_1597_ + ((Class387_Sub3) this).anInt8219;
				int i_1601_ = i_1598_ + ((Class387_Sub3) this).anInt8221;
				int[] is_1602_ = new int[9];
				for (int i_1603_ = 0; i_1603_ < 3; i_1603_++) {
					for (int i_1604_ = 0; i_1604_ < 3; i_1604_++) {
						int i_1605_ = 0;
						for (int i_1606_ = 0; i_1606_ < 3; i_1606_++)
							i_1605_ += (is_1587_[i_1603_ * 3 + i_1606_] * is_1559_[i_1604_ * 3 + i_1606_]);
						is_1602_[i_1603_ * 3 + i_1604_] = i_1605_ + 8192 >> 14;
					}
				}
				int i_1607_ = ((is_1587_[0] * i_1581_ + is_1587_[1] * i_1582_ + is_1587_[2] * i_1583_ + 8192) >> 14);
				int i_1608_ = ((is_1587_[3] * i_1581_ + is_1587_[4] * i_1582_ + is_1587_[5] * i_1583_ + 8192) >> 14);
				int i_1609_ = ((is_1587_[6] * i_1581_ + is_1587_[7] * i_1582_ + is_1587_[8] * i_1583_ + 8192) >> 14);
				i_1607_ += i_1599_;
				i_1608_ += i_1600_;
				i_1609_ += i_1601_;
				int[] is_1610_ = new int[9];
				for (int i_1611_ = 0; i_1611_ < 3; i_1611_++) {
					for (int i_1612_ = 0; i_1612_ < 3; i_1612_++) {
						int i_1613_ = 0;
						for (int i_1614_ = 0; i_1614_ < 3; i_1614_++)
							i_1613_ += (is_1559_[i_1611_ * 3 + i_1614_] * is_1602_[i_1612_ + i_1614_ * 3]);
						is_1610_[i_1611_ * 3 + i_1612_] = i_1613_ + 8192 >> 14;
					}
				}
				int i_1615_ = ((is_1559_[0] * i_1607_ + is_1559_[1] * i_1608_ + is_1559_[2] * i_1609_ + 8192) >> 14);
				int i_1616_ = ((is_1559_[3] * i_1607_ + is_1559_[4] * i_1608_ + is_1559_[5] * i_1609_ + 8192) >> 14);
				int i_1617_ = ((is_1559_[6] * i_1607_ + is_1559_[7] * i_1608_ + is_1559_[8] * i_1609_ + 8192) >> 14);
				i_1615_ += i_1578_;
				i_1616_ += i_1579_;
				i_1617_ += i_1580_;
				for (int i_1618_ = 0; i_1618_ < i_1560_; i_1618_++) {
					int i_1619_ = is[i_1618_];
					if (i_1619_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1620_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1619_]);
						for (int i_1621_ = 0; i_1621_ < is_1620_.length; i_1621_++) {
							int i_1622_ = is_1620_[i_1621_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1558_ & (((Class387_Sub3) this).aShortArray8242[i_1622_])) != 0)) {
								int i_1623_ = (is_1610_[0] * (((Class387_Sub3) this).anIntArray8238[i_1622_]) + is_1610_[1] * (((Class387_Sub3) this).anIntArray8195[i_1622_]) + is_1610_[2] * (((Class387_Sub3) this).anIntArray8180[i_1622_]) + 8192) >> 14;
								int i_1624_ = (is_1610_[3] * (((Class387_Sub3) this).anIntArray8238[i_1622_]) + is_1610_[4] * (((Class387_Sub3) this).anIntArray8195[i_1622_]) + is_1610_[5] * (((Class387_Sub3) this).anIntArray8180[i_1622_]) + 8192) >> 14;
								int i_1625_ = (is_1610_[6] * (((Class387_Sub3) this).anIntArray8238[i_1622_]) + is_1610_[7] * (((Class387_Sub3) this).anIntArray8195[i_1622_]) + is_1610_[8] * (((Class387_Sub3) this).anIntArray8180[i_1622_]) + 8192) >> 14;
								i_1623_ += i_1615_;
								i_1624_ += i_1616_;
								i_1625_ += i_1617_;
								((Class387_Sub3) this).anIntArray8238[i_1622_] = i_1623_;
								((Class387_Sub3) this).anIntArray8195[i_1622_] = i_1624_;
								((Class387_Sub3) this).anIntArray8180[i_1622_] = i_1625_;
							}
						}
					}
				}
			} else {
				for (int i_1626_ = 0; i_1626_ < i_1560_; i_1626_++) {
					int i_1627_ = is[i_1626_];
					if (i_1627_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1628_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1627_]);
						for (int i_1629_ = 0; i_1629_ < is_1628_.length; i_1629_++) {
							int i_1630_ = is_1628_[i_1629_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1558_ & (((Class387_Sub3) this).aShortArray8242[i_1630_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_1630_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1630_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1630_] -= ((Class387_Sub3) this).anInt8221;
								if (i_1557_ != 0) {
									int i_1631_ = Class257.anIntArray2683[i_1557_];
									int i_1632_ = Class257.anIntArray2684[i_1557_];
									int i_1633_ = ((((Class387_Sub3) this).anIntArray8195[i_1630_]) * i_1631_ + ((((Class387_Sub3) this).anIntArray8238[i_1630_]) * i_1632_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_1630_] = ((((Class387_Sub3) this).anIntArray8195[i_1630_]) * i_1632_ - ((((Class387_Sub3) this).anIntArray8238[i_1630_]) * i_1631_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_1630_] = i_1633_;
								}
								if (i_1555_ != 0) {
									int i_1634_ = Class257.anIntArray2683[i_1555_];
									int i_1635_ = Class257.anIntArray2684[i_1555_];
									int i_1636_ = ((((Class387_Sub3) this).anIntArray8195[i_1630_]) * i_1635_ - ((((Class387_Sub3) this).anIntArray8180[i_1630_]) * i_1634_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_1630_] = ((((Class387_Sub3) this).anIntArray8195[i_1630_]) * i_1634_ + ((((Class387_Sub3) this).anIntArray8180[i_1630_]) * i_1635_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_1630_] = i_1636_;
								}
								if (i_1556_ != 0) {
									int i_1637_ = Class257.anIntArray2683[i_1556_];
									int i_1638_ = Class257.anIntArray2684[i_1556_];
									int i_1639_ = ((((Class387_Sub3) this).anIntArray8180[i_1630_]) * i_1637_ + ((((Class387_Sub3) this).anIntArray8238[i_1630_]) * i_1638_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_1630_] = ((((Class387_Sub3) this).anIntArray8180[i_1630_]) * i_1638_ - ((((Class387_Sub3) this).anIntArray8238[i_1630_]) * i_1637_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_1630_] = i_1639_;
								}
								((Class387_Sub3) this).anIntArray8238[i_1630_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1630_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1630_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1559_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_1640_ = 0; i_1640_ < ((Class387_Sub3) this).anInt8174; i_1640_++) {
						((Class387_Sub3) this).anIntArray8238[i_1640_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_1640_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_1640_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_1641_ = is_1559_[9] << 4;
				int i_1642_ = is_1559_[10] << 4;
				int i_1643_ = is_1559_[11] << 4;
				int i_1644_ = is_1559_[12] << 4;
				int i_1645_ = is_1559_[13] << 4;
				int i_1646_ = is_1559_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_1647_ = ((is_1559_[0] * ((Class387_Sub3) this).anInt8209 + is_1559_[3] * ((Class387_Sub3) this).anInt8219 + is_1559_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1648_ = ((is_1559_[1] * ((Class387_Sub3) this).anInt8209 + is_1559_[4] * ((Class387_Sub3) this).anInt8219 + is_1559_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1649_ = ((is_1559_[2] * ((Class387_Sub3) this).anInt8209 + is_1559_[5] * ((Class387_Sub3) this).anInt8219 + is_1559_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_1647_ += i_1644_;
					i_1648_ += i_1645_;
					i_1649_ += i_1646_;
					((Class387_Sub3) this).anInt8209 = i_1647_;
					((Class387_Sub3) this).anInt8219 = i_1648_;
					((Class387_Sub3) this).anInt8221 = i_1649_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int i_1650_ = i_1555_ << 15 >> 7;
				int i_1651_ = i_1556_ << 15 >> 7;
				int i_1652_ = i_1557_ << 15 >> 7;
				int i_1653_ = i_1650_ * -((Class387_Sub3) this).anInt8209 + 8192 >> 14;
				int i_1654_ = i_1651_ * -((Class387_Sub3) this).anInt8219 + 8192 >> 14;
				int i_1655_ = i_1652_ * -((Class387_Sub3) this).anInt8221 + 8192 >> 14;
				int i_1656_ = i_1653_ + ((Class387_Sub3) this).anInt8209;
				int i_1657_ = i_1654_ + ((Class387_Sub3) this).anInt8219;
				int i_1658_ = i_1655_ + ((Class387_Sub3) this).anInt8221;
				int[] is_1659_ = new int[9];
				is_1659_[0] = i_1650_ * is_1559_[0] + 8192 >> 14;
				is_1659_[1] = i_1650_ * is_1559_[3] + 8192 >> 14;
				is_1659_[2] = i_1650_ * is_1559_[6] + 8192 >> 14;
				is_1659_[3] = i_1651_ * is_1559_[1] + 8192 >> 14;
				is_1659_[4] = i_1651_ * is_1559_[4] + 8192 >> 14;
				is_1659_[5] = i_1651_ * is_1559_[7] + 8192 >> 14;
				is_1659_[6] = i_1652_ * is_1559_[2] + 8192 >> 14;
				is_1659_[7] = i_1652_ * is_1559_[5] + 8192 >> 14;
				is_1659_[8] = i_1652_ * is_1559_[8] + 8192 >> 14;
				int i_1660_ = i_1650_ * i_1644_ + 8192 >> 14;
				int i_1661_ = i_1651_ * i_1645_ + 8192 >> 14;
				int i_1662_ = i_1652_ * i_1646_ + 8192 >> 14;
				i_1660_ += i_1656_;
				i_1661_ += i_1657_;
				i_1662_ += i_1658_;
				int[] is_1663_ = new int[9];
				for (int i_1664_ = 0; i_1664_ < 3; i_1664_++) {
					for (int i_1665_ = 0; i_1665_ < 3; i_1665_++) {
						int i_1666_ = 0;
						for (int i_1667_ = 0; i_1667_ < 3; i_1667_++)
							i_1666_ += (is_1559_[i_1664_ * 3 + i_1667_] * is_1659_[i_1665_ + i_1667_ * 3]);
						is_1663_[i_1664_ * 3 + i_1665_] = i_1666_ + 8192 >> 14;
					}
				}
				int i_1668_ = ((is_1559_[0] * i_1660_ + is_1559_[1] * i_1661_ + is_1559_[2] * i_1662_ + 8192) >> 14);
				int i_1669_ = ((is_1559_[3] * i_1660_ + is_1559_[4] * i_1661_ + is_1559_[5] * i_1662_ + 8192) >> 14);
				int i_1670_ = ((is_1559_[6] * i_1660_ + is_1559_[7] * i_1661_ + is_1559_[8] * i_1662_ + 8192) >> 14);
				i_1668_ += i_1641_;
				i_1669_ += i_1642_;
				i_1670_ += i_1643_;
				for (int i_1671_ = 0; i_1671_ < i_1560_; i_1671_++) {
					int i_1672_ = is[i_1671_];
					if (i_1672_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1673_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1672_]);
						for (int i_1674_ = 0; i_1674_ < is_1673_.length; i_1674_++) {
							int i_1675_ = is_1673_[i_1674_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1558_ & (((Class387_Sub3) this).aShortArray8242[i_1675_])) != 0)) {
								int i_1676_ = (is_1663_[0] * (((Class387_Sub3) this).anIntArray8238[i_1675_]) + is_1663_[1] * (((Class387_Sub3) this).anIntArray8195[i_1675_]) + is_1663_[2] * (((Class387_Sub3) this).anIntArray8180[i_1675_]) + 8192) >> 14;
								int i_1677_ = (is_1663_[3] * (((Class387_Sub3) this).anIntArray8238[i_1675_]) + is_1663_[4] * (((Class387_Sub3) this).anIntArray8195[i_1675_]) + is_1663_[5] * (((Class387_Sub3) this).anIntArray8180[i_1675_]) + 8192) >> 14;
								int i_1678_ = (is_1663_[6] * (((Class387_Sub3) this).anIntArray8238[i_1675_]) + is_1663_[7] * (((Class387_Sub3) this).anIntArray8195[i_1675_]) + is_1663_[8] * (((Class387_Sub3) this).anIntArray8180[i_1675_]) + 8192) >> 14;
								i_1676_ += i_1668_;
								i_1677_ += i_1669_;
								i_1678_ += i_1670_;
								((Class387_Sub3) this).anIntArray8238[i_1675_] = i_1676_;
								((Class387_Sub3) this).anIntArray8195[i_1675_] = i_1677_;
								((Class387_Sub3) this).anIntArray8180[i_1675_] = i_1678_;
							}
						}
					}
				}
			} else {
				for (int i_1679_ = 0; i_1679_ < i_1560_; i_1679_++) {
					int i_1680_ = is[i_1679_];
					if (i_1680_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1681_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1680_]);
						for (int i_1682_ = 0; i_1682_ < is_1681_.length; i_1682_++) {
							int i_1683_ = is_1681_[i_1682_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1558_ & (((Class387_Sub3) this).aShortArray8242[i_1683_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_1683_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1683_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1683_] -= ((Class387_Sub3) this).anInt8221;
								((Class387_Sub3) this).anIntArray8238[i_1683_] = (((Class387_Sub3) this).anIntArray8238[i_1683_]) * i_1555_ / 128;
								((Class387_Sub3) this).anIntArray8195[i_1683_] = (((Class387_Sub3) this).anIntArray8195[i_1683_]) * i_1556_ / 128;
								((Class387_Sub3) this).anIntArray8180[i_1683_] = (((Class387_Sub3) this).anIntArray8180[i_1683_]) * i_1557_ / 128;
								((Class387_Sub3) this).anIntArray8238[i_1683_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1683_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1683_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_1684_ = 0; i_1684_ < i_1560_; i_1684_++) {
					int i_1685_ = is[i_1684_];
					if (i_1685_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1686_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1685_]);
						for (int i_1687_ = 0; i_1687_ < is_1686_.length; i_1687_++) {
							int i_1688_ = is_1686_[i_1687_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_1558_ & (((Class387_Sub3) this).aShortArray8181[i_1688_])) != 0)) {
								int i_1689_ = (((((Class387_Sub3) this).aByteArray8200[i_1688_]) & 0xff) + i_1555_ * 8);
								if (i_1689_ < 0)
									i_1689_ = 0;
								else if (i_1689_ > 255)
									i_1689_ = 255;
								((Class387_Sub3) this).aByteArray8200[i_1688_] = (byte) i_1689_;
							}
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1690_ = 0; i_1690_ < ((Class387_Sub3) this).anInt8215; i_1690_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1690_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1690_]);
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_1691_ = 0; i_1691_ < i_1560_; i_1691_++) {
					int i_1692_ = is[i_1691_];
					if (i_1692_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1693_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1692_]);
						for (int i_1694_ = 0; i_1694_ < is_1693_.length; i_1694_++) {
							int i_1695_ = is_1693_[i_1694_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_1558_ & (((Class387_Sub3) this).aShortArray8181[i_1695_])) != 0)) {
								int i_1696_ = ((((Class387_Sub3) this).modelColors[i_1695_]) & 0xffff);
								int i_1697_ = i_1696_ >> 10 & 0x3f;
								int i_1698_ = i_1696_ >> 7 & 0x7;
								int i_1699_ = i_1696_ & 0x7f;
								i_1697_ = i_1697_ + i_1555_ & 0x3f;
								i_1698_ += i_1556_;
								if (i_1698_ < 0)
									i_1698_ = 0;
								else if (i_1698_ > 7)
									i_1698_ = 7;
								i_1699_ += i_1557_;
								if (i_1699_ < 0)
									i_1699_ = 0;
								else if (i_1699_ > 127)
									i_1699_ = 127;
								((Class387_Sub3) this).modelColors[i_1695_] = (short) (i_1697_ << 10 | i_1698_ << 7 | i_1699_);
							}
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1700_ = 0; i_1700_ < ((Class387_Sub3) this).anInt8215; i_1700_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1700_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1700_]);
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1701_ = 0; i_1701_ < i_1560_; i_1701_++) {
					int i_1702_ = is[i_1701_];
					if (i_1702_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1703_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1702_]);
						for (int i_1704_ = 0; i_1704_ < is_1703_.length; i_1704_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1703_[i_1704_]]);
							((Class10) class10).anInt159 += i_1555_ * 1013441605;
							((Class10) class10).anInt157 += i_1556_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1705_ = 0; i_1705_ < i_1560_; i_1705_++) {
					int i_1706_ = is[i_1705_];
					if (i_1706_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1707_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1706_]);
						for (int i_1708_ = 0; i_1708_ < is_1707_.length; i_1708_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1707_[i_1708_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_1555_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_1556_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1709_ = 0; i_1709_ < i_1560_; i_1709_++) {
					int i_1710_ = is[i_1709_];
					if (i_1710_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1711_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1710_]);
						for (int i_1712_ = 0; i_1712_ < is_1711_.length; i_1712_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1711_[i_1712_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_1555_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}

	void ee(int i, int[] is, int i_1713_, int i_1714_, int i_1715_, boolean bool, int i_1716_, int[] is_1717_) {
		int i_1718_ = is.length;
		if (i == 0) {
			i_1713_ <<= 4;
			i_1714_ <<= 4;
			i_1715_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1719_ = 0; i_1719_ < ((Class387_Sub3) this).anInt8174; i_1719_++) {
					((Class387_Sub3) this).anIntArray8238[i_1719_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1719_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1719_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			int i_1720_ = 0;
			((Class387_Sub3) this).anInt8209 = 0;
			((Class387_Sub3) this).anInt8219 = 0;
			((Class387_Sub3) this).anInt8221 = 0;
			for (int i_1721_ = 0; i_1721_ < i_1718_; i_1721_++) {
				int i_1722_ = is[i_1721_];
				if (i_1722_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1723_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1722_];
					for (int i_1724_ = 0; i_1724_ < is_1723_.length; i_1724_++) {
						int i_1725_ = is_1723_[i_1724_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_1716_ & (((Class387_Sub3) this).aShortArray8242[i_1725_])) != 0) {
							((Class387_Sub3) this).anInt8209 += (((Class387_Sub3) this).anIntArray8238[i_1725_]);
							((Class387_Sub3) this).anInt8219 += (((Class387_Sub3) this).anIntArray8195[i_1725_]);
							((Class387_Sub3) this).anInt8221 += (((Class387_Sub3) this).anIntArray8180[i_1725_]);
							i_1720_++;
						}
					}
				}
			}
			if (i_1720_ > 0) {
				((Class387_Sub3) this).anInt8209 = ((Class387_Sub3) this).anInt8209 / i_1720_ + i_1713_;
				((Class387_Sub3) this).anInt8219 = ((Class387_Sub3) this).anInt8219 / i_1720_ + i_1714_;
				((Class387_Sub3) this).anInt8221 = ((Class387_Sub3) this).anInt8221 / i_1720_ + i_1715_;
				((Class387_Sub3) this).aBoolean8212 = true;
			} else {
				((Class387_Sub3) this).anInt8209 = i_1713_;
				((Class387_Sub3) this).anInt8219 = i_1714_;
				((Class387_Sub3) this).anInt8221 = i_1715_;
			}
		} else if (i == 1) {
			if (is_1717_ != null) {
				int i_1726_ = ((is_1717_[0] * i_1713_ + is_1717_[1] * i_1714_ + is_1717_[2] * i_1715_ + 8192) >> 14);
				int i_1727_ = ((is_1717_[3] * i_1713_ + is_1717_[4] * i_1714_ + is_1717_[5] * i_1715_ + 8192) >> 14);
				int i_1728_ = ((is_1717_[6] * i_1713_ + is_1717_[7] * i_1714_ + is_1717_[8] * i_1715_ + 8192) >> 14);
				i_1713_ = i_1726_;
				i_1714_ = i_1727_;
				i_1715_ = i_1728_;
			}
			i_1713_ <<= 4;
			i_1714_ <<= 4;
			i_1715_ <<= 4;
			if (!((Class387_Sub3) this).aBoolean8208) {
				for (int i_1729_ = 0; i_1729_ < ((Class387_Sub3) this).anInt8174; i_1729_++) {
					((Class387_Sub3) this).anIntArray8238[i_1729_] <<= 4;
					((Class387_Sub3) this).anIntArray8195[i_1729_] <<= 4;
					((Class387_Sub3) this).anIntArray8180[i_1729_] <<= 4;
				}
				((Class387_Sub3) this).aBoolean8208 = true;
			}
			for (int i_1730_ = 0; i_1730_ < i_1718_; i_1730_++) {
				int i_1731_ = is[i_1730_];
				if (i_1731_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
					int[] is_1732_ = ((Class387_Sub3) this).anIntArrayArray8205[i_1731_];
					for (int i_1733_ = 0; i_1733_ < is_1732_.length; i_1733_++) {
						int i_1734_ = is_1732_[i_1733_];
						if (((Class387_Sub3) this).aShortArray8242 == null || (i_1716_ & (((Class387_Sub3) this).aShortArray8242[i_1734_])) != 0) {
							((Class387_Sub3) this).anIntArray8238[i_1734_] += i_1713_;
							((Class387_Sub3) this).anIntArray8195[i_1734_] += i_1714_;
							((Class387_Sub3) this).anIntArray8180[i_1734_] += i_1715_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1717_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_1735_ = 0; i_1735_ < ((Class387_Sub3) this).anInt8174; i_1735_++) {
						((Class387_Sub3) this).anIntArray8238[i_1735_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_1735_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_1735_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_1736_ = is_1717_[9] << 4;
				int i_1737_ = is_1717_[10] << 4;
				int i_1738_ = is_1717_[11] << 4;
				int i_1739_ = is_1717_[12] << 4;
				int i_1740_ = is_1717_[13] << 4;
				int i_1741_ = is_1717_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_1742_ = ((is_1717_[0] * ((Class387_Sub3) this).anInt8209 + is_1717_[3] * ((Class387_Sub3) this).anInt8219 + is_1717_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1743_ = ((is_1717_[1] * ((Class387_Sub3) this).anInt8209 + is_1717_[4] * ((Class387_Sub3) this).anInt8219 + is_1717_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1744_ = ((is_1717_[2] * ((Class387_Sub3) this).anInt8209 + is_1717_[5] * ((Class387_Sub3) this).anInt8219 + is_1717_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_1742_ += i_1739_;
					i_1743_ += i_1740_;
					i_1744_ += i_1741_;
					((Class387_Sub3) this).anInt8209 = i_1742_;
					((Class387_Sub3) this).anInt8219 = i_1743_;
					((Class387_Sub3) this).anInt8221 = i_1744_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int[] is_1745_ = new int[9];
				int i_1746_ = Class257.anIntArray2684[i_1713_];
				int i_1747_ = Class257.anIntArray2683[i_1713_];
				int i_1748_ = Class257.anIntArray2684[i_1714_];
				int i_1749_ = Class257.anIntArray2683[i_1714_];
				int i_1750_ = Class257.anIntArray2684[i_1715_];
				int i_1751_ = Class257.anIntArray2683[i_1715_];
				int i_1752_ = i_1747_ * i_1750_ + 8192 >> 14;
				int i_1753_ = i_1747_ * i_1751_ + 8192 >> 14;
				is_1745_[0] = i_1748_ * i_1750_ + i_1749_ * i_1753_ + 8192 >> 14;
				is_1745_[1] = -i_1748_ * i_1751_ + i_1749_ * i_1752_ + 8192 >> 14;
				is_1745_[2] = i_1749_ * i_1746_ + 8192 >> 14;
				is_1745_[3] = i_1746_ * i_1751_ + 8192 >> 14;
				is_1745_[4] = i_1746_ * i_1750_ + 8192 >> 14;
				is_1745_[5] = -i_1747_;
				is_1745_[6] = -i_1749_ * i_1750_ + i_1748_ * i_1753_ + 8192 >> 14;
				is_1745_[7] = i_1749_ * i_1751_ + i_1748_ * i_1752_ + 8192 >> 14;
				is_1745_[8] = i_1748_ * i_1746_ + 8192 >> 14;
				int i_1754_ = ((is_1745_[0] * -((Class387_Sub3) this).anInt8209 + is_1745_[1] * -((Class387_Sub3) this).anInt8219 + is_1745_[2] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1755_ = ((is_1745_[3] * -((Class387_Sub3) this).anInt8209 + is_1745_[4] * -((Class387_Sub3) this).anInt8219 + is_1745_[5] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1756_ = ((is_1745_[6] * -((Class387_Sub3) this).anInt8209 + is_1745_[7] * -((Class387_Sub3) this).anInt8219 + is_1745_[8] * -((Class387_Sub3) this).anInt8221 + 8192) >> 14);
				int i_1757_ = i_1754_ + ((Class387_Sub3) this).anInt8209;
				int i_1758_ = i_1755_ + ((Class387_Sub3) this).anInt8219;
				int i_1759_ = i_1756_ + ((Class387_Sub3) this).anInt8221;
				int[] is_1760_ = new int[9];
				for (int i_1761_ = 0; i_1761_ < 3; i_1761_++) {
					for (int i_1762_ = 0; i_1762_ < 3; i_1762_++) {
						int i_1763_ = 0;
						for (int i_1764_ = 0; i_1764_ < 3; i_1764_++)
							i_1763_ += (is_1745_[i_1761_ * 3 + i_1764_] * is_1717_[i_1762_ * 3 + i_1764_]);
						is_1760_[i_1761_ * 3 + i_1762_] = i_1763_ + 8192 >> 14;
					}
				}
				int i_1765_ = ((is_1745_[0] * i_1739_ + is_1745_[1] * i_1740_ + is_1745_[2] * i_1741_ + 8192) >> 14);
				int i_1766_ = ((is_1745_[3] * i_1739_ + is_1745_[4] * i_1740_ + is_1745_[5] * i_1741_ + 8192) >> 14);
				int i_1767_ = ((is_1745_[6] * i_1739_ + is_1745_[7] * i_1740_ + is_1745_[8] * i_1741_ + 8192) >> 14);
				i_1765_ += i_1757_;
				i_1766_ += i_1758_;
				i_1767_ += i_1759_;
				int[] is_1768_ = new int[9];
				for (int i_1769_ = 0; i_1769_ < 3; i_1769_++) {
					for (int i_1770_ = 0; i_1770_ < 3; i_1770_++) {
						int i_1771_ = 0;
						for (int i_1772_ = 0; i_1772_ < 3; i_1772_++)
							i_1771_ += (is_1717_[i_1769_ * 3 + i_1772_] * is_1760_[i_1770_ + i_1772_ * 3]);
						is_1768_[i_1769_ * 3 + i_1770_] = i_1771_ + 8192 >> 14;
					}
				}
				int i_1773_ = ((is_1717_[0] * i_1765_ + is_1717_[1] * i_1766_ + is_1717_[2] * i_1767_ + 8192) >> 14);
				int i_1774_ = ((is_1717_[3] * i_1765_ + is_1717_[4] * i_1766_ + is_1717_[5] * i_1767_ + 8192) >> 14);
				int i_1775_ = ((is_1717_[6] * i_1765_ + is_1717_[7] * i_1766_ + is_1717_[8] * i_1767_ + 8192) >> 14);
				i_1773_ += i_1736_;
				i_1774_ += i_1737_;
				i_1775_ += i_1738_;
				for (int i_1776_ = 0; i_1776_ < i_1718_; i_1776_++) {
					int i_1777_ = is[i_1776_];
					if (i_1777_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1778_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1777_]);
						for (int i_1779_ = 0; i_1779_ < is_1778_.length; i_1779_++) {
							int i_1780_ = is_1778_[i_1779_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1716_ & (((Class387_Sub3) this).aShortArray8242[i_1780_])) != 0)) {
								int i_1781_ = (is_1768_[0] * (((Class387_Sub3) this).anIntArray8238[i_1780_]) + is_1768_[1] * (((Class387_Sub3) this).anIntArray8195[i_1780_]) + is_1768_[2] * (((Class387_Sub3) this).anIntArray8180[i_1780_]) + 8192) >> 14;
								int i_1782_ = (is_1768_[3] * (((Class387_Sub3) this).anIntArray8238[i_1780_]) + is_1768_[4] * (((Class387_Sub3) this).anIntArray8195[i_1780_]) + is_1768_[5] * (((Class387_Sub3) this).anIntArray8180[i_1780_]) + 8192) >> 14;
								int i_1783_ = (is_1768_[6] * (((Class387_Sub3) this).anIntArray8238[i_1780_]) + is_1768_[7] * (((Class387_Sub3) this).anIntArray8195[i_1780_]) + is_1768_[8] * (((Class387_Sub3) this).anIntArray8180[i_1780_]) + 8192) >> 14;
								i_1781_ += i_1773_;
								i_1782_ += i_1774_;
								i_1783_ += i_1775_;
								((Class387_Sub3) this).anIntArray8238[i_1780_] = i_1781_;
								((Class387_Sub3) this).anIntArray8195[i_1780_] = i_1782_;
								((Class387_Sub3) this).anIntArray8180[i_1780_] = i_1783_;
							}
						}
					}
				}
			} else {
				for (int i_1784_ = 0; i_1784_ < i_1718_; i_1784_++) {
					int i_1785_ = is[i_1784_];
					if (i_1785_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1786_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1785_]);
						for (int i_1787_ = 0; i_1787_ < is_1786_.length; i_1787_++) {
							int i_1788_ = is_1786_[i_1787_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1716_ & (((Class387_Sub3) this).aShortArray8242[i_1788_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_1788_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1788_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1788_] -= ((Class387_Sub3) this).anInt8221;
								if (i_1715_ != 0) {
									int i_1789_ = Class257.anIntArray2683[i_1715_];
									int i_1790_ = Class257.anIntArray2684[i_1715_];
									int i_1791_ = ((((Class387_Sub3) this).anIntArray8195[i_1788_]) * i_1789_ + ((((Class387_Sub3) this).anIntArray8238[i_1788_]) * i_1790_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_1788_] = ((((Class387_Sub3) this).anIntArray8195[i_1788_]) * i_1790_ - ((((Class387_Sub3) this).anIntArray8238[i_1788_]) * i_1789_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_1788_] = i_1791_;
								}
								if (i_1713_ != 0) {
									int i_1792_ = Class257.anIntArray2683[i_1713_];
									int i_1793_ = Class257.anIntArray2684[i_1713_];
									int i_1794_ = ((((Class387_Sub3) this).anIntArray8195[i_1788_]) * i_1793_ - ((((Class387_Sub3) this).anIntArray8180[i_1788_]) * i_1792_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_1788_] = ((((Class387_Sub3) this).anIntArray8195[i_1788_]) * i_1792_ + ((((Class387_Sub3) this).anIntArray8180[i_1788_]) * i_1793_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8195[i_1788_] = i_1794_;
								}
								if (i_1714_ != 0) {
									int i_1795_ = Class257.anIntArray2683[i_1714_];
									int i_1796_ = Class257.anIntArray2684[i_1714_];
									int i_1797_ = ((((Class387_Sub3) this).anIntArray8180[i_1788_]) * i_1795_ + ((((Class387_Sub3) this).anIntArray8238[i_1788_]) * i_1796_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8180[i_1788_] = ((((Class387_Sub3) this).anIntArray8180[i_1788_]) * i_1796_ - ((((Class387_Sub3) this).anIntArray8238[i_1788_]) * i_1795_) + 16383) >> 14;
									((Class387_Sub3) this).anIntArray8238[i_1788_] = i_1797_;
								}
								((Class387_Sub3) this).anIntArray8238[i_1788_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1788_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1788_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_1717_ != null) {
				if (!((Class387_Sub3) this).aBoolean8208) {
					for (int i_1798_ = 0; i_1798_ < ((Class387_Sub3) this).anInt8174; i_1798_++) {
						((Class387_Sub3) this).anIntArray8238[i_1798_] <<= 4;
						((Class387_Sub3) this).anIntArray8195[i_1798_] <<= 4;
						((Class387_Sub3) this).anIntArray8180[i_1798_] <<= 4;
					}
					((Class387_Sub3) this).aBoolean8208 = true;
				}
				int i_1799_ = is_1717_[9] << 4;
				int i_1800_ = is_1717_[10] << 4;
				int i_1801_ = is_1717_[11] << 4;
				int i_1802_ = is_1717_[12] << 4;
				int i_1803_ = is_1717_[13] << 4;
				int i_1804_ = is_1717_[14] << 4;
				if (((Class387_Sub3) this).aBoolean8212) {
					int i_1805_ = ((is_1717_[0] * ((Class387_Sub3) this).anInt8209 + is_1717_[3] * ((Class387_Sub3) this).anInt8219 + is_1717_[6] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1806_ = ((is_1717_[1] * ((Class387_Sub3) this).anInt8209 + is_1717_[4] * ((Class387_Sub3) this).anInt8219 + is_1717_[7] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					int i_1807_ = ((is_1717_[2] * ((Class387_Sub3) this).anInt8209 + is_1717_[5] * ((Class387_Sub3) this).anInt8219 + is_1717_[8] * ((Class387_Sub3) this).anInt8221 + 8192) >> 14);
					i_1805_ += i_1802_;
					i_1806_ += i_1803_;
					i_1807_ += i_1804_;
					((Class387_Sub3) this).anInt8209 = i_1805_;
					((Class387_Sub3) this).anInt8219 = i_1806_;
					((Class387_Sub3) this).anInt8221 = i_1807_;
					((Class387_Sub3) this).aBoolean8212 = false;
				}
				int i_1808_ = i_1713_ << 15 >> 7;
				int i_1809_ = i_1714_ << 15 >> 7;
				int i_1810_ = i_1715_ << 15 >> 7;
				int i_1811_ = i_1808_ * -((Class387_Sub3) this).anInt8209 + 8192 >> 14;
				int i_1812_ = i_1809_ * -((Class387_Sub3) this).anInt8219 + 8192 >> 14;
				int i_1813_ = i_1810_ * -((Class387_Sub3) this).anInt8221 + 8192 >> 14;
				int i_1814_ = i_1811_ + ((Class387_Sub3) this).anInt8209;
				int i_1815_ = i_1812_ + ((Class387_Sub3) this).anInt8219;
				int i_1816_ = i_1813_ + ((Class387_Sub3) this).anInt8221;
				int[] is_1817_ = new int[9];
				is_1817_[0] = i_1808_ * is_1717_[0] + 8192 >> 14;
				is_1817_[1] = i_1808_ * is_1717_[3] + 8192 >> 14;
				is_1817_[2] = i_1808_ * is_1717_[6] + 8192 >> 14;
				is_1817_[3] = i_1809_ * is_1717_[1] + 8192 >> 14;
				is_1817_[4] = i_1809_ * is_1717_[4] + 8192 >> 14;
				is_1817_[5] = i_1809_ * is_1717_[7] + 8192 >> 14;
				is_1817_[6] = i_1810_ * is_1717_[2] + 8192 >> 14;
				is_1817_[7] = i_1810_ * is_1717_[5] + 8192 >> 14;
				is_1817_[8] = i_1810_ * is_1717_[8] + 8192 >> 14;
				int i_1818_ = i_1808_ * i_1802_ + 8192 >> 14;
				int i_1819_ = i_1809_ * i_1803_ + 8192 >> 14;
				int i_1820_ = i_1810_ * i_1804_ + 8192 >> 14;
				i_1818_ += i_1814_;
				i_1819_ += i_1815_;
				i_1820_ += i_1816_;
				int[] is_1821_ = new int[9];
				for (int i_1822_ = 0; i_1822_ < 3; i_1822_++) {
					for (int i_1823_ = 0; i_1823_ < 3; i_1823_++) {
						int i_1824_ = 0;
						for (int i_1825_ = 0; i_1825_ < 3; i_1825_++)
							i_1824_ += (is_1717_[i_1822_ * 3 + i_1825_] * is_1817_[i_1823_ + i_1825_ * 3]);
						is_1821_[i_1822_ * 3 + i_1823_] = i_1824_ + 8192 >> 14;
					}
				}
				int i_1826_ = ((is_1717_[0] * i_1818_ + is_1717_[1] * i_1819_ + is_1717_[2] * i_1820_ + 8192) >> 14);
				int i_1827_ = ((is_1717_[3] * i_1818_ + is_1717_[4] * i_1819_ + is_1717_[5] * i_1820_ + 8192) >> 14);
				int i_1828_ = ((is_1717_[6] * i_1818_ + is_1717_[7] * i_1819_ + is_1717_[8] * i_1820_ + 8192) >> 14);
				i_1826_ += i_1799_;
				i_1827_ += i_1800_;
				i_1828_ += i_1801_;
				for (int i_1829_ = 0; i_1829_ < i_1718_; i_1829_++) {
					int i_1830_ = is[i_1829_];
					if (i_1830_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1831_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1830_]);
						for (int i_1832_ = 0; i_1832_ < is_1831_.length; i_1832_++) {
							int i_1833_ = is_1831_[i_1832_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1716_ & (((Class387_Sub3) this).aShortArray8242[i_1833_])) != 0)) {
								int i_1834_ = (is_1821_[0] * (((Class387_Sub3) this).anIntArray8238[i_1833_]) + is_1821_[1] * (((Class387_Sub3) this).anIntArray8195[i_1833_]) + is_1821_[2] * (((Class387_Sub3) this).anIntArray8180[i_1833_]) + 8192) >> 14;
								int i_1835_ = (is_1821_[3] * (((Class387_Sub3) this).anIntArray8238[i_1833_]) + is_1821_[4] * (((Class387_Sub3) this).anIntArray8195[i_1833_]) + is_1821_[5] * (((Class387_Sub3) this).anIntArray8180[i_1833_]) + 8192) >> 14;
								int i_1836_ = (is_1821_[6] * (((Class387_Sub3) this).anIntArray8238[i_1833_]) + is_1821_[7] * (((Class387_Sub3) this).anIntArray8195[i_1833_]) + is_1821_[8] * (((Class387_Sub3) this).anIntArray8180[i_1833_]) + 8192) >> 14;
								i_1834_ += i_1826_;
								i_1835_ += i_1827_;
								i_1836_ += i_1828_;
								((Class387_Sub3) this).anIntArray8238[i_1833_] = i_1834_;
								((Class387_Sub3) this).anIntArray8195[i_1833_] = i_1835_;
								((Class387_Sub3) this).anIntArray8180[i_1833_] = i_1836_;
							}
						}
					}
				}
			} else {
				for (int i_1837_ = 0; i_1837_ < i_1718_; i_1837_++) {
					int i_1838_ = is[i_1837_];
					if (i_1838_ < ((Class387_Sub3) this).anIntArrayArray8205.length) {
						int[] is_1839_ = (((Class387_Sub3) this).anIntArrayArray8205[i_1838_]);
						for (int i_1840_ = 0; i_1840_ < is_1839_.length; i_1840_++) {
							int i_1841_ = is_1839_[i_1840_];
							if (((Class387_Sub3) this).aShortArray8242 == null || ((i_1716_ & (((Class387_Sub3) this).aShortArray8242[i_1841_])) != 0)) {
								((Class387_Sub3) this).anIntArray8238[i_1841_] -= ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1841_] -= ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1841_] -= ((Class387_Sub3) this).anInt8221;
								((Class387_Sub3) this).anIntArray8238[i_1841_] = (((Class387_Sub3) this).anIntArray8238[i_1841_]) * i_1713_ / 128;
								((Class387_Sub3) this).anIntArray8195[i_1841_] = (((Class387_Sub3) this).anIntArray8195[i_1841_]) * i_1714_ / 128;
								((Class387_Sub3) this).anIntArray8180[i_1841_] = (((Class387_Sub3) this).anIntArray8180[i_1841_]) * i_1715_ / 128;
								((Class387_Sub3) this).anIntArray8238[i_1841_] += ((Class387_Sub3) this).anInt8209;
								((Class387_Sub3) this).anIntArray8195[i_1841_] += ((Class387_Sub3) this).anInt8219;
								((Class387_Sub3) this).anIntArray8180[i_1841_] += ((Class387_Sub3) this).anInt8221;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null && ((Class387_Sub3) this).aByteArray8200 != null) {
				for (int i_1842_ = 0; i_1842_ < i_1718_; i_1842_++) {
					int i_1843_ = is[i_1842_];
					if (i_1843_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1844_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1843_]);
						for (int i_1845_ = 0; i_1845_ < is_1844_.length; i_1845_++) {
							int i_1846_ = is_1844_[i_1845_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_1716_ & (((Class387_Sub3) this).aShortArray8181[i_1846_])) != 0)) {
								int i_1847_ = (((((Class387_Sub3) this).aByteArray8200[i_1846_]) & 0xff) + i_1713_ * 8);
								if (i_1847_ < 0)
									i_1847_ = 0;
								else if (i_1847_ > 255)
									i_1847_ = 255;
								((Class387_Sub3) this).aByteArray8200[i_1846_] = (byte) i_1847_;
							}
						}
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1848_ = 0; i_1848_ < ((Class387_Sub3) this).anInt8215; i_1848_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1848_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1848_]);
						((Class10) class10).anInt163 = ((((Class10) class10).anInt163 * 1548605205 & 0xffffff) | 255 - ((((Class387_Sub3) this).aByteArray8200[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xff) << 24) * 680837181;
					}
				}
			}
		} else if (i == 7) {
			if (((Class387_Sub3) this).anIntArrayArray8206 != null) {
				for (int i_1849_ = 0; i_1849_ < i_1718_; i_1849_++) {
					int i_1850_ = is[i_1849_];
					if (i_1850_ < ((Class387_Sub3) this).anIntArrayArray8206.length) {
						int[] is_1851_ = (((Class387_Sub3) this).anIntArrayArray8206[i_1850_]);
						for (int i_1852_ = 0; i_1852_ < is_1851_.length; i_1852_++) {
							int i_1853_ = is_1851_[i_1852_];
							if (((Class387_Sub3) this).aShortArray8181 == null || ((i_1716_ & (((Class387_Sub3) this).aShortArray8181[i_1853_])) != 0)) {
								int i_1854_ = ((((Class387_Sub3) this).modelColors[i_1853_]) & 0xffff);
								int i_1855_ = i_1854_ >> 10 & 0x3f;
								int i_1856_ = i_1854_ >> 7 & 0x7;
								int i_1857_ = i_1854_ & 0x7f;
								i_1855_ = i_1855_ + i_1713_ & 0x3f;
								i_1856_ += i_1714_;
								if (i_1856_ < 0)
									i_1856_ = 0;
								else if (i_1856_ > 7)
									i_1856_ = 7;
								i_1857_ += i_1715_;
								if (i_1857_ < 0)
									i_1857_ = 0;
								else if (i_1857_ > 127)
									i_1857_ = 127;
								((Class387_Sub3) this).modelColors[i_1853_] = (short) (i_1855_ << 10 | i_1856_ << 7 | i_1857_);
							}
						}
						((Class387_Sub3) this).aBoolean8207 = true;
					}
				}
				if (((Class387_Sub3) this).aClass20Array8216 != null) {
					for (int i_1858_ = 0; i_1858_ < ((Class387_Sub3) this).anInt8215; i_1858_++) {
						Class20 class20 = (((Class387_Sub3) this).aClass20Array8216[i_1858_]);
						Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[i_1858_]);
						((Class10) class10).anInt163 = (((((Class10) class10).anInt163 * 1548605205 & ~0xffffff) | (Console.anIntArray4263[(Class356.modifyColor((((Class387_Sub3) this).modelColors[(((Class20) class20).modelColorIndex * 1557092081)]) & 0xffff, (byte) 1)) & 0xffff]) & 0xffffff) * 680837181);
					}
				}
			}
		} else if (i == 8) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1859_ = 0; i_1859_ < i_1718_; i_1859_++) {
					int i_1860_ = is[i_1859_];
					if (i_1860_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1861_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1860_]);
						for (int i_1862_ = 0; i_1862_ < is_1861_.length; i_1862_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1861_[i_1862_]]);
							((Class10) class10).anInt159 += i_1713_ * 1013441605;
							((Class10) class10).anInt157 += i_1714_ * 1685996777;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1863_ = 0; i_1863_ < i_1718_; i_1863_++) {
					int i_1864_ = is[i_1863_];
					if (i_1864_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1865_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1864_]);
						for (int i_1866_ = 0; i_1866_ < is_1865_.length; i_1866_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1865_[i_1866_]]);
							((Class10) class10).aFloat154 = (((Class10) class10).aFloat154 * (float) i_1713_ / 128.0F);
							((Class10) class10).aFloat155 = (((Class10) class10).aFloat155 * (float) i_1714_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class387_Sub3) this).anIntArrayArray8218 != null) {
				for (int i_1867_ = 0; i_1867_ < i_1718_; i_1867_++) {
					int i_1868_ = is[i_1867_];
					if (i_1868_ < ((Class387_Sub3) this).anIntArrayArray8218.length) {
						int[] is_1869_ = (((Class387_Sub3) this).anIntArrayArray8218[i_1868_]);
						for (int i_1870_ = 0; i_1870_ < is_1869_.length; i_1870_++) {
							Class10 class10 = (((Class387_Sub3) this).aClass10Array8211[is_1869_[i_1870_]]);
							((Class10) class10).anInt158 = ((((Class10) class10).anInt158 * -492325789 + i_1713_) & 0x3fff) * 800091467;
						}
					}
				}
			}
		}
	}
}
