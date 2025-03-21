/* Class330_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub32 extends Class330 {
	short[][] aShortArrayArray7725;
	double aDouble7726;

	Class330_Sub32(short[][] is, double d) {
		((Class330_Sub32) this).aShortArrayArray7725 = is;
		((Class330_Sub32) this).aDouble7726 = d;
	}

	long method3433(int i) {
		try {
			return (long) ((((Class330_Sub32) this).aShortArrayArray7725.length << 32) | (((Class330_Sub32) this).aShortArrayArray7725[0]).length);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("adm.r(").append(')').toString());
		}
	}
}
