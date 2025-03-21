/* Class428 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;

public final class Class428 {
	static ArrayList anArrayList4351;
	static int anInt4352 = 2000000;
	static int anInt4353 = 0;
	static int[] anIntArray4354 = new int[3];
	public static Class367 aClass367_4355 = new Class367(4);
	static int anInt4356 = 200000;
	static boolean aBoolean4357;
	static String aString4358;
	static Class260[] aClass260Array4359 = new Class260[2];
	static int anInt4360;
	static int anInt4361;
	public static IndexTable aClass280_4362;
	public static Class540 aClass540_4363;
	public static Class370 aClass370_4364;

	Class428() throws Throwable {
		throw new Error();
	}

	static {
		aBoolean4357 = false;
		aString4358 = null;
		anArrayList4351 = new ArrayList();
		anInt4360 = 0;
		anInt4361 = 0;
	}

	static final void method5323(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = client.anIntArray9143[i_0_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ru.ta(").append(')').toString());
		}
	}

	public static int method5324(int i, int i_1_, int i_2_) {
		try {
			if (i_1_ > i) {
				int i_3_ = i;
				i = i_1_;
				i_1_ = i_3_;
			}
			int i_4_;
			for (/**/; i_1_ != 0; i_1_ = i_4_) {
				i_4_ = i % i_1_;
				i = i_1_;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ru.j(").append(')').toString());
		}
	}
}
