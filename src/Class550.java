/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class550 {
	public static String processorName;
	public static String OSName;
	static int anInt6288;
	static int anInt6289;

	Class550() throws Throwable {
		throw new Error();
	}

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		OSName = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		processorName = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}

	static void method6364(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_0_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			Class537 class537 = Class301.aClass543_3059.method6339(i_1_, -427810018);
			if (class537.method6321((byte) -8)) {
				String string = class537.aString6236;
				if (i_0_ == -1)
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = string;
				else
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = Class131.aClass407_1502.method4752(i_0_, -1251902841).method4634(i_1_, string, -443192170);
			} else {
				int i_2_ = class537.anInt6235 * -735399997;
				if (i_0_ == -1)
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = i_2_;
				else
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class131.aClass407_1502.method4752(i_0_, -1524386741).method4642(i_1_, i_2_, 1695370655);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wt.y(").append(')').toString());
		}
	}
}
