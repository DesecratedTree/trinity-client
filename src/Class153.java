/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class153 {
	public int anInt1631;
	public byte aByte1632;
	public String aString1633;
	static int anInt1634;

	Class153() {
		/* empty */
	}

	public static void method1791(int i, int i_0_) {
		try {
			Class132.anInt1506 = 1106514049 * i;
			synchronized (Class408.aClass367_4207) {
				Class408.aClass367_4207.method4298((byte) 104);
			}
			synchronized (Class408.aClass367_4202) {
				Class408.aClass367_4202.method4298((byte) 106);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gf.l(").append(')').toString());
		}
	}

	static final void method1792(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			if (Class278.method2740(string, class430, (byte) 0) != null)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1288 = Class288.method2886(string, class430, 1134276852);
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gf.nm(").append(')').toString());
		}
	}

	static void method1793(Class330_Sub36_Sub10 class330_sub36_sub10, byte i) {
		try {
			if (null != class330_sub36_sub10) {
				Class484.aClass471_5791.method5878(class330_sub36_sub10, (short) 8192);
				Class484.anInt5786 += 1787411323;
				Object object = null;
				Class330_Sub36_Sub13 class330_sub36_sub13;
				if (!((Class330_Sub36_Sub10) class330_sub36_sub10).aBoolean9698 && !"".equals(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693)) {
					long l = ((((Class330_Sub36_Sub10) class330_sub36_sub10).aLong9695) * 3393282222834386213L);
					for (class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass497_5803.method6094(l)); null != class330_sub36_sub13; class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass497_5803.method6095(490067088))) {
						if (((Class330_Sub36_Sub13) class330_sub36_sub13).aString9717.equals(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693)) {
							if (i > 0)
								break;
							return;
						}
					}
					if (class330_sub36_sub13 == null) {
						class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass367_5796.get(l));
						if (class330_sub36_sub13 != null && !(((Class330_Sub36_Sub13) class330_sub36_sub13).aString9717.equals(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693)))
							class330_sub36_sub13 = null;
						if (null == class330_sub36_sub13)
							class330_sub36_sub13 = (new Class330_Sub36_Sub13(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693));
						Class484.aClass497_5803.method6097(class330_sub36_sub13, l);
						Class484.anInt5790 += 219833981;
					}
				} else {
					class330_sub36_sub13 = new Class330_Sub36_Sub13(((Class330_Sub36_Sub10) class330_sub36_sub10).aString9693);
					Class484.anInt5790 += 219833981;
				}
				if (class330_sub36_sub13.method3486(class330_sub36_sub10, -1669217168))
					Class408.method4768(class330_sub36_sub13, -1067157786);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gf.x(").append(')').toString());
		}
	}

	static final void method1794(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_1_ = (((Class430) class430).anIntArray4387[((Class430) class430).anInt4376 * 1632830751]);
			int i_2_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class10.method427(i_1_, i_2_, false, false, -1558641914);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gf.uc(").append(')').toString());
		}
	}

	static final void method1795(Class430 class430, int i) {
		try {
			if (null != CacheIndex.aClass154_1450) {
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 1;
				((Class430) class430).aClass154_4391 = CacheIndex.aClass154_1450;
			} else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gf.xj(").append(')').toString());
		}
	}

	public static Class330_Sub36_Sub15 method1796(int i, Class137 class137, Buffer class330_sub46, int i_3_) {
		try {
			if (Class137.aClass137_1530 == class137)
				return new Class330_Sub36_Sub15_Sub2(i, class330_sub46);
			if (Class137.aClass137_1529 == class137)
				return new Class330_Sub36_Sub15_Sub1(i, class330_sub46);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("gf.r(").append(')').toString());
		}
	}
}
