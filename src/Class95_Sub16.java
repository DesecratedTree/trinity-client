/* Class95_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95_Sub16 extends Class95 {
	int anInt7190;

	public void method1100() {
		Class96.aClass85Array854[((Class95_Sub16) this).anInt7190 * 1802518791].method970((byte) 94);
	}

	public void method1095(int i) {
		try {
			Class96.aClass85Array854[((Class95_Sub16) this).anInt7190 * 1802518791].method970((byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zq.j(").append(')').toString());
		}
	}

	Class95_Sub16(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub16) this).anInt7190 = class330_sub46.readUnsignedShort(1165878974) * 1740987575;
	}

	public void method1098() {
		Class96.aClass85Array854[((Class95_Sub16) this).anInt7190 * 1802518791].method970((byte) 30);
	}

	public void method1099() {
		Class96.aClass85Array854[((Class95_Sub16) this).anInt7190 * 1802518791].method970((byte) 23);
	}
}
