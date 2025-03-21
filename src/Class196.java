/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class Class196 {
	int anInt1890;
	Object anObject1891;

	Class196(Object object, int i) {
		((Class196) this).anObject1891 = object;
		((Class196) this).anInt1890 = 1540934421 * i;
	}

	public static void method2141(byte i) {
		try {
			int i_0_ = Class297.aLinkedList3050.size();
			Iterator iterator = Class297.aLinkedList3050.iterator();
			while (iterator.hasNext()) {
				Class330_Sub41 class330_sub41 = (Class330_Sub41) iterator.next();
				class330_sub41.method3704(class330_sub41.method3693() + (class330_sub41.method3702() / (2 * i_0_)));
				if (!class330_sub41.method3701())
					iterator.remove();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("id.r(").append(')').toString());
		}
	}

	static final void method2142(Class430 class430, byte i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_1_, -2073890654);
			Class120 class120 = Class3.aClass120Array56[i_1_ >> 16];
			Class170.method2044(iComponentDefinitions, class120, class430, -1191354716);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("id.li(").append(')').toString());
		}
	}

	static final void method2143(Class430 class430, short i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class360.anInt3754 * -1542626275;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("id.ail(").append(')').toString());
		}
	}

	static final void method2144(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1304 = Class288.method2886(string, class430, 1443674303);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("id.mw(").append(')').toString());
		}
	}

	static final void method2145(Class430 class430, int i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, -1009147002);
			Class543.method6343(iComponentDefinitions, class430, 741273024);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("id.cz(").append(')').toString());
		}
	}

	static final void method2146(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, byte i) {
		try {
			iComponentDefinitions.anInt1224 = (((Class430) class430).anIntArray4387[(((Class430) class430).anInt4376 -= -1390004513) * 1632830751]) * 597536557;
			Class404.method4738(iComponentDefinitions, 1700961564);
			if (-790144721 * iComponentDefinitions.anInt1287 == -1 && !class120.aBoolean1402)
				Class330_Sub22.method3377(751119487 * iComponentDefinitions.anInt1196, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("id.ds(").append(')').toString());
		}
	}
}
