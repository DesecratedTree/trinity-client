/* Class330_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class330_Sub15_Sub1 extends Class330_Sub15 {
	int anInt9544;
	String aString9545;
	String aString9546;
	Class109 aClass109_9547;
	Class109 aClass109_9548;

	Class330_Sub15_Sub1(Class104 class104) {
		((Class330_Sub15_Sub1) this).aClass109_9547 = ((Class104) class104).aClass109_985;
		((Class330_Sub15_Sub1) this).aString9545 = ((Class104) class104).aString988;
		((Class330_Sub15_Sub1) this).aString9546 = ((Class104) class104).aString989;
		((Class330_Sub15_Sub1) this).anInt9544 = 1616638017 * ((Class104) class104).anInt987;
		((Class330_Sub15_Sub1) this).aClass109_9548 = ((Class104) class104).aClass109_990;
	}

	public abstract boolean method3322(int i);

	public Class109 method3323(int i) {
		try {
			return ((Class330_Sub15_Sub1) this).aClass109_9547;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiy.i(").append(')').toString());
		}
	}

	String method3324(byte i) {
		try {
			return ((Class330_Sub15_Sub1) this).aString9545;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiy.j(").append(')').toString());
		}
	}

	public Class109 method3325(int i) {
		try {
			return ((Class330_Sub15_Sub1) this).aClass109_9548;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiy.p(").append(')').toString());
		}
	}

	public int method3326(int i) {
		try {
			if (((Class330_Sub15_Sub1) this).aClass109_9547 != Class109.aClass109_1028)
				throw new IllegalArgumentException_Sub1(this, ((Class330_Sub15_Sub1) this).aClass109_9547.toString().toLowerCase());
			return 1688318233 * ((Class330_Sub15_Sub1) this).anInt9544;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiy.o(").append(')').toString());
		}
	}

	public abstract int method3327(int i);

	public abstract int method3328(int i);

	public String toString() {
		try {
			String string = new StringBuilder().append(((Class330_Sub15_Sub1) this).aClass109_9547.toString()).append(" ").append(((Class330_Sub15_Sub1) this).aString9545).toString();
			if (((Class330_Sub15_Sub1) this).aString9546 != null && !"".equals(((Class330_Sub15_Sub1) this).aString9546))
				string = new StringBuilder().append(string).append(" : ").append(((Class330_Sub15_Sub1) this).aString9546).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiy.toString(").append(')').toString());
		}
	}

	public abstract boolean method3329(int i);

	public abstract int method3330(int i);

	public abstract int method3331(int i);

	static final void method3332(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class460.method5691(iComponentDefinitions, class120, class430, -706507629);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiy.cs(").append(')').toString());
		}
	}
}
