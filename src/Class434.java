/* Class434 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class434 implements Interface12 {
	static Class61[] aClass61Array6559;
	public static IndexTable aClass280_6560;

	public Object method170(byte[] is, Class524 class524, boolean bool, int i) {
		try {
			return Class361.aClass_ra3793.ce(class524, ((Class87_Sub2[]) Class53.method639(is)), bool);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("s.r(").append(')').toString());
		}
	}

	public Object method172(byte[] is, Class524 class524, boolean bool) {
		return Class361.aClass_ra3793.ce(class524, (Class87_Sub2[]) Class53.method639(is), bool);
	}

	public Object method171(byte[] is, Class524 class524, boolean bool) {
		return Class361.aClass_ra3793.ce(class524, (Class87_Sub2[]) Class53.method639(is), bool);
	}

	public static Class351 method5563(IndexTable class280, String string, boolean bool, byte i) {
		try {
			int i_0_ = class280.method2754(string, 323600977);
			if (i_0_ == -1)
				return new Class351(0);
			int[] is = class280.method2762(i_0_, (byte) -88);
			Class351 class351 = new Class351(is.length);
			int i_1_ = 0;
			int i_2_ = 0;
			while (i_1_ < 733593777 * class351.anInt3479) {
				Buffer class330_sub46 = new Buffer(class280.getFile(i_0_, is[i_2_++]));
				int i_3_ = class330_sub46.readInt((byte) 16);
				int i_4_ = class330_sub46.readUnsignedShort(1103021742);
				int i_5_ = class330_sub46.readUnsignedByte(1231139689);
				if (bool || 1 != i_5_) {
					class351.anIntArray3480[i_1_] = i_3_;
					class351.anIntArray3481[i_1_] = i_4_;
					i_1_++;
				} else
					class351.anInt3479 -= 278693969;
			}
			return class351;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("s.r(").append(')').toString());
		}
	}

	public static final boolean method5564(int i) {
		try {
			return Class360.anInt3769 * 97356391 != 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("s.s(").append(')').toString());
		}
	}

	static final void method5565(Class430 class430, byte i) throws Exception_Sub4 {
		try {
			((Class430) class430).anInt4376 -= -1265050756;
			int i_6_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_7_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376 + 1]);
			int i_8_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			Class260 class260 = Class260.method2577((float) i_6_, (float) i_7_, (float) i_8_);
			Class401_Sub1.aClass145_Sub1_8249.method1716(class260, 1090972539);
			class260.method2550();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("s.aif(").append(')').toString());
		}
	}

	public static final void method5566(byte i) {
		try {
			if (!client.aBoolean9074) {
				client.aFloat9124 += (-12.0F - client.aFloat9124) / 2.0F;
				client.aBoolean9038 = true;
				client.aBoolean9074 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("s.ht(").append(')').toString());
		}
	}

	static final void method5567(Class430 class430, int i) {
		try {
			if (client.aBoolean9198)
				Class232.aClass232_2455.method2357(1777116072);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("s.apx(").append(')').toString());
		}
	}
}
