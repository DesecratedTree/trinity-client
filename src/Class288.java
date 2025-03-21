/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public final class Class288 implements Comparable {
	Object anObject2951;
	Object anObject2952;
	long aLong2953;
	long aLong2954;
	static Class330_Sub40_Sub2 aClass330_Sub40_Sub2_2955;
	static Class469 aClass469_2956;

	Class288(Object object, Object object_0_) {
		((Class288) this).anObject2951 = object;
		((Class288) this).anObject2952 = object_0_;
	}

	int method2884(Class288 class288_1_, byte i) {
		try {
			if (8505647925819568395L * ((Class288) this).aLong2954 < ((Class288) class288_1_).aLong2954 * 8505647925819568395L)
				return -1;
			if (((Class288) this).aLong2954 * 8505647925819568395L > 8505647925819568395L * ((Class288) class288_1_).aLong2954)
				return 1;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.r(").append(')').toString());
		}
	}

	public boolean equals(Object object) {
		try {
			if (object instanceof Class288)
				return ((Class288) this).anObject2952.equals(((Class288) (Class288) object).anObject2952);
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.equals(").append(')').toString());
		}
	}

	public int compareTo(Object object) {
		try {
			return method2884((Class288) object, (byte) -59);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.compareTo(").append(')').toString());
		}
	}

	static final void method2885(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class537 class537 = Class301.aClass543_3059.method6339(i_2_, -831030520);
			if (!class537.aString6236.equals(string))
				iComponentDefinitions.method1404(i_2_, string, 1374414177);
			else
				iComponentDefinitions.method1400(i_2_, -1637743120);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.gz(").append(')').toString());
		}
	}

	static final Object[] method2886(String string, Class430 class430, int i) {
		try {
			Object[] objects = new Object[string.length() + 1];
			for (int i_3_ = objects.length - 1; i_3_ >= 1; i_3_--) {
				if (string.charAt(i_3_ - 1) == 's')
					objects[i_3_] = (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
				else if (string.charAt(i_3_ - 1) == '\u00a7')
					objects[i_3_] = new Long(((Class430) class430).aLongArray4379[(((Class430) class430).anInt4380 -= 2099007437) * -1969146619]);
				else
					objects[i_3_] = new Integer(((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]);
			}
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (-1 != i_4_)
				objects[0] = new Integer(i_4_);
			else
				objects = null;
			return objects;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.kl(").append(')').toString());
		}
	}

	static final void method2887(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub26_Sub3.method3396(i_5_, (byte) 51);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.aji(").append(')').toString());
		}
	}

	public static void method2888(int i) {
		try {
			IComponentDefinitions.aClass367_1189.method4298((byte) 106);
			IComponentDefinitions.aClass367_1310.method4298((byte) 100);
			IComponentDefinitions.aClass367_1190.method4298((byte) 30);
			IComponentDefinitions.aClass367_1191.method4298((byte) 92);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.c(").append(')').toString());
		}
	}

	static void method2889(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, int i_19_, int i_20_) {
		try {
			if (i_6_ != 0 && i_8_ != -1) {
				Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = null;
				if (i_6_ < 0) {
					int i_21_ = -i_6_ - 1;
					if (1478725729 * client.anInt9121 == i_21_)
						class432_sub1_sub1_sub1 = Class263_Sub2.myPlayer;
					else
						class432_sub1_sub1_sub1 = (client.players[i_21_]);
				} else {
					int i_22_ = i_6_ - 1;
					Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i_22_));
					if (class330_sub35 != null)
						class432_sub1_sub1_sub1 = ((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733);
				}
				if (null != class432_sub1_sub1_sub1) {
					Class364 class364 = class432_sub1_sub1_sub1.method5436(860056789);
					if (null != class364.anIntArrayArray3807 && null != class364.anIntArrayArray3807[i_8_])
						i_9_ -= class364.anIntArrayArray3807[i_8_][1];
					if (class364.anIntArrayArray3845 != null && class364.anIntArrayArray3845[i_8_] != null)
						i_9_ -= class364.anIntArrayArray3845[i_8_][1];
				}
			}
			Class432_Sub1_Sub1_Sub2 class432_sub1_sub1_sub2 = (new Class432_Sub1_Sub1_Sub2(client.aClass304_9030.method3023(-400722441), i, Class1.anInt39 * -2027989865, -2027989865 * Class1.anInt39, i_11_, i_12_, i_9_, i_15_ + client.anInt8981 * 822953439, i_16_ + 822953439 * client.anInt8981, i_17_, i_18_, i_6_, i_7_, i_10_, bool, i_8_, i_19_));
			class432_sub1_sub1_sub2.method5498(i_13_, i_14_, (Class431.method5342(i_13_, i_14_, Class1.anInt39 * -2027989865, 1996761881) - i_10_), 822953439 * client.anInt8981 + i_15_, 547962577);
			client.aClass471_9139.method5878(new Class330_Sub36_Sub11(class432_sub1_sub1_sub2), (short) 8192);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.np(").append(')').toString());
		}
	}

	static void method2890(byte i) {
		try {
			if (Class556.aClass562_6386 != null) {
				try {
					int i_23_;
					if (0 == -2089947635 * Class556.anInt6389)
						i_23_ = 250;
					else
						i_23_ = 2000;
					Class556.anInt6387 += 1479166427;
					if (Class556.anInt6387 * 630098515 > i_23_)
						Class258.method2542(-850330081);
					if (Class556.aClass562_6386 == Class562.aClass562_6435) {
						client.aClass1_9060.method384((Class330_Sub15.method3320(Class507.aClass498_5937.method6109((byte) 1), 15000, -652783208)), Class507.aClass498_5937.aString5886, 744433070);
						client.aClass1_9060.method382(-227823778);
						Class330_Sub34 class330_sub34 = Class330_Sub39.method3548(810064148);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class227.aClass227_2419.anInt2422 * 1162563797, (byte) 101);
						class330_sub34.aClass330_Sub46_Sub2_7729.addShort(0, (byte) 2);
						int i_24_ = ((class330_sub34.aClass330_Sub46_Sub2_7729.offset) * -824785231);
						class330_sub34.aClass330_Sub46_Sub2_7729.addShort(742, (byte) 111);
						class330_sub34.aClass330_Sub46_Sub2_7729.addShort(1, (byte) 47);
						Class556.anIntArray6385 = IncomingPacket.method2273(class330_sub34, (byte) 16);
						int i_25_ = ((class330_sub34.aClass330_Sub46_Sub2_7729.offset) * -824785231);
						class330_sub34.aClass330_Sub46_Sub2_7729.addString(client.aString9126, (byte) -102);
						class330_sub34.aClass330_Sub46_Sub2_7729.addShort(client.anInt8956 * -1619452855, (byte) 45);
						class330_sub34.aClass330_Sub46_Sub2_7729.writeInt64BE(client.aLong9079 * -2562046880258858475L);
						class330_sub34.aClass330_Sub46_Sub2_7729.addString(Class18.aString237, (byte) -58);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class429.aClass454_4369.method297((short) -1865), (byte) 15);
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(-1358018753 * client.aClass435_9146.anInt4417, (byte) 61);
						Class511.method6182((class330_sub34.aClass330_Sub46_Sub2_7729), 1752082262);
						String string = client.aString8960;
						class330_sub34.aClass330_Sub46_Sub2_7729.addByte(null == string ? 0 : 1, (byte) 5);
						if (string != null)
							class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -46);
						Class375.aClass330_Sub51_3933.method3863(class330_sub34.aClass330_Sub46_Sub2_7729, 1778706370);
						class330_sub34.aClass330_Sub46_Sub2_7729.offset += -2029760457;
						class330_sub34.aClass330_Sub46_Sub2_7729.method3807(Class556.anIntArray6385, i_25_, (class330_sub34.aClass330_Sub46_Sub2_7729.offset) * -824785231, (byte) -82);
						class330_sub34.aClass330_Sub46_Sub2_7729.method3772(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_24_, (byte) 126);
						client.aClass1_9060.method378(class330_sub34, -932336150);
						client.aClass1_9060.method381(1291010172);
						Class556.aClass562_6386 = Class562.aClass562_6436;
					}
					if (Class562.aClass562_6436 == Class556.aClass562_6386) {
						if (client.aClass1_9060.method380(2143824028) == null)
							Class258.method2542(1514984401);
						else if (client.aClass1_9060.method380(-1268740841).method4194(1, -1020237123)) {
							client.aClass1_9060.method380(1882873436).method4195((((Class1) client.aClass1_9060).aClass330_Sub46_Sub2_17.payload), 0, 1, -1443053663);
							Class297.aClass460_3051 = ((Class460) (Class479.method6015(Class106.method1323(-1475777924), (((Class1) client.aClass1_9060).aClass330_Sub46_Sub2_17.payload[0]) & 0xff, (byte) 3)));
							if (Class297.aClass460_3051 == Class460.aClass460_6846) {
								client.aClass1_9060.aClass488_22 = new IsaacCipher(Class556.anIntArray6385);
								int[] is = new int[4];
								for (int i_26_ = 0; i_26_ < 4; i_26_++)
									is[i_26_] = 50 + Class556.anIntArray6385[i_26_];
								((Class1) client.aClass1_9060).aClass488_24 = new IsaacCipher(is);
								new IsaacCipher(is);
								((Class1) client.aClass1_9060).aClass330_Sub46_Sub2_17.method3821((((Class1) client.aClass1_9060).aClass488_24), -495463826);
								Class227.method2311(14, -1188873169);
								client.aClass1_9060.method382(-1830504489);
								((Class1) client.aClass1_9060).aClass330_Sub46_Sub2_17.offset = 0;
								((Class1) client.aClass1_9060).aClass222_20 = null;
								((Class1) client.aClass1_9060).aClass222_35 = null;
								((Class1) client.aClass1_9060).aClass222_36 = null;
								((Class1) client.aClass1_9060).anInt30 = 0;
							} else
								client.aClass1_9060.method379(1175619289);
							((Class1) client.aClass1_9060).currentIncomingPacket = null;
							Class556.aClass562_6386 = null;
						}
					}
				} catch (IOException ioexception) {
					Class258.method2542(-557617389);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lz.b(").append(')').toString());
		}
	}
}
