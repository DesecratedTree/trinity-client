/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private int r = 1055579025;
	private long j;

	protected NativeBuffer() {
		/* empty */
	}

	public final int r() {
		return r * -825705841;
	}

	public final long j() {
		return 1186474943355153227L * j;
	}

	public void i(byte[] is, int i, int i_0_, int i_1_) {
		if (0L == j * 1186474943355153227L | is == null | i < 0 | i + i_1_ > is.length | i_0_ < 0 | i_1_ + i_0_ > r * -825705841)
			throw new RuntimeException();
		put(j * 1186474943355153227L, is, i, i_0_, i_1_);
	}

	private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	private final native void put(long l, byte[] is, int i, int i_4_, int i_5_);

	public void p(byte[] is, int i, int i_6_, int i_7_) {
		if (0L == j * 1186474943355153227L | is == null | i < 0 | i + i_7_ > is.length | i_6_ < 0 | i_7_ + i_6_ > r * -825705841)
			throw new RuntimeException();
		put(j * 1186474943355153227L, is, i, i_6_, i_7_);
	}

	public void o(byte[] is, int i, int i_8_, int i_9_) {
		if (0L == j * 1186474943355153227L | is == null | i < 0 | i + i_9_ > is.length | i_8_ < 0 | i_9_ + i_8_ > r * -825705841)
			throw new RuntimeException();
		put(j * 1186474943355153227L, is, i, i_8_, i_9_);
	}

	public final int s() {
		return r * -825705841;
	}

	public final long f() {
		return 1186474943355153227L * j;
	}

	public final long z() {
		return 1186474943355153227L * j;
	}
}
