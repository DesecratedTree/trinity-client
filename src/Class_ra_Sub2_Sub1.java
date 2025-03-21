/* Class_ra_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class_ra_Sub2_Sub1 extends Class_ra_Sub2 {
	float[] aFloatArray9858;
	int anInt9859;
	Class471 aClass471_9860;
	Class471 aClass471_9861;
	Class471 aClass471_9862;
	Class471 aClass471_9863;
	Class471 aClass471_9864;
	Class471 aClass471_9865;
	long aLong9866;
	boolean aBoolean9867;
	boolean aBoolean9868;
	boolean aBoolean9869;
	Class471 aClass471_9870 = new Class471();
	int anInt9871;
	Class266_Sub1[] aClass266_Sub1Array9872;
	boolean aBoolean9873;
	int[] anIntArray9874;
	Class123_Sub2 aClass123_Sub2_9875;
	String aString9876;
	String aString9877;
	boolean aBoolean9878;
	boolean aBoolean9879;
	boolean aBoolean9880;
	OpenGL anOpenGL9881;
	int[] anIntArray9882;
	boolean aBoolean9883;
	int anInt9884;
	boolean aBoolean9885;
	Class266_Sub2 aClass266_Sub2_9886;
	float[] aFloatArray9887;

	void method4912() {
		if (aClass76_4228 != null)
			OpenGL.glViewport(anInt8517 + anInt8531, (anInt8518 + aClass76_4228.method857() - anInt8567 - anInt8516), anInt8515, anInt8516);
		OpenGL.glDepthRange(aFloat8499, aFloat8478);
	}

	public Interface8_Impl1_Impl1 kb(int i, int i_0_, int i_1_) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, i, i_0_, i_1_);
	}

	public boolean method5051() {
		return ((Class_ra_Sub2_Sub1) this).aBoolean9873;
	}

	public boolean method4886() {
		return ((Class_ra_Sub2_Sub1) this).aBoolean9883;
	}

	Class_ra_Sub2_Sub1(OpenGL opengl, Canvas canvas, long l, Interface_ma interface_ma, IndexTable class280, int i) {
		super(interface_ma, class280, i, 1);
		((Class_ra_Sub2_Sub1) this).aClass471_9860 = new Class471();
		((Class_ra_Sub2_Sub1) this).aClass471_9861 = new Class471();
		((Class_ra_Sub2_Sub1) this).aClass471_9862 = new Class471();
		((Class_ra_Sub2_Sub1) this).aClass471_9863 = new Class471();
		((Class_ra_Sub2_Sub1) this).aClass471_9864 = new Class471();
		((Class_ra_Sub2_Sub1) this).aClass471_9865 = new Class471();
		((Class_ra_Sub2_Sub1) this).anIntArray9882 = new int[1000];
		((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872 = new Class266_Sub1[16];
		new MapBuffer();
		new MapBuffer();
		((Class_ra_Sub2_Sub1) this).aFloatArray9858 = new float[4];
		((Class_ra_Sub2_Sub1) this).aFloatArray9887 = new float[16];
		int[] is = new int[1];
		try {
			((Class_ra_Sub2_Sub1) this).anOpenGL9881 = opengl;
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.j();
			((Class_ra_Sub2_Sub1) this).aString9876 = OpenGL.glGetString(7936).toLowerCase();
			((Class_ra_Sub2_Sub1) this).aString9877 = OpenGL.glGetString(7937).toLowerCase();
			if ((((Class_ra_Sub2_Sub1) this).aString9876.indexOf("microsoft") != -1) || ((Class_ra_Sub2_Sub1) this).aString9876.indexOf("brian paul") != -1 || (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("mesa") != -1))
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class226.method2309(string.replace('.', ' '), ' ', (byte) -64);
			if (strings.length >= 2) {
				try {
					int i_2_ = Class204.method2185(strings[0], (byte) -123);
					int i_3_ = Class204.method2185(strings[1], (byte) -80);
					((Class_ra_Sub2_Sub1) this).anInt9859 = i_2_ * 10 + i_3_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (((Class_ra_Sub2_Sub1) this).anInt9859 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt8592 = is[0];
			if (anInt8592 < 2)
				throw new RuntimeException("");
			anInt8593 = 8;
			((Class_ra_Sub2_Sub1) this).aBoolean9879 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_vertex_buffer_object");
			aBoolean8566 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_multisample");
			((Class_ra_Sub2_Sub1) this).aBoolean9880 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_texture_rectangle");
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_texture_cube_map");
			((Class_ra_Sub2_Sub1) this).aBoolean9867 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_texture_non_power_of_two");
			aBoolean8598 = true;
			((Class_ra_Sub2_Sub1) this).aBoolean9873 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_vertex_shader");
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_vertex_program");
			((Class_ra_Sub2_Sub1) this).aBoolean9883 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_fragment_shader");
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_fragment_program");
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_EXT_framebuffer_object");
			((Class_ra_Sub2_Sub1) this).anIntArray9874 = new int[anInt8592];
			aBoolean8594 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_EXT_framebuffer_object");
			aBoolean8595 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_EXT_framebuffer_blit");
			aBoolean8496 = ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_EXT_framebuffer_multisample");
			if (!method5051() || !method4886()) {
				if (!((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			((Class_ra_Sub2_Sub1) this).anInt9884 = Stream.z() ? 33639 : 5121;
			if (((Class_ra_Sub2_Sub1) this).aString9877.indexOf("radeon") != -1) {
				int i_4_ = 0;
				boolean bool = false;
				boolean bool_5_ = false;
				String[] strings_6_ = Class226.method2309(((Class_ra_Sub2_Sub1) this).aString9877.replace('/', ' '), ' ', (byte) -113);
				for (int i_7_ = 0; i_7_ < strings_6_.length; i_7_++) {
					String string_8_ = strings_6_[i_7_];
					try {
						if (string_8_.length() <= 0)
							continue;
						if (string_8_.charAt(0) == 'x' && string_8_.length() >= 3 && Class72.method829(string_8_.substring(1, 3), 1100722716)) {
							string_8_ = string_8_.substring(1);
							bool_5_ = true;
						}
						if (string_8_.equals("hd")) {
							bool = true;
							continue;
						}
						if (string_8_.startsWith("hd")) {
							string_8_ = string_8_.substring(2);
							bool = true;
						}
						if (string_8_.length() < 4 || !Class72.method829(string_8_.substring(0, 4), -1901410822))
							continue;
						i_4_ = Class204.method2185(string_8_.substring(0, 4), (byte) -52);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (!bool_5_ && !bool) {
					if (i_4_ >= 7000 && i_4_ <= 7999)
						((Class_ra_Sub2_Sub1) this).aBoolean9879 = false;
					if (i_4_ >= 7000 && i_4_ <= 9250)
						aBoolean8598 = false;
				}
				((Class_ra_Sub2_Sub1) this).aBoolean9880 &= ((Class_ra_Sub2_Sub1) this).anOpenGL9881.r("GL_ARB_half_float_pixel");
			}
			if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("intel") == -1) {
				/* empty */
			}
			if (((Class_ra_Sub2_Sub1) this).aBoolean9879) {
				try {
					int[] is_9_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_9_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
			method4805(canvas, new Class76_Sub1_Sub2_Sub2(this, canvas, l), 1850446711);
			method4784(canvas, 54748574);
			method4908(32768, false);
			method4908(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method4781(628001038);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	void method4895() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8592 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_10_ = 16384 + i;
			OpenGL.glLightfv(i_10_, 4608, fs, 0);
			OpenGL.glLightf(i_10_, 4615, 0.0F);
			OpenGL.glLightf(i_10_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class_ra_Sub2_Sub1) this).anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	public void fi(int i, int i_11_) {
		int i_12_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_11_ & 0xff0000) / 1.671168E7F, (float) (i_11_ & 0xff00) / 65280.0F, (float) (i_11_ & 0xff) / 255.0F, (float) (i_11_ >>> 24) / 255.0F);
			i_12_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method4962(true);
			i_12_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_12_ |= 0x400;
		OpenGL.glClear(i_12_);
	}

	void w(int i, int i_13_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method874();
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 9633);
	}

	public void l() {
		OpenGL.glFinish();
	}

	void u() {
		super.u();
		if (((Class_ra_Sub2_Sub1) this).anOpenGL9881 != null) {
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.i();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.release();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881 = null;
		}
	}

	public float method4901() {
		return 0.0F;
	}

	final synchronized void method5140(int i, int i_14_) {
		Class330_Sub23 class330_sub23 = new Class330_Sub23(i_14_);
		class330_sub23.aLong3341 = (long) i * -1420004262915178823L;
		((Class_ra_Sub2_Sub1) this).aClass471_9863.method5878(class330_sub23, (short) 8192);
	}

	public Class76_Sub2 ag() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	public Interface8_Impl1_Impl2 az(int i, int i_15_, Class72 class72, Class86 class86, int i_16_) {
		return new Class264(this, class72, class86, i, i_15_, i_16_);
	}

	public Interface8_Impl1_Impl1 ah(int i, int i_17_) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, i, i_17_);
	}

	void method4913() {
		if (aClass76_4228 != null) {
			int i = anInt8517 + anInt8610;
			int i_18_ = anInt8518 + aClass76_4228.method857() - anInt8506;
			int i_19_ = anInt8447 - anInt8610;
			int i_20_ = anInt8506 - anInt8521;
			if (i_19_ < 0)
				i_19_ = 0;
			if (i_20_ < 0)
				i_20_ = 0;
			OpenGL.glScissor(i, i_18_, i_19_, i_20_);
		}
	}

	public int[] ar(int i, int i_21_, int i_22_, int i_23_) {
		int[] is = new int[i_22_ * i_23_];
		int i_24_ = aClass76_4228.method857();
		for (int i_25_ = 0; i_25_ < i_23_; i_25_++)
			OpenGL.glReadPixelsi(i, i_24_ - i_21_ - i_25_ - 1, i_22_, 1, 32993, ((Class_ra_Sub2_Sub1) this).anInt9884, is, i_25_ * i_22_);
		return is;
	}

	public void am() {
		if (aClass76_4228 != null) {
			int i = aClass76_4228.method856();
			int i_26_ = aClass76_4228.method857();
			if (i > 0 || i_26_ > 0) {
				int i_27_ = anInt8531;
				int i_28_ = anInt8567;
				int i_29_ = anInt8515;
				int i_30_ = anInt8516;
				au();
				int i_31_ = anInt8610;
				int i_32_ = anInt8447;
				int i_33_ = anInt8521;
				int i_34_ = anInt8506;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method4924();
				method4882(false);
				method4995(false);
				method5005(false);
				method4962(false);
				method4956(null);
				method4889(1);
				method4970(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_26_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_31_, i_33_, i_32_, i_34_);
				ae(i_27_, i_28_, i_29_, i_30_);
			}
		}
	}

	public Class92 cp(Class92 class92, Class92 class92_35_, float f, Class92 class92_36_) {
		return f < 0.5F ? class92 : class92_35_;
	}

	public void ba(int i, int i_37_) {
		int i_38_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_37_ & 0xff0000) / 1.671168E7F, (float) (i_37_ & 0xff00) / 65280.0F, (float) (i_37_ & 0xff) / 255.0F, (float) (i_37_ >>> 24) / 255.0F);
			i_38_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method4962(true);
			i_38_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_38_ |= 0x400;
		OpenGL.glClear(i_38_);
	}

	Interface11_Impl1 method4957(int i, boolean bool, int[][] is) {
		return new Class287_Sub4(this, i, bool, is);
	}

	public void method5103(Class249 class249) {
		float[] fs = class249.aFloatArray2631;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method4914() {
		if (aBoolean8612)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public void method4891(Class249 class249, Class249 class249_39_, Class249 class249_40_) {
		OpenGL.glMatrixMode(5888);
		aClass249_8576.method2484(class249, class249_39_);
		OpenGL.glLoadMatrixf(aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class249_40_.aFloatArray2631, 0);
	}

	public Interface8_Impl1_Impl1 kp(int i, int i_41_) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, i, i_41_);
	}

	void method4932() {
		if (aBoolean8526)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method4933() {
		OpenGL.glDepthMask(aBoolean8519 && aBoolean8454);
	}

	void method4936() {
		if (aBoolean8522 && !aBoolean8575)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method4937() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8533 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8533 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8533 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	void method4938() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8489 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8489 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8489 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = -aFloat8535 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = -aFloat8535 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = -aFloat8535 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	Interface11_Impl3_Impl1 method4953(Class72 class72, Class86 class86, int i, int i_42_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1770953543) && Class380.method4393(i_42_, -804954767)))
			return new Class287_Sub1(this, class72, class86, i, i_42_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, class86, i, i_42_);
		return new Class287_Sub1(this, class72, class86, Class136.method1594(i, 1978039454), Class136.method1594(i_42_, 1916518060));
	}

	void method4940() {
		if (aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method4939() {
		/* empty */
	}

	void method4981() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass249_8472.aFloatArray2631, 0);
		int i;
		for (i = 0; i < anInt8538; i++) {
			Class330_Sub14 class330_sub14 = aClass330_Sub14Array8607[i];
			int i_43_ = class330_sub14.method3313(-1620080167);
			int i_44_ = 16386 + i;
			float f = class330_sub14.method3317(-1896832950) / 255.0F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) class330_sub14.method3318(1689977080);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) class330_sub14.method3311((byte) 87);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) class330_sub14.method3312((short) 23812);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(i_44_, 4611, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (i_43_ >> 16 & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (i_43_ >> 8 & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (i_43_ & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(i_44_, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
			OpenGL.glLightf(i_44_, 4617, (1.0F / (float) (class330_sub14.method3316((byte) -26) * class330_sub14.method3316((byte) 27))));
			OpenGL.glEnable(i_44_);
		}
		for (/**/; i < anInt8537; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method5006(Class72 class72, Class86 class86) {
		return true;
	}

	boolean method4996(Class72 class72, Class86 class86) {
		return aBoolean8598;
	}

	void method4959() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8451, 0);
	}

	Interface11_Impl3 method4950(int i, int i_45_, boolean bool, int[] is, int i_46_, int i_47_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1023175086) && Class380.method4393(i_45_, -62169526)))
			return new Class287_Sub1(this, i, i_45_, bool, is, i_46_, i_47_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, i, i_45_, is, i_46_, i_47_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(i, 2075018079), Class136.method1594(i_45_, 1521900395));
		class287_sub1.method118(0, 0, i, i_45_, is, i_46_, i_47_);
		return class287_sub1;
	}

	Interface11_Impl3 method4948(Class72 class72, int i, int i_48_, boolean bool, byte[] is, int i_49_, int i_50_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -45630524) && Class380.method4393(i_48_, -1978414178)))
			return new Class287_Sub1(this, class72, i, i_48_, bool, is, i_49_, i_50_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_48_, is, i_49_, i_50_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_714, Class136.method1594(i, 1621893774), Class136.method1594(i_48_, 1806360288));
		class287_sub1.method117(0, 0, i, i_48_, is, class72, i_49_, i_50_);
		return class287_sub1;
	}

	Interface11_Impl3 method4949(Class72 class72, int i, int i_51_, boolean bool, float[] fs, int i_52_, int i_53_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -314339209) && Class380.method4393(i_51_, -1538044097)))
			return new Class287_Sub1(this, class72, i, i_51_, bool, fs, i_52_, i_53_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_51_, fs, i_52_, i_53_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_717, Class136.method1594(i, 1570863363), Class136.method1594(i_51_, 1521347640));
		class287_sub1.method2883(0, 0, i, i_51_, fs, class72, i_52_, i_53_);
		return class287_sub1;
	}

	void method5102(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	Class184 method5003(Class193[] class193s) {
		return new Class184_Sub2(class193s);
	}

	Interface11_Impl2 method4952(Class72 class72, int i, int i_54_, int i_55_, boolean bool, byte[] is) {
		return new Class287_Sub2(this, class72, i, i_54_, i_55_, bool, is);
	}

	public void method5059() {
		int i = ((Class_ra_Sub2_Sub1) this).anIntArray9874[anInt8543];
		if (i != 0) {
			((Class_ra_Sub2_Sub1) this).anIntArray9874[anInt8543] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method5076() {
		OpenGL.glMatrixMode(5890);
		if (aClass181Array8509[anInt8543] != Class181.aClass181_1784)
			OpenGL.glLoadMatrixf(aClass249Array8545[anInt8543].method2514(((Class_ra_Sub2_Sub1) this).aFloatArray9887), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public void eu(boolean bool) {
		/* empty */
	}

	void method5053() {
		OpenGL.glTexEnvi(8960, 34161, method5142(aClass179Array8547[anInt8543]));
	}

	static int method5141(Class72 class72, Class86 class86) {
		if (class86 == Class86.aClass86_714) {
			switch (class72.anInt619 * 1333099709) {
			case 1:
				return 33779;
			case 6:
				return 6410;
			case 2:
				return 6406;
			default:
				throw new IllegalArgumentException();
			case 8:
				return 33777;
			case 4:
				return 6409;
			case 3:
				return 6408;
			case 9:
				return 6407;
			}
		}
		if (class86 == Class86.aClass86_718) {
			switch (class72.anInt619 * 1333099709) {
			case 7:
				return 33189;
			case 6:
				return 36219;
			case 2:
				return 32830;
			case 9:
				return 32852;
			case 3:
				return 32859;
			case 4:
				return 32834;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class86 == Class86.aClass86_719) {
			switch (class72.anInt619 * 1333099709) {
			default:
				throw new IllegalArgumentException();
			case 7:
				return 33190;
			}
		}
		if (class86 == Class86.aClass86_716) {
			switch (class72.anInt619 * 1333099709) {
			case 4:
				return 34846;
			case 6:
				return 34847;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 34842;
			case 2:
				return 34844;
			case 9:
				return 34843;
			}
		}
		if (class86 == Class86.aClass86_717) {
			switch (class72.anInt619 * 1333099709) {
			case 6:
				return 34841;
			case 3:
				return 34836;
			case 4:
				return 34840;
			default:
				throw new IllegalArgumentException();
			case 9:
				return 34837;
			case 2:
				return 34838;
			}
		}
		throw new IllegalArgumentException();
	}

	void method5135(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	Interface11_Impl3 method4899(int i, int i_56_, boolean bool, int[] is, int i_57_, int i_58_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, 789365925) && Class380.method4393(i_56_, -183526405)))
			return new Class287_Sub1(this, i, i_56_, bool, is, i_57_, i_58_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, i, i_56_, is, i_57_, i_58_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(i, 1641977151), Class136.method1594(i_56_, 1516385880));
		class287_sub1.method118(0, 0, i, i_56_, is, i_57_, i_58_);
		return class287_sub1;
	}

	final void method4967() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (anInt8445 & 0xff0000) / 1.671168E7F;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (anInt8445 & 0xff00) / 65280.0F;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (anInt8445 & 0xff) / 255.0F;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = (float) (anInt8445 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	static final int method5142(Class179 class179) {
		if (class179 == Class179.aClass179_1759)
			return 7681;
		if (class179 == Class179.aClass179_1757)
			return 8448;
		if (class179 == Class179.aClass179_1760)
			return 34165;
		if (class179 == Class179.aClass179_1758)
			return 260;
		if (class179 == Class179.aClass179_1761)
			return 34023;
		throw new IllegalArgumentException();
	}

	static final int method5143(Class175 class175) {
		if (class175 == Class175.aClass175_1739)
			return 5890;
		if (class175 == Class175.aClass175_1740)
			return 34167;
		if (class175 == Class175.aClass175_1738)
			return 34168;
		if (class175 == Class175.aClass175_1741)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method4973() {
		if (aBoolean8585)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	public Class92 iu(Class92 class92, Class92 class92_59_, float f, Class92 class92_60_) {
		return f < 0.5F ? class92 : class92_59_;
	}

	void method5112() {
		if (aBoolean8546)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method4974() {
		if (aBoolean8514 && aBoolean8502 && anInt8578 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	final void method5079(int i, Class175 class175, boolean bool, boolean bool_61_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method5143(class175));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_61_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_61_ ? 769 : 768);
	}

	final Interface9_Impl2 method4975(boolean bool) {
		return new Class266_Sub2(this, Class86.aClass86_718, bool);
	}

	Class184 method4977(Class193[] class193s) {
		return new Class184_Sub2(class193s);
	}

	void method5040(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method4979(Interface9_Impl2 interface9_impl2) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886 = (Class266_Sub2) interface9_impl2;
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2647();
	}

	public void method4978(Class184 class184) {
		Class193[] class193s = class184.aClass193Array6483;
		int i = 0;
		boolean bool = false;
		boolean bool_62_ = false;
		boolean bool_63_ = false;
		for (int i_64_ = 0; i_64_ < class193s.length; i_64_++) {
			Class193 class193 = class193s[i_64_];
			Class266_Sub1 class266_sub1 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i_64_];
			int i_65_ = 0;
			int i_66_ = class266_sub1.method2648();
			long l = class266_sub1.method2646();
			class266_sub1.method2647();
			for (int i_67_ = 0; i_67_ < class193.method2136(); i_67_++) {
				Class191 class191 = class193.method2134(i_67_);
				switch (class191.anInt1860) {
				case 6:
					OpenGL.glVertexPointer(3, 5126, i_66_, l + (long) i_65_);
					bool_63_ = true;
					break;
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_66_, l + (long) i_65_);
					break;
				case 1:
					OpenGL.glColorPointer(4, 5121, i_66_, l + (long) i_65_);
					bool = true;
					break;
				case 7:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_66_, l + (long) i_65_);
					break;
				case 8:
					OpenGL.glNormalPointer(5126, i_66_, l + (long) i_65_);
					bool_62_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_66_, l + (long) i_65_);
					break;
				case 0:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_66_, l + (long) i_65_);
					break;
				}
				i_65_ += class191.anInt1876;
			}
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9868 != bool_63_) {
			if (bool_63_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class_ra_Sub2_Sub1) this).aBoolean9868 = bool_63_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9878 != bool_62_) {
			if (bool_62_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class_ra_Sub2_Sub1) this).aBoolean9878 = bool_62_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9869 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class_ra_Sub2_Sub1) this).aBoolean9869 = bool;
		}
		if (((Class_ra_Sub2_Sub1) this).anInt9871 < i) {
			for (int i_68_ = ((Class_ra_Sub2_Sub1) this).anInt9871; i_68_ < i; i_68_++) {
				OpenGL.glClientActiveTexture(33984 + i_68_);
				OpenGL.glEnableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		} else if (((Class_ra_Sub2_Sub1) this).anInt9871 > i) {
			for (int i_69_ = i; i_69_ < ((Class_ra_Sub2_Sub1) this).anInt9871; i_69_++) {
				OpenGL.glClientActiveTexture(33984 + i_69_);
				OpenGL.glDisableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		}
	}

	public final void method4898(Class199 class199, int i, int i_70_) {
		int i_71_;
		int i_72_;
		if (class199 == Class199.aClass199_1930) {
			i_71_ = 1;
			i_72_ = i_70_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_71_ = 3;
			i_72_ = i_70_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_71_ = 4;
			i_72_ = i_70_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_71_ = 6;
			i_72_ = i_70_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_71_ = 5;
			i_72_ = i_70_ + 2;
		} else {
			i_71_ = 0;
			i_72_ = i_70_;
		}
		OpenGL.glDrawArrays(i_71_, i, i_72_);
	}

	final void method4985(Interface9_Impl2 interface9_impl2, Class199 class199, int i, int i_73_, int i_74_, int i_75_) {
		int i_76_;
		int i_77_;
		if (class199 == Class199.aClass199_1930) {
			i_76_ = 1;
			i_77_ = i_75_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_76_ = 3;
			i_77_ = i_75_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_76_ = 4;
			i_77_ = i_75_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_76_ = 6;
			i_77_ = i_75_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_76_ = 5;
			i_77_ = i_75_ + 2;
		} else {
			i_76_ = 0;
			i_77_ = i_75_;
		}
		Class86 class86 = interface9_impl2.method157();
		Class266_Sub2 class266_sub2 = (Class266_Sub2) interface9_impl2;
		class266_sub2.method2647();
		OpenGL.glDrawElements(i_76_, i_77_, method5147(class86), (class266_sub2.method2646() + (long) (i_74_ * (class86.anInt724 * -1615628035))));
	}

	public void method4926(Class184 class184) {
		Class193[] class193s = class184.aClass193Array6483;
		int i = 0;
		boolean bool = false;
		boolean bool_78_ = false;
		boolean bool_79_ = false;
		for (int i_80_ = 0; i_80_ < class193s.length; i_80_++) {
			Class193 class193 = class193s[i_80_];
			Class266_Sub1 class266_sub1 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i_80_];
			int i_81_ = 0;
			int i_82_ = class266_sub1.method2648();
			long l = class266_sub1.method2646();
			class266_sub1.method2647();
			for (int i_83_ = 0; i_83_ < class193.method2136(); i_83_++) {
				Class191 class191 = class193.method2134(i_83_);
				switch (class191.anInt1860) {
				case 6:
					OpenGL.glVertexPointer(3, 5126, i_82_, l + (long) i_81_);
					bool_79_ = true;
					break;
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_82_, l + (long) i_81_);
					break;
				case 1:
					OpenGL.glColorPointer(4, 5121, i_82_, l + (long) i_81_);
					bool = true;
					break;
				case 7:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_82_, l + (long) i_81_);
					break;
				case 8:
					OpenGL.glNormalPointer(5126, i_82_, l + (long) i_81_);
					bool_78_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_82_, l + (long) i_81_);
					break;
				case 0:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_82_, l + (long) i_81_);
					break;
				}
				i_81_ += class191.anInt1876;
			}
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9868 != bool_79_) {
			if (bool_79_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class_ra_Sub2_Sub1) this).aBoolean9868 = bool_79_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9878 != bool_78_) {
			if (bool_78_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class_ra_Sub2_Sub1) this).aBoolean9878 = bool_78_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9869 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class_ra_Sub2_Sub1) this).aBoolean9869 = bool;
		}
		if (((Class_ra_Sub2_Sub1) this).anInt9871 < i) {
			for (int i_84_ = ((Class_ra_Sub2_Sub1) this).anInt9871; i_84_ < i; i_84_++) {
				OpenGL.glClientActiveTexture(33984 + i_84_);
				OpenGL.glEnableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		} else if (((Class_ra_Sub2_Sub1) this).anInt9871 > i) {
			for (int i_85_ = i; i_85_ < ((Class_ra_Sub2_Sub1) this).anInt9871; i_85_++) {
				OpenGL.glClientActiveTexture(33984 + i_85_);
				OpenGL.glDisableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		}
	}

	public final synchronized void g(int i) {
		int i_86_ = 0;
		i &= 0x7fffffff;
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9860.method5876(37268610)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9860.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_86_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8466 -= class330_sub23.anInt7693 * 393599711;
			if (i_86_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_86_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_86_ = 0;
			}
		}
		if (i_86_ > 0) {
			OpenGL.glDeleteBuffersARB(i_86_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			i_86_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9861.method5876(1086542814)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9861.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_86_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8465 -= class330_sub23.anInt7693 * 393599711;
			if (i_86_ == 1000) {
				OpenGL.glDeleteTextures(i_86_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_86_ = 0;
			}
		}
		if (i_86_ > 0) {
			OpenGL.glDeleteTextures(i_86_, ((Class_ra_Sub2_Sub1) this).anIntArray9882, 0);
			i_86_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9862.method5876(-1892107307)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9862.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_86_++] = class330_sub23.anInt7693 * 393599711;
			if (i_86_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_86_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_86_ = 0;
			}
		}
		if (i_86_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_86_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			i_86_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9863.method5876(636937035)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9863.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_86_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8480 -= class330_sub23.anInt7693 * 393599711;
			if (i_86_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_86_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_86_ = 0;
			}
		}
		if (i_86_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_86_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			boolean bool = false;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9870.method5876(-1132499480)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (class330_sub23.aLong3341 * -6154793640677333111L), class330_sub23.anInt7693 * 393599711);
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9864.method5876(29904755)) {
			Class330 class330 = ((Class_ra_Sub2_Sub1) this).aClass471_9864.method5867((short) 8960);
			OpenGL.glDeleteProgram((int) (class330.aLong3341 * -6154793640677333111L));
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9865.method5876(-1729174058)) {
			Class330 class330 = ((Class_ra_Sub2_Sub1) this).aClass471_9865.method5867((short) 8960);
			OpenGL.glDeleteShader((int) (class330.aLong3341 * -6154793640677333111L));
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9870.method5876(-223661267)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (class330_sub23.aLong3341 * -6154793640677333111L), class330_sub23.anInt7693 * 393599711);
		}
		if (za() > 100663296 && (Class312.method3111((byte) 107) > ((Class_ra_Sub2_Sub1) this).aLong9866 + 60000L)) {
			System.gc();
			((Class_ra_Sub2_Sub1) this).aLong9866 = Class312.method3111((byte) 91);
		}
		super.g(i);
	}

	public void method4941(Class249 class249, Class249 class249_87_, Class249 class249_88_) {
		OpenGL.glMatrixMode(5888);
		aClass249_8576.method2484(class249, class249_87_);
		OpenGL.glLoadMatrixf(aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class249_88_.aFloatArray2631, 0);
	}

	final Interface9_Impl2 method5130(boolean bool) {
		return new Class266_Sub2(this, Class86.aClass86_718, bool);
	}

	final synchronized void method5144(int i) {
		Class330_Sub23 class330_sub23 = new Class330_Sub23(i);
		((Class_ra_Sub2_Sub1) this).aClass471_9862.method5878(class330_sub23, (short) 8192);
	}

	public void dx() {
		OpenGL.glFinish();
	}

	final synchronized void method5145(long l) {
		Class330 class330 = new Class330();
		class330.aLong3341 = l * -1420004262915178823L;
		((Class_ra_Sub2_Sub1) this).aClass471_9865.method5878(class330, (short) 8192);
	}

	final synchronized void method5146(int i) {
		Class330 class330 = new Class330();
		class330.aLong3341 = (long) i * -1420004262915178823L;
		((Class_ra_Sub2_Sub1) this).aClass471_9864.method5878(class330, (short) 8192);
	}

	static final int method5147(Class86 class86) {
		switch (class86.anInt722 * 618977773) {
		case 3:
			return 5125;
		case 6:
			return 5123;
		case 4:
			return 5124;
		case 0:
			return 5122;
		default:
			return 5121;
		case 8:
			return 5131;
		case 1:
			return 5121;
		case 7:
			return 5120;
		case 5:
			return 5126;
		}
	}

	void method5035() {
		if (aBoolean8585)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	void method4947(int i) {
		if (!((Class_ra_Sub2_Sub1) this).aBoolean9885)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public void dh(boolean bool) {
		/* empty */
	}

	void method5110(Interface9_Impl2 interface9_impl2) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886 = (Class266_Sub2) interface9_impl2;
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2647();
	}

	boolean method5057(Class72 class72, Class86 class86) {
		return true;
	}

	public Class51 dq() {
		int i = -1;
		if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("intel") != -1)
			i = 32902;
		else if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("ati") != -1)
			i = 4098;
		return new Class51(i, "OpenGL", ((Class_ra_Sub2_Sub1) this).anInt9859, ((Class_ra_Sub2_Sub1) this).aString9877, 0L);
	}

	void dv(int i, int i_89_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method874();
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -66);
	}

	void dc(int i, int i_90_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method874();
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 29545);
	}

	void method5046() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8533 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8533 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8533 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	Interface11_Impl2 method5070(Class72 class72, int i, int i_91_, int i_92_, boolean bool, byte[] is) {
		return new Class287_Sub2(this, class72, i, i_91_, i_92_, bool, is);
	}

	void dm(int i, int i_93_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method874();
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) 4341);
	}

	public void du() {
		OpenGL.glFinish();
	}

	public void df() {
		OpenGL.glFinish();
	}

	public void dy() {
		OpenGL.glFinish();
	}

	Class184 method4931(Class193[] class193s) {
		return new Class184_Sub2(class193s);
	}

	public Class105 method4888(String string) {
		byte[] is = method5148(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub2(this, class113);
	}

	Interface11_Impl3 method4904(Class72 class72, Class86 class86, int i, int i_94_) {
		return method4953(class72, class86, i, i_94_);
	}

	void dn() {
		super.u();
		if (((Class_ra_Sub2_Sub1) this).anOpenGL9881 != null) {
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.i();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.release();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881 = null;
		}
	}

	void di() {
		super.u();
		if (((Class_ra_Sub2_Sub1) this).anOpenGL9881 != null) {
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.i();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.release();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881 = null;
		}
	}

	public final synchronized void dk(int i) {
		int i_95_ = 0;
		i &= 0x7fffffff;
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9860.method5876(1111976838)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9860.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_95_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8466 -= class330_sub23.anInt7693 * 393599711;
			if (i_95_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_95_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteBuffersARB(i_95_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			i_95_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9861.method5876(-1046701393)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9861.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_95_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8465 -= class330_sub23.anInt7693 * 393599711;
			if (i_95_ == 1000) {
				OpenGL.glDeleteTextures(i_95_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteTextures(i_95_, ((Class_ra_Sub2_Sub1) this).anIntArray9882, 0);
			i_95_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9862.method5876(-219964446)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9862.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_95_++] = class330_sub23.anInt7693 * 393599711;
			if (i_95_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_95_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_95_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			i_95_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9863.method5876(841540192)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9863.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_95_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8480 -= class330_sub23.anInt7693 * 393599711;
			if (i_95_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_95_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_95_ = 0;
			}
		}
		if (i_95_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_95_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			boolean bool = false;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9870.method5876(-1631488153)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (class330_sub23.aLong3341 * -6154793640677333111L), class330_sub23.anInt7693 * 393599711);
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9864.method5876(-875624737)) {
			Class330 class330 = ((Class_ra_Sub2_Sub1) this).aClass471_9864.method5867((short) 8960);
			OpenGL.glDeleteProgram((int) (class330.aLong3341 * -6154793640677333111L));
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9865.method5876(1265620823)) {
			Class330 class330 = ((Class_ra_Sub2_Sub1) this).aClass471_9865.method5867((short) 8960);
			OpenGL.glDeleteShader((int) (class330.aLong3341 * -6154793640677333111L));
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9870.method5876(-1669605966)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (class330_sub23.aLong3341 * -6154793640677333111L), class330_sub23.anInt7693 * 393599711);
		}
		if (za() > 100663296 && (Class312.method3111((byte) 69) > ((Class_ra_Sub2_Sub1) this).aLong9866 + 60000L)) {
			System.gc();
			((Class_ra_Sub2_Sub1) this).aLong9866 = Class312.method3111((byte) 22);
		}
		super.g(i);
	}

	void method5090() {
		OpenGL.glActiveTexture(33984 + anInt8543);
	}

	void method4988() {
		OpenGL.glActiveTexture(33984 + anInt8543);
	}

	public void ef(boolean bool) {
		/* empty */
	}

	public final void method5104(Class199 class199, int i, int i_96_) {
		int i_97_;
		int i_98_;
		if (class199 == Class199.aClass199_1930) {
			i_97_ = 1;
			i_98_ = i_96_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_97_ = 3;
			i_98_ = i_96_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_97_ = 4;
			i_98_ = i_96_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_97_ = 6;
			i_98_ = i_96_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_97_ = 5;
			i_98_ = i_96_ + 2;
		} else {
			i_97_ = 0;
			i_98_ = i_96_;
		}
		OpenGL.glDrawArrays(i_97_, i, i_98_);
	}

	Class76_Sub1 es(Canvas canvas, int i, int i_99_) {
		return new Class76_Sub1_Sub2_Sub2(this, canvas);
	}

	Class76_Sub1 fu(Canvas canvas, int i, int i_100_) {
		return new Class76_Sub1_Sub2_Sub2(this, canvas);
	}

	Class76_Sub1 ft(Canvas canvas, int i, int i_101_) {
		return new Class76_Sub1_Sub2_Sub2(this, canvas);
	}

	public int[] fm(int i, int i_102_, int i_103_, int i_104_) {
		int[] is = new int[i_103_ * i_104_];
		int i_105_ = aClass76_4228.method857();
		for (int i_106_ = 0; i_106_ < i_104_; i_106_++)
			OpenGL.glReadPixelsi(i, i_105_ - i_102_ - i_106_ - 1, i_103_, 1, 32993, ((Class_ra_Sub2_Sub1) this).anInt9884, is, i_106_ * i_103_);
		return is;
	}

	public void fr() {
		if (aClass76_4228 != null) {
			int i = aClass76_4228.method856();
			int i_107_ = aClass76_4228.method857();
			if (i > 0 || i_107_ > 0) {
				int i_108_ = anInt8531;
				int i_109_ = anInt8567;
				int i_110_ = anInt8515;
				int i_111_ = anInt8516;
				au();
				int i_112_ = anInt8610;
				int i_113_ = anInt8447;
				int i_114_ = anInt8521;
				int i_115_ = anInt8506;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method4924();
				method4882(false);
				method4995(false);
				method5005(false);
				method4962(false);
				method4956(null);
				method4889(1);
				method4970(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_107_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_112_, i_114_, i_113_, i_115_);
				ae(i_108_, i_109_, i_110_, i_111_);
			}
		}
	}

	final void method4927(int i, Class175 class175, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method5143(class175));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	public void fn(int i, int i_116_) {
		int i_117_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_116_ & 0xff0000) / 1.671168E7F, (float) (i_116_ & 0xff00) / 65280.0F, (float) (i_116_ & 0xff) / 255.0F, (float) (i_116_ >>> 24) / 255.0F);
			i_117_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method4962(true);
			i_117_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_117_ |= 0x400;
		OpenGL.glClear(i_117_);
	}

	byte[] method5148(String string) {
		return method4942("gl", string);
	}

	public Class92 in(Class92 class92, Class92 class92_118_, float f, Class92 class92_119_) {
		return f < 0.5F ? class92 : class92_118_;
	}

	public Class76_Sub2 jw() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	public Class76_Sub2 jy() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	public Class76_Sub2 jp() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	public Class76_Sub2 jk() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	Class76_Sub1 ak(Canvas canvas, int i, int i_120_) {
		return new Class76_Sub1_Sub2_Sub2(this, canvas);
	}

	public Interface8_Impl1_Impl2 jx(int i, int i_121_, Class72 class72, Class86 class86, int i_122_) {
		return new Class264(this, class72, class86, i, i_121_, i_122_);
	}

	void method4900() {
		aFloat8581 = aFloat8504 - (float) anInt8560;
		aFloat8580 = aFloat8581 - (float) anInt8578;
		if (aFloat8580 < aFloat8471)
			aFloat8580 = aFloat8471;
		if (aBoolean8601) {
			OpenGL.glFogf(2915, aFloat8580);
			OpenGL.glFogf(2916, aFloat8581);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (anInt8476 & 0xff0000) / 1.671168E7F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (anInt8476 & 0xff00) / 65280.0F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (anInt8476 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		}
	}

	public Interface8_Impl1_Impl1 kh(int i, int i_123_, int i_124_) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, i, i_123_, i_124_);
	}

	Interface11_Impl1 method4951(int i, boolean bool, int[][] is) {
		return new Class287_Sub4(this, i, bool, is);
	}

	public Interface8_Impl1_Impl1 kv(int i, int i_125_, int i_126_) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, i, i_125_, i_126_);
	}

	public boolean method5021() {
		return ((Class_ra_Sub2_Sub1) this).aBoolean9873;
	}

	void method5092() {
		OpenGL.glTexEnvi(8960, 34161, method5142(aClass179Array8547[anInt8543]));
	}

	public boolean method5023() {
		return ((Class_ra_Sub2_Sub1) this).aBoolean9883;
	}

	public Class105 method5024(String string) {
		byte[] is = method5148(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub2(this, class113);
	}

	public Class105 method4928(String string) {
		byte[] is = method5148(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub2(this, class113);
	}

	public Class105 method5037(String string) {
		byte[] is = method5148(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub2(this, class113);
	}

	public Class105 method4923(String string) {
		byte[] is = method5148(string);
		if (is == null)
			return null;
		Class113 class113 = method4890(is);
		return new Class105_Sub2(this, class113);
	}

	void method5149() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8592 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_127_ = 16384 + i;
			OpenGL.glLightfv(i_127_, 4608, fs, 0);
			OpenGL.glLightf(i_127_, 4615, 0.0F);
			OpenGL.glLightf(i_127_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class_ra_Sub2_Sub1) this).anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	void method5150() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8592 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_128_ = 16384 + i;
			OpenGL.glLightfv(i_128_, 4608, fs, 0);
			OpenGL.glLightf(i_128_, 4615, 0.0F);
			OpenGL.glLightf(i_128_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class_ra_Sub2_Sub1) this).anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	void method5151() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8592 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_129_ = 16384 + i;
			OpenGL.glLightfv(i_129_, 4608, fs, 0);
			OpenGL.glLightf(i_129_, 4615, 0.0F);
			OpenGL.glLightf(i_129_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class_ra_Sub2_Sub1) this).anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	public Class76_Sub2 jv() {
		return new Class76_Sub2_Sub3_Sub2(this);
	}

	public float method4887() {
		return 0.0F;
	}

	public float method5031() {
		return 0.0F;
	}

	void method5100() {
		if (aBoolean8514 && aBoolean8502 && anInt8578 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method4960() {
		if (aClass76_4228 != null) {
			int i = anInt8517 + anInt8610;
			int i_130_ = anInt8518 + aClass76_4228.method857() - anInt8506;
			int i_131_ = anInt8447 - anInt8610;
			int i_132_ = anInt8506 - anInt8521;
			if (i_131_ < 0)
				i_131_ = 0;
			if (i_132_ < 0)
				i_132_ = 0;
			OpenGL.glScissor(i, i_130_, i_131_, i_132_);
		}
	}

	void method5084() {
		if (aBoolean8612)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method5010() {
		if (aBoolean8612)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method5041() {
		if (aBoolean8526)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	public void method5106(int i, Interface9_Impl1 interface9_impl1) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i] = (Class266_Sub1) interface9_impl1;
	}

	void method5043() {
		OpenGL.glDepthMask(aBoolean8519 && aBoolean8454);
	}

	void method4934() {
		if (aBoolean8522 && !aBoolean8575)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method5129() {
		if (aBoolean8585)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	void method5044() {
		if (aBoolean8522 && !aBoolean8575)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method5045() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8533 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8533 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8533 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	static int method5152(Class72 class72) {
		switch (class72.anInt619 * 1333099709) {
		case 3:
			return 6408;
		default:
			throw new IllegalStateException();
		case 4:
			return 6409;
		case 7:
			return 6402;
		case 2:
			return 6406;
		case 6:
			return 6410;
		case 9:
			return 6407;
		}
	}

	void method5047() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8489 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8489 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8489 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = -aFloat8535 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = -aFloat8535 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = -aFloat8535 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	void method5028() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8489 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8489 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8489 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = -aFloat8535 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = -aFloat8535 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = -aFloat8535 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	void method5030() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8489 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8489 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8489 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = -aFloat8535 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = -aFloat8535 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = -aFloat8535 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	void method5094(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method5029() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8451, 0);
	}

	void method5120() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8451, 0);
	}

	void method5075() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8533 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8533 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8533 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	void method5050() {
		/* empty */
	}

	void method5000() {
		/* empty */
	}

	void method5052() {
		/* empty */
	}

	void method5054() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass249_8472.aFloatArray2631, 0);
		int i;
		for (i = 0; i < anInt8538; i++) {
			Class330_Sub14 class330_sub14 = aClass330_Sub14Array8607[i];
			int i_133_ = class330_sub14.method3313(-475485492);
			int i_134_ = 16386 + i;
			float f = class330_sub14.method3317(1919382823) / 255.0F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) class330_sub14.method3318(644464650);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) class330_sub14.method3311((byte) -68);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) class330_sub14.method3312((short) -21260);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(i_134_, 4611, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (i_133_ >> 16 & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (i_133_ >> 8 & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (i_133_ & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(i_134_, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
			OpenGL.glLightf(i_134_, 4617, 1.0F / (float) (class330_sub14.method3316((byte) 5) * class330_sub14.method3316((byte) 119)));
			OpenGL.glEnable(i_134_);
		}
		for (/**/; i < anInt8537; i++)
			OpenGL.glDisable(16386 + i);
	}

	void method5055() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass249_8472.aFloatArray2631, 0);
		int i;
		for (i = 0; i < anInt8538; i++) {
			Class330_Sub14 class330_sub14 = aClass330_Sub14Array8607[i];
			int i_135_ = class330_sub14.method3313(-1778455672);
			int i_136_ = 16386 + i;
			float f = class330_sub14.method3317(953191646) / 255.0F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) class330_sub14.method3318(-1158904577);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) class330_sub14.method3311((byte) 50);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) class330_sub14.method3312((short) 15252);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(i_136_, 4611, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (i_135_ >> 16 & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (i_135_ >> 8 & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (i_135_ & 0xff) * f;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
			OpenGL.glLightfv(i_136_, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
			OpenGL.glLightf(i_136_, 4617, (1.0F / (float) (class330_sub14.method3316((byte) 79) * class330_sub14.method3316((byte) -63))));
			OpenGL.glEnable(i_136_);
		}
		for (/**/; i < anInt8537; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method5056(Class72 class72, Class86 class86) {
		return true;
	}

	public final synchronized void dw(int i) {
		int i_137_ = 0;
		i &= 0x7fffffff;
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9860.method5876(-102906035)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9860.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_137_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8466 -= class330_sub23.anInt7693 * 393599711;
			if (i_137_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_137_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_137_ = 0;
			}
		}
		if (i_137_ > 0) {
			OpenGL.glDeleteBuffersARB(i_137_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			i_137_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9861.method5876(-406315395)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9861.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_137_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8465 -= class330_sub23.anInt7693 * 393599711;
			if (i_137_ == 1000) {
				OpenGL.glDeleteTextures(i_137_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_137_ = 0;
			}
		}
		if (i_137_ > 0) {
			OpenGL.glDeleteTextures(i_137_, ((Class_ra_Sub2_Sub1) this).anIntArray9882, 0);
			i_137_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9862.method5876(518166947)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9862.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_137_++] = class330_sub23.anInt7693 * 393599711;
			if (i_137_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_137_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_137_ = 0;
			}
		}
		if (i_137_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_137_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			i_137_ = 0;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9863.method5876(-1725147006)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9863.method5867((short) 8960);
			((Class_ra_Sub2_Sub1) this).anIntArray9882[i_137_++] = (int) (class330_sub23.aLong3341 * -6154793640677333111L);
			anInt8480 -= class330_sub23.anInt7693 * 393599711;
			if (i_137_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_137_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
				i_137_ = 0;
			}
		}
		if (i_137_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_137_, (((Class_ra_Sub2_Sub1) this).anIntArray9882), 0);
			boolean bool = false;
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9870.method5876(-475333014)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (class330_sub23.aLong3341 * -6154793640677333111L), class330_sub23.anInt7693 * 393599711);
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9864.method5876(-990317992)) {
			Class330 class330 = ((Class_ra_Sub2_Sub1) this).aClass471_9864.method5867((short) 8960);
			OpenGL.glDeleteProgram((int) (class330.aLong3341 * -6154793640677333111L));
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9865.method5876(-1454184216)) {
			Class330 class330 = ((Class_ra_Sub2_Sub1) this).aClass471_9865.method5867((short) 8960);
			OpenGL.glDeleteShader((int) (class330.aLong3341 * -6154793640677333111L));
		}
		while (!((Class_ra_Sub2_Sub1) this).aClass471_9870.method5876(549894719)) {
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class_ra_Sub2_Sub1) this).aClass471_9870.method5867((short) 8960);
			OpenGL.glDeleteLists((int) (class330_sub23.aLong3341 * -6154793640677333111L), class330_sub23.anInt7693 * 393599711);
		}
		if (za() > 100663296 && (Class312.method3111((byte) 40) > ((Class_ra_Sub2_Sub1) this).aLong9866 + 60000L)) {
			System.gc();
			((Class_ra_Sub2_Sub1) this).aLong9866 = Class312.method3111((byte) 29);
		}
		super.g(i);
	}

	boolean method5002(Class72 class72, Class86 class86) {
		return true;
	}

	Interface11_Impl3 method5060(Class72 class72, int i, int i_138_, boolean bool, byte[] is, int i_139_, int i_140_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -2054600731) && Class380.method4393(i_138_, 960925079)))
			return new Class287_Sub1(this, class72, i, i_138_, bool, is, i_139_, i_140_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_138_, is, i_139_, i_140_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_714, Class136.method1594(i, 1976613001), Class136.method1594(i_138_, 1608068725));
		class287_sub1.method117(0, 0, i, i_138_, is, class72, i_139_, i_140_);
		return class287_sub1;
	}

	Interface11_Impl3 method5061(Class72 class72, int i, int i_141_, boolean bool, float[] fs, int i_142_, int i_143_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1415751977) && Class380.method4393(i_141_, -761510533)))
			return new Class287_Sub1(this, class72, i, i_141_, bool, fs, i_142_, i_143_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_141_, fs, i_142_, i_143_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_717, Class136.method1594(i, 1917758967), Class136.method1594(i_141_, 1742723956));
		class287_sub1.method2883(0, 0, i, i_141_, fs, class72, i_142_, i_143_);
		return class287_sub1;
	}

	Interface11_Impl3 method5058(Class72 class72, int i, int i_144_, boolean bool, float[] fs, int i_145_, int i_146_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1933225047) && Class380.method4393(i_144_, 128762110)))
			return new Class287_Sub1(this, class72, i, i_144_, bool, fs, i_145_, i_146_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_144_, fs, i_145_, i_146_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_717, Class136.method1594(i, 1559860839), Class136.method1594(i_144_, 1813145913));
		class287_sub1.method2883(0, 0, i, i_144_, fs, class72, i_145_, i_146_);
		return class287_sub1;
	}

	Interface11_Impl3 method5062(Class72 class72, int i, int i_147_, boolean bool, float[] fs, int i_148_, int i_149_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, 836563610) && Class380.method4393(i_147_, -1258857758)))
			return new Class287_Sub1(this, class72, i, i_147_, bool, fs, i_148_, i_149_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_147_, fs, i_148_, i_149_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_717, Class136.method1594(i, 1674152218), Class136.method1594(i_147_, 2118488861));
		class287_sub1.method2883(0, 0, i, i_147_, fs, class72, i_148_, i_149_);
		return class287_sub1;
	}

	Interface11_Impl3 method5063(Class72 class72, int i, int i_150_, boolean bool, float[] fs, int i_151_, int i_152_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, 701767635) && Class380.method4393(i_150_, -2055905156)))
			return new Class287_Sub1(this, class72, i, i_150_, bool, fs, i_151_, i_152_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_150_, fs, i_151_, i_152_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_717, Class136.method1594(i, 1697457998), Class136.method1594(i_150_, 1849465390));
		class287_sub1.method2883(0, 0, i, i_150_, fs, class72, i_151_, i_152_);
		return class287_sub1;
	}

	void method5108(Interface9_Impl2 interface9_impl2) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886 = (Class266_Sub2) interface9_impl2;
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2647();
	}

	Interface11_Impl3 method5065(int i, int i_153_, boolean bool, int[] is, int i_154_, int i_155_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1411737207) && Class380.method4393(i_153_, 359445776)))
			return new Class287_Sub1(this, i, i_153_, bool, is, i_154_, i_155_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, i, i_153_, is, i_154_, i_155_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(i, 2096027057), Class136.method1594(i_153_, 2040319133));
		class287_sub1.method118(0, 0, i, i_153_, is, i_154_, i_155_);
		return class287_sub1;
	}

	Interface11_Impl3 method5066(int i, int i_156_, boolean bool, int[] is, int i_157_, int i_158_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1245209624) && Class380.method4393(i_156_, -727192166)))
			return new Class287_Sub1(this, i, i_156_, bool, is, i_157_, i_158_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, i, i_156_, is, i_157_, i_158_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, Class72.aClass72_620, Class86.aClass86_714, Class136.method1594(i, 1953789863), Class136.method1594(i_156_, 2094671142));
		class287_sub1.method118(0, 0, i, i_156_, is, i_157_, i_158_);
		return class287_sub1;
	}

	Interface11_Impl1 method5067(int i, boolean bool, int[][] is) {
		return new Class287_Sub4(this, i, bool, is);
	}

	boolean method5125(Class72 class72, Class86 class86) {
		return aBoolean8598;
	}

	Interface11_Impl1 method5068(int i, boolean bool, int[][] is) {
		return new Class287_Sub4(this, i, bool, is);
	}

	Interface11_Impl2 method5069(Class72 class72, int i, int i_159_, int i_160_, boolean bool, byte[] is) {
		return new Class287_Sub2(this, class72, i, i_159_, i_160_, bool, is);
	}

	public float method4893() {
		return 0.0F;
	}

	Interface11_Impl2 method5071(Class72 class72, int i, int i_161_, int i_162_, boolean bool, byte[] is) {
		return new Class287_Sub2(this, class72, i, i_161_, i_162_, bool, is);
	}

	Interface11_Impl3_Impl1 method5072(Class72 class72, Class86 class86, int i, int i_163_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1679453720) && Class380.method4393(i_163_, -1386949722)))
			return new Class287_Sub1(this, class72, class86, i, i_163_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, class86, i, i_163_);
		return new Class287_Sub1(this, class72, class86, Class136.method1594(i, 1537566577), Class136.method1594(i_163_, 1740006028));
	}

	Interface11_Impl3_Impl1 method5073(Class72 class72, Class86 class86, int i, int i_164_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, -1224212556) && Class380.method4393(i_164_, 471363156)))
			return new Class287_Sub1(this, class72, class86, i, i_164_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, class86, i, i_164_);
		return new Class287_Sub1(this, class72, class86, Class136.method1594(i, 1585641615), Class136.method1594(i_164_, 1580817859));
	}

	Interface11_Impl3_Impl1 method5074(Class72 class72, Class86 class86, int i, int i_165_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, 960965628) && Class380.method4393(i_165_, -604601719)))
			return new Class287_Sub1(this, class72, class86, i, i_165_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, class86, i, i_165_);
		return new Class287_Sub1(this, class72, class86, Class136.method1594(i, 1535806863), Class136.method1594(i_165_, 1919844722));
	}

	void dd() {
		super.u();
		if (((Class_ra_Sub2_Sub1) this).anOpenGL9881 != null) {
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.i();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.release();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881 = null;
		}
	}

	public void method5078() {
		int i = ((Class_ra_Sub2_Sub1) this).anIntArray9874[anInt8543];
		if (i != 0) {
			((Class_ra_Sub2_Sub1) this).anIntArray9874[anInt8543] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method4990(int i) {
		if (!((Class_ra_Sub2_Sub1) this).aBoolean9885)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	final void method5080(int i, Class175 class175, boolean bool, boolean bool_166_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method5143(class175));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_166_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_166_ ? 769 : 768);
	}

	void method5048() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = aFloat8489 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = aFloat8489 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = aFloat8489 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = -aFloat8535 * aFloat8530;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = -aFloat8535 * aFloat8500;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = -aFloat8535 * aFloat8532;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	void method5086() {
		OpenGL.glMatrixMode(5890);
		if (aClass181Array8509[anInt8543] != Class181.aClass181_1784)
			OpenGL.glLoadMatrixf(aClass249Array8545[anInt8543].method2514(((Class_ra_Sub2_Sub1) this).aFloatArray9887), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method5087() {
		OpenGL.glActiveTexture(33984 + anInt8543);
	}

	void method5011() {
		OpenGL.glActiveTexture(33984 + anInt8543);
	}

	public final void method4987(Class199 class199, int i, int i_167_, int i_168_, int i_169_) {
		int i_170_;
		int i_171_;
		if (class199 == Class199.aClass199_1930) {
			i_170_ = 1;
			i_171_ = i_169_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_170_ = 3;
			i_171_ = i_169_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_170_ = 4;
			i_171_ = i_169_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_170_ = 6;
			i_171_ = i_169_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_170_ = 5;
			i_171_ = i_169_ + 2;
		} else {
			i_170_ = 0;
			i_171_ = i_169_;
		}
		Class86 class86 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method157();
		OpenGL.glDrawElements(i_170_, i_171_, method5147(class86), (((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2646() + (long) (i_168_ * (class86.anInt724 * -1615628035))));
	}

	void method5089() {
		OpenGL.glActiveTexture(33984 + anInt8543);
	}

	public void method5081(int i, Interface9_Impl1 interface9_impl1) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i] = (Class266_Sub1) interface9_impl1;
	}

	void method5091() {
		OpenGL.glTexEnvi(8960, 34161, method5142(aClass179Array8547[anInt8543]));
	}

	public Class51 f() {
		int i = -1;
		if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("intel") != -1)
			i = 32902;
		else if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("ati") != -1)
			i = 4098;
		return new Class51(i, "OpenGL", ((Class_ra_Sub2_Sub1) this).anInt9859, ((Class_ra_Sub2_Sub1) this).aString9877, 0L);
	}

	void method5093(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public void eo(boolean bool) {
		/* empty */
	}

	void method5095() {
		int i = 0;
		int i_172_ = 0;
		if (anInt8613 == 0) {
			i = 0;
			i_172_ = 0;
		} else if (anInt8613 == 1) {
			i = 1;
			i_172_ = 0;
		} else if (anInt8613 == 2) {
			i = 1;
			i_172_ = 1;
		}
		if (aClass176_8583 == Class176.aClass176_1745)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_172_);
		else if (aClass176_8583 == Class176.aClass176_1744)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_172_);
		else if (aClass176_8583 == Class176.aClass176_1743)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_172_);
	}

	void method5096() {
		int i = 0;
		int i_173_ = 0;
		if (anInt8613 == 0) {
			i = 0;
			i_173_ = 0;
		} else if (anInt8613 == 1) {
			i = 1;
			i_173_ = 0;
		} else if (anInt8613 == 2) {
			i = 1;
			i_173_ = 1;
		}
		if (aClass176_8583 == Class176.aClass176_1745)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_173_);
		else if (aClass176_8583 == Class176.aClass176_1744)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_173_);
		else if (aClass176_8583 == Class176.aClass176_1743)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_173_);
	}

	void method5097() {
		if (aBoolean8546)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method4907() {
		if (aBoolean8546)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method5025() {
		aFloat8581 = aFloat8504 - (float) anInt8560;
		aFloat8580 = aFloat8581 - (float) anInt8578;
		if (aFloat8580 < aFloat8471)
			aFloat8580 = aFloat8471;
		if (aBoolean8601) {
			OpenGL.glFogf(2915, aFloat8580);
			OpenGL.glFogf(2916, aFloat8581);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (anInt8476 & 0xff0000) / 1.671168E7F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (anInt8476 & 0xff00) / 65280.0F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (anInt8476 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		}
	}

	void method5121() {
		aFloat8581 = aFloat8504 - (float) anInt8560;
		aFloat8580 = aFloat8581 - (float) anInt8578;
		if (aFloat8580 < aFloat8471)
			aFloat8580 = aFloat8471;
		if (aBoolean8601) {
			OpenGL.glFogf(2915, aFloat8580);
			OpenGL.glFogf(2916, aFloat8581);
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (anInt8476 & 0xff0000) / 1.671168E7F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (anInt8476 & 0xff00) / 65280.0F;
			((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (anInt8476 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
		}
	}

	void method4991() {
		if (aBoolean8514 && aBoolean8502 && anInt8578 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method5014() {
		int i = 0;
		int i_174_ = 0;
		if (anInt8613 == 0) {
			i = 0;
			i_174_ = 0;
		} else if (anInt8613 == 1) {
			i = 1;
			i_174_ = 0;
		} else if (anInt8613 == 2) {
			i = 1;
			i_174_ = 1;
		}
		if (aClass176_8583 == Class176.aClass176_1745)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_174_);
		else if (aClass176_8583 == Class176.aClass176_1744)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_174_);
		else if (aClass176_8583 == Class176.aClass176_1743)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_174_);
	}

	void method5101() {
		if (aBoolean8514 && aBoolean8502 && anInt8578 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public boolean method5022() {
		return ((Class_ra_Sub2_Sub1) this).aBoolean9883;
	}

	void method5122() {
		if (aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public Class51 dt() {
		int i = -1;
		if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("intel") != -1)
			i = 32902;
		else if (((Class_ra_Sub2_Sub1) this).aString9876.indexOf("ati") != -1)
			i = 4098;
		return new Class51(i, "OpenGL", ((Class_ra_Sub2_Sub1) this).anInt9859, ((Class_ra_Sub2_Sub1) this).aString9877, 0L);
	}

	void dl(int i, int i_175_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method874();
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -17745);
	}

	void method5126() {
		OpenGL.glTexEnvi(8960, 34162, method5142(aClass179Array8548[anInt8543]));
	}

	public void method5105(Class184 class184) {
		Class193[] class193s = class184.aClass193Array6483;
		int i = 0;
		boolean bool = false;
		boolean bool_176_ = false;
		boolean bool_177_ = false;
		for (int i_178_ = 0; i_178_ < class193s.length; i_178_++) {
			Class193 class193 = class193s[i_178_];
			Class266_Sub1 class266_sub1 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i_178_];
			int i_179_ = 0;
			int i_180_ = class266_sub1.method2648();
			long l = class266_sub1.method2646();
			class266_sub1.method2647();
			for (int i_181_ = 0; i_181_ < class193.method2136(); i_181_++) {
				Class191 class191 = class193.method2134(i_181_);
				switch (class191.anInt1860) {
				case 6:
					OpenGL.glVertexPointer(3, 5126, i_180_, l + (long) i_179_);
					bool_177_ = true;
					break;
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_180_, l + (long) i_179_);
					break;
				case 1:
					OpenGL.glColorPointer(4, 5121, i_180_, l + (long) i_179_);
					bool = true;
					break;
				case 7:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_180_, l + (long) i_179_);
					break;
				case 8:
					OpenGL.glNormalPointer(5126, i_180_, l + (long) i_179_);
					bool_176_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_180_, l + (long) i_179_);
					break;
				case 0:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_180_, l + (long) i_179_);
					break;
				}
				i_179_ += class191.anInt1876;
			}
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9868 != bool_177_) {
			if (bool_177_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class_ra_Sub2_Sub1) this).aBoolean9868 = bool_177_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9878 != bool_176_) {
			if (bool_176_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class_ra_Sub2_Sub1) this).aBoolean9878 = bool_176_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9869 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class_ra_Sub2_Sub1) this).aBoolean9869 = bool;
		}
		if (((Class_ra_Sub2_Sub1) this).anInt9871 < i) {
			for (int i_182_ = ((Class_ra_Sub2_Sub1) this).anInt9871; i_182_ < i; i_182_++) {
				OpenGL.glClientActiveTexture(33984 + i_182_);
				OpenGL.glEnableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		} else if (((Class_ra_Sub2_Sub1) this).anInt9871 > i) {
			for (int i_183_ = i; i_183_ < ((Class_ra_Sub2_Sub1) this).anInt9871; i_183_++) {
				OpenGL.glClientActiveTexture(33984 + i_183_);
				OpenGL.glDisableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		}
	}

	public void method5077() {
		int i = ((Class_ra_Sub2_Sub1) this).anIntArray9874[anInt8543];
		if (i != 0) {
			((Class_ra_Sub2_Sub1) this).anIntArray9874[anInt8543] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	Interface11_Impl3 method5064(Class72 class72, int i, int i_184_, boolean bool, float[] fs, int i_185_, int i_186_) {
		if (((Class_ra_Sub2_Sub1) this).aBoolean9867 || (Class380.method4393(i, 95614722) && Class380.method4393(i_184_, 828697199)))
			return new Class287_Sub1(this, class72, i, i_184_, bool, fs, i_185_, i_186_);
		if (((Class_ra_Sub2_Sub1) this).aBoolean9880)
			return new Class287_Sub3(this, class72, i, i_184_, fs, i_185_, i_186_);
		Class287_Sub1 class287_sub1 = new Class287_Sub1(this, class72, Class86.aClass86_717, Class136.method1594(i, 2039110197), Class136.method1594(i_184_, 1925192184));
		class287_sub1.method2883(0, 0, i, i_184_, fs, class72, i_185_, i_186_);
		return class287_sub1;
	}

	public void method5107(int i, Interface9_Impl1 interface9_impl1) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i] = (Class266_Sub1) interface9_impl1;
	}

	final synchronized void method5153(int i, int i_187_) {
		Class330_Sub23 class330_sub23 = new Class330_Sub23(i_187_);
		class330_sub23.aLong3341 = (long) i * -1420004262915178823L;
		((Class_ra_Sub2_Sub1) this).aClass471_9861.method5878(class330_sub23, (short) 8192);
	}

	final Interface9_Impl1 method5132(boolean bool) {
		return new Class266_Sub1(this, bool);
	}

	void method5109(Interface9_Impl2 interface9_impl2) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886 = (Class266_Sub2) interface9_impl2;
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2647();
	}

	void method5049() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass249_8472.aFloatArray2631, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8525, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8451, 0);
	}

	public final void method5113(Class199 class199, int i, int i_188_) {
		int i_189_;
		int i_190_;
		if (class199 == Class199.aClass199_1930) {
			i_189_ = 1;
			i_190_ = i_188_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_189_ = 3;
			i_190_ = i_188_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_189_ = 4;
			i_190_ = i_188_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_189_ = 6;
			i_190_ = i_188_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_189_ = 5;
			i_190_ = i_188_ + 2;
		} else {
			i_189_ = 0;
			i_190_ = i_188_;
		}
		OpenGL.glDrawArrays(i_189_, i, i_190_);
	}

	public Interface8_Impl1_Impl1 av(int i, int i_191_, int i_192_) {
		return new Class264(this, Class72.aClass72_610, Class86.aClass86_719, i, i_191_, i_192_);
	}

	final void method5115(Interface9_Impl2 interface9_impl2, Class199 class199, int i, int i_193_, int i_194_, int i_195_) {
		int i_196_;
		int i_197_;
		if (class199 == Class199.aClass199_1930) {
			i_196_ = 1;
			i_197_ = i_195_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_196_ = 3;
			i_197_ = i_195_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_196_ = 4;
			i_197_ = i_195_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_196_ = 6;
			i_197_ = i_195_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_196_ = 5;
			i_197_ = i_195_ + 2;
		} else {
			i_196_ = 0;
			i_197_ = i_195_;
		}
		Class86 class86 = interface9_impl2.method157();
		Class266_Sub2 class266_sub2 = (Class266_Sub2) interface9_impl2;
		class266_sub2.method2647();
		OpenGL.glDrawElements(i_196_, i_197_, method5147(class86), (class266_sub2.method2646() + (long) (i_194_ * (class86.anInt724 * -1615628035))));
	}

	public final void method5038(Class199 class199, int i, int i_198_, int i_199_, int i_200_) {
		int i_201_;
		int i_202_;
		if (class199 == Class199.aClass199_1930) {
			i_201_ = 1;
			i_202_ = i_200_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_201_ = 3;
			i_202_ = i_200_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_201_ = 4;
			i_202_ = i_200_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_201_ = 6;
			i_202_ = i_200_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_201_ = 5;
			i_202_ = i_200_ + 2;
		} else {
			i_201_ = 0;
			i_202_ = i_200_;
		}
		Class86 class86 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method157();
		OpenGL.glDrawElements(i_201_, i_202_, method5147(class86), (((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2646() + (long) (i_199_ * (class86.anInt724 * -1615628035))));
	}

	public final void method5116(Class199 class199, int i, int i_203_, int i_204_, int i_205_) {
		int i_206_;
		int i_207_;
		if (class199 == Class199.aClass199_1930) {
			i_206_ = 1;
			i_207_ = i_205_ * 2;
		} else if (class199 == Class199.aClass199_1927) {
			i_206_ = 3;
			i_207_ = i_205_ + 1;
		} else if (class199 == Class199.aClass199_1926) {
			i_206_ = 4;
			i_207_ = i_205_ * 3;
		} else if (class199 == Class199.aClass199_1929) {
			i_206_ = 6;
			i_207_ = i_205_ + 2;
		} else if (class199 == Class199.aClass199_1931) {
			i_206_ = 5;
			i_207_ = i_205_ + 2;
		} else {
			i_206_ = 0;
			i_207_ = i_205_;
		}
		Class86 class86 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method157();
		OpenGL.glDrawElements(i_206_, i_207_, method5147(class86), (((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2646() + (long) (i_204_ * (class86.anInt724 * -1615628035))));
	}

	void method4997() {
		if (aBoolean8522 && !aBoolean8575)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method5117(int i) {
		if (!((Class_ra_Sub2_Sub1) this).aBoolean9885)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method5118() {
		if (aClass76_4228 != null)
			OpenGL.glViewport(anInt8517 + anInt8531, (anInt8518 + aClass76_4228.method857() - anInt8567 - anInt8516), anInt8515, anInt8516);
		OpenGL.glDepthRange(aFloat8499, aFloat8478);
	}

	void method5119() {
		if (aClass76_4228 != null)
			OpenGL.glViewport(anInt8517 + anInt8531, (anInt8518 + aClass76_4228.method857() - anInt8567 - anInt8516), anInt8515, anInt8516);
		OpenGL.glDepthRange(aFloat8499, aFloat8478);
	}

	public void method4917(Class249 class249) {
		float[] fs = class249.aFloatArray2631;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public void method5033(Class249 class249) {
		float[] fs = class249.aFloatArray2631;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public void method5020(Class249 class249) {
		float[] fs = class249.aFloatArray2631;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method5042() {
		if (aBoolean8526)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	final synchronized void method5154(int i, int i_208_) {
		Class330_Sub23 class330_sub23 = new Class330_Sub23(i_208_);
		class330_sub23.aLong3341 = (long) i * -1420004262915178823L;
		((Class_ra_Sub2_Sub1) this).aClass471_9860.method5878(class330_sub23, (short) 8192);
	}

	void method4992() {
		if (aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method5124() {
		if (aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	boolean method5032(Class72 class72, Class86 class86) {
		return aBoolean8598;
	}

	void method5083() {
		OpenGL.glMatrixMode(5890);
		if (aClass181Array8509[anInt8543] != Class181.aClass181_1784)
			OpenGL.glLoadMatrixf(aClass249Array8545[anInt8543].method2514(((Class_ra_Sub2_Sub1) this).aFloatArray9887), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method4968() {
		OpenGL.glTexEnvi(8960, 34162, method5142(aClass179Array8548[anInt8543]));
	}

	void method5127() {
		OpenGL.glTexEnvi(8960, 34162, method5142(aClass179Array8548[anInt8543]));
	}

	final void method5128() {
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[0] = (float) (anInt8445 & 0xff0000) / 1.671168E7F;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[1] = (float) (anInt8445 & 0xff00) / 65280.0F;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[2] = (float) (anInt8445 & 0xff) / 255.0F;
		((Class_ra_Sub2_Sub1) this).aFloatArray9858[3] = (float) (anInt8445 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class_ra_Sub2_Sub1) this).aFloatArray9858, 0);
	}

	final Interface9_Impl1 method4976(boolean bool) {
		return new Class266_Sub1(this, bool);
	}

	void method4989() {
		if (aBoolean8585)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	void method5004(Interface9_Impl2 interface9_impl2) {
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886 = (Class266_Sub2) interface9_impl2;
		((Class_ra_Sub2_Sub1) this).aClass266_Sub2_9886.method2647();
	}

	final Interface9_Impl1 method5131(boolean bool) {
		return new Class266_Sub1(this, bool);
	}

	void method5034() {
		if (aClass76_4228 != null) {
			int i = anInt8517 + anInt8610;
			int i_209_ = anInt8518 + aClass76_4228.method857() - anInt8506;
			int i_210_ = anInt8447 - anInt8610;
			int i_211_ = anInt8506 - anInt8521;
			if (i_210_ < 0)
				i_210_ = 0;
			if (i_211_ < 0)
				i_211_ = 0;
			OpenGL.glScissor(i, i_209_, i_210_, i_211_);
		}
	}

	final void method5001(int i, Class175 class175, boolean bool, boolean bool_212_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method5143(class175));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_212_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_212_ ? 769 : 768);
	}

	public void method5133(Class249 class249, Class249 class249_213_, Class249 class249_214_) {
		OpenGL.glMatrixMode(5888);
		aClass249_8576.method2484(class249, class249_213_);
		OpenGL.glLoadMatrixf(aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class249_214_.aFloatArray2631, 0);
	}

	public void method5134(Class249 class249, Class249 class249_215_, Class249 class249_216_) {
		OpenGL.glMatrixMode(5888);
		aClass249_8576.method2484(class249, class249_215_);
		OpenGL.glLoadMatrixf(aClass249_8576.aFloatArray2631, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class249_216_.aFloatArray2631, 0);
	}

	void de() {
		super.u();
		if (((Class_ra_Sub2_Sub1) this).anOpenGL9881 != null) {
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.i();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881.release();
			((Class_ra_Sub2_Sub1) this).anOpenGL9881 = null;
		}
	}

	Interface11_Impl3 method5136(Class72 class72, Class86 class86, int i, int i_217_) {
		return method4953(class72, class86, i, i_217_);
	}

	Interface11_Impl3 method5137(Class72 class72, Class86 class86, int i, int i_218_) {
		return method4953(class72, class86, i, i_218_);
	}

	Interface11_Impl3 method5138(Class72 class72, Class86 class86, int i, int i_219_) {
		return method4953(class72, class86, i, i_219_);
	}

	final void method5139(int i, Class175 class175, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method5143(class175));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	public void method5009(Class184 class184) {
		Class193[] class193s = class184.aClass193Array6483;
		int i = 0;
		boolean bool = false;
		boolean bool_220_ = false;
		boolean bool_221_ = false;
		for (int i_222_ = 0; i_222_ < class193s.length; i_222_++) {
			Class193 class193 = class193s[i_222_];
			Class266_Sub1 class266_sub1 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i_222_];
			int i_223_ = 0;
			int i_224_ = class266_sub1.method2648();
			long l = class266_sub1.method2646();
			class266_sub1.method2647();
			for (int i_225_ = 0; i_225_ < class193.method2136(); i_225_++) {
				Class191 class191 = class193.method2134(i_225_);
				switch (class191.anInt1860) {
				case 6:
					OpenGL.glVertexPointer(3, 5126, i_224_, l + (long) i_223_);
					bool_221_ = true;
					break;
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_224_, l + (long) i_223_);
					break;
				case 1:
					OpenGL.glColorPointer(4, 5121, i_224_, l + (long) i_223_);
					bool = true;
					break;
				case 7:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_224_, l + (long) i_223_);
					break;
				case 8:
					OpenGL.glNormalPointer(5126, i_224_, l + (long) i_223_);
					bool_220_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_224_, l + (long) i_223_);
					break;
				case 0:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_224_, l + (long) i_223_);
					break;
				}
				i_223_ += class191.anInt1876;
			}
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9868 != bool_221_) {
			if (bool_221_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class_ra_Sub2_Sub1) this).aBoolean9868 = bool_221_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9878 != bool_220_) {
			if (bool_220_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class_ra_Sub2_Sub1) this).aBoolean9878 = bool_220_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9869 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class_ra_Sub2_Sub1) this).aBoolean9869 = bool;
		}
		if (((Class_ra_Sub2_Sub1) this).anInt9871 < i) {
			for (int i_226_ = ((Class_ra_Sub2_Sub1) this).anInt9871; i_226_ < i; i_226_++) {
				OpenGL.glClientActiveTexture(33984 + i_226_);
				OpenGL.glEnableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		} else if (((Class_ra_Sub2_Sub1) this).anInt9871 > i) {
			for (int i_227_ = i; i_227_ < ((Class_ra_Sub2_Sub1) this).anInt9871; i_227_++) {
				OpenGL.glClientActiveTexture(33984 + i_227_);
				OpenGL.glDisableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		}
	}

	public void method5098(Class184 class184) {
		Class193[] class193s = class184.aClass193Array6483;
		int i = 0;
		boolean bool = false;
		boolean bool_228_ = false;
		boolean bool_229_ = false;
		for (int i_230_ = 0; i_230_ < class193s.length; i_230_++) {
			Class193 class193 = class193s[i_230_];
			Class266_Sub1 class266_sub1 = ((Class_ra_Sub2_Sub1) this).aClass266_Sub1Array9872[i_230_];
			int i_231_ = 0;
			int i_232_ = class266_sub1.method2648();
			long l = class266_sub1.method2646();
			class266_sub1.method2647();
			for (int i_233_ = 0; i_233_ < class193.method2136(); i_233_++) {
				Class191 class191 = class193.method2134(i_233_);
				switch (class191.anInt1860) {
				case 6:
					OpenGL.glVertexPointer(3, 5126, i_232_, l + (long) i_231_);
					bool_229_ = true;
					break;
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_232_, l + (long) i_231_);
					break;
				case 1:
					OpenGL.glColorPointer(4, 5121, i_232_, l + (long) i_231_);
					bool = true;
					break;
				case 7:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_232_, l + (long) i_231_);
					break;
				case 8:
					OpenGL.glNormalPointer(5126, i_232_, l + (long) i_231_);
					bool_228_ = true;
					break;
				case 3:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_232_, l + (long) i_231_);
					break;
				case 0:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_232_, l + (long) i_231_);
					break;
				}
				i_231_ += class191.anInt1876;
			}
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9868 != bool_229_) {
			if (bool_229_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class_ra_Sub2_Sub1) this).aBoolean9868 = bool_229_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9878 != bool_228_) {
			if (bool_228_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class_ra_Sub2_Sub1) this).aBoolean9878 = bool_228_;
		}
		if (((Class_ra_Sub2_Sub1) this).aBoolean9869 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class_ra_Sub2_Sub1) this).aBoolean9869 = bool;
		}
		if (((Class_ra_Sub2_Sub1) this).anInt9871 < i) {
			for (int i_234_ = ((Class_ra_Sub2_Sub1) this).anInt9871; i_234_ < i; i_234_++) {
				OpenGL.glClientActiveTexture(33984 + i_234_);
				OpenGL.glEnableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		} else if (((Class_ra_Sub2_Sub1) this).anInt9871 > i) {
			for (int i_235_ = i; i_235_ < ((Class_ra_Sub2_Sub1) this).anInt9871; i_235_++) {
				OpenGL.glClientActiveTexture(33984 + i_235_);
				OpenGL.glDisableClientState(32888);
			}
			((Class_ra_Sub2_Sub1) this).anInt9871 = i;
		}
	}

	void dj(int i, int i_236_) throws Exception_Sub1 {
		aClass76_Sub1_4234.method874();
		if (anInterface_ma4227 != null)
			anInterface_ma4227.method224((short) -2000);
	}

	void method5155() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8592 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_237_ = 16384 + i;
			OpenGL.glLightfv(i_237_, 4608, fs, 0);
			OpenGL.glLightf(i_237_, 4615, 0.0F);
			OpenGL.glLightf(i_237_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class_ra_Sub2_Sub1) this).anOpenGL9881.setSwapInterval(0);
		super.method4895();
	}

	void method5088() {
		OpenGL.glActiveTexture(33984 + anInt8543);
	}

	void method5123() {
		if (aBoolean8523) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}
}
