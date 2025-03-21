/* Class76_Sub2_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class76_Sub2_Sub3_Sub2 extends Class76_Sub2_Sub3 {
	Class_ra_Sub2_Sub1 aClass_ra_Sub2_Sub1_10111;
	int anInt10112;
	Interface8_Impl1_Impl2_Impl1[] anInterface8_Impl1_Impl2_Impl1Array10113 = new Interface8_Impl1_Impl2_Impl1[4];
	int anInt10114;
	int anInt10115;
	int anInt10116;
	int anInt10117;
	Interface8_Impl1_Impl2_Impl1 anInterface8_Impl1_Impl2_Impl1_10118;
	static int anInt10119 = 16;

	void method923(int i) {
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1Array10113[i]);
		if (interface8_impl1_impl2_impl1 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface8_impl1_impl2_impl1.method217(36064 + i);
	}

	public int method857() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10115;
	}

	public int method856() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10114;
	}

	public void method900(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 != 0) {
				if ((((Class76_Sub2_Sub3_Sub2) this).anInt10114 != interface8_impl1_impl2_impl1.method54()) || (((Class76_Sub2_Sub3_Sub2) this).anInt10115 != interface8_impl1_impl2_impl1.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = interface8_impl1_impl2_impl1.method55();
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = interface8_impl1_impl2_impl1.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 |= 0x10;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_10118 = interface8_impl1_impl2_impl1;
		} else {
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 &= ~0x10;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_10118 = null;
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 == 0) {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = 0;
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method4782((byte) 0))
			method924();
		else
			((Class76_Sub2_Sub3_Sub2) this).anInt10117 |= 0x10;
	}

	public void method910(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool | bool_5_) {
			int i_6_ = ((Class76_Sub2_Sub3_Sub2) this).anInt10115;
			int i_7_ = ((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method4782((byte) 0).method857();
			int i_8_ = 0;
			if (bool_5_)
				i_8_ |= 0x100;
			if (bool)
				i_8_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class76_Sub2_Sub3_Sub2) this).anInt10112));
			OpenGL.glBlitFramebufferEXT(i, i_6_ - i_0_ - i_2_, i + i_1_, i_6_ - i_0_, i_3_, i_7_ - i_4_ - i_2_, i_3_ + i_1_, i_7_ - i_4_, i_8_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public int method859() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10114;
	}

	public boolean method902() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method901(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_9_ = 1 << i;
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 != 0) {
				if ((((Class76_Sub2_Sub3_Sub2) this).anInt10114 != interface8_impl1_impl2_impl1.method54()) || (((Class76_Sub2_Sub3_Sub2) this).anInt10115 != interface8_impl1_impl2_impl1.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = interface8_impl1_impl2_impl1.method55();
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = interface8_impl1_impl2_impl1.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 |= i_9_;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1Array10113[i] = interface8_impl1_impl2_impl1;
		} else {
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 &= i_9_ ^ 0xffffffff;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1Array10113[i] = null;
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 == 0) {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = 0;
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method4782((byte) 0))
			method923(i);
		else
			((Class76_Sub2_Sub3_Sub2) this).anInt10117 |= i_9_;
	}

	boolean method862() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method865() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	Class76_Sub2_Sub3_Sub2(Class_ra_Sub2_Sub1 class_ra_sub2_sub1) {
		super((Class_ra_Sub2) class_ra_sub2_sub1);
		((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111 = class_ra_sub2_sub1;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		((Class76_Sub2_Sub3_Sub2) this).anInt10112 = is[0];
	}

	public int method864() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10114;
	}

	public int method858() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10114;
	}

	public int method860() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10115;
	}

	public void method909(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_10_ = 1 << i;
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 != 0) {
				if ((((Class76_Sub2_Sub3_Sub2) this).anInt10114 != interface8_impl1_impl2_impl1.method54()) || (((Class76_Sub2_Sub3_Sub2) this).anInt10115 != interface8_impl1_impl2_impl1.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = interface8_impl1_impl2_impl1.method55();
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = interface8_impl1_impl2_impl1.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 |= i_10_;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1Array10113[i] = interface8_impl1_impl2_impl1;
		} else {
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 &= i_10_ ^ 0xffffffff;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1Array10113[i] = null;
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 == 0) {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = 0;
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method4782((byte) 0))
			method923(i);
		else
			((Class76_Sub2_Sub3_Sub2) this).anInt10117 |= i_10_;
	}

	public int method861() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10115;
	}

	public int method855() {
		return ((Class76_Sub2_Sub3_Sub2) this).anInt10115;
	}

	public void method905(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_11_ = 1 << i;
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 != 0) {
				if ((((Class76_Sub2_Sub3_Sub2) this).anInt10114 != interface8_impl1_impl2_impl1.method54()) || (((Class76_Sub2_Sub3_Sub2) this).anInt10115 != interface8_impl1_impl2_impl1.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = interface8_impl1_impl2_impl1.method55();
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = interface8_impl1_impl2_impl1.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 |= i_11_;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1Array10113[i] = interface8_impl1_impl2_impl1;
		} else {
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 &= i_11_ ^ 0xffffffff;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1Array10113[i] = null;
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 == 0) {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = 0;
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method4782((byte) 0))
			method923(i);
		else
			((Class76_Sub2_Sub3_Sub2) this).anInt10117 |= i_11_;
	}

	public void method906(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Interface8_Impl1_Impl2_Impl1 interface8_impl1_impl2_impl1 = (Interface8_Impl1_Impl2_Impl1) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 != 0) {
				if ((((Class76_Sub2_Sub3_Sub2) this).anInt10114 != interface8_impl1_impl2_impl1.method54()) || (((Class76_Sub2_Sub3_Sub2) this).anInt10115 != interface8_impl1_impl2_impl1.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = interface8_impl1_impl2_impl1.method55();
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = interface8_impl1_impl2_impl1.method54();
				method919();
			}
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 |= 0x10;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_10118 = interface8_impl1_impl2_impl1;
		} else {
			((Class76_Sub2_Sub3_Sub2) this).anInt10116 &= ~0x10;
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_10118 = null;
			if (((Class76_Sub2_Sub3_Sub2) this).anInt10116 == 0) {
				((Class76_Sub2_Sub3_Sub2) this).anInt10115 = 0;
				((Class76_Sub2_Sub3_Sub2) this).anInt10114 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method4782((byte) 0))
			method924();
		else
			((Class76_Sub2_Sub3_Sub2) this).anInt10117 |= 0x10;
	}

	public boolean method899() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public boolean method904() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public boolean method908() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public boolean method907() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	boolean method176() {
		OpenGL.glBindFramebufferEXT(36160, (((Class76_Sub2_Sub3_Sub2) this).anInt10112));
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 1 << i) != 0)
				method923(i);
		}
		if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 0x10) != 0)
			method924();
		((Class76_Sub2_Sub3_Sub2) this).anInt10117 = 0;
		return super.method174();
	}

	boolean method182() {
		OpenGL.glBindFramebufferEXT(36160, (((Class76_Sub2_Sub3_Sub2) this).anInt10112));
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 1 << i) != 0)
				method923(i);
		}
		if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 0x10) != 0)
			method924();
		((Class76_Sub2_Sub3_Sub2) this).anInt10117 = 0;
		return super.method174();
	}

	boolean method178() {
		OpenGL.glBindFramebufferEXT(36160, (((Class76_Sub2_Sub3_Sub2) this).anInt10112));
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 1 << i) != 0)
				method923(i);
		}
		if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 0x10) != 0)
			method924();
		((Class76_Sub2_Sub3_Sub2) this).anInt10117 = 0;
		return super.method174();
	}

	boolean method863() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method185() {
		if (((Class76_Sub2_Sub3_Sub2) this).anInt10112 != 0) {
			((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method5144(((Class76_Sub2_Sub3_Sub2) this).anInt10112);
			((Class76_Sub2_Sub3_Sub2) this).anInt10112 = 0;
		}
	}

	public void method183() {
		if (((Class76_Sub2_Sub3_Sub2) this).anInt10112 != 0) {
			((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method5144(((Class76_Sub2_Sub3_Sub2) this).anInt10112);
			((Class76_Sub2_Sub3_Sub2) this).anInt10112 = 0;
		}
	}

	public void method179() {
		if (((Class76_Sub2_Sub3_Sub2) this).anInt10112 != 0) {
			((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method5144(((Class76_Sub2_Sub3_Sub2) this).anInt10112);
			((Class76_Sub2_Sub3_Sub2) this).anInt10112 = 0;
		}
	}

	public void method180() {
		if (((Class76_Sub2_Sub3_Sub2) this).anInt10112 != 0) {
			((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method5144(((Class76_Sub2_Sub3_Sub2) this).anInt10112);
			((Class76_Sub2_Sub3_Sub2) this).anInt10112 = 0;
		}
	}

	public void method181() {
		if (((Class76_Sub2_Sub3_Sub2) this).anInt10112 != 0) {
			((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method5144(((Class76_Sub2_Sub3_Sub2) this).anInt10112);
			((Class76_Sub2_Sub3_Sub2) this).anInt10112 = 0;
		}
	}

	boolean method174() {
		OpenGL.glBindFramebufferEXT(36160, (((Class76_Sub2_Sub3_Sub2) this).anInt10112));
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 1 << i) != 0)
				method923(i);
		}
		if ((((Class76_Sub2_Sub3_Sub2) this).anInt10117 & 0x10) != 0)
			method924();
		((Class76_Sub2_Sub3_Sub2) this).anInt10117 = 0;
		return super.method174();
	}

	public void method903(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, boolean bool_17_) {
		if (bool | bool_17_) {
			int i_18_ = ((Class76_Sub2_Sub3_Sub2) this).anInt10115;
			int i_19_ = ((Class76_Sub2_Sub3_Sub2) this).aClass_ra_Sub2_Sub1_10111.method4782((byte) 0).method857();
			int i_20_ = 0;
			if (bool_17_)
				i_20_ |= 0x100;
			if (bool)
				i_20_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, (((Class76_Sub2_Sub3_Sub2) this).anInt10112));
			OpenGL.glBlitFramebufferEXT(i, i_18_ - i_12_ - i_14_, i + i_13_, i_18_ - i_12_, i_15_, i_19_ - i_16_ - i_14_, i_15_ + i_13_, i_19_ - i_16_, i_20_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	void method924() {
		if ((((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_10118) == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class76_Sub2_Sub3_Sub2) this).anInterface8_Impl1_Impl2_Impl1_10118.method217(36096);
	}
}
