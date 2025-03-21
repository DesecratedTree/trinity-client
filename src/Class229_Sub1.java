/* Class229_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class229_Sub1 extends Class229 implements Interface11_Impl3 {
	float aFloat8911;
	int anInt8912;
	float aFloat8913;
	int anInt8914;
	boolean aBoolean8915;
	boolean aBoolean8916;

	public int method108() {
		return ((Class229_Sub1) this).anInt8912;
	}

	Class229_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, Class86 class86, int i, int i_0_, int i_1_, int i_2_) {
		super(class_ra_sub2_sub2, class72, class86, false, i * i_0_);
		if (!((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aBoolean9909) {
			((Class229_Sub1) this).anInt8914 = Class136.method1594(i, 1769006695);
			((Class229_Sub1) this).anInt8912 = Class136.method1594(i_0_, 2030650992);
			((Class229_Sub1) this).aFloat8911 = (float) i / (float) ((Class229_Sub1) this).anInt8914;
			((Class229_Sub1) this).aFloat8913 = (float) i_0_ / (float) ((Class229_Sub1) this).anInt8912;
		} else {
			((Class229_Sub1) this).anInt8914 = i;
			((Class229_Sub1) this).anInt8912 = i_0_;
			((Class229_Sub1) this).aFloat8911 = 1.0F;
			((Class229_Sub1) this).aFloat8913 = 1.0F;
		}
		((Class229_Sub1) this).aLong6488 = (IDirect3DDevice.CreateTexture(((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aLong9891, i, i_0_, 0, i_1_, Class_ra_Sub2_Sub2.method5183((((Class229_Sub1) this).aClass72_6485), (((Class229_Sub1) this).aClass86_6486)), i_2_));
	}

	Class229_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, int i, int i_3_, boolean bool, int[] is, int i_4_, int i_5_) {
		super(class_ra_sub2_sub2, Class72.aClass72_620, Class86.aClass86_714, bool && ((Class_ra_Sub2_Sub2) class_ra_sub2_sub2).aBoolean9888, i * i_3_);
		if (!((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aBoolean9909) {
			((Class229_Sub1) this).anInt8914 = Class136.method1594(i, 1955019530);
			((Class229_Sub1) this).anInt8912 = Class136.method1594(i_3_, 2013170622);
			((Class229_Sub1) this).aFloat8911 = (float) i / (float) ((Class229_Sub1) this).anInt8914;
			((Class229_Sub1) this).aFloat8913 = (float) i_3_ / (float) ((Class229_Sub1) this).anInt8912;
			if (i != ((Class229_Sub1) this).anInt8914 || i_3_ != ((Class229_Sub1) this).anInt8912) {
				is = method2320(i, i_3_, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, is, i_4_, i_5_);
				i_4_ = 0;
				i_5_ = ((Class229_Sub1) this).anInt8914;
			}
		} else {
			((Class229_Sub1) this).anInt8914 = i;
			((Class229_Sub1) this).anInt8912 = i_3_;
			((Class229_Sub1) this).aFloat8911 = 1.0F;
			((Class229_Sub1) this).aFloat8913 = 1.0F;
		}
		if (bool)
			((Class229_Sub1) this).aLong6488 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, 0, 1024, 21, 1));
		else
			((Class229_Sub1) this).aLong6488 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, 1, 0, 21, 1));
		if (i_5_ == 0)
			i_5_ = ((Class229_Sub1) this).anInt8914;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_4_, i_5_ * ((Class229_Sub1) this).anInt8912);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, 0, 0, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, i_5_ * ((((Class229_Sub1) this).aClass72_6485.anInt609) * 2145490527), 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
	}

	Class229_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, int i, int i_6_, boolean bool, byte[] is, int i_7_, int i_8_) {
		super(class_ra_sub2_sub2, class72, Class86.aClass86_714, bool && ((Class_ra_Sub2_Sub2) class_ra_sub2_sub2).aBoolean9888, i * i_6_);
		if (!((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aBoolean9909) {
			((Class229_Sub1) this).anInt8914 = Class136.method1594(i, 1775765356);
			((Class229_Sub1) this).anInt8912 = Class136.method1594(i_6_, 1896573775);
			((Class229_Sub1) this).aFloat8911 = (float) i / (float) ((Class229_Sub1) this).anInt8914;
			((Class229_Sub1) this).aFloat8913 = (float) i_6_ / (float) ((Class229_Sub1) this).anInt8912;
			if (i != ((Class229_Sub1) this).anInt8914 || i_6_ != ((Class229_Sub1) this).anInt8912) {
				is = method2322(i, i_6_, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, is, i_7_, i_8_, class72.anInt609 * 2145490527);
				i_7_ = 0;
				i_8_ = ((Class229_Sub1) this).anInt8914;
			}
		} else {
			((Class229_Sub1) this).anInt8914 = i;
			((Class229_Sub1) this).anInt8912 = i_6_;
			((Class229_Sub1) this).aFloat8911 = 1.0F;
			((Class229_Sub1) this).aFloat8913 = 1.0F;
		}
		if (bool)
			((Class229_Sub1) this).aLong6488 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, 0, 1024, Class_ra_Sub2_Sub2.method5183((((Class229_Sub1) this).aClass72_6485), Class86.aClass86_714), 1));
		else
			((Class229_Sub1) this).aLong6488 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, 1, 0, Class_ra_Sub2_Sub2.method5183((((Class229_Sub1) this).aClass72_6485), Class86.aClass86_714), 1));
		if (i_8_ == 0)
			i_8_ = ((Class229_Sub1) this).anInt8914;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		Class72 class72_9_ = ((Class229_Sub1) this).aClass72_6485;
		if (((Class229_Sub1) this).aClass72_6485 != null) {
			/* empty */
		}
		if (class72_9_ == Class72.aClass72_617) {
			bytebuffer.put(is, i_7_, (((Class229_Sub1) this).anInt8912 * ((Class229_Sub1) this).anInt8914 / 2));
			IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, 0, 0, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912 / 4, ((Class229_Sub1) this).anInt8914 / 4 * 8, 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
		} else {
			Class72 class72_10_ = ((Class229_Sub1) this).aClass72_6485;
			if (((Class229_Sub1) this).aClass72_6485 != null) {
				/* empty */
			}
			if (class72_10_ == Class72.aClass72_618) {
				bytebuffer.put(is, i_7_, (((Class229_Sub1) this).anInt8912 * ((Class229_Sub1) this).anInt8914));
				IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, 0, 0, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912 / 4, (((Class229_Sub1) this).anInt8914 / 4 * 16), 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
			} else {
				bytebuffer.put(is, i_7_, i_8_ * ((Class229_Sub1) this).anInt8912);
				IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, 0, 0, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, i_8_ * ((((Class229_Sub1) this).aClass72_6485.anInt609) * 2145490527), 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
			}
		}
	}

	Class229_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, int i, int i_11_, boolean bool, float[] fs, int i_12_, int i_13_) {
		super(class_ra_sub2_sub2, class72, Class86.aClass86_714, bool && ((Class_ra_Sub2_Sub2) class_ra_sub2_sub2).aBoolean9888, i * i_11_);
		if (!((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aBoolean9909) {
			((Class229_Sub1) this).anInt8914 = Class136.method1594(i, 2073982620);
			((Class229_Sub1) this).anInt8912 = Class136.method1594(i_11_, 1980444089);
			((Class229_Sub1) this).aFloat8911 = (float) i / (float) ((Class229_Sub1) this).anInt8914;
			((Class229_Sub1) this).aFloat8913 = (float) i_11_ / (float) ((Class229_Sub1) this).anInt8912;
			if (i != ((Class229_Sub1) this).anInt8914 || i_11_ != ((Class229_Sub1) this).anInt8912) {
				fs = method2321(i, i_11_, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, fs, i_12_, i_13_, class72.anInt609 * 2145490527);
				i_12_ = 0;
				i_13_ = ((Class229_Sub1) this).anInt8914;
			}
		} else {
			((Class229_Sub1) this).anInt8914 = i;
			((Class229_Sub1) this).anInt8912 = i_11_;
			((Class229_Sub1) this).aFloat8911 = 1.0F;
			((Class229_Sub1) this).aFloat8913 = 1.0F;
		}
		if (bool)
			((Class229_Sub1) this).aLong6488 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, 0, 1024, Class_ra_Sub2_Sub2.method5183((((Class229_Sub1) this).aClass72_6485), Class86.aClass86_717), 1));
		else
			((Class229_Sub1) this).aLong6488 = (IDirect3DDevice.CreateTexture((((Class_ra_Sub2_Sub2) ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484).aLong9891), ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, 1, 0, Class_ra_Sub2_Sub2.method5183((((Class229_Sub1) this).aClass72_6485), Class86.aClass86_717), 1));
		if (i_13_ == 0)
			i_13_ = ((Class229_Sub1) this).anInt8914;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_12_, (i_13_ * ((Class229_Sub1) this).anInt8912 * ((((Class229_Sub1) this).aClass72_6485.anInt609) * 2145490527)));
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, 0, 0, ((Class229_Sub1) this).anInt8914, ((Class229_Sub1) this).anInt8912, i_13_ * ((((Class229_Sub1) this).aClass72_6485.anInt609) * 2145490527) * 4, 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
	}

	public void method166() {
		((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	public float method105(float f) {
		return f / (float) ((Class229_Sub1) this).anInt8914;
	}

	public void method125(int i, int i_14_, int i_15_, int i_16_, byte[] is, Class72 class72, int i_17_, int i_18_) {
		if (((Class229_Sub1) this).aClass72_6485 != class72 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_18_ == 0)
			i_18_ = i_15_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is, i_17_, i_18_ * i_16_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_14_, i_15_, i_16_, i_18_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method111(int i, int i_19_, int i_20_, int i_21_, int[] is, int i_22_, int i_23_) {
		if (((Class229_Sub1) this).aClass72_6485 != Class72.aClass72_620 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_23_ == 0)
			i_23_ = i_20_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_22_, i_23_ * i_21_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_19_, i_20_, i_21_, i_23_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method163(Class189 class189) {
		super.method163(class189);
	}

	public float method114() {
		return ((Class229_Sub1) this).aFloat8913;
	}

	public float method106(float f) {
		return f / (float) ((Class229_Sub1) this).anInt8914;
	}

	long method2318() {
		return ((Class229_Sub1) this).aLong6488;
	}

	public float method104(float f) {
		return f / (float) ((Class229_Sub1) this).anInt8912;
	}

	public void method109(boolean bool, boolean bool_24_) {
		((Class229_Sub1) this).aBoolean8915 = bool;
		((Class229_Sub1) this).aBoolean8916 = bool_24_;
	}

	public void method118(int i, int i_25_, int i_26_, int i_27_, int[] is, int i_28_, int i_29_) {
		if (((Class229_Sub1) this).aClass72_6485 != Class72.aClass72_620 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_29_ == 0)
			i_29_ = i_26_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_28_, i_29_ * i_27_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_25_, i_26_, i_27_, i_29_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method117(int i, int i_30_, int i_31_, int i_32_, byte[] is, Class72 class72, int i_33_, int i_34_) {
		if (((Class229_Sub1) this).aClass72_6485 != class72 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_34_ == 0)
			i_34_ = i_31_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is, i_33_, i_34_ * i_32_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_30_, i_31_, i_32_, i_34_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method110(int i, int i_35_, int i_36_, int i_37_, int[] is, int i_38_) {
		if (((Class229_Sub1) this).aClass72_6485 != Class72.aClass72_620 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class229_Sub1) this).aLong6488, 0, i, i_35_, i_36_, i_37_, i_36_ * 4, 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
		bytebuffer.asIntBuffer().get(is, i_38_, i_36_ * i_37_);
	}

	public void method122(boolean bool, boolean bool_39_) {
		((Class229_Sub1) this).aBoolean8915 = bool;
		((Class229_Sub1) this).aBoolean8916 = bool_39_;
	}

	public void method165() {
		((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	int[] method2320(int i, int i_40_, int i_41_, int i_42_, int[] is, int i_43_, int i_44_) {
		int[] is_45_ = new int[i_41_ * i_42_];
		if (i_44_ == 0)
			i_44_ = i;
		for (int i_46_ = 0; i_46_ < i_42_; i_46_++) {
			if (i_46_ < i_40_) {
				int i_47_ = i_43_ + i_46_ * i_44_;
				for (int i_48_ = 0; i_48_ < i; i_48_++)
					is_45_[i_41_ * i_46_ + i_48_] = is[i_47_ + i_48_];
				int i_49_ = is[i_47_ + (i - 1)];
				for (int i_50_ = i; i_50_ < i_41_; i_50_++)
					is_45_[i_41_ * i_46_ + i_50_] = i_49_;
			} else {
				int i_51_ = i_41_ * (i_40_ - 1);
				for (int i_52_ = 0; i_52_ < i_41_; i_52_++)
					is_45_[i_41_ * i_46_ + i_52_] = is_45_[i_51_ + i_52_];
			}
		}
		return is_45_;
	}

	float[] method2321(int i, int i_53_, int i_54_, int i_55_, float[] fs, int i_56_, int i_57_, int i_58_) {
		float[] fs_59_ = new float[i_54_ * i_55_ * i_58_];
		if (i_57_ == 0)
			i_57_ = i * i_58_;
		for (int i_60_ = 0; i_60_ < i_55_; i_60_++) {
			if (i_60_ < i_53_) {
				int i_61_ = i_56_ + i_60_ * i_57_;
				for (int i_62_ = 0; i_62_ < i; i_62_++) {
					for (int i_63_ = 0; i_63_ < i_58_; i_63_++)
						fs_59_[i_54_ * i_60_ * i_58_ + i_62_ * i_58_ + i_63_] = fs[i_61_ + i_62_ * i_58_ + i_63_];
				}
				float[] fs_64_ = new float[i_58_];
				for (int i_65_ = 0; i_65_ < i_58_; i_65_++)
					fs_64_[i_65_] = fs[i_61_ + (i - 1) * i_58_ + i_65_];
				for (int i_66_ = i; i_66_ < i_54_; i_66_++) {
					for (int i_67_ = 0; i_67_ < i_58_; i_67_++)
						fs_59_[i_54_ * i_60_ * i_58_ + i_66_ * i_58_ + i_67_] = fs_64_[i_67_];
				}
			} else {
				int i_68_ = i_54_ * (i_53_ - 1) * i_58_;
				for (int i_69_ = 0; i_69_ < i_54_; i_69_++) {
					for (int i_70_ = 0; i_70_ < i_58_; i_70_++)
						fs_59_[i_54_ * i_60_ * i_58_ + i_69_ * i_58_ + i_70_] = fs_59_[i_68_ + i_69_ * i_58_ + i_70_];
				}
			}
		}
		return fs_59_;
	}

	public void method164() {
		((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	Class229_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, Class86 class86, int i, int i_71_) {
		this(class_ra_sub2_sub2, class72, class86, i, i_71_, 0, 1);
	}

	public void method52() {
		super.method53();
	}

	public void method131(int i, int i_72_, int i_73_, int i_74_, int[] is, int i_75_) {
		if (((Class229_Sub1) this).aClass72_6485 != Class72.aClass72_620 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class229_Sub1) this).aLong6488, 0, i, i_72_, i_73_, i_74_, i_73_ * 4, 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
		bytebuffer.asIntBuffer().get(is, i_75_, i_73_ * i_74_);
	}

	public int method139() {
		return ((Class229_Sub1) this).anInt8912;
	}

	public float method112(float f) {
		return f / (float) ((Class229_Sub1) this).anInt8912;
	}

	public float method132(float f) {
		return f / (float) ((Class229_Sub1) this).anInt8912;
	}

	public boolean method120() {
		return true;
	}

	public boolean method121() {
		return true;
	}

	public void method128(int i, int i_76_, int i_77_, int i_78_, byte[] is, Class72 class72, int i_79_, int i_80_) {
		if (((Class229_Sub1) this).aClass72_6485 != class72 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_80_ == 0)
			i_80_ = i_77_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is, i_79_, i_80_ * i_78_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_76_, i_77_, i_78_, i_80_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public int method137() {
		return ((Class229_Sub1) this).anInt8914;
	}

	public void method129(int i, int i_81_, int i_82_, int i_83_, int[] is, int i_84_, int i_85_) {
		if (((Class229_Sub1) this).aClass72_6485 != Class72.aClass72_620 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_85_ == 0)
			i_85_ = i_82_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_84_, i_85_ * i_83_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_81_, i_82_, i_83_, i_85_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public int method116() {
		return ((Class229_Sub1) this).anInt8914;
	}

	public void method126(int i, int i_86_, int i_87_, int i_88_, byte[] is, Class72 class72, int i_89_, int i_90_) {
		if (((Class229_Sub1) this).aClass72_6485 != class72 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_90_ == 0)
			i_90_ = i_87_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is, i_89_, i_90_ * i_88_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_86_, i_87_, i_88_, i_90_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method127(int i, int i_91_, int i_92_, int i_93_, byte[] is, Class72 class72, int i_94_, int i_95_) {
		if (((Class229_Sub1) this).aClass72_6485 != class72 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_95_ == 0)
			i_95_ = i_92_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is, i_94_, i_95_ * i_93_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_91_, i_92_, i_93_, i_95_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public boolean method136() {
		return false;
	}

	public void method107(int i, int i_96_, int i_97_, int i_98_, byte[] is, Class72 class72, int i_99_, int i_100_) {
		if (((Class229_Sub1) this).aClass72_6485 != class72 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_100_ == 0)
			i_100_ = i_97_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is, i_99_, i_100_ * i_98_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_96_, i_97_, i_98_, i_100_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	public void method130(int i, int i_101_, int i_102_, int i_103_, byte[] is, Class72 class72, int i_104_, int i_105_) {
		if (((Class229_Sub1) this).aClass72_6485 != class72 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		if (i_105_ == 0)
			i_105_ = i_102_;
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		bytebuffer.put(is, i_104_, i_105_ * i_103_);
		IDirect3DTexture.Upload(((Class229_Sub1) this).aLong6488, 0, i, i_101_, i_102_, i_103_, i_105_ * (((Class229_Sub1) this).aClass72_6485.anInt609 * 2145490527), 0, ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459);
	}

	byte[] method2322(int i, int i_106_, int i_107_, int i_108_, byte[] is, int i_109_, int i_110_, int i_111_) {
		byte[] is_112_ = new byte[i_107_ * i_108_ * i_111_];
		if (i_110_ == 0)
			i_110_ = i * i_111_;
		for (int i_113_ = 0; i_113_ < i_108_; i_113_++) {
			if (i_113_ < i_106_) {
				int i_114_ = i_109_ + i_113_ * i_110_;
				for (int i_115_ = 0; i_115_ < i; i_115_++) {
					for (int i_116_ = 0; i_116_ < i_111_; i_116_++)
						is_112_[(i_107_ * i_113_ * i_111_ + i_115_ * i_111_ + i_116_)] = is[i_114_ + i_115_ * i_111_ + i_116_];
				}
				byte[] is_117_ = new byte[i_111_];
				for (int i_118_ = 0; i_118_ < i_111_; i_118_++)
					is_117_[i_118_] = is[i_114_ + (i - 1) * i_111_ + i_118_];
				for (int i_119_ = i; i_119_ < i_107_; i_119_++) {
					for (int i_120_ = 0; i_120_ < i_111_; i_120_++)
						is_112_[(i_107_ * i_113_ * i_111_ + i_119_ * i_111_ + i_120_)] = is_117_[i_120_];
				}
			} else {
				int i_121_ = i_107_ * (i_106_ - 1) * i_111_;
				for (int i_122_ = 0; i_122_ < i_107_; i_122_++) {
					for (int i_123_ = 0; i_123_ < i_111_; i_123_++)
						is_112_[(i_107_ * i_113_ * i_111_ + i_122_ * i_111_ + i_123_)] = is_112_[i_121_ + i_122_ * i_111_ + i_123_];
				}
			}
		}
		return is_112_;
	}

	public void method119(int i, int i_124_, int i_125_, int i_126_, int[] is, int i_127_) {
		if (((Class229_Sub1) this).aClass72_6485 != Class72.aClass72_620 || ((Class229_Sub1) this).aClass86_6486 != Class86.aClass86_714)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aByteBuffer8458;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class229_Sub1) this).aLong6488, 0, i, i_124_, i_125_, i_126_, i_125_ * 4, 0, (((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.aLong8459));
		bytebuffer.asIntBuffer().get(is, i_127_, i_125_ * i_126_);
	}

	public boolean method115() {
		return false;
	}

	public float method134() {
		return ((Class229_Sub1) this).aFloat8911;
	}

	public float method135() {
		return ((Class229_Sub1) this).aFloat8913;
	}

	public float method123() {
		return ((Class229_Sub1) this).aFloat8911;
	}

	public boolean method113() {
		return true;
	}

	public void method162() {
		((Class229_Sub1) this).aClass_ra_Sub2_Sub2_6484.method5163(this);
	}

	public float method133() {
		return ((Class229_Sub1) this).aFloat8911;
	}

	public void method167(Class189 class189) {
		super.method163(class189);
	}

	long method2323() {
		return ((Class229_Sub1) this).aLong6488;
	}

	long method2324() {
		return ((Class229_Sub1) this).aLong6488;
	}

	public int method124() {
		return ((Class229_Sub1) this).anInt8912;
	}

	public int method138() {
		return ((Class229_Sub1) this).anInt8912;
	}

	public void method53() {
		super.method53();
	}

	public int method140() {
		return ((Class229_Sub1) this).anInt8912;
	}

	public int method141() {
		return ((Class229_Sub1) this).anInt8912;
	}
}
