/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class259 {
	public static void method2547(Class260 class260, Class260 class260_0_, Class260 class260_1_, float f, Class260[] class260s) {
		Class260 class260_2_ = Class260.method2561(class260, class260_1_);
		float f_3_ = Class260.method2562(class260_2_, class260_2_) - f * f;
		float f_4_ = Class260.method2562(class260_0_, class260_2_);
		float f_5_ = f_4_ * f_4_ - f_3_;
		if (f_5_ < 0.0F) {
			Class260[] class260s_6_ = class260s;
			class260s[1] = null;
			class260s_6_[0] = null;
		} else if (f_5_ >= 9.765625E-4F) {
			float f_7_ = (float) Math.sqrt((double) f_5_);
			class260s[0] = Class260.method2548();
			class260s[0].method2582(class260);
			class260s[0].method2558(Class260.method2574(Class260.method2549(class260_0_), -f_4_ - f_7_));
			class260s[1] = Class260.method2548();
			class260s[1].method2582(class260);
			class260s[1].method2558(Class260.method2574(Class260.method2549(class260_0_), -f_4_ + f_7_));
		} else {
			class260s[0] = Class260.method2548();
			class260s[0].method2582(class260);
			class260s[0].method2558(Class260.method2574(Class260.method2549(class260_0_), -f_4_));
			class260s[1] = null;
		}
	}

	Class259() throws Throwable {
		throw new Error();
	}
}
