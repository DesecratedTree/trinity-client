/* Class529 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class529 {
	int anInt6218;
	public int anInt6219;
	Class527 aClass527_6220;
	public int anInt6221;

	Class529() {
		/* empty */
	}

	void method6273(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(1399514942);
				if (i_0_ == 0) {
					if (i != 609806336)
						break;
					break;
				}
				method6274(class330_sub46, i_0_, (short) 17671);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vx.r(").append(')').toString());
		}
	}

	void method6274(Buffer class330_sub46, int i, short i_1_) {
		try {
			if (i == 1)
				((Class529) this).anInt6218 = class330_sub46.readBigSmart(-1784916531) * -1295508051;
			else if (i == 2) {
				anInt6219 = class330_sub46.readUnsignedByte(387303657) * -1181019199;
				anInt6221 = class330_sub46.readUnsignedByte(892673228) * 267693007;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vx.j(").append(')').toString());
		}
	}

	public synchronized Class87 method6275(int i) {
		try {
			Class87 class87 = ((Class87) (((Class527) ((Class529) this).aClass527_6220).aClass367_6212.get((long) (((Class529) this).anInt6218 * -1353888219))));
			if (class87 != null)
				return class87;
			class87 = Class53.method643((((Class527) ((Class529) this).aClass527_6220).aClass280_6209), ((Class529) this).anInt6218 * -1353888219, 0);
			if (class87 != null)
				((Class527) ((Class529) this).aClass527_6220).aClass367_6212.put(class87, (long) (-1353888219 * ((Class529) this).anInt6218));
			return class87;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vx.i(").append(')').toString());
		}
	}

	static boolean method6276(int i, byte i_2_) {
		try {
			return i == 11 || 7 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("vx.fs(").append(')').toString());
		}
	}
}
