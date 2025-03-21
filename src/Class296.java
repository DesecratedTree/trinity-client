/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.util.Arrays;

public class Class296 {
	static int anInt3021 = 286331153;
	int anInt3022;
	public static boolean aBoolean3023;
	public static int anInt3024 = 256;
	static Class291 aClass291_3025;
	int anInt3026;
	long aLong3027;
	int[] anIntArray3028;
	boolean aBoolean3029 = false;
	Class330_Sub40 aClass330_Sub40_3030;
	int anInt3031;
	static boolean aBoolean3032 = false;
	int anInt3033;
	static int anInt3034 = 16384;
	int anInt3035;
	long aLong3036;
	long aLong3037;
	int anInt3038;
	static int anInt3039;
	boolean aBoolean3040;
	int anInt3041 = 32;
	static int anInt3042 = 3;
	int anInt3043;
	static int anInt3044 = 2;
	static int anInt3045 = 4;
	static int anInt3046 = 8;
	public static int anInt3047;
	Class330_Sub40[] aClass330_Sub40Array3048;
	Class330_Sub40[] aClass330_Sub40Array3049;

	public final synchronized void method2932() {
		if (!((Class296) this).aBoolean3029) {
			long l = Class312.method3111((byte) 38);
			try {
				if (l > ((Class296) this).aLong3037 + 6000L)
					((Class296) this).aLong3037 = l - 6000L;
				for (/**/; l > ((Class296) this).aLong3037 + 5000L; l = Class312.method3111((byte) 89)) {
					method2942(256);
					((Class296) this).aLong3037 += (long) (256000 / anInt3047);
				}
			} catch (Exception exception) {
				((Class296) this).aLong3037 = l;
			}
			if (((Class296) this).anIntArray3028 != null) {
				try {
					if (((Class296) this).aLong3036 != 0L) {
						if (l < ((Class296) this).aLong3036)
							return;
						method2949(((Class296) this).anInt3033);
						((Class296) this).aLong3036 = 0L;
						((Class296) this).aBoolean3040 = true;
					}
					int i = method2940();
					if (((Class296) this).anInt3031 - i > ((Class296) this).anInt3043)
						((Class296) this).anInt3043 = ((Class296) this).anInt3031 - i;
					int i_0_ = (((Class296) this).anInt3022 + ((Class296) this).anInt3035);
					if (i_0_ + 256 > 16384)
						i_0_ = 16128;
					if (i_0_ + 256 > ((Class296) this).anInt3033) {
						((Class296) this).anInt3033 += 1024;
						if (((Class296) this).anInt3033 > 16384)
							((Class296) this).anInt3033 = 16384;
						method2945(false);
						method2949(((Class296) this).anInt3033);
						i = 0;
						((Class296) this).aBoolean3040 = true;
						if (i_0_ + 256 > ((Class296) this).anInt3033) {
							i_0_ = ((Class296) this).anInt3033 - 256;
							((Class296) this).anInt3035 = i_0_ - ((Class296) this).anInt3022;
						}
					}
					for (/**/; i < i_0_; i += 256) {
						method2947(((Class296) this).anIntArray3028, 256);
						method2948();
					}
					if (l > ((Class296) this).aLong3027) {
						if (!((Class296) this).aBoolean3040) {
							if (((Class296) this).anInt3043 == 0 && ((Class296) this).anInt3038 == 0) {
								method2945(false);
								((Class296) this).aLong3036 = l + 2000L;
								return;
							}
							((Class296) this).anInt3035 = Math.min(((Class296) this).anInt3038, ((Class296) this).anInt3043);
							((Class296) this).anInt3038 = ((Class296) this).anInt3043;
						} else
							((Class296) this).aBoolean3040 = false;
						((Class296) this).anInt3043 = 0;
						((Class296) this).aLong3027 = l + 2000L;
					}
					((Class296) this).anInt3031 = i;
				} catch (Exception exception) {
					method2945(false);
					((Class296) this).aLong3036 = l + 2000L;
				}
			}
		}
	}

	public static final void method2933(int i, boolean bool, int i_1_) {
		if (i < 8000 || i > 48000)
			throw new IllegalArgumentException();
		anInt3047 = i;
		aBoolean3023 = bool;
		anInt3039 = i_1_;
	}

