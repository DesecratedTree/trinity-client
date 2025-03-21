/* Class330_Sub12_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub12_Sub7 extends Class330_Sub12 {
	int anInt9522;
	int anInt9523;
	Class170 aClass170_9524;

	void method3299(Buffer class330_sub46) {
		((Class330_Sub12_Sub7) this).anInt9522 = class330_sub46.readInt((byte) 52) * -2096904639;
		((Class330_Sub12_Sub7) this).anInt9523 = class330_sub46.readInt((byte) 86) * 580253667;
	}

	void method3294(Buffer class330_sub46, byte i) {
		try {
			((Class330_Sub12_Sub7) this).anInt9522 = class330_sub46.readInt((byte) 10) * -2096904639;
			((Class330_Sub12_Sub7) this).anInt9523 = class330_sub46.readInt((byte) 26) * 580253667;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aim.r(").append(')').toString());
		}
	}

	void method3293(Class154 class154, int i) {
		try {
			class154.method1809((((Class330_Sub12_Sub7) this).anInt9522 * 1960790465), (((Class330_Sub12_Sub7) this).anInt9523 * 945751499), -1521875508);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aim.j(").append(')').toString());
		}
	}

	void method3301(Buffer class330_sub46) {
		((Class330_Sub12_Sub7) this).anInt9522 = class330_sub46.readInt((byte) 117) * -2096904639;
		((Class330_Sub12_Sub7) this).anInt9523 = class330_sub46.readInt((byte) 105) * 580253667;
	}

	void method3300(Class154 class154) {
		class154.method1809((((Class330_Sub12_Sub7) this).anInt9522 * 1960790465), ((Class330_Sub12_Sub7) this).anInt9523 * 945751499, -79844219);
	}

	void method3296(Buffer class330_sub46) {
		((Class330_Sub12_Sub7) this).anInt9522 = class330_sub46.readInt((byte) 87) * -2096904639;
		((Class330_Sub12_Sub7) this).anInt9523 = class330_sub46.readInt((byte) 84) * 580253667;
	}

	Class330_Sub12_Sub7(Class170 class170) {
		/* empty */
	}

	void method3297(Buffer class330_sub46) {
		((Class330_Sub12_Sub7) this).anInt9522 = class330_sub46.readInt((byte) 10) * -2096904639;
		((Class330_Sub12_Sub7) this).anInt9523 = class330_sub46.readInt((byte) 35) * 580253667;
	}

	void method3295(Class154 class154) {
		class154.method1809((((Class330_Sub12_Sub7) this).anInt9522 * 1960790465), ((Class330_Sub12_Sub7) this).anInt9523 * 945751499, -431462742);
	}

	void method3298(Class154 class154) {
		class154.method1809((((Class330_Sub12_Sub7) this).anInt9522 * 1960790465), ((Class330_Sub12_Sub7) this).anInt9523 * 945751499, -1970245224);
	}

	static final void method3306(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 1929141284);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class250.method2517(iComponentDefinitions, class120, class430, (byte) 3);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aim.dy(").append(')').toString());
		}
	}
}
