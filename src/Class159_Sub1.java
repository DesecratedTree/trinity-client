/* Class159_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class159_Sub1 extends Class159 {
	static int anInt7272 = 2;
	static int anInt7273 = 0;
	static int anInt7274 = 7;
	static int anInt7275 = 1;
	static int anInt7276 = 3;
	static int anInt7277 = 4;
	static int anInt7278 = 3;
	static int anInt7279 = 5;
	Class123[] aClass123Array7280 = new Class123[3];
	static int anInt7281 = 0;
	static int anInt7282 = 1;
	static int anInt7283 = 2;
	int[] anIntArray7284;
	Class105 aClass105_7285;
	int[][] anIntArrayArray7286 = new int[3][7];
	static int anInt7287 = 6;
	Class261 aClass261_7288 = new Class261(1.0F, 1.0F, 1.0F, 1.0F);
	Class261 aClass261_7289 = new Class261(0.0F, 0.0F, 0.0F, 0.0F);

	void method1870(int i) {
		try {
			((Class159_Sub1) this).aClass105_7285.method1277(((Class159_Sub1) this).anIntArray7284[1], 0, anInterface11_Impl3_1679, 150190302);
			aClass_ra_Sub2_1684.method5103(aClass249_1681);
			((Class159_Sub1) this).aClass105_7285.method1276(((Class159_Sub1) this).anIntArray7284[0], aClass249_1681, (byte) 23);
			((Class159_Sub1) this).aClass105_7285.method1275(((Class159_Sub1) this).anIntArray7284[3], aClass249_1682, 1237387935);
			((Class159_Sub1) this).aClass105_7285.method1272(((Class159_Sub1) this).anIntArray7284[5], ((Class159_Sub1) this).aClass261_7288.aFloat2717, ((Class159_Sub1) this).aClass261_7288.aFloat2718, ((Class159_Sub1) this).aClass261_7288.aFloat2720, ((Class159_Sub1) this).aClass261_7288.aFloat2719, -1575023223);
			((Class159_Sub1) this).aClass105_7285.method1272(((Class159_Sub1) this).anIntArray7284[6], ((Class159_Sub1) this).aClass261_7289.aFloat2717, ((Class159_Sub1) this).aClass261_7289.aFloat2718, ((Class159_Sub1) this).aClass261_7289.aFloat2720, ((Class159_Sub1) this).aClass261_7289.aFloat2719, 226466438);
			aClass_ra_Sub2_1684.method5081(0, anInterface9_Impl1_1678);
			aClass_ra_Sub2_1684.method4978(aClass184_1686);
			aClass_ra_Sub2_1684.method4898(Class199.aClass199_1929, anInt1685, 2);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.l(").append(')').toString());
		}
	}

	public void method1863(int i, int i_0_) {
		switch (i) {
		case 2:
			((Class159_Sub1) this).aClass261_7288.method2585(i_0_);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		case 4:
			((Class159_Sub1) this).aClass261_7288.method2585(-1);
			((Class159_Sub1) this).aClass261_7289.method2585(i_0_);
			((Class159_Sub1) this).aClass261_7289.method2587();
			break;
		case 1:
			((Class159_Sub1) this).aClass261_7288.method2585(-1);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		case 3:
			((Class159_Sub1) this).aClass261_7288.method2585(0xffffff | i_0_ & ~0xffffff);
			((Class159_Sub1) this).aClass261_7289.method2585(i_0_ & 0xffffff);
			break;
		case 0:
			((Class159_Sub1) this).aClass261_7288.method2585(i_0_);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		}
	}

	public void method1862() {
		try {
			((Class159_Sub1) this).aClass105_7285.method1258(((Class159_Sub1) this).aClass123Array7280[0]);
			((Class159_Sub1) this).aClass105_7285.method1249();
			((Class159_Sub1) this).anIntArray7284 = (((Class159_Sub1) this).anIntArrayArray7286[((Class159_Sub1) this).aClass105_7285.method1260((short) 22331)]);
			method1870(1743229862);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.j(").append(')').toString());
		}
	}

	boolean method1871(int i) throws Exception_Sub2 {
		try {
			((Class159_Sub1) this).aClass105_7285 = aClass_ra_Sub2_1684.method4888("Sprite");
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class159_Sub1) this).aClass105_7285.method1295("WVPMatrix", (byte) -80);
			Class330_Sub15_Sub1 class330_sub15_sub1_1_ = ((Class159_Sub1) this).aClass105_7285.method1295("SpriteSampler", (byte) -60);
			Class330_Sub15_Sub1 class330_sub15_sub1_2_ = ((Class159_Sub1) this).aClass105_7285.method1295("MaskSampler", (byte) -37);
			Class330_Sub15_Sub1 class330_sub15_sub1_3_ = ((Class159_Sub1) this).aClass105_7285.method1295("MulColour", (byte) -111);
			Class330_Sub15_Sub1 class330_sub15_sub1_4_ = ((Class159_Sub1) this).aClass105_7285.method1295("AddColour", (byte) -62);
			Class330_Sub15_Sub1 class330_sub15_sub1_5_ = ((Class159_Sub1) this).aClass105_7285.method1295("SpriteTexCoordMatrix", (byte) -30);
			Class330_Sub15_Sub1 class330_sub15_sub1_6_ = ((Class159_Sub1) this).aClass105_7285.method1295("MaskTexCoordMatrix", (byte) -25);
			((Class159_Sub1) this).aClass123Array7280[0] = ((Class159_Sub1) this).aClass105_7285.method1254("Normal", -674339294);
			((Class159_Sub1) this).aClass123Array7280[1] = ((Class159_Sub1) this).aClass105_7285.method1254("Masked", 905720121);
			((Class159_Sub1) this).aClass123Array7280[2] = ((Class159_Sub1) this).aClass105_7285.method1254("AlphaTex", -1920807624);
			for (int i_7_ = 0; i_7_ < 3; i_7_++) {
				int i_8_ = (((Class159_Sub1) this).aClass105_7285.method1297(((Class159_Sub1) this).aClass123Array7280[i_7_], 1498926310));
				((Class159_Sub1) this).anIntArrayArray7286[i_7_][0] = class330_sub15_sub1.method3328(i_8_);
				((Class159_Sub1) this).anIntArrayArray7286[i_7_][1] = class330_sub15_sub1_1_.method3328(i_8_);
				((Class159_Sub1) this).anIntArrayArray7286[i_7_][2] = class330_sub15_sub1_2_.method3328(i_8_);
				((Class159_Sub1) this).anIntArrayArray7286[i_7_][5] = class330_sub15_sub1_3_.method3328(i_8_);
				((Class159_Sub1) this).anIntArrayArray7286[i_7_][6] = class330_sub15_sub1_4_.method3328(i_8_);
				((Class159_Sub1) this).anIntArrayArray7286[i_7_][3] = class330_sub15_sub1_5_.method3328(i_8_);
				((Class159_Sub1) this).anIntArrayArray7286[i_7_][4] = class330_sub15_sub1_6_.method3328(i_8_);
			}
			((Class159_Sub1) this).aClass105_7285.method1258(((Class159_Sub1) this).aClass123Array7280[0]);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.n(").append(')').toString());
		}
	}

	public Class159_Sub1(Class_ra_Sub2 class_ra_sub2) throws Exception_Sub2 {
		super(class_ra_sub2);
		method1871(-340567095);
	}

	public void method1868(int i, int i_9_) {
		switch (i) {
		case 2:
			((Class159_Sub1) this).aClass261_7288.method2585(i_9_);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		case 4:
			((Class159_Sub1) this).aClass261_7288.method2585(-1);
			((Class159_Sub1) this).aClass261_7289.method2585(i_9_);
			((Class159_Sub1) this).aClass261_7289.method2587();
			break;
		case 1:
			((Class159_Sub1) this).aClass261_7288.method2585(-1);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		case 3:
			((Class159_Sub1) this).aClass261_7288.method2585(0xffffff | i_9_ & ~0xffffff);
			((Class159_Sub1) this).aClass261_7289.method2585(i_9_ & 0xffffff);
			break;
		case 0:
			((Class159_Sub1) this).aClass261_7288.method2585(i_9_);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		}
	}

	public void method1861(int i, int i_10_) {
		try {
			switch (i) {
			case 2:
				((Class159_Sub1) this).aClass261_7288.method2585(i_10_);
				((Class159_Sub1) this).aClass261_7289.method2585(0);
				break;
			case 4:
				((Class159_Sub1) this).aClass261_7288.method2585(-1);
				((Class159_Sub1) this).aClass261_7289.method2585(i_10_);
				((Class159_Sub1) this).aClass261_7289.method2587();
				break;
			case 1:
				((Class159_Sub1) this).aClass261_7288.method2585(-1);
				((Class159_Sub1) this).aClass261_7289.method2585(0);
				break;
			case 3:
				((Class159_Sub1) this).aClass261_7288.method2585(0xffffff | i_10_ & ~0xffffff);
				((Class159_Sub1) this).aClass261_7289.method2585(i_10_ & 0xffffff);
				break;
			case 0:
				((Class159_Sub1) this).aClass261_7288.method2585(i_10_);
				((Class159_Sub1) this).aClass261_7289.method2585(0);
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.r(").append(')').toString());
		}
	}

	public void method1867() {
		((Class159_Sub1) this).aClass105_7285.method1258(((Class159_Sub1) this).aClass123Array7280[0]);
		((Class159_Sub1) this).aClass105_7285.method1249();
		((Class159_Sub1) this).anIntArray7284 = (((Class159_Sub1) this).anIntArrayArray7286[((Class159_Sub1) this).aClass105_7285.method1260((short) 6107)]);
		method1870(1146235875);
	}

	public void method1866() {
		((Class159_Sub1) this).aClass105_7285.method1258(((Class159_Sub1) this).aClass123Array7280[0]);
		((Class159_Sub1) this).aClass105_7285.method1249();
		((Class159_Sub1) this).anIntArray7284 = (((Class159_Sub1) this).anIntArrayArray7286[((Class159_Sub1) this).aClass105_7285.method1260((short) 25562)]);
		method1870(1270734426);
	}

	public void method1869() {
		((Class159_Sub1) this).aClass105_7285.method1258(((Class159_Sub1) this).aClass123Array7280[1]);
		((Class159_Sub1) this).aClass105_7285.method1249();
		((Class159_Sub1) this).anIntArray7284 = (((Class159_Sub1) this).anIntArrayArray7286[((Class159_Sub1) this).aClass105_7285.method1260((short) 15985)]);
		((Class159_Sub1) this).aClass105_7285.method1277(((Class159_Sub1) this).anIntArray7284[2], 1, anInterface11_Impl3_1680, 738987933);
		((Class159_Sub1) this).aClass105_7285.method1275((((Class159_Sub1) this).anIntArray7284[4]), aClass249_1683, 1220914387);
		method1870(1806203994);
	}

	public void method1865(int i, int i_11_) {
		switch (i) {
		case 2:
			((Class159_Sub1) this).aClass261_7288.method2585(i_11_);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		case 4:
			((Class159_Sub1) this).aClass261_7288.method2585(-1);
			((Class159_Sub1) this).aClass261_7289.method2585(i_11_);
			((Class159_Sub1) this).aClass261_7289.method2587();
			break;
		case 1:
			((Class159_Sub1) this).aClass261_7288.method2585(-1);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		case 3:
			((Class159_Sub1) this).aClass261_7288.method2585(0xffffff | i_11_ & ~0xffffff);
			((Class159_Sub1) this).aClass261_7289.method2585(i_11_ & 0xffffff);
			break;
		case 0:
			((Class159_Sub1) this).aClass261_7288.method2585(i_11_);
			((Class159_Sub1) this).aClass261_7289.method2585(0);
			break;
		}
	}

	public void method1864() {
		try {
			((Class159_Sub1) this).aClass105_7285.method1258(((Class159_Sub1) this).aClass123Array7280[1]);
			((Class159_Sub1) this).aClass105_7285.method1249();
			((Class159_Sub1) this).anIntArray7284 = (((Class159_Sub1) this).anIntArrayArray7286[((Class159_Sub1) this).aClass105_7285.method1260((short) 27276)]);
			((Class159_Sub1) this).aClass105_7285.method1277(((Class159_Sub1) this).anIntArray7284[2], 1, anInterface11_Impl3_1680, 1960661862);
			((Class159_Sub1) this).aClass105_7285.method1275(((Class159_Sub1) this).anIntArray7284[4], aClass249_1683, 1184016074);
			method1870(1356838694);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.i(").append(')').toString());
		}
	}

	static final void method1872(Class430 class430, int i) {
		try {
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = ((Class430) class430).aClass154_4391.aString1640;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.xm(").append(')').toString());
		}
	}

	static final void method1873(Class430 class430, byte i) {
		try {
			int i_12_ = Class263_Sub2.myPlayer.aByte8658;
			Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
			Class381 class381 = client.aClass304_9030.method3022(-2134418104);
			int i_13_ = (((int) class260.aFloat2716 >> 9) + -1261027839 * class381.gameSceneBaseX);
			int i_14_ = (class381.gameSceneBaseY * -1542584207 + ((int) class260.aFloat2711 >> 9));
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (i_13_ << 14) + (i_12_ << 28) + i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.te(").append(')').toString());
		}
	}

	static final void method1874(Class430 class430, int i) {
		try {
			int i_15_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_15_, 884248047);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = 1434092661 * iComponentDefinitions.anInt1184;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.rh(").append(')').toString());
		}
	}

	static final void method1875(int i) {
		try {
			Class255.method2540(Class361.aClass_ra3793, (byte) 8);
			if (client.anInt9262 * -1637912549 != -127654579 * Class85.anInt712)
				Class282.method2812(1470552195);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aaq.gm(").append(')').toString());
		}
	}
}