	public static final Class296 method2934(Component component, int i, int i_2_) {
		if (anInt3047 == 0)
			throw new IllegalStateException();
		if (i < 0 || i >= 2)
			throw new IllegalArgumentException();
		int i_3_ = i_2_;
		if (i_3_ < 256)
			i_3_ = 256;
		do {
			if (!aBoolean3032) {
				Class296_Sub1 class296_sub1;
				try {
					Class296_Sub1 class296_sub1_4_ = new Class296_Sub1();
					((Class296) class296_sub1_4_).anIntArray3028 = new int[256 * (aBoolean3023 ? 2 : 1)];
					((Class296) class296_sub1_4_).anInt3022 = i_3_;
					class296_sub1_4_.method2944(component);
					((Class296) class296_sub1_4_).anInt3033 = (i_3_ & ~0x3ff) + 1024;
					if (((Class296) class296_sub1_4_).anInt3033 > 16384)
						((Class296) class296_sub1_4_).anInt3033 = 16384;
					class296_sub1_4_.method2949(((Class296) class296_sub1_4_).anInt3033);
					if (anInt3039 > 0 && aClass291_3025 == null) {
						aClass291_3025 = new Class291_Sub1();
						Thread thread = new Thread(aClass291_3025);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(anInt3039);
					}
					if (aClass291_3025 != null) {
						if (((Class291) aClass291_3025).aClass296Array2977[i] != null)
							throw new IllegalArgumentException();
						((Class291) aClass291_3025).aClass296Array2977[i] = class296_sub1_4_;
					}
					class296_sub1 = class296_sub1_4_;
				} catch (Throwable throwable) {
					break;
				}
				return class296_sub1;
			}
		} while (false);
		return new Class296();
	}

	public final synchronized void method2935(Class330_Sub40 class330_sub40) {
		((Class296) this).aClass330_Sub40_3030 = class330_sub40;
	}

	public final synchronized void method2936() {
		((Class296) this).aBoolean3040 = true;
		try {
			method2946();
		} catch (Exception exception) {
			method2945(false);
			((Class296) this).aLong3036 = Class312.method3111((byte) 123) + 2000L;
		}
	}

	public final synchronized void method2937() {
		method2938(false);
		method2945(true);
		((Class296) this).anIntArray3028 = null;
		((Class296) this).aBoolean3029 = true;
	}

	final synchronized void method2938(boolean bool) {
		if (aClass291_3025 != null) {
			boolean bool_5_ = true;
			for (int i = 0; i < 2; i++) {
				if (bool || (((Class291) aClass291_3025).aClass296Array2977[i] == this))
					((Class291) aClass291_3025).aClass296Array2977[i] = null;
				if (((Class291) aClass291_3025).aClass296Array2977[i] != null)
					bool_5_ = false;
			}
			if (bool_5_) {
				((Class291) aClass291_3025).aBoolean2975 = true;
				while (((Class291) aClass291_3025).aBoolean2976)
					Class464_Sub21.method5813(50L);
				aClass291_3025 = null;
			}
		}
	}

	void method2939() {
		method2938(true);
		((Class296) this).anIntArray3028 = null;
		((Class296) this).aBoolean3029 = true;
		aBoolean3032 = true;
	}

	int method2940() throws Exception {
		return ((Class296) this).anInt3033;
	}

	final void method2941(Class330_Sub40 class330_sub40, int i) {
		int i_6_ = i >> 5;
		Class330_Sub40 class330_sub40_7_ = ((Class296) this).aClass330_Sub40Array3049[i_6_];
		if (class330_sub40_7_ == null)
			((Class296) this).aClass330_Sub40Array3048[i_6_] = class330_sub40;
		else
			((Class330_Sub40) class330_sub40_7_).aClass330_Sub40_7771 = class330_sub40;
		((Class296) this).aClass330_Sub40Array3049[i_6_] = class330_sub40;
		((Class330_Sub40) class330_sub40).anInt7769 = i;
	}

	final void method2942(int i) {
		((Class296) this).anInt3026 -= i;
		if (((Class296) this).anInt3026 < 0)
			((Class296) this).anInt3026 = 0;
		if (((Class296) this).aClass330_Sub40_3030 != null)
			((Class296) this).aClass330_Sub40_3030.method3555(i);
	}

	static final void method2943(Class330_Sub40 class330_sub40) {
		((Class330_Sub40) class330_sub40).aBoolean7768 = false;
		if (((Class330_Sub40) class330_sub40).aClass330_Sub29_7770 != null)
			((Class330_Sub29) ((Class330_Sub40) class330_sub40).aClass330_Sub29_7770).anInt7720 = 0;
		for (Class330_Sub40 class330_sub40_8_ = class330_sub40.method3552(); class330_sub40_8_ != null; class330_sub40_8_ = class330_sub40.method3550())
			method2943(class330_sub40_8_);
	}

	void method2944(Component component) throws Exception {
		/* empty */
	}

	void method2945(boolean bool) {
		/* empty */
	}

	void method2946() throws Exception {
		/* empty */
	}

