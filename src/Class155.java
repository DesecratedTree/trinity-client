/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class155 {
	Class_ra_Sub2 aClass_ra_Sub2_1665;
	static Object anObject1666;
	Interface11_Impl2 anInterface11_Impl2_1667;
	public static int anInt1668 = 16;
	public boolean aBoolean1669;
	Interface11_Impl3[] anInterface11_Impl3Array1670 = null;
	static int anInt1671 = 128;
	public Interface11_Impl3[] anInterface11_Impl3Array1672;
	static int anInt1673 = 128;
	public Interface11_Impl2 anInterface11_Impl2_1674;
	public Interface11_Impl2 anInterface11_Impl2_1675;
	static Object anObject1676;
	static Object anObject1677;

	public boolean method1823() {
		if (!((Class155) this).aClass_ra_Sub2_1665.aBoolean8598)
			return false;
		if (anInterface11_Impl2_1674 == null) {
			if (anObject1677 == null) {
				byte[] is = Class319.method3169(128, 128, 16, 8, new Class335_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject1677 = Class433.method5557(is, false, (byte) 23);
			}
			byte[] is = Class400.method4707(anObject1677, false, -1038879541);
			byte[] is_0_ = new byte[is.length * 4];
			int i = 0;
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				int i_2_ = i_1_ * 16384;
				int i_3_ = i_2_;
				for (int i_4_ = 0; i_4_ < 128; i_4_++) {
					int i_5_ = i_3_ + i_4_ * 128;
					int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
					int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
					for (int i_8_ = 0; i_8_ < 128; i_8_++) {
						float f = (float) ((is[i_6_ + i_8_] & 0xff) - (is[i_7_ + i_8_] & 0xff));
						float f_9_ = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff) - (is[i_5_ + (i_8_ + 1 & 0x7f)] & 0xff));
						float f_10_ = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_ + 16384.0F + f * f)));
						is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
						is_0_[i++] = is[i_2_++];
					}
				}
			}
			anInterface11_Impl2_1674 = (((Class155) this).aClass_ra_Sub2_1665.method4952(Class72.aClass72_620, 128, 128, 16, true, is_0_));
		}
		return anInterface11_Impl2_1674 != null;
	}

	Class155(Class_ra_Sub2 class_ra_sub2) {
		((Class155) this).anInterface11_Impl2_1667 = null;
		anInterface11_Impl3Array1672 = null;
		anInterface11_Impl2_1675 = null;
		anInterface11_Impl2_1674 = null;
		((Class155) this).aClass_ra_Sub2_1665 = class_ra_sub2;
		aBoolean1669 = ((Class155) this).aClass_ra_Sub2_1665.aBoolean8598;
		if (aBoolean1669 && !((Class155) this).aClass_ra_Sub2_1665.method4996(Class72.aClass72_613, Class86.aClass86_714))
			aBoolean1669 = false;
		if (aBoolean1669 || ((Class155) this).aClass_ra_Sub2_1665.method5006(Class72.aClass72_613, Class86.aClass86_714)) {
			method1824();
			if (!aBoolean1669) {
				((Class155) this).anInterface11_Impl3Array1670 = new Interface11_Impl3[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class535.method6312(anObject1666, i * 32768, 32768, 1236473345);
					((Class155) this).anInterface11_Impl3Array1670[i] = (((Class155) this).aClass_ra_Sub2_1665.method4945(Class72.aClass72_613, 128, 128, true, is));
				}
				anInterface11_Impl3Array1672 = new Interface11_Impl3[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class535.method6312(anObject1676, i * 32768, 32768, 1250977057);
					anInterface11_Impl3Array1672[i] = (((Class155) this).aClass_ra_Sub2_1665.method4945(Class72.aClass72_613, 128, 128, true, is));
				}
			} else {
				byte[] is = Class400.method4707(anObject1666, false, 1194163879);
				((Class155) this).anInterface11_Impl2_1667 = (((Class155) this).aClass_ra_Sub2_1665.method4952(Class72.aClass72_613, 128, 128, 16, true, is));
				is = Class400.method4707(anObject1676, false, -1331925837);
				anInterface11_Impl2_1675 = (((Class155) this).aClass_ra_Sub2_1665.method4952(Class72.aClass72_613, 128, 128, 16, true, is));
			}
		}
	}

	static void method1824() {
		if (anObject1666 == null) {
			Class223_Sub2_Sub1 class223_sub2_sub1 = new Class223_Sub2_Sub1();
			byte[] is = class223_sub2_sub1.method2295(128, 128, 16);
			anObject1666 = Class433.method5557(is, false, (byte) -48);
		}
		if (anObject1676 == null) {
			Class223_Sub1_Sub1 class223_sub1_sub1 = new Class223_Sub1_Sub1();
			byte[] is = class223_sub1_sub1.method2290(128, 128, 16);
			anObject1676 = Class433.method5557(is, false, (byte) -49);
		}
	}

	public boolean method1825() {
		return (aBoolean1669 ? ((Class155) this).anInterface11_Impl2_1667 != null : ((Class155) this).anInterface11_Impl3Array1670 != null);
	}
}
