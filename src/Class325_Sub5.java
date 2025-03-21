/* Class325_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class325_Sub5 extends Class325 {
	int anInt7487 = (int) (Class312.method3111((byte) 86) / 1000L) * -1811134241;
	String aString7488;
	short aShort7489;

	Class325_Sub5(String string, int i) {
		((Class325_Sub5) this).aString7488 = string;
		((Class325_Sub5) this).aShort7489 = (short) i;
	}

	static final void method3227(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			int i_1_ = client.aClass286Array9234[i_0_].method2868(402539080);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = i_1_ == 5 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("acm.yv(").append(')').toString());
		}
	}
}
