/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290 {
	static float[] aFloatArray2963;
	int[] anIntArray2964;
	static int[] anIntArray2965 = { 256, 128, 86, 64 };
	int anInt2966;
	static int[] anIntArray2967;
	int[] anIntArray2968;
	int[] anIntArray2969;
	int[] anIntArray2970;
	int[] anIntArray2971;
	static int[] anIntArray2972;
	int[][] anIntArrayArray2973;
	static boolean[] aBooleanArray2974;

	void method2895(float[] fs, int i) {
		int i_0_ = ((Class290) this).anIntArray2964.length;
		int i_1_ = anIntArray2965[((Class290) this).anInt2966 - 1];
		boolean[] bools = aBooleanArray2974;
		aBooleanArray2974[1] = true;
		bools[0] = true;
		for (int i_2_ = 2; i_2_ < i_0_; i_2_++) {
			int i_3_ = method2900(anIntArray2972, i_2_);
			int i_4_ = method2901(anIntArray2972, i_2_);
			int i_5_ = method2896(anIntArray2972[i_3_], anIntArray2967[i_3_], anIntArray2972[i_4_], anIntArray2967[i_4_], anIntArray2972[i_2_]);
			int i_6_ = anIntArray2967[i_2_];
			int i_7_ = i_1_ - i_5_;
			int i_8_ = i_5_;
			int i_9_ = (i_7_ < i_8_ ? i_7_ : i_8_) << 1;
			if (i_6_ != 0) {
				boolean[] bools_10_ = aBooleanArray2974;
				int i_11_ = i_3_;
				aBooleanArray2974[i_4_] = true;
				bools_10_[i_11_] = true;
				aBooleanArray2974[i_2_] = true;
				if (i_6_ >= i_9_)
					anIntArray2967[i_2_] = (i_7_ > i_8_ ? i_6_ - i_8_ + i_5_ : i_5_ - i_6_ + i_7_ - 1);
				else
					anIntArray2967[i_2_] = ((i_6_ & 0x1) != 0 ? i_5_ - (i_6_ + 1) / 2 : i_5_ + i_6_ / 2);
			} else {
				aBooleanArray2974[i_2_] = false;
				anIntArray2967[i_2_] = i_5_;
			}
		}
		method2897(0, i_0_ - 1);
		int i_12_ = 0;
		int i_13_ = anIntArray2967[0] * ((Class290) this).anInt2966;
		for (int i_14_ = 1; i_14_ < i_0_; i_14_++) {
			if (aBooleanArray2974[i_14_]) {
				int i_15_ = anIntArray2972[i_14_];
				int i_16_ = anIntArray2967[i_14_] * ((Class290) this).anInt2966;
				method2899(i_12_, i_13_, i_15_, i_16_, fs, i);
				if (i_15_ >= i)
					return;
				i_12_ = i_15_;
				i_13_ = i_16_;
			}
		}
		float f = aFloatArray2963[i_13_];
		for (int i_17_ = i_12_; i_17_ < i; i_17_++)
			fs[i_17_] *= f;
	}

	int method2896(int i, int i_18_, int i_19_, int i_20_, int i_21_) {
		int i_22_ = i_20_ - i_18_;
		int i_23_ = i_19_ - i;
		int i_24_ = i_22_ < 0 ? -i_22_ : i_22_;
		int i_25_ = i_24_ * (i_21_ - i);
		int i_26_ = i_25_ / i_23_;
		return i_22_ < 0 ? i_18_ - i_26_ : i_18_ + i_26_;
	}

	void method2897(int i, int i_27_) {
		if (i < i_27_) {
			int i_28_ = i;
			int i_29_ = anIntArray2972[i_28_];
			int i_30_ = anIntArray2967[i_28_];
			boolean bool = aBooleanArray2974[i_28_];
			for (int i_31_ = i + 1; i_31_ <= i_27_; i_31_++) {
				int i_32_ = anIntArray2972[i_31_];
				if (i_32_ < i_29_) {
					anIntArray2972[i_28_] = i_32_;
					anIntArray2967[i_28_] = anIntArray2967[i_31_];
					aBooleanArray2974[i_28_] = aBooleanArray2974[i_31_];
					i_28_++;
					anIntArray2972[i_31_] = anIntArray2972[i_28_];
					anIntArray2967[i_31_] = anIntArray2967[i_28_];
					aBooleanArray2974[i_31_] = aBooleanArray2974[i_28_];
				}
			}
			anIntArray2972[i_28_] = i_29_;
			anIntArray2967[i_28_] = i_30_;
			aBooleanArray2974[i_28_] = bool;
			method2897(i, i_28_ - 1);
			method2897(i_28_ + 1, i_27_);
		}
	}

	Class290() {
		int i = Class330_Sub41.method3694(16);
		if (i != 1)
			throw new RuntimeException();
		int i_33_ = Class330_Sub41.method3694(5);
		int i_34_ = 0;
		((Class290) this).anIntArray2971 = new int[i_33_];
		for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
			int i_36_ = Class330_Sub41.method3694(4);
			((Class290) this).anIntArray2971[i_35_] = i_36_;
			if (i_36_ >= i_34_)
				i_34_ = i_36_ + 1;
		}
		((Class290) this).anIntArray2968 = new int[i_34_];
		((Class290) this).anIntArray2969 = new int[i_34_];
		((Class290) this).anIntArray2970 = new int[i_34_];
		((Class290) this).anIntArrayArray2973 = new int[i_34_][];
		for (int i_37_ = 0; i_37_ < i_34_; i_37_++) {
			((Class290) this).anIntArray2968[i_37_] = Class330_Sub41.method3694(3) + 1;
			int i_38_ = (((Class290) this).anIntArray2969[i_37_] = Class330_Sub41.method3694(2));
			if (i_38_ != 0)
				((Class290) this).anIntArray2970[i_37_] = Class330_Sub41.method3694(8);
			i_38_ = 1 << i_38_;
			int[] is = new int[i_38_];
			((Class290) this).anIntArrayArray2973[i_37_] = is;
			for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
				is[i_39_] = Class330_Sub41.method3694(8) - 1;
		}
		((Class290) this).anInt2966 = Class330_Sub41.method3694(2) + 1;
		int i_40_ = Class330_Sub41.method3694(4);
		int i_41_ = 2;
		for (int i_42_ = 0; i_42_ < i_33_; i_42_++)
			i_41_ += (((Class290) this).anIntArray2968[((Class290) this).anIntArray2971[i_42_]]);
		((Class290) this).anIntArray2964 = new int[i_41_];
		((Class290) this).anIntArray2964[0] = 0;
		((Class290) this).anIntArray2964[1] = 1 << i_40_;
		i_41_ = 2;
		for (int i_43_ = 0; i_43_ < i_33_; i_43_++) {
			int i_44_ = ((Class290) this).anIntArray2971[i_43_];
			for (int i_45_ = 0; i_45_ < ((Class290) this).anIntArray2968[i_44_]; i_45_++)
				((Class290) this).anIntArray2964[i_41_++] = Class330_Sub41.method3694(i_40_);
		}
		if (anIntArray2972 == null || anIntArray2972.length < i_41_) {
			anIntArray2972 = new int[i_41_];
			anIntArray2967 = new int[i_41_];
			aBooleanArray2974 = new boolean[i_41_];
		}
	}

	boolean method2898() {
		boolean bool = Class330_Sub41.method3698() != 0;
		if (!bool)
			return false;
		int i = ((Class290) this).anIntArray2964.length;
		for (int i_46_ = 0; i_46_ < i; i_46_++)
			anIntArray2972[i_46_] = ((Class290) this).anIntArray2964[i_46_];
		int i_47_ = anIntArray2965[((Class290) this).anInt2966 - 1];
		int i_48_ = Class64.method779(i_47_ - 1, -1690418838);
		anIntArray2967[0] = Class330_Sub41.method3694(i_48_);
		anIntArray2967[1] = Class330_Sub41.method3694(i_48_);
		int i_49_ = 2;
		for (int i_50_ = 0; i_50_ < ((Class290) this).anIntArray2971.length; i_50_++) {
			int i_51_ = ((Class290) this).anIntArray2971[i_50_];
			int i_52_ = ((Class290) this).anIntArray2968[i_51_];
			int i_53_ = ((Class290) this).anIntArray2969[i_51_];
			int i_54_ = (1 << i_53_) - 1;
			int i_55_ = 0;
			if (i_53_ > 0)
				i_55_ = Class330_Sub41.aClass289Array7783[((Class290) this).anIntArray2970[i_51_]].method2892();
			for (int i_56_ = 0; i_56_ < i_52_; i_56_++) {
				int i_57_ = (((Class290) this).anIntArrayArray2973[i_51_][i_55_ & i_54_]);
				i_55_ >>>= i_53_;
				anIntArray2967[i_49_++] = (i_57_ >= 0 ? Class330_Sub41.aClass289Array7783[i_57_].method2892() : 0);
			}
		}
		return true;
	}

	void method2899(int i, int i_58_, int i_59_, int i_60_, float[] fs, int i_61_) {
		int i_62_ = i_60_ - i_58_;
		int i_63_ = i_59_ - i;
		int i_64_ = i_62_ < 0 ? -i_62_ : i_62_;
		int i_65_ = i_62_ / i_63_;
		int i_66_ = i_58_;
		int i_67_ = 0;
		int i_68_ = i_62_ < 0 ? i_65_ - 1 : i_65_ + 1;
		i_64_ = i_64_ - (i_65_ < 0 ? -i_65_ : i_65_) * i_63_;
		fs[i] *= aFloatArray2963[i_66_];
		if (i_59_ > i_61_)
			i_59_ = i_61_;
		for (int i_69_ = i + 1; i_69_ < i_59_; i_69_++) {
			i_67_ += i_64_;
			if (i_67_ >= i_63_) {
				i_67_ -= i_63_;
				i_66_ += i_68_;
			} else
				i_66_ += i_65_;
			fs[i_69_] *= aFloatArray2963[i_66_];
		}
	}

	static int method2900(int[] is, int i) {
		int i_70_ = is[i];
		int i_71_ = -1;
		int i_72_ = -2147483648;
		for (int i_73_ = 0; i_73_ < i; i_73_++) {
			int i_74_ = is[i_73_];
			if (i_74_ < i_70_ && i_74_ > i_72_) {
				i_71_ = i_73_;
				i_72_ = i_74_;
			}
		}
		return i_71_;
	}

	static {
		aFloatArray2963 = (new float[] { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F });
	}

	static int method2901(int[] is, int i) {
		int i_75_ = is[i];
		int i_76_ = -1;
		int i_77_ = 2147483647;
		for (int i_78_ = 0; i_78_ < i; i_78_++) {
			int i_79_ = is[i_78_];
			if (i_79_ > i_75_ && i_79_ < i_77_) {
				i_76_ = i_78_;
				i_77_ = i_79_;
			}
		}
		return i_76_;
	}
}
