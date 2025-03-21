/* Class452 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class452 {
	static int[] anIntArray5557;
	static char[] aCharArray5558;
	static char[] aCharArray5559 = new char[64];
	public static int anInt5560;
	public static int anInt5561;

	static {
		for (int i = 0; i < 26; i++)
			aCharArray5559[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray5559[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5559[i] = (char) (48 + i - 52);
		aCharArray5559[62] = '+';
		aCharArray5559[63] = '/';
		aCharArray5558 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray5558[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray5558[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray5558[i] = (char) (48 + i - 52);
		aCharArray5558[62] = '*';
		aCharArray5558[63] = '-';
		anIntArray5557 = new int[128];
		for (int i = 0; i < anIntArray5557.length; i++)
			anIntArray5557[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray5557[i] = i - 65;
		for (int i = 97; i <= 122; i++)
			anIntArray5557[i] = i - 97 + 26;
		for (int i = 48; i <= 57; i++)
			anIntArray5557[i] = i - 48 + 52;
		int[] is = anIntArray5557;
		anIntArray5557[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray5557;
		anIntArray5557[47] = 63;
		is_0_[45] = 63;
	}

	Class452() throws Throwable {
		throw new Error();
	}

	public static Class435 method5635(int i, int i_1_) {
		try {
			Class435[] class435s = InputStream_Sub1.method338((byte) 108);
			for (int i_2_ = 0; i_2_ < class435s.length; i_2_++) {
				Class435 class435 = class435s[i_2_];
				if (i == class435.anInt4417 * -1358018753)
					return class435;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ss.j(").append(')').toString());
		}
	}

	static final void method5636(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean9150 ? 1 : 0;
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = null == client.aString9154 ? "" : client.aString9154;
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = client.aString9152 == null ? "" : client.aString9152;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ss.vc(").append(')').toString());
		}
	}

	static void method5637(long l) {
		try {
			Class528.aCalendar6215.setTime(new Date(l));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ss.f(").append(')').toString());
		}
	}
}
