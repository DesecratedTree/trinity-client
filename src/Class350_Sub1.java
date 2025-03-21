/* Class350_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class350_Sub1 extends Class350 implements MouseListener, MouseMotionListener, MouseWheelListener {
	int anInt7963;
	static int anInt7964 = 2;
	static int anInt7965 = 4;
	Class471 aClass471_7966;
	static int anInt7967 = 1;
	int anInt7968;
	int anInt7969;
	Class471 aClass471_7970 = new Class471();
	int anInt7971;
	int anInt7972;
	int anInt7973;
	Component aComponent7974;
	boolean aBoolean7975;

	public int method4031(short i) {
		try {
			return -443037963 * ((Class350_Sub1) this).anInt7973;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.w(").append(')').toString());
		}
	}

	public boolean method4027(int i) {
		try {
			return (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x1) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.p(").append(')').toString());
		}
	}

	void method4062(int i) {
		try {
			if (null != ((Class350_Sub1) this).aComponent7974) {
				((Class350_Sub1) this).aComponent7974.removeMouseWheelListener(this);
				((Class350_Sub1) this).aComponent7974.removeMouseMotionListener(this);
				((Class350_Sub1) this).aComponent7974.removeMouseListener(this);
				((Class350_Sub1) this).aComponent7974 = null;
				((Class350_Sub1) this).anInt7968 = 0;
				((Class350_Sub1) this).anInt7973 = 0;
				((Class350_Sub1) this).anInt7969 = 0;
				((Class350_Sub1) this).anInt7972 = 0;
				((Class350_Sub1) this).anInt7971 = 0;
				((Class350_Sub1) this).anInt7963 = 0;
				((Class350_Sub1) this).aClass471_7970 = null;
				((Class350_Sub1) this).aClass471_7966 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.ak(").append(')').toString());
		}
	}

	public synchronized void method4035() {
		((Class350_Sub1) this).anInt7969 = -980891725 * ((Class350_Sub1) this).anInt7963;
		((Class350_Sub1) this).anInt7973 = -1703741239 * ((Class350_Sub1) this).anInt7971;
		((Class350_Sub1) this).anInt7968 = ((Class350_Sub1) this).anInt7972 * -427392961;
		Class471 class471 = ((Class350_Sub1) this).aClass471_7970;
		((Class350_Sub1) this).aClass471_7970 = ((Class350_Sub1) this).aClass471_7966;
		((Class350_Sub1) this).aClass471_7966 = class471;
		((Class350_Sub1) this).aClass471_7966.method5866(613065745);
	}

	void method4063(int i, int i_0_, int i_1_) {
		try {
			((Class350_Sub1) this).anInt7963 = i * 1518341525;
			((Class350_Sub1) this).anInt7971 = i_0_ * 2015278581;
			if (((Class350_Sub1) this).aBoolean7975)
				method4065(-1, i, i_0_, 0, -1666334633);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.az(").append(')').toString());
		}
	}

	public Class330_Sub44 method4032(byte i) {
		try {
			return (Class330_Sub44) ((Class350_Sub1) this).aClass471_7970.method5867((short) 8960);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.n(").append(')').toString());
		}
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
		try {
			int i = method4064(mouseevent, -1245575629);
			if (1 == i)
				method4065(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1666334633);
			else if (4 == i)
				method4065(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1666334633);
			else if (2 == i)
				method4065(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1666334633);
			((Class350_Sub1) this).anInt7972 = -313456467 * (55417637 * ((Class350_Sub1) this).anInt7972 | i);
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mousePressed(").append(')').toString());
		}
	}

	public boolean method4029(byte i) {
		try {
			return (1825885083 * ((Class350_Sub1) this).anInt7968 & 0x4) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.s(").append(')').toString());
		}
	}

	public int method4030(int i) {
		try {
			return ((Class350_Sub1) this).anInt7969 * 1886663887;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.z(").append(')').toString());
		}
	}

	public int method4050() {
		return ((Class350_Sub1) this).anInt7969 * 1886663887;
	}

	public void method4033(byte i) {
		try {
			method4062(-1989131877);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.l(").append(')').toString());
		}
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
		try {
			method4063(mouseevent.getX(), mouseevent.getY(), -2103942339);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mouseEntered(").append(')').toString());
		}
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
		try {
			method4063(mouseevent.getX(), mouseevent.getY(), 947921424);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mouseExited(").append(')').toString());
		}
	}

	int method4064(MouseEvent mouseevent, int i) {
		try {
			if (mouseevent.getButton() == 1) {
				if (mouseevent.isMetaDown())
					return 4;
				return 1;
			}
			if (mouseevent.getButton() == 2)
				return 2;
			if (mouseevent.getButton() == 3)
				return 4;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.ah(").append(')').toString());
		}
	}

	public boolean method4049(int i) {
		try {
			return 0 != (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x2);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.o(").append(')').toString());
		}
	}

	public synchronized void mouseReleased(MouseEvent mouseevent) {
		try {
			int i = method4064(mouseevent, 1737727189);
			if ((((Class350_Sub1) this).anInt7972 * 55417637 & i) == 0)
				i = 55417637 * ((Class350_Sub1) this).anInt7972;
			if ((i & 0x1) != 0)
				method4065(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1666334633);
			if ((i & 0x4) != 0)
				method4065(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1666334633);
			if ((i & 0x2) != 0)
				method4065(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1666334633);
			((Class350_Sub1) this).anInt7972 = (55417637 * ((Class350_Sub1) this).anInt7972 & (i ^ 0xffffffff)) * -313456467;
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mouseReleased(").append(')').toString());
		}
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
		try {
			method4063(mouseevent.getX(), mouseevent.getY(), 2030071356);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mouseDragged(").append(')').toString());
		}
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
		try {
			method4063(mouseevent.getX(), mouseevent.getY(), -222994134);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mouseMoved(").append(')').toString());
		}
	}

	public boolean method4034() {
		return (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x1) != 0;
	}

	public synchronized void method4039(byte i) {
		try {
			((Class350_Sub1) this).anInt7969 = -980891725 * ((Class350_Sub1) this).anInt7963;
			((Class350_Sub1) this).anInt7973 = -1703741239 * ((Class350_Sub1) this).anInt7971;
			((Class350_Sub1) this).anInt7968 = ((Class350_Sub1) this).anInt7972 * -427392961;
			Class471 class471 = ((Class350_Sub1) this).aClass471_7970;
			((Class350_Sub1) this).aClass471_7970 = ((Class350_Sub1) this).aClass471_7966;
			((Class350_Sub1) this).aClass471_7966 = class471;
			((Class350_Sub1) this).aClass471_7966.method5866(613065745);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.i(").append(')').toString());
		}
	}

	public synchronized void method4053() {
		((Class350_Sub1) this).anInt7969 = -980891725 * ((Class350_Sub1) this).anInt7963;
		((Class350_Sub1) this).anInt7973 = -1703741239 * ((Class350_Sub1) this).anInt7971;
		((Class350_Sub1) this).anInt7968 = ((Class350_Sub1) this).anInt7972 * -427392961;
		Class471 class471 = ((Class350_Sub1) this).aClass471_7970;
		((Class350_Sub1) this).aClass471_7970 = ((Class350_Sub1) this).aClass471_7966;
		((Class350_Sub1) this).aClass471_7966 = class471;
		((Class350_Sub1) this).aClass471_7966.method5866(613065745);
	}

	public synchronized void method4037() {
		((Class350_Sub1) this).anInt7969 = -980891725 * ((Class350_Sub1) this).anInt7963;
		((Class350_Sub1) this).anInt7973 = -1703741239 * ((Class350_Sub1) this).anInt7971;
		((Class350_Sub1) this).anInt7968 = ((Class350_Sub1) this).anInt7972 * -427392961;
		Class471 class471 = ((Class350_Sub1) this).aClass471_7970;
		((Class350_Sub1) this).aClass471_7970 = ((Class350_Sub1) this).aClass471_7966;
		((Class350_Sub1) this).aClass471_7966 = class471;
		((Class350_Sub1) this).aClass471_7966.method5866(613065745);
	}

	public synchronized void method4038() {
		((Class350_Sub1) this).anInt7969 = -980891725 * ((Class350_Sub1) this).anInt7963;
		((Class350_Sub1) this).anInt7973 = -1703741239 * ((Class350_Sub1) this).anInt7971;
		((Class350_Sub1) this).anInt7968 = ((Class350_Sub1) this).anInt7972 * -427392961;
		Class471 class471 = ((Class350_Sub1) this).aClass471_7970;
		((Class350_Sub1) this).aClass471_7970 = ((Class350_Sub1) this).aClass471_7966;
		((Class350_Sub1) this).aClass471_7966 = class471;
		((Class350_Sub1) this).aClass471_7966.method5866(613065745);
	}

	public boolean method4048() {
		return (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x1) != 0;
	}

	public boolean method4040() {
		return (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x1) != 0;
	}

	public boolean method4041() {
		return (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x1) != 0;
	}

	public boolean method4036() {
		return (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x1) != 0;
	}

	public boolean method4044() {
		return (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x1) != 0;
	}

	Class350_Sub1(Component component, boolean bool) {
		((Class350_Sub1) this).aClass471_7966 = new Class471();
		method4066(component, 2127022450);
		((Class350_Sub1) this).aBoolean7975 = bool;
	}

	public boolean method4046() {
		return 0 != (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x2);
	}

	public boolean method4047() {
		return 0 != (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x2);
	}

	public boolean method4043() {
		return (1825885083 * ((Class350_Sub1) this).anInt7968 & 0x4) != 0;
	}

	public int method4042() {
		return ((Class350_Sub1) this).anInt7969 * 1886663887;
	}

	public Class330_Sub44 method4052() {
		return (Class330_Sub44) ((Class350_Sub1) this).aClass471_7970.method5867((short) 8960);
	}

	public Class330_Sub44 method4028() {
		return (Class330_Sub44) ((Class350_Sub1) this).aClass471_7970.method5867((short) 8960);
	}

	public void method4051() {
		method4062(-695949486);
	}

	void method4065(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			Class330_Sub44_Sub2 class330_sub44_sub2 = (Class432_Sub1_Sub4_Sub2.method5544(i, i_2_, i_3_, Class312.method3111((byte) 85), i_4_, -588167741));
			((Class350_Sub1) this).aClass471_7966.method5878(class330_sub44_sub2, (short) 8192);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.ag(").append(')').toString());
		}
	}

	public void method4056() {
		method4062(-304039060);
	}

	public void method4057() {
		method4062(-660577300);
	}

	public synchronized void mouseClicked(MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mouseClicked(").append(')').toString());
		}
	}

	public void method4055() {
		method4062(-311964972);
	}

	void method4066(Component component, int i) {
		try {
			method4062(-805395816);
			((Class350_Sub1) this).aComponent7974 = component;
			((Class350_Sub1) this).aComponent7974.addMouseListener(this);
			((Class350_Sub1) this).aComponent7974.addMouseMotionListener(this);
			((Class350_Sub1) this).aComponent7974.addMouseWheelListener(this);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.ab(").append(')').toString());
		}
	}

	public boolean method4045() {
		return 0 != (((Class350_Sub1) this).anInt7968 * 1825885083 & 0x2);
	}

	public int method4058() {
		return -443037963 * ((Class350_Sub1) this).anInt7973;
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		try {
			int i = mousewheelevent.getX();
			int i_6_ = mousewheelevent.getY();
			int i_7_ = mousewheelevent.getWheelRotation();
			method4065(6, i, i_6_, i_7_, -1666334633);
			mousewheelevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.mouseWheelMoved(").append(')').toString());
		}
	}

	static final void method4067(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub7_7891.method5759((byte) -7) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aes.aqx(").append(')').toString());
		}
	}
}
