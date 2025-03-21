/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class338 {
	boolean aBoolean3370;
	int anInt3371;
	int anInt3372;
	public List aList3373 = new LinkedList();
	static Font aFont3374;

	void method3958(Class353 class353, byte i) {
		try {
			Class432_Sub1 class432_sub1 = class353.aClass432_Sub1_3489;
			boolean bool = true;
			Class80[] class80s = class353.aClass432_Sub1_3489.aClass80Array8656;
			for (int i_0_ = 0; i_0_ < class80s.length; i_0_++) {
				if (class80s[i_0_].aBoolean671) {
					bool = false;
					break;
				}
			}
			if (!bool) {
				((Class353) class353).aClass338_3490 = this;
				if (((Class338) this).aBoolean3370) {
					Iterator iterator = aList3373.iterator();
					while (iterator.hasNext()) {
						Class353 class353_1_ = (Class353) iterator.next();
						if (class353_1_.aClass432_Sub1_3489 == class432_sub1) {
							iterator.remove();
							Class227.method2312(class353_1_, 1460238150);
						}
					}
				}
				ListIterator listiterator = aList3373.listIterator();
				while_88_: do {
					Class353 class353_2_;
					do {
						if (!listiterator.hasNext())
							break while_88_;
						class353_2_ = (Class353) listiterator.next();
					} while ((((Class432_Sub1) class432_sub1).anInt8657 * -1215277407) < (((Class432_Sub1) class353_2_.aClass432_Sub1_3489).anInt8657 * -1215277407));
					listiterator.previous();
					listiterator.add(class353);
					return;
				} while (false);
				aList3373.add(class353);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oc.j(").append(')').toString());
		}
	}

	Class338(boolean bool) {
		((Class338) this).aBoolean3370 = false;
		((Class338) this).anInt3371 = 0;
		((Class338) this).anInt3372 = 0;
		((Class338) this).aBoolean3370 = bool;
	}

	public void method3959(byte i) {
		try {
			Iterator iterator = aList3373.iterator();
			while (iterator.hasNext()) {
				Class353 class353 = (Class353) iterator.next();
				iterator.remove();
				Class227.method2312(class353, -1005874397);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oc.r(").append(')').toString());
		}
	}

	static void method3960(boolean bool, Class330_Sub40_Sub2 class330_sub40_sub2, byte i) {
		try {
			Class95_Sub11.aClass296_7171.method2935(class330_sub40_sub2);
			if (bool)
				Class546.method6354(Class67.aClass280_581, Class145_Sub1.aClass280_7265, Class428.aClass280_4362, class330_sub40_sub2, Class95_Sub11.aClass296_7171, 560802067);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oc.p(").append(')').toString());
		}
	}
}
