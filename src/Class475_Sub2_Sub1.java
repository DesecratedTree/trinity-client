/* Class475_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub2_Sub1 extends Class475_Sub2 {
	float aFloat9938;
	float aFloat9939;

	float method5949(float f, float f_0_, float f_1_) {
		float f_2_ = ((Class475_Sub2_Sub1) this).aFloat8740 / f;
		if (f_2_ < 0.0F)
			f_2_ = 0.0F;
		if (f_2_ > 1.0F)
			f_2_ = 1.0F;
		return (((Class475_Sub2_Sub1) this).aFloat9938 + (((Class475_Sub2_Sub1) this).aFloat9939 - ((Class475_Sub2_Sub1) this).aFloat9938) * f_2_);
	}

	float method5951(float f, float f_3_, float f_4_, int i) {
		try {
			float f_5_ = ((Class475_Sub2_Sub1) this).aFloat8740 / f;
			if (f_5_ < 0.0F)
				f_5_ = 0.0F;
			if (f_5_ > 1.0F)
				f_5_ = 1.0F;
			return (((Class475_Sub2_Sub1) this).aFloat9938 + (((Class475_Sub2_Sub1) this).aFloat9939 - ((Class475_Sub2_Sub1) this).aFloat9938) * f_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akc.g(").append(')').toString());
		}
	}

	float method5950(float f, float f_6_, float f_7_) {
		float f_8_ = ((Class475_Sub2_Sub1) this).aFloat8740 / f;
		if (f_8_ < 0.0F)
			f_8_ = 0.0F;
		if (f_8_ > 1.0F)
			f_8_ = 1.0F;
		return (((Class475_Sub2_Sub1) this).aFloat9938 + (((Class475_Sub2_Sub1) this).aFloat9939 - ((Class475_Sub2_Sub1) this).aFloat9938) * f_8_);
	}

	public Class475_Sub2_Sub1(Class145 class145) {
		super(class145);
	}
}
