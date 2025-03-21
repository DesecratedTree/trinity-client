/* Class95_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95_Sub8 extends Class95 {
	static int anInt7158;
	int anInt7159;

	public void method1095(int i) {
		try {
			Class96.aClass88Array855[-1522644087 * ((Class95_Sub8) this).anInt7159].method1049(1894660833);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zh.j(").append(')').toString());
		}
	}

	public void method1099() {
		Class96.aClass88Array855[-1522644087 * ((Class95_Sub8) this).anInt7159].method1049(2032830401);
	}

	public void method1100() {
		Class96.aClass88Array855[-1522644087 * ((Class95_Sub8) this).anInt7159].method1049(1799254553);
	}

	public void method1098() {
		Class96.aClass88Array855[-1522644087 * ((Class95_Sub8) this).anInt7159].method1049(1784457152);
	}

	Class95_Sub8(Buffer class330_sub46) {
		super(class330_sub46);
		((Class95_Sub8) this).anInt7159 = class330_sub46.readUnsignedShort(220040918) * 1047763641;
	}

	static final String[] method1125(String[] strings, int i) {
		try {
			String[] strings_0_ = new String[5];
			for (int i_1_ = 0; i_1_ < 5; i_1_++) {
				strings_0_[i_1_] = new StringBuilder().append(i_1_).append(" ").toString();
				if (null != strings && null != strings[i_1_])
					strings_0_[i_1_] = new StringBuilder().append(strings_0_[i_1_]).append(strings[i_1_]).toString();
			}
			return strings_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("zh.ly(").append(')').toString());
		}
	}
}
