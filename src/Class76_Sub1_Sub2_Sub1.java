/* Class76_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;
import jagdx.r;

public class Class76_Sub1_Sub2_Sub1 extends Class76_Sub1_Sub2 implements Interface13 {
	boolean aBoolean10083 = false;
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_10084;
	Canvas aCanvas10085;
	long aLong10086;
	long aLong10087;
	int anInt10088;
	int anInt10089;
	long aLong10090;
	boolean aBoolean10091 = false;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS10092;

	void method882(int i, int i_0_) {
		method179();
		((Class76_Sub1_Sub2_Sub1) this).anInt10088 = i;
		((Class76_Sub1_Sub2_Sub1) this).anInt10089 = i_0_;
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10091)
			((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5178();
		method173();
		super.method876(i, i_0_);
	}

	public void method173() {
		method179();
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(((Class76_Sub1_Sub2_Sub1) this).aCanvas10085);
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.Windowed = true;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferWidth = ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferHeight = ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10091) {
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9891));
		} else {
			if (!Class_ra_Sub2_Sub2.method5172((((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9918), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9889), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9910), (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.anInt8490), ((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092))
				throw new RuntimeException();
			int i = (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092)));
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), ((Class76_Sub1_Sub2_Sub1) this).anInt10088, ((Class76_Sub1_Sub2_Sub1) this).anInt10089, i, (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleType), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleQuality), false));
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10083)
			method174();
	}

	public int method856() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
	}

	public int method873(int i, int i_1_) {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public boolean method174() {
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, 0, ((Class76_Sub1_Sub2_Sub1) this).aLong10087)))
			return false;
		if (r.r(IDirect3DDevice.SetDepthStencilSurface(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, ((Class76_Sub1_Sub2_Sub1) this).aLong10090)))
			return false;
		return super.method174();
	}

	boolean method862() {
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10083 = false;
		return r.j(IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0L));
	}

	boolean method863() {
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10083 = false;
		return r.j(IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0L));
	}

	public int method883(int i, int i_2_) {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method855() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
	}

	public void method184() {
		method179();
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(((Class76_Sub1_Sub2_Sub1) this).aCanvas10085);
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.Windowed = true;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferWidth = ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferHeight = ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10091) {
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9891));
		} else {
			if (!Class_ra_Sub2_Sub2.method5172((((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9918), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9889), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9910), (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.anInt8490), ((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092))
				throw new RuntimeException();
			int i = (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092)));
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), ((Class76_Sub1_Sub2_Sub1) this).anInt10088, ((Class76_Sub1_Sub2_Sub1) this).anInt10089, i, (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleType), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleQuality), false));
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10083)
			method174();
	}

	void method888() {
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10087 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10087);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10090 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10090);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10086 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10086);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = 0L;
		}
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public void method183() {
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10087 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10087);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10090 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10090);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10086 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10086);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = 0L;
		}
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public int method857() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
	}

	public int method884(int i, int i_3_) {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method860() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
	}

	public int method859() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
	}

	public int method861() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
	}

	public boolean method176() {
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, 0, ((Class76_Sub1_Sub2_Sub1) this).aLong10087)))
			return false;
		if (r.r(IDirect3DDevice.SetDepthStencilSurface(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, ((Class76_Sub1_Sub2_Sub1) this).aLong10090)))
			return false;
		return super.method174();
	}

	public boolean method182() {
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, 0, ((Class76_Sub1_Sub2_Sub1) this).aLong10087)))
			return false;
		if (r.r(IDirect3DDevice.SetDepthStencilSurface(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, ((Class76_Sub1_Sub2_Sub1) this).aLong10090)))
			return false;
		return super.method174();
	}

	public boolean method178() {
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10083 = true;
		if (r.r(IDirect3DDevice.SetRenderTarget(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, 0, ((Class76_Sub1_Sub2_Sub1) this).aLong10087)))
			return false;
		if (r.r(IDirect3DDevice.SetDepthStencilSurface(((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891, ((Class76_Sub1_Sub2_Sub1) this).aLong10090)))
			return false;
		return super.method174();
	}

	public void method175() {
		method179();
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(((Class76_Sub1_Sub2_Sub1) this).aCanvas10085);
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.Windowed = true;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferWidth = ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferHeight = ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10091) {
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9891));
		} else {
			if (!Class_ra_Sub2_Sub2.method5172((((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9918), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9889), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9910), (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.anInt8490), ((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092))
				throw new RuntimeException();
			int i = (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092)));
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), ((Class76_Sub1_Sub2_Sub1) this).anInt10088, ((Class76_Sub1_Sub2_Sub1) this).anInt10089, i, (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleType), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleQuality), false));
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10083)
			method174();
	}

	boolean method865() {
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10083 = false;
		return r.j(IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0L));
	}

	public void method185() {
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10087 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10087);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10090 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10090);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10086 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10086);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = 0L;
		}
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public void method180() {
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10087 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10087);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10090 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10090);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10086 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10086);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = 0L;
		}
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	void method876(int i, int i_4_) {
		method179();
		((Class76_Sub1_Sub2_Sub1) this).anInt10088 = i;
		((Class76_Sub1_Sub2_Sub1) this).anInt10089 = i_4_;
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10091)
			((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5178();
		method173();
		super.method876(i, i_4_);
	}

	public int method877() {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method879() {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method880(int i, int i_5_) {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method881(int i, int i_6_) {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method875(int i, int i_7_) {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method858() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
	}

	public int method878() {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method885(int i, int i_8_) {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public int method874() {
		return IDirect3DSwapChain.Present(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0);
	}

	public void method177() {
		method179();
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(((Class76_Sub1_Sub2_Sub1) this).aCanvas10085);
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.Windowed = true;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferWidth = ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferHeight = ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10091) {
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9891));
		} else {
			if (!Class_ra_Sub2_Sub2.method5172((((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9918), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9889), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9910), (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.anInt8490), ((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092))
				throw new RuntimeException();
			int i = (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092)));
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), ((Class76_Sub1_Sub2_Sub1) this).anInt10088, ((Class76_Sub1_Sub2_Sub1) this).anInt10089, i, (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleType), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleQuality), false));
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10083)
			method174();
	}

	public int method864() {
		return ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
	}

	public void method179() {
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10087 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10087);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10090 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10090);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10086 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10086);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = 0L;
		}
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5159(this);
	}

	public void method186() {
		method179();
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092 = new D3DPRESENT_PARAMETERS(((Class76_Sub1_Sub2_Sub1) this).aCanvas10085);
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.Windowed = true;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferCount = 1;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferWidth = ((Class76_Sub1_Sub2_Sub1) this).anInt10088;
		((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.BackBufferHeight = ((Class76_Sub1_Sub2_Sub1) this).anInt10089;
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10091) {
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = IDirect3DDevice.GetSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.GetDepthStencilSurface(((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9891));
		} else {
			if (!Class_ra_Sub2_Sub2.method5172((((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9918), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).anInt9889), (((Class_ra_Sub2_Sub2) ((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084).aLong9910), (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.anInt8490), ((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092))
				throw new RuntimeException();
			int i = (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.AutoDepthStencilFormat);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = (IDirect3DDevice.CreateAdditionalSwapChain((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092)));
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = IDirect3DSwapChain.GetBackBuffer(((Class76_Sub1_Sub2_Sub1) this).aLong10086, 0, 0);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = (IDirect3DDevice.CreateDepthStencilSurface((((Class_ra_Sub2_Sub2) (((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084)).aLong9891), ((Class76_Sub1_Sub2_Sub1) this).anInt10088, ((Class76_Sub1_Sub2_Sub1) this).anInt10089, i, (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleType), (((Class76_Sub1_Sub2_Sub1) this).aD3DPRESENT_PARAMETERS10092.MultiSampleQuality), false));
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aBoolean10083)
			method174();
	}

	Class76_Sub1_Sub2_Sub1(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Canvas canvas, int i, int i_9_, boolean bool) {
		super(class_ra_sub2_sub2);
		((Class76_Sub1_Sub2_Sub1) this).aCanvas10085 = canvas;
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084 = class_ra_sub2_sub2;
		((Class76_Sub1_Sub2_Sub1) this).anInt10088 = i;
		((Class76_Sub1_Sub2_Sub1) this).anInt10089 = i_9_;
		((Class76_Sub1_Sub2_Sub1) this).aBoolean10091 = bool;
		method173();
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5158(this);
	}

	public void method181() {
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10087 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10087);
			((Class76_Sub1_Sub2_Sub1) this).aLong10087 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10090 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10090);
			((Class76_Sub1_Sub2_Sub1) this).aLong10090 = 0L;
		}
		if (((Class76_Sub1_Sub2_Sub1) this).aLong10086 != 0L) {
			IUnknown.Release(((Class76_Sub1_Sub2_Sub1) this).aLong10086);
			((Class76_Sub1_Sub2_Sub1) this).aLong10086 = 0L;
		}
		((Class76_Sub1_Sub2_Sub1) this).aClass_ra_Sub2_Sub2_10084.method5159(this);
	}
}
