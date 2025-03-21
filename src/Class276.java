/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class276 implements Runnable {
	Class304 aClass304_2858;
	volatile boolean aBoolean2859 = false;
	LinkedList aLinkedList2860 = new LinkedList();
	static String aString2861;

	public void method2719(Class463 class463, int i) {
		try {
			((Class276) this).aClass304_2858.method3002(class463, -837249133);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.r(").append(')').toString());
		}
	}

	void method2720(Class300 class300, int i) {
		try {
			if (OutgoingPacketManager.aClass310_3213 == ((Class300) class300).aClass310_3057)
				((Class276) this).aClass304_2858.method3032(1774313103);
			else
				((Class276) this).aClass304_2858.method3026(class300, 1597150420);
			for (boolean bool = ((Class276) this).aClass304_2858.method3017(186314141); !bool; bool = ((Class276) this).aClass304_2858.method3017(186314141)) {
				/* empty */
			}
			((Class276) this).aClass304_2858.method3004((byte) 5);
			client.aClass304_9030.method3004((byte) 6);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.f(").append(')').toString());
		}
	}

	public Class304 method2721(byte i) {
		try {
			return ((Class276) this).aClass304_2858;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.p(").append(')').toString());
		}
	}

	void method2722(Class304 class304, int i) {
		try {
			((Class276) this).aClass304_2858 = class304;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.o(").append(')').toString());
		}
	}

	public void run() {
		try {
			for (;;)
				method2723(1292775964);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.run(").append(')').toString());
		}
	}

	void method2723(int i) {
		try {
			Object object = null;
			Class300 class300;
			synchronized (((Class276) this).aLinkedList2860) {
				try {
					((Class276) this).aLinkedList2860.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
				class300 = (Class300) ((Class276) this).aLinkedList2860.pollFirst();
			}
			do {
				try {
					try {
						if (class300 != null) {
							((Class276) this).aBoolean2859 = true;
							method2720(class300, -611781178);
						}
					} catch (Exception exception) {
						((Class276) this).aBoolean2859 = false;
						break;
					}
					((Class276) this).aBoolean2859 = false;
				} catch (RuntimeException object_0_) {
					((Class276) this).aBoolean2859 = false;
					throw object_0_;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.s(").append(')').toString());
		}
	}

	public boolean method2724(int i) {
		try {
			return ((Class276) this).aBoolean2859;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.i(").append(')').toString());
		}
	}

	public void method2725(Class300 class300, byte i) {
		try {
			synchronized (((Class276) this).aLinkedList2860) {
				((Class276) this).aLinkedList2860.add(class300);
				((Class276) this).aLinkedList2860.notify();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.j(").append(')').toString());
		}
	}

	public Class276() {
		((Class276) this).aClass304_2858 = new Class304(true);
	}

	static final void method2726(Class430 class430, byte i) {
		try {
			if (-296919301 * client.anInt8995 != 15 || Class434.method5564(-1999354701))
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else if (Class507.aBoolean5933)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else if (-5993855331308318023L * Class507.aLong5934 > Class312.method3111((byte) 26) - 1000L)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
			else {
				Class507.aBoolean5933 = true;
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2488, client.aClass1_9060.aClass488_22, 668972296);
				class330_sub34.aClass330_Sub46_Sub2_7729.addInt(1103303329 * Class527.anInt6213, 1965508160);
				client.aClass1_9060.method378(class330_sub34, -744094747);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.amj(").append(')').toString());
		}
	}

	static final void method2727(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5828(635277037) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.apz(").append(')').toString());
		}
	}

	static final void method2728(Class430 class430, byte i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub10_7873.method5716(i_1_, -1253947663);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.aqk(").append(')').toString());
		}
	}

	static final void method2729(Class432_Sub1 class432_sub1, int i, boolean bool, int i_2_) {
		try {
			int i_3_;
			int i_4_;
			if (class432_sub1 instanceof Class432_Sub1_Sub1 && class432_sub1 instanceof Interface2) {
				Class432_Sub1_Sub1 class432_sub1_sub1 = (Class432_Sub1_Sub1) class432_sub1;
				int i_5_ = ((class432_sub1_sub1.aShort9920 - class432_sub1_sub1.aShort9922 + 1) << 9);
				int i_6_ = (1 + (class432_sub1_sub1.aShort9923 - class432_sub1_sub1.aShort9921) << 9);
				i_3_ = (class432_sub1_sub1.aShort9922 << 9) + i_5_ / 2;
				i_4_ = i_6_ / 2 + (class432_sub1_sub1.aShort9921 << 9);
			} else {
				Class260 class260 = class432_sub1.method5346().aClass260_2606;
				i_3_ = (int) class260.aFloat2716;
				i_4_ = (int) class260.aFloat2711;
			}
			Class208.method2205(class432_sub1.aByte8658, i_3_, i_4_, 0, i, bool, 1536669850);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.jf(").append(')').toString());
		}
	}

	public static void method2730(int delay, IndexTable class280, int musicId, int i_8_, int volume, boolean bool, Class111 class111, int i_10_) {
		try {
			if (delay > 0) {
				MusicManager.currentState = 1408571369;
				Class110.musicArchive = class280;
				MusicManager.musicId = 717142103 * musicId;
				MusicManager.musicIndex = i_8_ * 38247865;
				Class288.aClass330_Sub40_Sub2_2955 = null;
				Class121.volume = 1178920319 * volume;
				Class268.aBoolean2746 = bool;
				Class457.anInt6843 = (Class110.aClass330_Sub40_Sub2_1155.method3587(751327566) / delay * -1168308059);
				if (Class457.anInt6843 * -1233412307 < 1)
					Class457.anInt6843 = -1168308059;
				Class403.aClass111_4138 = class111;
			} else {
				if (null != class111)
					class111.method1364(-1324158633);
				Class217.method2255(class280, musicId, i_8_, volume, bool, -1917428320);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lm.b(").append(')').toString());
		}
	}
}
