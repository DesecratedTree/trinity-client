/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class40 {
	int anInt424;
	int anInt425;
	int anInt426;
	int anInt427;
	int anInt428;
	int anInt429 = 128;

	Class40(int i) {
		((Class40) this).anInt426 = 128;
		((Class40) this).anInt428 = i;
	}

	Class40(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class40) this).anInt426 = 128;
		((Class40) this).anInt428 = i;
		((Class40) this).anInt429 = i_0_;
		((Class40) this).anInt426 = i_1_;
		((Class40) this).anInt425 = i_2_;
		((Class40) this).anInt427 = i_3_;
		((Class40) this).anInt424 = i_4_;
	}

	void method547(Class40 class40_5_) {
		((Class40) this).anInt429 = ((Class40) class40_5_).anInt429;
		((Class40) this).anInt426 = ((Class40) class40_5_).anInt426;
		((Class40) this).anInt425 = ((Class40) class40_5_).anInt425;
		((Class40) this).anInt427 = ((Class40) class40_5_).anInt427;
		((Class40) this).anInt428 = ((Class40) class40_5_).anInt428;
		((Class40) this).anInt424 = ((Class40) class40_5_).anInt424;
	}

	Class40 method548() {
		return new Class40(((Class40) this).anInt428, ((Class40) this).anInt429, ((Class40) this).anInt426, ((Class40) this).anInt425, ((Class40) this).anInt427, ((Class40) this).anInt424);
	}
}
