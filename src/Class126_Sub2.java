/* Class126_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class126_Sub2 extends Class126 {
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7224;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7225;
	Class249 aClass249_7226 = new Class249();
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7227;
	Class330_Sub15_Sub1 aClass330_Sub15_Sub1_7228;
	static IndexTable aClass280_7229;
	Class105 aClass105_7230;

	public Class126_Sub2(Class_ra_Sub2 class_ra_sub2) throws Exception_Sub2 {
		super(class_ra_sub2);
		method1539(1018441152);
	}

	boolean method1539(int i) throws Exception_Sub2 {
		try {
			((Class126_Sub2) this).aClass105_7230 = aClass_ra_Sub2_1463.method4888("Particle");
			((Class126_Sub2) this).aClass330_Sub15_Sub1_7227 = ((Class126_Sub2) this).aClass105_7230.method1295("WVPMatrix", (byte) -52);
			((Class126_Sub2) this).aClass330_Sub15_Sub1_7225 = ((Class126_Sub2) this).aClass105_7230.method1295("DiffuseSampler", (byte) -32);
			((Class126_Sub2) this).aClass330_Sub15_Sub1_7228 = ((Class126_Sub2) this).aClass105_7230.method1295("TexCoordMatrix", (byte) 2);
			((Class126_Sub2) this).aClass330_Sub15_Sub1_7224 = ((Class126_Sub2) this).aClass105_7230.method1295("DiffuseColour", (byte) -90);
			((Class126_Sub2) this).aClass105_7230.method1258(((Class126_Sub2) this).aClass105_7230.method1288((byte) 0));
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aau.z(").append(')').toString());
		}
	}

	public void method1534(int i) {
		try {
			method1540((byte) -5);
			aClass_ra_Sub2_1463.method4987(Class199.aClass199_1926, 0, i * 4, 0, 2 * i);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aau.j(").append(')').toString());
		}
	}

	public void method1533() {
		try {
			method1540((byte) -89);
			aClass_ra_Sub2_1463.method4983();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aau.i(").append(')').toString());
		}
	}

	void method1540(byte i) {
		try {
			((Class126_Sub2) this).aClass105_7230.method1258(((Class126_Sub2) this).aClass105_7230.method1288((byte) 0));
			((Class126_Sub2) this).aClass105_7230.method1249();
			((Class126_Sub2) this).aClass105_7230.method1270(((Class126_Sub2) this).aClass330_Sub15_Sub1_7225, 0, anInterface11_Impl3_1461, (byte) 90);
			((Class126_Sub2) this).aClass105_7230.method1253(((Class126_Sub2) this).aClass330_Sub15_Sub1_7227, ((Class126_Sub2) this).aClass249_7226, 1242099992);
			((Class126_Sub2) this).aClass105_7230.method1269(((Class126_Sub2) this).aClass330_Sub15_Sub1_7228, aClass249_1460, 93394716);
			((Class126_Sub2) this).aClass105_7230.method1268(((Class126_Sub2) this).aClass330_Sub15_Sub1_7224, anInt1462, (short) -24266);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aau.w(").append(')').toString());
		}
	}

	public void method1535(Class249 class249) {
		((Class126_Sub2) this).aClass249_7226.method2510(class249);
		((Class126_Sub2) this).aClass249_7226.method2483(aClass_ra_Sub2_1463.aClass249_8493);
	}

	public void method1531(int i) {
		method1540((byte) -3);
		aClass_ra_Sub2_1463.method4987(Class199.aClass199_1926, 0, i * 4, 0, 2 * i);
	}

	public void method1537() {
		method1540((byte) 0);
		aClass_ra_Sub2_1463.method4983();
	}

	public void method1532(Class249 class249) {
		try {
			((Class126_Sub2) this).aClass249_7226.method2510(class249);
			((Class126_Sub2) this).aClass249_7226.method2483(aClass_ra_Sub2_1463.aClass249_8493);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aau.r(").append(')').toString());
		}
	}

	public void method1536(int i) {
		method1540((byte) 1);
		aClass_ra_Sub2_1463.method4987(Class199.aClass199_1926, 0, i * 4, 0, 2 * i);
	}

	static final void method1541(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class117 class117 = Class144.method1668(i_0_, (byte) 16);
			String string = "";
			if (null != class117 && class117.aString1384 != null)
				string = class117.aString1384;
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aau.ace(").append(')').toString());
		}
	}
}
