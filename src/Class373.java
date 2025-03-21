/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class373 {
	Class373() throws Throwable {
		throw new Error();
	}

	public static void method4336(float f, Class260 class260, Class244 class244, Class260 class260_0_, Class260 class260_1_, Class260 class260_2_, Class260 class260_3_, float f_4_, float f_5_, int i) {
		try {
			if (!class260_0_.method2555(class260)) {
				Class260 class260_6_ = Class260.method2577(0.0F, 0.0F, 0.0F);
				Class260 class260_7_ = Class260.method2549(Class260.method2561(class260_0_, class260));
				class260_7_.method2570(class244);
				Class260 class260_8_ = Class260.method2561(class260_7_, class260_6_);
				float f_9_ = class260_8_.method2565();
				if (f_4_ > 0.0F) {
					class260_2_ = Class260.method2549(class260_2_);
					class260_2_.method2567(f_9_ / f_4_ * f_5_);
				}
				if (class260_2_.aFloat2716 == Float.POSITIVE_INFINITY || Float.isNaN(class260.aFloat2716) || f_9_ > 5120.0F) {
					class260.method2582(class260_0_);
					class260_1_.method2554();
				} else {
					class244.method2423();
					Class260 class260_10_ = Class260.method2577(1.0F, 0.0F, 0.0F);
					Class260 class260_11_ = Class260.method2577(0.0F, 1.0F, 0.0F);
					Class260 class260_12_ = Class260.method2577(0.0F, 0.0F, 1.0F);
					class260_10_.method2570(class244);
					class260_11_.method2570(class244);
					class260_12_.method2570(class244);
					Class260 class260_13_ = (Class260.method2577(Class260.method2562(class260_10_, class260_1_), Class260.method2562(class260_11_, class260_1_), Class260.method2562(class260_12_, class260_1_)));
					Class260 class260_14_ = Class260.method2549(class260_13_);
					class260_14_.method2551();
					Class260 class260_15_ = (Class260.method2568(Class260.method2566(class260_14_, class260_14_), Class260.method2574(class260_2_, 2.0F)));
					Class260 class260_16_ = Class260.method2549(class260_8_);
					class260_16_.method2551();
					Class260 class260_17_ = Class260.method2549(class260_13_);
					if (class260_15_.aFloat2716 > class260_16_.aFloat2716) {
						if (class260_8_.aFloat2716 < 0.0F) {
							class260_17_.aFloat2716 += f * class260_2_.aFloat2716;
							if (class260_17_.aFloat2716 > 0.0F)
								class260_17_.aFloat2716 = 0.0F;
						} else {
							class260_17_.aFloat2716 -= class260_2_.aFloat2716 * f;
							if (class260_17_.aFloat2716 < 0.0F)
								class260_17_.aFloat2716 = 0.0F;
						}
					} else if (class260_14_.aFloat2716 < class260_3_.aFloat2716) {
						if (class260_8_.aFloat2716 < 0.0F) {
							class260_17_.aFloat2716 -= class260_2_.aFloat2716 * f;
							if (class260_17_.aFloat2716 < -class260_3_.aFloat2716)
								class260_17_.aFloat2716 = -class260_3_.aFloat2716;
						} else {
							class260_17_.aFloat2716 += class260_2_.aFloat2716 * f;
							if (class260_17_.aFloat2716 > class260_3_.aFloat2716)
								class260_17_.aFloat2716 = class260_3_.aFloat2716;
						}
					}
					if (class260_15_.aFloat2715 > class260_16_.aFloat2715) {
						if (class260_8_.aFloat2715 < 0.0F) {
							class260_17_.aFloat2715 += f * class260_2_.aFloat2715;
							if (class260_17_.aFloat2715 > 0.0F)
								class260_17_.aFloat2715 = 0.0F;
						} else {
							class260_17_.aFloat2715 -= f * class260_2_.aFloat2715;
							if (class260_17_.aFloat2715 < 0.0F)
								class260_17_.aFloat2715 = 0.0F;
						}
					} else if (class260_14_.aFloat2715 < class260_3_.aFloat2715) {
						if (class260_8_.aFloat2715 < 0.0F) {
							class260_17_.aFloat2715 -= class260_2_.aFloat2715 * f;
							if (class260_17_.aFloat2715 < -class260_3_.aFloat2715)
								class260_17_.aFloat2715 = -class260_3_.aFloat2715;
						} else {
							class260_17_.aFloat2715 += class260_2_.aFloat2715 * f;
							if (class260_17_.aFloat2715 > class260_3_.aFloat2715)
								class260_17_.aFloat2715 = class260_3_.aFloat2715;
						}
					}
					if (class260_15_.aFloat2711 > class260_16_.aFloat2711) {
						if (class260_8_.aFloat2711 < 0.0F) {
							class260_17_.aFloat2711 += f * class260_2_.aFloat2711;
							if (class260_17_.aFloat2711 > 0.0F)
								class260_17_.aFloat2711 = 0.0F;
						} else {
							class260_17_.aFloat2711 -= f * class260_2_.aFloat2711;
							if (class260_17_.aFloat2711 < 0.0F)
								class260_17_.aFloat2711 = 0.0F;
						}
					} else if (class260_14_.aFloat2711 < class260_3_.aFloat2711) {
						if (class260_8_.aFloat2711 < 0.0F) {
							class260_17_.aFloat2711 -= f * class260_2_.aFloat2711;
							if (class260_17_.aFloat2711 < -class260_3_.aFloat2711)
								class260_17_.aFloat2711 = -class260_3_.aFloat2711;
						} else {
							class260_17_.aFloat2711 += f * class260_2_.aFloat2711;
							if (class260_17_.aFloat2711 > class260_3_.aFloat2711)
								class260_17_.aFloat2711 = class260_3_.aFloat2711;
						}
					}
					Class260 class260_18_ = Class260.method2574(class260_10_, class260_17_.aFloat2716);
					class260_18_.method2571(class260_11_, class260_17_.aFloat2715);
					class260_18_.method2571(class260_12_, class260_17_.aFloat2711);
					class260_1_.method2572(class260_18_, 0.8F);
					if (f_9_ < 10.0F) {
						class260.method2582(class260_0_);
						class260_1_.method2554();
					} else
						class260.method2558(Class260.method2574(class260_1_, f));
					class260_14_.method2550();
					class260_17_.method2550();
					class260_16_.method2550();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pn.r(").append(')').toString());
		}
	}

	static final void method4337(Class430 class430, short i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aBoolean8958 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pn.va(").append(')').toString());
		}
	}

	public static void method4338(int i) {
		try {
			if (Class433.method5559(1659542781))
				Class396.method4654(new Class392(), 1602058384);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pn.r(").append(')').toString());
		}
	}

	static void method4339(int i, byte i_19_) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub29_7903.method5839((short) 255) == 0)
				i = -1;
			if (i != 1808109035 * client.anInt9201) {
				if (i != -1) {
					Class529 class529 = Class363.aClass527_3806.method6264(i, -1717317299);
					Class87 class87 = class529.method6275(-2096599180);
					if (class87 != null) {
						Gfx.aClass323_577.method3179(Class475.aCanvas5700, class87.method1031(true), class87.method993(), class87.method1045(), new Point(class529.anInt6219 * -1951466431, class529.anInt6221 * 2113436463));
						client.anInt9201 = i * 472330947;
					} else
						i = -1;
				}
				if (-1 == i && -1 != client.anInt9201 * 1808109035) {
					Gfx.aClass323_577.method3179(Class475.aCanvas5700, null, -1, -1, new Point());
					client.anInt9201 = -472330947;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pn.gw(").append(')').toString());
		}
	}
}
