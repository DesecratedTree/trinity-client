/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public abstract class Class487 {
	int anInt5826;
	String aString5827;

	Class487() {
		/* empty */
	}

	Socket method6033(short i) throws IOException {
		try {
			return new Socket(((Class487) this).aString5827, ((Class487) this).anInt5826 * 1320395777);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ud.i(").append(')').toString());
		}
	}

	public abstract Socket method6034() throws IOException;

	public abstract Socket method6035() throws IOException;

	public abstract Socket method6036(int i) throws IOException;

	static void method6037(int i, int i_0_, int i_1_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(15, 0L);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = 229745735 * i;
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626 = 1924827181 * i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ud.ao(").append(')').toString());
		}
	}
}
