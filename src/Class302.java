/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class302 {
	Class292[] aClass292Array3060 = new Class292[10];
	static int anInt3061 = 22050;
	int anInt3062;
	int anInt3063;

	Class302(Buffer class330_sub46) {
		for (int i = 0; i < 10; i++) {
			int i_0_ = class330_sub46.readUnsignedByte(758774001);
			if (i_0_ != 0) {
				class330_sub46.offset -= 323600977;
				((Class302) this).aClass292Array3060[i] = new Class292();
				((Class302) this).aClass292Array3060[i].method2911(class330_sub46);
			}
		}
		((Class302) this).anInt3062 = class330_sub46.readUnsignedShort(312501223);
		((Class302) this).anInt3063 = class330_sub46.readUnsignedShort(1227152724);
	}

	public Class330_Sub29_Sub1_Sub2 method2981() {
		byte[] is = method2984();
		return (new Class330_Sub29_Sub1_Sub2(22050, is, 22050 * ((Class302) this).anInt3062 / 1000, 22050 * ((Class302) this).anInt3063 / 1000));
	}

	public static Class302 method2982(IndexTable class280, int i, int i_1_) {
		byte[] is = class280.getFile(i, i_1_);
		if (is == null)
			return null;
		return new Class302(new Buffer(is));
	}

	public final int method2983() {
		int i = 9999999;
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (((Class302) this).aClass292Array3060[i_2_] != null && (((Class292) ((Class302) this).aClass292Array3060[i_2_]).anInt2984) / 20 < i)
				i = (((Class292) ((Class302) this).aClass292Array3060[i_2_]).anInt2984) / 20;
		}
		if (((Class302) this).anInt3062 < ((Class302) this).anInt3063 && ((Class302) this).anInt3062 / 20 < i)
			i = ((Class302) this).anInt3062 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_3_ = 0; i_3_ < 10; i_3_++) {
			if (((Class302) this).aClass292Array3060[i_3_] != null)
				((Class292) ((Class302) this).aClass292Array3060[i_3_]).anInt2984 -= i * 20;
		}
		if (((Class302) this).anInt3062 < ((Class302) this).anInt3063) {
			((Class302) this).anInt3062 -= i * 20;
			((Class302) this).anInt3063 -= i * 20;
		}
		return i;
	}

	final byte[] method2984() {
		int i = 0;
		for (int i_4_ = 0; i_4_ < 10; i_4_++) {
			if (((Class302) this).aClass292Array3060[i_4_] != null && ((((Class292) ((Class302) this).aClass292Array3060[i_4_]).anInt2996) + (((Class292) ((Class302) this).aClass292Array3060[i_4_]).anInt2984)) > i)
				i = ((((Class292) ((Class302) this).aClass292Array3060[i_4_]).anInt2996) + (((Class292) ((Class302) this).aClass292Array3060[i_4_]).anInt2984));
		}
		if (i == 0)
			return new byte[0];
		int i_5_ = 22050 * i / 1000;
		byte[] is = new byte[i_5_];
		for (int i_6_ = 0; i_6_ < 10; i_6_++) {
			if (((Class302) this).aClass292Array3060[i_6_] != null) {
				int i_7_ = ((((Class292) ((Class302) this).aClass292Array3060[i_6_]).anInt2996) * 22050 / 1000);
				int i_8_ = ((((Class292) ((Class302) this).aClass292Array3060[i_6_]).anInt2984) * 22050 / 1000);
				int[] is_9_ = (((Class302) this).aClass292Array3060[i_6_].method2909(i_7_, ((Class292) (((Class302) this).aClass292Array3060[i_6_])).anInt2996));
				for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
					int i_11_ = is[i_10_ + i_8_] + (is_9_[i_10_] >> 8);
					if ((i_11_ + 128 & ~0xff) != 0)
						i_11_ = i_11_ >> 31 ^ 0x7f;
					is[i_10_ + i_8_] = (byte) i_11_;
				}
			}
		}
		return is;
	}
}
