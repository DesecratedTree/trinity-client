/* Class330_Sub26_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub26_Sub2 extends Class330_Sub26 {
	String aString9573 = null;
	byte aByte9574;
	int anInt9575;
	Class167 aClass167_9576;

	Class330_Sub26_Sub2(Class167 class167) {
		/* empty */
	}

	void method3388(Buffer class330_sub46, int i) {
		try {
			if (class330_sub46.readUnsignedByte(139597786) != 255) {
				class330_sub46.offset -= 323600977;
				class330_sub46.readLong(446672250);
			}
			((Class330_Sub26_Sub2) this).aString9573 = class330_sub46.method3761(1906082322);
			((Class330_Sub26_Sub2) this).anInt9575 = class330_sub46.readUnsignedShort(441485893) * 2096684167;
			((Class330_Sub26_Sub2) this).aByte9574 = class330_sub46.readByte((byte) -29);
			class330_sub46.readLong(-489719197);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aik.r(").append(')').toString());
		}
	}

	void method3389(Class330_Sub39 class330_sub39, int i) {
		try {
			Class153 class153 = new Class153();
			class153.aString1633 = ((Class330_Sub26_Sub2) this).aString9573;
			class153.anInt1631 = 1856591925 * ((Class330_Sub26_Sub2) this).anInt9575;
			class153.aByte1632 = ((Class330_Sub26_Sub2) this).aByte9574;
			class330_sub39.method3543(class153, (byte) 2);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aik.j(").append(')').toString());
		}
	}

	void method3391(Class330_Sub39 class330_sub39) {
		Class153 class153 = new Class153();
		class153.aString1633 = ((Class330_Sub26_Sub2) this).aString9573;
		class153.anInt1631 = 1856591925 * ((Class330_Sub26_Sub2) this).anInt9575;
		class153.aByte1632 = ((Class330_Sub26_Sub2) this).aByte9574;
		class330_sub39.method3543(class153, (byte) 2);
	}

	void method3387(Class330_Sub39 class330_sub39) {
		Class153 class153 = new Class153();
		class153.aString1633 = ((Class330_Sub26_Sub2) this).aString9573;
		class153.anInt1631 = 1856591925 * ((Class330_Sub26_Sub2) this).anInt9575;
		class153.aByte1632 = ((Class330_Sub26_Sub2) this).aByte9574;
		class330_sub39.method3543(class153, (byte) 2);
	}

	void method3390(Buffer class330_sub46) {
		if (class330_sub46.readUnsignedByte(1559972636) != 255) {
			class330_sub46.offset -= 323600977;
			class330_sub46.readLong(-1711376333);
		}
		((Class330_Sub26_Sub2) this).aString9573 = class330_sub46.method3761(1849910790);
		((Class330_Sub26_Sub2) this).anInt9575 = class330_sub46.readUnsignedShort(996973525) * 2096684167;
		((Class330_Sub26_Sub2) this).aByte9574 = class330_sub46.readByte((byte) -12);
		class330_sub46.readLong(-1307765206);
	}

	void method3392(Class330_Sub39 class330_sub39) {
		Class153 class153 = new Class153();
		class153.aString1633 = ((Class330_Sub26_Sub2) this).aString9573;
		class153.anInt1631 = 1856591925 * ((Class330_Sub26_Sub2) this).anInt9575;
		class153.aByte1632 = ((Class330_Sub26_Sub2) this).aByte9574;
		class330_sub39.method3543(class153, (byte) 2);
	}
}
