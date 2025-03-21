/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30 {
	int anInt340;
	Class_ra_Sub1 aClass_ra_Sub1_341;
	boolean aBoolean342 = true;
	Class58 aClass58_343;
	static int anInt344 = 128;
	int anInt345;
	Class36_Sub1 aClass36_Sub1_346;
	int anInt347 = -1;
	int anInt348;
	Interface3 anInterface3_349;
	Class34_Sub1 aClass34_Sub1_350;
	static int anInt351 = 7;

	void method498() {
		method501(((Class30) this).anInterface3_349, ((Class30) this).anInt348);
	}

	void method499() {
		if (((Class30) this).aBoolean342) {
			((Class30) this).aBoolean342 = false;
			byte[] is = ((Class58) ((Class30) this).aClass58_343).aByteArray546;
			byte[] is_0_ = (((Class_ra_Sub1) ((Class30) this).aClass_ra_Sub1_341).aByteArray8444);
			int i = 0;
			int i_1_ = ((Class58) ((Class30) this).aClass58_343).anInt544;
			int i_2_ = (((Class30) this).anInt340 + (((Class30) this).anInt345 * ((Class58) ((Class30) this).aClass58_343).anInt544));
			for (int i_3_ = -128; i_3_ < 0; i_3_++) {
				i = (i << 8) - i;
				for (int i_4_ = -128; i_4_ < 0; i_4_++) {
					if (is[i_2_++] != 0)
						i++;
				}
				i_2_ += i_1_ - 128;
			}
			if (((Class30) this).aClass36_Sub1_346 != null && ((Class30) this).anInt347 == i)
				((Class30) this).aBoolean342 = false;
			else {
				((Class30) this).anInt347 = i;
				int i_5_ = 0;
				i_2_ = (((Class30) this).anInt340 + ((Class30) this).anInt345 * i_1_);
				for (int i_6_ = -128; i_6_ < 0; i_6_++) {
					for (int i_7_ = -128; i_7_ < 0; i_7_++) {
						if (is[i_2_] != 0)
							is_0_[i_5_++] = (byte) 68;
						else {
							int i_8_ = 0;
							if (is[i_2_ - 1] != 0)
								i_8_++;
							if (is[i_2_ + 1] != 0)
								i_8_++;
							if (is[i_2_ - i_1_] != 0)
								i_8_++;
							if (is[i_2_ + i_1_] != 0)
								i_8_++;
							is_0_[i_5_++] = (byte) (17 * i_8_);
						}
						i_2_++;
					}
					i_2_ += (((Class58) ((Class30) this).aClass58_343).anInt544 - 128);
				}
				if (((Class30) this).aClass36_Sub1_346 == null) {
					((Class30) this).aClass36_Sub1_346 = new Class36_Sub1(((Class30) this).aClass_ra_Sub1_341, 3553, Class72.aClass72_611, Class86.aClass86_714, 128, 128, false, (((Class_ra_Sub1) (((Class30) this).aClass_ra_Sub1_341)).aByteArray8444), Class72.aClass72_611, false);
					((Class30) this).aClass36_Sub1_346.method518(false, false);
					((Class30) this).aClass36_Sub1_346.method515(true);
				} else
					((Class30) this).aClass36_Sub1_346.method519(0, 0, 128, 128, (((Class_ra_Sub1) ((Class30) this).aClass_ra_Sub1_341).aByteArray8444), Class72.aClass72_611, 0, 0, false);
			}
		}
	}

	void method500(byte[] is, int i) {
		((Class30) this).aClass34_Sub1_350.method42(5123, is, i * 2);
		method501(((Class30) this).aClass34_Sub1_350, i);
	}

	Class30(Class_ra_Sub1 class_ra_sub1, Class58 class58, Class_xa_Sub1 class_xa_sub1, int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class30) this).aClass_ra_Sub1_341 = class_ra_sub1;
		((Class30) this).aClass58_343 = class58;
		((Class30) this).anInt340 = i_11_;
		((Class30) this).anInt345 = i_12_;
		int i_13_ = 1 << i_10_;
		int i_14_ = 0;
		int i_15_ = i << i_10_;
		int i_16_ = i_9_ << i_10_;
		for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
			int i_18_ = ((i_16_ + i_17_) * (class_xa_sub1.anInt6397 * 1972554729) + i_15_);
			for (int i_19_ = 0; i_19_ < i_13_; i_19_++) {
				short[] is = (((Class_xa_Sub1) class_xa_sub1).aShortArrayArray8756[i_18_++]);
				if (is != null)
					i_14_ += is.length;
			}
		}
		((Class30) this).anInt348 = i_14_;
		if (i_14_ > 0) {
			Buffer class330_sub46 = new Buffer(i_14_ * 2);
			if (((Class_ra_Sub1) ((Class30) this).aClass_ra_Sub1_341).aBoolean8407) {
				for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
					int i_21_ = ((i_16_ + i_20_) * (class_xa_sub1.anInt6397 * 1972554729) + i_15_);
					for (int i_22_ = 0; i_22_ < i_13_; i_22_++) {
						short[] is = (((Class_xa_Sub1) class_xa_sub1).aShortArrayArray8756[i_21_++]);
						if (is != null) {
							for (int i_23_ = 0; i_23_ < is.length; i_23_++)
								class330_sub46.addShort(is[i_23_] & 0xffff, (byte) 54);
						}
					}
				}
			} else {
				for (int i_24_ = 0; i_24_ < i_13_; i_24_++) {
					int i_25_ = ((i_16_ + i_24_) * (class_xa_sub1.anInt6397 * 1972554729) + i_15_);
					for (int i_26_ = 0; i_26_ < i_13_; i_26_++) {
						short[] is = (((Class_xa_Sub1) class_xa_sub1).aShortArrayArray8756[i_25_++]);
						if (is != null) {
							for (int i_27_ = 0; i_27_ < is.length; i_27_++)
								class330_sub46.method3742(is[i_27_] & 0xffff, (short) -3992);
						}
					}
				}
			}
			((Class30) this).anInterface3_349 = (((Class30) this).aClass_ra_Sub1_341.method4834(5123, class330_sub46.payload, class330_sub46.offset * -824785231, false));
			((Class30) this).aClass34_Sub1_350 = new Class34_Sub1(((Class30) this).aClass_ra_Sub1_341, 5123, null, 1);
		} else
			((Class30) this).aClass36_Sub1_346 = null;
	}

	void method501(Interface3 interface3, int i) {
		if (i != 0) {
			method499();
			((Class30) this).aClass_ra_Sub1_341.method4844(((Class30) this).aClass36_Sub1_346);
			((Class30) this).aClass_ra_Sub1_341.method4837(interface3, 4, 0, i);
		}
	}
}
