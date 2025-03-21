/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class348 {
	int anInt3435;
	int anInt3436;
	int anInt3437;
	int anInt3438;
	int anInt3439;
	int anInt3440;
	int anInt3441;
	int anInt3442;
	int anInt3443;
	int anInt3444;

	public boolean method4019(int i, int i_0_, int i_1_) {
		if (i < ((Class348) this).anInt3439 || i > ((Class348) this).anInt3441)
			return false;
		if (i_0_ < ((Class348) this).anInt3435 || i_0_ > ((Class348) this).anInt3443)
			return false;
		if (i_1_ < ((Class348) this).anInt3440 || i_1_ > ((Class348) this).anInt3444)
			return false;
		int i_2_ = i - ((Class348) this).anInt3442;
		int i_3_ = i_1_ - ((Class348) this).anInt3437;
		return i_2_ * i_2_ + i_3_ * i_3_ < ((Class348) this).anInt3438;
	}

	Class348(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class348) this).anInt3442 = i;
		((Class348) this).anInt3436 = i_4_;
		((Class348) this).anInt3437 = i_5_;
		((Class348) this).anInt3438 = i_6_ * i_6_;
		((Class348) this).anInt3439 = ((Class348) this).anInt3442 + i_7_;
		((Class348) this).anInt3441 = ((Class348) this).anInt3442 + i_8_;
		((Class348) this).anInt3435 = ((Class348) this).anInt3436 + i_9_;
		((Class348) this).anInt3443 = ((Class348) this).anInt3436 + i_10_;
		((Class348) this).anInt3440 = ((Class348) this).anInt3437 + i_11_;
		((Class348) this).anInt3444 = ((Class348) this).anInt3437 + i_12_;
	}

	void method4020(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		((Class348) this).anInt3442 = i;
		((Class348) this).anInt3436 = i_13_;
		((Class348) this).anInt3437 = i_14_;
		((Class348) this).anInt3438 = i_15_ * i_15_;
		((Class348) this).anInt3439 = ((Class348) this).anInt3442 + i_16_;
		((Class348) this).anInt3441 = ((Class348) this).anInt3442 + i_17_;
		((Class348) this).anInt3435 = ((Class348) this).anInt3436 + i_18_;
		((Class348) this).anInt3443 = ((Class348) this).anInt3436 + i_19_;
		((Class348) this).anInt3440 = ((Class348) this).anInt3437 + i_20_;
		((Class348) this).anInt3444 = ((Class348) this).anInt3437 + i_21_;
	}
}
