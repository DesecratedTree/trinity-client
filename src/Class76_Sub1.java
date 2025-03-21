/* Class76_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class76_Sub1 extends Class76 {
	public static IndexTable aClass280_7096;
	static Class61[] aClass61Array7097;

	public abstract int method873(int i, int i_0_);

	public abstract int method874();

	public abstract int method875(int i, int i_1_);

	abstract void method876(int i, int i_2_);

	public abstract int method877();

	public abstract int method878();

	public abstract int method879();

	public abstract int method880(int i, int i_3_);

	public abstract int method881(int i, int i_4_);

	abstract void method882(int i, int i_5_);

	public abstract int method883(int i, int i_6_);

	public abstract int method884(int i, int i_7_);

	public abstract int method885(int i, int i_8_);

	Class76_Sub1() {
		/* empty */
	}

	public static String method886(int i, boolean bool, int i_9_) {
		try {
			if (!bool || i < 0)
				return Integer.toString(i);
			return Class166.method1995(i, 10, bool, 1584937021);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("yg.z(").append(')').toString());
		}
	}
}
