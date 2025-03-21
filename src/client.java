/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;

public final class client extends Class332 {
	static int[] anIntArray8952;
	static int anInt8953 = 131;
	static boolean aBoolean8954;
	static int[] anIntArray8955;
	public static int anInt8956;
	public static int anInt8957;
	public static boolean aBoolean8958;
	public static byte[] aByteArray8959;
	static String aString8960;
	public static boolean aBoolean8961;
	public static short aShort8962;
	public static Class1[] aClass1Array8963;
	public static String aString8964;
	public static short aShort8965;
	public static boolean aBoolean8966;
	static boolean aBoolean8967;
	public static String aString8968;
	public static int anInt8969;
	static int anInt8970;
	static int anInt8971 = 13828096;
	public static String aString8972;
	static int[] anIntArray8973;
	static Class367 aClass367_8974;
	static Class247 aClass247_8975;
	static Class247 aClass247_8976;
	static long aLong8977;
	static int anInt8978;
	static boolean aBoolean8979;
	public static int anInt8980;
	public static int anInt8981;
	public static Class75[] aClass75Array8982;
	static boolean aBoolean8983;
	static boolean aBoolean8984;
	static int anInt8985 = 1375731712;
	public static Class3[] aClass3Array8986;
	public static int anInt8987;
	static int anInt8988;
	static boolean aBoolean8989;
	static long aLong8990;
	static long clientToken;
	public static boolean aBoolean8992;
	public static int anInt8993;
	static int anInt8994;
	public static int anInt8995;
	static int anInt8996;
	public static Class471 aClass471_8997;
	static int mouseNotches;
	public static Class327[] aClass327Array8999;
	public static int anInt9000;
	public static Interface18[] anInterface18Array9001;
	static int anInt9002 = 75;
	public static int anInt9003;
	public static Interface18[] anInterface18Array9004;
	public static Color[] aColorArray9005;
	public static Color[] aColorArray9006;
	public static Color[] aColorArray9007;
	static int anInt9008;
	static int anInt9009;
	static int anInt9010;
	static int anInt9011;
	static String aString9012;
	public static int anInt9013;
	public static Class497 aClass497_9014;
	public static Class330_Sub35[] aClass330_Sub35Array9015;
	public static short aShort9016;
	public static int anInt9017;
	public static int[] anIntArray9018;
	static int anInt9019;
	static int[] anIntArray9020;
	static int[] anIntArray9021;
	static int anInt9022;
	static int anInt9023;
	static Class249 aClass249_9024;
	public static Class1 aClass1_9025;
	public static int anInt9026;
	static int anInt9027;
	public static int anInt9028;
	public static Class423 aClass423_9029;
	public static Class304 aClass304_9030;
	public static volatile boolean aBoolean9031;
	public static Object anObject9032;
	static boolean aBoolean9033;
	public static int[] anIntArray9034;
	public static int anInt9035;
	public static int[] anIntArray9036;
	static int anInt9037 = 2;
	public static boolean aBoolean9038;
	public static boolean aBoolean9039;
	static int anInt9040;
	static int anInt9041;
	public static boolean aBoolean9042;
	public static int anInt9043;
	public static int anInt9044;
	public static int anInt9045;
	static int[] anIntArray9046;
	public static int anInt9047;
	static int anInt9048 = 4095;
	static int anInt9049;
	static int[] anIntArray9050;
	static int[] anIntArray9051;
	static int[] anIntArray9052;
	static int[] anIntArray9053;
	static int anInt9054;
	static int anInt9055;
	static int anInt9056;
	static int anInt9057;
	static int anInt9058;
	public static boolean aBoolean9059;
	public static Class1 aClass1_9060;
	public static Class467 aClass467_9061;
	static int anInt9062;
	static int anInt9063;
	static long[] aLongArray9064;
	static int[] anIntArray9065;
	static Random aRandom9066;
	public static short aShort9067;
	public static int anInt9068;
	public static int anInt9069;
	public static int anInt9070;
	public static boolean aBoolean9071;
	static float aFloat9072;
	public static boolean aBoolean9073;
	static boolean aBoolean9074;
	static boolean aBoolean9075;
	public static int anInt9076;
	public static int anInt9077;
	public static IComponentDefinitions aClass114_9078;
	public static long aLong9079;
	public static int anInt9080 = 2;
	public static Object anObject9081;
	public static int[][][] anIntArrayArrayArray9082;
	public static boolean aBoolean9083;
	static int anInt9084 = -1828716544;
	public static int anInt9085;
	public static int anInt9086;
	public static int anInt9087;
	public static int anInt9088;
	public static int anInt9089;
	static boolean aBoolean9090;
	static boolean aBoolean9091;
	public static int anInt9092;
	static int[] anIntArray9093;
	static int[] anIntArray9094;
	static int anInt9095;
	static Class467 aClass467_9096;
	static int anInt9097;
	static Calendar aCalendar9098;
	public static boolean aBoolean9099;
	static int anInt9100;
	static int anInt9101;
	public static int anInt9102;
	static int anInt9103;
	static int anInt9104;
	static int anInt9105 = 0;
	static int[] anIntArray9106;
	static int anInt9107 = 65535;
	static int[] anIntArray9108;
	static int anInt9109;
	static int anInt9110 = -754974720;
	static String aString9111;
	static int[] anIntArray9112;
	static long aLong9113;
	static boolean aBoolean9114;
	static int anInt9115;
	static int anInt9116;
	public static int[] anIntArray9117;
	public static int anInt9118;
	public static int anInt9119 = 2048;
	public static boolean aBoolean9120;
	public static int anInt9121;
	public static boolean aBoolean9122;
	public static boolean aBoolean9123;
	static float aFloat9124;
	public static int anInt9125;
	static String aString9126;
	static int anInt9127 = 32;
	static boolean aBoolean9128;
	static int anInt9129;
	static boolean aBoolean9130;
	static int anInt9131;
	static int anInt9132 = 8;
	static short[] aShortArray9133;
	static int[] anIntArray9134;
	static int anInt9135 = 5;
	static boolean[] aBooleanArray9136;
	static int anInt9137;
	public static Class497 aClass497_9138;
	public static Class471 aClass471_9139;
	static int anInt9140 = 100;
	public static float aFloat9141;
	static int anInt9142;
	public static int[] anIntArray9143;
	public static int[] anIntArray9144;
	static int anInt9145;
	public static Class435 aClass435_9146 = null;
	static int anInt9147;
	public static int anInt9148;
	static int anInt9149;
	public static boolean aBoolean9150;
	static int anInt9151;
	public static String aString9152;
	static long aLong9153;
	public static String aString9154;
	public static volatile int windowPaneId;
	static int anInt9156;
	static boolean aBoolean9157;
	public static int anInt9158;
	public static int anInt9159;
	public static int anInt9160;
	static boolean aBoolean9161;
	static boolean aBoolean9162;
	public static IComponentDefinitions aClass114_9163;
	static boolean aBoolean9164;
	static IComponentDefinitions aClass114_9165;
	static int anInt9166;
	static String[] aStringArray9167;
	static int anInt9168;
	static int[] anIntArray9169;
	static boolean aBoolean9170;
	static int anInt9171;
	static int anInt9172;
	static int anInt9173;
	static int anInt9174;
	static boolean aBoolean9175;
	static int anInt9176;
	static int anInt9177;
	static boolean aBoolean9178;
	static int anInt9179;
	static boolean aBoolean9180;
	static int anInt9181;
	public static int anInt9182;
	public static int anInt9183;
	static int anInt9184 = 31;
	static int[] anIntArray9185;
	static int anInt9186;
	static int[] anIntArray9187;
	static int anInt9188;
	static int[] anIntArray9189;
	static int anInt9190;
	public static short aShort9191;
	static int anInt9192;
	static int[] anIntArray9193;
	public static boolean aBoolean9194;
	static int[] anIntArray9195;
	static int anInt9196;
	static int anInt9197;
	public static boolean aBoolean9198 = false;
	static int anInt9199;
	static IComponentDefinitions aClass114_9200;
	public static int anInt9201;
	static int anInt9202;
	public static short aShort9203;
	public static int anInt9204 = 1;
	public static int anInt9205;
	public static boolean aBoolean9206;
	public static int anInt9207;
	static int anInt9208;
	static Class471 aClass471_9209;
	static int anInt9210;
	static Class497 aClass497_9211;
	public static int anInt9212 = 113;
	static int anInt9213;
	static int anInt9214;
	public static int anInt9215;
	public static Class497 aClass497_9216;
	static boolean aBoolean9217;
	static int anInt9218;
	static Class471 aClass471_9219;
	static int anInt9220;
	static int anInt9221;
	static int[] anIntArray9222;
	static int[] anIntArray9223;
	static int[] anIntArray9224;
	static Class60[] aClass60Array9225;
	static int[] anIntArray9226;
	public static int anInt9227;
	public static boolean aBoolean9228;
	static int anInt9229 = 100;
	public static boolean[] aBooleanArray9230;
	public static boolean aBoolean9231;
	public static int anInt9232;
	public static String aString9233;
	public static Class286[] aClass286Array9234;
	static int anInt9235;
	static Class532 aClass532_9236;
	static int[] anIntArray9237;
	static boolean[] aBooleanArray9238;
	static int[] anIntArray9239;
	static int[] anIntArray9240;
	static int anInt9241 = 13762560;
	static IComponentDefinitions aClass114_9242;
	public static Interface12 anInterface12_9243;
	static int anInt9244 = 5439488;
	public static short aShort9245;
	static int anInt9246;
	static int anInt9247;
	static int anInt9248 = 301989888;
	public static short aShort9249;
	public static float aFloat9250;
	static int anInt9251;
	static Rectangle[] aRectangleArray9252;
	public static float[] aFloatArray9253;
	static boolean aBoolean9254;
	public static int anInt9255;
	public static int anInt9256;
	public static int anInt9257;
	static int anInt9258 = 200;
	public static Class99[] aClass99Array9259;
	static Class467 aClass467_9260;
	public static int anInt9261;
	static int anInt9262;
	static boolean[] aBooleanArray9263;
	public static int anInt9264;
	public static int anInt9265;
	public static Interface19 anInterface19_9266;
	static long aLong9267;
	public static int anInt9268;
	static int anInt9269 = 1179648;
	static int anInt9270 = 5373952;
	static int anInt9271 = 9568256;
	static int anInt9272;
	public static boolean aBoolean9273;
	static int anInt9274 = 1;
	static int anInt9275 = -1845493760;
	static int anInt9276 = -771751936;
	static int anInt9277 = 1245184;
	public static Player[] players;
	static int anInt9279 = 9633792;
	public static Class471 aClass471_9280;
	static int anInt9281 = 318767104;
	static int anInt9282 = 1392508928;
	public static byte aByte9283;
	public static Class497 aClass497_9284;
	static int[] anIntArray9285;
	public static IndexTable aClass280_9286;
	public static int method3491;

	public final void init() {
		try {
			int method3492 = 0;
			try {
				NetworkInterface mbid;
				InetAddress inctc = InetAddress.getLocalHost();
				mbid = NetworkInterface.getByInetAddress(inctc);
				method3492 = ByteBuffer.wrap(mbid.getHardwareAddress()).getInt();
			//} catch (UnknownHostException | SocketException e) {
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (method3884((byte) 117)) {
				String string = "";
				Class219[] class219s = Class508.method6157(2137979314);
				for (int i = 0; i < class219s.length; i++) {
					Class219 class219 = class219s[i];
					String string_0_ = Class293.anApplet6804.getParameter(class219.aString2175);
					if (string_0_ != null) {
						switch (Integer.parseInt(class219.aString2175)) {
						case 29:
							Class503.aString5915 = string_0_;
							break;
						case 14:
							if (string_0_.equalsIgnoreCase(Class215.aString2085))
								aBoolean9217 = true;
							else
								aBoolean9217 = false;
							break;
						case 12:
							if (string_0_.equalsIgnoreCase(Class215.aString2085))
								aBoolean8954 = true;
							else
								aBoolean8954 = false;
							break;
						case 32:
							Class18.aString237 = string_0_;
							break;
						case 20:
							anInt8956 = Integer.parseInt(string_0_) * -170551815;
							break;
						case 23:
							string = string_0_;
							break;
						case 34:
							Class216.anInt2113 = Integer.parseInt(string_0_) * -634629943;
							break;
						case 8:
							if (null == Class507.aClass498_5937)
								Class507.aClass498_5937 = new Class498();
							Class507.aClass498_5937.anInt5889 = Integer.parseInt(string_0_) * -1143720213;
							break;
						case 27:
							if (string_0_.equals(Class215.aString2085))
								aBoolean9273 = true;
							else
								aBoolean9273 = false;
							break;
						case 25:
							if (string_0_.equalsIgnoreCase(Class215.aString2085))
								aBoolean8966 = true;
							else
								aBoolean8966 = false;
							break;
						case 1:
							anInt8970 = Integer.parseInt(string_0_) * -1352860039;
							break;
						case 16:
							anInt8957 = Integer.parseInt(string_0_) * -1639266399;
							if (-1667441567 * anInt8957 < 0 || (anInt8957 * -1667441567 >= aColorArray9005.length))
								anInt8957 = 0;
							break;
						case 21:
							if (string_0_.equalsIgnoreCase(Class215.aString2085))
								aBoolean9198 = true;
							else
								aBoolean9198 = false;
							break;
						case 31:
							Class19.aString243 = string_0_;
							break;
						case 13:
							Class429.aClass454_4369 = Class454.method5646(Integer.parseInt(string_0_), -629395151);
							break;
						case 2:
							aString8960 = string_0_;
							if (aString8960.length() > 100)
								aString8960 = null;
							break;
						case 4:
							break;
						case 10:
							if (null == Class507.aClass498_5937)
								Class507.aClass498_5937 = new Class498();
							Class507.aClass498_5937.aString5886 = string_0_;
							break;
						case 26:
							if (string_0_.equalsIgnoreCase(Class215.aString2085))
								aBoolean8967 = true;
							else
								aBoolean8967 = false;
							break;
						case 11:
							Class404.aClass457_4162 = ((Class457) (Class479.method6015(Class457.method5658((short) 15055), Integer.parseInt(string_0_), (byte) 106)));
							if (Class404.aClass457_4162 == Class457.aClass457_6837)
								Class404.aClass457_4162 = Class457.aClass457_6839;
							else if (!Class457.method5662((Class404.aClass457_4162), -1238438483) && (Class457.aClass457_6834 != Class404.aClass457_4162))
								Class404.aClass457_4162 = Class457.aClass457_6834;
							break;
						case 9:
							if (string_0_.equalsIgnoreCase(Class215.aString2085))
								aBoolean9122 = true;
							break;
						case 22:
							if (string_0_.equalsIgnoreCase(Class215.aString2085))
								aBoolean9042 = true;
							else
								aBoolean9042 = false;
							break;
						case 17:
							aString8972 = string_0_;
							break;
						default:
							Class207.method2195("", new RuntimeException(), -306254718);
							break;
						case 6:
							Class516.anInt5974 = Integer.parseInt(string_0_) * 1515128753;
							break;
						case 5:
							aString8964 = string_0_;
							break;
						case 7:
							aClass435_9146 = Class452.method5635(Integer.parseInt(string_0_), 1993719921);
							break;
						case 28:
							aString9111 = string_0_;
							break;
						case 33:
							Class288.aClass469_2956 = Class356.method4189(Integer.parseInt(string_0_), (byte) -45);
							if ((Class469.aClass469_5605 != Class288.aClass469_2956) && (Class288.aClass469_2956 != Class469.aClass469_5604) && (Class288.aClass469_2956 != Class469.aClass469_5603) && (Class469.aClass469_5602 != Class288.aClass469_2956))
								Class288.aClass469_2956 = Class469.aClass469_5602;
							break;
						case 30:
							aString9126 = string_0_;
							break;
						case 18:
							Class507.aClass498_5932 = new Class498();
							Class507.aClass498_5932.anInt5889 = Integer.parseInt(string_0_) * -1143720213;
							break;
						case 3:
							break;
						case 15:
							if (string_0_.equals(Class215.aString2085))
								aBoolean8958 = true;
							else
								aBoolean8958 = false;
							break;
						case 24:
							if (null != string_0_) {
								aByteArray8959 = (Class231.method2352(Class366_Sub5.method4282(string_0_, (byte) 2), -1985476162));
								if (aByteArray8959.length < 16)
									aByteArray8959 = null;
							}
							break;
						case 35:
							aLong9079 = (Long.parseLong(string_0_) * -2425012191213527747L);
						}
					}
				}
				if (null == aString9111)
					aString9111 = "";
				Class318 class318 = new Class318(64571523 * anInt9207, anInt9118 * 1108170155, anInt9246 * -1346562523, anInt9116 * 815086887, aClass435_9146.aString4415);
				Class394.aClient4082 = this;
				String string_1_ = Class288.aClass469_2956.aString5607;
				int i = 171998097 * Class288.aClass469_2956.anInt5608 + 32;
				if (!string.equals("")) {
					string_1_ = new StringBuilder().append(string_1_).append("_").append(string).toString();
					i = 0;
				}
				method3878(class318, aClass435_9146.aString4422, string_1_, i, Class158_Sub1.getCacheIndex(1489381846), 742, 1, aBoolean9217, 1656197691);
			}
			Loader.PORT = Class35.anInt364;
			method3491 = method3492;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.init(").append(')').toString());
		}
	}

	final void method3898(int i) {
		try {
			Frame frame = new Frame(" ");
			frame.pack();
			frame.dispose();
			IsaacCipher.aClass114_5838 = new IComponentDefinitions();
			Class16.method450(-2014568409);
			Class497.aClass267_5883 = new Class267();
			Class140_Sub1.aClass285_7263 = new Class285_Sub1();
			Class341.method3979(new int[] { 20, 260 }, new int[] { 1000, 100 }, 1006809534);
			Class260.method2580(100);
			Class244.method2436(10);
			Class231.method2350(100, (byte) 110);
			Class285_Sub1.method2866(100, (byte) 45);
			if (Class404.aClass457_4162 != Class457.aClass457_6834)
				Class230.aByteArrayArray2447 = new byte[50][];
			Class448.aClass330_Sub50_5555 = Class106.method1322((byte) -26);
			if (Class448.aClass330_Sub50_5555.aClass464_Sub24_7904.method5825((byte) -17) == 1)
				Class356.aBoolean3694 = false;
			if (Class457.aClass457_6834 == Class404.aClass457_4162)
				Class507.aClass498_5932.aString5886 = Class293.anApplet6804.getCodeBase().getHost();
			else if (Class457.method5662(Class404.aClass457_4162, -426854243)) {
				Class507.aClass498_5932.aString5886 = Class293.anApplet6804.getCodeBase().getHost();
				Class507.aClass498_5932.anInt5887 = (1405932864 + 116751407 * Class507.aClass498_5932.anInt5889);
				Class507.aClass498_5937.anInt5887 = (1405932864 + Class507.aClass498_5937.anInt5889 * 116751407);
				Class507.aClass498_5932.anInt5885 = (523924231 * Class507.aClass498_5932.anInt5889 + -1149535984);
				Class507.aClass498_5937.anInt5885 = (-1149535984 + Class507.aClass498_5937.anInt5889 * 523924231);
			} else if (Class404.aClass457_4162 == Class457.aClass457_6837) {
				Class507.aClass498_5932.aString5886 = Class215.aString2083;
				Class507.aClass498_5937.aString5886 = Class215.aString2083;
				Class507.aClass498_5932.anInt5887 = (1405932864 + Class507.aClass498_5932.anInt5889 * 116751407);
				Class507.aClass498_5937.anInt5887 = (116751407 * Class507.aClass498_5937.anInt5889 + 1405932864);
				Class507.aClass498_5932.anInt5885 = (523924231 * Class507.aClass498_5932.anInt5889 + -1149535984);
				Class507.aClass498_5937.anInt5885 = (-1149535984 + 523924231 * Class507.aClass498_5937.anInt5889);
			}
			Class507.aClass498_5930 = Class507.aClass498_5932;
			if (Class435.aClass435_4421 == aClass435_9146)
				aBoolean9157 = false;
			IndexTable.aShortArray2907 = Class473.aShortArray5631 = Class551.aShortArray6351 = ItemDefinitions.otherModifiedModelColors = new short[256];
			try {
				Class391.aClipboard4063 = Class432_Sub1_Sub3_Sub1.method5526((byte) 101).getToolkit().getSystemClipboard();
			} catch (Exception exception) {
				/* empty */
			}
			Class238.aClass355_2583 = Class386.method4436(Class475.aCanvas5700, (short) -23692);
			Class464_Sub23.aClass350_8712 = Class169.method2032(Class475.aCanvas5700, true, (byte) 48);
			Class401_Sub1.aClass145_Sub1_8249 = new Class145_Sub1(aClass532_9236);
			if (Class457.aClass457_6834 != Class404.aClass457_4162)
				aBoolean8983 = true;
			aString6613 = Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434);
			Class43.aClass276_10073 = new Class276();
			new Thread(Class43.aClass276_10073).start();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.aw(").append(')').toString());
		}
	}

	final void method3883(byte i) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(398761731) == 2) {
				try {
					method3911(881162839);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class207.method2195(new StringBuilder().append(throwable.getMessage()).append(" ").append(method3886(1616755277)).toString(), throwable, -306254718);
					aBoolean9059 = true;
					Class136.method1591(Class533.aClass533_6903, 1185934612);
					Class171.method2046(0, false, -906930741);
				}
			} else
				method3911(881162839);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.ap(").append(')').toString());
		}
	}

