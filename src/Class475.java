/* Class475 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.IOException;

public abstract class Class475 {
	Class145 aClass145_5699;
	public static Canvas aCanvas5700;
	static int anInt5701;

	public abstract void method5922(Class138 class138, Class247 class247, int i, int i_0_, int i_1_);

	public abstract void method5923(float f, int i);

	public abstract boolean method5924(int i);

	public abstract void method5925(Buffer class330_sub46, int i);

	Class475(Class145 class145) {
		((Class475) this).aClass145_5699 = class145;
	}

	public abstract boolean method5926();

	public abstract void method5927(float f);

	public abstract void method5928(float f);

	public abstract void method5929(float f);

	public abstract void method5930(float f);

	public abstract boolean method5931();

	public abstract Class260 method5932(int i);

	public abstract void method5933(Class138 class138, Class247 class247, int i, int i_2_);

	public abstract void method5934(Class138 class138, Class247 class247, int i, int i_3_);

	public abstract Class260 method5935();

	public abstract void method5936(Buffer class330_sub46);

	static final void method5937(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			((Class430) class430).anInt4378 -= i_4_ * 2087905371;
			String string = Class167.method2023(((Class430) class430).anObjectArray4386, (((Class430) class430).anInt4378 * -1378875437), i_4_, (byte) 70);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.ab(").append(')').toString());
		}
	}

	public static int method5938(int i, int i_5_, boolean bool, int i_6_) {
		try {
			Class330_Sub1 class330_sub1 = Class321.method3178(i, bool, (short) 8716);
			if (class330_sub1 == null)
				return 0;
			if (i_5_ == -1)
				return 0;
			int i_7_ = 0;
			for (int i_8_ = 0; i_8_ < ((Class330_Sub1) class330_sub1).anIntArray7497.length; i_8_++) {
				if (((Class330_Sub1) class330_sub1).anIntArray7500[i_8_] == i_5_)
					i_7_ += (((Class330_Sub1) class330_sub1).anIntArray7497[i_8_]);
			}
			return i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.i(").append(')').toString());
		}
	}

	static final void method5939(Class430 class430, int i) {
		try {
			Class401.method4716(-1446426496);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.wb(").append(')').toString());
		}
	}

	static final void method5940(Class430 class430, int i) {
		try {
			NPC class432_sub1_sub1_sub1_sub2 = ((NPC) ((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396);
			Class551 class551 = class432_sub1_sub1_sub1_sub2.aClass551_10251;
			if (null != class551.anIntArray6326)
				class551 = class551.method6371(Class158.aClass561_6474, (byte) 37);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = null != class551 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.arr(").append(')').toString());
		}
	}

	static void method5941(IndexTable class280, int musicId, int i_9_, int volume, boolean bool, long l, int i_11_, int i_12_) {
		try {
			MusicManager.currentState = 1408571369;
			Class110.musicArchive = class280;
			MusicManager.musicId = musicId * 717142103;
			MusicManager.musicIndex = 38247865 * i_9_;
			Class288.aClass330_Sub40_Sub2_2955 = null;
			Class121.volume = volume * 1178920319;
			Class268.aBoolean2746 = bool;
			Class457.anInt6843 = -769544880;
			Class72.aLong621 = -7466682377567011623L * l;
			Class559.anInt6433 = i_11_ * 403980941;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.o(").append(')').toString());
		}
	}

	public static Class366 method5942(int i, int i_13_, int i_14_, int i_15_, byte i_16_) {
		try {
			Class363.aClass366_Sub4_3804.anInt3854 = -1089827279 * i;
			Class363.aClass366_Sub4_3804.anInt3853 = 1307742219 * i_13_;
			Class363.aClass366_Sub4_3804.anInt3852 = i_14_ * 1706819999;
			Class363.aClass366_Sub4_3804.anInt3855 = 1343860585 * i_15_;
			return Class363.aClass366_Sub4_3804;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.j(").append(')').toString());
		}
	}

	static final void method5943(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4378 -= 2087905371;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.ag(").append(')').toString());
		}
	}

	public static void method5944(boolean bool, int i) {
		try {
			Class233.method2362((byte) 22);
			if (Class475_Sub5.method5958(-296919301 * client.anInt8995, 885477300)) {
				Class1[] class1s = client.aClass1Array8963;
				for (int i_17_ = 0; i_17_ < class1s.length; i_17_++) {
					Class1 class1 = class1s[i_17_];
					class1.anInt29 += -1349860145;
					if (class1.anInt29 * 936362543 < 50 && !bool)
						return;
					class1.anInt29 = 0;
					if (!class1.aBoolean37 && class1.method380(-2135214463) != null) {
						Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.PING_PACKET, class1.aClass488_22, 1040295195);
						class1.method378(class330_sub34, -1118795869);
						try {
							class1.method381(1975384887);
						} catch (IOException ioexception) {
							class1.aBoolean37 = true;
						}
					}
				}
				Class233.method2362((byte) -61);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tr.r(").append(')').toString());
		}
	}
}
