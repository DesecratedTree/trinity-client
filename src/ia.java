/* ia - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ia extends Class263 implements Interface28 {
	long nativeid;

	void method2603(char c, int i, int i_0_, int i_1_, boolean bool, Class_ta class_ta, int i_2_, int i_3_) {
		GA(c, i, i_0_, i_1_, bool, class_ta, i_2_, i_3_);
	}

	native void EA(ja var_ja, ba var_ba, byte[][] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_);

	protected void finalize() {
		if (((ia) this).nativeid != 0L)
			Class71.method827(this, 1920679800);
	}

	public native void ma(boolean bool);

	void method2609(char c, int i, int i_9_, int i_10_, boolean bool, Class_ta class_ta, int i_11_, int i_12_) {
		GA(c, i, i_9_, i_10_, bool, class_ta, i_11_, i_12_);
	}

	void method2602(char c, int i, int i_13_, int i_14_, boolean bool, Class_ta class_ta, int i_15_, int i_16_) {
		GA(c, i, i_13_, i_14_, bool, class_ta, i_15_, i_16_);
	}

	native void GA(char c, int i, int i_17_, int i_18_, boolean bool, Class_ta class_ta, int i_19_, int i_20_);

	native void c(char c, int i, int i_21_, int i_22_, boolean bool);

	void method2604(char c, int i, int i_23_, int i_24_, boolean bool, Class_ta class_ta, int i_25_, int i_26_) {
		GA(c, i, i_23_, i_24_, bool, class_ta, i_25_, i_26_);
	}

	native void UA(char c, int i, int i_27_, int i_28_, boolean bool);

	void method2610(char c, int i, int i_29_, int i_30_, boolean bool, Class_ta class_ta, int i_31_, int i_32_) {
		GA(c, i, i_29_, i_30_, bool, class_ta, i_31_, i_32_);
	}

	ia(ja var_ja, ba var_ba, Class524 class524, Class87_Sub2[] class87_sub2s, Class61[] class61s) {
		super(var_ja, class524);
		byte[][] is = new byte[class87_sub2s.length][];
		int[] is_33_ = new int[class87_sub2s.length];
		int[] is_34_ = new int[class87_sub2s.length];
		int[] is_35_ = new int[class87_sub2s.length];
		int[] is_36_ = new int[class87_sub2s.length];
		for (int i = 0; i < class87_sub2s.length; i++) {
			is[i] = class87_sub2s[i].aByteArray7114;
			is_33_[i] = class87_sub2s[i].anInt7112;
			is_34_[i] = class87_sub2s[i].anInt7107;
			is_35_[i] = class87_sub2s[i].anInt7109;
			is_36_[i] = class87_sub2s[i].anInt7111;
		}
		EA(var_ja, var_ba, is, class87_sub2s[0].anIntArray7113, is_33_, is_34_, is_35_, is_36_);
	}

	void method2640() {
		if (((ia) this).nativeid != 0L)
			Class71.method827(this, 36219741);
	}

	void method2641() {
		if (((ia) this).nativeid != 0L)
			Class71.method827(this, 417897736);
	}

	public native void x(boolean bool);

	native void n(ja var_ja, ba var_ba, byte[][] is, int[] is_37_, int[] is_38_, int[] is_39_, int[] is_40_, int[] is_41_);

	native void bo(char c, int i, int i_42_, int i_43_, boolean bool, Class_ta class_ta, int i_44_, int i_45_);
}
