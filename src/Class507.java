/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class507 {
	public static Class498 aClass498_5929;
	public static Class498 aClass498_5930;
	static int anInt5931;
	public static Class498 aClass498_5932;
	public static boolean aBoolean5933 = false;
	public static long aLong5934;
	static Class401_Sub1[] aClass401_Sub1Array5935 = new Class401_Sub1[0];
	static int anInt5936 = -1509188514;
	public static Class498 aClass498_5937;
	static Class422 aClass422_5938;
	public static boolean aBoolean5939;
	static Class61[] aClass61Array5940;

	static {
		anInt5931 = 0;
		aClass422_5938 = null;
		aBoolean5939 = false;
	}

	Class507() throws Throwable {
		throw new Error();
	}

	static final void method6152(Class430 class430, int i) {
		try {
			if (client.anInt9182 * -2051927139 >= 2)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = client.anInt9182 * -2051927139;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uy.up(").append(')').toString());
		}
	}

	static final void method6153(Class430 class430, int i) {
		try {
			NPC class432_sub1_sub1_sub1_sub2 = ((NPC) ((Class430) class430).aClass432_Sub1_Sub1_Sub1_4396);
			boolean bool = false;
			Class551 class551 = class432_sub1_sub1_sub1_sub2.aClass551_10251;
			if (null != class551.anIntArray6326)
				class551 = class551.method6371(Class158.aClass561_6474, (byte) 71);
			if (class551 != null)
				bool = class551.aBoolean6329;
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uy.ary(").append(')').toString());
		}
	}

	public static Class214 method6154(Buffer class330_sub46, int i) {
		try {
			int i_0_ = class330_sub46.readUnsignedByte(-72694872);
			Class195 class195 = (Class457.method5665(-1882618819)[class330_sub46.readUnsignedByte(1951832713)]);
			Class211 class211 = (Class7.method412((byte) -93)[class330_sub46.readUnsignedByte(796351783)]);
			int i_1_ = class330_sub46.readShort(-1100583751);
			int i_2_ = class330_sub46.readShort(-1100583751);
			int i_3_ = class330_sub46.readUnsignedShort(-253200869);
			int i_4_ = class330_sub46.readUnsignedShort(1373876325);
			int i_5_ = class330_sub46.readInt((byte) 74);
			int i_6_ = class330_sub46.readInt((byte) 111);
			int i_7_ = class330_sub46.readInt((byte) 27);
			boolean bool = class330_sub46.readUnsignedByte(-60870737) == 1;
			return new Class214(i_0_, class195, class211, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uy.r(").append(')').toString());
		}
	}
}
