/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Date;

public class Class56 {
	public boolean aBoolean508;
	public static int anInt509 = 12;
	public static int anInt510 = 2;
	public static int anInt511 = 3;
	public static int anInt512 = 6;
	public static int anInt513 = 5;
	public boolean aBoolean514;
	public static int anInt515 = 7;
	public static int anInt516 = 8;
	public boolean aBoolean517;
	public static int anInt518 = 10;
	public boolean aBoolean519;
	public int anInt520;
	public static int anInt521 = 13;
	public static int anInt522 = 16;
	public short aShort523;
	public Class369 aClass369_524;
	public byte aByte525;
	public byte aByte526;
	public int anInt527;
	public static int anInt528 = 4;
	public byte aByte529;
	public byte aByte530;
	public byte aByte531;
	public int anInt532;
	public boolean aBoolean533;
	public byte aByte534;
	public static int anInt535 = 1;
	public boolean aBoolean536;
	public boolean aBoolean537;
	public byte aByte538;
	public static int anInt539 = 0;
	public static int anInt540 = 11;
	public static int anInt541 = 9;

	Class56() {
		/* empty */
	}

	static final void method644(Class430 class430, int i) {
		try {
			Class1 class1 = Class426.method5317(2025825147);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.QUICK_CHAT_PACKET, class1.aClass488_22, 1609917803);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(0, (byte) 91);
			int i_0_ = (-824785231 * class330_sub34.aClass330_Sub46_Sub2_7729.offset);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(3, (byte) 20);
			class330_sub34.aClass330_Sub46_Sub2_7729.addShort(1955043023 * ((Class430) class430).aClass209_4385.anInt1981, (byte) 76);
			((Class430) class430).aClass209_4385.aClass330_Sub36_Sub4_1982.method3450(class330_sub34.aClass330_Sub46_Sub2_7729, ((Class430) class430).aClass209_4385.anIntArray1983, (byte) -64);
			class330_sub34.aClass330_Sub46_Sub2_7729.method3751((-824785231 * class330_sub34.aClass330_Sub46_Sub2_7729.offset) - i_0_, -342963442);
			class1.method378(class330_sub34, -841909620);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cf.ady(").append(')').toString());
		}
	}

	public static void method645(int i) {
		try {
			for (Class330_Sub43 class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6099((byte) 28)); class330_sub43 != null; class330_sub43 = ((Class330_Sub43) Class442.aClass497_4489.method6098((short) -32768))) {
				if (((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3197(-910967411))
					Class502.method6132((((Class330_Sub43) class330_sub43).anInt7819) * -1340253797, (byte) -116);
				else {
					((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3203(1329866319);
					try {
						((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3199((byte) -63);
					} catch (Exception exception) {
						Class207.method2195(new StringBuilder().append("").append(-1340253797 * ((Class330_Sub43) class330_sub43).anInt7819).toString(), exception, -306254718);
						Class502.method6132(-1340253797 * (((Class330_Sub43) class330_sub43).anInt7819), (byte) -56);
					}
					if (!((Class330_Sub43) class330_sub43).aBoolean7824 && !((Class330_Sub43) class330_sub43).aBoolean7823) {
						Class330_Sub31_Sub1 class330_sub31_sub1 = ((Class330_Sub43) class330_sub43).aClass324_Sub1_7825.method3187(1833021121);
						if (null != class330_sub31_sub1) {
							Class330_Sub40_Sub1 class330_sub40_sub1 = class330_sub31_sub1.method3419(-1844920295);
							if (null != class330_sub40_sub1) {
								class330_sub40_sub1.method3572(2070026559 * ((Class330_Sub43) class330_sub43).anInt7820, 1418061320);
								Class511.aClass330_Sub40_Sub4_5951.method3684(class330_sub40_sub1);
								((Class330_Sub43) class330_sub43).aBoolean7824 = true;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cf.f(").append(')').toString());
		}
	}

	static final void method646(Class430 class430, int i) {
		try {
			Class392.method4610((((Class430) class430).aClass432_Sub1_Sub2_Sub1_4390), class430, 164038384);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cf.arh(").append(')').toString());
		}
	}

	public static void panelBoxMessage(String string, int i) {
		try {
			if (Class5.aStringArray68 == null)
				Class118.method1429(-468270409);
			client.aCalendar9098.setTime(new Date(Class312.method3111((byte) 108)));
			int i_1_ = client.aCalendar9098.get(11);
			int i_2_ = client.aCalendar9098.get(12);
			int i_3_ = client.aCalendar9098.get(13);
			String string_4_ = new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append(":").append(i_2_ / 10).append(i_2_ % 10).append(":").append(i_3_ / 10).append(i_3_ % 10).toString();
			String[] strings = Class226.method2309(string, '\n', (byte) -55);
			for (int i_5_ = 0; i_5_ < strings.length; i_5_++) {
				for (int i_6_ = -1970400951 * Class5.anInt71; i_6_ > 0; i_6_--)
					Class5.aStringArray68[i_6_] = Class5.aStringArray68[i_6_ - 1];
				Class5.aStringArray68[0] = new StringBuilder().append(string_4_).append(": ").append(strings[i_5_]).toString();
				if (Class215.aFileOutputStream2086 != null) {
					try {
						Class215.aFileOutputStream2086.write(Class132.method1567(new StringBuilder().append(Class5.aStringArray68[0]).append("\n").toString(), -1433749028));
					} catch (IOException ioexception) {
						/* empty */
					}
				}
				if (-1970400951 * Class5.anInt71 < Class5.aStringArray68.length - 1) {
					Class5.anInt71 += 1333244153;
					if (1888787583 * Class5.anInt77 > 0)
						Class5.anInt77 += 1587487615;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("cf.b(").append(')').toString());
		}
	}
}
