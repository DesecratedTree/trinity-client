/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub1 extends Exception {
	int anInt13;

	public Exception_Sub1(int i) {
		super(new StringBuilder().append("").append(i).toString());
		((Exception_Sub1) this).anInt13 = i * 99917567;
	}

	public int method341(int i) {
		try {
			return ((Exception_Sub1) this).anInt13 * -1605738241;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agd.r(").append(')').toString());
		}
	}

	static void method342(int i, int i_0_) {
		try {
			Class111_Sub1.anInt7223 = i * 1724037121;
			Class330_Sub44_Sub2.aClass330_Sub44_Sub2Array9830 = new Class330_Sub44_Sub2[i];
			Class369.anInt6820 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("agd.al(").append(')').toString());
		}
	}
}
