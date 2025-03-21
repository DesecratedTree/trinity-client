/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class545 implements Interface32 {
	public int anInt6992;
	static Class545 aClass545_6993;
	public static Class545 aClass545_6994;
	public static Class545 aClass545_6995 = new Class545("", 10);
	public static Class545 aClass545_6996;
	public static Class545 aClass545_6997;
	public static Class545 aClass545_6998;
	public static Class545 aClass545_6999;
	public static Class545 aClass545_7000 = new Class545("", 11);
	public static Class545 aClass545_7001;
	public static Class545 aClass545_7002;
	public static Class545 aClass545_7003;
	public static Class545 aClass545_7004;
	public static Class545 aClass545_7005;
	public static Class545 aClass545_7006;
	public static Class545 aClass545_7007;
	public static Class545 aClass545_7008;
	public static Class545 aClass545_7009;
	public static Class545 aClass545_7010;
	public static Class545 aClass545_7011;
	static Class545 aClass545_7012;
	public static Class545 aClass545_7013;

	static {
		aClass545_6996 = new Class545("", 12);
		aClass545_6997 = new Class545("", 13);
		aClass545_7013 = new Class545("", 14);
		aClass545_6998 = new Class545("", 15);
		aClass545_7002 = new Class545("", 16);
		aClass545_6999 = new Class545("", 17);
		aClass545_7001 = new Class545("", 18);
		aClass545_7011 = new Class545("", 19);
		aClass545_6994 = new Class545("", 20);
		aClass545_7003 = new Class545("", 21);
		aClass545_7004 = new Class545("", 22);
		aClass545_7005 = new Class545("", 23);
		aClass545_7006 = new Class545("", 24);
		aClass545_7007 = new Class545("", 25);
		aClass545_7008 = new Class545("", 26);
		aClass545_7009 = new Class545("", 27);
		aClass545_7010 = new Class545("", 28);
		aClass545_6993 = new Class545("", 73);
		aClass545_7012 = new Class545("", 76);
	}

	Class545(String string, int i) {
		anInt6992 = i * -1540497857;
	}

	public static int method6347(int i) {
		try {
			if (Class503.aBoolean5914 && Class130.aFrame1498 != null)
				return 3;
			return client.aBoolean9033 ? 2 : 1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wo.gn(").append(')').toString());
		}
	}

	static void method6348(byte i) {
		try {
			Class556.aClass562_6386 = Class562.aClass562_6435;
			Class297.aClass460_3051 = Class460.aClass460_6853;
			Class556.aClass470_6390 = Class470.aClass470_6875;
			Class357.aClass468_3702 = Class468.aClass468_6861;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wo.j(").append(')').toString());
		}
	}

	public static final void method6349(String string, int i) {
		try {
			if (null != Class95_Sub22.aClass13Array7210) {
				Class1 class1 = Class426.method5317(1828533074);
				Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.KICK_FRIEND_CHAT_PACKET, class1.aClass488_22, 2069312411);
				class330_sub34.aClass330_Sub46_Sub2_7729.addByte(Class57.method659(string, -905860022), (byte) 37);
				class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -98);
				class1.method378(class330_sub34, -918537290);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("wo.mo(").append(')').toString());
		}
	}
}
