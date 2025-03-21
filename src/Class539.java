/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class539 {
	static Class296 aClass296_6244;
	boolean aBoolean6245;
	Class548[] aClass548Array6246;

	Class539(boolean bool, Class548[] class548s) {
		((Class539) this).aBoolean6245 = bool;
		((Class539) this).aClass548Array6246 = class548s;
	}

	public static Class208 method6326(int i, int i_0_) {
		try {
			Class208 class208 = (Class208) Class208.aClass367_1966.get((long) i);
			if (class208 != null)
				return class208;
			byte[] is = Class208.aClass280_1954.getFile(1, i);
			class208 = new Class208();
			class208.anInt1967 = -880910631 * i;
			if (null != is)
				class208.method2197(new Buffer(is), (byte) -32);
			class208.method2196(2141145355);
			if (2 == class208.anInt1968 * 1443671963 && Class208.aClass497_1964.method6094((long) i) == null) {
				Class208.aClass497_1964.method6097(new Class330_Sub23(Class208.anInt1979 * -1626659163), (long) i);
				Class208.aClass208Array1963[(Class208.anInt1979 += -74428115) * -1626659163 - 1] = class208;
			}
			Class208.aClass367_1966.put(class208, (long) i);
			return class208;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wi.j(").append(')').toString());
		}
	}
}
