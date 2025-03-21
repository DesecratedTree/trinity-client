/* Class330_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub20 extends Class330 {
	Class330_Sub41 aClass330_Sub41_7648;
	static Class471 aClass471_7649 = new Class471();
	static Class471 aClass471_7650 = new Class471();
	static Class497 aClass497_7651 = new Class497(16);
	int anInt7652;
	boolean aBoolean7653;
	int anInt7654;
	int anInt7655;
	int anInt7656;
	int anInt7657 = 0;
	int anInt7658;
	int anInt7659;
	static int anInt7660 = 512;
	NPC aClass432_Sub1_Sub1_Sub1_Sub2_7661;
	boolean aBoolean7662;
	static int anInt7663 = 0;
	static int anInt7664 = 1;
	static int anInt7665 = 2;
	static int anInt7666 = 3;
	Player aClass432_Sub1_Sub1_Sub1_Sub1_7667;
	int anInt7668;
	int anInt7669;
	int anInt7670;
	int anInt7671;
	boolean aBoolean7672;
	Class330_Sub41 aClass330_Sub41_7673;
	Class330_Sub29_Sub1_Sub1 aClass330_Sub29_Sub1_Sub1_7674;
	Class330_Sub40_Sub3 aClass330_Sub40_Sub3_7675;
	int anInt7676;
	int anInt7677;
	int[] anIntArray7678;
	int anInt7679;
	int anInt7680;
	Class330_Sub29_Sub1_Sub1 aClass330_Sub29_Sub1_Sub1_7681;
	Class473 aClass473_7682;
	Class330_Sub40_Sub3 aClass330_Sub40_Sub3_7683;

	void method3373(byte i) {
		try {
			int i_0_ = ((Class330_Sub20) this).anInt7655 * -1630056649;
			boolean bool = ((Class330_Sub20) this).aBoolean7672;
			if (((Class330_Sub20) this).aClass473_7682 != null) {
				Class473 class473 = (((Class330_Sub20) this).aClass473_7682.method5900((1909266069 * client.anInt8987 == 0 ? (Interface29) Class96.anInterface29_866 : Class158.aClass561_6474), (byte) 0));
				if (class473 != null) {
					((Class330_Sub20) this).anInt7655 = class473.anInt5650 * 726193647;
					((Class330_Sub20) this).aBoolean7672 = class473.aBoolean5615;
					((Class330_Sub20) this).anInt7658 = -1956893969 * (class473.anInt5675 * 1058070369 << 9);
					((Class330_Sub20) this).anInt7659 = -762806283 * class473.anInt5677;
					((Class330_Sub20) this).anInt7676 = 368168931 * class473.anInt5679;
					((Class330_Sub20) this).anInt7677 = 291238759 * class473.anInt5628;
					((Class330_Sub20) this).anIntArray7678 = class473.anIntArray5681;
					((Class330_Sub20) this).aBoolean7662 = class473.aBoolean5616;
					((Class330_Sub20) this).anInt7680 = class473.anInt5662 * 1228463319;
					((Class330_Sub20) this).anInt7669 = -662143729 * class473.anInt5689;
				} else {
					((Class330_Sub20) this).anInt7655 = -63805063;
					((Class330_Sub20) this).aBoolean7672 = false;
					((Class330_Sub20) this).anInt7658 = 0;
					((Class330_Sub20) this).anInt7659 = 0;
					((Class330_Sub20) this).anInt7676 = 0;
					((Class330_Sub20) this).anInt7677 = 0;
					((Class330_Sub20) this).anIntArray7678 = null;
					((Class330_Sub20) this).aBoolean7662 = false;
					((Class330_Sub20) this).anInt7680 = -1111052544;
					((Class330_Sub20) this).anInt7669 = -418646784;
					((Class330_Sub20) this).anInt7679 = 0;
				}
			} else if ((((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub2_7661) != null) {
				int i_1_ = (Class412.method5237((((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub2_7661), 233416610));
				if (i_1_ != i_0_) {
					((Class330_Sub20) this).anInt7655 = i_1_ * 63805063;
					Class551 class551 = (((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub2_7661.aClass551_10251);
					if (null != class551.anIntArray6326)
						class551 = class551.method6371(Class158.aClass561_6474, (byte) 37);
					if (class551 != null) {
						((Class330_Sub20) this).anInt7658 = -1956893969 * (class551.anInt6343 * 1028590487 << 9);
						((Class330_Sub20) this).anInt7679 = ((class551.anInt6290 * -1281122485 << 9) * 1403003527);
						((Class330_Sub20) this).anInt7659 = class551.anInt6320 * 833376945;
						((Class330_Sub20) this).aBoolean7672 = class551.aBoolean6346;
						((Class330_Sub20) this).anInt7680 = 1413623899 * class551.anInt6350;
						((Class330_Sub20) this).anInt7669 = 871140649 * class551.anInt6354;
					} else {
						((Class330_Sub20) this).anInt7679 = 0;
						((Class330_Sub20) this).anInt7658 = 0;
						((Class330_Sub20) this).anInt7659 = 0;
						((Class330_Sub20) this).aBoolean7672 = (((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub2_7661.aClass551_10251.aBoolean6346);
						((Class330_Sub20) this).anInt7680 = -1111052544;
						((Class330_Sub20) this).anInt7669 = -418646784;
					}
				}
			} else if ((((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub1_7667) != null) {
				((Class330_Sub20) this).anInt7655 = (Class162.method1918((((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub1_7667), (byte) -1)) * 63805063;
				((Class330_Sub20) this).aBoolean7672 = (((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub1_7667.isNPC);
				((Class330_Sub20) this).anInt7658 = -1956893969 * ((((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub1_7667.anInt10236) * 1762959971 << 9);
				((Class330_Sub20) this).anInt7679 = 0;
				((Class330_Sub20) this).anInt7659 = ((((Class330_Sub20) this).aClass432_Sub1_Sub1_Sub1_Sub1_7667.anInt10239) * 39694771);
				((Class330_Sub20) this).anInt7680 = -1111052544;
				((Class330_Sub20) this).anInt7669 = -418646784;
			}
			if ((-1630056649 * ((Class330_Sub20) this).anInt7655 != i_0_ || bool != ((Class330_Sub20) this).aBoolean7672) && ((Class330_Sub20) this).aClass330_Sub40_Sub3_7675 != null) {
				Class511.aClass330_Sub40_Sub4_5951.method3685(((Class330_Sub20) this).aClass330_Sub40_Sub3_7675);
				((Class330_Sub20) this).aClass330_Sub40_Sub3_7675 = null;
				((Class330_Sub20) this).aClass330_Sub29_Sub1_Sub1_7674 = null;
				((Class330_Sub20) this).aClass330_Sub41_7648 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ada.i(").append(')').toString());
		}
	}

	Class330_Sub20() {
		/* empty */
	}

	static final void method3374(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_3_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			Class537 class537 = Class301.aClass543_3059.method6339(i_2_, -1133420499);
			if (i_3_ != -735399997 * class537.anInt6235)
				iComponentDefinitions.method1399(i_2_, i_3_, 1774020516);
			else
				iComponentDefinitions.method1400(i_2_, -579104111);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ada.hm(").append(')').toString());
		}
	}
}
