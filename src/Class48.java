/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class48 {
	Class47 aClass47_471;
	int anInt472 = 0;
	int anInt473 = 0;
	int anInt474 = 0;
	Class49[] aClass49Array475;
	Class_ra_Sub1 aClass_ra_Sub1_476;
	Class49_Sub2 aClass49_Sub2_477;

	boolean method597(int i) {
		return ((Class48) this).aClass49Array475[i].method601();
	}

	boolean method598(Class36 class36, int i) {
		if (((Class48) this).anInt474 == 0)
			return false;
		((Class48) this).aClass49Array475[((Class48) this).anInt474 & 0x7fffffff].method600(class36, i);
		return true;
	}

	Class48(Class_ra_Sub1 class_ra_sub1) {
		((Class48) this).aClass_ra_Sub1_476 = class_ra_sub1;
		((Class48) this).aClass47_471 = new Class47(class_ra_sub1);
		((Class48) this).aClass49Array475 = new Class49[16];
		((Class48) this).aClass49Array475[1] = new Class49_Sub7(class_ra_sub1);
		((Class48) this).aClass49Array475[2] = new Class49_Sub4(class_ra_sub1, ((Class48) this).aClass47_471);
		((Class48) this).aClass49Array475[4] = new Class49_Sub1(class_ra_sub1, ((Class48) this).aClass47_471);
		((Class48) this).aClass49Array475[5] = new Class49_Sub5(class_ra_sub1, ((Class48) this).aClass47_471);
		((Class48) this).aClass49Array475[6] = new Class49_Sub8(class_ra_sub1);
		((Class48) this).aClass49Array475[7] = new Class49_Sub3(class_ra_sub1);
		((Class48) this).aClass49Array475[3] = ((Class48) this).aClass49_Sub2_477 = new Class49_Sub2(class_ra_sub1);
		((Class48) this).aClass49Array475[8] = new Class49_Sub9(class_ra_sub1, ((Class48) this).aClass47_471);
		((Class48) this).aClass49Array475[9] = new Class49_Sub6(class_ra_sub1, ((Class48) this).aClass47_471);
		if (!((Class48) this).aClass49Array475[8].method601())
			((Class48) this).aClass49Array475[8] = ((Class48) this).aClass49Array475[4];
		if (!((Class48) this).aClass49Array475[9].method601())
			((Class48) this).aClass49Array475[9] = ((Class48) this).aClass49Array475[8];
	}

	void method599(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= ((Class48) this).aClass_ra_Sub1_476.method4851();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_1_ = i_0_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (((Class48) this).anInt474 != i) {
			if (((Class48) this).anInt474 != 0)
				((Class48) this).aClass49Array475[((Class48) this).anInt474 & 0x7fffffff].method604();
			if (i != 0) {
				((Class48) this).aClass49Array475[i & 0x7fffffff].method602(bool);
				((Class48) this).aClass49Array475[i & 0x7fffffff].method608(bool);
				((Class48) this).aClass49Array475[i & 0x7fffffff].method606(i_0_, i_1_);
			}
			((Class48) this).anInt474 = i;
			((Class48) this).anInt472 = i_0_;
			((Class48) this).anInt473 = i_1_;
		} else if (((Class48) this).anInt474 != 0) {
			((Class48) this).aClass49Array475[((Class48) this).anInt474 & 0x7fffffff].method608(bool);
			if (((Class48) this).anInt472 != i_0_ || ((Class48) this).anInt473 != i_1_) {
				((Class48) this).aClass49Array475[((Class48) this).anInt474 & 0x7fffffff].method606(i_0_, i_1_);
				((Class48) this).anInt472 = i_0_;
				((Class48) this).anInt473 = i_1_;
			}
		}
	}
}
