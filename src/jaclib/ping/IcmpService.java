/* IcmpService - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.ping;

public abstract class IcmpService implements Runnable {
	protected IcmpService() {
		/* empty */
	}

	protected abstract void notify(int i);

	protected abstract void notify(int i, int i_0_, int i_1_);

	public native void run();

	public native void quit();

	public static native boolean available();

	public native void l();

	public native void b();

	public native void k();

	public native void q();

	protected abstract void r(int i);

	protected abstract void j(int i);

	protected abstract void i(int i, int i_2_, int i_3_);
}
