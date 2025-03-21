/* Class_xa_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class_xa_Sub2 extends Class_xa {
	static int anInt8789 = 74;
	int anInt8790;
	Class_ra_Sub2 aClass_ra_Sub2_8791;
	int anInt8792;
	int[][][] anIntArrayArrayArray8793;
	int anInt8794;
	int anInt8795;
	int anInt8796;
	Class330[] aClass330Array8797;
	short[][] aShortArrayArray8798;
	float aFloat8799 = 3.4028235E38F;
	float aFloat8800 = -3.4028235E38F;
	Class330_Sub37[][][] aClass330_Sub37ArrayArrayArray8801;
	int[][][] anIntArrayArrayArray8802;
	byte[][] aByteArrayArray8803;
	Class471 aClass471_8804 = new Class471();
	int[][][] anIntArrayArrayArray8805;
	Interface9_Impl1 anInterface9_Impl1_8806;
	int[][][] anIntArrayArrayArray8807;
	byte[][] aByteArrayArray8808;
	Class183 aClass183_8809;
	Class184 aClass184_8810;
	Class330[] aClass330Array8811;
	Interface9_Impl1 anInterface9_Impl1_8812;
	int[][][] anIntArrayArrayArray8813;
	int[][][] anIntArrayArrayArray8814;
	int anInt8815;
	int anInt8816;
	float[][] aFloatArrayArray8817;
	int anInt8818;
	static int anInt8819 = 1;
	float[][] aFloatArrayArray8820;
	Class497 aClass497_8821;
	float[][] aFloatArrayArray8822;
	int anInt8823;
	long aLong8824;
	long aLong8825;
	long aLong8826;
	int anInt8827;
	int[] anIntArray8828 = new int[1];
	int[] anIntArray8829 = new int[1];
	int anInt8830;
	int[] anIntArray8831 = new int[1];

	public void LA(int i, int i_0_, int i_1_) {
		if ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_0_] & 0xff) < i_1_)
			((Class_xa_Sub2) this).aByteArrayArray8803[i][i_0_] = (byte) i_1_;
	}

	public void n(int i, int i_2_, int i_3_) {
		if ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_2_] & 0xff) < i_3_)
			((Class_xa_Sub2) this).aByteArrayArray8803[i][i_2_] = (byte) i_3_;
	}

	public void method6426(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub2) this).aClass471_8804.method5878(new Class330_Sub27(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, this, class330_sub14, is), (short) 8192);
	}

	public void SA() {
		if (((Class_xa_Sub2) this).anInt8815 <= 0) {
			((Class_xa_Sub2) this).aClass183_8809 = null;
			method6438();
		} else {
			byte[][] is = (new byte[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1]);
			for (int i = 1; i < anInt6397 * 1972554729; i++) {
				for (int i_4_ = 1; i_4_ < anInt6393 * 24567321; i_4_++)
					is[i][i_4_] = (byte) (((((Class_xa_Sub2) this).aByteArrayArray8803[i - 1][i_4_]) >> 2) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i + 1][i_4_]) >> 3) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_4_ - 1]) >> 2) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_4_ + 1]) >> 3) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_4_]) >> 1));
			}
			((Class_xa_Sub2) this).aClass330Array8797 = new Class330[((Class_xa_Sub2) this).aClass497_8821.method6096(1533245757)];
			((Class_xa_Sub2) this).aClass497_8821.method6093(((Class_xa_Sub2) this).aClass330Array8797, -87003541);
			for (int i = 0; i < ((Class_xa_Sub2) this).aClass330Array8797.length; i++)
				((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i]).method3537(((Class_xa_Sub2) this).anInt8815);
			((Class_xa_Sub2) this).anInt8827 = 20;
			if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
				((Class_xa_Sub2) this).anInt8827 += 4;
			if ((((Class_xa_Sub2) this).anInt8795 & 0x7) != 0)
				((Class_xa_Sub2) this).anInt8827 += 12;
			((Class_xa_Sub2) this).aLong8826 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anUnsafe8461.allocateMemory((long) (((Class_xa_Sub2) this).anInt8815 * 4 + (((Class_xa_Sub2) this).anInt8815 * ((Class_xa_Sub2) this).anInt8827))));
			((Class_xa_Sub2) this).aLong8824 = ((Class_xa_Sub2) this).aLong8826;
			((Class_xa_Sub2) this).aLong8825 = (((Class_xa_Sub2) this).aLong8826 + (long) (((Class_xa_Sub2) this).anInt8815 * 4));
			Class330_Sub37[] class330_sub37s = new Class330_Sub37[((Class_xa_Sub2) this).anInt8815];
			int i = Class385.method4425(((Class_xa_Sub2) this).anInt8815 / 4, (short) 17119);
			if (i < 1)
				i = 1;
			Class497 class497 = new Class497(i);
			Class330_Sub37[] class330_sub37s_5_ = new Class330_Sub37[((Class_xa_Sub2) this).anInt8818];
			for (int i_6_ = 0; i_6_ < anInt6397 * 1972554729; i_6_++) {
				for (int i_7_ = 0; i_7_ < anInt6393 * 24567321; i_7_++)
					method6441(i_6_, i_7_, is, class330_sub37s_5_, class497, class330_sub37s);
			}
			for (int i_8_ = 0; i_8_ < ((Class_xa_Sub2) this).anInt8796; i_8_++) {
				Class330_Sub37 class330_sub37 = class330_sub37s[i_8_];
				if (class330_sub37 != null)
					class330_sub37.method3536(i_8_);
			}
			for (int i_9_ = 0; i_9_ < anInt6397 * 1972554729; i_9_++) {
				for (int i_10_ = 0; i_10_ < anInt6393 * 24567321; i_10_++) {
					short[] is_11_ = (((Class_xa_Sub2) this).aShortArrayArray8798[i_10_ * (anInt6397 * 1972554729) + i_9_]);
					if (is_11_ != null) {
						int i_12_ = 0;
						int i_13_ = 0;
						while (i_13_ < is_11_.length) {
							int i_14_ = is_11_[i_13_++] & 0xffff;
							int i_15_ = is_11_[i_13_++] & 0xffff;
							int i_16_ = is_11_[i_13_++] & 0xffff;
							Class330_Sub37 class330_sub37 = class330_sub37s[i_14_];
							Class330_Sub37 class330_sub37_17_ = class330_sub37s[i_15_];
							Class330_Sub37 class330_sub37_18_ = class330_sub37s[i_16_];
							Class330_Sub37 class330_sub37_19_ = null;
							if (class330_sub37 != null) {
								class330_sub37.method3540(i_9_, i_10_, i_12_);
								class330_sub37_19_ = class330_sub37;
							}
							if (class330_sub37_17_ != null) {
								class330_sub37_17_.method3540(i_9_, i_10_, i_12_);
								if (class330_sub37_19_ == null || ((class330_sub37_17_.aLong3341 * -6154793640677333111L) < (class330_sub37_19_.aLong3341 * -6154793640677333111L)))
									class330_sub37_19_ = class330_sub37_17_;
							}
							if (class330_sub37_18_ != null) {
								class330_sub37_18_.method3540(i_9_, i_10_, i_12_);
								if (class330_sub37_19_ == null || ((class330_sub37_18_.aLong3341 * -6154793640677333111L) < (class330_sub37_19_.aLong3341 * -6154793640677333111L)))
									class330_sub37_19_ = class330_sub37_18_;
							}
							if (class330_sub37_19_ != null) {
								if (class330_sub37 != null)
									class330_sub37_19_.method3536(i_14_);
								if (class330_sub37_17_ != null)
									class330_sub37_19_.method3536(i_15_);
								if (class330_sub37_18_ != null)
									class330_sub37_19_.method3536(i_16_);
								class330_sub37_19_.method3540(i_9_, i_10_, i_12_);
							}
							i_12_++;
						}
					}
				}
			}
			((Class_xa_Sub2) this).anInt8823 = 0;
			for (int i_20_ = 0; i_20_ < ((Class_xa_Sub2) this).aClass330Array8797.length; i_20_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i_20_]);
				if (((Class330_Sub37) class330_sub37).anInt7738 > 0)
					((Class_xa_Sub2) this).aClass330Array8797[((Class_xa_Sub2) this).anInt8823++] = class330_sub37;
			}
			((Class_xa_Sub2) this).aClass330Array8811 = new Class330[((Class_xa_Sub2) this).anInt8823];
			long[] ls = new long[((Class_xa_Sub2) this).anInt8823];
			for (int i_21_ = 0; i_21_ < ((Class_xa_Sub2) this).anInt8823; i_21_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i_21_]);
				ls[i_21_] = class330_sub37.aLong3341 * -6154793640677333111L;
				((Class_xa_Sub2) this).aClass330Array8811[i_21_] = class330_sub37;
			}
			Class330_Sub40_Sub1.method3584(ls, (((Class_xa_Sub2) this).aClass330Array8811), (byte) 16);
			method6440();
		}
	}

	void method6438() {
		if ((((Class_xa_Sub2) this).anInt8794 & 0x2) == 0) {
			((Class_xa_Sub2) this).anIntArrayArrayArray8805 = null;
			((Class_xa_Sub2) this).anIntArrayArrayArray8813 = null;
			((Class_xa_Sub2) this).anIntArrayArrayArray8802 = null;
		}
		((Class_xa_Sub2) this).anIntArrayArrayArray8807 = null;
		((Class_xa_Sub2) this).anIntArrayArrayArray8814 = null;
		((Class_xa_Sub2) this).anIntArrayArrayArray8793 = null;
		((Class_xa_Sub2) this).aClass330_Sub37ArrayArrayArray8801 = null;
		((Class_xa_Sub2) this).aByteArrayArray8803 = null;
		((Class_xa_Sub2) this).aClass497_8821 = null;
		((Class_xa_Sub2) this).aClass330Array8797 = null;
		((Class_xa_Sub2) this).aFloatArrayArray8820 = null;
		((Class_xa_Sub2) this).aFloatArrayArray8817 = null;
		((Class_xa_Sub2) this).aFloatArrayArray8822 = null;
	}

	public void method6423(int i, int i_22_, int i_23_, boolean[][] bools, boolean bool, int i_24_) {
		if (((Class_xa_Sub2) this).aClass330Array8811 != null) {
			int i_25_ = i_23_ + i_23_ + 1;
			i_25_ *= i_25_;
			if (((Class_xa_Sub2) this).anIntArray8831.length < i_25_)
				((Class_xa_Sub2) this).anIntArray8831 = new int[i_25_];
			int i_26_ = i - i_23_;
			int i_27_ = i_26_;
			if (i_26_ < 0)
				i_26_ = 0;
			int i_28_ = i_22_ - i_23_;
			int i_29_ = i_28_;
			if (i_28_ < 0)
				i_28_ = 0;
			int i_30_ = i + i_23_;
			if (i_30_ > anInt6397 * 1972554729 - 1)
				i_30_ = anInt6397 * 1972554729 - 1;
			int i_31_ = i_22_ + i_23_;
			if (i_31_ > anInt6393 * 24567321 - 1)
				i_31_ = anInt6393 * 24567321 - 1;
			((Class_xa_Sub2) this).anInt8830 = 0;
			for (int i_32_ = i_26_; i_32_ <= i_30_; i_32_++) {
				boolean[] bools_33_ = bools[i_32_ - i_27_];
				for (int i_34_ = i_28_; i_34_ <= i_31_; i_34_++) {
					if (bools_33_[i_34_ - i_29_])
						((Class_xa_Sub2) this).anIntArray8831[((Class_xa_Sub2) this).anInt8830++] = i_34_ * (anInt6397 * 1972554729) + i_32_;
				}
			}
			ByteBuffer bytebuffer = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aByteBuffer8458;
			bytebuffer.clear();
			for (int i_35_ = 0; i_35_ < ((Class_xa_Sub2) this).aClass330Array8811.length; i_35_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8811[i_35_]);
				class330_sub37.method3535((((Class_xa_Sub2) this).anIntArray8831), ((Class_xa_Sub2) this).anInt8830);
			}
			int i_36_ = bytebuffer.position();
			Class140 class140 = (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aClass140_8474);
			if (i_36_ != 0) {
				Interface9_Impl2 interface9_impl2 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4909(i_36_ / 2);
				interface9_impl2.method97(0, i_36_, (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aLong8459));
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5013();
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(0, ((Class_xa_Sub2) this).anInterface9_Impl1_8812);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4979(interface9_impl2);
				class140.method1618(Class249.aClass249_2630);
				if (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8578 > 0) {
					class140.aClass261_1548.method2588(0.0F, 0.0F, 1.0F, -(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8580));
					class140.aClass260_1549.method2553((float) ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8476) >> 16 & 0xff) / 255.0F, (float) ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8476) >> 8 & 0xff) / 255.0F, (float) ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8476) >> 0 & 0xff) / 255.0F);
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576.method2510(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8472);
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576.method2501();
					class140.aClass261_1548.method2589(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576);
					class140.aClass261_1548.method2583(1.0F / ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8581) - (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8580)));
				} else {
					class140.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
					class140.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
				}
				if ((((Class_xa_Sub2) this).anInt8795 & 0x7) == 0) {
					int i_37_ = 0;
					for (int i_38_ = 0; (i_38_ < ((Class_xa_Sub2) this).aClass330Array8811.length); i_38_++) {
						Class330_Sub37 class330_sub37 = (Class330_Sub37) (((Class_xa_Sub2) this).aClass330Array8811[i_38_]);
						if (((Class330_Sub37) class330_sub37).anInt7746 != 0) {
							if (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aBoolean8571) {
								((Class_xa_Sub2) this).aClass_ra_Sub2_8791.dz(0, (((Class330_Sub37) class330_sub37).aClass77_7745));
								class140.aClass261_1551.method2588(0.0F, 1.0F, 0.0F, ((float) (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8573) + ((float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt651) * -892945375) / 255.0F * (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733))));
								class140.aClass261_1551.method2583(1.0F / (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733));
								class140.aClass260_1547.method2553((float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 16 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 8 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 0 & 0xff) / 255.0F);
							} else {
								class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
								class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
							}
							boolean bool_39_ = false;
							if (((Class330_Sub37) class330_sub37).anInt7740 != -1) {
								class140.anInterface11_Impl3_1540 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass188_8552.method2093(((Class330_Sub37) class330_sub37).anInt7740));
								Class56 class56 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227.method221((((Class330_Sub37) class330_sub37).anInt7740), 103695321));
								bool_39_ = !Class376.method4368(class56.aByte525, -1575787075);
							} else
								class140.anInterface11_Impl3_1540 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface11_Impl3_8551);
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, (((Class330_Sub37) class330_sub37).anInterface9_Impl1_7743));
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
							class140.aClass249_1546.method2486(1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F, 1.0F);
							class140.anInt1555 = ((Class330_Sub37) class330_sub37).anInt7747;
							class140.anInt1556 = (((Class330_Sub37) class330_sub37).anInt7748 - (((Class330_Sub37) class330_sub37).anInt7747) + 1);
							class140.anInt1557 = i_37_;
							class140.anInt1552 = (((Class330_Sub37) class330_sub37).anInt7746 / 3);
							class140.method1619(bool_39_);
							i_37_ += ((Class330_Sub37) class330_sub37).anInt7746;
						}
					}
				} else {
					class140.aClass260_1542.method2553((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[0]), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[1]), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[2]));
					class140.aClass260_1544.method2553((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8530)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8500)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8532)));
					class140.aClass260_1543.method2553((-(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535) * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8530)), (-(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535) * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8500)), (-(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535) * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8532)));
					class140.aClass260_1553.method2553((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8530)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8500)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8532)));
					int i_40_ = 0;
					for (int i_41_ = 0; (i_41_ < ((Class_xa_Sub2) this).aClass330Array8811.length); i_41_++) {
						Class330_Sub37 class330_sub37 = (Class330_Sub37) (((Class_xa_Sub2) this).aClass330Array8811[i_41_]);
						if (((Class330_Sub37) class330_sub37).anInt7746 > 0) {
							if (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aBoolean8571) {
								((Class_xa_Sub2) this).aClass_ra_Sub2_8791.dz(0, (((Class330_Sub37) class330_sub37).aClass77_7745));
								float f = 0.15F;
								class140.aClass261_1551.method2588(0.0F, 1.0F / ((float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733) * f), 0.0F, 256.0F / ((float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733) * f));
								class140.aClass260_1547.method2553((float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 16 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 8 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 0 & 0xff) / 255.0F);
							} else {
								class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
								class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
							}
							byte i_42_ = 11;
							if (((Class330_Sub37) class330_sub37).anInt7740 != -1) {
								Class56 class56 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227.method221((((Class330_Sub37) class330_sub37).anInt7740), -297731703));
								i_42_ = class56.aByte525;
								class140.anInterface11_Impl3_1540 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass188_8552.method2093(((Class330_Sub37) class330_sub37).anInt7740));
								class140.method1617(class56);
							} else
								class140.anInterface11_Impl3_1540 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface11_Impl3_8551);
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, (((Class330_Sub37) class330_sub37).anInterface9_Impl1_7743));
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
							class140.aClass249_1546.method2486(1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F, 1.0F);
							class140.anInt1555 = ((Class330_Sub37) class330_sub37).anInt7747;
							class140.anInt1556 = (((Class330_Sub37) class330_sub37).anInt7748 - (((Class330_Sub37) class330_sub37).anInt7747) + 1);
							class140.anInt1557 = i_40_;
							class140.anInt1552 = (((Class330_Sub37) class330_sub37).anInt7746 / 3);
							switch (i_42_) {
							case 7:
								class140.aClass260_1536.method2553((((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[14]));
								class140.aClass249_1554.method2516();
								class140.anInterface11_Impl1_1550 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5012();
								class140.method1622(0);
								break;
							default:
								if (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aBoolean8571)
									class140.method1640();
								else
									class140.method1620(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aBoolean8601) && (((Class_xa_Sub2) this).anInt8795 & 0x8) != 0 && ((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass164_Sub1_Sub2_8564.method1956(220396046)) {
									Class164_Sub1_Sub2 class164_sub1_sub2 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass164_Sub1_Sub2_8564);
									if (i_42_ == 2)
										class164_sub1_sub2 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass164_Sub1_Sub2_8563);
									class164_sub1_sub2.aClass249_9454.method2510(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8493);
									class164_sub1_sub2.aClass249_9465.method2486(1.0F / (((Class330_Sub37) class330_sub37).aFloat7741 * (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt653) * -1132415489)), 1.0F / (((Class330_Sub37) class330_sub37).aFloat7741 * (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt653) * -1132415489)), 1.0F, 1.0F);
									class164_sub1_sub2.aClass260_9463.method2553((((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[14]));
									Class56 class56 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227.method221((((Class330_Sub37) class330_sub37).anInt7740), -1259117841));
									class164_sub1_sub2.anInt9459 = class56.aByte526 * -967254259;
									class164_sub1_sub2.anInt9474 = (((Class330_Sub37) class330_sub37).anInt7747) * 25568277;
									class164_sub1_sub2.anInt9475 = ((((Class330_Sub37) class330_sub37).anInt7748) - (((Class330_Sub37) class330_sub37).anInt7747) + 1) * -1024039475;
									class164_sub1_sub2.anInt9476 = i_40_ * -463050011;
									class164_sub1_sub2.anInt9449 = (((Class330_Sub37) class330_sub37).anInt7746) / 3 * -1604072367;
									class164_sub1_sub2.aClass261_9467.method2584(class140.aClass261_1551);
									class164_sub1_sub2.aClass260_9469.method2582(class140.aClass260_1547);
									class164_sub1_sub2.aClass261_9471.method2584(class140.aClass261_1548);
									class164_sub1_sub2.aClass260_9473.method2582(class140.aClass260_1549);
									class164_sub1_sub2.method1959((short) 15420);
								} else
									class140.method1620(0);
								break;
							case 1:
								class140.aClass260_1536.method2553((((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[14]));
								if (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aBoolean8571)
									class140.method1636();
								else
									class140.method1621(0);
								break;
							case 6:
								class140.method1619(!Class376.method4368(i_42_, -1871807413));
							}
							i_40_ += ((Class330_Sub37) class330_sub37).anInt7746;
						}
					}
				}
			}
			if (((Class_xa_Sub2) this).aClass183_8809 != null) {
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4970(1);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(0, ((Class_xa_Sub2) this).anInterface9_Impl1_8812);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, ((Class_xa_Sub2) this).anInterface9_Impl1_8806);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
				((Class_xa_Sub2) this).aClass183_8809.method2066(class140, i, i_22_, i_23_, bools, bool);
			}
		}
	}

	public void method6415(int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, boolean[][] bools) {
		if (((Class_xa_Sub2) this).anInt8815 > 0) {
			Interface9_Impl2 interface9_impl2 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4909(((Class_xa_Sub2) this).anInt8816);
			int i_49_ = 0;
			int i_50_ = 32767;
			int i_51_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aByteBuffer8458;
			bytebuffer.clear();
			for (int i_52_ = i_46_; i_52_ < i_48_; i_52_++) {
				int i_53_ = i_52_ * (anInt6397 * 1972554729) + i_45_;
				for (int i_54_ = i_45_; i_54_ < i_47_; i_54_++) {
					if (bools[i_54_ - i_45_][i_52_ - i_46_]) {
						short[] is = (((Class_xa_Sub2) this).aShortArrayArray8798[i_53_]);
						if (is != null) {
							for (int i_55_ = 0; i_55_ < is.length; i_55_++) {
								int i_56_ = is[i_55_] & 0xffff;
								if (i_56_ > i_51_)
									i_51_ = i_56_;
								if (i_56_ < i_50_)
									i_50_ = i_56_;
								bytebuffer.putShort((short) i_56_);
								i_49_++;
							}
						}
					}
					i_53_++;
				}
			}
			interface9_impl2.method97(0, bytebuffer.position(), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aLong8459));
			if (i_49_ > 0) {
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5013();
				Class140 class140 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass140_8474);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(0, ((Class_xa_Sub2) this).anInterface9_Impl1_8812);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, ((Class_xa_Sub2) this).anInterface9_Impl1_8806);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4979(interface9_impl2);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.cw(Class247.aClass247_2621);
				float f = (float) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4782((byte) 0).method856();
				float f_57_ = (float) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4782((byte) 0).method857();
				Class247 class247 = new Class247();
				Class247 class247_58_ = new Class247();
				class247.method2477(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class247_58_.method2463((float) i_44_ / (256.0F * (float) (anInt6395 * 550173571)), (float) -i_44_ / (256.0F * (float) (anInt6395 * 550173571)), 1.0F / (((Class_xa_Sub2) this).aFloat8800 - ((Class_xa_Sub2) this).aFloat8799));
				class247_58_.method2474((float) i - (float) (i_45_ * i_44_) / 256.0F, (float) i_43_ + (float) (i_48_ * i_44_) / 256.0F, (-((Class_xa_Sub2) this).aFloat8799 / (((Class_xa_Sub2) this).aFloat8800 - ((Class_xa_Sub2) this).aFloat8799)));
				class247_58_.method2468(2.0F / f, 2.0F / f_57_, 1.0F);
				class247_58_.method2474(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aClass247_8513.method2478(class247, class247_58_);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576.method2508(((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass247_8513);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.ci(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576);
				class140.method1618(Class249.aClass249_2630);
				class140.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
				class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
				class140.anInterface11_Impl3_1540 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface11_Impl3_8551);
				class140.aClass249_1546.method2516();
				class140.anInt1555 = i_50_;
				class140.anInt1556 = i_51_ - i_50_ + 1;
				class140.anInt1557 = 0;
				class140.anInt1552 = i_49_ / 3;
				if (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aBoolean8519) {
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.RA(false);
					class140.method1619(false);
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.RA(true);
				} else
					class140.method1619(false);
			}
		}
	}

	public Class_na w(int i, int i_59_, Class_na class_na) {
		if ((((Class_xa_Sub2) this).aByteArrayArray8808[i][i_59_] & 0x1) == 0)
			return null;
		int i_60_ = (anInt6395 * 550173571 >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_61_;
		if (class_na_sub1 != null && class_na_sub1.method3528(i_60_, i_60_)) {
			class_na_sub1_61_ = class_na_sub1;
			class_na_sub1_61_.method3525();
		} else
			class_na_sub1_61_ = new Class_na_Sub1(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, i_60_, i_60_);
		class_na_sub1_61_.method3524(0, 0, i_60_, i_60_);
		method6439(class_na_sub1_61_, i, i_59_);
		return class_na_sub1_61_;
	}

	void method6439(Class_na_Sub1 class_na_sub1, int i, int i_62_) {
		int[] is = ((Class_xa_Sub2) this).anIntArrayArrayArray8813[i][i_62_];
		int[] is_63_ = ((Class_xa_Sub2) this).anIntArrayArrayArray8805[i][i_62_];
		int i_64_ = is.length;
		if (((Class_xa_Sub2) this).anIntArray8828.length < i_64_) {
			((Class_xa_Sub2) this).anIntArray8828 = new int[i_64_];
			((Class_xa_Sub2) this).anIntArray8829 = new int[i_64_];
		}
		for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
			((Class_xa_Sub2) this).anIntArray8828[i_65_] = is[i_65_] >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).anIntArray8829[i_65_] = is_63_[i_65_] >> (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8536);
		}
		int i_66_ = 0;
		while (i_66_ < i_64_) {
			int i_67_ = ((Class_xa_Sub2) this).anIntArray8828[i_66_];
			int i_68_ = ((Class_xa_Sub2) this).anIntArray8829[i_66_++];
			int i_69_ = ((Class_xa_Sub2) this).anIntArray8828[i_66_];
			int i_70_ = ((Class_xa_Sub2) this).anIntArray8829[i_66_++];
			int i_71_ = ((Class_xa_Sub2) this).anIntArray8828[i_66_];
			int i_72_ = ((Class_xa_Sub2) this).anIntArray8829[i_66_++];
			if ((i_67_ - i_69_) * (i_70_ - i_72_) - (i_70_ - i_68_) * (i_71_ - i_69_) > 0)
				class_na_sub1.method3527(i_68_, i_70_, i_72_, i_67_, i_69_, i_71_);
		}
	}

	public boolean method6418(Class_na class_na, int i, int i_73_, int i_74_, int i_75_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 == null || class_na == null)
			return false;
		int i_76_ = (i - (i_73_ * ((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8541 >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536));
		int i_77_ = (i_74_ - (i_73_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8599) >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536));
		return ((Class_xa_Sub2) this).aClass183_8809.method2070(class_na, i_76_, i_77_);
	}

	public void UA(Class_na class_na, int i, int i_78_, int i_79_, int i_80_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_81_ = (i - (i_78_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_82_ = (i_79_ - (i_78_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2068(class_na, i_81_, i_82_);
		}
	}

	public void NA(Class_na class_na, int i, int i_83_, int i_84_, int i_85_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_86_ = (i - (i_83_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_87_ = (i_84_ - (i_83_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2069(class_na, i_86_, i_87_);
		}
	}

	public void method6420(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub2) this).aClass471_8804.method5878(new Class330_Sub27(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, this, class330_sub14, is), (short) 8192);
	}

	public boolean method6424(Class_na class_na, int i, int i_88_, int i_89_, int i_90_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 == null || class_na == null)
			return false;
		int i_91_ = (i - (i_88_ * ((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8541 >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536));
		int i_92_ = (i_89_ - (i_88_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8599) >> 8) >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536));
		return ((Class_xa_Sub2) this).aClass183_8809.method2070(class_na, i_91_, i_92_);
	}

	public void ai(Class_na class_na, int i, int i_93_, int i_94_, int i_95_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_96_ = (i - (i_93_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_97_ = (i_94_ - (i_93_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2068(class_na, i_96_, i_97_);
		}
	}

	public void b(int i, int i_98_, int i_99_) {
		if ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_98_] & 0xff) < i_99_)
			((Class_xa_Sub2) this).aByteArrayArray8803[i][i_98_] = (byte) i_99_;
	}

	public void method6419(int i, int i_100_, int[] is, int[] is_101_, int[] is_102_, int[] is_103_, int[] is_104_, int[] is_105_, int[] is_106_, int[] is_107_, Class77 class77, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227;
		if (is_103_ != null && ((Class_xa_Sub2) this).anIntArrayArrayArray8807 == null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8807 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		if (is_101_ != null && ((Class_xa_Sub2) this).anIntArrayArrayArray8793 == null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8793 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		((Class_xa_Sub2) this).anIntArrayArrayArray8813[i][i_100_] = is;
		((Class_xa_Sub2) this).anIntArrayArrayArray8805[i][i_100_] = is_102_;
		((Class_xa_Sub2) this).anIntArrayArrayArray8802[i][i_100_] = is_104_;
		((Class_xa_Sub2) this).anIntArrayArrayArray8814[i][i_100_] = is_105_;
		if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8807[i][i_100_] = is_103_;
		if (((Class_xa_Sub2) this).anIntArrayArrayArray8793 != null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8793[i][i_100_] = is_101_;
		Class330_Sub37[] class330_sub37s = (((Class_xa_Sub2) this).aClass330_Sub37ArrayArrayArray8801[i][i_100_] = new Class330_Sub37[is_104_.length]);
		for (int i_108_ = 0; i_108_ < is_104_.length; i_108_++) {
			int i_109_ = is_106_[i_108_];
			int i_110_ = is_107_[i_108_];
			if ((((Class_xa_Sub2) this).anInt8795 & 0x20) != 0 && i_109_ != -1 && interface_ma.method221(i_109_, 2097268655).aBoolean533) {
				i_110_ = 128;
				i_109_ = -1;
			}
			long l = ((long) (class77.anInt651 * -892945375) << 48 | (long) (class77.anInt650 * -348036733) << 42 | (long) (class77.anInt652 * -576105833) << 28 | (long) (i_110_ << 14) | (long) i_109_);
			Class330 class330;
			for (class330 = ((Class_xa_Sub2) this).aClass497_8821.method6094(l); class330 != null; class330 = ((Class_xa_Sub2) this).aClass497_8821.method6095(1111331497)) {
				Class330_Sub37 class330_sub37 = (Class330_Sub37) class330;
				if (((Class330_Sub37) class330_sub37).anInt7740 == i_109_ && (((Class330_Sub37) class330_sub37).aFloat7741 == (float) i_110_) && ((Class330_Sub37) class330_sub37).aClass77_7745.method925(class77, -759438844))
					break;
			}
			if (class330 == null) {
				class330_sub37s[i_108_] = new Class330_Sub37(this, i_109_, i_110_, class77);
				((Class_xa_Sub2) this).aClass497_8821.method6097(class330_sub37s[i_108_], l);
			} else
				class330_sub37s[i_108_] = (Class330_Sub37) class330;
		}
		if (bool)
			((Class_xa_Sub2) this).aByteArrayArray8808[i][i_100_] |= 0x1;
		if (is_104_.length > ((Class_xa_Sub2) this).anInt8818)
			((Class_xa_Sub2) this).anInt8818 = is_104_.length;
		((Class_xa_Sub2) this).anInt8815 += is_104_.length;
	}

	public void method6411(int i, int i_111_, int[] is, int[] is_112_, int[] is_113_, int[] is_114_, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_, int[] is_121_, Class77 class77, boolean bool) {
		int i_122_ = is_118_.length;
		int[] is_123_ = new int[i_122_ * 3];
		int[] is_124_ = new int[i_122_ * 3];
		int[] is_125_ = new int[i_122_ * 3];
		int[] is_126_ = new int[i_122_ * 3];
		int[] is_127_ = new int[i_122_ * 3];
		int[] is_128_ = new int[i_122_ * 3];
		int[] is_129_ = is_112_ != null ? new int[i_122_ * 3] : null;
		int[] is_130_ = is_114_ != null ? new int[i_122_ * 3] : null;
		int i_131_ = 0;
		for (int i_132_ = 0; i_132_ < i_122_; i_132_++) {
			int i_133_ = is_115_[i_132_];
			int i_134_ = is_116_[i_132_];
			int i_135_ = is_117_[i_132_];
			is_123_[i_131_] = is[i_133_];
			is_124_[i_131_] = is_113_[i_133_];
			is_125_[i_131_] = is_118_[i_132_];
			is_127_[i_131_] = is_120_[i_132_];
			is_128_[i_131_] = is_121_[i_132_];
			is_126_[i_131_] = is_119_ != null ? is_119_[i_132_] : is_118_[i_132_];
			if (is_112_ != null)
				is_129_[i_131_] = is_112_[i_133_];
			if (is_114_ != null)
				is_130_[i_131_] = is_114_[i_133_];
			i_131_++;
			is_123_[i_131_] = is[i_134_];
			is_124_[i_131_] = is_113_[i_134_];
			is_125_[i_131_] = is_118_[i_132_];
			is_127_[i_131_] = is_120_[i_132_];
			is_128_[i_131_] = is_121_[i_132_];
			is_126_[i_131_] = is_119_ != null ? is_119_[i_132_] : is_118_[i_132_];
			if (is_112_ != null)
				is_129_[i_131_] = is_112_[i_134_];
			if (is_114_ != null)
				is_130_[i_131_] = is_114_[i_134_];
			i_131_++;
			is_123_[i_131_] = is[i_135_];
			is_124_[i_131_] = is_113_[i_135_];
			is_125_[i_131_] = is_118_[i_132_];
			is_127_[i_131_] = is_120_[i_132_];
			is_128_[i_131_] = is_121_[i_132_];
			is_126_[i_131_] = is_119_ != null ? is_119_[i_132_] : is_118_[i_132_];
			if (is_112_ != null)
				is_129_[i_131_] = is_112_[i_135_];
			if (is_114_ != null)
				is_130_[i_131_] = is_114_[i_135_];
			i_131_++;
		}
		method6425(i, i_111_, is_123_, is_129_, is_124_, is_130_, is_125_, is_126_, is_127_, is_128_, class77, bool);
	}

	public void method6422(int i, int i_136_, int[] is, int[] is_137_, int[] is_138_, int[] is_139_, int[] is_140_, int[] is_141_, int[] is_142_, int[] is_143_, Class77 class77, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227;
		if (is_139_ != null && ((Class_xa_Sub2) this).anIntArrayArrayArray8807 == null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8807 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		if (is_137_ != null && ((Class_xa_Sub2) this).anIntArrayArrayArray8793 == null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8793 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		((Class_xa_Sub2) this).anIntArrayArrayArray8813[i][i_136_] = is;
		((Class_xa_Sub2) this).anIntArrayArrayArray8805[i][i_136_] = is_138_;
		((Class_xa_Sub2) this).anIntArrayArrayArray8802[i][i_136_] = is_140_;
		((Class_xa_Sub2) this).anIntArrayArrayArray8814[i][i_136_] = is_141_;
		if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8807[i][i_136_] = is_139_;
		if (((Class_xa_Sub2) this).anIntArrayArrayArray8793 != null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8793[i][i_136_] = is_137_;
		Class330_Sub37[] class330_sub37s = (((Class_xa_Sub2) this).aClass330_Sub37ArrayArrayArray8801[i][i_136_] = new Class330_Sub37[is_140_.length]);
		for (int i_144_ = 0; i_144_ < is_140_.length; i_144_++) {
			int i_145_ = is_142_[i_144_];
			int i_146_ = is_143_[i_144_];
			if ((((Class_xa_Sub2) this).anInt8795 & 0x20) != 0 && i_145_ != -1 && interface_ma.method221(i_145_, 1108732967).aBoolean533) {
				i_146_ = 128;
				i_145_ = -1;
			}
			long l = ((long) (class77.anInt651 * -892945375) << 48 | (long) (class77.anInt650 * -348036733) << 42 | (long) (class77.anInt652 * -576105833) << 28 | (long) (i_146_ << 14) | (long) i_145_);
			Class330 class330;
			for (class330 = ((Class_xa_Sub2) this).aClass497_8821.method6094(l); class330 != null; class330 = ((Class_xa_Sub2) this).aClass497_8821.method6095(145775766)) {
				Class330_Sub37 class330_sub37 = (Class330_Sub37) class330;
				if (((Class330_Sub37) class330_sub37).anInt7740 == i_145_ && (((Class330_Sub37) class330_sub37).aFloat7741 == (float) i_146_) && ((Class330_Sub37) class330_sub37).aClass77_7745.method925(class77, 657239472))
					break;
			}
			if (class330 == null) {
				class330_sub37s[i_144_] = new Class330_Sub37(this, i_145_, i_146_, class77);
				((Class_xa_Sub2) this).aClass497_8821.method6097(class330_sub37s[i_144_], l);
			} else
				class330_sub37s[i_144_] = (Class330_Sub37) class330;
		}
		if (bool)
			((Class_xa_Sub2) this).aByteArrayArray8808[i][i_136_] |= 0x1;
		if (is_140_.length > ((Class_xa_Sub2) this).anInt8818)
			((Class_xa_Sub2) this).anInt8818 = is_140_.length;
		((Class_xa_Sub2) this).anInt8815 += is_140_.length;
	}

	public void l(int i, int i_147_, int i_148_) {
		if ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_147_] & 0xff) < i_148_)
			((Class_xa_Sub2) this).aByteArrayArray8803[i][i_147_] = (byte) i_148_;
	}

	public void d() {
		if (((Class_xa_Sub2) this).anInt8815 <= 0) {
			((Class_xa_Sub2) this).aClass183_8809 = null;
			method6438();
		} else {
			byte[][] is = (new byte[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1]);
			for (int i = 1; i < anInt6397 * 1972554729; i++) {
				for (int i_149_ = 1; i_149_ < anInt6393 * 24567321; i_149_++)
					is[i][i_149_] = (byte) (((((Class_xa_Sub2) this).aByteArrayArray8803[i - 1][i_149_]) >> 2) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i + 1][i_149_]) >> 3) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_149_ - 1]) >> 2) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_149_ + 1]) >> 3) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_149_]) >> 1));
			}
			((Class_xa_Sub2) this).aClass330Array8797 = new Class330[((Class_xa_Sub2) this).aClass497_8821.method6096(-2067187467)];
			((Class_xa_Sub2) this).aClass497_8821.method6093(((Class_xa_Sub2) this).aClass330Array8797, -1217156764);
			for (int i = 0; i < ((Class_xa_Sub2) this).aClass330Array8797.length; i++)
				((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i]).method3537(((Class_xa_Sub2) this).anInt8815);
			((Class_xa_Sub2) this).anInt8827 = 20;
			if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
				((Class_xa_Sub2) this).anInt8827 += 4;
			if ((((Class_xa_Sub2) this).anInt8795 & 0x7) != 0)
				((Class_xa_Sub2) this).anInt8827 += 12;
			((Class_xa_Sub2) this).aLong8826 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anUnsafe8461.allocateMemory((long) (((Class_xa_Sub2) this).anInt8815 * 4 + (((Class_xa_Sub2) this).anInt8815 * ((Class_xa_Sub2) this).anInt8827))));
			((Class_xa_Sub2) this).aLong8824 = ((Class_xa_Sub2) this).aLong8826;
			((Class_xa_Sub2) this).aLong8825 = (((Class_xa_Sub2) this).aLong8826 + (long) (((Class_xa_Sub2) this).anInt8815 * 4));
			Class330_Sub37[] class330_sub37s = new Class330_Sub37[((Class_xa_Sub2) this).anInt8815];
			int i = Class385.method4425(((Class_xa_Sub2) this).anInt8815 / 4, (short) 26192);
			if (i < 1)
				i = 1;
			Class497 class497 = new Class497(i);
			Class330_Sub37[] class330_sub37s_150_ = new Class330_Sub37[((Class_xa_Sub2) this).anInt8818];
			for (int i_151_ = 0; i_151_ < anInt6397 * 1972554729; i_151_++) {
				for (int i_152_ = 0; i_152_ < anInt6393 * 24567321; i_152_++)
					method6441(i_151_, i_152_, is, class330_sub37s_150_, class497, class330_sub37s);
			}
			for (int i_153_ = 0; i_153_ < ((Class_xa_Sub2) this).anInt8796; i_153_++) {
				Class330_Sub37 class330_sub37 = class330_sub37s[i_153_];
				if (class330_sub37 != null)
					class330_sub37.method3536(i_153_);
			}
			for (int i_154_ = 0; i_154_ < anInt6397 * 1972554729; i_154_++) {
				for (int i_155_ = 0; i_155_ < anInt6393 * 24567321; i_155_++) {
					short[] is_156_ = (((Class_xa_Sub2) this).aShortArrayArray8798[i_155_ * (anInt6397 * 1972554729) + i_154_]);
					if (is_156_ != null) {
						int i_157_ = 0;
						int i_158_ = 0;
						while (i_158_ < is_156_.length) {
							int i_159_ = is_156_[i_158_++] & 0xffff;
							int i_160_ = is_156_[i_158_++] & 0xffff;
							int i_161_ = is_156_[i_158_++] & 0xffff;
							Class330_Sub37 class330_sub37 = class330_sub37s[i_159_];
							Class330_Sub37 class330_sub37_162_ = class330_sub37s[i_160_];
							Class330_Sub37 class330_sub37_163_ = class330_sub37s[i_161_];
							Class330_Sub37 class330_sub37_164_ = null;
							if (class330_sub37 != null) {
								class330_sub37.method3540(i_154_, i_155_, i_157_);
								class330_sub37_164_ = class330_sub37;
							}
							if (class330_sub37_162_ != null) {
								class330_sub37_162_.method3540(i_154_, i_155_, i_157_);
								if (class330_sub37_164_ == null || ((class330_sub37_162_.aLong3341 * -6154793640677333111L) < (class330_sub37_164_.aLong3341 * -6154793640677333111L)))
									class330_sub37_164_ = class330_sub37_162_;
							}
							if (class330_sub37_163_ != null) {
								class330_sub37_163_.method3540(i_154_, i_155_, i_157_);
								if (class330_sub37_164_ == null || ((class330_sub37_163_.aLong3341 * -6154793640677333111L) < (class330_sub37_164_.aLong3341 * -6154793640677333111L)))
									class330_sub37_164_ = class330_sub37_163_;
							}
							if (class330_sub37_164_ != null) {
								if (class330_sub37 != null)
									class330_sub37_164_.method3536(i_159_);
								if (class330_sub37_162_ != null)
									class330_sub37_164_.method3536(i_160_);
								if (class330_sub37_163_ != null)
									class330_sub37_164_.method3536(i_161_);
								class330_sub37_164_.method3540(i_154_, i_155_, i_157_);
							}
							i_157_++;
						}
					}
				}
			}
			((Class_xa_Sub2) this).anInt8823 = 0;
			for (int i_165_ = 0; i_165_ < ((Class_xa_Sub2) this).aClass330Array8797.length; i_165_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i_165_]);
				if (((Class330_Sub37) class330_sub37).anInt7738 > 0)
					((Class_xa_Sub2) this).aClass330Array8797[((Class_xa_Sub2) this).anInt8823++] = class330_sub37;
			}
			((Class_xa_Sub2) this).aClass330Array8811 = new Class330[((Class_xa_Sub2) this).anInt8823];
			long[] ls = new long[((Class_xa_Sub2) this).anInt8823];
			for (int i_166_ = 0; i_166_ < ((Class_xa_Sub2) this).anInt8823; i_166_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i_166_]);
				ls[i_166_] = class330_sub37.aLong3341 * -6154793640677333111L;
				((Class_xa_Sub2) this).aClass330Array8811[i_166_] = class330_sub37;
			}
			Class330_Sub40_Sub1.method3584(ls, (((Class_xa_Sub2) this).aClass330Array8811), (byte) 16);
			method6440();
		}
	}

	public void method6425(int i, int i_167_, int[] is, int[] is_168_, int[] is_169_, int[] is_170_, int[] is_171_, int[] is_172_, int[] is_173_, int[] is_174_, Class77 class77, boolean bool) {
		Interface_ma interface_ma = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227;
		if (is_170_ != null && ((Class_xa_Sub2) this).anIntArrayArrayArray8807 == null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8807 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		if (is_168_ != null && ((Class_xa_Sub2) this).anIntArrayArrayArray8793 == null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8793 = new int[anInt6397 * 1972554729][anInt6393 * 24567321][];
		((Class_xa_Sub2) this).anIntArrayArrayArray8813[i][i_167_] = is;
		((Class_xa_Sub2) this).anIntArrayArrayArray8805[i][i_167_] = is_169_;
		((Class_xa_Sub2) this).anIntArrayArrayArray8802[i][i_167_] = is_171_;
		((Class_xa_Sub2) this).anIntArrayArrayArray8814[i][i_167_] = is_172_;
		if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8807[i][i_167_] = is_170_;
		if (((Class_xa_Sub2) this).anIntArrayArrayArray8793 != null)
			((Class_xa_Sub2) this).anIntArrayArrayArray8793[i][i_167_] = is_168_;
		Class330_Sub37[] class330_sub37s = (((Class_xa_Sub2) this).aClass330_Sub37ArrayArrayArray8801[i][i_167_] = new Class330_Sub37[is_171_.length]);
		for (int i_175_ = 0; i_175_ < is_171_.length; i_175_++) {
			int i_176_ = is_173_[i_175_];
			int i_177_ = is_174_[i_175_];
			if ((((Class_xa_Sub2) this).anInt8795 & 0x20) != 0 && i_176_ != -1 && interface_ma.method221(i_176_, -1288860881).aBoolean533) {
				i_177_ = 128;
				i_176_ = -1;
			}
			long l = ((long) (class77.anInt651 * -892945375) << 48 | (long) (class77.anInt650 * -348036733) << 42 | (long) (class77.anInt652 * -576105833) << 28 | (long) (i_177_ << 14) | (long) i_176_);
			Class330 class330;
			for (class330 = ((Class_xa_Sub2) this).aClass497_8821.method6094(l); class330 != null; class330 = ((Class_xa_Sub2) this).aClass497_8821.method6095(974601910)) {
				Class330_Sub37 class330_sub37 = (Class330_Sub37) class330;
				if (((Class330_Sub37) class330_sub37).anInt7740 == i_176_ && (((Class330_Sub37) class330_sub37).aFloat7741 == (float) i_177_) && ((Class330_Sub37) class330_sub37).aClass77_7745.method925(class77, -1229239605))
					break;
			}
			if (class330 == null) {
				class330_sub37s[i_175_] = new Class330_Sub37(this, i_176_, i_177_, class77);
				((Class_xa_Sub2) this).aClass497_8821.method6097(class330_sub37s[i_175_], l);
			} else
				class330_sub37s[i_175_] = (Class330_Sub37) class330;
		}
		if (bool)
			((Class_xa_Sub2) this).aByteArrayArray8808[i][i_167_] |= 0x1;
		if (is_171_.length > ((Class_xa_Sub2) this).anInt8818)
			((Class_xa_Sub2) this).anInt8818 = is_171_.length;
		((Class_xa_Sub2) this).anInt8815 += is_171_.length;
	}

	public void method6421(int i, int i_178_, int i_179_, boolean[][] bools, boolean bool, int i_180_) {
		if (((Class_xa_Sub2) this).aClass330Array8811 != null) {
			int i_181_ = i_179_ + i_179_ + 1;
			i_181_ *= i_181_;
			if (((Class_xa_Sub2) this).anIntArray8831.length < i_181_)
				((Class_xa_Sub2) this).anIntArray8831 = new int[i_181_];
			int i_182_ = i - i_179_;
			int i_183_ = i_182_;
			if (i_182_ < 0)
				i_182_ = 0;
			int i_184_ = i_178_ - i_179_;
			int i_185_ = i_184_;
			if (i_184_ < 0)
				i_184_ = 0;
			int i_186_ = i + i_179_;
			if (i_186_ > anInt6397 * 1972554729 - 1)
				i_186_ = anInt6397 * 1972554729 - 1;
			int i_187_ = i_178_ + i_179_;
			if (i_187_ > anInt6393 * 24567321 - 1)
				i_187_ = anInt6393 * 24567321 - 1;
			((Class_xa_Sub2) this).anInt8830 = 0;
			for (int i_188_ = i_182_; i_188_ <= i_186_; i_188_++) {
				boolean[] bools_189_ = bools[i_188_ - i_183_];
				for (int i_190_ = i_184_; i_190_ <= i_187_; i_190_++) {
					if (bools_189_[i_190_ - i_185_])
						((Class_xa_Sub2) this).anIntArray8831[((Class_xa_Sub2) this).anInt8830++] = i_190_ * (anInt6397 * 1972554729) + i_188_;
				}
			}
			ByteBuffer bytebuffer = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aByteBuffer8458;
			bytebuffer.clear();
			for (int i_191_ = 0; i_191_ < ((Class_xa_Sub2) this).aClass330Array8811.length; i_191_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8811[i_191_]);
				class330_sub37.method3535((((Class_xa_Sub2) this).anIntArray8831), ((Class_xa_Sub2) this).anInt8830);
			}
			int i_192_ = bytebuffer.position();
			Class140 class140 = (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aClass140_8474);
			if (i_192_ != 0) {
				Interface9_Impl2 interface9_impl2 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4909(i_192_ / 2);
				interface9_impl2.method97(0, i_192_, (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aLong8459));
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5013();
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(0, ((Class_xa_Sub2) this).anInterface9_Impl1_8812);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4979(interface9_impl2);
				class140.method1618(Class249.aClass249_2630);
				if (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8578 > 0) {
					class140.aClass261_1548.method2588(0.0F, 0.0F, 1.0F, -(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8580));
					class140.aClass260_1549.method2553((float) ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8476) >> 16 & 0xff) / 255.0F, (float) ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8476) >> 8 & 0xff) / 255.0F, (float) ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInt8476) >> 0 & 0xff) / 255.0F);
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576.method2510(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8472);
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576.method2501();
					class140.aClass261_1548.method2589(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576);
					class140.aClass261_1548.method2583(1.0F / ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8581) - (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8580)));
				} else {
					class140.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
					class140.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
				}
				if ((((Class_xa_Sub2) this).anInt8795 & 0x7) == 0) {
					int i_193_ = 0;
					for (int i_194_ = 0; (i_194_ < ((Class_xa_Sub2) this).aClass330Array8811.length); i_194_++) {
						Class330_Sub37 class330_sub37 = (Class330_Sub37) (((Class_xa_Sub2) this).aClass330Array8811[i_194_]);
						if (((Class330_Sub37) class330_sub37).anInt7746 != 0) {
							if (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aBoolean8571) {
								((Class_xa_Sub2) this).aClass_ra_Sub2_8791.dz(0, (((Class330_Sub37) class330_sub37).aClass77_7745));
								class140.aClass261_1551.method2588(0.0F, 1.0F, 0.0F, ((float) (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8573) + ((float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt651) * -892945375) / 255.0F * (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733))));
								class140.aClass261_1551.method2583(1.0F / (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733));
								class140.aClass260_1547.method2553((float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 16 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 8 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 0 & 0xff) / 255.0F);
							} else {
								class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
								class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
							}
							boolean bool_195_ = false;
							if (((Class330_Sub37) class330_sub37).anInt7740 != -1) {
								class140.anInterface11_Impl3_1540 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass188_8552.method2093(((Class330_Sub37) class330_sub37).anInt7740));
								Class56 class56 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227.method221((((Class330_Sub37) class330_sub37).anInt7740), -873506084));
								bool_195_ = !Class376.method4368(class56.aByte525, -1828380143);
							} else
								class140.anInterface11_Impl3_1540 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface11_Impl3_8551);
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, (((Class330_Sub37) class330_sub37).anInterface9_Impl1_7743));
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
							class140.aClass249_1546.method2486(1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F, 1.0F);
							class140.anInt1555 = ((Class330_Sub37) class330_sub37).anInt7747;
							class140.anInt1556 = (((Class330_Sub37) class330_sub37).anInt7748 - (((Class330_Sub37) class330_sub37).anInt7747) + 1);
							class140.anInt1557 = i_193_;
							class140.anInt1552 = (((Class330_Sub37) class330_sub37).anInt7746 / 3);
							class140.method1619(bool_195_);
							i_193_ += ((Class330_Sub37) class330_sub37).anInt7746;
						}
					}
				} else {
					class140.aClass260_1542.method2553((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[0]), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[1]), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[2]));
					class140.aClass260_1544.method2553((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8530)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8500)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8532)));
					class140.aClass260_1543.method2553((-(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535) * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8530)), (-(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535) * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8500)), (-(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535) * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8532)));
					class140.aClass260_1553.method2553((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8530)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8500)), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533 * (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8532)));
					int i_196_ = 0;
					for (int i_197_ = 0; (i_197_ < ((Class_xa_Sub2) this).aClass330Array8811.length); i_197_++) {
						Class330_Sub37 class330_sub37 = (Class330_Sub37) (((Class_xa_Sub2) this).aClass330Array8811[i_197_]);
						if (((Class330_Sub37) class330_sub37).anInt7746 > 0) {
							if (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aBoolean8571) {
								((Class_xa_Sub2) this).aClass_ra_Sub2_8791.dz(0, (((Class330_Sub37) class330_sub37).aClass77_7745));
								float f = 0.15F;
								class140.aClass261_1551.method2588(0.0F, 1.0F / ((float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733) * f), 0.0F, 256.0F / ((float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt650) * -348036733) * f));
								class140.aClass260_1547.method2553((float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 16 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 8 & 0xff) / 255.0F, (float) (((((Class330_Sub37) class330_sub37).aClass77_7745.anInt652) * -576105833) >> 0 & 0xff) / 255.0F);
							} else {
								class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
								class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
							}
							byte i_198_ = 11;
							if (((Class330_Sub37) class330_sub37).anInt7740 != -1) {
								Class56 class56 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227.method221((((Class330_Sub37) class330_sub37).anInt7740), -1391109253));
								i_198_ = class56.aByte525;
								class140.anInterface11_Impl3_1540 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass188_8552.method2093(((Class330_Sub37) class330_sub37).anInt7740));
								class140.method1617(class56);
							} else
								class140.anInterface11_Impl3_1540 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface11_Impl3_8551);
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, (((Class330_Sub37) class330_sub37).anInterface9_Impl1_7743));
							((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
							class140.aClass249_1546.method2486(1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F / (((Class330_Sub37) class330_sub37).aFloat7741), 1.0F, 1.0F);
							class140.anInt1555 = ((Class330_Sub37) class330_sub37).anInt7747;
							class140.anInt1556 = (((Class330_Sub37) class330_sub37).anInt7748 - (((Class330_Sub37) class330_sub37).anInt7747) + 1);
							class140.anInt1557 = i_196_;
							class140.anInt1552 = (((Class330_Sub37) class330_sub37).anInt7746 / 3);
							switch (i_198_) {
							case 7:
								class140.aClass260_1536.method2553((((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[14]));
								class140.aClass249_1554.method2516();
								class140.anInterface11_Impl1_1550 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5012();
								class140.method1622(0);
								break;
							default:
								if (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aBoolean8571)
									class140.method1640();
								else
									class140.method1620(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aBoolean8601) && (((Class_xa_Sub2) this).anInt8795 & 0x8) != 0 && ((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass164_Sub1_Sub2_8564.method1956(-368309109)) {
									Class164_Sub1_Sub2 class164_sub1_sub2 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass164_Sub1_Sub2_8564);
									if (i_198_ == 2)
										class164_sub1_sub2 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass164_Sub1_Sub2_8563);
									class164_sub1_sub2.aClass249_9454.method2510(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8493);
									class164_sub1_sub2.aClass249_9465.method2486(1.0F / (((Class330_Sub37) class330_sub37).aFloat7741 * (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt653) * -1132415489)), 1.0F / (((Class330_Sub37) class330_sub37).aFloat7741 * (float) ((((Class330_Sub37) class330_sub37).aClass77_7745.anInt653) * -1132415489)), 1.0F, 1.0F);
									class164_sub1_sub2.aClass260_9463.method2553((((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[14]));
									Class56 class56 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface_ma4227.method221((((Class330_Sub37) class330_sub37).anInt7740), 2005138726));
									class164_sub1_sub2.anInt9459 = class56.aByte526 * -967254259;
									class164_sub1_sub2.anInt9474 = (((Class330_Sub37) class330_sub37).anInt7747) * 25568277;
									class164_sub1_sub2.anInt9475 = ((((Class330_Sub37) class330_sub37).anInt7748) - (((Class330_Sub37) class330_sub37).anInt7747) + 1) * -1024039475;
									class164_sub1_sub2.anInt9476 = i_196_ * -463050011;
									class164_sub1_sub2.anInt9449 = (((Class330_Sub37) class330_sub37).anInt7746) / 3 * -1604072367;
									class164_sub1_sub2.aClass261_9467.method2584(class140.aClass261_1551);
									class164_sub1_sub2.aClass260_9469.method2582(class140.aClass260_1547);
									class164_sub1_sub2.aClass261_9471.method2584(class140.aClass261_1548);
									class164_sub1_sub2.aClass260_9473.method2582(class140.aClass260_1549);
									class164_sub1_sub2.method1959((short) 7495);
								} else
									class140.method1620(0);
								break;
							case 1:
								class140.aClass260_1536.method2553((((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[12]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[13]), (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass249_8473.aFloatArray2631[14]));
								if (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aBoolean8571)
									class140.method1636();
								else
									class140.method1621(0);
								break;
							case 6:
								class140.method1619(!Class376.method4368(i_198_, -1558748913));
							}
							i_196_ += ((Class330_Sub37) class330_sub37).anInt7746;
						}
					}
				}
			}
			if (((Class_xa_Sub2) this).aClass183_8809 != null) {
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4970(1);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(0, ((Class_xa_Sub2) this).anInterface9_Impl1_8812);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, ((Class_xa_Sub2) this).anInterface9_Impl1_8806);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
				((Class_xa_Sub2) this).aClass183_8809.method2066(class140, i, i_178_, i_179_, bools, bool);
			}
		}
	}

	public void method6412(int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, boolean[][] bools) {
		if (((Class_xa_Sub2) this).anInt8815 > 0) {
			Interface9_Impl2 interface9_impl2 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4909(((Class_xa_Sub2) this).anInt8816);
			int i_205_ = 0;
			int i_206_ = 32767;
			int i_207_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aByteBuffer8458;
			bytebuffer.clear();
			for (int i_208_ = i_202_; i_208_ < i_204_; i_208_++) {
				int i_209_ = i_208_ * (anInt6397 * 1972554729) + i_201_;
				for (int i_210_ = i_201_; i_210_ < i_203_; i_210_++) {
					if (bools[i_210_ - i_201_][i_208_ - i_202_]) {
						short[] is = (((Class_xa_Sub2) this).aShortArrayArray8798[i_209_]);
						if (is != null) {
							for (int i_211_ = 0; i_211_ < is.length; i_211_++) {
								int i_212_ = is[i_211_] & 0xffff;
								if (i_212_ > i_207_)
									i_207_ = i_212_;
								if (i_212_ < i_206_)
									i_206_ = i_212_;
								bytebuffer.putShort((short) i_212_);
								i_205_++;
							}
						}
					}
					i_209_++;
				}
			}
			interface9_impl2.method97(0, bytebuffer.position(), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aLong8459));
			if (i_205_ > 0) {
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5013();
				Class140 class140 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass140_8474);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(0, ((Class_xa_Sub2) this).anInterface9_Impl1_8812);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, ((Class_xa_Sub2) this).anInterface9_Impl1_8806);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4979(interface9_impl2);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.cw(Class247.aClass247_2621);
				float f = (float) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4782((byte) 0).method856();
				float f_213_ = (float) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4782((byte) 0).method857();
				Class247 class247 = new Class247();
				Class247 class247_214_ = new Class247();
				class247.method2477(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class247_214_.method2463((float) i_200_ / (256.0F * (float) (anInt6395 * 550173571)), (float) -i_200_ / (256.0F * (float) (anInt6395 * 550173571)), 1.0F / (((Class_xa_Sub2) this).aFloat8800 - ((Class_xa_Sub2) this).aFloat8799));
				class247_214_.method2474((float) i - (float) (i_201_ * i_200_) / 256.0F, (float) i_199_ + (float) (i_204_ * i_200_) / 256.0F, (-((Class_xa_Sub2) this).aFloat8799 / (((Class_xa_Sub2) this).aFloat8800 - ((Class_xa_Sub2) this).aFloat8799)));
				class247_214_.method2468(2.0F / f, 2.0F / f_213_, 1.0F);
				class247_214_.method2474(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aClass247_8513.method2478(class247, class247_214_);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576.method2508(((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass247_8513);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.ci(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576);
				class140.method1618(Class249.aClass249_2630);
				class140.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
				class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
				class140.anInterface11_Impl3_1540 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface11_Impl3_8551);
				class140.aClass249_1546.method2516();
				class140.anInt1555 = i_206_;
				class140.anInt1556 = i_207_ - i_206_ + 1;
				class140.anInt1557 = 0;
				class140.anInt1552 = i_205_ / 3;
				if (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aBoolean8519) {
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.RA(false);
					class140.method1619(false);
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.RA(true);
				} else
					class140.method1619(false);
			}
		}
	}

	public void method6414(int i, int i_215_, int[] is, int[] is_216_, int[] is_217_, int[] is_218_, int[] is_219_, int[] is_220_, int[] is_221_, int[] is_222_, int[] is_223_, int[] is_224_, int[] is_225_, Class77 class77, boolean bool) {
		int i_226_ = is_222_.length;
		int[] is_227_ = new int[i_226_ * 3];
		int[] is_228_ = new int[i_226_ * 3];
		int[] is_229_ = new int[i_226_ * 3];
		int[] is_230_ = new int[i_226_ * 3];
		int[] is_231_ = new int[i_226_ * 3];
		int[] is_232_ = new int[i_226_ * 3];
		int[] is_233_ = is_216_ != null ? new int[i_226_ * 3] : null;
		int[] is_234_ = is_218_ != null ? new int[i_226_ * 3] : null;
		int i_235_ = 0;
		for (int i_236_ = 0; i_236_ < i_226_; i_236_++) {
			int i_237_ = is_219_[i_236_];
			int i_238_ = is_220_[i_236_];
			int i_239_ = is_221_[i_236_];
			is_227_[i_235_] = is[i_237_];
			is_228_[i_235_] = is_217_[i_237_];
			is_229_[i_235_] = is_222_[i_236_];
			is_231_[i_235_] = is_224_[i_236_];
			is_232_[i_235_] = is_225_[i_236_];
			is_230_[i_235_] = is_223_ != null ? is_223_[i_236_] : is_222_[i_236_];
			if (is_216_ != null)
				is_233_[i_235_] = is_216_[i_237_];
			if (is_218_ != null)
				is_234_[i_235_] = is_218_[i_237_];
			i_235_++;
			is_227_[i_235_] = is[i_238_];
			is_228_[i_235_] = is_217_[i_238_];
			is_229_[i_235_] = is_222_[i_236_];
			is_231_[i_235_] = is_224_[i_236_];
			is_232_[i_235_] = is_225_[i_236_];
			is_230_[i_235_] = is_223_ != null ? is_223_[i_236_] : is_222_[i_236_];
			if (is_216_ != null)
				is_233_[i_235_] = is_216_[i_238_];
			if (is_218_ != null)
				is_234_[i_235_] = is_218_[i_238_];
			i_235_++;
			is_227_[i_235_] = is[i_239_];
			is_228_[i_235_] = is_217_[i_239_];
			is_229_[i_235_] = is_222_[i_236_];
			is_231_[i_235_] = is_224_[i_236_];
			is_232_[i_235_] = is_225_[i_236_];
			is_230_[i_235_] = is_223_ != null ? is_223_[i_236_] : is_222_[i_236_];
			if (is_216_ != null)
				is_233_[i_235_] = is_216_[i_239_];
			if (is_218_ != null)
				is_234_[i_235_] = is_218_[i_239_];
			i_235_++;
		}
		method6425(i, i_215_, is_227_, is_233_, is_228_, is_234_, is_229_, is_230_, is_231_, is_232_, class77, bool);
	}

	public Class_na h(int i, int i_240_, Class_na class_na) {
		if ((((Class_xa_Sub2) this).aByteArrayArray8808[i][i_240_] & 0x1) == 0)
			return null;
		int i_241_ = (anInt6395 * 550173571 >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_242_;
		if (class_na_sub1 != null && class_na_sub1.method3528(i_241_, i_241_)) {
			class_na_sub1_242_ = class_na_sub1;
			class_na_sub1_242_.method3525();
		} else
			class_na_sub1_242_ = new Class_na_Sub1(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, i_241_, i_241_);
		class_na_sub1_242_.method3524(0, 0, i_241_, i_241_);
		method6439(class_na_sub1_242_, i, i_240_);
		return class_na_sub1_242_;
	}

	public Class_na y(int i, int i_243_, Class_na class_na) {
		if ((((Class_xa_Sub2) this).aByteArrayArray8808[i][i_243_] & 0x1) == 0)
			return null;
		int i_244_ = (anInt6395 * 550173571 >> (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536));
		Class_na_Sub1 class_na_sub1 = (Class_na_Sub1) class_na;
		Class_na_Sub1 class_na_sub1_245_;
		if (class_na_sub1 != null && class_na_sub1.method3528(i_244_, i_244_)) {
			class_na_sub1_245_ = class_na_sub1;
			class_na_sub1_245_.method3525();
		} else
			class_na_sub1_245_ = new Class_na_Sub1(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, i_244_, i_244_);
		class_na_sub1_245_.method3524(0, 0, i_244_, i_244_);
		method6439(class_na_sub1_245_, i, i_243_);
		return class_na_sub1_245_;
	}

	void method6440() {
		((Class_xa_Sub2) this).anInterface9_Impl1_8806 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4976(false);
		((Class_xa_Sub2) this).anInterface9_Impl1_8806.method142(((Class_xa_Sub2) this).anInt8796 * 4, 4);
		((Class_xa_Sub2) this).anInterface9_Impl1_8806.method97(0, ((Class_xa_Sub2) this).anInt8796 * 4, ((Class_xa_Sub2) this).aLong8826);
		((Class_xa_Sub2) this).anInterface9_Impl1_8812 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4976(false);
		((Class_xa_Sub2) this).anInterface9_Impl1_8812.method142((((Class_xa_Sub2) this).anInt8796 * ((Class_xa_Sub2) this).anInt8827), ((Class_xa_Sub2) this).anInt8827);
		((Class_xa_Sub2) this).anInterface9_Impl1_8812.method97(0, (((Class_xa_Sub2) this).anInt8796 * ((Class_xa_Sub2) this).anInt8827), (((Class_xa_Sub2) this).aLong8826 + (long) (((Class_xa_Sub2) this).anInt8815 * 4)));
		((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anUnsafe8461.freeMemory(((Class_xa_Sub2) this).aLong8826);
		if ((((Class_xa_Sub2) this).anInt8795 & 0x7) != 0) {
			if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
				((Class_xa_Sub2) this).aClass184_8810 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1861, Class191.aClass191_1872 }), new Class193(Class191.aClass191_1862) }));
			else
				((Class_xa_Sub2) this).aClass184_8810 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1872 }), new Class193(Class191.aClass191_1862) }));
		} else if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
			((Class_xa_Sub2) this).aClass184_8810 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864, Class191.aClass191_1861 }), new Class193(Class191.aClass191_1862) }));
		else
			((Class_xa_Sub2) this).aClass184_8810 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4977(new Class193[] { new Class193(new Class191[] { Class191.aClass191_1863, Class191.aClass191_1864 }), new Class193(Class191.aClass191_1862) }));
		for (int i = 0; i < ((Class_xa_Sub2) this).anInt8823; i++) {
			Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i]);
			class330_sub37.method3538(((Class_xa_Sub2) this).anInt8796);
		}
		if (((Class_xa_Sub2) this).aClass183_8809 != null)
			((Class_xa_Sub2) this).aClass183_8809.method2067();
		method6438();
	}

	Class_xa_Sub2(Class_ra_Sub2 class_ra_sub2, int i, int i_246_, int i_247_, int i_248_, int[][] is, int[][] is_249_, int i_250_) {
		super(i_247_, i_248_, i_250_, is);
		((Class_xa_Sub2) this).aClass_ra_Sub2_8791 = class_ra_sub2;
		((Class_xa_Sub2) this).anInt8792 = anInt6396 * -1066304221 - 2;
		((Class_xa_Sub2) this).anInt8790 = 1 << ((Class_xa_Sub2) this).anInt8792;
		((Class_xa_Sub2) this).anInt8794 = i;
		((Class_xa_Sub2) this).anInt8795 = i_246_;
		((Class_xa_Sub2) this).anIntArrayArrayArray8793 = new int[i_247_][i_248_][];
		((Class_xa_Sub2) this).aClass330_Sub37ArrayArrayArray8801 = new Class330_Sub37[i_247_][i_248_][];
		((Class_xa_Sub2) this).anIntArrayArrayArray8813 = new int[i_247_][i_248_][];
		((Class_xa_Sub2) this).anIntArrayArrayArray8805 = new int[i_247_][i_248_][];
		((Class_xa_Sub2) this).anIntArrayArrayArray8802 = new int[i_247_][i_248_][];
		((Class_xa_Sub2) this).anIntArrayArrayArray8814 = new int[i_247_][i_248_][];
		((Class_xa_Sub2) this).aShortArrayArray8798 = new short[i_247_ * i_248_][];
		((Class_xa_Sub2) this).aByteArrayArray8808 = new byte[i_247_][i_248_];
		((Class_xa_Sub2) this).aByteArrayArray8803 = new byte[i_247_ + 1][i_248_ + 1];
		((Class_xa_Sub2) this).aFloatArrayArray8822 = new float[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1];
		((Class_xa_Sub2) this).aFloatArrayArray8817 = new float[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1];
		((Class_xa_Sub2) this).aFloatArrayArray8820 = new float[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1];
		for (int i_251_ = 0; i_251_ <= anInt6393 * 24567321; i_251_++) {
			for (int i_252_ = 0; i_252_ <= anInt6397 * 1972554729; i_252_++) {
				int i_253_ = anIntArrayArray6394[i_252_][i_251_];
				if ((float) i_253_ < ((Class_xa_Sub2) this).aFloat8799)
					((Class_xa_Sub2) this).aFloat8799 = (float) i_253_;
				if ((float) i_253_ > ((Class_xa_Sub2) this).aFloat8800)
					((Class_xa_Sub2) this).aFloat8800 = (float) i_253_;
				if (i_252_ > 0 && i_251_ > 0 && i_252_ < anInt6397 * 1972554729 && i_251_ < anInt6393 * 24567321) {
					int i_254_ = (is_249_[i_252_ + 1][i_251_] - is_249_[i_252_ - 1][i_251_]);
					int i_255_ = (is_249_[i_252_][i_251_ + 1] - is_249_[i_252_][i_251_ - 1]);
					float f = (float) (1.0 / Math.sqrt((double) (i_254_ * i_254_ + 4 * i_250_ * i_250_ + i_255_ * i_255_)));
					((Class_xa_Sub2) this).aFloatArrayArray8822[i_252_][i_251_] = (float) i_254_ * f;
					((Class_xa_Sub2) this).aFloatArrayArray8817[i_252_][i_251_] = (float) (-i_250_ * 2) * f;
					((Class_xa_Sub2) this).aFloatArrayArray8820[i_252_][i_251_] = (float) i_255_ * f;
				}
			}
		}
		((Class_xa_Sub2) this).aFloat8799--;
		((Class_xa_Sub2) this).aFloat8800++;
		((Class_xa_Sub2) this).aClass497_8821 = new Class497(128);
		if ((((Class_xa_Sub2) this).anInt8795 & 0x10) != 0)
			((Class_xa_Sub2) this).aClass183_8809 = new Class183(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, this);
	}

	public void ac(Class_na class_na, int i, int i_256_, int i_257_, int i_258_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_259_ = (i - (i_256_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_260_ = (i_257_ - (i_256_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2069(class_na, i_259_, i_260_);
		}
	}

	public void al(Class_na class_na, int i, int i_261_, int i_262_, int i_263_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_264_ = (i - (i_261_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_265_ = (i_262_ - (i_261_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2069(class_na, i_264_, i_265_);
		}
	}

	public void ay(Class_na class_na, int i, int i_266_, int i_267_, int i_268_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_269_ = (i - (i_266_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_270_ = (i_267_ - (i_266_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2069(class_na, i_269_, i_270_);
		}
	}

	public void method6427(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub2) this).aClass471_8804.method5878(new Class330_Sub27(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, this, class330_sub14, is), (short) 8192);
	}

	public void method6429(Class330_Sub14 class330_sub14, int[] is) {
		((Class_xa_Sub2) this).aClass471_8804.method5878(new Class330_Sub27(((Class_xa_Sub2) this).aClass_ra_Sub2_8791, this, class330_sub14, is), (short) 8192);
	}

	public void method6428(int i, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, boolean[][] bools) {
		if (((Class_xa_Sub2) this).anInt8815 > 0) {
			Interface9_Impl2 interface9_impl2 = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4909(((Class_xa_Sub2) this).anInt8816);
			int i_277_ = 0;
			int i_278_ = 32767;
			int i_279_ = -32768;
			ByteBuffer bytebuffer = ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aByteBuffer8458;
			bytebuffer.clear();
			for (int i_280_ = i_274_; i_280_ < i_276_; i_280_++) {
				int i_281_ = i_280_ * (anInt6397 * 1972554729) + i_273_;
				for (int i_282_ = i_273_; i_282_ < i_275_; i_282_++) {
					if (bools[i_282_ - i_273_][i_280_ - i_274_]) {
						short[] is = (((Class_xa_Sub2) this).aShortArrayArray8798[i_281_]);
						if (is != null) {
							for (int i_283_ = 0; i_283_ < is.length; i_283_++) {
								int i_284_ = is[i_283_] & 0xffff;
								if (i_284_ > i_279_)
									i_279_ = i_284_;
								if (i_284_ < i_278_)
									i_278_ = i_284_;
								bytebuffer.putShort((short) i_284_);
								i_277_++;
							}
						}
					}
					i_281_++;
				}
			}
			interface9_impl2.method97(0, bytebuffer.position(), (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aLong8459));
			if (i_277_ > 0) {
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5013();
				Class140 class140 = (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass140_8474);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(0, ((Class_xa_Sub2) this).anInterface9_Impl1_8812);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method5081(1, ((Class_xa_Sub2) this).anInterface9_Impl1_8806);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4978(((Class_xa_Sub2) this).aClass184_8810);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4979(interface9_impl2);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.cw(Class247.aClass247_2621);
				float f = (float) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4782((byte) 0).method856();
				float f_285_ = (float) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791.method4782((byte) 0).method857();
				Class247 class247 = new Class247();
				Class247 class247_286_ = new Class247();
				class247.method2477(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class247_286_.method2463((float) i_272_ / (256.0F * (float) (anInt6395 * 550173571)), (float) -i_272_ / (256.0F * (float) (anInt6395 * 550173571)), 1.0F / (((Class_xa_Sub2) this).aFloat8800 - ((Class_xa_Sub2) this).aFloat8799));
				class247_286_.method2474((float) i - (float) (i_273_ * i_272_) / 256.0F, (float) i_271_ + (float) (i_276_ * i_272_) / 256.0F, (-((Class_xa_Sub2) this).aFloat8799 / (((Class_xa_Sub2) this).aFloat8800 - ((Class_xa_Sub2) this).aFloat8799)));
				class247_286_.method2468(2.0F / f, 2.0F / f_285_, 1.0F);
				class247_286_.method2474(-1.0F, -1.0F, 0.0F);
				((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).aClass247_8513.method2478(class247, class247_286_);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576.method2508(((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).aClass247_8513);
				((Class_xa_Sub2) this).aClass_ra_Sub2_8791.ci(((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aClass249_8576);
				class140.method1618(Class249.aClass249_2630);
				class140.aClass261_1548.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1549.method2553(0.0F, 0.0F, 0.0F);
				class140.aClass261_1551.method2588(0.0F, 0.0F, 0.0F, 0.0F);
				class140.aClass260_1547.method2553(0.0F, 0.0F, 0.0F);
				class140.anInterface11_Impl3_1540 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anInterface11_Impl3_8551);
				class140.aClass249_1546.method2516();
				class140.anInt1555 = i_278_;
				class140.anInt1556 = i_279_ - i_278_ + 1;
				class140.anInt1557 = 0;
				class140.anInt1552 = i_277_ / 3;
				if (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aBoolean8519) {
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.RA(false);
					class140.method1619(false);
					((Class_xa_Sub2) this).aClass_ra_Sub2_8791.RA(true);
				} else
					class140.method1619(false);
			}
		}
	}

	public void as(Class_na class_na, int i, int i_287_, int i_288_, int i_289_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_290_ = (i - (i_287_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_291_ = (i_288_ - (i_287_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2068(class_na, i_290_, i_291_);
		}
	}

	public void aj(Class_na class_na, int i, int i_292_, int i_293_, int i_294_, boolean bool) {
		if (((Class_xa_Sub2) this).aClass183_8809 != null && class_na != null) {
			int i_295_ = (i - (i_292_ * (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8541) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			int i_296_ = (i_293_ - (i_292_ * (((Class_ra_Sub2) (((Class_xa_Sub2) this).aClass_ra_Sub2_8791)).anInt8599) >> 8) >> ((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8536);
			((Class_xa_Sub2) this).aClass183_8809.method2068(class_na, i_295_, i_296_);
		}
	}

	public void c() {
		if (((Class_xa_Sub2) this).anInt8815 <= 0) {
			((Class_xa_Sub2) this).aClass183_8809 = null;
			method6438();
		} else {
			byte[][] is = (new byte[anInt6397 * 1972554729 + 1][anInt6393 * 24567321 + 1]);
			for (int i = 1; i < anInt6397 * 1972554729; i++) {
				for (int i_297_ = 1; i_297_ < anInt6393 * 24567321; i_297_++)
					is[i][i_297_] = (byte) (((((Class_xa_Sub2) this).aByteArrayArray8803[i - 1][i_297_]) >> 2) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i + 1][i_297_]) >> 3) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_297_ - 1]) >> 2) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_297_ + 1]) >> 3) + ((((Class_xa_Sub2) this).aByteArrayArray8803[i][i_297_]) >> 1));
			}
			((Class_xa_Sub2) this).aClass330Array8797 = new Class330[((Class_xa_Sub2) this).aClass497_8821.method6096(-1212412297)];
			((Class_xa_Sub2) this).aClass497_8821.method6093(((Class_xa_Sub2) this).aClass330Array8797, 1134841397);
			for (int i = 0; i < ((Class_xa_Sub2) this).aClass330Array8797.length; i++)
				((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i]).method3537(((Class_xa_Sub2) this).anInt8815);
			((Class_xa_Sub2) this).anInt8827 = 20;
			if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null)
				((Class_xa_Sub2) this).anInt8827 += 4;
			if ((((Class_xa_Sub2) this).anInt8795 & 0x7) != 0)
				((Class_xa_Sub2) this).anInt8827 += 12;
			((Class_xa_Sub2) this).aLong8826 = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anUnsafe8461.allocateMemory((long) (((Class_xa_Sub2) this).anInt8815 * 4 + (((Class_xa_Sub2) this).anInt8815 * ((Class_xa_Sub2) this).anInt8827))));
			((Class_xa_Sub2) this).aLong8824 = ((Class_xa_Sub2) this).aLong8826;
			((Class_xa_Sub2) this).aLong8825 = (((Class_xa_Sub2) this).aLong8826 + (long) (((Class_xa_Sub2) this).anInt8815 * 4));
			Class330_Sub37[] class330_sub37s = new Class330_Sub37[((Class_xa_Sub2) this).anInt8815];
			int i = Class385.method4425(((Class_xa_Sub2) this).anInt8815 / 4, (short) 4437);
			if (i < 1)
				i = 1;
			Class497 class497 = new Class497(i);
			Class330_Sub37[] class330_sub37s_298_ = new Class330_Sub37[((Class_xa_Sub2) this).anInt8818];
			for (int i_299_ = 0; i_299_ < anInt6397 * 1972554729; i_299_++) {
				for (int i_300_ = 0; i_300_ < anInt6393 * 24567321; i_300_++)
					method6441(i_299_, i_300_, is, class330_sub37s_298_, class497, class330_sub37s);
			}
			for (int i_301_ = 0; i_301_ < ((Class_xa_Sub2) this).anInt8796; i_301_++) {
				Class330_Sub37 class330_sub37 = class330_sub37s[i_301_];
				if (class330_sub37 != null)
					class330_sub37.method3536(i_301_);
			}
			for (int i_302_ = 0; i_302_ < anInt6397 * 1972554729; i_302_++) {
				for (int i_303_ = 0; i_303_ < anInt6393 * 24567321; i_303_++) {
					short[] is_304_ = (((Class_xa_Sub2) this).aShortArrayArray8798[i_303_ * (anInt6397 * 1972554729) + i_302_]);
					if (is_304_ != null) {
						int i_305_ = 0;
						int i_306_ = 0;
						while (i_306_ < is_304_.length) {
							int i_307_ = is_304_[i_306_++] & 0xffff;
							int i_308_ = is_304_[i_306_++] & 0xffff;
							int i_309_ = is_304_[i_306_++] & 0xffff;
							Class330_Sub37 class330_sub37 = class330_sub37s[i_307_];
							Class330_Sub37 class330_sub37_310_ = class330_sub37s[i_308_];
							Class330_Sub37 class330_sub37_311_ = class330_sub37s[i_309_];
							Class330_Sub37 class330_sub37_312_ = null;
							if (class330_sub37 != null) {
								class330_sub37.method3540(i_302_, i_303_, i_305_);
								class330_sub37_312_ = class330_sub37;
							}
							if (class330_sub37_310_ != null) {
								class330_sub37_310_.method3540(i_302_, i_303_, i_305_);
								if (class330_sub37_312_ == null || ((class330_sub37_310_.aLong3341 * -6154793640677333111L) < (class330_sub37_312_.aLong3341 * -6154793640677333111L)))
									class330_sub37_312_ = class330_sub37_310_;
							}
							if (class330_sub37_311_ != null) {
								class330_sub37_311_.method3540(i_302_, i_303_, i_305_);
								if (class330_sub37_312_ == null || ((class330_sub37_311_.aLong3341 * -6154793640677333111L) < (class330_sub37_312_.aLong3341 * -6154793640677333111L)))
									class330_sub37_312_ = class330_sub37_311_;
							}
							if (class330_sub37_312_ != null) {
								if (class330_sub37 != null)
									class330_sub37_312_.method3536(i_307_);
								if (class330_sub37_310_ != null)
									class330_sub37_312_.method3536(i_308_);
								if (class330_sub37_311_ != null)
									class330_sub37_312_.method3536(i_309_);
								class330_sub37_312_.method3540(i_302_, i_303_, i_305_);
							}
							i_305_++;
						}
					}
				}
			}
			((Class_xa_Sub2) this).anInt8823 = 0;
			for (int i_313_ = 0; i_313_ < ((Class_xa_Sub2) this).aClass330Array8797.length; i_313_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i_313_]);
				if (((Class330_Sub37) class330_sub37).anInt7738 > 0)
					((Class_xa_Sub2) this).aClass330Array8797[((Class_xa_Sub2) this).anInt8823++] = class330_sub37;
			}
			((Class_xa_Sub2) this).aClass330Array8811 = new Class330[((Class_xa_Sub2) this).anInt8823];
			long[] ls = new long[((Class_xa_Sub2) this).anInt8823];
			for (int i_314_ = 0; i_314_ < ((Class_xa_Sub2) this).anInt8823; i_314_++) {
				Class330_Sub37 class330_sub37 = ((Class330_Sub37) ((Class_xa_Sub2) this).aClass330Array8797[i_314_]);
				ls[i_314_] = class330_sub37.aLong3341 * -6154793640677333111L;
				((Class_xa_Sub2) this).aClass330Array8811[i_314_] = class330_sub37;
			}
			Class330_Sub40_Sub1.method3584(ls, (((Class_xa_Sub2) this).aClass330Array8811), (byte) 16);
			method6440();
		}
	}

	void method6441(int i, int i_315_, byte[][] is, Class330_Sub37[] class330_sub37s, Class497 class497, Class330_Sub37[] class330_sub37s_316_) {
		if (((Class_xa_Sub2) this).anIntArrayArrayArray8802[i][i_315_] != null) {
			Class330_Sub37[] class330_sub37s_317_ = (((Class_xa_Sub2) this).aClass330_Sub37ArrayArrayArray8801[i][i_315_]);
			int[] is_318_ = ((Class_xa_Sub2) this).anIntArrayArrayArray8813[i][i_315_];
			int[] is_319_ = ((Class_xa_Sub2) this).anIntArrayArrayArray8805[i][i_315_];
			int[] is_320_ = ((Class_xa_Sub2) this).anIntArrayArrayArray8814[i][i_315_];
			int[] is_321_ = ((Class_xa_Sub2) this).anIntArrayArrayArray8802[i][i_315_];
			int[] is_322_ = (((Class_xa_Sub2) this).anIntArrayArrayArray8793 != null ? ((Class_xa_Sub2) this).anIntArrayArrayArray8793[i][i_315_] : null);
			int[] is_323_ = (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null ? ((Class_xa_Sub2) this).anIntArrayArrayArray8807[i][i_315_] : null);
			if (is_320_ == null)
				is_320_ = is_321_;
			float f = ((Class_xa_Sub2) this).aFloatArrayArray8822[i][i_315_];
			float f_324_ = ((Class_xa_Sub2) this).aFloatArrayArray8817[i][i_315_];
			float f_325_ = ((Class_xa_Sub2) this).aFloatArrayArray8820[i][i_315_];
			float f_326_ = ((Class_xa_Sub2) this).aFloatArrayArray8822[i][i_315_ + 1];
			float f_327_ = ((Class_xa_Sub2) this).aFloatArrayArray8817[i][i_315_ + 1];
			float f_328_ = ((Class_xa_Sub2) this).aFloatArrayArray8820[i][i_315_ + 1];
			float f_329_ = (((Class_xa_Sub2) this).aFloatArrayArray8822[i + 1][i_315_ + 1]);
			float f_330_ = (((Class_xa_Sub2) this).aFloatArrayArray8817[i + 1][i_315_ + 1]);
			float f_331_ = (((Class_xa_Sub2) this).aFloatArrayArray8820[i + 1][i_315_ + 1]);
			float f_332_ = ((Class_xa_Sub2) this).aFloatArrayArray8822[i + 1][i_315_];
			float f_333_ = ((Class_xa_Sub2) this).aFloatArrayArray8817[i + 1][i_315_];
			float f_334_ = ((Class_xa_Sub2) this).aFloatArrayArray8820[i + 1][i_315_];
			int i_335_ = is[i][i_315_] & 0xff;
			int i_336_ = is[i][i_315_ + 1] & 0xff;
			int i_337_ = is[i + 1][i_315_ + 1] & 0xff;
			int i_338_ = is[i + 1][i_315_] & 0xff;
			int i_339_ = 0;
			while_117_: for (int i_340_ = 0; i_340_ < is_321_.length; i_340_++) {
				Class330_Sub37 class330_sub37 = class330_sub37s_317_[i_340_];
				for (int i_341_ = 0; i_341_ < i_339_; i_341_++) {
					if (class330_sub37s[i_341_] == class330_sub37)
						continue while_117_;
				}
				class330_sub37s[i_339_++] = class330_sub37;
			}
			short[] is_342_ = (((Class_xa_Sub2) this).aShortArrayArray8798[i_315_ * (anInt6397 * 1972554729) + i] = new short[is_321_.length]);
			for (int i_343_ = 0; i_343_ < is_321_.length; i_343_++) {
				int i_344_ = (i << anInt6396 * -1066304221) + is_318_[i_343_];
				int i_345_ = (i_315_ << anInt6396 * -1066304221) + is_319_[i_343_];
				int i_346_ = i_344_ >> ((Class_xa_Sub2) this).anInt8792;
				int i_347_ = i_345_ >> ((Class_xa_Sub2) this).anInt8792;
				int i_348_ = is_321_[i_343_];
				int i_349_ = is_320_[i_343_];
				int i_350_ = is_322_ != null ? is_322_[i_343_] : 0;
				long l = ((long) i_349_ << 48 | (long) i_348_ << 32 | (long) (i_346_ << 16) | (long) i_347_);
				int i_351_ = is_318_[i_343_];
				int i_352_ = is_319_[i_343_];
				int i_353_ = 74;
				int i_354_ = 0;
				float f_355_ = 1.0F;
				float f_356_;
				float f_357_;
				float f_358_;
				if (i_351_ == 0 && i_352_ == 0) {
					f_356_ = f;
					f_357_ = f_324_;
					f_358_ = f_325_;
					i_353_ -= i_335_;
				} else if (i_351_ == 0 && i_352_ == anInt6395 * 550173571) {
					f_356_ = f_326_;
					f_357_ = f_327_;
					f_358_ = f_328_;
					i_353_ -= i_336_;
				} else if (i_351_ == anInt6395 * 550173571 && i_352_ == anInt6395 * 550173571) {
					f_356_ = f_329_;
					f_357_ = f_330_;
					f_358_ = f_331_;
					i_353_ -= i_337_;
				} else if (i_351_ == anInt6395 * 550173571 && i_352_ == 0) {
					f_356_ = f_332_;
					f_357_ = f_333_;
					f_358_ = f_334_;
					i_353_ -= i_338_;
				} else {
					float f_359_ = (float) i_351_ / (float) (anInt6395 * 550173571);
					float f_360_ = (float) i_352_ / (float) (anInt6395 * 550173571);
					float f_361_ = f + (f_332_ - f) * f_359_;
					float f_362_ = f_324_ + (f_333_ - f_324_) * f_359_;
					float f_363_ = f_325_ + (f_334_ - f_325_) * f_359_;
					float f_364_ = f_326_ + (f_329_ - f_326_) * f_359_;
					float f_365_ = f_327_ + (f_330_ - f_327_) * f_359_;
					float f_366_ = f_328_ + (f_331_ - f_328_) * f_359_;
					f_356_ = f_361_ + (f_364_ - f_361_) * f_360_;
					f_357_ = f_362_ + (f_365_ - f_362_) * f_360_;
					f_358_ = f_363_ + (f_366_ - f_363_) * f_360_;
					int i_367_ = i_335_ + ((i_338_ - i_335_) * i_351_ >> anInt6396 * -1066304221);
					int i_368_ = i_336_ + ((i_337_ - i_336_) * i_351_ >> anInt6396 * -1066304221);
					i_353_ -= i_367_ + ((i_368_ - i_367_) * i_352_ >> anInt6396 * -1066304221);
				}
				if (i_348_ != -1) {
					int i_369_ = (i_348_ & 0x7f) * i_353_ >> 7;
					if (i_369_ < 2)
						i_369_ = 2;
					else if (i_369_ > 126)
						i_369_ = 126;
					i_354_ = Console.anIntArray4265[i_348_ & 0xff80 | i_369_];
					if ((((Class_xa_Sub2) this).anInt8795 & 0x7) == 0) {
						f_355_ = ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[0]) * f_356_ + (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[1]) * f_357_ + (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[2]) * f_358_);
						f_355_ = ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533) + f_355_ * (f_355_ > 0.0F ? (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489) : (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535)));
					}
				}
				Class330 class330 = null;
				if ((i_344_ & ((Class_xa_Sub2) this).anInt8790 - 1) == 0 && (i_345_ & ((Class_xa_Sub2) this).anInt8790 - 1) == 0)
					class330 = class497.method6094(l);
				int i_370_;
				if (class330 == null) {
					int i_371_;
					if (i_349_ != i_348_) {
						int i_372_ = (i_349_ & 0x7f) * i_353_ >> 7;
						if (i_372_ < 2)
							i_372_ = 2;
						else if (i_372_ > 126)
							i_372_ = 126;
						i_371_ = (Console.anIntArray4265[i_349_ & 0xff80 | i_372_]);
						if ((((Class_xa_Sub2) this).anInt8795 & 0x7) == 0) {
							float f_373_ = ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[0]) * f_356_ + ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[1]) * f_357_) + ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloatArray8525[2]) * f_358_));
							f_373_ = ((((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8533) + f_355_ * (f_355_ > 0.0F ? (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8489) : (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.aFloat8535)));
							int i_374_ = i_371_ >> 16 & 0xff;
							int i_375_ = i_371_ >> 8 & 0xff;
							int i_376_ = i_371_ & 0xff;
							i_374_ *= f_373_;
							if (i_374_ < 0)
								i_374_ = 0;
							else if (i_374_ > 255)
								i_374_ = 255;
							i_375_ *= f_373_;
							if (i_375_ < 0)
								i_375_ = 0;
							else if (i_375_ > 255)
								i_375_ = 255;
							i_376_ *= f_373_;
							if (i_376_ < 0)
								i_376_ = 0;
							else if (i_376_ > 255)
								i_376_ = 255;
							i_371_ = i_374_ << 16 | i_375_ << 8 | i_376_;
						}
					} else
						i_371_ = i_354_;
					Unsafe unsafe = (((Class_xa_Sub2) this).aClass_ra_Sub2_8791.anUnsafe8461);
					unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, (float) i_344_);
					((Class_xa_Sub2) this).aLong8825 += 4L;
					unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, (float) (method6416(i_344_, i_345_, 485117218) + i_350_));
					((Class_xa_Sub2) this).aLong8825 += 4L;
					unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, (float) i_345_);
					((Class_xa_Sub2) this).aLong8825 += 4L;
					unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, (float) i_344_);
					((Class_xa_Sub2) this).aLong8825 += 4L;
					unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, (float) i_345_);
					((Class_xa_Sub2) this).aLong8825 += 4L;
					if (((Class_xa_Sub2) this).anIntArrayArrayArray8807 != null) {
						unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, (is_323_ != null ? (float) (is_323_[i_343_] - 1) : 0.0F));
						((Class_xa_Sub2) this).aLong8825 += 4L;
					}
					if ((((Class_xa_Sub2) this).anInt8795 & 0x7) != 0) {
						unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, f_356_);
						((Class_xa_Sub2) this).aLong8825 += 4L;
						unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, f_357_);
						((Class_xa_Sub2) this).aLong8825 += 4L;
						unsafe.putFloat(((Class_xa_Sub2) this).aLong8825, f_358_);
						((Class_xa_Sub2) this).aLong8825 += 4L;
					}
					if (((Class_ra_Sub2) ((Class_xa_Sub2) this).aClass_ra_Sub2_8791).anInt8591 == 0) {
						int i_377_ = i_371_ & ~0xff00ff;
						i_377_ |= (i_371_ & 0xff0000) >> 16;
						i_377_ |= (i_371_ & 0xff) << 16;
						i_371_ = i_377_;
					}
					unsafe.putInt(((Class_xa_Sub2) this).aLong8824, ~0xffffff | i_371_);
					((Class_xa_Sub2) this).aLong8824 += 4L;
					i_370_ = ((Class_xa_Sub2) this).anInt8796++;
					is_342_[i_343_] = (short) i_370_;
					if (i_348_ != -1)
						class330_sub37s_316_[i_370_] = class330_sub37s_317_[i_343_];
					class497.method6097(new Class330_Sub24(is_342_[i_343_]), l);
				} else {
					is_342_[i_343_] = ((Class330_Sub24) class330).aShort7694;
					i_370_ = is_342_[i_343_] & 0xffff;
					if (i_348_ != -1 && ((class330_sub37s_317_[i_343_].aLong3341 * -6154793640677333111L) < (class330_sub37s_316_[i_370_].aLong3341 * -6154793640677333111L)))
						class330_sub37s_316_[i_370_] = class330_sub37s_317_[i_343_];
				}
				for (int i_378_ = 0; i_378_ < i_339_; i_378_++)
					class330_sub37s[i_378_].method3539(i_370_, i_354_, i_353_, f_355_);
				((Class_xa_Sub2) this).anInt8816++;
			}
		}
	}

	public void method6413(int i, int i_379_, int[] is, int[] is_380_, int[] is_381_, int[] is_382_, int[] is_383_, int[] is_384_, int[] is_385_, int[] is_386_, int[] is_387_, int[] is_388_, int[] is_389_, Class77 class77, boolean bool) {
		int i_390_ = is_386_.length;
		int[] is_391_ = new int[i_390_ * 3];
		int[] is_392_ = new int[i_390_ * 3];
		int[] is_393_ = new int[i_390_ * 3];
		int[] is_394_ = new int[i_390_ * 3];
		int[] is_395_ = new int[i_390_ * 3];
		int[] is_396_ = new int[i_390_ * 3];
		int[] is_397_ = is_380_ != null ? new int[i_390_ * 3] : null;
		int[] is_398_ = is_382_ != null ? new int[i_390_ * 3] : null;
		int i_399_ = 0;
		for (int i_400_ = 0; i_400_ < i_390_; i_400_++) {
			int i_401_ = is_383_[i_400_];
			int i_402_ = is_384_[i_400_];
			int i_403_ = is_385_[i_400_];
			is_391_[i_399_] = is[i_401_];
			is_392_[i_399_] = is_381_[i_401_];
			is_393_[i_399_] = is_386_[i_400_];
			is_395_[i_399_] = is_388_[i_400_];
			is_396_[i_399_] = is_389_[i_400_];
			is_394_[i_399_] = is_387_ != null ? is_387_[i_400_] : is_386_[i_400_];
			if (is_380_ != null)
				is_397_[i_399_] = is_380_[i_401_];
			if (is_382_ != null)
				is_398_[i_399_] = is_382_[i_401_];
			i_399_++;
			is_391_[i_399_] = is[i_402_];
			is_392_[i_399_] = is_381_[i_402_];
			is_393_[i_399_] = is_386_[i_400_];
			is_395_[i_399_] = is_388_[i_400_];
			is_396_[i_399_] = is_389_[i_400_];
			is_394_[i_399_] = is_387_ != null ? is_387_[i_400_] : is_386_[i_400_];
			if (is_380_ != null)
				is_397_[i_399_] = is_380_[i_402_];
			if (is_382_ != null)
				is_398_[i_399_] = is_382_[i_402_];
			i_399_++;
			is_391_[i_399_] = is[i_403_];
			is_392_[i_399_] = is_381_[i_403_];
			is_393_[i_399_] = is_386_[i_400_];
			is_395_[i_399_] = is_388_[i_400_];
			is_396_[i_399_] = is_389_[i_400_];
			is_394_[i_399_] = is_387_ != null ? is_387_[i_400_] : is_386_[i_400_];
			if (is_380_ != null)
				is_397_[i_399_] = is_380_[i_403_];
			if (is_382_ != null)
				is_398_[i_399_] = is_382_[i_403_];
			i_399_++;
		}
		method6425(i, i_379_, is_391_, is_397_, is_392_, is_398_, is_393_, is_394_, is_395_, is_396_, class77, bool);
	}
}
