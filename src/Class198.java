/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class198 {
	public static Class198 aClass198_1914;
	public static Class198 aClass198_1915 = new Class198(1);
	public static Class198 aClass198_1916;
	public static Class198 aClass198_1917;
	public static Class198 aClass198_1918;
	public static Class198 aClass198_1919 = new Class198(2);
	public static Class198 aClass198_1920;
	public static Class198 aClass198_1921;
	public static Class198 aClass198_1922 = new Class198(2);
	public static Class198 aClass198_1923;
	public int anInt1924;
	static long aLong1925;

	static {
		aClass198_1917 = new Class198(2);
		aClass198_1918 = new Class198(1);
		aClass198_1920 = new Class198(1);
		aClass198_1916 = new Class198(1);
		aClass198_1921 = new Class198(2);
		aClass198_1914 = new Class198(1);
		aClass198_1923 = new Class198(2);
	}

	Class198(int i) {
		anInt1924 = i * -1758107483;
	}

	public static void method2153(int i) {
		try {
			Class22.method472((byte) 2);
			Class393.aClass397_Sub1_4067.method4656(678720887);
			Class393.aClass397_Sub2_4069.method4656(-1087359649);
			if (1129657189 * client.anInt9003 > 0) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2492, client.aClass1_9025.aClass488_22, 753615513);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort(client.anInt9003 * 223661460, (byte) 70);
				for (int i_0_ = 0; i_0_ < client.anInt9003 * 1129657189; i_0_++) {
					Interface18 interface18 = client.anInterface18Array9004[i_0_];
					long l = (interface18.method267(-2028920580) - Class393.aLong4065 * 5189488257143608367L);
					if (l > 16777215L)
						l = 16777215L;
					Class393.aLong4065 = (interface18.method267(-697234886) * 6188720877669888719L);
					class330_sub34.aClass330_Sub46_Sub2_7729.addByte(interface18.method264((byte) 0), (byte) 49);
					class330_sub34.aClass330_Sub46_Sub2_7729.method3743((int) l, -818654182);
				}
				client.aClass1_9025.method378(class330_sub34, -663085250);
			}
			if (1171608959 * Class393.anInt4068 > 0)
				Class393.anInt4068 -= 71068287;
			if (client.aBoolean9038 && Class393.anInt4068 * 1171608959 <= 0) {
				Class393.anInt4068 = 1421365740;
				client.aBoolean9038 = false;
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2501, client.aClass1_9025.aClass488_22, 356263337);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShortA((int) client.aFloat9250 >> 3, -397179662);
				class330_sub34.aClass330_Sub46_Sub2_7729.addLEShort((int) client.aFloat9141 >> 3, -676872267);
				client.aClass1_9025.method378(class330_sub34, -2077367935);
			}
			if (Class393.aBoolean4066 != Class76_Sub1_Sub3.aBoolean9380) {
				Class393.aBoolean4066 = Class76_Sub1_Sub3.aBoolean9380;
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2489, client.aClass1_9025.aClass488_22, 357450712);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class76_Sub1_Sub3.aBoolean9380 ? 1 : 0, (byte) 74);
				client.aClass1_9025.method378(class330_sub34, -1813047492);
			}
			if (!client.aBoolean9194) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.WORLD_MAP_PACKET, client.aClass1_9025.aClass488_22, 863590021);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 60);
				int i_1_ = (class330_sub34.aClass330_Sub46_Sub2_7729.offset * -824785231);
				Buffer class330_sub46 = Class448.aClass330_Sub50_5555.method3861(925699026);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3749(class330_sub46.payload, 0, class330_sub46.offset * -824785231, (byte) -56);
				class330_sub34.aClass330_Sub46_Sub2_7729.method3751(-824785231 * (class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_1_, -234039189);
				client.aClass1_9025.method378(class330_sub34, -2036283293);
				client.aBoolean9194 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ig.f(").append(')').toString());
		}
	}

	static final void method2154(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class252.method2527(iComponentDefinitions, class120, class430, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ig.dj(").append(')').toString());
		}
	}

	static void method2155(IComponentDefinitions iComponentDefinitions, int i, int i_2_, int i_3_) {
		try {
			Class484.aClass114_5789 = iComponentDefinitions;
			Class484.anInt5798 = 414267419 * i;
			Class484.anInt5799 = -1368913925 * i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ig.ai(").append(')').toString());
		}
	}

	static final void method2156(Class430 class430, short i) {
		try {
			Class401_Sub1 class401_sub1 = Class100.method1212(-968048749);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (null == class401_sub1 ? 0 : 551859137 * class401_sub1.anInt4131);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ig.anw(").append(')').toString());
		}
	}

	static final void method2157(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class65.method784(iComponentDefinitions, class430, -272625435);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ig.kj(").append(')').toString());
		}
	}

	static void method2158(int i, int i_4_, IComponentDefinitions iComponentDefinitions, Class_ta class_ta, int i_5_, int i_6_, int i_7_) {
		try {
			int i_8_ = -1468156857 * Class15.anInt192;
			int[] is = Class15.anIntArray187;
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				Player class432_sub1_sub1_sub1_sub1 = client.players[is[i_9_]];
				if (null != class432_sub1_sub1_sub1_sub1 && class432_sub1_sub1_sub1_sub1.method5465((byte) 103) && !class432_sub1_sub1_sub1_sub1.hidden && (class432_sub1_sub1_sub1_sub1 != Class263_Sub2.myPlayer) && (class432_sub1_sub1_sub1_sub1.aByte8658 == (Class263_Sub2.myPlayer.aByte8658))) {
					Class260 class260 = (class432_sub1_sub1_sub1_sub1.method5346().aClass260_2606);
					int i_10_ = (int) class260.aFloat2716 / 128 - i / 128;
					int i_11_ = (int) class260.aFloat2711 / 128 - i_4_ / 128;
					boolean bool = false;
					for (int i_12_ = 0; i_12_ < 652732387 * client.anInt9256; i_12_++) {
						Class99 class99 = client.aClass99Array9259[i_12_];
						if (class432_sub1_sub1_sub1_sub1.aString10221.equals(class99.aString915) && 0 != 1409329275 * class99.anInt911) {
							bool = true;
							break;
						}
					}
					boolean bool_13_ = false;
					for (int i_14_ = 0; i_14_ < 1374414177 * Class452.anInt5561; i_14_++) {
						if (class432_sub1_sub1_sub1_sub1.aString10221.equals(Class95_Sub22.aClass13Array7210[i_14_].aString171)) {
							bool_13_ = true;
							break;
						}
					}
					boolean bool_15_ = false;
					if (-1019945531 * (Class263_Sub2.myPlayer.anInt10246) != 0 && (class432_sub1_sub1_sub1_sub1.anInt10246 * -1019945531) != 0 && ((class432_sub1_sub1_sub1_sub1.anInt10246 * -1019945531) == (Class263_Sub2.myPlayer.anInt10246) * -1019945531))
						bool_15_ = true;
					if (class432_sub1_sub1_sub1_sub1.aBoolean10234)
						Class464_Sub3.method5744(iComponentDefinitions, class_ta, i_5_, i_6_, i_10_, i_11_, (Class76_Sub1.aClass61Array7097[6]), (byte) 0);
					else if (bool_15_)
						Class464_Sub3.method5744(iComponentDefinitions, class_ta, i_5_, i_6_, i_10_, i_11_, (Class76_Sub1.aClass61Array7097[4]), (byte) 0);
					else if (class432_sub1_sub1_sub1_sub1.aBoolean10247)
						Class464_Sub3.method5744(iComponentDefinitions, class_ta, i_5_, i_6_, i_10_, i_11_, (Class76_Sub1.aClass61Array7097[7]), (byte) 0);
					else if (bool)
						Class464_Sub3.method5744(iComponentDefinitions, class_ta, i_5_, i_6_, i_10_, i_11_, (Class76_Sub1.aClass61Array7097[3]), (byte) 0);
					else if (bool_13_)
						Class464_Sub3.method5744(iComponentDefinitions, class_ta, i_5_, i_6_, i_10_, i_11_, (Class76_Sub1.aClass61Array7097[5]), (byte) 0);
					else
						Class464_Sub3.method5744(iComponentDefinitions, class_ta, i_5_, i_6_, i_10_, i_11_, (Class76_Sub1.aClass61Array7097[2]), (byte) 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ig.b(").append(')').toString());
		}
	}

	static final void method2159(Class430 class430, byte i) {
		try {
			int i_16_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			Class555.anIntArray6382[i_16_] = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub3.method3271(i_16_, (byte) -99);
			client.aBoolean9206 |= Class330_Sub26.aBooleanArray7696[i_16_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ig.av(").append(')').toString());
		}
	}
}
