/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Class53 {
	static int anInt503 = 65535;
	static int anInt504 = 0;
	static int anInt505 = 1;

	public static Class87[] method639(byte[] is) {
		Buffer class330_sub46 = new Buffer(is);
		class330_sub46.offset = (is.length - 2) * 323600977;
		int i = class330_sub46.readUnsignedShort(433476571);
		if (i != 65535) {
			Class87_Sub2[] class87_sub2s = new Class87_Sub2[i];
			for (int i_0_ = 0; i_0_ < i; i_0_++)
				class87_sub2s[i_0_] = new Class87_Sub2();
			class330_sub46.offset = (is.length - 7 - i * 8) * 323600977;
			int i_1_ = class330_sub46.readUnsignedShort(2049260762);
			int i_2_ = class330_sub46.readUnsignedShort(2097747680);
			int i_3_ = (class330_sub46.readUnsignedByte(2016598483) & 0xff) + 1;
			for (int i_4_ = 0; i_4_ < i; i_4_++)
				class87_sub2s[i_4_].anInt7109 = class330_sub46.readUnsignedShort(1010877592);
			for (int i_5_ = 0; i_5_ < i; i_5_++)
				class87_sub2s[i_5_].anInt7111 = class330_sub46.readUnsignedShort(2056411438);
			for (int i_6_ = 0; i_6_ < i; i_6_++)
				class87_sub2s[i_6_].anInt7112 = class330_sub46.readUnsignedShort(-131029458);
			for (int i_7_ = 0; i_7_ < i; i_7_++)
				class87_sub2s[i_7_].anInt7107 = class330_sub46.readUnsignedShort(-318233511);
			for (int i_8_ = 0; i_8_ < i; i_8_++) {
				Class87_Sub2 class87_sub2 = class87_sub2s[i_8_];
				((Class87_Sub2) class87_sub2).anInt7110 = i_1_ - class87_sub2.anInt7112 - class87_sub2.anInt7109;
				((Class87_Sub2) class87_sub2).anInt7108 = i_2_ - class87_sub2.anInt7107 - class87_sub2.anInt7111;
			}
			class330_sub46.offset = (is.length - 7 - i * 8 - (i_3_ - 1) * 3) * 323600977;
			int[] is_9_ = new int[i_3_];
			for (int i_10_ = 1; i_10_ < i_3_; i_10_++) {
				is_9_[i_10_] = class330_sub46.readUnsignedTriByte(-1401356047);
				if (is_9_[i_10_] == 0)
					is_9_[i_10_] = 1;
			}
			for (int i_11_ = 0; i_11_ < i; i_11_++)
				class87_sub2s[i_11_].anIntArray7113 = is_9_;
			class330_sub46.offset = 0;
			for (int i_12_ = 0; i_12_ < i; i_12_++) {
				Class87_Sub2 class87_sub2 = class87_sub2s[i_12_];
				int i_13_ = class87_sub2.anInt7112 * class87_sub2.anInt7107;
				class87_sub2.aByteArray7114 = new byte[i_13_];
				int i_14_ = class330_sub46.readUnsignedByte(-81028415);
				if ((i_14_ & 0x2) == 0) {
					if ((i_14_ & 0x1) == 0) {
						for (int i_15_ = 0; i_15_ < i_13_; i_15_++)
							class87_sub2.aByteArray7114[i_15_] = class330_sub46.readByte((byte) 49);
					} else {
						for (int i_16_ = 0; i_16_ < class87_sub2.anInt7112; i_16_++) {
							for (int i_17_ = 0; i_17_ < class87_sub2.anInt7107; i_17_++)
								class87_sub2.aByteArray7114[i_16_ + i_17_ * class87_sub2.anInt7112] = class330_sub46.readByte((byte) 70);
						}
					}
				} else {
					boolean bool = false;
					class87_sub2.aByteArray7115 = new byte[i_13_];
					if ((i_14_ & 0x1) == 0) {
						for (int i_18_ = 0; i_18_ < i_13_; i_18_++)
							class87_sub2.aByteArray7114[i_18_] = class330_sub46.readByte((byte) -80);
						for (int i_19_ = 0; i_19_ < i_13_; i_19_++) {
							byte i_20_ = (class87_sub2.aByteArray7115[i_19_] = class330_sub46.readByte((byte) -3));
							bool = bool | i_20_ != -1;
						}
					} else {
						for (int i_21_ = 0; i_21_ < class87_sub2.anInt7112; i_21_++) {
							for (int i_22_ = 0; i_22_ < class87_sub2.anInt7107; i_22_++)
								class87_sub2.aByteArray7114[i_21_ + i_22_ * class87_sub2.anInt7112] = class330_sub46.readByte((byte) 32);
						}
						for (int i_23_ = 0; i_23_ < class87_sub2.anInt7112; i_23_++) {
							for (int i_24_ = 0; i_24_ < class87_sub2.anInt7107; i_24_++) {
								byte i_25_ = (class87_sub2.aByteArray7115[(i_23_ + i_24_ * class87_sub2.anInt7112)] = class330_sub46.readByte((byte) -98));
								bool = bool | i_25_ != -1;
							}
						}
					}
					if (!bool)
						class87_sub2.aByteArray7115 = null;
				}
			}
			return class87_sub2s;
		}
		class330_sub46.offset = 0;
		int i_26_ = class330_sub46.readUnsignedByte(19842256);
		if (i_26_ == 0) {
			boolean bool = class330_sub46.readUnsignedByte(536901327) == 1;
			int i_27_ = class330_sub46.readUnsignedShort(239189594);
			int i_28_ = class330_sub46.readUnsignedShort(1510046692);
			int[] is_29_ = new int[i_27_ * i_28_];
			for (int i_30_ = 0; i_30_ < i_27_ * i_28_; i_30_++)
				is_29_[i_30_] = ~0xffffff | class330_sub46.readUnsignedTriByte(-1401356047);
			if (bool) {
				for (int i_31_ = 0; i_31_ < i_27_ * i_28_; i_31_++) {
					is_29_[i_31_] &= 0xffffff;
					is_29_[i_31_] |= class330_sub46.readUnsignedByte(-140605281) << 24;
				}
			}
			Class87_Sub1 class87_sub1 = new Class87_Sub1(i_27_, i_28_, is_29_);
			return new Class87[] { class87_sub1 };
		}
		if (i_26_ == 1) {
			Class87[] class87s;
			try {
				BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(class330_sub46.payload, class330_sub46.offset * -824785231, (class330_sub46.payload.length - (class330_sub46.offset * -824785231))));
				int i_32_ = bufferedimage.getWidth();
				int i_33_ = bufferedimage.getHeight();
				Class87_Sub1 class87_sub1 = new Class87_Sub1(i_32_, i_33_, (bufferedimage.getData().getPixels(0, 0, i_32_, i_33_, new int[i_32_ * i_33_])));
				class87s = new Class87[] { class87_sub1 };
			} catch (IOException ioexception) {
				throw new RuntimeException();
			}
			return class87s;
		}
		throw new RuntimeException();
	}

	public static Class87 method640(IndexTable class280, int i) {
		byte[] is = class280.method2761(i, 1342988402);
		if (is == null)
			return null;
		return method639(is)[0];
	}

	public static Class87[] method641(IndexTable class280, int i, int i_34_) {
		byte[] is = class280.getFile(i, i_34_);
		if (is == null)
			return null;
		return method639(is);
	}

	public static Class87[] method642(IndexTable class280, int i) {
		byte[] is = class280.method2761(i, 798173519);
		if (is == null)
			return null;
		return method639(is);
	}

	Class53() throws Throwable {
		throw new Error();
	}

	public static Class87 method643(IndexTable class280, int i, int i_35_) {
		byte[] is = class280.getFile(i, i_35_);
		if (is == null)
			return null;
		return method639(is)[0];
	}
}
