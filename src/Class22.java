/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.util.Date;

public class Class22 {
	static short aShort256 = 1008;
	static short aShort257 = 6;
	static short aShort258 = 4;
	static short aShort259 = 5;
	static short aShort260 = 46;
	static short aShort261 = 8;
	static short aShort262 = 20;
	static short aShort263 = 10;
	static short aShort264 = 1009;
	static short aShort265 = 12;
	static short aShort266 = 13;
	static short aShort267 = 50;
	static short aShort268 = 11;
	static short aShort269 = 17;
	static short aShort270 = 57;
	static short aShort271 = 3;
	static short aShort272 = 15;
	static short aShort273 = 21;
	static short aShort274 = 2;
	static short aShort275 = 23;
	static short aShort276 = 1004;
	static short aShort277 = 30;
	static short aShort278 = 1002;
	static short aShort279 = 18;
	static short aShort280 = 9;
	static short aShort281 = 47;
	static short aShort282 = 48;
	static short aShort283 = 49;
	static short aShort284 = 44;
	static short aShort285 = 51;
	static short aShort286 = 52;
	static short aShort287 = 53;
	static short aShort288 = 16;
	static short aShort289 = 58;
	static short aShort290 = 59;
	static short aShort291 = 60;
	static short aShort292 = 1001;
	static short aShort293 = 19;
	static short aShort294 = 45;
	static short aShort295 = 25;
	static short aShort296 = 1006;
	static short aShort297 = 1007;
	static short aShort298 = 1003;
	static short aShort299 = 22;
	static short aShort300 = 1010;
	static short aShort301 = 1011;
	static short aShort302 = 1012;
	static String[] aStringArray303;

	Class22() throws Throwable {
		throw new Error();
	}

	static int[] method471(Class330_Sub36_Sub10 class330_sub36_sub10, int i) {
		try {
			int[] is = null;
			if (Class487_Sub1.method6041(400571611 * (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699), 536870912))
				is = (Class556.aClass510_6392.getItemDefinitions((int) ((((Class330_Sub36_Sub10) class330_sub36_sub10).aLong9697) * -6131574267885624389L), (byte) -14).anIntArray6701);
			else if ((((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9691 * 591850841) != -1)
				is = (Class556.aClass510_6392.getItemDefinitions((((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9691 * 591850841), (byte) -68).anIntArray6701);
			else if (Class531.method6298((((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 * 400571611), 1262689693)) {
				Class330_Sub35 class330_sub35 = ((Class330_Sub35) (client.aClass497_9014.method6094((long) (int) (-6131574267885624389L * ((Class330_Sub36_Sub10) class330_sub36_sub10).aLong9697))));
				if (class330_sub35 != null) {
					NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
					Class551 class551 = class432_sub1_sub1_sub1_sub2.aClass551_10251;
					if (null != class551.anIntArray6326)
						class551 = class551.method6371(Class158.aClass561_6474, (byte) 10);
					if (class551 != null)
						is = class551.anIntArray6336;
				}
			} else if (Class391.method4607(400571611 * (((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699), (byte) 67)) {
				Class473 class473 = (client.aClass304_9030.method3025((byte) 13).method5705((int) ((((Class330_Sub36_Sub10) class330_sub36_sub10).aLong9697) * -6131574267885624389L >>> 32 & 0x7fffffffL), (byte) -63));
				if (class473.anIntArray5678 != null)
					class473 = class473.method5900(Class158.aClass561_6474, (byte) -4);
				if (class473 != null)
					is = class473.anIntArray5693;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aw.av(").append(')').toString());
		}
	}

	static void method472(byte i) {
		try {
			synchronized (Class393.aQueue4064) {
				Point point;
				if (Class475.aCanvas5700.isShowing())
					point = Class475.aCanvas5700.getLocationOnScreen();
				else
					point = null;
				for (;;) {
					Class330_Sub44_Sub1 class330_sub44_sub1 = (Class330_Sub44_Sub1) Class393.aQueue4064.poll();
					if (class330_sub44_sub1 == null) {
						break;
					}
					if (point == null || !Class475.aCanvas5700.isShowing() || !Class76_Sub1_Sub3.aBoolean9380)
						class330_sub44_sub1.method3714(-963265081);
					else {
						class330_sub44_sub1.method3731(point, 675074469);
						if (class330_sub44_sub1.method3730(1776611133)) {
							if (i != 2) {
								/* empty */
							}
						} else if ((class330_sub44_sub1.method3710((byte) 1) < -1969079741 * Class300.anInt3058) && (class330_sub44_sub1.method3711(401996786) < Class146.anInt1615 * -1548608507) && class330_sub44_sub1.method3710((byte) -23) >= 0) {
							if (class330_sub44_sub1.method3711(1680615750) < 0) {
								if (i != 2) {
									/* empty */
								}
							} else {
								int i_0_ = class330_sub44_sub1.method3709((short) 10244);
								if (class330_sub44_sub1.method3709((short) -3353) == -1)
									Class393.aClass397_Sub2_4069.method4673(class330_sub44_sub1, (byte) 1);
								else if (Class391.method4606(i_0_, (byte) 16))
									Class393.aClass397_Sub2_4069.method4683(class330_sub44_sub1, -1718037057);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aw.o(").append(')').toString());
		}
	}

	public static void method473(byte i) {
		try {
			int i_1_ = 0;
			if (Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1) {
				i_1_ |= 0x1;
				i_1_ |= 0x10;
				i_1_ |= 0x20;
				i_1_ |= 0x2;
				i_1_ |= 0x4;
			}
			if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(730115580) == 0)
				i_1_ |= 0x40;
			Class81.method945(i_1_, -1209679014);
			client.aClass304_9030.method3025((byte) 13).method5710(i_1_, (byte) 2);
			Class43.aClass276_10073.method2721((byte) 125).method3025((byte) 13).method5710(i_1_, (byte) 2);
			Class556.aClass510_6392.method6175(i_1_, 1522181389);
			Class158_Sub3.aClass553_8875.method6390(i_1_, 942776811);
			Class136.aClass416_1527.method5251(i_1_, 1494177708);
			Class389.method4596(i_1_, (byte) 0);
			Class119.method1439(i_1_, (byte) -32);
			Class216.method2246(i_1_, 564595847);
			Class153.method1791(i_1_, 2094901066);
			Class_ta.method5681(i_1_, (byte) -86);
			client.aClass304_9030.method3032(-397345413);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aw.ge(").append(')').toString());
		}
	}

	static final void method474(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class95_Sub6.method1123(iComponentDefinitions, class120, class430, (byte) 57);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aw.fw(").append(')').toString());
		}
	}

	static void method475(long l) {
		try {
			Class528.aCalendar6217.setTime(new Date(l));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aw.s(").append(')').toString());
		}
	}
}
