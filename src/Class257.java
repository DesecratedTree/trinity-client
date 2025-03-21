/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class257 {
	public static int anInt2667 = 6144;
	public static int anInt2668 = 16383;
	public static int anInt2669 = 14;
	public static double aDouble2670 = 2607.5945876176133;
	public static int anInt2671 = 16384;
	public static int anInt2672 = 16384;
	public static int anInt2673 = 14;
	public static int anInt2674 = 10240;
	public static int anInt2675 = 16383;
	public static int anInt2676 = 4096;
	public static int anInt2677 = 1024;
	public static int anInt2678 = 8192;
	public static int anInt2679 = 12288;
	public static int anInt2680 = 2048;
	public static int anInt2681 = 14336;
	public static int anInt2682 = 16384;
	public static int[] anIntArray2683 = new int[16384];
	public static int[] anIntArray2684 = new int[16384];

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			anIntArray2683[i] = (int) (16384.0 * Math.sin((double) i * d));
			anIntArray2684[i] = (int) (16384.0 * Math.cos((double) i * d));
		}
	}

	Class257() throws Throwable {
		throw new Error();
	}

	public static float method2541(int i) {
		i &= 0x3fff;
		return (float) ((double) ((float) i / 16384.0F) * 6.283185307179586);
	}
}
