/* Class502 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class502 {
	int anInt5899;
	public static int anInt5900 = 64;
	static int anInt5901 = 10;
	long[] aLongArray5902;
	static long[][] aLongArrayArray5903 = new long[8][256];
	static long[] aLongArray5904 = new long[11];
	byte[] aByteArray5905 = new byte[32];
	byte[] aByteArray5906 = new byte[64];
	int anInt5907 = 0;
	static String aString5908 = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
	long[] aLongArray5909;
	long[] aLongArray5910;
	static int anInt5911 = 512;
	long[] aLongArray5912;
	long[] aLongArray5913;

	void method6128(byte[] is, long l) {
		try {
			int i = 0;
			int i_0_ = 8 - ((int) l & 0x7) & 0x7;
			int i_1_ = ((Class502) this).anInt5907 * -1728608581 & 0x7;
			long l_2_ = l;
			int i_3_ = 31;
			int i_4_ = 0;
			for (/**/; i_3_ >= 0; i_3_--) {
				i_4_ += (((int) l_2_ & 0xff) + (((Class502) this).aByteArray5905[i_3_] & 0xff));
				((Class502) this).aByteArray5905[i_3_] = (byte) i_4_;
				i_4_ >>>= 8;
				l_2_ >>>= 8;
			}
			while (l > 8L) {
				int i_5_ = is[i] << i_0_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_0_;
				if (i_5_ < 0 || i_5_ >= 256)
					throw new RuntimeException();
				((Class502) this).aByteArray5906[935018147 * (((Class502) this).anInt5899)] |= i_5_ >>> i_1_;
				((Class502) this).anInt5899 += -2119539445;
				((Class502) this).anInt5907 += (8 - i_1_) * 1391251059;
				if (((Class502) this).anInt5907 * -1728608581 == 512) {
					method6129((byte) 79);
					((Class502) this).anInt5899 = 0;
					((Class502) this).anInt5907 = 0;
				}
				((Class502) this).aByteArray5906[935018147 * (((Class502) this).anInt5899)] = (byte) (i_5_ << 8 - i_1_ & 0xff);
				((Class502) this).anInt5907 += 1391251059 * i_1_;
				l -= 8L;
				i++;
			}
			int i_6_;
			if (l > 0L) {
				i_6_ = is[i] << i_0_ & 0xff;
				((Class502) this).aByteArray5906[935018147 * (((Class502) this).anInt5899)] |= i_6_ >>> i_1_;
			} else
				i_6_ = 0;
			if (l + (long) i_1_ < 8L)
				((Class502) this).anInt5907 += 1391251059L * l;
			else {
				((Class502) this).anInt5899 += -2119539445;
				((Class502) this).anInt5907 += (8 - i_1_) * 1391251059;
				l -= (long) (8 - i_1_);
				if (512 == ((Class502) this).anInt5907 * -1728608581) {
					method6129((byte) 55);
					((Class502) this).anInt5899 = 0;
					((Class502) this).anInt5907 = 0;
				}
				((Class502) this).aByteArray5906[(((Class502) this).anInt5899 * 935018147)] = (byte) (i_6_ << 8 - i_1_ & 0xff);
				((Class502) this).anInt5907 += 1391251059 * (int) l;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("us.i(").append(')').toString());
		}
	}

	void method6129(byte i) {
		try {
			int i_7_ = 0;
			int i_8_ = 0;
			while (i_7_ < 8) {
				((Class502) this).aLongArray5912[i_7_] = ((long) ((Class502) this).aByteArray5906[i_8_] << 56 ^ ((long) ((Class502) this).aByteArray5906[1 + i_8_] & 0xffL) << 48 ^ ((long) ((Class502) this).aByteArray5906[i_8_ + 2] & 0xffL) << 40 ^ ((long) ((Class502) this).aByteArray5906[3 + i_8_] & 0xffL) << 32 ^ ((long) ((Class502) this).aByteArray5906[i_8_ + 4] & 0xffL) << 24 ^ ((long) ((Class502) this).aByteArray5906[i_8_ + 5] & 0xffL) << 16 ^ ((long) ((Class502) this).aByteArray5906[i_8_ + 6] & 0xffL) << 8 ^ ((long) ((Class502) this).aByteArray5906[7 + i_8_] & 0xffL));
				i_7_++;
				i_8_ += 8;
			}
			for (i_7_ = 0; i_7_ < 8; i_7_++)
				((Class502) this).aLongArray5913[i_7_] = (((Class502) this).aLongArray5912[i_7_] ^ (((Class502) this).aLongArray5910[i_7_] = ((Class502) this).aLongArray5909[i_7_]));
			for (i_7_ = 1; i_7_ <= 10; i_7_++) {
				for (i_8_ = 0; i_8_ < 8; i_8_++) {
					((Class502) this).aLongArray5902[i_8_] = 0L;
					int i_9_ = 0;
					int i_10_ = 56;
					while (i_9_ < 8) {
						((Class502) this).aLongArray5902[i_8_] ^= (aLongArrayArray5903[i_9_][(int) ((((Class502) this).aLongArray5910[i_8_ - i_9_ & 0x7]) >>> i_10_) & 0xff]);
						i_9_++;
						i_10_ -= 8;
					}
				}
				for (i_8_ = 0; i_8_ < 8; i_8_++)
					((Class502) this).aLongArray5910[i_8_] = ((Class502) this).aLongArray5902[i_8_];
				((Class502) this).aLongArray5910[0] ^= aLongArray5904[i_7_];
				for (i_8_ = 0; i_8_ < 8; i_8_++) {
					((Class502) this).aLongArray5902[i_8_] = ((Class502) this).aLongArray5910[i_8_];
					int i_11_ = 0;
					int i_12_ = 56;
					while (i_11_ < 8) {
						((Class502) this).aLongArray5902[i_8_] ^= (aLongArrayArray5903[i_11_][(int) ((((Class502) this).aLongArray5913[i_8_ - i_11_ & 0x7]) >>> i_12_) & 0xff]);
						i_11_++;
						i_12_ -= 8;
					}
				}
				for (i_8_ = 0; i_8_ < 8; i_8_++)
					((Class502) this).aLongArray5913[i_8_] = ((Class502) this).aLongArray5902[i_8_];
			}
			for (i_7_ = 0; i_7_ < 8; i_7_++)
				((Class502) this).aLongArray5909[i_7_] ^= (((Class502) this).aLongArray5913[i_7_] ^ ((Class502) this).aLongArray5912[i_7_]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("us.r(").append(')').toString());
		}
	}

	Class502() {
		((Class502) this).anInt5899 = 0;
		((Class502) this).aLongArray5909 = new long[8];
		((Class502) this).aLongArray5910 = new long[8];
		((Class502) this).aLongArray5902 = new long[8];
		((Class502) this).aLongArray5912 = new long[8];
		((Class502) this).aLongArray5913 = new long[8];
	}

	void method6130(int i) {
		try {
			for (int i_13_ = 0; i_13_ < 32; i_13_++)
				((Class502) this).aByteArray5905[i_13_] = (byte) 0;
			((Class502) this).anInt5899 = 0;
			((Class502) this).anInt5907 = 0;
			((Class502) this).aByteArray5906[0] = (byte) 0;
			for (int i_14_ = 0; i_14_ < 8; i_14_++)
				((Class502) this).aLongArray5909[i_14_] = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("us.j(").append(')').toString());
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_15_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886".charAt(i / 2);
			long l = ((i & 0x1) == 0 ? (long) (i_15_ >>> 8) : (long) (i_15_ & 0xff));
			long l_16_ = l << 1;
			if (l_16_ >= 256L)
				l_16_ ^= 0x11dL;
			long l_17_ = l_16_ << 1;
			if (l_17_ >= 256L)
				l_17_ ^= 0x11dL;
			long l_18_ = l_17_ ^ l;
			long l_19_ = l_17_ << 1;
			if (l_19_ >= 256L)
				l_19_ ^= 0x11dL;
			long l_20_ = l_19_ ^ l;
			aLongArrayArray5903[0][i] = (l << 56 | l << 48 | l_17_ << 40 | l << 32 | l_19_ << 24 | l_18_ << 16 | l_16_ << 8 | l_20_);
			for (int i_21_ = 1; i_21_ < 8; i_21_++)
				aLongArrayArray5903[i_21_][i] = (aLongArrayArray5903[i_21_ - 1][i] >>> 8 | aLongArrayArray5903[i_21_ - 1][i] << 56);
		}
		aLongArray5904[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_22_ = (i - 1) * 8;
			aLongArray5904[i] = (aLongArrayArray5903[0][i_22_] & ~0xffffffffffffffL ^ aLongArrayArray5903[1][i_22_ + 1] & 0xff000000000000L ^ aLongArrayArray5903[2][2 + i_22_] & 0xff0000000000L ^ aLongArrayArray5903[3][i_22_ + 3] & 0xff00000000L ^ aLongArrayArray5903[4][i_22_ + 4] & 0xff000000L ^ aLongArrayArray5903[5][i_22_ + 5] & 0xff0000L ^ aLongArrayArray5903[6][i_22_ + 6] & 0xff00L ^ aLongArrayArray5903[7][7 + i_22_] & 0xffL);
		}
	}

	void method6131(byte[] is, int i, int i_23_) {
		try {
			((Class502) this).aByteArray5906[(((Class502) this).anInt5899 * 935018147)] |= 128 >>> (((Class502) this).anInt5907 * -1728608581 & 0x7);
			((Class502) this).anInt5899 += -2119539445;
			if (935018147 * ((Class502) this).anInt5899 > 32) {
				while (((Class502) this).anInt5899 * 935018147 < 64)
					((Class502) this).aByteArray5906[((((Class502) this).anInt5899 += -2119539445) * 935018147) - 1] = (byte) 0;
				method6129((byte) 63);
				((Class502) this).anInt5899 = 0;
			}
			while (935018147 * ((Class502) this).anInt5899 < 32)
				((Class502) this).aByteArray5906[((((Class502) this).anInt5899 += -2119539445) * 935018147 - 1)] = (byte) 0;
			System.arraycopy(((Class502) this).aByteArray5905, 0, ((Class502) this).aByteArray5906, 32, 32);
			method6129((byte) 8);
			int i_24_ = 0;
			int i_25_ = i;
			while (i_24_ < 8) {
				long l = ((Class502) this).aLongArray5909[i_24_];
				is[i_25_] = (byte) (int) (l >>> 56);
				is[i_25_ + 1] = (byte) (int) (l >>> 48);
				is[2 + i_25_] = (byte) (int) (l >>> 40);
				is[3 + i_25_] = (byte) (int) (l >>> 32);
				is[4 + i_25_] = (byte) (int) (l >>> 24);
				is[5 + i_25_] = (byte) (int) (l >>> 16);
				is[i_25_ + 6] = (byte) (int) (l >>> 8);
				is[i_25_ + 7] = (byte) (int) l;
				i_24_++;
				i_25_ += 8;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("us.p(").append(')').toString());
		}
	}

	public static void method6132(int i, byte i_26_) {
		try {
			Class330_Sub43 class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6094((long) i));
			if (class330_sub43 != null) {
				((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3185(1439950216);
				Class147.method1742(-1340253797 * ((Class330_Sub43) class330_sub43).anInt7819, (((Class330_Sub43) class330_sub43).aBoolean7822), 841015966);
				class330_sub43.method3252(-1936698621);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("us.i(").append(')').toString());
		}
	}
}