	void method3911(int i) {
		try {
			if (13 != anInt8995 * -296919301) {
				if (aBoolean9031) {
					synchronized (anObject9081) {
						anObject9081.notify();
					}
					synchronized (anObject9032) {
						try {
							anObject9032.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					aBoolean9031 = false;
				}
				anInt8981 += 659076639;
				if (anInt8981 * 822953439 % 1000 == 1) {
					GregorianCalendar gregoriancalendar = new GregorianCalendar();
					Class382.anInt6680 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6) * 1480605503;
					aRandom9066.setSeed((long) (-74764097 * Class382.anInt6680));
				}
				aClass1_9025.method383(-402699298);
				aClass1_9060.method383(679293601);
				method3913(534436443);
				if (null != Class422.aClass277_4322)
					Class422.aClass277_4322.method2734(1575394921);
				Class158.method1845(484297180);
				Class56.method645(-1418423119);
				Class238.aClass355_2583.method4107((byte) 80);
				Class464_Sub23.aClass350_8712.method4039((byte) -80);
				if (Class361.aClass_ra3793 != null)
					Class361.aClass_ra3793.g((int) Class312.method3111((byte) 101));
				anInt9000 = 0;
				anInt9003 = 0;
				for (Interface18 interface18 = Class238.aClass355_2583.method4114(-1248390640); interface18 != null; interface18 = Class238.aClass355_2583.method4114(1581358487)) {
					int i_2_ = interface18.method273(-1180498745);
					if (2 == i_2_ || i_2_ == 3) {
						char c = interface18.method270(1820621597);
						if (Class78.method932(-461631415) && (c == '`' || '\u00a7' == c || c == '\u00b2')) {
							if (Class511.method6184(-2104633420))
								Class26.method488(-275800617);
							else
								Class526.method6261(1790970317);
						} else if (anInt9000 * -774446383 < 131) {
							anInterface18Array9001[anInt9000 * -774446383] = interface18;
							anInt9000 += -2109819343;
						}
					} else if (0 == i_2_) {
						if (anInt9182 * -2051927139 >= 2 && Class78.method932(-461631415) && interface18.method264((byte) 0) == 28 && Class238.aClass355_2583.isKeyHeld(82, -669219465)) {
							if (Class353.method4076((byte) -71))
								Class456.method5656(827836302);
							else
								Class438.method5595(1348380265);
						}
						if (1129657189 * anInt9003 < 75) {
							anInterface18Array9004[1129657189 * anInt9003] = interface18;
							anInt9003 += -704264595;
						}
					}
				}
				mouseNotches = 0;
				for (Class330_Sub44 class330_sub44 = Class464_Sub23.aClass350_8712.method4032((byte) -73); null != class330_sub44; class330_sub44 = Class464_Sub23.aClass350_8712.method4032((byte) -105)) {
					int i_3_ = class330_sub44.method3709((short) -5706);
					if (-1 == i_3_)
						Class464_Sub18.method5802(class330_sub44, (byte) -2);
					else if (6 == i_3_) {
						mouseNotches += (class330_sub44.method3722((byte) -78) * 55770159);
						class330_sub44.method3714(-760657315);
					} else if (Class391.method4606(i_3_, (byte) 11)) {
						aClass471_8997.method5878(class330_sub44, (short) 8192);
						if (aClass471_8997.method5875(1215194240) > 10) {
							Class330_Sub44 class330_sub44_4_ = ((Class330_Sub44) aClass471_8997.method5867((short) 8960));
							if (null != class330_sub44_4_)
								class330_sub44_4_.method3714(-1189233064);
						}
					} else if (mouseNotches != 0 && Class238.aClass355_2583.isKeyHeld(82, 1087324266)) {
		                 SpecialKeys.adjustZoom(mouseNotches);
		            }
				}
				if (Class511.method6184(-1051280143))
					Class_ra_Sub3.method5211((byte) 27);
				if (CacheIndex.method1522(-296919301 * anInt8995, (byte) -44)) {
					Class89.method1060((byte) 16);
					Class376.method4367((byte) 24);
				} else if (Class438.method5593(anInt8995 * -296919301, 182780963))
					aClass304_9030.method3017(186314141);
				if (Class522.method6230(anInt8995 * -296919301, -1883918687) && !Class438.method5593(anInt8995 * -296919301, -651108939)) {
					method3914((byte) 75);
					Class288.method2890((byte) 38);
					Class457.method5659(-166929663);
				} else if (Class226.method2307(-296919301 * anInt8995, (byte) 49) && !Class438.method5593(anInt8995 * -296919301, -1715948411)) {
					method3914((byte) 77);
					Class457.method5659(288815789);
				} else if (4 == anInt8995 * -296919301)
					Class457.method5659(497855348);
				else if (Class475_Sub5.method5958(anInt8995 * -296919301, 885477300) && !Class438.method5593(-296919301 * anInt8995, 165173322))
					Class331.method3876((short) -4527);
				else if (9 == -296919301 * anInt8995 || 0 == anInt8995 * -296919301) {
					Class457.method5659(-600098731);
					if (-3 != Class360.anInt3775 * 1926206853 && 2 != Class360.anInt3775 * 1926206853 && 15 != Class360.anInt3775 * 1926206853) {
						if (anInt8995 * -296919301 == 0) {
							Class360.anInt3785 = -126740189 * Class360.anInt3756;
							Class360.anInt3784 = 33912111 * Class360.anInt3787;
							Class360.anInt3760 = -1550159207 * Class360.anInt3775;
							if (Class330_Sub3.aBoolean7514) {
								IndexTable.method2783((Class357.aClass498_3703.anInt5889) * -115752509, (Class357.aClass498_3703.aString5886), -988109230);
								aClass1_9025.method377(44744465);
								Class227.method2311(9, -1188873169);
							} else
								Class330_Sub31.logout((Class360.lobby), 1917727483);
						} else
							Class330_Sub31.logout(false, 1017282213);
					}
				}
				Class464_Sub10.method5773(Class361.aClass_ra3793, 909396466);
				aClass471_8997.method5867((short) 8960);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.es(").append(')').toString());
		}
	}

	static final void method3912() {
		int[][] is = aClass304_9030.method2997((byte) -37);
		int i = aClass304_9030.method2990(-828382691);
		int i_5_ = aClass304_9030.method3033((byte) 13);
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			int[] is_7_ = is[i_6_];
			for (int i_8_ = 0; i_8_ < i_5_; i_8_++)
				is_7_[i_8_] = 0;
		}
	}

	final void method3903(int i) {
		try {
			if (aBoolean9206)
				Class330_Sub11.method3291(-551631190);
			Class132.method1566((byte) -82);
			if (null != Class361.aClass_ra3793)
				Class361.aClass_ra3793.method4781(628001038);
			if (Class503.aBoolean5914 && null != Class130.aFrame1498) {
				Class417.method5268(Class203.aClass504_6790, Class130.aFrame1498, 2004129524);
				Class130.aFrame1498 = null;
			}
			aClass1_9025.method379(1175619289);
			((Class1) aClass1_9025).aClass409_38.method4772(-651777902);
			aClass1_9060.method379(1175619289);
			((Class1) aClass1_9060).aClass409_38.method4772(-651777902);
			Class467.method5859(-1578375990);
			Class140_Sub1.aClass285_7263.method2840((byte) -99);
			Class497.aClass267_5883.method2653((byte) 114);
			if (aClass423_9029 != null) {
				aClass423_9029.method5299(20610519);
				aClass423_9029 = null;
			}
			try {
				Ping.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			Class383.method4412((byte) -36);
			try {
				Class314.method3119((byte) 99);
			} catch (Exception exception) {
				/* empty */
			}
			if (aBoolean6618)
				Class150_Sub2.method1771(1330526672);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.as(").append(')').toString());
		}
	}

	void method3913(int i) {
		try {
			boolean bool = Class140_Sub1.aClass285_7263.method2837((byte) -24);
			if (!bool)
				method3922(1097414119);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.fy(").append(')').toString());
		}
	}

	final void method3914(byte i) {
		try {
			if ((anInt8995 * -296919301 == 15 && !Class434.method5564(-1738122274)) || (11 == -296919301 * anInt8995 && 42 == Class360.anInt3775 * 1926206853) || (3 == -296919301 * anInt8995 && (49 == 178880377 * Class360.anInt3781 || 178880377 * Class360.anInt3781 == 52)) || anInt8995 * -296919301 == 14) {
				if (1788170519 * anInt9026 > 1) {
					anInt9026 -= 473233063;
					anInt9208 = anInt9268 * 1439714889;
				}
				if (!Class484.aBoolean5782)
					Class_ta.method5676(-464857576);
				if (anInt8995 * -296919301 != 3 || (Class360.anInt3781 * 178880377 != 49 && Class360.anInt3781 * 178880377 != 52)) {
					for (int i_9_ = 0; i_9_ < 100; i_9_++) {
						if (!Class432_Sub1_Sub4_Sub1.method5539(aClass1_9060, 1874004498)) {
							if (i > 66)
								break;
							return;
						}
					}
				}
			}
			Class500.method6122((byte) 36);
			Class523.method6238(-1588943140);
			anInt9210 += 69522641;
			Class_na.method3513(-1, -1, (byte) 115);
			Class198.method2155(null, -1, -1, 325168703);
			Class415.method5247(1846273211);
			anInt9268 += -654059805;
			for (int i_10_ = 0; i_10_ < -1183709625 * anInt9232; i_10_++) {
				NPC class432_sub1_sub1_sub1_sub2 = ((NPC) aClass330_Sub35Array9015[i_10_].anObject7733);
				if (class432_sub1_sub1_sub1_sub2 == null) {
					if (i <= 66)
						return;
				} else {
					byte i_11_ = (class432_sub1_sub1_sub1_sub2.aClass551_10251.aByte6322);
					if ((i_11_ & 0x1) == 0) {
						if (i <= 66)
							return;
					} else {
						int i_12_ = class432_sub1_sub1_sub1_sub2.method5453(-1680112928);
						if ((i_11_ & 0x2) != 0 && 0 == (815331179 * class432_sub1_sub1_sub1_sub2.anInt10056) && Math.random() * 1000.0 < 10.0) {
							int i_13_ = (int) Math.round(Math.random() * 10.0 - 5.0);
							int i_14_ = (int) Math.round(Math.random() * 10.0 - 5.0);
							if (0 != i_13_ || i_14_ != 0) {
								int i_15_ = ((class432_sub1_sub1_sub1_sub2.anIntArray10018[0]) + i_13_);
								int i_16_ = i_14_ + (class432_sub1_sub1_sub1_sub2.anIntArray10059[0]);
								if (i_15_ < 0)
									i_15_ = 0;
								else if (i_15_ > (aClass304_9030.method2990(-1745721465) - i_12_ - 1))
									i_15_ = (aClass304_9030.method2990(-1956527070) - i_12_ - 1);
								if (i_16_ < 0)
									i_16_ = 0;
								else if (i_16_ > (aClass304_9030.method3033((byte) -28) - i_12_ - 1))
									i_16_ = (aClass304_9030.method3033((byte) -18) - i_12_ - 1);
								int i_17_ = (Class166_Sub1.method2000((class432_sub1_sub1_sub1_sub2.anIntArray10018[0]), (class432_sub1_sub1_sub1_sub2.anIntArray10059[0]), i_12_, Class268.method2660(i_15_, i_16_, i_12_, i_12_, 0, 485788026), (aClass304_9030.method2996((class432_sub1_sub1_sub1_sub2.aByte8658), 1875135057)), true, anIntArray9051, anIntArray9052, -274130372));
								if (i_17_ > 0) {
									if (i_17_ > 9)
										i_17_ = 9;
									for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
										class432_sub1_sub1_sub1_sub2.anIntArray10018[i_18_] = (anIntArray9051[i_17_ - i_18_ - 1]);
										class432_sub1_sub1_sub1_sub2.anIntArray10059[i_18_] = (anIntArray9052[i_17_ - i_18_ - 1]);
										class432_sub1_sub1_sub1_sub2.aByteArray10017[i_18_] = (Class299.aClass299_6807.aByte6805);
									}
									class432_sub1_sub1_sub1_sub2.anInt10056 = 393772355 * i_17_;
								}
							}
						}
						Class123.method1511(class432_sub1_sub1_sub1_sub2, true, 914102349);
						int i_19_ = (Class95_Sub3.method1114(class432_sub1_sub1_sub1_sub2, (byte) -42));
						Class81.method952(class432_sub1_sub1_sub1_sub2, -2134114876);
						Class405.method4747(class432_sub1_sub1_sub1_sub2, Class477.anInt5718 * 1875061379, Class421.anInt4318 * -1540682783, i_19_, -1636637674);
						Class285.method2863(class432_sub1_sub1_sub1_sub2, Class477.anInt5718 * 1875061379, (byte) -26);
						Class95_Sub12.method1135(class432_sub1_sub1_sub1_sub2, -745600378);
						Class244 class244 = Class244.method2428();
						class244.method2420(Class257.method2541(class432_sub1_sub1_sub1_sub2.aClass238_10053.method2370(1993460890)), Class257.method2541(class432_sub1_sub1_sub1_sub2.aClass238_10055.method2370(593082283)), Class257.method2541(class432_sub1_sub1_sub1_sub2.aClass238_10054.method2370(47369926)));
						class432_sub1_sub1_sub1_sub2.method5356(class244);
						class244.method2417();
					}
				}
			}
			if ((6 == anInt8995 * -296919301 || 11 == -296919301 * anInt8995 || -296919301 * anInt8995 == 15 || anInt8995 * -296919301 == 14) && (!Class434.method5564(-1539255192) || (anInt8995 * -296919301 == 11 && Class360.anInt3775 * 1926206853 == 42) || (3 == -296919301 * anInt8995 && (178880377 * Class360.anInt3781 == 49 || Class360.anInt3781 * 178880377 == 52))) && !Class509.method6165(47374417)) {
				if (3 == Class147.anInt1621 * -1551406343)
					Class250.method2520((byte) -98);
				else
					Class353.method4078((byte) -32);
				if (Class471.anInt5612 * -1795110955 >> 9 < 14 || (-1795110955 * Class471.anInt5612 >> 9 >= aClass304_9030.method2990(-1687633091) - 14) || Class325_Sub3.anInt7484 * 1947030235 >> 9 < 14 || (Class325_Sub3.anInt7484 * 1947030235 >> 9 >= aClass304_9030.method3033((byte) -120) - 14))
					aClass304_9030.method3026(new Class300((OutgoingPacketManager.aClass310_3215), null), 2093536010);
			}
			for (;;) {
				Class330_Sub42 class330_sub42 = (Class330_Sub42) aClass471_9209.method5867((short) 8960);
				if (class330_sub42 == null) {
					if (i <= 66)
						throw new IllegalStateException();
					break;
				}
				IComponentDefinitions iComponentDefinitions = class330_sub42.aClass114_7809;
				if (-790144721 * iComponentDefinitions.anInt1287 >= 0) {
					IComponentDefinitions class114_20_ = Class95.method1101(861085587 * iComponentDefinitions.anInt1211, 592815467);
					if (null == class114_20_ || null == class114_20_.aClass114Array1347 || (-790144721 * iComponentDefinitions.anInt1287 >= class114_20_.aClass114Array1347.length))
						continue;
					if ((class114_20_.aClass114Array1347[-790144721 * iComponentDefinitions.anInt1287]) != iComponentDefinitions) {
						if (i <= 66)
							throw new IllegalStateException();
						continue;
					}
				}
				Class117.method1423(class330_sub42, -1631194987);
			}
			for (;;) {
				Class330_Sub42 class330_sub42 = (Class330_Sub42) aClass471_9219.method5867((short) 8960);
				if (class330_sub42 == null) {
					if (i <= 66) {
						/* empty */
					}
					break;
				}
				IComponentDefinitions iComponentDefinitions = class330_sub42.aClass114_7809;
				if (-790144721 * iComponentDefinitions.anInt1287 >= 0) {
					IComponentDefinitions class114_21_ = Class95.method1101(861085587 * iComponentDefinitions.anInt1211, -494465032);
					if (null == class114_21_ || null == class114_21_.aClass114Array1347 || (iComponentDefinitions.anInt1287 * -790144721 >= class114_21_.aClass114Array1347.length))
						continue;
					if (iComponentDefinitions != (class114_21_.aClass114Array1347[-790144721 * iComponentDefinitions.anInt1287])) {
						if (i <= 66) {
							/* empty */
						}
						continue;
					}
				}
				Class117.method1423(class330_sub42, -1631194987);
			}
			for (;;) {
				Class330_Sub42 class330_sub42 = (Class330_Sub42) aClass471_9280.method5867((short) 8960);
				if (class330_sub42 == null) {
					if (i <= 66)
						throw new IllegalStateException();
					break;
				}
				IComponentDefinitions iComponentDefinitions = class330_sub42.aClass114_7809;
				if (iComponentDefinitions.anInt1287 * -790144721 >= 0) {
					IComponentDefinitions class114_22_ = Class95.method1101(iComponentDefinitions.anInt1211 * 861085587, -383734178);
					if (null == class114_22_ || null == class114_22_.aClass114Array1347 || (iComponentDefinitions.anInt1287 * -790144721 >= class114_22_.aClass114Array1347.length))
						continue;
					if (iComponentDefinitions != (class114_22_.aClass114Array1347[iComponentDefinitions.anInt1287 * -790144721])) {
						if (i <= 66)
							throw new IllegalStateException();
						continue;
					}
				}
				Class117.method1423(class330_sub42, -1631194987);
			}
			if (aClass114_9165 != null)
				Class138.method1606((byte) 1);
			if (822953439 * anInt8981 % 1500 == 0)
				Class408.method4766(405347915);
			if ((15 == -296919301 * anInt8995 && !Class434.method5564(-1813757058)) || (11 == anInt8995 * -296919301 && 1926206853 * Class360.anInt3775 == 42) || (3 == -296919301 * anInt8995 && (49 == 178880377 * Class360.anInt3781 || 178880377 * Class360.anInt3781 == 52)))
				Class157.method1830(-1380266287);
			Class278.method2742((byte) -64);
			if (aBoolean9206 && (aLong8990 * 7469708061286789973L < Class312.method3111((byte) 121) - 60000L))
				Class330_Sub11.method3291(-5445522);
			for (Class325_Sub5 class325_sub5 = (Class325_Sub5) aClass467_9260.method5854(-1713342410); class325_sub5 != null; class325_sub5 = ((Class325_Sub5) aClass467_9260.method5857(-2085717940))) {
				if ((long) (-1877380321 * ((Class325_Sub5) class325_sub5).anInt7487) < Class312.method3111((byte) 79) / 1000L - 5L) {
					if (((Class325_Sub5) class325_sub5).aShort7489 > 0)
						Class556.method6406(5, 0, "", "", "", new StringBuilder().append(((Class325_Sub5) class325_sub5).aString7488).append(Class526.aClass526_6165.method6257(Class429.aClass454_4369, 991479434)).toString(), -1857007665);
					if (0 == ((Class325_Sub5) class325_sub5).aShort7489)
						Class556.method6406(5, 0, "", "", "", new StringBuilder().append(((Class325_Sub5) class325_sub5).aString7488).append(Class526.aClass526_6159.method6257(Class429.aClass454_4369, 991479434)).toString(), -1758196524);
					class325_sub5.method3204(-256147812);
				}
			}
			if ((15 == anInt8995 * -296919301 && !Class434.method5564(-1440911622)) || (-296919301 * anInt8995 == 11 && 1926206853 * Class360.anInt3775 == 42) || (anInt8995 * -296919301 == 3 && (178880377 * Class360.anInt3781 == 49 || Class360.anInt3781 * 178880377 == 52)) || anInt8995 * -296919301 == 14) {
				if (anInt8995 * -296919301 != 11 && aClass1_9060.method380(-246224818) == null)
					Class330_Sub31.logout(false, 1123198146);
				else if (aClass1_9060 != null) {
					aClass1_9060.anInt29 += -1349860145;
					if (936362543 * aClass1_9060.anInt29 > 50) {
						Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.PING_PACKET, aClass1_9060.aClass488_22, 751186879);
						aClass1_9060.method378(class330_sub34, -1797159610);
					}
					try {
						aClass1_9060.method381(-115904453);
					} catch (IOException ioexception) {
						if (11 == -296919301 * anInt8995)
							aClass1_9060.method379(1175619289);
						else
							Class330_Sub31.logout(false, 2129654222);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.gp(").append(')').toString());
		}
	}

	static final void method3915(int i) {
		int i_23_ = Class15.anInt192 * -1468156857;
		int[] is = Class15.anIntArray187;
		int[][] is_24_ = aClass304_9030.method2997((byte) 57);
		int[][] is_25_ = aClass304_9030.method2998(-951934233);
		int i_26_;
		if (0 == 1909266069 * anInt8987)
			i_26_ = Class96.aClass85Array854.length;
		else
			i_26_ = anInt9017 * -823688441 + i_23_;
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1;
			if (1909266069 * anInt8987 == 0) {
				Class85 class85 = Class96.aClass85Array854[i_27_];
				if (!class85.aBoolean705)
					continue;
				class432_sub1_sub1_sub1 = class85.method973(-1160484525);
			} else {
				if (i_27_ < i_23_)
					class432_sub1_sub1_sub1 = players[is[i_27_]];
				else
					class432_sub1_sub1_sub1 = ((Class432_Sub1_Sub1_Sub1) (((Class330_Sub35) aClass497_9014.method6094((long) anIntArray9018[i_27_ - i_23_])).anObject7733));
				if (class432_sub1_sub1_sub1.aByte8658 != i || class432_sub1_sub1_sub1.anInt10052 * -806256501 < 0)
					continue;
			}
			int i_28_ = class432_sub1_sub1_sub1.method5453(-545602695);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			if (0 == (i_28_ & 0x1)) {
				if (0 != ((int) class260.aFloat2716 & 0x1ff) || ((int) class260.aFloat2711 & 0x1ff) != 0)
					continue;
			} else if (256 != ((int) class260.aFloat2716 & 0x1ff) || 256 != ((int) class260.aFloat2711 & 0x1ff))
				continue;
			if (i_28_ == 1) {
				int i_29_ = (int) class260.aFloat2716 >> 9;
				int i_30_ = (int) class260.aFloat2711 >> 9;
				if (class432_sub1_sub1_sub1.anInt10052 * -806256501 > is_24_[i_29_][i_30_]) {
					is_24_[i_29_][i_30_] = -806256501 * class432_sub1_sub1_sub1.anInt10052;
					is_25_[i_29_][i_30_] = 1;
				} else if (class432_sub1_sub1_sub1.anInt10052 * -806256501 == is_24_[i_29_][i_30_])
					is_25_[i_29_][i_30_]++;
			} else {
				int i_31_ = 60 + 256 * (i_28_ - 1);
				int i_32_ = (int) class260.aFloat2716 - i_31_ >> 9;
				int i_33_ = (int) class260.aFloat2711 - i_31_ >> 9;
				int i_34_ = (int) class260.aFloat2716 + i_31_ >> 9;
				int i_35_ = i_31_ + (int) class260.aFloat2711 >> 9;
				for (int i_36_ = i_32_; i_36_ <= i_34_; i_36_++) {
					for (int i_37_ = i_33_; i_37_ <= i_35_; i_37_++) {
						if (-806256501 * class432_sub1_sub1_sub1.anInt10052 > is_24_[i_36_][i_37_]) {
							is_24_[i_36_][i_37_] = (-806256501 * class432_sub1_sub1_sub1.anInt10052);
							is_25_[i_36_][i_37_] = 1;
						} else if ((-806256501 * class432_sub1_sub1_sub1.anInt10052) == is_24_[i_36_][i_37_])
							is_25_[i_36_][i_37_]++;
					}
				}
			}
		}
	}

	static final void method3916() {
		anInt9095 = 0;
		for (int i = 0; i < -823688441 * anInt9017; i++) {
			NPC class432_sub1_sub1_sub1_sub2 = ((NPC) (((Class330_Sub35) aClass497_9014.method6094((long) anIntArray9018[i])).anObject7733));
			if (class432_sub1_sub1_sub1_sub2.aBoolean10012 && (class432_sub1_sub1_sub1_sub2.method5435(-1957771775) != -1)) {
				int i_38_ = ((class432_sub1_sub1_sub1_sub2.method5453(-1635488477) - 1) * 256 + 252);
				Class260 class260 = class432_sub1_sub1_sub1_sub2.method5346().aClass260_2606;
				int i_39_ = (int) class260.aFloat2716 - i_38_ >> 9;
				int i_40_ = (int) class260.aFloat2711 - i_38_ >> 9;
				Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1 = Class548.method6358((class432_sub1_sub1_sub1_sub2.aByte8658), i_39_, i_40_, 691399381);
				if (class432_sub1_sub1_sub1 != null) {
					int i_41_ = -1654044763 * class432_sub1_sub1_sub1.anInt10008;
					if (class432_sub1_sub1_sub1 instanceof NPC)
						i_41_ += 2048;
					if (0 == class432_sub1_sub1_sub1.anInt10013 * -2060617325 && (class432_sub1_sub1_sub1.method5435(-1957771775) != -1)) {
						anIntArray9093[-937913107 * anInt9095] = i_41_;
						anIntArray9094[-937913107 * anInt9095] = i_41_;
						anInt9095 += 834463973;
						class432_sub1_sub1_sub1.anInt10013 += 637111451;
					}
					anIntArray9093[-937913107 * anInt9095] = i_41_;
					anIntArray9094[-937913107 * anInt9095] = 2048 + (class432_sub1_sub1_sub1_sub2.anInt10008 * -1654044763);
					anInt9095 += 834463973;
					class432_sub1_sub1_sub1.anInt10013 += 637111451;
				}
			}
		}
		Class297.method2969(anIntArray9094, anIntArray9093, 0, -937913107 * anInt9095 - 1, -1943771105);
	}

	public static final void method3917(Class120 class120, IComponentDefinitions[] class114s, int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_) {
		for (int i_50_ = 0; i_50_ < class114s.length; i_50_++) {
			IComponentDefinitions iComponentDefinitions = class114s[i_50_];
			if (null != iComponentDefinitions && iComponentDefinitions.anInt1211 * 861085587 == i) {
				int i_51_ = -1036156047 * iComponentDefinitions.anInt1329 + i_46_;
				int i_52_ = i_47_ + iComponentDefinitions.anInt1209 * -1600154343;
				int i_53_;
				int i_54_;
				int i_55_;
				int i_56_;
				if (2 == iComponentDefinitions.anInt1198 * 1849136745) {
					i_53_ = i_42_;
					i_54_ = i_43_;
					i_55_ = i_44_;
					i_56_ = i_45_;
				} else {
					int i_57_ = -681123409 * iComponentDefinitions.anInt1210 + i_51_;
					int i_58_ = iComponentDefinitions.anInt1348 * 694142557 + i_52_;
					if (iComponentDefinitions.anInt1198 * 1849136745 == 9) {
						i_57_++;
						i_58_++;
					}
					i_53_ = i_51_ > i_42_ ? i_51_ : i_42_;
					i_54_ = i_52_ > i_43_ ? i_52_ : i_43_;
					i_55_ = i_57_ < i_44_ ? i_57_ : i_44_;
					i_56_ = i_58_ < i_45_ ? i_58_ : i_45_;
				}
				if (iComponentDefinitions.anInt1198 * 1849136745 != 0 && !iComponentDefinitions.aBoolean1293 && method3924(iComponentDefinitions).anInt7510 * -1700263873 == 0 && iComponentDefinitions != aClass114_9242 && (-1713237605 * IComponentDefinitions.anInt1178 != -853879291 * iComponentDefinitions.anInt1207) && (iComponentDefinitions.anInt1207 * -853879291 != IComponentDefinitions.anInt1183 * 277659025) && (IComponentDefinitions.anInt1307 * -462171043 != -853879291 * iComponentDefinitions.anInt1207) && (624272509 * IComponentDefinitions.anInt1341 != iComponentDefinitions.anInt1207 * -853879291)) {
					if (i_53_ < i_55_ && i_54_ < i_56_)
						Class204.method2183(iComponentDefinitions, -1569836858);
				} else if (!method3918(iComponentDefinitions)) {
					if (iComponentDefinitions == aClass114_9165 && Class497.method6102(aClass114_9165, 1595539344)) {
						aBoolean9175 = true;
						anInt9176 = i_51_ * -806590413;
						anInt9177 = 1038068317 * i_52_;
					}
					if (iComponentDefinitions.aBoolean1274 || i_53_ < i_55_ && i_54_ < i_56_) {
						if (iComponentDefinitions.aBoolean1251 && i_48_ >= i_53_ && i_49_ >= i_54_ && i_48_ < i_55_ && i_49_ < i_56_) {
							for (Class330_Sub42 class330_sub42 = ((Class330_Sub42) aClass471_9280.method5869(539664854)); class330_sub42 != null; class330_sub42 = ((Class330_Sub42) aClass471_9280.method5873((byte) -103))) {
								if (class330_sub42.aBoolean7808) {
									class330_sub42.method3252(-340579367);
									class330_sub42.aClass114_7809.aBoolean1349 = false;
								}
							}
							if (0 == 1556720903 * Class307.anInt3169) {
								aClass114_9165 = null;
								aClass114_9242 = null;
							}
							anInt9179 = 0;
							Class354_Sub1.aBoolean7981 = false;
							aBoolean9254 = false;
							if (!Class484.aBoolean5782)
								Class_ta.method5676(1266919066);
						}
						boolean bool = (iComponentDefinitions.aBoolean1237 && iComponentDefinitions.anInt1198 * 1849136745 == 5 && iComponentDefinitions.anInt1226 * -84166611 == 0 && -732237595 * iComponentDefinitions.anInt1275 < 0 && -1 == iComponentDefinitions.anInt1335 * -1053848421 && iComponentDefinitions.anInt1292 * -1191962979 == -1 && !iComponentDefinitions.aBoolean1355 && 1434092661 * iComponentDefinitions.anInt1184 == 0);
						boolean bool_59_ = false;
						if (i_48_ >= i_53_ && i_49_ >= i_54_ && i_48_ < i_55_ && i_49_ < i_56_) {
							if (bool) {
								Class122 class122 = iComponentDefinitions.method1396((Class361.aClass_ra3793), (byte) -22);
								if (class122 == null || (-681123409 * iComponentDefinitions.anInt1210 != -1683271523 * class122.anInt1407) || (-1389305879 * class122.anInt1405 != 694142557 * iComponentDefinitions.anInt1348))
									bool_59_ = true;
								else {
									int i_60_ = i_48_ - i_51_;
									int i_61_ = i_49_ - i_52_;
									if (i_61_ >= 0 && i_61_ < (class122.anIntArray1404).length) {
										int i_62_ = class122.anIntArray1404[i_61_];
										if (i_60_ >= i_62_ && (i_60_ <= i_62_ + (class122.anIntArray1406[i_61_])))
											bool_59_ = true;
									}
								}
							} else
								bool_59_ = true;
						}
						if (!aBoolean9150 && bool_59_) {
							if (647410103 * iComponentDefinitions.anInt1218 >= 0)
								anInt9147 = 70182077 * iComponentDefinitions.anInt1218;
							else if (iComponentDefinitions.aBoolean1251)
								anInt9147 = 907195093;
						}
						if (!Class484.aBoolean5782 && bool_59_ && !class120.aBoolean1402)
							Class330_Sub34.method3438(iComponentDefinitions, i_48_ - i_51_, i_49_ - i_52_, (byte) 29);
						boolean bool_63_ = false;
						if (Class464_Sub23.aClass350_8712.method4027(228875646) && bool_59_)
							bool_63_ = true;
						boolean bool_64_ = false;
						Class330_Sub44 class330_sub44 = ((Class330_Sub44) aClass471_8997.method5869(539664854));
						if (class330_sub44 != null && class330_sub44.method3709((short) -11971) == 0 && class330_sub44.method3710((byte) -33) >= i_53_ && class330_sub44.method3711(912501867) >= i_54_ && class330_sub44.method3710((byte) -73) < i_55_ && class330_sub44.method3711(272869809) < i_56_) {
							if (bool) {
								Class122 class122 = iComponentDefinitions.method1396((Class361.aClass_ra3793), (byte) -92);
								if (class122 == null || (-681123409 * iComponentDefinitions.anInt1210 != class122.anInt1407 * -1683271523) || (iComponentDefinitions.anInt1348 * 694142557 != class122.anInt1405 * -1389305879))
									bool_64_ = true;
								else {
									int i_65_ = (class330_sub44.method3710((byte) -28) - i_51_);
									int i_66_ = (class330_sub44.method3711(1817694834) - i_52_);
									if (i_66_ >= 0 && i_66_ < (class122.anIntArray1404).length) {
										int i_67_ = class122.anIntArray1404[i_66_];
										if (i_65_ >= i_67_ && i_65_ <= (class122.anIntArray1406[i_66_]) + i_67_)
											bool_64_ = true;
									}
								}
							} else
								bool_64_ = true;
						}
						if (iComponentDefinitions.aBoolean1274 && !Class511.method6184(-1050395511)) {
							for (int i_68_ = 0; i_68_ < iComponentDefinitions.aByteArrayArray1351.length; i_68_++) {
								boolean bool_69_ = false;
								boolean bool_70_ = false;
								if (iComponentDefinitions.anIntArray1278[i_68_] > 0) {
									for (int i_71_ = 0; i_71_ < anInt9000 * -774446383; i_71_++) {
										if (iComponentDefinitions.anIntArray1278[i_68_] == anInterface18Array9001[i_71_].method270(1661733839)) {
											bool_69_ = true;
											if (null == iComponentDefinitions.anIntArray1246 || ((iComponentDefinitions.anIntArray1246[i_68_]) <= anInt8981 * 822953439))
												bool_70_ = true;
											break;
										}
									}
								}
								if (!bool_69_ && (iComponentDefinitions.aByteArrayArray1351[i_68_] != null)) {
									for (int i_72_ = 0; i_72_ < (iComponentDefinitions.aByteArrayArray1351[i_68_]).length; i_72_++) {
										if (Class238.aClass355_2583.isKeyHeld((iComponentDefinitions.aByteArrayArray1351[i_68_][i_72_]), 1416872204)) {
											bool_69_ = true;
											if (iComponentDefinitions.anIntArray1246 != null && ((iComponentDefinitions.anIntArray1246[i_68_]) > anInt8981 * 822953439))
												break;
											byte i_73_ = (iComponentDefinitions.aByteArrayArray1276[i_68_][i_72_]);
											if (0 == i_73_ || ((0 == (i_73_ & 0x8) || (!(Class238.aClass355_2583.isKeyHeld(86, 1422332685)) && !(Class238.aClass355_2583.isKeyHeld(82, 1306449347)) && !(Class238.aClass355_2583.isKeyHeld(81, -1149792705)))) && (0 == (i_73_ & 0x2) || (Class238.aClass355_2583.isKeyHeld(86, 848592404))) && (0 == (i_73_ & 0x1) || (Class238.aClass355_2583.isKeyHeld(82, -738733240))) && (0 == (i_73_ & 0x4) || (Class238.aClass355_2583.isKeyHeld(81, -1043394075))))) {
												bool_70_ = true;
												break;
											}
										}
									}
								}
								if (bool_70_) {
									if (i_68_ < 10)
										Class498.method6110(1 + i_68_, (iComponentDefinitions.anInt1196 * 751119487), (iComponentDefinitions.anInt1287 * -790144721), "", (byte) -74);
									else if (false && 10 == i_68_) {
										Class490.method6071(-1799482790);
										Class330_Sub2 class330_sub2 = method3924(iComponentDefinitions);
										Class400.method4708(iComponentDefinitions, class330_sub2.method3265((byte) 1), (class330_sub2.anInt7502 * -968253727), -2096747626);
										aString9152 = Class473.method5911(iComponentDefinitions, -942405578);
										if (aString9152 == null)
											aString9152 = "F1";
										aString9154 = new StringBuilder().append(iComponentDefinitions.aString1283).append(Class146.method1738(16777215, -849826454)).toString();
									}
									int i_74_ = iComponentDefinitions.anIntArray1277[i_68_];
									if (iComponentDefinitions.anIntArray1246 == null)
										iComponentDefinitions.anIntArray1246 = (new int[(iComponentDefinitions.aByteArrayArray1351).length]);
									if (i_74_ != 0)
										iComponentDefinitions.anIntArray1246[i_68_] = anInt8981 * 822953439 + i_74_;
									else
										iComponentDefinitions.anIntArray1246[i_68_] = 2147483647;
								}
								if (!bool_69_ && null != iComponentDefinitions.anIntArray1246)
									iComponentDefinitions.anIntArray1246[i_68_] = 0;
							}
						}
						if (bool_64_)
							Class380.method4395(iComponentDefinitions, class330_sub44.method3710((byte) 72) - i_51_, class330_sub44.method3711(741080034) - i_52_, (byte) -88);
						if (aClass114_9165 != null && iComponentDefinitions != aClass114_9165 && bool_59_ && method3924(iComponentDefinitions).method3266(-1778501845))
							aClass114_9200 = iComponentDefinitions;
						if (iComponentDefinitions == aClass114_9242) {
							aBoolean9170 = true;
							anInt9171 = 948988185 * i_51_;
							anInt9172 = i_52_ * -1964317373;
							anInt9173 = 1270328327 * aClass114_9242.anInt1210;
							anInt9174 = 517433883 * aClass114_9242.anInt1348;
						}
						if (iComponentDefinitions.aBoolean1293 || 0 != -853879291 * iComponentDefinitions.anInt1207) {
							if (bool_59_ && 40356559 * mouseNotches != 0 && iComponentDefinitions.anObjectArray1338 != null) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aBoolean7808 = true;
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anInt7811 = mouseNotches * -553984881;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1338;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if (aClass114_9165 != null) {
								bool_64_ = false;
								bool_63_ = false;
							} else if (Class484.aBoolean5782 || ((IComponentDefinitions.anInt1180 * -1879269017 != iComponentDefinitions.anInt1207 * -853879291) && 99695317 * anInt9179 > 0)) {
								bool_64_ = false;
								bool_63_ = false;
								bool_59_ = false;
							}
							if (iComponentDefinitions.anInt1207 * -853879291 != 0) {
								if ((iComponentDefinitions.anInt1207 * -853879291 == IComponentDefinitions.anInt1307 * -462171043) || (624272509 * IComponentDefinitions.anInt1341 == -853879291 * iComponentDefinitions.anInt1207)) {
									aClass114_9163 = iComponentDefinitions;
									Class394 class394 = aClass304_9030.method3008(823794327).method4577(-1451069206);
									if (class394.method4625((byte) 114) != null && !Class43.aClass276_10073.method2724(987252282))
										class394.method4625((byte) 112).method3078(Class361.aClass_ra3793, iComponentDefinitions.anInt1348 * 694142557, Class448.aClass330_Sub50_5555.aClass464_Sub7_7891.method5760((byte) 93), 322393831);
									if ((-853879291 * iComponentDefinitions.anInt1207 == -462171043 * IComponentDefinitions.anInt1307) && !Class484.aBoolean5782 && i_48_ >= i_53_ && i_49_ >= i_54_ && i_48_ < i_55_ && i_49_ < i_56_) {
										Class494.method6084((Class361.aClass_ra3793), i_48_, i_49_, 571238882);
										for (Class325_Sub1 class325_sub1 = ((Class325_Sub1) (aClass467_9096.method5854(-558954111))); null != class325_sub1; class325_sub1 = ((Class325_Sub1) (aClass467_9096.method5857(-2085669732)))) {
											if (i_48_ >= (2006073183 * (((Class325_Sub1) class325_sub1).anInt7474)) && i_48_ < ((((Class325_Sub1) class325_sub1).anInt7471) * -1392390415) && i_49_ >= ((((Class325_Sub1) class325_sub1).anInt7473) * 1380806569) && i_49_ < (1332934315 * (((Class325_Sub1) class325_sub1).anInt7477))) {
												Class_ta.method5676(-252997090);
												Class105.method1306((((Class325_Sub1) class325_sub1).aClass432_Sub1_Sub1_Sub1_7475), -2056877696);
											}
										}
									}
									int i_75_ = -1468156857 * Class15.anInt192;
									int[] is = Class15.anIntArray187;
									for (int i_76_ = 0; i_76_ < i_75_; i_76_++) {
										Player class432_sub1_sub1_sub1_sub1 = (players[is[i_76_]]);
										if (null != class432_sub1_sub1_sub1_sub1) {
											Class220.method2263(Class545.aClass545_7005, -1, -1, class432_sub1_sub1_sub1_sub1, is[i_76_], 244141505);
											class432_sub1_sub1_sub1_sub1.method5432(i_53_, i_54_, i_55_, i_56_, (i_51_ - (-1526325919 * iComponentDefinitions.anInt1220)), i_52_ - (iComponentDefinitions.anInt1221 * 742281531), i_48_, i_49_, -1545164232);
										}
									}
									for (int i_77_ = 0; i_77_ < -823688441 * anInt9017; i_77_++) {
										int i_78_ = anIntArray9018[i_77_];
										Class330_Sub35 class330_sub35 = ((Class330_Sub35) aClass497_9014.method6094((long) i_78_));
										if (class330_sub35 != null) {
											Class220.method2263(Class545.aClass545_7004, (((NPC) class330_sub35.anObject7733).aClass551_10251.anInt6293) * -554355565, -1, ((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733), i_78_, 1312192104);
											((Class432_Sub1_Sub1_Sub1) class330_sub35.anObject7733).method5432(i_53_, i_54_, i_55_, i_56_, i_51_ - (iComponentDefinitions.anInt1220 * -1526325919), i_52_ - (iComponentDefinitions.anInt1221 * 742281531), i_48_, i_49_, -1545164232);
										}
									}
									continue;
								}
								if (IComponentDefinitions.anInt1178 * -1713237605 == -853879291 * iComponentDefinitions.anInt1207) {
									Class122 class122 = iComponentDefinitions.method1396((Class361.aClass_ra3793), (byte) -98);
									if (null != class122 && (Class9.anInt140 * 221140443 == 0 || (Class9.anInt140 * 221140443 == 3)) && !Class484.aBoolean5782 && i_48_ >= i_53_ && i_49_ >= i_54_ && i_48_ < i_55_ && i_49_ < i_56_) {
										int i_79_ = i_48_ - i_51_;
										int i_80_ = i_49_ - i_52_;
										int i_81_ = class122.anIntArray1404[i_80_];
										if (i_79_ >= i_81_ && i_79_ <= (class122.anIntArray1406[i_80_]) + i_81_) {
											i_79_ -= (-681123409 * iComponentDefinitions.anInt1210 / 2);
											i_80_ -= (iComponentDefinitions.anInt1348 * 694142557 / 2);
											int i_82_;
											if ((-1551406343 * Class147.anInt1621) == 5)
												i_82_ = ((int) aFloat9141 & 0x3fff);
											else if ((-1551406343 * Class147.anInt1621) == 2)
												i_82_ = (int) ((double) (Class401_Sub1.aClass145_Sub1_8249.method1713(-1466629666)) * 2607.5945876176133);
											else
												i_82_ = (((int) aFloat9141 + (anInt9149 * -603680235)) & 0x3fff);
											int i_83_ = (Class257.anIntArray2683[i_82_]);
											int i_84_ = (Class257.anIntArray2684[i_82_]);
											if ((-1551406343 * Class147.anInt1621) != 5) {
												i_83_ = ((i_83_ * (256 + (anInt9063 * 1113850905))) >> 8);
												i_84_ = (anInt9063 * 1113850905 + 256) * i_84_ >> 8;
											}
											int i_85_ = ((i_80_ * i_83_ + i_84_ * i_79_) >> 14);
											int i_86_ = ((i_84_ * i_80_ - i_83_ * i_79_) >> 14);
											int i_87_;
											int i_88_;
											if (5 == (-1551406343 * Class147.anInt1621)) {
												i_87_ = ((i_85_ >> 2) + ((1983170851 * anInt9068) >> 9));
												i_88_ = (anInt9069 * -427254073 >> 9) - (i_86_ >> 2);
											} else {
												int i_89_ = ((Class263_Sub2.myPlayer.method5453(-581921943)) - 1) * 256;
												Class260 class260 = (Class263_Sub2.myPlayer.method5346().aClass260_2606);
												i_87_ = ((i_85_ >> 2) + (((int) (class260.aFloat2716) - i_89_) >> 9));
												i_88_ = (((int) (class260.aFloat2711) - i_89_) >> 9) - (i_86_ >> 2);
											}
											if (aBoolean9150 && ((Class503.anInt5916 * -1357430571) & 0x40) != 0) {
												IComponentDefinitions class114_90_ = (Class166.method1993((651152399 * Class368.anInt3869), (anInt9151 * -1732113251), 534399539));
												if (class114_90_ != null)
													Class360.method4241(aString9152, new StringBuilder().append(" ").append(Class215.aString2082).toString(), (Class271.anInt2756 * -2126481065), 59, (iComponentDefinitions.anInt1335 * -1053848421), 1L, i_87_, i_88_, true, false, (long) ((((iComponentDefinitions.anInt1287) * -790144721) << 32) | (751119487 * (iComponentDefinitions.anInt1196))), true, (short) 140);
												else
													Class490.method6071(-1799482790);
											} else {
												if (Class435.aClass435_4416 == aClass435_9146)
													Class360.method4241((Class526.aClass526_6145.method6257((Class429.aClass454_4369), 991479434)), "", -1, 60, -1, 1L, i_87_, i_88_, true, false, 0L, true, (short) 140);
												Class360.method4241(Class276.aString2861, "", -417970913 * anInt9137, 23, -1, 1L, i_87_, i_88_, true, false, 0L, true, (short) 140);
											}
										}
									}
									continue;
								}
								if (-1879269017 * IComponentDefinitions.anInt1180 == iComponentDefinitions.anInt1207 * -853879291) {
									Class354_Sub1.aClass114_7976 = iComponentDefinitions;
									if (bool_59_)
										Class354_Sub1.aBoolean7981 = true;
									if (bool_64_) {
										int i_91_ = (int) ((double) ((class330_sub44.method3710((byte) -31)) - i_51_ - (-681123409 * (iComponentDefinitions.anInt1210) / 2)) * 2.0 / (double) (Class354.aFloat3507));
										int i_92_ = (int) -((double) ((class330_sub44.method3711(973899230)) - i_52_ - (694142557 * (iComponentDefinitions.anInt1348) / 2)) * 2.0 / (double) (Class354.aFloat3507));
										int i_93_ = (Class354.anInt3510 + (i_91_ + (Class204.anInt6517 * 1926560771)));
										int i_94_ = (i_92_ + (Class149_Sub1.anInt8867 * -694314711) + Class354.anInt3516);
										Class330_Sub36_Sub12 class330_sub36_sub12 = Class430.method5334(-2029779553);
										if (class330_sub36_sub12 != null) {
											int[] is = new int[3];
											class330_sub36_sub12.method3482(i_93_, i_94_, is, -1959424918);
											if (is != null) {
												if ((Class238.aClass355_2583.isKeyHeld(82, -571807494)) && (-2051927139 * anInt9182 > 0)) {
													Class144.method1671(is[0], is[1], is[2], -80060749);
													continue;
												}
												aBoolean9254 = true;
												Class166.anInt1700 = 1584901329 * is[0];
												Class464_Sub27.anInt8725 = is[1] * 1716594503;
												Class268.anInt2748 = is[2] * 1970454953;
											}
											anInt9179 = -2011943299;
											aBoolean9180 = false;
											anInt8994 = (Class464_Sub23.aClass350_8712.method4030(34823472) * 94654545);
											anInt9054 = ((Class464_Sub23.aClass350_8712.method4031((short) 31849)) * -1980241589);
										}
									} else if (bool_63_ && 99695317 * anInt9179 > 0) {
										if (anInt9179 * 99695317 == 1 && ((anInt8994 * 850852017 != Class464_Sub23.aClass350_8712.method4030(34823472)) || (1215125603 * anInt9054 != (Class464_Sub23.aClass350_8712.method4031((short) 18957))))) {
											Class432_Sub1_Sub4_Sub1.anInt9949 = (-211463593 * Class204.anInt6517);
											Class435.anInt4423 = (890377233 * Class149_Sub1.anInt8867);
											anInt9179 = 271080698;
										}
										if (2 == anInt9179 * 99695317) {
											aBoolean9180 = true;
											Class205.method2189(((Class432_Sub1_Sub4_Sub1.anInt9949) * 1636208693 + (int) ((double) ((850852017 * anInt8994) - (Class464_Sub23.aClass350_8712.method4030(34823472))) * 2.0 / (double) (Class354.aFloat3520))), 1962190651);
											Class15.method446(((Class435.anInt4423 * 1948576665) - (int) ((double) ((1215125603 * anInt9054) - (Class464_Sub23.aClass350_8712.method4031((short) 27186))) * 2.0 / (double) (Class354.aFloat3520))), 796651532);
										}
									} else {
										if (anInt9179 * 99695317 > 0 && !aBoolean9180) {
											if ((anInt9145 * 1816927867 == 1 || (Class443.method5614((byte) -81))) && (-2008486989 * Class484.anInt5786) > 2)
												Class345.method4010(850852017 * anInt8994, anInt9054 * 1215125603, -870262512);
											else if (Class458.method5668((byte) 0))
												Class345.method4010(850852017 * anInt8994, 1215125603 * anInt9054, -565831432);
										}
										anInt9179 = 0;
									}
									continue;
								}
								if (-853879291 * iComponentDefinitions.anInt1207 == IComponentDefinitions.anInt1181 * 458796745) {
									if (bool_63_)
										Class279.method2749(Class464_Sub23.aClass350_8712.method4030(34823472) - i_51_, (Class464_Sub23.aClass350_8712.method4031((short) 23886) - i_52_), iComponentDefinitions.anInt1210 * -681123409, 694142557 * iComponentDefinitions.anInt1348, 737760740);
									continue;
								}
								if (IComponentDefinitions.anInt1183 * 277659025 == iComponentDefinitions.anInt1207 * -853879291) {
									Class198.method2155(iComponentDefinitions, i_51_, i_52_, 325168703);
									continue;
								}
							}
							if (!iComponentDefinitions.aBoolean1350 && bool_64_) {
								iComponentDefinitions.aBoolean1350 = true;
								if (iComponentDefinitions.anObjectArray1295 != null) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aBoolean7808 = true;
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anInt7807 = (class330_sub44.method3710((byte) -13) - i_51_) * -1639840261;
									class330_sub42.anInt7811 = (class330_sub44.method3711(1910823848) - i_52_) * 871973441;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1295;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								}
							}
							if (iComponentDefinitions.aBoolean1350 && bool_63_ && iComponentDefinitions.anObjectArray1182 != null) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aBoolean7808 = true;
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anInt7807 = (Class464_Sub23.aClass350_8712.method4030(34823472) - i_51_) * -1639840261;
								class330_sub42.anInt7811 = (Class464_Sub23.aClass350_8712.method4031((short) 18497) - i_52_) * 871973441;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1182;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if (iComponentDefinitions.aBoolean1350 && !bool_63_) {
								iComponentDefinitions.aBoolean1350 = false;
								if (iComponentDefinitions.anObjectArray1297 != null) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aBoolean7808 = true;
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anInt7807 = (Class464_Sub23.aClass350_8712.method4030(34823472) - i_51_) * -1639840261;
									class330_sub42.anInt7811 = (Class464_Sub23.aClass350_8712.method4031((short) 24683) - i_52_) * 871973441;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1297;
									aClass471_9219.method5878(class330_sub42, (short) 8192);
								}
							}
							if (bool_63_ && null != iComponentDefinitions.anObjectArray1298) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aBoolean7808 = true;
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anInt7807 = (Class464_Sub23.aClass350_8712.method4030(34823472) - i_51_) * -1639840261;
								class330_sub42.anInt7811 = (Class464_Sub23.aClass350_8712.method4031((short) 17464) - i_52_) * 871973441;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1298;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if (!iComponentDefinitions.aBoolean1349 && bool_59_) {
								iComponentDefinitions.aBoolean1349 = true;
								if (null != iComponentDefinitions.anObjectArray1212) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aBoolean7808 = true;
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anInt7807 = (Class464_Sub23.aClass350_8712.method4030(34823472) - i_51_) * -1639840261;
									class330_sub42.anInt7811 = (Class464_Sub23.aClass350_8712.method4031((short) 31643) - i_52_) * 871973441;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1212;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								}
							}
							if (iComponentDefinitions.aBoolean1349 && bool_59_ && iComponentDefinitions.anObjectArray1300 != null) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aBoolean7808 = true;
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anInt7807 = (Class464_Sub23.aClass350_8712.method4030(34823472) - i_51_) * -1639840261;
								class330_sub42.anInt7811 = (Class464_Sub23.aClass350_8712.method4031((short) 22899) - i_52_) * 871973441;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1300;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if (iComponentDefinitions.aBoolean1349 && !bool_59_) {
								iComponentDefinitions.aBoolean1349 = false;
								if (null != iComponentDefinitions.anObjectArray1301) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aBoolean7808 = true;
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anInt7807 = (Class464_Sub23.aClass350_8712.method4030(34823472) - i_51_) * -1639840261;
									class330_sub42.anInt7811 = (Class464_Sub23.aClass350_8712.method4031((short) 29137) - i_52_) * 871973441;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1301;
									aClass471_9219.method5878(class330_sub42, (short) 8192);
								}
							}
							if (iComponentDefinitions.anObjectArray1249 != null) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1249;
								aClass471_9209.method5878(class330_sub42, (short) 8192);
							}
							if (null != iComponentDefinitions.anObjectArray1312 && (740679191 * anInt9192 > iComponentDefinitions.anInt1235 * -1165874089)) {
								if (iComponentDefinitions.anIntArray1313 == null || ((anInt9192 * 740679191 - -1165874089 * iComponentDefinitions.anInt1235) > 32)) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1312;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								} else {
									while_123_: for (int i_95_ = (-1165874089 * iComponentDefinitions.anInt1235); i_95_ < 740679191 * anInt9192; i_95_++) {
										int i_96_ = anIntArray9237[i_95_ & 0x1f];
										for (int i_97_ = 0; i_97_ < (iComponentDefinitions.anIntArray1313).length; i_97_++) {
											if (i_96_ == (iComponentDefinitions.anIntArray1313[i_97_])) {
												Class330_Sub42 class330_sub42 = new Class330_Sub42();
												class330_sub42.aClass114_7809 = iComponentDefinitions;
												class330_sub42.anObjectArray7817 = (iComponentDefinitions.anObjectArray1312);
												aClass471_9280.method5878(class330_sub42, (short) 8192);
												break while_123_;
											}
										}
									}
								}
								iComponentDefinitions.anInt1235 = anInt9192 * -1706376127;
							}
							if (null != iComponentDefinitions.anObjectArray1299 && (-1876427861 * anInt9142 > iComponentDefinitions.anInt1356 * -1957073611)) {
								if (iComponentDefinitions.anIntArray1269 == null || ((anInt9142 * -1876427861 - iComponentDefinitions.anInt1356 * -1957073611) > 32)) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1299;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								} else {
									while_124_: for (int i_98_ = (iComponentDefinitions.anInt1356 * -1957073611); i_98_ < -1876427861 * anInt9142; i_98_++) {
										int i_99_ = anIntArray9193[i_98_ & 0x1f];
										for (int i_100_ = 0; i_100_ < (iComponentDefinitions.anIntArray1269).length; i_100_++) {
											if (iComponentDefinitions.anIntArray1269[i_100_] == i_99_) {
												Class330_Sub42 class330_sub42 = new Class330_Sub42();
												class330_sub42.aClass114_7809 = iComponentDefinitions;
												class330_sub42.anObjectArray7817 = (iComponentDefinitions.anObjectArray1299);
												aClass471_9280.method5878(class330_sub42, (short) 8192);
												break while_124_;
											}
										}
									}
								}
								iComponentDefinitions.anInt1356 = -33144481 * anInt9142;
							}
							if (iComponentDefinitions.anObjectArray1306 != null && (1483027533 * anInt9186 > iComponentDefinitions.anInt1352 * 2066405919)) {
								if (iComponentDefinitions.anIntArray1230 == null || ((1483027533 * anInt9186 - iComponentDefinitions.anInt1352 * 2066405919) > 32)) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1306;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								} else {
									while_125_: for (int i_101_ = iComponentDefinitions.anInt1352 * 2066405919; i_101_ < 1483027533 * anInt9186; i_101_++) {
										int i_102_ = anIntArray9185[i_101_ & 0x1f];
										for (int i_103_ = 0; i_103_ < (iComponentDefinitions.anIntArray1230).length; i_103_++) {
											if (iComponentDefinitions.anIntArray1230[i_103_] == i_102_) {
												Class330_Sub42 class330_sub42 = new Class330_Sub42();
												class330_sub42.aClass114_7809 = iComponentDefinitions;
												class330_sub42.anObjectArray7817 = (iComponentDefinitions.anObjectArray1306);
												aClass471_9280.method5878(class330_sub42, (short) 8192);
												break while_125_;
											}
										}
									}
								}
								iComponentDefinitions.anInt1352 = anInt9186 * 1534098451;
							}
							if (null != iComponentDefinitions.anObjectArray1318 && (anInt9188 * -182112015 > 844181997 * iComponentDefinitions.anInt1353)) {
								if (iComponentDefinitions.anIntArray1309 == null || ((-182112015 * anInt9188 - 844181997 * iComponentDefinitions.anInt1353) > 32)) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1318;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								} else {
									while_126_: for (int i_104_ = iComponentDefinitions.anInt1353 * 844181997; i_104_ < anInt9188 * -182112015; i_104_++) {
										int i_105_ = anIntArray9187[i_104_ & 0x1f];
										for (int i_106_ = 0; i_106_ < (iComponentDefinitions.anIntArray1309).length; i_106_++) {
											if (iComponentDefinitions.anIntArray1309[i_106_] == i_105_) {
												Class330_Sub42 class330_sub42 = new Class330_Sub42();
												class330_sub42.aClass114_7809 = iComponentDefinitions;
												class330_sub42.anObjectArray7817 = (iComponentDefinitions.anObjectArray1318);
												aClass471_9280.method5878(class330_sub42, (short) 8192);
												break while_126_;
											}
										}
									}
								}
								iComponentDefinitions.anInt1353 = 657681045 * anInt9188;
							}
							if (iComponentDefinitions.anObjectArray1213 != null && (1741556333 * anInt9247 > -1236296625 * iComponentDefinitions.anInt1206)) {
								if (iComponentDefinitions.anIntArray1311 == null || ((1741556333 * anInt9247 - iComponentDefinitions.anInt1206 * -1236296625) > 32)) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1213;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								} else {
									while_127_: for (int i_107_ = (iComponentDefinitions.anInt1206 * -1236296625); i_107_ < anInt9247 * 1741556333; i_107_++) {
										int i_108_ = anIntArray9189[i_107_ & 0x1f];
										for (int i_109_ = 0; i_109_ < (iComponentDefinitions.anIntArray1311).length; i_109_++) {
											if (i_108_ == (iComponentDefinitions.anIntArray1311[i_109_])) {
												Class330_Sub42 class330_sub42 = new Class330_Sub42();
												class330_sub42.aClass114_7809 = iComponentDefinitions;
												class330_sub42.anObjectArray7817 = (iComponentDefinitions.anObjectArray1213);
												aClass471_9280.method5878(class330_sub42, (short) 8192);
												break while_127_;
											}
										}
									}
								}
								iComponentDefinitions.anInt1206 = anInt9247 * -732654973;
							}
							if (iComponentDefinitions.anObjectArray1316 != null && (-1800337859 * anInt9196 > iComponentDefinitions.anInt1339 * 932699199)) {
								if (iComponentDefinitions.anIntArray1317 == null || ((anInt9196 * -1800337859 - iComponentDefinitions.anInt1339 * 932699199) > 32)) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1316;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								} else {
									while_128_: for (int i_110_ = 932699199 * iComponentDefinitions.anInt1339; i_110_ < -1800337859 * anInt9196; i_110_++) {
										int i_111_ = anIntArray9195[i_110_ & 0x1f];
										for (int i_112_ = 0; i_112_ < (iComponentDefinitions.anIntArray1317).length; i_112_++) {
											if (iComponentDefinitions.anIntArray1317[i_112_] == i_111_) {
												Class330_Sub42 class330_sub42 = new Class330_Sub42();
												class330_sub42.aClass114_7809 = iComponentDefinitions;
												class330_sub42.anObjectArray7817 = (iComponentDefinitions.anObjectArray1316);
												aClass471_9280.method5878(class330_sub42, (short) 8192);
												break while_128_;
											}
										}
									}
								}
								iComponentDefinitions.anInt1339 = 764948099 * anInt9196;
							}
							if ((anInt9028 * -1997964103 > iComponentDefinitions.anInt1331 * -1496431791) && null != iComponentDefinitions.anObjectArray1322) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1322;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if ((841435255 * anInt9023 > iComponentDefinitions.anInt1331 * -1496431791) && iComponentDefinitions.anObjectArray1261 != null) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1261;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if ((anInt9109 * 1396608513 > -1496431791 * iComponentDefinitions.anInt1331) && iComponentDefinitions.anObjectArray1175 != null) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1175;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if ((anInt9129 * 2005928469 > iComponentDefinitions.anInt1331 * -1496431791) && null != iComponentDefinitions.anObjectArray1326) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1326;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if ((anInt9181 * 295114189 > -1496431791 * iComponentDefinitions.anInt1331) && iComponentDefinitions.anObjectArray1176 != null) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1176;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if ((anInt9202 * 1606437919 > -1496431791 * iComponentDefinitions.anInt1331) && null != iComponentDefinitions.anObjectArray1334) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1334;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							if ((-1832430477 * anInt9208 > iComponentDefinitions.anInt1331 * -1496431791) && null != iComponentDefinitions.anObjectArray1328) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1328;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
							iComponentDefinitions.anInt1331 = anInt9268 * -1465458341;
							if (null != iComponentDefinitions.anObjectArray1323) {
								for (int i_113_ = 0; i_113_ < -774446383 * anInt9000; i_113_++) {
									Class330_Sub42 class330_sub42 = new Class330_Sub42();
									class330_sub42.aClass114_7809 = iComponentDefinitions;
									class330_sub42.anInt7814 = (anInterface18Array9001[i_113_].method264((byte) 0) * -2123271525);
									class330_sub42.anInt7815 = (anInterface18Array9001[i_113_].method270(2063152378) * -1065429405);
									class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1323;
									aClass471_9280.method5878(class330_sub42, (short) 8192);
								}
							}
							if (aBoolean9090 && null != iComponentDefinitions.anObjectArray1332) {
								Class330_Sub42 class330_sub42 = new Class330_Sub42();
								class330_sub42.aClass114_7809 = iComponentDefinitions;
								class330_sub42.anObjectArray7817 = iComponentDefinitions.anObjectArray1332;
								aClass471_9280.method5878(class330_sub42, (short) 8192);
							}
						}
						if (1849136745 * iComponentDefinitions.anInt1198 == 5 && -1 != -732237595 * iComponentDefinitions.anInt1275)
							iComponentDefinitions.method1392(Class341.aClass342_3397, Class446.aClass131_5549, (byte) 14).method3078(Class361.aClass_ra3793, iComponentDefinitions.anInt1348 * 694142557, Class448.aClass330_Sub50_5555.aClass464_Sub7_7891.method5760((byte) -5), -1169519920);
						Class204.method2183(iComponentDefinitions, 287997957);
						if (1849136745 * iComponentDefinitions.anInt1198 == 0) {
							method3917(class120, class114s, 751119487 * iComponentDefinitions.anInt1196, i_53_, i_54_, i_55_, i_56_, (i_51_ - iComponentDefinitions.anInt1220 * -1526325919), i_52_ - iComponentDefinitions.anInt1221 * 742281531, i_48_, i_49_);
							if (iComponentDefinitions.aClass114Array1219 != null)
								method3917(class120, iComponentDefinitions.aClass114Array1219, 751119487 * iComponentDefinitions.anInt1196, i_53_, i_54_, i_55_, i_56_, i_51_ - (iComponentDefinitions.anInt1220 * -1526325919), (i_52_ - iComponentDefinitions.anInt1221 * 742281531), i_48_, i_49_);
							Class330_Sub48 class330_sub48 = (Class330_Sub48) (aClass497_9284.method6094((long) (iComponentDefinitions.anInt1196 * 751119487)));
							if (class330_sub48 != null) {
								if (Class435.aClass435_4421 == aClass435_9146 && 0 == (-1972674867 * class330_sub48.anInt7860) && !Class484.aBoolean5782 && bool_59_ && !aBoolean9161)
									Class_ta.method5676(119537491);
								Class145.method1726(class330_sub48, 856598855 * (class330_sub48.anInt7859), i_53_, i_54_, i_55_, i_56_, i_51_, i_52_, i_48_, i_49_, (short) 30516);
							}
						}
					}
				}
			}
		}
	}

	static boolean method3918(IComponentDefinitions iComponentDefinitions) {
		if (aBoolean9161) {
			if (method3924(iComponentDefinitions).anInt7510 * -1700263873 != 0)
				return false;
			if (0 == 1849136745 * iComponentDefinitions.anInt1198)
				return false;
		}
		return iComponentDefinitions.aBoolean1215;
	}

	final void method3894() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		IsaacCipher.aClass114_5838 = new IComponentDefinitions();
		Class16.method450(-1865778176);
		Class497.aClass267_5883 = new Class267();
		Class140_Sub1.aClass285_7263 = new Class285_Sub1();
		Class341.method3979(new int[] { 20, 260 }, new int[] { 1000, 100 }, 936256482);
		Class260.method2580(100);
		Class244.method2436(10);
		Class231.method2350(100, (byte) 51);
		Class285_Sub1.method2866(100, (byte) 66);
		if (Class404.aClass457_4162 != Class457.aClass457_6834)
			Class230.aByteArrayArray2447 = new byte[50][];
		Class448.aClass330_Sub50_5555 = Class106.method1322((byte) -114);
		if (Class448.aClass330_Sub50_5555.aClass464_Sub24_7904.method5825((byte) -17) == 1)
			Class356.aBoolean3694 = false;
		if (Class457.aClass457_6834 == Class404.aClass457_4162)
			Class507.aClass498_5932.aString5886 = Class293.anApplet6804.getCodeBase().getHost();
		else if (Class457.method5662(Class404.aClass457_4162, -1794339967)) {
			Class507.aClass498_5932.aString5886 = Class293.anApplet6804.getCodeBase().getHost();
			Class507.aClass498_5932.anInt5887 = 1405932864 + 116751407 * Class507.aClass498_5932.anInt5889;
			Class507.aClass498_5937.anInt5887 = 1405932864 + Class507.aClass498_5937.anInt5889 * 116751407;
			Class507.aClass498_5932.anInt5885 = 523924231 * Class507.aClass498_5932.anInt5889 + -1149535984;
			Class507.aClass498_5937.anInt5885 = -1149535984 + Class507.aClass498_5937.anInt5889 * 523924231;
		} else if (Class404.aClass457_4162 == Class457.aClass457_6837) {
			Class507.aClass498_5932.aString5886 = Class215.aString2083;
			Class507.aClass498_5937.aString5886 = Class215.aString2083;
			Class507.aClass498_5932.anInt5887 = 1405932864 + Class507.aClass498_5932.anInt5889 * 116751407;
			Class507.aClass498_5937.anInt5887 = 116751407 * Class507.aClass498_5937.anInt5889 + 1405932864;
			Class507.aClass498_5932.anInt5885 = 523924231 * Class507.aClass498_5932.anInt5889 + -1149535984;
			Class507.aClass498_5937.anInt5885 = -1149535984 + 523924231 * Class507.aClass498_5937.anInt5889;
		}
		Class507.aClass498_5930 = Class507.aClass498_5932;
		if (Class435.aClass435_4421 == aClass435_9146)
			aBoolean9157 = false;
		IndexTable.aShortArray2907 = Class473.aShortArray5631 = Class551.aShortArray6351 = ItemDefinitions.otherModifiedModelColors = new short[256];
		try {
			Class391.aClipboard4063 = Class432_Sub1_Sub3_Sub1.method5526((byte) 82).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class238.aClass355_2583 = Class386.method4436(Class475.aCanvas5700, (short) -19430);
		Class464_Sub23.aClass350_8712 = Class169.method2032(Class475.aCanvas5700, true, (byte) 62);
		Class401_Sub1.aClass145_Sub1_8249 = new Class145_Sub1(aClass532_9236);
		if (Class457.aClass457_6834 != Class404.aClass457_4162)
			aBoolean8983 = true;
		aString6613 = Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434);
		Class43.aClass276_10073 = new Class276();
		new Thread(Class43.aClass276_10073).start();
	}

	final void method3899() {
		if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-661160944) == 2) {
			try {
				method3911(881162839);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class207.method2195(new StringBuilder().append(throwable.getMessage()).append(" ").append(method3886(1455386740)).toString(), throwable, -306254718);
				aBoolean9059 = true;
				Class136.method1591(Class533.aClass533_6903, -1594982128);
				Class171.method2046(0, false, 1438080313);
			}
		} else
			method3911(881162839);
	}

	final void method3897() {
		if (aBoolean9206)
			Class330_Sub11.method3291(-1724065589);
		Class132.method1566((byte) -83);
		if (null != Class361.aClass_ra3793)
			Class361.aClass_ra3793.method4781(628001038);
		if (Class503.aBoolean5914 && null != Class130.aFrame1498) {
			Class417.method5268(Class203.aClass504_6790, Class130.aFrame1498, 2029314127);
			Class130.aFrame1498 = null;
		}
		aClass1_9025.method379(1175619289);
		((Class1) aClass1_9025).aClass409_38.method4772(-651777902);
		aClass1_9060.method379(1175619289);
		((Class1) aClass1_9060).aClass409_38.method4772(-651777902);
		Class467.method5859(-2076008762);
		Class140_Sub1.aClass285_7263.method2840((byte) -15);
		Class497.aClass267_5883.method2653((byte) 112);
		if (aClass423_9029 != null) {
			aClass423_9029.method5299(-497789444);
			aClass423_9029 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class383.method4412((byte) -66);
		try {
			Class314.method3119((byte) 55);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBoolean6618)
			Class150_Sub2.method1771(1848334845);
	}

	final void method3895() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		IsaacCipher.aClass114_5838 = new IComponentDefinitions();
		Class16.method450(-2030921210);
		Class497.aClass267_5883 = new Class267();
		Class140_Sub1.aClass285_7263 = new Class285_Sub1();
		Class341.method3979(new int[] { 20, 260 }, new int[] { 1000, 100 }, 865245528);
		Class260.method2580(100);
		Class244.method2436(10);
		Class231.method2350(100, (byte) 88);
		Class285_Sub1.method2866(100, (byte) 108);
		if (Class404.aClass457_4162 != Class457.aClass457_6834)
			Class230.aByteArrayArray2447 = new byte[50][];
		Class448.aClass330_Sub50_5555 = Class106.method1322((byte) -120);
		if (Class448.aClass330_Sub50_5555.aClass464_Sub24_7904.method5825((byte) -17) == 1)
			Class356.aBoolean3694 = false;
		if (Class457.aClass457_6834 == Class404.aClass457_4162)
			Class507.aClass498_5932.aString5886 = Class293.anApplet6804.getCodeBase().getHost();
		else if (Class457.method5662(Class404.aClass457_4162, -301302473)) {
			Class507.aClass498_5932.aString5886 = Class293.anApplet6804.getCodeBase().getHost();
			Class507.aClass498_5932.anInt5887 = 1405932864 + 116751407 * Class507.aClass498_5932.anInt5889;
			Class507.aClass498_5937.anInt5887 = 1405932864 + Class507.aClass498_5937.anInt5889 * 116751407;
			Class507.aClass498_5932.anInt5885 = 523924231 * Class507.aClass498_5932.anInt5889 + -1149535984;
			Class507.aClass498_5937.anInt5885 = -1149535984 + Class507.aClass498_5937.anInt5889 * 523924231;
		} else if (Class404.aClass457_4162 == Class457.aClass457_6837) {
			Class507.aClass498_5932.aString5886 = Class215.aString2083;
			Class507.aClass498_5937.aString5886 = Class215.aString2083;
			Class507.aClass498_5932.anInt5887 = 1405932864 + Class507.aClass498_5932.anInt5889 * 116751407;
			Class507.aClass498_5937.anInt5887 = 116751407 * Class507.aClass498_5937.anInt5889 + 1405932864;
			Class507.aClass498_5932.anInt5885 = 523924231 * Class507.aClass498_5932.anInt5889 + -1149535984;
			Class507.aClass498_5937.anInt5885 = -1149535984 + 523924231 * Class507.aClass498_5937.anInt5889;
		}
		Class507.aClass498_5930 = Class507.aClass498_5932;
		if (Class435.aClass435_4421 == aClass435_9146)
			aBoolean9157 = false;
		IndexTable.aShortArray2907 = Class473.aShortArray5631 = Class551.aShortArray6351 = ItemDefinitions.otherModifiedModelColors = new short[256];
		try {
			Class391.aClipboard4063 = Class432_Sub1_Sub3_Sub1.method5526((byte) 68).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class238.aClass355_2583 = Class386.method4436(Class475.aCanvas5700, (short) -2001);
		Class464_Sub23.aClass350_8712 = Class169.method2032(Class475.aCanvas5700, true, (byte) 101);
		Class401_Sub1.aClass145_Sub1_8249 = new Class145_Sub1(aClass532_9236);
		if (Class457.aClass457_6834 != Class404.aClass457_4162)
			aBoolean8983 = true;
		aString6613 = Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434);
		Class43.aClass276_10073 = new Class276();
		new Thread(Class43.aClass276_10073).start();
	}

	static final void method3919(int i) {
		int i_114_ = Class15.anInt192 * -1468156857;
		int[] is = Class15.anIntArray187;
		int[][] is_115_ = aClass304_9030.method2997((byte) 14);
		int[][] is_116_ = aClass304_9030.method2998(-1129292117);
		int i_117_;
		if (anInt8987 * 1909266069 == 0)
			i_117_ = Class96.aClass85Array854.length;
		else
			i_117_ = aBoolean8989 ? i_114_ : -823688441 * anInt9017 + i_114_;
		for (int i_118_ = 0; i_118_ < i_117_; i_118_++) {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1;
			if (0 == 1909266069 * anInt8987) {
				Class85 class85 = Class96.aClass85Array854[i_118_];
				if (!class85.aBoolean705)
					continue;
				class432_sub1_sub1_sub1 = class85.method973(-1160484525);
			} else {
				if (i_118_ < i_114_)
					class432_sub1_sub1_sub1 = players[is[i_118_]];
				else
					class432_sub1_sub1_sub1 = ((Class432_Sub1_Sub1_Sub1) (((Class330_Sub35) aClass497_9014.method6094((long) anIntArray9018[(i_118_ - i_114_)])).anObject7733));
				if (i != class432_sub1_sub1_sub1.aByte8658)
					continue;
				if (class432_sub1_sub1_sub1.anInt10052 * -806256501 < 0) {
					class432_sub1_sub1_sub1.aBoolean10012 = false;
					continue;
				}
			}
			class432_sub1_sub1_sub1.anInt10013 = 0;
			int i_119_ = class432_sub1_sub1_sub1.method5453(-791634669);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			if (0 == (i_119_ & 0x1)) {
				if (0 != ((int) class260.aFloat2716 & 0x1ff) || ((int) class260.aFloat2711 & 0x1ff) != 0) {
					class432_sub1_sub1_sub1.aBoolean10012 = false;
					continue;
				}
			} else if (((int) class260.aFloat2716 & 0x1ff) != 256 || ((int) class260.aFloat2711 & 0x1ff) != 256) {
				class432_sub1_sub1_sub1.aBoolean10012 = false;
				continue;
			}
			if (0 != anInt8987 * 1909266069) {
				if (1 == i_119_) {
					int i_120_ = (int) class260.aFloat2716 >> 9;
					int i_121_ = (int) class260.aFloat2711 >> 9;
					if (class432_sub1_sub1_sub1.anInt10052 * -806256501 != is_115_[i_120_][i_121_]) {
						class432_sub1_sub1_sub1.aBoolean10012 = true;
						continue;
					}
					if (is_116_[i_120_][i_121_] > 1) {
						is_116_[i_120_][i_121_]--;
						class432_sub1_sub1_sub1.aBoolean10012 = true;
						continue;
					}
				} else {
					int i_122_ = (i_119_ - 1) * 256 + 252;
					int i_123_ = (int) class260.aFloat2716 - i_122_ >> 9;
					int i_124_ = (int) class260.aFloat2711 - i_122_ >> 9;
					int i_125_ = i_122_ + (int) class260.aFloat2716 >> 9;
					int i_126_ = i_122_ + (int) class260.aFloat2711 >> 9;
					if (!Class562.method6474(is_115_, is_116_, (class432_sub1_sub1_sub1.anInt10052) * -806256501, i_123_, i_124_, i_125_, i_126_, (short) 95)) {
						for (int i_127_ = i_123_; i_127_ <= i_125_; i_127_++) {
							for (int i_128_ = i_124_; i_128_ <= i_126_; i_128_++) {
								if ((class432_sub1_sub1_sub1.anInt10052 * -806256501) == is_115_[i_127_][i_128_])
									is_116_[i_127_][i_128_]--;
							}
						}
						class432_sub1_sub1_sub1.aBoolean10012 = true;
						continue;
					}
				}
			}
			class432_sub1_sub1_sub1.aBoolean10012 = false;
			class432_sub1_sub1_sub1.method5348(class260.aFloat2716, (float) Class431.method5342((int) class260.aFloat2716, (int) class260.aFloat2711, class432_sub1_sub1_sub1.aByte8658, 1996761881), class260.aFloat2711);
			aClass304_9030.method3023(-400722441).method4145(class432_sub1_sub1_sub1, true, -1300407670);
		}
	}

	static final void method3920() {
		int i = -1468156857 * Class15.anInt192;
		int[] is = Class15.anIntArray187;
		int i_129_;
		if (1909266069 * anInt8987 == 0)
			i_129_ = Class96.aClass85Array854.length;
		else
			i_129_ = aBoolean8989 ? i : anInt9017 * -823688441 + i;
		for (int i_130_ = 0; i_130_ < i_129_; i_130_++) {
			Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1;
			if (1909266069 * anInt8987 == 0) {
				Class85 class85 = Class96.aClass85Array854[i_130_];
				if (!class85.aBoolean705)
					continue;
				class432_sub1_sub1_sub1 = class85.method973(-1160484525);
			} else {
				if (i_130_ < i)
					class432_sub1_sub1_sub1 = players[is[i_130_]];
				else
					class432_sub1_sub1_sub1 = ((Class432_Sub1_Sub1_Sub1) (((Class330_Sub35) aClass497_9014.method6094((long) anIntArray9018[i_130_ - i])).anObject7733));
				if (class432_sub1_sub1_sub1.anInt10052 * -806256501 < 0)
					continue;
			}
			int i_131_ = class432_sub1_sub1_sub1.method5453(-2069014694);
			Class260 class260 = class432_sub1_sub1_sub1.method5346().aClass260_2606;
			if ((i_131_ & 0x1) == 0) {
				if (0 == ((int) class260.aFloat2716 & 0x1ff) && ((int) class260.aFloat2711 & 0x1ff) == 0)
					continue;
			} else if (((int) class260.aFloat2716 & 0x1ff) == 256 && 256 == ((int) class260.aFloat2711 & 0x1ff))
				continue;
			class432_sub1_sub1_sub1.method5348(class260.aFloat2716, (float) Class431.method5342((int) class260.aFloat2716, (int) class260.aFloat2711, class432_sub1_sub1_sub1.aByte8658, 1996761881), class260.aFloat2711);
			aClass304_9030.method3023(-400722441).method4145(class432_sub1_sub1_sub1, true, -274315545);
		}
	}

	public String method3921() {
		String string = " ";
		try {
			Class381 class381 = aClass304_9030.method3022(-542366554);
			string = new StringBuilder().append(string).append(class381.gameSceneBaseX * -1261027839).append(Class215.aString2081).append(-1542584207 * class381.gameSceneBaseY).append(Class215.aString2081).append(aClass304_9030.method2990(-1879909977)).append(Class215.aString2081).append(aClass304_9030.method3033((byte) -87)).append(" ").toString();
			if (Class263_Sub2.myPlayer != null)
				string = new StringBuilder().append(string).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append((Class263_Sub2.myPlayer.anIntArray10018[0]) + class381.gameSceneBaseX * -1261027839).append(Class215.aString2081).append((Class263_Sub2.myPlayer.anIntArray10059[0]) + class381.gameSceneBaseY * -1542584207).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append(" ").toString();
			string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(75259844)).append(" ").append(Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5766((byte) 1)).append(" ").append(Class545.method6347(1079239502)).append(" ").append(Class300.anInt3058 * -1969079741).append(Class215.aString2081).append(-1548608507 * Class146.anInt1615).append(" ").toString();
			string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(1804788470)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(1022983845)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub21_7875.method5811(-1390004513)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(-270157335 * anInt6617).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt8995 * -296919301).append(" ").toString();
			if (null != Class375.aClass330_Sub51_3933)
				string = new StringBuilder().append(string).append(Class375.aClass330_Sub51_3933.anInt7946 * -140064631).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString9126 != null)
				string = new StringBuilder().append(string).append(aString9126).toString();
			else
				string = new StringBuilder().append(string).append(Class215.aString2081).toString();
			try {
				if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(15333193) == 2) {
					Class var_class = Class.forName("java.lang.ClassLoader");
					Field field = var_class.getDeclaredField("nativeLibraries");
					Class var_class_132_ = Class.forName("java.lang.reflect.AccessibleObject");
					Method method = var_class_132_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
					method.invoke(field, new Object[] { Boolean.TRUE });
					Vector vector = (Vector) field.get(Class.forName("client").getClassLoader());
					for (int i = 0; i < vector.size(); i++) {
						try {
							Object object = vector.elementAt(i);
							Field field_133_ = object.getClass().getDeclaredField("name");
							method.invoke(field_133_, new Object[] { Boolean.TRUE });
							try {
								String string_134_ = (String) field_133_.get(object);
								if (null != string_134_ && string_134_.indexOf("sw3d.dll") != -1) {
									Field field_135_ = object.getClass().getDeclaredField("handle");
									method.invoke(field_135_, (new Object[] { Boolean.TRUE }));
									string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_135_.getLong(object))).toString();
									method.invoke(field_135_, (new Object[] { Boolean.FALSE }));
								}
							} catch (Throwable throwable) {
								/* empty */
							}
							method.invoke(field_133_, new Object[] { Boolean.FALSE });
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	void method3922(int i) {
		try {
			if (Class140_Sub1.aClass285_7263.anInt2941 * 1048270057 > -68421019 * anInt9010) {
				Class507.aClass498_5930.method6107(1823371869);
				anInt9009 = (893093906 * Class140_Sub1.aClass285_7263.anInt2941 - -1447295934);
				if (1302784733 * anInt9009 > 3000)
					anInt9009 = -187682024;
				if (1048270057 * Class140_Sub1.aClass285_7263.anInt2941 >= 2 && (Class140_Sub1.aClass285_7263.anInt2932 * -1288212373 == 6)) {
					method3890("js5connect_outofdate", -1655691501);
					anInt8995 = 1788726935;
					return;
				}
				if (Class140_Sub1.aClass285_7263.anInt2941 * 1048270057 >= 1 && 48 == (-1288212373 * Class140_Sub1.aClass285_7263.anInt2932)) {
					method3890("sessionexpired", -1229198570);
					anInt8995 = 1788726935;
					return;
				}
				if (Class140_Sub1.aClass285_7263.anInt2941 * 1048270057 >= 4 && -1 == (Class140_Sub1.aClass285_7263.anInt2932 * -1288212373)) {
					method3890("js5crc", -959594015);
					anInt8995 = 1788726935;
					return;
				}
				if (Class140_Sub1.aClass285_7263.anInt2941 * 1048270057 >= 4 && CacheIndex.method1522(-296919301 * anInt8995, (byte) -37)) {
					if (7 == (Class140_Sub1.aClass285_7263.anInt2932 * -1288212373) || 9 == (-1288212373 * Class140_Sub1.aClass285_7263.anInt2932))
						method3890("js5connect_full", -2085889464);
					else if ((-1288212373 * Class140_Sub1.aClass285_7263.anInt2932) > 0) {
						if (aString9012 == null)
							method3890("js5connect", -1224165105);
						else
							method3890(new StringBuilder().append("js5proxy_").append(aString9012.trim()).toString(), -99976529);
					} else
						method3890("js5io", -1496795803);
					anInt8995 = 1788726935;
					return;
				}
			}
			anInt9010 = -74996171 * Class140_Sub1.aClass285_7263.anInt2941;
			if (anInt9009 * 1302784733 > 0)
				anInt9009 -= 62930293;
			else {
				try {
					if (-1303021537 * anInt9008 == 0) {
						Class200.aSocket6500 = Class507.aClass498_5930.method6109((byte) 1);
						anInt9008 += 73139167;
					}
					if (-1303021537 * anInt9008 == 1) {
						Class392.aClass357_6793 = Class330_Sub15.method3320(Class200.aSocket6500, 125000, -652783208);
						int i_136_ = 9 + aString9126.length();
						Buffer class330_sub46 = new Buffer(i_136_ + 2);
						class330_sub46.addByte((Class227.aClass227_2412.anInt2422) * 1162563797, (byte) 120);
						class330_sub46.addByte(i_136_, (byte) 119);
						class330_sub46.addInt(742, 1965508160);
						class330_sub46.addInt(Loader.SUB_VERSION, 1965508160);
						class330_sub46.addString(aString9126, (byte) -112);
						Class392.aClass357_6793.method4210((class330_sub46.payload), 0, 2 + i_136_, (byte) -61);
						anInt9008 += 73139167;
						Class16.aLong215 = (Class312.method3111((byte) 92) * 1730533446109867345L);
					}
					if (anInt9008 * -1303021537 == 2) {
						if (Class392.aClass357_6793.method4194(1, -1020237123)) {
							byte[] is = new byte[1];
							int i_137_ = Class392.aClass357_6793.method4195(is, 0, 1, -1683480535);
							if (0 != is[0]) {
								method3923(i_137_, 1129575865);
								return;
							}
							anInt9008 += 73139167;
						} else if ((Class312.method3111((byte) 21) - 526490981900467121L * Class16.aLong215) > 30000L) {
							method3923(1001, 225051975);
							return;
						}
					}
					if (-1303021537 * anInt9008 == 3) {
						Class517[] class517s = Class517.method6207(1953109428);
						int i_138_ = 4 * class517s.length;
						if (Class392.aClass357_6793.method4194(i_138_, -1020237123)) {
							Buffer class330_sub46 = new Buffer(i_138_);
							Class392.aClass357_6793.method4195(class330_sub46.payload, 0, class330_sub46.payload.length, -1370092441);
							for (int i_139_ = 0; i_139_ < class517s.length; i_139_++)
								class517s[i_139_].method6209(class330_sub46.readInt((byte) 27), 1211903625);
							boolean bool = (CacheIndex.method1522(anInt8995 * -296919301, (byte) -27) || Class522.method6230((-296919301 * anInt8995), 1448543131) || Class226.method2307((-296919301 * anInt8995), (byte) 49));
							Class140_Sub1.aClass285_7263.method2838(Class392.aClass357_6793, !bool, (byte) -64);
							Class200.aSocket6500 = null;
							Class392.aClass357_6793 = null;
							anInt9008 = 0;
						}
					}
				} catch (IOException ioexception) {
					method3923(1002, 643140175);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.fe(").append(')').toString());
		}
	}

	void method3923(int i, int i_140_) {
		try {
			Class200.aSocket6500 = null;
			Class392.aClass357_6793 = null;
			anInt9008 = 0;
			Class140_Sub1.aClass285_7263.anInt2941 += -1969044647;
			Class140_Sub1.aClass285_7263.anInt2932 = i * 630045763;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.fh(").append(')').toString());
		}
	}

	public static Class330_Sub2 method3924(IComponentDefinitions iComponentDefinitions) {
		Class330_Sub2 class330_sub2 = ((Class330_Sub2) aClass497_9211.method6094(((long) (iComponentDefinitions.anInt1196 * 751119487) << 32) + (long) (-790144721 * iComponentDefinitions.anInt1287)));
		return (class330_sub2 != null ? class330_sub2 : iComponentDefinitions.aClass330_Sub2_1273);
	}

	void method3925(short i) {
		try {
			if (-296919301 * anInt8995 != 13) {
				long l = (Class429.method5329(118746559) / 1000000L - 771586833767277685L * aLong8977);
				aLong8977 = (Class429.method5329(118746559) / 1000000L * -1285844414190023715L);
				boolean bool = MusicManager.loadMusic(504266800);
				if (bool && Class333.aBoolean3354 && Class95_Sub11.aClass296_7171 != null)
					Class95_Sub11.aClass296_7171.method2936();
				if (Class375.method4357(-296919301 * anInt8995, 2102786954)) {
					if (0L != aLong9113 * 4760310275267437805L && (Class312.method3111((byte) 50) > 4760310275267437805L * aLong9113))
						Class96.method1182(Class545.method6347(1079239502), -1, -1, false, 46391761);
					else if (!Class361.aClass_ra3793.e() && aBoolean6610)
						Class83.method967(1374117715);
				}
				if (null == Class130.aFrame1498) {
					Container container = Class432_Sub1_Sub3_Sub1.method5526((byte) 31);
					int i_141_ = container.getSize().width;
					int i_142_ = container.getSize().height;
					if (container == Class267.aFrame2740) {
						Insets insets = Class267.aFrame2740.getInsets();
						i_141_ -= insets.left + insets.right;
						i_142_ -= insets.bottom + insets.top;
					}
					if (-1408375895 * anInt6609 != i_141_ || Class520.anInt6017 * 394893517 != i_142_ || aBoolean8992) {
						if (Class361.aClass_ra3793 == null || Class361.aClass_ra3793.t())
							Class16.method450(-1089553537);
						else {
							anInt6609 = 1458663577 * i_141_;
							Class520.anInt6017 = 1944065029 * i_142_;
						}
						aLong9113 = ((Class312.method3111((byte) 67) + 500L) * -1153009628896372507L);
						aBoolean8992 = false;
					}
				}
				if (Class503.aBoolean5914 && Class130.aFrame1498 != null && !Class76_Sub1_Sub3.aBoolean9380 && Class375.method4357(anInt8995 * -296919301, 2111080232))
					Class96.method1182(Class448.aClass330_Sub50_5555.aClass464_Sub8_7897.method5763(-1647779449), -1, -1, false, -1751113588);
				boolean bool_143_ = false;
				if (aBoolean6619) {
					aBoolean6619 = false;
					bool_143_ = true;
				}
				if (bool_143_)
					Class113.method1384(-1755622083);
				if ((Class361.aClass_ra3793 != null && Class361.aClass_ra3793.e()) || Class545.method6347(1079239502) != 1)
					Class464.method5726(-928664580);
				if (CacheIndex.method1522(anInt8995 * -296919301, (byte) -83))
					Class72.method833(bool_143_, (byte) 41);
				else if (Class321.method3177(-296919301 * anInt8995, (byte) -55))
					Class95_Sub14.method1151(1150203048);
				else if (Class495.method6091(-296919301 * anInt8995, (short) 255))
					Class95_Sub14.method1151(1150203048);
				else if (Class438.method5593(-296919301 * anInt8995, 217882945)) {
					if (aClass304_9030.method2986((byte) -72) == Class270.aClass270_2749) {
						int i_144_ = aClass304_9030.method2987(-2109176991) / 2;
						Class95_Sub22.method1175(new StringBuilder().append(Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434)).append(Class215.aString2084).append("(").append(i_144_).append("%)").toString(), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -382841416);
					} else if (aClass304_9030.method2986((byte) -49) == Class270.aClass270_2750) {
						int i_145_ = 50 + aClass304_9030.method2988(173965003) / 2;
						Class95_Sub22.method1175(new StringBuilder().append(Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434)).append(Class215.aString2084).append("(").append(i_145_).append("%)").toString(), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, 595949731);
					} else
						Class95_Sub22.method1175((Class526.aClass526_6131.method6257(Class429.aClass454_4369, 991479434)), true, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -961693461);
				} else if (1 == -296919301 * anInt8995)
					Class353.method4079(l);
				else if (anInt8995 * -296919301 == 9)
					Class95_Sub22.method1175(new StringBuilder().append(Class526.aClass526_6098.method6257(Class429.aClass454_4369, 991479434)).append(Class215.aString2084).append(Class526.aClass526_6134.method6257(Class429.aClass454_4369, 991479434)).toString(), false, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, 621200002);
				else if (-296919301 * anInt8995 == 0)
					Class95_Sub22.method1175(Class526.aClass526_6188.method6257(Class429.aClass454_4369, 991479434), false, Class361.aClass_ra3793, Class464_Sub22.aClass263_8709, Class386.aClass524_3989, -1136393939);
				if (anInt9218 * -891808043 == 3) {
					for (int i_146_ = 0; i_146_ < 197858337 * anInt9213; i_146_++) {
						Rectangle rectangle = aRectangleArray9252[i_146_];
						if (aBooleanArray9263[i_146_])
							Class361.aClass_ra3793.method4788(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, (byte) -17);
						else
							Class361.aClass_ra3793.method4788(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, (byte) 18);
					}
				}
				if (Class511.method6184(-185354018))
					Class119.method1436(Class361.aClass_ra3793, (byte) 71);
				if (!CacheIndex.method1522(anInt8995 * -296919301, (byte) -98) && !Class438.method5593(-296919301 * anInt8995, 77351706) && windowPaneId * 1522181389 != -1) {
					try {
						Class361.aClass_ra3793.method4804();
						Class361.aClass_ra3793.method4786(1058543579);
					} catch (Exception_Sub1 exception_sub1) {
						Class207.method2195(new StringBuilder().append(exception_sub1.getMessage()).append(" ").append(method3886(315755168)).toString(), exception_sub1, -306254718);
						switch (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1207369519)) {
						default:
							Class171.method2046(0, false, -1344713775);
							break;
						case 3:
							Class125.method1527(exception_sub1.method341(132171991), 2097424296);
							Class171.method2046(1, false, -832512937);
						}
					}
				}
				Class203.method2177(972009497);
				int i_147_ = Class448.aClass330_Sub50_5555.aClass464_Sub26_7901.method5830(734037453);
				if (0 == i_147_)
					Class464_Sub21.method5813(15L);
				else if (1 == i_147_)
					Class464_Sub21.method5813(10L);
				else if (2 == i_147_)
					Class464_Sub21.method5813(5L);
				else if (i_147_ == 3)
					Class464_Sub21.method5813(2L);
				if (aBoolean9071)
					Class416.method5258(296953575);
				if (Class448.aClass330_Sub50_5555.aClass464_Sub14_7884.method5790((short) 14116) == 1 && anInt8995 * -296919301 == 6 && 1522181389 * windowPaneId != -1) {
					Class448.aClass330_Sub50_5555.method3856(Class448.aClass330_Sub50_5555.aClass464_Sub14_7884, 0, 1929921722);
					Class435.method5568(1489073628);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.fu(").append(')').toString());
		}
	}

	final void method3905() {
		if (aBoolean9206)
			Class330_Sub11.method3291(-359187248);
		Class132.method1566((byte) -97);
		if (null != Class361.aClass_ra3793)
			Class361.aClass_ra3793.method4781(628001038);
		if (Class503.aBoolean5914 && null != Class130.aFrame1498) {
			Class417.method5268(Class203.aClass504_6790, Class130.aFrame1498, 2016554032);
			Class130.aFrame1498 = null;
		}
		aClass1_9025.method379(1175619289);
		((Class1) aClass1_9025).aClass409_38.method4772(-651777902);
		aClass1_9060.method379(1175619289);
		((Class1) aClass1_9060).aClass409_38.method4772(-651777902);
		Class467.method5859(-1719223036);
		Class140_Sub1.aClass285_7263.method2840((byte) -81);
		Class497.aClass267_5883.method2653((byte) 17);
		if (aClass423_9029 != null) {
			aClass423_9029.method5299(294131509);
			aClass423_9029 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class383.method4412((byte) 39);
		try {
			Class314.method3119((byte) 120);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBoolean6618)
			Class150_Sub2.method1771(-83116290);
	}

	final void method3889(byte i) {
		try {
			if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1870572877) == 2) {
				try {
					method3925((short) -32146);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class207.method2195(new StringBuilder().append(throwable.getMessage()).append(" ").append(method3886(1266450203)).toString(), throwable, -306254718);
					aBoolean9059 = true;
					Class136.method1591(Class533.aClass533_6903, 1250519446);
					Class171.method2046(0, false, -1705027985);
				}
			} else
				method3925((short) -12619);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.ai(").append(')').toString());
		}
	}

	static IComponentDefinitions method3926(IComponentDefinitions iComponentDefinitions) {
		Class330_Sub2 class330_sub2 = method3924(iComponentDefinitions);
		if (class330_sub2.method3267(516693227))
			return IsaacCipher.aClass114_5838;
		int i = class330_sub2.method3268((byte) -40);
		if (i == 0)
			return null;
		for (int i_148_ = 0; i_148_ < i; i_148_++) {
			iComponentDefinitions = Class433.method5561(Class411.method5229((751119487 * (iComponentDefinitions.anInt1196)), -892200737), iComponentDefinitions, 495792738);
			if (null == iComponentDefinitions)
				return IsaacCipher.aClass114_5838;
		}
		return iComponentDefinitions;
	}

	static {
		aBoolean8954 = false;
		aString9111 = null;
		anInt8956 = 0;
		anInt8957 = 0;
		aBoolean8958 = false;
		aByteArray8959 = null;
		aLong9079 = 0L;
		aBoolean8961 = false;
		aBoolean9099 = false;
		aString8960 = null;
		aString8964 = null;
		aBoolean9042 = false;
		aBoolean8966 = false;
		aBoolean8967 = false;
		aBoolean9217 = false;
		anInt9158 = 0;
		anInt8970 = 1352860039;
		aString9126 = null;
		aString8972 = null;
		anInt8995 = 990368356;
		aClass249_9024 = new Class249();
		aClass247_8975 = new Class247();
		aClass247_8976 = new Class247();
		aLong8977 = 0L;
		aBoolean9059 = false;
		aBoolean8979 = true;
		anInt8980 = 0;
		anInt8981 = 0;
		aBoolean9194 = true;
		aBoolean8983 = false;
		aBoolean8984 = false;
		anInt9026 = 0;
		aClass3Array8986 = new Class3[8];
		aClass327Array8999 = new Class327[8];
		aBoolean9071 = false;
		aBoolean8989 = false;
		aBoolean9157 = true;
		clientToken = (long) (Math.random() * 9.999999999E9) * -3671889884787865689L;
		aBoolean8992 = false;
		anInt8993 = 0;
		aBoolean9231 = false;
		anInt9199 = 0;
		aBoolean9273 = false;
		aClass471_8997 = new Class471();
		mouseNotches = 0;
		anInt9000 = 0;
		anInterface18Array9001 = new Interface18[131];
		anInt9003 = 0;
		anInterface18Array9004 = new Interface18[75];
		aColorArray9005 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
		aColorArray9006 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };
		aColorArray9007 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };
		anInt9008 = 0;
		anInt9009 = 0;
		anInt9010 = 0;
		aClass367_8974 = new Class367(8);
		aString9012 = null;
		anInterface12_9243 = new Class434();
		aClass497_9014 = new Class497(64);
		aClass330_Sub35Array9015 = new Class330_Sub35[1024];
		anInt9232 = 0;
		anInt9017 = 0;
		anIntArray9018 = new int[1024];
		anInt9019 = 0;
		anIntArray9020 = new int[260];
		anInt8996 = 0;
		anInt9022 = 0;
		anIntArray9021 = new int[1003];
		aClass1_9060 = new Class1();
		aClass1_9025 = new Class1();
		aClass1Array8963 = new Class1[] { aClass1_9025, aClass1_9060 };
		anInt9027 = 0;
		aBoolean9114 = false;
		aClass423_9029 = new Class423();
		aClass304_9030 = new Class304(false);
		aBoolean9031 = false;
		anObject9032 = new Object();
		anObject9081 = new Object();
		anIntArray9034 = new int[64];
		anInt9035 = 0;
		anIntArray9036 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt9265 = -608204173;
		anInt8987 = 244844922;
		aBoolean9039 = false;
		anInt9040 = 777947407;
		anInt9041 = 0;
		anInt8969 = -573012107;
		anInt9043 = 741438747;
		anInt9044 = -1540105625;
		anInt9045 = 0;
		anInt9070 = 0;
		anInt9047 = 0;
		anIntArray9065 = new int[4096];
		anIntArray9050 = new int[4096];
		anIntArray9051 = new int[50];
		anIntArray9052 = new int[50];
		anIntArray9053 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt9156 = 0;
		anInt9055 = 1778394050;
		anInt9056 = 0;
		anInt9057 = -899867202;
		anInt9058 = 0;
		anInt9168 = -1436749147;
		anInt9197 = 0;
		anInt9149 = 0;
		anInt8978 = 411704102;
		anInt9063 = 0;
		anInt9049 = 1610041741;
		anInt9131 = 0;
		aRandom9066 = new Random();
		anInt9210 = 0;
		anInt9068 = 0;
		anInt9069 = 0;
		aFloat9250 = 1115.0F;
		aFloat9141 = 0.0F;
		aFloat9072 = 0.0F;
		aFloat9124 = 0.0F;
		aBoolean9074 = false;
		aBoolean9075 = false;
		anInt9076 = -1909706741;
		anInt9077 = anInt9076 * 102450621 + -313959208;
		aBoolean9038 = true;
		anInt9272 = 0;
		anIntArrayArrayArray9082 = new int[2][][];
		anInt9013 = 150049295;
		anInt9183 = 1683907065;
		anInt9085 = 0;
		anInt9086 = 0;
		anInt9087 = 0;
		anInt9088 = 0;
		anInt9089 = 0;
		aBoolean9090 = false;
		aBoolean9091 = false;
		anInt9092 = 0;
		anIntArray9093 = new int[513];
		anIntArray9094 = new int[511];
		anInt9095 = 0;
		aClass467_9096 = new Class467();
		anInt9097 = 0;
		aFloatArray9253 = new float[3];
		anInt8988 = 0;
		anInt9100 = 0;
		anInt9101 = 0;
		anInt9062 = 0;
		anInt9103 = 0;
		anInt9262 = -1651960339;
		anIntArray9108 = new int[2];
		anIntArray8973 = new int[2];
		anIntArray8952 = new int[2];
		anIntArray9169 = new int[2];
		anIntArray9112 = new int[2];
		aLong9113 = 0L;
		aBoolean9033 = true;
		anInt9246 = 1398977952;
		anInt9116 = -284808848;
		anInt9207 = -56316289;
		anInt9118 = -700675205;
		players = new Player[2048];
		anInt9121 = -298521505;
		aBoolean9122 = false;
		aBoolean9123 = false;
		anInt9182 = 0;
		anInt9125 = 0;
		aBoolean9083 = false;
		aBoolean9228 = false;
		aBoolean9128 = false;
		aBoolean9120 = false;
		aBoolean9130 = true;
		aBoolean9073 = false;
		aShortArray9133 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		anIntArray9134 = new int[8];
		aStringArray9167 = new String[8];
		aBooleanArray9136 = new boolean[8];
		anInt9137 = -1863513823;
		aClass497_9138 = new Class497(64);
		aClass471_9139 = new Class471();
		aClass497_9216 = new Class497(16);
		aClass467_9061 = new Class467();
		anIntArray9117 = new int[25];
		anIntArray9143 = new int[25];
		anIntArray9144 = new int[25];
		anInt9145 = 0;
		anInt9215 = -1424838125;
		anInt9147 = 907195093;
		anInt9148 = -1402418283;
		anInt9201 = -472330947;
		aBoolean9150 = false;
		anInt9151 = 1177757259;
		anInt9104 = 1909297841;
		aString9152 = null;
		aString9154 = null;
		windowPaneId = -1292218821;
		aClass497_9284 = new Class497(8);
		anInt9011 = 0;
		aClass114_9078 = null;
		anInt9159 = 0;
		anInt9160 = 0;
		aBoolean9161 = false;
		aBoolean9162 = false;
		aClass114_9163 = null;
		aBoolean9164 = false;
		aClass114_9165 = null;
		aClass114_9242 = null;
		anInt8994 = 0;
		anInt9054 = 0;
		aClass114_9200 = null;
		aBoolean9170 = false;
		anInt9171 = -948988185;
		anInt9172 = 1964317373;
		anInt9173 = 670062295;
		anInt9174 = 1721369897;
		aBoolean9175 = false;
		anInt9176 = 806590413;
		anInt9177 = -1038068317;
		aBoolean9178 = false;
		anInt9179 = 0;
		aBoolean9180 = false;
		aBoolean9254 = false;
		anInt9268 = -654059805;
		anIntArray9185 = new int[32];
		anInt9186 = 0;
		anIntArray9187 = new int[32];
		anInt9188 = 0;
		anIntArray9189 = new int[32];
		anInt9247 = 0;
		anIntArray9237 = new int[32];
		anInt9192 = 0;
		anIntArray9193 = new int[32];
		anInt9142 = 0;
		anIntArray9195 = new int[32];
		anInt9196 = 0;
		anInt9028 = 0;
		anInt9023 = 0;
		anInt9109 = 0;
		anInt9129 = 0;
		anInt9181 = 0;
		anInt9202 = 0;
		anInt9208 = 0;
		anInt9205 = 0;
		aBoolean9206 = false;
		aLong8990 = 3014432960951782915L;
		aClass471_9280 = new Class471();
		aClass471_9209 = new Class471();
		aClass471_9219 = new Class471();
		aClass497_9211 = new Class497(512);
		anInt9213 = 0;
		anInt9214 = 698187338;
		aBooleanArray9230 = new boolean[113];
		aBooleanArray9263 = new boolean[113];
		aRectangleArray9252 = new Rectangle[113];
		for (int i = 0; i < 113; i++)
			aRectangleArray9252[i] = new Rectangle();
		anInt9218 = 0;
		anIntArray8955 = new int[4];
		anInt9220 = 0;
		anInt9221 = -1762618963;
		anIntArray9222 = new int[-1679046231 * anInt9221];
		anIntArray9223 = new int[anInt9221 * -1679046231];
		anIntArray9224 = new int[anInt9221 * -1679046231];
		aClass60Array9225 = new Class60[-1679046231 * anInt9221];
		anIntArray9226 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt9227 = 0;
		anInt9264 = 0;
		aLongArray9064 = new long[100];
		anInt9190 = 0;
		aString8968 = null;
		aString9233 = null;
		aClass286Array9234 = new Class286[6];
		anInt9235 = 0;
		aClass532_9236 = new Class532();
		aBooleanArray9238 = new boolean[5];
		anIntArray9239 = new int[5];
		anIntArray9240 = new int[5];
		anIntArray9106 = new int[5];
		anIntArray9046 = new int[5];
		aShort8962 = (short) 256;
		aShort9067 = (short) 205;
		aShort9245 = (short) 256;
		aShort9016 = (short) 320;
		aShort9191 = (short) 1;
		aShort9203 = (short) 32767;
		aShort9249 = (short) 1;
		aShort8965 = (short) 32767;
		anInt9251 = 0;
		anInt9166 = 0;
		anInt9255 = 0;
		anInt9102 = 0;
		anInt9115 = 0;
		anInt9256 = 0;
		anInt9257 = 0;
		aClass99Array9259 = new Class99[200];
		aClass467_9260 = new Class467();
		anInt9261 = 0;
		aClass75Array8982 = new Class75[100];
		aCalendar9098 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		aByte9283 = (byte) -6;
		anInterface19_9266 = new Class313();
		aLong9267 = 3760833418005358083L;
		aLong9153 = 3504572913697504947L;
		anIntArray9285 = new int[4];
	}

	public String method3886(int i) {
		try {
			String string = " ";
			try {
				Class381 class381 = aClass304_9030.method3022(2072002117);
				string = new StringBuilder().append(string).append(class381.gameSceneBaseX * -1261027839).append(Class215.aString2081).append(-1542584207 * class381.gameSceneBaseY).append(Class215.aString2081).append(aClass304_9030.method2990(-972612074)).append(Class215.aString2081).append(aClass304_9030.method3033((byte) -98)).append(" ").toString();
				if (Class263_Sub2.myPlayer != null)
					string = new StringBuilder().append(string).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append((Class263_Sub2.myPlayer.anIntArray10018[0]) + class381.gameSceneBaseX * -1261027839).append(Class215.aString2081).append((Class263_Sub2.myPlayer.anIntArray10059[0]) + class381.gameSceneBaseY * -1542584207).append(" ").toString();
				else
					string = new StringBuilder().append(string).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append(Class85.anInt712 * -127654579).append(Class215.aString2081).append(" ").toString();
				string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-960783873)).append(" ").append(Class448.aClass330_Sub50_5555.aClass464_Sub9_7899.method5766((byte) 1)).append(" ").append(Class545.method6347(1079239502)).append(" ").append(Class300.anInt3058 * -1969079741).append(Class215.aString2081).append(-1548608507 * Class146.anInt1615).append(" ").toString();
				string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub2_7868.method5736((byte) 0)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub28_7885.method5837(-395970316)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub25_7896.method5827(502591542)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5787(911230898)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class448.aClass330_Sub50_5555.aClass464_Sub21_7875.method5811(-1390004513)).append(" ").toString();
				string = new StringBuilder().append(string).append("0 ").toString();
				string = new StringBuilder().append(string).append(-270157335 * anInt6617).append(" ").toString();
				string = new StringBuilder().append(string).append(anInt8995 * -296919301).append(" ").toString();
				if (null != Class375.aClass330_Sub51_3933)
					string = new StringBuilder().append(string).append(Class375.aClass330_Sub51_3933.anInt7946 * -140064631).toString();
				else
					string = new StringBuilder().append(string).append(-1).toString();
				string = new StringBuilder().append(string).append(" ").toString();
				if (aString9126 != null)
					string = new StringBuilder().append(string).append(aString9126).toString();
				else
					string = new StringBuilder().append(string).append(Class215.aString2081).toString();
				try {
					if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(671702515) == 2) {
						Class var_class = Class.forName("java.lang.ClassLoader");
						Field field = var_class.getDeclaredField("nativeLibraries");
						Class var_class_149_ = (Class.forName("java.lang.reflect.AccessibleObject"));
						Method method = var_class_149_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
						method.invoke(field, new Object[] { Boolean.TRUE });
						Vector vector = (Vector) field.get(Class.forName("client").getClassLoader());
						for (int i_150_ = 0; i_150_ < vector.size(); i_150_++) {
							try {
								Object object = vector.elementAt(i_150_);
								Field field_151_ = object.getClass().getDeclaredField("name");
								method.invoke(field_151_, new Object[] { Boolean.TRUE });
								try {
									String string_152_ = (String) field_151_.get(object);
									if (null != string_152_ && (string_152_.indexOf("sw3d.dll") != -1)) {
										Field field_153_ = object.getClass().getDeclaredField("handle");
										method.invoke(field_153_, (new Object[] { Boolean.TRUE }));
										string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_153_.getLong(object))).toString();
										method.invoke(field_153_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_151_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					}
				} catch (Throwable throwable) {
					/* empty */
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("client.v(").append(')').toString());
		}
	}

	static final void method3927() {
		int i = Class15.anInt192 * -1468156857;
		int[] is = Class15.anIntArray187;
		int i_154_ = Class448.aClass330_Sub50_5555.aClass464_Sub4_7883.method5748(1454376903);
		boolean bool = i_154_ == 1 && i > 200 || i_154_ == 0 && i > 50;
		for (int i_155_ = 0; i_155_ < i; i_155_++) {
			Player class432_sub1_sub1_sub1_sub1 = players[is[i_155_]];
			if (!class432_sub1_sub1_sub1_sub1.method5465((byte) -1))
				class432_sub1_sub1_sub1_sub1.anInt10052 = -112912163;
			else if (class432_sub1_sub1_sub1_sub1.hidden)
				class432_sub1_sub1_sub1_sub1.anInt10052 = -112912163;
			else {
				class432_sub1_sub1_sub1_sub1.method5406(-963005291);
				if (class432_sub1_sub1_sub1_sub1.aShort9922 < 0 || class432_sub1_sub1_sub1_sub1.aShort9921 < 0 || (class432_sub1_sub1_sub1_sub1.aShort9920 >= aClass304_9030.method2990(-1323159288)) || (class432_sub1_sub1_sub1_sub1.aShort9923 >= aClass304_9030.method3033((byte) 5)))
					class432_sub1_sub1_sub1_sub1.anInt10052 = -112912163;
				else {
					class432_sub1_sub1_sub1_sub1.aBoolean10233 = (class432_sub1_sub1_sub1_sub1.aClass477_Sub3_10039.aBoolean8752) ? bool : false;
					if (class432_sub1_sub1_sub1_sub1 == Class263_Sub2.myPlayer)
						class432_sub1_sub1_sub1_sub1.anInt10052 = 2034571485;
					else {
						int i_156_ = 0;
						if (!class432_sub1_sub1_sub1_sub1.aBoolean10012)
							i_156_++;
						if (!class432_sub1_sub1_sub1_sub1.aClass467_10027.method5855(1671356272))
							i_156_ += 2;
						i_156_ += 5 - class432_sub1_sub1_sub1_sub1.method5453(-982873605) << 2;
						if (class432_sub1_sub1_sub1_sub1.aBoolean10234 || class432_sub1_sub1_sub1_sub1.aBoolean10247)
							i_156_ += 512;
						else {
							if (anInt9097 * 1021375495 == 0)
								i_156_ += 32;
							else
								i_156_ += 128;
							i_156_ += 256;
						}
						class432_sub1_sub1_sub1_sub1.anInt10052 = 112912163 * (1 + i_156_);
					}
				}
			}
		}
		for (int i_157_ = 0; i_157_ < anInt9017 * -823688441; i_157_++) {
			NPC class432_sub1_sub1_sub1_sub2 = ((NPC) (((Class330_Sub35) aClass497_9014.method6094((long) anIntArray9018[i_157_])).anObject7733));
			if (!class432_sub1_sub1_sub1_sub2.method5482((byte) -96) || !class432_sub1_sub1_sub1_sub2.aClass551_10251.method6374(Class158.aClass561_6474, (byte) -62))
				class432_sub1_sub1_sub1_sub2.anInt10052 = -112912163;
			else {
				class432_sub1_sub1_sub1_sub2.method5406(467121439);
				if (class432_sub1_sub1_sub1_sub2.aShort9922 < 0 || class432_sub1_sub1_sub1_sub2.aShort9921 < 0 || (class432_sub1_sub1_sub1_sub2.aShort9920 >= aClass304_9030.method2990(-1102058179)) || (class432_sub1_sub1_sub1_sub2.aShort9923 >= aClass304_9030.method3033((byte) -55)))
					class432_sub1_sub1_sub1_sub2.anInt10052 = -112912163;
				else {
					int i_158_ = 0;
					if (!class432_sub1_sub1_sub1_sub2.aBoolean10012)
						i_158_++;
					if (!class432_sub1_sub1_sub1_sub2.aClass467_10027.method5855(1671356272))
						i_158_ += 2;
					i_158_ += 5 - class432_sub1_sub1_sub1_sub2.method5453(-560378913) << 2;
					if (0 == 1021375495 * anInt9097) {
						if (class432_sub1_sub1_sub1_sub2.aClass551_10251.aBoolean6308)
							i_158_ += 64;
						else
							i_158_ += 128;
					} else if (1 == anInt9097 * 1021375495) {
						if (class432_sub1_sub1_sub1_sub2.aClass551_10251.aBoolean6308)
							i_158_ += 32;
						else
							i_158_ += 64;
					}
					if (class432_sub1_sub1_sub1_sub2.aClass551_10251.aBoolean6318)
						i_158_ += 1024;
					else if (!class432_sub1_sub1_sub1_sub2.aClass551_10251.aBoolean6319)
						i_158_ += 256;
					class432_sub1_sub1_sub1_sub2.anInt10052 = 112912163 * (i_158_ + 1);
				}
			}
		}
		for (int i_159_ = 0; i_159_ < aClass3Array8986.length; i_159_++) {
			Class3 class3 = aClass3Array8986[i_159_];
			if (null != class3) {
				if (class3.anInt53 * -1598012345 == 1) {
					Class330_Sub35 class330_sub35 = ((Class330_Sub35) aClass497_9014.method6094((long) (539258015 * (class3.anInt47))));
					if (null != class330_sub35) {
						NPC class432_sub1_sub1_sub1_sub2 = ((NPC) class330_sub35.anObject7733);
						if ((-806256501 * class432_sub1_sub1_sub1_sub2.anInt10052) >= 0)
							class432_sub1_sub1_sub1_sub2.anInt10052 += -684124160;
					}
				} else if (10 == class3.anInt53 * -1598012345) {
					Player class432_sub1_sub1_sub1_sub1 = (players[539258015 * class3.anInt47]);
					if (class432_sub1_sub1_sub1_sub1 != null && (class432_sub1_sub1_sub1_sub1 != (Class263_Sub2.myPlayer)) && (-806256501 * class432_sub1_sub1_sub1_sub1.anInt10052) >= 0)
						class432_sub1_sub1_sub1_sub1.anInt10052 += -684124160;
				}
			}
		}
	}

	public final void method255() {
		if (method3884((byte) 23)) {
			String string = "";
			Class219[] class219s = Class508.method6157(-1614674023);
			for (int i = 0; i < class219s.length; i++) {
				Class219 class219 = class219s[i];
				String string_160_ = Class293.anApplet6804.getParameter(class219.aString2175);
				if (string_160_ != null) {
					switch (Integer.parseInt(class219.aString2175)) {
					case 29:
						Class503.aString5915 = string_160_;
						break;
					case 14:
						if (string_160_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9217 = true;
						else
							aBoolean9217 = false;
						break;
					case 12:
						if (string_160_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8954 = true;
						else
							aBoolean8954 = false;
						break;
					case 32:
						Class18.aString237 = string_160_;
						break;
					case 20:
						anInt8956 = Integer.parseInt(string_160_) * -170551815;
						break;
					case 23:
						string = string_160_;
						break;
					case 34:
						Class216.anInt2113 = Integer.parseInt(string_160_) * -634629943;
						break;
					case 8:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.anInt5889 = Integer.parseInt(string_160_) * -1143720213;
						break;
					case 27:
						if (string_160_.equals(Class215.aString2085))
							aBoolean9273 = true;
						else
							aBoolean9273 = false;
						break;
					case 25:
						if (string_160_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8966 = true;
						else
							aBoolean8966 = false;
						break;
					case 1:
						anInt8970 = Integer.parseInt(string_160_) * -1352860039;
						break;
					case 16:
						anInt8957 = Integer.parseInt(string_160_) * -1639266399;
						if (-1667441567 * anInt8957 < 0 || (anInt8957 * -1667441567 >= aColorArray9005.length))
							anInt8957 = 0;
						break;
					case 21:
						if (string_160_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9198 = true;
						else
							aBoolean9198 = false;
						break;
					case 31:
						Class19.aString243 = string_160_;
						break;
					case 13:
						Class429.aClass454_4369 = Class454.method5646(Integer.parseInt(string_160_), 95248327);
						break;
					case 2:
						aString8960 = string_160_;
						if (aString8960.length() > 100)
							aString8960 = null;
						break;
					case 4:
						break;
					case 10:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.aString5886 = string_160_;
						break;
					case 26:
						if (string_160_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8967 = true;
						else
							aBoolean8967 = false;
						break;
					case 11:
						Class404.aClass457_4162 = (Class457) (Class479.method6015(Class457.method5658((short) 3289), Integer.parseInt(string_160_), (byte) 89));
						if (Class404.aClass457_4162 == Class457.aClass457_6837)
							Class404.aClass457_4162 = Class457.aClass457_6839;
						else if (!Class457.method5662(Class404.aClass457_4162, -10971061) && (Class457.aClass457_6834 != Class404.aClass457_4162))
							Class404.aClass457_4162 = Class457.aClass457_6834;
						break;
					case 9:
						if (string_160_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9122 = true;
						break;
					case 22:
						if (string_160_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9042 = true;
						else
							aBoolean9042 = false;
						break;
					case 17:
						aString8972 = string_160_;
						break;
					default:
						Class207.method2195("", new RuntimeException(), -306254718);
						break;
					case 6:
						Class516.anInt5974 = Integer.parseInt(string_160_) * 1515128753;
						break;
					case 5:
						aString8964 = string_160_;
						break;
					case 7:
						aClass435_9146 = Class452.method5635(Integer.parseInt(string_160_), 1412377936);
						break;
					case 28:
						aString9111 = string_160_;
						break;
					case 33:
						Class288.aClass469_2956 = Class356.method4189(Integer.parseInt(string_160_), (byte) -54);
						if (Class469.aClass469_5605 != Class288.aClass469_2956 && (Class288.aClass469_2956 != Class469.aClass469_5604) && (Class288.aClass469_2956 != Class469.aClass469_5603) && (Class469.aClass469_5602 != Class288.aClass469_2956))
							Class288.aClass469_2956 = Class469.aClass469_5602;
						break;
					case 30:
						aString9126 = string_160_;
						break;
					case 18:
						Class507.aClass498_5932 = new Class498();
						Class507.aClass498_5932.anInt5889 = Integer.parseInt(string_160_) * -1143720213;
						break;
					case 3:
						break;
					case 15:
						if (string_160_.equals(Class215.aString2085))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 24:
						if (null != string_160_) {
							aByteArray8959 = (Class231.method2352(Class366_Sub5.method4282(string_160_, (byte) 2), -1507657685));
							if (aByteArray8959.length < 16)
								aByteArray8959 = null;
						}
						break;
					case 35:
						aLong9079 = (Long.parseLong(string_160_) * -2425012191213527747L);
					}
				}
			}
			if (null == aString9111)
				aString9111 = "";
			Class318 class318 = new Class318(64571523 * anInt9207, anInt9118 * 1108170155, anInt9246 * -1346562523, anInt9116 * 815086887, aClass435_9146.aString4415);
			Class394.aClient4082 = this;
			String string_161_ = Class288.aClass469_2956.aString5607;
			int i = 171998097 * Class288.aClass469_2956.anInt5608 + 32;
			if (!string.equals("")) {
				string_161_ = new StringBuilder().append(string_161_).append("_").append(string).toString();
				i = 0;
			}
			method3878(class318, aClass435_9146.aString4422, string_161_, i, Class158_Sub1.getCacheIndex(-563568215), 742, 1, aBoolean9217, 1531855006);
		}
	}

	public final void method256() {
		if (method3884((byte) 17)) {
			String string = "";
			Class219[] class219s = Class508.method6157(-316101446);
			for (int i = 0; i < class219s.length; i++) {
				Class219 class219 = class219s[i];
				String string_162_ = Class293.anApplet6804.getParameter(class219.aString2175);
				if (string_162_ != null) {
					switch (Integer.parseInt(class219.aString2175)) {
					case 29:
						Class503.aString5915 = string_162_;
						break;
					case 14:
						if (string_162_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9217 = true;
						else
							aBoolean9217 = false;
						break;
					case 12:
						if (string_162_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8954 = true;
						else
							aBoolean8954 = false;
						break;
					case 32:
						Class18.aString237 = string_162_;
						break;
					case 20:
						anInt8956 = Integer.parseInt(string_162_) * -170551815;
						break;
					case 23:
						string = string_162_;
						break;
					case 34:
						Class216.anInt2113 = Integer.parseInt(string_162_) * -634629943;
						break;
					case 8:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.anInt5889 = Integer.parseInt(string_162_) * -1143720213;
						break;
					case 27:
						if (string_162_.equals(Class215.aString2085))
							aBoolean9273 = true;
						else
							aBoolean9273 = false;
						break;
					case 25:
						if (string_162_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8966 = true;
						else
							aBoolean8966 = false;
						break;
					case 1:
						anInt8970 = Integer.parseInt(string_162_) * -1352860039;
						break;
					case 16:
						anInt8957 = Integer.parseInt(string_162_) * -1639266399;
						if (-1667441567 * anInt8957 < 0 || (anInt8957 * -1667441567 >= aColorArray9005.length))
							anInt8957 = 0;
						break;
					case 21:
						if (string_162_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9198 = true;
						else
							aBoolean9198 = false;
						break;
					case 31:
						Class19.aString243 = string_162_;
						break;
					case 13:
						Class429.aClass454_4369 = Class454.method5646(Integer.parseInt(string_162_), -33053734);
						break;
					case 2:
						aString8960 = string_162_;
						if (aString8960.length() > 100)
							aString8960 = null;
						break;
					case 4:
						break;
					case 10:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.aString5886 = string_162_;
						break;
					case 26:
						if (string_162_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8967 = true;
						else
							aBoolean8967 = false;
						break;
					case 11:
						Class404.aClass457_4162 = (Class457) (Class479.method6015(Class457.method5658((short) -6180), Integer.parseInt(string_162_), (byte) 30));
						if (Class404.aClass457_4162 == Class457.aClass457_6837)
							Class404.aClass457_4162 = Class457.aClass457_6839;
						else if (!Class457.method5662(Class404.aClass457_4162, -549599292) && (Class457.aClass457_6834 != Class404.aClass457_4162))
							Class404.aClass457_4162 = Class457.aClass457_6834;
						break;
					case 9:
						if (string_162_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9122 = true;
						break;
					case 22:
						if (string_162_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9042 = true;
						else
							aBoolean9042 = false;
						break;
					case 17:
						aString8972 = string_162_;
						break;
					default:
						Class207.method2195("", new RuntimeException(), -306254718);
						break;
					case 6:
						Class516.anInt5974 = Integer.parseInt(string_162_) * 1515128753;
						break;
					case 5:
						aString8964 = string_162_;
						break;
					case 7:
						aClass435_9146 = Class452.method5635(Integer.parseInt(string_162_), 993019138);
						break;
					case 28:
						aString9111 = string_162_;
						break;
					case 33:
						Class288.aClass469_2956 = Class356.method4189(Integer.parseInt(string_162_), (byte) -60);
						if (Class469.aClass469_5605 != Class288.aClass469_2956 && (Class288.aClass469_2956 != Class469.aClass469_5604) && (Class288.aClass469_2956 != Class469.aClass469_5603) && (Class469.aClass469_5602 != Class288.aClass469_2956))
							Class288.aClass469_2956 = Class469.aClass469_5602;
						break;
					case 30:
						aString9126 = string_162_;
						break;
					case 18:
						Class507.aClass498_5932 = new Class498();
						Class507.aClass498_5932.anInt5889 = Integer.parseInt(string_162_) * -1143720213;
						break;
					case 3:
						break;
					case 15:
						if (string_162_.equals(Class215.aString2085))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 24:
						if (null != string_162_) {
							aByteArray8959 = (Class231.method2352(Class366_Sub5.method4282(string_162_, (byte) 2), -1521871535));
							if (aByteArray8959.length < 16)
								aByteArray8959 = null;
						}
						break;
					case 35:
						aLong9079 = (Long.parseLong(string_162_) * -2425012191213527747L);
					}
				}
			}
			if (null == aString9111)
				aString9111 = "";
			Class318 class318 = new Class318(64571523 * anInt9207, anInt9118 * 1108170155, anInt9246 * -1346562523, anInt9116 * 815086887, aClass435_9146.aString4415);
			Class394.aClient4082 = this;
			String string_163_ = Class288.aClass469_2956.aString5607;
			int i = 171998097 * Class288.aClass469_2956.anInt5608 + 32;
			if (!string.equals("")) {
				string_163_ = new StringBuilder().append(string_163_).append("_").append(string).toString();
				i = 0;
			}
			method3878(class318, aClass435_9146.aString4422, string_163_, i, Class158_Sub1.getCacheIndex(-1185781424), 742, 1, aBoolean9217, -332079226);
		}
	}

	public final void method258() {
		if (method3884((byte) 30)) {
			String string = "";
			Class219[] class219s = Class508.method6157(-1161117708);
			for (int i = 0; i < class219s.length; i++) {
				Class219 class219 = class219s[i];
				String string_164_ = Class293.anApplet6804.getParameter(class219.aString2175);
				if (string_164_ != null) {
					switch (Integer.parseInt(class219.aString2175)) {
					case 29:
						Class503.aString5915 = string_164_;
						break;
					case 14:
						if (string_164_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9217 = true;
						else
							aBoolean9217 = false;
						break;
					case 12:
						if (string_164_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8954 = true;
						else
							aBoolean8954 = false;
						break;
					case 32:
						Class18.aString237 = string_164_;
						break;
					case 20:
						anInt8956 = Integer.parseInt(string_164_) * -170551815;
						break;
					case 23:
						string = string_164_;
						break;
					case 34:
						Class216.anInt2113 = Integer.parseInt(string_164_) * -634629943;
						break;
					case 8:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.anInt5889 = Integer.parseInt(string_164_) * -1143720213;
						break;
					case 27:
						if (string_164_.equals(Class215.aString2085))
							aBoolean9273 = true;
						else
							aBoolean9273 = false;
						break;
					case 25:
						if (string_164_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8966 = true;
						else
							aBoolean8966 = false;
						break;
					case 1:
						anInt8970 = Integer.parseInt(string_164_) * -1352860039;
						break;
					case 16:
						anInt8957 = Integer.parseInt(string_164_) * -1639266399;
						if (-1667441567 * anInt8957 < 0 || (anInt8957 * -1667441567 >= aColorArray9005.length))
							anInt8957 = 0;
						break;
					case 21:
						if (string_164_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9198 = true;
						else
							aBoolean9198 = false;
						break;
					case 31:
						Class19.aString243 = string_164_;
						break;
					case 13:
						Class429.aClass454_4369 = Class454.method5646(Integer.parseInt(string_164_), -1621794217);
						break;
					case 2:
						aString8960 = string_164_;
						if (aString8960.length() > 100)
							aString8960 = null;
						break;
					case 4:
						break;
					case 10:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.aString5886 = string_164_;
						break;
					case 26:
						if (string_164_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8967 = true;
						else
							aBoolean8967 = false;
						break;
					case 11:
						Class404.aClass457_4162 = (Class457) (Class479.method6015(Class457.method5658((short) 2841), Integer.parseInt(string_164_), (byte) 25));
						if (Class404.aClass457_4162 == Class457.aClass457_6837)
							Class404.aClass457_4162 = Class457.aClass457_6839;
						else if (!Class457.method5662(Class404.aClass457_4162, -1798430001) && (Class457.aClass457_6834 != Class404.aClass457_4162))
							Class404.aClass457_4162 = Class457.aClass457_6834;
						break;
					case 9:
						if (string_164_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9122 = true;
						break;
					case 22:
						if (string_164_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9042 = true;
						else
							aBoolean9042 = false;
						break;
					case 17:
						aString8972 = string_164_;
						break;
					default:
						Class207.method2195("", new RuntimeException(), -306254718);
						break;
					case 6:
						Class516.anInt5974 = Integer.parseInt(string_164_) * 1515128753;
						break;
					case 5:
						aString8964 = string_164_;
						break;
					case 7:
						aClass435_9146 = Class452.method5635(Integer.parseInt(string_164_), 1239174877);
						break;
					case 28:
						aString9111 = string_164_;
						break;
					case 33:
						Class288.aClass469_2956 = Class356.method4189(Integer.parseInt(string_164_), (byte) -2);
						if (Class469.aClass469_5605 != Class288.aClass469_2956 && (Class288.aClass469_2956 != Class469.aClass469_5604) && (Class288.aClass469_2956 != Class469.aClass469_5603) && (Class469.aClass469_5602 != Class288.aClass469_2956))
							Class288.aClass469_2956 = Class469.aClass469_5602;
						break;
					case 30:
						aString9126 = string_164_;
						break;
					case 18:
						Class507.aClass498_5932 = new Class498();
						Class507.aClass498_5932.anInt5889 = Integer.parseInt(string_164_) * -1143720213;
						break;
					case 3:
						break;
					case 15:
						if (string_164_.equals(Class215.aString2085))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 24:
						if (null != string_164_) {
							aByteArray8959 = (Class231.method2352(Class366_Sub5.method4282(string_164_, (byte) 2), -1638540929));
							if (aByteArray8959.length < 16)
								aByteArray8959 = null;
						}
						break;
					case 35:
						aLong9079 = (Long.parseLong(string_164_) * -2425012191213527747L);
					}
				}
			}
			if (null == aString9111)
				aString9111 = "";
			Class318 class318 = new Class318(64571523 * anInt9207, anInt9118 * 1108170155, anInt9246 * -1346562523, anInt9116 * 815086887, aClass435_9146.aString4415);
			Class394.aClient4082 = this;
			String string_165_ = Class288.aClass469_2956.aString5607;
			int i = 171998097 * Class288.aClass469_2956.anInt5608 + 32;
			if (!string.equals("")) {
				string_165_ = new StringBuilder().append(string_165_).append("_").append(string).toString();
				i = 0;
			}
			method3878(class318, aClass435_9146.aString4422, string_165_, i, Class158_Sub1.getCacheIndex(-48624465), 742, 1, aBoolean9217, 1369413347);
		}
	}

	public final void method257() {
		if (method3884((byte) 79)) {
			String string = "";
			Class219[] class219s = Class508.method6157(1320875546);
			for (int i = 0; i < class219s.length; i++) {
				Class219 class219 = class219s[i];
				String string_166_ = Class293.anApplet6804.getParameter(class219.aString2175);
				if (string_166_ != null) {
					switch (Integer.parseInt(class219.aString2175)) {
					case 29:
						Class503.aString5915 = string_166_;
						break;
					case 14:
						if (string_166_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9217 = true;
						else
							aBoolean9217 = false;
						break;
					case 12:
						if (string_166_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8954 = true;
						else
							aBoolean8954 = false;
						break;
					case 32:
						Class18.aString237 = string_166_;
						break;
					case 20:
						anInt8956 = Integer.parseInt(string_166_) * -170551815;
						break;
					case 23:
						string = string_166_;
						break;
					case 34:
						Class216.anInt2113 = Integer.parseInt(string_166_) * -634629943;
						break;
					case 8:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.anInt5889 = Integer.parseInt(string_166_) * -1143720213;
						break;
					case 27:
						if (string_166_.equals(Class215.aString2085))
							aBoolean9273 = true;
						else
							aBoolean9273 = false;
						break;
					case 25:
						if (string_166_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8966 = true;
						else
							aBoolean8966 = false;
						break;
					case 1:
						anInt8970 = Integer.parseInt(string_166_) * -1352860039;
						break;
					case 16:
						anInt8957 = Integer.parseInt(string_166_) * -1639266399;
						if (-1667441567 * anInt8957 < 0 || (anInt8957 * -1667441567 >= aColorArray9005.length))
							anInt8957 = 0;
						break;
					case 21:
						if (string_166_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9198 = true;
						else
							aBoolean9198 = false;
						break;
					case 31:
						Class19.aString243 = string_166_;
						break;
					case 13:
						Class429.aClass454_4369 = Class454.method5646(Integer.parseInt(string_166_), -282909850);
						break;
					case 2:
						aString8960 = string_166_;
						if (aString8960.length() > 100)
							aString8960 = null;
						break;
					case 4:
						break;
					case 10:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.aString5886 = string_166_;
						break;
					case 26:
						if (string_166_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8967 = true;
						else
							aBoolean8967 = false;
						break;
					case 11:
						Class404.aClass457_4162 = (Class457) (Class479.method6015(Class457.method5658((short) -17106), Integer.parseInt(string_166_), (byte) 2));
						if (Class404.aClass457_4162 == Class457.aClass457_6837)
							Class404.aClass457_4162 = Class457.aClass457_6839;
						else if (!Class457.method5662(Class404.aClass457_4162, -2014947205) && (Class457.aClass457_6834 != Class404.aClass457_4162))
							Class404.aClass457_4162 = Class457.aClass457_6834;
						break;
					case 9:
						if (string_166_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9122 = true;
						break;
					case 22:
						if (string_166_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9042 = true;
						else
							aBoolean9042 = false;
						break;
					case 17:
						aString8972 = string_166_;
						break;
					default:
						Class207.method2195("", new RuntimeException(), -306254718);
						break;
					case 6:
						Class516.anInt5974 = Integer.parseInt(string_166_) * 1515128753;
						break;
					case 5:
						aString8964 = string_166_;
						break;
					case 7:
						aClass435_9146 = Class452.method5635(Integer.parseInt(string_166_), 1036645604);
						break;
					case 28:
						aString9111 = string_166_;
						break;
					case 33:
						Class288.aClass469_2956 = Class356.method4189(Integer.parseInt(string_166_), (byte) -66);
						if (Class469.aClass469_5605 != Class288.aClass469_2956 && (Class288.aClass469_2956 != Class469.aClass469_5604) && (Class288.aClass469_2956 != Class469.aClass469_5603) && (Class469.aClass469_5602 != Class288.aClass469_2956))
							Class288.aClass469_2956 = Class469.aClass469_5602;
						break;
					case 30:
						aString9126 = string_166_;
						break;
					case 18:
						Class507.aClass498_5932 = new Class498();
						Class507.aClass498_5932.anInt5889 = Integer.parseInt(string_166_) * -1143720213;
						break;
					case 3:
						break;
					case 15:
						if (string_166_.equals(Class215.aString2085))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 24:
						if (null != string_166_) {
							aByteArray8959 = (Class231.method2352(Class366_Sub5.method4282(string_166_, (byte) 2), -1818384427));
							if (aByteArray8959.length < 16)
								aByteArray8959 = null;
						}
						break;
					case 35:
						aLong9079 = (Long.parseLong(string_166_) * -2425012191213527747L);
					}
				}
			}
			if (null == aString9111)
				aString9111 = "";
			Class318 class318 = new Class318(64571523 * anInt9207, anInt9118 * 1108170155, anInt9246 * -1346562523, anInt9116 * 815086887, aClass435_9146.aString4415);
			Class394.aClient4082 = this;
			String string_167_ = Class288.aClass469_2956.aString5607;
			int i = 171998097 * Class288.aClass469_2956.anInt5608 + 32;
			if (!string.equals("")) {
				string_167_ = new StringBuilder().append(string_167_).append("_").append(string).toString();
				i = 0;
			}
			method3878(class318, aClass435_9146.aString4422, string_167_, i, Class158_Sub1.getCacheIndex(-895749669), 742, 1, aBoolean9217, 1207886433);
		}
	}

	public final void method259() {
		if (method3884((byte) 91)) {
			String string = "";
			Class219[] class219s = Class508.method6157(-1530234598);
			for (int i = 0; i < class219s.length; i++) {
				Class219 class219 = class219s[i];
				String string_168_ = Class293.anApplet6804.getParameter(class219.aString2175);
				if (string_168_ != null) {
					switch (Integer.parseInt(class219.aString2175)) {
					case 29:
						Class503.aString5915 = string_168_;
						break;
					case 14:
						if (string_168_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9217 = true;
						else
							aBoolean9217 = false;
						break;
					case 12:
						if (string_168_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8954 = true;
						else
							aBoolean8954 = false;
						break;
					case 32:
						Class18.aString237 = string_168_;
						break;
					case 20:
						anInt8956 = Integer.parseInt(string_168_) * -170551815;
						break;
					case 23:
						string = string_168_;
						break;
					case 34:
						Class216.anInt2113 = Integer.parseInt(string_168_) * -634629943;
						break;
					case 8:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.anInt5889 = Integer.parseInt(string_168_) * -1143720213;
						break;
					case 27:
						if (string_168_.equals(Class215.aString2085))
							aBoolean9273 = true;
						else
							aBoolean9273 = false;
						break;
					case 25:
						if (string_168_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8966 = true;
						else
							aBoolean8966 = false;
						break;
					case 1:
						anInt8970 = Integer.parseInt(string_168_) * -1352860039;
						break;
					case 16:
						anInt8957 = Integer.parseInt(string_168_) * -1639266399;
						if (-1667441567 * anInt8957 < 0 || (anInt8957 * -1667441567 >= aColorArray9005.length))
							anInt8957 = 0;
						break;
					case 21:
						if (string_168_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9198 = true;
						else
							aBoolean9198 = false;
						break;
					case 31:
						Class19.aString243 = string_168_;
						break;
					case 13:
						Class429.aClass454_4369 = Class454.method5646(Integer.parseInt(string_168_), 740553358);
						break;
					case 2:
						aString8960 = string_168_;
						if (aString8960.length() > 100)
							aString8960 = null;
						break;
					case 4:
						break;
					case 10:
						if (null == Class507.aClass498_5937)
							Class507.aClass498_5937 = new Class498();
						Class507.aClass498_5937.aString5886 = string_168_;
						break;
					case 26:
						if (string_168_.equalsIgnoreCase(Class215.aString2085))
							aBoolean8967 = true;
						else
							aBoolean8967 = false;
						break;
					case 11:
						Class404.aClass457_4162 = (Class457) (Class479.method6015(Class457.method5658((short) -8315), Integer.parseInt(string_168_), (byte) 127));
						if (Class404.aClass457_4162 == Class457.aClass457_6837)
							Class404.aClass457_4162 = Class457.aClass457_6839;
						else if (!Class457.method5662(Class404.aClass457_4162, 94000935) && (Class457.aClass457_6834 != Class404.aClass457_4162))
							Class404.aClass457_4162 = Class457.aClass457_6834;
						break;
					case 9:
						if (string_168_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9122 = true;
						break;
					case 22:
						if (string_168_.equalsIgnoreCase(Class215.aString2085))
							aBoolean9042 = true;
						else
							aBoolean9042 = false;
						break;
					case 17:
						aString8972 = string_168_;
						break;
					default:
						Class207.method2195("", new RuntimeException(), -306254718);
						break;
					case 6:
						Class516.anInt5974 = Integer.parseInt(string_168_) * 1515128753;
						break;
					case 5:
						aString8964 = string_168_;
						break;
					case 7:
						aClass435_9146 = Class452.method5635(Integer.parseInt(string_168_), 1928418082);
						break;
					case 28:
						aString9111 = string_168_;
						break;
					case 33:
						Class288.aClass469_2956 = Class356.method4189(Integer.parseInt(string_168_), (byte) -45);
						if (Class469.aClass469_5605 != Class288.aClass469_2956 && (Class288.aClass469_2956 != Class469.aClass469_5604) && (Class288.aClass469_2956 != Class469.aClass469_5603) && (Class469.aClass469_5602 != Class288.aClass469_2956))
							Class288.aClass469_2956 = Class469.aClass469_5602;
						break;
					case 30:
						aString9126 = string_168_;
						break;
					case 18:
						Class507.aClass498_5932 = new Class498();
						Class507.aClass498_5932.anInt5889 = Integer.parseInt(string_168_) * -1143720213;
						break;
					case 3:
						break;
					case 15:
						if (string_168_.equals(Class215.aString2085))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 24:
						if (null != string_168_) {
							aByteArray8959 = (Class231.method2352(Class366_Sub5.method4282(string_168_, (byte) 2), -1884026093));
							if (aByteArray8959.length < 16)
								aByteArray8959 = null;
						}
						break;
					case 35:
						aLong9079 = (Long.parseLong(string_168_) * -2425012191213527747L);
					}
				}
			}
			if (null == aString9111)
				aString9111 = "";
			Class318 class318 = new Class318(64571523 * anInt9207, anInt9118 * 1108170155, anInt9246 * -1346562523, anInt9116 * 815086887, aClass435_9146.aString4415);
			Class394.aClient4082 = this;
			String string_169_ = Class288.aClass469_2956.aString5607;
			int i = 171998097 * Class288.aClass469_2956.anInt5608 + 32;
			if (!string.equals("")) {
				string_169_ = new StringBuilder().append(string_169_).append("_").append(string).toString();
				i = 0;
			}
			method3878(class318, aClass435_9146.aString4422, string_169_, i, Class158_Sub1.getCacheIndex(592941729), 742, 1, aBoolean9217, 486854993);
		}
	}

	final void method3896() {
		if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-1080096673) == 2) {
			try {
				method3925((short) -11134);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class207.method2195(new StringBuilder().append(throwable.getMessage()).append(" ").append(method3886(1095812507)).toString(), throwable, -306254718);
				aBoolean9059 = true;
				Class136.method1591(Class533.aClass533_6903, -1867590931);
				Class171.method2046(0, false, -328787230);
			}
		} else
			method3925((short) -25549);
	}

	final void method3907() {
		if (Class448.aClass330_Sub50_5555.aClass464_Sub23_7895.method5819(-931546771) == 2) {
			try {
				method3925((short) -17967);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class207.method2195(new StringBuilder().append(throwable.getMessage()).append(" ").append(method3886(-1088398489)).toString(), throwable, -306254718);
				aBoolean9059 = true;
				Class136.method1591(Class533.aClass533_6903, 1918878305);
				Class171.method2046(0, false, -461999750);
			}
		} else
			method3925((short) -5821);
	}
}
