/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class195 {
	static Class195 aClass195_1887;
	static Class195 aClass195_1888;
	static Class195 aClass195_1889 = new Class195();

	static {
		aClass195_1888 = new Class195();
		aClass195_1887 = new Class195();
	}

	public int method2137(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = (Class300.anInt3058 * -1969079741 > i_0_ ? Class300.anInt3058 * -1969079741 : i_0_);
			if (this == aClass195_1889)
				return 0;
			if (this == aClass195_1887)
				return i_2_ - i;
			if (aClass195_1888 == this)
				return (i_2_ - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ib.j(").append(')').toString());
		}
	}

	Class195() {
		/* empty */
	}

	static final void method2138(IComponentDefinitions iComponentDefinitions, Class120 class120, Class430 class430, int i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			int[] is = Class278.method2740(string, class430, (byte) 0);
			if (null != is)
				string = string.substring(0, string.length() - 1);
			iComponentDefinitions.anObjectArray1299 = Class288.method2886(string, class430, 1959856176);
			iComponentDefinitions.anIntArray1269 = is;
			iComponentDefinitions.aBoolean1293 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ib.oh(").append(')').toString());
		}
	}

	static IComponentDefinitions method2139(IComponentDefinitions iComponentDefinitions, byte i) {
		try {
			IComponentDefinitions class114_3_ = client.method3926(iComponentDefinitions);
			if (class114_3_ == null)
				class114_3_ = iComponentDefinitions.aClass114_1252;
			return class114_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ib.lb(").append(')').toString());
		}
	}

	static Class330_Sub11 method2140(IndexTable class280, int i, int i_4_) {
		try {
			byte[] is = class280.method2761(i, 1302438615);
			if (null == is)
				return null;
			return new Class330_Sub11(is);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ib.r(").append(')').toString());
		}
	}
}
