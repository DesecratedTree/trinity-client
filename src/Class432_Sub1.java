/* Class432_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class432_Sub1 extends Class432 {
	Class432_Sub1 aClass432_Sub1_8653;
	public byte aByte8654;
	public Class356 aClass356_8655;
	public Class80[] aClass80Array8656;
	int anInt8657;
	public byte aByte8658;

	public abstract Class348 method5357(Class_ra class_ra);

	abstract boolean method5358(Class_ra class_ra, int i, int i_0_, int i_1_);

	int method5359(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aex.fp(").append(')').toString());
		}
	}

	abstract boolean method5360(short i);

	abstract void method5361(Class_ra class_ra);

	public abstract Class348 method5362(Class_ra class_ra);

	public int method5363(int i) {
		try {
			return -method5370(-47698181);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aex.bc(").append(')').toString());
		}
	}

	public abstract int method5364();

	abstract boolean method5365(Class_ra class_ra);

	public abstract int method5366();

	abstract boolean method5367(byte i);

	abstract int method5368(Class330_Sub14[] class330_sub14s, byte i);

	abstract void method5369(Class_ra class_ra, Class432_Sub1 class432_sub1_2_, int i, int i_3_, int i_4_, boolean bool);

	public abstract int method5370(int i);

	int method5371(int i, int i_5_, Class330_Sub14[] class330_sub14s, byte i_6_) {
		try {
			long l = (((Class356) aClass356_8655).aLongArrayArrayArray3652[aByte8658][i][i_5_]);
			long l_7_ = 0L;
			int i_8_ = 0;
			for (/**/; l_7_ <= 48L; l_7_ += 16L) {
				int i_9_ = (int) (l >> (int) l_7_ & 0xffffL);
				if (i_9_ <= 0)
					break;
				class330_sub14s[i_8_++] = (((Class356) aClass356_8655).aClass349Array3679[i_9_ - 1].aClass330_Sub14_3467);
			}
			for (int i_10_ = i_8_; i_10_ < 4; i_10_++)
				class330_sub14s[i_10_] = null;
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aex.gd(").append(')').toString());
		}
	}

	abstract boolean method5372(Class_ra class_ra, int i);

	void method5373(int i, int i_11_) {
		try {
			aClass80Array8656 = new Class80[i];
			for (int i_12_ = 0; i_12_ < aClass80Array8656.length; i_12_++)
				aClass80Array8656[i_12_] = new Class80();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aex.gj(").append(')').toString());
		}
	}

	abstract boolean method5374();

	abstract boolean method5375();

	abstract boolean method5376();

	abstract boolean method5377();

	abstract boolean method5378();

	abstract boolean method5379();

	abstract Class353 method5380(Class_ra class_ra);

	public abstract int method5381();

	abstract boolean method5382(int i);

	public abstract Class348 method5383(Class_ra class_ra, int i);

	abstract void method5384();

	public abstract Class348 method5385(Class_ra class_ra);

	public abstract Class348 method5386(Class_ra class_ra);

	abstract void method5387();

	public abstract Class348 method5388(Class_ra class_ra);

	abstract boolean method5389(Class_ra class_ra, int i, int i_13_);

	abstract boolean method5390(Class_ra class_ra, int i, int i_14_);

	abstract boolean method5391();

	abstract void method5392(Class_ra class_ra, Class432_Sub1 class432_sub1_15_, int i, int i_16_, int i_17_, boolean bool, int i_18_);

	abstract void method5393(int i);

	public abstract int method5394();

	abstract boolean method5395(int i);

	abstract void method5396(Class_ra class_ra, Class432_Sub1 class432_sub1_19_, int i, int i_20_, int i_21_, boolean bool);

	abstract void method5397(Class_ra class_ra, Class432_Sub1 class432_sub1_22_, int i, int i_23_, int i_24_, boolean bool);

	abstract int method5398(Class330_Sub14[] class330_sub14s);

	abstract int method5399(Class330_Sub14[] class330_sub14s);

	abstract boolean method5400(Class_ra class_ra);

	public abstract Class348 method5401(Class_ra class_ra);

	abstract boolean method5402(Class_ra class_ra);

	abstract boolean method5403();

	abstract void method5404(Class_ra class_ra, int i);

	Class432_Sub1(Class356 class356) {
		aClass356_8655 = class356;
	}

	abstract Class353 method5405(Class_ra class_ra, int i);
}
