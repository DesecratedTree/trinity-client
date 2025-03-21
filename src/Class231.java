/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class231 implements Interface23 {
	public int anInt6763;
	IndexTable aClass280_6764;
	Class367 aClass367_6765 = new Class367(64);
	static Class61[] aClass61Array6766;

	public Class221 method2346(int i, int i_0_) {
		try {
			Class221 class221;
			synchronized (((Class231) this).aClass367_6765) {
				class221 = (Class221) ((Class231) this).aClass367_6765.get((long) i);
			}
			if (null != class221)
				return class221;
			byte[] is;
			synchronized (((Class231) this).aClass280_6764) {
				is = (((Class231) this).aClass280_6764.getFile(-989081113 * Class103.aClass103_933.anInt982, i));
			}
			class221 = new Class221();
			if (null != is)
				class221.method2267(new Buffer(is), (byte) -74);
			synchronized (((Class231) this).aClass367_6765) {
				((Class231) this).aClass367_6765.put(class221, (long) i);
			}
			return class221;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jr.r(").append(')').toString());
		}
	}

	public void method2347(int i) {
		try {
			synchronized (((Class231) this).aClass367_6765) {
				((Class231) this).aClass367_6765.method4298((byte) 122);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jr.j(").append(')').toString());
		}
	}

	public void method2348(int i, int i_1_) {
		try {
			synchronized (((Class231) this).aClass367_6765) {
				((Class231) this).aClass367_6765.method4292(i, (byte) 101);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jr.i(").append(')').toString());
		}
	}

	public void method2349(int i) {
		try {
			synchronized (((Class231) this).aClass367_6765) {
				((Class231) this).aClass367_6765.method4296(1103333332);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jr.p(").append(')').toString());
		}
	}

	public Class231(Class435 class435, Class454 class454, IndexTable class280) {
		((Class231) this).aClass280_6764 = class280;
		if (((Class231) this).aClass280_6764 != null)
			anInt6763 = (((Class231) this).aClass280_6764.method2763(-989081113 * Class103.aClass103_933.anInt982, -2030891108)) * 1802266611;
		else
			anInt6763 = 0;
	}

	public static void method2350(int i, byte i_2_) {
		try {
			Exception_Sub1.method342(i, 1232021218);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jr.j(").append(')').toString());
		}
	}

	static final void method2351(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5835((byte) 89) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jr.apq(").append(')').toString());
		}
	}

	public static byte[] method2352(String string, int i) {
		try {
			int i_3_ = string.length();
			if (i_3_ == 0)
				return new byte[0];
			int i_4_ = i_3_ + 3 & ~0x3;
			int i_5_ = 3 * (i_4_ / 4);
			if (i_4_ - 2 >= i_3_ || (Class470.method5864(string.charAt(i_4_ - 2), (byte) -37) == -1))
				i_5_ -= 2;
			else if (i_4_ - 1 >= i_3_ || Class470.method5864(string.charAt(i_4_ - 1), (byte) -26) == -1)
				i_5_--;
			byte[] is = new byte[i_5_];
			Class51.method635(string, is, 0, 410839024);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jr.i(").append(')').toString());
		}
	}
}
