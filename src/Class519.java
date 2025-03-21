/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class519 {
	Class367 aClass367_6014 = new Class367(64);
	IndexTable aClass280_6015;

	public Class519(Class435 class435, Class454 class454, IndexTable class280) {
		((Class519) this).aClass280_6015 = class280;
		((Class519) this).aClass280_6015.method2763((-989081113 * (Class103.aClass103_955.anInt982)), -2063994006);
	}

	public Class512 method6217(int i, byte i_0_) {
		try {
			Class512 class512;
			synchronized (((Class519) this).aClass367_6014) {
				class512 = (Class512) ((Class519) this).aClass367_6014.get((long) i);
			}
			if (class512 != null)
				return class512;
			byte[] is;
			synchronized (((Class519) this).aClass280_6015) {
				is = (((Class519) this).aClass280_6015.getFile(-989081113 * Class103.aClass103_955.anInt982, i));
			}
			class512 = new Class512();
			if (null != is)
				class512.method6187(new Buffer(is), -225890361);
			synchronized (((Class519) this).aClass367_6014) {
				((Class519) this).aClass367_6014.put(class512, (long) i);
			}
			return class512;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vl.r(").append(')').toString());
		}
	}

	public void method6218(int i) {
		try {
			synchronized (((Class519) this).aClass367_6014) {
				((Class519) this).aClass367_6014.method4296(-1255623053);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vl.p(").append(')').toString());
		}
	}

	public void method6219(byte i) {
		try {
			synchronized (((Class519) this).aClass367_6014) {
				((Class519) this).aClass367_6014.method4298((byte) 58);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vl.j(").append(')').toString());
		}
	}

	public void method6220(int i, int i_1_) {
		try {
			synchronized (((Class519) this).aClass367_6014) {
				((Class519) this).aClass367_6014.method4292(i, (byte) 6);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vl.i(").append(')').toString());
		}
	}

	static final void method6221(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1639912027;
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_3_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_4_ = (((Class430) class430).anIntArray4387[2 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_5_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 3]);
			int i_6_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 4]);
			if (i_4_ == -1)
				throw new RuntimeException();
			Class506 class506 = Class211.aClass505_2062.method6140(i_4_, 1419283240);
			if (i_3_ != class506.aChar5926)
				throw new RuntimeException();
			if (class506.aChar5921 != i_2_)
				throw new RuntimeException();
			int[] is = class506.method6147(Integer.valueOf(i_5_), 16777472);
			if (i_6_ < 0 || is == null || is.length <= i_6_)
				throw new RuntimeException();
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = is[i_6_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vl.vb(").append(')').toString());
		}
	}

	static final void method6222(Class430 class430, byte i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (client.anInt9257 * -843487341 == 2 && i_7_ < 652732387 * client.anInt9256)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = client.aClass99Array9259[i_7_].aString912;
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vl.wn(").append(')').toString());
		}
	}
}
