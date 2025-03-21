/* VorbisInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {
	public int channels;
	public int rate;

	public VorbisInfo() {
		init();
		if (r())
			throw new IllegalStateException();
	}

	private static native void initFields();

	private native void init();

	public native int headerIn(VorbisComment vorbiscomment, OggPacket oggpacket);

	protected native void clear();

	static {
		initFields();
	}

	protected native void l();

	protected native void b();

	protected native void k();
}
