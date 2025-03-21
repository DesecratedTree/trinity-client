/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
	private long peer;

	protected SimplePeer() {
		/* empty */
	}

	private static native void init();

	public final boolean r() {
		return peer == 0L;
	}

	private final void setPeer(long l) {
		peer = l;
	}

	public final void j() {
		if (!r())
			clear();
	}

	protected abstract void clear();

	protected void finalize() throws Throwable {
		if (!r())
			j();
		super.finalize();
	}

	static {
		init();
	}

	protected void gg() throws Throwable {
		if (!r())
			j();
		super.finalize();
	}

	protected void gy() throws Throwable {
		if (!r())
			j();
		super.finalize();
	}

	public final boolean i() {
		return peer == 0L;
	}

	public final boolean p() {
		return peer == 0L;
	}

	public final boolean o() {
		return peer == 0L;
	}

	public final boolean s() {
		return peer == 0L;
	}

	public final void f() {
		if (!r())
			clear();
	}

	public final void z() {
		if (!r())
			clear();
	}

	public final void w() {
		if (!r())
			clear();
	}

	public final void n() {
		if (!r())
			clear();
	}

	protected abstract void l();

	protected abstract void b();

	protected abstract void k();
}
