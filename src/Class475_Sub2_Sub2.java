/* Class475_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class475_Sub2_Sub2 extends Class475_Sub2 {
	float method5951(float f, float f_0_, float f_1_, int i) {
		try {
			float f_2_ = f - ((Class475_Sub2_Sub2) this).aFloat8740;
			if ((((Class475_Sub2_Sub2) this).aClass145_5699.method1698(-68365896).aFloat2716) == Float.POSITIVE_INFINITY)
				f_0_ = ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -28375).method2565();
			else {
				float f_3_ = f_0_ / ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(-200773804).method2565();
				float f_4_ = f_3_ * (f_0_ / 2.0F);
				if (f_4_ > f_2_) {
					f_0_ -= ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(1122991996).method2565() * f_1_;
					if (f_0_ < 0.0F)
						f_0_ = 0.0F;
				} else if (f_0_ < ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -20499).method2565()) {
					f_0_ += ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(616250687).method2565() * f_1_;
					if (f_0_ > ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -24601).method2565())
						f_0_ = ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -23321).method2565();
				}
			}
			return f_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("akx.g(").append(')').toString());
		}
	}

	float method5949(float f, float f_5_, float f_6_) {
		float f_7_ = f - ((Class475_Sub2_Sub2) this).aFloat8740;
		if ((((Class475_Sub2_Sub2) this).aClass145_5699.method1698(-890204815).aFloat2716) == Float.POSITIVE_INFINITY)
			f_5_ = ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -2374).method2565();
		else {
			float f_8_ = f_5_ / ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(-1504107871).method2565();
			float f_9_ = f_8_ * (f_5_ / 2.0F);
			if (f_9_ > f_7_) {
				f_5_ -= ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(531214975).method2565() * f_6_;
				if (f_5_ < 0.0F)
					f_5_ = 0.0F;
			} else if (f_5_ < ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -3709).method2565()) {
				f_5_ += ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(1129315061).method2565() * f_6_;
				if (f_5_ > ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -5995).method2565())
					f_5_ = ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -8721).method2565();
			}
		}
		return f_5_;
	}

	public Class475_Sub2_Sub2(Class145 class145) {
		super(class145);
	}

	float method5950(float f, float f_10_, float f_11_) {
		float f_12_ = f - ((Class475_Sub2_Sub2) this).aFloat8740;
		if ((((Class475_Sub2_Sub2) this).aClass145_5699.method1698(-1151577075).aFloat2716) == Float.POSITIVE_INFINITY)
			f_10_ = ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -19825).method2565();
		else {
			float f_13_ = f_10_ / ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(-216747559).method2565();
			float f_14_ = f_13_ * (f_10_ / 2.0F);
			if (f_14_ > f_12_) {
				f_10_ -= ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(-1416290716).method2565() * f_11_;
				if (f_10_ < 0.0F)
					f_10_ = 0.0F;
			} else if (f_10_ < ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -29930).method2565()) {
				f_10_ += ((Class475_Sub2_Sub2) this).aClass145_5699.method1698(804978479).method2565() * f_11_;
				if (f_10_ > ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -24758).method2565())
					f_10_ = ((Class475_Sub2_Sub2) this).aClass145_5699.method1701((short) -25183).method2565();
			}
		}
		return f_10_;
	}
}
