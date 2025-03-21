/* Class166_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class166_Sub2 extends Class166 {
	Class260 aClass260_7325;
	Class260 aClass260_7326;
	Class244 aClass244_7327;
	boolean aBoolean7328;
	int anInt7329;
	int anInt7330;
	Class260 aClass260_7331;
	Class260 aClass260_7332 = new Class260();
	Interface6 anInterface6_7333;
	Class244 aClass244_7334;

	public void method2003(Interface6 interface6, Class260 class260, Class244 class244, boolean bool, int i, Class307 class307, int[][][] is, short i_0_) {
		try {
			((Class166_Sub2) this).anInterface6_7333 = interface6;
			((Class166_Sub2) this).aClass260_7332.method2582(class260);
			((Class166_Sub2) this).aClass244_7327.method2419(class244);
			((Class166_Sub2) this).aBoolean7328 = bool;
			((Class166_Sub2) this).anInt7329 = -1553361817 * i;
			((Class166_Sub2) this).anInt7330 = (((Class166_Sub2) this).anInterface6_7333.method79(489096283).anInt7716) * -2026522845;
			method2005(class307, is, -1997398250);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.h(").append(')').toString());
		}
	}

	public void method1966(float f, Class307 class307, int[][][] is, int i) {
		try {
			if (((Class166_Sub2) this).anInterface6_7333 != null) {
				method2005(class307, is, -1103196287);
				Class244 class244 = method2004(-491302188);
				((Class166_Sub2) this).aClass244_7334.method2432(class244, ((Class166_Sub2) this).aClass145_1699.method1700((byte) -56));
				class244.method2417();
				((Class166_Sub2) this).aClass260_7326.method2582(((Class166_Sub2) this).anInterface6_7333.method79(375211176).method3400(2087905371));
				((Class166_Sub2) this).aClass145_1699.method1672(true, f, ((Class166_Sub2) this).aClass260_7331, ((Class166_Sub2) this).aClass145_1699.method1712(652552364), ((Class166_Sub2) this).aClass260_7326, ((Class166_Sub2) this).aClass260_7325, 2045801888);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.r(").append(')').toString());
		}
	}

	Class244 method2004(int i) {
		try {
			Class244 class244 = Class244.method2416(((Class166_Sub2) this).aClass244_7327);
			if (((Class166_Sub2) this).aBoolean7328) {
				Class260 class260 = ((Class166_Sub2) this).anInterface6_7333.method73(277101108);
				if (class260.method2565() < (float) (((Class166_Sub2) this).anInt7329 * 798639959)) {
					class260 = Class260.method2577(0.0F, 0.0F, 1.0F);
					Class244 class244_1_ = ((Class166_Sub2) this).anInterface6_7333.method72(1590898014);
					class260.method2570(class244_1_);
				}
				class260.aFloat2715 = 0.0F;
				float f = (float) Math.atan2((double) class260.aFloat2716, (double) class260.aFloat2711);
				class260.method2550();
				Class244 class244_2_ = new Class244();
				class244_2_.method2427(0.0F, 1.0F, 0.0F, f);
				class244.method2429(class244_2_);
			}
			return class244;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.y(").append(')').toString());
		}
	}

	void method2005(Class307 class307, int[][][] is, int i) {
		try {
			if (method1985(641774542) && (((Class166_Sub2) this).aClass145_1699.method1697(-956706899) || ((Class166_Sub2) this).aClass145_1699.method1706(-1852801526))) {
				Class244 class244 = method2004(1950223614);
				if (((Class166_Sub2) this).aClass145_1699.method1706(-1842659433) && null == is) {
					/* empty */
				}
				class244.method2417();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.v(").append(')').toString());
		}
	}

	public boolean method1985(int i) {
		try {
			return !Float.isNaN(((Class166_Sub2) this).aClass260_7331.aFloat2716);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.j(").append(')').toString());
		}
	}

	public void method1967(Class138 class138, int i, int i_3_) {
		Class260 class260 = method1968((byte) -1);
		class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
		class138.anInt1531 = (int) -class260.aFloat2715 * 1868671083;
		class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_3_);
		class260.method2550();
	}

	public Class330_Sub28 method1969(byte i) {
		try {
			Class260 class260 = method1968((byte) -1);
			Class330_Sub28 class330_sub28 = new Class330_Sub28((((Class166_Sub2) this).anInt7330 * -205919875), (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
			class260.method2550();
			return class330_sub28;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.p(").append(')').toString());
		}
	}

	public Class260 method2006(int i) {
		try {
			return ((Class166_Sub2) this).aClass260_7331;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.ay(").append(')').toString());
		}
	}

	public Class260 method1979() {
		Class260 class260 = Class260.method2549(((Class166_Sub2) this).aClass260_7332);
		class260.method2570(((Class166_Sub2) this).aClass244_7334);
		Class260 class260_4_ = Class260.method2578(((Class166_Sub2) this).aClass260_7331, class260);
		class260.method2550();
		return class260_4_;
	}

	public float method2007(int i) {
		try {
			return Class240.method2395(((Class166_Sub2) this).aClass244_7327, 1206398271);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.al(").append(')').toString());
		}
	}

	public boolean method1978() {
		return !Float.isNaN(((Class166_Sub2) this).aClass260_7331.aFloat2716);
	}

	public void method1974(Buffer class330_sub46, short i) {
		try {
			Class128 class128 = Class501.method6125(class330_sub46.readUnsignedByte(482752623), -522124439);
			int i_5_ = class330_sub46.readUnsignedShort(-418609180);
			((Class166_Sub2) this).aClass260_7332.method2552(class330_sub46);
			((Class166_Sub2) this).aClass244_7327.method2434(class330_sub46);
			if (class330_sub46.readUnsignedByte(2053050793) == 1)
				((Class166_Sub2) this).aBoolean7328 = true;
			else
				((Class166_Sub2) this).aBoolean7328 = false;
			((Class166_Sub2) this).anInt7329 = class330_sub46.readUnsignedShort(386164312) * -1553361817;
			((Class166_Sub2) this).anInterface6_7333 = ((Class166_Sub2) this).aClass145_1699.method1691(-157373441).method65(class128, i_5_, (byte) 31);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.s(").append(')').toString());
		}
	}

	public void method1986(Class138 class138, int i, int i_6_) {
		Class260 class260 = method1968((byte) -1);
		class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
		class138.anInt1531 = (int) -class260.aFloat2715 * 1868671083;
		class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_6_);
		class260.method2550();
	}

	public float method2008(int i) {
		try {
			return Class101.method1214(((Class166_Sub2) this).aClass244_7327, -975059291);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.at(").append(')').toString());
		}
	}

	public boolean method1975() {
		return !Float.isNaN(((Class166_Sub2) this).aClass260_7331.aFloat2716);
	}

	public boolean method1976() {
		return !Float.isNaN(((Class166_Sub2) this).aClass260_7331.aFloat2716);
	}

	public boolean method1971() {
		return !Float.isNaN(((Class166_Sub2) this).aClass260_7331.aFloat2716);
	}

	public Class330_Sub28 method1984() {
		Class260 class260 = method1968((byte) -1);
		Class330_Sub28 class330_sub28 = new Class330_Sub28(((Class166_Sub2) this).anInt7330 * -205919875, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
		class260.method2550();
		return class330_sub28;
	}

	public Class330_Sub28 method1980() {
		Class260 class260 = method1968((byte) -1);
		Class330_Sub28 class330_sub28 = new Class330_Sub28(((Class166_Sub2) this).anInt7330 * -205919875, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
		class260.method2550();
		return class330_sub28;
	}

	public Class330_Sub28 method1981() {
		Class260 class260 = method1968((byte) -1);
		Class330_Sub28 class330_sub28 = new Class330_Sub28(((Class166_Sub2) this).anInt7330 * -205919875, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
		class260.method2550();
		return class330_sub28;
	}

	public Class330_Sub28 method1987() {
		Class260 class260 = method1968((byte) -1);
		Class330_Sub28 class330_sub28 = new Class330_Sub28(((Class166_Sub2) this).anInt7330 * -205919875, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
		class260.method2550();
		return class330_sub28;
	}

	public Class330_Sub28 method1982() {
		Class260 class260 = method1968((byte) -1);
		Class330_Sub28 class330_sub28 = new Class330_Sub28(((Class166_Sub2) this).anInt7330 * -205919875, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711);
		class260.method2550();
		return class330_sub28;
	}

	public void method1972(float f, Class307 class307, int[][][] is) {
		if (((Class166_Sub2) this).anInterface6_7333 != null) {
			method2005(class307, is, -838040077);
			Class244 class244 = method2004(-264819384);
			((Class166_Sub2) this).aClass244_7334.method2432(class244, ((Class166_Sub2) this).aClass145_1699.method1700((byte) 92));
			class244.method2417();
			((Class166_Sub2) this).aClass260_7326.method2582(((Class166_Sub2) this).anInterface6_7333.method79(1954580103).method3400(2087905371));
			((Class166_Sub2) this).aClass145_1699.method1672(true, f, ((Class166_Sub2) this).aClass260_7331, ((Class166_Sub2) this).aClass145_1699.method1712(652552364), ((Class166_Sub2) this).aClass260_7326, ((Class166_Sub2) this).aClass260_7325, 1706202642);
		}
	}

	public void method1977(Class138 class138, int i, int i_7_) {
		Class260 class260 = method1968((byte) -1);
		class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
		class138.anInt1531 = (int) -class260.aFloat2715 * 1868671083;
		class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_7_);
		class260.method2550();
	}

	public Class260 method2009(int i) {
		try {
			return ((Class166_Sub2) this).aClass260_7332;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.ac(").append(')').toString());
		}
	}

	public void method1965(Buffer class330_sub46) {
		Class128 class128 = Class501.method6125(class330_sub46.readUnsignedByte(1140909014), -1829711598);
		int i = class330_sub46.readUnsignedShort(1166616648);
		((Class166_Sub2) this).aClass260_7332.method2552(class330_sub46);
		((Class166_Sub2) this).aClass244_7327.method2434(class330_sub46);
		if (class330_sub46.readUnsignedByte(411796957) == 1)
			((Class166_Sub2) this).aBoolean7328 = true;
		else
			((Class166_Sub2) this).aBoolean7328 = false;
		((Class166_Sub2) this).anInt7329 = class330_sub46.readUnsignedShort(619619368) * -1553361817;
		((Class166_Sub2) this).anInterface6_7333 = ((Class166_Sub2) this).aClass145_1699.method1691(1537947687).method65(class128, i, (byte) 23);
	}

	public void method1970(Class138 class138, int i, int i_8_, byte i_9_) {
		try {
			Class260 class260 = method1968((byte) -1);
			class138.anInt1532 = -581921585 * ((int) class260.aFloat2716 - i);
			class138.anInt1531 = (int) -class260.aFloat2715 * 1868671083;
			class138.anInt1533 = -950728209 * ((int) class260.aFloat2711 - i_8_);
			class260.method2550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.o(").append(')').toString());
		}
	}

	public void method1983(float f, Class307 class307, int[][][] is) {
		if (((Class166_Sub2) this).anInterface6_7333 != null) {
			method2005(class307, is, -1358648903);
			Class244 class244 = method2004(-272424000);
			((Class166_Sub2) this).aClass244_7334.method2432(class244, ((Class166_Sub2) this).aClass145_1699.method1700((byte) 7));
			class244.method2417();
			((Class166_Sub2) this).aClass260_7326.method2582(((Class166_Sub2) this).anInterface6_7333.method79(103454714).method3400(2087905371));
			((Class166_Sub2) this).aClass145_1699.method1672(true, f, ((Class166_Sub2) this).aClass260_7331, ((Class166_Sub2) this).aClass145_1699.method1712(652552364), ((Class166_Sub2) this).aClass260_7326, ((Class166_Sub2) this).aClass260_7325, 2068218413);
		}
	}

	public Class260 method1968(byte i) {
		try {
			Class260 class260 = Class260.method2549(((Class166_Sub2) this).aClass260_7332);
			class260.method2570(((Class166_Sub2) this).aClass244_7334);
			Class260 class260_10_ = Class260.method2578(((Class166_Sub2) this).aClass260_7331, class260);
			class260.method2550();
			return class260_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.i(").append(')').toString());
		}
	}

	public void method1973(float f, Class307 class307, int[][][] is) {
		if (((Class166_Sub2) this).anInterface6_7333 != null) {
			method2005(class307, is, -1062053454);
			Class244 class244 = method2004(-2042363967);
			((Class166_Sub2) this).aClass244_7334.method2432(class244, ((Class166_Sub2) this).aClass145_1699.method1700((byte) -12));
			class244.method2417();
			((Class166_Sub2) this).aClass260_7326.method2582(((Class166_Sub2) this).anInterface6_7333.method79(852097621).method3400(2087905371));
			((Class166_Sub2) this).aClass145_1699.method1672(true, f, ((Class166_Sub2) this).aClass260_7331, ((Class166_Sub2) this).aClass145_1699.method1712(652552364), ((Class166_Sub2) this).aClass260_7326, ((Class166_Sub2) this).aClass260_7325, 2045675399);
		}
	}

	public Class166_Sub2(Class145 class145) {
		super(class145);
		((Class166_Sub2) this).aClass244_7327 = new Class244();
		((Class166_Sub2) this).anInt7329 = -1434718088;
		((Class166_Sub2) this).aClass260_7331 = new Class260(Float.NaN, Float.NaN, Float.NaN);
		((Class166_Sub2) this).aClass260_7326 = new Class260(Float.NaN, Float.NaN, Float.NaN);
		((Class166_Sub2) this).aClass260_7325 = new Class260();
		((Class166_Sub2) this).aClass244_7334 = new Class244();
	}

	static final void method2010(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			Class3[] class3s = client.aClass3Array8986;
			for (int i_17_ = 0; i_17_ < class3s.length; i_17_++) {
				Class3 class3 = class3s[i_17_];
				if (null != class3) {
					if (2 != -1598012345 * class3.anInt53) {
						if (i_16_ >= -1972183939)
							throw new IllegalStateException();
					} else {
						Class281.method2791((((Class3) class3).anInt48 * 790398161), -729840739 * class3.anInt51, class3.anInt50 * -848947047, (-1685617486 * ((Class3) class3).anInt55), (byte) -63);
						if (client.aFloatArray9253[0] > -1.0F && 822953439 * client.anInt8981 % 20 < 10) {
							Class61 class61 = (Class125.aClass61Array1457[((Class3) class3).anInt46 * -646855375]);
							int i_18_ = (int) (client.aFloatArray9253[0] + (float) i - 12.0F);
							int i_19_ = (int) (client.aFloatArray9253[1] + (float) i_11_ - 28.0F);
							class61.method687(i_18_, i_19_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.jg(").append(')').toString());
		}
	}

	static final void method2011(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class543.method6343(iComponentDefinitions, class430, 689585817);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aap.cj(").append(')').toString());
		}
	}
}
