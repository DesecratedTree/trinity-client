/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.r;

public class Class224 implements Interface9_Impl1 {
	byte aByte8922;
	int anInt8923;
	int anInt8924;
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_8925;
	boolean aBoolean8926;
	long aLong8927 = 0L;

	public long method102(int i, int i_0_) {
		return IDirect3DVertexBuffer.Lock(((Class224) this).aLong8927, i, i_0_, (((Class224) this).aBoolean8926 ? 8192 : 0));
	}

	int method2299() {
		return ((Class224) this).aByte8922;
	}

	public boolean method142(int i, int i_1_) {
		((Class224) this).anInt8923 = i;
		((Class224) this).aByte8922 = (byte) i_1_;
		if (((Class224) this).anInt8923 > ((Class224) this).anInt8924) {
			int i_2_ = 8;
			int i_3_;
			if (((Class224) this).aBoolean8926) {
				i_3_ = 0;
				i_2_ |= 0x200;
			} else
				i_3_ = 1;
			if (((Class224) this).aLong8927 != 0L)
				IUnknown.Release(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub2_Sub2) ((Class224) this).aClass_ra_Sub2_Sub2_8925).aLong9891, ((Class224) this).anInt8923, i_2_, 0, i_3_));
			((Class224) this).anInt8924 = ((Class224) this).anInt8923;
		}
		return ((Class224) this).aLong8927 != 0L;
	}

	public boolean method99(int i, int i_4_, long l) {
		return r.j(IDirect3DVertexBuffer.Upload(((Class224) this).aLong8927, i, i_4_, (((Class224) this).aBoolean8926 ? 8192 : 0), l));
	}

	public void method95() {
		IDirect3DVertexBuffer.Unlock(((Class224) this).aLong8927);
	}

	public boolean method97(int i, int i_5_, long l) {
		return r.j(IDirect3DVertexBuffer.Upload(((Class224) this).aLong8927, i, i_5_, (((Class224) this).aBoolean8926 ? 8192 : 0), l));
	}

	public void method53() {
		if (((Class224) this).aLong8927 != 0L) {
			IUnknown.Release(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = 0L;
		}
		((Class224) this).anInt8924 = 0;
		((Class224) this).anInt8923 = 0;
		((Class224) this).aClass_ra_Sub2_Sub2_8925.method4883(this);
	}

	void method2300() {
		if (((Class224) this).aLong8927 != 0L) {
			((Class224) this).aClass_ra_Sub2_Sub2_8925.method5173(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = 0L;
			((Class224) this).anInt8924 = 0;
			((Class224) this).anInt8923 = 0;
		}
	}

	public void method52() {
		if (((Class224) this).aLong8927 != 0L) {
			IUnknown.Release(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = 0L;
		}
		((Class224) this).anInt8924 = 0;
		((Class224) this).anInt8923 = 0;
		((Class224) this).aClass_ra_Sub2_Sub2_8925.method4883(this);
	}

	public int method93() {
		return ((Class224) this).anInt8923;
	}

	public boolean method144(int i, int i_6_) {
		((Class224) this).anInt8923 = i;
		((Class224) this).aByte8922 = (byte) i_6_;
		if (((Class224) this).anInt8923 > ((Class224) this).anInt8924) {
			int i_7_ = 8;
			int i_8_;
			if (((Class224) this).aBoolean8926) {
				i_8_ = 0;
				i_7_ |= 0x200;
			} else
				i_8_ = 1;
			if (((Class224) this).aLong8927 != 0L)
				IUnknown.Release(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub2_Sub2) ((Class224) this).aClass_ra_Sub2_Sub2_8925).aLong9891, ((Class224) this).anInt8923, i_7_, 0, i_8_));
			((Class224) this).anInt8924 = ((Class224) this).anInt8923;
		}
		return ((Class224) this).aLong8927 != 0L;
	}

	public boolean method145(int i, int i_9_) {
		((Class224) this).anInt8923 = i;
		((Class224) this).aByte8922 = (byte) i_9_;
		if (((Class224) this).anInt8923 > ((Class224) this).anInt8924) {
			int i_10_ = 8;
			int i_11_;
			if (((Class224) this).aBoolean8926) {
				i_11_ = 0;
				i_10_ |= 0x200;
			} else
				i_11_ = 1;
			if (((Class224) this).aLong8927 != 0L)
				IUnknown.Release(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub2_Sub2) ((Class224) this).aClass_ra_Sub2_Sub2_8925).aLong9891, ((Class224) this).anInt8923, i_10_, 0, i_11_));
			((Class224) this).anInt8924 = ((Class224) this).anInt8923;
		}
		return ((Class224) this).aLong8927 != 0L;
	}

	public boolean method143(int i, int i_12_) {
		((Class224) this).anInt8923 = i;
		((Class224) this).aByte8922 = (byte) i_12_;
		if (((Class224) this).anInt8923 > ((Class224) this).anInt8924) {
			int i_13_ = 8;
			int i_14_;
			if (((Class224) this).aBoolean8926) {
				i_14_ = 0;
				i_13_ |= 0x200;
			} else
				i_14_ = 1;
			if (((Class224) this).aLong8927 != 0L)
				IUnknown.Release(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub2_Sub2) ((Class224) this).aClass_ra_Sub2_Sub2_8925).aLong9891, ((Class224) this).anInt8923, i_13_, 0, i_14_));
			((Class224) this).anInt8924 = ((Class224) this).anInt8923;
		}
		return ((Class224) this).aLong8927 != 0L;
	}

	public boolean method146(int i, int i_15_) {
		((Class224) this).anInt8923 = i;
		((Class224) this).aByte8922 = (byte) i_15_;
		if (((Class224) this).anInt8923 > ((Class224) this).anInt8924) {
			int i_16_ = 8;
			int i_17_;
			if (((Class224) this).aBoolean8926) {
				i_17_ = 0;
				i_16_ |= 0x200;
			} else
				i_17_ = 1;
			if (((Class224) this).aLong8927 != 0L)
				IUnknown.Release(((Class224) this).aLong8927);
			((Class224) this).aLong8927 = (IDirect3DDevice.CreateVertexBuffer(((Class_ra_Sub2_Sub2) ((Class224) this).aClass_ra_Sub2_Sub2_8925).aLong9891, ((Class224) this).anInt8923, i_16_, 0, i_17_));
			((Class224) this).anInt8924 = ((Class224) this).anInt8923;
		}
		return ((Class224) this).aLong8927 != 0L;
	}

	public int method96() {
		return ((Class224) this).anInt8923;
	}

	public int method100() {
		return ((Class224) this).anInt8923;
	}

	public boolean method98(int i, int i_18_, long l) {
		return r.j(IDirect3DVertexBuffer.Upload(((Class224) this).aLong8927, i, i_18_, (((Class224) this).aBoolean8926 ? 8192 : 0), l));
	}

	Class224(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, boolean bool) {
		((Class224) this).aClass_ra_Sub2_Sub2_8925 = class_ra_sub2_sub2;
		((Class224) this).aBoolean8926 = bool;
		((Class224) this).aClass_ra_Sub2_Sub2_8925.method4993(this);
	}

	public long method101(int i, int i_19_) {
		return IDirect3DVertexBuffer.Lock(((Class224) this).aLong8927, i, i_19_, (((Class224) this).aBoolean8926 ? 8192 : 0));
	}

	public long method92(int i, int i_20_) {
		return IDirect3DVertexBuffer.Lock(((Class224) this).aLong8927, i, i_20_, (((Class224) this).aBoolean8926 ? 8192 : 0));
	}

	public void method103() {
		IDirect3DVertexBuffer.Unlock(((Class224) this).aLong8927);
	}

	public long method94(int i, int i_21_) {
		return IDirect3DVertexBuffer.Lock(((Class224) this).aLong8927, i, i_21_, (((Class224) this).aBoolean8926 ? 8192 : 0));
	}
}
