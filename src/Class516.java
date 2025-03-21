/* Class516 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class516 {
	static int anInt5974;

	Class516() throws Throwable {
		throw new Error();
	}

	static final void method6206(Class_ra class_ra, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			class_ra.r(i, i_0_, i + i_1_, i_0_ + i_2_);
			class_ra.method4789(i, i_0_, i_1_, i_2_, -16777216, 463754225);
			if (-1755364031 * Class354_Sub1.anInt7977 >= 100) {
				float f = ((float) Class354_Sub1.anInt3513 / (float) Class354_Sub1.anInt3524);
				int i_4_ = i_1_;
				int i_5_ = i_2_;
				if (f < 1.0F)
					i_5_ = (int) ((float) i_1_ * f);
				else
					i_4_ = (int) ((float) i_2_ / f);
				i += (i_1_ - i_4_) / 2;
				i_0_ += (i_2_ - i_5_) / 2;
				if (null == Class201_Sub2.aClass61_8943 || Class201_Sub2.aClass61_8943.method681() != i_1_ || Class201_Sub2.aClass61_8943.method682() != i_2_) {
					Class354_Sub1.method4090(Class354_Sub1.anInt3510, (Class354_Sub1.anInt3513 + Class354_Sub1.anInt3516), (Class354_Sub1.anInt3524 + Class354_Sub1.anInt3510), Class354_Sub1.anInt3516, i, i_0_, i_4_ + i, i_0_ + i_5_);
					Class354_Sub1.method4091(class_ra);
					Class201_Sub2.aClass61_8943 = class_ra.bj(i, i_0_, i_4_, i_5_, false);
				}
				Class201_Sub2.aClass61_8943.method687(i, i_0_);
				int i_6_ = (Class379.anInt3953 * 1825978093 * i_4_ / Class354_Sub1.anInt3524);
				int i_7_ = (-1797735183 * Class525.anInt6037 * i_5_ / Class354_Sub1.anInt3513);
				int i_8_ = i + (Class557.anInt6399 * -1654345199 * i_4_ / Class354_Sub1.anInt3524);
				int i_9_ = i_0_ + i_5_ - (i_5_ * (1893372407 * Class475.anInt5701) / Class354_Sub1.anInt3513) - i_7_;
				int i_10_ = -1996554240;
				if (Class435.aClass435_4416 == client.aClass435_9146)
					i_10_ = -1996488705;
				class_ra.B(i_8_, i_9_, i_6_, i_7_, i_10_, 1);
				class_ra.bl(i_8_, i_9_, i_6_, i_7_, i_10_, 0);
				if (Class448.anInt5556 * -927753929 > 0) {
					int i_11_;
					if (-1484286815 * Class101.anInt6456 > 50)
						i_11_ = 500 - 1168500517 * Class101.anInt6456;
					else
						i_11_ = Class101.anInt6456 * 1168500517;
					for (Class330_Sub38 class330_sub38 = (Class330_Sub38) Class354_Sub1.aClass471_3509.method5869(539664854); class330_sub38 != null; class330_sub38 = (Class330_Sub38) Class354_Sub1.aClass471_3509.method5873((byte) 6)) {
						Class372 class372 = (Class354_Sub1.aClass380_3529.method4387(-558904089 * class330_sub38.anInt7755, (byte) -61));
						if (!Class411.method5232(class372, -115239456)) {
							if (i_3_ == -73386531) {
								/* empty */
							}
						} else if (-558904089 * class330_sub38.anInt7755 == -409726815 * Class354_Sub1.anInt7987) {
							int i_12_ = ((i_4_ * (class330_sub38.anInt7756 * -1917247207) / Class354_Sub1.anInt3524) + i);
							int i_13_ = ((i_5_ * (Class354_Sub1.anInt3513 - class330_sub38.anInt7753 * 779987703) / Class354_Sub1.anInt3513) + i_0_);
							class_ra.method4789(i_12_ - 2, i_13_ - 2, 4, 4, i_11_ << 24 | 0xffff00, 463754225);
						} else if (-1 != -173343463 * Class354_Sub1.anInt7980 && (-173343463 * Class354_Sub1.anInt7980 == -546800133 * class372.anInt3911)) {
							int i_14_ = ((i_4_ * (-1917247207 * class330_sub38.anInt7756) / Class354_Sub1.anInt3524) + i);
							int i_15_ = (((Class354_Sub1.anInt3513 - class330_sub38.anInt7753 * 779987703) * i_5_ / Class354_Sub1.anInt3513) + i_0_);
							class_ra.method4789(i_14_ - 2, i_15_ - 2, 4, 4, i_11_ << 24 | 0xffff00, 463754225);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vi.cn(").append(')').toString());
		}
	}
}
