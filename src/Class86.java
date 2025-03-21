/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class86 {
	public static Class86 aClass86_714;
	static Class86 aClass86_715 = new Class86(7, 1);
	public static Class86 aClass86_716;
	public static Class86 aClass86_717;
	public static Class86 aClass86_718;
	public static Class86 aClass86_719;
	static Class86 aClass86_720;
	static Class86 aClass86_721 = new Class86(0, 2);
	public int anInt722;
	static Class86 aClass86_723 = new Class86(4, 4);
	public int anInt724;

	Class86(int i, int i_0_) {
		anInt722 = 916417509 * i;
		anInt724 = i_0_ * -1700895659;
	}

	static {
		aClass86_714 = new Class86(1, 1);
		aClass86_718 = new Class86(6, 2);
		aClass86_719 = new Class86(2, 3);
		aClass86_720 = new Class86(3, 4);
		aClass86_716 = new Class86(8, 2);
		aClass86_717 = new Class86(5, 4);
	}

	static final void method978(Class430 class430, int i) {
		try {
			((Class430) class430).aLongArray4372[(((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871])] = (((Class430) class430).aLongArray4379[((((Class430) class430).anInt4380 -= 2099007437) * -1969146619)]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dl.bc(").append(')').toString());
		}
	}

	static final void method979(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_1_, 600884783);
			Class120 class120 = Class3.aClass120Array56[i_1_ >> 16];
			Class195.method2138(iComponentDefinitions, class120, class430, 608192596);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dl.of(").append(')').toString());
		}
	}

	static void method980(int i, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_) {
		try {
			if (Class503.aBoolean5914 && Class130.aFrame1498 != null && (3 != i_2_ || i_3_ != client.anInt6635 * -504078911 || i_4_ != Class536.anInt6229 * 1368973679)) {
				Class417.method5268(Class203.aClass504_6790, Class130.aFrame1498, 2099655266);
				Class130.aFrame1498 = null;
			}
			if (Class503.aBoolean5914 && 3 == i_2_ && Class130.aFrame1498 == null) {
				Class130.aFrame1498 = Class105.method1309(Class203.aClass504_6790, i_3_, i_4_, 0, 0, -1971924557);
				if (Class130.aFrame1498 != null) {
					client.anInt6635 = -255544767 * i_3_;
					Class536.anInt6229 = i_4_ * 767008143;
					Class435.method5568(1320026430);
				}
			}
			if (i_2_ == 3 && (!Class503.aBoolean5914 || Class130.aFrame1498 == null))
				method980(i, Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(-126324947), -1, -1, true, -681123409);
			else {
				Container container = Class432_Sub1_Sub3_Sub1.method5526((byte) 77);
				if (Class130.aFrame1498 != null) {
					client.anInt6609 = i_3_ * 1458663577;
					Class520.anInt6017 = 1944065029 * i_4_;
				} else if (null != Class267.aFrame2740) {
					Insets insets = Class267.aFrame2740.getInsets();
					client.anInt6609 = (Class267.aFrame2740.getSize().width - (insets.left + insets.right)) * 1458663577;
					Class520.anInt6017 = (Class267.aFrame2740.getSize().height - (insets.top + insets.bottom)) * 1944065029;
				} else {
					client.anInt6609 = container.getSize().width * 1458663577;
					Class520.anInt6017 = container.getSize().height * 1944065029;
				}
				if (-1408375895 * client.anInt6609 <= 0)
					client.anInt6609 = 1458663577;
				if (394893517 * Class520.anInt6017 <= 0)
					Class520.anInt6017 = 1944065029;
				if (i_2_ != 1)
					Class451.method5633(399066082);
				else {
					Class300.anInt3058 = -126389055 * client.anInt9207;
					client.anInt6611 = (client.anInt6609 * -1408375895 - 64571523 * client.anInt9207) / 2 * -759672145;
					Class146.anInt1615 = client.anInt9118 * -537589265;
					client.anInt6612 = 0;
				}
				if (Class404.aClass457_4162 != Class457.aClass457_6834 && -1969079741 * Class300.anInt3058 < 1024 && -1548608507 * Class146.anInt1615 >= 768) {
					/* empty */
				}
				if (!bool) {
					Class475.aCanvas5700.setSize((-1969079741 * Class300.anInt3058), (Class146.anInt1615 * -1548608507));
					Class361.aClass_ra3793.method4806(Class475.aCanvas5700, (-1969079741 * Class300.anInt3058), (-1548608507 * Class146.anInt1615), (byte) -86);
					if (Class267.aFrame2740 == container) {
						Insets insets = Class267.aFrame2740.getInsets();
						Class475.aCanvas5700.setLocation(-1722268593 * client.anInt6611 + insets.left, insets.top + client.anInt6612 * 1819216065);
					} else
						Class475.aCanvas5700.setLocation((client.anInt6611 * -1722268593), (client.anInt6612 * 1819216065));
				} else
					Class83.method967(512638721);
				if (i_2_ >= 2)
					client.aBoolean9033 = true;
				else
					client.aBoolean9033 = false;
				Class158_Sub2.method1852(-891496377);
				if (-1 != 1522181389 * client.windowPaneId)
					Class476.method5960(true, (short) 7340);
				if (client.aClass1_9025.method380(90350409) != null && Class475_Sub5.method5958(-296919301 * client.anInt8995, 885477300))
					Class19.method462(-1806030557);
				for (int i_6_ = 0; i_6_ < 113; i_6_++)
					client.aBooleanArray9230[i_6_] = true;
				client.aBoolean6619 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dl.gx(").append(')').toString());
		}
	}

	static void method981(int i, int i_7_, int[] is, int[] is_8_, float[] fs, float[] fs_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			int i_17_ = i_10_ + i * i_11_;
			int i_18_ = i_12_ + i_7_ * i_13_;
			int i_19_ = i - i_14_;
			int i_20_ = i_7_ - i_14_;
			if (null == is) {
				for (int i_21_ = 0; i_21_ < i_15_; i_21_++) {
					int i_22_ = i_14_ + i_17_;
					while (i_17_ < i_22_)
						fs_9_[i_18_++] = fs[i_17_++];
					i_17_ += i_19_;
					i_18_ += i_20_;
				}
			} else if (fs == null) {
				for (int i_23_ = 0; i_23_ < i_15_; i_23_++) {
					int i_24_ = i_14_ + i_17_;
					while (i_17_ < i_24_)
						is_8_[i_18_++] = is[i_17_++];
					i_17_ += i_19_;
					i_18_ += i_20_;
				}
			} else {
				for (int i_25_ = 0; i_25_ < i_15_; i_25_++) {
					int i_26_ = i_17_ + i_14_;
					while (i_17_ < i_26_) {
						is_8_[i_18_] = is[i_17_];
						fs_9_[i_18_++] = fs[i_17_++];
					}
					i_17_ += i_19_;
					i_18_ += i_20_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dl.ai(").append(')').toString());
		}
	}

	static final void method982(Class430 class430, int i) {
		try {
			int i_27_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_27_, -599491848);
			Class120 class120 = Class3.aClass120Array56[i_27_ >> 16];
			Class281.method2789(iComponentDefinitions, class120, class430, 343282612);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dl.fn(").append(')').toString());
		}
	}
}
