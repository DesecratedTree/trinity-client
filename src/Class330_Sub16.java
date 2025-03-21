/* Class330_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

public class Class330_Sub16 extends Class330 {
	int[] anIntArray7611;
	Class_xa_Sub1 aClass_xa_Sub1_7612;
	Class_ra_Sub1 aClass_ra_Sub1_7613;
	Class34_Sub1 aClass34_Sub1_7614;
	Class77 aClass77_7615;
	Class44 aClass44_7616;
	int anInt7617;
	float aFloat7618;
	NativeHeapBuffer aNativeHeapBuffer7619;
	Stream aStream7620;

	void method3336(int i, int i_0_, int i_1_, float f) {
		if (((Class330_Sub16) this).anInt7617 != -1) {
			Class56 class56 = (((Class330_Sub16) this).aClass_ra_Sub1_7613.anInterface_ma4227.method221(((Class330_Sub16) this).anInt7617, 1823902150));
			int i_2_ = class56.aByte529 & 0xff;
			if (i_2_ != 0 && class56.aByte525 != 4) {
				int i_3_;
				if (i_1_ < 0)
					i_3_ = 0;
				else if (i_1_ > 127)
					i_3_ = 16777215;
				else
					i_3_ = 131586 * i_1_;
				if (i_2_ == 256)
					i_0_ = i_3_;
				else {
					int i_4_ = i_2_;
					int i_5_ = 256 - i_2_;
					i_0_ = (((i_3_ & 0xff00ff) * i_4_ + (i_0_ & 0xff00ff) * i_5_ & ~0xff00ff) + ((i_3_ & 0xff00) * i_4_ + (i_0_ & 0xff00) * i_5_ & 0xff0000)) >> 8;
				}
			}
			int i_6_ = class56.aByte534 & 0xff;
			if (i_6_ != 0) {
				i_6_ += 256;
				int i_7_ = ((i_0_ & 0xff0000) >> 16) * i_6_;
				if (i_7_ > 65535)
					i_7_ = 65535;
				int i_8_ = ((i_0_ & 0xff00) >> 8) * i_6_;
				if (i_8_ > 65535)
					i_8_ = 65535;
				int i_9_ = (i_0_ & 0xff) * i_6_;
				if (i_9_ > 65535)
					i_9_ = 65535;
				i_0_ = (i_7_ << 8 & 0xff0000) + (i_8_ & 0xff00) + (i_9_ >> 8);
			}
		}
		if (f != 1.0F) {
			int i_10_ = i_0_ >> 16 & 0xff;
			int i_11_ = i_0_ >> 8 & 0xff;
			int i_12_ = i_0_ & 0xff;
			i_10_ *= f;
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ > 255)
				i_10_ = 255;
			i_11_ *= f;
			if (i_11_ < 0)
				i_11_ = 0;
			else if (i_11_ > 255)
				i_11_ = 255;
			i_12_ *= f;
			if (i_12_ < 0)
				i_12_ = 0;
			else if (i_12_ > 255)
				i_12_ = 255;
			i_0_ = i_10_ << 16 | i_11_ << 8 | i_12_;
		}
		((Class330_Sub16) this).aStream7620.i(i * 4);
		((Class330_Sub16) this).aStream7620.p((byte) (i_0_ >> 16));
		((Class330_Sub16) this).aStream7620.p((byte) (i_0_ >> 8));
		((Class330_Sub16) this).aStream7620.p((byte) i_0_);
	}

	void method3337(int i) {
		((Class330_Sub16) this).aNativeHeapBuffer7619 = ((Class_ra_Sub1) ((Class330_Sub16) this).aClass_ra_Sub1_7613).aNativeHeap8308.j(i * 4, true);
		((Class330_Sub16) this).aStream7620 = new Stream(((Class330_Sub16) this).aNativeHeapBuffer7619);
	}

	void method3338(int i) {
		((Class330_Sub16) this).aStream7620.i(i * 4 + 3);
		((Class330_Sub16) this).aStream7620.p(-1);
	}

	void method3339(int i, int i_13_, int i_14_) {
		((Class330_Sub16) this).anIntArray7611[i_13_ * (((Class330_Sub16) this).aClass_xa_Sub1_7612.anInt6397 * 1972554729) + i] |= 1 << i_14_;
	}

	void method3340(int[] is, int i) {
		int i_15_ = 0;
		Class330_Sub46_Sub1 class330_sub46_sub1 = (((Class_ra_Sub1) ((Class330_Sub16) this).aClass_ra_Sub1_7613).aClass330_Sub46_Sub1_8381);
		class330_sub46_sub1.offset = 0;
		if (((Class_ra_Sub1) ((Class330_Sub16) this).aClass_ra_Sub1_7613).aBoolean8407) {
			for (int i_16_ = 0; i_16_ < i; i_16_++) {
				int i_17_ = is[i_16_];
				short[] is_18_ = (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aShortArrayArray8756[i_17_]);
				int i_19_ = ((Class330_Sub16) this).anIntArray7611[i_17_];
				if (i_19_ != 0 && is_18_ != null) {
					int i_20_ = 0;
					int i_21_ = 0;
					while (i_21_ < is_18_.length) {
						if ((i_19_ & 1 << i_20_++) != 0) {
							class330_sub46_sub1.addShort((is_18_[i_21_++] & 0xffff), (byte) 107);
							i_15_++;
							class330_sub46_sub1.addShort((is_18_[i_21_++] & 0xffff), (byte) 22);
							i_15_++;
							class330_sub46_sub1.addShort((is_18_[i_21_++] & 0xffff), (byte) 106);
							i_15_++;
						} else
							i_21_ += 3;
					}
				}
			}
		} else {
			for (int i_22_ = 0; i_22_ < i; i_22_++) {
				int i_23_ = is[i_22_];
				short[] is_24_ = (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aShortArrayArray8756[i_23_]);
				int i_25_ = ((Class330_Sub16) this).anIntArray7611[i_23_];
				if (i_25_ != 0 && is_24_ != null) {
					int i_26_ = 0;
					int i_27_ = 0;
					while (i_27_ < is_24_.length) {
						if ((i_25_ & 1 << i_26_++) != 0) {
							class330_sub46_sub1.method3742((is_24_[i_27_++] & 0xffff), (short) 21964);
							i_15_++;
							class330_sub46_sub1.method3742((is_24_[i_27_++] & 0xffff), (short) 7752);
							i_15_++;
							class330_sub46_sub1.method3742((is_24_[i_27_++] & 0xffff), (short) 1523);
							i_15_++;
						} else
							i_27_ += 3;
					}
				}
			}
		}
		if (i_15_ > 0) {
			((Class330_Sub16) this).aClass34_Sub1_7614.method42(5123, class330_sub46_sub1.payload, class330_sub46_sub1.offset * -824785231);
			((Class330_Sub16) this).aClass_ra_Sub1_7613.method4869((((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aClass44_8777), (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aClass44_8767), ((Class330_Sub16) this).aClass44_7616, (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aClass44_8780));
			((Class330_Sub16) this).aClass_ra_Sub1_7613.method4842(((Class330_Sub16) this).anInt7617, (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).anInt8761 & 0x7) != 0, (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).anInt8761 & 0x8) != 0);
			if (((Class_ra_Sub1) ((Class330_Sub16) this).aClass_ra_Sub1_7613).aBoolean8388)
				((Class330_Sub16) this).aClass_ra_Sub1_7613.dz(2147483647, ((Class330_Sub16) this).aClass77_7615);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / ((Class330_Sub16) this).aFloat7618, 1.0F / ((Class330_Sub16) this).aFloat7618, 1.0F);
			OpenGL.glMatrixMode(5888);
			((Class330_Sub16) this).aClass_ra_Sub1_7613.method4869((((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aClass44_8777), (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aClass44_8767), ((Class330_Sub16) this).aClass44_7616, (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aClass44_8780));
			((Class330_Sub16) this).aClass_ra_Sub1_7613.method4837(((Class330_Sub16) this).aClass34_Sub1_7614, 4, 0, i_15_);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

	void method3341(int i) {
		((Class330_Sub16) this).aStream7620.f();
		Interface1 interface1 = (((Class330_Sub16) this).aClass_ra_Sub1_7613.method4872(4, ((Class330_Sub16) this).aNativeHeapBuffer7619, i * 4, false));
		if (interface1 instanceof Class46_Sub1)
			((Class330_Sub16) this).aNativeHeapBuffer7619.n();
		((Class330_Sub16) this).aClass44_7616 = new Class44(interface1, 5121, 4, 0);
		((Class330_Sub16) this).aNativeHeapBuffer7619 = null;
		((Class330_Sub16) this).aStream7620 = null;
	}

	Class330_Sub16(Class_xa_Sub1 class_xa_sub1, int i, int i_28_, Class77 class77) {
		((Class330_Sub16) this).aClass_xa_Sub1_7612 = class_xa_sub1;
		((Class330_Sub16) this).aClass_ra_Sub1_7613 = (((Class_xa_Sub1) ((Class330_Sub16) this).aClass_xa_Sub1_7612).aClass_ra_Sub1_8757);
		((Class330_Sub16) this).anInt7617 = i;
		((Class330_Sub16) this).aFloat7618 = (float) i_28_;
		((Class330_Sub16) this).aClass77_7615 = class77;
		((Class330_Sub16) this).anIntArray7611 = new int[(((Class330_Sub16) this).aClass_xa_Sub1_7612.anInt6397 * 1972554729 * (((Class330_Sub16) this).aClass_xa_Sub1_7612.anInt6393 * 24567321))];
		((Class330_Sub16) this).aClass34_Sub1_7614 = new Class34_Sub1(((Class330_Sub16) this).aClass_ra_Sub1_7613, 5123, null, 1);
	}
}
