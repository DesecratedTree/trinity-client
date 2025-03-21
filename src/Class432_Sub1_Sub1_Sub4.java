/* Class432_Sub1_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432_Sub1_Sub1_Sub4 extends Class432_Sub1_Sub1 {
	boolean aBoolean10200;
	int anInt10201 = 0;
	Class477 aClass477_10202;
	int anInt10203;
	int anInt10204;
	Class388 aClass388_10205;
	int anInt10206 = 0;

	Class353 method5380(Class_ra class_ra) {
		Class387 class387 = method5501(class_ra, 0x800 | (-977203539 * ((Class432_Sub1_Sub1_Sub4) this).anInt10201 != 0 ? 5 : 0), (1999706379 * ((Class432_Sub1_Sub1_Sub4) this).anInt10204), (byte) 5);
		if (null == class387)
			return null;
		if (0 != ((Class432_Sub1_Sub1_Sub4) this).anInt10201 * -977203539)
			class387.f(((Class432_Sub1_Sub1_Sub4) this).anInt10201 * 141912064);
		Class247 class247 = method5355();
		method5502(class_ra, class387, class247, -515813395);
		Class353 class353 = Class497.method6105(false, (byte) 16);
		class387.method4475(class247, aClass80Array8656[0], 0);
		if (null != ((Class432_Sub1_Sub1_Sub4) this).aClass388_10205) {
			Class81 class81 = ((Class432_Sub1_Sub1_Sub4) this).aClass388_10205.method4570();
			class_ra.cm(class81);
		}
		((Class432_Sub1_Sub1_Sub4) this).aBoolean10200 = class387.i();
		((Class432_Sub1_Sub1_Sub4) this).anInt10206 = class387.YA() * 1348466845;
		class387.n();
		return class353;
	}

	public int method5370(int i) {
		try {
			return ((Class432_Sub1_Sub1_Sub4) this).anInt10206 * -1367978571;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.bo(").append(')').toString());
		}
	}

	void method5361(Class_ra class_ra) {
		Class387 class387 = method5501(class_ra, 0, (1999706379 * ((Class432_Sub1_Sub1_Sub4) this).anInt10204), (byte) 5);
		if (class387 != null)
			method5502(class_ra, class387, method5355(), -515813395);
	}

	public Class348 method5383(Class_ra class_ra, int i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.bt(").append(')').toString());
		}
	}

	public final void method5499(int i, int i_0_) {
		try {
			if (null != ((Class432_Sub1_Sub1_Sub4) this).aClass477_10202 && !((Class432_Sub1_Sub1_Sub4) this).aClass477_10202.method5978((byte) -51))
				((Class432_Sub1_Sub1_Sub4) this).aClass477_10202.method5981(i, 678275014);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.j(").append(')').toString());
		}
	}

	public final boolean method5500(int i) {
		try {
			return (null != ((Class432_Sub1_Sub1_Sub4) this).aClass477_10202 && !((Class432_Sub1_Sub1_Sub4) this).aClass477_10202.method5972(-776556553));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.i(").append(')').toString());
		}
	}

	final void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_1_, int i_2_, boolean bool) {
		throw new IllegalStateException();
	}

	Class387 method5501(Class_ra class_ra, int i, int i_3_, byte i_4_) {
		try {
			Class437 class437 = Class136.aClass416_1527.method5254(i_3_, -1502801890);
			Class_xa class_xa = aClass356_8655.aClass_xaArray3701[aByte8658];
			Class_xa class_xa_5_ = (aByte8654 < 3 ? aClass356_8655.aClass_xaArray3701[aByte8654 + 1] : null);
			Class260 class260 = method5346().aClass260_2606;
			return ((((Class432_Sub1_Sub1_Sub4) this).aClass477_10202 != null && !((Class432_Sub1_Sub1_Sub4) this).aClass477_10202.method5978((byte) 0)) ? class437.method5581(class_ra, i, true, class_xa, class_xa_5_, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, (((Class432_Sub1_Sub1_Sub4) this).aClass477_10202), (byte) 2, 1943596878) : class437.method5581(class_ra, i, true, class_xa, class_xa_5_, (int) class260.aFloat2716, (int) class260.aFloat2715, (int) class260.aFloat2711, null, (byte) 2, 1302193374));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.o(").append(')').toString());
		}
	}

	public Class348 method5401(Class_ra class_ra) {
		return null;
	}

	boolean method5377() {
		return ((Class432_Sub1_Sub1_Sub4) this).aBoolean10200;
	}

	void method5502(Class_ra class_ra, Class387 class387, Class247 class247, int i) {
		try {
			class387.method4463(class247);
			Class93[] class93s = class387.method4464();
			Class64[] class64s = class387.method4445();
			if ((null == ((Class432_Sub1_Sub1_Sub4) this).aClass388_10205 || (((Class432_Sub1_Sub1_Sub4) this).aClass388_10205.aBoolean3992)) && (null != class93s || null != class64s))
				((Class432_Sub1_Sub1_Sub4) this).aClass388_10205 = Class388.method4571(822953439 * client.anInt8981, true);
			if (((Class432_Sub1_Sub1_Sub4) this).aClass388_10205 != null) {
				((Class432_Sub1_Sub1_Sub4) this).aClass388_10205.method4568(class_ra, (long) (client.anInt8981 * 822953439), class93s, class64s, false);
				((Class432_Sub1_Sub1_Sub4) this).aClass388_10205.method4573(aByte8658, aShort9922, aShort9920, aShort9921, aShort9923);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.s(").append(')').toString());
		}
	}

	public void method5503(int i) {
		try {
			if (null != ((Class432_Sub1_Sub1_Sub4) this).aClass388_10205)
				((Class432_Sub1_Sub1_Sub4) this).aClass388_10205.method4572();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.f(").append(')').toString());
		}
	}

	public Class348 method5357(Class_ra class_ra) {
		return null;
	}

	final boolean method5360(short i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.bi(").append(')').toString());
		}
	}

	final void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_6_, int i_7_, boolean bool, int i_8_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.bz(").append(')').toString());
		}
	}

	final void method5393(int i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.be(").append(')').toString());
		}
	}

	boolean method5374() {
		return false;
	}

	boolean method5375() {
		return false;
	}

	boolean method5376() {
		return false;
	}

	public Class348 method5385(Class_ra class_ra) {
		return null;
	}

	boolean method5378() {
		return ((Class432_Sub1_Sub1_Sub4) this).aBoolean10200;
	}

	boolean method5379() {
		return ((Class432_Sub1_Sub1_Sub4) this).aBoolean10200;
	}

	public int method5394() {
		return ((Class432_Sub1_Sub1_Sub4) this).anInt10206 * -1367978571;
	}

	public int method5381() {
		return ((Class432_Sub1_Sub1_Sub4) this).anInt10206 * -1367978571;
	}

	public int method5364() {
		return ((Class432_Sub1_Sub1_Sub4) this).anInt10206 * -1367978571;
	}

	public int method5366() {
		return ((Class432_Sub1_Sub1_Sub4) this).anInt10206 * -1367978571;
	}

	public Class432_Sub1_Sub1_Sub4(Class356 class356, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, boolean bool, int i_20_) {
		super(class356, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, false, (byte) 0);
		((Class432_Sub1_Sub1_Sub4) this).aBoolean10200 = true;
		((Class432_Sub1_Sub1_Sub4) this).anInt10203 = 0;
		((Class432_Sub1_Sub1_Sub4) this).anInt10204 = i * -768873821;
		((Class432_Sub1_Sub1_Sub4) this).anInt10201 = 1149076773 * i_19_;
		((Class432_Sub1_Sub1_Sub4) this).anInt10203 = 2048382237 * i_20_;
		Class437 class437 = Class136.aClass416_1527.method5254((1999706379 * ((Class432_Sub1_Sub1_Sub4) this).anInt10204), -635018090);
		int i_21_ = class437.anInt4431 * 1258856743;
		if (-1 != i_21_) {
			((Class432_Sub1_Sub1_Sub4) this).aClass477_10202 = new Class477_Sub2(this, false);
			int i_22_ = class437.aBoolean4443 ? 0 : 2;
			if (bool)
				i_22_ = 1;
			((Class432_Sub1_Sub1_Sub4) this).aClass477_10202.method5970(i_21_, i_9_, i_22_, false, -2036723180);
		}
		method5373(1, 152543098);
	}

	final void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_23_, int i_24_, boolean bool) {
		throw new IllegalStateException();
	}

	public Class348 method5386(Class_ra class_ra) {
		return null;
	}

	public Class348 method5362(Class_ra class_ra) {
		return null;
	}

	public Class348 method5388(Class_ra class_ra) {
		return null;
	}

	void method5404(Class_ra class_ra, int i) {
		try {
			Class387 class387 = method5501(class_ra, 0, (1999706379 * ((Class432_Sub1_Sub1_Sub4) this).anInt10204), (byte) 5);
			if (class387 != null)
				method5502(class_ra, class387, method5355(), -515813395);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.bl(").append(')').toString());
		}
	}

	public int method5504(byte i) {
		try {
			return ((Class432_Sub1_Sub1_Sub4) this).anInt10203 * 913544501;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.r(").append(')').toString());
		}
	}

	boolean method5389(Class_ra class_ra, int i, int i_25_) {
		return false;
	}

	boolean method5390(Class_ra class_ra, int i, int i_26_) {
		return false;
	}

	final boolean method5391() {
		return false;
	}

	final void method5387() {
		throw new IllegalStateException();
	}

	final void method5384() {
		throw new IllegalStateException();
	}

	final void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1, int i, int i_27_, int i_28_, boolean bool) {
		throw new IllegalStateException();
	}

	boolean method5358(Class_ra class_ra, int i, int i_29_, int i_30_) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.br(").append(')').toString());
		}
	}

	public final boolean method5505(int i) {
		try {
			return (((Class432_Sub1_Sub1_Sub4) this).aClass477_10202 == null || ((Class432_Sub1_Sub1_Sub4) this).aClass477_10202.method5978((byte) -115));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.p(").append(')').toString());
		}
	}

	Class353 method5405(Class_ra class_ra, int i) {
		try {
			Class387 class387 = method5501(class_ra, 0x800 | (-977203539 * ((Class432_Sub1_Sub1_Sub4) this).anInt10201 != 0 ? 5 : 0), (1999706379 * ((Class432_Sub1_Sub1_Sub4) this).anInt10204), (byte) 5);
			if (null == class387)
				return null;
			if (0 != ((Class432_Sub1_Sub1_Sub4) this).anInt10201 * -977203539)
				class387.f(((Class432_Sub1_Sub1_Sub4) this).anInt10201 * 141912064);
			Class247 class247 = method5355();
			method5502(class_ra, class387, class247, -515813395);
			Class353 class353 = Class497.method6105(false, (byte) 16);
			class387.method4475(class247, aClass80Array8656[0], 0);
			if (null != ((Class432_Sub1_Sub1_Sub4) this).aClass388_10205) {
				Class81 class81 = ((Class432_Sub1_Sub1_Sub4) this).aClass388_10205.method4570();
				class_ra.cm(class81);
			}
			((Class432_Sub1_Sub1_Sub4) this).aBoolean10200 = class387.i();
			((Class432_Sub1_Sub1_Sub4) this).anInt10206 = class387.YA() * 1348466845;
			class387.n();
			return class353;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.bf(").append(')').toString());
		}
	}

	boolean method5395(int i) {
		try {
			return ((Class432_Sub1_Sub1_Sub4) this).aBoolean10200;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.bg(").append(')').toString());
		}
	}

	boolean method5382(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("als.ao(").append(')').toString());
		}
	}
}
