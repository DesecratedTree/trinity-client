/* GranulePos - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class GranulePos extends SimplePeer {
	public long position;

	private static native void init();

	protected native void clear();

	static {
		init();
	}

	protected native void l();

	protected native void b();

	protected native void k();
}
