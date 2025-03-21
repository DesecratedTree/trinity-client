/* Class537 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class537 {
	char aChar6234;
	public int anInt6235;
	public String aString6236;
	public boolean aBoolean6237 = true;
	static int anInt6238;

	void method6320(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(1015577442);
				if (i_0_ == 0) {
					if (i != 1) {
						/* empty */
					}
					break;
				}
				method6322(class330_sub46, i_0_, (byte) -69);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wg.r(").append(')').toString());
		}
	}

	public boolean method6321(byte i) {
		try {
			return ((Class537) this).aChar6234 == 's';
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wg.i(").append(')').toString());
		}
	}

	Class537() {
		/* empty */
	}

	void method6322(Buffer class330_sub46, int i, byte i_1_) {
		try {
			if (1 == i)
				((Class537) this).aChar6234 = Class127.method1546(class330_sub46.readByte((byte) -63), -2019015116);
			else if (2 == i)
				anInt6235 = class330_sub46.readInt((byte) 121) * 139081963;
			else if (i == 4)
				aBoolean6237 = false;
			else if (i == 5)
				aString6236 = class330_sub46.readString(-793671361);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wg.j(").append(')').toString());
		}
	}

	static final void method6323(Class330_Sub46_Sub2 class330_sub46_sub2, int i, int i_2_) {
		try {
			Class15.anInt197 = 0;
			Class383.method4414(class330_sub46_sub2, 1315716352);
			Class76_Sub2.method912(class330_sub46_sub2, (byte) 13);
			if (i != class330_sub46_sub2.offset * -824785231)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wg.j(").append(')').toString());
		}
	}
}
