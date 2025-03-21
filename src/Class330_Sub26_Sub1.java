/* Class330_Sub26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub26_Sub1 extends Class330_Sub26 {
	Class167 aClass167_9570;
	static int anInt9571;
	int anInt9572 = 1038005557;

	void method3387(Class330_Sub39 class330_sub39) {
		class330_sub39.method3546((((Class330_Sub26_Sub1) this).anInt9572 * -1894495517), -1585005423);
	}

	void method3388(Buffer class330_sub46, int i) {
		try {
			((Class330_Sub26_Sub1) this).anInt9572 = class330_sub46.readUnsignedShort(-385149454) * -1038005557;
			class330_sub46.readUnsignedByte(868548213);
			if (class330_sub46.readUnsignedByte(150295216) != 255) {
				class330_sub46.offset -= 323600977;
				class330_sub46.readLong(646207029);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aih.r(").append(')').toString());
		}
	}

	Class330_Sub26_Sub1(Class167 class167) {
		/* empty */
	}

	void method3392(Class330_Sub39 class330_sub39) {
		class330_sub39.method3546((((Class330_Sub26_Sub1) this).anInt9572 * -1894495517), -1254453081);
	}

	void method3390(Buffer class330_sub46) {
		((Class330_Sub26_Sub1) this).anInt9572 = class330_sub46.readUnsignedShort(1409597823) * -1038005557;
		class330_sub46.readUnsignedByte(93224088);
		if (class330_sub46.readUnsignedByte(913633895) != 255) {
			class330_sub46.offset -= 323600977;
			class330_sub46.readLong(-350686743);
		}
	}

	void method3391(Class330_Sub39 class330_sub39) {
		class330_sub39.method3546((((Class330_Sub26_Sub1) this).anInt9572 * -1894495517), -1499855576);
	}

	void method3389(Class330_Sub39 class330_sub39, int i) {
		try {
			class330_sub39.method3546((((Class330_Sub26_Sub1) this).anInt9572 * -1894495517), -1857134185);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aih.j(").append(')').toString());
		}
	}

	public static int method3395(int i, int i_0_, int i_1_) {
		try {
			i_0_ = (i & 0x7f) * i_0_ >> 7;
			if (i_0_ < 2)
				i_0_ = 2;
			else if (i_0_ > 126)
				i_0_ = 126;
			return i_0_ + (i & 0xff80);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aih.s(").append(')').toString());
		}
	}
}
