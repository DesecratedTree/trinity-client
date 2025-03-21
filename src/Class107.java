/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class107 {
	int[] anIntArray1010;
	static int anInt1011 = 0;
	int[] anIntArray1012;
	int anInt1013;
	static int anInt1014 = 500000;
	int[] anIntArray1015;
	int anInt1016;
	Buffer aClass330_Sub46_1017;
	long aLong1018;
	static byte[] aByteArray1019 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int[] anIntArray1020;
	static int anInt1021 = 1;
	static int anInt1022 = 2;
	static int anInt1023 = 3;

	int method1328() {
		return ((Class107) this).anIntArray1020.length;
	}

	void method1329(byte[] is) {
		((Class107) this).aClass330_Sub46_1017.payload = is;
		((Class107) this).aClass330_Sub46_1017.offset = -1058957526;
		int i = ((Class107) this).aClass330_Sub46_1017.readUnsignedShort(1408229597);
		((Class107) this).anInt1013 = ((Class107) this).aClass330_Sub46_1017.readUnsignedShort(-100350412);
		((Class107) this).anInt1016 = 500000;
		((Class107) this).anIntArray1010 = new int[i];
		int i_0_ = 0;
		while (i_0_ < i) {
			int i_1_ = ((Class107) this).aClass330_Sub46_1017.readInt((byte) 97);
			int i_2_ = ((Class107) this).aClass330_Sub46_1017.readInt((byte) 78);
			if (i_1_ == 1297379947) {
				((Class107) this).anIntArray1010[i_0_] = (((Class107) this).aClass330_Sub46_1017.offset * -824785231);
				i_0_++;
			}
			((Class107) this).aClass330_Sub46_1017.offset += i_2_ * 323600977;
		}
		((Class107) this).aLong1018 = 0L;
		((Class107) this).anIntArray1020 = new int[i];
		for (i_0_ = 0; i_0_ < i; i_0_++)
			((Class107) this).anIntArray1020[i_0_] = ((Class107) this).anIntArray1010[i_0_];
		((Class107) this).anIntArray1012 = new int[i];
		((Class107) this).anIntArray1015 = new int[i];
	}

	void method1330() {
		((Class107) this).aClass330_Sub46_1017.payload = null;
		((Class107) this).anIntArray1010 = null;
		((Class107) this).anIntArray1020 = null;
		((Class107) this).anIntArray1012 = null;
		((Class107) this).anIntArray1015 = null;
	}

	boolean method1331() {
		return ((Class107) this).aClass330_Sub46_1017.payload != null;
	}

	long method1332(int i) {
		return (((Class107) this).aLong1018 + (long) i * (long) ((Class107) this).anInt1016);
	}

	void method1333(int i) {
		((Class107) this).aClass330_Sub46_1017.offset = ((Class107) this).anIntArray1020[i] * 323600977;
	}

	void method1334(int i) {
		int i_3_ = ((Class107) this).aClass330_Sub46_1017.method3770(485008648);
		((Class107) this).anIntArray1012[i] += i_3_;
	}

	int method1335(int i) {
		int i_4_ = method1342(i);
		return i_4_;
	}

	int method1336(int i, int i_5_) {
		if (i_5_ == 255) {
			int i_6_ = ((Class107) this).aClass330_Sub46_1017.readUnsignedByte(2068058038);
			int i_7_ = ((Class107) this).aClass330_Sub46_1017.method3770(485008648);
			if (i_6_ == 47) {
				((Class107) this).aClass330_Sub46_1017.offset += i_7_ * 323600977;
				return 1;
			}
			if (i_6_ == 81) {
				int i_8_ = ((Class107) this).aClass330_Sub46_1017.readUnsignedTriByte(-1401356047);
				i_7_ -= 3;
				int i_9_ = ((Class107) this).anIntArray1012[i];
				((Class107) this).aLong1018 += (long) i_9_ * (long) (((Class107) this).anInt1016 - i_8_);
				((Class107) this).anInt1016 = i_8_;
				((Class107) this).aClass330_Sub46_1017.offset += i_7_ * 323600977;
				return 2;
			}
			((Class107) this).aClass330_Sub46_1017.offset += i_7_ * 323600977;
			return 3;
		}
		byte i_10_ = aByteArray1019[i_5_ - 128];
		int i_11_ = i_5_;
		if (i_10_ >= 1)
			i_11_ |= ((Class107) this).aClass330_Sub46_1017.readUnsignedByte(2118370422) << 8;
		if (i_10_ >= 2)
			i_11_ |= ((Class107) this).aClass330_Sub46_1017.readUnsignedByte(1186048405) << 16;
		return i_11_;
	}

	void method1337(long l) {
		((Class107) this).aLong1018 = l;
		int i = ((Class107) this).anIntArray1020.length;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			((Class107) this).anIntArray1012[i_12_] = 0;
			((Class107) this).anIntArray1015[i_12_] = 0;
			((Class107) this).aClass330_Sub46_1017.offset = ((Class107) this).anIntArray1010[i_12_] * 323600977;
			method1334(i_12_);
			((Class107) this).anIntArray1020[i_12_] = (((Class107) this).aClass330_Sub46_1017.offset * -824785231);
		}
	}

	boolean method1338() {
		int i = ((Class107) this).anIntArray1020.length;
		for (int i_13_ = 0; i_13_ < i; i_13_++) {
			if (((Class107) this).anIntArray1020[i_13_] >= 0)
				return false;
		}
		return true;
	}

	int method1339() {
		int i = ((Class107) this).anIntArray1020.length;
		int i_14_ = -1;
		int i_15_ = 2147483647;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			if (((Class107) this).anIntArray1020[i_16_] >= 0 && ((Class107) this).anIntArray1012[i_16_] < i_15_) {
				i_14_ = i_16_;
				i_15_ = ((Class107) this).anIntArray1012[i_16_];
			}
		}
		return i_14_;
	}

	void method1340(int i) {
		((Class107) this).anIntArray1020[i] = ((Class107) this).aClass330_Sub46_1017.offset * -824785231;
	}

	Class107() {
		((Class107) this).aClass330_Sub46_1017 = new Buffer(null);
	}

	Class107(byte[] is) {
		((Class107) this).aClass330_Sub46_1017 = new Buffer(null);
		method1329(is);
	}

	void method1341() {
		((Class107) this).aClass330_Sub46_1017.offset = -323600977;
	}

	int method1342(int i) {
		int i_17_ = (((Class107) this).aClass330_Sub46_1017.payload[(((Class107) this).aClass330_Sub46_1017.offset * -824785231)]);
		if (i_17_ < 0) {
			i_17_ &= 0xff;
			((Class107) this).anIntArray1015[i] = i_17_;
			((Class107) this).aClass330_Sub46_1017.offset += 323600977;
		} else
			i_17_ = ((Class107) this).anIntArray1015[i];
		if (i_17_ == 240 || i_17_ == 247) {
			int i_18_ = ((Class107) this).aClass330_Sub46_1017.method3770(485008648);
			if (i_17_ == 247 && i_18_ > 0) {
				int i_19_ = ((((Class107) this).aClass330_Sub46_1017.payload[(((Class107) this).aClass330_Sub46_1017.offset * -824785231)]) & 0xff);
				if (i_19_ >= 241 && i_19_ <= 243 || i_19_ == 246 || i_19_ == 248 || i_19_ >= 250 && i_19_ <= 252 || i_19_ == 254) {
					((Class107) this).aClass330_Sub46_1017.offset += 323600977;
					((Class107) this).anIntArray1015[i] = i_19_;
					return method1336(i, i_19_);
				}
			}
			((Class107) this).aClass330_Sub46_1017.offset += i_18_ * 323600977;
			return 0;
		}
		return method1336(i, i_17_);
	}
}
