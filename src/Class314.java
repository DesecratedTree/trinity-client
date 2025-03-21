/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class314 {
	static int anInt3251 = 3;
	public static int anInt3252 = 1;
	static int anInt3253 = 2;
	static int anInt3254 = 0;
	static String aString3255;
	public static IndexTable aClass280_3256;

	Class314() throws Throwable {
		throw new Error();
	}

	static void method3119(byte i) {
		try {
			if (null != Class215.aFileOutputStream2086) {
				try {
					Class215.aFileOutputStream2086.close();
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			Class215.aFileOutputStream2086 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nb.o(").append(')').toString());
		}
	}

	static final void method3120(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1264 * 479023813;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nb.qm(").append(')').toString());
		}
	}

	static final void method3121(Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (client.aBoolean9198) {
				try {
					Class232.aClass232_2460.method2355(new Object[] { string }, -774363616);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nb.apj(").append(')').toString());
		}
	}
}
