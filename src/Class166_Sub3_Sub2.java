/* Class166_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class166_Sub3_Sub2 extends Class166_Sub3 {
	float aFloat9481;
	float aFloat9482;
	public static Class263 aClass263_9483;

	float method2013(float f, float f_0_, float f_1_) {
		float f_2_ = ((Class166_Sub3_Sub2) this).aFloat7335 / f;
		if (f_2_ < 0.0F)
			f_2_ = 0.0F;
		if (f_2_ > 1.0F)
			f_2_ = 1.0F;
		return (((Class166_Sub3_Sub2) this).aFloat9482 + (((Class166_Sub3_Sub2) this).aFloat9481 - ((Class166_Sub3_Sub2) this).aFloat9482) * f_2_);
	}

	public Class166_Sub3_Sub2(Class145 class145) {
		super(class145);
	}

	float method2014(float f, float f_3_, float f_4_, int i) {
		try {
			float f_5_ = ((Class166_Sub3_Sub2) this).aFloat7335 / f;
			if (f_5_ < 0.0F)
				f_5_ = 0.0F;
			if (f_5_ > 1.0F)
				f_5_ = 1.0F;
			return (((Class166_Sub3_Sub2) this).aFloat9482 + (((Class166_Sub3_Sub2) this).aFloat9481 - ((Class166_Sub3_Sub2) this).aFloat9482) * f_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aht.y(").append(')').toString());
		}
	}
}
