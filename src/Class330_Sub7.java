/* Class330_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class330_Sub7 extends Class330 {
	int anInt7545;
	int anInt7546 = 196472291;
	int anInt7547;
	int anInt7548;
	int anInt7549;
	int anInt7550;
	int anInt7551;
	Class330_Sub38 aClass330_Sub38_7552;
	int anInt7553 = -2147483648;

	Class330_Sub7(Class330_Sub38 class330_sub38) {
		((Class330_Sub7) this).anInt7548 = 1197013897;
		((Class330_Sub7) this).anInt7545 = -2147483648;
		((Class330_Sub7) this).anInt7549 = 788488009;
		((Class330_Sub7) this).anInt7550 = -2147483648;
		((Class330_Sub7) this).anInt7551 = 3368391;
		((Class330_Sub7) this).anInt7547 = -2147483648;
		((Class330_Sub7) this).aClass330_Sub38_7552 = class330_sub38;
	}

	boolean method3277(int i, int i_0_, short i_1_) {
		try {
			if (i >= ((Class330_Sub7) this).anInt7546 * 1329545269 && i <= 1792702053 * ((Class330_Sub7) this).anInt7553 && i_0_ >= ((Class330_Sub7) this).anInt7548 * 1076892999 && i_0_ <= -561854613 * ((Class330_Sub7) this).anInt7545)
				return true;
			if (i >= 1657814279 * ((Class330_Sub7) this).anInt7549 && i <= 29673353 * ((Class330_Sub7) this).anInt7550 && i_0_ >= ((Class330_Sub7) this).anInt7551 * -2108476407 && i_0_ <= 927636797 * ((Class330_Sub7) this).anInt7547)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ack.r(").append(')').toString());
		}
	}

	static final void method3278(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			float f = Class257.method2541(((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 * 1632830751) + 1]);
			Class330_Sub36_Sub15 class330_sub36_sub15 = Class401_Sub1.aClass145_Sub1_8249.method1685(i_2_, 589484696);
			if (class330_sub36_sub15 == null)
				throw new RuntimeException("");
			if (!(class330_sub36_sub15 instanceof Class330_Sub36_Sub15_Sub1))
				throw new RuntimeException("");
			((Class330_Sub36_Sub15_Sub1) class330_sub36_sub15).method3503(f, 1464804253);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ack.ais(").append(')').toString());
		}
	}
}
