/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class102 {
	static HashMap aHashMap921 = new HashMap();
	static Map aMap922;
	public static long aLong923 = 1000L;
	public static Class362 aClass362_924;

	static TimeZone method1217(String string, int i) {
		try {
			synchronized (aHashMap921) {
				TimeZone timezone = (TimeZone) aHashMap921.get(string);
				if (timezone == null) {
					timezone = TimeZone.getTimeZone(string);
					aHashMap921.put(string, timezone);
				}
				TimeZone timezone_0_ = timezone;
				return timezone_0_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.p(").append(')').toString());
		}
	}

	Class102() throws Throwable {
		throw new Error();
	}

	static String method1218(Date date, String string, TimeZone timezone, Class454 class454, byte i) {
		try {
			if (aMap922 == null) {
				aMap922 = new HashMap(7);
				Class454[] class454s = Class454.method5650(-1396520753);
				for (int i_1_ = 0; i_1_ < class454s.length; i_1_++) {
					Class454 class454_2_ = class454s[i_1_];
					aMap922.put(class454_2_, new ConcurrentLinkedQueue());
				}
			}
			ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap922.get(class454);
			SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
			if (simpledateformat == null)
				simpledateformat = new SimpleDateFormat(string, class454.method5645(-1991660151));
			else
				simpledateformat.applyPattern(string);
			simpledateformat.setTimeZone(timezone);
			String string_3_ = simpledateformat.format(date);
			concurrentlinkedqueue.add(simpledateformat);
			return string_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.j(").append(')').toString());
		}
	}

	static TimeZone method1219(int i) {
		try {
			return method1217("Europe/London", 1710912603);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.i(").append(')').toString());
		}
	}

	static {
		Calendar.getInstance(method1217("Europe/London", 1230343047));
	}

	public static String method1220(Date date, String string, int i) {
		try {
			return method1218(date, string, method1219(1850356846), Class454.aClass454_6832, (byte) 38);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.r(").append(')').toString());
		}
	}

	static void method1221(Buffer class330_sub46, int i) {
		try {
			for (;;) {
				int i_4_ = class330_sub46.readUnsignedByte(1846560828);
				switch (i_4_) {
				case 0:
					Class96.anInt863 = class330_sub46.readUnsignedShort(80314709) * 993473877;
					Class96.anInt860 = class330_sub46.readUnsignedShort(1138881962) * -1938921823;
					break;
				case 255:
					return;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.j(").append(')').toString());
		}
	}

	static final void method1222(Class430 class430, int i) {
		try {
			int i_5_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub13_7893.method5716(i_5_, 751304830);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.aqd(").append(')').toString());
		}
	}

	public static final void method1223(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			Class150_Sub2.anInt7270 = -1823532171 * i;
			Class330_Sub39.anInt7766 = i_6_ * 1859428019;
			Class366.anInt3856 = 915403457 * i_7_;
			Class355.anInt3638 = -1148836499 * i_8_;
			Class18.anInt238 = i_9_ * -1824591627;
			if (-1242416291 * Class18.anInt238 >= 100) {
				int i_11_ = Class150_Sub2.anInt7270 * -1522943488 + 256;
				int i_12_ = Class330_Sub39.anInt7766 * 1384183296 + 256;
				int i_13_ = (Class431.method5342(i_11_, i_12_, -127654579 * Class85.anInt712, 1996761881) - 1767087425 * Class366.anInt3856);
				int i_14_ = i_11_ - Class471.anInt5612 * -1795110955;
				int i_15_ = i_13_ - 2005017147 * Gfx.anInt578;
				int i_16_ = i_12_ - Class325_Sub3.anInt7484 * 1947030235;
				int i_17_ = (int) Math.sqrt((double) (i_14_ * i_14_ + i_16_ * i_16_));
				Class321.anInt7018 = ((int) (Math.atan2((double) i_15_, (double) i_17_) * 2607.5945876176133) & 0x3fff) * -1105882715;
				Class145_Sub1.anInt7266 = ((int) (Math.atan2((double) i_14_, (double) i_16_) * -2607.5945876176133) & 0x3fff) * -1543696161;
				Class119.anInt1399 = 0;
				if (Class321.anInt7018 * -1875448275 < 1024)
					Class321.anInt7018 = 1447465984;
				if (-1875448275 * Class321.anInt7018 > 3072)
					Class321.anInt7018 = 47430656;
			}
			Class147.anInt1621 = -1659001381;
			Class439.anInt4456 = 1180637393;
			Class457.anInt6844 = 1651776935;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.hw(").append(')').toString());
		}
	}

	static void method1224(int i) {
		try {
			Class355_Sub1.anIntArray7999[44] = 71;
			Class355_Sub1.anIntArray7999[45] = 26;
			Class355_Sub1.anIntArray7999[46] = 72;
			Class355_Sub1.anIntArray7999[47] = 73;
			Class355_Sub1.anIntArray7999[59] = 57;
			Class355_Sub1.anIntArray7999[61] = 27;
			Class355_Sub1.anIntArray7999[91] = 42;
			Class355_Sub1.anIntArray7999[92] = 74;
			Class355_Sub1.anIntArray7999[93] = 43;
			Class355_Sub1.anIntArray7999[192] = 28;
			Class355_Sub1.anIntArray7999[222] = 58;
			Class355_Sub1.anIntArray7999[520] = 59;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.q(").append(')').toString());
		}
	}

	static void method1225(Buffer class330_sub46, int i) {
		try {
			if ((class330_sub46.payload.length - -824785231 * class330_sub46.offset) >= 1) {
				int i_18_ = class330_sub46.readUnsignedByte(1039554122);
				if (i_18_ >= 0 && i_18_ <= 1 && (class330_sub46.payload.length - class330_sub46.offset * -824785231) >= 2) {
					int i_19_ = class330_sub46.readUnsignedShort(1601887672);
					if ((class330_sub46.payload.length - class330_sub46.offset * -824785231) >= i_19_ * 6) {
						for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
							int i_21_ = class330_sub46.readUnsignedShort(1828643193);
							int i_22_ = class330_sub46.readInt((byte) 73);
							if (i_21_ < Class555.anIntArray6382.length) {
								if (!Class330_Sub26.aBooleanArray7696[i_21_]) {
									if (i >= -1222107184) {
										/* empty */
									}
								} else {
									if ((Class495.aClass515_5872.method6203(i_21_, (byte) -102).aChar5969) == '1') {
										if (i_22_ < -1)
											continue;
										if (i_22_ > 1) {
											if (i >= -1222107184)
												throw new IllegalStateException();
											continue;
										}
									}
									Class555.anIntArray6382[i_21_] = i_22_;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("ed.b(").append(')').toString());
		}
	}
}
