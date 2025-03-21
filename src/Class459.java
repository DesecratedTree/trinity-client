/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class459 {
	static Class367 aClass367_5566 = new Class367(32);
	static int anInt5567;

	Class459() throws Throwable {
		throw new Error();
	}

	static final void method5672(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = (Class556.aClass510_6392.getItemDefinitions(i_0_, (byte) -27).anInt6714) * 2017047135;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("t.abi(").append(')').toString());
		}
	}

	static final void method5673(Class430 class430, byte i) {
		try {
			((Class430) class430).anInt4378 -= -119156554;
			String string = (String) (((Class430) class430).anObjectArray4386[((Class430) class430).anInt4378 * -1378875437]);
			String string_1_ = ((String) (((Class430) class430).anObjectArray4386[1 + -1378875437 * ((Class430) class430).anInt4378]));
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_3_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751 + 1]);
			if (string_1_ == null)
				string_1_ = "";
			if (string_1_.length() > 80)
				string_1_ = string_1_.substring(0, 80);
			Class1 class1 = Class426.method5317(2006112440);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2545, class1.aClass488_22, 1536146643);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte((Class57.method659(string, -1666314798) + 2 + Class57.method659(string_1_, -1666390519)), (byte) 49);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -29);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i_2_ - 1, (byte) 8);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i_3_, (byte) 43);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string_1_, (byte) 0);
			class1.method378(class330_sub34, -486173055);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("t.acm(").append(')').toString());
		}
	}
}
