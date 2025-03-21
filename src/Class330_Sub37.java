/* Class330_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class330_Sub37 extends Class330 {
	int anInt7738 = 0;
	Class_xa_Sub2 aClass_xa_Sub2_7739;
	int anInt7740;
	float aFloat7741;
	Class_ra_Sub2 aClass_ra_Sub2_7742;
	Interface9_Impl1 anInterface9_Impl1_7743;
	int[] anIntArray7744;
	Class77 aClass77_7745;
	int anInt7746 = 0;
	int anInt7747 = 0;
	int anInt7748 = 0;
	long aLong7749;

	void method3535(int[] is, int i) {
		((Class330_Sub37) this).anInt7746 = 0;
		((Class330_Sub37) this).anInt7747 = 32767;
		((Class330_Sub37) this).anInt7748 = -32768;
		ByteBuffer bytebuffer = ((Class330_Sub37) this).aClass_ra_Sub2_7742.aByteBuffer8458;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = is[i_0_];
			short[] is_2_ = (((Class_xa_Sub2) ((Class330_Sub37) this).aClass_xa_Sub2_7739).aShortArrayArray8798[i_1_]);
			int i_3_ = ((Class330_Sub37) this).anIntArray7744[i_1_];
			if (i_3_ != 0 && is_2_ != null) {
				int i_4_ = 0;
				int i_5_ = 0;
				while (i_5_ < is_2_.length) {
					if ((i_3_ & 1 << i_4_++) != 0) {
						for (int i_6_ = 0; i_6_ < 3; i_6_++) {
							int i_7_ = is_2_[i_5_++] & 0xffff;
							if (i_7_ > ((Class330_Sub37) this).anInt7748)
								((Class330_Sub37) this).anInt7748 = i_7_;
							if (i_7_ < ((Class330_Sub37) this).anInt7747)
								((Class330_Sub37) this).anInt7747 = i_7_;
							bytebuffer.putShort((short) i_7_);
						}
						((Class330_Sub37) this).anInt7746 += 3;
					} else
						i_5_ += 3;
				}
			}
		}
	}

	void method3536(int i) {
		((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) (i * 4) + 3L, (byte) -1);
	}

	void method3537(int i) {
		((Class330_Sub37) this).aLong7749 = ((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.allocateMemory((long) (i * 4));
		for (int i_8_ = 3; i_8_ < i * 4; i_8_ += 4)
			((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) i_8_, (byte) 0);
	}

	void method3538(int i) {
		((Class330_Sub37) this).anInterface9_Impl1_7743 = ((Class330_Sub37) this).aClass_ra_Sub2_7742.method4976(false);
		((Class330_Sub37) this).anInterface9_Impl1_7743.method142(i * 4, 4);
		((Class330_Sub37) this).anInterface9_Impl1_7743.method97(0, i * 4, ((Class330_Sub37) this).aLong7749);
		((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.freeMemory(((Class330_Sub37) this).aLong7749);
	}

	void method3539(int i, int i_9_, int i_10_, float f) {
		if (((Class330_Sub37) this).anInt7740 != -1) {
			Class56 class56 = (((Class330_Sub37) this).aClass_ra_Sub2_7742.anInterface_ma4227.method221(((Class330_Sub37) this).anInt7740, 1653191935));
			int i_11_ = class56.aByte529 & 0xff;
			if (i_11_ != 0 && class56.aByte525 != 4) {
				int i_12_;
				if (i_10_ < 0)
					i_12_ = 0;
				else if (i_10_ > 127)
					i_12_ = 16777215;
				else
					i_12_ = 131586 * i_10_;
				if (i_11_ == 256)
					i_9_ = i_12_;
				else {
					int i_13_ = i_11_;
					int i_14_ = 256 - i_11_;
					i_9_ = ((((i_12_ & 0xff00ff) * i_13_ + (i_9_ & 0xff00ff) * i_14_) & ~0xff00ff) + (((i_12_ & 0xff00) * i_13_ + (i_9_ & 0xff00) * i_14_) & 0xff0000)) >> 8;
				}
			}
			int i_15_ = class56.aByte534 & 0xff;
			if (i_15_ != 0) {
				i_15_ += 256;
				int i_16_ = ((i_9_ & 0xff0000) >> 16) * i_15_;
				if (i_16_ > 65535)
					i_16_ = 65535;
				int i_17_ = ((i_9_ & 0xff00) >> 8) * i_15_;
				if (i_17_ > 65535)
					i_17_ = 65535;
				int i_18_ = (i_9_ & 0xff) * i_15_;
				if (i_18_ > 65535)
					i_18_ = 65535;
				i_9_ = (i_16_ << 8 & 0xff0000) + (i_17_ & 0xff00) + (i_18_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_19_ = i_9_ >> 16 & 0xff;
			int i_20_ = i_9_ >> 8 & 0xff;
			int i_21_ = i_9_ & 0xff;
			i_19_ *= f;
			if (i_19_ < 0)
				i_19_ = 0;
			else if (i_19_ > 255)
				i_19_ = 255;
			i_20_ *= f;
			if (i_20_ < 0)
				i_20_ = 0;
			else if (i_20_ > 255)
				i_20_ = 255;
			i_21_ *= f;
			if (i_21_ < 0)
				i_21_ = 0;
			else if (i_21_ > 255)
				i_21_ = 255;
			i_9_ = i_19_ << 16 | i_20_ << 8 | i_21_;
		}
		if ((((Class_ra_Sub2) ((Class330_Sub37) this).aClass_ra_Sub2_7742).anInt8591) == 0) {
			((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) (i * 4) + 0L, (byte) (i_9_ >> 16));
			((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) (i * 4) + 1L, (byte) (i_9_ >> 8));
			((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) (i * 4) + 2L, (byte) i_9_);
		} else {
			((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) (i * 4) + 0L, (byte) i_9_);
			((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) (i * 4) + 1L, (byte) (i_9_ >> 8));
			((Class330_Sub37) this).aClass_ra_Sub2_7742.anUnsafe8461.putByte(((Class330_Sub37) this).aLong7749 + (long) (i * 4) + 2L, (byte) (i_9_ >> 16));
		}
	}

	void method3540(int i, int i_22_, int i_23_) {
		((Class330_Sub37) this).anIntArray7744[i_22_ * (((Class330_Sub37) this).aClass_xa_Sub2_7739.anInt6397 * 1972554729) + i] |= 1 << i_23_;
		((Class330_Sub37) this).anInt7738++;
	}

	Class330_Sub37(Class_xa_Sub2 class_xa_sub2, int i, int i_24_, Class77 class77) {
		((Class330_Sub37) this).aClass_xa_Sub2_7739 = class_xa_sub2;
		((Class330_Sub37) this).aClass_ra_Sub2_7742 = (((Class_xa_Sub2) ((Class330_Sub37) this).aClass_xa_Sub2_7739).aClass_ra_Sub2_8791);
		((Class330_Sub37) this).anInt7740 = i;
		((Class330_Sub37) this).aFloat7741 = (float) i_24_;
		((Class330_Sub37) this).aClass77_7745 = class77;
		((Class330_Sub37) this).anIntArray7744 = new int[(((Class330_Sub37) this).aClass_xa_Sub2_7739.anInt6397 * 1972554729 * (((Class330_Sub37) this).aClass_xa_Sub2_7739.anInt6393 * 24567321))];
		byte i_25_ = 10;
		if (i >= 0) {
			Class56 class56 = ((Class330_Sub37) this).aClass_ra_Sub2_7742.anInterface_ma4227.method221(i, -1952499394);
			if (class56.aByte525 > 0)
				i_25_ = class56.aByte525;
		}
		((Class330_Sub37) this).aClass_ra_Sub2_7742.method4894(i_25_);
		((Class330_Sub37) this).aClass_ra_Sub2_7742.method4894(3);
	}
}
