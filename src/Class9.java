/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class9 {
	static int anInt138;
	static boolean aBoolean139;
	static int anInt140;
	static boolean aBoolean141;
	static int anInt142;
	static int[] anIntArray143;
	static int[] anIntArray144;
	static Class471 aClass471_145;
	public static int anInt146;
	static int anInt147 = 48;
	static int[] anIntArray148;
	static boolean aBoolean149;
	static boolean aBoolean150 = false;
	public static int anInt151;
	static Class61 aClass61_152;

	Class9() throws Throwable {
		throw new Error();
	}

	static {
		aBoolean139 = false;
		anInt138 = -744570957;
		anInt142 = 0;
		anIntArray148 = new int[1006];
		anIntArray143 = new int[1003];
		anIntArray144 = new int[1001];
		aClass471_145 = new Class471();
		anInt146 = -192203109;
		anInt151 = -527198423;
		aBoolean141 = true;
		aBoolean149 = false;
		anInt140 = 0;
	}

	static final void method421(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 1379380608);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class24.method485(iComponentDefinitions, class120, class430, (byte) 87);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aj.kk(").append(')').toString());
		}
	}

	static final void method422(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_2_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class214.method2235(i_1_, i_2_, 2122034671) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aj.age(").append(')').toString());
		}
	}

	public static int method423(Random random, int i, byte i_3_) {
		try {
			if (i <= 0)
				throw new IllegalArgumentException();
			if (Class380.method4393(i, 276315040))
				return (int) ((((long) random.nextInt() & 0xffffffffL) * (long) i) >> 32);
			int i_4_ = -2147483648 - (int) (4294967296L % (long) i);
			int i_5_;
			do
				i_5_ = random.nextInt();
			while (i_5_ >= i_4_);
			if (i_3_ == 3) {
				/* empty */
			}
			return Class144.method1667(i_5_, i, (byte) 2);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aj.l(").append(')').toString());
		}
	}
}
