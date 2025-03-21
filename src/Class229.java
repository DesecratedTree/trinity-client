/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IUnknown;

public abstract class Class229 implements Interface8 {
	Class_ra_Sub2_Sub2 aClass_ra_Sub2_Sub2_6484;
	Class72 aClass72_6485;
	Class86 aClass86_6486;
	boolean aBoolean6487;
	long aLong6488 = 0L;

	long method2318() {
		return ((Class229) this).aLong6488;
	}

	public void method163(Class189 class189) {
		/* empty */
	}

	public void method53() {
		if (((Class229) this).aLong6488 != 0L) {
			IUnknown.Release(((Class229) this).aLong6488);
			((Class229) this).aLong6488 = 0L;
		}
		((Class229) this).aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	Class229(Class_ra_Sub2_Sub2 class_ra_sub2_sub2, Class72 class72, Class86 class86, boolean bool, int i) {
		((Class229) this).aClass_ra_Sub2_Sub2_6484 = class_ra_sub2_sub2;
		((Class229) this).aClass72_6485 = class72;
		((Class229) this).aClass86_6486 = class86;
		((Class229) this).aBoolean6487 = bool;
		((Class229) this).aClass_ra_Sub2_Sub2_6484.method4993(this);
	}

	public void method52() {
		if (((Class229) this).aLong6488 != 0L) {
			IUnknown.Release(((Class229) this).aLong6488);
			((Class229) this).aLong6488 = 0L;
		}
		((Class229) this).aClass_ra_Sub2_Sub2_6484.method4883(this);
	}

	void method2319() {
		if (((Class229) this).aLong6488 != 0L) {
			((Class229) this).aClass_ra_Sub2_Sub2_6484.method5173(((Class229) this).aLong6488);
			((Class229) this).aLong6488 = 0L;
		}
	}
}
