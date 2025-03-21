/* Class_xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class_xa {
	public int anInt6393;
	public int[][] anIntArrayArray6394;
	public int anInt6395;
	public int anInt6396;
	public int anInt6397;

	public abstract void method6411(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, Class77 class77, boolean bool);

	public abstract void LA(int i, int i_11_, int i_12_);

	public abstract void method6412(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, boolean[][] bools);

	public abstract void method6413(int i, int i_19_, int[] is, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_, Class77 class77, boolean bool);

	public abstract void SA();

	public abstract void method6414(int i, int i_30_, int[] is, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_, Class77 class77, boolean bool);

	public abstract void method6415(int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, boolean[][] bools);

	public final int method6416(int i, int i_47_, int i_48_) {
		try {
			int i_49_ = i >> anInt6396 * -1066304221;
			int i_50_ = i_47_ >> -1066304221 * anInt6396;
			if (i_49_ < 0 || i_50_ < 0 || i_49_ > 1972554729 * anInt6397 - 1 || i_50_ > 24567321 * anInt6393 - 1)
				return 0;
			int i_51_ = i & anInt6395 * 550173571 - 1;
			int i_52_ = i_47_ & anInt6395 * 550173571 - 1;
			int i_53_ = ((anIntArrayArray6394[i_49_][i_50_] * (anInt6395 * 550173571 - i_51_) + anIntArrayArray6394[i_49_ + 1][i_50_] * i_51_) >> -1066304221 * anInt6396);
			int i_54_ = ((((anInt6395 * 550173571 - i_51_) * anIntArrayArray6394[i_49_][1 + i_50_]) + i_51_ * anIntArrayArray6394[i_49_ + 1][i_50_ + 1]) >> anInt6396 * -1066304221);
			return (i_54_ * i_52_ + i_53_ * (550173571 * anInt6395 - i_52_) >> anInt6396 * -1066304221);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.o(").append(')').toString());
		}
	}

	public final int method6417(int i, int i_55_, int i_56_) {
		try {
			return anIntArrayArray6394[i][i_55_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.s(").append(')').toString());
		}
	}

	public abstract Class_na w(int i, int i_57_, Class_na class_na);

	public abstract void ay(Class_na class_na, int i, int i_58_, int i_59_, int i_60_, boolean bool);

	public abstract void NA(Class_na class_na, int i, int i_61_, int i_62_, int i_63_, boolean bool);

	public abstract boolean method6418(Class_na class_na, int i, int i_64_, int i_65_, int i_66_, boolean bool);

	public abstract void al(Class_na class_na, int i, int i_67_, int i_68_, int i_69_, boolean bool);

	public abstract void n(int i, int i_70_, int i_71_);

	public abstract void l(int i, int i_72_, int i_73_);

	public abstract void b(int i, int i_74_, int i_75_);

	Class_xa(int i, int i_76_, int i_77_, int[][] is) {
		anInt6397 = -1250378663 * i;
		anInt6393 = i_76_ * -1805935063;
		int i_78_ = 0;
		for (/**/; i_77_ > 1; i_77_ >>= 1)
			i_78_++;
		anInt6395 = -1684509909 * (1 << i_78_);
		anInt6396 = -786523509 * i_78_;
		anIntArrayArray6394 = is;
	}

	public abstract void c();

	public abstract void method6419(int i, int i_79_, int[] is, int[] is_80_, int[] is_81_, int[] is_82_, int[] is_83_, int[] is_84_, int[] is_85_, int[] is_86_, Class77 class77, boolean bool);

	public abstract void d();

	public abstract void method6420(Class330_Sub14 class330_sub14, int[] is);

	public abstract void method6421(int i, int i_87_, int i_88_, boolean[][] bools, boolean bool, int i_89_);

	public abstract void method6422(int i, int i_90_, int[] is, int[] is_91_, int[] is_92_, int[] is_93_, int[] is_94_, int[] is_95_, int[] is_96_, int[] is_97_, Class77 class77, boolean bool);

	public abstract Class_na y(int i, int i_98_, Class_na class_na);

	public abstract Class_na h(int i, int i_99_, Class_na class_na);

	public abstract void method6423(int i, int i_100_, int i_101_, boolean[][] bools, boolean bool, int i_102_);

	public abstract boolean method6424(Class_na class_na, int i, int i_103_, int i_104_, int i_105_, boolean bool);

	public abstract void as(Class_na class_na, int i, int i_106_, int i_107_, int i_108_, boolean bool);

	public abstract void ac(Class_na class_na, int i, int i_109_, int i_110_, int i_111_, boolean bool);

	public abstract void method6425(int i, int i_112_, int[] is, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, Class77 class77, boolean bool);

	public abstract void method6426(Class330_Sub14 class330_sub14, int[] is);

	public abstract void method6427(Class330_Sub14 class330_sub14, int[] is);

	public abstract void method6428(int i, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, boolean[][] bools);

	public abstract void ai(Class_na class_na, int i, int i_126_, int i_127_, int i_128_, boolean bool);

	public abstract void UA(Class_na class_na, int i, int i_129_, int i_130_, int i_131_, boolean bool);

	public abstract void aj(Class_na class_na, int i, int i_132_, int i_133_, int i_134_, boolean bool);

	public abstract void method6429(Class330_Sub14 class330_sub14, int[] is);

	static final void method6430(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class1.method386(iComponentDefinitions, class120, class430, 1969204520);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.ek(").append(')').toString());
		}
	}

	static final void method6431(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_135_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_136_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			Class537 class537 = Class301.aClass543_3059.method6339(i_135_, -1788071695);
			if (i_136_ != class537.anInt6235 * -735399997)
				iComponentDefinitions.method1399(i_135_, i_136_, -1900517257);
			else
				iComponentDefinitions.method1400(i_135_, -2068597246);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.ga(").append(')').toString());
		}
	}

	static final void method6432(Class430 class430, int i) {
		try {
			int i_137_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (-1 != i_137_)
				Class95_Sub12_Sub1.method1140(i_137_, 1432202105);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.apa(").append(')').toString());
		}
	}

	static final void method6433(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class385.method4426(1148279720).method297((short) -2247);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.ajq(").append(')').toString());
		}
	}

	static final void method6434(Class430 class430, int i) {
		try {
			if (null == Class282_Sub1.aShortArray7443 || (Class432_Sub1_Sub4_Sub2.anInt10001 * -1165310271 >= -2048805097 * Class440.anInt4482))
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (Class282_Sub1.aShortArray7443[((Class432_Sub1_Sub4_Sub2.anInt10001 += -1070151359) * -1165310271) - 1]) & 0xffff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.abl(").append(')').toString());
		}
	}

	static final void method6435(Class430 class430, int i) {
		try {
			int i_138_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_138_, 231822046);
			Class120 class120 = Class3.aClass120Array56[i_138_ >> 16];
			Class318.method3161(iComponentDefinitions, class120, class430, 300502301);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xa.ge(").append(')').toString());
		}
	}
}
