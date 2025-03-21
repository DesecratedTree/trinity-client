/* Class454 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Locale;

public class Class454 implements Interface26 {
	static Class454[] aClass454Array6821;
	public static Class454 aClass454_6822;
	int anInt6823;
	public static Class454 aClass454_6824;
	static Class454 aClass454_6825;
	public static Class454 aClass454_6826;
	String aString6827;
	public static int anInt6828 = 7;
	String aString6829;
	public static Class454 aClass454_6830;
	Locale aLocale6831;
	public static Class454 aClass454_6832 = new Class454("EN", "en", "English", Class457.aClass457_6834, 0, "GB");

	static final void method5644(Class430 class430, int i) {
		try {
			Class426 class426 = (((Class430) class430).aBoolean4398 ? ((Class430) class430).aClass426_4384 : ((Class430) class430).aClass426_4370);
			IComponentDefinitions iComponentDefinitions = ((Class426) class426).aClass114_4345;
			Class120 class120 = ((Class426) class426).aClass120_4346;
			Preferences.method2923(iComponentDefinitions, class120, class430, 1694127020);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.fm(").append(')').toString());
		}
	}

	public int method297(short i) {
		try {
			return ((Class454) this).anInt6823 * 2131854857;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.j(").append(')').toString());
		}
	}

	public Locale method5645(int i) {
		try {
			return ((Class454) this).aLocale6831;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.p(").append(')').toString());
		}
	}

	public static Class454 method5646(int i, int i_0_) {
		try {
			if (i < 0 || i >= aClass454Array6821.length)
				return null;
			return aClass454Array6821[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.o(").append(')').toString());
		}
	}

	public String toString() {
		try {
			return method5648(-512418066).toLowerCase(Locale.ENGLISH);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.toString(").append(')').toString());
		}
	}

	static {
		aClass454_6822 = new Class454("DE", "de", "German", Class457.aClass457_6834, 1, "DE");
		aClass454_6830 = new Class454("FR", "fr", "French", Class457.aClass457_6834, 2, "FR");
		aClass454_6824 = new Class454("PT", "pt", "Portuguese", Class457.aClass457_6834, 3, "BR");
		aClass454_6825 = new Class454("NL", "nl", "Dutch", Class457.aClass457_6839, 4, "NL");
		aClass454_6826 = new Class454("ES", "es", "Spanish", Class457.aClass457_6839, 5, "ES");
		Class454[] class454s = method5650(-869031502);
		aClass454Array6821 = new Class454[class454s.length];
		Class454[] class454s_1_ = class454s;
		for (int i = 0; i < class454s_1_.length; i++) {
			Class454 class454 = class454s_1_[i];
			if ((aClass454Array6821[2131854857 * ((Class454) class454).anInt6823]) != null)
				throw new IllegalStateException();
			aClass454Array6821[((Class454) class454).anInt6823 * 2131854857] = class454;
		}
	}

	static final void method5647(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 1514958270;
			int i_2_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_3_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			if (Class503.aBoolean5914) {
				Class96.method1182(3, i_2_, i_3_, false, -2000230590);
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = Class130.aFrame1498 != null ? 1 : 0;
			} else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.afd(").append(')').toString());
		}
	}

	public int method298() {
		return ((Class454) this).anInt6823 * 2131854857;
	}

	public int method300() {
		return ((Class454) this).anInt6823 * 2131854857;
	}

	public int method301() {
		return ((Class454) this).anInt6823 * 2131854857;
	}

	Class454(String string, String string_4_, String string_5_, Class457 class457, int i, String string_6_) {
		((Class454) this).aString6827 = string;
		((Class454) this).aString6829 = string_4_;
		((Class454) this).anInt6823 = i * 114944057;
		if (string_6_ != null)
			((Class454) this).aLocale6831 = new Locale(string_4_.substring(0, 2), string_6_);
		else
			((Class454) this).aLocale6831 = new Locale(string_4_.substring(0, 2));
	}

	public String method5648(int i) {
		try {
			return ((Class454) this).aString6829;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.i(").append(')').toString());
		}
	}

	public int method299() {
		return ((Class454) this).anInt6823 * 2131854857;
	}

	static final void method5649(Class430 class430, byte i) {
		try {
			int i_7_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_7_, -229137574);
			Class120 class120 = Class3.aClass120Array56[i_7_ >> 16];
			Class439.method5599(iComponentDefinitions, class120, false, 2, class430, (byte) 79);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.hr(").append(')').toString());
		}
	}

	public static Class454[] method5650(int i) {
		try {
			return (new Class454[] { aClass454_6826, aClass454_6824, aClass454_6830, aClass454_6832, aClass454_6822, aClass454_6825 });
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.r(").append(')').toString());
		}
	}

	static final void method5651(Class430 class430, byte i) {
		try {
			int i_8_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = ((Class430) class430).aClass154_4391.aByteArray1654[i_8_];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.xn(").append(')').toString());
		}
	}

	static final void method5652(Class430 class430, int i) {
		try {
			int i_9_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			IComponentDefinitions iComponentDefinitions = Class95.method1101(i_9_, 1922260102);
			Class120 class120 = Class3.aClass120Array56[i_9_ >> 16];
			Class43.method585(iComponentDefinitions, class120, class430, 822953439);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("su.io(").append(')').toString());
		}
	}
}
