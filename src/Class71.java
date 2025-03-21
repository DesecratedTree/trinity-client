/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class71 {
	static int anInt606 = 0;
	static boolean aBoolean607 = false;
	static Class471 aClass471_608 = new Class471();

	static synchronized void method823(short i) {
		try {
			anInt606 += -1050464293;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cw.i(").append(')').toString());
		}
	}

	static synchronized void method824(int i) {
		try {
			anInt606 -= -1050464293;
			if (-83020717 * anInt606 == 0)
				method826(-1783116152);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cw.p(").append(')').toString());
		}
	}

	public static synchronized void method825(boolean bool, short i) {
		try {
			aBoolean607 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cw.o(").append(')').toString());
		}
	}

	Class71() throws Throwable {
		throw new Error();
	}

	static synchronized void method826(int i) {
		try {
			for (;;) {
				Class330_Sub35 class330_sub35 = (Class330_Sub35) aClass471_608.method5867((short) 8960);
				if (null == class330_sub35) {
					if (i >= 2000000) {
						/* empty */
					}
					break;
				}
				((Interface28) class330_sub35.anObject7733).ma(true);
				class330_sub35.method3252(1344262325);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cw.j(").append(')').toString());
		}
	}

	static synchronized void method827(Interface28 interface28, int i) {
		try {
			if (!aBoolean607) {
				if (-83020717 * anInt606 > 0) {
					Class330_Sub35 class330_sub35 = new Class330_Sub35(interface28);
					aClass471_608.method5878(class330_sub35, (short) 8192);
				} else
					interface28.ma(false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cw.r(").append(')').toString());
		}
	}
}
