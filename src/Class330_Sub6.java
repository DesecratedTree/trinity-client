/* Class330_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub6 extends Class330 {
	byte[] aByteArray7543;
	Class497 aClass497_7544;

	Class330_Sub6(Buffer class330_sub46) {
		class330_sub46.offset = (class330_sub46.payload.length - 3) * 323600977;
		int i = class330_sub46.readUnsignedByte(723967431);
		int i_0_ = class330_sub46.readUnsignedShort(796380209);
		int i_1_ = 14 + i * 10;
		class330_sub46.offset = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		while_7_: for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = -1;
			for (;;) {
				int i_12_ = class330_sub46.readUnsignedByte(1138115079);
				if (i_12_ != i_11_)
					i_1_++;
				i_11_ = i_12_ & 0xf;
				if (i_12_ == 7)
					continue while_7_;
				if (i_12_ == 23)
					i_2_++;
				else if (i_11_ == 0)
					i_4_++;
				else if (i_11_ == 1)
					i_5_++;
				else if (i_11_ == 2)
					i_3_++;
				else if (i_11_ == 3)
					i_6_++;
				else if (i_11_ == 4)
					i_7_++;
				else if (i_11_ == 5)
					i_8_++;
				else {
					if (i_11_ != 6)
						break;
					i_9_++;
				}
			}
			throw new RuntimeException();
		}
		i_1_ += 5 * i_2_;
		i_1_ += 2 * (i_4_ + i_5_ + i_3_ + i_6_ + i_8_);
		i_1_ += i_7_ + i_9_;
		int i_13_ = class330_sub46.offset * -824785231;
		int i_14_ = i + i_2_ + i_3_ + i_4_ + i_5_ + i_6_ + i_7_ + i_8_ + i_9_;
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
			class330_sub46.method3770(485008648);
		i_1_ += class330_sub46.offset * -824785231 - i_13_;
		int i_16_ = class330_sub46.offset * -824785231;
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_ = 0;
		int i_29_ = 0;
		for (int i_30_ = 0; i_30_ < i_3_; i_30_++) {
			i_29_ = i_29_ + class330_sub46.readUnsignedByte(1049473891) & 0x7f;
			if (i_29_ == 0 || i_29_ == 32)
				i_9_++;
			else if (i_29_ == 1)
				i_17_++;
			else if (i_29_ == 33)
				i_18_++;
			else if (i_29_ == 7)
				i_19_++;
			else if (i_29_ == 39)
				i_20_++;
			else if (i_29_ == 10)
				i_21_++;
			else if (i_29_ == 42)
				i_22_++;
			else if (i_29_ == 99)
				i_23_++;
			else if (i_29_ == 98)
				i_24_++;
			else if (i_29_ == 101)
				i_25_++;
			else if (i_29_ == 100)
				i_26_++;
			else if (i_29_ == 64 || i_29_ == 65 || i_29_ == 120 || i_29_ == 121 || i_29_ == 123)
				i_27_++;
			else
				i_28_++;
		}
		int i_31_ = 0;
		int i_32_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_27_ * 323600977;
		int i_33_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_8_ * 323600977;
		int i_34_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_7_ * 323600977;
		int i_35_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_6_ * 323600977;
		int i_36_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_17_ * 323600977;
		int i_37_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_19_ * 323600977;
		int i_38_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_21_ * 323600977;
		int i_39_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += (i_4_ + i_5_ + i_8_) * 323600977;
		int i_40_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_4_ * 323600977;
		int i_41_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_28_ * 323600977;
		int i_42_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_5_ * 323600977;
		int i_43_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_18_ * 323600977;
		int i_44_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_20_ * 323600977;
		int i_45_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_22_ * 323600977;
		int i_46_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_9_ * 323600977;
		int i_47_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_6_ * 323600977;
		int i_48_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_23_ * 323600977;
		int i_49_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_24_ * 323600977;
		int i_50_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_25_ * 323600977;
		int i_51_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_26_ * 323600977;
		int i_52_ = class330_sub46.offset * -824785231;
		class330_sub46.offset += i_2_ * 970802931;
		((Class330_Sub6) this).aByteArray7543 = new byte[i_1_];
		Buffer class330_sub46_53_ = new Buffer(((Class330_Sub6) this).aByteArray7543);
		class330_sub46_53_.addInt(1297377380, 1965508160);
		class330_sub46_53_.addInt(6, 1965508160);
		class330_sub46_53_.addShort(i > 1 ? 1 : 0, (byte) 60);
		class330_sub46_53_.addShort(i, (byte) 107);
		class330_sub46_53_.addShort(i_0_, (byte) 127);
		class330_sub46.offset = i_13_ * 323600977;
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		int i_58_ = 0;
		int i_59_ = 0;
		int i_60_ = 0;
		int[] is = new int[128];
		i_29_ = 0;
		for (int i_61_ = 0; i_61_ < i; i_61_++) {
			class330_sub46_53_.addInt(1297379947, 1965508160);
			class330_sub46_53_.offset += 1294403908;
			int i_62_ = class330_sub46_53_.offset * -824785231;
			int i_63_ = -1;
			while_8_: do {
				for (;;) {
					int i_64_ = class330_sub46.method3770(485008648);
					class330_sub46_53_.method3753(i_64_, 1907737090);
					int i_65_ = class330_sub46.payload[i_31_++] & 0xff;
					boolean bool = i_65_ != i_63_;
					i_63_ = i_65_ & 0xf;
					if (i_65_ == 7) {
						if (bool)
							class330_sub46_53_.addByte(255, (byte) 94);
						class330_sub46_53_.addByte(47, (byte) 2);
						class330_sub46_53_.addByte(0, (byte) 58);
						break while_8_;
					}
					if (i_65_ == 23) {
						if (bool)
							class330_sub46_53_.addByte(255, (byte) 50);
						class330_sub46_53_.addByte(81, (byte) 84);
						class330_sub46_53_.addByte(3, (byte) 122);
						class330_sub46_53_.addByte((class330_sub46.payload[i_52_++]), (byte) 122);
						class330_sub46_53_.addByte((class330_sub46.payload[i_52_++]), (byte) 48);
						class330_sub46_53_.addByte((class330_sub46.payload[i_52_++]), (byte) 119);
					} else {
						i_54_ ^= i_65_ >> 4;
						if (i_63_ == 0) {
							if (bool)
								class330_sub46_53_.addByte(144 + i_54_, (byte) 94);
							i_55_ += class330_sub46.payload[i_39_++];
							i_56_ += class330_sub46.payload[i_40_++];
							class330_sub46_53_.addByte(i_55_ & 0x7f, (byte) 84);
							class330_sub46_53_.addByte(i_56_ & 0x7f, (byte) 104);
						} else if (i_63_ == 1) {
							if (bool)
								class330_sub46_53_.addByte(128 + i_54_, (byte) 9);
							i_55_ += class330_sub46.payload[i_39_++];
							i_57_ += class330_sub46.payload[i_42_++];
							class330_sub46_53_.addByte(i_55_ & 0x7f, (byte) 37);
							class330_sub46_53_.addByte(i_57_ & 0x7f, (byte) 119);
						} else if (i_63_ == 2) {
							if (bool)
								class330_sub46_53_.addByte(176 + i_54_, (byte) 23);
							i_29_ = i_29_ + (class330_sub46.payload[i_16_++]) & 0x7f;
							class330_sub46_53_.addByte(i_29_, (byte) 108);
							int i_66_;
							if (i_29_ == 0 || i_29_ == 32)
								i_66_ = class330_sub46.payload[i_46_++];
							else if (i_29_ == 1)
								i_66_ = class330_sub46.payload[i_36_++];
							else if (i_29_ == 33)
								i_66_ = class330_sub46.payload[i_43_++];
							else if (i_29_ == 7)
								i_66_ = class330_sub46.payload[i_37_++];
							else if (i_29_ == 39)
								i_66_ = class330_sub46.payload[i_44_++];
							else if (i_29_ == 10)
								i_66_ = class330_sub46.payload[i_38_++];
							else if (i_29_ == 42)
								i_66_ = class330_sub46.payload[i_45_++];
							else if (i_29_ == 99)
								i_66_ = class330_sub46.payload[i_48_++];
							else if (i_29_ == 98)
								i_66_ = class330_sub46.payload[i_49_++];
							else if (i_29_ == 101)
								i_66_ = class330_sub46.payload[i_50_++];
							else if (i_29_ == 100)
								i_66_ = class330_sub46.payload[i_51_++];
							else if (i_29_ == 64 || i_29_ == 65 || i_29_ == 120 || i_29_ == 121 || i_29_ == 123)
								i_66_ = class330_sub46.payload[i_32_++];
							else
								i_66_ = class330_sub46.payload[i_41_++];
							i_66_ += is[i_29_];
							is[i_29_] = i_66_;
							class330_sub46_53_.addByte(i_66_ & 0x7f, (byte) 97);
						} else if (i_63_ == 3) {
							if (bool)
								class330_sub46_53_.addByte(224 + i_54_, (byte) 120);
							i_58_ += class330_sub46.payload[i_47_++];
							i_58_ += class330_sub46.payload[i_35_++] << 7;
							class330_sub46_53_.addByte(i_58_ & 0x7f, (byte) 35);
							class330_sub46_53_.addByte(i_58_ >> 7 & 0x7f, (byte) 94);
						} else if (i_63_ == 4) {
							if (bool)
								class330_sub46_53_.addByte(208 + i_54_, (byte) 56);
							i_59_ += class330_sub46.payload[i_34_++];
							class330_sub46_53_.addByte(i_59_ & 0x7f, (byte) 27);
						} else if (i_63_ == 5) {
							if (bool)
								class330_sub46_53_.addByte(160 + i_54_, (byte) 94);
							i_55_ += class330_sub46.payload[i_39_++];
							i_60_ += class330_sub46.payload[i_33_++];
							class330_sub46_53_.addByte(i_55_ & 0x7f, (byte) 34);
							class330_sub46_53_.addByte(i_60_ & 0x7f, (byte) 74);
						} else {
							if (i_63_ != 6)
								break;
							if (bool)
								class330_sub46_53_.addByte(192 + i_54_, (byte) 88);
							class330_sub46_53_.addByte((class330_sub46.payload[i_46_++]), (byte) 60);
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class330_sub46_53_.method3750((class330_sub46_53_.offset * -824785231) - i_62_, -1266681606);
		}
	}

	void method3274() {
		if (((Class330_Sub6) this).aClass497_7544 == null) {
			((Class330_Sub6) this).aClass497_7544 = new Class497(16);
			int[] is = new int[16];
			int[] is_67_ = new int[16];
			int[] is_68_ = is;
			is_67_[9] = 128;
			is_68_[9] = 128;
			Class107 class107 = new Class107(((Class330_Sub6) this).aByteArray7543);
			int i = class107.method1328();
			for (int i_69_ = 0; i_69_ < i; i_69_++) {
				class107.method1333(i_69_);
				class107.method1334(i_69_);
				class107.method1340(i_69_);
			}
			while_9_: for (;;) {
				int i_70_ = class107.method1339();
				int i_71_ = ((Class107) class107).anIntArray1012[i_70_];
				while (((Class107) class107).anIntArray1012[i_70_] == i_71_) {
					class107.method1333(i_70_);
					int i_72_ = class107.method1335(i_70_);
					if (i_72_ == 1) {
						class107.method1341();
						class107.method1340(i_70_);
						if (!class107.method1338())
							break;
						break while_9_;
					}
					int i_73_ = i_72_ & 0xf0;
					if (i_73_ == 176) {
						int i_74_ = i_72_ & 0xf;
						int i_75_ = i_72_ >> 8 & 0x7f;
						int i_76_ = i_72_ >> 16 & 0x7f;
						if (i_75_ == 0)
							is[i_74_] = (is[i_74_] & ~0x1fc000) + (i_76_ << 14);
						if (i_75_ == 32)
							is[i_74_] = (is[i_74_] & ~0x3f80) + (i_76_ << 7);
					}
					if (i_73_ == 192) {
						int i_77_ = i_72_ & 0xf;
						int i_78_ = i_72_ >> 8 & 0x7f;
						is_67_[i_77_] = is[i_77_] + i_78_;
					}
					if (i_73_ == 144) {
						int i_79_ = i_72_ & 0xf;
						int i_80_ = i_72_ >> 8 & 0x7f;
						int i_81_ = i_72_ >> 16 & 0x7f;
						if (i_81_ > 0) {
							int i_82_ = is_67_[i_79_];
							Class330_Sub35 class330_sub35 = ((Class330_Sub35) ((Class330_Sub6) this).aClass497_7544.method6094((long) i_82_));
							if (class330_sub35 == null) {
								class330_sub35 = new Class330_Sub35(new byte[128]);
								((Class330_Sub6) this).aClass497_7544.method6097(class330_sub35, (long) i_82_);
							}
							((byte[]) class330_sub35.anObject7733)[i_80_] = (byte) 1;
						}
					}
					class107.method1334(i_70_);
					class107.method1340(i_70_);
				}
			}
		}
	}

	void method3275() {
		((Class330_Sub6) this).aClass497_7544 = null;
	}

}
