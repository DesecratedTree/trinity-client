/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class149 implements Interface7 {
	Class61 aClass61_6459;
	IndexTable aClass280_6460;
	Class204 aClass204_6461;

	public void method90(boolean bool) {
		if (bool) {
			int i = ((((Class149) this).aClass204_6461.aClass195_6512.method2137(((Class149) this).aClass61_6459.method318(), client.anInt9207 * 64571523, 1092270214)) + ((Class149) this).aClass204_6461.anInt6515 * -25392083);
			int i_0_ = ((((Class149) this).aClass204_6461.aClass211_6514.method2221(((Class149) this).aClass61_6459.method683(), client.anInt9118 * 1108170155, (byte) -128)) + ((Class149) this).aClass204_6461.anInt6516 * 722678607);
			((Class149) this).aClass61_6459.method687(i, i_0_);
		}
	}

	public void method86(int i) {
		try {
			((Class149) this).aClass61_6459 = Class20.method464(((Class149) this).aClass280_6460, 932112507 * (((Class149) this).aClass204_6461.anInt6513), 1305175639);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.r(").append(')').toString());
		}
	}

	public void method87(boolean bool, byte i) {
		try {
			if (bool) {
				int i_1_ = ((((Class149) this).aClass204_6461.aClass195_6512.method2137(((Class149) this).aClass61_6459.method318(), client.anInt9207 * 64571523, 851715076)) + (((Class149) this).aClass204_6461.anInt6515 * -25392083));
				int i_2_ = ((((Class149) this).aClass204_6461.aClass211_6514.method2221(((Class149) this).aClass61_6459.method683(), client.anInt9118 * 1108170155, (byte) -86)) + (((Class149) this).aClass204_6461.anInt6516 * 722678607));
				((Class149) this).aClass61_6459.method687(i_1_, i_2_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.j(").append(')').toString());
		}
	}

	Class149(IndexTable class280, Class204 class204) {
		((Class149) this).aClass280_6460 = class280;
		((Class149) this).aClass204_6461 = class204;
	}

	public void method89() {
		((Class149) this).aClass61_6459 = Class20.method464(((Class149) this).aClass280_6460, (932112507 * ((Class149) this).aClass204_6461.anInt6513), -883817990);
	}

	public void method88() {
		((Class149) this).aClass61_6459 = Class20.method464(((Class149) this).aClass280_6460, (932112507 * ((Class149) this).aClass204_6461.anInt6513), -1079180066);
	}

	public boolean method85(int i) {
		try {
			return (((Class149) this).aClass280_6460.method2750(((Class149) this).aClass204_6461.anInt6513 * 932112507, 1210925720));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.i(").append(')').toString());
		}
	}

	public void method84() {
		((Class149) this).aClass61_6459 = Class20.method464(((Class149) this).aClass280_6460, (932112507 * ((Class149) this).aClass204_6461.anInt6513), -1251732778);
	}

	public boolean method91() {
		return ((Class149) this).aClass280_6460.method2750(((((Class149) this).aClass204_6461.anInt6513) * 932112507), 2069831710);
	}

	static void method1756(Class430 class430, byte i) {
		try {
			Class395 class395 = Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), -1381611984);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (null == class395.anIntArray4096 ? 0 : class395.anIntArray4096.length);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.x(").append(')').toString());
		}
	}

	static final void method1757(Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = Class2.aClass523_44.method6233(i_3_, 1476886829).method3451((byte) -101);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.adg(").append(')').toString());
		}
	}

	static void method1758(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 - 1] = Class131.aClass407_1502.method4752((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1]), -1396976474).method4633(Class158.aClass561_6474, (byte) 83) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.t(").append(')').toString());
		}
	}

	static void method1759(Buffer class330_sub46, int i) {
		try {
			for (int i_4_ = 0; i_4_ < Class398.anInt4118 * 1369616735; i_4_++) {
				int i_5_ = class330_sub46.readSmart(-523445404);
				int i_6_ = class330_sub46.readUnsignedShort(573547895);
				if (65535 == i_6_)
					i_6_ = -1;
				if (null != Class132.aClass401_Sub1Array1505[i_5_])
					Class132.aClass401_Sub1Array1505[i_5_].anInt4133 = 645292405 * i_6_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.p(").append(')').toString());
		}
	}

	static void method1760(Class325_Sub1 class325_sub1, int i) {
		try {
			((Class325_Sub1) class325_sub1).aClass432_Sub1_Sub1_Sub1_7475 = null;
			if (Class325_Sub1.anInt7472 * -608288539 < 20) {
				Class325_Sub1.aClass467_7476.method5852(class325_sub1, (byte) 1);
				Class325_Sub1.anInt7472 += 1606647021;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.i(").append(')').toString());
		}
	}

	static final void method1761(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class20.method468(iComponentDefinitions, class120, class430, 856044965);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.ml(").append(')').toString());
		}
	}

	static final void method1762(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class370.aBoolean6771 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.aol(").append(')').toString());
		}
	}

	static final void method1763(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (((Class430) class430).aClass154_4391.method1799((String) (((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 -= 2087905371) * -1378875437)]), -899429979));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.xq(").append(')').toString());
		}
	}

	public static void method1764(int i, int i_7_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(20, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ga.ac(").append(')').toString());
		}
	}
}
