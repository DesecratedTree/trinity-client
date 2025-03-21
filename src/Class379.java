/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class379 {
	public static int anInt3943 = 8;
	public static int anInt3944 = 9;
	public static int anInt3945 = 2;
	public static int anInt3946 = 511;
	public static int anInt3947 = 512;
	public static int anInt3948 = 1024;
	public static int anInt3949 = 256;
	public static int anInt3950 = 128;
	public static int anInt3951 = 7;
	static IComponentDefinitions[] aClass114Array3952;
	public static int anInt3953;

	Class379() throws Throwable {
		throw new Error();
	}

	static {
		Math.sqrt(131072.0);
	}

	static final void method4382(Class430 class430, int i) {
		try {
			int i_0_ = (((Class430) class430).anIntArray4394[((Class430) class430).anInt4397 * -54918871]);
			String string = (((Class430) class430).aClass154_4391.method1817(client.aClass435_9146.anInt4417 * -1358018753 << 16 | i_0_, (byte) 73));
			String string_1_;
			if (string == null)
				string_1_ = "";
			else
				string_1_ = string;
			((Class430) class430).anObjectArray4386[((((Class430) class430).anInt4378 += 2087905371) * -1378875437 - 1)] = string_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pt.bv(").append(')').toString());
		}
	}

	static final void method4383(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub21_7875.method5811(-1390004513) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pt.alo(").append(')').toString());
		}
	}

	static final void method4384(Class430 class430, byte i) {
		try {
			if (client.aBoolean9198)
				Class232.aClass232_2454.method2357(2105004854);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pt.ape(").append(')').toString());
		}
	}

	public static final void method4385(String string, boolean bool, int i) {
		try {
			if (string != null) {
				if (client.anInt9261 * -1187306419 >= 100)
					Class475_Sub2.method5952(4, Class526.aClass526_6181.method6257(Class429.aClass454_4369, 991479434), -1812899482);
				else {
					String string_2_ = Class531.method6297(string, -1632842613);
					if (null != string_2_) {
						for (int i_3_ = 0; i_3_ < client.anInt9261 * -1187306419; i_3_++) {
							Class75 class75 = client.aClass75Array8982[i_3_];
							String string_4_ = Class531.method6297(class75.aString646, -1774815762);
							if (string_4_ != null && string_4_.equals(string_2_)) {
								Class475_Sub2.method5952(4, new StringBuilder().append(string).append(Class526.aClass526_6182.method6257(Class429.aClass454_4369, 991479434)).toString(), -1599714438);
								return;
							}
							if (null != class75.aString647) {
								String string_5_ = Class531.method6297(class75.aString647, -1825451478);
								if (string_5_ != null && string_5_.equals(string_2_)) {
									Class475_Sub2.method5952(4, new StringBuilder().append(string).append(Class526.aClass526_6182.method6257(Class429.aClass454_4369, 991479434)).toString(), -604857866);
									return;
								}
							}
						}
						for (int i_6_ = 0; i_6_ < client.anInt9256 * 652732387; i_6_++) {
							Class99 class99 = client.aClass99Array9259[i_6_];
							String string_7_ = Class531.method6297(class99.aString915, -2120972691);
							if (null != string_7_ && string_7_.equals(string_2_)) {
								Class475_Sub2.method5952(4, new StringBuilder().append(Class526.aClass526_6171.method6257(Class429.aClass454_4369, 991479434)).append(string).append(Class526.aClass526_6189.method6257(Class429.aClass454_4369, 991479434)).toString(), -1894911587);
								return;
							}
							if (class99.aString910 != null) {
								String string_8_ = Class531.method6297(class99.aString910, -1690672382);
								if (null != string_8_ && string_8_.equals(string_2_)) {
									Class475_Sub2.method5952(4, new StringBuilder().append(Class526.aClass526_6171.method6257(Class429.aClass454_4369, 991479434)).append(string).append(Class526.aClass526_6189.method6257(Class429.aClass454_4369, 991479434)).toString(), -1034831173);
									return;
								}
							}
						}
						if (Class531.method6297((Class263_Sub2.myPlayer.aString10221), -1846591760).equals(string_2_))
							Class475_Sub2.method5952(4, (Class526.aClass526_6167.method6257(Class429.aClass454_4369, 991479434)), -876778759);
						else {
							Class1 class1 = Class426.method5317(1937584472);
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ADD_IGNORE_PACKET, class1.aClass488_22, -58205906);
							class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(string, -1794486447) + 1, (byte) 63);
							class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) 0);
							class330_sub34.aClass330_Sub46_Sub2_7729.addByte(bool ? 1 : 0, (byte) 16);
							class1.method378(class330_sub34, -104655505);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pt.my(").append(')').toString());
		}
	}

	static final void method4386(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class330_Sub36.aBoolean7737 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("pt.aoy(").append(')').toString());
		}
	}
}
