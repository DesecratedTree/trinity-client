/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73 {
	Class367 aClass367_622 = new Class367(6291456, 256);
	Class_ra_Sub1 aClass_ra_Sub1_623;
	Interface_ma anInterface_ma624;

	Class36_Sub1 method834(int i, int i_0_) {
		Class36_Sub1 class36_sub1 = ((Class36_Sub1) ((Class73) this).aClass367_622.get((long) i));
		if (class36_sub1 != null)
			return class36_sub1;
		if (!method835(i, i_0_))
			return null;
		Class56 class56 = ((Class73) this).anInterface_ma624.method221(i, 1140965331);
		if (i_0_ == -1)
			i_0_ = class56.anInt532 * -1963453415;
		Class36_Sub1 class36_sub1_1_;
		if (!class56.aBoolean508 || !((Class73) this).aClass_ra_Sub1_623.cg()) {
			int[] is;
			if (class56.aClass369_524 == Class369.aClass369_6817 || !Class376.method4368(class56.aByte525, -1699327788))
				is = ((Class73) this).anInterface_ma624.method231(i, 0.7F, i_0_, i_0_, false, -638072524);
			else
				is = ((Class73) this).anInterface_ma624.method220(i, 0.7F, i_0_, i_0_, true, -2089138391);
			class36_sub1_1_ = new Class36_Sub1(((Class73) this).aClass_ra_Sub1_623, 3553, i_0_, i_0_, class56.aByte538 != 0, is, 0, 0, false);
		} else {
			float[] fs = ((Class73) this).anInterface_ma624.method222(i, 0.7F, i_0_, i_0_, false, (short) 255);
			class36_sub1_1_ = new Class36_Sub1(((Class73) this).aClass_ra_Sub1_623, 3553, Class72.aClass72_620, Class86.aClass86_716, i_0_, i_0_, class56.aByte538 != 0, fs, Class72.aClass72_620);
		}
		class36_sub1_1_.method518(class56.aBoolean536, class56.aBoolean537);
		((Class73) this).aClass367_622.method4299(class36_sub1_1_, (long) i, i_0_ * i_0_, (byte) -46);
		return class36_sub1_1_;
	}

	boolean method835(int i, int i_2_) {
		Class56 class56 = ((Class73) this).anInterface_ma624.method221(i, -5820853);
		if (i_2_ == -1)
			i_2_ = class56.anInt532 * -1963453415;
		if (!class56.aBoolean508 || !((Class73) this).aClass_ra_Sub1_623.cg()) {
			if (class56.aClass369_524 == Class369.aClass369_6817 || !Class376.method4368(class56.aByte525, -1296929787))
				return (((Class73) this).anInterface_ma624.method237(i, Class377.aClass377_3935, 0.7F, i_2_, i_2_, false, 2146024972));
			return (((Class73) this).anInterface_ma624.method237(i, Class377.aClass377_3934, 0.7F, i_2_, i_2_, true, 2137453829));
		}
		return ((Class73) this).anInterface_ma624.method237(i, (Class377.aClass377_3936), 0.7F, i_2_, i_2_, false, 2142970166);
	}

	void method836() {
		((Class73) this).aClass367_622.method4292(5, (byte) 42);
	}

	void method837() {
		((Class73) this).aClass367_622.method4298((byte) 21);
	}

	Class73(Class_ra_Sub1 class_ra_sub1, Interface_ma interface_ma) {
		((Class73) this).aClass_ra_Sub1_623 = class_ra_sub1;
		((Class73) this).anInterface_ma624 = interface_ma;
	}

	Class36_Sub1 method838(int i) {
		return method834(i, -1);
	}
}
