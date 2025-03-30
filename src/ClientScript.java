/* ClientScript - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClientScript extends Class330_Sub36 {
	public Class445[] aClass445Array9670;
	public int anInt9671;
	public int anInt9672;
	public int[] anIntArray9673;
	public Object[] anObjectArray9674;
	public long[] aLongArray9675;
	public int anInt9676;
	public int anInt9677;
	public int anInt9678;
	public Class545 aClass545_9679;
	public int anInt9680;
	public String aString9681;
	public Class497[] aClass497Array9682;

	Class445 method3472(Buffer class330_sub46, Class445[] class445s, int i) {
		try {
			int i_0_ = class330_sub46.readUnsignedShort(822296001);
			if (i_0_ < 0 || i_0_ >= class445s.length)
				throw new RuntimeException("");
			Class445 class445 = class445s[i_0_];
			return class445;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajg.r(").append(')').toString());
		}
	}

	int method3473(Buffer class330_sub46, int i) {
		try {
			class330_sub46.offset = 323600977 * (class330_sub46.payload.length - 2);
			int i_1_ = class330_sub46.readUnsignedShort(992975005);
			int i_2_ = class330_sub46.payload.length - 2 - i_1_ - 16;
			class330_sub46.offset = 323600977 * i_2_;
			int i_3_ = class330_sub46.readInt((byte) 35);
			anInt9676 = class330_sub46.readUnsignedShort(790112023) * -1802250417;
			anInt9672 = class330_sub46.readUnsignedShort(710005760) * -1988157471;
			anInt9671 = class330_sub46.readUnsignedShort(679445045) * -241375951;
			anInt9678 = class330_sub46.readUnsignedShort(249909246) * 67599873;
			anInt9680 = class330_sub46.readUnsignedShort(625984341) * 120928055;
			anInt9677 = class330_sub46.readUnsignedShort(-347350395) * -34778105;
			int i_4_ = class330_sub46.readUnsignedByte(1009079752);
			if (i_4_ > 0) {
				aClass497Array9682 = new Class497[i_4_];
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					int i_6_ = class330_sub46.readUnsignedShort(-275180063);
					Class497 class497 = new Class497(Class136.method1594(i_6_, 1549187435));
					aClass497Array9682[i_5_] = class497;
					while (i_6_-- > 0) {
						int i_7_ = class330_sub46.readInt((byte) 103);
						int i_8_ = class330_sub46.readInt((byte) 100);
						class497.method6097(new Class330_Sub23(i_8_), (long) i_7_);
					}
				}
			}
			class330_sub46.offset = 0;
			aString9681 = class330_sub46.method3761(1849010562);
			aClass445Array9670 = new Class445[i_3_];
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajg.j(").append(')').toString());
		}
	}

	void method3474(Buffer class330_sub46, int i, Class445 class445, int i_9_) {
		try {
			int i_10_ = aClass445Array9670.length;
			if (class445 == Class445.aClass445_4559) {
				if (anObjectArray9674 == null)
					anObjectArray9674 = new String[i_10_];
				String string = class330_sub46.readString(1105217997);
				anObjectArray9674[i] = string.intern();
			} else if (class445 == Class445.aClass445_4531) {
				if (aLongArray9675 == null)
					aLongArray9675 = new long[i_10_];
				aLongArray9675[i] = class330_sub46.readLong(-877579005);
			} else {
				if (anIntArray9673 == null)
					anIntArray9673 = new int[i_10_];
				if (class445.aBoolean5544)
					anIntArray9673[i] = class330_sub46.readInt((byte) 73);
				else
					anIntArray9673[i] = class330_sub46.readUnsignedByte(502594360);
			}
			aClass445Array9670[i] = class445;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ajg.i(").append(')').toString());
		}
	}

	public ClientScript(Buffer class330_sub46) {
		int i = method3473(class330_sub46, 168562736);
		int i_11_ = 0;
		Class445[] class445s = Class111_Sub1.method1370(-2135202728);
		while (-824785231 * class330_sub46.offset < i) {
			Class445 class445 = method3472(class330_sub46, class445s, 186278129);
			method3474(class330_sub46, i_11_, class445, -2057980928);
			i_11_++;
		}
	}
}