	final void method2947(int[] is, int i) {
		int i_9_ = i;
		if (aBoolean3023)
			i_9_ <<= 1;
		Arrays.fill(is, 0, i_9_, 0);
		((Class296) this).anInt3026 -= i;
		if (((Class296) this).aClass330_Sub40_3030 != null && ((Class296) this).anInt3026 <= 0) {
			((Class296) this).anInt3026 += anInt3047 >> 4;
			method2943(((Class296) this).aClass330_Sub40_3030);
			method2941(((Class296) this).aClass330_Sub40_3030, ((Class296) this).aClass330_Sub40_3030.method3551());
			int i_10_ = 0;
			int i_11_ = 255;
			int i_12_ = 7;
			while_78_: while (i_11_ != 0) {
				int i_13_;
				int i_14_;
				if (i_12_ < 0) {
					i_13_ = i_12_ & 0x3;
					i_14_ = -(i_12_ >> 2);
				} else {
					i_13_ = i_12_;
					i_14_ = 0;
				}
				for (int i_15_ = i_11_ >>> i_13_ & 0x11111111; i_15_ != 0; i_15_ >>>= 4) {
					if ((i_15_ & 0x1) != 0) {
						i_11_ &= 1 << i_13_ ^ 0xffffffff;
						Class330_Sub40 class330_sub40 = null;
						Class330_Sub40 class330_sub40_16_ = (((Class296) this).aClass330_Sub40Array3048[i_13_]);
						while (class330_sub40_16_ != null) {
							Class330_Sub29 class330_sub29 = (((Class330_Sub40) class330_sub40_16_).aClass330_Sub29_7770);
							if (class330_sub29 != null && (((Class330_Sub29) class330_sub29).anInt7720 > i_14_)) {
								i_11_ |= 1 << i_13_;
								class330_sub40 = class330_sub40_16_;
								class330_sub40_16_ = (((Class330_Sub40) class330_sub40_16_).aClass330_Sub40_7771);
							} else {
								((Class330_Sub40) class330_sub40_16_).aBoolean7768 = true;
								int i_17_ = class330_sub40_16_.method3562();
								i_10_ += i_17_;
								if (class330_sub29 != null)
									((Class330_Sub29) class330_sub29).anInt7720 += i_17_;
								if (i_10_ >= ((Class296) this).anInt3041)
									break while_78_;
								Class330_Sub40 class330_sub40_18_ = class330_sub40_16_.method3552();
								if (class330_sub40_18_ != null) {
									int i_19_ = (((Class330_Sub40) class330_sub40_16_).anInt7769);
									for (/**/; class330_sub40_18_ != null; class330_sub40_18_ = class330_sub40_16_.method3550())
										method2941(class330_sub40_18_, (i_19_ * class330_sub40_18_.method3551() >> 8));
								}
								Class330_Sub40 class330_sub40_20_ = (((Class330_Sub40) class330_sub40_16_).aClass330_Sub40_7771);
								((Class330_Sub40) class330_sub40_16_).aClass330_Sub40_7771 = null;
								if (class330_sub40 == null)
									((Class296) this).aClass330_Sub40Array3048[i_13_] = class330_sub40_20_;
								else
									((Class330_Sub40) class330_sub40).aClass330_Sub40_7771 = class330_sub40_20_;
								if (class330_sub40_20_ == null)
									((Class296) this).aClass330_Sub40Array3049[i_13_] = class330_sub40;
								class330_sub40_16_ = class330_sub40_20_;
							}
						}
					}
					i_13_ += 4;
					i_14_++;
				}
				i_12_--;
			}
			for (i_12_ = 0; i_12_ < 8; i_12_++) {
				Class330_Sub40 class330_sub40 = ((Class296) this).aClass330_Sub40Array3048[i_12_];
				Class330_Sub40[] class330_sub40s = ((Class296) this).aClass330_Sub40Array3048;
				int i_21_ = i_12_;
				((Class296) this).aClass330_Sub40Array3049[i_12_] = null;
				class330_sub40s[i_21_] = null;
				Class330_Sub40 class330_sub40_22_;
				for (/**/; class330_sub40 != null; class330_sub40 = class330_sub40_22_) {
					class330_sub40_22_ = (((Class330_Sub40) class330_sub40).aClass330_Sub40_7771);
					((Class330_Sub40) class330_sub40).aClass330_Sub40_7771 = null;
				}
			}
		}
		if (((Class296) this).anInt3026 < 0)
			((Class296) this).anInt3026 = 0;
		if (((Class296) this).aClass330_Sub40_3030 != null)
			((Class296) this).aClass330_Sub40_3030.method3564(is, 0, i);
		((Class296) this).aLong3037 = Class312.method3111((byte) 5);
	}

	void method2948() throws Exception {
		/* empty */
	}

	Class296() {
		((Class296) this).aLong3037 = Class312.method3111((byte) 106);
		((Class296) this).aLong3036 = 0L;
		((Class296) this).anInt3043 = 0;
		((Class296) this).anInt3038 = 0;
		((Class296) this).anInt3031 = 0;
		((Class296) this).aLong3027 = 0L;
		((Class296) this).aBoolean3040 = true;
		((Class296) this).anInt3026 = 0;
		((Class296) this).aClass330_Sub40Array3048 = new Class330_Sub40[8];
		((Class296) this).aClass330_Sub40Array3049 = new Class330_Sub40[8];
	}

	void method2949(int i) throws Exception {
		/* empty */
	}
}
