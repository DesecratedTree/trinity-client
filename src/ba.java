/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ba extends Class_v implements Interface28 {
	long nativeid;

	ba(ja var_ja, int i) {
		sa(var_ja, i);
	}

	native void sa(ja var_ja, int i);

	protected void finalize() {
		try {
			if (0L != ((ba) this).nativeid)
				Class71.method827(this, -729455472);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ba.finalize(").append(')').toString());
		}
	}

	public native void ma(boolean bool);

	void method3870() {
		if (0L != ((ba) this).nativeid)
			Class71.method827(this, 1654691965);
	}

	native void ha();

	native void j(ja var_ja, int i);

	void method3871() {
		if (0L != ((ba) this).nativeid)
			Class71.method827(this, 224103144);
	}

	public native void x(boolean bool);

	native void r(ja var_ja, int i);

	native void o();

	native void i(ja var_ja, int i);

	native void p();

	native void u();

	native void s();
}
