/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class oa implements Interface8_Impl1_Impl1, Interface28 {
	long nativeid = 0L;
	int anInt9292;
	int anInt9293;

	native void q(long l, boolean bool);

	native void g(int i, int i_0_);

	public int method54() {
		return ((oa) this).anInt9292;
	}

	public int method55() {
		return ((oa) this).anInt9293;
	}

	public int method56() {
		return ((oa) this).anInt9292;
	}

	public void ma(boolean bool) {
		za(((oa) this).nativeid, bool);
	}

	native void za(long l, boolean bool);

	public void method53() {
		ma(false);
	}

	public int method58() {
		return ((oa) this).anInt9292;
	}

	public int method61() {
		return ((oa) this).anInt9293;
	}

	native void k(int i, int i_1_);

	public int method59() {
		return ((oa) this).anInt9293;
	}

	public int method60() {
		return ((oa) this).anInt9293;
	}

	oa(int i, int i_2_) {
		((oa) this).anInt9292 = i;
		((oa) this).anInt9293 = i_2_;
		g(i, i_2_);
	}

	public void method52() {
		ma(false);
	}

	native void o(int i, int i_3_);

	public int method57() {
		return ((oa) this).anInt9292;
	}

	public void x(boolean bool) {
		za(((oa) this).nativeid, bool);
	}

	native void j(int i, int i_4_);

	void method6480() {
		if (((oa) this).nativeid != 0L)
			Class71.method827(this, 1579662665);
	}

	protected void finalize() {
		if (((oa) this).nativeid != 0L)
			Class71.method827(this, 1513751064);
	}

	void method6481() {
		if (((oa) this).nativeid != 0L)
			Class71.method827(this, 1948540448);
	}
}
