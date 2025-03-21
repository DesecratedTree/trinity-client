/* m - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class m extends Class263 implements Interface28 {
	long nativeid;

	void method2603(char c, int i, int i_0_, int i_1_, boolean bool, Class_ta class_ta, int i_2_, int i_3_) {
		MA(c, i, i_0_, i_1_, bool, class_ta, i_2_, i_3_);
	}

	native void UA(char c, int i, int i_4_, int i_5_, boolean bool);

	protected void finalize() {
		if (((m) this).nativeid != 0L)
			Class71.method827(this, -441162485);
	}

	public native void ma(boolean bool);

	native void bf(ja var_ja, ba var_ba, byte[][] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_);

	void method2602(char c, int i, int i_10_, int i_11_, boolean bool, Class_ta class_ta, int i_12_, int i_13_) {
		MA(c, i, i_10_, i_11_, bool, class_ta, i_12_, i_13_);
	}

	native void MA(char c, int i, int i_14_, int i_15_, boolean bool, Class_ta class_ta, int i_16_, int i_17_);

	native void c(char c, int i, int i_18_, int i_19_, boolean bool);

	m(ja var_ja, ba var_ba, Class524 class524, Class87_Sub2[] class87_sub2s, Class61[] class61s) {
		super(var_ja, class524);
		byte[][] is = new byte[class87_sub2s.length][];
		int[] is_20_ = new int[class87_sub2s.length];
		int[] is_21_ = new int[class87_sub2s.length];
		int[] is_22_ = new int[class87_sub2s.length];
		int[] is_23_ = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			is[i] = class87_sub2s[i].aByteArray7114;
			is_20_[i] = class87_sub2s[i].anInt7112;
			is_21_[i] = class87_sub2s[i].anInt7107;
			is_22_[i] = class87_sub2s[i].anInt7109;
			is_23_[i] = class87_sub2s[i].anInt7111;
		}
		n(var_ja, var_ba, is, is_20_, is_21_, is_22_, is_23_);
	}

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_);

	void method2604(char c, int i, int i_28_, int i_29_, boolean bool, Class_ta class_ta, int i_30_, int i_31_) {
		MA(c, i, i_28_, i_29_, bool, class_ta, i_30_, i_31_);
	}

	void method2610(char c, int i, int i_32_, int i_33_, boolean bool, Class_ta class_ta, int i_34_, int i_35_) {
		MA(c, i, i_32_, i_33_, bool, class_ta, i_34_, i_35_);
	}

	void method2642() {
		if (((m) this).nativeid != 0L)
			Class71.method827(this, -198828746);
	}

	void method2643() {
		if (((m) this).nativeid != 0L)
			Class71.method827(this, -238779095);
	}

	public native void x(boolean bool);

	native void bo(ja var_ja, ba var_ba, byte[][] is, int[] is_36_, int[] is_37_, int[] is_38_, int[] is_39_);

	native void bt(ja var_ja, ba var_ba, byte[][] is, int[] is_40_, int[] is_41_, int[] is_42_, int[] is_43_);

	native void bc(ja var_ja, ba var_ba, byte[][] is, int[] is_44_, int[] is_45_, int[] is_46_, int[] is_47_);

	void method2609(char c, int i, int i_48_, int i_49_, boolean bool, Class_ta class_ta, int i_50_, int i_51_) {
		MA(c, i, i_48_, i_49_, bool, class_ta, i_50_, i_51_);
	}

	native void bl(ja var_ja, ba var_ba, byte[][] is, int[] is_52_, int[] is_53_, int[] is_54_, int[] is_55_);

	native void bk(char c, int i, int i_56_, int i_57_, boolean bool, Class_ta class_ta, int i_58_, int i_59_);

	native void br(char c, int i, int i_60_, int i_61_, boolean bool, Class_ta class_ta, int i_62_, int i_63_);
}
