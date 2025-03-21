/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class491 {
	public int anInt5855;
	public int anInt5856;
	public int anInt5857;
	public boolean aBoolean5858;
	public boolean aBoolean5859;
	int anInt5860 = 0;
	public int anInt5861;
	public int anInt5862;
	public int anInt5863;

	void method6072(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(-194729773);
				if (i_0_ == 0) {
					if (i == 1632830751) {
						/* empty */
					}
					break;
				}
				method6073(class330_sub46, i_0_, -1483301317);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uh.r(").append(')').toString());
		}
	}

	void method6073(Buffer class330_sub46, int i, int i_1_) {
		try {
			if (1 == i) {
				((Class491) this).anInt5860 = class330_sub46.readUnsignedTriByte(-1401356047) * -417963973;
				method6074(-561678093 * ((Class491) this).anInt5860, (byte) 122);
			} else if (2 == i) {
				anInt5856 = class330_sub46.readUnsignedShort(910537626) * -1852616681;
				if (883877799 * anInt5856 == 65535)
					anInt5856 = 1852616681;
			} else if (3 == i)
				anInt5857 = (class330_sub46.readUnsignedShort(-58779536) << 2) * -557854203;
			else if (4 == i)
				aBoolean5858 = false;
			else if (5 == i)
				aBoolean5859 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uh.j(").append(')').toString());
		}
	}

	void method6074(int i, byte i_2_) {
		try {
			double d = (double) (i >> 16 & 0xff) / 256.0;
			double d_3_ = (double) (i >> 8 & 0xff) / 256.0;
			double d_4_ = (double) (i & 0xff) / 256.0;
			double d_5_ = d;
			if (d_3_ < d_5_)
				d_5_ = d_3_;
			if (d_4_ < d_5_)
				d_5_ = d_4_;
			double d_6_ = d;
			if (d_3_ > d_6_)
				d_6_ = d_3_;
			if (d_4_ > d_6_)
				d_6_ = d_4_;
			double d_7_ = 0.0;
			double d_8_ = 0.0;
			double d_9_ = (d_6_ + d_5_) / 2.0;
			if (d_6_ != d_5_) {
				if (d_9_ < 0.5)
					d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_);
				if (d_9_ >= 0.5)
					d_8_ = (d_6_ - d_5_) / (2.0 - d_6_ - d_5_);
				if (d == d_6_)
					d_7_ = (d_3_ - d_4_) / (d_6_ - d_5_);
				else if (d_6_ == d_3_)
					d_7_ = 2.0 + (d_4_ - d) / (d_6_ - d_5_);
				else if (d_4_ == d_6_)
					d_7_ = 4.0 + (d - d_3_) / (d_6_ - d_5_);
			}
			d_7_ /= 6.0;
			anInt5861 = 939057933 * (int) (256.0 * d_8_);
			anInt5862 = (int) (256.0 * d_9_) * -1585730393;
			if (anInt5861 * -1366776891 < 0)
				anInt5861 = 0;
			else if (anInt5861 * -1366776891 > 255)
				anInt5861 = -1058395661;
			if (anInt5862 * -2143339753 < 0)
				anInt5862 = 0;
			else if (-2143339753 * anInt5862 > 255)
				anInt5862 = -634324391;
			if (d_9_ > 0.5)
				anInt5863 = 346867157 * (int) (d_8_ * (1.0 - d_9_) * 512.0);
			else
				anInt5863 = (int) (512.0 * (d_9_ * d_8_)) * 346867157;
			if (-201962627 * anInt5863 < 1)
				anInt5863 = 346867157;
			anInt5855 = -1888178821 * (int) (d_7_ * (double) (anInt5863 * -201962627));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uh.i(").append(')').toString());
		}
	}

	Class491() {
		anInt5856 = 1852616681;
		anInt5857 = 2141456896;
		aBoolean5858 = true;
		aBoolean5859 = true;
	}

	public static void method6075(int i) {
		try {
			Class391.aClass497_4062 = new Class497(8);
			Class391.anInt4061 = 0;
			Iterator iterator = Class391.aList4056.iterator();
			while (iterator.hasNext()) {
				Class388 class388 = (Class388) iterator.next();
				class388.method4564();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uh.p(").append(')').toString());
		}
	}

	static final void method6076(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1329 * -1036156047;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uh.pk(").append(')').toString());
		}
	}
}
