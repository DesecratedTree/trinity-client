/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class399 {
	Class472 aClass472_4120 = new Class472();
	int anInt4121;
	Class497 aClass497_4122;
	int anInt4123;

	public final Object method4688(Interface22 interface22) {
		long l = interface22.method288();
		for (Class330_Sub36_Sub7 class330_sub36_sub7 = ((Class330_Sub36_Sub7) ((Class399) this).aClass497_4122.method6094(l)); class330_sub36_sub7 != null; class330_sub36_sub7 = ((Class330_Sub36_Sub7) ((Class399) this).aClass497_4122.method6095(1914750334))) {
			if (((Class330_Sub36_Sub7) class330_sub36_sub7).anInterface22_9669.method287(interface22)) {
				Object object = class330_sub36_sub7.method3468();
				if (object == null) {
					class330_sub36_sub7.method3252(-57952718);
					class330_sub36_sub7.method3439((byte) -58);
					((Class399) this).anInt4121 += (((Class330_Sub36_Sub7) class330_sub36_sub7).anInt9668);
				} else {
					if (class330_sub36_sub7.method3467()) {
						Class330_Sub36_Sub7_Sub1 class330_sub36_sub7_sub1 = (new Class330_Sub36_Sub7_Sub1(interface22, object, (((Class330_Sub36_Sub7) class330_sub36_sub7).anInt9668)));
						((Class399) this).aClass497_4122.method6097(class330_sub36_sub7_sub1, (class330_sub36_sub7.aLong3341 * -6154793640677333111L));
						((Class399) this).aClass472_4120.method5883(class330_sub36_sub7_sub1, -27235115);
						class330_sub36_sub7_sub1.aLong7734 = 0L;
						class330_sub36_sub7.method3252(522994679);
						class330_sub36_sub7.method3439((byte) -79);
					} else {
						((Class399) this).aClass472_4120.method5883(class330_sub36_sub7, -2092260984);
						class330_sub36_sub7.aLong7734 = 0L;
					}
					return object;
				}
			}
		}
		return null;
	}

	final void method4689(Interface22 interface22) {
		long l = interface22.method288();
		for (Class330_Sub36_Sub7 class330_sub36_sub7 = ((Class330_Sub36_Sub7) ((Class399) this).aClass497_4122.method6094(l)); class330_sub36_sub7 != null; class330_sub36_sub7 = ((Class330_Sub36_Sub7) ((Class399) this).aClass497_4122.method6095(1300281323))) {
			if (((Class330_Sub36_Sub7) class330_sub36_sub7).anInterface22_9669.method287(interface22)) {
				method4690(class330_sub36_sub7);
				break;
			}
		}
	}

	final void method4690(Class330_Sub36_Sub7 class330_sub36_sub7) {
		if (class330_sub36_sub7 != null) {
			class330_sub36_sub7.method3252(-1802552979);
			class330_sub36_sub7.method3439((byte) -123);
			((Class399) this).anInt4121 += ((Class330_Sub36_Sub7) class330_sub36_sub7).anInt9668;
		}
	}

	public final void method4691(int i) {
		for (Class330_Sub36_Sub7 class330_sub36_sub7 = ((Class330_Sub36_Sub7) ((Class399) this).aClass472_4120.method5884((byte) 35)); class330_sub36_sub7 != null; class330_sub36_sub7 = (Class330_Sub36_Sub7) ((Class399) this).aClass472_4120.method5886((short) 8192)) {
			if (class330_sub36_sub7.method3467()) {
				if (class330_sub36_sub7.method3468() == null) {
					class330_sub36_sub7.method3252(1523871594);
					class330_sub36_sub7.method3439((byte) -89);
					((Class399) this).anInt4121 += (((Class330_Sub36_Sub7) class330_sub36_sub7).anInt9668);
				}
			} else if ((class330_sub36_sub7.aLong7734 += -8616098919773127473L) * -6756588965814089169L > (long) i) {
				Class330_Sub36_Sub7_Sub2 class330_sub36_sub7_sub2 = (new Class330_Sub36_Sub7_Sub2((((Class330_Sub36_Sub7) class330_sub36_sub7).anInterface22_9669), class330_sub36_sub7.method3468(), (((Class330_Sub36_Sub7) class330_sub36_sub7).anInt9668)));
				((Class399) this).aClass497_4122.method6097(class330_sub36_sub7_sub2, class330_sub36_sub7.aLong3341 * -6154793640677333111L);
				Class215.method2239(class330_sub36_sub7_sub2, class330_sub36_sub7, -1673762223);
				class330_sub36_sub7.method3252(-1341789521);
				class330_sub36_sub7.method3439((byte) -46);
			}
		}
	}

	public final void method4692() {
		((Class399) this).aClass472_4120.method5889(-1601226350);
		((Class399) this).aClass497_4122.method6100(65280);
		((Class399) this).anInt4121 = ((Class399) this).anInt4123;
	}

	public final void method4693() {
		for (Class330_Sub36_Sub7 class330_sub36_sub7 = ((Class330_Sub36_Sub7) ((Class399) this).aClass472_4120.method5884((byte) 65)); class330_sub36_sub7 != null; class330_sub36_sub7 = (Class330_Sub36_Sub7) ((Class399) this).aClass472_4120.method5886((short) 8192)) {
			if (class330_sub36_sub7.method3467()) {
				class330_sub36_sub7.method3252(-1018699090);
				class330_sub36_sub7.method3439((byte) -72);
				((Class399) this).anInt4121 += ((Class330_Sub36_Sub7) class330_sub36_sub7).anInt9668;
			}
		}
	}

	public final int method4694() {
		return ((Class399) this).anInt4123;
	}

	final void method4695(Object object, Interface22 interface22, int i) {
		if (i > ((Class399) this).anInt4123)
			throw new IllegalStateException();
		method4689(interface22);
		((Class399) this).anInt4121 -= i;
		while (((Class399) this).anInt4121 < 0) {
			Class330_Sub36_Sub7 class330_sub36_sub7 = ((Class330_Sub36_Sub7) ((Class399) this).aClass472_4120.method5888(525653981));
			method4690(class330_sub36_sub7);
		}
		Class330_Sub36_Sub7_Sub1 class330_sub36_sub7_sub1 = new Class330_Sub36_Sub7_Sub1(interface22, object, i);
		((Class399) this).aClass497_4122.method6097(class330_sub36_sub7_sub1, interface22.method288());
		((Class399) this).aClass472_4120.method5883(class330_sub36_sub7_sub1, -1135696655);
		class330_sub36_sub7_sub1.aLong7734 = 0L;
	}

	public final void method4696(Object object, Interface22 interface22) {
		method4695(object, interface22, 1);
	}

	public final int method4697() {
		return ((Class399) this).anInt4121;
	}

	public Class399(int i) {
		((Class399) this).anInt4123 = i;
		((Class399) this).anInt4121 = i;
		int i_0_;
		for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
			/* empty */
		}
		((Class399) this).aClass497_4122 = new Class497(i_0_);
	}
}
