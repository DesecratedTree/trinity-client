/* Class330_Sub12_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub12_Sub13 extends Class330_Sub12 {
	int anInt9541 = -461548949;
	byte aByte9542;
	Class170 aClass170_9543;

	void method3300(Class154 class154) {
		class154.method1807((381564349 * ((Class330_Sub12_Sub13) this).anInt9541), ((Class330_Sub12_Sub13) this).aByte9542, 1245010354);
	}

	void method3294(Buffer class330_sub46, byte i) {
		try {
			((Class330_Sub12_Sub13) this).anInt9541 = class330_sub46.readUnsignedShort(55120239) * 461548949;
			((Class330_Sub12_Sub13) this).aByte9542 = class330_sub46.readByte((byte) 11);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiz.r(").append(')').toString());
		}
	}

	void method3293(Class154 class154, int i) {
		try {
			class154.method1807((381564349 * ((Class330_Sub12_Sub13) this).anInt9541), ((Class330_Sub12_Sub13) this).aByte9542, 1046654736);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiz.j(").append(')').toString());
		}
	}

	void method3301(Buffer class330_sub46) {
		((Class330_Sub12_Sub13) this).anInt9541 = class330_sub46.readUnsignedShort(1626334030) * 461548949;
		((Class330_Sub12_Sub13) this).aByte9542 = class330_sub46.readByte((byte) 63);
	}

	void method3298(Class154 class154) {
		class154.method1807((381564349 * ((Class330_Sub12_Sub13) this).anInt9541), ((Class330_Sub12_Sub13) this).aByte9542, -942846863);
	}

	void method3295(Class154 class154) {
		class154.method1807((381564349 * ((Class330_Sub12_Sub13) this).anInt9541), ((Class330_Sub12_Sub13) this).aByte9542, 930253111);
	}

	Class330_Sub12_Sub13(Class170 class170) {
		/* empty */
	}

	void method3297(Buffer class330_sub46) {
		((Class330_Sub12_Sub13) this).anInt9541 = class330_sub46.readUnsignedShort(191004785) * 461548949;
		((Class330_Sub12_Sub13) this).aByte9542 = class330_sub46.readByte((byte) -26);
	}

	void method3299(Buffer class330_sub46) {
		((Class330_Sub12_Sub13) this).anInt9541 = class330_sub46.readUnsignedShort(-37603110) * 461548949;
		((Class330_Sub12_Sub13) this).aByte9542 = class330_sub46.readByte((byte) -44);
	}

	void method3296(Buffer class330_sub46) {
		((Class330_Sub12_Sub13) this).anInt9541 = class330_sub46.readUnsignedShort(1427224106) * 461548949;
		((Class330_Sub12_Sub13) this).aByte9542 = class330_sub46.readByte((byte) -53);
	}

	static final void method3308(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			if (null == iComponentDefinitions.aString1283)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = iComponentDefinitions.aString1283;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiz.qo(").append(')').toString());
		}
	}
}
