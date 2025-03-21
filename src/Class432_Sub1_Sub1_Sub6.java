/* Class432_Sub1_Sub1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432_Sub1_Sub1_Sub6 extends Class432_Sub1_Sub1 implements Interface2 {
	Class348 aClass348_9964;
	Class463 aClass463_9965;
	Class_na aClass_na9966;
	boolean aBoolean9967;
	int anInt9968;
	byte aByte9969;
	byte aByte9970;
	boolean aBoolean9971;
	boolean aBoolean9972;
	boolean aBoolean9973;
	Class387 aClass387_9974;

	boolean method5382(int i) {
		try {
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
				return !((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.u();
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.ao(").append(')').toString());
		}
	}

	boolean method5395(int i) {
		try {
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
				return ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.i();
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bg(").append(')').toString());
		}
	}

	public int method5370(int i) {
		try {
			return (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 ? ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.YA() : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bo(").append(')').toString());
		}
	}

	Class485 method5511(Class_ra class_ra, int i, boolean bool, int i_0_) {
		try {
			Class473 class473 = (((Class432_Sub1_Sub1_Sub6) this).aClass463_9965.method5705(-708211735 * ((Class432_Sub1_Sub1_Sub6) this).anInt9968, (byte) -21));
			Class_xa class_xa;
			Class_xa class_xa_1_;
			if (((Class432_Sub1_Sub1_Sub6) this).aBoolean9971) {
				class_xa = aClass356_8655.aClass_xaArray3658[aByte8654];
				class_xa_1_ = aClass356_8655.aClass_xaArray3701[0];
			} else {
				class_xa = aClass356_8655.aClass_xaArray3701[aByte8654];
				if (aByte8654 < 3)
					class_xa_1_ = aClass356_8655.aClass_xaArray3701[aByte8654 + 1];
				else
					class_xa_1_ = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			return (class473.method5897(class_ra, i, ((-344921723 * Class476.aClass476_6878.anInt6882 != ((Class432_Sub1_Sub1_Sub6) this).aByte9969) ? (int) ((Class432_Sub1_Sub1_Sub6) this).aByte9969 : -344921723 * Class476.aClass476_6898.anInt6882), ((-344921723 * Class476.aClass476_6878.anInt6882 == ((Class432_Sub1_Sub1_Sub6) this).aByte9969) ? (int) (4 + ((Class432_Sub1_Sub1_Sub6) this).aByte9970) : ((Class432_Sub1_Sub1_Sub6) this).aByte9970), class_xa, class_xa_1_, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, bool, null, (byte) -32));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bn(").append(')').toString());
		}
	}

	public Class348 method5383(Class_ra class_ra, int i) {
		try {
			Class260 class260 = method5346().aClass260_2606;
			if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964)
				((Class432_Sub1_Sub1_Sub6) this).aClass348_9964 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5513(class_ra, 0, (byte) -26), (byte) 10);
			return ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bt(").append(')').toString());
		}
	}

	Class353 method5405(Class_ra class_ra, int i) {
		try {
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 == null)
				return null;
			Class247 class247 = method5355();
			Class353 class353 = Class497.method6105((((Class432_Sub1_Sub1_Sub6) this).aBoolean9967), (byte) 16);
			((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4475(class247, aClass80Array8656[0], 0);
			return class353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bf(").append(')').toString());
		}
	}

	boolean method5358(Class_ra class_ra, int i, int i_2_, int i_3_) {
		try {
			Class387 class387 = method5513(class_ra, 131072, (byte) -69);
			if (class387 != null) {
				Class247 class247 = method5355();
				return class387.method4458(i, i_2_, class247, false, 0);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.br(").append(')').toString());
		}
	}

	void method5361(Class_ra class_ra) {
		/* empty */
	}

	void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_4_, int i_5_, boolean bool, int i_6_) {
		try {
			if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
				Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = (Class432_Sub1_Sub5_Sub1) class432_sub1;
				if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != ((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962)
					((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490((((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962), i, i_4_, i_5_, bool);
			} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
				Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6_7_ = (Class432_Sub1_Sub1_Sub6) class432_sub1;
				if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != ((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_7_).aClass387_9974)
					((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490(((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_7_).aClass387_9974, i, i_4_, i_5_, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bz(").append(')').toString());
		}
	}

	void method5393(int i) {
		try {
			((Class432_Sub1_Sub1_Sub6) this).aBoolean9972 = false;
			if (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974)
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.KA(((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.m() & ~0x10000);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.be(").append(')').toString());
		}
	}

	public int method34(short i) {
		try {
			return ((Class432_Sub1_Sub1_Sub6) this).anInt9968 * -708211735;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.r(").append(')').toString());
		}
	}

	public int method21(int i) {
		try {
			return ((Class432_Sub1_Sub1_Sub6) this).aByte9969;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.j(").append(')').toString());
		}
	}

	public int method33(byte i) {
		try {
			return ((Class432_Sub1_Sub1_Sub6) this).aByte9970;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.i(").append(')').toString());
		}
	}

	public void method23(int i) {
		try {
			if (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974)
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4479();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.p(").append(')').toString());
		}
	}

	public boolean method31(int i) {
		try {
			return ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.o(").append(')').toString());
		}
	}

	public void method25(Class_ra class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 && ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973) {
				Class485 class485 = method5511(class_ra, 262144, true, 2144404482);
				class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
			} else {
				class_na = ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966;
				((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			if (class_na != null)
				aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) -71);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.s(").append(')').toString());
		}
	}

	public void method26(Class_ra class_ra, int i) {
		try {
			Object object = null;
			Class_na class_na;
			if (((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 == null && ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973) {
				Class485 class485 = method5511(class_ra, 262144, true, 273301998);
				class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
			} else {
				class_na = ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966;
				((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = null;
			}
			Class260 class260 = method5346().aClass260_2606;
			if (class_na != null)
				aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 75);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.f(").append(')').toString());
		}
	}

	boolean method5360(short i) {
		try {
			return ((Class432_Sub1_Sub1_Sub6) this).aBoolean9972;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bi(").append(')').toString());
		}
	}

	public int method27() {
		return ((Class432_Sub1_Sub1_Sub6) this).anInt9968 * -708211735;
	}

	public int method28() {
		return ((Class432_Sub1_Sub1_Sub6) this).aByte9969;
	}

	Class353 method5380(Class_ra class_ra) {
		if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 == null)
			return null;
		Class247 class247 = method5355();
		Class353 class353 = Class497.method6105((((Class432_Sub1_Sub1_Sub6) this).aBoolean9967), (byte) 16);
		((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4475(class247, aClass80Array8656[0], 0);
		return class353;
	}

	public int method24() {
		return ((Class432_Sub1_Sub1_Sub6) this).aByte9970;
	}

	boolean method5389(Class_ra class_ra, int i, int i_8_) {
		Class387 class387 = method5513(class_ra, 131072, (byte) -70);
		if (class387 != null) {
			Class247 class247 = method5355();
			return class387.method4458(i, i_8_, class247, false, 0);
		}
		return false;
	}

	public void method32() {
		if (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974)
			((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4479();
	}

	public void method20() {
		if (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974)
			((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4479();
	}

	public void method38(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 && ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973) {
			Class485 class485 = method5511(class_ra, 262144, true, -864801136);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966;
			((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) -72);
	}

	boolean method5378() {
		if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
			return ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.i();
		return false;
	}

	public boolean method36() {
		return ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973;
	}

	public void method37(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 && ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973) {
			Class485 class485 = method5511(class_ra, 262144, true, -1084533347);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966;
			((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 36);
	}

	public int method5512(int i) {
		try {
			return (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null ? ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.N() / 4 : 15);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bu(").append(')').toString());
		}
	}

	public boolean method22() {
		return ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973;
	}

	public void method35(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 && ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973) {
			Class485 class485 = method5511(class_ra, 262144, true, 461681657);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966;
			((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4185(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 18);
	}

	boolean method5375() {
		if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
			return !((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.u();
		return true;
	}

	boolean method5376() {
		if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
			return !((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.u();
		return true;
	}

	boolean method5377() {
		if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
			return ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.i();
		return false;
	}

	public void method41(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 == null && ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973) {
			Class485 class485 = method5511(class_ra, 262144, true, 1647707379);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966;
			((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 7);
	}

	boolean method5379() {
		if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
			return ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.i();
		return false;
	}

	void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_9_, int i_10_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = (Class432_Sub1_Sub5_Sub1) class432_sub1;
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != (((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962))
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490((((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962), i, i_9_, i_10_, bool);
		} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6_11_ = (Class432_Sub1_Sub1_Sub6) class432_sub1;
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != ((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_11_).aClass387_9974)
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490((((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_11_).aClass387_9974), i, i_9_, i_10_, bool);
		}
	}

	boolean method5374() {
		if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null)
			return !((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.u();
		return true;
	}

	public int method5381() {
		return (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 ? ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.YA() : 0);
	}

	public int method5366() {
		return (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 ? ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.YA() : 0);
	}

	public Class348 method5401(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964)
			((Class432_Sub1_Sub1_Sub6) this).aClass348_9964 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5513(class_ra, 0, (byte) -20), (byte) 74);
		return ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964;
	}

	public Class348 method5357(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964)
			((Class432_Sub1_Sub1_Sub6) this).aClass348_9964 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5513(class_ra, 0, (byte) -37), (byte) 73);
		return ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964;
	}

	void method5384() {
		((Class432_Sub1_Sub1_Sub6) this).aBoolean9972 = false;
		if (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974)
			((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.KA(((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.m() & ~0x10000);
	}

	public Class348 method5386(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964)
			((Class432_Sub1_Sub1_Sub6) this).aClass348_9964 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5513(class_ra, 0, (byte) -78), (byte) -55);
		return ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964;
	}

	public Class348 method5362(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964)
			((Class432_Sub1_Sub1_Sub6) this).aClass348_9964 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5513(class_ra, 0, (byte) -76), (byte) 74);
		return ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964;
	}

	public Class348 method5388(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964)
			((Class432_Sub1_Sub1_Sub6) this).aClass348_9964 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5513(class_ra, 0, (byte) -71), (byte) -39);
		return ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964;
	}

	void method5404(Class_ra class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bl(").append(')').toString());
		}
	}

	public int method5364() {
		return (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 ? ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.YA() : 0);
	}

	public int method39() {
		return ((Class432_Sub1_Sub1_Sub6) this).aByte9970;
	}

	boolean method5390(Class_ra class_ra, int i, int i_12_) {
		Class387 class387 = method5513(class_ra, 131072, (byte) -92);
		if (class387 != null) {
			Class247 class247 = method5355();
			return class387.method4458(i, i_12_, class247, false, 0);
		}
		return false;
	}

	boolean method5391() {
		return ((Class432_Sub1_Sub1_Sub6) this).aBoolean9972;
	}

	public Class348 method5385(Class_ra class_ra) {
		Class260 class260 = method5346().aClass260_2606;
		if (null == ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964)
			((Class432_Sub1_Sub1_Sub6) this).aClass348_9964 = Class201_Sub2.method2171((int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, method5513(class_ra, 0, (byte) -27), (byte) 10);
		return ((Class432_Sub1_Sub1_Sub6) this).aClass348_9964;
	}

	public Class432_Sub1_Sub1_Sub6(Class356 class356, Class_ra class_ra, Class463 class463, Class473 class473, int i, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool_23_) {
		super(class356, i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, class473.anInt5640 * 2018907021 == 1, Class447.method5627(i_21_, i_22_, (byte) -98));
		((Class432_Sub1_Sub1_Sub6) this).aClass463_9965 = class463;
		((Class432_Sub1_Sub1_Sub6) this).anInt9968 = -2053936947 * class473.anInt5657;
		aByte8654 = (byte) i_13_;
		((Class432_Sub1_Sub1_Sub6) this).aBoolean9971 = bool;
		((Class432_Sub1_Sub1_Sub6) this).aByte9969 = (byte) i_21_;
		((Class432_Sub1_Sub1_Sub6) this).aByte9970 = (byte) i_22_;
		((Class432_Sub1_Sub1_Sub6) this).aBoolean9967 = -1012368965 * class473.anInt5637 != 0 && !bool;
		((Class432_Sub1_Sub1_Sub6) this).aBoolean9972 = bool_23_;
		((Class432_Sub1_Sub1_Sub6) this).aBoolean9973 = (class_ra.y() && class473.aBoolean5685 && !((Class432_Sub1_Sub1_Sub6) this).aBoolean9971 && Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(624994758) != 0);
		int i_24_ = 2048;
		if (((Class432_Sub1_Sub1_Sub6) this).aBoolean9972)
			i_24_ |= 0x10000;
		if (class473.aBoolean5683)
			i_24_ |= 0x80000;
		Class485 class485 = method5511(class_ra, i_24_, ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973, 2010925701);
		if (class485 != null) {
			((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 = (Class387) class485.anObject5824;
			((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = (Class_na) class485.anObject5823;
			if (((Class432_Sub1_Sub1_Sub6) this).aBoolean9972 || class473.aBoolean5683) {
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 = ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4446((byte) 0, i_24_, false);
				if (class473.aBoolean5683) {
					Class312 class312 = client.aClass304_9030.method3027((byte) -58);
					((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.PA(-1401845759 * class312.anInt3250, -1626874045 * class312.anInt3248, class312.anInt3249 * 588546389, class312.anInt3247 * -1635088271);
				}
			}
		}
		method5373(1, 1096281109);
	}

	public void method40(Class_ra class_ra) {
		Object object = null;
		Class_na class_na;
		if (((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 == null && ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973) {
			Class485 class485 = method5511(class_ra, 262144, true, 2126445631);
			class_na = (Class_na) (class485 != null ? class485.anObject5823 : null);
		} else {
			class_na = ((Class432_Sub1_Sub1_Sub6) this).aClass_na9966;
			((Class432_Sub1_Sub1_Sub6) this).aClass_na9966 = null;
		}
		Class260 class260 = method5346().aClass260_2606;
		if (class_na != null)
			aClass356_8655.method4167(class_na, aByte8654, (int) class260.aFloat2716, (int) class260.aFloat2711, null, (byte) 124);
	}

	public int method5394() {
		return (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 ? ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.YA() : 0);
	}

	public int method29() {
		return ((Class432_Sub1_Sub1_Sub6) this).aByte9969;
	}

	Class387 method5513(Class_ra class_ra, int i, byte i_25_) {
		try {
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && class_ra.ct(((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.m(), i) == 0)
				return ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974;
			Class485 class485 = method5511(class_ra, i, false, 273627868);
			if (null != class485)
				return (Class387) class485.anObject5824;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.bk(").append(')').toString());
		}
	}

	void method5387() {
		((Class432_Sub1_Sub1_Sub6) this).aBoolean9972 = false;
		if (null != ((Class432_Sub1_Sub1_Sub6) this).aClass387_9974)
			((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.KA(((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.m() & ~0x10000);
	}

	void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_26_, int i_27_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = (Class432_Sub1_Sub5_Sub1) class432_sub1;
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != (((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962))
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490((((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962), i, i_26_, i_27_, bool);
		} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6_28_ = (Class432_Sub1_Sub1_Sub6) class432_sub1;
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != ((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_28_).aClass387_9974)
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490((((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_28_).aClass387_9974), i, i_26_, i_27_, bool);
		}
	}

	void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_29_, int i_30_, boolean bool) {
		if (class432_sub1 instanceof Class432_Sub1_Sub5_Sub1) {
			Class432_Sub1_Sub5_Sub1 class432_sub1_sub5_sub1 = (Class432_Sub1_Sub5_Sub1) class432_sub1;
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != (((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962))
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490((((Class432_Sub1_Sub5_Sub1) class432_sub1_sub5_sub1).aClass387_9962), i, i_29_, i_30_, bool);
		} else if (class432_sub1 instanceof Class432_Sub1_Sub1_Sub6) {
			Class432_Sub1_Sub1_Sub6 class432_sub1_sub1_sub6_31_ = (Class432_Sub1_Sub1_Sub6) class432_sub1;
			if (((Class432_Sub1_Sub1_Sub6) this).aClass387_9974 != null && null != ((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_31_).aClass387_9974)
				((Class432_Sub1_Sub1_Sub6) this).aClass387_9974.method4490((((Class432_Sub1_Sub1_Sub6) class432_sub1_sub1_sub6_31_).aClass387_9974), i, i_29_, i_30_, bool);
		}
	}

	public boolean method30() {
		return ((Class432_Sub1_Sub1_Sub6) this).aBoolean9973;
	}

	static void method5514(int i, int i_32_) {
		try {
			for (Class330 class330 = client.aClass497_9211.method6099((byte) 39); null != class330; class330 = client.aClass497_9211.method6098((short) -32768)) {
				if ((-6154793640677333111L * class330.aLong3341 >> 48 & 0xffffL) == (long) i)
					class330.method3252(-483664394);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.mp(").append(')').toString());
		}
	}

	static final void method5515(Class430 class430, int i) {
		try {
			int i_33_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class158.aClass561_6474.anIntArray6980[i_33_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.e(").append(')').toString());
		}
	}

	static void method5516(IComponentDefinitions iComponentDefinitions, int i, int i_34_, byte i_35_) {
		try {
			Class122 class122 = iComponentDefinitions.method1396(Class361.aClass_ra3793, (byte) -11);
			if (null != class122) {
				Class361.aClass_ra3793.r(i, i_34_, -681123409 * iComponentDefinitions.anInt1210 + i, (i_34_ + iComponentDefinitions.anInt1348 * 694142557));
				if (Class9.anInt140 * 221140443 < 3) {
					int i_36_;
					if (Class147.anInt1621 * -1551406343 == 2)
						i_36_ = (int) ((double) Class401_Sub1.aClass145_Sub1_8249.method1713(436623662) * 2607.5945876176133);
					else
						i_36_ = (int) -client.aFloat9141;
					i_36_ = -1207360470 * client.anInt9149 + i_36_ & 0x3fff;
					i_36_ <<= 2;
					Class116.aClass61_1376.method698(((float) (iComponentDefinitions.anInt1210 * -681123409) / 2.0F + (float) i), ((float) i_34_ + (float) (694142557 * iComponentDefinitions.anInt1348) / 2.0F), 4449, i_36_, class122.aClass_ta1408, i, i_34_);
				} else
					Class361.aClass_ra3793.DA(-16777216, class122.aClass_ta1408, i, i_34_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yc.mt(").append(')').toString());
		}
	}
}
