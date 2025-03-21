/* Class291_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class291_Sub1 extends Class291 implements Runnable {
	public void run() {
		try {
			((Class291_Sub1) this).aBoolean2976 = true;
			do {
				try {
					try {
						while (!((Class291_Sub1) this).aBoolean2975) {
							for (int i = 0; i < 2; i++) {
								Class296 class296 = (((Class291_Sub1) this).aClass296Array2977[i]);
								if (class296 != null)
									class296.method2932();
							}
							Class464_Sub21.method5813(10L);
							Class285.method2862(null, -2126639242);
						}
					} catch (Exception exception) {
						Class207.method2195(null, exception, -306254718);
						((Class291_Sub1) this).aBoolean2976 = false;
						break;
					}
					((Class291_Sub1) this).aBoolean2976 = false;
				} catch (RuntimeException object) {
					((Class291_Sub1) this).aBoolean2976 = false;
					throw object;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xi.run(").append(')').toString());
		}
	}

	Class291_Sub1() {
		/* empty */
	}

	static final void method2907(int i) {
		try {
			if (Class226.method2307(client.anInt8995 * -296919301, (byte) 49) || Class522.method6230(-296919301 * client.anInt8995, 283322534))
				Class330_Sub31.logout(false, 1312762687);
			else {
				Class274.aClass357_2852 = client.aClass1_9025.method380(-511214244);
				client.aClass1_9025.method377(-1665250286);
				Class227.method2311(9, -1188873169);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xi.gs(").append(')').toString());
		}
	}

	public static Class366 method2908(int i, int i_0_, int i_1_, int i_2_, Class476 class476, int i_3_, int i_4_) {
		try {
			Class363.aClass366_Sub2_3805.anInt3854 = -1089827279 * i;
			Class363.aClass366_Sub2_3805.anInt3853 = i_0_ * 1307742219;
			Class363.aClass366_Sub2_3805.anInt3852 = i_1_ * 1706819999;
			Class363.aClass366_Sub2_3805.anInt3855 = 1343860585 * i_2_;
			((Class366_Sub2) Class363.aClass366_Sub2_3805).aClass476_8004 = class476;
			((Class366_Sub2) Class363.aClass366_Sub2_3805).anInt8003 = i_3_ * 431241507;
			return Class363.aClass366_Sub2_3805;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("xi.s(").append(')').toString());
		}
	}
}
