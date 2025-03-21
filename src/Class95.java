/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class95 {
	public int anInt851;

	public abstract void method1095(int i);

	void method1096(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.i(").append(')').toString());
		}
	}

	boolean method1097(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.p(").append(')').toString());
		}
	}

	Class95(Buffer class330_sub46) {
		anInt851 = class330_sub46.readUnsignedShort(1646851144) * 1175718863;
	}

	public abstract void method1098();

	public abstract void method1099();

	public abstract void method1100();

	public static IComponentDefinitions method1101(int i, int i_0_) {
		try {
			int i_1_ = i >> 16;
			if (Class3.aClass120Array56[i_1_] == null || (Class3.aClass120Array56[i_1_].method1440(i, (byte) -8) == null)) {
				boolean bool = Class397_Sub1.method4681(i_1_, null, -2075253874);
				if (!bool)
					return null;
			}
			return Class3.aClass120Array56[i_1_].method1440(i, (byte) 15);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.j(").append(')').toString());
		}
	}

	static final void method1102(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4394[-54918871 * ((Class430) class430).anInt4397]);
			int i_3_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (i_3_ < 0 || i_3_ >= ((Class430) class430).anIntArray4373[i_2_])
				throw new RuntimeException();
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).anIntArrayArray4374[i_2_][i_3_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.am(").append(')').toString());
		}
	}

	static final void method1103(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class439.method5599(iComponentDefinitions, class120, true, 1, class430, (byte) 69);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.hp(").append(')').toString());
		}
	}

	static final void method1104(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub1.method3442(i_4_, 51521806);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.aet(").append(')').toString());
		}
	}

	static void method1105(int i, int i_5_, byte i_6_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(17, (long) i);
			class330_sub36_sub3.method3445((byte) 0);
			((Class330_Sub36_Sub3) class330_sub36_sub3).anInt9629 = i_5_ * 229745735;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.ae(").append(')').toString());
		}
	}

	static final boolean method1106(char c, byte i) {
		try {
			if (Character.isISOControl(c))
				return false;
			if (Class263.method2614(c, -1633725316))
				return true;
			char[] cs = Class554.aCharArray6377;
			for (int i_7_ = 0; i_7_ < cs.length; i_7_++) {
				char c_8_ = cs[i_7_];
				if (c == c_8_)
					return true;
			}
			cs = Class554.aCharArray6374;
			for (int i_9_ = 0; i_9_ < cs.length; i_9_++) {
				char c_10_ = cs[i_9_];
				if (c == c_10_)
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("dw.j(").append(')').toString());
		}
	}
}
