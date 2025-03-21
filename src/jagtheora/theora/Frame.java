/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {
	public int r;
	public int j;
	public int[] pixels;

	public Frame(int i, int i_0_) {
		r = i * 206011873;
		j = 1236967517 * i_0_;
		pixels = new int[-1182431711 * r * (j * 1293562869)];
	}

	private static native void init();

	protected native void clear();

	static {
		init();
	}

	protected native void l();

	protected native void b();

	protected native void k();
}
