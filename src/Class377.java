/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;

public class Class377 {
	public static Class377 aClass377_3934 = new Class377(0);
	public static Class377 aClass377_3935 = new Class377(1);
	public static Class377 aClass377_3936 = new Class377(2);

	Class377(int i) {
		/* empty */
	}

	static final void method4370(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class337.method3950(iComponentDefinitions, class120, class430, 1237899383);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pr.nc(").append(')').toString());
		}
	}

	static final void method4371(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			boolean bool = Class394.aClient4082.method3880(new File(string), 1028025223);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pr.agz(").append(')').toString());
		}
	}

	static final void method4372(Class430 class430, int i) throws Exception_Sub4 {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_0_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			Class401_Sub1.aClass145_Sub1_8249.method1682((float) i_0_, (float) i_1_, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pr.ahc(").append(')').toString());
		}
	}

	static final void method4373(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1243 * 1080667159;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pr.ph(").append(')').toString());
		}
	}

	static final void method4374(Class430 class430, byte i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub29_7903, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) != 0 ? 1 : 0, -47477687);
			Class435.method5568(1278809449);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pr.akm(").append(')').toString());
		}
	}

	public static void method4375(Canvas canvas, int i) {
		try {
			try {
				Class var_class = Class.forName("java.awt.Canvas");
				Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
				method.invoke(canvas, new Object[] { Boolean.TRUE });
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pr.ap(").append(')').toString());
		}
	}

	public static final void method4376(int i, int i_2_) {
		try {
			if (Class106.aClass330_Sub39_1009 != null && (i >= 0 && i < (Class106.aClass330_Sub39_1009.anInt7760 * -576053059))) {
				Class153 class153 = Class106.aClass330_Sub39_1009.aClass153Array7759[i];
				if (-1 == class153.aByte1632) {
					Class1 class1 = Class426.method5317(2128738654);
					Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2484, class1.aClass488_22, -75396883);
					class330_sub34.aClass330_Sub46_Sub2_7729.addByte(2 + Class57.method659(class153.aString1633, -1333763837), (byte) 50);
					class330_sub34.aClass330_Sub46_Sub2_7729.addShort(i, (byte) 97);
					class330_sub34.aClass330_Sub46_Sub2_7729.addString(class153.aString1633, (byte) -13);
					class1.method378(class330_sub34, -503865983);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pr.mm(").append(')').toString());
		}
	}
}
