/* Class263_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class263_Sub5 extends Class263 {
	Class_ra_Sub2 aClass_ra_Sub2_7394;
	Interface11_Impl3 anInterface11_Impl3_7395;
	Interface9_Impl1 anInterface9_Impl1_7396;
	byte[] aByteArray7397 = new byte[512];
	int anInt7398;
	int anInt7399;

	void method2602(char c, int i, int i_0_, int i_1_, boolean bool, Class_ta class_ta, int i_2_, int i_3_) {
		/* empty */
	}

	void UA(char c, int i, int i_4_, int i_5_, boolean bool) {
		if (((Class263_Sub5) this).aClass_ra_Sub2_7394.method4903() != Class161.aClass161_1688) {
			i += ((Class263_Sub5) this).aByteArray7397[c * '\002'];
			i_4_ += ((Class263_Sub5) this).aByteArray7397[c * '\002' + '\001'];
			((Class_ra_Sub2) ((Class263_Sub5) this).aClass_ra_Sub2_7394).aClass187_8556.method2086((float) i, (float) i_4_, (float) (i + ((Class263_Sub5) this).anInt7399), (float) (i_4_ + ((Class263_Sub5) this).anInt7399), (float) (c % '\020') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method123(), (float) (c / '\020') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method114(), ((float) (c % '\020' + '\001') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method123()), ((float) (c / '\020' + '\001') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method114()), ((Class263_Sub5) this).anInterface11_Impl3_7395, i_5_);
		} else {
			((Class263_Sub5) this).aClass_ra_Sub2_7394.method4925();
			((Class263_Sub5) this).aClass_ra_Sub2_7394.method4970(1);
			Class159 class159 = (((Class_ra_Sub2) ((Class263_Sub5) this).aClass_ra_Sub2_7394).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class263_Sub5) this).anInterface11_Impl3_7395;
			class159.method1861(0, i_5_);
			float f = (float) ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4782((byte) 0).method856();
			float f_6_ = (float) ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486(2.0F / f, 2.0F / f_6_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_4_ + ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4901()) * 2.0F / f_6_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2516();
			class159.anInterface9_Impl1_1678 = ((Class263_Sub5) this).anInterface9_Impl1_7396;
			class159.anInt1685 = c * '\004';
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class263_Sub5) this).aClass_ra_Sub2_7394).aClass184_8606);
			class159.method1862();
		}
	}

	void method2604(char c, int i, int i_7_, int i_8_, boolean bool, Class_ta class_ta, int i_9_, int i_10_) {
		/* empty */
	}

	void c(char c, int i, int i_11_, int i_12_, boolean bool) {
		if (((Class263_Sub5) this).aClass_ra_Sub2_7394.method4903() != Class161.aClass161_1688) {
			i += ((Class263_Sub5) this).aByteArray7397[c * '\002'];
			i_11_ += ((Class263_Sub5) this).aByteArray7397[c * '\002' + '\001'];
			((Class_ra_Sub2) ((Class263_Sub5) this).aClass_ra_Sub2_7394).aClass187_8556.method2086((float) i, (float) i_11_, (float) (i + ((Class263_Sub5) this).anInt7399), (float) (i_11_ + ((Class263_Sub5) this).anInt7399), (float) (c % '\020') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method123(), (float) (c / '\020') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method114(), ((float) (c % '\020' + '\001') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method123()), ((float) (c / '\020' + '\001') / 16.0F * ((Class263_Sub5) this).anInterface11_Impl3_7395.method114()), ((Class263_Sub5) this).anInterface11_Impl3_7395, i_12_);
		} else {
			((Class263_Sub5) this).aClass_ra_Sub2_7394.method4925();
			((Class263_Sub5) this).aClass_ra_Sub2_7394.method4970(1);
			Class159 class159 = (((Class_ra_Sub2) ((Class263_Sub5) this).aClass_ra_Sub2_7394).aClass159_8590);
			class159.anInterface11_Impl3_1679 = ((Class263_Sub5) this).anInterface11_Impl3_7395;
			class159.method1861(0, i_12_);
			float f = (float) ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4782((byte) 0).method856();
			float f_13_ = (float) ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4782((byte) 0).method857();
			class159.aClass249_1681.method2486(2.0F / f, 2.0F / f_13_, 1.0F, 1.0F);
			class159.aClass249_1681.aFloatArray2631[12] = (((float) i + ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4901()) * 2.0F / f) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[13] = (((float) i_11_ + ((Class263_Sub5) this).aClass_ra_Sub2_7394.method4901()) * 2.0F / f_13_) - 1.0F;
			class159.aClass249_1681.aFloatArray2631[14] = -1.0F;
			class159.aClass249_1682.method2516();
			class159.anInterface9_Impl1_1678 = ((Class263_Sub5) this).anInterface9_Impl1_7396;
			class159.anInt1685 = c * '\004';
			class159.aClass184_1686 = (((Class_ra_Sub2) ((Class263_Sub5) this).aClass_ra_Sub2_7394).aClass184_8606);
			class159.method1862();
		}
	}

	void method2609(char c, int i, int i_14_, int i_15_, boolean bool, Class_ta class_ta, int i_16_, int i_17_) {
		/* empty */
	}

	void method2603(char c, int i, int i_18_, int i_19_, boolean bool, Class_ta class_ta, int i_20_, int i_21_) {
		/* empty */
	}

	Class263_Sub5(Class_ra_Sub2 class_ra_sub2, Class524 class524, Class87_Sub2[] class87_sub2s, boolean bool) {
		super(class_ra_sub2, class524);
		((Class263_Sub5) this).aClass_ra_Sub2_7394 = class_ra_sub2;
		((Class263_Sub5) this).anInt7399 = 0;
		for (int i = 0; i < 256; i++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i];
			if (class87_sub2.anInt7107 > ((Class263_Sub5) this).anInt7399)
				((Class263_Sub5) this).anInt7399 = class87_sub2.anInt7107;
			if (class87_sub2.anInt7112 > ((Class263_Sub5) this).anInt7399)
				((Class263_Sub5) this).anInt7399 = class87_sub2.anInt7112;
		}
		((Class263_Sub5) this).anInt7398 = ((Class263_Sub5) this).anInt7399 * 16;
		if (bool) {
			byte[] is = new byte[(((Class263_Sub5) this).anInt7398 * ((Class263_Sub5) this).anInt7398)];
			for (int i = 0; i < 256; i++) {
				Class87_Sub2 class87_sub2 = class87_sub2s[i];
				int i_22_ = class87_sub2.anInt7107;
				int i_23_ = class87_sub2.anInt7112;
				int i_24_ = i % 16 * ((Class263_Sub5) this).anInt7399;
				int i_25_ = i / 16 * ((Class263_Sub5) this).anInt7399;
				int i_26_ = i_25_ * ((Class263_Sub5) this).anInt7398 + i_24_;
				int i_27_ = 0;
				if (class87_sub2.aByteArray7115 == null) {
					byte[] is_28_ = class87_sub2.aByteArray7114;
					for (int i_29_ = 0; i_29_ < i_22_; i_29_++) {
						for (int i_30_ = 0; i_30_ < i_23_; i_30_++)
							is[i_26_++] = (byte) (is_28_[i_27_++] == 0 ? 0 : -1);
						i_26_ += ((Class263_Sub5) this).anInt7398 - i_23_;
					}
				} else {
					byte[] is_31_ = class87_sub2.aByteArray7115;
					for (int i_32_ = 0; i_32_ < i_22_; i_32_++) {
						for (int i_33_ = 0; i_33_ < i_23_; i_33_++)
							is[i_26_++] = is_31_[i_27_++];
						i_26_ += ((Class263_Sub5) this).anInt7398 - i_23_;
					}
				}
			}
			int[] is_34_ = new int[is.length];
			for (int i = 0; i < is.length; i++)
				is_34_[i] = is[i] << 24 | is[i] << 16 | is[i] << 8 | is[i];
			((Class263_Sub5) this).anInterface11_Impl3_7395 = class_ra_sub2.method4944(((Class263_Sub5) this).anInt7398, ((Class263_Sub5) this).anInt7398, false, is_34_);
		} else {
			int[] is = new int[(((Class263_Sub5) this).anInt7398 * ((Class263_Sub5) this).anInt7398)];
			for (int i = 0; i < 256; i++) {
				Class87_Sub2 class87_sub2 = class87_sub2s[i];
				int[] is_35_ = class87_sub2.anIntArray7113;
				byte[] is_36_ = class87_sub2.aByteArray7115;
				byte[] is_37_ = class87_sub2.aByteArray7114;
				int i_38_ = class87_sub2.anInt7107;
				int i_39_ = class87_sub2.anInt7112;
				int i_40_ = i % 16 * ((Class263_Sub5) this).anInt7399;
				int i_41_ = i / 16 * ((Class263_Sub5) this).anInt7399;
				int i_42_ = i_41_ * ((Class263_Sub5) this).anInt7398 + i_40_;
				int i_43_ = 0;
				if (is_36_ != null) {
					for (int i_44_ = 0; i_44_ < i_38_; i_44_++) {
						for (int i_45_ = 0; i_45_ < i_39_; i_45_++) {
							is[i_42_++] = (is_36_[i_43_] << 24 | is_35_[is_37_[i_43_] & 0xff]);
							i_43_++;
						}
						i_42_ += ((Class263_Sub5) this).anInt7398 - i_39_;
					}
				} else {
					for (int i_46_ = 0; i_46_ < i_38_; i_46_++) {
						for (int i_47_ = 0; i_47_ < i_39_; i_47_++) {
							int i_48_;
							if ((i_48_ = is_37_[i_43_++]) != 0)
								is[i_42_++] = ~0xffffff | is_35_[i_48_ & 0xff];
							else
								i_42_++;
						}
						i_42_ += ((Class263_Sub5) this).anInt7398 - i_39_;
					}
				}
			}
			((Class263_Sub5) this).anInterface11_Impl3_7395 = class_ra_sub2.method4944(((Class263_Sub5) this).anInt7398, ((Class263_Sub5) this).anInt7398, false, is);
		}
		((Class263_Sub5) this).anInterface11_Impl3_7395.method163(Class189.aClass189_1855);
		((Class263_Sub5) this).anInterface9_Impl1_7396 = class_ra_sub2.method4976(false);
		((Class263_Sub5) this).anInterface9_Impl1_7396.method142(20480, 20);
		ByteBuffer bytebuffer = ((Class263_Sub5) this).aClass_ra_Sub2_7394.aByteBuffer8458;
		bytebuffer.clear();
		float f = (((Class263_Sub5) this).anInterface11_Impl3_7395.method106((float) ((Class263_Sub5) this).anInt7398) / (float) ((Class263_Sub5) this).anInt7398);
		float f_49_ = (((Class263_Sub5) this).anInterface11_Impl3_7395.method104((float) ((Class263_Sub5) this).anInt7398) / (float) ((Class263_Sub5) this).anInt7398);
		for (int i = 0; i < 256; i++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i];
			int i_50_ = class87_sub2.anInt7107;
			int i_51_ = class87_sub2.anInt7112;
			int i_52_ = class87_sub2.anInt7111;
			int i_53_ = class87_sub2.anInt7109;
			float f_54_ = (float) (i % 16 * ((Class263_Sub5) this).anInt7399);
			float f_55_ = (float) (i / 16 * ((Class263_Sub5) this).anInt7399);
			float f_56_ = f_54_ * f;
			float f_57_ = f_55_ * f_49_;
			float f_58_ = (f_54_ + (float) i_51_) * f;
			float f_59_ = (f_55_ + (float) i_50_) * f_49_;
			bytebuffer.putFloat((float) i_53_);
			bytebuffer.putFloat((float) i_52_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_56_);
			bytebuffer.putFloat(f_57_);
			bytebuffer.putFloat((float) i_53_);
			bytebuffer.putFloat((float) (i_52_ + i_50_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_56_);
			bytebuffer.putFloat(f_59_);
			bytebuffer.putFloat((float) (i_53_ + i_51_));
			bytebuffer.putFloat((float) (i_52_ + i_50_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_58_);
			bytebuffer.putFloat(f_59_);
			bytebuffer.putFloat((float) (i_53_ + i_51_));
			bytebuffer.putFloat((float) i_52_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_58_);
			bytebuffer.putFloat(f_57_);
		}
		((Class263_Sub5) this).anInterface9_Impl1_7396.method97(0, bytebuffer.position(), ((Class263_Sub5) this).aClass_ra_Sub2_7394.aLong8459);
		class_ra_sub2.method4894(12);
		for (int i = 0; i < 256; i++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i];
			((Class263_Sub5) this).aByteArray7397[i * 2] = (byte) class87_sub2.anInt7109;
			((Class263_Sub5) this).aByteArray7397[i * 2 + 1] = (byte) class87_sub2.anInt7111;
		}
	}

	void method2610(char c, int i, int i_60_, int i_61_, boolean bool, Class_ta class_ta, int i_62_, int i_63_) {
		/* empty */
	}
}
