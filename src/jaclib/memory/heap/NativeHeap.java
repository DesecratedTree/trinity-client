/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	long peer;
	private int r;
	private boolean j;

	public NativeHeap(int i) {
		r = -554383377 * i;
		allocateHeap(r * 1780172559);
		j = true;
	}

	synchronized boolean r() {
		return j;
	}

	public NativeHeapBuffer j(int i, boolean bool) {
		if (!j)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void i() {
		if (j)
			deallocateHeap();
		j = false;
	}

	private native void allocateHeap(int i);

	private native void deallocateHeap();

	synchronized native int allocateBuffer(int i, boolean bool);

	synchronized native long getBufferAddress(int i);

	synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

	synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

	synchronized native void deallocateBuffer(int i);

	public synchronized native void copy(long l, long l_6_, int i);

	protected void finalize() throws Throwable {
		super.finalize();
		i();
	}

	protected synchronized void gg() throws Throwable {
		super.finalize();
		i();
	}

	protected synchronized void gy() throws Throwable {
		super.finalize();
		i();
	}

	synchronized boolean p() {
		return j;
	}

	synchronized boolean o() {
		return j;
	}

	public NativeHeapBuffer s(int i, boolean bool) {
		if (!j)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void f() {
		if (j)
			deallocateHeap();
		j = false;
	}
}
