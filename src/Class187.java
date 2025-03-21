/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class187 {
	Class161 aClass161_1839 = Class161.aClass161_1687;
	Interface9_Impl1 anInterface9_Impl1_1840;
	Class161 aClass161_1841;
	int anInt1842 = 128;
	Class184 aClass184_1843;
	float[] aFloatArray1844;
	Interface11_Impl3[] anInterface11_Impl3Array1845;
	Class_ra_Sub2 aClass_ra_Sub2_1846;
	int anInt1847;
	int anInt1848 = 0;
	Interface9_Impl2 anInterface9_Impl2_1849;
	int[] anIntArray1850;
	int[] anIntArray1851;

	void method2083() {
		if (((Class187) this).anInt1848 == ((Class187) this).anInt1842) {
			((Class187) this).anInt1842 *= 2;
			float[] fs = new float[((Class187) this).anInt1842 * 16];
			for (int i = 0; i < ((Class187) this).anInt1848 * 16; i++)
				fs[i] = ((Class187) this).aFloatArray1844[i];
			((Class187) this).aFloatArray1844 = fs;
			Interface11_Impl3[] interface11_impl3s = new Interface11_Impl3[((Class187) this).anInt1842];
			int[] is = new int[((Class187) this).anInt1842];
			for (int i = 0; i < ((Class187) this).anInt1848; i++) {
				interface11_impl3s[i] = ((Class187) this).anInterface11_Impl3Array1845[i];
				is[i] = ((Class187) this).anIntArray1850[i];
			}
			((Class187) this).anInterface11_Impl3Array1845 = interface11_impl3s;
			((Class187) this).anIntArray1850 = is;
		}
	}

	void method2084() {
		((Class187) this).anInterface9_Impl1_1840.method53();
		((Class187) this).anInterface9_Impl2_1849.method53();
		((Class187) this).anInterface9_Impl1_1840 = null;
		((Class187) this).anInterface9_Impl2_1849 = null;
		((Class187) this).aClass184_1843 = null;
		((Class187) this).anInt1848 = 0;
	}

	void method2085() {
		if (((Class187) this).anInt1848 != 0) {
			((Class187) this).aClass_ra_Sub2_1846.method4943();
			((Class187) this).aClass_ra_Sub2_1846.method4970(1);
			((Class187) this).aClass_ra_Sub2_1846.method4979(((Class187) this).anInterface9_Impl2_1849);
			((Class187) this).aClass_ra_Sub2_1846.method5081(0, ((Class187) this).anInterface9_Impl1_1840);
			((Class187) this).aClass_ra_Sub2_1846.method4978(((Class187) this).aClass184_1843);
			Class150 class150 = (((Class_ra_Sub2) ((Class187) this).aClass_ra_Sub2_1846).aClass150_8561);
			Unsafe unsafe = ((Class187) this).aClass_ra_Sub2_1846.anUnsafe8461;
			ByteBuffer bytebuffer = ((Class187) this).aClass_ra_Sub2_1846.aByteBuffer8458;
			bytebuffer.clear();
			int i = ((((Class187) this).anInt1848 + ((Class187) this).anInt1847 - 1) / ((Class187) this).anInt1847);
			int i_0_ = 0;
			int i_1_ = 0;
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				int i_3_ = Math.min(((Class187) this).anInt1847, ((Class187) this).anInt1848 - i_0_);
				long l = ((Class187) this).anInterface9_Impl1_1840.method94(0, i_3_ * 96);
				int i_4_ = i_2_ * ((Class187) this).anInt1847 + i_3_;
				for (int i_5_ = i_0_; i_5_ < i_4_; i_5_++) {
					for (int i_6_ = 0; i_6_ < 4; i_6_++) {
						unsafe.putFloat(l, (((Class187) this).aFloatArray1844[i_1_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class187) this).aFloatArray1844[i_1_++]));
						l += 4L;
						unsafe.putFloat(l, 0.0F);
						l += 4L;
						unsafe.putFloat(l, (((Class187) this).aFloatArray1844[i_1_++]));
						l += 4L;
						unsafe.putFloat(l, (((Class187) this).aFloatArray1844[i_1_++]));
						l += 4L;
						unsafe.putInt(l, ((Class187) this).anIntArray1850[i_5_]);
						l += 4L;
					}
				}
				((Class187) this).anInterface9_Impl1_1840.method95();
				Interface11_Impl3 interface11_impl3 = ((Class187) this).anInterface11_Impl3Array1845[i_0_];
				int i_7_ = 1;
				int i_8_ = 0;
				for (int i_9_ = i_0_ + 1; i_9_ < i_4_; i_9_++) {
					if (interface11_impl3 == (((Class187) this).anInterface11_Impl3Array1845[i_9_]))
						i_7_++;
					else {
						class150.anInterface11_Impl3_1624 = interface11_impl3;
						class150.method1768();
						((Class187) this).aClass_ra_Sub2_1846.method4985(((Class187) this).anInterface9_Impl2_1849, Class199.aClass199_1926, i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
						interface11_impl3 = (((Class187) this).anInterface11_Impl3Array1845[i_9_]);
						i_7_ = 1;
						i_8_ = i_9_ - i_0_;
					}
				}
				class150.anInterface11_Impl3_1624 = interface11_impl3;
				class150.method1768();
				((Class187) this).aClass_ra_Sub2_1846.method4985(((Class187) this).anInterface9_Impl2_1849, Class199.aClass199_1926, i_8_ * 4, i_7_ * 4, i_8_ * 6, i_7_ * 2);
				i_0_ += ((Class187) this).anInt1847;
			}
			((Class187) this).anInt1848 = 0;
		}
	}

	void method2086(float f, float f_10_, float f_11_, float f_12_, float f_13_, float f_14_, float f_15_, float f_16_, Interface11_Impl3 interface11_impl3, int i) {
		if ((i & ~0xffffff) != 0) {
			((Class187) this).aClass_ra_Sub2_1846.qa(((Class187) this).anIntArray1851);
			int i_17_ = ((Class187) this).anIntArray1851[0];
			int i_18_ = ((Class187) this).anIntArray1851[1];
			int i_19_ = ((Class187) this).anIntArray1851[2];
			int i_20_ = ((Class187) this).anIntArray1851[3];
			if (!(f > (float) i_19_) && !(f_10_ > (float) i_20_) && !(f_11_ < (float) i_17_) && !(f_12_ < (float) i_18_)) {
				float f_21_ = f_11_ - f;
				float f_22_ = f_12_ - f_10_;
				float f_23_ = f_15_ - f_13_;
				float f_24_ = f_16_ - f_14_;
				if (f < (float) i_17_) {
					f_13_ += ((float) i_17_ - f) / f_21_ * f_23_;
					f = (float) i_17_;
				}
				if (f_10_ < (float) i_18_) {
					f_14_ += ((float) i_18_ - f_10_) / f_22_ * f_24_;
					f_10_ = (float) i_18_;
				}
				if (f_11_ > (float) i_19_) {
					f_15_ -= (f_11_ - (float) i_19_) / f_21_ * f_23_;
					f_11_ = (float) i_19_;
				}
				if (f_12_ > (float) i_20_) {
					f_16_ -= (f_12_ - (float) i_20_) / f_22_ * f_24_;
					f_12_ = (float) i_20_;
				}
				method2083();
				f = method2088(f);
				f_10_ = method2087(f_10_);
				f_11_ = method2088(f_11_);
				f_12_ = method2087(f_12_);
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 0] = f;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 1] = f_10_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 2] = f_13_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 3] = f_14_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 4] = f_11_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 5] = f_10_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 6] = f_15_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 7] = f_14_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 8] = f;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 9] = f_12_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 10] = f_13_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 11] = f_16_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 12] = f_11_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 13] = f_12_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 14] = f_15_;
				((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 15] = f_16_;
				((Class187) this).anInterface11_Impl3Array1845[((Class187) this).anInt1848] = interface11_impl3;
				((Class187) this).anIntArray1850[((Class187) this).anInt1848] = i;
				((Class187) this).anInt1848++;
				if (((Class187) this).aClass161_1839 == Class161.aClass161_1689)
					method2085();
			}
		}
	}

	float method2087(float f) {
		int i = ((Class187) this).aClass_ra_Sub2_1846.method4782((byte) 0).method857();
		float f_25_ = (1.0F - ((f + ((Class187) this).aClass_ra_Sub2_1846.method4901()) / (float) i)) * 2.0F - 1.0F;
		return f_25_;
	}

	float method2088(float f) {
		int i = ((Class187) this).aClass_ra_Sub2_1846.method4782((byte) 0).method856();
		float f_26_ = ((f + ((Class187) this).aClass_ra_Sub2_1846.method4901()) / (float) i * 2.0F) - 1.0F;
		return f_26_;
	}

	void method2089() {
		((Class187) this).aClass161_1841 = ((Class187) this).aClass161_1839;
		((Class187) this).aClass161_1839 = Class161.aClass161_1688;
	}

	void method2090() {
		if (((Class187) this).aClass161_1841 != null) {
			((Class187) this).aClass161_1839 = ((Class187) this).aClass161_1841;
			((Class187) this).aClass161_1841 = null;
		}
	}

	Class161 method2091() {
		return ((Class187) this).aClass161_1839;
	}

	void method2092(float f, float f_27_, float f_28_, float f_29_, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, float f_35_, float f_36_, float f_37_, float f_38_, float f_39_, float f_40_, float f_41_, Interface11_Impl3 interface11_impl3, int i) {
		if ((i & ~0xffffff) != 0) {
			((Class187) this).aClass_ra_Sub2_1846.qa(((Class187) this).anIntArray1851);
			int i_42_ = ((Class187) this).anIntArray1851[0];
			int i_43_ = ((Class187) this).anIntArray1851[1];
			int i_44_ = ((Class187) this).anIntArray1851[2];
			int i_45_ = ((Class187) this).anIntArray1851[3];
			int i_46_ = 0;
			int i_47_ = ((f < (float) i_42_ ? 1 : 0) + (f_28_ < (float) i_42_ ? 1 : 0) + (f_30_ < (float) i_42_ ? 1 : 0) + (f_32_ < (float) i_42_ ? 1 : 0));
			if (i_47_ != 4) {
				i_46_ |= i_47_;
				i_47_ = ((f > (float) i_44_ ? 1 : 0) + (f_28_ > (float) i_44_ ? 1 : 0) + (f_30_ > (float) i_44_ ? 1 : 0) + (f_32_ > (float) i_44_ ? 1 : 0));
				if (i_47_ != 4) {
					i_46_ |= i_47_;
					i_47_ = ((f_27_ < (float) i_43_ ? 1 : 0) + (f_29_ < (float) i_43_ ? 1 : 0) + (f_31_ < (float) i_43_ ? 1 : 0) + (f_33_ < (float) i_43_ ? 1 : 0));
					if (i_47_ != 4) {
						i_46_ |= i_47_;
						i_47_ = ((f_27_ > (float) i_45_ ? 1 : 0) + (f_29_ > (float) i_45_ ? 1 : 0) + (f_31_ > (float) i_45_ ? 1 : 0) + (f_33_ > (float) i_45_ ? 1 : 0));
						if (i_47_ != 4) {
							i_46_ |= i_47_;
							if (i_46_ != 0) {
								method2085();
								((Class187) this).aClass_ra_Sub2_1846.method4787(true);
								((Class187) this).aClass_ra_Sub2_1846.r(i_42_, i_43_, i_44_, i_45_);
							}
							method2083();
							f = method2088(f);
							f_27_ = method2087(f_27_);
							f_28_ = method2088(f_28_);
							f_29_ = method2087(f_29_);
							f_30_ = method2088(f_30_);
							f_31_ = method2087(f_31_);
							f_32_ = method2088(f_32_);
							f_33_ = method2087(f_33_);
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 0] = f;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 1] = f_27_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 2] = f_34_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 3] = f_35_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 4] = f_28_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 5] = f_29_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 6] = f_36_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 7] = f_37_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 8] = f_30_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 9] = f_31_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 10] = f_38_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 11] = f_39_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 12] = f_32_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 13] = f_33_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 14] = f_40_;
							((Class187) this).aFloatArray1844[((Class187) this).anInt1848 * 16 + 15] = f_41_;
							((Class187) this).anInterface11_Impl3Array1845[((Class187) this).anInt1848] = interface11_impl3;
							((Class187) this).anIntArray1850[(((Class187) this).anInt1848)] = i;
							((Class187) this).anInt1848++;
							if ((((Class187) this).aClass161_1839 == Class161.aClass161_1689) || i_46_ > 0)
								method2085();
							if (i_46_ != 0) {
								((Class187) this).aClass_ra_Sub2_1846.method4787(false);
								((Class187) this).aClass_ra_Sub2_1846.L();
								((Class187) this).aClass_ra_Sub2_1846.r(i_42_, i_43_, i_44_, i_45_);
							}
						}
					}
				}
			}
		}
	}

	Class187(Class_ra_Sub2 class_ra_sub2, int i) {
		((Class187) this).aFloatArray1844 = new float[((Class187) this).anInt1842 * 16];
		((Class187) this).anInterface11_Impl3Array1845 = new Interface11_Impl3[((Class187) this).anInt1842];
		((Class187) this).anIntArray1850 = new int[((Class187) this).anInt1842];
		((Class187) this).anIntArray1851 = new int[4];
		((Class187) this).aClass_ra_Sub2_1846 = class_ra_sub2;
		((Class187) this).anInterface9_Impl1_1840 = ((Class187) this).aClass_ra_Sub2_1846.method4976(true);
		((Class187) this).anInterface9_Impl1_1840.method142(i * 96, 24);
		((Class187) this).aClass184_1843 = (((Class187) this).aClass_ra_Sub2_1846.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1862 }) }));
		((Class187) this).anInterface9_Impl2_1849 = ((Class187) this).aClass_ra_Sub2_1846.method4975(false);
		int i_48_ = i * 6;
		((Class187) this).anInterface9_Impl2_1849.method148(i_48_);
		ByteBuffer bytebuffer = ((Class187) this).aClass_ra_Sub2_1846.aByteBuffer8458;
		bytebuffer.clear();
		for (int i_49_ = 0; i_49_ < i; i_49_++) {
			bytebuffer.putShort((short) (i_49_ * 4));
			bytebuffer.putShort((short) (i_49_ * 4 + 2));
			bytebuffer.putShort((short) (i_49_ * 4 + 1));
			bytebuffer.putShort((short) (i_49_ * 4 + 2));
			bytebuffer.putShort((short) (i_49_ * 4 + 3));
			bytebuffer.putShort((short) (i_49_ * 4 + 1));
		}
		((Class187) this).anInterface9_Impl2_1849.method97(0, (i_48_ * (((Class187) this).anInterface9_Impl2_1849.method157().anInt724 * -1615628035)), ((Class187) this).aClass_ra_Sub2_1846.aLong8459);
		((Class187) this).anInt1847 = i;
		((Class187) this).anInt1848 = 0;
	}
}
