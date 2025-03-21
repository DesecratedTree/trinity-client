/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class237 implements Interface8_Impl1_Impl2_Impl3, Interface8_Impl1_Impl1_Impl1 {
	Class229_Sub1_Sub1 aClass229_Sub1_Sub1_10283;
	int anInt10284;
	long aLong10285;

	public int method60() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method108();
	}

	public int method59() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method108();
	}

	public long method190() {
		if (((Class237) this).aLong10285 == 0L)
			((Class237) this).aLong10285 = (IDirect3DTexture.GetSurfaceLevel(((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aLong6488, ((Class237) this).anInt10284));
		return ((Class237) this).aLong10285;
	}

	public long method187() {
		if (((Class237) this).aLong10285 == 0L)
			((Class237) this).aLong10285 = (IDirect3DTexture.GetSurfaceLevel(((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aLong6488, ((Class237) this).anInt10284));
		return ((Class237) this).aLong10285;
	}

	public void method53() {
		if (((Class237) this).aLong10285 != 0L) {
			IUnknown.Release(((Class237) this).aLong10285);
			((Class237) this).aLong10285 = 0L;
		}
		((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	public void method188() {
		if (((Class237) this).aLong10285 != 0L) {
			((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aClass_ra_Sub2_Sub2_6484.method5173(((Class237) this).aLong10285);
			((Class237) this).aLong10285 = 0L;
		}
	}

	public int method58() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method137();
	}

	Class237(Class229_Sub1_Sub1 class229_sub1_sub1, int i) {
		((Class237) this).anInt10284 = i;
		((Class237) this).aClass229_Sub1_Sub1_10283 = class229_sub1_sub1;
		((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aClass_ra_Sub2_Sub2_6484.method4993(this);
	}

	public int method55() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method108();
	}

	public int method56() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method137();
	}

	public int method61() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method108();
	}

	public void method52() {
		if (((Class237) this).aLong10285 != 0L) {
			IUnknown.Release(((Class237) this).aLong10285);
			((Class237) this).aLong10285 = 0L;
		}
		((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	public int method57() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method137();
	}

	public int method54() {
		return ((Class237) this).aClass229_Sub1_Sub1_10283.method137();
	}

	public long method191() {
		if (((Class237) this).aLong10285 == 0L)
			((Class237) this).aLong10285 = (IDirect3DTexture.GetSurfaceLevel(((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aLong6488, ((Class237) this).anInt10284));
		return ((Class237) this).aLong10285;
	}

	public long method192() {
		if (((Class237) this).aLong10285 == 0L)
			((Class237) this).aLong10285 = (IDirect3DTexture.GetSurfaceLevel(((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aLong6488, ((Class237) this).anInt10284));
		return ((Class237) this).aLong10285;
	}

	public void method189() {
		if (((Class237) this).aLong10285 != 0L) {
			((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aClass_ra_Sub2_Sub2_6484.method5173(((Class237) this).aLong10285);
			((Class237) this).aLong10285 = 0L;
		}
	}

	public void method193() {
		if (((Class237) this).aLong10285 != 0L) {
			((Class229_Sub1_Sub1) ((Class237) this).aClass229_Sub1_Sub1_10283).aClass_ra_Sub2_Sub2_6484.method5173(((Class237) this).aLong10285);
			((Class237) this).aLong10285 = 0L;
		}
	}
}
