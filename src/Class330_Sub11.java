/* Class330_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub11 extends Class330 {
	Class116[] aClass116Array7591;
	Class330_Sub29_Sub1[] aClass330_Sub29_Sub1Array7592 = new Class330_Sub29_Sub1[128];
	short[] aShortArray7593 = new short[128];
	int anInt7594;
	byte[] aByteArray7595;
	byte[] aByteArray7596;
	byte[] aByteArray7597 = new byte[128];
	int[] anIntArray7598;

	Class330_Sub11(byte[] is) {
		((Class330_Sub11) this).aByteArray7595 = new byte[128];
		((Class330_Sub11) this).aClass116Array7591 = new Class116[128];
		((Class330_Sub11) this).aByteArray7596 = new byte[128];
		((Class330_Sub11) this).anIntArray7598 = new int[128];
		Buffer class330_sub46 = new Buffer(is);
		int i;
		for (i = 0; 0 != (class330_sub46.payload[i + -824785231 * class330_sub46.offset]); i++) {
			/* empty */
		}
		byte[] is_0_ = new byte[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++)
			is_0_[i_1_] = class330_sub46.readByte((byte) -16);
		class330_sub46.offset += 323600977;
		i++;
		int i_2_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i * 323600977;
		int i_3_;
		for (i_3_ = 0; ((class330_sub46.payload[-824785231 * class330_sub46.offset + i_3_]) != 0); i_3_++) {
			/* empty */
		}
		byte[] is_4_ = new byte[i_3_];
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
			is_4_[i_5_] = class330_sub46.readByte((byte) 10);
		class330_sub46.offset += 323600977;
		i_3_++;
		int i_6_ = -824785231 * class330_sub46.offset;
		class330_sub46.offset += 323600977 * i_3_;
		int i_7_;
		for (i_7_ = 0; 0 != (class330_sub46.payload[-824785231 * class330_sub46.offset + i_7_]); i_7_++) {
			/* empty */
		}
		byte[] is_8_ = new byte[i_7_];
		for (int i_9_ = 0; i_9_ < i_7_; i_9_++)
			is_8_[i_9_] = class330_sub46.readByte((byte) -1);
		class330_sub46.offset += 323600977;
		byte[] is_10_ = new byte[++i_7_];
		int i_11_;
		if (i_7_ > 1) {
			is_10_[1] = (byte) 1;
			int i_12_ = 1;
			i_11_ = 2;
			for (int i_13_ = 2; i_13_ < i_7_; i_13_++) {
				int i_14_ = class330_sub46.readUnsignedByte(690097612);
				if (i_14_ == 0)
					i_12_ = i_11_++;
				else {
					if (i_14_ <= i_12_)
						i_14_--;
					i_12_ = i_14_;
				}
				is_10_[i_13_] = (byte) i_12_;
			}
		} else
			i_11_ = i_7_;
		Class116[] class116s = new Class116[i_11_];
		for (int i_15_ = 0; i_15_ < class116s.length; i_15_++) {
			Class116 class116 = class116s[i_15_] = new Class116();
			int i_16_ = class330_sub46.readUnsignedByte(238247461);
			if (i_16_ > 0)
				((Class116) class116).aByteArray1373 = new byte[2 * i_16_];
			i_16_ = class330_sub46.readUnsignedByte(-22284680);
			if (i_16_ > 0) {
				((Class116) class116).aByteArray1370 = new byte[2 + i_16_ * 2];
				((Class116) class116).aByteArray1370[1] = (byte) 64;
			}
		}
		int i_17_ = class330_sub46.readUnsignedByte(-278253109);
		byte[] is_18_ = i_17_ > 0 ? new byte[2 * i_17_] : null;
		i_17_ = class330_sub46.readUnsignedByte(1470730538);
		byte[] is_19_ = i_17_ > 0 ? new byte[2 * i_17_] : null;
		int i_20_;
		for (i_20_ = 0; 0 != (class330_sub46.payload[-824785231 * class330_sub46.offset + i_20_]); i_20_++) {
			/* empty */
		}
		byte[] is_21_ = new byte[i_20_];
		for (int i_22_ = 0; i_22_ < i_20_; i_22_++)
			is_21_[i_22_] = class330_sub46.readByte((byte) -1);
		class330_sub46.offset += 323600977;
		i_20_++;
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < 128; i_24_++) {
			i_23_ += class330_sub46.readUnsignedByte(1029821946);
			((Class330_Sub11) this).aShortArray7593[i_24_] = (short) i_23_;
		}
		i_23_ = 0;
		for (int i_25_ = 0; i_25_ < 128; i_25_++) {
			i_23_ += class330_sub46.readUnsignedByte(-196776432);
			((Class330_Sub11) this).aShortArray7593[i_25_] += i_23_ << 8;
		}
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_ = 0;
		for (int i_29_ = 0; i_29_ < 128; i_29_++) {
			if (0 == i_26_) {
				if (i_27_ < is_21_.length)
					i_26_ = is_21_[i_27_++];
				else
					i_26_ = -1;
				i_28_ = class330_sub46.method3770(485008648);
			}
			((Class330_Sub11) this).aShortArray7593[i_29_] += (i_28_ - 1 & 0x2) << 14;
			((Class330_Sub11) this).anIntArray7598[i_29_] = i_28_;
			i_26_--;
		}
		i_26_ = 0;
		i_27_ = 0;
		int i_30_ = 0;
		for (int i_31_ = 0; i_31_ < 128; i_31_++) {
			if (0 != ((Class330_Sub11) this).anIntArray7598[i_31_]) {
				if (i_26_ == 0) {
					if (i_27_ < is_0_.length)
						i_26_ = is_0_[i_27_++];
					else
						i_26_ = -1;
					i_30_ = class330_sub46.payload[i_2_++] - 1;
				}
				((Class330_Sub11) this).aByteArray7596[i_31_] = (byte) i_30_;
				i_26_--;
			}
		}
		i_26_ = 0;
		i_27_ = 0;
		int i_32_ = 0;
		for (int i_33_ = 0; i_33_ < 128; i_33_++) {
			if (((Class330_Sub11) this).anIntArray7598[i_33_] != 0) {
				if (0 == i_26_) {
					if (i_27_ < is_4_.length)
						i_26_ = is_4_[i_27_++];
					else
						i_26_ = -1;
					i_32_ = class330_sub46.payload[i_6_++] + 16 << 2;
				}
				((Class330_Sub11) this).aByteArray7595[i_33_] = (byte) i_32_;
				i_26_--;
			}
		}
		i_26_ = 0;
		i_27_ = 0;
		Class116 class116 = null;
		for (int i_34_ = 0; i_34_ < 128; i_34_++) {
			if (((Class330_Sub11) this).anIntArray7598[i_34_] != 0) {
				if (i_26_ == 0) {
					class116 = class116s[is_10_[i_27_]];
					if (i_27_ < is_8_.length)
						i_26_ = is_8_[i_27_++];
					else
						i_26_ = -1;
				}
				((Class330_Sub11) this).aClass116Array7591[i_34_] = class116;
				i_26_--;
			}
		}
		i_26_ = 0;
		i_27_ = 0;
		int i_35_ = 0;
		for (int i_36_ = 0; i_36_ < 128; i_36_++) {
			if (0 == i_26_) {
				if (i_27_ < is_21_.length)
					i_26_ = is_21_[i_27_++];
				else
					i_26_ = -1;
				if (((Class330_Sub11) this).anIntArray7598[i_36_] > 0)
					i_35_ = class330_sub46.readUnsignedByte(1378245220) + 1;
			}
			((Class330_Sub11) this).aByteArray7597[i_36_] = (byte) i_35_;
			i_26_--;
		}
		((Class330_Sub11) this).anInt7594 = (class330_sub46.readUnsignedByte(1490073628) + 1) * -678765329;
		for (int i_37_ = 0; i_37_ < i_11_; i_37_++) {
			Class116 class116_38_ = class116s[i_37_];
			if (null != ((Class116) class116_38_).aByteArray1373) {
				for (int i_39_ = 1; i_39_ < ((Class116) class116_38_).aByteArray1373.length; i_39_ += 2)
					((Class116) class116_38_).aByteArray1373[i_39_] = class330_sub46.readByte((byte) 23);
			}
			if (((Class116) class116_38_).aByteArray1370 != null) {
				for (int i_40_ = 3; (i_40_ < ((Class116) class116_38_).aByteArray1370.length - 2); i_40_ += 2)
					((Class116) class116_38_).aByteArray1370[i_40_] = class330_sub46.readByte((byte) -73);
			}
		}
		if (null != is_18_) {
			for (int i_41_ = 1; i_41_ < is_18_.length; i_41_ += 2)
				is_18_[i_41_] = class330_sub46.readByte((byte) 45);
		}
		if (is_19_ != null) {
			for (int i_42_ = 1; i_42_ < is_19_.length; i_42_ += 2)
				is_19_[i_42_] = class330_sub46.readByte((byte) 31);
		}
		for (int i_43_ = 0; i_43_ < i_11_; i_43_++) {
			Class116 class116_44_ = class116s[i_43_];
			if (((Class116) class116_44_).aByteArray1370 != null) {
				i_23_ = 0;
				for (int i_45_ = 2; i_45_ < ((Class116) class116_44_).aByteArray1370.length; i_45_ += 2) {
					i_23_ = i_23_ + 1 + class330_sub46.readUnsignedByte(778032866);
					((Class116) class116_44_).aByteArray1370[i_45_] = (byte) i_23_;
				}
			}
		}
		for (int i_46_ = 0; i_46_ < i_11_; i_46_++) {
			Class116 class116_47_ = class116s[i_46_];
			if (((Class116) class116_47_).aByteArray1373 != null) {
				i_23_ = 0;
				for (int i_48_ = 2; i_48_ < ((Class116) class116_47_).aByteArray1373.length; i_48_ += 2) {
					i_23_ = 1 + i_23_ + class330_sub46.readUnsignedByte(1166200370);
					((Class116) class116_47_).aByteArray1373[i_48_] = (byte) i_23_;
				}
			}
		}
		if (is_18_ != null) {
			i_23_ = class330_sub46.readUnsignedByte(1714502074);
			is_18_[0] = (byte) i_23_;
			for (int i_49_ = 2; i_49_ < is_18_.length; i_49_ += 2) {
				i_23_ = 1 + i_23_ + class330_sub46.readUnsignedByte(1742716749);
				is_18_[i_49_] = (byte) i_23_;
			}
			int i_50_ = is_18_[0];
			int i_51_ = is_18_[1];
			for (int i_52_ = 0; i_52_ < i_50_; i_52_++)
				((Class330_Sub11) this).aByteArray7597[i_52_] = (byte) (32 + i_51_ * (((Class330_Sub11) this).aByteArray7597[i_52_]) >> 6);
			for (int i_53_ = 2; i_53_ < is_18_.length; i_53_ += 2) {
				int i_54_ = is_18_[i_53_];
				int i_55_ = is_18_[1 + i_53_];
				int i_56_ = i_51_ * (i_54_ - i_50_) + (i_54_ - i_50_) / 2;
				for (int i_57_ = i_50_; i_57_ < i_54_; i_57_++) {
					int i_58_ = Class81.method950(i_56_, i_54_ - i_50_, (byte) 120);
					((Class330_Sub11) this).aByteArray7597[i_57_] = (byte) (32 + (((Class330_Sub11) this).aByteArray7597[i_57_]) * i_58_ >> 6);
					i_56_ += i_55_ - i_51_;
				}
				i_50_ = i_54_;
				i_51_ = i_55_;
			}
			for (int i_59_ = i_50_; i_59_ < 128; i_59_++)
				((Class330_Sub11) this).aByteArray7597[i_59_] = (byte) (32 + (((Class330_Sub11) this).aByteArray7597[i_59_]) * i_51_ >> 6);
			Object object = null;
		}
		if (null != is_19_) {
			i_23_ = class330_sub46.readUnsignedByte(276905052);
			is_19_[0] = (byte) i_23_;
			for (int i_60_ = 2; i_60_ < is_19_.length; i_60_ += 2) {
				i_23_ = 1 + i_23_ + class330_sub46.readUnsignedByte(1420437706);
				is_19_[i_60_] = (byte) i_23_;
			}
			int i_61_ = is_19_[0];
			int i_62_ = is_19_[1] << 1;
			for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
				int i_64_ = i_62_ + (((Class330_Sub11) this).aByteArray7595[i_63_] & 0xff);
				if (i_64_ < 0)
					i_64_ = 0;
				if (i_64_ > 128)
					i_64_ = 128;
				((Class330_Sub11) this).aByteArray7595[i_63_] = (byte) i_64_;
			}
			for (int i_65_ = 2; i_65_ < is_19_.length; i_65_ += 2) {
				int i_66_ = is_19_[i_65_];
				int i_67_ = is_19_[i_65_ + 1] << 1;
				int i_68_ = i_62_ * (i_66_ - i_61_) + (i_66_ - i_61_) / 2;
				for (int i_69_ = i_61_; i_69_ < i_66_; i_69_++) {
					int i_70_ = Class81.method950(i_68_, i_66_ - i_61_, (byte) 13);
					int i_71_ = ((((Class330_Sub11) this).aByteArray7595[i_69_] & 0xff) + i_70_);
					if (i_71_ < 0)
						i_71_ = 0;
					if (i_71_ > 128)
						i_71_ = 128;
					((Class330_Sub11) this).aByteArray7595[i_69_] = (byte) i_71_;
					i_68_ += i_67_ - i_62_;
				}
				i_61_ = i_66_;
				i_62_ = i_67_;
			}
			for (int i_72_ = i_61_; i_72_ < 128; i_72_++) {
				int i_73_ = ((((Class330_Sub11) this).aByteArray7595[i_72_] & 0xff) + i_62_);
				if (i_73_ < 0)
					i_73_ = 0;
				if (i_73_ > 128)
					i_73_ = 128;
				((Class330_Sub11) this).aByteArray7595[i_72_] = (byte) i_73_;
			}
			Object object = null;
		}
		for (int i_74_ = 0; i_74_ < i_11_; i_74_++)
			((Class116) class116s[i_74_]).anInt1367 = class330_sub46.readUnsignedByte(-258907808) * -1542200509;
		for (int i_75_ = 0; i_75_ < i_11_; i_75_++) {
			Class116 class116_76_ = class116s[i_75_];
			if (((Class116) class116_76_).aByteArray1373 != null)
				((Class116) class116_76_).anInt1366 = class330_sub46.readUnsignedByte(429187381) * 1911689453;
			if (null != ((Class116) class116_76_).aByteArray1370)
				((Class116) class116_76_).anInt1368 = class330_sub46.readUnsignedByte(1409936322) * 727451379;
			if (-1353432725 * ((Class116) class116_76_).anInt1367 > 0)
				((Class116) class116_76_).anInt1365 = class330_sub46.readUnsignedByte(-180137697) * -246549433;
		}
		for (int i_77_ = 0; i_77_ < i_11_; i_77_++)
			((Class116) class116s[i_77_]).anInt1372 = class330_sub46.readUnsignedByte(1153671048) * -918201015;
		for (int i_78_ = 0; i_78_ < i_11_; i_78_++) {
			Class116 class116_79_ = class116s[i_78_];
			if (-115727111 * ((Class116) class116_79_).anInt1372 > 0)
				((Class116) class116_79_).anInt1371 = class330_sub46.readUnsignedByte(252376722) * -746374125;
		}
		for (int i_80_ = 0; i_80_ < i_11_; i_80_++) {
			Class116 class116_81_ = class116s[i_80_];
			if (-279581157 * ((Class116) class116_81_).anInt1371 > 0)
				((Class116) class116_81_).anInt1369 = class330_sub46.readUnsignedByte(1970920020) * -2060799;
		}
	}

	void method3289(int i) {
		try {
			((Class330_Sub11) this).anIntArray7598 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acq.i(").append(')').toString());
		}
	}

	boolean method3290(Class305 class305, byte[] is, int[] is_82_, int i) {
		try {
			boolean bool = true;
			int i_83_ = 0;
			Class330_Sub29_Sub1 class330_sub29_sub1 = null;
			for (int i_84_ = 0; i_84_ < 128; i_84_++) {
				if (null == is || 0 != is[i_84_]) {
					int i_85_ = ((Class330_Sub11) this).anIntArray7598[i_84_];
					if (0 == i_85_) {
						if (i >= -411270809) {
							/* empty */
						}
					} else {
						if (i_85_ != i_83_) {
							i_83_ = i_85_;
							if ((--i_85_ & 0x1) == 0)
								class330_sub29_sub1 = class305.method3041(i_85_ >> 2, is_82_, 1116948326);
							else
								class330_sub29_sub1 = class305.method3038(i_85_ >> 2, is_82_, 1114172775);
							if (class330_sub29_sub1 == null)
								bool = false;
						}
						if (null != class330_sub29_sub1) {
							((Class330_Sub11) this).aClass330_Sub29_Sub1Array7592[i_84_] = class330_sub29_sub1;
							((Class330_Sub11) this).anIntArray7598[i_84_] = 0;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acq.j(").append(')').toString());
		}
	}

	public static void method3291(int i) {
		try {
			Class490 class490 = null;
			try {
				class490 = Preferences.loadPreferences("2", client.aClass435_9146.aString4422, true, 295846241);
				Buffer class330_sub46 = new Buffer(-1204558774 * client.anInt9205 + 3);
				class330_sub46.addByte(1, (byte) 43);
				class330_sub46.addShort(-1632415561 * client.anInt9205, (byte) 114);
				for (int i_86_ = 0; i_86_ < Class555.anIntArray6382.length; i_86_++) {
					if (Class330_Sub26.aBooleanArray7696[i_86_]) {
						class330_sub46.addShort(i_86_, (byte) 95);
						class330_sub46.addInt((Class555.anIntArray6382[i_86_]), 1965508160);
					}
				}
				class490.method6068(class330_sub46.payload, 0, class330_sub46.offset * -824785231, -1154489731);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (class490 != null)
					class490.method6064(193439994);
			} catch (Exception exception) {
				/* empty */
			}
			client.aLong8990 = Class312.method3111((byte) 81) * -3014432960951782915L;
			client.aBoolean9206 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acq.go(").append(')').toString());
		}
	}

	static void method3292(int i) {
		try {
			Class330_Sub36_Sub3.aClass497_9653.method6100(65280);
			Class330_Sub36_Sub3.aClass472_9652.method5889(-1769384691);
			Class330_Sub36_Sub3.aClass472_9625.method5889(-746858487);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acq.j(").append(')').toString());
		}
	}
}
