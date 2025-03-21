/* Class409 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class409 implements Runnable {
	String aString4215;
	InetAddress anInetAddress4216;
	volatile long aLong4217 = 4867047688957542709L;
	volatile boolean aBoolean4218 = true;

	void method4770(String string, short i) {
		try {
			((Class409) this).aString4215 = string;
			((Class409) this).anInetAddress4216 = null;
			((Class409) this).aLong4217 = 4867047688957542709L;
			if (((Class409) this).aString4215 != null) {
				try {
					((Class409) this).anInetAddress4216 = InetAddress.getByName(((Class409) this).aString4215);
				} catch (UnknownHostException unknownhostexception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.r(").append(')').toString());
		}
	}

	long method4771(int i) {
		try {
			return ((Class409) this).aLong4217 * 1300532172253050595L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.j(").append(')').toString());
		}
	}

	Class409() {
		/* empty */
	}

	void method4772(int i) {
		try {
			((Class409) this).aBoolean4218 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.i(").append(')').toString());
		}
	}

	void method4773(byte i) {
		try {
			if (((Class409) this).anInetAddress4216 != null) {
				try {
					byte[] is = ((Class409) this).anInetAddress4216.getAddress();
					((Class409) this).aLong4217 = ((long) Ping.r(is[0], is[1], is[2], is[3], 10000L) * -4867047688957542709L);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			Class464_Sub21.method5813(1000L);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.p(").append(')').toString());
		}
	}

	public void run() {
		try {
			while (((Class409) this).aBoolean4218)
				method4773((byte) -90);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.run(").append(')').toString());
		}
	}

	static final void method4774(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -366439384);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1226 * -84166611;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.ru(").append(')').toString());
		}
	}

	static final void method4775(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_1_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			Class423.method5302(i_1_, new Class330_Sub48(i_2_, 3), null, true, (short) 16385);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.st(").append(')').toString());
		}
	}

	static final void method4776(Class430 class430, int i) {
		try {
			long l = (((Class430) class430).aLongArray4379[((((Class430) class430).anInt4380 -= 2099007437) * -1969146619)]);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.aak(").append(')').toString());
		}
	}

	static final void method4777(Class430 class430, int i) {
		try {
			Class367.method4303(523001132);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.ajs(").append(')').toString());
		}
	}

	static final void method4778(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub6_7882.method5755(-621127415) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.apy(").append(')').toString());
		}
	}

	static final void method4779(Class430 class430, int i) {
		try {
			Class456.method5655((((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]), (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("r.adx(").append(')').toString());
		}
	}
}
