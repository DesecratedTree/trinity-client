/* Class330_Sub36_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub36_Sub13 extends Class330_Sub36 {
	int anInt9715;
	Class472 aClass472_9716;
	String aString9717;

	int method3485(byte i) {
		try {
			if ((((Class330_Sub36_Sub13) this).aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735) != (((Class330_Sub36_Sub13) this).aClass472_9716.aClass330_Sub36_5613))
				return ((((Class330_Sub36_Sub10) (Class330_Sub36_Sub10) (((Class330_Sub36_Sub13) this).aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735)).anInt9699) * 400571611);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajq.r(").append(')').toString());
		}
	}

	boolean method3486(Class330_Sub36_Sub10 class330_sub36_sub10, int i) {
		try {
			boolean bool = true;
			class330_sub36_sub10.method3439((byte) 0);
			Class330_Sub36_Sub10 class330_sub36_sub10_0_ = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) this).aClass472_9716.method5884((byte) 71));
			while (class330_sub36_sub10_0_ != null) {
				if (Class232.method2361((((Class330_Sub36_Sub10) class330_sub36_sub10).anInt9699 * 400571611), 400571611 * (((Class330_Sub36_Sub10) class330_sub36_sub10_0_).anInt9699), 1853612053)) {
					Class333.method3930(class330_sub36_sub10, class330_sub36_sub10_0_, 2142166849);
					((Class330_Sub36_Sub13) this).anInt9715 += 1396496197;
					return !bool;
				}
				class330_sub36_sub10_0_ = (Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) this).aClass472_9716.method5886((short) 8192);
				bool = false;
			}
			((Class330_Sub36_Sub13) this).aClass472_9716.method5883(class330_sub36_sub10, -2073976774);
			((Class330_Sub36_Sub13) this).anInt9715 += 1396496197;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajq.j(").append(')').toString());
		}
	}

	boolean method3487(Class330_Sub36_Sub10 class330_sub36_sub10, byte i) {
		try {
			int i_1_ = method3485((byte) -17);
			class330_sub36_sub10.method3439((byte) -87);
			((Class330_Sub36_Sub13) this).anInt9715 -= 1396496197;
			if (0 == -213703795 * ((Class330_Sub36_Sub13) this).anInt9715) {
				method3252(-170886213);
				method3439((byte) -51);
				Class484.anInt5790 -= 219833981;
				Class484.aClass367_5796.put(this, (3393282222834386213L * (((Class330_Sub36_Sub10) class330_sub36_sub10).aLong9695)));
				return false;
			}
			return i_1_ != method3485((byte) -90);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajq.i(").append(')').toString());
		}
	}

	Class330_Sub36_Sub13(String string) {
		((Class330_Sub36_Sub13) this).aString9717 = string;
		((Class330_Sub36_Sub13) this).aClass472_9716 = new Class472();
	}
}
