/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class118 {
	public String aString1388;
	public Class100[] aClass100Array1389;
	public String aString1390;
	public String aString1391;
	public Class100[] aClass100Array1392;
	public static IndexTable aClass280_1393;

	Class118() {
		/* empty */
	}

	void method1427(Class115 class115, int i) {
		try {
			aString1391 = class115.method1414(846343736);
			aString1388 = class115.method1414(-68171735);
			aString1390 = class115.method1414(585111168);
			int i_0_ = class115.method1413(1630714172);
			int i_1_ = class115.method1413(1108362256);
			aClass100Array1392 = 0 == i_0_ ? null : new Class100[i_0_];
			aClass100Array1389 = 0 == i_1_ ? null : new Class100[i_1_];
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				aClass100Array1392[i_2_] = new Class100();
				aClass100Array1392[i_2_].method1207(class115, 2020142979);
			}
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
				aClass100Array1389[i_3_] = new Class100();
				aClass100Array1389[i_3_].method1207(class115, -1884275068);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("et.r(").append(')').toString());
		}
	}

	static final void method1428(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class448.aClass330_Sub50_5555.aClass464_Sub30_7909.method5841(-2110490215);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("et.ami(").append(')').toString());
		}
	}

	static void method1429(int i) {
		try {
			Class392.anInt6792 = (-1314490662 + (988688223 * Class477_Sub1.aClass524_8749.anInt6033 + Class477_Sub1.aClass524_8749.anInt6035 * -194138071));
			Class5.anInt69 = (Class386.aClass524_3989.anInt6035 * 993009101 + Class386.aClass524_3989.anInt6033 * 1577576411 + -1275636670);
			Class5.aStringArray68 = new String[500];
			for (int i_4_ = 0; i_4_ < Class5.aStringArray68.length; i_4_++)
				Class5.aStringArray68[i_4_] = "";
			Class56.panelBoxMessage(Class526.aClass526_6151.method6257(Class429.aClass454_4369, 991479434), -898820198);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("et.i(").append(')').toString());
		}
	}

	static void method1430(int i, int i_5_, IComponentDefinitions iComponentDefinitions, int i_6_) {
		try {
			int i_7_ = i + iComponentDefinitions.anInt1210 * -681123409;
			int i_8_ = 15 + i_5_;
			if (client.aBoolean8983) {
				int i_9_ = -256;
				if (2061800443 * client.anInt6603 < 20)
					i_9_ = -65536;
				Class464_Sub22.aClass263_8709.method2612(new StringBuilder().append("Fps:").append(client.anInt6603 * 2061800443).toString(), i_7_, i_8_, i_9_, -1, (short) 18074);
				i_8_ += 15;
				Runtime runtime = Runtime.getRuntime();
				long l = runtime.totalMemory() / 1024L;
				long l_10_ = l - runtime.freeMemory() / 1024L;
				int i_11_ = -256;
				if (l_10_ > 262144L)
					i_11_ = -65536;
				Class464_Sub22.aClass263_8709.method2612(new StringBuilder().append("Mem:").append(l_10_).append("/").append(l).append("k").toString(), i_7_, i_8_, i_11_, -1, (short) 32013);
				i_8_ += 15;
				long l_12_ = ((Class1) client.aClass1_9025).aClass409_38.method4771(-1398988283);
				String string = "N/A";
				if (l_12_ != -1L) {
					string = new StringBuilder().append(l_12_).append("ms").toString();
					if (l_12_ > 500L)
						string = new StringBuilder().append(Class146.method1738(16711680, -849826454)).append(string).append(Class146.method1738(16776960, -849826454)).toString();
				}
				Class464_Sub22.aClass263_8709.method2612(new StringBuilder().append("Game: In:").append(((Class1) client.aClass1_9025).anInt18 * -1059630817).append("B/s ").append("Out:").append(1891109125 * ((Class1) client.aClass1_9025).anInt28).append("B/s ").append("Ping:").append(string).toString(), i_7_, i_8_, -256, -1, (short) 14136);
				i_8_ += 15;
				long l_13_ = ((Class1) client.aClass1_9060).aClass409_38.method4771(-1398988283);
				String string_14_ = "N/A";
				if (-1L != l_13_) {
					string_14_ = new StringBuilder().append(l_13_).append("ms").toString();
					if (l_13_ > 500L)
						string_14_ = new StringBuilder().append(Class146.method1738(16711680, -849826454)).append(string_14_).append(Class146.method1738(16776960, -849826454)).toString();
				}
				Class464_Sub22.aClass263_8709.method2612(new StringBuilder().append("Lobby: In:").append(((Class1) client.aClass1_9060).anInt18 * -1059630817).append("B/s ").append("Out:").append(1891109125 * ((Class1) client.aClass1_9060).anInt28).append("B/s ").append("Ping:").append(string_14_).toString(), i_7_, i_8_, -256, -1, (short) 19043);
				i_8_ += 15;
				int i_15_ = Class361.aClass_ra3793.za() / 1024;
				Class464_Sub22.aClass263_8709.method2612(new StringBuilder().append("Offheap:").append(i_15_).append("k").toString(), i_7_, i_8_, i_15_ > 65536 ? -65536 : -256, -1, (short) 24532);
				i_8_ += 15;
				int i_16_ = 0;
				int i_17_ = 0;
				int i_18_ = 0;
				for (int i_19_ = 0; i_19_ < Class429.aClass282_Sub1Array4368.length; i_19_++) {
					if (null == Class429.aClass282_Sub1Array4368[i_19_]) {
						if (i_6_ == -1641994381)
							return;
					} else {
						i_16_ += Class429.aClass282_Sub1Array4368[i_19_].method2814(1610520599);
						i_17_ += Class429.aClass282_Sub1Array4368[i_19_].method2817(1004334918);
						i_18_ += Class429.aClass282_Sub1Array4368[i_19_].method2818(-1852062028);
					}
				}
				int i_20_ = 100 * i_18_ / i_16_;
				int i_21_ = i_17_ * 10000 / i_16_;
				String string_22_ = new StringBuilder().append("Cache:").append(Class451.method5631((long) i_21_, 2, true, Class454.aClass454_6832, -820604780)).append("% (").append(i_20_).append("%)").toString();
				Class125.aClass263_1454.method2612(string_22_, i_7_, i_8_, -256, -1, (short) 15903);
				i_8_ += 12;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("et.kg(").append(')').toString());
		}
	}
}
