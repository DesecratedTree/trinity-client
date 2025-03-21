/* Class547 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class547 implements Interface26 {
	int anInt6916;
	static Class547 aClass547_6917;
	String aString6918;
	int anInt6919;
	static Class547 aClass547_6920;
	static Class547 aClass547_6921;
	static Class547 aClass547_6922;
	static Class547 aClass547_6923;
	static Class547 aClass547_6924;
	static Class547 aClass547_6925 = new Class547(3, 0, "", "");
	static Class547 aClass547_6926;

	public int method298() {
		return 2028089311 * ((Class547) this).anInt6919;
	}

	public String toString() {
		try {
			return ((Class547) this).aString6918;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wq.toString(").append(')').toString());
		}
	}

	public int method297(short i) {
		try {
			return 2028089311 * ((Class547) this).anInt6919;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wq.j(").append(')').toString());
		}
	}

	static {
		aClass547_6917 = new Class547(2, 1, "", "");
		aClass547_6926 = new Class547(5, 2, "", "");
		aClass547_6924 = new Class547(0, 3, "", "");
		aClass547_6920 = new Class547(6, 4, "", "");
		aClass547_6921 = new Class547(7, 5, "", "");
		aClass547_6922 = new Class547(1, 6, "", "");
		aClass547_6923 = new Class547(4, -1, "", "", true, new Class547[] { aClass547_6925, aClass547_6917, aClass547_6926, aClass547_6920, aClass547_6924 });
	}

	Class547(int i, int i_0_, String string, String string_1_) {
		((Class547) this).anInt6916 = -421330253 * i;
		((Class547) this).anInt6919 = -564507617 * i_0_;
		((Class547) this).aString6918 = string_1_;
	}

	Class547(int i, int i_2_, String string, String string_3_, boolean bool, Class547[] class547s) {
		((Class547) this).anInt6916 = -421330253 * i;
		((Class547) this).anInt6919 = i_2_ * -564507617;
		((Class547) this).aString6918 = string_3_;
	}

	public int method299() {
		return 2028089311 * ((Class547) this).anInt6919;
	}

	public int method300() {
		return 2028089311 * ((Class547) this).anInt6919;
	}

	public int method301() {
		return 2028089311 * ((Class547) this).anInt6919;
	}

	static final void method6355(Class430 class430, byte i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub12 class330_sub36_sub12 = Class430.method5334(-2029779553);
			if (class330_sub36_sub12 != null) {
				boolean bool = class330_sub36_sub12.method3484(i_4_ >> 28 & 0x3, i_4_ >> 14 & 0x3fff, i_4_ & 0x3fff, Class428.anIntArray4354, (byte) -49);
				if (bool) {
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class428.anIntArray4354[1];
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class428.anIntArray4354[2];
				} else {
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
					((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
				}
			} else {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = -1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wq.aeq(").append(')').toString());
		}
	}

	static final void method6356(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_5_, -953562421);
			Class330_Sub31.method3416(iComponentDefinitions, class430, 1521606820);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wq.qc(").append(')').toString());
		}
	}
}
