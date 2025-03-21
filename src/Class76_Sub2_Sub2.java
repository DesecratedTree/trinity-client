/* Class76_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class76_Sub2_Sub2 extends Class76_Sub2 {
	Class_ra_Sub1 aClass_ra_Sub1_9387;
	int anInt9388;
	int anInt9389;
	int anInt9390;
	int anInt9391;
	int anInt9392;
	Interface8_Impl1_Impl2_Impl2[] anInterface8_Impl1_Impl2_Impl2Array9393 = new Interface8_Impl1_Impl2_Impl2[4];
	Interface8_Impl1_Impl2_Impl2 anInterface8_Impl1_Impl2_Impl2_9394;
	static int anInt9395 = 16;

	Class76_Sub2_Sub2(Class_ra_Sub1 class_ra_sub1) {
		if (!((Class_ra_Sub1) class_ra_sub1).aBoolean8429)
			throw new IllegalStateException("");
		((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387 = class_ra_sub1;
		int[] is = new int[1];
		OpenGL.glGenFramebuffersEXT(1, is, 0);
		((Class76_Sub2_Sub2) this).anInt9389 = is[0];
	}

	public int method856() {
		return ((Class76_Sub2_Sub2) this).anInt9390;
	}

	public int method857() {
		return ((Class76_Sub2_Sub2) this).anInt9391;
	}

	void method916() {
		if (((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2_9394 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		else
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2_9394.method2(36096);
	}

	void method917(int i) {
		Interface8_Impl1_Impl2_Impl2 interface8_impl1_impl2_impl2 = (((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2Array9393[i]);
		if (interface8_impl1_impl2_impl2 == null)
			OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
		else
			interface8_impl1_impl2_impl2.method2(36064 + i);
	}

	boolean method174() {
		OpenGL.glBindFramebufferEXT(36160, ((Class76_Sub2_Sub2) this).anInt9389);
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub2) this).anInt9388 & 1 << i) != 0)
				method917(i);
		}
		if ((((Class76_Sub2_Sub2) this).anInt9388 & 0x10) != 0)
			method916();
		((Class76_Sub2_Sub2) this).anInt9388 = 0;
		((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4813();
		return true;
	}

	public void method183() {
		if (((Class76_Sub2_Sub2) this).anInt9389 != 0) {
			((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4860(((Class76_Sub2_Sub2) this).anInt9389);
			((Class76_Sub2_Sub2) this).anInt9389 = 0;
		}
	}

	boolean method176() {
		OpenGL.glBindFramebufferEXT(36160, ((Class76_Sub2_Sub2) this).anInt9389);
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub2) this).anInt9388 & 1 << i) != 0)
				method917(i);
		}
		if ((((Class76_Sub2_Sub2) this).anInt9388 & 0x10) != 0)
			method916();
		((Class76_Sub2_Sub2) this).anInt9388 = 0;
		((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4813();
		return true;
	}

	boolean method862() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	void method918(int i) {
		OpenGL.glDrawBuffer(36064 + i);
	}

	public void method903(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool | bool_5_) {
			int i_6_ = ((Class76_Sub2_Sub2) this).anInt9391;
			int i_7_ = ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0).method857();
			int i_8_ = 0;
			if (bool_5_)
				i_8_ |= 0x100;
			if (bool)
				i_8_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, ((Class76_Sub2_Sub2) this).anInt9389);
			OpenGL.glBlitFramebufferEXT(i, i_6_ - i_0_ - i_2_, i + i_1_, i_6_ - i_0_, i_3_, i_7_ - i_4_ - i_2_, i_3_ + i_1_, i_7_ - i_4_, i_8_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public void method910(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_) {
		if (bool | bool_14_) {
			int i_15_ = ((Class76_Sub2_Sub2) this).anInt9391;
			int i_16_ = ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0).method857();
			int i_17_ = 0;
			if (bool_14_)
				i_17_ |= 0x100;
			if (bool)
				i_17_ |= 0x4000;
			OpenGL.glBindFramebufferEXT(36008, ((Class76_Sub2_Sub2) this).anInt9389);
			OpenGL.glBlitFramebufferEXT(i, i_15_ - i_9_ - i_11_, i + i_10_, i_15_ - i_9_, i_12_, i_16_ - i_13_ - i_11_, i_12_ + i_10_, i_16_ - i_13_, i_17_, 9728);
			OpenGL.glBindFramebufferEXT(36008, 0);
		}
	}

	public int method858() {
		return ((Class76_Sub2_Sub2) this).anInt9390;
	}

	public int method864() {
		return ((Class76_Sub2_Sub2) this).anInt9390;
	}

	public int method859() {
		return ((Class76_Sub2_Sub2) this).anInt9390;
	}

	public boolean method899() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method900(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Interface8_Impl1_Impl2_Impl2 interface8_impl1_impl2_impl2 = (Interface8_Impl1_Impl2_Impl2) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if ((((Class76_Sub2_Sub2) this).anInt9392 | 0x10) != 16) {
				if ((((Class76_Sub2_Sub2) this).anInt9390 != interface8_impl1_impl2_impl2.method54()) || (((Class76_Sub2_Sub2) this).anInt9391 != interface8_impl1_impl2_impl2.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub2) this).anInt9391 = interface8_impl1_impl2_impl2.method55();
				((Class76_Sub2_Sub2) this).anInt9390 = interface8_impl1_impl2_impl2.method54();
				if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
					((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4866();
			}
			((Class76_Sub2_Sub2) this).anInt9392 |= 0x10;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2_9394 = interface8_impl1_impl2_impl2;
		} else {
			((Class76_Sub2_Sub2) this).anInt9392 &= ~0x10;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2_9394 = null;
			if (((Class76_Sub2_Sub2) this).anInt9392 == 0) {
				((Class76_Sub2_Sub2) this).anInt9391 = 0;
				((Class76_Sub2_Sub2) this).anInt9390 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
			method916();
		else
			((Class76_Sub2_Sub2) this).anInt9388 |= 0x10;
	}

	public int method855() {
		return ((Class76_Sub2_Sub2) this).anInt9391;
	}

	public int method861() {
		return ((Class76_Sub2_Sub2) this).anInt9391;
	}

	public boolean method904() {
		int i = OpenGL.glCheckFramebufferStatusEXT(36160);
		if (i != 36053)
			return false;
		return true;
	}

	public void method905(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_18_ = 1 << i;
		Interface8_Impl1_Impl2_Impl2 interface8_impl1_impl2_impl2 = (Interface8_Impl1_Impl2_Impl2) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if ((((Class76_Sub2_Sub2) this).anInt9392 | i_18_) != i_18_) {
				if ((((Class76_Sub2_Sub2) this).anInt9390 != interface8_impl1_impl2_impl2.method54()) || (((Class76_Sub2_Sub2) this).anInt9391 != interface8_impl1_impl2_impl2.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub2) this).anInt9391 = interface8_impl1_impl2_impl2.method55();
				((Class76_Sub2_Sub2) this).anInt9390 = interface8_impl1_impl2_impl2.method54();
				if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
					((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4866();
			}
			((Class76_Sub2_Sub2) this).anInt9392 |= i_18_;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2Array9393[i] = interface8_impl1_impl2_impl2;
		} else {
			((Class76_Sub2_Sub2) this).anInt9392 &= i_18_ ^ 0xffffffff;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2Array9393[i] = null;
			if (((Class76_Sub2_Sub2) this).anInt9392 == 0) {
				((Class76_Sub2_Sub2) this).anInt9391 = 0;
				((Class76_Sub2_Sub2) this).anInt9390 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
			method917(i);
		else
			((Class76_Sub2_Sub2) this).anInt9388 |= i_18_;
	}

	public void method906(Interface8_Impl1_Impl1 interface8_impl1_impl1) {
		Interface8_Impl1_Impl2_Impl2 interface8_impl1_impl2_impl2 = (Interface8_Impl1_Impl2_Impl2) interface8_impl1_impl1;
		if (interface8_impl1_impl1 != null) {
			if ((((Class76_Sub2_Sub2) this).anInt9392 | 0x10) != 16) {
				if ((((Class76_Sub2_Sub2) this).anInt9390 != interface8_impl1_impl2_impl2.method54()) || (((Class76_Sub2_Sub2) this).anInt9391 != interface8_impl1_impl2_impl2.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub2) this).anInt9391 = interface8_impl1_impl2_impl2.method55();
				((Class76_Sub2_Sub2) this).anInt9390 = interface8_impl1_impl2_impl2.method54();
				if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
					((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4866();
			}
			((Class76_Sub2_Sub2) this).anInt9392 |= 0x10;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2_9394 = interface8_impl1_impl2_impl2;
		} else {
			((Class76_Sub2_Sub2) this).anInt9392 &= ~0x10;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2_9394 = null;
			if (((Class76_Sub2_Sub2) this).anInt9392 == 0) {
				((Class76_Sub2_Sub2) this).anInt9391 = 0;
				((Class76_Sub2_Sub2) this).anInt9390 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
			method916();
		else
			((Class76_Sub2_Sub2) this).anInt9388 |= 0x10;
	}

	public boolean method902() {
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

	boolean method182() {
		OpenGL.glBindFramebufferEXT(36160, ((Class76_Sub2_Sub2) this).anInt9389);
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub2) this).anInt9388 & 1 << i) != 0)
				method917(i);
		}
		if ((((Class76_Sub2_Sub2) this).anInt9388 & 0x10) != 0)
			method916();
		((Class76_Sub2_Sub2) this).anInt9388 = 0;
		((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4813();
		return true;
	}

	boolean method178() {
		OpenGL.glBindFramebufferEXT(36160, ((Class76_Sub2_Sub2) this).anInt9389);
		for (int i = 0; i < 4; i++) {
			if ((((Class76_Sub2_Sub2) this).anInt9388 & 1 << i) != 0)
				method917(i);
		}
		if ((((Class76_Sub2_Sub2) this).anInt9388 & 0x10) != 0)
			method916();
		((Class76_Sub2_Sub2) this).anInt9388 = 0;
		((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4813();
		return true;
	}

	boolean method863() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	boolean method865() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	public void method185() {
		if (((Class76_Sub2_Sub2) this).anInt9389 != 0) {
			((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4860(((Class76_Sub2_Sub2) this).anInt9389);
			((Class76_Sub2_Sub2) this).anInt9389 = 0;
		}
	}

	public void method180() {
		if (((Class76_Sub2_Sub2) this).anInt9389 != 0) {
			((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4860(((Class76_Sub2_Sub2) this).anInt9389);
			((Class76_Sub2_Sub2) this).anInt9389 = 0;
		}
	}

	public void method181() {
		if (((Class76_Sub2_Sub2) this).anInt9389 != 0) {
			((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4860(((Class76_Sub2_Sub2) this).anInt9389);
			((Class76_Sub2_Sub2) this).anInt9389 = 0;
		}
	}

	public void method909(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_19_ = 1 << i;
		Interface8_Impl1_Impl2_Impl2 interface8_impl1_impl2_impl2 = (Interface8_Impl1_Impl2_Impl2) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if ((((Class76_Sub2_Sub2) this).anInt9392 | i_19_) != i_19_) {
				if ((((Class76_Sub2_Sub2) this).anInt9390 != interface8_impl1_impl2_impl2.method54()) || (((Class76_Sub2_Sub2) this).anInt9391 != interface8_impl1_impl2_impl2.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub2) this).anInt9391 = interface8_impl1_impl2_impl2.method55();
				((Class76_Sub2_Sub2) this).anInt9390 = interface8_impl1_impl2_impl2.method54();
				if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
					((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4866();
			}
			((Class76_Sub2_Sub2) this).anInt9392 |= i_19_;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2Array9393[i] = interface8_impl1_impl2_impl2;
		} else {
			((Class76_Sub2_Sub2) this).anInt9392 &= i_19_ ^ 0xffffffff;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2Array9393[i] = null;
			if (((Class76_Sub2_Sub2) this).anInt9392 == 0) {
				((Class76_Sub2_Sub2) this).anInt9391 = 0;
				((Class76_Sub2_Sub2) this).anInt9390 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
			method917(i);
		else
			((Class76_Sub2_Sub2) this).anInt9388 |= i_19_;
	}

	public void method179() {
		if (((Class76_Sub2_Sub2) this).anInt9389 != 0) {
			((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4860(((Class76_Sub2_Sub2) this).anInt9389);
			((Class76_Sub2_Sub2) this).anInt9389 = 0;
		}
	}

	public int method860() {
		return ((Class76_Sub2_Sub2) this).anInt9391;
	}

	public void method901(int i, Interface8_Impl1_Impl2 interface8_impl1_impl2) {
		int i_20_ = 1 << i;
		Interface8_Impl1_Impl2_Impl2 interface8_impl1_impl2_impl2 = (Interface8_Impl1_Impl2_Impl2) interface8_impl1_impl2;
		if (interface8_impl1_impl2 != null) {
			if ((((Class76_Sub2_Sub2) this).anInt9392 | i_20_) != i_20_) {
				if ((((Class76_Sub2_Sub2) this).anInt9390 != interface8_impl1_impl2_impl2.method54()) || (((Class76_Sub2_Sub2) this).anInt9391 != interface8_impl1_impl2_impl2.method55()))
					throw new RuntimeException();
			} else {
				((Class76_Sub2_Sub2) this).anInt9391 = interface8_impl1_impl2_impl2.method55();
				((Class76_Sub2_Sub2) this).anInt9390 = interface8_impl1_impl2_impl2.method54();
				if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
					((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4866();
			}
			((Class76_Sub2_Sub2) this).anInt9392 |= i_20_;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2Array9393[i] = interface8_impl1_impl2_impl2;
		} else {
			((Class76_Sub2_Sub2) this).anInt9392 &= i_20_ ^ 0xffffffff;
			((Class76_Sub2_Sub2) this).anInterface8_Impl1_Impl2_Impl2Array9393[i] = null;
			if (((Class76_Sub2_Sub2) this).anInt9392 == 0) {
				((Class76_Sub2_Sub2) this).anInt9391 = 0;
				((Class76_Sub2_Sub2) this).anInt9390 = 0;
			}
		}
		if (this == ((Class76_Sub2_Sub2) this).aClass_ra_Sub1_9387.method4782((byte) 0))
			method917(i);
		else
			((Class76_Sub2_Sub2) this).anInt9388 |= i_20_;
	}
}
