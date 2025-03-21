/* Class140_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class140_Sub1 extends Class140 {
	static int anInt7231 = 17;
	Class105 aClass105_7232;
	static int anInt7233 = 1;
	static int anInt7234 = 2;
	static int anInt7235 = 3;
	static int anInt7236 = 4;
	static int anInt7237 = 7;
	static int anInt7238 = 0;
	static int anInt7239 = 1;
	static int anInt7240 = 8;
	Class249 aClass249_7241 = new Class249();
	static int anInt7242 = 10;
	static int anInt7243 = 11;
	static int anInt7244 = 12;
	static int anInt7245 = 13;
	static int anInt7246 = 14;
	static int anInt7247 = 15;
	static int anInt7248 = 16;
	static int anInt7249 = 2;
	static int anInt7250 = 19;
	static int anInt7251 = 0;
	static int anInt7252 = 9;
	static int anInt7253 = 7;
	static int anInt7254 = 5;
	static int anInt7255 = 17;
	static int anInt7256 = 18;
	static int anInt7257 = 6;
	static int anInt7258 = 12;
	Class123[] aClass123Array7259 = new Class123[19];
	int[][] anIntArrayArray7260 = new int[19][17];
	int[] anIntArray7261;
	public static int[][] anIntArrayArray7262;
	public static Class285 aClass285_7263;

	public void method1625(boolean bool) {
		if (bool)
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[1]);
		else
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[0]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 22739)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1277(((Class140_Sub1) this).anIntArray7261[2], 0, anInterface11_Impl3_1540, 339394112);
		((Class140_Sub1) this).aClass105_7232.method1276(((Class140_Sub1) this).anIntArray7261[4], ((Class140_Sub1) this).aClass249_7241, (byte) 35);
		((Class140_Sub1) this).aClass105_7232.method1275((((Class140_Sub1) this).anIntArray7261[5]), aClass249_1546, 2140754749);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[7], aClass261_1551.aFloat2717, aClass261_1551.aFloat2718, aClass261_1551.aFloat2720, aClass261_1551.aFloat2719, 238527799);
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[8], aClass260_1547.aFloat2716, aClass260_1547.aFloat2715, aClass260_1547.aFloat2711, 782692983);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[9], aClass261_1548.aFloat2717, aClass261_1548.aFloat2718, aClass261_1548.aFloat2720, aClass261_1548.aFloat2719, -191951282);
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[10], aClass260_1549.aFloat2716, aClass260_1549.aFloat2715, aClass260_1549.aFloat2711, 1740466656);
		aClass_ra_Sub2_1537.method4987(Class199.aClass199_1926, anInt1555, anInt1556, anInt1557, anInt1552);
	}

	boolean method1641(int i) throws Exception_Sub2 {
		try {
			((Class140_Sub1) this).aClass105_7232 = aClass_ra_Sub2_1537.method4888("Model");
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class140_Sub1) this).aClass105_7232.method1295("DiffuseSampler", (byte) -8);
			Class330_Sub15_Sub1 class330_sub15_sub1_0_ = ((Class140_Sub1) this).aClass105_7232.method1295("EnvironmentSampler", (byte) -94);
			Class330_Sub15_Sub1 class330_sub15_sub1_1_ = ((Class140_Sub1) this).aClass105_7232.method1295("PointLightsPosAndRadiusSq", (byte) -68);
			Class330_Sub15_Sub1 class330_sub15_sub1_2_ = ((Class140_Sub1) this).aClass105_7232.method1295("PointLightsDiffuseColour", (byte) -38);
			Class330_Sub15_Sub1 class330_sub15_sub1_3_ = ((Class140_Sub1) this).aClass105_7232.method1295("WVPMatrix", (byte) -90);
			Class330_Sub15_Sub1 class330_sub15_sub1_4_ = ((Class140_Sub1) this).aClass105_7232.method1295("TexCoordMatrix", (byte) -95);
			Class330_Sub15_Sub1 class330_sub15_sub1_5_ = ((Class140_Sub1) this).aClass105_7232.method1295("HeightFogPlane", (byte) -40);
			Class330_Sub15_Sub1 class330_sub15_sub1_6_ = ((Class140_Sub1) this).aClass105_7232.method1295("HeightFogColour", (byte) -33);
			Class330_Sub15_Sub1 class330_sub15_sub1_7_ = ((Class140_Sub1) this).aClass105_7232.method1295("DistanceFogPlane", (byte) -69);
			Class330_Sub15_Sub1 class330_sub15_sub1_8_ = ((Class140_Sub1) this).aClass105_7232.method1295("DistanceFogColour", (byte) -76);
			Class330_Sub15_Sub1 class330_sub15_sub1_9_ = ((Class140_Sub1) this).aClass105_7232.method1295("SunDir", (byte) -114);
			Class330_Sub15_Sub1 class330_sub15_sub1_10_ = ((Class140_Sub1) this).aClass105_7232.method1295("SunColour", (byte) -15);
			Class330_Sub15_Sub1 class330_sub15_sub1_11_ = ((Class140_Sub1) this).aClass105_7232.method1295("AntiSunColour", (byte) -1);
			Class330_Sub15_Sub1 class330_sub15_sub1_12_ = ((Class140_Sub1) this).aClass105_7232.method1295("AmbientColour", (byte) -55);
			Class330_Sub15_Sub1 class330_sub15_sub1_13_ = ((Class140_Sub1) this).aClass105_7232.method1295("EyePos", (byte) -113);
			Class330_Sub15_Sub1 class330_sub15_sub1_14_ = ((Class140_Sub1) this).aClass105_7232.method1295("SpecularExponent", (byte) -123);
			Class330_Sub15_Sub1 class330_sub15_sub1_15_ = ((Class140_Sub1) this).aClass105_7232.method1295("WorldMatrix", (byte) -73);
			((Class140_Sub1) this).aClass123Array7259[0] = ((Class140_Sub1) this).aClass105_7232.method1254("Unlit", 2030539961);
			((Class140_Sub1) this).aClass123Array7259[1] = ((Class140_Sub1) this).aClass105_7232.method1254("Unlit_IgnoreAlpha", -1588159107);
			((Class140_Sub1) this).aClass123Array7259[17] = ((Class140_Sub1) this).aClass105_7232.method1254("UnderwaterGround", 1501625474);
			((Class140_Sub1) this).aClass123Array7259[18] = ((Class140_Sub1) this).aClass105_7232.method1254("UnderwaterGroundSpecular", 660160270);
			for (int i_16_ = 0; i_16_ <= 4; i_16_++) {
				((Class140_Sub1) this).aClass123Array7259[2 + i_16_] = (((Class140_Sub1) this).aClass105_7232.method1254(new StringBuilder().append("Standard_").append(i_16_).append("PointLights").toString(), -40580657));
				((Class140_Sub1) this).aClass123Array7259[i_16_ + 7] = (((Class140_Sub1) this).aClass105_7232.method1254(new StringBuilder().append("Specular_").append(i_16_).append("PointLights").toString(), -2108981766));
				((Class140_Sub1) this).aClass123Array7259[12 + i_16_] = (((Class140_Sub1) this).aClass105_7232.method1254(new StringBuilder().append("EnvironmentalMapping_").append(i_16_).append("PointLights").toString(), -361394437));
			}
			for (int i_17_ = 0; i_17_ < 19; i_17_++) {
				int i_18_ = (((Class140_Sub1) this).aClass105_7232.method1297(((Class140_Sub1) this).aClass123Array7259[i_17_], -835070531));
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][2] = class330_sub15_sub1.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][3] = class330_sub15_sub1_0_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][1] = class330_sub15_sub1_1_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][0] = class330_sub15_sub1_2_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][4] = class330_sub15_sub1_3_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][5] = class330_sub15_sub1_4_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][7] = class330_sub15_sub1_5_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][8] = class330_sub15_sub1_6_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][9] = class330_sub15_sub1_7_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][10] = class330_sub15_sub1_8_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][11] = class330_sub15_sub1_9_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][12] = class330_sub15_sub1_10_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][13] = class330_sub15_sub1_11_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][14] = class330_sub15_sub1_12_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][6] = class330_sub15_sub1_13_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][15] = class330_sub15_sub1_15_.method3328(i_18_);
				((Class140_Sub1) this).anIntArrayArray7260[i_17_][16] = class330_sub15_sub1_14_.method3328(i_18_);
			}
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[2]);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.ac(").append(')').toString());
		}
	}

	public Class140_Sub1(Class_ra_Sub2 class_ra_sub2) throws Exception_Sub2 {
		super(class_ra_sub2);
		method1641(1547284360);
	}

	public void method1637() {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[17]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 16123)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		method1642(0, 958214782);
	}

	public void method1640() {
		try {
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[17]);
			((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 13463)]);
			((Class140_Sub1) this).aClass105_7232.method1249();
			method1642(0, -1291318167);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.f(").append(')').toString());
		}
	}

	void method1642(int i, int i_19_) {
		try {
			((Class140_Sub1) this).aClass105_7232.method1277(((Class140_Sub1) this).anIntArray7261[2], 0, anInterface11_Impl3_1540, 456948631);
			((Class140_Sub1) this).aClass105_7232.method1276(((Class140_Sub1) this).anIntArray7261[4], ((Class140_Sub1) this).aClass249_7241, (byte) -47);
			((Class140_Sub1) this).aClass105_7232.method1275(((Class140_Sub1) this).anIntArray7261[5], aClass249_1546, 1091527861);
			((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[7], aClass261_1551.aFloat2717, aClass261_1551.aFloat2718, aClass261_1551.aFloat2720, aClass261_1551.aFloat2719, -160430548);
			((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[8], aClass260_1547.aFloat2716, aClass260_1547.aFloat2715, aClass260_1547.aFloat2711, 705762425);
			((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[9], aClass261_1548.aFloat2717, aClass261_1548.aFloat2718, aClass261_1548.aFloat2720, aClass261_1548.aFloat2719, -1092345873);
			((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[10], aClass260_1549.aFloat2716, aClass260_1549.aFloat2715, aClass260_1549.aFloat2711, 1922047705);
			((Class140_Sub1) this).aClass105_7232.method1257(((Class140_Sub1) this).anIntArray7261[11], aClass260_1542, (byte) 18);
			((Class140_Sub1) this).aClass105_7232.method1257(((Class140_Sub1) this).anIntArray7261[12], aClass260_1544, (byte) 8);
			((Class140_Sub1) this).aClass105_7232.method1257(((Class140_Sub1) this).anIntArray7261[13], aClass260_1543, (byte) 70);
			((Class140_Sub1) this).aClass105_7232.method1257(((Class140_Sub1) this).anIntArray7261[14], aClass260_1553, (byte) -67);
			if (i > 0) {
				((Class140_Sub1) this).aClass105_7232.method1274(((Class140_Sub1) this).anIntArray7261[1], aFloatArray1539, 4 * i, -1094674830);
				((Class140_Sub1) this).aClass105_7232.method1274(((Class140_Sub1) this).anIntArray7261[0], aFloatArray1538, i * 4, -396516896);
			}
			aClass_ra_Sub2_1537.method4987(Class199.aClass199_1926, anInt1555, anInt1556, anInt1557, anInt1552);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.al(").append(')').toString());
		}
	}

	public void method1620(int i) {
		try {
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[i + 2]);
			((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 25445)]);
			((Class140_Sub1) this).aClass105_7232.method1249();
			method1642(i, -639338987);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.p(").append(')').toString());
		}
	}

	public void method1635(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[12 + i]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 6407)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1290((((Class140_Sub1) this).anIntArray7261[15]), aClass249_1554, 16711680);
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1471000575);
		((Class140_Sub1) this).aClass105_7232.method1277(((Class140_Sub1) this).anIntArray7261[3], 1, anInterface11_Impl1_1550, 1821365610);
		method1642(i, -156623319);
	}

	public void method1626(Class249 class249) {
		((Class140_Sub1) this).aClass249_7241.method2510(class249);
		((Class140_Sub1) this).aClass249_7241.method2483(aClass_ra_Sub2_1537.aClass249_8493);
	}

	public void method1634() {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[17]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 16962)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		method1642(0, -61559458);
	}

	public void method1616(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[i + 2]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 26333)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		method1642(i, 496311991);
	}

	public void method1636() {
		try {
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[18]);
			((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 20181)]);
			((Class140_Sub1) this).aClass105_7232.method1249();
			((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1972052423);
			((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, 607809851);
			method1642(0, 1113234041);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.z(").append(')').toString());
		}
	}

	public void method1628(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[i + 2]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 30217)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		method1642(i, 1201778204);
	}

	public void method1619(boolean bool) {
		try {
			if (bool)
				((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[1]);
			else
				((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[0]);
			((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 32376)]);
			((Class140_Sub1) this).aClass105_7232.method1249();
			((Class140_Sub1) this).aClass105_7232.method1277(((Class140_Sub1) this).anIntArray7261[2], 0, anInterface11_Impl3_1540, 297484471);
			((Class140_Sub1) this).aClass105_7232.method1276(((Class140_Sub1) this).anIntArray7261[4], ((Class140_Sub1) this).aClass249_7241, (byte) 97);
			((Class140_Sub1) this).aClass105_7232.method1275(((Class140_Sub1) this).anIntArray7261[5], aClass249_1546, 1132900161);
			((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[7], aClass261_1551.aFloat2717, aClass261_1551.aFloat2718, aClass261_1551.aFloat2720, aClass261_1551.aFloat2719, 1166021065);
			((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[8], aClass260_1547.aFloat2716, aClass260_1547.aFloat2715, aClass260_1547.aFloat2711, 590799154);
			((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[9], aClass261_1548.aFloat2717, aClass261_1548.aFloat2718, aClass261_1548.aFloat2720, aClass261_1548.aFloat2719, 1762575212);
			((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[10], aClass260_1549.aFloat2716, aClass260_1549.aFloat2715, aClass260_1549.aFloat2711, 1597542796);
			aClass_ra_Sub2_1537.method4987(Class199.aClass199_1926, anInt1555, anInt1556, anInt1557, anInt1552);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.i(").append(')').toString());
		}
	}

	public void method1622(int i) {
		try {
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[12 + i]);
			((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 25755)]);
			((Class140_Sub1) this).aClass105_7232.method1249();
			((Class140_Sub1) this).aClass105_7232.method1290(((Class140_Sub1) this).anIntArray7261[15], aClass249_1554, 16711680);
			((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1172375118);
			((Class140_Sub1) this).aClass105_7232.method1277(((Class140_Sub1) this).anIntArray7261[3], 1, anInterface11_Impl1_1550, 484229479);
			method1642(i, -2126199263);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.s(").append(')').toString());
		}
	}

	public void method1631(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[7 + i]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 23602)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1342826392);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, 45065713);
		method1642(i, 990640412);
	}

	public void method1632(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[7 + i]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 22122)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 911494539);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, -884278636);
		method1642(i, -1696233009);
	}

	public void method1633(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[7 + i]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 2952)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1764623423);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, -194615020);
		method1642(i, 1035257286);
	}

	public void method1618(Class249 class249) {
		try {
			((Class140_Sub1) this).aClass249_7241.method2510(class249);
			((Class140_Sub1) this).aClass249_7241.method2483(aClass_ra_Sub2_1537.aClass249_8493);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.j(").append(')').toString());
		}
	}

	public void method1624(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[12 + i]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 30985)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1290((((Class140_Sub1) this).anIntArray7261[15]), aClass249_1554, 16711680);
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1913320933);
		((Class140_Sub1) this).aClass105_7232.method1277(((Class140_Sub1) this).anIntArray7261[3], 1, anInterface11_Impl1_1550, 1126782473);
		method1642(i, -140096896);
	}

	public void method1621(int i) {
		try {
			((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[7 + i]);
			((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 17151)]);
			((Class140_Sub1) this).aClass105_7232.method1249();
			((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 868863820);
			((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, -1290981317);
			method1642(i, -133870213);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aad.o(").append(')').toString());
		}
	}

	public void method1629(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[7 + i]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 2854)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1373198945);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, -1300363426);
		method1642(i, 924249857);
	}

	public void method1638() {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[17]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 6022)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		method1642(0, 599098735);
	}

	public void method1627() {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[17]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 16603)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		method1642(0, -16554755);
	}

	public void method1623() {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[18]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 30477)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1820147396);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, 1181573345);
		method1642(0, 31638629);
	}

	public void method1630(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[7 + i]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 26668)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		((Class140_Sub1) this).aClass105_7232.method1271(((Class140_Sub1) this).anIntArray7261[6], aClass260_1536.aFloat2716, aClass260_1536.aFloat2715, aClass260_1536.aFloat2711, 1046251100);
		((Class140_Sub1) this).aClass105_7232.method1272(((Class140_Sub1) this).anIntArray7261[16], aFloat1541, aFloat1545, 0.0F, 0.0F, 988156311);
		method1642(i, 435764114);
	}

	public void method1639(int i) {
		((Class140_Sub1) this).aClass105_7232.method1258(((Class140_Sub1) this).aClass123Array7259[i + 2]);
		((Class140_Sub1) this).anIntArray7261 = (((Class140_Sub1) this).anIntArrayArray7260[((Class140_Sub1) this).aClass105_7232.method1260((short) 5984)]);
		((Class140_Sub1) this).aClass105_7232.method1249();
		method1642(i, 757835354);
	}
}
