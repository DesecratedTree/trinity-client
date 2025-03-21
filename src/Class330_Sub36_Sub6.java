/* Class330_Sub36_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub36_Sub6 extends Class330_Sub36 {
	Class497 aClass497_9667;

	void method3463(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(750370960);
				if (0 == i_0_) {
					if (i >= -2085937792) {
						/* empty */
					}
					break;
				}
				method3465(class330_sub46, i_0_, (byte) 9);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajd.r(").append(')').toString());
		}
	}

	Class330_Sub36_Sub6() {
		/* empty */
	}

	public String method3464(int i, String string, int i_1_) {
		try {
			if (((Class330_Sub36_Sub6) this).aClass497_9667 == null)
				return string;
			Class330_Sub35 class330_sub35 = (Class330_Sub35) ((Class330_Sub36_Sub6) this).aClass497_9667.method6094((long) i);
			if (null == class330_sub35)
				return string;
			return (String) class330_sub35.anObject7733;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajd.p(").append(')').toString());
		}
	}

	void method3465(Buffer class330_sub46, int i, byte i_2_) {
		try {
			if (249 == i) {
				int i_3_ = class330_sub46.readUnsignedByte(1226316665);
				if (null == ((Class330_Sub36_Sub6) this).aClass497_9667) {
					int i_4_ = Class136.method1594(i_3_, 1554656200);
					((Class330_Sub36_Sub6) this).aClass497_9667 = new Class497(i_4_);
				}
				for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
					boolean bool = class330_sub46.readUnsignedByte(1007287524) == 1;
					int i_6_ = class330_sub46.readUnsignedTriByte(-1401356047);
					Class330 class330;
					if (bool)
						class330 = new Class330_Sub35(class330_sub46.readString(1217162218));
					else
						class330 = new Class330_Sub23(class330_sub46.readInt((byte) 34));
					((Class330_Sub36_Sub6) this).aClass497_9667.method6097(class330, (long) i_6_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajd.j(").append(')').toString());
		}
	}

	public int method3466(int i, int i_7_, int i_8_) {
		try {
			if (null == ((Class330_Sub36_Sub6) this).aClass497_9667)
				return i_7_;
			Class330_Sub23 class330_sub23 = (Class330_Sub23) ((Class330_Sub36_Sub6) this).aClass497_9667.method6094((long) i);
			if (class330_sub23 == null)
				return i_7_;
			return class330_sub23.anInt7693 * 393599711;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajd.i(").append(')').toString());
		}
	}
}
