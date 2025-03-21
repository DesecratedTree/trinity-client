/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class235 implements Interface8_Impl1_Impl2_Impl3 {
	long aLong10290;
	Class86 aClass86_10291;
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10292;
	int anInt10293;
	int anInt10294;
	Class72 aClass72_10295;

	public void method52() {
		if (((Class235) this).aLong10290 != 0L) {
			IUnknown.Release(((Class235) this).aLong10290);
			((Class235) this).aLong10290 = 0L;
		}
		((Class235) this).aClass_ra_Sub2_Sub2_10292.method4883(this);
	}

	public int method59() {
		return ((Class235) this).anInt10294;
	}

	public int method55() {
		return ((Class235) this).anInt10294;
	}

	public long method187() {
		return ((Class235) this).aLong10290;
	}

	public void method53() {
		if (((Class235) this).aLong10290 != 0L) {
			IUnknown.Release(((Class235) this).aLong10290);
			((Class235) this).aLong10290 = 0L;
		}
		((Class235) this).aClass_ra_Sub2_Sub2_10292.method4883(this);
	}

	public void method188() {
		if (((Class235) this).aLong10290 != 0L) {
			((Class235) this).aClass_ra_Sub2_Sub2_10292.method5173(((Class235) this).aLong10290);
			((Class235) this).aLong10290 = 0L;
		}
	}

	public int method58() {
		return ((Class235) this).anInt10293;
	}

	public int method57() {
		return ((Class235) this).anInt10293;
	}

	public int method56() {
		return ((Class235) this).anInt10293;
	}

	public long method191() {
		return ((Class235) this).aLong10290;
	}

	public int method60() {
		return ((Class235) this).anInt10294;
	}

	public int method61() {
		return ((Class235) this).anInt10294;
	}

	public long method192() {
		return ((Class235) this).aLong10290;
	}

	public int method54() {
		return ((Class235) this).anInt10293;
	}

	Class235(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, Class86 class86, int i, int i_0_, int i_1_) {
		((Class235) this).aClass_ra_Sub2_Sub2_10292 = class_ra_sub2_sub2;
		((Class235) this).anInt10293 = i;
		((Class235) this).anInt10294 = i_0_;
		((Class235) this).aClass72_10295 = class72;
		((Class235) this).aClass86_10291 = class86;
		((Class235) this).aLong10290 = (IDirect3DDevice.CreateRenderTarget(((Class_ra_Sub2_Sub2) ((Class235) this).aClass_ra_Sub2_Sub2_10292).aLong9891, i, i_0_, Class_ra_Sub2_Sub2.method5183(((Class235) this).aClass72_10295, (((Class235) this).aClass86_10291)), 0 + i_1_, 0, false));
		((Class235) this).aClass_ra_Sub2_Sub2_10292.method4993(this);
	}

	public long method190() {
		return ((Class235) this).aLong10290;
	}

	public void method189() {
		if (((Class235) this).aLong10290 != 0L) {
			((Class235) this).aClass_ra_Sub2_Sub2_10292.method5173(((Class235) this).aLong10290);
			((Class235) this).aLong10290 = 0L;
		}
	}

	public void method193() {
		if (((Class235) this).aLong10290 != 0L) {
			((Class235) this).aClass_ra_Sub2_Sub2_10292.method5173(((Class235) this).aLong10290);
			((Class235) this).aLong10290 = 0L;
		}
	}
}
