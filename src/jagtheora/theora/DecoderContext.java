/* DecoderContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class DecoderContext extends SimplePeer {
	public DecoderContext(TheoraInfo theorainfo, SetupInfo setupinfo) {
		init(theorainfo, setupinfo);
		if (r())
			throw new IllegalArgumentException("");
	}

	private native void init(TheoraInfo theorainfo, SetupInfo setupinfo);

	public native int decodePacketIn(OggPacket oggpacket, GranulePos granulepos);

	public native int decodeFrame(Frame frame);

	public native long granuleFrame(GranulePos granulepos);

	public native double granuleTime(GranulePos granulepos);

	public native int getMaxPostProcessingLevel();

	public native int setPostProcessingLevel(int i);

	public native int setGranulePosition(long l);

	protected native void clear();

	protected native void l();

	protected native void b();

	protected native void k();
}
