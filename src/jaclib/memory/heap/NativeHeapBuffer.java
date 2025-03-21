/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private int r;
	public NativeHeap j;
	private int i;
	private boolean p = true;

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
		j = nativeheap;
		this.i = i * 468492457;
		r = i_0_ * 852498195;
	}

	private final synchronized boolean w() {
		return j.r() && p;
	}

	public final long j() {
		return j.getBufferAddress(1633813401 * i);
	}

	public final int r() {
		return 1072253723 * r;
	}

	public final synchronized void i(byte[] is, int i, int i_1_, int i_2_) {
		if (!w() | is == null | i < 0 | i_2_ + i > is.length | i_1_ < 0 | i_2_ + i_1_ > r * 1072253723)
			throw new RuntimeException();
		j.put(1633813401 * this.i, is, i, i_1_, i_2_);
	}

	public final synchronized void n() {
		if (w())
			j.deallocateBuffer(i * 1633813401);
		p = false;
	}

	protected void finalize() throws Throwable {
		super.finalize();
		n();
	}

	public final synchronized void p(byte[] is, int i, int i_3_, int i_4_) {
		if (!w() | is == null | i < 0 | i_4_ + i > is.length | i_3_ < 0 | i_4_ + i_3_ > r * 1072253723)
			throw new RuntimeException();
		j.put(1633813401 * this.i, is, i, i_3_, i_4_);
	}

	public final synchronized void o(byte[] is, int i, int i_5_, int i_6_) {
		if (!w() | is == null | i < 0 | i_6_ + i > is.length | i_5_ < 0 | i_6_ + i_5_ > r * 1072253723)
			throw new RuntimeException();
		j.put(1633813401 * this.i, is, i, i_5_, i_6_);
	}

	protected final synchronized void gg() throws Throwable {
		super.finalize();
		n();
	}

	protected final synchronized void gy() throws Throwable {
		super.finalize();
		n();
	}

	public final int s() {
		return 1072253723 * r;
	}

	public final long f() {
		return j.getBufferAddress(1633813401 * i);
	}

	public final long z() {
		return j.getBufferAddress(1633813401 * i);
	}

	private final synchronized boolean l() {
		return j.r() && p;
	}
}
