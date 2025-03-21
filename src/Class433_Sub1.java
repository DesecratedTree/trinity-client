/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.nio.ByteBuffer;

public class Class433_Sub1 {
	public int anInt5885;
	public String aString5886;
	public int anInt5887 = 1060239026;
	boolean aBoolean5888;
	public int anInt5889;
	boolean aBoolean5890;

	public Class433_Sub1() {
		anInt5885 = 734734239;
		((Class433_Sub1) this).aBoolean5888 = true;
		((Class433_Sub1) this).aBoolean5890 = false;
	}

	public void method6107(int i) {
		try {
			if (!((Class433_Sub1) this).aBoolean5888) {
				((Class433_Sub1) this).aBoolean5888 = true;
				((Class433_Sub1) this).aBoolean5890 = true;
			} else if (((Class433_Sub1) this).aBoolean5890)
				((Class433_Sub1) this).aBoolean5890 = false;
			else
				((Class433_Sub1) this).aBoolean5888 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uo.j(").append(')').toString());
		}
	}

	public boolean method6108(Class433_Sub1 class498_0_, byte i) {
		try {
			if (class498_0_ == null)
				return false;
			return ((-115752509 * class498_0_.anInt5889 == anInt5889 * -115752509) && aString5886.equals(class498_0_.aString5886));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uo.i(").append(')').toString());
		}
	}

	@SuppressWarnings("unused")
	public Socket method6109(byte i) throws IOException {
		try {
			System.out.println(Loader.IP);
			if (true)
				return new Socket(InetAddress.getByName(Loader.IP), Loader.PORT);
			if (!((Class433_Sub1) this).aBoolean5890)
				return new Socket(InetAddress.getByName(aString5886), (((Class433_Sub1) this).aBoolean5888 ? anInt5885 * -1070948251 : anInt5887 * 1234504365));
			return Class397.method4678(aString5886, (((Class433_Sub1) this).aBoolean5888 ? anInt5885 * -1070948251 : 1234504365 * anInt5887), -1765188439).method6036(-705873968);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uo.r(").append(')').toString());
		}
	}

	public static void method6110(int i, int i_1_, int i_2_, String string, byte i_3_) {
		try {
			IComponentDefinitions iComponentDefinitions = Class166.method1993(i_1_, i_2_, 534399539);
			if (iComponentDefinitions != null) {
				if (iComponentDefinitions.anObjectArray1319 != null) {
					Class330_Sub42 class330_sub42 = new Class330_Sub42();
					class330_sub42.aClass114_7809 = iComponentDefinitions;
					class330_sub42.anInt7812 = 331689301 * i;
					class330_sub42.aString7816 = string;
					class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1319;
					Class117.method1423(class330_sub42, -1631194987);
				}
				if (client.method3924(iComponentDefinitions).method3264(i - 1, -979598918)) {
					Class1 class1 = Class426.method5317(1717895677);
					if (15 == -296919301 * client.anInt8995 || client.anInt8995 * -296919301 == 1) {
						if (1 == i) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON1_PACKET, class1.aClass488_22, 1918361696);
							Class447.method5626(class330_sub34, i_1_, i_2_, (-1053848421 * iComponentDefinitions.anInt1335), 1587626110);
							class1.method378(class330_sub34, -2007504531);
						}
						if (i == 2) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON2_PACKET, class1.aClass488_22, 45608191);
							Class447.method5626(class330_sub34, i_1_, i_2_, (iComponentDefinitions.anInt1335 * -1053848421), 1960949183);
							class1.method378(class330_sub34, -228077706);
						}
						if (i == 3) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON3_PACKET, class1.aClass488_22, 1010035435);
							Class447.method5626(class330_sub34, i_1_, i_2_, (-1053848421 * iComponentDefinitions.anInt1335), 1988907530);
							class1.method378(class330_sub34, -1330305779);
						}
						if (i == 4) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON4_PACKET, class1.aClass488_22, 1901538291);
							Class447.method5626(class330_sub34, i_1_, i_2_, (iComponentDefinitions.anInt1335 * -1053848421), 1716256507);
							class1.method378(class330_sub34, -691305813);
						}
						if (i == 5) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON5_PACKET, class1.aClass488_22, 644249119);
							Class447.method5626(class330_sub34, i_1_, i_2_, (iComponentDefinitions.anInt1335 * -1053848421), 1259801643);
							class1.method378(class330_sub34, -1379609271);
						}
						if (6 == i) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON7_PACKET, class1.aClass488_22, 1189519617);
							Class447.method5626(class330_sub34, i_1_, i_2_, (iComponentDefinitions.anInt1335 * -1053848421), 1022471593);
							class1.method378(class330_sub34, -1805809625);
						}
						if (7 == i) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON6_PACKET, class1.aClass488_22, 1115084575);
							Class447.method5626(class330_sub34, i_1_, i_2_, (-1053848421 * iComponentDefinitions.anInt1335), 2117717665);
							class1.method378(class330_sub34, -1377705060);
						}
						if (8 == i) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON8_PACKET, class1.aClass488_22, -600858123);
							Class447.method5626(class330_sub34, i_1_, i_2_, (-1053848421 * iComponentDefinitions.anInt1335), 1719208623);
							class1.method378(class330_sub34, -2100978651);
						}
						if (9 == i) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ACTION_BUTTON10_PACKET, class1.aClass488_22, -369787541);
							Class447.method5626(class330_sub34, i_1_, i_2_, (-1053848421 * iComponentDefinitions.anInt1335), 866592356);
							class1.method378(class330_sub34, -2027948185);
						}
						if (10 == i) {
							Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.ITEM_EXAMINE_PACKET, class1.aClass488_22, 252860626);
							Class447.method5626(class330_sub34, i_1_, i_2_, (-1053848421 * iComponentDefinitions.anInt1335), 943654587);
							class1.method378(class330_sub34, -1454364363);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("uo.kx(").append(')').toString());
		}
	}
}
