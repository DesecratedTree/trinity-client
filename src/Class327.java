/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class327 {
	int[] anIntArray3322;
	int anInt3323;
	LinkedList aLinkedList3324;
	int anInt3325;
	int[] anIntArray3326;
	static int anInt3327 = 0;

	Class387 method3232(Class_ra class_ra, short i) {
		try {
			Model class98 = Model.loadModel(Class95_Sub12.aClass280_7177, ((Class327) this).anInt3323 * -727744199, 0);
			if (class98 == null)
				return null;
			if (class98.anInt881 < 13)
				class98.method1196(2);
			return class_ra.cb(class98, 2048, anInt3327 * -1382812373, 64, 768);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.r(").append(')').toString());
		}
	}

	public void method3233(Class356 class356, byte i) {
		try {
			if (class356 != null && -1504781335 * ((Class327) this).anInt3325 > 0) {
				method3235(class356, (byte) -86);
				Iterator iterator = ((Class327) this).aLinkedList3324.iterator();
				while (iterator.hasNext()) {
					Class432_Sub1_Sub1_Sub3 class432_sub1_sub1_sub3 = (Class432_Sub1_Sub1_Sub3) iterator.next();
					class356.method4145(class432_sub1_sub1_sub3, false, 1361862418);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.j(").append(')').toString());
		}
	}

	public void method3234(Class356 class356, int i) {
		try {
			if (class356 != null && ((Class327) this).aLinkedList3324 != null) {
				Iterator iterator = ((Class327) this).aLinkedList3324.iterator();
				while (iterator.hasNext()) {
					Class432_Sub1_Sub1_Sub3 class432_sub1_sub1_sub3 = (Class432_Sub1_Sub1_Sub3) iterator.next();
					class356.method4181(class432_sub1_sub1_sub3.aByte8658, class432_sub1_sub1_sub3.aShort9922, class432_sub1_sub1_sub3.aShort9921, new Class336(class432_sub1_sub1_sub3), (byte) 112);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.i(").append(')').toString());
		}
	}

	void method3235(Class356 class356, byte i) {
		try {
			((Class327) this).aLinkedList3324 = new LinkedList();
			Class281 class281 = client.aClass304_9030.method2995(811206633);
			Class381 class381 = client.aClass304_9030.method3022(1149668435);
			Class381 class381_0_ = new Class381(Class85.anInt712 * -127654579, ((Class327) this).anIntArray3322[0], ((Class327) this).anIntArray3326[0]);
			for (int i_1_ = 1; i_1_ < ((Class327) this).anInt3325 * -1504781335; i_1_++) {
				Class381 class381_2_ = new Class381(Class85.anInt712 * -127654579, ((Class327) this).anIntArray3322[i_1_], ((Class327) this).anIntArray3326[i_1_]);
				while ((-1261027839 * class381_2_.gameSceneBaseX != -1261027839 * class381_0_.gameSceneBaseX) || (-1542584207 * class381_2_.gameSceneBaseY != class381_0_.gameSceneBaseY * -1542584207)) {
					if (class381_0_.gameSceneBaseX * -1261027839 < -1261027839 * class381_2_.gameSceneBaseX)
						class381_0_.gameSceneBaseX += 170770945;
					else if (-1261027839 * class381_0_.gameSceneBaseX > class381_2_.gameSceneBaseX * -1261027839)
						class381_0_.gameSceneBaseX -= 170770945;
					if (class381_0_.gameSceneBaseY * -1542584207 < -1542584207 * class381_2_.gameSceneBaseY)
						class381_0_.gameSceneBaseY += -71518063;
					else if (class381_0_.gameSceneBaseY * -1542584207 > -1542584207 * class381_2_.gameSceneBaseY)
						class381_0_.gameSceneBaseY -= -71518063;
					int i_3_ = -127654579 * Class85.anInt712;
					int i_4_ = (class381_0_.gameSceneBaseX * -1261027839 - class381.gameSceneBaseX * -1261027839);
					int i_5_ = (-1542584207 * class381_0_.gameSceneBaseY - -1542584207 * class381.gameSceneBaseY);
					if (i_4_ >= 0 && i_4_ < class356.anInt3667 * -265955713 && i_5_ >= 0 && i_5_ < 95955317 * class356.anInt3654) {
						int i_6_ = 256 + (i_4_ << 9);
						int i_7_ = 256 + (i_5_ << 9);
						if (class281.method2788(i_4_, i_5_, (byte) -14))
							i_3_++;
						((Class327) this).aLinkedList3324.add(new Class432_Sub1_Sub1_Sub3(class356, this, -127654579 * Class85.anInt712, i_3_, i_6_, Class431.method5342(i_6_, i_7_, (-127654579 * Class85.anInt712), 1996761881), i_7_));
					}
				}
				class381_0_ = class381_2_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.p(").append(')').toString());
		}
	}

	public Class327(Class_ra class_ra, Buffer class330_sub46, int i) {
		((Class327) this).anInt3323 = -137814775 * i;
		((Class327) this).anInt3325 = class330_sub46.method3764((byte) -27) * -938628007;
		((Class327) this).anIntArray3322 = new int[((Class327) this).anInt3325 * -1504781335];
		((Class327) this).anIntArray3326 = new int[((Class327) this).anInt3325 * -1504781335];
		int i_8_ = class330_sub46.readUnsignedShort(1906561826);
		int i_9_ = class330_sub46.readUnsignedShort(196863845);
		for (int i_10_ = 0; i_10_ < -1504781335 * ((Class327) this).anInt3325; i_10_++) {
			((Class327) this).anIntArray3322[i_10_] = i_8_ + class330_sub46.readByte((byte) 11);
			((Class327) this).anIntArray3326[i_10_] = i_9_ + class330_sub46.readByte((byte) -30);
		}
		method3232(class_ra, (short) 27740);
	}

	static final void method3236(Class430 class430, byte i) {
		try {
			int i_11_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			Class158.aClass561_6474.method6464(i_11_, (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]), 735096694);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.m(").append(')').toString());
		}
	}

	static final void method3237(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class330_Sub48_Sub4.method3848(iComponentDefinitions, class120, class430, 861085587);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.lj(").append(')').toString());
		}
	}

	static final void method3238(Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (string.startsWith(Class325_Sub4.method3225(0, 770024746)) || string.startsWith(Class325_Sub4.method3225(1, 1970276429)))
				string = string.substring(7);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class113.method1385(string, (byte) 2);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.xr(").append(')').toString());
		}
	}

	static final void method3239(Class430 class430, byte i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class360.anInt3753 * 406960101;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.ajy(").append(')').toString());
		}
	}

	static ClientScript method3240(int i, byte i_12_) {
		try {
			ClientScript class330_sub36_sub8 = ((ClientScript) Class424.aClass378_4326.method4377((long) i));
			if (class330_sub36_sub8 != null)
				return class330_sub36_sub8;
			byte[] is = Class543.aClass280_6255.getFile(i, 0);
			if (is == null || is.length <= 1)
				return null;
			try {
				class330_sub36_sub8 = Class403.method4730(is, -2134721354);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
			}
			Class424.aClass378_4326.method4378(class330_sub36_sub8, (long) i);
			return class330_sub36_sub8;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.j(").append(')').toString());
		}
	}

	static final void method3241(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = iComponentDefinitions.anInt1210 * -681123409;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("np.pd(").append(')').toString());
		}
	}
}
