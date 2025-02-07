

public class Midi extends Class298 {
	byte[] aByteArray7258;
	Class440 aClass440_7259;
	
	Midi(RsByteBuffer buffer) {
		buffer.index = (buffer.buffer.length - 3) * 116413311;
		int i = buffer.readUnsignedByte();
		int i_0_ = buffer.readUnsignedShort();
		int typesCount = 14 + i * 10;
		buffer.index = 0;
		int type23Count = 0;
		int type2Count = 0;
		int type0Count = 0;
		int type1Count = 0;
		int type3Count = 0;
		int type4Count = 0;
		int type5Count = 0;
		int type6Count = 0;
		while_5_: for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int type2 = -1;
			  while(true) {
				int type = buffer.readUnsignedByte();
				if (type != type2)
					typesCount++;
				type2 = type & 0xf;
				if (type == 7) {
					continue while_5_;
				}
				if (type == 23)
					type23Count++;
				else if (type2 == 0)
					type0Count++;
				else if (type2 == 1)
					type1Count++;
				else if (type2 == 2)
					type2Count++;
				else if (type2 == 3)
					type3Count++;
				else if (type2 == 4)
					type4Count++;
				else if (type2 == 5)
					type5Count++;
				else {
					if (type2 != 6)
						throw new RuntimeException();
					type6Count++;
				}
			}
		}
		typesCount += 5 * type23Count;
		typesCount += 2 * (type0Count + type1Count + type2Count + type3Count + type5Count);
		typesCount += type4Count + type6Count;
		int i_13_ = buffer.index * 385051775;
		int i_14_ = i + type23Count + type2Count + type0Count + type1Count + type3Count + type4Count + type5Count + type6Count;
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
			buffer.readV(1692297361);
		typesCount += buffer.index * 385051775 - i_13_;
		int i_16_ = buffer.index * 385051775;
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
		int type3 = 0;
		for (int i_30_ = 0; i_30_ < type2Count; i_30_++) {
			type3 = type3 + buffer.readUnsignedByte() & 0x7f;
			if (type3 == 0 || type3 == 32)
				type6Count++;
			else if (type3 == 1)
				i_17_++;
			else if (type3 == 33)
				i_18_++;
			else if (type3 == 7)
				i_19_++;
			else if (type3 == 39)
				i_20_++;
			else if (type3 == 10)
				i_21_++;
			else if (type3 == 42)
				i_22_++;
			else if (type3 == 99)
				i_23_++;
			else if (type3 == 98)
				i_24_++;
			else if (type3 == 101)
				i_25_++;
			else if (type3 == 100)
				i_26_++;
			else if (type3 == 64 || type3 == 65 || type3 == 120 || type3 == 121 || type3 == 123)
				i_27_++;
			else
				i_28_++;
		}
		int i_31_ = 0;
		int i_32_ = buffer.index * 385051775;
		buffer.index += i_27_ * 116413311;
		int i_33_ = buffer.index * 385051775;
		buffer.index += type5Count * 116413311;
		int i_34_ = buffer.index * 385051775;
		buffer.index += type4Count * 116413311;
		int i_35_ = buffer.index * 385051775;
		buffer.index += type3Count * 116413311;
		int i_36_ = buffer.index * 385051775;
		buffer.index += i_17_ * 116413311;
		int i_37_ = buffer.index * 385051775;
		buffer.index += i_19_ * 116413311;
		int i_38_ = buffer.index * 385051775;
		buffer.index += i_21_ * 116413311;
		int i_39_ = buffer.index * 385051775;
		buffer.index += (type0Count + type1Count + type5Count) * 116413311;
		int i_40_ = buffer.index * 385051775;
		buffer.index += type0Count * 116413311;
		int i_41_ = buffer.index * 385051775;
		buffer.index += i_28_ * 116413311;
		int i_42_ = buffer.index * 385051775;
		buffer.index += type1Count * 116413311;
		int i_43_ = buffer.index * 385051775;
		buffer.index += i_18_ * 116413311;
		int i_44_ = buffer.index * 385051775;
		buffer.index += i_20_ * 116413311;
		int i_45_ = buffer.index * 385051775;
		buffer.index += i_22_ * 116413311;
		int i_46_ = buffer.index * 385051775;
		buffer.index += type6Count * 116413311;
		int i_47_ = buffer.index * 385051775;
		buffer.index += type3Count * 116413311;
		int i_48_ = buffer.index * 385051775;
		buffer.index += i_23_ * 116413311;
		int i_49_ = buffer.index * 385051775;
		buffer.index += i_24_ * 116413311;
		int i_50_ = buffer.index * 385051775;
		buffer.index += i_25_ * 116413311;
		int i_51_ = buffer.index * 385051775;
		buffer.index += i_26_ * 116413311;
		int i_52_ = buffer.index * 385051775;
		buffer.index += type23Count * 349239933;
		((Midi) this).aByteArray7258 = new byte[typesCount];
		RsByteBuffer buffer2 = new RsByteBuffer(((Midi) this).aByteArray7258);
		buffer2.writeInt(1297377380, -316974152);
		buffer2.writeInt(6, -588529934);
		buffer2.writeShort(i > 1 ? 1 : 0, 16711935);
		buffer2.writeShort(i, 16711935);
		buffer2.writeShort(i_0_, 16711935);
		buffer.index = i_13_ * 116413311;
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		int i_58_ = 0;
		int i_59_ = 0;
		int i_60_ = 0;
		int[] is = new int[128];
		type3 = 0;
		for (int i_61_ = 0; i_61_ < i; i_61_++) {
			buffer2.writeInt(1297379947, -1929295606);
			buffer2.index += 465653244;
			int i_62_ = buffer2.index * 385051775;
			int i_63_ = -1;
			while_6_: do {
				for (;;) {
					int i_64_ = buffer.readV(1692297361);
					buffer2.method3639(i_64_, -1081187550);
					int i_65_ = buffer.buffer[i_31_++] & 0xff;
					boolean bool = i_65_ != i_63_;
					i_63_ = i_65_ & 0xf;
					if (i_65_ == 7) {
						if (bool)
							buffer2.writeByte(255);
						buffer2.writeByte(47);
						buffer2.writeByte(0);
						break while_6_;
					}
					if (i_65_ == 23) {
						if (bool)
							buffer2.writeByte(255);
						buffer2.writeByte(81);
						buffer2.writeByte(3);
						buffer2.writeByte((buffer.buffer[i_52_++]));
						buffer2.writeByte((buffer.buffer[i_52_++]));
						buffer2.writeByte((buffer.buffer[i_52_++]));
					} else {
						i_54_ ^= i_65_ >> 4;
						if (i_63_ == 0) {
							if (bool)
								buffer2.writeByte(144 + i_54_);
							i_55_ += buffer.buffer[i_39_++];
							i_56_ += buffer.buffer[i_40_++];
							buffer2.writeByte(i_55_ & 0x7f);
							buffer2.writeByte(i_56_ & 0x7f);
						} else if (i_63_ == 1) {
							if (bool)
								buffer2.writeByte(128 + i_54_);
							i_55_ += buffer.buffer[i_39_++];
							i_57_ += buffer.buffer[i_42_++];
							buffer2.writeByte(i_55_ & 0x7f);
							buffer2.writeByte(i_57_ & 0x7f);
						} else if (i_63_ == 2) {
							if (bool)
								buffer2.writeByte(176 + i_54_);
							type3 = type3 + (buffer.buffer[i_16_++]) & 0x7f;
							buffer2.writeByte(type3);
							int i_66_;
							if (type3 == 0 || type3 == 32)
								i_66_ = buffer.buffer[i_46_++];
							else if (type3 == 1)
								i_66_ = buffer.buffer[i_36_++];
							else if (type3 == 33)
								i_66_ = buffer.buffer[i_43_++];
							else if (type3 == 7)
								i_66_ = buffer.buffer[i_37_++];
							else if (type3 == 39)
								i_66_ = buffer.buffer[i_44_++];
							else if (type3 == 10)
								i_66_ = buffer.buffer[i_38_++];
							else if (type3 == 42)
								i_66_ = buffer.buffer[i_45_++];
							else if (type3 == 99)
								i_66_ = buffer.buffer[i_48_++];
							else if (type3 == 98)
								i_66_ = buffer.buffer[i_49_++];
							else if (type3 == 101)
								i_66_ = buffer.buffer[i_50_++];
							else if (type3 == 100)
								i_66_ = buffer.buffer[i_51_++];
							else if (type3 == 64 || type3 == 65 || type3 == 120 || type3 == 121 || type3 == 123)
								i_66_ = buffer.buffer[i_32_++];
							else
								i_66_ = buffer.buffer[i_41_++];
							i_66_ += is[type3];
							is[type3] = i_66_;
							buffer2.writeByte(i_66_ & 0x7f);
						} else if (i_63_ == 3) {
							if (bool)
								buffer2.writeByte(224 + i_54_);
							i_58_ += buffer.buffer[i_47_++];
							i_58_ += buffer.buffer[i_35_++] << 7;
							buffer2.writeByte(i_58_ & 0x7f);
							buffer2.writeByte(i_58_ >> 7 & 0x7f);
						} else if (i_63_ == 4) {
							if (bool)
								buffer2.writeByte(208 + i_54_);
							i_59_ += buffer.buffer[i_34_++];
							buffer2.writeByte(i_59_ & 0x7f);
						} else if (i_63_ == 5) {
							if (bool)
								buffer2.writeByte(160 + i_54_);
							i_55_ += buffer.buffer[i_39_++];
							i_60_ += buffer.buffer[i_33_++];
							buffer2.writeByte(i_55_ & 0x7f);
							buffer2.writeByte(i_60_ & 0x7f);
						} else {
							if (i_63_ != 6) {
								break;
							}
							if (bool)
								buffer2.writeByte(192 + i_54_);
							buffer2.writeByte((buffer.buffer[i_46_++]));
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			buffer2.method3599((buffer2.index * 385051775) - i_62_, 1397495562);
		}
	}

	void method2904() {
		if (((Midi) this).aClass440_7259 == null) {
			((Midi) this).aClass440_7259 = new Class440(16);
			int[] is = new int[16];
			int[] is_67_ = new int[16];
			int[] is_68_ = is;
			is_67_[9] = 128;
			is_68_[9] = 128;
			Class103 class103 = new Class103(((Midi) this).aByteArray7258);
			int i = class103.method1088();
			for (int i_69_ = 0; i_69_ < i; i_69_++) {
				class103.method1089(i_69_);
				class103.method1091(i_69_);
				class103.method1098(i_69_);
			}
			while_7_: for (;;) {
				int i_70_ = class103.method1096();
				int i_71_ = ((Class103) class103).anIntArray1105[i_70_];

				while (((Class103) class103).anIntArray1105[i_70_] == i_71_) {
					class103.method1089(i_70_);
					int i_72_ = class103.method1092(i_70_);
					if (i_72_ == 1) {
						class103.method1090();
						class103.method1098(i_70_);
						if (!class103.method1097())
							break;
						break while_7_;
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
							Class298_Sub28 class298_sub28 = ((Class298_Sub28) ((Midi) this).aClass440_7259.method5852((long) i_82_));
							if (class298_sub28 == null) {
								class298_sub28 = new Class298_Sub28(new byte[128]);
								((Midi) this).aClass440_7259.method5858(class298_sub28, (long) i_82_);
							}
							class298_sub28.aByteArray7365[i_80_] = (byte) 1;
						}
					}
					class103.method1091(i_70_);
					class103.method1098(i_70_);
				}
			}
		}
	}

	static Midi method2905(CacheIndex class243, int i, int i_83_) {
		byte[] is = class243.getFileFromArchive(i, i_83_, (byte) -117);
		if (is == null)
			return null;
		return new Midi(new RsByteBuffer(is));
	}

	void method2906() {
		((Midi) this).aClass440_7259 = null;
	}
}
