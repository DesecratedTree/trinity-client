/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468 implements Interface26 {
	public static Class468 aClass468_6856;
	public static Class468 aClass468_6857;
	static Class468 aClass468_6858;
	int anInt6859;
	static Class468 aClass468_6860;
	public static Class468 aClass468_6861 = new Class468(-2);
	static Class468 aClass468_6862;

	Class468(int i) {
		((Class468) this).anInt6859 = i * -575634295;
	}

	public int method297(short i) {
		try {
			return -251514439 * ((Class468) this).anInt6859;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tk.j(").append(')').toString());
		}
	}

	static {
		aClass468_6857 = new Class468(-3);
		aClass468_6858 = new Class468(2);
		aClass468_6856 = new Class468(3);
		aClass468_6860 = new Class468(21);
		aClass468_6862 = new Class468(20);
	}

	public int method300() {
		return -251514439 * ((Class468) this).anInt6859;
	}

	public int method299() {
		return -251514439 * ((Class468) this).anInt6859;
	}

	public int method298() {
		return -251514439 * ((Class468) this).anInt6859;
	}

	public int method301() {
		return -251514439 * ((Class468) this).anInt6859;
	}

	static final void method5860(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean9083 && !client.aBoolean9228 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tk.aoz(").append(')').toString());
		}
	}

	static final void method5861(Class430 class430, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tk.anx(").append(')').toString());
		}
	}

	static final void method5862(boolean largeView, int i) {
		try {
			Class330_Sub46_Sub2 buffer = ((Class1) client.aClass1_9025).aClass330_Sub46_Sub2_17;
			for (;;) {
				if (buffer.method3827((((Class1) client.aClass1_9025).anInt26) * -275392715, -559716322) < 15) {
					if (i == 791376098)
						break;
					return;
				}
				int npcIndex = buffer.readBits(15);
				if (npcIndex == 32767) {
					if (i == 791376098)
						break;
					return;
				}
				boolean bool_1_ = false;
				Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) npcIndex));
				if (class330_sub35 == null) {
					NPC class432_sub1_sub1_sub1_sub2 = (new NPC(client.aClass304_9030.method3023(-400722441)));
					class432_sub1_sub1_sub1_sub2.anInt10008 = 662194221 * npcIndex;
					class330_sub35 = new Class330_Sub35(class432_sub1_sub1_sub1_sub2);
					client.aClass497_9014.method6097(class330_sub35, (long) npcIndex);
					client.aClass330_Sub35Array9015[(client.anInt9232 += 93438839) * -1183709625 - 1] = class330_sub35;
					bool_1_ = true;
				}
				NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
				client.anIntArray9018[(client.anInt9017 += -948929865) * -823688441 - 1] = npcIndex;
				class432_sub1_sub1_sub1_sub2.anInt10069 = -1342092209 * client.anInt8996;
				if (null != class432_sub1_sub1_sub1_sub2.aClass551_10251 && class432_sub1_sub1_sub1_sub2.aClass551_10251.method6372((byte) -12))
					Class324.method3202(class432_sub1_sub1_sub1_sub2, 1031641468);
				int teleportType = buffer.readBits(1);
				int direction = (buffer.readBits(3) + 4 << 11 & 0x3fff);
				int plane = buffer.readBits(2);
				int y;
				if (largeView) {
					y = buffer.readBits(8);
					if (y > 127)
						y -= 256;
				} else {
					y = buffer.readBits(5);
					if (y > 15)
						y -= 32;
				}
				class432_sub1_sub1_sub1_sub2.method5475((Class158_Sub3.aClass553_8875.method6392(buffer.readBits(15), -463617992)), 1918950667);
				int resetIndex = buffer.readBits(1);
				if (resetIndex == 1)
					client.anIntArray9020[(client.anInt9019 += 808038027) * -351876829 - 1] = npcIndex;
				int x;
				if (largeView) {
					x = buffer.readBits(8);
					if (x > 127)
						x -= 256;
				} else {
					x = buffer.readBits(5);
					if (x > 15)
						x -= 32;
				}
				class432_sub1_sub1_sub1_sub2.method5420((class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6295 * -1943771105), (short) -1191);
				class432_sub1_sub1_sub1_sub2.anInt10051 = (-922219293 * (class432_sub1_sub1_sub1_sub2.aClass551_10251.anInt6325) << 3) * 543987723;
				if (bool_1_)
					class432_sub1_sub1_sub1_sub2.method5411(direction, true, 735631152);
				class432_sub1_sub1_sub1_sub2.method5478(plane, (Class263_Sub2.myPlayer.anIntArray10018[0]) + x, (Class263_Sub2.myPlayer.anIntArray10059[0]) + y, 1 == teleportType, class432_sub1_sub1_sub1_sub2.method5453(-2068687708), -1737258822);
				if (class432_sub1_sub1_sub1_sub2.aClass551_10251.method6372((byte) -23))
					Class_ra.method4809(class432_sub1_sub1_sub1_sub2.aByte8658, (class432_sub1_sub1_sub1_sub2.anIntArray10018[0]), (class432_sub1_sub1_sub1_sub2.anIntArray10059[0]), 0, null, class432_sub1_sub1_sub1_sub2, null, 682839506);
			}
			buffer.method3824(233374033);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tk.kb(").append(')').toString());
		}
	}
}
