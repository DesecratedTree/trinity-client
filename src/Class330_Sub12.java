/* Class330_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class330_Sub12 extends Class330 {
	abstract void method3293(Class154 class154, int i);

	abstract void method3294(Buffer class330_sub46, byte i);

	abstract void method3295(Class154 class154);

	abstract void method3296(Buffer class330_sub46);

	abstract void method3297(Buffer class330_sub46);

	abstract void method3298(Class154 class154);

	abstract void method3299(Buffer class330_sub46);

	abstract void method3300(Class154 class154);

	abstract void method3301(Buffer class330_sub46);

	Class330_Sub12() {
		/* empty */
	}

	static void method3302(ClientScript class330_sub36_sub8, int i, Class430 class430, int i_0_) {
		try {
			((Class430) class430).anInt4376 = 0;
			((Class430) class430).anInt4378 = 0;
			((Class430) class430).anInt4397 = -1996761881;
			((Class430) class430).aClass330_Sub36_Sub8_4393 = class330_sub36_sub8;
			((Class430) class430).aClass445Array4383 = (((Class430) class430).aClass330_Sub36_Sub8_4393.aClass445Array9670);
			((Class430) class430).anIntArray4394 = (((Class430) class430).aClass330_Sub36_Sub8_4393.anIntArray9673);
			Class445 class445 = null;
			((Class430) class430).anInt4371 = 0;
			try {
				try {
					Class428.anInt4353 = 0;
					for (;;) {
						Class428.anInt4353 += 841140549;
						if (159670669 * Class428.anInt4353 > i)
							throw new RuntimeException("");
						class445 = (((Class430) class430).aClass445Array4383[(((Class430) class430).anInt4397 += 1996761881) * -54918871]);
						if (Class428.aBoolean4357 && (null == Class428.aString4358 || (null != (((Class430) class430).aClass330_Sub36_Sub8_4393.aString9681) && (((Class430) class430).aClass330_Sub36_Sub8_4393.aString9681.indexOf(Class428.aString4358) != -1))))
							System.out.println(new StringBuilder().append(((Class430) class430).aClass330_Sub36_Sub8_4393.aString9681).append(": ").append(class445).toString());
						if ((((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]) == 1)
							((Class430) class430).aBoolean4398 = true;
						else
							((Class430) class430).aBoolean4398 = false;
						if (class445 == Class445.aClass445_5406 && (821898631 * ((Class430) class430).anInt4371 == 0)) {
							Class316.method3147((byte) -49);
							break;
						}
						OutgoingPacketManager.method3099(class445, class430, 2117696086);
					}
				} catch (Exception exception) {
					StringBuilder stringbuilder = new StringBuilder(30);
					stringbuilder.append("").append(-6154793640677333111L * (((Class430) class430).aClass330_Sub36_Sub8_4393.aLong3341)).append(" ");
					for (int i_1_ = 821898631 * ((Class430) class430).anInt4371 - 1; i_1_ >= 0; i_1_--)
						stringbuilder.append("").append((((Class433) ((Class430) class430).aClass433Array4382[i_1_]).aClass330_Sub36_Sub8_4413.aLong3341) * -6154793640677333111L).append(" ");
					stringbuilder.append("").append(Integer.valueOf(class445.anInt5543 * 1962506575));
					Class207.method2195(stringbuilder.toString(), exception, -306254718);
					Class316.method3147((byte) -65);
				}
			} catch (RuntimeException object) {
				Class316.method3147((byte) 41);
				throw object;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acr.k(").append(')').toString());
		}
	}

	static final void method3303(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anInt4378 -= -119156554;
			String string = (String) (((Class430) class430).anObjectArray4386[-1378875437 * ((Class430) class430).anInt4378]);
			String string_3_ = ((String) (((Class430) class430).anObjectArray4386[1 + -1378875437 * ((Class430) class430).anInt4378]));
			if (string.length() <= 500 && string_3_.length() <= 500)
				Class325.method3208(i_2_, string, string_3_, -1274842118);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acr.arq(").append(')').toString());
		}
	}
}
