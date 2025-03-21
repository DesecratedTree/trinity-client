/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.Random;

public abstract class Class263 {
	static int anInt2721;
	static int anInt2722;
	public static int anInt2723 = 0;
	public static int anInt2724 = 0;
	static int anInt2725 = 528748187;
	static int anInt2726 = -1969092707;
	Class524 aClass524_2727;
	static int anInt2728 = 0;
	static int anInt2729;
	static int anInt2730 = 0;
	Class_ra aClass_ra2731;
	static int anInt2732;
	static String[] aStringArray2733;
	public static Class321 aClass321_2734;
	static int anInt2735;

	abstract void c(char c, int i, int i_0_, int i_1_, boolean bool);

	public void method2594(String string, int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (string != null) {
				method2600(i_3_, i_4_, (byte) 45);
				method2607(string, i, i_2_, null, null, null, 0, 0, -1160061587);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.r(").append(')').toString());
		}
	}

	public void method2595(String string, int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		try {
			if (string != null) {
				method2600(i_7_, i_8_, (byte) -33);
				method2607(string, i - ((Class263) this).aClass524_2727.method6240(string, -838393369) / 2, i_6_, null, null, null, 0, 0, 621866132);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.i(").append(')').toString());
		}
	}

	public int method2596(String string, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, Class61[] class61s, int[] is, Class_ta class_ta, int i_19_, int i_20_, byte i_21_) {
		try {
			if (null == string)
				return 0;
			method2600(i_13_, i_14_, (byte) 59);
			if (i_17_ == 0)
				i_17_ = ((Class263) this).aClass524_2727.anInt6030 * 35438517;
			int[] is_22_;
			if ((i_12_ < (((Class263) this).aClass524_2727.anInt6033 * -2093225349 + ((Class263) this).aClass524_2727.anInt6035 * 143160877 + i_17_)) && i_12_ < i_17_ + i_17_)
				is_22_ = null;
			else
				is_22_ = new int[] { i_11_ };
			int i_23_ = ((Class263) this).aClass524_2727.method6244(string, is_22_, aStringArray2733, class61s, 1021520411);
			if (i_18_ == -1) {
				i_18_ = i_12_ / i_17_;
				if (i_18_ <= 0)
					i_18_ = 1;
			}
			if (i_18_ > 0 && i_23_ >= i_18_) {
				aStringArray2733[i_18_ - 1] = (((Class263) this).aClass524_2727.method6249(aStringArray2733[i_18_ - 1], i_11_, class61s, 1408471710));
				i_23_ = i_18_;
			}
			if (3 == i_16_ && i_23_ == 1)
				i_16_ = 1;
			int i_24_;
			if (0 == i_16_)
				i_24_ = i_10_ + (-2093225349 * ((Class263) this).aClass524_2727.anInt6033);
			else if (i_16_ == 1)
				i_24_ = ((i_12_ - (-2093225349 * ((Class263) this).aClass524_2727.anInt6033) - (143160877 * ((Class263) this).aClass524_2727.anInt6035) - (i_23_ - 1) * i_17_) / 2 + (i_10_ + -2093225349 * (((Class263) this).aClass524_2727.anInt6033)));
			else if (i_16_ == 2)
				i_24_ = (i_10_ + i_12_ - 143160877 * ((Class263) this).aClass524_2727.anInt6035 - (i_23_ - 1) * i_17_);
			else {
				int i_25_ = (i_12_ - (((Class263) this).aClass524_2727.anInt6033 * -2093225349) - ((Class263) this).aClass524_2727.anInt6035 * 143160877 - i_17_ * (i_23_ - 1)) / (i_23_ + 1);
				if (i_25_ < 0)
					i_25_ = 0;
				i_24_ = i_25_ + ((((Class263) this).aClass524_2727.anInt6033 * -2093225349) + i_10_);
				i_17_ += i_25_;
			}
			for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
				if (0 == i_15_)
					method2607(aStringArray2733[i_26_], i, i_24_, class61s, is, class_ta, i_19_, i_20_, -552819683);
				else if (i_15_ == 1)
					method2607(aStringArray2733[i_26_], i + (i_11_ - (((Class263) this).aClass524_2727.method6240(aStringArray2733[i_26_], -838393369))) / 2, i_24_, class61s, is, class_ta, i_19_, i_20_, -1687849966);
				else if (i_15_ == 2)
					method2607(aStringArray2733[i_26_], (i_11_ + i - (((Class263) this).aClass524_2727.method6240(aStringArray2733[i_26_], -838393369))), i_24_, class61s, is, class_ta, i_19_, i_20_, -277672854);
				else if (i_23_ - 1 == i_26_)
					method2607(aStringArray2733[i_26_], i, i_24_, class61s, is, class_ta, i_19_, i_20_, -1987569454);
				else {
					method2605(aStringArray2733[i_26_], i_11_, -1774757576);
					method2607(aStringArray2733[i_26_], i, i_24_, class61s, is, class_ta, i_19_, i_20_, 816303199);
					anInt2721 = 0;
				}
				i_24_ += i_17_;
			}
			return i_23_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.o(").append(')').toString());
		}
	}

	public void method2597(String string, int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		try {
			if (string != null) {
				method2600(i_28_, i_29_, (byte) -53);
				int i_32_ = string.length();
				int[] is = new int[i_32_];
				int[] is_33_ = new int[i_32_];
				for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
					is[i_34_] = (int) (Math.sin((double) i_30_ / 5.0 + (double) i_34_ / 5.0) * 5.0);
					is_33_[i_34_] = (int) (Math.sin((double) i_30_ / 5.0 + (double) i_34_ / 3.0) * 5.0);
				}
				method2608(string, i - ((Class263) this).aClass524_2727.method6240(string, -838393369) / 2, i_27_, null, null, is, is_33_, (short) 255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.f(").append(')').toString());
		}
	}

	public void method2598(String string, int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, short i_40_) {
		try {
			if (string != null) {
				method2600(i_36_, i_37_, (byte) -126);
				double d = 7.0 - (double) i_39_ / 8.0;
				if (d < 0.0)
					d = 0.0;
				int i_41_ = string.length();
				int[] is = new int[i_41_];
				for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
					is[i_42_] = (int) (Math.sin((double) i_42_ / 1.5 + (double) i_38_ / 1.0) * d);
				method2608(string, i - ((Class263) this).aClass524_2727.method6240(string, -838393369) / 2, i_35_, null, null, null, is, (short) 255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.z(").append(')').toString());
		}
	}

	public void method2599(String string, int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_) {
		try {
			if (string != null) {
				method2600(i_44_, i_45_, (byte) 15);
				int i_48_ = string.length();
				int[] is = new int[i_48_];
				for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
					is[i_49_] = (int) (Math.sin((double) i_46_ / 5.0 + (double) i_49_ / 2.0) * 5.0);
				method2608(string, i - ((Class263) this).aClass524_2727.method6240(string, -838393369) / 2, i_43_, null, null, null, is, (short) 255);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.s(").append(')').toString());
		}
	}

	void method2600(int i, int i_50_, byte i_51_) {
		try {
			anInt2725 = 528748187;
			anInt2726 = -1969092707;
			anInt2730 = (anInt2728 = 705622317 * i) * 1282454465;
			anInt2721 = 0;
			anInt2732 = 0;
			if (i_50_ == -1)
				i_50_ = 0;
			anInt2722 = (anInt2729 = 2047542839 * i_50_) * -1490535089;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.b(").append(')').toString());
		}
	}

	void method2601(String string, int i) {
		try {
			try {
				if (string.startsWith("col="))
					anInt2730 = ((936868837 * anInt2730 & ~0xffffff | Class16.method449(string.substring(4), 16, 78957142) & 0xffffff) * 127289837);
				else if (string.equals("/col"))
					anInt2730 = 127289837 * (936868837 * anInt2730 & ~0xffffff | -179992923 * anInt2728 & 0xffffff);
				if (string.startsWith("argb="))
					anInt2730 = Class16.method449(string.substring(5), 16, -687237287) * 127289837;
				else if (string.equals("/argb"))
					anInt2730 = 1282454465 * anInt2728;
				else if (string.startsWith("str="))
					anInt2725 = (936868837 * anInt2730 & ~0xffffff | Class16.method449(string.substring(4), 16, -170052481)) * -528748187;
				else if (string.equals("str"))
					anInt2725 = ((936868837 * anInt2730 & ~0xffffff | 0x800000) * -528748187);
				else if (string.equals("/str"))
					anInt2725 = 528748187;
				else if (string.startsWith("u="))
					anInt2726 = (anInt2730 * 936868837 & ~0xffffff | Class16.method449(string.substring(2), 16, -86571507)) * 1969092707;
				else if (string.equals("u"))
					anInt2726 = 1969092707 * (anInt2730 * 936868837 & ~0xffffff);
				else if (string.equals("/u"))
					anInt2726 = -1969092707;
				else if (string.equalsIgnoreCase("shad=-1"))
					anInt2722 = 0;
				else if (string.startsWith("shad="))
					anInt2722 = (936868837 * anInt2730 & ~0xffffff | Class16.method449(string.substring(5), 16, -724394396)) * 595199481;
				else if (string.equals("shad"))
					anInt2722 = 595199481 * (936868837 * anInt2730 & ~0xffffff);
				else if (string.equals("/shad"))
					anInt2722 = -1490535089 * anInt2729;
				else if (string.equals("br"))
					method2600(anInt2728 * -179992923, 1988202375 * anInt2729, (byte) 16);
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.k(").append(')').toString());
		}
	}

	Class263(Class_ra class_ra, Class524 class524) {
		((Class263) this).aClass_ra2731 = class_ra;
		((Class263) this).aClass524_2727 = class524;
	}

	abstract void UA(char c, int i, int i_52_, int i_53_, boolean bool);

	abstract void method2602(char c, int i, int i_54_, int i_55_, boolean bool, Class_ta class_ta, int i_56_, int i_57_);

	static {
		anInt2729 = 0;
		anInt2722 = 0;
		anInt2721 = 0;
		anInt2732 = 0;
		aStringArray2733 = new String[100];
	}

	abstract void method2603(char c, int i, int i_58_, int i_59_, boolean bool, Class_ta class_ta, int i_60_, int i_61_);

	abstract void method2604(char c, int i, int i_62_, int i_63_, boolean bool, Class_ta class_ta, int i_64_, int i_65_);

	void method2605(String string, int i, int i_66_) {
		try {
			int i_67_ = 0;
			boolean bool = false;
			for (int i_68_ = 0; i_68_ < string.length(); i_68_++) {
				char c = string.charAt(i_68_);
				if (c == '<')
					bool = true;
				else if (c == '>')
					bool = false;
				else if (!bool && ' ' == c)
					i_67_++;
			}
			if (i_67_ > 0)
				anInt2721 = (i - ((Class263) this).aClass524_2727.method6240(string, -838393369) << 8) / i_67_ * -1169504219;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.q(").append(')').toString());
		}
	}

	public int method2606(String string, int i, int i_69_, int i_70_, int i_71_, Random random, int i_72_, Class61[] class61s, int[] is, int i_73_) {
		try {
			if (string == null)
				return 0;
			random.setSeed((long) i_72_);
			int i_74_ = 192 + (random.nextInt() & 0x1f);
			method2600(i_74_ << 24 | i_70_ & 0xffffff, i_74_ << 24 | i_71_ & 0xffffff, (byte) 37);
			int i_75_ = string.length();
			int[] is_76_ = new int[i_75_];
			int i_77_ = 0;
			for (int i_78_ = 0; i_78_ < i_75_; i_78_++) {
				is_76_[i_78_] = i_77_;
				if ((random.nextInt() & 0x3) == 0)
					i_77_++;
			}
			method2608(string, i, i_69_, class61s, is, is_76_, null, (short) 255);
			return i_77_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.w(").append(')').toString());
		}
	}

	void method2607(String string, int i, int i_79_, Class61[] class61s, int[] is, Class_ta class_ta, int i_80_, int i_81_, int i_82_) {
		try {
			i_79_ -= ((Class263) this).aClass524_2727.anInt6030 * 35438517;
			int i_83_ = -1;
			int i_84_ = -1;
			int i_85_ = string.length();
			for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
				char c = (char) (ItemEquipDefinitions.method6216(string.charAt(i_86_), -1206684179) & 0xff);
				if (c == 60)
					i_83_ = i_86_;
				else {
					if (62 == c && i_83_ != -1) {
						String string_87_ = string.substring(i_83_ + 1, i_86_);
						i_83_ = -1;
						if (string_87_.equals("lt"))
							c = '<';
						else if (string_87_.equals("gt"))
							c = '>';
						else if (string_87_.equals("nbsp"))
							c = '\u00a0';
						else if (string_87_.equals("shy"))
							c = '\u00ad';
						else if (string_87_.equals("times"))
							c = '\u00d7';
						else if (string_87_.equals("euro"))
							c = '\u20ac';
						else if (string_87_.equals("copy"))
							c = '\u00a9';
						else if (string_87_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_87_.startsWith("img=")) {
								try {
									int i_88_ = (Class204.method2185(string_87_.substring(4), (byte) -22));
									Class61 class61 = class61s[i_88_];
									int i_89_ = (null != is ? is[i_88_] : class61.method683());
									if (-16777216 == (936868837 * anInt2730 & ~0xffffff))
										class61.method688(i, (i_79_ + 35438517 * (((Class263) this).aClass524_2727.anInt6030) - i_89_), 1, -1, 1);
									else
										class61.method688(i, i_79_ + ((((Class263) this).aClass524_2727.anInt6030) * 35438517) - i_89_, 0, (anInt2730 * 936868837 & ~0xffffff | 0xffffff), 1);
									i += class61s[i_88_].method318();
									i_84_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							} else
								method2601(string_87_, 279865372);
							continue;
						}
					}
					if (-1 == i_83_) {
						if (-1 != i_84_)
							i += ((Class263) this).aClass524_2727.method6250(i_84_, c, (byte) -98);
						if (c != 32) {
							if (class_ta == null) {
								if ((-1879462839 * anInt2722 & ~0xffffff) != 0)
									UA(c, i + 1, i_79_ + 1, anInt2722 * -1879462839, true);
								UA(c, i, i_79_, anInt2730 * 936868837, false);
							} else {
								if ((anInt2722 * -1879462839 & ~0xffffff) != 0)
									method2602(c, i + 1, 1 + i_79_, anInt2722 * -1879462839, true, class_ta, i_80_, i_81_);
								method2602(c, i, i_79_, anInt2730 * 936868837, false, class_ta, i_80_, i_81_);
							}
						} else if (-211020883 * anInt2721 > 0) {
							anInt2732 += -1368696459 * anInt2721;
							i += anInt2732 * -287780263 >> 8;
							anInt2732 = -247900695 * (-287780263 * anInt2732 & 0xff);
						}
						int i_90_ = ((Class263) this).aClass524_2727.method6241(c, -1638364719);
						if (-1 != -1089873811 * anInt2725)
							((Class263) this).aClass_ra2731.method4792(i, (int) ((double) (35438517 * (((Class263) this).aClass524_2727.anInt6030)) * 0.7) + i_79_, i_90_, anInt2725 * -1089873811, (short) 255);
						if (anInt2726 * 789334347 != -1)
							((Class263) this).aClass_ra2731.method4792(i, 1 + (i_79_ + (((Class263) this).aClass524_2727.anInt6030) * 35438517), i_90_, 789334347 * anInt2726, (short) 255);
						i += i_90_;
						i_84_ = c;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.u(").append(')').toString());
		}
	}

	void method2608(String string, int i, int i_91_, Class61[] class61s, int[] is, int[] is_92_, int[] is_93_, short i_94_) {
		try {
			i_91_ -= ((Class263) this).aClass524_2727.anInt6030 * 35438517;
			int i_95_ = -1;
			int i_96_ = -1;
			int i_97_ = 0;
			int i_98_ = string.length();
			for (int i_99_ = 0; i_99_ < i_98_; i_99_++) {
				char c = (char) (ItemEquipDefinitions.method6216(string.charAt(i_99_), -610719025) & 0xff);
				if (60 == c)
					i_95_ = i_99_;
				else {
					if (62 == c && -1 != i_95_) {
						String string_100_ = string.substring(1 + i_95_, i_99_);
						i_95_ = -1;
						if (string_100_.equals("lt"))
							c = '<';
						else if (string_100_.equals("gt"))
							c = '>';
						else if (string_100_.equals("nbsp"))
							c = '\u00a0';
						else if (string_100_.equals("shy"))
							c = '\u00ad';
						else if (string_100_.equals("times"))
							c = '\u00d7';
						else if (string_100_.equals("euro"))
							c = '\u20ac';
						else if (string_100_.equals("copy"))
							c = '\u00a9';
						else if (string_100_.equals("reg"))
							c = '\u00ae';
						else {
							if (string_100_.startsWith("img=")) {
								try {
									int i_101_;
									if (null != is_92_)
										i_101_ = is_92_[i_97_];
									else
										i_101_ = 0;
									int i_102_;
									if (is_93_ != null)
										i_102_ = is_93_[i_97_];
									else
										i_102_ = 0;
									i_97_++;
									int i_103_ = (Class204.method2185(string_100_.substring(4), (byte) -91));
									Class61 class61 = class61s[i_103_];
									int i_104_ = (null != is ? is[i_103_] : class61.method683());
									class61.method688(i_101_ + i, ((((Class263) this).aClass524_2727.anInt6030) * 35438517 + i_91_ - i_104_ + i_102_), 1, -1, 1);
									i += class61s[i_103_].method318();
									i_96_ = -1;
								} catch (Exception exception) {
									/* empty */
								}
							} else
								method2601(string_100_, 884546550);
							continue;
						}
					}
					if (-1 == i_95_) {
						if (-1 != i_96_)
							i += ((Class263) this).aClass524_2727.method6250(i_96_, c, (byte) 76);
						int i_105_;
						if (null != is_92_)
							i_105_ = is_92_[i_97_];
						else
							i_105_ = 0;
						int i_106_;
						if (null != is_93_)
							i_106_ = is_93_[i_97_];
						else
							i_106_ = 0;
						i_97_++;
						if (32 != c) {
							if ((-1879462839 * anInt2722 & ~0xffffff) != 0)
								UA(c, i_105_ + (1 + i), i_91_ + 1 + i_106_, anInt2722 * -1879462839, true);
							UA(c, i + i_105_, i_91_ + i_106_, anInt2730 * 936868837, false);
						} else if (anInt2721 * -211020883 > 0) {
							anInt2732 += -1368696459 * anInt2721;
							i += anInt2732 * -287780263 >> 8;
							anInt2732 = (-287780263 * anInt2732 & 0xff) * -247900695;
						}
						int i_107_ = ((Class263) this).aClass524_2727.method6241(c, -1594412680);
						if (anInt2725 * -1089873811 != -1)
							((Class263) this).aClass_ra2731.method4792(i, i_91_ + (int) ((double) (35438517 * (((Class263) this).aClass524_2727.anInt6030)) * 0.7), i_107_, anInt2725 * -1089873811, (short) 255);
						if (-1 != 789334347 * anInt2726)
							((Class263) this).aClass_ra2731.method4792(i, i_91_ + 35438517 * (((Class263) this).aClass524_2727.anInt6030), i_107_, 789334347 * anInt2726, (short) 255);
						i += i_107_;
						i_96_ = c;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.g(").append(')').toString());
		}
	}

	abstract void method2609(char c, int i, int i_108_, int i_109_, boolean bool, Class_ta class_ta, int i_110_, int i_111_);

	abstract void method2610(char c, int i, int i_112_, int i_113_, boolean bool, Class_ta class_ta, int i_114_, int i_115_);

	public int method2611(String string, int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, Random random, int i_123_, int[] is, Class61[] class61s, int[] is_124_, int i_125_) {
		try {
			if (string == null)
				return 0;
			random.setSeed((long) i_123_);
			int i_126_ = 192 + (random.nextInt() & 0x1f);
			method2600(i_126_ << 24 | i_119_ & 0xffffff, -1 == i_120_ ? 0 : i_126_ << 24 | i_120_ & 0xffffff, (byte) -47);
			int i_127_ = string.length();
			int[] is_128_ = new int[i_127_];
			int i_129_ = 0;
			for (int i_130_ = 0; i_130_ < i_127_; i_130_++) {
				is_128_[i_130_] = i_129_;
				if ((random.nextInt() & 0x3) == 0)
					i_129_++;
			}
			int i_131_ = i;
			int i_132_ = (i_116_ + ((Class263) this).aClass524_2727.anInt6033 * -2093225349);
			int i_133_ = -1;
			if (i_122_ == 1)
				i_132_ += (i_118_ - (-2093225349 * ((Class263) this).aClass524_2727.anInt6033) - (((Class263) this).aClass524_2727.anInt6035 * 143160877)) / 2;
			else if (i_122_ == 2)
				i_132_ = i_116_ + i_118_ - (((Class263) this).aClass524_2727.anInt6035) * 143160877;
			if (i_121_ == 1) {
				i_133_ = ((Class263) this).aClass524_2727.method6240(string, -838393369) + i_129_;
				i_131_ += (i_117_ - i_133_) / 2;
			} else if (2 == i_121_) {
				i_133_ = ((Class263) this).aClass524_2727.method6240(string, -838393369) + i_129_;
				i_131_ += i_117_ - i_133_;
			}
			method2608(string, i_131_, i_132_, class61s, is_124_, is_128_, null, (short) 255);
			if (is != null) {
				if (-1 == i_133_)
					i_133_ = ((Class263) this).aClass524_2727.method6240(string, -838393369) + i_129_;
				is[0] = i_131_;
				is[1] = i_132_ - (((Class263) this).aClass524_2727.anInt6033 * -2093225349);
				is[2] = i_133_;
				is[3] = (((Class263) this).aClass524_2727.anInt6033 * -2093225349 + (143160877 * ((Class263) this).aClass524_2727.anInt6035));
			}
			return i_129_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.l(").append(')').toString());
		}
	}

	public void method2612(String string, int i, int i_134_, int i_135_, int i_136_, short i_137_) {
		try {
			if (null != string) {
				method2600(i_135_, i_136_, (byte) -41);
				method2607(string, i - ((Class263) this).aClass524_2727.method6240(string, -838393369), i_134_, null, null, null, 0, 0, 613754622);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.j(").append(')').toString());
		}
	}

	public int method2613(String string, int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, Class61[] class61s, int[] is, Class_ta class_ta, int i_146_, int i_147_, byte i_148_) {
		try {
			return method2596(string, i, i_138_, i_139_, i_140_, i_141_, i_142_, i_143_, i_144_, i_145_, 0, class61s, is, class_ta, i_146_, i_147_, (byte) 57);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.p(").append(')').toString());
		}
	}

	public static boolean method2614(char c, int i) {
		try {
			return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.u(").append(')').toString());
		}
	}

	public static void method2615(Interface33 interface33, int i) {
		try {
			if (null != Class544.anInterface33_6256)
				throw new IllegalStateException("");
			Class544.anInterface33_6256 = interface33;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.r(").append(')').toString());
		}
	}

	static final void method2616(Class430 class430, int i) {
		try {
			int i_149_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_149_ > 255 || i_149_ < 0)
				i_149_ = 0;
			if (i_149_ != Class448.aClass330_Sub50_5555.aClass464_Sub15_7902.method5792(981226512)) {
				Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub15_7902, i_149_, 29066049);
				Class435.method5568(1135605581);
				client.aBoolean9194 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.ali(").append(')').toString());
		}
	}

	static final void method2617(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_150_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_151_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_152_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			int i_153_ = (((Class430) class430).anIntArray4387[3 + 1632830751 * ((Class430) class430).anInt4376]);
			Class381 class381 = client.aClass304_9030.method3022(-507443443);
			Class437.method5587(((i_150_ >> 14 & 0x3fff) - -1261027839 * class381.gameSceneBaseX), ((i_150_ & 0x3fff) - class381.gameSceneBaseY * -1542584207), i_151_ << 2, i_152_, i_153_, false, (byte) 14);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.agd(").append(')').toString());
		}
	}

	static final void method2618(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (string != null)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = string.length();
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.aar(").append(')').toString());
		}
	}

	public static void method2619(Class_ra class_ra, long l) {
		try {
			Class391.anInt4059 = 819017699 * Class391.anInt4058;
			Class391.anInt4058 = 0;
			Class312.method3111((byte) 102);
			Iterator iterator = Class391.aList4056.iterator();
			while (iterator.hasNext()) {
				Class388 class388 = (Class388) iterator.next();
				boolean bool = class388.method4561(class_ra, l);
				if (!bool) {
					iterator.remove();
					Class50.aClass388Array482[Class391.anInt4057 * -1415763739] = class388;
					Class391.anInt4057 = ((-1415763739 * Class391.anInt4057 + 1 & (Class91.anIntArray821[1896992813 * Class391.anInt4053])) * -1034005267);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("l.j(").append(')').toString());
		}
	}
}
