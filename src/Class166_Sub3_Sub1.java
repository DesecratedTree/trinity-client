/* Class166_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class166_Sub3_Sub1 extends Class166_Sub3 {
	public Class166_Sub3_Sub1(Class145 class145) {
		super(class145);
	}

	float method2014(float f, float f_0_, float f_1_, int i) {
		try {
			float f_2_ = f - ((Class166_Sub3_Sub1) this).aFloat7335;
			if ((((Class166_Sub3_Sub1) this).aClass145_1699.method1699(74607982).aFloat2716) == Float.POSITIVE_INFINITY)
				f_0_ = ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(-1014367402).method2565();
			else {
				float f_3_ = f_0_ / ((Class166_Sub3_Sub1) this).aClass145_1699.method1699(1960728991).method2565();
				float f_4_ = f_0_ / 2.0F * f_3_;
				if (f_4_ > f_2_) {
					f_0_ -= ((Class166_Sub3_Sub1) this).aClass145_1699.method1699(-729212258).method2565() * f_1_;
					if (f_0_ < 0.0F)
						f_0_ = 0.0F;
				} else if (f_0_ < ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(-168579731).method2565()) {
					f_0_ += ((Class166_Sub3_Sub1) this).aClass145_1699.method1699(484456408).method2565() * f_1_;
					if (f_0_ > ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(-217103587).method2565())
						f_0_ = ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(-182630427).method2565();
				}
			}
			return f_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahc.y(").append(')').toString());
		}
	}

	float method2013(float f, float f_5_, float f_6_) {
		float f_7_ = f - ((Class166_Sub3_Sub1) this).aFloat7335;
		if ((((Class166_Sub3_Sub1) this).aClass145_1699.method1699(-1083416753).aFloat2716) == Float.POSITIVE_INFINITY)
			f_5_ = ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(-622694018).method2565();
		else {
			float f_8_ = f_5_ / ((Class166_Sub3_Sub1) this).aClass145_1699.method1699(856727831).method2565();
			float f_9_ = f_5_ / 2.0F * f_8_;
			if (f_9_ > f_7_) {
				f_5_ -= ((Class166_Sub3_Sub1) this).aClass145_1699.method1699(289227826).method2565() * f_6_;
				if (f_5_ < 0.0F)
					f_5_ = 0.0F;
			} else if (f_5_ < ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(97374367).method2565()) {
				f_5_ += ((Class166_Sub3_Sub1) this).aClass145_1699.method1699(193536057).method2565() * f_6_;
				if (f_5_ > ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(1409735172).method2565())
					f_5_ = ((Class166_Sub3_Sub1) this).aClass145_1699.method1708(2125405307).method2565();
			}
		}
		return f_5_;
	}

	static final void method2016(Class430 class430, byte i) {
		try {
			int i_10_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class354.method4083(i_10_);
			if (class330_sub36_sub12 == null) {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			} else {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (68376715 * class330_sub36_sub12.anInt9706 - 1726790277 * class330_sub36_sub12.anInt9709);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = (class330_sub36_sub12.anInt9712 * -2011054591 - -841906451 * class330_sub36_sub12.anInt9704);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ahc.aen(").append(')').toString());
		}
	}
}
