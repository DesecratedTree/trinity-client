/* Class330_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class330_Sub15 extends Class330 {
	String aString7609;
	int anInt7610;

	Class330_Sub15() {
		/* empty */
	}

	public static Class357 method3320(Socket socket, int i, int i_0_) throws IOException {
		try {
			return new Class357_Sub1(socket, i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acu.r(").append(')').toString());
		}
	}

	static final void method3321(Class430 class430, int i) {
		try {
			if (-274974253 * client.anInt9125 >= 5 && client.anInt9125 * -274974253 <= 9)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acu.ue(").append(')').toString());
		}
	}
}
