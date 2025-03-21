/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class370 implements Interface23 {
	IndexTable aClass280_6767;
	public static int anInt6768 = 64;
	Class367 aClass367_6769 = new Class367(64);
	public static Class268 aClass268_6770;
	public static boolean aBoolean6771;

	public Class382 method4312(int i, byte i_0_) {
		try {
			Class382 class382;
			synchronized (((Class370) this).aClass367_6769) {
				class382 = (Class382) ((Class370) this).aClass367_6769.get((long) i);
			}
			if (null != class382)
				return class382;
			byte[] is;
			synchronized (((Class370) this).aClass280_6767) {
				is = (((Class370) this).aClass280_6767.getFile(Class103.aClass103_938.method1228(i, -934693615), Class103.aClass103_938.method1227(i, (byte) 5)));
			}
			class382 = new Class382();
			if (null != is)
				class382.method4404(new Buffer(is), 574694921);
			synchronized (((Class370) this).aClass367_6769) {
				((Class370) this).aClass367_6769.put(class382, (long) i);
			}
			return class382;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pk.r(").append(')').toString());
		}
	}

	public void method4313(int i) {
		try {
			synchronized (((Class370) this).aClass367_6769) {
				((Class370) this).aClass367_6769.method4298((byte) 60);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pk.j(").append(')').toString());
		}
	}

	public void method4314(int i, int i_1_) {
		try {
			synchronized (((Class370) this).aClass367_6769) {
				((Class370) this).aClass367_6769.method4292(i, (byte) 66);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pk.i(").append(')').toString());
		}
	}

	public void method4315(byte i) {
		try {
			synchronized (((Class370) this).aClass367_6769) {
				((Class370) this).aClass367_6769.method4296(264903264);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pk.p(").append(')').toString());
		}
	}

	public Class370(Class435 class435, Class454 class454, IndexTable class280) {
		((Class370) this).aClass280_6767 = class280;
		if (((Class370) this).aClass280_6767 != null) {
			int i = ((Class370) this).aClass280_6767.method2764(1385616754) - 1;
			Class103.aClass103_938.method1226((byte) 0);
			((Class370) this).aClass280_6767.method2763(i, -2032717100);
		}
	}

	public void method4316(int i, byte i_2_) {
		try {
			synchronized (((Class370) this).aClass367_6769) {
				((Class370) this).aClass367_6769.method4298((byte) 25);
				((Class370) this).aClass367_6769 = new Class367(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pk.o(").append(')').toString());
		}
	}

	static final void method4317(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean8961 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pk.amg(").append(')').toString());
		}
	}

	public static void method4318(Class356 class356, Class_ra class_ra, int i) {
		try {
			Iterator iterator = Class391.aList4056.iterator();
			while (iterator.hasNext()) {
				Class388 class388 = (Class388) iterator.next();
				if (((Class388) class388).aBoolean4003)
					class388.method4567(class356, class_ra);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pk.i(").append(')').toString());
		}
	}
}
