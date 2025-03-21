/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class74 {
	Class76_Sub2_Sub2 aClass76_Sub2_Sub2_625;
	Class76_Sub2_Sub2 aClass76_Sub2_Sub2_626;
	Class76_Sub2_Sub2 aClass76_Sub2_Sub2_627;
	Class471 aClass471_628;
	Class330_Sub36_Sub17 aClass330_Sub36_Sub17_629;
	Class_ra_Sub1 aClass_ra_Sub1_630;
	boolean aBoolean631;
	int anInt632;
	boolean aBoolean633;
	int anInt634 = 0;
	boolean aBoolean635;
	boolean aBoolean636;
	Class36_Sub1 aClass36_Sub1_637;
	boolean aBoolean638;
	Class36_Sub1[] aClass36_Sub1Array639;
	int anInt640;
	int anInt641 = 0;
	Class330_Sub36_Sub17 aClass330_Sub36_Sub17_642;
	boolean aBoolean643;
	int anInt644;
	Class86 aClass86_645;

	void method839() {
		((Class74) this).aClass76_Sub2_Sub2_626 = null;
		((Class74) this).aClass76_Sub2_Sub2_627 = null;
		((Class74) this).aClass76_Sub2_Sub2_625 = null;
		((Class74) this).aClass330_Sub36_Sub17_642 = null;
		((Class74) this).aClass36_Sub1_637 = null;
		((Class74) this).aClass36_Sub1Array639 = null;
		((Class74) this).aClass330_Sub36_Sub17_629 = null;
		if (!((Class74) this).aClass471_628.method5876(-910151095)) {
			for (Class330 class330 = ((Class74) this).aClass471_628.method5869(539664854); class330 != ((Class74) this).aClass471_628.aClass330_5611; class330 = class330.aClass330_3340)
				((Class330_Sub19) class330).method3363();
		}
		((Class74) this).anInt640 = 1;
		((Class74) this).anInt632 = 1;
	}

	boolean method840() {
		return ((Class74) this).aClass76_Sub2_Sub2_625 != null;
	}

	boolean method841() {
		if (((Class74) this).aBoolean636) {
			if (((Class74) this).aClass330_Sub36_Sub17_642 != null) {
				((Class74) this).aClass330_Sub36_Sub17_642.method53();
				((Class74) this).aClass330_Sub36_Sub17_642 = null;
			}
			if (((Class74) this).aClass36_Sub1_637 != null) {
				((Class74) this).aClass36_Sub1_637.method509();
				((Class74) this).aClass36_Sub1_637 = null;
			}
		}
		if (((Class74) this).aBoolean635) {
			if (((Class74) this).aClass330_Sub36_Sub17_629 != null) {
				((Class74) this).aClass330_Sub36_Sub17_629.method53();
				((Class74) this).aClass330_Sub36_Sub17_629 = null;
			}
			if (((Class74) this).aClass36_Sub1Array639[0] != null) {
				((Class74) this).aClass36_Sub1Array639[0].method509();
				((Class74) this).aClass36_Sub1Array639[0] = null;
			}
			if (((Class74) this).aClass36_Sub1Array639[1] != null) {
				((Class74) this).aClass36_Sub1Array639[1].method509();
				((Class74) this).aClass36_Sub1Array639[1] = null;
			}
		}
		if (((Class74) this).aBoolean636) {
			if (((Class74) this).aClass76_Sub2_Sub2_627 != null)
				((Class74) this).aClass330_Sub36_Sub17_642 = (new Class330_Sub36_Sub17(((Class74) this).aClass_ra_Sub1_630, Class72.aClass72_610, Class86.aClass86_719, ((Class74) this).anInt632, ((Class74) this).anInt640, (((Class_ra_Sub1) ((Class74) this).aClass_ra_Sub1_630).anInt8294)));
			if (((Class74) this).aBoolean643)
				((Class74) this).aClass36_Sub1_637 = new Class36_Sub1(((Class74) this).aClass_ra_Sub1_630, 34037, Class72.aClass72_610, Class86.aClass86_719, ((Class74) this).anInt632, ((Class74) this).anInt640);
			else if (((Class74) this).aClass330_Sub36_Sub17_642 == null)
				((Class74) this).aClass330_Sub36_Sub17_642 = new Class330_Sub36_Sub17((((Class74) this).aClass_ra_Sub1_630), Class72.aClass72_610, Class86.aClass86_719, ((Class74) this).anInt632, ((Class74) this).anInt640);
			((Class74) this).aBoolean636 = false;
			((Class74) this).aBoolean631 = true;
			((Class74) this).aBoolean638 = true;
		}
		if (((Class74) this).aBoolean635) {
			if (((Class74) this).aClass76_Sub2_Sub2_627 != null)
				((Class74) this).aClass330_Sub36_Sub17_629 = (new Class330_Sub36_Sub17(((Class74) this).aClass_ra_Sub1_630, Class72.aClass72_620, ((Class74) this).aClass86_645, ((Class74) this).anInt632, ((Class74) this).anInt640, (((Class_ra_Sub1) ((Class74) this).aClass_ra_Sub1_630).anInt8294)));
			((Class74) this).aClass36_Sub1Array639[0] = new Class36_Sub1(((Class74) this).aClass_ra_Sub1_630, 34037, Class72.aClass72_620, ((Class74) this).aClass86_645, ((Class74) this).anInt632, ((Class74) this).anInt640);
			((Class74) this).aClass36_Sub1Array639[1] = (((Class74) this).anInt644 > 1 ? new Class36_Sub1(((Class74) this).aClass_ra_Sub1_630, 34037, Class72.aClass72_620, ((Class74) this).aClass86_645, ((Class74) this).anInt632, ((Class74) this).anInt640) : null);
			((Class74) this).aBoolean635 = false;
			((Class74) this).aBoolean631 = true;
			((Class74) this).aBoolean638 = true;
		}
		if (((Class74) this).aBoolean631) {
			if (((Class74) this).aClass76_Sub2_Sub2_627 != null) {
				((Class74) this).aClass_ra_Sub1_630.method4785(((Class74) this).aClass76_Sub2_Sub2_626, (byte) 1);
				((Class74) this).aClass76_Sub2_Sub2_626.method900(null);
				((Class74) this).aClass76_Sub2_Sub2_626.method901(0, null);
				((Class74) this).aClass76_Sub2_Sub2_626.method901(1, null);
				((Class74) this).aClass76_Sub2_Sub2_626.method901(0, ((Class74) this).aClass36_Sub1Array639[0].method523(0));
				((Class74) this).aClass76_Sub2_Sub2_626.method901(1, (((Class74) this).anInt644 > 1 ? ((Class74) this).aClass36_Sub1Array639[1].method523(0) : null));
				if (((Class74) this).aBoolean643)
					((Class74) this).aClass76_Sub2_Sub2_626.method900(((Class74) this).aClass36_Sub1_637.method521(0));
				((Class74) this).aClass_ra_Sub1_630.method4802(((Class74) this).aClass76_Sub2_Sub2_626, (byte) 0);
				((Class74) this).aClass_ra_Sub1_630.method4785(((Class74) this).aClass76_Sub2_Sub2_627, (byte) 1);
				((Class74) this).aClass76_Sub2_Sub2_627.method900(null);
				((Class74) this).aClass76_Sub2_Sub2_627.method901(0, null);
				((Class74) this).aClass76_Sub2_Sub2_627.method901(0, ((Class74) this).aClass330_Sub36_Sub17_629);
				((Class74) this).aClass76_Sub2_Sub2_627.method900(((Class74) this).aClass330_Sub36_Sub17_642);
				((Class74) this).aClass_ra_Sub1_630.method4802(((Class74) this).aClass76_Sub2_Sub2_627, (byte) 0);
			} else {
				((Class74) this).aClass_ra_Sub1_630.method4785(((Class74) this).aClass76_Sub2_Sub2_626, (byte) 1);
				((Class74) this).aClass76_Sub2_Sub2_626.method900(null);
				((Class74) this).aClass76_Sub2_Sub2_626.method901(0, null);
				((Class74) this).aClass76_Sub2_Sub2_626.method901(1, null);
				((Class74) this).aClass76_Sub2_Sub2_626.method901(0, ((Class74) this).aClass36_Sub1Array639[0].method523(0));
				((Class74) this).aClass76_Sub2_Sub2_626.method901(1, (((Class74) this).anInt644 > 1 ? ((Class74) this).aClass36_Sub1Array639[1].method523(0) : null));
				if (((Class74) this).aBoolean643)
					((Class74) this).aClass76_Sub2_Sub2_626.method900(((Class74) this).aClass36_Sub1_637.method521(0));
				else
					((Class74) this).aClass76_Sub2_Sub2_626.method900(((Class74) this).aClass330_Sub36_Sub17_642);
				((Class74) this).aClass_ra_Sub1_630.method4802(((Class74) this).aClass76_Sub2_Sub2_626, (byte) 0);
			}
			((Class74) this).aBoolean631 = false;
			((Class74) this).aBoolean638 = true;
		}
		if (((Class74) this).aBoolean638) {
			((Class74) this).aClass_ra_Sub1_630.method4785(((Class74) this).aClass76_Sub2_Sub2_625, (byte) 1);
			((Class74) this).aBoolean638 = !((Class74) this).aClass76_Sub2_Sub2_625.method902();
			((Class74) this).aClass_ra_Sub1_630.method4802(((Class74) this).aClass76_Sub2_Sub2_625, (byte) 0);
		}
		return !((Class74) this).aBoolean638;
	}

	boolean method842(int i, int i_0_, int i_1_, int i_2_) {
		if (((Class74) this).aClass76_Sub2_Sub2_625 == null || ((Class74) this).aClass471_628.method5876(718595951))
			return false;
		if (((Class74) this).anInt632 != i_1_ || ((Class74) this).anInt640 != i_2_) {
			((Class74) this).anInt632 = i_1_;
			((Class74) this).anInt640 = i_2_;
			for (Class330 class330 = ((Class74) this).aClass471_628.method5869(539664854); class330 != ((Class74) this).aClass471_628.aClass330_5611; class330 = class330.aClass330_3340)
				((Class330_Sub19) class330).method3349((((Class74) this).anInt632), (((Class74) this).anInt640));
			((Class74) this).aBoolean635 = true;
			((Class74) this).aBoolean636 = true;
			((Class74) this).aBoolean631 = true;
		}
		if (method841()) {
			((Class74) this).anInt634 = i;
			((Class74) this).anInt641 = i_0_;
			((Class74) this).aBoolean633 = true;
			((Class74) this).aClass_ra_Sub1_630.method4817(-((Class74) this).anInt634, (((Class74) this).anInt640 + ((Class74) this).anInt641 - ((Class74) this).aClass_ra_Sub1_630.method4782((byte) 0).method857()));
			((Class74) this).aClass_ra_Sub1_630.method4785(((Class74) this).aClass76_Sub2_Sub2_625, (byte) 1);
			((Class74) this).aClass_ra_Sub1_630.ba(3, 0);
			((Class74) this).aClass76_Sub2_Sub2_625.method918(0);
			return true;
		}
		return false;
	}

	boolean method843(Class330_Sub19 class330_sub19) {
		if (((Class74) this).aClass76_Sub2_Sub2_625 != null) {
			if (class330_sub19.method3345() || class330_sub19.method3347()) {
				((Class74) this).aClass471_628.method5878(class330_sub19, (short) 8192);
				method846();
				if (method841()) {
					if (((Class74) this).anInt632 != -1 && ((Class74) this).anInt640 != -1)
						class330_sub19.method3349(((Class74) this).anInt632, ((Class74) this).anInt640);
					((Class330_Sub19) class330_sub19).aBoolean7646 = true;
					return true;
				}
			}
			method844(class330_sub19);
		}
		return false;
	}

	void method844(Class330_Sub19 class330_sub19) {
		((Class330_Sub19) class330_sub19).aBoolean7646 = false;
		class330_sub19.method3363();
		class330_sub19.method3252(808515459);
		method846();
	}

	void method845() {
		if (((Class74) this).aBoolean633) {
			if (((Class74) this).aClass76_Sub2_Sub2_627 != null) {
				((Class74) this).aClass_ra_Sub1_630.method4802(((Class74) this).aClass76_Sub2_Sub2_627, (byte) 0);
				((Class74) this).aClass_ra_Sub1_630.method4785(((Class74) this).aClass76_Sub2_Sub2_626, (byte) 1);
				((Class74) this).aClass76_Sub2_Sub2_626.method918(0);
				((Class74) this).aClass76_Sub2_Sub2_627.method903(0, 0, ((Class74) this).anInt632, ((Class74) this).anInt640, 0, 0, true, ((Class74) this).aBoolean643);
			}
			((Class74) this).aClass_ra_Sub1_630.method4838();
			((Class74) this).aClass_ra_Sub1_630.method4859(0);
			((Class74) this).aClass_ra_Sub1_630.method4836(1);
			((Class74) this).aClass_ra_Sub1_630.L();
			int i = 0;
			int i_3_ = 1;
			Class330_Sub19 class330_sub19;
			for (Class330_Sub19 class330_sub19_4_ = ((Class330_Sub19) ((Class74) this).aClass471_628.method5869(539664854)); class330_sub19_4_ != null; class330_sub19_4_ = class330_sub19) {
				class330_sub19 = ((Class330_Sub19) ((Class74) this).aClass471_628.method5873((byte) -81));
				int i_5_ = class330_sub19_4_.method3356();
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					class330_sub19_4_.method3352(i_6_, (((Class74) this).aClass36_Sub1Array639[i]), (((Class74) this).aClass36_Sub1_637));
					if (class330_sub19 == null && i_6_ == i_5_ - 1) {
						((Class74) this).aClass_ra_Sub1_630.method4802(((Class74) this).aClass76_Sub2_Sub2_626, (byte) 0);
						((Class74) this).aClass_ra_Sub1_630.method4817(0, 0);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) ((Class74) this).anInt640);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(((Class74) this).anInt634, ((Class74) this).anInt641);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(((Class74) this).anInt634, (((Class74) this).anInt641 + ((Class74) this).anInt640));
						OpenGL.glTexCoord2f((float) ((Class74) this).anInt632, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i((((Class74) this).anInt634 + ((Class74) this).anInt632), (((Class74) this).anInt641 + ((Class74) this).anInt640));
						OpenGL.glTexCoord2f((float) ((Class74) this).anInt632, (float) ((Class74) this).anInt640);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i((((Class74) this).anInt634 + ((Class74) this).anInt632), ((Class74) this).anInt641);
						OpenGL.glEnd();
					} else {
						((Class74) this).aClass76_Sub2_Sub2_626.method918(i_3_);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) ((Class74) this).anInt640);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(0, ((Class74) this).anInt640);
						OpenGL.glTexCoord2f((float) ((Class74) this).anInt632, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(((Class74) this).anInt632, ((Class74) this).anInt640);
						OpenGL.glTexCoord2f((float) ((Class74) this).anInt632, (float) ((Class74) this).anInt640);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(((Class74) this).anInt632, 0);
						OpenGL.glEnd();
					}
					class330_sub19_4_.method3351(i_6_);
					i_3_ = i_3_ + 1 & 0x1;
					i = i + 1 & 0x1;
				}
			}
			((Class74) this).aBoolean633 = false;
		}
	}

	Class74(Class_ra_Sub1 class_ra_sub1) {
		((Class74) this).anInt632 = 1;
		((Class74) this).anInt640 = 1;
		((Class74) this).aClass471_628 = new Class471();
		((Class74) this).aBoolean635 = true;
		((Class74) this).aBoolean636 = true;
		((Class74) this).aBoolean631 = true;
		((Class74) this).aBoolean638 = true;
		((Class74) this).aClass36_Sub1Array639 = new Class36_Sub1[2];
		((Class74) this).aBoolean643 = false;
		((Class74) this).anInt644 = 0;
		((Class74) this).aClass86_645 = Class86.aClass86_714;
		((Class74) this).aClass_ra_Sub1_630 = class_ra_sub1;
		if (((Class_ra_Sub1) ((Class74) this).aClass_ra_Sub1_630).aBoolean8429 && (((Class_ra_Sub1) ((Class74) this).aClass_ra_Sub1_630).aBoolean8411)) {
			((Class74) this).aClass76_Sub2_Sub2_625 = ((Class74) this).aClass76_Sub2_Sub2_626 = new Class76_Sub2_Sub2(((Class74) this).aClass_ra_Sub1_630);
			if ((((Class_ra_Sub1) ((Class74) this).aClass_ra_Sub1_630).anInt8294) > 1 && (((Class_ra_Sub1) ((Class74) this).aClass_ra_Sub1_630).aBoolean8413) && (((Class_ra_Sub1) ((Class74) this).aClass_ra_Sub1_630).aBoolean8414))
				((Class74) this).aClass76_Sub2_Sub2_625 = ((Class74) this).aClass76_Sub2_Sub2_627 = new Class76_Sub2_Sub2(((Class74) this).aClass_ra_Sub1_630);
		}
	}

	void method846() {
		int i = 0;
		boolean bool = false;
		Class86 class86 = Class86.aClass86_714;
		for (Class330_Sub19 class330_sub19 = ((Class330_Sub19) ((Class74) this).aClass471_628.method5869(539664854)); class330_sub19 != null; class330_sub19 = (Class330_Sub19) ((Class74) this).aClass471_628.method5873((byte) -6)) {
			Class86 class86_7_ = class330_sub19.method3354();
			if (class86_7_.anInt724 * -1615628035 > class86.anInt724 * -1615628035)
				class86 = class86_7_;
			bool |= class330_sub19.method3353();
			i += class330_sub19.method3356();
		}
		if (class86 != ((Class74) this).aClass86_645) {
			((Class74) this).aClass86_645 = class86;
			((Class74) this).aBoolean635 = true;
		}
		int i_8_ = ((Class74) this).anInt644 > 2 ? 2 : ((Class74) this).anInt644;
		int i_9_ = i > 2 ? 2 : i;
		if (i_8_ != i_9_) {
			((Class74) this).aBoolean635 = true;
			((Class74) this).aBoolean631 = true;
		}
		if (bool != ((Class74) this).aBoolean643) {
			((Class74) this).aBoolean643 = bool;
			((Class74) this).aBoolean636 = true;
		}
		((Class74) this).anInt644 = i;
	}
}
