/* RuntimeException_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class RuntimeException_Sub2 extends RuntimeException {
	public static String aString6440;
	public static int anInt6441;
	static long aLong6442;
	public static Applet anApplet6443;
	String aString6444;
	Throwable aThrowable6445;

	RuntimeException_Sub2(Throwable throwable, String string) {
		((RuntimeException_Sub2) this).aString6444 = string;
		((RuntimeException_Sub2) this).aThrowable6445 = throwable;
		initCause(throwable);
	}

	static boolean method6482(String string, int i, int i_0_) {
		try {
			return Class239.method2379(string, i, "openjs", (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aky.i(").append(')').toString());
		}
	}
}
