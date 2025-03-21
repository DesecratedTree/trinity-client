/* Class330_Sub40_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub40_Sub4 extends Class330_Sub40 {
	Class471 aClass471_9786 = new Class471();
	Class471 aClass471_9787 = new Class471();
	int anInt9788;
	int anInt9789 = 0;

	void method3683(Class330 class330, Class330_Sub25 class330_sub25) {
		for (/**/; ((class330 != ((Class330_Sub40_Sub4) this).aClass471_9787.aClass330_5611) && (((Class330_Sub25) (Class330_Sub25) class330).anInt7695 <= ((Class330_Sub25) class330_sub25).anInt7695)); class330 = class330.aClass330_3340) {
			/* empty */
		}
		Class511.method6186(class330_sub25, class330, -1884670110);
		((Class330_Sub40_Sub4) this).anInt9788 = ((Class330_Sub25) (Class330_Sub25) (((Class330_Sub40_Sub4) this).aClass471_9787.aClass330_5611.aClass330_3340)).anInt7695;
	}

	public final synchronized void method3684(Class330_Sub40 class330_sub40) {
		((Class330_Sub40_Sub4) this).aClass471_9786.method5880(class330_sub40, -1684152681);
	}

	public final synchronized void method3685(Class330_Sub40 class330_sub40) {
		class330_sub40.method3252(-436003041);
	}

	void method3686() {
		if (((Class330_Sub40_Sub4) this).anInt9789 > 0) {
			for (Class330_Sub25 class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5869(539664854); class330_sub25 != null; class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5873((byte) -104))
				((Class330_Sub25) class330_sub25).anInt7695 -= ((Class330_Sub40_Sub4) this).anInt9789;
			((Class330_Sub40_Sub4) this).anInt9788 -= ((Class330_Sub40_Sub4) this).anInt9789;
			((Class330_Sub40_Sub4) this).anInt9789 = 0;
		}
	}

	void method3687(int[] is, int i, int i_0_) {
		for (Class330_Sub40 class330_sub40 = (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5869(539664854); class330_sub40 != null; class330_sub40 = (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5873((byte) -51))
			class330_sub40.method3563(is, i, i_0_);
	}

	void method3688(Class330_Sub25 class330_sub25) {
		class330_sub25.method3252(-819246382);
		class330_sub25.method3379();
		Class330 class330 = (((Class330_Sub40_Sub4) this).aClass471_9787.aClass330_5611.aClass330_3340);
		if (class330 == ((Class330_Sub40_Sub4) this).aClass471_9787.aClass330_5611)
			((Class330_Sub40_Sub4) this).anInt9788 = -1;
		else
			((Class330_Sub40_Sub4) this).anInt9788 = ((Class330_Sub25) (Class330_Sub25) class330).anInt7695;
	}

	Class330_Sub40 method3558() {
		return (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5873((byte) -91);
	}

	Class330_Sub40 method3550() {
		return (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5873((byte) -120);
	}

	int method3562() {
		return 0;
	}

	public final synchronized void method3565(int[] is, int i, int i_1_) {
		do {
			if (((Class330_Sub40_Sub4) this).anInt9788 < 0) {
				method3687(is, i, i_1_);
				break;
			}
			if (((Class330_Sub40_Sub4) this).anInt9789 + i_1_ < ((Class330_Sub40_Sub4) this).anInt9788) {
				((Class330_Sub40_Sub4) this).anInt9789 += i_1_;
				method3687(is, i, i_1_);
				break;
			}
			int i_2_ = (((Class330_Sub40_Sub4) this).anInt9788 - ((Class330_Sub40_Sub4) this).anInt9789);
			method3687(is, i, i_2_);
			i += i_2_;
			i_1_ -= i_2_;
			((Class330_Sub40_Sub4) this).anInt9789 += i_2_;
			method3686();
			Class330_Sub25 class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5869(539664854);
			synchronized (class330_sub25) {
				int i_3_ = class330_sub25.method3386(this);
				if (i_3_ < 0) {
					((Class330_Sub25) class330_sub25).anInt7695 = 0;
					method3688(class330_sub25);
				} else {
					((Class330_Sub25) class330_sub25).anInt7695 = i_3_;
					method3683(class330_sub25.aClass330_3340, class330_sub25);
				}
			}
		} while (i_1_ != 0);
	}

	public final synchronized void method3555(int i) {
		do {
			if (((Class330_Sub40_Sub4) this).anInt9788 < 0) {
				method3689(i);
				break;
			}
			if (((Class330_Sub40_Sub4) this).anInt9789 + i < ((Class330_Sub40_Sub4) this).anInt9788) {
				((Class330_Sub40_Sub4) this).anInt9789 += i;
				method3689(i);
				break;
			}
			int i_4_ = (((Class330_Sub40_Sub4) this).anInt9788 - ((Class330_Sub40_Sub4) this).anInt9789);
			method3689(i_4_);
			i -= i_4_;
			((Class330_Sub40_Sub4) this).anInt9789 += i_4_;
			method3686();
			Class330_Sub25 class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5869(539664854);
			synchronized (class330_sub25) {
				int i_5_ = class330_sub25.method3386(this);
				if (i_5_ < 0) {
					((Class330_Sub25) class330_sub25).anInt7695 = 0;
					method3688(class330_sub25);
				} else {
					((Class330_Sub25) class330_sub25).anInt7695 = i_5_;
					method3683(class330_sub25.aClass330_3340, class330_sub25);
				}
			}
		} while (i != 0);
	}

	int method3553() {
		return 0;
	}

	Class330_Sub40 method3556() {
		return (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5869(539664854);
	}

	Class330_Sub40 method3557() {
		return (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5873((byte) -125);
	}

	void method3689(int i) {
		for (Class330_Sub40 class330_sub40 = (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5869(539664854); class330_sub40 != null; class330_sub40 = (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5873((byte) -31))
			class330_sub40.method3555(i);
	}

	Class330_Sub40 method3559() {
		return (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5873((byte) -107);
	}

	int method3560() {
		return 0;
	}

	int method3570() {
		return 0;
	}

	Class330_Sub40 method3552() {
		return (Class330_Sub40) ((Class330_Sub40_Sub4) this).aClass471_9786.method5869(539664854);
	}

	int method3554() {
		return 0;
	}

	public final synchronized void method3564(int[] is, int i, int i_6_) {
		do {
			if (((Class330_Sub40_Sub4) this).anInt9788 < 0) {
				method3687(is, i, i_6_);
				break;
			}
			if (((Class330_Sub40_Sub4) this).anInt9789 + i_6_ < ((Class330_Sub40_Sub4) this).anInt9788) {
				((Class330_Sub40_Sub4) this).anInt9789 += i_6_;
				method3687(is, i, i_6_);
				break;
			}
			int i_7_ = (((Class330_Sub40_Sub4) this).anInt9788 - ((Class330_Sub40_Sub4) this).anInt9789);
			method3687(is, i, i_7_);
			i += i_7_;
			i_6_ -= i_7_;
			((Class330_Sub40_Sub4) this).anInt9789 += i_7_;
			method3686();
			Class330_Sub25 class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5869(539664854);
			synchronized (class330_sub25) {
				int i_8_ = class330_sub25.method3386(this);
				if (i_8_ < 0) {
					((Class330_Sub25) class330_sub25).anInt7695 = 0;
					method3688(class330_sub25);
				} else {
					((Class330_Sub25) class330_sub25).anInt7695 = i_8_;
					method3683(class330_sub25.aClass330_3340, class330_sub25);
				}
			}
		} while (i_6_ != 0);
	}

	public final synchronized void method3566(int i) {
		do {
			if (((Class330_Sub40_Sub4) this).anInt9788 < 0) {
				method3689(i);
				break;
			}
			if (((Class330_Sub40_Sub4) this).anInt9789 + i < ((Class330_Sub40_Sub4) this).anInt9788) {
				((Class330_Sub40_Sub4) this).anInt9789 += i;
				method3689(i);
				break;
			}
			int i_9_ = (((Class330_Sub40_Sub4) this).anInt9788 - ((Class330_Sub40_Sub4) this).anInt9789);
			method3689(i_9_);
			i -= i_9_;
			((Class330_Sub40_Sub4) this).anInt9789 += i_9_;
			method3686();
			Class330_Sub25 class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5869(539664854);
			synchronized (class330_sub25) {
				int i_10_ = class330_sub25.method3386(this);
				if (i_10_ < 0) {
					((Class330_Sub25) class330_sub25).anInt7695 = 0;
					method3688(class330_sub25);
				} else {
					((Class330_Sub25) class330_sub25).anInt7695 = i_10_;
					method3683(class330_sub25.aClass330_3340, class330_sub25);
				}
			}
		} while (i != 0);
	}

	public final synchronized void method3569(int i) {
		do {
			if (((Class330_Sub40_Sub4) this).anInt9788 < 0) {
				method3689(i);
				break;
			}
			if (((Class330_Sub40_Sub4) this).anInt9789 + i < ((Class330_Sub40_Sub4) this).anInt9788) {
				((Class330_Sub40_Sub4) this).anInt9789 += i;
				method3689(i);
				break;
			}
			int i_11_ = (((Class330_Sub40_Sub4) this).anInt9788 - ((Class330_Sub40_Sub4) this).anInt9789);
			method3689(i_11_);
			i -= i_11_;
			((Class330_Sub40_Sub4) this).anInt9789 += i_11_;
			method3686();
			Class330_Sub25 class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5869(539664854);
			synchronized (class330_sub25) {
				int i_12_ = class330_sub25.method3386(this);
				if (i_12_ < 0) {
					((Class330_Sub25) class330_sub25).anInt7695 = 0;
					method3688(class330_sub25);
				} else {
					((Class330_Sub25) class330_sub25).anInt7695 = i_12_;
					method3683(class330_sub25.aClass330_3340, class330_sub25);
				}
			}
		} while (i != 0);
	}

	public final synchronized void method3568(int i) {
		do {
			if (((Class330_Sub40_Sub4) this).anInt9788 < 0) {
				method3689(i);
				break;
			}
			if (((Class330_Sub40_Sub4) this).anInt9789 + i < ((Class330_Sub40_Sub4) this).anInt9788) {
				((Class330_Sub40_Sub4) this).anInt9789 += i;
				method3689(i);
				break;
			}
			int i_13_ = (((Class330_Sub40_Sub4) this).anInt9788 - ((Class330_Sub40_Sub4) this).anInt9789);
			method3689(i_13_);
			i -= i_13_;
			((Class330_Sub40_Sub4) this).anInt9789 += i_13_;
			method3686();
			Class330_Sub25 class330_sub25 = (Class330_Sub25) ((Class330_Sub40_Sub4) this).aClass471_9787.method5869(539664854);
			synchronized (class330_sub25) {
				int i_14_ = class330_sub25.method3386(this);
				if (i_14_ < 0) {
					((Class330_Sub25) class330_sub25).anInt7695 = 0;
					method3688(class330_sub25);
				} else {
					((Class330_Sub25) class330_sub25).anInt7695 = i_14_;
					method3683(class330_sub25.aClass330_3340, class330_sub25);
				}
			}
		} while (i != 0);
	}

	int method3561() {
		return 0;
	}

	public Class330_Sub40_Sub4() {
		((Class330_Sub40_Sub4) this).anInt9788 = -1;
	}

	int method3567() {
		return 0;
	}
}
