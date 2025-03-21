/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class50 {
	static boolean aBoolean479 = false;
	static Class145_Sub1 aClass145_Sub1_480;
	static int anInt481;
	static Class388[] aClass388Array482;

	Class50() throws Throwable {
		throw new Error();
	}

	static String method627(Class330_Sub36_Sub10 class330_sub36_sub10, int i) {
		try {
			if ((((Class330_Sub36_Sub10) class330_sub36_sub10).aString9700 == null) || ((Class330_Sub36_Sub10) class330_sub36_sub10).aString9700.length() == 0) {
				if (null != (((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693) && ((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693.length() > 0)
					return new StringBuilder().append(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9689).append(Class526.aClass526_6173.method6257(Class429.aClass454_4369, 991479434)).append(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693).toString();
				return (((Class330_Sub36_Sub10) class330_sub36_sub10).aString9689);
			}
			if ((null != ((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693) && ((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693.length() > 0)
				return new StringBuilder().append(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9689).append(Class526.aClass526_6173.method6257(Class429.aClass454_4369, 991479434)).append(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693).append(Class526.aClass526_6173.method6257(Class429.aClass454_4369, 991479434)).append(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9700).toString();
			return new StringBuilder().append(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9689).append(Class526.aClass526_6173.method6257(Class429.aClass454_4369, 991479434)).append(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9700).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("c.bs(").append(')').toString());
		}
	}

	static final void method628(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class162.method1912(iComponentDefinitions, class120, class430, -27406819);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("c.ip(").append(')').toString());
		}
	}

	static final void method629(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class439.method5597(i_0_, string, -444003);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("c.sa(").append(')').toString());
		}
	}

	static final void method630(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class430.method5334(-2029779553);
			if (class330_sub36_sub12 != null) {
				boolean bool = class330_sub36_sub12.method3482(i_1_ >> 14 & 0x3fff, i_1_ & 0x3fff, Class428.anIntArray4354, -1763311158);
				if (bool) {
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class428.anIntArray4354[1];
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class428.anIntArray4354[2];
				} else {
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
				}
			} else {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("c.aef(").append(')').toString());
		}
	}

	public static synchronized void method631(byte[] is, byte i) {
		try {
			if (is.length == 100 && -1838000653 * Class439.anInt4449 < 1000)
				Class439.aByteArrayArray4452[(Class439.anInt4449 += -2086122693) * -1838000653 - 1] = is;
			else if (5000 == is.length && -531209371 * Class439.anInt4450 < 250)
				Class439.aByteArrayArray4453[(Class439.anInt4450 += 497620589) * -531209371 - 1] = is;
			else if (30000 == is.length && -2049862237 * Class439.anInt4451 < 50)
				Class439.aByteArrayArray4454[(Class439.anInt4451 += -740538869) * -2049862237 - 1] = is;
			else if (Class125.aByteArrayArrayArray1459 != null) {
				for (int i_2_ = 0; i_2_ < Class458.anIntArray5565.length; i_2_++) {
					if (Class458.anIntArray5565[i_2_] == is.length && (Class11.anIntArray167[i_2_] < (Class125.aByteArrayArrayArray1459[i_2_]).length)) {
						Class125.aByteArrayArrayArray1459[i_2_][Class11.anIntArray167[i_2_]++] = is;
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("c.i(").append(')').toString());
		}
	}

	public static final void method632(boolean bool, byte i) {
		try {
			if (!bool) {
				Class141.aClass418_1566.method5269((byte) -2);
				Class478.aClass499_5725.method6114(7779524);
				Class425.aClass169_4344.method2030(-2133548007);
				client.aClass304_9030.method3025((byte) 13).method5711(-2118110760);
				Class158_Sub3.aClass553_8875.method6388((byte) 10);
				Class556.aClass510_6392.method6170(-1390004513);
				Class201.aClass436_6511.method5573((short) 12036);
				Class136.aClass416_1527.method5253((short) 16384);
				Class428.aClass370_4364.method4313(-881606695);
				Class366_Sub4.aClass231_8007.method2347(-790480994);
				Class499.aClass495_5893.method6087(381824725);
				Class95_Sub10.aClass447_7170.method5624((byte) -30);
				Class95_Sub7.aClass536_7157.method6316(1447328757);
				Class128.aClass400_1478.method4698((byte) -12);
				Class102.aClass362_924.method4253(952454466);
				Class497.aClass552_5884.method6386((byte) 0);
				Class79.aClass380_666.method4388(-743539257);
				Class301.aClass543_3059.method6340(-2117651220);
				Class341.aClass342_3397.method3983(-801864245);
				Class446.aClass131_5549.method1558(2132872372);
				Class233.aClass519_2467.method6219((byte) 48);
				Class363.aClass527_3806.method6265((byte) -41);
				Class142.aClass368_1568.method4306((short) 18023);
				OutgoingPacket.aClass341_2578.method3973((byte) 0);
				Class318.method3158(-1760540255);
				Class288.method2888(-1171187561);
				Class219.aClass230_2183.method2334(-971428498);
				Class385.method4428(-1988570715);
				if (Class404.aClass457_4162 != Class457.aClass457_6834) {
					for (int i_3_ = 0; i_3_ < Class230.aByteArrayArray2447.length; i_3_++)
						Class230.aByteArrayArray2447[i_3_] = null;
					client.anInt8980 = 0;
				}
				client.aClass304_9030.method3008(1856857023).method4578(-2134368789);
				Class418.method5273((byte) -7);
				Class271.method2673(460761413);
				Class216.method2241((byte) 42);
				IComponentDefinitions.method1407((byte) -66);
				Class428.aClass367_4355.method4298((byte) 4);
				client.aClass367_8974.method4298((byte) 42);
				Class484.aClass367_5788.method4298((byte) 11);
			}
			Class110.method1358(101427457);
			Class291.method2906((byte) 92);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("c.gi(").append(')').toString());
		}
	}
}
