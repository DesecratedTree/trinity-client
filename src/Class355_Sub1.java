/* Class355_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class355_Sub1 extends Class355 implements KeyListener, FocusListener {
	static int anInt7993 = 112;
	static int anInt7994 = 128;
	boolean[] aBooleanArray7995;
	Class471 aClass471_7996;
	Component aComponent7997;
	Class471 aClass471_7998 = new Class471();
	static int[] anIntArray7999 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public boolean method4112(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class355_Sub1) this).aBooleanArray7995[i];
	}

	void method4126(Component component, byte i) {
		try {
			method4130(231162162);
			((Class355_Sub1) this).aComponent7997 = component;
			((Class355_Sub1) this).aComponent7997.addKeyListener(this);
			((Class355_Sub1) this).aComponent7997.addFocusListener(this);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.u(").append(')').toString());
		}
	}

	public boolean isKeyHeld(int i, int i_0_) {
		try {
			if (i < 0 || i >= 112)
				return false;
			return ((Class355_Sub1) this).aBooleanArray7995[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.i(").append(')').toString());
		}
	}

	void method4127(int i, char c, int i_1_, int i_2_) {
		try {
			Class330_Sub33 class330_sub33 = new Class330_Sub33();
			((Class330_Sub33) class330_sub33).anInt6645 = i * -557589195;
			((Class330_Sub33) class330_sub33).aChar6649 = c;
			((Class330_Sub33) class330_sub33).anInt6646 = -1579083423 * i_1_;
			((Class330_Sub33) class330_sub33).aLong6648 = Class312.method3111((byte) 96) * -2600115034841157323L;
			((Class355_Sub1) this).aClass471_7996.method5878(class330_sub33, (short) 8192);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.g(").append(')').toString());
		}
	}

	public Interface18 method4114(int i) {
		try {
			return (Interface18) ((Class355_Sub1) this).aClass471_7998.method5867((short) 8960);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.p(").append(')').toString());
		}
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		try {
			method4127(-1, '\0', 0, 1019032679);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.focusLost(").append(')').toString());
		}
	}

	public synchronized void method4107(byte i) {
		try {
			((Class355_Sub1) this).aClass471_7998.method5866(613065745);
			for (Class330_Sub33 class330_sub33 = (Class330_Sub33) ((Class355_Sub1) this).aClass471_7996.method5867((short) 8960); null != class330_sub33; class330_sub33 = (Class330_Sub33) ((Class355_Sub1) this).aClass471_7996.method5867((short) 8960)) {
				((Class330_Sub33) class330_sub33).anInt6644 = method4129((byte) -46) * 160262395;
				if (((Class330_Sub33) class330_sub33).anInt6645 * 353062173 == 0) {
					if (!((Class355_Sub1) this).aBooleanArray7995[(1773750945 * ((Class330_Sub33) class330_sub33).anInt6646)]) {
						Class330_Sub33 class330_sub33_3_ = new Class330_Sub33();
						((Class330_Sub33) class330_sub33_3_).anInt6645 = 0;
						((Class330_Sub33) class330_sub33_3_).aChar6649 = '\uffff';
						((Class330_Sub33) class330_sub33_3_).anInt6646 = ((Class330_Sub33) class330_sub33).anInt6646 * 1;
						((Class330_Sub33) class330_sub33_3_).aLong6648 = 1L * ((Class330_Sub33) class330_sub33).aLong6648;
						((Class330_Sub33) class330_sub33_3_).anInt6644 = 1 * ((Class330_Sub33) class330_sub33).anInt6644;
						((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33_3_, (short) 8192);
						((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)] = true;
					}
					((Class330_Sub33) class330_sub33).anInt6645 = -1115178390;
					((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
				} else if ((((Class330_Sub33) class330_sub33).anInt6645 * 353062173) == 1) {
					if (((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)]) {
						((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
						((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)] = false;
					}
				} else if (-1 == (((Class330_Sub33) class330_sub33).anInt6645 * 353062173)) {
					for (int i_4_ = 0; i_4_ < 112; i_4_++) {
						if (((Class355_Sub1) this).aBooleanArray7995[i_4_]) {
							Class330_Sub33 class330_sub33_5_ = new Class330_Sub33();
							((Class330_Sub33) class330_sub33_5_).anInt6645 = -557589195;
							((Class330_Sub33) class330_sub33_5_).aChar6649 = '\uffff';
							((Class330_Sub33) class330_sub33_5_).anInt6646 = -1579083423 * i_4_;
							((Class330_Sub33) class330_sub33_5_).aLong6648 = (((Class330_Sub33) class330_sub33).aLong6648 * 1L);
							((Class330_Sub33) class330_sub33_5_).anInt6644 = (((Class330_Sub33) class330_sub33).anInt6644 * 1);
							((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33_5_, (short) 8192);
							((Class355_Sub1) this).aBooleanArray7995[i_4_] = false;
						}
					}
				} else if ((((Class330_Sub33) class330_sub33).anInt6645 * 353062173) == 3)
					((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.j(").append(')').toString());
		}
	}

	public void method4110(byte i) {
		try {
			method4130(1133349892);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.o(").append(')').toString());
		}
	}

	void method4128(KeyEvent keyevent, int i, int i_6_) {
		try {
			int i_7_ = keyevent.getKeyCode();
			if (i_7_ != 0) {
				if (i_7_ >= 0 && i_7_ < anIntArray7999.length) {
					i_7_ = anIntArray7999[i_7_];
					if (0 == i && 0 != (i_7_ & 0x80))
						i_7_ = 0;
					else
						i_7_ &= ~0x80;
				} else
					i_7_ = 0;
			} else
				i_7_ = 0;
			if (i_7_ != 0) {
				method4127(i, '\uffff', i_7_, 1019032679);
				keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.c(").append(')').toString());
		}
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		try {
			method4128(keyevent, 0, -736620667);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.keyPressed(").append(')').toString());
		}
	}

	Class355_Sub1(Component component) {
		((Class355_Sub1) this).aClass471_7996 = new Class471();
		((Class355_Sub1) this).aBooleanArray7995 = new boolean[112];
		Class102.method1224(433580414);
		method4126(component, (byte) 1);
	}

	public synchronized void keyTyped(KeyEvent keyevent) {
		try {
			char c = keyevent.getKeyChar();
			if (c != '\uffff' && Class43.method586(c, -400649713)) {
				method4127(3, c, -1, 1019032679);
				keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.keyTyped(").append(')').toString());
		}
	}

	public void focusGained(FocusEvent focusevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.focusGained(").append(')').toString());
		}
	}

	int method4129(byte i) {
		try {
			int i_8_ = 0;
			if (((Class355_Sub1) this).aBooleanArray7995[81])
				i_8_ |= 0x1;
			if (((Class355_Sub1) this).aBooleanArray7995[82])
				i_8_ |= 0x4;
			if (((Class355_Sub1) this).aBooleanArray7995[86])
				i_8_ |= 0x2;
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.d(").append(')').toString());
		}
	}

	public void method4109() {
		method4130(1309565073);
	}

	public Interface18 method4111() {
		return (Interface18) ((Class355_Sub1) this).aClass471_7998.method5867((short) 8960);
	}

	public synchronized void method4116() {
		((Class355_Sub1) this).aClass471_7998.method5866(613065745);
		for (Class330_Sub33 class330_sub33 = (Class330_Sub33) ((Class355_Sub1) this).aClass471_7996.method5867((short) 8960); null != class330_sub33; class330_sub33 = (Class330_Sub33) ((Class355_Sub1) this).aClass471_7996.method5867((short) 8960)) {
			((Class330_Sub33) class330_sub33).anInt6644 = method4129((byte) -128) * 160262395;
			if (((Class330_Sub33) class330_sub33).anInt6645 * 353062173 == 0) {
				if (!((Class355_Sub1) this).aBooleanArray7995[(1773750945 * ((Class330_Sub33) class330_sub33).anInt6646)]) {
					Class330_Sub33 class330_sub33_9_ = new Class330_Sub33();
					((Class330_Sub33) class330_sub33_9_).anInt6645 = 0;
					((Class330_Sub33) class330_sub33_9_).aChar6649 = '\uffff';
					((Class330_Sub33) class330_sub33_9_).anInt6646 = ((Class330_Sub33) class330_sub33).anInt6646 * 1;
					((Class330_Sub33) class330_sub33_9_).aLong6648 = 1L * ((Class330_Sub33) class330_sub33).aLong6648;
					((Class330_Sub33) class330_sub33_9_).anInt6644 = 1 * ((Class330_Sub33) class330_sub33).anInt6644;
					((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33_9_, (short) 8192);
					((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)] = true;
				}
				((Class330_Sub33) class330_sub33).anInt6645 = -1115178390;
				((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
			} else if (((Class330_Sub33) class330_sub33).anInt6645 * 353062173 == 1) {
				if (((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)]) {
					((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
					((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)] = false;
				}
			} else if (-1 == (((Class330_Sub33) class330_sub33).anInt6645 * 353062173)) {
				for (int i = 0; i < 112; i++) {
					if (((Class355_Sub1) this).aBooleanArray7995[i]) {
						Class330_Sub33 class330_sub33_10_ = new Class330_Sub33();
						((Class330_Sub33) class330_sub33_10_).anInt6645 = -557589195;
						((Class330_Sub33) class330_sub33_10_).aChar6649 = '\uffff';
						((Class330_Sub33) class330_sub33_10_).anInt6646 = -1579083423 * i;
						((Class330_Sub33) class330_sub33_10_).aLong6648 = ((Class330_Sub33) class330_sub33).aLong6648 * 1L;
						((Class330_Sub33) class330_sub33_10_).anInt6644 = ((Class330_Sub33) class330_sub33).anInt6644 * 1;
						((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33_10_, (short) 8192);
						((Class355_Sub1) this).aBooleanArray7995[i] = false;
					}
				}
			} else if (((Class330_Sub33) class330_sub33).anInt6645 * 353062173 == 3)
				((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
		}
	}

	public synchronized void method4115() {
		((Class355_Sub1) this).aClass471_7998.method5866(613065745);
		for (Class330_Sub33 class330_sub33 = (Class330_Sub33) ((Class355_Sub1) this).aClass471_7996.method5867((short) 8960); null != class330_sub33; class330_sub33 = (Class330_Sub33) ((Class355_Sub1) this).aClass471_7996.method5867((short) 8960)) {
			((Class330_Sub33) class330_sub33).anInt6644 = method4129((byte) -7) * 160262395;
			if (((Class330_Sub33) class330_sub33).anInt6645 * 353062173 == 0) {
				if (!((Class355_Sub1) this).aBooleanArray7995[(1773750945 * ((Class330_Sub33) class330_sub33).anInt6646)]) {
					Class330_Sub33 class330_sub33_11_ = new Class330_Sub33();
					((Class330_Sub33) class330_sub33_11_).anInt6645 = 0;
					((Class330_Sub33) class330_sub33_11_).aChar6649 = '\uffff';
					((Class330_Sub33) class330_sub33_11_).anInt6646 = ((Class330_Sub33) class330_sub33).anInt6646 * 1;
					((Class330_Sub33) class330_sub33_11_).aLong6648 = 1L * ((Class330_Sub33) class330_sub33).aLong6648;
					((Class330_Sub33) class330_sub33_11_).anInt6644 = 1 * ((Class330_Sub33) class330_sub33).anInt6644;
					((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33_11_, (short) 8192);
					((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)] = true;
				}
				((Class330_Sub33) class330_sub33).anInt6645 = -1115178390;
				((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
			} else if (((Class330_Sub33) class330_sub33).anInt6645 * 353062173 == 1) {
				if (((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)]) {
					((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
					((Class355_Sub1) this).aBooleanArray7995[(((Class330_Sub33) class330_sub33).anInt6646 * 1773750945)] = false;
				}
			} else if (-1 == (((Class330_Sub33) class330_sub33).anInt6645 * 353062173)) {
				for (int i = 0; i < 112; i++) {
					if (((Class355_Sub1) this).aBooleanArray7995[i]) {
						Class330_Sub33 class330_sub33_12_ = new Class330_Sub33();
						((Class330_Sub33) class330_sub33_12_).anInt6645 = -557589195;
						((Class330_Sub33) class330_sub33_12_).aChar6649 = '\uffff';
						((Class330_Sub33) class330_sub33_12_).anInt6646 = -1579083423 * i;
						((Class330_Sub33) class330_sub33_12_).aLong6648 = ((Class330_Sub33) class330_sub33).aLong6648 * 1L;
						((Class330_Sub33) class330_sub33_12_).anInt6644 = ((Class330_Sub33) class330_sub33).anInt6644 * 1;
						((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33_12_, (short) 8192);
						((Class355_Sub1) this).aBooleanArray7995[i] = false;
					}
				}
			} else if (((Class330_Sub33) class330_sub33).anInt6645 * 353062173 == 3)
				((Class355_Sub1) this).aClass471_7998.method5878(class330_sub33, (short) 8192);
		}
	}

	public void method4113() {
		method4130(1046217439);
	}

	void method4130(int i) {
		try {
			if (((Class355_Sub1) this).aComponent7997 != null) {
				((Class355_Sub1) this).aComponent7997.removeKeyListener(this);
				((Class355_Sub1) this).aComponent7997.removeFocusListener(this);
				((Class355_Sub1) this).aComponent7997 = null;
				for (int i_13_ = 0; i_13_ < 112; i_13_++)
					((Class355_Sub1) this).aBooleanArray7995[i_13_] = false;
				((Class355_Sub1) this).aClass471_7998.method5866(613065745);
				((Class355_Sub1) this).aClass471_7996.method5866(613065745);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.x(").append(')').toString());
		}
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		try {
			method4128(keyevent, 1, -155170632);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.keyReleased(").append(')').toString());
		}
	}

	static final void method4131(int i, int i_14_) {
		try {
			if (Class397_Sub1.method4681(i, null, -1532244766))
				Class330.method3255((Class3.aClass120Array56[i].aClass114Array1400), -1, (byte) 107);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aez.lr(").append(')').toString());
		}
	}
}
