/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.r;

public class Class218 implements Interface9_Impl2 {
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8929;
	Class86 aClass86_8930;
	int anInt8931;
	boolean aBoolean8932;
	long aLong8933 = 0L;
	int anInt8934;

	public void method103() {
		IDirect3DIndexBuffer.Unlock(((Class218) this).aLong8933);
	}

	public int method93() {
		return ((Class218) this).anInt8934;
	}

	public Class86 method149() {
		return ((Class218) this).aClass86_8930;
	}

	public void method148(int i) {
		((Class218) this).anInt8934 = ((Class218) this).aClass86_8930.anInt724 * -1615628035 * i;
		if (((Class218) this).anInt8934 > ((Class218) this).anInt8931) {
			if (((Class218) this).aLong8933 != 0L)
				IUnknown.Release(((Class218) this).aLong8933);
			int i_0_ = 8;
			int i_1_;
			if (((Class218) this).aBoolean8932) {
				i_1_ = 0;
				i_0_ |= 0x200;
			} else
				i_1_ = 1;
			((Class218) this).aLong8933 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub2_Sub2) ((Class218) this).aClass_ra_Sub2_Sub2_8929).aLong9891, ((Class218) this).anInt8934, i_0_, (((Class218) this).aClass86_8930 == Class86.aClass86_718 ? 101 : 102), i_1_));
			((Class218) this).anInt8931 = ((Class218) this).anInt8934;
		}
	}

	public long method94(int i, int i_2_) {
		return IDirect3DIndexBuffer.Lock(((Class218) this).aLong8933, i, i_2_, (((Class218) this).aBoolean8932 ? 8192 : 0));
	}

	public void method95() {
		IDirect3DIndexBuffer.Unlock(((Class218) this).aLong8933);
	}

	public void method156(int i) {
		((Class218) this).anInt8934 = ((Class218) this).aClass86_8930.anInt724 * -1615628035 * i;
		if (((Class218) this).anInt8934 > ((Class218) this).anInt8931) {
			if (((Class218) this).aLong8933 != 0L)
				IUnknown.Release(((Class218) this).aLong8933);
			int i_3_ = 8;
			int i_4_;
			if (((Class218) this).aBoolean8932) {
				i_4_ = 0;
				i_3_ |= 0x200;
			} else
				i_4_ = 1;
			((Class218) this).aLong8933 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub2_Sub2) ((Class218) this).aClass_ra_Sub2_Sub2_8929).aLong9891, ((Class218) this).anInt8934, i_3_, (((Class218) this).aClass86_8930 == Class86.aClass86_718 ? 101 : 102), i_4_));
			((Class218) this).anInt8931 = ((Class218) this).anInt8934;
		}
	}

	public void method53() {
		if (((Class218) this).aLong8933 != 0L) {
			IUnknown.Release(((Class218) this).aLong8933);
			((Class218) this).aLong8933 = 0L;
		}
		((Class218) this).anInt8931 = 0;
		((Class218) this).anInt8934 = 0;
		((Class218) this).aClass_ra_Sub2_Sub2_8929.method4883(this);
	}

	void method2257() {
		if (((Class218) this).aLong8933 != 0L) {
			((Class218) this).aClass_ra_Sub2_Sub2_8929.method5173(((Class218) this).aLong8933);
			((Class218) this).aLong8933 = 0L;
		}
		((Class218) this).anInt8931 = 0;
		((Class218) this).anInt8934 = 0;
	}

	public boolean method99(int i, int i_5_, long l) {
		return r.j(IDirect3DIndexBuffer.Upload(((Class218) this).aLong8933, i, i_5_, (((Class218) this).aBoolean8932 ? 8192 : 0), l));
	}

	public void method52() {
		if (((Class218) this).aLong8933 != 0L) {
			IUnknown.Release(((Class218) this).aLong8933);
			((Class218) this).aLong8933 = 0L;
		}
		((Class218) this).anInt8931 = 0;
		((Class218) this).anInt8934 = 0;
		((Class218) this).aClass_ra_Sub2_Sub2_8929.method4883(this);
	}

	public Class86 method147() {
		return ((Class218) this).aClass86_8930;
	}

	public int method96() {
		return ((Class218) this).anInt8934;
	}

	public boolean method98(int i, int i_6_, long l) {
		return r.j(IDirect3DIndexBuffer.Upload(((Class218) this).aLong8933, i, i_6_, (((Class218) this).aBoolean8932 ? 8192 : 0), l));
	}

	Class218(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class86 class86, boolean bool) {
		((Class218) this).aClass_ra_Sub2_Sub2_8929 = class_ra_sub2_sub2;
		((Class218) this).aClass86_8930 = class86;
		((Class218) this).aBoolean8932 = bool;
		((Class218) this).aClass_ra_Sub2_Sub2_8929.method4993(this);
	}

	public long method92(int i, int i_7_) {
		return IDirect3DIndexBuffer.Lock(((Class218) this).aLong8933, i, i_7_, (((Class218) this).aBoolean8932 ? 8192 : 0));
	}

	public long method101(int i, int i_8_) {
		return IDirect3DIndexBuffer.Lock(((Class218) this).aLong8933, i, i_8_, (((Class218) this).aBoolean8932 ? 8192 : 0));
	}

	public long method102(int i, int i_9_) {
		return IDirect3DIndexBuffer.Lock(((Class218) this).aLong8933, i, i_9_, (((Class218) this).aBoolean8932 ? 8192 : 0));
	}

	public Class86 method154() {
		return ((Class218) this).aClass86_8930;
	}

	public Class86 method150() {
		return ((Class218) this).aClass86_8930;
	}

	public Class86 method157() {
		return ((Class218) this).aClass86_8930;
	}

	public int method100() {
		return ((Class218) this).anInt8934;
	}

	public Class86 method153() {
		return ((Class218) this).aClass86_8930;
	}

	public boolean method97(int i, int i_10_, long l) {
		return r.j(IDirect3DIndexBuffer.Upload(((Class218) this).aLong8933, i, i_10_, (((Class218) this).aBoolean8932 ? 8192 : 0), l));
	}

	public Class86 method151() {
		return ((Class218) this).aClass86_8930;
	}

	public Class86 method152() {
		return ((Class218) this).aClass86_8930;
	}

	public void method158(int i) {
		((Class218) this).anInt8934 = ((Class218) this).aClass86_8930.anInt724 * -1615628035 * i;
		if (((Class218) this).anInt8934 > ((Class218) this).anInt8931) {
			if (((Class218) this).aLong8933 != 0L)
				IUnknown.Release(((Class218) this).aLong8933);
			int i_11_ = 8;
			int i_12_;
			if (((Class218) this).aBoolean8932) {
				i_12_ = 0;
				i_11_ |= 0x200;
			} else
				i_12_ = 1;
			((Class218) this).aLong8933 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub2_Sub2) ((Class218) this).aClass_ra_Sub2_Sub2_8929).aLong9891, ((Class218) this).anInt8934, i_11_, (((Class218) this).aClass86_8930 == Class86.aClass86_718 ? 101 : 102), i_12_));
			((Class218) this).anInt8931 = ((Class218) this).anInt8934;
		}
	}

	public void method155(int i) {
		((Class218) this).anInt8934 = ((Class218) this).aClass86_8930.anInt724 * -1615628035 * i;
		if (((Class218) this).anInt8934 > ((Class218) this).anInt8931) {
			if (((Class218) this).aLong8933 != 0L)
				IUnknown.Release(((Class218) this).aLong8933);
			int i_13_ = 8;
			int i_14_;
			if (((Class218) this).aBoolean8932) {
				i_14_ = 0;
				i_13_ |= 0x200;
			} else
				i_14_ = 1;
			((Class218) this).aLong8933 = (IDirect3DDevice.CreateIndexBuffer(((Class_ra_Sub2_Sub2) ((Class218) this).aClass_ra_Sub2_Sub2_8929).aLong9891, ((Class218) this).anInt8934, i_13_, (((Class218) this).aClass86_8930 == Class86.aClass86_718 ? 101 : 102), i_14_));
			((Class218) this).anInt8931 = ((Class218) this).anInt8934;
		}
	}
}
