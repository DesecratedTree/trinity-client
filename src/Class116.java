/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class116 {
	int anInt1365;
	int anInt1366;
	int anInt1367;
	int anInt1368;
	int anInt1369;
	byte[] aByteArray1370;
	int anInt1371;
	int anInt1372;
	byte[] aByteArray1373;
	static int anInt1374;
	public static String aString1375;
	static Class61 aClass61_1376;

	Class116() {
		/* empty */
	}

	static final void method1416(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_0_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			if (-1 == i_0_ && i_1_ == -1)
				iComponentDefinitions.aClass114_1252 = null;
			else
				iComponentDefinitions.aClass114_1252 = Class166.method1993(i_0_, i_1_, 534399539);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("er.iv(").append(')').toString());
		}
	}

	static final void method1417(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			i_2_--;
			if (null == iComponentDefinitions.aStringArray1284 || i_2_ >= iComponentDefinitions.aStringArray1284.length || null == iComponentDefinitions.aStringArray1284[i_2_])
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = iComponentDefinitions.aStringArray1284[i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("er.qt(").append(')').toString());
		}
	}

	static final long method1418(int i) {
		try {
			return ((long) ((Class428.anInt4361 += 1700633253) * 1205910829 - 1) << 32 | 0xffffffffL);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("er.qd(").append(')').toString());
		}
	}

	static int method1419(int i, int i_3_, int i_4_) {
		try {
			if (-344921723 * Class476.aClass476_6879.anInt6882 == i || -344921723 * Class476.aClass476_6881.anInt6882 == i)
				return Class432_Sub1_Sub5_Sub2.anIntArray9979[i_3_ & 0x3];
			return Class432_Sub1_Sub5_Sub2.anIntArray9978[i_3_ & 0x3];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("er.bs(").append(')').toString());
		}
	}

	static final void method1420(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) (Class401.method4717(i_5_, 2029181306) / 60000L);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("er.amo(").append(')').toString());
		}
	}

	static final void method1421(Class430 class430, short i) {
		try {
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_6_, -1168919348);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.aBoolean1215 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("er.rv(").append(')').toString());
		}
	}
}
