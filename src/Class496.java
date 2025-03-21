/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class496 {
	static Class496 aClass496_5873;
	public static Class496 aClass496_5874;
	static Class496 aClass496_5875 = new Class496(0);
	public int anInt5876;

	static {
		aClass496_5874 = new Class496(1);
		aClass496_5873 = new Class496(2);
	}

	Class496(int i) {
		anInt5876 = i * -554727307;
	}

	static final void method6092(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 857292277);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class457.method5661(iComponentDefinitions, class120, class430, (short) -15387);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("um.dt(").append(')').toString());
		}
	}
}
