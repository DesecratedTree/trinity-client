/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer r;
	private int j;
	private int i;
	private int p;
	private byte[] o;
	private static boolean s = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		o = new byte[i];
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.r());
	}

	private Stream(Buffer buffer, int i, int i_0_) {
		this(buffer.r() < 4096 ? buffer.r() : 4096);
		r(buffer, i, i_0_);
	}

	private void r(Buffer buffer, int i, int i_1_) {
		f();
		r = buffer;
		this.i = i * -2075204995;
		j = -1260916245 * (i_1_ + i);
		if (j * -2130727229 > buffer.r())
			throw new RuntimeException();
	}

	public int j() {
		return p * 1138079537 + i * 1022043861;
	}

	public void i(int i) {
		f();
		this.i = -2075204995 * i;
	}

	public void p(int i) {
		if (1138079537 * p >= o.length)
			f();
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void o(float f) {
		if (3 + p * 1138079537 >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void s(float f) {
		if (3 + 1138079537 * p >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
	}

	public void f() {
		if (1138079537 * p > 0) {
			if (1022043861 * i + p * 1138079537 > -2130727229 * j)
				throw new RuntimeException();
			r.i(o, 0, i * 1022043861, p * 1138079537);
			i += -536759059 * p;
			p = 0;
		}
	}

	public static final boolean z() {
		return s;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);

	private void w(Buffer buffer, int i, int i_2_) {
		f();
		r = buffer;
		this.i = i * -2075204995;
		j = -1260916245 * (i_2_ + i);
		if (j * -2130727229 > buffer.r())
			throw new RuntimeException();
	}

	private void n(Buffer buffer, int i, int i_3_) {
		f();
		r = buffer;
		this.i = i * -2075204995;
		j = -1260916245 * (i_3_ + i);
		if (j * -2130727229 > buffer.r())
			throw new RuntimeException();
	}

	private void l(Buffer buffer, int i, int i_4_) {
		f();
		r = buffer;
		this.i = i * -2075204995;
		j = -1260916245 * (i_4_ + i);
		if (j * -2130727229 > buffer.r())
			throw new RuntimeException();
	}

	private void b(Buffer buffer, int i, int i_5_) {
		f();
		r = buffer;
		this.i = i * -2075204995;
		j = -1260916245 * (i_5_ + i);
		if (j * -2130727229 > buffer.r())
			throw new RuntimeException();
	}

	public void k(int i) {
		f();
		this.i = -2075204995 * i;
	}

	public void q(int i) {
		f();
		this.i = -2075204995 * i;
	}

	public void u(int i) {
		if (1138079537 * p >= o.length)
			f();
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void x(int i) {
		if (1138079537 * p >= o.length)
			f();
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void g(float f) {
		if (3 + p * 1138079537 >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void d(float f) {
		if (3 + p * 1138079537 >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void c(float f) {
		if (3 + p * 1138079537 >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void a(float f) {
		if (3 + p * 1138079537 >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
	}

	public void e(float f) {
		if (3 + 1138079537 * p >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
	}

	public void m(float f) {
		if (3 + 1138079537 * p >= o.length)
			f();
		int i = floatToRawIntBits(f);
		o[(p += -828227119) * 1138079537 - 1] = (byte) i;
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 8);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 16);
		o[(p += -828227119) * 1138079537 - 1] = (byte) (i >> 24);
	}

	public void t() {
		if (1138079537 * p > 0) {
			if (1022043861 * i + p * 1138079537 > -2130727229 * j)
				throw new RuntimeException();
			r.i(o, 0, i * 1022043861, p * 1138079537);
			i += -536759059 * p;
			p = 0;
		}
	}

	public void h() {
		if (1138079537 * p > 0) {
			if (1022043861 * i + p * 1138079537 > -2130727229 * j)
				throw new RuntimeException();
			r.i(o, 0, i * 1022043861, p * 1138079537);
			i += -536759059 * p;
			p = 0;
		}
	}

	public void y() {
		if (1138079537 * p > 0) {
			if (1022043861 * i + p * 1138079537 > -2130727229 * j)
				throw new RuntimeException();
			r.i(o, 0, i * 1022043861, p * 1138079537);
			i += -536759059 * p;
			p = 0;
		}
	}

	public static final boolean v() {
		return s;
	}
}
