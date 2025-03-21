/* Class542 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class542 {
	public Interface10[] anInterface10Array6250;
	static int anInt6251;

	Interface10 method6334(Buffer class330_sub46, Class198 class198, byte i) {
		try {
			if (class198 == Class198.aClass198_1915)
				return Class170.method2038(class330_sub46, (short) -18889);
			if (Class198.aClass198_1919 == class198)
				return Class429.method5328(class330_sub46, -2141656043);
			if (class198 == Class198.aClass198_1918)
				return Class507.method6154(class330_sub46, 19415266);
			if (Class198.aClass198_1916 == class198)
				return Class69.method800(class330_sub46, (byte) 11);
			if (Class198.aClass198_1920 == class198)
				return Class511.method6177(class330_sub46, -1604289230);
			if (Class198.aClass198_1922 == class198)
				return Class13.method441(class330_sub46, (byte) 1);
			if (class198 == Class198.aClass198_1917)
				return Class137.method1602(class330_sub46, (byte) -51);
			if (class198 == Class198.aClass198_1921)
				return Class103.method1231(class330_sub46, 2045966557);
			if (class198 == Class198.aClass198_1914)
				return Class418.method5274(class330_sub46, 6422146);
			if (class198 == Class198.aClass198_1923)
				return Class464_Sub10.method5774(class330_sub46, -664606417);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wl.j(").append(')').toString());
		}
	}

	Class542() {
		/* empty */
	}

	void method6335(Buffer class330_sub46, int i) {
		try {
			anInterface10Array6250 = new Interface10[class330_sub46.readUnsignedByte(451114767)];
			Class198[] class198s = Class477.method5991(-1197746030);
			for (int i_0_ = 0; i_0_ < anInterface10Array6250.length; i_0_++)
				anInterface10Array6250[i_0_] = method6334(class330_sub46, (class198s[class330_sub46.readUnsignedByte(-300090015)]), (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wl.r(").append(')').toString());
		}
	}

	static final void method6336(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			iComponentDefinitions.anInt1259 = ((((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]) * 1884775635);
			iComponentDefinitions.anInt1340 = (-357216429 * (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]));
			Class404.method4738(iComponentDefinitions, 501971637);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wl.iz(").append(')').toString());
		}
	}

	static final void method6337(Class430 class430, byte i) {
		try {
			int i_1_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (-843487341 * client.anInt9257 == 2 && i_1_ < client.anInt9256 * 652732387) {
				Class99 class99 = client.aClass99Array9259[i_1_];
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = class99.aString915;
				if (class99.aString910 != null)
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = class99.aString910;
				else
					((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			} else {
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wl.vo(").append(')').toString());
		}
	}

	static final void method6338(Class430 class430, byte i) {
		try {
			int i_2_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_2_, 962911393);
			Class376.method4360(iComponentDefinitions, class430, (byte) 25);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wl.qi(").append(')').toString());
		}
	}
}
