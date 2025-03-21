/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class305 {
	Class497 aClass497_3111;
	IndexTable aClass280_3112;
	Class497 aClass497_3113 = new Class497(256);
	Class497 aClass497_3114;
	IndexTable aClass280_3115;

	public Class330_Sub29_Sub1_Sub1 method3038(int i, int[] is, int i_0_) {
		try {
			if (((Class305) this).aClass280_3112.method2764(2092385061) == 1)
				return method3040(0, i, is, -764071908);
			if (((Class305) this).aClass280_3112.method2763(i, -2118834573) == 1)
				return method3040(i, 0, is, -1000741302);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.p(").append(')').toString());
		}
	}

	Class330_Sub29_Sub1_Sub2 method3039(int i, int i_1_, int[] is, byte i_2_) {
		try {
			int i_3_ = i_1_ ^ (i << 4 & 0xffff | i >>> 12);
			i_3_ |= i << 16;
			long l = (long) i_3_;
			Class330_Sub29_Sub1_Sub2 class330_sub29_sub1_sub2 = ((Class330_Sub29_Sub1_Sub2) ((Class305) this).aClass497_3114.method6094(l));
			if (null != class330_sub29_sub1_sub2)
				return class330_sub29_sub1_sub2;
			if (is != null && is[0] <= 0)
				return null;
			Class302 class302 = Class302.method2982(((Class305) this).aClass280_3115, i, i_1_);
			if (null == class302)
				return null;
			class330_sub29_sub1_sub2 = class302.method2981();
			((Class305) this).aClass497_3114.method6097(class330_sub29_sub1_sub2, l);
			if (null != is)
				is[0] -= (((Class330_Sub29_Sub1_Sub2) class330_sub29_sub1_sub2).aByteArray10135).length;
			return class330_sub29_sub1_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.r(").append(')').toString());
		}
	}

	Class330_Sub29_Sub1_Sub1 method3040(int i, int i_4_, int[] is, int i_5_) {
		try {
			int i_6_ = i_4_ ^ (i << 4 & 0xffff | i >>> 12);
			i_6_ |= i << 16;
			long l = (long) i_6_ ^ 0x100000000L;
			Class330_Sub29_Sub1_Sub1 class330_sub29_sub1_sub1 = ((Class330_Sub29_Sub1_Sub1) ((Class305) this).aClass497_3111.method6094(l));
			if (class330_sub29_sub1_sub1 != null)
				return class330_sub29_sub1_sub1;
			if (null != is && is[0] <= 0)
				return null;
			Class330_Sub41 class330_sub41 = ((Class330_Sub41) ((Class305) this).aClass497_3113.method6094(l));
			if (null == class330_sub41) {
				class330_sub41 = Class330_Sub41.method3703((((Class305) this).aClass280_3112), i, i_4_);
				if (null == class330_sub41)
					return null;
				((Class305) this).aClass497_3113.method6097(class330_sub41, l);
			}
			class330_sub29_sub1_sub1 = class330_sub41.method3699();
			if (class330_sub29_sub1_sub1 == null)
				return null;
			class330_sub41.method3252(-1134314534);
			((Class305) this).aClass497_3111.method6097(class330_sub29_sub1_sub1, l);
			return class330_sub29_sub1_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.j(").append(')').toString());
		}
	}

	public Class330_Sub29_Sub1_Sub2 method3041(int i, int[] is, int i_7_) {
		try {
			if (((Class305) this).aClass280_3115.method2764(1887647912) == 1)
				return method3039(0, i, is, (byte) 83);
			if (((Class305) this).aClass280_3115.method2763(i, -2074988742) == 1)
				return method3039(i, 0, is, (byte) 101);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.i(").append(')').toString());
		}
	}

	public Class305(IndexTable class280, IndexTable class280_8_) {
		((Class305) this).aClass497_3111 = new Class497(256);
		((Class305) this).aClass497_3114 = new Class497(256);
		((Class305) this).aClass280_3115 = class280;
		((Class305) this).aClass280_3112 = class280_8_;
	}

	public static void method3042(int i, int i_9_) {
		try {
			synchronized (Class408.aClass367_4202) {
				Class408.aClass367_4202.method4292(i, (byte) 99);
			}
			synchronized (Class408.aClass367_4207) {
				Class408.aClass367_4207.method4292(i, (byte) 103);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.k(").append(')').toString());
		}
	}

	static final void method3043(Class430 class430, int i) {
		try {
			int i_10_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_10_, -1101403893);
			Class120 class120 = Class3.aClass120Array56[i_10_ >> 16];
			Class215.method2236(iComponentDefinitions, class120, class430, (byte) 112);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.cp(").append(')').toString());
		}
	}

	static final void method3044(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class367.method4300(iComponentDefinitions, class120, class430, -2012052883);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.on(").append(')').toString());
		}
	}

	static final void method3045(Class430 class430, byte i) {
		try {
			Class134.method1575((byte) 12);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.afj(").append(')').toString());
		}
	}

	static final void method3046(Class430 class430, byte i) {
		try {
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub13_7893, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]) == 1 ? 1 : 0, -1259491564);
			Class435.method5568(2054427381);
			Class22.method473((byte) 54);
			client.aBoolean9194 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.akl(").append(')').toString());
		}
	}

	static final void method3047(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class89.method1059(iComponentDefinitions, class120, class430, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.oa(").append(')').toString());
		}
	}

	public static final void method3048(byte i) {
		try {
			for (Class330_Sub10 class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7587.method5869(539664854)); class330_sub10 != null; class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7587.method5873((byte) -42)) {
				if (!((Class330_Sub10) class330_sub10).aBoolean7586) {
					((Class330_Sub10) class330_sub10).aBoolean7583 = true;
					if (-533165901 * class330_sub10.anInt7582 >= 0 && class330_sub10.anInt7577 * 2127793995 >= 0 && (class330_sub10.anInt7582 * -533165901 < client.aClass304_9030.method2990(-1180802296)) && (2127793995 * class330_sub10.anInt7577 < client.aClass304_9030.method3033((byte) -40)))
						Class313.method3117(class330_sub10, 740296243);
				} else
					class330_sub10.method3252(-1026808937);
			}
			for (Class330_Sub10 class330_sub10 = ((Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854)); null != class330_sub10; class330_sub10 = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -16)) {
				if (!((Class330_Sub10) class330_sub10).aBoolean7586)
					((Class330_Sub10) class330_sub10).aBoolean7583 = true;
				else
					class330_sub10.method3252(-830253156);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.i(").append(')').toString());
		}
	}

	static void method3049(Class_ra class_ra, byte i) {
		try {
			if (Class484.aBoolean5782)
				Class330_Sub34.method3437(class_ra, -1809584510);
			else
				Class464.method5729(class_ra, -427290244);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.v(").append(')').toString());
		}
	}

	static void method3050(int i, int i_11_, int i_12_, byte i_13_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(11, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = i_11_ * 229745735;
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9626 = i_12_ * 1924827181;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ms.az(").append(')').toString());
		}
	}
}
