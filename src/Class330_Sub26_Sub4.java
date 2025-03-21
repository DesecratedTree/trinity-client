/* Class330_Sub26_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub26_Sub4 extends Class330_Sub26 {
	int anInt9581;
	String aString9582;
	byte aByte9583;
	int anInt9584 = -305981795;
	Class167 aClass167_9585;

	Class330_Sub26_Sub4(Class167 class167) {
		/* empty */
	}

	void method3388(Buffer class330_sub46, int i) {
		try {
			((Class330_Sub26_Sub4) this).anInt9584 = class330_sub46.readUnsignedShort(587975754) * 305981795;
			((Class330_Sub26_Sub4) this).aByte9583 = class330_sub46.readByte((byte) -24);
			((Class330_Sub26_Sub4) this).anInt9581 = class330_sub46.readUnsignedShort(1957129971) * 1544788037;
			class330_sub46.readLong(-1452160008);
			((Class330_Sub26_Sub4) this).aString9582 = class330_sub46.readString(-1636034263);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiu.r(").append(')').toString());
		}
	}

	void method3391(Class330_Sub39 class330_sub39) {
		Class153 class153 = (class330_sub39.aClass153Array7759[((Class330_Sub26_Sub4) this).anInt9584 * -811868085]);
		class153.aByte1632 = ((Class330_Sub26_Sub4) this).aByte9583;
		class153.anInt1631 = ((Class330_Sub26_Sub4) this).anInt9581 * -462727465;
		class153.aString1633 = ((Class330_Sub26_Sub4) this).aString9582;
	}

	void method3389(Class330_Sub39 class330_sub39, int i) {
		try {
			Class153 class153 = (class330_sub39.aClass153Array7759[((Class330_Sub26_Sub4) this).anInt9584 * -811868085]);
			class153.aByte1632 = ((Class330_Sub26_Sub4) this).aByte9583;
			class153.anInt1631 = ((Class330_Sub26_Sub4) this).anInt9581 * -462727465;
			class153.aString1633 = ((Class330_Sub26_Sub4) this).aString9582;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiu.j(").append(')').toString());
		}
	}

	void method3387(Class330_Sub39 class330_sub39) {
		Class153 class153 = (class330_sub39.aClass153Array7759[((Class330_Sub26_Sub4) this).anInt9584 * -811868085]);
		class153.aByte1632 = ((Class330_Sub26_Sub4) this).aByte9583;
		class153.anInt1631 = ((Class330_Sub26_Sub4) this).anInt9581 * -462727465;
		class153.aString1633 = ((Class330_Sub26_Sub4) this).aString9582;
	}

	void method3390(Buffer class330_sub46) {
		((Class330_Sub26_Sub4) this).anInt9584 = class330_sub46.readUnsignedShort(698430737) * 305981795;
		((Class330_Sub26_Sub4) this).aByte9583 = class330_sub46.readByte((byte) 60);
		((Class330_Sub26_Sub4) this).anInt9581 = class330_sub46.readUnsignedShort(716344699) * 1544788037;
		class330_sub46.readLong(31317552);
		((Class330_Sub26_Sub4) this).aString9582 = class330_sub46.readString(778677552);
	}

	void method3392(Class330_Sub39 class330_sub39) {
		Class153 class153 = (class330_sub39.aClass153Array7759[((Class330_Sub26_Sub4) this).anInt9584 * -811868085]);
		class153.aByte1632 = ((Class330_Sub26_Sub4) this).aByte9583;
		class153.anInt1631 = ((Class330_Sub26_Sub4) this).anInt9581 * -462727465;
		class153.aString1633 = ((Class330_Sub26_Sub4) this).aString9582;
	}

	static final int method3397(int i, int i_0_, byte i_1_) {
		try {
			return (i_0_ < 0 ? -i : (int) (((double) i * Math.sqrt(1.220703125E-4 * (double) i_0_)) + 0.5));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aiu.as(").append(')').toString());
		}
	}
}
