/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class186 {
	Interface9_Impl2 anInterface9_Impl2_1823;
	Class184 aClass184_1824;
	Interface9_Impl1 anInterface9_Impl1_1825;
	int[] anIntArray1826;
	int anInt1827 = 64;
	int anInt1828 = 768;
	int anInt1829 = 1600;
	int anInt1830 = Class64.method779(1600, -1470758270);
	static float aFloat1831;
	int anInt1832 = 64;
	int[] anIntArray1833;
	int[] anIntArray1834;
	Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray1835;
	Class325_Sub3_Sub1[][] aClass325_Sub3_Sub1ArrayArray1836;
	int anInt1837;
	Interface9_Impl1 anInterface9_Impl1_1838;

	void method2077(Class_ra_Sub2 class_ra_sub2) {
		((Class186) this).anInterface9_Impl1_1825.method142(786336, 24);
	}

	void method2078(int i, Class325_Sub3_Sub1 class325_sub3_sub1) {
		if (i < 1600) {
			if (((Class186) this).anIntArray1833[i] < 64)
				((Class186) this).aClass325_Sub3_Sub1ArrayArray1835[i][((Class186) this).anIntArray1833[i]++] = class325_sub3_sub1;
			else {
				if (((Class186) this).anIntArray1833[i] == 64) {
					if (((Class186) this).anInt1837 == 64)
						return;
					((Class186) this).anIntArray1833[i] += 1 + ((Class186) this).anInt1837++;
				}
				((Class186) this).aClass325_Sub3_Sub1ArrayArray1836[((Class186) this).anIntArray1833[i] - 64 - 1][((Class186) this).anIntArray1834[((Class186) this).anIntArray1833[i] - 64 - 1]++] = class325_sub3_sub1;
			}
		}
	}

	Class186(Class_ra_Sub2 class_ra_sub2) {
		((Class186) this).anIntArray1826 = new int[8191];
		((Class186) this).anIntArray1833 = new int[1600];
		((Class186) this).anIntArray1834 = new int[64];
		((Class186) this).aClass325_Sub3_Sub1ArrayArray1835 = new Class325_Sub3_Sub1[1600][64];
		((Class186) this).aClass325_Sub3_Sub1ArrayArray1836 = new Class325_Sub3_Sub1[64][768];
		((Class186) this).anInt1837 = 0;
		((Class186) this).aClass184_1824 = (class_ra_sub2.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1862, Class191.aClass191_1864 }), new Class193(Class191.aClass191_1872) }));
		((Class186) this).anInterface9_Impl1_1825 = class_ra_sub2.method4976(true);
		((Class186) this).anInterface9_Impl1_1838 = class_ra_sub2.method4976(false);
		((Class186) this).anInterface9_Impl1_1838.method142(393168, 12);
		((Class186) this).anInterface9_Impl2_1823 = class_ra_sub2.method4975(false);
		((Class186) this).anInterface9_Impl2_1823.method148(49146);
		ByteBuffer bytebuffer = class_ra_sub2.aByteBuffer8458;
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			int i_0_ = i * 4;
			bytebuffer.putShort((short) i_0_);
			bytebuffer.putShort((short) (i_0_ + 1));
			bytebuffer.putShort((short) (i_0_ + 2));
			bytebuffer.putShort((short) (i_0_ + 2));
			bytebuffer.putShort((short) (i_0_ + 3));
			bytebuffer.putShort((short) i_0_);
		}
		((Class186) this).anInterface9_Impl2_1823.method97(0, bytebuffer.position(), class_ra_sub2.aLong8459);
		bytebuffer.clear();
		for (int i = 0; i < 8191; i++) {
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(-1.0F);
			bytebuffer.putFloat(0.0F);
		}
		((Class186) this).anInterface9_Impl1_1838.method97(0, bytebuffer.position(), class_ra_sub2.aLong8459);
	}

	void method2079(Class_ra_Sub2 class_ra_sub2, Class81 class81) {
		class_ra_sub2.RA(false);
		aFloat1831 = class_ra_sub2.aFloat8533;
		float f = class_ra_sub2.aClass249_8472.aFloatArray2631[2];
		float f_1_ = class_ra_sub2.aClass249_8472.aFloatArray2631[6];
		float f_2_ = class_ra_sub2.aClass249_8472.aFloatArray2631[10];
		float f_3_ = class_ra_sub2.aClass249_8472.aFloatArray2631[14];
		int i = 0;
		int i_4_ = 2147483647;
		int i_5_ = 0;
		Class325_Sub3 class325_sub3 = class81.aClass461_675.aClass325_Sub3_5569;
		for (Class325_Sub3 class325_sub3_6_ = class325_sub3.aClass325_Sub3_7483; class325_sub3_6_ != class325_sub3; class325_sub3_6_ = class325_sub3_6_.aClass325_Sub3_7483) {
			Class325_Sub3_Sub1 class325_sub3_sub1 = (Class325_Sub3_Sub1) class325_sub3_6_;
			int i_7_ = (int) (f * (float) (class325_sub3_sub1.anInt9497 >> 12) + f_1_ * (float) (class325_sub3_sub1.anInt9493 >> 12) + f_2_ * (float) (class325_sub3_sub1.anInt9489 >> 12) + f_3_);
			if (i_7_ > i_5_)
				i_5_ = i_7_;
			if (i_7_ < i_4_)
				i_4_ = i_7_;
			((Class186) this).anIntArray1826[i++] = i_7_;
		}
		int i_8_ = i_5_ - i_4_;
		int i_9_;
		if (i_8_ + 2 > 1600) {
			i_9_ = (1 + Class64.method779(i_8_, -1239245241) - ((Class186) this).anInt1830);
			i_8_ = (i_8_ >> i_9_) + 2;
		} else {
			i_9_ = 0;
			i_8_ += 2;
		}
		class_ra_sub2.method4979(((Class186) this).anInterface9_Impl2_1823);
		Class126 class126 = ((Class_ra_Sub2) class_ra_sub2).aClass126_8562;
		class126.method1532(Class249.aClass249_2630);
		class126.aClass249_1460.method2516();
		class126.anInt1462 = -1;
		method2082(class_ra_sub2, class325_sub3, i_8_, i_4_, i_9_, class126);
		if (class_ra_sub2.aFloat8533 != aFloat1831)
			class_ra_sub2.IA(aFloat1831);
		class_ra_sub2.RA(true);
	}

	void method2080() {
		((Class186) this).anInterface9_Impl1_1825.method53();
	}

	void method2081(Class_ra_Sub2 class_ra_sub2, int i) {
		int i_10_ = 0;
		Class249 class249 = class_ra_sub2.aClass249_8472;
		float f = class249.aFloatArray2631[0];
		float f_11_ = class249.aFloatArray2631[4];
		float f_12_ = class249.aFloatArray2631[8];
		float f_13_ = class249.aFloatArray2631[1];
		float f_14_ = class249.aFloatArray2631[5];
		float f_15_ = class249.aFloatArray2631[9];
		float f_16_ = f + f_13_;
		float f_17_ = f_11_ + f_14_;
		float f_18_ = f_12_ + f_15_;
		float f_19_ = f - f_13_;
		float f_20_ = f_11_ - f_14_;
		float f_21_ = f_12_ - f_15_;
		float f_22_ = f_13_ - f;
		float f_23_ = f_14_ - f_11_;
		float f_24_ = f_15_ - f_12_;
		ByteBuffer bytebuffer = class_ra_sub2.aByteBuffer8458;
		bytebuffer.clear();
		for (int i_25_ = i - 1; i_25_ >= 0; i_25_--) {
			int i_26_ = (((Class186) this).anIntArray1833[i_25_] > 64 ? 64 : ((Class186) this).anIntArray1833[i_25_]);
			if (i_26_ > 0) {
				for (int i_27_ = i_26_ - 1; i_27_ >= 0; i_27_--) {
					Class325_Sub3_Sub1 class325_sub3_sub1 = (((Class186) this).aClass325_Sub3_Sub1ArrayArray1835[i_25_][i_27_]);
					int i_28_ = class325_sub3_sub1.anInt9490;
					byte i_29_ = (byte) (i_28_ >> 16);
					byte i_30_ = (byte) (i_28_ >> 8);
					byte i_31_ = (byte) i_28_;
					byte i_32_ = (byte) (i_28_ >>> 24);
					if (((Class_ra_Sub2) class_ra_sub2).anInt8591 == 0) {
						byte i_33_ = i_29_;
						i_29_ = i_31_;
						i_31_ = i_33_;
					}
					float f_34_ = (float) (class325_sub3_sub1.anInt9497 >> 12);
					float f_35_ = (float) (class325_sub3_sub1.anInt9493 >> 12);
					float f_36_ = (float) (class325_sub3_sub1.anInt9489 >> 12);
					int i_37_ = class325_sub3_sub1.anInt9494 >> 12;
					bytebuffer.putFloat(f_34_ + f_16_ * (float) -i_37_);
					bytebuffer.putFloat(f_35_ + f_17_ * (float) -i_37_);
					bytebuffer.putFloat(f_36_ + f_18_ * (float) -i_37_);
					bytebuffer.put(i_29_);
					bytebuffer.put(i_30_);
					bytebuffer.put(i_31_);
					bytebuffer.put(i_32_);
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(f_34_ + f_22_ * (float) i_37_);
					bytebuffer.putFloat(f_35_ + f_23_ * (float) i_37_);
					bytebuffer.putFloat(f_36_ + f_24_ * (float) i_37_);
					bytebuffer.put(i_29_);
					bytebuffer.put(i_30_);
					bytebuffer.put(i_31_);
					bytebuffer.put(i_32_);
					bytebuffer.putFloat(0.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_34_ + f_16_ * (float) i_37_);
					bytebuffer.putFloat(f_35_ + f_17_ * (float) i_37_);
					bytebuffer.putFloat(f_36_ + f_18_ * (float) i_37_);
					bytebuffer.put(i_29_);
					bytebuffer.put(i_30_);
					bytebuffer.put(i_31_);
					bytebuffer.put(i_32_);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(f_34_ + f_19_ * (float) i_37_);
					bytebuffer.putFloat(f_35_ + f_20_ * (float) i_37_);
					bytebuffer.putFloat(f_36_ + f_21_ * (float) i_37_);
					bytebuffer.put(i_29_);
					bytebuffer.put(i_30_);
					bytebuffer.put(i_31_);
					bytebuffer.put(i_32_);
					bytebuffer.putFloat(1.0F);
					bytebuffer.putFloat(0.0F);
					i_10_++;
				}
				if (((Class186) this).anIntArray1833[i_25_] > 64) {
					int i_38_ = ((Class186) this).anIntArray1833[i_25_] - 64 - 1;
					for (int i_39_ = ((Class186) this).anIntArray1834[i_38_] - 1; i_39_ >= 0; i_39_--) {
						Class325_Sub3_Sub1 class325_sub3_sub1 = (((Class186) this).aClass325_Sub3_Sub1ArrayArray1836[i_38_][i_39_]);
						int i_40_ = class325_sub3_sub1.anInt9490;
						byte i_41_ = (byte) (i_40_ >> 16);
						byte i_42_ = (byte) (i_40_ >> 8);
						byte i_43_ = (byte) i_40_;
						byte i_44_ = (byte) (i_40_ >>> 24);
						if (((Class_ra_Sub2) class_ra_sub2).anInt8591 == 0) {
							byte i_45_ = i_41_;
							i_41_ = i_43_;
							i_43_ = i_45_;
						}
						float f_46_ = (float) (class325_sub3_sub1.anInt9497 >> 12);
						float f_47_ = (float) (class325_sub3_sub1.anInt9493 >> 12);
						float f_48_ = (float) (class325_sub3_sub1.anInt9489 >> 12);
						int i_49_ = class325_sub3_sub1.anInt9494 >> 12;
						bytebuffer.putFloat(f_46_ + f_16_ * (float) -i_49_);
						bytebuffer.putFloat(f_47_ + f_17_ * (float) -i_49_);
						bytebuffer.putFloat(f_48_ + f_18_ * (float) -i_49_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.put(i_44_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(f_46_ + f_22_ * (float) i_49_);
						bytebuffer.putFloat(f_47_ + f_23_ * (float) i_49_);
						bytebuffer.putFloat(f_48_ + f_24_ * (float) i_49_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.put(i_44_);
						bytebuffer.putFloat(0.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_46_ + f_16_ * (float) i_49_);
						bytebuffer.putFloat(f_47_ + f_17_ * (float) i_49_);
						bytebuffer.putFloat(f_48_ + f_18_ * (float) i_49_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.put(i_44_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(f_46_ + f_19_ * (float) i_49_);
						bytebuffer.putFloat(f_47_ + f_20_ * (float) i_49_);
						bytebuffer.putFloat(f_48_ + f_21_ * (float) i_49_);
						bytebuffer.put(i_41_);
						bytebuffer.put(i_42_);
						bytebuffer.put(i_43_);
						bytebuffer.put(i_44_);
						bytebuffer.putFloat(1.0F);
						bytebuffer.putFloat(0.0F);
						i_10_++;
					}
				}
			}
		}
		((Class186) this).anInterface9_Impl1_1825.method97(0, bytebuffer.position(), class_ra_sub2.aLong8459);
		class_ra_sub2.method5081(0, ((Class186) this).anInterface9_Impl1_1825);
		class_ra_sub2.method5081(1, ((Class186) this).anInterface9_Impl1_1838);
		class_ra_sub2.method4978(((Class186) this).aClass184_1824);
		Class126 class126 = ((Class_ra_Sub2) class_ra_sub2).aClass126_8562;
		class126.method1534(i_10_);
	}

	void method2082(Class_ra_Sub2 class_ra_sub2, Class325_Sub3 class325_sub3, int i, int i_50_, int i_51_, Class126 class126) {
		Class325_Sub3 class325_sub3_52_ = class325_sub3.aClass325_Sub3_7483;
		int i_53_ = 0;
		int i_54_ = -2;
		boolean bool = true;
		boolean bool_55_ = true;
		while (class325_sub3_52_ != class325_sub3) {
			((Class186) this).anInt1837 = 0;
			for (int i_56_ = 0; i_56_ < i; i_56_++)
				((Class186) this).anIntArray1833[i_56_] = 0;
			for (int i_57_ = 0; i_57_ < 64; i_57_++)
				((Class186) this).anIntArray1834[i_57_] = 0;
			for (/**/; class325_sub3_52_ != class325_sub3; class325_sub3_52_ = class325_sub3_52_.aClass325_Sub3_7483) {
				Class325_Sub3_Sub1 class325_sub3_sub1 = (Class325_Sub3_Sub1) class325_sub3_52_;
				if (bool_55_) {
					i_54_ = class325_sub3_sub1.anInt9492;
					bool = class325_sub3_sub1.aBoolean9496;
					bool_55_ = false;
				}
				if (i_53_ > 0 && (i_54_ != class325_sub3_sub1.anInt9492 || bool != class325_sub3_sub1.aBoolean9496)) {
					bool_55_ = true;
					break;
				}
				method2078((((Class186) this).anIntArray1826[i_53_++] - i_50_ >> i_51_), class325_sub3_sub1);
			}
			class126.anInterface11_Impl3_1461 = i_54_ >= 0 ? ((Class_ra_Sub2) class_ra_sub2).aClass188_8552.method2093(i_54_) : null;
			if (bool && class_ra_sub2.aFloat8533 != aFloat1831)
				class_ra_sub2.IA(aFloat1831);
			else if (class_ra_sub2.aFloat8533 != 1.0F)
				class_ra_sub2.IA(1.0F);
			method2081(class_ra_sub2, i);
		}
	}
}
