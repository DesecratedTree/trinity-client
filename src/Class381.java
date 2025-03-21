/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class381 {
	public int gameSceneBaseY;
	public int gameSceneBaseX;
	public int anInt3963;
	public static IndexTable aClass280_3964;

	public Class381() {
		anInt3963 = 212659907;
	}

	public Class381(int i, int i_0_, int i_1_) {
		anInt3963 = -212659907 * i;
		gameSceneBaseX = 170770945 * i_0_;
		gameSceneBaseY = -71518063 * i_1_;
	}

	public Class381(int i) {
		if (i == -1)
			anInt3963 = 212659907;
		else {
			anInt3963 = -212659907 * (i >> 28 & 0x3);
			gameSceneBaseX = 170770945 * (i >> 14 & 0x3fff);
			gameSceneBaseY = (i & 0x3fff) * -71518063;
		}
	}

	public String toString() {
		try {
			return new StringBuilder().append(664489493 * anInt3963).append(",").append(-1261027839 * gameSceneBaseX >> 6).append(",").append(-1542584207 * gameSceneBaseY >> 6).append(",").append(gameSceneBaseX * -1261027839 & 0x3f).append(",").append(-1542584207 * gameSceneBaseY & 0x3f).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.toString(").append(')').toString());
		}
	}

	public static void method4396(Class545 class545, int i, int i_2_, Interface2 interface2, int i_3_) {
		try {
			Class430 class430 = Class325_Sub6.method3229((byte) 56);
			((Class430) class430).anInterface2_4389 = interface2;
			Class217.method2252(class545, i, i_2_, class430, -1424915238);
			((Class430) class430).anInterface2_4389 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.z(").append(')').toString());
		}
	}

	static final void method4397(Class430 class430, int i) {
		try {
			((Class430) class430).anObjectArray4375[(((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871])] = (((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 -= 2087905371) * -1378875437)]);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.aa(").append(')').toString());
		}
	}

	static final void method4398(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_4_, -92133796);
			Class330_Sub31.method3418(iComponentDefinitions, class430, -1402133545);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.qk(").append(')').toString());
		}
	}

	static final void method4399(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_5_, 1133079779);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -106182925 * iComponentDefinitions.anInt1321;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.rw(").append(')').toString());
		}
	}

	static final void method4400(Class430 class430, byte i) {
		try {
			String string;
			if (Class263_Sub2.myPlayer != null && (Class263_Sub2.myPlayer.displayName) != null)
				string = Class263_Sub2.myPlayer.method5471(true, 1119838160);
			else
				string = "";
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.acs(").append(')').toString());
		}
	}

	static void method4401(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, Class481 class481, int i_11_) {
		try {
			Class330_Sub10 class330_sub10 = null;
			for (Class330_Sub10 class330_sub10_12_ = ((Class330_Sub10) Class330_Sub10.aClass471_7588.method5869(539664854)); class330_sub10_12_ != null; class330_sub10_12_ = (Class330_Sub10) Class330_Sub10.aClass471_7588.method5873((byte) -59)) {
				if (i == (525431007 * ((Class330_Sub10) class330_sub10_12_).anInt7581) && class330_sub10_12_.anInt7582 * -533165901 == i_6_ && class330_sub10_12_.anInt7577 * 2127793995 == i_7_ && i_8_ == (((Class330_Sub10) class330_sub10_12_).anInt7575 * 1982913715)) {
					class330_sub10 = class330_sub10_12_;
					break;
				}
			}
			if (class330_sub10 == null) {
				class330_sub10 = new Class330_Sub10();
				((Class330_Sub10) class330_sub10).anInt7581 = i * 254692127;
				((Class330_Sub10) class330_sub10).anInt7575 = 1114190459 * i_8_;
				class330_sub10.anInt7582 = 1369794171 * i_6_;
				class330_sub10.anInt7577 = -275578269 * i_7_;
				Class330_Sub10.aClass471_7588.method5878(class330_sub10, (short) 8192);
			}
			((Class330_Sub10) class330_sub10).anInt7589 = i_9_ * 1410924489;
			((Class330_Sub10) class330_sub10).anInt7585 = i_10_ * 1162271155;
			((Class330_Sub10) class330_sub10).aClass481_7584 = class481;
			((Class330_Sub10) class330_sub10).aBoolean7583 = true;
			((Class330_Sub10) class330_sub10).aBoolean7586 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.j(").append(')').toString());
		}
	}

	static final void method4402(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = -421168987 * iComponentDefinitions.anInt1224;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pv.pe(").append(')').toString());
		}
	}
}
