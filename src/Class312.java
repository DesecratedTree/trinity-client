/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class312 {
	public int anInt3247;
	public int anInt3248;
	public int anInt3249;
	public int anInt3250;

	Class312(int i, int i_0_, int i_1_, int i_2_) {
		anInt3250 = i * -1412532223;
		anInt3248 = 1346053483 * i_0_;
		anInt3249 = i_1_ * -2145946627;
		anInt3247 = i_2_ * -1733281647;
	}

	Class312() {
		anInt3250 = (32 + (int) (Math.random() * 4.0)) * -1412532223;
		anInt3248 = (3 + (int) (Math.random() * 2.0)) * 1346053483;
		anInt3249 = (16 + (int) (Math.random() * 3.0)) * -2145946627;
		if (Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1571691871) == 1)
			anInt3247 = (int) (Math.random() * 6.0) * -1733281647;
		else
			anInt3247 = (int) (Math.random() * 12.0) * -1733281647;
	}

	public static final synchronized long method3111(byte i) {
		try {
			long l = System.currentTimeMillis();
			if (l < 4911702739087912061L * Class108.aLong1025)
				Class108.aLong1024 += ((4911702739087912061L * Class108.aLong1025 - l) * 5535689973849300269L);
			Class108.aLong1025 = 5569533272781483221L * l;
			return l + 1757784176836131493L * Class108.aLong1024;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mz.r(").append(')').toString());
		}
	}

	static final void method3112(Class430 class430, int i) {
		try {
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.aClass286Array9234[i_3_].anInt2947 * -1667750603;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mz.yt(").append(')').toString());
		}
	}

	static final void method3113(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if ((Class401_Sub1.aClass145_Sub1_8249.method1693(-1298010140) != Class136.aClass136_1523) || (Class401_Sub1.aClass145_Sub1_8249.method1718(2074961554) != Class146.aClass146_1611))
				throw new RuntimeException();
			Class166_Sub2 class166_sub2 = ((Class166_Sub2) Class401_Sub1.aClass145_Sub1_8249.method1707(2014979518));
			Class475_Sub1 class475_sub1 = ((Class475_Sub1) Class401_Sub1.aClass145_Sub1_8249.method1715(-1343207523));
			Class260 class260 = class166_sub2.method2006(-1731595532);
			Class260 class260_5_ = Class260.method2549(class260);
			class260_5_.aFloat2715 += (float) i_4_;
			Class260 class260_6_ = Class260.method2561(class475_sub1.method5932(-1038912688), class260_5_);
			class260_6_.method2557();
			float f = class166_sub2.method2009(-946247409).method2565();
			Class259.method2547(class475_sub1.method5932(-1199286102), class260_6_, class260, f, Class428.aClass260Array4359);
			Object object = null;
			if (null == Class428.aClass260Array4359[0])
				throw new RuntimeException("");
			Class260 class260_7_;
			if (null == Class428.aClass260Array4359[1])
				class260_7_ = Class428.aClass260Array4359[0];
			else if (Class260.method2561(class475_sub1.method5932(374371048), Class428.aClass260Array4359[0]).method2565() < Class260.method2561(class475_sub1.method5932(-1789719193), Class428.aClass260Array4359[1]).method2565())
				class260_7_ = Class428.aClass260Array4359[1];
			else
				class260_7_ = Class428.aClass260Array4359[0];
			float f_8_ = Class382.method4408((class260.aFloat2716 - class260_7_.aFloat2716), (class260.aFloat2711 - class260_7_.aFloat2711), -172237676);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 0;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (int) (2607.5945876176133 * (double) f_8_) & 0x3fff;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mz.ait(").append(')').toString());
		}
	}

	public static boolean method3114(int i, int i_9_) {
		try {
			return i == 1 || 3 == i || 5 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("mz.p(").append(')').toString());
		}
	}
}
