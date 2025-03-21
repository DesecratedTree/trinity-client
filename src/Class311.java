/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class311 {
	static int anInt3216 = 128;
	static int anInt3217 = 512;
	int anInt3218;
	static int anInt3219 = 2;
	int anInt3220;
	static Class61 aClass61_3221;
	int anInt3222;
	int anInt3223;
	int anInt3224;
	boolean aBoolean3225;
	static int anInt3226 = 16;
	int anInt3227;
	int anInt3228;
	int anInt3229;
	int anInt3230;
	static int anInt3231 = 1;
	int anInt3232;
	Class61 aClass61_3233;
	int anInt3234;
	int anInt3235;
	int anInt3236;
	static int anInt3237 = 24;
	static int anInt3238 = 24;
	static int anInt3239 = 192;
	static int anInt3240 = 0;
	static int anInt3241 = 13;
	int anInt3242;
	static Class387 aClass387_3243;
	int anInt3244;
	static Class61 aClass61_3245;
	static int[] anIntArray3246 = new int[4];

	static void method3102() {
		aClass387_3243 = null;
		aClass61_3245 = null;
	}

	boolean method3103(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_;
		int i_4_;
		int i_5_;
		if (!((Class311) this).aBoolean3225) {
			i_3_ = ((Class311) this).anInt3222 - i;
			i_4_ = ((Class311) this).anInt3223 - i_0_;
			i_5_ = ((Class311) this).anInt3236 - i_1_;
			((Class311) this).anInt3230 = (int) Math.sqrt((double) (i_3_ * i_3_ + i_4_ * i_4_ + i_5_ * i_5_));
			if (((Class311) this).anInt3230 == 0)
				((Class311) this).anInt3230 = 1;
			i_3_ = (i_3_ << 8) / ((Class311) this).anInt3230;
			i_4_ = (i_4_ << 8) / ((Class311) this).anInt3230;
			i_5_ = (i_5_ << 8) / ((Class311) this).anInt3230;
		} else {
			((Class311) this).anInt3230 = 1073741823;
			i_3_ = ((Class311) this).anInt3222;
			i_4_ = ((Class311) this).anInt3223;
			i_5_ = ((Class311) this).anInt3236;
		}
		int i_6_ = (int) (Math.sqrt((double) (i_3_ * i_3_ + i_4_ * i_4_ + i_5_ * i_5_)) * 256.0);
		if (i_6_ > 128) {
			i_3_ = (i_3_ << 16) / i_6_;
			i_4_ = (i_4_ << 16) / i_6_;
			i_5_ = (i_5_ << 16) / i_6_;
			((Class311) this).anInt3232 = (((Class311) this).anInt3218 * i_2_ / (((Class311) this).aBoolean3225 ? 1024 : ((Class311) this).anInt3230));
		} else
			((Class311) this).anInt3232 = 0;
		if (((Class311) this).anInt3232 < 8) {
			((Class311) this).aClass61_3233 = null;
			return false;
		}
		int i_7_ = Class136.method1594(((Class311) this).anInt3232, 2014059947);
		if (i_7_ > i_2_)
			i_7_ = Class385.method4425(i_2_, (short) 8776);
		if (i_7_ > 512)
			i_7_ = 512;
		if (i_7_ != ((Class311) this).anInt3224)
			((Class311) this).anInt3224 = i_7_;
		((Class311) this).anInt3228 = (int) (Math.asin((double) ((float) i_4_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		((Class311) this).anInt3229 = (int) (Math.atan2((double) i_3_, (double) -i_5_) * 2607.5945876176133) & 0x3fff;
		((Class311) this).aClass61_3233 = null;
		return true;
	}

	boolean method3104(Class_ra class_ra, Class311 class311_8_) {
		return (((Class311) this).aClass61_3233 != null || method3106(class_ra, class311_8_));
	}

	void method3105(Class_ra class_ra, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (((Class311) this).aClass61_3233 != null) {
			float[] fs = new float[3];
			float f = (float) -(((Class311) this).anInt3222 - i_14_ << 16);
			float f_18_ = (float) (((Class311) this).anInt3223 - i_15_ << 15);
			float f_19_ = (float) -(((Class311) this).anInt3236 - i_16_ << 16);
			float[] fs_20_ = new float[3];
			class_ra.cq().method2472(fs_20_);
			f += fs_20_[0];
			f_18_ += fs_20_[1];
			f_19_ += fs_20_[2];
			class_ra.method_do(f, f_18_, f_19_, fs);
			if (!(fs[2] < 0.0F)) {
				int i_21_ = (int) (fs[0] - (float) (((Class311) this).anInt3232 / 2));
				int i_22_ = (int) (fs[1] - (float) (((Class311) this).anInt3232 / 2));
				if (i_22_ < i_11_ && i_22_ + ((Class311) this).anInt3232 > 0 && i_21_ < i_10_ && i_21_ + ((Class311) this).anInt3232 > 0)
					((Class311) this).aClass61_3233.method691(i_21_, i_22_, ((Class311) this).anInt3232, ((Class311) this).anInt3232, 0, i_17_ << 24 | 0xffffff, 1);
			}
		}
	}

	boolean method3106(Class_ra class_ra, Class311 class311_23_) {
		if (((Class311) this).aClass61_3233 == null) {
			if (((Class311) this).anInt3234 == 0) {
				if (Class209.anInterface_ma1984.method237(((Class311) this).anInt3220, Class377.aClass377_3935, 0.7F, ((Class311) this).anInt3224, ((Class311) this).anInt3224, false, 2137334619)) {
					int[] is = (Class209.anInterface_ma1984.method231(((Class311) this).anInt3220, 0.7F, ((Class311) this).anInt3224, ((Class311) this).anInt3224, false, -1487262537));
					((Class311) this).aClass61_3233 = class_ra.method4795(is, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224, ((Class311) this).anInt3224, (byte) -103);
				}
			} else if (((Class311) this).anInt3234 == 2)
				method3107(class_ra, class311_23_);
			else if (((Class311) this).anInt3234 == 1)
				method3110(class_ra, class311_23_);
		}
		return ((Class311) this).aClass61_3233 != null;
	}

	void method3107(Class_ra class_ra, Class311 class311_24_) {
		Model class98 = Model.loadModel(Class126_Sub2.aClass280_7229, ((Class311) this).anInt3220, 0);
		if (class98 != null) {
			class_ra.qa(anIntArray3246);
			class_ra.r(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224);
			class_ra.ba(2, 0);
			class_ra.B(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224, 0, 0);
			int i = 0;
			int i_25_ = 0;
			int i_26_ = 256;
			if (class311_24_ != null) {
				if (((Class311) class311_24_).aBoolean3225) {
					i = -((Class311) class311_24_).anInt3222;
					i_25_ = -((Class311) class311_24_).anInt3223;
					i_26_ = -((Class311) class311_24_).anInt3236;
				} else {
					i = (((Class311) this).anInt3222 - ((Class311) class311_24_).anInt3222);
					i_25_ = (((Class311) this).anInt3223 - ((Class311) class311_24_).anInt3223);
					i_26_ = (((Class311) this).anInt3236 - ((Class311) class311_24_).anInt3236);
				}
			}
			if (((Class311) this).anInt3228 != 0) {
				int i_27_ = -((Class311) this).anInt3228 & 0x3fff;
				int i_28_ = Class257.anIntArray2683[i_27_];
				int i_29_ = Class257.anIntArray2684[i_27_];
				int i_30_ = i_25_ * i_29_ - i_26_ * i_28_ >> 14;
				i_26_ = i_25_ * i_28_ + i_26_ * i_29_ >> 14;
				i_25_ = i_30_;
			}
			if (((Class311) this).anInt3229 != 0) {
				int i_31_ = -((Class311) this).anInt3229 & 0x3fff;
				int i_32_ = Class257.anIntArray2683[i_31_];
				int i_33_ = Class257.anIntArray2684[i_31_];
				int i_34_ = i_26_ * i_32_ + i * i_33_ >> 14;
				i_26_ = i_26_ * i_33_ - i * i_32_ >> 14;
				i = i_34_;
			}
			class_ra.IA(1.0F);
			class_ra.m(((Class311) this).anInt3227, 1.0F, 1.0F, (float) i, (float) i_25_, (float) i_26_);
			class98.method1195(((Class311) this).anInt3242 & 0x3fff, ((Class311) this).anInt3235 & 0x3fff, ((Class311) this).anInt3244 & 0x3fff);
			Class387 class387 = class_ra.cb(class98, 2048, 0, 64, 768);
			int i_35_ = class387.ya() - class387.RA();
			int i_36_ = class387.o() - class387.YA();
			int i_37_ = i_35_ > i_36_ ? i_35_ : i_36_;
			int i_38_ = 1024 * ((Class311) this).anInt3224 / i_37_;
			Class249 class249 = class_ra.cs();
			Class249 class249_39_ = class_ra.cz();
			class249_39_.method2494((float) (((Class311) this).anInt3224 / 2), (float) (((Class311) this).anInt3224 / 2), (float) i_38_, (float) i_38_, 50.0F, 50000.0F, (float) class_ra.method4782((byte) 0).method856(), (float) class_ra.method4782((byte) 0).method857(), 1024.0F);
			class_ra.ci(class249_39_);
			Class247 class247 = new Class247();
			class_ra.cw(class247);
			Class247 class247_40_ = class_ra.cj();
			class247_40_.method2476(0.0F, 0.0F, (float) (50 - class387.AA()));
			class387.method4475(class247_40_, null, 1);
			((Class311) this).aClass61_3233 = class_ra.bj(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224, true);
			((Class311) this).aClass61_3233.method722(0, 0, 3);
			class_ra.ci(class249);
			class_ra.r(anIntArray3246[0], anIntArray3246[1], anIntArray3246[2], anIntArray3246[3]);
		}
	}

	static void method3108(Class_ra class_ra) {
		if (aClass387_3243 == null) {
			Model class98 = new Model(580, 1104, 1);
			class98.method1191((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
			class98.method1189(0, 128, 0);
			class98.method1189(0, -128, 0);
			for (int i = 0; i <= 24; i++) {
				int i_41_ = i * 8192 / 24;
				int i_42_ = Class257.anIntArray2683[i_41_];
				int i_43_ = Class257.anIntArray2684[i_41_];
				for (int i_44_ = 1; i_44_ < 24; i_44_++) {
					int i_45_ = i_44_ * 8192 / 24;
					int i_46_ = Class257.anIntArray2684[i_45_] >> 7;
					int i_47_ = Class257.anIntArray2683[i_45_] * i_42_ >> 21;
					int i_48_ = Class257.anIntArray2683[i_45_] * i_43_ >> 21;
					class98.method1189(i_48_, i_46_, -i_47_);
				}
				if (i > 0) {
					int i_49_ = i * 23 + 2;
					int i_50_ = i_49_ - 23;
					class98.method1190(0, i_50_, i_49_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					for (int i_51_ = 1; i_51_ < 23; i_51_++) {
						int i_52_ = i_50_ + 1;
						int i_53_ = i_49_ + 1;
						class98.method1190(i_50_, i_52_, i_49_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						class98.method1190(i_52_, i_53_, i_49_, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
						i_50_ = i_52_;
						i_49_ = i_53_;
					}
					class98.method1190(i_49_, i_50_, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				}
			}
			class98.anInt874 = class98.anInt897;
			class98.anIntArray890 = null;
			class98.anIntArray880 = null;
			class98.aByteArray885 = null;
			aClass387_3243 = class_ra.cb(class98, 51200, 33, 64, 768);
		}
	}

	static void method3109(Class_ra class_ra) {
		if (aClass61_3245 == null) {
			int[] is = new int[16384];
			int[] is_54_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_55_ = 64 - i;
				i_55_ *= i_55_;
				int i_56_ = 128 - i - 1;
				int i_57_ = i * 128;
				int i_58_ = i_56_ * 128;
				for (int i_59_ = 0; i_59_ < 64; i_59_++) {
					int i_60_ = 64 - i_59_;
					i_60_ *= i_60_;
					int i_61_ = 128 - i_59_ - 1;
					int i_62_ = 256 - (i_60_ + i_55_ << 8) / 4096;
					i_62_ = i_62_ * 3072 / 1536;
					if (i_62_ < 0)
						i_62_ = 0;
					else if (i_62_ > 255)
						i_62_ = 255;
					int i_63_ = i_62_ / 2;
					is_54_[i_57_ + i_59_] = is_54_[i_57_ + i_61_] = is_54_[i_58_ + i_59_] = is_54_[i_58_ + i_61_] = ~0xffffff | i_62_ << 16;
					is[i_57_ + i_59_] = is[i_57_ + i_61_] = is[i_58_ + i_59_] = is[i_58_ + i_61_] = 127 - i_63_ << 24 | 0xffffff;
				}
			}
			aClass61_3245 = class_ra.method4795(is_54_, 0, 128, 128, 128, (byte) -119);
			aClass61_3221 = class_ra.method4795(is, 0, 128, 128, 128, (byte) -39);
		}
	}

	void method3110(Class_ra class_ra, Class311 class311_64_) {
		method3108(class_ra);
		method3109(class_ra);
		class_ra.qa(anIntArray3246);
		class_ra.r(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224);
		class_ra.ba(2, 0);
		class_ra.B(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224, ~0xffffff | ((Class311) this).anInt3227, 0);
		int i = 0;
		int i_65_ = 0;
		int i_66_ = 256;
		if (class311_64_ != null) {
			if (((Class311) class311_64_).aBoolean3225) {
				i = -((Class311) class311_64_).anInt3222;
				i_65_ = -((Class311) class311_64_).anInt3223;
				i_66_ = -((Class311) class311_64_).anInt3236;
			} else {
				i = (((Class311) class311_64_).anInt3222 - ((Class311) this).anInt3222);
				i_65_ = (((Class311) class311_64_).anInt3223 - ((Class311) this).anInt3223);
				i_66_ = (((Class311) class311_64_).anInt3236 - ((Class311) this).anInt3236);
			}
		}
		if (((Class311) this).anInt3228 != 0) {
			int i_67_ = Class257.anIntArray2683[((Class311) this).anInt3228];
			int i_68_ = Class257.anIntArray2684[((Class311) this).anInt3228];
			int i_69_ = i_65_ * i_68_ - i_66_ * i_67_ >> 14;
			i_66_ = i_65_ * i_67_ + i_66_ * i_68_ >> 14;
			i_65_ = i_69_;
		}
		if (((Class311) this).anInt3229 != 0) {
			int i_70_ = Class257.anIntArray2683[((Class311) this).anInt3229];
			int i_71_ = Class257.anIntArray2684[((Class311) this).anInt3229];
			int i_72_ = i_66_ * i_70_ + i * i_71_ >> 14;
			i_66_ = i_66_ * i_71_ - i * i_70_ >> 14;
			i = i_72_;
		}
		Class387 class387 = aClass387_3243.method4446((byte) 0, 51200, true);
		class387.paintTexture((short) 0, (short) ((Class311) this).anInt3220);
		class_ra.IA(1.0F);
		class_ra.m(16777215, 1.0F, 1.0F, (float) i, (float) i_65_, (float) i_66_);
		int i_73_ = (1024 * ((Class311) this).anInt3224 / (class387.ya() - class387.RA()));
		if (((Class311) this).anInt3227 != 0)
			i_73_ = i_73_ * 13 / 16;
		Class249 class249 = class_ra.cs();
		Class249 class249_74_ = class_ra.cz();
		class249_74_.method2494((float) (((Class311) this).anInt3224 / 2), (float) (((Class311) this).anInt3224 / 2), (float) i_73_, (float) i_73_, 50.0F, 50000.0F, (float) class_ra.method4782((byte) 0).method856(), (float) class_ra.method4782((byte) 0).method857(), 1024.0F);
		class_ra.ci(class249_74_);
		class_ra.cw(new Class247());
		Class247 class247 = new Class247();
		class247.method2476(0.0F, 0.0F, (float) (50 - class387.AA()));
		class387.method4475(class247, null, 1);
		int i_75_ = ((Class311) this).anInt3224 * 13 / 16;
		int i_76_ = (((Class311) this).anInt3224 - i_75_) / 2;
		aClass61_3221.method691(i_76_, i_76_, i_75_, i_75_, 0, ~0xffffff | ((Class311) this).anInt3227, 1);
		((Class311) this).aClass61_3233 = class_ra.bj(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224, true);
		class_ra.ba(2, 0);
		class_ra.B(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224, 0, 0);
		aClass61_3245.method691(0, 0, ((Class311) this).anInt3224, ((Class311) this).anInt3224, 1, 0, 0);
		((Class311) this).aClass61_3233.method722(0, 0, 3);
		class_ra.ci(class249);
		class_ra.r(anIntArray3246[0], anIntArray3246[1], anIntArray3246[2], anIntArray3246[3]);
	}

	public Class311(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, boolean bool, int i_83_, int i_84_, int i_85_) {
		((Class311) this).anInt3222 = i_78_;
		((Class311) this).anInt3223 = i_79_;
		((Class311) this).anInt3236 = i_80_;
		((Class311) this).aBoolean3225 = bool;
		((Class311) this).anInt3220 = i_77_;
		((Class311) this).anInt3227 = i_82_;
		((Class311) this).anInt3218 = i_81_;
		((Class311) this).anInt3234 = i;
		((Class311) this).anInt3242 = i_83_;
		((Class311) this).anInt3235 = i_84_;
		((Class311) this).anInt3244 = i_85_;
	}
}
