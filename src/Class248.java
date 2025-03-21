/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class248 implements Interface14 {
	int anInt6587;
	static Class367 aClass367_6588;
	Class542 aClass542_6589;
	Interface7[] anInterface7Array6590;
	Class_ra aClass_ra6591;
	static byte[] aByteArray6592 = { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
	int anInt6593;
	boolean aBoolean6594;

	public int method214() {
		return -1544147031 * ((Class248) this).anInt6593;
	}

	public void method203(int i) {
		try {
			if (Class361.aClass_ra3793 != ((Class248) this).aClass_ra6591) {
				((Class248) this).aClass_ra6591 = Class361.aClass_ra3793;
				((Class248) this).aBoolean6594 = true;
			}
			((Class248) this).aClass_ra6591.ba(3, 0);
			Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
			for (int i_0_ = 0; i_0_ < interface7s.length; i_0_++) {
				Interface7 interface7 = interface7s[i_0_];
				if (null != interface7)
					interface7.method86(-1058552246);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.f(").append(')').toString());
		}
	}

	public void method196(boolean bool, int i) {
		try {
			bool = true;
			Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
			for (int i_1_ = 0; i_1_ < interface7s.length; i_1_++) {
				Interface7 interface7 = interface7s[i_1_];
				if (null != interface7)
					interface7.method87(bool || ((Class248) this).aBoolean6594, (byte) 47);
			}
			((Class248) this).aBoolean6594 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.i(").append(')').toString());
		}
	}

	public int method212(int i) {
		try {
			int i_2_ = 0;
			Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
			for (int i_3_ = 0; i_3_ < interface7s.length; i_3_++) {
				Interface7 interface7 = interface7s[i_3_];
				if (null == interface7 || interface7.method85(-502421478))
					i_2_++;
			}
			return i_2_ * 100 / ((Class248) this).anInterface7Array6590.length;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.z(").append(')').toString());
		}
	}

	public void method209(byte i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.s(").append(')').toString());
		}
	}

	static {
		aClass367_6588 = new Class367(128, 4);
	}

	public void method200(boolean bool) {
		bool = true;
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i = 0; i < interface7s.length; i++) {
			Interface7 interface7 = interface7s[i];
			if (null != interface7)
				interface7.method87(bool || ((Class248) this).aBoolean6594, (byte) 67);
		}
		((Class248) this).aBoolean6594 = false;
	}

	public void method201(boolean bool) {
		bool = true;
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i = 0; i < interface7s.length; i++) {
			Interface7 interface7 = interface7s[i];
			if (null != interface7)
				interface7.method87(bool || ((Class248) this).aBoolean6594, (byte) 36);
		}
		((Class248) this).aBoolean6594 = false;
	}

	public void method202(boolean bool) {
		bool = true;
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i = 0; i < interface7s.length; i++) {
			Interface7 interface7 = interface7s[i];
			if (null != interface7)
				interface7.method87(bool || ((Class248) this).aBoolean6594, (byte) 23);
		}
		((Class248) this).aBoolean6594 = false;
	}

	public void method204() {
		/* empty */
	}

	public int method210() {
		int i = 0;
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i_4_ = 0; i_4_ < interface7s.length; i_4_++) {
			Interface7 interface7 = interface7s[i_4_];
			if (null == interface7 || interface7.method85(-748744890))
				i++;
		}
		return i * 100 / ((Class248) this).anInterface7Array6590.length;
	}

	public void method208() {
		if (Class361.aClass_ra3793 != ((Class248) this).aClass_ra6591) {
			((Class248) this).aClass_ra6591 = Class361.aClass_ra3793;
			((Class248) this).aBoolean6594 = true;
		}
		((Class248) this).aClass_ra6591.ba(3, 0);
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i = 0; i < interface7s.length; i++) {
			Interface7 interface7 = interface7s[i];
			if (null != interface7)
				interface7.method86(-2087584270);
		}
	}

	public void method206() {
		if (Class361.aClass_ra3793 != ((Class248) this).aClass_ra6591) {
			((Class248) this).aClass_ra6591 = Class361.aClass_ra3793;
			((Class248) this).aBoolean6594 = true;
		}
		((Class248) this).aClass_ra6591.ba(3, 0);
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i = 0; i < interface7s.length; i++) {
			Interface7 interface7 = interface7s[i];
			if (null != interface7)
				interface7.method86(-19812538);
		}
	}

	public boolean method198(long l) {
		try {
			return (Class312.method3111((byte) 98) >= (long) (131882845 * ((Class248) this).anInt6587) + l);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.w(").append(')').toString());
		}
	}

	public int method195() {
		int i = 0;
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i_5_ = 0; i_5_ < interface7s.length; i_5_++) {
			Interface7 interface7 = interface7s[i_5_];
			if (null == interface7 || interface7.method85(1215195968))
				i++;
		}
		return i * 100 / ((Class248) this).anInterface7Array6590.length;
	}

	public int method197() {
		int i = 0;
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i_6_ = 0; i_6_ < interface7s.length; i_6_++) {
			Interface7 interface7 = interface7s[i_6_];
			if (null == interface7 || interface7.method85(1333590761))
				i++;
		}
		return i * 100 / ((Class248) this).anInterface7Array6590.length;
	}

	public void method207() {
		if (Class361.aClass_ra3793 != ((Class248) this).aClass_ra6591) {
			((Class248) this).aClass_ra6591 = Class361.aClass_ra3793;
			((Class248) this).aBoolean6594 = true;
		}
		((Class248) this).aClass_ra6591.ba(3, 0);
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i = 0; i < interface7s.length; i++) {
			Interface7 interface7 = interface7s[i];
			if (null != interface7)
				interface7.method86(1632126965);
		}
	}

	public boolean method205(long l) {
		return (Class312.method3111((byte) 79) >= (long) (131882845 * ((Class248) this).anInt6587) + l);
	}

	public boolean method213(long l) {
		return (Class312.method3111((byte) 92) >= (long) (131882845 * ((Class248) this).anInt6587) + l);
	}

	Class248(Class542 class542, int i, int i_7_, Class163 class163) {
		((Class248) this).aClass542_6589 = class542;
		((Class248) this).anInt6587 = i * -84153099;
		((Class248) this).anInt6593 = -1292639079 * i_7_;
		((Class248) this).anInterface7Array6590 = new Interface7[(((Class248) this).aClass542_6589.anInterface10Array6250).length];
		for (int i_8_ = 0; i_8_ < ((Class248) this).anInterface7Array6590.length; i_8_++)
			((Class248) this).anInterface7Array6590[i_8_] = class163.method1919((((Class248) this).aClass542_6589.anInterface10Array6250[i_8_]), (byte) 108);
	}

	public void method194() {
		if (Class361.aClass_ra3793 != ((Class248) this).aClass_ra6591) {
			((Class248) this).aClass_ra6591 = Class361.aClass_ra3793;
			((Class248) this).aBoolean6594 = true;
		}
		((Class248) this).aClass_ra6591.ba(3, 0);
		Interface7[] interface7s = ((Class248) this).anInterface7Array6590;
		for (int i = 0; i < interface7s.length; i++) {
			Interface7 interface7 = interface7s[i];
			if (null != interface7)
				interface7.method86(-2077197527);
		}
	}

	public boolean method211(long l) {
		return (Class312.method3111((byte) 115) >= (long) (131882845 * ((Class248) this).anInt6587) + l);
	}

	public int method199(int i) {
		try {
			return -1544147031 * ((Class248) this).anInt6593;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.n(").append(')').toString());
		}
	}

	static final void method2479(Class430 class430, byte i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_9_, -1541881718);
			Class120 class120 = Class3.aClass120Array56[i_9_ >> 16];
			Class95_Sub17.method1160(iComponentDefinitions, class120, class430, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.ew(").append(')').toString());
		}
	}

	static final void method2480(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_10_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_11_ = (((Class430) class430).anIntArray4387[1 + 1632830751 * ((Class430) class430).anInt4376]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class10.method427(i_10_, i_11_, true, false, -1558641914);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.ug(").append(')').toString());
		}
	}

	static final void method2481(Class430 class430, byte i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Class_na.method3515(iComponentDefinitions, class120, class430, (byte) 110);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("kj.gt(").append(')').toString());
		}
	}
}
