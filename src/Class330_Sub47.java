/* Class330_Sub47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class330_Sub47 extends Class330 {
	int[] anIntArray7851;
	int anInt7852;
	int[] anIntArray7853;
	int[] anIntArray7854;
	Field[] aFieldArray7855;
	int anInt7856;
	Method[] aMethodArray7857;
	byte[][][] aByteArrayArrayArray7858;

	Class330_Sub47() {
		/* empty */
	}

	static final void method3829(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_0_, 691450575);
			Class120 class120 = Class3.aClass120Array56[i_0_ >> 16];
			Class367.method4300(iComponentDefinitions, class120, class430, -1955436595);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aec.ov(").append(')').toString());
		}
	}

	static final void method3830(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_2_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 2]);
			Class330_Sub36_Sub4 class330_sub36_sub4 = Class2.aClass523_44.method6233(i_1_, 1287053266);
			if ((class330_sub36_sub4.method3452(i_2_, 1760973362).anInt4048 * 1105478913) != 0)
				throw new RuntimeException("");
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = class330_sub36_sub4.method3453(i_2_, i_3_, (byte) -86);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("aec.adm(").append(')').toString());
		}
	}
}
