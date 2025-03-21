/* Class330_Sub46_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub46_Sub2 extends Buffer {
	static int[] anIntArray9834 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	IsaacCipher aClass488_9835;
	int anInt9836;

	public void method3820(int i) {
		try {
			((Class330_Sub46_Sub2) this).anInt9836 = -1819728920 * offset;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.if(").append(')').toString());
		}
	}

	public void method3821(IsaacCipher isaacCipher, int i) {
		try {
			((Class330_Sub46_Sub2) this).aClass488_9835 = isaacCipher;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.ia(").append(')').toString());
		}
	}

	public void method3822(int i, int i_0_) {
		try {
			payload[(offset += 323600977) * -824785231 - 1] = (byte) (i + ((Class330_Sub46_Sub2) this).aClass488_9835.method6043(6862074));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.ik(").append(')').toString());
		}
	}

	public int readBits(int i) {
		try {
			int i_2_ = ((Class330_Sub46_Sub2) this).anInt9836 * 1415546181 >> 3;
			int i_3_ = 8 - (((Class330_Sub46_Sub2) this).anInt9836 * 1415546181 & 0x7);
			int i_4_ = 0;
			((Class330_Sub46_Sub2) this).anInt9836 += i * -1038596723;
			for (/**/; i > i_3_; i_3_ = 8) {
				i_4_ += ((payload[i_2_++] & anIntArray9834[i_3_]) << i - i_3_);
				i -= i_3_;
			}
			if (i_3_ == i)
				i_4_ += payload[i_2_] & anIntArray9834[i_3_];
			else
				i_4_ += payload[i_2_] >> i_3_ - i & anIntArray9834[i];
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.ib(").append(')').toString());
		}
	}

	public void method3824(int i) {
		try {
			offset = ((7 + ((Class330_Sub46_Sub2) this).anInt9836 * 1415546181) / 8 * 323600977);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.ig(").append(')').toString());
		}
	}

	public boolean method3825(byte i) {
		try {
			int i_5_ = ((payload[-824785231 * offset] - ((Class330_Sub46_Sub2) this).aClass488_9835.method6042(1184443673)) & 0xff);
			if (i_5_ < 128)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.iz(").append(')').toString());
		}
	}

	public Class330_Sub46_Sub2(int i) {
		super(i);
	}

	public int method3826(int i) {
		try {
			int i_6_ = ((payload[(offset += 323600977) * -824785231 - 1] - ((Class330_Sub46_Sub2) this).aClass488_9835.method6043(55465209)) & 0xff);
			if (i_6_ < 128)
				return i_6_;
			return ((i_6_ - 128 << 8) + (((payload[(offset += 323600977) * -824785231 - 1]) - ((Class330_Sub46_Sub2) this).aClass488_9835.method6043(-1607658812)) & 0xff));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.il(").append(')').toString());
		}
	}

	public int method3827(int i, int i_7_) {
		try {
			return 8 * i - 1415546181 * ((Class330_Sub46_Sub2) this).anInt9836;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.ix(").append(')').toString());
		}
	}

	public void method3828(byte[] is, int i, int i_8_, int i_9_) {
		try {
			for (int i_10_ = 0; i_10_ < i_8_; i_10_++)
				is[i_10_ + i] = (byte) ((payload[(offset += 323600977) * -824785231 - 1]) - ((Class330_Sub46_Sub2) this).aClass488_9835.method6043(-1897927850));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajw.iw(").append(')').toString());
		}
	}
}
