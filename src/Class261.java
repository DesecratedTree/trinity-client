/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class261 {
	public float aFloat2717;
	public float aFloat2718;
	public float aFloat2719;
	public float aFloat2720;

	public final void method2583(float f) {
		aFloat2717 *= f;
		aFloat2718 *= f;
		aFloat2720 *= f;
		aFloat2719 *= f;
	}

	public Class261(float f, float f_0_, float f_1_, float f_2_) {
		method2588(f, f_0_, f_1_, f_2_);
	}

	public void method2584(Class261 class261_3_) {
		method2588(class261_3_.aFloat2717, class261_3_.aFloat2718, class261_3_.aFloat2720, class261_3_.aFloat2719);
	}

	public void method2585(int i) {
		method2588((float) (i >> 16 & 0xff) * 0.003921569F, (float) (i >> 8 & 0xff) * 0.003921569F, (float) (i >> 0 & 0xff) * 0.003921569F, (float) (i >> 24 & 0xff) * 0.003921569F);
	}

	final void method2586() {
		aFloat2719 = 0.0F;
		aFloat2720 = 0.0F;
		aFloat2718 = 0.0F;
		aFloat2717 = 0.0F;
	}

	public final void method2587() {
		aFloat2717 = -aFloat2717;
		aFloat2718 = -aFloat2718;
		aFloat2720 = -aFloat2720;
		aFloat2719 = -aFloat2719;
	}

	public void method2588(float f, float f_4_, float f_5_, float f_6_) {
		aFloat2717 = f;
		aFloat2718 = f_4_;
		aFloat2720 = f_5_;
		aFloat2719 = f_6_;
	}

	public final void method2589(Class249 class249) {
		float f = aFloat2717;
		float f_7_ = aFloat2718;
		float f_8_ = aFloat2720;
		float f_9_ = aFloat2719;
		aFloat2717 = (class249.aFloatArray2631[0] * f + class249.aFloatArray2631[4] * f_7_ + class249.aFloatArray2631[8] * f_8_ + class249.aFloatArray2631[12] * f_9_);
		aFloat2718 = (class249.aFloatArray2631[1] * f + class249.aFloatArray2631[5] * f_7_ + class249.aFloatArray2631[9] * f_8_ + class249.aFloatArray2631[13] * f_9_);
		aFloat2720 = (class249.aFloatArray2631[2] * f + class249.aFloatArray2631[6] * f_7_ + class249.aFloatArray2631[10] * f_8_ + class249.aFloatArray2631[14] * f_9_);
		aFloat2719 = (class249.aFloatArray2631[3] * f + class249.aFloatArray2631[7] * f_7_ + class249.aFloatArray2631[11] * f_8_ + class249.aFloatArray2631[15] * f_9_);
	}

	public Class261() {
		method2586();
	}
}
