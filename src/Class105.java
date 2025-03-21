/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public abstract class Class105 {
	int anInt992;
	Class123[] aClass123Array993;
	static Interface5 anInterface5_994 = new Class101();
	Class135 aClass135_995;
	String aString996;
	int anInt997;
	protected int anInt998 = 207157191;
	Class135 aClass135_999;

	public abstract void method1249();

	public abstract void method1250();

	public abstract boolean method1251();

	public String method1252(byte i) {
		try {
			return ((Class105) this).aString996;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.p(").append(')').toString());
		}
	}

	public final void method1253(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249, int i) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1461(class330_sub15_sub1, class249);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.h(").append(')').toString());
		}
	}

	public Class123 method1254(String string, int i) throws Exception_Sub2_Sub1 {
		try {
			Class123[] class123s = ((Class105) this).aClass123Array993;
			for (int i_0_ = 0; i_0_ < class123s.length; i_0_++) {
				Class123 class123 = class123s[i_0_];
				String string_1_ = class123.method1491(1893570361);
				if (null != string_1_ && string_1_.equals(string)) {
					if (!class123.method1454())
						throw new Exception_Sub2_Sub1(string);
					return class123;
				}
			}
			throw new Exception_Sub2_Sub1(string);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.s(").append(')').toString());
		}
	}

	public final int method1255(byte i) {
		try {
			return ((Class105) this).aClass123Array993.length;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.f(").append(')').toString());
		}
	}

	public final Class123 method1256(int i, int i_2_) {
		try {
			return ((Class105) this).aClass123Array993[i];
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.z(").append(')').toString());
		}
	}

	public final void method1257(int i, Class260 class260, byte i_3_) {
		try {
			((Class105) this).aClass123Array993[anInt998 * -861247991].method1463(i, class260.aFloat2716, class260.aFloat2715, class260.aFloat2711);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.ac(").append(')').toString());
		}
	}

	public abstract boolean method1258(Class123 class123);

	public final Class123 method1259(int i) {
		try {
			return (-861247991 * anInt998 >= 0 ? (((Class105) this).aClass123Array993[anInt998 * -861247991]) : null);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.b(").append(')').toString());
		}
	}

	public final int method1260(short i) {
		try {
			return -861247991 * anInt998;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.k(").append(')').toString());
		}
	}

	abstract Class330_Sub15_Sub1 method1261(Class104 class104);

	Class105(Class_ra_Sub2 class_ra_sub2, Class113 class113) {
		((Class105) this).aString996 = ((Class113) class113).aString1166;
		((Class105) this).anInt992 = ((Class113) class113).aClass104Array1165.length * -697391221;
		((Class105) this).aClass135_999 = new Class135(((Class105) this).anInt992 * -1488959453, anInterface5_994);
		for (int i = 0; i < ((Class105) this).anInt992 * -1488959453; i++)
			((Class105) this).aClass135_999.method1582(i, (((Class104) ((Class113) class113).aClass104Array1165[i]).aString988), method1261(((Class113) class113).aClass104Array1165[i]), -660533354);
		((Class105) this).anInt997 = ((Class113) class113).aClass104Array1169.length * -1637509177;
		((Class105) this).aClass135_995 = new Class135(((Class105) this).anInt997 * -1378420233, anInterface5_994);
		for (int i = 0; i < ((Class105) this).anInt997 * -1378420233; i++)
			((Class105) this).aClass135_995.method1582(i, (((Class104) ((Class113) class113).aClass104Array1169[i]).aString988), method1261(((Class113) class113).aClass104Array1169[i]), -754497349);
		((Class105) this).aClass123Array993 = new Class123[((Class113) class113).aClass118Array1170.length];
		for (int i = 0; i < ((Class113) class113).aClass118Array1170.length; i++)
			((Class105) this).aClass123Array993[i] = method1278(class_ra_sub2, ((Class113) class113).aClass118Array1170[i]);
	}

	public final void method1262(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_4_, byte i) {
		try {
			((Class105) this).aClass123Array993[anInt998 * -861247991].method1456(class330_sub15_sub1, f, f_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.x(").append(')').toString());
		}
	}

	public final void method1263(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_5_, float f_6_, int i) {
		try {
			((Class105) this).aClass123Array993[anInt998 * -861247991].method1457(class330_sub15_sub1, f, f_5_, f_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.g(").append(')').toString());
		}
	}

	public final void method1264(Class330_Sub15_Sub1 class330_sub15_sub1, float f, float f_7_, float f_8_, float f_9_, int i) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1475(class330_sub15_sub1, f, f_7_, f_8_, f_9_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.d(").append(')').toString());
		}
	}

	void method1265() {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.aq(").append(')').toString());
		}
	}

	public final void method1266(Class330_Sub15_Sub1 class330_sub15_sub1, Class261 class261, int i) {
		try {
			((Class105) this).aClass123Array993[anInt998 * -861247991].method1475(class330_sub15_sub1, class261.aFloat2717, class261.aFloat2718, class261.aFloat2720, class261.aFloat2719);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.a(").append(')').toString());
		}
	}

	public final void method1267(Class330_Sub15_Sub1 class330_sub15_sub1, float[] fs, int i) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1494(class330_sub15_sub1, fs, fs.length);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.e(").append(')').toString());
		}
	}

	public final void method1268(Class330_Sub15_Sub1 class330_sub15_sub1, int i, short i_10_) {
		try {
			float f = (float) (i >> 16 & 0xff) / 255.0F;
			float f_11_ = (float) (i >> 8 & 0xff) / 255.0F;
			float f_12_ = (float) (i & 0xff) / 255.0F;
			float f_13_ = (float) (i >> 24 & 0xff) / 255.0F;
			method1264(class330_sub15_sub1, f, f_11_, f_12_, f_13_, -236422392);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.m(").append(')').toString());
		}
	}

	public final void method1269(Class330_Sub15_Sub1 class330_sub15_sub1, Class249 class249, int i) {
		try {
			((Class105) this).aClass123Array993[anInt998 * -861247991].method1460(class330_sub15_sub1, class249);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.t(").append(')').toString());
		}
	}

	public final void method1270(Class330_Sub15_Sub1 class330_sub15_sub1, int i, Interface11 interface11, byte i_14_) {
		try {
			((Class105) this).aClass123Array993[anInt998 * -861247991].method1462(class330_sub15_sub1, i, interface11);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.y(").append(')').toString());
		}
	}

	public final void method1271(int i, float f, float f_15_, float f_16_, int i_17_) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1463(i, f, f_15_, f_16_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.v(").append(')').toString());
		}
	}

	public final void method1272(int i, float f, float f_18_, float f_19_, float f_20_, int i_21_) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1464(i, f, f_18_, f_19_, f_20_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.ay(").append(')').toString());
		}
	}

	public abstract void method1273();

	public final void method1274(int i, float[] fs, int i_22_, int i_23_) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1488(i, fs, i_22_);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.al(").append(')').toString());
		}
	}

	public final void method1275(int i, Class249 class249, int i_24_) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1466(i, class249);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.aw(").append(')').toString());
		}
	}

	public final void method1276(int i, Class249 class249, byte i_25_) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1467(i, class249);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.ap(").append(')').toString());
		}
	}

	public final void method1277(int i, int i_26_, Interface11 interface11, int i_27_) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1468(i, i_26_, interface11);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.ai(").append(')').toString());
		}
	}

	abstract Class123 method1278(Class_ra_Sub2 class_ra_sub2, Class118 class118);

	public int method1279(int i) {
		try {
			return -1378420233 * ((Class105) this).anInt997;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.aj(").append(')').toString());
		}
	}

	public Class330_Sub15_Sub1 method1280(int i, int i_28_) {
		try {
			return ((Class330_Sub15_Sub1) ((Class105) this).aClass135_995.method1579(i, 1993020690));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.ax(").append(')').toString());
		}
	}

	public Class330_Sub15_Sub1 method1281(String string, int i) {
		try {
			return ((Class330_Sub15_Sub1) ((Class105) this).aClass135_995.method1580(string, (byte) -23));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.ad(").append(')').toString());
		}
	}

	public int method1282(byte i) {
		try {
			return ((Class105) this).anInt992 * -1488959453;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.an(").append(')').toString());
		}
	}

	public final void method1283(Class330_Sub15_Sub1 class330_sub15_sub1, Class260 class260, byte i) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1457(class330_sub15_sub1, class260.aFloat2716, class260.aFloat2715, class260.aFloat2711);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.c(").append(')').toString());
		}
	}

	public abstract void method1284();

	public abstract void method1285();

	public abstract void method1286();

	public abstract boolean method1287();

	public Class123 method1288(byte i) {
		try {
			Class123[] class123s = ((Class105) this).aClass123Array993;
			for (int i_29_ = 0; i_29_ < class123s.length; i_29_++) {
				Class123 class123 = class123s[i_29_];
				if (class123.method1454())
					return class123;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.n(").append(')').toString());
		}
	}

	abstract Class123 method1289(Class_ra_Sub2 class_ra_sub2, Class118 class118);

	public final void method1290(int i, Class249 class249, int i_30_) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1498(i, class249);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.at(").append(')').toString());
		}
	}

	public abstract boolean method1291(Class123 class123);

	public abstract boolean method1292(Class123 class123);

	public abstract boolean method1293(Class123 class123);

	public abstract void method1294();

	public Class330_Sub15_Sub1 method1295(String string, byte i) throws Exception_Sub2_Sub2 {
		try {
			Class330_Sub15_Sub1 class330_sub15_sub1 = ((Class330_Sub15_Sub1) ((Class105) this).aClass135_999.method1580(string, (byte) -27));
			if (null == class330_sub15_sub1)
				throw new Exception_Sub2_Sub2(string);
			return class330_sub15_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.as(").append(')').toString());
		}
	}

	abstract Class123 method1296(Class_ra_Sub2 class_ra_sub2, Class118 class118);

	public int method1297(Class123 class123, int i) {
		try {
			for (int i_31_ = 0; i_31_ < ((Class105) this).aClass123Array993.length; i_31_++) {
				if (class123 == ((Class105) this).aClass123Array993[i_31_])
					return i_31_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.w(").append(')').toString());
		}
	}

	public Class330_Sub15_Sub1 method1298(int i, int i_32_) {
		try {
			return ((Class330_Sub15_Sub1) ((Class105) this).aClass135_999.method1579(i, 1911106709));
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.af(").append(')').toString());
		}
	}

	abstract Class123 method1299(Class_ra_Sub2 class_ra_sub2, Class118 class118);

	public abstract boolean method1300();

	public final void method1301(Class330_Sub15_Sub1 class330_sub15_sub1, float f, byte i) {
		try {
			((Class105) this).aClass123Array993[-861247991 * anInt998].method1455(class330_sub15_sub1, f);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.u(").append(')').toString());
		}
	}

	abstract Class123 method1302(Class_ra_Sub2 class_ra_sub2, Class118 class118);

	public abstract boolean method1303();

	abstract Class330_Sub15_Sub1 method1304(Class104 class104);

	static void method1305(Class_ra class_ra, int i) {
		try {
			int i_33_ = Class89.anInt736 * 1574464115;
			int i_34_ = 1798024257 * Class85.anInt713;
			int i_35_ = Class550.anInt6288 * 1151799299;
			int i_36_ = Class406.anInt4194 * 691561767 - 3;
			int i_37_ = 20;
			if (null == Class483.aClass263_5775 || null == Class384.aClass524_3969) {
				Class483.aClass263_5775 = (Class263) (Class219.aClass230_2183.method2331(client.anInterface12_9243, Class457.anInt6842 * 839261643, true, true, (byte) 61));
				Class384.aClass524_3969 = Class219.aClass230_2183.method2333((client.anInterface12_9243), (Class457.anInt6842 * 839261643), 898484130);
				if (null != Class483.aClass263_5775 && Class384.aClass524_3969 != null) {
					Class513.method6194((byte) -33);
					int i_38_ = i_33_ + i_35_ / 2;
					if (i_38_ + i_35_ > -1969079741 * Class300.anInt3058)
						i_38_ = -1969079741 * Class300.anInt3058 - i_35_;
					if (i_38_ < 0)
						i_38_ = 0;
					Class330.method3258(i_38_, 1798024257 * Class85.anInt713, -1547661022);
					return;
				}
			}
			Class263 class263;
			if (null == Class483.aClass263_5775 || null == Class384.aClass524_3969)
				class263 = Class166_Sub3_Sub2.aClass263_9483;
			else
				class263 = Class483.aClass263_5775;
			Class524 class524 = Class359.method4239((byte) 25);
			Class212.method2226(class_ra, Class89.anInt736 * 1574464115, 1798024257 * Class85.anInt713, Class550.anInt6288 * 1151799299, 691561767 * Class406.anInt4194, i_37_, class263, class524, Class526.aClass526_6062.method6257(Class429.aClass454_4369, 991479434), 1634538191);
			int i_39_ = (255 - 358018695 * Class452.anInt5560 - -808857287 * Class484.anInt5809);
			if (i_39_ < 0)
				i_39_ = 0;
			int i_40_ = Class464_Sub23.aClass350_8712.method4030(34823472);
			int i_41_ = Class464_Sub23.aClass350_8712.method4031((short) 24395);
			if (!Class484.aBoolean5783) {
				int i_42_ = 0;
				for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -122))) {
					int i_43_ = (class524.anInt6033 * -2093225349 + (i_37_ + i_34_) + 1 + ((-2008486989 * Class484.anInt5786 - 1 - i_42_) * (Class484.anInt5779 * 1764744137)));
					if (i_40_ > 1574464115 * Class89.anInt736 && i_40_ < (Class550.anInt6288 * 1151799299 + Class89.anInt736 * 1574464115) && i_41_ > i_43_ - -2093225349 * class524.anInt6033 - 1 && i_41_ < i_43_ + 143160877 * class524.anInt6035 && (((Class330_Sub36_Sub10) class330_sub36_sub10).aBoolean9692))
						class_ra.B(Class89.anInt736 * 1574464115, i_43_ - -2093225349 * class524.anInt6033, Class550.anInt6288 * 1151799299, Class484.anInt5779 * 1764744137, (i_39_ << 24 | -1839175827 * Class_na.anInt9724), 1);
					i_42_++;
				}
			} else {
				int i_44_ = 0;
				for (Class330_Sub36_Sub13 class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 42)); class330_sub36_sub13 != null; class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192))) {
					int i_45_ = (-2093225349 * class524.anInt6033 + (i_37_ + i_34_) + 1 + i_44_ * (Class484.anInt5779 * 1764744137));
					if (i_40_ > 1574464115 * Class89.anInt736 && i_40_ < (1151799299 * Class550.anInt6288 + Class89.anInt736 * 1574464115) && i_41_ > i_45_ - -2093225349 * class524.anInt6033 - 1 && i_41_ < class524.anInt6035 * 143160877 + i_45_ && ((((Class330_Sub36_Sub13) class330_sub36_sub13).anInt9715) * -213703795 > 1 || ((Class330_Sub36_Sub10) (Class330_Sub36_Sub10) (((Class330_Sub36_Sub13) class330_sub36_sub13).aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735)).aBoolean9692))
						class_ra.B(1574464115 * Class89.anInt736, i_45_ - class524.anInt6033 * -2093225349, Class550.anInt6288 * 1151799299, 1764744137 * Class484.anInt5779, (i_39_ << 24 | Class_na.anInt9724 * -1839175827), 1);
					i_44_++;
				}
				if (Class484.aClass330_Sub36_Sub13_5784 != null) {
					Class212.method2226(class_ra, Class62.anInt561 * -165713069, Class246.anInt6586 * 1131870491, Class116.anInt1374 * 1702380591, Class95_Sub13.anInt7181 * -37503925, i_37_, class263, class524, (((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aString9717), 1799963507);
					i_44_ = 0;
					for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aClass472_9716.method5884((byte) 125)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aClass472_9716.method5886((short) 8192))) {
						int i_46_ = (i_37_ + 1131870491 * Class246.anInt6586 + class524.anInt6033 * -2093225349 + 1 + i_44_ * (1764744137 * Class484.anInt5779));
						if (i_40_ > -165713069 * Class62.anInt561 && i_40_ < (Class62.anInt561 * -165713069 + Class116.anInt1374 * 1702380591) && (i_41_ > i_46_ - -2093225349 * class524.anInt6033 - 1) && i_41_ < class524.anInt6035 * 143160877 + i_46_ && (((Class330_Sub36_Sub10) class330_sub36_sub10).aBoolean9692))
							class_ra.B(-165713069 * Class62.anInt561, (i_46_ - -2093225349 * class524.anInt6033), Class116.anInt1374 * 1702380591, Class484.anInt5779 * 1764744137, (i_39_ << 24 | Class_na.anInt9724 * -1839175827), 1);
						i_44_++;
					}
					Class528.method6271(class_ra, -165713069 * Class62.anInt561, 1131870491 * Class246.anInt6586, Class116.anInt1374 * 1702380591, Class95_Sub13.anInt7181 * -37503925, i_37_, 1647852795);
				}
			}
			Class528.method6271(class_ra, Class89.anInt736 * 1574464115, 1798024257 * Class85.anInt713, 1151799299 * Class550.anInt6288, 691561767 * Class406.anInt4194, i_37_, 2068124805);
			if (!Class484.aBoolean5783) {
				int i_47_ = 0;
				for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5869(539664854)); class330_sub36_sub10 != null; class330_sub36_sub10 = ((Class330_Sub36_Sub10) Class484.aClass471_5791.method5873((byte) -40))) {
					int i_48_ = ((Class484.anInt5779 * 1764744137 * (Class484.anInt5786 * -2008486989 - 1 - i_47_)) + (1 + (i_34_ + i_37_ + -2093225349 * class524.anInt6033)));
					Class330_Sub36_Sub5.method3462(i_40_, i_41_, i_33_, i_34_, i_35_, i_36_, i_48_, class330_sub36_sub10, class263, class524, Class451.anInt6643 * -1150764535 | ~0xffffff, Class171.anInt1727 * 1705078355 | ~0xffffff, -1743813553);
					i_47_++;
				}
			} else {
				int i_49_ = 0;
				for (Class330_Sub36_Sub13 class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5884((byte) 79)); class330_sub36_sub13 != null; class330_sub36_sub13 = ((Class330_Sub36_Sub13) Class484.aClass472_5793.method5886((short) 8192))) {
					int i_50_ = (i_37_ + Class85.anInt713 * 1798024257 + class524.anInt6033 * -2093225349 + 1 + i_49_ * (Class484.anInt5779 * 1764744137));
					if (-213703795 * ((Class330_Sub36_Sub13) class330_sub36_sub13).anInt9715 == 1)
						Class330_Sub36_Sub5.method3462(i_40_, i_41_, Class89.anInt736 * 1574464115, Class85.anInt713 * 1798024257, 1151799299 * Class550.anInt6288, 691561767 * Class406.anInt4194, i_50_, ((Class330_Sub36_Sub10) (((Class330_Sub36_Sub13) class330_sub36_sub13).aClass472_9716.aClass330_Sub36_5613.aClass330_Sub36_7735)), class263, class524, -1150764535 * Class451.anInt6643 | ~0xffffff, Class171.anInt1727 * 1705078355 | ~0xffffff, -1723018933);
					else
						Class392.method4613(i_40_, i_41_, Class89.anInt736 * 1574464115, Class85.anInt713 * 1798024257, 1151799299 * Class550.anInt6288, 691561767 * Class406.anInt4194, i_50_, class330_sub36_sub13, class263, class524, -1150764535 * Class451.anInt6643 | ~0xffffff, 1705078355 * Class171.anInt1727 | ~0xffffff, 2123201560);
					i_49_++;
				}
				if (Class484.aClass330_Sub36_Sub13_5784 != null) {
					i_49_ = 0;
					for (Class330_Sub36_Sub10 class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aClass472_9716.method5884((byte) 127)); null != class330_sub36_sub10; class330_sub36_sub10 = ((Class330_Sub36_Sub10) ((Class330_Sub36_Sub13) Class484.aClass330_Sub36_Sub13_5784).aClass472_9716.method5886((short) 8192))) {
						int i_51_ = (1 + (1131870491 * Class246.anInt6586 + i_37_ + -2093225349 * class524.anInt6033) + i_49_ * (Class484.anInt5779 * 1764744137));
						Class330_Sub36_Sub5.method3462(i_40_, i_41_, -165713069 * Class62.anInt561, Class246.anInt6586 * 1131870491, 1702380591 * Class116.anInt1374, Class95_Sub13.anInt7181 * -37503925, i_51_, class330_sub36_sub10, class263, class524, -1150764535 * Class451.anInt6643 | ~0xffffff, Class171.anInt1727 * 1705078355 | ~0xffffff, -2035093866);
						i_49_++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.bg(").append(')').toString());
		}
	}

	static void method1306(Class432_Sub1_Sub1_Sub1 class432_sub1_sub1_sub1, int i) {
		try {
			if (class432_sub1_sub1_sub1 instanceof NPC) {
				NPC class432_sub1_sub1_sub1_sub2 = (NPC) class432_sub1_sub1_sub1;
				if (null != class432_sub1_sub1_sub1_sub2.aClass551_10251)
					Class411.method5233(class432_sub1_sub1_sub1_sub2, (class432_sub1_sub1_sub1_sub2.aByte8658 != (Class263_Sub2.myPlayer.aByte8658)), 217522972);
			} else if (class432_sub1_sub1_sub1 instanceof Player) {
				Player class432_sub1_sub1_sub1_sub1 = (Player) class432_sub1_sub1_sub1;
				Class497.method6103(class432_sub1_sub1_sub1_sub1, ((Class263_Sub2.myPlayer.aByte8658) != (class432_sub1_sub1_sub1_sub1.aByte8658)), -7972581);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.c(").append(')').toString());
		}
	}

	static final void method1307(Class430 class430, short i) {
		try {
			String string = (String) (((Class430) class430).anObjectArray4386[(((Class430) class430).anInt4378 -= 2087905371) * -1378875437]);
			Class330_Sub34 class330_sub34 = Class238.method2377(OutgoingPacket.aClass234_2515, client.aClass1_9025.aClass488_22, 1746076126);
			class330_sub34.aClass330_Sub46_Sub2_7729.addByte(string.length() + 1, (byte) 83);
			class330_sub34.aClass330_Sub46_Sub2_7729.addString(string, (byte) -14);
			client.aClass1_9025.method378(class330_sub34, -1666030416);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.tg(").append(')').toString());
		}
	}

	public static void method1308(String[] strings, int[] is, int i) {
		try {
			Class208.method2206(strings, is, 0, strings.length - 1, -666175109);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.i(").append(')').toString());
		}
	}

	public static Frame method1309(Class504 class504, int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		try {
			if (i_53_ == 0) {
				Class501[] class501s = Class3.method396(class504, 16711935);
				if (class501s == null)
					return null;
				boolean bool = false;
				for (int i_56_ = 0; i_56_ < class501s.length; i_56_++) {
					if (i == class501s[i_56_].anInt5897 * -1152098921 && 1804419289 * class501s[i_56_].anInt5896 == i_52_ && (i_54_ == 0 || (i_54_ == -2037038205 * (((Class501) class501s[i_56_]).anInt5898))) && (!bool || (class501s[i_56_].anInt5895 * 1069390355 > i_53_))) {
						i_53_ = 1069390355 * class501s[i_56_].anInt5895;
						bool = true;
					}
				}
				if (!bool)
					return null;
			}
			Frame frame = new Frame("Jagex Full Screen");
			frame.setResizable(false);
			class504.method6137(frame, i, i_52_, i_53_, i_54_, 624416167);
			return frame;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.j(").append(')').toString());
		}
	}

	static int method1310(byte[][] is, byte[][] is_57_, int[] is_58_, byte[] is_59_, int[] is_60_, int i, int i_61_, byte i_62_) {
		try {
			int i_63_ = is_58_[i];
			int i_64_ = is_60_[i] + i_63_;
			int i_65_ = is_58_[i_61_];
			int i_66_ = i_65_ + is_60_[i_61_];
			int i_67_ = i_63_;
			if (i_65_ > i_63_)
				i_67_ = i_65_;
			int i_68_ = i_64_;
			if (i_66_ < i_64_)
				i_68_ = i_66_;
			int i_69_ = is_59_[i] & 0xff;
			if ((is_59_[i_61_] & 0xff) < i_69_)
				i_69_ = is_59_[i_61_] & 0xff;
			byte[] is_70_ = is_57_[i];
			byte[] is_71_ = is[i_61_];
			int i_72_ = i_67_ - i_63_;
			int i_73_ = i_67_ - i_65_;
			for (int i_74_ = i_67_; i_74_ < i_68_; i_74_++) {
				int i_75_ = is_70_[i_72_++] + is_71_[i_73_++];
				if (i_75_ < i_69_)
					i_69_ = i_75_;
			}
			return -i_69_;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.i(").append(')').toString());
		}
	}

	static final void method1311(Class430 class430, int i) {
		try {
			((Class430) class430).anInt4376 -= 124953757;
			int i_76_ = (((Class430) class430).anIntArray4387[1632830751 * ((Class430) class430).anInt4376]);
			int i_77_ = (((Class430) class430).anIntArray4387[1 + ((Class430) class430).anInt4376 * 1632830751]);
			int i_78_ = (((Class430) class430).anIntArray4387[2 + 1632830751 * ((Class430) class430).anInt4376]);
			Class498.method6110(7, i_76_ << 16 | i_77_, i_78_, "", (byte) -124);
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.anr(").append(')').toString());
		}
	}

	static final void method1312(Class430 class430, int i) {
		try {
			((Class430) class430).anIntArray4387[((((Class430) class430).anInt4376 += -1390004513) * 1632830751 - 1)] = Class413.anInt4260 * 1323587043;
		} catch (RuntimeException runtimeexception) {
			throw Class476.method5964(runtimeexception, new StringBuilder().append("eg.aob(").append(')').toString());
		}
	}
}
