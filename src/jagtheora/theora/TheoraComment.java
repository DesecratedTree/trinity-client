/* TheoraComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {
	public TheoraComment() {
		init();
		if (r())
			throw new IllegalStateException();
	}

	private native void init();

	protected native void clear();

	protected native void l();

	protected native void b();

	protected native void k();
}
