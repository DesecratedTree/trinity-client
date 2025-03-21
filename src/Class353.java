/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class353 {
	boolean aBoolean3487;
	static Stack aStack3488 = new Stack();
	public Class432_Sub1 aClass432_Sub1_3489;
	Class338 aClass338_3490;

	Class353() {
		/* empty */
	}

	public boolean method4073(Class_ra class_ra, int i, int i_0_, int i_1_) {
		try {
			int i_2_ = aClass432_Sub1_3489.method5359(-1687176248);
			if (aClass432_Sub1_3489.aClass80Array8656 != null) {
				for (int i_3_ = 0; i_3_ < aClass432_Sub1_3489.aClass80Array8656.length; i_3_++) {
					aClass432_Sub1_3489.aClass80Array8656[i_3_].anInt673 <<= i_2_;
					if ((aClass432_Sub1_3489.aClass80Array8656[i_3_].method944((((Class338) ((Class353) this).aClass338_3490).anInt3371) * -1411102857 + i, i_0_ + (((Class338) ((Class353) this).aClass338_3490).anInt3372) * -2103256635)) && aClass432_Sub1_3489.method5358(class_ra, i, i_0_, -13178752)) {
						aClass432_Sub1_3489.aClass80Array8656[i_3_].anInt673 >>= i_2_;
						return true;
					}
					aClass432_Sub1_3489.aClass80Array8656[i_3_].anInt673 >>= i_2_;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.p(").append(')').toString());
		}
	}

	static final void method4074(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			if ((((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]) < (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]))
				((Class430) class430).anInt4397 += ((((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]) * 1996761881);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.ay(").append(')').toString());
		}
	}

	static final void method4075(Class430 class430, int i) {
		try {
			Class434.method5566((byte) 50);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.agb(").append(')').toString());
		}
	}

	static boolean method4076(byte i) {
		try {
			return Class50.aBoolean479;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.i(").append(')').toString());
		}
	}

	static final void method4077(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, -1343473746);
			Class120 class120 = Class3.aClass120Array56[i_4_ >> 16];
			Class1.method386(iComponentDefinitions, class120, class430, 2032797425);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.eq(").append(')').toString());
		}
	}

	public static final void method4078(byte i) {
		try {
			if (-1 != client.anInt9013 * 2137973521 && -1 != 1203072951 * client.anInt9183) {
				int i_5_ = ((((client.anInt9089 * -1531254091 - client.anInt9088 * 2046080809) * (client.anInt9087 * -1034575959)) >> 16) + client.anInt9088 * 2046080809);
				client.anInt9087 += i_5_ * 1669559449;
				if (-1034575959 * client.anInt9087 >= 65535) {
					client.anInt9087 = 286624615;
					if (!client.aBoolean9091)
						client.aBoolean9090 = true;
					else
						client.aBoolean9090 = false;
					client.aBoolean9091 = true;
				} else {
					client.aBoolean9090 = false;
					client.aBoolean9091 = false;
				}
				float f = (float) (-1034575959 * client.anInt9087) / 65535.0F;
				float[] fs = new float[3];
				int i_6_ = 601753242 * client.anInt9085;
				for (int i_7_ = 0; i_7_ < 3; i_7_++) {
					int i_8_ = 3 * (client.anIntArrayArrayArray9082[2137973521 * client.anInt9013][i_6_][i_7_]);
					int i_9_ = ((client.anIntArrayArrayArray9082[2137973521 * client.anInt9013][1 + i_6_][i_7_]) * 3);
					int i_10_ = 3 * ((client.anIntArrayArrayArray9082[2137973521 * client.anInt9013][i_6_ + 2][i_7_]) - ((client.anIntArrayArrayArray9082[client.anInt9013 * 2137973521][i_6_ + 3][i_7_]) - (client.anIntArrayArrayArray9082[2137973521 * client.anInt9013][i_6_ + 2][i_7_])));
					int i_11_ = (client.anIntArrayArrayArray9082[2137973521 * client.anInt9013][i_6_][i_7_]);
					int i_12_ = i_9_ - i_8_;
					int i_13_ = i_10_ + (i_8_ - i_9_ * 2);
					int i_14_ = ((client.anIntArrayArrayArray9082[2137973521 * client.anInt9013][2 + i_6_][i_7_]) - i_11_ + i_9_ - i_10_);
					fs[i_7_] = (float) i_11_ + ((float) i_12_ + f * (f * (float) i_14_ + (float) i_13_)) * f;
				}
				Class381 class381 = client.aClass304_9030.method3022(-522787707);
				Class471.anInt5612 = (((int) fs[0] - class381.gameSceneBaseX * -1401159168) * -106940035);
				Gfx.anInt578 = (int) fs[1] * 568170765;
				Class325_Sub3.anInt7484 = 1872779603 * ((int) fs[2] - 470868480 * class381.gameSceneBaseY);
				float[] fs_15_ = new float[3];
				int i_16_ = 1607631754 * client.anInt9086;
				for (int i_17_ = 0; i_17_ < 3; i_17_++) {
					int i_18_ = 3 * (client.anIntArrayArrayArray9082[1203072951 * client.anInt9183][i_16_][i_17_]);
					int i_19_ = ((client.anIntArrayArrayArray9082[1203072951 * client.anInt9183][i_16_ + 1][i_17_]) * 3);
					int i_20_ = (((client.anIntArrayArrayArray9082[1203072951 * client.anInt9183][2 + i_16_][i_17_]) - ((client.anIntArrayArrayArray9082[1203072951 * client.anInt9183][i_16_ + 3][i_17_]) - (client.anIntArrayArrayArray9082[client.anInt9183 * 1203072951][i_16_ + 2][i_17_]))) * 3);
					int i_21_ = (client.anIntArrayArrayArray9082[1203072951 * client.anInt9183][i_16_][i_17_]);
					int i_22_ = i_19_ - i_18_;
					int i_23_ = i_20_ + (i_18_ - 2 * i_19_);
					int i_24_ = i_19_ + ((client.anIntArrayArrayArray9082[1203072951 * client.anInt9183][2 + i_16_][i_17_]) - i_21_) - i_20_;
					fs_15_[i_17_] = f * (f * ((float) i_23_ + (float) i_24_ * f) + (float) i_22_) + (float) i_21_;
				}
				float f_25_ = fs_15_[0] - fs[0];
				float f_26_ = (fs_15_[1] - fs[1]) * -1.0F;
				float f_27_ = fs_15_[2] - fs[2];
				double d = Math.sqrt((double) (f_25_ * f_25_ + f_27_ * f_27_));
				Class321.anInt7018 = ((int) (Math.atan2((double) f_26_, d) * 2607.5945876176133) & 0x3fff) * -1105882715;
				Class145_Sub1.anInt7266 = ((int) (-Math.atan2((double) f_25_, (double) f_27_) * 2607.5945876176133) & 0x3fff) * -1543696161;
				Class119.anInt1399 = ((((-1034575959 * client.anInt9087 * ((client.anIntArrayArrayArray9082[client.anInt9013 * 2137973521][i_6_ + 2][3]) - (client.anIntArrayArrayArray9082[client.anInt9013 * 2137973521][i_6_][3]))) >> 16) + (client.anIntArrayArrayArray9082[client.anInt9013 * 2137973521][i_6_][3])) * 562299743);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.hv(").append(')').toString());
		}
	}

	static final void method4079(long l) {
		try {
			if (client.aClass304_9030.method3023(-400722441) != null) {
				if (4 == -1551406343 * Class147.anInt1621 || 6 == Class147.anInt1621 * -1551406343)
					Class132.method1568(l);
				else if (-1551406343 * Class147.anInt1621 == 5)
					Class330_Sub40_Sub1.method3571(l);
			}
			Class263.method2619(Class361.aClass_ra3793, (long) (client.anInt8981 * 822953439));
			if (-1 != 1522181389 * client.windowPaneId)
				Class355_Sub1.method4131(1522181389 * client.windowPaneId, -221969333);
			for (int i = 0; i < 197858337 * client.anInt9213; i++) {
				client.aBooleanArray9263[i] = client.aBooleanArray9230[i];
				client.aBooleanArray9230[i] = false;
			}
			client.anInt9214 = client.anInt8981 * 1551992261;
			Class_na.method3513(-1, -1, (byte) 76);
			if (client.windowPaneId * 1522181389 != -1) {
				client.anInt9213 = 0;
				Class286.method2873(1912494886);
			}
			Class361.aClass_ra3793.L();
			Class305.method3049(Class361.aClass_ra3793, (byte) -72);
			int i = Class403.method4731((byte) 99);
			if (i == -1)
				i = -1676605053 * client.anInt9147;
			if (i == -1)
				i = 763172837 * client.anInt9215;
			Class373.method4339(i, (byte) -28);
			int i_28_ = (Class263_Sub2.myPlayer.method5453(-1923731169) << 8);
			Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
			Class330_Sub33.method3435((Class263_Sub2.myPlayer.aByte8658), i_28_ + (int) class260.aFloat2716, (int) class260.aFloat2711 + i_28_, 1872757809 * client.anInt9210, -269766656);
			client.anInt9210 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.ia(").append(')').toString());
		}
	}

	static final void method4080(Class430 class430, int i) {
		try {
			int i_29_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -1142652171 * client.aClass286Array9234[i_29_].anInt2950;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.yl(").append(')').toString());
		}
	}

	static final void method4081(Class430 class430, int i) {
		try {
			int i_30_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class372 class372 = Class79.aClass380_666.method4387(i_30_, (byte) -89);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class372.anInt3876 * 1422337301;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("os.aov(").append(')').toString());
		}
	}
}
