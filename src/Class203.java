/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class203 implements Interface24 {
	static Buffer aClass330_Sub46_6789;
	protected static Class504 aClass504_6790;
	static Class61[] aClass61Array6791;

	public String method290(Class390 class390, int[] is, long l) {
		if (Class390.aClass390_4034 == class390) {
			Class506 class506 = Class211.aClass505_2062.method6140(is[0], 1697895982);
			return class506.method6144((int) l, (byte) -54);
		}
		if (class390 == Class390.aClass390_4051 || class390 == Class390.aClass390_4042) {
			ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions((int) l, (byte) -78);
			return itemDefinitions.name;
		}
		if (class390 == Class390.aClass390_4038 || Class390.aClass390_4036 == class390 || class390 == Class390.aClass390_4043)
			return Class211.aClass505_2062.method6140(is[0], 1412353003).method6144((int) l, (byte) 79);
		return null;
	}

	public String method291(Class390 class390, int[] is, long l) {
		try {
			if (Class390.aClass390_4034 == class390) {
				Class506 class506 = Class211.aClass505_2062.method6140(is[0], 1625686710);
				return class506.method6144((int) l, (byte) 37);
			}
			if (class390 == Class390.aClass390_4051 || class390 == Class390.aClass390_4042) {
				ItemDefinitions itemDefinitions = Class556.aClass510_6392.getItemDefinitions((int) l, (byte) -79);
				return itemDefinitions.name;
			}
			if (class390 == Class390.aClass390_4038 || Class390.aClass390_4036 == class390 || class390 == Class390.aClass390_4043)
				return Class211.aClass505_2062.method6140(is[0], 1731209743).method6144((int) l, (byte) -29);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("in.r(").append(')').toString());
		}
	}

	static final void method2175(Class430 class430, byte i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 2050339336);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class109.method1352(iComponentDefinitions, class120, class430, (byte) 6);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("in.cv(").append(')').toString());
		}
	}

	static final void method2176(Class430 class430, int i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_1_, -1279930889);
			Class120 class120 = Class3.aClass120Array56[i_1_ >> 16];
			Class252.method2527(iComponentDefinitions, class120, class430, (byte) 110);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("in.dc(").append(')').toString());
		}
	}

	public static void method2177(int i) {
		try {
			for (Class330_Sub43 class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6099((byte) -8)); null != class330_sub43; class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6098((short) -32768))) {
				if (!((Class330_Sub43) class330_sub43).aBoolean7821)
					Class502.method6132((((Class330_Sub43) class330_sub43).anInt7819) * -1340253797, (byte) -71);
				else
					((Class330_Sub43) class330_sub43).aBoolean7821 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("in.z(").append(')').toString());
		}
	}

	static final void method2178(Class330_Sub46_Sub2 class330_sub46_sub2, int i) {
		try {
			class330_sub46_sub2.method3820(1371286187);
			int i_2_ = client.anInt9121 * 1478725729;
			Player class432_sub1_sub1_sub1_sub1 = (Class263_Sub2.myPlayer = client.players[i_2_] = (new Player(client.aClass304_9030.method3023(-400722441))));
			class432_sub1_sub1_sub1_sub1.anInt10008 = 662194221 * i_2_;
			int i_3_ = class330_sub46_sub2.readBits(30);
			byte i_4_ = (byte) (i_3_ >> 28);
			int i_5_ = i_3_ >> 14 & 0x3fff;
			int i_6_ = i_3_ & 0x3fff;
			Class381 class381 = client.aClass304_9030.method3022(-454820308);
			class432_sub1_sub1_sub1_sub1.anIntArray10018[0] = i_5_ - class381.gameSceneBaseX * -1261027839;
			class432_sub1_sub1_sub1_sub1.anIntArray10059[0] = i_6_ - class381.gameSceneBaseY * -1542584207;
			class432_sub1_sub1_sub1_sub1.method5348((float) ((class432_sub1_sub1_sub1_sub1.anIntArray10018[0] << 9) + (class432_sub1_sub1_sub1_sub1.method5453(-1303913055) << 8)), (class432_sub1_sub1_sub1_sub1.method5345().aClass260_2606.aFloat2715), (float) ((class432_sub1_sub1_sub1_sub1.anIntArray10059[0] << 9) + (class432_sub1_sub1_sub1_sub1.method5453(-1422727669) << 8)));
			Class85.anInt712 = (class432_sub1_sub1_sub1_sub1.aByte8658 = class432_sub1_sub1_sub1_sub1.aByte8654 = i_4_) * 963615621;
			if (client.aClass304_9030.method2995(967830627).method2788(class432_sub1_sub1_sub1_sub1.anIntArray10018[0], class432_sub1_sub1_sub1_sub1.anIntArray10059[0], (byte) 51))
				class432_sub1_sub1_sub1_sub1.aByte8654++;
			if (null != Class15.aClass330_Sub46Array191[i_2_])
				class432_sub1_sub1_sub1_sub1.sendAppearance(Class15.aClass330_Sub46Array191[i_2_], 127724991);
			Class15.anInt192 = 0;
			Class15.anIntArray187[(Class15.anInt192 += 1854780791) * -1468156857 - 1] = i_2_;
			Class15.aByteArray189[i_2_] = (byte) 0;
			Class15.anInt193 = 0;
			for (int i_7_ = 1; i_7_ < 2048; i_7_++) {
				if (i_7_ == i_2_) {
					if (i == -2103875213)
						throw new IllegalStateException();
				} else {
					int i_8_ = class330_sub46_sub2.readBits(18);
					int i_9_ = i_8_ >> 16;
					int i_10_ = i_8_ >> 8 & 0xff;
					int i_11_ = i_8_ & 0xff;
					Class26 class26 = Class15.aClass26Array198[i_7_] = new Class26();
					((Class26) class26).anInt313 = 992654047 * ((i_10_ << 14) + (i_9_ << 28) + i_11_);
					((Class26) class26).anInt310 = 0;
					((Class26) class26).anInt309 = 104854619;
					((Class26) class26).aBoolean312 = false;
					((Class26) class26).aBoolean311 = false;
					Class15.anIntArray195[(Class15.anInt193 += 12078897) * -1052726831 - 1] = i_7_;
					Class15.aByteArray189[i_7_] = (byte) 0;
				}
			}
			class330_sub46_sub2.method3824(-1960504320);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("in.r(").append(')').toString());
		}
	}

	static final void method2179(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class243.anInt6988 * -2096566971;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("in.aoh(").append(')').toString());
		}
	}
}
