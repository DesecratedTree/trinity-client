/* Class330_Sub36_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class330_Sub36_Sub14_Sub1 extends Class330_Sub36_Sub14 {
	static Thread aThread10138;
	SoftReference aSoftReference10139;

	Object method3491() {
		return ((Class330_Sub36_Sub14_Sub1) this).aSoftReference10139.get();
	}

	Object method3489(int i) {
		try {
			return ((Class330_Sub36_Sub14_Sub1) this).aSoftReference10139.get();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ald.r(").append(')').toString());
		}
	}

	boolean method3490(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ald.j(").append(')').toString());
		}
	}

	boolean method3492() {
		return true;
	}

	boolean method3488() {
		return true;
	}

	Class330_Sub36_Sub14_Sub1(Object object, int i) {
		super(i);
		((Class330_Sub36_Sub14_Sub1) this).aSoftReference10139 = new SoftReference(object);
	}
}
