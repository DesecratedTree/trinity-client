/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class389 {
	static int anInt4008 = -50;
	static int anInt4009 = -60;
	public static int[] anIntArray4010;
	static float aFloat4011 = 0.69921875F;
	static float aFloat4012 = 1.1523438F;
	Class260 aClass260_4013;
	Class367 aClass367_4014;
	static int anInt4015 = -50;
	static int anInt4016 = 0;
	Class367 aClass367_4017;
	static Class92 aClass92_4018;
	static Class308 aClass308_4019;
	static int anInt4020;
	Class_ra aClass_ra4021;
	Class394[][] aClass394ArrayArray4022;
	int anInt4023 = 0;
	int anInt4024 = 488756837;
	long aLong4025 = 0L;
	boolean aBoolean4026 = false;
	Class394 aClass394_4027;
	Class394 aClass394_4028;
	Class394 aClass394_4029;
	static int anInt4030 = 920306777;
	Class394 aClass394_4031;
	static int anInt4032 = 398735784;
	static float aFloat4033 = 1.2F;

	void method4576(int i) {
		try {
			((Class389) this).aClass_ra4021.IA((0.7F + (float) Class448.aClass330_Sub50_5555.aClass464_Sub1_7886.method5731(-1260293133) * 0.1F + client.aClass304_9030.method2989(-2017390368)) * ((Class394) ((Class389) this).aClass394_4028).aFloat4071);
			((Class389) this).aClass_ra4021.m((482946283 * ((Class394) ((Class389) this).aClass394_4028).anInt4080), ((Class394) ((Class389) this).aClass394_4028).aFloat4072, ((Class394) ((Class389) this).aClass394_4028).aFloat4070, (float) ((int) ((Class389) this).aClass260_4013.aFloat2716 << 2), (float) ((int) ((Class389) this).aClass260_4013.aFloat2715 << 2), (float) ((int) ((Class389) this).aClass260_4013.aFloat2711 << 2));
			((Class389) this).aClass_ra4021.cf(((Class394) (((Class389) this).aClass394_4028)).aClass92_4077);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.k(").append(')').toString());
		}
	}

	public Class394 method4577(int i) {
		try {
			return ((Class389) this).aClass394_4028;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.j(").append(')').toString());
		}
	}

	public void method4578(int i) {
		try {
			((Class389) this).aClass367_4017.method4298((byte) 26);
			((Class389) this).aClass367_4014.method4298((byte) 67);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.p(").append(')').toString());
		}
	}

	Class92 method4579(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_) {
		try {
			long l = ((long) i * 67481L ^ 97549L * (long) i_0_ ^ (long) i_1_ * 475427L ^ 986053L * (long) i_2_ ^ 32147369L * (long) i_3_ ^ (long) i_4_ * 76724863L);
			Class92 class92 = (Class92) ((Class389) this).aClass367_4017.get(l);
			if (class92 != null)
				return class92;
			class92 = ((Class389) this).aClass_ra4021.cl(i, i_0_, i_1_, i_2_, i_3_, i_4_);
			((Class389) this).aClass367_4017.put(class92, l);
			return class92;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.o(").append(')').toString());
		}
	}

	void method4580(int i, int i_6_, int i_7_, byte i_8_) {
		try {
			Class394 class394 = ((Class389) this).aClass394ArrayArray4022[i][i_6_];
			if (null == class394)
				class394 = ((Class389) this).aClass394_4027;
			if (((Class389) this).aBoolean4026) {
				((Class389) this).aBoolean4026 = false;
				i_7_ = 0;
			}
			if (!((Class389) this).aClass394_4031.method4624(class394, (byte) -5)) {
				((Class389) this).aClass394_4031.method4620(class394, (byte) -37);
				((Class389) this).aLong4025 = Class312.method3111((byte) 111) * 7250476296603600477L;
				((Class389) this).anInt4023 = ((((Class389) this).anInt4024 = i_7_ * -488756837) * 856239059);
				if (-1390560191 * ((Class389) this).anInt4023 != 0) {
					((Class389) this).aClass394_4029.method4620(((Class389) this).aClass394_4028, (byte) -85);
					if ((((Class394) ((Class389) this).aClass394_4028).aClass308_4081) != null) {
						if (((Class394) ((Class389) this).aClass394_4028).aClass308_4081.method3088(-1485331701))
							((Class394) ((Class389) this).aClass394_4028).aClass308_4081 = ((Class394) ((Class389) this).aClass394_4029).aClass308_4081 = ((Class394) ((Class389) this).aClass394_4028).aClass308_4081.method3081(1904519915);
						if ((((Class394) ((Class389) this).aClass394_4028).aClass308_4081) != null && ((((Class394) ((Class389) this).aClass394_4031).aClass308_4081) != (((Class394) ((Class389) this).aClass394_4028).aClass308_4081)))
							((Class394) ((Class389) this).aClass394_4028).aClass308_4081.method3084((((Class394) ((Class389) this).aClass394_4031).aClass308_4081), 1681245377);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.n(").append(')').toString());
		}
	}

	void method4581(int i) {
		try {
			if (1063916691 * ((Class389) this).anInt4024 >= 0) {
				long l = Class312.method3111((byte) 1);
				((Class389) this).anInt4024 -= -488756837L * (l - (((Class389) this).aLong4025 * 6664120306247040501L));
				if (1063916691 * ((Class389) this).anInt4024 > 0)
					((Class389) this).aClass394_4028.method4626(((Class389) this).aClass_ra4021, ((Class389) this).aClass394_4029, ((Class389) this).aClass394_4031, ((float) (-1390560191 * ((Class389) this).anInt4023 - 1063916691 * ((Class389) this).anInt4024) / (float) (-1390560191 * ((Class389) this).anInt4023)), 1153435902);
				else {
					((Class389) this).aClass394_4028.method4620(((Class389) this).aClass394_4031, (byte) -63);
					if ((((Class394) ((Class389) this).aClass394_4028).aClass308_4081) != null)
						((Class394) ((Class389) this).aClass394_4028).aClass308_4081.method3079((byte) -1);
					((Class389) this).anInt4024 = 488756837;
				}
				((Class389) this).aLong4025 = l * 7250476296603600477L;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.l(").append(')').toString());
		}
	}

	public void method4582(int i) {
		try {
			((Class389) this).aBoolean4026 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.b(").append(')').toString());
		}
	}

	public void method4583(int i) {
		try {
			int i_9_ = 0;
			int i_10_ = (((((Class394) ((Class389) this).aClass394_4028).anInt4076 * 1946776421) + 256 << 2) + i_9_);
			((Class389) this).aClass_ra4021.c((((Class394) (((Class389) this).aClass394_4028)).anInt4075) * 1843189665, (Class448.aClass330_Sub50_5555.aClass464_Sub3_7880.method5743((byte) 9) == 1 ? i_10_ : -1), 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.q(").append(')').toString());
		}
	}

	void method4584(byte i) {
		try {
			((Class389) this).aClass_ra4021.method4798(((Class394) ((Class389) this).aClass394_4028).aFloat4078, ((Class394) ((Class389) this).aClass394_4028).aFloat4073, ((Class394) ((Class389) this).aClass394_4028).aFloat4079, -624670866);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.u(").append(')').toString());
		}
	}

	public void method4585(short i) {
		try {
			((Class389) this).aClass_ra4021.IA((0.7F + (float) Class448.aClass330_Sub50_5555.aClass464_Sub1_7886.method5731(140856987) * 0.1F + client.aClass304_9030.method2989(-374367500)) * 1.1523438F);
			((Class389) this).aClass_ra4021.m(anInt4030 * -1149256681, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
			((Class389) this).aClass_ra4021.c(anInt4032 * 320407905, -1, 0);
			((Class389) this).aClass_ra4021.cf(aClass92_4018);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.x(").append(')').toString());
		}
	}

	static {
		anInt4020 = -676838789;
	}

	public void method4586(int i, int i_11_, Class394 class394, byte i_12_) {
		try {
			((Class389) this).aClass394ArrayArray4022[i][i_11_] = class394;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.f(").append(')').toString());
		}
	}

	Class308 method4587(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			long l = (((long) i_13_ & 0xffffL) << 48 | ((long) i_14_ & 0xffffL) << 32 | ((long) i_15_ & 0xffffL) << 16 | (long) i & 0xffffL);
			Class308 class308 = (Class308) ((Class389) this).aClass367_4014.get(l);
			if (null == class308) {
				class308 = Class341.aClass342_3397.method3985(i, i_13_, i_14_, i_15_, (Class446.aClass131_5549), (byte) 64);
				((Class389) this).aClass367_4014.put(class308, l);
			}
			return class308;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.s(").append(')').toString());
		}
	}

	public void method4588(Class389 class389_17_, int i) {
		try {
			((Class389) this).aClass394_4028.method4620((((Class389) class389_17_).aClass394_4028), (byte) -44);
			((Class389) this).aClass394_4029.method4620((((Class389) class389_17_).aClass394_4029), (byte) -94);
			((Class389) this).aClass394_4031.method4620((((Class389) class389_17_).aClass394_4031), (byte) -59);
			((Class389) this).aLong4025 = ((Class389) class389_17_).aLong4025 * 1L;
			((Class389) this).anInt4023 = ((Class389) class389_17_).anInt4023 * 1;
			((Class389) this).anInt4024 = ((Class389) class389_17_).anInt4024 * 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.i(").append(')').toString());
		}
	}

	public Class389(Class_ra class_ra, int i, int i_18_) {
		((Class389) this).aClass260_4013 = new Class260(-50.0F, -60.0F, -50.0F);
		((Class389) this).aClass367_4017 = new Class367(9);
		((Class389) this).aClass367_4014 = new Class367(9);
		((Class389) this).aClass_ra4021 = class_ra;
		((Class389) this).aClass394ArrayArray4022 = new Class394[i][i_18_];
		if (null != anIntArray4010)
			aClass92_4018 = method4579(anIntArray4010[0], anIntArray4010[1], anIntArray4010[2], anIntArray4010[3], anIntArray4010[4], anIntArray4010[5], (byte) 33);
		aClass308_4019 = null;
		((Class389) this).aClass394_4027 = new Class394();
		((Class389) this).aClass394_4028 = new Class394();
		((Class389) this).aClass394_4029 = new Class394();
		((Class389) this).aClass394_4031 = new Class394();
		method4582(793438864);
	}

	public void method4589(Class304 class304, int i) {
		try {
			if (Class522.method6230(-296919301 * client.anInt8995, 119437551) || Class226.method2307(client.anInt8995 * -296919301, (byte) 49))
				method4580(-1795110955 * Class471.anInt5612 >> 12, Class325_Sub3.anInt7484 * 1947030235 >> 12, anInt4020 * -47637259, (byte) -1);
			else {
				int i_19_ = -1;
				int i_20_ = -1;
				if (null != Class263_Sub2.myPlayer) {
					i_19_ = (Class263_Sub2.myPlayer.anIntArray10018[0]) >> 3;
					i_20_ = (Class263_Sub2.myPlayer.anIntArray10059[0]) >> 3;
				}
				if (i_19_ < 0 || i_19_ >= class304.method2990(-564384678) >> 3 || i_20_ < 0 || i_20_ >= class304.method3033((byte) -1) >> 3)
					method4580(class304.method2990(-820090437) >> 4, class304.method3033((byte) -24) >> 4, 0, (byte) -48);
				else
					method4580(i_19_, i_20_, -47637259 * anInt4020, (byte) -103);
			}
			method4581(2071702064);
			method4576(-1083865652);
			method4584((byte) 35);
			method4583(509758307);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.r(").append(')').toString());
		}
	}

	public void method4590(int i, int i_21_, byte i_22_) {
		try {
			Class394 class394 = ((Class389) this).aClass394ArrayArray4022[i][i_21_];
			if (null != class394)
				((Class389) this).aClass260_4013.method2582(((Class394) class394).aClass260_4074);
			method4576(242500053);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.w(").append(')').toString());
		}
	}

	public void method4591(int i) {
		try {
			for (int i_23_ = 0; i_23_ < ((Class389) this).aClass394ArrayArray4022.length; i_23_++) {
				for (int i_24_ = 0; i_24_ < (((Class389) this).aClass394ArrayArray4022[i_23_]).length; i_24_++)
					((Class389) this).aClass394ArrayArray4022[i_23_][i_24_] = ((Class389) this).aClass394_4027;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.z(").append(')').toString());
		}
	}

	public static void method4592(String[] strings, short[] is, int i) {
		try {
			Class201.method2162(strings, is, 0, strings.length - 1, -2041842046);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.r(").append(')').toString());
		}
	}

	static final void method4593(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			long l = (long) (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			long l_25_ = (long) (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) (l_25_ * l / 100L + l);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.zs(").append(')').toString());
		}
	}

	static final void method4594(Class430 class430, int i) {
		try {
			if (client.aString8972 != null)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = client.aString8972;
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.ajl(").append(')').toString());
		}
	}

	static final void method4595(Class430 class430, int i) {
		try {
			int i_26_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_26_, -1225357810);
			Class120 class120 = Class3.aClass120Array56[i_26_ >> 16];
			Class410.method5221(iComponentDefinitions, class120, class430, -1058742292);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.gd(").append(')').toString());
		}
	}

	static void method4596(int i, byte i_27_) {
		try {
			Class317.anInt3274 = i * -1323076675;
			Class3.aClass367_45.method4298((byte) 41);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.j(").append(')').toString());
		}
	}

	static final void method4597(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_28_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_29_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class423.method5303(i_28_, i_29_, true, 170698964);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.uv(").append(')').toString());
		}
	}

	static void method4598(int i) {
		try {
			Class3.aClass367_45.method4296(-1020414121);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.o(").append(')').toString());
		}
	}

	public static int[] method4599(byte i) {
		try {
			return new int[] { 590937471 * Class125.anInt1451, Class125.anInt1452 * 2101878867, -1208765049 * Class125.anInt1453 };
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("qc.i(").append(')').toString());
		}
	}
}
