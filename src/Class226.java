/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class226 {
	public static int anInt2363 = 1024;
	public static int anInt2364 = 16384;
	public static int anInt2365 = 16;
	public static int anInt2366 = 128;
	public static int anInt2367 = 4;
	public static int anInt2368 = 16;
	public static int anInt2369 = 1;
	public static int anInt2370 = 8;
	public static int anInt2371 = 512;
	public static int anInt2372 = 4096;
	public static int anInt2373 = 2;
	public static int anInt2374 = 32768;
	public static int anInt2375 = 16384;
	public static int anInt2376 = 32;
	public static int anInt2377 = 64;
	public static int anInt2378 = 512;
	public static int anInt2379 = 2097152;
	public static int anInt2380 = 131072;
	public static int anInt2381 = 4096;
	public static int anInt2382 = 4194304;
	public static int anInt2383 = 1048576;
	public static int anInt2384 = 524288;
	public static int anInt2385 = 65536;
	public static int anInt2386 = 256;
	public static int anInt2387 = 1;
	public static int anInt2388 = 32;
	public static int anInt2389 = 8388608;
	public static int anInt2390 = 8;
	public static int anInt2391 = 128;
	public static int anInt2392 = 1048576;
	public static int anInt2393 = 4;
	public static int anInt2394 = 256;
	public static int anInt2395 = 8192;
	public static int anInt2396 = 8192;
	public static int anInt2397 = 32768;
	public static int anInt2398 = 2;
	public static int anInt2399 = 65536;
	public static int anInt2400 = 1024;
	public static int anInt2401 = 64;
	public static int anInt2402 = 262144;
	public static int anInt2403 = 8388608;
	public static int anInt2404 = 524288;
	public static int anInt2405 = 4194304;
	public static int anInt2406 = 2097152;
	public static int anInt2407 = 262144;
	public static int anInt2408 = 131072;
	public static int anInt2409 = 33554432;
	public static int anInt2410 = 16777216;

	Class226() throws Throwable {
		throw new Error();
	}

	static final void method2305(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class307.method3076(iComponentDefinitions, class430, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jm.qf(").append(')').toString());
		}
	}

	static final void method2306(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 1273695140);
			Class337.method3953(iComponentDefinitions, class430, 483580969);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jm.rj(").append(')').toString());
		}
	}

	public static boolean method2307(int i, byte i_1_) {
		try {
			return i == 15 || i == 19 || i == 11 || i == 7;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jm.fa(").append(')').toString());
		}
	}

	static final void method2308(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_2_ + i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jm.zz(").append(')').toString());
		}
	}

	public static String[] method2309(String string, char c, byte i) {
		try {
			int i_4_ = Class404.method4737(string, c, (byte) -97);
			String[] strings = new String[i_4_ + 1];
			int i_5_ = 0;
			int i_6_ = 0;
			for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
				int i_8_;
				for (i_8_ = i_6_; string.charAt(i_8_) != c; i_8_++) {
					/* empty */
				}
				strings[i_5_++] = string.substring(i_6_, i_8_);
				i_6_ = 1 + i_8_;
			}
			strings[i_4_] = string.substring(i_6_);
			return strings;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("jm.g(").append(')').toString());
		}
	}
}
