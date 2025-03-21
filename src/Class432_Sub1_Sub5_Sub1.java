/* Class432_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432_Sub1_Sub5_Sub1 extends Class432_Sub1_Sub5 implements Interface2 {
	Class_na aClass_na9950;
	static int[] anIntArray9951;
	Class463 aClass463_9952;
	boolean aBoolean9953;
	boolean aBoolean9954;
	boolean aBoolean9955;
	int anInt9956;
	byte aByte9957;
	byte aByte9958;
	static int[] anIntArray9959 = { 1, 2, 4, 8 };
	Class348 aClass348_9960;
	boolean aBoolean9961;
	Class387 aClass387_9962;
	static int anInt9963;

	Class353 method5405(Class_ra class_ra, int i) {
		try {
			if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 == null)
				return null;
			Class247 class247 = method5355();
			Class353 class353 = Class497.method6105((((Class432_Sub1_Sub5_Sub1) this).aBoolean9955), (byte) 16);
			((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4475(class247, aClass80Array8656[0], 0);
			return class353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bf(").append(')').toString());
		}
	}

	boolean method5382(int i) {
		try {
			if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
				return !((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.ao(").append(')').toString());
		}
	}

	boolean method5395(int i) {
		try {
			if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
				return ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bg(").append(')').toString());
		}
	}

	public Class432_Sub1_Sub5_Sub1(Class356 class356, Class_ra class_ra, Class463 class463, Class473 class473, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, boolean bool_6_) {
		super(class356, i_1_, i_2_, i_3_, i, i_0_, Class112.method1377(i_4_, i_5_, -635999601));
		((Class432_Sub1_Sub5_Sub1) this).aClass463_9952 = class463;
		((Class432_Sub1_Sub5_Sub1) this).anInt9956 = class473.anInt5657 * 1910961669;
		((Class432_Sub1_Sub5_Sub1) this).aBoolean9953 = bool;
		((Class432_Sub1_Sub5_Sub1) this).aByte9958 = (byte) i_4_;
		((Class432_Sub1_Sub5_Sub1) this).aByte9957 = (byte) i_5_;
		((Class432_Sub1_Sub5_Sub1) this).aBoolean9955 = -1012368965 * class473.anInt5637 != 0 && !bool;
		((Class432_Sub1_Sub5_Sub1) this).aBoolean9961 = bool_6_;
		((Class432_Sub1_Sub5_Sub1) this).aBoolean9954 = (class_ra.y() && class473.aBoolean5685 && !((Class432_Sub1_Sub5_Sub1) this).aBoolean9953 && Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(-343351218) != 0);
		int i_7_ = 2048;
		if (((Class432_Sub1_Sub5_Sub1) this).aBoolean9961)
			i_7_ |= 0x10000;
		if (class473.aBoolean5683)
			i_7_ |= 0x80000;
		Class485 class485 = method5545(class_ra, i_7_, ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954, (byte) -72);
		if (null != class485) {
			((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 = (Class387) class485.anObject5824;
			((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = (Class_na) class485.anObject5823;
			if (((Class432_Sub1_Sub5_Sub1) this).aBoolean9961 || class473.aBoolean5683) {
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 = ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4446((byte) 0, i_7_, false);
				if (class473.aBoolean5683) {
					Class312 class312 = client.aClass304_9030.method3027((byte) -64);
					((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.PA(-1401845759 * class312.anInt3250, class312.anInt3248 * -1626874045, class312.anInt3249 * 588546389, -1635088271 * class312.anInt3247);
				}
			}
		}
		method5373(1, 1005016715);
	}

	boolean method5360(short i) {
		try {
			return ((Class432_Sub1_Sub5_Sub1) this).aBoolean9961;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bi(").append(')').toString());
		}
	}

	Class485 method5545(Class_ra class_ra, int i, boolean bool, byte i_8_) {
		try {
			Class473 class473 = (((Class432_Sub1_Sub5_Sub1) this).aClass463_9952.method5705(((Class432_Sub1_Sub5_Sub1) this).anInt9956 * -11234735, (byte) -101));
			Class_xa class_xa;
			Class_xa class_xa_9_;
			if (((Class432_Sub1_Sub5_Sub1) this).aBoolean9953) {
				class_xa = aClass356_8655.aClass_xaArray3658[aByte8654];
				class_xa_9_ = aClass356_8655.aClass_xaArray3701[0];
			} else {
				class_xa = aClass356_8655.aClass_xaArray3701[aByte8654];
				if (aByte8654 < 3)
					class_xa_9_ = aClass356_8655.aClass_xaArray3701[1 + aByte8654];
				else
					class_xa_9_ = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			return (class473.method5897(class_ra, i, ((Class432_Sub1_Sub5_Sub1) this).aByte9958, ((Class432_Sub1_Sub5_Sub1) this).aByte9957, class_xa, class_xa_9_, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, bool, null, (byte) -63));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bn(").append(')').toString());
		}
	}

	public Class348 method5383(Class_ra class_ra, int i) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960)
				((Class432_Sub1_Sub5_Sub1) this).aClass348_9960 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5546(class_ra, 0, -1483969281), (byte) -22);
			return ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bt(").append(')').toString());
		}
	}

	public boolean method30() {
		return ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954;
	}

	void method5404(Class_ra class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bl(").append(')').toString());
		}
	}

	boolean method5358(Class_ra class_ra, int i, int i_10_, int i_11_) {
		try {
			Class387 class387 = method5546(class_ra, 131072, -2045316852);
			if (class387 != null) {
				Class247 class247 = method5355();
				return class387.method4458(i, i_10_, class247, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.br(").append(')').toString());
		}
	}

	Class387 method5546(Class_ra class_ra, int i, int i_12_) {
		try {
			if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null && class_ra.ct(((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.m(), i) == 0)
				return ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962;
			Class485 class485 = method5545(class_ra, i, false, (byte) -9);
			if (class485 != null)
				return (Class387) class485.anObject5824;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bk(").append(')').toString());
		}
	}

	boolean method5379() {
		if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
			return ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.i();
		return false;
	}

	void method5393(int i) {
		try {
			((Class432_Sub1_Sub5_Sub1) this).aBoolean9961 = false;
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.KA(((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.be(").append(')').toString());
		}
	}

	public int method34(short i) {
		try {
			return ((Class432_Sub1_Sub5_Sub1) this).anInt9956 * -11234735;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.r(").append(')').toString());
		}
	}

	public void method32() {
		if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962)
			((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4479();
	}

	public int method33(byte i) {
		try {
			return ((Class432_Sub1_Sub5_Sub1) this).aByte9957;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.i(").append(')').toString());
		}
	}

	public void method23(int i) {
		try {
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4479();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.p(").append(')').toString());
		}
	}

	public void method25(Class_ra class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 == null && ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954) {
				Class485 class485 = method5545(class_ra, 262144, true, (byte) -63);
				class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
			} else {
				class_na = ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950;
				((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			if (class_na != null)
				aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 5);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.s(").append(')').toString());
		}
	}

	public boolean method36() {
		return ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954;
	}

	public void method26(Class_ra class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 && ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954) {
				Class485 class485 = method5545(class_ra, 262144, true, (byte) -15);
				class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
			} else {
				class_na = ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950;
				((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			if (class_na != null)
				aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 94);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.f(").append(')').toString());
		}
	}

	static {
		anIntArray9951 = new int[] { 16, 32, 64, 128 };
	}

	public int method27() {
		return ((Class432_Sub1_Sub5_Sub1) this).anInt9956 * -11234735;
	}

	public int method28() {
		return ((Class432_Sub1_Sub5_Sub1) this).aByte9958;
	}

	public int method29() {
		return ((Class432_Sub1_Sub5_Sub1) this).aByte9958;
	}

	public int method24() {
		return ((Class432_Sub1_Sub5_Sub1) this).aByte9957;
	}

	public int method39() {
		return ((Class432_Sub1_Sub5_Sub1) this).aByte9957;
	}

	public boolean method31(int i) {
		try {
			return ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.o(").append(')').toString());
		}
	}

	public void method20() {
		if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962)
			((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4479();
	}

	public void method35(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 == null && ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954) {
			Class485 class485 = method5545(class_ra, 262144, true, (byte) -107);
			class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950;
			((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 84);
	}

	public boolean method22() {
		return ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954;
	}

	public int method5381() {
		return (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null ? ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.YA() : 0);
	}

	public void method37(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 == null && ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954) {
			Class485 class485 = method5545(class_ra, 262144, true, (byte) -85);
			class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950;
			((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) -29);
	}

	public void method38(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 == null && ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954) {
			Class485 class485 = method5545(class_ra, 262144, true, (byte) -20);
			class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950;
			((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) -3);
	}

	boolean method5374() {
		if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
			return !((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.u();
		return true;
	}

	boolean method5375() {
		if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
			return !((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.u();
		return true;
	}

	boolean method5376() {
		if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
			return !((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.u();
		return true;
	}

	boolean method5377() {
		if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
			return ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.i();
		return false;
	}

	void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_13_, int i_14_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1_15_ = (Class432_Sub1_Sub5_Sub1) class432_sub1;
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && null != ((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_15_).aClass387_9962)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490((((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_15_).aClass387_9962), i, i_13_, i_14_, bool);
		} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6 = (Class432_Sub1_Sub1_Sub6) class432_sub1;
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && (((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974) != null)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490((((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974), i, i_13_, i_14_, bool);
		}
	}

	public Class348 method5386(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960)
			((Class432_Sub1_Sub5_Sub1) this).aClass348_9960 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5546(class_ra, 0, -2033893069), (byte) -46);
		return ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960;
	}

	public int method5394() {
		return (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null ? ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.YA() : 0);
	}

	void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_16_, int i_17_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1_18_ = (Class432_Sub1_Sub5_Sub1) class432_sub1;
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && null != ((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_18_).aClass387_9962)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490((((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_18_).aClass387_9962), i, i_16_, i_17_, bool);
		} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6 = (Class432_Sub1_Sub1_Sub6) class432_sub1;
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && (((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974) != null)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490((((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974), i, i_16_, i_17_, bool);
		}
	}

	public int method5364() {
		return (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null ? ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.YA() : 0);
	}

	public int method5366() {
		return (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null ? ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.YA() : 0);
	}

	boolean method5389(Class_ra class_ra, int i, int i_19_) {
		Class387 class387 = method5546(class_ra, 131072, -1656373047);
		if (class387 != null) {
			Class247 class247 = method5355();
			return class387.method4458(i, i_19_, class247, false, 0);
		}
		return false;
	}

	public int method5370(int i) {
		try {
			return (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null ? ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bo(").append(')').toString());
		}
	}

	public Class348 method5357(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960)
			((Class432_Sub1_Sub5_Sub1) this).aClass348_9960 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5546(class_ra, 0, -1760684843), (byte) -51);
		return ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960;
	}

	public Class348 method5362(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960)
			((Class432_Sub1_Sub5_Sub1) this).aClass348_9960 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5546(class_ra, 0, -2129836909), (byte) -53);
		return ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960;
	}

	public Class348 method5388(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960)
			((Class432_Sub1_Sub5_Sub1) this).aClass348_9960 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5546(class_ra, 0, -1880455783), (byte) 13);
		return ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960;
	}

	Class353 method5380(Class_ra class_ra) {
		if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 == null)
			return null;
		Class247 class247 = method5355();
		Class353 class353 = Class497.method6105((((Class432_Sub1_Sub5_Sub1) this).aBoolean9955), (byte) 16);
		((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4475(class247, aClass80Array8656[0], 0);
		return class353;
	}

	void method5361(Class_ra class_ra) {
		/* empty */
	}

	public Class348 method5385(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960)
			((Class432_Sub1_Sub5_Sub1) this).aClass348_9960 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5546(class_ra, 0, -2030977374), (byte) -68);
		return ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960;
	}

	boolean method5390(Class_ra class_ra, int i, int i_20_) {
		Class387 class387 = method5546(class_ra, 131072, -2057002282);
		if (class387 != null) {
			Class247 class247 = method5355();
			return class387.method4458(i, i_20_, class247, false, 0);
		}
		return false;
	}

	boolean method5391() {
		return ((Class432_Sub1_Sub5_Sub1) this).aBoolean9961;
	}

	void method5387() {
		((Class432_Sub1_Sub5_Sub1) this).aBoolean9961 = false;
		if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962)
			((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.KA(((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.m() & ~0x10000);
	}

	void method5384() {
		((Class432_Sub1_Sub5_Sub1) this).aBoolean9961 = false;
		if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962)
			((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.KA(((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.m() & ~0x10000);
	}

	public void method40(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 && ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954) {
			Class485 class485 = method5545(class_ra, 262144, true, (byte) 10);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950;
			((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 65);
	}

	public void method41(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 && ((Class432_Sub1_Sub5_Sub1) this).aBoolean9954) {
			Class485 class485 = method5545(class_ra, 262144, true, (byte) -27);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub5_Sub1) this).aClass_na9950;
			((Class432_Sub1_Sub5_Sub1) this).aClass_na9950 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 70);
	}

	void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_21_, int i_22_, boolean bool, int i_23_) {
		try {
			if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
				Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1_24_ = (Class432_Sub1_Sub5_Sub1) class432_sub1;
				if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && null != ((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_24_).aClass387_9962)
					((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490(((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_24_).aClass387_9962, i, i_21_, i_22_, bool);
			} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
				Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6 = (Class432_Sub1_Sub1_Sub6) class432_sub1;
				if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && (((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974) != null)
					((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490((((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974), i, i_21_, i_22_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.bz(").append(')').toString());
		}
	}

	void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_25_, int i_26_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1_27_ = (Class432_Sub1_Sub5_Sub1) class432_sub1;
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && null != ((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_27_).aClass387_9962)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490((((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1_27_).aClass387_9962), i, i_25_, i_26_, bool);
		} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6 = (Class432_Sub1_Sub1_Sub6) class432_sub1;
			if (null != ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 && (((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974) != null)
				((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.method4490((((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6).aClass387_9974), i, i_25_, i_26_, bool);
		}
	}

	public Class348 method5401(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960)
			((Class432_Sub1_Sub5_Sub1) this).aClass348_9960 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5546(class_ra, 0, -1937263081), (byte) 38);
		return ((Class432_Sub1_Sub5_Sub1) this).aClass348_9960;
	}

	boolean method5378() {
		if (((Class432_Sub1_Sub5_Sub1) this).aClass387_9962 != null)
			return ((Class432_Sub1_Sub5_Sub1) this).aClass387_9962.i();
		return false;
	}

	public int method21(int i) {
		try {
			return ((Class432_Sub1_Sub5_Sub1) this).aByte9958;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.j(").append(')').toString());
		}
	}

	public static Class468 method5547(int i) {
		try {
			if (Class357.aClass468_3702 == null)
				return Class468.aClass468_6861;
			return Class357.aClass468_3702;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.w(").append(')').toString());
		}
	}

	static final void method5548(Class430 class430, byte i) {
		try {
			int i_28_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aClass286Array9234[i_28_].method2869(-570443529);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.yg(").append(')').toString());
		}
	}

	static final void method5549(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1] = (((Class430) class430).aClass330_Sub39_4395.method3547((byte) -59)[(((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 - 1])]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ya.ym(").append(')').toString());
		}
	}
}
