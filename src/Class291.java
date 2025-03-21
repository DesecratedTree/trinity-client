/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class291 implements Runnable {
	volatile boolean aBoolean2975;
	volatile boolean aBoolean2976;
	volatile Class296[] aClass296Array2977 = new Class296[2];
	static String aString2978;
	public static byte aByte2979;
	public static Class61 aClass61_2980;

	Class291() {
		((Class291) this).aBoolean2975 = false;
		((Class291) this).aBoolean2976 = false;
	}

	static final void method2902(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, -45910021);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.method3924(iComponentDefinitions).method3265((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("md.sp(").append(')').toString());
		}
	}

	static final void method2903(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean9122 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("md.ub(").append(')').toString());
		}
	}

	static final void method2904(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub12_7906.method5716(i_1_, 1521168036);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("md.aqm(").append(')').toString());
		}
	}

	public static int method2905(long l) {
		try {
			Class452.method5637(l);
			return Class528.aCalendar6215.get(1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("md.l(").append(')').toString());
		}
	}

	static void method2906(byte i) {
		try {
			if (null != Class11.aClass_ra164) {
				Class11.aClass_ra164.method4781(628001038);
				Class11.aClass_ra164 = null;
				Class11.aClass263_165 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("md.i(").append(')').toString());
		}
	}
}
