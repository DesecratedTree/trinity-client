/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class336 implements Interface19 {
	Class432_Sub1_Sub1_Sub3 aClass432_Sub1_Sub1_Sub3_6651;
	static IndexTable aClass280_6652;

	Class336(Class432_Sub1_Sub1_Sub3 class432_sub1_sub1_sub3) {
		((Class336) this).aClass432_Sub1_Sub1_Sub3_6651 = class432_sub1_sub1_sub3;
	}

	public boolean method279(Class432_Sub1_Sub1 class432_sub1_sub1, int i) {
		try {
			return (class432_sub1_sub1 == ((Class336) this).aClass432_Sub1_Sub1_Sub3_6651);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nz.r(").append(')').toString());
		}
	}

	public boolean method280(Class432_Sub1_Sub1 class432_sub1_sub1) {
		return (class432_sub1_sub1 == ((Class336) this).aClass432_Sub1_Sub1_Sub3_6651);
	}

	public boolean method281(Class432_Sub1_Sub1 class432_sub1_sub1) {
		return (class432_sub1_sub1 == ((Class336) this).aClass432_Sub1_Sub1_Sub3_6651);
	}

	public boolean method278(Class432_Sub1_Sub1 class432_sub1_sub1) {
		return (class432_sub1_sub1 == ((Class336) this).aClass432_Sub1_Sub1_Sub3_6651);
	}

	static Class384 method3943(int i, int i_0_) {
		try {
			Class384[] class384s = Class112.method1373(-314133676);
			for (int i_1_ = 0; i_1_ < class384s.length; i_1_++) {
				Class384 class384 = class384s[i_1_];
				if (((Class384) class384).anInt3966 * 207672829 == i)
					return class384;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nz.j(").append(')').toString());
		}
	}

	public static void method3944(Player class432_sub1_sub1_sub1_sub1, int i, int i_2_, int i_3_) {
		try {
			int[] is = new int[Class487_Sub1.method6040(1981547477).length];
			Arrays.fill(is, 0, is.length, i);
			Class150_Sub2.method1772(class432_sub1_sub1_sub1_sub1, is, i_2_, false, (byte) -59);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nz.io(").append(')').toString());
		}
	}

	static Buffer method3945(byte i) {
		try {
			Buffer class330_sub46 = new Buffer(518);
			Canvas_Sub1.anIntArray10 = new int[4];
			Canvas_Sub1.anIntArray10[0] = (int) (Math.random() * 9.9999999E7);
			Canvas_Sub1.anIntArray10[1] = (int) (Math.random() * 9.9999999E7);
			Canvas_Sub1.anIntArray10[2] = (int) (Math.random() * 9.9999999E7);
			Canvas_Sub1.anIntArray10[3] = (int) (Math.random() * 9.9999999E7);
			class330_sub46.addByte(10, (byte) 103);
			class330_sub46.addInt(Canvas_Sub1.anIntArray10[0], 1965508160);
			class330_sub46.addInt(Canvas_Sub1.anIntArray10[1], 1965508160);
			class330_sub46.addInt(Canvas_Sub1.anIntArray10[2], 1965508160);
			class330_sub46.addInt(Canvas_Sub1.anIntArray10[3], 1965508160);
			return class330_sub46;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nz.t(").append(')').toString());
		}
	}

	static final void method3946(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class117 class117 = Class144.method1668(i_4_, (byte) 16);
			int i_5_ = -1;
			if (null != class117)
				i_5_ = class117.anInt1379 * -906696899;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("nz.acj(").append(')').toString());
		}
	}
}
