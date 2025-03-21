/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class5 {
	static String[] aStringArray68;
	static int anInt69;
	static boolean aBoolean70;
	static int anInt71 = 0;
	static int anInt72;
	static String aString73;
	static long aLong74;
	static int anInt75;
	static int anInt76;
	static int anInt77 = 0;
	static int anInt78 = 350;
	static int anInt79;
	static String aString80 = "\\/.:, _-+[]~@";
	static String aString81 = "Success";
	static String aString82 = "Failure";

	static {
		aString73 = "";
		anInt72 = 0;
		anInt76 = 0;
		anInt75 = 0;
		aBoolean70 = false;
		anInt79 = -1934803477;
	}

	Class5() throws Throwable {
		throw new Error();
	}

	static final void method398(Class430 class430, int i) {
		try {
			boolean bool = false;
			String string = "";
			if (null != ((Class430) class430).aClass19_4381 && ((Class430) class430).aClass19_4381.method454(-780346076)) {
				File file = ((Class430) class430).aClass19_4381.method455(1867432488);
				if (null != file) {
					string = file.getPath();
					if (null == string)
						string = "";
				}
				bool = true;
				((Class430) class430).aClass19_4381 = null;
			}
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("af.agr(").append(')').toString());
		}
	}

	static final void method399(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_0_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_1_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 2]);
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 3]);
			Class381 class381 = client.aClass304_9030.method3022(1698033768);
			Class102.method1223(((i_0_ >> 14 & 0x3fff) - -1261027839 * class381.gameSceneBaseX), ((i_0_ & 0x3fff) - -1542584207 * class381.gameSceneBaseY), i_1_ << 2, i_2_, i_3_, -1397321747);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("af.agl(").append(')').toString());
		}
	}

	static final void method400(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class439.method5599(iComponentDefinitions, class120, true, 0, class430, (byte) -42);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("af.he(").append(')').toString());
		}
	}
}
