/* Class411 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class411 {
	public Interface20 anInterface20_4245;

	public Class411(IndexTable class280) {
		byte[] is = class280.method2761(Class420.aClass420_4306.anInt4307 * 41549091, 1806527147);
		method5224(new Buffer(is), (byte) -93);
	}

	void method5224(Buffer class330_sub46, byte i) {
		try {
			for (;;) {
				int i_0_ = class330_sub46.readUnsignedByte(-267421513);
				if (i_0_ == 0) {
					if (i >= 0) {
						/* empty */
					}
					break;
				}
				if (i_0_ == 1)
					anInterface20_4245 = Class297.method2965(class330_sub46, (byte) 61);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.r(").append(')').toString());
		}
	}

	static final void method5225(Class430 class430, int i) {
		try {
			Class392.method4610(((Class432_Sub1) ((Class430) class430).anInterface2_4389), class430, -2003260436);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.arp(").append(')').toString());
		}
	}

	public static String method5226(CharSequence charsequence, byte i) {
		try {
			int i_1_ = charsequence.length();
			StringBuilder stringbuilder = new StringBuilder(i_1_);
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				char c = charsequence.charAt(i_2_);
				if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c || c == '_')
					stringbuilder.append(c);
				else if (' ' == c)
					stringbuilder.append('+');
				else {
					int i_3_ = ItemEquipDefinitions.method6216(c, -947519049);
					stringbuilder.append('%');
					int i_4_ = i_3_ >> 4 & 0xf;
					if (i_4_ >= 10)
						stringbuilder.append((char) (55 + i_4_));
					else
						stringbuilder.append((char) (i_4_ + 48));
					i_4_ = i_3_ & 0xf;
					if (i_4_ >= 10)
						stringbuilder.append((char) (i_4_ + 55));
					else
						stringbuilder.append((char) (i_4_ + 48));
				}
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.j(").append(')').toString());
		}
	}

	static final void method5227(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4378 -= -119156554;
			String string = (String) (((Class430) class430).anObjectArray4386[-1378875437 * ((Class430) class430).anInt4378]);
			String string_5_ = ((String) (((Class430) class430).anObjectArray4386[-1378875437 * ((Class430) class430).anInt4378 + 1]));
			int i_6_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = string.indexOf(string_5_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.aaz(").append(')').toString());
		}
	}

	static final void method5228(int i) {
		try {
			Iterator iterator = client.aClass497_9216.iterator();
			while (iterator.hasNext()) {
				Class330_Sub36_Sub2 class330_sub36_sub2 = (Class330_Sub36_Sub2) iterator.next();
				Class432_Sub1_Sub1_Sub4 class432_sub1_sub1_sub4 = (((Class330_Sub36_Sub2) class330_sub36_sub2).aClass432_Sub1_Sub1_Sub4_9624);
				if (client.aClass304_9030.method3023(-400722441) != null && class432_sub1_sub1_sub4.method5500(-1972963495))
					client.aClass304_9030.method3023(-400722441).method4145(class432_sub1_sub1_sub4, true, 2073556539);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.ju(").append(')').toString());
		}
	}

	public static Class120 method5229(int i, int i_7_) {
		try {
			return Class3.aClass120Array56[i >> 16];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.i(").append(')').toString());
		}
	}

	static final void method5230(Class430 class430, int i) {
		try {
			int i_8_ = (((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 -= -1390004513) * 1632830751)]);
			Class330_Sub36_Sub9 class330_sub36_sub9 = Class370.aClass268_6770.method2659(i_8_, 1089066090);
			if (null == class330_sub36_sub9.anIntArray9684)
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = 0;
			else
				((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751) - 1] = class330_sub36_sub9.anIntArray9684.length;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.acc(").append(')').toString());
		}
	}

	public static void method5231(int i, int i_9_) {
		try {
			Class330_Sub36_Sub3 class330_sub36_sub3 = Class464_Sub4.method5750(21, (long) i);
			class330_sub36_sub3.method3444(1908091451);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.al(").append(')').toString());
		}
	}

	static boolean method5232(Class372 class372, int i) {
		try {
			if (class372 == null)
				return false;
			if (!class372.aBoolean3883)
				return false;
			if (!class372.method4327(Class354_Sub1.anInterface29_3496, (byte) 97))
				return false;
			if (Class354_Sub1.aClass497_7990.method6094((long) (-198407 * class372.anInt3871)) != null)
				return false;
			if (Class354_Sub1.aClass497_7991.method6094((long) (-546800133 * class372.anInt3911)) != null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.cj(").append(')').toString());
		}
	}

	static void method5233(NPC class432_sub1_sub1_sub1_sub2, boolean bool, int i) {
		try {
			if (Class484.anInt5786 * -2008486989 < 403) {
				Class551 class551 = class432_sub1_sub1_sub1_sub2.aClass551_10251;
				String string = class432_sub1_sub1_sub1_sub2.aString10259;
				if (class551.anIntArray6326 != null) {
					class551 = class551.method6371(Class158.aClass561_6474, (byte) 73);
					if (class551 == null)
						return;
					string = class551.aString6323;
				}
				if (class551.aBoolean6329) {
					if (0 != (class432_sub1_sub1_sub1_sub2.anInt10258 * 1541581717)) {
						String string_10_ = (client.aClass435_9146 == Class435.aClass435_4416 ? (Class526.aClass526_6170.method6257(Class429.aClass454_4369, 991479434)) : (Class526.aClass526_6168.method6257(Class429.aClass454_4369, 991479434)));
						string = new StringBuilder().append(string).append(Class557.method6454((class432_sub1_sub1_sub1_sub2.anInt10258 * 1541581717), (-650833685 * (Class263_Sub2.myPlayer.anInt10228)), -1798420104)).append(Class215.aString2080).append(string_10_).append(1541581717 * class432_sub1_sub1_sub1_sub2.anInt10258).append(Class215.aString2078).toString();
					}
					if (client.aBoolean9150 && !bool) {
						Class537 class537 = (1552382549 * OutgoingPacket.anInt2579 != -1 ? (Class301.aClass543_3059.method6339(OutgoingPacket.anInt2579 * 1552382549, -1323998072)) : null);
						if (0 != (Class503.anInt5916 * -1357430571 & 0x2) && (null == class537 || (class551.method6370((1552382549 * OutgoingPacket.anInt2579), (class537.anInt6235 * -735399997), (byte) 77) != class537.anInt6235 * -735399997)))
							Class360.method4241(client.aString9152, new StringBuilder().append(client.aString9154).append(" ").append(Class215.aString2082).append(" ").append(Class146.method1738(16776960, -849826454)).append(string).toString(), -2126481065 * Class271.anInt2756, 8, -1, (long) (-1654044763 * (class432_sub1_sub1_sub1_sub2.anInt10008)), 0, 0, true, false, (long) ((class432_sub1_sub1_sub1_sub2.anInt10008) * -1654044763), false, (short) 140);
					}
					if (!bool) {
						String[] strings = class551.aStringArray6311;
						if (client.aBoolean9162)
							strings = Class95_Sub8.method1125(strings, -120931991);
						if (null != strings) {
							for (int i_11_ = strings.length - 1; i_11_ >= 0; i_11_--) {
								if (strings[i_11_] != null && (class551.aByte6344 == 0 || (!(strings[i_11_].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434))) && !(strings[i_11_].equalsIgnoreCase(Class526.aClass526_6068.method6257(Class429.aClass454_4369, 991479434)))))) {
									int i_12_ = 0;
									int i_13_ = client.anInt9148 * 1985599555;
									if (0 == i_11_)
										i_12_ = 9;
									if (i_11_ == 1)
										i_12_ = 10;
									if (i_11_ == 2)
										i_12_ = 11;
									if (i_11_ == 3)
										i_12_ = 12;
									if (i_11_ == 4)
										i_12_ = 13;
									if (5 == i_11_)
										i_12_ = 1003;
									int i_14_ = class551.method6377(i_11_, -90573207);
									if (-1 != i_14_)
										i_13_ = i_14_;
									Class360.method4241(strings[i_11_], new StringBuilder().append(Class146.method1738(16776960, -849826454)).append(string).toString(), ((strings[i_11_].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434))) ? class551.anInt6313 * 2069652603 : i_13_), i_12_, -1, (long) ((class432_sub1_sub1_sub1_sub2.anInt10008) * -1654044763), 0, 0, true, false, (long) ((class432_sub1_sub1_sub1_sub2.anInt10008) * -1654044763), false, (short) 140);
								}
							}
							if (1 == class551.aByte6344) {
								for (int i_15_ = 0; i_15_ < strings.length; i_15_++) {
									if (null != strings[i_15_] && ((strings[i_15_].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434))) || (strings[i_15_].equalsIgnoreCase(Class526.aClass526_6068.method6257(Class429.aClass454_4369, 991479434))))) {
										short i_16_ = 0;
										if ((class432_sub1_sub1_sub1_sub2.anInt10258) * 1541581717 > (Class263_Sub2.myPlayer.anInt10228) * -650833685)
											i_16_ = (short) 2000;
										short i_17_ = 0;
										int i_18_ = 1985599555 * client.anInt9148;
										if (0 == i_15_)
											i_17_ = (short) 9;
										if (i_15_ == 1)
											i_17_ = (short) 10;
										if (2 == i_15_)
											i_17_ = (short) 11;
										if (i_15_ == 3)
											i_17_ = (short) 12;
										if (i_15_ == 4)
											i_17_ = (short) 13;
										if (i_15_ == 5)
											i_17_ = (short) 1003;
										if (0 != i_17_)
											i_17_ += i_16_;
										int i_19_ = class551.method6377(i_15_, -367856958);
										if (-1 != i_19_)
											i_18_ = i_19_;
										Class360.method4241(strings[i_15_], new StringBuilder().append(Class146.method1738(16776960, -849826454)).append(string).toString(), ((strings[i_15_].equalsIgnoreCase(Class526.aClass526_6163.method6257(Class429.aClass454_4369, 991479434))) ? class551.anInt6313 * 2069652603 : i_18_), i_17_, -1, (long) ((class432_sub1_sub1_sub1_sub2.anInt10008) * -1654044763), 0, 0, true, false, (long) ((class432_sub1_sub1_sub1_sub2.anInt10008) * -1654044763), false, (short) 140);
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("rc.be(").append(')').toString());
		}
	}
}
