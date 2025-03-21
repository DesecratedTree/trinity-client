/* ea - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ea extends Class263 implements Interface28 {
	long nativeid;

	void method2604(char c, int i, int i_0_, int i_1_, boolean bool, Class_ta class_ta, int i_2_, int i_3_) {
		P(c, i, i_0_, i_1_, bool, class_ta, i_2_, i_3_);
	}

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_);

	protected void finalize() {
		if (((ea) this).nativeid != 0L)
			Class71.method827(this, 582868949);
	}

	native void P(char c, int i, int i_8_, int i_9_, boolean bool, Class_ta class_ta, int i_10_, int i_11_);

	native void bt(char c, int i, int i_12_, int i_13_, boolean bool, Class_ta class_ta, int i_14_, int i_15_);

	ea(ja var_ja, ba var_ba, Class524 class524, Class87_Sub2[] class87_sub2s, Class61[] class61s) {
		super(var_ja, class524);
		byte[][] is = new byte[class87_sub2s.length][];
		int[] is_16_ = new int[class87_sub2s.length];
		int[] is_17_ = new int[class87_sub2s.length];
		int[] is_18_ = new int[class87_sub2s.length];
		int[] is_19_ = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			Class87_Sub2 class87_sub2 = class87_sub2s[i];
			if (class87_sub2.aByteArray7115 != null)
				is[i] = class87_sub2.aByteArray7115;
			else {
				byte[] is_20_ = class87_sub2.aByteArray7114;
				byte[] is_21_ = is[i] = new byte[is_20_.length];
				for (int i_22_ = 0; i_22_ < is_20_.length; i_22_++)
					is_21_[i_22_] = (byte) (is_20_[i_22_] == 0 ? 0 : -1);
			}
			is_16_[i] = class87_sub2.anInt7112;
			is_17_[i] = class87_sub2.anInt7107;
			is_18_[i] = class87_sub2.anInt7109;
			is_19_[i] = class87_sub2.anInt7111;
		}
		n(var_ja, var_ba, is, is_16_, is_17_, is_18_, is_19_);
	}

	native void UA(char c, int i, int i_23_, int i_24_, boolean bool);

	native void c(char c, int i, int i_25_, int i_26_, boolean bool);

	void method2609(char c, int i, int i_27_, int i_28_, boolean bool, Class_ta class_ta, int i_29_, int i_30_) {
		P(c, i, i_27_, i_28_, bool, class_ta, i_29_, i_30_);
	}

	public native void ma(boolean bool);

	native void bc(char c, int i, int i_31_, int i_32_, boolean bool, Class_ta class_ta, int i_33_, int i_34_);

	void method2610(char c, int i, int i_35_, int i_36_, boolean bool, Class_ta class_ta, int i_37_, int i_38_) {
		P(c, i, i_35_, i_36_, bool, class_ta, i_37_, i_38_);
	}

	void method2638() {
		if (((ea) this).nativeid != 0L)
			Class71.method827(this, -263526615);
	}

	void method2639() {
		if (((ea) this).nativeid != 0L)
			Class71.method827(this, 684387192);
	}

	public native void x(boolean bool);

	native void bo(ja var_ja, ba var_ba, byte[][] is, int[] is_39_, int[] is_40_, int[] is_41_, int[] is_42_);

	void method2602(char c, int i, int i_43_, int i_44_, boolean bool, Class_ta class_ta, int i_45_, int i_46_) {
		P(c, i, i_43_, i_44_, bool, class_ta, i_45_, i_46_);
	}

	void method2603(char c, int i, int i_47_, int i_48_, boolean bool, Class_ta class_ta, int i_49_, int i_50_) {
		P(c, i, i_47_, i_48_, bool, class_ta, i_49_, i_50_);
	}
}
