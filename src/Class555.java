/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class555 {
	int anInt6379;
	WeakReference_Sub1[] aWeakReference_Sub1Array6380;
	ReferenceQueue aReferenceQueue6381 = new ReferenceQueue();
	public static int[] anIntArray6382;
	static Class8 aClass8_6383;
	static int anInt6384;

	public void method6396(Object object, Object object_0_, byte i) {
		try {
			if (null == object)
				throw new NullPointerException();
			method6399(-118291727);
			int i_1_ = System.identityHashCode(object);
			int i_2_ = i_1_ & (((Class555) this).aWeakReference_Sub1Array6380.length - 1);
			WeakReference_Sub1 weakreference_sub1 = ((Class555) this).aWeakReference_Sub1Array6380[i_2_];
			if (weakreference_sub1 == null) {
				((Class555) this).aWeakReference_Sub1Array6380[i_2_] = new WeakReference_Sub1(object, (((Class555) this).aReferenceQueue6381), i_1_, object_0_);
				((Class555) this).anInt6379 += -1607317737;
				if (((Class555) this).anInt6379 * 1991073959 >= ((Class555) this).aWeakReference_Sub1Array6380.length)
					method6398(-1470707170);
			} else {
				for (;;) {
					if (weakreference_sub1.get() == object) {
						if (i < 0)
							break;
						break;
					}
					if ((((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438) == null) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438 = new WeakReference_Sub1(object, (((Class555) this).aReferenceQueue6381), i_1_, object_0_);
						((Class555) this).anInt6379 += -1607317737;
						if (((Class555) this).anInt6379 * 1991073959 >= (((Class555) this).aWeakReference_Sub1Array6380).length)
							method6398(-1470707170);
						break;
					}
					weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wz.r(").append(')').toString());
		}
	}

	public void method6397(Object object, int i) {
		try {
			if (object == null)
				throw new NullPointerException();
			method6399(-282229675);
			int i_3_ = System.identityHashCode(object);
			int i_4_ = i_3_ & (((Class555) this).aWeakReference_Sub1Array6380.length - 1);
			WeakReference_Sub1 weakreference_sub1 = ((Class555) this).aWeakReference_Sub1Array6380[i_4_];
			if (weakreference_sub1 != null) {
				if (weakreference_sub1.get() == object) {
					((Class555) this).aWeakReference_Sub1Array6380[i_4_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438);
					((Class555) this).anInt6379 -= -1607317737;
				} else {
					for (;;) {
						WeakReference_Sub1 weakreference_sub1_5_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438);
						if (null == weakreference_sub1_5_) {
							if (i != -1956893969)
								throw new IllegalStateException();
							break;
						}
						if (weakreference_sub1_5_.get() == object) {
							((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438 = (((WeakReference_Sub1) weakreference_sub1_5_).aWeakReference_Sub1_6438);
							((Class555) this).anInt6379 -= -1607317737;
							break;
						}
						weakreference_sub1 = weakreference_sub1_5_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wz.j(").append(')').toString());
		}
	}

	void method6398(int i) {
		try {
			WeakReference_Sub1[] weakreference_sub1s = ((Class555) this).aWeakReference_Sub1Array6380;
			((Class555) this).aWeakReference_Sub1Array6380 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
			WeakReference_Sub1[] weakreference_sub1s_6_ = weakreference_sub1s;
			for (int i_7_ = 0; i_7_ < weakreference_sub1s_6_.length; i_7_++) {
				WeakReference_Sub1 weakreference_sub1_8_;
				for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_6_[i_7_]; weakreference_sub1 != null; weakreference_sub1 = weakreference_sub1_8_) {
					weakreference_sub1_8_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438);
					int i_9_ = ((((WeakReference_Sub1) weakreference_sub1).anInt6439 * 962057247) & (((Class555) this).aWeakReference_Sub1Array6380).length - 1);
					((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438 = ((Class555) this).aWeakReference_Sub1Array6380[i_9_];
					((Class555) this).aWeakReference_Sub1Array6380[i_9_] = weakreference_sub1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wz.p(").append(')').toString());
		}
	}

	void method6399(int i) {
		try {
			for (;;) {
				WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class555) this).aReferenceQueue6381.poll());
				if (null == weakreference_sub1)
					break;
				int i_10_ = ((((WeakReference_Sub1) weakreference_sub1).anInt6439 * 962057247) & (((Class555) this).aWeakReference_Sub1Array6380.length - 1));
				WeakReference_Sub1 weakreference_sub1_11_ = ((Class555) this).aWeakReference_Sub1Array6380[i_10_];
				if (weakreference_sub1_11_ == weakreference_sub1) {
					((Class555) this).aWeakReference_Sub1Array6380[i_10_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438);
					((Class555) this).anInt6379 -= -1607317737;
				} else {
					for (/**/; (weakreference_sub1_11_ != null && ((((WeakReference_Sub1) weakreference_sub1_11_).aWeakReference_Sub1_6438) != weakreference_sub1)); weakreference_sub1_11_ = (((WeakReference_Sub1) weakreference_sub1_11_).aWeakReference_Sub1_6438)) {
						/* empty */
					}
					if (weakreference_sub1_11_ != null) {
						((WeakReference_Sub1) weakreference_sub1_11_).aWeakReference_Sub1_6438 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438);
						((Class555) this).anInt6379 -= -1607317737;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wz.o(").append(')').toString());
		}
	}

	public Class555() {
		((Class555) this).aWeakReference_Sub1Array6380 = new WeakReference_Sub1[16];
	}

	public ArrayList method6400(byte i) {
		try {
			method6399(-1322691468);
			ArrayList arraylist = new ArrayList(1991073959 * ((Class555) this).anInt6379);
			WeakReference_Sub1[] weakreference_sub1s = ((Class555) this).aWeakReference_Sub1Array6380;
			for (int i_12_ = 0; i_12_ < weakreference_sub1s.length; i_12_++) {
				for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_12_]; weakreference_sub1 != null; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_6438)) {
					Object object = weakreference_sub1.get();
					if (null != object)
						arraylist.add(object);
				}
			}
			return arraylist;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wz.i(").append(')').toString());
		}
	}

	static final void method6401(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean9123 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wz.uu(").append(')').toString());
		}
	}

	static final void method6402(Class430 class430, int i) {
		try {
			int i_13_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class354.method4100(i_13_ >> 14 & 0x3fff, i_13_ & 0x3fff);
			if (null == class330_sub36_sub12)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class330_sub36_sub12.anInt9708 * -1647784587;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wz.aeh(").append(')').toString());
		}
	}
}
