/* o - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class o extends Class76_Sub2 {
	int anInt9397;
	fa aFa9398 = null;
	oa anOa9399 = null;
	ja aJa9400;
	int anInt9401 = 0;

	public void method910(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		long l = 0L;
		long l_6_ = 0L;
		if (((o) this).aFa9398 == null)
			bool = false;
		else
			l = ((fa) ((o) this).aFa9398).nativeid;
		if (((o) this).anOa9399 == null)
			bool_5_ = false;
		else
			l_6_ = ((oa) ((o) this).anOa9399).nativeid;
		BA(((ja) ((o) this).aJa9400).nativeid, l, l_6_, i, i_0_, i_1_, i_2_, i_3_, i_4_, bool, bool_5_);
	}

	boolean method182() {
		((o) this).aJa9400.d((((o) this).aFa9398 == null ? 0L : ((fa) ((o) this).aFa9398).nativeid), (((o) this).anOa9399 == null ? 0L : ((oa) ((o) this).anOa9399).nativeid));
		return true;
	}

	public void method185() {
		/* empty */
	}

	boolean method174() {
		((o) this).aJa9400.d((((o) this).aFa9398 == null ? 0L : ((fa) ((o) this).aFa9398).nativeid), (((o) this).anOa9399 == null ? 0L : ((oa) ((o) this).anOa9399).nativeid));
		return true;
	}

	boolean method862() {
		return true;
	}

	native void ai(long l, long l_7_, long l_8_, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_);

	public void method900(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		if (((o) this).aFa9398 != null && interface8_impl1_impl1 != null && ((((o) this).aFa9398.method54() != interface8_impl1_impl1.method54()) || (((o) this).aFa9398.method55() != interface8_impl1_impl1.method55())))
			throw new RuntimeException();
		((o) this).anOa9399 = (oa) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			((o) this).anInt9401 = interface8_impl1_impl1.method54();
			((o) this).anInt9397 = interface8_impl1_impl1.method55();
		} else if (((o) this).aFa9398 == null) {
			((o) this).anInt9401 = 0;
			((o) this).anInt9397 = 0;
		}
		if (((o) this).aJa9400.method4782((byte) 0) == this)
			method174();
	}

	public int method857() {
		return ((o) this).anInt9397;
	}

	public void method903(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, boolean bool, boolean bool_20_) {
		long l = 0L;
		long l_21_ = 0L;
		if (((o) this).aFa9398 == null)
			bool = false;
		else
			l = ((fa) ((o) this).aFa9398).nativeid;
		if (((o) this).anOa9399 == null)
			bool_20_ = false;
		else
			l_21_ = ((oa) ((o) this).anOa9399).nativeid;
		BA(((ja) ((o) this).aJa9400).nativeid, l, l_21_, i, i_15_, i_16_, i_17_, i_18_, i_19_, bool, bool_20_);
	}

	native void BA(long l, long l_22_, long l_23_, int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, boolean bool, boolean bool_29_);

	boolean method176() {
		((o) this).aJa9400.d((((o) this).aFa9398 == null ? 0L : ((fa) ((o) this).aFa9398).nativeid), (((o) this).anOa9399 == null ? 0L : ((oa) ((o) this).anOa9399).nativeid));
		return true;
	}

	public int method864() {
		return ((o) this).anInt9401;
	}

	public int method858() {
		return ((o) this).anInt9401;
	}

	public int method859() {
		return ((o) this).anInt9401;
	}

	public int method860() {
		return ((o) this).anInt9397;
	}

	public int method856() {
		return ((o) this).anInt9401;
	}

	public void method179() {
		/* empty */
	}

	public void method909(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		if (i != 0)
			throw new RuntimeException();
		if (((o) this).anOa9399 != null && interface8_impl1_impl2 != null && ((((o) this).anOa9399.method54() != interface8_impl1_impl2.method54()) || (((o) this).anOa9399.method55() != interface8_impl1_impl2.method55())))
			throw new RuntimeException();
		((o) this).aFa9398 = (fa) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			((o) this).anInt9401 = interface8_impl1_impl2.method54();
			((o) this).anInt9397 = interface8_impl1_impl2.method55();
		} else if (((o) this).anOa9399 == null) {
			((o) this).anInt9401 = 0;
			((o) this).anInt9397 = 0;
		}
		if (((o) this).aJa9400.method4782((byte) 0) == this)
			method174();
	}

	public void method905(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		if (i != 0)
			throw new RuntimeException();
		if (((o) this).anOa9399 != null && interface8_impl1_impl2 != null && ((((o) this).anOa9399.method54() != interface8_impl1_impl2.method54()) || (((o) this).anOa9399.method55() != interface8_impl1_impl2.method55())))
			throw new RuntimeException();
		((o) this).aFa9398 = (fa) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			((o) this).anInt9401 = interface8_impl1_impl2.method54();
			((o) this).anInt9397 = interface8_impl1_impl2.method55();
		} else if (((o) this).anOa9399 == null) {
			((o) this).anInt9401 = 0;
			((o) this).anInt9397 = 0;
		}
		if (((o) this).aJa9400.method4782((byte) 0) == this)
			method174();
	}

	public void method906(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		if (((o) this).aFa9398 != null && interface8_impl1_impl1 != null && ((((o) this).aFa9398.method54() != interface8_impl1_impl1.method54()) || (((o) this).aFa9398.method55() != interface8_impl1_impl1.method55())))
			throw new RuntimeException();
		((o) this).anOa9399 = (oa) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			((o) this).anInt9401 = interface8_impl1_impl1.method54();
			((o) this).anInt9397 = interface8_impl1_impl1.method55();
		} else if (((o) this).aFa9398 == null) {
			((o) this).anInt9401 = 0;
			((o) this).anInt9397 = 0;
		}
		if (((o) this).aJa9400.method4782((byte) 0) == this)
			method174();
	}

	public boolean method899() {
		return true;
	}

	public void method183() {
		/* empty */
	}

	public boolean method908() {
		return true;
	}

	public boolean method907() {
		return true;
	}

	public int method861() {
		return ((o) this).anInt9397;
	}

	o(ja var_ja) {
		((o) this).anInt9397 = 0;
		((o) this).aJa9400 = var_ja;
	}

	boolean method178() {
		((o) this).aJa9400.d((((o) this).aFa9398 == null ? 0L : ((fa) ((o) this).aFa9398).nativeid), (((o) this).anOa9399 == null ? 0L : ((oa) ((o) this).anOa9399).nativeid));
		return true;
	}

	public boolean method904() {
		return true;
	}

	boolean method865() {
		return true;
	}

	public boolean method902() {
		return true;
	}

	boolean method863() {
		return true;
	}

	public void method180() {
		/* empty */
	}

	public void method181() {
		/* empty */
	}

	public void method901(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		if (i != 0)
			throw new RuntimeException();
		if (((o) this).anOa9399 != null && interface8_impl1_impl2 != null && ((((o) this).anOa9399.method54() != interface8_impl1_impl2.method54()) || (((o) this).anOa9399.method55() != interface8_impl1_impl2.method55())))
			throw new RuntimeException();
		((o) this).aFa9398 = (fa) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			((o) this).anInt9401 = interface8_impl1_impl2.method54();
			((o) this).anInt9397 = interface8_impl1_impl2.method55();
		} else if (((o) this).anOa9399 == null) {
			((o) this).anInt9401 = 0;
			((o) this).anInt9397 = 0;
		}
		if (((o) this).aJa9400.method4782((byte) 0) == this)
			method174();
	}

	public int method855() {
		return ((o) this).anInt9397;
	}

	native void as(long l, long l_30_, long l_31_, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, boolean bool, boolean bool_37_);
}
