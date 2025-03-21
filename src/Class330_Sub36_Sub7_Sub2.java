/* Class330_Sub36_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class330_Sub36_Sub7_Sub2 extends Class330_Sub36_Sub7 {
	SoftReference aSoftReference10137;

	boolean method3470() {
		return true;
	}

	Class330_Sub36_Sub7_Sub2(Interface22 interface22, Object object, int i) {
		super(interface22, i);
		((Class330_Sub36_Sub7_Sub2) this).aSoftReference10137 = new SoftReference(object);
	}

	boolean method3467() {
		return true;
	}

	Object method3469() {
		return ((Class330_Sub36_Sub7_Sub2) this).aSoftReference10137.get();
	}

	Object method3468() {
		return ((Class330_Sub36_Sub7_Sub2) this).aSoftReference10137.get();
	}

	boolean method3471() {
		return true;
	}
}
