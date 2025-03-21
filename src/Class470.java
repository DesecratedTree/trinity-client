/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class470 implements Interface26 {
	static Class470 aClass470_6863;
	public static Class470 aClass470_6864;
	static Class470 aClass470_6865;
	static Class470 aClass470_6866;
	static Class470 aClass470_6867;
	static Class470 aClass470_6868;
	public static Class470 aClass470_6869;
	static Class470 aClass470_6870;
	static Class470 aClass470_6871;
	static Class470 aClass470_6872;
	static Class470 aClass470_6873;
	static Class470 aClass470_6874;
	public static Class470 aClass470_6875 = new Class470(-2);
	static Class470 aClass470_6876;
	int anInt6877;

	public int method301() {
		return 439365721 * ((Class470) this).anInt6877;
	}

	public int method297(short i) {
		try {
			return 439365721 * ((Class470) this).anInt6877;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tm.j(").append(')').toString());
		}
	}

	static {
		aClass470_6864 = new Class470(-3);
		aClass470_6865 = new Class470(2);
		aClass470_6869 = new Class470(3);
		aClass470_6867 = new Class470(9);
		aClass470_6868 = new Class470(10);
		aClass470_6871 = new Class470(20);
		aClass470_6870 = new Class470(21);
		aClass470_6866 = new Class470(30);
		aClass470_6872 = new Class470(31);
		aClass470_6873 = new Class470(32);
		aClass470_6874 = new Class470(33);
		aClass470_6863 = new Class470(34);
		aClass470_6876 = new Class470(38);
	}

	public int method298() {
		return 439365721 * ((Class470) this).anInt6877;
	}

	public int method299() {
		return 439365721 * ((Class470) this).anInt6877;
	}

	public int method300() {
		return 439365721 * ((Class470) this).anInt6877;
	}

	Class470(int i) {
		((Class470) this).anInt6877 = -357820439 * i;
	}

	static void method5863(String string, String string_0_, String string_1_, boolean bool, boolean bool_2_, byte i) {
		try {
			Class1 class1 = Class426.method5317(1806109565);
			if (class1.method380(-162921882) != null) {
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2479, class1.aClass488_22, 1650033858);
				class330_sub34.aClass330_Sub46_Sub2_7729.addShort((Class57.method659(string, -1218977871) + Class57.method659(string_0_, -2090554505) + Class57.method659(string_1_, -815659438) + 1), (byte) 59);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -19);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string_0_, (byte) -57);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string_1_, (byte) -82);
				int i_3_ = 0;
				if (bool)
					i_3_ |= 0x1;
				if (bool_2_)
					i_3_ |= 0x2;
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(i_3_, (byte) 49);
				class1.method378(class330_sub34, -1223598534);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tm.g(").append(')').toString());
		}
	}

	static int method5864(char c, byte i) {
		try {
			if (c >= 0 && c < Class452.anIntArray5557.length)
				return Class452.anIntArray5557[c];
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tm.r(").append(')').toString());
		}
	}

	public static void method5865(int i) {
		try {
			Class3.aClass120Array56 = new Class120[Class330_Sub12_Sub9.aClass280_9534.method2764(2083577615)];
			Class382.aBooleanArray6678 = new boolean[Class330_Sub12_Sub9.aClass280_9534.method2764(1390873214)];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("tm.m(").append(')').toString());
		}
	}
}
