/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class236 implements Interface8_Impl1_Impl1_Impl1 {
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10278;
	long aLong10279;
	int anInt10280;
	int anInt10281;
	Class86 aClass86_10282;

	public int method55() {
		return ((Class236) this).anInt10281;
	}

	public int method54() {
		return ((Class236) this).anInt10280;
	}

	Class236(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class86 class86, int i, int i_0_, int i_1_) {
		((Class236) this).aClass_ra_Sub2_Sub2_10278 = class_ra_sub2_sub2;
		((Class236) this).anInt10280 = i;
		((Class236) this).anInt10281 = i_0_;
		((Class236) this).aClass86_10282 = class86;
		((Class236) this).aLong10279 = (IDirect3DDevice.CreateDepthStencilSurface(((Class_ra_Sub2_Sub2) ((Class236) this).aClass_ra_Sub2_Sub2_10278).aLong9891, i, i_0_, Class_ra_Sub2_Sub2.method5170(((Class236) this).aClass86_10282), 0 + i_1_, 0, false));
		((Class236) this).aClass_ra_Sub2_Sub2_10278.method4993(this);
	}

	public int method58() {
		return ((Class236) this).anInt10280;
	}

	public void method53() {
		if (((Class236) this).aLong10279 != 0L) {
			IUnknown.Release(((Class236) this).aLong10279);
			((Class236) this).aLong10279 = 0L;
		}
		((Class236) this).aClass_ra_Sub2_Sub2_10278.method4883(this);
	}

	public void method188() {
		if (((Class236) this).aLong10279 != 0L) {
			((Class236) this).aClass_ra_Sub2_Sub2_10278.method5173(((Class236) this).aLong10279);
			((Class236) this).aLong10279 = 0L;
		}
	}

	public int method60() {
		return ((Class236) this).anInt10281;
	}

	public long method187() {
		return ((Class236) this).aLong10279;
	}

	public void method193() {
		if (((Class236) this).aLong10279 != 0L) {
			((Class236) this).aClass_ra_Sub2_Sub2_10278.method5173(((Class236) this).aLong10279);
			((Class236) this).aLong10279 = 0L;
		}
	}

	public int method59() {
		return ((Class236) this).anInt10281;
	}

	public int method57() {
		return ((Class236) this).anInt10280;
	}

	public int method61() {
		return ((Class236) this).anInt10281;
	}

	public void method52() {
		if (((Class236) this).aLong10279 != 0L) {
			IUnknown.Release(((Class236) this).aLong10279);
			((Class236) this).aLong10279 = 0L;
		}
		((Class236) this).aClass_ra_Sub2_Sub2_10278.method4883(this);
	}

	public long method190() {
		return ((Class236) this).aLong10279;
	}

	public long method191() {
		return ((Class236) this).aLong10279;
	}

	public long method192() {
		return ((Class236) this).aLong10279;
	}

	public void method189() {
		if (((Class236) this).aLong10279 != 0L) {
			((Class236) this).aClass_ra_Sub2_Sub2_10278.method5173(((Class236) this).aLong10279);
			((Class236) this).aLong10279 = 0L;
		}
	}

	public int method56() {
		return ((Class236) this).anInt10280;
	}
}
