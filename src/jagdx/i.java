/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class i {
	public static int r = 0;
	public static int j = 21;
	public static int i = 22;
	public static int p = 23;
	public static int o = 28;
	public static int s = 50;
	public static int f = 51;
	public static int z = 77;
	public static int w = 80;
	public static int n = 101;
	public static int l = 102;
	public static int b = 113;
	public static int k = 116;
	public static int q = r('D', 'X', 'T', '1') * 353609373;
	public static int u = r('D', 'X', 'T', '5') * 879873231;

	private i() throws Throwable {
		throw new Error();
	}

	private static int r(char c, char c_0_, char c_1_, char c_2_) {
		return ((c & 0xff) << 0 | (c_0_ & 0xff) << 8 | (c_1_ & 0xff) << 16 | (c_2_ & 0xff) << 24);
	}
}
