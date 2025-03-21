/* Class552 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class552 {
	IndexTable aClass280_6358;
	IndexTable aClass280_6359;
	public static int anInt6360 = 64;
	public static int anInt6361 = 64;
	Class367 aClass367_6362 = new Class367(64);
	Class367 aClass367_6363 = new Class367(64);

	public Class522 method6382(int i, int i_0_) {
		try {
			Class522 class522;
			synchronized (((Class552) this).aClass367_6362) {
				class522 = (Class522) ((Class552) this).aClass367_6362.get((long) i);
			}
			if (null != class522)
				return class522;
			byte[] is;
			synchronized (((Class552) this).aClass280_6359) {
				is = (((Class552) this).aClass280_6359.getFile(Class103.aClass103_958.anInt982 * -989081113, i));
			}
			class522 = new Class522();
			((Class522) class522).aClass552_6021 = this;
			if (is != null)
				class522.method6228(new Buffer(is), 185624338);
			synchronized (((Class552) this).aClass367_6362) {
				((Class552) this).aClass367_6362.put(class522, (long) i);
			}
			return class522;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wv.r(").append(')').toString());
		}
	}

	public void method6383(int i, int i_1_, byte i_2_) {
		try {
			((Class552) this).aClass367_6362 = new Class367(i);
			((Class552) this).aClass367_6363 = new Class367(i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wv.j(").append(')').toString());
		}
	}

	public void method6384(int i, short i_3_) {
		try {
			synchronized (((Class552) this).aClass367_6362) {
				((Class552) this).aClass367_6362.method4292(i, (byte) 121);
			}
			synchronized (((Class552) this).aClass367_6363) {
				((Class552) this).aClass367_6363.method4292(i, (byte) 8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wv.p(").append(')').toString());
		}
	}

	public void method6385(int i) {
		try {
			synchronized (((Class552) this).aClass367_6362) {
				((Class552) this).aClass367_6362.method4296(872790673);
			}
			synchronized (((Class552) this).aClass367_6363) {
				((Class552) this).aClass367_6363.method4296(1187205773);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wv.o(").append(')').toString());
		}
	}

	public void method6386(byte i) {
		try {
			synchronized (((Class552) this).aClass367_6362) {
				((Class552) this).aClass367_6362.method4298((byte) 113);
			}
			synchronized (((Class552) this).aClass367_6363) {
				((Class552) this).aClass367_6363.method4298((byte) 103);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wv.i(").append(')').toString());
		}
	}

	public Class552(Class435 class435, Class454 class454, IndexTable class280, IndexTable class280_4_) {
		((Class552) this).aClass280_6359 = class280;
		((Class552) this).aClass280_6358 = class280_4_;
		((Class552) this).aClass280_6359.method2763((Class103.aClass103_958.anInt982) * -989081113, -2066884456);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}
}
