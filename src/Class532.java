/* Class532 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class532 implements Interface4 {
	static Class78 aClass78_6455;

	public Interface6 method63(Class128 class128, int i) {
		if (class128 == Class128.aClass128_1477)
			return client.players[i];
		if (class128 == Class128.aClass128_1475) {
			Class330_Sub35 class330_sub35 = (Class330_Sub35) client.aClass497_9014.method6094((long) i);
			if (null != class330_sub35)
				return (Interface6) class330_sub35.anObject7733;
		}
		return null;
	}

	Class532() {
		/* empty */
	}

	public Interface6 method62(Class128 class128, int i) {
		if (class128 == Class128.aClass128_1477)
			return client.players[i];
		if (class128 == Class128.aClass128_1475) {
			Class330_Sub35 class330_sub35 = (Class330_Sub35) client.aClass497_9014.method6094((long) i);
			if (null != class330_sub35)
				return (Interface6) class330_sub35.anObject7733;
		}
		return null;
	}

	public Interface6 method64(Class128 class128, int i) {
		if (class128 == Class128.aClass128_1477)
			return client.players[i];
		if (class128 == Class128.aClass128_1475) {
			Class330_Sub35 class330_sub35 = (Class330_Sub35) client.aClass497_9014.method6094((long) i);
			if (null != class330_sub35)
				return (Interface6) class330_sub35.anObject7733;
		}
		return null;
	}

	public Interface6 method65(Class128 class128, int i, byte i_0_) {
		try {
			if (class128 == Class128.aClass128_1477)
				return client.players[i];
			if (class128 == Class128.aClass128_1475) {
				Class330_Sub35 class330_sub35 = ((Class330_Sub35) client.aClass497_9014.method6094((long) i));
				if (null != class330_sub35)
					return (Interface6) class330_sub35.anObject7733;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("w.r(").append(')').toString());
		}
	}

	static boolean method6299(byte i) {
		try {
			boolean bool = true;
			if (null == Class536.aClass87_6233) {
				if (Class540.aClass280_6249.method2750((704389311 * Class221.anInt6674), -1278095955))
					Class536.aClass87_6233 = Class53.method640(Class540.aClass280_6249, 704389311 * Class221.anInt6674);
				else
					bool = false;
			}
			if (Class18.aClass87_235 == null) {
				if (Class540.aClass280_6249.method2750((1662799857 * Class362.anInt3796), -1724500745))
					Class18.aClass87_235 = Class53.method640(Class540.aClass280_6249, 1662799857 * Class362.anInt3796);
				else
					bool = false;
			}
			if (Class13.aClass87_174 == null) {
				if (Class540.aClass280_6249.method2750((Exception_Sub2.anInt14 * -1467908975), -854415424))
					Class13.aClass87_174 = Class53.method640(Class540.aClass280_6249, (Exception_Sub2.anInt14 * -1467908975));
				else
					bool = false;
			}
			if (null == Class18.aClass524_236) {
				if (Class484.aClass280_5822.method2750((Class95_Sub18.anInt7196 * -1358048799), -1615231295))
					Class18.aClass524_236 = Class375.method4356(Class484.aClass280_5822, (-1358048799 * Class95_Sub18.anInt7196), -1641316415);
				else
					bool = false;
			}
			if (Class366.aClass87_Sub2Array3857 == null) {
				if (Class540.aClass280_6249.method2750((Class95_Sub18.anInt7196 * -1358048799), -389649851))
					Class366.aClass87_Sub2Array3857 = ((Class87_Sub2[]) Class53.method642(Class540.aClass280_6249, (Class95_Sub18.anInt7196 * -1358048799)));
				else
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("w.j(").append(')').toString());
		}
	}

	public static void openLink(String string, boolean bool, boolean bool_1_, boolean bool_2_, boolean bool_3_, int i) {
		try {
			if (string.contains("passwordchoice.ws"))
				string = "http://elveron.org/community/index.php?app=core&module=global&section=lostpass";
			Class562.method6471(string, bool, bool_1_, "openjs", bool_2_, bool_3_, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("w.r(").append(')').toString());
		}
	}

	static final void method6301(Class430 class430, int i) {
		try {
			int i_4_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			if (-843487341 * client.anInt9257 != 0 && i_4_ < -1187306419 * client.anInt9261)
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = client.aClass75Array8982[i_4_].aString646;
			else
				((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("w.xp(").append(')').toString());
		}
	}

	static void method6302(byte i) {
		try {
			if (Class134.aClass258_1518 != null) {
				Class239.aClass240_2592 = new Class240();
				Class239.aClass240_2592.method2386(-1106992194717709939L * Class239.aLong2590, ((Class258) Class134.aClass258_1518).aClass526_2685.method6257(Class429.aClass454_4369, 991479434), (774429481 * ((Class258) Class134.aClass258_1518).anInt2706), Class134.aClass258_1518, 1495621861);
				Class330_Sub36_Sub14_Sub1.aThread10138 = new Thread(Class239.aClass240_2592, "");
				Class330_Sub36_Sub14_Sub1.aThread10138.start();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("w.i(").append(')').toString());
		}
	}

	static final void method6303(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class513.aByte5966;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("w.wf(").append(')').toString());
		}
	}
}
