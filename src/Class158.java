/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class158 implements Interface7 {
	IndexTable aClass280_6468;
	Class201 aClass201_6469;
	int anInt6470;
	Class263 aClass263_6471;
	IndexTable aClass280_6472;
	long aLong6473;
	public static Class561 aClass561_6474;

	public boolean method91() {
		boolean bool = true;
		if (!((Class158) this).aClass280_6472.method2750((1983469687 * (((Class158) this).aClass201_6469.anInt6508)), 1341481519))
			bool = false;
		if (!((Class158) this).aClass280_6468.method2750((1983469687 * (((Class158) this).aClass201_6469.anInt6508)), -561981561))
			bool = false;
		return bool;
	}

	public void method84() {
		Class524 class524 = Class375.method4356(((Class158) this).aClass280_6468, (((Class158) this).aClass201_6469.anInt6508 * 1983469687), -1641316415);
		((Class158) this).aClass263_6471 = (Class361.aClass_ra3793.ce(class524, ((Class87_Sub2[]) Class53.method642(((Class158) this).aClass280_6472, 1983469687 * (((Class158) this).aClass201_6469.anInt6508))), true));
	}

	public void method86(int i) {
		try {
			Class524 class524 = Class375.method4356(((Class158) this).aClass280_6468, (((Class158) this).aClass201_6469.anInt6508) * 1983469687, -1641316415);
			((Class158) this).aClass263_6471 = (Class361.aClass_ra3793.ce(class524, ((Class87_Sub2[]) Class53.method642(((Class158) this).aClass280_6472, 1983469687 * (((Class158) this).aClass201_6469.anInt6508))), true));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.r(").append(')').toString());
		}
	}

	public boolean method85(int i) {
		try {
			boolean bool = true;
			if (!((Class158) this).aClass280_6472.method2750(1983469687 * ((Class158) this).aClass201_6469.anInt6508, -1488200606))
				bool = false;
			if (!((Class158) this).aClass280_6468.method2750(1983469687 * ((Class158) this).aClass201_6469.anInt6508, -233205364))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.i(").append(')').toString());
		}
	}

	abstract void method1837(boolean bool, int i, int i_0_);

	abstract void method1838(boolean bool, int i, int i_1_);

	int method1839(int i) {
		try {
			int i_2_ = Class239.aClass240_2592.method2388((byte) -48);
			int i_3_ = i_2_ * 100;
			if (206037223 * ((Class158) this).anInt6470 == i_2_ && 0 != i_2_) {
				int i_4_ = Class239.aClass240_2592.method2387(1755167032);
				if (i_4_ > i_2_) {
					long l = (((Class158) this).aLong6473 * -2474492371679934849L - Class239.aClass240_2592.method2389(942561354));
					if (l > 0L) {
						long l_5_ = 10000L * l / (long) i_2_ * (long) (i_4_ - i_2_);
						long l_6_ = ((Class312.method3111((byte) 50) - (((Class158) this).aLong6473 * -2474492371679934849L)) * 10000L);
						if (l_6_ < l_5_)
							i_3_ = (int) ((long) (100 * i_2_) + ((long) (i_4_ - i_2_) * l_6_ * 100L / l_5_));
						else
							i_3_ = i_4_ * 100;
					}
				}
			} else {
				((Class158) this).anInt6470 = -2063387945 * i_2_;
				((Class158) this).aLong6473 = Class312.method3111((byte) 105) * 5814874387930364287L;
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.l(").append(')').toString());
		}
	}

	public void method90(boolean bool) {
		int i = ((((Class158) this).aClass201_6469.aClass195_6507.method2137(((Class158) this).aClass201_6469.anInt6505 * 1790195679, 64571523 * client.anInt9207, 1811708372)) + ((Class158) this).aClass201_6469.anInt6501 * 1735526707);
		int i_7_ = ((((Class158) this).aClass201_6469.aClass211_6502.method2221(((Class158) this).aClass201_6469.anInt6503 * -2072821429, client.anInt9118 * 1108170155, (byte) -98)) + ((Class158) this).aClass201_6469.anInt6504 * 27527681);
		method1842(bool, i, i_7_, (short) 27634);
		method1840(bool, i, i_7_, -552010646);
		String string = Class239.aClass240_2592.method2393((byte) 0);
		if ((Class312.method3111((byte) 46) - ((Class158) this).aLong6473 * -2474492371679934849L) > 10000L)
			string = new StringBuilder().append(string).append(" (").append((Class239.aClass240_2592.method2390(-1719455704).anInt2703) * -1090237427).append(")").toString();
		((Class158) this).aClass263_6471.method2595(string, 1790195679 * ((Class158) this).aClass201_6469.anInt6505 / 2 + i, (644698723 * ((Class158) this).aClass201_6469.anInt6506 + (i_7_ + ((Class158) this).aClass201_6469.anInt6503 * -2072821429 / 2 + 4)), ((Class158) this).aClass201_6469.anInt6509 * 1582406609, -1, 868233719);
	}

	public void method88() {
		Class524 class524 = Class375.method4356(((Class158) this).aClass280_6468, (((Class158) this).aClass201_6469.anInt6508 * 1983469687), -1641316415);
		((Class158) this).aClass263_6471 = (Class361.aClass_ra3793.ce(class524, ((Class87_Sub2[]) Class53.method642(((Class158) this).aClass280_6472, 1983469687 * (((Class158) this).aClass201_6469.anInt6508))), true));
	}

	public void method87(boolean bool, byte i) {
		try {
			int i_8_ = ((((Class158) this).aClass201_6469.aClass195_6507.method2137(((Class158) this).aClass201_6469.anInt6505 * 1790195679, 64571523 * client.anInt9207, 1872944241)) + ((Class158) this).aClass201_6469.anInt6501 * 1735526707);
			int i_9_ = ((((Class158) this).aClass201_6469.aClass211_6502.method2221(((Class158) this).aClass201_6469.anInt6503 * -2072821429, client.anInt9118 * 1108170155, (byte) -5)) + ((Class158) this).aClass201_6469.anInt6504 * 27527681);
			method1842(bool, i_8_, i_9_, (short) 29232);
			method1840(bool, i_8_, i_9_, -392218727);
			String string = Class239.aClass240_2592.method2393((byte) 0);
			if ((Class312.method3111((byte) 104) - ((Class158) this).aLong6473 * -2474492371679934849L) > 10000L)
				string = new StringBuilder().append(string).append(" (").append((Class239.aClass240_2592.method2390(-1719455704).anInt2703) * -1090237427).append(")").toString();
			((Class158) this).aClass263_6471.method2595(string, (1790195679 * ((Class158) this).aClass201_6469.anInt6505 / 2 + i_8_), (644698723 * ((Class158) this).aClass201_6469.anInt6506 + (i_9_ + (((Class158) this).aClass201_6469.anInt6503 * -2072821429 / 2) + 4)), ((Class158) this).aClass201_6469.anInt6509 * 1582406609, -1, -2115071540);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.j(").append(')').toString());
		}
	}

	abstract void method1840(boolean bool, int i, int i_10_, int i_11_);

	public void method89() {
		Class524 class524 = Class375.method4356(((Class158) this).aClass280_6468, (((Class158) this).aClass201_6469.anInt6508 * 1983469687), -1641316415);
		((Class158) this).aClass263_6471 = (Class361.aClass_ra3793.ce(class524, ((Class87_Sub2[]) Class53.method642(((Class158) this).aClass280_6472, 1983469687 * (((Class158) this).aClass201_6469.anInt6508))), true));
	}

	abstract void method1841(boolean bool, int i, int i_12_);

	Class158(IndexTable class280, IndexTable class280_13_, Class201 class201) {
		((Class158) this).aClass280_6472 = class280;
		((Class158) this).aClass280_6468 = class280_13_;
		((Class158) this).aClass201_6469 = class201;
	}

	abstract void method1842(boolean bool, int i, int i_14_, short i_15_);

	static final void method1843(Class430 class430, short i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_16_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_17_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			if (i_16_ == 0)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (int) Math.pow((double) i_16_, (double) i_17_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.zw(").append(')').toString());
		}
	}

	static final void method1844(Class430 class430, byte i) {
		try {
			int i_18_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions(i_18_, (byte) -17);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = itemDefinitions.aBoolean6716 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.abs(").append(')').toString());
		}
	}

	public static void method1845(int i) {
		try {
			Class196.method2141((byte) -9);
			Class3.method395(-1453321862);
			Class233.method2362((byte) 26);
			FileFilter_Sub1.method6487(2094588920);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.s(").append(')').toString());
		}
	}

	static void method1846(int i) {
		try {
			if (0 == -296919301 * client.anInt8995)
				Class500.method6121((byte) 0);
			ItemEquipDefinitions.method6215((byte) -75);
			client.aClass1_9060.method379(1175619289);
			Class76_Sub1_Sub3.aBoolean9380 = true;
			Class403.method4728(822837398);
			for (int i_19_ = 0; i_19_ < client.aClass3Array8986.length; i_19_++)
				client.aClass3Array8986[i_19_] = null;
			client.aBoolean9150 = false;
			Class562.method6472((byte) 0);
			client.anInt9156 = ((int) (Math.random() * 100.0) - 50) * 1781180613;
			client.anInt9056 = ((int) (Math.random() * 110.0) - 55) * -1221296743;
			client.anInt9058 = ((int) (Math.random() * 80.0) - 40) * 580205625;
			client.anInt9149 = ((int) (Math.random() * 120.0) - 60) * -1263686339;
			client.anInt9063 = ((int) (Math.random() * 30.0) - 20) * -176089047;
			client.aFloat9141 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
			Class440.method5607(1783869230);
			for (int i_20_ = 0; i_20_ < 2048; i_20_++)
				client.players[i_20_] = null;
			Class263_Sub2.myPlayer = null;
			client.anInt9017 = 0;
			client.anInt9232 = 0;
			client.aClass497_9014.method6100(65280);
			client.aClass471_9139.method5866(613065745);
			client.aClass497_9216.method6100(65280);
			client.aClass467_9061.method5851(65536);
			client.aClass497_9138.method6100(65280);
			Class330_Sub10.aClass471_7587 = new Class471();
			Class330_Sub10.aClass471_7588 = new Class471();
			aClass561_6474.method6463((short) -3669);
			Class330_Sub11.method3292(1378323034);
			Class204_Sub1.anInt8947 = 0;
			Class151.anInt6671 = 0;
			Class432_Sub1_Sub5_Sub1.anInt9963 = 0;
			Class511.anInt5955 = 0;
			Class544.anInt6257 = 0;
			Class150_Sub2.anInt7270 = 0;
			Class330_Sub39.anInt7766 = 0;
			Class366.anInt3856 = 0;
			Class355.anInt3638 = 0;
			Class18.anInt238 = 0;
			for (int i_21_ = 0; i_21_ < Class555.anIntArray6382.length; i_21_++) {
				if (!Class330_Sub26.aBooleanArray7696[i_21_])
					Class555.anIntArray6382[i_21_] = -1;
			}
			if (-1 != client.windowPaneId * 1522181389)
				Class308.method3091(1522181389 * client.windowPaneId, (byte) 7);
			for (Class330_Sub48 class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6099((byte) 55)); class330_sub48 != null; class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6098((short) -32768))) {
				if (!class330_sub48.method3251(122249317)) {
					class330_sub48 = ((Class330_Sub48) client.aClass497_9284.method6099((byte) -38));
					if (null == class330_sub48) {
						if (i == 1826366115)
							break;
						return;
					}
				}
				Class75.method854(class330_sub48, true, false, -1259378678);
			}
			client.windowPaneId = -1292218821;
			client.aClass497_9284 = new Class497(8);
			Class470.method5865(16711680);
			client.aClass114_9078 = null;
			for (int i_22_ = 0; i_22_ < 8; i_22_++) {
				client.aStringArray9167[i_22_] = null;
				client.aBooleanArray9136[i_22_] = false;
				client.anIntArray9134[i_22_] = -1;
			}
			Class356.method4191(-2069731511);
			client.aBoolean8979 = true;
			for (int i_23_ = 0; i_23_ < 113; i_23_++)
				client.aBooleanArray9230[i_23_] = true;
			for (int i_24_ = 0; i_24_ < 6; i_24_++)
				client.aClass286Array9234[i_24_] = new Class286();
			client.aClass304_9030.method3008(606838751).method4582(-2104578086);
			client.aBoolean9038 = true;
			IndexTable.aShortArray2907 = Class473.aShortArray5631 = Class551.aShortArray6351 = ItemDefinitions.otherModifiedModelColors = new short[256];
			Class276.aString2861 = Class526.aClass526_6166.method6257(Class429.aClass454_4369, 991479434);
			Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub20_7889, Class448.aClass330_Sub50_5555.aClass464_Sub20_7888.method5807((byte) 83), -142517125);
			client.anInt9027 = 0;
			Class330_Sub14.method3319((byte) 0);
			Class19.method462(-1621590955);
			Class95_Sub5.aClass422_7146 = null;
			Class198.aLong1925 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gl.at(").append(')').toString());
		}
	}
}
