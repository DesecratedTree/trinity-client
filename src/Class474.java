/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class474 implements Iterator {
	Class471 aClass471_5696;
	Class330 aClass330_5697;
	Class330 aClass330_5698 = null;

	void method5915(int i) {
		try {
			((Class474) this).aClass330_5697 = (((Class474) this).aClass471_5696.aClass330_5611.aClass330_3340);
			((Class474) this).aClass330_5698 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.z(").append(')').toString());
		}
	}

	public Object next() {
		try {
			Class330 class330 = ((Class474) this).aClass330_5697;
			if (((Class474) this).aClass471_5696.aClass330_5611 == class330) {
				class330 = null;
				((Class474) this).aClass330_5697 = null;
			} else
				((Class474) this).aClass330_5697 = class330.aClass330_3340;
			((Class474) this).aClass330_5698 = class330;
			return class330;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.next(").append(')').toString());
		}
	}

	public boolean hasNext() {
		try {
			return (((Class474) this).aClass330_5697 != ((Class474) this).aClass471_5696.aClass330_5611);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.hasNext(").append(')').toString());
		}
	}

	public void remove() {
		try {
			if (null == ((Class474) this).aClass330_5698)
				throw new IllegalStateException();
			((Class474) this).aClass330_5698.method3252(1095534198);
			((Class474) this).aClass330_5698 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.remove(").append(')').toString());
		}
	}

	public Class474(Class471 class471) {
		((Class474) this).aClass471_5696 = class471;
		((Class474) this).aClass330_5697 = ((Class474) this).aClass471_5696.aClass330_5611.aClass330_3340;
		((Class474) this).aClass330_5698 = null;
	}

	public Class330 method5916(int i) {
		try {
			method5915(-82060898);
			return (Class330) next();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.w(").append(')').toString());
		}
	}

	public void method5917(Class471 class471, int i) {
		try {
			((Class474) this).aClass471_5696 = class471;
			((Class474) this).aClass330_5697 = (((Class474) this).aClass471_5696.aClass330_5611.aClass330_3340);
			((Class474) this).aClass330_5698 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.f(").append(')').toString());
		}
	}

	static final void method5918(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class545.method6347(1079239502);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.aff(").append(')').toString());
		}
	}

	static final void method5919(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 1522181389 * client.windowPaneId;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.anc(").append(')').toString());
		}
	}

	public static int method5920(int i) {
		try {
			return Class119.anInt1395 * 1650365049;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.f(").append(')').toString());
		}
	}

	public static void method5921(int i, short i_0_) {
		try {
			if (-296919301 * client.anInt8995 == 14) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2560, client.aClass1_9060.aClass488_22, -528813174);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i, (byte) 68);
				client.aClass1_9060.method378(class330_sub34, -1708316307);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tq.s(").append(')').toString());
		}
	}
}
