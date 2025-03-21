/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432 {
	Class241 aClass241_4400;
	Class241 aClass241_4401;
	boolean aBoolean4402;
	boolean aBoolean4403;
	boolean aBoolean4404;
	Class247 aClass247_4405;
	Class432 aClass432_4406;
	Class432 aClass432_4407;
	Class432 aClass432_4408;
	Class241 aClass241_4409 = new Class241();

	public final Class241 method5345() {
		return ((Class432) this).aClass241_4409;
	}

	public final Class241 method5346() {
		if (((Class432) this).aBoolean4402) {
			((Class432) this).aBoolean4402 = false;
			((Class432) this).aClass241_4401.method2400(((Class432) this).aClass241_4409);
			if (((Class432) this).aClass432_4407 != null)
				((Class432) this).aClass241_4401.method2402(((Class432) this).aClass432_4407.method5346());
		}
		return ((Class432) this).aClass241_4401;
	}

	Class432() {
		((Class432) this).aClass241_4401 = new Class241();
		((Class432) this).aBoolean4402 = true;
		((Class432) this).aClass241_4400 = new Class241();
		((Class432) this).aBoolean4404 = true;
		new Class249();
		new Class249();
		((Class432) this).aClass247_4405 = new Class247();
		((Class432) this).aBoolean4403 = true;
		((Class432) this).aClass432_4407 = null;
		((Class432) this).aClass432_4408 = null;
		((Class432) this).aClass432_4406 = null;
	}

	final Class241 method5347() {
		if (((Class432) this).aBoolean4404) {
			((Class432) this).aBoolean4404 = false;
			((Class432) this).aClass241_4400.method2400(method5346());
			((Class432) this).aClass241_4400.method2401();
		}
		return ((Class432) this).aClass241_4401;
	}

	public final void method5348(float f, float f_0_, float f_1_) {
		((Class432) this).aClass241_4409.aClass260_2606.method2553(f, f_0_, f_1_);
		method5350();
		if (((Class432) this).aClass432_4408 != null)
			((Class432) this).aClass432_4408.method5351();
	}

	public final void method5349(Class260 class260) {
		((Class432) this).aClass241_4409.aClass260_2606.method2582(class260);
		method5350();
		if (((Class432) this).aClass432_4408 != null)
			((Class432) this).aClass432_4408.method5351();
	}

	final void method5350() {
		((Class432) this).aBoolean4402 = true;
		((Class432) this).aBoolean4404 = true;
		((Class432) this).aBoolean4403 = true;
	}

	final void method5351() {
		method5350();
		if (((Class432) this).aClass432_4408 != null)
			((Class432) this).aClass432_4408.method5351();
		if (((Class432) this).aClass432_4406 != null)
			((Class432) this).aClass432_4406.method5351();
	}

	public final void method5352() {
		if (((Class432) this).aClass432_4407 != null) {
			Class432 class432_2_ = ((Class432) ((Class432) this).aClass432_4407).aClass432_4408;
			if (class432_2_ == this)
				((Class432) ((Class432) this).aClass432_4407).aClass432_4408 = ((Class432) this).aClass432_4406;
			else {
				for (/**/; ((Class432) class432_2_).aClass432_4406 != this; class432_2_ = ((Class432) class432_2_).aClass432_4406) {
					/* empty */
				}
				((Class432) class432_2_).aClass432_4406 = ((Class432) this).aClass432_4406;
			}
		}
		method5350();
		if (((Class432) this).aClass432_4408 != null) {
			((Class432) this).aClass432_4408.method5351();
			Class432 class432_3_ = ((Class432) this).aClass432_4408;
			for (;;) {
				((Class432) class432_3_).aClass241_4409.method2402(((Class432) this).aClass241_4409);
				((Class432) class432_3_).aClass432_4407 = ((Class432) this).aClass432_4407;
				if (((Class432) class432_3_).aClass432_4406 == null) {
					((Class432) class432_3_).aClass432_4406 = (((Class432) ((Class432) this).aClass432_4407).aClass432_4408);
					break;
				}
				class432_3_ = ((Class432) class432_3_).aClass432_4406;
			}
			((Class432) ((Class432) this).aClass432_4407).aClass432_4408 = ((Class432) this).aClass432_4408;
		}
		((Class432) this).aClass432_4407 = null;
		((Class432) this).aClass432_4406 = null;
		((Class432) this).aClass432_4408 = null;
	}

	final void method5353(Class241 class241) {
		if (((Class432) this).aClass432_4407 != null) {
			Class241 class241_4_ = new Class241(class241);
			class241_4_.method2402(((Class432) this).aClass432_4407.method5347());
			method5354(class241_4_);
		} else
			method5354(class241);
	}

	final void method5354(Class241 class241) {
		((Class432) this).aClass241_4409.method2400(class241);
		method5350();
		if (((Class432) this).aClass432_4408 != null)
			((Class432) this).aClass432_4408.method5351();
	}

	final Class247 method5355() {
		if (((Class432) this).aBoolean4403) {
			((Class432) this).aBoolean4403 = false;
			((Class432) this).aClass247_4405.method2456(method5346());
		}
		return ((Class432) this).aClass247_4405;
	}

	public final void method5356(Class244 class244) {
		((Class432) this).aClass241_4409.aClass244_2607.method2419(class244);
		method5350();
		if (((Class432) this).aClass432_4408 != null)
			((Class432) this).aClass432_4408.method5351();
	}
}
