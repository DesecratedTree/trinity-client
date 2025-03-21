/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class182 {
	int anInt1790;
	int anInt1791;
	Class_ra_Sub2 aClass_ra_Sub2_1792;
	Interface11_Impl3 anInterface11_Impl3_1793;
	boolean aBoolean1794 = true;
	static int anInt1795 = 7;
	Interface9_Impl2 anInterface9_Impl2_1796;
	int anInt1797 = -1;
	int anInt1798;
	Class183 aClass183_1799;
	static int anInt1800 = 128;
	int anInt1801;
	int anInt1802;
	int[] anIntArray1803;
	byte[] aByteArray1804;

	Class182(Class_ra_Sub2 class_ra_sub2, Class183 class183, Class_xa_Sub2 class_xa_sub2, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		((Class182) this).aClass_ra_Sub2_1792 = class_ra_sub2;
		((Class182) this).aClass183_1799 = class183;
		((Class182) this).anInt1790 = i_2_;
		((Class182) this).anInt1791 = i_3_;
		int i_4_ = 1 << i_1_;
		int i_5_ = 0;
		int i_6_ = i << i_1_;
		int i_7_ = i_0_ << i_1_;
		for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
			int i_9_ = ((i_7_ + i_8_) * (class_xa_sub2.anInt6397 * 1972554729) + i_6_);
			for (int i_10_ = 0; i_10_ < i_4_; i_10_++) {
				short[] is = (((Class_xa_Sub2) class_xa_sub2).aShortArrayArray8798[i_9_++]);
				if (is != null)
					i_5_ += is.length;
			}
		}
		if (i_5_ > 0) {
			((Class182) this).anInt1802 = -2147483648;
			((Class182) this).anInt1801 = 2147483647;
			((Class182) this).anInterface9_Impl2_1796 = ((Class182) this).aClass_ra_Sub2_1792.method4975(false);
			((Class182) this).anInterface9_Impl2_1796.method148(i_5_);
			ByteBuffer bytebuffer = ((Class182) this).aClass_ra_Sub2_1792.aByteBuffer8458;
			bytebuffer.clear();
			for (int i_11_ = 0; i_11_ < i_4_; i_11_++) {
				int i_12_ = ((i_7_ + i_11_) * (class_xa_sub2.anInt6397 * 1972554729) + i_6_);
				for (int i_13_ = 0; i_13_ < i_4_; i_13_++) {
					short[] is = (((Class_xa_Sub2) class_xa_sub2).aShortArrayArray8798[i_12_++]);
					if (is != null) {
						for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
							int i_15_ = is[i_14_] & 0xffff;
							if (i_15_ < ((Class182) this).anInt1801)
								((Class182) this).anInt1801 = i_15_;
							if (i_15_ > ((Class182) this).anInt1802)
								((Class182) this).anInt1802 = i_15_;
							bytebuffer.putShort((short) i_15_);
						}
					}
				}
			}
			((Class182) this).anInterface9_Impl2_1796.method97(0, bytebuffer.position(), ((Class182) this).aClass_ra_Sub2_1792.aLong8459);
			((Class182) this).anInt1798 = i_5_ / 3;
		} else {
			((Class182) this).anInt1798 = 0;
			((Class182) this).anInterface11_Impl3_1793 = null;
		}
	}

	void method2063(Class140 class140) {
		method2064(class140, ((Class182) this).anInterface9_Impl2_1796, 0, ((Class182) this).anInt1798);
	}

	void method2064(Class140 class140, Interface9_Impl2 interface9_impl2, int i, int i_16_) {
		if (i_16_ > 0) {
			method2065();
			((Class182) this).aClass_ra_Sub2_1792.method4979(interface9_impl2);
			class140.anInterface11_Impl3_1540 = ((Class182) this).anInterface11_Impl3_1793;
			class140.anInt1555 = ((Class182) this).anInt1801;
			class140.anInt1556 = (((Class182) this).anInt1802 - ((Class182) this).anInt1801 + 1);
			class140.anInt1557 = i;
			class140.anInt1552 = i_16_;
			class140.method1619(false);
		}
	}

	void method2065() {
		if (((Class182) this).aBoolean1794) {
			((Class182) this).aBoolean1794 = false;
			byte[] is = ((Class183) ((Class182) this).aClass183_1799).aByteArray1809;
			int i = 0;
			int i_17_ = ((Class183) ((Class182) this).aClass183_1799).anInt1807;
			int i_18_ = (((Class182) this).anInt1790 + (((Class182) this).anInt1791 * (((Class183) ((Class182) this).aClass183_1799).anInt1807)));
			for (int i_19_ = -128; i_19_ < 0; i_19_++) {
				i = (i << 8) - i;
				for (int i_20_ = -128; i_20_ < 0; i_20_++) {
					if (is[i_18_++] != 0)
						i++;
				}
				i_18_ += i_17_ - 128;
			}
			if (((Class182) this).anInterface11_Impl3_1793 != null && ((Class182) this).anInt1797 == i)
				((Class182) this).aBoolean1794 = false;
			else {
				((Class182) this).anInt1797 = i;
				int i_21_ = 0;
				i_18_ = (((Class182) this).anInt1790 + ((Class182) this).anInt1791 * i_17_);
				if (((Class182) this).aClass_ra_Sub2_1792.method5006(Class72.aClass72_611, Class86.aClass86_714)) {
					if (((Class182) this).aByteArray1804 == null)
						((Class182) this).aByteArray1804 = new byte[16384];
					byte[] is_22_ = ((Class182) this).aByteArray1804;
					for (int i_23_ = -128; i_23_ < 0; i_23_++) {
						for (int i_24_ = -128; i_24_ < 0; i_24_++) {
							if (is[i_18_] != 0)
								is_22_[i_21_++] = (byte) 68;
							else {
								int i_25_ = 0;
								if (is[i_18_ - 1] != 0)
									i_25_++;
								if (is[i_18_ + 1] != 0)
									i_25_++;
								if (is[i_18_ - i_17_] != 0)
									i_25_++;
								if (is[i_18_ + i_17_] != 0)
									i_25_++;
								is_22_[i_21_++] = (byte) (17 * i_25_);
							}
							i_18_++;
						}
						i_18_ += (((Class183) ((Class182) this).aClass183_1799).anInt1807) - 128;
					}
					if (((Class182) this).anInterface11_Impl3_1793 == null) {
						((Class182) this).anInterface11_Impl3_1793 = (((Class182) this).aClass_ra_Sub2_1792.method4945(Class72.aClass72_611, 128, 128, false, ((Class182) this).aByteArray1804));
						((Class182) this).anInterface11_Impl3_1793.method109(false, false);
					} else
						((Class182) this).anInterface11_Impl3_1793.method117(0, 0, 128, 128, ((Class182) this).aByteArray1804, Class72.aClass72_611, 0, 128);
				} else {
					if (((Class182) this).anIntArray1803 == null)
						((Class182) this).anIntArray1803 = new int[16384];
					int[] is_26_ = ((Class182) this).anIntArray1803;
					for (int i_27_ = -128; i_27_ < 0; i_27_++) {
						for (int i_28_ = -128; i_28_ < 0; i_28_++) {
							if (is[i_18_] != 0)
								is_26_[i_21_++] = 1140850688;
							else {
								int i_29_ = 0;
								if (is[i_18_ - 1] != 0)
									i_29_++;
								if (is[i_18_ + 1] != 0)
									i_29_++;
								if (is[i_18_ - i_17_] != 0)
									i_29_++;
								if (is[i_18_ + i_17_] != 0)
									i_29_++;
								is_26_[i_21_++] = 17 * i_29_ << 24;
							}
							i_18_++;
						}
						i_18_ += (((Class183) ((Class182) this).aClass183_1799).anInt1807) - 128;
					}
					if (((Class182) this).anInterface11_Impl3_1793 == null) {
						((Class182) this).anInterface11_Impl3_1793 = (((Class182) this).aClass_ra_Sub2_1792.method4944(128, 128, false, ((Class182) this).anIntArray1803));
						((Class182) this).anInterface11_Impl3_1793.method109(false, false);
					} else
						((Class182) this).anInterface11_Impl3_1793.method118(0, 0, 128, 128, ((Class182) this).anIntArray1803, 0, 128);
				}
			}
		}
	}
}
