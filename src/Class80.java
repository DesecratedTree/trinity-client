/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80 {
	public int anInt668;
	public int anInt669;
	public int anInt670;
	public boolean aBoolean671 = false;
	public int anInt672;
	public int anInt673;

	public boolean method944(int i, int i_0_) {
		if (!aBoolean671)
			return false;
		int i_1_ = anInt668 - anInt669;
		int i_2_ = anInt672 - anInt670;
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = i * i_1_ + i_0_ * i_2_ - (anInt669 * i_1_ + anInt670 * i_2_);
		if (i_4_ <= 0) {
			int i_5_ = anInt669 - i;
			int i_6_ = anInt670 - i_0_;
			return i_5_ * i_5_ + i_6_ * i_6_ < anInt673 * anInt673;
		}
		if (i_4_ > i_3_) {
			int i_7_ = anInt668 - i;
			int i_8_ = anInt672 - i_0_;
			return i_7_ * i_7_ + i_8_ * i_8_ < anInt673 * anInt673;
		}
		i_4_ = (i_4_ << 10) / i_3_;
		int i_9_ = anInt669 + (i_1_ * i_4_ >> 10) - i;
		int i_10_ = anInt670 + (i_2_ * i_4_ >> 10) - i_0_;
		return i_9_ * i_9_ + i_10_ * i_10_ < anInt673 * anInt673;
	}
}
