/* Class_ra_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.r;
import jagdx.z;

public class Class_ra_Sub2_Sub2 extends Class_ra_Sub2 {
	boolean aBoolean9888;
	int anInt9889;
	boolean[] aBooleanArray9890;
	long aLong9891;
	boolean[] aBooleanArray9892;
	Class471 aClass471_9893;
	int anInt9894;
	long aLong9895;
	long aLong9896;
	long aLong9897;
	boolean aBoolean9898;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9899;
	long[] aLongArray9900;
	boolean[] aBooleanArray9901;
	static int[] anIntArray9902;
	Class189[] aClass189Array9903;
	int[] anIntArray9904;
	Class249 aClass249_9905;
	Class123_Sub1 aClass123_Sub1_9906;
	long aLong9907;
	D3DCAPS aD3DCAPS9908;
	boolean aBoolean9909;
	long aLong9910 = 0L;
	boolean aBoolean9911;
	boolean aBoolean9912;
	float[] aFloatArray9913;
	int anInt9914;
	boolean[] aBooleanArray9915;
	int anInt9916;
	static int[] anIntArray9917 = { 77, 80 };
	int anInt9918;

	final Interface9_Impl1 method5132(boolean bool) {
		return new Class224(this, bool);
	}

	Interface11_Impl3 method5063(Class72 class72, int i, int i_0_, boolean bool, float[] fs, int i_1_, int i_2_) {
		return new Class229_Sub1(this, class72, i, i_0_, bool, fs, i_1_, i_2_);
	}

	static Class_ra method5156(Canvas canvas, Interface_ma interface_ma, IndexTable class280, Integer integer) {
		Class_ra_Sub2_Sub2 class_ra_sub2_sub2 = null;
		Class_ra_Sub2_Sub2 class_ra_sub2_sub2_3_;
		try {
			int i = 0;
			int i_4_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_4_, d3dcaps);
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			if (!method5172(i, i_4_, l, integer.intValue(), d3dpresent_parameters))
				throw new RuntimeException("");
			int i_5_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_5_ |= 0x10;
			long l_6_ = 0L;
			try {
				l_6_ = IDirect3D.CreateDeviceContext(l, i, i_4_, canvas, i_5_ | 0x40, d3dpresent_parameters);
			} catch (z var_z) {
				l_6_ = IDirect3D.CreateDeviceContext(l, i, i_4_, canvas, i_5_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class_ra_sub2_sub2 = new Class_ra_Sub2_Sub2(i, i_4_, l, l_6_, d3dpresent_parameters, d3dcaps, interface_ma, class280, integer.intValue());
			if (!class_ra_sub2_sub2.aHashtable4231.containsKey(canvas)) {
				Class377.method4375(canvas, -1433851980);
				class_ra_sub2_sub2.method4805(canvas, new Class76_Sub1_Sub2_Sub1(class_ra_sub2_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), 1850446711);
			}
			class_ra_sub2_sub2.method4784(canvas, 1072029249);
			class_ra_sub2_sub2.method4910();
			class_ra_sub2_sub2_3_ = class_ra_sub2_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class_ra_sub2_sub2 != null)
				class_ra_sub2_sub2.u();
			throw runtimeexception;
		}
		return class_ra_sub2_sub2_3_;
	}

	final Interface9_Impl1 method4976(boolean bool) {
		return new Class224(this, bool);
	}

	void method5027() {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) -116)) {
			Interface13 interface13 = (Interface13) class330_sub35.anObject7733;
			interface13.method173();
			if (interface13 == aClass76_4228)
				interface13.method174();
		}
		super.method5027();
	}

	void method4998() {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) -90)) {
			Interface13 interface13 = (Interface13) class330_sub35.anObject7733;
			interface13.method179();
		}
		super.method4998();
	}

	public Class76_Sub2 jp() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	void method5119() {
		if (aClass76_4228 != null)
			IDirect3DDevice.SetViewport(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8517 + anInt8531, anInt8518 + anInt8567, anInt8515, anInt8516, aFloat8499, aFloat8478);
	}

	public Class51 f() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, 0, d3dadapter_identifier);
		return new Class51(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	void w(int i, int i_7_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		int i_8_ = aClass76_Sub1_4234.method874();
		if (r.r(i_8_)) {
			if (i_8_ != -2005530520) {
				if (++((Class_ra_Sub2_Sub2) this).anInt9894 > 50)
					throw new Exception_Sub1(i_8_);
			} else {
				aClass76_Sub1_4234.method179();
				method5178();
				((Class76_Sub1_Sub2_Sub1) aClass76_Sub1_4234).method173();
			}
		} else
			((Class_ra_Sub2_Sub2) this).anInt9894 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 442);
	}

	public void l() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method5091() {
		if (aBoolean8601) {
			int i = (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] ? method5166(aClass179Array8547[anInt8543]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 1, i);
		}
	}

	protected void finalize() {
		super.finalize();
	}

	final void method5079(int i, Class175 class175, boolean bool, boolean bool_9_) {
		if (aBoolean8601) {
			int i_10_ = 0;
			int i_11_;
			switch (i) {
			default:
				i_11_ = 2;
				break;
			case 1:
				i_11_ = 3;
				break;
			case 2:
				i_11_ = 26;
			}
			if (bool)
				i_10_ |= 0x20;
			if (bool_9_)
				i_10_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, i_11_, method5186(class175) | i_10_);
		}
	}

	public Class76_Sub2 ag() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	void method5086() {
		if (((Class_ra_Sub2_Sub2) this).aLong9907 == 0L && aClass181Array8509[anInt8543] != Class181.aClass181_1784) {
			if (aClass181Array8509[anInt8543] == Class181.aClass181_1785)
				IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 16 + anInt8543, (aClass249Array8545[anInt8543].method2506(((Class_ra_Sub2_Sub2) this).aFloatArray9913)));
			else
				IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 16 + anInt8543, (aClass249Array8545[anInt8543].method2514(((Class_ra_Sub2_Sub2) this).aFloatArray9913)));
			int i = method5167(aClass181Array8509[anInt8543]);
			if (i != ((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543]) {
				IDirect3DDevice.SetTextureStageState(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 24, i);
				((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 24, 0);
			((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543] = 0;
		}
	}

	public Interface8_Impl1_Impl2 az(int i, int i_12_, Class72 class72, Class86 class86, int i_13_) {
		return new Class235(this, class72, class86, i, i_12_, i_13_);
	}

	public Interface8_Impl1_Impl1 ah(int i, int i_14_) {
		return new Class236(this, Class86.aClass86_719, i, i_14_, 0);
	}

	void method4947(int i) {
		if (!((Class_ra_Sub2_Sub2) this).aBoolean9912) {
			int i_15_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 8, i_15_);
		}
	}

	Class330_Sub35 method5157(Interface13 interface13) {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) -75)) {
			if (class330_sub35.anObject7733 == interface13)
				return class330_sub35;
		}
		return null;
	}

	void method5158(Interface13 interface13) {
		if (method5157(interface13) == null)
			((Class_ra_Sub2_Sub2) this).aClass471_9893.method5878(new Class330_Sub35(interface13), (short) 8192);
	}

	void method5159(Interface13 interface13) {
		Class330_Sub35 class330_sub35 = method5157(interface13);
		if (class330_sub35 != null)
			class330_sub35.method3252(1123135813);
	}

	public int[] ar(int i, int i_16_, int i_17_, int i_18_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class_ra_Sub2_Sub2) this).aLong9891, 0);
		long l_19_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub2_Sub2) this).aLong9891), i_17_, i_18_, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect((((Class_ra_Sub2_Sub2) this).aLong9891), l, i, i_16_, i_17_, i_18_, l_19_, 0, 0, i_17_, i_18_, 1))) {
			is = new int[i_17_ * i_18_];
			IDirect3DSurface.Download(l_19_, 0, 0, i_17_, i_18_, i_17_ * 4, 16, aLong8459);
			aByteBuffer8458.clear();
			aByteBuffer8458.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_19_);
		return is;
	}

	public void am() {
		/* empty */
	}

	public Class92 cp(Class92 class92, Class92 class92_20_, float f, Class92 class92_21_) {
		return f < 0.5F ? class92 : class92_20_;
	}

	public void ba(int i, int i_22_) {
		IDirect3DDevice.Clear(((Class_ra_Sub2_Sub2) this).aLong9891, i, i_22_, 1.0F, 0);
	}

	void method4912() {
		if (aClass76_4228 != null)
			IDirect3DDevice.SetViewport(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8517 + anInt8531, anInt8518 + anInt8567, anInt8515, anInt8516, aFloat8499, aFloat8478);
	}

	public Interface8_Impl1_Impl2 jx(int i, int i_23_, Class72 class72, Class86 class86, int i_24_) {
		return new Class235(this, class72, class86, i, i_23_, i_24_);
	}

	void method5160() {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) -54)) {
			Interface13 interface13 = (Interface13) class330_sub35.anObject7733;
			interface13.method179();
		}
		super.method4998();
	}

	final void method5161(long l) {
		((Class_ra_Sub2_Sub2) this).aLong9907 = l;
		IDirect3DDevice.SetVertexShader(((Class_ra_Sub2_Sub2) this).aLong9891, l);
	}

	final void method5162(long l) {
		IDirect3DDevice.SetPixelShader(((Class_ra_Sub2_Sub2) this).aLong9891, l);
	}

	public void method5103(Class249 class249) {
		class249.method2483(((Class_ra_Sub2_Sub2) this).aClass249_9905);
	}

	final void method4985(Interface9_Impl2 interface9_impl2, Class199 class199, int i, int i_25_, int i_26_, int i_27_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawIndexedPrimitiveIB((((Class_ra_Sub2_Sub2) this).aLong9891), ((Class218) (Class218) interface9_impl2).aLong8933, 4, 0, i, i_25_, i_26_, i_27_);
	}

	void method4933() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 14, aBoolean8519 && aBoolean8454);
	}

	void method4936() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 137, aBoolean8522 && !aBoolean8575);
	}

	void method4937() {
		if (aBoolean8601) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub2_Sub2) this).aLong9895, aFloat8530 * aFloat8533, aFloat8500 * aFloat8533, aFloat8532 * aFloat8533, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	public Interface8_Impl1_Impl1 av(int i, int i_28_, int i_29_) {
		return new Class236(this, Class86.aClass86_719, i, i_28_, i_29_);
	}

	void method4959() {
		if (aBoolean8601) {
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9895, -aFloatArray8525[0], -aFloatArray8525[1], -aFloatArray8525[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9896, -aFloatArray8451[0], -aFloatArray8451[1], -aFloatArray8451[2]);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	public float method4893() {
		return -0.5F;
	}

	void method4939() {
		if (aBoolean8601 && !((Class_ra_Sub2_Sub2) this).aBoolean9898) {
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, false);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, false);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 0, ((Class_ra_Sub2_Sub2) this).aLong9895);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 1, ((Class_ra_Sub2_Sub2) this).aLong9896);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, true);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, true);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = true;
		}
	}

	void method4981() {
		int i;
		for (i = 0; i < anInt8538; i++) {
			Class330_Sub14 class330_sub14 = aClass330_Sub14Array8607[i];
			int i_30_ = i + 2;
			int i_31_ = class330_sub14.method3313(-1813601403);
			float f = class330_sub14.method3317(436407211) / 255.0F;
			D3DLIGHT.SetPosition(((Class_ra_Sub2_Sub2) this).aLong9897, (float) class330_sub14.method3318(-1275163184), (float) class330_sub14.method3311((byte) -11), (float) class330_sub14.method3312((short) 9042));
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9897, (float) (i_31_ >> 16 & 0xff) * f, (float) (i_31_ >> 8 & 0xff) * f, (float) (i_31_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class_ra_Sub2_Sub2) this).aLong9897, 0.0F, 0.0F, 1.0F / (float) (class330_sub14.method3316((byte) -80) * class330_sub14.method3316((byte) -28)));
			D3DLIGHT.SetRange(((Class_ra_Sub2_Sub2) this).aLong9897, (float) class330_sub14.method3316((byte) -8));
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, i_30_, ((Class_ra_Sub2_Sub2) this).aLong9897);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, i_30_, true);
		}
		for (/**/; i < anInt8537; i++)
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, i + 2, false);
	}

	boolean method5006(Class72 class72, Class86 class86) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (r.j(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, d3ddisplaymode)) && r.j(IDirect3D.CheckDeviceFormat(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, d3ddisplaymode.Format, 0, 3, method5183(class72, class86))));
	}

	final void method5001(int i, Class175 class175, boolean bool, boolean bool_32_) {
		if (aBoolean8601) {
			int i_33_ = 0;
			int i_34_;
			switch (i) {
			default:
				i_34_ = 2;
				break;
			case 1:
				i_34_ = 3;
				break;
			case 2:
				i_34_ = 26;
			}
			if (bool)
				i_33_ |= 0x20;
			if (bool_32_)
				i_33_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, i_34_, method5186(class175) | i_33_);
		}
	}

	Interface11_Impl3 method4904(Class72 class72, Class86 class86, int i, int i_35_) {
		return new Class229_Sub1(this, class72, class86, i, i_35_);
	}

	boolean method5057(Class72 class72, Class86 class86) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (r.j(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, d3ddisplaymode)) && r.j(IDirect3D.CheckDeviceFormat(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, d3ddisplaymode.Format, 0, 3, method5183(class72, class86))));
	}

	Interface11_Impl3 method4948(Class72 class72, int i, int i_36_, boolean bool, byte[] is, int i_37_, int i_38_) {
		return new Class229_Sub1(this, class72, i, i_36_, bool, is, i_37_, i_38_);
	}

	Interface11_Impl3 method4949(Class72 class72, int i, int i_39_, boolean bool, float[] fs, int i_40_, int i_41_) {
		return new Class229_Sub1(this, class72, i, i_39_, bool, fs, i_40_, i_41_);
	}

	Interface11_Impl3_Impl1 method4953(Class72 class72, Class86 class86, int i, int i_42_) {
		return new Class229_Sub1_Sub1(this, class72, class86, i, i_42_);
	}

	Interface11_Impl1 method4951(int i, boolean bool, int[][] is) {
		return new Class229_Sub2(this, i, bool, is);
	}

	Interface11_Impl2 method4952(Class72 class72, int i, int i_43_, int i_44_, boolean bool, byte[] is) {
		return new Class229_Sub3(this, class72, i, i_43_, i_44_, bool, is);
	}

	public void method5009(Class184 class184) {
		Class184_Sub1 class184_sub1 = (Class184_Sub1) class184;
		IDirect3DDevice.SetVertexDeclaration((((Class_ra_Sub2_Sub2) this).aLong9891), (((Class184_Sub1) class184_sub1).aLong8909));
	}

	final void method5163(Class229_Sub1 class229_sub1) {
		method5165(class229_sub1);
		if (((Class_ra_Sub2_Sub2) this).aBooleanArray9915[anInt8543] != ((Class229_Sub1) class229_sub1).aBoolean8915) {
			IDirect3DDevice.SetSamplerState(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 1, ((Class229_Sub1) class229_sub1).aBoolean8915 ? 1 : 3);
			((Class_ra_Sub2_Sub2) this).aBooleanArray9915[anInt8543] = ((Class229_Sub1) class229_sub1).aBoolean8915;
		}
		if (((Class_ra_Sub2_Sub2) this).aBooleanArray9890[anInt8543] != ((Class229_Sub1) class229_sub1).aBoolean8916) {
			IDirect3DDevice.SetSamplerState(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 2, ((Class229_Sub1) class229_sub1).aBoolean8916 ? 1 : 3);
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890[anInt8543] = ((Class229_Sub1) class229_sub1).aBoolean8916;
		}
	}

	final void method5164(Class229_Sub3 class229_sub3) {
		method5165(class229_sub3);
		if (!((Class_ra_Sub2_Sub2) this).aBooleanArray9915[anInt8543]) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 1, 1);
			((Class_ra_Sub2_Sub2) this).aBooleanArray9915[anInt8543] = true;
		}
		if (!((Class_ra_Sub2_Sub2) this).aBooleanArray9890[anInt8543]) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 2, 1);
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890[anInt8543] = true;
		}
	}

	public void method5059() {
		if (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543]) {
			((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] = false;
			IDirect3DDevice.SetTexture(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 0L);
			method4968();
			method5053();
		}
	}

	void method5076() {
		if (((Class_ra_Sub2_Sub2) this).aLong9907 == 0L && aClass181Array8509[anInt8543] != Class181.aClass181_1784) {
			if (aClass181Array8509[anInt8543] == Class181.aClass181_1785)
				IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 16 + anInt8543, (aClass249Array8545[anInt8543].method2506(((Class_ra_Sub2_Sub2) this).aFloatArray9913)));
			else
				IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 16 + anInt8543, (aClass249Array8545[anInt8543].method2514(((Class_ra_Sub2_Sub2) this).aFloatArray9913)));
			int i = method5167(aClass181Array8509[anInt8543]);
			if (i != ((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543]) {
				IDirect3DDevice.SetTextureStageState(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 24, i);
				((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 24, 0);
			((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543] = 0;
		}
	}

	void method5053() {
		if (aBoolean8601) {
			int i = (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] ? method5166(aClass179Array8547[anInt8543]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 1, i);
		}
	}

	void method4968() {
		if (aBoolean8601) {
			int i = (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] ? method5166(aClass179Array8548[anInt8543]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 4, i);
		}
	}

	Class184 method4977(Class193[] class193s) {
		return new Class184_Sub1(this, class193s);
	}

	final void method4927(int i, Class175 class175, boolean bool) {
		if (aBoolean8601) {
			int i_45_ = 0;
			int i_46_;
			switch (i) {
			default:
				i_46_ = 5;
				break;
			case 2:
				i_46_ = 27;
				break;
			case 1:
				i_46_ = 6;
			}
			if (bool)
				i_45_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, i_46_, method5186(class175) | i_45_);
		}
	}

	final void method5165(Class229 class229) {
		IDirect3DDevice.SetTexture(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, class229.method2318());
		if (aBoolean8601 && !((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543]) {
			((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] = true;
			method4968();
			method5053();
		}
	}

	static final int method5166(Class179 class179) {
		switch (class179.anInt1756) {
		case 0:
			return 4;
		case 3:
			return 10;
		case 1:
			return 26;
		default:
			throw new IllegalArgumentException();
		case 2:
			return 7;
		case 4:
			return 2;
		}
	}

	void method4907() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 27, aBoolean8546);
	}

	static final int method5167(Class181 class181) {
		switch (class181.anInt1783) {
		default:
			return 0;
		case 2:
			return 2;
		case 5:
			return 1;
		case 1:
			return 4;
		case 0:
			return 3;
		case 4:
			return 256;
		}
	}

	void method5040(int i) {
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 168, i);
	}

	void method4992() {
		method4938();
		method4939();
	}

	void method5042() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 7, aBoolean8526);
	}

	void method5112() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 27, aBoolean8546);
	}

	void method4974() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 28, aBoolean8514 && aBoolean8502 && anInt8578 >= 0);
	}

	void method4900() {
		aFloat8581 = aFloat8504 - (float) anInt8560;
		aFloat8580 = aFloat8581 - (float) anInt8578;
		if (aFloat8580 < aFloat8471)
			aFloat8580 = aFloat8471;
		if (aBoolean8601) {
			IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 36, aFloat8580);
			IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 37, aFloat8581);
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 34, anInt8476);
		}
	}

	void method5168() {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) 2)) {
			Interface13 interface13 = (Interface13) class330_sub35.anObject7733;
			interface13.method173();
			if (interface13 == aClass76_4228)
				interface13.method174();
		}
		super.method5027();
	}

	final Interface9_Impl2 method4975(boolean bool) {
		return new Class218(this, Class86.aClass86_718, bool);
	}

	void method5054() {
		int i;
		for (i = 0; i < anInt8538; i++) {
			Class330_Sub14 class330_sub14 = aClass330_Sub14Array8607[i];
			int i_47_ = i + 2;
			int i_48_ = class330_sub14.method3313(-510520199);
			float f = class330_sub14.method3317(1864218184) / 255.0F;
			D3DLIGHT.SetPosition(((Class_ra_Sub2_Sub2) this).aLong9897, (float) class330_sub14.method3318(522102953), (float) class330_sub14.method3311((byte) -18), (float) class330_sub14.method3312((short) 5645));
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9897, (float) (i_48_ >> 16 & 0xff) * f, (float) (i_48_ >> 8 & 0xff) * f, (float) (i_48_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class_ra_Sub2_Sub2) this).aLong9897, 0.0F, 0.0F, 1.0F / (float) (class330_sub14.method3316((byte) 71) * class330_sub14.method3316((byte) 75)));
			D3DLIGHT.SetRange(((Class_ra_Sub2_Sub2) this).aLong9897, (float) class330_sub14.method3316((byte) -41));
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, i_47_, ((Class_ra_Sub2_Sub2) this).aLong9897);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, i_47_, true);
		}
		for (/**/; i < anInt8537; i++)
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, i + 2, false);
	}

	void method5090() {
		/* empty */
	}

	public void method4978(Class184 class184) {
		Class184_Sub1 class184_sub1 = (Class184_Sub1) class184;
		IDirect3DDevice.SetVertexDeclaration((((Class_ra_Sub2_Sub2) this).aLong9891), (((Class184_Sub1) class184_sub1).aLong8909));
	}

	public void method5081(int i, Interface9_Impl1 interface9_impl1) {
		Class224 class224 = (Class224) interface9_impl1;
		IDirect3DDevice.SetStreamSource(((Class_ra_Sub2_Sub2) this).aLong9891, i, ((Class224) class224).aLong8927, 0, class224.method2299());
	}

	void method4979(Interface9_Impl2 interface9_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub2_Sub2) this).aLong9891, (((Class218) (Class218) interface9_impl2).aLong8933));
	}

	public final void method4898(Class199 class199, int i, int i_49_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawPrimitive(((Class_ra_Sub2_Sub2) this).aLong9891, method5171(class199), i, i_49_);
	}

	Interface11_Impl2 method5069(Class72 class72, int i, int i_50_, int i_51_, boolean bool, byte[] is) {
		return new Class229_Sub3(this, class72, i, i_50_, i_51_, bool, is);
	}

	boolean method5032(Class72 class72, Class86 class86) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (r.j(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, d3ddisplaymode)) && r.j(IDirect3D.CheckDeviceFormat(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, d3ddisplaymode.Format, 0, 4, method5183(class72, class86))));
	}

	byte[] method5169(String string) {
		return method4942("dx", string);
	}

	public Class105 method4888(String string) {
		byte[] is = method5169(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub1(this, class113);
	}

	public final synchronized void g(int i) {
		for (int i_52_ = 0; i_52_ < ((Class_ra_Sub2_Sub2) this).anInt9916; i_52_++)
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLongArray9900[i_52_]);
		((Class_ra_Sub2_Sub2) this).anInt9916 = 0;
		super.g(i);
	}

	void method4940() {
		method4938();
		method4939();
	}

	static final int method5170(Class86 class86) {
		if (class86 == Class86.aClass86_718)
			return 80;
		if (class86 == Class86.aClass86_719)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method5171(Class199 class199) {
		switch (class199.anInt1932) {
		case 1:
			return 6;
		case 2:
			return 1;
		case 4:
			return 5;
		case 0:
			return 4;
		case 3:
			return 3;
		case 5:
			return 2;
		default:
			throw new IllegalArgumentException("");
		}
	}

	static boolean method5172(int i, int i_53_, long l, int i_54_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		boolean bool;
		try {
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (r.r(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_19_: for (/**/; i_54_ >= 0; i_54_--) {
				if (i_54_ != 1) {
					i_57_ = 0 + i_54_;
					for (int i_58_ = 0; i_58_ < anIntArray9902.length; i_58_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_53_, d3ddisplaymode.Format, anIntArray9902[i_58_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_53_, (d3ddisplaymode.Format), 1, 1, (anIntArray9902[i_58_])) == 0 && (i_54_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_53_, anIntArray9902[i_58_], true, i_57_)) == 0)) {
							for (int i_59_ = 0; i_59_ < anIntArray9917.length; i_59_++) {
								if (IDirect3D.CheckDeviceFormat(l, i, i_53_, (d3ddisplaymode.Format), 2, 1, (anIntArray9917[i_59_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_53_, d3ddisplaymode.Format, anIntArray9902[i_58_], anIntArray9917[i_59_])) == 0 && (i_54_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_53_, anIntArray9917[i_58_], true, i_57_)) == 0)) {
									i_56_ = anIntArray9902[i_58_];
									i_55_ = anIntArray9917[i_59_];
									break while_19_;
								}
							}
						}
					}
				}
			}
			if (i_54_ < 0 || i_56_ == 0 || i_55_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_56_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_55_;
			d3dpresent_parameters.MultiSampleType = i_57_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	synchronized void method5173(long l) {
		if (((Class_ra_Sub2_Sub2) this).anInt9916 == ((Class_ra_Sub2_Sub2) this).anInt9914) {
			((Class_ra_Sub2_Sub2) this).anInt9914 *= 2;
			long[] ls = new long[((Class_ra_Sub2_Sub2) this).anInt9914];
			System.arraycopy(((Class_ra_Sub2_Sub2) this).aLongArray9900, 0, ls, 0, ((Class_ra_Sub2_Sub2) this).anInt9916);
			((Class_ra_Sub2_Sub2) this).aLongArray9900 = ls;
		}
		((Class_ra_Sub2_Sub2) this).aLongArray9900[(((Class_ra_Sub2_Sub2) this).anInt9916)] = l;
		((Class_ra_Sub2_Sub2) this).anInt9916++;
	}

	void method4990(int i) {
		if (!((Class_ra_Sub2_Sub2) this).aBoolean9912) {
			int i_60_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 8, i_60_);
		}
	}

	static {
		anIntArray9902 = new int[] { 22, 23 };
	}

	Class76_Sub1 ak(Canvas canvas, int i, int i_61_) {
		return new Class76_Sub1_Sub2_Sub1(this, canvas, i, i_61_, false);
	}

	public Class51 dq() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, 0, d3dadapter_identifier);
		return new Class51(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	void method5174() {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) -49)) {
			Interface13 interface13 = (Interface13) class330_sub35.anObject7733;
			interface13.method179();
		}
		super.method4998();
	}

	public void method5077() {
		if (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543]) {
			((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] = false;
			IDirect3DDevice.SetTexture(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 0L);
			method4968();
			method5053();
		}
	}

	void dj(int i, int i_62_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		int i_63_ = aClass76_Sub1_4234.method874();
		if (r.r(i_63_)) {
			if (i_63_ != -2005530520) {
				if (++((Class_ra_Sub2_Sub2) this).anInt9894 > 50)
					throw new Exception_Sub1(i_63_);
			} else {
				aClass76_Sub1_4234.method179();
				method5178();
				((Class76_Sub1_Sub2_Sub1) aClass76_Sub1_4234).method173();
			}
		} else
			((Class_ra_Sub2_Sub2) this).anInt9894 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -1293);
	}

	Interface11_Impl3 method5064(Class72 class72, int i, int i_64_, boolean bool, float[] fs, int i_65_, int i_66_) {
		return new Class229_Sub1(this, class72, i, i_64_, bool, fs, i_65_, i_66_);
	}

	void dm(int i, int i_67_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		int i_68_ = aClass76_Sub1_4234.method874();
		if (r.r(i_68_)) {
			if (i_68_ != -2005530520) {
				if (++((Class_ra_Sub2_Sub2) this).anInt9894 > 50)
					throw new Exception_Sub1(i_68_);
			} else {
				aClass76_Sub1_4234.method179();
				method5178();
				((Class76_Sub1_Sub2_Sub1) aClass76_Sub1_4234).method173();
			}
		} else
			((Class_ra_Sub2_Sub2) this).anInt9894 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -8160);
	}

	public void du() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	Interface11_Impl1 method5067(int i, boolean bool, int[][] is) {
		return new Class229_Sub2(this, i, bool, is);
	}

	void method4997() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 137, aBoolean8522 && !aBoolean8575);
	}

	public void dx() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void dd() {
		super.u();
		if (((Class_ra_Sub2_Sub2) this).aLong9895 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9895);
			((Class_ra_Sub2_Sub2) this).aLong9895 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9896 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9896);
			((Class_ra_Sub2_Sub2) this).aLong9896 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9897 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9897);
			((Class_ra_Sub2_Sub2) this).aLong9897 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9891 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub2_Sub2) this).aLong9891);
			((Class_ra_Sub2_Sub2) this).aLong9891 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9910 != 0L) {
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLong9910);
			((Class_ra_Sub2_Sub2) this).aLong9910 = 0L;
		}
	}

	void de() {
		super.u();
		if (((Class_ra_Sub2_Sub2) this).aLong9895 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9895);
			((Class_ra_Sub2_Sub2) this).aLong9895 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9896 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9896);
			((Class_ra_Sub2_Sub2) this).aLong9896 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9897 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9897);
			((Class_ra_Sub2_Sub2) this).aLong9897 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9891 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub2_Sub2) this).aLong9891);
			((Class_ra_Sub2_Sub2) this).aLong9891 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9910 != 0L) {
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLong9910);
			((Class_ra_Sub2_Sub2) this).aLong9910 = 0L;
		}
	}

	void dn() {
		super.u();
		if (((Class_ra_Sub2_Sub2) this).aLong9895 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9895);
			((Class_ra_Sub2_Sub2) this).aLong9895 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9896 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9896);
			((Class_ra_Sub2_Sub2) this).aLong9896 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9897 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9897);
			((Class_ra_Sub2_Sub2) this).aLong9897 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9891 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub2_Sub2) this).aLong9891);
			((Class_ra_Sub2_Sub2) this).aLong9891 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9910 != 0L) {
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLong9910);
			((Class_ra_Sub2_Sub2) this).aLong9910 = 0L;
		}
	}

	void method5014() {
		switch (aClass176_8583.anInt1746) {
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 5);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 6);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 9);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 2);
			break;
		}
		switch (anInt8613) {
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 1);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 2);
			break;
		}
	}

	void method5123() {
		method4938();
		method4939();
	}

	public void eo(boolean bool) {
		/* empty */
	}

	public void ef(boolean bool) {
		/* empty */
	}

	public void eu(boolean bool) {
		/* empty */
	}

	Class76_Sub1 es(Canvas canvas, int i, int i_69_) {
		return new Class76_Sub1_Sub2_Sub1(this, canvas, i, i_69_, false);
	}

	public final synchronized void dw(int i) {
		for (int i_70_ = 0; i_70_ < ((Class_ra_Sub2_Sub2) this).anInt9916; i_70_++)
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLongArray9900[i_70_]);
		((Class_ra_Sub2_Sub2) this).anInt9916 = 0;
		super.g(i);
	}

	Class76_Sub1 ft(Canvas canvas, int i, int i_71_) {
		return new Class76_Sub1_Sub2_Sub1(this, canvas, i, i_71_, false);
	}

	public void method4926(Class184 class184) {
		Class184_Sub1 class184_sub1 = (Class184_Sub1) class184;
		IDirect3DDevice.SetVertexDeclaration((((Class_ra_Sub2_Sub2) this).aLong9891), (((Class184_Sub1) class184_sub1).aLong8909));
	}

	public void fr() {
		/* empty */
	}

	public void fi(int i, int i_72_) {
		IDirect3DDevice.Clear(((Class_ra_Sub2_Sub2) this).aLong9891, i, i_72_, 1.0F, 0);
	}

	public void fn(int i, int i_73_) {
		IDirect3DDevice.Clear(((Class_ra_Sub2_Sub2) this).aLong9891, i, i_73_, 1.0F, 0);
	}

	public void method5033(Class249 class249) {
		class249.method2483(((Class_ra_Sub2_Sub2) this).aClass249_9905);
	}

	public final void method5116(Class199 class199, int i, int i_74_, int i_75_, int i_76_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub2_Sub2) this).aLong9891), method5171(class199), 0, i, i_74_, i_75_, i_76_);
	}

	void method4895() {
		for (int i = 0; i < anInt8592; i++) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 2, 1);
			((Class_ra_Sub2_Sub2) this).aClass189Array9903[i] = Class189.aClass189_1856;
			boolean[] bools = ((Class_ra_Sub2_Sub2) this).aBooleanArray9915;
			int i_77_ = i;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890[i] = true;
			bools[i_77_] = true;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9892[i] = false;
			((Class_ra_Sub2_Sub2) this).anIntArray9904[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 145, 1);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 35, 3);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9895, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9896, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9897, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 206, 1);
		((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		super.method4895();
	}

	public Class76_Sub2 jy() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	void method5126() {
		if (aBoolean8601) {
			int i = (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] ? method5166(aClass179Array8548[anInt8543]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 4, i);
		}
	}

	public Class76_Sub2 jk() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	public Class76_Sub2 jv() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	public final synchronized void dk(int i) {
		for (int i_78_ = 0; i_78_ < ((Class_ra_Sub2_Sub2) this).anInt9916; i_78_++)
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLongArray9900[i_78_]);
		((Class_ra_Sub2_Sub2) this).anInt9916 = 0;
		super.g(i);
	}

	public Interface8_Impl1_Impl1 kb(int i, int i_79_, int i_80_) {
		return new Class236(this, Class86.aClass86_719, i, i_79_, i_80_);
	}

	public Interface8_Impl1_Impl1 kh(int i, int i_81_, int i_82_) {
		return new Class236(this, Class86.aClass86_719, i, i_81_, i_82_);
	}

	public Interface8_Impl1_Impl1 kv(int i, int i_83_, int i_84_) {
		return new Class236(this, Class86.aClass86_719, i, i_83_, i_84_);
	}

	void method5175() {
		super.finalize();
	}

	void method5176() {
		super.finalize();
	}

	public boolean method5021() {
		return ((((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.VertexShaderVersion & 0xffff) >= 257);
	}

	public boolean method5022() {
		return ((((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.PixelShaderVersion & 0xffff) >= 257);
	}

	public boolean method5023() {
		return ((((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.PixelShaderVersion & 0xffff) >= 257);
	}

	public float method5031() {
		return -0.5F;
	}

	public Class105 method5037(String string) {
		byte[] is = method5169(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub1(this, class113);
	}

	public Class105 method4923(String string) {
		byte[] is = method5169(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub1(this, class113);
	}

	void method5177() {
		for (int i = 0; i < anInt8592; i++) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 2, 1);
			((Class_ra_Sub2_Sub2) this).aClass189Array9903[i] = Class189.aClass189_1856;
			boolean[] bools = ((Class_ra_Sub2_Sub2) this).aBooleanArray9915;
			int i_85_ = i;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890[i] = true;
			bools[i_85_] = true;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9892[i] = false;
			((Class_ra_Sub2_Sub2) this).anIntArray9904[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 145, 1);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 35, 3);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9895, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9896, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9897, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 206, 1);
		((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		super.method4895();
	}

	boolean method5178() {
		int i = IDirect3DDevice.TestCooperativeLevel(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (i == 0 || i == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub2_Sub2) this).aLong9891), 0L);
			for (int i_86_ = 0; i_86_ < 4; i_86_++)
				IDirect3DDevice.SetRenderTarget((((Class_ra_Sub2_Sub2) this).aLong9891), i_86_, 0L);
			for (int i_87_ = 0; i_87_ < 4; i_87_++)
				IDirect3DDevice.SetStreamSource((((Class_ra_Sub2_Sub2) this).aLong9891), i_87_, 0L, 0, 0);
			for (int i_88_ = 0; i_88_ < 4; i_88_++)
				IDirect3DDevice.SetTexture((((Class_ra_Sub2_Sub2) this).aLong9891), i_88_, 0L);
			IDirect3DDevice.SetIndices(((Class_ra_Sub2_Sub2) this).aLong9891, 0L);
			method4998();
			((Class_ra_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9899.BackBufferWidth = 0;
			((Class_ra_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9899.BackBufferHeight = 0;
			if (method5172(((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, ((Class_ra_Sub2_Sub2) this).aLong9910, anInt8490, (((Class_ra_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9899))) {
				int i_89_ = IDirect3DDevice.Reset((((Class_ra_Sub2_Sub2) this).aLong9891), (((Class_ra_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9899));
				if (r.j(i_89_)) {
					method5027();
					method4895();
					return true;
				}
				System.exit(0);
			}
		}
		return false;
	}

	void method5179() {
		for (int i = 0; i < anInt8592; i++) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 2, 1);
			((Class_ra_Sub2_Sub2) this).aClass189Array9903[i] = Class189.aClass189_1856;
			boolean[] bools = ((Class_ra_Sub2_Sub2) this).aBooleanArray9915;
			int i_90_ = i;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890[i] = true;
			bools[i_90_] = true;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9892[i] = false;
			((Class_ra_Sub2_Sub2) this).anIntArray9904[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 145, 1);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 35, 3);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9895, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9896, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9897, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 206, 1);
		((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		super.method4895();
	}

	public Class92 in(Class92 class92, Class92 class92_91_, float f, Class92 class92_92_) {
		return f < 0.5F ? class92 : class92_91_;
	}

	void method5180() {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) -10)) {
			Interface13 interface13 = (Interface13) class330_sub35.anObject7733;
			interface13.method179();
		}
		super.method4998();
	}

	void method5181() {
		for (int i = 0; i < anInt8592; i++) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 2, 1);
			((Class_ra_Sub2_Sub2) this).aClass189Array9903[i] = Class189.aClass189_1856;
			boolean[] bools = ((Class_ra_Sub2_Sub2) this).aBooleanArray9915;
			int i_93_ = i;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890[i] = true;
			bools[i_93_] = true;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9892[i] = false;
			((Class_ra_Sub2_Sub2) this).anIntArray9904[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 145, 1);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 35, 3);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9895, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9896, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9897, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 206, 1);
		((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		super.method4895();
	}

	void method5182() {
		for (int i = 0; i < anInt8592; i++) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub2_Sub2) this).aLong9891), i, 2, 1);
			((Class_ra_Sub2_Sub2) this).aClass189Array9903[i] = Class189.aClass189_1856;
			boolean[] bools = ((Class_ra_Sub2_Sub2) this).aBooleanArray9915;
			int i_94_ = i;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890[i] = true;
			bools[i_94_] = true;
			((Class_ra_Sub2_Sub2) this).aBooleanArray9892[i] = false;
			((Class_ra_Sub2_Sub2) this).anIntArray9904[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 9, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 23, 4);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 25, 5);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 24, 0);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 22, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 147, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 145, 1);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 35, 3);
		IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 154, 1.0F);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9895, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9896, 3);
		D3DLIGHT.SetType(((Class_ra_Sub2_Sub2) this).aLong9897, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 206, 1);
		((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		super.method4895();
	}

	public void method4891(Class249 class249, Class249 class249_95_, Class249 class249_96_) {
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 256, class249.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 2, class249_95_.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 3, class249_96_.aFloatArray2631);
	}

	public int[] fm(int i, int i_97_, int i_98_, int i_99_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class_ra_Sub2_Sub2) this).aLong9891, 0);
		long l_100_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub2_Sub2) this).aLong9891), i_98_, i_99_, 21, 0, 0, true);
		if (r.j(IDirect3DDevice.StretchRect((((Class_ra_Sub2_Sub2) this).aLong9891), l, i, i_97_, i_98_, i_99_, l_100_, 0, 0, i_98_, i_99_, 1))) {
			is = new int[i_98_ * i_99_];
			IDirect3DSurface.Download(l_100_, 0, 0, i_98_, i_99_, i_98_ * 4, 16, aLong8459);
			aByteBuffer8458.clear();
			aByteBuffer8458.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_100_);
		return is;
	}

	public float method4887() {
		return -0.5F;
	}

	void method5049() {
		if (aBoolean8601) {
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9895, -aFloatArray8525[0], -aFloatArray8525[1], -aFloatArray8525[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9896, -aFloatArray8451[0], -aFloatArray8451[1], -aFloatArray8451[2]);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	void method5034() {
		IDirect3DDevice.SetScissorRect(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8517 + anInt8610, anInt8518 + anInt8521, anInt8447, anInt8506);
	}

	void method4960() {
		IDirect3DDevice.SetScissorRect(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8517 + anInt8610, anInt8518 + anInt8521, anInt8447, anInt8506);
	}

	void method5084() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 174, aBoolean8612);
	}

	void method5010() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 174, aBoolean8612);
	}

	void method5041() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 7, aBoolean8526);
	}

	void method5046() {
		if (aBoolean8601) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub2_Sub2) this).aLong9895, aFloat8530 * aFloat8533, aFloat8500 * aFloat8533, aFloat8532 * aFloat8533, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	void method5043() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 14, aBoolean8519 && aBoolean8454);
	}

	public void dh(boolean bool) {
		/* empty */
	}

	public Interface8_Impl1_Impl1 kp(int i, int i_101_) {
		return new Class236(this, Class86.aClass86_719, i, i_101_, 0);
	}

	void method5044() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 137, aBoolean8522 && !aBoolean8575);
	}

	void method5045() {
		if (aBoolean8601) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub2_Sub2) this).aLong9895, aFloat8530 * aFloat8533, aFloat8500 * aFloat8533, aFloat8532 * aFloat8533, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	public Class76_Sub2 jw() {
		return new Class76_Sub2_Sub3_Sub1(this);
	}

	void method5075() {
		if (aBoolean8601) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub2_Sub2) this).aLong9895, aFloat8530 * aFloat8533, aFloat8500 * aFloat8533, aFloat8532 * aFloat8533, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	void method5047() {
		if (aBoolean8601) {
			float f = aBoolean8523 ? aFloat8489 : 0.0F;
			float f_102_ = aBoolean8523 ? -aFloat8535 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9895, f * aFloat8530, f * aFloat8500, f * aFloat8532, 0.0F);
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9896, f_102_ * aFloat8530, f_102_ * aFloat8500, f_102_ * aFloat8532, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	Interface11_Impl3 method4950(int i, int i_103_, boolean bool, int[] is, int i_104_, int i_105_) {
		return new Class229_Sub1(this, i, i_103_, bool, is, i_104_, i_105_);
	}

	void method5030() {
		if (aBoolean8601) {
			float f = aBoolean8523 ? aFloat8489 : 0.0F;
			float f_106_ = aBoolean8523 ? -aFloat8535 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9895, f * aFloat8530, f * aFloat8500, f * aFloat8532, 0.0F);
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9896, f_106_ * aFloat8530, f_106_ * aFloat8500, f_106_ * aFloat8532, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	void method5048() {
		if (aBoolean8601) {
			float f = aBoolean8523 ? aFloat8489 : 0.0F;
			float f_107_ = aBoolean8523 ? -aFloat8535 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9895, f * aFloat8530, f * aFloat8500, f * aFloat8532, 0.0F);
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9896, f_107_ * aFloat8530, f_107_ * aFloat8500, f_107_ * aFloat8532, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	void method5029() {
		if (aBoolean8601) {
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9895, -aFloatArray8525[0], -aFloatArray8525[1], -aFloatArray8525[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9896, -aFloatArray8451[0], -aFloatArray8451[1], -aFloatArray8451[2]);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	void method5120() {
		if (aBoolean8601) {
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9895, -aFloatArray8525[0], -aFloatArray8525[1], -aFloatArray8525[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub2_Sub2) this).aLong9896, -aFloatArray8451[0], -aFloatArray8451[1], -aFloatArray8451[2]);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	Interface11_Impl3_Impl1 method5073(Class72 class72, Class86 class86, int i, int i_108_) {
		return new Class229_Sub1_Sub1(this, class72, class86, i, i_108_);
	}

	void method5050() {
		if (aBoolean8601 && !((Class_ra_Sub2_Sub2) this).aBoolean9898) {
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, false);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, false);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 0, ((Class_ra_Sub2_Sub2) this).aLong9895);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 1, ((Class_ra_Sub2_Sub2) this).aLong9896);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, true);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, true);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = true;
		}
	}

	public void method5098(Class184 class184) {
		Class184_Sub1 class184_sub1 = (Class184_Sub1) class184;
		IDirect3DDevice.SetVertexDeclaration((((Class_ra_Sub2_Sub2) this).aLong9891), (((Class184_Sub1) class184_sub1).aLong8909));
	}

	void method5052() {
		if (aBoolean8601 && !((Class_ra_Sub2_Sub2) this).aBoolean9898) {
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, false);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, false);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 0, ((Class_ra_Sub2_Sub2) this).aLong9895);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 1, ((Class_ra_Sub2_Sub2) this).aLong9896);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, true);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, true);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = true;
		}
	}

	void method5092() {
		if (aBoolean8601) {
			int i = (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] ? method5166(aClass179Array8547[anInt8543]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 1, i);
		}
	}

	void method5055() {
		int i;
		for (i = 0; i < anInt8538; i++) {
			Class330_Sub14 class330_sub14 = aClass330_Sub14Array8607[i];
			int i_109_ = i + 2;
			int i_110_ = class330_sub14.method3313(-59578889);
			float f = class330_sub14.method3317(70437883) / 255.0F;
			D3DLIGHT.SetPosition(((Class_ra_Sub2_Sub2) this).aLong9897, (float) class330_sub14.method3318(-1044499438), (float) class330_sub14.method3311((byte) -26), (float) class330_sub14.method3312((short) -13255));
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9897, (float) (i_110_ >> 16 & 0xff) * f, (float) (i_110_ >> 8 & 0xff) * f, (float) (i_110_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class_ra_Sub2_Sub2) this).aLong9897, 0.0F, 0.0F, 1.0F / (float) (class330_sub14.method3316((byte) 56) * class330_sub14.method3316((byte) 25)));
			D3DLIGHT.SetRange(((Class_ra_Sub2_Sub2) this).aLong9897, (float) class330_sub14.method3316((byte) -57));
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, i_109_, ((Class_ra_Sub2_Sub2) this).aLong9897);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, i_109_, true);
		}
		for (/**/; i < anInt8537; i++)
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, i + 2, false);
	}

	public void method5134(Class249 class249, Class249 class249_111_, Class249 class249_112_) {
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 256, class249.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 2, class249_111_.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 3, class249_112_.aFloatArray2631);
	}

	Class184 method5003(Class193[] class193s) {
		return new Class184_Sub1(this, class193s);
	}

	boolean method5002(Class72 class72, Class86 class86) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (r.j(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, d3ddisplaymode)) && r.j(IDirect3D.CheckDeviceFormat(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, d3ddisplaymode.Format, 0, 3, method5183(class72, class86))));
	}

	Interface11_Impl3 method5060(Class72 class72, int i, int i_113_, boolean bool, byte[] is, int i_114_, int i_115_) {
		return new Class229_Sub1(this, class72, i, i_113_, bool, is, i_114_, i_115_);
	}

	final void method5115(Interface9_Impl2 interface9_impl2, Class199 class199, int i, int i_116_, int i_117_, int i_118_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawIndexedPrimitiveIB(((Class_ra_Sub2_Sub2) this).aLong9891, ((Class218) (Class218) interface9_impl2).aLong8933, 4, 0, i, i_116_, i_117_, i_118_);
	}

	Interface11_Impl3 method5058(Class72 class72, int i, int i_119_, boolean bool, float[] fs, int i_120_, int i_121_) {
		return new Class229_Sub1(this, class72, i, i_119_, bool, fs, i_120_, i_121_);
	}

	Interface11_Impl3 method5062(Class72 class72, int i, int i_122_, boolean bool, float[] fs, int i_123_, int i_124_) {
		return new Class229_Sub1(this, class72, i, i_122_, bool, fs, i_123_, i_124_);
	}

	public float method4901() {
		return -0.5F;
	}

	Interface11_Impl3_Impl1 method5074(Class72 class72, Class86 class86, int i, int i_125_) {
		return new Class229_Sub1_Sub1(this, class72, class86, i, i_125_);
	}

	Interface11_Impl3 method5065(int i, int i_126_, boolean bool, int[] is, int i_127_, int i_128_) {
		return new Class229_Sub1(this, i, i_126_, bool, is, i_127_, i_128_);
	}

	Interface11_Impl3 method5066(int i, int i_129_, boolean bool, int[] is, int i_130_, int i_131_) {
		return new Class229_Sub1(this, i, i_129_, bool, is, i_130_, i_131_);
	}

	void method5135(boolean bool) {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 161, bool);
	}

	Interface11_Impl1 method4957(int i, boolean bool, int[][] is) {
		return new Class229_Sub2(this, i, bool, is);
	}

	Interface11_Impl1 method5068(int i, boolean bool, int[][] is) {
		return new Class229_Sub2(this, i, bool, is);
	}

	void method5097() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 27, aBoolean8546);
	}

	Interface11_Impl2 method5070(Class72 class72, int i, int i_132_, int i_133_, boolean bool, byte[] is) {
		return new Class229_Sub3(this, class72, i, i_132_, i_133_, bool, is);
	}

	Interface11_Impl2 method5071(Class72 class72, int i, int i_134_, int i_135_, boolean bool, byte[] is) {
		return new Class229_Sub3(this, class72, i, i_134_, i_135_, bool, is);
	}

	void method4938() {
		if (aBoolean8601) {
			float f = aBoolean8523 ? aFloat8489 : 0.0F;
			float f_136_ = aBoolean8523 ? -aFloat8535 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9895, f * aFloat8530, f * aFloat8500, f * aFloat8532, 0.0F);
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9896, f_136_ * aFloat8530, f_136_ * aFloat8500, f_136_ * aFloat8532, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	Class_ra_Sub2_Sub2(int i, int i_137_, long l, long l_138_, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, Interface_ma interface_ma, IndexTable class280, int i_139_) {
		super(interface_ma, class280, i_139_, 0);
		((Class_ra_Sub2_Sub2) this).aLong9891 = 0L;
		((Class_ra_Sub2_Sub2) this).aClass471_9893 = new Class471();
		((Class_ra_Sub2_Sub2) this).anInt9894 = 0;
		((Class_ra_Sub2_Sub2) this).aLong9895 = 0L;
		((Class_ra_Sub2_Sub2) this).aLong9896 = 0L;
		((Class_ra_Sub2_Sub2) this).aLong9897 = 0L;
		((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		((Class_ra_Sub2_Sub2) this).aFloatArray9913 = new float[16];
		((Class_ra_Sub2_Sub2) this).anInt9914 = 128;
		((Class_ra_Sub2_Sub2) this).anInt9916 = 0;
		((Class_ra_Sub2_Sub2) this).aLongArray9900 = new long[((Class_ra_Sub2_Sub2) this).anInt9914];
		try {
			((Class_ra_Sub2_Sub2) this).anInt9918 = i;
			((Class_ra_Sub2_Sub2) this).anInt9889 = i_137_;
			((Class_ra_Sub2_Sub2) this).aLong9910 = l;
			((Class_ra_Sub2_Sub2) this).aLong9891 = l_138_;
			((Class_ra_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9899 = d3dpresent_parameters;
			((Class_ra_Sub2_Sub2) this).aD3DCAPS9908 = d3dcaps;
			((Class_ra_Sub2_Sub2) this).aLong9895 = D3DLIGHT.Create();
			((Class_ra_Sub2_Sub2) this).aLong9896 = D3DLIGHT.Create();
			((Class_ra_Sub2_Sub2) this).aLong9897 = D3DLIGHT.Create();
			anInt8592 = (((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.MaxSimultaneousTextures);
			anInt8593 = (((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.MaxActiveLights > 0 ? ((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.MaxActiveLights : 8);
			((Class_ra_Sub2_Sub2) this).aBoolean9909 = ((((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.TextureCaps & 0x2) == 0);
			aBoolean8598 = (((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.TextureCaps & 0x2000) != 0;
			((Class_ra_Sub2_Sub2) this).aBoolean9911 = (((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.TextureCaps & 0x10000) != 0;
			((Class_ra_Sub2_Sub2) this).aBoolean9888 = (((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.TextureCaps & 0x4000) != 0;
			aBoolean8594 = (((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.NumSimultaneousRTs > 0);
			aBoolean8595 = (((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.NumSimultaneousRTs > 0);
			aBoolean8566 = anInt8490 > 0 || (IDirect3D.CheckDeviceMultiSampleType(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, (((Class_ra_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS9899.BackBufferFormat), true, 2)) == 0;
			aBoolean8496 = ((((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.NumSimultaneousRTs > 0) && anInt8490 > 0 || ((IDirect3D.CheckDeviceMultiSampleType(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, 113, true, 2)) == 0));
			((Class_ra_Sub2_Sub2) this).aBooleanArray9915 = new boolean[anInt8592];
			((Class_ra_Sub2_Sub2) this).aBooleanArray9890 = new boolean[anInt8592];
			((Class_ra_Sub2_Sub2) this).aBooleanArray9901 = new boolean[anInt8592];
			((Class_ra_Sub2_Sub2) this).aClass189Array9903 = new Class189[anInt8592];
			((Class_ra_Sub2_Sub2) this).aBooleanArray9892 = new boolean[anInt8592];
			((Class_ra_Sub2_Sub2) this).anIntArray9904 = new int[anInt8592];
			Class247 class247 = new Class247();
			class247.method2463(1.0F, -1.0F, 0.5F);
			class247.method2474(0.0F, 0.0F, 0.5F);
			((Class_ra_Sub2_Sub2) this).aClass249_9905 = new Class249();
			((Class_ra_Sub2_Sub2) this).aClass249_9905.method2508(class247);
			IDirect3DDevice.BeginScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method4781(628001038);
			throw new RuntimeException("");
		}
	}

	void method5083() {
		if (((Class_ra_Sub2_Sub2) this).aLong9907 == 0L && aClass181Array8509[anInt8543] != Class181.aClass181_1784) {
			if (aClass181Array8509[anInt8543] == Class181.aClass181_1785)
				IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 16 + anInt8543, (aClass249Array8545[anInt8543].method2506(((Class_ra_Sub2_Sub2) this).aFloatArray9913)));
			else
				IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 16 + anInt8543, (aClass249Array8545[anInt8543].method2514(((Class_ra_Sub2_Sub2) this).aFloatArray9913)));
			int i = method5167(aClass181Array8509[anInt8543]);
			if (i != ((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543]) {
				IDirect3DDevice.SetTextureStageState(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 24, i);
				((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 24, 0);
			((Class_ra_Sub2_Sub2) this).anIntArray9904[anInt8543] = 0;
		}
	}

	Interface11_Impl3 method4899(int i, int i_140_, boolean bool, int[] is, int i_141_, int i_142_) {
		return new Class229_Sub1(this, i, i_140_, bool, is, i_141_, i_142_);
	}

	public void method5078() {
		if (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543]) {
			((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] = false;
			IDirect3DDevice.SetTexture(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8543, 0L);
			method4968();
			method5053();
		}
	}

	void method5096() {
		switch (aClass176_8583.anInt1746) {
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 5);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 6);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 9);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 2);
			break;
		}
		switch (anInt8613) {
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 1);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 2);
			break;
		}
	}

	void method4913() {
		IDirect3DDevice.SetScissorRect(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8517 + anInt8610, anInt8518 + anInt8521, anInt8447, anInt8506);
	}

	public boolean method4886() {
		return ((((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.PixelShaderVersion & 0xffff) >= 257);
	}

	void method5087() {
		/* empty */
	}

	void method5028() {
		if (aBoolean8601) {
			float f = aBoolean8523 ? aFloat8489 : 0.0F;
			float f_143_ = aBoolean8523 ? -aFloat8535 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9895, f * aFloat8530, f * aFloat8500, f * aFloat8532, 0.0F);
			D3DLIGHT.SetDiffuse(((Class_ra_Sub2_Sub2) this).aLong9896, f_143_ * aFloat8530, f_143_ * aFloat8500, f_143_ * aFloat8532, 0.0F);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = false;
		}
	}

	void method5088() {
		/* empty */
	}

	void method5089() {
		/* empty */
	}

	void method4988() {
		/* empty */
	}

	public Class51 dt() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, 0, d3dadapter_identifier);
		return new Class51(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	void method5093(int i) {
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 168, i);
	}

	void method5094(int i) {
		IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 168, i);
	}

	void method5095() {
		switch (aClass176_8583.anInt1746) {
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 5);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 6);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 19, 9);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 20, 2);
			break;
		}
		switch (anInt8613) {
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 1);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub2_Sub2) this).aLong9891, 208, 2);
			break;
		}
	}

	static final int method5183(Class72 class72, Class86 class86) {
		switch (class86.anInt722 * 618977773) {
		case 1:
			switch (class72.anInt619 * 1333099709) {
			case 2:
				return 28;
			case 6:
				return 51;
			case 7:
				return 77;
			case 3:
				return 21;
			case 1:
				return jagdx.i.u * 1344518703;
			case 9:
				return 22;
			case 4:
				return 50;
			case 8:
				return jagdx.i.q * -2143809611;
			default:
				break;
			}
			break;
		case 5:
			if (class72 == Class72.aClass72_620)
				return 116;
			break;
		case 8:
			if (class72 == Class72.aClass72_620)
				return 113;
			break;
		}
		throw new IllegalArgumentException("");
	}

	void method5100() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 28, aBoolean8514 && aBoolean8502 && anInt8578 >= 0);
	}

	void dl(int i, int i_144_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		int i_145_ = aClass76_Sub1_4234.method874();
		if (r.r(i_145_)) {
			if (i_145_ != -2005530520) {
				if (++((Class_ra_Sub2_Sub2) this).anInt9894 > 50)
					throw new Exception_Sub1(i_145_);
			} else {
				aClass76_Sub1_4234.method179();
				method5178();
				((Class76_Sub1_Sub2_Sub1) aClass76_Sub1_4234).method173();
			}
		} else
			((Class_ra_Sub2_Sub2) this).anInt9894 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 8477);
	}

	void method5025() {
		aFloat8581 = aFloat8504 - (float) anInt8560;
		aFloat8580 = aFloat8581 - (float) anInt8578;
		if (aFloat8580 < aFloat8471)
			aFloat8580 = aFloat8471;
		if (aBoolean8601) {
			IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 36, aFloat8580);
			IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 37, aFloat8581);
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 34, anInt8476);
		}
	}

	void method5121() {
		aFloat8581 = aFloat8504 - (float) anInt8560;
		aFloat8580 = aFloat8581 - (float) anInt8578;
		if (aFloat8580 < aFloat8471)
			aFloat8580 = aFloat8471;
		if (aBoolean8601) {
			IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 36, aFloat8580);
			IDirect3DDevice.r(((Class_ra_Sub2_Sub2) this).aLong9891, 37, aFloat8581);
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 34, anInt8476);
		}
	}

	void method4991() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 28, aBoolean8514 && aBoolean8502 && anInt8578 >= 0);
	}

	final void method5139(int i, Class175 class175, boolean bool) {
		if (aBoolean8601) {
			int i_146_ = 0;
			int i_147_;
			switch (i) {
			default:
				i_147_ = 5;
				break;
			case 2:
				i_147_ = 27;
				break;
			case 1:
				i_147_ = 6;
			}
			if (bool)
				i_146_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, i_147_, (method5186(class175) | i_146_));
		}
	}

	void method5101() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 28, aBoolean8514 && aBoolean8502 && anInt8578 >= 0);
	}

	void method5102(boolean bool) {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 161, bool);
	}

	Class184 method4931(Class193[] class193s) {
		return new Class184_Sub1(this, class193s);
	}

	public void df() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method4973() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 15, aBoolean8585);
	}

	public void method5105(Class184 class184) {
		Class184_Sub1 class184_sub1 = (Class184_Sub1) class184;
		IDirect3DDevice.SetVertexDeclaration((((Class_ra_Sub2_Sub2) this).aLong9891), (((Class184_Sub1) class184_sub1).aLong8909));
	}

	public void method5106(int i, Interface9_Impl1 interface9_impl1) {
		Class224 class224 = (Class224) interface9_impl1;
		IDirect3DDevice.SetStreamSource(((Class_ra_Sub2_Sub2) this).aLong9891, i, ((Class224) class224).aLong8927, 0, class224.method2299());
	}

	public void method5107(int i, Interface9_Impl1 interface9_impl1) {
		Class224 class224 = (Class224) interface9_impl1;
		IDirect3DDevice.SetStreamSource(((Class_ra_Sub2_Sub2) this).aLong9891, i, ((Class224) class224).aLong8927, 0, class224.method2299());
	}

	void method5004(Interface9_Impl2 interface9_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub2_Sub2) this).aLong9891, (((Class218) (Class218) interface9_impl2).aLong8933));
	}

	void method5108(Interface9_Impl2 interface9_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub2_Sub2) this).aLong9891, (((Class218) (Class218) interface9_impl2).aLong8933));
	}

	public void dy() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (r.j(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method5110(Interface9_Impl2 interface9_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub2_Sub2) this).aLong9891, (((Class218) (Class218) interface9_impl2).aLong8933));
	}

	public final void method5113(Class199 class199, int i, int i_148_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawPrimitive(((Class_ra_Sub2_Sub2) this).aLong9891, method5171(class199), i, i_148_);
	}

	public final void method5104(Class199 class199, int i, int i_149_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawPrimitive(((Class_ra_Sub2_Sub2) this).aLong9891, method5171(class199), i, i_149_);
	}

	public void method5133(Class249 class249, Class249 class249_150_, Class249 class249_151_) {
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 256, class249.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 2, class249_150_.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 3, class249_151_.aFloatArray2631);
	}

	public final void method5038(Class199 class199, int i, int i_152_, int i_153_, int i_154_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub2_Sub2) this).aLong9891), method5171(class199), 0, i, i_152_, i_153_, i_154_);
	}

	void dc(int i, int i_155_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		int i_156_ = aClass76_Sub1_4234.method874();
		if (r.r(i_156_)) {
			if (i_156_ != -2005530520) {
				if (++((Class_ra_Sub2_Sub2) this).anInt9894 > 50)
					throw new Exception_Sub1(i_156_);
			} else {
				aClass76_Sub1_4234.method179();
				method5178();
				((Class76_Sub1_Sub2_Sub1) aClass76_Sub1_4234).method173();
			}
		} else
			((Class_ra_Sub2_Sub2) this).anInt9894 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -9665);
	}

	void method5117(int i) {
		if (!((Class_ra_Sub2_Sub2) this).aBoolean9912) {
			int i_157_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 8, i_157_);
		}
	}

	static Class_ra method5184(Canvas canvas, Interface_ma interface_ma, IndexTable class280, Integer integer) {
		Class_ra_Sub2_Sub2 class_ra_sub2_sub2 = null;
		Class_ra_Sub2_Sub2 class_ra_sub2_sub2_158_;
		try {
			int i = 0;
			int i_159_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_159_, d3dcaps);
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			if (!method5172(i, i_159_, l, integer.intValue(), d3dpresent_parameters))
				throw new RuntimeException("");
			int i_160_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_160_ |= 0x10;
			long l_161_ = 0L;
			try {
				l_161_ = IDirect3D.CreateDeviceContext(l, i, i_159_, canvas, i_160_ | 0x40, d3dpresent_parameters);
			} catch (z var_z) {
				l_161_ = IDirect3D.CreateDeviceContext(l, i, i_159_, canvas, i_160_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class_ra_sub2_sub2 = new Class_ra_Sub2_Sub2(i, i_159_, l, l_161_, d3dpresent_parameters, d3dcaps, interface_ma, class280, integer.intValue());
			if (!class_ra_sub2_sub2.aHashtable4231.containsKey(canvas)) {
				Class377.method4375(canvas, -1433851980);
				class_ra_sub2_sub2.method4805(canvas, new Class76_Sub1_Sub2_Sub1(class_ra_sub2_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), 1850446711);
			}
			class_ra_sub2_sub2.method4784(canvas, 729711285);
			class_ra_sub2_sub2.method4910();
			class_ra_sub2_sub2_158_ = class_ra_sub2_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class_ra_sub2_sub2 != null)
				class_ra_sub2_sub2.u();
			throw runtimeexception;
		}
		return class_ra_sub2_sub2_158_;
	}

	final void method4967() {
		if (aBoolean8601)
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 60, anInt8445);
	}

	void u() {
		super.u();
		if (((Class_ra_Sub2_Sub2) this).aLong9895 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9895);
			((Class_ra_Sub2_Sub2) this).aLong9895 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9896 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9896);
			((Class_ra_Sub2_Sub2) this).aLong9896 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9897 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9897);
			((Class_ra_Sub2_Sub2) this).aLong9897 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9891 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub2_Sub2) this).aLong9891);
			((Class_ra_Sub2_Sub2) this).aLong9891 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9910 != 0L) {
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLong9910);
			((Class_ra_Sub2_Sub2) this).aLong9910 = 0L;
		}
	}

	public Class105 method4928(String string) {
		byte[] is = method5169(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub1(this, class113);
	}

	void method4934() {
		if (aBoolean8601)
			IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 137, aBoolean8522 && !aBoolean8575);
	}

	public boolean method5051() {
		return ((((Class_ra_Sub2_Sub2) this).aD3DCAPS9908.VertexShaderVersion & 0xffff) >= 257);
	}

	void method5118() {
		if (aClass76_4228 != null)
			IDirect3DDevice.SetViewport(((Class_ra_Sub2_Sub2) this).aLong9891, anInt8517 + anInt8531, anInt8518 + anInt8567, anInt8515, anInt8516, aFloat8499, aFloat8478);
	}

	void method4932() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 7, aBoolean8526);
	}

	void method5185() {
		for (Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5869(539664854); class330_sub35 != null; class330_sub35 = (Class330_Sub35) ((Class_ra_Sub2_Sub2) this).aClass471_9893.method5873((byte) -83)) {
			Interface13 interface13 = (Interface13) class330_sub35.anObject7733;
			interface13.method179();
		}
		super.method4998();
	}

	static final int method5186(Class175 class175) {
		switch (class175.anInt1742) {
		case 2:
			return 0;
		default:
			throw new IllegalArgumentException();
		case 1:
			return 2;
		case 0:
			return 3;
		case 3:
			return 1;
		}
	}

	void method4914() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 174, aBoolean8612);
	}

	public void method4917(Class249 class249) {
		class249.method2483(((Class_ra_Sub2_Sub2) this).aClass249_9905);
	}

	void di() {
		super.u();
		if (((Class_ra_Sub2_Sub2) this).aLong9895 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9895);
			((Class_ra_Sub2_Sub2) this).aLong9895 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9896 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9896);
			((Class_ra_Sub2_Sub2) this).aLong9896 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9897 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub2_Sub2) this).aLong9897);
			((Class_ra_Sub2_Sub2) this).aLong9897 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9891 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub2_Sub2) this).aLong9891);
			((Class_ra_Sub2_Sub2) this).aLong9891 = 0L;
		}
		if (((Class_ra_Sub2_Sub2) this).aLong9910 != 0L) {
			IUnknown.Release(((Class_ra_Sub2_Sub2) this).aLong9910);
			((Class_ra_Sub2_Sub2) this).aLong9910 = 0L;
		}
	}

	public void method5020(Class249 class249) {
		class249.method2483(((Class_ra_Sub2_Sub2) this).aClass249_9905);
	}

	void method5122() {
		method4938();
		method4939();
	}

	public Class105 method5024(String string) {
		byte[] is = method5169(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub1(this, class113);
	}

	void method5124() {
		method4938();
		method4939();
	}

	void method5011() {
		/* empty */
	}

	boolean method5125(Class72 class72, Class86 class86) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (r.j(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, d3ddisplaymode)) && r.j(IDirect3D.CheckDeviceFormat(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, d3ddisplaymode.Format, 0, 4, method5183(class72, class86))));
	}

	public final void method4987(Class199 class199, int i, int i_162_, int i_163_, int i_164_) {
		if (((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906 != null)
			((Class_ra_Sub2_Sub2) this).aClass123_Sub1_9906.method1515();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub2_Sub2) this).aLong9891), method5171(class199), 0, i, i_162_, i_163_, i_164_);
	}

	public Class92 iu(Class92 class92, Class92 class92_165_, float f, Class92 class92_166_) {
		return f < 0.5F ? class92 : class92_165_;
	}

	void method5127() {
		if (aBoolean8601) {
			int i = (((Class_ra_Sub2_Sub2) this).aBooleanArray9901[anInt8543] ? method5166(aClass179Array8548[anInt8543]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, 4, i);
		}
	}

	final void method5128() {
		if (aBoolean8601)
			IDirect3DDevice.SetRenderState((((Class_ra_Sub2_Sub2) this).aLong9891), 60, anInt8445);
	}

	void method5129() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 15, aBoolean8585);
	}

	void method5000() {
		if (aBoolean8601 && !((Class_ra_Sub2_Sub2) this).aBoolean9898) {
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, false);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, false);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 0, ((Class_ra_Sub2_Sub2) this).aLong9895);
			IDirect3DDevice.SetLight(((Class_ra_Sub2_Sub2) this).aLong9891, 1, ((Class_ra_Sub2_Sub2) this).aLong9896);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 0, true);
			IDirect3DDevice.LightEnable(((Class_ra_Sub2_Sub2) this).aLong9891, 1, true);
			((Class_ra_Sub2_Sub2) this).aBoolean9898 = true;
		}
	}

	void method4989() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 15, aBoolean8585);
	}

	final Interface9_Impl2 method5130(boolean bool) {
		return new Class218(this, Class86.aClass86_718, bool);
	}

	final Interface9_Impl1 method5131(boolean bool) {
		return new Class224(this, bool);
	}

	Class76_Sub1 fu(Canvas canvas, int i, int i_167_) {
		return new Class76_Sub1_Sub2_Sub1(this, canvas, i, i_167_, false);
	}

	void dv(int i, int i_168_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		int i_169_ = aClass76_Sub1_4234.method874();
		if (r.r(i_169_)) {
			if (i_169_ != -2005530520) {
				if (++((Class_ra_Sub2_Sub2) this).anInt9894 > 50)
					throw new Exception_Sub1(i_169_);
			} else {
				aClass76_Sub1_4234.method179();
				method5178();
				((Class76_Sub1_Sub2_Sub1) aClass76_Sub1_4234).method173();
			}
		} else
			((Class_ra_Sub2_Sub2) this).anInt9894 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub2_Sub2) this).aLong9891);
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -711);
	}

	void method5109(Interface9_Impl2 interface9_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub2_Sub2) this).aLong9891, (((Class218) (Class218) interface9_impl2).aLong8933));
	}

	Interface11_Impl3 method5061(Class72 class72, int i, int i_170_, boolean bool, float[] fs, int i_171_, int i_172_) {
		return new Class229_Sub1(this, class72, i, i_170_, bool, fs, i_171_, i_172_);
	}

	final void method5080(int i, Class175 class175, boolean bool, boolean bool_173_) {
		if (aBoolean8601) {
			int i_174_ = 0;
			int i_175_;
			switch (i) {
			default:
				i_175_ = 2;
				break;
			case 1:
				i_175_ = 3;
				break;
			case 2:
				i_175_ = 26;
			}
			if (bool)
				i_174_ |= 0x20;
			if (bool_173_)
				i_174_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub2_Sub2) this).aLong9891), anInt8543, i_175_, (method5186(class175) | i_174_));
		}
	}

	boolean method5056(Class72 class72, Class86 class86) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (r.j(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, d3ddisplaymode)) && r.j(IDirect3D.CheckDeviceFormat(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, d3ddisplaymode.Format, 0, 3, method5183(class72, class86))));
	}

	void method5035() {
		IDirect3DDevice.j(((Class_ra_Sub2_Sub2) this).aLong9891, 15, aBoolean8585);
	}

	Interface11_Impl3 method5136(Class72 class72, Class86 class86, int i, int i_176_) {
		return new Class229_Sub1(this, class72, class86, i, i_176_);
	}

	public void method4941(Class249 class249, Class249 class249_177_, Class249 class249_178_) {
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 256, class249.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 2, class249_177_.aFloatArray2631);
		IDirect3DDevice.SetTransform(((Class_ra_Sub2_Sub2) this).aLong9891, 3, class249_178_.aFloatArray2631);
	}

	Interface11_Impl3_Impl1 method5072(Class72 class72, Class86 class86, int i, int i_179_) {
		return new Class229_Sub1_Sub1(this, class72, class86, i, i_179_);
	}

	Interface11_Impl3 method5137(Class72 class72, Class86 class86, int i, int i_180_) {
		return new Class229_Sub1(this, class72, class86, i, i_180_);
	}

	Interface11_Impl3 method5138(Class72 class72, Class86 class86, int i, int i_181_) {
		return new Class229_Sub1(this, class72, class86, i, i_181_);
	}

	boolean method4996(Class72 class72, Class86 class86) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (r.j(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, d3ddisplaymode)) && r.j(IDirect3D.CheckDeviceFormat(((Class_ra_Sub2_Sub2) this).aLong9910, ((Class_ra_Sub2_Sub2) this).anInt9918, ((Class_ra_Sub2_Sub2) this).anInt9889, d3ddisplaymode.Format, 0, 4, method5183(class72, class86))));
	}
}
