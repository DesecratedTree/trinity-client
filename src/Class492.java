/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class492 {
	public static void method6077(Applet applet, String string, int i) throws Throwable {
		try {
			JSObject.getWindow(applet).eval(string);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ui.r(").append(')').toString());
		}
	}

	public static Object method6078(Applet applet, String string, byte i) throws Throwable {
		try {
			return JSObject.getWindow(applet).call(string, null);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ui.j(").append(')').toString());
		}
	}

	public static Object method6079(Applet applet, String string, Object[] objects, int i) throws Throwable {
		try {
			return JSObject.getWindow(applet).call(string, objects);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ui.i(").append(')').toString());
		}
	}

	Class492() throws Throwable {
		throw new Error();
	}
}
