/* VorbisComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
	public VorbisComment() {
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
