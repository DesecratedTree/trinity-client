/* Class432_Sub1_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432_Sub1_Sub4_Sub2 extends Class432_Sub1_Sub4 implements Interface2 {
	boolean aBoolean9991;
	Class387 aClass387_9992;
	Class_na aClass_na9993;
	Class348 aClass348_9994;
	int anInt9995;
	boolean aBoolean9996;
	boolean aBoolean9997;
	boolean aBoolean9998;
	byte aByte9999;
	Class463 aClass463_10000;
	public static int anInt10001;

	void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_0_, int i_1_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub4_Sub2) {
			Class432_Sub1_Sub4_Sub2 class432_sub1_sub4_sub2_2_ = (Class432_Sub1_Sub4_Sub2) class432_sub1;
			if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null && (((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_2_).aClass387_9992) != null)
				((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4490((((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_2_).aClass387_9992), i, i_0_, i_1_, bool);
		}
	}

	boolean method5382(int i) {
		try {
			if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
				return !((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.ao(").append(')').toString());
		}
	}

	boolean method5395(int i) {
		try {
			if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
				return ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bg(").append(')').toString());
		}
	}

	public int method39() {
		return ((Class432_Sub1_Sub4_Sub2) this).aByte9999;
	}

	Class387 method5541(Class_ra class_ra, int i, int i_3_) {
		try {
			if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null && class_ra.ct(((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.m(), i) == 0)
				return ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992;
			Class485 class485 = method5542(class_ra, i, false, -1836358889);
			if (null != class485)
				return (Class387) class485.anObject5824;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bs(").append(')').toString());
		}
	}

	Class485 method5542(Class_ra class_ra, int i, boolean bool, int i_4_) {
		try {
			Class473 class473 = (((Class432_Sub1_Sub4_Sub2) this).aClass463_10000.method5705(-2117489247 * ((Class432_Sub1_Sub4_Sub2) this).anInt9995, (byte) -122));
			Class_xa class_xa;
			Class_xa class_xa_5_;
			if (((Class432_Sub1_Sub4_Sub2) this).aBoolean9997) {
				class_xa = aClass356_8655.aClass_xaArray3658[aByte8654];
				class_xa_5_ = aClass356_8655.aClass_xaArray3701[0];
			} else {
				class_xa = aClass356_8655.aClass_xaArray3701[aByte8654];
				if (aByte8654 < 3)
					class_xa_5_ = aClass356_8655.aClass_xaArray3701[1 + aByte8654];
				else
					class_xa_5_ = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			return (class473.method5897(class_ra, i, -344921723 * Class476.aClass476_6900.anInt6882, ((Class432_Sub1_Sub4_Sub2) this).aByte9999, class_xa, class_xa_5_, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, bool, null, (byte) -87));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bk(").append(')').toString());
		}
	}

	public Class348 method5383(Class_ra class_ra, int i) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994)
				((Class432_Sub1_Sub4_Sub2) this).aClass348_9994 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5541(class_ra, 0, -1337894225), (byte) 24);
			return ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bt(").append(')').toString());
		}
	}

	Class353 method5405(Class_ra class_ra, int i) {
		try {
			if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 == null)
				return null;
			Class247 class247 = method5355();
			Class353 class353 = Class497.method6105((((Class432_Sub1_Sub4_Sub2) this).aBoolean9998), (byte) 16);
			((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4475(class247, aClass80Array8656[0], 0);
			return class353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bf(").append(')').toString());
		}
	}

	boolean method5374() {
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			return !((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.u();
		return true;
	}

	public int method5394() {
		return (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null ? ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.YA() : 0);
	}

	boolean method5360(short i) {
		try {
			return ((Class432_Sub1_Sub4_Sub2) this).aBoolean9991;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bi(").append(')').toString());
		}
	}

	void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_6_, int i_7_, boolean bool, int i_8_) {
		try {
			if (class432_sub1 instanceof Class432_Sub1_Sub4_Sub2) {
				Class432_Sub1_Sub4_Sub2 class432_sub1_sub4_sub2_9_ = (Class432_Sub1_Sub4_Sub2) class432_sub1;
				if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null && (((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_9_).aClass387_9992) != null)
					((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4490(((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_9_).aClass387_9992, i, i_6_, i_7_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bz(").append(')').toString());
		}
	}

	public void method25(Class_ra class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 == null && ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996) {
				Class485 class485 = method5542(class_ra, 262144, true, -99363422);
				class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
			} else {
				class_na = ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993;
				((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			if (class_na != null)
				aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 9);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.s(").append(')').toString());
		}
	}

	public int method34(short i) {
		try {
			return ((Class432_Sub1_Sub4_Sub2) this).anInt9995 * -2117489247;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.r(").append(')').toString());
		}
	}

	public int method33(byte i) {
		try {
			return ((Class432_Sub1_Sub4_Sub2) this).aByte9999;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.i(").append(')').toString());
		}
	}

	void method5404(Class_ra class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bl(").append(')').toString());
		}
	}

	public void method23(int i) {
		try {
			if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null)
				((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4479();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.p(").append(')').toString());
		}
	}

	public boolean method31(int i) {
		try {
			return ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.o(").append(')').toString());
		}
	}

	public Class348 method5401(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994)
			((Class432_Sub1_Sub4_Sub2) this).aClass348_9994 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5541(class_ra, 0, -1333639920), (byte) -1);
		return ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994;
	}

	boolean method5375() {
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			return !((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.u();
		return true;
	}

	public int method27() {
		return ((Class432_Sub1_Sub4_Sub2) this).anInt9995 * -2117489247;
	}

	public int method28() {
		return Class476.aClass476_6900.anInt6882 * -344921723;
	}

	public int method29() {
		return Class476.aClass476_6900.anInt6882 * -344921723;
	}

	public int method24() {
		return ((Class432_Sub1_Sub4_Sub2) this).aByte9999;
	}

	public void method40(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 && ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996) {
			Class485 class485 = method5542(class_ra, 262144, true, -1566260123);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993;
			((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 56);
	}

	public void method32() {
		if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null)
			((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4479();
	}

	public int method5381() {
		return (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null ? ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.YA() : 0);
	}

	public boolean method30() {
		return ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996;
	}

	public boolean method22() {
		return ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996;
	}

	void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_10_, int i_11_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub4_Sub2) {
			Class432_Sub1_Sub4_Sub2 class432_sub1_sub4_sub2_12_ = (Class432_Sub1_Sub4_Sub2) class432_sub1;
			if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null && (((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_12_).aClass387_9992) != null)
				((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4490((((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_12_).aClass387_9992), i, i_10_, i_11_, bool);
		}
	}

	public void method37(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 == null && ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996) {
			Class485 class485 = method5542(class_ra, 262144, true, -1381249531);
			class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993;
			((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) -27);
	}

	public int method21(int i) {
		try {
			return Class476.aClass476_6900.anInt6882 * -344921723;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.j(").append(')').toString());
		}
	}

	public void method20() {
		if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null)
			((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4479();
	}

	void method5393(int i) {
		try {
			((Class432_Sub1_Sub4_Sub2) this).aBoolean9991 = false;
			if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
				((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.KA(((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.be(").append(')').toString());
		}
	}

	void method5361(Class_ra class_ra) {
		/* empty */
	}

	boolean method5376() {
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			return !((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.u();
		return true;
	}

	boolean method5377() {
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			return ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.i();
		return false;
	}

	boolean method5378() {
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			return ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.i();
		return false;
	}

	boolean method5379() {
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			return ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.i();
		return false;
	}

	public Class348 method5357(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994)
			((Class432_Sub1_Sub4_Sub2) this).aClass348_9994 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5541(class_ra, 0, -1323777278), (byte) 71);
		return ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994;
	}

	public boolean method36() {
		return ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996;
	}

	public int method5364() {
		return (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null ? ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.YA() : 0);
	}

	public int method5366() {
		return (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null ? ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.YA() : 0);
	}

	public int method5370(int i) {
		try {
			return (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null ? ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.bo(").append(')').toString());
		}
	}

	public void method35(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 == null && ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996) {
			Class485 class485 = method5542(class_ra, 262144, true, -1174581762);
			class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993;
			((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 6);
	}

	public Class348 method5386(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994)
			((Class432_Sub1_Sub4_Sub2) this).aClass348_9994 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5541(class_ra, 0, 102764209), (byte) 6);
		return ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994;
	}

	public Class348 method5362(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994)
			((Class432_Sub1_Sub4_Sub2) this).aClass348_9994 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5541(class_ra, 0, -2140913453), (byte) 34);
		return ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994;
	}

	public Class348 method5388(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994)
			((Class432_Sub1_Sub4_Sub2) this).aClass348_9994 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5541(class_ra, 0, -575532409), (byte) 50);
		return ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994;
	}

	Class353 method5380(Class_ra class_ra) {
		if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 == null)
			return null;
		Class247 class247 = method5355();
		Class353 class353 = Class497.method6105((((Class432_Sub1_Sub4_Sub2) this).aBoolean9998), (byte) 16);
		((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4475(class247, aClass80Array8656[0], 0);
		return class353;
	}

	public Class348 method5385(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994)
			((Class432_Sub1_Sub4_Sub2) this).aClass348_9994 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5541(class_ra, 0, -1598369893), (byte) -39);
		return ((Class432_Sub1_Sub4_Sub2) this).aClass348_9994;
	}

	public void method26(Class_ra class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 && ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996) {
				Class485 class485 = method5542(class_ra, 262144, true, -778317483);
				class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
			} else {
				class_na = ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993;
				((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			if (class_na != null)
				aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 103);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.f(").append(')').toString());
		}
	}

	boolean method5390(Class_ra class_ra, int i, int i_13_) {
		Class387 class387 = method5541(class_ra, 131072, -1036456960);
		if (class387 != null) {
			Class247 class247 = method5355();
			return class387.method4458(i, i_13_, class247, false, 0);
		}
		return false;
	}

	boolean method5391() {
		return ((Class432_Sub1_Sub4_Sub2) this).aBoolean9991;
	}

	void method5387() {
		((Class432_Sub1_Sub4_Sub2) this).aBoolean9991 = false;
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.KA(((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.m() & ~0x10000);
	}

	void method5384() {
		((Class432_Sub1_Sub4_Sub2) this).aBoolean9991 = false;
		if (null != ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992)
			((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.KA(((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.m() & ~0x10000);
	}

	public void method38(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 == null && ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996) {
			Class485 class485 = method5542(class_ra, 262144, true, -96034231);
			class_na = (Class_na) (null != class485 ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993;
			((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) -14);
	}

	public void method41(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 && ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996) {
			Class485 class485 = method5542(class_ra, 262144, true, -2004766065);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub4_Sub2) this).aClass_na9993;
			((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 109);
	}

	boolean method5358(Class_ra class_ra, int i, int i_14_, int i_15_) {
		try {
			Class387 class387 = method5541(class_ra, 131072, 220688116);
			if (class387 != null) {
				Class247 class247 = method5355();
				return class387.method4458(i, i_14_, class247, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.br(").append(')').toString());
		}
	}

	void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_16_, int i_17_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub4_Sub2) {
			Class432_Sub1_Sub4_Sub2 class432_sub1_sub4_sub2_18_ = (Class432_Sub1_Sub4_Sub2) class432_sub1;
			if (((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 != null && (((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_18_).aClass387_9992) != null)
				((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4490((((Class432_Sub1_Sub4_Sub2) class432_sub1_sub4_sub2_18_).aClass387_9992), i, i_16_, i_17_, bool);
		}
	}

	boolean method5389(Class_ra class_ra, int i, int i_19_) {
		Class387 class387 = method5541(class_ra, 131072, -1960920544);
		if (class387 != null) {
			Class247 class247 = method5355();
			return class387.method4458(i, i_19_, class247, false, 0);
		}
		return false;
	}

	public Class432_Sub1_Sub4_Sub2(Class356 class356, Class_ra class_ra, Class463 class463, Class473 class473, int i, int i_20_, int i_21_, int i_22_, int i_23_, boolean bool, int i_24_, boolean bool_25_) {
		super(class356, i_21_, i_22_, i_23_, i, i_20_, class473.anInt5670 * 239472051);
		((Class432_Sub1_Sub4_Sub2) this).aClass463_10000 = class463;
		((Class432_Sub1_Sub4_Sub2) this).anInt9995 = 114620277 * class473.anInt5657;
		((Class432_Sub1_Sub4_Sub2) this).aBoolean9997 = bool;
		((Class432_Sub1_Sub4_Sub2) this).aByte9999 = (byte) i_24_;
		((Class432_Sub1_Sub4_Sub2) this).aBoolean9998 = 0 != -1012368965 * class473.anInt5637 && !bool;
		((Class432_Sub1_Sub4_Sub2) this).aBoolean9991 = bool_25_;
		((Class432_Sub1_Sub4_Sub2) this).aBoolean9996 = (class_ra.y() && class473.aBoolean5685 && !((Class432_Sub1_Sub4_Sub2) this).aBoolean9997 && Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(670688942) != 0);
		int i_26_ = 2048;
		if (((Class432_Sub1_Sub4_Sub2) this).aBoolean9991)
			i_26_ |= 0x10000;
		if (class473.aBoolean5683)
			i_26_ |= 0x80000;
		Class485 class485 = method5542(class_ra, i_26_, ((Class432_Sub1_Sub4_Sub2) this).aBoolean9996, -1346071709);
		if (null != class485) {
			((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 = (Class387) class485.anObject5824;
			((Class432_Sub1_Sub4_Sub2) this).aClass_na9993 = (Class_na) class485.anObject5823;
			if (((Class432_Sub1_Sub4_Sub2) this).aBoolean9991 || class473.aBoolean5683) {
				((Class432_Sub1_Sub4_Sub2) this).aClass387_9992 = ((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.method4446((byte) 0, i_26_, false);
				if (class473.aBoolean5683) {
					Class312 class312 = client.aClass304_9030.method3027((byte) -20);
					((Class432_Sub1_Sub4_Sub2) this).aClass387_9992.PA(-1401845759 * class312.anInt3250, -1626874045 * class312.anInt3248, 588546389 * class312.anInt3249, -1635088271 * class312.anInt3247);
				}
			}
		}
		method5373(1, 960872847);
	}

	static final void method5543(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.alx(").append(')').toString());
		}
	}

	static Class330_Sub44_Sub2 method5544(int i, int i_27_, int i_28_, long l, int i_29_, int i_30_) {
		try {
			synchronized (Class330_Sub44_Sub2.aClass330_Sub44_Sub2Array9830) {
				Class330_Sub44_Sub2 class330_sub44_sub2;
				if (1250140497 * Class369.anInt6820 == 0)
					class330_sub44_sub2 = new Class330_Sub44_Sub2();
				else
					class330_sub44_sub2 = (Class330_Sub44_Sub2.aClass330_Sub44_Sub2Array9830[(Class369.anInt6820 -= 356534193) * 1250140497]);
				((Class330_Sub44_Sub2) class330_sub44_sub2).anInt9829 = i * -1760932177;
				((Class330_Sub44_Sub2) class330_sub44_sub2).anInt9833 = i_27_ * 316212493;
				((Class330_Sub44_Sub2) class330_sub44_sub2).anInt9828 = -2046284875 * i_28_;
				((Class330_Sub44_Sub2) class330_sub44_sub2).aLong9832 = 1289849672041678113L * l;
				((Class330_Sub44_Sub2) class330_sub44_sub2).anInt9831 = 1228194109 * i_29_;
				Class330_Sub44_Sub2 class330_sub44_sub2_31_ = class330_sub44_sub2;
				return class330_sub44_sub2_31_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ys.at(").append(')').toString());
		}
	}
}
