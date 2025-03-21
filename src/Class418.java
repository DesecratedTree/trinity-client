/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class418 {
	public int anInt4294;
	public int anInt4295;
	Class367 aClass367_4296 = new Class367(64);
	IndexTable aClass280_4297;
	static Class330_Sub36_Sub10 aClass330_Sub36_Sub10_4298;

	public void method5269(byte i) {
		try {
			synchronized (((Class418) this).aClass367_4296) {
				((Class418) this).aClass367_4296.method4298((byte) 51);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rj.j(").append(')').toString());
		}
	}

	public void method5270(int i) {
		try {
			synchronized (((Class418) this).aClass367_4296) {
				((Class418) this).aClass367_4296.method4296(973048429);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rj.p(").append(')').toString());
		}
	}

	public Class425 method5271(int i, int i_0_) {
		try {
			Class425 class425;
			synchronized (((Class418) this).aClass367_4296) {
				class425 = (Class425) ((Class418) this).aClass367_4296.get((long) i);
			}
			if (class425 != null)
				return class425;
			byte[] is;
			synchronized (((Class418) this).aClass280_4297) {
				is = (((Class418) this).aClass280_4297.getFile(Class103.aClass103_928.anInt982 * -989081113, i));
			}
			class425 = new Class425();
			((Class425) class425).aClass418_4328 = this;
			((Class425) class425).anInt4329 = i * -1266828657;
			if (null != is)
				class425.method5310(new Buffer(is), (byte) 98);
			class425.method5309(1962440064);
			synchronized (((Class418) this).aClass367_4296) {
				((Class418) this).aClass367_4296.put(class425, (long) i);
			}
			return class425;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rj.r(").append(')').toString());
		}
	}

	public Class418(Class435 class435, Class454 class454, IndexTable class280) {
		anInt4294 = 0;
		((Class418) this).aClass280_4297 = class280;
		anInt4295 = (((Class418) this).aClass280_4297.method2763(((Class103.aClass103_928.anInt982) * -989081113), -2098324567) * -1364689249);
	}

	public void method5272(int i, byte i_1_) {
		try {
			synchronized (((Class418) this).aClass367_4296) {
				((Class418) this).aClass367_4296.method4292(i, (byte) 62);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rj.i(").append(')').toString());
		}
	}

	static void method5273(byte i) {
		try {
			Class3.aClass367_45.method4298((byte) 49);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rj.i(").append(')').toString());
		}
	}

	public static Class212 method5274(Buffer class330_sub46, int i) {
		try {
			int i_2_ = class330_sub46.readBigSmart(-2010908410);
			return new Class212(i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rj.r(").append(')').toString());
		}
	}

	static void method5275(int i, int i_3_, int i_4_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(16, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = 229745735 * i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rj.am(").append(')').toString());
		}
	}
}
