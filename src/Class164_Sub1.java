/* Class164_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class164_Sub1 extends Class164 {
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7290;
	static int anInt7291 = 2;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7292;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7293;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7294;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7295;
	Class249[] aClass249Array7296;
	int anInt7297;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7298;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7299;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7300;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7301;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7302;
	static Class249 aClass249_7303 = new Class249();
	static int anInt7304 = 16;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7305;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7306;
	static int anInt7307 = 1;
	static int anInt7308 = 8;
	static int anInt7309 = 4;
	protected Class105 aClass105_7310;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7311;
	static int anInt7312 = 32;
	static int anInt7313 = 64;
	static int anInt7314 = 128;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7315;
	int[] anIntArray7316;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7317;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7318;
	float[] aFloatArray7319 = new float[3];

	abstract boolean method1938() throws Exception_Sub2;

	boolean method1939(String string) throws Exception_Sub2 {
		aClass105_7310 = aClass_ra_Sub2_1694.method4888(string);
		if (aClass105_7310 == null)
			throw new Exception_Sub2("");
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7302 = aClass105_7310.method1281("textureMatrix", 1127792137);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7292 = aClass105_7310.method1281("modelMatrix", 1237342142);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7293 = aClass105_7310.method1281("viewMatrix", 922359377);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7294 = aClass105_7310.method1281("projectionMatrix", 1245346601);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7311 = aClass105_7310.method1281("modelViewMatrix", 1173788295);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7290 = aClass105_7310.method1281("modelViewProjectionMatrix", 960752334);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7298 = aClass105_7310.method1281("viewProjectionMatrix", 1904475018);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7318 = aClass105_7310.method1281("ambientColour", 1384095237);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7305 = aClass105_7310.method1281("sunDirection", 1723848401);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7317 = aClass105_7310.method1281("sunColour", 1472463865);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7315 = aClass105_7310.method1281("antiSunColour", 1315593513);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7306 = aClass105_7310.method1281("sunExponent", 1143626242);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7299 = aClass105_7310.method1281("eyePosition", 1541057655);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7300 = aClass105_7310.method1281("eyePositionOS", 1228113707);
		((Class164_Sub1) this).aClass330_Sub15_Sub1_7301 = aClass105_7310.method1281("sunDirectionOS", 1570458094);
		if (!method1938()) {
			aClass105_7310 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7302 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7292 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7293 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7294 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7311 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7290 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7298 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7318 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7305 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7317 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7315 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7306 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7299 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7300 = null;
			((Class164_Sub1) this).aClass330_Sub15_Sub1_7301 = null;
			return false;
		}
		if (aClass105_7310.method1259(870714971) == null) {
			Class123 class123 = aClass105_7310.method1288((byte) 0);
			if (class123 == null)
				throw new Exception_Sub2(new StringBuilder().append(aClass105_7310.method1252((byte) -4)).append("").toString());
			aClass105_7310.method1258(class123);
		}
		((Class164_Sub1) this).anInt7297 = aClass105_7310.method1255((byte) -8);
		((Class164_Sub1) this).anIntArray7316 = new int[((Class164_Sub1) this).anInt7297];
		return true;
	}

	void method1931() {
		if (aClass105_7310 != null)
			aClass105_7310.method1250();
	}

	void method1940(Class249 class249) {
		if (aClass105_7310 != null && aClass105_7310.method1251() && aClass_ra_Sub2_1694.method4954() == 0) {
			int i = aClass105_7310.method1260((short) 27185);
			if ((((Class164_Sub1) this).anIntArray7316[i] & 0x80) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7302 != null) {
				aClass105_7310.method1269((((Class164_Sub1) this).aClass330_Sub15_Sub1_7302), class249, -152358546);
				((Class164_Sub1) this).anIntArray7316[i] &= ~0x80;
			}
		}
	}

	void method1941() {
		if (aClass105_7310 != null && aClass105_7310.method1251()) {
			int i = aClass105_7310.method1260((short) 19206);
			int i_0_ = ((Class164_Sub1) this).anIntArray7316[i];
			if ((i_0_ & 0x1) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7292 != null)
				aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7292), aClass_ra_Sub2_1694.method4980(), -54774495);
			if ((i_0_ & 0x2) != 0) {
				if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7293 != null)
					aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7293), aClass_ra_Sub2_1694.method4915(), -420655007);
				if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7299 != null) {
					((Class164_Sub1) this).aFloatArray7319[0] = 0.0F;
					((Class164_Sub1) this).aFloatArray7319[1] = 0.0F;
					((Class164_Sub1) this).aFloatArray7319[2] = 0.0F;
					aClass_ra_Sub2_1694.cq().method2469(((Class164_Sub1) this).aFloatArray7319[0], ((Class164_Sub1) this).aFloatArray7319[1], ((Class164_Sub1) this).aFloatArray7319[2], ((Class164_Sub1) this).aFloatArray7319);
					aClass105_7310.method1263(((Class164_Sub1) this).aClass330_Sub15_Sub1_7299, ((Class164_Sub1) this).aFloatArray7319[0], ((Class164_Sub1) this).aFloatArray7319[1], ((Class164_Sub1) this).aFloatArray7319[2], 1581561530);
				}
			}
			if ((i_0_ & 0x10) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7311 != null)
				aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7311), aClass_ra_Sub2_1694.method4920(), -1834178160);
			if ((i_0_ & 0x8) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7295 != null)
				aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7295), aClass_ra_Sub2_1694.method4916(), -1022846009);
			if ((i_0_ & 0x4) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7294 != null)
				aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7294), aClass_ra_Sub2_1694.method4922(), 862135127);
			if ((i_0_ & 0x20) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7290 != null) {
				aClass249_7303.method2484(aClass_ra_Sub2_1694.method4920(), aClass_ra_Sub2_1694.method4922());
				aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7290), aClass249_7303, -1935813097);
			}
			if ((i_0_ & 0x40) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7298 != null) {
				aClass249_7303.method2484(aClass_ra_Sub2_1694.method4915(), aClass_ra_Sub2_1694.method4922());
				aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7298), aClass249_7303, -1253759497);
			}
			if (aClass_ra_Sub2_1694.method4954() == 0 && (((Class164_Sub1) this).anIntArray7316[i] & 0x80) != 0 && ((Class164_Sub1) this).aClass330_Sub15_Sub1_7302 != null) {
				aClass105_7310.method1269((((Class164_Sub1) this).aClass330_Sub15_Sub1_7302), aClass_ra_Sub2_1694.method5008(), 440604844);
				((Class164_Sub1) this).anIntArray7316[i] &= ~0x80;
			}
			((Class164_Sub1) this).anIntArray7316[i] = 0;
		}
	}

	void method1942(int i, Class247 class247) {
		if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7300 != null) {
			Class249 class249 = aClass_ra_Sub2_1694.method4916();
			float[] fs = { class249.aFloatArray2631[12], class249.aFloatArray2631[13], class249.aFloatArray2631[14] };
			float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
			class249.method2482(fs_1_);
			float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
			aClass_ra_Sub2_1694.cq().method2465(0.0F, 0.0F, 0.0F, fs_2_);
			class247.method2470(fs);
			aClass105_7310.method1263((((Class164_Sub1) this).aClass330_Sub15_Sub1_7300), fs[0], fs[1], fs[2], 1397514283);
		}
	}

	void method1943(boolean bool) {
		if (aClass105_7310 != null && aClass105_7310.method1251()) {
			if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7318 != null)
				aClass105_7310.method1263((((Class164_Sub1) this).aClass330_Sub15_Sub1_7318), (aClass_ra_Sub2_1694.aFloat8530 * aClass_ra_Sub2_1694.aFloat8533), (aClass_ra_Sub2_1694.aFloat8500 * aClass_ra_Sub2_1694.aFloat8533), (aClass_ra_Sub2_1694.aFloat8532 * aClass_ra_Sub2_1694.aFloat8533), 1111659654);
			if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7305 != null)
				aClass105_7310.method1263(((Class164_Sub1) this).aClass330_Sub15_Sub1_7305, aClass_ra_Sub2_1694.aFloatArray8525[0], aClass_ra_Sub2_1694.aFloatArray8525[1], aClass_ra_Sub2_1694.aFloatArray8525[2], 1647060285);
			if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7317 != null)
				aClass105_7310.method1263((((Class164_Sub1) this).aClass330_Sub15_Sub1_7317), (aClass_ra_Sub2_1694.aFloat8530 * aClass_ra_Sub2_1694.aFloat8489), (aClass_ra_Sub2_1694.aFloat8500 * aClass_ra_Sub2_1694.aFloat8489), (aClass_ra_Sub2_1694.aFloat8532 * aClass_ra_Sub2_1694.aFloat8489), -1696258946);
			if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7315 != null)
				aClass105_7310.method1263((((Class164_Sub1) this).aClass330_Sub15_Sub1_7315), (-aClass_ra_Sub2_1694.aFloat8530 * aClass_ra_Sub2_1694.aFloat8535), (-aClass_ra_Sub2_1694.aFloat8500 * aClass_ra_Sub2_1694.aFloat8535), (-aClass_ra_Sub2_1694.aFloat8532 * aClass_ra_Sub2_1694.aFloat8535), 1575103287);
			if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7306 != null)
				aClass105_7310.method1301((((Class164_Sub1) this).aClass330_Sub15_Sub1_7306), 64.0F + Math.abs(aClass_ra_Sub2_1694.aFloatArray8525[1]) * 928.0F, (byte) -67);
		}
	}

	void method1944(int i) {
		for (int i_3_ = 0; i_3_ < ((Class164_Sub1) this).anInt7297; i_3_++)
			((Class164_Sub1) this).anIntArray7316[i_3_] |= 128 << i;
	}

	void method1945() {
		method1943(aClass_ra_Sub2_1694.aBoolean8522);
		method1940(aClass_ra_Sub2_1694.method5008());
		method1941();
		method1929();
	}

	void method1933() {
		method1946(Class247.aClass247_2621);
	}

	void method1935() {
		if (aClass105_7310 != null)
			aClass105_7310.method1250();
	}

	void method1929() {
		/* empty */
	}

	void method1936() {
		aClass105_7310.method1249();
		((Class164_Sub1) this).anIntArray7316[aClass105_7310.method1260((short) 28737)] = -1;
		method1949(0);
		method1945();
	}

	void method1934() {
		if (aClass105_7310 != null)
			aClass105_7310.method1250();
	}

	void method1946(Class247 class247) {
		Class249 class249 = aClass_ra_Sub2_1694.aClass249_8576;
		class249.method2508(class247);
		int i = aClass105_7310.method1260((short) 21807);
		if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7292 != null) {
			aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7292), class249, -1562833230);
			((Class164_Sub1) this).anIntArray7316[i] &= ~0x1;
		}
		if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7311 != null) {
			aClass249_7303.method2484(class249, aClass_ra_Sub2_1694.method4915());
			aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7311), aClass249_7303, 936693781);
			((Class164_Sub1) this).anIntArray7316[i] &= ~0x10;
		}
		if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7290 != null) {
			aClass249_7303.method2484(class249, aClass_ra_Sub2_1694.method4921());
			aClass105_7310.method1253((((Class164_Sub1) this).aClass330_Sub15_Sub1_7290), aClass249_7303, -535740538);
			((Class164_Sub1) this).anIntArray7316[i] &= ~0x20;
		}
		method1942(i, class247);
		method1948(i, class247);
	}

	abstract boolean method1947() throws Exception_Sub2;

	Class164_Sub1(Class_ra_Sub2 class_ra_sub2) {
		super(class_ra_sub2);
		new Class247();
		((Class164_Sub1) this).aClass249Array7296 = new Class249[aClass_ra_Sub2_1694.anInt8592];
		for (int i = 0; i < aClass_ra_Sub2_1694.anInt8592; i++)
			((Class164_Sub1) this).aClass249Array7296[i] = new Class249();
	}

	void method1937() {
		method1946(Class247.aClass247_2621);
	}

	void method1948(int i, Class247 class247) {
		if (((Class164_Sub1) this).aClass330_Sub15_Sub1_7301 != null) {
			float[] fs = { aClass_ra_Sub2_1694.aFloatArray8525[0], aClass_ra_Sub2_1694.aFloatArray8525[1], aClass_ra_Sub2_1694.aFloatArray8525[2] };
			class247.method2471(fs);
			aClass105_7310.method1263((((Class164_Sub1) this).aClass330_Sub15_Sub1_7301), fs[0], fs[1], fs[2], -148619825);
		}
	}

	void method1949(int i) {
		((Class164_Sub1) this).aClass249Array7296[0].method2516();
		method1944(i);
	}

	void method1950() {
		/* empty */
	}

	void method1951() {
		/* empty */
	}

	void method1928() {
		aClass105_7310.method1249();
		((Class164_Sub1) this).anIntArray7316[aClass105_7310.method1260((short) 18204)] = -1;
		method1949(0);
		method1945();
	}
}
