/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class18 {
	static int anInt230;
	static Class211 aClass211_231;
	static int anInt232;
	static Class195 aClass195_233;
	static int anInt234;
	static Class87 aClass87_235;
	static Class524 aClass524_236;
	static String aString237;
	static int anInt238;

	Class18() throws Throwable {
		throw new Error();
	}

	public static void method452(int musicId, int volume, int delay, int i_2_) {
		try {
			if (null != Class333.aClass106_3352 && Class333.aClass106_3352.method1318(-1442034309) && -943311587 * Class333.aClass106_3352.anInt1007 == musicId) {
				Class315_Sub1.method3142(Class333.aClass106_3352, volume, 103871697);
				Class333.musicId = -1299321823 * musicId;
				Class333.aClass106_3352 = null;
				Class333.aClass330_Sub40_Sub2_3355 = null;
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2516, client.aClass1_9025.aClass488_22, 294710162);
				class330_sub34.aClass330_Sub46_Sub2_7729.addInt(-1, 1965508160);
				client.aClass1_9025.method378(class330_sub34, -16143513);
			} else {
				volume = volume * Class448.aClass330_Sub50_5555.aClass464_Sub30_7898.method5841(-2026607593) >> 8;
				if (musicId == -1 && !Class333.aBoolean3354)
					Class365.method4271(-1759134545);
				else if (-1 != musicId && (-1686333471 * Class333.musicId != musicId || !Class416.method5259((byte) 7)) && 0 != volume && !Class333.aBoolean3354) {
					Class276.method2730(delay, Class89.aClass280_735, musicId, 0, volume, false, new Class111_Sub1(), 77784715);
					Class479.method6014(-1695091035);
				}
				if (musicId != -1686333471 * Class333.musicId)
					Class333.aClass330_Sub40_Sub2_3355 = null;
				Class333.musicId = musicId * -1299321823;
				Class333.aClass326_3363 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("as.c(").append(')').toString());
		}
	}

	static final void method453(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub4_7883, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), 291056700);
			Class435.method5568(1339202391);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("as.akj(").append(')').toString());
		}
	}
}
