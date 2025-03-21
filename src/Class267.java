/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class267 implements Runnable {
	Thread aThread2736;
	int anInt2737;
	boolean aBoolean2738;
	Class472 aClass472_2739 = new Class472();
	public static Frame aFrame2740;

	Class330_Sub36_Sub16_Sub1 method2649(int i, Class339 class339, byte i_0_) {
		try {
			Class330_Sub36_Sub16_Sub1 class330_sub36_sub16_sub1 = new Class330_Sub36_Sub16_Sub1();
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).anInt10146 = 103023593;
			synchronized (((Class267) this).aClass472_2739) {
				for (Class330_Sub36_Sub16_Sub1 class330_sub36_sub16_sub1_1_ = ((Class330_Sub36_Sub16_Sub1) ((Class267) this).aClass472_2739.method5884((byte) 78)); class330_sub36_sub16_sub1_1_ != null; class330_sub36_sub16_sub1_1_ = ((Class330_Sub36_Sub16_Sub1) ((Class267) this).aClass472_2739.method5886((short) 8192))) {
					if ((long) i == (-6756588965814089169L * class330_sub36_sub16_sub1_1_.aLong7734) && (((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1_1_).aClass339_10150 == class339) && 2 == (((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1_1_).anInt10146 * -1775041447)) {
						((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aByteArray10151 = ((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1_1_).aByteArray10151;
						((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aBoolean9721 = false;
						Class330_Sub36_Sub16_Sub1 class330_sub36_sub16_sub1_2_ = class330_sub36_sub16_sub1;
						return class330_sub36_sub16_sub1_2_;
					}
				}
			}
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aByteArray10151 = class339.method3961(i, (byte) -44);
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aBoolean9721 = false;
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aBoolean9723 = true;
			return class330_sub36_sub16_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.r(").append(')').toString());
		}
	}

	void method2650(Class330_Sub36_Sub16_Sub1 class330_sub36_sub16_sub1, int i) {
		try {
			synchronized (((Class267) this).aClass472_2739) {
				((Class267) this).aClass472_2739.method5883(class330_sub36_sub16_sub1, -1235251704);
				((Class267) this).anInt2737 += 1198125389;
				((Class267) this).aClass472_2739.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.p(").append(')').toString());
		}
	}

	Class330_Sub36_Sub16_Sub1 method2651(int i, Class339 class339, int i_3_) {
		try {
			Class330_Sub36_Sub16_Sub1 class330_sub36_sub16_sub1 = new Class330_Sub36_Sub16_Sub1();
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).anInt10146 = 309070779;
			class330_sub36_sub16_sub1.aLong7734 = (long) i * -8616098919773127473L;
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aClass339_10150 = class339;
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aBoolean9723 = false;
			method2650(class330_sub36_sub16_sub1, 1330655408);
			return class330_sub36_sub16_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.i(").append(')').toString());
		}
	}

	public void run() {
		try {
			while (!((Class267) this).aBoolean2738) {
				Class330_Sub36_Sub16_Sub1 class330_sub36_sub16_sub1;
				synchronized (((Class267) this).aClass472_2739) {
					class330_sub36_sub16_sub1 = ((Class330_Sub36_Sub16_Sub1) ((Class267) this).aClass472_2739.method5888(1625224277));
					if (class330_sub36_sub16_sub1 != null)
						((Class267) this).anInt2737 -= 1198125389;
					else {
						try {
							((Class267) this).aClass472_2739.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					if (2 == (((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).anInt10146 * -1775041447))
						((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aClass339_10150.method3962((int) (class330_sub36_sub16_sub1.aLong7734 * -6756588965814089169L), ((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aByteArray10151, (((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aByteArray10151).length, (short) -16630);
					else if (3 == -1775041447 * (((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).anInt10146))
						((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aByteArray10151 = (((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aClass339_10150.method3961((int) (class330_sub36_sub16_sub1.aLong7734 * -6756588965814089169L), (byte) -49));
				} catch (Exception exception) {
					Class207.method2195(null, exception, -306254718);
				}
				((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aBoolean9721 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.run(").append(')').toString());
		}
	}

	Class330_Sub36_Sub16_Sub1 method2652(int i, byte[] is, Class339 class339, int i_4_) {
		try {
			Class330_Sub36_Sub16_Sub1 class330_sub36_sub16_sub1 = new Class330_Sub36_Sub16_Sub1();
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).anInt10146 = 206047186;
			class330_sub36_sub16_sub1.aLong7734 = -8616098919773127473L * (long) i;
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aByteArray10151 = is;
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aClass339_10150 = class339;
			((Class330_Sub36_Sub16_Sub1) class330_sub36_sub16_sub1).aBoolean9723 = false;
			method2650(class330_sub36_sub16_sub1, -725239778);
			return class330_sub36_sub16_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.j(").append(')').toString());
		}
	}

	public void method2653(byte i) {
		try {
			((Class267) this).aBoolean2738 = true;
			synchronized (((Class267) this).aClass472_2739) {
				((Class267) this).aClass472_2739.notifyAll();
			}
			try {
				((Class267) this).aThread2736.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			((Class267) this).aThread2736 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.o(").append(')').toString());
		}
	}

	public Class267() {
		((Class267) this).anInt2737 = 0;
		((Class267) this).aBoolean2738 = false;
		((Class267) this).aThread2736 = new Thread(this);
		((Class267) this).aThread2736.setDaemon(true);
		((Class267) this).aThread2736.start();
		((Class267) this).aThread2736.setPriority(1);
	}

	static final void method2654(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -1843384083 * iComponentDefinitions.anInt1354;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.pc(").append(')').toString());
		}
	}

	static final void method2655(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_5_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_6_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			int i_7_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			boolean bool = 1 == (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 3]);
			if (Class401_Sub1.aClass145_Sub1_8249.method1718(1948853394) != Class146.aClass146_1611)
				throw new RuntimeException();
			Class475_Sub1 class475_sub1 = ((Class475_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1715(-1089224319));
			Player class432_sub1_sub1_sub1_sub1 = Class263_Sub2.myPlayer;
			if (null != class432_sub1_sub1_sub1_sub1)
				class475_sub1.method5945(class432_sub1_sub1_sub1_sub1, new Class260((float) i_5_, (float) i_6_, (float) i_7_), bool, (short) 128);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.ahi(").append(')').toString());
		}
	}

	static final void method2656(Class430 class430, int i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub9_7899, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), 450416033);
			Class435.method5568(1427327421);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.aky(").append(')').toString());
		}
	}

	static final void method2657(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).aClass330_Sub39_4395.aByte7764;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.ye(").append(')').toString());
		}
	}

	static final void method2658(Class430 class430, short i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -1053848421 * iComponentDefinitions.anInt1335;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ld.qj(").append(')').toString());
		}
	}
}
