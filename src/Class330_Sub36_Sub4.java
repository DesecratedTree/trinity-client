/* Class330_Sub36_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub36_Sub4 extends Class330_Sub36 {
	Class523 aClass523_9657;
	int[][] anIntArrayArray9658;
	int[] anIntArray9659;
	String[] aStringArray9660;
	public int[] anIntArray9661;
	public boolean aBoolean9662 = true;

	Class330_Sub36_Sub4() {
		/* empty */
	}

	void method3449(Buffer class330_sub46, int i, byte i_0_) {
		try {
			if (1 == i)
				((Class330_Sub36_Sub4) this).aStringArray9660 = Class226.method2309(class330_sub46.readString(1200913188), '<', (byte) -85);
			else if (i == 2) {
				int i_1_ = class330_sub46.readUnsignedByte(889901555);
				anIntArray9661 = new int[i_1_];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
					anIntArray9661[i_2_] = class330_sub46.readUnsignedShort(740945578);
			} else if (3 == i) {
				int i_3_ = class330_sub46.readUnsignedByte(2065498163);
				((Class330_Sub36_Sub4) this).anIntArray9659 = new int[i_3_];
				((Class330_Sub36_Sub4) this).anIntArrayArray9658 = new int[i_3_][];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					int i_5_ = class330_sub46.readUnsignedShort(549215125);
					Class390 class390 = Class146.method1731(i_5_, -1631019388);
					if (null != class390) {
						((Class330_Sub36_Sub4) this).anIntArray9659[i_4_] = i_5_;
						((Class330_Sub36_Sub4) this).anIntArrayArray9658[i_4_] = new int[class390.anInt4039 * 1156769953];
						for (int i_6_ = 0; i_6_ < 1156769953 * class390.anInt4039; i_6_++)
							((Class330_Sub36_Sub4) this).anIntArrayArray9658[i_4_][i_6_] = class330_sub46.readUnsignedShort(-7689393);
					}
				}
			} else if (4 == i)
				aBoolean9662 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.j(").append(')').toString());
		}
	}

	public void method3450(Buffer class330_sub46, int[] is, byte i) {
		try {
			if (((Class330_Sub36_Sub4) this).anIntArray9659 != null) {
				for (int i_7_ = 0; (i_7_ < ((Class330_Sub36_Sub4) this).anIntArray9659.length && i_7_ < is.length); i_7_++) {
					int i_8_ = method3452(i_7_, -1229205941).anInt4049 * -521453745;
					if (i_8_ > 0)
						class330_sub46.method3747((long) is[i_7_], i_8_, (byte) -103);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.i(").append(')').toString());
		}
	}

	public String method3451(byte i) {
		try {
			StringBuilder stringbuilder = new StringBuilder(80);
			if (((Class330_Sub36_Sub4) this).aStringArray9660 == null)
				return "";
			stringbuilder.append(((Class330_Sub36_Sub4) this).aStringArray9660[0]);
			for (int i_9_ = 1; i_9_ < ((Class330_Sub36_Sub4) this).aStringArray9660.length; i_9_++) {
				for (int i_10_ = 0; i_10_ < 3; i_10_++)
					stringbuilder.append('.');
				stringbuilder.append(((Class330_Sub36_Sub4) this).aStringArray9660[i_9_]);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.o(").append(')').toString());
		}
	}

	public Class390 method3452(int i, int i_11_) {
		try {
			if (((Class330_Sub36_Sub4) this).anIntArray9659 == null || i < 0 || i > ((Class330_Sub36_Sub4) this).anIntArray9659.length)
				return null;
			return Class146.method1731((((Class330_Sub36_Sub4) this).anIntArray9659[i]), -1792326722);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.f(").append(')').toString());
		}
	}

	public int method3453(int i, int i_12_, byte i_13_) {
		try {
			if (null == ((Class330_Sub36_Sub4) this).anIntArray9659 || i < 0 || i > ((Class330_Sub36_Sub4) this).anIntArray9659.length)
				return -1;
			if (((Class330_Sub36_Sub4) this).anIntArrayArray9658[i] == null || i_12_ < 0 || i_12_ > (((Class330_Sub36_Sub4) this).anIntArrayArray9658[i]).length)
				return -1;
			return ((Class330_Sub36_Sub4) this).anIntArrayArray9658[i][i_12_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.z(").append(')').toString());
		}
	}

	void method3454(int i) {
		try {
			if (anIntArray9661 != null) {
				for (int i_14_ = 0; i_14_ < anIntArray9661.length; i_14_++)
					anIntArray9661[i_14_] |= 0x8000;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.w(").append(')').toString());
		}
	}

	public int method3455(int i) {
		try {
			if (null == ((Class330_Sub36_Sub4) this).anIntArray9659)
				return 0;
			return ((Class330_Sub36_Sub4) this).anIntArray9659.length;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.s(").append(')').toString());
		}
	}

	void method3456(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_15_ = class330_sub46.readUnsignedByte(652498462);
				if (0 == i_15_) {
					if (i <= 0) {
						/* empty */
					}
					break;
				}
				method3449(class330_sub46, i_15_, (byte) 14);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.r(").append(')').toString());
		}
	}

	public String method3457(Buffer class330_sub46, int i) {
		try {
			StringBuilder stringbuilder = new StringBuilder(80);
			if (null != ((Class330_Sub36_Sub4) this).anIntArray9659) {
				for (int i_16_ = 0; (i_16_ < ((Class330_Sub36_Sub4) this).anIntArray9659.length); i_16_++) {
					stringbuilder.append(((Class330_Sub36_Sub4) this).aStringArray9660[i_16_]);
					stringbuilder.append(((Class330_Sub36_Sub4) this).aClass523_9657.method6232(method3452(i_16_, -1161912705), (((Class330_Sub36_Sub4) this).anIntArrayArray9658[i_16_]), class330_sub46.method3759((Class146.method1731((((Class330_Sub36_Sub4) this).anIntArray9659[i_16_]), 1758375864).anInt4050) * -1506999799, 1674049190)));
				}
			}
			stringbuilder.append(((Class330_Sub36_Sub4) this).aStringArray9660[(((Class330_Sub36_Sub4) this).aStringArray9660).length - 1]);
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aja.p(").append(')').toString());
		}
	}
}
