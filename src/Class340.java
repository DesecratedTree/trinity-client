/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class340 {
	public Class340 aClass340_3380;
	public byte aByte3381;
	public Class432_Sub1_Sub5 aClass432_Sub1_Sub5_3382;
	public Class432_Sub1_Sub5 aClass432_Sub1_Sub5_3383;
	public Class432_Sub1_Sub3 aClass432_Sub1_Sub3_3384;
	public Class432_Sub1_Sub3 aClass432_Sub1_Sub3_3385;
	public Class432_Sub1_Sub4 aClass432_Sub1_Sub4_3386;
	short aShort3387;
	public Class352 aClass352_3388;
	short aShort3389;
	short aShort3390;
	Class432_Sub1_Sub2 aClass432_Sub1_Sub2_3391;
	short aShort3392;

	public Class340(int i) {
		aByte3381 = (byte) i;
	}

	static final void method3968(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class101.method1216(iComponentDefinitions, class120, class430, -1889844131);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oe.ik(").append(')').toString());
		}
	}

	static final void method3969(Class430 class430, int i) {
		try {
			method3971(-1388004368);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oe.agy(").append(')').toString());
		}
	}

	static int method3970(int i, int i_0_, int i_1_) {
		try {
			double d = Math.log((double) i_0_) / Math.log(2.0);
			double d_2_ = Math.log((double) i) / Math.log(2.0);
			double d_3_ = Math.random() * (d - d_2_) + d_2_;
			return (int) (Math.pow(2.0, d_3_) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oe.m(").append(')').toString());
		}
	}

	public static final void method3971(int i) {
		try {
			for (int i_4_ = 0; i_4_ < 5; i_4_++)
				client.aBooleanArray9238[i_4_] = false;
			client.anInt9013 = 150049295;
			client.anInt9183 = 1683907065;
			Class355.anInt3638 = 0;
			Class18.anInt238 = 0;
			Class147.anInt1621 = -780346076;
			Class439.anInt4456 = 1180637393;
			Class457.anInt6844 = 1651776935;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("oe.hn(").append(')').toString());
		}
	}
}
