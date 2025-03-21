/* Class76_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import jagdx.r;

public class Class76_Sub2_Sub3_Sub1 extends Class76_Sub2_Sub3 {
	Interface8_Impl1_Impl2_Impl3[] anInterface8_Impl1_Impl2_Impl3Array10103;
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10104;
	static int anInt10105 = 16;
	int anInt10106;
	int anInt10107;
	int anInt10108;
	Interface8_Impl1_Impl1_Impl1 anInterface8_Impl1_Impl1_Impl1_10109 = null;
	boolean aBoolean10110;

	public int method856() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10108;
	}

	public int method857() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10106;
	}

	public void method900(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 != 0) {
				if ((((Class76_Sub2_Sub3_Sub1) this).anInt10108 != interface8_impl1_impl1_impl1.method54()) || (((Class76_Sub2_Sub3_Sub1) this).anInt10106 != interface8_impl1_impl1_impl1.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = interface8_impl1_impl1_impl1.method55();
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = interface8_impl1_impl1_impl1.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 |= 0x10;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109 = interface8_impl1_impl1_impl1;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method921(interface8_impl1_impl1_impl1.method187());
		} else {
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 &= ~0x10;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109 = null;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method921(0L);
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 == 0) {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = 0;
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = 0;
			}
		}
	}

	public int method860() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10106;
	}

	boolean method920(int i, long l) {
		return r.j(IDirect3DDevice.SetRenderTarget((((Class_ra_Sub2_Sub2) (((Class76_Sub2_Sub3_Sub1) this).aClass_ra_Sub2_Sub2_10104)).aLong9891), i, l));
	}

	boolean method921(long l) {
		return r.j(IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub2_Sub3_Sub1) this).aClass_ra_Sub2_Sub2_10104)).aLong9891), l));
	}

	boolean method174() {
		for (int i = 0; i < 4; i++) {
			Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]);
			if (interface8_impl1_impl2_impl3 != null) {
				long l = interface8_impl1_impl2_impl3.method187();
				method920(i, l);
			}
		}
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			method921(((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method187());
		((Class76_Sub2_Sub3_Sub1) this).aBoolean10110 = true;
		return super.method174();
	}

	boolean method862() {
		for (int i = 1; i < 4; i++) {
			Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]);
			if (interface8_impl1_impl2_impl3 != null)
				method920(i, 0L);
		}
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			method921(0L);
		((Class76_Sub2_Sub3_Sub1) this).aBoolean10110 = false;
		return true;
	}

	public void method903(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool) {
			long l = (IDirect3DDevice.GetRenderTarget((((Class_ra_Sub2_Sub2) (((Class76_Sub2_Sub3_Sub1) this).aClass_ra_Sub2_Sub2_10104)).aLong9891), 0));
			IDirect3DDevice.StretchRect(((Class_ra_Sub2_Sub2) (((Class76_Sub2_Sub3_Sub1) this).aClass_ra_Sub2_Sub2_10104)).aLong9891, ((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[0].method187(), i, i_0_, i_1_, i_2_, l, i_3_, i_4_, i_1_, i_2_, 0);
			IUnknown.Release(l);
		}
	}

	void method922() {
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method188();
		for (int i = 0; i < (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103).length; i++) {
			if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]) != null)
				((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i].method188();
		}
	}

	public boolean method908() {
		return ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[0]) != null);
	}

	public int method864() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10108;
	}

	public void method905(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_6_ = 1 << i;
		Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (Interface8_Impl1_Impl2_Impl3) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 != 0) {
				if ((((Class76_Sub2_Sub3_Sub1) this).anInt10108 != interface8_impl1_impl2_impl3.method54()) || (((Class76_Sub2_Sub3_Sub1) this).anInt10106 != interface8_impl1_impl2_impl3.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = interface8_impl1_impl2_impl3.method55();
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = interface8_impl1_impl2_impl3.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 |= i_6_;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i] = interface8_impl1_impl2_impl3;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method920(i, interface8_impl1_impl2_impl3.method187());
		} else {
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 &= i_6_ ^ 0xffffffff;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i] = null;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method920(i, 0L);
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 == 0) {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = 0;
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = 0;
			}
		}
	}

	public int method859() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10108;
	}

	public int method855() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10106;
	}

	public int method861() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10106;
	}

	Class76_Sub2_Sub3_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2) {
		super((Class_ra_Sub2) class_ra_sub2_sub2);
		((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103 = new Interface8_Impl1_Impl2_Impl3[4];
		((Class76_Sub2_Sub3_Sub1) this).aClass_ra_Sub2_Sub2_10104 = class_ra_sub2_sub2;
	}

	public boolean method902() {
		return ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[0]) != null);
	}

	public void method906(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Interface8_Impl1_Impl1_Impl1 interface8_impl1_impl1_impl1 = (Interface8_Impl1_Impl1_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 != 0) {
				if ((((Class76_Sub2_Sub3_Sub1) this).anInt10108 != interface8_impl1_impl1_impl1.method54()) || (((Class76_Sub2_Sub3_Sub1) this).anInt10106 != interface8_impl1_impl1_impl1.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = interface8_impl1_impl1_impl1.method55();
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = interface8_impl1_impl1_impl1.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 |= 0x10;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109 = interface8_impl1_impl1_impl1;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method921(interface8_impl1_impl1_impl1.method187());
		} else {
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 &= ~0x10;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109 = null;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method921(0L);
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 == 0) {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = 0;
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = 0;
			}
		}
	}

	public boolean method899() {
		return ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[0]) != null);
	}

	public boolean method904() {
		return ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[0]) != null);
	}

	boolean method176() {
		for (int i = 0; i < 4; i++) {
			Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]);
			if (interface8_impl1_impl2_impl3 != null) {
				long l = interface8_impl1_impl2_impl3.method187();
				method920(i, l);
			}
		}
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			method921(((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method187());
		((Class76_Sub2_Sub3_Sub1) this).aBoolean10110 = true;
		return super.method174();
	}

	public boolean method907() {
		return ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[0]) != null);
	}

	public void method179() {
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method53();
		for (int i = 0; i < (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103).length; i++) {
			if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]) != null)
				((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i].method53();
		}
	}

	boolean method182() {
		for (int i = 0; i < 4; i++) {
			Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]);
			if (interface8_impl1_impl2_impl3 != null) {
				long l = interface8_impl1_impl2_impl3.method187();
				method920(i, l);
			}
		}
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			method921(((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method187());
		((Class76_Sub2_Sub3_Sub1) this).aBoolean10110 = true;
		return super.method174();
	}

	public void method901(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_7_ = 1 << i;
		Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (Interface8_Impl1_Impl2_Impl3) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 != 0) {
				if ((((Class76_Sub2_Sub3_Sub1) this).anInt10108 != interface8_impl1_impl2_impl3.method54()) || (((Class76_Sub2_Sub3_Sub1) this).anInt10106 != interface8_impl1_impl2_impl3.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = interface8_impl1_impl2_impl3.method55();
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = interface8_impl1_impl2_impl3.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 |= i_7_;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i] = interface8_impl1_impl2_impl3;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method920(i, interface8_impl1_impl2_impl3.method187());
		} else {
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 &= i_7_ ^ 0xffffffff;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i] = null;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method920(i, 0L);
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 == 0) {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = 0;
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = 0;
			}
		}
	}

	boolean method863() {
		for (int i = 1; i < 4; i++) {
			Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]);
			if (interface8_impl1_impl2_impl3 != null)
				method920(i, 0L);
		}
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			method921(0L);
		((Class76_Sub2_Sub3_Sub1) this).aBoolean10110 = false;
		return true;
	}

	boolean method865() {
		for (int i = 1; i < 4; i++) {
			Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]);
			if (interface8_impl1_impl2_impl3 != null)
				method920(i, 0L);
		}
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			method921(0L);
		((Class76_Sub2_Sub3_Sub1) this).aBoolean10110 = false;
		return true;
	}

	public int method858() {
		return ((Class76_Sub2_Sub3_Sub1) this).anInt10108;
	}

	public void method185() {
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method53();
		for (int i = 0; i < (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103).length; i++) {
			if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]) != null)
				((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i].method53();
		}
	}

	public void method180() {
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method53();
		for (int i = 0; i < (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103).length; i++) {
			if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]) != null)
				((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i].method53();
		}
	}

	public void method910(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, boolean bool_13_) {
		if (bool) {
			long l = (IDirect3DDevice.GetRenderTarget((((Class_ra_Sub2_Sub2) (((Class76_Sub2_Sub3_Sub1) this).aClass_ra_Sub2_Sub2_10104)).aLong9891), 0));
			IDirect3DDevice.StretchRect(((Class_ra_Sub2_Sub2) (((Class76_Sub2_Sub3_Sub1) this).aClass_ra_Sub2_Sub2_10104)).aLong9891, ((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[0].method187(), i, i_8_, i_9_, i_10_, l, i_11_, i_12_, i_9_, i_10_, 0);
			IUnknown.Release(l);
		}
	}

	public void method183() {
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method53();
		for (int i = 0; i < (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103).length; i++) {
			if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]) != null)
				((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i].method53();
		}
	}

	public void method909(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_14_ = 1 << i;
		Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (Interface8_Impl1_Impl2_Impl3) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 != 0) {
				if ((((Class76_Sub2_Sub3_Sub1) this).anInt10108 != interface8_impl1_impl2_impl3.method54()) || (((Class76_Sub2_Sub3_Sub1) this).anInt10106 != interface8_impl1_impl2_impl3.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = interface8_impl1_impl2_impl3.method55();
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = interface8_impl1_impl2_impl3.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 |= i_14_;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i] = interface8_impl1_impl2_impl3;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method920(i, interface8_impl1_impl2_impl3.method187());
		} else {
			((Class76_Sub2_Sub3_Sub1) this).anInt10107 &= i_14_ ^ 0xffffffff;
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i] = null;
			if (((Class76_Sub2_Sub3_Sub1) this).aBoolean10110)
				method920(i, 0L);
			if (((Class76_Sub2_Sub3_Sub1) this).anInt10107 == 0) {
				((Class76_Sub2_Sub3_Sub1) this).anInt10106 = 0;
				((Class76_Sub2_Sub3_Sub1) this).anInt10108 = 0;
			}
		}
	}

	boolean method178() {
		for (int i = 0; i < 4; i++) {
			Interface8_Impl1_Impl2_Impl3 interface8_impl1_impl2_impl3 = (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]);
			if (interface8_impl1_impl2_impl3 != null) {
				long l = interface8_impl1_impl2_impl3.method187();
				method920(i, l);
			}
		}
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			method921(((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method187());
		((Class76_Sub2_Sub3_Sub1) this).aBoolean10110 = true;
		return super.method174();
	}

	public void method181() {
		if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109) != null)
			((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl1_Impl1_10109.method53();
		for (int i = 0; i < (((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103).length; i++) {
			if ((((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i]) != null)
				((Class76_Sub2_Sub3_Sub1) this).anInterface8_Impl1_Impl2_Impl3Array10103[i].method53();
		}
	}
}
