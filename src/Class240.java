/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class240 implements Runnable {
	int anInt2595;
	boolean aBoolean2596;
	Interface14 anInterface14_2597;
	volatile boolean aBoolean2598;
	long aLong2599;
	Interface14 anInterface14_2600 = new Class246();
	long aLong2601;
	String aString2602;
	int anInt2603;
	Class258 aClass258_2604;
	public static int anInt2605;

	int method2384(int i) {
		try {
			return ((Class240) this).anInt2603 * -72603107;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.r(").append(')').toString());
		}
	}

	synchronized void method2385(Interface14 interface14, int i) {
		try {
			((Class240) this).anInterface14_2597 = ((Class240) this).anInterface14_2600;
			((Class240) this).anInterface14_2600 = interface14;
			((Class240) this).aLong2599 = Class312.method3111((byte) 22) * 772081363227579333L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.p(").append(')').toString());
		}
	}

	synchronized void method2386(long l, String string, int i, Class258 class258, int i_0_) {
		try {
			((Class240) this).aLong2601 = l * -7368895475105434373L;
			((Class240) this).aString2602 = string;
			((Class240) this).anInt2595 = -2023662123 * i;
			((Class240) this).aClass258_2604 = class258;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.o(").append(')').toString());
		}
	}

	public int method2387(int i) {
		try {
			if (null == ((Class240) this).aClass258_2604)
				return 0;
			int i_1_ = ((Class240) this).aClass258_2604.anInt2703 * -1090237427;
			if (((Class258) ((Class240) this).aClass258_2604).aBoolean2704 && (836039549 * ((Class240) this).anInt2595 < (((Class258) ((Class240) this).aClass258_2604).anInt2707 * 368214275)))
				return ((Class240) this).anInt2595 * 836039549 + 1;
			if (i_1_ < 0 || i_1_ >= Class239.aClass258Array2585.length - 1)
				return 100;
			if ((((Class258) ((Class240) this).aClass258_2604).anInt2706 * 774429481) == 836039549 * ((Class240) this).anInt2595)
				return (368214275 * (((Class258) ((Class240) this).aClass258_2604).anInt2707));
			return (((Class258) ((Class240) this).aClass258_2604).anInt2706 * 774429481);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.s(").append(')').toString());
		}
	}

	public int method2388(byte i) {
		try {
			return 836039549 * ((Class240) this).anInt2595;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.f(").append(')').toString());
		}
	}

	public long method2389(int i) {
		try {
			return 3134588799780419123L * ((Class240) this).aLong2601;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.w(").append(')').toString());
		}
	}

	public Class258 method2390(int i) {
		try {
			return ((Class240) this).aClass258_2604;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.n(").append(')').toString());
		}
	}

	void method2391(int i) {
		try {
			((Class240) this).aBoolean2598 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.u(").append(')').toString());
		}
	}

	public void run() {
		try {
			while (!((Class240) this).aBoolean2598) {
				long l = Class312.method3111((byte) 14);
				synchronized (this) {
					try {
						((Class240) this).anInt2603 += -1658460107;
						if (((Class240) this).anInterface14_2600 instanceof Class246)
							((Class240) this).anInterface14_2600.method196(((Class240) this).aBoolean2596, -242675555);
						else {
							long l_2_ = Class312.method3111((byte) 26);
							if (Class361.aClass_ra3793 != null && ((Class240) this).anInterface14_2597 != null && ((Class240) this).anInterface14_2597.method199(2086389581) != 0 && ((((Class240) this).aLong2599 * 7401733885823218445L) >= l_2_ - (long) (((Class240) this).anInterface14_2597.method199(-1828147931)))) {
								int i = (int) ((l_2_ - (7401733885823218445L * (((Class240) this).aLong2599))) * 255L / (long) (((Class240) this).anInterface14_2597.method199(1758483732)));
								int i_3_ = 255 - i;
								i = i << 24 | 0xffffff;
								i_3_ = i_3_ << 24 | 0xffffff;
								Class113.method1384(-1954782965);
								Class361.aClass_ra3793.ba(1, 0);
								Class61 class61 = (Class361.aClass_ra3793.method4794(Class300.anInt3058 * -1969079741, -1548608507 * Class146.anInt1615, true, 575622491));
								Class76_Sub2 class76_sub2 = Class361.aClass_ra3793.ag();
								class76_sub2.method901(0, class61.method684());
								Class361.aClass_ra3793.method4785(class76_sub2, (byte) 1);
								((Class240) this).anInterface14_2597.method196(true, 1516694199);
								Class361.aClass_ra3793.method4802(class76_sub2, (byte) 0);
								class61.method688(0, 0, 0, i_3_, 1);
								Class361.aClass_ra3793.method4785(class76_sub2, (byte) 1);
								Class361.aClass_ra3793.ba(1, 0);
								((Class240) this).anInterface14_2600.method196(true, -592016454);
								Class361.aClass_ra3793.method4802(class76_sub2, (byte) 0);
								class61.method688(0, 0, 0, i, 1);
							} else {
								if (null != ((Class240) this).anInterface14_2597) {
									((Class240) this).aBoolean2596 = true;
									((Class240) this).anInterface14_2597.method209((byte) 70);
									((Class240) this).anInterface14_2597 = null;
								}
								if (((Class240) this).aBoolean2596) {
									Class113.method1384(-1903047813);
									if (Class361.aClass_ra3793 != null)
										Class361.aClass_ra3793.ba(1, 0);
								}
								((Class240) this).anInterface14_2600.method196((((Class240) this).aBoolean2596 || (Class361.aClass_ra3793 != null && Class361.aClass_ra3793.e())), -854239332);
							}
							try {
								if (null != Class361.aClass_ra3793 && !(((Class240) this).anInterface14_2600 instanceof Class246))
									Class361.aClass_ra3793.method4786(494718246);
							} catch (Exception_Sub1 exception_sub1) {
								Class207.method2195(new StringBuilder().append(exception_sub1.getMessage()).append(Class394.aClient4082.method3886(1379625429)).toString(), exception_sub1, -306254718);
								Class171.method2046(0, true, -1081950430);
							}
						}
						((Class240) this).aBoolean2596 = false;
						if (null != Class361.aClass_ra3793 && !(((Class240) this).anInterface14_2600 instanceof Class246) && ((((Class240) this).aClass258_2604.anInt2703 * -1090237427) < (-1090237427 * Class258.aClass258_2700.anInt2703)))
							Class16.method450(-561104478);
					} catch (Exception exception) {
						continue;
					}
				}
				long l_4_ = Class312.method3111((byte) 67);
				int i = (int) (20L - (l_4_ - l));
				if (i > 0)
					Class464_Sub21.method5813((long) i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.run(").append(')').toString());
		}
	}

	synchronized void method2392(byte i) {
		try {
			((Class240) this).aBoolean2596 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.j(").append(')').toString());
		}
	}

	public String method2393(byte i) {
		try {
			return ((Class240) this).aString2602;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.z(").append(')').toString());
		}
	}

	synchronized boolean method2394(int i) {
		try {
			return (((Class240) this).anInterface14_2600.method198(((Class240) this).aLong2599 * 7401733885823218445L));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.i(").append(')').toString());
		}
	}

	Class240() {
		((Class240) this).anInterface14_2597 = null;
	}

	public static float method2395(Class244 class244, int i) {
		try {
			Class260 class260 = Class260.method2577(0.0F, 0.0F, 1.0F);
			class260.method2570(class244);
			double d = 1.5707963267948966 - Math.acos((double) class260.aFloat2715);
			class260.method2550();
			return (float) d;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.r(").append(')').toString());
		}
	}

	static final void method2396(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_5_ ^ 0xffffffff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.zf(").append(')').toString());
		}
	}

	static final void method2397(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 742281531 * iComponentDefinitions.anInt1221;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.pp(").append(')').toString());
		}
	}

	static final void method2398(Class430 class430, byte i) {
		try {
			Class416.method5256((((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396), (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]), 1760074814);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[0];
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[1];
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) client.aFloatArray9253[2];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.arb(").append(')').toString());
		}
	}

	static int method2399(CharSequence charsequence, int i, boolean bool, int i_6_) {
		try {
			if (i < 2 || i > 36)
				throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
			boolean bool_7_ = false;
			boolean bool_8_ = false;
			int i_9_ = 0;
			int i_10_ = charsequence.length();
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				int i_12_ = charsequence.charAt(i_11_);
				if (0 == i_11_) {
					if (i_12_ == 45) {
						bool_7_ = true;
						continue;
					}
					if (43 == i_12_ && bool) {
						if (i_6_ >= -1189042212) {
							/* empty */
						}
						continue;
					}
				}
				if (i_12_ >= 48 && i_12_ <= 57)
					i_12_ -= 48;
				else if (i_12_ >= 65 && i_12_ <= 90)
					i_12_ -= 55;
				else if (i_12_ >= 97 && i_12_ <= 122)
					i_12_ -= 87;
				else
					throw new NumberFormatException();
				if (i_12_ >= i)
					throw new NumberFormatException();
				if (bool_7_)
					i_12_ = -i_12_;
				int i_13_ = i_12_ + i_9_ * i;
				if (i_13_ / i != i_9_)
					throw new NumberFormatException();
				i_9_ = i_13_;
				bool_8_ = true;
			}
			if (!bool_8_)
				throw new NumberFormatException();
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kb.f(").append(')').toString());
		}
	}
}
