/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

public class Class239 {
	static Interface14[] anInterface14Array2584;
	static Class258[] aClass258Array2585;
	static int[] anIntArray2586 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0 };
	static int anInt2587 = 211059739;
	static Class546 aClass546_2588;
	static IndexTable aClass280_2589;
	static long aLong2590;
	static int anInt2591;
	public static Class240 aClass240_2592;
	static boolean aBoolean2593 = false;
	public static IndexTable aClass280_2594;

	static {
		anInt2591 = -1402099385;
	}

	Class239() throws Throwable {
		throw new Error();
	}

	public static boolean method2379(String string, int i, String string_0_, byte i_1_) {
		try {
			if (i == 0) {
				boolean bool;
				try {
					if (!Class212.aString6533.startsWith("win"))
						throw new Exception();
					if (!string.startsWith("http://") && !string.startsWith("https://"))
						throw new Exception();
					String string_2_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int i_3_ = 0; i_3_ < string.length(); i_3_++) {
						if (string_2_.indexOf(string.charAt(i_3_)) == -1)
							throw new Exception();
					}
					Runtime.getRuntime().exec(new StringBuilder().append("cmd /c start \"j\" \"").append(string).append("\"").toString());
					bool = true;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			}
			if (i == 1) {
				boolean bool;
				try {
					Object object = Class492.method6079(Class293.anApplet6804, string_0_, (new Object[] { new URL(Class293.anApplet6804.getCodeBase(), string).toString() }), -1886425584);
					bool = null != object;
				} catch (Throwable throwable) {
					return false;
				}
				return bool;
			}
			if (2 == i) {
				boolean bool;
				try {
					Class293.anApplet6804.getAppletContext().showDocument(new URL(Class293.anApplet6804.getCodeBase(), string), "_blank");
					bool = true;
				} catch (Exception exception) {
					return false;
				}
				return bool;
			}
			if (3 == i) {
				try {
					Class492.method6078(Class293.anApplet6804, "loggedout", (byte) 1);
				} catch (Throwable throwable) {
					/* empty */
				}
				boolean bool;
				try {
					Class293.anApplet6804.getAppletContext().showDocument(new URL(Class293.anApplet6804.getCodeBase(), string), "_top");
					bool = true;
				} catch (Exception exception) {
					return false;
				}
				return bool;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ka.p(").append(')').toString());
		}
	}

	static final void method2380(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, 1581409337);
			Gfx.method788(iComponentDefinitions, class430, -1887972975);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ka.qy(").append(')').toString());
		}
	}

	static final void method2381(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub22_7892.method5716(i_5_, 1223382442);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ka.aqb(").append(')').toString());
		}
	}

	static final void method2382(Class430 class430, byte i) {
		try {
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class345.method4011(i_6_, false, -1963513573);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ka.uy(").append(')').toString());
		}
	}

	static Class330_Sub34 method2383(byte i) {
		try {
			if (0 == -431481119 * Class330_Sub34.anInt7727)
				return new Class330_Sub34();
			return (Class330_Sub34.aClass330_Sub34Array7731[(Class330_Sub34.anInt7727 -= -1888639711) * -431481119]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ka.r(").append(')').toString());
		}
	}
}
