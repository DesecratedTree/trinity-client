/* Class425 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class425 {
	public int anInt4327;
	Class418 aClass418_4328;
	int anInt4329;
	public int anInt4330 = 0;
	public int anInt4331 = -967839469;
	public boolean aBoolean4332 = true;
	static int anInt4333 = 1190717;
	public int anInt4334;
	public boolean aBoolean4335;
	public int anInt4336;
	public boolean aBoolean4337;
	public int anInt4338;
	public int anInt4339;
	public int anInt4340 = 1859873227;
	public int anInt4341;
	public int anInt4342;
	public int anInt4343;
	public static Class169 aClass169_4344;

	void method5309(int i) {
		try {
			anInt4341 = 1966701433 * (-1522729271 * anInt4341 << 8 | -1665129361 * ((Class425) this).anInt4329);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rr.i(").append(')').toString());
		}
	}

	void method5310(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(979818548);
				if (i_0_ == 0) {
					if (i <= 64) {
						/* empty */
					}
					break;
				}
				method5311(class330_sub46, i_0_, -374527980);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rr.r(").append(')').toString());
		}
	}

	void method5311(Buffer class330_sub46, int i, int i_1_) {
		try {
			if (i == 1)
				anInt4330 = Class278.method2739(class330_sub46.readUnsignedTriByte(-1401356047), (byte) 24) * 775245033;
			else if (i == 2)
				anInt4331 = class330_sub46.readUnsignedByte(148127650) * 967839469;
			else if (i == 3) {
				anInt4331 = class330_sub46.readUnsignedShort(2085970244) * 967839469;
				if (-946700571 * anInt4331 == 65535)
					anInt4331 = -967839469;
			} else if (i == 5)
				aBoolean4332 = false;
			else if (7 == i)
				anInt4340 = Class278.method2739(class330_sub46.readUnsignedTriByte(-1401356047), (byte) 29) * -1859873227;
			else if (i == 8)
				((Class425) this).aClass418_4328.anInt4294 = -1397529661 * ((Class425) this).anInt4329;
			else if (i == 9)
				anInt4334 = (class330_sub46.readUnsignedShort(909525846) << 2) * -968626881;
			else if (10 == i)
				aBoolean4335 = false;
			else if (i == 11)
				anInt4341 = class330_sub46.readUnsignedByte(1829162676) * 1966701433;
			else if (i == 12)
				aBoolean4337 = true;
			else if (13 == i)
				anInt4336 = class330_sub46.readUnsignedTriByte(-1401356047) * 1358796449;
			else if (14 == i)
				anInt4339 = (class330_sub46.readUnsignedByte(639877792) << 2) * 1947020637;
			else if (16 == i)
				anInt4338 = class330_sub46.readUnsignedByte(266253142) * 594818027;
			else if (i == 20)
				anInt4327 = class330_sub46.readUnsignedShort(427437720) * 641693521;
			else if (i == 21)
				anInt4342 = class330_sub46.readUnsignedByte(866416037) * -1254618995;
			else if (i == 22)
				anInt4343 = class330_sub46.readUnsignedShort(867975750) * -1549934469;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rr.j(").append(')').toString());
		}
	}

	Class425() {
		anInt4334 = -2015724032;
		aBoolean4335 = true;
		anInt4341 = -1446257720;
		aBoolean4337 = false;
		anInt4336 = 2081156957;
		anInt4339 = 55269184;
		anInt4338 = 1354741525;
		anInt4327 = 1771986159;
		anInt4342 = 0;
		anInt4343 = -411558208;
	}

	static final void method5312(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			IOException_Sub1.method339(iComponentDefinitions, class120, class430, -2112709583);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rr.oj(").append(')').toString());
		}
	}
}
