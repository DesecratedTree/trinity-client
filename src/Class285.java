/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;

public abstract class Class285 {
	static int anInt2929 = 50;
	Buffer aClass330_Sub46_2930;
	static int anInt2931 = 20;
	public volatile int anInt2932;
	Class472 aClass472_2933 = new Class472();
	Class472 aClass472_2934 = new Class472();
	Buffer aClass330_Sub46_2935;
	Class472 aClass472_2936;
	int anInt2937;
	long aLong2938;
	static int anInt2939 = 512;
	byte aByte2940;
	public volatile int anInt2941;
	static int anInt2942 = 3;
	Class330_Sub36_Sub16_Sub2 aClass330_Sub36_Sub16_Sub2_2943;
	Class472 aClass472_2944 = new Class472();

	public abstract void method2831(int i);

	Class330_Sub36_Sub16_Sub2 method2832(int i, int i_0_, byte i_1_, boolean bool, byte i_2_) {
		try {
			long l = (long) i_0_ + ((long) i << 32);
			Class330_Sub36_Sub16_Sub2 class330_sub36_sub16_sub2 = new Class330_Sub36_Sub16_Sub2();
			class330_sub36_sub16_sub2.aLong7734 = -8616098919773127473L * l;
			((Class330_Sub36_Sub16_Sub2) class330_sub36_sub16_sub2).aByte10152 = i_1_;
			((Class330_Sub36_Sub16_Sub2) class330_sub36_sub16_sub2).aBoolean9723 = bool;
			if (bool) {
				if (method2835(16777215) >= 50)
					throw new RuntimeException();
				((Class285) this).aClass472_2933.method5883(class330_sub36_sub16_sub2, -498619459);
			} else {
				if (method2842(539917268) >= 20)
					throw new RuntimeException();
				((Class285) this).aClass472_2944.method5883(class330_sub36_sub16_sub2, -477021642);
			}
			return class330_sub36_sub16_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.r(").append(')').toString());
		}
	}

	Class285() {
		((Class285) this).aClass472_2936 = new Class472();
		((Class285) this).aClass330_Sub46_2935 = new Buffer(6);
		((Class285) this).aByte2940 = (byte) 0;
		anInt2941 = 0;
		anInt2932 = 0;
		((Class285) this).aClass330_Sub46_2930 = new Buffer(10);
	}

	boolean method2833(byte i) {
		try {
			return method2835(16777215) >= 50;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.i(").append(')').toString());
		}
	}

	public abstract void method2834();

	public int method2835(int i) {
		try {
			return (((Class285) this).aClass472_2933.method5887(-588880570) + ((Class285) this).aClass472_2934.method5887(-2039613917));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.o(").append(')').toString());
		}
	}

	abstract void method2836(int i);

	public abstract boolean method2837(byte i);

	public abstract void method2838(Object object, boolean bool, byte i);

	public abstract void method2839(boolean bool, int i);

	public abstract void method2840(byte i);

	public abstract boolean method2841();

	int method2842(int i) {
		try {
			return (((Class285) this).aClass472_2944.method5887(-1069369281) + ((Class285) this).aClass472_2936.method5887(-374935562));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.p(").append(')').toString());
		}
	}

	public abstract void method2843(Object object, boolean bool);

	boolean method2844(byte i) {
		try {
			return method2842(-1170115806) >= 20;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.j(").append(')').toString());
		}
	}

	abstract void method2845();

	abstract void method2846();

	public abstract void method2847(Object object, boolean bool);

	public abstract void method2848(int i);

	public abstract void method2849();

	public abstract void method2850(boolean bool);

	public abstract void method2851(boolean bool);

	public abstract void method2852(boolean bool);

	public abstract void method2853();

	public abstract void method2854();

	public abstract void method2855();

	public abstract void method2856();

	public abstract void method2857();

	public abstract void method2858();

	static void method2859(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 2] = (Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 2]), -1929591661).method4639(client.anIntArray9143, (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1]), (byte) 18)) ? 1 : 0;
			((Class430) class430).anInt4376 -= -1390004513;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.u(").append(')').toString());
		}
	}

	static final void method2860(Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_3_, 162169918);
			Class120 class120 = Class3.aClass120Array56[i_3_ >> 16];
			Class412.method5235(iComponentDefinitions, class120, class430, 650556859);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.eg(").append(')').toString());
		}
	}

	static final void method2861(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1249 = Class288.method2886(string, class430, 1530994362);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.la(").append(')').toString());
		}
	}

	public static void method2862(Object object, int i) {
		try {
			if (null != Class170.anEventQueue1724) {
				for (int i_4_ = 0; (i_4_ < 50 && Class170.anEventQueue1724.peekEvent() != null); i_4_++)
					Class464_Sub21.method5813(1L);
				try {
					if (object != null)
						Class170.anEventQueue1724.postEvent(new ActionEvent(object, 1001, "dummy"));
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.t(").append(')').toString());
		}
	}

	static void method2863(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int i, byte i_5_) {
		try {
			if (class432_sub1_sub1_sub1.anIntArray10030 != null) {
				Class299 class299 = ((Class299) Class479.method6015(Class487_Sub1.method6040(-139826911), i, (byte) 102));
				int i_6_ = (class432_sub1_sub1_sub1.anIntArray10030[class299.method2971((byte) -62)]);
				if (i_6_ != class432_sub1_sub1_sub1.aClass477_10032.method5967((byte) -80)) {
					class432_sub1_sub1_sub1.aClass477_10032.method5984(i_6_, class432_sub1_sub1_sub1.aClass477_10032.method5973((byte) 1), (short) -1528);
					class432_sub1_sub1_sub1.anInt10006 = class432_sub1_sub1_sub1.anInt10056 * -443009881;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("lw.ii(").append(')').toString());
		}
	}
}
