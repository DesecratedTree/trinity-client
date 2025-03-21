/* Buffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Buffer extends Class330 {
	public static int anInt7843 = 5000;
	public byte[] payload;
	static int[] anIntArray7845 = new int[256];
	public int offset;
	static int anInt7847 = -306674912;
	static long aLong7848 = -3932672073523589310L;
	public static int anInt7849 = 100;
	public static long[] aLongArray7850;
	static int OFFSET_INCREMENT = 323600977;
	static int OFFSET_MULTIPLIER = -824785231;

	public Buffer(byte[] is) {
		payload = is;
		offset = 0;
	}

	public void method3739(byte i) {
		try {
			if (null != payload)
				Class50.method631(payload, (byte) 56);
			payload = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.i(").append(')').toString());
		}
	}

	public void addByte(int i, byte i_0_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.p(").append(')').toString());
		}
	}

	public void addShort(int i, byte i_1_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.o(").append(')').toString());
		}
	}

	public void method3742(int i, short i_2_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.s(").append(')').toString());
		}
	}

	public void method3743(int i, int i_3_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.f(").append(')').toString());
		}
	}

	public void addInt(int i, int i_4_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 24);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.z(").append(')').toString());
		}
	}

	public byte readByte(byte i) {
		try {
			return payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1];
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.al(").append(')').toString());
		}
	}

	public String readString(int i) {
		try {
			int i_5_ = OFFSET_MULTIPLIER * offset;
			while (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] != 0) {
				if (i <= -1676046053) {
					/* empty */
				}
			}
			int i_6_ = OFFSET_MULTIPLIER * offset - i_5_ - 1;
			if (0 == i_6_)
				return "";
			if (false) {
				String s = Class125.method1525(payload, i_5_, i_6_, (byte) 1);
				if (s.contains("Use this option to"))
					System.out.println(new Throwable().getStackTrace()[1].toString());
				return s;
			}
			return Class125.method1525(payload, i_5_, i_6_, (byte) 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ab(").append(')').toString());
		}
	}

	public void method3747(long l, int i, byte i_7_) {
		try {
			if (--i < 0 || i > 7)
				throw new IllegalArgumentException();
			for (int i_8_ = i * 8; i_8_ >= 0; i_8_ -= 8)
				payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.b(").append(')').toString());
		}
	}

	public void addString(String string, byte i) {
		try {
			int i_9_ = string.indexOf('\0');
			if (i_9_ >= 0)
				throw new IllegalArgumentException("");
			offset += Class275.method2717(string, 0, string.length(), payload, OFFSET_MULTIPLIER * offset, 420148766) * OFFSET_INCREMENT;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.x(").append(')').toString());
		}
	}

	public void method3749(byte[] is, int i, int i_10_, byte i_11_) {
		try {
			for (int i_12_ = i; i_12_ < i + i_10_; i_12_++)
				payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = is[i_12_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.m(").append(')').toString());
		}
	}

	public void method3750(int i, int i_13_) {
		try {
			payload[offset * OFFSET_MULTIPLIER - i - 4] = (byte) (i >> 24);
			payload[offset * OFFSET_MULTIPLIER - i - 3] = (byte) (i >> 16);
			payload[OFFSET_MULTIPLIER * offset - i - 2] = (byte) (i >> 8);
			payload[OFFSET_MULTIPLIER * offset - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.t(").append(')').toString());
		}
	}

	public void method3751(int i, int i_14_) {
		try {
			payload[OFFSET_MULTIPLIER * offset - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.y(").append(')').toString());
		}
	}

	public void method3752(int i, int i_15_) {
		try {
			if (i >= 0 && i < 128)
				addByte(i, (byte) 26);
			else if (i >= 0 && i < 32768)
				addShort(32768 + i, (byte) 24);
			else
				throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.v(").append(')').toString());
		}
	}

	public void method3753(int i, int i_16_) {
		try {
			if (0 != (i & ~0x7f)) {
				if ((i & ~0x3fff) != 0) {
					if ((i & ~0x1fffff) != 0) {
						if (0 != (i & ~0xfffffff))
							addByte(i >>> 28 | 0x80, (byte) 8);
						addByte(i >>> 21 | 0x80, (byte) 113);
					}
					addByte(i >>> 14 | 0x80, (byte) 93);
				}
				addByte(i >>> 7 | 0x80, (byte) 113);
			}
			addByte(i & 0x7f, (byte) 85);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ay(").append(')').toString());
		}
	}

	public void readBytes(byte[] is, int start, int length, int dummy) {
		try {
			for (int i = start; i < length + start; i++)
				is[i] = (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.az(").append(')').toString());
		}
	}

	public int readUnsignedTriByte(int i) {
		try {
			offset += 970802931;
			return (((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 8) + ((payload[offset * OFFSET_MULTIPLIER - 3] & 0xff) << 16) + (payload[OFFSET_MULTIPLIER * offset - 1] & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			//e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ap(").append(')').toString());
		}
	}

	public int readInt(byte i) {
		try {
			offset += 1294403908;
			return (((payload[offset * OFFSET_MULTIPLIER - 2] & 0xff) << 8) + (((payload[offset * OFFSET_MULTIPLIER - 4] & 0xff) << 24) + ((payload[OFFSET_MULTIPLIER * offset - 3] & 0xff) << 16)) + (payload[offset * OFFSET_MULTIPLIER - 1] & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			//e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.as(").append(')').toString());
		}
	}

	public int readUnsignedByteA(int i) {
		try {
			return ((payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] - 128) & 0xff);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bi(").append(')').toString());
		}
	}

	public long readLong(int i) {
		try {
			long l = (long) readInt((byte) 107) & 0xffffffffL;
			long l_20_ = (long) readInt((byte) 36) & 0xffffffffL;
			return l_20_ + (l << 32);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ad(").append(')').toString());
		}
	}

	public long method3759(int i, int i_21_) {
		try {
			if (--i < 0 || i > 7)
				throw new IllegalArgumentException();
			int i_22_ = 8 * i;
			long l = 0L;
			for (/**/; i_22_ >= 0; i_22_ -= 8)
				l |= ((long) (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]) & 0xffL) << i_22_;
			return l;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.af(").append(')').toString());
		}
	}

	public float method3760(int i) {
		try {
			return Float.intBitsToFloat(readInt((byte) 72));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.aq(").append(')').toString());
		}
	}

	public String method3761(int i) {
		try {
			if (0 == payload[OFFSET_MULTIPLIER * offset]) {
				offset += OFFSET_INCREMENT;
				return null;
			}
			return readString(2008507607);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.aa(").append(')').toString());
		}
	}

	public Buffer(int i) {
		payload = Class439.method5596(i, 409390889);
		offset = 0;
	}

	public String readJagString(byte i) {
		try {
			byte i_23_ = payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1];
			if (i_23_ != 0)
				throw new IllegalStateException("");
			int i_24_ = offset * OFFSET_MULTIPLIER;
			while_10_: do {
				do {
					if ((payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]) == 0)
						break while_10_;
				} while (i == 6);
				throw new IllegalStateException();
			} while (false);
			int i_25_ = offset * OFFSET_MULTIPLIER - i_24_ - 1;
			if (0 == i_25_)
				return "";
			return Class125.method1525(payload, i_24_, i_25_, (byte) 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ak(").append(')').toString());
		}
	}

	public void addLEShortA(int i, int i_26_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (128 + i);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bq(").append(')').toString());
		}
	}

	public int method3764(byte i) {
		try {
			int i_27_ = payload[OFFSET_MULTIPLIER * offset] & 0xff;
			if (i_27_ < 128)
				return readUnsignedByte(353609420) - 64;
			return readUnsignedShort(-131807351) - 49152;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ah(").append(')').toString());
		}
	}

	public int readSmart(int i) {
		try {
			int i_28_ = payload[OFFSET_MULTIPLIER * offset] & 0xff;
			if (i_28_ < 128)
				return readUnsignedByte(1405354875);
			return readUnsignedShort(-405188396) - 32768;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.av(").append(')').toString());
		}
	}

	public int method3766(int i) {
		try {
			int i_29_ = payload[offset * OFFSET_MULTIPLIER] & 0xff;
			if (i_29_ < 128)
				return readUnsignedByte(2059111289) - 1;
			return readUnsignedShort(-58714110) - 32769;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ar(").append(')').toString());
		}
	}

	public int method3767(int i) {
		try {
			int i_30_ = 0;
			int i_31_;
			for (i_31_ = readSmart(-46870897); i_31_ == 32767; i_31_ = readSmart(-1032069089))
				i_30_ += 32767;
			i_30_ += i_31_;
			return i_30_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.am(").append(')').toString());
		}
	}

	public int method3768(int i) {
		try {
			if (payload[offset * OFFSET_MULTIPLIER] < 0)
				return readInt((byte) 7) & 0x7fffffff;
			return readUnsignedShort(1163353694);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.au(").append(')').toString());
		}
	}

	public int readBigSmart(int i) {
		try {
			if (payload[offset * OFFSET_MULTIPLIER] < 0)
				return readInt((byte) 9) & 0x7fffffff;
			int i_32_ = readUnsignedShort(1125700821);
			if (32767 == i_32_)
				return -1;
			return i_32_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ae(").append(')').toString());
		}
	}

	public int method3770(int i) {
		try {
			int i_33_ = payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1];
			int i_34_ = 0;
			for (/**/; i_33_ < 0; i_33_ = (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]))
				i_34_ = (i_34_ | i_33_ & 0x7f) << 7;
			return i_34_ | i_33_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ao(").append(')').toString());
		}
	}

	public void method3771(int[] is, int i) {
		try {
			int i_35_ = offset * OFFSET_MULTIPLIER / 8;
			offset = 0;
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				int i_37_ = readInt((byte) 13);
				int i_38_ = readInt((byte) 48);
				int i_39_ = -957401312;
				int i_40_ = -1640531527;
				int i_41_ = 32;
				while (i_41_-- > 0) {
					i_38_ -= ((i_37_ << 4 ^ i_37_ >>> 5) + i_37_ ^ i_39_ + is[i_39_ >>> 11 & 0x3]);
					i_39_ -= i_40_;
					i_37_ -= (i_38_ + (i_38_ << 4 ^ i_38_ >>> 5) ^ i_39_ + is[i_39_ & 0x3]);
				}
				offset -= -1706159480;
				addInt(i_37_, 1965508160);
				addInt(i_38_, 1965508160);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bg(").append(')').toString());
		}
	}

	public void method3772(int i, byte i_42_) {
		try {
			payload[OFFSET_MULTIPLIER * offset - i - 2] = (byte) (i >> 8);
			payload[offset * OFFSET_MULTIPLIER - i - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.h(").append(')').toString());
		}
	}

	public int readUnsignedByte(int i) {
		try {
			return (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] & 0xff);
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bt(").append(')').toString());
		}
	}

	public void applyRSA(BigInteger biginteger, BigInteger biginteger_43_, int i) {
		try {
			int i_44_ = OFFSET_MULTIPLIER * offset;
			offset = 0;
			byte[] is = new byte[i_44_];
			readBytes(is, 0, i_44_, 1274334002);
			BigInteger biginteger_45_ = new BigInteger(is);
			BigInteger biginteger_46_ = Loader.rsaDisabled ? biginteger_45_ : biginteger_45_.modPow(biginteger, biginteger_43_);
			byte[] is_47_ = biginteger_46_.toByteArray();
			offset = 0;
			addShort(is_47_.length, (byte) 29);
			method3749(is_47_, 0, is_47_.length, (byte) 18);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bt(").append(')').toString());
		}
	}

	public int method3775(int i, int i_48_) {
		try {
			int i_49_ = Class106.method1325(payload, i, OFFSET_MULTIPLIER * offset, -2053639507);
			addInt(i_49_, 1965508160);
			return i_49_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bc(").append(')').toString());
		}
	}

	public boolean method3776(int i) {
		try {
			offset -= 1294403908;
			int i_50_ = Class106.method1325(payload, 0, OFFSET_MULTIPLIER * offset, -2067414759);
			int i_51_ = readInt((byte) 34);
			if (i_50_ == i_51_)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bf(").append(')').toString());
		}
	}

	public void method3777(int i, int i_52_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (0 - i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bk(").append(')').toString());
		}
	}

	public int readUnsignedByteC(int i) {
		try {
			return (0 - (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]) & 0xff);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bz(").append(')').toString());
		}
	}

	public int readUnsignedByteS(int i) {
		try {
			return (128 - (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]) & 0xff);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.be(").append(')').toString());
		}
	}

	public int readShort(int i) {
		try {
			offset += 647201954;
			int i_53_ = ((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) + ((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 8));
			if (i_53_ > 32767)
				i_53_ -= 65536;
			return i_53_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.aw(").append(')').toString());
		}
	}

	public byte readByteS(byte i) {
		try {
			return (byte) (128 - (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bx(").append(')').toString());
		}
	}

	public void addLEShort(int i, int i_54_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ba(").append(')').toString());
		}
	}

	public void addShortA(int i, int i_55_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i + 128);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bm(").append(')').toString());
		}
	}

	public int readUnsignedLEShort(int i) {
		try {
			offset += 647201954;
			return (((payload[OFFSET_MULTIPLIER * offset - 1] & 0xff) << 8) + (payload[OFFSET_MULTIPLIER * offset - 2] & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bn(").append(')').toString());
		}
	}

	public int readUnsignedShortA(byte i) {
		try {
			offset += 647201954;
			return (((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 8) + (payload[OFFSET_MULTIPLIER * offset - 1] - 128 & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bu(").append(')').toString());
		}
	}

	public int readUnsignedLEShortA(int i) {
		try {
			offset += 647201954;
			return (((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) << 8) + (payload[offset * OFFSET_MULTIPLIER - 2] - 128 & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bv(").append(')').toString());
		}
	}

	public void method3787(int i, int i_56_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bd(").append(')').toString());
		}
	}

	public int read24BitUnsignedIntegerV2(byte i) {
		try {
			offset += 970802931;
			return ((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) + (((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) << 8) + ((payload[offset * OFFSET_MULTIPLIER - 3] & 0xff) << 16)));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bb(").append(')').toString());
		}
	}

	public void addLEInt(int i, int i_57_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ch(").append(')').toString());
		}
	}

	public void addInt2(int i, byte i_58_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 24);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.cz(").append(')').toString());
		}
	}

	public int readLEInt(int i) {
		try {
			offset += 1294403908;
			return ((payload[OFFSET_MULTIPLIER * offset - 4] & 0xff) + (((payload[offset * OFFSET_MULTIPLIER - 3] & 0xff) << 8) + (((payload[OFFSET_MULTIPLIER * offset - 1] & 0xff) << 24) + ((payload[offset * OFFSET_MULTIPLIER - 2] & 0xff) << 16))));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.cj(").append(')').toString());
		}
	}

	public int readInt1(byte i) {
		try {
			offset += 1294403908;
			return (((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 24) + ((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) << 16) + ((payload[OFFSET_MULTIPLIER * offset - 4] & 0xff) << 8) + (payload[OFFSET_MULTIPLIER * offset - 3] & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.cy(").append(')').toString());
		}
	}

	public int readInt2(int i) {
		try {
			offset += 1294403908;
			return (((payload[OFFSET_MULTIPLIER * offset - 3] & 0xff) << 24) + ((payload[OFFSET_MULTIPLIER * offset - 4] & 0xff) << 16) + ((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) << 8) + (payload[OFFSET_MULTIPLIER * offset - 2] & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.cb(").append(')').toString());
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_59_ = i;
			for (int i_60_ = 0; i_60_ < 8; i_60_++) {
				if ((i_59_ & 0x1) == 1)
					i_59_ = i_59_ >>> 1 ^ ~0x12477cdf;
				else
					i_59_ >>>= 1;
			}
			anIntArray7845[i] = i_59_;
		}
		aLongArray7850 = new long[256];
		for (int i = 0; i < 256; i++) {
			long l = (long) i;
			for (int i_61_ = 0; i_61_ < 8; i_61_++) {
				if ((l & 0x1L) == 1L)
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray7850[i] = l;
		}
	}

	public void method3794(String string, int i) {
		try {
			int i_62_ = string.indexOf('\0');
			if (i_62_ >= 0)
				throw new IllegalArgumentException("");
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) 0;
			offset += Class275.method2717(string, 0, string.length(), payload, OFFSET_MULTIPLIER * offset, 420148766) * OFFSET_INCREMENT;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.a(").append(')').toString());
		}
	}

	public int readUnsignedShort(int i) {
		try {
			offset += 647201954;
			return (((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 8) + (payload[OFFSET_MULTIPLIER * offset - 1] & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.at(").append(')').toString());
		}
	}
	
	public int readUnsignedShort2(int modelId, String name, int i) {
		try {
			offset += 647201954;
			if (OFFSET_MULTIPLIER * offset - 2 >= payload.length || OFFSET_MULTIPLIER * offset - 1 >= payload.length) {
				System.out.println("readUnsignedShort2: "+modelId+" "+name+" "+payload.length);
				return 0;
			}
			return (((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 8) + (payload[OFFSET_MULTIPLIER * offset - 1] & 0xff));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.at(").append(')').toString());
		}
	}

	public void addByteS(int i, int i_63_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (128 - i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.br(").append(')').toString());
		}
	}

	public int method3797(short i) {
		try {
			offset += 647201954;
			int i_64_ = (((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 8) + (payload[offset * OFFSET_MULTIPLIER - 1] - 128 & 0xff));
			if (i_64_ > 32767)
				i_64_ -= 65536;
			return i_64_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bj(").append(')').toString());
		}
	}

	public long method3798(short i) {
		try {
			long l = (long) method3806((byte) 105) & 0xffffffffL;
			long l_65_ = (long) method3806((byte) 105) & 0xffffffffL;
			return (l_65_ << 32) + l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.an(").append(')').toString());
		}
	}

	public void method3799(CharSequence charsequence, byte i) {
		try {
			int i_66_ = Class104.method1243(charsequence, 233137000);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) 0;
			method3753(i_66_, 1936974000);
			offset += Class390.method4602(payload, OFFSET_MULTIPLIER * offset, charsequence, (byte) 12) * OFFSET_INCREMENT;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.e(").append(')').toString());
		}
	}

	public void addByteA(int i, byte i_67_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (128 + i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bl(").append(')').toString());
		}
	}

	public int method3801(byte i) {
		try {
			offset += 647201954;
			int i_68_ = (((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) << 8) + (payload[OFFSET_MULTIPLIER * offset - 2] & 0xff));
			if (i_68_ > 32767)
				i_68_ -= 65536;
			return i_68_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bw(").append(')').toString());
		}
	}

	public void writeInt64BE(long l) {

		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 56);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 48);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 40);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 32);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 24);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.l(").append(')').toString());
		}
	}

	public void addInt1(int i, byte i_69_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 24);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ce(").append(')').toString());
		}
	}

	public String method3804(int i) {
		try {
			byte i_70_ = payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1];
			if (0 != i_70_)
				throw new IllegalStateException("");
			int i_71_ = method3770(485008648);
			if (offset * OFFSET_MULTIPLIER + i_71_ > payload.length)
				throw new IllegalStateException("");
			String string = Class330.method3257(payload, offset * OFFSET_MULTIPLIER, i_71_, 2074148158);
			offset += OFFSET_INCREMENT * i_71_;
			return string;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ag(").append(')').toString());
		}
	}

	public void method3805(int[] is, int i, int i_72_, byte i_73_) {
		try {
			int i_74_ = OFFSET_MULTIPLIER * offset;
			offset = OFFSET_INCREMENT * i;
			int i_75_ = (i_72_ - i) / 8;
			for (int i_76_ = 0; i_76_ < i_75_; i_76_++) {
				int i_77_ = readInt((byte) 99);
				int i_78_ = readInt((byte) 119);
				int i_79_ = -957401312;
				int i_80_ = -1640531527;
				int i_81_ = 32;
				while (i_81_-- > 0) {
					i_78_ -= ((i_77_ << 4 ^ i_77_ >>> 5) + i_77_ ^ is[i_79_ >>> 11 & 0x3] + i_79_);
					i_79_ -= i_80_;
					i_77_ -= ((i_78_ << 4 ^ i_78_ >>> 5) + i_78_ ^ i_79_ + is[i_79_ & 0x3]);
				}
				offset -= -1706159480;
				addInt(i_77_, 1965508160);
				addInt(i_78_, 1965508160);
			}
			offset = i_74_ * OFFSET_INCREMENT;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bo(").append(')').toString());
		}
	}

	public int method3806(byte i) {
		try {
			offset += 1294403908;
			return ((payload[OFFSET_MULTIPLIER * offset - 4] & 0xff) + (((payload[offset * OFFSET_MULTIPLIER - 3] & 0xff) << 8) + (((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) << 24) + ((payload[OFFSET_MULTIPLIER * offset - 2] & 0xff) << 16))));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.aj(").append(')').toString());
		}
	}

	public void method3807(int[] is, int i, int i_82_, byte i_83_) {
		try {
			int i_84_ = OFFSET_MULTIPLIER * offset;
			offset = OFFSET_INCREMENT * i;
			int i_85_ = (i_82_ - i) / 8;
			for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
				int i_87_ = readInt((byte) 126);
				int i_88_ = readInt((byte) 104);
				int i_89_ = 0;
				int i_90_ = -1640531527;
				int i_91_ = 32;
				while (i_91_-- > 0) {
					i_87_ += (i_88_ + (i_88_ << 4 ^ i_88_ >>> 5) ^ is[i_89_ & 0x3] + i_89_);
					i_89_ += i_90_;
					i_88_ += (i_87_ + (i_87_ << 4 ^ i_87_ >>> 5) ^ i_89_ + is[i_89_ >>> 11 & 0x3]);
				}
				offset -= -1706159480;
				addInt(i_87_, 1965508160);
				addInt(i_88_, 1965508160);
			}
			offset = OFFSET_INCREMENT * i_84_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bs(").append(')').toString());
		}
	}

	public byte readByteA(int i) {
		try {
			return (byte) ((payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]) - 128);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.by(").append(')').toString());
		}
	}

	public void method3809(int i, int i_92_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bh(").append(')').toString());
		}
	}

	public long method3810(int i) {
		try {
			long l = (long) readUnsignedByte(176511032) & 0xffffffffL;
			long l_93_ = (long) readInt((byte) 119) & 0xffffffffL;
			return (l << 32) + l_93_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ax(").append(')').toString());
		}
	}

	public void method3811(long l) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 32);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 24);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) (l >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.n(").append(')').toString());
		}
	}

	public int readTriByte(int i) {
		try {
			offset += 970802931;
			int i_94_ = ((payload[offset * OFFSET_MULTIPLIER - 1] & 0xff) + (((payload[offset * OFFSET_MULTIPLIER - 2] & 0xff) << 8) + ((payload[OFFSET_MULTIPLIER * offset - 3] & 0xff) << 16)));
			if (i_94_ > 8388607)
				i_94_ -= 16777216;
			return i_94_;
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ai(").append(')').toString());
		}
	}

	public void method3813(int i, byte i_95_) {
		try {
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) i;
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 8);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 16);
			payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.w(").append(')').toString());
		}
	}

	public byte readByteC(int i) {
		try {
			return (byte) (0 - (payload[(offset += OFFSET_INCREMENT) * OFFSET_MULTIPLIER - 1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("COULDN'T LOAD CORRECTLY FROM THE BUFFER.");
			e.printStackTrace();
			//return payload[0] & 0xff;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.bp(").append(')').toString());
		}
	}

	static final void method3815(byte i) {
		try {
			int[] is = Class15.anIntArray187;
			for (int i_96_ = 0; i_96_ < Class15.anInt192 * -1468156857; i_96_++) {
				Player class432_sub1_sub1_sub1_sub1 = client.players[is[i_96_]];
				if (null != class432_sub1_sub1_sub1_sub1)
					class432_sub1_sub1_sub1_sub1.method5425(-1549945444);
			}
			for (int i_97_ = 0; i_97_ < -823688441 * client.anInt9017; i_97_++) {
				long l = (long) client.anIntArray9018[i_97_];
				Class330_Sub35 class330_sub35 = (Class330_Sub35) client.aClass497_9014.method6094(l);
				if (class330_sub35 == null) {
					if (i == 1) {
						/* empty */
					}
				} else
					((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733).method5425(-1693421866);
			}
			if (0 == client.anInt8987 * 1909266069) {
				for (int i_98_ = 0; i_98_ < Class96.aClass85Array854.length; i_98_++) {
					Class85 class85 = Class96.aClass85Array854[i_98_];
					if (!class85.aBoolean705) {
						if (i == 1) {
							/* empty */
						}
					} else
						class85.method973(-1160484525).method5425(-1972668343);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.hz(").append(')').toString());
		}
	}

	static Class8 method3816(int i, int i_99_) {
		try {
			if (i == 0) {
				if ((double) Class354_Sub1.aFloat3507 == 3.0)
					return Class420.aClass8_4308;
				if ((double) Class354_Sub1.aFloat3507 == 4.0)
					return Class440.aClass8_4483;
				if (6.0 == (double) Class354_Sub1.aFloat3507)
					return Class362.aClass8_3799;
				if ((double) Class354_Sub1.aFloat3507 >= 8.0)
					return Class354_Sub1.aClass8_7985;
			} else if (i == 1) {
				if (3.0 == (double) Class354_Sub1.aFloat3507)
					return Class362.aClass8_3799;
				if ((double) Class354_Sub1.aFloat3507 == 4.0)
					return Class354_Sub1.aClass8_7985;
				if ((double) Class354_Sub1.aFloat3507 == 6.0)
					return Class533.aClass8_6915;
				if ((double) Class354_Sub1.aFloat3507 >= 8.0)
					return Class255.aClass8_2664;
			} else if (i == 2) {
				if ((double) Class354_Sub1.aFloat3507 == 3.0)
					return Class533.aClass8_6915;
				if (4.0 == (double) Class354_Sub1.aFloat3507)
					return Class255.aClass8_2664;
				if (6.0 == (double) Class354_Sub1.aFloat3507)
					return Class555.aClass8_6383;
				if ((double) Class354_Sub1.aFloat3507 >= 8.0)
					return Class152.aClass8_1630;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.ct(").append(')').toString());
		}
	}

	static void method3817(Class340[][][] class340s, byte i) {
		try {
			for (int i_100_ = 0; i_100_ < class340s.length; i_100_++) {
				Class340[][] class340s_101_ = class340s[i_100_];
				for (int i_102_ = 0; i_102_ < class340s_101_.length; i_102_++) {
					for (int i_103_ = 0; i_103_ < class340s_101_[i_102_].length; i_103_++) {
						Class340 class340 = class340s_101_[i_102_][i_103_];
						if (null == class340) {
							if (i >= 0) {
								/* empty */
							}
						} else {
							if (class340.aClass432_Sub1_Sub4_3386 instanceof Interface2)
								((Interface2) class340.aClass432_Sub1_Sub4_3386).method23(648722349);
							if (class340.aClass432_Sub1_Sub3_3384 instanceof Interface2)
								((Interface2) class340.aClass432_Sub1_Sub3_3384).method23(648722349);
							if (class340.aClass432_Sub1_Sub3_3385 instanceof Interface2)
								((Interface2) class340.aClass432_Sub1_Sub3_3385).method23(648722349);
							if (class340.aClass432_Sub1_Sub5_3382 instanceof Interface2)
								((Interface2) class340.aClass432_Sub1_Sub5_3382).method23(648722349);
							if (class340.aClass432_Sub1_Sub5_3383 instanceof Interface2)
								((Interface2) class340.aClass432_Sub1_Sub5_3383).method23(648722349);
							for (Class352 class352 = class340.aClass352_3388; class352 != null; class352 = class352.aClass352_3483) {
								Class432_Sub1_Sub1 class432_sub1_sub1 = class352.aClass432_Sub1_Sub1_3484;
								if (class432_sub1_sub1 instanceof Interface2)
									((Interface2) class432_sub1_sub1).method23(648722349);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aea.j(").append(')').toString());
		}
	}
}
