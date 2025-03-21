/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class115 {
	
	int anInt1363;
	byte[] aByteArray1364;

	int method1413(int i) {
		try {
			short i_0_ = 0;
			for (int i_1_ = 0; i_1_ < 2; i_1_++)
				i_0_ |= ((((Class115) this).aByteArray1364[((((Class115) this).anInt1363 += 1879967599) * 1409234831) - 1]) & 0xff) << 8 * i_1_;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eq.r(").append(')').toString());
		}
	}

	Class115(byte[] is) {
		((Class115) this).aByteArray1364 = is;
		((Class115) this).anInt1363 = 0;
	}

	String method1414(int i) {
		try {
			int i_2_ = method1413(-976535413);
			if (i_2_ == -1)
				return null;
			if (i_2_ > 256)
				throw new RuntimeException_Sub3();
			String string = new String(((Class115) this).aByteArray1364, ((Class115) this).anInt1363 * 1409234831, i_2_);
			((Class115) this).anInt1363 += 1879967599 * i_2_;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eq.j(").append(')').toString());
		}
	}

	public static Class316 method1415(int i, int i_3_, int i_4_, int i_5_, int i_6_, byte i_7_) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub30_7894.method5841(-2146155267) != 0 && i_3_ != 0 && -1098735395 * Class333.anInt3360 < 50 && -1 != i) {
				Class316 class316 = new Class316((byte) 1, i, i_3_, i_4_, i_5_, 0, i_6_, null);
				Class333.aClass316Array3347[(Class333.anInt3360 += -228509835) * -1098735395 - 1] = class316;
				return class316;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eq.b(").append(')').toString());
		}
	}
}
