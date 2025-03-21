/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class536 {
	public static int anInt6229;
	public int anInt6230;
	Class367 aClass367_6231 = new Class367(64);
	IndexTable aClass280_6232;
	static Class87 aClass87_6233;

	public Class536(Class435 class435, Class454 class454, IndexTable class280) {
		((Class536) this).aClass280_6232 = class280;
		if (null != ((Class536) this).aClass280_6232)
			anInt6230 = (((Class536) this).aClass280_6232.method2763(((Class103.aClass103_975.anInt982) * -989081113), -2034493731) * -625199781);
		else
			anInt6230 = 0;
	}

	public Class535 method6315(int i, int i_0_) {
		try {
			Class535 class535;
			synchronized (((Class536) this).aClass367_6231) {
				class535 = (Class535) ((Class536) this).aClass367_6231.get((long) i);
			}
			if (null != class535)
				return class535;
			byte[] is;
			synchronized (((Class536) this).aClass280_6232) {
				is = (((Class536) this).aClass280_6232.getFile(Class103.aClass103_975.anInt982 * -989081113, i));
			}
			class535 = new Class535();
			if (is != null)
				class535.method6308(new Buffer(is), (short) -7132);
			synchronized (((Class536) this).aClass367_6231) {
				((Class536) this).aClass367_6231.put(class535, (long) i);
			}
			return class535;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wf.r(").append(')').toString());
		}
	}

	public void method6316(int i) {
		try {
			synchronized (((Class536) this).aClass367_6231) {
				((Class536) this).aClass367_6231.method4298((byte) 119);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wf.j(").append(')').toString());
		}
	}

	public void method6317(int i, byte i_1_) {
		try {
			synchronized (((Class536) this).aClass367_6231) {
				((Class536) this).aClass367_6231.method4292(i, (byte) 6);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wf.i(").append(')').toString());
		}
	}

	public void method6318(int i) {
		try {
			synchronized (((Class536) this).aClass367_6231) {
				((Class536) this).aClass367_6231.method4296(-1816250764);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wf.p(").append(')').toString());
		}
	}

	static final void method6319(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_2_ > i_3_ ? i_2_ : i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wf.zj(").append(')').toString());
		}
	}
}
